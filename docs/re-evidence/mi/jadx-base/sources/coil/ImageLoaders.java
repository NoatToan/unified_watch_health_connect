package coil;

import android.content.Context;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import com.facebook.react.modules.image.ImageLoaderModule;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {ImageLoaderModule.NAME, "Lcoil/ImageLoader;", "context", "Landroid/content/Context;", "create", "executeBlocking", "Lcoil/request/ImageResult;", "request", "Lcoil/request/ImageRequest;", "coil-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
@JvmName(name = "ImageLoaders")
public final class ImageLoaders {

    /* JADX INFO: renamed from: coil.ImageLoaders$executeBlocking$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcoil/request/ImageResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "coil.ImageLoaders$executeBlocking$1", f = "ImageLoaders.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ImageResult>, Object> {
        final /* synthetic */ ImageRequest $request;
        final /* synthetic */ ImageLoader $this_executeBlocking;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ImageLoader imageLoader, ImageRequest imageRequest, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_executeBlocking = imageLoader;
            this.$request = imageRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$this_executeBlocking, this.$request, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ImageLoader imageLoader = this.$this_executeBlocking;
                ImageRequest imageRequest = this.$request;
                this.label = 1;
                obj = imageLoader.execute(imageRequest, this);
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
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @JvmName(name = "create")
    @NotNull
    public static final ImageLoader create(@NotNull Context context) {
        return new ImageLoader.Builder(context).build();
    }

    @NotNull
    public static final ImageResult executeBlocking(@NotNull ImageLoader imageLoader, @NotNull ImageRequest imageRequest) {
        return (ImageResult) BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(imageLoader, imageRequest, null), 1, null);
    }
}
