package com.xiaomi.fitness.main.config;

import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.net.TSMAuthContants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/main/config/QueryParams;", "", "<init>", "()V", TSMAuthContants.PARAM_LANGUAGE, "", "getLang", "()Ljava/lang/String;", "setLang", "(Ljava/lang/String;)V", "version", "", "getVersion", "()J", "setVersion", "(J)V", CommonConstants.KEY_OS, "", "getOs", "()I", "setOs", "(I)V", "feature_name", "getFeature_name", "setFeature_name", "main_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QueryParams {

    @NotNull
    private String lang = "zh_CN";
    private long version = 1;
    private int os = 1;

    @NotNull
    private String feature_name = "notification";

    @NotNull
    public final String getFeature_name() {
        return this.feature_name;
    }

    @NotNull
    public final String getLang() {
        return this.lang;
    }

    public final int getOs() {
        return this.os;
    }

    public final long getVersion() {
        return this.version;
    }

    public final void setFeature_name(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.feature_name = str;
    }

    public final void setLang(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lang = str;
    }

    public final void setOs(int i) {
        this.os = i;
    }

    public final void setVersion(long j) {
        this.version = j;
    }
}
