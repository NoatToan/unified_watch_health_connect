package com.xiaomi.fitness.watch.face.edit.photo;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.watch.face.db.FaceBleMultiPhoto;
import com.xiaomi.fitness.watch.face.db.FaceCommonEntity;
import com.xiaomi.fitness.watch.face.db.WatchFaceDao;
import com.xiaomi.fitness.watch.face.db.WatchFaceDataBase;
import com.xiaomi.fitness.watch.face.edit.photo.FaceEditPhotoHelper;
import com.xiaomi.fitness.watch.face.export.data.FaceEditPhotoBean;
import com.xiaomi.fitness.watch.face.export.data.WatchFaceImage;
import com.xiaomi.onetrack.OneTrack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\u000b¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u00020\b2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\u000b¢\u0006\u0002\u0010\fJ$\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00052\u0006\u0010\u0012\u001a\u00020\u0013J&\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u0007J\u0006\u0010\u001b\u001a\u00020\bJ.\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0010H\u0002R \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/photo/FaceEditPhotoHelper;", "", "<init>", "()V", "imageChangeListenerList", "", "Lkotlin/Function1;", "", "", "addImageChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/watch/face/edit/photo/picker/OnWatchFaceImageListChangeListener;", "(Lkotlin/jvm/functions/Function1;)V", "removeImageChangeListener", "initMd5List", "list", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;", "photoId", "", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mergedPhotoMap", "", "getCurrentPhotoList", "setCurrentPhotoList", "photoList", OneTrack.Event.PLAY, "resetCurrentPhotoList", "setMd5List", "roomList", "Lcom/xiaomi/fitness/watch/face/db/FaceBleMultiPhoto;", "TAG", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFaceEditPhotoHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceEditPhotoHelper.kt\ncom/xiaomi/fitness/watch/face/edit/photo/FaceEditPhotoHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1863#2,2:87\n1863#2,2:90\n1#3:89\n*S KotlinDebug\n*F\n+ 1 FaceEditPhotoHelper.kt\ncom/xiaomi/fitness/watch/face/edit/photo/FaceEditPhotoHelper\n*L\n42#1:87,2\n81#1:90,2\n*E\n"})
public final class FaceEditPhotoHelper {

    @NotNull
    private static final String TAG = "FaceEditPhotoHelper";

    @NotNull
    public static final FaceEditPhotoHelper INSTANCE = new FaceEditPhotoHelper();

    @NotNull
    private static final List<Function1<Boolean, Unit>> imageChangeListenerList = new ArrayList();

