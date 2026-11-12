package com.google.android.exoplayer2.text.ttml;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class TextEmphasis {
    public static final int d = -1;
    public static final int e = -2;
    private static final Pattern f = Pattern.compile("\\s+");
    private static final ImmutableSet<String> g = ImmutableSet.of("auto", "none");
    private static final ImmutableSet<String> h = ImmutableSet.of(b.x0, b.y0, "circle");
    private static final ImmutableSet<String> i = ImmutableSet.of(b.A0, "open");
    private static final ImmutableSet<String> j = ImmutableSet.of(b.d0, b.c0, b.e0);
    public final int a;
    public final int b;
    public final int c;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    private TextEmphasis(int markShape, int markFill, int position) {
        this.a = markShape;
        this.b = markFill;
        this.c = position;
    }

    @Nullable
    public static TextEmphasis a(@Nullable String value) {
        if (value == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(value.trim());
        if (lowerCase.isEmpty()) {
            return null;
        }
        return b(ImmutableSet.copyOf(TextUtils.split(lowerCase, f)));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d6  */
    private static TextEmphasis b(ImmutableSet<String> nodes) {
        byte b;
        int i2;
        byte b2;
        String str = (String) Iterables.getFirst(Sets.intersection(j, nodes), b.e0);
        int iHashCode = str.hashCode();
        int i3 = 2;
        int i4 = -1;
        byte b3 = 1;
        if (iHashCode != -1392885889) {
            if (iHashCode != -1106037339) {
                if (iHashCode == 92734940 && str.equals(b.d0)) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str.equals(b.e0)) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals(b.c0)) {
            b = 2;
        } else {
            b = -1;
        }
        if (b != 0) {
            i2 = b != 1 ? 1 : -2;
        } else {
            i2 = 2;
        }
        Sets.SetView setViewIntersection = Sets.intersection(g, nodes);
        if (!setViewIntersection.isEmpty()) {
            String str2 = (String) setViewIntersection.iterator().next();
            int iHashCode2 = str2.hashCode();
            if (iHashCode2 != 3005871) {
                if (iHashCode2 == 3387192 && str2.equals("none")) {
                    b3 = 0;
                } else {
                    b3 = -1;
                }
            } else if (!str2.equals("auto")) {
                b3 = -1;
            }
            return new TextEmphasis(b3 == 0 ? 0 : -1, 0, i2);
        }
        Sets.SetView setViewIntersection2 = Sets.intersection(i, nodes);
        Sets.SetView setViewIntersection3 = Sets.intersection(h, nodes);
        if (setViewIntersection2.isEmpty() && setViewIntersection3.isEmpty()) {
            return new TextEmphasis(-1, 0, i2);
        }
        String str3 = (String) Iterables.getFirst(setViewIntersection2, b.A0);
        int iHashCode3 = str3.hashCode();
        if (iHashCode3 != -1274499742) {
            if (iHashCode3 == 3417674 && str3.equals("open")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
        } else if (str3.equals(b.A0)) {
            b2 = 1;
        } else {
            b2 = -1;
        }
        int i5 = b2 != 0 ? 1 : 2;
        String str4 = (String) Iterables.getFirst(setViewIntersection3, "circle");
        int iHashCode4 = str4.hashCode();
        if (iHashCode4 != -1360216880) {
            if (iHashCode4 != -905816648) {
                if (iHashCode4 == 99657 && str4.equals(b.x0)) {
                    i4 = 0;
                }
            } else if (str4.equals(b.y0)) {
                i4 = 1;
            }
        } else if (str4.equals("circle")) {
            i4 = 2;
        }
        if (i4 != 0) {
            i3 = i4 != 1 ? 1 : 3;
        }
        return new TextEmphasis(i3, i5, i2);
    }
}
