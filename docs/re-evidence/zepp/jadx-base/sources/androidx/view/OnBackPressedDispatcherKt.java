package androidx.view;

import androidx.p008lifecycle.LifecycleOwner;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\n\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¨\u0006\u000b"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "Landroidx/lifecycle/LifecycleOwner;", DataCacher.o, "", Constants.ENABLED, "Lkotlin/Function1;", "Landroidx/activity/OnBackPressedCallback;", "", "Lkotlin/ExtensionFunctionType;", "onBackPressed", "addCallback", "activity-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class OnBackPressedDispatcherKt {
    @NotNull
    public static final OnBackPressedCallback addCallback(@NotNull OnBackPressedDispatcher onBackPressedDispatcher, @Nullable LifecycleOwner lifecycleOwner, final boolean z, @NotNull final Function1<? super OnBackPressedCallback, Unit> function1) {
        OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback(function1, z) { // from class: androidx.activity.OnBackPressedDispatcherKt$addCallback$callback$1
            public final /* synthetic */ boolean $enabled;
            public final /* synthetic */ Function1<OnBackPressedCallback, Unit> $onBackPressed;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(z);
                this.$enabled = z;
            }

            @Override // androidx.view.OnBackPressedCallback
            public void handleOnBackPressed() {
                this.$onBackPressed.invoke(this);
            }
        };
        if (lifecycleOwner != null) {
            onBackPressedDispatcher.addCallback(lifecycleOwner, onBackPressedCallback);
        } else {
            onBackPressedDispatcher.addCallback(onBackPressedCallback);
        }
        return onBackPressedCallback;
    }

    public static /* synthetic */ OnBackPressedCallback addCallback$default(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            lifecycleOwner = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return addCallback(onBackPressedDispatcher, lifecycleOwner, z, function1);
    }
}
