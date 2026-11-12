package com.google.android.exoplayer2.text.subrip;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class SubripDecoder extends SimpleSubtitleDecoder {
    private static final String A = "{\\an3}";
    private static final String B = "{\\an4}";
    private static final String C = "{\\an5}";
    private static final String D = "{\\an6}";
    private static final String E = "{\\an7}";
    private static final String F = "{\\an8}";
    private static final String G = "{\\an9}";
    private static final float q = 0.08f;
    private static final float r = 0.92f;
    private static final float s = 0.5f;
    private static final String t = "SubripDecoder";
    private static final String u = "(?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?";
    private static final Pattern v = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern w = Pattern.compile("\\{\\\\.*?\\}");
    private static final String x = "\\{\\\\an[1-9]\\}";
    private static final String y = "{\\an1}";
    private static final String z = "{\\an2}";
    private final StringBuilder o;
    private final ArrayList<String> p;

    public SubripDecoder() {
        super(t);
        this.o = new StringBuilder();
        this.p = new ArrayList<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    private Cue j(Spanned text, @Nullable String alignmentTag) {
        byte b;
        byte b2;
        Cue.Builder text2 = new Cue.Builder().setText(text);
        if (alignmentTag == null) {
            return text2.build();
        }
        switch (alignmentTag) {
            case "{\an1}":
                b = 0;
                break;
            case "{\an2}":
                b = 6;
                break;
            case "{\an3}":
                b = 3;
                break;
            case "{\an4}":
                b = 1;
                break;
            case "{\an5}":
                b = 7;
                break;
            case "{\an6}":
                b = 4;
                break;
            case "{\an7}":
                b = 2;
                break;
            case "{\an8}":
                b = 8;
                break;
            case "{\an9}":
                b = 5;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0 || b == 1 || b == 2) {
            text2.setPositionAnchor(0);
        } else if (b == 3 || b == 4 || b == 5) {
            text2.setPositionAnchor(2);
        } else {
            text2.setPositionAnchor(1);
        }
        switch (alignmentTag) {
            case "{\an1}":
                b2 = 0;
                break;
            case "{\an2}":
                b2 = 1;
                break;
            case "{\an3}":
                b2 = 2;
                break;
            case "{\an4}":
                b2 = 6;
                break;
            case "{\an5}":
                b2 = 7;
                break;
            case "{\an6}":
                b2 = 8;
                break;
            case "{\an7}":
                b2 = 3;
                break;
            case "{\an8}":
                b2 = 4;
                break;
            case "{\an9}":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0 || b2 == 1 || b2 == 2) {
            text2.setLineAnchor(2);
        } else if (b2 == 3 || b2 == 4 || b2 == 5) {
            text2.setLineAnchor(0);
        } else {
            text2.setLineAnchor(1);
        }
        return text2.setPosition(k(text2.getPositionAnchor())).setLine(k(text2.getLineAnchor()), 0).build();
    }

    public static float k(int anchorType) {
        if (anchorType == 0) {
            return 0.08f;
        }
        if (anchorType == 1) {
            return 0.5f;
        }
        if (anchorType == 2) {
            return r;
        }
        throw new IllegalArgumentException();
    }

    private static long l(Matcher matcher, int groupOffset) {
        String strGroup = matcher.group(groupOffset + 1);
        long j = (strGroup != null ? Long.parseLong(strGroup) * 60 * 60 * 1000 : 0L) + (Long.parseLong((String) Assertions.checkNotNull(matcher.group(groupOffset + 2))) * 60 * 1000) + (Long.parseLong((String) Assertions.checkNotNull(matcher.group(groupOffset + 3))) * 1000);
        String strGroup2 = matcher.group(groupOffset + 4);
        if (strGroup2 != null) {
            j += Long.parseLong(strGroup2);
        }
        return j * 1000;
    }

    private String m(String line, ArrayList<String> tags) {
        String strTrim = line.trim();
        StringBuilder sb = new StringBuilder(strTrim);
        Matcher matcher = w.matcher(strTrim);
        int i = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            tags.add(strGroup);
            int iStart = matcher.start() - i;
            int length = strGroup.length();
            sb.replace(iStart, iStart + length, "");
            i += length;
        }
        return sb.toString();
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public Subtitle decode(byte[] bytes, int length, boolean reset) {
        ArrayList arrayList = new ArrayList();
        LongArray longArray = new LongArray();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bytes, length);
        while (true) {
            String line = parsableByteArray.readLine();
            if (line == null) {
                break;
            }
            if (line.length() != 0) {
                try {
                    Integer.parseInt(line);
                    String line2 = parsableByteArray.readLine();
                    if (line2 == null) {
                        Log.w(t, "Unexpected end");
                        break;
                    }
                    Matcher matcher = v.matcher(line2);
                    if (matcher.matches()) {
                        longArray.add(l(matcher, 1));
                        longArray.add(l(matcher, 6));
                        this.o.setLength(0);
                        this.p.clear();
                        for (String line3 = parsableByteArray.readLine(); !TextUtils.isEmpty(line3); line3 = parsableByteArray.readLine()) {
                            if (this.o.length() > 0) {
                                this.o.append("<br>");
                            }
                            this.o.append(m(line3, this.p));
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.o.toString());
                        String str = null;
                        for (int i = 0; i < this.p.size(); i++) {
                            String str2 = this.p.get(i);
                            if (str2.matches(x)) {
                                str = str2;
                                break;
                            }
                        }
                        arrayList.add(j(spannedFromHtml, str));
                        arrayList.add(Cue.EMPTY);
                    } else {
                        Log.w(t, line2.length() != 0 ? "Skipping invalid timing: ".concat(line2) : new String("Skipping invalid timing: "));
                    }
                } catch (NumberFormatException unused) {
                    Log.w(t, line.length() != 0 ? "Skipping invalid index: ".concat(line) : new String("Skipping invalid index: "));
                }
            }
        }
        return new a((Cue[]) arrayList.toArray(new Cue[0]), longArray.toArray());
    }
}
