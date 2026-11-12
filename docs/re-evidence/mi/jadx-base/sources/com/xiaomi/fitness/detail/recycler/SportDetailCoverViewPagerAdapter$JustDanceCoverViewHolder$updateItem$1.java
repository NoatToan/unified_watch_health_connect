package com.xiaomi.fitness.detail.recycler;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableKt;
import coil.ImageLoader;
import coil.ImageLoaders;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.detail.recycler.SportDetailCoverViewPagerAdapter$JustDanceCoverViewHolder$updateItem$1", f = "SportDetailCoverViewPagerAdapter.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
public final class SportDetailCoverViewPagerAdapter$JustDanceCoverViewHolder$updateItem$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ImageRequest $image;
    int label;
    final /* synthetic */ SportDetailCoverViewPagerAdapter.JustDanceCoverViewHolder this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.recycler.SportDetailCoverViewPagerAdapter$JustDanceCoverViewHolder$updateItem$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.recycler.SportDetailCoverViewPagerAdapter$JustDanceCoverViewHolder$updateItem$1$1", f = "SportDetailCoverViewPagerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        int label;
        final /* synthetic */ SportDetailCoverViewPagerAdapter.JustDanceCoverViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SportDetailCoverViewPagerAdapter.JustDanceCoverViewHolder justDanceCoverViewHolder, Bitmap bitmap, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = justDanceCoverViewHolder;
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
            this.this$0.getBinding().A.setImageBitmap(this.$bitmap);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportDetailCoverViewPagerAdapter$JustDanceCoverViewHolder$updateItem$1(ImageRequest imageRequest, SportDetailCoverViewPagerAdapter.JustDanceCoverViewHolder justDanceCoverViewHolder, Continuation<? super SportDetailCoverViewPagerAdapter$JustDanceCoverViewHolder$updateItem$1> continuation) {
        super(2, continuation);
        this.$image = imageRequest;
        this.this$0 = justDanceCoverViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SportDetailCoverViewPagerAdapter$JustDanceCoverViewHolder$updateItem$1(this.$image, this.this$0, continuation);
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
        int screenWidth = UIUtils.INSTANCE.getScreenWidth(ApplicationExtKt.getApplication());
        AnyExtKt.main$default(null, new AnonymousClass1(this.this$0, drawable != null ? DrawableKt.toBitmap(drawable, screenWidth, (screenWidth * 9) / 16, Bitmap.Config.ARGB_8888) : null, null), 1, null);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SportDetailCoverViewPagerAdapter$JustDanceCoverViewHolder$updateItem$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
