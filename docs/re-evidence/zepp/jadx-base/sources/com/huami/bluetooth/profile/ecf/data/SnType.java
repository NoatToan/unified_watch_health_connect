package com.huami.bluetooth.profile.ecf.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\t\u001a\u00020\u00048\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/SnType;", "", "", "toString", "", "a", "B", "getValue$bluetooth_release", "()B", "value", "<init>", "(B)V", "Case", "Left", "Right", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class SnType {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final byte value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/SnType$Case;", "Lcom/huami/bluetooth/profile/ecf/data/SnType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Case extends SnType {

        @NotNull
        public static final Case INSTANCE = new Case();

        private Case() {
            super((byte) 2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/SnType$Left;", "Lcom/huami/bluetooth/profile/ecf/data/SnType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Left extends SnType {

        @NotNull
        public static final Left INSTANCE = new Left();

        private Left() {
            super((byte) 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/SnType$Right;", "Lcom/huami/bluetooth/profile/ecf/data/SnType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Right extends SnType {

        @NotNull
        public static final Right INSTANCE = new Right();

        private Right() {
            super((byte) 1);
        }
    }

    public SnType(byte b) {
        this.value = b;
    }

    /* JADX INFO: renamed from: getValue$bluetooth_release, reason: from getter */
    public final byte getValue() {
        return this.value;
    }

    @NotNull
    public String toString() {
        return "SnType(value = " + ((int) this.value) + ')';
    }
}
