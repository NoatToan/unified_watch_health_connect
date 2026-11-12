package v2;

import android.view.KeyEvent;
import android.view.View;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0013\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv2/t;", "Lv2/s;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class t extends s {
    public t(View view2) {
        super(view2);
    }

    @Override // v2.s, v2.q
    public final void sendKeyEvent(KeyEvent keyEvent) {
        d().dispatchKeyEventFromInputMethod(this.f175148a, keyEvent);
    }
}
