package androidx.lifecycle;

import com.huawei.ui.commonui.base.BaseDialog;
import defpackage.zcp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleObserver;", "onCreate", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onDestroy", BaseDialog.LIFE_CYCLE_ON_PAUSE, BaseDialog.LIFE_CYCLE_ON_RESUME, "onStart", "onStop", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DefaultLifecycleObserver extends LifecycleObserver {
    default void onStop(LifecycleOwner owner) {
        zcp.c(owner, "");
    }

    default void onStart(LifecycleOwner owner) {
        zcp.c(owner, "");
    }

    default void onResume(LifecycleOwner owner) {
        zcp.c(owner, "");
    }

    default void onPause(LifecycleOwner owner) {
        zcp.c(owner, "");
    }

    default void onDestroy(LifecycleOwner owner) {
        zcp.c(owner, "");
    }

    default void onCreate(LifecycleOwner owner) {
        zcp.c(owner, "");
    }
}
