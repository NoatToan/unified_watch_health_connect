package androidx.emoji2.text;

import a8.j;
import a8.k;
import a8.l;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.emoji2.text.d.j f7051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f7052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.emoji2.text.d.e f7053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f7055e;

    public static class a implements b<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public l f7056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.emoji2.text.d.j f7057b;

        public a(l lVar, androidx.emoji2.text.d.j jVar) {
            this.f7056a = lVar;
            this.f7057b = jVar;
        }

        @Override // androidx.emoji2.text.f.b
        public final boolean a(CharSequence charSequence, int i14, int i15, j jVar) {
            if ((jVar.f1923c & 4) > 0) {
                return true;
            }
            if (this.f7056a == null) {
                this.f7056a = new l(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            ((androidx.emoji2.text.d.C0099d) this.f7057b).getClass();
            this.f7056a.setSpan(new k(jVar), i14, i15, 33);
            return true;
        }

        @Override // androidx.emoji2.text.f.b
        public final l getResult() {
            return this.f7056a;
        }
    }

    public interface b<T> {
        boolean a(CharSequence charSequence, int i14, int i15, j jVar);

        T getResult();
    }

    public static class c implements b<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7059b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7060c = -1;

        public c(int i14) {
            this.f7058a = i14;
        }

        @Override // androidx.emoji2.text.f.b
        public final boolean a(CharSequence charSequence, int i14, int i15, j jVar) {
            int i16 = this.f7058a;
            if (i14 > i16 || i16 >= i15) {
                return i15 <= i16;
            }
            this.f7059b = i14;
            this.f7060c = i15;
            return false;
        }

        @Override // androidx.emoji2.text.f.b
        public final c getResult() {
            return this;
        }
    }

    public static class d implements b<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7061a;

        public d(String str) {
            this.f7061a = str;
        }

        @Override // androidx.emoji2.text.f.b
        public final boolean a(CharSequence charSequence, int i14, int i15, j jVar) {
            if (!TextUtils.equals(charSequence.subSequence(i14, i15), this.f7061a)) {
                return true;
            }
            jVar.f1923c = (jVar.f1923c & 3) | 4;
            return false;
        }

        @Override // androidx.emoji2.text.f.b
        public final d getResult() {
            return this;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7062a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h.a f7063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public h.a f7064c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public h.a f7065d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7066e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7067f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f7068g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int[] f7069h;

        public e(h.a aVar, boolean z14, int[] iArr) {
            this.f7063b = aVar;
            this.f7064c = aVar;
            this.f7068g = z14;
            this.f7069h = iArr;
        }

        public final void a() {
            this.f7062a = 1;
            this.f7064c = this.f7063b;
            this.f7067f = 0;
        }

        public final boolean b() {
            int[] iArr;
            b8.a aVarB = this.f7064c.f7084b.b();
            int iA = aVarB.a(6);
            if ((iA == 0 || aVarB.f16373b.get(iA + aVarB.f16372a) == 0) && this.f7066e != 65039) {
                return this.f7068g && ((iArr = this.f7069h) == null || Arrays.binarySearch(iArr, this.f7064c.f7084b.a(0)) < 0);
            }
            return true;
        }
    }

    public f(h hVar, androidx.emoji2.text.d.j jVar, androidx.emoji2.text.d.e eVar, boolean z14, int[] iArr, Set<int[]> set) {
        this.f7051a = jVar;
        this.f7052b = hVar;
        this.f7053c = eVar;
        this.f7054d = z14;
        this.f7055e = iArr;
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr2 : set) {
            String str = new String(iArr2, 0, iArr2.length);
            c(str, 0, str.length(), 1, true, new d(str));
        }
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z14) {
        a8.g[] gVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (gVarArr = (a8.g[]) editable.getSpans(selectionStart, selectionEnd, a8.g.class)) != null && gVarArr.length > 0) {
                for (a8.g gVar : gVarArr) {
                    int spanStart = editable.getSpanStart(gVar);
                    int spanEnd = editable.getSpanEnd(gVar);
                    if ((z14 && spanStart == selectionStart) || ((!z14 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i14, int i15, j jVar) {
        if ((jVar.f1923c & 3) == 0) {
            androidx.emoji2.text.d.e eVar = this.f7053c;
            b8.a aVarB = jVar.b();
            int iA = aVarB.a(8);
            if (iA != 0) {
                aVarB.f16373b.getShort(iA + aVarB.f16372a);
            }
            androidx.emoji2.text.b bVar = (androidx.emoji2.text.b) eVar;
            bVar.getClass();
            ThreadLocal<StringBuilder> threadLocal = androidx.emoji2.text.b.f7027b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb3 = threadLocal.get();
            sb3.setLength(0);
            while (i14 < i15) {
                sb3.append(charSequence.charAt(i14));
                i14++;
            }
            boolean zHasGlyph = bVar.f7028a.hasGlyph(sb3.toString());
            int i16 = jVar.f1923c & 4;
            jVar.f1923c = zHasGlyph ? i16 | 2 : i16 | 1;
        }
        return (jVar.f1923c & 3) == 2;
    }

    public final <T> T c(CharSequence charSequence, int i14, int i15, int i16, boolean z14, b<T> bVar) {
        int i17;
        char c14;
        e eVar = new e(this.f7052b.f7081c, this.f7054d, this.f7055e);
        int iCodePointAt = Character.codePointAt(charSequence, i14);
        int i18 = 0;
        boolean zA = true;
        int iCharCount = i14;
        loop0: while (true) {
            i17 = iCharCount;
            while (true) {
                if (iCharCount < i15 && i18 < i16 && zA) {
                    SparseArray<h.a> sparseArray = eVar.f7064c.f7083a;
                    h.a aVar = sparseArray == null ? null : sparseArray.get(iCodePointAt);
                    if (eVar.f7062a == 2) {
                        if (aVar != null) {
                            eVar.f7064c = aVar;
                            eVar.f7067f++;
                        } else {
                            if (iCodePointAt == 65038) {
                                eVar.a();
                            } else if (iCodePointAt != 65039) {
                                h.a aVar2 = eVar.f7064c;
                                if (aVar2.f7084b != null) {
                                    if (eVar.f7067f != 1) {
                                        eVar.f7065d = aVar2;
                                        eVar.a();
                                    } else if (eVar.b()) {
                                        eVar.f7065d = eVar.f7064c;
                                        eVar.a();
                                    } else {
                                        eVar.a();
                                    }
                                    c14 = 3;
                                } else {
                                    eVar.a();
                                }
                            }
                            c14 = 1;
                        }
                        c14 = 2;
                    } else if (aVar == null) {
                        eVar.a();
                        c14 = 1;
                    } else {
                        eVar.f7062a = 2;
                        eVar.f7064c = aVar;
                        eVar.f7067f = 1;
                        c14 = 2;
                    }
                    eVar.f7066e = iCodePointAt;
                    if (c14 == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i17)) + i17;
                        if (iCharCount >= i15) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c14 == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i15) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c14 == 3) {
                        if (!z14 && b(charSequence, i17, iCharCount, eVar.f7065d.f7084b)) {
                            break;
                        }
                        zA = bVar.a(charSequence, i17, iCharCount, eVar.f7065d.f7084b);
                        i18++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (eVar.f7062a == 2 && eVar.f7064c.f7084b != null && ((eVar.f7067f > 1 || eVar.b()) && i18 < i16 && zA && (z14 || !b(charSequence, i17, iCharCount, eVar.f7064c.f7084b)))) {
            bVar.a(charSequence, i17, iCharCount, eVar.f7064c.f7084b);
        }
        return bVar.getResult();
    }
}
