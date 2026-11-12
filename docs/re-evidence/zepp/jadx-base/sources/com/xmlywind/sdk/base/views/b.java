package com.xmlywind.sdk.base.views;

import com.google.android.exoplayer2.util.MimeTypes;
import com.xmlywind.sdk.common.utils.m;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class b implements Serializable {
    private static final List<String> a = Arrays.asList(MimeTypes.IMAGE_JPEG, "image/png", "image/bmp", "image/gif");
    private static final List<String> b = Arrays.asList("application/x-javascript");
    private static final long serialVersionUID = 0;
    private final String c;
    private final EnumC1067b d;
    private final a e;
    private final int f;
    private final int g;

    /* JADX INFO: renamed from: com.xmlywind.sdk.base.views.b$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC1067b.values().length];
            a = iArr;
            try {
                iArr[EnumC1067b.IFRAME_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC1067b.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC1067b.STATIC_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EnumC1067b.NATIVE_RESOURCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[EnumC1067b.URL_RESOURCE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum a {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    /* JADX INFO: renamed from: com.xmlywind.sdk.base.views.b$b, reason: collision with other inner class name */
    public enum EnumC1067b {
        STATIC_RESOURCE,
        HTML_RESOURCE,
        IFRAME_RESOURCE,
        NATIVE_RESOURCE,
        URL_RESOURCE
    }

    public b(String str, EnumC1067b enumC1067b, a aVar, int i, int i2) {
        m.a.a(str);
        m.a.a(enumC1067b);
        m.a.a(aVar);
        this.c = str;
        this.d = enumC1067b;
        this.e = aVar;
        this.f = i;
        this.g = i2;
    }

    public void a(CreativeWebView creativeWebView) {
        StringBuilder sb;
        String str;
        String string;
        String str2;
        m.a.a(creativeWebView);
        int i = AnonymousClass1.a[this.d.ordinal()];
        if (i != 1) {
            if (i == 2) {
                string = this.c;
            } else {
                if (i != 3) {
                    if (i == 4) {
                        if (!this.c.toLowerCase().startsWith("file://")) {
                            str2 = "file://" + this.c;
                        }
                        creativeWebView.loadUrl(str2);
                        return;
                    }
                    if (i != 5) {
                        return;
                    }
                    str2 = this.c;
                    creativeWebView.loadUrl(str2);
                    return;
                }
                a aVar = this.e;
                if (aVar == a.IMAGE) {
                    sb = new StringBuilder();
                    sb.append("<html><head></head><body style=\"margin:0;padding:0\"><img src=\"");
                    sb.append(this.c);
                    str = "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
                } else {
                    if (aVar != a.JAVASCRIPT) {
                        return;
                    }
                    sb = new StringBuilder();
                    sb.append("<script src=\"");
                    sb.append(this.c);
                    str = "\"></script>";
                }
            }
            creativeWebView.a(string);
        }
        sb = new StringBuilder();
        sb.append("<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"");
        sb.append(this.f);
        sb.append("\" height=\"");
        sb.append(this.g);
        sb.append("\" src=\"");
        sb.append(this.c);
        str = "\"></iframe>";
        sb.append(str);
        string = sb.toString();
        creativeWebView.a(string);
    }
}
