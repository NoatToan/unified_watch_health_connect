package com.garmin.feature.garminpay.providers.gpay.ui.addcard;

import ap2.h;
import e23.p;
import hn2.c;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardActivity$finishWithCardRefresh$1", f = "FitPayAddCardActivity.kt", l = {902}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f51409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FitPayAddCardActivity f51410b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardActivity$finishWithCardRefresh$1$1", f = "FitPayAddCardActivity.kt", l = {903}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FitPayAddCardActivity f51412b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FitPayAddCardActivity fitPayAddCardActivity, d<? super a> dVar) {
            super(2, dVar);
            this.f51412b = fitPayAddCardActivity;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new a(this.f51412b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

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
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51411a;
            FitPayAddCardActivity fitPayAddCardActivity = this.f51412b;
            if (i14 == 0) {
                r.b(obj);
                FitPayAddCardActivity.a aVar = FitPayAddCardActivity.f51376x;
                h hVarFa = fitPayAddCardActivity.fa();
                this.f51411a = 1;
                if (hVarFa.G4(this) == obj2) {
                    return obj2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            fitPayAddCardActivity.S9(fitPayAddCardActivity);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FitPayAddCardActivity fitPayAddCardActivity, d<? super b> dVar) {
        super(2, dVar);
        this.f51410b = fitPayAddCardActivity;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new b(this.f51410b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        FitPayAddCardActivity fitPayAddCardActivity = this.f51410b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f51409a;
        try {
            if (i14 == 0) {
                r.b(obj);
                c.ba(fitPayAddCardActivity, Boolean.TRUE, null, null, 14);
                x53.c cVar = s0.f129406a;
                a aVar2 = new a(fitPayAddCardActivity, null);
                this.f51409a = 1;
                if (ge1.b.e0(cVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Exception e4) {
            FitPayAddCardActivity.a.a(FitPayAddCardActivity.f51376x).error("finishWithCancellation:", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
