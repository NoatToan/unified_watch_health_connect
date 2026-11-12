package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: i8, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Li8;", "", "", "toString", "", "hashCode", "other", "", "equals", "", PluginDeviceInfo.FMODEL, "()[B", "bytes", "", "ids", "<init>", "(Ljava/util/List;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class DialsInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final List<Integer> ids;

    public DialsInfo(@NotNull List<Integer> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.ids = ids;
    }

    @NotNull
    public final byte[] a() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.ids.size());
        Iterator<T> it = this.ids.iterator();
        while (it.hasNext()) {
            byteArrayOutputStream.write(tet.p(((Number) it.next()).intValue()));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "ByteArrayOutputStream().…}\n        }.toByteArray()");
        return byteArray;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DialsInfo) && Intrinsics.areEqual(this.ids, ((DialsInfo) other).ids);
    }

    public int hashCode() {
        return this.ids.hashCode();
    }

    @NotNull
    public String toString() {
        return "DialsInfo(ids=" + this.ids + ')';
    }
}
