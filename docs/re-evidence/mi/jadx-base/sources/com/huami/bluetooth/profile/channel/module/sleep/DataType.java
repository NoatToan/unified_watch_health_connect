package com.huami.bluetooth.profile.channel.module.sleep;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \t2\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/DataType;", "Ljava/io/Serializable;", "", "value", "I", "getValue", "()I", "<init>", "(I)V", "Companion", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONON, PluginDeviceInfo.FICONOFF, "Lcom/huami/bluetooth/profile/channel/module/sleep/DataType$b;", "Lcom/huami/bluetooth/profile/channel/module/sleep/DataType$c;", "Lcom/huami/bluetooth/profile/channel/module/sleep/DataType$d;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public abstract class DataType implements Serializable {
    private static final long serialVersionUID = 1;
    private final int value;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/DataType$b;", "Lcom/huami/bluetooth/profile/channel/module/sleep/DataType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends DataType {

        @NotNull
        public static final b t = new b();

        public b() {
            super(2, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/DataType$c;", "Lcom/huami/bluetooth/profile/channel/module/sleep/DataType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class c extends DataType {

        @NotNull
        public static final c t = new c();

        public c() {
            super(1, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/DataType$d;", "Lcom/huami/bluetooth/profile/channel/module/sleep/DataType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class d extends DataType {

        @NotNull
        public static final d t = new d();

        public d() {
            super(4, null);
        }
    }

    public /* synthetic */ DataType(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public final int getValue() {
        return this.value;
    }

    private DataType(int i) {
        this.value = i;
    }
}
