package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.ErrorRequestCoordinator;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.RequestFutureTarget;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.ThumbnailRequestCoordinator;
import com.bumptech.glide.request.target.PreloadTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.target.ViewTarget;
import com.bumptech.glide.signature.ApplicationVersionSignature;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class RequestBuilder<TranscodeType> implements Cloneable, c<RequestBuilder<TranscodeType>> {
    public static final RequestOptions DOWNLOAD_ONLY_OPTIONS = new RequestOptions().diskCacheStrategy(DiskCacheStrategy.DATA).priority(Priority.LOW).skipMemoryCache(true);
    private final Context a;
    private final RequestManager b;
    private final Class<TranscodeType> c;
    private final RequestOptions d;
    private final Glide e;
    private final GlideContext f;

    @NonNull
    private TransitionOptions<?, ? super TranscodeType> g;

    @Nullable
    private Object h;

    @Nullable
    private List<RequestListener<TranscodeType>> i;

    @Nullable
    private RequestBuilder<TranscodeType> j;

    @Nullable
    private RequestBuilder<TranscodeType> k;

    @Nullable
    private Float l;
    private boolean m;
    private boolean n;
    private boolean o;

    @NonNull
    public RequestOptions requestOptions;

    public class a implements Runnable {
        public final /* synthetic */ RequestFutureTarget a;

        public a(RequestFutureTarget requestFutureTarget) {
            this.a = requestFutureTarget;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.isCancelled()) {
                return;
            }
            RequestBuilder requestBuilder = RequestBuilder.this;
            RequestFutureTarget requestFutureTarget = this.a;
            requestBuilder.e(requestFutureTarget, requestFutureTarget);
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Priority.values().length];
            b = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public RequestBuilder(Glide glide, RequestManager requestManager, Class<TranscodeType> cls, Context context) {
        this.m = true;
        this.e = glide;
        this.b = requestManager;
        this.c = cls;
        RequestOptions requestOptionsA = requestManager.a();
        this.d = requestOptionsA;
        this.a = context;
        this.g = requestManager.b(cls);
        this.requestOptions = requestOptionsA;
        this.f = glide.d();
    }

    private Request a(Target<TranscodeType> target, @Nullable RequestListener<TranscodeType> requestListener, RequestOptions requestOptions) {
        return b(target, requestListener, null, this.g, requestOptions.getPriority(), requestOptions.getOverrideWidth(), requestOptions.getOverrideHeight(), requestOptions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Request b(Target<TranscodeType> target, @Nullable RequestListener<TranscodeType> requestListener, @Nullable RequestCoordinator requestCoordinator, TransitionOptions<?, ? super TranscodeType> transitionOptions, Priority priority, int i, int i2, RequestOptions requestOptions) {
        RequestCoordinator requestCoordinator2;
        RequestCoordinator errorRequestCoordinator;
        if (this.k != null) {
            errorRequestCoordinator = new ErrorRequestCoordinator(requestCoordinator);
            requestCoordinator2 = errorRequestCoordinator;
        } else {
            requestCoordinator2 = null;
            errorRequestCoordinator = requestCoordinator;
        }
        Request requestC = c(target, requestListener, errorRequestCoordinator, transitionOptions, priority, i, i2, requestOptions);
        if (requestCoordinator2 == null) {
            return requestC;
        }
        int overrideWidth = this.k.requestOptions.getOverrideWidth();
        int overrideHeight = this.k.requestOptions.getOverrideHeight();
        if (Util.isValidDimensions(i, i2) && !this.k.requestOptions.isValidOverride()) {
            overrideWidth = requestOptions.getOverrideWidth();
            overrideHeight = requestOptions.getOverrideHeight();
        }
        RequestBuilder<TranscodeType> requestBuilder = this.k;
        ErrorRequestCoordinator errorRequestCoordinator2 = requestCoordinator2;
        errorRequestCoordinator2.setRequests(requestC, requestBuilder.b(target, requestListener, requestCoordinator2, requestBuilder.g, requestBuilder.requestOptions.getPriority(), overrideWidth, overrideHeight, this.k.requestOptions));
        return errorRequestCoordinator2;
    }

    private Request c(Target<TranscodeType> target, RequestListener<TranscodeType> requestListener, @Nullable RequestCoordinator requestCoordinator, TransitionOptions<?, ? super TranscodeType> transitionOptions, Priority priority, int i, int i2, RequestOptions requestOptions) {
        RequestBuilder<TranscodeType> requestBuilder = this.j;
        if (requestBuilder == null) {
            if (this.l == null) {
                return i(target, requestListener, requestOptions, requestCoordinator, transitionOptions, priority, i, i2);
            }
            ThumbnailRequestCoordinator thumbnailRequestCoordinator = new ThumbnailRequestCoordinator(requestCoordinator);
            thumbnailRequestCoordinator.setRequests(i(target, requestListener, requestOptions, thumbnailRequestCoordinator, transitionOptions, priority, i, i2), i(target, requestListener, requestOptions.mo3297clone().sizeMultiplier(this.l.floatValue()), thumbnailRequestCoordinator, transitionOptions, d(priority), i, i2));
            return thumbnailRequestCoordinator;
        }
        if (this.o) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        TransitionOptions<?, ? super TranscodeType> transitionOptions2 = requestBuilder.m ? transitionOptions : requestBuilder.g;
        Priority priority2 = requestBuilder.requestOptions.isPrioritySet() ? this.j.requestOptions.getPriority() : d(priority);
        int overrideWidth = this.j.requestOptions.getOverrideWidth();
        int overrideHeight = this.j.requestOptions.getOverrideHeight();
        if (Util.isValidDimensions(i, i2) && !this.j.requestOptions.isValidOverride()) {
            overrideWidth = requestOptions.getOverrideWidth();
            overrideHeight = requestOptions.getOverrideHeight();
        }
        ThumbnailRequestCoordinator thumbnailRequestCoordinator2 = new ThumbnailRequestCoordinator(requestCoordinator);
        Request requestI = i(target, requestListener, requestOptions, thumbnailRequestCoordinator2, transitionOptions, priority, i, i2);
        this.o = true;
        RequestBuilder<TranscodeType> requestBuilder2 = this.j;
        Request requestB = requestBuilder2.b(target, requestListener, thumbnailRequestCoordinator2, transitionOptions2, priority2, overrideWidth, overrideHeight, requestBuilder2.requestOptions);
        this.o = false;
        thumbnailRequestCoordinator2.setRequests(requestI, requestB);
        return thumbnailRequestCoordinator2;
    }

    @NonNull
    private Priority d(@NonNull Priority priority) {
        int i = b.b[priority.ordinal()];
        if (i == 1) {
            return Priority.NORMAL;
        }
        if (i == 2) {
            return Priority.HIGH;
        }
        if (i == 3 || i == 4) {
            return Priority.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + this.requestOptions.getPriority());
    }

    private <Y extends Target<TranscodeType>> Y f(@NonNull Y y, @Nullable RequestListener<TranscodeType> requestListener, @NonNull RequestOptions requestOptions) {
        Util.assertMainThread();
        Preconditions.checkNotNull(y);
        if (!this.n) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        RequestOptions requestOptionsAutoClone = requestOptions.autoClone();
        Request requestA = a(y, requestListener, requestOptionsAutoClone);
        Request request = y.getRequest();
        if (!requestA.isEquivalentTo(request) || g(requestOptionsAutoClone, request)) {
            this.b.clear((Target<?>) y);
            y.setRequest(requestA);
            this.b.c(y, requestA);
            return y;
        }
        requestA.recycle();
        if (!((Request) Preconditions.checkNotNull(request)).isRunning()) {
            request.begin();
        }
        return y;
    }

    private boolean g(RequestOptions requestOptions, Request request) {
        return !requestOptions.isMemoryCacheable() && request.isComplete();
    }

    @NonNull
    private RequestBuilder<TranscodeType> h(@Nullable Object obj) {
        this.h = obj;
        this.n = true;
        return this;
    }

    private Request i(Target<TranscodeType> target, RequestListener<TranscodeType> requestListener, RequestOptions requestOptions, RequestCoordinator requestCoordinator, TransitionOptions<?, ? super TranscodeType> transitionOptions, Priority priority, int i, int i2) {
        Context context = this.a;
        GlideContext glideContext = this.f;
        return SingleRequest.obtain(context, glideContext, this.h, this.c, requestOptions, i, i2, priority, target, requestListener, this.i, requestCoordinator, glideContext.getEngine(), transitionOptions.a());
    }

    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> addListener(@Nullable RequestListener<TranscodeType> requestListener) {
        if (requestListener != null) {
            if (this.i == null) {
                this.i = new ArrayList();
            }
            this.i.add(requestListener);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> apply(@NonNull RequestOptions requestOptions) {
        Preconditions.checkNotNull(requestOptions);
        this.requestOptions = getMutableOptions().apply(requestOptions);
        return this;
    }

    @CheckResult
    @Deprecated
    public <Y extends Target<File>> Y downloadOnly(@NonNull Y y) {
        return (Y) getDownloadOnlyRequest().into(y);
    }

    @NonNull
    public <Y extends Target<TranscodeType>> Y e(@NonNull Y y, @Nullable RequestListener<TranscodeType> requestListener) {
        return (Y) f(y, requestListener, getMutableOptions());
    }

    @NonNull
    public RequestBuilder<TranscodeType> error(@Nullable RequestBuilder<TranscodeType> requestBuilder) {
        this.k = requestBuilder;
        return this;
    }

    @NonNull
    @CheckResult
    public RequestBuilder<File> getDownloadOnlyRequest() {
        return new RequestBuilder(File.class, this).apply(DOWNLOAD_ONLY_OPTIONS);
    }

    @NonNull
    public RequestOptions getMutableOptions() {
        RequestOptions requestOptions = this.d;
        RequestOptions requestOptions2 = this.requestOptions;
        return requestOptions == requestOptions2 ? requestOptions2.mo3297clone() : requestOptions2;
    }

    @NonNull
    public <Y extends Target<TranscodeType>> Y into(@NonNull Y y) {
        return (Y) e(y, null);
    }

    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> listener(@Nullable RequestListener<TranscodeType> requestListener) {
        this.i = null;
        return addListener(requestListener);
    }

    @NonNull
    public Target<TranscodeType> preload(int i, int i2) {
        return into(PreloadTarget.obtain(this.b, i, i2));
    }

    @NonNull
    public FutureTarget<TranscodeType> submit() {
        return submit(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> thumbnail(@Nullable RequestBuilder<TranscodeType> requestBuilder) {
        this.j = requestBuilder;
        return this;
    }

    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> transition(@NonNull TransitionOptions<?, ? super TranscodeType> transitionOptions) {
        this.g = (TransitionOptions) Preconditions.checkNotNull(transitionOptions);
        this.m = false;
        return this;
    }

    @Override // 
    @CheckResult
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RequestBuilder<TranscodeType> mo3295clone() {
        try {
            RequestBuilder<TranscodeType> requestBuilder = (RequestBuilder) super.clone();
            requestBuilder.requestOptions = requestBuilder.requestOptions.mo3297clone();
            requestBuilder.g = requestBuilder.g.m3296clone();
            return requestBuilder;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @CheckResult
    @Deprecated
    public FutureTarget<File> downloadOnly(int i, int i2) {
        return getDownloadOnlyRequest().submit(i, i2);
    }

    @NonNull
    public ViewTarget<ImageView, TranscodeType> into(@NonNull ImageView imageView) {
        Util.assertMainThread();
        Preconditions.checkNotNull(imageView);
        RequestOptions requestOptionsOptionalCenterCrop = this.requestOptions;
        if (!requestOptionsOptionalCenterCrop.isTransformationSet() && requestOptionsOptionalCenterCrop.isTransformationAllowed() && imageView.getScaleType() != null) {
            switch (b.a[imageView.getScaleType().ordinal()]) {
                case 1:
                    requestOptionsOptionalCenterCrop = requestOptionsOptionalCenterCrop.mo3297clone().optionalCenterCrop();
                    break;
                case 2:
                    requestOptionsOptionalCenterCrop = requestOptionsOptionalCenterCrop.mo3297clone().optionalCenterInside();
                    break;
                case 3:
                case 4:
                case 5:
                    requestOptionsOptionalCenterCrop = requestOptionsOptionalCenterCrop.mo3297clone().optionalFitCenter();
                    break;
                case 6:
                    requestOptionsOptionalCenterCrop = requestOptionsOptionalCenterCrop.mo3297clone().optionalCenterInside();
                    break;
            }
        }
        return (ViewTarget) f(this.f.buildImageViewTarget(imageView, this.c), null, requestOptionsOptionalCenterCrop);
    }

    @NonNull
    public FutureTarget<TranscodeType> submit(int i, int i2) {
        RequestFutureTarget requestFutureTarget = new RequestFutureTarget(this.f.getMainHandler(), i, i2);
        if (Util.isOnBackgroundThread()) {
            this.f.getMainHandler().post(new a(requestFutureTarget));
        } else {
            e(requestFutureTarget, requestFutureTarget);
        }
        return requestFutureTarget;
    }

    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> thumbnail(@Nullable RequestBuilder<TranscodeType>... requestBuilderArr) {
        RequestBuilder<TranscodeType> requestBuilderThumbnail = null;
        if (requestBuilderArr == null || requestBuilderArr.length == 0) {
            return thumbnail((RequestBuilder) null);
        }
        for (int length = requestBuilderArr.length - 1; length >= 0; length--) {
            RequestBuilder<TranscodeType> requestBuilder = requestBuilderArr[length];
            if (requestBuilder != null) {
                requestBuilderThumbnail = requestBuilderThumbnail == null ? requestBuilder : requestBuilder.thumbnail(requestBuilderThumbnail);
            }
        }
        return thumbnail(requestBuilderThumbnail);
    }

    @NonNull
    public Target<TranscodeType> preload() {
        return preload(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> thumbnail(float f) {
        if (f >= 0.0f && f <= 1.0f) {
            this.l = Float.valueOf(f);
            return this;
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    @Override // com.bumptech.glide.c
    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> load(@Nullable Object obj) {
        return h(obj);
    }

    public RequestBuilder(Class<TranscodeType> cls, RequestBuilder<?> requestBuilder) {
        this(requestBuilder.e, requestBuilder.b, cls, requestBuilder.a);
        this.h = requestBuilder.h;
        this.n = requestBuilder.n;
        this.requestOptions = requestBuilder.requestOptions;
    }

    @Override // com.bumptech.glide.c
    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> load(@Nullable Bitmap bitmap) {
        return h(bitmap).apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE));
    }

    @Override // com.bumptech.glide.c
    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> load(@Nullable Drawable drawable) {
        return h(drawable).apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE));
    }

    @Override // com.bumptech.glide.c
    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> load(@Nullable String str) {
        return h(str);
    }

    @Deprecated
    public FutureTarget<TranscodeType> into(int i, int i2) {
        return submit(i, i2);
    }

    @Override // com.bumptech.glide.c
    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> load(@Nullable Uri uri) {
        return h(uri);
    }

    @Override // com.bumptech.glide.c
    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> load(@Nullable File file) {
        return h(file);
    }

    @Override // com.bumptech.glide.c
    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> load(@Nullable @DrawableRes @RawRes Integer num) {
        return h(num).apply(RequestOptions.signatureOf(ApplicationVersionSignature.obtain(this.a)));
    }

    @Override // com.bumptech.glide.c
    @CheckResult
    @Deprecated
    public RequestBuilder<TranscodeType> load(@Nullable URL url) {
        return h(url);
    }

    @Override // com.bumptech.glide.c
    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> load(@Nullable byte[] bArr) {
        RequestBuilder<TranscodeType> requestBuilderH = h(bArr);
        if (!requestBuilderH.requestOptions.isDiskCacheStrategySet()) {
            requestBuilderH = requestBuilderH.apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE));
        }
        return !requestBuilderH.requestOptions.isSkipMemoryCacheSet() ? requestBuilderH.apply(RequestOptions.skipMemoryCacheOf(true)) : requestBuilderH;
    }
}
