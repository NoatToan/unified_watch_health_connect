package pf0;

import android.os.Bundle;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgDetailActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137493a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EcgDetailActivity f137494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gf0.a f137495c;

    public /* synthetic */ l(EcgDetailActivity ecgDetailActivity, gf0.a aVar) {
        this.f137494b = ecgDetailActivity;
        this.f137495c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0061  */
    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f137493a;
        String str = null;
        gf0.a aVar = this.f137495c;
        EcgDetailActivity ecgDetailActivity = this.f137494b;
        switch (i14) {
            case 0:
                EcgDetailActivity.a aVar2 = EcgDetailActivity.f34869p;
                aVar.getClass();
                String rhythmClassification = aVar.getRhythmClassification();
                if (rhythmClassification != null) {
                    switch (rhythmClassification.hashCode()) {
                        case -1617199657:
                            if (rhythmClassification.equals("INVALID")) {
                                str = "INCONCLUSIVE_ACTION";
                            }
                            break;
                        case -1519658811:
                            if (rhythmClassification.equals("INCONCLUSIVE_OTHER")) {
                                str = "INCONCLUSIVE_ACTION";
                            }
                            break;
                        case -1269378420:
                            if (rhythmClassification.equals("INCONCLUSIVE_HR_OVER_120_50")) {
                                str = "HEART_RATE_ACTION";
                            }
                            break;
                        case -720143158:
                            if (rhythmClassification.equals("INCONCLUSIVE_SR_WITH_HR_100_TO_120")) {
                                str = "INCONCLUSIVE_ACTION";
                            }
                            break;
                        case 2006014:
                            if (rhythmClassification.equals("AFIB")) {
                                str = "ATRIAL_ACTION";
                            }
                            break;
                        case 93496186:
                            if (rhythmClassification.equals("INCONCLUSIVE_POOR_SIGNAL")) {
                                str = "INCONCLUSIVE_ACTION";
                            }
                            break;
                        case 438179628:
                            if (rhythmClassification.equals("INCONCLUSIVE_HR_UNDER_50")) {
                                str = "HEART_RATE_ACTION";
                            }
                            break;
                        case 1978934256:
                            if (rhythmClassification.equals("SINUS_NORMAL")) {
                                str = "SINUS_ACTION";
                            }
                            break;
                    }
                }
                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar3 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                String str2 = ((r) ecgDetailActivity.f34870a.getValue()).f137527c;
                aVar3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("SINGLE_PAGE_EXTRA", true);
                bundle.putString("ECG_VIDEO_URI_EXTRA", str2);
                HelpActivity.a aVar4 = HelpActivity.f36653a;
                ro0.l lVar = ro0.l.ECG;
                aVar4.getClass();
                HelpActivity.a.d(ecgDetailActivity, lVar, str, bundle);
                break;
            default:
                EcgDetailActivity.a aVar5 = EcgDetailActivity.f34869p;
                r rVar = (r) ecgDetailActivity.f34870a.getValue();
                String detailId = aVar.getDetailId();
                detailId.getClass();
                y0 y0Var = new y0();
                ge1.b.T(v1.a(rVar), null, null, new o(y0Var, rVar, detailId, null), 3);
                y0Var.f(ecgDetailActivity, ecgDetailActivity.f34883n);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ l(gf0.a aVar, EcgDetailActivity ecgDetailActivity) {
        this.f137495c = aVar;
        this.f137494b = ecgDetailActivity;
    }
}
