package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.hwsmartinteractmgr.data.SmartMsgDbObject;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.DbManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class nsv extends HwBaseManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile nsv f43623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ContentResolver f43624c;
    private Context d;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f43622a = Uri.parse(DbManager.e + "module_20009_smart_msg");

    private boolean c(char c2) {
        return c2 == '0' || c2 == '1';
    }

    private nsv(Context context) {
        super(context);
        this.d = context.getApplicationContext();
        synchronized (e) {
            f43624c = this.d.getContentResolver();
        }
        lsy.a(new Runnable() { // from class: nsv.4
            @Override // java.lang.Runnable
            public void run() {
                nsv.this.b();
            }
        });
    }

    public static nsv e(Context context) {
        if (f43623b == null) {
            synchronized (e) {
                if (f43623b == null) {
                    if (context == null) {
                        f43623b = new nsv(BaseApplication.getContext());
                    } else {
                        f43623b = new nsv(context);
                    }
                }
            }
        }
        return f43623b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        LogUtil.a("SmartCenterDbManager", "createTable | create new table: ", getTableFullName(SmartMsgConstant.TABLE_NAME));
        createStorageDataTable(SmartMsgConstant.TABLE_NAME, 2, "id integer primary key autoincrement,msgType integer not null check(msgType >= 10000),msgSrc integer not null check(msgSrc > 0),msgContentType integer not null check(msgContentType > 0),msgContent text not null,showMethod text,createTime integer not null,updateTime integer,expireTime integer,status integer not null check(status > 0),huid text,showTime text,priority integer not null,showCount integer default 0");
    }

    public boolean e(SmartMsgDbObject smartMsgDbObject) {
        synchronized (e) {
            LogUtil.a("SmartCenterDbManager", "Enter insert | Message: ");
            if (d(smartMsgDbObject) != 0) {
                return false;
            }
            smartMsgDbObject.setHuid(LoginInit.getInstance(this.d).getAccountInfo(1011));
            if (insertStorageData(SmartMsgConstant.TABLE_NAME, 2, a(smartMsgDbObject)) == 0) {
                LogUtil.a("SmartCenterDbManager", "insert | insert a new message success");
                return true;
            }
            LogUtil.a("SmartCenterDbManager", "insert | insert a new message failed");
            return false;
        }
    }

    public boolean b(int i, SmartMsgDbObject smartMsgDbObject) {
        synchronized (e) {
            LogUtil.a("SmartCenterDbManager", "Enter deleteMessageById");
            if (smartMsgDbObject == null) {
                return false;
            }
            ContentValues contentValuesA = a(smartMsgDbObject);
            contentValuesA.remove("createTime");
            contentValuesA.remove("huid");
            if (updateStorageData(SmartMsgConstant.TABLE_NAME, 2, contentValuesA, "id = '" + i + "'") == 0) {
                LogUtil.a("SmartCenterDbManager", "insert | update content of message success");
                return true;
            }
            LogUtil.a("SmartCenterDbManager", "insert | update content of message failed");
            return false;
        }
    }

    public boolean d(int i, ContentValues contentValues) {
        synchronized (e) {
            LogUtil.a("SmartCenterDbManager", "Enter deleteMessageById");
            if (contentValues == null) {
                return false;
            }
            contentValues.put("updateTime", Long.valueOf(System.currentTimeMillis()));
            if (updateStorageData(SmartMsgConstant.TABLE_NAME, 2, contentValues, "id = '" + i + "'") == 0) {
                LogUtil.a("SmartCenterDbManager", "insert | update content of message success");
                return true;
            }
            LogUtil.a("SmartCenterDbManager", "insert | update content of message failed");
            return false;
        }
    }

    public int d(int i) {
        int iDeleteStorageData;
        synchronized (e) {
            LogUtil.a("SmartCenterDbManager", "Enter deleteMessageById");
            iDeleteStorageData = deleteStorageData(SmartMsgConstant.TABLE_NAME, 2, "msgType = '" + i + "'");
            if (iDeleteStorageData == 0) {
                LogUtil.a("SmartCenterDbManager", "deleteMessageById success");
            }
        }
        return iDeleteStorageData;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a A[Catch: all -> 0x0065, PHI: r4
      0x005a: PHI (r4v3 android.database.Cursor) = (r4v2 android.database.Cursor), (r4v4 android.database.Cursor) binds: [B:23:0x0058, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000e, B:7:0x0019, B:25:0x005d, B:24:0x005a, B:28:0x0061, B:29:0x0064, B:10:0x001c, B:12:0x002e, B:14:0x0034, B:16:0x0044, B:22:0x004d), top: B:33:0x0003, inners: #2 }] */
    public List<SmartMsgDbObject> a(String str, int i) {
        synchronized (e) {
            ArrayList arrayList = new ArrayList(10);
            if (str == null) {
                LogUtil.e("SmartCenterDbManager", "huid = null");
                return arrayList;
            }
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = f43624c.query(f43622a, null, "huid=?", new String[]{str}, null);
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            SmartMsgDbObject smartMsgDbObjectA = a(cursorQuery);
                            if (smartMsgDbObjectA.getShowMethod().charAt(i) == '1') {
                                arrayList.add(smartMsgDbObjectA);
                            }
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (SQLException unused) {
                    LogUtil.e("SmartCenterDbManager", "getMessageByMode queryStorage error");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        }
    }

    private int d(SmartMsgDbObject smartMsgDbObject) {
        if (smartMsgDbObject == null) {
            LogUtil.e("SmartCenterDbManager", "messageObject null");
            return -1;
        }
        if (smartMsgDbObject.getShowTime() == null) {
            return -1;
        }
        if (smartMsgDbObject.getShowTime().length() % 8 != 0) {
            LogUtil.e("SmartCenterDbManager", "getShowTime error");
            return -1;
        }
        String showMethod = smartMsgDbObject.getShowMethod();
        if (showMethod == null || showMethod.length() != 6) {
            LogUtil.e("SmartCenterDbManager", "getShowMethod error");
            return -1;
        }
        if (!c(showMethod.charAt(0))) {
            LogUtil.e("SmartCenterDbManager", "getShowMethod().charAt(0) error");
            return -1;
        }
        if (!c(showMethod.charAt(1))) {
            LogUtil.e("SmartCenterDbManager", "getShowMethod().charAt(1) error");
            return -1;
        }
        if (c(showMethod.charAt(2))) {
            return 0;
        }
        LogUtil.e("SmartCenterDbManager", "getShowMethod().charAt(2) error");
        return -1;
    }

    private SmartMsgDbObject a(Cursor cursor) {
        SmartMsgDbObject smartMsgDbObject = new SmartMsgDbObject();
        smartMsgDbObject.setId(cursor.getInt(cursor.getColumnIndex("id")));
        smartMsgDbObject.setMsgType(cursor.getInt(cursor.getColumnIndex("msgType")));
        smartMsgDbObject.setMsgSrc(cursor.getInt(cursor.getColumnIndex(SmartMsgConstant.MSG_SRC)));
        smartMsgDbObject.setMsgContentType(cursor.getInt(cursor.getColumnIndex(SmartMsgConstant.MSG_CONTENT_TYPE)));
        smartMsgDbObject.setMsgContent(cursor.getString(cursor.getColumnIndex("msgContent")));
        smartMsgDbObject.setShowMethod(cursor.getString(cursor.getColumnIndex(SmartMsgConstant.MSG_SHOW_METHOD)));
        smartMsgDbObject.setCreateTime(cursor.getLong(cursor.getColumnIndex("createTime")));
        smartMsgDbObject.setUpdateTime(cursor.getLong(cursor.getColumnIndex("updateTime")));
        smartMsgDbObject.setExpireTime(cursor.getLong(cursor.getColumnIndex("expireTime")));
        smartMsgDbObject.setStatus(cursor.getInt(cursor.getColumnIndex("status")));
        smartMsgDbObject.setHuid(cursor.getString(cursor.getColumnIndex("huid")));
        smartMsgDbObject.setShowTime(cursor.getString(cursor.getColumnIndex(SmartMsgConstant.MSG_SHOW_TIME)));
        smartMsgDbObject.setMessagePriority(cursor.getInt(cursor.getColumnIndex("priority")));
        smartMsgDbObject.setShowCount(cursor.getInt(cursor.getColumnIndex(SmartMsgConstant.MSG_SHOW_COUNT)));
        return smartMsgDbObject;
    }

    private ContentValues a(SmartMsgDbObject smartMsgDbObject) {
        ContentValues contentValues = new ContentValues();
        if (smartMsgDbObject == null) {
            return contentValues;
        }
        contentValues.put("msgType", Integer.valueOf(smartMsgDbObject.getMsgType()));
        contentValues.put(SmartMsgConstant.MSG_SRC, Integer.valueOf(smartMsgDbObject.getMsgSrc()));
        contentValues.put(SmartMsgConstant.MSG_CONTENT_TYPE, Integer.valueOf(smartMsgDbObject.getMsgContentType()));
        contentValues.put("msgContent", smartMsgDbObject.getMsgContent());
        contentValues.put(SmartMsgConstant.MSG_SHOW_METHOD, smartMsgDbObject.getShowMethod());
        contentValues.put("createTime", Long.valueOf(System.currentTimeMillis()));
        if (smartMsgDbObject.getUpdateTime() > 0) {
            contentValues.put("updateTime", Long.valueOf(smartMsgDbObject.getUpdateTime()));
        } else {
            contentValues.put("updateTime", Long.valueOf(System.currentTimeMillis()));
        }
        contentValues.put("expireTime", Long.valueOf(smartMsgDbObject.getExpireTime()));
        contentValues.put("status", Integer.valueOf(smartMsgDbObject.getStatus()));
        contentValues.put("huid", smartMsgDbObject.getHuid());
        contentValues.put(SmartMsgConstant.MSG_SHOW_TIME, smartMsgDbObject.getShowTime());
        contentValues.put("priority", Integer.valueOf(smartMsgDbObject.getMessagePriority()));
        contentValues.put(SmartMsgConstant.MSG_SHOW_COUNT, Integer.valueOf(smartMsgDbObject.getShowCount()));
        return contentValues;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 20009;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0081 A[Catch: all -> 0x008f, PHI: r4 r13
      0x0081: PHI (r4v3 com.huawei.hwsmartinteractmgr.data.SmartMsgDbObject) = 
      (r4v8 com.huawei.hwsmartinteractmgr.data.SmartMsgDbObject)
      (r4v10 com.huawei.hwsmartinteractmgr.data.SmartMsgDbObject)
      (r4v11 com.huawei.hwsmartinteractmgr.data.SmartMsgDbObject)
      (r4v6 com.huawei.hwsmartinteractmgr.data.SmartMsgDbObject)
     binds: [B:25:0x005b, B:30:0x0072, B:33:0x007f, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r13v12 android.database.Cursor) = 
      (r13v9 android.database.Cursor)
      (r13v10 android.database.Cursor)
      (r13v11 android.database.Cursor)
      (r13v14 android.database.Cursor)
     binds: [B:25:0x005b, B:30:0x0072, B:33:0x007f, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #8 {, blocks: (B:4:0x0003, B:6:0x0014, B:7:0x001f, B:35:0x0084, B:34:0x0081, B:40:0x008b, B:41:0x008e), top: B:48:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x008b A[Catch: all -> 0x008f, TryCatch #8 {, blocks: (B:4:0x0003, B:6:0x0014, B:7:0x001f, B:35:0x0084, B:34:0x0081, B:40:0x008b, B:41:0x008e), top: B:48:0x0003 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public SmartMsgDbObject a(int i) {
        Cursor cursorQuery;
        IllegalArgumentException e2;
        synchronized (e) {
            String accountInfo = LoginInit.getInstance(this.d).getAccountInfo(1011);
            ?? r4 = 0;
            smartMsgDbObjectA = null;
            smartMsgDbObjectA = null;
            smartMsgDbObjectA = null;
            smartMsgDbObjectA = null;
            smartMsgDbObjectA = null;
            smartMsgDbObjectA = null;
            smartMsgDbObjectA = null;
            SmartMsgDbObject smartMsgDbObjectA = null;
            if (accountInfo == null) {
                LogUtil.a("SmartCenterDbManager", "getMessageByType huid is null");
                return null;
            }
            try {
                try {
                    cursorQuery = f43624c.query(f43622a, null, "msgType=? and huid=?", new String[]{String.valueOf((int) i), accountInfo}, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                smartMsgDbObjectA = a(cursorQuery);
                            }
                        } catch (SQLException unused) {
                            LogUtil.e("SmartCenterDbManager", "getMessageByType queryStorage error");
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        } catch (IllegalArgumentException e3) {
                            e2 = e3;
                            LogUtil.e("SmartCenterDbManager", "getMessageByType IllegalArgumentException ", e2.getMessage());
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        } catch (Exception unused2) {
                            LogUtil.e("SmartCenterDbManager", "getMessageByType Exception.");
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th) {
                    r4 = i;
                    th = th;
                    if (r4 != 0) {
                        r4.close();
                    }
                    throw th;
                }
            } catch (SQLException unused3) {
                cursorQuery = null;
            } catch (IllegalArgumentException e4) {
                e2 = e4;
                cursorQuery = null;
            } catch (Exception unused4) {
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (r4 != 0) {
                    r4.close();
                }
                throw th;
            }
            return smartMsgDbObjectA;
        }
    }
}
