package cn.jpush.a.a;

import com.google.protobuf.jpush.b;
import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.l;
import com.google.protobuf.jpush.m;

public final class ax extends i<aw, ax> {
    private int a;
    private long b;
    private long c;

    private ax() {
    }

    private ax c(d dVar, g gVar) {
        while (true) {
            int a = dVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a |= 1;
                    this.b = dVar.b();
                    continue;
                case 16:
                    this.a |= 2;
                    this.c = dVar.b();
                    continue;
                default:
                    if (!dVar.b(a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    private ax f() {
        return new ax().a(b());
    }

    public final aw a() {
        aw b = b();
        if (b.g()) {
            return b;
        }
        throw new m();
    }

    public final ax a(long j) {
        this.a |= 1;
        this.b = j;
        return this;
    }

    public final ax a(aw awVar) {
        if (awVar != aw.a()) {
            if (awVar.b()) {
                a(awVar.d());
            }
            if (awVar.e()) {
                long f = awVar.f();
                this.a |= 2;
                this.c = f;
            }
        }
        return this;
    }

    public final /* synthetic */ b a(d dVar, g gVar) {
        return c(dVar, gVar);
    }

    public final aw b() {
        int i = 1;
        aw awVar = new aw();
        int i2 = this.a;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        awVar.c = this.b;
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        awVar.d = this.c;
        awVar.b = i;
        return awVar;
    }

    public final /* synthetic */ l b(d dVar, g gVar) {
        return c(dVar, gVar);
    }

    public final /* synthetic */ i c() {
        return f();
    }

    public final /* synthetic */ Object clone() {
        return f();
    }

    public final /* synthetic */ b d() {
        return f();
    }
}
