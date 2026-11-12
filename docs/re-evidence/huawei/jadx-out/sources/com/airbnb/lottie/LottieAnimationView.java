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
import android.util.Log;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import defpackage.ct;
import defpackage.cv;
import defpackage.cx;
import defpackage.da;
import defpackage.ec;
import defpackage.ee;
import defpackage.eg;
import defpackage.ei;
import defpackage.fo;
import defpackage.iy;
import defpackage.je;
import defpackage.jf;
import defpackage.ji;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes21.dex */
public class LottieAnimationView extends AppCompatImageView {
    private static final LottieListener<Throwable> d = new LottieListener() { // from class: cz
        @Override // com.airbnb.lottie.LottieListener
        public final void onResult(Object obj) {
            LottieAnimationView.d((Throwable) obj);
        }
    };
    private static final String e = "LottieAnimationView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f1913c;
    private boolean f;
    private LottieListener<Throwable> g;
    private boolean h;
    private ec<cx> i;
    private int j;
    private final LottieListener<Throwable> k;
    private final LottieDrawable l;
    private final LottieListener<cx> m;
    private final Set<UserActionTaken> n;
    private final Set<LottieOnCompositionLoadedListener> o;

    enum UserActionTaken {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public static /* synthetic */ void d(Throwable th) {
        if (je.a(th)) {
            iy.b("Unable to load composition.", th);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th);
    }

    static class e implements LottieListener<cx> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<LottieAnimationView> f1916b;

        public e(LottieAnimationView lottieAnimationView) {
            this.f1916b = new WeakReference<>(lottieAnimationView);
        }

