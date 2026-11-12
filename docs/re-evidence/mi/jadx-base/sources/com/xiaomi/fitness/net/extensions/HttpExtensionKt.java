package com.xiaomi.fitness.net.extensions;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.net.HttpConfig;
import com.xiaomi.fitness.net.response.HttpResultHandler;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0012\u0010\u0003\u001a\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0012\u0010\u0007\u001a\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\b\t\u0010\n*(\u0010\u000b\u001a\u0004\b\u0000\u0010\f\"\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u000e0\r2\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u000e0\r*\"\u0010\u000f\"\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\r2\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\r¨\u0006\u0011"}, d2 = {"appendPath", "", "path", "httpConfig", "Lcom/xiaomi/fitness/net/HttpConfig;", "getHttpConfig", "()Lcom/xiaomi/fitness/net/HttpConfig;", "resultHandler", "Lcom/xiaomi/fitness/net/response/HttpResultHandler;", "getResultHandler", "()Lcom/xiaomi/fitness/net/response/HttpResultHandler;", "OnSuccess", "T", "Lkotlin/Function1;", "", "OnFail", "Lcom/xiaomi/fitness/net/response/ApiException;", "net_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHttpExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,49:1\n28#1,2:50\n*S KotlinDebug\n*F\n+ 1 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n31#1:50,2\n*E\n"})
public final class HttpExtensionKt {
    @NotNull
    public static final String appendPath(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str2 == null) {
            str2 = "";
        }
        return new Regex("([^:/])/{2,}").replace(str + "/" + str2 + "/", "$1/");
    }

    public static /* synthetic */ String appendPath$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = null;
        }
        return appendPath(str, str2);
    }

    @NotNull
    public static final HttpConfig getHttpConfig() {
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig();
    }

    @NotNull
    public static final HttpResultHandler getResultHandler() {
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler();
    }
}
