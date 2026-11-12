package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.api.b;
import java.util.BitSet;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0005B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lmm;", "", "", "version", "I", PluginDeviceInfo.FMODEL, "()I", "Ljava/util/BitSet;", b.n, "<init>", "(ILjava/util/BitSet;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class mm {

    @NotNull
    public static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BitSet f26992b;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lmm$a;", "", "", "data", "Lmm;", PluginDeviceInfo.FMODEL, "", "VERSION_LEN", "I", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final mm a(@NotNull byte[] data) throws Exception {
            Intrinsics.checkNotNullParameter(data, "data");
            if (data.length < 4) {
                throw new Exception("Version data size not right");
            }
            int iB = new a3(data).b(4);
            BitSet bitSetValueOf = BitSet.valueOf(CollectionsKt___CollectionsKt.toByteArray(ArraysKt___ArraysKt.slice(data, new IntRange(4, data.length - 1))));
            Intrinsics.checkNotNullExpressionValue(bitSetValueOf, "valueOf(feature)");
            return new mm(iB, bitSetValueOf);
        }
    }

    public mm(int i, @NotNull BitSet feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        this.f26991a = i;
        this.f26992b = feature;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF26991a() {
        return this.f26991a;
    }
}
