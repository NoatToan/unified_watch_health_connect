package gb1;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyDetailsActivity;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.EditTabBarActivity;
import com.garmin.android.apps.connectmobile.view.SwipeViewPager;
import java.io.Serializable;
import org.joda.time.DateTime;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PregnancyDetailsActivity f76674b;

    public /* synthetic */ h(PregnancyDetailsActivity pregnancyDetailsActivity, int i14) {
        this.f76673a = i14;
        this.f76674b = pregnancyDetailsActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        Parcelable parcelable;
        Object serializableExtra;
        int i14 = this.f76673a;
        PregnancyDetailsActivity pregnancyDetailsActivity = this.f76674b;
        switch (i14) {
            case 0:
                PregnancyDetailsActivity.a aVar = PregnancyDetailsActivity.f40489x;
                Intent intent = pregnancyDetailsActivity.getIntent();
                if (intent == null) {
                    return null;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) intent.getParcelableExtra("PREGNANCY_SNAPSHOT_DTO_KEY", db1.m.class);
                } else {
                    Parcelable parcelableExtra = intent.getParcelableExtra("PREGNANCY_SNAPSHOT_DTO_KEY");
                    parcelable = (db1.m) (parcelableExtra instanceof db1.m ? parcelableExtra : null);
                }
                return (db1.m) parcelable;
            case 1:
                PregnancyDetailsActivity.a aVar2 = PregnancyDetailsActivity.f40489x;
                return Boolean.valueOf(pregnancyDetailsActivity.getIntent().getBooleanExtra("OPEN_TO_TIPS_KEY", false));
            case 2:
                PregnancyDetailsActivity.a aVar3 = PregnancyDetailsActivity.f40489x;
                PregnancyDetailsActivity pregnancyDetailsActivity2 = this.f76674b;
                DateTime dateTime = (DateTime) pregnancyDetailsActivity2.f40495o.getValue();
                SwipeViewPager swipeViewPagerQa = pregnancyDetailsActivity2.qa();
                i52.a.f91796a.getClass();
                return new com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.a(pregnancyDetailsActivity2, dateTime, swipeViewPagerQa, i52.a.l() != ww0.a.NONE, pregnancyDetailsActivity2.ta());
            case 3:
                PregnancyDetailsActivity.a aVar4 = PregnancyDetailsActivity.f40489x;
                Bundle bundleD = tn.k.d("Screen", "PregnancyBanner", "Action", "PregnancyBannerLearnMoreClicked");
                ht.a.f85464a.getClass();
                ht.a.a(bundleD, "UserAction");
                HelpActivity.a.e(HelpActivity.f36653a, this.f76674b, ro0.l.PREGNANCY_SETTINGS_HELP, null, null, 12);
                return Unit.INSTANCE;
            case 4:
                PregnancyDetailsActivity.a aVar5 = PregnancyDetailsActivity.f40489x;
                EditTabBarActivity.f45351e.getClass();
                EditTabBarActivity.f45352f = "PREGNANCY";
                pregnancyDetailsActivity.startActivityForResult(new Intent(pregnancyDetailsActivity, (Class<?>) EditTabBarActivity.class), 102);
                return Unit.INSTANCE;
            case 5:
                PregnancyDetailsActivity.a aVar6 = PregnancyDetailsActivity.f40489x;
                Intent intent2 = pregnancyDetailsActivity.getIntent();
                if (intent2 == null) {
                    return null;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    serializableExtra = intent2.getSerializableExtra("extra.date.time", DateTime.class);
                } else {
                    Serializable serializableExtra2 = intent2.getSerializableExtra("extra.date.time");
                    serializableExtra = (DateTime) (serializableExtra2 instanceof DateTime ? serializableExtra2 : null);
                }
                return (DateTime) serializableExtra;
            default:
                PregnancyDetailsActivity.a aVar7 = PregnancyDetailsActivity.f40489x;
                return Boolean.valueOf(pregnancyDetailsActivity.getIntent().getBooleanExtra("OPEN_TO_REPORTS_KEY", false));
        }
    }
}
