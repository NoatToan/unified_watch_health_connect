package defpackage;

import androidx.health.connect.client.records.OvulationTestRecord;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.health.bloodpressure.repository.BloodPressurePreRepository;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: og, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\nB)\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010\f\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Log;", "", "", "toString", "", "hashCode", "other", "", "equals", "", PluginDeviceInfo.FMODEL, "()[B", "byteArray", "", "mode", "low", OvulationTestRecord.Result.HIGH, BloodPressurePreRepository.KEY_ITEM_MID, "<init>", "(SSSLjava/lang/Short;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class HighMidBassParam {

    @NotNull
    public static final a e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final short mode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final short low;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final short high;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final Short mid;

    /* JADX INFO: renamed from: og$a */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Log$a;", "", "Ljava/nio/ByteBuffer;", "byteBuffer", "Log;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HighMidBassParam a(@NotNull ByteBuffer byteBuffer) {
            Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
            boolean z = (byteBuffer.get() & 1) != 0;
            short s = (short) (byteBuffer.get() & 255);
            byte b2 = byteBuffer.get();
            byte b3 = byteBuffer.get();
            Byte bValueOf = (!z || byteBuffer.position() >= byteBuffer.limit()) ? null : Byte.valueOf(byteBuffer.get());
            return new HighMidBassParam(s, b2, b3, bValueOf != null ? Short.valueOf(bValueOf.byteValue()) : null);
        }
    }

    public HighMidBassParam(short s, short s2, short s3, @Nullable Short sh) {
        this.mode = s;
        this.low = s2;
        this.high = s3;
        this.mid = sh;
    }

    @NotNull
    public final byte[] a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Byte.valueOf((byte) ((this.mid == null ? 0 : 1) & 255)));
        arrayList.add(Byte.valueOf((byte) this.mode));
        arrayList.add(Byte.valueOf((byte) this.low));
        arrayList.add(Byte.valueOf((byte) this.high));
        Short sh = this.mid;
        if (sh != null) {
            arrayList.add(Byte.valueOf((byte) sh.shortValue()));
        }
        return CollectionsKt___CollectionsKt.toByteArray(arrayList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighMidBassParam)) {
            return false;
        }
        HighMidBassParam highMidBassParam = (HighMidBassParam) other;
        return this.mode == highMidBassParam.mode && this.low == highMidBassParam.low && this.high == highMidBassParam.high && Intrinsics.areEqual(this.mid, highMidBassParam.mid);
    }

    public int hashCode() {
        int iHashCode = ((((Short.hashCode(this.mode) * 31) + Short.hashCode(this.low)) * 31) + Short.hashCode(this.high)) * 31;
        Short sh = this.mid;
        return iHashCode + (sh == null ? 0 : sh.hashCode());
    }

    @NotNull
    public String toString() {
        return "HighMidBassParam(mode=" + ((int) this.mode) + ", low=" + ((int) this.low) + ", high=" + ((int) this.high) + ", mid=" + this.mid + ')';
    }
}
