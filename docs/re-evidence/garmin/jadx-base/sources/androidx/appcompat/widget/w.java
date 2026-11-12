package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f5253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u0 f5254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u0 f5255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u0 f5256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u0 f5257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u0 f5258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u0 f5259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u0 f5260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y f5261i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5262j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5263k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f5264l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5265m;

    public class a extends b7.g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f5266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f5267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WeakReference f5268c;

        public a(int i14, int i15, WeakReference weakReference) {
            this.f5266a = i14;
            this.f5267b = i15;
            this.f5268c = weakReference;
        }

        @Override // b7.g.c
        /* JADX INFO: renamed from: onFontRetrievalFailed */
        public final void lambda$callbackFailAsync$1(int i14) {
        }

        @Override // b7.g.c
        /* JADX INFO: renamed from: onFontRetrieved */
        public final void lambda$callbackSuccessAsync$0(Typeface typeface) {
            int i14 = this.f5266a;
            if (i14 != -1) {
                typeface = d.a(typeface, i14, (this.f5267b & 2) != 0);
            }
            w wVar = w.this;
            if (wVar.f5265m) {
                wVar.f5264l = typeface;
                TextView textView = (TextView) this.f5268c.get();
                if (textView != null) {
                    boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                    int i15 = wVar.f5262j;
                    if (zIsAttachedToWindow) {
                        textView.post(new x(wVar, textView, typeface, i15));
                    } else {
                        textView.setTypeface(typeface, i15);
                    }
                }
            }
        }
    }

    public static class b {
        private b() {
        }

        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    public static class c {
        private c() {
        }

        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i14, int i15, int i16, int i17) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i14, i15, i16, i17);
        }

        public static void c(TextView textView, int[] iArr, int i14) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i14);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    public static class d {
        private d() {
        }

        public static Typeface a(Typeface typeface, int i14, boolean z14) {
            return Typeface.create(typeface, i14, z14);
        }
    }

    public w(TextView textView) {
        this.f5253a = textView;
        this.f5261i = new y(textView);
    }

    public static u0 c(Context context, i iVar, int i14) {
        ColorStateList colorStateListF;
        synchronized (iVar) {
            colorStateListF = iVar.f5125a.f(i14, context);
        }
        if (colorStateListF == null) {
            return null;
        }
        u0 u0Var = new u0();
        u0Var.f5251d = true;
        u0Var.f5248a = colorStateListF;
        return u0Var;
    }

    public final void a(Drawable drawable, u0 u0Var) {
        if (drawable == null || u0Var == null) {
            return;
        }
        i.e(drawable, u0Var, this.f5253a.getDrawableState());
    }

    public final void b() {
        u0 u0Var = this.f5254b;
        TextView textView = this.f5253a;
        if (u0Var != null || this.f5255c != null || this.f5256d != null || this.f5257e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f5254b);
            a(compoundDrawables[1], this.f5255c);
            a(compoundDrawables[2], this.f5256d);
            a(compoundDrawables[3], this.f5257e);
        }
        if (this.f5258f == null && this.f5259g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f5258f);
        a(compoundDrawablesRelative[2], this.f5259g);
    }

    public final ColorStateList d() {
        u0 u0Var = this.f5260h;
        if (u0Var != null) {
            return u0Var.f5248a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        u0 u0Var = this.f5260h;
        if (u0Var != null) {
            return u0Var.f5249b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"NewApi"})
    public final void f(AttributeSet attributeSet, int i14) {
        String string;
        String string2;
        boolean z14;
        boolean z15;
        int i15;
        int i16;
        int i17;
        int i18;
        float dimensionPixelSize;
        int i19;
        int resourceId;
        TextView textView = this.f5253a;
        Context context = textView.getContext();
        i iVarA = i.a();
        int[] iArr = h.a.f80428h;
        w0 w0VarG = w0.g(context, attributeSet, iArr, i14, 0);
        androidx.core.view.s0.q(textView, textView.getContext(), iArr, attributeSet, w0VarG.f5271b, i14, 0);
        TypedArray typedArray = w0VarG.f5271b;
        int resourceId2 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f5254b = c(context, iVarA, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f5255c = c(context, iVarA, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f5256d = c(context, iVarA, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f5257e = c(context, iVarA, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f5258f = c(context, iVarA, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f5259g = c(context, iVarA, typedArray.getResourceId(6, 0));
        }
        w0VarG.h();
        boolean z16 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = h.a.f80445y;
        if (resourceId2 != -1) {
            w0 w0VarE = w0.e(context, resourceId2, iArr2);
            TypedArray typedArray2 = w0VarE.f5271b;
            if (z16 || !typedArray2.hasValue(14)) {
                z14 = false;
                z15 = false;
            } else {
                z15 = typedArray2.getBoolean(14, false);
                z14 = true;
            }
            j(context, w0VarE);
            string2 = typedArray2.hasValue(15) ? typedArray2.getString(15) : null;
            string = typedArray2.hasValue(13) ? typedArray2.getString(13) : null;
            w0VarE.h();
        } else {
            string = null;
            string2 = null;
            z14 = false;
            z15 = false;
        }
        w0 w0VarG2 = w0.g(context, attributeSet, iArr2, i14, 0);
        TypedArray typedArray3 = w0VarG2.f5271b;
        if (!z16 && typedArray3.hasValue(14)) {
            z15 = typedArray3.getBoolean(14, false);
            z14 = true;
        }
        boolean z17 = z15;
        if (typedArray3.hasValue(15)) {
            string2 = typedArray3.getString(15);
        }
        if (typedArray3.hasValue(13)) {
            string = typedArray3.getString(13);
        }
        if (typedArray3.hasValue(0) && typedArray3.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        j(context, w0VarG2);
        w0VarG2.h();
        if (!z16 && z14) {
            textView.setAllCaps(z17);
        }
        Typeface typeface = this.f5264l;
        if (typeface != null) {
            if (this.f5263k == -1) {
                textView.setTypeface(typeface, this.f5262j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            c.d(textView, string);
        }
        if (string2 != null) {
            b.b(textView, b.a(string2));
        }
        y yVar = this.f5261i;
        Context context2 = yVar.f5285h;
        int[] iArr3 = h.a.f80429i;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i14, 0);
        TextView textView2 = yVar.f5284g;
        androidx.core.view.s0.q(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes, i14, 0);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            yVar.f5278a = typedArrayObtainStyledAttributes.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(4) ? typedArrayObtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(2) ? typedArrayObtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(1) ? typedArrayObtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) <= 0) {
            i15 = 0;
        } else {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            i15 = 0;
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i24 = 0; i24 < length; i24++) {
                    iArr4[i24] = typedArrayObtainTypedArray.getDimensionPixelSize(i24, -1);
                }
                int[] iArrA = y.a(iArr4);
                yVar.f5282e = iArrA;
                int length2 = iArrA.length;
                boolean z18 = length2 > 0;
                yVar.f5283f = z18;
                if (z18) {
                    yVar.f5278a = 1;
                    yVar.f5280c = iArrA[0];
                    yVar.f5281d = iArrA[length2 - 1];
                    yVar.f5279b = -1.0f;
                }
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!yVar.b()) {
            yVar.f5278a = i15;
        } else if (yVar.f5278a == 1) {
            if (!yVar.f5283f) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i19 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i19 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i19, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= 0.0f) {
                    am.j.v(dimension2, "Minimum auto-size text size (", "px) is less or equal to (0px)");
                    return;
                }
                if (dimension3 <= dimension2) {
                    vb.h.s(am.j.l("Maximum auto-size text size (", dimension3, "px) is less or equal to minimum auto-size text size (", dimension2, "px)"));
                    return;
                }
                if (dimension <= 0.0f) {
                    am.j.v(dimension, "The auto-size step granularity (", "px) is less or equal to (0px)");
                    return;
                }
                yVar.f5278a = 1;
                yVar.f5280c = dimension2;
                yVar.f5281d = dimension3;
                yVar.f5279b = dimension;
                yVar.f5283f = i15;
            }
            if (yVar.b() && yVar.f5278a == 1 && (!yVar.f5283f || yVar.f5282e.length == 0)) {
                int iFloor = ((int) Math.floor((yVar.f5281d - yVar.f5280c) / yVar.f5279b)) + 1;
                int[] iArr5 = new int[iFloor];
                for (int i25 = 0; i25 < iFloor; i25++) {
                    iArr5[i25] = Math.round((i25 * yVar.f5279b) + yVar.f5280c);
                }
                yVar.f5282e = y.a(iArr5);
            }
        }
        if (yVar.f5278a != 0) {
            int[] iArr6 = yVar.f5282e;
            if (iArr6.length > 0) {
                if (c.a(textView) != -1.0f) {
                    c.b(textView, Math.round(yVar.f5280c), Math.round(yVar.f5281d), Math.round(yVar.f5279b), 0);
                } else {
                    c.c(textView, iArr6, 0);
                }
            }
        }
        w0 w0VarF = w0.f(context, attributeSet, iArr3);
        TypedArray typedArray4 = w0VarF.f5271b;
        int resourceId3 = typedArray4.getResourceId(8, -1);
        Drawable drawableB = resourceId3 != -1 ? iVarA.b(context, resourceId3) : null;
        int resourceId4 = typedArray4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId4 != -1 ? iVarA.b(context, resourceId4) : null;
        int resourceId5 = typedArray4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId5 != -1 ? iVarA.b(context, resourceId5) : null;
        int resourceId6 = typedArray4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId6 != -1 ? iVarA.b(context, resourceId6) : null;
        int resourceId7 = typedArray4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId7 != -1 ? iVarA.b(context, resourceId7) : null;
        int resourceId8 = typedArray4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId8 != -1 ? iVarA.b(context, resourceId8) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArray4.hasValue(11)) {
            textView.setCompoundDrawableTintList(w0VarF.a(11));
        }
        if (typedArray4.hasValue(12)) {
            i16 = -1;
            textView.setCompoundDrawableTintMode(c0.c(typedArray4.getInt(12, -1), null));
        } else {
            i16 = -1;
        }
        int dimensionPixelSize2 = typedArray4.getDimensionPixelSize(15, i16);
        int dimensionPixelSize3 = typedArray4.getDimensionPixelSize(18, i16);
        if (typedArray4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArray4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i17 = -1;
                dimensionPixelSize = typedArray4.getDimensionPixelSize(19, -1);
                i18 = -1;
            } else {
                int i26 = typedValuePeekValue.data;
                i18 = i26 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i26);
                i17 = -1;
            }
        } else {
            i17 = -1;
            i18 = -1;
            dimensionPixelSize = -1.0f;
        }
        w0VarF.h();
        if (dimensionPixelSize2 != i17) {
            k7.h.d(dimensionPixelSize2);
            textView.setFirstBaselineToTopHeight(dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i17) {
            k7.h.d(dimensionPixelSize3);
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            int i27 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
            if (dimensionPixelSize3 > Math.abs(i27)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize3 - i27);
            }
        }
        if (dimensionPixelSize != -1.0f) {
            if (i18 == -1) {
                p7.e.a(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                p7.e.a.a(textView, i18, dimensionPixelSize);
            } else {
                p7.e.a(textView, Math.round(TypedValue.applyDimension(i18, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(int i14, Context context) {
        String string;
        w0 w0VarE = w0.e(context, i14, h.a.f80445y);
        TypedArray typedArray = w0VarE.f5271b;
        boolean zHasValue = typedArray.hasValue(14);
        TextView textView = this.f5253a;
        if (zHasValue) {
            textView.setAllCaps(typedArray.getBoolean(14, false));
        }
        if (typedArray.hasValue(0) && typedArray.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        j(context, w0VarE);
        if (typedArray.hasValue(13) && (string = typedArray.getString(13)) != null) {
            c.d(textView, string);
        }
        w0VarE.h();
        Typeface typeface = this.f5264l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f5262j);
        }
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f5260h == null) {
            this.f5260h = new u0();
        }
        u0 u0Var = this.f5260h;
        u0Var.f5248a = colorStateList;
        u0Var.f5251d = colorStateList != null;
        this.f5254b = u0Var;
        this.f5255c = u0Var;
        this.f5256d = u0Var;
        this.f5257e = u0Var;
        this.f5258f = u0Var;
        this.f5259g = u0Var;
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f5260h == null) {
            this.f5260h = new u0();
        }
        u0 u0Var = this.f5260h;
        u0Var.f5249b = mode;
        u0Var.f5250c = mode != null;
        this.f5254b = u0Var;
        this.f5255c = u0Var;
        this.f5256d = u0Var;
        this.f5257e = u0Var;
        this.f5258f = u0Var;
        this.f5259g = u0Var;
    }

    public final void j(Context context, w0 w0Var) {
        String string;
        int i14 = this.f5262j;
        TypedArray typedArray = w0Var.f5271b;
        this.f5262j = typedArray.getInt(2, i14);
        int i15 = typedArray.getInt(11, -1);
        this.f5263k = i15;
        if (i15 != -1) {
            this.f5262j &= 2;
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f5265m = false;
                int i16 = typedArray.getInt(1, 1);
                if (i16 == 1) {
                    this.f5264l = Typeface.SANS_SERIF;
                    return;
                } else if (i16 == 2) {
                    this.f5264l = Typeface.SERIF;
                    return;
                } else {
                    if (i16 != 3) {
                        return;
                    }
                    this.f5264l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f5264l = null;
        int i17 = typedArray.hasValue(12) ? 12 : 10;
        int i18 = this.f5263k;
        int i19 = this.f5262j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceD = w0Var.d(i17, this.f5262j, new a(i18, i19, new WeakReference(this.f5253a)));
                if (typefaceD != null) {
                    if (this.f5263k != -1) {
                        this.f5264l = d.a(Typeface.create(typefaceD, 0), this.f5263k, (this.f5262j & 2) != 0);
                    } else {
                        this.f5264l = typefaceD;
                    }
                }
                this.f5265m = this.f5264l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f5264l != null || (string = typedArray.getString(i17)) == null) {
            return;
        }
        if (this.f5263k != -1) {
            this.f5264l = d.a(Typeface.create(string, 0), this.f5263k, (this.f5262j & 2) != 0);
        } else {
            this.f5264l = Typeface.create(string, this.f5262j);
        }
    }
}
