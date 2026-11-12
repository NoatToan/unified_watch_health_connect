package x5;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lx5/t;", "Lx5/s;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f188944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f188945b = o13.m.a(o13.n.NONE, new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.core.view.h0 f188946c;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/inputmethod/InputMethodManager;", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends p005kotlin.jvm.internal.w implements e23.a<InputMethodManager> {
        public a() {
            super(0);
        }

        @Override // e23.a
        public final InputMethodManager invoke() {
            Object systemService = t.this.f188944a.getContext().getSystemService("input_method");
            systemService.getClass();
            return (InputMethodManager) systemService;
        }
    }

    public t(View view2) {
        this.f188944a = view2;
        this.f188946c = new androidx.core.view.h0(view2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // x5.s
    public final void a(int i14, int i15, int i16, int i17) {
        ((InputMethodManager) this.f188945b.getValue()).updateSelection(this.f188944a, i14, i15, i16, i17);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // x5.s
    public final void b() {
        ((InputMethodManager) this.f188945b.getValue()).restartInput(this.f188944a);
    }

    @Override // x5.s
    public final void c() {
        this.f188946c.f6451a.a();
    }

    @Override // x5.s
    public final void d() {
        this.f188946c.f6451a.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // x5.s
    public final boolean isActive() {
        return ((InputMethodManager) this.f188945b.getValue()).isActive(this.f188944a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // x5.s
    public final void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        ((InputMethodManager) this.f188945b.getValue()).updateCursorAnchorInfo(this.f188944a, cursorAnchorInfo);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // x5.s
    public final void updateExtractedText(int i14, ExtractedText extractedText) {
        ((InputMethodManager) this.f188945b.getValue()).updateExtractedText(this.f188944a, i14, extractedText);
    }
}
