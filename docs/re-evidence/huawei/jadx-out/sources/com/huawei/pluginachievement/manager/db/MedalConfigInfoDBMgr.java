package com.huawei.pluginachievement.manager.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import defpackage.osf;
import defpackage.otc;
import defpackage.otd;
import defpackage.ote;
import defpackage.oun;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class MedalConfigInfoDBMgr implements IAchieveDBMgr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f22013a;

    private static int b(int i, int i2) {
        return i == 0 ? i : i2;
    }

    private static long e(long j, long j2) {
        return j > j2 ? j : j2;
    }

    public MedalConfigInfoDBMgr(Context context) {
        this.f22013a = context;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public osf query(Map<String, String> map) {
        return c(map.get("medalID"), map.get("huid"));
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public List<osf> queryAll(Map<String, String> map) {
        return b(map);
    }

    private osf c(String str, String str2) {
        MedalConfigInfo medalConfigInfo = null;
        if (str == null) {
            LogUtil.a("PLGACHIEVE_MedalConfigInfoDBMgr", "MedalConfigInfoDBMgr, query ,id is null!return");
            return null;
        }
        String str3 = "select *  from " + otd.c(this.f22013a).getTableFullName("medal_config_info_record") + " where medalID =? and huid=?";
        LogUtil.d("PLGACHIEVE_MedalConfigInfoDBMgr", "query selection=", str3);
        try {
            Cursor cursorRawQueryStorageData = otd.c(this.f22013a).rawQueryStorageData(1, str3, new String[]{ote.e(str), ote.e(str2)});
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    try {
                        if (medalConfigInfo == null) {
                            medalConfigInfo = new MedalConfigInfo();
                        }
                        e(cursorRawQueryStorageData, medalConfigInfo);
                    } catch (Throwable th) {
                        if (cursorRawQueryStorageData != null) {
                            try {
                                cursorRawQueryStorageData.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            }
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
            return medalConfigInfo;
        } catch (SQLException e) {
            LogUtil.j("PLGACHIEVE_MedalConfigInfoDBMgr", e.getMessage());
            return medalConfigInfo;
        }
    }

    private List<osf> b(Map<String, String> map) {
        String str = map.get("huid");
        if (str == null) {
            LogUtil.a("PLGACHIEVE_MedalConfigInfoDBMgr", "MedalLocationDBMgr, query ,id is null!return");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(8);
        String str2 = "select *  from " + otd.c(this.f22013a).getTableFullName("medal_config_info_record") + " where huid=?";
        String[] strArr = {ote.e(str)};
        if (map.containsKey(ParsedFieldTag.MEDAL_TYPE)) {
            str2 = str2 + " and medalType=?";
            strArr = new String[]{ote.e(str), ote.e(map.get(ParsedFieldTag.MEDAL_TYPE))};
        }
        LogUtil.d("PLGACHIEVE_MedalConfigInfoDBMgr", "query selection=", str2);
        try {
            Cursor cursorRawQueryStorageData = otd.c(this.f22013a).rawQueryStorageData(1, str2, strArr);
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    try {
                        MedalConfigInfo medalConfigInfo = new MedalConfigInfo();
                        e(cursorRawQueryStorageData, medalConfigInfo);
                        arrayList.add(medalConfigInfo);
                    } catch (Throwable th) {
                        if (cursorRawQueryStorageData != null) {
                            try {
                                cursorRawQueryStorageData.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            }
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        } catch (SQLiteDatabaseCorruptException unused) {
            ReleaseLogUtil.a("PLGACHIEVE_MedalConfigInfoDBMgr", "SQLiteDatabaseCorruptException");
        } catch (SQLException e) {
            LogUtil.j("PLGACHIEVE_MedalConfigInfoDBMgr", e.getMessage());
        }
        LogUtil.d("PLGACHIEVE_MedalConfigInfoDBMgr", "query medalConfigInfoList=", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public long insert(osf osfVar) {
        if (osfVar == null) {
            return -1L;
        }
        MedalConfigInfo medalConfigInfo = osfVar instanceof MedalConfigInfo ? (MedalConfigInfo) osfVar : null;
        if (medalConfigInfo == null) {
            return -1L;
        }
        osf osfVarC = c(medalConfigInfo.acquireMedalID(), medalConfigInfo.getHuid());
        if (osfVarC != null) {
            return a(osfVarC, osfVar);
        }
        return b(medalConfigInfo) - 1;
    }

    private long b(MedalConfigInfo medalConfigInfo) {
        ContentValues contentValues = new ContentValues();
        if (!e(contentValues, medalConfigInfo)) {
            return -1L;
        }
        long jInsertStorageData = otd.c(this.f22013a).insertStorageData("medal_config_info_record", 1, contentValues);
        LogUtil.a("PLGACHIEVE_MedalConfigInfoDBMgr", "insert insertMedalInfoResult=", Long.valueOf(jInsertStorageData));
        return jInsertStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int delete(osf osfVar) {
        if (osfVar == null) {
            return -1;
        }
        MedalConfigInfo medalConfigInfo = osfVar instanceof MedalConfigInfo ? (MedalConfigInfo) osfVar : null;
        if (medalConfigInfo == null) {
            return -1;
        }
        String[] strArr = {ote.e(medalConfigInfo.acquireMedalID()), ote.e(medalConfigInfo.getHuid())};
        LogUtil.d("PLGACHIEVE_MedalConfigInfoDBMgr", "delete selection=", "medalID=? and huid=?");
        int iDeleteStorageData = otd.c(this.f22013a).deleteStorageData("medal_config_info_record", 1, "medalID=? and huid=?", strArr);
        LogUtil.a("PLGACHIEVE_MedalConfigInfoDBMgr", "delete deleteMedalInfoResult=", Integer.valueOf(iDeleteStorageData));
        return iDeleteStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int update(osf osfVar) {
        osf osfVarC;
        if (osfVar != null) {
            MedalConfigInfo medalConfigInfo = osfVar instanceof MedalConfigInfo ? (MedalConfigInfo) osfVar : null;
            if (medalConfigInfo == null || (osfVarC = c(medalConfigInfo.acquireMedalID(), medalConfigInfo.getHuid())) == null) {
                return -1;
            }
            return a(osfVarC, osfVar);
        }
        return -1;
    }

    public int a(osf osfVar, osf osfVar2) {
        if (osfVar2 == null) {
            return -1;
        }
        MedalConfigInfo medalConfigInfo = osfVar2 instanceof MedalConfigInfo ? (MedalConfigInfo) osfVar2 : null;
        if (medalConfigInfo == null) {
            return -1;
        }
        return d(osfVar, medalConfigInfo) - 1;
    }

    private int d(osf osfVar, MedalConfigInfo medalConfigInfo) {
        ContentValues contentValues = new ContentValues();
        if (!c(contentValues, medalConfigInfo, osfVar)) {
            return -1;
        }
        String[] strArr = {ote.e(medalConfigInfo.acquireMedalID()), ote.e(medalConfigInfo.getHuid())};
        LogUtil.d("PLGACHIEVE_MedalConfigInfoDBMgr", "update selection=", "medalID=? and huid=?");
        int iUpdateStorageData = otd.c(this.f22013a).updateStorageData("medal_config_info_record", 1, contentValues, "medalID=? and huid=?", strArr);
        LogUtil.a("PLGACHIEVE_MedalConfigInfoDBMgr", "update result=", Integer.valueOf(iUpdateStorageData));
        return iUpdateStorageData;
    }

    private boolean c(ContentValues contentValues, MedalConfigInfo medalConfigInfo, osf osfVar) {
        if (medalConfigInfo == null) {
            return false;
        }
        MedalConfigInfo medalConfigInfo2 = osfVar instanceof MedalConfigInfo ? (MedalConfigInfo) osfVar : null;
        if (medalConfigInfo2 == null) {
            return false;
        }
        e(contentValues, medalConfigInfo, medalConfigInfo2);
        contentValues.put("activityId", Integer.valueOf(otd.c(medalConfigInfo2.acquireActivityId(), medalConfigInfo.acquireActivityId())));
        contentValues.put(ParsedFieldTag.ACTION_TYPE, Integer.valueOf(otd.c(medalConfigInfo2.acquireActionType(), medalConfigInfo.acquireActionType())));
        contentValues.put(ParsedFieldTag.GOAL, Integer.valueOf(otd.c(medalConfigInfo2.acquireGoal(), medalConfigInfo.acquireGoal())));
        contentValues.put(ParsedFieldTag.MEDAL_LEVEL, Integer.valueOf(otd.c(medalConfigInfo2.acquireMedalLevel(), medalConfigInfo.acquireMedalLevel())));
        contentValues.put("medalLabel", Integer.valueOf(otd.c(medalConfigInfo2.acquireMedalLabel(), medalConfigInfo.acquireMedalLabel())));
        contentValues.put("medalUnit", Integer.valueOf(otd.c(medalConfigInfo2.acquireMedalUnit(), medalConfigInfo.acquireMedalUnit())));
        contentValues.put("isNewConfig", Integer.valueOf(b(medalConfigInfo2.acquireIsNewConfig(), medalConfigInfo.acquireIsNewConfig())));
        contentValues.put(ParsedFieldTag.REPEATABLE, Integer.valueOf(otd.c(medalConfigInfo2.acquireRepeatable(), medalConfigInfo.acquireRepeatable())));
        contentValues.put("timestamp", Long.valueOf(e(medalConfigInfo2.acquireTimestamp(), medalConfigInfo.acquireTimestamp())));
        contentValues.put("reachStatus", Integer.valueOf(otd.c(medalConfigInfo2.acquireReachStatus(), medalConfigInfo.acquireReachStatus())));
        contentValues.put("eventStatus", Integer.valueOf(otc.b(medalConfigInfo2.acquireEventStatus(), medalConfigInfo.acquireEventStatus())));
        return true;
    }

    private void e(ContentValues contentValues, MedalConfigInfo medalConfigInfo, MedalConfigInfo medalConfigInfo2) {
        contentValues.put("huid", medalConfigInfo.getHuid());
        contentValues.put("medalName", otd.d(medalConfigInfo2.acquireMedalName(), medalConfigInfo.acquireMedalName()));
        contentValues.put("medalID", medalConfigInfo.acquireMedalID());
        contentValues.put(ParsedFieldTag.MEDAL_TYPE, otd.d(medalConfigInfo2.acquireMedalType(), medalConfigInfo.acquireMedalType()));
        contentValues.put("message", otd.d(medalConfigInfo2.acquireMessage(), medalConfigInfo.acquireMessage()));
        contentValues.put(ParsedFieldTag.GRAY_DESC, otd.d(medalConfigInfo2.acquireGrayDescription(), medalConfigInfo.acquireGrayDescription()));
        contentValues.put(ParsedFieldTag.LIGHT_DESC, otd.d(medalConfigInfo2.acquireLightDescription(), medalConfigInfo.acquireLightDescription()));
        contentValues.put(ParsedFieldTag.GRAY_DETAIL_STYLE, otd.d(medalConfigInfo2.acquireGrayDetailStyle(), medalConfigInfo.acquireGrayDetailStyle()));
        contentValues.put(ParsedFieldTag.LIGHT_DETAIL_STYLE, otd.d(medalConfigInfo2.acquireLightDetailStyle(), medalConfigInfo.acquireLightDetailStyle()));
        contentValues.put(ParsedFieldTag.GRAY_PRO_NAME, otd.d(medalConfigInfo2.acquireGrayPromotionName(), medalConfigInfo.acquireGrayPromotionName()));
        contentValues.put(ParsedFieldTag.LIGHT_PRO_NAME, otd.d(medalConfigInfo2.acquireLightPromotionName(), medalConfigInfo.acquireLightPromotionName()));
        contentValues.put(ParsedFieldTag.GARY_PRO_URL, otd.d(medalConfigInfo2.acquireGrayPromotionUrl(), medalConfigInfo.acquireGrayPromotionUrl()));
        contentValues.put(ParsedFieldTag.LIGHT_PRO_URL, otd.d(medalConfigInfo2.acquireLightPromotionUrl(), medalConfigInfo.acquireLightPromotionUrl()));
        contentValues.put(ParsedFieldTag.GRAY_LIST_STYLE, otd.d(medalConfigInfo2.acquireGrayListStyle(), medalConfigInfo.acquireGrayListStyle()));
        contentValues.put(ParsedFieldTag.LIGHT_LIST_STYLE, otd.d(medalConfigInfo2.acquireLightListStyle(), medalConfigInfo.acquireLightListStyle()));
        contentValues.put(ParsedFieldTag.SHARE_IMAGE_URL, otd.d(medalConfigInfo2.acquireShareImageUrl(), medalConfigInfo.acquireShareImageUrl()));
        contentValues.put("location", otd.d(medalConfigInfo2.acquireLocation(), medalConfigInfo.acquireLocation()));
        contentValues.put("startTime", otd.d(medalConfigInfo2.acquireStartTime(), medalConfigInfo.acquireStartTime()));
        contentValues.put("endTime", otd.d(medalConfigInfo2.acquireEndTime(), medalConfigInfo.acquireEndTime()));
        contentValues.put(ParsedFieldTag.TAKE_EFFECT_TIME, otd.d(medalConfigInfo2.acquireTakeEffectTime(), medalConfigInfo.acquireTakeEffectTime()));
        contentValues.put(ParsedFieldTag.CLIENT_TYPES, otd.d(medalConfigInfo2.getClientTypes(), medalConfigInfo.getClientTypes()));
        contentValues.put(ParsedFieldTag.PHONE_TYPES, otd.d(medalConfigInfo2.getPhoneTypes(), medalConfigInfo.getPhoneTypes()));
    }

    private boolean e(ContentValues contentValues, MedalConfigInfo medalConfigInfo) {
        if (medalConfigInfo == null || medalConfigInfo.acquireMedalID() == null) {
            return false;
        }
        contentValues.put("huid", medalConfigInfo.getHuid());
        contentValues.put("medalName", a(medalConfigInfo.acquireMedalName()));
        contentValues.put("medalID", medalConfigInfo.acquireMedalID());
        contentValues.put(ParsedFieldTag.MEDAL_TYPE, medalConfigInfo.acquireMedalType());
        contentValues.put(ParsedFieldTag.MEDAL_LEVEL, Integer.valueOf(medalConfigInfo.acquireMedalLevel()));
        contentValues.put("medalUnit", Integer.valueOf(medalConfigInfo.acquireMedalUnit()));
        contentValues.put("medalLabel", Integer.valueOf(medalConfigInfo.acquireMedalLabel()));
        contentValues.put("activityId", Integer.valueOf(medalConfigInfo.acquireActivityId()));
        contentValues.put("message", medalConfigInfo.acquireMessage());
        contentValues.put(ParsedFieldTag.GRAY_DESC, medalConfigInfo.acquireGrayDescription());
        contentValues.put(ParsedFieldTag.LIGHT_DESC, medalConfigInfo.acquireLightDescription());
        contentValues.put(ParsedFieldTag.GRAY_DETAIL_STYLE, medalConfigInfo.acquireGrayDetailStyle());
        contentValues.put(ParsedFieldTag.LIGHT_DETAIL_STYLE, medalConfigInfo.acquireLightDetailStyle());
        contentValues.put(ParsedFieldTag.GRAY_PRO_NAME, medalConfigInfo.acquireGrayPromotionName());
        contentValues.put(ParsedFieldTag.LIGHT_PRO_NAME, medalConfigInfo.acquireLightPromotionName());
        contentValues.put(ParsedFieldTag.GARY_PRO_URL, medalConfigInfo.acquireGrayPromotionUrl());
        contentValues.put(ParsedFieldTag.LIGHT_PRO_URL, medalConfigInfo.acquireLightPromotionUrl());
        contentValues.put(ParsedFieldTag.GRAY_LIST_STYLE, medalConfigInfo.acquireGrayListStyle());
        contentValues.put(ParsedFieldTag.LIGHT_LIST_STYLE, medalConfigInfo.acquireLightListStyle());
        contentValues.put(ParsedFieldTag.SHARE_IMAGE_URL, medalConfigInfo.acquireShareImageUrl());
        contentValues.put("location", medalConfigInfo.acquireLocation());
        contentValues.put(ParsedFieldTag.ACTION_TYPE, Integer.valueOf(medalConfigInfo.acquireActionType()));
        contentValues.put(ParsedFieldTag.GOAL, Integer.valueOf(medalConfigInfo.acquireGoal()));
        contentValues.put("startTime", medalConfigInfo.acquireStartTime());
        contentValues.put("endTime", medalConfigInfo.acquireEndTime());
        contentValues.put(ParsedFieldTag.TAKE_EFFECT_TIME, medalConfigInfo.acquireTakeEffectTime());
        contentValues.put(ParsedFieldTag.CLIENT_TYPES, medalConfigInfo.getClientTypes());
        contentValues.put(ParsedFieldTag.PHONE_TYPES, medalConfigInfo.getPhoneTypes());
        contentValues.put("isNewConfig", Integer.valueOf(medalConfigInfo.acquireIsNewConfig()));
        contentValues.put(ParsedFieldTag.REPEATABLE, Integer.valueOf(medalConfigInfo.acquireRepeatable()));
        contentValues.put("timestamp", Long.valueOf(medalConfigInfo.acquireTimestamp()));
        contentValues.put("reachStatus", Integer.valueOf(medalConfigInfo.acquireReachStatus()));
        contentValues.put("eventStatus", Integer.valueOf(medalConfigInfo.acquireEventStatus()));
        return true;
    }

    private void e(Cursor cursor, MedalConfigInfo medalConfigInfo) {
        if (cursor == null) {
            return;
        }
        try {
            medalConfigInfo.setHuid(oun.b(cursor, "huid"));
            medalConfigInfo.saveMedalType(oun.b(cursor, ParsedFieldTag.MEDAL_TYPE));
            medalConfigInfo.saveMedalName(oun.b(cursor, "medalName"));
            medalConfigInfo.saveMedalID(oun.b(cursor, "medalID"));
            medalConfigInfo.saveMessage(oun.b(cursor, "message"));
            medalConfigInfo.saveGrayDescription(oun.b(cursor, ParsedFieldTag.GRAY_DESC));
            medalConfigInfo.saveLightDescription(oun.b(cursor, ParsedFieldTag.LIGHT_DESC));
            medalConfigInfo.saveGrayDetailStyle(oun.b(cursor, ParsedFieldTag.GRAY_DETAIL_STYLE));
            medalConfigInfo.saveLightDetailStyle(oun.b(cursor, ParsedFieldTag.LIGHT_DETAIL_STYLE));
            medalConfigInfo.saveGrayPromotionName(oun.b(cursor, ParsedFieldTag.GRAY_PRO_NAME));
            medalConfigInfo.saveLightPromotionName(oun.b(cursor, ParsedFieldTag.LIGHT_PRO_NAME));
            medalConfigInfo.saveGrayPromotionUrl(oun.b(cursor, ParsedFieldTag.GARY_PRO_URL));
            medalConfigInfo.saveLightPromotionUrl(oun.b(cursor, ParsedFieldTag.LIGHT_PRO_URL));
            medalConfigInfo.saveGrayListStyle(oun.b(cursor, ParsedFieldTag.GRAY_LIST_STYLE));
            medalConfigInfo.saveLightListStyle(oun.b(cursor, ParsedFieldTag.LIGHT_LIST_STYLE));
            medalConfigInfo.saveShareImageUrl(oun.b(cursor, ParsedFieldTag.SHARE_IMAGE_URL));
            medalConfigInfo.saveGoal(oun.e(cursor, ParsedFieldTag.GOAL));
            medalConfigInfo.saveActionType(oun.e(cursor, ParsedFieldTag.ACTION_TYPE));
            medalConfigInfo.saveLocation(oun.b(cursor, "location"));
            medalConfigInfo.saveActivityId(oun.e(cursor, "activityId"));
            medalConfigInfo.saveStartTime(oun.b(cursor, "startTime"));
            medalConfigInfo.saveEndTime(oun.b(cursor, "endTime"));
            medalConfigInfo.saveTakeEffectTime(oun.b(cursor, ParsedFieldTag.TAKE_EFFECT_TIME));
            medalConfigInfo.setClientTypes(oun.b(cursor, ParsedFieldTag.CLIENT_TYPES));
            medalConfigInfo.setPhoneTypes(oun.b(cursor, ParsedFieldTag.PHONE_TYPES));
            medalConfigInfo.saveRepeatable(oun.e(cursor, ParsedFieldTag.REPEATABLE));
            medalConfigInfo.saveIsNewConfig(oun.e(cursor, "isNewConfig"));
            medalConfigInfo.saveTimestamp(oun.c(cursor, "timestamp"));
            medalConfigInfo.saveMedalLevel(oun.e(cursor, ParsedFieldTag.MEDAL_LEVEL));
            medalConfigInfo.saveMedalLabel(oun.e(cursor, "medalLabel"));
            medalConfigInfo.saveMedalUnit(oun.e(cursor, "medalUnit"));
            medalConfigInfo.saveEventStatus(oun.e(cursor, "reachStatus"));
            medalConfigInfo.saveReachStatus(oun.e(cursor, "eventStatus"));
        } catch (SQLiteException | IllegalStateException e) {
            LogUtil.e("PLGACHIEVE_MedalConfigInfoDBMgr", "structMedalInfoData: exception -> " + e.getMessage());
        }
    }

    private static String a(String str) {
        return str == null ? "" : str;
    }
}
