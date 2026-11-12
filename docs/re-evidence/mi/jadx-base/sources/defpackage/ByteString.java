package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: b3, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u000f"}, d2 = {"Lb3;", "", "", PluginDeviceInfo.FMODEL, "", PluginDeviceInfo.FDESC, "toString", "hashCode", "other", "", "equals", "str", "bytes", "<init>", "(Ljava/lang/String;I)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ByteString {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final String str;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int bytes;

    public ByteString(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "str");
        this.str = str;
        this.bytes = i;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getStr() {
        return this.str;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getBytes() {
        return this.bytes;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) other;
        return Intrinsics.areEqual(this.str, byteString.str) && this.bytes == byteString.bytes;
    }

    public int hashCode() {
        return (this.str.hashCode() * 31) + Integer.hashCode(this.bytes);
    }

    @NotNull
    public String toString() {
        return "ByteString(str=" + this.str + ", bytes=" + this.bytes + ')';
    }
}
