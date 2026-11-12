package com.xiaomi.hm.health.bt.profile.gdsp.common.profile;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0019\u0010\u000f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u0015\u001a\u00020\u00108F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/profile/DataTransferRate;", "", "", "toString", "", "a", LogUtil.I, "getType", "()I", "type", "b", "getDataSize", "dataSize", "c", "getTimeUsage", "timeUsage", "", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "getDataTransferRate", "()F", "dataTransferRate", "<init>", "(III)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DataTransferRate {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int dataSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int timeUsage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy dataTransferRate = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0007\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Float> {
        public a() {
            super(0);
        }

        public final float a() throws Exception {
            if (DataTransferRate.this.getDataSize() != 0 && DataTransferRate.this.getTimeUsage() == 0) {
                throw new Exception("传输耗时时间是0，可能是传输的太快");
            }
            return DataTransferRate.this.getDataSize() / (DataTransferRate.this.getTimeUsage() * 1.024f);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Float invoke() {
            return Float.valueOf(a());
        }
    }

    public DataTransferRate(int i, int i2, int i3) {
        this.type = i;
        this.dataSize = i2;
        this.timeUsage = i3;
    }

    public final int getDataSize() {
        return this.dataSize;
    }

    public final float getDataTransferRate() {
        return ((Number) this.dataTransferRate.getValue()).floatValue();
    }

    public final int getTimeUsage() {
        return this.timeUsage;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public String toString() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl("DataTransferRate{type=" + getType() + ",size=" + getDataSize() + ",time=" + getTimeUsage() + ",rate=" + getDataTransferRate() + "KB/s}");
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            objM3845constructorimpl = "DataTransferRate{type=" + getType() + ",size=" + getDataSize() + ",time=" + getTimeUsage() + '}';
        }
        return (String) objM3845constructorimpl;
    }
}
