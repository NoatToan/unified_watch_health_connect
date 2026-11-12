package ky0;

import com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailActivity;
import com.garmin.android.apps.connectmobile.settings.developersettings.TestGoogleAgeSignalsActivity;
import java.util.List;
import l72.i3;
import l72.s2;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f107398b;

    public /* synthetic */ k(p3.p1 p1Var, int i14) {
        this.f107397a = i14;
        this.f107398b = p1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f107397a;
        boolean z14 = false;
        p3.p1 p1Var = this.f107398b;
        switch (i14) {
            case 0:
                String str = (String) obj;
                str.getClass();
                p1Var.setValue(str);
                return Unit.INSTANCE;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                p1Var.setValue(str2);
                return Unit.INSTANCE;
            case 2:
                m4.g0 g0Var = (m4.g0) obj;
                g0Var.getClass();
                p1Var.setValue(Boolean.valueOf(g0Var.a()));
                return Unit.INSTANCE;
            case 3:
                MultiDayActivitiesDetailActivity.a aVar = MultiDayActivitiesDetailActivity.f39233a;
                p1Var.setValue((sy0.f) obj);
                return Unit.INSTANCE;
            case 4:
                p1Var.setValue((f2) f2.f107312e.get(((Integer) obj).intValue()));
                return Unit.INSTANCE;
            case 5:
                s5.q0 q0Var = (s5.q0) obj;
                q0Var.getClass();
                p1Var.setValue(Boolean.valueOf(q0Var.e()));
                return Unit.INSTANCE;
            case 6:
                y2.s.a aVar2 = (y2.s.a) obj;
                p1Var.setValue(aVar2.f194176c ? aVar2.f194175b : aVar2.f194174a);
                return Unit.INSTANCE;
            case 7:
                List list = (List) obj;
                if (p1Var != null) {
                    p1Var.setValue(list);
                }
                return Unit.INSTANCE;
            case 8:
                c50.i iVar = (c50.i) obj;
                iVar.getClass();
                p1Var.setValue(iVar);
                return Unit.INSTANCE;
            case 9:
                s5.q0 q0Var2 = (s5.q0) obj;
                l72.s sVar = l72.s.f111232a;
                q0Var2.getClass();
                p1Var.setValue(Boolean.valueOf(q0Var2.f157281b.f157257f > 1));
                return Unit.INSTANCE;
            case 10:
                p1Var.setValue(g6.m.a(((g6.m) obj).f76013a));
                return Unit.INSTANCE;
            case 11:
                ((p3.i0) obj).getClass();
                return new s2(p1Var);
            case 12:
                String str3 = (String) obj;
                int i15 = TestGoogleAgeSignalsActivity.f41746b;
                str3.getClass();
                p1Var.setValue(str3);
                return Unit.INSTANCE;
            case 13:
                String str4 = (String) obj;
                int i16 = TestGoogleAgeSignalsActivity.f41746b;
                str4.getClass();
                p1Var.setValue(str4);
                return Unit.INSTANCE;
            case 14:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                p1Var.setValue(bool);
                return Unit.INSTANCE;
            case 15:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                p1Var.setValue(bool2);
                return Unit.INSTANCE;
            case 16:
                Boolean bool3 = (Boolean) obj;
                bool3.getClass();
                p1Var.setValue(bool3);
                return Unit.INSTANCE;
            case 17:
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                p1Var.setValue(bool4);
                return Unit.INSTANCE;
            case 18:
                Boolean bool5 = (Boolean) obj;
                bool5.getClass();
                p1Var.setValue(bool5);
                return Unit.INSTANCE;
            case 19:
                Boolean bool6 = (Boolean) obj;
                bool6.getClass();
                p1Var.setValue(bool6);
                return Unit.INSTANCE;
            case 20:
                Boolean bool7 = (Boolean) obj;
                bool7.getClass();
                p1Var.setValue(bool7);
                return Unit.INSTANCE;
            case 21:
                Boolean bool8 = (Boolean) obj;
                bool8.getClass();
                p1Var.setValue(bool8);
                return Unit.INSTANCE;
            case 22:
                il0.a aVar3 = (il0.a) obj;
                aVar3.getClass();
                p1Var.setValue(aVar3);
                return Unit.INSTANCE;
            case 23:
                b82.t0.a aVar4 = (b82.t0.a) obj;
                aVar4.getClass();
                int i17 = lm0.l.f.f113575a[aVar4.ordinal()];
                if (i17 == 1) {
                    z14 = true;
                } else if (i17 != 2) {
                    lc.u0.r();
                    return null;
                }
                p1Var.setValue(Boolean.valueOf(z14));
                return Unit.INSTANCE;
            case 24:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var.f111063a, "exit")) {
                    p1Var.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 25:
                m30.m mVar = (m30.m) obj;
                mVar.getClass();
                p1Var.setValue(mVar);
                return Unit.INSTANCE;
            case 26:
                m30.m mVar2 = (m30.m) obj;
                mVar2.getClass();
                p1Var.setValue(mVar2);
                return Unit.INSTANCE;
            case 27:
                int i18 = m92.l.f117397a;
                p1Var.setValue((n4.c) obj);
                return Unit.INSTANCE;
            case 28:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                int i19 = m92.l.f117397a;
                p1Var.setValue(bool9);
                return Unit.INSTANCE;
            default:
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }
}
