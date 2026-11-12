package com.xiaomi.fitness.watch.face.edit.video.crop;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.watch.face.FaceEditFragment;
import com.xiaomi.fitness.watch.face.edit.entity.DialEditEntity;
import com.xiaomi.fitness.watch.face.edit.entity.DialWatchFace;
import com.xiaomi.fitness.watch.face.edit.entity.Theme;
import com.xiaomi.fitness.watch.face.edit.photo.crop.FaceEditPhotoCropManager;
import com.xiaomi.fitness.watch.face.edit.photo.crop.FaceEditPhotoCropStyleAdapter;
import com.xiaomi.fitness.watch.face.edit.photo.crop.FaceEditPhotoCropStyleDecoration;
import com.xiaomi.fitness.watch.face.edit.photo.crop.FaceForegroundScaleView;
import com.xiaomi.fitness.watch.face.edit.photo.crop.OnPortraitScaleListener;
import com.xiaomi.fitness.watch.face.edit.utils.DialEditHelper;
import com.xiaomi.fitness.watch.face.edit.utils.DialFileUtils;
import com.xiaomi.fitness.watch.face.edit.video.crop.FaceEditVideoCropFragment;
import com.xiaomi.fitness.watch.face.export.data.FaceEditPhotoBean;
import com.xiaomi.fitness.watch.face.export.data.WatchFaceImage;
import com.xiaomi.fitness.watch.face.export.exportview.RectView;
import com.xiaomi.fitness.watch.face.view.OnVideoCompleteListener;
import com.xiaomi.fitness.watch.face.view.XmsTextureView;
import defpackage.av6;
import defpackage.fx8;
import defpackage.iki;
import defpackage.isi;
import defpackage.noi;
import defpackage.nyp;
import defpackage.ovi;
import defpackage.p1j;
import defpackage.t5d;
import defpackage.ujp;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0010*\u0001S\u0018\u0000 a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001aB\u0007¢\u0006\u0004\b`\u0010\u000eJ\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u000eJ\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ\u0019\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010\"\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e2\u001a\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\n0 H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\nH\u0002¢\u0006\u0004\b$\u0010\u000eJ\u000f\u0010%\u001a\u00020\u001aH\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001aH\u0002¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u001aH\u0002¢\u0006\u0004\b(\u0010&J!\u0010-\u001a\u00020\n2\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u001aH\u0016¢\u0006\u0004\b/\u0010&J\u000f\u00100\u001a\u00020\nH\u0016¢\u0006\u0004\b0\u0010\u000eJ\u000f\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\b1\u0010\u000eJ\u000f\u00102\u001a\u00020\nH\u0016¢\u0006\u0004\b2\u0010\u000eJ'\u00106\u001a\u00020\n2\u0006\u00103\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0016¢\u0006\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010:R\u0016\u0010<\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0016\u0010A\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010?R\u0016\u0010B\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010=R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00050C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00050C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010ER\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010?R\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010&R\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00050C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0016\u0010]\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010_\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010\u0007¨\u0006b"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/video/crop/FaceEditVideoCropFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/watch/face/edit/video/crop/FaceEditVideoCropViewModel;", "Lfx8;", "Lujp;", "", "initSplitStrategy", "()I", "Lcom/xiaomi/fitness/watch/face/edit/entity/Theme;", "theme", "", "initStyleList", "(Lcom/xiaomi/fitness/watch/face/edit/entity/Theme;)V", "initStyleList2", "()V", "style", "onStyleClick", "(I)V", "onRecognize", "Landroidx/recyclerview/widget/RecyclerView$o;", "layoutManager", "scrollToCenter", "(Landroidx/recyclerview/widget/RecyclerView$o;)I", "scrollToIfNeed", "addListener", "changeStyle", "", "isSetChange", "initSaveBtn", "(Z)V", "Landroid/graphics/Bitmap;", "bitmap", "Lkotlin/Function2;", "cropBitmap", "splitPortrait", "(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function2;)V", "setOnPortraitChangeListener", "isConfigChange", "()Z", "isPositionChange", "isPhotoChange", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onBackPressed", LifecycleConstantKt.ON_PAUSE, "onFirstTouchDown", "onLastTouchUp", "i", "i5", "i6", "onMove", "(III)V", "", "unzipPath", "Ljava/lang/String;", "originPath", "currentIndex", "I", "deviceSupportFG", "Z", "supportSplit", "recognize", "splitStrategy", "", "normalStyleList", "Ljava/util/List;", "splitStyleList", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;", "faceEditPhotoBean", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;", "Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;", "dialWatchFace", "Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;", "endView", "Landroid/view/View;", "neverChange", "Lnyp;", "transformationState", "Lnyp;", "com/xiaomi/fitness/watch/face/edit/video/crop/FaceEditVideoCropFragment$onScrollListener$1", "onScrollListener", "Lcom/xiaomi/fitness/watch/face/edit/video/crop/FaceEditVideoCropFragment$onScrollListener$1;", "getNeedSplit", "needSplit", "getStyleList", "()Ljava/util/List;", "styleList", "getStyleBitmap", "()Landroid/graphics/Bitmap;", "styleBitmap", "getLayoutId", "layoutId", "<init>", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFaceEditVideoCropFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceEditVideoCropFragment.kt\ncom/xiaomi/fitness/watch/face/edit/video/crop/FaceEditVideoCropFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,465:1\n360#2,7:466\n*S KotlinDebug\n*F\n+ 1 FaceEditVideoCropFragment.kt\ncom/xiaomi/fitness/watch/face/edit/video/crop/FaceEditVideoCropFragment\n*L\n216#1:466,7\n*E\n"})
public final class FaceEditVideoCropFragment extends BaseBindingFragment<FaceEditVideoCropViewModel, fx8> implements ujp {
    public static final int CROP_REQUEST = 1;
    public static final int PHOTO_CROP_BOTTOM_FRONT = 1;
    public static final int PHOTO_CROP_TOP_BEHIND = 2;
    public static final int PHOTO_CROP_TOP_FRONT = 0;

    @NotNull
    public static final String SELECT_BEAN = "select_bean";

    @NotNull
    public static final String SELECT_INDEX = "select_index";

    @NotNull
    public static final String SUPPORT_FOREGROUND = "support_foreground";

    @NotNull
    private static final String TAG = "FaceEditVideoCropFragment";
    private int currentIndex;
    private boolean deviceSupportFG;

    @Nullable
    private DialWatchFace dialWatchFace;

    @Nullable
    private View endView;

    @Nullable
    private FaceEditPhotoBean faceEditPhotoBean;
    private boolean recognize;
    private int splitStrategy;

    @NotNull
    private String unzipPath = "";

    @NotNull
    private String originPath = "";
    private final boolean supportSplit = t5d.w5(ApplicationExtKt.getApplication());

    @NotNull
    private final List<Integer> normalStyleList = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 1});

    @NotNull
    private final List<Integer> splitStyleList = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{2, 0, 1});
    private boolean neverChange = true;

    @NotNull
    private nyp transformationState = new nyp();

    @NotNull
    private final FaceEditVideoCropFragment$onScrollListener$1 onScrollListener = new RecyclerView.s() { // from class: com.xiaomi.fitness.watch.face.edit.video.crop.FaceEditVideoCropFragment$onScrollListener$1
        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                FaceEditVideoCropFragment faceEditVideoCropFragment = this.this$0;
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                Intrinsics.checkNotNull(layoutManager);
                faceEditVideoCropFragment.splitStrategy = faceEditVideoCropFragment.scrollToCenter(layoutManager);
                FaceEditVideoCropFragment faceEditVideoCropFragment2 = this.this$0;
                faceEditVideoCropFragment2.initSaveBtn(faceEditVideoCropFragment2.isConfigChange());
                this.this$0.changeStyle();
            }
        }
    };

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.edit.video.crop.FaceEditVideoCropFragment$addListener$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/xiaomi/fitness/watch/face/edit/video/crop/FaceEditVideoCropFragment$addListener$1", "Lcom/xiaomi/fitness/watch/face/edit/video/crop/OnVideoLoadListener;", "onLoadDone", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 implements OnVideoLoadListener {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onLoadDone$lambda$0(FaceEditVideoCropFragment this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.initSaveBtn(this$0.isConfigChange());
        }

        @Override // com.xiaomi.fitness.watch.face.edit.video.crop.OnVideoLoadListener
        public void onLoadDone() {
            Logger.d(FaceEditVideoCropFragment.TAG, "onLoadDone " + FaceEditVideoCropFragment.this.getContext());
            XmsTextureView xmsTextureView = FaceEditVideoCropFragment.access$getMBinding(FaceEditVideoCropFragment.this).I;
            final FaceEditVideoCropFragment faceEditVideoCropFragment = FaceEditVideoCropFragment.this;
            xmsTextureView.post(new Runnable() { // from class: aw8
                @Override // java.lang.Runnable
                public final void run() {
                    FaceEditVideoCropFragment.AnonymousClass1.onLoadDone$lambda$0(faceEditVideoCropFragment);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.edit.video.crop.FaceEditVideoCropFragment$onViewCreated$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.edit.video.crop.FaceEditVideoCropFragment$onViewCreated$2", f = "FaceEditVideoCropFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33732 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C33732(Continuation<? super C33732> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceEditVideoCropFragment.this.new C33732(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            WatchFaceImage backgroundImage;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FaceEditVideoCropFragment.this.setOnPortraitChangeListener();
            FaceEditVideoCropFragment.access$getMBinding(FaceEditVideoCropFragment.this).I.enableInternalTouch();
            FaceEditVideoCropFragment.access$getMBinding(FaceEditVideoCropFragment.this).I.setTouchActionCallback(FaceEditVideoCropFragment.this);
            XmsTextureView xmsTextureView = FaceEditVideoCropFragment.access$getMBinding(FaceEditVideoCropFragment.this).I;
            FaceEditPhotoBean faceEditPhotoBean = FaceEditVideoCropFragment.this.faceEditPhotoBean;
            xmsTextureView.setVideoPath((faceEditPhotoBean == null || (backgroundImage = faceEditPhotoBean.getBackgroundImage()) == null) ? null : backgroundImage.getOriginImagePath());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33732) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final /* synthetic */ fx8 access$getMBinding(FaceEditVideoCropFragment faceEditVideoCropFragment) {
        return faceEditVideoCropFragment.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FaceEditVideoCropViewModel access$getMViewModel(FaceEditVideoCropFragment faceEditVideoCropFragment) {
        return (FaceEditVideoCropViewModel) faceEditVideoCropFragment.getMViewModel();
    }

    private final void addListener() {
        getMBinding().I.setOnLoadListener(new AnonymousClass1());
        getMBinding().I.setOnPlayCompleteListener(new OnVideoCompleteListener() { // from class: com.xiaomi.fitness.watch.face.edit.video.crop.FaceEditVideoCropFragment.addListener.2
            @Override // com.xiaomi.fitness.watch.face.view.OnVideoCompleteListener
            public void onComplete() {
                FaceEditVideoCropFragment.access$getMBinding(FaceEditVideoCropFragment.this).F.setImageResource(noi.H);
            }
        });
        getMBinding().F.setOnClickListener(new View.OnClickListener() { // from class: wv8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaceEditVideoCropFragment.addListener$lambda$2(this.f38394a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addListener$lambda$2(FaceEditVideoCropFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getMBinding().I.isPlaying()) {
            this$0.getMBinding().I.stop();
            this$0.getMBinding().F.setImageResource(noi.H);
        } else {
            this$0.getMBinding().I.play();
            this$0.getMBinding().F.setImageResource(noi.F);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x0034  */
    public final void changeStyle() {
        Theme theme;
        String string;
        DialEditEntity dialEditEntity;
        DialEditEntity dialEditEntity2;
        int i;
        List<Theme> normalThemeList;
        DialWatchFace dialWatchFace = this.dialWatchFace;
        FaceEditPhotoCropStyleAdapter faceEditPhotoCropStyleAdapter = null;
        if (dialWatchFace == null || (normalThemeList = dialWatchFace.getNormalThemeList()) == null) {
            theme = null;
        } else {
            DialWatchFace dialWatchFace2 = this.dialWatchFace;
            theme = normalThemeList.get(dialWatchFace2 != null ? dialWatchFace2.getThemeIndex() : 0);
        }
        if (theme != null && (dialEditEntity2 = theme.getDialEditEntity()) != null) {
            int i2 = this.splitStrategy;
            if (i2 == 0) {
                i = 0;
            } else if (i2 == 1) {
                i = 1;
            } else if (i2 != 2) {
                i = -1;
            } else {
                i = 0;
            }
            dialEditEntity2.setPositionIndex(i);
        }
        getMBinding().A.setImageBitmap(getStyleBitmap());
        if (theme != null && (dialEditEntity = theme.getDialEditEntity()) != null) {
            dialEditEntity.setPositionIndex(0);
        }
        if (this.splitStrategy == 2) {
            FaceForegroundScaleView fgUp = getMBinding().B;
            Intrinsics.checkNotNullExpressionValue(fgUp, "fgUp");
            ViewExtKt.visible(fgUp);
        } else {
            FaceForegroundScaleView fgUp2 = getMBinding().B;
            Intrinsics.checkNotNullExpressionValue(fgUp2, "fgUp");
            ViewExtKt.invisible(fgUp2);
        }
        TextView textView = getMBinding().H;
        int i3 = this.splitStrategy;
        if (i3 == 0) {
            string = getString(p1j.N0);
        } else if (i3 != 1) {
            string = i3 != 2 ? "" : getString(p1j.M0);
        } else {
            string = getString(p1j.L0);
        }
        textView.setText(string);
        if (this.recognize) {
            RecyclerView.Adapter adapter = getMBinding().E.getAdapter();
            if (adapter instanceof FaceEditPhotoCropStyleAdapter) {
                faceEditPhotoCropStyleAdapter = (FaceEditPhotoCropStyleAdapter) adapter;
            }
        } else {
            RecyclerView.Adapter adapter2 = getMBinding().D.getAdapter();
            if (adapter2 instanceof FaceEditPhotoCropStyleAdapter) {
                faceEditPhotoCropStyleAdapter = (FaceEditPhotoCropStyleAdapter) adapter2;
            }
        }
        if (faceEditPhotoCropStyleAdapter != null) {
            faceEditPhotoCropStyleAdapter.setSplitStrategy(this.splitStrategy);
        }
    }

    private final boolean getNeedSplit() {
        return this.splitStrategy == 2;
    }

    private final Bitmap getStyleBitmap() {
        List<Theme> normalThemeList;
        DialWatchFace dialWatchFace = this.dialWatchFace;
        if (dialWatchFace != null && dialWatchFace != null && (normalThemeList = dialWatchFace.getNormalThemeList()) != null) {
            DialWatchFace dialWatchFace2 = this.dialWatchFace;
            Theme theme = normalThemeList.get(dialWatchFace2 != null ? dialWatchFace2.getThemeIndex() : 0);
            if (theme != null) {
                DialEditHelper dialEditHelper = DialEditHelper.INSTANCE;
                Application application = ApplicationExtKt.getApplication();
                DialWatchFace dialWatchFace3 = this.dialWatchFace;
                Intrinsics.checkNotNull(dialWatchFace3);
                return dialEditHelper.watchFaceViewToBitmap(application, theme, dialWatchFace3, (int) RectView.f13382b, (int) RectView.c, this.unzipPath, (3392 & 64) != 0 ? Bitmap.Config.ARGB_8888 : null, (3392 & 128) != 0 ? null : Float.valueOf(RectView.d), (3392 & 256) != 0 ? null : null, (3392 & 512) != 0 ? false : true, (3392 & 1024) != 0 ? false : false, (3392 & 2048) != 0 ? null : null);
            }
        }
        return null;
    }

    private final List<Integer> getStyleList() {
        return this.recognize ? this.splitStyleList : this.normalStyleList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initSaveBtn(boolean isSetChange) {
        Application application;
        int i;
        View viewInflate = LayoutInflater.from(getContext()).inflate(ovi.z, (ViewGroup) null);
        this.endView = viewInflate;
        TextView textView = (TextView) viewInflate.findViewById(isi.Q1);
        textView.setEnabled(isSetChange);
        if (isSetChange) {
            application = ApplicationExtKt.getApplication();
            i = iki.e;
        } else {
            application = ApplicationExtKt.getApplication();
            i = iki.o;
        }
        textView.setTextColor(application.getColor(i));
        Intrinsics.checkNotNull(viewInflate);
        setEndView(viewInflate);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: vv8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaceEditVideoCropFragment.initSaveBtn$lambda$6(this.f37265a, view);
            }
        });
    }

    public static /* synthetic */ void initSaveBtn$default(FaceEditVideoCropFragment faceEditVideoCropFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        faceEditVideoCropFragment.initSaveBtn(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSaveBtn$lambda$6(final FaceEditVideoCropFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "save crop photo");
        this$0.showLoading();
        this$0.transformationState.observe(this$0.getViewLifecycleOwner(), new FaceEditVideoCropFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: yv8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceEditVideoCropFragment.initSaveBtn$lambda$6$lambda$5(this.f40607a, (nyp) obj);
            }
        }));
        AnyExtKt.io$default(null, new FaceEditVideoCropFragment$initSaveBtn$2$2(this$0, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSaveBtn$lambda$6$lambda$5(FaceEditVideoCropFragment this$0, nyp nypVar) {
        WatchFaceImage backgroundImage;
        WatchFaceImage backgroundImage2;
        WatchFaceImage backgroundImage3;
        WatchFaceImage backgroundImage4;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = nypVar.f28576a;
        if (i == 1) {
            Logger.d(TAG, "transcoder video " + nypVar.f28577b);
        } else if (i == 3 || i == 4 || i == 5) {
            this$0.hideLoading();
            if (nypVar.f28576a == 3) {
                String path = nypVar.d.f533a.getPath();
                FaceEditPhotoBean faceEditPhotoBean = this$0.faceEditPhotoBean;
                if (faceEditPhotoBean != null && (backgroundImage4 = faceEditPhotoBean.getBackgroundImage()) != null) {
                    backgroundImage4.setCropPath(path);
                }
                FaceEditPhotoBean faceEditPhotoBean2 = this$0.faceEditPhotoBean;
                if (faceEditPhotoBean2 != null && (backgroundImage3 = faceEditPhotoBean2.getBackgroundImage()) != null) {
                    backgroundImage3.setCropBinPath(path);
                }
                FaceEditPhotoBean faceEditPhotoBean3 = this$0.faceEditPhotoBean;
                if (faceEditPhotoBean3 != null && (backgroundImage2 = faceEditPhotoBean3.getBackgroundImage()) != null) {
                    String fileMD5 = MD5Util.getFileMD5(new File(path));
                    if (fileMD5 == null) {
                        fileMD5 = "";
                    }
                    backgroundImage2.setMd5(fileMD5);
                }
                Logger.d(TAG, "crop video path " + path);
                FaceEditPhotoBean faceEditPhotoBean4 = this$0.faceEditPhotoBean;
                if (faceEditPhotoBean4 != null && (backgroundImage = faceEditPhotoBean4.getBackgroundImage()) != null) {
                    DialFileUtils dialFileUtils = DialFileUtils.INSTANCE;
                    Intrinsics.checkNotNull(path);
                    backgroundImage.setThumbnailCropPath(dialFileUtils.getVideoThumb(path));
                }
                FaceEditPhotoBean faceEditPhotoBean5 = this$0.faceEditPhotoBean;
                if (faceEditPhotoBean5 != null) {
                    faceEditPhotoBean5.setPositionIndex(this$0.splitStrategy != 1 ? 0 : 1);
                }
                Logger.i(TAG, "save crop photo success: " + this$0.faceEditPhotoBean);
                FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
                Intent intent = new Intent();
                intent.putExtra("select_bean", this$0.faceEditPhotoBean);
                intent.putExtra("select_index", this$0.currentIndex);
                Unit unit = Unit.INSTANCE;
                fragmentActivityRequireActivity.setResult(-1, intent);
                this$0.finish();
            }
        }
        return Unit.INSTANCE;
    }

    private final int initSplitStrategy() {
        FaceEditPhotoBean faceEditPhotoBean = this.faceEditPhotoBean;
        if (faceEditPhotoBean == null) {
            return 0;
        }
        Intrinsics.checkNotNull(faceEditPhotoBean);
        if (faceEditPhotoBean.getPositionIndex() == 1) {
            return 1;
        }
        FaceEditPhotoBean faceEditPhotoBean2 = this.faceEditPhotoBean;
        Intrinsics.checkNotNull(faceEditPhotoBean2);
        if (faceEditPhotoBean2.getPositionIndex() != 0) {
            return 0;
        }
        FaceEditPhotoBean faceEditPhotoBean3 = this.faceEditPhotoBean;
        Intrinsics.checkNotNull(faceEditPhotoBean3);
        return faceEditPhotoBean3.getForegroundImage() != null ? 2 : 0;
    }

    private final void initStyleList(Theme theme) {
        if (this.deviceSupportFG && this.supportSplit) {
            if ((theme != null ? theme.getFg() : null) != null) {
                miuix.recyclerview.widget.RecyclerView mStyleLabel = getMBinding().D;
                Intrinsics.checkNotNullExpressionValue(mStyleLabel, "mStyleLabel");
                ViewExtKt.visible(mStyleLabel);
                FaceEditPhotoCropStyleAdapter faceEditPhotoCropStyleAdapter = new FaceEditPhotoCropStyleAdapter(new FaceEditVideoCropFragment$initStyleList$styleAdapter$1(this));
                getMBinding().D.setAdapter(faceEditPhotoCropStyleAdapter);
                getMBinding().D.addItemDecoration(new FaceEditPhotoCropStyleDecoration());
                getMBinding().D.setLayoutManager(new LinearLayoutManager(ApplicationExtKt.getApplication(), 0, false));
                faceEditPhotoCropStyleAdapter.setStyleList(this.normalStyleList, this.splitStrategy);
                getMBinding().D.addOnScrollListener(this.onScrollListener);
            }
        }
    }

    private final void initStyleList2() {
        FaceEditPhotoCropStyleAdapter faceEditPhotoCropStyleAdapter = new FaceEditPhotoCropStyleAdapter(new FaceEditVideoCropFragment$initStyleList2$styleAdapter$1(this));
        getMBinding().E.setAdapter(faceEditPhotoCropStyleAdapter);
        getMBinding().E.addItemDecoration(new FaceEditPhotoCropStyleDecoration());
        getMBinding().E.setLayoutManager(new LinearLayoutManager(ApplicationExtKt.getApplication(), 0, false));
        faceEditPhotoCropStyleAdapter.setStyleList(this.splitStyleList, this.splitStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isConfigChange() {
        return isPhotoChange();
    }

    private final boolean isPhotoChange() {
        return getMBinding().I.isConfigChange();
    }

    private final boolean isPositionChange() {
        return initSplitStrategy() != this.splitStrategy;
    }

    private final void onRecognize() {
        miuix.recyclerview.widget.RecyclerView mStyleLabel = getMBinding().D;
        Intrinsics.checkNotNullExpressionValue(mStyleLabel, "mStyleLabel");
        ViewExtKt.invisible(mStyleLabel);
        getMBinding().D.removeOnScrollListener(this.onScrollListener);
        miuix.recyclerview.widget.RecyclerView mStyleLabel2 = getMBinding().E;
        Intrinsics.checkNotNullExpressionValue(mStyleLabel2, "mStyleLabel2");
        ViewExtKt.visible(mStyleLabel2);
        getMBinding().E.addOnScrollListener(this.onScrollListener);
        scrollToIfNeed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStyleClick(int style) {
        this.splitStrategy = style;
        initSaveBtn(isConfigChange());
        scrollToIfNeed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(FaceEditVideoCropFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.onBackPressed()) {
            return;
        }
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int scrollToCenter(RecyclerView.o layoutManager) {
        int childCount = layoutManager.getChildCount();
        int screenWidth = DisplayUtil.getScreenWidth() / 2;
        if (childCount == 0) {
            return 0;
        }
        int iAbs = Integer.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = layoutManager.getChildAt(i3);
            if (childAt != null) {
                int left = ((childAt.getLeft() + childAt.getRight()) / 2) - screenWidth;
                if (Math.abs(left) <= 1) {
                    left = 0;
                }
                if (Math.abs(left) < iAbs) {
                    iAbs = Math.abs(left);
                    i2 = i3;
                    i = left;
                }
            }
        }
        if (this.recognize) {
            getMBinding().E.smoothScrollBy(i, 0);
        } else {
            getMBinding().D.smoothScrollBy(i, 0);
        }
        return getStyleList().get(i2).intValue();
    }

    private final void scrollToIfNeed() {
        if (getMBinding().D.getChildCount() < this.splitStrategy) {
            return;
        }
        int screenWidth = DisplayUtil.getScreenWidth() / 2;
        Iterator<Integer> it = getStyleList().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().intValue() == this.splitStrategy) {
                break;
            } else {
                i++;
            }
        }
        View childAt = this.recognize ? getMBinding().E.getChildAt(i) : getMBinding().D.getChildAt(i);
        int left = ((childAt.getLeft() + childAt.getRight()) / 2) - screenWidth;
        if (this.recognize) {
            getMBinding().E.smoothScrollBy(left, 0);
        } else {
            getMBinding().D.smoothScrollBy(left, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOnPortraitChangeListener() {
        getMBinding().I.setOnPortraitScaleListener(new OnPortraitScaleListener() { // from class: com.xiaomi.fitness.watch.face.edit.video.crop.FaceEditVideoCropFragment.setOnPortraitChangeListener.1
            @Override // com.xiaomi.fitness.watch.face.edit.photo.crop.OnPortraitScaleListener
            public void onMove(float distanceX, float distanceY) {
                FaceEditVideoCropFragment.this.neverChange = false;
                View view = FaceEditVideoCropFragment.this.endView;
                if (view != null) {
                    ViewExtKt.gone(view);
                }
            }

            @Override // com.xiaomi.fitness.watch.face.edit.photo.crop.OnPortraitScaleListener
            public void onScale(float scaleFactor, ScaleGestureDetector detector) {
                Intrinsics.checkNotNullParameter(detector, "detector");
                FaceEditVideoCropFragment.this.neverChange = false;
                View view = FaceEditVideoCropFragment.this.endView;
                if (view != null) {
                    ViewExtKt.gone(view);
                }
            }

            @Override // com.xiaomi.fitness.watch.face.edit.photo.crop.OnPortraitScaleListener
            public void onchangeEnd() {
                FaceEditVideoCropFragment faceEditVideoCropFragment = FaceEditVideoCropFragment.this;
                faceEditVideoCropFragment.initSaveBtn(faceEditVideoCropFragment.isConfigChange());
            }
        });
    }

    private final void splitPortrait(Bitmap bitmap, final Function2<? super Integer, ? super Bitmap, Unit> cropBitmap) {
        FaceEditPhotoCropManager faceEditPhotoCropManager = FaceEditPhotoCropManager.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        faceEditPhotoCropManager.split(contextRequireContext, bitmap, new Function2() { // from class: zv8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FaceEditVideoCropFragment.splitPortrait$lambda$7(cropBitmap, ((Integer) obj).intValue(), (Bitmap) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit splitPortrait$lambda$7(Function2 cropBitmap, int i, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(cropBitmap, "$cropBitmap");
        AnyExtKt.main$default(null, new FaceEditVideoCropFragment$splitPortrait$1$1(cropBitmap, i, bitmap, null), 1, null);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return ovi.f;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        if (this.neverChange || !isConfigChange()) {
            return false;
        }
        new CommonDialog.c("save photo").setDialogTitle(p1j.C0).setDialogDescription(p1j.B0).setPositiveText(p1j.d).setNegativeText(p1j.c).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.watch.face.edit.video.crop.FaceEditVideoCropFragment.onBackPressed.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -2) {
                    if (which != -1) {
                        return;
                    }
                    FaceEditVideoCropFragment.this.finish();
                } else if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }).showIfNeed(getParentFragmentManager());
        return true;
    }

    public void onFirstTouchDown() {
    }

    public void onLastTouchUp() {
    }

    public void onMove(int i, int i5, int i6) {
        getMBinding().I.setTransform(getMBinding().I.getUseMatrix());
        getMBinding().I.postInvalidate();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getMBinding().I.pause();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String string;
        Theme theme;
        List<Theme> normalThemeList;
        WatchFaceImage backgroundImage;
        String originImagePath;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarNormalTitleMode();
        String str = "";
        setTitle("");
        hideBack();
        IActionBar.DefaultImpls.setStartView$default(this, 0, noi.L, null, new View.OnClickListener() { // from class: xv8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FaceEditVideoCropFragment.onViewCreated$lambda$0(this.f39499a, view2);
            }
        }, 5, null);
        setTitleBackground(iki.f21257b);
        Bundle arguments = getArguments();
        this.faceEditPhotoBean = arguments != null ? (FaceEditPhotoBean) arguments.getParcelable("select_bean") : null;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString(FaceEditFragment.FACE_UNZIP_PATH, "")) == null) {
            string = "";
        }
        this.unzipPath = string;
        FaceEditPhotoBean faceEditPhotoBean = this.faceEditPhotoBean;
        if (faceEditPhotoBean != null && (backgroundImage = faceEditPhotoBean.getBackgroundImage()) != null && (originImagePath = backgroundImage.getOriginImagePath()) != null) {
            str = originImagePath;
        }
        this.originPath = str;
        Bundle arguments3 = getArguments();
        this.currentIndex = arguments3 != null ? arguments3.getInt("select_index") : 0;
        this.splitStrategy = initSplitStrategy();
        Bundle arguments4 = getArguments();
        this.deviceSupportFG = arguments4 != null ? arguments4.getBoolean("support_foreground") : false;
        DialWatchFace currentDiaWatchFace = DialEditHelper.INSTANCE.getCurrentDiaWatchFace();
        this.dialWatchFace = currentDiaWatchFace;
        if (currentDiaWatchFace == null || (normalThemeList = currentDiaWatchFace.getNormalThemeList()) == null) {
            theme = null;
        } else {
            DialWatchFace dialWatchFace = this.dialWatchFace;
            theme = normalThemeList.get(dialWatchFace != null ? dialWatchFace.getThemeIndex() : 0);
        }
        initStyleList(theme);
        addListener();
        Logger.d(TAG, "onViewCreated");
        AnyExtKt.main$default(null, new C33732(null), 1, null);
    }
}
