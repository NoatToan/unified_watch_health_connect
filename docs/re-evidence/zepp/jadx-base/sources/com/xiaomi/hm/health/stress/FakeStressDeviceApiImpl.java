package com.xiaomi.hm.health.stress;

import com.huami.stress.domain.data.device.StressDeviceApi;
import com.huami.stress.domain.data.device.bean.StressDeviceBean;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/stress/FakeStressDeviceApiImpl;", "Lcom/huami/stress/domain/data/device/StressDeviceApi;", "", "deviceType", "deviceSource", "Ljava/util/Calendar;", "calendar", "Lkotlin/Pair;", "", "", "Lcom/huami/stress/domain/data/device/bean/StressDeviceBean;", "getDeviceAllDayStress", "(IILjava/util/Calendar;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDeviceSingleStress", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class FakeStressDeviceApiImpl implements StressDeviceApi {
    @Override // com.huami.stress.domain.data.device.StressDeviceApi
    @Nullable
    public Object getDeviceAllDayStress(int i, int i2, @NotNull Calendar calendar, @NotNull Continuation<? super Pair<Boolean, ? extends List<StressDeviceBean>>> continuation) {
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
        return new Pair(Boxing.boxBoolean(true), CollectionsKt__CollectionsKt.emptyList());
    }

    @Override // com.huami.stress.domain.data.device.StressDeviceApi
    @Nullable
    public Object getDeviceSingleStress(int i, int i2, @NotNull Calendar calendar, @NotNull Continuation<? super Pair<Boolean, ? extends List<StressDeviceBean>>> continuation) {
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
        return new Pair(Boxing.boxBoolean(true), CollectionsKt__CollectionsKt.emptyList());
    }
}
