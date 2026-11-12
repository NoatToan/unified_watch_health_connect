package coil.request;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import coil.request.GlobalLifecycle;
import com.miui.tsmclient.entity.CardInfo;
import defpackage.nfe;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcoil/request/GlobalLifecycle;", "Landroidx/lifecycle/Lifecycle;", "Lnfe;", "observer", "", "addObserver", "(Lnfe;)V", "removeObserver", "Landroidx/lifecycle/Lifecycle$State;", "getCurrentState", "()Landroidx/lifecycle/Lifecycle$State;", "", "toString", "()Ljava/lang/String;", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class GlobalLifecycle extends Lifecycle {

    @NotNull
    public static final GlobalLifecycle INSTANCE = new GlobalLifecycle();

    @NotNull
    private static final LifecycleOwner owner = new LifecycleOwner() { // from class: p0b
        @Override // androidx.lifecycle.LifecycleOwner
        public final Lifecycle getLifecycle() {
            return GlobalLifecycle.INSTANCE;
        }
    };

    private GlobalLifecycle() {
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(@NotNull nfe observer) {
        if (!(observer instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((observer + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) observer;
        LifecycleOwner lifecycleOwner = owner;
        defaultLifecycleObserver.onCreate(lifecycleOwner);
        defaultLifecycleObserver.onStart(lifecycleOwner);
        defaultLifecycleObserver.onResume(lifecycleOwner);
    }

    @Override // androidx.lifecycle.Lifecycle
    @NotNull
    /* JADX INFO: renamed from: getCurrentState */
    public Lifecycle.State getState() {
        return Lifecycle.State.RESUMED;
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(@NotNull nfe observer) {
    }

    @NotNull
    public String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
