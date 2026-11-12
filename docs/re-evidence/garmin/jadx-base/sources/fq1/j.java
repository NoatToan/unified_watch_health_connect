package fq1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Iterator;
import java.util.List;
import o53.b0;
import o53.c2;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.init.async.GCMStartupAsync$execute$1", f = "GCMStartupAsync.kt", l = {53}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f73253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f73254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f73255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f73256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f73257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f73258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f73259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f73260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f73261i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.startup.init.async.GCMStartupAsync$execute$1$1$1", f = "GCMStartupAsync.kt", l = {54}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f73262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f73263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f73264c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s sVar, Context context, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f73263b = sVar;
            this.f73264c = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f73263b, this.f73264c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f73262a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f73262a = 1;
                if (this.f73263b.b(this.f73264c, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, e23.a<Unit> aVar, Context context, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f73259g = iVar;
        this.f73260h = aVar;
        this.f73261i = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f73259g, this.f73260h, this.f73261i, dVar);
        jVar.f73258f = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        Iterator it;
        int i14;
        i iVar;
        b0 b0Var = (b0) this.f73258f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f73257e;
        if (i15 == 0) {
            o13.r.b(obj);
            i iVar2 = this.f73259g;
            Iterator it3 = ((List) iVar2.f73250a.getValue()).iterator();
            context = this.f73261i;
            it = it3;
            i14 = 0;
            iVar = iVar2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = this.f73256d;
            it = this.f73255c;
            context = this.f73254b;
            iVar = this.f73253a;
            o13.r.b(obj);
        }
        while (it.hasNext()) {
            s sVar = (s) it.next();
            c2 c2Var = iVar.f73252c;
            if (c2Var == null) {
                p005kotlin.jvm.internal.s.m("startUpAsyncInitJob");
                throw null;
            }
            if (!c2Var.isActive()) {
                return Unit.INSTANCE;
            }
            z zVarA = sVar.a();
            a aVar2 = new a(sVar, context, null);
            this.f73258f = b0Var;
            this.f73253a = iVar;
            this.f73254b = context;
            this.f73255c = it;
            this.f73256d = i14;
            this.f73257e = 1;
            if (ge1.b.e0(zVarA, aVar2, this) == aVar) {
                return aVar;
            }
        }
        i2.a aVar3 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar3.getClass();
        i2.a.b(a2Var, "GCMStartupAsync", "All async initializers completed");
        this.f73260h.invoke();
        return Unit.INSTANCE;
    }
}
