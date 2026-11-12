package md0;

import b63.o;
import d53.w;
import e23.l;
import java.util.Set;
import l72.j0;
import li0.b0;
import li0.d0;
import m4.g0;
import o72.a1;
import p005kotlin.Unit;
import p13.c1;
import p13.h0;
import p3.p1;
import s5.q0;
import x5.l0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f117914b;

    public /* synthetic */ f(p1 p1Var, int i14) {
        this.f117913a = i14;
        this.f117914b = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f117913a;
        p1 p1Var = this.f117914b;
        switch (i14) {
            case 0:
                String str = (String) obj;
                str.getClass();
                p1Var.setValue(d0.b((d0) p1Var.getF182175a(), null, b0.valueOf(str), null, null, null, null, null, 509));
                return Unit.INSTANCE;
            case 1:
                q0 q0Var = (q0) obj;
                q0Var.getClass();
                if (((q0) p1Var.getF182175a()) == null) {
                    p1Var.setValue(q0Var);
                }
                return Unit.INSTANCE;
            case 2:
                obj.getClass();
                return fb1.c.n(".", w.M(((n02.f) p1Var.getF182175a()).f122173d, obj.toString()));
            case 3:
                int i15 = com.garmin.android.apps.connectmobile.userprofile.editimage.c.f46657x;
                ((jf.d.c.C1894d) obj).getClass();
                p1Var.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                StringBuilder sb3 = new StringBuilder();
                int length = str2.length();
                for (int i16 = 0; i16 < length; i16++) {
                    char cCharAt = str2.charAt(i16);
                    if ('!' <= cCharAt && cCharAt < 128) {
                        sb3.append(cCharAt);
                    }
                }
                p1Var.setValue(sb3.toString());
                return Unit.INSTANCE;
            case 5:
                ((Boolean) obj).getClass();
                p1Var.setValue(Boolean.valueOf(!((Boolean) p1Var.getF182175a()).booleanValue()));
                return Unit.INSTANCE;
            case 6:
                Long l14 = (Long) obj;
                l14.longValue();
                p1Var.setValue(l14);
                return Unit.INSTANCE;
            case 7:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                p1Var.setValue(bool);
                return Unit.INSTANCE;
            case 8:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                p1Var.setValue(bool2);
                return Unit.INSTANCE;
            case 9:
                p1Var.setValue(((Boolean) obj).booleanValue() ? "Subhead" : null);
                return Unit.INSTANCE;
            case 10:
                Boolean bool3 = (Boolean) obj;
                bool3.getClass();
                p1Var.setValue(bool3);
                return Unit.INSTANCE;
            case 11:
                c82.i iVar = (c82.i) obj;
                iVar.getClass();
                Set set = (Set) p1Var.getF182175a();
                o oVar = iVar.f25737a;
                p1Var.setValue(set.contains(oVar) ? c1.f((Set) p1Var.getF182175a(), oVar) : c1.i((Set) p1Var.getF182175a(), oVar));
                return Unit.INSTANCE;
            case 12:
                j0 j0Var = (j0) obj;
                j0Var.getClass();
                p1Var.setValue(h0.y0((Iterable) p1Var.getF182175a(), j0Var));
                return Unit.INSTANCE;
            case 13:
                int iIntValue = ((Integer) obj).intValue();
                a1 a1Var = a1.f130295a;
                p1Var.setValue(Boolean.valueOf(iIntValue == 0));
                return Unit.INSTANCE;
            case 14:
                String str3 = (String) obj;
                str3.getClass();
                p1Var.setValue(str3);
                return Unit.INSTANCE;
            case 15:
                g0 g0Var = (g0) obj;
                g0Var.getClass();
                p1Var.setValue(Boolean.valueOf(g0Var.a()));
                return Unit.INSTANCE;
            case 16:
                String str4 = (String) obj;
                str4.getClass();
                p1Var.setValue(str4);
                return Unit.INSTANCE;
            case 17:
                String str5 = (String) obj;
                str5.getClass();
                p1Var.setValue(str5);
                return Unit.INSTANCE;
            case 18:
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                p1Var.setValue(bool4);
                return Unit.INSTANCE;
            case 19:
                Boolean bool5 = (Boolean) obj;
                bool5.getClass();
                p1Var.setValue(bool5);
                return Unit.INSTANCE;
            case 20:
                Boolean bool6 = (Boolean) obj;
                bool6.getClass();
                p1Var.setValue(bool6);
                return Unit.INSTANCE;
            case 21:
                Boolean bool7 = (Boolean) obj;
                bool7.getClass();
                p1Var.setValue(bool7);
                return Unit.INSTANCE;
            case 22:
                Boolean bool8 = (Boolean) obj;
                bool8.getClass();
                p1Var.setValue(bool8);
                return Unit.INSTANCE;
            case 23:
                String str6 = (String) obj;
                str6.getClass();
                p1Var.setValue(str6);
                return Unit.INSTANCE;
            case 24:
                String str7 = (String) obj;
                str7.getClass();
                p1Var.setValue(str7);
                return Unit.INSTANCE;
            case 25:
                l0 l0Var = (l0) obj;
                l0Var.getClass();
                p1Var.setValue(l0Var);
                l0Var.toString();
                return Unit.INSTANCE;
            case 26:
                String str8 = (String) obj;
                str8.getClass();
                p1Var.setValue(str8);
                return Unit.INSTANCE;
            case 27:
                String str9 = (String) obj;
                str9.getClass();
                p1Var.setValue(str9);
                return Unit.INSTANCE;
            case 28:
                l0 l0Var2 = (l0) obj;
                l0Var2.getClass();
                p1Var.setValue(l0Var2);
                l0Var2.toString();
                return Unit.INSTANCE;
            default:
                String str10 = (String) obj;
                str10.getClass();
                p1Var.setValue(str10);
                return Unit.INSTANCE;
        }
    }
}
