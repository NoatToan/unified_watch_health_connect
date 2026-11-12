package com.xiaomi.hm.health.bt.profile.healthdevice.remind;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.model.HealthRemindConfig;
import com.xiaomi.hm.health.bt.model.SimpleTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB?\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\rR\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0011\u0010\rR\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\rR\"\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\r¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/healthdevice/remind/HMMeasureRemind;", "Lcom/xiaomi/hm/health/bt/model/HealthRemindConfig;", "", "toString", "", "b", "B", "getStatus", "()B", "status", "c", "getStartH1", "setStartH1", "(B)V", "startH1", GoogleApiAvailabilityLight.a, "getStartM1", "setStartM1", "startM1", "e", "getStartH2", "setStartH2", "startH2", "f", "getStartM2", "setStartM2", "startM2", "Lcom/xiaomi/hm/health/bt/model/SimpleTime;", "invalidTime", "<init>", "(BBBBBLcom/xiaomi/hm/health/bt/model/SimpleTime;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HMMeasureRemind extends HealthRemindConfig {
    public static final byte CLOSE = 0;
    public static final byte MORNING = 1;
    public static final byte OPEN = 3;
    public static final byte SLEEPING = 2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final byte status;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private byte startH1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private byte startM1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private byte startH2;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private byte startM2;

    public /* synthetic */ HMMeasureRemind(byte b, byte b2, byte b3, byte b4, byte b5, SimpleTime simpleTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(b, (i & 2) != 0 ? (byte) 0 : b2, (i & 4) != 0 ? (byte) 0 : b3, (i & 8) != 0 ? (byte) 0 : b4, (i & 16) != 0 ? (byte) 0 : b5, simpleTime);
    }

    public final byte getStartH1() {
        return this.startH1;
    }

    public final byte getStartH2() {
        return this.startH2;
    }

    public final byte getStartM1() {
        return this.startM1;
    }

    public final byte getStartM2() {
        return this.startM2;
    }

    public final byte getStatus() {
        return this.status;
    }

    public final void setStartH1(byte b) {
        this.startH1 = b;
    }

    public final void setStartH2(byte b) {
        this.startH2 = b;
    }

    public final void setStartM1(byte b) {
        this.startM1 = b;
    }

    public final void setStartM2(byte b) {
        this.startM2 = b;
    }

    @NotNull
    public String toString() {
        return "HMMeasureRemind[status: " + ((int) this.status) + ", startH1: " + ((int) this.startH1) + ", startM1: " + ((int) this.startM1) + ", startH2: " + ((int) this.startH2) + ", startM2: " + ((int) this.startM2) + ", invalidTime: " + getInvalidTime() + JsonLexerKt.END_LIST;
    }

    public HMMeasureRemind(byte b, byte b2, byte b3, byte b4, byte b5, @NotNull SimpleTime simpleTime) {
        super(simpleTime);
        this.status = b;
        this.startH1 = b2;
        this.startM1 = b3;
        this.startH2 = b4;
        this.startM2 = b5;
    }
}
