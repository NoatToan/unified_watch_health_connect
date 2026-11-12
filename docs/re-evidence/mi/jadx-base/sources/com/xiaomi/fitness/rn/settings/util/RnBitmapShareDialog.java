package com.xiaomi.fitness.rn.settings.util;

import android.app.Activity;
import android.view.View;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import defpackage.i7m;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/rn/settings/util/RnBitmapShareDialog;", "", "weakAct", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "title", "", "description", "imageUri", "<init>", "(Ljava/lang/ref/WeakReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "show", "", "settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RnBitmapShareDialog {

    @Nullable
    private final String description;

    @NotNull
    private final String imageUri;

    @Nullable
    private final String title;

    @NotNull
    private final WeakReference<Activity> weakAct;

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.settings.util.RnBitmapShareDialog$show$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.rn.settings.util.RnBitmapShareDialog$show$1", f = "RnBitmapShareDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(Ref.ObjectRef objectRef, Deferred deferred, RnBitmapShareDialog rnBitmapShareDialog, View view) {
            AnyExtKt.main$default(null, new RnBitmapShareDialog$show$1$1$1(objectRef, deferred, view, rnBitmapShareDialog, null), 1, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = RnBitmapShareDialog.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, android.widget.PopupWindow, i7m] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Activity activity = (Activity) RnBitmapShareDialog.this.weakAct.get();
            if (activity == null) {
                return Unit.INSTANCE;
            }
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            final Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new RnBitmapShareDialog$show$1$syncJob$1(activity, RnBitmapShareDialog.this, null), 3, null);
            final RnBitmapShareDialog rnBitmapShareDialog = RnBitmapShareDialog.this;
            ?? i7mVar = new i7m(activity, new View.OnClickListener() { // from class: com.xiaomi.fitness.rn.settings.util.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RnBitmapShareDialog.AnonymousClass1.invokeSuspend$lambda$0(objectRef, deferredAsync$default, rnBitmapShareDialog, view);
                }
            });
            objectRef.element = i7mVar;
            i7mVar.showAtLocation(activity.getWindow().getDecorView(), 81, 0, 0);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public RnBitmapShareDialog(@NotNull WeakReference<Activity> weakAct, @Nullable String str, @Nullable String str2, @NotNull String imageUri) {
        Intrinsics.checkNotNullParameter(weakAct, "weakAct");
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        this.weakAct = weakAct;
        this.title = str;
        this.description = str2;
        this.imageUri = imageUri;
    }

    public final void show() {
        AnyExtKt.main$default(null, new AnonymousClass1(null), 1, null);
    }
}
