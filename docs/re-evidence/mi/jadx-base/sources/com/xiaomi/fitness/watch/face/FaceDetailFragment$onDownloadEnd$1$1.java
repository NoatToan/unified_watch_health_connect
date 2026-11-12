package com.xiaomi.fitness.watch.face;

import android.os.Bundle;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import com.xiaomi.fitness.watch.face.viewmodel.FaceDetailViewModel;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceDetailFragment$onDownloadEnd$1$1", f = "FaceDetailFragment.kt", i = {}, l = {1062}, m = "invokeSuspend", n = {}, s = {})
public final class FaceDetailFragment$onDownloadEnd$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ FaceDetailFragment this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceDetailFragment$onDownloadEnd$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceDetailFragment$onDownloadEnd$1$1$1", f = "FaceDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ File $unzipParentFile;
        int label;
        final /* synthetic */ FaceDetailFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FaceDetailFragment faceDetailFragment, File file, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = faceDetailFragment;
            this.$unzipParentFile = file;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$unzipParentFile, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String absolutePath;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.setButton1();
            this.this$0.toDismissDialog();
            this.this$0.stackTop = false;
            FaceDetailFragment faceDetailFragment = this.this$0;
            Bundle bundle = new Bundle();
            FaceDetailFragment faceDetailFragment2 = this.this$0;
            File file = this.$unzipParentFile;
            FaceManager faceManager = FaceManager.INSTANCE;
            WatchFace mInfo = faceDetailFragment2.getMInfo();
            WatchFace face = faceManager.getFace(mInfo != null ? mInfo.getId() : null);
            if (face == null) {
                face = faceDetailFragment2.getMInfo();
            }
            bundle.putParcelable(FaceInfoBase.FACE_INFO, face);
            if (file == null || (absolutePath = file.getAbsolutePath()) == null) {
                absolutePath = "";
            }
            bundle.putString(FaceEditFragment.FACE_UNZIP_PATH, absolutePath);
            Unit unit = Unit.INSTANCE;
            BaseFragmentExKt.gotoPageForResult(faceDetailFragment, (Class<?>) FaceEditFragment.class, bundle, 10001);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceDetailFragment$onDownloadEnd$1$1(FaceDetailFragment faceDetailFragment, Continuation<? super FaceDetailFragment$onDownloadEnd$1$1> continuation) {
        super(2, continuation);
        this.this$0 = faceDetailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FaceDetailFragment$onDownloadEnd$1$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String id;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FaceDetailFragment faceDetailFragment = this.this$0;
            this.label = 1;
            obj = FaceDetailFragment.unzip$default(faceDetailFragment, false, this, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        File file = (File) obj;
        FaceDetailViewModel faceDetailViewModelAccess$getMViewModel = FaceDetailFragment.access$getMViewModel(this.this$0);
        WatchFace mInfo = this.this$0.getMInfo();
        if (mInfo == null || (id = mInfo.getId()) == null) {
            id = "";
        }
        faceDetailViewModelAccess$getMViewModel.deleteBinFile(id, this.this$0.getFileHash());
        AnyExtKt.main$default(null, new AnonymousClass1(this.this$0, file, null), 1, null);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FaceDetailFragment$onDownloadEnd$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
