package com.huami.bluetooth.profile.channel.module.schedule.model;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.homeroom.model.Home;
import defpackage.c3;
import defpackage.tet;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0086\b\u0018\u0000 E2\u00020\u0001:\u0001FB\u0087\u0001\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0007\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0002\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\b\b\u0002\u0010&\u001a\u00020\u0007\u0012\b\b\u0002\u0010'\u001a\u00020\u0019\u0012\b\b\u0002\u0010(\u001a\u00020\u0002\u0012\b\b\u0002\u0010)\u001a\u00020\u0007¢\u0006\u0004\bC\u0010DJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\nJ\b\u0010\u000e\u001a\u00020\u0007H\u0016J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0019HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0002HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u008b\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\n2\b\b\u0002\u0010&\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u00192\b\b\u0002\u0010(\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020\u0007HÆ\u0001J\t\u0010+\u001a\u00020\u0019HÖ\u0001J\u0013\u0010.\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u001e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u001f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u00102\u001a\u0004\b5\u00104R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010/\u001a\u0004\b6\u00101R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010/\u001a\u0004\b7\u00101R\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010/\u001a\u0004\b8\u00101R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010/\u001a\u0004\b9\u00101R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010/\u001a\u0004\b:\u00101R\u0017\u0010%\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010;\u001a\u0004\b%\u0010<R\u0017\u0010&\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u00102\u001a\u0004\b=\u00104R\u0017\u0010'\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b'\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010/\u001a\u0004\bA\u00101R\u0017\u0010)\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u00102\u001a\u0004\bB\u00104¨\u0006G"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "Ljava/io/Serializable;", "", "value", "", "", "long2UInt32", "", "str", "string2byteArray", "", "supportAddress", "", "toByteArray", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "", "component11", "component12", "component13", "id", "title", "description", "startTime", "stopTime", "alertTime", "repeatMode", "repeatStopTime", "isAllDay", "imageUrl", "source", "updateVersion", Home.JSON_KEY_ADDRESS, "copy", "hashCode", "", "other", "equals", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "getStartTime", "getStopTime", "getAlertTime", "getRepeatMode", "getRepeatStopTime", "Z", "()Z", "getImageUrl", "I", "getSource", "()I", "getUpdateVersion", "getAddress", "<init>", "(JLjava/lang/String;Ljava/lang/String;JJJJJZLjava/lang/String;IJLjava/lang/String;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ScheduleModel implements Serializable {
    private static final long serialVersionUID = 1;

    @NotNull
    private final String address;
    private final long alertTime;

    @NotNull
    private final String description;
    private final long id;

    @NotNull
    private final String imageUrl;
    private final boolean isAllDay;
    private final long repeatMode;
    private final long repeatStopTime;
    private final int source;
    private final long startTime;
    private final long stopTime;

    @NotNull
    private final String title;
    private final long updateVersion;

    public ScheduleModel(long j, @NotNull String title, @NotNull String description, long j2, long j3, long j4, long j5, long j6, boolean z, @NotNull String imageUrl, int i, long j7, @NotNull String address) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(address, "address");
        this.id = j;
        this.title = title;
        this.description = description;
        this.startTime = j2;
        this.stopTime = j3;
        this.alertTime = j4;
        this.repeatMode = j5;
        this.repeatStopTime = j6;
        this.isAllDay = z;
        this.imageUrl = imageUrl;
        this.source = i;
        this.updateVersion = j7;
        this.address = address;
    }

    private final List<Byte> long2UInt32(long value) {
        byte[] bArrR = tet.r(value, 4);
        if (bArrR == null) {
            bArrR = c3.a(0, 4);
        }
        return ArraysKt___ArraysKt.toList(bArrR);
    }

    private final List<Byte> string2byteArray(String str) {
        if (str == null) {
            return CollectionsKt__CollectionsKt.arrayListOf((byte) 0);
        }
        ArrayList arrayList = new ArrayList();
        Charset charsetDefaultCharset = Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "defaultCharset()");
        byte[] bytes = str.getBytes(charsetDefaultCharset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        arrayList.addAll(ArraysKt___ArraysKt.toList(bytes));
        arrayList.add((byte) 0);
        return arrayList;
    }

    public static /* synthetic */ byte[] toByteArray$default(ScheduleModel scheduleModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return scheduleModel.toByteArray(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getUpdateVersion() {
        return this.updateVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getStopTime() {
        return this.stopTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getAlertTime() {
        return this.alertTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getRepeatMode() {
        return this.repeatMode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getRepeatStopTime() {
        return this.repeatStopTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsAllDay() {
        return this.isAllDay;
    }

    @NotNull
    public final ScheduleModel copy(long id, @NotNull String title, @NotNull String description, long startTime, long stopTime, long alertTime, long repeatMode, long repeatStopTime, boolean isAllDay, @NotNull String imageUrl, int source, long updateVersion, @NotNull String address) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(address, "address");
        return new ScheduleModel(id, title, description, startTime, stopTime, alertTime, repeatMode, repeatStopTime, isAllDay, imageUrl, source, updateVersion, address);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleModel)) {
            return false;
        }
        ScheduleModel scheduleModel = (ScheduleModel) other;
        return this.id == scheduleModel.id && Intrinsics.areEqual(this.title, scheduleModel.title) && Intrinsics.areEqual(this.description, scheduleModel.description) && this.startTime == scheduleModel.startTime && this.stopTime == scheduleModel.stopTime && this.alertTime == scheduleModel.alertTime && this.repeatMode == scheduleModel.repeatMode && this.repeatStopTime == scheduleModel.repeatStopTime && this.isAllDay == scheduleModel.isAllDay && Intrinsics.areEqual(this.imageUrl, scheduleModel.imageUrl) && this.source == scheduleModel.source && this.updateVersion == scheduleModel.updateVersion && Intrinsics.areEqual(this.address, scheduleModel.address);
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    public final long getAlertTime() {
        return this.alertTime;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final long getRepeatMode() {
        return this.repeatMode;
    }

    public final long getRepeatStopTime() {
        return this.repeatStopTime;
    }

    public final int getSource() {
        return this.source;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final long getStopTime() {
        return this.stopTime;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final long getUpdateVersion() {
        return this.updateVersion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    public int hashCode() {
        int iHashCode = ((((((((((((((Long.hashCode(this.id) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.stopTime)) * 31) + Long.hashCode(this.alertTime)) * 31) + Long.hashCode(this.repeatMode)) * 31) + Long.hashCode(this.repeatStopTime)) * 31;
        boolean z = this.isAllDay;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((iHashCode + r1) * 31) + this.imageUrl.hashCode()) * 31) + Integer.hashCode(this.source)) * 31) + Long.hashCode(this.updateVersion)) * 31) + this.address.hashCode();
    }

    public final boolean isAllDay() {
        return this.isAllDay;
    }

    @NotNull
    public final byte[] toByteArray(boolean supportAddress) {
        Vector vector = new Vector();
        vector.addAll(long2UInt32(this.id));
        vector.addAll(string2byteArray(this.title));
        vector.addAll(string2byteArray(this.description));
        vector.addAll(long2UInt32(this.startTime));
        vector.addAll(long2UInt32(this.stopTime));
        vector.addAll(long2UInt32(this.alertTime));
        vector.addAll(long2UInt32(this.repeatMode));
        vector.addAll(long2UInt32(this.repeatStopTime));
        vector.add(Byte.valueOf(c3.a(this.isAllDay)));
        vector.addAll(string2byteArray(this.imageUrl));
        vector.add(Byte.valueOf((byte) this.source));
        vector.addAll(long2UInt32(this.updateVersion));
        if (supportAddress) {
            vector.addAll(string2byteArray(this.address));
        }
        byte[] bArr = new byte[vector.size()];
        Iterator it = vector.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "barre.iterator()");
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "i.next()");
            bArr[i] = ((Number) next).byteValue();
            i++;
        }
        return bArr;
    }

    @NotNull
    public String toString() {
        return "ScheduleModel(id=" + this.id + ", title='" + this.title + "', description='" + this.description + "', startTime=" + this.startTime + ", stopTime=" + this.stopTime + ", alertTime=" + this.alertTime + ", repeatMode=" + this.repeatMode + ", repeatStopTime=" + this.repeatStopTime + "isAllDay=" + this.isAllDay + ", imageUrl='" + this.imageUrl + "', source=" + this.source + ", updateVersion=" + this.updateVersion + ", address=" + this.address + ')';
    }

    public /* synthetic */ ScheduleModel(long j, String str, String str2, long j2, long j3, long j4, long j5, long j6, boolean z, String str3, int i, long j7, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? 0L : j2, (i2 & 16) != 0 ? 0L : j3, (i2 & 32) != 0 ? 0L : j4, (i2 & 64) != 0 ? 0L : j5, (i2 & 128) != 0 ? 4294967295L : j6, (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? "" : str3, (i2 & 1024) != 0 ? 129 : i, (i2 & 2048) != 0 ? System.currentTimeMillis() / ((long) 1000) : j7, (i2 & 4096) != 0 ? "" : str4);
    }
}
