package androidx.media3.extractor.text.ttml;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import defpackage.amn;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
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

    /* JADX INFO: loaded from: classes3.dex */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    private TextEmphasis(int i, int i2, int i3) {
        this.markShape = i;
        this.markFill = i2;
        this.position = i3;
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

    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:68:0x0102  */
    /* JADX WARN: Code duplicated, block: B:69:0x0104  */
    /* JADX WARN: Code duplicated, block: B:71:0x0107 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x010a  */
    /* JADX WARN: Code duplicated, block: B:74:0x010c  */
    private static TextEmphasis parseWords(ImmutableSet<String> immutableSet) {
        byte b2;
        int i;
        int i2;
        String str;
        int iHashCode;
        String str2 = (String) amn.a(Sets.c((Set) POSITION_VALUES, (Set<?>) immutableSet), TtmlNode.ANNOTATION_POSITION_OUTSIDE);
        int iHashCode2 = str2.hashCode();
        int i3 = 1;
        byte b3 = 0;
        int i4 = -1;
        if (iHashCode2 != -1392885889) {
            if (iHashCode2 != -1106037339) {
                if (iHashCode2 == 92734940 && str2.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
            } else if (str2.equals(TtmlNode.ANNOTATION_POSITION_OUTSIDE)) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str2.equals(TtmlNode.ANNOTATION_POSITION_BEFORE)) {
            b2 = 2;
        } else {
            b2 = -1;
        }
        if (b2 != 0) {
            i = b2 != 1 ? 1 : -2;
        } else {
            i = 2;
        }
        Sets.SetView setViewC = Sets.c((Set) SINGLE_STYLE_VALUES, (Set<?>) immutableSet);
        if (!setViewC.isEmpty()) {
            String str3 = (String) setViewC.iterator().next();
            int iHashCode3 = str3.hashCode();
            if (iHashCode3 == 3005871) {
                str3.equals(TtmlNode.TEXT_EMPHASIS_AUTO);
            } else if (iHashCode3 == 3387192 && str3.equals("none")) {
                i4 = 0;
            }
            return new TextEmphasis(i4, 0, i);
        }
        Sets.SetView setViewC2 = Sets.c((Set) MARK_FILL_VALUES, (Set<?>) immutableSet);
        Sets.SetView setViewC3 = Sets.c((Set) MARK_SHAPE_VALUES, (Set<?>) immutableSet);
        if (setViewC2.isEmpty() && setViewC3.isEmpty()) {
            return new TextEmphasis(-1, 0, i);
        }
        String str4 = (String) amn.a(setViewC2, TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        int iHashCode4 = str4.hashCode();
        if (iHashCode4 == -1274499742) {
            str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        } else {
            if (iHashCode4 == 3417674 && str4.equals("open")) {
                i2 = 2;
            }
            str = (String) amn.a(setViewC3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
            iHashCode = str.hashCode();
            if (iHashCode != -1360216880) {
                if (iHashCode != -905816648) {
                    if (iHashCode == 99657 || !str.equals(TtmlNode.TEXT_EMPHASIS_MARK_DOT)) {
                        b3 = -1;
                    }
                } else if (str.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                    b3 = 1;
                } else {
                    b3 = -1;
                }
            } else if (str.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE)) {
                b3 = 2;
            } else {
                b3 = -1;
            }
            if (b3 != 0) {
                i3 = 2;
            } else if (b3 == 1) {
                i3 = 3;
            }
            return new TextEmphasis(i3, i2, i);
        }
        i2 = 1;
        str = (String) amn.a(setViewC3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
        iHashCode = str.hashCode();
        if (iHashCode != -1360216880) {
            if (iHashCode != -905816648) {
                if (iHashCode == 99657) {
                    b3 = -1;
                } else {
                    b3 = -1;
                }
            } else if (str.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                b3 = 1;
            } else {
                b3 = -1;
            }
        } else if (str.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE)) {
            b3 = 2;
        } else {
            b3 = -1;
        }
        if (b3 != 0) {
            i3 = 2;
        } else if (b3 == 1) {
            i3 = 3;
        }
        return new TextEmphasis(i3, i2, i);
    }
}
