package com.xiaomi.fitness.share.report.adapter;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.core.graphics.drawable.DrawableKt;
import coil.Coil;
import coil.ImageLoader;
import coil.ImageLoaders;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.transform.RoundedCornersTransformation;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.share.report.adapter.JustDanceSongsSwitchAdapter$JustDanceShareViewHolder$bindData$1", f = "JustDanceSongsSwitchAdapter.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
public final class JustDanceSongsSwitchAdapter$JustDanceShareViewHolder$bindData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ImageRequest $image;
    int label;
    final /* synthetic */ JustDanceSongsSwitchAdapter.JustDanceShareViewHolder this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.share.report.adapter.JustDanceSongsSwitchAdapter$JustDanceShareViewHolder$bindData$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.share.report.adapter.JustDanceSongsSwitchAdapter$JustDanceShareViewHolder$bindData$1$1", f = "JustDanceSongsSwitchAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nJustDanceSongsSwitchAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JustDanceSongsSwitchAdapter.kt\ncom/xiaomi/fitness/share/report/adapter/JustDanceSongsSwitchAdapter$JustDanceShareViewHolder$bindData$1$1\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,161:1\n54#2,3:162\n24#2:165\n59#2,6:166\n*S KotlinDebug\n*F\n+ 1 JustDanceSongsSwitchAdapter.kt\ncom/xiaomi/fitness/share/report/adapter/JustDanceSongsSwitchAdapter$JustDanceShareViewHolder$bindData$1$1\n*L\n104#1:162,3\n104#1:165\n104#1:166,6\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        int label;
        final /* synthetic */ JustDanceSongsSwitchAdapter.JustDanceShareViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(JustDanceSongsSwitchAdapter.JustDanceShareViewHolder justDanceShareViewHolder, Bitmap bitmap, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = justDanceShareViewHolder;
            this.$bitmap = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$bitmap, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ImageView imageView = this.this$0.bgIv;
            Bitmap bitmap = this.$bitmap;
            ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(bitmap).target(imageView);
            builderTarget.transformations(new RoundedCornersTransformation(8.0f));
            imageLoader.enqueue(builderTarget.build());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JustDanceSongsSwitchAdapter$JustDanceShareViewHolder$bindData$1(ImageRequest imageRequest, JustDanceSongsSwitchAdapter.JustDanceShareViewHolder justDanceShareViewHolder, Continuation<? super JustDanceSongsSwitchAdapter$JustDanceShareViewHolder$bindData$1> continuation) {
        super(2, continuation);
        this.$image = imageRequest;
        this.this$0 = justDanceShareViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new JustDanceSongsSwitchAdapter$JustDanceShareViewHolder$bindData$1(this.$image, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ImageLoader imageLoaderCreate = ImageLoaders.create(ApplicationExtKt.getApplication());
            ImageRequest imageRequest = this.$image;
            this.label = 1;
            obj = imageLoaderCreate.execute(imageRequest, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Drawable drawable = ((ImageResult) obj).getDrawable();
        AnyExtKt.main$default(null, new AnonymousClass1(this.this$0, drawable != null ? DrawableKt.toBitmap(drawable, ExtUtilsKt.getDp(Boxing.boxFloat(300.0f)), (ExtUtilsKt.getDp(Boxing.boxFloat(300.0f)) * 9) / 16, Bitmap.Config.ARGB_8888) : null, null), 1, null);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((JustDanceSongsSwitchAdapter$JustDanceShareViewHolder$bindData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
