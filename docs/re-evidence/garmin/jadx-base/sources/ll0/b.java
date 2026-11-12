package ll0;

import am.b2;
import android.os.StatFs;
import androidx.lifecycle.y0;
import c22.k;
import com.garmin.android.apps.ui.catalog.PreviewCatalogActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayCardVerificationSubmitFragment;
import com.garmin.feature.garminpay.ui.devicesettings.DeviceSettingsActivity;
import i63.g;
import j23.t;
import java.io.File;
import java.lang.annotation.Annotation;
import java.text.DateFormat;
import java.util.Locale;
import lm2.h;
import m63.f1;
import me0.w;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p3.p0;
import qw0.s;
import w63.l;
import w63.y;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113338a;

    public /* synthetic */ b(int i14) {
        this.f113338a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        long jG;
        switch (this.f113338a) {
            case 0:
                return p0.n(null);
            case 1:
                Logger logger = lm2.a.f113609b;
                try {
                    return h.e();
                } catch (Throwable unused) {
                    return null;
                }
            case 2:
                int i14 = gt2.c.f79010a;
                return gt2.b.f79005a.h("PAY#NEW_FITPAY#FitPayApp2AppVerificationFragment");
            case 3:
                int i15 = gt2.c.f79010a;
                return gt2.b.f79005a.h("PAY#NEW_FITPAY#FitPayApp2WebVerificationFragment");
            case 4:
                int i16 = gt2.c.f79010a;
                return gt2.b.f79005a.h("PAY#NEW_FITPAY#FitPayCardVerificationListFragment");
            case 5:
                int i17 = FitPayCardVerificationSubmitFragment.f51514k;
                int i18 = gt2.c.f79010a;
                return gt2.b.f79005a.h("PAY#NEW_FITPAY#FitPayCardVerificationSubmitFragment");
            case 6:
                int i19 = gt2.c.f79010a;
                return gt2.b.f79005a.h("PAY#NEW_FITPAY#FitPayOnlineVerificationFragment");
            case 7:
                DeviceSettingsActivity.a aVar = DeviceSettingsActivity.f51993w;
                return Unit.INSTANCE;
            case 8:
                ls2.b bVar = ls2.b.f114790a;
                return DateFormat.getDateTimeInstance(1, 1, Locale.US);
            case 9:
                return new y0();
            case 10:
                return (s) KoinJavaComponent.get$default(s.class, null, null, 6, null);
            case 11:
                return Boolean.valueOf(((k) KoinJavaComponent.get$default(k.class, null, null, 6, null)).c("child_account_graduation_ui_enabled"));
            case 12:
                m21.b.Companion dVar = m21.b.INSTANCE;
                t0 t0Var = s0.f105811a;
                return new g("com.garmin.android.apps.connectmobile.nutrition.presentation.search.viewmodel.FindFoodMode", t0Var.b(m21.b.class), new k23.d[]{t0Var.b(m21.b.a.class), t0Var.b(m21.b.C2206b.class), t0Var.b(m21.b.c.class), t0Var.b(m21.b.e.class)}, new i63.c[]{new f1("com.garmin.android.apps.connectmobile.nutrition.presentation.search.viewmodel.FindFoodMode.AddFoodToMeal", m21.b.a.INSTANCE, new Annotation[0]), new f1("com.garmin.android.apps.connectmobile.nutrition.presentation.search.viewmodel.FindFoodMode.AddFoodToPhotoResult", m21.b.C2206b.INSTANCE, new Annotation[0]), m21.b.c.a.f116073a, new f1("com.garmin.android.apps.connectmobile.nutrition.presentation.search.viewmodel.FindFoodMode.FindFood", m21.b.e.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 13:
                return new f1("com.garmin.android.apps.connectmobile.nutrition.presentation.search.viewmodel.FindFoodMode.AddFoodToMeal", m21.b.a.INSTANCE, new Annotation[0]);
            case 14:
                return new f1("com.garmin.android.apps.connectmobile.nutrition.presentation.search.viewmodel.FindFoodMode.AddFoodToPhotoResult", m21.b.C2206b.INSTANCE, new Annotation[0]);
            case 15:
                return new f1("com.garmin.android.apps.connectmobile.nutrition.presentation.search.viewmodel.FindFoodMode.FindFood", m21.b.e.INSTANCE, new Annotation[0]);
            case 16:
                return new m3.s();
            case 17:
                int i24 = PreviewCatalogActivity.f49781a;
                return p0.n(Boolean.FALSE);
            case 18:
                return p0.n(Boolean.FALSE);
            case 19:
                ma0.c cVar = ma0.c.f117613a;
                return Unit.INSTANCE;
            case 20:
                ma0.c cVar2 = ma0.c.f117613a;
                return Unit.INSTANCE;
            case 21:
                ma0.d dVar2 = ma0.d.f117616a;
                return Unit.INSTANCE;
            case 22:
                int i25 = w.f118065e;
                return (ke0.c) KoinJavaComponent.get$default(ke0.c.class, null, null, 6, null);
            case 23:
                int i26 = w.f118065e;
                return (ke0.a) KoinJavaComponent.get$default(ke0.a.class, null, null, 6, null);
            case 24:
                int i27 = w.f118065e;
                return (ke0.b) KoinJavaComponent.get$default(ke0.b.class, null, null, 6, null);
            case 25:
                int i28 = w.f118065e;
                return (b2) KoinJavaComponent.get$default(b2.class, null, null, 6, null);
            case 26:
                return Boolean.TRUE;
            case 27:
                mf.a.C2244a c2244a = new mf.a.C2244a();
                y yVarE = l.f183388b.e("coil3_disk_cache");
                double d14 = c2244a.f118241b;
                if (d14 > 0.0d) {
                    try {
                        File file = yVarE.toFile();
                        file.mkdir();
                        StatFs statFs = new StatFs(file.getAbsolutePath());
                        jG = t.g((long) (d14 * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), c2244a.f118242c, c2244a.f118243d);
                    } catch (Exception unused2) {
                        jG = c2244a.f118242c;
                    }
                    break;
                } else {
                    jG = 0;
                }
                return new mf.d(jG, yVarE, c2244a.f118240a, c2244a.f118244e);
            case 28:
                mh1.b bVar2 = mh1.b.f118457a;
                return Unit.INSTANCE;
            default:
                int i29 = gt2.c.f79010a;
                return gt2.b.f79005a.h("IndexAppearanceViewModel");
        }
    }
}
