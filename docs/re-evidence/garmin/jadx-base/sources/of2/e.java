package of2;

import java.util.List;
import okhttp3.internal.http.StatusLine;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSession$notifyData$1", f = "LSVSession.kt", l = {StatusLine.HTTP_TEMP_REDIRECT, 318}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f131807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<rf2.b> f131808c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, List<rf2.b> list, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f131807b = bVar;
        this.f131808c = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f131807b, this.f131808c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if (r14.d(r1, r13) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131806a;
        b bVar = this.f131807b;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        b0 b0Var = (b0) bVar.f131736o.getValue();
        sf2.a.e eVar = new sf2.a.e(b0Var.f131744a, b0Var.f131748e, b0Var.f131757n, b0Var.f131753j, this.f131808c, b.a(bVar), bVar.f131722a.getValue().booleanValue());
        this.f131806a = 1;
        if (b0Var.b(eVar, this) != aVar) {
        }
        return aVar;
        b0 b0Var2 = (b0) bVar.f131736o.getValue();
        sf2.e.d dVar = new sf2.e.d(this.f131808c);
        this.f131806a = 2;
    }
}
