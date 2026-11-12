package defpackage;

import android.content.Context;
import com.xiaomi.hm.health.bletool.device.firmware.ISyncAgpsCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes8.dex */
public class zjs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExecutorService f41386a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f41387b = new AtomicBoolean(false);
    public static final qd[] c = {qd.d0, qd.j0, qd.l0, qd.n0, qd.r0, qd.t0, qd.v0, qd.z0, qd.A0, qd.f1, qd.B0, qd.C0, qd.D0, qd.F0, qd.G0, qd.Q0, qd.R0, qd.P0, qd.S0, qd.n1, qd.h1, qd.i1, qd.A2, qd.l1, qd.m1, qd.N2, qd.O2, qd.P2, qd.R2, qd.S2, qd.T2, qd.U2, qd.V2, qd.s1, qd.t1, qd.v1, qd.K1, qd.L1, qd.E1, qd.F1, qd.G1, qd.H1, qd.I1, qd.J1, qd.O1, qd.P1, qd.Q1, qd.R1, qd.m2, qd.o2, qd.n2, qd.p2, qd.d1, qd.e1, qd.q2, qd.r2, qd.s2, qd.t2, qd.T1, qd.U1, qd.g2, qd.h2, qd.i2, qd.j2, qd.X1, qd.Y1, qd.V1, qd.W1, qd.D2, qd.E2, qd.F2, qd.u2, qd.v2, qd.b2, qd.c2};
    public static Progress d = null;

    public class a implements jys {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ISyncAgpsCallback f41388a;

        public a(ISyncAgpsCallback iSyncAgpsCallback) {
            this.f41388a = iSyncAgpsCallback;
        }

        @Override // defpackage.jys
        public void a(int i) {
            t5t.m("HMAgpsUpgradeManager", "onFwStart");
            zjs.d = new Progress();
            this.f41388a.onStart();
        }

        @Override // defpackage.jys
        public void onFwProgress(Progress progress) {
            t5t.m("HMAgpsUpgradeManager", "onFwProgress:" + progress);
            Progress progress2 = zjs.d;
            if (progress2 == null || progress2.getPercent() != progress.getPercent()) {
                this.f41388a.onProgress(progress);
            }
            zjs.d = progress;
        }

        @Override // defpackage.jys
        public void onFwStop(boolean z) {
            t5t.m("HMAgpsUpgradeManager", "onFwStop:" + z);
            zjs.d = null;
            this.f41388a.onStop(z);
        }
    }

    public class b implements jys {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f41389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f41390b;
        public final /* synthetic */ jys c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        public b(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, jys jysVar, int i, int i2) {
            this.f41389a = atomicBoolean;
            this.f41390b = countDownLatch;
            this.c = jysVar;
            this.d = i;
            this.e = i2;
        }

        @Override // defpackage.jys
        public void a(int i) {
        }

        @Override // defpackage.jys
        public void onFwProgress(Progress progress) {
            this.c.onFwProgress(new Progress(this.d, this.e + progress.progress));
        }

        @Override // defpackage.jys
        public void onFwStop(boolean z) {
            this.f41389a.getAndSet(z);
            this.f41390b.countDown();
        }
    }

    public static /* synthetic */ int a(xd xdVar, xd xdVar2) {
        return (-xdVar.h().a()) + xdVar2.h().a();
    }

    public static ArrayList<File> b(File file, String str) {
        ArrayList<File> arrayList = new ArrayList<>();
        try {
            File file2 = new File(str);
            if (!file2.exists() || !file2.isDirectory()) {
                file2.mkdirs();
            }
            byte[] bArr = new byte[1024];
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                String str2 = File.separator;
                sb.append(str2);
                sb.append(zipEntryNextElement.getName());
                String string = sb.toString();
                int iLastIndexOf = string.lastIndexOf(str2);
                File file3 = new File(iLastIndexOf != -1 ? string.substring(0, iLastIndexOf) : "");
                if (!file3.exists() || !file3.isDirectory()) {
                    file3.mkdirs();
                }
                File file4 = new File(string);
                if (file4.exists()) {
                    new SecurityManager().checkDelete(string);
                    file4.delete();
                }
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file4));
                BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntryNextElement));
                while (true) {
                    int i = bufferedInputStream.read(bArr, 0, 1024);
                    if (i != -1) {
                        bufferedOutputStream.write(bArr, 0, i);
                    }
                }
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                arrayList.add(file4);
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static List<xd> c(Context context, boolean z, boolean z2, boolean z3, File file, File file2, File file3) {
        ArrayList arrayList = new ArrayList();
        if (!(!z || l(file2)) || !l(file)) {
            return arrayList;
        }
        ArrayList<File> arrayListB = b(file2, context.getFilesDir().getAbsolutePath());
        for (File file4 : b(file, context.getFilesDir().getAbsolutePath())) {
            String name = file4.getName();
            t5t.m("HMAgpsUpgradeManager", "file:" + file4.getPath() + ",name:" + name);
            if (name.equals("cep_pak.bin") && !z2) {
                arrayList.add(new xd(file4.getAbsolutePath(), yd.FIRMWARE_GPS_CEP));
            } else if (name.equals("gps_alm.bin")) {
                arrayList.add(new xd(file4.getAbsolutePath(), yd.FIRMWARE_GPS_ALM));
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: yjs
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return zjs.a((xd) obj, (xd) obj2);
            }
        });
        for (File file5 : arrayListB) {
            String name2 = file5.getName();
            t5t.m("HMAgpsUpgradeManager", "file:" + file5.getPath() + ",name:" + name2);
            if (name2.equals("gln_alm.bin")) {
                arrayList.add(new xd(file5.getAbsolutePath(), yd.FIRMWARE_GNS_ALM));
            } else if (name2.startsWith("cep_s_")) {
                d(file5);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (z2) {
            List<xd> listN = n(file3);
            t5t.d("HMAgpsUpgradeManager", "Sony LLE File[" + listN + "]");
            if (listN != null && !listN.isEmpty()) {
                arrayList2.addAll(listN);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (z3) {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(arrayList);
            arrayList4.addAll(arrayList2);
            arrayList3.add(eb.a(yd.FIRMWARE_AGPS_BATCH, arrayList4));
        } else {
            arrayList3.addAll(arrayList);
            if (!arrayList2.isEmpty()) {
                arrayList3.add(eb.a(yd.FIRMWARE_BATCH, arrayList2));
            }
        }
        return arrayList3;
    }

    public static void d(File file) {
        try {
            t5t.d("HMAgpsUpgradeManager", "Delete file " + file.getName() + ":" + file.delete());
        } catch (Exception e) {
            t5t.d("HMAgpsUpgradeManager", "Delete file exception:" + e.toString());
        }
    }

    public static void e(List<xd> list) {
        for (xd xdVar : list) {
            t5t.d("HMAgpsUpgradeManager", "Delete file " + xdVar.g() + " result:" + new File(xdVar.g()).delete());
        }
    }

    public static synchronized boolean f(final Context context, final ne neVar, final File file, final File file2, final File file3, final ISyncAgpsCallback iSyncAgpsCallback) {
        qd qdVarP = neVar.P();
        t5t.m("HMAgpsUpgradeManager", "checkAgpsUpgrade:" + qdVarP);
        if (!m(qdVarP)) {
            return false;
        }
        if (!neVar.V()) {
            t5t.d("HMAgpsUpgradeManager", "Ignore as no device connection!!!");
            return false;
        }
        if (!g(neVar)) {
            t5t.d("HMAgpsUpgradeManager", "Ignore as low battery!!!");
            return false;
        }
        f41387b.getAndSet(true);
        f41386a.execute(new Runnable() { // from class: xjs
            @Override // java.lang.Runnable
            public final void run() {
                zjs.o(context, neVar, file, file2, file3, iSyncAgpsCallback);
            }
        });
        return true;
    }

    public static boolean g(ne neVar) {
        ubt ubtVarB1;
        return (neVar == null || (ubtVarB1 = neVar.b1()) == null || ubtVarB1.j() <= 10) ? false : true;
    }

    public static boolean h(ne neVar, List<xd> list, jys jysVar) {
        int iJ = j(list);
        boolean z = false;
        jysVar.a(0);
        int length = 0;
        boolean z2 = true;
        for (xd xdVar : list) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            AtomicBoolean atomicBoolean = new AtomicBoolean(z);
            neVar.D0(xdVar, new b(atomicBoolean, countDownLatch, jysVar, iJ, length));
            try {
                countDownLatch.await();
            } catch (Exception e) {
                t5t.d("HMAgpsUpgradeManager", "agpsUpgrade alm exception:" + e.getMessage());
            }
            length += (int) new File(xdVar.g()).length();
            if (z2 && atomicBoolean.get()) {
                z2 = true;
                z = false;
            } else {
                z = false;
                z2 = false;
            }
        }
        jysVar.onFwStop(z2);
        return z2;
    }

    public static boolean i(qd qdVar) {
        for (qd qdVar2 : c) {
            if (qdVar == qdVar2) {
                return true;
            }
        }
        return false;
    }

    public static int j(List<xd> list) {
        Iterator<xd> it = list.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += (int) new File(it.next().g()).length();
        }
        return length;
    }

    public static boolean k(Context context, ne neVar, File file, File file2, File file3, ISyncAgpsCallback iSyncAgpsCallback) {
        g4s g4sVarO = neVar.O();
        if (g4sVarO == null) {
            t5t.d("HMAgpsUpgradeManager", " deviceInfo is null!!!");
            return false;
        }
        List<xd> listC = c(context, g4sVarO.A().hasSw(8), g4sVarO.A().hasSw(22), g4sVarO.A().hasBase(3), file, file2, file3);
        if (listC.size() <= 0) {
            t5t.d("HMAgpsUpgradeManager", "getAgpsFiles failed!!!");
            return false;
        }
        boolean zH = h(neVar, listC, new a(iSyncAgpsCallback));
        e(listC);
        return zH;
    }

    public static boolean l(File file) {
        return file != null && file.exists() && file.length() > 0;
    }

    public static boolean m(qd qdVar) {
        if (f41387b.get()) {
            t5t.d("HMAgpsUpgradeManager", "Ignore as running!!!");
            return false;
        }
        if (i(qdVar)) {
            return true;
        }
        t5t.d("HMAgpsUpgradeManager", "Ignore as not support:" + qdVar);
        return false;
    }

    public static List<xd> n(File file) {
        yd ydVar;
        ArrayList arrayList = new ArrayList();
        if (!l(file)) {
            return null;
        }
        ArrayList<File> arrayListB = b(file, file.getParent());
        if (!arrayListB.isEmpty()) {
            for (File file2 : arrayListB) {
                yd ydVar2 = yd.FIRMWARE_QUERY;
                if ("lle_bds.lle".equals(file2.getName())) {
                    ydVar = yd.FIRMWARE_GPS_SONY_LLE_BEIDOU;
                } else if ("lle_gps.lle".equals(file2.getName())) {
                    ydVar = yd.FIRMWARE_GPS_SONY_LLE_GPS;
                } else if ("lle_glo.lle".equals(file2.getName())) {
                    ydVar = yd.FIRMWARE_GPS_SONY_LLE_GLONASS;
                } else if ("lle_gal.lle".equals(file2.getName())) {
                    ydVar = yd.FIRMWARE_GPS_SONY_LLE_GALILEO;
                } else {
                    ydVar = "lle_qzss.lle".equals(file2.getName()) ? yd.FIRMWARE_GPS_SONY_LLE_QZSS : ydVar2;
                }
                if (ydVar != ydVar2) {
                    arrayList.add(new xd(file2.getAbsolutePath(), ydVar));
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void o(Context context, ne neVar, File file, File file2, File file3, ISyncAgpsCallback iSyncAgpsCallback) {
        k(context, neVar, file, file2, file3, iSyncAgpsCallback);
        f41387b.getAndSet(false);
    }
}
