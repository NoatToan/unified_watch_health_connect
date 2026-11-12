package com.xiaomi.fitness.baseui.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.gki;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 &2\u00020\u0001:\u0001&B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0014\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\u000bJ\b\u0010 \u001a\u00020\u0003H\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0003H\u0016J\b\u0010%\u001a\u00020\u001bH\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\u001e\u0010\u0017\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/baseui/widget/PercentLevel;", "Landroid/os/Parcelable;", "color", "", "percent", "", "<init>", "(IF)V", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getColor", "()I", "setColor", "(I)V", "getPercent", "()F", "setPercent", "(F)V", "levelDesc", "getLevelDesc", "setLevelDesc", "textColor", "getTextColor", "setTextColor", "itemEndIndexStr", "", "getItemEndIndexStr", "()Ljava/lang/String;", "setItemEndIndexStr", "(Ljava/lang/String;)V", "describeContents", "writeToParcel", "", "dest", "flags", "toString", "CREATOR", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class PercentLevel implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int color;

    @Nullable
    private String itemEndIndexStr;
    private int levelDesc;
    private float percent;
    private int textColor;

    /* JADX INFO: renamed from: com.xiaomi.fitness.baseui.widget.PercentLevel$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/baseui/widget/PercentLevel$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/baseui/widget/PercentLevel;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/baseui/widget/PercentLevel;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<PercentLevel> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public PercentLevel createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PercentLevel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public PercentLevel[] newArray(int size) {
            return new PercentLevel[size];
        }
    }

    public PercentLevel(int i, float f) {
        this.textColor = gki.q;
        this.color = i;
        this.percent = f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getColor() {
        return this.color;
    }

    @Nullable
    public final String getItemEndIndexStr() {
        return this.itemEndIndexStr;
    }

    public final int getLevelDesc() {
        return this.levelDesc;
    }

    public final float getPercent() {
        return this.percent;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setItemEndIndexStr(@Nullable String str) {
        this.itemEndIndexStr = str;
    }

    public final void setLevelDesc(int i) {
        this.levelDesc = i;
    }

    public final void setPercent(float f) {
        this.percent = f;
    }

    public final void setTextColor(int i) {
        this.textColor = i;
    }

    @NotNull
    public String toString() {
        return "PercentLevel(color=" + this.color + ", percent=" + this.percent + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.color);
        dest.writeFloat(this.percent);
    }

    public PercentLevel() {
        this.textColor = gki.q;
    }

    public PercentLevel(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.textColor = gki.q;
        this.color = parcel.readInt();
        this.percent = parcel.readFloat();
    }
}
