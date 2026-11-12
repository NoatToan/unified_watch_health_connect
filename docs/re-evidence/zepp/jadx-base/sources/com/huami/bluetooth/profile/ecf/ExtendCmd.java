package com.huami.bluetooth.profile.ecf;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.utils.ByteUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0010\u0018\u0000 \u00062\u00020\u0001:\t\u0007\b\t\n\u000b\f\r\u000e\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/ExtendCmd;", "Lcom/huami/bluetooth/profile/Request$Command;", "", "value", "<init>", "(I)V", "b", "a", "HrReminder", "HrSleep", "Osa", "Reset", "SecondEarStatisticSync", "SetActivityGoal", "SetOtaProgress", "SportHr", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class ExtendCmd extends Request.Command {

    @Deprecated
    public static final int SIZE_BYTES = 2;

    @NotNull
    private static final a b = new a(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/ExtendCmd$HrReminder;", "Lcom/huami/bluetooth/profile/ecf/ExtendCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class HrReminder extends ExtendCmd {

        @NotNull
        public static final HrReminder INSTANCE = new HrReminder();

        private HrReminder() {
            super(26);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/ExtendCmd$HrSleep;", "Lcom/huami/bluetooth/profile/ecf/ExtendCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class HrSleep extends ExtendCmd {

        @NotNull
        public static final HrSleep INSTANCE = new HrSleep();

        private HrSleep() {
            super(60);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/ExtendCmd$Osa;", "Lcom/huami/bluetooth/profile/ecf/ExtendCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Osa extends ExtendCmd {

        @NotNull
        public static final Osa INSTANCE = new Osa();

        private Osa() {
            super(61);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/ExtendCmd$Reset;", "Lcom/huami/bluetooth/profile/ecf/ExtendCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Reset extends ExtendCmd {

        @NotNull
        public static final Reset INSTANCE = new Reset();

        private Reset() {
            super(11);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/ExtendCmd$SecondEarStatisticSync;", "Lcom/huami/bluetooth/profile/ecf/ExtendCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SecondEarStatisticSync extends ExtendCmd {

        @NotNull
        public static final SecondEarStatisticSync INSTANCE = new SecondEarStatisticSync();

        private SecondEarStatisticSync() {
            super(58);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/ExtendCmd$SetActivityGoal;", "Lcom/huami/bluetooth/profile/ecf/ExtendCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetActivityGoal extends ExtendCmd {

        @NotNull
        public static final SetActivityGoal INSTANCE = new SetActivityGoal();

        private SetActivityGoal() {
            super(37);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/ExtendCmd$SetOtaProgress;", "Lcom/huami/bluetooth/profile/ecf/ExtendCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetOtaProgress extends ExtendCmd {

        @NotNull
        public static final SetOtaProgress INSTANCE = new SetOtaProgress();

        private SetOtaProgress() {
            super(38);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/ExtendCmd$SportHr;", "Lcom/huami/bluetooth/profile/ecf/ExtendCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SportHr extends ExtendCmd {

        @NotNull
        public static final SportHr INSTANCE = new SportHr();

        private SportHr() {
            super(34);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/huami/bluetooth/profile/ecf/ExtendCmd$a", "", "", "value", "", "a", "SIZE_BYTES", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final byte[] a(int value) {
            return ByteUtilsKt.toByteArray(value, 2);
        }
    }

    public ExtendCmd(int i) {
        super(b.a(i));
    }
}
