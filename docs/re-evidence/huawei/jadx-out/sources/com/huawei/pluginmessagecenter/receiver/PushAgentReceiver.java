package com.huawei.pluginmessagecenter.receiver;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.health.messagecenter.model.GroupInvatationNotify;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.pluginmessagecenter.R;
import com.huawei.pluginmessagecenter.manager.MCNotificationManager;
import defpackage.pha;
import defpackage.php;
import health.compact.a.SharedPreferenceManager;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes42.dex */
public class PushAgentReceiver {
    private static final String GROUP_INVATATION = "GroupInvatationNotify";
    private static final String TAG = "PushAgentReceiver";
    private Context mContext;
    private pha mPluginMessageCenter;

    public static void onToken(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "context = null or pushToken is empty");
        } else {
            SharedPreferenceManager.e(context, "push_token_caching", "push_token", str, null);
        }
    }

    public void onPushMessage(Context context, String str) {
        LogUtil.a(TAG, "onPushMessage() enter");
        this.mContext = context;
        if (this.mPluginMessageCenter == null) {
            this.mPluginMessageCenter = pha.e(context);
        }
        if (str == null) {
            LogUtil.j(TAG, "message = null");
            return;
        }
        try {
            String string = new JSONObject(str).getString(GROUP_INVATATION);
            if (string == null) {
                LogUtil.j(TAG, "result = null");
            } else {
                generateNpsMessage((GroupInvatationNotify) new Gson().fromJson(string, GroupInvatationNotify.class));
            }
        } catch (JsonSyntaxException | JSONException unused) {
            LogUtil.e(TAG, "onPushMessage JsonSyntaxException");
        }
    }

    private void generateNpsMessage(GroupInvatationNotify groupInvatationNotify) {
        LogUtil.a(TAG, "enter generateNpsMessage");
        final int iTranslationType = translationType(groupInvatationNotify);
        if (iTranslationType <= 0) {
            LogUtil.a(TAG, "message not format");
            return;
        }
        final int type = groupInvatationNotify.getType();
        final String nickname = groupInvatationNotify.getNickname();
        final String groupName = groupInvatationNotify.getGroupName();
        long userId = groupInvatationNotify.getUserId();
        final long groupId = groupInvatationNotify.getGroupId();
        pha phaVar = this.mPluginMessageCenter;
        String strValueOf = String.valueOf(51);
        final String strValueOf2 = String.valueOf(userId);
        phaVar.b(strValueOf, MessageConstant.GROUP_MEDAL_TYPE, new IBaseResponseCallback() { // from class: phl
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.m1658xa8ddca8a(iTranslationType, type, nickname, groupName, strValueOf2, groupId, i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$generateNpsMessage$0$com-huawei-pluginmessagecenter-receiver-PushAgentReceiver, reason: not valid java name */
    public /* synthetic */ void m1658xa8ddca8a(int i, int i2, String str, String str2, String str3, long j, int i3, Object obj) {
        if (i3 == 0 && obj != null && (obj instanceof String)) {
            MessageObject messageObject = new MessageObject();
            messageObject.setMsgId((String) obj);
            messageObject.setModule(String.valueOf(51));
            messageObject.setType(MessageConstant.GROUP_MEDAL_TYPE);
            messageObject.setMsgType(2);
            messageObject.setPosition(i == 65 ? 1 : 3);
            messageObject.setMsgPosition(11);
            messageObject.setHuid(SharedPreferenceUtil.getInstance(this.mContext).getUserID());
            messageObject.setMsgContent(getContentByType(i2, str, str2, str3));
            messageObject.setMsgTitle(this.mContext.getString(php.a(i2)));
            messageObject.setDetailUriExt(String.valueOf(i));
            messageObject.setExpireTime(0L);
            messageObject.setReadFlag(0);
            messageObject.setCreateTime(System.currentTimeMillis());
            messageObject.setDetailUri("messagecenter://group?type=" + i2 + "&groupId=" + j);
            this.mPluginMessageCenter.a(messageObject);
            if (i2 == 9) {
                messageObject.setMsgTitle(String.format(Locale.ENGLISH, this.mContext.getResources().getString(R.string.IDS_hw_group_notify_title), str2));
            }
            showNotificationMessage(messageObject);
            return;
        }
        LogUtil.a(TAG, "requestMessageId fail");
    }

    private static void showNotificationMessage(MessageObject messageObject) {
        MCNotificationManager.showNotification(BaseApplication.getContext(), messageObject);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x004c A[RETURN] */
    private int translationType(GroupInvatationNotify groupInvatationNotify) {
        if (!LoginInit.getInstance(this.mContext).getIsLogined() || groupInvatationNotify == null) {
            LogUtil.a(TAG, "not Login or groupInvatationNotify = null");
            return 0;
        }
        int type = groupInvatationNotify.getType();
        LogUtil.a(TAG, "type:", Integer.valueOf(type));
        if (type == 3) {
            return 65;
        }
        if (type == 9) {
            return 60;
        }
        switch (type) {
            case 19:
                long userId = groupInvatationNotify.getUserId();
                if (String.valueOf(userId).equals(SharedPreferenceUtil.getInstance(this.mContext).getUserID())) {
                    return 0;
                }
                return 61;
            case 20:
            case 21:
            case 22:
                return 62;
            default:
                return 0;
        }
    }

    public String getContentByType(int i, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            str = php.c(str3, 3, 2);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        if (i == 3) {
            return String.format(Locale.ENGLISH, this.mContext.getResources().getString(R.string.IDS_hw_group_dissolved), str2);
        }
        if (i == 9) {
            return this.mContext.getString(R.string.IDS_hw_group_administrator);
        }
        switch (i) {
            case 19:
                return String.format(Locale.ENGLISH, this.mContext.getResources().getString(R.string.IDS_hw_group_invataion), str, str2);
            case 20:
                return String.format(Locale.ENGLISH, this.mContext.getResources().getString(R.string.IDS_hw_group_actively), str, str2);
            case 21:
                return String.format(Locale.ENGLISH, this.mContext.getResources().getString(R.string.IDS_hw_group_agree), str, str2);
            case 22:
                return String.format(Locale.ENGLISH, this.mContext.getResources().getString(R.string.IDS_hw_group_rejects), str, str2);
            default:
                return "";
        }
    }
}
