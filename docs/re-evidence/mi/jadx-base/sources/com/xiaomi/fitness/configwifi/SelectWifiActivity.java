package com.xiaomi.fitness.configwifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.location.LocationManager;
import android.net.wifi.ScanResult;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.viewbinding.ViewBindingUtilKt;
import com.xiaomi.fitness.configwifi.SelectWifiActivity;
import com.xiaomi.fitness.configwifi.WifiInfo$ScanResultProxy;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import defpackage.av1;
import defpackage.av6;
import defpackage.bri;
import defpackage.f4b;
import defpackage.gh4;
import defpackage.gui;
import defpackage.jk0;
import defpackage.wc0;
import defpackage.xhr;
import defpackage.zzi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000 @2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003@ABB\u0007¢\u0006\u0004\b?\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0016\u0010\u0015J-\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\u0006J\u000f\u0010!\u001a\u00020\u0004H\u0014¢\u0006\u0004\b!\u0010\u0006J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010<\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;¨\u0006C"}, d2 = {"Lcom/xiaomi/fitness/configwifi/SelectWifiActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/configwifi/SelectWifiViewModel;", "Ljk0;", "", "initPermissionHelper", "()V", "checkGpsEnabled", "", "refresh", "getWifiList", "(Z)V", "isMain", "()Z", "registerBroadcastReceiver", "unregisterBroadcastReceiver", "setWifiInfoBySsid", "initSsidAdapter", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onPostCreate", "", AccountInteractActivity.KEY_REQUEST_CODE, "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "onBackPressed", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "getContext", "()Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "bindConfirmDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/configwifi/WifiInfo$ScanResultProxy;", "wifiList", "Ljava/util/ArrayList;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/BroadcastReceiver;", "broadcastReceiver", "Landroid/content/BroadcastReceiver;", "Lcom/xiaomi/fitness/configwifi/a;", "mPermissionHelper", "Lcom/xiaomi/fitness/configwifi/a;", "Landroid/view/View;", "llNothing", "Landroid/view/View;", "llList", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "WifiListAdapter", "PairCodeDialog", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public class SelectWifiActivity extends BaseBindingActivity<SelectWifiViewModel, jk0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String FROM_PASSWORD = "FROM_PASSWORD";

    @NotNull
    public static final String FROM_SELECT_SPEAKER = "FROM_SELECT_SPEAKER";

    @NotNull
    public static final String FROM_SELECT_WIFI = "FROM_SELECT_WIFI";

    @NotNull
    private static final String IGNORE_WIFI_NAME = "xiaomi-wifispeaker";

    @NotNull
    private static final String IPHONE_CURRENT_WIFI = "IPHONE_CURRENT_WIFI";
    private static final int REQUEST_CODE = 100;

    @NotNull
    public static final String SELECTED_WIFI = "SELECTED_WIFI";

    @NotNull
    private static final String WIFI_INFO_CACHE = "WIFI_INFO_CACHE";

    @NotNull
    public static final String WIFI_LIST = "WIFI_LIST";
    private CommonDialog<DialogParams> bindConfirmDialog;

    @Nullable
    private BroadcastReceiver broadcastReceiver;

    @Nullable
    private View llList;

    @Nullable
    private View llNothing;

    @Nullable
    private a mPermissionHelper;

    @Nullable
    private RecyclerView recyclerView;

    @NotNull
    private ArrayList<WifiInfo$ScanResultProxy> wifiList = new ArrayList<>();

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J \u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0002J\"\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0002J \u0010\u001a\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001b\u001a\u00020\u00052\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015J\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0018\u0010\u001d\u001a\u00020\u00102\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/configwifi/SelectWifiActivity$Companion;", "", "<init>", "()V", "WIFI_LIST", "", "SELECTED_WIFI", SelectWifiActivity.FROM_PASSWORD, "IPHONE_CURRENT_WIFI", "REQUEST_CODE", "", "FROM_SELECT_WIFI", SelectWifiActivity.FROM_SELECT_SPEAKER, "IGNORE_WIFI_NAME", SelectWifiActivity.WIFI_INFO_CACHE, "startSelectWifiActivityForResult", "", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "handleWifiList", "wifiList", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/configwifi/WifiInfo$ScanResultProxy;", "matchConnectedWifi", "context", "Landroid/content/Context;", "foreachWifiListAndUpdateWifiInfo", "ssidStr", "getWifiListByMobileSystem", "sortWifiList", "list", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handleWifiList(BaseActivity activity, ArrayList<WifiInfo$ScanResultProxy> wifiList) {
            Intent intent;
            String strC = f4b.c(wifiList);
            Intrinsics.checkNotNullExpressionValue(strC, "toJson(...)");
            ConfigWifiLogExtKt.logi("SelectWifiActivity#handleWifiList, wifiList: %s", strC);
            WifiInfo$ScanResultProxy wifiInfo$ScanResultProxyMatchConnectedWifi = matchConnectedWifi(activity, wifiList);
            if (gh4.d(wifiList)) {
                intent = new Intent(activity, (Class<?>) ConfigWifiActivity.class);
            } else if (wifiInfo$ScanResultProxyMatchConnectedWifi == null || (!(DeviceInfoExtKt.support5GHz() && wifiInfo$ScanResultProxyMatchConnectedWifi.f()) && DeviceInfoExtKt.support5GHz())) {
                intent = new Intent(activity, (Class<?>) SelectWifiActivity.class);
            } else {
                Intent intent2 = new Intent(activity, (Class<?>) ConfigWifiActivity.class);
                Intrinsics.checkNotNull(intent2.putExtra("IPHONE_CURRENT_WIFI", wifiInfo$ScanResultProxyMatchConnectedWifi));
                intent = intent2;
            }
            intent.putParcelableArrayListExtra("WIFI_LIST", wifiList);
            intent.putExtra(SelectWifiActivity.FROM_SELECT_SPEAKER, true);
            activity.startActivity(intent);
        }

        private final WifiInfo$ScanResultProxy matchConnectedWifi(Context context, ArrayList<WifiInfo$ScanResultProxy> wifiList) {
            if (gh4.d(wifiList)) {
                return null;
            }
            String strB = xhr.b(context);
            Intrinsics.checkNotNull(strB);
            ConfigWifiLogExtKt.logi("SelectWifiActivity#matchConnectedWifi, current phone ssid: %s", strB);
            WifiInfo$ScanResultProxy wifiInfo$ScanResultProxyForeachWifiListAndUpdateWifiInfo = foreachWifiListAndUpdateWifiInfo(strB, wifiList);
            if (wifiInfo$ScanResultProxyForeachWifiListAndUpdateWifiInfo != null) {
                return wifiInfo$ScanResultProxyForeachWifiListAndUpdateWifiInfo;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            TypeToken<HashMap<String, ConfigWifiActivity.WiFiInfoCache>> typeToken = new TypeToken<HashMap<String, ConfigWifiActivity.WiFiInfoCache>>() { // from class: com.xiaomi.fitness.configwifi.SelectWifiActivity$Companion$matchConnectedWifi$token$1
            };
            String string = defaultSharedPreferences.getString(SelectWifiActivity.WIFI_INFO_CACHE, "{}");
            ConfigWifiLogExtKt.logi("SelectWifiActivity#matchConnectedWifi, cached wifi info: " + string);
            HashMap map = (HashMap) new Gson().fromJson(string, typeToken.getType());
            if (map != null) {
                ListIterator listIterator = new ArrayList(map.entrySet()).listIterator(map.size());
                Intrinsics.checkNotNullExpressionValue(listIterator, "listIterator(...)");
                while (listIterator.hasPrevious()) {
                    WifiInfo$ScanResultProxy wifiInfo$ScanResultProxyForeachWifiListAndUpdateWifiInfo2 = foreachWifiListAndUpdateWifiInfo((String) ((Map.Entry) listIterator.previous()).getKey(), wifiList);
                    if (wifiInfo$ScanResultProxyForeachWifiListAndUpdateWifiInfo2 != null) {
                        return wifiInfo$ScanResultProxyForeachWifiListAndUpdateWifiInfo2;
                    }
                }
            }
            String strB2 = xhr.b(context);
            Intrinsics.checkNotNull(strB2);
            ConfigWifiLogExtKt.logi("SelectWifiActivity#matchConnectedWifi, current phone ssid: %s", strB2);
            return foreachWifiListAndUpdateWifiInfo(strB2, wifiList);
        }

        private final void sortWifiList(ArrayList<WifiInfo$ScanResultProxy> list) {
            if (gh4.d(list)) {
                return;
            }
            Collections.sort(list, new Comparator() { // from class: ksl
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return SelectWifiActivity.Companion.sortWifiList$lambda$0((WifiInfo$ScanResultProxy) obj, (WifiInfo$ScanResultProxy) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int sortWifiList$lambda$0(WifiInfo$ScanResultProxy wifiInfo$ScanResultProxy, WifiInfo$ScanResultProxy wifiInfo$ScanResultProxy2) {
            if (wifiInfo$ScanResultProxy != null && wifiInfo$ScanResultProxy2 != null) {
                if (wifiInfo$ScanResultProxy.a() > wifiInfo$ScanResultProxy2.a()) {
                    return -1;
                }
                if (wifiInfo$ScanResultProxy.a() < wifiInfo$ScanResultProxy2.a()) {
                    return 1;
                }
            }
            return 0;
        }

        @Nullable
        public final WifiInfo$ScanResultProxy foreachWifiListAndUpdateWifiInfo(@NotNull String ssidStr, @NotNull ArrayList<WifiInfo$ScanResultProxy> wifiList) {
            Intrinsics.checkNotNullParameter(ssidStr, "ssidStr");
            Intrinsics.checkNotNullParameter(wifiList, "wifiList");
            if (gh4.d(wifiList)) {
                return null;
            }
            Iterator<WifiInfo$ScanResultProxy> it = wifiList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                WifiInfo$ScanResultProxy next = it.next();
                if (Intrinsics.areEqual(ssidStr, next != null ? next.d() : null)) {
                    return next;
                }
            }
            return null;
        }

        @NotNull
        public final ArrayList<WifiInfo$ScanResultProxy> getWifiListByMobileSystem(@Nullable Context context) {
            ArrayList<WifiInfo$ScanResultProxy> arrayList = new ArrayList<>();
            List listC = xhr.c(context);
            if (listC == null || !(!listC.isEmpty())) {
                listC = new ArrayList();
                xhr.h(context);
            } else {
                xhr.a(listC, SelectWifiActivity.IGNORE_WIFI_NAME);
            }
            Iterator it = listC.iterator();
            while (it.hasNext()) {
                WifiInfo$ScanResultProxy wifiInfo$ScanResultProxy = new WifiInfo$ScanResultProxy((ScanResult) it.next());
                if (!arrayList.contains(wifiInfo$ScanResultProxy)) {
                    arrayList.add(wifiInfo$ScanResultProxy);
                }
            }
            ConfigWifiLogExtKt.logi("getWifiListByMobileSystem:" + arrayList.size());
            sortWifiList(arrayList);
            return arrayList;
        }

        public final void startSelectWifiActivityForResult(@NotNull BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intent intent = new Intent(activity, (Class<?>) SelectWifiActivity.class);
            intent.putExtra(SelectWifiActivity.FROM_PASSWORD, true);
            activity.startActivityForResult(intent, 100);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/configwifi/SelectWifiActivity$PairCodeDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "num", "", "<init>", "(Ljava/lang/String;)V", "initCustomView", "", "rootView", "Landroid/view/View;", "Builder", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PairCodeDialog extends CommonDialog<DialogParams> {

        @NotNull
        private final String num;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/configwifi/SelectWifiActivity$PairCodeDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog$c;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "internalCreate", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "", "num", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
        public static final class Builder extends CommonDialog.c {

            @NotNull
            private final String num;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Builder(@NotNull String num) {
                super("bind_device_oob");
                Intrinsics.checkNotNullParameter(num, "num");
                this.num = num;
                setCustomLayoutId(gui.D);
                setPositiveText(zzi.c);
                setNegativeText(zzi.f41831b);
            }

            @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog.c, com.xiaomi.fitness.baseui.dialog.a
            @NotNull
            public CommonDialog<DialogParams> internalCreate() {
                return new PairCodeDialog(this.num);
            }
        }

        public PairCodeDialog(@NotNull String num) {
            Intrinsics.checkNotNullParameter(num, "num");
            this.num = num;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
        public void initCustomView(@Nullable View rootView) {
            TextView textView;
            if (rootView == null || (textView = (TextView) rootView.findViewById(bri.S)) == null) {
                return;
            }
            textView.setText(this.num);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 \u001fB\u001f\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/configwifi/SelectWifiActivity$WifiListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "position", "getItemViewType", "(I)I", "holder", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Lcom/xiaomi/fitness/configwifi/WifiInfo$ScanResultProxy;", "getItem", "(I)Lcom/xiaomi/fitness/configwifi/WifiInfo$ScanResultProxy;", "getItemCount", "()I", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "Ljava/util/ArrayList;", "wifiList", "Ljava/util/ArrayList;", "selectedPosition", "I", "<init>", "(Lcom/xiaomi/fitness/baseui/view/BaseActivity;Ljava/util/ArrayList;)V", "Companion", "ItemViewHolder", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class WifiListAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
        private static final int ITEM_TYPE_FIVE_G = 2;
        private static final int ITEM_TYPE_NORMAL = 1;
        private static final int ITEM_TYPE_OTHER_WIFI = 3;

        @NotNull
        private BaseActivity activity;
        private int selectedPosition;

        @NotNull
        private ArrayList<WifiInfo$ScanResultProxy> wifiList;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/configwifi/SelectWifiActivity$WifiListAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "handleItemClick", "()V", "Lcom/xiaomi/fitness/configwifi/WifiInfo$ScanResultProxy;", "proxy", "bindView", "(Lcom/xiaomi/fitness/configwifi/WifiInfo$ScanResultProxy;)V", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/configwifi/SelectWifiActivity$WifiListAdapter;Landroid/view/View;)V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
        public final class ItemViewHolder extends RecyclerView.d0 {
            final /* synthetic */ WifiListAdapter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ItemViewHolder(@NotNull WifiListAdapter wifiListAdapter, View itemView) {
                super(itemView);
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                this.this$0 = wifiListAdapter;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void bindView$lambda$0(ItemViewHolder this$0, View view) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.handleItemClick();
            }

            private final void handleItemClick() {
                int i = this.this$0.selectedPosition;
                this.this$0.selectedPosition = 0;
                this.this$0.notifyItemChanged(i);
                WifiListAdapter wifiListAdapter = this.this$0;
                wifiListAdapter.notifyItemChanged(wifiListAdapter.selectedPosition);
                Intent intent = new Intent();
                WifiInfo$ScanResultProxy item = this.this$0.getItem(getAdapterPosition());
                if (this.this$0.activity.getIntent().getBooleanExtra(SelectWifiActivity.FROM_PASSWORD, false)) {
                    intent.putParcelableArrayListExtra("WIFI_LIST", this.this$0.wifiList);
                    intent.putExtra("SELECTED_WIFI", item);
                    this.this$0.activity.setResult(-1, intent);
                    this.this$0.activity.finish();
                    return;
                }
                Intent intent2 = new Intent(this.itemView.getContext(), (Class<?>) ConfigWifiActivity.class);
                intent2.putExtra("SELECTED_WIFI", item);
                intent2.putExtra("FROM_SELECT_WIFI", true);
                intent2.putParcelableArrayListExtra("WIFI_LIST", this.this$0.wifiList);
                this.itemView.getContext().startActivity(intent2);
                this.this$0.activity.finish();
            }

            public final void bindView(@Nullable WifiInfo$ScanResultProxy proxy) {
                this.itemView.setOnClickListener(new View.OnClickListener() { // from class: lsl
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SelectWifiActivity.WifiListAdapter.ItemViewHolder.bindView$lambda$0(this.f25402a, view);
                    }
                });
                if (proxy != null) {
                    View viewFindViewById = this.itemView.findViewById(bri.R3);
                    Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                    ((TextView) viewFindViewById).setText(proxy.d());
                    this.itemView.findViewById(bri.o2).setVisibility(proxy.e() ? 0 : 8);
                    ((ImageView) this.itemView.findViewById(bri.K3)).setImageResource(proxy.c());
                }
            }
        }

        public WifiListAdapter(@NotNull BaseActivity activity, @NotNull ArrayList<WifiInfo$ScanResultProxy> wifiList) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(wifiList, "wifiList");
            this.activity = activity;
            this.wifiList = wifiList;
            this.selectedPosition = 1;
        }

        @Nullable
        public final WifiInfo$ScanResultProxy getItem(int position) {
            if (!gh4.d(this.wifiList) && position < gh4.a(this.wifiList) && position >= 0) {
                return this.wifiList.get(position);
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getCount() {
            return gh4.a(this.wifiList);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            WifiInfo$ScanResultProxy item = getItem(position);
            if (item == null) {
                return 1;
            }
            if (item.c) {
                return 2;
            }
            return item.d ? 3 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            if (!gh4.d(this.wifiList) && (holder instanceof ItemViewHolder)) {
                ((ItemViewHolder) holder).bindView(getItem(position));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(gui.Q, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new ItemViewHolder(this, viewInflate);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.configwifi.SelectWifiActivity$getWifiList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.configwifi.SelectWifiActivity$getWifiList$1", f = "SelectWifiActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C18551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.configwifi.SelectWifiActivity$getWifiList$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.configwifi.SelectWifiActivity$getWifiList$1$1", f = "SelectWifiActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C03851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SelectWifiActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03851(SelectWifiActivity selectWifiActivity, Continuation<? super C03851> continuation) {
                super(2, continuation);
                this.this$0 = selectWifiActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$0(SelectWifiActivity selectWifiActivity) {
                ScopeExtKt.scope(Dispatchers.getIO(), new SelectWifiActivity$getWifiList$1$1$1$1(selectWifiActivity, null));
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03851(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ConfigWifiLogExtKt.logi("getWifiList,postDelayed isMain(): " + this.this$0.isMain());
                View viewFindRootView = ViewBindingUtilKt.findRootView(this.this$0);
                final SelectWifiActivity selectWifiActivity = this.this$0;
                viewFindRootView.postDelayed(new Runnable() { // from class: com.xiaomi.fitness.configwifi.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        SelectWifiActivity.C18551.C03851.invokeSuspend$lambda$0(selectWifiActivity);
                    }
                }, VibrateModeProgressBar.sLongToLong);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C18551(Continuation<? super C18551> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SelectWifiActivity.this.new C18551(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ConfigWifiLogExtKt.logi("getWifiList,startScan isMain(): " + SelectWifiActivity.this.isMain());
            xhr.h(SelectWifiActivity.this);
            ScopeExtKt.scope(Dispatchers.getMain(), new C03851(SelectWifiActivity.this, null));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkGpsEnabled() {
        Object systemService = getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        List<String> allProviders = locationManager.getAllProviders();
        Intrinsics.checkNotNullExpressionValue(allProviders, "getAllProviders(...)");
        if (allProviders.contains("gps") && !locationManager.isProviderEnabled("gps")) {
            String string = getString(zzi.g0);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            CommonDialog<DialogParams> commonDialogAddDialogCallback = new PairCodeDialog.Builder(string).setPositiveText(zzi.x0).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.configwifi.SelectWifiActivity.checkGpsEnabled.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    } else {
                        if (which != -1) {
                            return;
                        }
                        SelectWifiActivity.this.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        SelectWifiActivity.this.finish();
                    }
                }
            });
            this.bindConfirmDialog = commonDialogAddDialogCallback;
            if (commonDialogAddDialogCallback == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bindConfirmDialog");
                commonDialogAddDialogCallback = null;
            }
            commonDialogAddDialogCallback.showIfNeed(getSupportFragmentManager());
        }
    }

    private final void getWifiList(boolean refresh) {
        ConfigWifiLogExtKt.logi("getWifiList, refresh: " + refresh);
        showLoading();
        ScopeExtKt.scope(Dispatchers.getIO(), new C18551(null));
    }

    private final void initPermissionHelper() {
        int i;
        a aVarI;
        int i2;
        a aVarI2;
        a aVar = new a(this);
        this.mPermissionHelper = aVar;
        int i3 = zzi.C4;
        a aVarI3 = aVar.i("android.permission.BLUETOOTH", i3, i3);
        if (aVarI3 == null || (aVarI = aVarI3.i("android.permission.BLUETOOTH_ADMIN", (i = zzi.C4), i)) == null || (aVarI2 = aVarI.i("android.permission.ACCESS_FINE_LOCATION", (i2 = zzi.D4), i2)) == null) {
            return;
        }
        aVarI2.g(new a.b() { // from class: com.xiaomi.fitness.configwifi.SelectWifiActivity.initPermissionHelper.1
            @Override // com.xiaomi.fitness.configwifi.a.b
            public void onAllPermissionGranted() {
                SelectWifiActivity.this.checkGpsEnabled();
            }

            @Override // com.xiaomi.fitness.configwifi.a.b
            public void onGoToSetting() {
                a.f(SelectWifiActivity.this.getContext());
                SelectWifiActivity.this.finish();
            }

            @Override // com.xiaomi.fitness.configwifi.a.b
            public void onPermissionDenied(String permission) {
                SelectWifiActivity.this.finish();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initSsidAdapter() {
        WifiListAdapter wifiListAdapter = new WifiListAdapter(this, this.wifiList);
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(wifiListAdapter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMain() {
        return Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(SelectWifiActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getWifiList(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPostCreate$lambda$1(SelectWifiActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a aVar = this$0.mPermissionHelper;
        if (aVar != null) {
            aVar.d();
        }
        this$0.getWifiList(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerBroadcastReceiver() {
        if (this.broadcastReceiver == null) {
            this.broadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.configwifi.SelectWifiActivity.registerBroadcastReceiver.1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(intent, "intent");
                    String action = intent.getAction();
                    ConfigWifiLogExtKt.logi("intent=" + action);
                    if (Intrinsics.areEqual("android.net.wifi.SCAN_RESULTS", action)) {
                        SelectWifiActivity.this.initSsidAdapter();
                    } else if (Intrinsics.areEqual("android.net.conn.CONNECTIVITY_CHANGE", action) && xhr.g(context)) {
                        SelectWifiActivity.this.setWifiInfoBySsid();
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            if (Build.VERSION.SDK_INT >= 33) {
                registerReceiver(this.broadcastReceiver, intentFilter, 2);
            } else {
                registerReceiver(this.broadcastReceiver, intentFilter);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setWifiInfoBySsid() {
        String strB = xhr.b(this);
        if (TextUtils.isEmpty(strB) || Intrinsics.areEqual("<unknown ssid>", strB)) {
            return;
        }
        Companion companion = INSTANCE;
        Intrinsics.checkNotNull(strB);
        if (companion.foreachWifiListAndUpdateWifiInfo(strB, this.wifiList) != null) {
            ConfigWifiLogExtKt.logi("setWifiInfoBySsid, currentSSID: %s", strB);
        }
    }

    private final void unregisterBroadcastReceiver() {
        BroadcastReceiver broadcastReceiver = this.broadcastReceiver;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
            this.broadcastReceiver = null;
        }
    }

    @NotNull
    public final BaseActivity getContext() {
        return this;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return gui.q;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return av1.d;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        WifiInfo$ScanResultProxy wifiInfo$ScanResultProxy;
        if (!getIntent().getBooleanExtra(FROM_SELECT_SPEAKER, false) || (!gh4.d(this.wifiList) && (gh4.a(this.wifiList) != 1 || (wifiInfo$ScanResultProxy = this.wifiList.get(0)) == null || !wifiInfo$ScanResultProxy.h()))) {
            super.lambda$onCreate$0();
        } else {
            INSTANCE.handleWifiList(this, this.wifiList);
            finish();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setTitle(getString(zzi.S4));
        }
        setActionBarDisplayable(true);
        setActionBarExpandState(0);
        setActionBarResizeable(false);
        getMBinding().A.setOnClickListener(new View.OnClickListener() { // from class: jsl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectWifiActivity.onCreate$lambda$0(this.f23093a, view);
            }
        });
        if (DeviceInfoExtKt.support5GHz()) {
            getMBinding().B.setText(zzi.f0);
        }
        this.recyclerView = (RecyclerView) findViewById(bri.p2);
        this.llNothing = findViewById(bri.X1);
        this.llList = findViewById(bri.W1);
        initPermissionHelper();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterBroadcastReceiver();
    }

    @Override // android.app.Activity
    public void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        View view = this.llList;
        if (view != null) {
            view.postDelayed(new Runnable() { // from class: isl
                @Override // java.lang.Runnable
                public final void run() {
                    SelectWifiActivity.onPostCreate$lambda$1(this.f22052a);
                }
            }, 500L);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        a aVar = this.mPermissionHelper;
        if (aVar != null) {
            aVar.h(requestCode, permissions, grantResults);
        }
    }
}
