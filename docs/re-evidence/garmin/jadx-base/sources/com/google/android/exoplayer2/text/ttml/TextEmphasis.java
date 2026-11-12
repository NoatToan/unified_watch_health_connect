package com.google.android.exoplayer2.text.ttml;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
final class TextEmphasis {
    public static final int MARK_SHAPE_AUTO = -1;
    public static final int POSITION_OUTSIDE = -2;
    public final int markFill;
    public final int markShape;
    public final int position;
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");
    private static final ImmutableSet<String> SINGLE_STYLE_VALUES = ImmutableSet.of(TtmlNode.TEXT_EMPHASIS_AUTO, "none");
    private static final ImmutableSet<String> MARK_SHAPE_VALUES = ImmutableSet.of(TtmlNode.TEXT_EMPHASIS_MARK_DOT, TtmlNode.TEXT_EMPHASIS_MARK_SESAME, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
    private static final ImmutableSet<String> MARK_FILL_VALUES = ImmutableSet.of(TtmlNode.TEXT_EMPHASIS_MARK_FILLED, "open");
    private static final ImmutableSet<String> POSITION_VALUES = ImmutableSet.of(TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE);

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    private TextEmphasis(int i14, int i15, int i16) {
        this.markShape = i14;
        this.markFill = i15;
        this.position = i16;
    }

    public static TextEmphasis parse(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.isEmpty()) {
            return null;
        }
        return parseWords(ImmutableSet.copyOf(TextUtils.split(lowerCase, WHITESPACE_PATTERN)));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ee  */
    private static TextEmphasis parseWords(ImmutableSet<String> immutableSet) {
        int i14;
        Sets.SetView setViewIntersection;
        int i15;
        Sets.SetView setViewIntersection2;
        Sets.SetView setViewIntersection3;
        String str;
        int iHashCode;
        int i16;
        String str2;
        int iHashCode2;
        String str3;
        int iHashCode3;
        String str4 = (String) Iterables.getFirst(Sets.intersection(POSITION_VALUES, immutableSet), TtmlNode.ANNOTATION_POSITION_OUTSIDE);
        int iHashCode4 = str4.hashCode();
        int i17 = 1;
        if (iHashCode4 != -1392885889) {
            if (iHashCode4 != -1106037339) {
                if (iHashCode4 == 92734940 && str4.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                    i14 = 2;
                }
            } else if (str4.equals(TtmlNode.ANNOTATION_POSITION_OUTSIDE)) {
                i14 = -2;
            }
            setViewIntersection = Sets.intersection(SINGLE_STYLE_VALUES, immutableSet);
            i15 = -1;
            if (!setViewIntersection.isEmpty()) {
                str3 = (String) setViewIntersection.iterator().next();
                iHashCode3 = str3.hashCode();
                if (iHashCode3 != 3005871) {
                    str3.equals(TtmlNode.TEXT_EMPHASIS_AUTO);
                } else if (iHashCode3 == 3387192 && str3.equals("none")) {
                    i15 = 0;
                }
                return new TextEmphasis(i15, 0, i14);
            }
            setViewIntersection2 = Sets.intersection(MARK_FILL_VALUES, immutableSet);
            setViewIntersection3 = Sets.intersection(MARK_SHAPE_VALUES, immutableSet);
            if (!setViewIntersection2.isEmpty() && setViewIntersection3.isEmpty()) {
                return new TextEmphasis(-1, 0, i14);
            }
            str = (String) Iterables.getFirst(setViewIntersection2, TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
            iHashCode = str.hashCode();
            if (iHashCode != -1274499742) {
                if (iHashCode == 3417674 && str.equals("open")) {
                    i16 = 2;
                }
                str2 = (String) Iterables.getFirst(setViewIntersection3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
                iHashCode2 = str2.hashCode();
                if (iHashCode2 != -1360216880) {
                    str2.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
                } else if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str2.equals(TtmlNode.TEXT_EMPHASIS_MARK_DOT)) {
                        i17 = 2;
                    }
                } else if (str2.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                    i17 = 3;
                }
                return new TextEmphasis(i17, i16, i14);
            }
            str.equals(TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
            i16 = 1;
            str2 = (String) Iterables.getFirst(setViewIntersection3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
            iHashCode2 = str2.hashCode();
            if (iHashCode2 != -1360216880) {
                str2.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
            } else if (iHashCode2 != -905816648) {
                if (iHashCode2 == 99657) {
                    i17 = 2;
                }
            } else if (str2.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                i17 = 3;
            }
            return new TextEmphasis(i17, i16, i14);
        }
        str4.equals(TtmlNode.ANNOTATION_POSITION_BEFORE);
        i14 = 1;
        setViewIntersection = Sets.intersection(SINGLE_STYLE_VALUES, immutableSet);
        i15 = -1;
        if (!setViewIntersection.isEmpty()) {
            str3 = (String) setViewIntersection.iterator().next();
            iHashCode3 = str3.hashCode();
            if (iHashCode3 != 3005871) {
                str3.equals(TtmlNode.TEXT_EMPHASIS_AUTO);
            } else if (iHashCode3 == 3387192) {
                i15 = 0;
            }
            return new TextEmphasis(i15, 0, i14);
        }
        setViewIntersection2 = Sets.intersection(MARK_FILL_VALUES, immutableSet);
        setViewIntersection3 = Sets.intersection(MARK_SHAPE_VALUES, immutableSet);
        if (!setViewIntersection2.isEmpty()) {
        }
        str = (String) Iterables.getFirst(setViewIntersection2, TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        iHashCode = str.hashCode();
        if (iHashCode != -1274499742) {
            if (iHashCode == 3417674) {
                i16 = 2;
            }
            str2 = (String) Iterables.getFirst(setViewIntersection3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
            iHashCode2 = str2.hashCode();
            if (iHashCode2 != -1360216880) {
                str2.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
            } else if (iHashCode2 != -905816648) {
                if (iHashCode2 == 99657) {
                    i17 = 2;
                }
            } else if (str2.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                i17 = 3;
            }
            return new TextEmphasis(i17, i16, i14);
        }
        str.equals(TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        i16 = 1;
        str2 = (String) Iterables.getFirst(setViewIntersection3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
        iHashCode2 = str2.hashCode();
        if (iHashCode2 != -1360216880) {
            str2.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
        } else if (iHashCode2 != -905816648) {
            if (iHashCode2 == 99657) {
                i17 = 2;
            }
        } else if (str2.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
            i17 = 3;
        }
        return new TextEmphasis(i17, i16, i14);
    }
}
