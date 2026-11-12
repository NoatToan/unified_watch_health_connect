package com.xiaomi.fitness.device.manager.extensions;

import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.extensions.BluetoothExtKt;
import com.xiaomi.miot.core.bluetooth.BluetoothManager;
import defpackage.a33;
import defpackage.s33;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a;\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032#\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032#\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\"\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"openBluetooth", "", "success", "Lkotlin/Function0;", "fail", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "code", "opening", "", "getOpening", "()Z", "setOpening", "(Z)V", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BluetoothExtKt {
    private static volatile boolean opening;

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.extensions.BluetoothExtKt$openBluetooth$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.extensions.BluetoothExtKt$openBluetooth$1", f = "BluetoothExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Integer, Unit> $fail;
        final /* synthetic */ BluetoothExtKt$openBluetooth$listener$1 $listener;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.extensions.BluetoothExtKt$openBluetooth$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.device.manager.extensions.BluetoothExtKt$openBluetooth$1$1", f = "BluetoothExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Integer, Unit> $fail;
            final /* synthetic */ BluetoothExtKt$openBluetooth$listener$1 $listener;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04261(Function1<? super Integer, Unit> function1, BluetoothExtKt$openBluetooth$listener$1 bluetoothExtKt$openBluetooth$listener$1, Continuation<? super C04261> continuation) {
                super(2, continuation);
                this.$fail = function1;
                this.$listener = bluetoothExtKt$openBluetooth$listener$1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04261(this.$fail, this.$listener, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Logger.i("refuse to open bluetooth", new Object[0]);
                Function1<Integer, Unit> function1 = this.$fail;
                if (function1 != null) {
                    function1.invoke2(Boxing.boxInt(109));
                }
                BluetoothManager.INSTANCE.get().removeBluetoothStateListener(this.$listener);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super Integer, Unit> function1, BluetoothExtKt$openBluetooth$listener$1 bluetoothExtKt$openBluetooth$listener$1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$fail = function1;
            this.$listener = bluetoothExtKt$openBluetooth$listener$1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$fail, this.$listener, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (s33.f()) {
                Logger.i("open bluetooth success", new Object[0]);
            } else {
                AnyExtKt.main$default(null, new C04261(this.$fail, this.$listener, null), 1, null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final boolean getOpening() {
        return opening;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [a33, com.xiaomi.fitness.device.manager.extensions.BluetoothExtKt$openBluetooth$listener$1] */
    public static final void openBluetooth(@Nullable final Function0<Unit> function0, @Nullable final Function1<? super Integer, Unit> function1) {
        if (!s33.e()) {
            ?? r0 = new a33() { // from class: com.xiaomi.fitness.device.manager.extensions.BluetoothExtKt$openBluetooth$listener$1
                @Override // defpackage.a33
                public void onStateChanged(int state) {
                    Logger.i("bluetooth state is changed to " + state, new Object[0]);
                    BluetoothManager.INSTANCE.get().removeBluetoothStateListener(this);
                    if (state == 12) {
                        Function0<Unit> function2 = function0;
                        if (function2 != null) {
                            function2.invoke();
                            return;
                        }
                        return;
                    }
                    Function1<Integer, Unit> function3 = function1;
                    if (function3 != null) {
                        function3.invoke2(109);
                    }
                }
            };
            BluetoothManager.INSTANCE.get().addBluetoothStateListener(r0);
            AnyExtKt.io$default(null, new AnonymousClass1(function1, r0, null), 1, null);
        } else {
            Logger.i("Bluetooth is enabled", new Object[0]);
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openBluetooth$lambda$1(Ref.ObjectRef successCallback, Ref.ObjectRef failCallback, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(successCallback, "$successCallback");
        Intrinsics.checkNotNullParameter(failCallback, "$failCallback");
        if (i == -1) {
            Function0 function0 = (Function0) successCallback.element;
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            Function1 function1 = (Function1) failCallback.element;
            if (function1 != null) {
                function1.invoke2(109);
            }
        }
        opening = false;
        return Unit.INSTANCE;
    }

    public static final void setOpening(boolean z) {
        opening = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void openBluetooth(@NotNull BaseActivity activity, @Nullable Function0<Unit> function0, @Nullable Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = function0;
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = function1;
        if (s33.e()) {
            Logger.i("Bluetooth is enabled", new Object[0]);
            Function0 function2 = (Function0) objectRef.element;
            if (function2 != null) {
                function2.invoke();
            }
            opening = false;
            return;
        }
        Logger.e("BluetoothExt", "openBluetooth: " + opening, new Exception());
        if (opening) {
            Function1 function3 = (Function1) objectRef2.element;
            if (function3 != null) {
                function3.invoke2(0);
                return;
            }
            return;
        }
        opening = true;
        ExecutorHelper.INSTANCE.getMainHandler().postDelayed(new Runnable() { // from class: d23
            @Override // java.lang.Runnable
            public final void run() {
                BluetoothExtKt.opening = false;
            }
        }, 3000L);
        final Lifecycle lifecycle = activity.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.xiaomi.fitness.device.manager.extensions.BluetoothExtKt.openBluetooth.3
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    objectRef.element = null;
                    objectRef2.element = null;
                    lifecycle.removeObserver(this);
                    BluetoothExtKt.setOpening(false);
                }
            }
        });
        try {
            activity.startForActivityResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), new Function2() { // from class: e23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BluetoothExtKt.openBluetooth$lambda$1(objectRef, objectRef2, ((Integer) obj).intValue(), (Intent) obj2);
                }
            });
        } catch (Throwable th) {
            Logger.i("open bluetooth fail", th);
            Function1 function4 = (Function1) objectRef2.element;
            if (function4 != null) {
                function4.invoke2(109);
            }
            opening = false;
        }
    }
}
