package com.huami.bluetooth.profile.ecf.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0007\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/AppState;", "", "", "a", "B", "getValue$bluetooth_release", "()B", "value", "<init>", "(B)V", "SportOngoing", "StartSport", "StopSport", "Lcom/huami/bluetooth/profile/ecf/data/AppState$StartSport;", "Lcom/huami/bluetooth/profile/ecf/data/AppState$StopSport;", "Lcom/huami/bluetooth/profile/ecf/data/AppState$SportOngoing;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class AppState {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final byte value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/AppState$SportOngoing;", "Lcom/huami/bluetooth/profile/ecf/data/AppState;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SportOngoing extends AppState {

        @NotNull
        public static final SportOngoing INSTANCE = new SportOngoing();

        private SportOngoing() {
            super((byte) 3, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/AppState$StartSport;", "Lcom/huami/bluetooth/profile/ecf/data/AppState;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class StartSport extends AppState {

        @NotNull
        public static final StartSport INSTANCE = new StartSport();

        private StartSport() {
            super((byte) 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/AppState$StopSport;", "Lcom/huami/bluetooth/profile/ecf/data/AppState;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class StopSport extends AppState {

        @NotNull
        public static final StopSport INSTANCE = new StopSport();

        private StopSport() {
            super((byte) 2, null);
        }
    }

    private AppState(byte b) {
        this.value = b;
    }

    public /* synthetic */ AppState(byte b, DefaultConstructorMarker defaultConstructorMarker) {
        this(b);
    }

    /* JADX INFO: renamed from: getValue$bluetooth_release, reason: from getter */
    public final byte getValue() {
        return this.value;
    }
}
