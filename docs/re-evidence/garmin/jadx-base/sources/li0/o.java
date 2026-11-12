package li0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.ui.FollowAction$undoDeclineRequest$1", f = "FollowAction.kt", l = {490, 491, 494, 495}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f112820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f112821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f112822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f.b f112823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v2.a f112824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f112825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f112826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f112827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f.b f112828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f112829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d0 f112830k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f112831l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(f.b bVar, f fVar, d0 d0Var, Context context, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f112828i = bVar;
        this.f112829j = fVar;
        this.f112830k = d0Var;
        this.f112831l = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f112828i, this.f112829j, this.f112830k, this.f112831l, dVar);
        oVar.f112827h = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f9  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        g12.k kVar;
        String str;
        ki0.a.b.EnumC2007a enumC2007a;
        Context context;
        int i14;
        Object obj2;
        Context context2;
        v2 v2Var2;
        f.b bVar;
        e23.a<Unit> aVar;
        o53.b0 b0Var = (o53.b0) this.f112827h;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f112826g;
        f.b bVar2 = this.f112828i;
        d0 d0Var = this.f112830k;
        f fVar = this.f112829j;
        if (i15 == 0) {
            o13.r.b(obj);
            e23.a<Unit> aVar3 = bVar2.f112666a;
            if (aVar3 != null) {
                aVar3.invoke();
            }
            String str2 = d0Var != null ? d0Var.f112650c : null;
            ki0.a.b.EnumC2007a enumC2007a2 = ki0.a.b.EnumC2007a.DECLINE_REQUEST_REVERTED;
            this.f112827h = b0Var;
            this.f112826g = 1;
            if (f.b(fVar, str2, enumC2007a2, this) != aVar2) {
            }
            return aVar2;
        }
        if (i15 == 1) {
            o13.r.b(obj);
        } else {
            if (i15 == 2) {
                o13.r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.a) {
                    if (d0Var != null) {
                        str = d0Var.f112650c;
                    } else {
                        str = null;
                    }
                    enumC2007a = ki0.a.b.EnumC2007a.DECLINE_REQUEST;
                    this.f112827h = b0Var;
                    this.f112820a = obj;
                    this.f112821b = fVar;
                    context = this.f112831l;
                    this.f112822c = context;
                    this.f112823d = bVar2;
                    this.f112824e = (v2.a) v2Var;
                    i14 = 0;
                    this.f112825f = 0;
                    this.f112826g = 3;
                    if (f.b(fVar, str, enumC2007a, this) != aVar2) {
                        obj2 = obj;
                        context2 = context;
                        this.f112827h = b0Var;
                        this.f112820a = obj2;
                        this.f112821b = bVar2;
                        this.f112822c = v2Var;
                        this.f112823d = null;
                        this.f112824e = null;
                        this.f112825f = i14;
                        this.f112826g = 4;
                        if (f.c(fVar, context2, this) != aVar2) {
                            v2Var2 = v2Var;
                            bVar = bVar2;
                        }
                    }
                    return aVar2;
                }
                if (v2Var instanceof v2.b) {
                    lc.u0.r();
                    return null;
                }
                kVar = bVar2.f112668c;
                if (kVar != null) {
                    kVar.invoke();
                }
                return Unit.INSTANCE;
            }
            if (i15 == 3) {
                int i16 = this.f112825f;
                v2.a aVar4 = this.f112824e;
                f.b bVar3 = this.f112823d;
                context2 = (Context) this.f112822c;
                fVar = (f) this.f112821b;
                obj2 = this.f112820a;
                o13.r.b(obj);
                i14 = i16;
                v2Var = aVar4;
                bVar2 = bVar3;
                this.f112827h = b0Var;
                this.f112820a = obj2;
                this.f112821b = bVar2;
                this.f112822c = v2Var;
                this.f112823d = null;
                this.f112824e = null;
                this.f112825f = i14;
                this.f112826g = 4;
                if (f.c(fVar, context2, this) != aVar2) {
                    v2Var2 = v2Var;
                    bVar = bVar2;
                }
                return aVar2;
            }
            if (i15 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var2 = (v2) this.f112822c;
            bVar = (f.b) this.f112821b;
            o13.r.b(obj);
        }
        v2.a aVar5 = (v2.a) v2Var2;
        String strI = lc.u0.i(aVar5.f47384b, "Undo decline request failed (", "): ", aVar5.f47385c);
        i2.a aVar6 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar6.getClass();
        i2.a.f(a2Var, "FollowItemViewAction", strI);
        aVar = bVar.f112667b;
        if (aVar != null) {
            aVar.invoke();
        }
        return Unit.INSTANCE;
        ei0.d dVar = fVar.f112664e;
        Long l14 = d0Var != null ? d0Var.f112655h : null;
        this.f112827h = b0Var;
        this.f112826g = 2;
        obj = dVar.B3(l14, true, this);
        if (obj != aVar2) {
            v2Var = (v2) obj;
            if (v2Var instanceof v2.a) {
                if (d0Var != null) {
                    str = d0Var.f112650c;
                } else {
                    str = null;
                }
                enumC2007a = ki0.a.b.EnumC2007a.DECLINE_REQUEST;
                this.f112827h = b0Var;
                this.f112820a = obj;
                this.f112821b = fVar;
                context = this.f112831l;
                this.f112822c = context;
                this.f112823d = bVar2;
                this.f112824e = (v2.a) v2Var;
                i14 = 0;
                this.f112825f = 0;
                this.f112826g = 3;
                if (f.b(fVar, str, enumC2007a, this) != aVar2) {
                    obj2 = obj;
                    context2 = context;
                    this.f112827h = b0Var;
                    this.f112820a = obj2;
                    this.f112821b = bVar2;
                    this.f112822c = v2Var;
                    this.f112823d = null;
                    this.f112824e = null;
                    this.f112825f = i14;
                    this.f112826g = 4;
                    if (f.c(fVar, context2, this) != aVar2) {
                        v2Var2 = v2Var;
                        bVar = bVar2;
                        v2.a aVar7 = (v2.a) v2Var2;
                        String strI2 = lc.u0.i(aVar7.f47384b, "Undo decline request failed (", "): ", aVar7.f47385c);
                        i2.a aVar8 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar8.getClass();
                        i2.a.f(a2Var2, "FollowItemViewAction", strI2);
                        aVar = bVar.f112667b;
                        if (aVar != null) {
                            aVar.invoke();
                        }
                    }
                }
            } else {
                if (v2Var instanceof v2.b) {
                    lc.u0.r();
                    return null;
                }
                kVar = bVar2.f112668c;
                if (kVar != null) {
                    kVar.invoke();
                }
            }
            return Unit.INSTANCE;
        }
        return aVar2;
    }
}
