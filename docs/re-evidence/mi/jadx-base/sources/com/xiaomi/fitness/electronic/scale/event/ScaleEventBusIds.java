package com.xiaomi.fitness.electronic.scale.event;

import com.miui.circulate.device.api.Column;
import defpackage.u7r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds;", "", "<init>", "()V", "OnUserAddEvent", "OnUserModifyEvent", "OnUserDeleteEvent", "OnBodyCompositionSDKMeasureEvent", "OnEcoPaketEvent", "RefreshWeightResultData", "OnBatteryChangeEvent", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScaleEventBusIds {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnBatteryChangeEvent;", "", Column.BATTERY, "", "<init>", "(I)V", "getBattery", "()I", "setBattery", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnBatteryChangeEvent {
        private int battery;

        public OnBatteryChangeEvent(int i) {
            this.battery = i;
        }

        public final int getBattery() {
            return this.battery;
        }

        public final void setBattery(int i) {
            this.battery = i;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0006\"\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnBodyCompositionSDKMeasureEvent;", "", "isSuccess", "", "<init>", "(Z)V", "()Z", "setSuccess", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnBodyCompositionSDKMeasureEvent {
        private boolean isSuccess;

        public OnBodyCompositionSDKMeasureEvent(boolean z) {
            this.isSuccess = z;
        }

        /* JADX INFO: renamed from: isSuccess, reason: from getter */
        public final boolean getIsSuccess() {
            return this.isSuccess;
        }

        public final void setSuccess(boolean z) {
            this.isSuccess = z;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnEcoPaketEvent;", "", "", "did", "Ljava/lang/String;", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "", "type", "I", "getType", "()I", "setType", "(I)V", "Lu7r;", "packet", "Lu7r;", "getPacket", "()Lu7r;", "setPacket", "(Lu7r;)V", "<init>", "(Ljava/lang/String;ILu7r;)V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class OnEcoPaketEvent {

        @NotNull
        private String did;

        @Nullable
        private u7r packet;
        private int type;

        public OnEcoPaketEvent(@NotNull String did, int i, @Nullable u7r u7rVar) {
            Intrinsics.checkNotNullParameter(did, "did");
            this.did = did;
            this.type = i;
            this.packet = u7rVar;
        }

        @NotNull
        public final String getDid() {
            return this.did;
        }

        @Nullable
        public final u7r getPacket() {
            return this.packet;
        }

        public final int getType() {
            return this.type;
        }

        public final void setDid(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.did = str;
        }

        public final void setPacket(@Nullable u7r u7rVar) {
            this.packet = u7rVar;
        }

        public final void setType(int i) {
            this.type = i;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnUserAddEvent;", "", "vId", "", "<init>", "(Ljava/lang/Long;)V", "getVId", "()Ljava/lang/Long;", "setVId", "Ljava/lang/Long;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnUserAddEvent {

        @Nullable
        private Long vId;

        public OnUserAddEvent(@Nullable Long l) {
            this.vId = l;
        }

        @Nullable
        public final Long getVId() {
            return this.vId;
        }

        public final void setVId(@Nullable Long l) {
            this.vId = l;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnUserDeleteEvent;", "", "<init>", "()V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnUserDeleteEvent {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnUserModifyEvent;", "", "<init>", "()V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnUserModifyEvent {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$RefreshWeightResultData;", "", "<init>", "()V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RefreshWeightResultData {
    }
}
