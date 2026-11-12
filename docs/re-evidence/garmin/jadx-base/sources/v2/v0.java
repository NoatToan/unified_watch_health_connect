package v2;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv2/v0;", "Lv2/u0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v0 implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f175183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f175184b = o13.m.a(o13.n.NONE, new ty1.f1(this, 22));

    public v0(View view2) {
        this.f175183a = view2;
        new androidx.core.view.h0(view2);
    }

    @Override // v2.u0
    public final void a(int i14, int i15, int i16, int i17) {
        d().updateSelection(this.f175183a, i14, i15, i16, i17);
    }

    @Override // v2.u0
    public final void b() {
        d().restartInput(this.f175183a);
    }

    @Override // v2.u0
    public final void c() {
        if (Build.VERSION.SDK_INT >= 34) {
            n nVar = n.f175098a;
            InputMethodManager inputMethodManagerD = d();
            nVar.getClass();
            inputMethodManagerD.startStylusHandwriting(this.f175183a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final InputMethodManager d() {
        return (InputMethodManager) this.f175184b.getValue();
    }

    @Override // v2.u0
    public final boolean isActive() {
        return d().isActive(this.f175183a);
    }

    @Override // v2.u0
    public final void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        d().updateCursorAnchorInfo(this.f175183a, cursorAnchorInfo);
    }

    @Override // v2.u0
    public final void updateExtractedText(int i14, ExtractedText extractedText) {
        d().updateExtractedText(this.f175183a, i14, extractedText);
    }
}
