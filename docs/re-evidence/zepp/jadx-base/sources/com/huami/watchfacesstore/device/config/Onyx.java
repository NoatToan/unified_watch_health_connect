package com.huami.watchfacesstore.device.config;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/watchfacesstore/device/config/Onyx;", "Lcom/huami/watchfacesstore/device/config/Circle;", "Lkotlin/Pair;", "", "v", "Lkotlin/Pair;", "getRealDialSize", "()Lkotlin/Pair;", "realDialSize", "w", LogUtil.I, "getRealDialRadius", "()I", "realDialRadius", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public class Onyx extends Circle {

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final Pair<Integer, Integer> realDialSize = TuplesKt.to(416, 416);

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int realDialRadius = 208;

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    public int getRealDialRadius() {
        return this.realDialRadius;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public Pair<Integer, Integer> getRealDialSize() {
        return this.realDialSize;
    }
}
