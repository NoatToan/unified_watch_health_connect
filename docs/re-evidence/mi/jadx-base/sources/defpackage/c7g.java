package defpackage;

import com.xiaomi.ai.domain.mobileapp.MobileAppFacade;
import com.xiaomi.ai.domain.phonecall.PhonecallAppFacadeV3;
import com.xiaomi.ai.domain.phonecall.contact.Contact;
import com.xiaomi.ai.edge.EdgeNluFacade;
import com.xiaomi.ai.edge.model.EdgeAsrDataCategory;
import com.xiaomi.ai.edge.persist.EdgePersistData;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class c7g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f5014a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile long f5015b = -999;
    public static final qpe c = aqe.f(c7g.class);

    public static class a extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            jk1.b().c();
            kug.b().c();
        }
    }

    public static void a() {
        nip.a();
        com.xiaomi.ai.nlp.contact.common.a.a();
    }

    public static long b() {
        return f5015b;
    }

    public static int c(EdgeNluFacade.b bVar, String str) {
        try {
            return Integer.parseInt(bVar.a(str));
        } catch (Exception unused) {
            return -1;
        }
    }

    public static Map<EdgeAsrDataCategory, List<String>> d(n08 n08Var) {
        if (n08Var == null) {
            n08Var = new n08();
        }
        HashMap map = new HashMap();
        map.put(EdgeAsrDataCategory.HOTQUERY, bbc.a().b(n08Var));
        map.put(EdgeAsrDataCategory.PHONECALL, PhonecallAppFacadeV3.getInstance().getNormalizeDataForAsr(n08Var));
        map.put(EdgeAsrDataCategory.MOBILEAPP, MobileAppFacade.getInstance().getNormalizeDataForAsr(n08Var));
        return map;
    }

    public static int e() {
        try {
            return PhonecallAppFacadeV3.getInstance().obtainPersistData().size();
        } catch (Exception e) {
            c.error("getPhoneCallDataSize Failed:", (Throwable) e);
            return 0;
        }
    }

    public static void f() {
        nip.b();
        com.xiaomi.ai.nlp.contact.common.a.b();
    }

    public static void g() {
        new a().start();
    }

    public static void h() {
        f5014a = false;
        PhonecallAppFacadeV3.getInstance().invalidContactsData();
        c.info("invalidPhoneCallData:isPhoneCallDataInit:{}", Boolean.valueOf(f5014a));
    }

    public static boolean i(EdgeNluFacade.b bVar) {
        int iC = c(bVar, "hot_query_json_v3");
        int iC2 = c(bVar, "local_hot_query_json_v3");
        return iC2 == -1 || iC > iC2;
    }

    public static boolean j() {
        c.info("isPhoneCallDataInit:{},contactDataIsEmpty:{}", Boolean.valueOf(f5014a), Boolean.valueOf(PhonecallAppFacadeV3.getInstance().contactDataIsEmpty()));
        return f5014a && !PhonecallAppFacadeV3.getInstance().contactDataIsEmpty();
    }

    public static boolean k(InputStream inputStream) {
        boolean zJ;
        qpe qpeVar = c;
        qpeVar.info("loadModelByCache start");
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        try {
            EdgePersistData edgePersistDataB = com.xiaomi.ai.edge.persist.a.b(inputStream);
            if (edgePersistDataB == null) {
                return false;
            }
            HashMap<String, byte[]> map = edgePersistDataB.hotQueryMap;
            boolean z2 = true;
            boolean zE = (map == null || map.isEmpty()) ? true : bbc.a().e(edgePersistDataB.hotQueryMap) & true;
            qpeVar.info("loadModelByCache PhonecallAppFacadeV3.getInstance().hotQueryMap ret:{}", Boolean.valueOf(zE));
            List<Contact> list = edgePersistDataB.contactList;
            if (list == null || list.isEmpty()) {
                zJ = zE & j();
                List<Contact> list2 = edgePersistDataB.contactList;
                if (list2 == null || list2.isEmpty()) {
                    z2 = false;
                }
                qpeVar.info("loadModelByCache contactList is NULL: {},cost: {}", Boolean.valueOf(z2), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                f5015b = -1L;
            } else {
                qpeVar.info("loadModelByCache contactList not NULL,contactList.size:{}", Integer.valueOf(edgePersistDataB.contactList.size()));
                zJ = zE & PhonecallAppFacadeV3.getInstance().restoreFromPersistData(edgePersistDataB.contactList);
                if (zJ) {
                    f5014a = true;
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    f5015b = jCurrentTimeMillis2;
                    qpeVar.info("loadModelByCache PhonecallAppFacadeV3.getInstance().initEdge cost:{}", Long.valueOf(jCurrentTimeMillis2));
                }
            }
            qpeVar.info("loadModelByCache PhonecallAppFacadeV3.getInstance().contactList ret:{}", Boolean.valueOf(zJ));
            if (zJ && !q08.a(edgePersistDataB.appDataStr)) {
                zJ &= MobileAppFacade.getInstance().restoreFromPersistData(edgePersistDataB.appDataStr);
            }
            qpeVar.info("loadModelByCache PhonecallAppFacadeV3.getInstance().appDataStr ret:{}", Boolean.valueOf(zJ));
            z = zJ;
        } catch (Exception e) {
            c.error("loadModelByCache error!", (Throwable) e);
        }
        if (z) {
            g();
        }
        c.info("loadModelByCache end,ret:{},cost:{}", Boolean.valueOf(z), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return z;
    }

    public static boolean l(i08 i08Var, OutputStream outputStream) {
        qpe qpeVar = c;
        int length = 0;
        qpeVar.info("loadModelByData contactList start,modelInitData.getContactsDataJS() == null:{}", Boolean.valueOf(i08Var.b() == null));
        long jCurrentTimeMillis = System.currentTimeMillis();
        EdgePersistData edgePersistData = outputStream != null ? new EdgePersistData() : null;
        bbc.a().c(i08Var.c());
        qpeVar.info("loadModelByData HotQueryFacade.getInstance().initEdge cost:{}", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        if (edgePersistData != null) {
            edgePersistData.hotQueryMap = bbc.a().d();
        }
        if (i08Var.b() == null) {
            qpeVar.info("loadModelByData contactList is NULL: {}", i08Var.b());
            f5015b = -1L;
        } else {
            try {
                length = i08Var.b().optJSONArray("contacts").length();
            } catch (Exception e) {
                c.error("loadModelByData getContactsSize failed! e:", (Throwable) e);
                f5015b = -1L;
                length = -1;
            }
        }
        qpe qpeVar2 = c;
        qpeVar2.info("loadModelByData contactList end,contactsSize:{}", Integer.valueOf(length));
        f5014a = PhonecallAppFacadeV3.getInstance().initEdge(i08Var.b());
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        f5015b = jCurrentTimeMillis2;
        qpeVar2.info("loadModelByData PhonecallAppFacadeV3.getInstance().initEdge cost:{}", Long.valueOf(jCurrentTimeMillis2));
        if (edgePersistData != null) {
            edgePersistData.contactList = PhonecallAppFacadeV3.getInstance().obtainPersistData();
            qpeVar2.info("loadModelByData PhonecallAppFacadeV3.getInstance().obtainPersistData()mvn  cost:{}", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        }
        MobileAppFacade.getInstance().initEdge(i08Var.a() != null ? i08Var.a().toString() : null);
        if (edgePersistData != null) {
            edgePersistData.appDataStr = MobileAppFacade.getInstance().obtainPersistData();
        }
        com.xiaomi.ai.edge.persist.a.c(edgePersistData, outputStream);
        g();
        qpeVar2.info("loadModelByData contactList end,cost:{}", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return true;
    }

    public static boolean m(i08 i08Var, OutputStream outputStream, EdgeNluFacade.b bVar) throws FileNotFoundException, NullPointerException {
        InputStream resourceAsStream;
        int iC;
        File fileB = bVar.b("hot_query_json_v3");
        if (fileB.exists()) {
            resourceAsStream = new FileInputStream(fileB);
            iC = c(bVar, "hot_query_json_v3");
        } else {
            resourceAsStream = c7g.class.getResourceAsStream("/hot_query_json_v3");
            iC = 0;
        }
        i08Var.e(resourceAsStream);
        boolean zL = l(i08Var, outputStream);
        if (zL) {
            bVar.c("local_hot_query_json_v3", String.valueOf(iC));
        }
        return zL;
    }

    public static void n(long j) {
        f5015b = j;
    }
}
