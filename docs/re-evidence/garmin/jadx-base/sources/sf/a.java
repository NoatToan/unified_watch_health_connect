package sf;

import ch.qos.logback.core.CoreConstants;
import d53.w;
import java.io.EOFException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;
import w63.a0;
import w63.b0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsf/a;", "", "<init>", "()V", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f158755a = new a();

    private a() {
    }

    public static p a(b0 b0Var) throws EOFException {
        int i14 = Integer.parseInt(b0Var.c1(Long.MAX_VALUE));
        long j8 = Long.parseLong(b0Var.c1(Long.MAX_VALUE));
        long j14 = Long.parseLong(b0Var.c1(Long.MAX_VALUE));
        m.a aVar = new m.a();
        int i15 = Integer.parseInt(b0Var.c1(Long.MAX_VALUE));
        for (int i16 = 0; i16 < i15; i16++) {
            String strC1 = b0Var.c1(Long.MAX_VALUE);
            int iG = w.G(CoreConstants.COLON_CHAR, 0, 6, strC1);
            if (iG == -1) {
                vb.h.x("Unexpected header: ".concat(strC1));
                return null;
            }
            aVar.a(w.i0(strC1.substring(0, iG)).toString(), strC1.substring(iG + 1));
        }
        return new p(i14, j8, j14, aVar.b(), null, null, 48, null);
    }

    public static void b(p pVar, a0 a0Var) {
        a0Var.e0(pVar.f158814a);
        a0Var.writeByte(10);
        a0Var.e0(pVar.f158815b);
        a0Var.writeByte(10);
        a0Var.e0(pVar.f158816c);
        a0Var.writeByte(10);
        Set<Map.Entry<String, List<String>>> setEntrySet = pVar.f158817d.f158807a.entrySet();
        Iterator<T> it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        a0Var.e0(size);
        a0Var.writeByte(10);
        for (Map.Entry<String, List<String>> entry : setEntrySet) {
            for (String str : entry.getValue()) {
                a0Var.h1(entry.getKey());
                a0Var.h1(":");
                a0Var.h1(str);
                a0Var.writeByte(10);
            }
        }
    }
}