    @NotNull
    private static final Map<String, List<FaceEditPhotoBean>> mergedPhotoMap = new LinkedHashMap();

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.edit.photo.FaceEditPhotoHelper$initMd5List$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.edit.photo.FaceEditPhotoHelper", f = "FaceEditPhotoHelper.kt", i = {0, 0, 0}, l = {24}, m = "initMd5List", n = {"this", "list", "photoId"}, s = {"L$0", "L$1", "L$2"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
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
            return FaceEditPhotoHelper.this.initMd5List(null, null, this);
        }
    }

    private FaceEditPhotoHelper() {
    }

    public static /* synthetic */ void setCurrentPhotoList$default(FaceEditPhotoHelper faceEditPhotoHelper, String str, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        faceEditPhotoHelper.setCurrentPhotoList(str, list, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setCurrentPhotoList$lambda$0(FaceEditPhotoBean it) {
        String originImagePath;
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getBackgroundImage().getMd5(), "") && ((originImagePath = it.getBackgroundImage().getOriginImagePath()) == null || originImagePath.length() == 0);
    }

    private final void setMd5List(String photoId, List<FaceEditPhotoBean> list, List<FaceBleMultiPhoto> roomList) {
        FaceBleMultiPhoto faceBleMultiPhoto;
        Object next;
        ArrayList arrayList = new ArrayList();
        for (FaceEditPhotoBean faceEditPhotoBean : list) {
            if (roomList != null) {
                Iterator<T> it = roomList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((FaceBleMultiPhoto) next).getMultiMd5(), faceEditPhotoBean.getBackgroundImage().getMd5()));
                faceBleMultiPhoto = (FaceBleMultiPhoto) next;
            } else {
                faceBleMultiPhoto = null;
            }
            if (faceBleMultiPhoto != null) {
                arrayList.add(new FaceEditPhotoBean(faceEditPhotoBean.getPositionIndex(), new WatchFaceImage(faceBleMultiPhoto.getMultiMd5(), faceBleMultiPhoto.getMultiPath(), null, faceBleMultiPhoto.getOriPath(), faceBleMultiPhoto.getOriMd5(), faceBleMultiPhoto.getThumbnailPath(), faceBleMultiPhoto.getDuration(), faceBleMultiPhoto.getThumbnailPath(), 4, null), faceBleMultiPhoto.getFg() == null ? null : new WatchFaceImage(faceBleMultiPhoto.getFg().getMd5(), faceBleMultiPhoto.getFg().getPath(), null, null, null, null, null, null, 252, null)));
            } else {
                arrayList.add(new FaceEditPhotoBean(0, new WatchFaceImage(faceEditPhotoBean.getBackgroundImage().getMd5(), null, null, null, null, null, null, null, 254, null), null, 4, null));
            }
        }
        mergedPhotoMap.put(photoId, arrayList);
        Iterator<T> it2 = imageChangeListenerList.iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke2(Boolean.TRUE);
        }
    }

    public final void addImageChangeListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        imageChangeListenerList.add(listener);
    }

    @NotNull
    public final List<FaceEditPhotoBean> getCurrentPhotoList(@NotNull String photoId) {
        Intrinsics.checkNotNullParameter(photoId, "photoId");
        List<FaceEditPhotoBean> list = mergedPhotoMap.get(photoId);
        return list == null ? new ArrayList() : list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object initMd5List(@NotNull List<FaceEditPhotoBean> list, @NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        FaceEditPhotoHelper faceEditPhotoHelper;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object watchFace = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(watchFace);
            mergedPhotoMap.clear();
            WatchFaceDao watchFaceDao = WatchFaceDataBase.INSTANCE.getInstance().watchFaceDao();
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = list;
            anonymousClass1.L$2 = str;
            anonymousClass1.label = 1;
            watchFace = watchFaceDao.getWatchFace(str, anonymousClass1);
            if (watchFace == coroutine_suspended) {
                return coroutine_suspended;
            }
            faceEditPhotoHelper = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) anonymousClass1.L$2;
            list = (List) anonymousClass1.L$1;
            faceEditPhotoHelper = (FaceEditPhotoHelper) anonymousClass1.L$0;
            ResultKt.throwOnFailure(watchFace);
        }
        FaceCommonEntity faceCommonEntity = (FaceCommonEntity) watchFace;
        Logger.i(TAG, "faceBlePhoto: " + faceCommonEntity);
        faceEditPhotoHelper.setMd5List(str, list, faceCommonEntity != null ? faceCommonEntity.getMultiPhotoDataList() : null);
        return Unit.INSTANCE;
    }

    public final void removeImageChangeListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        imageChangeListenerList.remove(listener);
    }

    public final void resetCurrentPhotoList() {
        mergedPhotoMap.clear();
    }

    public final void setCurrentPhotoList(@NotNull String photoId, @NotNull List<FaceEditPhotoBean> photoList, boolean play) {
        Intrinsics.checkNotNullParameter(photoId, "photoId");
        Intrinsics.checkNotNullParameter(photoList, "photoList");
        List<FaceEditPhotoBean> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) photoList);
        CollectionsKt__MutableCollectionsKt.removeAll((List) mutableList, new Function1() { // from class: yt8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(FaceEditPhotoHelper.setCurrentPhotoList$lambda$0((FaceEditPhotoBean) obj));
            }
        });
        mergedPhotoMap.put(photoId, mutableList);
        Iterator<T> it = imageChangeListenerList.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke2(Boolean.valueOf(play));
        }
    }
}
