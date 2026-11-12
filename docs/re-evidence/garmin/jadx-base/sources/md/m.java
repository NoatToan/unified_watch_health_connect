package md;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p13.h0;
import p13.w;
import p13.y;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b((Integer) ((Map.Entry) t7).getKey(), (Integer) ((Map.Entry) t14).getKey());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b((Integer) ((Map.Entry) t7).getKey(), (Integer) ((Map.Entry) t14).getKey());
        }
    }

    public static final List<j> a(ud.c cVar) {
        int iN = ge1.b.n(cVar, TtmlNode.ATTR_ID);
        int iN2 = ge1.b.n(cVar, "seq");
        int iN3 = ge1.b.n(cVar, Constants.MessagePayloadKeys.FROM);
        int iN4 = ge1.b.n(cVar, "to");
        q13.b bVarB = w.b();
        while (cVar.J0()) {
            bVarB.add(new j((int) cVar.getLong(iN), (int) cVar.getLong(iN2), cVar.M1(iN3), cVar.M1(iN4)));
        }
        return h0.M0(w.a(bVarB));
    }

    public static final n.d b(ud.a aVar, String str, boolean z14) {
        ud.c cVarM0 = aVar.M0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iN = ge1.b.n(cVarM0, "seqno");
            int iN2 = ge1.b.n(cVarM0, "cid");
            int iN3 = ge1.b.n(cVarM0, "name");
            int iN4 = ge1.b.n(cVarM0, "desc");
            if (iN != -1 && iN2 != -1 && iN3 != -1 && iN4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (cVarM0.J0()) {
                    if (((int) cVarM0.getLong(iN2)) >= 0) {
                        int i14 = (int) cVarM0.getLong(iN);
                        String strM1 = cVarM0.M1(iN3);
                        String str2 = cVarM0.getLong(iN4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i14), strM1);
                        linkedHashMap2.put(Integer.valueOf(i14), str2);
                    }
                }
                List listN0 = h0.N0(linkedHashMap.entrySet(), new a());
                ArrayList arrayList = new ArrayList(y.r(listN0, 10));
                Iterator it = listN0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listB1 = h0.b1(arrayList);
                List listN1 = h0.N0(linkedHashMap2.entrySet(), new b());
                ArrayList arrayList2 = new ArrayList(y.r(listN1, 10));
                Iterator it3 = listN1.iterator();
                while (it3.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it3.next()).getValue());
                }
                n.d dVar = new n.d(str, z14, listB1, h0.b1(arrayList2));
                zf.b.h(cVarM0, null);
                return dVar;
            }
            zf.b.h(cVarM0, null);
            return null;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                zf.b.h(cVarM0, th3);
                throw th4;
            }
        }
    }
}
