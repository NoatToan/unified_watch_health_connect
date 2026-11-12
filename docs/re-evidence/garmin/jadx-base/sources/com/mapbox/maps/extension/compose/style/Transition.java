package com.mapbox.maps.extension.compose.style;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import java.util.HashMap;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.u0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001b\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u000f\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\u0013\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\b\u0010\u0019\u001a\u00020\u0014H\u0017J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0004\u001a\u00020\u00038F¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\u00020\u00038F¢\u0006\f\u0012\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/Transition;", "Lcom/mapbox/maps/extension/compose/style/HoldsValue;", "durationMillis", "", "delayMillis", "(JJ)V", "value", "Lcom/mapbox/bindgen/Value;", "(Lcom/mapbox/bindgen/Value;)V", "getDelayMillis$annotations", "()V", "getDelayMillis", "()J", "getDurationMillis$annotations", "getDurationMillis", "getValue", "()Lcom/mapbox/bindgen/Value;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "isNotInitial", "toString", "", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class Transition implements HoldsValue {
    public static final Transition DEFAULT;
    public static final Transition INITIAL;
    private final Value value;
    public static final int $stable = 8;

    static {
        Value valueValueOf = Value.valueOf("Transition.INITIAL");
        valueValueOf.getClass();
        INITIAL = new Transition(valueValueOf);
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        DEFAULT = new Transition(valueNullValue);
    }

    public Transition(long j8, long j14) {
        this(new Value((HashMap<String, Value>) u0.d(new p("delay", new Value(j14)), new p("duration", new Value(j8)))));
    }

    public static /* synthetic */ Transition copy$default(Transition transition, Value value, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            value = transition.getValue();
        }
        return transition.copy(value);
    }

    public static /* synthetic */ void getDelayMillis$annotations() {
    }

    public static /* synthetic */ void getDurationMillis$annotations() {
    }

    public final Value component1() {
        return getValue();
    }

    public final Transition copy(Value value) {
        value.getClass();
        return new Transition(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Transition) && s.g(getValue(), ((Transition) other).getValue());
    }

    public final long getDelayMillis() {
        Object contents = getValue().getContents();
        contents.getClass();
        Object obj = ((HashMap) contents).get("delay");
        obj.getClass();
        Object contents2 = ((Value) obj).getContents();
        contents2.getClass();
        return ((Long) contents2).longValue();
    }

    public final long getDurationMillis() {
        Object contents = getValue().getContents();
        contents.getClass();
        Object obj = ((HashMap) contents).get("duration");
        obj.getClass();
        Object contents2 = ((Value) obj).getContents();
        contents2.getClass();
        return ((Long) contents2).longValue();
    }

    @Override // com.mapbox.maps.extension.compose.style.HoldsValue
    public Value getValue() {
        return this.value;
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    @Override // com.mapbox.maps.extension.compose.style.HoldsValue
    public boolean isNotInitial() {
        return this != INITIAL;
    }

    public String toString() {
        return "Transition(value=" + getValue() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ Transition(long j8, long j14, int i14, j jVar) {
        this((i14 & 1) != 0 ? 0L : j8, (i14 & 2) != 0 ? 0L : j14);
    }

    public Transition(Value value) {
        value.getClass();
        this.value = value;
    }
}
