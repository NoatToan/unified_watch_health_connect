package com.google.android.exoplayer2.text.subrip;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
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
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class SubripDecoder extends SimpleSubtitleDecoder {
    private static final String ALIGN_BOTTOM_LEFT = "{\\an1}";
    private static final String ALIGN_BOTTOM_MID = "{\\an2}";
    private static final String ALIGN_BOTTOM_RIGHT = "{\\an3}";
    private static final String ALIGN_MID_LEFT = "{\\an4}";
    private static final String ALIGN_MID_MID = "{\\an5}";
    private static final String ALIGN_MID_RIGHT = "{\\an6}";
    private static final String ALIGN_TOP_LEFT = "{\\an7}";
    private static final String ALIGN_TOP_MID = "{\\an8}";
    private static final String ALIGN_TOP_RIGHT = "{\\an9}";
    private static final float END_FRACTION = 0.92f;
    private static final float MID_FRACTION = 0.5f;
    private static final float START_FRACTION = 0.08f;
    private static final String SUBRIP_ALIGNMENT_TAG = "\\{\\\\an[1-9]\\}";
    private static final String SUBRIP_TIMECODE = "(?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?";
    private static final String TAG = "SubripDecoder";
    private final ArrayList<String> tags;
    private final StringBuilder textBuilder;
    private static final Pattern SUBRIP_TIMING_LINE = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern SUBRIP_TAG_PATTERN = Pattern.compile("\\{\\\\.*?\\}");

    public SubripDecoder() {
        super(TAG);
        this.textBuilder = new StringBuilder();
        this.tags = new ArrayList<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b6  */
    private Cue buildCue(Spanned spanned, String str) {
        Cue.Builder text = new Cue.Builder().setText(spanned);
        if (str == null) {
            return text.build();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals(ALIGN_BOTTOM_LEFT)) {
                    text.setPositionAnchor(1);
                } else {
                    text.setPositionAnchor(0);
                }
                break;
            case -685620679:
                str.equals(ALIGN_BOTTOM_MID);
                text.setPositionAnchor(1);
                break;
            case -685620648:
                if (!str.equals(ALIGN_BOTTOM_RIGHT)) {
                    text.setPositionAnchor(1);
                } else {
                    text.setPositionAnchor(2);
                }
                break;
            case -685620617:
                if (!str.equals(ALIGN_MID_LEFT)) {
                    text.setPositionAnchor(1);
                } else {
                    text.setPositionAnchor(0);
                }
                break;
            case -685620586:
                str.equals(ALIGN_MID_MID);
                text.setPositionAnchor(1);
                break;
            case -685620555:
                if (!str.equals(ALIGN_MID_RIGHT)) {
                    text.setPositionAnchor(1);
                } else {
                    text.setPositionAnchor(2);
                }
                break;
            case -685620524:
                if (!str.equals(ALIGN_TOP_LEFT)) {
                    text.setPositionAnchor(1);
                } else {
                    text.setPositionAnchor(0);
                }
                break;
            case -685620493:
                str.equals(ALIGN_TOP_MID);
                text.setPositionAnchor(1);
                break;
            case -685620462:
                if (!str.equals(ALIGN_TOP_RIGHT)) {
                    text.setPositionAnchor(1);
                } else {
                    text.setPositionAnchor(2);
                }
                break;
            default:
                text.setPositionAnchor(1);
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals(ALIGN_BOTTOM_LEFT)) {
                    text.setLineAnchor(1);
                } else {
                    text.setLineAnchor(2);
                }
                break;
            case -685620679:
                if (!str.equals(ALIGN_BOTTOM_MID)) {
                    text.setLineAnchor(1);
                } else {
                    text.setLineAnchor(2);
                }
                break;
            case -685620648:
                if (!str.equals(ALIGN_BOTTOM_RIGHT)) {
                    text.setLineAnchor(1);
                } else {
                    text.setLineAnchor(2);
                }
                break;
            case -685620617:
                str.equals(ALIGN_MID_LEFT);
                text.setLineAnchor(1);
                break;
            case -685620586:
                str.equals(ALIGN_MID_MID);
                text.setLineAnchor(1);
                break;
            case -685620555:
                str.equals(ALIGN_MID_RIGHT);
                text.setLineAnchor(1);
                break;
            case -685620524:
                if (!str.equals(ALIGN_TOP_LEFT)) {
                    text.setLineAnchor(1);
                } else {
                    text.setLineAnchor(0);
                }
                break;
            case -685620493:
                if (!str.equals(ALIGN_TOP_MID)) {
                    text.setLineAnchor(1);
                } else {
                    text.setLineAnchor(0);
                }
                break;
            case -685620462:
                if (!str.equals(ALIGN_TOP_RIGHT)) {
                    text.setLineAnchor(1);
                } else {
                    text.setLineAnchor(0);
                }
                break;
            default:
                text.setLineAnchor(1);
                break;
        }
        return text.setPosition(getFractionalPositionForAnchorType(text.getPositionAnchor())).setLine(getFractionalPositionForAnchorType(text.getLineAnchor()), 0).build();
    }

    public static float getFractionalPositionForAnchorType(int i14) {
        if (i14 == 0) {
            return 0.08f;
        }
        if (i14 == 1) {
            return MID_FRACTION;
        }
        if (i14 == 2) {
            return END_FRACTION;
        }
        h.w();
        return 0.0f;
    }

    private static long parseTimecode(Matcher matcher, int i14) {
        String strGroup = matcher.group(i14 + 1);
        long j8 = (Long.parseLong((String) Assertions.checkNotNull(matcher.group(i14 + 3))) * 1000) + (Long.parseLong((String) Assertions.checkNotNull(matcher.group(i14 + 2))) * 60000) + (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L);
        String strGroup2 = matcher.group(i14 + 4);
        if (strGroup2 != null) {
            j8 += Long.parseLong(strGroup2);
        }
        return j8 * 1000;
    }

    private String processLine(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb3 = new StringBuilder(strTrim);
        Matcher matcher = SUBRIP_TAG_PATTERN.matcher(strTrim);
        int i14 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i14;
            int length = strGroup.length();
            sb3.replace(iStart, iStart + length, "");
            i14 += length;
        }
        return sb3.toString();
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public Subtitle decode(byte[] bArr, int i14, boolean z14) {
        StringBuilder sb3;
        String str;
        ArrayList arrayList = new ArrayList();
        LongArray longArray = new LongArray();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i14);
        while (true) {
            String line = parsableByteArray.readLine();
            int i15 = 0;
            if (line == null) {
                break;
            }
            if (line.length() != 0) {
                try {
                    Integer.parseInt(line);
                    String line2 = parsableByteArray.readLine();
                    if (line2 == null) {
                        Log.w(TAG, "Unexpected end");
                        break;
                    }
                    Matcher matcher = SUBRIP_TIMING_LINE.matcher(line2);
                    if (matcher.matches()) {
                        longArray.add(parseTimecode(matcher, 1));
                        longArray.add(parseTimecode(matcher, 6));
                        this.textBuilder.setLength(0);
                        this.tags.clear();
                        String line3 = parsableByteArray.readLine();
                        while (true) {
                            boolean zIsEmpty = TextUtils.isEmpty(line3);
                            sb3 = this.textBuilder;
                            if (zIsEmpty) {
                                break;
                            }
                            if (sb3.length() > 0) {
                                this.textBuilder.append("<br>");
                            }
                            this.textBuilder.append(processLine(line3, this.tags));
                            line3 = parsableByteArray.readLine();
                        }
                        Spanned spannedFromHtml = Html.fromHtml(sb3.toString());
                        while (true) {
                            if (i15 >= this.tags.size()) {
                                str = null;
                                break;
                            }
                            str = this.tags.get(i15);
                            if (str.matches(SUBRIP_ALIGNMENT_TAG)) {
                                break;
                            }
                            i15++;
                        }
                        arrayList.add(buildCue(spannedFromHtml, str));
                        arrayList.add(Cue.EMPTY);
                    } else {
                        Log.w(TAG, line2.length() != 0 ? "Skipping invalid timing: ".concat(line2) : new String("Skipping invalid timing: "));
                    }
                } catch (NumberFormatException unused) {
                    Log.w(TAG, line.length() != 0 ? "Skipping invalid index: ".concat(line) : new String("Skipping invalid index: "));
                }
            }
        }
        return new SubripSubtitle((Cue[]) arrayList.toArray(new Cue[0]), longArray.toArray());
    }
}
