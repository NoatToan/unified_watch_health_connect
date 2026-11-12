package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.base.common.Headers;
import java.util.Locale;

/* JADX INFO: loaded from: classes34.dex */
public final class p1 {
    public static final int m = -1;
    public static final boolean n = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15166c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public int sMaxAgeSeconds() {
        return this.d;
    }

    public boolean onlyIfCached() {
        return this.j;
    }

    public boolean noTransform() {
        return this.k;
    }

    public boolean noStore() {
        return this.f15165b;
    }

    public boolean noCache() {
        return this.f15164a;
    }

    public boolean mustRevalidate() {
        return this.g;
    }

    public int minFreshSeconds() {
        return this.i;
    }

    public int maxStaleSeconds() {
        return this.h;
    }

    public int maxAgeSeconds() {
        return this.f15166c;
    }

    public boolean isPublic() {
        return this.f;
    }

    public boolean isPrivate() {
        return this.e;
    }

    public boolean immutable() {
        return this.l;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00da  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:48:0x0100  */
    /* JADX WARN: Code duplicated, block: B:49:0x0103  */
    /* JADX WARN: Code duplicated, block: B:51:0x010b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0117  */
    /* JADX WARN: Code duplicated, block: B:56:0x011f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0126  */
    /* JADX WARN: Code duplicated, block: B:59:0x012f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0132  */
    /* JADX WARN: Code duplicated, block: B:62:0x013a  */
    /* JADX WARN: Code duplicated, block: B:63:0x013d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0145  */
    public static p1 parse(Headers headers) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z9;
        boolean z10;
        String strTrim;
        int iSkipUntil;
        String str = headers.get("Pragma");
        boolean z11 = !TextUtils.isEmpty(str) && str.trim().toLowerCase(Locale.ROOT).equals("no-cache");
        String str2 = headers.get("Cache-Control");
        if (TextUtils.isEmpty(str2)) {
            z = z11;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
            z7 = false;
            z8 = false;
            i = -1;
            i2 = -1;
            i3 = -1;
            i4 = -1;
        } else {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            boolean z18 = false;
            int seconds = -1;
            int seconds2 = -1;
            int seconds3 = -1;
            int seconds4 = -1;
            for (int i5 = 0; i5 < lowerCase.length(); i5 = iSkipUntil) {
                int iSkipUntil2 = u1.skipUntil(lowerCase, i5, "=,;");
                String strTrim2 = StringUtils.substring(lowerCase, i5, iSkipUntil2).trim();
                if (iSkipUntil2 != lowerCase.length()) {
                    z9 = z11;
                    if (lowerCase.charAt(iSkipUntil2) != ',' && lowerCase.charAt(iSkipUntil2) != ';') {
                        int iSkipWhitespace = u1.skipWhitespace(lowerCase, iSkipUntil2 + 1);
                        if (iSkipWhitespace >= lowerCase.length() || lowerCase.charAt(iSkipWhitespace) != '\"') {
                            z10 = true;
                            iSkipUntil = u1.skipUntil(lowerCase, iSkipWhitespace, ",;");
                            strTrim = StringUtils.substring(lowerCase, iSkipWhitespace, iSkipUntil).trim();
                        } else {
                            int i6 = iSkipWhitespace + 1;
                            int iSkipUntil3 = u1.skipUntil(lowerCase, i6, "\"");
                            strTrim = StringUtils.substring(lowerCase, i6, iSkipUntil3);
                            z10 = true;
                            iSkipUntil = iSkipUntil3 + 1;
                        }
                    }
                    if ("no-cache".equals(strTrim2)) {
                        z11 = z10;
                    } else {
                        if ("no-store".equals(strTrim2)) {
                            z16 = z10;
                        } else {
                            if ("max-age".equals(strTrim2)) {
                                seconds4 = u1.parseSeconds(strTrim, -1);
                            } else if ("s-maxage".equals(strTrim2)) {
                                seconds3 = u1.parseSeconds(strTrim, -1);
                            } else if ("private".equals(strTrim2)) {
                                z15 = z10;
                            } else if ("public".equals(strTrim2)) {
                                z14 = z10;
                            } else if ("must-revalidate".equals(strTrim2)) {
                                z12 = z10;
                            } else if ("max-stale".equals(strTrim2)) {
                                seconds = u1.parseSeconds(strTrim, Integer.MAX_VALUE);
                            } else if ("min-fresh".equals(strTrim2)) {
                                seconds2 = u1.parseSeconds(strTrim, -1);
                            } else if ("only-if-cached".equals(strTrim2)) {
                                z18 = z10;
                            } else if ("no-transform".equals(strTrim2)) {
                                z17 = z10;
                            } else if ("immutable".equals(strTrim2)) {
                                z13 = z10;
                            }
                            z11 = z9;
                        }
                        z11 = z9;
                    }
                } else {
                    z9 = z11;
                }
                z10 = true;
                strTrim = null;
                iSkipUntil = iSkipUntil2 + 1;
                if ("no-cache".equals(strTrim2)) {
                    z11 = z10;
                } else {
                    if ("no-store".equals(strTrim2)) {
                        z16 = z10;
                    } else {
                        if ("max-age".equals(strTrim2)) {
                            seconds4 = u1.parseSeconds(strTrim, -1);
                        } else if ("s-maxage".equals(strTrim2)) {
                            seconds3 = u1.parseSeconds(strTrim, -1);
                        } else if ("private".equals(strTrim2)) {
                            z15 = z10;
                        } else if ("public".equals(strTrim2)) {
                            z14 = z10;
                        } else if ("must-revalidate".equals(strTrim2)) {
                            z12 = z10;
                        } else if ("max-stale".equals(strTrim2)) {
                            seconds = u1.parseSeconds(strTrim, Integer.MAX_VALUE);
                        } else if ("min-fresh".equals(strTrim2)) {
                            seconds2 = u1.parseSeconds(strTrim, -1);
                        } else if ("only-if-cached".equals(strTrim2)) {
                            z18 = z10;
                        } else if ("no-transform".equals(strTrim2)) {
                            z17 = z10;
                        } else if ("immutable".equals(strTrim2)) {
                            z13 = z10;
                        }
                        z11 = z9;
                    }
                    z11 = z9;
                }
            }
            z5 = z12;
            z8 = z13;
            z4 = z14;
            z3 = z15;
            z2 = z16;
            z7 = z17;
            z6 = z18;
            i3 = seconds;
            i4 = seconds2;
            i2 = seconds3;
            i = seconds4;
            z = z11;
        }
        return new p1(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8);
    }

    public p1(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8) {
        this.f15164a = z;
        this.f15165b = z2;
        this.e = z3;
        this.f15166c = i;
        this.d = i2;
        this.f = z4;
        this.k = z7;
        this.g = z5;
        this.h = i3;
        this.i = i4;
        this.l = z8;
        this.j = z6;
    }
}
