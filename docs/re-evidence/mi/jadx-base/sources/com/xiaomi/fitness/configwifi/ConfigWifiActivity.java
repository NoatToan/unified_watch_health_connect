package com.xiaomi.fitness.configwifi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.configwifi.ConfigWifiActivity;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.smarthome.homeroom.model.Home;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import defpackage.av1;
import defpackage.bg4;
import defpackage.bri;
import defpackage.c1e;
import defpackage.gh4;
import defpackage.gui;
import defpackage.jz6;
import defpackage.o4h;
import defpackage.pj0;
import defpackage.ua1;
import defpackage.vc0;
import defpackage.wc0;
import defpackage.xhr;
import defpackage.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Route(path = ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_PATH_CONFIG_WIFI_ACTIVITY)
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 x2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003yzxB\u0007¢\u0006\u0004\bw\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0019\u0010\u000e\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0019\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0014J!\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u0006J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\nJ\u001f\u0010&\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0004H\u0002¢\u0006\u0004\b+\u0010\u0006J\u000f\u0010,\u001a\u00020\u0004H\u0002¢\u0006\u0004\b,\u0010\u0006J\u000f\u0010-\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010\u0006J\u000f\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0004\b.\u0010\u0006J\u000f\u0010/\u001a\u00020\u0015H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0015H\u0002¢\u0006\u0004\b1\u00100J\u000f\u00102\u001a\u00020\u0015H\u0002¢\u0006\u0004\b2\u00100J\u0017\u00104\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0015H\u0002¢\u0006\u0004\b4\u00105J\u0019\u00108\u001a\u00020\u00042\b\u00107\u001a\u0004\u0018\u000106H\u0014¢\u0006\u0004\b8\u00109J)\u0010?\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:2\b\u0010>\u001a\u0004\u0018\u00010=H\u0014¢\u0006\u0004\b?\u0010@J!\u0010A\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bA\u0010\u001cJ\u000f\u0010B\u001a\u00020\u0004H\u0014¢\u0006\u0004\bB\u0010\u0006J)\u0010E\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\f2\u0010\u0010D\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010C¢\u0006\u0004\bE\u0010FR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010KR\u0016\u0010\u0012\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010KR\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010KR\u0016\u0010L\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010MR\u0016\u0010O\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010MR\u0016\u0010P\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010MR\u0016\u0010Q\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010KR\u0016\u0010R\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010KR\u0016\u0010S\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010KR\u0016\u0010T\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010MR\u0016\u0010U\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010MR$\u0010X\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020W\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010[\u001a\u00020Z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020Z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b]\u0010\\R\u0016\u0010^\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010`\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b`\u0010_R\u0016\u0010a\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010c\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bc\u0010bR\u0016\u0010e\u001a\u00020d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\be\u0010fR\u001c\u0010i\u001a\b\u0012\u0004\u0012\u00020h0g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010k\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010MR\u0018\u0010m\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010p\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010t\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0014\u0010v\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010s¨\u0006{"}, d2 = {"Lcom/xiaomi/fitness/configwifi/ConfigWifiActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/configwifi/ConfigWifiViewModel;", "Lpj0;", "", "initConfigFailView", "()V", "Lcom/xiaomi/fitness/configwifi/WifiInfo$ScanResultProxy;", "scanResultProxy", "updateCurrentWifi", "(Lcom/xiaomi/fitness/configwifi/WifiInfo$ScanResultProxy;)V", "onNextStepClick", "", Home.JSON_KEY_ADDRESS, "getTargetMac", "(Ljava/lang/String;)Ljava/lang/String;", "ssidStr", "identityStr", "passwordStr", "cacheWifiInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "checkWifiInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "bindKey", "configWifiByPb", "did", "configWifiExtra", "(Ljava/lang/String;Ljava/lang/String;)V", "loopConfigWifiStatus", "(Ljava/lang/String;)V", "initSsid", "searchResult", "updateUIByWifiInfo", "Landroid/widget/CheckBox;", "toggleButton", "Landroid/widget/EditText;", "passwordEdit", "addVisibilityFunction", "(Landroid/widget/CheckBox;Landroid/widget/EditText;)V", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "getContext", "()Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "displaySavingUI", "displaySaveSuccess", "displaySaveFail", "initSsidAdapter", "supportEap", "()Z", "support5G", "getSaveWifiPassword", "result", "setSaveWifiPassword", "(Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "getBindKey", LifecycleConstantKt.ON_DESTROY, "Ljava/util/ArrayList;", "wifiList", "foreachWifiListAndUpdateWifiInfo", "(Ljava/lang/String;Ljava/util/ArrayList;)Lcom/xiaomi/fitness/configwifi/WifiInfo$ScanResultProxy;", "Lcom/xiaomi/fitness/configwifi/WifiInfo$ScanResultProxy;", "Ljz6;", "subscribe", "Ljz6;", "Ljava/lang/String;", "alreadyFoundDevice", "Z", "alreadyGetResult", "alreadyStart", "isSaving", "afterSSID", "beforeSSID", "autoFillSSID", "hasPassword", "isNotifying", "Ljava/util/HashMap;", "Lcom/xiaomi/fitness/configwifi/ConfigWifiActivity$WiFiInfoCache;", "mWiFiInfoCache", "Ljava/util/HashMap;", "Landroid/widget/RelativeLayout;", "identityContainer", "Landroid/widget/RelativeLayout;", "passwordContainer", HTTP.IDENTITY_CODING, "Landroid/widget/EditText;", "password", "passwordToggle", "Landroid/widget/CheckBox;", "rememberPwd", "Landroid/widget/AutoCompleteTextView;", "ssid", "Landroid/widget/AutoCompleteTextView;", "", "Landroid/net/wifi/ScanResult;", "mWifiList", "Ljava/util/List;", "mIsEap", "Ljava/util/TimerTask;", "timerTask", "Ljava/util/TimerTask;", "Ljava/util/Timer;", "timer", "Ljava/util/Timer;", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "WiFiInfoCache", "WifiAdapter", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nConfigWifiActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigWifiActivity.kt\ncom/xiaomi/fitness/configwifi/ConfigWifiActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,708:1\n1#2:709\n*E\n"})
public final class ConfigWifiActivity extends Hilt_ConfigWifiActivity<ConfigWifiViewModel, pj0> {

