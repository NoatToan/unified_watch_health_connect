package o72;

import java.util.Calendar;
import java.util.Map;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class v1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f130645b;

    public /* synthetic */ v1(p3.p1 p1Var, int i14) {
        this.f130644a = i14;
        this.f130645b = p1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f130644a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                this.f130645b.setValue(str);
                return Unit.INSTANCE;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                this.f130645b.setValue(str2);
                return Unit.INSTANCE;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                this.f130645b.setValue(str3);
                return Unit.INSTANCE;
            case 3:
                String str4 = (String) obj;
                str4.getClass();
                this.f130645b.setValue(str4);
                return Unit.INSTANCE;
            case 4:
                String str5 = (String) obj;
                str5.getClass();
                this.f130645b.setValue(str5);
                return Unit.INSTANCE;
            case 5:
                String str6 = (String) obj;
                str6.getClass();
                this.f130645b.setValue(str6);
                return Unit.INSTANCE;
            case 6:
                String str7 = (String) obj;
                str7.getClass();
                this.f130645b.setValue(str7);
                return Unit.INSTANCE;
            case 7:
                String str8 = (String) obj;
                str8.getClass();
                this.f130645b.setValue(str8);
                return Unit.INSTANCE;
            case 8:
                b82.t0.a aVar = (b82.t0.a) obj;
                aVar.getClass();
                int i14 = x1.a.f130684a[aVar.ordinal()];
                boolean z14 = true;
                if (i14 == 1) {
                    z14 = false;
                } else if (i14 != 2) {
                    lc.u0.r();
                    return null;
                }
                this.f130645b.setValue(Boolean.valueOf(z14));
                return Unit.INSTANCE;
            case 9:
                String str9 = (String) obj;
                str9.getClass();
                this.f130645b.setValue(str9);
                return Unit.INSTANCE;
            case 10:
                String str10 = (String) obj;
                str10.getClass();
                this.f130645b.setValue(str10);
                return Unit.INSTANCE;
            case 11:
                String str11 = (String) obj;
                str11.getClass();
                this.f130645b.setValue(str11);
                return Unit.INSTANCE;
            case 12:
                String str12 = (String) obj;
                str12.getClass();
                this.f130645b.setValue(str12);
                return Unit.INSTANCE;
            case 13:
                String str13 = (String) obj;
                str13.getClass();
                this.f130645b.setValue(str13);
                return Unit.INSTANCE;
            case 14:
                String str14 = (String) obj;
                str14.getClass();
                this.f130645b.setValue(str14);
                return Unit.INSTANCE;
            case 15:
                String str15 = (String) obj;
                str15.getClass();
                this.f130645b.setValue(str15);
                return Unit.INSTANCE;
            case 16:
                String str16 = (String) obj;
                str16.getClass();
                this.f130645b.setValue(str16);
                return Unit.INSTANCE;
            case 17:
                String str17 = (String) obj;
                str17.getClass();
                this.f130645b.setValue(str17);
                return Unit.INSTANCE;
            case 18:
                b82.t0.a aVar2 = (b82.t0.a) obj;
                aVar2.getClass();
                int i15 = l2.a.f130468a[aVar2.ordinal()];
                p3.p1 p1Var = this.f130645b;
                if (i15 == 1) {
                    p1Var.setValue(Boolean.FALSE);
                } else {
                    if (i15 != 2) {
                        lc.u0.r();
                        return null;
                    }
                    p1Var.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 19:
                String str18 = (String) obj;
                str18.getClass();
                this.f130645b.setValue(str18);
                return Unit.INSTANCE;
            case 20:
                String str19 = (String) obj;
                str19.getClass();
                this.f130645b.setValue(str19);
                return Unit.INSTANCE;
            case 21:
                String str20 = (String) obj;
                str20.getClass();
                this.f130645b.setValue(str20);
                return Unit.INSTANCE;
            case 22:
                String str21 = (String) obj;
                str21.getClass();
                this.f130645b.setValue(str21);
                return Unit.INSTANCE;
            case 23:
                String str22 = (String) obj;
                str22.getClass();
                this.f130645b.setValue(str22);
                return Unit.INSTANCE;
            case 24:
                Map map = (Map) obj;
                map.getClass();
                Object obj2 = map.get("android.permission.ACCESS_FINE_LOCATION");
                Boolean bool = Boolean.TRUE;
                this.f130645b.setValue(Boolean.valueOf(p005kotlin.jvm.internal.s.g(obj2, bool) || p005kotlin.jvm.internal.s.g(map.get("android.permission.ACCESS_COARSE_LOCATION"), bool)));
                return Unit.INSTANCE;
            case 25:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                this.f130645b.setValue(bool2);
                return Unit.INSTANCE;
            case 26:
                Calendar calendar = (Calendar) obj;
                calendar.getClass();
                this.f130645b.setValue(calendar);
                return Unit.INSTANCE;
            case 27:
                String str23 = (String) obj;
                str23.getClass();
                this.f130645b.setValue(str23);
                return Unit.INSTANCE;
            case 28:
                j23.f fVar = (j23.f) obj;
                fVar.getClass();
                this.f130645b.setValue(fVar);
                return Unit.INSTANCE;
            default:
                j23.f fVar2 = (j23.f) obj;
                fVar2.getClass();
                this.f130645b.setValue(fVar2);
                return Unit.INSTANCE;
        }
    }
}
