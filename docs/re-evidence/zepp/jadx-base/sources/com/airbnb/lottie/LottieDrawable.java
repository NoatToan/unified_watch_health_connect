package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.manager.FontAssetManager;
import com.airbnb.lottie.manager.ImageAssetManager;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.layer.CompositionLayer;
import com.airbnb.lottie.parser.LayerParser;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.LottieValueAnimator;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class LottieDrawable extends Drawable implements Drawable.Callback, Animatable {
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    private final Matrix a = new Matrix();
    private LottieComposition b;
    private final LottieValueAnimator c;
    private float d;
    private boolean e;
    private boolean f;
    private boolean g;
    private final ArrayList<r> h;
    private final ValueAnimator.AnimatorUpdateListener i;

    @Nullable
    private ImageAssetManager j;

    @Nullable
    private String k;

    @Nullable
    private ImageAssetDelegate l;

    @Nullable
    private FontAssetManager m;

    @Nullable
    public FontAssetDelegate n;

    @Nullable
    public TextDelegate o;
    private boolean p;

    @Nullable
    private CompositionLayer q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;

    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    public class a implements r {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // com.airbnb.lottie.LottieDrawable.r
        public void a(LottieComposition lottieComposition) {
            LottieDrawable.this.setMinAndMaxFrame(this.a);
        }
    }

    public class b implements r {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;

        public b(String str, String str2, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        @Override // com.airbnb.lottie.LottieDrawable.r
        public void a(LottieComposition lottieComposition) {
            LottieDrawable.this.setMinAndMaxFrame(this.a, this.b, this.c);
        }
    }

    public class c implements r {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // com.airbnb.lottie.LottieDrawable.r
        public void a(LottieComposition lottieComposition) {
            LottieDrawable.this.setMinAndMaxFrame(this.a, this.b);
        }
    }

    public class d implements r {
        public final /* synthetic */ float a;
        public final /* synthetic */ float b;

        public d(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        @Override // com.airbnb.lottie.LottieDrawable.r
        public void a(LottieComposition lottieComposition) {
            LottieDrawable.this.setMinAndMaxProgress(this.a, this.b);
        }
    }

    public class e implements r {
        public final /* synthetic */ int a;

        public e(int i) {
            this.a = i;
        }

        @Override // com.airbnb.lottie.LottieDrawable.r
        public void a(LottieComposition lottieComposition) {
            LottieDrawable.this.setFrame(this.a);
        }
    }

    public class f implements r {
        public final /* synthetic */ float a;

        public f(float f) {
            this.a = f;
        }

        @Override // com.airbnb.lottie.LottieDrawable.r
        public void a(LottieComposition lottieComposition) {
            LottieDrawable.this.setProgress(this.a);
        }
    }

    public class g implements r {
        public final /* synthetic */ KeyPath a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ LottieValueCallback c;

        public g(KeyPath keyPath, Object obj, LottieValueCallback lottieValueCallback) {
            this.a = keyPath;
            this.b = obj;
            this.c = lottieValueCallback;
        }

        @Override // com.airbnb.lottie.LottieDrawable.r
        public void a(LottieComposition lottieComposition) {
            LottieDrawable.this.addValueCallback(this.a, this.b, (LottieValueCallback<Object>) this.c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class h<T> extends LottieValueCallback<T> {
        public final /* synthetic */ SimpleLottieValueCallback c;

        public h(SimpleLottieValueCallback simpleLottieValueCallback) {
            this.c = simpleLottieValueCallback;
        }

        @Override // com.airbnb.lottie.value.LottieValueCallback
        public T getValue(LottieFrameInfo<T> lottieFrameInfo) {
            return (T) this.c.getValue(lottieFrameInfo);
        }
    }

    public class i implements ValueAnimator.AnimatorUpdateListener {
        public i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (LottieDrawable.this.q != null) {
                LottieDrawable.this.q.setProgress(LottieDrawable.this.c.getAnimatedValueAbsolute());
            }
        }
    }

    public class j implements r {
        public j() {
        }

        @Override // com.airbnb.lottie.LottieDrawable.r
        public void a(LottieComposition lottieComposition) {
            LottieDrawable.this.playAnimation();
        }
    }

    public class k implements r {
        public k() {
        }

        @Override // com.airbnb.lottie.LottieDrawable.r
        public void a(LottieComposition lottieComposition) {
            LottieDrawable.this.resumeAnimation();
        }
    }

    public class l implements r {
        public final /* synthetic */ int a;

        public l(int i) {
            this.a = i;
        }

        @Override // com.airbnb.lottie.LottieDrawable.r
        public void a(LottieComposition lottieComposition) {
            LottieDrawable.this.setMinFrame(this.a);
        }
    }

    public class m implements r {
        public final /* synthetic */ float a;

        public m(float f) {
            this.a = f;
        }

        @Override // com.airbnb.lottie.LottieDrawable.r
        public void a(LottieComposition lottieComposition) {
            LottieDrawable.this.setMinProgress(this.a);
        }
    }

    public class n implements r {
        public final /* synthetic */ int a;

        public n(int i) {
            this.a = i;
        }

        @Override // com.airbnb.lottie.LottieDrawable.r
        public void a(LottieComposition lottieComposition) {
            LottieDrawable.this.setMaxFrame(this.a);
        }
    }

    public class o implements r {
        public final /* synthetic */ float a;

        public o(float f) {
            this.a = f;
        }

        @Override // com.airbnb.lottie.LottieDrawable.r
        public void a(LottieComposition lottieComposition) {
            LottieDrawable.this.setMaxProgress(this.a);
        }
    }

    public class p implements r {
        public final /* synthetic */ String a;

        public p(String str) {
            this.a = str;
        }

        @Override // com.airbnb.lottie.LottieDrawable.r
        public void a(LottieComposition lottieComposition) {
            LottieDrawable.this.setMinFrame(this.a);
        }
    }

    public class q implements r {
        public final /* synthetic */ String a;

        public q(String str) {
            this.a = str;
        }

        @Override // com.airbnb.lottie.LottieDrawable.r
        public void a(LottieComposition lottieComposition) {
            LottieDrawable.this.setMaxFrame(this.a);
        }
    }

    public interface r {
        void a(LottieComposition lottieComposition);
    }

    public LottieDrawable() {
        LottieValueAnimator lottieValueAnimator = new LottieValueAnimator();
        this.c = lottieValueAnimator;
        this.d = 1.0f;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = new ArrayList<>();
        i iVar = new i();
        this.i = iVar;
        this.r = 255;
        this.v = true;
        this.w = false;
        lottieValueAnimator.addUpdateListener(iVar);
    }

    private boolean c() {
        return this.e || this.f;
    }

    private float d(Rect rect) {
        return rect.width() / rect.height();
    }

    private boolean e() {
        LottieComposition lottieComposition = this.b;
        return lottieComposition == null || getBounds().isEmpty() || d(getBounds()) == d(lottieComposition.getBounds());
    }

    private void f() {
        CompositionLayer compositionLayer = new CompositionLayer(this, LayerParser.parse(this.b), this.b.getLayers(), this.b);
        this.q = compositionLayer;
        if (this.t) {
            compositionLayer.setOutlineMasksAndMattes(true);
        }
    }

    private void g(@NonNull Canvas canvas) {
        if (e()) {
            i(canvas);
        } else {
            h(canvas);
        }
    }

    private void h(Canvas canvas) {
        float f2;
        if (this.q == null) {
            return;
        }
        int iSave = -1;
        Rect bounds = getBounds();
        float fWidth = bounds.width() / this.b.getBounds().width();
        float fHeight = bounds.height() / this.b.getBounds().height();
        if (this.v) {
            float fMin = Math.min(fWidth, fHeight);
            if (fMin < 1.0f) {
                f2 = 1.0f / fMin;
                fWidth /= f2;
                fHeight /= f2;
            } else {
                f2 = 1.0f;
            }
            if (f2 > 1.0f) {
                iSave = canvas.save();
                float fWidth2 = bounds.width() / 2.0f;
                float fHeight2 = bounds.height() / 2.0f;
                float f3 = fWidth2 * fMin;
                float f4 = fMin * fHeight2;
                canvas.translate(fWidth2 - f3, fHeight2 - f4);
                canvas.scale(f2, f2, f3, f4);
            }
        }
        this.a.reset();
        this.a.preScale(fWidth, fHeight);
        this.q.draw(canvas, this.a, this.r);
        if (iSave > 0) {
            canvas.restoreToCount(iSave);
        }
    }

    private void i(Canvas canvas) {
        float f2;
        if (this.q == null) {
            return;
        }
        float f3 = this.d;
        float fM = m(canvas);
        if (f3 > fM) {
            f2 = this.d / fM;
        } else {
            fM = f3;
            f2 = 1.0f;
        }
        int iSave = -1;
        if (f2 > 1.0f) {
            iSave = canvas.save();
            float fWidth = this.b.getBounds().width() / 2.0f;
            float fHeight = this.b.getBounds().height() / 2.0f;
            float f4 = fWidth * fM;
            float f5 = fHeight * fM;
            canvas.translate((getScale() * fWidth) - f4, (getScale() * fHeight) - f5);
            canvas.scale(f2, f2, f4, f5);
        }
        this.a.reset();
        this.a.preScale(fM, fM);
        this.q.draw(canvas, this.a, this.r);
        if (iSave > 0) {
            canvas.restoreToCount(iSave);
        }
    }

    @Nullable
    private Context j() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private FontAssetManager k() {
        if (getCallback() == null) {
            return null;
        }
        if (this.m == null) {
            this.m = new FontAssetManager(getCallback(), this.n);
        }
        return this.m;
    }

    private ImageAssetManager l() {
        if (getCallback() == null) {
            return null;
        }
        ImageAssetManager imageAssetManager = this.j;
        if (imageAssetManager != null && !imageAssetManager.hasSameContext(j())) {
            this.j = null;
        }
        if (this.j == null) {
            this.j = new ImageAssetManager(getCallback(), this.k, this.l, this.b.getImages());
        }
        return this.j;
    }

    private float m(@NonNull Canvas canvas) {
        return Math.min(canvas.getWidth() / this.b.getBounds().width(), canvas.getHeight() / this.b.getBounds().height());
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.c.addListener(animatorListener);
    }

    @RequiresApi(api = 19)
    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.c.addPauseListener(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.c.addUpdateListener(animatorUpdateListener);
    }

    public <T> void addValueCallback(KeyPath keyPath, T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        CompositionLayer compositionLayer = this.q;
        if (compositionLayer == null) {
            this.h.add(new g(keyPath, t, lottieValueCallback));
            return;
        }
        boolean zIsEmpty = true;
        if (keyPath == KeyPath.COMPOSITION) {
            compositionLayer.addValueCallback(t, lottieValueCallback);
        } else if (keyPath.getResolvedElement() != null) {
            keyPath.getResolvedElement().addValueCallback(t, lottieValueCallback);
        } else {
            List<KeyPath> listResolveKeyPath = resolveKeyPath(keyPath);
            for (int i2 = 0; i2 < listResolveKeyPath.size(); i2++) {
                listResolveKeyPath.get(i2).getResolvedElement().addValueCallback(t, lottieValueCallback);
            }
            zIsEmpty = true ^ listResolveKeyPath.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (t == LottieProperty.TIME_REMAP) {
                setProgress(getProgress());
            }
        }
    }

    public void cancelAnimation() {
        this.h.clear();
        this.c.cancel();
    }

    public void clearComposition() {
        if (this.c.isRunning()) {
            this.c.cancel();
        }
        this.b = null;
        this.q = null;
        this.j = null;
        this.c.clearComposition();
        invalidateSelf();
    }

    public void disableExtraScaleModeInFitXY() {
        this.v = false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.w = false;
        L.beginSection("Drawable#draw");
        if (this.g) {
            try {
                g(canvas);
            } catch (Throwable th) {
                Logger.error("Lottie crashed in draw!", th);
            }
        } else {
            g(canvas);
        }
        L.endSection("Drawable#draw");
    }

    public boolean enableMergePathsForKitKatAndAbove() {
        return this.p;
    }

    @MainThread
    public void endAnimation() {
        this.h.clear();
        this.c.endAnimation();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.r;
    }

    public LottieComposition getComposition() {
        return this.b;
    }

    public int getFrame() {
        return (int) this.c.getFrame();
    }

    @Nullable
    public Bitmap getImageAsset(String str) {
        ImageAssetManager imageAssetManagerL = l();
        if (imageAssetManagerL != null) {
            return imageAssetManagerL.bitmapForId(str);
        }
        LottieComposition lottieComposition = this.b;
        LottieImageAsset lottieImageAsset = lottieComposition == null ? null : lottieComposition.getImages().get(str);
        if (lottieImageAsset != null) {
            return lottieImageAsset.getBitmap();
        }
        return null;
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        LottieComposition lottieComposition = this.b;
        if (lottieComposition == null) {
            return -1;
        }
        return (int) (lottieComposition.getBounds().height() * getScale());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        LottieComposition lottieComposition = this.b;
        if (lottieComposition == null) {
            return -1;
        }
        return (int) (lottieComposition.getBounds().width() * getScale());
    }

    public float getMaxFrame() {
        return this.c.getMaxFrame();
    }

    public float getMinFrame() {
        return this.c.getMinFrame();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Nullable
    public PerformanceTracker getPerformanceTracker() {
        LottieComposition lottieComposition = this.b;
        if (lottieComposition != null) {
            return lottieComposition.getPerformanceTracker();
        }
        return null;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.c.getAnimatedValueAbsolute();
    }

    public int getRepeatCount() {
        return this.c.getRepeatCount();
    }

    @SuppressLint({"WrongConstant"})
    public int getRepeatMode() {
        return this.c.getRepeatMode();
    }

    public float getScale() {
        return this.d;
    }

    public float getSpeed() {
        return this.c.getSpeed();
    }

    @Nullable
    public TextDelegate getTextDelegate() {
        return this.o;
    }

    @Nullable
    public Typeface getTypeface(String str, String str2) {
        FontAssetManager fontAssetManagerK = k();
        if (fontAssetManagerK != null) {
            return fontAssetManagerK.getTypeface(str, str2);
        }
        return null;
    }

    public boolean hasMasks() {
        CompositionLayer compositionLayer = this.q;
        return compositionLayer != null && compositionLayer.hasMasks();
    }

    public boolean hasMatte() {
        CompositionLayer compositionLayer = this.q;
        return compositionLayer != null && compositionLayer.hasMatte();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.w) {
            return;
        }
        this.w = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isAnimating() {
        LottieValueAnimator lottieValueAnimator = this.c;
        if (lottieValueAnimator == null) {
            return false;
        }
        return lottieValueAnimator.isRunning();
    }

    public boolean isApplyingOpacityToLayersEnabled() {
        return this.u;
    }

    public boolean isLooping() {
        return this.c.getRepeatCount() == -1;
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.p;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return isAnimating();
    }

    @Deprecated
    public void loop(boolean z) {
        this.c.setRepeatCount(z ? -1 : 0);
    }

    public void n(Boolean bool) {
        this.e = bool.booleanValue();
    }

    public void pauseAnimation() {
        this.h.clear();
        this.c.pauseAnimation();
    }

    @MainThread
    public void playAnimation() {
        if (this.q == null) {
            this.h.add(new j());
            return;
        }
        if (c() || getRepeatCount() == 0) {
            this.c.playAnimation();
        }
        if (c()) {
            return;
        }
        setFrame((int) (getSpeed() < 0.0f ? getMinFrame() : getMaxFrame()));
        this.c.endAnimation();
    }

    public void removeAllAnimatorListeners() {
        this.c.removeAllListeners();
    }

    public void removeAllUpdateListeners() {
        this.c.removeAllUpdateListeners();
        this.c.addUpdateListener(this.i);
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.c.removeListener(animatorListener);
    }

    @RequiresApi(api = 19)
    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.c.removePauseListener(animatorPauseListener);
    }

    public void removeAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.c.removeUpdateListener(animatorUpdateListener);
    }

    public List<KeyPath> resolveKeyPath(KeyPath keyPath) {
        if (this.q == null) {
            Logger.warning("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.q.resolveKeyPath(keyPath, 0, arrayList, new KeyPath(new String[0]));
        return arrayList;
    }

    @MainThread
    public void resumeAnimation() {
        if (this.q == null) {
            this.h.add(new k());
            return;
        }
        if (c() || getRepeatCount() == 0) {
            this.c.resumeAnimation();
        }
        if (c()) {
            return;
        }
        setFrame((int) (getSpeed() < 0.0f ? getMinFrame() : getMaxFrame()));
        this.c.endAnimation();
    }

    public void reverseAnimationSpeed() {
        this.c.reverseAnimationSpeed();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i2) {
        this.r = i2;
        invalidateSelf();
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.u = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        Logger.warning("Use addColorFilter instead.");
    }

    public boolean setComposition(LottieComposition lottieComposition) {
        if (this.b == lottieComposition) {
            return false;
        }
        this.w = false;
        clearComposition();
        this.b = lottieComposition;
        f();
        this.c.setComposition(lottieComposition);
        setProgress(this.c.getAnimatedFraction());
        setScale(this.d);
        Iterator it2 = new ArrayList(this.h).iterator();
        while (it2.hasNext()) {
            r rVar = (r) it2.next();
            if (rVar != null) {
                rVar.a(lottieComposition);
            }
            it2.remove();
        }
        this.h.clear();
        lottieComposition.setPerformanceTrackingEnabled(this.s);
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof ImageView)) {
            return true;
        }
        ImageView imageView = (ImageView) callback;
        imageView.setImageDrawable(null);
        imageView.setImageDrawable(this);
        return true;
    }

    public void setFontAssetDelegate(FontAssetDelegate fontAssetDelegate) {
        this.n = fontAssetDelegate;
        FontAssetManager fontAssetManager = this.m;
        if (fontAssetManager != null) {
            fontAssetManager.setDelegate(fontAssetDelegate);
        }
    }

    public void setFrame(int i2) {
        if (this.b == null) {
            this.h.add(new e(i2));
        } else {
            this.c.setFrame(i2);
        }
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f = z;
    }

    public void setImageAssetDelegate(ImageAssetDelegate imageAssetDelegate) {
        this.l = imageAssetDelegate;
        ImageAssetManager imageAssetManager = this.j;
        if (imageAssetManager != null) {
            imageAssetManager.setDelegate(imageAssetDelegate);
        }
    }

    public void setImagesAssetsFolder(@Nullable String str) {
        this.k = str;
    }

    public void setMaxFrame(int i2) {
        if (this.b == null) {
            this.h.add(new n(i2));
        } else {
            this.c.setMaxFrame(i2 + 0.99f);
        }
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        LottieComposition lottieComposition = this.b;
        if (lottieComposition == null) {
            this.h.add(new o(f2));
        } else {
            setMaxFrame((int) MiscUtils.lerp(lottieComposition.getStartFrame(), this.b.getEndFrame(), f2));
        }
    }

    public void setMinAndMaxFrame(String str) {
        LottieComposition lottieComposition = this.b;
        if (lottieComposition == null) {
            this.h.add(new a(str));
            return;
        }
        Marker marker = lottieComposition.getMarker(str);
        if (marker != null) {
            int i2 = (int) marker.startFrame;
            setMinAndMaxFrame(i2, ((int) marker.durationFrames) + i2);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public void setMinAndMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f2, @FloatRange(from = 0.0d, to = 1.0d) float f3) {
        LottieComposition lottieComposition = this.b;
        if (lottieComposition == null) {
            this.h.add(new d(f2, f3));
        } else {
            setMinAndMaxFrame((int) MiscUtils.lerp(lottieComposition.getStartFrame(), this.b.getEndFrame(), f2), (int) MiscUtils.lerp(this.b.getStartFrame(), this.b.getEndFrame(), f3));
        }
    }

    public void setMinFrame(int i2) {
        if (this.b == null) {
            this.h.add(new l(i2));
        } else {
            this.c.setMinFrame(i2);
        }
    }

    public void setMinProgress(float f2) {
        LottieComposition lottieComposition = this.b;
        if (lottieComposition == null) {
            this.h.add(new m(f2));
        } else {
            setMinFrame((int) MiscUtils.lerp(lottieComposition.getStartFrame(), this.b.getEndFrame(), f2));
        }
    }

    public void setOutlineMasksAndMattes(boolean z) {
        if (this.t == z) {
            return;
        }
        this.t = z;
        CompositionLayer compositionLayer = this.q;
        if (compositionLayer != null) {
            compositionLayer.setOutlineMasksAndMattes(z);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.s = z;
        LottieComposition lottieComposition = this.b;
        if (lottieComposition != null) {
            lottieComposition.setPerformanceTrackingEnabled(z);
        }
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        if (this.b == null) {
            this.h.add(new f(f2));
            return;
        }
        L.beginSection("Drawable#setProgress");
        this.c.setFrame(this.b.getFrameForProgress(f2));
        L.endSection("Drawable#setProgress");
    }

    public void setRepeatCount(int i2) {
        this.c.setRepeatCount(i2);
    }

    public void setRepeatMode(int i2) {
        this.c.setRepeatMode(i2);
    }

    public void setSafeMode(boolean z) {
        this.g = z;
    }

    public void setScale(float f2) {
        this.d = f2;
    }

    public void setSpeed(float f2) {
        this.c.setSpeed(f2);
    }

    public void setTextDelegate(TextDelegate textDelegate) {
        this.o = textDelegate;
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || ((View) callback).isInEditMode()) {
            return;
        }
        playAnimation();
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void stop() {
        endAnimation();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    @Nullable
    public Bitmap updateBitmap(String str, @Nullable Bitmap bitmap) {
        ImageAssetManager imageAssetManagerL = l();
        if (imageAssetManagerL == null) {
            Logger.warning("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Bitmap bitmapUpdateBitmap = imageAssetManagerL.updateBitmap(str, bitmap);
        invalidateSelf();
        return bitmapUpdateBitmap;
    }

    public boolean useTextGlyphs() {
        return this.o == null && this.b.getCharacters().size() > 0;
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        if (this.p == z) {
            return;
        }
        if (Build.VERSION.SDK_INT < 19) {
            Logger.warning("Merge paths are not supported pre-Kit Kat.");
            return;
        }
        this.p = z;
        if (this.b != null) {
            f();
        }
    }

    public void setMaxFrame(String str) {
        LottieComposition lottieComposition = this.b;
        if (lottieComposition == null) {
            this.h.add(new q(str));
            return;
        }
        Marker marker = lottieComposition.getMarker(str);
        if (marker != null) {
            setMaxFrame((int) (marker.startFrame + marker.durationFrames));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void setMinFrame(String str) {
        LottieComposition lottieComposition = this.b;
        if (lottieComposition == null) {
            this.h.add(new p(str));
            return;
        }
        Marker marker = lottieComposition.getMarker(str);
        if (marker != null) {
            setMinFrame((int) marker.startFrame);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        LottieComposition lottieComposition = this.b;
        if (lottieComposition == null) {
            this.h.add(new b(str, str2, z));
            return;
        }
        Marker marker = lottieComposition.getMarker(str);
        if (marker != null) {
            int i2 = (int) marker.startFrame;
            Marker marker2 = this.b.getMarker(str2);
            if (marker2 != null) {
                setMinAndMaxFrame(i2, (int) (marker2.startFrame + (z ? 1.0f : 0.0f)));
                return;
            }
            throw new IllegalArgumentException("Cannot find marker with name " + str2 + ".");
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void draw(Canvas canvas, Matrix matrix) {
        CompositionLayer compositionLayer = this.q;
        if (compositionLayer == null) {
            return;
        }
        compositionLayer.draw(canvas, matrix, this.r);
    }

    public <T> void addValueCallback(KeyPath keyPath, T t, SimpleLottieValueCallback<T> simpleLottieValueCallback) {
        addValueCallback(keyPath, t, new h(simpleLottieValueCallback));
    }

    public void setMinAndMaxFrame(int i2, int i3) {
        if (this.b == null) {
            this.h.add(new c(i2, i3));
        } else {
            this.c.setMinAndMaxFrames(i2, i3 + 0.99f);
        }
    }
}
