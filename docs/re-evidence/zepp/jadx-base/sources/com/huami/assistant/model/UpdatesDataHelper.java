package com.huami.assistant.model;

import android.content.Context;
import android.text.format.Time;
import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import com.huami.assistant.alarm.Alarm;
import com.huami.assistant.alarm.AlarmLoop;
import com.huami.assistant.calendar.DateException;
import com.huami.assistant.calendar.Event;
import com.huami.assistant.calendar.EventDao;
import com.huami.assistant.calendar.EventRecurrence;
import com.huami.assistant.calendar.RecurrenceProcessor;
import com.huami.assistant.calendar.RecurrenceSet;
import com.huami.assistant.dataexchange.ExchangeCenter;
import com.huami.assistant.model.UpdatesDataHelper;
import com.huami.assistant.model.bean.Update;
import com.huami.assistant.util.UpdateParser;
import com.huami.assistant.util.UpdateUtil;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class UpdatesDataHelper {
    private static final String d = "Assistant-UpdateDataHelper";
    private Context a;
    private List<Update> b;
    private List<Update> c;

    public UpdatesDataHelper(Context context) {
        this.a = context;
    }

    private static List<Update> d(List<Update> updates, DateDay date) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < updates.size(); i++) {
            Update update = updates.get(i);
            Event event = UpdateParser.toEvent(update.data);
            long j = update.startTime;
            boolean z = event.allDay;
            long j2 = update.endTime;
            if (z) {
                j2 -= 86400000;
            }
            if (j2 < j) {
                j2 = j;
            }
            if (j2 >= date.dayStartMills() && j <= date.dayEndMills()) {
                if (date.equals(update.startTime)) {
                    arrayList.add(update);
                } else {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(update.startTime);
                    Calendar calendar2 = date.calendar();
                    calendar.set(1, calendar2.get(1));
                    calendar.set(2, calendar2.get(2));
                    calendar.set(5, calendar2.get(5));
                    try {
                        Update updateM3325clone = update.m3325clone();
                        updateM3325clone.startTime = calendar.getTimeInMillis();
                        arrayList.add(updateM3325clone);
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e(Update update, Update update2) {
        return (int) (UpdateUtil.getUpdateTime(update) - UpdateUtil.getUpdateTime(update2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(List list, DateDay dateDay, int i, ObservableEmitter observableEmitter) throws Exception {
        LongSparseArray longSparseArray = new LongSparseArray();
        if (list.contains(1)) {
            this.b = UpdatesManager.getManager().getAll(1);
        }
        if (list.contains(2)) {
            this.c = l(dateDay.dayStartMills(), dateDay.add(i - 1).dayEndMills(), UpdatesManager.getManager().getAll(2));
        }
        for (int i2 = 0; i2 < i; i2++) {
            DateDay dateDayAdd = dateDay.add(i2);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.addAll(i(dateDayAdd, ((Integer) it2.next()).intValue()));
            }
            if (!ArraysUtil.isEmpty(arrayList)) {
                Collections.sort(arrayList, new Comparator() { // from class: u38
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return UpdatesDataHelper.e((Update) obj, (Update) obj2);
                    }
                });
                longSparseArray.put(dateDayAdd.dayStartMills(), arrayList);
            }
        }
        observableEmitter.onNext(longSparseArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List g(List list, LongSparseArray longSparseArray) throws Exception {
        ArrayList arrayList = new ArrayList();
        long jDayStartMills = DateDay.today().dayStartMills();
        if (longSparseArray.size() > 0 && ArraysUtil.isEmpty((List) longSparseArray.get(jDayStartMills))) {
            longSparseArray.put(jDayStartMills, new ArrayList());
        }
        for (int i = 0; i < longSparseArray.size(); i++) {
            arrayList.add(Long.valueOf(longSparseArray.keyAt(i)));
            List listSingletonList = (List) longSparseArray.valueAt(i);
            if (ArraysUtil.isEmpty(listSingletonList)) {
                listSingletonList = Collections.singletonList(10002);
            }
            arrayList.addAll(listSingletonList);
        }
        Log.d(d, "Load updates Types:" + ArraysUtil.toString((List<?>) list) + " Result:" + arrayList, new Object[0]);
        return arrayList;
    }

    private List<Update> h(DateDay dateDay) {
        List<Update> list;
        ArrayList arrayList = new ArrayList();
        if (!dateDay.before(DateDay.today()) && (list = this.b) != null && !list.isEmpty()) {
            Iterator<Update> it2 = this.b.iterator();
            while (it2.hasNext()) {
                Update next = it2.next();
                Alarm alarm = UpdateParser.toAlarm(next.data);
                if (alarm != null && AlarmLoop.checkAvailableByDay(alarm, dateDay)) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(11, alarm.hour);
                    calendar.set(12, alarm.minutes);
                    calendar.set(14, 0);
                    next.startTime = calendar.getTimeInMillis();
                    arrayList.add(next);
                    if (alarm.days == 0) {
                        it2.remove();
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Update> i(DateDay dateDay, int type) {
        ArrayList arrayList = new ArrayList();
        if (type == 1) {
            arrayList.addAll(h(dateDay));
        } else if (type != 2) {
            arrayList.addAll(k(type, dateDay));
        } else {
            arrayList.addAll(j(dateDay));
        }
        Log.d(d, "Load update data Type:" + type + " Day" + dateDay.str() + "  Result:" + arrayList, new Object[0]);
        return arrayList;
    }

    private List<Update> j(DateDay date) {
        List<Update> list = this.c;
        return (list == null || list.isEmpty()) ? Collections.emptyList() : d(this.c, date);
    }

    @NonNull
    private List<Update> k(int type, DateDay date) {
        return UpdatesManager.getManager().getAll(type, -1, date.dayStartMills(), date.dayEndMills());
    }

    private static List<Update> l(long dateStartMillis, long dateEndMillis, List<Update> reminders) {
        ArrayList arrayList = new ArrayList();
        RecurrenceProcessor recurrenceProcessor = new RecurrenceProcessor();
        Time time = new Time();
        for (Update update : reminders) {
            Event event = UpdateParser.toEvent(update.data);
            try {
                RecurrenceSet recurrenceSet = new RecurrenceSet(event.rrule, null, null, null);
                if (recurrenceSet.hasRecurrence()) {
                    time.set(event.startMillis);
                    try {
                        long[] jArrExpand = recurrenceProcessor.expand(time, recurrenceSet, event.startMillis, dateEndMillis);
                        long j = (event.endMillis - event.startMillis) / 1000;
                        for (long j2 : jArrExpand) {
                            long j3 = j2 + j;
                            if (j3 >= dateStartMillis && dateEndMillis >= j2) {
                                Update updateM3325clone = update.m3325clone();
                                Event event2 = UpdateParser.toEvent(updateM3325clone.data);
                                updateM3325clone.startTime = j2;
                                updateM3325clone.endTime = j3;
                                event2.startMillis = j2;
                                event2.endMillis = j3;
                                arrayList.add(updateM3325clone);
                            }
                        }
                    } catch (DateException e) {
                        e.printStackTrace();
                    } catch (CloneNotSupportedException e2) {
                        e2.printStackTrace();
                    }
                } else {
                    arrayList.add(update);
                }
            } catch (EventRecurrence.InvalidFormatException unused) {
                Log.w(d, "Could not parse RRULE recurrence string: " + event.rrule, new Object[0]);
            }
        }
        return arrayList;
    }

    public boolean deleteUpdate(@NonNull Update update) {
        boolean zIsSuccess = update.hasPin() ? ExchangeCenter.deletePin(this.a).isSuccess() : true;
        if (zIsSuccess && update.type == 1) {
            zIsSuccess = ExchangeCenter.deleteAlarm(Integer.parseInt(update.syncId)).isSuccess();
        } else if (zIsSuccess && update.type == 2) {
            zIsSuccess = ExchangeCenter.deleteEvent(update.syncId).isSuccess();
        } else if (zIsSuccess && update.syncState == 2) {
            zIsSuccess = ExchangeCenter.delUpdate(update).isSuccess();
        }
        if (zIsSuccess) {
            update.syncState = 4;
            UpdatesManager.getManager().save(update);
            EventDao.deleteEventBySyncId(this.a, update.syncId);
        }
        return zIsSuccess;
    }

    public Observable<List<Object>> loadUpdates(@NonNull final List<Integer> types, final DateDay startDay, final int dayCount) {
        Log.d(d, "Load update data,Types: " + ArraysUtil.toString(types) + ",StartDay: " + startDay.str() + ",DayCont: " + dayCount, new Object[0]);
        return Rx.io(new ObservableOnSubscribe() { // from class: s38
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.f(types, startDay, dayCount, observableEmitter);
            }
        }).observable().map(new Function() { // from class: t38
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return UpdatesDataHelper.g(types, (LongSparseArray) obj);
            }
        });
    }
}
