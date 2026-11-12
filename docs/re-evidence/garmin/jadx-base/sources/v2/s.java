package v2;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv2/s;", "Lv2/r;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class s extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseInputConnection f175160c;

    public s(View view2) {
        super(view2);
    }

    @Override // v2.q
    public void sendKeyEvent(KeyEvent keyEvent) {
        BaseInputConnection baseInputConnection = this.f175160c;
        if (baseInputConnection == null) {
            baseInputConnection = new BaseInputConnection(this.f175148a, false);
            this.f175160c = baseInputConnection;
        }
        baseInputConnection.sendKeyEvent(keyEvent);
    }
}
