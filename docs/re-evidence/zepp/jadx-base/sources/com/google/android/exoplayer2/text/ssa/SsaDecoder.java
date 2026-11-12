package com.google.android.exoplayer2.text.ssa;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class SsaDecoder extends SimpleSubtitleDecoder {
    private static final String t = "SsaDecoder";
    private static final Pattern u = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public static final String v = "Format:";
    public static final String w = "Style:";
    private static final String x = "Dialogue:";
    private static final float y = 0.05f;
    private final boolean o;

    @Nullable
    private final a p;
    private Map<String, SsaStyle> q;
    private float r;
    private float s;

    public SsaDecoder() {
        this(null);
    }

    private static int j(long timeUs, List<Long> sortedCueTimesUs, List<List<Cue>> cues) {
        int i;
        int size = sortedCueTimesUs.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (sortedCueTimesUs.get(size).longValue() == timeUs) {
                return size;
            }
            if (sortedCueTimesUs.get(size).longValue() < timeUs) {
                i = size + 1;
                break;
            }
            size--;
        }
        sortedCueTimesUs.add(i, Long.valueOf(timeUs));
        cues.add(i, i == 0 ? new ArrayList() : new ArrayList(cues.get(i - 1)));
        return i;
    }

    private static float k(int anchor) {
        if (anchor == 0) {
            return y;
        }
        if (anchor != 1) {
            return anchor != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static Cue l(String text, @Nullable SsaStyle style, SsaStyle.b styleOverrides, float screenWidth, float screenHeight) {
        SpannableString spannableString = new SpannableString(text);
        Cue.Builder text2 = new Cue.Builder().setText(spannableString);
        if (style != null) {
            if (style.c != null) {
                spannableString.setSpan(new ForegroundColorSpan(style.c.intValue()), 0, spannableString.length(), 33);
            }
            float f = style.d;
            if (f != -3.4028235E38f && screenHeight != -3.4028235E38f) {
                text2.setTextSize(f / screenHeight, 1);
            }
            boolean z = style.e;
            if (z && style.f) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (style.f) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (style.g) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (style.h) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i = styleOverrides.a;
        if (i == -1) {
            i = style != null ? style.b : -1;
        }
        text2.setTextAlignment(u(i)).setPositionAnchor(t(i)).setLineAnchor(s(i));
        PointF pointF = styleOverrides.b;
        if (pointF == null || screenHeight == -3.4028235E38f || screenWidth == -3.4028235E38f) {
            text2.setPosition(k(text2.getPositionAnchor()));
            text2.setLine(k(text2.getLineAnchor()), 0);
        } else {
            text2.setPosition(pointF.x / screenWidth);
            text2.setLine(styleOverrides.b.y / screenHeight, 0);
        }
        return text2.build();
    }

    private void m(String dialogueLine, a format, List<List<Cue>> cues, List<Long> cueTimesUs) {
        int i;
        Assertions.checkArgument(dialogueLine.startsWith(x));
        String[] strArrSplit = dialogueLine.substring(9).split(",", format.e);
        if (strArrSplit.length != format.e) {
            Log.w(t, dialogueLine.length() != 0 ? "Skipping dialogue line with fewer columns than format: ".concat(dialogueLine) : new String("Skipping dialogue line with fewer columns than format: "));
            return;
        }
        long jR = r(strArrSplit[format.a]);
        if (jR == C.TIME_UNSET) {
            Log.w(t, dialogueLine.length() != 0 ? "Skipping invalid timing: ".concat(dialogueLine) : new String("Skipping invalid timing: "));
            return;
        }
        long jR2 = r(strArrSplit[format.b]);
        if (jR2 == C.TIME_UNSET) {
            Log.w(t, dialogueLine.length() != 0 ? "Skipping invalid timing: ".concat(dialogueLine) : new String("Skipping invalid timing: "));
            return;
        }
        Map<String, SsaStyle> map = this.q;
        SsaStyle ssaStyle = (map == null || (i = format.c) == -1) ? null : map.get(strArrSplit[i].trim());
        String str = strArrSplit[format.d];
        Cue cueL = l(SsaStyle.b.d(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), ssaStyle, SsaStyle.b.b(str), this.r, this.s);
        int iJ = j(jR2, cueTimesUs, cues);
        for (int iJ2 = j(jR, cueTimesUs, cues); iJ2 < iJ; iJ2++) {
            cues.get(iJ2).add(cueL);
        }
    }

    private void n(ParsableByteArray data, List<List<Cue>> cues, List<Long> cueTimesUs) {
        a aVarA = this.o ? this.p : null;
        while (true) {
            String line = data.readLine();
            if (line == null) {
                return;
            }
            if (line.startsWith(v)) {
                aVarA = a.a(line);
            } else if (line.startsWith(x)) {
                if (aVarA == null) {
                    Log.w(t, line.length() != 0 ? "Skipping dialogue line before complete format: ".concat(line) : new String("Skipping dialogue line before complete format: "));
                } else {
                    m(line, aVarA, cues, cueTimesUs);
                }
            }
        }
    }

    private void o(ParsableByteArray data) {
        while (true) {
            String line = data.readLine();
            if (line == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(line)) {
                p(data);
            } else if ("[V4+ Styles]".equalsIgnoreCase(line)) {
                this.q = q(data);
            } else if ("[V4 Styles]".equalsIgnoreCase(line)) {
                Log.i(t, "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(line)) {
                return;
            }
        }
    }

    private void p(ParsableByteArray data) {
        while (true) {
            String line = data.readLine();
            if (line == null) {
                return;
            }
            if (data.bytesLeft() != 0 && data.peekUnsignedByte() == 91) {
                return;
            }
            String[] strArrSplit = line.split(":");
            if (strArrSplit.length == 2) {
                String lowerCase = Ascii.toLowerCase(strArrSplit[0].trim());
                lowerCase.hashCode();
                if (lowerCase.equals("playresx")) {
                    this.r = Float.parseFloat(strArrSplit[1].trim());
                } else if (lowerCase.equals("playresy")) {
                    try {
                        this.s = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map<String, SsaStyle> q(ParsableByteArray data) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SsaStyle.a aVarA = null;
        while (true) {
            String line = data.readLine();
            if (line == null || (data.bytesLeft() != 0 && data.peekUnsignedByte() == 91)) {
                break;
            }
            if (line.startsWith(v)) {
                aVarA = SsaStyle.a.a(line);
            } else if (line.startsWith(w)) {
                if (aVarA == null) {
                    Log.w(t, line.length() != 0 ? "Skipping 'Style:' line before 'Format:' line: ".concat(line) : new String("Skipping 'Style:' line before 'Format:' line: "));
                } else {
                    SsaStyle ssaStyleB = SsaStyle.b(line, aVarA);
                    if (ssaStyleB != null) {
                        linkedHashMap.put(ssaStyleB.a, ssaStyleB);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long r(String timeString) {
        Matcher matcher = u.matcher(timeString.trim());
        return !matcher.matches() ? C.TIME_UNSET : (Long.parseLong((String) Util.castNonNull(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) Util.castNonNull(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) Util.castNonNull(matcher.group(3))) * 1000000) + (Long.parseLong((String) Util.castNonNull(matcher.group(4))) * 10000);
    }

    private static int s(int alignment) {
        switch (alignment) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                StringBuilder sb = new StringBuilder(30);
                sb.append("Unknown alignment: ");
                sb.append(alignment);
                Log.w(t, sb.toString());
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    private static int t(int alignment) {
        switch (alignment) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                StringBuilder sb = new StringBuilder(30);
                sb.append("Unknown alignment: ");
                sb.append(alignment);
                Log.w(t, sb.toString());
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    @Nullable
    private static Layout.Alignment u(int alignment) {
        switch (alignment) {
            case -1:
                return null;
            case 0:
            default:
                StringBuilder sb = new StringBuilder(30);
                sb.append("Unknown alignment: ");
                sb.append(alignment);
                Log.w(t, sb.toString());
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public Subtitle decode(byte[] bytes, int length, boolean reset) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bytes, length);
        if (!this.o) {
            o(parsableByteArray);
        }
        n(parsableByteArray, arrayList, arrayList2);
        return new b(arrayList, arrayList2);
    }

    public SsaDecoder(@Nullable List<byte[]> initializationData) {
        super(t);
        this.r = -3.4028235E38f;
        this.s = -3.4028235E38f;
        if (initializationData == null || initializationData.isEmpty()) {
            this.o = false;
            this.p = null;
            return;
        }
        this.o = true;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(initializationData.get(0));
        Assertions.checkArgument(strFromUtf8Bytes.startsWith(v));
        this.p = (a) Assertions.checkNotNull(a.a(strFromUtf8Bytes));
        o(new ParsableByteArray(initializationData.get(1)));
    }
}
