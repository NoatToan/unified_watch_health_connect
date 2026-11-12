package yf0;

import e23.l;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.j;
import r53.k1;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.eventhub.EventHub$subscribe$1", f = "EventHub.kt", l = {51}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f196860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k23.d<Object> f196861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l<Object, Unit> f196862c;

    /* JADX INFO: renamed from: yf0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3686a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<T, Unit> f196863a;

        /* JADX WARN: Multi-variable type inference failed */
        public C3686a(l<? super T, Unit> lVar) {
            this.f196863a = lVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, d dVar) {
            this.f196863a.invoke((c) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(k23.d<Object> dVar, l<Object, Unit> lVar, d<? super a> dVar2) {
        super(2, dVar2);
        this.f196861b = dVar;
        this.f196862c = lVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new a(this.f196861b, this.f196862c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f196860a;
        if (i14 == 0) {
            r.b(obj);
            k1 k1Var = new k1(b.f196865b, this.f196861b);
            C3686a c3686a = new C3686a(this.f196862c);
            this.f196860a = 1;
            if (k1Var.collect(c3686a, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
