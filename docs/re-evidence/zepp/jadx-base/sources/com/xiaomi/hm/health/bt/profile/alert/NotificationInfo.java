package com.xiaomi.hm.health.bt.profile.alert;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003Jc\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0012\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+R\u0019\u0010\u0014\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+R\u0019\u0010\u0015\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b3\u0010+R\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001d\u001a\u0004\b5\u0010\u001f\"\u0004\b6\u0010!¨\u00069"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/alert/NotificationInfo;", "", "", "toString", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "uniqueId", "categoryId", DbUtils.Const.Columns.Event.EVENT_ID, "pkgName", "appName", "title", "msg", "phone", "supportReply", "copy", "hashCode", "other", "", "equals", "a", LogUtil.I, "getUniqueId", "()I", "setUniqueId", "(I)V", "b", "getCategoryId", "setCategoryId", "c", "getEventId", "setEventId", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getPkgName", "()Ljava/lang/String;", "e", "getAppName", "f", "getTitle", "g", "getMsg", "h", "getPhone", "i", "getSupportReply", "setSupportReply", "<init>", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class NotificationInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int uniqueId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private int categoryId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private int eventId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String pkgName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String appName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    private final String msg;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private final String phone;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private int supportReply;

    public NotificationInfo(int i, int i2, int i3, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i4) {
        this.uniqueId = i;
        this.categoryId = i2;
        this.eventId = i3;
        this.pkgName = str;
        this.appName = str2;
        this.title = str3;
        this.msg = str4;
        this.phone = str5;
        this.supportReply = i4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getUniqueId() {
        return this.uniqueId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCategoryId() {
        return this.categoryId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEventId() {
        return this.eventId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPkgName() {
        return this.pkgName;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getSupportReply() {
        return this.supportReply;
    }

    @NotNull
    public final NotificationInfo copy(int uniqueId, int categoryId, int eventId, @NotNull String pkgName, @NotNull String appName, @NotNull String title, @NotNull String msg, @NotNull String phone, int supportReply) {
        return new NotificationInfo(uniqueId, categoryId, eventId, pkgName, appName, title, msg, phone, supportReply);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationInfo)) {
            return false;
        }
        NotificationInfo notificationInfo = (NotificationInfo) other;
        return this.uniqueId == notificationInfo.uniqueId && this.categoryId == notificationInfo.categoryId && this.eventId == notificationInfo.eventId && Intrinsics.areEqual(this.pkgName, notificationInfo.pkgName) && Intrinsics.areEqual(this.appName, notificationInfo.appName) && Intrinsics.areEqual(this.title, notificationInfo.title) && Intrinsics.areEqual(this.msg, notificationInfo.msg) && Intrinsics.areEqual(this.phone, notificationInfo.phone) && this.supportReply == notificationInfo.supportReply;
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public final int getEventId() {
        return this.eventId;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final String getPhone() {
        return this.phone;
    }

    @NotNull
    public final String getPkgName() {
        return this.pkgName;
    }

    public final int getSupportReply() {
        return this.supportReply;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getUniqueId() {
        return this.uniqueId;
    }

    public int hashCode() {
        return (((((((((((((((this.uniqueId * 31) + this.categoryId) * 31) + this.eventId) * 31) + this.pkgName.hashCode()) * 31) + this.appName.hashCode()) * 31) + this.title.hashCode()) * 31) + this.msg.hashCode()) * 31) + this.phone.hashCode()) * 31) + this.supportReply;
    }

    public final void setCategoryId(int i) {
        this.categoryId = i;
    }

    public final void setEventId(int i) {
        this.eventId = i;
    }

    public final void setSupportReply(int i) {
        this.supportReply = i;
    }

    public final void setUniqueId(int i) {
        this.uniqueId = i;
    }

    @NotNull
    public String toString() {
        return "NotificationInfo {uniqueId=" + this.uniqueId + ", categoryId=" + this.categoryId + ", eventId=" + this.eventId + ", pkgName=" + this.pkgName + ", appName=" + this.appName + ", title=" + this.title + ", msg=" + this.msg + ", phone=" + this.phone + ", supportReply=" + this.supportReply + '}';
    }

    public /* synthetic */ NotificationInfo(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? "" : str, (i5 & 16) != 0 ? "" : str2, (i5 & 32) != 0 ? "" : str3, (i5 & 64) != 0 ? "" : str4, (i5 & 128) != 0 ? "" : str5, (i5 & 256) != 0 ? 0 : i4);
    }
}