        @Override // com.airbnb.lottie.LottieListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(cx cxVar) {
            LottieAnimationView lottieAnimationView = this.f1916b.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(cxVar);
        }
    }

    static class d implements LottieListener<Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<LottieAnimationView> f1915a;

        public d(LottieAnimationView lottieAnimationView) {
            this.f1915a = new WeakReference<>(lottieAnimationView);
        }

        @Override // com.airbnb.lottie.LottieListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th) {
            LottieAnimationView lottieAnimationView = this.f1915a.get();
            if (lottieAnimationView == null) {
                return;
            }
            if (lottieAnimationView.j != 0) {
                lottieAnimationView.setImageResource(lottieAnimationView.j);
            }
            (lottieAnimationView.g == null ? LottieAnimationView.d : lottieAnimationView.g).onResult(th);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.m = new e(this);
        this.k = new d(this);
        this.j = 0;
        this.l = new LottieDrawable();
        this.h = false;
        this.f1912b = false;
        this.f = true;
        this.n = new HashSet();
        this.o = new HashSet();
        b(null, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = new e(this);
        this.k = new d(this);
        this.j = 0;
        this.l = new LottieDrawable();
        this.h = false;
        this.f1912b = false;
        this.f = true;
        this.n = new HashSet();
        this.o = new HashSet();
        b(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = new e(this);
        this.k = new d(this);
        this.j = 0;
        this.l = new LottieDrawable();
        this.h = false;
        this.f1912b = false;
        this.f = true;
        this.n = new HashSet();
        this.o = new HashSet();
        b(attributeSet, i);
    }

    private void b(AttributeSet attributeSet, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.LottieAnimationView, i, 0);
        this.f = typedArrayObtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_cacheComposition, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_rawRes);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_fileName);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_url);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.LottieAnimationView_lottie_rawRes, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.LottieAnimationView_lottie_fileName);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(R.styleable.LottieAnimationView_lottie_url)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(R.styleable.LottieAnimationView_lottie_fallbackRes, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_autoPlay, false)) {
            this.f1912b = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_loop, false)) {
            this.l.b(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_repeatMode)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(R.styleable.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_repeatCount)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(R.styleable.LottieAnimationView_lottie_repeatCount, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_speed)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(R.styleable.LottieAnimationView_lottie_speed, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_clipToCompositionBounds)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_clipToCompositionBounds, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_clipTextToBoundingBox)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_clipTextToBoundingBox, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_defaultFontFileExtension)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(R.styleable.LottieAnimationView_lottie_defaultFontFileExtension));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(R.styleable.LottieAnimationView_lottie_imageAssetsFolder));
        c(typedArrayObtainStyledAttributes.getFloat(R.styleable.LottieAnimationView_lottie_progress, 0.0f), typedArrayObtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_progress));
        a(typedArrayObtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_colorFilter)) {
            b(new fo("**"), LottieProperty.COLOR_FILTER, new jf(new eg(AppCompatResources.getColorStateList(getContext(), typedArrayObtainStyledAttributes.getResourceId(R.styleable.LottieAnimationView_lottie_colorFilter, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_renderMode)) {
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(R.styleable.LottieAnimationView_lottie_renderMode, RenderMode.AUTOMATIC.ordinal());
            if (iOrdinal >= RenderMode.values().length) {
                iOrdinal = RenderMode.AUTOMATIC.ordinal();
            }
            setRenderMode(RenderMode.values()[iOrdinal]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_asyncUpdates)) {
            int iOrdinal2 = typedArrayObtainStyledAttributes.getInt(R.styleable.LottieAnimationView_lottie_asyncUpdates, AsyncUpdates.AUTOMATIC.ordinal());
            if (iOrdinal2 >= RenderMode.values().length) {
                iOrdinal2 = AsyncUpdates.AUTOMATIC.ordinal();
            }
            setAsyncUpdates(AsyncUpdates.values()[iOrdinal2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_useCompositionFrameRate)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_useCompositionFrameRate, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.l.b(Boolean.valueOf(je.e(getContext()) != 0.0f));
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.f1911a = 0;
        this.f1913c = null;
        j();
        super.setImageResource(i);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f1911a = 0;
        this.f1913c = null;
        j();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f1911a = 0;
        this.f1913c = null;
        j();
        super.setImageBitmap(bitmap);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        LottieDrawable lottieDrawable;
        if (!this.h && drawable == (lottieDrawable = this.l) && lottieDrawable.u()) {
            a();
        } else if (!this.h && (drawable instanceof LottieDrawable)) {
            LottieDrawable lottieDrawable2 = (LottieDrawable) drawable;
            if (lottieDrawable2.u()) {
                lottieDrawable2.ab();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof LottieDrawable) && ((LottieDrawable) drawable).s() == RenderMode.SOFTWARE) {
            this.l.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.l;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.animationName = this.f1913c;
        savedState.animationResId = this.f1911a;
        savedState.progress = this.l.t();
        savedState.isAnimating = this.l.w();
        savedState.imageAssetsFolder = this.l.k();
        savedState.repeatMode = this.l.p();
        savedState.repeatCount = this.l.q();
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f1913c = savedState.animationName;
        if (!this.n.contains(UserActionTaken.SET_ANIMATION) && !TextUtils.isEmpty(this.f1913c)) {
            setAnimation(this.f1913c);
        }
        this.f1911a = savedState.animationResId;
        if (!this.n.contains(UserActionTaken.SET_ANIMATION) && (i = this.f1911a) != 0) {
            setAnimation(i);
        }
        if (!this.n.contains(UserActionTaken.SET_PROGRESS)) {
            c(savedState.progress, false);
        }
        if (!this.n.contains(UserActionTaken.PLAY_OPTION) && savedState.isAnimating) {
            c();
        }
        if (!this.n.contains(UserActionTaken.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.imageAssetsFolder);
        }
        if (!this.n.contains(UserActionTaken.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.repeatMode);
        }
        if (this.n.contains(UserActionTaken.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.repeatCount);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f1912b) {
            return;
        }
        this.l.aa();
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.l.e(z);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.l.h(z);
    }

    public void a(boolean z) {
        this.l.a(z);
    }

    public void setClipToCompositionBounds(boolean z) {
        this.l.c(z);
    }

    public boolean getClipToCompositionBounds() {
        return this.l.f();
    }

    public void setCacheComposition(boolean z) {
        this.f = z;
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.l.g(z);
    }

    public void setAnimation(int i) {
        this.f1911a = i;
        this.f1913c = null;
        setCompositionTask(d(i));
    }

    private ec<cx> d(final int i) {
        if (isInEditMode()) {
            return new ec<>(new Callable() { // from class: cw
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.e.e(i);
                }
            }, true);
        }
        return this.f ? da.b(getContext(), i) : da.c(getContext(), i, (String) null);
    }

    public /* synthetic */ ee e(int i) throws Exception {
        return this.f ? da.e(getContext(), i) : da.b(getContext(), i, (String) null);
    }

    public void setAnimation(String str) {
        this.f1913c = str;
        this.f1911a = 0;
        setCompositionTask(a(str));
    }

    private ec<cx> a(final String str) {
        if (isInEditMode()) {
            return new ec<>(new Callable() { // from class: cy
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.e.c(str);
                }
            }, true);
        }
        return this.f ? da.d(getContext(), str) : da.a(getContext(), str, (String) null);
    }

    public /* synthetic */ ee c(String str) throws Exception {
        return this.f ? da.b(getContext(), str) : da.b(getContext(), str, (String) null);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimation(InputStream inputStream, String str) {
        setCompositionTask(da.d(inputStream, str));
    }

    public void setAnimation(ZipInputStream zipInputStream, String str) {
        setCompositionTask(da.d(zipInputStream, str));
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f ? da.c(getContext(), str) : da.d(getContext(), str, (String) null));
    }

    public void setAnimationFromUrl(String str, String str2) {
        setCompositionTask(da.d(getContext(), str, str2));
    }

    public void setFailureListener(LottieListener<Throwable> lottieListener) {
        this.g = lottieListener;
    }

    public void setFallbackResource(int i) {
        this.j = i;
    }

    private void setCompositionTask(ec<cx> ecVar) {
        ee<cx> eeVarA = ecVar.a();
        LottieDrawable lottieDrawable = this.l;
        if (eeVarA != null && lottieDrawable == getDrawable() && lottieDrawable.j() == eeVarA.c()) {
            return;
        }
        this.n.add(UserActionTaken.SET_ANIMATION);
        h();
        j();
        this.i = ecVar.b(this.m).e(this.k);
    }

    private void j() {
        ec<cx> ecVar = this.i;
        if (ecVar != null) {
            ecVar.c(this.m);
            this.i.d(this.k);
        }
    }

    public void setComposition(cx cxVar) {
        if (cv.f31374b) {
            Log.v(e, "Set Composition \n" + cxVar);
        }
        this.l.setCallback(this);
        this.h = true;
        boolean zA = this.l.a(cxVar);
        if (this.f1912b) {
            this.l.aa();
        }
        this.h = false;
        if (getDrawable() != this.l || zA) {
            if (!zA) {
                f();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<LottieOnCompositionLoadedListener> it = this.o.iterator();
            while (it.hasNext()) {
                it.next().onCompositionLoaded(cxVar);
            }
        }
    }

    public cx getComposition() {
        Drawable drawable = getDrawable();
        LottieDrawable lottieDrawable = this.l;
        if (drawable == lottieDrawable) {
            return lottieDrawable.j();
        }
        return null;
    }

    public void c() {
        this.n.add(UserActionTaken.PLAY_OPTION);
        this.l.aa();
    }

    public void setMinFrame(int i) {
        this.l.c(i);
    }

    public float getMinFrame() {
        return this.l.n();
    }

    public void setMinProgress(float f) {
        this.l.c(f);
    }

    public void setMaxFrame(int i) {
        this.l.a(i);
    }

    public float getMaxFrame() {
        return this.l.l();
    }

    public void setMaxProgress(float f) {
        this.l.d(f);
    }

    public void setMinFrame(String str) {
        this.l.j(str);
    }

    public void setMaxFrame(String str) {
        this.l.b(str);
    }

    public void setMinAndMaxFrame(String str) {
        this.l.f(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.l.c(str, str2, z);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.l.c(i, i2);
    }

    public void setMinAndMaxProgress(float f, float f2) {
        this.l.c(f, f2);
    }

    public void setSpeed(float f) {
        this.l.a(f);
    }

    public float getSpeed() {
        return this.l.r();
    }

    public void b(Animator.AnimatorListener animatorListener) {
        this.l.e(animatorListener);
    }

    @Deprecated
    public void c(boolean z) {
        this.l.b(z ? -1 : 0);
    }

    public void setRepeatMode(int i) {
        this.n.add(UserActionTaken.SET_REPEAT_MODE);
        this.l.d(i);
    }

    public int getRepeatMode() {
        return this.l.p();
    }

    public void setRepeatCount(int i) {
        this.n.add(UserActionTaken.SET_REPEAT_COUNT);
        this.l.b(i);
    }

    public int getRepeatCount() {
        return this.l.q();
    }

    public boolean d() {
        return this.l.u();
    }

    public void setImageAssetsFolder(String str) {
        this.l.c(str);
    }

    public String getImageAssetsFolder() {
        return this.l.k();
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.l.j(z);
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.l.m();
    }

    public void setImageAssetDelegate(ImageAssetDelegate imageAssetDelegate) {
        this.l.b(imageAssetDelegate);
    }

    public void setDefaultFontFileExtension(String str) {
        this.l.e(str);
    }

    public void setFontAssetDelegate(ct ctVar) {
        this.l.a(ctVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.l.c(map);
    }

    public void setTextDelegate(ei eiVar) {
        this.l.d(eiVar);
    }

    public <T> void b(fo foVar, T t, jf<T> jfVar) {
        this.l.c(foVar, t, jfVar);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.airbnb.lottie.LottieAnimationView$5, reason: invalid class name */
    class AnonymousClass5<T> extends jf<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SimpleLottieValueCallback f1914c;

        @Override // defpackage.jf
        public T getValue(ji<T> jiVar) {
            return (T) this.f1914c.getValue(jiVar);
        }
    }

    public void b() {
        this.f1912b = false;
        this.n.add(UserActionTaken.PLAY_OPTION);
        this.l.a();
    }

    public void a() {
        this.f1912b = false;
        this.l.ab();
    }

    public void setFrame(int i) {
        this.l.e(i);
    }

    public int getFrame() {
        return this.l.i();
    }

    public void setProgress(float f) {
        c(f, true);
    }

    private void c(float f, boolean z) {
        if (z) {
            this.n.add(UserActionTaken.SET_PROGRESS);
        }
        this.l.e(f);
    }

    public float getProgress() {
        return this.l.t();
    }

    public long getDuration() {
        cx composition = getComposition();
        if (composition != null) {
            return (long) composition.e();
        }
        return 0L;
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.l.i(z);
    }

    public PerformanceTracker getPerformanceTracker() {
        return this.l.o();
    }

    private void h() {
        this.l.d();
    }

    public void setSafeMode(boolean z) {
        this.l.f(z);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.l.d(renderMode);
    }

    public RenderMode getRenderMode() {
        return this.l.s();
    }

    public AsyncUpdates getAsyncUpdates() {
        return this.l.b();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.l.h();
    }

    public void setAsyncUpdates(AsyncUpdates asyncUpdates) {
        this.l.e(asyncUpdates);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.l.d(z);
    }

    public boolean getClipTextToBoundingBox() {
        return this.l.g();
    }

    public void setClipTextToBoundingBox(boolean z) {
        this.l.b(z);
    }

    private void f() {
        boolean zD = d();
        setImageDrawable(null);
        setImageDrawable(this.l);
        if (zD) {
            this.l.z();
        }
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.airbnb.lottie.LottieAnimationView.SavedState.2
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        String animationName;
        int animationResId;
        String imageAssetsFolder;
        boolean isAnimating;
        float progress;
        int repeatCount;
        int repeatMode;

        /* synthetic */ SavedState(Parcel parcel, AnonymousClass5 anonymousClass5) {
            this(parcel);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.animationName = parcel.readString();
            this.progress = parcel.readFloat();
            this.isAnimating = parcel.readInt() == 1;
            this.imageAssetsFolder = parcel.readString();
            this.repeatMode = parcel.readInt();
            this.repeatCount = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.animationName);
            parcel.writeFloat(this.progress);
            parcel.writeInt(this.isAnimating ? 1 : 0);
            parcel.writeString(this.imageAssetsFolder);
            parcel.writeInt(this.repeatMode);
            parcel.writeInt(this.repeatCount);
        }
    }
}
