package com.huami.assistant.arch;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.assistant.alarm.AlarmLoop;
import com.huami.watch.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class AlarmRepeatSettingViewModel extends AndroidViewModel {
    public static final String TAG = "Alarm-AlarmRepeatSettingViewModel";
    private MutableLiveData<Boolean[]> a;
    private Boolean[] b;

    public AlarmRepeatSettingViewModel(@NonNull Application application) {
        super(application);
        MutableLiveData<Boolean[]> mutableLiveData = new MutableLiveData<>();
        this.a = mutableLiveData;
        Boolean bool = Boolean.FALSE;
        this.b = new Boolean[]{bool, bool, bool, bool, bool, bool, bool, bool};
        mutableLiveData.setValue(new Boolean[]{bool, bool, bool, bool, bool, bool, bool, bool});
    }

    public int getDayMask() {
        int i;
        Boolean[] value = this.a.getValue();
        if (value == null || value.length <= 0) {
            i = 0;
        } else {
            int length = value.length;
            i = 0;
            for (int i2 = 1; i2 < length; i2++) {
                if (value[i2].booleanValue()) {
                    i |= AlarmLoop.WEEK_MASK[i2 - 1];
                }
            }
        }
        Log.d(TAG, "day : " + i, new Object[0]);
        return i;
    }

    public MutableLiveData<Boolean[]> getWeekCheckedLiveData() {
        return this.a;
    }

    public void invert(int position) {
        Boolean[] value = this.a.getValue();
        if (value == null || value.length <= 0) {
            return;
        }
        if (position == 0 && !value[0].booleanValue()) {
            Boolean bool = Boolean.FALSE;
            value = new Boolean[]{Boolean.TRUE, bool, bool, bool, bool, bool, bool, bool};
        } else if (position > 0) {
            value[position] = Boolean.valueOf(!value[position].booleanValue());
            boolean z = false;
            for (int i = 1; i < value.length; i++) {
                z = z || value[i].booleanValue();
            }
            value[0] = Boolean.valueOf(!z);
        }
        this.a.setValue(value);
    }

    public boolean isRepeatDayChanged() {
        boolean z = !Arrays.equals(this.a.getValue(), this.b);
        Log.d(TAG, "Repeat day changed : " + z, new Object[0]);
        return z;
    }

    public void setWeekChecked(int days) {
        Boolean[] value = this.a.getValue();
        if (value == null || value.length <= 0) {
            return;
        }
        value[0] = Boolean.valueOf(days == 0);
        this.b[0] = Boolean.valueOf(days == 0);
        for (int i = 7; i >= 1; i--) {
            if (((64 >> (7 - i)) & days) != 0) {
                Boolean bool = Boolean.TRUE;
                value[i] = bool;
                this.b[i] = bool;
            }
        }
        this.a.setValue(value);
    }
}
