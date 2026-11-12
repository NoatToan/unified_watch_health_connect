package u40;

import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMSingleLineEditTextView;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements q1.a, MultiLineImeEditText.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f168589a;

    @Override // com.garmin.android.apps.connectmobile.view.MultiLineImeEditText.a
    public void b() {
        GCMSingleLineEditTextView gCMSingleLineEditTextView = this.f168589a.f168595l;
        if (gCMSingleLineEditTextView != null) {
            gCMSingleLineEditTextView.k();
        } else {
            s.m("coursePointNameEditText");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.q1.a
    public void g(boolean z14) {
        if (!z14) {
            o.a aVar = o.f168590m;
            return;
        }
        o oVar = this.f168589a;
        com.garmin.android.apps.connectmobile.courses.model.g gVar = oVar.f168593j;
        if (gVar != null) {
            o.b bVar = oVar.f168591h;
            if (bVar != null) {
                bVar.a(gVar);
            }
            oVar.dismiss();
        }
    }
}
