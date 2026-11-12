package com.xiaomi.hm.health.thirdbind;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.annotation.StringRes;
import androidx.fragment.app.FragmentActivity;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.identity.auth.alexa.AuthApi;
import com.huami.mifit.analytics.Analytics;
import com.huami.passport.AccountManager;
import com.huami.passport.ErrorCode;
import com.huami.third.googlefit.ui.FuncKt;
import com.huami.third.googlefit.ui.GoogleFitBindActivity;
import com.huami.third.wechat.ui.WeChatBind;
import com.huami.third.wechat.ui.WeChatStartDestination;
import com.huami.third.xiaomi.LoadingView;
import com.huami.third.xiaomi.ui.MiBind;
import com.huami.thirdparty.webauth.ui.AuthType;
import com.huami.thirdparty.webauth.ui.ExtensionKt;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.companion.account.AccountMiTokenUtil;
import com.huami.watch.companion.account.IDeviceTokenManager;
import com.huami.watch.companion.ui.activity.BindLvMiActivity;
import com.huami.watch.companion.ui.activity.BindMiActivity;
import com.huami.watch.companion.util.ThirdPartUtil;
import com.huami.watch.hmwatchmanager.R;
import com.huami.web.container.event.EventWebViewExit;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadmoreListener;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.xiaomi.hm.health.BuildConfig;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.milipro.model.BlePairMode;
import com.xiaomi.hm.health.bt.profile.milipro.model.BlePairStatus;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.speech.speech.ui.DialogUtilsKt;
import com.xiaomi.hm.health.speech.utils.CheckDeviceSupportAlexaKt;
import com.xiaomi.hm.health.thirdbind.Result;
import com.xiaomi.hm.health.thirdbind.ThirdBindActivity;
import com.xiaomi.hm.health.ui.UnifyTitleBarStyle;
import com.xiaomi.hm.health.utils.HMPropertyUtil;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
public class ThirdBindActivity extends BaseTitleActivity implements AdapterView.OnItemClickListener {
    public static final String ALEXA_AUTHORIZED_DIALOG_TAG = "dialog.alexa.authorized";
    private static final String D = "ThirdBindActivity";
    private static final String E = "com.sina.weibo";
    private static final String F = "alipays://platformapi/startApp";
    private ListView A;
    private SmartRefreshLayout B;
    private com.xiaomi.hm.health.thirdbind.a C;
    private ThirdBindAdapter x;
    private LoadingDialog y;
    private IDeviceTokenManager z = (IDeviceTokenManager) KoinJavaComponent.inject(IDeviceTokenManager.class).getValue();

    public class a extends HMCallback<BlePairStatus> {
        public a() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(BlePairStatus blePairStatus) {
            ThirdBindActivity.this.hideLoadingDialog();
            if (blePairStatus != null && blePairStatus.getPaired() && blePairStatus.getPairMode() == BlePairMode.LEGACY) {
                ThirdBindActivity.this.startActivity(new Intent(ThirdBindActivity.this, (Class<?>) AlexaPairTipsActivity.class));
            } else {
                DialogUtilsKt.gotoAlexaAuthPage(ThirdBindActivity.this);
            }
        }
    }

    public class b implements LoadingView {
        public b() {
        }

        @Override // com.huami.third.xiaomi.LoadingView
        public void hideLoading(@NotNull FragmentActivity fragmentActivity) {
            ThirdBindActivity.this.hideLoadingDialog();
        }

        @Override // com.huami.third.xiaomi.LoadingView
        public void showLoading(@NotNull FragmentActivity fragmentActivity) {
            ThirdBindActivity.this.Y(R.string.author_ing);
        }
    }

    private void B() {
        ExtensionKt.webAuth(this, AuthType.Relive, AccountManager.getDefault(this).getCurrentUid(), BuildConfig.RELIVE_CLIENT_ID, BuildConfig.RELIVE_THIRD_NAME, "", "", "");
    }

    private void C() {
        AccountManager accountManager = AccountManager.getDefault(this);
        String currentUid = accountManager.getCurrentUid();
        String countryCode = accountManager.getCountryCode();
        String currentRegion = accountManager.getCurrentRegion();
        if (currentUid != null) {
            ExtensionKt.webAuth(this, AuthType.Strava, currentUid, com.huami.watch.companion.BuildConfig.STRAVA_CLIENT_ID, com.huami.watch.companion.BuildConfig.STRAVA_THIRD_NAME, countryCode == null ? "" : countryCode, currentRegion == null ? "" : currentRegion, com.huami.watch.companion.BuildConfig.STRAVA_NAME);
        }
    }

