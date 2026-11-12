package com.huawei.hwsmartinteractmgr.smarter;

import android.content.ContentValues;
import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.hwsmartinteractmgr.data.SmartMsgDbObject;
import com.huawei.hwsmartinteractmgr.data.msgcontent.NotificationMsgContent;
import com.huawei.pluginmessagecenter.provider.data.MessageChangeEvent;
import com.huawei.pluginmessagecenter.service.MessageObserver;
import defpackage.lsy;
import defpackage.njy;
import defpackage.nsv;
import health.compact.a.Services;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class MsgCenterSmarter extends BaseSmarter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private nsv f17724a;
    private MessageCenterApi d;
    private MessageObserver e;

    public MsgCenterSmarter(Context context) {
        super(context);
        this.e = new MessageObserver() { // from class: com.huawei.hwsmartinteractmgr.smarter.MsgCenterSmarter.5
            @Override // com.huawei.pluginmessagecenter.service.MessageObserver
            public void onChange(int i, MessageChangeEvent messageChangeEvent) {
                LogUtil.a("SMART_MsgCenterSmarter", "MessageObserver onChange start");
                lsy.a(new Runnable() { // from class: com.huawei.hwsmartinteractmgr.smarter.MsgCenterSmarter.5.2
                    @Override // java.lang.Runnable
                    public void run() {
                        MsgCenterSmarter.this.a(50001);
                        MsgCenterSmarter.this.a(50000);
                    }
                });
            }
        };
        LogUtil.a("SMART_MsgCenterSmarter", "MsgCenterSmarter");
        this.f17713c = context.getApplicationContext();
        this.d = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        this.f17724a = nsv.e(this.f17713c);
    }

    public void a() {
        a(50001);
        a(50000);
    }

    public void a(int i) {
        MessageObject messageObjectB = b(i);
        if (messageObjectB == null) {
            LogUtil.a("SMART_MsgCenterSmarter", "no message msgType = ", Integer.valueOf(i), " deleteResult=", Integer.valueOf(this.f17724a.d(i)));
            return;
        }
        LogUtil.a("SMART_MsgCenterSmarter", "msgType = ", Integer.valueOf(i), " msgId = ", messageObjectB.getMsgId());
        SmartMsgDbObject smartMsgDbObjectA = this.f17724a.a(i);
        if (smartMsgDbObjectA == null) {
            LogUtil.a("SMART_MsgCenterSmarter", "msgType = ", Integer.valueOf(i), " isInserted=", Boolean.valueOf(this.f17724a.e(a(messageObjectB, i))));
            return;
        }
        String notificationId = ((NotificationMsgContent) HiJsonUtil.d(smartMsgDbObjectA.getMsgContent(), NotificationMsgContent.class)).getNotificationId();
        if (notificationId != null && notificationId.equals(messageObjectB.getMsgId())) {
            if (smartMsgDbObjectA.getStatus() == 2 || smartMsgDbObjectA.getUpdateTime() != messageObjectB.getCreateTime()) {
                LogUtil.a("SMART_MsgCenterSmarter", "msgType = ", Integer.valueOf(i), " updateResult= ", Boolean.valueOf(a(smartMsgDbObjectA.getId(), messageObjectB)));
            }
            LogUtil.a("SMART_MsgCenterSmarter", "msgType = ", Integer.valueOf(i), " oldId equals newId finish");
            return;
        }
        LogUtil.a("SMART_MsgCenterSmarter", "msgType = ", Integer.valueOf(i), " new msg delResult=", Integer.valueOf(this.f17724a.d(i)), ", isInserted=", Boolean.valueOf(this.f17724a.e(a(messageObjectB, i))));
    }

    private boolean a(int i, MessageObject messageObject) {
        NotificationMsgContent notificationMsgContent = new NotificationMsgContent();
        notificationMsgContent.setContent(messageObject.getMsgTitle());
        notificationMsgContent.setNotificationId(messageObject.getMsgId());
        notificationMsgContent.setType(messageObject.getType());
        notificationMsgContent.setUrl(messageObject.getDetailUri());
        ContentValues contentValues = new ContentValues();
        contentValues.put("msgContent", HiJsonUtil.e(notificationMsgContent, NotificationMsgContent.class));
        contentValues.put("expireTime", Long.valueOf(messageObject.getExpireTime()));
        return nsv.e(this.f17713c).d(i, contentValues);
    }

    private SmartMsgDbObject a(MessageObject messageObject, int i) {
        SmartMsgDbObject smartMsgDbObject = new SmartMsgDbObject();
        smartMsgDbObject.setMsgType(i);
        smartMsgDbObject.setShowMethod(SmartMsgConstant.SHOW_METHOD_SMART_CARD);
        smartMsgDbObject.setUpdateTime(messageObject.getCreateTime());
        smartMsgDbObject.setShowTime(SmartMsgConstant.DEFAULT_SHOW_TIME);
        smartMsgDbObject.setMsgContentType(4);
        smartMsgDbObject.setExpireTime(messageObject.getExpireTime());
        NotificationMsgContent notificationMsgContent = new NotificationMsgContent();
        notificationMsgContent.setContent(messageObject.getMsgTitle());
        notificationMsgContent.setNotificationId(messageObject.getMsgId());
        notificationMsgContent.setType(messageObject.getType());
        notificationMsgContent.setUrl(messageObject.getDetailUri());
        smartMsgDbObject.setMsgContent(HiJsonUtil.e(notificationMsgContent, NotificationMsgContent.class));
        smartMsgDbObject.setMsgSrc(5);
        smartMsgDbObject.setMessagePriority(1000);
        smartMsgDbObject.setStatus(1);
        return smartMsgDbObject;
    }

    private MessageObject b(int i) {
        List<MessageObject> messages = this.d.getMessages(11);
        if (njy.e(messages)) {
            LogUtil.j("SMART_MsgCenterSmarter", "messageList is empty");
            return null;
        }
        for (MessageObject messageObject : messages) {
            if ((i == 50001 && e(messageObject)) || (i == 50000 && !e(messageObject) && !d(messageObject))) {
                return messageObject;
            }
        }
        return null;
    }

    private boolean d(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        return CommonUtil.WEEK_REPORT_MESSAGE.equals(messageObject.getType()) || "monthReportMessage".equals(messageObject.getType());
    }

    private boolean e(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        return messageObject.getMsgId().startsWith("G") || messageObject.getMsgId().startsWith(ExifInterface.LATITUDE_SOUTH);
    }

    public void e() {
        this.d.registerMessageObserver(this.e);
    }

    public void d() {
        this.d.unregisterMessageObserver(this.e);
    }
}
