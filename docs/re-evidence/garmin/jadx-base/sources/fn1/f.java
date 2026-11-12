package fn1;

import android.content.Context;
import androidx.lifecycle.v1;
import o53.b0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72194a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sm1.s f72195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f72196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km1.c f72197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f72198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f72199f;

    public /* synthetic */ f(b0 b0Var, km1.c cVar, sm1.s sVar, e23.a aVar, Context context) {
        this.f72196c = b0Var;
        this.f72197d = cVar;
        this.f72195b = sVar;
        this.f72198e = aVar;
        this.f72199f = context;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f72194a) {
            case 0:
                ge1.b.T(this.f72196c, null, null, new l((km1.b) obj, this.f72197d, this.f72195b, this.f72198e, this.f72199f, null), 3);
                break;
            default:
                km1.b bVar = (km1.b) obj;
                bVar.getClass();
                b0 b0Var = this.f72196c;
                km1.c cVar = this.f72197d;
                sm1.s sVar = this.f72195b;
                f fVar = new f(b0Var, cVar, sVar, this.f72198e, this.f72199f);
                sVar.getClass();
                ge1.b.T(v1.a(sVar), null, null, new sm1.t(sVar, bVar, fVar, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(sm1.s sVar, b0 b0Var, km1.c cVar, e23.a aVar, Context context) {
        this.f72195b = sVar;
        this.f72196c = b0Var;
        this.f72197d = cVar;
        this.f72198e = aVar;
        this.f72199f = context;
    }
}
