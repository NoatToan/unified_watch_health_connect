package ht1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsActivity;
import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedListFragment;
import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedViewModel;
import hx0.o0;
import java.lang.annotation.Annotation;
import m63.k1;
import m63.y1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.p0;
import z10.m3;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85604a;

    public /* synthetic */ v(int i14) {
        this.f85604a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f85604a) {
            case 0:
                return p0.n(Boolean.FALSE);
            case 1:
                return p0.n(Boolean.FALSE);
            case 2:
                return p0.n("");
            case 3:
                com.garmin.inappupdate.c[] cVarArrValues = com.garmin.inappupdate.c.values();
                cVarArrValues.getClass();
                return new m63.b0("com.garmin.inappupdate.Priority", cVarArrValues);
            case 4:
                com.garmin.inappupdate.d[] dVarArrValues = com.garmin.inappupdate.d.values();
                dVarArrValues.getClass();
                return new m63.b0("com.garmin.inappupdate.PromptType", dVarArrValues);
            case 5:
                return hu.a.M();
            case 6:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a.C0689a c0689a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a.f38856n;
                return new m3();
            case 7:
                MenstrualCycleDetailsActivity.a aVar = MenstrualCycleDetailsActivity.f38784t;
                i52.a.f91796a.getClass();
                i52.a.f91797b.edit().putBoolean(i52.a.c(R.string.key_has_user_seen_awareness_banner), true).apply();
                return Unit.INSTANCE;
            case 8:
                MenstrualCycleDetailsActivity.a aVar2 = MenstrualCycleDetailsActivity.f38784t;
                i52.a.f91796a.getClass();
                i52.a.f91797b.edit().putBoolean(i52.a.c(R.string.key_has_user_seen_what_to_expect_banner), true).apply();
                return Unit.INSTANCE;
            case 9:
                MenstrualCycleDetailsActivity.a aVar3 = MenstrualCycleDetailsActivity.f38784t;
                int i14 = gt2.c.f79010a;
                return gt2.b.f79005a.h("MenstrualCycleDetailsActivity");
            case 10:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                ww0.h.f187557a.getClass();
                return p13.u.i0(ww0.h.values());
            case 11:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar5 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                ww0.s.f187653a.getClass();
                return p13.u.i0(ww0.s.values());
            case 12:
                int i15 = o0.f86110f;
                return new y0();
            case 13:
                int i16 = o0.f86110f;
                return new y0();
            case 14:
                int i17 = NewsFeedListFragment.Y;
                return (iz0.a) KoinJavaComponent.get$default(iz0.a.class, null, null, 6, null);
            case 15:
                int i18 = NewsFeedViewModel.f39455j;
                return (iz0.a) KoinJavaComponent.get$default(iz0.a.class, null, null, 6, null);
            case 16:
                i01.a[] aVarArrValues = i01.a.values();
                aVarArrValues.getClass();
                return new m63.b0("com.garmin.android.apps.connectmobile.nutrition.data.model.log.BulkFoodLogAction", aVarArrValues);
            case 17:
                i01.b.C1722b c1722b = i01.b.Companion;
                return new u01.a();
            case 18:
                i01.c.b bVar = i01.c.Companion;
                return i01.a.INSTANCE.serializer();
            case 19:
                i01.c.b bVar2 = i01.c.Companion;
                return new m63.e(h63.k.f82304a);
            case 20:
                i01.c.b bVar3 = i01.c.Companion;
                return new m63.e(i01.b.a.f86730a);
            case 21:
                i01.c.b bVar4 = i01.c.Companion;
                return new u01.a();
            case 22:
                i01.d.b bVar5 = i01.d.Companion;
                return new m63.e(y1.f117048a);
            case 23:
                i01.f.Companion companion = i01.f.INSTANCE;
                return i01.i.INSTANCE.serializer();
            case 24:
                i01.f.Companion companion2 = i01.f.INSTANCE;
                return new u01.a();
            case 25:
                i01.f.Companion companion3 = i01.f.INSTANCE;
                i01.e[] eVarArrValues = i01.e.values();
                eVarArrValues.getClass();
                return new m63.b0("com.garmin.android.apps.connectmobile.nutrition.data.model.log.FoodLogAction", eVarArrValues);
            case 26:
                i01.f.Companion companion4 = i01.f.INSTANCE;
                return g01.u.INSTANCE.serializer();
            case 27:
                i01.g.b bVar6 = i01.g.Companion;
                return new m63.e(i01.m.a.f86826a);
            case 28:
                i01.h.b bVar7 = i01.h.Companion;
                return new m63.e(i01.f.a.f86760a);
            default:
                return k1.d("com.garmin.android.apps.connectmobile.nutrition.data.model.log.LogCategory", i01.i.values(), new String[]{"REGULAR_LOG", "QUICK_ADD", "IMAGE_RECOGNITION", "BARCODE", "UNKNOWN"}, new Annotation[][]{null, null, null, null, null});
        }
    }
}
