package com.xiaomi.hm.health.push;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageReceiver;
import de.greenrobot.event.EventBus;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Keep
public class MiPushMessageReceiver extends PushMessageReceiver {
    private static final String KEY_MSG_TYPE = "msgType";
    private static final String KEY_MSG_URL = "msgURL";
    public static final String MIPUSH_ALIAS_UNSET = "MIPUSH_ALIAS_UNSET";
    public static final String MIPUSH_ALL_TOPICS_INIT = "MIPUSH_ALL_TOPICS_INIT";
    public static final String MIPUSH_MESSAGE_CLICKED = "MIPUSH_MESSAGE_CLICKED";
    public static final String MIPUSH_ON_COMMAND_RESULT = "MIPUSH_ON_COMMAND_RESULT";
    public static final String MIPUSH_RECEIVC_PASS_THROUGH_MESSAGE = "MIPUSH_RECEIVC_PASS_THROUGH_MESSAGE";
    public static final String MIPUSH_RECEIVE_MESSAGE = "MIPUSH_RECEIVE_MESSAGE";
    public static final String MIPUSH_RECEIVE_REGISTER_RESULT = "MIPUSH_RECEIVE_REGISTER_RESULT";
    public static final String MIPUSH_REGISTER = "MIPUSH_REGISTER";
    public static final String MIPUSH_SET_ALIAS = "MIPUSH_SET_ALIAS";
    public static final String MIPUSH_UNREGISTER = "MIPUSH_UNREGISTER";
    private static final String MSG_TYPE_JUMP_DIRECT = "jumpdirect";
    public static final String PUSH_NOTIFICATION_ENABLE = "PUSH_NOTIFICATION_ENABLE";
    public static final String RECEIVE_NOTIFICATION = "SysPush_Receive";
    private static final String TAG = "MiPushMessageReceiver";
    private static final String TOPIC_ABROAD = "abroad";
    private static final String TOPIC_CHINA = "china";
    public static final String VERSION = "version";
    private String mAlias;
    private String mEndTime;
    private String mRegId;
    private String mStartTime;
    private String mTopic;

