package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.mi.health.a;
import com.mi.health.sleep.SleepConfigFetcher;
import com.mi.health.sleep.SleepDataDbFetcher;
import com.mi.health.sleep.SleepDataHelperKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.dataprovider.DataProvider;
import com.xiaomi.fitness.dataprovider.DataProviderException;

/* JADX INFO: loaded from: classes5.dex */
public class djm extends DataProvider implements t40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SleepConfigFetcher f15595a = new SleepConfigFetcher();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SleepDataDbFetcher f15596b = new SleepDataDbFetcher();

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public Bundle call(String str, String str2, Bundle bundle) throws DataProviderException {
        Logger.i("SleepDataProvider", "call methodName=" + str + "**arg=" + str2);
        if ("is_sleep_tracing".equals(str)) {
            return this.f15595a.callSleepTracing();
        }
        return "is_maybe_sleeping".equals(str) ? this.f15595a.isSleeping() : super.call(str, str2, bundle);
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public String getType(Uri uri) {
        int iMatchPath = matchPath(uri);
        if (iMatchPath == 2) {
            return "vnd.android.cursor.item/vnd.mi.health.sleep.config";
        }
        if (iMatchPath == 3) {
            return "vnd.android.cursor.item/vnd.mi.health.sleep.schedule";
        }
        if (iMatchPath == 4) {
            return "vnd.android.cursor.dir/vnd.mi.health.sleep.record";
        }
        if (iMatchPath == 5) {
            return "vnd.android.cursor.item/vnd.mi.health.sleep.report.v4";
        }
        if (iMatchPath != 6) {
            return null;
        }
        return "vnd.android.cursor.item/vnd.mi.health.sleep.homepage";
    }

    @Override // defpackage.t40
    public int onAcceptAccess(Object obj, Object obj2, int i, String str) {
        return "com.miui.personalassistant".equals(str) ? -1 : 0;
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public void onRegisterPath(DataProvider.PathMapper pathMapper) {
        pathMapper.addPath("/config", 2);
        pathMapper.addPath("/schedule", 3);
        pathMapper.addPath("/record", 4);
        pathMapper.addPath("/report", 5);
        pathMapper.addPath("/homepage", 6);
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, String str3) throws DataProviderException {
        Cursor cursorQuerySleepTraceEnable;
        Logger.i("SleepDataProvider", "query uri=" + uri + "**selection=" + str + "**callPackage=" + str3);
        SleepDataHelperKt.checkStatusForDeskClockCall(str3);
        int iMatchPath = matchPath(uri);
        if (iMatchPath == 2) {
            cursorQuerySleepTraceEnable = this.f15595a.querySleepTraceEnable(strArr);
        } else if (iMatchPath == 3) {
            cursorQuerySleepTraceEnable = this.f15595a.querySleepSchedule(strArr);
        } else if (iMatchPath == 4) {
            cursorQuerySleepTraceEnable = this.f15596b.querySleepRecords(str3, uri, strArr, str, strArr2);
        } else if (iMatchPath != 5) {
            cursorQuerySleepTraceEnable = iMatchPath != 6 ? null : this.f15595a.querySleepHomePageIntent();
        } else {
            cursorQuerySleepTraceEnable = this.f15596b.querySleepReport(uri, strArr, str, strArr2);
        }
        if (cursorQuerySleepTraceEnable == null) {
            throw new DataProviderException(a.C0299a.c, null);
        }
        cursorQuerySleepTraceEnable.setNotificationUri(getContext().getContentResolver(), uri);
        return cursorQuerySleepTraceEnable;
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) throws DataProviderException {
        int iUpdateSleepTraceEnable;
        Logger.i("SleepDataProvider", "update uri=" + uri + "**selection=" + str);
        int iMatchPath = matchPath(uri);
        if (iMatchPath != 2) {
            iUpdateSleepTraceEnable = iMatchPath != 3 ? -1 : this.f15595a.updateSleepSchedule(contentValues);
        } else {
            iUpdateSleepTraceEnable = this.f15595a.updateSleepTraceEnable(contentValues);
        }
        if (iUpdateSleepTraceEnable == -1) {
            throw new DataProviderException(a.C0299a.c, null);
        }
        getContext().getContentResolver().notifyChange(uri, null);
        return iUpdateSleepTraceEnable;
    }
}
