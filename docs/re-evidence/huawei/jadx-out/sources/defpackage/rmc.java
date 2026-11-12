package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.views.ColumnLinearLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.beans.TitleBean;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.device.activity.appmarket.HwSmartAppMarketLoadingActivity;
import com.huawei.ui.device.utlis.BluetoothPermisionUtils;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.CardDeviceFragment;
import com.huawei.ui.homehealth.device.adapter.CardDeviceAdapter;
import com.huawei.ui.homehealth.device.adapter.DeviceRecommendedAdapter;
import com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity;
import com.huawei.ui.homehealth.device.devicelist.MoreSportDeviceActivity;
import com.huawei.ui.homehealth.device.sitting.RecommendedItem;
import com.huawei.ui.homehealth.device.view.DeviceItemDecoration;
import com.huawei.ui.homehealth.device.view.RecommendItemDecoration;
import com.huawei.ui.homehealth.syncwifi.WifiConnectReceiver;
import com.huawei.ui.homewear21.home.MusicSecondaryMenuActivity;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
import com.huawei.watchface.mvp.ui.activity.PrivacyStatementActivity;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.DeviceUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class rmc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static rmc f47466a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f47467c = new Object();
    private CustomTextAlertDialog e;
    private CustomTextAlertDialog f = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTextAlertDialog f47468b = null;
    private NoTitleCustomAlertDialog h = null;
    private NoTitleCustomAlertDialog d = null;
    private final BroadcastReceiver g = new BroadcastReceiver() { // from class: rmc.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("CardDeviceFragment CardDeviceHelper", "mWatchfaceBroadcastReceiver intent is null");
            } else if (!PrivacyStatementActivity.ACTION_WATCHFACE_SERVICE_DISABLE.equals(intent.getAction())) {
                LogUtil.j("CardDeviceFragment CardDeviceHelper", "mNonLocalBroadcastReceiver()  intent : ", intent.getAction());
            } else {
                if (Utils.k()) {
                    return;
                }
                mhs.a().setSwitchSetting("watch_face_privacy_service_status", "2", null);
            }
        }
    };

    private rmc() {
    }

    public void a(rum.e eVar, CardDeviceFragment cardDeviceFragment, int i, int i2) {
        if (cardDeviceFragment == null) {
            LogUtil.j("CardDeviceFragment CardDeviceHelper", "checkHonorPrivacyType fragment == null");
            return;
        }
        if (i2 == 1) {
            if (i < 0 || i >= cardDeviceFragment.aj.size()) {
                return;
            }
            a(cardDeviceFragment, i, (View) null);
            return;
        }
        if (i2 == 2) {
            if (eVar == null || eVar.e() == null || !(eVar.e().i() instanceof dxy)) {
                return;
            }
            a(cardDeviceFragment, (dxy) eVar.e().i());
            return;
        }
        if (i2 != 5) {
            LogUtil.j("CardDeviceFragment CardDeviceHelper", "mHonorPrivacyCallback clickType is unknown.");
            return;
        }
        if (eVar == null) {
            LogUtil.j("CardDeviceFragment CardDeviceHelper", "CLICK_DEVICE_RECOMMENDED_ZONE parameter == null");
            return;
        }
        RecommendedItem recommendedItemC = eVar.c();
        if (recommendedItemC != null) {
            LogUtil.a("CardDeviceFragment CardDeviceHelper", "mHonorPrivacyCallback id: ", Integer.valueOf(recommendedItemC.getId()));
            c(cardDeviceFragment, recommendedItemC.getId());
        }
    }

    public void b(Context context, Intent intent, CardDeviceFragment cardDeviceFragment, Handler handler) {
        if ("com.huawei.bone.action.DEVICE_UPGRADING".equals(intent.getAction()) || "action_ota_check_new_version_state".equals(intent.getAction())) {
            LogUtil.a("CardDeviceFragment CardDeviceHelper", "mNonLocalBroadcastReceiver ACTION_DEVICE_UPGRADING ACTION_OTA_CHECK_NEW_VERSION_STATE");
            cardDeviceFragment.f.notifyDataSetChanged();
            return;
        }
        if ("com.huawei.bone.action.DEVICE_THIRD_DELETE".equals(intent.getAction())) {
            handler.sendEmptyMessage(35);
            return;
        }
        if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) || "com.huawei.health.action.CLOUD_CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
            cardDeviceFragment.b(intent, handler);
            cardDeviceFragment.a(intent);
            return;
        }
        if ("com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS".equals(intent.getAction()) || "com.huawei.bone.action.UI_DEVICE_LIST_CHANGED".equals(intent.getAction())) {
            cardDeviceFragment.f();
            return;
        }
        if ("broadcast_receiver_user_setting".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("pairGuideSelectAddress");
            LogUtil.a("CardDeviceFragment CardDeviceHelper", "mNonLocalBroadcastReceiver() device Pair failed");
            rtk.a(stringExtra);
        } else {
            if ("com.huawei.bone.action.SYSTEM_BLUETOOTH_UNBIND_DEVICE".equals(intent.getAction())) {
                try {
                    String stringExtra2 = intent.getStringExtra("DEVICE_SECURITY_UUID");
                    LogUtil.a("CardDeviceFragment CardDeviceHelper", "SYSTEM_BLUETOOTH_UNBIND_DEVICE securityUuid:", CommonUtil.n(stringExtra2));
                    tfi.c(stringExtra2 + "#ANDROID21");
                    return;
                } catch (ClassCastException unused) {
                    LogUtil.e("CardDeviceFragment CardDeviceHelper", "ClassCastException");
                    return;
                }
            }
            if ("com.huawei.health.action.PAIR_DEVICE_SUCCESS".equals(intent.getAction())) {
                rtk.c(cardDeviceFragment.q);
            } else {
                LogUtil.a("CardDeviceFragment CardDeviceHelper", "mNonLocalBroadcastReceiver()  intent : ", intent.getAction());
            }
        }
    }

    public static rmc e() {
        synchronized (f47467c) {
            if (f47466a == null) {
                f47466a = new rmc();
            }
        }
        return f47466a;
    }

    public void e(CardDeviceFragment cardDeviceFragment) {
        if (cardDeviceFragment == null) {
            LogUtil.a("CardDeviceFragment CardDeviceHelper", "setAllBroadcastReceiver deviceCardView or cardDeviceFragment is null");
            return;
        }
        if (CommonUtil.ck()) {
            lvk.b("CardDeviceFragment CardDeviceHelper", cardDeviceFragment.f25174b);
            rtk.a(cardDeviceFragment.al);
            rtk.e(cardDeviceFragment.l);
            rtk.d(cardDeviceFragment.k);
            if (!SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false)) {
                rtk.b(this.g, cardDeviceFragment.bc);
            }
            rtk.d(cardDeviceFragment.getActivity(), cardDeviceFragment.ah, cardDeviceFragment.ab);
            tqp.e(cardDeviceFragment.o, "com.huawei.appmarket.action.REFRESH_DEVICE_APP_UPDATE");
            if (CommonUtil.at()) {
                rtk.l();
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(HwWatchFaceApi.ACTION_FOREGROUND_STATUS);
            intentFilter.addAction("com.huawei.health.action.SCREEN_SHOT_PERMISSION_QUEST");
            BroadcastManagerUtil.d(cardDeviceFragment.h, cardDeviceFragment.ax, intentFilter);
        }
    }

    public void i(CardDeviceFragment cardDeviceFragment, View view) {
        ViewStub viewStub;
        if (view == null || cardDeviceFragment == null) {
            LogUtil.a("CardDeviceFragment CardDeviceHelper", "initDeviceCardView deviceCardView or fragment is null");
            return;
        }
        cardDeviceFragment.g = (LinearLayout) qsp.a(view, R.id.auto_switch_layout);
        cardDeviceFragment.n = (HealthCardView) qsp.a(view, R.id.device_card_normal);
        cardDeviceFragment.ay = (RelativeLayout) qsp.a(view, R.id.vmall_recommended_layout);
        cardDeviceFragment.aw = (HealthRecycleView) qsp.a(view, R.id.card_device_list);
        cardDeviceFragment.ba = (HealthViewPager) qsp.a(view, R.id.view_pager_vip);
        cardDeviceFragment.p = (HealthDotsPageIndicator) qsp.a(view, R.id.indicator_vip);
        cardDeviceFragment.t = (LinearLayout) qsp.a(view, R.id.device_function_layout);
        cardDeviceFragment.s = (HealthCardView) qsp.a(view, R.id.device_function_card);
        cardDeviceFragment.ap = (HealthRecycleView) qsp.a(view, R.id.recommended_list);
        cardDeviceFragment.as = (HealthRecycleView) qsp.a(view, R.id.vmall_recommended_list);
        cardDeviceFragment.ao = (RelativeLayout) qsp.a(view, R.id.recommended_layout);
        cardDeviceFragment.ak = (LinearLayout) qsp.a(view, R.id.device_card_list_more_add);
        cardDeviceFragment.an = (LinearLayout) qsp.a(view, R.id.no_device_marketing_layout);
        cardDeviceFragment.d = (LinearLayout) qsp.a(view, R.id.add_device_marketing_layout);
        if (Utils.o()) {
            viewStub = (ViewStub) qsp.a(view, R.id.oversea_adddevice);
        } else {
            viewStub = (ViewStub) qsp.a(view, R.id.domestic_adddevice);
        }
        if (viewStub != null) {
            cardDeviceFragment.i = (LinearLayout) viewStub.inflate().findViewById(R.id.bottom_layout);
            cardDeviceFragment.ae = (HealthButton) qsp.a(cardDeviceFragment.i, R.id.more_device_click);
            cardDeviceFragment.f25175c = (HealthButton) qsp.a(cardDeviceFragment.i, R.id.add_device_click);
        }
    }

    public void n(CardDeviceFragment cardDeviceFragment, View view) {
        FragmentActivity activity = cardDeviceFragment.getActivity();
        if (activity == null || view == null) {
            LogUtil.j("CardDeviceFragment CardDeviceHelper", "initNearbyPermissionTip activity or deviceCardView == null");
            return;
        }
        final LinearLayout linearLayout = (LinearLayout) qsp.a(view, R.id.nearby_permission_top_layout);
        if (SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false)) {
            LogUtil.a("CardDeviceFragment CardDeviceHelper", "initNearbyPermissionTip is base service model");
            linearLayout.setVisibility(8);
        } else if (BluetoothPermisionUtils.d(activity)) {
            LogUtil.a("CardDeviceFragment CardDeviceHelper", "initNearbyPermissionTip havePermission");
            linearLayout.setVisibility(8);
        } else {
            BluetoothPermisionUtils.NearbyPermissionAction nearbyPermissionAction = new BluetoothPermisionUtils.NearbyPermissionAction(activity) { // from class: rmc.3
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("CardDeviceFragment CardDeviceHelper", "tryRequestNearbyPermission granted");
                    lvb.e().b("startAllReconnect", mgg.c("CardDeviceFragment CardDeviceHelper"), 0, "");
                    linearLayout.setVisibility(8);
                }
            };
            e(view, activity, linearLayout, nearbyPermissionAction);
            b(cardDeviceFragment, nearbyPermissionAction);
        }
    }

    private void e(View view, final Activity activity, final LinearLayout linearLayout, final BluetoothPermisionUtils.NearbyPermissionAction nearbyPermissionAction) {
        if (!tqp.b("wear_nearby_permission_tip_time")) {
            ReleaseLogUtil.e("R_CardDeviceFragment CardDeviceHelper", "showNearbyPermissionTip < 48h");
            return;
        }
        HealthTextView healthTextView = (HealthTextView) qsp.a(view, R.id.btn_open);
        HealthTextView healthTextView2 = (HealthTextView) qsp.a(view, R.id.btn_cancle);
        ((HealthTextView) qsp.a(view, R.id.device_content)).setText(activity.getResources().getString(R.string.IDS_hw_bluetooth_permission_content));
        linearLayout.setVisibility(0);
        healthTextView.setOnClickListener(new View.OnClickListener() { // from class: rmu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                rmc.c(activity, nearbyPermissionAction, view2);
            }
        });
        healthTextView2.setOnClickListener(new View.OnClickListener() { // from class: rmq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                rmc.e(linearLayout, view2);
            }
        });
    }

    static /* synthetic */ void c(Activity activity, BluetoothPermisionUtils.NearbyPermissionAction nearbyPermissionAction, View view) {
        if (qrs.r()) {
            return;
        }
        PermissionUtil.d(activity, PermissionUtil.PermissionType.SCAN, nearbyPermissionAction);
    }

    static /* synthetic */ void e(LinearLayout linearLayout, View view) {
        if (qrs.r()) {
            return;
        }
        KeyValDbManager.d(BaseApplication.getContext()).b("wear_nearby_permission_tip_time", String.valueOf(System.currentTimeMillis()));
        linearLayout.setVisibility(8);
    }

    private void b(CardDeviceFragment cardDeviceFragment, CustomPermissionAction customPermissionAction) {
        if (!tqp.b("wear_nearby_permission_time")) {
            ReleaseLogUtil.e("R_CardDeviceFragment CardDeviceHelper", "tryRequestNearbyPermission < 48h");
        } else if (cardDeviceFragment.q == null) {
            ReleaseLogUtil.e("R_CardDeviceFragment CardDeviceHelper", "tryRequestNearbyPermission mGetDataService == null");
        } else {
            b(cardDeviceFragment, new AnonymousClass8(cardDeviceFragment, customPermissionAction));
        }
    }

    /* JADX INFO: renamed from: rmc$8, reason: invalid class name */
    class AnonymousClass8 implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CardDeviceFragment f47482c;
        final /* synthetic */ CustomPermissionAction e;

        AnonymousClass8(CardDeviceFragment cardDeviceFragment, CustomPermissionAction customPermissionAction) {
            this.f47482c = cardDeviceFragment;
            this.e = customPermissionAction;
        }

        @Override // java.lang.Runnable
        public void run() {
            final FragmentActivity activity = this.f47482c.getActivity();
            if (activity == null || BaseApplication.getActivity() != activity) {
                ReleaseLogUtil.e("R_CardDeviceFragment CardDeviceHelper", "tryRequestNearbyPermission activity not top Activity");
                return;
            }
            CustomTextAlertDialog.Builder builderE = new CustomTextAlertDialog.Builder(activity).a(R.string.IDS_hwh_home_other_permissions_title).a(activity.getString(R.string.IDS_near_permission_reminder)).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: rms
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KeyValDbManager.d(BaseApplication.getContext()).b("wear_nearby_permission_time", String.valueOf(System.currentTimeMillis()));
                }
            });
            int i = R.string.IDS_home_activity_reconnition_open;
            final CustomPermissionAction customPermissionAction = this.e;
            builderE.a(i, new View.OnClickListener() { // from class: rmy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    rmc.AnonymousClass8.d(activity, customPermissionAction, view);
                }
            }).b().show();
        }

        static /* synthetic */ void d(Activity activity, CustomPermissionAction customPermissionAction, View view) {
            PermissionUtil.d(activity, PermissionUtil.PermissionType.SCAN, customPermissionAction);
            KeyValDbManager.d(BaseApplication.getContext()).b("wear_nearby_permission_time", String.valueOf(System.currentTimeMillis()));
        }
    }

    private void b(final CardDeviceFragment cardDeviceFragment, final Runnable runnable) {
        if (cardDeviceFragment.q == null) {
            ReleaseLogUtil.e("R_CardDeviceFragment CardDeviceHelper", "tryRequestNearbyPermission mGetDataService is null");
        } else {
            cardDeviceFragment.q.execute(new Runnable() { // from class: rmc.10
                @Override // java.lang.Runnable
                public void run() {
                    if (!DeviceUtil.b()) {
                        ReleaseLogUtil.e("R_CardDeviceFragment CardDeviceHelper", "tryRequestNearbyPermission not hasDeviceDbInfo");
                        return;
                    }
                    Handler handler = cardDeviceFragment.y;
                    if (handler == null) {
                        ReleaseLogUtil.e("R_CardDeviceFragment CardDeviceHelper", "tryRequestNearbyPermission handler == null");
                    } else {
                        handler.post(runnable);
                    }
                }
            });
        }
    }

    public void g(final CardDeviceFragment cardDeviceFragment, View view) {
        if (view == null || cardDeviceFragment == null) {
            LogUtil.a("CardDeviceFragment CardDeviceHelper", "initDeviceAutoOtaTip deviceCardView or fragment is null");
            return;
        }
        cardDeviceFragment.j = (LinearLayout) qsp.a(view, R.id.auto_ota_top_layout);
        HealthTextView healthTextView = (HealthTextView) qsp.a(view, R.id.btn_update_top_open);
        HealthTextView healthTextView2 = (HealthTextView) qsp.a(view, R.id.btn_update_top_cancle);
        healthTextView.setOnClickListener(new View.OnClickListener() { // from class: rmr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                rmc.d(cardDeviceFragment, view2);
            }
        });
        healthTextView2.setOnClickListener(new View.OnClickListener() { // from class: rmh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                rmc.e(cardDeviceFragment, view2);
            }
        });
    }

    static /* synthetic */ void d(CardDeviceFragment cardDeviceFragment, View view) {
        if (qrs.r()) {
            return;
        }
        rdt.e("1");
        cardDeviceFragment.j.setVisibility(8);
        rtk.m();
        qpx.b(cardDeviceFragment.getActivity(), R.string.IDS_already_open_wlan_auto_download_update_tips);
    }

    static /* synthetic */ void e(CardDeviceFragment cardDeviceFragment, View view) {
        if (qrs.r()) {
            return;
        }
        rdt.e("0");
        cardDeviceFragment.j.setVisibility(8);
        rtk.r();
    }

    void f(final CardDeviceFragment cardDeviceFragment, View view) {
        if (view == null || cardDeviceFragment == null) {
            LogUtil.j("CardDeviceFragment CardDeviceHelper", "initDeviceAutoSwitchTip deviceCardView or fragment is null");
            return;
        }
        if (cardDeviceFragment.j.getVisibility() == 0) {
            LogUtil.j("CardDeviceFragment CardDeviceHelper", "initDeviceAutoSwitchTip mAutoOtaTipLayout VISIBLE");
            return;
        }
        DeviceInfo deviceInfoC = mgg.c("CardDeviceFragment CardDeviceHelper");
        if (deviceInfoC == null || deviceInfoC.getDeviceConnectState() != 2) {
            LogUtil.j("CardDeviceFragment CardDeviceHelper", "initDeviceAutoSwitchTip !DeviceConnectState.DEVICE_CONNECTED");
            return;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10024), "firstReportSwitch");
        String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10024), "firstReportSwitchDeviceName");
        if (!TextUtils.equals(strE, "1") || !TextUtils.equals(strE2, deviceInfoC.getDeviceName())) {
            LogUtil.j("CardDeviceFragment CardDeviceHelper", "initDeviceAutoSwitchTip not first switch");
            return;
        }
        cardDeviceFragment.g.setVisibility(0);
        HealthTextView healthTextView = (HealthTextView) qsp.a(view, R.id.btn_know);
        ((HealthTextView) qsp.a(view, R.id.auto_switch_tip)).setText(String.format(Locale.ROOT, cardDeviceFragment.getActivity().getResources().getString(R.string.IDS_device_auto_switch_tips), strE2));
        healthTextView.setOnClickListener(new View.OnClickListener() { // from class: rmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                rmc.c(cardDeviceFragment, view2);
            }
        });
    }

    static /* synthetic */ void c(CardDeviceFragment cardDeviceFragment, View view) {
        if (qrs.r()) {
            return;
        }
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10024), "firstReportSwitch", "2", new StorageParams());
        cardDeviceFragment.g.setVisibility(8);
        if (SharedPreferenceManager.b(String.valueOf(10024), "auto_ota_tip_status", false) && BluetoothPermisionUtils.d(cardDeviceFragment.h)) {
            cardDeviceFragment.j.setVisibility(0);
            SharedPreferenceManager.a(String.valueOf(10024), "auto_ota_tip_status", false);
        }
    }

    public void o(final CardDeviceFragment cardDeviceFragment, View view) {
        if (view == null || cardDeviceFragment == null) {
            LogUtil.a("CardDeviceFragment CardDeviceHelper", "initDeviceOtherView deviceCardView or fragment is null");
            return;
        }
        cardDeviceFragment.ae.setOnClickListener(new View.OnClickListener() { // from class: rmp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                rmc.b(cardDeviceFragment, view2);
            }
        });
        cardDeviceFragment.f25175c.setOnClickListener(new View.OnClickListener() { // from class: rml
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                rmc.a(cardDeviceFragment, view2);
            }
        });
        ImageView imageView = (ImageView) qsp.a(view, R.id.device_card_normal_img);
        if (LanguageUtil.ba(cardDeviceFragment.getActivity())) {
            imageView.setBackgroundResource(R.mipmap.pic_me_card_add_bg_mirror);
        } else {
            imageView.setBackgroundResource(R.mipmap.pic_me_card_add_bg);
        }
        cardDeviceFragment.n.setOnClickListener(new View.OnClickListener() { // from class: rmo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                rmc.h(cardDeviceFragment, view2);
            }
        });
        h(cardDeviceFragment);
    }

    static /* synthetic */ void b(CardDeviceFragment cardDeviceFragment, View view) {
        if (qrs.r()) {
            return;
        }
        if (!Utils.o()) {
            Intent intent = new Intent();
            intent.setClass(cardDeviceFragment.getActivity(), DeviceMoreListActivity.class);
            rtk.d(cardDeviceFragment.getActivity(), intent, "DeviceMoreListActivity");
            qrs.ae(cardDeviceFragment.h);
            return;
        }
        cardDeviceFragment.ai = !cardDeviceFragment.ai;
        cardDeviceFragment.f();
    }

    static /* synthetic */ void a(CardDeviceFragment cardDeviceFragment, View view) {
        if (qrs.r()) {
            return;
        }
        rdp.b(cardDeviceFragment);
    }

    static /* synthetic */ void h(CardDeviceFragment cardDeviceFragment, View view) {
        if (qrs.r()) {
            return;
        }
        rdp.b(cardDeviceFragment);
    }

    private void h(final CardDeviceFragment cardDeviceFragment) {
        cardDeviceFragment.f = new CardDeviceAdapter(cardDeviceFragment.getActivity(), cardDeviceFragment, new CardDeviceAdapter.PersonalItemReconnectListener() { // from class: rmc.7
            @Override // com.huawei.ui.homehealth.device.adapter.CardDeviceAdapter.PersonalItemReconnectListener
            public void onReconnect(dxy dxyVar) {
                LogUtil.a("CardDeviceFragment CardDeviceHelper", "setRecyclerView onReconnect");
                if (cardDeviceFragment.getActivity() == null) {
                    ReleaseLogUtil.e("R_CardDeviceFragment CardDeviceHelper", "onReconnect getActivity() == null");
                } else {
                    rdt.b(100108, dxyVar.i());
                    rmc.this.d(cardDeviceFragment, dxyVar);
                }
            }

            @Override // com.huawei.ui.homehealth.device.adapter.CardDeviceAdapter.PersonalItemReconnectListener
            public void onPersonalEquipment(int i, View view) {
                LogUtil.a("CardDeviceFragment CardDeviceHelper", "setRecyclerView onPersonalEquipment");
                rmc.this.c(cardDeviceFragment, i, view);
            }

            @Override // com.huawei.ui.homehealth.device.adapter.CardDeviceAdapter.PersonalItemReconnectListener
            public void onMoreEquipment() {
                LogUtil.a("CardDeviceFragment CardDeviceHelper", "setRecyclerView onMoreEquipment");
                if (qrs.r()) {
                    return;
                }
                rdp.b(cardDeviceFragment);
            }
        });
        final FragmentActivity activity = cardDeviceFragment.getActivity();
        final int i = 2;
        final int i2 = 1;
        final boolean z = false;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(activity, i, i2, z) { // from class: com.huawei.ui.homehealth.device.CardDeviceHelper$6
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        };
        cardDeviceFragment.aw.addItemDecoration(new DeviceItemDecoration(qqp.a(cardDeviceFragment.getActivity(), 12.0f), 0));
        cardDeviceFragment.aw.setLayoutManager(gridLayoutManager);
        cardDeviceFragment.f.c(cardDeviceFragment.av);
        cardDeviceFragment.aw.setAdapter(cardDeviceFragment.f);
        j(cardDeviceFragment);
    }

    private void j(final CardDeviceFragment cardDeviceFragment) {
        cardDeviceFragment.ap.addItemDecoration(new RecommendItemDecoration(qqp.a(cardDeviceFragment.getActivity(), 12.0f), qqp.a(cardDeviceFragment.getActivity(), 0.0f)));
        cardDeviceFragment.am = new DeviceRecommendedAdapter(cardDeviceFragment.getActivity());
        cardDeviceFragment.am.d(cardDeviceFragment.aq);
        cardDeviceFragment.ap.setAdapter(cardDeviceFragment.am);
        cardDeviceFragment.as.setAdapter(cardDeviceFragment.am);
        cardDeviceFragment.am.b(new DeviceRecommendedAdapter.RecommendListener() { // from class: rmc.9
            @Override // com.huawei.ui.homehealth.device.adapter.DeviceRecommendedAdapter.RecommendListener
            public void onPersonalEquipment(RecommendedItem recommendedItem) {
                rmc.this.b(cardDeviceFragment, recommendedItem);
            }
        });
        cardDeviceFragment.h();
    }

    public void a(CardDeviceFragment cardDeviceFragment) {
        if (cardDeviceFragment == null) {
            LogUtil.j("CardDeviceFragment CardDeviceHelper", "showRecommendedView fragment is null");
            return;
        }
        if (cardDeviceFragment.aq.size() == 0) {
            cardDeviceFragment.ao.setVisibility(8);
            cardDeviceFragment.ay.setVisibility(8);
            cardDeviceFragment.t.setVisibility(8);
            cardDeviceFragment.s.setVisibility(8);
            return;
        }
        if (!Utils.o()) {
            f(cardDeviceFragment);
            return;
        }
        cardDeviceFragment.ay.setVisibility(8);
        cardDeviceFragment.ao.setVisibility(0);
        cardDeviceFragment.t.setVisibility(8);
        cardDeviceFragment.s.setVisibility(8);
    }

    private void f(CardDeviceFragment cardDeviceFragment) {
        if (cardDeviceFragment.ag) {
            cardDeviceFragment.s.setVisibility(0);
            cardDeviceFragment.t.setVisibility(0);
            cardDeviceFragment.ay.setVisibility(8);
            cardDeviceFragment.ao.setVisibility(8);
            return;
        }
        cardDeviceFragment.t.setVisibility(8);
        cardDeviceFragment.s.setVisibility(8);
        if (cardDeviceFragment.aq.size() > 2) {
            cardDeviceFragment.ay.setVisibility(0);
            cardDeviceFragment.ao.setVisibility(8);
        } else {
            cardDeviceFragment.ay.setVisibility(8);
            cardDeviceFragment.ao.setVisibility(0);
        }
    }

    public void c(CardDeviceFragment cardDeviceFragment, boolean z) {
        LogUtil.a("CardDeviceFragment CardDeviceHelper", "showCardNormal enter");
        if (cardDeviceFragment == null || cardDeviceFragment.aj.size() > 0) {
            LogUtil.j("CardDeviceFragment CardDeviceHelper", "showCardNormal fragment is null or mProductInfoLists.size() > 0");
            return;
        }
        LinearLayout.LayoutParams layoutParams = cardDeviceFragment.n.getLayoutParams() instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) cardDeviceFragment.n.getLayoutParams() : null;
        if (z && layoutParams != null) {
            cardDeviceFragment.an.setVisibility(0);
            layoutParams.bottomMargin = 0;
            layoutParams.height = qrs.d(cardDeviceFragment.h, 112.0f);
        }
        if (layoutParams != null) {
            cardDeviceFragment.n.setLayoutParams(layoutParams);
        }
        cardDeviceFragment.n.setVisibility(0);
        cardDeviceFragment.ak.setVisibility(8);
        cardDeviceFragment.ao.setVisibility(8);
        cardDeviceFragment.i.setVisibility(8);
        cardDeviceFragment.ay.setVisibility(8);
        cardDeviceFragment.t.setVisibility(8);
        cardDeviceFragment.s.setVisibility(8);
    }

    public void b(CardDeviceFragment cardDeviceFragment) {
        if (cardDeviceFragment == null) {
            LogUtil.j("CardDeviceFragment CardDeviceHelper", "setRecommendationCard fragment is null");
            return;
        }
        if (!Utils.o()) {
            if (cardDeviceFragment.aq.size() > 2) {
                if (qrs.v() && cardDeviceFragment.aq.size() > 3 && !qrs.af(cardDeviceFragment.getActivity())) {
                    cardDeviceFragment.as.setLayoutManager(rtk.e());
                    return;
                } else {
                    cardDeviceFragment.as.setLayoutManager(rtk.a(cardDeviceFragment.aq.size()));
                    return;
                }
            }
            cardDeviceFragment.ap.setLayoutManager(rtk.c(cardDeviceFragment.aq));
            return;
        }
        cardDeviceFragment.ap.setLayoutManager(rtk.c(cardDeviceFragment.aq));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(CardDeviceFragment cardDeviceFragment, int i, View view) {
        if (qrs.r()) {
            return;
        }
        if (!rdp.b((Context) cardDeviceFragment.getActivity()) && (cardDeviceFragment.getActivity() instanceof Activity)) {
            rdp.e((Activity) cardDeviceFragment.getActivity());
            return;
        }
        if (i < 0 || i >= cardDeviceFragment.aj.size()) {
            return;
        }
        dru druVar = new dru();
        if (cardDeviceFragment.aj.get(i) instanceof dru) {
            druVar = cardDeviceFragment.aj.get(i);
        }
        if (rum.e(cardDeviceFragment.getActivity(), druVar)) {
            rum.e eVar = new rum.e();
            eVar.e(druVar);
            eVar.b(new RecommendedItem());
            eVar.a(i);
            eVar.e(1);
            rum.a(cardDeviceFragment.getActivity(), eVar, cardDeviceFragment.ad);
            return;
        }
        a(cardDeviceFragment, i, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CardDeviceFragment cardDeviceFragment, RecommendedItem recommendedItem) {
        if (qrs.r()) {
            return;
        }
        int id = recommendedItem.getId();
        if (a(cardDeviceFragment, id)) {
            return;
        }
        if (!cardDeviceFragment.aa && id != 1 && id != 6) {
            rtk.e(cardDeviceFragment.getActivity());
            return;
        }
        if (rtk.a() && !WatchFaceProvider.BACKGROUND_LABEL.equals(mjl.a(cardDeviceFragment.getActivity()))) {
            LogUtil.j("CardDeviceFragment CardDeviceHelper", "not back update");
            rtk.e(cardDeviceFragment.getActivity(), R.string.IDS_device_ota_later_note);
            return;
        }
        dru druVarA = rum.a(cardDeviceFragment.aj, recommendedItem);
        if (rum.e(cardDeviceFragment.getActivity(), druVarA)) {
            rum.e eVar = new rum.e();
            eVar.e(druVarA);
            eVar.b(recommendedItem);
            eVar.a(-1);
            eVar.e(5);
            rum.a(cardDeviceFragment.getActivity(), eVar, cardDeviceFragment.ad);
            return;
        }
        c(cardDeviceFragment, id);
    }

    private boolean a(CardDeviceFragment cardDeviceFragment, int i) {
        String str;
        if (i != 5) {
            return false;
        }
        if (TextUtils.isEmpty(cardDeviceFragment.x)) {
            str = lon.c().d("domain_play_machine") + "/hwtips/app/health_app/zh-CN/index.html#/app?cid=11068";
        } else {
            str = cardDeviceFragment.x;
        }
        LogUtil.j("CardDeviceFragment CardDeviceHelper", "gotoUseHelpUrl httpUrl is ", str);
        Uri uri = Uri.parse(str);
        if ("huaweischeme".equals(uri.getScheme())) {
            LogUtil.d("CardDeviceFragment CardDeviceHelper", "gotoUseHelpUrl go to HwHealthBrowserActionActivity");
            AppRouter.e(uri).b(cardDeviceFragment.requireActivity());
        } else {
            Intent intent = new Intent();
            intent.setClass(cardDeviceFragment.requireActivity(), WebViewActivity.class);
            intent.putExtra("url", str);
            rtk.d(cardDeviceFragment.requireActivity(), intent, "WebViewActivity");
        }
        cardDeviceFragment.requireActivity().overridePendingTransition(0, R.anim.activity_no_animation);
        return true;
    }

    private void c(CardDeviceFragment cardDeviceFragment, int i) {
        if (i == 1) {
            rtk.b(cardDeviceFragment.getActivity());
            return;
        }
        if (i == 2) {
            try {
                rdt.c();
                Intent intent = new Intent();
                intent.putExtra("device_id", cardDeviceFragment.r);
                intent.setClass(cardDeviceFragment.getActivity(), MusicSecondaryMenuActivity.class);
                rtk.d(cardDeviceFragment.getActivity(), intent, "MusicSecondaryMenuActivity");
                cardDeviceFragment.getActivity().overridePendingTransition(com.huawei.ui.homewear21.R.anim.activity_no_animation, com.huawei.ui.homewear21.R.anim.activity_no_animation);
                return;
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("CardDeviceFragment CardDeviceHelper", "personalEquipmentMethodDetails ActivityNotFoundException");
                return;
            }
        }
        if (i == 3) {
            rtk.e(cardDeviceFragment.getActivity(), cardDeviceFragment.r);
            return;
        }
        if (i == 4) {
            m(cardDeviceFragment);
        } else if (i != 6) {
            LogUtil.j("CardDeviceFragment CardDeviceHelper", "id is not exist");
        } else {
            rtk.o();
        }
    }

    private void a(CardDeviceFragment cardDeviceFragment, int i, View view) {
        if (cardDeviceFragment.aj.get(i) instanceof dru) {
            dru druVar = cardDeviceFragment.aj.get(i);
            boolean zD = cardDeviceFragment.f.d();
            if (druVar.e() == 0) {
                LogUtil.a("CardDeviceFragment CardDeviceHelper", "DeviceManagerCardNoDeviceValueViewHolder onItemClick postion ", Integer.valueOf(i));
                druVar.d();
                d(i, cardDeviceFragment, druVar);
                return;
            }
            if (druVar.e() == 1) {
                a(cardDeviceFragment, druVar, zD);
                return;
            }
            if (druVar.e() == 3) {
                cardDeviceFragment.startActivity(efl.a(druVar));
                return;
            }
            if (druVar.e() == 4) {
                Bundle bundle = view != null ? ActivityOptionsCompat.makeSceneTransitionAnimation(cardDeviceFragment.getActivity(), Pair.create(view, TitleBean.RIGHT_BTN_TYPE_SHARE)).toBundle() : null;
                Intent intent = new Intent();
                intent.putExtra("common_device_name", druVar.b());
                intent.setClass(cardDeviceFragment.getActivity(), MoreSportDeviceActivity.class);
                try {
                    if (bundle != null) {
                        cardDeviceFragment.startActivity(intent, bundle);
                    } else {
                        cardDeviceFragment.startActivity(intent);
                    }
                    return;
                } catch (ActivityNotFoundException unused) {
                    LogUtil.e("CardDeviceFragment CardDeviceHelper", "MoreSportDeviceActivity ActivityNotFoundException");
                    return;
                }
            }
            if (druVar.e() == 6) {
                String asString = druVar.d().getAsString("productId");
                String asString2 = druVar.d().getAsString("mac");
                Intent intent2 = new Intent(cardDeviceFragment.getActivity(), (Class<?>) DeviceMainActivity.class);
                intent2.putExtra("PID_FROM_QRCODE", "ZAA6");
                intent2.putExtra("productId", asString);
                intent2.putExtra("Device_Type", "082");
                intent2.putExtra("macAddress", asString2);
                if (cardDeviceFragment.getActivity() != null) {
                    cardDeviceFragment.getActivity().startActivity(intent2);
                    return;
                }
                return;
            }
            LogUtil.j("CardDeviceFragment CardDeviceHelper", "other device");
        }
    }

    private void d(int i, final CardDeviceFragment cardDeviceFragment, dru druVar) {
        LogUtil.a("CardDeviceFragment CardDeviceHelper", "startThirdPartAction");
        final elh elhVar = (elh) druVar.i();
        ContentValues contentValuesD = druVar.d();
        if (elhVar.d().size() <= 0) {
            d(cardDeviceFragment, i, elhVar, contentValuesD);
            return;
        }
        if (BleConstants.BLE_THIRD_DEVICE_H5.equals(elhVar.n().b())) {
            final String asString = contentValuesD.getAsString("uniqueId");
            final String strT = elhVar.t();
            PermissionDialogHelper.d(cardDeviceFragment.getActivity(), new PermissionDialogHelper.OpenBlueToothAction() { // from class: rmc.6
                @Override // com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper.OpenBlueToothAction
                public void onPermissionGranted() {
                    if (cardDeviceFragment.getActivity() == null) {
                        LogUtil.j("CardDeviceFragment CardDeviceHelper", "startThirdPartAction onPermissionGranted activity is null");
                    } else if ("1".equals(elhVar.g())) {
                        LogUtil.a("CardDeviceFragment CardDeviceHelper", "startThirdPartAction onPermissionGranted switchToH5ProIntro");
                        etn.c(cardDeviceFragment.getActivity(), elhVar, strT, asString);
                    } else {
                        LogUtil.a("CardDeviceFragment CardDeviceHelper", "startThirdPartAction onPermissionGranted startWebViewActivity");
                        rtk.b(cardDeviceFragment.getActivity(), strT, asString, elhVar.n().b());
                    }
                }

                @Override // com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper.OpenBlueToothAction
                public void onPermissionDenied() {
                    LogUtil.a("CardDeviceFragment CardDeviceHelper", "Permission onPermissionDenied");
                }
            });
        } else if ("4bfc5a27-f2b9-4c41-bd9b-a4a2a18f752c".equals(druVar.d().getAsString("productId"))) {
            LogUtil.a("CardDeviceFragment CardDeviceHelper", "enter enmo");
            a(cardDeviceFragment, contentValuesD);
        } else {
            rtk.e(cardDeviceFragment.getActivity(), contentValuesD, elhVar);
        }
    }

    private void a(CardDeviceFragment cardDeviceFragment, ContentValues contentValues) {
        LogUtil.a("CardDeviceFragment CardDeviceHelper", "enter dealJumpNemoActivity...");
        if (cardDeviceFragment.getActivity() == null || contentValues == null) {
            LogUtil.j("CardDeviceFragment CardDeviceHelper", "activity or deviceInfo is null");
            return;
        }
        String asString = contentValues.getAsString("uniqueId");
        if (era.a(contentValues)) {
            Intent intent = new Intent(cardDeviceFragment.getActivity(), (Class<?>) DeviceMainActivity.class);
            intent.putExtra("PID_FROM_QRCODE", "ZAA6");
            intent.putExtra("productId", contentValues.getAsString("productId"));
            intent.putExtra("Device_Type", "082");
            intent.putExtra("macAddress", asString);
            cardDeviceFragment.getActivity().startActivity(intent);
            return;
        }
        LogUtil.a("CardDeviceFragment CardDeviceHelper", "enter enmo");
        new elc().a(cardDeviceFragment.getActivity(), asString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(CardDeviceFragment cardDeviceFragment, dxy dxyVar) {
        dru druVar = new dru();
        druVar.d(1);
        druVar.c(dxyVar);
        if (rum.e(cardDeviceFragment.getActivity(), druVar)) {
            rum.e eVar = new rum.e();
            eVar.e(druVar);
            eVar.b(new RecommendedItem());
            eVar.a(-1);
            eVar.e(2);
            rum.a(cardDeviceFragment.getActivity(), eVar, cardDeviceFragment.ad);
            return;
        }
        a(cardDeviceFragment, dxyVar);
    }

    private void a(CardDeviceFragment cardDeviceFragment, dxy dxyVar) {
        rcw.b(cardDeviceFragment.getActivity()).g(dxyVar.d());
        a(cardDeviceFragment, dxyVar, 0);
    }

    void a(final CardDeviceFragment cardDeviceFragment, dxy dxyVar, int i) {
        if (maq.b().f()) {
            LogUtil.a("CardDeviceFragment CardDeviceHelper", "user choose connect other wear device is OTAing");
            rtk.e(cardDeviceFragment.getActivity(), R.string.IDS_main_device_ota_error_message);
            return;
        }
        final List<DeviceInfo> listD = lvl.d();
        rtk.a(dxyVar, listD);
        String strD = dxyVar.d();
        if (dxyVar.h()) {
            res.d().a(dxyVar.g(), dxyVar.i(), strD, cardDeviceFragment.getActivity());
            strD = dxyVar.g() + Constants.LINK + dxyVar.d();
        } else if (cardDeviceFragment.f25173a != null) {
            cardDeviceFragment.f25173a.e();
        }
        final String str = strD;
        if (dxyVar != null) {
            SharedPreferenceManager.c(String.valueOf(10), "app_big_data_device_name", dxyVar.i());
        }
        final boolean zH = dxyVar.h();
        final String strF = dxyVar.f();
        cardDeviceFragment.q.execute(new Runnable() { // from class: rmc.12
            @Override // java.lang.Runnable
            public void run() {
                lvl.a((List<DeviceInfo>) listD, str);
                new rfi().b(cardDeviceFragment.f25173a, strF, zH, str, cardDeviceFragment.getActivity());
            }
        });
        cardDeviceFragment.y.sendMessageDelayed(rtk.c(zH, dxyVar, i), 20000L);
        LogUtil.a("CardDeviceFragment CardDeviceHelper", "device connect time out");
    }

    private void m(final CardDeviceFragment cardDeviceFragment) {
        if (lyy.b().j()) {
            LogUtil.j("CardDeviceFragment CardDeviceHelper", "startAppMarket isDeviceVersionNotSupport");
            l(cardDeviceFragment);
        } else {
            lyy.b().d(cardDeviceFragment.getActivity(), new AppBundleLauncher.InstallCallback() { // from class: rmc.2
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public boolean call(Context context, Intent intent) {
                    lyy.b().f();
                    if (lyy.b().b(mgg.c("CardDeviceFragment CardDeviceHelper"))) {
                        try {
                            Intent intent2 = new Intent();
                            intent2.setClass(cardDeviceFragment.getActivity(), HwSmartAppMarketLoadingActivity.class);
                            cardDeviceFragment.getActivity().startActivity(intent2);
                            return false;
                        } catch (ActivityNotFoundException unused) {
                            LogUtil.e("CardDeviceFragment CardDeviceHelper", "startAppMarket NotFoundException");
                            return false;
                        }
                    }
                    lyy.b().g();
                    return false;
                }
            });
            rdt.a();
        }
    }

    public void i(CardDeviceFragment cardDeviceFragment) {
        if (cardDeviceFragment == null) {
            LogUtil.j("CardDeviceFragment CardDeviceHelper", "updateMarketingCard fragment is null");
            return;
        }
        if (cardDeviceFragment.w == null || njy.e(cardDeviceFragment.w.getGridContents())) {
            return;
        }
        List<SingleGridContent> gridContents = cardDeviceFragment.w.getGridContents();
        ArrayList arrayList = new ArrayList();
        ColumnLinearLayout columnLinearLayout = new ColumnLinearLayout(BaseApplication.getContext());
        b(cardDeviceFragment, columnLinearLayout, gridContents, arrayList);
        if (!njy.c(cardDeviceFragment.e, arrayList, false)) {
            cardDeviceFragment.w.setGridContents(arrayList);
            columnLinearLayout.b(4050, cardDeviceFragment.at, cardDeviceFragment.w);
            cardDeviceFragment.t.removeAllViews();
            cardDeviceFragment.t.addView(columnLinearLayout);
            cardDeviceFragment.w.setGridContents(gridContents);
            cardDeviceFragment.e.clear();
            cardDeviceFragment.e.addAll(arrayList);
        }
        cardDeviceFragment.ag = true;
    }

    private void b(final CardDeviceFragment cardDeviceFragment, final ColumnLinearLayout columnLinearLayout, List<SingleGridContent> list, List<SingleGridContent> list2) {
        for (RecommendedItem recommendedItem : cardDeviceFragment.aq) {
            RecommendedItem recommendedItem2 = recommendedItem instanceof RecommendedItem ? recommendedItem : null;
            if (recommendedItem2 != null && njy.c(list, recommendedItem2.getId() - 1)) {
                list2.add(list.get(recommendedItem2.getId() - 1));
            }
        }
        e(cardDeviceFragment, list2);
        LogUtil.j("CardDeviceFragment CardDeviceHelper", "setMarketingCard template is ", list2);
        columnLinearLayout.setItemClickListener(new View.OnClickListener() { // from class: rmj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rmc.b(cardDeviceFragment, columnLinearLayout, view);
            }
        });
    }

    static /* synthetic */ void b(CardDeviceFragment cardDeviceFragment, ColumnLinearLayout columnLinearLayout, View view) {
        if (!cardDeviceFragment.aa) {
            rtk.e(cardDeviceFragment.getActivity());
            columnLinearLayout.setShowDialogFlag(true);
            return;
        }
        if (rtk.a() && !WatchFaceProvider.BACKGROUND_LABEL.equals(mjl.a(cardDeviceFragment.getActivity()))) {
            LogUtil.j("CardDeviceFragment CardDeviceHelper", "not back update");
            rtk.e(cardDeviceFragment.getActivity(), R.string.IDS_device_ota_later_note);
            columnLinearLayout.setShowDialogFlag(true);
            return;
        }
        if (cardDeviceFragment.aq.get(0) instanceof RecommendedItem) {
            RecommendedItem recommendedItem = cardDeviceFragment.aq.get(0);
            dru druVarA = rum.a(cardDeviceFragment.aj, recommendedItem);
            if (rum.e(cardDeviceFragment.getActivity(), druVarA)) {
                rum.e eVar = new rum.e();
                eVar.e(druVarA);
                eVar.b(recommendedItem);
                eVar.a(-1);
                eVar.e(5);
                rum.a(cardDeviceFragment.getActivity(), eVar, cardDeviceFragment.ad);
                columnLinearLayout.setShowDialogFlag(true);
                return;
            }
        }
        columnLinearLayout.setShowDialogFlag(false);
    }

    private void e(CardDeviceFragment cardDeviceFragment, List<SingleGridContent> list) {
        if (list == null || TextUtils.isEmpty(cardDeviceFragment.x)) {
            LogUtil.j("CardDeviceFragment CardDeviceHelper", "updatePlayMachineUrl content or helpUrl is null");
            return;
        }
        for (SingleGridContent singleGridContent : list) {
            if (singleGridContent != null) {
                try {
                    if (CommonUtils.j(Uri.parse(qqy.g(singleGridContent.getLinkValue())).getQueryParameter("deviceMgrType")) == 7) {
                        singleGridContent.setLinkValue(cardDeviceFragment.x);
                    }
                } catch (IllegalArgumentException | UnsupportedOperationException e) {
                    LogUtil.e("CardDeviceFragment CardDeviceHelper", "get type IllegalArgumentException:", LogAnonymous.b(e));
                }
            }
        }
        LogUtil.j("CardDeviceFragment CardDeviceHelper", "updateHelpGuideUrl helpUrl is", cardDeviceFragment.x);
    }

    private void d(final CardDeviceFragment cardDeviceFragment, final int i, final elh elhVar, final ContentValues contentValues) {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(cardDeviceFragment.getActivity());
        builder.b(R.string.IDS_device_selection_cancel_unbind_device);
        builder.c(R.string.IDS_device_ui_dialog_yes, new View.OnClickListener() { // from class: rmg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rmc.d(contentValues, elhVar, cardDeviceFragment, i, view);
            }
        });
        builder.a(R.string.IDS_device_ui_dialog_no, new View.OnClickListener() { // from class: rmn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.d("CardDeviceFragment CardDeviceHelper", "onClick");
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    static /* synthetic */ void d(ContentValues contentValues, elh elhVar, CardDeviceFragment cardDeviceFragment, int i, View view) {
        if (contentValues == null || elhVar == null) {
            return;
        }
        String asString = contentValues.getAsString("uniqueId");
        if (drw.e().l(asString)) {
            drw.e().e(elhVar.t(), asString);
            cardDeviceFragment.aj.remove(i);
            cardDeviceFragment.f.notifyDataSetChanged();
            Intent intent = new Intent();
            intent.setAction("com.huawei.bone.action.DEVICE_THIRD_DELETE");
            intent.setPackage(BaseApplication.getAppPackage());
            cardDeviceFragment.getActivity().sendBroadcast(intent, LocalBroadcast.f36595c);
        }
    }

    private void l(final CardDeviceFragment cardDeviceFragment) {
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(cardDeviceFragment.getActivity()).a(R.string.IDS_hw_health_show_common_dialog_title).b(R.string.IDS_app_market_device_update).e(R.string.IDS_app_update_later, new View.OnClickListener() { // from class: rmb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47465b.d(view);
            }
        }).a(R.string.IDS_app_update_now, new View.OnClickListener() { // from class: rmt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardDeviceFragment cardDeviceFragment2 = cardDeviceFragment;
                rtk.e(cardDeviceFragment2.getActivity(), cardDeviceFragment2.getActivity(), cardDeviceFragment2.q);
            }
        }).b();
        this.e = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        if (this.e.isShowing() || cardDeviceFragment.getActivity().isFinishing()) {
            return;
        }
        this.e.show();
    }

    /* synthetic */ void d(View view) {
        CustomTextAlertDialog customTextAlertDialog = this.e;
        if (customTextAlertDialog != null) {
            customTextAlertDialog.dismiss();
            this.e = null;
        }
    }

    public void d(CardDeviceFragment cardDeviceFragment) {
        LogUtil.a("CardDeviceFragment CardDeviceHelper", "showBandUnavailableDialog");
        if (cardDeviceFragment == null) {
            LogUtil.j("CardDeviceFragment CardDeviceHelper", "showBandUnavailableDialog fragment is null");
            return;
        }
        if (CommonUtil.i(cardDeviceFragment.getActivity(), "com.huawei.health.MainActivity")) {
            CustomTextAlertDialog customTextAlertDialog = this.f;
            if (customTextAlertDialog != null && customTextAlertDialog.isShowing()) {
                LogUtil.a("CardDeviceFragment CardDeviceHelper", "showBandUnavailableDialog Already show!");
                return;
            }
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(cardDeviceFragment.getActivity()).a(R.string.IDS_service_area_notice_title).a(cardDeviceFragment.getActivity().getString(R.string.IDS_band_is_unavailable_tip_string_newphone)).a(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: rmm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogUtil.d("CardDeviceFragment CardDeviceHelper", "onClick");
                }
            }).b();
            this.f = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
            if (this.f.isShowing() || cardDeviceFragment.getActivity().isFinishing()) {
                return;
            }
            this.f.show();
        }
    }

    public void c(CardDeviceFragment cardDeviceFragment) {
        if (cardDeviceFragment == null || CommonUtil.i(cardDeviceFragment.getActivity(), "com.huawei.ui.device.activity.pairing.DevicePairGuideActivity")) {
            LogUtil.j("CardDeviceFragment CardDeviceHelper", "accountInconsistentAlertDialog fragment is null");
            return;
        }
        if (this.f47468b == null) {
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(cardDeviceFragment.getActivity()).e(cardDeviceFragment.getActivity().getResources().getString(R.string.IDS_not_connect_inconsistent_account_title)).a(cardDeviceFragment.getActivity().getResources().getString(R.string.IDS_not_connect_inconsistent_account_content)).e(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: rmi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f47491b.b(view);
                }
            }).b();
            this.f47468b = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
            if (this.f47468b.isShowing() || cardDeviceFragment.getActivity().isFinishing()) {
                return;
            }
            this.f47468b.show();
        }
    }

    /* synthetic */ void b(View view) {
        LogUtil.a("CardDeviceFragment CardDeviceHelper", "user indicates know");
        this.f47468b.dismiss();
        this.f47468b = null;
    }

    private void a(CardDeviceFragment cardDeviceFragment, dru druVar, boolean z) {
        LogUtil.a("CardDeviceFragment CardDeviceHelper", "onItemClick wear");
        if (druVar.i() instanceof dxy) {
            dxy dxyVar = (dxy) druVar.i();
            if (z && cardDeviceFragment.ar != null && !cardDeviceFragment.ar.equals(dxyVar.d()) && dxyVar.b() != 2) {
                LogUtil.a("CardDeviceFragment CardDeviceHelper", "other devices is connection,can not start activity.");
                return;
            }
            if (dxyVar.b() == 2) {
                rtk.d(cardDeviceFragment.getActivity(), dxyVar);
            } else if (dxyVar.h()) {
                rdt.e(4);
                rtk.c(cardDeviceFragment.getActivity(), dxyVar, druVar.f());
            } else {
                rtk.d(cardDeviceFragment.getActivity(), dxyVar);
            }
        }
    }

    public void g(CardDeviceFragment cardDeviceFragment) {
        if (cardDeviceFragment == null || !CommonUtil.ck()) {
            return;
        }
        lvk.c("CardDeviceFragment CardDeviceHelper");
        rtk.b(cardDeviceFragment.l);
        rtk.b(cardDeviceFragment.k);
        rtk.b(cardDeviceFragment.al);
        rtk.c(this.g, cardDeviceFragment.bc);
        rtk.b(cardDeviceFragment.ah);
        tqp.a(cardDeviceFragment.o);
        WifiConnectReceiver.e().d();
        BroadcastManagerUtil.b(cardDeviceFragment.h, cardDeviceFragment.ax);
    }

    public void d(CardDeviceFragment cardDeviceFragment, DeviceInfo deviceInfo) {
        if (cardDeviceFragment == null || !CommonUtil.i(cardDeviceFragment.getActivity(), "com.huawei.health.MainActivity")) {
            LogUtil.j("CardDeviceFragment CardDeviceHelper", "accountInconsistentAlertDialog fragment is null");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.h;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            this.h.cancel();
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(cardDeviceFragment.getActivity()).a(String.format(Locale.ENGLISH, cardDeviceFragment.getActivity().getString(R.string.IDS_kid_oobe_pair_tips), deviceInfo.getDeviceName())).c(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: rmc.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("CardDeviceFragment CardDeviceHelper", "showKidAccountNotSupportPairDialog, click");
            }
        }).c();
        this.h = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        if (this.h.isShowing() || cardDeviceFragment.getActivity().isFinishing()) {
            return;
        }
        this.h.show();
    }

    public void b(CardDeviceFragment cardDeviceFragment, DeviceInfo deviceInfo) {
        if (cardDeviceFragment == null) {
            LogUtil.j("CardDeviceFragment CardDeviceHelper", "showCheckDeleteBluetoothDialog fragment is null");
            return;
        }
        if (cardDeviceFragment.getActivity().isFinishing() || !CommonUtil.i(cardDeviceFragment.getActivity(), "com.huawei.health.MainActivity")) {
            LogUtil.j("CardDeviceFragment CardDeviceHelper", "showCheckDeleteBluetoothDialog activity is not available");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.d;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            this.d.cancel();
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(cardDeviceFragment.getActivity()).a(String.format(Locale.ENGLISH, cardDeviceFragment.getActivity().getString(R.string.ids_check_delete_bluetooth_tips), deviceInfo.getDeviceName())).c(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: rmc.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("CardDeviceFragment CardDeviceHelper", "showCheckDeleteBluetoothDialog, click");
            }
        }).c();
        this.d = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.d.show();
    }

    public static void a() {
        LogUtil.a("CardDeviceFragment CardDeviceHelper", "destroyInstance() start.");
        synchronized (f47467c) {
            f47466a = null;
        }
    }
}
