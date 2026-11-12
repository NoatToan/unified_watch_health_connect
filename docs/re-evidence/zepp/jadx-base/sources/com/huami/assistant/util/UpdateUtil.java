package com.huami.assistant.util;

import androidx.annotation.NonNull;
import com.huami.assistant.calendar.Event;
import com.huami.assistant.model.bean.Update;
import com.huami.watch.util.DateDay;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class UpdateUtil {
    public static int getLastFirstVisibleItem(@NonNull List<Object> dataList) {
        for (int size = dataList.size() - 1; size >= 0; size--) {
            Object obj = dataList.get(size);
            if (obj instanceof Long) {
                return DateDay.today().equals(((Long) obj).longValue()) ? getTodayLatestItem(dataList) : size;
            }
        }
        return 0;
    }

    public static int getScheduleLastDayItemPosition(@NonNull List<Object> dataList) {
        for (int size = dataList.size() - 1; size >= 0; size--) {
            if (dataList.get(size) instanceof Long) {
                return size;
            }
        }
        return 0;
    }

    public static int getScheduleTodayItemPosition(@NonNull List<Object> dataList) {
        boolean zEquals = false;
        for (int i = 0; i < dataList.size(); i++) {
            Object obj = dataList.get(i);
            if (obj instanceof Long) {
                zEquals = DateDay.today().equals(((Long) obj).longValue());
            }
            if (zEquals) {
                return i;
            }
        }
        return 0;
    }

    public static int getTodayLatestItem(@NonNull List<Object> dataList) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zEquals = false;
        int i = 0;
        for (int i2 = 0; i2 < dataList.size(); i2++) {
            Object obj = dataList.get(i2);
            long updateTime = 0;
            if (obj instanceof Long) {
                zEquals = DateDay.today().equals(((Long) obj).longValue());
            } else if (obj instanceof Update) {
                updateTime = getUpdateTime((Update) obj);
            }
            if (zEquals) {
                if (updateTime >= jCurrentTimeMillis) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    public static long getUpdateTime(Update update) {
        Event event;
        return (update.type == 2 && (event = UpdateParser.toEvent(update.data)) != null && event.allDay) ? DateDay.from(update.startTime).dayStartMills() : update.startTime;
    }
}
