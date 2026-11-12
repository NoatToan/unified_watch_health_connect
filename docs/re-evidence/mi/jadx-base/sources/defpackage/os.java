package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\r"}, d2 = {"Los;", "Lu4;", "", "Lfp;", "", "value", PluginDeviceInfo.FMODEL, "Ljava/nio/ByteBuffer;", "byteBuffer", "", "isOffset", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class os implements u4<List<? extends PlanStruct>, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f29639a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Los$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @NotNull
    public byte[] a(@NotNull List<PlanStruct> value) throws IOException {
        Intrinsics.checkNotNullParameter(value, "value");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            byteArrayOutputStream.write(((PlanStruct) it.next()).a());
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "ByteArrayOutputStream().…}\n        }.toByteArray()");
        return byteArray;
    }

    @Override // defpackage.u4
    public /* bridge */ /* synthetic */ byte[] encode(List<? extends PlanStruct> list) {
        return a((List<PlanStruct>) list);
    }

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<PlanStruct> decode(@NotNull byte[] value) {
        PlanStruct planStructA;
        Intrinsics.checkNotNullParameter(value, "value");
        ByteBuffer byteBuffer = ByteBuffer.wrap(value);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        ArrayList arrayList = new ArrayList();
        do {
            try {
                Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
                planStructA = a(byteBuffer, value.length % 64 == 0);
            } catch (Exception e) {
                t5t.d("SleepPlanCodec", e.toString());
                planStructA = null;
            }
            arrayList.add(planStructA);
        } while (byteBuffer.position() < byteBuffer.limit());
        return CollectionsKt___CollectionsKt.filterNotNull(arrayList);
    }

    public final PlanStruct a(ByteBuffer byteBuffer, boolean isOffset) {
        long j = ((long) byteBuffer.getInt()) & 4294967295L;
        int i = byteBuffer.getInt();
        short s = (short) (byteBuffer.get() & 255);
        IntRange intRangeUntil = RangesKt___RangesKt.until(0, s);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 7; i2++) {
            PlanItem planItemA = PlanItem.h.a(byteBuffer);
            int first = intRangeUntil.getFirst();
            if (i2 <= intRangeUntil.getLast() && first <= i2) {
                arrayList.add(planItemA);
            }
        }
        short s2 = (short) (byteBuffer.get() & 255);
        if (isOffset) {
            int iPosition = byteBuffer.position();
            byteBuffer.position(iPosition + (64 - (iPosition % 64)));
        }
        return new PlanStruct(j, (short) i, s, arrayList, Short.valueOf(s2));
    }
}
