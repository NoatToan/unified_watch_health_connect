package com.huami.bluetooth.profile.channel.module.settings.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingWebApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\u001eR*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/SettingsVersion;", "", "", "toString", "", "component1", "component2", "()Ljava/lang/Integer;", "", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "component3", BehaviorTaggingWebApi.g.g, "groupCount", "groupList", "copy", "(ILjava/lang/Integer;Ljava/util/List;)Lcom/huami/bluetooth/profile/channel/module/settings/entity/SettingsVersion;", "hashCode", "other", "", "equals", "a", LogUtil.I, "getProtocolVersion", "()I", "setProtocolVersion", "(I)V", "b", "Ljava/lang/Integer;", "getGroupCount", "setGroupCount", "(Ljava/lang/Integer;)V", "c", "Ljava/util/List;", "getGroupList", "()Ljava/util/List;", "setGroupList", "(Ljava/util/List;)V", "<init>", "(ILjava/lang/Integer;Ljava/util/List;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SettingsVersion {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int protocolVersion;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Integer groupCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private List<? extends SettingsGroupType> groupList;

    public SettingsVersion() {
        this(0, null, null, 7, null);
    }

    public SettingsVersion(int i, @Nullable Integer num, @Nullable List<? extends SettingsGroupType> list) {
        this.protocolVersion = i;
        this.groupCount = num;
        this.groupList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SettingsVersion copy$default(SettingsVersion settingsVersion, int i, Integer num, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = settingsVersion.protocolVersion;
        }
        if ((i2 & 2) != 0) {
            num = settingsVersion.groupCount;
        }
        if ((i2 & 4) != 0) {
            list = settingsVersion.groupList;
        }
        return settingsVersion.copy(i, num, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getProtocolVersion() {
        return this.protocolVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getGroupCount() {
        return this.groupCount;
    }

    @Nullable
    public final List<SettingsGroupType> component3() {
        return this.groupList;
    }

    @NotNull
    public final SettingsVersion copy(int protocolVersion, @Nullable Integer groupCount, @Nullable List<? extends SettingsGroupType> groupList) {
        return new SettingsVersion(protocolVersion, groupCount, groupList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingsVersion)) {
            return false;
        }
        SettingsVersion settingsVersion = (SettingsVersion) other;
        return this.protocolVersion == settingsVersion.protocolVersion && Intrinsics.areEqual(this.groupCount, settingsVersion.groupCount) && Intrinsics.areEqual(this.groupList, settingsVersion.groupList);
    }

    @Nullable
    public final Integer getGroupCount() {
        return this.groupCount;
    }

    @Nullable
    public final List<SettingsGroupType> getGroupList() {
        return this.groupList;
    }

    public final int getProtocolVersion() {
        return this.protocolVersion;
    }

    public int hashCode() {
        int i = this.protocolVersion * 31;
        Integer num = this.groupCount;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        List<? extends SettingsGroupType> list = this.groupList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setGroupCount(@Nullable Integer num) {
        this.groupCount = num;
    }

    public final void setGroupList(@Nullable List<? extends SettingsGroupType> list) {
        this.groupList = list;
    }

    public final void setProtocolVersion(int i) {
        this.protocolVersion = i;
    }

    @NotNull
    public String toString() {
        return "SettingsVersion [protocolVersion: " + this.protocolVersion + ", groupCount: " + this.groupCount + ", groupList: " + this.groupList;
    }

    public /* synthetic */ SettingsVersion(int i, Integer num, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : list);
    }
}
