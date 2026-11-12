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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eR(\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0013\u001a\u00020\u000e8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\u00020\u00148\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\u00020\u00148\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/huami/watchfacesstore/device/config/Zurich;", "Lcom/huami/watchfacesstore/device/config/Ness;", "Lkotlin/Pair;", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lkotlin/Pair;", "getRealDialSize", "()Lkotlin/Pair;", "realDialSize", "B", LogUtil.I, "getRealDialRadius", "()I", "realDialRadius", "Lcom/huami/watchfacesstore/device/process/DialFileType;", "C", "Lcom/huami/watchfacesstore/device/process/DialFileType;", "getDialFileType", "()Lcom/huami/watchfacesstore/device/process/DialFileType;", "dialFileType", "", LogUtil.D, "Z", "isSupportDialColor", "()Z", "E", "isSupportDialReplace", "getRealDialPreviewSize", "realDialPreviewSize", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class Zurich extends Ness {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Pair<Integer, Integer> realDialSize = TuplesKt.to(390, Integer.valueOf(FTPCodes.FILE_ACTION_NOT_TAKEN));

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final int realDialRadius = 86;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final DialFileType dialFileType = DialFileType.JS_DIAL;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final boolean isSupportDialColor;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final boolean isSupportDialReplace;

    @Override // com.huami.watchfacesstore.device.config.Ness, com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public DialFileType getDialFileType() {
        return this.dialFileType;
    }

    @Override // com.huami.watchfacesstore.device.config.Ness, com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public Pair<Integer, Integer> getRealDialPreviewSize() {
        return TuplesKt.to(266, 307);
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
