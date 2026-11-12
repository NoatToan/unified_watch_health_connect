package com.huami.sleepassistant.apilib.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import defpackage.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\f\u001a\u00020\u0007HÆ\u0003JK\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00072\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\u000f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0010\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0012\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b&\u0010\"¨\u0006)"}, d2 = {"Lcom/huami/sleepassistant/apilib/bean/SleepServiceBean;", "", "", "component1", "component2", "", "component3", "", "component4", "", "Lcom/huami/sleepassistant/apilib/bean/SleepMusicBean;", "component5", "component6", "type", "action", "totalTime", "albumNo", "data", "appVersion", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getAction", "J", "getTotalTime", "()J", LogUtil.I, "getAlbumNo", "()I", "Ljava/util/List;", "getData", "()Ljava/util/List;", "getAppVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;JILjava/util/List;I)V", "apilib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepServiceBean {

    @NotNull
    private final String action;
    private final int albumNo;
    private final int appVersion;

    @NotNull
    private final List<SleepMusicBean> data;
    private final long totalTime;

    @NotNull
    private final String type;

    public SleepServiceBean(@NotNull String str, @NotNull String str2, long j, int i, @NotNull List<SleepMusicBean> list, int i2) {
        this.type = str;
        this.action = str2;
        this.totalTime = j;
        this.albumNo = i;
        this.data = list;
        this.appVersion = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepServiceBean copy$default(SleepServiceBean sleepServiceBean, String str, String str2, long j, int i, List list, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = sleepServiceBean.type;
        }
        if ((i3 & 2) != 0) {
            str2 = sleepServiceBean.action;
        }
        String str3 = str2;
        if ((i3 & 4) != 0) {
            j = sleepServiceBean.totalTime;
        }
        long j2 = j;
        if ((i3 & 8) != 0) {
            i = sleepServiceBean.albumNo;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            list = sleepServiceBean.data;
        }
        List list2 = list;
        if ((i3 & 32) != 0) {
            i2 = sleepServiceBean.appVersion;
        }
        return sleepServiceBean.copy(str, str3, j2, i4, list2, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTotalTime() {
        return this.totalTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAlbumNo() {
        return this.albumNo;
    }

    @NotNull
    public final List<SleepMusicBean> component5() {
        return this.data;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    public final SleepServiceBean copy(@NotNull String type, @NotNull String action, long totalTime, int albumNo, @NotNull List<SleepMusicBean> data, int appVersion) {
        return new SleepServiceBean(type, action, totalTime, albumNo, data, appVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepServiceBean)) {
            return false;
        }
        SleepServiceBean sleepServiceBean = (SleepServiceBean) other;
        return Intrinsics.areEqual(this.type, sleepServiceBean.type) && Intrinsics.areEqual(this.action, sleepServiceBean.action) && this.totalTime == sleepServiceBean.totalTime && this.albumNo == sleepServiceBean.albumNo && Intrinsics.areEqual(this.data, sleepServiceBean.data) && this.appVersion == sleepServiceBean.appVersion;
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    public final int getAlbumNo() {
        return this.albumNo;
    }

    public final int getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    public final List<SleepMusicBean> getData() {
        return this.data;
    }

    public final long getTotalTime() {
        return this.totalTime;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((this.type.hashCode() * 31) + this.action.hashCode()) * 31) + b.a(this.totalTime)) * 31) + this.albumNo) * 31) + this.data.hashCode()) * 31) + this.appVersion;
    }

    @NotNull
    public String toString() {
        return "SleepServiceBean(type=" + this.type + ", action=" + this.action + ", totalTime=" + this.totalTime + ", albumNo=" + this.albumNo + ", data=" + this.data + ", appVersion=" + this.appVersion + ')';
    }

    public /* synthetic */ SleepServiceBean(String str, String str2, long j, int i, List list, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, i, list, (i3 & 32) != 0 ? 512 : i2);
    }
}
