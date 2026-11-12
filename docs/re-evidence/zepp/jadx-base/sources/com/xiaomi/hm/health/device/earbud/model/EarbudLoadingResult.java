package com.xiaomi.hm.health.device.earbud.model;

import com.alipay.sdk.m.f0.c;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001b\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/model/EarbudLoadingResult;", "", "", "isLoading", "isSuccess", "isFail", "Lcom/xiaomi/hm/health/device/earbud/model/EarbudLoadingType;", "a", "Lcom/xiaomi/hm/health/device/earbud/model/EarbudLoadingType;", "getType", "()Lcom/xiaomi/hm/health/device/earbud/model/EarbudLoadingType;", "type", "", "b", LogUtil.I, "status", "<init>", "(Lcom/xiaomi/hm/health/device/earbud/model/EarbudLoadingType;I)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudLoadingResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int c = 0;
    private static final int d = 1;
    private static final int e = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final EarbudLoadingType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int status;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/model/EarbudLoadingResult$Companion;", "", "Lcom/xiaomi/hm/health/device/earbud/model/EarbudLoadingType;", "type", "Lcom/xiaomi/hm/health/device/earbud/model/EarbudLoadingResult;", "loading", "success", "fail", "", "FAIL", LogUtil.I, "LOADING", c.p, "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EarbudLoadingResult fail(@NotNull EarbudLoadingType type) {
            return new EarbudLoadingResult(type, 2, null);
        }

        @NotNull
        public final EarbudLoadingResult loading(@NotNull EarbudLoadingType type) {
            return new EarbudLoadingResult(type, 0, null);
        }

        @NotNull
        public final EarbudLoadingResult success(@NotNull EarbudLoadingType type) {
            return new EarbudLoadingResult(type, 1, null);
        }
    }

    private EarbudLoadingResult(EarbudLoadingType earbudLoadingType, int i) {
        this.type = earbudLoadingType;
        this.status = i;
    }

    public /* synthetic */ EarbudLoadingResult(EarbudLoadingType earbudLoadingType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(earbudLoadingType, i);
    }

    @NotNull
    public final EarbudLoadingType getType() {
        return this.type;
    }

    public final boolean isFail() {
        return this.status == 2;
    }

    public final boolean isLoading() {
        return this.status == 0;
    }

    public final boolean isSuccess() {
        return this.status == 1;
    }

    public /* synthetic */ EarbudLoadingResult(EarbudLoadingType earbudLoadingType, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(earbudLoadingType, (i2 & 2) != 0 ? 0 : i);
    }
}
