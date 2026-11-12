package ec;

import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f63697d = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ImmutableSet<String> f63698e = ImmutableSet.of(TtmlNode.TEXT_EMPHASIS_AUTO, "none");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ImmutableSet<String> f63699f = ImmutableSet.of(TtmlNode.TEXT_EMPHASIS_MARK_DOT, TtmlNode.TEXT_EMPHASIS_MARK_SESAME, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ImmutableSet<String> f63700g = ImmutableSet.of(TtmlNode.TEXT_EMPHASIS_MARK_FILLED, "open");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ImmutableSet<String> f63701h = ImmutableSet.of(TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f63704c;

    private b(int i14, int i15, int i16) {
        this.f63702a = i14;
        this.f63703b = i15;
        this.f63704c = i16;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0101  */
    /* JADX WARN: Code duplicated, block: B:64:0x0109  */
    /* JADX WARN: Code duplicated, block: B:65:0x010b  */
    public static b a(String str) {
        int i14;
        Sets.SetView setViewIntersection;
        int i15;
        Sets.SetView setViewIntersection2;
        Sets.SetView setViewIntersection3;
        String str2;
        int iHashCode;
        int i16;
        String str3;
        int iHashCode2;
        String str4;
        int iHashCode3;
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.isEmpty()) {
            return null;
        }
        ImmutableSet immutableSetCopyOf = ImmutableSet.copyOf(TextUtils.split(lowerCase, f63697d));
        String str5 = (String) Iterables.getFirst(Sets.intersection(f63701h, immutableSetCopyOf), TtmlNode.ANNOTATION_POSITION_OUTSIDE);
        int iHashCode4 = str5.hashCode();
        int i17 = 1;
        if (iHashCode4 != -1392885889) {
            if (iHashCode4 != -1106037339) {
                if (iHashCode4 == 92734940 && str5.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                    i14 = 2;
                }
            } else if (str5.equals(TtmlNode.ANNOTATION_POSITION_OUTSIDE)) {
                i14 = -2;
            }
            setViewIntersection = Sets.intersection(f63698e, immutableSetCopyOf);
            i15 = -1;
            if (!setViewIntersection.isEmpty()) {
                str4 = (String) setViewIntersection.iterator().next();
                iHashCode3 = str4.hashCode();
                if (iHashCode3 != 3005871) {
                    str4.equals(TtmlNode.TEXT_EMPHASIS_AUTO);
                } else if (iHashCode3 == 3387192 && str4.equals("none")) {
                    i15 = 0;
                }
                return new b(i15, 0, i14);
            }
            setViewIntersection2 = Sets.intersection(f63700g, immutableSetCopyOf);
            setViewIntersection3 = Sets.intersection(f63699f, immutableSetCopyOf);
            if (!setViewIntersection2.isEmpty() && setViewIntersection3.isEmpty()) {
                return new b(-1, 0, i14);
            }
            str2 = (String) Iterables.getFirst(setViewIntersection2, TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
            iHashCode = str2.hashCode();
            if (iHashCode != -1274499742) {
                if (iHashCode == 3417674 && str2.equals("open")) {
                    i16 = 2;
                }
                str3 = (String) Iterables.getFirst(setViewIntersection3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
                iHashCode2 = str3.hashCode();
                if (iHashCode2 != -1360216880) {
                    str3.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
                } else if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str3.equals(TtmlNode.TEXT_EMPHASIS_MARK_DOT)) {
                        i17 = 2;
                    }
                } else if (str3.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                    i17 = 3;
                }
                return new b(i17, i16, i14);
            }
            str2.equals(TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
            i16 = 1;
            str3 = (String) Iterables.getFirst(setViewIntersection3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
            iHashCode2 = str3.hashCode();
            if (iHashCode2 != -1360216880) {
                str3.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
            } else if (iHashCode2 != -905816648) {
                if (iHashCode2 == 99657) {
                    i17 = 2;
                }
            } else if (str3.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                i17 = 3;
            }
            return new b(i17, i16, i14);
        }
        str5.equals(TtmlNode.ANNOTATION_POSITION_BEFORE);
        i14 = 1;
        setViewIntersection = Sets.intersection(f63698e, immutableSetCopyOf);
        i15 = -1;
        if (!setViewIntersection.isEmpty()) {
            str4 = (String) setViewIntersection.iterator().next();
            iHashCode3 = str4.hashCode();
            if (iHashCode3 != 3005871) {
                str4.equals(TtmlNode.TEXT_EMPHASIS_AUTO);
            } else if (iHashCode3 == 3387192) {
                i15 = 0;
            }
            return new b(i15, 0, i14);
        }
        setViewIntersection2 = Sets.intersection(f63700g, immutableSetCopyOf);
        setViewIntersection3 = Sets.intersection(f63699f, immutableSetCopyOf);
        if (!setViewIntersection2.isEmpty()) {
        }
        str2 = (String) Iterables.getFirst(setViewIntersection2, TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        iHashCode = str2.hashCode();
        if (iHashCode != -1274499742) {
            if (iHashCode == 3417674) {
                i16 = 2;
            }
            str3 = (String) Iterables.getFirst(setViewIntersection3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
            iHashCode2 = str3.hashCode();
            if (iHashCode2 != -1360216880) {
                str3.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
            } else if (iHashCode2 != -905816648) {
                if (iHashCode2 == 99657) {
                    i17 = 2;
                }
            } else if (str3.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                i17 = 3;
            }
            return new b(i17, i16, i14);
        }
        str2.equals(TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        i16 = 1;
        str3 = (String) Iterables.getFirst(setViewIntersection3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
        iHashCode2 = str3.hashCode();
        if (iHashCode2 != -1360216880) {
            str3.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
        } else if (iHashCode2 != -905816648) {
            if (iHashCode2 == 99657) {
                i17 = 2;
            }
        } else if (str3.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
            i17 = 3;
        }
        return new b(i17, i16, i14);
    }
}
