package androidx.core.view;

import android.view.ViewParent;
import defpackage.zcn;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final /* synthetic */ class ViewKt$ancestors$1 extends zcn implements Function1<ViewParent, ViewParent> {
    public static final ViewKt$ancestors$1 INSTANCE = new ViewKt$ancestors$1();

    @Override // kotlin.jvm.functions.Function1
    public final ViewParent invoke(ViewParent viewParent) {
        return viewParent.getParent();
    }

    ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }
}
