package com.google.android.play.core.ktx;

import android.app.Activity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import o13.q;
import o13.r;
import o53.k;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.m;
import q53.w;
import t13.d;
import u13.a;
import u13.f;
import v13.c;
import v13.e;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\b\u001a\u00020\u0003*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/google/android/play/core/review/ReviewManager;", "Landroid/app/Activity;", "activity", "Lcom/google/android/play/core/review/ReviewInfo;", "reviewInfo", "", "launchReview", "(Lcom/google/android/play/core/review/ReviewManager;Landroid/app/Activity;Lcom/google/android/play/core/review/ReviewInfo;Lt13/d;)Ljava/lang/Object;", "requestReview", "(Lcom/google/android/play/core/review/ReviewManager;Lt13/d;)Ljava/lang/Object;", "T", "Lcom/google/android/gms/tasks/Task;", "task", "Lkotlin/Function0;", "onCanceled", "runTask", "(Lcom/google/android/gms/tasks/Task;Le23/a;Lt13/d;)Ljava/lang/Object;", "E", "Lq53/w;", "element", "", "tryOffer", "(Lq53/w;Ljava/lang/Object;)Z", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_review_ktx"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ReviewManagerKtxKt {

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.ReviewManagerKtxKt$requestReview$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @e(c = "com.google.android.play.core.ktx.ReviewManagerKtxKt", f = "ReviewManagerKtx.kt", l = {22}, m = "requestReview")
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReviewManagerKtxKt.requestReview(null, this);
        }
    }

    public static final Object launchReview(ReviewManager reviewManager, Activity activity, ReviewInfo reviewInfo, d<? super Unit> dVar) {
        Task<Void> taskLaunchReviewFlow = reviewManager.launchReviewFlow(activity, reviewInfo);
        taskLaunchReviewFlow.getClass();
        Object objRunTask$default = runTask$default(taskLaunchReviewFlow, null, dVar, 2, null);
        return objRunTask$default == a.COROUTINE_SUSPENDED ? objRunTask$default : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object requestReview(ReviewManager reviewManager, d<? super ReviewInfo> dVar) {
        AnonymousClass1 anonymousClass1;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i14 = anonymousClass1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i14 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object objRunTask$default = anonymousClass1.result;
        a aVar = a.COROUTINE_SUSPENDED;
        int i15 = anonymousClass1.label;
        if (i15 == 0) {
            r.b(objRunTask$default);
            Task<ReviewInfo> taskRequestReviewFlow = reviewManager.requestReviewFlow();
            taskRequestReviewFlow.getClass();
            anonymousClass1.label = 1;
            objRunTask$default = runTask$default(taskRequestReviewFlow, null, anonymousClass1, 2, null);
            if (objRunTask$default == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objRunTask$default);
        }
        objRunTask$default.getClass();
        return objRunTask$default;
    }

    public static final <T> Object runTask(Task<T> task, e23.a<Unit> aVar, d<? super T> dVar) throws Throwable {
        final k kVar = new k(f.b(dVar), 1);
        kVar.q();
        kVar.r(new ReviewManagerKtxKt$runTask$3$1(aVar));
        if (!task.isComplete()) {
            task.addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.play.core.ktx.ReviewManagerKtxKt$runTask$3$2
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(T t7) {
                    d dVar2 = kVar;
                    int i14 = q.f128596b;
                    dVar2.resumeWith(t7);
                }
            });
            task.addOnFailureListener(new OnFailureListener() { // from class: com.google.android.play.core.ktx.ReviewManagerKtxKt$runTask$3$3
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    exc.getClass();
                    d dVar2 = kVar;
                    Object bVar = new q.b(exc);
                    int i14 = q.f128596b;
                    dVar2.resumeWith(bVar);
                }
            });
        } else if (task.isSuccessful()) {
            T result = task.getResult();
            int i14 = q.f128596b;
            kVar.resumeWith(result);
        } else {
            Exception exception = task.getException();
            exception.getClass();
            q.b bVar = new q.b(exception);
            int i15 = q.f128596b;
            kVar.resumeWith(bVar);
        }
        Object objP = kVar.p();
        a aVar2 = a.COROUTINE_SUSPENDED;
        return objP;
    }

    public static /* synthetic */ Object runTask$default(Task task, e23.a aVar, d dVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            aVar = AnonymousClass2.INSTANCE;
        }
        return runTask(task, aVar, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> boolean tryOffer(w<? super E> wVar, E e4) {
        wVar.getClass();
        Object objI = wVar.i(e4);
        m.b bVar = m.f142998b;
        return !(objI instanceof m.c);
    }

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.ReviewManagerKtxKt$runTask$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends p005kotlin.jvm.internal.w implements e23.a<Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // e23.a
        public final /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }
}
