package com.xiaomi.fitness.watch.face.export.data;

import com.google.gson.Gson;
import com.xiaomi.fitness.common.extensions.GsonExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/data/FaceDownloadResultV2;", "", "license", "", "sign", "download_info", "Lcom/xiaomi/fitness/watch/face/export/data/FaceDownloadResultV2$DownloadInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/fitness/watch/face/export/data/FaceDownloadResultV2$DownloadInfo;)V", "getLicense", "()Ljava/lang/String;", "getSign", "getDownload_info", "()Lcom/xiaomi/fitness/watch/face/export/data/FaceDownloadResultV2$DownloadInfo;", "getTrailDuration", "", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "License", "DownloadInfo", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceDownloadResultV2 {

    @NotNull
    private final DownloadInfo download_info;

    @NotNull
    private final String license;

    @NotNull
    private final String sign;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003JW\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010!\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/data/FaceDownloadResultV2$DownloadInfo;", "", "id", "", "config_file", "file_hash", "file_size", "", "config_file_v2", "file_hash_v2", "file_size_v2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getConfig_file", "getFile_hash", "getFile_size", "()J", "getConfig_file_v2", "getFile_hash_v2", "getFile_size_v2", "getConfigFile", "supportZip", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DownloadInfo {

        @Nullable
        private final String config_file;

        @Nullable
        private final String config_file_v2;

        @Nullable
        private final String file_hash;

        @Nullable
        private final String file_hash_v2;
        private final long file_size;
        private final long file_size_v2;

        @NotNull
        private final String id;

        public DownloadInfo(@NotNull String id, @Nullable String str, @Nullable String str2, long j, @Nullable String str3, @Nullable String str4, long j2) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
            this.config_file = str;
            this.file_hash = str2;
            this.file_size = j;
            this.config_file_v2 = str3;
            this.file_hash_v2 = str4;
            this.file_size_v2 = j2;
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConfig_file() {
            return this.config_file;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getFile_hash() {
            return this.file_hash;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getFile_size() {
            return this.file_size;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getConfig_file_v2() {
            return this.config_file_v2;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getFile_hash_v2() {
            return this.file_hash_v2;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final long getFile_size_v2() {
            return this.file_size_v2;
        }

        @NotNull
        public final DownloadInfo copy(@NotNull String id, @Nullable String config_file, @Nullable String file_hash, long file_size, @Nullable String config_file_v2, @Nullable String file_hash_v2, long file_size_v2) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new DownloadInfo(id, config_file, file_hash, file_size, config_file_v2, file_hash_v2, file_size_v2);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadInfo)) {
                return false;
            }
            DownloadInfo downloadInfo = (DownloadInfo) other;
            return Intrinsics.areEqual(this.id, downloadInfo.id) && Intrinsics.areEqual(this.config_file, downloadInfo.config_file) && Intrinsics.areEqual(this.file_hash, downloadInfo.file_hash) && this.file_size == downloadInfo.file_size && Intrinsics.areEqual(this.config_file_v2, downloadInfo.config_file_v2) && Intrinsics.areEqual(this.file_hash_v2, downloadInfo.file_hash_v2) && this.file_size_v2 == downloadInfo.file_size_v2;
        }

        @Nullable
        public final String getConfigFile(boolean supportZip) {
            return supportZip ? this.config_file_v2 : this.config_file;
        }

        @Nullable
        public final String getConfig_file() {
            return this.config_file;
        }

        @Nullable
        public final String getConfig_file_v2() {
            return this.config_file_v2;
        }

        @Nullable
        public final String getFile_hash() {
            return this.file_hash;
        }

        @Nullable
        public final String getFile_hash_v2() {
            return this.file_hash_v2;
        }

        public final long getFile_size() {
            return this.file_size;
        }

        public final long getFile_size_v2() {
            return this.file_size_v2;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.config_file;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.file_hash;
            int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Long.hashCode(this.file_size)) * 31;
            String str3 = this.config_file_v2;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.file_hash_v2;
            return ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + Long.hashCode(this.file_size_v2);
        }

        @NotNull
        public String toString() {
            return "DownloadInfo(id=" + this.id + ", config_file=" + this.config_file + ", file_hash=" + this.file_hash + ", file_size=" + this.file_size + ", config_file_v2=" + this.config_file_v2 + ", file_hash_v2=" + this.file_hash_v2 + ", file_size_v2=" + this.file_size_v2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003JL\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0007HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/data/FaceDownloadResultV2$License;", "", "sign_time", "", "secret_id", "", "trial_duration", "", "encrypt_type", "wf_hash", "wf_id", "<init>", "(JLjava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;)V", "getSign_time", "()J", "getSecret_id", "()Ljava/lang/String;", "getTrial_duration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEncrypt_type", "()I", "getWf_hash", "getWf_id", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(JLjava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;)Lcom/xiaomi/fitness/watch/face/export/data/FaceDownloadResultV2$License;", "equals", "", "other", "hashCode", "toString", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class License {
        private final int encrypt_type;

        @NotNull
        private final String secret_id;
        private final long sign_time;

        @Nullable
        private final Integer trial_duration;

        @NotNull
        private final String wf_hash;

        @NotNull
        private final String wf_id;

        public License(long j, @NotNull String secret_id, @Nullable Integer num, int i, @NotNull String wf_hash, @NotNull String wf_id) {
            Intrinsics.checkNotNullParameter(secret_id, "secret_id");
            Intrinsics.checkNotNullParameter(wf_hash, "wf_hash");
            Intrinsics.checkNotNullParameter(wf_id, "wf_id");
            this.sign_time = j;
            this.secret_id = secret_id;
            this.trial_duration = num;
            this.encrypt_type = i;
            this.wf_hash = wf_hash;
            this.wf_id = wf_id;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getSign_time() {
            return this.sign_time;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSecret_id() {
            return this.secret_id;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getTrial_duration() {
            return this.trial_duration;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getEncrypt_type() {
            return this.encrypt_type;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getWf_hash() {
            return this.wf_hash;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getWf_id() {
            return this.wf_id;
        }

        @NotNull
        public final License copy(long sign_time, @NotNull String secret_id, @Nullable Integer trial_duration, int encrypt_type, @NotNull String wf_hash, @NotNull String wf_id) {
            Intrinsics.checkNotNullParameter(secret_id, "secret_id");
            Intrinsics.checkNotNullParameter(wf_hash, "wf_hash");
            Intrinsics.checkNotNullParameter(wf_id, "wf_id");
            return new License(sign_time, secret_id, trial_duration, encrypt_type, wf_hash, wf_id);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof License)) {
                return false;
            }
            License license = (License) other;
            return this.sign_time == license.sign_time && Intrinsics.areEqual(this.secret_id, license.secret_id) && Intrinsics.areEqual(this.trial_duration, license.trial_duration) && this.encrypt_type == license.encrypt_type && Intrinsics.areEqual(this.wf_hash, license.wf_hash) && Intrinsics.areEqual(this.wf_id, license.wf_id);
        }

        public final int getEncrypt_type() {
            return this.encrypt_type;
        }

        @NotNull
        public final String getSecret_id() {
            return this.secret_id;
        }

        public final long getSign_time() {
            return this.sign_time;
        }

        @Nullable
        public final Integer getTrial_duration() {
            return this.trial_duration;
        }

        @NotNull
        public final String getWf_hash() {
            return this.wf_hash;
        }

        @NotNull
        public final String getWf_id() {
            return this.wf_id;
        }

        public int hashCode() {
            int iHashCode = ((Long.hashCode(this.sign_time) * 31) + this.secret_id.hashCode()) * 31;
            Integer num = this.trial_duration;
            return ((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.encrypt_type)) * 31) + this.wf_hash.hashCode()) * 31) + this.wf_id.hashCode();
        }

        @NotNull
        public String toString() {
            return "License(sign_time=" + this.sign_time + ", secret_id=" + this.secret_id + ", trial_duration=" + this.trial_duration + ", encrypt_type=" + this.encrypt_type + ", wf_hash=" + this.wf_hash + ", wf_id=" + this.wf_id + ")";
        }
    }

    public FaceDownloadResultV2(@NotNull String license, @NotNull String sign, @NotNull DownloadInfo download_info) {
        Intrinsics.checkNotNullParameter(license, "license");
        Intrinsics.checkNotNullParameter(sign, "sign");
        Intrinsics.checkNotNullParameter(download_info, "download_info");
        this.license = license;
        this.sign = sign;
        this.download_info = download_info;
    }

    public static /* synthetic */ FaceDownloadResultV2 copy$default(FaceDownloadResultV2 faceDownloadResultV2, String str, String str2, DownloadInfo downloadInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = faceDownloadResultV2.license;
        }
        if ((i & 2) != 0) {
            str2 = faceDownloadResultV2.sign;
        }
        if ((i & 4) != 0) {
            downloadInfo = faceDownloadResultV2.download_info;
        }
        return faceDownloadResultV2.copy(str, str2, downloadInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLicense() {
        return this.license;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSign() {
        return this.sign;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DownloadInfo getDownload_info() {
        return this.download_info;
    }

    @NotNull
    public final FaceDownloadResultV2 copy(@NotNull String license, @NotNull String sign, @NotNull DownloadInfo download_info) {
        Intrinsics.checkNotNullParameter(license, "license");
        Intrinsics.checkNotNullParameter(sign, "sign");
        Intrinsics.checkNotNullParameter(download_info, "download_info");
        return new FaceDownloadResultV2(license, sign, download_info);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceDownloadResultV2)) {
            return false;
        }
        FaceDownloadResultV2 faceDownloadResultV2 = (FaceDownloadResultV2) other;
        return Intrinsics.areEqual(this.license, faceDownloadResultV2.license) && Intrinsics.areEqual(this.sign, faceDownloadResultV2.sign) && Intrinsics.areEqual(this.download_info, faceDownloadResultV2.download_info);
    }

    @NotNull
    public final DownloadInfo getDownload_info() {
        return this.download_info;
    }

    @NotNull
    public final String getLicense() {
        return this.license;
    }

    @NotNull
    public final String getSign() {
        return this.sign;
    }

    public final int getTrailDuration() {
        Integer trial_duration = ((License) GsonExtKt.toObject(new Gson(), this.license, License.class)).getTrial_duration();
        if (trial_duration != null) {
            return trial_duration.intValue();
        }
        return 0;
    }

    public int hashCode() {
        return (((this.license.hashCode() * 31) + this.sign.hashCode()) * 31) + this.download_info.hashCode();
    }

    @NotNull
    public String toString() {
        return "FaceDownloadResultV2(license=" + this.license + ", sign=" + this.sign + ", download_info=" + this.download_info + ")";
    }
}
