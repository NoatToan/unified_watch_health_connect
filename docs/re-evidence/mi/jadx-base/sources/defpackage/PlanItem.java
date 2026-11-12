package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ep, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\nB?\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010\f\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lep;", "", "", "toString", "", "hashCode", "other", "", "equals", "", PluginDeviceInfo.FMODEL, "()[B", "bytes", "", "weekId", "count", "wHour", "wMinute", "sHour", "sMinute", "alarmIndex", "<init>", "(SSSSSSS)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class PlanItem {

    @NotNull
    public static final a h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final short weekId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final short count;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final short wHour;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final short wMinute;

    /* JADX INFO: renamed from: e, reason: from toString */
    public final short sHour;

    /* JADX INFO: renamed from: f, reason: from toString */
    public final short sMinute;

    /* JADX INFO: renamed from: g, reason: from toString */
    public final short alarmIndex;

    /* JADX INFO: renamed from: ep$a */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0002¨\u0006\u0007"}, d2 = {"Lep$a;", "", "Ljava/nio/ByteBuffer;", "Lep;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PlanItem a(@NotNull ByteBuffer byteBuffer) {
            Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
            return new PlanItem((short) (byteBuffer.get() & 255), (short) (byteBuffer.get() & 255), (short) (byteBuffer.get() & 255), (short) (byteBuffer.get() & 255), (short) (byteBuffer.get() & 255), (short) (byteBuffer.get() & 255), (short) (byteBuffer.get() & 255));
        }
    }

    public PlanItem(short s, short s2, short s3, short s4, short s5, short s6, short s7) {
        this.weekId = s;
        this.count = s2;
        this.wHour = s3;
        this.wMinute = s4;
        this.sHour = s5;
        this.sMinute = s6;
        this.alarmIndex = s7;
    }

    @NotNull
    public final byte[] a() {
        return new byte[]{ArraysKt___ArraysKt.first(c3.a(this.weekId, 1)), ArraysKt___ArraysKt.first(c3.a(this.count, 1)), ArraysKt___ArraysKt.first(c3.a(this.wHour, 1)), ArraysKt___ArraysKt.first(c3.a(this.wMinute, 1)), ArraysKt___ArraysKt.first(c3.a(this.sHour, 1)), ArraysKt___ArraysKt.first(c3.a(this.sMinute, 1)), ArraysKt___ArraysKt.first(c3.a(this.alarmIndex, 1))};
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlanItem)) {
            return false;
        }
        PlanItem planItem = (PlanItem) other;
        return this.weekId == planItem.weekId && this.count == planItem.count && this.wHour == planItem.wHour && this.wMinute == planItem.wMinute && this.sHour == planItem.sHour && this.sMinute == planItem.sMinute && this.alarmIndex == planItem.alarmIndex;
    }

    public int hashCode() {
        return (((((((((((Short.hashCode(this.weekId) * 31) + Short.hashCode(this.count)) * 31) + Short.hashCode(this.wHour)) * 31) + Short.hashCode(this.wMinute)) * 31) + Short.hashCode(this.sHour)) * 31) + Short.hashCode(this.sMinute)) * 31) + Short.hashCode(this.alarmIndex);
    }

    @NotNull
    public String toString() {
        return "PlanItem(weekId=" + ((int) this.weekId) + ", count=" + ((int) this.count) + ", wHour=" + ((int) this.wHour) + ", wMinute=" + ((int) this.wMinute) + ", sHour=" + ((int) this.sHour) + ", sMinute=" + ((int) this.sMinute) + ", alarmIndex=" + ((int) this.alarmIndex) + ')';
    }
}
