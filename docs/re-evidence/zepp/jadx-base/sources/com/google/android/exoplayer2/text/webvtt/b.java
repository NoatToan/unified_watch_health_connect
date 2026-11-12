package com.google.android.exoplayer2.text.webvtt;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ColorParser;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class b {
    private static final String c = "WebvttCssParser";
    private static final String d = "{";
    private static final String e = "}";
    private static final String f = "color";
    private static final String g = "background-color";
    private static final String h = "font-family";
    private static final String i = "font-weight";
    private static final String j = "font-size";
    private static final String k = "ruby-position";
    private static final String l = "over";
    private static final String m = "under";
    private static final String n = "text-combine-upright";
    private static final String o = "all";
    private static final String p = "digits";
    private static final String q = "text-decoration";
    private static final String r = "bold";
    private static final String s = "underline";
    private static final String t = "font-style";
    private static final String u = "italic";
    private static final Pattern v = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern w = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final ParsableByteArray a = new ParsableByteArray();
    private final StringBuilder b = new StringBuilder();

    private void a(WebvttCssStyle style, String selector) {
        if ("".equals(selector)) {
            return;
        }
        int iIndexOf = selector.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = v.matcher(selector.substring(iIndexOf));
            if (matcher.matches()) {
                style.setTargetVoice((String) Assertions.checkNotNull(matcher.group(1)));
            }
            selector = selector.substring(0, iIndexOf);
        }
        String[] strArrSplit = Util.split(selector, "\\.");
        String str = strArrSplit[0];
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            style.setTargetTagName(str.substring(0, iIndexOf2));
            style.setTargetId(str.substring(iIndexOf2 + 1));
        } else {
            style.setTargetTagName(str);
        }
        if (strArrSplit.length > 1) {
            style.setTargetClasses((String[]) Util.nullSafeArrayCopyOfRange(strArrSplit, 1, strArrSplit.length));
        }
    }

    private static boolean b(ParsableByteArray input) {
        int position = input.getPosition();
        int iLimit = input.limit();
        byte[] data = input.getData();
        if (position + 2 > iLimit) {
            return false;
        }
        int i2 = position + 1;
        if (data[position] != 47) {
            return false;
        }
        int i3 = i2 + 1;
        if (data[i2] != 42) {
            return false;
        }
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= iLimit) {
                input.skipBytes(iLimit - input.getPosition());
                return true;
            }
            if (((char) data[i3]) == '*' && ((char) data[i4]) == '/') {
                i3 = i4 + 1;
                iLimit = i3;
            } else {
                i3 = i4;
            }
        }
    }

    private static boolean c(ParsableByteArray input) {
        char cK = k(input, input.getPosition());
        if (cK != '\t' && cK != '\n' && cK != '\f' && cK != '\r' && cK != ' ') {
            return false;
        }
        input.skipBytes(1);
        return true;
    }

    private static void e(String fontSize, WebvttCssStyle style) {
        Matcher matcher = w.matcher(Ascii.toLowerCase(fontSize));
        if (!matcher.matches()) {
            StringBuilder sb = new StringBuilder(String.valueOf(fontSize).length() + 22);
            sb.append("Invalid font-size: '");
            sb.append(fontSize);
            sb.append("'.");
            Log.w(c, sb.toString());
            return;
        }
        String str = (String) Assertions.checkNotNull(matcher.group(2));
        str.hashCode();
        switch (str) {
            case "%":
                style.setFontSizeUnit(3);
                break;
            case "em":
                style.setFontSizeUnit(2);
                break;
            case "px":
                style.setFontSizeUnit(1);
                break;
            default:
                throw new IllegalStateException();
        }
        style.setFontSize(Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1))));
    }

    private static String f(ParsableByteArray input, StringBuilder stringBuilder) {
        boolean z = false;
        stringBuilder.setLength(0);
        int position = input.getPosition();
        int iLimit = input.limit();
        while (position < iLimit && !z) {
            char c2 = (char) input.getData()[position];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                position++;
                stringBuilder.append(c2);
            }
        }
        input.skipBytes(position - input.getPosition());
        return stringBuilder.toString();
    }

    @Nullable
    public static String g(ParsableByteArray input, StringBuilder stringBuilder) {
        n(input);
        if (input.bytesLeft() == 0) {
            return null;
        }
        String strF = f(input, stringBuilder);
        if (!"".equals(strF)) {
            return strF;
        }
        char unsignedByte = (char) input.readUnsignedByte();
        StringBuilder sb = new StringBuilder(1);
        sb.append(unsignedByte);
        return sb.toString();
    }

    @Nullable
    private static String h(ParsableByteArray input, StringBuilder stringBuilder) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (!z) {
            int position = input.getPosition();
            String strG = g(input, stringBuilder);
            if (strG == null) {
                return null;
            }
            if ("}".equals(strG) || ";".equals(strG)) {
                input.setPosition(position);
                z = true;
            } else {
                sb.append(strG);
            }
        }
        return sb.toString();
    }

    @Nullable
    private static String i(ParsableByteArray input, StringBuilder stringBuilder) {
        n(input);
        if (input.bytesLeft() < 5 || !"::cue".equals(input.readString(5))) {
            return null;
        }
        int position = input.getPosition();
        String strG = g(input, stringBuilder);
        if (strG == null) {
            return null;
        }
        if (d.equals(strG)) {
            input.setPosition(position);
            return "";
        }
        String strL = "(".equals(strG) ? l(input) : null;
        if (")".equals(g(input, stringBuilder))) {
            return strL;
        }
        return null;
    }

    private static void j(ParsableByteArray input, WebvttCssStyle style, StringBuilder stringBuilder) {
        n(input);
        String strF = f(input, stringBuilder);
        if (!"".equals(strF) && ":".equals(g(input, stringBuilder))) {
            n(input);
            String strH = h(input, stringBuilder);
            if (strH == null || "".equals(strH)) {
                return;
            }
            int position = input.getPosition();
            String strG = g(input, stringBuilder);
            if (!";".equals(strG)) {
                if (!"}".equals(strG)) {
                    return;
                } else {
                    input.setPosition(position);
                }
            }
            if ("color".equals(strF)) {
                style.setFontColor(ColorParser.parseCssColor(strH));
                return;
            }
            if (g.equals(strF)) {
                style.setBackgroundColor(ColorParser.parseCssColor(strH));
                return;
            }
            boolean z = true;
            if (k.equals(strF)) {
                if (l.equals(strH)) {
                    style.setRubyPosition(1);
                    return;
                } else {
                    if (m.equals(strH)) {
                        style.setRubyPosition(2);
                        return;
                    }
                    return;
                }
            }
            if (n.equals(strF)) {
                if (!"all".equals(strH) && !strH.startsWith(p)) {
                    z = false;
                }
                style.setCombineUpright(z);
                return;
            }
            if (q.equals(strF)) {
                if ("underline".equals(strH)) {
                    style.setUnderline(true);
                    return;
                }
                return;
            }
            if (h.equals(strF)) {
                style.setFontFamily(strH);
                return;
            }
            if (i.equals(strF)) {
                if ("bold".equals(strH)) {
                    style.setBold(true);
                }
            } else if (t.equals(strF)) {
                if ("italic".equals(strH)) {
                    style.setItalic(true);
                }
            } else if (j.equals(strF)) {
                e(strH, style);
            }
        }
    }

    private static char k(ParsableByteArray input, int position) {
        return (char) input.getData()[position];
    }

    private static String l(ParsableByteArray input) {
        int position = input.getPosition();
        int iLimit = input.limit();
        boolean z = false;
        while (position < iLimit && !z) {
            int i2 = position + 1;
            z = ((char) input.getData()[position]) == ')';
            position = i2;
        }
        return input.readString((position - 1) - input.getPosition()).trim();
    }

    public static void m(ParsableByteArray input) {
        while (!TextUtils.isEmpty(input.readLine())) {
        }
    }

    public static void n(ParsableByteArray input) {
        while (true) {
            for (boolean z = true; input.bytesLeft() > 0 && z; z = false) {
                if (!c(input) && !b(input)) {
                }
            }
            return;
        }
    }

    public List<WebvttCssStyle> d(ParsableByteArray input) {
        this.b.setLength(0);
        int position = input.getPosition();
        m(input);
        this.a.reset(input.getData(), input.getPosition());
        this.a.setPosition(position);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strI = i(this.a, this.b);
            if (strI == null || !d.equals(g(this.a, this.b))) {
                return arrayList;
            }
            WebvttCssStyle webvttCssStyle = new WebvttCssStyle();
            a(webvttCssStyle, strI);
            String str = null;
            boolean z = false;
            while (!z) {
                int position2 = this.a.getPosition();
                String strG = g(this.a, this.b);
                boolean z2 = strG == null || "}".equals(strG);
                if (!z2) {
                    this.a.setPosition(position2);
                    j(this.a, webvttCssStyle, this.b);
                }
                str = strG;
                z = z2;
            }
            if ("}".equals(str)) {
                arrayList.add(webvttCssStyle);
            }
        }
    }
}
