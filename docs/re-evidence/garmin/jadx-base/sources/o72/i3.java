package o72;

import com.garmin.android.apps.connectmobile.settings.usersettings.UpdateBirthdateActivity;
import com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettings;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i3 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f130440b;

    public /* synthetic */ i3(p3.p1 p1Var, int i14) {
        this.f130439a = i14;
        this.f130440b = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f130439a;
        boolean z14 = true;
        p3.p1 p1Var = this.f130440b;
        switch (i14) {
            case 0:
                j23.f fVar = (j23.f) obj;
                fVar.getClass();
                p1Var.setValue(fVar);
                return Unit.INSTANCE;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                p1Var.setValue(bool);
                return Unit.INSTANCE;
            case 2:
                j90.c cVar = (j90.c) obj;
                cVar.getClass();
                return Boolean.valueOf(cVar == ((j90.c) p1Var.getF182175a()));
            case 3:
                j90.k kVar = (j90.k) obj;
                kVar.getClass();
                return Boolean.valueOf(kVar == ((j90.k) p1Var.getF182175a()));
            case 4:
                j90.o oVar = (j90.o) obj;
                oVar.getClass();
                p1Var.setValue(oVar);
                return Unit.INSTANCE;
            case 5:
                j90.o oVar2 = (j90.o) obj;
                oVar2.getClass();
                return Boolean.valueOf(oVar2 == ((j90.o) p1Var.getF182175a()));
            case 6:
                ((Boolean) obj).booleanValue();
                oe2.f0.d(p1Var, false);
                return Unit.INSTANCE;
            case 7:
                LocationComponentSettings.Builder builder = (LocationComponentSettings.Builder) obj;
                builder.m281setEnabled(((Boolean) p1Var.getF182175a()).booleanValue());
                builder.m288setPulsingEnabled(((Boolean) p1Var.getF182175a()).booleanValue());
                return Unit.INSTANCE;
            case 8:
                ((Boolean) obj).booleanValue();
                oe2.f0.d(p1Var, false);
                return Unit.INSTANCE;
            case 9:
                jv1.c cVar2 = (jv1.c) obj;
                ov1.m.a aVar = ov1.m.f134192b;
                cVar2.getClass();
                p1Var.setValue(cVar2);
                return Unit.INSTANCE;
            case 10:
                m4.g0 g0Var = (m4.g0) obj;
                g0Var.getClass();
                p1Var.setValue(Boolean.valueOf(g0Var.a()));
                return Unit.INSTANCE;
            case 11:
                s5.q0 q0Var = (s5.q0) obj;
                q0Var.getClass();
                if (q0Var.f157281b.f157257f >= 2 && q0Var.m(1)) {
                    p1Var.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 12:
                Integer num = (Integer) obj;
                num.intValue();
                p1Var.setValue(num);
                return Unit.INSTANCE;
            case 13:
                Integer num2 = (Integer) obj;
                num2.intValue();
                p1Var.setValue(num2);
                return Unit.INSTANCE;
            case 14:
                Integer num3 = (Integer) obj;
                num3.intValue();
                p1Var.setValue(num3);
                return Unit.INSTANCE;
            case 15:
                Integer num4 = (Integer) obj;
                num4.intValue();
                p1Var.setValue(num4);
                return Unit.INSTANCE;
            case 16:
                Integer num5 = (Integer) obj;
                num5.intValue();
                p1Var.setValue(num5);
                return Unit.INSTANCE;
            case 17:
                String str = (String) obj;
                str.getClass();
                if (str.length() <= 250) {
                    p1Var.setValue(str);
                }
                return Unit.INSTANCE;
            case 18:
                b82.t0.a aVar2 = (b82.t0.a) obj;
                aVar2.getClass();
                int i15 = p40.r0.b.f135733b[aVar2.ordinal()];
                if (i15 != 1) {
                    if (i15 != 2) {
                        lc.u0.r();
                        return null;
                    }
                    z14 = false;
                }
                p1Var.setValue(Boolean.valueOf(z14));
                return Unit.INSTANCE;
            case 19:
                Integer num6 = (Integer) obj;
                num6.intValue();
                p1Var.setValue(num6);
                return Unit.INSTANCE;
            case 20:
                Integer num7 = (Integer) obj;
                num7.intValue();
                p1Var.setValue(num7);
                return Unit.INSTANCE;
            case 21:
                Integer num8 = (Integer) obj;
                num8.intValue();
                p1Var.setValue(num8);
                return Unit.INSTANCE;
            case 22:
                Integer num9 = (Integer) obj;
                num9.intValue();
                p1Var.setValue(num9);
                return Unit.INSTANCE;
            case 23:
                Integer num10 = (Integer) obj;
                num10.intValue();
                p1Var.setValue(num10);
                return Unit.INSTANCE;
            case 24:
                String str2 = (String) obj;
                str2.getClass();
                p1Var.setValue(str2);
                return Unit.INSTANCE;
            case 25:
                String str3 = (String) obj;
                str3.getClass();
                p1Var.setValue(str3);
                return Unit.INSTANCE;
            case 26:
                l72.i3 i3Var = (l72.i3) obj;
                i3Var.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var.f111063a, "SEARCH")) {
                    p1Var.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 27:
                int i16 = UpdateBirthdateActivity.f44011d;
                p1Var.setValue((LocalDate) obj);
                return Unit.INSTANCE;
            case 28:
                DateTime dateTime = (DateTime) obj;
                dateTime.getClass();
                p1Var.setValue(dateTime);
                return Unit.INSTANCE;
            default:
                DateTime dateTime2 = (DateTime) obj;
                dateTime2.getClass();
                p1Var.setValue(dateTime2);
                return Unit.INSTANCE;
        }
    }
}
