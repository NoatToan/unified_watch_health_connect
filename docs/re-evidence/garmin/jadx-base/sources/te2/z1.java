package te2;

import android.content.Context;
import com.garmin.android.library.mobileauth.exception.MFATokenExpiredException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.MFAManager$getMFATokenValidateWithITServer$2", f = "MFAManager.kt", l = {112, 119, 113}, m = "invokeSuspend")
public final class z1 extends v13.i implements e23.p<o53.b0, t13.d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f164413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f164414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ve2.l f164415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f164416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e2 f164417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f164418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e2 f164419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Context f164420h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(e2 e2Var, Context context, t13.d<? super z1> dVar) {
        super(2, dVar);
        this.f164419g = e2Var;
        this.f164420h = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z1(this.f164419g, this.f164420h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super String> dVar) {
        return ((z1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5 A[RETURN] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Context context;
        ve2.l lVar;
        String str2;
        String str3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164418f;
        e2 e2Var = this.f164419g;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                this.f164418f = 1;
                e2Var.getClass();
                x53.c cVar = o53.s0.f129406a;
                obj = ge1.b.e0(x53.b.f189152a, new w1(e2Var, false, true, null), this);
                if (obj == aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 == 2) {
                    e2Var = this.f164417e;
                    context = this.f164416d;
                    ve2.l lVar2 = this.f164415c;
                    String str4 = this.f164414b;
                    String str5 = this.f164413a;
                    o13.r.b(obj);
                    lVar = lVar2;
                    str2 = str4;
                    str = str5;
                    Context context2 = context;
                    e2 e2Var2 = e2Var;
                    obj.getClass();
                    ve2.d dVar = (ve2.d) obj;
                    this.f164413a = str;
                    this.f164414b = null;
                    this.f164415c = null;
                    this.f164416d = null;
                    this.f164417e = null;
                    this.f164418f = 3;
                    e2Var2.getClass();
                    x53.c cVar2 = o53.s0.f129406a;
                    obj = ge1.b.e0(x53.b.f189152a, new c2(context2, dVar, str2, lVar, e2Var2, null), this);
                    if (obj != aVar) {
                        str3 = str;
                    }
                    return aVar;
                }
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str3 = this.f164413a;
                o13.r.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                return str3;
            }
            return null;
            str = (String) obj;
            if (str != null) {
                context = this.f164420h;
                re2.b.f152215a.getClass();
                ve2.l lVarM = re2.b.m();
                this.f164413a = str;
                this.f164414b = str;
                this.f164415c = lVarM;
                this.f164416d = context;
                this.f164417e = e2Var;
                this.f164418f = 2;
                Object objJ = re2.b.j(this);
                if (objJ != aVar) {
                    lVar = lVarM;
                    obj = objJ;
                    str2 = str;
                    Context context3 = context;
                    e2 e2Var3 = e2Var;
                    obj.getClass();
                    ve2.d dVar2 = (ve2.d) obj;
                    this.f164413a = str;
                    this.f164414b = null;
                    this.f164415c = null;
                    this.f164416d = null;
                    this.f164417e = null;
                    this.f164418f = 3;
                    e2Var3.getClass();
                    x53.c cVar3 = o53.s0.f129406a;
                    obj = ge1.b.e0(x53.b.f189152a, new c2(context3, dVar2, str2, lVar, e2Var3, null), this);
                    if (obj != aVar) {
                        str3 = str;
                        if (((Boolean) obj).booleanValue()) {
                            return str3;
                        }
                    }
                }
                return aVar;
            }
        } catch (MFATokenExpiredException unused) {
        }
        return null;
    }
}
