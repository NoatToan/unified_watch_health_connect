package com.xiaomi.fitness.sleep.behavior.analyze.snore;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.common.utils.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 .2\u00020\u0001:\u0001.B\u0011\b\u0014\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0010\u0010!\u001a\u0004\u0018\u00010\u00142\u0006\u0010\"\u001a\u00020#J\u0010\u0010$\u001a\u00020%2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014J\b\u0010&\u001a\u00020\u000eH\u0016J\u0018\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u000eH\u0016J\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010+J\u0016\u0010,\u001a\u00020%2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fJ\b\u0010-\u001a\u00020\u0014H\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001a\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u0012R\u001a\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/AudioAttributes;", "Landroid/os/Parcelable;", "in", "Landroid/os/Parcel;", "<init>", "(Landroid/os/Parcel;)V", "()V", "beginTime", "", "getBeginTime", "()J", "setBeginTime", "(J)V", "duration", "", "getDuration", "()I", "setDuration", "(I)V", "fileName", "", "getFileName", "()Ljava/lang/String;", "setFileName", "(Ljava/lang/String;)V", "fileRelativePath", "type", "getType$annotations", "getType", "setType", "snoreDecibels", "", "Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/SnoreDecibel;", "getFilePath", "ctx", "Landroid/content/Context;", "setFileRelativePath", "", "describeContents", "writeToParcel", "dest", "flags", "getSnoreDecibels", "", "setSnoreDecibels", "toString", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AudioAttributes implements Parcelable {

    @SerializedName("beginTime")
    private long beginTime;

    @SerializedName("duration")
    private int duration;

    @SerializedName("fileName")
    @Nullable
    private String fileName;

    @Nullable
    private String fileRelativePath;

    @SerializedName("snoreDecibels")
    @Nullable
    private List<SnoreDecibel> snoreDecibels;

    @SerializedName("type")
    private int type;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<AudioAttributes> CREATOR = new Parcelable.Creator<AudioAttributes>() { // from class: com.xiaomi.fitness.sleep.behavior.analyze.snore.AudioAttributes$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AudioAttributes createFromParcel(Parcel in) {
            Intrinsics.checkNotNullParameter(in, "in");
            return new AudioAttributes(in);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AudioAttributes[] newArray(int size) {
            return new AudioAttributes[size];
        }
    };

    public AudioAttributes() {
    }

    public AudioAttributes(@NotNull Parcel in) {
        Intrinsics.checkNotNullParameter(in, "in");
        this.beginTime = in.readLong();
        this.duration = in.readInt();
        this.fileName = in.readString();
        this.fileRelativePath = in.readString();
        this.type = in.readInt();
        ArrayList arrayList = new ArrayList();
        this.snoreDecibels = arrayList;
        Intrinsics.checkNotNull(arrayList);
        in.readTypedList(arrayList, SnoreDecibel.INSTANCE);
        List<SnoreDecibel> list = this.snoreDecibels;
        Intrinsics.checkNotNull(list);
        list.clear();
    }

    public static /* synthetic */ void getType$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long getBeginTime() {
        return this.beginTime;
    }

    public final int getDuration() {
        return this.duration;
    }

    @Nullable
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    public final String getFilePath(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        if (!TextUtils.isEmpty(this.fileRelativePath)) {
            String cachePath = FileUtils.getCachePath(ctx);
            String str = File.separator;
            String str2 = cachePath + str + this.fileRelativePath;
            if (FileUtils.isExists(FileUtils.getParentDirFormPath(str2))) {
                return str2;
            }
            String str3 = FileUtils.getFilesPath(ctx) + str + this.fileRelativePath;
            if (FileUtils.isExists(FileUtils.getParentDirFormPath(str3))) {
                return str3;
            }
        }
        return this.fileRelativePath;
    }

    @Nullable
    public final List<SnoreDecibel> getSnoreDecibels() {
        return this.snoreDecibels;
    }

    public final int getType() {
        return this.type;
    }

    public final void setBeginTime(long j) {
        this.beginTime = j;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setFileName(@Nullable String str) {
        this.fileName = str;
    }

    public final void setFileRelativePath(@Nullable String fileRelativePath) {
        this.fileRelativePath = fileRelativePath;
    }

    public final void setSnoreDecibels(@Nullable List<SnoreDecibel> snoreDecibels) {
        this.snoreDecibels = snoreDecibels;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "AudioAttributes{beginTime=" + this.beginTime + ", duration=" + this.duration + ", fileName='" + this.fileName + "', fileRelativePath='" + this.fileRelativePath + "', type=" + this.type + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.beginTime);
        dest.writeInt(this.duration);
        dest.writeString(this.fileName);
        dest.writeString(this.fileRelativePath);
        dest.writeInt(this.type);
        List<SnoreDecibel> list = this.snoreDecibels;
        Intrinsics.checkNotNull(list);
        list.clear();
        dest.writeTypedList(this.snoreDecibels);
    }
}
