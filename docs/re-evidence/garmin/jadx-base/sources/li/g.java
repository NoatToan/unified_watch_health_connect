package li;

import ch.qos.logback.core.CoreConstants;
import com.apollographql.apollo3.exception.ApolloException;
import d53.u;
import d53.w;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import li.i.c;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.h0;
import p13.y;
import r53.j;
import v.e0;
import w2.a0;
import w63.b0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lw63/g;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {1, 5, 1})
@v13.e(c = "com.apollographql.apollo3.internal.MultipartKt$multipartBodyFlow$1", f = "multipart.kt", l = {28}, m = "invokeSuspend")
public final class g extends v13.i implements p<j<? super w63.g>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f112584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f112585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0<i> f112586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wh.i f112587d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r0<i> r0Var, wh.i iVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f112586c = r0Var;
        this.f112587d = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f112586c, this.f112587d, dVar);
        gVar.f112585b = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(j<? super w63.g> jVar, t13.d<? super Unit> dVar) {
        return ((g) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a4  */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, li.i] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String strJ0;
        j jVar;
        Object next;
        String str;
        i.b bVar;
        w63.g gVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f112584a;
        r0<i> r0Var = this.f112586c;
        if (i14 == 0) {
            r.b(obj);
            j jVar2 = (j) this.f112585b;
            wh.i iVar = this.f112587d;
            w63.g gVarA = iVar.a();
            gVarA.getClass();
            String strT = a0.t(iVar.f185235b);
            if (strT == null) {
                strJ0 = null;
            } else {
                List listX = w.X(strT, new char[]{';'});
                ArrayList arrayList = new ArrayList(y.r(listX, 10));
                Iterator it = listX.iterator();
                while (it.hasNext()) {
                    arrayList.add(w.i0((String) it.next()).toString());
                }
                Iterator it3 = arrayList.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!u.y((String) next, "boundary=", false));
                String str2 = (String) next;
                if (str2 == null || (str = (String) h0.e0(1, w.X(str2, new char[]{'='}))) == null) {
                    strJ0 = null;
                } else {
                    strJ0 = w.j0(str, CoreConstants.DOUBLE_QUOTE_CHAR, CoreConstants.SINGLE_QUOTE_CHAR);
                }
            }
            if (strJ0 == null) {
                throw new ApolloException("Expected the Content-Type to have a boundary parameter", null, 2, null);
            }
            r0Var.f105810a = new i(gVarA, strJ0);
            jVar = jVar2;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jVar = (j) this.f112585b;
            r.b(obj);
        }
        do {
            i iVar2 = r0Var.f105810a;
            iVar2.getClass();
            i iVar3 = iVar2;
            w63.h hVar = iVar3.f112592b;
            w63.g gVar2 = iVar3.f112591a;
            if (iVar3.f112595e) {
                vb.h.z("closed");
                return null;
            }
            if (iVar3.f112596f) {
                bVar = null;
                break;
            }
            if (iVar3.f112594d == 0 && gVar2.F3(0L, hVar)) {
                gVar2.skip(hVar.d());
            } else {
                while (true) {
                    long jA = iVar3.a(8192L);
                    if (jA == 0) {
                        break;
                    }
                    gVar2.skip(jA);
                }
                gVar2.skip(iVar3.f112593c.d());
            }
            boolean z14 = false;
            while (true) {
                int iJ1 = gVar2.j1(iVar3.f112598h);
                if (iJ1 == -1) {
                    throw new ApolloException("unexpected characters after boundary", null, 2, null);
                }
                if (iJ1 != 0) {
                    if (iJ1 == 1) {
                        iVar3.f112594d++;
                        i.f112590i.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        while (true) {
                            String strS1 = gVar2.s1();
                            if (strS1.length() == 0) {
                                i.c cVar = iVar3.new c();
                                iVar3.f112597g = cVar;
                                bVar = new i.b(arrayList2, new b0(cVar));
                                break;
                            }
                            int iG = w.G(CoreConstants.COLON_CHAR, 0, 6, strS1);
                            if (iG == -1) {
                                e0.n("Unexpected header: ".concat(strS1));
                                return null;
                            }
                            arrayList2.add(new wh.e(w.i0(strS1.substring(0, iG)).toString(), w.i0(strS1.substring(iG + 1)).toString()));
                        }
                    } else if (iJ1 != 2) {
                        if (iJ1 == 3 || iJ1 == 4) {
                            z14 = true;
                        }
                    } else {
                        if (z14) {
                            throw new ApolloException("unexpected characters after boundary", null, 2, null);
                        }
                        if (iVar3.f112594d == 0) {
                            throw new ApolloException("expected at least 1 part", null, 2, null);
                        }
                        iVar3.f112596f = true;
                    }
                } else {
                    if (iVar3.f112594d == 0) {
                        throw new ApolloException("expected at least 1 part", null, 2, null);
                    }
                    iVar3.f112596f = true;
                }
                bVar = null;
                break;
            }
            if (bVar == null) {
                return Unit.INSTANCE;
            }
            gVar = bVar.f112600b;
            this.f112585b = jVar;
            this.f112584a = 1;
        } while (jVar.emit(gVar, this) != aVar);
        return aVar;
    }
}
