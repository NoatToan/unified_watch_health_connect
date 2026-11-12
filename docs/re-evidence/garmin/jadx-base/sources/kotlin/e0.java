package kotlin;

import android.view.View;
import com.garmin.android.gncs.telephony.b;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Li5/e0;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "b", "(Landroid/view/View;)V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f91144a = new e0();

    private e0() {
    }

    public final void a(View view2) {
        view2.clearViewTranslationCallback();
    }

    public final void b(View view2) {
        view2.setViewTranslationCallback(b.j(d0.f91131a));
    }
}
