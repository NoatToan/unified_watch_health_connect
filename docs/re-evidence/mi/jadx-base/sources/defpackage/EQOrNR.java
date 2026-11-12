package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: v8, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\nB9\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010\f\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lv8;", "", "", "toString", "", "hashCode", "other", "", "equals", "", PluginDeviceInfo.FMODEL, "()[B", "byteArray", "", "mode", "", "eqFreq", "eqValue", "nrReductionLevel", "<init>", "(SLjava/util/List;Ljava/util/List;Ljava/lang/Short;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class EQOrNR {

    @NotNull
    public static final a e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final short mode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @Nullable
    public final List<Integer> eqFreq;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final List<Short> eqValue;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final Short nrReductionLevel;

    /* JADX INFO: renamed from: v8$a */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0002¨\u0006\u0007"}, d2 = {"Lv8$a;", "", "Ljava/nio/ByteBuffer;", "Lv8;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EQOrNR a(@NotNull ByteBuffer byteBuffer) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
            short s = (short) (byteBuffer.get() & 255);
            byte b2 = byteBuffer.get();
            if ((b2 & 1) != 0) {
                short s2 = (short) (byteBuffer.get() & 255);
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                for (int i = 0; i < s2; i++) {
                    arrayList.add(Integer.valueOf(byteBuffer.getShort()));
                }
                for (int i2 = 0; i2 < s2; i2++) {
                    arrayList2.add(Short.valueOf((short) (byteBuffer.get() & 255)));
                }
            } else {
                arrayList = null;
                arrayList2 = null;
            }
            return new EQOrNR(s, arrayList, arrayList2, (b2 & 2) != 0 ? Short.valueOf((short) (byteBuffer.get() & 255)) : null);
        }
    }

    public EQOrNR(short s, @Nullable List<Integer> list, @Nullable List<Short> list2, @Nullable Short sh) {
        this.mode = s;
        this.eqFreq = list;
        this.eqValue = list2;
        this.nrReductionLevel = sh;
    }

    @NotNull
    public final byte[] a() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.mode & 255);
        List<Integer> list = this.eqFreq;
        int i = (list == null || this.eqValue == null || list.size() != this.eqValue.size()) ? 0 : 1;
        if (this.nrReductionLevel != null) {
            i |= 2;
        }
        byteArrayOutputStream.write(i & 255);
        if ((i & 1) != 0) {
            List<Integer> list2 = this.eqFreq;
            Intrinsics.checkNotNull(list2);
            byteArrayOutputStream.write(list2.size() & 255);
            Iterator<T> it = this.eqFreq.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write(c3.a(((Number) it.next()).intValue(), 2));
            }
            List<Short> list3 = this.eqValue;
            Intrinsics.checkNotNull(list3);
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                byteArrayOutputStream.write(((Number) it2.next()).shortValue() & 255);
            }
        }
        if ((i & 2) != 0) {
            Short sh = this.nrReductionLevel;
            Intrinsics.checkNotNull(sh);
            byteArrayOutputStream.write(sh.shortValue() & 255);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "ByteArrayOutputStream().…}\n        }.toByteArray()");
        return byteArray;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EQOrNR)) {
            return false;
        }
        EQOrNR eQOrNR = (EQOrNR) other;
        return this.mode == eQOrNR.mode && Intrinsics.areEqual(this.eqFreq, eQOrNR.eqFreq) && Intrinsics.areEqual(this.eqValue, eQOrNR.eqValue) && Intrinsics.areEqual(this.nrReductionLevel, eQOrNR.nrReductionLevel);
    }

    public int hashCode() {
        int iHashCode = Short.hashCode(this.mode) * 31;
        List<Integer> list = this.eqFreq;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Short> list2 = this.eqValue;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Short sh = this.nrReductionLevel;
        return iHashCode3 + (sh != null ? sh.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EQOrNR(mode=" + ((int) this.mode) + ", eqFreq=" + this.eqFreq + ", eqValue=" + this.eqValue + ", nrReductionLevel=" + this.nrReductionLevel + ')';
    }
}
