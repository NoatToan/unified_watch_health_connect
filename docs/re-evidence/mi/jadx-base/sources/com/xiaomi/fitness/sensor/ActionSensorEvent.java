package com.xiaomi.fitness.sensor;

import android.util.Pair;
import android.util.SparseArray;
import androidx.health.connect.client.records.OvulationTestRecord;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003J\u000e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0017\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0002\u0010\u001fR\"\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00030\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/sensor/ActionSensorEvent;", "", MediaStoreUtil.MediaInfo.SIZE, "", "<init>", "(I)V", "actions", "Landroid/util/SparseArray;", "Landroid/util/Pair;", "", "realTimestampNanos", "", "getRealTimestampNanos", "()J", "setRealTimestampNanos", "(J)V", "addActionEvent", "", "event", "accuracy", "value", "getAccuracy", "actionEvent", "getState", "hasValidValues", "", "getValues", "toString", "", "getAccuracyDesc", "second", "(Ljava/lang/Integer;)Ljava/lang/String;", "Companion", "sensor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nActionSensorEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionSensorEvent.kt\ncom/xiaomi/fitness/sensor/ActionSensorEvent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"})
public final class ActionSensorEvent {
    public static final int ACTION_EVENT_INTERACTIVE = 2;
    public static final int ACTION_EVENT_LIGHT = 3;
    public static final int ACTION_EVENT_MOTION = 1;
    public static final int IDX_STATE = 0;
    public static final int STATE_INTERACTIVE = 2;
    public static final int STATE_IN_MOTION = 2;
    public static final int STATE_NON_INTERACTIVE = 1;
    public static final int STATE_NON_MOTION = 1;
    public static final int STATE_UNKNOWN = -1;

    @NotNull
    private final SparseArray<Pair<float[], Integer>> actions;
    private long realTimestampNanos;

    public ActionSensorEvent(int i) {
        this.actions = new SparseArray<>(i);
    }

    private final String getAccuracyDesc(Integer second) {
        if (second == null) {
            return AbstractJsonLexerKt.NULL;
        }
        if (second.intValue() == -1) {
            return "unknown";
        }
        if (second.intValue() == 3) {
            return OvulationTestRecord.Result.HIGH;
        }
        if (second.intValue() == 2) {
            return "normal";
        }
        if (second.intValue() == 1) {
            return "low";
        }
        return second.intValue() == 0 ? "non" : "no define";
    }

    public final void addActionEvent(int event, int accuracy, @Nullable float[] value) {
        this.actions.put(event, new Pair<>(value, Integer.valueOf(accuracy)));
    }

    public final int getAccuracy(int actionEvent) {
        Pair<float[], Integer> pair = this.actions.get(actionEvent);
        if (pair == null) {
            return -1;
        }
        Object second = pair.second;
        Intrinsics.checkNotNullExpressionValue(second, "second");
        return ((Number) second).intValue();
    }

    public final long getRealTimestampNanos() {
        return this.realTimestampNanos;
    }

    public final int getState(int actionEvent) {
        if (actionEvent != 2 && actionEvent != 1) {
            throw new IllegalStateException("this actionEvent not support state.".toString());
        }
        float[] values = getValues(actionEvent);
        if (values != null) {
            if (!(values.length == 0)) {
                return (int) values[0];
            }
        }
        return -1;
    }

    @Nullable
    public final float[] getValues(int actionEvent) {
        Pair<float[], Integer> pair = this.actions.get(actionEvent);
        if (pair != null) {
            return (float[]) pair.first;
        }
        return null;
    }

    public final boolean hasValidValues(int actionEvent) {
        return getAccuracy(actionEvent) > 0;
    }

    public final void setRealTimestampNanos(long j) {
        this.realTimestampNanos = j;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = this.actions.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = this.actions.keyAt(i);
            Pair<float[], Integer> pairValueAt = this.actions.valueAt(i);
            if (pairValueAt != null) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(iKeyAt);
                sb.append(":");
                sb.append(Arrays.toString((float[]) pairValueAt.first));
                sb.append(" ");
                sb.append(getAccuracyDesc((Integer) pairValueAt.second));
            }
        }
        return "ActionSensorEvent{actions=[ " + ((Object) sb) + " ], realTimestampNanos=" + this.realTimestampNanos + "}";
    }
}
