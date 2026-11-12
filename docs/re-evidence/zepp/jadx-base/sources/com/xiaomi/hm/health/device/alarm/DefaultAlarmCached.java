package com.xiaomi.hm.health.device.alarm;

import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.VisibleForTesting;
import com.huami.stress.domain.utils.LogTagUtilsKt;
import com.huami.tools.log.HMLog;
import com.huami.watch.transport.httpsupport.model.DataItem;
import com.xiaomi.hm.health.databases.model.Alarm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0010\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0011\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/device/alarm/DefaultAlarmCached;", "Lcom/xiaomi/hm/health/device/alarm/AlarmCached;", "", "Lcom/xiaomi/hm/health/databases/model/Alarm;", "cached", "", "setMemoryCached", "Landroid/util/SparseArray;", "getMemoryCached", "", "index", "get", "alarm", DataItem.HTTP_METHOD_PUT, "getAll", "alarms", "putAll", "replaceAll", "a", "Landroid/util/SparseArray;", "mMemoryCached", "Lcom/xiaomi/hm/health/device/alarm/AlarmDbCached;", "b", "Lcom/xiaomi/hm/health/device/alarm/AlarmDbCached;", "mDbCached", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DefaultAlarmCached implements AlarmCached {
    private static final int c = 10;

    @NotNull
    private static final String d = "DefaultAlarmCached";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private SparseArray<Alarm> mMemoryCached = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AlarmDbCached mDbCached;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "All illegal data,not replaceAll";
        }
    }

    public DefaultAlarmCached() {
        AlarmDbCached alarmDbCached = new AlarmDbCached();
        this.mDbCached = alarmDbCached;
        for (Alarm alarm : alarmDbCached.getAll()) {
            int i = c - 1;
            int iIntValue = alarm.getIndex().intValue();
            if (iIntValue >= 0 && iIntValue <= i) {
                this.mMemoryCached.put(alarm.getIndex().intValue(), alarm);
            }
        }
    }

    @Override // com.xiaomi.hm.health.device.alarm.AlarmCached
    @Nullable
    public Alarm get(int index) {
        if (index < 0 || index >= c) {
            return null;
        }
        Alarm alarm = this.mMemoryCached.get(index);
        if (alarm != null) {
            return alarm;
        }
        Log.i("AlarmDbCachedTest", "get from db");
        return this.mDbCached.get(index);
    }

    @Override // com.xiaomi.hm.health.device.alarm.AlarmCached
    @NotNull
    public List<Alarm> getAll() {
        if (this.mMemoryCached.size() != c) {
            List<Alarm> all = this.mDbCached.getAll();
            for (Alarm alarm : all) {
                this.mMemoryCached.put(alarm.getIndex().intValue(), alarm);
            }
            return all;
        }
        IntRange intRange = new IntRange(0, this.mMemoryCached.size() - 1);
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it2 = intRange.iterator();
        while (it2.hasNext()) {
            Alarm alarm2 = this.mMemoryCached.get(((IntIterator) it2).nextInt());
            if (alarm2 != null) {
                arrayList.add(alarm2);
            }
        }
        return arrayList;
    }

    @VisibleForTesting
    @NotNull
    public final SparseArray<Alarm> getMemoryCached() {
        return this.mMemoryCached;
    }

    @Override // com.xiaomi.hm.health.device.alarm.AlarmCached
    public void put(@NotNull Alarm alarm) {
        if (alarm.getIndex().intValue() < 0 || alarm.getIndex().intValue() >= c) {
            return;
        }
        this.mMemoryCached.put(alarm.getIndex().intValue(), alarm);
        this.mDbCached.put(alarm);
    }

    @Override // com.xiaomi.hm.health.device.alarm.AlarmCached
    public void putAll(@NotNull List<? extends Alarm> alarms) {
        Iterator<T> it2 = alarms.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Alarm alarm = (Alarm) it2.next();
            int i = c - 1;
            int iIntValue = alarm.getIndex().intValue();
            if (iIntValue >= 0 && iIntValue <= i) {
                Alarm alarm2 = this.mMemoryCached.get(alarm.getIndex().intValue());
                if (alarm2 != null) {
                    alarm.setId(alarm2.getId());
                }
                this.mMemoryCached.put(alarm.getIndex().intValue(), alarm);
            }
        }
        IntRange intRange = new IntRange(0, this.mMemoryCached.size() - 1);
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it3 = intRange.iterator();
        while (it3.hasNext()) {
            Alarm alarm3 = this.mMemoryCached.get(((IntIterator) it3).nextInt());
            if (alarm3 != null) {
                arrayList.add(alarm3);
            }
        }
        this.mDbCached.putAll(arrayList);
    }

    @Override // com.xiaomi.hm.health.device.alarm.AlarmCached
    public void replaceAll(@NotNull List<? extends Alarm> alarms) {
        ArrayList<Alarm> arrayList = new ArrayList();
        Iterator<T> it2 = alarms.iterator();
        while (true) {
            boolean z = true;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            Alarm alarm = (Alarm) next;
            if (alarm.getIndex().intValue() >= 0 && alarm.getIndex().intValue() < c) {
                z = false;
            }
            if (!z) {
                arrayList.add(next);
            }
        }
        if ((!alarms.isEmpty()) && arrayList.isEmpty()) {
            HMLog.info(LogTagUtilsKt.getTAG(this), a.a);
            return;
        }
        this.mMemoryCached.clear();
        for (Alarm alarm2 : arrayList) {
            this.mMemoryCached.put(alarm2.getIndex().intValue(), alarm2);
        }
        this.mDbCached.replaceAll(arrayList);
    }

    public final void setMemoryCached(@NotNull List<? extends Alarm> cached) {
        this.mMemoryCached.clear();
        for (Alarm alarm : cached) {
            this.mMemoryCached.put(alarm.getIndex().intValue(), alarm);
        }
    }

    @VisibleForTesting
    public final void setMemoryCached(@NotNull SparseArray<Alarm> cached) {
        this.mMemoryCached = cached;
        for (Alarm alarm : this.mDbCached.getAll()) {
            this.mMemoryCached.put(alarm.getIndex().intValue(), alarm);
        }
    }
}
