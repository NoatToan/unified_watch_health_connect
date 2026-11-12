package com.xiaomi.hm.health.ui.language;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.treadmill.ext.ViewExtKt;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.model.HmLocale;
import com.xiaomi.hm.health.bt.model.LanguageComBination;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMOtherVersion;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineManager;
import com.xiaomi.hm.health.eventbus.EventFwCheckResult;
import com.xiaomi.hm.health.locweather.LocWeatherManager;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.ui.language.DeviceLanguageSettingActivity;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventReminderExpandKt;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0002BCB\u0007¢\u0006\u0004\b@\u0010AJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\u0018\u0010\u000e\u001a\u00020\u00032\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0002J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0002J\b\u0010\u0017\u001a\u00020\u0003H\u0002J\b\u0010\u0018\u001a\u00020\u0003H\u0002J\u0012\u0010\u001b\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014J\u000e\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001cJ\b\u0010\u001f\u001a\u00020\u0003H\u0016J\b\u0010 \u001a\u00020\u0003H\u0014R\u001e\u0010#\u001a\n !*\u0004\u0018\u00010\u00130\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00102R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00105R\u0016\u00109\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001d\u0010?\u001a\u00020:8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006D"}, d2 = {"Lcom/xiaomi/hm/health/ui/language/DeviceLanguageSettingActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lorg/koin/core/component/KoinComponent;", "", "initView", "", "enable", "z", "x", "y", DTransferConstants.SEARCH_KEY, "", "Lcom/xiaomi/hm/health/bt/model/HMLanguage;", "t", SOAP.XMLNS, "u", "", "lang", "initRecyclerView", "", "msg", "C", "hideLoadingDialog", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, LogUtil.D, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/xiaomi/hm/health/eventbus/EventFwCheckResult;", "result", "onEventMainThread", "onBackPressed", "onDestroy", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Lcom/xiaomi/hm/health/ui/language/AdapterLanguage;", "Lcom/xiaomi/hm/health/ui/language/AdapterLanguage;", "adapterLanguage", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "miLiDevice", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "mDeviceSource", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "B", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "failedDialog", "Landroid/os/Handler;", "Landroid/os/Handler;", "timeOut", "E", "Z", "mEdited", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "F", "Lkotlin/Lazy;", "r", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "<init>", "()V", "Companion", "a", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceLanguageSettingActivity extends BaseTitleActivity implements KoinComponent {
    public static final long CONN_TIME_OUT_SEC = 30000;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String DEVICE_TYPE = "type";
    public static final int MESSAGE_TIMEOUT = 22;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment failedDialog;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean mEdited;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private AdapterLanguage adapterLanguage;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    private HMMiLiProDevice miLiDevice;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final String TAG = DeviceLanguageSettingActivity.class.getSimpleName();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private HMDeviceSource mDeviceSource = HMDeviceSource.MILI;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private Handler timeOut = new a(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013²\u0006\u000e\u0010\u0012\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/xiaomi/hm/health/ui/language/DeviceLanguageSettingActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/util/Locale;", "locale", "", "getLanguageStringResId", "", "CONN_TIME_OUT_SEC", "J", "", "DEVICE_TYPE", "Ljava/lang/String;", "MESSAGE_TIMEOUT", LogUtil.I, "<init>", "()V", "identifier", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.mutableProperty0(new MutablePropertyReference0Impl(Reflection.getOrCreateKotlinClass(Companion.class), "identifier", "<v#0>"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static final int a(ReadWriteProperty<Object, Integer> readWriteProperty) {
            return readWriteProperty.getValue(null, a[0]).intValue();
        }

        private static final void b(ReadWriteProperty<Object, Integer> readWriteProperty, int i) {
            readWriteProperty.setValue(null, a[0], Integer.valueOf(i));
        }

        public final int getLanguageStringResId(@NotNull Context context, @NotNull Locale locale) {
            int identifier;
            ReadWriteProperty readWritePropertyNotNull = Delegates.INSTANCE.notNull();
            String languageCode = HMLanguage.getLanguageCode(locale);
            if (TextUtils.isEmpty(locale.getCountry())) {
                identifier = context.getResources().getIdentifier("language_" + languageCode, "string", context.getPackageName());
            } else {
                Resources resources = context.getResources();
                String country = locale.getCountry();
                Locale locale2 = Locale.ENGLISH;
                identifier = resources.getIdentifier("language_" + country.toLowerCase(locale2) + "_" + languageCode.toLowerCase(locale2), "string", context.getPackageName());
            }
            b(readWritePropertyNotNull, identifier);
            return a(readWritePropertyNotNull);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"com/xiaomi/hm/health/ui/language/DeviceLanguageSettingActivity$a", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/hm/health/ui/language/DeviceLanguageSettingActivity;", "a", "Ljava/lang/ref/WeakReference;", "mActivity", "<init>", "(Lcom/xiaomi/hm/health/ui/language/DeviceLanguageSettingActivity;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a extends Handler {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private WeakReference<DeviceLanguageSettingActivity> mActivity;

        public a(@Nullable DeviceLanguageSettingActivity deviceLanguageSettingActivity) {
            this.mActivity = new WeakReference<>(deviceLanguageSettingActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            DeviceLanguageSettingActivity deviceLanguageSettingActivity;
            super.handleMessage(msg);
            if (msg.what != 22 || (deviceLanguageSettingActivity = this.mActivity.get()) == null) {
                return;
            }
            deviceLanguageSettingActivity.hideLoadingDialog();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<View, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            int childCount = ((RecyclerView) DeviceLanguageSettingActivity.this.findViewById(R.id.recyclerView)).getChildCount();
            if (childCount <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                CheckBox checkBox = (CheckBox) ((RecyclerView) DeviceLanguageSettingActivity.this.findViewById(R.id.recyclerView)).getChildAt(i).findViewById(R.id.state_check);
                if (checkBox.isChecked() && (checkBox.getTag() instanceof LanguageBean)) {
                    Object tag = checkBox.getTag();
                    Objects.requireNonNull(tag, "null cannot be cast to non-null type com.xiaomi.hm.health.ui.language.LanguageBean");
                    DeviceLanguageSettingActivity.this.t(((LanguageBean) tag).getLangCode());
                }
                if (i2 >= childCount) {
                    return;
                } else {
                    i = i2;
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "device is not support device language settings";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceLanguageSettingActivity() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.ui.language.DeviceLanguageSettingActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceUtilsApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), qualifier, objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        AlertDialogFragment alertDialogFragment;
        boolean z = false;
        if (this.failedDialog == null) {
            this.failedDialog = new AlertDialogFragment.Builder(this).setCancelable(false).setMessage(getString(R.string.language_seting_title)).setNeutralButton(getString(R.string.nfc_lab_known), new DialogInterface.OnClickListener() { // from class: w71
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    DeviceLanguageSettingActivity.B(dialogInterface, i);
                }
            }).create();
        }
        AlertDialogFragment alertDialogFragment2 = this.failedDialog;
        if (alertDialogFragment2 != null && !alertDialogFragment2.isShowing()) {
            z = true;
        }
        if (!z || (alertDialogFragment = this.failedDialog) == null) {
            return;
        }
        alertDialogFragment.show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    private final void C(String msg) {
        LoadingDialog loadingDialog;
        LoadingDialog loadingDialog2;
        if (this.mLoadingDialog == null) {
            this.mLoadingDialog = LoadingDialog.showDialog(this);
        }
        LoadingDialog loadingDialog3 = this.mLoadingDialog;
        if (((loadingDialog3 == null || loadingDialog3.isShowing()) ? false : true) && (loadingDialog2 = this.mLoadingDialog) != null) {
            loadingDialog2.show();
        }
        LoadingDialog loadingDialog4 = this.mLoadingDialog;
        if (loadingDialog4 != null) {
            loadingDialog4.setCancelable(false);
        }
        if (TextUtils.isEmpty(msg) || (loadingDialog = this.mLoadingDialog) == null) {
            return;
        }
        loadingDialog.setMessage(msg);
    }

    private final void D() {
        new AlertDialogFragment.Builder(this).setMessage(R.string.sort_save_cancle).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: x71
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DeviceLanguageSettingActivity.F(dialogInterface, i);
            }
        }).setPositiveButton(R.string.give_up, new DialogInterface.OnClickListener() { // from class: v71
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DeviceLanguageSettingActivity.E(this.a, dialogInterface, i);
            }
        }).create().show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(DeviceLanguageSettingActivity deviceLanguageSettingActivity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        deviceLanguageSettingActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideLoadingDialog() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.dismiss();
    }

    private final void initRecyclerView() {
        int i = R.id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) findViewById(i);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(1);
        Unit unit = Unit.INSTANCE;
        recyclerView.setLayoutManager(linearLayoutManager);
        ((RecyclerView) findViewById(i)).addItemDecoration(new RecyclerItemDecoration(this, 0, (int) ViewUtils.dp2px(this, 0.5f), ContextCompat.getColor(this, R.color.s4)));
        AdapterLanguage adapterLanguage = new AdapterLanguage();
        this.adapterLanguage = adapterLanguage;
        Objects.requireNonNull(adapterLanguage);
        adapterLanguage.setOnItemListener(new View.OnClickListener() { // from class: z71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceLanguageSettingActivity.w(this.a, view);
            }
        });
        RecyclerView recyclerView2 = (RecyclerView) findViewById(i);
        AdapterLanguage adapterLanguage2 = this.adapterLanguage;
        Objects.requireNonNull(adapterLanguage2);
        recyclerView2.setAdapter(adapterLanguage2);
    }

    private final void initView() {
        initRecyclerView();
        BTStatusFragment bTStatusFragmentNewInstance = BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager());
        bTStatusFragmentNewInstance.setShowBottomArea(false);
        bTStatusFragmentNewInstance.setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.ui.language.DeviceLanguageSettingActivity.initView.1
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                DeviceLanguageSettingActivity.this.z(enable);
            }
        });
    }

    private final void q() {
        DeviceInfo deviceInfo;
        LanguageComBination languageComBination;
        List<HMLanguage> languageList;
        HMMiLiProDevice hMMiLiProDevice = this.miLiDevice;
        if (hMMiLiProDevice != null && (deviceInfo = hMMiLiProDevice.getDeviceInfo()) != null && (languageComBination = deviceInfo.getLanguageComBination()) != null && (languageList = languageComBination.getLanguageList()) != null) {
            s(languageList);
            return;
        }
        HMMiLiProDevice hMMiLiProDevice2 = this.miLiDevice;
        if (hMMiLiProDevice2 == null || hMMiLiProDevice2 == null) {
            return;
        }
        hMMiLiProDevice2.getLanguages(new HMCallback<ArrayList<HMLanguage>>() { // from class: com.xiaomi.hm.health.ui.language.DeviceLanguageSettingActivity$getDeviceSupportLanguage$2
            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(@Nullable ArrayList<HMLanguage> t) {
                super.onFinish(t);
                this.a.s(t);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceUtilsApi r() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(List<? extends HMLanguage> t) {
        Integer[] numArr;
        DeviceInfo deviceInfo;
        HMOtherVersion otherVersion;
        HMLanguage language;
        Locale locale;
        String string;
        if (t == null) {
            numArr = null;
        } else {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(t, 10));
            Iterator<T> it2 = t.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(((HMLanguage) it2.next()).getLanguage()));
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            numArr = (Integer[]) array;
        }
        HMMiLiProDevice hMMiLiProDevice = this.miLiDevice;
        int language2 = (hMMiLiProDevice == null || (deviceInfo = hMMiLiProDevice.getDeviceInfo()) == null || (otherVersion = deviceInfo.getOtherVersion()) == null || (language = otherVersion.getLanguage()) == null) ? 0 : language.getLanguage();
        if (numArr == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Integer num : numArr) {
            int iIntValue = num.intValue();
            try {
                locale = HmLocale.getLocale(iIntValue);
                try {
                    string = getString(INSTANCE.getLanguageStringResId(this, locale));
                } catch (Throwable th) {
                    th = th;
                    HMLog.info(this.TAG, new b(th));
                    string = null;
                }
            } catch (Throwable th2) {
                th = th2;
                locale = null;
            }
            LanguageBean languageBean = ((string == null || string.length() == 0) || locale == null) ? null : new LanguageBean(iIntValue == language2, iIntValue, string, locale);
            if (languageBean != null) {
                arrayList2.add(languageBean);
            }
        }
        AdapterLanguage adapterLanguage = this.adapterLanguage;
        Objects.requireNonNull(adapterLanguage);
        adapterLanguage.setSupportLanguage(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(final int lang) {
        if (this.mEdited && this.miLiDevice != null) {
            this.timeOut.sendEmptyMessageDelayed(22, 30000L);
            C(getString(R.string.language_setting));
            HMMiLiProDevice hMMiLiProDevice = this.miLiDevice;
            Objects.requireNonNull(hMMiLiProDevice, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
            hMMiLiProDevice.setLanguage(new HMLanguage(lang), new HMCallback<Object>() { // from class: com.xiaomi.hm.health.ui.language.DeviceLanguageSettingActivity$handleSetLanguageResult$1
                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(boolean result) {
                    if (!result) {
                        this.hideLoadingDialog();
                        this.timeOut.removeMessages(22);
                        this.A();
                        return;
                    }
                    DeviceLanguageConfig.INSTANCE.saveDeviceLanguageProperty(new HMLanguage(lang), this.mDeviceSource);
                    LocWeatherManager.getInstance().requestLocation();
                    this.r().updateAboutLanguageConfig(this.mDeviceSource);
                    if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() && HMFwOnlineUpgradeManager.getInstance().useOnline(this.mDeviceSource.getType())) {
                        DeviceLanguageSettingActivity deviceLanguageSettingActivity = this;
                        HMFwOnlineUpgradeManager.getInstance().enableFwUpgrade(true);
                        HMFwOnlineManager.getInstance().checkFw(deviceLanguageSettingActivity.mDeviceSource.getType(), true);
                    }
                }
            });
        }
    }

    private final void u() {
        getLeftText().setOnClickListener(new View.OnClickListener() { // from class: y71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceLanguageSettingActivity.v(this.a, view);
            }
        });
        ViewExtKt.smartClick$default(getRightTitle(), 0L, new c(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(DeviceLanguageSettingActivity deviceLanguageSettingActivity, View view) {
        if (deviceLanguageSettingActivity.mEdited) {
            deviceLanguageSettingActivity.D();
        } else {
            deviceLanguageSettingActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(DeviceLanguageSettingActivity deviceLanguageSettingActivity, View view) {
        deviceLanguageSettingActivity.mEdited = true;
    }

    private final void x() {
        EventReminderExpandKt.setUnifyTitleStyle(this, BaseTitleActivity.STYLE.CANCEL_AND_SAVE, getString(HMDeviceConfig.isBand(this.mDeviceSource) ? R.string.band_language_settting : R.string.watch_language_settting), null);
        setRightTitle(getString(R.string.confirm));
    }

    private final void y() {
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra("type");
        Objects.requireNonNull(serializableExtra, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMDeviceType");
        HMDeviceType hMDeviceType = (HMDeviceType) serializableExtra;
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        HMBaseDevice device = hMDeviceManager == null ? null : hMDeviceManager.getDevice(hMDeviceType);
        if (device == null ? true : device instanceof HMMiLiProDevice) {
            this.miLiDevice = (HMMiLiProDevice) device;
        } else {
            HMLog.info(this.TAG, d.a);
            finish();
        }
        HMDeviceSource boundDeviceSource = hMDeviceManager != null ? hMDeviceManager.getBoundDeviceSource(hMDeviceType) : null;
        if (boundDeviceSource == null) {
            boundDeviceSource = HMDeviceSource.MILI;
        }
        this.mDeviceSource = boundDeviceSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(boolean enable) {
        getRightTitle().setClickable(enable);
        findViewById(R.id.mask_view).setVisibility(enable ? 8 : 0);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.mEdited) {
            D();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_language_setting);
        y();
        x();
        EventBus.getDefault().register(this);
        initView();
        u();
        q();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        AlertDialogFragment alertDialogFragment = this.failedDialog;
        if (alertDialogFragment != null) {
            alertDialogFragment.dismiss();
        }
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
        this.timeOut.removeMessages(22);
        super.onDestroy();
    }

    public final void onEventMainThread(@NotNull EventFwCheckResult result) {
        if (this.timeOut.hasMessages(22)) {
            this.timeOut.removeMessages(22);
            hideLoadingDialog();
            finish();
        }
    }
}
