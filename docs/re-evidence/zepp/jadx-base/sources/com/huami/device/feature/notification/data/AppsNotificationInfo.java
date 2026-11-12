package com.huami.device.feature.notification.data;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.device.feature.notification.utils.AppsHelper;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\u0018\b\u0002\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b/\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\t\u0010\n\u001a\u00020\u0005HÆ\u0003J\u0019\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003JK\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\u0018\b\u0002\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r2\b\b\u0002\u0010\u0014\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\"\u0010\u0012\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR2\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001b\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001f¨\u00061"}, d2 = {"Lcom/huami/device/feature/notification/data/AppsNotificationInfo;", "", "", "toString", "pkg", "", SearchCriteria.CONTAINS, "notContains", "component1", "component2", "component3", "Ljava/util/ArrayList;", "Lcom/huami/device/feature/notification/data/AppChosen;", "Lkotlin/collections/ArrayList;", "component4", "component5", "notificationOn", "displayOff", "hasDeleteMifit", "appsChosen", "supportReply", "copy", "", "hashCode", "other", "equals", "a", "Z", "getNotificationOn", "()Z", "setNotificationOn", "(Z)V", "b", "getDisplayOff", "setDisplayOff", "c", "getHasDeleteMifit", "setHasDeleteMifit", GoogleApiAvailabilityLight.a, "Ljava/util/ArrayList;", "getAppsChosen", "()Ljava/util/ArrayList;", "setAppsChosen", "(Ljava/util/ArrayList;)V", "e", "getSupportReply", "setSupportReply", "<init>", "(ZZZLjava/util/ArrayList;Z)V", "notification_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AppsNotificationInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("NotifiOn")
    private boolean notificationOn;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("ScreenSleepOn")
    private boolean displayOff;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean hasDeleteMifit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("Apps")
    @NotNull
    private ArrayList<AppChosen> appsChosen;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("supportReply")
    private boolean supportReply;

    public AppsNotificationInfo() {
        this(false, false, false, null, false, 31, null);
    }

    public AppsNotificationInfo(boolean z, boolean z2, boolean z3, @NotNull ArrayList<AppChosen> arrayList, boolean z4) {
        this.notificationOn = z;
        this.displayOff = z2;
        this.hasDeleteMifit = z3;
        this.appsChosen = arrayList;
        this.supportReply = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppsNotificationInfo copy$default(AppsNotificationInfo appsNotificationInfo, boolean z, boolean z2, boolean z3, ArrayList arrayList, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = appsNotificationInfo.notificationOn;
        }
        if ((i & 2) != 0) {
            z2 = appsNotificationInfo.displayOff;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = appsNotificationInfo.hasDeleteMifit;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            arrayList = appsNotificationInfo.appsChosen;
        }
        ArrayList arrayList2 = arrayList;
        if ((i & 16) != 0) {
            z4 = appsNotificationInfo.supportReply;
        }
        return appsNotificationInfo.copy(z, z5, z6, arrayList2, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getNotificationOn() {
        return this.notificationOn;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getDisplayOff() {
        return this.displayOff;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHasDeleteMifit() {
        return this.hasDeleteMifit;
    }

    @NotNull
    public final ArrayList<AppChosen> component4() {
        return this.appsChosen;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSupportReply() {
        return this.supportReply;
    }

    public final boolean contains(@NotNull String pkg) {
        ArrayList<AppChosen> arrayList = this.appsChosen;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator<T> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((AppChosen) it2.next()).getPkg());
        }
        return CollectionsKt___CollectionsKt.toList(arrayList2).contains(pkg);
    }

    @NotNull
    public final AppsNotificationInfo copy(boolean notificationOn, boolean displayOff, boolean hasDeleteMifit, @NotNull ArrayList<AppChosen> appsChosen, boolean supportReply) {
        return new AppsNotificationInfo(notificationOn, displayOff, hasDeleteMifit, appsChosen, supportReply);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppsNotificationInfo)) {
            return false;
        }
        AppsNotificationInfo appsNotificationInfo = (AppsNotificationInfo) other;
        return this.notificationOn == appsNotificationInfo.notificationOn && this.displayOff == appsNotificationInfo.displayOff && this.hasDeleteMifit == appsNotificationInfo.hasDeleteMifit && Intrinsics.areEqual(this.appsChosen, appsNotificationInfo.appsChosen) && this.supportReply == appsNotificationInfo.supportReply;
    }

    @NotNull
    public final ArrayList<AppChosen> getAppsChosen() {
        return this.appsChosen;
    }

    public final boolean getDisplayOff() {
        return this.displayOff;
    }

    public final boolean getHasDeleteMifit() {
        return this.hasDeleteMifit;
    }

    public final boolean getNotificationOn() {
        return this.notificationOn;
    }

    public final boolean getSupportReply() {
        return this.supportReply;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z = this.notificationOn;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.displayOff;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.hasDeleteMifit;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int iHashCode = (((i2 + r3) * 31) + this.appsChosen.hashCode()) * 31;
        boolean z4 = this.supportReply;
        return iHashCode + (z4 ? 1 : z4);
    }

    public final boolean notContains(@NotNull String pkg) {
        return AppsHelper.INSTANCE.isDirtyData(pkg) | (!contains(pkg));
    }

    public final void setAppsChosen(@NotNull ArrayList<AppChosen> arrayList) {
        this.appsChosen = arrayList;
    }

    public final void setDisplayOff(boolean z) {
        this.displayOff = z;
    }

    public final void setHasDeleteMifit(boolean z) {
        this.hasDeleteMifit = z;
    }

    public final void setNotificationOn(boolean z) {
        this.notificationOn = z;
    }

    public final void setSupportReply(boolean z) {
        this.supportReply = z;
    }

    @NotNull
    public String toString() {
        return "{\"NotifiOn\": " + this.notificationOn + ", \"ScreenSleepOn\": " + this.displayOff + ", \"hasDeleteMifit\": " + this.hasDeleteMifit + ", \"Apps\": " + this.appsChosen + '}';
    }

    public /* synthetic */ AppsNotificationInfo(boolean z, boolean z2, boolean z3, ArrayList arrayList, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? new ArrayList() : arrayList, (i & 16) != 0 ? false : z4);
    }
}
