package com.bumptech.glide.request;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.model.stream.HttpGlideUrlLoader;
import com.bumptech.glide.load.resource.bitmap.BitmapEncoder;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.CenterInside;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.DrawableTransformation;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.GifDrawableTransformation;
import com.bumptech.glide.load.resource.gif.GifOptions;
import com.bumptech.glide.signature.EmptySignature;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class RequestOptions implements Cloneable {
    private static final int A = -1;
    private static final int B = 2;
    private static final int C = 4;
    private static final int D = 8;
    private static final int E = 16;
    private static final int F = 32;
    private static final int G = 64;
    private static final int H = 128;
    private static final int I = 256;
    private static final int J = 512;
    private static final int K = 1024;
    private static final int L = 2048;
    private static final int M = 4096;
    private static final int N = 8192;
    private static final int O = 16384;
    private static final int P = 32768;
    private static final int Q = 65536;
    private static final int R = 131072;
    private static final int S = 262144;
    private static final int T = 524288;
    private static final int U = 1048576;

    @Nullable
    private static RequestOptions V;

    @Nullable
    private static RequestOptions W;

    @Nullable
    private static RequestOptions X;

    @Nullable
    private static RequestOptions Y;

    @Nullable
    private static RequestOptions Z;

    @Nullable
    private static RequestOptions m0;

    @Nullable
    private static RequestOptions n0;

    @Nullable
    private static RequestOptions o0;
    private int a;

    @Nullable
    private Drawable e;
    private int f;

    @Nullable
    private Drawable g;
    private int h;
    private boolean m;

    @Nullable
    private Drawable o;
    private int p;
    private boolean t;

    @Nullable
    private Resources.Theme u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean z;
    private float b = 1.0f;

    @NonNull
    private DiskCacheStrategy c = DiskCacheStrategy.AUTOMATIC;

    @NonNull
    private Priority d = Priority.NORMAL;
    private boolean i = true;
    private int j = -1;
    private int k = -1;

    @NonNull
    private Key l = EmptySignature.obtain();
    private boolean n = true;

    @NonNull
    private Options q = new Options();

    @NonNull
    private Map<Class<?>, Transformation<?>> r = new CachedHashCodeArrayMap();

    @NonNull
    private Class<?> s = Object.class;
    private boolean y = true;

    private boolean b(int i) {
        return c(this.a, i);
    }

    @NonNull
    @CheckResult
    public static RequestOptions bitmapTransform(@NonNull Transformation<Bitmap> transformation) {
        return new RequestOptions().transform(transformation);
    }

    private static boolean c(int i, int i2) {
        return (i & i2) != 0;
    }

    @NonNull
    @CheckResult
    public static RequestOptions centerCropTransform() {
        if (Z == null) {
            Z = new RequestOptions().centerCrop().autoClone();
        }
        return Z;
    }

    @NonNull
    @CheckResult
    public static RequestOptions centerInsideTransform() {
        if (Y == null) {
            Y = new RequestOptions().centerInside().autoClone();
        }
        return Y;
    }

    @NonNull
    @CheckResult
    public static RequestOptions circleCropTransform() {
        if (m0 == null) {
            m0 = new RequestOptions().circleCrop().autoClone();
        }
        return m0;
    }

    @NonNull
    private RequestOptions d(@NonNull DownsampleStrategy downsampleStrategy, @NonNull Transformation<Bitmap> transformation) {
        return g(downsampleStrategy, transformation, false);
    }

    @NonNull
    @CheckResult
    public static RequestOptions decodeTypeOf(@NonNull Class<?> cls) {
        return new RequestOptions().decode(cls);
    }

    @NonNull
    @CheckResult
    public static RequestOptions diskCacheStrategyOf(@NonNull DiskCacheStrategy diskCacheStrategy) {
        return new RequestOptions().diskCacheStrategy(diskCacheStrategy);
    }

    @NonNull
    @CheckResult
    public static RequestOptions downsampleOf(@NonNull DownsampleStrategy downsampleStrategy) {
        return new RequestOptions().downsample(downsampleStrategy);
    }

    @NonNull
    @CheckResult
    public static RequestOptions encodeFormatOf(@NonNull Bitmap.CompressFormat compressFormat) {
        return new RequestOptions().encodeFormat(compressFormat);
    }

    @NonNull
    @CheckResult
    public static RequestOptions encodeQualityOf(@IntRange(from = 0, to = 100) int i) {
        return new RequestOptions().encodeQuality(i);
    }

    @NonNull
    @CheckResult
    public static RequestOptions errorOf(@Nullable Drawable drawable) {
        return new RequestOptions().error(drawable);
    }

    @NonNull
    private RequestOptions f(@NonNull DownsampleStrategy downsampleStrategy, @NonNull Transformation<Bitmap> transformation) {
        return g(downsampleStrategy, transformation, true);
    }

    @NonNull
    @CheckResult
    public static RequestOptions fitCenterTransform() {
        if (X == null) {
            X = new RequestOptions().fitCenter().autoClone();
        }
        return X;
    }

    @NonNull
    @CheckResult
    public static RequestOptions formatOf(@NonNull DecodeFormat decodeFormat) {
        return new RequestOptions().format(decodeFormat);
    }

    @NonNull
    @CheckResult
    public static RequestOptions frameOf(@IntRange(from = 0) long j) {
        return new RequestOptions().frame(j);
    }

    @NonNull
    private RequestOptions g(@NonNull DownsampleStrategy downsampleStrategy, @NonNull Transformation<Bitmap> transformation, boolean z) {
        RequestOptions requestOptionsJ = z ? j(downsampleStrategy, transformation) : e(downsampleStrategy, transformation);
        requestOptionsJ.y = true;
        return requestOptionsJ;
    }

    @NonNull
    private RequestOptions h() {
        if (this.t) {
            throw new IllegalStateException("You cannot modify locked RequestOptions, consider clone()");
        }
        return this;
    }

    @NonNull
    private RequestOptions i(@NonNull Transformation<Bitmap> transformation, boolean z) {
        if (this.v) {
            return mo3297clone().i(transformation, z);
        }
        DrawableTransformation drawableTransformation = new DrawableTransformation(transformation, z);
        k(Bitmap.class, transformation, z);
        k(Drawable.class, drawableTransformation, z);
        k(BitmapDrawable.class, drawableTransformation.asBitmapDrawable(), z);
        k(GifDrawable.class, new GifDrawableTransformation(transformation), z);
        return h();
    }

    @NonNull
    private <T> RequestOptions k(@NonNull Class<T> cls, @NonNull Transformation<T> transformation, boolean z) {
        if (this.v) {
            return mo3297clone().k(cls, transformation, z);
        }
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(transformation);
        this.r.put(cls, transformation);
        int i = this.a | 2048;
        this.a = i;
        this.n = true;
        int i2 = i | 65536;
        this.a = i2;
        this.y = false;
        if (z) {
            this.a = i2 | 131072;
            this.m = true;
        }
        return h();
    }

    @NonNull
    @CheckResult
    public static RequestOptions noAnimation() {
        if (o0 == null) {
            o0 = new RequestOptions().dontAnimate().autoClone();
        }
        return o0;
    }

    @NonNull
    @CheckResult
    public static RequestOptions noTransformation() {
        if (n0 == null) {
            n0 = new RequestOptions().dontTransform().autoClone();
        }
        return n0;
    }

    @NonNull
    @CheckResult
    public static <T> RequestOptions option(@NonNull Option<T> option, @NonNull T t) {
        return new RequestOptions().set(option, t);
    }

    @NonNull
    @CheckResult
    public static RequestOptions overrideOf(@IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        return new RequestOptions().override(i, i2);
    }

    @NonNull
    @CheckResult
    public static RequestOptions placeholderOf(@Nullable Drawable drawable) {
        return new RequestOptions().placeholder(drawable);
    }

    @NonNull
    @CheckResult
    public static RequestOptions priorityOf(@NonNull Priority priority) {
        return new RequestOptions().priority(priority);
    }

    @NonNull
    @CheckResult
    public static RequestOptions signatureOf(@NonNull Key key) {
        return new RequestOptions().signature(key);
    }

    @NonNull
    @CheckResult
    public static RequestOptions sizeMultiplierOf(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        return new RequestOptions().sizeMultiplier(f);
    }

    @NonNull
    @CheckResult
    public static RequestOptions skipMemoryCacheOf(boolean z) {
        if (z) {
            if (V == null) {
                V = new RequestOptions().skipMemoryCache(true).autoClone();
            }
            return V;
        }
        if (W == null) {
            W = new RequestOptions().skipMemoryCache(false).autoClone();
        }
        return W;
    }

    @NonNull
    @CheckResult
    public static RequestOptions timeoutOf(@IntRange(from = 0) int i) {
        return new RequestOptions().timeout(i);
    }

    public boolean a() {
        return this.y;
    }

    @NonNull
    @CheckResult
    public RequestOptions apply(@NonNull RequestOptions requestOptions) {
        if (this.v) {
            return mo3297clone().apply(requestOptions);
        }
        if (c(requestOptions.a, 2)) {
            this.b = requestOptions.b;
        }
        if (c(requestOptions.a, 262144)) {
            this.w = requestOptions.w;
        }
        if (c(requestOptions.a, 1048576)) {
            this.z = requestOptions.z;
        }
        if (c(requestOptions.a, 4)) {
            this.c = requestOptions.c;
        }
        if (c(requestOptions.a, 8)) {
            this.d = requestOptions.d;
        }
        if (c(requestOptions.a, 16)) {
            this.e = requestOptions.e;
            this.f = 0;
            this.a &= -33;
        }
        if (c(requestOptions.a, 32)) {
            this.f = requestOptions.f;
            this.e = null;
            this.a &= -17;
        }
        if (c(requestOptions.a, 64)) {
            this.g = requestOptions.g;
            this.h = 0;
            this.a &= -129;
        }
        if (c(requestOptions.a, 128)) {
            this.h = requestOptions.h;
            this.g = null;
            this.a &= -65;
        }
        if (c(requestOptions.a, 256)) {
            this.i = requestOptions.i;
        }
        if (c(requestOptions.a, 512)) {
            this.k = requestOptions.k;
            this.j = requestOptions.j;
        }
        if (c(requestOptions.a, 1024)) {
            this.l = requestOptions.l;
        }
        if (c(requestOptions.a, 4096)) {
            this.s = requestOptions.s;
        }
        if (c(requestOptions.a, 8192)) {
            this.o = requestOptions.o;
            this.p = 0;
            this.a &= -16385;
        }
        if (c(requestOptions.a, 16384)) {
            this.p = requestOptions.p;
            this.o = null;
            this.a &= -8193;
        }
        if (c(requestOptions.a, 32768)) {
            this.u = requestOptions.u;
        }
        if (c(requestOptions.a, 65536)) {
            this.n = requestOptions.n;
        }
        if (c(requestOptions.a, 131072)) {
            this.m = requestOptions.m;
        }
        if (c(requestOptions.a, 2048)) {
            this.r.putAll(requestOptions.r);
            this.y = requestOptions.y;
        }
        if (c(requestOptions.a, 524288)) {
            this.x = requestOptions.x;
        }
        if (!this.n) {
            this.r.clear();
            int i = this.a & (-2049);
            this.a = i;
            this.m = false;
            this.a = i & (-131073);
            this.y = true;
        }
        this.a |= requestOptions.a;
        this.q.putAll(requestOptions.q);
        return h();
    }

    @NonNull
    public RequestOptions autoClone() {
        if (this.t && !this.v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.v = true;
        return lock();
    }

    @NonNull
    @CheckResult
    public RequestOptions centerCrop() {
        return j(DownsampleStrategy.CENTER_OUTSIDE, new CenterCrop());
    }

    @NonNull
    @CheckResult
    public RequestOptions centerInside() {
        return f(DownsampleStrategy.CENTER_INSIDE, new CenterInside());
    }

    @NonNull
    @CheckResult
    public RequestOptions circleCrop() {
        return j(DownsampleStrategy.CENTER_INSIDE, new CircleCrop());
    }

    @NonNull
    @CheckResult
    public RequestOptions decode(@NonNull Class<?> cls) {
        if (this.v) {
            return mo3297clone().decode(cls);
        }
        this.s = (Class) Preconditions.checkNotNull(cls);
        this.a |= 4096;
        return h();
    }

    @NonNull
    @CheckResult
    public RequestOptions disallowHardwareConfig() {
        return set(Downsampler.ALLOW_HARDWARE_CONFIG, Boolean.FALSE);
    }

    @NonNull
    @CheckResult
    public RequestOptions diskCacheStrategy(@NonNull DiskCacheStrategy diskCacheStrategy) {
        if (this.v) {
            return mo3297clone().diskCacheStrategy(diskCacheStrategy);
        }
        this.c = (DiskCacheStrategy) Preconditions.checkNotNull(diskCacheStrategy);
        this.a |= 4;
        return h();
    }

    @NonNull
    @CheckResult
    public RequestOptions dontAnimate() {
        return set(GifOptions.DISABLE_ANIMATION, Boolean.TRUE);
    }

    @NonNull
    @CheckResult
    public RequestOptions dontTransform() {
        if (this.v) {
            return mo3297clone().dontTransform();
        }
        this.r.clear();
        int i = this.a & (-2049);
        this.a = i;
        this.m = false;
        int i2 = i & (-131073);
        this.a = i2;
        this.n = false;
        this.a = i2 | 65536;
        this.y = true;
        return h();
    }

    @NonNull
    @CheckResult
    public RequestOptions downsample(@NonNull DownsampleStrategy downsampleStrategy) {
        return set(DownsampleStrategy.OPTION, Preconditions.checkNotNull(downsampleStrategy));
    }

    @NonNull
    public final RequestOptions e(@NonNull DownsampleStrategy downsampleStrategy, @NonNull Transformation<Bitmap> transformation) {
        if (this.v) {
            return mo3297clone().e(downsampleStrategy, transformation);
        }
        downsample(downsampleStrategy);
        return i(transformation, false);
    }

    @NonNull
    @CheckResult
    public RequestOptions encodeFormat(@NonNull Bitmap.CompressFormat compressFormat) {
        return set(BitmapEncoder.COMPRESSION_FORMAT, Preconditions.checkNotNull(compressFormat));
    }

    @NonNull
    @CheckResult
    public RequestOptions encodeQuality(@IntRange(from = 0, to = 100) int i) {
        return set(BitmapEncoder.COMPRESSION_QUALITY, Integer.valueOf(i));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RequestOptions)) {
            return false;
        }
        RequestOptions requestOptions = (RequestOptions) obj;
        return Float.compare(requestOptions.b, this.b) == 0 && this.f == requestOptions.f && Util.bothNullOrEqual(this.e, requestOptions.e) && this.h == requestOptions.h && Util.bothNullOrEqual(this.g, requestOptions.g) && this.p == requestOptions.p && Util.bothNullOrEqual(this.o, requestOptions.o) && this.i == requestOptions.i && this.j == requestOptions.j && this.k == requestOptions.k && this.m == requestOptions.m && this.n == requestOptions.n && this.w == requestOptions.w && this.x == requestOptions.x && this.c.equals(requestOptions.c) && this.d == requestOptions.d && this.q.equals(requestOptions.q) && this.r.equals(requestOptions.r) && this.s.equals(requestOptions.s) && Util.bothNullOrEqual(this.l, requestOptions.l) && Util.bothNullOrEqual(this.u, requestOptions.u);
    }

    @NonNull
    @CheckResult
    public RequestOptions error(@Nullable Drawable drawable) {
        if (this.v) {
            return mo3297clone().error(drawable);
        }
        this.e = drawable;
        int i = this.a | 16;
        this.a = i;
        this.f = 0;
        this.a = i & (-33);
        return h();
    }

    @NonNull
    @CheckResult
    public RequestOptions fallback(@Nullable Drawable drawable) {
        if (this.v) {
            return mo3297clone().fallback(drawable);
        }
        this.o = drawable;
        int i = this.a | 8192;
        this.a = i;
        this.p = 0;
        this.a = i & (-16385);
        return h();
    }

    @NonNull
    @CheckResult
    public RequestOptions fitCenter() {
        return f(DownsampleStrategy.FIT_CENTER, new FitCenter());
    }

    @NonNull
    @CheckResult
    public RequestOptions format(@NonNull DecodeFormat decodeFormat) {
        Preconditions.checkNotNull(decodeFormat);
        return set(Downsampler.DECODE_FORMAT, decodeFormat).set(GifOptions.DECODE_FORMAT, decodeFormat);
    }

    @NonNull
    @CheckResult
    public RequestOptions frame(@IntRange(from = 0) long j) {
        return set(VideoDecoder.TARGET_FRAME, Long.valueOf(j));
    }

    @NonNull
    public final DiskCacheStrategy getDiskCacheStrategy() {
        return this.c;
    }

    public final int getErrorId() {
        return this.f;
    }

    @Nullable
    public final Drawable getErrorPlaceholder() {
        return this.e;
    }

    @Nullable
    public final Drawable getFallbackDrawable() {
        return this.o;
    }

    public final int getFallbackId() {
        return this.p;
    }

    public final boolean getOnlyRetrieveFromCache() {
        return this.x;
    }

    @NonNull
    public final Options getOptions() {
        return this.q;
    }

    public final int getOverrideHeight() {
        return this.j;
    }

    public final int getOverrideWidth() {
        return this.k;
    }

    @Nullable
    public final Drawable getPlaceholderDrawable() {
        return this.g;
    }

    public final int getPlaceholderId() {
        return this.h;
    }

    @NonNull
    public final Priority getPriority() {
        return this.d;
    }

    @NonNull
    public final Class<?> getResourceClass() {
        return this.s;
    }

    @NonNull
    public final Key getSignature() {
        return this.l;
    }

    public final float getSizeMultiplier() {
        return this.b;
    }

    @Nullable
    public final Resources.Theme getTheme() {
        return this.u;
    }

    @NonNull
    public final Map<Class<?>, Transformation<?>> getTransformations() {
        return this.r;
    }

    public final boolean getUseAnimationPool() {
        return this.z;
    }

    public final boolean getUseUnlimitedSourceGeneratorsPool() {
        return this.w;
    }

    public int hashCode() {
        return Util.hashCode(this.u, Util.hashCode(this.l, Util.hashCode(this.s, Util.hashCode(this.r, Util.hashCode(this.q, Util.hashCode(this.d, Util.hashCode(this.c, Util.hashCode(this.x, Util.hashCode(this.w, Util.hashCode(this.n, Util.hashCode(this.m, Util.hashCode(this.k, Util.hashCode(this.j, Util.hashCode(this.i, Util.hashCode(this.o, Util.hashCode(this.p, Util.hashCode(this.g, Util.hashCode(this.h, Util.hashCode(this.e, Util.hashCode(this.f, Util.hashCode(this.b)))))))))))))))))))));
    }

    public boolean isAutoCloneEnabled() {
        return this.v;
    }

    public final boolean isDiskCacheStrategySet() {
        return b(4);
    }

    public final boolean isLocked() {
        return this.t;
    }

    public final boolean isMemoryCacheable() {
        return this.i;
    }

    public final boolean isPrioritySet() {
        return b(8);
    }

    public final boolean isSkipMemoryCacheSet() {
        return b(256);
    }

    public final boolean isTransformationAllowed() {
        return this.n;
    }

    public final boolean isTransformationRequired() {
        return this.m;
    }

    public final boolean isTransformationSet() {
        return b(2048);
    }

    public final boolean isValidOverride() {
        return Util.isValidDimensions(this.k, this.j);
    }

    @NonNull
    @CheckResult
    public final RequestOptions j(@NonNull DownsampleStrategy downsampleStrategy, @NonNull Transformation<Bitmap> transformation) {
        if (this.v) {
            return mo3297clone().j(downsampleStrategy, transformation);
        }
        downsample(downsampleStrategy);
        return transform(transformation);
    }

    @NonNull
    public RequestOptions lock() {
        this.t = true;
        return this;
    }

    @NonNull
    @CheckResult
    public RequestOptions onlyRetrieveFromCache(boolean z) {
        if (this.v) {
            return mo3297clone().onlyRetrieveFromCache(z);
        }
        this.x = z;
        this.a |= 524288;
        return h();
    }

    @NonNull
    @CheckResult
    public RequestOptions optionalCenterCrop() {
        return e(DownsampleStrategy.CENTER_OUTSIDE, new CenterCrop());
    }

    @NonNull
    @CheckResult
    public RequestOptions optionalCenterInside() {
        return d(DownsampleStrategy.CENTER_INSIDE, new CenterInside());
    }

    @NonNull
    @CheckResult
    public RequestOptions optionalCircleCrop() {
        return e(DownsampleStrategy.CENTER_OUTSIDE, new CircleCrop());
    }

    @NonNull
    @CheckResult
    public RequestOptions optionalFitCenter() {
        return d(DownsampleStrategy.FIT_CENTER, new FitCenter());
    }

    @NonNull
    @CheckResult
    public RequestOptions optionalTransform(@NonNull Transformation<Bitmap> transformation) {
        return i(transformation, false);
    }

    @NonNull
    @CheckResult
    public RequestOptions override(int i, int i2) {
        if (this.v) {
            return mo3297clone().override(i, i2);
        }
        this.k = i;
        this.j = i2;
        this.a |= 512;
        return h();
    }

    @NonNull
    @CheckResult
    public RequestOptions placeholder(@Nullable Drawable drawable) {
        if (this.v) {
            return mo3297clone().placeholder(drawable);
        }
        this.g = drawable;
        int i = this.a | 64;
        this.a = i;
        this.h = 0;
        this.a = i & (-129);
        return h();
    }

    @NonNull
    @CheckResult
    public RequestOptions priority(@NonNull Priority priority) {
        if (this.v) {
            return mo3297clone().priority(priority);
        }
        this.d = (Priority) Preconditions.checkNotNull(priority);
        this.a |= 8;
        return h();
    }

    @NonNull
    @CheckResult
    public <T> RequestOptions set(@NonNull Option<T> option, @NonNull T t) {
        if (this.v) {
            return mo3297clone().set(option, t);
        }
        Preconditions.checkNotNull(option);
        Preconditions.checkNotNull(t);
        this.q.set(option, t);
        return h();
    }

    @NonNull
    @CheckResult
    public RequestOptions signature(@NonNull Key key) {
        if (this.v) {
            return mo3297clone().signature(key);
        }
        this.l = (Key) Preconditions.checkNotNull(key);
        this.a |= 1024;
        return h();
    }

    @NonNull
    @CheckResult
    public RequestOptions sizeMultiplier(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (this.v) {
            return mo3297clone().sizeMultiplier(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.b = f;
        this.a |= 2;
        return h();
    }

    @NonNull
    @CheckResult
    public RequestOptions skipMemoryCache(boolean z) {
        if (this.v) {
            return mo3297clone().skipMemoryCache(true);
        }
        this.i = !z;
        this.a |= 256;
        return h();
    }

    @NonNull
    @CheckResult
    public RequestOptions theme(@Nullable Resources.Theme theme) {
        if (this.v) {
            return mo3297clone().theme(theme);
        }
        this.u = theme;
        this.a |= 32768;
        return h();
    }

    @NonNull
    @CheckResult
    public RequestOptions timeout(@IntRange(from = 0) int i) {
        return set(HttpGlideUrlLoader.TIMEOUT, Integer.valueOf(i));
    }

    @NonNull
    @CheckResult
    public RequestOptions transform(@NonNull Transformation<Bitmap> transformation) {
        return i(transformation, true);
    }

    @NonNull
    @CheckResult
    public RequestOptions transforms(@NonNull Transformation<Bitmap>... transformationArr) {
        return i(new MultiTransformation(transformationArr), true);
    }

    @NonNull
    @CheckResult
    public RequestOptions useAnimationPool(boolean z) {
        if (this.v) {
            return mo3297clone().useAnimationPool(z);
        }
        this.z = z;
        this.a |= 1048576;
        return h();
    }

    @NonNull
    @CheckResult
    public RequestOptions useUnlimitedSourceGeneratorsPool(boolean z) {
        if (this.v) {
            return mo3297clone().useUnlimitedSourceGeneratorsPool(z);
        }
        this.w = z;
        this.a |= 262144;
        return h();
    }

    @NonNull
    @CheckResult
    public static RequestOptions errorOf(@DrawableRes int i) {
        return new RequestOptions().error(i);
    }

    @NonNull
    @CheckResult
    public static RequestOptions overrideOf(@IntRange(from = 0) int i) {
        return overrideOf(i, i);
    }

    @NonNull
    @CheckResult
    public static RequestOptions placeholderOf(@DrawableRes int i) {
        return new RequestOptions().placeholder(i);
    }

    @Override // 
    @CheckResult
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RequestOptions mo3297clone() {
        try {
            RequestOptions requestOptions = (RequestOptions) super.clone();
            Options options = new Options();
            requestOptions.q = options;
            options.putAll(this.q);
            CachedHashCodeArrayMap cachedHashCodeArrayMap = new CachedHashCodeArrayMap();
            requestOptions.r = cachedHashCodeArrayMap;
            cachedHashCodeArrayMap.putAll(this.r);
            requestOptions.t = false;
            requestOptions.v = false;
            return requestOptions;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    @CheckResult
    public <T> RequestOptions optionalTransform(@NonNull Class<T> cls, @NonNull Transformation<T> transformation) {
        return k(cls, transformation, false);
    }

    @NonNull
    @CheckResult
    public <T> RequestOptions transform(@NonNull Class<T> cls, @NonNull Transformation<T> transformation) {
        return k(cls, transformation, true);
    }

    @NonNull
    @CheckResult
    public RequestOptions override(int i) {
        return override(i, i);
    }

    @NonNull
    @CheckResult
    public RequestOptions error(@DrawableRes int i) {
        if (this.v) {
            return mo3297clone().error(i);
        }
        this.f = i;
        int i2 = this.a | 32;
        this.a = i2;
        this.e = null;
        this.a = i2 & (-17);
        return h();
    }

    @NonNull
    @CheckResult
    public RequestOptions fallback(@DrawableRes int i) {
        if (this.v) {
            return mo3297clone().fallback(i);
        }
        this.p = i;
        int i2 = this.a | 16384;
        this.a = i2;
        this.o = null;
        this.a = i2 & (-8193);
        return h();
    }

    @NonNull
    @CheckResult
    public RequestOptions placeholder(@DrawableRes int i) {
        if (this.v) {
            return mo3297clone().placeholder(i);
        }
        this.h = i;
        int i2 = this.a | 128;
        this.a = i2;
        this.g = null;
        this.a = i2 & (-65);
        return h();
    }
}
