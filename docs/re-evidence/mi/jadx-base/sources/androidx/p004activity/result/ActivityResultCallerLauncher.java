package androidx.p004activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.p004activity.result.contract.ActivityResultContract;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import defpackage.hn0;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B1\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0016\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R'\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000e¨\u0006 "}, d2 = {"Landroidx/activity/result/ActivityResultCallerLauncher;", "I", "O", "Landroidx/activity/result/ActivityResultLauncher;", "", "input", "Lhn0;", "options", "launch", "(Lkotlin/Unit;Lhn0;)V", "unregister", "()V", "Landroidx/activity/result/contract/ActivityResultContract;", "getContract", "()Landroidx/activity/result/contract/ActivityResultContract;", Feature.LAUNCHER, "Landroidx/activity/result/ActivityResultLauncher;", "getLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "callerContract", "Landroidx/activity/result/contract/ActivityResultContract;", "getCallerContract", "callerInput", "Ljava/lang/Object;", "getCallerInput", "()Ljava/lang/Object;", "resultContract$delegate", "Lkotlin/Lazy;", "getResultContract", "resultContract", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;)V", "activity-ktx_release"}, k = 1, mv = {1, 6, 0})
public final class ActivityResultCallerLauncher<I, O> extends ActivityResultLauncher<Unit> {

    @NotNull
    private final ActivityResultContract<I, O> callerContract;
    private final I callerInput;

    @NotNull
    private final ActivityResultLauncher<I> launcher;

    /* JADX INFO: renamed from: resultContract$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy resultContract;

    public ActivityResultCallerLauncher(@NotNull ActivityResultLauncher<I> launcher, @NotNull ActivityResultContract<I, O> callerContract, I i) {
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        Intrinsics.checkNotNullParameter(callerContract, "callerContract");
        this.launcher = launcher;
        this.callerContract = callerContract;
        this.callerInput = i;
        this.resultContract = LazyKt__LazyJVMKt.lazy(new Function0<ActivityResultCallerLauncher$resultContract$2.AnonymousClass1>(this) { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2
            final /* synthetic */ ActivityResultCallerLauncher<I, O> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v0, types: [androidx.activity.result.ActivityResultCallerLauncher$resultContract$2$1] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AnonymousClass1 invoke() {
                final ActivityResultCallerLauncher<I, O> activityResultCallerLauncher = this.this$0;
                return new ActivityResultContract<Unit, O>() { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2.1
                    @Override // androidx.p004activity.result.contract.ActivityResultContract
                    public O parseResult(int resultCode, @Nullable Intent intent) {
                        return (O) activityResultCallerLauncher.getCallerContract().parseResult(resultCode, intent);
                    }

                    @Override // androidx.p004activity.result.contract.ActivityResultContract
                    @NotNull
                    public Intent createIntent(@NotNull Context context, @NotNull Unit input) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(input, "input");
                        return activityResultCallerLauncher.getCallerContract().createIntent(context, activityResultCallerLauncher.getCallerInput());
                    }
                };
            }
        });
    }

    @NotNull
    public final ActivityResultContract<I, O> getCallerContract() {
        return this.callerContract;
    }

    public final I getCallerInput() {
        return this.callerInput;
    }

    @Override // androidx.p004activity.result.ActivityResultLauncher
    @NotNull
    public ActivityResultContract<Unit, ?> getContract() {
        return getResultContract();
    }

    @NotNull
    public final ActivityResultLauncher<I> getLauncher() {
        return this.launcher;
    }

    @NotNull
    public final ActivityResultContract<Unit, O> getResultContract() {
        return (ActivityResultContract) this.resultContract.getValue();
    }

    @Override // androidx.p004activity.result.ActivityResultLauncher
    public void launch(@NotNull Unit input, @Nullable hn0 options) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.launcher.launch(this.callerInput, options);
    }

    @Override // androidx.p004activity.result.ActivityResultLauncher
    public void unregister() {
        this.launcher.unregister();
    }
}
