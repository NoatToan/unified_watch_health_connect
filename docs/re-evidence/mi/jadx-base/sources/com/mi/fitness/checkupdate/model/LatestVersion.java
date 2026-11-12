package com.mi.fitness.checkupdate.model;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010)\u001a\u0004\u0018\u00010\u0005J\b\u0010*\u001a\u0004\u0018\u00010\u0005J\b\u0010+\u001a\u0004\u0018\u00010\u0005J\b\u0010,\u001a\u00020\u0005H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR \u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR\u001a\u0010 \u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b&\u0010#R\u001a\u0010'\u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%¨\u0006-"}, d2 = {"Lcom/mi/fitness/checkupdate/model/LatestVersion;", "Ljava/io/Serializable;", "<init>", "()V", "version", "", "getVersion", "()Ljava/lang/String;", "setVersion", "(Ljava/lang/String;)V", "fullPackageUrl", "getFullPackageUrl", "setFullPackageUrl", "changeLog", "getChangeLog", "setChangeLog", "md5", "getMd5", "setMd5", "uploadTime", "", "getUploadTime", "()Ljava/lang/Long;", "setUploadTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "diffUrl", "getDiffUrl", "setDiffUrl", "diffMd5", "getDiffMd5", "setDiffMd5", "force", "", "getForce", "()Z", "setForce", "(Z)V", "isValid", "isNeedUpdate", "setNeedUpdate", "getUrl", "getMD5", "getFullPackageMD5", "toString", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LatestVersion implements Serializable {

    @Nullable
    private String changeLog;

    @SerializedName("diff_md5")
    @Nullable
    private String diffMd5;

    @SerializedName("diff_safe_url")
    @Nullable
    private String diffUrl;
    private boolean force;

    @SerializedName("safe_url")
    @Nullable
    private String fullPackageUrl;
    private boolean isNeedUpdate;

    @Nullable
    private String md5;

    @SerializedName("upload_time")
    @Nullable
    private Long uploadTime;

    @Nullable
    private String version;

    @Nullable
    public final String getChangeLog() {
        return this.changeLog;
    }

    @Nullable
    public final String getDiffMd5() {
        return this.diffMd5;
    }

    @Nullable
    public final String getDiffUrl() {
        return this.diffUrl;
    }

    public final boolean getForce() {
        return this.force;
    }

    @Nullable
    /* JADX INFO: renamed from: getFullPackageMD5, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    public final String getFullPackageUrl() {
        return this.fullPackageUrl;
    }

    @Nullable
    public final String getMD5() {
        return !TextUtils.isEmpty(this.diffUrl) ? this.diffMd5 : this.md5;
    }

    @Nullable
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    public final Long getUploadTime() {
        return this.uploadTime;
    }

    @Nullable
    public final String getUrl() {
        return !TextUtils.isEmpty(this.diffUrl) ? this.diffUrl : this.fullPackageUrl;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: isNeedUpdate, reason: from getter */
    public final boolean getIsNeedUpdate() {
        return this.isNeedUpdate;
    }

    public final boolean isValid() {
        return !TextUtils.isEmpty(this.version);
    }

    public final void setChangeLog(@Nullable String str) {
        this.changeLog = str;
    }

    public final void setDiffMd5(@Nullable String str) {
        this.diffMd5 = str;
    }

    public final void setDiffUrl(@Nullable String str) {
        this.diffUrl = str;
    }

    public final void setForce(boolean z) {
        this.force = z;
    }

    public final void setFullPackageUrl(@Nullable String str) {
        this.fullPackageUrl = str;
    }

    public final void setMd5(@Nullable String str) {
        this.md5 = str;
    }

    public final void setNeedUpdate(boolean z) {
        this.isNeedUpdate = z;
    }

    public final void setUploadTime(@Nullable Long l) {
        this.uploadTime = l;
    }

    public final void setVersion(@Nullable String str) {
        this.version = str;
    }

    @NotNull
    public String toString() {
        return "LatestVersion(version=" + this.version + ", fullPackageUrl=" + this.fullPackageUrl + ", changeLog=" + this.changeLog + ", md5=" + this.md5 + ", uploadTime=" + this.uploadTime + ", diffUrl=" + this.diffUrl + ", diffMd5=" + this.diffMd5 + ", force=" + this.force + ", isValid=" + isValid() + ")";
    }
}
