package com.huawei.pluginmessagecenter;

import android.content.Context;
import com.huawei.health.h5pro.jsbridge.base.JsModuleBase;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.IpushBase;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginmessagecenter.manager.MCNotificationManager;
import com.huawei.pluginmessagecenter.service.HuaweiHealthHmsPushService;
import com.huawei.pluginmessagecenter.service.MessageJsApi;
import com.huawei.pluginmessagecenter.service.MessageObserver;
import com.huawei.pluginmessagecenter.util.HttpResCallback;
import defpackage.pgz;
import defpackage.pha;
import defpackage.phk;
import defpackage.phm;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
@ApiDefine(uri = MessageCenterApi.class)
@Singleton
public class PluginMessageCenterImpl implements MessageCenterApi {
    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public String getMessageId(String str, String str2) {
        return pha.e(BaseApplication.getContext()).d(str, str2);
    }

    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public void getMessageId(String str, String str2, IBaseResponseCallback iBaseResponseCallback) {
        pha.e(BaseApplication.getContext()).b(str, str2, iBaseResponseCallback);
    }

    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public boolean insertMessage(MessageObject messageObject) {
        LogUtil.a("PluginMessageCenterImpl", "generateMessage");
        return pha.e(BaseApplication.getContext()).a(messageObject);
    }

    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public boolean setMessageRead(String str) {
        return pha.e(BaseApplication.getContext()).d(str);
    }

    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public boolean insertMessages(List<MessageObject> list) {
        return pgz.c(BaseApplication.getContext()).e(list);
    }

    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public boolean deleteMessage(String str) {
        return pha.e(BaseApplication.getContext()).a(str);
    }

    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public void deleteMessages(String str, String str2, IBaseResponseCallback iBaseResponseCallback) {
        pha.e(BaseApplication.getContext()).c(str, str2, iBaseResponseCallback);
    }

    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public void getMessages(String str, String str2, IBaseResponseCallback iBaseResponseCallback) {
        pha.e(BaseApplication.getContext()).d(str, str2, iBaseResponseCallback);
    }

    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public List<MessageObject> getMessages(String str, String str2) {
        return pha.e(BaseApplication.getContext()).b(str, str2);
    }

    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public List<MessageObject> getMessages(String str) {
        return pha.e(BaseApplication.getContext()).e(str);
    }

    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public List<MessageObject> getMessages(int i) {
        return pha.e(BaseApplication.getContext()).b(i);
    }

    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public int getMessageCenterUnreadCount() {
        return pha.e(BaseApplication.getContext()).c();
    }

    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public boolean setMessageInvisible(String str) {
        return pha.e(BaseApplication.getContext()).b(str);
    }

    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public void registerMessageObserver(MessageObserver messageObserver) {
        pha.e(BaseApplication.getContext()).d(messageObserver);
    }

    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public void unregisterMessageObserver(MessageObserver messageObserver) {
        pha.e(BaseApplication.getContext()).a(messageObserver);
    }

    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public void refreshMessages() {
        pha.e(BaseApplication.getContext()).d();
    }

    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public boolean isSystemBarPushSwitchOn() {
        return pha.c(BaseApplication.getContext());
    }

    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public Class<? extends JsModuleBase> getCommonJsModule(String str) {
        if ("message".equals(str)) {
            LogUtil.a("PluginMessageCenterImpl", "getCommonJsModule success");
            return MessageJsApi.class;
        }
        LogUtil.j("PluginMessageCenterImpl", "unknow JsModule:", str);
        return JsModuleBase.class;
    }

    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public void registerMessageHandler(IpushBase ipushBase) {
        HuaweiHealthHmsPushService.registerMessageHandler(ipushBase);
    }

    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public void initHms() {
        HuaweiHealthHmsPushService.initHms();
    }

    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public void saveToken(String str) {
        phk.a(str);
    }

    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public void deleteToken() {
        HuaweiHealthHmsPushService.deleteToken();
    }

    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public void showNotification(Context context, MessageObject messageObject) {
        MCNotificationManager.showNotification(context, messageObject);
    }

    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public void cancelNotification(int i) {
        MCNotificationManager.cancelNotification(i);
    }

    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public void updateMessageNotification(Context context, MessageObject messageObject, long j) {
        MCNotificationManager.showUpdateMessageNotification(context, messageObject, j);
    }

    @Override // com.huawei.health.messagecenter.api.MessageCenterApi
    public void doMessagesPostReq(Context context, String str, String str2, HttpResCallback httpResCallback) {
        phm.a(context, str, str2, httpResCallback);
    }
}
