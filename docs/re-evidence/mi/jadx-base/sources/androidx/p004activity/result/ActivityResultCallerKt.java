package androidx.p004activity.result;

import androidx.p004activity.result.ActivityResultCallerKt;
import androidx.p004activity.result.contract.ActivityResultContract;
import defpackage.ln0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\r\u001aS\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"I", "O", "Lln0;", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "input", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "Lkotlin/Function1;", "", "callback", "Landroidx/activity/result/ActivityResultLauncher;", "registerForActivityResult", "(Lln0;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/activity/result/ActivityResultRegistry;Lkotlin/jvm/functions/Function1;)Landroidx/activity/result/ActivityResultLauncher;", "(Lln0;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Landroidx/activity/result/ActivityResultLauncher;", "activity-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class ActivityResultCallerKt {
    @NotNull
    public static final <I, O> ActivityResultLauncher<Unit> registerForActivityResult(@NotNull ln0 ln0Var, @NotNull ActivityResultContract<I, O> contract, I i, @NotNull ActivityResultRegistry registry, @NotNull final Function1<? super O, Unit> callback) {
        Intrinsics.checkNotNullParameter(ln0Var, "<this>");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ActivityResultLauncher<I> activityResultLauncherRegisterForActivityResult = ln0Var.registerForActivityResult(contract, registry, new ActivityResultCallback() { // from class: mn0
            @Override // androidx.p004activity.result.ActivityResultCallback
            public final void a(Object obj) {
                ActivityResultCallerKt.m3registerForActivityResult$lambda0(callback, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResul…egistry) { callback(it) }");
        return new ActivityResultCallerLauncher(activityResultLauncherRegisterForActivityResult, contract, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: registerForActivityResult$lambda-0, reason: not valid java name */
    public static final void m3registerForActivityResult$lambda0(Function1 callback, Object obj) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: registerForActivityResult$lambda-1, reason: not valid java name */
    public static final void m4registerForActivityResult$lambda1(Function1 callback, Object obj) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke2(obj);
    }

    @NotNull
    public static final <I, O> ActivityResultLauncher<Unit> registerForActivityResult(@NotNull ln0 ln0Var, @NotNull ActivityResultContract<I, O> contract, I i, @NotNull final Function1<? super O, Unit> callback) {
        Intrinsics.checkNotNullParameter(ln0Var, "<this>");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ActivityResultLauncher<I> activityResultLauncherRegisterForActivityResult = ln0Var.registerForActivityResult(contract, new ActivityResultCallback() { // from class: nn0
            @Override // androidx.p004activity.result.ActivityResultCallback
            public final void a(Object obj) {
                ActivityResultCallerKt.m4registerForActivityResult$lambda1(callback, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResul…ontract) { callback(it) }");
        return new ActivityResultCallerLauncher(activityResultLauncherRegisterForActivityResult, contract, i);
    }
}
