package com.xiaomi.fitness.nfc.bean.yoyo;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/nfc/bean/yoyo/CardInfoRequest;", "", "cplc", "", "device_id", "device_model", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCplc", "()Ljava/lang/String;", "setCplc", "(Ljava/lang/String;)V", "getDevice_id", "setDevice_id", "getDevice_model", "setDevice_model", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CardInfoRequest {

    @NotNull
    private String cplc;

    @NotNull
    private String device_id;

    @NotNull
    private String device_model;

    public CardInfoRequest(@NotNull String cplc, @NotNull String device_id, @NotNull String device_model) {
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        Intrinsics.checkNotNullParameter(device_id, "device_id");
        Intrinsics.checkNotNullParameter(device_model, "device_model");
        this.cplc = cplc;
        this.device_id = device_id;
        this.device_model = device_model;
    }

    @NotNull
    public final String getCplc() {
        return this.cplc;
    }

    @NotNull
    public final String getDevice_id() {
        return this.device_id;
    }

    @NotNull
    public final String getDevice_model() {
        return this.device_model;
    }

    public final void setCplc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cplc = str;
    }

    public final void setDevice_id(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.device_id = str;
    }

    public final void setDevice_model(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.device_model = str;
    }
}
