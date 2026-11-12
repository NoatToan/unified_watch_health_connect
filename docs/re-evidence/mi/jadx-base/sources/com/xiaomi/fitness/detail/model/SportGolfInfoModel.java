package com.xiaomi.fitness.detail.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fit.fitness.parser.schema.FitnessRecordKey;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006B;\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0002\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\bH\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/detail/model/SportGolfInfoModel;", "Landroid/os/Parcelable;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "golfScore", "", FitnessRecordKey.swingSpeed, "", "swingTime", "downSwingTime", FitnessRecordKey.swingRhythm, "(Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "Ljava/lang/Integer;", "Ljava/lang/Float;", "writeToParcel", "", "flags", "describeContents", "CREATOR", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportGolfInfoModel implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @Nullable
    public Float downSwingTime;

    @JvmField
    @Nullable
    public Integer golfScore;

    @JvmField
    @Nullable
    public Float swingRhythm;

    @JvmField
    @Nullable
    public Float swingSpeed;

    @JvmField
    @Nullable
    public Float swingTime;

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.model.SportGolfInfoModel$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/detail/model/SportGolfInfoModel$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/detail/model/SportGolfInfoModel;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/detail/model/SportGolfInfoModel;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<SportGolfInfoModel> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SportGolfInfoModel createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SportGolfInfoModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SportGolfInfoModel[] newArray(int size) {
            return new SportGolfInfoModel[size];
        }
    }

    public SportGolfInfoModel() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportGolfInfoModel(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Object value = parcel.readValue(Integer.TYPE.getClassLoader());
        this.golfScore = value instanceof Integer ? (Integer) value : null;
        Class cls = Float.TYPE;
        Object value2 = parcel.readValue(cls.getClassLoader());
        this.swingSpeed = value2 instanceof Float ? (Float) value2 : null;
        Object value3 = parcel.readValue(cls.getClassLoader());
        this.swingTime = value3 instanceof Float ? (Float) value3 : null;
        Object value4 = parcel.readValue(cls.getClassLoader());
        this.swingRhythm = value4 instanceof Float ? (Float) value4 : null;
        Object value5 = parcel.readValue(cls.getClassLoader());
        this.downSwingTime = value5 instanceof Float ? (Float) value5 : null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(this.golfScore);
        parcel.writeValue(this.swingSpeed);
        parcel.writeValue(this.swingTime);
        parcel.writeValue(this.swingRhythm);
        parcel.writeValue(this.downSwingTime);
    }

    public SportGolfInfoModel(@Nullable Integer num, @Nullable Float f, @Nullable Float f2, @Nullable Float f3, @Nullable Float f4) {
        this.golfScore = num;
        this.swingSpeed = f;
        this.swingTime = f2;
        this.downSwingTime = f3;
        this.swingRhythm = f4;
    }
}
