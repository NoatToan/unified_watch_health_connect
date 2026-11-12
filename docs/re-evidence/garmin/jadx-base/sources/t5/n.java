package t5;

import android.text.Layout;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.text.Bidi;
import java.util.ArrayList;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lt5/n;", "", "Landroid/text/Layout;", TtmlNode.TAG_LAYOUT, "<init>", "(Landroid/text/Layout;)V", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Layout f162439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f162440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f162441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean[] f162442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public char[] f162443e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lt5/n$a;", "", "", TtmlNode.START, TtmlNode.END, "", "isRtl", "<init>", "(IIZ)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f162444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f162445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f162446c;

        public a(int i14, int i15, boolean z14) {
            this.f162444a = i14;
            this.f162445b = i15;
            this.f162446c = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f162444a == aVar.f162444a && this.f162445b == aVar.f162445b && this.f162446c == aVar.f162446c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f162446c) + q2.d(this.f162445b, Integer.hashCode(this.f162444a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("BidiRun(start=");
            sb3.append(this.f162444a);
            sb3.append(", end=");
            sb3.append(this.f162445b);
            sb3.append(", isRtl=");
            return am.j.t(sb3, this.f162446c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public n(Layout layout) {
        this.f162439a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iG = d53.w.G('\n', length, 4, this.f162439a.getText());
            length = iG < 0 ? this.f162439a.getText().length() : iG + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.f162439a.getText().length());
        this.f162440b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i14 = 0; i14 < size; i14++) {
            arrayList2.add(null);
        }
        this.f162441c = arrayList2;
        this.f162442d = new boolean[this.f162440b.size()];
        this.f162440b.size();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    public final Bidi a(int i14) {
        Bidi bidi;
        boolean[] zArr = this.f162442d;
        boolean z14 = zArr[i14];
        ArrayList arrayList = this.f162441c;
        if (z14) {
            return (Bidi) arrayList.get(i14);
        }
        ArrayList arrayList2 = this.f162440b;
        int iIntValue = i14 == 0 ? 0 : ((Number) arrayList2.get(i14 - 1)).intValue();
        int iIntValue2 = ((Number) arrayList2.get(i14)).intValue();
        int i15 = iIntValue2 - iIntValue;
        char[] cArr = this.f162443e;
        if (cArr == null || cArr.length < i15) {
            cArr = new char[i15];
        }
        char[] cArr2 = cArr;
        Layout layout = this.f162439a;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i15)) {
            bidi = new Bidi(cArr2, 0, null, 0, i15, layout.getParagraphDirection(layout.getLineForOffset(e(i14))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList.set(i14, bidi);
        zArr[i14] = true;
        if (bidi != null) {
            char[] cArr3 = this.f162443e;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f162443e = cArr2;
        return bidi;
    }

    public final float b(int i14, boolean z14) {
        Layout layout = this.f162439a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i14));
        if (i14 > lineEnd) {
            i14 = lineEnd;
        }
        return z14 ? layout.getPrimaryHorizontal(i14) : layout.getSecondaryHorizontal(i14);
    }

    public final float c(int i14, boolean z14, boolean z15) {
        int i15;
        int i16;
        int iF = i14;
        if (!z15) {
            return b(i14, z14);
        }
        Layout layout = this.f162439a;
        int iA = p.a(layout, iF, z15);
        int lineStart = layout.getLineStart(iA);
        int lineEnd = layout.getLineEnd(iA);
        if (iF != lineStart && iF != lineEnd) {
            return b(i14, z14);
        }
        if (iF == 0 || iF == layout.getText().length()) {
            return b(i14, z14);
        }
        int iD = d(iF, z15);
        boolean z16 = layout.getParagraphDirection(layout.getLineForOffset(e(iD))) == -1;
        int iF2 = f(lineEnd, lineStart);
        int iE = e(iD);
        int i17 = lineStart - iE;
        int i18 = iF2 - iE;
        Bidi bidiA = a(iD);
        Bidi bidiCreateLineBidi = bidiA != null ? bidiA.createLineBidi(i17, i18) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z14 || z16 == zIsRtlCharAt) {
                z16 = !z16;
            }
            return iF == lineStart ? z16 : !z16 ? layout.getLineLeft(iA) : layout.getLineRight(iA);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i19 = 0; i19 < runCount; i19++) {
            aVarArr[i19] = new a(bidiCreateLineBidi.getRunStart(i19) + lineStart, bidiCreateLineBidi.getRunLimit(i19) + lineStart, bidiCreateLineBidi.getRunLevel(i19) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i24 = 0; i24 < runCount2; i24++) {
            bArr[i24] = (byte) bidiCreateLineBidi.getRunLevel(i24);
        }
        Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
        if (iF == lineStart) {
            int i25 = 0;
            while (true) {
                if (i25 >= runCount) {
                    i16 = -1;
                    break;
                }
                if (aVarArr[i25].f162444a == iF) {
                    i16 = i25;
                    break;
                }
                i25++;
            }
            boolean z17 = (z14 || z16 == aVarArr[i16].f162446c) ? !z16 : z16;
            if (i16 == 0 && z17) {
                return layout.getLineLeft(iA);
            }
            if (i16 != runCount - 1 || z17) {
                return z17 ? layout.getPrimaryHorizontal(aVarArr[i16 - 1].f162444a) : layout.getPrimaryHorizontal(aVarArr[i16 + 1].f162444a);
            }
            return layout.getLineRight(iA);
        }
        if (iF > iF2) {
            iF = f(iF, lineStart);
        }
        int i26 = 0;
        while (true) {
            if (i26 >= runCount) {
                i15 = -1;
                break;
            }
            if (aVarArr[i26].f162445b == iF) {
                i15 = i26;
                break;
            }
            i26++;
        }
        boolean z18 = (z14 || z16 == aVarArr[i15].f162446c) ? z16 : !z16;
        if (i15 == 0 && z18) {
            return layout.getLineLeft(iA);
        }
        if (i15 != runCount - 1 || z18) {
            return z18 ? layout.getPrimaryHorizontal(aVarArr[i15 - 1].f162445b) : layout.getPrimaryHorizontal(aVarArr[i15 + 1].f162445b);
        }
        return layout.getLineRight(iA);
    }

    public final int d(int i14, boolean z14) {
        Integer numValueOf = Integer.valueOf(i14);
        ArrayList arrayList = this.f162440b;
        int iG = p13.x.g(arrayList, numValueOf);
        int i15 = iG < 0 ? -(iG + 1) : iG + 1;
        if (z14 && i15 > 0) {
            int i16 = i15 - 1;
            if (i14 == ((Number) arrayList.get(i16)).intValue()) {
                return i16;
            }
        }
        return i15;
    }

    public final int e(int i14) {
        if (i14 == 0) {
            return 0;
        }
        return ((Number) this.f162440b.get(i14 - 1)).intValue();
    }

    public final int f(int i14, int i15) {
        while (i14 > i15) {
            char cCharAt = this.f162439a.getText().charAt(i14 - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((p005kotlin.jvm.internal.s.h(cCharAt, 8192) < 0 || p005kotlin.jvm.internal.s.h(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i14;
            }
            i14--;
        }
        return i14;
    }
}
