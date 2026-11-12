package zp0;

import android.graphics.Bitmap;
import e23.p;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import v13.i;
import vb.h;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.imagecache.GCMImageLoader$downloadBitmap$1", f = "GCMImageLoader.kt", l = {316}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f206580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f206581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f206582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zp0.a f206583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f206584e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.imagecache.GCMImageLoader$downloadBitmap$1$1", f = "GCMImageLoader.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r0<Bitmap> f206585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f206586b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r0<Bitmap> r0Var, c cVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f206585a = r0Var;
            this.f206586b = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f206585a, this.f206586b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, android.graphics.Bitmap] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f206585a.f105810a = this.f206586b.c();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zp0.a aVar, c cVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f206583d = aVar;
        this.f206584e = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f206583d, this.f206584e, dVar);
        dVar2.f206582c = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        zp0.a aVar;
        b0 b0Var = (b0) this.f206582c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f206581b;
        if (i14 == 0) {
            r0 r0VarS = g.s(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar3 = new a(r0VarS, this.f206584e, null);
            this.f206582c = b0Var;
            this.f206580a = r0VarS;
            this.f206581b = 1;
            if (ge1.b.e0(bVar, aVar3, this) == aVar2) {
                return aVar2;
            }
            r0Var = r0VarS;
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0Var = this.f206580a;
            r.b(obj);
        }
        if (c0.g(b0Var) && (aVar = this.f206583d) != null) {
            aVar.a((Bitmap) r0Var.f105810a);
        }
        return Unit.INSTANCE;
    }
}
