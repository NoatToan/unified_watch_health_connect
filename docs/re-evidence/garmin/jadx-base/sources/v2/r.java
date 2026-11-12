package v2;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv2/r;", "Lv2/q;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class r implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f175148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InputMethodManager f175149b;

    public r(View view2) {
        this.f175148a = view2;
        new androidx.core.view.h0(view2);
    }

    @Override // v2.q
    public final void a(int i14, int i15, int i16, int i17) {
        d().updateSelection(this.f175148a, i14, i15, i16, i17);
    }

    @Override // v2.q
    public final void b() {
        d().restartInput(this.f175148a);
    }

    @Override // v2.q
    public void c() {
    }

    public final InputMethodManager d() {
        InputMethodManager inputMethodManager = this.f175149b;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        Object systemService = this.f175148a.getContext().getSystemService("input_method");
        systemService.getClass();
        InputMethodManager inputMethodManager2 = (InputMethodManager) systemService;
        this.f175149b = inputMethodManager2;
        return inputMethodManager2;
    }

    @Override // v2.q
    public final void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        d().updateCursorAnchorInfo(this.f175148a, cursorAnchorInfo);
    }
}
