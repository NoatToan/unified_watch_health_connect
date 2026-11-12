package tn;

import com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.FollowerRequestsPrivacyActivity;
import d53.w;
import java.util.Calendar;
import java.util.List;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Unit;
import p3.p0;
import p3.p1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f165469b;

    public /* synthetic */ h(p1 p1Var, int i14) {
        this.f165468a = i14;
        this.f165469b = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f165468a;
        Calendar calendar = null;
        p1 p1Var = this.f165469b;
        switch (i14) {
            case 0:
                int i15 = com.garmin.android.apps.connectmobile.activities.health.presentation.c.f29045e;
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 1:
                int i16 = m.f165476e;
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 2:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.v.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.v.f46300e;
                p1Var.setValue(m52.i.SPRINT);
                return Unit.INSTANCE;
            case 3:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.v.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.v.f46300e;
                p1Var.setValue(m52.i.STANDARD);
                return Unit.INSTANCE;
            case 4:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.v.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.v.f46300e;
                p1Var.setValue(m52.i.HALF_IRON);
                return Unit.INSTANCE;
            case 5:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.v.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.v.f46300e;
                p1Var.setValue(m52.i.FULL_IRON);
                return Unit.INSTANCE;
            case 6:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.v.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.v.f46300e;
                p1Var.setValue(m52.i.CUSTOM);
                return Unit.INSTANCE;
            case 7:
                FollowerRequestsPrivacyActivity.a aVar6 = FollowerRequestsPrivacyActivity.f47109c;
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 8:
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 9:
                p1Var.setValue(null);
                return Unit.INSTANCE;
            case 10:
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 11:
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 12:
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 13:
                p1Var.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 14:
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 15:
                p1Var.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 16:
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 17:
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 18:
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 19:
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 20:
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 21:
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 22:
                p1Var.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 23:
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 24:
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 25:
                p1Var.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 26:
                p1Var.setValue(Boolean.valueOf(!((Boolean) p1Var.getF182175a()).booleanValue()));
                return Unit.INSTANCE;
            case 27:
                p1Var.setValue(null);
                return Unit.INSTANCE;
            case 28:
                String str = ((pe0.c) p1Var.getF182175a()).f137412g;
                if (w.J(str)) {
                    str = null;
                }
                if (str != null) {
                    if (new d53.k("^\\d{4}-\\d{2}-\\d{2}$").d(str)) {
                        calendar = Calendar.getInstance();
                        LocalDate localDate = DateTimeFormat.forPattern("yyyy-MM-dd").parseLocalDate(str);
                        calendar.set(localDate.getYear(), localDate.getMonthOfYear() - 1, localDate.getDayOfMonth());
                    } else if (new d53.k("^\\d{4}-\\d{2}$").d(str)) {
                        calendar = Calendar.getInstance();
                        List listW = w.W(str, new String[]{"-"});
                        calendar.set(Integer.parseInt((String) listW.get(0)), Integer.parseInt((String) listW.get(1)) - 1, 1);
                    }
                }
                return p0.n(calendar);
            default:
                p1Var.setValue(Boolean.valueOf(!((Boolean) p1Var.getF182175a()).booleanValue()));
                return Unit.INSTANCE;
        }
    }
}
