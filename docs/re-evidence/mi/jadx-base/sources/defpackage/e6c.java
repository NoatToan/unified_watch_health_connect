package defpackage;

import android.database.Cursor;
import com.mi.health.a;
import com.xiaomi.fit.fitness.export.api.repository.IHeartRateRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.common.lifecycle.LiveDataHelper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.dataprovider.DataProviderException;
import com.xiaomi.fitness.dataprovider.DataUtils;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes5.dex */
public class e6c {
    public static Object a(String str, DailyHrReport dailyHrReport) {
        HrItem latestHrRecord = dailyHrReport.getLatestHrRecord();
        if (latestHrRecord == null) {
            return null;
        }
        str.hashCode();
        if (str.equals("hrm")) {
            return Integer.valueOf(latestHrRecord.getHr());
        }
        if (str.equals("timestamp")) {
            return Long.valueOf(latestHrRecord.getTime() * 1000);
        }
        return null;
    }

    public static Cursor b(String[] strArr) throws DataProviderException {
        try {
            List list = (List) LiveDataHelper.asFuture(((IHeartRateRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(IHeartRateRepository.class)).getReportList("", "days", TimeDateUtil.changZeroOfTheDay(LocalDate.now()), 0, 0, false)).get(5L, TimeUnit.SECONDS);
            Logger.i("HeartRateProviderHelper", "getRecentRecordCursor: hrReportList = " + list);
            if (list == null || list.isEmpty()) {
                return DataUtils.obtainEmptyCursor(0, null);
            }
            HashMap map = new HashMap();
            for (String str : strArr) {
                map.put(str, a(str, (DailyHrReport) list.get(0)));
            }
            return yc5.a(map, strArr);
        } catch (Exception e) {
            Logger.e("HeartRateProviderHelper", e, "query recent heart rate record failed");
            throw new DataProviderException(a.C0299a.c, null);
        }
    }
}