    @NotNull
    public static final String FROM_SELECT_WIFI = "FROM_SELECT_WIFI";

    @NotNull
    public static final String IPHONE_CURRENT_WIFI = "IPHONE_CURRENT_WIFI";

    @NotNull
    public static final String KEY_SAVE_WIFI_PASSWORD = "KEY_SAVE_WIFI_PASSWORD";

    @NotNull
    public static final String SELECTED_WIFI = "SELECTED_WIFI";

    @NotNull
    public static final String TAG = "ConfigWifiActivity";

    @NotNull
    private static final String WIFI_INFO_CACHE = "WIFI_INFO_CACHE";

    @NotNull
    public static final String WIFI_LIST = "WIFI_LIST";
    private boolean alreadyFoundDevice;
    private boolean alreadyGetResult;
    private boolean alreadyStart;
    private EditText identity;
    private RelativeLayout identityContainer;
    private boolean isNotifying;
    private boolean isSaving;
    private boolean mIsEap;

    @Nullable
    private HashMap<String, WiFiInfoCache> mWiFiInfoCache;
    private EditText password;
    private RelativeLayout passwordContainer;
    private CheckBox passwordToggle;
    private CheckBox rememberPwd;

    @Nullable
    private WifiInfo$ScanResultProxy scanResultProxy;
    private AutoCompleteTextView ssid;

    @Nullable
    private jz6 subscribe;

    @Nullable
    private TimerTask timerTask;

    @NotNull
    private String ssidStr = "";

    @NotNull
    private String passwordStr = "";

    @NotNull
    private String identityStr = "";

    @NotNull
    private String afterSSID = "";

    @NotNull
    private String beforeSSID = "";

    @NotNull
    private String autoFillSSID = "";
    private boolean hasPassword = true;

    @NotNull
    private List<ScanResult> mWifiList = new ArrayList();

