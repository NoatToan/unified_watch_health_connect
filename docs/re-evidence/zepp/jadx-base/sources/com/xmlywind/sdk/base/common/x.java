package com.xmlywind.sdk.base.common;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.videoAd.BaseAdActivity;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public enum x {
    IGNORE_ABOUT_SCHEME(0 == true ? 1 : 0) { // from class: com.xmlywind.sdk.base.common.x.1
        @Override // com.xmlywind.sdk.base.common.x
        public void a(Context context, Uri uri, y yVar, BaseAdUnit baseAdUnit) {
            SigmobLog.d("Link to about page ignored.");
        }

        @Override // com.xmlywind.sdk.base.common.x
        public boolean a(Uri uri) {
            return "about".equalsIgnoreCase(uri.getScheme());
        }
    },
    OPEN_WITH_LANDPAGE(1 == true ? 1 : 0) { // from class: com.xmlywind.sdk.base.common.x.2
        @Override // com.xmlywind.sdk.base.common.x
        public void a(Context context, Uri uri, y yVar, BaseAdUnit baseAdUnit) {
        }

        @Override // com.xmlywind.sdk.base.common.x
        public boolean a(Uri uri) {
            String scheme = uri.getScheme();
            return "HTTP".equalsIgnoreCase(scheme) || "HTTPS".equalsIgnoreCase(scheme);
        }
    },
    OPEN_WITH_BROWSER(1 == true ? 1 : 0) { // from class: com.xmlywind.sdk.base.common.x.3
        @Override // com.xmlywind.sdk.base.common.x
        public void a(Context context, Uri uri, y yVar, BaseAdUnit baseAdUnit) throws com.xmlywind.sdk.common.c.b {
            if (yVar.b()) {
                com.xmlywind.sdk.common.utils.j.a(context, uri);
            } else {
                d.b(baseAdUnit);
                BaseAdActivity.a(context, AdActivity.class, baseAdUnit.getUuid());
            }
        }

        @Override // com.xmlywind.sdk.base.common.x
        public boolean a(Uri uri) {
            String scheme = uri.getScheme();
            return "HTTP".equalsIgnoreCase(scheme) || "HTTPS".equalsIgnoreCase(scheme);
        }
    },
    HANDLE_SIGMOBAD_SCHEME(1 == true ? 1 : 0) { // from class: com.xmlywind.sdk.base.common.x.4
        @Override // com.xmlywind.sdk.base.common.x
        public void a(Context context, Uri uri, y yVar, BaseAdUnit baseAdUnit) throws com.xmlywind.sdk.common.c.b {
            String host = uri.getHost();
            y.c cVarA = yVar.a();
            if (WatchFaceApi.SORT_DOWNLOAD.equalsIgnoreCase(host)) {
                cVarA.a();
                return;
            }
            if ("close".equalsIgnoreCase(host)) {
                cVarA.b();
            } else {
                if ("failLoad".equalsIgnoreCase(host)) {
                    cVarA.c();
                    return;
                }
                throw new com.xmlywind.sdk.common.c.b("Could not handle Sigmob Scheme url: " + uri);
            }
        }

        @Override // com.xmlywind.sdk.base.common.x
        public boolean a(Uri uri) {
            return "sigmobAd".equalsIgnoreCase(uri.getScheme());
        }
    },
    FOLLOW_DEEP_LINK_WITH_FALLBACK(1 == true ? 1 : 0) { // from class: com.xmlywind.sdk.base.common.x.5
        @Override // com.xmlywind.sdk.base.common.x
        public void a(Context context, Uri uri, y yVar, BaseAdUnit baseAdUnit) throws com.xmlywind.sdk.common.c.b {
            try {
                String queryParameter = uri.getQueryParameter("primaryUrl");
                uri.getQueryParameters("primaryTrackingUrl");
                String queryParameter2 = uri.getQueryParameter("fallbackUrl");
                List<String> queryParameters = uri.getQueryParameters("fallbackTrackingUrl");
                if (queryParameter == null) {
                    throw new com.xmlywind.sdk.common.c.b("Deeplink+ did not have 'primaryUrl' query param.");
                }
                Uri uri2 = Uri.parse(queryParameter);
                if (a(uri2)) {
                    throw new com.xmlywind.sdk.common.c.b("Deeplink+ had another Deeplink+ as the 'primaryUrl'.");
                }
                try {
                    com.xmlywind.sdk.common.utils.j.a(context, uri2);
                } catch (com.xmlywind.sdk.common.c.b unused) {
                    if (queryParameter2 == null) {
                        throw new com.xmlywind.sdk.common.c.b("Unable to handle 'primaryUrl' for Deeplink+ and 'fallbackUrl' was missing.");
                    }
                    if (a(Uri.parse(queryParameter2))) {
                        throw new com.xmlywind.sdk.common.c.b("Deeplink+ URL had another Deeplink+ URL as the 'fallbackUrl'.");
                    }
                    yVar.a(context, queryParameter2, true, (Iterable<String>) queryParameters);
                }
            } catch (UnsupportedOperationException unused2) {
                throw new com.xmlywind.sdk.common.c.b("Deeplink+ URL was not a hierarchical URI.");
            }
        }

        @Override // com.xmlywind.sdk.base.common.x
        public boolean a(Uri uri) {
            return "sigdeeplink+".equalsIgnoreCase(uri.getScheme());
        }
    },
    FOLLOW_DEEP_LINK(1 == true ? 1 : 0) { // from class: com.xmlywind.sdk.base.common.x.6
        @Override // com.xmlywind.sdk.base.common.x
        public void a(Context context, Uri uri, y yVar, BaseAdUnit baseAdUnit) throws com.xmlywind.sdk.common.c.b {
            if (!"intent".equalsIgnoreCase(uri.getScheme())) {
                com.xmlywind.sdk.common.utils.j.a(context, uri);
                return;
            }
            try {
                com.xmlywind.sdk.common.utils.j.b(context, Intent.parseUri(uri.toString(), 1));
            } catch (Throwable unused) {
                throw new com.xmlywind.sdk.common.c.b("Intent uri had invalid syntax: " + uri.toString());
            }
        }

        @Override // com.xmlywind.sdk.base.common.x
        public boolean a(Uri uri) {
            String scheme = uri.getScheme();
            return ("HTTP".equalsIgnoreCase(scheme) || "HTTPS".equalsIgnoreCase(scheme)) ? false : true;
        }
    },
    NOOP(0 == true ? 1 : 0) { // from class: com.xmlywind.sdk.base.common.x.7
        @Override // com.xmlywind.sdk.base.common.x
        public void a(Context context, Uri uri, y yVar, BaseAdUnit baseAdUnit) {
        }

        @Override // com.xmlywind.sdk.base.common.x
        public boolean a(Uri uri) {
            return false;
        }
    };

    private final boolean h;

    x(boolean z) {
        this.h = z;
    }

    public abstract void a(Context context, Uri uri, y yVar, BaseAdUnit baseAdUnit);

    public void a(y yVar, Context context, Uri uri, boolean z, BaseAdUnit baseAdUnit) throws com.xmlywind.sdk.common.c.b {
        SigmobLog.d("Ad event URL: " + uri);
        if (this.h && !z) {
            throw new com.xmlywind.sdk.common.c.b("Attempted to handle action without user interaction.");
        }
        a(context, uri, yVar, baseAdUnit);
    }

    public abstract boolean a(Uri uri);
}
