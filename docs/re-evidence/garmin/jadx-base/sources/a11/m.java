package a11;

import com.garmin.android.apps.connectmobile.workouts.presentation.details.doworkout.StartWorkoutCapableDeviceSelectionActivity;
import ds.k0;
import et1.n0;
import et1.w0;
import i3.pc;
import java.text.NumberFormat;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f348b;

    public /* synthetic */ m(p1 p1Var, int i14) {
        this.f347a = i14;
        this.f348b = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f347a;
        p1 p1Var = this.f348b;
        switch (i14) {
            case 0:
                p1Var.setValue((r) r.f370f.get(((Integer) obj).intValue()));
                return Unit.INSTANCE;
            case 1:
                p1Var.setValue(Boolean.valueOf(((Integer) obj).intValue() == 1));
                return Unit.INSTANCE;
            case 2:
                String str = (String) obj;
                str.getClass();
                p1Var.setValue(str);
                return Unit.INSTANCE;
            case 3:
                f5.c0 c0Var = (f5.c0) obj;
                c0Var.getClass();
                p1Var.setValue(c0Var);
                return Unit.INSTANCE;
            case 4:
                q4.c cVar = (q4.c) obj;
                cVar.getClass();
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    cVar.m1();
                }
                return Unit.INSTANCE;
            case 5:
                ((p3.i0) obj).getClass();
                return new bg2.g.b(p1Var);
            case 6:
                c50.i iVar = (c50.i) obj;
                iVar.getClass();
                p1Var.setValue(iVar);
                return Unit.INSTANCE;
            case 7:
                m4.g0 g0Var = (m4.g0) obj;
                g0Var.getClass();
                p1Var.setValue(Boolean.valueOf(g0Var.a()));
                return Unit.INSTANCE;
            case 8:
                ge2.b bVar = (ge2.b) obj;
                bVar.getClass();
                p1Var.setValue(bVar);
                return Unit.INSTANCE;
            case 9:
                ge2.b bVar2 = (ge2.b) obj;
                bVar2.getClass();
                p1Var.setValue(bVar2);
                return Unit.INSTANCE;
            case 10:
                p1Var.setValue((Double) obj);
                return Unit.INSTANCE;
            case 11:
                p1Var.setValue((Double) obj);
                return Unit.INSTANCE;
            case 12:
                p1Var.setValue(Boolean.valueOf(!((Boolean) obj).booleanValue()));
                return Unit.INSTANCE;
            case 13:
                zd0.k.a aVar = (zd0.k.a) obj;
                StartWorkoutCapableDeviceSelectionActivity.a aVar2 = StartWorkoutCapableDeviceSelectionActivity.f48554a;
                aVar.getClass();
                zd0.k.a aVar3 = (zd0.k.a) p1Var.getF182175a();
                p1Var.setValue((aVar3 == null || aVar3.f204042a != aVar.f204042a) ? aVar : null);
                return Unit.INSTANCE;
            case 14:
                ((jf.d.c.C1894d) obj).getClass();
                p1Var.setValue(null);
                return Unit.INSTANCE;
            case 15:
                ((Boolean) obj).getClass();
                p1Var.setValue(Boolean.valueOf(!((Boolean) p1Var.getF182175a()).booleanValue()));
                return Unit.INSTANCE;
            case 16:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                p1Var.setValue(bool);
                return Unit.INSTANCE;
            case 17:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                p1Var.setValue(k0Var);
                return Unit.INSTANCE;
            case 18:
                Double d14 = (Double) obj;
                d52.e eVar = (d52.e) p1Var.getF182175a();
                if (d14 != null) {
                    eVar.getClass();
                    String str2 = NumberFormat.getIntegerInstance().format((long) d14.doubleValue());
                    if (str2 != null) {
                        return str2;
                    }
                }
                return eVar.f();
            case 19:
                f5.c0 c0Var2 = (f5.c0) obj;
                c0Var2.getClass();
                p1Var.setValue(g8.i.g(f5.d0.d(c0Var2), g6.n.c(c0Var2.a())));
                return Unit.INSTANCE;
            case 20:
                f5.c0 c0Var3 = (f5.c0) obj;
                c0Var3.getClass();
                p1Var.setValue(g8.i.g(f5.d0.d(c0Var3), g6.n.c(c0Var3.a())));
                return Unit.INSTANCE;
            case 21:
                f5.c0 c0Var4 = (f5.c0) obj;
                c0Var4.getClass();
                p1Var.setValue(g8.i.g(f5.d0.d(c0Var4), g6.n.c(c0Var4.a())));
                return Unit.INSTANCE;
            case 22:
                f5.c0 c0Var5 = (f5.c0) obj;
                c0Var5.getClass();
                p1Var.setValue(g8.i.g(f5.d0.d(c0Var5), g6.n.c(c0Var5.a())));
                return Unit.INSTANCE;
            case 23:
                f5.c0 c0Var6 = (f5.c0) obj;
                c0Var6.getClass();
                p1Var.setValue(g8.i.g(f5.d0.d(c0Var6), g6.n.c(c0Var6.a())));
                return Unit.INSTANCE;
            case 24:
                f5.c0 c0Var7 = (f5.c0) obj;
                c0Var7.getClass();
                p1Var.setValue(g8.i.g(f5.d0.d(c0Var7), g6.n.c(c0Var7.a())));
                return Unit.INSTANCE;
            case 25:
                pc pcVar = (pc) obj;
                pcVar.getClass();
                return Boolean.valueOf(((Boolean) p1Var.getF182175a()).booleanValue() || pcVar != pc.Hidden);
            case 26:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                p1Var.setValue(bool2);
                return Unit.INSTANCE;
            case 27:
                Float f14 = (Float) obj;
                f14.floatValue();
                p1Var.setValue(f14);
                return Unit.INSTANCE;
            case 28:
                pc pcVar2 = (pc) obj;
                pcVar2.getClass();
                return Boolean.valueOf(n0.a.f65720a[pcVar2.ordinal()] == 1 ? p005kotlin.jvm.internal.s.g((pt1.n) p1Var.getF182175a(), pt1.n.b.f140894a) : true);
            default:
                pc pcVar3 = (pc) obj;
                pcVar3.getClass();
                return Boolean.valueOf(w0.a.f65930a[pcVar3.ordinal()] == 1 ? p005kotlin.jvm.internal.s.g((pt1.n) p1Var.getF182175a(), pt1.n.b.f140894a) : true);
        }
    }
}
