package androidx.core.view;

import android.view.ViewParent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class c1 extends p005kotlin.jvm.internal.q implements e23.l<ViewParent, ViewParent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c1 f6410a = new c1();

    public c1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // e23.l
    public final ViewParent invoke(ViewParent viewParent) {
        return viewParent.getParent();
    }
}
