package com.xiaomi.hm.health.bt.profile.gdsp.pai;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.io.ByteArrayOutputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b)\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\u000e\u0012\u0006\u00101\u001a\u00020\u000e\u0012\u0006\u00104\u001a\u00020\u000e\u0012\b\b\u0002\u00107\u001a\u00020\u0002\u0012\b\b\u0002\u0010:\u001a\u00020\u0002\u0012\b\b\u0002\u0010=\u001a\u00020\u0002\u0012\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a¢\u0006\u0004\bA\u0010BJ\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0016\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0019\u0010\u0019\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0007\u001a\u0004\b\u0018\u0010\tR\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\"\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u0007\u001a\u0004\b!\u0010\tR\u0019\u0010%\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u0007\u001a\u0004\b$\u0010\tR\u0019\u0010(\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u0007\u001a\u0004\b'\u0010\tR\u0019\u0010+\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010\u0007\u001a\u0004\b*\u0010\tR\u0019\u0010.\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010\u0010\u001a\u0004\b-\u0010\u0012R\u0019\u00101\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b/\u0010\u0010\u001a\u0004\b0\u0010\u0012R\u0019\u00104\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010\u0010\u001a\u0004\b3\u0010\u0012R\u0019\u00107\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b5\u0010\u0007\u001a\u0004\b6\u0010\tR\u0019\u0010:\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b8\u0010\u0007\u001a\u0004\b9\u0010\tR\u0019\u0010=\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010\u0007\u001a\u0004\b<\u0010\tR\u001f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b>\u0010\u001c\u001a\u0004\b?\u0010\u001e¨\u0006C"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/pai/HMWriteBackPaiInfo;", "", "", "version", "", "toBytes", "a", LogUtil.I, "getTime", "()I", "time", "b", "getTimeZone", "timeZone", "", "c", "F", "getTotalPai", "()F", "totalPai", GoogleApiAvailabilityLight.a, "getDailyPai", "dailyPai", "e", "getIndex", "index", "", "f", "Ljava/util/List;", "getActivityScores", "()Ljava/util/List;", "activityScores", "g", "getGender", "gender", "h", "getAge", "age", "i", "getMaxHr", Constant.PAI_KEY_MAX_HR, z.j, "getRestHr", Constant.PAI_KEY_RHR, hl.k, "getLZonePai", "lZonePai", "l", "getMZonePai", "mZonePai", "m", "getHZonePai", "hZonePai", GoogleApiAvailabilityLight.b, "getLowZoneTime", "lowZoneTime", "o", "getMediumZoneTime", "mediumZoneTime", b.r, "getHighZoneTime", "highZoneTime", DTransferConstants.SEARCH_KEY, "getNextActivityScores", "nextActivityScores", "<init>", "(IIFFILjava/util/List;IIIIFFFIIILjava/util/List;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HMWriteBackPaiInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int timeZone;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float totalPai;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float dailyPai;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final List<Float> activityScores;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int gender;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int age;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int maxHr;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int restHr;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final float lZonePai;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final float mZonePai;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final float hZonePai;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int lowZoneTime;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int mediumZoneTime;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final int highZoneTime;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final List<Float> nextActivityScores;

    public HMWriteBackPaiInfo(int i, int i2, float f, float f2, int i3, @NotNull List<Float> list, int i4, int i5, int i6, int i7, float f3, float f4, float f5, int i8, int i9, int i10, @NotNull List<Float> list2) {
        this.time = i;
        this.timeZone = i2;
        this.totalPai = f;
        this.dailyPai = f2;
        this.index = i3;
        this.activityScores = list;
        this.gender = i4;
        this.age = i5;
        this.maxHr = i6;
        this.restHr = i7;
        this.lZonePai = f3;
        this.mZonePai = f4;
        this.hZonePai = f5;
        this.lowZoneTime = i8;
        this.mediumZoneTime = i9;
        this.highZoneTime = i10;
        this.nextActivityScores = list2;
    }

    public static /* synthetic */ byte[] toBytes$default(HMWriteBackPaiInfo hMWriteBackPaiInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return hMWriteBackPaiInfo.toBytes(i);
    }

    @NotNull
    public final List<Float> getActivityScores() {
        return this.activityScores;
    }

    public final int getAge() {
        return this.age;
    }

    public final float getDailyPai() {
        return this.dailyPai;
    }

    public final int getGender() {
        return this.gender;
    }

    public final float getHZonePai() {
        return this.hZonePai;
    }

    public final int getHighZoneTime() {
        return this.highZoneTime;
    }

    public final int getIndex() {
        return this.index;
    }

    public final float getLZonePai() {
        return this.lZonePai;
    }

    public final int getLowZoneTime() {
        return this.lowZoneTime;
    }

    public final float getMZonePai() {
        return this.mZonePai;
    }

    public final int getMaxHr() {
        return this.maxHr;
    }

    public final int getMediumZoneTime() {
        return this.mediumZoneTime;
    }

    @NotNull
    public final List<Float> getNextActivityScores() {
        return this.nextActivityScores;
    }

    public final int getRestHr() {
        return this.restHr;
    }

    public final int getTime() {
        return this.time;
    }

    public final int getTimeZone() {
        return this.timeZone;
    }

    public final float getTotalPai() {
        return this.totalPai;
    }

    @NotNull
    public final byte[] toBytes(int version) {
        int size;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(GattUtils.intToBytes(this.time));
        byteArrayOutputStream.write(GattUtils.intToBytes(this.timeZone));
        byteArrayOutputStream.write(GattUtils.intToBytes(Float.floatToIntBits(this.totalPai)));
        byteArrayOutputStream.write(GattUtils.intToBytes(Float.floatToIntBits(this.dailyPai)));
        byteArrayOutputStream.write(this.index);
        int size2 = this.activityScores.size() - 1;
        int i = 0;
        if (size2 >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                byteArrayOutputStream.write(GattUtils.intToBytes(Float.floatToIntBits(this.activityScores.get(i2).floatValue())));
                if (i3 > size2) {
                    break;
                }
                i2 = i3;
            }
        }
        byteArrayOutputStream.write(this.gender);
        byteArrayOutputStream.write(this.age);
        byteArrayOutputStream.write(GattUtils.numberToBytes(this.maxHr, 2));
        byteArrayOutputStream.write(GattUtils.numberToBytes(this.restHr, 2));
        byteArrayOutputStream.write(GattUtils.intToBytes(Float.floatToIntBits(this.lZonePai)));
        byteArrayOutputStream.write(GattUtils.intToBytes(Float.floatToIntBits(this.mZonePai)));
        byteArrayOutputStream.write(GattUtils.intToBytes(Float.floatToIntBits(this.hZonePai)));
        if (version >= 2) {
            byteArrayOutputStream.write(GattUtils.numberToBytes(this.lowZoneTime, 2));
            byteArrayOutputStream.write(GattUtils.numberToBytes(this.mediumZoneTime, 2));
            byteArrayOutputStream.write(GattUtils.numberToBytes(this.highZoneTime, 2));
        }
        if (version >= 3 && (size = this.nextActivityScores.size() - 1) >= 0) {
            while (true) {
                int i4 = i + 1;
                byteArrayOutputStream.write(GattUtils.intToBytes(Float.floatToIntBits(this.nextActivityScores.get(i).floatValue())));
                if (i4 > size) {
                    break;
                }
                i = i4;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public /* synthetic */ HMWriteBackPaiInfo(int i, int i2, float f, float f2, int i3, List list, int i4, int i5, int i6, int i7, float f3, float f4, float f5, int i8, int i9, int i10, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, f, f2, i3, list, i4, i5, i6, i7, f3, f4, f5, (i11 & 8192) != 0 ? 0 : i8, (i11 & 16384) != 0 ? 0 : i9, (i11 & 32768) != 0 ? 0 : i10, list2);
    }
}
