package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class AlarmSetting {

    @SerializedName("alarmItems")
    @Expose
    private List<AlarmSettingItem> alarmItems = new ArrayList();

    @SerializedName("supportHoliday")
    @Expose
    private boolean supportHoliday;

    @SerializedName("supportIntelligence")
    @Expose
    private boolean supportIntelligence;

    @SerializedName("supportMaxClocks")
    @Expose
    private int supportMaxClocks;

    public boolean equals(Object obj) {
        List<AlarmSettingItem> list;
        List<AlarmSettingItem> list2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AlarmSetting)) {
            return false;
        }
        AlarmSetting alarmSetting = (AlarmSetting) obj;
        return this.supportHoliday == alarmSetting.supportHoliday && ((list = this.alarmItems) == (list2 = alarmSetting.alarmItems) || (list != null && list.equals(list2))) && this.supportIntelligence == alarmSetting.supportIntelligence && this.supportMaxClocks == alarmSetting.supportMaxClocks;
    }

    public List<AlarmSettingItem> getAlarmItems() {
        return this.alarmItems;
    }

    public int getSupportMaxClocks() {
        return this.supportMaxClocks;
    }

    public int hashCode() {
        int i = ((this.supportHoliday ? 1 : 0) + 31) * 31;
        List<AlarmSettingItem> list = this.alarmItems;
        return ((((i + (list == null ? 0 : list.hashCode())) * 31) + (this.supportIntelligence ? 1 : 0)) * 31) + this.supportMaxClocks;
    }

    public boolean isSupportHoliday() {
        return this.supportHoliday;
    }

    public boolean isSupportIntelligence() {
        return this.supportIntelligence;
    }

    public void replaceItem(AlarmSettingItem alarmSettingItem) {
        replaceItem(alarmSettingItem, alarmSettingItem.getId());
    }

    public void setAlarmItems(List<AlarmSettingItem> list) {
        this.alarmItems = list;
    }

    public void setSupportHoliday(boolean z) {
        this.supportHoliday = z;
    }

    public void setSupportIntelligence(boolean z) {
        this.supportIntelligence = z;
    }

    public void setSupportMaxClocks(int i) {
        this.supportMaxClocks = i;
    }

    public void switchState(AlarmSettingItem alarmSettingItem, boolean z) {
        for (AlarmSettingItem alarmSettingItem2 : this.alarmItems) {
            if (alarmSettingItem2.equals(alarmSettingItem)) {
                alarmSettingItem2.setEnable(z);
                if (z) {
                    alarmSettingItem2.setNextAlarmTimeIfReOpen();
                    return;
                } else {
                    alarmSettingItem2.closeAlarm();
                    return;
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AlarmSetting.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append("supportMaxClocks");
        sb.append('=');
        sb.append(this.supportMaxClocks);
        sb.append(',');
        sb.append("supportIntelligence");
        sb.append('=');
        sb.append(this.supportIntelligence);
        sb.append(',');
        sb.append("supportHoliday");
        sb.append('=');
        sb.append(this.supportHoliday);
        sb.append(',');
        sb.append("alarmItems");
        sb.append('=');
        Object obj = this.alarmItems;
        if (obj == null) {
            obj = "<null>";
        }
        sb.append(obj);
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }

    public void updateItem(AlarmSettingItem alarmSettingItem) {
        int size = this.alarmItems.size();
        for (int i = 0; i < size; i++) {
            if (this.alarmItems.get(i).equals(alarmSettingItem)) {
                AlarmSettingItem alarmSettingItemM556clone = alarmSettingItem.m556clone();
                alarmSettingItemM556clone.setEnable(true);
                alarmSettingItemM556clone.setVisible(true);
                alarmSettingItemM556clone.setNextAlarmTimeIfReOpen();
                this.alarmItems.set(i, alarmSettingItemM556clone);
                return;
            }
        }
    }

    public void replaceItem(AlarmSettingItem alarmSettingItem, int i) {
        if (this.alarmItems.get(i) != null) {
            this.alarmItems.set(i, alarmSettingItem.m556clone());
        }
    }

    public void updateItem(AlarmSettingItem alarmSettingItem, int i) {
        if (this.alarmItems.get(i) != null) {
            AlarmSettingItem alarmSettingItemM556clone = alarmSettingItem.m556clone();
            alarmSettingItemM556clone.setEnable(true);
            alarmSettingItemM556clone.setVisible(true);
            alarmSettingItemM556clone.setNextAlarmTimeIfReOpen();
            this.alarmItems.set(i, alarmSettingItemM556clone);
        }
    }
}
