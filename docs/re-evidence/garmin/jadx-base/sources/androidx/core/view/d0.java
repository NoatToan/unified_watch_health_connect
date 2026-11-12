package androidx.core.view;

import android.content.Context;
import android.view.PointerIcon;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointerIcon f6411a;

    private d0(PointerIcon pointerIcon) {
        this.f6411a = pointerIcon;
    }

    public static d0 a(Context context) {
        return new d0(PointerIcon.getSystemIcon(context, 1002));
    }
}