    private boolean D(Context context) {
        return new Intent("android.intent.action.VIEW", Uri.parse(F)).resolveActivity(context.getPackageManager()) != null;
    }

    private boolean E() {
        HMBaseDevice hMBaseDeviceF = F();
        if (hMBaseDeviceF == null) {
            return false;
        }
        HMDeviceSource mDeviceSource = hMBaseDeviceF.getMDeviceSource();
        String serialNumber = hMBaseDeviceF.getDeviceInfo() != null ? hMBaseDeviceF.getDeviceInfo().getSerialNumber() : "";
        if (!this.z.isSupportDeviceToken(mDeviceSource)) {
            return false;
        }
        if (this.z.hasXiaoAiDeviceToken(mDeviceSource, serialNumber)) {
            BindMiActivity.start(this, mDeviceSource.getValue(), serialNumber);
            return true;
        }
        Z(mDeviceSource, serialNumber);
        return true;
    }

    private HMBaseDevice F() {
        return HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        if (!J()) {
            DialogUtilsKt.gotoAlexaAuthPage(this);
            return;
        }
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        Y(R.string.wait);
        hMMiLiProDevice.getBlePairStatus(new a());
    }

    private void H() {
        try {
            Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: yn7
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.O();
                }
            });
        } catch (Exception e) {
            HMLog.w("speech", e.getMessage(), new Object[0]);
        }
    }

    private void I(boolean isFirstPage) {
        if (isFirstPage) {
            hideLoadingDialog();
        } else {
            this.B.finishLoadmore();
        }
    }

    private boolean J() {
        return ConfigHelperKt.hasMiliFeature(Feature.ALEXA_PAIR_DEVICE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit K(Boolean bool) {
        if (!bool.booleanValue()) {
            return null;
        }
        AccountMiTokenUtil.broadcastMiAuthState(this, true);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit L() {
        G();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M() {
        DialogUtilsKt.showAlexaAuthLawDialog(this, getSupportFragmentManager(), new Function0() { // from class: eo7
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return this.a.L();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        DialogUtilsKt.showAlexaNotSupportDialog(this, getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O() {
        if (((AuthApi) KoinJavaComponent.get(AuthApi.class)).isLogin()) {
            runOnUiThread(new Runnable() { // from class: zn7
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.G();
                }
            });
        } else if (CheckDeviceSupportAlexaKt.isLoginCountrySupportAlexa(getApplicationContext())) {
            runOnUiThread(new Runnable() { // from class: bo7
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.M();
                }
            });
        } else {
            runOnUiThread(new Runnable() { // from class: ao7
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.N();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(RefreshLayout refreshLayout) {
        loadData(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit Q(boolean z, ArrayList arrayList, Result result) {
        I(z);
        if (result != null) {
            arrayList.addAll(result.items());
            if (result.isFinished()) {
                this.B.setEnableLoadmore(false);
            }
        }
        this.x.updateData(arrayList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(final boolean z) {
        final ArrayList arrayList = new ArrayList(z ? this.C.a() : this.x.getItems());
        ThirdAuthManager.INSTANCE.queryAuthorizeApps(z, new Function1() { // from class: xn7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.a.Q(z, arrayList, (Result) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit S() {
        HMPropertyUtil.setThirdPartyAuth("google", true);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit T() {
        HMPropertyUtil.setThirdPartyAuth("google", false);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit U(HMDeviceSource hMDeviceSource, String str) {
        hideLoadingDialog();
        Toast.makeText(this, getString(R.string.author_success), 0).show();
        BindMiActivity.start(this, hMDeviceSource.getValue(), str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit V() {
        hideLoadingDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit W(ErrorCode errorCode) {
        hideLoadingDialog();
        Toast.makeText(this, getString(R.string.mi_author_code_failed), 0).show();
        return Unit.INSTANCE;
    }

    private void X(boolean isFirstPage) {
        if (isFirstPage) {
            Y(R.string.loading);
            this.B.setEnableLoadmore(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(@StringRes int tips) {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(tips));
        this.y = loadingDialogShowDialog;
        loadingDialogShowDialog.setCancelable(true);
        this.y.show();
    }

    private void Z(final HMDeviceSource source, final String sn) {
        Y(R.string.author_ing);
        this.z.authorizeDeviceToken(this, source, sn, new Function0() { // from class: fo7
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return this.a.U(source, sn);
            }
        }, new Function0() { // from class: do7
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return this.a.V();
            }
        }, new Function1() { // from class: vn7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.a.W((ErrorCode) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideLoadingDialog() {
        LoadingDialog loadingDialog = this.y;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
            this.y = null;
        }
    }

    private void initViews() {
        if (GlobalConfig.get().isBuildMidong()) {
            getTitleTextView().setTextSize(17.0f);
        }
        this.A = (ListView) findViewById(R.id.listview);
        this.B = (SmartRefreshLayout) findViewById(R.id.refresh_layout);
        this.C = new com.xiaomi.hm.health.thirdbind.a(this);
        ThirdBindAdapter thirdBindAdapter = new ThirdBindAdapter(this);
        this.x = thirdBindAdapter;
        this.A.setAdapter((ListAdapter) thirdBindAdapter);
        this.A.setOnItemClickListener(this);
        this.B.setEnableRefresh(false);
        this.B.setOnLoadmoreListener(new OnLoadmoreListener() { // from class: tn7
            @Override // com.scwang.smartrefresh.layout.listener.OnLoadmoreListener
            public final void onLoadmore(RefreshLayout refreshLayout) {
                this.a.P(refreshLayout);
            }
        });
    }

    private void loadData(final boolean isFirstPage) {
        X(isFirstPage);
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: co7
            @Override // java.lang.Runnable
            public final void run() {
                this.a.R(isFirstPage);
            }
        });
    }

    public void bindMiAccount() {
        if (E()) {
            return;
        }
        MiBind.open(this, new b(), new Function1() { // from class: wn7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.a.K((Boolean) obj);
            }
        });
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_bind);
        UnifyTitleBarStyle.setUnifyTitleStyle(this, getString(R.string.title_activity_third_bind));
        initViews();
        loadData(true);
        EventBus.getDefault().registerSticky(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(EventWebViewExit event) {
        loadData(true);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (!NetUtil.isNetworkConnected(this)) {
            IconToast.showError(this, getString(R.string.no_network_connection));
            return;
        }
        ThirdAppItem thirdAppItem = (ThirdAppItem) this.x.getItem(position);
        if (thirdAppItem instanceof ThirdAuthItem) {
            ThirdAuthManager.INSTANCE.navigateAuthDetail(this, thirdAppItem.getId());
            return;
        }
        Intent intent = null;
        if (!"qq".equals(thirdAppItem.getId())) {
            if ("weixin".equals(thirdAppItem.getId())) {
                if (!WXAPIFactory.createWXAPI(this, ThirdPartUtil.getWeixinId()).isWXAppInstalled()) {
                    CustomToast.makeText(this, R.string.install_weixin_tips, 0).show();
                    return;
                }
                WeChatBind.open(this, WeChatStartDestination.Entry);
            } else if (com.xiaomi.hm.health.thirdbind.a.d.equals(thirdAppItem.getId())) {
                intent = new Intent(this, (Class<?>) GoogleFitBindActivity.class);
                FuncKt.setGoogleFitAuthSuccessCallback(new Function0() { // from class: un7
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return ThirdBindActivity.S();
                    }
                });
                FuncKt.setGoogleFitRevokeSuccessCallback(new Function0() { // from class: go7
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return ThirdBindActivity.T();
                    }
                });
                Analytics.event(this, StatEvent.EventId.THIRDACCESS_OUT, StatEvent.EventParams.THIRDACCESS_OUT_LISTGOOGLEFITDETAIL);
            } else if ("alipay".equals(thirdAppItem.getId())) {
                if (!D(this)) {
                    CustomToast.makeText(this, R.string.bind_alipay_install, 0).show();
                    return;
                }
                AlipayBindEntry.open(this);
            } else if (com.xiaomi.hm.health.thirdbind.a.f.equals(thirdAppItem.getId())) {
                C();
            } else if (com.xiaomi.hm.health.thirdbind.a.g.equals(thirdAppItem.getId())) {
                intent = new Intent(this, (Class<?>) BindLvMiActivity.class);
            } else if (com.xiaomi.hm.health.thirdbind.a.h.equals(thirdAppItem.getId())) {
                H();
            } else if ("miui".equals(thirdAppItem.getId())) {
                bindMiAccount();
            } else if (com.xiaomi.hm.health.thirdbind.a.j.equals(thirdAppItem.getId())) {
                B();
            }
        }
        if (intent != null) {
            startActivity(intent);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.x.notifyDataSetChanged();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
