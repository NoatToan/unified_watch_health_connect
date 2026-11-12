package com.huami.bluetooth.profile.channel.module.settings.entity.wearingway.v2;

import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.ww;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\u0007\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0016\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/wearingway/v2/WearingWayV2;", "Lww;", "Ljava/io/Serializable;", "", "key", "", "keyToString", "groupVersion", "I", "getGroupVersion", "()I", "setGroupVersion", "(I)V", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "value", "getWearingWay", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "setWearingWay", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;)V", "wearingWay", "getWearingDirection", "setWearingDirection", "wearingDirection", "<init>", "()V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class WearingWayV2 extends ww {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int GROUP_VERSION = 2;
    private static final int KEY_WEARING_DIRECTION;
    private static final int KEY_WEARING_WAY;

    @NotNull
    private static final HashMap<Integer, String> hashMap;
    private static final long serialVersionUID = 1;
    private int groupVersion = 2;

    /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.settings.entity.wearingway.v2.WearingWayV2$a, reason: from kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/wearingway/v2/WearingWayV2$a;", "", "", "KEY_WEARING_WAY", "I", PluginDeviceInfo.FDESC, "()I", "KEY_WEARING_DIRECTION", PluginDeviceInfo.FMODEL, "GROUP_VERSION", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return WearingWayV2.KEY_WEARING_DIRECTION;
        }

        public final int b() {
            return WearingWayV2.KEY_WEARING_WAY;
        }
    }

    static {
        HashMap<Integer, String> map = new HashMap<>();
        hashMap = map;
        map.put(1, "佩戴方式");
        KEY_WEARING_WAY = 1;
        map.put(2, "佩戴方向");
        KEY_WEARING_DIRECTION = 2;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public int getGroupVersion() {
        return this.groupVersion;
    }

    @Nullable
    public final EnumData getWearingDirection() {
        return getEnum(KEY_WEARING_DIRECTION);
    }

    @Nullable
    public final EnumData getWearingWay() {
        return getEnum(KEY_WEARING_WAY);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @Nullable
    public String keyToString(int key) {
        return hashMap.get(Integer.valueOf(key));
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public void setGroupVersion(int i) {
        this.groupVersion = i;
    }

    public final void setWearingDirection(@Nullable EnumData enumData) {
        setEnum(enumData, KEY_WEARING_DIRECTION);
    }

    public final void setWearingWay(@Nullable EnumData enumData) {
        setEnum(enumData, KEY_WEARING_WAY);
    }
}
