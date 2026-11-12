package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.userinfo.medicalid.baseui.UserInfoRightArrowSingleLineTextView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class pkq extends ViewDataBinding {
    public final TextView A;
    public final EditText B;
    public final EditText C;
    public final UserInfoRightArrowSingleLineTextView D;

    public pkq(Object obj, View view, int i, TextView textView, EditText editText, EditText editText2, UserInfoRightArrowSingleLineTextView userInfoRightArrowSingleLineTextView) {
        super(obj, view, i);
        this.A = textView;
        this.B = editText;
        this.C = editText2;
        this.D = userInfoRightArrowSingleLineTextView;
    }
}
