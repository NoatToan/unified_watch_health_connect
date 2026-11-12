package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.gson.JsonSyntaxException;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.runcard.trackfragments.adapters.AutoRecordHistoryAdapter;
import com.huawei.ui.homehealth.view.NoTitleCustomViewDialog;
import com.huawei.ui.main.stories.history.SportHistoryActivity;
import com.huawei.ui.main.stories.me.util.AppSettingUtil;
import defpackage.szl;
import health.compact.a.CommonUtils;
import health.compact.a.KeyValDbManager;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class szl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static CustomPermissionAction f48836a;

    public static void b(final Context context, final iyd iydVar, boolean z, final IBaseResponseCallback iBaseResponseCallback) {
        String str;
        if (context == null || iydVar == null || iBaseResponseCallback == null) {
            LogUtil.j("Track_SportAutoTrackUtils", "showAutoRecordsGuideDialog params is error");
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.auto_records_guide_layout, (ViewGroup) null);
        ((HealthTextView) viewInflate.findViewById(R.id.tv_auto_records_guide_title)).setText(context.getString(R.string.IDS_auto_track));
        String string = iydVar.f() ? context.getString(R.string.IDS_auto_track_guide_content) : context.getString(R.string.IDS_auto_track_explain_run);
        if (!z) {
            str = "auto_identify_record_guide_cancel";
        } else {
            str = "auto_identify_record_guide_cancel_for_walk";
        }
        final String str2 = str;
        ((HealthTextView) viewInflate.findViewById(R.id.tv_auto_records_guide_content)).setText(string);
        final String strValue = AnalyticsValue.HEALTH_AUTO_TRACK_DIALOG_GUIDE_1040071.value();
        NoTitleCustomViewDialog.Builder builder = new NoTitleCustomViewDialog.Builder(context);
        builder.c(false).a(viewInflate).b(true).b(context.getString(R.string.IDS_auto_track_open), new View.OnClickListener() { // from class: szh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                szl.e(context, iydVar, str2, strValue, iBaseResponseCallback, view);
            }
        }).c(context.getString(R.string.IDS_hw_common_ui_dialog_cancel), new View.OnClickListener() { // from class: szk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                szl.c(context, str2, strValue, iBaseResponseCallback, view);
            }
        });
        NoTitleCustomViewDialog noTitleCustomViewDialogD = builder.d();
        HealthButton healthButtonA = builder.a();
        if (healthButtonA != null) {
            healthButtonA.setBackground(null);
            healthButtonA.setTextColor(context.getColor(R.color.health_commonui_healthbutton_text_normal));
            noTitleCustomViewDialogD.setCancelable(false);
        }
        noTitleCustomViewDialogD.show();
        d(context, 0, strValue);
    }

    static /* synthetic */ void e(Context context, iyd iydVar, String str, String str2, IBaseResponseCallback iBaseResponseCallback, View view) {
        e(context, iydVar, str);
        d(context, 3, str2);
        iBaseResponseCallback.a(0, true);
    }

    static /* synthetic */ void c(Context context, String str, String str2, IBaseResponseCallback iBaseResponseCallback, View view) {
        b(context, str);
        d(context, 2, str2);
        iBaseResponseCallback.a(0, true);
    }

    private static void e(Context context, iyd iydVar, String str) {
        iydVar.a(context);
        b(context, str);
        b(iydVar, context);
    }

    private static void b(Context context, String str) {
        SharedPreferenceManager.e(context, Integer.toString(10005), str, Boolean.toString(true), null);
    }

    /* JADX INFO: renamed from: szl$3, reason: invalid class name */
    class AnonymousClass3 extends CustomPermissionAction {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f48837b;
        final /* synthetic */ iyd e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Context context, Context context2, iyd iydVar) {
            super(context);
            this.f48837b = context2;
            this.e = iydVar;
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            LogUtil.a("Track_SportAutoTrackUtils", "Granted Permission");
            if (!szl.a(this.f48837b)) {
                szl.b(this.f48837b, this.e, true);
            } else {
                PermissionUtil.d(this.f48837b, PermissionUtil.PermissionType.LOCATION_WITH_BACKGROUND, szl.f48836a);
            }
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onDenied(String str) {
            super.onDenied(str);
            LogUtil.j("Track_SportAutoTrackUtils", "permission denied by the user");
            if (!PermissionUtil.b() || !dep.e(this.f48837b)) {
                szl.b(this.f48837b, this.e, PermissionUtil.j() && dep.e(this.f48837b));
            } else {
                szl.b(this.f48837b);
            }
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
            LogUtil.j("Track_SportAutoTrackUtils", "permission forever denied, show the guide window");
            if ((PermissionUtil.j() || permissionType != PermissionUtil.PermissionType.LOCATION) && permissionType != PermissionUtil.PermissionType.LOCATION_WITH_BACKGROUND) {
                return;
            }
            final Context context = this.f48837b;
            final iyd iydVar = this.e;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: szn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    szl.AnonymousClass3.d(context, iydVar, view);
                }
            };
            final Context context2 = this.f48837b;
            final iyd iydVar2 = this.e;
            qrs.b(context, permissionType, onClickListener, new View.OnClickListener() { // from class: szq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    szl.AnonymousClass3.b(context2, iydVar2, view);
                }
            });
        }

        static /* synthetic */ void d(Context context, iyd iydVar, View view) {
            LogUtil.a("Track_SportAutoTrackUtils", "onForeverDenied on click confirm");
            szl.b(context, iydVar, false);
        }

        static /* synthetic */ void b(Context context, iyd iydVar, View view) {
            LogUtil.a("Track_SportAutoTrackUtils", "onForeverDenied on click cancel");
            szl.b(context, iydVar, false);
        }
    }

    private static void b(iyd iydVar, Context context) {
        f48836a = new AnonymousClass3(context, context, iydVar);
        e(context, iydVar);
    }

    private static void e(Context context, iyd iydVar) {
        if (PermissionUtil.j() && dep.e(context)) {
            b(context, iydVar, true);
            return;
        }
        if (PermissionUtil.b()) {
            if (dep.e(context)) {
                b(context);
                return;
            } else {
                PermissionUtil.d(context, PermissionUtil.PermissionType.LOCATION_WITH_BACKGROUND, f48836a);
                return;
            }
        }
        PermissionUtil.d(context, PermissionUtil.PermissionType.LOCATION, f48836a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean a(Context context) {
        LogUtil.a("Track_SportAutoTrackUtils", "enter isApplyBackgroundLocationPermission");
        return (PermissionUtil.j() || PermissionUtil.e(context, PermissionUtil.PermissionType.LOCATION_WITH_BACKGROUND) == PermissionUtil.PermissionResult.GRANTED) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, iyd iydVar, boolean z) {
        des.a(context, 5, true, z, (int) iydVar.a());
        new AppSettingUtil(context).d(z, iydVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final Context context) {
        LogUtil.a("Track_SportAutoTrackUtils", "enter showLocationTips show dialog");
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).a(context.getString(R.string.IDS_hw_need_always_access_location_permissions_tips)).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: szo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("Track_SportAutoTrackUtils", "showLocationTips onClick cancel");
            }
        }).c(R.string.IDS_common_enable_button, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.utils.SportAutoTrackUtils$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                szl.b(context, view);
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public static /* synthetic */ void b(Context context, View view) {
        LogUtil.a("Track_SportAutoTrackUtils", "showLocationTips onClick confirm");
        PermissionUtil.d(context, dep.a(), f48836a);
    }

    public static void d(final Context context, List<vqt> list, final IBaseResponseCallback iBaseResponseCallback) {
        if (context == null || njy.e(list)) {
            LogUtil.j("Track_SportAutoTrackUtils", "showAutoRecordsHistoryDialog context is null or list is empty");
            iBaseResponseCallback.a(0, "");
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.auto_records_history_layout, (ViewGroup) null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.htv_auto_records_title);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.htv_auto_records_time);
        healthTextView.setText(context.getResources().getQuantityString(R.plurals.IDS_auto_track_records, list.size(), Integer.valueOf(list.size())));
        healthTextView2.setText(c(list));
        HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.hr_auto_records);
        AutoRecordHistoryAdapter autoRecordHistoryAdapter = new AutoRecordHistoryAdapter(list, context);
        healthRecycleView.setHasFixedSize(true);
        healthRecycleView.setLayoutManager(new LinearLayoutManager(context));
        healthRecycleView.setAdapter(autoRecordHistoryAdapter);
        final String strValue = AnalyticsValue.HEALTH_AUTO_TRACK_DIALOG_HISTORY_1040075.value();
        NoTitleCustomViewDialog.Builder builder = new NoTitleCustomViewDialog.Builder(context);
        builder.c(true).a(viewInflate).b(list.size() < 3).b(context.getString(R.string.IDS_auto_track_dialog_confirm), new View.OnClickListener() { // from class: szp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                szl.b(context, strValue, iBaseResponseCallback, view);
            }
        }).c(context.getString(R.string.IDS_auto_track_dialog_cancel), new View.OnClickListener() { // from class: szm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                szl.a(context, strValue, iBaseResponseCallback, view);
            }
        });
        NoTitleCustomViewDialog noTitleCustomViewDialogD = builder.d();
        noTitleCustomViewDialogD.setCancelable(false);
        noTitleCustomViewDialogD.show();
        d(context, 0, strValue);
    }

    static /* synthetic */ void b(Context context, String str, IBaseResponseCallback iBaseResponseCallback, View view) {
        d(context, 1, str);
        iBaseResponseCallback.a(0, "");
        iov.d(context, new Intent(context, (Class<?>) SportHistoryActivity.class));
    }

    static /* synthetic */ void a(Context context, String str, IBaseResponseCallback iBaseResponseCallback, View view) {
        d(context, 2, str);
        SharedPreferenceManager.e(context, Integer.toString(10005), "auto_identify_record_history_cancel", Boolean.toString(true), null);
        iBaseResponseCallback.a(0, "");
    }

    private static String c(List<vqt> list) {
        ArrayList arrayList = new ArrayList();
        for (vqt vqtVar : list) {
            arrayList.add(Long.valueOf(vqtVar.o()));
            arrayList.add(Long.valueOf(vqtVar.g()));
        }
        long jLongValue = ((Long) Collections.min(arrayList)).longValue();
        long jLongValue2 = ((Long) Collections.max(arrayList)).longValue();
        String strE = ltb.e(new Date(jLongValue), "yyyy/MM/dd");
        String strE2 = ltb.e(new Date(jLongValue2), "MM/dd");
        if (!qrk.a(jLongValue, jLongValue2)) {
            strE2 = ltb.e(new Date(jLongValue2), "yyyy/MM/dd");
        }
        return strE + Constants.LINK + strE2;
    }

    public static void c(Context context, final IBaseResponseCallback iBaseResponseCallback) {
        if (context == null || iBaseResponseCallback == null) {
            LogUtil.j("Track_SportAutoTrackUtils", "getAutoRecordsData context or callback is null");
            return;
        }
        String strE = SharedPreferenceManager.e(context, String.valueOf(20002), "first_open_auto_identify_record_switch_time");
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("Track_SportAutoTrackUtils", "getAutoRecordsData firstOpenSwitchTime is not uninitialized");
            return;
        }
        nkb.d().b(Math.max(der.e(), CommonUtils.i(strE)), System.currentTimeMillis(), new int[]{257, 258}, new IBaseResponseCallback() { // from class: szl.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                List list;
                try {
                    list = njy.b(obj, HiHealthData.class) ? (List) obj : null;
                } catch (ClassCastException unused) {
                    LogUtil.e("Track_SportAutoTrackUtils", "showAutoRecordsDialog classCastException");
                }
                ArrayList arrayList = new ArrayList(10);
                szl.d(list, arrayList);
                iBaseResponseCallback.a(0, arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(List<HiHealthData> list, List<vqt> list2) {
        if (njy.e(list)) {
            LogUtil.j("Track_SportAutoTrackUtils", "saveSingleTrackData trackData is empty");
            return;
        }
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                try {
                    HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class);
                    if (hiTrackMetaData.getTrackType() == 1) {
                        vqt vqtVar = new vqt();
                        d(vqtVar, hiTrackMetaData, hiHealthData);
                        vqtVar.c(hiHealthData.getInt("trackdata_deviceType"));
                        vqtVar.e(hiHealthData.getString("device_prodid"));
                        vqtVar.c(hiHealthData.getString("device_subprodid"));
                        vqtVar.i(hiTrackMetaData.getSportType());
                        vqtVar.d(hiTrackMetaData.getAvgPace());
                        vqtVar.d(hiTrackMetaData.getTotalDistance(), hiTrackMetaData.getChiefSportDataType());
                        list2.add(vqtVar);
                    }
                } catch (JsonSyntaxException unused) {
                    LogUtil.j("Track_SportAutoTrackUtils", "parseTrackSimplifyData trackMetaData is jsonSyntaxException");
                }
            }
        }
    }

    private static vqt d(vqt vqtVar, HiTrackMetaData hiTrackMetaData, HiHealthData hiHealthData) {
        long startTime = hiHealthData.getStartTime();
        long endTime = hiHealthData.getEndTime();
        long totalTime = hiTrackMetaData.getTotalTime();
        vqtVar.c(startTime);
        vqtVar.b(endTime);
        vqtVar.d(totalTime);
        return vqtVar;
    }

    private static void d(Context context, int i, String str) {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("event", Integer.valueOf(i));
        lmf.d().c(context, str, map, 0);
    }

    public static boolean a(Context context, iyd iydVar) {
        if (context == null || iydVar == null) {
            LogUtil.j("Track_SportAutoTrackUtils", "isShowAutoRecordsGuideDialog context or autoTrackConfig is null");
            return false;
        }
        if (qrs.ah(context)) {
            LogUtil.a("Track_SportAutoTrackUtils", "isShowAutoRecordsGuideDialog the current device is pad");
            return false;
        }
        if (!"1".equals(KeyValDbManager.d(context).c("SUPPORT_AR_ABILITY"))) {
            LogUtil.a("Track_SportAutoTrackUtils", "isShowAutoRecordsGuideDialog AR capability is not supported");
            return false;
        }
        if (iydVar.d()) {
            return true;
        }
        LogUtil.a("Track_SportAutoTrackUtils", "isShowAutoRecordsGuideDialog is not show AutoTrackBtn");
        return false;
    }

    public static void a(Context context, int i, int i2, int i3) {
        if (context == null) {
            LogUtil.j("Track_SportAutoTrackUtils", "setAutoRecordsDataBi context is null");
            return;
        }
        HashMap map = new HashMap(4);
        map.put("click", 1);
        map.put("runNumber", Integer.valueOf(i));
        map.put("walkNumer", Integer.valueOf(i2));
        map.put("totalNumber", Integer.valueOf(i3));
        lmf.d().c(context, AnalyticsValue.HEALTH_AUTO_TRACK_HISTORY_1040074.value(), map, 0);
    }
}
