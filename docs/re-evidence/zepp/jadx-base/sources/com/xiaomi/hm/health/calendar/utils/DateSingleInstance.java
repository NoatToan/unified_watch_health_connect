package com.xiaomi.hm.health.calendar.utils;

import android.util.Log;
import android.util.SparseArray;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourseItem;
import com.xiaomi.hm.health.traininglib.util.TrainingDateUtils;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class DateSingleInstance {
    private static DateSingleInstance m = null;
    private static final String n = "DateSingleInstance";
    private List<DateBeanWrapper<TrainingCourseItem>> b;
    private boolean c = false;
    private boolean d = false;
    private int e = 0;
    private SparseArray<Boolean> f = new SparseArray<>();
    private int g = 0;
    private int h = 0;
    private int i = 0;
    private OnWeekDayChangeListener j = new a();
    private OnDayChangeListener k = new b();
    private OnWeekDayClickListener l = new c();
    private Date a = TrainingDateUtils.getNow();

    public interface OnDayChangeListener {
        void onDayChange(DateBeanWrapper<TrainingCourseItem> dateBeanWrapper);
    }

    public interface OnWeekDayChangeListener {
        void onWeekDayChange();
    }

    public interface OnWeekDayClickListener {
        void onWeekDayClick(DateBeanWrapper<TrainingCourseItem> dateBeanWrapper);
    }

    public class a implements OnWeekDayChangeListener {
        public a() {
        }

        @Override // com.xiaomi.hm.health.calendar.utils.DateSingleInstance.OnWeekDayChangeListener
        public void onWeekDayChange() {
        }
    }

    public class b implements OnDayChangeListener {
        public b() {
        }

        @Override // com.xiaomi.hm.health.calendar.utils.DateSingleInstance.OnDayChangeListener
        public void onDayChange(DateBeanWrapper<TrainingCourseItem> dateBeanWrapper) {
            Log.i(DateSingleInstance.n, "onDayChange:" + dateBeanWrapper.toString());
        }
    }

    public class c implements OnWeekDayClickListener {
        public c() {
        }

        @Override // com.xiaomi.hm.health.calendar.utils.DateSingleInstance.OnWeekDayClickListener
        public void onWeekDayClick(DateBeanWrapper<TrainingCourseItem> dateBeanWrapper) {
            Log.i(DateSingleInstance.n, "onDayChange:" + dateBeanWrapper.toString());
        }
    }

    private DateSingleInstance() {
    }

    public static DateSingleInstance getInstance() {
        if (m == null) {
            m = new DateSingleInstance();
        }
        return m;
    }

    public int getCanScrollMonthTitleCount() {
        if (this.c || this.d) {
            this.i = 0;
            List<DateBeanWrapper<TrainingCourseItem>> list = this.b;
            if (list != null && list.size() > 0) {
                for (int i = 6; i < this.b.size(); i += 7) {
                    Date date = this.b.get(i).getDate();
                    Boolean bool = this.f.get(i / 7);
                    if (bool != null && bool.booleanValue()) {
                        this.i++;
                    }
                    if (date.getTime() >= this.a.getTime()) {
                        break;
                    }
                }
            }
        }
        return this.i;
    }

    public int getCanScrollWeekCount() {
        if (this.c || this.d) {
            this.h = 0;
            List<DateBeanWrapper<TrainingCourseItem>> list = this.b;
            if (list != null && list.size() > 0) {
                for (int i = 6; i < this.b.size(); i += 7) {
                    if (this.b.get(i).getDate().getTime() >= this.a.getTime()) {
                        this.h = i / 7;
                        break;
                    }
                }
            }
        }
        return this.h;
    }

    public Date getChooseDate() {
        return this.a;
    }

    public int getMonthTitleCount() {
        if (this.c) {
            this.g = 0;
            List<DateBeanWrapper<TrainingCourseItem>> list = this.b;
            if (list != null && list.size() > 0) {
                int i = 0;
                for (int i2 = 0; i2 < this.b.size(); i2++) {
                    if (i2 == 0 || CalendarDateUtils.getDay(this.b.get(i2)) == 1) {
                        if (i == 0 || i2 - i >= 7) {
                            this.g++;
                            this.f.put(i2 / 7, Boolean.TRUE);
                        }
                        i = i2;
                    }
                }
            }
        }
        return this.g;
    }

    public OnWeekDayChangeListener getOnWeekDayChangeListener() {
        return this.j;
    }

    public List<DateBeanWrapper<TrainingCourseItem>> getWeekAt(int i) {
        int i2 = i * 7;
        return this.b.subList(i2, i2 + 7);
    }

    public int getWeekCount() {
        if (this.c) {
            this.e = 0;
            List<DateBeanWrapper<TrainingCourseItem>> list = this.b;
            if (list != null && list.size() > 0) {
                this.e = (int) Math.ceil(((double) this.b.size()) / 7.0d);
            }
        }
        return this.e;
    }

    public void setChooseDate(Date date) {
        this.d = true;
        this.a = date;
    }

    public void setChooseDateWrapper(DateBeanWrapper<TrainingCourseItem> dateBeanWrapper, boolean z) {
        OnWeekDayClickListener onWeekDayClickListener;
        setChooseDate(dateBeanWrapper.getDate());
        OnDayChangeListener onDayChangeListener = this.k;
        if (onDayChangeListener != null) {
            onDayChangeListener.onDayChange(dateBeanWrapper);
        }
        if (z || (onWeekDayClickListener = this.l) == null) {
            return;
        }
        onWeekDayClickListener.onWeekDayClick(dateBeanWrapper);
    }

    public void setDateWrapperList(List<DateBeanWrapper<TrainingCourseItem>> list) {
        this.c = true;
        this.d = true;
        this.b = list;
    }

    public void setDayChangeListener(OnDayChangeListener onDayChangeListener) {
        this.k = onDayChangeListener;
    }

    public void setNextWeekDate(boolean z) {
        if (z) {
            setChooseDate(TrainingDateUtils.nextWeek(this.a));
        } else {
            setChooseDate(TrainingDateUtils.preWeek(this.a));
        }
    }

    public void setOnWeekDayChangeListener(OnWeekDayChangeListener onWeekDayChangeListener) {
        this.j = onWeekDayChangeListener;
    }

    public void setOnWeekDayClickListener(OnWeekDayClickListener onWeekDayClickListener) {
        this.l = onWeekDayClickListener;
    }
}
