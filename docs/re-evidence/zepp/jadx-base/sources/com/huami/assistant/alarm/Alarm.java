package com.huami.assistant.alarm;

import androidx.annotation.NonNull;
import java.io.Serializable;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
public class Alarm implements Serializable, Comparable<Alarm> {
    public String label;
    public long id = -1;
    public int hour = 8;
    public int minutes = 0;
    public boolean enabled = true;
    public int days = 0;

    public boolean equals(Object o) {
        return (o instanceof Alarm) && this.id == ((Alarm) o).id;
    }

    public String toString() {
        return "<id: " + this.id + ", hour: " + this.hour + ", minutes: " + this.minutes + ", label: '" + this.label + "', enabled: " + this.enabled + ", days: " + this.days + Typography.greater;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull Alarm alarm) {
        return ((this.hour * 60) + this.minutes) - ((alarm.hour * 60) + alarm.minutes);
    }
}
