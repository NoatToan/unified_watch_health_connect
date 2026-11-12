package com.huawei.ui.commonui.calendarview;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.core.content.ContextCompat;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.R;
import defpackage.njy;
import defpackage.qrs;
import health.compact.a.util.LogUtil;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class HealthDataMarkDateTrigger implements MarkDateTrigger {
    public static final Parcelable.Creator<HealthDataMarkDateTrigger> CREATOR = new Parcelable.Creator<HealthDataMarkDateTrigger>() { // from class: com.huawei.ui.commonui.calendarview.HealthDataMarkDateTrigger.5
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public HealthDataMarkDateTrigger createFromParcel(Parcel parcel) {
            return new HealthDataMarkDateTrigger(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public HealthDataMarkDateTrigger[] newArray(int i) {
            return new HealthDataMarkDateTrigger[i];
        }
    };
    private static final String TAG = "HealthDataMarkDateTrigger";
    private int[] mDataTypes;
    private int[] mExceptionDataTypes;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public HealthDataMarkDateTrigger(int i) {
        this(new int[]{i});
    }

    public HealthDataMarkDateTrigger(int i, int[] iArr) {
        this(new int[]{i}, iArr);
    }

    public HealthDataMarkDateTrigger(int[] iArr) {
        this.mDataTypes = new int[0];
        this.mExceptionDataTypes = new int[0];
        if (iArr != null) {
            this.mDataTypes = Arrays.copyOf(iArr, iArr.length);
        }
    }

    public HealthDataMarkDateTrigger(int[] iArr, int[] iArr2) {
        this.mDataTypes = new int[0];
        this.mExceptionDataTypes = new int[0];
        if (iArr != null) {
            this.mDataTypes = Arrays.copyOf(iArr, iArr.length);
        }
        if (iArr2 != null) {
            this.mExceptionDataTypes = Arrays.copyOf(iArr2, iArr2.length);
        }
    }

    @Override // com.huawei.ui.commonui.calendarview.MarkDateTrigger
    public void retrieveMarkDate(long j, long j2, final UiCallback<Map<String, HealthCalendar>> uiCallback) {
        final int[] iArrC = qrs.c(this.mDataTypes, this.mExceptionDataTypes);
        if (iArrC == null || iArrC.length == 0) {
            return;
        }
        LogUtil.a(TAG, "retrieveMarkDate, startTime: ", Long.valueOf(j), " endTime: ", Long.valueOf(j2));
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2);
        hiDataReadOption.setType(iArrC);
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.ui.commonui.calendarview.HealthDataMarkDateTrigger.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (obj instanceof SparseArray) {
                    HashMap map = new HashMap();
                    for (int i3 : iArrC) {
                        Object obj2 = ((SparseArray) obj).get(i3);
                        if (njy.b(obj2, HiHealthData.class)) {
                            List list = (List) obj2;
                            if (!njy.e(list)) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    HealthDataMarkDateTrigger.this.readMarkDates((HiHealthData) it.next(), map, i3);
                                }
                            }
                        }
                    }
                    HealthDataMarkDateTrigger.this.filterMarkDates(map);
                    uiCallback.onSuccess(map);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readMarkDates(HiHealthData hiHealthData, HashMap<String, HealthCalendar> map, int i) {
        HealthMark exceptionMark;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(hiHealthData.getStartTime());
        HealthCalendar healthCalendar = new HealthCalendar(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        if (qrs.b(this.mDataTypes, i) != -1) {
            exceptionMark = getNormalMark();
        } else if (qrs.b(this.mExceptionDataTypes, i) == -1) {
            return;
        } else {
            exceptionMark = getExceptionMark();
        }
        if (exceptionMark == null) {
            return;
        }
        healthCalendar.addMark(exceptionMark);
        if (map.get(healthCalendar.toString()) == null) {
            map.put(healthCalendar.toString(), healthCalendar);
        } else {
            mergeCalendarItem(map.get(healthCalendar.toString()), healthCalendar);
        }
    }

    public static HealthMark getNormalMark() {
        HealthMark healthMark = new HealthMark(HealthMark.MarkType.COLOR);
        healthMark.b(ContextCompat.getColor(BaseApplication.getContext(), R.color.calender_day_background));
        return healthMark;
    }

    private HealthMark getExceptionMark() {
        return new HealthMark(HealthMark.MarkType.DRAWABLE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void filterMarkDates(Map<String, HealthCalendar> map) {
        if (map == null) {
            return;
        }
        Iterator<Map.Entry<String, HealthCalendar>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            List<HealthMark> marks = it.next().getValue().getMarks();
            if (njy.e(marks) || (marks.size() == 1 && marks.get(0).h() == HealthMark.MarkType.DRAWABLE)) {
                it.remove();
            }
        }
    }

    public static void mergeCalendarItem(HealthCalendar healthCalendar, HealthCalendar healthCalendar2) {
        List<HealthMark> marks = healthCalendar.getMarks();
        List<HealthMark> marks2 = healthCalendar2.getMarks();
        if (marks == null || marks2 == null || marks.size() != 1 || marks2.size() != 1 || marks.get(0).h() == marks2.get(0).h()) {
            return;
        }
        marks.addAll(marks2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.mDataTypes);
        parcel.writeIntArray(this.mExceptionDataTypes);
    }

    protected HealthDataMarkDateTrigger(Parcel parcel) {
        this.mDataTypes = new int[0];
        this.mExceptionDataTypes = new int[0];
        this.mDataTypes = parcel.createIntArray();
        this.mExceptionDataTypes = parcel.createIntArray();
    }
}
