package com.huami.bluetooth.profile.channel.module.sleep;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/DataType;", "Ljava/io/Serializable;", "", "a", LogUtil.I, "getValue", "()I", "value", "<init>", "(I)V", "Companion", "RestingHr", "SleepScore", "SleepStage", "Lcom/huami/bluetooth/profile/channel/module/sleep/DataType$SleepScore;", "Lcom/huami/bluetooth/profile/channel/module/sleep/DataType$RestingHr;", "Lcom/huami/bluetooth/profile/channel/module/sleep/DataType$SleepStage;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class DataType implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/DataType$RestingHr;", "Lcom/huami/bluetooth/profile/channel/module/sleep/DataType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class RestingHr extends DataType {

        @NotNull
        public static final RestingHr INSTANCE = new RestingHr();

        private RestingHr() {
            super(2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/DataType$SleepScore;", "Lcom/huami/bluetooth/profile/channel/module/sleep/DataType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SleepScore extends DataType {

        @NotNull
        public static final SleepScore INSTANCE = new SleepScore();

        private SleepScore() {
            super(1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/DataType$SleepStage;", "Lcom/huami/bluetooth/profile/channel/module/sleep/DataType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SleepStage extends DataType {

        @NotNull
        public static final SleepStage INSTANCE = new SleepStage();

        private SleepStage() {
            super(4, null);
        }
    }

    private DataType(int i) {
        this.value = i;
    }

    public /* synthetic */ DataType(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public final int getValue() {
        return this.value;
    }
}
