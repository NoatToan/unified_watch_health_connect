package com.huami.core.device.wifi_settings;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.core.device.wifi_settings.WifiRouter;
import com.huami.core.device.wifi_settings.bean.WifiBean;
import com.huami.core.device.wifi_settings.service.IWiFiControllerProxy;
import com.huami.core.device.wifi_settings.service.WiFiSettingInit;
import com.huami.core.device.wifi_settings.ui.CenterDialogFragment;
import com.huami.core.device.wifi_settings.ui.MenuClickListener;
import com.huami.core.device.wifi_settings.ui.WifiConfigDetailActivity;
import com.huami.core.device.wifi_settings.ui.WifiConfigListActivity;
import com.huami.core.device.wifi_settings.ui.WifiConnectActivity;
import com.huami.core.device.wifi_settings.ui.WifiListActivity;
import com.huami.core.device.wifi_settings.ui.WifiSetActivity;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\"B\t\b\u0002¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bJ6\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000bJ \u0010\u0012\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bJ*\u0010\u0013\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\r\u001a\u00020\u000bJ*\u0010\u0014\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\r\u001a\u00020\u000bJ \u0010\u0015\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bJ\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016J \u0010\u001a\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bR\u0016\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006#"}, d2 = {"Lcom/huami/core/device/wifi_settings/WifiRouter;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", GoogleApiAvailabilityLight.a, "remind", "", "b", "Landroid/app/Activity;", "activity", "", "source", "requestCode", "launchWifiSet", "Lcom/huami/core/device/wifi_settings/bean/WifiBean;", "wifiBean", "wifiScanEnable", "launchWifiList", "launchWifiConnect", "launchConfigWifiDetail", "launchWifiConfig", "Lcom/huami/core/device/wifi_settings/WifiRouter$WifiConfigCallBack;", "wifiConfigCallback", "wifiConfigStatus", "Landroidx/appcompat/app/AppCompatActivity;", "showConfigDialog", "", "TAG", "Ljava/lang/String;", "a", "KEY_WIFI_REMIND", "<init>", "()V", "WifiConfigCallBack", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public final class WifiRouter {

    @NotNull
    public static final WifiRouter INSTANCE = new WifiRouter();

    @NotNull
    public static final String TAG = "WifiRouter";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_WIFI_REMIND = "wifiConfigRemind";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/core/device/wifi_settings/WifiRouter$WifiConfigCallBack;", "", "", "isConfig", "", "wifiConfigEnable", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
    public interface WifiConfigCallBack {
        void wifiConfigEnable(boolean isConfig);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "wifi config dialog don't remind!!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.core.device.wifi_settings.WifiRouter$wifiConfigStatus$1", f = "WifiRouter.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ WifiConfigCallBack d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;
            public final /* synthetic */ IWiFiControllerProxy b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i, IWiFiControllerProxy iWiFiControllerProxy) {
                super(0);
                this.a = i;
                this.b = iWiFiControllerProxy;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return this.a + ": wifiConfigStatus:" + this.b;
            }
        }

        /* JADX INFO: renamed from: com.huami.core.device.wifi_settings.WifiRouter$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.core.device.wifi_settings.WifiRouter$wifiConfigStatus$1$2$def$1", f = "WifiRouter.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0338b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int a;
            public final /* synthetic */ IWiFiControllerProxy b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0338b(IWiFiControllerProxy iWiFiControllerProxy, Continuation<? super C0338b> continuation) {
                super(2, continuation);
                this.b = iWiFiControllerProxy;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0338b(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
                return ((C0338b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    IWiFiControllerProxy iWiFiControllerProxy = this.b;
                    this.a = 1;
                    obj = iWiFiControllerProxy.wifiConfigured(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, WifiConfigCallBack wifiConfigCallBack, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = i;
            this.d = wifiConfigCallBack;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            WifiConfigCallBack wifiConfigCallBack;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IWiFiControllerProxy controllerProxy = WiFiSettingInit.INSTANCE.getControllerProxy(this.c);
                HMLog.info(WifiRouter.TAG, new a(this.c, controllerProxy));
                if (controllerProxy != null) {
                    WifiConfigCallBack wifiConfigCallBack2 = this.d;
                    Deferred deferredB = e.b(GlobalScope.INSTANCE, null, null, new C0338b(controllerProxy, null), 3, null);
                    if (wifiConfigCallBack2 != null) {
                        this.a = wifiConfigCallBack2;
                        this.b = 1;
                        obj = deferredB.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        wifiConfigCallBack = wifiConfigCallBack2;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wifiConfigCallBack = (WifiConfigCallBack) this.a;
            ResultKt.throwOnFailure(obj);
            wifiConfigCallBack.wifiConfigEnable(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    private WifiRouter() {
    }

    private final void b(Context context, boolean remind) {
        context.getSharedPreferences(TAG, 0).edit().putBoolean(KEY_WIFI_REMIND, remind).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(AppCompatActivity appCompatActivity, DialogInterface dialogInterface, int i) {
        INSTANCE.b(appCompatActivity, false);
        dialogInterface.dismiss();
    }

    private final boolean d(Context context) {
        return context.getSharedPreferences(TAG, 0).getBoolean(KEY_WIFI_REMIND, true);
    }

    public static /* synthetic */ void launchConfigWifiDetail$default(WifiRouter wifiRouter, Activity activity, int i, WifiBean wifiBean, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        wifiRouter.launchConfigWifiDetail(activity, i, wifiBean, i2);
    }

    public static /* synthetic */ void launchWifiConfig$default(WifiRouter wifiRouter, Activity activity, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        wifiRouter.launchWifiConfig(activity, i, i2);
    }

    public static /* synthetic */ void launchWifiConnect$default(WifiRouter wifiRouter, Activity activity, int i, WifiBean wifiBean, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        wifiRouter.launchWifiConnect(activity, i, wifiBean, i2);
    }

    public static /* synthetic */ void launchWifiList$default(WifiRouter wifiRouter, Activity activity, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        wifiRouter.launchWifiList(activity, i, i2);
    }

    public static /* synthetic */ void launchWifiSet$default(WifiRouter wifiRouter, Activity activity, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        wifiRouter.launchWifiSet(activity, i, i2);
    }

    public static /* synthetic */ void showConfigDialog$default(WifiRouter wifiRouter, AppCompatActivity appCompatActivity, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        wifiRouter.showConfigDialog(appCompatActivity, i, i2);
    }

    public final void launchConfigWifiDetail(@NotNull Activity activity, int source, @NotNull WifiBean wifiBean, int requestCode) {
        WifiConfigDetailActivity.Companion.startActivity(activity, source, wifiBean, requestCode);
    }

    public final void launchWifiConfig(@NotNull Activity activity, int source, int requestCode) {
        WifiConfigListActivity.INSTANCE.startActivity(activity, source, requestCode);
    }

    public final void launchWifiConnect(@NotNull Activity activity, int source, @NotNull WifiBean wifiBean, int requestCode) {
        WifiConnectActivity.INSTANCE.startActivity(activity, source, wifiBean, requestCode);
    }

    public final void launchWifiList(@NotNull Activity activity, int source, int requestCode) {
        WifiListActivity.INSTANCE.startActivity(activity, source, requestCode);
    }

    public final void launchWifiSet(@NotNull Activity activity, int source, int requestCode) {
        launchWifiSet$default(this, activity, source, null, false, requestCode, 8, null);
    }

    public final void showConfigDialog(@NotNull final AppCompatActivity activity, final int source, final int requestCode) {
        if (!d(activity)) {
            HMLog.info(TAG, a.a);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CenterDialogFragment.MenuBean(activity.getString(R.string.wifi_config_now), 0, 0, 0, 14, null));
        arrayList.add(new CenterDialogFragment.MenuBean(activity.getString(R.string.wifi_not_config_now), 0, 0, 0, 14, null));
        CenterDialogFragment.INSTANCE.newInstance(1).setTitle(activity.getString(R.string.wifi_not_config_title)).setMessage(activity.getString(R.string.wifi_not_config_message)).setMenuData(arrayList, new MenuClickListener() { // from class: com.huami.core.device.wifi_settings.WifiRouter.showConfigDialog.2
            @Override // com.huami.core.device.wifi_settings.ui.MenuClickListener
            public void onClickMenu(@NotNull DialogInterface dialog, @NotNull CenterDialogFragment.MenuBean menu) {
                if (menu.getMenuIndex() != 0) {
                    dialog.dismiss();
                } else {
                    WifiRouter.INSTANCE.launchWifiSet(activity, source, requestCode);
                    dialog.dismiss();
                }
            }
        }).setCancel(false).setNegativeButton(activity.getString(R.string.wifi_not_remind), Integer.valueOf(R.color.color_CCCC), new DialogInterface.OnClickListener() { // from class: qv8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                WifiRouter.c(activity, dialogInterface, i);
            }
        }).show(activity.getSupportFragmentManager());
    }

    public final void wifiConfigStatus(int source, @Nullable WifiConfigCallBack wifiConfigCallback) {
        e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new b(source, wifiConfigCallback, null), 2, null);
    }

    public static /* synthetic */ void launchWifiSet$default(WifiRouter wifiRouter, Activity activity, int i, WifiBean wifiBean, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            wifiBean = null;
        }
        wifiRouter.launchWifiSet(activity, i, wifiBean, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? -1 : i2);
    }

    public final void launchWifiSet(@NotNull Activity activity, int source, @Nullable WifiBean wifiBean, boolean wifiScanEnable, int requestCode) {
        WifiSetActivity.INSTANCE.startActivity(activity, source, wifiBean, wifiScanEnable, requestCode);
    }
}
