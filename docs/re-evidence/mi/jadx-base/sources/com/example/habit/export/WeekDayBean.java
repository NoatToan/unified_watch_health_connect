package com.example.habit.export;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.passport.jsb.PassportJsbWebViewPageConfig;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0018\u0010%\u001a\u00020&2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020(H\u0016J\b\u0010*\u001a\u00020+H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u001a\u0010\u0016\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR\u001a\u0010\u0019\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\n\"\u0004\b\u001b\u0010\fR\u001a\u0010\u001c\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\fR\u001a\u0010\u001f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\fR\u001a\u0010\"\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\n\"\u0004\b$\u0010\f¨\u0006-"}, d2 = {"Lcom/example/habit/export/WeekDayBean;", "Landroid/os/Parcelable;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "sun", "", "getSun", "()Z", "setSun", "(Z)V", "mon", "getMon", "setMon", "tue", "getTue", "setTue", PassportJsbWebViewPageConfig.ActionBarConfig.VAL_ACTION_BAR_STYLE_WEB, "getWeb", "setWeb", "thu", "getThu", "setThu", "fri", "getFri", "setFri", "sat", "getSat", "setSat", "rest", "getRest", "setRest", "work", "getWork", "setWork", "writeToParcel", "", "flags", "", "describeContents", "toString", "", "CREATOR", "habit-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeekDayBean implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private boolean fri;
    private boolean mon;
    private boolean rest;
    private boolean sat;
    private boolean sun;
    private boolean thu;
    private boolean tue;
    private boolean web;
    private boolean work;

    /* JADX INFO: renamed from: com.example.habit.export.WeekDayBean$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/example/habit/export/WeekDayBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/example/habit/export/WeekDayBean;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/example/habit/export/WeekDayBean;", "habit-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<WeekDayBean> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public WeekDayBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WeekDayBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public WeekDayBean[] newArray(int size) {
            return new WeekDayBean[size];
        }
    }

    public WeekDayBean() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WeekDayBean(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.sun = parcel.readByte() != 0;
        this.mon = parcel.readByte() != 0;
        this.tue = parcel.readByte() != 0;
        this.web = parcel.readByte() != 0;
        this.thu = parcel.readByte() != 0;
        this.sat = parcel.readByte() != 0;
        this.rest = parcel.readByte() != 0;
        this.work = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean getFri() {
        return this.fri;
    }

    public final boolean getMon() {
        return this.mon;
    }

    public final boolean getRest() {
        return this.rest;
    }

    public final boolean getSat() {
        return this.sat;
    }

    public final boolean getSun() {
        return this.sun;
    }

    public final boolean getThu() {
        return this.thu;
    }

    public final boolean getTue() {
        return this.tue;
    }

    public final boolean getWeb() {
        return this.web;
    }

    public final boolean getWork() {
        return this.work;
    }

    public final void setFri(boolean z) {
        this.fri = z;
    }

    public final void setMon(boolean z) {
        this.mon = z;
    }

    public final void setRest(boolean z) {
        this.rest = z;
    }

    public final void setSat(boolean z) {
        this.sat = z;
    }

    public final void setSun(boolean z) {
        this.sun = z;
    }

    public final void setThu(boolean z) {
        this.thu = z;
    }

    public final void setTue(boolean z) {
        this.tue = z;
    }

    public final void setWeb(boolean z) {
        this.web = z;
    }

    public final void setWork(boolean z) {
        this.work = z;
    }

    @NotNull
    public String toString() {
        return "WeekDayBean(sun=" + this.sun + ", mon=" + this.mon + ", tue=" + this.tue + ", web=" + this.web + ", thu=" + this.thu + ", sat=" + this.sat + ", fri=" + this.fri + ", rest=" + this.rest + ", work=" + this.work + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeByte(this.sun ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mon ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.tue ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.web ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.thu ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.sat ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.rest ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.work ? (byte) 1 : (byte) 0);
    }
}
