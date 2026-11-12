package com.huami.bluetooth.profile.channel.module.settings.entity.wearingway.v2;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.settings.entity.wearingway.WearingWay;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/wearingway/v2/WearingWayV2;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/wearingway/WearingWay;", "Ljava/io/Serializable;", "", "key", "", "keyToString", "e", LogUtil.I, "getGroupVersion", "()I", "setGroupVersion", "(I)V", "groupVersion", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "value", "getWearingWay", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "setWearingWay", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;)V", "wearingWay", "getWearingDirection", "setWearingDirection", "wearingDirection", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class WearingWayV2 extends WearingWay implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int GROUP_VERSION = 2;

    @NotNull
    private static final HashMap<Integer, String> f;
    private static final int g;
    private static final int h;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int groupVersion = 2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R5\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/wearingway/v2/WearingWayV2$Companion;", "", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "hashMap", "Ljava/util/HashMap;", "getHashMap", "()Ljava/util/HashMap;", "KEY_WEARING_WAY", LogUtil.I, "getKEY_WEARING_WAY", "()I", "KEY_WEARING_DIRECTION", "getKEY_WEARING_DIRECTION", "GROUP_VERSION", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HashMap<Integer, String> getHashMap() {
            return WearingWayV2.f;
        }

        public final int getKEY_WEARING_DIRECTION() {
            return WearingWayV2.h;
        }

        public final int getKEY_WEARING_WAY() {
            return WearingWayV2.g;
        }
    }

    static {
        HashMap<Integer, String> map = new HashMap<>();
        f = map;
        map.put(1, "佩戴方式");
        g = 1;
        map.put(2, "佩戴方向");
        h = 2;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public int getGroupVersion() {
        return this.groupVersion;
    }

    @Nullable
    public final EnumData getWearingDirection() {
        return getEnum(h);
    }

    @Nullable
    public final EnumData getWearingWay() {
        return getEnum(g);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @Nullable
    public String keyToString(int key) {
        return f.get(Integer.valueOf(key));
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public void setGroupVersion(int i) {
        this.groupVersion = i;
    }

    public final void setWearingDirection(@Nullable EnumData enumData) {
        setEnum(enumData, h);
    }

    public final void setWearingWay(@Nullable EnumData enumData) {
        setEnum(enumData, g);
    }
}
