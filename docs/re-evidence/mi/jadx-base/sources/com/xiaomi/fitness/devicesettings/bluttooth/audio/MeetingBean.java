package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import com.xiaomi.smarthome.homeroom.model.Home;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010$J\t\u00100\u001a\u00020\u0007HÆ\u0003Jr\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0007HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u001cR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0017\"\u0004\b'\u0010\u0019¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/MeetingBean;", "", "time", "", Home.JSON_KEY_ADDRESS, "", "status", "", "title", "newTitle", "fdsName", "talkList", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/TalkBean;", "scene", "type", "<init>", "(JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;I)V", "getTime", "()J", "getAddress", "()Ljava/lang/String;", "getStatus", "()I", "setStatus", "(I)V", "getTitle", "setTitle", "(Ljava/lang/String;)V", "getNewTitle", "setNewTitle", "getFdsName", "setFdsName", "getTalkList", "()Ljava/util/List;", "getScene", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getType", "setType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;I)Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/MeetingBean;", "equals", "", "other", "hashCode", "toString", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MeetingBean {

    @NotNull
    private final String address;

    @Nullable
    private String fdsName;

    @NotNull
    private String newTitle;

    @Nullable
    private final Integer scene;
    private int status;

    @NotNull
    private final List<TalkBean> talkList;
    private final long time;

    @NotNull
    private String title;
    private int type;

    public MeetingBean(long j, @NotNull String address, int i, @NotNull String title, @NotNull String newTitle, @Nullable String str, @NotNull List<TalkBean> talkList, @Nullable Integer num, int i2) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(newTitle, "newTitle");
        Intrinsics.checkNotNullParameter(talkList, "talkList");
        this.time = j;
        this.address = address;
        this.status = i;
        this.title = title;
        this.newTitle = newTitle;
        this.fdsName = str;
        this.talkList = talkList;
        this.scene = num;
        this.type = i2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNewTitle() {
        return this.newTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFdsName() {
        return this.fdsName;
    }

    @NotNull
    public final List<TalkBean> component7() {
        return this.talkList;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getScene() {
        return this.scene;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final MeetingBean copy(long time, @NotNull String address, int status, @NotNull String title, @NotNull String newTitle, @Nullable String fdsName, @NotNull List<TalkBean> talkList, @Nullable Integer scene, int type) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(newTitle, "newTitle");
        Intrinsics.checkNotNullParameter(talkList, "talkList");
        return new MeetingBean(time, address, status, title, newTitle, fdsName, talkList, scene, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeetingBean)) {
            return false;
        }
        MeetingBean meetingBean = (MeetingBean) other;
        return this.time == meetingBean.time && Intrinsics.areEqual(this.address, meetingBean.address) && this.status == meetingBean.status && Intrinsics.areEqual(this.title, meetingBean.title) && Intrinsics.areEqual(this.newTitle, meetingBean.newTitle) && Intrinsics.areEqual(this.fdsName, meetingBean.fdsName) && Intrinsics.areEqual(this.talkList, meetingBean.talkList) && Intrinsics.areEqual(this.scene, meetingBean.scene) && this.type == meetingBean.type;
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final String getFdsName() {
        return this.fdsName;
    }

    @NotNull
    public final String getNewTitle() {
        return this.newTitle;
    }

    @Nullable
    public final Integer getScene() {
        return this.scene;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final List<TalkBean> getTalkList() {
        return this.talkList;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((((((Long.hashCode(this.time) * 31) + this.address.hashCode()) * 31) + Integer.hashCode(this.status)) * 31) + this.title.hashCode()) * 31) + this.newTitle.hashCode()) * 31;
        String str = this.fdsName;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.talkList.hashCode()) * 31;
        Integer num = this.scene;
        return ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + Integer.hashCode(this.type);
    }

    public final void setFdsName(@Nullable String str) {
        this.fdsName = str;
    }

    public final void setNewTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.newTitle = str;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "MeetingBean(time=" + this.time + ", address=" + this.address + ", status=" + this.status + ", title=" + this.title + ", newTitle=" + this.newTitle + ", fdsName=" + this.fdsName + ", talkList=" + this.talkList + ", scene=" + this.scene + ", type=" + this.type + ")";
    }

    public /* synthetic */ MeetingBean(long j, String str, int i, String str2, String str3, String str4, List list, Integer num, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, i, str2, str3, (i3 & 32) != 0 ? null : str4, (i3 & 64) != 0 ? new ArrayList() : list, (i3 & 128) != 0 ? null : num, (i3 & 256) != 0 ? 0 : i2);
    }
}
