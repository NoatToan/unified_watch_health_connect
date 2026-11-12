package gc0;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.garmin.android.apps.connectmobile.view.audiorecording.AudioRecordingView;
import com.garmin.android.apps.connectmobile.view.conversation.CommentView;
import com.github.mikephil.chartingv2.charts.LineChart;
import qm.c0;
import xe2.k0;
import xe2.y;
import zb0.g0;
import zb0.g0.d;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f76832b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f76831a = i14;
        this.f76832b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view2) {
        int i14 = this.f76831a;
        Object obj = this.f76832b;
        switch (i14) {
            case 0:
                b bVar = (b) obj;
                Context context = bVar.getContext();
                StringBuilder sb3 = new StringBuilder("device product number [");
                sd2.f fVar = bVar.f76834b;
                sb3.append(fVar.getProductNumber() != null ? fVar.getProductNumber() : PrivacyUpdateRequestError.UNKNOWN);
                sb3.append("]");
                Toast.makeText(context, sb3.toString(), 0).show();
                return true;
            case 1:
                int i15 = ip2.b.f94710m;
                ((bp2.b) obj).invoke();
                return true;
            case 2:
                c0 c0Var = (c0) obj;
                c0Var.f145339v = true;
                LineChart lineChart = c0Var.f134442b;
                if (lineChart != null) {
                    lineChart.setDrawMarkerViews(true);
                }
                return false;
            case 3:
                AudioRecordingView.b((AudioRecordingView) obj);
                return true;
            case 4:
                int i16 = CommentView.f47627q;
                return ((CommentView) obj).performLongClick();
            case 5:
                k0 k0Var = (k0) obj;
                re2.b.f152215a.getClass();
                if (k0Var instanceof com.garmin.android.library.mobileauth.ui.g) {
                    re2.b.h("WelcomeFrag");
                } else if (k0Var instanceof y) {
                    re2.b.h("ContinueAsFrag");
                }
                return true;
            default:
                g0 g0Var = (g0) obj;
                i iVar = g0Var.f203492c;
                if (iVar != null) {
                    new b(iVar.f76870c, iVar.f76871d, new com.google.android.exoplayer2.analytics.q(22, iVar, g0Var.new d()));
                }
                return true;
        }
    }
}
