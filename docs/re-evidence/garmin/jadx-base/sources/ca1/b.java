package ca1;

import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.garmin.android.apps.connectmobile.view.view_3_0.StyledInlineSingleTextFieldViewDark;
import e23.l;
import g22.n;
import lc.u0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f26578b;

    public /* synthetic */ b(d dVar, int i14) {
        this.f26577a = i14;
        this.f26578b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f26577a;
        d dVar = this.f26578b;
        switch (i14) {
            case 0:
                String str = (String) obj;
                d.a aVar = d.f26580m;
                str.getClass();
                MultiLineImeEditText multiLineImeEditText = dVar.f26582b;
                if (multiLineImeEditText == null) {
                    s.m("multiLineImeEditText");
                    throw null;
                }
                multiLineImeEditText.setCursorVisible(false);
                StyledInlineSingleTextFieldViewDark styledInlineSingleTextFieldViewDark = dVar.f26581a;
                if (styledInlineSingleTextFieldViewDark == null) {
                    s.m("reportImageTextField");
                    throw null;
                }
                styledInlineSingleTextFieldViewDark.setSelected(false);
                StyledInlineSingleTextFieldViewDark styledInlineSingleTextFieldViewDark2 = dVar.f26581a;
                if (styledInlineSingleTextFieldViewDark2 == null) {
                    s.m("reportImageTextField");
                    throw null;
                }
                styledInlineSingleTextFieldViewDark2.k();
                dVar.f26591k = str;
                AppCompatButton appCompatButton = dVar.f26588h;
                if (appCompatButton != null) {
                    appCompatButton.setEnabled(n.d(str));
                    return Unit.INSTANCE;
                }
                s.m("sendButton");
                throw null;
            default:
                v2 v2Var = (v2) obj;
                d.a aVar2 = d.f26580m;
                if (v2Var instanceof v2.b) {
                    String string = dVar.getString(R.string.lbl_content_reported);
                    string.getClass();
                    String string2 = dVar.getString(R.string.lbl_content_reported_message);
                    string2.getClass();
                    dVar.v6(string, string2, (da1.b) ((v2.b) v2Var).f47386a);
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    Integer num = ((v2.a) v2Var).f47384b;
                    if (num != null && num.intValue() == 429) {
                        String string3 = dVar.getString(R.string.lbl_previously_reported);
                        string3.getClass();
                        String string4 = dVar.getString(R.string.lbl_previously_reported_content);
                        string4.getClass();
                        dVar.v6(string3, string4, null);
                    } else {
                        Toast.makeText(dVar.requireActivity(), R.string.txt_error_occurred, 0).show();
                        dVar.dismiss();
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
