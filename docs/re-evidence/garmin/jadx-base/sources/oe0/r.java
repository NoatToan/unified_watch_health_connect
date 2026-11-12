package oe0;

import androidx.lifecycle.v1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ne0.a0;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.presentation.EditDogViewModel$setDog$2", f = "EditDogViewModel.kt", l = {72}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f131403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f131404c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, long j8, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f131403b = sVar;
        this.f131404c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f131403b, this.f131404c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:61:0x0104  */
    /* JADX WARN: Code duplicated, block: B:62:0x0107  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, o13.l] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE0;
        p2 p2Var;
        pe0.d dVar;
        String str;
        i53.c cVarB;
        Double d14;
        double dDoubleValue;
        String str2;
        String str3;
        String str4;
        String str5;
        Object value;
        Object value2;
        String str6;
        Object next;
        Object next2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131402a;
        long j8 = this.f131404c;
        s sVar = this.f131403b;
        if (i14 == 0) {
            o13.r.b(obj);
            ne0.b0 b0Var = (ne0.b0) sVar.f131408d.getValue();
            this.f131402a = 1;
            b0Var.getClass();
            x53.c cVar = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new a0(b0Var, j8, null), this);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objE0 = obj;
        }
        je0.f fVar = (je0.f) objE0;
        p2 p2Var2 = sVar.f131412h;
        p2 p2Var3 = sVar.f131410f;
        p2 p2Var4 = sVar.f131414j;
        String str7 = fVar.f98504d;
        String str8 = "";
        String str9 = str7 == null ? "" : str7;
        je0.d dVar2 = fVar.f98507g;
        if (dVar2 != null) {
            Iterator it = ((Iterable) p2Var4.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    p2Var = p2Var4;
                    next2 = null;
                    break;
                }
                next2 = it.next();
                p2Var = p2Var4;
                if (((pe0.d) next2).f137416a == dVar2.f98486a) {
                    break;
                }
                p2Var4 = p2Var;
            }
            dVar = (pe0.d) next2;
        } else {
            p2Var = p2Var4;
            dVar = null;
        }
        List<je0.d> list = fVar.f98508h;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (je0.d dVar3 : list) {
                Iterator it3 = ((Iterable) p2Var.getValue()).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        str6 = str8;
                        next = null;
                        break;
                    }
                    next = it3.next();
                    str6 = str8;
                    Iterator it4 = it3;
                    if (((pe0.d) next).f137416a == dVar3.f98486a) {
                        break;
                    }
                    str8 = str6;
                    it3 = it4;
                }
                pe0.d dVar4 = (pe0.d) next;
                if (dVar4 != null) {
                    arrayList.add(dVar4);
                }
                str8 = str6;
            }
            str = str8;
            cVarB = i53.a.e(arrayList);
            if (cVarB == null) {
            }
            i53.c cVar2 = cVarB;
            je0.g gVar = fVar.f98509i;
            Boolean bool = fVar.f98510j;
            d14 = fVar.f98512l;
            if (d14 != null) {
                dDoubleValue = d14.doubleValue();
            } else {
                dDoubleValue = 0.0d;
            }
            double d15 = dDoubleValue;
            str2 = fVar.f98513m;
            if (str2 == null) {
                str3 = str;
            } else {
                str3 = str2;
            }
            str4 = fVar.f98514n;
            if (str4 == null) {
                str5 = str;
            } else {
                str5 = str4;
            }
            p2Var2.k(null, new pe0.j(str9, dVar, cVar2, gVar, bool, d15, str3, str5, true, fVar.f98517q, null, 1024, null));
            long j14 = fVar.f98501a;
            do {
                value = p2Var3.getValue();
            } while (!p2Var3.b(value, o.a((o) value, false, false, false, false, true, 239)));
            ge1.b.T(v1.a(sVar), null, null, new q(sVar, j14, null), 3);
            sVar.f131416l = j8;
            do {
                value2 = p2Var3.getValue();
            } while (!p2Var3.b(value2, o.a((o) value2, false, false, false, false, false, 254)));
            return Unit.INSTANCE;
        }
        str = "";
        cVarB = j53.l.b();
        i53.c cVar3 = cVarB;
        je0.g gVar2 = fVar.f98509i;
        Boolean bool2 = fVar.f98510j;
        d14 = fVar.f98512l;
        if (d14 != null) {
            dDoubleValue = d14.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        double d16 = dDoubleValue;
        str2 = fVar.f98513m;
        if (str2 == null) {
            str3 = str;
        } else {
            str3 = str2;
        }
        str4 = fVar.f98514n;
        if (str4 == null) {
            str5 = str;
        } else {
            str5 = str4;
        }
        p2Var2.k(null, new pe0.j(str9, dVar, cVar3, gVar2, bool2, d16, str3, str5, true, fVar.f98517q, null, 1024, null));
        long j15 = fVar.f98501a;
        do {
            value = p2Var3.getValue();
        } while (!p2Var3.b(value, o.a((o) value, false, false, false, false, true, 239)));
        ge1.b.T(v1.a(sVar), null, null, new q(sVar, j15, null), 3);
        sVar.f131416l = j8;
        do {
            value2 = p2Var3.getValue();
        } while (!p2Var3.b(value2, o.a((o) value2, false, false, false, false, false, 254)));
        return Unit.INSTANCE;
    }
}
