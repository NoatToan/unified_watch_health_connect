package com.huami.watchfacesstore.device.config;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watchfacesstore.device.process.DialFileType;
import it.sauronsoftware.ftp4j.FTPCodes;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$R(\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R(\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R(\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007R\u001c\u0010\u0013\u001a\u00020\u00038\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\u00020\u00148\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\u00020\u00148\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010 \u001a\u00020\u001b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0007¨\u0006%"}, d2 = {"Lcom/huami/watchfacesstore/device/config/Provence;", "Lcom/huami/watchfacesstore/device/config/Ness;", "Lkotlin/Pair;", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lkotlin/Pair;", "getDialInCardSizeTwo", "()Lkotlin/Pair;", "dialInCardSizeTwo", "B", "getDialInCardSizeThree", "dialInCardSizeThree", "C", "getRealDialSize", "realDialSize", LogUtil.D, LogUtil.I, "getRealDialRadius", "()I", "realDialRadius", "", "E", "Z", "isSupportDialColor", "()Z", "F", "isSupportDialReplace", "Lcom/huami/watchfacesstore/device/process/DialFileType;", "G", "Lcom/huami/watchfacesstore/device/process/DialFileType;", "getDialFileType", "()Lcom/huami/watchfacesstore/device/process/DialFileType;", "dialFileType", "getRealDialPreviewSize", "realDialPreviewSize", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public class Provence extends Ness {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final boolean isSupportDialColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final boolean isSupportDialReplace;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Pair<Integer, Integer> dialInCardSizeTwo = TuplesKt.to(113, 131);

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Pair<Integer, Integer> dialInCardSizeThree = TuplesKt.to(103, 119);

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final Pair<Integer, Integer> realDialSize = TuplesKt.to(336, 384);

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final int realDialRadius = 80;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    private final DialFileType dialFileType = DialFileType.JS_DIAL;

    @Override // com.huami.watchfacesstore.device.config.Ness, com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public DialFileType getDialFileType() {
        return this.dialFileType;
    }

    @Override // com.huami.watchfacesstore.device.config.Ness, com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public Pair<Integer, Integer> getDialInCardSizeThree() {
        return this.dialInCardSizeThree;
    }

    @Override // com.huami.watchfacesstore.device.config.Ness, com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public Pair<Integer, Integer> getDialInCardSizeTwo() {
        return this.dialInCardSizeTwo;
    }

    @Override // com.huami.watchfacesstore.device.config.Ness, com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public Pair<Integer, Integer> getRealDialPreviewSize() {
        return TuplesKt.to(Integer.valueOf(FTPCodes.ENTER_PASSIVE_MODE), 260);
    }

    @Override // com.huami.watchfacesstore.device.config.Ness, com.huami.watchfacesstore.device.config.IDeviceConfig
    public int getRealDialRadius() {
        return this.realDialRadius;
    }

    @Override // com.huami.watchfacesstore.device.config.Ness, com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public Pair<Integer, Integer> getRealDialSize() {
        return this.realDialSize;
    }

    @Override // com.huami.watchfacesstore.device.config.Ness, com.huami.watchfacesstore.device.config.IDeviceConfig
    /* JADX INFO: renamed from: isSupportDialColor, reason: from getter */
    public boolean getIsSupportDialColor() {
        return this.isSupportDialColor;
    }

    @Override // com.huami.watchfacesstore.device.config.Ness, com.huami.watchfacesstore.device.config.IDeviceConfig
    /* JADX INFO: renamed from: isSupportDialReplace, reason: from getter */
    public boolean getIsSupportDialReplace() {
        return this.isSupportDialReplace;
    }
}
