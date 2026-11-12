package com.google.common.net;

import com.google.common.annotations.GwtCompatible;
import com.google.common.escape.Escaper;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
public final class UrlEscapers {
    public static final String b = "-._~!$'()*,;&=@:";
    public static final String a = "-_.*";
    private static final Escaper c = new PercentEscaper(a, true);
    private static final Escaper d = new PercentEscaper("-._~!$'()*,;&=@:+", false);
    private static final Escaper e = new PercentEscaper("-._~!$'()*,;&=@:+/?", false);

    private UrlEscapers() {
    }

    public static Escaper urlFormParameterEscaper() {
        return c;
    }

    public static Escaper urlFragmentEscaper() {
        return e;
    }

    public static Escaper urlPathSegmentEscaper() {
        return d;
    }
}
