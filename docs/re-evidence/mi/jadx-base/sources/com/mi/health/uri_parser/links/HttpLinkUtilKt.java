package com.mi.health.uri_parser.links;

import android.net.Uri;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"linkUri", "Landroid/net/Uri;", "getLinkUri", "()Landroid/net/Uri;", "setLinkUri", "(Landroid/net/Uri;)V", "uri-parser_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HttpLinkUtilKt {

    @Nullable
    private static Uri linkUri;

    @Nullable
    public static final Uri getLinkUri() {
        return linkUri;
    }

    public static final void setLinkUri(@Nullable Uri uri) {
        linkUri = uri;
    }
}
