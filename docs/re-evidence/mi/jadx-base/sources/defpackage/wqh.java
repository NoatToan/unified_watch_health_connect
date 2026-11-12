package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.google.gson.Gson;
import com.mi.health.router.business.IntentHelper;
import com.miui.tsmclient.entity.CardUIInfo;
import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.chart.entrys.CurseEntry;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.dataprovider.DataProvider;
import com.xiaomi.fitness.dataprovider.DataProviderException;
import com.xiaomi.fitness.dataprovider.DataUtils;
import com.xiaomi.fitness.health.export.DayStatus;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.health.export.MenstrualWidgetEntryList;
import com.xiaomi.fitness.health.export.MenstrualWidgetSampleBrief;
import com.xiaomi.fitness.health.export.WeekStatusList;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.PrivacySensitive;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class wqh extends DataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IHealthPage f38254a = HealthPageExtKt.getInstance(IHealthPage.INSTANCE);

    public final void a() throws DataProviderException {
        Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem("xiaomiwear_app", DeviceSettingConfigKey.KEY_PRIVACY_SENSITIVE).valueToObject(PrivacySensitive.class);
        if (objValueToObject == null) {
            throw new DataProviderException(1001, null);
        }
        if (!((PrivacySensitive) objValueToObject).isAgreeSensitive()) {
            throw new DataProviderException(1001, null);
        }
        if (!this.f38254a.usedCurse()) {
            throw new DataProviderException(1002, null);
        }
    }

    public final List<Record> b() {
        ArrayList arrayList = new ArrayList();
        Record curseLatestRecord = this.f38254a.getCurseLatestRecord();
        Logger.i("CurseProvider", "getLatestHistoryRecord latestRecord" + curseLatestRecord);
        if (curseLatestRecord != null) {
            arrayList.add(curseLatestRecord);
        }
        return arrayList;
    }

    public final int c() {
        int i = 1;
        boolean z = RegionPreference.INSTANCE.getPRIVACY_AGREE() && (TextUtils.isEmpty(RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion()) ^ true);
        boolean zUsedCurse = this.f38254a.usedCurse();
        if (!z) {
            i = 0;
        } else if (zUsedCurse) {
            i = 2;
        }
        Logger.i("CurseProvider", "getMenstrualAuthStatus authStatus= " + i);
        return i;
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public Bundle call(String str, String str2, Bundle bundle) throws DataProviderException {
        if (!"mens_has_profile".equals(str)) {
            throw new DataProviderException(1006, null);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("extra_mens_profile", this.f38254a.usedCurse());
        return bundle2;
    }

    public final long[] d(String str, String[] strArr) throws DataProviderException {
        if (TextUtils.isEmpty(str) || !TextUtils.equals(str, "begin_time=%s AND end_time=%s")) {
            throw new DataProviderException(1007, null);
        }
        if (ArrayUtils.INSTANCE.isEmpty(strArr) || strArr.length != 2) {
            throw new DataProviderException(1007, null);
        }
        return new long[]{Long.parseLong(strArr[0]), Long.parseLong(strArr[1])};
    }

    public final Cursor e(String[] strArr) {
        int iC = c();
        MenstrualWidgetSampleBrief widgetProviderSampleBrief = this.f38254a.getWidgetProviderSampleBrief();
        MatrixCursor matrixCursor = new MatrixCursor(strArr, 1);
        MatrixCursor.RowBuilder rowBuilderNewRow = matrixCursor.newRow();
        rowBuilderNewRow.add("mens_col_2_1_auth_status", Integer.valueOf(iC));
        String title = widgetProviderSampleBrief.getTitle();
        String subTitle = widgetProviderSampleBrief.getSubTitle();
        if (iC == 0) {
            title = AppUtil.getApp().getString(ezi.K);
            subTitle = AppUtil.getApp().getString(ezi.H);
        } else if (iC == 1) {
            title = AppUtil.getApp().getString(ezi.G);
            subTitle = AppUtil.getApp().getString(ezi.I);
        }
        rowBuilderNewRow.add("mens_col_2_1_title", title);
        rowBuilderNewRow.add("mens_col_2_1_subtitle", subTitle);
        if (iC == 0) {
            rowBuilderNewRow.add("mens_col_2_1_jump_uri", "mi.fitness://localhost/d?action=app_home");
        } else {
            rowBuilderNewRow.add("mens_col_2_1_jump_uri", "mi.fitness://localhost/d?action=menstruation_home");
        }
        Logger.i("CurseProvider", "query2By1WidgetCursor title= " + title + " subtitle= " + subTitle);
        return matrixCursor;
    }

    public final Cursor f(String[] strArr) {
        int iC = c();
        MenstrualWidgetEntryList widgetProviderEntryList = this.f38254a.getWidgetProviderEntryList();
        MatrixCursor matrixCursor = new MatrixCursor(strArr, 1);
        MatrixCursor.RowBuilder rowBuilderNewRow = matrixCursor.newRow();
        rowBuilderNewRow.add("mens_col_2_2_auth_status", Integer.valueOf(iC));
        String desc = widgetProviderEntryList.getDesc();
        if (iC == 0) {
            desc = AppUtil.getApp().getString(ezi.H);
        } else if (iC == 1) {
            desc = AppUtil.getApp().getString(ezi.J);
        }
        rowBuilderNewRow.add("mens_col_2_2_desc", desc);
        if (iC == 2) {
            rowBuilderNewRow.add("mens_col_2_2_start_time_sec", Long.valueOf(widgetProviderEntryList.getStartTimeSecond()));
            rowBuilderNewRow.add("mens_col_2_2_end_time_sec", Long.valueOf(widgetProviderEntryList.getEndTimeSecond()));
            rowBuilderNewRow.add("mens_col_2_2_jump_uri", "mi.fitness://localhost/d?action=menstruation_home");
            List<CurseEntry> entryList = widgetProviderEntryList.getEntryList();
            ArrayList arrayList = new ArrayList();
            Iterator<CurseEntry> it = entryList.iterator();
            while (it.hasNext()) {
                arrayList.add(new DayStatus(it.next().f11748a));
            }
            String json = new Gson().toJson(new WeekStatusList(arrayList));
            Logger.i("CurseProvider", "query2By2WidgetCursor jsonStr= " + json);
            rowBuilderNewRow.add("mens_col_2_2_week_status_list", json);
        } else if (iC == 1) {
            rowBuilderNewRow.add("mens_col_2_2_jump_uri", "mi.fitness://localhost/d?action=menstruation_home");
        } else {
            rowBuilderNewRow.add("mens_col_2_2_jump_uri", "mi.fitness://localhost/d?action=app_home");
        }
        Logger.i("CurseProvider", "query2By2WidgetCursor desc=" + desc);
        return matrixCursor;
    }

    public final Cursor g(String[] strArr) throws DataProviderException {
        a();
        List<Record> listB = b();
        Logger.i("CurseProvider", "queryLatestHistoryRecord: " + listB.size());
        if (ArrayUtils.isEmpty(listB)) {
            return DataUtils.obtainEmptyCursor(0, null);
        }
        Record record = listB.get(listB.size() - 1);
        ArrayMap arrayMap = new ArrayMap(2);
        arrayMap.put("begin_time", Long.valueOf(record.getStartMills()));
        arrayMap.put(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME, Long.valueOf(record.getEndMills()));
        Logger.i("CurseProvider", "queryLatestHistoryRecord: map" + arrayMap);
        return yc5.a(arrayMap, strArr);
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public String getType(Uri uri) {
        switch (matchPath(uri)) {
            case 2:
                return "vnd.android.cursor.item/vnd.mi.health.period.brief";
            case 3:
                return "vnd.android.cursor.dir/vnd.mi.health.period.history_records";
            case 4:
                return "vnd.android.cursor.dir/vnd.mi.health.period.predict_records";
            case 5:
                return "vnd.android.cursor.item/vnd.mi.health.period.latest_history_record";
            case 6:
                return "vnd.android.cursor.item/vnd.mi.health.period.latest_predict_record";
            case 7:
                return "vnd.android.cursor.item/vnd.mi.health.period.mark";
            case 8:
                return "vnd.android.cursor.item/vnd.mi.health.period.has_mens_profile";
            case 9:
                return "vnd.android.cursor.item/vnd.mi.health.period.mens_widget_2_1";
            case 10:
                return "vnd.android.cursor.item/vnd.mi.health.period.mens_widget_2_2";
            default:
                return null;
        }
    }

    public final Cursor h(String[] strArr) throws DataProviderException {
        a();
        boolean zHasPredictData = this.f38254a.hasPredictData();
        Record curseLatestPredict = zHasPredictData ? this.f38254a.getCurseLatestPredict() : null;
        Logger.i("CurseProvider", "queryLatestPredictRecord latestPredict " + curseLatestPredict + ",predictEnable " + zHasPredictData);
        if (curseLatestPredict == null) {
            throw new DataProviderException(1008, null);
        }
        long[] jArr = {curseLatestPredict.getStartMills(), curseLatestPredict.getEndMills()};
        ArrayMap arrayMap = new ArrayMap(2);
        arrayMap.put("begin_time", Long.valueOf(jArr[0]));
        arrayMap.put(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME, Long.valueOf(jArr[1]));
        Logger.i("CurseProvider", "queryLatestPredictRecord: " + arrayMap);
        return yc5.a(arrayMap, strArr);
    }

    public final Cursor i(String[] strArr, String str) {
        if (!this.f38254a.usedCurse()) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String curseTitle = this.f38254a.getCurseTitle(jCurrentTimeMillis);
        String curseSubTitle = this.f38254a.getCurseSubTitle(jCurrentTimeMillis);
        boolean zHasPredictData = this.f38254a.hasPredictData();
        ArrayMap arrayMap = new ArrayMap(5);
        arrayMap.put(SportRecordBundleKey.BUNDLE_PARAM_URI, IntentHelper.INSTANCE.getRouterIntentByAction("lady_days").toUri(0));
        arrayMap.put("predictStatus", Boolean.valueOf(zHasPredictData));
        arrayMap.put("title", curseTitle);
        arrayMap.put(CardUIInfo.KEY_SUBTITILE, curseSubTitle);
        Logger.i("CurseProvider", "queryPeriodBrief:" + arrayMap);
        return yc5.a(arrayMap, strArr);
    }

    public final Cursor j(String[] strArr, String str, String[] strArr2) throws DataProviderException {
        a();
        long[] jArrD = d(str, strArr2);
        List<Record> curseRecords = this.f38254a.getCurseRecords(jArrD[0], jArrD[1]);
        Logger.i("CurseProvider", "queryPeriodHistoryRecords: range " + Arrays.toString(jArrD) + ",records " + curseRecords);
        if (ArrayUtils.isEmpty(curseRecords)) {
            return DataUtils.obtainEmptyCursor(0, null);
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr, curseRecords.size());
        for (Record record : curseRecords) {
            MatrixCursor.RowBuilder rowBuilderNewRow = matrixCursor.newRow();
            for (String str2 : strArr) {
                str2.hashCode();
                rowBuilderNewRow.add(str2, str2.equals("begin_time") ? Long.valueOf(record.getStartMills()) : !str2.equals(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME) ? null : Long.valueOf(record.getEndMills()));
            }
        }
        return matrixCursor;
    }

    public final Cursor k(String[] strArr, String str, String[] strArr2) throws DataProviderException {
        a();
        long[] jArrD = d(str, strArr2);
        boolean zHasPredictData = this.f38254a.hasPredictData();
        List<Record> cursePredictRecords = zHasPredictData ? this.f38254a.getCursePredictRecords(jArrD[0], jArrD[1]) : Collections.emptyList();
        Logger.i("CurseProvider", "queryPeriodPredictRecords: range " + Arrays.toString(jArrD) + ",records " + cursePredictRecords + ",predictEnable " + zHasPredictData);
        if (ArrayUtils.isEmpty(cursePredictRecords)) {
            return DataUtils.obtainEmptyCursor(0, null);
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr, cursePredictRecords.size());
        for (Record record : cursePredictRecords) {
            MatrixCursor.RowBuilder rowBuilderNewRow = matrixCursor.newRow();
            for (String str2 : strArr) {
                str2.hashCode();
                rowBuilderNewRow.add(str2, str2.equals("begin_time") ? Long.valueOf(record.getStartMills()) : !str2.equals(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME) ? null : Long.valueOf(record.getEndMills()));
            }
        }
        return matrixCursor;
    }

    public final void l(ContentValues contentValues) throws DataProviderException {
        a();
        Objects.requireNonNull(contentValues);
        Object obj = contentValues.get("mark_type");
        Objects.requireNonNull(obj);
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = contentValues.get("mark_date");
        Objects.requireNonNull(obj2);
        int iMarkCurseStatus = this.f38254a.markCurseStatus(((Long) obj2).longValue(), iIntValue);
        Logger.i("CurseProvider", "updatePeriodMarkStatus: targetMarkType = " + iIntValue + "; state = " + iMarkCurseStatus);
        if (iIntValue != iMarkCurseStatus) {
            throw new DataProviderException(1004, null);
        }
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public void onRegisterPath(DataProvider.PathMapper pathMapper) {
        pathMapper.addPath("/brief", 2);
        pathMapper.addPath("/history_records", 3);
        pathMapper.addPath("/predict_records", 4);
        pathMapper.addPath("/latest_history_record", 5);
        pathMapper.addPath("/latest_predict_record", 6);
        pathMapper.addPath("/mark", 7);
        pathMapper.addPath("/mens_has_profile", 8);
        pathMapper.addPath("/mens_widget_2_1", 9);
        pathMapper.addPath("/mens_widget_2_2", 10);
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, String str3) throws DataProviderException {
        int iMatchPath = matchPath(uri);
        Logger.i("CurseProvider", "path = " + iMatchPath);
        if (iMatchPath == 2) {
            return i(strArr, str3);
        }
        if (iMatchPath == 3) {
            return j(strArr, str, strArr2);
        }
        if (iMatchPath == 4) {
            return k(strArr, str, strArr2);
        }
        if (iMatchPath == 5) {
            return g(strArr);
        }
        if (iMatchPath == 6) {
            return h(strArr);
        }
        if (iMatchPath == 9) {
            return e(strArr);
        }
        if (iMatchPath == 10) {
            return f(strArr);
        }
        throw new DataProviderException(1006, null);
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) throws DataProviderException {
        int iMatchPath = matchPath(uri);
        Logger.i("CurseProvider", "update path = " + iMatchPath);
        if (iMatchPath != 7) {
            throw new DataProviderException(1006, null);
        }
        l(contentValues);
        return 1;
    }
}
