package xd2;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)I"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLocalPersistedDataSource$updateSessionInfo$2", f = "DefaultLocalPersistedDataSource.kt", l = {42, 48}, m = "invokeSuspend", v = 2)
public final class w0 extends v13.i implements e23.p<o53.b0, t13.d<? super Integer>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f190381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f190382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f190383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Boolean f190384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Long f190385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f190386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List<be2.g.a> f190387g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(x0 x0Var, long j8, Boolean bool, Long l14, String str, List<be2.g.a> list, t13.d<? super w0> dVar) {
        super(2, dVar);
        this.f190382b = x0Var;
        this.f190383c = j8;
        this.f190384d = bool;
        this.f190385e = l14;
        this.f190386f = str;
        this.f190387g = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w0(this.f190382b, this.f190383c, this.f190384d, this.f190385e, this.f190386f, this.f190387g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Integer> dVar) {
        return ((w0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        if (r8 == r0) goto L31;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190381a;
        x0 x0Var = this.f190382b;
        if (i14 == 0) {
            o13.r.b(obj);
            zd2.f fVarH = x0Var.f190390a.h();
            this.f190381a = 1;
            obj = fVarH.c(this.f190383c, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return new Integer(((Number) obj).intValue());
        be2.g gVar = (be2.g) obj;
        if (gVar != null) {
            Boolean bool = this.f190384d;
            if (bool != null) {
                gVar.f17770f = bool.booleanValue();
            }
            Long l14 = this.f190385e;
            if (l14 != null) {
                gVar.f17773i = new Long(l14.longValue());
            }
            String str = this.f190386f;
            if (str != null) {
                gVar.f17772h = str;
            }
            List<be2.g.a> list = this.f190387g;
            if (list != null) {
                gVar.f17774j = list;
            }
        } else {
            gVar = null;
        }
        if (gVar == null) {
            return null;
        }
        zd2.f fVarH2 = x0Var.f190390a.h();
        this.f190381a = 2;
        obj = fVarH2.e(gVar, this);
    }
}