    private boolean checkJumpDirect(Context context, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!MSG_TYPE_JUMP_DIRECT.equals(jSONObject.optString(KEY_MSG_TYPE))) {
                return false;
            }
            String strOptString = jSONObject.optString(KEY_MSG_URL);
            if (TextUtils.isEmpty(strOptString)) {
                return false;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(strOptString));
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (JSONException e) {
            HMLog.i(TAG, "checkJumpDirect parse failed: " + e.getMessage(), new Object[0]);
            return false;
        } catch (Exception e2) {
            HMLog.e(TAG, "checkJumpDirect error: " + e2.getMessage(), e2);
            return false;
        }
    }

    private void dumpMiPushInfo(Context context, Set<String> set) {
        Iterator<String> it2 = MiPushClient.getAllAlias(context).iterator();
        while (it2.hasNext()) {
            HMLog.i(TAG, "alias:" + it2.next(), new Object[0]);
        }
        for (String str : MiPushClient.getAllTopic(context)) {
            HMLog.i(TAG, "topic:" + str, new Object[0]);
            if (!set.contains(str)) {
                HMLog.i(TAG, "unsubscribe-topic:" + str, new Object[0]);
                MiPushClient.unsubscribe(context, str, null);
            }
        }
        Iterator<String> it3 = MiPushClient.getAllUserAccount(context).iterator();
        while (it3.hasNext()) {
            HMLog.i(TAG, "accout:" + it3.next(), new Object[0]);
        }
        HMLog.i(TAG, "regId:" + MiPushClient.getRegId(context), new Object[0]);
    }

    private void subscribeRight(Context context) {
        HashSet hashSet = new HashSet();
        hashSet.add(HMAppConfig.getVersionName());
        hashSet.add(HMAppConfig.getChannel());
        hashSet.add(Locale.getDefault().getLanguage());
        hashSet.add(Locale.getDefault().getCountry());
        hashSet.add(Language.getDefault());
        hashSet.add("android_phone");
        hashSet.add("android_" + Build.VERSION.SDK_INT);
        String areaTopic = PushConfig.getAccounts().getAreaTopic();
        if (areaTopic != null) {
            hashSet.add(areaTopic);
        }
        boolean zIsInChina = PushConfig.getAccounts().isInChina();
        if (zIsInChina) {
            hashSet.add(TOPIC_CHINA);
        } else {
            hashSet.add(TOPIC_ABROAD);
        }
        Iterator<String> it2 = hashSet.iterator();
        while (it2.hasNext()) {
            MiPushClient.subscribe(context, it2.next(), null);
        }
        Analytics.recordEvent(new CountEventBuilder(MIPUSH_ALL_TOPICS_INIT).addExtra("IsAccountInChina", String.valueOf(zIsInChina)).addExtra("AreaTopic", areaTopic));
        if (DifferenceManager.isBuildMidong()) {
            String uid = PushConfig.getAccounts().getUid();
            if (!TextUtils.isEmpty(uid)) {
                MiPushClient.setAlias(context, uid, null);
                trackSetAlias(uid);
            }
        } else {
            String thirdId = PushConfig.getAccounts().getThirdId();
            String huamiId = PushConfig.getAccounts().getHuamiId();
            if (!TextUtils.isEmpty(thirdId)) {
                MiPushClient.setAlias(context, thirdId, null);
                trackSetAlias(thirdId);
            }
            if (!TextUtils.isEmpty(huamiId)) {
                String str = "huami_" + huamiId;
                MiPushClient.setAlias(context, str, null);
                trackSetAlias(str);
            }
        }
        dumpMiPushInfo(context, hashSet);
    }

    private void trackMessageDetail(String str, MiPushMessage miPushMessage) {
        Analytics.recordEvent(new CountEventBuilder(str).addExtra("Title", miPushMessage.getTitle()).addExtra("Topic", miPushMessage.getTopic()).addExtra("Alias", miPushMessage.getAlias()));
    }

    private void trackSetAlias(String str) {
        Analytics.recordEvent(new CountEventBuilder(MIPUSH_SET_ALIAS).addExtra("Alias", str));
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onCommandResult(Context context, MiPushCommandMessage miPushCommandMessage) {
        HMLog.i(TAG, "onCommandResult:" + miPushCommandMessage, new Object[0]);
        String command = miPushCommandMessage.getCommand();
        Analytics.recordEvent(new CountEventBuilder(MIPUSH_ON_COMMAND_RESULT).addExtra("Command", command).addExtra("ResultCode", String.valueOf(miPushCommandMessage.getResultCode())).addExtra("Reason", miPushCommandMessage.getReason()));
        List<String> commandArguments = miPushCommandMessage.getCommandArguments();
        String str = null;
        String str2 = (commandArguments == null || commandArguments.size() <= 0) ? null : commandArguments.get(0);
        if (commandArguments != null && commandArguments.size() > 1) {
            str = commandArguments.get(1);
        }
        if ("register".equals(command)) {
            if (miPushCommandMessage.getResultCode() == 0) {
                this.mRegId = str2;
                HMLog.i(TAG, "Register Push Success : " + this.mRegId, new Object[0]);
                subscribeRight(context);
                return;
            }
            return;
        }
        if (MiPushClient.COMMAND_SET_ALIAS.equals(command)) {
            if (miPushCommandMessage.getResultCode() == 0) {
                this.mAlias = str2;
                HMLog.i(TAG, "Set Alias Success : " + this.mAlias, new Object[0]);
                return;
            }
            return;
        }
        if (MiPushClient.COMMAND_UNSET_ALIAS.equals(command)) {
            if (miPushCommandMessage.getResultCode() == 0) {
                this.mAlias = str2;
                return;
            }
            return;
        }
        if (MiPushClient.COMMAND_SUBSCRIBE_TOPIC.equals(command)) {
            if (miPushCommandMessage.getResultCode() == 0) {
                this.mTopic = str2;
            }
        } else if (MiPushClient.COMMAND_UNSUBSCRIBE_TOPIC.equals(command)) {
            if (miPushCommandMessage.getResultCode() == 0) {
                this.mTopic = str2;
            }
        } else if (MiPushClient.COMMAND_SET_ACCEPT_TIME.equals(command) && miPushCommandMessage.getResultCode() == 0) {
            this.mStartTime = str2;
            this.mEndTime = str;
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onNotificationMessageArrived(Context context, MiPushMessage miPushMessage) {
        super.onNotificationMessageArrived(context, miPushMessage);
        HMLog.i(TAG, "onNotificationMessageArrived:" + miPushMessage, new Object[0]);
        Analytics.event(context, "SysPush_Receive", miPushMessage.getTitle());
        trackMessageDetail(MIPUSH_RECEIVE_MESSAGE, miPushMessage);
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onNotificationMessageClicked(Context context, MiPushMessage miPushMessage) {
        super.onNotificationMessageClicked(context, miPushMessage);
        HMLog.i(TAG, "onNotificationMessageClicked:" + miPushMessage, new Object[0]);
        trackMessageDetail(MIPUSH_MESSAGE_CLICKED, miPushMessage);
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onReceiveMessage(Context context, MiPushMessage miPushMessage) {
        HMLog.i(TAG, "onReceiveMessage:" + miPushMessage, new Object[0]);
        if (PushConfig.getCheckMessage() != null && PushConfig.getCheckMessage().invoke(miPushMessage.getExtra()).booleanValue()) {
            HMLog.i(TAG, "handle the notify message!!!", new Object[0]);
            return;
        }
        String content = miPushMessage.getContent();
        if (checkJumpDirect(context, content)) {
            HMLog.i(TAG, "handle the jump direct message", new Object[0]);
            return;
        }
        HMLog.i(TAG, "Push message receiver:" + content, new Object[0]);
        BaseMessage baseMessageA = MessageManager.getDefault(context).a(context, content);
        if (baseMessageA != null) {
            baseMessageA.doWork();
            EventBus.getDefault().post(baseMessageA);
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onReceivePassThroughMessage(Context context, MiPushMessage miPushMessage) {
        super.onReceivePassThroughMessage(context, miPushMessage);
        HMLog.i(TAG, "onReceivePassThroughMessage:" + miPushMessage, new Object[0]);
        trackMessageDetail(MIPUSH_RECEIVC_PASS_THROUGH_MESSAGE, miPushMessage);
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onReceiveRegisterResult(Context context, MiPushCommandMessage miPushCommandMessage) {
        super.onReceiveRegisterResult(context, miPushCommandMessage);
        HMLog.i(TAG, "onReceiveRegisterResult:" + miPushCommandMessage, new Object[0]);
        Analytics.recordEvent(new CountEventBuilder(MIPUSH_RECEIVE_REGISTER_RESULT).addExtra("ResultCode", String.valueOf(miPushCommandMessage.getResultCode())).addExtra("Reason", miPushCommandMessage.getReason()));
    }
}
