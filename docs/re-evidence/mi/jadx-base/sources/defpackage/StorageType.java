package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: du, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u000b\u0010\u0012¨\u0006\u0015"}, d2 = {"Ldu;", "", "other", "", "equals", "", "hashCode", "", "toString", "value", "Ljava/lang/String;", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;", "", MediaStoreUtil.MediaInfo.SIZE, "J", "getSize", "()J", "(J)V", "<init>", "(Ljava/lang/String;J)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class StorageType {

    @NotNull
    public static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final String value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public long size;

    /* JADX INFO: renamed from: du$a */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Ldu$a;", "", "", "key", "Ldu;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final StorageType a(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (key.length() == 0) {
                return null;
            }
            return new StorageType(key, 0L, 2, null);
        }
    }

    public StorageType(@NotNull String value, long j) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.size = j;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public boolean equals(@Nullable Object other) {
        if (other != null && (other instanceof StorageType)) {
            return Intrinsics.areEqual(this.value, ((StorageType) other).value);
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    @NotNull
    public String toString() {
        return "StorageType(value=" + this.value + ", size=" + this.size + ')';
    }

    public /* synthetic */ StorageType(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? -1L : j);
    }

    public final void a(long j) {
        this.size = j;
    }
}
