package com.huawei.health.featuremarketing.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.text.TextUtils;
import com.huawei.common.util.Utils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;

/* JADX INFO: loaded from: classes28.dex */
public class MarketingDataDbManager extends MarketingDbMgr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile MarketingDataDbManager f6685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f6686b;

    public MarketingDataDbManager(Context context) {
        super(context.getApplicationContext());
        this.f6686b = context.getApplicationContext();
    }

    public static MarketingDataDbManager e(Context context) {
        if (f6685a == null) {
            synchronized (MarketingDataDbManager.class) {
                if (f6685a == null) {
                    f6685a = new MarketingDataDbManager(context);
                }
            }
        }
        return f6685a;
    }

    public long a(int i, String str, long j) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("MarketingDataDbManager", "InsertData is null.");
            return -1L;
        }
        if (e(i) != null) {
            LogUtil.a("MarketingDataDbManager", "data save before, update data. positionId: ", Integer.valueOf(i));
            return d(i, str, j);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("positionId", d(i));
        contentValues.put("data", str);
        contentValues.put("latestModifyTime", Long.valueOf(j));
        return MarketingDbMgr.c(this.f6686b).insertStorageData("marketing_data", 1, contentValues) - 1;
    }

    public long d(int i, String str, long j) {
        if (str.isEmpty()) {
            LogUtil.d("MarketingDataDbManager", "update value null");
            return -1L;
        }
        try {
            LogUtil.a("MarketingDataDbManager", "update result=", Integer.valueOf(MarketingDbMgr.c(this.f6686b).updateStorageData("marketing_data", 1, e(i, str, j), "positionId=?", new String[]{d(i)})));
            return -1L;
        } catch (NumberFormatException e) {
            LogUtil.e("MarketingDataDbManager", "update error: ", e.getMessage());
            return 201000L;
        }
    }

    public String e(int i) throws Throwable {
        String str;
        Throwable th;
        Cursor cursorRawQueryStorageData;
        Cursor cursor = null;
        string = null;
        String string = null;
        cursor = null;
        try {
            try {
                String str2 = "select *  from " + MarketingDbMgr.c(this.f6686b).getTableFullName("marketing_data") + " where positionId=?";
                LogUtil.d("MarketingDataDbManager", "query selection=", str2);
                cursorRawQueryStorageData = MarketingDbMgr.c(this.f6686b).rawQueryStorageData(1, str2, new String[]{d(i)});
                if (cursorRawQueryStorageData != null) {
                    while (cursorRawQueryStorageData.moveToNext()) {
                        try {
                            string = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("data"));
                        } catch (SQLException unused) {
                            String str3 = string;
                            cursor = cursorRawQueryStorageData;
                            str = str3;
                            LogUtil.e("MarketingDataDbManager", "queryStorage error: ");
                            if (cursor != null) {
                                cursor.close();
                            }
                            return str;
                        } catch (Exception unused2) {
                            String str4 = string;
                            cursor = cursorRawQueryStorageData;
                            str = str4;
                            LogUtil.e("MarketingDataDbManager", "Exception error.");
                            if (cursor != null) {
                                cursor.close();
                            }
                            return str;
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursorRawQueryStorageData != null) {
                                cursorRawQueryStorageData.close();
                            }
                            throw th;
                        }
                    }
                }
                if (cursorRawQueryStorageData != null) {
                    cursorRawQueryStorageData.close();
                }
                return string;
            } catch (Throwable th3) {
                th = th3;
                cursorRawQueryStorageData = null;
            }
        } catch (SQLException unused3) {
            str = null;
        } catch (Exception unused4) {
            str = null;
        }
    }

    private ContentValues e(int i, String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("positionId", d(i));
        contentValues.put("data", str);
        contentValues.put("latestModifyTime", Long.valueOf(j));
        return contentValues;
    }

    private String d(int i) {
        if (LoginInit.getInstance(this.f6686b).isBrowseMode()) {
            return i + "_" + Utils.getCountryCode();
        }
        return i + "_" + LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1011);
    }
}
