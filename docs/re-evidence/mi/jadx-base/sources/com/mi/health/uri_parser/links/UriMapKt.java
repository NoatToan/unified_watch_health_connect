package com.mi.health.uri_parser.links;

import android.net.Uri;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.gv5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n\u001a\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"linkShortHost", "", "linkShortPath", "linkShortHost2", "linkShortPath2", "linkUrlPrefix", "linkMijiaHost", "isMiHomeLink", "", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "isShortLink", "isLongLink", "getLongUri", "getActionType", "uri-parser_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UriMapKt {

    @NotNull
    public static final String linkMijiaHost = "home.mi.com";

    @NotNull
    public static final String linkShortHost = "s.mi.cn";

    @NotNull
    public static final String linkShortHost2 = "watch.iot.mi.com";

    @NotNull
    public static final String linkShortPath = "/c/MUad2B";

    @NotNull
    public static final String linkShortPath2 = "/download-apps-v3.html";

    @NotNull
    public static final String linkUrlPrefix = "https://region.hlth.io.mi.com/applinks/peripheral/connect?";

    @Nullable
    public static final String getActionType(@NotNull Uri uri) {
        int iIndexOf$default;
        Intrinsics.checkNotNullParameter(uri, "uri");
        String path = uri.getPath();
        if (path == null) {
            return null;
        }
        if (StringsKt__StringsJVMKt.startsWith$default(path, "/", false, 2, null)) {
            path = path.substring(1);
            Intrinsics.checkNotNullExpressionValue(path, "substring(...)");
        }
        int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) path, "/", 0, false, 6, (Object) null);
        if (iIndexOf$default2 <= -1) {
            return null;
        }
        String strSubstring = path.substring(iIndexOf$default2 + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        if (strSubstring == null || (iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strSubstring, "/", 0, false, 6, (Object) null)) <= -1) {
            return strSubstring;
        }
        String strSubstring2 = strSubstring.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    @NotNull
    public static final Uri getLongUri(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        StringBuilder sb = new StringBuilder(linkUrlPrefix);
        String queryParameter = uri.getQueryParameter("btmac");
        String queryParameter2 = uri.getQueryParameter("pid");
        String queryParameter3 = uri.getQueryParameter("oob");
        sb.append("pid=");
        sb.append(queryParameter2);
        sb.append(gv5.CONNECT_STR);
        sb.append("btmac=");
        sb.append(queryParameter);
        sb.append(gv5.CONNECT_STR);
        sb.append("oob=");
        sb.append(queryParameter3);
        Logger.i("getRealMachineUri():" + ((Object) sb), new Object[0]);
        Uri uri2 = Uri.parse(sb.toString());
        Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
        return uri2;
    }

    public static final boolean isLongLink(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String path = uri.getPath();
        return path != null && StringsKt__StringsKt.contains$default((CharSequence) path, (CharSequence) "applinks", false, 2, (Object) null);
    }

    public static final boolean isMiHomeLink(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            return Intrinsics.areEqual(linkMijiaHost, uri.getHost());
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean isShortLink(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            String host = uri.getHost();
            String path = uri.getPath();
            if (Intrinsics.areEqual(linkShortHost, host) && Intrinsics.areEqual(linkShortPath, path)) {
                return true;
            }
            return Intrinsics.areEqual("watch.iot.mi.com", host) && Intrinsics.areEqual(linkShortPath2, path);
        } catch (Exception unused) {
            return false;
        }
    }
}
