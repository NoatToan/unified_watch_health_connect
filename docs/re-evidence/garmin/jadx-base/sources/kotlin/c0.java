package kotlin;

import android.view.View;
import k4.b;
import k4.k;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Li5/c0;", "", "<init>", "()V", "Landroid/view/View;", "view", "Lk4/k;", "transferData", "Lk4/b;", "dragShadowBuilder", "", "a", "(Landroid/view/View;Lk4/k;Lk4/b;)Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f91120a = new c0();

    private c0() {
    }

    public final boolean a(View view2, k transferData, b dragShadowBuilder) {
        return view2.startDragAndDrop(transferData.f102823a, dragShadowBuilder, transferData.f102824b, transferData.f102825c);
    }
}
