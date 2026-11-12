package o73;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.t0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "<anonymous>", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "org.jetbrains.compose.resources.StringResourcesUtilsKt$getStringItem$2", f = "StringResourcesUtils.kt", l = {30}, m = "invokeSuspend")
public final class x extends v13.i implements e23.l<t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f130783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f130784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f130785c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(o oVar, n nVar, t13.d<? super x> dVar) {
        super(1, dVar);
        this.f130784b = oVar;
        this.f130785c = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new x(this.f130784b, this.f130785c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<Object> dVar) {
        return ((x) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f130783a;
        if (i14 == 0) {
            o13.r.b(obj);
            n nVar = this.f130785c;
            String str = nVar.f130768b;
            long j8 = nVar.f130769c;
            long j14 = nVar.f130770d;
            this.f130783a = 1;
            obj = this.f130784b.a(j8, j14, str);
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
        List listX = d53.w.X(d53.u.n((byte[]) obj), new char[]{'|'});
        String str2 = (String) h0.b0(listX);
        String str3 = (String) h0.m0(listX);
        if (!p005kotlin.jvm.internal.s.g(str2, "plurals")) {
            if (!p005kotlin.jvm.internal.s.g(str2, "string-array")) {
                d53.k kVar = z.f130787a;
                return new t(d53.u.n(b23.a.a(b23.a.f15486f, str3, 0, 6)));
            }
            d53.k kVar2 = z.f130787a;
            List listW = d53.w.W(str3, new String[]{","});
            ArrayList arrayList = new ArrayList(p13.y.r(listW, 10));
            Iterator it = listW.iterator();
            while (it.hasNext()) {
                arrayList.add(d53.u.n(b23.a.a(b23.a.f15486f, (String) it.next(), 0, 6)));
            }
            return new r(arrayList);
        }
        d53.k kVar3 = z.f130787a;
        List<String> listW2 = d53.w.W(str3, new String[]{","});
        int iA = t0.a(p13.y.r(listW2, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (String strSubstring : listW2) {
            String strF0 = d53.w.f0(strSubstring, CoreConstants.COLON_CHAR);
            int iG = d53.w.G(CoreConstants.COLON_CHAR, 0, 6, strSubstring);
            if (iG != -1) {
                strSubstring = strSubstring.substring(iG + 1, strSubstring.length());
            }
            p73.a.f136337a.getClass();
            Iterator<T> it3 = p73.a.f136339c.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!d53.u.q(((p73.a) next).name(), strF0, true));
            p73.a aVar2 = (p73.a) next;
            aVar2.getClass();
            o13.p pVar = new o13.p(aVar2, d53.u.n(b23.a.a(b23.a.f15486f, strSubstring, 0, 6)));
            linkedHashMap.put(pVar.f128594a, pVar.f128595b);
        }
        return new s(linkedHashMap);
    }
}
