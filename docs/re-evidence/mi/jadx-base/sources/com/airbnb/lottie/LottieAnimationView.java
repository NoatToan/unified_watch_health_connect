package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.emq;
import defpackage.f0e;
import defpackage.jte;
import defpackage.kcm;
import defpackage.lse;
import defpackage.nte;
import defpackage.of1;
import defpackage.oii;
import defpackage.r7p;
import defpackage.rpe;
import defpackage.rte;
import defpackage.s2d;
import defpackage.ste;
import defpackage.tqh;
import defpackage.tte;
import defpackage.tz9;
import defpackage.use;
import defpackage.v3j;
import defpackage.vte;
import defpackage.w1e;
import defpackage.yte;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final nte<Throwable> o = new nte() { // from class: jse
        @Override // defpackage.nte
        public final void onResult(Object obj) {
            LottieAnimationView.u((Throwable) obj);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nte<lse> f5664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nte<Throwable> f5665b;
    public nte<Throwable> c;
    public int d;
    public final jte e;
    public String f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Set<b> f5666k;
    public final Set<rte> l;
    public vte<lse> m;
    public lse n;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f5667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5668b;
        public float c;
        public boolean d;
        public String e;
        public int f;
        public int g;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f5667a);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeString(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f5667a = parcel.readString();
            this.c = parcel.readFloat();
            this.d = parcel.readInt() == 1;
            this.e = parcel.readString();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
        }
    }

    public class a implements nte<Throwable> {
        public a() {
        }

        @Override // defpackage.nte
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th) {
            if (LottieAnimationView.this.d != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.d);
            }
            (LottieAnimationView.this.c == null ? LottieAnimationView.o : LottieAnimationView.this.c).onResult(th);
        }
    }

    public enum b {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f5664a = new nte() { // from class: hse
            @Override // defpackage.nte
            public final void onResult(Object obj) {
                this.f20404a.setComposition((lse) obj);
            }
        };
        this.f5665b = new a();
        this.d = 0;
        this.e = new jte();
        this.h = false;
        this.i = false;
        this.j = true;
        this.f5666k = new HashSet();
        this.l = new HashSet();
        q(null, oii.f29201a);
    }

    private void setCompositionTask(vte<lse> vteVar) {
        this.f5666k.add(b.SET_ANIMATION);
        m();
        l();
        this.m = vteVar.d(this.f5664a).c(this.f5665b);
    }

    public static /* synthetic */ void u(Throwable th) {
        if (!emq.k(th)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        rpe.d("Unable to load composition.", th);
    }

    public void A(String str, String str2) {
        z(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void B(String str, String str2) {
        setCompositionTask(use.x(getContext(), str, str2));
    }

    public final void C() {
        boolean zR = r();
        setImageDrawable(null);
        setImageDrawable(this.e);
        if (zR) {
            this.e.v0();
        }
    }

    public final void D(@FloatRange(from = 0.0d, to = 1.0d) float f, boolean z) {
        if (z) {
            this.f5666k.add(b.SET_PROGRESS);
        }
        this.e.S0(f);
    }

    public boolean getClipToCompositionBounds() {
        return this.e.F();
    }

    public lse getComposition() {
        return this.n;
    }

    public long getDuration() {
        lse lseVar = this.n;
        if (lseVar != null) {
            return (long) lseVar.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.e.J();
    }

    public String getImageAssetsFolder() {
        return this.e.L();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.e.N();
    }

    public float getMaxFrame() {
        return this.e.O();
    }

    public float getMinFrame() {
        return this.e.P();
    }

    public tqh getPerformanceTracker() {
        return this.e.Q();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.e.R();
    }

    public RenderMode getRenderMode() {
        return this.e.S();
    }

    public int getRepeatCount() {
        return this.e.T();
    }

    public int getRepeatMode() {
        return this.e.U();
    }

    public float getSpeed() {
        return this.e.V();
    }

    public void i(Animator.AnimatorListener animatorListener) {
        this.e.p(animatorListener);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof jte) && ((jte) drawable).S() == RenderMode.SOFTWARE) {
            this.e.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        jte jteVar = this.e;
        if (drawable2 == jteVar) {
            super.invalidateDrawable(jteVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public <T> void j(f0e f0eVar, T t, yte<T> yteVar) {
        this.e.q(f0eVar, t, yteVar);
    }

    public void k() {
        this.f5666k.add(b.PLAY_OPTION);
        this.e.t();
    }

    public final void l() {
        vte<lse> vteVar = this.m;
        if (vteVar != null) {
            vteVar.j(this.f5664a);
            this.m.i(this.f5665b);
        }
    }

    public final void m() {
        this.n = null;
        this.e.u();
    }

    public void n(boolean z) {
        this.e.z(z);
    }

    public final vte<lse> o(final String str) {
        if (isInEditMode()) {
            return new vte<>(new Callable() { // from class: ise
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f22045a.s(str);
                }
            }, true);
        }
        return this.j ? use.j(getContext(), str) : use.k(getContext(), str, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.i) {
            return;
        }
        this.e.q0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f = savedState.f5667a;
        Set<b> set = this.f5666k;
        b bVar = b.SET_ANIMATION;
        if (!set.contains(bVar) && !TextUtils.isEmpty(this.f)) {
            setAnimation(this.f);
        }
        this.g = savedState.f5668b;
        if (!this.f5666k.contains(bVar) && (i = this.g) != 0) {
            setAnimation(i);
        }
        if (!this.f5666k.contains(b.SET_PROGRESS)) {
            D(savedState.c, false);
        }
        if (!this.f5666k.contains(b.PLAY_OPTION) && savedState.d) {
            w();
        }
        if (!this.f5666k.contains(b.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.e);
        }
        if (!this.f5666k.contains(b.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.f);
        }
        if (this.f5666k.contains(b.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.g);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5667a = this.f;
        savedState.f5668b = this.g;
        savedState.c = this.e.R();
        savedState.d = this.e.a0();
        savedState.e = this.e.L();
        savedState.f = this.e.U();
        savedState.g = this.e.T();
        return savedState;
    }

    public final vte<lse> p(final int i) {
        if (isInEditMode()) {
            return new vte<>(new Callable() { // from class: kse
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f24260a.t(i);
                }
            }, true);
        }
        return this.j ? use.s(getContext(), i) : use.t(getContext(), i, null);
    }

    public final void q(AttributeSet attributeSet, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, v3j.C, i, 0);
        this.j = typedArrayObtainStyledAttributes.getBoolean(v3j.E, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(v3j.P);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(v3j.K);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(v3j.U);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(v3j.P, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(v3j.K);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(v3j.U)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(v3j.J, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(v3j.D, false)) {
            this.i = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(v3j.N, false)) {
            this.e.U0(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(v3j.S)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(v3j.S, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(v3j.R)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(v3j.R, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(v3j.T)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(v3j.T, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(v3j.F)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(v3j.F, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(v3j.H)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(v3j.H));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(v3j.M));
        D(typedArrayObtainStyledAttributes.getFloat(v3j.O, 0.0f), typedArrayObtainStyledAttributes.hasValue(v3j.O));
        n(typedArrayObtainStyledAttributes.getBoolean(v3j.I, false));
        if (typedArrayObtainStyledAttributes.hasValue(v3j.G)) {
            j(new f0e("**"), ste.K, new yte(new kcm(of1.a(getContext(), typedArrayObtainStyledAttributes.getResourceId(v3j.G, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(v3j.Q)) {
            int i2 = v3j.Q;
            RenderMode renderMode = RenderMode.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i2, renderMode.ordinal());
            if (iOrdinal >= RenderMode.values().length) {
                iOrdinal = renderMode.ordinal();
            }
            setRenderMode(RenderMode.values()[iOrdinal]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(v3j.L, false));
        if (typedArrayObtainStyledAttributes.hasValue(v3j.V)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(v3j.V, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.e.Y0(Boolean.valueOf(emq.f(getContext()) != 0.0f));
    }

    public boolean r() {
        return this.e.Z();
    }

    public final /* synthetic */ tte s(String str) throws Exception {
        return this.j ? use.l(getContext(), str) : use.m(getContext(), str, null);
    }

    public void setAnimation(int i) {
        this.g = i;
        this.f = null;
        setCompositionTask(p(i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        A(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.j ? use.w(getContext(), str) : use.x(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.e.x0(z);
    }

    public void setCacheComposition(boolean z) {
        this.j = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        this.e.y0(z);
    }

    public void setComposition(lse lseVar) {
        if (w1e.f37439a) {
            StringBuilder sb = new StringBuilder();
            sb.append("Set Composition \n");
            sb.append(lseVar);
        }
        this.e.setCallback(this);
        this.n = lseVar;
        this.h = true;
        boolean zZ0 = this.e.z0(lseVar);
        this.h = false;
        if (getDrawable() != this.e || zZ0) {
            if (!zZ0) {
                C();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<rte> it = this.l.iterator();
            while (it.hasNext()) {
                it.next().a(lseVar);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.e.A0(str);
    }

    public void setFailureListener(nte<Throwable> nteVar) {
        this.c = nteVar;
    }

    public void setFallbackResource(int i) {
        this.d = i;
    }

    public void setFontAssetDelegate(tz9 tz9Var) {
        this.e.B0(tz9Var);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.e.C0(map);
    }

    public void setFrame(int i) {
        this.e.D0(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.e.E0(z);
    }

    public void setImageAssetDelegate(s2d s2dVar) {
        this.e.F0(s2dVar);
    }

    public void setImageAssetsFolder(String str) {
        this.e.G0(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        l();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        l();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        l();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.e.H0(z);
    }

    public void setMaxFrame(int i) {
        this.e.I0(i);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.e.K0(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.e.M0(str);
    }

    public void setMinFrame(int i) {
        this.e.N0(i);
    }

    public void setMinProgress(float f) {
        this.e.P0(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.e.Q0(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.e.R0(z);
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        D(f, true);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.e.T0(renderMode);
    }

    public void setRepeatCount(int i) {
        this.f5666k.add(b.SET_REPEAT_COUNT);
        this.e.U0(i);
    }

    public void setRepeatMode(int i) {
        this.f5666k.add(b.SET_REPEAT_MODE);
        this.e.V0(i);
    }

    public void setSafeMode(boolean z) {
        this.e.W0(z);
    }

    public void setSpeed(float f) {
        this.e.X0(f);
    }

    public void setTextDelegate(r7p r7pVar) {
        this.e.Z0(r7pVar);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.e.a1(z);
    }

    public final /* synthetic */ tte t(int i) throws Exception {
        return this.j ? use.u(getContext(), i) : use.v(getContext(), i, null);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        jte jteVar;
        if (!this.h && drawable == (jteVar = this.e) && jteVar.Z()) {
            v();
        } else if (!this.h && (drawable instanceof jte)) {
            jte jteVar2 = (jte) drawable;
            if (jteVar2.Z()) {
                jteVar2.p0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void v() {
        this.i = false;
        this.e.p0();
    }

    public void w() {
        this.f5666k.add(b.PLAY_OPTION);
        this.e.q0();
    }

    public void x() {
        this.e.r0();
    }

    public void y() {
        this.e.s0();
    }

    public void z(InputStream inputStream, String str) {
        setCompositionTask(use.n(inputStream, str));
    }

    public void setMaxFrame(String str) {
        this.e.J0(str);
    }

    public void setMinFrame(String str) {
        this.e.O0(str);
    }

    public void setAnimation(String str) {
        this.f = str;
        this.g = 0;
        setCompositionTask(o(str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5664a = new nte() { // from class: hse
            @Override // defpackage.nte
            public final void onResult(Object obj) {
                this.f20404a.setComposition((lse) obj);
            }
        };
        this.f5665b = new a();
        this.d = 0;
        this.e = new jte();
        this.h = false;
        this.i = false;
        this.j = true;
        this.f5666k = new HashSet();
        this.l = new HashSet();
        q(attributeSet, oii.f29201a);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5664a = new nte() { // from class: hse
            @Override // defpackage.nte
            public final void onResult(Object obj) {
                this.f20404a.setComposition((lse) obj);
            }
        };
        this.f5665b = new a();
        this.d = 0;
        this.e = new jte();
        this.h = false;
        this.i = false;
        this.j = true;
        this.f5666k = new HashSet();
        this.l = new HashSet();
        q(attributeSet, i);
    }
}
