package li0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.ui.FollowAction$declineRequest$1", f = "FollowAction.kt", l = {464, 465, 468, 469, 474}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f112755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f112756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f112757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f.b f112758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v2.a f112759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f112760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f112761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f112762h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f.b f112763i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f112764j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d0 f112765k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f112766l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f.b bVar, f fVar, d0 d0Var, Context context, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f112763i = bVar;
        this.f112764j = fVar;
        this.f112765k = d0Var;
        this.f112766l = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f112763i, this.f112764j, this.f112765k, this.f112766l, dVar);
        jVar.f112762h = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00be  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0101  */
    /* JADX WARN: Code duplicated, block: B:53:0x0104  */
    /* JADX WARN: Code duplicated, block: B:62:0x0124  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0117, code lost:
    
        if (li0.f.b(r11, r0, r2, r13) == r1) goto L56;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        String str;
        String str2;
        ki0.a.b.EnumC2007a enumC2007a;
        Context context;
        Object obj2;
        Context context2;
        v2 v2Var2;
        f.b bVar;
        e23.a<Unit> aVar;
        o53.b0 b0Var = (o53.b0) this.f112762h;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f112761g;
        int i15 = 0;
        f.b bVar2 = this.f112763i;
        d0 d0Var = this.f112765k;
        f fVar = this.f112764j;
        if (i14 == 0) {
            o13.r.b(obj);
            e23.a<Unit> aVar3 = bVar2.f112666a;
            if (aVar3 != null) {
                aVar3.invoke();
            }
            String str3 = d0Var != null ? d0Var.f112650c : null;
            ki0.a.b.EnumC2007a enumC2007a2 = ki0.a.b.EnumC2007a.DECLINE_REQUEST;
            this.f112762h = b0Var;
            this.f112761g = 1;
            if (f.b(fVar, str3, enumC2007a2, this) != aVar2) {
            }
            return aVar2;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 == 3) {
                    i15 = this.f112760f;
                    v2Var = this.f112759e;
                    bVar2 = this.f112758d;
                    context2 = (Context) this.f112757c;
                    fVar = (f) this.f112756b;
                    obj2 = this.f112755a;
                    o13.r.b(obj);
                    this.f112762h = b0Var;
                    this.f112755a = obj2;
                    this.f112756b = bVar2;
                    this.f112757c = v2Var;
                    this.f112758d = null;
                    this.f112759e = null;
                    this.f112760f = i15;
                    this.f112761g = 4;
                    if (f.c(fVar, context2, this) != aVar2) {
                        v2Var2 = v2Var;
                        bVar = bVar2;
                    }
                    return aVar2;
                }
                if (i14 != 4) {
                    if (i14 != 5) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar2 = (f.b) this.f112756b;
                    o13.r.b(obj);
                    g12.k kVar = bVar2.f112668c;
                    if (kVar != null) {
                        kVar.invoke();
                    }
                    return Unit.INSTANCE;
                }
                v2Var2 = (v2) this.f112757c;
                bVar = (f.b) this.f112756b;
                o13.r.b(obj);
                v2.a aVar4 = (v2.a) v2Var2;
                String strI = lc.u0.i(aVar4.f47384b, "Decline request failed (", "): ", aVar4.f47385c);
                i2.a aVar5 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar5.getClass();
                i2.a.f(a2Var, "FollowItemViewAction", strI);
                aVar = bVar.f112667b;
                if (aVar != null) {
                    aVar.invoke();
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            v2Var = (v2) obj;
            if (v2Var instanceof v2.a) {
                if (d0Var != null) {
                    str2 = d0Var.f112650c;
                } else {
                    str2 = null;
                }
                enumC2007a = ki0.a.b.EnumC2007a.DECLINE_REQUEST_REVERTED;
                this.f112762h = b0Var;
                this.f112755a = obj;
                this.f112756b = fVar;
                context = this.f112766l;
                this.f112757c = context;
                this.f112758d = bVar2;
                this.f112759e = (v2.a) v2Var;
                this.f112760f = 0;
                this.f112761g = 3;
                if (f.b(fVar, str2, enumC2007a, this) != aVar2) {
                    obj2 = obj;
                    context2 = context;
                    this.f112762h = b0Var;
                    this.f112755a = obj2;
                    this.f112756b = bVar2;
                    this.f112757c = v2Var;
                    this.f112758d = null;
                    this.f112759e = null;
                    this.f112760f = i15;
                    this.f112761g = 4;
                    if (f.c(fVar, context2, this) != aVar2) {
                        v2Var2 = v2Var;
                        bVar = bVar2;
                        v2.a aVar6 = (v2.a) v2Var2;
                        String strI2 = lc.u0.i(aVar6.f47384b, "Decline request failed (", "): ", aVar6.f47385c);
                        i2.a aVar7 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar7.getClass();
                        i2.a.f(a2Var2, "FollowItemViewAction", strI2);
                        aVar = bVar.f112667b;
                        if (aVar != null) {
                            aVar.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                }
            } else {
                if (v2Var instanceof v2.b) {
                    lc.u0.r();
                    return null;
                }
                if (d0Var != null) {
                    str = d0Var.f112650c;
                } else {
                    str = null;
                }
                ki0.a.b.EnumC2007a enumC2007a3 = ki0.a.b.EnumC2007a.DECLINE_REQUEST;
                this.f112762h = null;
                this.f112755a = obj;
                this.f112756b = bVar2;
                this.f112757c = null;
                this.f112760f = 0;
                this.f112761g = 5;
            }
            return aVar2;
        }
        o13.r.b(obj);
        ei0.d dVar = fVar.f112664e;
        Long l14 = d0Var != null ? d0Var.f112655h : null;
        this.f112762h = b0Var;
        this.f112761g = 2;
        obj = dVar.B3(l14, false, this);
        if (obj != aVar2) {
            v2Var = (v2) obj;
            if (v2Var instanceof v2.a) {
                if (d0Var != null) {
                    str2 = d0Var.f112650c;
                } else {
                    str2 = null;
                }
                enumC2007a = ki0.a.b.EnumC2007a.DECLINE_REQUEST_REVERTED;
                this.f112762h = b0Var;
                this.f112755a = obj;
                this.f112756b = fVar;
                context = this.f112766l;
                this.f112757c = context;
                this.f112758d = bVar2;
                this.f112759e = (v2.a) v2Var;
                this.f112760f = 0;
                this.f112761g = 3;
                if (f.b(fVar, str2, enumC2007a, this) != aVar2) {
                    obj2 = obj;
                    context2 = context;
                    this.f112762h = b0Var;
                    this.f112755a = obj2;
                    this.f112756b = bVar2;
                    this.f112757c = v2Var;
                    this.f112758d = null;
                    this.f112759e = null;
                    this.f112760f = i15;
                    this.f112761g = 4;
                    if (f.c(fVar, context2, this) != aVar2) {
                        v2Var2 = v2Var;
                        bVar = bVar2;
                        v2.a aVar8 = (v2.a) v2Var2;
                        String strI3 = lc.u0.i(aVar8.f47384b, "Decline request failed (", "): ", aVar8.f47385c);
                        i2.a aVar9 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar9.getClass();
                        i2.a.f(a2Var3, "FollowItemViewAction", strI3);
                        aVar = bVar.f112667b;
                        if (aVar != null) {
                            aVar.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                }
            } else {
                if (v2Var instanceof v2.b) {
                    lc.u0.r();
                    return null;
                }
                if (d0Var != null) {
                    str = d0Var.f112650c;
                } else {
                    str = null;
                }
                ki0.a.b.EnumC2007a enumC2007a4 = ki0.a.b.EnumC2007a.DECLINE_REQUEST;
                this.f112762h = null;
                this.f112755a = obj;
                this.f112756b = bVar2;
                this.f112757c = null;
                this.f112760f = 0;
                this.f112761g = 5;
            }
        }
        return aVar2;
    }
}
