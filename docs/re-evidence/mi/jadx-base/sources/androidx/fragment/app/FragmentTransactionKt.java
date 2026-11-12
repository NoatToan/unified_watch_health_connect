package androidx.fragment.app;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aB\u0010\t\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0086\b¢\u0006\u0004\b\t\u0010\n\u001a4\u0010\t\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0086\b¢\u0006\u0004\b\t\u0010\u000b\u001aB\u0010\f\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0086\b¢\u0006\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Landroidx/fragment/app/Fragment;", "F", "Landroidx/fragment/app/k;", "", "containerViewId", "", "tag", "Landroid/os/Bundle;", "args", "add", "(Landroidx/fragment/app/k;ILjava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/k;", "(Landroidx/fragment/app/k;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/k;", "replace", "fragment-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class FragmentTransactionKt {
    public static final /* synthetic */ <F extends Fragment> k add(k kVar, int i, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.reifiedOperationMarker(4, "F");
        k kVarD = kVar.d(i, Fragment.class, bundle, str);
        Intrinsics.checkNotNullExpressionValue(kVarD, "add(containerViewId, F::class.java, args, tag)");
        return kVarD;
    }

    public static /* synthetic */ k add$default(k kVar, int i, String str, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.reifiedOperationMarker(4, "F");
        k kVarD = kVar.d(i, Fragment.class, bundle, str);
        Intrinsics.checkNotNullExpressionValue(kVarD, "add(containerViewId, F::class.java, args, tag)");
        return kVarD;
    }

    public static final /* synthetic */ <F extends Fragment> k replace(k kVar, int i, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.reifiedOperationMarker(4, "F");
        k kVarY = kVar.y(i, Fragment.class, bundle, str);
        Intrinsics.checkNotNullExpressionValue(kVarY, "replace(containerViewId, F::class.java, args, tag)");
        return kVarY;
    }

    public static /* synthetic */ k replace$default(k kVar, int i, String str, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.reifiedOperationMarker(4, "F");
        k kVarY = kVar.y(i, Fragment.class, bundle, str);
        Intrinsics.checkNotNullExpressionValue(kVarY, "replace(containerViewId, F::class.java, args, tag)");
        return kVarY;
    }

    public static final /* synthetic */ <F extends Fragment> k add(k kVar, String tag, Bundle bundle) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.reifiedOperationMarker(4, "F");
        k kVarG = kVar.g(Fragment.class, bundle, tag);
        Intrinsics.checkNotNullExpressionValue(kVarG, "add(F::class.java, args, tag)");
        return kVarG;
    }

    public static /* synthetic */ k add$default(k kVar, String tag, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.reifiedOperationMarker(4, "F");
        k kVarG = kVar.g(Fragment.class, bundle, tag);
        Intrinsics.checkNotNullExpressionValue(kVarG, "add(F::class.java, args, tag)");
        return kVarG;
    }
}
