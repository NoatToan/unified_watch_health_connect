package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.model.MeasureData;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007B\u001b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0002J2\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002J2\u0010\u0007\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002R\u001b\u0010\n\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014¨\u0006\u001a"}, d2 = {"Lv;", "Lej;", "", "byteArray", "Lcom/xiaomi/hm/health/bt/model/WeightAdvData;", PluginDeviceInfo.FDESC, "", PluginDeviceInfo.FMODEL, "Lcom/xiaomi/hm/health/bt/model/MeasureData;", "Lw2;", "decoder", "", "flag", MediaStoreUtil.MediaInfo.SIZE, "defaultValue", "", "skip", "", "decoder$delegate", "Lkotlin/Lazy;", "()Lw2;", "sourceValue", "", "deviceId", "<init>", "(ILjava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class v implements ej {

    @NotNull
    public static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f36334b;

    @NotNull
    public final Lazy c = LazyKt__LazyJVMKt.lazy(b.t);

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007¨\u0006\u000f"}, d2 = {"Lv$a;", "", "", "MAX_CHECK_TIME", "I", "", "SLEEP_INTERVAL", "J", "", "TAG", "Ljava/lang/String;", "TIME_BITS", "WAITE_TIME_OUT", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw2;", PluginDeviceInfo.FMODEL, "()Lw2;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<w2> {
        public static final b t = new b();

        public b() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w2 invoke() {
            return new w2(null, 0, 3, 0 == true ? 1 : 0);
        }
    }

    public v(int i, @Nullable String str) {
        this.f36333a = i;
        this.f36334b = str;
    }

    @Override // defpackage.ej
    @NotNull
    public List<WeightAdvData> a(@NotNull byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        ArrayList arrayList = new ArrayList();
        try {
            b().a(byteArray);
            while (true) {
                MeasureData measureDataA = a();
                WeightAdvData weightAdvData = new WeightAdvData(measureDataA.getUnit(), measureDataA.getWeight(), measureDataA.getTimestamp(), measureDataA.g() == zk.MEASURING_WEIGHT && measureDataA.f() == 1, true, false, measureDataA.g() == zk.MEASURING_FINISHED);
                weightAdvData.setImpedance(measureDataA.getImpedance());
                weightAdvData.setMeasureState(measureDataA.g());
                weightAdvData.setMeasureData(measureDataA);
                weightAdvData.setSourceValue(this.f36333a);
                weightAdvData.setDeviceId(this.f36334b);
                arrayList.add(weightAdvData);
            }
        } catch (Exception unused) {
            return CollectionsKt___CollectionsKt.toList(arrayList);
        }
    }

    public final w2 b() {
        return (w2) this.c.getValue();
    }

    @Nullable
    public final WeightAdvData b(@NotNull byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        List<WeightAdvData> listA = a(byteArray);
        if (listA.isEmpty()) {
            return null;
        }
        return (WeightAdvData) CollectionsKt___CollectionsKt.first((List) listA);
    }

    public final MeasureData a() {
        int iE = b().e();
        Calendar calendar = Calendar.getInstance(xk.f39201a.a(0));
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(timeZone)");
        calendar.clear();
        long jD = b().d(5);
        calendar.set(1, (int) (8191 & jD));
        calendar.set(2, ((int) ((jD >> 13) & 15)) - 1);
        calendar.set(5, (int) ((jD >> 17) & 31));
        calendar.set(11, (int) ((jD >> 22) & 63));
        calendar.set(12, (int) ((jD >> 28) & 63));
        calendar.set(13, (int) ((jD >> 34) & 63));
        int iA = a(this, b(), iE & 8, 2, 0, false, 16, (Object) null);
        int iA2 = a(this, b(), iE & 16, 3, -1, false, 16, (Object) null);
        int iA3 = a(this, b(), iE & 32, 1, 0, false, 16, (Object) null);
        int iA4 = a(this, b(), iE & 64, 1, -1, false, 16, (Object) null);
        long jA = a(this, b(), iE & 128, 6, -2L, false, 16, (Object) null);
        int i = (iE & 256) >> 8;
        boolean z = iA == 65535;
        int i2 = z ? 0 : (iE & 1) | ((iE & 16384) >> 10);
        float fA = iA;
        if (!z) {
            fA /= i2 != 0 ? 100.0f : 200.0f;
        }
        if (i2 == 17) {
            fA = ix.a(fA, 1, 17);
        }
        return new MeasureData(iE, i2, calendar.getTimeInMillis(), iA2, fA, iA3, iA4, jA, i, z);
    }

    public static /* synthetic */ int a(v vVar, w2 w2Var, int i, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = true;
        }
        return vVar.a(w2Var, i, i2, i3, z);
    }

    public final int a(w2 decoder, int flag, int size, int defaultValue, boolean skip) {
        if (flag > 0) {
            return decoder.c(size);
        }
        if (!skip) {
            return defaultValue;
        }
        decoder.c(size);
        return defaultValue;
    }

    public static /* synthetic */ long a(v vVar, w2 w2Var, int i, int i2, long j, boolean z, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z = true;
        }
        return vVar.a(w2Var, i, i2, j, z);
    }

    public final long a(w2 decoder, int flag, int size, long defaultValue, boolean skip) {
        if (flag > 0) {
            return decoder.d(size);
        }
        if (!skip) {
            return defaultValue;
        }
        decoder.d(size);
        return defaultValue;
    }
}
