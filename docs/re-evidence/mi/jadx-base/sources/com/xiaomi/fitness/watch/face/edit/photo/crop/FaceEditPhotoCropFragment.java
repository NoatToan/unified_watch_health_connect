package com.xiaomi.fitness.watch.face.edit.photo.crop;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.watch.face.FaceEditFragment;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.edit.entity.DialEditEntity;
import com.xiaomi.fitness.watch.face.edit.entity.DialWatchFace;
import com.xiaomi.fitness.watch.face.edit.entity.Theme;
import com.xiaomi.fitness.watch.face.edit.photo.crop.FaceEditPhotoCropFragment;
import com.xiaomi.fitness.watch.face.edit.utils.DialEditHelper;
import com.xiaomi.fitness.watch.face.export.data.FaceEditPhotoBean;
import com.xiaomi.fitness.watch.face.export.data.WatchFaceImage;
import com.xiaomi.fitness.watch.face.export.exportview.RectView;
import defpackage.av6;
import defpackage.bx8;
import defpackage.iki;
import defpackage.isi;
import defpackage.noi;
import defpackage.ovi;
import defpackage.p1j;
import defpackage.t5d;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0010*\u0001J\u0018\u0000 X2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001XB\u0007¢\u0006\u0004\bW\u0010\rJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\rJ\u000f\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\rJ\u0019\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\rJ3\u0010\"\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\u001a\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\t0 H\u0002¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u0004\u0018\u00010\u001e2\u0006\u0010%\u001a\u00020$H\u0082@¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0019H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0019H\u0002¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u00020\u0019H\u0002¢\u0006\u0004\b+\u0010)J!\u00100\u001a\u00020\t2\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0019H\u0016¢\u0006\u0004\b2\u0010)R\u0016\u00103\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0016\u00106\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109R\u0016\u0010;\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109R\u0016\u0010<\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00107R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010G\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00109R\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010)R\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00040=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0016\u0010T\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010V\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010\u0006¨\u0006Y"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/photo/crop/FaceEditPhotoCropFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/watch/face/edit/photo/crop/FaceEditPhotoCropViewModel;", "Lbx8;", "", "initSplitStrategy", "()I", "Lcom/xiaomi/fitness/watch/face/edit/entity/Theme;", "theme", "", "initStyleList", "(Lcom/xiaomi/fitness/watch/face/edit/entity/Theme;)V", "initStyleList2", "()V", "style", "onStyleClick", "(I)V", "onRecognize", "Landroidx/recyclerview/widget/RecyclerView$o;", "layoutManager", "scrollToCenter", "(Landroidx/recyclerview/widget/RecyclerView$o;)I", "scrollToIfNeed", "addListener", "changeStyle", "", "isSetChange", "initSaveBtn", "(Z)V", "setOnPortraitChangeListener", "Landroid/graphics/Bitmap;", "bitmap", "Lkotlin/Function2;", "cropBitmap", "splitPortrait", "(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function2;)V", "", "path", "getFitBitmap", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isConfigChange", "()Z", "isPositionChange", "isPhotoChange", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onBackPressed", "unzipPath", "Ljava/lang/String;", "originPath", "currentIndex", "I", "deviceSupportFG", "Z", "supportSplit", "recognize", "splitStrategy", "", "normalStyleList", "Ljava/util/List;", "splitStyleList", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;", "faceEditPhotoBean", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;", "Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;", "dialWatchFace", "Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;", "endView", "Landroid/view/View;", "neverChange", "com/xiaomi/fitness/watch/face/edit/photo/crop/FaceEditPhotoCropFragment$onScrollListener$1", "onScrollListener", "Lcom/xiaomi/fitness/watch/face/edit/photo/crop/FaceEditPhotoCropFragment$onScrollListener$1;", "getNeedSplit", "needSplit", "getStyleList", "()Ljava/util/List;", "styleList", "getStyleBitmap", "()Landroid/graphics/Bitmap;", "styleBitmap", "getLayoutId", "layoutId", "<init>", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFaceEditPhotoCropFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceEditPhotoCropFragment.kt\ncom/xiaomi/fitness/watch/face/edit/photo/crop/FaceEditPhotoCropFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,442:1\n360#2,7:443\n*S KotlinDebug\n*F\n+ 1 FaceEditPhotoCropFragment.kt\ncom/xiaomi/fitness/watch/face/edit/photo/crop/FaceEditPhotoCropFragment\n*L\n224#1:443,7\n*E\n"})
public final class FaceEditPhotoCropFragment extends BaseBindingFragment<FaceEditPhotoCropViewModel, bx8> {
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
    private static final String TAG = "FaceEditPhotoCropFragment";
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
    private final FaceEditPhotoCropFragment$onScrollListener$1 onScrollListener = new RecyclerView.s() { // from class: com.xiaomi.fitness.watch.face.edit.photo.crop.FaceEditPhotoCropFragment$onScrollListener$1
        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                FaceEditPhotoCropFragment faceEditPhotoCropFragment = this.this$0;
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                Intrinsics.checkNotNull(layoutManager);
                faceEditPhotoCropFragment.splitStrategy = faceEditPhotoCropFragment.scrollToCenter(layoutManager);
                FaceEditPhotoCropFragment faceEditPhotoCropFragment2 = this.this$0;
                faceEditPhotoCropFragment2.initSaveBtn(faceEditPhotoCropFragment2.isConfigChange());
                this.this$0.changeStyle();
            }
        }
    };

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.edit.photo.crop.FaceEditPhotoCropFragment$getFitBitmap$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.edit.photo.crop.FaceEditPhotoCropFragment$getFitBitmap$2", f = "FaceEditPhotoCropFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
        final /* synthetic */ String $path;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$path = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceEditPhotoCropFragment.this.new AnonymousClass2(this.$path, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FaceEditPhotoCropFragment.access$getMBinding(FaceEditPhotoCropFragment.this).D.j(this.$path);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.edit.photo.crop.FaceEditPhotoCropFragment$onViewCreated$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.edit.photo.crop.FaceEditPhotoCropFragment$onViewCreated$2", f = "FaceEditPhotoCropFragment.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33692 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Theme $theme;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33692(Theme theme, Continuation<? super C33692> continuation) {
            super(2, continuation);
            this.$theme = theme;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(FaceEditPhotoCropFragment faceEditPhotoCropFragment, Bitmap bitmap, int i, Bitmap bitmap2) {
            if (i == 0) {
                PageState.DefaultImpls.showLoading$default(faceEditPhotoCropFragment, null, 0, false, 3, null);
            } else if (i == 1) {
                faceEditPhotoCropFragment.recognize = true;
                faceEditPhotoCropFragment.changeStyle();
                FaceForegroundScaleView faceForegroundScaleView = FaceEditPhotoCropFragment.access$getMBinding(faceEditPhotoCropFragment).B;
                Intrinsics.checkNotNull(bitmap2);
                faceForegroundScaleView.setForeground(bitmap2, bitmap.getWidth(), bitmap.getHeight());
                faceEditPhotoCropFragment.onRecognize();
                faceEditPhotoCropFragment.initSaveBtn(faceEditPhotoCropFragment.isConfigChange());
                faceEditPhotoCropFragment.hideLoading();
            } else if (i == 2) {
                faceEditPhotoCropFragment.changeStyle();
                faceEditPhotoCropFragment.scrollToIfNeed();
                faceEditPhotoCropFragment.initSaveBtn(faceEditPhotoCropFragment.isConfigChange());
                faceEditPhotoCropFragment.hideLoading();
            } else if (i == 3) {
                faceEditPhotoCropFragment.initSaveBtn(faceEditPhotoCropFragment.isConfigChange());
                faceEditPhotoCropFragment.hideLoading();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceEditPhotoCropFragment.this.new C33692(this.$theme, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceEditPhotoCropFragment faceEditPhotoCropFragment = FaceEditPhotoCropFragment.this;
                String str = faceEditPhotoCropFragment.originPath;
                this.label = 1;
                obj = faceEditPhotoCropFragment.getFitBitmap(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            final Bitmap bitmap = (Bitmap) obj;
            if (bitmap == null) {
                return Unit.INSTANCE;
            }
            FaceEditPhotoCropFragment.access$getMBinding(FaceEditPhotoCropFragment.this).D.setImage(bitmap);
            FaceEditPhotoCropFragment.this.setOnPortraitChangeListener();
            if (FaceEditPhotoCropFragment.this.deviceSupportFG && FaceEditPhotoCropFragment.this.supportSplit) {
                Theme theme = this.$theme;
                if ((theme != null ? theme.getFg() : null) != null) {
                    FaceEditPhotoCropFragment.this.initStyleList2();
                    final FaceEditPhotoCropFragment faceEditPhotoCropFragment2 = FaceEditPhotoCropFragment.this;
                    faceEditPhotoCropFragment2.splitPortrait(bitmap, new Function2() { // from class: com.xiaomi.fitness.watch.face.edit.photo.crop.a
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return FaceEditPhotoCropFragment.C33692.invokeSuspend$lambda$0(faceEditPhotoCropFragment2, bitmap, ((Integer) obj2).intValue(), (Bitmap) obj3);
                        }
                    });
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33692) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final /* synthetic */ bx8 access$getMBinding(FaceEditPhotoCropFragment faceEditPhotoCropFragment) {
        return faceEditPhotoCropFragment.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FaceEditPhotoCropViewModel access$getMViewModel(FaceEditPhotoCropFragment faceEditPhotoCropFragment) {
        return (FaceEditPhotoCropViewModel) faceEditPhotoCropFragment.getMViewModel();
    }

    private final void addListener() {
        getMBinding().D.setOnImageLoadListener(new OnImageLoadListener() { // from class: com.xiaomi.fitness.watch.face.edit.photo.crop.FaceEditPhotoCropFragment.addListener.1
            @Override // com.xiaomi.fitness.watch.face.edit.photo.crop.OnImageLoadListener
            public void onLoadDone() {
                FaceEditPhotoCropFragment faceEditPhotoCropFragment = FaceEditPhotoCropFragment.this;
                faceEditPhotoCropFragment.initSaveBtn(faceEditPhotoCropFragment.isConfigChange());
            }
        });
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
            getMBinding().D.setNeedDst(false);
        } else {
            getMBinding().D.setNeedDst(true);
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
            RecyclerView.Adapter adapter = getMBinding().F.getAdapter();
            if (adapter instanceof FaceEditPhotoCropStyleAdapter) {
                faceEditPhotoCropStyleAdapter = (FaceEditPhotoCropStyleAdapter) adapter;
            }
        } else {
            RecyclerView.Adapter adapter2 = getMBinding().E.getAdapter();
            if (adapter2 instanceof FaceEditPhotoCropStyleAdapter) {
                faceEditPhotoCropStyleAdapter = (FaceEditPhotoCropStyleAdapter) adapter2;
            }
        }
        if (faceEditPhotoCropStyleAdapter != null) {
            faceEditPhotoCropStyleAdapter.setSplitStrategy(this.splitStrategy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFitBitmap(String str, Continuation<? super Bitmap> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(str, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getNeedSplit() {
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
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: tt8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaceEditPhotoCropFragment.initSaveBtn$lambda$3(this.f35013a, wearableDeviceModel, view);
            }
        });
    }

    public static /* synthetic */ void initSaveBtn$default(FaceEditPhotoCropFragment faceEditPhotoCropFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        faceEditPhotoCropFragment.initSaveBtn(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSaveBtn$lambda$3(FaceEditPhotoCropFragment this$0, WearableDeviceModel wearableDeviceModel, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "save crop photo");
        this$0.showLoading();
        AnyExtKt.io$default(null, new FaceEditPhotoCropFragment$initSaveBtn$2$1(this$0, wearableDeviceModel, null), 1, null);
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
                miuix.recyclerview.widget.RecyclerView mStyleLabel = getMBinding().E;
                Intrinsics.checkNotNullExpressionValue(mStyleLabel, "mStyleLabel");
                ViewExtKt.visible(mStyleLabel);
                FaceEditPhotoCropStyleAdapter faceEditPhotoCropStyleAdapter = new FaceEditPhotoCropStyleAdapter(new FaceEditPhotoCropFragment$initStyleList$styleAdapter$1(this));
                getMBinding().E.setAdapter(faceEditPhotoCropStyleAdapter);
                getMBinding().E.addItemDecoration(new FaceEditPhotoCropStyleDecoration());
                getMBinding().E.setLayoutManager(new LinearLayoutManager(ApplicationExtKt.getApplication(), 0, false));
                faceEditPhotoCropStyleAdapter.setStyleList(this.normalStyleList, this.splitStrategy);
                getMBinding().E.addOnScrollListener(this.onScrollListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initStyleList2() {
        FaceEditPhotoCropStyleAdapter faceEditPhotoCropStyleAdapter = new FaceEditPhotoCropStyleAdapter(new FaceEditPhotoCropFragment$initStyleList2$styleAdapter$1(this));
        getMBinding().F.setAdapter(faceEditPhotoCropStyleAdapter);
        getMBinding().F.addItemDecoration(new FaceEditPhotoCropStyleDecoration());
        getMBinding().F.setLayoutManager(new LinearLayoutManager(ApplicationExtKt.getApplication(), 0, false));
        faceEditPhotoCropStyleAdapter.setStyleList(this.splitStyleList, this.splitStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isConfigChange() {
        return isPositionChange() || isPhotoChange();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isPhotoChange() {
        WatchFaceImage backgroundImage;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Bitmap bitmapH = getMBinding().D.h(false, FaceManager.INSTANCE.getProductImageFormat(wearableDeviceModel));
        if (bitmapH == null) {
            return true;
        }
        String strSaveTempSnapshot = ((FaceEditPhotoCropViewModel) getMViewModel()).saveTempSnapshot(wearableDeviceModel, this.originPath, bitmapH);
        FaceEditPhotoBean faceEditPhotoBean = this.faceEditPhotoBean;
        return !Intrinsics.areEqual(strSaveTempSnapshot, (faceEditPhotoBean == null || (backgroundImage = faceEditPhotoBean.getBackgroundImage()) == null) ? null : backgroundImage.getMd5());
    }

    private final boolean isPositionChange() {
        return initSplitStrategy() != this.splitStrategy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRecognize() {
        miuix.recyclerview.widget.RecyclerView mStyleLabel = getMBinding().E;
        Intrinsics.checkNotNullExpressionValue(mStyleLabel, "mStyleLabel");
        ViewExtKt.invisible(mStyleLabel);
        getMBinding().E.removeOnScrollListener(this.onScrollListener);
        miuix.recyclerview.widget.RecyclerView mStyleLabel2 = getMBinding().F;
        Intrinsics.checkNotNullExpressionValue(mStyleLabel2, "mStyleLabel2");
        ViewExtKt.visible(mStyleLabel2);
        getMBinding().F.addOnScrollListener(this.onScrollListener);
        scrollToIfNeed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStyleClick(int style) {
        this.splitStrategy = style;
        initSaveBtn(isConfigChange());
        scrollToIfNeed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(FaceEditPhotoCropFragment this$0, View view) {
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
            getMBinding().F.smoothScrollBy(i, 0);
        } else {
            getMBinding().E.smoothScrollBy(i, 0);
        }
        return getStyleList().get(i2).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToIfNeed() {
        if (getMBinding().E.getChildCount() < this.splitStrategy) {
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
        View childAt = this.recognize ? getMBinding().F.getChildAt(i) : getMBinding().E.getChildAt(i);
        int left = ((childAt.getLeft() + childAt.getRight()) / 2) - screenWidth;
        if (this.recognize) {
            getMBinding().F.smoothScrollBy(left, 0);
        } else {
            getMBinding().E.smoothScrollBy(left, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOnPortraitChangeListener() {
        getMBinding().D.setOnPortraitScaleListener(new OnPortraitScaleListener() { // from class: com.xiaomi.fitness.watch.face.edit.photo.crop.FaceEditPhotoCropFragment.setOnPortraitChangeListener.1
            @Override // com.xiaomi.fitness.watch.face.edit.photo.crop.OnPortraitScaleListener
            public void onMove(float distanceX, float distanceY) {
                FaceEditPhotoCropFragment.this.neverChange = false;
                View view = FaceEditPhotoCropFragment.this.endView;
                if (view != null) {
                    ViewExtKt.gone(view);
                }
                if (FaceEditPhotoCropFragment.this.recognize) {
                    FaceEditPhotoCropFragment.access$getMBinding(FaceEditPhotoCropFragment.this).B.setMove(distanceX, distanceY);
                }
            }

            @Override // com.xiaomi.fitness.watch.face.edit.photo.crop.OnPortraitScaleListener
            public void onScale(float scaleFactor, ScaleGestureDetector detector) {
                Intrinsics.checkNotNullParameter(detector, "detector");
                FaceEditPhotoCropFragment.this.neverChange = false;
                View view = FaceEditPhotoCropFragment.this.endView;
                if (view != null) {
                    ViewExtKt.gone(view);
                }
                if (FaceEditPhotoCropFragment.this.recognize) {
                    FaceEditPhotoCropFragment.access$getMBinding(FaceEditPhotoCropFragment.this).B.setScale(scaleFactor, detector);
                }
            }

            @Override // com.xiaomi.fitness.watch.face.edit.photo.crop.OnPortraitScaleListener
            public void onchangeEnd() {
                FaceEditPhotoCropFragment faceEditPhotoCropFragment = FaceEditPhotoCropFragment.this;
                faceEditPhotoCropFragment.initSaveBtn(faceEditPhotoCropFragment.isConfigChange());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void splitPortrait(Bitmap bitmap, final Function2<? super Integer, ? super Bitmap, Unit> cropBitmap) {
        FaceEditPhotoCropManager faceEditPhotoCropManager = FaceEditPhotoCropManager.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        faceEditPhotoCropManager.split(contextRequireContext, bitmap, new Function2() { // from class: st8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FaceEditPhotoCropFragment.splitPortrait$lambda$4(cropBitmap, ((Integer) obj).intValue(), (Bitmap) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit splitPortrait$lambda$4(Function2 cropBitmap, int i, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(cropBitmap, "$cropBitmap");
        AnyExtKt.main$default(null, new FaceEditPhotoCropFragment$splitPortrait$1$1(cropBitmap, i, bitmap, null), 1, null);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return ovi.d;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        if (this.neverChange || !isConfigChange()) {
            return false;
        }
        new CommonDialog.c("save photo").setDialogTitle(p1j.C0).setDialogDescription(p1j.B0).setPositiveText(p1j.d).setNegativeText(p1j.c).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.watch.face.edit.photo.crop.FaceEditPhotoCropFragment.onBackPressed.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -2) {
                    if (which != -1) {
                        return;
                    }
                    FaceEditPhotoCropFragment.this.finish();
                } else if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }).showIfNeed(getParentFragmentManager());
        return true;
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
        IActionBar.DefaultImpls.setStartView$default(this, 0, noi.L, null, new View.OnClickListener() { // from class: rt8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FaceEditPhotoCropFragment.onViewCreated$lambda$0(this.f32886a, view2);
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
        AnyExtKt.main$default(null, new C33692(theme, null), 1, null);
    }
}
