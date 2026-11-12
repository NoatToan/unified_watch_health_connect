package com.huawei.health.featuremarketing.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import com.huawei.health.marketing.datatype.MarketingEventInfo;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class MarketingEventDbMgr extends MarketingDbMgr {
    private static volatile MarketingEventDbMgr e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f6688c;

    public MarketingEventDbMgr(Context context) {
        super(context);
        this.f6688c = context;
    }

    public static MarketingEventDbMgr b(Context context) {
        if (e == null) {
            synchronized (MarketingEventDbMgr.class) {
                if (e == null) {
                    e = new MarketingEventDbMgr(context);
                }
            }
        }
        return e;
    }

    public long a(MarketingEventInfo marketingEventInfo) {
        if (marketingEventInfo == null) {
            LogUtil.d("MarketingEventDbMgr", "marketingEventInfo is null.");
            return -1L;
        }
        return MarketingDbMgr.c(this.f6688c).insertStorageData("marketing_trigger_event", 1, e(marketingEventInfo)) - 1;
    }

    public MarketingEventInfo d(String str, int i, String str2) throws Throwable {
        MarketingEventInfo marketingEventInfoBuild;
        Cursor cursorRawQueryStorageData;
        Cursor cursor = null;
        marketingEventInfoBuild = null;
        MarketingEventInfo marketingEventInfoBuild2 = null;
        cursor = null;
        try {
            try {
                String str3 = "select *  from " + MarketingDbMgr.c(this.f6688c).getTableFullName("marketing_trigger_event") + " where huid =? and positionId=? and resourceId=?";
                LogUtil.d("MarketingEventDbMgr", "query selection=", str3);
                cursorRawQueryStorageData = MarketingDbMgr.c(this.f6688c).rawQueryStorageData(1, str3, new String[]{str, String.valueOf(i), str2});
                if (cursorRawQueryStorageData != null) {
                    while (cursorRawQueryStorageData.moveToNext()) {
                        try {
                            marketingEventInfoBuild2 = new MarketingEventInfo.Builder().setHuId(str).setPositionId(i).setTypeId(cursorRawQueryStorageData.getColumnIndex("typeId")).setResourceId(str2).setTriggerTime(cursorRawQueryStorageData.getLong(cursorRawQueryStorageData.getColumnIndex("triggerTime"))).setValue(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("value"))).build();
                        } catch (SQLException unused) {
                            marketingEventInfoBuild = marketingEventInfoBuild2;
                            cursor = cursorRawQueryStorageData;
                            LogUtil.e("MarketingEventDbMgr", "queryStorage error: ");
                            if (cursor != null) {
                                cursor.close();
                            }
                            return marketingEventInfoBuild;
                        } catch (Exception unused2) {
                            cursor = cursorRawQueryStorageData;
                            LogUtil.e("MarketingEventDbMgr", "queryStorage error Exception. set default info.");
                            marketingEventInfoBuild = new MarketingEventInfo.Builder().setHuId(str).setPositionId(i).setResourceId(str2).build();
                            if (cursor != null) {
                                cursor.close();
                            }
                            return marketingEventInfoBuild;
                        } catch (Throwable th) {
                            th = th;
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
                return marketingEventInfoBuild2;
            } catch (Throwable th2) {
                th = th2;
                cursorRawQueryStorageData = null;
            }
        } catch (SQLException unused3) {
            marketingEventInfoBuild = null;
        } catch (Exception unused4) {
        }
    }

    public List<MarketingEventInfo> b(String str, int i, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQueryStorageData = null;
        try {
            try {
                String str4 = "select *  from " + MarketingDbMgr.c(this.f6688c).getTableFullName("marketing_trigger_event") + " where huid =? and positionId=? and resourceId=?" + str3;
                LogUtil.d("MarketingEventDbMgr", "cursor query selection=", str4);
                cursorRawQueryStorageData = MarketingDbMgr.c(this.f6688c).rawQueryStorageData(1, str4, new String[]{str, String.valueOf(i), str2});
                if (cursorRawQueryStorageData != null) {
                    LogUtil.a("MarketingEventDbMgr", "cursor is not null");
                    while (cursorRawQueryStorageData.moveToNext()) {
                        LogUtil.a("MarketingEventDbMgr", "cursor move to next");
                        arrayList.add(new MarketingEventInfo.Builder().setHuId(str).setPositionId(i).setTypeId(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("typeId"))).setResourceId(str2).setTriggerTime(cursorRawQueryStorageData.getLong(cursorRawQueryStorageData.getColumnIndex("triggerTime"))).setValue(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("value"))).build());
                    }
                }
                if (cursorRawQueryStorageData != null) {
                    return arrayList;
                }
            } catch (SQLException unused) {
                LogUtil.e("MarketingEventDbMgr", "queryStorage error: ");
            }
            return arrayList;
        } finally {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        }
    }

    private ContentValues e(MarketingEventInfo marketingEventInfo) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("huid", marketingEventInfo.getHuId());
        contentValues.put("positionId", Integer.valueOf(marketingEventInfo.getPositionId()));
        contentValues.put("typeId", Integer.valueOf(marketingEventInfo.getTypeId()));
        contentValues.put("resourceId", marketingEventInfo.getResourceId());
        contentValues.put("triggerTime", Long.valueOf(marketingEventInfo.getTriggerTime()));
        contentValues.put("value", marketingEventInfo.getValue());
        contentValues.put("reservedField", marketingEventInfo.getReservedField());
        return contentValues;
    }
}
