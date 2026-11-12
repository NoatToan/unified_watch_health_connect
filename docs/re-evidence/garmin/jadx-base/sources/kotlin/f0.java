package kotlin;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import b5.a;
import b5.b;
import b5.w;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Li5/f0;", "", "<init>", "()V", "Landroid/view/View;", "view", "Lb5/w;", "icon", "", "a", "(Landroid/view/View;Lb5/w;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f91175a = new f0();

    private f0() {
    }

    public final void a(View view2, w icon) {
        PointerIcon systemIcon;
        Context context = view2.getContext();
        if (icon instanceof a) {
            systemIcon = ((a) icon).f15747b;
        } else {
            systemIcon = icon instanceof b ? PointerIcon.getSystemIcon(context, ((b) icon).f15765b) : PointerIcon.getSystemIcon(context, 1000);
        }
        if (s.g(view2.getPointerIcon(), systemIcon)) {
            return;
        }
        view2.setPointerIcon(systemIcon);
    }
}