    @NotNull
    private final Timer timer = new Timer();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/configwifi/ConfigWifiActivity$WiFiInfoCache;", "", HTTP.IDENTITY_CODING, "", "password", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getIdentity", "()Ljava/lang/String;", "setIdentity", "(Ljava/lang/String;)V", "getPassword", "setPassword", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WiFiInfoCache {

        @NotNull
        private String identity;

        @NotNull
        private String password;

        public WiFiInfoCache(@NotNull String identity, @NotNull String password) {
            Intrinsics.checkNotNullParameter(identity, "identity");
            Intrinsics.checkNotNullParameter(password, "password");
            this.identity = identity;
            this.password = password;
        }

        @NotNull
        public final String getIdentity() {
            return this.identity;
        }

        @NotNull
        public final String getPassword() {
            return this.password;
        }

        public final void setIdentity(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.identity = str;
        }

        public final void setPassword(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.password = str;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B7\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\b\u0001\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0017¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/configwifi/ConfigWifiActivity$WifiAdapter;", "Landroid/widget/ArrayAdapter;", "Lcom/xiaomi/fitness/configwifi/WifiInfo$ScanResultProxy;", "context", "Landroid/content/Context;", TSMAuthContants.PARAM_RESOURCE, "", "textViewResourceId", "objects", "", "<init>", "(Landroid/content/Context;IILjava/util/List;)V", "getView", "Landroid/view/View;", "position", "convertView", "parent", "Landroid/view/ViewGroup;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WifiAdapter extends ArrayAdapter<WifiInfo$ScanResultProxy> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WifiAdapter(@Nullable Context context, int i, int i2, @Nullable List<? extends WifiInfo$ScanResultProxy> list) {
            super(context, i, i2, list);
            Intrinsics.checkNotNull(context);
            Intrinsics.checkNotNull(list);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @NotNull
        public View getView(int position, @Nullable View convertView, @NotNull ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View view = super.getView(position, convertView, parent);
            Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
            WifiInfo$ScanResultProxy wifiInfo$ScanResultProxy = (WifiInfo$ScanResultProxy) getItem(position);
            Intrinsics.checkNotNull(wifiInfo$ScanResultProxy);
            view.findViewById(bri.o2).setVisibility(xhr.d(wifiInfo$ScanResultProxy.f11825a.capabilities) ? 0 : 8);
            if (position != 0) {
                View viewFindViewById = view.findViewById(bri.R3);
                Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                ((TextView) viewFindViewById).setHint("");
            } else {
                View viewFindViewById2 = view.findViewById(bri.R3);
                Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
                ((TextView) viewFindViewById2).setHint(zzi.A0);
            }
            return view;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.configwifi.ConfigWifiActivity$configWifiByPb$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0017J\"\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"com/xiaomi/fitness/configwifi/ConfigWifiActivity$configWifiByPb$1", "Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;", "onSuccess", "", "did", "", "type", "", "result", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoSyncResult;", "onError", "code", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nConfigWifiActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigWifiActivity.kt\ncom/xiaomi/fitness/configwifi/ConfigWifiActivity$configWifiByPb$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,708:1\n1#2:709\n*E\n"})
    public static final class AnonymousClass1 implements OnEcoSyncCallback {
        final /* synthetic */ String $bindKey;

        public AnonymousClass1(String str) {
            this.$bindKey = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onError$lambda$1(ConfigWifiActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.displaySaveFail();
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        public void onError(String did, int type, int code) {
            AutoCompleteTextView autoCompleteTextView = ConfigWifiActivity.this.ssid;
            if (autoCompleteTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ssid");
                autoCompleteTextView = null;
            }
            final ConfigWifiActivity configWifiActivity = ConfigWifiActivity.this;
            autoCompleteTextView.post(new Runnable() { // from class: hd4
                @Override // java.lang.Runnable
                public final void run() {
                    ConfigWifiActivity.AnonymousClass1.onError$lambda$1(configWifiActivity);
                }
            });
            ConfigWifiLogExtKt.loge(ConfigWifiActivity.TAG, "configWifiByPb onOnError, did: " + did + " , type: " + type + ", code: " + code + " " + WifiPBApi.INSTANCE.toStrErrorCode(code));
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        @SuppressLint({"SetTextI18n"})
        public void onSuccess(String did, int type, EcoSyncResult result) {
            ConfigWifiLogExtKt.logi(ConfigWifiActivity.TAG, "configWifiByPb success -> did : " + did + " , type : " + type + " , result : " + (result != null ? result.getPacket() : null));
            if (did != null) {
                ConfigWifiActivity.this.configWifiExtra(did, this.$bindKey);
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.configwifi.ConfigWifiActivity$configWifiExtra$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0017J\"\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"com/xiaomi/fitness/configwifi/ConfigWifiActivity$configWifiExtra$1", "Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;", "onSuccess", "", "did", "", "type", "", "result", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoSyncResult;", "onError", "code", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C18541 implements OnEcoSyncCallback {
        public C18541() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onError$lambda$0(ConfigWifiActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.displaySaveFail();
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        public void onError(String did, int type, int code) {
            AutoCompleteTextView autoCompleteTextView = ConfigWifiActivity.this.ssid;
            if (autoCompleteTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ssid");
                autoCompleteTextView = null;
            }
            final ConfigWifiActivity configWifiActivity = ConfigWifiActivity.this;
            autoCompleteTextView.post(new Runnable() { // from class: id4
                @Override // java.lang.Runnable
                public final void run() {
                    ConfigWifiActivity.C18541.onError$lambda$0(configWifiActivity);
                }
            });
            ConfigWifiLogExtKt.loge(ConfigWifiActivity.TAG, "configWifiExtra onOnError, did: " + did + " , type: " + type + ", code: " + code + " " + WifiPBApi.INSTANCE.toStrErrorCode(code));
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        @SuppressLint({"SetTextI18n"})
        public void onSuccess(String did, int type, EcoSyncResult result) {
            ConfigWifiLogExtKt.logi(ConfigWifiActivity.TAG, "configWifiExtra success -> did : " + did + " , type : " + type + " , result : " + (result != null ? result.getPacket() : null));
            ConfigWifiActivity.this.loopConfigWifiStatus(did);
        }
    }

    private final void addVisibilityFunction(CheckBox toggleButton, final EditText passwordEdit) {
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xc4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ConfigWifiActivity.addVisibilityFunction$lambda$15(passwordEdit, compoundButton, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addVisibilityFunction$lambda$15(EditText passwordEdit, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(passwordEdit, "$passwordEdit");
        int selectionStart = passwordEdit.getSelectionStart();
        if (z) {
            passwordEdit.setInputType(144);
        } else {
            passwordEdit.setInputType(129);
        }
        passwordEdit.setSelection(selectionStart);
    }

    private final void cacheWifiInfo(String ssidStr, String identityStr, String passwordStr) {
        CheckBox checkBox = this.rememberPwd;
        if (checkBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rememberPwd");
            checkBox = null;
        }
        if (checkBox.isChecked()) {
            HashMap<String, WiFiInfoCache> map = this.mWiFiInfoCache;
            if (map != null) {
                map.put(ssidStr, new WiFiInfoCache(identityStr, passwordStr));
            }
        } else {
            HashMap<String, WiFiInfoCache> map2 = this.mWiFiInfoCache;
            if (map2 != null) {
                map2.remove(ssidStr);
            }
        }
        String json = new Gson().toJson(this.mWiFiInfoCache);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        ConfigWifiPreference.putString(WIFI_INFO_CACHE, json);
    }

    private final boolean checkWifiInfo(String ssidStr, String passwordStr, String identityStr) {
        WifiInfo$ScanResultProxy wifiInfo$ScanResultProxy;
        if (TextUtils.isEmpty(ssidStr)) {
            ToastUtil.INSTANCE.showToast(zzi.j0);
            return true;
        }
        if (TextUtils.isEmpty(passwordStr)) {
            ToastUtil.INSTANCE.showToast(zzi.W0);
            return true;
        }
        WifiInfo$ScanResultProxy wifiInfo$ScanResultProxy2 = this.scanResultProxy;
        if (Intrinsics.areEqual(ssidStr, wifiInfo$ScanResultProxy2 != null ? wifiInfo$ScanResultProxy2.d() : null) && (wifiInfo$ScanResultProxy = this.scanResultProxy) != null && wifiInfo$ScanResultProxy.f()) {
            Context baseContext = getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
            ToastExtKt.toastShort(baseContext, zzi.C0);
            return true;
        }
        if (this.hasPassword && passwordStr.length() < 8 && !this.mIsEap) {
            ToastUtil.INSTANCE.showToast(zzi.l0);
            return true;
        }
        byte[] bytes = ssidStr.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        if (bytes.length > 32) {
            ToastUtil.INSTANCE.showToast(zzi.k0);
            ConfigWifiLogExtKt.logi("ssid more than 32 bytes");
            return true;
        }
        if (!this.mIsEap) {
            return false;
        }
        if (!TextUtils.isEmpty(identityStr) && !TextUtils.isEmpty(passwordStr)) {
            return false;
        }
        ToastUtil.INSTANCE.showToast(zzi.i0);
        return true;
    }

    private final void configWifiByPb(String ssidStr, String passwordStr, String bindKey) {
        String stringExtra = getIntent().getStringExtra("mac");
        Intrinsics.checkNotNull(stringExtra);
        WifiPBApi.INSTANCE.configWifi(stringExtra, ssidStr, passwordStr, new AnonymousClass1(bindKey));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configWifiExtra(String did, String bindKey) {
        WifiPBApi.INSTANCE.configWifiExtra(did, AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId(), bindKey, new C18541());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void displaySaveFail() {
        this.isSaving = false;
        LinearLayout llConfiguring = ((pj0) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(llConfiguring, "llConfiguring");
        ViewExtKt.setVisible(llConfiguring, false);
        LinearLayout llConfigureFail = ((pj0) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(llConfigureFail, "llConfigureFail");
        ViewExtKt.setVisible(llConfigureFail, true);
        TextView tvNearByRouter = ((pj0) getMBinding()).P;
        Intrinsics.checkNotNullExpressionValue(tvNearByRouter, "tvNearByRouter");
        ViewExtKt.setVisible(tvNearByRouter, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void displaySaveSuccess() {
        this.isSaving = false;
        LinearLayout llConfiguring = ((pj0) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(llConfiguring, "llConfiguring");
        ViewExtKt.setVisible(llConfiguring, false);
        LinearLayout llConfigureSuccess = ((pj0) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(llConfigureSuccess, "llConfigureSuccess");
        ViewExtKt.setVisible(llConfigureSuccess, true);
        TextView tvNearByRouter = ((pj0) getMBinding()).P;
        Intrinsics.checkNotNullExpressionValue(tvNearByRouter, "tvNearByRouter");
        ViewExtKt.setVisible(tvNearByRouter, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void displaySavingUI() {
        this.isSaving = true;
        LinearLayout llConfiguring = ((pj0) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(llConfiguring, "llConfiguring");
        ViewExtKt.setVisible(llConfiguring, true);
        LinearLayout llInputWifi = ((pj0) getMBinding()).F;
        Intrinsics.checkNotNullExpressionValue(llInputWifi, "llInputWifi");
        ViewExtKt.setVisible(llInputWifi, false);
        TextView tvNearByRouter = ((pj0) getMBinding()).P;
        Intrinsics.checkNotNullExpressionValue(tvNearByRouter, "tvNearByRouter");
        ViewExtKt.setVisible(tvNearByRouter, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBindKey$lambda$6(ConfigWifiActivity this$0, String str, String str2, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ConfigWifiLogExtKt.logi(TAG, "getBindKey onSuccess: " + it);
        this$0.configWifiByPb(str, str2, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBindKey$lambda$7(ConfigWifiActivity this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ConfigWifiLogExtKt.loge(TAG, "getBindKey error: " + it);
        AnyExtKt.main$default(null, new ConfigWifiActivity$getBindKey$2$1(this$0, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseActivity getContext() {
        return this;
    }

    private final boolean getSaveWifiPassword() {
        return ConfigWifiPreference.getBoolean(KEY_SAVE_WIFI_PASSWORD, false);
    }

    private final String getTargetMac(String address) {
        if (address == null) {
            return "";
        }
        CharSequence charSequenceSubSequence = address.subSequence(address.length() - 2, address.length());
        CharSequence charSequenceSubSequence2 = address.subSequence(0, address.length() - 2);
        Intrinsics.checkNotNull(charSequenceSubSequence, "null cannot be cast to non-null type kotlin.String");
        return ((Object) charSequenceSubSequence2) + Integer.toHexString((int) (Long.parseLong((String) charSequenceSubSequence, 16) + ((long) 2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initConfigFailView() {
        CharSequence text = ((pj0) getMBinding()).N.getText();
        SpannableString spannableString = new SpannableString(text.toString());
        spannableString.setSpan(new UnderlineSpan(), 0, text.length(), 0);
        ((pj0) getMBinding()).N.setText(spannableString);
        ((pj0) getMBinding()).N.setOnClickListener(new View.OnClickListener() { // from class: vc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfigWifiActivity.initConfigFailView$lambda$3(this.f36734a, view);
            }
        });
        ((pj0) getMBinding()).R.setOnClickListener(new View.OnClickListener() { // from class: wc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfigWifiActivity.initConfigFailView$lambda$4(this.f37828a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initConfigFailView$lambda$3(ConfigWifiActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0.getContext(), (Class<?>) ConfigWifiTimeoutActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initConfigFailView$lambda$4(ConfigWifiActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LinearLayout llConfigureFail = ((pj0) this$0.getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(llConfigureFail, "llConfigureFail");
        ViewExtKt.setVisible(llConfigureFail, false);
        LinearLayout llInputWifi = ((pj0) this$0.getMBinding()).F;
        Intrinsics.checkNotNullExpressionValue(llInputWifi, "llInputWifi");
        ViewExtKt.setVisible(llInputWifi, true);
        this$0.alreadyFoundDevice = false;
        this$0.alreadyGetResult = false;
        this$0.alreadyStart = false;
        this$0.isSaving = false;
    }

    private final void initSsid() {
        AutoCompleteTextView autoCompleteTextView = this.ssid;
        CheckBox checkBox = null;
        if (autoCompleteTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ssid");
            autoCompleteTextView = null;
        }
        autoCompleteTextView.setDropDownAnchor(bri.S3);
        AutoCompleteTextView autoCompleteTextView2 = this.ssid;
        if (autoCompleteTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ssid");
            autoCompleteTextView2 = null;
        }
        autoCompleteTextView2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: sc4
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                ConfigWifiActivity.initSsid$lambda$13(this.f33500a, adapterView, view, i, j);
            }
        });
        AutoCompleteTextView autoCompleteTextView3 = this.ssid;
        if (autoCompleteTextView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ssid");
            autoCompleteTextView3 = null;
        }
        autoCompleteTextView3.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.configwifi.ConfigWifiActivity.initSsid.2
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                Intrinsics.checkNotNullParameter(s, "s");
                AutoCompleteTextView autoCompleteTextView4 = ConfigWifiActivity.this.ssid;
                AutoCompleteTextView autoCompleteTextView5 = null;
                if (autoCompleteTextView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ssid");
                    autoCompleteTextView4 = null;
                }
                String string = autoCompleteTextView4.getText().toString();
                RelativeLayout relativeLayout = ConfigWifiActivity.this.identityContainer;
                if (relativeLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("identityContainer");
                    relativeLayout = null;
                }
                relativeLayout.setVisibility(8);
                ConfigWifiActivity.this.mIsEap = false;
                if (!TextUtils.isEmpty(string)) {
                    WifiInfo$ScanResultProxy wifiInfo$ScanResultProxyForeachWifiListAndUpdateWifiInfo = ConfigWifiActivity.this.foreachWifiListAndUpdateWifiInfo(string, ConfigWifiActivity.this.getContext().getIntent().getParcelableArrayListExtra("WIFI_LIST"));
                    if (wifiInfo$ScanResultProxyForeachWifiListAndUpdateWifiInfo != null) {
                        ConfigWifiActivity.this.mIsEap = wifiInfo$ScanResultProxyForeachWifiListAndUpdateWifiInfo.g();
                        RelativeLayout relativeLayout2 = ConfigWifiActivity.this.identityContainer;
                        if (relativeLayout2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("identityContainer");
                            relativeLayout2 = null;
                        }
                        relativeLayout2.setVisibility(ConfigWifiActivity.this.mIsEap ? 0 : 8);
                        RelativeLayout relativeLayout3 = ConfigWifiActivity.this.passwordContainer;
                        if (relativeLayout3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("passwordContainer");
                            relativeLayout3 = null;
                        }
                        relativeLayout3.setVisibility(wifiInfo$ScanResultProxyForeachWifiListAndUpdateWifiInfo.e() ? 0 : 8);
                        CheckBox checkBox2 = ConfigWifiActivity.this.rememberPwd;
                        if (checkBox2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("rememberPwd");
                            checkBox2 = null;
                        }
                        checkBox2.setVisibility(wifiInfo$ScanResultProxyForeachWifiListAndUpdateWifiInfo.e() ? 0 : 8);
                    } else {
                        RelativeLayout relativeLayout4 = ConfigWifiActivity.this.identityContainer;
                        if (relativeLayout4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("identityContainer");
                            relativeLayout4 = null;
                        }
                        relativeLayout4.setVisibility(8);
                        RelativeLayout relativeLayout5 = ConfigWifiActivity.this.passwordContainer;
                        if (relativeLayout5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("passwordContainer");
                            relativeLayout5 = null;
                        }
                        relativeLayout5.setVisibility(0);
                        CheckBox checkBox3 = ConfigWifiActivity.this.rememberPwd;
                        if (checkBox3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("rememberPwd");
                            checkBox3 = null;
                        }
                        checkBox3.setVisibility(0);
                    }
                }
                AutoCompleteTextView autoCompleteTextView6 = ConfigWifiActivity.this.ssid;
                if (autoCompleteTextView6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ssid");
                } else {
                    autoCompleteTextView5 = autoCompleteTextView6;
                }
                autoCompleteTextView5.setSelection(string.length());
                ConfigWifiActivity.this.afterSSID = s.toString();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Intrinsics.checkNotNullParameter(s, "s");
                ConfigWifiActivity.this.beforeSSID = s.toString();
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Intrinsics.checkNotNullParameter(s, "s");
            }
        });
        this.mWiFiInfoCache = (HashMap) new Gson().fromJson(ConfigWifiPreference.getString(WIFI_INFO_CACHE, "{}"), new TypeToken<HashMap<String, WiFiInfoCache>>() { // from class: com.xiaomi.fitness.configwifi.ConfigWifiActivity$initSsid$token$1
        }.getType());
        CheckBox checkBox2 = this.rememberPwd;
        if (checkBox2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rememberPwd");
            checkBox2 = null;
        }
        checkBox2.setChecked(getSaveWifiPassword());
        CheckBox checkBox3 = this.rememberPwd;
        if (checkBox3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rememberPwd");
        } else {
            checkBox = checkBox3;
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: yc4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ConfigWifiActivity.initSsid$lambda$14(this.f40033a, compoundButton, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSsid$lambda$13(ConfigWifiActivity this$0, AdapterView adapterView, View view, int i, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object itemAtPosition = adapterView.getItemAtPosition(i);
        Intrinsics.checkNotNull(itemAtPosition, "null cannot be cast to non-null type com.xiaomi.fitness.configwifi.WifiInfo.ScanResultProxy");
        this$0.updateUIByWifiInfo((WifiInfo$ScanResultProxy) itemAtPosition);
        EditText editText = null;
        if (this$0.mIsEap) {
            EditText editText2 = this$0.identity;
            if (editText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(HTTP.IDENTITY_CODING);
                editText2 = null;
            }
            editText2.requestFocus();
            EditText editText3 = this$0.identity;
            if (editText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(HTTP.IDENTITY_CODING);
                editText3 = null;
            }
            EditText editText4 = this$0.identity;
            if (editText4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(HTTP.IDENTITY_CODING);
            } else {
                editText = editText4;
            }
            editText3.setSelection(editText.getText().toString().length());
            return;
        }
        EditText editText5 = this$0.password;
        if (editText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("password");
            editText5 = null;
        }
        editText5.requestFocus();
        EditText editText6 = this$0.password;
        if (editText6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("password");
            editText6 = null;
        }
        EditText editText7 = this$0.password;
        if (editText7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("password");
        } else {
            editText = editText7;
        }
        editText6.setSelection(editText.getText().toString().length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSsid$lambda$14(ConfigWifiActivity this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setSaveWifiPassword(z);
    }

    private final void initSsidAdapter() {
        ArrayList arrayList = new ArrayList();
        List<ScanResult> listC = xhr.c(getContext());
        this.mWifiList = listC;
        if (!listC.isEmpty()) {
            Iterator<ScanResult> it = this.mWifiList.iterator();
            Intrinsics.checkNotNull(it, "null cannot be cast to non-null type kotlin.collections.MutableIterator<android.net.wifi.ScanResult>");
            Iterator itAsMutableIterator = TypeIntrinsics.asMutableIterator(it);
            while (itAsMutableIterator.hasNext()) {
                ScanResult scanResult = (ScanResult) itAsMutableIterator.next();
                if (!support5G() && xhr.e(scanResult.frequency)) {
                    itAsMutableIterator.remove();
                } else if (!supportEap() && xhr.f(scanResult.capabilities)) {
                    itAsMutableIterator.remove();
                }
            }
        } else {
            this.mWifiList = new ArrayList();
            xhr.h(getContext());
        }
        Iterator<ScanResult> it2 = this.mWifiList.iterator();
        while (it2.hasNext()) {
            WifiInfo$ScanResultProxy wifiInfo$ScanResultProxy = new WifiInfo$ScanResultProxy(it2.next());
            if (!arrayList.contains(wifiInfo$ScanResultProxy)) {
                arrayList.add(wifiInfo$ScanResultProxy);
            }
        }
        ConfigWifiLogExtKt.logi("StepWiFi getWiFiList:" + arrayList.size());
        AutoCompleteTextView autoCompleteTextView = this.ssid;
        if (autoCompleteTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ssid");
            autoCompleteTextView = null;
        }
        autoCompleteTextView.setAdapter(new WifiAdapter(getContext(), gui.c0, bri.R3, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loopConfigWifiStatus(final String did) {
        if (did == null) {
            ConfigWifiLogExtKt.loge(TAG, "loopConfigWifiStatus, did == null");
            return;
        }
        ConfigWifiLogExtKt.logv(TAG, "loopConfigWifiStatus, start loop");
        o4h<Long> o4hVarH = o4h.A(5L, TimeUnit.SECONDS).U(24L).H(ua1.c());
        final Function1 function1 = new Function1() { // from class: zc4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ConfigWifiActivity.loopConfigWifiStatus$lambda$8(did, this, (Long) obj);
            }
        };
        bg4<? super Long> bg4Var = new bg4() { // from class: ad4
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                ConfigWifiActivity.loopConfigWifiStatus$lambda$9(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: bd4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ConfigWifiActivity.loopConfigWifiStatus$lambda$10((Throwable) obj);
            }
        };
        this.subscribe = o4hVarH.P(bg4Var, new bg4() { // from class: cd4
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                ConfigWifiActivity.loopConfigWifiStatus$lambda$11(function2, obj);
            }
        }, new vc0() { // from class: dd4
            @Override // defpackage.vc0
            public final void run() {
                ConfigWifiActivity.loopConfigWifiStatus$lambda$12(this.f15393a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loopConfigWifiStatus$lambda$10(Throwable th) {
        ConfigWifiLogExtKt.loge("loopConfigWifiStatus error", th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loopConfigWifiStatus$lambda$11(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loopConfigWifiStatus$lambda$12(ConfigWifiActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ConfigWifiLogExtKt.loge(TAG, "loopConfigWifiStatus timeout");
        this$0.displaySaveFail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loopConfigWifiStatus$lambda$8(String str, ConfigWifiActivity this$0, Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WifiPBApi.INSTANCE.getWifi(str, new ConfigWifiActivity$loopConfigWifiStatus$1$1(this$0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loopConfigWifiStatus$lambda$9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(ConfigWifiActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AutoCompleteTextView autoCompleteTextView = this$0.ssid;
        EditText editText = null;
        if (autoCompleteTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ssid");
            autoCompleteTextView = null;
        }
        c1e.a(autoCompleteTextView);
        EditText editText2 = this$0.password;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("password");
        } else {
            editText = editText2;
        }
        c1e.a(editText);
        SelectWifiActivity.INSTANCE.startSelectWifiActivityForResult(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(ConfigWifiActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onNextStepClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(ConfigWifiActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void onNextStepClick() {
        AutoCompleteTextView autoCompleteTextView = this.ssid;
        AutoCompleteTextView autoCompleteTextView2 = null;
        if (autoCompleteTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ssid");
            autoCompleteTextView = null;
        }
        this.ssidStr = autoCompleteTextView.getText().toString();
        EditText editText = this.identity;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HTTP.IDENTITY_CODING);
            editText = null;
        }
        this.identityStr = editText.getText().toString();
        EditText editText2 = this.password;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("password");
            editText2 = null;
        }
        this.passwordStr = editText2.getText().toString();
        AutoCompleteTextView autoCompleteTextView3 = this.ssid;
        if (autoCompleteTextView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ssid");
        } else {
            autoCompleteTextView2 = autoCompleteTextView3;
        }
        c1e.a(autoCompleteTextView2);
        if (checkWifiInfo(this.ssidStr, this.passwordStr, this.identityStr)) {
            return;
        }
        cacheWifiInfo(this.ssidStr, this.identityStr, this.passwordStr);
        displaySavingUI();
        getBindKey(this.ssidStr, this.passwordStr);
    }

    private final void setSaveWifiPassword(boolean result) {
        ConfigWifiPreference.putBoolean(KEY_SAVE_WIFI_PASSWORD, result);
    }

    private final boolean support5G() {
        return true;
    }

    private final boolean supportEap() {
        return false;
    }

    private final void updateCurrentWifi(WifiInfo$ScanResultProxy scanResultProxy) {
        AutoCompleteTextView autoCompleteTextView = this.ssid;
        if (autoCompleteTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ssid");
            autoCompleteTextView = null;
        }
        autoCompleteTextView.setText(scanResultProxy.d());
        updateUIByWifiInfo(scanResultProxy);
    }

    private final void updateUIByWifiInfo(WifiInfo$ScanResultProxy searchResult) {
        String strI = xhr.i(searchResult.d());
        this.hasPassword = searchResult.e();
        this.mIsEap = searchResult.g();
        ConfigWifiLogExtKt.logi("mCurrentSSID=" + strI);
        ConfigWifiLogExtKt.logi("mIsEap=" + this.mIsEap);
        RelativeLayout relativeLayout = this.identityContainer;
        EditText editText = null;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("identityContainer");
            relativeLayout = null;
        }
        relativeLayout.setVisibility(this.mIsEap ? 0 : 8);
        if (this.hasPassword) {
            RelativeLayout relativeLayout2 = this.passwordContainer;
            if (relativeLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("passwordContainer");
                relativeLayout2 = null;
            }
            relativeLayout2.setVisibility(0);
            CheckBox checkBox = this.rememberPwd;
            if (checkBox == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rememberPwd");
                checkBox = null;
            }
            checkBox.setVisibility(0);
            if (this.mIsEap) {
                EditText editText2 = this.identity;
                if (editText2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(HTTP.IDENTITY_CODING);
                    editText2 = null;
                }
                editText2.requestFocus();
                EditText editText3 = this.identity;
                if (editText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(HTTP.IDENTITY_CODING);
                    editText3 = null;
                }
                EditText editText4 = this.identity;
                if (editText4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(HTTP.IDENTITY_CODING);
                    editText4 = null;
                }
                editText3.setSelection(editText4.getText().toString().length());
            } else {
                EditText editText5 = this.password;
                if (editText5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("password");
                    editText5 = null;
                }
                editText5.requestFocus();
                EditText editText6 = this.password;
                if (editText6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("password");
                    editText6 = null;
                }
                EditText editText7 = this.password;
                if (editText7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("password");
                    editText7 = null;
                }
                editText6.setSelection(editText7.getText().toString().length());
            }
        } else {
            RelativeLayout relativeLayout3 = this.passwordContainer;
            if (relativeLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("passwordContainer");
                relativeLayout3 = null;
            }
            relativeLayout3.setVisibility(8);
            CheckBox checkBox2 = this.rememberPwd;
            if (checkBox2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rememberPwd");
                checkBox2 = null;
            }
            checkBox2.setVisibility(8);
            AutoCompleteTextView autoCompleteTextView = this.ssid;
            if (autoCompleteTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ssid");
                autoCompleteTextView = null;
            }
            c1e.a(autoCompleteTextView);
        }
        HashMap<String, WiFiInfoCache> map = this.mWiFiInfoCache;
        if (map == null || !map.containsKey(strI)) {
            EditText editText8 = this.identity;
            if (editText8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(HTTP.IDENTITY_CODING);
                editText8 = null;
            }
            editText8.setText("");
            EditText editText9 = this.password;
            if (editText9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("password");
            } else {
                editText = editText9;
            }
            editText.setText("");
            return;
        }
        HashMap<String, WiFiInfoCache> map2 = this.mWiFiInfoCache;
        Intrinsics.checkNotNull(map2);
        WiFiInfoCache wiFiInfoCache = map2.get(strI);
        if (wiFiInfoCache != null) {
            if (this.hasPassword) {
                EditText editText10 = this.password;
                if (editText10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("password");
                    editText10 = null;
                }
                editText10.setText(wiFiInfoCache.getPassword());
            } else {
                EditText editText11 = this.password;
                if (editText11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("password");
                    editText11 = null;
                }
                editText11.setText("");
            }
            if (this.mIsEap) {
                EditText editText12 = this.identity;
                if (editText12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(HTTP.IDENTITY_CODING);
                } else {
                    editText = editText12;
                }
                editText.setText(wiFiInfoCache.getIdentity());
            }
            ConfigWifiLogExtKt.logi("mCurrentSSID password=" + wiFiInfoCache.getPassword());
        }
    }

    @Nullable
    public final WifiInfo$ScanResultProxy foreachWifiListAndUpdateWifiInfo(@NotNull String ssidStr, @Nullable ArrayList<WifiInfo$ScanResultProxy> wifiList) {
        Intrinsics.checkNotNullParameter(ssidStr, "ssidStr");
        if (gh4.d(wifiList)) {
            return null;
        }
        Intrinsics.checkNotNull(wifiList);
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

    public final void getBindKey(@Nullable final String ssidStr, @Nullable final String passwordStr) {
        RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).getBindKey(new Function1() { // from class: ed4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ConfigWifiActivity.getBindKey$lambda$6(this.f16517a, ssidStr, passwordStr, (String) obj);
            }
        }, new Function1() { // from class: fd4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ConfigWifiActivity.getBindKey$lambda$7(this.f17670a, (ApiException) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return gui.g;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return av1.d;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1) {
            if (data == null) {
                ConfigWifiLogExtKt.loge("BindDeviceInitActivity#onActivityResult data == null");
                return;
            }
            ArrayList<? extends Parcelable> parcelableArrayListExtra = data.getParcelableArrayListExtra("WIFI_LIST");
            Intrinsics.checkNotNull(parcelableArrayListExtra);
            this.scanResultProxy = (WifiInfo$ScanResultProxy) data.getParcelableExtra("SELECTED_WIFI");
            getIntent().putExtra("SELECTED_WIFI", this.scanResultProxy);
            getIntent().putParcelableArrayListExtra("WIFI_LIST", parcelableArrayListExtra);
            WifiInfo$ScanResultProxy wifiInfo$ScanResultProxy = this.scanResultProxy;
            if (wifiInfo$ScanResultProxy != null) {
                updateCurrentWifi(wifiInfo$ScanResultProxy);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.configwifi.Hilt_ConfigWifiActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setTitle(getString(zzi.B0));
        }
        setActionBarDisplayable(true);
        setActionBarExpandState(0);
        setActionBarResizeable(false);
        this.passwordToggle = ((pj0) getMBinding()).I;
        this.password = ((pj0) getMBinding()).G;
        this.ssid = ((pj0) getMBinding()).L;
        this.identity = ((pj0) getMBinding()).A;
        this.identityContainer = ((pj0) getMBinding()).B;
        this.passwordContainer = ((pj0) getMBinding()).H;
        this.rememberPwd = ((pj0) getMBinding()).J;
        CheckBox checkBox = this.passwordToggle;
        EditText editText = null;
        if (checkBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("passwordToggle");
            checkBox = null;
        }
        EditText editText2 = this.password;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("password");
        } else {
            editText = editText2;
        }
        addVisibilityFunction(checkBox, editText);
        initSsid();
        this.isNotifying = false;
        ((pj0) getMBinding()).S.setOnClickListener(new View.OnClickListener() { // from class: gd4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfigWifiActivity.onCreate$lambda$0(this.f18848a, view);
            }
        });
        ((pj0) getMBinding()).Q.setOnClickListener(new View.OnClickListener() { // from class: tc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfigWifiActivity.onCreate$lambda$1(this.f34558a, view);
            }
        });
        updateUIByWifiInfo();
        ((pj0) getMBinding()).O.setOnClickListener(new View.OnClickListener() { // from class: uc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfigWifiActivity.onCreate$lambda$2(this.f35613a, view);
            }
        });
        initConfigFailView();
    }

    @Override // com.xiaomi.fitness.configwifi.Hilt_ConfigWifiActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        AutoCompleteTextView autoCompleteTextView = this.ssid;
        if (autoCompleteTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ssid");
            autoCompleteTextView = null;
        }
        c1e.a(autoCompleteTextView);
        jz6 jz6Var = this.subscribe;
        if (jz6Var != null) {
            jz6Var.dispose();
        }
        getWindow().setSoftInputMode(3);
        super.onDestroy();
    }

    private final void updateUIByWifiInfo() {
        WifiInfo$ScanResultProxy wifiInfo$ScanResultProxy;
        AutoCompleteTextView autoCompleteTextView = this.ssid;
        AutoCompleteTextView autoCompleteTextView2 = null;
        if (autoCompleteTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ssid");
            autoCompleteTextView = null;
        }
        if (TextUtils.isEmpty(autoCompleteTextView.getText().toString())) {
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            if (intent.getBooleanExtra("FROM_SELECT_WIFI", false)) {
                wifiInfo$ScanResultProxy = (WifiInfo$ScanResultProxy) intent.getParcelableExtra("SELECTED_WIFI");
            } else {
                wifiInfo$ScanResultProxy = (WifiInfo$ScanResultProxy) intent.getParcelableExtra(IPHONE_CURRENT_WIFI);
                if (wifiInfo$ScanResultProxy != null) {
                    this.autoFillSSID = wifiInfo$ScanResultProxy.d();
                }
            }
            if (wifiInfo$ScanResultProxy != null) {
                AutoCompleteTextView autoCompleteTextView3 = this.ssid;
                if (autoCompleteTextView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ssid");
                } else {
                    autoCompleteTextView2 = autoCompleteTextView3;
                }
                autoCompleteTextView2.setText(wifiInfo$ScanResultProxy.d());
                updateUIByWifiInfo(wifiInfo$ScanResultProxy);
            }
        }
    }
}
