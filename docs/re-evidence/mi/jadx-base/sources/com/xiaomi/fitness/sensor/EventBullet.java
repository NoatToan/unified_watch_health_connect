package com.xiaomi.fitness.sensor;

import android.os.SystemClock;
import com.mibi.sdk.component.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u00052\n\u0010\n\u001a\u00020\u000b\"\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u0005H\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0096\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/sensor/EventBullet;", "", "<init>", "()V", "event", "", "getEvent", "()I", "setEvent", "(I)V", Constants.KEY_RECHARGE_VALUES, "", "getValues", "()[F", "setValues", "([F)V", "accuracy", "getAccuracy$annotations", "getAccuracy", "setAccuracy", "timestamp", "", "getTimestamp", "()J", "setTimestamp", "(J)V", "reset", "", "", "hashCode", "equals", "", "other", "Companion", "sensor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EventBullet {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private transient int accuracy;
    private int event;
    private transient long timestamp;
    public float[] values;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sensor/EventBullet$Companion;", "", "<init>", "()V", "create", "Lcom/xiaomi/fitness/sensor/EventBullet;", "event", "", "accuracy", Constants.KEY_RECHARGE_VALUES, "", "sensor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EventBullet create(int event, int accuracy, @NotNull float[] values) {
            Intrinsics.checkNotNullParameter(values, "values");
            EventBullet eventBullet = new EventBullet(null);
            eventBullet.setEvent(event);
            eventBullet.setAccuracy(accuracy);
            eventBullet.setValues(values);
            eventBullet.setTimestamp(SystemClock.elapsedRealtimeNanos());
            return eventBullet;
        }
    }

    private EventBullet() {
    }

    public /* synthetic */ EventBullet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getAccuracy$annotations() {
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EventBullet) && this.event == ((EventBullet) other).event;
    }

    public final int getAccuracy() {
        return this.accuracy;
    }

    public final int getEvent() {
        return this.event;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final float[] getValues() {
        float[] fArr = this.values;
        if (fArr != null) {
            return fArr;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Constants.KEY_RECHARGE_VALUES);
        return null;
    }

    public int hashCode() {
        return this.event;
    }

    public final void reset(int accuracy, @NotNull float... values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.accuracy = accuracy;
        setValues(values);
        this.timestamp = SystemClock.elapsedRealtimeNanos();
    }

    public final void setAccuracy(int i) {
        this.accuracy = i;
    }

    public final void setEvent(int i) {
        this.event = i;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    public final void setValues(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<set-?>");
        this.values = fArr;
    }
}
