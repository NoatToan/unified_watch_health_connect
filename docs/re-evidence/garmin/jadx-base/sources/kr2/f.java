package kr2;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.developer.DeveloperSettingsActivity;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import wr2.p;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f106252b;

    public /* synthetic */ f(h hVar, int i14) {
        this.f106251a = i14;
        this.f106252b = hVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f106251a) {
            case 0:
                ((Integer) obj).getClass();
                DeveloperSettingsActivity developerSettingsActivity = this.f106252b.f106257a;
                if (developerSettingsActivity != null) {
                    gl.b.I(f0.w(developerSettingsActivity), null, new jr2.k(developerSettingsActivity, null), 3);
                }
                return Unit.INSTANCE;
            case 1:
                this.f106252b.f106277w.m(Boolean.FALSE);
                h.f106256z.error("Failed to delete all local wallet items.", (Throwable) obj);
                Toast.makeText(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c(), "Failed to delete all local wallet items!", 0).show();
                return Unit.INSTANCE;
            case 2:
                int iIntValue = ((Integer) obj).intValue();
                h hVar = this.f106252b;
                hVar.f106262f = !hVar.f106262f;
                ((b) hVar.f106270n.get(iIntValue)).f106240b = com.airbnb.lottie.animation.keyframe.a.g("Dual tokenization, upgrade flow, initiate add card from GCM [", "]", hVar.f106262f);
                DeveloperSettingsActivity developerSettingsActivity2 = hVar.f106257a;
                if (developerSettingsActivity2 != null) {
                    jr2.m mVar = developerSettingsActivity2.f51956h;
                    if (mVar == null) {
                        s.m("developerSettingsAdapter");
                        throw null;
                    }
                    h.a aVar = h.f106255y;
                    h.b bVar = h.b.DISABLE_ECOM_FEATURES;
                    aVar.getClass();
                    mVar.notifyItemChanged(h.a.a(bVar));
                }
                p pVar = p.f186870a;
                String strD = kg.f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.disable_ecom_features);
                boolean z14 = hVar.f106262f;
                pVar.getClass();
                p.e("general_app", strD, z14);
                return Unit.INSTANCE;
            case 3:
                int iIntValue2 = ((Integer) obj).intValue();
                h hVar2 = this.f106252b;
                hVar2.f106263g = !hVar2.f106263g;
                ((b) hVar2.f106270n.get(iIntValue2)).f106240b = com.airbnb.lottie.animation.keyframe.a.g("Ecom (dual) tokenization: [", "]", hVar2.f106263g);
                DeveloperSettingsActivity developerSettingsActivity3 = hVar2.f106257a;
                if (developerSettingsActivity3 != null) {
                    jr2.m mVar2 = developerSettingsActivity3.f51956h;
                    if (mVar2 == null) {
                        s.m("developerSettingsAdapter");
                        throw null;
                    }
                    h.a aVar2 = h.f106255y;
                    h.b bVar2 = h.b.DISABLE_ECOM_TOKENIZATION;
                    aVar2.getClass();
                    mVar2.notifyItemChanged(h.a.a(bVar2));
                }
                p pVar2 = p.f186870a;
                String strD2 = kg.f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.disable_ecom_tokenization);
                boolean z15 = hVar2.f106263g;
                pVar2.getClass();
                p.e("general_app", strD2, z15);
                return Unit.INSTANCE;
            case 4:
                int iIntValue3 = ((Integer) obj).intValue();
                h hVar3 = this.f106252b;
                hVar3.f106264h = !hVar3.f106264h;
                ((b) hVar3.f106271o.get(iIntValue3)).f106240b = com.airbnb.lottie.animation.keyframe.a.g("Force early token expiration [", "]", hVar3.f106264h);
                p pVar3 = p.f186870a;
                String strD3 = kg.f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.fitpay_has_early_expiration_token_set);
                boolean z16 = hVar3.f106264h;
                pVar3.getClass();
                p.e("general_app", strD3, z16);
                return Unit.INSTANCE;
            case 5:
                int iIntValue4 = ((Integer) obj).intValue();
                h hVar4 = this.f106252b;
                hVar4.f106266j = !hVar4.f106266j;
                ((b) hVar4.f106271o.get(iIntValue4)).f106240b = String.valueOf(hVar4.f106266j);
                aq2.j jVar = aq2.j.f12491a;
                boolean z17 = hVar4.f106266j;
                jVar.getClass();
                p.f186870a.getClass();
                p.e("dynamic_feature_app", "SHOULD_USER_REMOTE_CONFIG", z17);
                return Unit.INSTANCE;
            default:
                int iIntValue5 = ((Integer) obj).intValue();
                DeveloperSettingsActivity developerSettingsActivity4 = this.f106252b.f106257a;
                if (developerSettingsActivity4 != null) {
                    developerSettingsActivity4.runOnUiThread(new androidx.media3.exoplayer.d(developerSettingsActivity4, iIntValue5, 10));
                }
                return Unit.INSTANCE;
        }
    }
}
