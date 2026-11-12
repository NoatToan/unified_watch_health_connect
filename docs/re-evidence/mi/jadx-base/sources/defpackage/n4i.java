package defpackage;

import android.graphics.Rect;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class n4i implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27538b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27539k;
    public boolean l;
    public boolean m;
    public int[][] n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Rect f27540r;
    public int s;
    public int i = 8388693;
    public Rect o = new Rect();
    public Rect p = new Rect();
    public Rect q = new Rect();

    public static String b(int[][] iArr) {
        if (iArr == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sb = new StringBuilder();
        for (int[] iArr2 : iArr) {
            sb.append(String.format("{%d, %d},", Integer.valueOf(iArr2[0]), Integer.valueOf(iArr2[1])));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n4i clone() {
        try {
            n4i n4iVar = (n4i) super.clone();
            n4iVar.f27537a = this.f27537a;
            n4iVar.f27538b = this.f27538b;
            n4iVar.c = this.c;
            n4iVar.d = this.d;
            n4iVar.e = this.e;
            n4iVar.f = this.f;
            n4iVar.g = this.g;
            n4iVar.h = this.h;
            n4iVar.i = this.i;
            n4iVar.j = this.j;
            n4iVar.f27539k = this.f27539k;
            n4iVar.l = this.l;
            n4iVar.m = this.m;
            n4iVar.n = this.n;
            Rect rect = this.o;
            n4iVar.o = new Rect(rect.left, rect.top, rect.right, rect.bottom);
            Rect rect2 = this.p;
            n4iVar.p = new Rect(rect2.left, rect2.top, rect2.right, rect2.bottom);
            Rect rect3 = this.q;
            n4iVar.q = new Rect(rect3.left, rect3.top, rect3.right, rect3.bottom);
            n4iVar.f27540r = this.f27540r;
            n4iVar.s = this.s;
            return n4iVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return "PopupWindowSpec{mMaxWidth=" + this.f27537a + ", mMinWidth=" + this.f27538b + ", mMaxHeight=" + this.c + ", mMinHeight=" + this.d + ", mContentWidth=" + this.e + ", mContentHeight=" + this.f + ", mFinalPopupWidth=" + this.g + ", mFinalPopupHeight=" + this.h + ", mGravity=" + this.i + ", mUserOffsetX=" + this.j + ", mUserOffsetY=" + this.f27539k + ", mOffsetXSet=" + this.l + ", mOffsetYSet=" + this.m + ", mItemViewBounds=" + b(this.n) + ", mDecorViewBounds=" + this.p.flattenToString() + ", mAnchorViewBounds=" + this.q.flattenToString() + ", mSafeInsets=" + this.f27540r.flattenToString() + ", layoutDirection=" + this.s + AbstractJsonLexerKt.END_OBJ;
    }
}
