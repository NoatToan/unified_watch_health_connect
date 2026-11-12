package i03;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class t implements Appendable, CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f86967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f86968b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f86969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f86970b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f86971c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f86972d;

        public a(Object obj, int i14, int i15, int i16) {
            this.f86969a = obj;
            this.f86970b = i14;
            this.f86971c = i15;
            this.f86972d = i16;
        }
    }

    public static class b extends SpannableStringBuilder {
        public b(CharSequence charSequence) {
            super(charSequence);
        }
    }

    public t(CharSequence charSequence) {
        this.f86968b = new ArrayDeque(8);
        this.f86967a = new StringBuilder(charSequence);
        b(0, charSequence);
    }

    public static void c(t tVar, Object obj, int i14, int i15) {
        if (obj != null) {
            if (!obj.getClass().isArray()) {
                tVar.f86968b.push(new a(obj, i14, i15, 33));
                return;
            }
            for (Object obj2 : (Object[]) obj) {
                c(tVar, obj2, i14, i15);
            }
        }
    }

    public final void a(char c14) {
        this.f86967a.append(c14);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i14, int i15) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i14, i15);
        StringBuilder sb3 = this.f86967a;
        b(sb3.length(), charSequenceSubSequence);
        sb3.append(charSequenceSubSequence);
        return this;
    }

    public final void b(int i14, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z14 = spanned instanceof b;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length > 0) {
                ArrayDeque arrayDeque = this.f86968b;
                if (!z14) {
                    for (int i15 = 0; i15 < length; i15++) {
                        Object obj = spans[i15];
                        arrayDeque.push(new a(obj, spanned.getSpanStart(obj) + i14, spanned.getSpanEnd(obj) + i14, spanned.getSpanFlags(obj)));
                    }
                    return;
                }
                for (int i16 = length - 1; i16 >= 0; i16--) {
                    Object obj2 = spans[i16];
                    arrayDeque.push(new a(obj2, spanned.getSpanStart(obj2) + i14, spanned.getSpanEnd(obj2) + i14, spanned.getSpanFlags(obj2)));
                }
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i14) {
        return this.f86967a.charAt(i14);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f86967a.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i14, int i15) {
        List<a> listUnmodifiableList;
        int i16;
        StringBuilder sb3 = this.f86967a;
        int length = sb3.length();
        if (i15 <= i14 || i14 < 0 || i15 > length) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayDeque arrayDeque = this.f86968b;
            if (i14 == 0 && length == i15) {
                ArrayList arrayList = new ArrayList(arrayDeque);
                Collections.reverse(arrayList);
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(0);
                Iterator itDescendingIterator = arrayDeque.descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    a aVar = (a) itDescendingIterator.next();
                    int i17 = aVar.f86970b;
                    if ((i17 >= i14 && i17 < i15) || (((i16 = aVar.f86971c) <= i15 && i16 > i14) || (i17 < i14 && i16 > i15))) {
                        arrayList2.add(aVar);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            return sb3.subSequence(i14, i15);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb3.subSequence(i14, i15));
        int length2 = spannableStringBuilder.length();
        for (a aVar2 : listUnmodifiableList) {
            int iMax = Math.max(0, aVar2.f86970b - i14);
            spannableStringBuilder.setSpan(aVar2.f86969a, iMax, Math.min(length2, (aVar2.f86971c - aVar2.f86970b) + iMax), aVar2.f86972d);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f86967a.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c14) {
        this.f86967a.append(c14);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        StringBuilder sb3 = this.f86967a;
        b(sb3.length(), charSequence);
        sb3.append(charSequence);
        return this;
    }

    public t() {
        this("");
    }
}
