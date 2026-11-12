package com.xiaomi.fitness.device.manager;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.internal.extetions.LogExtKt;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\t\u001a\u00020\nH\u0010¢\u0006\u0002\b\u000bJ\b\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\bH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/device/manager/BaseProductManager;", "T", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "Lcom/xiaomi/fitness/device/manager/ProductManager;", "<init>", "()V", "mChangeListeners", "", "Lcom/xiaomi/fitness/device/manager/OnProductChangeListener;", LoginPreferenceConfig.TYPE_REGISTER, "", "register$device_manager_release", CervicalMucusRecord.Appearance.CLEAR, "addProductChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeProductChangeListener", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseProductManager<T extends Product> implements ProductManager<T> {

    @NotNull
    private final List<OnProductChangeListener> mChangeListeners = new ArrayList();

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.BaseProductManager$addProductChangeListener$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.BaseProductManager$addProductChangeListener$1", f = "BaseProductManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OnProductChangeListener $listener;
        int label;
        final /* synthetic */ BaseProductManager<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseProductManager<T> baseProductManager, OnProductChangeListener onProductChangeListener, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = baseProductManager;
            this.$listener = onProductChangeListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$listener, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((BaseProductManager) this.this$0).mChangeListeners.add(this.$listener);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.BaseProductManager$removeProductChangeListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.BaseProductManager$removeProductChangeListener$1", f = "BaseProductManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C18931 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OnProductChangeListener $listener;
        int label;
        final /* synthetic */ BaseProductManager<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18931(BaseProductManager<T> baseProductManager, OnProductChangeListener onProductChangeListener, Continuation<? super C18931> continuation) {
            super(2, continuation);
            this.this$0 = baseProductManager;
            this.$listener = onProductChangeListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C18931(this.this$0, this.$listener, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((BaseProductManager) this.this$0).mChangeListeners.remove(this.$listener);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public BaseProductManager() {
        register$device_manager_release();
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    public void addProductChangeListener(@NotNull OnProductChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        LogExtKt.logi("ProductManagerImpl addProductChangeListener " + listener);
        AnyExtKt.main$default(null, new AnonymousClass1(this, listener, null), 1, null);
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    public void clear() {
    }

    public void register$device_manager_release() {
        ProductManagerImpl.INSTANCE.getManagers$device_manager_release().add(this);
    }

    @Override // com.xiaomi.fitness.device.manager.ProductManager
    public void removeProductChangeListener(@NotNull OnProductChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        AnyExtKt.main$default(null, new C18931(this, listener, null), 1, null);
    }
}
