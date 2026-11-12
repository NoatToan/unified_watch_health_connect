package wt2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import rs2.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.net.ephemeris.gdi.EphemerisDataHandler$EphemerisEPODataSourceDelegate$send$1", f = "EphemerisDataHandler.kt", l = {364}, m = "invokeSuspend")
public final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f187157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f187158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f187159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f187160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k7.b<byte[]> f187161e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, int i14, byte[] bArr, k7.b<byte[]> bVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f187158b = aVar;
        this.f187159c = i14;
        this.f187160d = bArr;
        this.f187161e = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f187158b, this.f187159c, this.f187160d, this.f187161e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f187157a;
        k7.b<byte[]> bVar = this.f187161e;
        a aVar2 = this.f187158b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                v vVar = aVar2.f187147e;
                if (vVar == null) {
                    s.m("messenger");
                    throw null;
                }
                int i15 = this.f187159c;
                byte[] bArr = this.f187160d;
                this.f187157a = 1;
                obj = vVar.b(i15, bArr, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            bVar.accept((byte[]) obj);
        } catch (Exception e4) {
            a.C3482a c3482a = a.f187141k;
            aVar2.f(e4, "EphemerisEPODataSourceDelegate.send", "");
            bVar.accept(null);
        }
        return Unit.INSTANCE;
    }
}
