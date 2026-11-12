package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.ecgservice.EcgServiceActivationData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.device.utlis.BluetoothPermisionUtils;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.home.WearHomeOldActivity;
import com.huawei.ui.homewear21.home.card.WearHomeBaseCard;
import com.huawei.ui.homewear21.home.holder.WearHomeTipHolder;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class tog extends WearHomeBaseCard {
    private WearHomeTipHolder d;
    private int e = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IBaseResponseCallback f49431c = new IBaseResponseCallback() { // from class: tog.4
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("WearHomeTipPermissionCard", "WearHomeTipPermissionCard Ecg Callback onResponse errCode:", Integer.valueOf(i));
            if (i == 0) {
                tog.this.f();
            }
            tog.this.d();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBaseResponseCallback f49429a = new IBaseResponseCallback() { // from class: toe
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public final void a(int i, Object obj) {
            this.f49427c.e(i, obj);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBaseResponseCallback f49430b = new IBaseResponseCallback() { // from class: tog.5
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("WearHomeTipPermissionCard", "mBaseCallback onResponse errCode:", Integer.valueOf(i));
            if (i == 0) {
                LogUtil.a("WearHomeTipPermissionCard", "mBaseCallback onResponse success");
                tog.this.mActivity.i();
                tog.this.c();
                if (tog.this.mActivity != null) {
                    PermissionUtil.d(tog.this.mActivity, PermissionUtil.PermissionType.LOCATION, new CustomPermissionAction(tog.this.mActivity) { // from class: tog.5.4
                        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                        public void onGranted() {
                            LogUtil.j("WearHomeTipPermissionCard", "mBaseCallback onGranted");
                            tog.this.a();
                        }

                        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                        public void onDenied(String str) {
                            LogUtil.j("WearHomeTipPermissionCard", "mBaseCallback permission denied by the user");
                        }

                        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                        public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                            LogUtil.j("WearHomeTipPermissionCard", "mBaseCallback permission onForeverDenied by the user");
                            super.onForeverDenied(permissionType);
                        }
                    });
                }
            }
        }
    };

    /* synthetic */ void e(int i, Object obj) {
        LogUtil.a("WearHomeTipPermissionCard", "mNearbyPermissionCallback onResponse errCode:", Integer.valueOf(i));
        if (i == 0) {
            LogUtil.a("WearHomeTipPermissionCard", "mNearbyPermissionCallback onResponse success");
            this.mActivity.i();
            c();
            if (this.mActivity != null) {
                PermissionUtil.d(this.mActivity, PermissionUtil.PermissionType.SCAN, new CustomPermissionAction(this.mActivity) { // from class: tog.2
                    @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                    public void onGranted() {
                        LogUtil.a("WearHomeTipPermissionCard", "mNearbyPermissionCallback granted");
                    }
                });
            }
        }
    }

    public tog(Context context, WearHomeOldActivity wearHomeOldActivity) {
        this.mActivity = wearHomeOldActivity;
        this.mContext = context;
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.d = new WearHomeTipHolder(layoutInflater.inflate(R.layout.wear_home_tip_layout, viewGroup, false));
        LogUtil.a("WearHomeTipPermissionCard", "getCardViewHolder onUiCreate");
        h();
        return this.d;
    }

    private void h() {
        o();
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public void deviceConnectionChange(int i) {
        LogUtil.a("WearHomeTipPermissionCard", "deviceConnectionChange:", Integer.valueOf(i));
        this.e = i;
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public void onResume() {
        o();
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public void onDestroy() {
        LogUtil.a("WearHomeTipPermissionCard", "onDestroy");
    }

    private void o() {
        if (this.d == null) {
            return;
        }
        g();
        c();
    }

    public void d() {
        LogUtil.a("WearHomeTipPermissionCard", "enter initPermissionView");
        if (BluetoothPermisionUtils.d(this.mContext) && PermissionUtil.e(this.mContext, PermissionUtil.PermissionType.SCAN) == PermissionUtil.PermissionResult.GRANTED) {
            this.d.e().setVisibility(8);
            int i = AnonymousClass8.f49437c[PermissionUtil.e(this.mContext, PermissionUtil.PermissionType.LOCATION_WITH_BACKGROUND).ordinal()];
            if (i == 1) {
                LogUtil.a("WearHomeTipPermissionCard", "GRANTED");
                return;
            }
            if (i == 2) {
                LogUtil.a("WearHomeTipPermissionCard", "DENIED");
                j();
            } else if (i == 3) {
                LogUtil.a("WearHomeTipPermissionCard", "FOREVER_DENIED");
                i();
            } else {
                LogUtil.a("WearHomeTipPermissionCard", "default");
            }
        }
    }

    /* JADX INFO: renamed from: tog$8, reason: invalid class name */
    static /* synthetic */ class AnonymousClass8 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f49437c;

        static {
            int[] iArr = new int[PermissionUtil.PermissionResult.values().length];
            f49437c = iArr;
            try {
                iArr[PermissionUtil.PermissionResult.GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49437c[PermissionUtil.PermissionResult.DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49437c[PermissionUtil.PermissionResult.FOREVER_DENIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        boolean z = false;
        boolean zIsSupportEcgAuth = this.mActivity.e != null ? this.mActivity.e.isSupportEcgAuth() : false;
        if (eey.d(this.mActivity.d, 106) && fej.a("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.ecgce")) {
            z = true;
        }
        boolean zO = Utils.o();
        LogUtil.a("WearHomeTipPermissionCard", "startEcgForParamsByCapability isSupportEcgAuth:", Boolean.valueOf(zIsSupportEcgAuth), ", isSupportEcgAnalysis:", Boolean.valueOf(z), ", isOversea:", Boolean.valueOf(zO));
        if (z) {
            LogUtil.a("WearHomeTipPermissionCard", "startEcgForParamsByCapability start ecg analysis");
            prf.d(BaseApplication.getContext(), "com.huawei.health.h5.ecgce", 2, "interpretation");
        } else {
            if (!zIsSupportEcgAuth || zO) {
                return;
            }
            prf.d(BaseApplication.getContext(), "com.huawei.health.ecg.collection", 2, "interpretation");
        }
    }

    private void g() {
        if (BluetoothPermisionUtils.d(this.mContext)) {
            this.d.e().setVisibility(8);
            return;
        }
        this.d.d().setText(this.mContext.getResources().getString(R.string.IDS_tip_permission_setting).toUpperCase(Locale.ENGLISH));
        this.d.c().setText(this.mContext.getResources().getString(R.string.IDS_settings_button_cancal_ios_btn).toUpperCase(Locale.ENGLISH));
        String string = this.mContext.getResources().getString(R.string.IDS_hw_bluetooth_permission_title);
        String string2 = this.mContext.getResources().getString(R.string.IDS_hw_bluetooth_permission_content);
        qjy.a(BaseApplication.getContext(), "nearby_permissions_tip", this.f49429a, this.d.e(), string, string2);
        this.d.b().setText(string2);
    }

    private void j() {
        if (mgb.d(this.mActivity.f26233a) == 2) {
            LogUtil.j("WearHomeTipPermissionCard", "initPermissionToastView is family_pair_mode");
            return;
        }
        LogUtil.a("WearHomeTipPermissionCard", "initPermissionToastView");
        if (this.mContext == null) {
            return;
        }
        this.d.d().setText(this.mContext.getResources().getString(R.string.IDS_tip_permission_setting).toUpperCase(Locale.ENGLISH));
        this.d.a().setText(this.mContext.getResources().getString(R.string.IDS_press_never_show_again).toUpperCase(Locale.ENGLISH));
        this.d.c().setText(this.mContext.getResources().getString(R.string.IDS_settings_button_cancal_ios_btn).toUpperCase(Locale.ENGLISH));
        String string = this.mContext.getResources().getString(R.string.IDS_hw_need_always_access_location_permissions_title);
        if (this.mActivity.f == 75) {
            String string2 = this.mContext.getResources().getString(R.string.IDS_tip_location_permissions_bolt);
            qjy.a(BaseApplication.getContext(), "locations_permissions_tip", this.f49430b, this.d.e(), string, ((Object) e(string2)) + "");
            this.d.b().setText(e(string2));
            return;
        }
        String string3 = this.mContext.getResources().getString(R.string.IDS_tip_location_permissions);
        qjy.a(BaseApplication.getContext(), "locations_permissions_tip", this.f49430b, this.d.e(), string, ((Object) b(string3)) + "");
        this.d.b().setText(b(string3));
    }

    private SpannableString e(String str) {
        String string = this.mContext.getResources().getString(R.string.IDS_tip_motion_track_bolt);
        String string2 = this.mContext.getResources().getString(R.string.IDS_tip_permission_always_allow);
        String str2 = String.format(Locale.ENGLISH, str, string, string2);
        SpannableString spannableString = new SpannableString(str2);
        int iIndexOf = str2.indexOf(string);
        if (iIndexOf < 0) {
            LogUtil.j("WearHomeTipPermissionCard", "getPermissionToastStringBolt: firstStart is less than 0");
            return null;
        }
        spannableString.setSpan(new ForegroundColorSpan(this.mContext.getResources().getColor(R.color.textColorPrimary)), iIndexOf, string.length() + iIndexOf, 17);
        int iIndexOf2 = str2.indexOf(string2);
        if (iIndexOf2 < 0) {
            LogUtil.j("WearHomeTipPermissionCard", "getPermissionToastStringBolt: secondStart is less than 0");
            return null;
        }
        spannableString.setSpan(new ForegroundColorSpan(this.mContext.getResources().getColor(R.color.textColorPrimary)), iIndexOf2, string2.length() + iIndexOf2, 17);
        LogUtil.j("WearHomeTipPermissionCard", "getPermissionToastStringBolt spannableString: ", ((Object) spannableString) + "");
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (!PermissionUtil.a()) {
            LogUtil.a("WearHomeTipPermissionCard", "Current version is not bigger than Q");
            return;
        }
        LogUtil.a("WearHomeTipPermissionCard", "applyBackgroundLocationPermission requestPermission");
        if (this.mActivity != null) {
            PermissionUtil.d(this.mActivity, PermissionUtil.PermissionType.LOCATION_WITH_BACKGROUND, new CustomPermissionAction(this.mActivity) { // from class: tog.3
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("WearHomeTipPermissionCard", "applyBackgroundLocationPermission onGranted");
                }

                @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onDenied(String str) {
                    LogUtil.a("WearHomeTipPermissionCard", "applyBackgroundLocationPermission permission denied by the user");
                }
            });
        }
    }

    private SpannableString b(String str) {
        return d(String.format(Locale.ENGLISH, str, this.mContext.getResources().getString(R.string.IDS_tip_permission_weather_send), this.mContext.getResources().getString(R.string.IDS_tip_permission_motion_track), this.mContext.getResources().getString(R.string.IDS_tip_permission_always_allow)));
    }

    private SpannableString d(String str) {
        String string = this.mContext.getResources().getString(R.string.IDS_tip_permission_weather_send);
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf = str.indexOf(string);
        if (iIndexOf < 0) {
            LogUtil.j("WearHomeTipPermissionCard", "getPermissionToastString: firstStart is less than 0");
            return null;
        }
        spannableString.setSpan(new ForegroundColorSpan(this.mContext.getResources().getColor(R.color.textColorPrimary)), iIndexOf, string.length() + iIndexOf, 17);
        String string2 = this.mContext.getResources().getString(R.string.IDS_tip_permission_motion_track);
        int iIndexOf2 = str.indexOf(string2);
        if (iIndexOf2 < 0) {
            LogUtil.j("WearHomeTipPermissionCard", "getMidwareAuthorityDeclaration: secondStart is less than 0");
            return null;
        }
        spannableString.setSpan(new ForegroundColorSpan(this.mContext.getResources().getColor(R.color.textColorPrimary)), iIndexOf2, string2.length() + iIndexOf2, 17);
        String string3 = this.mContext.getResources().getString(R.string.IDS_tip_permission_always_allow);
        int iIndexOf3 = str.indexOf(string3);
        if (iIndexOf3 < 0) {
            LogUtil.j("WearHomeTipPermissionCard", "getMidwareAuthorityDeclaration: thirdStart is less than 0");
            return null;
        }
        spannableString.setSpan(new ForegroundColorSpan(this.mContext.getResources().getColor(R.color.textColorPrimary)), iIndexOf3, string3.length() + iIndexOf3, 17);
        LogUtil.j("WearHomeTipPermissionCard", "spannableString: ", ((Object) spannableString) + "");
        return spannableString;
    }

    private void i() {
        LogUtil.a("WearHomeTipPermissionCard", "initToSetToastView");
        if (this.mContext == null) {
            return;
        }
        WearHomeTipHolder wearHomeTipHolder = this.d;
        if (wearHomeTipHolder == null) {
            LogUtil.j("WearHomeTipPermissionCard", "initToSetToastView mWearHomeTipHolder is null");
            return;
        }
        wearHomeTipHolder.e().setVisibility(8);
        this.d.d().setText(this.mContext.getResources().getString(R.string.IDS_hwh_motiontrack_permission_guide_go_set).toUpperCase(Locale.ENGLISH));
        this.d.a().setText(this.mContext.getResources().getString(R.string.IDS_press_never_show_again).toUpperCase(Locale.ENGLISH));
        this.d.c().setText(this.mContext.getResources().getString(R.string.IDS_settings_button_cancal_ios_btn).toUpperCase(Locale.ENGLISH));
        String string = this.mContext.getResources().getString(R.string.IDS_hw_need_always_access_location_permissions_title);
        String str = this.mContext.getResources().getString(R.string.IDS_tip_location_permissions) + this.mContext.getResources().getString(qrs.b(PermissionUtil.PermissionType.LOCATION_WITH_BACKGROUND));
        qjy.a(BaseApplication.getContext(), "locations_permissions_tip", new IBaseResponseCallback() { // from class: tog.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("WearHomeTipPermissionCard", "initToSetToastView onResponse errCode:", Integer.valueOf(i));
                if (i == 0) {
                    LogUtil.a("WearHomeTipPermissionCard", "initToSetToastView onResponse success");
                    tog.this.mActivity.i();
                    qrs.al(tog.this.mContext);
                }
            }
        }, this.d.e(), string, ((Object) b(str)) + "");
        this.d.b().setText(b(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.e != 2) {
            LogUtil.j("WearHomeTipPermissionCard", "initEcgServiceActiveCardView device disconnect.");
            this.d.e().setVisibility(8);
            return;
        }
        if (this.mContext == null || Utils.o()) {
            LogUtil.j("WearHomeTipPermissionCard", "initEcgServiceActiveCardView mContext is null");
            d();
            return;
        }
        boolean zD = this.mActivity.d != null ? eey.d(this.mActivity.d, 45) : false;
        LogUtil.a("WearHomeTipPermissionCard", "isSupportEcgParsingService:", Boolean.valueOf(zD));
        if (!zD) {
            LogUtil.j("WearHomeTipPermissionCard", "not support EcgServiceIV");
            d();
        } else {
            lvr.a().c(new IBaseResponseCallback() { // from class: tog.10
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (!(obj instanceof EcgServiceActivationData)) {
                        LogUtil.j("WearHomeTipPermissionCard", "objData not instanceof EcgServiceActivationData");
                        tog.this.b(1038);
                        return;
                    }
                    EcgServiceActivationData ecgServiceActivationData = (EcgServiceActivationData) obj;
                    LogUtil.a("WearHomeTipPermissionCard", "WearHomeTipPermissionCard data is ok.");
                    if (ecgServiceActivationData.getStatus() != 0 && (ecgServiceActivationData.getStatus() != 1 || ecgServiceActivationData.getProbationUser() != 0)) {
                        tog.this.b(1038);
                    } else {
                        LogUtil.a("WearHomeTipPermissionCard", "Need show EcgServiceActiveCardView.");
                        tog.this.b(1036);
                    }
                }
            }, this.mActivity.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        if (this.mActivity == null || this.mActivity.d() == null) {
            return;
        }
        this.mActivity.d().sendEmptyMessage(i);
    }

    public void b() {
        this.d.d().setText(this.mContext.getResources().getString(R.string.IDS_hw_common_ui_dialog_active).toUpperCase(Locale.ENGLISH));
        this.d.c().setText(this.mContext.getResources().getString(R.string.IDS_hw_common_active_later).toUpperCase(Locale.ENGLISH));
        qjy.e(BaseApplication.getContext(), this.f49431c, this.d.e(), this.mContext.getResources().getString(R.string.IDS_ecg_service_tip_title), this.mContext.getResources().getString(R.string.IDS_ecg_service_tip_msg, "599"));
    }

    public static void e() {
        if (SharedPreferenceManager.b(Integer.toString(10006), "has_synchronize_wear_activity_notify", false)) {
            return;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10006), "wear_activity_notify_open_no_again_tip");
        String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10006), "wear_activity_notify_open_dialog_time");
        String strE3 = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10006), "wear_activity_notify_open_count");
        String strE4 = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10006), "wear_activity_notify_open_is_shown");
        String[] strArr = {"locations_permissions_tip", "nearby_permissions_tip", "notification_open_tip"};
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            String str2 = "wear_activity_tip_no_again" + str;
            String str3 = "wear_activity_tip_last_time" + str;
            String str4 = "wear_activity_tip_open_count " + str;
            String str5 = "wear_activity_tip_is_shown" + str;
            if (!TextUtils.isEmpty(strE)) {
                SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10006), str2, strE, new StorageParams());
            }
            if (!TextUtils.isEmpty(strE2)) {
                SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10006), str3, strE2, new StorageParams());
            }
            if (!TextUtils.isEmpty(strE3)) {
                SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10006), str4, strE3, new StorageParams());
            }
            if (!TextUtils.isEmpty(strE)) {
                SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10006), str5, strE4, new StorageParams());
            }
        }
        SharedPreferenceManager.a(Integer.toString(10006), "has_synchronize_wear_activity_notify", true);
    }
}
