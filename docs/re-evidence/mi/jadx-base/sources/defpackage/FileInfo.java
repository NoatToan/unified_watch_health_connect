package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: aa, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u0011"}, d2 = {"Laa;", "", "", "toString", "", "hashCode", "other", "", "equals", "url", "Ljava/lang/String;", PluginDeviceInfo.FDESC, "()Ljava/lang/String;", "filePath", PluginDeviceInfo.FMODEL, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class FileInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final String filePath;

    public FileInfo(@NotNull String url, @NotNull String filePath) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.url = url;
        this.filePath = filePath;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileInfo)) {
            return false;
        }
        FileInfo fileInfo = (FileInfo) other;
        return Intrinsics.areEqual(this.url, fileInfo.url) && Intrinsics.areEqual(this.filePath, fileInfo.filePath);
    }

    public int hashCode() {
        return (this.url.hashCode() * 31) + this.filePath.hashCode();
    }

    @NotNull
    public String toString() {
        return "FileInfo(url=" + this.url + ", filePath=" + this.filePath + ')';
    }
}
