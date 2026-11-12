package com.huami.snore.core.domain;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingWebApi;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b&\u0010'R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/huami/snore/core/domain/RecorderConfig;", "Ljava/io/Serializable;", "", "a", LogUtil.I, "getSampleRate", "()I", "setSampleRate", "(I)V", BehaviorTaggingWebApi.g.s, "b", "getChannels", "setChannels", "channels", "c", "getBitsPerSample", "setBitsPerSample", "bitsPerSample", GoogleApiAvailabilityLight.a, "getTimeLag", "setTimeLag", "timeLag", "", "e", LogUtil.D, "getWindowLen", "()D", "setWindowLen", "(D)V", "windowLen", "", "f", "Ljava/lang/String;", "getTfModel", "()Ljava/lang/String;", "setTfModel", "(Ljava/lang/String;)V", "tfModel", "<init>", "()V", "Companion", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class RecorderConfig implements Serializable {

    @NotNull
    public static final String defaultModePath = "snore_model_v2.tflite";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int sampleRate = 16000;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int channels = 2;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int bitsPerSample = 16;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int timeLag = 5;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private double windowLen = 2.0d;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private String tfModel = defaultModePath;

    public final int getBitsPerSample() {
        return this.bitsPerSample;
    }

    public final int getChannels() {
        return this.channels;
    }

    public final int getSampleRate() {
        return this.sampleRate;
    }

    @NotNull
    public final String getTfModel() {
        return this.tfModel;
    }

    public final int getTimeLag() {
        return this.timeLag;
    }

    public final double getWindowLen() {
        return this.windowLen;
    }

    public final void setBitsPerSample(int i) {
        this.bitsPerSample = i;
    }

    public final void setChannels(int i) {
        this.channels = i;
    }

    public final void setSampleRate(int i) {
        this.sampleRate = i;
    }

    public final void setTfModel(@NotNull String str) {
        this.tfModel = str;
    }

    public final void setTimeLag(int i) {
        this.timeLag = i;
    }

    public final void setWindowLen(double d) {
        this.windowLen = d;
    }
}
