package coil.intercept;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import coil.ComponentRegistry;
import coil.EventListener;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.decode.Decoder;
import coil.decode.ImageSource;
import coil.fetch.DrawableResult;
import coil.fetch.FetchResult;
import coil.fetch.Fetcher;
import coil.fetch.SourceResult;
import coil.memory.MemoryCache;
import coil.memory.MemoryCacheService;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.request.Options;
import coil.request.RequestService;
import coil.request.SuccessResult;
import coil.size.Scale;
import coil.size.Size;
import coil.transform.Transformation;
import coil.util.Bitmaps;
import coil.util.DrawableUtils;
import coil.util.Logger;
import coil.util.Utils;
import com.xiaomi.fit.fitness.parser.schema.EcgReportKey;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 02\u00020\u0001:\u000201B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002JA\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010 J1\u0010!\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010#J9\u0010$\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010&J\u0019\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010+J3\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0081@ø\u0001\u0000¢\u0006\u0004\b.\u0010/R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Lcoil/intercept/EngineInterceptor;", "Lcoil/intercept/Interceptor;", "imageLoader", "Lcoil/ImageLoader;", "requestService", "Lcoil/request/RequestService;", "logger", "Lcoil/util/Logger;", "(Lcoil/ImageLoader;Lcoil/request/RequestService;Lcoil/util/Logger;)V", "memoryCacheService", "Lcoil/memory/MemoryCacheService;", "convertDrawableToBitmap", "Landroid/graphics/Bitmap;", "drawable", "Landroid/graphics/drawable/Drawable;", "options", "Lcoil/request/Options;", "transformations", "", "Lcoil/transform/Transformation;", "decode", "Lcoil/intercept/EngineInterceptor$ExecuteResult;", "fetchResult", "Lcoil/fetch/SourceResult;", "components", "Lcoil/ComponentRegistry;", "request", "Lcoil/request/ImageRequest;", "mappedData", "", "eventListener", "Lcoil/EventListener;", "(Lcoil/fetch/SourceResult;Lcoil/ComponentRegistry;Lcoil/request/ImageRequest;Ljava/lang/Object;Lcoil/request/Options;Lcoil/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "_options", "(Lcoil/request/ImageRequest;Ljava/lang/Object;Lcoil/request/Options;Lcoil/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetch", "Lcoil/fetch/FetchResult;", "(Lcoil/ComponentRegistry;Lcoil/request/ImageRequest;Ljava/lang/Object;Lcoil/request/Options;Lcoil/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercept", "Lcoil/request/ImageResult;", "chain", "Lcoil/intercept/Interceptor$Chain;", "(Lcoil/intercept/Interceptor$Chain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transform", "result", "transform$coil_base_release", "(Lcoil/intercept/EngineInterceptor$ExecuteResult;Lcoil/request/ImageRequest;Lcoil/request/Options;Lcoil/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ExecuteResult", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class EngineInterceptor implements Interceptor {

    @NotNull
    private static final String TAG = "EngineInterceptor";

    @NotNull
    private final ImageLoader imageLoader;

    @Nullable
    private final Logger logger;

    @NotNull
    private final MemoryCacheService memoryCacheService;

    @NotNull
    private final RequestService requestService;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ0\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcoil/intercept/EngineInterceptor$ExecuteResult;", "", "drawable", "Landroid/graphics/drawable/Drawable;", "isSampled", "", EcgReportKey.dataSource, "Lcoil/decode/DataSource;", "diskCacheKey", "", "(Landroid/graphics/drawable/Drawable;ZLcoil/decode/DataSource;Ljava/lang/String;)V", "getDataSource", "()Lcoil/decode/DataSource;", "getDiskCacheKey", "()Ljava/lang/String;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "()Z", "copy", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ExecuteResult {

        @NotNull
        private final DataSource dataSource;

        @Nullable
        private final String diskCacheKey;

        @NotNull
        private final Drawable drawable;
        private final boolean isSampled;

        public ExecuteResult(@NotNull Drawable drawable, boolean z, @NotNull DataSource dataSource, @Nullable String str) {
            this.drawable = drawable;
            this.isSampled = z;
            this.dataSource = dataSource;
            this.diskCacheKey = str;
        }

        public static /* synthetic */ ExecuteResult copy$default(ExecuteResult executeResult, Drawable drawable, boolean z, DataSource dataSource, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                drawable = executeResult.drawable;
            }
            if ((i & 2) != 0) {
                z = executeResult.isSampled;
            }
            if ((i & 4) != 0) {
                dataSource = executeResult.dataSource;
            }
            if ((i & 8) != 0) {
                str = executeResult.diskCacheKey;
            }
            return executeResult.copy(drawable, z, dataSource, str);
        }

        @NotNull
        public final ExecuteResult copy(@NotNull Drawable drawable, boolean isSampled, @NotNull DataSource dataSource, @Nullable String diskCacheKey) {
            return new ExecuteResult(drawable, isSampled, dataSource, diskCacheKey);
        }

        @NotNull
        public final DataSource getDataSource() {
            return this.dataSource;
        }

        @Nullable
        public final String getDiskCacheKey() {
            return this.diskCacheKey;
        }

        @NotNull
        public final Drawable getDrawable() {
            return this.drawable;
        }

        /* JADX INFO: renamed from: isSampled, reason: from getter */
        public final boolean getIsSampled() {
            return this.isSampled;
        }
    }

    /* JADX INFO: renamed from: coil.intercept.EngineInterceptor$decode$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {199}, m = "decode", n = {"this", "fetchResult", "components", "request", "mappedData", "options", "eventListener", "decoder", "searchIndex"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EngineInterceptor.this.decode(null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: coil.intercept.EngineInterceptor$execute$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {122, 126, 144}, m = "execute", n = {"this", "request", "mappedData", "eventListener", "options", "components", "fetchResult", "this", "request", "eventListener", "options", "fetchResult"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class C13261 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public C13261(Continuation<? super C13261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EngineInterceptor.this.execute(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: coil.intercept.EngineInterceptor$fetch$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {165}, m = "fetch", n = {"this", "components", "request", "mappedData", "options", "eventListener", "fetcher", "searchIndex"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"})
    public static final class C13271 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C13271(Continuation<? super C13271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EngineInterceptor.this.fetch(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: coil.intercept.EngineInterceptor$intercept$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0}, l = {73}, m = "intercept", n = {"this", "chain"}, s = {"L$0", "L$1"})
    public static final class C13281 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C13281(Continuation<? super C13281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EngineInterceptor.this.intercept(null, this);
        }
    }

    /* JADX INFO: renamed from: coil.intercept.EngineInterceptor$intercept$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcoil/request/SuccessResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SuccessResult>, Object> {
        final /* synthetic */ MemoryCache.Key $cacheKey;
        final /* synthetic */ Interceptor.Chain $chain;
        final /* synthetic */ EventListener $eventListener;
        final /* synthetic */ Object $mappedData;
        final /* synthetic */ Options $options;
        final /* synthetic */ ImageRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, MemoryCache.Key key, Interceptor.Chain chain, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$request = imageRequest;
            this.$mappedData = obj;
            this.$options = options;
            this.$eventListener = eventListener;
            this.$cacheKey = key;
            this.$chain = chain;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EngineInterceptor.this.new AnonymousClass2(this.$request, this.$mappedData, this.$options, this.$eventListener, this.$cacheKey, this.$chain, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EngineInterceptor engineInterceptor = EngineInterceptor.this;
                ImageRequest imageRequest = this.$request;
                Object obj2 = this.$mappedData;
                Options options = this.$options;
                EventListener eventListener = this.$eventListener;
                this.label = 1;
                obj = engineInterceptor.execute(imageRequest, obj2, options, eventListener, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ExecuteResult executeResult = (ExecuteResult) obj;
            return new SuccessResult(executeResult.getDrawable(), this.$request, executeResult.getDataSource(), EngineInterceptor.this.memoryCacheService.setCacheValue(this.$cacheKey, this.$request, executeResult) ? this.$cacheKey : null, executeResult.getDiskCacheKey(), executeResult.getIsSampled(), Utils.isPlaceholderCached(this.$chain));
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super SuccessResult> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public EngineInterceptor(@NotNull ImageLoader imageLoader, @NotNull RequestService requestService, @Nullable Logger logger) {
        this.imageLoader = imageLoader;
        this.requestService = requestService;
        this.logger = logger;
        this.memoryCacheService = new MemoryCacheService(imageLoader, requestService, logger);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap convertDrawableToBitmap(Drawable drawable, Options options, List<? extends Transformation> transformations) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Bitmap.Config safeConfig = Bitmaps.getSafeConfig(bitmap);
            if (ArraysKt___ArraysKt.contains(Utils.getVALID_TRANSFORMATION_CONFIGS(), safeConfig)) {
                return bitmap;
            }
            Logger logger = this.logger;
            if (logger != null && logger.getLevel() <= 4) {
                logger.log(TAG, 4, "Converting bitmap with config " + safeConfig + " to apply transformations: " + transformations + '.', null);
            }
        } else {
            Logger logger2 = this.logger;
            if (logger2 != null && logger2.getLevel() <= 4) {
                logger2.log(TAG, 4, "Converting drawable of type " + drawable.getClass().getCanonicalName() + " to apply transformations: " + transformations + '.', null);
            }
        }
        return DrawableUtils.INSTANCE.convertToBitmap(drawable, options.getConfig(), options.getSize(), options.getScale(), options.getAllowInexactSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x007d  */
    /* JADX WARN: Code duplicated, block: B:19:0x00ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:23:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00ac -> B:21:0x00b4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object decode(coil.fetch.SourceResult r18, coil.ComponentRegistry r19, coil.request.ImageRequest r20, java.lang.Object r21, coil.request.Options r22, coil.EventListener r23, kotlin.coroutines.Continuation<? super coil.intercept.EngineInterceptor.ExecuteResult> r24) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor.decode(coil.fetch.SourceResult, coil.ComponentRegistry, coil.request.ImageRequest, java.lang.Object, coil.request.Options, coil.EventListener, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:50:0x0162 A[Catch: all -> 0x00e1, TRY_LEAVE, TryCatch #0 {all -> 0x00e1, blocks: (B:48:0x0157, B:50:0x0162, B:56:0x01a2, B:58:0x01a6, B:79:0x0212, B:80:0x0217, B:28:0x00a6, B:30:0x00b2, B:33:0x00e5, B:35:0x00eb, B:44:0x011a, B:37:0x00f1, B:39:0x0100, B:40:0x0107, B:42:0x010d, B:43:0x0114), top: B:89:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0191 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0192  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a2 A[Catch: all -> 0x00e1, TRY_ENTER, TryCatch #0 {all -> 0x00e1, blocks: (B:48:0x0157, B:50:0x0162, B:56:0x01a2, B:58:0x01a6, B:79:0x0212, B:80:0x0217, B:28:0x00a6, B:30:0x00b2, B:33:0x00e5, B:35:0x00eb, B:44:0x011a, B:37:0x00f1, B:39:0x0100, B:40:0x0107, B:42:0x010d, B:43:0x0114), top: B:89:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01a6 A[Catch: all -> 0x00e1, TRY_LEAVE, TryCatch #0 {all -> 0x00e1, blocks: (B:48:0x0157, B:50:0x0162, B:56:0x01a2, B:58:0x01a6, B:79:0x0212, B:80:0x0217, B:28:0x00a6, B:30:0x00b2, B:33:0x00e5, B:35:0x00eb, B:44:0x011a, B:37:0x00f1, B:39:0x0100, B:40:0x0107, B:42:0x010d, B:43:0x0114), top: B:89:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x0212 A[Catch: all -> 0x00e1, TRY_ENTER, TryCatch #0 {all -> 0x00e1, blocks: (B:48:0x0157, B:50:0x0162, B:56:0x01a2, B:58:0x01a6, B:79:0x0212, B:80:0x0217, B:28:0x00a6, B:30:0x00b2, B:33:0x00e5, B:35:0x00eb, B:44:0x011a, B:37:0x00f1, B:39:0x0100, B:40:0x0107, B:42:0x010d, B:43:0x0114), top: B:89:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x021e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0223  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, coil.ComponentRegistry] */
    /* JADX WARN: Type inference failed for: r1v20, types: [T, coil.request.Options] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, coil.ComponentRegistry] */
    public final Object execute(ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, Continuation<? super ExecuteResult> continuation) throws Throwable {
        C13261 c13261;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Object obj2;
        EventListener eventListener2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        ImageRequest imageRequest2;
        EngineInterceptor engineInterceptor;
        T t;
        T t2;
        FetchResult fetchResult;
        Ref.ObjectRef objectRef6;
        ImageRequest imageRequest3;
        ExecuteResult executeResult;
        EngineInterceptor engineInterceptor2;
        Object objWithContext;
        EventListener eventListener3;
        ImageRequest imageRequest4;
        EngineInterceptor engineInterceptor3;
        SourceResult sourceResult;
        ImageSource source;
        T t3;
        SourceResult sourceResult2;
        Object objTransform$coil_base_release;
        ImageSource source2;
        Object obj3;
        Object obj4;
        Bitmap bitmap;
        if (continuation instanceof C13261) {
            c13261 = (C13261) continuation;
            int i = c13261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13261.label = i - Integer.MIN_VALUE;
            } else {
                c13261 = new C13261(continuation);
            }
        } else {
            c13261 = new C13261(continuation);
        }
        C13261 c13262 = c13261;
        Object obj5 = c13262.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c13262.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj5);
            Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
            objectRef7.element = options;
            Ref.ObjectRef objectRef8 = new Ref.ObjectRef();
            objectRef8.element = this.imageLoader.getComponents();
            objectRef = new Ref.ObjectRef();
            try {
                if (!this.requestService.allowHardwareWorkerThread((Options) objectRef7.element)) {
                    Options options2 = (Options) objectRef7.element;
                    objectRef7.element = options2.copy((32765 & 1) != 0 ? options2.context : null, (32765 & 2) != 0 ? options2.config : Bitmap.Config.ARGB_8888, (32765 & 4) != 0 ? options2.colorSpace : null, (32765 & 8) != 0 ? options2.size : null, (32765 & 16) != 0 ? options2.scale : null, (32765 & 32) != 0 ? options2.allowInexactSize : false, (32765 & 64) != 0 ? options2.allowRgb565 : false, (32765 & 128) != 0 ? options2.premultipliedAlpha : false, (32765 & 256) != 0 ? options2.diskCacheKey : null, (32765 & 512) != 0 ? options2.headers : null, (32765 & 1024) != 0 ? options2.tags : null, (32765 & 2048) != 0 ? options2.parameters : null, (32765 & 4096) != 0 ? options2.memoryCachePolicy : null, (32765 & 8192) != 0 ? options2.diskCachePolicy : null, (32765 & 16384) != 0 ? options2.networkCachePolicy : null);
                }
                if (imageRequest.getFetcherFactory() != null || imageRequest.getDecoderFactory() != null) {
                    ComponentRegistry.Builder builderNewBuilder = ((ComponentRegistry) objectRef8.element).newBuilder();
                    Pair<Fetcher.Factory<?>, Class<?>> fetcherFactory = imageRequest.getFetcherFactory();
                    if (fetcherFactory != null) {
                        builderNewBuilder.getFetcherFactories$coil_base_release().add(0, fetcherFactory);
                    }
                    Decoder.Factory decoderFactory = imageRequest.getDecoderFactory();
                    if (decoderFactory != null) {
                        builderNewBuilder.getDecoderFactories$coil_base_release().add(0, decoderFactory);
                    }
                    objectRef8.element = builderNewBuilder.build();
                }
                ComponentRegistry componentRegistry = (ComponentRegistry) objectRef8.element;
                Options options3 = (Options) objectRef7.element;
                c13262.L$0 = this;
                c13262.L$1 = imageRequest;
                c13262.L$2 = obj;
                c13262.L$3 = eventListener;
                c13262.L$4 = objectRef7;
                c13262.L$5 = objectRef8;
                c13262.L$6 = objectRef;
                c13262.L$7 = objectRef;
                c13262.label = 1;
                Object objFetch = fetch(componentRegistry, imageRequest, obj, options3, eventListener, c13262);
                if (objFetch == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj2 = obj;
                eventListener2 = eventListener;
                objectRef3 = objectRef7;
                objectRef4 = objectRef8;
                objectRef5 = objectRef;
                imageRequest2 = imageRequest;
                engineInterceptor = this;
                t = objFetch;
                objectRef5.element = t;
                t2 = objectRef.element;
                fetchResult = (FetchResult) t2;
                if (fetchResult instanceof SourceResult) {
                    CoroutineDispatcher decoderDispatcher = imageRequest2.getDecoderDispatcher();
                    EngineInterceptor$execute$executeResult$1 engineInterceptor$execute$executeResult$1 = new EngineInterceptor$execute$executeResult$1(engineInterceptor, objectRef, objectRef4, imageRequest2, obj2, objectRef3, eventListener2, null);
                    c13262.L$0 = engineInterceptor;
                    c13262.L$1 = imageRequest2;
                    c13262.L$2 = eventListener2;
                    c13262.L$3 = objectRef3;
                    c13262.L$4 = objectRef;
                    c13262.L$5 = null;
                    c13262.L$6 = null;
                    c13262.L$7 = null;
                    c13262.label = 2;
                    objWithContext = BuildersKt.withContext(decoderDispatcher, engineInterceptor$execute$executeResult$1, c13262);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eventListener3 = eventListener2;
                    imageRequest4 = imageRequest2;
                    engineInterceptor3 = engineInterceptor;
                    objectRef2 = objectRef;
                    obj3 = objWithContext;
                    objectRef = objectRef2;
                    engineInterceptor2 = engineInterceptor3;
                    eventListener2 = eventListener3;
                    imageRequest3 = imageRequest4;
                    Ref.ObjectRef objectRef9 = objectRef3;
                    executeResult = (ExecuteResult) obj3;
                    objectRef6 = objectRef9;
                } else {
                    if (fetchResult instanceof DrawableResult) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ExecuteResult executeResult2 = new ExecuteResult(((DrawableResult) t2).getDrawable(), ((DrawableResult) objectRef.element).getIsSampled(), ((DrawableResult) objectRef.element).getDataSource(), null);
                    objectRef6 = objectRef3;
                    imageRequest3 = imageRequest2;
                    executeResult = executeResult2;
                    engineInterceptor2 = engineInterceptor;
                }
                t3 = objectRef.element;
                if (t3 instanceof SourceResult) {
                    sourceResult2 = (SourceResult) t3;
                } else {
                    sourceResult2 = null;
                }
                if (sourceResult2 != null) {
                    Utils.closeQuietly(source2);
                }
                Options options4 = (Options) objectRef6.element;
                c13262.L$0 = null;
                c13262.L$1 = null;
                c13262.L$2 = null;
                c13262.L$3 = null;
                c13262.L$4 = null;
                c13262.L$5 = null;
                c13262.L$6 = null;
                c13262.L$7 = null;
                c13262.label = 3;
                objTransform$coil_base_release = engineInterceptor2.transform$coil_base_release(executeResult, imageRequest3, options4, eventListener2, c13262);
                obj4 = objTransform$coil_base_release;
                if (objTransform$coil_base_release == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th) {
                th = th;
                objectRef2 = objectRef;
                T t4 = objectRef2.element;
                if (t4 instanceof SourceResult) {
                }
                if (sourceResult != null && (source = sourceResult.getSource()) != null) {
                    Utils.closeQuietly(source);
                }
                throw th;
            }
        } else if (i2 == 1) {
            objectRef5 = (Ref.ObjectRef) c13262.L$7;
            Ref.ObjectRef objectRef10 = (Ref.ObjectRef) c13262.L$6;
            Ref.ObjectRef objectRef11 = (Ref.ObjectRef) c13262.L$5;
            Ref.ObjectRef objectRef12 = (Ref.ObjectRef) c13262.L$4;
            eventListener2 = (EventListener) c13262.L$3;
            Object obj6 = c13262.L$2;
            imageRequest2 = (ImageRequest) c13262.L$1;
            engineInterceptor = (EngineInterceptor) c13262.L$0;
            try {
                ResultKt.throwOnFailure(obj5);
                objectRef = objectRef10;
                objectRef4 = objectRef11;
                objectRef3 = objectRef12;
                obj2 = obj6;
                t = obj5;
                objectRef5.element = t;
                t2 = objectRef.element;
                fetchResult = (FetchResult) t2;
                if (fetchResult instanceof SourceResult) {
                    CoroutineDispatcher decoderDispatcher2 = imageRequest2.getDecoderDispatcher();
                    EngineInterceptor$execute$executeResult$1 engineInterceptor$execute$executeResult$2 = new EngineInterceptor$execute$executeResult$1(engineInterceptor, objectRef, objectRef4, imageRequest2, obj2, objectRef3, eventListener2, null);
                    c13262.L$0 = engineInterceptor;
                    c13262.L$1 = imageRequest2;
                    c13262.L$2 = eventListener2;
                    c13262.L$3 = objectRef3;
                    c13262.L$4 = objectRef;
                    c13262.L$5 = null;
                    c13262.L$6 = null;
                    c13262.L$7 = null;
                    c13262.label = 2;
                    objWithContext = BuildersKt.withContext(decoderDispatcher2, engineInterceptor$execute$executeResult$2, c13262);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eventListener3 = eventListener2;
                    imageRequest4 = imageRequest2;
                    engineInterceptor3 = engineInterceptor;
                    objectRef2 = objectRef;
                    obj3 = objWithContext;
                    objectRef = objectRef2;
                    engineInterceptor2 = engineInterceptor3;
                    eventListener2 = eventListener3;
                    imageRequest3 = imageRequest4;
                    Ref.ObjectRef objectRef13 = objectRef3;
                    executeResult = (ExecuteResult) obj3;
                    objectRef6 = objectRef13;
                } else {
                    if (fetchResult instanceof DrawableResult) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ExecuteResult executeResult3 = new ExecuteResult(((DrawableResult) t2).getDrawable(), ((DrawableResult) objectRef.element).getIsSampled(), ((DrawableResult) objectRef.element).getDataSource(), null);
                    objectRef6 = objectRef3;
                    imageRequest3 = imageRequest2;
                    executeResult = executeResult3;
                    engineInterceptor2 = engineInterceptor;
                }
                t3 = objectRef.element;
                if (t3 instanceof SourceResult) {
                    sourceResult2 = (SourceResult) t3;
                } else {
                    sourceResult2 = null;
                }
                if (sourceResult2 != null) {
                    Utils.closeQuietly(source2);
                }
                Options options5 = (Options) objectRef6.element;
                c13262.L$0 = null;
                c13262.L$1 = null;
                c13262.L$2 = null;
                c13262.L$3 = null;
                c13262.L$4 = null;
                c13262.L$5 = null;
                c13262.L$6 = null;
                c13262.L$7 = null;
                c13262.label = 3;
                objTransform$coil_base_release = engineInterceptor2.transform$coil_base_release(executeResult, imageRequest3, options5, eventListener2, c13262);
                obj4 = objTransform$coil_base_release;
                if (objTransform$coil_base_release == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th2) {
                th = th2;
                objectRef2 = objectRef10;
                T t5 = objectRef2.element;
                if (t5 instanceof SourceResult) {
                }
                if (sourceResult != null) {
                    Utils.closeQuietly(source);
                }
                throw th;
            }
        } else if (i2 == 2) {
            objectRef2 = (Ref.ObjectRef) c13262.L$4;
            objectRef3 = (Ref.ObjectRef) c13262.L$3;
            eventListener3 = (EventListener) c13262.L$2;
            imageRequest4 = (ImageRequest) c13262.L$1;
            engineInterceptor3 = (EngineInterceptor) c13262.L$0;
            try {
                ResultKt.throwOnFailure(obj5);
                obj3 = obj5;
                objectRef = objectRef2;
                engineInterceptor2 = engineInterceptor3;
                eventListener2 = eventListener3;
                imageRequest3 = imageRequest4;
                Ref.ObjectRef objectRef14 = objectRef3;
                executeResult = (ExecuteResult) obj3;
                objectRef6 = objectRef14;
                t3 = objectRef.element;
                if (t3 instanceof SourceResult) {
                    sourceResult2 = (SourceResult) t3;
                } else {
                    sourceResult2 = null;
                }
                if (sourceResult2 != null && (source2 = sourceResult2.getSource()) != null) {
                    Utils.closeQuietly(source2);
                }
                Options options6 = (Options) objectRef6.element;
                c13262.L$0 = null;
                c13262.L$1 = null;
                c13262.L$2 = null;
                c13262.L$3 = null;
                c13262.L$4 = null;
                c13262.L$5 = null;
                c13262.L$6 = null;
                c13262.L$7 = null;
                c13262.label = 3;
                objTransform$coil_base_release = engineInterceptor2.transform$coil_base_release(executeResult, imageRequest3, options6, eventListener2, c13262);
                obj4 = objTransform$coil_base_release;
                if (objTransform$coil_base_release == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th3) {
                th = th3;
                T t6 = objectRef2.element;
                sourceResult = t6 instanceof SourceResult ? (SourceResult) t6 : null;
                if (sourceResult != null) {
                    Utils.closeQuietly(source);
                }
                throw th;
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj5);
            obj4 = obj5;
        }
        ExecuteResult executeResult4 = (ExecuteResult) obj4;
        Drawable drawable = executeResult4.getDrawable();
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            bitmap.prepareToDraw();
        }
        return executeResult4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0064  */
    /* JADX WARN: Code duplicated, block: B:19:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0091  */
    /* JADX WARN: Code duplicated, block: B:24:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x009d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0091 -> B:21:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object fetch(coil.ComponentRegistry r10, coil.request.ImageRequest r11, java.lang.Object r12, coil.request.Options r13, coil.EventListener r14, kotlin.coroutines.Continuation<? super coil.fetch.FetchResult> r15) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor.fetch(coil.ComponentRegistry, coil.request.ImageRequest, java.lang.Object, coil.request.Options, coil.EventListener, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // coil.intercept.Interceptor
    @Nullable
    public Object intercept(@NotNull Interceptor.Chain chain, @NotNull Continuation<? super ImageResult> continuation) throws Throwable {
        C13281 c13281;
        EngineInterceptor engineInterceptor;
        if (continuation instanceof C13281) {
            c13281 = (C13281) continuation;
            int i = c13281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13281.label = i - Integer.MIN_VALUE;
            } else {
                c13281 = new C13281(continuation);
            }
        } else {
            c13281 = new C13281(continuation);
        }
        Object objWithContext = c13281.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c13281.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chain = (Interceptor.Chain) c13281.L$1;
            engineInterceptor = (EngineInterceptor) c13281.L$0;
            try {
                ResultKt.throwOnFailure(objWithContext);
            } catch (Throwable th) {
                th = th;
                if (th instanceof CancellationException) {
                    throw th;
                }
                return engineInterceptor.requestService.errorResult(chain.getRequest(), th);
            }
        }
        ResultKt.throwOnFailure(objWithContext);
        try {
            ImageRequest request = chain.getRequest();
            Object data = request.getData();
            Size size = chain.getSize();
            EventListener eventListener = Utils.getEventListener(chain);
            Options options = this.requestService.options(request, size);
            Scale scale = options.getScale();
            eventListener.mapStart(request, data);
            Object map = this.imageLoader.getComponents().map(data, options);
            eventListener.mapEnd(request, map);
            MemoryCache.Key keyNewCacheKey = this.memoryCacheService.newCacheKey(request, map, options, eventListener);
            MemoryCache.Value cacheValue = keyNewCacheKey != null ? this.memoryCacheService.getCacheValue(request, keyNewCacheKey, size, scale) : null;
            if (cacheValue != null) {
                return this.memoryCacheService.newResult(chain, request, keyNewCacheKey, cacheValue);
            }
            CoroutineDispatcher fetcherDispatcher = request.getFetcherDispatcher();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(request, map, options, eventListener, keyNewCacheKey, chain, null);
            c13281.L$0 = this;
            c13281.L$1 = chain;
            c13281.label = 1;
            objWithContext = BuildersKt.withContext(fetcherDispatcher, anonymousClass2, c13281);
            return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
        } catch (Throwable th2) {
            th = th2;
            engineInterceptor = this;
            if (th instanceof CancellationException) {
                return engineInterceptor.requestService.errorResult(chain.getRequest(), th);
            }
            throw th;
        }
    }

    @VisibleForTesting
    @Nullable
    public final Object transform$coil_base_release(@NotNull ExecuteResult executeResult, @NotNull ImageRequest imageRequest, @NotNull Options options, @NotNull EventListener eventListener, @NotNull Continuation<? super ExecuteResult> continuation) {
        List<Transformation> transformations = imageRequest.getTransformations();
        if (transformations.isEmpty()) {
            return executeResult;
        }
        if ((executeResult.getDrawable() instanceof BitmapDrawable) || imageRequest.getAllowConversionToBitmap()) {
            return BuildersKt.withContext(imageRequest.getTransformationDispatcher(), new EngineInterceptor$transform$3(this, executeResult, options, transformations, eventListener, imageRequest, null), continuation);
        }
        Logger logger = this.logger;
        if (logger != null && logger.getLevel() <= 4) {
            logger.log(TAG, 4, "allowConversionToBitmap=false, skipping transformations for type " + executeResult.getDrawable().getClass().getCanonicalName() + '.', null);
        }
        return executeResult;
    }
}
