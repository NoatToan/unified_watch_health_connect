package ff0;

import c83.a0;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lff0/g;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.data.EcgRepositoryImpl$getActivities$4", f = "EcgRepositoryImpl.kt", l = {43, 46}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.l<t13.d<? super a0<g>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f71088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f71089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f71090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f71091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<String> f71092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List<String> f71093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Integer f71094h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, v vVar, String str2, String str3, List<String> list, List<String> list2, Integer num, t13.d<? super o> dVar) {
        super(1, dVar);
        this.f71088b = str;
        this.f71089c = vVar;
        this.f71090d = str2;
        this.f71091e = str3;
        this.f71092f = list;
        this.f71093g = list2;
        this.f71094h = num;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new o(this.f71088b, this.f71089c, this.f71090d, this.f71091e, this.f71092f, this.f71093g, this.f71094h, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<g>> dVar) {
        return ((o) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (r11 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r11 == r0) goto L22;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f71087a;
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
        v vVar = this.f71089c;
        String str = this.f71088b;
        if (str == null || str.length() == 0) {
            i0<a0<g>> i0VarD = vVar.f71114a.d(this.f71090d, this.f71091e, this.f71092f, this.f71093g, this.f71094h);
            this.f71087a = 1;
            obj = i0VarD.await(this);
        } else {
            i0<a0<g>> i0VarB = vVar.f71114a.b(this.f71090d, this.f71091e, this.f71092f, this.f71093g, this.f71088b);
            this.f71087a = 2;
            obj = i0VarB.await(this);
        }
        return aVar;
    }
}
