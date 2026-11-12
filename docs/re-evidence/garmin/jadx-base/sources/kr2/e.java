package kr2;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.developer.DeveloperSettingsActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import wr2.p;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f106248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f106249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h.g f106250d;

    public /* synthetic */ e(b bVar, h hVar, h.g gVar, int i14) {
        this.f106247a = i14;
        this.f106249c = bVar;
        this.f106248b = hVar;
        this.f106250d = gVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f106247a;
        h.g gVar = this.f106250d;
        b bVar = this.f106249c;
        h hVar = this.f106248b;
        ((Integer) obj).getClass();
        switch (i14) {
            case 0:
                boolean z14 = !hVar.f106267k;
                hVar.f106267k = z14;
                aq2.j.f12491a.getClass();
                p.f186870a.getClass();
                p.e("dynamic_feature_app", "SHOULD_BYPASS_ALIPAY", z14);
                bVar.f106240b = hVar.f106267k ? "True" : "False";
                DeveloperSettingsActivity developerSettingsActivity = hVar.f106257a;
                if (developerSettingsActivity != null) {
                    developerSettingsActivity.ga(gVar);
                }
                break;
            case 1:
                boolean z15 = !hVar.f106268l;
                hVar.f106268l = z15;
                aq2.j.f12491a.getClass();
                p.f186870a.getClass();
                p.e("dynamic_feature_app", "SKIP_DEVICE_CHECK", z15);
                bVar.f106240b = hVar.f106268l ? "True" : "False";
                DeveloperSettingsActivity developerSettingsActivity2 = hVar.f106257a;
                if (developerSettingsActivity2 != null) {
                    developerSettingsActivity2.ga(gVar);
                }
                break;
            case 2:
                h.a aVar = h.f106255y;
                aq2.j.f12491a.getClass();
                p pVar = p.f186870a;
                pVar.getClass();
                boolean zB = p.b("dynamic_feature_app", "SKIP_SHIFTED_OUT_CARDS_CHECK", false);
                pVar.getClass();
                p.e("dynamic_feature_app", "SKIP_SHIFTED_OUT_CARDS_CHECK", !zB);
                bVar.f106240b = zB ? "False" : "True";
                DeveloperSettingsActivity developerSettingsActivity3 = hVar.f106257a;
                if (developerSettingsActivity3 != null) {
                    developerSettingsActivity3.ga(gVar);
                }
                break;
            case 3:
                h.a aVar2 = h.f106255y;
                aq2.j.f12491a.getClass();
                boolean zF = aq2.j.f();
                p.f186870a.getClass();
                p.e("dynamic_feature_app", "INCLUDE_UNRELEASED", !zF);
                bVar.f106240b = zF ? "False" : "True";
                DeveloperSettingsActivity developerSettingsActivity4 = hVar.f106257a;
                if (developerSettingsActivity4 != null) {
                    developerSettingsActivity4.ga(gVar);
                }
                break;
            case 4:
                h.a aVar3 = h.f106255y;
                aq2.j.f12491a.getClass();
                boolean zG = aq2.j.g();
                p.f186870a.getClass();
                p.e("dynamic_feature_app", "SKIP_DELETABLE_CHECK", !zG);
                bVar.f106240b = zG ? "False" : "True";
                DeveloperSettingsActivity developerSettingsActivity5 = hVar.f106257a;
                if (developerSettingsActivity5 != null) {
                    developerSettingsActivity5.ga(gVar);
                }
                break;
            case 5:
                h.a aVar4 = h.f106255y;
                fg.b.a aVar5 = fg.b.a() ? fg.b.a.ONLINE : fg.b.a.SANDBOX;
                fg.b.f71198a = aVar5;
                bVar.f106240b = aVar5.name();
                DeveloperSettingsActivity developerSettingsActivity6 = hVar.f106257a;
                if (developerSettingsActivity6 != null) {
                    developerSettingsActivity6.ga(gVar);
                }
                break;
            default:
                boolean z16 = hVar.f106269m;
                hVar.f106269m = !z16;
                bVar.f106240b = z16 ? "False" : "True";
                p pVar2 = p.f186870a;
                String strD = kg.f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.is_snowball_sandbox_role);
                boolean z17 = hVar.f106269m;
                pVar2.getClass();
                p.e("general_app", strD, z17);
                DeveloperSettingsActivity developerSettingsActivity7 = hVar.f106257a;
                if (developerSettingsActivity7 != null) {
                    developerSettingsActivity7.ga(gVar);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(h hVar, b bVar, h.g gVar, int i14) {
        this.f106247a = i14;
        this.f106248b = hVar;
        this.f106249c = bVar;
        this.f106250d = gVar;
    }
}
