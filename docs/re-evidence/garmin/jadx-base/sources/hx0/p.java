package hx0;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsActivity;
import com.garmin.android.apps.connectmobile.navigation.EditBottomNavBarActivity;
import com.garmin.android.apps.connectmobile.view.SwipeViewPager;
import org.joda.time.DateTime;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenstrualCycleDetailsActivity f86119b;

    public /* synthetic */ p(MenstrualCycleDetailsActivity menstrualCycleDetailsActivity, int i14) {
        this.f86118a = i14;
        this.f86119b = menstrualCycleDetailsActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        Object serializable;
        int i14 = this.f86118a;
        MenstrualCycleDetailsActivity menstrualCycleDetailsActivity = this.f86119b;
        switch (i14) {
            case 0:
                MenstrualCycleDetailsActivity.a aVar = MenstrualCycleDetailsActivity.f38784t;
                HelpActivity.a.e(HelpActivity.f36653a, this.f86119b, ro0.l.PREGNANCY_SETTINGS_HELP, null, null, 12);
                return Unit.INSTANCE;
            case 1:
                MenstrualCycleDetailsActivity.a aVar2 = MenstrualCycleDetailsActivity.f38784t;
                Bundle bundleD = tn.k.d("Screen", "PregnancyBanner", "Action", "PregnancyBannerLearnMoreClicked");
                ht.a.f85464a.getClass();
                ht.a.a(bundleD, "UserAction");
                HelpActivity.a.e(HelpActivity.f36653a, this.f86119b, ro0.l.PREGNANCY_SETTINGS_HELP, null, null, 12);
                return Unit.INSTANCE;
            case 2:
                MenstrualCycleDetailsActivity.a aVar3 = MenstrualCycleDetailsActivity.f38784t;
                l2.a aVar4 = l2.f37135b;
                Intent intent = menstrualCycleDetailsActivity.getIntent();
                aVar4.getClass();
                Bundle bundleA = l2.a.a(intent);
                if (bundleA == null) {
                    return null;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = bundleA.getSerializable("extra.date.time", DateTime.class);
                } else {
                    Object serializable2 = bundleA.getSerializable("extra.date.time");
                    serializable = (DateTime) (serializable2 instanceof DateTime ? serializable2 : null);
                }
                return (DateTime) serializable;
            case 3:
                MenstrualCycleDetailsActivity.a aVar5 = MenstrualCycleDetailsActivity.f38784t;
                l2.a aVar6 = l2.f37135b;
                Intent intent2 = menstrualCycleDetailsActivity.getIntent();
                aVar6.getClass();
                Bundle bundleA2 = l2.a.a(intent2);
                return Boolean.valueOf(bundleA2 != null ? bundleA2.getBoolean("OPEN_TO_REPORTS_KEY") : false);
            case 4:
                MenstrualCycleDetailsActivity.a aVar7 = MenstrualCycleDetailsActivity.f38784t;
                DateTime dateTime = (DateTime) menstrualCycleDetailsActivity.f38793o.getValue();
                SwipeViewPager swipeViewPagerQa = menstrualCycleDetailsActivity.qa();
                i52.a.f91796a.getClass();
                return new com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.f(menstrualCycleDetailsActivity, dateTime, swipeViewPagerQa, i52.a.l() != ww0.a.NONE);
            default:
                com.garmin.android.apps.connectmobile.navigation.h hVar = com.garmin.android.apps.connectmobile.navigation.h.f39377a;
                bv.b.f21239a.getClass();
                bv.b.a();
                int i15 = EditBottomNavBarActivity.f39331c;
                Intent intent3 = new Intent(menstrualCycleDetailsActivity, (Class<?>) EditBottomNavBarActivity.class);
                intent3.putExtra("EXTRA_FROM_NAVIGATION_ITEM", "MENSTRUAL_CYCLE");
                menstrualCycleDetailsActivity.startActivityForResult(intent3, 59465);
                return Unit.INSTANCE;
        }
    }
}
