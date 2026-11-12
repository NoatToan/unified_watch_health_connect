package com.xiaomi.fitness.devicesettings.guide;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiTodoSettingHelper;
import com.xiaomi.fitness.devicesettings.guide.GuideSyncSystemSettingFragment;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import com.xiaomi.fitness.devicesettings.utils.ZenUtils;
import com.xiaomi.fitness.devicesettings.utils.ZenUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import com.xiaomi.fitness.sync.export.SyncPreference;
import com.xiaomi.fitness.ubox.export.GuideNavigator;
import defpackage.av6;
import defpackage.eui;
import defpackage.ki6;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 :2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001:B\u0007¢\u0006\u0004\b9\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006JQ\u0010\u0016\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\fJ\u0019\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010\u0019J\u0013\u0010%\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010\u0006J\u0013\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b(\u0010)J\u0013\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b*\u0010)R\u0016\u0010,\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\"\u0010/\u001a\u00020.8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u00108\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/guide/GuideSyncSystemSettingFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/guide/GuideNotificationViewModel;", "Lki6;", "", "getDNDPermission", "()V", "getCalendarPermission", "getWeatherPermission", "", "enable", "updateMiuiTodoSyncStatus", "(Z)V", "onSyncZenModeOpen", "", "", "permissions", "descriptions", "needGoSetting", "pd", "Lkotlin/Function1;", "callback", "showPermissionDialogWhenNeverAsk", "([Ljava/lang/String;[Ljava/lang/String;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "isBaseLocationPermissionGranted", "()Z", "skipWeatherSync", "uboxNextPage", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onBackPressed", "bindView", "(Lki6;)V", LifecycleConstantKt.ON_RESUME, "getLocationPermissionList", "()[Ljava/lang/String;", "getLocationPermissionDescList", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Lcom/xiaomi/fitness/ubox/export/GuideNavigator;", "guideNavigator", "Lcom/xiaomi/fitness/ubox/export/GuideNavigator;", "getGuideNavigator", "()Lcom/xiaomi/fitness/ubox/export/GuideNavigator;", "setGuideNavigator", "(Lcom/xiaomi/fitness/ubox/export/GuideNavigator;)V", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nGuideSyncSystemSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuideSyncSystemSettingFragment.kt\ncom/xiaomi/fitness/devicesettings/guide/GuideSyncSystemSettingFragment\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,394:1\n37#2:395\n36#2,3:396\n37#2:399\n36#2,3:400\n*S KotlinDebug\n*F\n+ 1 GuideSyncSystemSettingFragment.kt\ncom/xiaomi/fitness/devicesettings/guide/GuideSyncSystemSettingFragment\n*L\n353#1:395\n353#1:396,3\n369#1:399\n369#1:400,3\n*E\n"})
public final class GuideSyncSystemSettingFragment extends Hilt_GuideSyncSystemSettingFragment<GuideNotificationViewModel, ki6> {

    @NotNull
    private static final String TAG = "GuideSyncSystemSettingFragment";
    public GuideNavigator guideNavigator;

