package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import i31.e0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import o13.q;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import o53.t1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.l0;
import p13.y;
import u53.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/DeleteAllOnboardingItems;", "Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/IDeveloperItemStrategy;", "<init>", "()V", "Lmg1/b;", "getViewType", "()Lmg1/b;", "Lkotlin/Function0;", "Landroid/content/Context;", "getContext", "Lmg1/a;", "getDeveloperItem", "(Le23/a;)Lmg1/a;", "Landroid/view/View;", "view", "", "notifyChange", "Lkotlin/Function1;", "", "showProgress", "modelItem", "handleClick", "(Landroid/view/View;Le23/a;Le23/l;Lmg1/a;)V", "Companion", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DeleteAllOnboardingItems implements IDeveloperItemStrategy {
    public static final int $stable = 0;
    private static final String TAG = "DeleteAllOnboardingItems";

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.DeleteAllOnboardingItems$handleClick$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.DeleteAllOnboardingItems$handleClick$1", f = "DeleteAllOnboardingItems.kt", l = {56, 59, 61, 71, 72, 74, 75, 77}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends v13.i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ e23.l<Boolean, Unit> $showProgress;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.DeleteAllOnboardingItems$handleClick$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.DeleteAllOnboardingItems$handleClick$1$2", f = "DeleteAllOnboardingItems.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class AnonymousClass2 extends v13.i implements p<b0, t13.d<? super Unit>, Object> {
            final /* synthetic */ Context $context;
            final /* synthetic */ e23.l<Boolean, Unit> $showProgress;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(e23.l<? super Boolean, Unit> lVar, Context context, t13.d<? super AnonymousClass2> dVar) {
                super(2, dVar);
                this.$showProgress = lVar;
                this.$context = context;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$0(DialogInterface dialogInterface, int i14) {
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new AnonymousClass2(this.$showProgress, this.$context, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((AnonymousClass2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                this.$showProgress.invoke(Boolean.FALSE);
                new androidx.appcompat.app.e.a(this.$context).setTitle("Success").setMessage("All onboarding items have been deleted.").setCancelable(false).setPositiveButton(R.string.lbl_ok, new c(0)).show();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.DeleteAllOnboardingItems$handleClick$1$5, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.DeleteAllOnboardingItems$handleClick$1$5", f = "DeleteAllOnboardingItems.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class AnonymousClass5 extends v13.i implements p<b0, t13.d<? super Unit>, Object> {
            final /* synthetic */ Context $context;
            final /* synthetic */ e23.l<Boolean, Unit> $showProgress;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass5(e23.l<? super Boolean, Unit> lVar, Context context, t13.d<? super AnonymousClass5> dVar) {
                super(2, dVar);
                this.$showProgress = lVar;
                this.$context = context;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$0(DialogInterface dialogInterface, int i14) {
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new AnonymousClass5(this.$showProgress, this.$context, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((AnonymousClass5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                this.$showProgress.invoke(Boolean.FALSE);
                new androidx.appcompat.app.e.a(this.$context).setTitle("Success").setMessage("Paired device onboarding items have been set to NOT_STARTED status.").setCancelable(false).setPositiveButton(R.string.lbl_ok, new c(1)).show();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(e23.l<? super Boolean, Unit> lVar, Context context, t13.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$showProgress = lVar;
            this.$context = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new AnonymousClass1(this.$showProgress, this.$context, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0187  */
        /* JADX WARN: Code duplicated, block: B:35:0x018d  */
        /* JADX WARN: Code duplicated, block: B:38:0x01b2 A[PHI: r0
          0x01b2: PHI (r0v10 int) = (r0v8 int), (r0v8 int), (r0v13 int) binds: [B:34:0x018b, B:36:0x01ae, B:11:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:41:0x01d4  */
        /* JADX WARN: Code duplicated, block: B:47:0x01fb  */
        /* JADX WARN: Code duplicated, block: B:56:0x0261  */
        /* JADX WARN: Code duplicated, block: B:65:0x02c2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:67:? A[LOOP:0: B:54:0x025b->B:67:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:68:0x02c2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:71:? A[LOOP:1: B:45:0x01f5->B:71:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x01d0, code lost:
        
            if (ge1.b.e0(r1, r2, r17) == r6) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x01e7, code lost:
        
            if (r2 == r6) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x024e, code lost:
        
            if (r0 == r6) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x02c0, code lost:
        
            if (ge1.b.e0(r0, r1, r17) == r6) goto L61;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            b31.a aVar;
            Collection collection;
            int userProfilePk;
            Object objI;
            Object objJ;
            i31.c cVar;
            Set setG1;
            int i14;
            b31.a aVar2;
            Iterator it;
            int i15;
            Object objJ2;
            e0 e0Var;
            long j8;
            d31.d dVar;
            d31.c cVar2;
            Iterator it3;
            int i16;
            int i17;
            e0 e0Var2;
            long j14;
            d31.d dVar2;
            d31.c cVar3;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            switch (this.label) {
                case 0:
                    r.b(obj);
                    b31.f fVar = (b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null);
                    aVar = (b31.a) KoinJavaComponent.get$default(b31.a.class, null, null, 6, null);
                    rd2.f.a().f152045a.getClass();
                    ArrayList arrayListE = rd2.j.e();
                    if (arrayListE != null) {
                        ArrayList arrayList = new ArrayList(y.r(arrayListE, 10));
                        Iterator it4 = arrayListE.iterator();
                        while (it4.hasNext()) {
                            q6.f.s(((sd2.f) it4.next()).getUnitID(), arrayList);
                        }
                        collection = arrayList;
                    } else {
                        collection = l0.f134950a;
                    }
                    fVar.c(0L);
                    fVar.h(0L, l0.f134950a);
                    w13.c cVar4 = e31.a.f62744b1;
                    p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar4, cVar4);
                    while (bVarN.hasNext()) {
                        e31.a aVar4 = (e31.a) bVarN.next();
                        fVar.k(aVar4);
                        Iterator it5 = collection.iterator();
                        while (it5.hasNext()) {
                            fVar.l(((Number) it5.next()).longValue(), aVar4);
                        }
                    }
                    userProfilePk = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
                    this.L$0 = null;
                    this.L$1 = aVar;
                    this.L$2 = collection;
                    this.I$0 = userProfilePk;
                    this.label = 1;
                    objI = aVar.i(userProfilePk, this);
                    if (objI != aVar3) {
                        int i18 = q.f128596b;
                        if (objI instanceof q.b) {
                            d31.c cVar5 = d31.c.COMPLETED;
                            this.L$0 = null;
                            this.L$1 = aVar;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.I$0 = userProfilePk;
                            this.label = 4;
                            objJ = aVar.j(cVar5, this);
                        } else if (collection.isEmpty()) {
                            cVar = (i31.c) KoinJavaComponent.get$default(i31.c.class, null, null, 6, null);
                            setG1 = h0.g1(collection);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.I$0 = userProfilePk;
                            this.label = 2;
                            if (cVar.a(DeleteAllOnboardingItems.TAG, setG1, this) != aVar3) {
                                x53.c cVar6 = s0.f129406a;
                                t1 t1Var = o.f168762a;
                                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$showProgress, this.$context, null);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.I$0 = userProfilePk;
                                this.label = 3;
                            }
                        } else {
                            x53.c cVar7 = s0.f129406a;
                            t1 t1Var2 = o.f168762a;
                            AnonymousClass2 anonymousClass3 = new AnonymousClass2(this.$showProgress, this.$context, null);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.I$0 = userProfilePk;
                            this.label = 3;
                        }
                        break;
                    }
                    return aVar3;
                case 1:
                    userProfilePk = this.I$0;
                    Collection collection2 = (Collection) this.L$2;
                    b31.a aVar5 = (b31.a) this.L$1;
                    r.b(obj);
                    objI = ((q) obj).f128597a;
                    collection = collection2;
                    aVar = aVar5;
                    int i19 = q.f128596b;
                    if (objI instanceof q.b) {
                        if (collection.isEmpty()) {
                            x53.c cVar8 = s0.f129406a;
                            t1 t1Var3 = o.f168762a;
                            AnonymousClass2 anonymousClass4 = new AnonymousClass2(this.$showProgress, this.$context, null);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.I$0 = userProfilePk;
                            this.label = 3;
                        } else {
                            cVar = (i31.c) KoinJavaComponent.get$default(i31.c.class, null, null, 6, null);
                            setG1 = h0.g1(collection);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.I$0 = userProfilePk;
                            this.label = 2;
                            if (cVar.a(DeleteAllOnboardingItems.TAG, setG1, this) != aVar3) {
                                x53.c cVar9 = s0.f129406a;
                                t1 t1Var4 = o.f168762a;
                                AnonymousClass2 anonymousClass5 = new AnonymousClass2(this.$showProgress, this.$context, null);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.I$0 = userProfilePk;
                                this.label = 3;
                            }
                        }
                        break;
                    } else {
                        d31.c cVar10 = d31.c.COMPLETED;
                        this.L$0 = null;
                        this.L$1 = aVar;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.I$0 = userProfilePk;
                        this.label = 4;
                        objJ = aVar.j(cVar10, this);
                        break;
                    }
                    return aVar3;
                case 2:
                    userProfilePk = this.I$0;
                    r.b(obj);
                    ((q) obj).getClass();
                    x53.c cVar11 = s0.f129406a;
                    t1 t1Var5 = o.f168762a;
                    AnonymousClass2 anonymousClass6 = new AnonymousClass2(this.$showProgress, this.$context, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.I$0 = userProfilePk;
                    this.label = 3;
                    break;
                case 3:
                case 8:
                    r.b(obj);
                    return Unit.INSTANCE;
                case 4:
                    userProfilePk = this.I$0;
                    aVar = (b31.a) this.L$1;
                    r.b(obj);
                    objJ = obj;
                    i14 = userProfilePk;
                    aVar2 = aVar;
                    it = ((Iterable) objJ).iterator();
                    i15 = 0;
                    while (it.hasNext()) {
                        d31.a aVar6 = (d31.a) it.next();
                        e0Var = (e0) KoinJavaComponent.get$default(e0.class, null, null, 6, null);
                        j8 = aVar6.f57321a;
                        dVar = aVar6.f57326f;
                        cVar2 = d31.c.NOT_STARTED;
                        this.L$0 = null;
                        this.L$1 = aVar2;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = it;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.I$0 = i14;
                        this.I$1 = i15;
                        this.I$2 = 0;
                        this.label = 5;
                        if (e0Var.a(j8, dVar, cVar2, this) == aVar3) {
                            return aVar3;
                        }
                    }
                    d31.c cVar12 = d31.c.IGNORED;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.I$0 = i14;
                    this.label = 6;
                    objJ2 = aVar2.j(cVar12, this);
                    break;
                case 5:
                    int i24 = this.I$1;
                    int i25 = this.I$0;
                    Iterator it6 = (Iterator) this.L$5;
                    b31.a aVar7 = (b31.a) this.L$1;
                    r.b(obj);
                    ((q) obj).getClass();
                    i15 = i24;
                    i14 = i25;
                    it = it6;
                    aVar2 = aVar7;
                    while (it.hasNext()) {
                        d31.a aVar8 = (d31.a) it.next();
                        e0Var = (e0) KoinJavaComponent.get$default(e0.class, null, null, 6, null);
                        j8 = aVar8.f57321a;
                        dVar = aVar8.f57326f;
                        cVar2 = d31.c.NOT_STARTED;
                        this.L$0 = null;
                        this.L$1 = aVar2;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = it;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.I$0 = i14;
                        this.I$1 = i15;
                        this.I$2 = 0;
                        this.label = 5;
                        if (e0Var.a(j8, dVar, cVar2, this) == aVar3) {
                            return aVar3;
                        }
                    }
                    d31.c cVar13 = d31.c.IGNORED;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.I$0 = i14;
                    this.label = 6;
                    objJ2 = aVar2.j(cVar13, this);
                    break;
                case 6:
                    int i26 = this.I$0;
                    r.b(obj);
                    i14 = i26;
                    objJ2 = obj;
                    it3 = ((Iterable) objJ2).iterator();
                    i16 = i14;
                    i17 = 0;
                    while (it3.hasNext()) {
                        d31.a aVar9 = (d31.a) it3.next();
                        e0Var2 = (e0) KoinJavaComponent.get$default(e0.class, null, null, 6, null);
                        j14 = aVar9.f57321a;
                        dVar2 = aVar9.f57326f;
                        cVar3 = d31.c.NOT_STARTED;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = it3;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.I$0 = i16;
                        this.I$1 = i17;
                        this.I$2 = 0;
                        this.label = 7;
                        if (e0Var2.a(j14, dVar2, cVar3, this) == aVar3) {
                            return aVar3;
                        }
                    }
                    x53.c cVar14 = s0.f129406a;
                    t1 t1Var6 = o.f168762a;
                    AnonymousClass5 anonymousClass7 = new AnonymousClass5(this.$showProgress, this.$context, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.I$0 = i16;
                    this.label = 8;
                    break;
                case 7:
                    int i27 = this.I$1;
                    int i28 = this.I$0;
                    Iterator it7 = (Iterator) this.L$5;
                    r.b(obj);
                    ((q) obj).getClass();
                    i17 = i27;
                    i16 = i28;
                    it3 = it7;
                    while (it3.hasNext()) {
                        d31.a aVar10 = (d31.a) it3.next();
                        e0Var2 = (e0) KoinJavaComponent.get$default(e0.class, null, null, 6, null);
                        j14 = aVar10.f57321a;
                        dVar2 = aVar10.f57326f;
                        cVar3 = d31.c.NOT_STARTED;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = it3;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.I$0 = i16;
                        this.I$1 = i17;
                        this.I$2 = 0;
                        this.label = 7;
                        if (e0Var2.a(j14, dVar2, cVar3, this) == aVar3) {
                            return aVar3;
                        }
                    }
                    x53.c cVar15 = s0.f129406a;
                    t1 t1Var7 = o.f168762a;
                    AnonymousClass5 anonymousClass8 = new AnonymousClass5(this.$showProgress, this.$context, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.I$0 = i16;
                    this.label = 8;
                    break;
                default:
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public mg1.a getDeveloperItem(e23.a<? extends Context> getContext) {
        getContext.getClass();
        lg1.d dVar = lg1.d.DELETE_ALL_ONBOARDING_ITEMS;
        return new mg1.a(dVar.f112244a, dVar.f112245b, dVar.f112246c, false, false, 24, null);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public mg1.b getViewType() {
        return mg1.b.VIEW_TYPE_BUTTON;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public void handleClick(View view2, e23.a<Unit> notifyChange, e23.l<? super Boolean, Unit> showProgress, mg1.a modelItem) {
        Context contextA = a.a(view2, notifyChange, showProgress, modelItem);
        showProgress.invoke(Boolean.TRUE);
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new AnonymousClass1(showProgress, contextA, null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public /* bridge */ void handleToggle(boolean z14, View view2, e23.l<? super Boolean, Unit> lVar, mg1.a aVar) {
        super.handleToggle(z14, view2, lVar, aVar);
    }
}
