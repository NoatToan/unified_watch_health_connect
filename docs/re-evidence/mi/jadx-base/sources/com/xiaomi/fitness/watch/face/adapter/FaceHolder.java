package com.xiaomi.fitness.watch.face.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.watch.face.FaceDetailFragment;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.db.FaceBleMultiPhoto;
import com.xiaomi.fitness.watch.face.db.FaceCommonEntity;
import com.xiaomi.fitness.watch.face.db.WatchFaceDao;
import com.xiaomi.fitness.watch.face.db.WatchFaceDataBase;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import com.xiaomi.fitness.watch.face.ext.FaceExtKt;
import com.xiaomi.fitness.watch.face.helper.FaceOneTrackUtil;
import com.xiaomi.fitness.watch.face.impl.Callback;
import com.xiaomi.fitness.watch.face.view.FaceImageView;
import com.xiaomi.onetrack.OneTrack;
import defpackage.iki;
import defpackage.isi;
import defpackage.p1j;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u00103\u001a\u00020&\u0012\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b4\u00105J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J5\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\"\u00100\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0017\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u0010\u001b¨\u00066"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "showCanUpgrade", "()V", "showCanEdit", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "bean", "", "from", "", "isEdit", "checked", "position", "bindView", "(Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;IZZI)V", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "isHuaMi", "Z", "Lcom/xiaomi/fitness/watch/face/view/FaceImageView;", "mImageView", "Lcom/xiaomi/fitness/watch/face/view/FaceImageView;", "getMImageView", "()Lcom/xiaomi/fitness/watch/face/view/FaceImageView;", "setMImageView", "(Lcom/xiaomi/fitness/watch/face/view/FaceImageView;)V", "Landroid/widget/TextView;", "mNameView", "Landroid/widget/TextView;", "getMNameView", "()Landroid/widget/TextView;", "setMNameView", "(Landroid/widget/TextView;)V", "mStatView", "getMStatView", "setMStatView", "Landroid/view/View;", "mTagView", "Landroid/view/View;", "getMTagView", "()Landroid/view/View;", "setMTagView", "(Landroid/view/View;)V", "checkView", "getCheckView", "setCheckView", "mStyleView", "getMStyleView", "setMStyleView", "itemView", "<init>", "(Landroid/view/View;Z)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceHolder extends RecyclerView.d0 {

    @NotNull
    private View checkView;
    private final boolean isHuaMi;

    @NotNull
    private final Context mContext;

    @NotNull
    private FaceImageView mImageView;

    @NotNull
    private TextView mNameView;

    @NotNull
    private TextView mStatView;

    @NotNull
    private FaceImageView mStyleView;

    @NotNull
    private View mTagView;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.adapter.FaceHolder$bindView$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.adapter.FaceHolder$bindView$1", f = "FaceHolder.kt", i = {}, l = {77, 126}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WatchFace $bean;
        final /* synthetic */ WearableDeviceModel $deviceModel;
        final /* synthetic */ FaceImageView $imageView;
        final /* synthetic */ String $photoId;
        final /* synthetic */ FaceImageView $styleView;
        int label;
        final /* synthetic */ FaceHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, WatchFace watchFace, FaceImageView faceImageView, FaceHolder faceHolder, WearableDeviceModel wearableDeviceModel, FaceImageView faceImageView2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$photoId = str;
            this.$bean = watchFace;
            this.$imageView = faceImageView;
            this.this$0 = faceHolder;
            this.$deviceModel = wearableDeviceModel;
            this.$styleView = faceImageView2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$photoId, this.$bean, this.$imageView, this.this$0, this.$deviceModel, this.$styleView, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:57:0x01a0  */
        /* JADX WARN: Code duplicated, block: B:71:0x0259  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object watchFace;
            Object watchFace2;
            String md5;
            FaceCommonEntity faceCommonEntity;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            final String spiritColor = null;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    watchFace = obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    watchFace2 = obj;
                }
                faceCommonEntity = (FaceCommonEntity) watchFace2;
                if (faceCommonEntity != null) {
                    spiritColor = faceCommonEntity.getUpperColor();
                }
                FaceManager faceManager = FaceManager.INSTANCE;
                String styleUrl = this.$bean.getStyleUrl();
                final FaceImageView faceImageView = this.$styleView;
                faceManager.loadFaceUrl(styleUrl, faceImageView, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : new Callback() { // from class: com.xiaomi.fitness.watch.face.adapter.FaceHolder.bindView.1.1
                    @Override // com.xiaomi.fitness.watch.face.impl.Callback
                    public void onReady(Drawable drawable) {
                        Intrinsics.checkNotNullParameter(drawable, "drawable");
                        faceImageView.setImageDrawable(drawable);
                        faceImageView.tintColor(spiritColor);
                    }
                }, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            WatchFaceDao watchFaceDao = WatchFaceDataBase.INSTANCE.getInstance().watchFaceDao();
            String str = this.$photoId;
            this.label = 1;
            watchFace = watchFaceDao.getWatchFace(str, this);
            if (watchFace == coroutine_suspended) {
                return coroutine_suspended;
            }
            FaceCommonEntity faceCommonEntity2 = (FaceCommonEntity) watchFace;
            Logger.i("faceHolder " + this.$bean.getId() + ": " + faceCommonEntity2, new Object[0]);
            FaceManager faceManager2 = FaceManager.INSTANCE;
            if (!faceManager2.isInstalled(this.$bean.getId()) || faceCommonEntity2 == null) {
                ViewExtKt.visible(this.$imageView);
                faceManager2.loadFaceUrl(this.$bean.getBottom_background(), this.this$0.getMImageView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            } else {
                String path = faceCommonEntity2.getPath();
                if (path == null || path.length() == 0 || (md5 = faceCommonEntity2.getMd5()) == null || md5.length() == 0) {
                    List<FaceBleMultiPhoto> multiPhotoDataList = faceCommonEntity2.getMultiPhotoDataList();
                    if (multiPhotoDataList == null || multiPhotoDataList.isEmpty()) {
                        ViewExtKt.visible(this.$imageView);
                        faceManager2.loadFaceUrl(this.$bean.getBottom_background(), this.this$0.getMImageView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
                    } else {
                        WatchFace face = faceManager2.getFace(this.$bean.getId());
                        String[] backgroundImageList = face != null ? face.getBackgroundImageList() : null;
                        if (backgroundImageList == null || backgroundImageList.length == 0) {
                            ViewExtKt.visible(this.$imageView);
                            FaceManager.INSTANCE.loadFaceUrl(this.$bean.getBottom_background(), this.this$0.getMImageView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
                        } else {
                            Iterator it = ArrayIteratorKt.iterator(backgroundImageList);
                            boolean z = false;
                            while (it.hasNext()) {
                                String str2 = (String) it.next();
                                List<FaceBleMultiPhoto> multiPhotoDataList2 = faceCommonEntity2.getMultiPhotoDataList();
                                Intrinsics.checkNotNull(multiPhotoDataList2);
                                Iterator<FaceBleMultiPhoto> it2 = multiPhotoDataList2.iterator();
                                while (it2.hasNext()) {
                                    if (Intrinsics.areEqual(str2, it2.next().getMultiMd5())) {
                                        ViewExtKt.visible(this.$imageView);
                                        FaceManager faceManager3 = FaceManager.INSTANCE;
                                        List<FaceBleMultiPhoto> multiPhotoDataList3 = faceCommonEntity2.getMultiPhotoDataList();
                                        Intrinsics.checkNotNull(multiPhotoDataList3);
                                        faceManager3.loadFaceFile(new File(multiPhotoDataList3.get(0).getMultiPath() + ".png"), this.$imageView, (108 & 4) != 0 ? false : false, (108 & 8) != 0 ? false : false, (108 & 16) != 0 ? false : false, (108 & 32) != 0 ? false : false, (108 & 64) != 0 ? false : false);
                                        z = true;
                                        break;
                                    }
                                }
                            }
                            if (!z) {
                                ViewExtKt.visible(this.$imageView);
                                FaceManager.INSTANCE.loadFaceUrl(this.$bean.getBottom_background(), this.this$0.getMImageView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
                            }
                        }
                    }
                } else {
                    WatchFace face2 = faceManager2.getFace(this.$bean.getId());
                    if (Intrinsics.areEqual(face2 != null ? face2.getBackgroundImage() : null, faceCommonEntity2.getMd5())) {
                        ViewExtKt.visible(this.$imageView);
                        faceManager2.loadFaceFile(new File(faceCommonEntity2.getPath() + ".png"), this.$imageView, (108 & 4) != 0 ? false : false, (108 & 8) != 0 ? false : false, (108 & 16) != 0 ? false : false, (108 & 32) != 0 ? false : false, (108 & 64) != 0 ? false : false);
                    } else {
                        ViewExtKt.visible(this.$imageView);
                        faceManager2.loadFaceUrl(this.$bean.getBottom_background(), this.this$0.getMImageView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
                    }
                }
            }
            FaceManager faceManager4 = FaceManager.INSTANCE;
            if (faceManager4.isInstalled(this.$bean.getId()) && this.$bean.getHasSpiritColor()) {
                if (FaceExtKt.isSupportZhouHaiPhotoFace(this.$deviceModel)) {
                    WatchFaceDao watchFaceDao2 = WatchFaceDataBase.INSTANCE.getInstance().watchFaceDao();
                    String did = this.$deviceModel.getDid();
                    String id = this.$bean.getId();
                    this.label = 2;
                    watchFace2 = watchFaceDao2.getWatchFace(did, id, this);
                    if (watchFace2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    faceCommonEntity = (FaceCommonEntity) watchFace2;
                    if (faceCommonEntity != null) {
                        spiritColor = faceCommonEntity.getUpperColor();
                    }
                } else {
                    spiritColor = this.$bean.getSpiritColor();
                }
                FaceManager faceManager5 = FaceManager.INSTANCE;
                String styleUrl2 = this.$bean.getStyleUrl();
                final FaceImageView faceImageView2 = this.$styleView;
                faceManager5.loadFaceUrl(styleUrl2, faceImageView2, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : new Callback() { // from class: com.xiaomi.fitness.watch.face.adapter.FaceHolder.bindView.1.1
                    @Override // com.xiaomi.fitness.watch.face.impl.Callback
                    public void onReady(Drawable drawable) {
                        Intrinsics.checkNotNullParameter(drawable, "drawable");
                        faceImageView2.setImageDrawable(drawable);
                        faceImageView2.tintColor(spiritColor);
                    }
                }, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            } else if (this.$bean.getIsPortraitFace()) {
                faceManager4.loadFaceUrl(this.$bean.icon, this.$styleView, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            } else {
                faceManager4.loadFaceUrl(this.$bean.getStyleUrl(), this.$styleView, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.adapter.FaceHolder$bindView$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.adapter.FaceHolder$bindView$2", f = "FaceHolder.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WatchFace $bean;
        final /* synthetic */ Ref.BooleanRef $huamiColor;
        final /* synthetic */ Ref.BooleanRef $huamiPhoto;
        final /* synthetic */ FaceImageView $imageView;
        final /* synthetic */ String $photoId;
        final /* synthetic */ FaceImageView $styleView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, FaceImageView faceImageView, WatchFace watchFace, Ref.BooleanRef booleanRef, FaceImageView faceImageView2, Ref.BooleanRef booleanRef2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$photoId = str;
            this.$styleView = faceImageView;
            this.$bean = watchFace;
            this.$huamiPhoto = booleanRef;
            this.$imageView = faceImageView2;
            this.$huamiColor = booleanRef2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$photoId, this.$styleView, this.$bean, this.$huamiPhoto, this.$imageView, this.$huamiColor, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object watchFace;
            List<FaceBleMultiPhoto> multiPhotoDataList;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WatchFaceDao watchFaceDao = WatchFaceDataBase.INSTANCE.getInstance().watchFaceDao();
                String str = this.$photoId;
                this.label = 1;
                watchFace = watchFaceDao.getWatchFace(str, this);
                if (watchFace == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                watchFace = obj;
            }
            final FaceCommonEntity faceCommonEntity = (FaceCommonEntity) watchFace;
            ViewExtKt.visible(this.$styleView);
            Logger.i("faceHolder " + this.$bean.getId() + ": " + faceCommonEntity, new Object[0]);
            FaceManager faceManager = FaceManager.INSTANCE;
            if (faceManager.isInstalled(this.$bean.getId()) && faceCommonEntity != null && this.$bean.getCanEdit()) {
                if (this.$bean.getAlbum_picture_type() != 1 || (multiPhotoDataList = faceCommonEntity.getMultiPhotoDataList()) == null || multiPhotoDataList.isEmpty()) {
                    String path = faceCommonEntity.getPath();
                    if (path != null && path.length() != 0 && new File(faceCommonEntity.getPath()).exists()) {
                        faceManager.loadFaceFile(new File(faceCommonEntity.getPath()), this.$imageView, (108 & 4) != 0 ? false : false, (108 & 8) != 0 ? false : false, (108 & 16) != 0 ? false : false, (108 & 32) != 0 ? false : false, (108 & 64) != 0 ? false : false);
                        this.$huamiPhoto.element = true;
                    }
                } else {
                    this.$huamiPhoto.element = true;
                    List<FaceBleMultiPhoto> multiPhotoDataList2 = faceCommonEntity.getMultiPhotoDataList();
                    Intrinsics.checkNotNull(multiPhotoDataList2);
                    faceManager.loadFaceFile(new File(multiPhotoDataList2.get(0).getMultiPath()), this.$imageView, (108 & 4) != 0 ? false : false, (108 & 8) != 0 ? false : false, (108 & 16) != 0 ? false : false, (108 & 32) != 0 ? false : false, (108 & 64) != 0 ? false : false);
                }
            }
            String styleUrl = this.$bean.getStyleUrl();
            final FaceImageView faceImageView = this.$styleView;
            final Ref.BooleanRef booleanRef = this.$huamiColor;
            faceManager.loadFaceUrl(styleUrl, faceImageView, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : new Callback() { // from class: com.xiaomi.fitness.watch.face.adapter.FaceHolder.bindView.2.1
                @Override // com.xiaomi.fitness.watch.face.impl.Callback
                public void onReady(Drawable drawable) {
                    Intrinsics.checkNotNullParameter(drawable, "drawable");
                    faceImageView.setImageDrawable(drawable);
                    FaceCommonEntity faceCommonEntity2 = faceCommonEntity;
                    String upperColor = faceCommonEntity2 != null ? faceCommonEntity2.getUpperColor() : null;
                    if (upperColor == null || upperColor.length() == 0) {
                        return;
                    }
                    booleanRef.element = true;
                    FaceImageView faceImageView2 = faceImageView;
                    FaceCommonEntity faceCommonEntity3 = faceCommonEntity;
                    faceImageView2.tintColor(faceCommonEntity3 != null ? faceCommonEntity3.getUpperColor() : null);
                }
            }, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            if (!this.$huamiColor.element && !this.$huamiPhoto.element) {
                faceManager.loadFaceBean(this.$bean, this.$imageView, (108 & 4) != 0 ? false : false, (108 & 8) != 0 ? false : false, (108 & 16) != 0 ? false : false, (108 & 32) != 0 ? false : false, (108 & 64) != 0 ? false : false);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceHolder(@NotNull View itemView, boolean z) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.mContext = itemView.getContext();
        this.mImageView = (FaceImageView) itemView.findViewById(isi.T0);
        this.mNameView = (TextView) itemView.findViewById(isi.V0);
        this.mStatView = (TextView) itemView.findViewById(isi.a1);
        this.mTagView = itemView.findViewById(isi.e1);
        this.checkView = itemView.findViewById(isi.z);
        this.mStyleView = (FaceImageView) itemView.findViewById(isi.d1);
        this.isHuaMi = z;
    }

    private final void showCanEdit() {
        ViewExtKt.visible(this.mStatView);
        this.mStatView.setTextColor(ApplicationExtKt.getApplication().getColor(iki.m));
        this.mStatView.setText(p1j.m0);
    }

    private final void showCanUpgrade() {
        ViewExtKt.visible(this.mStatView);
        this.mStatView.setTextColor(ApplicationExtKt.getApplication().getColor(iki.c));
        this.mStatView.setText(p1j.n0);
    }

    public final void bindView(@NotNull WatchFace bean, int from, boolean isEdit, boolean checked, int position) {
        boolean z;
        Intrinsics.checkNotNullParameter(bean, "bean");
        ViewExtKt.invisible(this.mStatView);
        this.mNameView.setText(bean.getName());
        FaceImageView faceImageView = this.mImageView;
        FaceImageView faceImageView2 = this.mStyleView;
        this.mTagView.setVisibility(8);
        this.mTagView.setVisibility(8);
        this.mNameView.setText(bean.getName());
        if (this.isHuaMi) {
            if (isEdit) {
                this.checkView.setVisibility(0);
                this.checkView.setSelected(checked);
            } else {
                this.checkView.setVisibility(8);
            }
        } else if (from == 2) {
            this.checkView.setVisibility(8);
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        FaceManager faceManager = FaceManager.INSTANCE;
        if (faceManager.canUpgrade(bean, wearableDeviceModel)) {
            showCanUpgrade();
        } else if (bean.getCanEdit()) {
            showCanEdit();
        }
        T currentDeviceModel = DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        Intrinsics.checkNotNull(currentDeviceModel);
        String str = ((WearableDeviceModel) currentDeviceModel).getDeviceInfo().getDid() + bean.getId();
        if (DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
            if (bean.getCanEdit()) {
                faceImageView2.setVisibility(bean.getBgImg() != 1 ? 4 : 0);
                if (bean.getBgImg() == 1) {
                    ScopeExtKt.scopeNet$default(null, new AnonymousClass1(str, bean, faceImageView, this, wearableDeviceModel, faceImageView2, null), 1, null);
                } else {
                    ViewExtKt.visible(faceImageView);
                    z = true;
                    faceManager.loadFaceBean(bean, faceImageView, (108 & 4) != 0 ? false : false, (108 & 8) != 0 ? false : false, (108 & 16) != 0 ? false : false, (108 & 32) != 0 ? false : false, (108 & 64) != 0 ? false : false);
                }
            } else {
                z = true;
                if (bean.getFaceType() == 4) {
                    faceImageView2.setVisibility(0);
                    faceManager.loadFaceUrl(bean.getStyleUrl(), faceImageView2, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
                    faceImageView.setVisibility(4);
                } else {
                    faceImageView2.setVisibility(4);
                    ViewExtKt.visible(faceImageView);
                    faceManager.loadFaceBean(bean, faceImageView, (108 & 4) != 0 ? false : false, (108 & 8) != 0 ? false : false, (108 & 16) != 0 ? false : false, (108 & 32) != 0 ? false : false, (108 & 64) != 0 ? false : false);
                }
            }
        } else if (!DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            faceImageView2.setVisibility(8);
            faceManager.loadFaceBean(bean, faceImageView, (108 & 4) != 0 ? false : false, (108 & 8) != 0 ? false : false, (108 & 16) != 0 ? false : false, (108 & 32) != 0 ? false : false, (108 & 64) != 0 ? false : false);
        } else if (bean.getCanEdit() && bean.getBgImg() == 1) {
            ScopeExtKt.scopeNet$default(null, new AnonymousClass2(str, faceImageView2, bean, booleanRef2, faceImageView, booleanRef, null), 1, null);
        } else {
            ViewExtKt.gone(faceImageView2);
            faceManager.loadFaceBean(bean, faceImageView, (108 & 4) != 0 ? false : false, (108 & 8) != 0 ? false : false, (108 & 16) != 0 ? false : false, (108 & 32) != 0 ? false : false, (108 & 64) != 0 ? false : false);
        }
        this.itemView.setTag(FaceOneTrackUtil.buildTrackContent$default(FaceOneTrackUtil.INSTANCE, bean.getId(), "expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.0.0.0.39956"), TuplesKt.to("name", "watchface_single"), TuplesKt.to("asset_id", bean.getId()), TuplesKt.to(OneTrack.Param.ASSET_NAME, bean.getName()), TuplesKt.to(FaceDetailFragment.PAGE_NAME, ResourceExtKt.getString(p1j.q0)), TuplesKt.to("source", 10), TuplesKt.to("utm_source", 14), TuplesKt.to("watchface_position_id", Integer.valueOf(position + 1))), 0.0f, 8, null));
    }

    @NotNull
    public final View getCheckView() {
        return this.checkView;
    }

    @NotNull
    public final FaceImageView getMImageView() {
        return this.mImageView;
    }

    @NotNull
    public final TextView getMNameView() {
        return this.mNameView;
    }

    @NotNull
    public final TextView getMStatView() {
        return this.mStatView;
    }

    @NotNull
    public final FaceImageView getMStyleView() {
        return this.mStyleView;
    }

    @NotNull
    public final View getMTagView() {
        return this.mTagView;
    }

    public final void setCheckView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.checkView = view;
    }

    public final void setMImageView(@NotNull FaceImageView faceImageView) {
        Intrinsics.checkNotNullParameter(faceImageView, "<set-?>");
        this.mImageView = faceImageView;
    }

    public final void setMNameView(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mNameView = textView;
    }

    public final void setMStatView(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mStatView = textView;
    }

    public final void setMStyleView(@NotNull FaceImageView faceImageView) {
        Intrinsics.checkNotNullParameter(faceImageView, "<set-?>");
        this.mStyleView = faceImageView;
    }

    public final void setMTagView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.mTagView = view;
    }
}
