package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.mi.health.a;
import com.mi.health.exercise.widget.GoalHelper;
import com.mi.health.router.business.IntentHelper;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.api.repository.IStandRepository;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.StandRecord;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.dataprovider.DataProvider;
import com.xiaomi.fitness.dataprovider.DataProviderException;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes5.dex */
public class jbo extends DataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eie f22628a = new eie(1);

    public final Map<String, Object> a(String str, int i) {
        return c(str, i, 0, 0, 0, 0, 0);
    }

    public final Map<String, Object> b(String str, Uri uri) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        DailyStandReport dailyStandReport = null;
        try {
            List<DailyStandReport> dailyReportListSync = ((IStandRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(IStandRepository.class)).getDailyReportListSync("", TimeDateUtil.changZeroOfTheDay(LocalDate.now()), 0, 0);
            if (!ArrayUtils.isEmpty(dailyReportListSync)) {
                dailyStandReport = dailyReportListSync.get(0);
            }
        } catch (Exception e) {
            FitnessLogUtils.i("StandWidgetProvider", "getSleepRecordCursor exception " + e);
        }
        int goalValue = GoalHelper.INSTANCE.getGoalValue(3, AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(false).getRegularGoalList());
        FitnessLogUtils.i("StandWidgetProvider", "getSimpleStandGoal goal:" + goalValue);
        if (dailyStandReport != null) {
            int standCount = dailyStandReport.getStandCount();
            int currentFieldValue = TimeUtils.INSTANCE.getCurrentFieldValue(11);
            List<StandRecord> standDetail = dailyStandReport.getStandDetail();
            if (!ArrayUtils.isEmpty(standDetail)) {
                Iterator<StandRecord> it = standDetail.iterator();
                while (it.hasNext()) {
                    if (it.next().getTime() == TimeDateUtil.getCurrentHourTime()) {
                        i4 = 1;
                        break;
                    }
                }
            }
            i = standCount;
            i3 = currentFieldValue;
            i2 = i4;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        return c(str, a.C0299a.f9965a, goalValue, i, i2, i3, i3 + 1);
    }

    public final Map<String, Object> c(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("code", Integer.valueOf(i));
        arrayMap.put(FitnessPersistKey.Rainbow, Integer.valueOf(i2));
        arrayMap.put("finished", Integer.valueOf(i3));
        arrayMap.put("period_start", Integer.valueOf(i5));
        arrayMap.put("period_end", Integer.valueOf(i6));
        arrayMap.put("state", Integer.valueOf(i4));
        arrayMap.put("setup_uri", IntentHelper.INSTANCE.getRouterIntentByAction("STAND_HOME").toUri(0));
        return arrayMap;
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public String getType(Uri uri) {
        if (matchPath(uri) != 2) {
            return null;
        }
        return "vnd.android.cursor.item/vnd.mi.health.widget.stand.simple";
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public void onRegisterPath(DataProvider.PathMapper pathMapper) {
        pathMapper.addPath("/simple", 2);
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, String str3) throws DataProviderException {
        Map<String, Object> mapA = (RegionPreference.INSTANCE.getPRIVACY_AGREE() && (TextUtils.isEmpty(RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion()) ^ true)) ? null : a(str3, a.C0299a.f9966b);
        if (mapA != null) {
            return DataProvider.INSTANCE.requireValidCursor(getContext(), uri, yc5.a(mapA, strArr));
        }
        return DataProvider.INSTANCE.requireValidCursor(getContext(), uri, matchPath(uri) == 2 ? yc5.a(b(str3, uri), strArr) : null);
    }
}
