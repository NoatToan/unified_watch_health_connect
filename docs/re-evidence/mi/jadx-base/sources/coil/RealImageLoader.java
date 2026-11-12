package coil;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import coil.decode.BitmapFactoryDecoder;
import coil.decode.DataSource;
import coil.disk.DiskCache;
import coil.fetch.AssetUriFetcher;
import coil.fetch.BitmapFetcher;
import coil.fetch.ByteBufferFetcher;
import coil.fetch.ContentUriFetcher;
import coil.fetch.DrawableFetcher;
import coil.fetch.FileFetcher;
import coil.fetch.HttpUriFetcher;
import coil.fetch.ResourceUriFetcher;
import coil.intercept.EngineInterceptor;
import coil.intercept.Interceptor;
import coil.key.FileKeyer;
import coil.key.UriKeyer;
import coil.map.ByteArrayMapper;
import coil.map.FileUriMapper;
import coil.map.HttpUrlMapper;
import coil.map.ResourceIntMapper;
import coil.map.ResourceUriMapper;
import coil.map.StringMapper;
import coil.memory.MemoryCache;
import coil.request.DefaultRequestOptions;
import coil.request.Disposable;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.request.NullRequestData;
import coil.request.NullRequestDataException;
import coil.request.OneShotDisposable;
import coil.request.RequestDelegate;
import coil.request.RequestService;
import coil.request.SuccessResult;
import coil.size.Size;
import coil.size.SizeResolver;
import coil.target.Target;
import coil.target.ViewTarget;
import coil.transition.NoneTransition;
import coil.transition.Transition;
import coil.transition.TransitionTarget;
import coil.util.ImageLoaderOptions;
import coil.util.Lifecycles;
import coil.util.Logger;
import coil.util.SystemCallbacks;
import coil.util.Utils;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorKt;
import okhttp3.Call;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \\2\u00020\u0001:\u0001\\Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015J\u0010\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0016J\u0019\u0010@\u001a\u00020A2\u0006\u0010>\u001a\u00020?H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010BJ!\u0010C\u001a\u00020A2\u0006\u0010D\u001a\u00020?2\u0006\u0010E\u001a\u00020FH\u0083@ø\u0001\u0000¢\u0006\u0002\u0010GJ\b\u0010H\u001a\u00020IH\u0016J\u0018\u0010J\u001a\u00020K2\u0006\u0010>\u001a\u00020?2\u0006\u0010L\u001a\u00020MH\u0002J\"\u0010N\u001a\u00020K2\u0006\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010R2\u0006\u0010L\u001a\u00020MH\u0002J\"\u0010S\u001a\u00020K2\u0006\u0010O\u001a\u00020T2\b\u0010Q\u001a\u0004\u0018\u00010R2\u0006\u0010L\u001a\u00020MH\u0002J\u0015\u0010U\u001a\u00020K2\u0006\u0010V\u001a\u00020FH\u0000¢\u0006\u0002\bWJ\b\u0010X\u001a\u00020KH\u0016J1\u0010Y\u001a\u00020K2\u0006\u0010O\u001a\u00020A2\b\u0010Q\u001a\u0004\u0018\u00010R2\u0006\u0010L\u001a\u00020M2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020K0[H\u0082\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010 \u001a\u0004\u0018\u00010\n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001d\u0010/\u001a\u0004\u0018\u00010\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b2\u0010$\u001a\u0004\b0\u00101R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020;X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"Lcoil/RealImageLoader;", "Lcoil/ImageLoader;", "context", "Landroid/content/Context;", "defaults", "Lcoil/request/DefaultRequestOptions;", "memoryCacheLazy", "Lkotlin/Lazy;", "Lcoil/memory/MemoryCache;", "diskCacheLazy", "Lcoil/disk/DiskCache;", "callFactoryLazy", "Lokhttp3/Call$Factory;", "eventListenerFactory", "Lcoil/EventListener$Factory;", "componentRegistry", "Lcoil/ComponentRegistry;", "options", "Lcoil/util/ImageLoaderOptions;", "logger", "Lcoil/util/Logger;", "(Landroid/content/Context;Lcoil/request/DefaultRequestOptions;Lkotlin/Lazy;Lkotlin/Lazy;Lkotlin/Lazy;Lcoil/EventListener$Factory;Lcoil/ComponentRegistry;Lcoil/util/ImageLoaderOptions;Lcoil/util/Logger;)V", "getCallFactoryLazy", "()Lkotlin/Lazy;", "getComponentRegistry", "()Lcoil/ComponentRegistry;", "components", "getComponents", "getContext", "()Landroid/content/Context;", "getDefaults", "()Lcoil/request/DefaultRequestOptions;", "diskCache", "getDiskCache", "()Lcoil/disk/DiskCache;", "diskCache$delegate", "Lkotlin/Lazy;", "getDiskCacheLazy", "getEventListenerFactory", "()Lcoil/EventListener$Factory;", "interceptors", "", "Lcoil/intercept/Interceptor;", "isShutdown", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getLogger", "()Lcoil/util/Logger;", "memoryCache", "getMemoryCache", "()Lcoil/memory/MemoryCache;", "memoryCache$delegate", "getMemoryCacheLazy", "getOptions", "()Lcoil/util/ImageLoaderOptions;", "requestService", "Lcoil/request/RequestService;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "systemCallbacks", "Lcoil/util/SystemCallbacks;", "enqueue", "Lcoil/request/Disposable;", "request", "Lcoil/request/ImageRequest;", "execute", "Lcoil/request/ImageResult;", "(Lcoil/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeMain", "initialRequest", "type", "", "(Lcoil/request/ImageRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newBuilder", "Lcoil/ImageLoader$Builder;", "onCancel", "", "eventListener", "Lcoil/EventListener;", "onError", "result", "Lcoil/request/ErrorResult;", "target", "Lcoil/target/Target;", "onSuccess", "Lcoil/request/SuccessResult;", "onTrimMemory", "level", "onTrimMemory$coil_base_release", "shutdown", "transition", "setDrawable", "Lkotlin/Function0;", "Companion", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class RealImageLoader implements ImageLoader {
    private static final int REQUEST_TYPE_ENQUEUE = 0;
    private static final int REQUEST_TYPE_EXECUTE = 1;

    @NotNull
    private static final String TAG = "RealImageLoader";

    @NotNull
    private final Lazy<Call.Factory> callFactoryLazy;

    @NotNull
    private final ComponentRegistry componentRegistry;

    @NotNull
    private final ComponentRegistry components;

    @NotNull
    private final Context context;

    @NotNull
    private final DefaultRequestOptions defaults;

    /* JADX INFO: renamed from: diskCache$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy diskCache;

    @NotNull
    private final Lazy<DiskCache> diskCacheLazy;

    @NotNull
    private final EventListener.Factory eventListenerFactory;

    @NotNull
    private final List<Interceptor> interceptors;

    @NotNull
    private final AtomicBoolean isShutdown;

    @Nullable
    private final Logger logger;

    /* JADX INFO: renamed from: memoryCache$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy memoryCache;

    @NotNull
    private final Lazy<MemoryCache> memoryCacheLazy;

    @NotNull
    private final ImageLoaderOptions options;

    @NotNull
    private final RequestService requestService;

    @NotNull
    private final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()).plus(new RealImageLoader$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE, this)));

    @NotNull
    private final SystemCallbacks systemCallbacks;

    /* JADX INFO: renamed from: coil.RealImageLoader$execute$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcoil/request/ImageResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "coil.RealImageLoader$execute$2", f = "RealImageLoader.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ImageResult>, Object> {
        final /* synthetic */ ImageRequest $request;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RealImageLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ImageRequest imageRequest, RealImageLoader realImageLoader, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$request = imageRequest;
            this.this$0 = realImageLoader;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$request, this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Deferred<? extends ImageResult> deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, Dispatchers.getMain().getImmediate(), null, new RealImageLoader$execute$2$job$1(this.this$0, this.$request, null), 2, null);
                if (this.$request.getTarget() instanceof ViewTarget) {
                    Utils.getRequestManager(((ViewTarget) this.$request.getTarget()).getView()).getDisposable(deferredAsync$default);
                }
                this.label = 1;
                obj = deferredAsync$default.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ImageResult> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: coil.RealImageLoader$executeMain$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "coil.RealImageLoader", f = "RealImageLoader.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2}, l = {169, 180, SportReportBaseParser.ReportType.exitTime}, m = "executeMain", n = {"this", "requestDelegate", "request", "eventListener", "this", "requestDelegate", "request", "eventListener", "placeholderBitmap", "this", "requestDelegate", "request", "eventListener"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
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
            return RealImageLoader.this.executeMain(null, 0, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RealImageLoader(@NotNull Context context, @NotNull DefaultRequestOptions defaultRequestOptions, @NotNull Lazy<? extends MemoryCache> lazy, @NotNull Lazy<? extends DiskCache> lazy2, @NotNull Lazy<? extends Call.Factory> lazy3, @NotNull EventListener.Factory factory, @NotNull ComponentRegistry componentRegistry, @NotNull ImageLoaderOptions imageLoaderOptions, @Nullable Logger logger) {
        this.context = context;
        this.defaults = defaultRequestOptions;
        this.memoryCacheLazy = lazy;
        this.diskCacheLazy = lazy2;
        this.callFactoryLazy = lazy3;
        this.eventListenerFactory = factory;
        this.componentRegistry = componentRegistry;
        this.options = imageLoaderOptions;
        this.logger = logger;
        SystemCallbacks systemCallbacks = new SystemCallbacks(this, context, imageLoaderOptions.getNetworkObserverEnabled());
        this.systemCallbacks = systemCallbacks;
        RequestService requestService = new RequestService(this, systemCallbacks, logger);
        this.requestService = requestService;
        this.memoryCache = lazy;
        this.diskCache = lazy2;
        this.components = componentRegistry.newBuilder().add(new HttpUrlMapper(), HttpUrl.class).add(new StringMapper(), String.class).add(new FileUriMapper(), Uri.class).add(new ResourceUriMapper(), Uri.class).add(new ResourceIntMapper(), Integer.class).add(new ByteArrayMapper(), byte[].class).add(new UriKeyer(), Uri.class).add(new FileKeyer(imageLoaderOptions.getAddLastModifiedToFileCacheKey()), File.class).add(new HttpUriFetcher.Factory(lazy3, lazy2, imageLoaderOptions.getRespectCacheHeaders()), Uri.class).add(new FileFetcher.Factory(), File.class).add(new AssetUriFetcher.Factory(), Uri.class).add(new ContentUriFetcher.Factory(), Uri.class).add(new ResourceUriFetcher.Factory(), Uri.class).add(new DrawableFetcher.Factory(), Drawable.class).add(new BitmapFetcher.Factory(), Bitmap.class).add(new ByteBufferFetcher.Factory(), ByteBuffer.class).add(new BitmapFactoryDecoder.Factory(imageLoaderOptions.getBitmapFactoryMaxParallelism(), imageLoaderOptions.getBitmapFactoryExifOrientationPolicy())).build();
        this.interceptors = CollectionsKt___CollectionsKt.plus((Collection<? extends EngineInterceptor>) getComponents().getInterceptors(), new EngineInterceptor(this, requestService, logger));
        this.isShutdown = new AtomicBoolean(false);
        systemCallbacks.register();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:54:0x0114  */
    /* JADX WARN: Code duplicated, block: B:70:0x0189 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x018a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0194 A[Catch: all -> 0x004b, TryCatch #3 {all -> 0x004b, blocks: (B:14:0x0046, B:72:0x018e, B:74:0x0194, B:75:0x019f, B:77:0x01a3), top: B:99:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x019f A[Catch: all -> 0x004b, TryCatch #3 {all -> 0x004b, blocks: (B:14:0x0046, B:72:0x018e, B:74:0x0194, B:75:0x019f, B:77:0x01a3), top: B:99:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01a3 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #3 {all -> 0x004b, blocks: (B:14:0x0046, B:72:0x018e, B:74:0x0194, B:75:0x019f, B:77:0x01a3), top: B:99:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:84:0x01bb A[Catch: all -> 0x01cc, TRY_LEAVE, TryCatch #4 {all -> 0x01cc, blocks: (B:82:0x01b7, B:84:0x01bb, B:89:0x01ce, B:90:0x01d1), top: B:100:0x01b7 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ce A[Catch: all -> 0x01cc, TRY_ENTER, TryCatch #4 {all -> 0x01cc, blocks: (B:82:0x01b7, B:84:0x01bb, B:89:0x01ce, B:90:0x01d1), top: B:100:0x01b7 }] */
    public final Object executeMain(ImageRequest imageRequest, int i, Continuation<? super ImageResult> continuation) {
        AnonymousClass1 anonymousClass1;
        RequestDelegate requestDelegate;
        ImageRequest imageRequestBuild;
        RealImageLoader realImageLoader;
        RequestDelegate requestDelegate2;
        EventListener eventListener;
        RealImageLoader realImageLoader2;
        ImageRequest imageRequest2;
        EventListener eventListener2;
        RequestDelegate requestDelegate3;
        Bitmap bitmap;
        Bitmap bitmap2;
        RealImageLoader realImageLoader3;
        RequestDelegate requestDelegate4;
        ImageRequest imageRequest3;
        ImageResult imageResult;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objWithContext = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass1.label;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objWithContext);
                requestDelegate = this.requestService.requestDelegate(imageRequest, JobKt.getJob(anonymousClass1.getContext()));
                requestDelegate.assertActive();
                imageRequestBuild = ImageRequest.newBuilder$default(imageRequest, null, 1, null).defaults(getDefaults()).build();
                EventListener eventListenerCreate = this.eventListenerFactory.create(imageRequestBuild);
                try {
                    if (Intrinsics.areEqual(imageRequestBuild.getData(), NullRequestData.INSTANCE)) {
                        throw new NullRequestDataException();
                    }
                    requestDelegate.start();
                    if (i == 0) {
                        Lifecycle lifecycle = imageRequestBuild.getLifecycle();
                        anonymousClass1.L$0 = this;
                        anonymousClass1.L$1 = requestDelegate;
                        anonymousClass1.L$2 = imageRequestBuild;
                        anonymousClass1.L$3 = eventListenerCreate;
                        anonymousClass1.label = 1;
                        if (Lifecycles.awaitStarted(lifecycle, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        realImageLoader2 = this;
                        imageRequest2 = imageRequestBuild;
                        eventListener2 = eventListenerCreate;
                        requestDelegate3 = requestDelegate;
                        requestDelegate = requestDelegate3;
                    } else {
                        realImageLoader2 = this;
                        imageRequest2 = imageRequestBuild;
                        eventListener2 = eventListenerCreate;
                    }
                } catch (Throwable th) {
                    th = th;
                    realImageLoader = this;
                    requestDelegate2 = requestDelegate;
                    eventListener = eventListenerCreate;
                    if (th instanceof CancellationException) {
                        realImageLoader.onCancel(imageRequestBuild, eventListener);
                        throw th;
                    }
                    ErrorResult errorResult = realImageLoader.requestService.errorResult(imageRequestBuild, th);
                    realImageLoader.onError(errorResult, imageRequestBuild.getTarget(), eventListener);
                    requestDelegate2.complete();
                    return errorResult;
                }
            } else {
                if (i3 != 1) {
                    if (i3 == 2) {
                        Bitmap bitmap3 = (Bitmap) anonymousClass1.L$4;
                        eventListener2 = (EventListener) anonymousClass1.L$3;
                        imageRequest3 = (ImageRequest) anonymousClass1.L$2;
                        requestDelegate4 = (RequestDelegate) anonymousClass1.L$1;
                        realImageLoader3 = (RealImageLoader) anonymousClass1.L$0;
                        try {
                            ResultKt.throwOnFailure(objWithContext);
                            bitmap2 = bitmap3;
                            Size size = (Size) objWithContext;
                            eventListener2.resolveSizeEnd(imageRequest3, size);
                            CoroutineDispatcher interceptorDispatcher = imageRequest3.getInterceptorDispatcher();
                            RealImageLoader$executeMain$result$1 realImageLoader$executeMain$result$1 = new RealImageLoader$executeMain$result$1(imageRequest3, realImageLoader3, size, eventListener2, bitmap2, null);
                            anonymousClass1.L$0 = realImageLoader3;
                            anonymousClass1.L$1 = requestDelegate4;
                            anonymousClass1.L$2 = imageRequest3;
                            anonymousClass1.L$3 = eventListener2;
                            anonymousClass1.L$4 = null;
                            anonymousClass1.label = 3;
                            objWithContext = BuildersKt.withContext(interceptorDispatcher, realImageLoader$executeMain$result$1, anonymousClass1);
                            if (objWithContext == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            eventListener = eventListener2;
                            imageRequestBuild = imageRequest3;
                            requestDelegate2 = requestDelegate4;
                            realImageLoader = realImageLoader3;
                        } catch (Throwable th2) {
                            th = th2;
                            eventListener = eventListener2;
                            imageRequestBuild = imageRequest3;
                            requestDelegate2 = requestDelegate4;
                            realImageLoader = realImageLoader3;
                            if (th instanceof CancellationException) {
                                realImageLoader.onCancel(imageRequestBuild, eventListener);
                                throw th;
                            }
                            ErrorResult errorResult2 = realImageLoader.requestService.errorResult(imageRequestBuild, th);
                            realImageLoader.onError(errorResult2, imageRequestBuild.getTarget(), eventListener);
                            requestDelegate2.complete();
                            return errorResult2;
                        }
                    } else {
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        eventListener = (EventListener) anonymousClass1.L$3;
                        imageRequestBuild = (ImageRequest) anonymousClass1.L$2;
                        requestDelegate2 = (RequestDelegate) anonymousClass1.L$1;
                        realImageLoader = (RealImageLoader) anonymousClass1.L$0;
                        try {
                            ResultKt.throwOnFailure(objWithContext);
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                if (th instanceof CancellationException) {
                                    realImageLoader.onCancel(imageRequestBuild, eventListener);
                                    throw th;
                                }
                                ErrorResult errorResult3 = realImageLoader.requestService.errorResult(imageRequestBuild, th);
                                realImageLoader.onError(errorResult3, imageRequestBuild.getTarget(), eventListener);
                                requestDelegate2.complete();
                                return errorResult3;
                            } catch (Throwable th4) {
                                requestDelegate2.complete();
                                throw th4;
                            }
                        }
                    }
                    imageResult = (ImageResult) objWithContext;
                    if (imageResult instanceof SuccessResult) {
                        realImageLoader.onSuccess((SuccessResult) imageResult, imageRequestBuild.getTarget(), eventListener);
                    } else if (imageResult instanceof ErrorResult) {
                        realImageLoader.onError((ErrorResult) imageResult, imageRequestBuild.getTarget(), eventListener);
                    }
                    requestDelegate2.complete();
                    return imageResult;
                }
                eventListener2 = (EventListener) anonymousClass1.L$3;
                imageRequest2 = (ImageRequest) anonymousClass1.L$2;
                requestDelegate3 = (RequestDelegate) anonymousClass1.L$1;
                realImageLoader2 = (RealImageLoader) anonymousClass1.L$0;
                try {
                    ResultKt.throwOnFailure(objWithContext);
                    requestDelegate = requestDelegate3;
                } catch (Throwable th5) {
                    th = th5;
                    eventListener = eventListener2;
                    imageRequestBuild = imageRequest2;
                    requestDelegate2 = requestDelegate3;
                    realImageLoader = realImageLoader2;
                    if (th instanceof CancellationException) {
                        realImageLoader.onCancel(imageRequestBuild, eventListener);
                        throw th;
                    }
                    ErrorResult errorResult4 = realImageLoader.requestService.errorResult(imageRequestBuild, th);
                    realImageLoader.onError(errorResult4, imageRequestBuild.getTarget(), eventListener);
                    requestDelegate2.complete();
                    return errorResult4;
                }
            }
            MemoryCache memoryCache = realImageLoader2.getMemoryCache();
            if (memoryCache == null) {
                bitmap = null;
            } else {
                MemoryCache.Key placeholderMemoryCacheKey = imageRequest2.getPlaceholderMemoryCacheKey();
                MemoryCache.Value value = placeholderMemoryCacheKey != null ? memoryCache.get(placeholderMemoryCacheKey) : null;
                if (value != null) {
                    bitmap = value.getBitmap();
                } else {
                    bitmap = null;
                }
            }
            Drawable bitmapDrawable = bitmap != null ? new BitmapDrawable(imageRequest2.getContext().getResources(), bitmap) : imageRequest2.getPlaceholder();
            Target target = imageRequest2.getTarget();
            if (target != null) {
                target.onStart(bitmapDrawable);
            }
            eventListener2.onStart(imageRequest2);
            ImageRequest.Listener listener = imageRequest2.getListener();
            if (listener != null) {
                listener.onStart(imageRequest2);
            }
            eventListener2.resolveSizeStart(imageRequest2);
            SizeResolver sizeResolver = imageRequest2.getSizeResolver();
            anonymousClass1.L$0 = realImageLoader2;
            anonymousClass1.L$1 = requestDelegate;
            anonymousClass1.L$2 = imageRequest2;
            anonymousClass1.L$3 = eventListener2;
            anonymousClass1.L$4 = bitmap;
            anonymousClass1.label = 2;
            Object size2 = sizeResolver.size(anonymousClass1);
            if (size2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            bitmap2 = bitmap;
            realImageLoader3 = realImageLoader2;
            ImageRequest imageRequest4 = imageRequest2;
            requestDelegate4 = requestDelegate;
            objWithContext = size2;
            imageRequest3 = imageRequest4;
            Size size3 = (Size) objWithContext;
            eventListener2.resolveSizeEnd(imageRequest3, size3);
            CoroutineDispatcher interceptorDispatcher2 = imageRequest3.getInterceptorDispatcher();
            RealImageLoader$executeMain$result$1 realImageLoader$executeMain$result$2 = new RealImageLoader$executeMain$result$1(imageRequest3, realImageLoader3, size3, eventListener2, bitmap2, null);
            anonymousClass1.L$0 = realImageLoader3;
            anonymousClass1.L$1 = requestDelegate4;
            anonymousClass1.L$2 = imageRequest3;
            anonymousClass1.L$3 = eventListener2;
            anonymousClass1.L$4 = null;
            anonymousClass1.label = 3;
            objWithContext = BuildersKt.withContext(interceptorDispatcher2, realImageLoader$executeMain$result$2, anonymousClass1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            eventListener = eventListener2;
            imageRequestBuild = imageRequest3;
            requestDelegate2 = requestDelegate4;
            realImageLoader = realImageLoader3;
            imageResult = (ImageResult) objWithContext;
            if (imageResult instanceof SuccessResult) {
                realImageLoader.onSuccess((SuccessResult) imageResult, imageRequestBuild.getTarget(), eventListener);
            } else if (imageResult instanceof ErrorResult) {
                realImageLoader.onError((ErrorResult) imageResult, imageRequestBuild.getTarget(), eventListener);
            }
            requestDelegate2.complete();
            return imageResult;
        } catch (Throwable th6) {
            th = th6;
            requestDelegate2 = requestDelegate;
            eventListener = eventListener2;
            imageRequestBuild = imageRequest2;
            realImageLoader = realImageLoader2;
            if (th instanceof CancellationException) {
                realImageLoader.onCancel(imageRequestBuild, eventListener);
                throw th;
            }
            ErrorResult errorResult5 = realImageLoader.requestService.errorResult(imageRequestBuild, th);
            realImageLoader.onError(errorResult5, imageRequestBuild.getTarget(), eventListener);
            requestDelegate2.complete();
            return errorResult5;
        }
    }

    private final void onCancel(ImageRequest request, EventListener eventListener) {
        Logger logger = this.logger;
        if (logger != null && logger.getLevel() <= 4) {
            logger.log(TAG, 4, "🏗  Cancelled - " + request.getData(), null);
        }
        eventListener.onCancel(request);
        ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onCancel(request);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0050  */
    private final void onError(ErrorResult result, Target target, EventListener eventListener) {
        ImageRequest request = result.getRequest();
        Logger logger = this.logger;
        if (logger != null && logger.getLevel() <= 4) {
            logger.log(TAG, 4, "🚨 Failed - " + request.getData() + " - " + result.getThrowable(), null);
        }
        if (target instanceof TransitionTarget) {
            Transition transitionCreate = result.getRequest().getTransitionFactory().create((TransitionTarget) target, result);
            if (transitionCreate instanceof NoneTransition) {
                target.onError(result.getDrawable());
            } else {
                eventListener.transitionStart(result.getRequest(), transitionCreate);
                transitionCreate.transition();
                eventListener.transitionEnd(result.getRequest(), transitionCreate);
            }
        } else if (target != null) {
            target.onError(result.getDrawable());
        }
        eventListener.onError(request, result);
        ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onError(request, result);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005b  */
    private final void onSuccess(SuccessResult result, Target target, EventListener eventListener) {
        ImageRequest request = result.getRequest();
        DataSource dataSource = result.getDataSource();
        Logger logger = this.logger;
        if (logger != null && logger.getLevel() <= 4) {
            logger.log(TAG, 4, Utils.getEmoji(dataSource) + " Successful (" + dataSource.name() + ") - " + request.getData(), null);
        }
        if (target instanceof TransitionTarget) {
            Transition transitionCreate = result.getRequest().getTransitionFactory().create((TransitionTarget) target, result);
            if (transitionCreate instanceof NoneTransition) {
                target.onSuccess(result.getDrawable());
            } else {
                eventListener.transitionStart(result.getRequest(), transitionCreate);
                transitionCreate.transition();
                eventListener.transitionEnd(result.getRequest(), transitionCreate);
            }
        } else if (target != null) {
            target.onSuccess(result.getDrawable());
        }
        eventListener.onSuccess(request, result);
        ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onSuccess(request, result);
        }
    }

    private final void transition(ImageResult result, Target target, EventListener eventListener, Function0<Unit> setDrawable) {
        if (!(target instanceof TransitionTarget)) {
            setDrawable.invoke();
            return;
        }
        Transition transitionCreate = result.getRequest().getTransitionFactory().create((TransitionTarget) target, result);
        if (transitionCreate instanceof NoneTransition) {
            setDrawable.invoke();
            return;
        }
        eventListener.transitionStart(result.getRequest(), transitionCreate);
        transitionCreate.transition();
        eventListener.transitionEnd(result.getRequest(), transitionCreate);
    }

    @Override // coil.ImageLoader
    @NotNull
    public Disposable enqueue(@NotNull ImageRequest request) {
        Deferred<? extends ImageResult> deferredAsync$default = BuildersKt__Builders_commonKt.async$default(this.scope, null, null, new RealImageLoader$enqueue$job$1(this, request, null), 3, null);
        return request.getTarget() instanceof ViewTarget ? Utils.getRequestManager(((ViewTarget) request.getTarget()).getView()).getDisposable(deferredAsync$default) : new OneShotDisposable(deferredAsync$default);
    }

    @Override // coil.ImageLoader
    @Nullable
    public Object execute(@NotNull ImageRequest imageRequest, @NotNull Continuation<? super ImageResult> continuation) {
        return CoroutineScopeKt.coroutineScope(new AnonymousClass2(imageRequest, this, null), continuation);
    }

    @NotNull
    public final Lazy<Call.Factory> getCallFactoryLazy() {
        return this.callFactoryLazy;
    }

    @NotNull
    public final ComponentRegistry getComponentRegistry() {
        return this.componentRegistry;
    }

    @Override // coil.ImageLoader
    @NotNull
    public ComponentRegistry getComponents() {
        return this.components;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // coil.ImageLoader
    @NotNull
    public DefaultRequestOptions getDefaults() {
        return this.defaults;
    }

    @Override // coil.ImageLoader
    @Nullable
    public DiskCache getDiskCache() {
        return (DiskCache) this.diskCache.getValue();
    }

    @NotNull
    public final Lazy<DiskCache> getDiskCacheLazy() {
        return this.diskCacheLazy;
    }

    @NotNull
    public final EventListener.Factory getEventListenerFactory() {
        return this.eventListenerFactory;
    }

    @Nullable
    public final Logger getLogger() {
        return this.logger;
    }

    @Override // coil.ImageLoader
    @Nullable
    public MemoryCache getMemoryCache() {
        return (MemoryCache) this.memoryCache.getValue();
    }

    @NotNull
    public final Lazy<MemoryCache> getMemoryCacheLazy() {
        return this.memoryCacheLazy;
    }

    @NotNull
    public final ImageLoaderOptions getOptions() {
        return this.options;
    }

    @Override // coil.ImageLoader
    @NotNull
    public ImageLoader.Builder newBuilder() {
        return new ImageLoader.Builder(this);
    }

    public final void onTrimMemory$coil_base_release(int level) {
        MemoryCache value;
        Lazy<MemoryCache> lazy = this.memoryCacheLazy;
        if (lazy == null || (value = lazy.getValue()) == null) {
            return;
        }
        value.trimMemory(level);
    }

    @Override // coil.ImageLoader
    public void shutdown() {
        if (this.isShutdown.getAndSet(true)) {
            return;
        }
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
        this.systemCallbacks.shutdown();
        MemoryCache memoryCache = getMemoryCache();
        if (memoryCache != null) {
            memoryCache.clear();
        }
    }
}
