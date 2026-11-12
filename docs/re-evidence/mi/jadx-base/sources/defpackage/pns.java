package defpackage;

import android.content.Context;
import com.xiaomi.mipush.sdk.d;
import com.xiaomi.push.ig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class pns implements m10 {
    public static volatile pns e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f30572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public uei f30573b;
    public boolean c = false;
    public Map<d, m10> d = new HashMap();

    public pns(Context context) {
        this.f30572a = context.getApplicationContext();
    }

    public static pns e(Context context) {
        if (e == null) {
            synchronized (pns.class) {
                try {
                    if (e == null) {
                        e = new pns(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    @Override // defpackage.m10
    public void a() {
        x9s.o("ASSEMBLE_PUSH : assemble push register");
        if (this.d.size() <= 0) {
            f();
        }
        if (this.d.size() > 0) {
            for (m10 m10Var : this.d.values()) {
                if (m10Var != null) {
                    m10Var.a();
                }
            }
            gxs.f(this.f30572a);
        }
    }

    @Override // defpackage.m10
    public void b() {
        x9s.o("ASSEMBLE_PUSH : assemble push unregister");
        for (m10 m10Var : this.d.values()) {
            if (m10Var != null) {
                m10Var.b();
            }
        }
        this.d.clear();
    }

    public m10 c(d dVar) {
        return this.d.get(dVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0082  */
    /* JADX WARN: Code duplicated, block: B:35:0x0114  */
    /* JADX WARN: Code duplicated, block: B:50:0x019b  */
    public final void f() {
        d dVar;
        m10 m10VarC;
        d dVar2;
        m10 m10VarC2;
        d dVar3;
        m10 m10VarC3;
        m10 m10VarC4;
        uei ueiVar = this.f30573b;
        if (ueiVar != null) {
            if (ueiVar.d()) {
                StringBuilder sb = new StringBuilder();
                sb.append("ASSEMBLE_PUSH : ");
                sb.append(" HW user switch : " + this.f30573b.d() + " HW online switch : " + gxs.g(this.f30572a, d.ASSEMBLE_PUSH_HUAWEI) + " HW isSupport : " + b7t.c(this.f30572a));
                x9s.o(sb.toString());
            }
            if (this.f30573b.d()) {
                Context context = this.f30572a;
                d dVar4 = d.ASSEMBLE_PUSH_HUAWEI;
                if (gxs.g(context, dVar4) && b7t.c(this.f30572a)) {
                    if (!j(dVar4)) {
                        i(dVar4, j5s.a(this.f30572a, dVar4));
                    }
                    x9s.B("hw manager add to list");
                } else {
                    dVar = d.ASSEMBLE_PUSH_HUAWEI;
                    if (j(dVar) && (m10VarC = c(dVar)) != null) {
                        h(dVar);
                        m10VarC.b();
                    }
                }
            } else {
                dVar = d.ASSEMBLE_PUSH_HUAWEI;
                if (j(dVar)) {
                    h(dVar);
                    m10VarC.b();
                }
            }
            if (this.f30573b.b()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ASSEMBLE_PUSH : ");
                sb2.append(" FCM user switch : " + this.f30573b.b() + " FCM online switch : " + gxs.g(this.f30572a, d.ASSEMBLE_PUSH_FCM) + " FCM isSupport : " + b7t.d(this.f30572a));
                x9s.o(sb2.toString());
            }
            if (this.f30573b.b()) {
                Context context2 = this.f30572a;
                d dVar5 = d.ASSEMBLE_PUSH_FCM;
                if (gxs.g(context2, dVar5) && b7t.d(this.f30572a)) {
                    if (!j(dVar5)) {
                        i(dVar5, j5s.a(this.f30572a, dVar5));
                    }
                    x9s.B("fcm manager add to list");
                } else {
                    dVar2 = d.ASSEMBLE_PUSH_FCM;
                    if (j(dVar2) && (m10VarC2 = c(dVar2)) != null) {
                        h(dVar2);
                        m10VarC2.b();
                    }
                }
            } else {
                dVar2 = d.ASSEMBLE_PUSH_FCM;
                if (j(dVar2)) {
                    h(dVar2);
                    m10VarC2.b();
                }
            }
            if (this.f30573b.a()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("ASSEMBLE_PUSH : ");
                sb3.append(" COS user switch : " + this.f30573b.a() + " COS online switch : " + gxs.g(this.f30572a, d.ASSEMBLE_PUSH_COS) + " COS isSupport : " + b7t.e(this.f30572a));
                x9s.o(sb3.toString());
            }
            if (this.f30573b.a()) {
                Context context3 = this.f30572a;
                d dVar6 = d.ASSEMBLE_PUSH_COS;
                if (gxs.g(context3, dVar6) && b7t.e(this.f30572a)) {
                    i(dVar6, j5s.a(this.f30572a, dVar6));
                } else {
                    dVar3 = d.ASSEMBLE_PUSH_COS;
                    if (j(dVar3) && (m10VarC3 = c(dVar3)) != null) {
                        h(dVar3);
                        m10VarC3.b();
                    }
                }
            } else {
                dVar3 = d.ASSEMBLE_PUSH_COS;
                if (j(dVar3)) {
                    h(dVar3);
                    m10VarC3.b();
                }
            }
            if (this.f30573b.c()) {
                Context context4 = this.f30572a;
                d dVar7 = d.ASSEMBLE_PUSH_FTOS;
                if (gxs.g(context4, dVar7) && b7t.f(this.f30572a)) {
                    i(dVar7, j5s.a(this.f30572a, dVar7));
                    return;
                }
            }
            d dVar8 = d.ASSEMBLE_PUSH_FTOS;
            if (!j(dVar8) || (m10VarC4 = c(dVar8)) == null) {
                return;
            }
            h(dVar8);
            m10VarC4.b();
        }
    }

    public void g(uei ueiVar) {
        this.f30573b = ueiVar;
        this.c = vas.d(this.f30572a).m(ig.AggregatePushSwitch.a(), true);
        if (this.f30573b.d() || this.f30573b.b() || this.f30573b.a() || this.f30573b.c()) {
            vas.d(this.f30572a).j(new ass(this, 101, "assemblePush"));
        }
    }

    public void h(d dVar) {
        this.d.remove(dVar);
    }

    public void i(d dVar, m10 m10Var) {
        if (m10Var != null) {
            if (this.d.containsKey(dVar)) {
                this.d.remove(dVar);
            }
            this.d.put(dVar, m10Var);
        }
    }

    public boolean j(d dVar) {
        return this.d.containsKey(dVar);
    }

    public boolean m(d dVar) {
        int i = uus.f36171a[dVar.ordinal()];
        boolean zA = false;
        if (i == 1) {
            uei ueiVar = this.f30573b;
            if (ueiVar != null) {
                return ueiVar.d();
            }
            return false;
        }
        if (i == 2) {
            uei ueiVar2 = this.f30573b;
            if (ueiVar2 != null) {
                return ueiVar2.b();
            }
            return false;
        }
        if (i == 3) {
            uei ueiVar3 = this.f30573b;
            if (ueiVar3 != null) {
                zA = ueiVar3.a();
            }
        } else if (i != 4) {
            return false;
        }
        uei ueiVar4 = this.f30573b;
        return ueiVar4 != null ? ueiVar4.c() : zA;
    }
}
