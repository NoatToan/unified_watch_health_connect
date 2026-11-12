package com.xiaomi.fitness.net.utils;

import android.text.TextUtils;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.prk;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u00020\u00022\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\n\u0010\tJ!\u0010\f\u001a\u00020\u00022\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u000e2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u0014\u0010\u0010J\u0019\u0010\u0015\u001a\u00020\u00022\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u0015\u0010\tJ!\u0010\u0017\u001a\u00020\u00112\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/net/utils/HttpUtil;", "", "", "url", "getFileNameFromUrl", "(Ljava/lang/String;)Ljava/lang/String;", "Lprk;", b.I, "getFileName", "(Lprk;)Ljava/lang/String;", "contentDisposition", "key", "header", "(Lprk;Ljava/lang/String;)Ljava/lang/String;", "", "isSupportRange", "(Lprk;)Z", "", "getContentLength", "(Lprk;)J", "isChunked", "getUrl", "rangeSize", "getSliceCount", "(Lprk;J)J", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "CONTENT_PATTERN", "Ljava/util/regex/Pattern;", "<init>", "()V", "net_release"}, k = 1, mv = {2, 0, 0})
public final class HttpUtil {

    @NotNull
    public static final HttpUtil INSTANCE = new HttpUtil();
    private static final Pattern CONTENT_PATTERN = Pattern.compile(".*filename=(.*)");

    private HttpUtil() {
    }

    private final String getFileNameFromUrl(String url) {
        if (TextUtils.isEmpty(url)) {
            return "";
        }
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) url, PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX, 0, false, 6, (Object) null);
        if (iLastIndexOf$default > 0) {
            url = url.substring(0, iLastIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(url, "substring(...)");
        }
        int iLastIndexOf$default2 = StringsKt__StringsKt.lastIndexOf$default((CharSequence) url, "?", 0, false, 6, (Object) null);
        if (iLastIndexOf$default2 > 0) {
            url = url.substring(0, iLastIndexOf$default2);
            Intrinsics.checkNotNullExpressionValue(url, "substring(...)");
        }
        int iLastIndexOf$default3 = StringsKt__StringsKt.lastIndexOf$default((CharSequence) url, "/", 0, false, 6, (Object) null);
        if (iLastIndexOf$default3 >= 0) {
            url = url.substring(iLastIndexOf$default3 + 1);
            Intrinsics.checkNotNullExpressionValue(url, "substring(...)");
        }
        return (TextUtils.isEmpty(url) || !Pattern.matches("[a-zA-Z_0-9.\\-()%]+", url)) ? "" : url;
    }

    @NotNull
    public final String contentDisposition(@NotNull prk<?> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        String strHeader = header(response, "Content-Disposition");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = strHeader.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Matcher matcher = CONTENT_PATTERN.matcher(lowerCase);
        if (!matcher.find()) {
            return "";
        }
        String strGroup = matcher.group(1);
        Intrinsics.checkNotNull(strGroup);
        if (StringsKt__StringsJVMKt.startsWith$default(strGroup, "\"", false, 2, null)) {
            Intrinsics.checkNotNull(strGroup);
            strGroup = strGroup.substring(1);
            Intrinsics.checkNotNullExpressionValue(strGroup, "substring(...)");
        }
        Intrinsics.checkNotNull(strGroup);
        if (StringsKt__StringsJVMKt.endsWith$default(strGroup, "\"", false, 2, null)) {
            Intrinsics.checkNotNull(strGroup);
            strGroup = strGroup.substring(0, strGroup.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strGroup, "substring(...)");
        }
        String str = strGroup;
        Intrinsics.checkNotNull(str);
        return StringsKt__StringsJVMKt.replace$default(str, "/", RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR, false, 4, (Object) null);
    }

    public final long getContentLength(@NotNull prk<?> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            return Long.parseLong(header(response, HTTP.CONTENT_LEN));
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Nullable
    public final String getFileName(@NotNull prk<?> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        String strContentDisposition = contentDisposition(response);
        return TextUtils.isEmpty(strContentDisposition) ? getFileNameFromUrl(getUrl(response)) : strContentDisposition;
    }

    public final long getSliceCount(@NotNull prk<?> response, long rangeSize) {
        Intrinsics.checkNotNullParameter(response, "response");
        long contentLength = getContentLength(response);
        long j = contentLength % rangeSize;
        long j2 = contentLength / rangeSize;
        return j == 0 ? j2 : j2 + 1;
    }

    @NotNull
    public final String getUrl(@NotNull prk<?> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return response.g().request().url().getUrl();
    }

    @NotNull
    public final String header(@NotNull prk<?> response, @NotNull String key) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(key, "key");
        String str = response.d().get(key);
        return str == null ? "" : str;
    }

    public final boolean isChunked(@NotNull prk<?> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return Intrinsics.areEqual(HTTP.CHUNK_CODING, header(response, HTTP.TRANSFER_ENCODING));
    }

    public final boolean isSupportRange(@NotNull prk<?> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return response.b() == 206 || header(response, "Content-Range").length() > 0 || Intrinsics.areEqual("bytes", header(response, "Accept-Ranges"));
    }
}
