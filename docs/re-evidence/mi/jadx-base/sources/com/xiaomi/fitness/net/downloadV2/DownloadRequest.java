package com.xiaomi.fitness.net.downloadV2;

import android.text.TextUtils;
import com.xiaomi.onetrack.OneTrack;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001bB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/net/downloadV2/DownloadRequest;", "", "url", "", "option", "Lcom/xiaomi/fitness/net/downloadV2/DownloadRequest$Option;", "fileName", "downloadDir", "<init>", "(Ljava/lang/String;Lcom/xiaomi/fitness/net/downloadV2/DownloadRequest$Option;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getOption", "()Lcom/xiaomi/fitness/net/downloadV2/DownloadRequest$Option;", "getFileName", "getDownloadDir", "equals", "", "other", "hashCode", "", "component1", "component2", "component3", "component4", "copy", "toString", "Option", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DownloadRequest {

    @NotNull
    private final String downloadDir;

    @NotNull
    private final String fileName;

    @NotNull
    private final Option option;

    @NotNull
    private final String url;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0017B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/net/downloadV2/DownloadRequest$Option;", "", "pathDirDepth", "", "forceDownload", "", "external", "<init>", "(IZZ)V", "getPathDirDepth", "()I", "getForceDownload", "()Z", "getExternal", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "Builder", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Option {
        private final boolean external;
        private final boolean forceDownload;
        private final int pathDirDepth;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/net/downloadV2/DownloadRequest$Option$Builder;", "", "<init>", "()V", "pathDirDepth", "", "forceDownload", "", "external", "depth", "force", OneTrack.Param.BUILD, "Lcom/xiaomi/fitness/net/downloadV2/DownloadRequest$Option;", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Builder {
            private boolean external;
            private boolean forceDownload;
            private int pathDirDepth = 2;

            @NotNull
            public final Option build() {
                return new Option(this.pathDirDepth, this.forceDownload, this.external);
            }

            @NotNull
            public final Builder external(boolean external) {
                this.external = external;
                return this;
            }

            @NotNull
            public final Builder forceDownload(boolean force) {
                this.forceDownload = force;
                return this;
            }

            @NotNull
            public final Builder pathDirDepth(int depth) {
                this.pathDirDepth = depth;
                return this;
            }
        }

        public Option() {
            this(0, false, false, 7, null);
        }

        public static /* synthetic */ Option copy$default(Option option, int i, boolean z, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = option.pathDirDepth;
            }
            if ((i2 & 2) != 0) {
                z = option.forceDownload;
            }
            if ((i2 & 4) != 0) {
                z2 = option.external;
            }
            return option.copy(i, z, z2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getPathDirDepth() {
            return this.pathDirDepth;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getForceDownload() {
            return this.forceDownload;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getExternal() {
            return this.external;
        }

        @NotNull
        public final Option copy(int pathDirDepth, boolean forceDownload, boolean external) {
            return new Option(pathDirDepth, forceDownload, external);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Option)) {
                return false;
            }
            Option option = (Option) other;
            return this.pathDirDepth == option.pathDirDepth && this.forceDownload == option.forceDownload && this.external == option.external;
        }

        public final boolean getExternal() {
            return this.external;
        }

        public final boolean getForceDownload() {
            return this.forceDownload;
        }

        public final int getPathDirDepth() {
            return this.pathDirDepth;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.pathDirDepth) * 31) + Boolean.hashCode(this.forceDownload)) * 31) + Boolean.hashCode(this.external);
        }

        @NotNull
        public String toString() {
            return "Option(pathDirDepth=" + this.pathDirDepth + ", forceDownload=" + this.forceDownload + ", external=" + this.external + ")";
        }

        public Option(int i, boolean z, boolean z2) {
            this.pathDirDepth = i;
            this.forceDownload = z;
            this.external = z2;
        }

        public /* synthetic */ Option(int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 2 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2);
        }
    }

    public DownloadRequest(@NotNull String url, @NotNull Option option, @NotNull String fileName, @NotNull String downloadDir) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(downloadDir, "downloadDir");
        this.url = url;
        this.option = option;
        this.fileName = fileName;
        this.downloadDir = downloadDir;
    }

    public static /* synthetic */ DownloadRequest copy$default(DownloadRequest downloadRequest, String str, Option option, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = downloadRequest.url;
        }
        if ((i & 2) != 0) {
            option = downloadRequest.option;
        }
        if ((i & 4) != 0) {
            str2 = downloadRequest.fileName;
        }
        if ((i & 8) != 0) {
            str3 = downloadRequest.downloadDir;
        }
        return downloadRequest.copy(str, option, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Option getOption() {
        return this.option;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDownloadDir() {
        return this.downloadDir;
    }

    @NotNull
    public final DownloadRequest copy(@NotNull String url, @NotNull Option option, @NotNull String fileName, @NotNull String downloadDir) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(downloadDir, "downloadDir");
        return new DownloadRequest(url, option, fileName, downloadDir);
    }

    public boolean equals(@Nullable Object other) {
        if (other == null || !(other instanceof DownloadRequest)) {
            return false;
        }
        return TextUtils.equals(((DownloadRequest) other).url, this.url);
    }

    @NotNull
    public final String getDownloadDir() {
        return this.downloadDir;
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    public final Option getOption() {
        return this.option;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((this.url.hashCode() * 31) + this.option.hashCode()) * 31) + this.fileName.hashCode()) * 31) + this.downloadDir.hashCode();
    }

    @NotNull
    public String toString() {
        return "DownloadRequest(url=" + this.url + ", option=" + this.option + ", fileName=" + this.fileName + ", downloadDir=" + this.downloadDir + ")";
    }

    public /* synthetic */ DownloadRequest(String str, Option option, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new Option(2, false, false) : option, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
