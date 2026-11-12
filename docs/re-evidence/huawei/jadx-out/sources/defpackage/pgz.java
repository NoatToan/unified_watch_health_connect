package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.pluginmessagecenter.provider.data.MessageChangeEvent;
import com.huawei.pluginmessagecenter.service.MessageObserver;
import com.huawei.pluginmessagecenter.service.MessageObserverController;
import com.huawei.pluginmessagecenter.service.MessagePuller;
import com.huawei.pluginmessagecenter.util.PullMessageCallback;
import health.compact.a.DataBaseHelper;
import health.compact.a.DbManager;
import health.compact.a.LogAnonymous;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes14.dex */
public class pgz extends HwBaseManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile pgz f45341c;
    private static final Byte[] e = new Byte[1];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MessageObserverController f45342b;
    private Context d;

    private pgz(Context context) throws Throwable {
        super(context);
        LogUtil.a("UIDV_MessageDbProvider", "Enter MessageDbProvider");
        this.d = context;
        this.f45342b = new MessageObserverController();
        if (f()) {
            LogUtil.a("UIDV_MessageDbProvider", "MessageDB data is null!");
        }
        int iC = DataBaseHelper.d(String.valueOf(getModuleId())).c();
        LogUtil.a("UIDV_MessageDbProvider", "newDbVersion =", 112, ", oldDbVersion=", Integer.valueOf(iC));
        if (iC >= 100 && iC <= 107) {
            i();
        } else {
            a();
        }
        if (!DbManager.d(String.valueOf(getModuleId()), getTableFullName("message"), CommonUtil.IMAGE_TEXT_SEPARATE_SWITCH)) {
            LogUtil.a("UIDV_MessageDbProvider", "pageType is not exist");
            i();
        }
        LogUtil.a("UIDV_MessageDbProvider", "Leave MessageDbProvider");
    }

    public static pgz c(Context context) {
        if (f45341c == null) {
            synchronized (e) {
                if (f45341c == null) {
                    f45341c = new pgz(context);
                }
            }
        }
        return f45341c;
    }

    private boolean f() {
        LogUtil.a("UIDV_MessageDbProvider", "Enter isMessageDbNull");
        try {
            Cursor cursorQueryStorageData = queryStorageData("message", 1, null);
            boolean z = cursorQueryStorageData == null;
            a(cursorQueryStorageData);
            return z;
        } catch (Throwable th) {
            a((Cursor) null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x014b A[Catch: SQLiteException -> 0x014f, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x014f, blocks: (B:47:0x0145, B:49:0x014b), top: B:70:0x0145 }] */
    public String a(String str, String str2) {
        char c2;
        String str3;
        String str4;
        LogUtil.a("UIDV_MessageDbProvider", "requestMessageId module = ", str, " type = ", str2);
        String huidOrDefault = LoginInit.getInstance(BaseApplication.getContext()).getHuidOrDefault();
        SQLiteDatabase sQLiteDatabaseE = DataBaseHelper.d(String.valueOf(getModuleId())).e();
        String str5 = "";
        if (sQLiteDatabaseE == null) {
            LogUtil.a("UIDV_MessageDbProvider", "the messageCenter db is null.");
            return "";
        }
        try {
            try {
                sQLiteDatabaseE.beginTransaction();
                long jInsertStorageData = insertStorageData("message", 1, phd.b(huidOrDefault, str, str2));
                if (jInsertStorageData == -1) {
                    LogUtil.a("UIDV_MessageDbProvider", "insert wrong");
                    try {
                        if (sQLiteDatabaseE.inTransaction()) {
                            sQLiteDatabaseE.endTransaction();
                            return "";
                        }
                    } catch (SQLiteException e2) {
                        ReleaseLogUtil.a("UIDV_MessageDbProvider", "requestMessageId, SQLiteException: ", e2.getMessage());
                    }
                    return "";
                }
                String str6 = CmcdData.Factory.STREAM_TYPE_LIVE + jInsertStorageData;
                try {
                    if (str2.equals(MessageConstant.GROUP_MEDAL_TYPE)) {
                        try {
                            StringBuffer stringBuffer = new StringBuffer(16);
                            stringBuffer.append("id =? ");
                            LogUtil.a("UIDV_MessageDbProvider", "deleteStorageData result = ", Integer.valueOf(deleteStorageData("message", 1, stringBuffer.toString(), new String[]{String.valueOf(jInsertStorageData)})));
                            str4 = str6;
                            c2 = 1;
                        } catch (SQLiteDatabaseLockedException e3) {
                            e = e3;
                            str5 = str6;
                            c2 = 1;
                            String strB = LogAnonymous.b(e);
                            Object[] objArr = new Object[2];
                            objArr[0] = "requestMessageId, SQLiteDatabaseLockedException: ";
                            objArr[c2] = strB;
                            ReleaseLogUtil.a("UIDV_MessageDbProvider", objArr);
                            OpAnalyticsUtil.getInstance().sqliteDatabaseLockedExceptionSetEvent(e, "MessageDbProvider#requestMessageId");
                            try {
                                if (sQLiteDatabaseE.inTransaction()) {
                                    sQLiteDatabaseE.endTransaction();
                                }
                            } catch (SQLiteException e4) {
                                ReleaseLogUtil.a("UIDV_MessageDbProvider", "requestMessageId, SQLiteException: ", e4.getMessage());
                            }
                            str3 = str5;
                        }
                    } else {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("msgId", str6);
                        StringBuffer stringBuffer2 = new StringBuffer(16);
                        stringBuffer2.append("id =? ");
                        str4 = str6;
                        c2 = 1;
                        try {
                            LogUtil.a("UIDV_MessageDbProvider", "requestMessageId result = ", Integer.valueOf(updateStorageData("message", 1, contentValues, stringBuffer2.toString(), new String[]{String.valueOf(jInsertStorageData)})));
                        } catch (SQLiteDatabaseLockedException e5) {
                            e = e5;
                            str5 = str4;
                            String strB2 = LogAnonymous.b(e);
                            Object[] objArr2 = new Object[2];
                            objArr2[0] = "requestMessageId, SQLiteDatabaseLockedException: ";
                            objArr2[c2] = strB2;
                            ReleaseLogUtil.a("UIDV_MessageDbProvider", objArr2);
                            OpAnalyticsUtil.getInstance().sqliteDatabaseLockedExceptionSetEvent(e, "MessageDbProvider#requestMessageId");
                            if (sQLiteDatabaseE.inTransaction()) {
                                sQLiteDatabaseE.endTransaction();
                            }
                            str3 = str5;
                        }
                    }
                    sQLiteDatabaseE.setTransactionSuccessful();
                    try {
                        if (sQLiteDatabaseE.inTransaction()) {
                            sQLiteDatabaseE.endTransaction();
                        }
                    } catch (SQLiteException e6) {
                        ReleaseLogUtil.a("UIDV_MessageDbProvider", "requestMessageId, SQLiteException: ", e6.getMessage());
                    }
                    str3 = str4;
                } catch (SQLiteDatabaseLockedException e7) {
                    e = e7;
                    str4 = str6;
                    c2 = 1;
                }
                LogUtil.d("UIDV_MessageDbProvider", "requestMessageId module = ", str, " type = ", str2);
                return str3;
            } catch (SQLiteDatabaseLockedException e8) {
                e = e8;
            }
        } catch (Throwable th) {
            try {
                if (!sQLiteDatabaseE.inTransaction()) {
                    throw th;
                }
                sQLiteDatabaseE.endTransaction();
                throw th;
            } catch (SQLiteException e9) {
                ReleaseLogUtil.a("UIDV_MessageDbProvider", "requestMessageId, SQLiteException: ", e9.getMessage());
                throw th;
            }
        }
    }

    private void a() {
        LogUtil.a("UIDV_MessageDbProvider", "createTable | create new table: ", getTableFullName("message"));
        LogUtil.d("UIDV_MessageDbProvider", "createTable | create new table sql = ", "id integer primary key autoincrement,msgId text not null,module text,type text,metadata text,msgType integer not null check(msgType > 0),flag integer not null check(flag > -1),weight integer not null check(weight > -1),readFlag integer not null,msgTitle text not null,msgContext text,createTime integer not null,receiveTime integer not null,expireTime integer not null,imgURI text,imgBigUri text,detailUri text not null,detailUriExt text,msgFrom text,position integer not null check(position > 0),msgPosition integer not null,huid text,imei text,notified integer not null,infoClassify text,heatMapCity text,infoRecommend integer,msgUserLable text,layout integer,messageExtList text,pageType integer,imageTextSeparateSwitch integer,harmonyImageUrl text,harmonyImageSize text,reserveParamOne textreserveParamTwo textreserveParamThree text");
        createStorageDataTable("message", 1, "id integer primary key autoincrement,msgId text not null,module text,type text,metadata text,msgType integer not null check(msgType > 0),flag integer not null check(flag > -1),weight integer not null check(weight > -1),readFlag integer not null,msgTitle text not null,msgContext text,createTime integer not null,receiveTime integer not null,expireTime integer not null,imgURI text,imgBigUri text,detailUri text not null,detailUriExt text,msgFrom text,position integer not null check(position > 0),msgPosition integer not null,huid text,imei text,notified integer not null,infoClassify text,heatMapCity text,infoRecommend integer,msgUserLable text,layout integer,messageExtList text,pageType integer,imageTextSeparateSwitch integer,harmonyImageUrl text,harmonyImageSize text,reserveParamOne textreserveParamTwo textreserveParamThree text");
        LogUtil.a("UIDV_MessageDbProvider", "createTable | create table end");
    }

    private void i() throws Throwable {
        ArrayList arrayList = new ArrayList(16);
        arrayList.clear();
        LogUtil.a("UIDV_MessageDbProvider", "Enter upgradeMessageCenterDb");
        Cursor cursorQueryStorageData = null;
        try {
            cursorQueryStorageData = queryStorageData("message", 1, null);
            b(arrayList, cursorQueryStorageData);
            a(cursorQueryStorageData);
            e();
            DbManager.b(this.d, String.valueOf(getModuleId()), "message", 1);
            a();
            if (!arrayList.isEmpty()) {
                e(arrayList);
            }
            h();
            LogUtil.d("UIDV_MessageDbProvider", "Leave upgradeMessageCenterDb");
        } catch (Throwable th) {
            a(cursorQueryStorageData);
            throw th;
        }
    }

    private void b(List<MessageObject> list, Cursor cursor) {
        if (cursor == null || !cursor.moveToFirst()) {
            return;
        }
        do {
            MessageObject messageObjectA = phd.a(cursor);
            if (!phd.c(messageObjectA)) {
                list.add(messageObjectA);
            }
        } while (cursor.moveToNext());
    }

    private void e(int i, MessageChangeEvent messageChangeEvent) {
        MessageObserverController messageObserverController = this.f45342b;
        if (messageObserverController != null) {
            messageObserverController.notifyAllObservers(i, messageChangeEvent);
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x013f  */
    public boolean a(MessageObject messageObject) {
        int i;
        boolean z;
        boolean z2;
        LogUtil.a("UIDV_MessageDbProvider", "Enter insert | Message: ");
        boolean z3 = false;
        if (!phd.b(messageObject)) {
            return false;
        }
        String msgId = messageObject.getMsgId();
        try {
            i = Integer.parseInt(messageObject.getModule());
        } catch (NumberFormatException unused) {
            LogUtil.e("UIDV_MessageDbProvider", "NumberFormatException");
            i = 0;
        }
        b(i, messageObject);
        SQLiteDatabase sQLiteDatabaseE = DataBaseHelper.d(String.valueOf(getModuleId())).e();
        if (sQLiteDatabaseE == null) {
            ReleaseLogUtil.d("UIDV_MessageDbProvider", "the db is null, can't insert.");
            return false;
        }
        try {
            if (sQLiteDatabaseE.inTransaction()) {
                z2 = false;
            } else {
                sQLiteDatabaseE.beginTransaction();
                z2 = true;
            }
            try {
                try {
                    ContentValues contentValuesA = phd.a(messageObject);
                    if (b(msgId) == null) {
                        contentValuesA.put("msgId", messageObject.getMsgId());
                        contentValuesA.put("module", messageObject.getModule());
                        contentValuesA.put("type", messageObject.getType());
                        long jInsertStorageData = insertStorageData("message", 1, contentValuesA);
                        if (jInsertStorageData > 0 && jInsertStorageData != 201000) {
                            LogUtil.a("UIDV_MessageDbProvider", "insert | insert a new message success");
                            z = true;
                        } else {
                            LogUtil.a("UIDV_MessageDbProvider", "insert | insert a new message failed");
                            z = false;
                        }
                    } else {
                        StringBuffer stringBuffer = new StringBuffer(16);
                        stringBuffer.append("msgId =? and module =? and type =? ");
                        long jUpdateStorageData = updateStorageData("message", 1, contentValuesA, stringBuffer.toString(), new String[]{phd.c(msgId), phd.c(messageObject.getModule()), phd.c(messageObject.getType())});
                        if (jUpdateStorageData > 0 && jUpdateStorageData != 201000) {
                            LogUtil.a("UIDV_MessageDbProvider", "insert | update content of message success");
                            z = true;
                        } else {
                            LogUtil.a("UIDV_MessageDbProvider", "insert | update content of message failed");
                            z = false;
                        }
                    }
                    if (z2) {
                        try {
                            sQLiteDatabaseE.setTransactionSuccessful();
                        } catch (SQLiteDatabaseLockedException e2) {
                            e = e2;
                            try {
                                ReleaseLogUtil.a("UIDV_MessageDbProvider", "requestMessageId, SQLiteDatabaseLockedException: ", LogAnonymous.b(e));
                                OpAnalyticsUtil.getInstance().sqliteDatabaseLockedExceptionSetEvent(e, "MessageDbProvider#insert");
                                if (z2 && sQLiteDatabaseE.inTransaction()) {
                                    sQLiteDatabaseE.endTransaction();
                                }
                                return z;
                            } catch (Throwable th) {
                                th = th;
                                z3 = z2;
                                z2 = z3;
                                if (z2 && sQLiteDatabaseE.inTransaction()) {
                                    sQLiteDatabaseE.endTransaction();
                                }
                                throw th;
                            }
                        }
                    }
                    if (z2 && sQLiteDatabaseE.inTransaction()) {
                        sQLiteDatabaseE.endTransaction();
                    }
                    return z;
                } catch (SQLiteDatabaseLockedException e3) {
                    e = e3;
                    z = false;
                }
            } catch (Throwable th2) {
                th = th2;
                if (z2) {
                    sQLiteDatabaseE.endTransaction();
                }
                throw th;
            }
        } catch (SQLiteDatabaseLockedException e4) {
            e = e4;
            z = false;
            z2 = false;
        } catch (Throwable th3) {
            th = th3;
            z2 = z3;
            if (z2) {
                sQLiteDatabaseE.endTransaction();
            }
            throw th;
        }
    }

    private void b(int i, MessageObject messageObject) {
        if (i < 14) {
            messageObject.setModule(String.valueOf(14));
        }
        if (i == 30 || i == 31 || i == 32) {
            messageObject.setModule(String.valueOf(30));
            messageObject.setMsgPosition(11);
        }
        if (i >= 35 && i <= 39) {
            messageObject.setModule(String.valueOf(30));
            messageObject.setDetailUriExt(String.valueOf(35));
            messageObject.setMsgPosition(11);
        }
        if (i == 40 || i == 50) {
            messageObject.setMsgPosition(11);
        }
        a(i, messageObject);
        if (messageObject.getMsgPosition() != 11 || MessageConstant.NPS_MESSAGE_TYPE.equals(messageObject.getType()) || MessageConstant.ACTIVE_TARGET_TYPE.equals(messageObject.getType())) {
            return;
        }
        messageObject.setExpireTime(0L);
    }

    private void a(int i, MessageObject messageObject) {
        if (i == 60) {
            messageObject.setModule(String.valueOf(51));
            messageObject.setDetailUriExt(String.valueOf(60));
            messageObject.setMsgPosition(11);
        }
        if (i == 61) {
            messageObject.setModule(String.valueOf(51));
            messageObject.setDetailUriExt(String.valueOf(61));
            messageObject.setMsgPosition(11);
        }
        if (i >= 62 && i <= 64) {
            messageObject.setModule(String.valueOf(51));
            messageObject.setDetailUriExt(String.valueOf(62));
            messageObject.setMsgPosition(11);
        }
        if (i < 53 || i > 54) {
            return;
        }
        messageObject.setModule(String.valueOf(51));
        messageObject.setDetailUriExt(String.valueOf(i));
        messageObject.setMsgPosition(11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public boolean e(List<MessageObject> list) {
        SQLiteDatabaseLockedException e2;
        int iA;
        ?? r0 = "insertMessages, SQLiteFullException: ";
        LogUtil.a("UIDV_MessageDbProvider", "Enter insertBatch ");
        if (list == null) {
            LogUtil.a("UIDV_MessageDbProvider", "insertBatch | MessageObject List is null.");
            return false;
        }
        ArrayList<String> arrayList = new ArrayList<>(16);
        SQLiteDatabase sQLiteDatabaseE = DataBaseHelper.d(String.valueOf(getModuleId())).e();
        try {
            if (sQLiteDatabaseE != null) {
                try {
                    sQLiteDatabaseE.beginTransaction();
                    iA = a(list, 0, arrayList);
                    try {
                        sQLiteDatabaseE.setTransactionSuccessful();
                        try {
                            sQLiteDatabaseE.endTransaction();
                        } catch (SQLiteFullException e3) {
                            ReleaseLogUtil.a("UIDV_MessageDbProvider", "insertMessages, SQLiteFullException: ", e3.getMessage());
                            r0 = 0;
                        }
                    } catch (SQLiteDatabaseLockedException e4) {
                        e2 = e4;
                        ReleaseLogUtil.a("UIDV_MessageDbProvider", "requestMessageId, SQLiteDatabaseLockedException: ", LogAnonymous.b(e2));
                        OpAnalyticsUtil.getInstance().sqliteDatabaseLockedExceptionSetEvent(e2, "MessageDbProvider#insertMessages");
                        try {
                            sQLiteDatabaseE.endTransaction();
                        } catch (SQLiteFullException e5) {
                            ReleaseLogUtil.a("UIDV_MessageDbProvider", "insertMessages, SQLiteFullException: ", e5.getMessage());
                            r0 = 0;
                        }
                    }
                } catch (SQLiteDatabaseLockedException e6) {
                    e2 = e6;
                    iA = 0;
                }
            } else {
                iA = 0;
            }
            r0 = 1;
            if (r0 != 0) {
                r0 = iA == list.size();
            }
            LogUtil.a("UIDV_MessageDbProvider", "insertBatch count = ", Integer.valueOf(iA), ", isAllInserted = ", Boolean.valueOf((boolean) r0));
            if (r0 != 0) {
                e(0, new MessageChangeEvent(arrayList, null));
            } else {
                e(-1, new MessageChangeEvent(arrayList, null));
            }
            LogUtil.a("UIDV_MessageDbProvider", "Leave insertBatch ");
            return r0;
        } catch (Throwable th) {
            try {
                sQLiteDatabaseE.endTransaction();
            } catch (SQLiteFullException e7) {
                ReleaseLogUtil.a("UIDV_MessageDbProvider", r0, e7.getMessage());
            }
            throw th;
        }
    }

    private int a(List<MessageObject> list, int i, ArrayList<String> arrayList) {
        for (MessageObject messageObject : list) {
            if (!phd.b(messageObject)) {
                LogUtil.a("UIDV_MessageDbProvider", "column check failed.");
            } else if (a(messageObject)) {
                i++;
                arrayList.add(messageObject.getMsgId());
            }
        }
        return i;
    }

    private void h() throws Throwable {
        LogUtil.a("UIDV_MessageDbProvider", "Enter insertBannerAndInfoMessage");
        long j = j();
        if (j <= 0) {
            j = g();
        }
        MessagePuller.getInstance().pullMessage(this.d, j, new PullMessageCallback() { // from class: pgy
            @Override // com.huawei.pluginmessagecenter.util.PullMessageCallback
            public final void pullMessageResult(int i, List list, List list2) {
                this.f45340c.b(i, list, list2);
            }
        });
    }

    /* synthetic */ void b(int i, List list, List list2) {
        LogUtil.d("UIDV_MessageDbProvider", "pullMessageResult: ", list, "result: ", Integer.valueOf(i));
        if (i != 200) {
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessageObject messageObject = (MessageObject) it.next();
            if (messageObject != null && phd.c(messageObject)) {
                arrayList.add(messageObject);
            }
        }
        LogUtil.a("UIDV_MessageDbProvider", "Leave insertBannerAndInfoMessage isSuccess :", Boolean.valueOf(e(arrayList)));
    }

    public int d(String str) {
        String huidOrDefault = LoginInit.getInstance(BaseApplication.getContext()).getHuidOrDefault();
        if (TextUtils.isEmpty(huidOrDefault)) {
            LogUtil.a("UIDV_MessageDbProvider", "deleteMessageById | delete message failed huid is null!");
            return -1;
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append("msgId =? and huid =? ");
        int iDeleteStorageData = deleteStorageData("message", 1, stringBuffer.toString(), new String[]{phd.c(str), phd.c(huidOrDefault)});
        if (iDeleteStorageData == 0) {
            ArrayList arrayList = new ArrayList(16);
            arrayList.add(str);
            e(0, new MessageChangeEvent(null, arrayList));
        }
        LogUtil.a("UIDV_MessageDbProvider", "deleteMessageById result = ", Integer.valueOf(iDeleteStorageData));
        return iDeleteStorageData;
    }

    public boolean e() {
        int iDeleteStorageData = deleteStorageData("message", 1, null);
        LogUtil.a("UIDV_MessageDbProvider", "deleteAllMessages | delete messages; resultCode = ", Integer.valueOf(iDeleteStorageData));
        return iDeleteStorageData == 0;
    }

    public void b() throws Throwable {
        LogUtil.a("UIDV_MessageDbProvider", "Enter doRefresh !");
        final long j = j();
        if (j < 0) {
            e(-1, new MessageChangeEvent(new ArrayList(16), new ArrayList(16)));
            LogUtil.a("UIDV_MessageDbProvider", "doRefresh because maxTime < 0 return!");
        } else {
            MessagePuller.getInstance().pullMessage(this.d, j, new PullMessageCallback() { // from class: phg
                @Override // com.huawei.pluginmessagecenter.util.PullMessageCallback
                public final void pullMessageResult(int i, List list, List list2) {
                    this.f45370b.a(j, i, list, list2);
                }
            });
            LogUtil.a("UIDV_MessageDbProvider", "Leave doRefresh !");
        }
    }

    /* synthetic */ void a(long j, int i, List list, List list2) {
        LogUtil.d("UIDV_MessageDbProvider", "pullMessageResult:", list, "result: ", Integer.valueOf(i));
        if (i == 200) {
            LogUtil.a("UIDV_MessageDbProvider", "pullMessageResult: insertBatch(list): ", Boolean.valueOf(e((List<MessageObject>) list)));
            if (j != 0) {
                a((List<String>) list2);
                return;
            }
            return;
        }
        e(i, new MessageChangeEvent(new ArrayList(16), new ArrayList(16)));
    }

    private void a(List<String> list) {
        LogUtil.a("UIDV_MessageDbProvider", "revokeList=", list);
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String str = "G" + it.next();
                if (b(str) != null) {
                    l(str);
                }
            }
        }
    }

    private void l(String str) {
        synchronized (e) {
            StringBuffer stringBuffer = new StringBuffer(16);
            stringBuffer.append("msgId =? ");
            int iDeleteStorageData = deleteStorageData("message", 1, stringBuffer.toString(), new String[]{phd.c(str)});
            LogUtil.a("UIDV_MessageDbProvider", "revokeMessage id=", str, " result=", Integer.valueOf(iDeleteStorageData));
            if (iDeleteStorageData == 0) {
                ArrayList arrayList = new ArrayList(16);
                arrayList.add(str);
                e(0, new MessageChangeEvent(null, arrayList));
            }
        }
    }

    public void d(MessageObserver messageObserver) {
        if (messageObserver == null) {
            LogUtil.a("UIDV_MessageDbProvider", "Observer object maybe not create.");
        } else {
            this.f45342b.addObservers(messageObserver);
        }
    }

    public void b(MessageObserver messageObserver) {
        if (messageObserver == null) {
            LogUtil.a("UIDV_MessageDbProvider", "Observer object maybe not create.");
        } else {
            this.f45342b.deleteObservers(messageObserver);
        }
    }

    public boolean c(String str) {
        LogUtil.a("UIDV_MessageDbProvider", "Enter onShowSmartCard msgId = ", str);
        if (str == null) {
            LogUtil.a("UIDV_MessageDbProvider", "onShowSmartCard(String msgId):msgId is null");
            return false;
        }
        if (b(str) == null) {
            LogUtil.a("UIDV_MessageDbProvider", "onShowSmartCard(String msgId):messageObject is null");
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUtil.READ_FLAG, (Integer) 2);
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append("msgId =? ");
        int iUpdateStorageData = updateStorageData("message", 1, contentValues, stringBuffer.toString(), new String[]{phd.c(str)});
        return iUpdateStorageData > 0 && iUpdateStorageData != 201000;
    }

    public boolean e(String str) throws Throwable {
        LogUtil.a("UIDV_MessageDbProvider", "Enter onRead msgId = ", str);
        if (str == null) {
            LogUtil.a("UIDV_MessageDbProvider", "onRead(String msgId):msgId is null");
            return false;
        }
        if (!str.matches("[a-zA-Z0-9]+")) {
            LogUtil.j("UIDV_MessageDbProvider", "msgId is wrong");
            return false;
        }
        MessageObject messageObjectB = b(str);
        if (messageObjectB == null) {
            LogUtil.a("UIDV_MessageDbProvider", "onRead(String msgId):messageObject is null");
            return false;
        }
        int msgType = messageObjectB.getMsgType();
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUtil.READ_FLAG, (Integer) 1);
        if (messageObjectB.getExpireTime() != 0) {
            if (msgType == 3) {
                contentValues.put("expireTime", Long.valueOf(phq.c(phq.a("23:59:59"))));
            } else if (msgType == 2) {
                contentValues.put("expireTime", (Integer) (-1));
            } else {
                LogUtil.a("UIDV_MessageDbProvider", "onRead(String msgId): msgType = ", Integer.valueOf(msgType));
            }
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append("msgId =? ");
        int iUpdateStorageData = updateStorageData("message", 1, contentValues, stringBuffer.toString(), new String[]{phd.c(str)});
        if (iUpdateStorageData <= 0 || iUpdateStorageData == 201000) {
            return false;
        }
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(str);
        e(0, new MessageChangeEvent(arrayList, null));
        LogUtil.a("UIDV_MessageDbProvider", "Leave onRead msgId = ", str);
        return true;
    }

    public void c() {
        LogUtil.a("UIDV_MessageDbProvider", "release()");
        MessageObserverController messageObserverController = this.f45342b;
        if (messageObserverController != null) {
            messageObserverController.clear();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0068  */
    private long g() throws Throwable {
        Cursor cursorRawQueryStorageData;
        long j;
        LogUtil.a("UIDV_MessageDbProvider", "Enter getMaxTime");
        String huidOrDefault = LoginInit.getInstance(BaseApplication.getContext()).getHuidOrDefault();
        if (TextUtils.isEmpty(huidOrDefault)) {
            LogUtil.e("UIDV_MessageDbProvider", "getMaxTime | huid is invalid");
            return -1L;
        }
        String str = "SELECT MAX(createTime) FROM " + getTableFullName("message") + " WHERE (huid =? or huid = '' )  and msgId like 'S%' or msgId like 'G%'";
        LogUtil.d("UIDV_MessageDbProvider", "getMaxTime | sql = ", str);
        try {
            cursorRawQueryStorageData = rawQueryStorageData(1, str, new String[]{phd.c(huidOrDefault)});
            if (cursorRawQueryStorageData != null) {
                try {
                    if (cursorRawQueryStorageData.moveToFirst()) {
                        j = cursorRawQueryStorageData.getLong(0);
                    } else {
                        j = 0;
                    }
                } catch (Throwable th) {
                    th = th;
                    a(cursorRawQueryStorageData);
                    throw th;
                }
            } else {
                j = 0;
            }
            a(cursorRawQueryStorageData);
            LogUtil.a("UIDV_MessageDbProvider", "Leave getMaxTime | getMaxTime = ", Long.valueOf(j));
            return j;
        } catch (Throwable th2) {
            th = th2;
            cursorRawQueryStorageData = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0068  */
    private long j() throws Throwable {
        Cursor cursorRawQueryStorageData;
        long j;
        LogUtil.a("UIDV_MessageDbProvider", "Enter getLatestGetMsgTimestamp");
        String huidOrDefault = LoginInit.getInstance(BaseApplication.getContext()).getHuidOrDefault();
        if (TextUtils.isEmpty(huidOrDefault)) {
            LogUtil.e("UIDV_MessageDbProvider", "getMaxTime | huid is invalid");
            return -1L;
        }
        String str = "SELECT MAX(reserveParamOne) FROM " + getTableFullName("message") + " WHERE (huid =? or huid = '' )  and msgId like 'S%' or msgId like 'G%'";
        LogUtil.d("UIDV_MessageDbProvider", "getLatestGetMsgTimestamp | sql = ", str);
        try {
            cursorRawQueryStorageData = rawQueryStorageData(1, str, new String[]{phd.c(huidOrDefault)});
            if (cursorRawQueryStorageData != null) {
                try {
                    if (cursorRawQueryStorageData.moveToFirst()) {
                        j = cursorRawQueryStorageData.getLong(0);
                    } else {
                        j = 0;
                    }
                } catch (Throwable th) {
                    th = th;
                    a(cursorRawQueryStorageData);
                    throw th;
                }
            } else {
                j = 0;
            }
            a(cursorRawQueryStorageData);
            LogUtil.a("UIDV_MessageDbProvider", "Leave getLatestGetMsgTimestamp | getLatestGetMsgTimestamp = ", Long.valueOf(j));
            return j;
        } catch (Throwable th2) {
            th = th2;
            cursorRawQueryStorageData = null;
        }
    }

    private List<MessageObject> c(String str, String str2, String str3) {
        LogUtil.a("UIDV_MessageDbProvider", "Enter queryAll");
        ArrayList arrayList = new ArrayList(16);
        String[] strArr = {phd.c(str), phd.c(str2)};
        String[] strArr2 = {phd.c(str), phd.c(str2), phd.c(str2 + "_" + str3)};
        String strM = m(str3);
        if (!TextUtils.isEmpty(str3)) {
            strArr = strArr2;
        }
        Cursor cursorRawQueryStorageData = rawQueryStorageData(1, strM, strArr);
        if (cursorRawQueryStorageData == null) {
            LogUtil.j("UIDV_MessageDbProvider", "queryAll cursor == null ");
            return arrayList;
        }
        try {
            try {
                e(arrayList, cursorRawQueryStorageData, !"".equals(str));
            } catch (SQLException e2) {
                LogUtil.e("UIDV_MessageDbProvider", "queryAll exception : ", ExceptionUtils.c(e2));
            }
            a(cursorRawQueryStorageData);
            LogUtil.a("UIDV_MessageDbProvider", "Leave queryAll messageObjects.size = ", Integer.valueOf(arrayList.size()));
            return arrayList;
        } catch (Throwable th) {
            a(cursorRawQueryStorageData);
            throw th;
        }
    }

    private void e(List<MessageObject> list, Cursor cursor, boolean z) {
        while (cursor.moveToNext()) {
            MessageObject messageObjectD = phd.d(cursor);
            if (messageObjectD != null) {
                String strNormalize = Normalizer.normalize(messageObjectD.getMsgId(), Normalizer.Form.NFKC);
                if (!Utils.h() && strNormalize != null && (strNormalize.startsWith(ExifInterface.LATITUDE_SOUTH) || strNormalize.startsWith("G"))) {
                    LogUtil.d("UIDV_MessageDbProvider", "queryAll | messageObject contains S G");
                } else if (!phd.e(messageObjectD)) {
                    String type = messageObjectD.getType();
                    if (!MessageConstant.ACTIVE_TARGET_TYPE.equals(type) || phd.d(messageObjectD)) {
                        if (!z && CommonUtil.CLOUD_SERVICE_MESSAGE_VALUE.equals(type)) {
                            LogUtil.a("UIDV_MessageDbProvider", "queryAll | messageObject type = ", CommonUtil.CLOUD_SERVICE_MESSAGE_VALUE);
                        } else {
                            list.add(messageObjectD);
                        }
                    }
                }
            }
        }
    }

    private String m(String str) {
        StringBuilder sb = new StringBuilder(16);
        sb.append("select * from ");
        sb.append(getTableFullName("message"));
        sb.append(" where ( huid =? or huid = '') and (imei =? or ");
        if (!TextUtils.isEmpty(str)) {
            sb.append("imei =? or ");
        }
        sb.append("imei is null or imei = '') order by receiveTime");
        return sb.toString();
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public final Integer getModuleId() {
        return 20005;
    }

    public void i(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("UIDV_MessageDbProvider", "setNotify | msgId = ", str);
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUtil.MSG_NOTIFY, (Integer) 1);
        LogUtil.d("UIDV_MessageDbProvider", "setNotify | whereSql = ", "msgId = '" + str + "'");
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append("msgId =? ");
        LogUtil.a("UIDV_MessageDbProvider", "setNotify | updateStorageData = ", Integer.valueOf(updateStorageData("message", 1, contentValues, stringBuffer.toString(), new String[]{phd.c(str)})));
    }

    public MessageObject b(String str) throws Throwable {
        Cursor cursor = null;
        messageObjectD = null;
        MessageObject messageObjectD = null;
        try {
            Cursor cursorRawQueryStorageData = rawQueryStorageData(1, "select * from " + getTableFullName("message") + " where msgId =? ", new String[]{phd.c(str)});
            if (cursorRawQueryStorageData != null) {
                try {
                    if (cursorRawQueryStorageData.moveToFirst()) {
                        messageObjectD = phd.d(cursorRawQueryStorageData);
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorRawQueryStorageData;
                    a(cursor);
                    throw th;
                }
            }
            a(cursorRawQueryStorageData);
            return messageObjectD;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public List<MessageObject> d(String str, String str2) {
        ArrayList arrayList = new ArrayList(16);
        Cursor cursorRawQueryStorageData = null;
        try {
            cursorRawQueryStorageData = rawQueryStorageData(1, "select * from " + getTableFullName("message") + " where module =? and type =? ", new String[]{phd.c(str), phd.c(str2)});
            e(arrayList, cursorRawQueryStorageData);
            return arrayList;
        } catch (SQLiteException e2) {
            ReleaseLogUtil.a("UIDV_MessageDbProvider", "SQLiteDatabaseCorruptException,message:", e2.getMessage());
            return arrayList;
        } finally {
            a(cursorRawQueryStorageData);
        }
    }

    private void e(List<MessageObject> list, Cursor cursor) {
        if (cursor != null) {
            while (cursor.moveToNext()) {
                MessageObject messageObjectD = phd.d(cursor);
                if (messageObjectD != null) {
                    list.add(messageObjectD);
                }
            }
        }
    }

    private void a(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    public List<MessageObject> b(String str, String str2, String str3, int i, int i2) {
        LogUtil.a("UIDV_MessageDbProvider", "Enter getMessageList");
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("UIDV_MessageDbProvider", "getMessageList | huid is null");
            return new ArrayList();
        }
        if (str2 == null) {
            str2 = "";
        }
        if (i == 0 && i2 == 0) {
            return c(str, str2, str3);
        }
        int i3 = (i - 1) * i2;
        String[] strArr = {phd.c(str), phd.c(str2), phd.c(Integer.valueOf(i3)), phd.c(Integer.valueOf(i2))};
        String[] strArr2 = {phd.c(str), phd.c(str2), phd.c(str2 + "_" + str3), phd.c(Integer.valueOf(i3)), phd.c(Integer.valueOf(i2))};
        String strK = k(str3);
        ArrayList arrayList = new ArrayList(16);
        Cursor cursorRawQueryStorageData = null;
        try {
            if (!TextUtils.isEmpty(str3)) {
                strArr = strArr2;
            }
            cursorRawQueryStorageData = rawQueryStorageData(1, strK, strArr);
            d(cursorRawQueryStorageData, arrayList);
            return arrayList;
        } catch (SQLiteException e2) {
            ReleaseLogUtil.a("UIDV_MessageDbProvider", "SQLiteDatabaseCorruptException,message:", e2.getMessage());
            return arrayList;
        } finally {
            a(cursorRawQueryStorageData);
        }
    }

    private void d(Cursor cursor, List<MessageObject> list) {
        if (cursor != null) {
            while (cursor.moveToNext()) {
                MessageObject messageObjectD = phd.d(cursor);
                if (messageObjectD != null) {
                    list.add(messageObjectD);
                }
            }
        }
    }

    private String k(String str) {
        StringBuilder sb = new StringBuilder(16);
        sb.append("select * from ");
        sb.append(getTableFullName("message"));
        sb.append(" where ( huid =? or huid = '') and (imei =? or ");
        if (!TextUtils.isEmpty(str)) {
            sb.append("imei =? or ");
        }
        sb.append("imei is null or imei = '') order by weight desc, receiveTime desc limit ?,? ");
        return sb.toString();
    }

    public void a(String str) {
        if (str == null) {
            return;
        }
        LogUtil.a("UIDV_MessageDbProvider", "save uid result = ", Integer.valueOf(setSharedPreference(CommonUtil.KEY_LAST_HUID, str, new StorageParams(1))));
    }

    public void j(String str) {
        if (str == null) {
            return;
        }
        LogUtil.a("UIDV_MessageDbProvider", "save language result = ", Integer.valueOf(setSharedPreference(CommonUtil.KEY_LAST_LANGUAGE, str, new StorageParams(1))));
    }

    public void f(String str) {
        if (str == null) {
            return;
        }
        LogUtil.a("UIDV_MessageDbProvider", "save push pushToken result = ", Integer.valueOf(setSharedPreference(CommonUtil.PUSH_TOKEN, str, new StorageParams(1))));
    }

    public void g(String str) {
        if (str == null) {
            return;
        }
        LogUtil.a("UIDV_MessageDbProvider", "save push uid result = ", Integer.valueOf(setSharedPreference(CommonUtil.KEY_PUSH_HUID, str, new StorageParams(1))));
    }

    public void h(String str) {
        LogUtil.a("UIDV_MessageDbProvider", "save device result = ", Integer.valueOf(setSharedPreference(CommonUtil.KEY_CURRENT_DEVICE_ID, str, new StorageParams(1))));
    }

    public String d() {
        return getSharedPreference(CommonUtil.KEY_LAST_LANGUAGE);
    }
}
