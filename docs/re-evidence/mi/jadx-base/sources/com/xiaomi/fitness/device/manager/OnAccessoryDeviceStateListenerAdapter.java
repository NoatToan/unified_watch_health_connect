package com.xiaomi.fitness.device.manager;

import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.device.manager.export.OnAccessoryDeviceStateListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/device/manager/OnAccessoryDeviceStateListenerAdapter;", "Lcom/xiaomi/fitness/device/manager/f$a;", "", "did", "", "mode", "", Constants.EXTRA_FROM_APP, "", "onAccessoryDeviceModeChange", "(Ljava/lang/String;IZ)V", "onAccessoryDeviceModeDuplicate", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/xiaomi/fitness/device/manager/export/OnAccessoryDeviceStateListener;", "mListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "<init>", "(Ljava/util/concurrent/CopyOnWriteArrayList;)V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class OnAccessoryDeviceStateListenerAdapter extends f.a {

    @NotNull
    private final CopyOnWriteArrayList<OnAccessoryDeviceStateListener> mListeners;

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.OnAccessoryDeviceStateListenerAdapter$onAccessoryDeviceModeChange$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.OnAccessoryDeviceStateListenerAdapter$onAccessoryDeviceModeChange$1", f = "OnAccessoryDeviceStateListenerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOnAccessoryDeviceStateListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnAccessoryDeviceStateListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnAccessoryDeviceStateListenerAdapter$onAccessoryDeviceModeChange$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,26:1\n1863#2,2:27\n*S KotlinDebug\n*F\n+ 1 OnAccessoryDeviceStateListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnAccessoryDeviceStateListenerAdapter$onAccessoryDeviceModeChange$1\n*L\n13#1:27,2\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ boolean $fromApp;
        final /* synthetic */ int $mode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, int i, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$mode = i;
            this.$fromApp = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnAccessoryDeviceStateListenerAdapter.this.new AnonymousClass1(this.$did, this.$mode, this.$fromApp, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CopyOnWriteArrayList copyOnWriteArrayList = OnAccessoryDeviceStateListenerAdapter.this.mListeners;
            String str = this.$did;
            int i = this.$mode;
            boolean z = this.$fromApp;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((OnAccessoryDeviceStateListener) it.next()).onAccessoryDeviceModeChange(str, i, z);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.OnAccessoryDeviceStateListenerAdapter$onAccessoryDeviceModeDuplicate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.OnAccessoryDeviceStateListenerAdapter$onAccessoryDeviceModeDuplicate$1", f = "OnAccessoryDeviceStateListenerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOnAccessoryDeviceStateListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnAccessoryDeviceStateListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnAccessoryDeviceStateListenerAdapter$onAccessoryDeviceModeDuplicate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,26:1\n1863#2,2:27\n*S KotlinDebug\n*F\n+ 1 OnAccessoryDeviceStateListenerAdapter.kt\ncom/xiaomi/fitness/device/manager/OnAccessoryDeviceStateListenerAdapter$onAccessoryDeviceModeDuplicate$1\n*L\n21#1:27,2\n*E\n"})
    public static final class C18991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ boolean $fromApp;
        final /* synthetic */ int $mode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18991(String str, int i, boolean z, Continuation<? super C18991> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$mode = i;
            this.$fromApp = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnAccessoryDeviceStateListenerAdapter.this.new C18991(this.$did, this.$mode, this.$fromApp, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CopyOnWriteArrayList copyOnWriteArrayList = OnAccessoryDeviceStateListenerAdapter.this.mListeners;
            String str = this.$did;
            int i = this.$mode;
            boolean z = this.$fromApp;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((OnAccessoryDeviceStateListener) it.next()).onAccessoryDeviceModeDuplicate(str, i, z);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public OnAccessoryDeviceStateListenerAdapter(@NotNull CopyOnWriteArrayList<OnAccessoryDeviceStateListener> mListeners) {
        Intrinsics.checkNotNullParameter(mListeners, "mListeners");
        this.mListeners = mListeners;
    }

    @Override // com.xiaomi.fitness.device.manager.f
    public void onAccessoryDeviceModeChange(@Nullable String did, int mode, boolean fromApp) {
        AnyExtKt.main$default(null, new AnonymousClass1(did, mode, fromApp, null), 1, null);
    }

    @Override // com.xiaomi.fitness.device.manager.f
    public void onAccessoryDeviceModeDuplicate(@Nullable String did, int mode, boolean fromApp) {
        AnyExtKt.main$default(null, new C18991(did, mode, fromApp, null), 1, null);
    }
}
