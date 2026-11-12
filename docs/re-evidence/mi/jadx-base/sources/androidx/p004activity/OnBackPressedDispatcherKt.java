package androidx.p004activity;

import androidx.lifecycle.LifecycleOwner;
import com.miui.tsmclient.entity.CardInfo;
import defpackage.p7h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\n\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, "", "enabled", "Lkotlin/Function1;", "Lp7h;", "", "Lkotlin/ExtensionFunctionType;", "onBackPressed", "addCallback", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function1;)Lp7h;", "activity-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class OnBackPressedDispatcherKt {
    @NotNull
    public static final p7h addCallback(@NotNull OnBackPressedDispatcher onBackPressedDispatcher, @Nullable LifecycleOwner lifecycleOwner, final boolean z, @NotNull final Function1<? super p7h, Unit> onBackPressed) {
        Intrinsics.checkNotNullParameter(onBackPressedDispatcher, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        p7h p7hVar = new p7h(z) { // from class: androidx.activity.OnBackPressedDispatcherKt$addCallback$callback$1
            @Override // defpackage.p7h
            public void handleOnBackPressed() {
                onBackPressed.invoke(this);
            }
        };
        if (lifecycleOwner != null) {
            onBackPressedDispatcher.b(lifecycleOwner, p7hVar);
        } else {
            onBackPressedDispatcher.a(p7hVar);
        }
        return p7hVar;
    }

    public static /* synthetic */ p7h addCallback$default(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            lifecycleOwner = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return addCallback(onBackPressedDispatcher, lifecycleOwner, z, function1);
    }
}
