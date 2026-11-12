package ty1;

import android.text.TextUtils;
import android.widget.Button;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s0 implements MultiLineImeEditText.a, MultiLineImeEditText.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.o f167231a;

    @Override // com.garmin.android.apps.connectmobile.view.MultiLineImeEditText.a
    public void b() {
        com.garmin.android.apps.connectmobile.traininginitiative.ui.o oVar = this.f167231a;
        MultiLineImeEditText multiLineImeEditText = oVar.f46158i;
        if (multiLineImeEditText == null) {
            p005kotlin.jvm.internal.s.m("multiLineImeEditText");
            throw null;
        }
        multiLineImeEditText.setCursorVisible(false);
        MultiLineImeEditText multiLineImeEditText2 = oVar.f46158i;
        if (multiLineImeEditText2 != null) {
            oVar.C6(multiLineImeEditText2.getEditableText().toString());
        } else {
            p005kotlin.jvm.internal.s.m("multiLineImeEditText");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.view.MultiLineImeEditText.b
    public void h() {
        com.garmin.android.apps.connectmobile.traininginitiative.ui.o oVar = this.f167231a;
        Button button = oVar.f46157h;
        if (button == null) {
            p005kotlin.jvm.internal.s.m("nextButton");
            throw null;
        }
        MultiLineImeEditText multiLineImeEditText = oVar.f46158i;
        if (multiLineImeEditText != null) {
            button.setEnabled(!TextUtils.isEmpty(multiLineImeEditText.getEditableText().toString()));
        } else {
            p005kotlin.jvm.internal.s.m("multiLineImeEditText");
            throw null;
        }
    }
}
