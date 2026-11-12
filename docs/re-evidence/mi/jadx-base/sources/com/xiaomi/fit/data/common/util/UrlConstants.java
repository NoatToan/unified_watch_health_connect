package com.xiaomi.fit.data.common.util;

import com.xiaomi.fitness.common.utils.AppUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fit/data/common/util/UrlConstants;", "", "<init>", "()V", "HOST_SERVICE_QRCODE", "", "HOST_SERVICE_QRCODE_PLAY", "getQRCodeDownloadHtmlUrl", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UrlConstants {

    @NotNull
    private static final String HOST_SERVICE_QRCODE = "https://hlth.io.mi.com/download?redir=mifitness";

    @NotNull
    private static final String HOST_SERVICE_QRCODE_PLAY = "https://region.hlth.io.mi.com/abroad_download?redir=mifitness";

    @NotNull
    public static final UrlConstants INSTANCE = new UrlConstants();

    private UrlConstants() {
    }

    @NotNull
    public final String getQRCodeDownloadHtmlUrl() {
        return AppUtil.INSTANCE.isPlayChannel() ? HOST_SERVICE_QRCODE_PLAY : HOST_SERVICE_QRCODE;
    }
}
