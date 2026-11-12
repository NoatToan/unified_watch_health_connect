package com.huami.watchfacesstore.device.config;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watchfacesstore.device.process.DialFileType;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u00028\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\t8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR(\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/watchfacesstore/device/config/Wast;", "Lcom/huami/watchfacesstore/device/config/Provence;", "", "H", "Z", "isSupportDialColor", "()Z", LogUtil.I, "isSupportDialReplace", "Lcom/huami/watchfacesstore/device/process/DialFileType;", "J", "Lcom/huami/watchfacesstore/device/process/DialFileType;", "getDialFileType", "()Lcom/huami/watchfacesstore/device/process/DialFileType;", "dialFileType", "Lkotlin/Pair;", "", "K", "Lkotlin/Pair;", "getRealDialPreviewSize", "()Lkotlin/Pair;", "realDialPreviewSize", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class Wast extends Provence {

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final boolean isSupportDialColor = true;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final boolean isSupportDialReplace = true;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    private final DialFileType dialFileType = DialFileType.UIH_ORIGIN_DIAL;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    private final Pair<Integer, Integer> realDialPreviewSize = TuplesKt.to(228, 260);

    @Override // com.huami.watchfacesstore.device.config.Provence, com.huami.watchfacesstore.device.config.Ness, com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public DialFileType getDialFileType() {
        return this.dialFileType;
    }

    @Override // com.huami.watchfacesstore.device.config.Provence, com.huami.watchfacesstore.device.config.Ness, com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public Pair<Integer, Integer> getRealDialPreviewSize() {
        return this.realDialPreviewSize;
    }

    @Override // com.huami.watchfacesstore.device.config.Provence, com.huami.watchfacesstore.device.config.Ness, com.huami.watchfacesstore.device.config.IDeviceConfig
    /* JADX INFO: renamed from: isSupportDialColor, reason: from getter */
    public boolean getIsSupportDialColor() {
        return this.isSupportDialColor;
    }

    @Override // com.huami.watchfacesstore.device.config.Provence, com.huami.watchfacesstore.device.config.Ness, com.huami.watchfacesstore.device.config.IDeviceConfig
    /* JADX INFO: renamed from: isSupportDialReplace, reason: from getter */
    public boolean getIsSupportDialReplace() {
        return this.isSupportDialReplace;
    }
}
