package com.xiaomi.hm.health.bt.profile.weight;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.huami.passport.Configs;
import com.xiaomi.hm.health.bt.model.MeasureData;
import com.xiaomi.hm.health.bt.model.MeasureState;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.bt.model.WeightUnitUtilsKt;
import com.xiaomi.hm.health.bt.profile.base.MKTime;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 (2\u00020\u0001:\u0001(B\u001b\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0002J2\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002J2\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\r2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002J\u0006\u0010\u0010\u001a\u00020\u000fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0006\u0010\u0017\u001a\u00020\u000fR\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0016\u0010!\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u001d\u0010\u0005\u001a\u00020\u00048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001b\u0010%¨\u0006)"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/weight/AmazfitScaleRecordParser;", "Lcom/xiaomi/hm/health/bt/profile/weight/IWeightRecordParser;", "Lcom/xiaomi/hm/health/bt/model/MeasureData;", "a", "Lcom/huami/bluetooth/utils/BufByteDecoder;", "decoder", "", "flag", "size", "defaultValue", "", PointCategory.SKIP, "e", "", "c", "", Configs.Params.RESET, "", "byteArray", "Lcom/xiaomi/hm/health/bt/model/WeightAdvData;", "parseSingle", "", "parse", "clear", LogUtil.I, "sourceValue", "", "b", "Ljava/lang/String;", "deviceId", "Z", "start", GoogleApiAvailabilityLight.a, "isFinished", "decodeFinished", "f", "Lkotlin/Lazy;", "()Lcom/huami/bluetooth/utils/BufByteDecoder;", "<init>", "(ILjava/lang/String;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class AmazfitScaleRecordParser implements IWeightRecordParser {
    private static final long g = 10000;
    private static final long h = 100;
    private static final int i = 10;
    private static final int j = 5;

    @NotNull
    private static final String k = "AmazfitScaleRecordParser";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int sourceValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final String deviceId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean start;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isFinished;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean decodeFinished;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy decoder;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/utils/BufByteDecoder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<BufByteDecoder> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BufByteDecoder invoke() {
            return new BufByteDecoder(null, 0, 3, null);
        }
    }

    public AmazfitScaleRecordParser(int i2, @Nullable String str) {
        this.sourceValue = i2;
        this.deviceId = str;
        this.decoder = LazyKt__LazyJVMKt.lazy(a.a);
    }

    private final MeasureData a() {
        float f;
        float f2;
        float fConvertTo;
        int i2 = b().readShort();
        Calendar calendar = Calendar.getInstance(MKTime.INSTANCE.zoneKeyToTimeZone(0));
        calendar.clear();
        long j2 = b().readLong(5);
        calendar.set(1, (int) (8191 & j2));
        calendar.set(2, ((int) ((j2 >> 13) & 15)) - 1);
        calendar.set(5, (int) ((j2 >> 17) & 31));
        calendar.set(11, (int) ((j2 >> 22) & 63));
        calendar.set(12, (int) ((j2 >> 28) & 63));
        calendar.set(13, (int) ((j2 >> 34) & 63));
        int iF = f(this, b(), i2 & 8, 2, 0, false, 16, null);
        int iF2 = f(this, b(), i2 & 16, 3, -1, false, 16, null);
        int iF3 = f(this, b(), i2 & 32, 1, 0, false, 16, null);
        int iF4 = f(this, b(), i2 & 64, 1, -1, false, 16, null);
        long jD = d(this, b(), i2 & 128, 6, -2L, false, 16, null);
        int i3 = (i2 & 256) >> 8;
        boolean z = iF == 65535;
        int i4 = !z ? (i2 & 1) | ((i2 & 16384) >> 10) : 0;
        if (z) {
            fConvertTo = iF;
        } else {
            if (i4 != 0) {
                f = iF;
                f2 = 100.0f;
            } else {
                f = iF;
                f2 = 200.0f;
            }
            fConvertTo = f / f2;
        }
        if (i4 == 17) {
            fConvertTo = WeightUnitUtilsKt.convertTo(fConvertTo, 1, 17);
        }
        return new MeasureData(i2, i4, calendar.getTimeInMillis(), iF2, fConvertTo, iF3, iF4, jD, i3, z);
    }

    private final BufByteDecoder b() {
        return (BufByteDecoder) this.decoder.getValue();
    }

    private final long c(BufByteDecoder decoder, int flag, int size, long defaultValue, boolean skip) {
        if (flag > 0) {
            return decoder.readLong(size);
        }
        if (!skip) {
            return defaultValue;
        }
        decoder.readLong(size);
        return defaultValue;
    }

    public static /* synthetic */ long d(AmazfitScaleRecordParser amazfitScaleRecordParser, BufByteDecoder bufByteDecoder, int i2, int i3, long j2, boolean z, int i4, Object obj) {
        return amazfitScaleRecordParser.c(bufByteDecoder, i2, i3, j2, (i4 & 16) != 0 ? true : z);
    }

    private final int e(BufByteDecoder decoder, int flag, int size, int defaultValue, boolean skip) {
        if (flag > 0) {
            return decoder.readInt(size);
        }
        if (!skip) {
            return defaultValue;
        }
        decoder.readInt(size);
        return defaultValue;
    }

    public static /* synthetic */ int f(AmazfitScaleRecordParser amazfitScaleRecordParser, BufByteDecoder bufByteDecoder, int i2, int i3, int i4, boolean z, int i5, Object obj) {
        return amazfitScaleRecordParser.e(bufByteDecoder, i2, i3, i4, (i5 & 16) != 0 ? true : z);
    }

    public final void clear() {
        b().clear();
    }

    @Override // com.xiaomi.hm.health.bt.profile.weight.IWeightRecordParser
    @NotNull
    public List<WeightAdvData> parse(@NotNull byte[] byteArray) {
        ArrayList arrayList = new ArrayList();
        try {
            b().append(byteArray);
            while (true) {
                MeasureData measureDataA = a();
                WeightAdvData weightAdvData = new WeightAdvData(measureDataA.getUnit(), measureDataA.getWeight(), measureDataA.getTimestamp(), measureDataA.measureState() == MeasureState.MEASURING_WEIGHT && measureDataA.measureResult() == 1, true, false, measureDataA.measureState() == MeasureState.MEASURING_FINISHED);
                weightAdvData.setImpedance(measureDataA.getImpedance());
                weightAdvData.setMeasureState(measureDataA.measureState());
                weightAdvData.setMeasureData(measureDataA);
                weightAdvData.setSourceValue(this.sourceValue);
                weightAdvData.setDeviceId(this.deviceId);
                arrayList.add(weightAdvData);
            }
        } catch (Exception unused) {
            return CollectionsKt___CollectionsKt.toList(arrayList);
        }
    }

    @Nullable
    public final WeightAdvData parseSingle(@NotNull byte[] byteArray) {
        List<WeightAdvData> list = parse(byteArray);
        if (list.isEmpty()) {
            return null;
        }
        return (WeightAdvData) CollectionsKt.first((List) list);
    }

    public final void reset() {
        this.start = false;
        this.isFinished = false;
        this.decodeFinished = false;
    }

    public /* synthetic */ AmazfitScaleRecordParser(int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, (i3 & 2) != 0 ? null : str);
    }
}
