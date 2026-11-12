package com.xiaomi.fitness.rn.settings.util;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.xiaomi.fitness.ShareUtil;
import defpackage.i7m;
import defpackage.o3r;
import defpackage.rri;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.rn.settings.util.RnBitmapShareDialog$show$1$1$1", f = "RnBitmapShareDialog.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
public final class RnBitmapShareDialog$show$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<i7m> $shareView;
    final /* synthetic */ Deferred<Bitmap> $syncJob;
    final /* synthetic */ View $v;
    int label;
    final /* synthetic */ RnBitmapShareDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RnBitmapShareDialog$show$1$1$1(Ref.ObjectRef<i7m> objectRef, Deferred<Bitmap> deferred, View view, RnBitmapShareDialog rnBitmapShareDialog, Continuation<? super RnBitmapShareDialog$show$1$1$1> continuation) {
        super(2, continuation);
        this.$shareView = objectRef;
        this.$syncJob = deferred;
        this.$v = view;
        this.this$0 = rnBitmapShareDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RnBitmapShareDialog$show$1$1$1(this.$shareView, this.$syncJob, this.$v, this.this$0, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            i7m i7mVar = this.$shareView.element;
            if (i7mVar != null) {
                i7mVar.dismiss();
            }
            Deferred<Bitmap> deferred = this.$syncJob;
            this.label = 1;
            obj = deferred.await(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Bitmap bitmap = (Bitmap) obj;
        View view = this.$v;
        Integer numBoxInt = view != null ? Boxing.boxInt(view.getId()) : null;
        int i2 = rri.e;
        if (numBoxInt != null && numBoxInt.intValue() == i2) {
            o3r.i().y(bitmap, this.this$0.title, this.this$0.description, o3r.j());
        } else {
            int i3 = rri.d;
            if (numBoxInt != null && numBoxInt.intValue() == i3) {
                o3r.i().y(bitmap, this.this$0.title, this.this$0.description, o3r.k());
            } else {
                int i4 = rri.f32830b;
                if (numBoxInt != null && numBoxInt.intValue() == i4) {
                    Activity activity = (Activity) this.this$0.weakAct.get();
                    if (activity == 0) {
                        return Unit.INSTANCE;
                    }
                    ShareUtil.saveImageToGallery$default(activity, bitmap, activity instanceof FragmentActivity ? LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activity) : null, false, false, 24, null);
                } else {
                    int i5 = rri.c;
                    if (numBoxInt != null && numBoxInt.intValue() == i5) {
                        ShareUtil shareUtil = ShareUtil.INSTANCE;
                        WeakReference<Activity> weakReference = this.this$0.weakAct;
                        Intrinsics.checkNotNull(bitmap);
                        shareUtil.shareBitmapViaMore(weakReference, bitmap);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RnBitmapShareDialog$show$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
