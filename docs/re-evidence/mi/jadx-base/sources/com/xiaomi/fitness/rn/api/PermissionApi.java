package com.xiaomi.fitness.rn.api;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.rn.api.PermissionApi;
import com.xiaomi.fitness.rn.extetions.ActivityExtKt;
import com.xiaomi.fitness.rn.extetions.RNLogKt;
import com.xiaomi.fitness.rn.ui.TransparentActivity;
import defpackage.u0j;
import defpackage.zvc;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/rn/api/PermissionApi;", "Lzvc;", "Landroid/app/Activity;", LifecycleConstantKt.TYPE_ACTIVITY, "", "isFragmentActivity", "Lzvc$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "requestPermission", "(Landroid/app/Activity;ZLzvc$a;)V", "checkBluetoothPermission", "(Landroid/app/Activity;Lzvc$a;)V", "<init>", "()V", "Companion", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class PermissionApi implements zvc {

    @NotNull
    public static final String sTag = "PermissionApi";

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.api.PermissionApi$checkBluetoothPermission$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.rn.api.PermissionApi$checkBluetoothPermission$1", f = "PermissionApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ boolean $isFragmentActivity;
        final /* synthetic */ zvc.a $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Activity activity, boolean z, zvc.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activity = activity;
            this.$isFragmentActivity = z;
            this.$listener = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PermissionApi.this.new AnonymousClass1(this.$activity, this.$isFragmentActivity, this.$listener, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PermissionApi.this.requestPermission(this.$activity, this.$isFragmentActivity, this.$listener);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestPermission(final Activity activity, boolean isFragmentActivity, final zvc.a listener) {
        if (activity != null) {
            if (!isFragmentActivity) {
                TransparentActivity.INSTANCE.setListener(listener);
                activity.startActivity(new Intent(activity, (Class<?>) TransparentActivity.class));
                return;
            }
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            if (Build.VERSION.SDK_INT >= 31) {
                if (!PermissionExtKt.isPermissionGranted(activity, "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT")) {
                    ActivityExtKt.showPermissionDialog(fragmentActivity, new String[]{activity.getString(u0j.g), activity.getString(u0j.g)}, new Function0() { // from class: nrh
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PermissionApi.requestPermission$lambda$12$lambda$0(listener);
                        }
                    }, new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"}, new Function1() { // from class: orh
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return PermissionApi.requestPermission$lambda$12$lambda$5(listener, activity, (MultiplePermissionsBuilder) obj);
                        }
                    });
                    return;
                }
                RNLogKt.logi(sTag, "checkBluetoothPermission onGranted");
                if (listener != null) {
                    listener.onGranted();
                    return;
                }
                return;
            }
            if (!PermissionExtKt.isPermissionGranted(activity, "android.permission.ACCESS_FINE_LOCATION")) {
                ActivityExtKt.showPermissionDialog(fragmentActivity, new String[]{activity.getString(u0j.h)}, new Function0() { // from class: erh
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PermissionApi.requestPermission$lambda$12$lambda$6(listener);
                    }
                }, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, new Function1() { // from class: frh
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return PermissionApi.requestPermission$lambda$12$lambda$11(listener, activity, (MultiplePermissionsBuilder) obj);
                    }
                });
                return;
            }
            RNLogKt.logi(sTag, "checkBluetoothPermission onGranted");
            if (listener != null) {
                listener.onGranted();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermission$lambda$12$lambda$0(zvc.a aVar) {
        RNLogKt.logi(sTag, "checkBluetoothPermission onDenied");
        if (aVar != null) {
            aVar.onDenied();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermission$lambda$12$lambda$11(final zvc.a aVar, final Activity activity, MultiplePermissionsBuilder showPermissionDialog) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(showPermissionDialog, "$this$showPermissionDialog");
        showPermissionDialog.allGranted(new Function0() { // from class: drh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PermissionApi.requestPermission$lambda$12$lambda$11$lambda$7(aVar);
            }
        });
        showPermissionDialog.denied(new Function1() { // from class: grh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PermissionApi.requestPermission$lambda$12$lambda$11$lambda$10(activity, aVar, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermission$lambda$12$lambda$11$lambda$10(final Activity activity, final zvc.a aVar, List it) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(it, "it");
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), "android.permission.ACCESS_FINE_LOCATION", activity, it, null, new Function0() { // from class: hrh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PermissionApi.requestPermission$lambda$12$lambda$11$lambda$10$lambda$8(aVar);
            }
        }, new Function0() { // from class: irh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PermissionApi.requestPermission$lambda$12$lambda$11$lambda$10$lambda$9(activity);
            }
        }, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermission$lambda$12$lambda$11$lambda$10$lambda$8(zvc.a aVar) {
        RNLogKt.logi(sTag, "checkBluetoothPermission onDenied");
        if (aVar == null) {
            return null;
        }
        aVar.onDenied();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermission$lambda$12$lambda$11$lambda$10$lambda$9(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        ActivityExtKt.permissionFromSetting$default((FragmentActivity) activity, "android.permission.ACCESS_FINE_LOCATION", u0j.h, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermission$lambda$12$lambda$11$lambda$7(zvc.a aVar) {
        RNLogKt.logi(sTag, "checkBluetoothPermission onGranted");
        if (aVar != null) {
            aVar.onGranted();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermission$lambda$12$lambda$5(final zvc.a aVar, final Activity activity, MultiplePermissionsBuilder showPermissionDialog) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(showPermissionDialog, "$this$showPermissionDialog");
        showPermissionDialog.allGranted(new Function0() { // from class: jrh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PermissionApi.requestPermission$lambda$12$lambda$5$lambda$1(aVar);
            }
        });
        showPermissionDialog.denied(new Function1() { // from class: krh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PermissionApi.requestPermission$lambda$12$lambda$5$lambda$4(activity, aVar, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermission$lambda$12$lambda$5$lambda$1(zvc.a aVar) {
        RNLogKt.logi(sTag, "checkBluetoothPermission onGranted");
        if (aVar != null) {
            aVar.onGranted();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermission$lambda$12$lambda$5$lambda$4(final Activity activity, final zvc.a aVar, List it) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(it, "it");
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), "android.permission.BLUETOOTH_SCAN", activity, it, null, new Function0() { // from class: lrh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PermissionApi.requestPermission$lambda$12$lambda$5$lambda$4$lambda$2(aVar);
            }
        }, new Function0() { // from class: mrh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PermissionApi.requestPermission$lambda$12$lambda$5$lambda$4$lambda$3(activity);
            }
        }, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermission$lambda$12$lambda$5$lambda$4$lambda$2(zvc.a aVar) {
        RNLogKt.logi(sTag, "checkBluetoothPermission onDenied");
        if (aVar == null) {
            return null;
        }
        aVar.onDenied();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermission$lambda$12$lambda$5$lambda$4$lambda$3(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        ActivityExtKt.permissionFromSetting$default((FragmentActivity) activity, "android.permission.BLUETOOTH_SCAN", u0j.g, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermission$lambda$12$lambda$6(zvc.a aVar) {
        if (aVar != null) {
            aVar.onDenied();
        }
        RNLogKt.logi(sTag, "checkBluetoothPermission onDenied");
        return Unit.INSTANCE;
    }

    @Override // defpackage.zvc
    public void checkBluetoothPermission(@Nullable Activity activity, @Nullable zvc.a listener) {
        boolean z = activity instanceof FragmentActivity;
        RNLogKt.logi(sTag, "checkBluetoothPermission start " + z);
        try {
            AnyExtKt.main$default(null, new AnonymousClass1(activity, z, listener, null), 1, null);
        } catch (Exception unused) {
        }
    }
}
