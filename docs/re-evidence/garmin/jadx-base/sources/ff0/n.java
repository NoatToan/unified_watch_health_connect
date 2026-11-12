package ff0;

import c83.a0;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lff0/g;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.data.EcgRepositoryImpl$getActivities$2", f = "EcgRepositoryImpl.kt", l = {26, 28}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.l<t13.d<? super a0<g>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f71082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f71083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f71084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f71085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Integer f71086f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, v vVar, String str2, String str3, Integer num, t13.d<? super n> dVar) {
        super(1, dVar);
        this.f71082b = str;
        this.f71083c = vVar;
        this.f71084d = str2;
        this.f71085e = str3;
        this.f71086f = num;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new n(this.f71082b, this.f71083c, this.f71084d, this.f71085e, this.f71086f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<g>> dVar) {
        return ((n) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r8 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r8 == r0) goto L22;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f71081a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return (a0) obj;
            }
            if (i14 == 2) {
                o13.r.b(obj);
                return (a0) obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        String str = this.f71085e;
        String str2 = this.f71084d;
        v vVar = this.f71083c;
        String str3 = this.f71082b;
        if (str3 == null || str3.length() == 0) {
            i0<a0<g>> i0VarF = vVar.f71114a.f(str2, str, this.f71086f);
            this.f71081a = 1;
            obj = i0VarF.await(this);
        } else {
            i0<a0<g>> i0VarC = vVar.f71114a.c(str2, str, str3);
            this.f71081a = 2;
            obj = i0VarC.await(this);
        }
        return aVar;
    }
}
