package com.xiaomi.fitness.rn.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import androidx.appcompat.app.AppCompatActivity;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.rn.api.PermissionApi;
import com.xiaomi.fitness.rn.extetions.ActivityExtKt;
import com.xiaomi.fitness.rn.extetions.RNLogKt;
import com.xiaomi.fitness.rn.ui.TransparentActivity;
import defpackage.av6;
import defpackage.u0j;
import defpackage.zvc;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J-\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0010JH\u0010\u0011\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\r2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u0014¢\u0006\u0002\b\u0016H\u0002¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0005H\u0002J\"\u0010\u0019\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/rn/ui/TransparentActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", AccountInteractActivity.KEY_REQUEST_CODE, "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "showPermissionTipDialogIfNeed", "permissionDesc", "extension", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/common/extensions/MultiplePermissionsBuilder;", "Lkotlin/ExtensionFunctionType;", "([Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "deniedAndFinish", "onActivityResult", "resultCode", "data", "Landroid/content/Intent;", "Companion", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransparentActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static zvc.a listener;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/rn/ui/TransparentActivity$Companion;", "", "Lzvc$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lzvc$a;", "getListener", "()Lzvc$a;", "setListener", "(Lzvc$a;)V", "<init>", "()V", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final zvc.a getListener() {
            return TransparentActivity.listener;
        }

        public final void setListener(@Nullable zvc.a aVar) {
            TransparentActivity.listener = aVar;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.ui.TransparentActivity$showPermissionTipDialogIfNeed$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/rn/ui/TransparentActivity$showPermissionTipDialogIfNeed$2", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AnonymousClass2 extends av6 {
        final /* synthetic */ Function1<MultiplePermissionsBuilder, Unit> $extension;
        final /* synthetic */ String[] $permissionDesc;
        final /* synthetic */ String[] $permissions;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String[] strArr, String[] strArr2, Function1<? super MultiplePermissionsBuilder, Unit> function1) {
            this.$permissions = strArr;
            this.$permissionDesc = strArr2;
            this.$extension = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$0(Function1 extension, MultiplePermissionsBuilder permissions) {
            Intrinsics.checkNotNullParameter(extension, "$extension");
            Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
            extension.invoke2(permissions);
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            if (dialog != null) {
                dialog.dismiss();
            }
            if (which != -1) {
                TransparentActivity.this.deniedAndFinish();
                return;
            }
            TransparentActivity transparentActivity = TransparentActivity.this;
            String[] strArr = this.$permissions;
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            String[] strArr3 = this.$permissionDesc;
            final Function1<MultiplePermissionsBuilder, Unit> function1 = this.$extension;
            PermissionExtKt.permissions(transparentActivity, strArr2, strArr3, (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: w0q
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TransparentActivity.AnonymousClass2.onDialogClick$lambda$0(function1, (MultiplePermissionsBuilder) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deniedAndFinish() {
        RNLogKt.logi(PermissionApi.sTag, "checkBluetoothPermission deniedCallBack");
        zvc.a aVar = listener;
        if (aVar != null) {
            aVar.onDenied();
        }
        listener = null;
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(TransparentActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.deniedAndFinish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$13(final TransparentActivity this$0, MultiplePermissionsBuilder showPermissionDialog) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(showPermissionDialog, "$this$showPermissionDialog");
        showPermissionDialog.allGranted(new Function0() { // from class: j0q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransparentActivity.onCreate$lambda$13$lambda$8(this.f22311a);
            }
        });
        showPermissionDialog.denied(new Function1() { // from class: k0q
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TransparentActivity.onCreate$lambda$13$lambda$12(this.f23311a, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$13$lambda$12(final TransparentActivity this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), "android.permission.ACCESS_FINE_LOCATION", this$0, it, null, new Function0() { // from class: l0q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransparentActivity.onCreate$lambda$13$lambda$12$lambda$9(this.f24491a);
            }
        }, new Function0() { // from class: m0q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransparentActivity.onCreate$lambda$13$lambda$12$lambda$11(this.f25633a);
            }
        }, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$13$lambda$12$lambda$11(final TransparentActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ActivityExtKt.permissionFromSetting(this$0, "android.permission.ACCESS_FINE_LOCATION", u0j.h, new Function0() { // from class: s0q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransparentActivity.onCreate$lambda$13$lambda$12$lambda$11$lambda$10(this.f33145a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$13$lambda$12$lambda$11$lambda$10(TransparentActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.deniedAndFinish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$13$lambda$12$lambda$9(TransparentActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.deniedAndFinish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$13$lambda$8(TransparentActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RNLogKt.logi(PermissionApi.sTag, "checkBluetoothPermission onGranted");
        zvc.a aVar = listener;
        if (aVar != null) {
            aVar.onGranted();
        }
        listener = null;
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(final TransparentActivity this$0, MultiplePermissionsBuilder showPermissionDialog) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(showPermissionDialog, "$this$showPermissionDialog");
        showPermissionDialog.allGranted(new Function0() { // from class: q0q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransparentActivity.onCreate$lambda$6$lambda$1(this.f30969a);
            }
        });
        showPermissionDialog.denied(new Function1() { // from class: r0q
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TransparentActivity.onCreate$lambda$6$lambda$5(this.f32060a, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6$lambda$1(TransparentActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        zvc.a aVar = listener;
        if (aVar != null) {
            aVar.onGranted();
        }
        RNLogKt.logi(PermissionApi.sTag, "checkBluetoothPermission onGranted");
        listener = null;
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6$lambda$5(final TransparentActivity this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), "android.permission.BLUETOOTH_SCAN", this$0, it, null, new Function0() { // from class: h0q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransparentActivity.onCreate$lambda$6$lambda$5$lambda$2(this.f19551a);
            }
        }, new Function0() { // from class: n0q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransparentActivity.onCreate$lambda$6$lambda$5$lambda$4(this.f27421a);
            }
        }, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6$lambda$5$lambda$2(TransparentActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.deniedAndFinish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6$lambda$5$lambda$4(final TransparentActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ActivityExtKt.permissionFromSetting(this$0, "android.permission.BLUETOOTH_SCAN", u0j.g, new Function0() { // from class: o0q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransparentActivity.onCreate$lambda$6$lambda$5$lambda$4$lambda$3(this.f28626a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6$lambda$5$lambda$4$lambda$3(TransparentActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.deniedAndFinish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$7(TransparentActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.deniedAndFinish();
        return Unit.INSTANCE;
    }

    private final void showPermissionTipDialogIfNeed(String[] permissionDesc, String[] permissions, final Function1<? super MultiplePermissionsBuilder, Unit> extension) {
        if (PermissionExtKt.supportMiuiPermissionEnable()) {
            PermissionExtKt.permissions$default(this, (String[]) Arrays.copyOf(permissions, permissions.length), (String[]) null, new Function1() { // from class: p0q
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TransparentActivity.showPermissionTipDialogIfNeed$lambda$14(extension, (MultiplePermissionsBuilder) obj);
                }
            }, 2, (Object) null);
            return;
        }
        String str = permissionDesc[0];
        String string = getString(u0j.i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SpannableString spannableString = new SpannableString(str + "\n\r\n\r" + string);
        spannableString.setSpan(new StyleSpan(1), 0, str.length(), 17);
        CommonDialog commonDialogCreate = new CommonDialog.c("location").setDialogTitle(u0j.f).setDialogDescriptionString(new DialogParams.DialogDescriptionString(spannableString)).setPositiveText(u0j.f35251a).setNegativeText(u0j.e).create();
        commonDialogCreate.setCancelable(false);
        commonDialogCreate.addDialogCallback(new AnonymousClass2(permissions, permissionDesc, extension));
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPermissionTipDialogIfNeed$lambda$14(Function1 extension, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(extension, "$extension");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        extension.invoke2(permissions);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String[] strArr = Build.VERSION.SDK_INT >= 31 ? new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"} : new String[]{"android.permission.ACCESS_FINE_LOCATION"};
        if (PermissionExtKt.isPermissionGranted(this, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            RNLogKt.logi(PermissionApi.sTag, "checkBluetoothPermission onGranted");
            zvc.a aVar = listener;
            if (aVar != null) {
                aVar.onGranted();
            }
        } else {
            RNLogKt.logi(PermissionApi.sTag, "checkBluetoothPermission deniedCallBack");
            zvc.a aVar2 = listener;
            if (aVar2 != null) {
                aVar2.onDenied();
            }
        }
        listener = null;
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 31) {
            if (!PermissionExtKt.isPermissionGranted(this, "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT")) {
                ActivityExtKt.showPermissionDialog(this, new String[]{getString(u0j.g), getString(u0j.g)}, new Function0() { // from class: t0q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TransparentActivity.onCreate$lambda$0(this.f34184a);
                    }
                }, new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"}, new Function1() { // from class: u0q
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return TransparentActivity.onCreate$lambda$6(this.f35263a, (MultiplePermissionsBuilder) obj);
                    }
                });
                return;
            }
            RNLogKt.logi(PermissionApi.sTag, "checkBluetoothPermission onGranted");
            zvc.a aVar = listener;
            if (aVar != null) {
                aVar.onGranted();
            }
            listener = null;
            finish();
            return;
        }
        if (!PermissionExtKt.isPermissionGranted(this, "android.permission.ACCESS_FINE_LOCATION")) {
            ActivityExtKt.showPermissionDialog(this, new String[]{getString(u0j.h)}, new Function0() { // from class: v0q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransparentActivity.onCreate$lambda$7(this.f36357a);
                }
            }, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, new Function1() { // from class: i0q
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TransparentActivity.onCreate$lambda$13(this.f20654a, (MultiplePermissionsBuilder) obj);
                }
            });
            return;
        }
        RNLogKt.logi(PermissionApi.sTag, "checkBluetoothPermission onGranted");
        zvc.a aVar2 = listener;
        if (aVar2 != null) {
            aVar2.onGranted();
        }
        listener = null;
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}