    @Nullable
    private final WearableDeviceModel mDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.guide.GuideSyncSystemSettingFragment$onSyncZenModeOpen$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.guide.GuideSyncSystemSettingFragment$onSyncZenModeOpen$1", f = "GuideSyncSystemSettingFragment.kt", i = {}, l = {271, 272}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(GuideSyncSystemSettingFragment guideSyncSystemSettingFragment, boolean z) {
            guideSyncSystemSettingFragment.hideLoading();
            guideSyncSystemSettingFragment.getCalendarPermission();
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GuideSyncSystemSettingFragment.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            ZenUtils zenUtils = ZenUtils.INSTANCE;
            this.label = 1;
            if (zenUtils.postSyncZenMode(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            ZenUtils zenUtils2 = ZenUtils.INSTANCE;
            final GuideSyncSystemSettingFragment guideSyncSystemSettingFragment = GuideSyncSystemSettingFragment.this;
            Function1<? super Boolean, Unit> function1 = new Function1() { // from class: com.xiaomi.fitness.devicesettings.guide.a
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return GuideSyncSystemSettingFragment.AnonymousClass1.invokeSuspend$lambda$0(guideSyncSystemSettingFragment, ((Boolean) obj2).booleanValue());
                }
            };
            this.label = 2;
            if (zenUtils2.setZenModeSyncWithPhone(true, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.guide.GuideSyncSystemSettingFragment$showPermissionDialogWhenNeverAsk$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/devicesettings/guide/GuideSyncSystemSettingFragment$showPermissionDialogWhenNeverAsk$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class C21541 extends av6 {
        final /* synthetic */ Function1<Boolean, Unit> $callback;
        final /* synthetic */ String[] $descriptions;
        final /* synthetic */ boolean $needGoSetting;
        final /* synthetic */ String[] $permissions;

        /* JADX WARN: Multi-variable type inference failed */
        public C21541(boolean z, String[] strArr, String[] strArr2, Function1<? super Boolean, Unit> function1) {
            this.$needGoSetting = z;
            this.$permissions = strArr;
            this.$descriptions = strArr2;
            this.$callback = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$2(final Function1 callback, MultiplePermissionsBuilder permissions) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
            permissions.allGranted(new Function0() { // from class: n9b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GuideSyncSystemSettingFragment.C21541.onDialogClick$lambda$2$lambda$0(callback);
                }
            });
            permissions.denied(new Function1() { // from class: o9b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return GuideSyncSystemSettingFragment.C21541.onDialogClick$lambda$2$lambda$1(callback, (List) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$2$lambda$0(Function1 callback) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            callback.invoke2(Boolean.TRUE);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$2$lambda$1(Function1 callback, List it) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(it, "it");
            callback.invoke2(Boolean.FALSE);
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            Activity currentActivity;
            super.onDialogClick(dialogName, dialog, which);
            if (which == -2) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                this.$callback.invoke2(Boolean.FALSE);
            } else if (which == -1 && (currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity()) != null) {
                if (this.$needGoSetting) {
                    PermissionsUtil.INSTANCE.toPermissionSetting(currentActivity);
                    return;
                }
                String[] strArr = this.$permissions;
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                String[] strArr3 = this.$descriptions;
                final Function1<Boolean, Unit> function1 = this.$callback;
                PermissionExtKt.permissions((FragmentActivity) currentActivity, strArr2, strArr3, (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: m9b
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return GuideSyncSystemSettingFragment.C21541.onDialogClick$lambda$2(function1, (MultiplePermissionsBuilder) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(GuideSyncSystemSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.uboxNextPage(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$3(GuideSyncSystemSettingFragment this$0, ki6 this_bindView, Button it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(it, "it");
        if (((GuideNotificationViewModel) this$0.getMViewModel()).getMDeviceModel() == null) {
            return Unit.INSTANCE;
        }
        SyncPreference.INSTANCE.setKEY_SYNC_WIFI(this_bindView.Q.isChecked());
        if (this$0.getMActivity() != null) {
            this$0.getDNDPermission();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getCalendarPermission() {
        Logger.i(TAG, "get Calendar Permission");
        if (((ki6) getMBinding()).D.isChecked()) {
            ConstraintLayout syncCalendarView = ((ki6) getMBinding()).F;
            Intrinsics.checkNotNullExpressionValue(syncCalendarView, "syncCalendarView");
            if (ExtUtilsKt.isVisible(syncCalendarView)) {
                final String string = getString(wzi.df);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                PermissionExtKt.permission(this, "android.permission.READ_CALENDAR", string, (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: e9b
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return GuideSyncSystemSettingFragment.getCalendarPermission$lambda$9(this.f16412a, string, (PermissionBuilder) obj);
                    }
                });
                return;
            }
        }
        ((GuideNotificationViewModel) getMViewModel()).closeCalenderSync();
        getWeatherPermission();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCalendarPermission$lambda$9(final GuideSyncSystemSettingFragment this$0, final String description, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(description, "$description");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: i9b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GuideSyncSystemSettingFragment.getCalendarPermission$lambda$9$lambda$4(this.f20904a, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: j9b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GuideSyncSystemSettingFragment.getCalendarPermission$lambda$9$lambda$8(this.f22554a, description, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getCalendarPermission$lambda$9$lambda$4(GuideSyncSystemSettingFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "Calendar Permission granted");
        ((GuideNotificationViewModel) this$0.getMViewModel()).openCalenderSync();
        this$0.getWeatherPermission();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCalendarPermission$lambda$9$lambda$8(final GuideSyncSystemSettingFragment this$0, final String description, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(description, "$description");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "Calendar Permission denied");
        if (this$0.getMActivity() == null) {
            Logger.i(TAG, "Calendar Permission mActivity is Null");
        }
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), "android.permission.READ_CALENDAR", mActivity, CollectionsKt__CollectionsKt.arrayListOf("android.permission.READ_CALENDAR"), null, null, new Function0() { // from class: f9b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GuideSyncSystemSettingFragment.getCalendarPermission$lambda$9$lambda$8$lambda$7$lambda$6(this.f17551a, description);
                }
            }, 24, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCalendarPermission$lambda$9$lambda$8$lambda$7$lambda$6(final GuideSyncSystemSettingFragment this$0, String description) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(description, "$description");
        String string = this$0.getString(wzi.e6);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this$0.showPermissionDialogWhenNeverAsk(new String[]{"android.permission.READ_CALENDAR"}, new String[]{description}, true, string, new Function1() { // from class: k9b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GuideSyncSystemSettingFragment.getCalendarPermission$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5(this.f23627a, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getCalendarPermission$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5(GuideSyncSystemSettingFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            ((GuideNotificationViewModel) this$0.getMViewModel()).openCalenderSync();
            this$0.getWeatherPermission();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getDNDPermission() {
        Logger.i(TAG, "get DND Permission");
        if (!ZenUtils.INSTANCE.isSupportZenMode(((GuideNotificationViewModel) getMViewModel()).getMDeviceModel())) {
            getCalendarPermission();
            return;
        }
        Logger.i(TAG, "Device Have QUIET_MODE Feature");
        DeviceSettingsPreference deviceSettingsPreference = DeviceSettingsPreference.INSTANCE;
        WearableDeviceModel wearableDeviceModel = this.mDeviceModel;
        Intrinsics.checkNotNull(wearableDeviceModel);
        deviceSettingsPreference.isZenModeOpen(wearableDeviceModel.getDid(), ((ki6) getMBinding()).J.isChecked());
        if (!((ki6) getMBinding()).J.isChecked()) {
            getCalendarPermission();
        } else if (!NotifyHelperExtKt.getNotificationManagerExport().isNotificationPolicyAccessGranted()) {
            ZenUtilsKt.showNotificationPolicyAccessSettingRequestDialog(this);
        } else {
            PageState.DefaultImpls.showLoading$default(this, null, 0, false, 5, null);
            onSyncZenModeOpen();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getWeatherPermission() {
        Logger.i(TAG, "get Weather Permission");
        if (((ki6) getMBinding()).N.isChecked()) {
            ConstraintLayout syncWeatherView = ((ki6) getMBinding()).P;
            Intrinsics.checkNotNullExpressionValue(syncWeatherView, "syncWeatherView");
            if (ExtUtilsKt.isVisible(syncWeatherView)) {
                String[] locationPermissionList = getLocationPermissionList();
                PermissionExtKt.permissions(this, (String[]) Arrays.copyOf(locationPermissionList, locationPermissionList.length), getLocationPermissionDescList(), (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: g9b
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return GuideSyncSystemSettingFragment.getWeatherPermission$lambda$15(this.f18752a, (MultiplePermissionsBuilder) obj);
                    }
                });
                return;
            }
        }
        uboxNextPage$default(this, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWeatherPermission$lambda$15(final GuideSyncSystemSettingFragment this$0, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        permissions.allGranted(new Function0() { // from class: a9b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GuideSyncSystemSettingFragment.getWeatherPermission$lambda$15$lambda$10(this.f797a);
            }
        });
        permissions.denied(new Function1() { // from class: b9b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GuideSyncSystemSettingFragment.getWeatherPermission$lambda$15$lambda$14(this.f3948a, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWeatherPermission$lambda$15$lambda$10(GuideSyncSystemSettingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "Weather Permission all granted");
        uboxNextPage$default(this$0, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWeatherPermission$lambda$15$lambda$14(final GuideSyncSystemSettingFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(list, "list");
        if (this$0.isBaseLocationPermissionGranted()) {
            Logger.i(TAG, "Weather Permission all granted");
            uboxNextPage$default(this$0, false, 1, null);
        } else {
            Logger.i(TAG, "Weather Permission denied " + list);
            if (this$0.getMActivity() == null) {
                Logger.i(TAG, "Weather Permission mActivity is Null");
            }
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), "android.permission.ACCESS_COARSE_LOCATION", mActivity, CollectionsKt__CollectionsKt.arrayListOf("android.permission.ACCESS_COARSE_LOCATION"), null, null, new Function0() { // from class: l9b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GuideSyncSystemSettingFragment.getWeatherPermission$lambda$15$lambda$14$lambda$13$lambda$12(this.f24799a);
                    }
                }, 24, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWeatherPermission$lambda$15$lambda$14$lambda$13$lambda$12(final GuideSyncSystemSettingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String[] locationPermissionList = this$0.getLocationPermissionList();
        String[] locationPermissionDescList = this$0.getLocationPermissionDescList();
        String string = this$0.getString(wzi.jf);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this$0.showPermissionDialogWhenNeverAsk(locationPermissionList, locationPermissionDescList, true, string, new Function1() { // from class: h9b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GuideSyncSystemSettingFragment.getWeatherPermission$lambda$15$lambda$14$lambda$13$lambda$12$lambda$11(this.f19829a, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWeatherPermission$lambda$15$lambda$14$lambda$13$lambda$12$lambda$11(GuideSyncSystemSettingFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            uboxNextPage$default(this$0, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    private final boolean isBaseLocationPermissionGranted() {
        return PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION");
    }

    private final void onSyncZenModeOpen() {
        AnyExtKt.io$default(null, new AnonymousClass1(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$0(GuideSyncSystemSettingFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ConstraintLayout syncWifiView = ((ki6) this$0.getMBinding()).S;
        Intrinsics.checkNotNullExpressionValue(syncWifiView, "syncWifiView");
        ExtUtilsKt.setVisible(syncWifiView, bool.booleanValue());
        return Unit.INSTANCE;
    }

    private final void showPermissionDialogWhenNeverAsk(String[] permissions, String[] descriptions, boolean needGoSetting, String pd, Function1<? super Boolean, Unit> callback) {
        String string = getString(wzi.h6);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SpannableString spannableString = new SpannableString(pd + "\n\r\n\r" + string);
        spannableString.setSpan(new StyleSpan(1), 0, pd.length(), 17);
        CommonDialog commonDialogAddDialogCallback = new CommonDialog.c("sync schedule").setDialogTitle(wzi.of).setDialogDescriptionString(new DialogParams.DialogDescriptionString(spannableString)).setPositiveText(wzi.common_allow).setNegativeText(wzi.common_reject).setCancelable(false).create().addDialogCallback(new C21541(needGoSetting, permissions, descriptions, callback));
        FragmentActivity mActivity = getMActivity();
        commonDialogAddDialogCallback.showIfNeed(mActivity != null ? mActivity.getSupportFragmentManager() : null);
    }

    public static /* synthetic */ void showPermissionDialogWhenNeverAsk$default(GuideSyncSystemSettingFragment guideSyncSystemSettingFragment, String[] strArr, String[] strArr2, boolean z, String str, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            str = "";
        }
        guideSyncSystemSettingFragment.showPermissionDialogWhenNeverAsk(strArr, strArr2, z, str, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void uboxNextPage(boolean skipWeatherSync) {
        String did;
        if (!skipWeatherSync) {
            ConstraintLayout syncWeatherView = ((ki6) getMBinding()).P;
            Intrinsics.checkNotNullExpressionValue(syncWeatherView, "syncWeatherView");
            if (ExtUtilsKt.isVisible(syncWeatherView)) {
                SyncPreference syncPreference = SyncPreference.INSTANCE;
                WearableDeviceModel mDeviceModel = ((GuideNotificationViewModel) getMViewModel()).getMDeviceModel();
                if (mDeviceModel == null || (did = mDeviceModel.getDid()) == null) {
                    did = "";
                }
                syncPreference.setNeedSyncWeather(did, ((ki6) getMBinding()).N.isChecked());
            }
        }
        Logger.i(TAG, "SyncSetting Page Jump to =============> WearInstruction");
        getGuideNavigator().navigate("wearInstruction");
    }

    public static /* synthetic */ void uboxNextPage$default(GuideSyncSystemSettingFragment guideSyncSystemSettingFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        guideSyncSystemSettingFragment.uboxNextPage(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateMiuiTodoSyncStatus(boolean enable) {
        WearableDeviceModel wearableDeviceModel;
        String did;
        ConstraintLayout syncMiuiTodoView = ((ki6) getMBinding()).I;
        Intrinsics.checkNotNullExpressionValue(syncMiuiTodoView, "syncMiuiTodoView");
        if (!ExtUtilsKt.isVisible(syncMiuiTodoView) || (wearableDeviceModel = this.mDeviceModel) == null || (did = wearableDeviceModel.getDid()) == null) {
            return;
        }
        Logger.i(TAG, "updateMiuiTodoSyncStatus " + enable);
        MiuiTodoSettingHelper.INSTANCE.updateMiuiTodoSwitchStatus(did, enable);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final ki6 ki6Var) {
        Intrinsics.checkNotNullParameter(ki6Var, "<this>");
        ki6Var.Q.setChecked(true);
        ki6Var.J.setChecked(true);
        ki6Var.D.setChecked(true);
        ki6Var.N.setChecked(true);
        ki6Var.A.setOnClickListener(new View.OnClickListener() { // from class: z8b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideSyncSystemSettingFragment.bindView$lambda$1(this.f41014a, view);
            }
        });
        ViewExtKt.clickWithTrigger$default(ki6Var.B, 0L, new Function1() { // from class: d9b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GuideSyncSystemSettingFragment.bindView$lambda$3(this.f15251a, ki6Var, (Button) obj);
            }
        }, 1, null);
    }

    @NotNull
    public final GuideNavigator getGuideNavigator() {
        GuideNavigator guideNavigator = this.guideNavigator;
        if (guideNavigator != null) {
            return guideNavigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("guideNavigator");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.y0;
    }

    @NotNull
    public final String[] getLocationPermissionDescList() {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 30) {
            FragmentActivity mActivity = getMActivity();
            ListExtKt.add(arrayList, mActivity != null ? mActivity.getString(wzi.f449if) : null);
            arrayList.add(" ");
            FragmentActivity mActivity2 = getMActivity();
            ListExtKt.add(arrayList, mActivity2 != null ? mActivity2.getString(wzi.gf) : null);
        } else {
            FragmentActivity mActivity3 = getMActivity();
            ListExtKt.add(arrayList, mActivity3 != null ? mActivity3.getString(wzi.f449if) : null);
            arrayList.add(" ");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @NotNull
    public final String[] getLocationPermissionList() {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 30) {
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
            arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
        } else {
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        return true;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.mDeviceModel == null) {
            return;
        }
        if (NotifyHelperExtKt.getNotificationManagerExport().isNotificationPolicyAccessGranted()) {
            DeviceSettingsPreference deviceSettingsPreference = DeviceSettingsPreference.INSTANCE;
            WearableDeviceModel wearableDeviceModel = this.mDeviceModel;
            Intrinsics.checkNotNull(wearableDeviceModel);
            if (deviceSettingsPreference.isZenModeOpen(wearableDeviceModel.getDid())) {
                return;
            }
        }
        DeviceSettingsPreference deviceSettingsPreference2 = DeviceSettingsPreference.INSTANCE;
        WearableDeviceModel wearableDeviceModel2 = this.mDeviceModel;
        Intrinsics.checkNotNull(wearableDeviceModel2);
        deviceSettingsPreference2.isZenModeOpen(wearableDeviceModel2.getDid(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        WearableDeviceModel mDeviceModel;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.L4);
        setActionBarResizeable(true);
        hideBack();
        if (this.mDeviceModel == null) {
            uboxNextPage(true);
        }
        ((GuideNotificationViewModel) getMViewModel()).getSyncWifiCapability().observe(getViewLifecycleOwner(), new GuideSyncSystemSettingFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: c9b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GuideSyncSystemSettingFragment.onViewCreated$lambda$0(this.f5077a, (Boolean) obj);
            }
        }));
        ConstraintLayout syncNotDisturbView = ((ki6) getMBinding()).L;
        Intrinsics.checkNotNullExpressionValue(syncNotDisturbView, "syncNotDisturbView");
        ExtUtilsKt.setVisible(syncNotDisturbView, ZenUtils.INSTANCE.isSupportZenMode(((GuideNotificationViewModel) getMViewModel()).getMDeviceModel()));
        WearableDeviceModel mDeviceModel2 = ((GuideNotificationViewModel) getMViewModel()).getMDeviceModel();
        if (mDeviceModel2 != null && DeviceModelExtKt.isSupportFeature(mDeviceModel2, Feature.WIFI_CONFIG)) {
            ((GuideNotificationViewModel) getMViewModel()).tryGetWifiPassword();
        }
        boolean z = ((GuideNotificationViewModel) getMViewModel()).isWearOS() || ((mDeviceModel = ((GuideNotificationViewModel) getMViewModel()).getMDeviceModel()) != null && DeviceModelExtKt.isSupportFeature(mDeviceModel, "calendar") == (RomUtils.isXiaomi() & true));
        ConstraintLayout syncCalendarView = ((ki6) getMBinding()).F;
        Intrinsics.checkNotNullExpressionValue(syncCalendarView, "syncCalendarView");
        ExtUtilsKt.setVisible(syncCalendarView, z);
        WearableDeviceModel mDeviceModel3 = ((GuideNotificationViewModel) getMViewModel()).getMDeviceModel();
        boolean z2 = mDeviceModel3 != null && DeviceModelExtKt.isSupportFeature(mDeviceModel3, "weather");
        ConstraintLayout syncWeatherView = ((ki6) getMBinding()).P;
        Intrinsics.checkNotNullExpressionValue(syncWeatherView, "syncWeatherView");
        ExtUtilsKt.setVisible(syncWeatherView, z2);
    }

    public final void setGuideNavigator(@NotNull GuideNavigator guideNavigator) {
        Intrinsics.checkNotNullParameter(guideNavigator, "<set-?>");
        this.guideNavigator = guideNavigator;
    }
}
