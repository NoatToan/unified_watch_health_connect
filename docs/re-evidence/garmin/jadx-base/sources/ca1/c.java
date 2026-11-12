package ca1;

import androidx.appcompat.widget.AppCompatButton;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import g22.n;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements MultiLineImeEditText.a, MultiLineImeEditText.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f26579a;

    @Override // com.garmin.android.apps.connectmobile.view.MultiLineImeEditText.a
    public void b() {
        MultiLineImeEditText multiLineImeEditText = this.f26579a.f26582b;
        if (multiLineImeEditText != null) {
            multiLineImeEditText.setCursorVisible(false);
        } else {
            s.m("multiLineImeEditText");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.view.MultiLineImeEditText.b
    public void h() {
        d dVar = this.f26579a;
        MultiLineImeEditText multiLineImeEditText = dVar.f26582b;
        if (multiLineImeEditText == null) {
            s.m("multiLineImeEditText");
            throw null;
        }
        String strValueOf = String.valueOf(multiLineImeEditText.getText());
        dVar.f26591k = strValueOf;
        AppCompatButton appCompatButton = dVar.f26588h;
        if (appCompatButton != null) {
            appCompatButton.setEnabled(n.d(strValueOf));
        } else {
            s.m("sendButton");
            throw null;
        }
    }
}
