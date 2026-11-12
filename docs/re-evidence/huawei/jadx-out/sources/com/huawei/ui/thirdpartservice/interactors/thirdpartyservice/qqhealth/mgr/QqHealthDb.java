package com.huawei.ui.thirdpartservice.interactors.thirdpartyservice.qqhealth.mgr;

import android.content.ContentValues;
import android.database.Cursor;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes20.dex */
public class QqHealthDb {
    private static final String COLUMN_EXPIRES_IN = "expires_in";
    private static final String COLUMN_NICK_NAME = "nickname";
    private static final String COLUMN_OPEN_ID = "openid";
    private static final String COLUMN_QQ_LOGO_PATH = "qqlogopath";
    private static final String COLUMN_SPLIT = ",";
    private static final String COLUMN_TOKEN = "token";
    private static final String DATABASE_TABLE = "qqhealth";
    public static final int INVALID_VALUE = -1;
    private static final String MAX_CHAR_LENGTH = " varchar(3000)";
    private static final String TAG = "QqHealthDb";
    private static String sCreateTableSql;
    private QqHealthMgr mQqHealthMgr;

    static {
        StringBuilder sb = new StringBuilder(16);
        sb.append("openid varchar(3000),token varchar(3000),expires_in varchar(3000),nickname varchar(3000),qqlogopath varchar(3000)");
        sCreateTableSql = sb.toString();
    }

    public QqHealthDb() {
        QqHealthMgr qqHealthMgr = QqHealthMgr.getInstance();
        this.mQqHealthMgr = qqHealthMgr;
        qqHealthMgr.create(DATABASE_TABLE, 1, sCreateTableSql);
    }

    public long insert(QqHealthTable qqHealthTable) {
        if (qqHealthTable == null) {
            LogUtil.a(TAG, "insert() healthTable == null");
            return -1L;
        }
        long jInsert = this.mQqHealthMgr.insert(DATABASE_TABLE, 1, getContentValues(qqHealthTable));
        LogUtil.a(TAG, "insert() result = ", Long.valueOf(jInsert));
        return jInsert;
    }

    public int delete() {
        int iDelete = this.mQqHealthMgr.delete(DATABASE_TABLE, 1, null);
        LogUtil.a(TAG, "delete() result = ", Integer.valueOf(iDelete));
        return iDelete;
    }

    private ContentValues getContentValues(QqHealthTable qqHealthTable) {
        ContentValues contentValues = new ContentValues();
        if (qqHealthTable != null) {
            contentValues.put("openid", qqHealthTable.getOpenId());
            contentValues.put("token", qqHealthTable.getToken());
            contentValues.put("expires_in", qqHealthTable.getExpireTime());
            contentValues.put(COLUMN_NICK_NAME, qqHealthTable.getNickName());
            contentValues.put(COLUMN_QQ_LOGO_PATH, qqHealthTable.getQqLogoPath());
        }
        LogUtil.d(TAG, "initialValues = ", contentValues);
        return contentValues;
    }

    public int update(QqHealthTable qqHealthTable) {
        if (qqHealthTable == null) {
            LogUtil.a(TAG, "update() healthTable == null");
            return -1;
        }
        int iUpdate = this.mQqHealthMgr.update(DATABASE_TABLE, 1, getContentValues(qqHealthTable), "token=" + qqHealthTable.getToken() + " and openid like '" + qqHealthTable.getOpenId() + "'");
        LogUtil.a(TAG, "update() result = ", Integer.valueOf(iUpdate));
        return iUpdate;
    }

    public QqHealthTable get() {
        QqHealthTable qqHealthTable = new QqHealthTable();
        Cursor cursorQueryStorageData = this.mQqHealthMgr.queryStorageData(DATABASE_TABLE, 1, null);
        if (cursorQueryStorageData != null) {
            try {
                if (cursorQueryStorageData.getCount() != 0) {
                    if (cursorQueryStorageData.moveToFirst()) {
                        qqHealthTable.setOpenId(cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("openid")));
                        qqHealthTable.setToken(cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("token")));
                        qqHealthTable.setExpireTime(cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("expires_in")));
                        qqHealthTable.setNickName(cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex(COLUMN_NICK_NAME)));
                        qqHealthTable.setQqLogoPath(cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex(COLUMN_QQ_LOGO_PATH)));
                    }
                    if (cursorQueryStorageData != null) {
                        cursorQueryStorageData.close();
                    }
                    return qqHealthTable;
                }
            } catch (Throwable th) {
                if (cursorQueryStorageData != null) {
                    try {
                        cursorQueryStorageData.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        LogUtil.a(TAG, "get() query failed");
        if (cursorQueryStorageData != null) {
            cursorQueryStorageData.close();
        }
        return null;
    }
}
