package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import defpackage.a98;
import defpackage.dbq;
import defpackage.f5n;
import defpackage.z88;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.i f2298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f2299b;
    public c.d c;
    public final boolean d;
    public final int[] e;

    @RequiresApi(19)
    public static final class a {
        public static int a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        return z ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i2--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z = true;
                    }
                }
                return i;
            }
        }

        public static int b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2--;
                        i++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i2--;
                        i++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i++;
                        z = true;
                    }
                }
                return i;
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2300a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f.a f2301b;
        public f.a c;
        public f.a d;
        public int e;
        public int f;
        public final boolean g;
        public final int[] h;

        public b(f.a aVar, boolean z, int[] iArr) {
            this.f2301b = aVar;
            this.c = aVar;
            this.g = z;
            this.h = iArr;
        }

        public static boolean d(int i) {
            return i == 65039;
        }

        public static boolean f(int i) {
            return i == 65038;
        }

        public int a(int i) {
            f.a aVarA = this.c.a(i);
            int iG = 2;
            if (this.f2300a != 2) {
                if (aVarA == null) {
                    iG = g();
                } else {
                    this.f2300a = 2;
                    this.c = aVarA;
                    this.f = 1;
                }
            } else if (aVarA != null) {
                this.c = aVarA;
                this.f++;
            } else if (f(i)) {
                iG = g();
            } else if (!d(i)) {
                if (this.c.b() != null) {
                    iG = 3;
                    if (this.f != 1 || h()) {
                        this.d = this.c;
                        g();
                    } else {
                        iG = g();
                    }
                } else {
                    iG = g();
                }
            }
            this.e = i;
            return iG;
        }

        public z88 b() {
            return this.c.b();
        }

        public z88 c() {
            return this.d.b();
        }

        public boolean e() {
            return this.f2300a == 2 && this.c.b() != null && (this.f > 1 || h());
        }

        public final int g() {
            this.f2300a = 1;
            this.c = this.f2301b;
            this.f = 0;
            return 1;
        }

        public final boolean h() {
            if (this.c.b().j() || d(this.e)) {
                return true;
            }
            if (this.g) {
                if (this.h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.h, this.c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public d(f fVar, c.i iVar, c.d dVar, boolean z, int[] iArr) {
        this.f2298a = iVar;
        this.f2299b = fVar;
        this.c = dVar;
        this.d = z;
        this.e = iArr;
    }

    public static boolean b(Editable editable, KeyEvent keyEvent, boolean z) {
        a98[] a98VarArr;
        if (g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!f(selectionStart, selectionEnd) && (a98VarArr = (a98[]) editable.getSpans(selectionStart, selectionEnd, a98.class)) != null && a98VarArr.length > 0) {
            for (a98 a98Var : a98VarArr) {
                int spanStart = editable.getSpanStart(a98Var);
                int spanEnd = editable.getSpanEnd(a98Var);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(InputConnection inputConnection, Editable editable, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, boolean z) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                iMax = a.a(editable, selectionStart, Math.max(i, 0));
                iMin = a.b(editable, selectionEnd, Math.max(i2, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i, 0);
                iMin = Math.min(selectionEnd + i2, editable.length());
            }
            a98[] a98VarArr = (a98[]) editable.getSpans(iMax, iMin, a98.class);
            if (a98VarArr != null && a98VarArr.length > 0) {
                for (a98 a98Var : a98VarArr) {
                    int spanStart = editable.getSpanStart(a98Var);
                    int spanEnd = editable.getSpanEnd(a98Var);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public static boolean d(Editable editable, int i, KeyEvent keyEvent) {
        boolean zB;
        if (i != 67) {
            if (i == 112) {
                zB = b(editable, keyEvent, true);
            }
            return false;
        }
        zB = b(editable, keyEvent, false);
        if (zB) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        return false;
    }

    public static boolean f(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    public static boolean g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public final void a(Spannable spannable, z88 z88Var, int i, int i2) {
        spannable.setSpan(this.f2298a.a(z88Var), i, i2, 33);
    }

    public final boolean e(CharSequence charSequence, int i, int i2, z88 z88Var) {
        if (z88Var.d() == 0) {
            z88Var.k(this.c.a(charSequence, i, i2, z88Var.h()));
        }
        return z88Var.d() == 2;
    }

    public CharSequence h(CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, boolean z) {
        dbq dbqVar;
        int iCharCount;
        a98[] a98VarArr;
        boolean z2 = charSequence instanceof f5n;
        if (z2) {
            ((f5n) charSequence).a();
        }
        if (!z2) {
            try {
                dbqVar = charSequence instanceof Spannable ? new dbq((Spannable) charSequence) : (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i + (-1), i2 + 1, a98.class) > i2) ? null : new dbq(charSequence);
            } finally {
                if (z2) {
                    ((f5n) charSequence).d();
                }
            }
        }
        if (dbqVar != null && (a98VarArr = (a98[]) dbqVar.getSpans(i, i2, a98.class)) != null && a98VarArr.length > 0) {
            for (a98 a98Var : a98VarArr) {
                int spanStart = dbqVar.getSpanStart(a98Var);
                int spanEnd = dbqVar.getSpanEnd(a98Var);
                if (spanStart != i2) {
                    dbqVar.removeSpan(a98Var);
                }
                i = Math.min(spanStart, i);
                i2 = Math.max(spanEnd, i2);
            }
        }
        if (i != i2 && i < charSequence.length()) {
            if (i3 != Integer.MAX_VALUE && dbqVar != null) {
                i3 -= ((a98[]) dbqVar.getSpans(0, dbqVar.length(), a98.class)).length;
            }
            b bVar = new b(this.f2299b.f(), this.d, this.e);
            int iCodePointAt = Character.codePointAt(charSequence, i);
            int i4 = 0;
            dbq dbqVar2 = dbqVar;
            loop1: while (true) {
                iCharCount = i;
                while (true) {
                    if (i >= i2 || i4 >= i3) {
                        break loop1;
                    }
                    int iA = bVar.a(iCodePointAt);
                    if (iA == 1) {
                        iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                        if (iCharCount < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        }
                        i = iCharCount;
                    } else if (iA == 2) {
                        i += Character.charCount(iCodePointAt);
                        if (i < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, i);
                        }
                    } else if (iA != 3) {
                    }
                }
                if (z || !e(charSequence, iCharCount, i, bVar.c())) {
                    if (dbqVar2 == null) {
                        dbqVar2 = new dbq((Spannable) new SpannableString(charSequence));
                    }
                    a(dbqVar2, bVar.c(), iCharCount, i);
                    i4++;
                }
            }
            if (bVar.e() && i4 < i3 && (z || !e(charSequence, iCharCount, i, bVar.b()))) {
                if (dbqVar2 == null) {
                    dbqVar2 = new dbq(charSequence);
                }
                a(dbqVar2, bVar.b(), iCharCount, i);
            }
            return dbqVar2 != null ? dbqVar2.b() : charSequence;
        }
        return charSequence;
    }
}
