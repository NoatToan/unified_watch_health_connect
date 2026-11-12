package com.huami.assistant.ui.v2.parse;

import android.text.format.Time;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.calendar.EventRecurrence;
import com.huami.assistant.calendar.RecurrenceModel;
import com.huami.assistant.util.RRuleUtil;
import com.huami.bluetooth.profile.channel.module.schedule.RepeatMode;
import com.xiaomi.hm.health.device.settings.todo.datasource.impl.RemoteDataSourceImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/assistant/ui/v2/parse/RruleEncode;", "", "", "encode", "", "a", "J", RemoteDataSourceImpl.EVENT_DATA_KEY_REPEAT_MODE, "b", "startTime", "c", "repeatStopTime", "Landroid/text/format/Time;", GoogleApiAvailabilityLight.a, "Landroid/text/format/Time;", "mStartTime", "<init>", "(JJJ)V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class RruleEncode {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long repeatMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long startTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long repeatStopTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Time mStartTime;

    public RruleEncode(long j, long j2, long j3) {
        this.repeatMode = j;
        this.startTime = j2;
        this.repeatStopTime = j3;
        Time time = new Time();
        time.set(j2 * ((long) 1000));
        Unit unit = Unit.INSTANCE;
        this.mStartTime = time;
    }

    @NotNull
    public final String encode() {
        int i;
        if (this.repeatMode == 0) {
            return "";
        }
        RecurrenceModel recurrenceModel = new RecurrenceModel();
        recurrenceModel.interval = 1;
        boolean[] zArr = new boolean[7];
        recurrenceModel.weeklyByDayOfWeek = zArr;
        zArr[this.mStartTime.weekDay] = true;
        Time time = new Time();
        time.set(this.repeatStopTime * ((long) 1000));
        Unit unit = Unit.INSTANCE;
        recurrenceModel.endDate = time;
        EventRecurrence eventRecurrence = new EventRecurrence();
        if (this.repeatMode == RepeatMode.EveryYear.getFlag()) {
            recurrenceModel.freq = 3;
        } else if (this.repeatMode == RepeatMode.EveryMonth.getFlag()) {
            recurrenceModel.freq = 2;
        } else if (this.repeatMode == RepeatMode.Fortnight.getFlag()) {
            recurrenceModel.interval = 2;
            recurrenceModel.freq = 1;
        } else if (this.repeatMode == RepeatMode.EveryWeek.getFlag()) {
            recurrenceModel.freq = 1;
        } else {
            Boolean bool = Boolean.FALSE;
            Boolean[] boolArr = {bool, bool, bool, bool, bool, bool, bool};
            if ((this.repeatMode & ((long) RepeatMode.Monday.getFlag())) != 0) {
                boolArr[1] = Boolean.TRUE;
            }
            if ((this.repeatMode & ((long) RepeatMode.Tuesday.getFlag())) != 0) {
                boolArr[2] = Boolean.TRUE;
            }
            if ((this.repeatMode & ((long) RepeatMode.Wednesday.getFlag())) != 0) {
                boolArr[3] = Boolean.TRUE;
            }
            if ((this.repeatMode & ((long) RepeatMode.Thursday.getFlag())) != 0) {
                boolArr[4] = Boolean.TRUE;
            }
            if ((this.repeatMode & ((long) RepeatMode.Friday.getFlag())) != 0) {
                boolArr[5] = Boolean.TRUE;
            }
            if ((this.repeatMode & ((long) RepeatMode.Saturday.getFlag())) != 0) {
                boolArr[6] = Boolean.TRUE;
            }
            if ((this.repeatMode & ((long) RepeatMode.Sunday.getFlag())) != 0) {
                i = 0;
                boolArr[0] = Boolean.TRUE;
            } else {
                i = 0;
            }
            if (ArraysKt___ArraysKt.contains(boolArr, bool)) {
                recurrenceModel.freq = 1;
                if (ArraysKt___ArraysKt.contains(boolArr, Boolean.TRUE)) {
                    recurrenceModel.weeklyByDayOfWeek = ArraysKt___ArraysKt.toBooleanArray(boolArr);
                }
            } else {
                recurrenceModel.freq = i;
            }
        }
        try {
            RRuleUtil.copyModelToEventRecurrence(recurrenceModel, eventRecurrence);
            eventRecurrence.setStartDate(this.mStartTime);
            return eventRecurrence.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
