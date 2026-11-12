package com.huawei.pluginhealthzone.interactors;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.huawei.android.airsharing.api.IEventListener;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.IpushBase;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.notification.NotificationDeviceLinkage;
import com.huawei.pluginhealthzone.activity.FamilyHealthTempActivity;
import com.huawei.pluginhealthzone.cloud.CloudApi;
import com.huawei.pluginhealthzone.cloud.HttpDataCallback;
import com.huawei.pluginhealthzone.devicelink.callback.DeviceDataListener;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import com.huawei.pluginhealthzone.jsmodule.callback.PushMessageListener;
import com.huawei.ui.commonui.R;
import com.huawei.utils.FoundationCommonUtil;
import com.huawei.watchface.mvp.model.webview.JsNetwork;
import defpackage.lsb;
import defpackage.mgg;
import defpackage.ogd;
import defpackage.pfs;
import defpackage.pfu;
import defpackage.pfw;
import defpackage.pfx;
import defpackage.pfy;
import defpackage.pgd;
import defpackage.pgg;
import defpackage.pgp;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class HealthZonePushReceiver implements IpushBase {
    public static final String BLOOD_OXYGEN_NOTIFY = "23";
    public static final String BLOOD_PRESSURE_NOTIFY = "24";
    public static final String BLOOD_SUGAR_DAWN_NOTIFY = "27";
    public static final String BODY_TEMPERATURE_HIGH_NOTIFY = "34";
    public static final String BODY_TEMPERATURE_LOW_NOTIFY = "35";
    public static final String COMMENT_FAILED_NOTIFY = "38";
    private static final int COMMENT_NOTIFICATION_ID_START = 20210615;
    public static final String CYCLE_BLOOD_OXYGEN_NOTIFY = "33";
    public static final String DATA_POST_COMMENTS_NOTIFY = "36";
    public static final String DEAUTH_EVENT_NOTIFY = "20";
    public static final String DETAIL_TYPE = "detailType";
    public static final String ECG_MEASUREMENT_ABNORMAL = "43";
    public static final String ECG_REMINDER_NOTIFY = "39";
    public static final String FALL_LOCATION_NOTIFY = "42";
    public static final String FAMILY_CARE_NOTIFY = "40";
    public static final String FOLLOW_ACCEPT_NOTIFY = "17";
    private static final int FOLLOW_NOTIFICATION_ID_START = 20000000;
    public static final String FOLLOW_REJECT_NOTIFY = "18";
    public static final String FOLLOW_REQUEST_NOTIFY = "16";
    public static final String FROM = "from";
    private static final String HEALTHZONE_DEEPLINK = "huaweischeme://healthapp/router/familyhealth?healthType=10";
    private static final String HEALTHZONE_URI = "messagecenter://healthZone?skipType=1&destination=com.huawei.pluginhealthzone.activity.FamilyHealthTempActivity";
    private static final int HEALTH_NOTIFICATION_ID_END = 20200213;
    private static final int HEALTH_NOTIFICATION_ID_START = 20200204;
    public static final String HIGH_HEART_RATE_NOTIFY = "21";
    private static final int HUID_INTERCEPTION_EIGHT_LENGTH = 8;
    private static final String HWSCHEMEBASICHEALTH_ACTIVITY_NAME = "com.huawei.health.browseraction.HwSchemeBasicHealthActivity";
    public static final String IS_HASH_HUID = "isHashHuid";
    private static final int LOCATION_NOTIFICATION_ID_PERMISSIONS = 20210510;
    private static final int LOCATION_NOTIFICATION_ID_START = 20210511;
    public static final String LOCATION_UPLOAD = "5001";
    public static final String LOW_HEART_RATE_NOTIFY = "22";
    public static final String MEMBER_HUID = "memberhuid";
    private static final String NUM_ONE = "1";
    private static final String PING_ACTIVITY = "1";
    private static final String PING_HEALTH_APP = "0";
    public static final String POSTPRANDIAL_BLOOD_GLUCOSE_NOTIFY = "26";
    public static final String PREPRANDIAL_BLOOD_GLUCOSE_NOTIFY = "25";
    public static final String PRESSURE_NOTIFY = "32";
    public static final String PROACTIVE_SHARING_NOTIFY = "37";
    private static final String PUSH_KEY_SPLIT = "-";
    public static final String PUSH_TYPE = "pushType";
    private static final String RESULT_CODE = "resultCode";
    public static final String SLEEP_SCORE_NOTIFY = "30";
    public static final String SLEEP_TIME_NOTIFY = "29";
    public static final String SOS_LOCATION_NOTIFY = "41";
    public static final String STEP_NOTIFY = "28";
    private static final int SUCCESS = 0;
    private static final String TAG = "HealthZonePushReceiver";
    private static final int TO_DETAIL = 2;
    private static final int TO_H5 = 0;
    private static final int TO_SET = 1;
    public static final String UNFOLLOW_EVENT_NOTIFY = "19";
    private static int sCommentNotificationId = 20210615;
    private static int sFollowNotificationId = 20000000;
    private static int sHealthNotificationId = 20200204;
    private static int sLocationNotificationId = 20210511;
    private static PushMessageListener sPushMessageListener;
    private boolean mIsFirstGenerateMsg = false;
    private static final Object LOCK = new Object();
    private static final List<String> PROACTIVE_NOTIFICATION_PUSH_LIST = new ArrayList<String>() { // from class: com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver.3
        {
            add(HealthZonePushReceiver.PROACTIVE_SHARING_NOTIFY);
            add(HealthZonePushReceiver.COMMENT_FAILED_NOTIFY);
            add("39");
            add(HealthZonePushReceiver.ECG_MEASUREMENT_ABNORMAL);
            add(HealthZonePushReceiver.FAMILY_CARE_NOTIFY);
            add(HealthZonePushReceiver.SOS_LOCATION_NOTIFY);
            add("42");
        }
    };
    private static HashMap<Long, b> sLocationPushInfoMap = new HashMap<>(16);
    private static HashMap<String, Long> sNotifyMap = new HashMap<>(16);
    private static long NOTIFY_INTERVAL = 600000;

    @Override // com.huawei.health.messagecenter.model.IpushBase
    public List<String> getPushType() {
        ArrayList arrayList = new ArrayList(Arrays.asList(LOCATION_UPLOAD, "5002"));
        for (int i = 16; i <= 30; i++) {
            arrayList.add(String.valueOf(i));
        }
        return arrayList;
    }

    @Override // com.huawei.health.messagecenter.model.IpushBase
    public void processPushMsg(Context context, String str) {
        LogUtil.a(TAG, "processPushMsg enter:", str);
        if (str == null || TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "processPushMsg msg is null or empty");
            return;
        }
        try {
            Gson gson = new Gson();
            c cVar = (c) gson.fromJson(str, c.class);
            String strA = cVar.a();
            if (strA == null) {
                LogUtil.j(TAG, "processPushMsg pushType is null");
                return;
            }
            Notification.Builder builderC = lsb.d().c();
            if ("com.huawei.bone".equals(BaseApplication.getAppPackage())) {
                builderC.setSmallIcon(R.drawable.ic_wear_notification);
            } else {
                builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
            }
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setPackage(BaseApplication.getAppPackage());
            if (isFollowNotification(strA)) {
                pushListenerCallback(strA, HiJsonUtil.d(cVar));
                setFollowNotification(context, cVar, (c.a) gson.fromJson(CommonUtil.ac(cVar.d()), c.a.class), builderC, intent);
            } else if (isAboutLocation(strA)) {
                getPositionPushInfo(context, cVar, builderC, intent);
            } else {
                setHealthNotification(context, cVar, builderC, intent);
            }
        } catch (JsonSyntaxException e) {
            LogUtil.e(TAG, "processPushMsg exception", LogAnonymous.b(e));
        }
    }

    private void pushListenerCallback(String str, String str2) {
        if (sPushMessageListener != null) {
            LogUtil.a(TAG, "sPushMessageListener != null");
            sPushMessageListener.onChange(str, str2);
        }
    }

    private boolean isAboutLocation(String str) {
        return LOCATION_UPLOAD.equals(str);
    }

    private void getPositionPushInfo(final Context context, c cVar, final Notification.Builder builder, final Intent intent) {
        LogUtil.a(TAG, "getPositionPushInfo enter");
        try {
            pfs.e().getPositionPushInfo(cVar.d(), 1, new HttpDataCallback() { // from class: com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver.1
                @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
                public void onFailure(int i, String str) {
                    LogUtil.e(HealthZonePushReceiver.TAG, "getPositionPushInfo onFailure errorCode:", Integer.valueOf(i));
                }

                @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
                public void onSuccess(JSONObject jSONObject) {
                    try {
                        if (jSONObject.has("resultCode") && jSONObject.getInt("resultCode") == 0) {
                            HealthZonePushReceiver.this.setAboutLocation(context, jSONObject, builder, intent);
                        }
                    } catch (JSONException e) {
                        LogUtil.e(HealthZonePushReceiver.TAG, "getPositionPushInfo onSuccess:", LogAnonymous.b(e));
                    }
                }
            });
        } catch (NumberFormatException e) {
            LogUtil.e(TAG, "getPositionPushInfo:", LogAnonymous.b(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAboutLocation(Context context, JSONObject jSONObject, Notification.Builder builder, Intent intent) {
        LogUtil.a(TAG, "setAboutLocation = ", jSONObject.toString());
        try {
            b bVar = jSONObject.has("pushInfo") ? (b) HiJsonUtil.d(jSONObject.getJSONObject("pushInfo").toString(), b.class) : null;
            if (bVar == null) {
                return;
            }
            packageLocationInformation(context, bVar, builder, intent);
        } catch (JSONException e) {
            LogUtil.e(TAG, "jsonException =", LogAnonymous.b(e));
        }
    }

    private void startPosition(Context context, b bVar, Notification.Builder builder, Intent intent) {
        if (bVar == null) {
            LogUtil.j(TAG, "pushInfo is null.");
            return;
        }
        int iIntValue = bVar.c().intValue();
        if (bVar.c().intValue() == 1) {
            LogUtil.a(TAG, "HuId = ", bVar.a(), "Info = ", HiJsonUtil.d(bVar));
            sLocationPushInfoMap.put(bVar.a(), bVar);
        }
        if (sLocationPushInfoMap.get(bVar.a()) != null) {
            bVar = sLocationPushInfoMap.get(bVar.a());
        }
        if (bVar != null) {
            bVar.c(iIntValue);
        }
        if (getLocationPermission(context, builder, intent, bVar)) {
            getCommonUsedDevices(context, builder, intent, bVar);
        }
    }

    private void packageLocationInformation(Context context, b bVar, Notification.Builder builder, Intent intent) {
        int i;
        LogUtil.a(TAG, "HiJsonUtil.toJson(pushInfo) = ", HiJsonUtil.d(bVar));
        sendMsgToDevice(bVar, false);
        switch (bVar.g().intValue()) {
            case 1:
                startPosition(context, bVar, builder, intent);
                return;
            case 2:
                pgg.d().a();
                getCommonUsedDevices(context, builder, intent, bVar);
                return;
            case 3:
                String string = context.getString(com.huawei.pluginhealthzone.R.string.IDS_acquisition_location, setUserNickName(bVar));
                intent.putExtra("pushType", String.valueOf(bVar.g()));
                intent.putExtra(MEMBER_HUID, String.valueOf(bVar.a()));
                intent.setAction("health_zone_go_h5");
                goSettingLocation(context, builder, intent, string, 0);
                return;
            case 4:
                i = com.huawei.pluginhealthzone.R.string.IDS_open_permission;
                break;
            case 5:
                i = com.huawei.pluginhealthzone.R.string.IDS_request_failed;
                break;
            case 6:
                i = com.huawei.pluginhealthzone.R.string.IDS_stop_development;
                break;
            default:
                LogUtil.j(TAG, "packageLocationInformation pushType : ", bVar.g());
                return;
        }
        setLocationNotification(context, builder, intent, bVar, i);
    }

    private void getCommonUsedDevices(final Context context, final Notification.Builder builder, final Intent intent, final b bVar) {
        LogUtil.a(TAG, "getCommonUsedDevices enter");
        pfs.e().getCommonUsedDevices("FAMILY_SPACE", new HttpDataCallback() { // from class: com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver.2
            @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
            public void onFailure(int i, String str) {
                int i2;
                LogUtil.e(HealthZonePushReceiver.TAG, "getCommonUsedDevices onFailure errorCode:", Integer.valueOf(i));
                if (bVar.g().intValue() == 1) {
                    i2 = com.huawei.pluginhealthzone.R.string.IDS_other_equipment;
                } else {
                    i2 = com.huawei.pluginhealthzone.R.string.IDS_stop_other_equipment;
                }
                HealthZonePushReceiver.this.setLocationNotification(context, builder, intent, bVar, i2);
            }

            @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
            public void onSuccess(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return;
                }
                LogUtil.a(HealthZonePushReceiver.TAG, "getCommonUsedDevices data =", jSONObject.toString());
                HealthZonePushReceiver.this.settingTheMessage(context, builder, intent, bVar, jSONObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void settingTheMessage(Context context, Notification.Builder builder, Intent intent, b bVar, JSONObject jSONObject) {
        int i;
        boolean zIsWatchOnCommonList = isWatchOnCommonList(jSONObject);
        if (bVar.g().intValue() == 1) {
            if (jSONObject.toString().contains(FoundationCommonUtil.getAndroidId(context))) {
                i = com.huawei.pluginhealthzone.R.string.IDS_familymember_viewing_your_location;
            } else {
                i = com.huawei.pluginhealthzone.R.string.IDS_other_equipment;
            }
            uploadLocation(context, zIsWatchOnCommonList);
            handleGenerateMsg(context, bVar, context.getString(com.huawei.pluginhealthzone.R.string.IDS_hw_familymember_viewing_your_location, setUserNickName(bVar)), 1);
        } else {
            if (jSONObject.toString().contains(FoundationCommonUtil.getAndroidId(context))) {
                i = com.huawei.pluginhealthzone.R.string.IDS_familymember_finished_viewing_your_location;
            } else {
                i = com.huawei.pluginhealthzone.R.string.IDS_stop_other_equipment;
            }
            handleGenerateMsg(context, bVar, context.getString(com.huawei.pluginhealthzone.R.string.IDS_hw_familymember_finished_viewing_your_location, setUserNickName(bVar)), bVar.g().intValue());
        }
        int i2 = i;
        sendMsgToDevice(bVar, zIsWatchOnCommonList);
        if (bVar.g().intValue() == 1 && bVar.c().intValue() == 0) {
            LogUtil.a(TAG, "start position is not isStart begin");
        } else {
            setLocationNotification(context, builder, intent, bVar, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isWatchOnCommonList(JSONObject jSONObject) {
        DeviceInfo deviceInfoC = mgg.c(TAG);
        LogUtil.a(TAG, "currentDeviceInfo:", deviceInfoC);
        String str = null;
        String securityUuid = (deviceInfoC == null || deviceInfoC.getDeviceConnectState() != 2) ? null : deviceInfoC.getSecurityUuid();
        if (securityUuid != null) {
            str = securityUuid + "#ANDROID21";
        }
        if (securityUuid != null) {
            return jSONObject.toString().contains(securityUuid) || jSONObject.toString().contains(str);
        }
        return false;
    }

    private void handleGenerateMsg(Context context, b bVar, String str, int i) {
        if (i == 1) {
            if (this.mIsFirstGenerateMsg) {
                return;
            }
            this.mIsFirstGenerateMsg = true;
            generateMessage(context, bVar, str);
            return;
        }
        if (this.mIsFirstGenerateMsg) {
            this.mIsFirstGenerateMsg = false;
            generateMessage(context, bVar, str);
        }
    }

    private void generateMessage(final Context context, final b bVar, final String str) {
        LogUtil.a(TAG, "enter generateViewLocationMsg");
        final MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        messageCenterApi.getMessageId(String.valueOf(19), MessageConstant.VIEWING_OR_ENDED_LOCATION_MSG, new IBaseResponseCallback() { // from class: pge
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                HealthZonePushReceiver.lambda$generateMessage$0(str, context, bVar, messageCenterApi, i, obj);
            }
        });
    }

    public static /* synthetic */ void lambda$generateMessage$0(String str, Context context, b bVar, MessageCenterApi messageCenterApi, int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            MessageObject messageObject = new MessageObject();
            messageObject.setMsgId((String) obj);
            messageObject.setModule(String.valueOf(19));
            messageObject.setType(MessageConstant.VIEWING_OR_ENDED_LOCATION_MSG);
            messageObject.setPosition(1);
            messageObject.setMsgPosition(11);
            messageObject.setReadFlag(0);
            messageObject.setMsgContent(str);
            messageObject.setMsgTitle(context.getResources().getString(com.huawei.pluginhealthzone.R.string.IDS_hwh_family_health_zone));
            messageObject.setDetailUri("messagecenter://healthZone?skipType=1&destination=com.huawei.pluginhealthzone.activity.FamilyHealthTempActivity&pushType=4&memberhuid=" + bVar.a());
            messageObject.setCreateTime(System.currentTimeMillis());
            if (LoginInit.getInstance(BaseApplication.getContext()) != null) {
                messageObject.setHuid(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
            }
            messageCenterApi.insertMessage(messageObject);
        }
    }

    private boolean getLocationPermission(Context context, Notification.Builder builder, Intent intent, b bVar) {
        if (isGpsEnable()) {
            if (context.getApplicationContext().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || context.getApplicationContext().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
                return true;
            }
            intent.putExtra("pushType", String.valueOf(bVar.g()));
            intent.putExtra(MEMBER_HUID, String.valueOf(bVar.a()));
            intent.setAction("health_zone_go_details_setting");
            goSettingLocation(context, builder, intent, context.getResources().getString(com.huawei.pluginhealthzone.R.string.IDS_always_allow, setUserNickName(bVar)), 2);
            return false;
        }
        String string = context.getResources().getString(com.huawei.pluginhealthzone.R.string.IDS_health_location, setUserNickName(bVar));
        intent.putExtra("pushType", String.valueOf(bVar.g()));
        intent.putExtra(MEMBER_HUID, String.valueOf(bVar.a()));
        intent.setAction("health_zone_location_source_setting");
        goSettingLocation(context, builder, intent, string, 1);
        return false;
    }

    private String setUserNickName(b bVar) {
        if (!TextUtils.isEmpty(bVar.f())) {
            return bVar.f();
        }
        if (!TextUtils.isEmpty(bVar.j())) {
            return CommonUtil.o(bVar.j());
        }
        if (!TextUtils.isEmpty(bVar.d())) {
            return bVar.d();
        }
        return "";
    }

    private void goSettingLocation(Context context, Notification.Builder builder, Intent intent, String str, int i) {
        LogUtil.a(TAG, "goSettingLocation enter");
        setNotificationBuilder(context, builder, str);
        intent.setClassName(BaseApplication.getAppPackage(), HWSCHEMEBASICHEALTH_ACTIVITY_NAME);
        intent.putExtra("healthZoneNotification", 1);
        setBuilderAction(context, getPendingIntent(context, i, intent), builder);
        intent.setAction("health_zone_push_cancel");
        builder.addAction(new Notification.Action.Builder((Icon) null, context.getResources().getString(com.huawei.pluginhealthzone.R.string.IDS_plugin_healthZone_refuse), PendingIntent.getActivity(context, 0, intent, 201326592)).build());
        builder.setAutoCancel(true);
        builder.setCategory("HwFamily01");
        lsb.d().c(LOCATION_NOTIFICATION_ID_PERMISSIONS, builder.build());
    }

    private PendingIntent getPendingIntent(Context context, int i, Intent intent) {
        if (i == 0) {
            return PendingIntent.getActivity(context, 0, intent, 201326592);
        }
        return PendingIntent.getActivity(context, 0, intent, 201326592);
    }

    private void setNotificationBuilder(Context context, Notification.Builder builder, String str) {
        builder.setContentTitle(context.getResources().getString(R.string.IDS_hwh_family_health_zone)).setContentText(str).setStyle(new Notification.BigTextStyle().bigText(str));
    }

    private void setBuilderAction(Context context, PendingIntent pendingIntent, Notification.Builder builder) {
        builder.addAction(new Notification.Action.Builder((Icon) null, context.getResources().getString(com.huawei.pluginhealthzone.R.string.IDS_hw_health_user_profile_go_setting), pendingIntent).build());
        builder.setContentIntent(pendingIntent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationNotification(Context context, Notification.Builder builder, Intent intent, b bVar, int i) {
        pushListenerCallback(String.valueOf(bVar.g()), HiJsonUtil.d(bVar));
        intent.putExtra("pushType", String.valueOf(bVar.g()));
        intent.putExtra(MEMBER_HUID, String.valueOf(bVar.a()));
        intent.setClass(context, FamilyHealthTempActivity.class);
        setNotificationBuilder(context, builder, context.getString(i, setUserNickName(bVar)));
        intent.setFlags(335544320);
        builder.setAutoCancel(true).setContentIntent(PendingIntent.getActivity(context, sLocationNotificationId, intent, 201326592));
        builder.setCategory("HwFamily01");
        lsb.d().c(sLocationNotificationId, builder.build());
    }

    private void sendMsgToDevice(b bVar, boolean z) {
        int i;
        Integer numG = bVar.g();
        numG.intValue();
        LogUtil.a(TAG, "pushInfo getPushSubType() = ", numG);
        pfw pfwVar = new pfw();
        int iIntValue = bVar.g().intValue();
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                if (iIntValue != 3) {
                    if (iIntValue == 7) {
                        pfwVar.g("1");
                    } else if (iIntValue == 8) {
                        pfwVar.g("0");
                    } else if (iIntValue == 9) {
                        this.mIsFirstGenerateMsg = false;
                        i = 3003;
                    } else {
                        LogUtil.j(TAG, "sendMsgToDevice pushType : ", bVar.g());
                        return;
                    }
                    i = 3002;
                } else {
                    i = 3001;
                }
            } else if (!z) {
                return;
            } else {
                i = IEventListener.EVENT_ID_DEVICE_DISCONN_SUCC;
            }
        } else {
            if (!z) {
                return;
            }
            pfwVar.b(String.valueOf(isGpsEnable()));
            i = 3004;
        }
        if (bVar.g().intValue() == 7 || bVar.g().intValue() == 9) {
            judgeCommonUsedDevices(pfwVar, bVar, i);
        } else {
            sendMsgBodyToDevice(pfwVar, bVar, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendMsgBodyToDevice(pfw pfwVar, b bVar, int i) {
        pfw commonParameter = setCommonParameter(pfwVar, bVar, i);
        pfx pfxVar = new pfx();
        pfxVar.e(commonParameter);
        LogUtil.a(TAG, "sendMsgToDevice ResponseMsgBody = ", HiJsonUtil.d(pfxVar));
        pfu.b().activeSendMsgToDevice(0, pfxVar, new DeviceDataListener() { // from class: pfz
            @Override // com.huawei.pluginhealthzone.devicelink.callback.DeviceDataListener
            public final void onResult(int i2, pfx pfxVar2) {
                LogUtil.a(HealthZonePushReceiver.TAG, "sendMsgToDevice resultCode = ", Integer.valueOf(i2), "ResponseMsgBody = ", HiJsonUtil.d(pfxVar2));
            }
        });
    }

    private void judgeCommonUsedDevices(final pfw pfwVar, final b bVar, final int i) {
        pfs.e().getCommonUsedDevices("FAMILY_SPACE", new HttpDataCallback() { // from class: com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver.5
            @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
            public void onFailure(int i2, String str) {
                LogUtil.e(HealthZonePushReceiver.TAG, "judgeCommonUsedDevices, onFailure errorCode: ", Integer.valueOf(i2), ", errorInfo: ", str);
            }

            @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
            public void onSuccess(JSONObject jSONObject) {
                LogUtil.a(HealthZonePushReceiver.TAG, "judgeCommonUsedDevices, onSuccess");
                if (jSONObject != null) {
                    if (HealthZonePushReceiver.this.isWatchOnCommonList(jSONObject)) {
                        HealthZonePushReceiver.this.sendMsgBodyToDevice(pfwVar, bVar, i);
                        return;
                    }
                    return;
                }
                LogUtil.j(HealthZonePushReceiver.TAG, "judgeCommonUsedDevices, data is null");
            }
        });
    }

    private pfw setCommonParameter(pfw pfwVar, b bVar, int i) {
        pfwVar.b(i);
        pfwVar.b(bVar.a().longValue());
        pfwVar.a(bVar.f());
        pfwVar.e(bVar.e());
        pfwVar.d(bVar.d());
        pfwVar.c(bVar.j());
        pfwVar.i(bVar.i());
        pfwVar.c(bVar.b());
        return pfwVar;
    }

    private boolean isGpsEnable() {
        LocationManager locationManagerO = CommonUtils.o();
        return locationManagerO != null && locationManagerO.isProviderEnabled(GeocodeSearch.GPS);
    }

    private void uploadLocation(final Context context, final boolean z) {
        if (isGpsEnable()) {
            pgg.d().b(new LocationMgrCallback() { // from class: pgb
                @Override // com.huawei.pluginhealthzone.interactors.LocationMgrCallback
                public final void onLocationChanged(pgp pgpVar) {
                    this.e.m1654x529f3a1f(context, z, pgpVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$uploadLocation$2$com-huawei-pluginhealthzone-interactors-HealthZonePushReceiver, reason: not valid java name */
    public /* synthetic */ void m1654x529f3a1f(Context context, boolean z, pgp pgpVar) {
        DeviceInfo deviceInfoC;
        pgpVar.e(1);
        pgpVar.d(Long.valueOf(System.currentTimeMillis()));
        String androidId = FoundationCommonUtil.getAndroidId(context);
        CloudApi cloudApiE = pfs.e();
        cloudApiE.uploadPosition(androidId, pgpVar, 0, new HttpDataCallback() { // from class: com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver.4
            @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
            public void onFailure(int i, String str) {
                LogUtil.j(HealthZonePushReceiver.TAG, "onFailure(phone), errorCode:", Integer.valueOf(i), "errorInfo:", str);
            }

            @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
            public void onSuccess(JSONObject jSONObject) {
                LogUtil.a(HealthZonePushReceiver.TAG, "uploadPosition onSuccess: phone");
            }
        });
        if (z && (deviceInfoC = mgg.c(TAG)) != null && deviceInfoC.getDeviceConnectState() == 2) {
            String str = deviceInfoC.getSecurityUuid() + "#ANDROID21";
            LogUtil.a(TAG, "deviceUuid = ", str);
            cloudApiE.uploadPosition(str, pgpVar, 0, new HttpDataCallback() { // from class: com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver.8
                @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
                public void onFailure(int i, String str2) {
                    LogUtil.j(HealthZonePushReceiver.TAG, "onFailure(watch), errorCode:", Integer.valueOf(i), "errorInfo:", str2);
                }

                @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
                public void onSuccess(JSONObject jSONObject) {
                    LogUtil.a(HealthZonePushReceiver.TAG, "uploadPosition onSuccess: watch");
                }
            });
        }
    }

    private boolean isFollowNotification(String str) {
        return new ArrayList(Arrays.asList("16", "17", "18", "19", DEAUTH_EVENT_NOTIFY)).contains(str);
    }

    private void setFollowNotification(Context context, c cVar, c.a aVar, Notification.Builder builder, Intent intent) {
        if (!isSetNotifyContent(context, cVar, aVar, builder, intent)) {
            LogUtil.j(TAG, "Invalid notify");
            return;
        }
        intent.setFlags(335544320);
        builder.setAutoCancel(true).setContentIntent(PendingIntent.getActivity(context, sFollowNotificationId, intent, 201326592));
        synchronized (LOCK) {
            lsb.d().c(sFollowNotificationId, builder.build());
            sFollowNotificationId++;
        }
    }

    private boolean setFollowRequestNotifyContent(Context context, c.a aVar, Notification.Builder builder, Intent intent, String str) {
        String string;
        builder.setContentTitle(context.getResources().getString(R.string.IDS_hwh_family_health_zone));
        if (aVar.b().equals("1")) {
            string = context.getResources().getString(com.huawei.pluginhealthzone.R.string.IDS_open_data, str);
        } else {
            string = context.getResources().getString(com.huawei.pluginhealthzone.R.string.IDS_follow_request, str);
        }
        builder.setContentText(string);
        intent.setClass(context, FamilyHealthTempActivity.class);
        return true;
    }

    private boolean setFollowAcceptNotifyContent(Context context, c.a aVar, Notification.Builder builder, Intent intent, String str) {
        String string;
        builder.setContentTitle(context.getResources().getString(R.string.IDS_hwh_family_health_zone));
        if (aVar.b().equals("1")) {
            string = context.getResources().getString(com.huawei.pluginhealthzone.R.string.IDS_share_data, str);
        } else {
            string = context.getResources().getString(com.huawei.pluginhealthzone.R.string.IDS_follow_accept, str);
        }
        builder.setContentText(string);
        intent.setClass(context, FamilyHealthTempActivity.class);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 int, still in use, count: 1, list:
      (r0v2 int) from 0x0023: IF  (r0v2 int) != (1598 int)  -> B:4:0x0025 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    private boolean isSetNotifyContent(Context context, c cVar, c.a aVar, Notification.Builder builder, Intent intent) {
        byte b2;
        String strO = CommonUtil.o(aVar.c());
        intent.putExtra("pushType", cVar.a());
        String strA = cVar.a();
        strA.hashCode();
        if (strA.hashCode() != 1598) {
            switch (strA) {
                case "16":
                    b2 = 0;
                    break;
                case "17":
                    b2 = 1;
                    break;
                case "18":
                    b2 = 2;
                    break;
                case "19":
                    b2 = 3;
                    break;
                default:
                    b2 = -1;
                    break;
            }
        } else if (strA.equals(DEAUTH_EVENT_NOTIFY)) {
            b2 = 4;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return setFollowRequestNotifyContent(context, aVar, builder, intent, strO);
        }
        if (b2 == 1) {
            return setFollowAcceptNotifyContent(context, aVar, builder, intent, strO);
        }
        if (b2 == 2) {
            builder.setContentTitle(context.getResources().getString(R.string.IDS_hwh_family_health_zone));
            builder.setContentText(context.getResources().getString(com.huawei.pluginhealthzone.R.string.IDS_follow_reject, strO));
            intent.setClass(context, FamilyHealthTempActivity.class);
            return true;
        }
        if (b2 == 3) {
            builder.setContentTitle(context.getResources().getString(R.string.IDS_hwh_family_health_zone));
            builder.setContentText(context.getResources().getString(com.huawei.pluginhealthzone.R.string.IDS_hwh_family_health_notification_unfollow, strO));
            intent.setClass(context, FamilyHealthTempActivity.class);
            return true;
        }
        if (b2 == 4) {
            builder.setContentTitle(context.getResources().getString(R.string.IDS_hwh_family_health_zone));
            builder.setContentText(context.getResources().getString(com.huawei.pluginhealthzone.R.string.IDS_hwh_family_health_notification_deauth, strO));
            intent.setClass(context, FamilyHealthTempActivity.class);
            return true;
        }
        LogUtil.j(TAG, "Unexpected push type");
        return false;
    }

    private void setHealthNotification(Context context, c cVar, Notification.Builder builder, Intent intent) {
        String strA;
        String strD;
        intent.setClass(context, FamilyHealthTempActivity.class);
        if (cVar.a().equals("5002")) {
            c.e eVar = (c.e) new Gson().fromJson(CommonUtil.ac(cVar.d()), c.e.class);
            strA = eVar.c();
            strD = eVar.e();
            if (isProactiveNotification(strA)) {
                pushListenerCallback(strA, HiJsonUtil.d(cVar));
                intent.putExtra("pushType", strA);
                sendCommentFailureNotification(eVar, builder, context, intent);
                return;
            }
        } else {
            strA = cVar.a();
            strD = cVar.d();
        }
        String str = strA;
        pushListenerCallback(str, HiJsonUtil.d(cVar));
        intent.putExtra("pushType", str);
        getPushInformationByNotifyTime(context, builder, intent, strD, str);
    }

    private boolean isProactiveNotification(String str) {
        return PROACTIVE_NOTIFICATION_PUSH_LIST.contains(str);
    }

    private void getPushInformationByNotifyTime(final Context context, final Notification.Builder builder, final Intent intent, String str, String str2) {
        try {
            pfs.e().getPushInformationByNotifyTime(Long.parseLong(str), Integer.parseInt(str2), new HttpDataCallback() { // from class: com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver.10
                @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
                public void onFailure(int i, String str3) {
                    LogUtil.e(HealthZonePushReceiver.TAG, "getPushInformationByNotifyTime onFailure errorCode:", Integer.valueOf(i));
                }

                @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
                public void onSuccess(JSONObject jSONObject) {
                    try {
                        if (jSONObject.has("resultCode") && jSONObject.getInt("resultCode") == 0) {
                            pgd.a(jSONObject, new AbnormalDataInformationCallback() { // from class: com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver.10.1
                                @Override // com.huawei.pluginhealthzone.interactors.AbnormalDataInformationCallback
                                public void onFailure(int i, String str3) {
                                }

                                @Override // com.huawei.pluginhealthzone.interactors.AbnormalDataInformationCallback
                                public void onSuccess(List<pfy> list) {
                                    if (list == null) {
                                        LogUtil.j(HealthZonePushReceiver.TAG, "abnormalDataInformation is null");
                                        return;
                                    }
                                    builder.setContentTitle(context.getResources().getString(R.string.IDS_hwh_family_health_zone));
                                    Iterator<pfy> it = list.iterator();
                                    while (it.hasNext()) {
                                        HealthZonePushReceiver.this.sendNotificationForEachUser(it.next(), builder, context, intent);
                                    }
                                }
                            });
                        }
                    } catch (JSONException e) {
                        LogUtil.e(HealthZonePushReceiver.TAG, "getPushInformationByNotifyTime onSuccess:", LogAnonymous.b(e));
                    }
                }
            });
        } catch (NumberFormatException e) {
            LogUtil.e(TAG, "setHealthNotification:", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNotificationForEachUser(pfy pfyVar, Notification.Builder builder, Context context, Intent intent) {
        LogUtil.a(TAG, "sendNotificationForEachUser = ", HiJsonUtil.d(pfyVar));
        if (pfyVar == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!CommonUtil.bu()) {
            ArrayList arrayList = new ArrayList(2);
            NotificationDeviceLinkage notificationDeviceLinkage = new NotificationDeviceLinkage();
            notificationDeviceLinkage.setPingOpenRemote("0");
            notificationDeviceLinkage.setPingOpenType("1");
            notificationDeviceLinkage.setPingPackageName("hw.unitedevice.wakeapp");
            notificationDeviceLinkage.setPingClassName("com.huawei.health.receiver.PullPackageService");
            String strValueOf = String.valueOf(pfyVar.a());
            if (strValueOf.length() >= 8) {
                notificationDeviceLinkage.setPingUrl("huaweischeme://healthapp/router/familyhealth?healthType=10&memberhuid=" + strValueOf.substring(strValueOf.length() - 8, strValueOf.length()) + "&from=5");
            } else {
                notificationDeviceLinkage.setPingUrl("huaweischeme://healthapp/router/familyhealth?healthType=10&from=5");
            }
            notificationDeviceLinkage.setButtonContent(context.getResources().getString(com.huawei.pluginachievement.R.string.IDS_hw_messagecenter_more_detail));
            arrayList.add(notificationDeviceLinkage);
            builder.setExtras(ogd.d(new Bundle(), arrayList));
        }
        intent.setFlags(335544320);
        String strValueOf2 = String.valueOf(pfyVar.a());
        if (strValueOf2.length() >= 8) {
            intent.putExtra(MEMBER_HUID, strValueOf2.substring(strValueOf2.length() - 8, strValueOf2.length()));
        }
        for (String str : pfyVar.e()) {
            if (!TextUtils.isEmpty(str)) {
                int pushTypeFromRecords = getPushTypeFromRecords(pfyVar, pfyVar.e().indexOf(str));
                String str2 = pfyVar.a() + "-" + pushTypeFromRecords;
                if (pushTypeFromRecords == 0 || sNotifyMap.get(str2) == null || jCurrentTimeMillis < sNotifyMap.get(str2).longValue() || jCurrentTimeMillis - sNotifyMap.get(str2).longValue() >= NOTIFY_INTERVAL) {
                    if (pushTypeFromRecords != 0) {
                        sNotifyMap.put(str2, Long.valueOf(jCurrentTimeMillis));
                    }
                    builder.setContentText(str);
                    builder.setAutoCancel(true).setContentIntent(PendingIntent.getActivity(context, sHealthNotificationId, intent, 201326592));
                    synchronized (LOCK) {
                        lsb.d().c(sHealthNotificationId, builder.build());
                        int i = sHealthNotificationId;
                        if (i == HEALTH_NOTIFICATION_ID_END) {
                            sHealthNotificationId = HEALTH_NOTIFICATION_ID_START;
                        } else {
                            sHealthNotificationId = i + 1;
                        }
                    }
                }
            }
        }
    }

    private int getPushTypeFromRecords(pfy pfyVar, int i) {
        try {
            return pfyVar.b().keyAt(i);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException unused) {
            LogUtil.e(TAG, "get pushType exception");
            return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 int, still in use, count: 1, list:
      (r2v0 int) from 0x0014: SWITCH (r2v0 int)
     case 1636: goto B:30:0x005d
     case 1637: goto B:26:0x0052
     case 1638: goto B:22:0x0047
     default: goto B:4:0x0017 A[RegionRef:SW:3]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void sendCommentFailureNotification(c.e eVar, Notification.Builder builder, Context context, Intent intent) {
        byte b2;
        String string;
        String strO = CommonUtil.o(eVar.a());
        String strC = eVar.c();
        strC.hashCode();
        switch (strC.hashCode()) {
            case 1636:
                if (!strC.equals(PROACTIVE_SHARING_NOTIFY)) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case 1637:
                if (!strC.equals(COMMENT_FAILED_NOTIFY)) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 1638:
                if (!strC.equals("39")) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            default:
                switch (strC) {
                    case "40":
                        b2 = 3;
                        break;
                    case "41":
                        b2 = 4;
                        break;
                    case "42":
                        b2 = 5;
                        break;
                    case "43":
                        b2 = 6;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                break;
        }
        switch (b2) {
            case 0:
                string = context.getResources().getString(com.huawei.pluginhealthzone.R.string.IDS_shared_dynamic, strO);
                break;
            case 1:
                if ("1".equals(eVar.d())) {
                    return;
                }
                LogUtil.a(TAG, "createTime = ", HiDateUtil.e(eVar.b(), "HH:mm"));
                string = context.getResources().getString(com.huawei.pluginhealthzone.R.string.IDS_dynamic_violations, HiDateUtil.e(eVar.b(), "HH:mm"));
                break;
            case 2:
                string = context.getResources().getString(com.huawei.pluginhealthzone.R.string.IDS_ecg_interpretation, strO);
                break;
            case 3:
                string = context.getResources().getString(com.huawei.pluginhealthzone.R.string.IDS_family_care_notify, strO);
                break;
            case 4:
                string = context.getResources().getString(com.huawei.pluginhealthzone.R.string.IDS_sos_location_notify, strO);
                break;
            case 5:
                string = context.getResources().getString(com.huawei.pluginhealthzone.R.string.IDS_fall_location_notify, strO);
                break;
            case 6:
                string = context.getResources().getString(com.huawei.pluginhealthzone.R.string.IDS_ecg_measurement_abnormal, strO);
                break;
            default:
                LogUtil.j(TAG, "sendCommentFailureNotification pushType : ", eVar.c());
                return;
        }
        intent.setFlags(335544320);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        setNotificationBuilder(context, builder, string);
        builder.setAutoCancel(true).setContentIntent(PendingIntent.getActivity(context, sCommentNotificationId, intent, 201326592));
        synchronized (LOCK) {
            lsb.d().c(sCommentNotificationId, builder.build());
            sCommentNotificationId++;
        }
    }

    public static void setPushMessageListener(PushMessageListener pushMessageListener) {
        sPushMessageListener = pushMessageListener;
    }

    public static PushMessageListener getPushMessageListener() {
        return sPushMessageListener;
    }

    /* JADX INFO: loaded from: classes42.dex */
    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName(com.huawei.health.messagecenter.model.CommonUtil.MSG_CONTENT)
        private String f22354b;

        @SerializedName("pushType")
        private String e = "";

        @SerializedName("pushId")
        private String d = "";

        private c() {
        }

        static class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @SerializedName("memberFlag")
            private String f22355b = "";

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @SerializedName("userAccount")
            private String f22356c = "";

            private a() {
            }

            public String c() {
                return this.f22356c;
            }

            public String b() {
                return this.f22355b;
            }
        }

        static class e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @SerializedName("postStatus")
            private String f22357a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @SerializedName("postCreateTime")
            private long f22358b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @SerializedName("postId")
            private String f22359c;

            @SerializedName("notifyTime")
            private String d = "";

            @SerializedName(HealthZonePushReceiver.DETAIL_TYPE)
            private String e = "";

            @SerializedName("userAccount")
            private String j = "";

            private e() {
            }

            public String a() {
                return this.j;
            }

            public String e() {
                return this.d;
            }

            public String c() {
                return this.e;
            }

            public long b() {
                return this.f22358b;
            }

            public String d() {
                return this.f22357a;
            }
        }

        public String a() {
            return this.e;
        }

        public String d() {
            return this.f22354b;
        }

        public String toString() {
            return "HealthZoneMsgPushBean{, pushType ='" + this.e + "', pushId ='" + this.d + "'}";
        }
    }

    /* JADX INFO: loaded from: classes42.dex */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("headPictureURL")
        private String f22351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("isStart")
        private Integer f22352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("email")
        private String f22353c;

        @SerializedName(HealthZonePushReceiver.MEMBER_HUID)
        private Long d;

        @SerializedName("huid")
        private Long e;

        @SerializedName("requestFlag")
        private String f;

        @SerializedName("pushId")
        private String g;

        @SerializedName("pushSubType")
        private Integer h;

        @SerializedName(JsNetwork.NetworkType.MOBILE)
        private String i;

        @SerializedName("pushType")
        private Integer j;

        @SerializedName("userNickName")
        private String k;

        @SerializedName("traceId")
        private String n;

        private b() {
        }

        public Long a() {
            return this.e;
        }

        public Long b() {
            return this.d;
        }

        public Integer g() {
            return this.h;
        }

        public Integer c() {
            return this.f22352b;
        }

        public String f() {
            return this.k;
        }

        public String e() {
            return this.f22351a;
        }

        public String j() {
            return this.i;
        }

        public String d() {
            return this.f22353c;
        }

        public String i() {
            return this.f;
        }

        public void c(int i) {
            this.f22352b = Integer.valueOf(i);
        }
    }
}
