package com.huawei.hwdevice.phoneprocess.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.os.Build;
import android.os.Bundle;
import android.provider.CallLog;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.MsgImage;
import com.huawei.hwcommonmodel.datatypes.MsgText;
import com.huawei.hwdevice.phoneprocess.mgr.notification.HwNotificationConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import defpackage.eei;
import defpackage.ltd;
import defpackage.mir;
import defpackage.nby;
import defpackage.nca;
import defpackage.ncc;
import defpackage.ncg;
import defpackage.ncl;
import defpackage.ncp;
import defpackage.ndf;
import defpackage.ndj;
import defpackage.nei;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.HarmonyBuild;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class IntegratedServicesReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17542a = 0;
    private Context d;

    public IntegratedServicesReceiver(Context context) {
        this.d = context;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        ReleaseLogUtil.d("R_IntegratedServicesReceiver", "onReceive handle action is: ", action);
        action.hashCode();
        switch (action) {
            case "com.huawei.health.ACTION_WEATHER_DATA_PUSH":
                LogUtil.a("IntegratedServicesReceiver", "pushWeatherDataToDevice");
                nei.c().d(true);
                break;
            case "com.huawei.health.ACTION_LOCAL_PRESSURE_PUSH":
                LogUtil.a("IntegratedServicesReceiver", "pushLocalPressureToDevice");
                nei.c().d();
                break;
            case "com.huawei.health.ACTION_NOTIFICATION_CLOCK_STATE":
                c(intent);
                break;
            case "com.huawei.bone.ACTION_NOTIFICATION_DELETE":
                b(intent);
                break;
            case "com.huawei.health.ACTION_WEATHER_PUSH":
                e(intent);
                break;
            case "com.huawei.health.ACTION_NOTIFICATION_ENABLE_PUSH":
                d(intent);
                break;
            case "com.huawei.bone.ACTION_NOTIFICATION_PUSH":
                a(intent);
                break;
            case "com.huawei.health.ACTION_NOTIFY_PUSH_MULTI_LINK":
                ndf.c(intent);
                break;
            case "com.huawei.intelligent.action.NOTIFY_MSG":
                ncp.b(intent, this.d);
                break;
            default:
                LogUtil.j("IntegratedServicesReceiver", "do not support action: ", action);
                break;
        }
    }

    private void c(Intent intent) {
        if (intent == null) {
            LogUtil.j("IntegratedServicesReceiver", "dealClockState intent is null");
            return;
        }
        String stringExtra = intent.getStringExtra("clockStateType");
        LogUtil.a("IntegratedServicesReceiver", "dealClockState dealClockState: ", stringExtra);
        if (TextUtils.equals(stringExtra, "0") && eei.a() && ncp.e()) {
            boolean booleanExtra = intent.getBooleanExtra("clockStateValue", false);
            LogUtil.a("IntegratedServicesReceiver", "dealClockState clockState: ", Boolean.valueOf(booleanExtra));
            ncl.d(this.d).c(false, false, booleanExtra, false);
        }
    }

    private void a(Intent intent) {
        Bundle extras;
        ReleaseLogUtil.d("R_IntegratedServicesReceiver", "pushNotificationToDevice enter");
        try {
            extras = intent.getExtras();
        } catch (Exception unused) {
            LogUtil.e("IntegratedServicesReceiver", "pushNotificationToDevice error");
            extras = null;
        }
        if (extras == null) {
            return;
        }
        String string = extras.getString("notificationSwitchChangeType");
        if (!TextUtils.isEmpty(string)) {
            LogUtil.a("IntegratedServicesReceiver", "pushNotificationToDevice changeType: ", string);
            if ("notificationSwitchChangeType".equals(string)) {
                ncl.d(this.d).j();
                return;
            }
            if ("subNotificationSwitchChangeType".equals(string)) {
                ncl.d(this.d).a(extras.getString("packageName"));
                return;
            }
            if ("notification_collaborate_switch_change".equals(string)) {
                ncg.b().d();
                return;
            }
            if ("notificationReplayChangeType".equals(string)) {
                ndj.a(2, 2);
                return;
            }
            if (String.valueOf(HwNotificationConstant.ListenerStatus.ON_LISTENER_DICONNECTED).equals(string)) {
                ncl.d(this.d).h();
                return;
            } else if (!"notificationLiveSwitchOpen".equals(string)) {
                LogUtil.a("IntegratedServicesReceiver", "pushNotificationToDevice else");
                return;
            } else {
                nby.a().b();
                return;
            }
        }
        if ("LIVE_NOTIFICATION_PUSH".equals(extras.getString("LIVE_NOTIFICATION_PUSH_TYPE"))) {
            LogUtil.a("IntegratedServicesReceiver", "pushNotificationToDevice 5.55.2 jsonString is :" + extras.getString("LIVE_NOTIFICATION_PUSH_JSON_STRING"));
            ncc.c().e(extras.getString("LIVE_NOTIFICATION_PUSH_JSON_STRING"));
            return;
        }
        c(extras, extras.getBoolean("data_extra_send_call_wechat", false), extras.getBoolean("data_extra_send_call_no_wechat", false));
    }

    private void c(Bundle bundle, boolean z, boolean z2) {
        int i;
        try {
            i = bundle.getInt("type");
        } catch (Exception unused) {
            LogUtil.e("IntegratedServicesReceiver", "pushNotificationToDevice messageType error");
            i = 0;
        }
        String string = "";
        try {
            string = bundle.getString("packagename");
            if (!z && "com.tencent.mm".equals(string)) {
                ReleaseLogUtil.d("R_IntegratedServicesReceiver", string, " pushNotificationToDevice wechat usual message not RING_CALL");
                bundle.putString("data_category", "msg");
            }
            if (z && "com.tencent.mm".equals(string) && !ncp.q()) {
                ReleaseLogUtil.d("R_IntegratedServicesReceiver", "pushNotificationToDevice do not support wechat voice push");
                return;
            }
            if (z2 && !a(string)) {
                ReleaseLogUtil.d("R_IntegratedServicesReceiver", string, " pushNotificationToDevice RING_CALL FAILED");
                return;
            }
            if (!ncp.p() && bundle.getInt("voip_type") == 2) {
                ReleaseLogUtil.d("R_IntegratedServicesReceiver", string, "pushNotificationToDevice isSupportVoipType false FAILED");
                return;
            }
            if (z2 && ncp.l()) {
                ReleaseLogUtil.d("R_IntegratedServicesReceiver", string, "pushNotificationToDevice SUPPORT and SET_CATEGORY_IMCALL");
                bundle.putString("data_category", "imcall");
            }
            LogUtil.a("IntegratedServicesReceiver", "pushNotificationToDevice notificationKey is: ", bundle.getString("data_extra_noty_key"));
            if (ncl.d(this.d).b(ncl.d(this.d).a(bundle, i, ncl.d(this.d).d(i, true, (List<MsgImage>) new ArrayList(16), (List<MsgText>) b(this.d, bundle), string)), 2)) {
                b(bundle);
            }
            this.f17542a++;
            if (ncl.d(this.d).b(this.f17542a)) {
                LogUtil.a("IntegratedServicesReceiver", "pushNotificationToDevice mSendingMessageNumber is: ", Integer.valueOf(this.f17542a));
                this.f17542a = 0;
            }
        } catch (Exception unused2) {
            LogUtil.e("IntegratedServicesReceiver", "pushNotificationToDevice message package error");
        }
    }

    private static void b(Bundle bundle) {
        long j = bundle.getLong("data_extra_noty_when");
        long j2 = bundle.getLong("data_extra_noty_posttime");
        long j3 = bundle.getLong("data_extra_on_notification_posted");
        LogUtil.a("IntegratedServicesReceiver", "reportDelayOp: ", Long.valueOf(j), ":", Long.valueOf(j2), ":", Long.valueOf(j3));
        if (j3 <= j2 || j2 <= j || j <= 0) {
            LogUtil.j("IntegratedServicesReceiver", "Notification time err ");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("otherAppDelay", String.valueOf(j2 - j));
        linkedHashMap.put("systemDelay", String.valueOf(j3 - j2));
        linkedHashMap.put("healthDelay", String.valueOf(jCurrentTimeMillis - j3));
        linkedHashMap.put("totalDelayTime", String.valueOf(jCurrentTimeMillis - j));
        OpAnalyticsUtil.getInstance().setEvent(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap);
    }

    private boolean a(String str) {
        if (TextUtils.equals(str, "com.whatsapp")) {
            ReleaseLogUtil.d("R_IntegratedServicesReceiver", str, " allows push RING_CALL");
            return true;
        }
        if (ncp.l()) {
            if (Build.VERSION.SDK_INT >= 29) {
                return d(str);
            }
            ReleaseLogUtil.d("R_IntegratedServicesReceiver", str, " pushNotificationToDevice RING_CALL_FAILED because android version is: ", Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        ReleaseLogUtil.d("R_IntegratedServicesReceiver", str, " pushNotificationToDevice RING_CALL_FAILED: DEVICE_CAPABILITY_INCAPABLE");
        return false;
    }

    private boolean d(String str) {
        return TextUtils.equals(str, "org.telegram.messenger") || TextUtils.equals(str, "com.gbox.com.whatsapp") || TextUtils.equals(str, "jp.naver.line.android") || TextUtils.equals(str, "com.gbox.jp.naver.line.android") || TextUtils.equals(str, "com.instagram.android") || TextUtils.equals(str, "com.gbox.com.instagram.android") || TextUtils.equals(str, "com.viber.voip") || TextUtils.equals(str, "org.thoughtcrime.securesms") || TextUtils.equals(str, "com.facebook.orca") || TextUtils.equals(str, "com.alibaba.android.rimet.aliding") || TextUtils.equals(str, "com.alibaba.android.rimet");
    }

    public ArrayList<MsgText> b(Context context, Bundle bundle) {
        int i;
        ArrayList<MsgText> arrayList = new ArrayList<>(16);
        if (context != null && bundle != null) {
            MsgText msgTextA = a(bundle);
            arrayList.add(msgTextA);
            arrayList.add(e(bundle));
            if (ltd.e().e(context, "android.permission.READ_CALL_LOG")) {
                MsgText msgText = new MsgText();
                try {
                    i = bundle.getInt("incoming_type");
                } catch (Exception unused) {
                    LogUtil.e("IntegratedServicesReceiver", "numberType error");
                    i = 0;
                }
                if (i == 7 && d(context, msgTextA, msgText)) {
                    msgText.setTextType(i);
                    arrayList.add(msgText);
                }
            }
            d(bundle, arrayList);
            c(bundle, arrayList);
            a(bundle, arrayList);
        }
        return arrayList;
    }

    private void d(Bundle bundle, ArrayList<MsgText> arrayList) {
        int i;
        try {
            i = bundle.getInt("incoming_type");
        } catch (Exception unused) {
            LogUtil.e("IntegratedServicesReceiver", "numberType error");
            i = 0;
        }
        if (i == 8 && ncp.p()) {
            String string = bundle.getString("reject_button_key", null);
            LogUtil.j("IntegratedServicesReceiver", "rejectButton is " + string);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            MsgText msgText = new MsgText();
            msgText.setTextType(i);
            msgText.setTextContent(string);
            arrayList.add(msgText);
        }
    }

    private void c(Bundle bundle, ArrayList<MsgText> arrayList) {
        int i;
        try {
            i = bundle.getInt("sub_text_type");
        } catch (Exception unused) {
            LogUtil.e("IntegratedServicesReceiver", "getSubTextInfo, numberType error");
            i = 0;
        }
        if (i == 9 && ncp.k()) {
            String string = bundle.getString("sub_text", null);
            LogUtil.a("IntegratedServicesReceiver", "subText is " + string);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            MsgText msgText = new MsgText();
            msgText.setTextType(i);
            msgText.setTextContent(string);
            arrayList.add(msgText);
        }
    }

    private void a(Bundle bundle, ArrayList<MsgText> arrayList) {
        int i;
        try {
            i = bundle.getInt("big_text_type");
        } catch (Exception unused) {
            LogUtil.e("IntegratedServicesReceiver", "getBigTextInfo, numberType error");
            i = 0;
        }
        if (i == 10 && ncp.k()) {
            String string = bundle.getString("big_text", null);
            LogUtil.a("IntegratedServicesReceiver", "bigText is " + string);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            MsgText msgText = new MsgText();
            msgText.setTextType(i);
            msgText.setTextContent(string);
            arrayList.add(msgText);
        }
    }

    private MsgText a(Bundle bundle) {
        int i;
        String string;
        MsgText msgText = new MsgText();
        try {
            i = bundle.getInt("title_type");
        } catch (Exception unused) {
            LogUtil.e("IntegratedServicesReceiver", "messageTextType error");
            i = 0;
        }
        msgText.setTextType(i);
        try {
            string = bundle.getString("title");
        } catch (Exception unused2) {
            LogUtil.e("IntegratedServicesReceiver", "messageTextContent error");
            string = "";
        }
        msgText.setTextContent(string);
        return msgText;
    }

    private MsgText e(Bundle bundle) {
        int i;
        String string;
        MsgText msgText = new MsgText();
        try {
            i = bundle.getInt("text_type");
        } catch (Exception unused) {
            LogUtil.e("IntegratedServicesReceiver", "messageTextType error");
            i = 0;
        }
        msgText.setTextType(i);
        try {
            string = bundle.getString("text");
        } catch (Exception unused2) {
            LogUtil.e("IntegratedServicesReceiver", "textContent error");
            string = "";
        }
        msgText.setTextContent(string);
        return msgText;
    }

    private boolean d(Context context, MsgText msgText, MsgText msgText2) {
        List<String> listE = e(context);
        String str = listE.get(0);
        String str2 = listE.get(1);
        if (!CommonUtil.bg()) {
            LogUtil.a("IntegratedServicesReceiver", "dealMissedCallNameNumber is not emui");
            if (!TextUtils.isEmpty(str)) {
                msgText.setTextContent(str);
            } else if (TextUtils.isEmpty(msgText.getTextContent())) {
                msgText.setTextContent(ncp.b(str2));
            } else {
                LogUtil.j("IntegratedServicesReceiver", "dealMissedCallNameNumber nameContent is empty and title not is empty");
            }
        }
        LogUtil.a("IntegratedServicesReceiver", "dealMissedCallNameNumber numberContent: ", ncp.e(str2), " nameContent: ", str);
        if (TextUtils.isEmpty(str2)) {
            ReleaseLogUtil.e("R_IntegratedServicesReceiver", "isHandleMissedCallNameNumber numberContent is empty.");
            return false;
        }
        msgText2.setTextContent(str2);
        return true;
    }

    private List<String> e(Context context) {
        String string;
        ArrayList arrayList = new ArrayList(16);
        String string2 = null;
        try {
            Cursor cursorQuery = context.getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[]{"name", "number", "type", "new", "date"}, "type=?", new String[]{Integer.toString(3)}, "date DESC");
            if (cursorQuery == null) {
                string = "";
            } else {
                if (!cursorQuery.moveToFirst() || cursorQuery.getInt(cursorQuery.getColumnIndex("new")) != 1) {
                    string = "";
                } else {
                    string = cursorQuery.getString(cursorQuery.getColumnIndex("number"));
                    try {
                        string2 = cursorQuery.getString(cursorQuery.getColumnIndex("name"));
                    } catch (SQLException unused) {
                        LogUtil.e("IntegratedServicesReceiver", "getMissedCallNumber SQLException");
                    } catch (SecurityException unused2) {
                        LogUtil.e("IntegratedServicesReceiver", "getMissedCallNumber SecurityException");
                    }
                }
                cursorQuery.close();
            }
        } catch (SQLException unused3) {
            string = "";
        } catch (SecurityException unused4) {
            string = "";
        }
        arrayList.add(string2);
        arrayList.add(string != null ? string : "");
        return arrayList;
    }

    private void b(Intent intent) {
        int intExtra;
        boolean booleanExtra = false;
        try {
            intExtra = intent.getIntExtra("type", 0);
            try {
                booleanExtra = intent.getBooleanExtra("data_extra_remove_call", false);
            } catch (Exception unused) {
                LogUtil.e("IntegratedServicesReceiver", "deleteMessageToDevice error");
            }
        } catch (Exception unused2) {
            intExtra = 0;
        }
        if (booleanExtra && !ncp.q()) {
            LogUtil.j("IntegratedServicesReceiver", "deleteMessageToDevice wechat remove calls in old device return");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        if (intExtra == 128) {
            arrayList.add(7);
            arrayList.add(8);
        } else {
            arrayList.add(Integer.valueOf(intExtra));
        }
        String string = intent.getExtras().getString("data_category");
        if (!ncp.t() && !ncp.c() && (!ncp.p() || !NotificationCompat.CATEGORY_CALL.equals(string))) {
            LogUtil.a("IntegratedServicesReceiver", "deleteMessageToDevice isSupportRepeatedNotifyProcess false");
            if (intExtra == 127) {
                LogUtil.a("IntegratedServicesReceiver", "deleteMessageToDevice msgType is DEFAULT_TYPE");
                return;
            }
        }
        c(arrayList, intent);
    }

    private void c(List<Integer> list, Intent intent) {
        if (list == null) {
            LogUtil.j("IntegratedServicesReceiver", "deleteMessageByType is null");
            return;
        }
        for (Integer num : list) {
            LogUtil.a("IntegratedServicesReceiver", "deleteMessageToDevice: msgType: ", num);
            ncl.d(this.d).b(ncl.d(this.d).c(intent.getExtras(), ncl.d(this.d).e(num.intValue())), 2);
        }
    }

    private void e(Intent intent) {
        boolean booleanExtra = true;
        try {
            booleanExtra = intent.getBooleanExtra("com.huawei.health.ACTION_WEATHER_PUSH_VALUE", true);
        } catch (Exception unused) {
            LogUtil.e("IntegratedServicesReceiver", "pushWeatherToDevice error");
        }
        LogUtil.a("IntegratedServicesReceiver", "pushWeatherToDevice value: ", Boolean.valueOf(booleanExtra));
        nei.c().b(booleanExtra);
    }

    private void d(Intent intent) {
        if (intent == null) {
            LogUtil.j("IntegratedServicesReceiver", "pushNotificationEnableToDevice() intent is null");
            return;
        }
        String stringExtra = intent.getStringExtra("notificationEnablePushType");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        if ("notificationEnablePushMainSwitch".equals(stringExtra)) {
            if (e()) {
                c();
            }
            boolean booleanExtra = intent.getBooleanExtra("notificationEnableStatus", false);
            LogUtil.a("IntegratedServicesReceiver", "pushNotificationEnableToDevice, status is ", Boolean.valueOf(booleanExtra));
            ncl.d(this.d).b(mir.a(booleanExtra, "IntegratedServicesReceiver"), 2);
            boolean booleanExtra2 = intent.getBooleanExtra("notificationEnableTurnOnSwitch", false);
            LogUtil.a("IntegratedServicesReceiver", "pushNotificationEnableToDevice isTurnOnSwitch: ", Boolean.valueOf(booleanExtra2));
            if (booleanExtra2) {
                nca.c().d(2);
                return;
            }
            return;
        }
        if ("notificationEnablePushSubSwitch".equals(stringExtra)) {
            nca.c().d(1);
        }
    }

    private void c() {
        Intent intent = new Intent();
        intent.setAction("com.huawei.health.action.ACTION_NOTIFICATION_PUSH");
        intent.putExtra("action_type", "CONTENT_MAIN_SWITCH_CHANGE");
        BroadcastManagerUtil.e(BaseApplication.getContext(), intent);
        LogUtil.a("IntegratedServicesReceiver", "contentMainSwitchChange sendBroadcastPackage finished!");
    }

    private boolean e() {
        String str;
        return HarmonyBuild.e && (str = HarmonyBuild.f36561a) != null && !str.isEmpty() && str.charAt(0) >= '4' && str.charAt(0) <= '9';
    }
}
