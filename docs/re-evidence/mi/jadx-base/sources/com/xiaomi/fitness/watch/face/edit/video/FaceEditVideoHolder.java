package com.xiaomi.fitness.watch.face.edit.video;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.watch.face.edit.FaceEditPickerBaseHolder;
import com.xiaomi.fitness.watch.face.edit.photo.FaceEditPhotoHelper;
import com.xiaomi.fitness.watch.face.export.data.FaceEditPhotoBean;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.gyi;
import defpackage.iki;
import defpackage.p1j;
import defpackage.r29;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/video/FaceEditVideoHolder;", "Lcom/xiaomi/fitness/watch/face/edit/FaceEditPickerBaseHolder;", "", MediaStoreUtil.MediaInfo.SIZE, "", "setText", "(I)V", "", "path", "getPngPath", "(Ljava/lang/String;)Ljava/lang/String;", "photoId", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;", "photoBeanList", "", "needMergeLocalList", "setVideoList", "(Ljava/lang/String;Ljava/util/List;Z)V", "Lr29;", "binding", "Lr29;", "<init>", "(Lr29;)V", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceEditVideoHolder extends FaceEditPickerBaseHolder {

    @NotNull
    private static final String TAG = "FaceEditPhotoHolder";

    @NotNull
    private final r29 binding;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.edit.video.FaceEditVideoHolder$setVideoList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.edit.video.FaceEditVideoHolder$setVideoList$1", f = "FaceEditVideoHolder.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFaceEditVideoHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceEditVideoHolder.kt\ncom/xiaomi/fitness/watch/face/edit/video/FaceEditVideoHolder$setVideoList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,129:1\n1557#2:130\n1628#2,3:131\n1557#2:134\n1628#2,3:135\n54#3,3:138\n24#3:141\n59#3,6:142\n54#3,3:148\n24#3:151\n59#3,6:152\n54#3,3:158\n24#3:161\n59#3,6:162\n*S KotlinDebug\n*F\n+ 1 FaceEditVideoHolder.kt\ncom/xiaomi/fitness/watch/face/edit/video/FaceEditVideoHolder$setVideoList$1\n*L\n40#1:130\n40#1:131,3\n45#1:134\n45#1:135,3\n65#1:138,3\n65#1:141\n65#1:142,6\n79#1:148,3\n79#1:151\n79#1:152,6\n93#1:158,3\n93#1:161\n93#1:162,6\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $needMergeLocalList;
        final /* synthetic */ List<FaceEditPhotoBean> $photoBeanList;
        final /* synthetic */ String $photoId;
        int label;
        final /* synthetic */ FaceEditVideoHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, List<FaceEditPhotoBean> list, String str, FaceEditVideoHolder faceEditVideoHolder, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$needMergeLocalList = z;
            this.$photoBeanList = list;
            this.$photoId = str;
            this.this$0 = faceEditVideoHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$needMergeLocalList, this.$photoBeanList, this.$photoId, this.this$0, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:33:0x01c0  */
        /* JADX WARN: Code duplicated, block: B:35:0x025a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List mutableList;
            int dp;
            int dp2;
            float dp3;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$needMergeLocalList) {
                    FaceEditPhotoHelper faceEditPhotoHelper = FaceEditPhotoHelper.INSTANCE;
                    List<FaceEditPhotoBean> list = this.$photoBeanList;
                    String str = this.$photoId;
                    this.label = 1;
                    if (faceEditPhotoHelper.initMd5List(list, str, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    List<FaceEditPhotoBean> currentPhotoList = FaceEditPhotoHelper.INSTANCE.getCurrentPhotoList(this.$photoId);
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(currentPhotoList, 10));
                    Iterator<T> it = currentPhotoList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((FaceEditPhotoBean) it.next()).getBackgroundImage().getThumbnailCropPath());
                    }
                    mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                    if (mutableList.size() > 3) {
                        mutableList = mutableList.subList(0, 3);
                    }
                }
                this.this$0.setText(FaceEditPhotoHelper.INSTANCE.getCurrentPhotoList(this.$photoId).size());
                CollectionsKt___CollectionsJvmKt.reverse(mutableList);
                FrameLayout photo3Layout = this.this$0.binding.H;
                Intrinsics.checkNotNullExpressionValue(photo3Layout, "photo3Layout");
                ViewExtKt.gone(photo3Layout);
                FrameLayout photo2Layout = this.this$0.binding.F;
                Intrinsics.checkNotNullExpressionValue(photo2Layout, "photo2Layout");
                ViewExtKt.gone(photo2Layout);
                FrameLayout photo1Layout = this.this$0.binding.D;
                Intrinsics.checkNotNullExpressionValue(photo1Layout, "photo1Layout");
                ViewExtKt.gone(photo1Layout);
                if (!mutableList.isEmpty()) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setStroke(ExtUtilsKt.getDp(Boxing.boxDouble(1.5d)), ApplicationExtKt.getApplication().getColor(iki.h));
                    dp = ExtUtilsKt.getDp(Boxing.boxInt(45));
                    dp2 = (FaceIcon.INFO_WIDTH * ExtUtilsKt.getDp(Boxing.boxInt(45))) / FaceIcon.INFO_HEIGHT;
                    dp3 = (ExtUtilsKt.getDp(Boxing.boxInt(45)) * FaceIcon.INFO_RADIUS) / FaceIcon.INFO_HEIGHT;
                    gradientDrawable.setBounds(0, 0, dp2, dp);
                    gradientDrawable.setCornerRadius(ExtUtilsKt.getDp(Boxing.boxInt(3)) + dp3);
                    FrameLayout photo3Layout2 = this.this$0.binding.H;
                    Intrinsics.checkNotNullExpressionValue(photo3Layout2, "photo3Layout");
                    ViewExtKt.visible(photo3Layout2);
                    ImageView photo3 = this.this$0.binding.G;
                    Intrinsics.checkNotNullExpressionValue(photo3, "photo3");
                    File file = new File(this.this$0.getPngPath((String) mutableList.get(0)));
                    ImageLoader imageLoader = Coil.imageLoader(photo3.getContext());
                    ImageRequest.Builder builderTarget = new ImageRequest.Builder(photo3.getContext()).data(file).target(photo3);
                    builderTarget.transformations(new RoundedCornersTransformation(dp3));
                    builderTarget.size(dp2, dp);
                    imageLoader.enqueue(builderTarget.build());
                    this.this$0.binding.G.setBackground(gradientDrawable);
                    if (mutableList.size() > 1) {
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        gradientDrawable2.setStroke(ExtUtilsKt.getDp(Boxing.boxDouble(1.5d)), ApplicationExtKt.getApplication().getColor(iki.h));
                        gradientDrawable2.setBounds(0, 0, dp2, dp);
                        gradientDrawable2.setCornerRadius(ExtUtilsKt.getDp(Boxing.boxInt(3)) + dp3);
                        FrameLayout photo2Layout2 = this.this$0.binding.F;
                        Intrinsics.checkNotNullExpressionValue(photo2Layout2, "photo2Layout");
                        ViewExtKt.visible(photo2Layout2);
                        ImageView photo2 = this.this$0.binding.E;
                        Intrinsics.checkNotNullExpressionValue(photo2, "photo2");
                        File file2 = new File(this.this$0.getPngPath((String) mutableList.get(1)));
                        ImageLoader imageLoader2 = Coil.imageLoader(photo2.getContext());
                        ImageRequest.Builder builderTarget2 = new ImageRequest.Builder(photo2.getContext()).data(file2).target(photo2);
                        builderTarget2.transformations(new RoundedCornersTransformation(dp3));
                        builderTarget2.size(dp2, dp);
                        imageLoader2.enqueue(builderTarget2.build());
                        this.this$0.binding.E.setBackground(gradientDrawable2);
                        if (mutableList.size() > 2) {
                            GradientDrawable gradientDrawable3 = new GradientDrawable();
                            gradientDrawable3.setStroke(ExtUtilsKt.getDp(Boxing.boxDouble(1.5d)), ApplicationExtKt.getApplication().getColor(iki.h));
                            gradientDrawable3.setBounds(0, 0, dp2, dp);
                            gradientDrawable3.setCornerRadius(ExtUtilsKt.getDp(Boxing.boxInt(3)) + dp3);
                            FrameLayout photo1Layout2 = this.this$0.binding.D;
                            Intrinsics.checkNotNullExpressionValue(photo1Layout2, "photo1Layout");
                            ViewExtKt.visible(photo1Layout2);
                            ImageView photo1 = this.this$0.binding.C;
                            Intrinsics.checkNotNullExpressionValue(photo1, "photo1");
                            File file3 = new File(this.this$0.getPngPath((String) mutableList.get(2)));
                            ImageLoader imageLoader3 = Coil.imageLoader(photo1.getContext());
                            ImageRequest.Builder builderTarget3 = new ImageRequest.Builder(photo1.getContext()).data(file3).target(photo1);
                            builderTarget3.transformations(new RoundedCornersTransformation(dp3));
                            builderTarget3.size(dp2, dp);
                            imageLoader3.enqueue(builderTarget3.build());
                            this.this$0.binding.C.setBackground(gradientDrawable3);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<FaceEditPhotoBean> currentPhotoList2 = FaceEditPhotoHelper.INSTANCE.getCurrentPhotoList(this.$photoId);
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(currentPhotoList2, 10));
            Iterator<T> it2 = currentPhotoList2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((FaceEditPhotoBean) it2.next()).getBackgroundImage().getThumbnailCropPath());
            }
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
            if (mutableList.size() > 3) {
                mutableList = mutableList.subList(0, 3);
            }
            this.this$0.setText(FaceEditPhotoHelper.INSTANCE.getCurrentPhotoList(this.$photoId).size());
            CollectionsKt___CollectionsJvmKt.reverse(mutableList);
            FrameLayout photo3Layout3 = this.this$0.binding.H;
            Intrinsics.checkNotNullExpressionValue(photo3Layout3, "photo3Layout");
            ViewExtKt.gone(photo3Layout3);
            FrameLayout photo2Layout3 = this.this$0.binding.F;
            Intrinsics.checkNotNullExpressionValue(photo2Layout3, "photo2Layout");
            ViewExtKt.gone(photo2Layout3);
            FrameLayout photo1Layout3 = this.this$0.binding.D;
            Intrinsics.checkNotNullExpressionValue(photo1Layout3, "photo1Layout");
            ViewExtKt.gone(photo1Layout3);
            if (!mutableList.isEmpty()) {
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setStroke(ExtUtilsKt.getDp(Boxing.boxDouble(1.5d)), ApplicationExtKt.getApplication().getColor(iki.h));
                dp = ExtUtilsKt.getDp(Boxing.boxInt(45));
                dp2 = (FaceIcon.INFO_WIDTH * ExtUtilsKt.getDp(Boxing.boxInt(45))) / FaceIcon.INFO_HEIGHT;
                dp3 = (ExtUtilsKt.getDp(Boxing.boxInt(45)) * FaceIcon.INFO_RADIUS) / FaceIcon.INFO_HEIGHT;
                gradientDrawable4.setBounds(0, 0, dp2, dp);
                gradientDrawable4.setCornerRadius(ExtUtilsKt.getDp(Boxing.boxInt(3)) + dp3);
                FrameLayout photo3Layout4 = this.this$0.binding.H;
                Intrinsics.checkNotNullExpressionValue(photo3Layout4, "photo3Layout");
                ViewExtKt.visible(photo3Layout4);
                ImageView photo4 = this.this$0.binding.G;
                Intrinsics.checkNotNullExpressionValue(photo4, "photo3");
                File file4 = new File(this.this$0.getPngPath((String) mutableList.get(0)));
                ImageLoader imageLoader4 = Coil.imageLoader(photo4.getContext());
                ImageRequest.Builder builderTarget4 = new ImageRequest.Builder(photo4.getContext()).data(file4).target(photo4);
                builderTarget4.transformations(new RoundedCornersTransformation(dp3));
                builderTarget4.size(dp2, dp);
                imageLoader4.enqueue(builderTarget4.build());
                this.this$0.binding.G.setBackground(gradientDrawable4);
                if (mutableList.size() > 1) {
                    GradientDrawable gradientDrawable5 = new GradientDrawable();
                    gradientDrawable5.setStroke(ExtUtilsKt.getDp(Boxing.boxDouble(1.5d)), ApplicationExtKt.getApplication().getColor(iki.h));
                    gradientDrawable5.setBounds(0, 0, dp2, dp);
                    gradientDrawable5.setCornerRadius(ExtUtilsKt.getDp(Boxing.boxInt(3)) + dp3);
                    FrameLayout photo2Layout4 = this.this$0.binding.F;
                    Intrinsics.checkNotNullExpressionValue(photo2Layout4, "photo2Layout");
                    ViewExtKt.visible(photo2Layout4);
                    ImageView photo5 = this.this$0.binding.E;
                    Intrinsics.checkNotNullExpressionValue(photo5, "photo2");
                    File file5 = new File(this.this$0.getPngPath((String) mutableList.get(1)));
                    ImageLoader imageLoader5 = Coil.imageLoader(photo5.getContext());
                    ImageRequest.Builder builderTarget5 = new ImageRequest.Builder(photo5.getContext()).data(file5).target(photo5);
                    builderTarget5.transformations(new RoundedCornersTransformation(dp3));
                    builderTarget5.size(dp2, dp);
                    imageLoader5.enqueue(builderTarget5.build());
                    this.this$0.binding.E.setBackground(gradientDrawable5);
                    if (mutableList.size() > 2) {
                        GradientDrawable gradientDrawable6 = new GradientDrawable();
                        gradientDrawable6.setStroke(ExtUtilsKt.getDp(Boxing.boxDouble(1.5d)), ApplicationExtKt.getApplication().getColor(iki.h));
                        gradientDrawable6.setBounds(0, 0, dp2, dp);
                        gradientDrawable6.setCornerRadius(ExtUtilsKt.getDp(Boxing.boxInt(3)) + dp3);
                        FrameLayout photo1Layout4 = this.this$0.binding.D;
                        Intrinsics.checkNotNullExpressionValue(photo1Layout4, "photo1Layout");
                        ViewExtKt.visible(photo1Layout4);
                        ImageView photo6 = this.this$0.binding.C;
                        Intrinsics.checkNotNullExpressionValue(photo6, "photo1");
                        File file6 = new File(this.this$0.getPngPath((String) mutableList.get(2)));
                        ImageLoader imageLoader6 = Coil.imageLoader(photo6.getContext());
                        ImageRequest.Builder builderTarget6 = new ImageRequest.Builder(photo6.getContext()).data(file6).target(photo6);
                        builderTarget6.transformations(new RoundedCornersTransformation(dp3));
                        builderTarget6.size(dp2, dp);
                        imageLoader6.enqueue(builderTarget6.build());
                        this.this$0.binding.C.setBackground(gradientDrawable6);
                    }
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FaceEditVideoHolder(@NotNull r29 binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
        this.binding = binding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getPngPath(String path) {
        if (path == null || path.length() == 0) {
            return "";
        }
        if (StringsKt__StringsJVMKt.endsWith$default(path, ".png", false, 2, null)) {
            return path;
        }
        return path + ".png";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setText(int size) {
        if (size <= 0) {
            this.binding.I.setTextColor(ExtUtilsKt.getColor(iki.e));
            this.binding.B.setText(ApplicationExtKt.getApplication().getString(p1j.o2));
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.binding.I.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).topMargin = ExtUtilsKt.getDp(12);
        this.binding.I.setTextColor(ExtUtilsKt.getColor(iki.l));
        this.binding.B.setText(ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), gyi.p, size, Integer.valueOf(size)));
    }

    public static /* synthetic */ void setVideoList$default(FaceEditVideoHolder faceEditVideoHolder, String str, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        faceEditVideoHolder.setVideoList(str, list, z);
    }

    public final void setVideoList(@NotNull String photoId, @NotNull List<FaceEditPhotoBean> photoBeanList, boolean needMergeLocalList) {
        Intrinsics.checkNotNullParameter(photoId, "photoId");
        Intrinsics.checkNotNullParameter(photoBeanList, "photoBeanList");
        AnyExtKt.main$default(null, new AnonymousClass1(needMergeLocalList, photoBeanList, photoId, this, null), 1, null);
    }
}
