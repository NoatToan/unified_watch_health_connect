package n23;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
public class n3 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q3.a f122542a;

    public n3(q3.a aVar) {
        this.f122542a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Iterable] */
    @Override // e23.a
    public final Object invoke() {
        ?? C;
        k23.l<Object>[] lVarArr = q3.a.f122580g;
        q3.a aVar = this.f122542a;
        c4.a aVar2 = aVar.f122581c;
        k23.l<Object> lVar = q3.a.f122580g[0];
        y23.e eVar = (y23.e) aVar2.invoke();
        if (eVar == null) {
            return i43.l.b.f91061b;
        }
        c4.a aVar3 = aVar.f122508a;
        k23.l<Object> lVar2 = i3.b.f122507b[0];
        Object objInvoke = aVar3.invoke();
        objInvoke.getClass();
        y23.a aVar4 = ((y23.i) objInvoke).f194356b;
        q33.o oVar = aVar4.f194341a;
        ConcurrentHashMap<x33.b, i43.l> concurrentHashMap = aVar4.f194343c;
        Class<?> cls = eVar.f194348a;
        x33.b bVarA = z23.f.a(cls);
        i43.l lVar3 = concurrentHashMap.get(bVarA);
        if (lVar3 == null) {
            x33.c cVar = z23.f.a(cls).f188591a;
            r33.a aVar5 = eVar.f194349b;
            r33.a.EnumC2820a enumC2820a = aVar5.f150095a;
            r33.a.EnumC2820a enumC2820a2 = r33.a.EnumC2820a.MULTIFILE_CLASS;
            if (enumC2820a == enumC2820a2) {
                String[] strArr = aVar5.f150097c;
                List<String> listAsList = null;
                if (enumC2820a != enumC2820a2) {
                    strArr = null;
                }
                if (strArr != null) {
                    listAsList = Arrays.asList(strArr);
                    listAsList.getClass();
                }
                if (listAsList == null) {
                    listAsList = p13.j0.f134944a;
                }
                C = new ArrayList();
                for (String str : listAsList) {
                    x33.b.a aVar6 = x33.b.f188590d;
                    x33.c cVar2 = new x33.c(g43.c.d(str).f75851a.replace(IOUtils.DIR_SEPARATOR_UNIX, '.'));
                    aVar6.getClass();
                    q33.x xVarA = q33.w.a(aVar4.f194342b, x33.b.a.b(cVar2), oVar.c().f110053c.a());
                    if (xVarA != null) {
                        C.add(xVarA);
                    }
                }
            } else {
                C = p13.w.c(eVar);
            }
            w23.r rVar = new w23.r(oVar.c().f110052b, cVar);
            ArrayList arrayList = new ArrayList();
            Iterator it = C.iterator();
            while (it.hasNext()) {
                n43.f0 f0VarA = oVar.a(rVar, (q33.x) it.next());
                if (f0VarA != null) {
                    arrayList.add(f0VarA);
                }
            }
            List listB1 = p13.h0.b1(arrayList);
            i43.b.a aVar7 = i43.b.f91022d;
            String str2 = "package " + cVar + " (" + eVar + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            aVar7.getClass();
            i43.l lVarA = i43.b.a.a(str2, listB1);
            i43.l lVarPutIfAbsent = concurrentHashMap.putIfAbsent(bVarA, lVarA);
            lVar3 = lVarPutIfAbsent == null ? lVarA : lVarPutIfAbsent;
        }
        lVar3.getClass();
        return lVar3;
    }
}
