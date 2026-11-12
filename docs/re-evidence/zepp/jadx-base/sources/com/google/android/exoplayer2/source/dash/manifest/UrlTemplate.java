package com.google.android.exoplayer2.source.dash.manifest;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class UrlTemplate {
    private static final String e = "RepresentationID";
    private static final String f = "Number";
    private static final String g = "Bandwidth";
    private static final String h = "Time";
    private static final String i = "$$";
    private static final String j = "%01d";
    private static final int k = 1;
    private static final int l = 2;
    private static final int m = 3;
    private static final int n = 4;
    private final String[] a;
    private final int[] b;
    private final String[] c;
    private final int d;

    private UrlTemplate(String[] urlPieces, int[] identifiers, String[] identifierFormatTags, int identifierCount) {
        this.a = urlPieces;
        this.b = identifiers;
        this.c = identifierFormatTags;
        this.d = identifierCount;
    }

    private static int a(String template, String[] urlPieces, int[] identifiers, String[] identifierFormatTags) {
        String strSubstring;
        urlPieces[0] = "";
        int length = 0;
        int i2 = 0;
        while (length < template.length()) {
            int iIndexOf = template.indexOf("$", length);
            if (iIndexOf == -1) {
                String strValueOf = String.valueOf(urlPieces[i2]);
                String strValueOf2 = String.valueOf(template.substring(length));
                urlPieces[i2] = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                length = template.length();
            } else if (iIndexOf != length) {
                String strValueOf3 = String.valueOf(urlPieces[i2]);
                String strValueOf4 = String.valueOf(template.substring(length, iIndexOf));
                urlPieces[i2] = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                length = iIndexOf;
            } else if (template.startsWith(i, length)) {
                urlPieces[i2] = String.valueOf(urlPieces[i2]).concat("$");
                length += 2;
            } else {
                int i3 = length + 1;
                int iIndexOf2 = template.indexOf("$", i3);
                String strSubstring2 = template.substring(i3, iIndexOf2);
                if (strSubstring2.equals(e)) {
                    identifiers[i2] = 1;
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith(GoogleApiAvailabilityLight.a) && !strSubstring.endsWith("x")) {
                            strSubstring = strSubstring.concat(GoogleApiAvailabilityLight.a);
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = j;
                    }
                    strSubstring2.hashCode();
                    switch (strSubstring2) {
                        case "Number":
                            identifiers[i2] = 2;
                            break;
                        case "Time":
                            identifiers[i2] = 4;
                            break;
                        case "Bandwidth":
                            identifiers[i2] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException(template.length() != 0 ? "Invalid template: ".concat(template) : new String("Invalid template: "));
                    }
                    identifierFormatTags[i2] = strSubstring;
                }
                i2++;
                urlPieces[i2] = "";
                length = iIndexOf2 + 1;
            }
        }
        return i2;
    }

    public static UrlTemplate compile(String template) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new UrlTemplate(strArr, iArr, strArr2, a(template, strArr, iArr, strArr2));
    }

    public String buildUri(String representationId, long segmentNumber, int bandwidth, long time) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = this.d;
            if (i2 >= i3) {
                sb.append(this.a[i3]);
                return sb.toString();
            }
            sb.append(this.a[i2]);
            int[] iArr = this.b;
            if (iArr[i2] == 1) {
                sb.append(representationId);
            } else if (iArr[i2] == 2) {
                sb.append(String.format(Locale.US, this.c[i2], Long.valueOf(segmentNumber)));
            } else if (iArr[i2] == 3) {
                sb.append(String.format(Locale.US, this.c[i2], Integer.valueOf(bandwidth)));
            } else if (iArr[i2] == 4) {
                sb.append(String.format(Locale.US, this.c[i2], Long.valueOf(time)));
            }
            i2++;
        }
    }
}
