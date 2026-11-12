package com.xiaomi.fitness.component;

import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.component.AppComponentDelegate;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\n\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH&J\"\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H&R\u001b\u0010\u0005\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/component/AppComponentDelegate;", "T", "", "<init>", "()V", "singleton", "getSingleton", "()Ljava/lang/Object;", "singleton$delegate", "Lkotlin/Lazy;", "createAppComponent", "performTask", "", "appContext", "taskId", "", "callTask", "methodName", "", SdkContants.KEY_BUNDLE, "component-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AppComponentDelegate<T> {

    /* JADX INFO: renamed from: singleton$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy singleton = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: uf1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppComponentDelegate.singleton_delegate$lambda$0(this.f35699a);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object singleton_delegate$lambda$0(AppComponentDelegate this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.createAppComponent();
    }

    @NotNull
    public abstract Object callTask(@NotNull Object appContext, @NotNull String methodName, @Nullable Object bundle) throws Exception;

    public abstract T createAppComponent();

    public final T getSingleton() {
        return (T) this.singleton.getValue();
    }

    public abstract void performTask(@NotNull Object appContext, int taskId) throws Exception;
}
