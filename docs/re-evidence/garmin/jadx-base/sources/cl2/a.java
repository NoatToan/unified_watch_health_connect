package cl2;

import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p13.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcl2/a;", "", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f27939a = new a();

    /* JADX INFO: renamed from: cl2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class C0427a extends q implements p<gy2.c, StringBuilder, Unit> {
        public C0427a(Object obj) {
            super(2, obj, a.class, "appendDeviceMessage", "appendDeviceMessage(Lcom/garmin/sync/gc/DeviceMessageDto;Ljava/lang/StringBuilder;)V", 0);
        }

        @Override // e23.p
        public final Unit invoke(gy2.c cVar, StringBuilder sb3) {
            gy2.c cVar2 = cVar;
            StringBuilder sb4 = sb3;
            cVar2.getClass();
            sb4.getClass();
            ((a) this.receiver).getClass();
            sb4.append("\n");
            sb4.append("  ");
            sb4.append(cVar2.d());
            if (cVar2.f80291b != null) {
                sb4.append(StringUtils.SPACE);
                String str = cVar2.f80291b;
                sb4.append(str != null ? str.toString() : null);
            } else {
                sb4.append(StringUtils.SPACE);
                sb4.append(cVar2.f80295f);
            }
            String strE = cVar2.e();
            if (!(strE == null || strE.length() == 0)) {
                sb4.append(StringUtils.SPACE);
                sb4.append(cVar2.e());
            }
            if (cVar2.h()) {
                sb4.append(StringUtils.SPACE);
                sb4.append(cVar2.b());
            }
            gy2.h hVar = cVar2.f80294e;
            if (hVar != null && hVar.f80330d != null) {
                sb4.append(" (");
                sb4.append(cVar2.c());
                sb4.append(" bytes)");
            }
            if (cVar2.f80296g != null) {
                sb4.append(" [");
                sb4.append(cVar2.f80296g);
                sb4.append("]");
            }
            return Unit.INSTANCE;
        }
    }

    private a() {
    }

    public static void a(jy2.a aVar, StringBuilder sb3) {
        aVar.getClass();
        sb3.getClass();
        sb3.append("\n");
        sb3.append(StringUtils.SPACE);
        sb3.append(aVar.f101857e);
        sb3.append(StringUtils.SPACE);
        sb3.append(aVar.f101859g);
        sb3.append(StringUtils.SPACE);
        sb3.append(aVar.b());
        sb3.append(" (");
        sb3.append(aVar.f101858f);
        sb3.append(" bytes)");
    }

    public static StringBuilder b(String str, rs2.c cVar) {
        cVar.getClass();
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(": ");
        sb3.append(cVar.getF172496d());
        sb3.append("-");
        sb3.append(cVar.getF172493a());
        sb3.append(": ");
        return sb3;
    }

    public static StringBuilder d(ArrayList arrayList, String str, rs2.c cVar, p pVar) {
        cVar.getClass();
        StringBuilder sbB = b(str, cVar);
        if (arrayList == null || arrayList.isEmpty()) {
            sbB.append(" No items");
            return sbB;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pVar.invoke(it.next(), sbB);
        }
        return sbB;
    }

    public final void c(Logger logger, List<gy2.c> list, String str, rs2.c cVar) {
        int i14;
        logger.getClass();
        cVar.getClass();
        ArrayList arrayList = null;
        if (list == null || list.isEmpty()) {
            i14 = 0;
        } else {
            Iterator<T> it = list.iterator();
            i14 = 0;
            while (it.hasNext()) {
                gy2.g gVar = ((gy2.c) it.next()).f80295f;
                if (s.g(gVar != null ? gVar.name() : null, "SOFTWARE_UPDATE") && (i14 = i14 + 1) < 0) {
                    x.p();
                    throw null;
                }
            }
        }
        boolean z14 = i14 > 5;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                gy2.c cVar2 = (gy2.c) obj;
                if (z14) {
                    gy2.g gVar2 = cVar2.f80295f;
                    if (!s.g(gVar2 != null ? gVar2.name() : null, "SOFTWARE_UPDATE")) {
                    }
                }
                arrayList2.add(obj);
            }
            arrayList = arrayList2;
        }
        StringBuilder sbD = d(arrayList, str, cVar, new C0427a(this));
        if (z14) {
            sn.a.t(sbD, "\n", "  ***********", StringUtils.SPACE, "SOFTWARE_UPDATE");
            sbD.append(StringUtils.SPACE);
            sbD.append(i14);
            sbD.append(" files");
        }
        logger.info(sbD.toString());
    }
}
