package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public class LottieAnimationView extends AppCompatImageView {
    private static final String t = LottieAnimationView.class.getSimpleName();
    private static final LottieListener<Throwable> u = new a();
    private final LottieListener<LottieComposition> a;
    private final LottieListener<Throwable> b;

    @Nullable
    private LottieListener<Throwable> c;

    @DrawableRes
    private int d;
    private final LottieDrawable e;
    private boolean f;
    private String g;

    @RawRes
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private RenderMode o;
    private final Set<LottieOnCompositionLoadedListener> p;
    private int q;

    @Nullable
    private LottieTask<LottieComposition> r;

    @Nullable
    private LottieComposition s;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public String a;
        public int b;
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
            parcel.writeString(this.a);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeString(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
            this.c = parcel.readFloat();
            this.d = parcel.readInt() == 1;
            this.e = parcel.readString();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
        }
    }

    public class a implements LottieListener<Throwable> {
        @Override // com.airbnb.lottie.LottieListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th) {
            if (!Utils.isNetworkException(th)) {
                throw new IllegalStateException("Unable to parse composition", th);
            }
            Logger.warning("Unable to load composition.", th);
        }
    }

    public class b implements LottieListener<LottieComposition> {
        public b() {
        }

        @Override // com.airbnb.lottie.LottieListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(LottieComposition lottieComposition) {
            LottieAnimationView.this.setComposition(lottieComposition);
        }
    }

    public class c implements LottieListener<Throwable> {
        public c() {
        }

        @Override // com.airbnb.lottie.LottieListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th) {
            if (LottieAnimationView.this.d != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.d);
            }
            (LottieAnimationView.this.c == null ? LottieAnimationView.u : LottieAnimationView.this.c).onResult(th);
        }
    }

    public class d implements Callable<LottieResult<LottieComposition>> {
        public final /* synthetic */ int a;

        public d(int i) {
            this.a = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LottieResult<LottieComposition> call() {
            return LottieAnimationView.this.n ? LottieCompositionFactory.fromRawResSync(LottieAnimationView.this.getContext(), this.a) : LottieCompositionFactory.fromRawResSync(LottieAnimationView.this.getContext(), this.a, null);
        }
    }

    public class e implements Callable<LottieResult<LottieComposition>> {
        public final /* synthetic */ String a;

        public e(String str) {
            this.a = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LottieResult<LottieComposition> call() {
            return LottieAnimationView.this.n ? LottieCompositionFactory.fromAssetSync(LottieAnimationView.this.getContext(), this.a) : LottieCompositionFactory.fromAssetSync(LottieAnimationView.this.getContext(), this.a, null);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class f<T> extends LottieValueCallback<T> {
        public final /* synthetic */ SimpleLottieValueCallback c;

        public f(SimpleLottieValueCallback simpleLottieValueCallback) {
            this.c = simpleLottieValueCallback;
        }

        @Override // com.airbnb.lottie.value.LottieValueCallback
        public T getValue(LottieFrameInfo<T> lottieFrameInfo) {
            return (T) this.c.getValue(lottieFrameInfo);
        }
    }

    public static /* synthetic */ class g {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[RenderMode.values().length];
            a = iArr;
            try {
                iArr[RenderMode.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[RenderMode.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[RenderMode.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.a = new b();
        this.b = new c();
        this.d = 0;
        this.e = new LottieDrawable();
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = true;
        this.o = RenderMode.AUTOMATIC;
        this.p = new HashSet();
        this.q = 0;
        j(null, R.attr.lottieAnimationViewStyle);
    }

    private void e() {
        LottieTask<LottieComposition> lottieTask = this.r;
        if (lottieTask != null) {
            lottieTask.removeListener(this.a);
            this.r.removeFailureListener(this.b);
        }
    }

    private void f() {
        this.s = null;
        this.e.clearComposition();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private void g() {
        LottieComposition lottieComposition;
        int i;
        int i2 = g.a[this.o.ordinal()];
        int i3 = 2;
        if (i2 != 1) {
            if (i2 == 2 || i2 != 3) {
                i3 = 1;
            } else {
                LottieComposition lottieComposition2 = this.s;
                boolean z = false;
                if ((lottieComposition2 == null || !lottieComposition2.hasDashPattern() || Build.VERSION.SDK_INT >= 28) && (((lottieComposition = this.s) == null || lottieComposition.getMaskAndMatteCount() <= 4) && (i = Build.VERSION.SDK_INT) >= 21 && i != 24 && i != 25)) {
                    z = true;
                }
                if (!z) {
                    i3 = 1;
                }
            }
        }
        if (i3 != getLayerType()) {
            setLayerType(i3, null);
        }
    }

    private LottieTask<LottieComposition> h(String str) {
        if (isInEditMode()) {
            return new LottieTask<>(new e(str), true);
        }
        return this.n ? LottieCompositionFactory.fromAsset(getContext(), str) : LottieCompositionFactory.fromAsset(getContext(), str, null);
    }

    private LottieTask<LottieComposition> i(@RawRes int i) {
        if (isInEditMode()) {
            return new LottieTask<>(new d(i), true);
        }
        return this.n ? LottieCompositionFactory.fromRawRes(getContext(), i) : LottieCompositionFactory.fromRawRes(getContext(), i, null);
    }

    private void j(@Nullable AttributeSet attributeSet, @AttrRes int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.LottieAnimationView, i, 0);
        this.n = typedArrayObtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_cacheComposition, true);
        int i2 = R.styleable.LottieAnimationView_lottie_rawRes;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i2);
        int i3 = R.styleable.LottieAnimationView_lottie_fileName;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(i3);
        int i4 = R.styleable.LottieAnimationView_lottie_url;
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(i4);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(i3);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(i4)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(R.styleable.LottieAnimationView_lottie_fallbackRes, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_autoPlay, false)) {
            this.k = true;
            this.m = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_loop, false)) {
            this.e.setRepeatCount(-1);
        }
        int i5 = R.styleable.LottieAnimationView_lottie_repeatMode;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(i5, 1));
        }
        int i6 = R.styleable.LottieAnimationView_lottie_repeatCount;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(i6, -1));
        }
        int i7 = R.styleable.LottieAnimationView_lottie_speed;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(i7, 1.0f));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(R.styleable.LottieAnimationView_lottie_imageAssetsFolder));
        setProgress(typedArrayObtainStyledAttributes.getFloat(R.styleable.LottieAnimationView_lottie_progress, 0.0f));
        enableMergePathsForKitKatAndAbove(typedArrayObtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        int i8 = R.styleable.LottieAnimationView_lottie_colorFilter;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            addValueCallback(new KeyPath("**"), LottieProperty.COLOR_FILTER, (LottieValueCallback<ColorFilter>) new LottieValueCallback(new SimpleColorFilter(AppCompatResources.getColorStateList(getContext(), typedArrayObtainStyledAttributes.getResourceId(i8, -1)).getDefaultColor())));
        }
        int i9 = R.styleable.LottieAnimationView_lottie_scale;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            this.e.setScale(typedArrayObtainStyledAttributes.getFloat(i9, 1.0f));
        }
        int i10 = R.styleable.LottieAnimationView_lottie_renderMode;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            RenderMode renderMode = RenderMode.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i10, renderMode.ordinal());
            if (iOrdinal >= RenderMode.values().length) {
                iOrdinal = renderMode.ordinal();
            }
            setRenderMode(RenderMode.values()[iOrdinal]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        typedArrayObtainStyledAttributes.recycle();
        this.e.n(Boolean.valueOf(Utils.getAnimationScale(getContext()) != 0.0f));
        g();
        this.f = true;
    }

    private void k() {
        boolean zIsAnimating = isAnimating();
        setImageDrawable(null);
        setImageDrawable(this.e);
        if (zIsAnimating) {
            this.e.resumeAnimation();
        }
    }

    private void setCompositionTask(LottieTask<LottieComposition> lottieTask) {
        f();
        e();
        this.r = lottieTask.addListener(this.a).addFailureListener(this.b);
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.e.addAnimatorListener(animatorListener);
    }

    @RequiresApi(api = 19)
    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.e.addAnimatorPauseListener(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.e.addAnimatorUpdateListener(animatorUpdateListener);
    }

    public boolean addLottieOnCompositionLoadedListener(@NonNull LottieOnCompositionLoadedListener lottieOnCompositionLoadedListener) {
        LottieComposition lottieComposition = this.s;
        if (lottieComposition != null) {
            lottieOnCompositionLoadedListener.onCompositionLoaded(lottieComposition);
        }
        return this.p.add(lottieOnCompositionLoadedListener);
    }

    public <T> void addValueCallback(KeyPath keyPath, T t2, LottieValueCallback<T> lottieValueCallback) {
        this.e.addValueCallback(keyPath, t2, lottieValueCallback);
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z) {
        L.beginSection("buildDrawingCache");
        this.q++;
        super.buildDrawingCache(z);
        if (this.q == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(RenderMode.HARDWARE);
        }
        this.q--;
        L.endSection("buildDrawingCache");
    }

    @MainThread
    public void cancelAnimation() {
        this.k = false;
        this.j = false;
        this.i = false;
        this.e.cancelAnimation();
        g();
    }

    public void disableExtraScaleModeInFitXY() {
        this.e.disableExtraScaleModeInFitXY();
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        this.e.enableMergePathsForKitKatAndAbove(z);
    }

    @Nullable
    public LottieComposition getComposition() {
        return this.s;
    }

    public long getDuration() {
        LottieComposition lottieComposition = this.s;
        if (lottieComposition != null) {
            return (long) lottieComposition.getDuration();
        }
        return 0L;
    }

    public int getFrame() {
        return this.e.getFrame();
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.e.getImageAssetsFolder();
    }

    public float getMaxFrame() {
        return this.e.getMaxFrame();
    }

    public float getMinFrame() {
        return this.e.getMinFrame();
    }

    @Nullable
    public PerformanceTracker getPerformanceTracker() {
        return this.e.getPerformanceTracker();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.e.getProgress();
    }

    public int getRepeatCount() {
        return this.e.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.e.getRepeatMode();
    }

    public float getScale() {
        return this.e.getScale();
    }

    public float getSpeed() {
        return this.e.getSpeed();
    }

    public boolean hasMasks() {
        return this.e.hasMasks();
    }

    public boolean hasMatte() {
        return this.e.hasMatte();
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.e;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean isAnimating() {
        return this.e.isAnimating();
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.e.isMergePathsEnabledForKitKatAndAbove();
    }

    @Deprecated
    public void loop(boolean z) {
        this.e.setRepeatCount(z ? -1 : 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && (this.m || this.k)) {
            playAnimation();
            this.m = false;
            this.k = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        if (isAnimating()) {
            cancelAnimation();
            this.k = true;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.a;
        this.g = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.g);
        }
        int i = savedState.b;
        this.h = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(savedState.c);
        if (savedState.d) {
            playAnimation();
        }
        this.e.setImagesAssetsFolder(savedState.e);
        setRepeatMode(savedState.f);
        setRepeatCount(savedState.g);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.g;
        savedState.b = this.h;
        savedState.c = this.e.getProgress();
        savedState.d = this.e.isAnimating() || (!ViewCompat.isAttachedToWindow(this) && this.k);
        savedState.e = this.e.getImageAssetsFolder();
        savedState.f = this.e.getRepeatMode();
        savedState.g = this.e.getRepeatCount();
        return savedState;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        if (this.f) {
            if (!isShown()) {
                if (isAnimating()) {
                    pauseAnimation();
                    this.j = true;
                    return;
                }
                return;
            }
            if (this.j) {
                resumeAnimation();
            } else if (this.i) {
                playAnimation();
            }
            this.j = false;
            this.i = false;
        }
    }

    @MainThread
    public void pauseAnimation() {
        this.m = false;
        this.k = false;
        this.j = false;
        this.i = false;
        this.e.pauseAnimation();
        g();
    }

    @MainThread
    public void playAnimation() {
        if (!isShown()) {
            this.i = true;
        } else {
            this.e.playAnimation();
            g();
        }
    }

    public void removeAllAnimatorListeners() {
        this.e.removeAllAnimatorListeners();
    }

    public void removeAllLottieOnCompositionLoadedListener() {
        this.p.clear();
    }

    public void removeAllUpdateListeners() {
        this.e.removeAllUpdateListeners();
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.e.removeAnimatorListener(animatorListener);
    }

    @RequiresApi(api = 19)
    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.e.removeAnimatorPauseListener(animatorPauseListener);
    }

    public boolean removeLottieOnCompositionLoadedListener(@NonNull LottieOnCompositionLoadedListener lottieOnCompositionLoadedListener) {
        return this.p.remove(lottieOnCompositionLoadedListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.e.removeAnimatorUpdateListener(animatorUpdateListener);
    }

    public List<KeyPath> resolveKeyPath(KeyPath keyPath) {
        return this.e.resolveKeyPath(keyPath);
    }

    @MainThread
    public void resumeAnimation() {
        if (isShown()) {
            this.e.resumeAnimation();
            g();
        } else {
            this.i = false;
            this.j = true;
        }
    }

    public void reverseAnimationSpeed() {
        this.e.reverseAnimationSpeed();
    }

    public void setAnimation(@RawRes int i) {
        this.h = i;
        this.g = null;
        setCompositionTask(i(i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.n ? LottieCompositionFactory.fromUrl(getContext(), str) : LottieCompositionFactory.fromUrl(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.e.setApplyingOpacityToLayersEnabled(z);
    }

    public void setCacheComposition(boolean z) {
        this.n = z;
    }

    public void setComposition(@NonNull LottieComposition lottieComposition) {
        if (L.DBG) {
            Log.v(t, "Set Composition \n" + lottieComposition);
        }
        this.e.setCallback(this);
        this.s = lottieComposition;
        this.l = true;
        boolean composition = this.e.setComposition(lottieComposition);
        this.l = false;
        g();
        if (getDrawable() != this.e || composition) {
            if (!composition) {
                k();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<LottieOnCompositionLoadedListener> it2 = this.p.iterator();
            while (it2.hasNext()) {
                it2.next().onCompositionLoaded(lottieComposition);
            }
        }
    }

    public void setFailureListener(@Nullable LottieListener<Throwable> lottieListener) {
        this.c = lottieListener;
    }

    public void setFallbackResource(@DrawableRes int i) {
        this.d = i;
    }

    public void setFontAssetDelegate(FontAssetDelegate fontAssetDelegate) {
        this.e.setFontAssetDelegate(fontAssetDelegate);
    }

    public void setFrame(int i) {
        this.e.setFrame(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.e.setIgnoreDisabledSystemAnimations(z);
    }

    public void setImageAssetDelegate(ImageAssetDelegate imageAssetDelegate) {
        this.e.setImageAssetDelegate(imageAssetDelegate);
    }

    public void setImageAssetsFolder(String str) {
        this.e.setImagesAssetsFolder(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        e();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        e();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        e();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.e.setMaxFrame(i);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.e.setMaxProgress(f2);
    }

    public void setMinAndMaxFrame(String str) {
        this.e.setMinAndMaxFrame(str);
    }

    public void setMinAndMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f2, @FloatRange(from = 0.0d, to = 1.0d) float f3) {
        this.e.setMinAndMaxProgress(f2, f3);
    }

    public void setMinFrame(int i) {
        this.e.setMinFrame(i);
    }

    public void setMinProgress(float f2) {
        this.e.setMinProgress(f2);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.e.setOutlineMasksAndMattes(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.e.setPerformanceTrackingEnabled(z);
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.e.setProgress(f2);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.o = renderMode;
        g();
    }

    public void setRepeatCount(int i) {
        this.e.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.e.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.e.setSafeMode(z);
    }

    public void setScale(float f2) {
        this.e.setScale(f2);
        if (getDrawable() == this.e) {
            k();
        }
    }

    public void setSpeed(float f2) {
        this.e.setSpeed(f2);
    }

    public void setTextDelegate(TextDelegate textDelegate) {
        this.e.setTextDelegate(textDelegate);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        LottieDrawable lottieDrawable;
        if (!this.l && drawable == (lottieDrawable = this.e) && lottieDrawable.isAnimating()) {
            pauseAnimation();
        } else if (!this.l && (drawable instanceof LottieDrawable)) {
            LottieDrawable lottieDrawable2 = (LottieDrawable) drawable;
            if (lottieDrawable2.isAnimating()) {
                lottieDrawable2.pauseAnimation();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    @Nullable
    public Bitmap updateBitmap(String str, @Nullable Bitmap bitmap) {
        return this.e.updateBitmap(str, bitmap);
    }

    public <T> void addValueCallback(KeyPath keyPath, T t2, SimpleLottieValueCallback<T> simpleLottieValueCallback) {
        this.e.addValueCallback(keyPath, t2, new f(simpleLottieValueCallback));
    }

    public void setAnimationFromJson(String str, @Nullable String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.e.setMaxFrame(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.e.setMinAndMaxFrame(str, str2, z);
    }

    public void setMinFrame(String str) {
        this.e.setMinFrame(str);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.e.setMinAndMaxFrame(i, i2);
    }

    public void setAnimation(String str) {
        this.g = str;
        this.h = 0;
        setCompositionTask(h(str));
    }

    public void setAnimationFromUrl(String str, @Nullable String str2) {
        setCompositionTask(LottieCompositionFactory.fromUrl(getContext(), str, str2));
    }

    public void setAnimation(InputStream inputStream, @Nullable String str) {
        setCompositionTask(LottieCompositionFactory.fromJsonInputStream(inputStream, str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new b();
        this.b = new c();
        this.d = 0;
        this.e = new LottieDrawable();
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = true;
        this.o = RenderMode.AUTOMATIC;
        this.p = new HashSet();
        this.q = 0;
        j(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new b();
        this.b = new c();
        this.d = 0;
        this.e = new LottieDrawable();
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = true;
        this.o = RenderMode.AUTOMATIC;
        this.p = new HashSet();
        this.q = 0;
        j(attributeSet, i);
    }
}
