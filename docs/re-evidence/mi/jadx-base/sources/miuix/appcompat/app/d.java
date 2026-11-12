package miuix.appcompat.app;

import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.TypedValue;
import androidx.annotation.RequiresApi;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26316a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f26317b = 0;
        public int c = 0;
        public int d = 0;
        public boolean e;
        public int f;
        public int g;
        public int h;
        public boolean i;
        public boolean j;

        public void a(int i, int i2, int i3, int i4, boolean z, int i5, int i6, int i7, boolean z2, boolean z3) {
            this.f26316a = i;
            this.f26317b = i2;
            this.c = i3;
            this.d = i4;
            this.e = z;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = z2;
            this.j = z3;
        }

        public String toString() {
            return "ButtonScrollSpec{mButtonFVHeight=" + this.f26316a + ", mButtonPanelHeight=" + this.f26317b + ", mWindowHeight=" + this.c + ", mTopPanelHeight=" + this.d + ", mIsFlipTiny=" + this.e + ", mWindowOrientation=" + this.f + ", mVisibleButtonCount=" + this.g + ", mRootViewSizeYDp=" + this.h + ", mIsLargeFont=" + this.i + ", mHasListView = " + this.j + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f26319b;
        public int c;
        public int d = -1;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f26320k;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f26321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f26322b;
        public int d;
        public boolean e;
        public boolean f;
        public Point c = new Point();
        public Point g = new Point();
        public Point h = new Point();

        public void a(boolean z, boolean z2, int i, boolean z3, boolean z4) {
            this.f26321a = z;
            this.f26322b = z2;
            this.d = i;
            this.e = z3;
            this.f = z4;
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.app.d$d, reason: collision with other inner class name */
    public static class C1022d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f26324b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public Rect j = new Rect();

        public void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2) {
            this.f26323a = i;
            this.f26324b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = z;
            this.i = z2;
        }

        public String toString() {
            return "PanelPosSpec{mRootViewPaddingLeft=" + this.f26323a + ", mRootViewPaddingRight=" + this.f26324b + ", mRootViewWidth=" + this.c + ", mDesignedPanelWidth=" + this.d + ", mUsableWindowWidthDp=" + this.e + ", mUsableWindowWidth=" + this.f + ", mRootViewSizeX=" + this.g + ", mIsFlipTiny=" + this.h + ", mIsDebugMode=" + this.i + ", mBoundInsets=" + this.j + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f26325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f26326b;
        public boolean c;
        public boolean d;
        public int e;
        public int f;
        public boolean g;

        public void a(boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, boolean z5) {
            this.f26325a = z;
            this.f26326b = z2;
            this.c = z3;
            this.d = z4;
            this.e = i;
            this.f = i2;
            this.g = z5;
        }

        public String toString() {
            return "PanelWidthSpec{mUseLandscapeLayout=" + this.f26325a + ", mIsLandscapeWindow=" + this.f26326b + ", mIsCarWithScreen=" + this.c + ", mMarkLandscapeWindow=" + this.d + ", mUsableWindowWidthDp=" + this.e + ", mScreenMinorSize=" + this.f + ", mIsDebugMode=" + this.g + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TypedValue f26327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TypedValue f26328b;
        public final TypedValue c;

        public f(TypedValue typedValue, TypedValue typedValue2, TypedValue typedValue3) {
            this.f26327a = typedValue;
            this.f26328b = typedValue2;
            this.c = typedValue2;
        }

        public TypedValue a() {
            return this.c;
        }

        public TypedValue b() {
            return this.f26328b;
        }

        public TypedValue c() {
            return this.f26327a;
        }
    }

    @RequiresApi(api = 29)
    public static Rect a(Insets insets) {
        Rect rect = new Rect();
        if (insets == null) {
            return rect;
        }
        rect.left = insets.left;
        rect.top = insets.top;
        rect.right = insets.right;
        rect.bottom = insets.bottom;
        return rect;
    }

    public static Rect b(Rect rect, Rect rect2) {
        Rect rect3 = new Rect();
        rect3.left = Math.max(rect != null ? rect.left : 0, rect2 != null ? rect2.left : 0);
        rect3.top = Math.max(rect != null ? rect.top : 0, rect2 != null ? rect2.top : 0);
        rect3.right = Math.max(rect != null ? rect.right : 0, rect2 != null ? rect2.right : 0);
        rect3.bottom = Math.max(rect != null ? rect.bottom : 0, rect2 != null ? rect2.bottom : 0);
        return rect3;
    }
}
