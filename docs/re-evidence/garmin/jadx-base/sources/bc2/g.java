package bc2;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import bs2.b7;
import bs2.ck;
import ch.qos.logback.classic.Logger;
import com.garmin.android.lib.connectdevicesync.DeviceSyncService;
import com.garmin.android.lib.connectdevicesync.exception.ServerException;
import com.garmin.android.lib.connectdevicesync.exception.ServerProcessingTimeoutException;
import com.garmin.fit.FitRuntimeException;
import i3.e5;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import p13.h0;
import p13.j0;
import pk2.f0;
import wb2.g0;
import wb2.t0;

/* JADX INFO: loaded from: classes11.dex */
public class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static g f17438g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f17439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f17440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f17441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bc2.b f17442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bc2.a f17443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DeviceSyncService.a.C0989a f17444f;

    public enum a {
        DEFAULT,
        IMMEDIATE,
        GUARANTEED
    }

    public enum b {
        NO_SERVER_ENDPOINTS("Failed uploading file (%s). Unable to get the server endpoints for this unit (%d) and sub type (%d) combination."),
        INVALID_INPUT_FILE("Failed uploading file (%s). Invalid input file."),
        INVALID_SERVER_ENDPOINT("Invalid server endpoint (%s)"),
        INVALID_USER_CREDENTIAL("Failed uploading files. Invalid user credential."),
        INVALID_FILE_DESCRIPTOR("Failed uploading file (%s). Invalid remote device ID (%d), fileType (%d), or fileSubType (%d)."),
        SERVER_PROCESS_TOO_LONG("Failed uploading file. Server took too long to process the uploaded file (%s)."),
        STATUS_CHECK_NEEDED("File (%s) was uploaded but not yet processed. Will check status at %s in %d milliseconds."),
        FILE_SKIPPED_EMPTY("File (%s) is skipped. Reason=%d (Empty content)."),
        FILE_SKIPPED_PREVIOUSLY_UPLOADED("File (%s) is skipped. Reason=%d (Previously uploaded)."),
        FILE_UPLOADED_WITH_CAVEAT("File (%s) was uploaded with a caveat. Reason=%d."),
        UNABLE_TO_PROCESS_FILE("Server is not able to process the uploaded file (%s). Reason=%d."),
        SERVER_PROCESS_TIMEOUT("File (%s) was uploaded and awaiting processing. Reason=%d (%s)"),
        GC_EXCEPTION("Failed uploading file (%s). Reason=%d (%s)."),
        NO_NETWORK_CONNECTIVITY("Failed uploading file (%s). Reason=No network connectivity.");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17464a;

        b(String str) {
            this.f17464a = str;
        }
    }

    private g(Context context) {
        this.f17441c = new c(context);
        this.f17442d = new bc2.b(context);
        bc2.a aVar = ec2.e.f63800h;
        this.f17443e = aVar;
        if (aVar != null) {
            aVar.d(context);
        }
        this.f17440b = e.a(context);
        int i14 = gt2.c.f79010a;
        this.f17439a = gt2.b.f79005a.i("SYNC#UploadManager");
    }

    public static g a(Context context) {
        if (f17438g == null) {
            f17438g = new g(context);
        }
        return f17438g;
    }

    public final Set<String> b(long j8) {
        List<String> list;
        Object next;
        List listB1;
        Collection<String> collection;
        e eVar = this.f17440b;
        eVar.getClass();
        List<String> listQ = null;
        Set<String> set = (Set) ge1.b.W(t13.h.f161748a, new f(eVar, j8, null));
        if (set == null || set.size() == 0) {
            StringBuilder sb3 = new StringBuilder();
            e5.s(j8, b.NO_SERVER_ENDPOINTS.f17464a, " (", sb3);
            sb3.append(")");
            wb2.h hVarC = eVar.c(j8);
            String str = hVarC.f184020c;
            if (str != null && !TextUtils.isEmpty(str)) {
                sb3.append("; ");
                sb3.append(str);
            }
            int i14 = hVarC.f184019b;
            wb2.h hVar = wb2.h.NO_RESPONSE_ON_UPLOAD_CONFIG;
            if (i14 == hVar.f184019b) {
                throw new ServerException(hVar, sb3.toString());
            }
            throw new ServerException(wb2.h.SERVER_ENDPOINTS_NOT_FOUND, sb3.toString());
        }
        DeviceSyncService.a.C0989a c0989a = this.f17444f;
        if (c0989a != null) {
            try {
                listQ = c0989a.f49915a.Q(j8);
            } catch (RemoteException unused) {
            }
            if (listQ != null && listQ.size() > 0) {
                set.removeAll(listQ);
            }
        } else {
            Iterator<T> it = ((il2.e) ec2.e.b()).f94039a.f132627g.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((f0) next) instanceof gl2.a));
            gl2.a aVar = next instanceof gl2.a ? (gl2.a) next : null;
            if (aVar == null || (collection = aVar.f77883e) == null || (listB1 = h0.b1(collection)) == null) {
                listB1 = j0.f134944a;
            }
            if (listB1 != null && listB1.size() > 0) {
                set.removeAll(listB1);
            }
        }
        il2.e eVar2 = (il2.e) ec2.e.b();
        synchronized (eVar2.f94043e) {
            list = eVar2.f94043e.get(Long.valueOf(j8));
        }
        if (list != null && list.size() > 0) {
            set.retainAll(list);
        }
        return set;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21, types: [bs2.b7] */
    /* JADX WARN: Type inference failed for: r2v22, types: [wb2.r0] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r9v18, types: [bc2.h] */
    /* JADX WARN: Type inference failed for: r9v7, types: [bc2.h] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final h c(long j8, File file, t0 t0Var, a aVar, g0 g0Var) {
        wb2.h hVar;
        hy2.c cVar;
        hc2.a aVar2;
        FileInputStream fileInputStream;
        hc2.e eVar;
        byte b14 = t0Var.f184146f;
        byte b15 = t0Var.f184147g;
        String strB = this.f17440b.b(g0Var, j8, b14, b15);
        boolean zIsFile = file.isFile();
        Logger logger = this.f17439a;
        if (!zIsFile) {
            String str = String.format(b.INVALID_INPUT_FILE.f17464a, file.getName());
            logger.debug(str);
            throw new ServerException(wb2.h.TEMP_FILE_READ_FAILED, str);
        }
        if (TextUtils.isEmpty(strB)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(String.format(b.NO_SERVER_ENDPOINTS.f17464a, file.getAbsolutePath(), Long.valueOf(j8), Byte.valueOf(b15)));
            String str2 = this.f17440b.c(j8).f184020c;
            if (str2 != null && !TextUtils.isEmpty(str2)) {
                sb3.append(StringUtils.SPACE);
                sb3.append(str2);
            }
            logger.error(sb3.toString());
            throw new ServerException(wb2.h.SERVER_ENDPOINTS_NOT_FOUND, sb3.toString());
        }
        bc2.a aVar3 = this.f17443e;
        hc2.e eVarC = aVar3 != null ? aVar3.c(t0Var) : null;
        if (eVarC == null) {
            if (aVar != a.IMMEDIATE) {
                bc2.b bVar = this.f17442d;
                bVar.getClass();
                return bVar.j(j8, file, strB, t0Var.f184146f, t0Var.f184147g, t0Var.f184156p);
            }
            c cVar2 = this.f17441c;
            cVar2.getClass();
            byte b16 = t0Var.f184146f;
            byte b17 = t0Var.f184147g;
            boolean z14 = t0Var.f184156p;
            Logger logger2 = cVar2.f17420a;
            cVar2.h(file, strB);
            if (!((il2.e) ec2.e.b()).p()) {
                String str3 = b.INVALID_USER_CREDENTIAL.f17464a;
                logger2.debug(str3);
                throw new ServerException(wb2.h.INVALID_USER_CREDENTIAL, str3);
            }
            h hVarF = cVar2.f(file, strB, b16, b17, z14, j8, null);
            hVarF.b();
            if (!hVarF.f()) {
                try {
                    h hVarD = cVar2.d(hVarF, cVar2.f17422c, file.getName(), j8);
                    cVar2.a(file);
                    return hVarD;
                } catch (ServerProcessingTimeoutException e4) {
                    cVar2.a(file);
                    throw e4;
                }
            }
            wb2.h hVar2 = wb2.h.SERVER_FAILURE_RESPONSE_RECEIVED;
            b bVar2 = b.GC_EXCEPTION;
            String str4 = String.format(bVar2.f17464a, d.b(file.getName()), Integer.valueOf(hVarF.e()), hVarF.c());
            if (hVarF.c() == null || (cVar = hVarF.f184118e) == null || !cVar.a()) {
                hVar = hVar2;
            } else {
                hVar = wb2.h.NO_NETWORK_CONNECTIVITY;
                str4 = b.NO_NETWORK_CONNECTIVITY.f17464a;
            }
            logger2.error(str4);
            if (hVar == hVar2) {
                str4 = String.format(bVar2.f17464a, hVarF.f17465h, Integer.valueOf(hVarF.e()), hVarF.c());
            }
            cVar2.a(file);
            throw new ServerException(hVar, str4);
        }
        byte b18 = t0Var.f184146f;
        byte b19 = t0Var.f184147g;
        Logger logger3 = eVarC.f17420a;
        logger3.debug("Uploading file from original path: " + file.getAbsolutePath());
        h hVar3 = new h();
        hVar3.h(strB);
        if (!(file instanceof hc2.a)) {
            logger3.error("Invalid File object passed to uploadFile.   Should have been a GolfSwingFile");
            return hVar3;
        }
        hc2.a aVar4 = (hc2.a) file;
        String absolutePath = aVar4.getAbsolutePath();
        int iLastIndexOf = absolutePath.lastIndexOf(File.separatorChar);
        if (iLastIndexOf != -1) {
            if (absolutePath.substring(0, iLastIndexOf).equals(eVarC.f17421b.getFilesDir() + "/cache/truswing")) {
                aVar2 = aVar4;
            } else {
                hc2.a aVar5 = new hc2.a(eVarC.f17421b.getFilesDir() + "/cache/truswing", aVar4.getName());
                if (aVar4.f83280a) {
                    logger3.debug("File is a swing sensor file.");
                    aVar5.f83280a = true;
                } else {
                    logger3.debug("File is a swing sensor remote file");
                    aVar5.f83280a = false;
                }
                if (dz2.d.a(aVar4, aVar5)) {
                    aVar4.delete();
                    aVar2 = aVar5;
                } else {
                    aVar2 = aVar4;
                }
            }
        } else {
            aVar2 = aVar4;
        }
        logger3.debug("Received request to upload swing data file: " + aVar2.getAbsolutePath());
        ?? b7Var = new b7();
        ck ckVar = new ck(b7Var);
        try {
            as1.b bVarG = ((hc2.f) ec2.e.f63800h).g();
            bVarG.f12682a = aVar2;
            try {
                fileInputStream = new FileInputStream(aVar2);
            } catch (IOException e14) {
                logger3.error("Unable to open file " + aVar2.getName(), (Throwable) e14);
                fileInputStream = null;
            }
            try {
                if (fileInputStream == null) {
                    logger3.error("Unable to open input file " + aVar2.getName());
                    return hVar3;
                }
                try {
                    try {
                        if (!b7Var.b(fileInputStream)) {
                            try {
                                logger3.error("FIT file integrity failed " + aVar2.getName());
                                throw new RuntimeException("FIT file integrity failed");
                            } catch (RuntimeException e15) {
                                e = e15;
                                logger3.error("Exception Checking File Integrity " + aVar2.getName(), (Throwable) e);
                                fileInputStream.close();
                                b7Var = hVar3;
                                return b7Var;
                            }
                        }
                        try {
                            fileInputStream.close();
                        } catch (IOException unused) {
                        }
                        StringBuilder sb4 = new StringBuilder("Validated integrity of file ");
                        String name = aVar2.getName();
                        sb4.append(name);
                        logger3.debug(sb4.toString());
                        try {
                            fileInputStream = new FileInputStream(aVar2);
                            b7Var = name;
                        } catch (IOException e16) {
                            String str5 = "Unable to open file " + aVar2.getName();
                            logger3.error(str5, (Throwable) e16);
                            b7Var = str5;
                        }
                        ckVar.V2.add(bVarG);
                        try {
                            try {
                                ckVar.c(fileInputStream);
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused2) {
                                }
                                logger3.debug("Finished parsing swing file " + aVar2.getName());
                                ArrayList arrayList = bVarG.f12683b;
                                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                    hc2.c.c().f((hc2.b) arrayList.get(i14));
                                }
                                logger3.debug("Number of swings in file " + aVar2.getName() + "(" + arrayList.size() + ")");
                                if (arrayList.size() == 1) {
                                    try {
                                        logger3.debug("Handling single swing file " + aVar2.getName());
                                        return eVarC.j(aVar2, (hc2.b) arrayList.get(0), strB, b18, b19, hVar3);
                                    } catch (Exception e17) {
                                        logger3.error("Failed to handle uploading swing file " + aVar2.getName(), (Throwable) e17);
                                    }
                                } else {
                                    logger3.debug("Immediately uploading multi-swing file " + aVar2.getName());
                                    File file2 = new File(eVar.f17421b.getFilesDir() + "/upload/truswing", aVar2.getName().toLowerCase());
                                    if (dz2.d.a(aVar2, file2)) {
                                        eVar = eVarC;
                                        return eVar.k(file2, strB, b18, b19, hVar3);
                                    }
                                }
                                eVar = eVarC;
                                b7Var = hVar3;
                            } catch (FitRuntimeException e18) {
                                b7Var = hVar3;
                                logger3.error("Error decoding file " + aVar2.getName(), (Throwable) e18);
                                fileInputStream.close();
                            }
                        } catch (Throwable th3) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused3) {
                            }
                            throw th3;
                        }
                    } catch (RuntimeException e19) {
                        e = e19;
                    }
                } catch (Throwable th4) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused4) {
                    }
                    throw th4;
                }
            } catch (IOException unused5) {
            }
        } catch (Exception e24) {
            b7Var = hVar3;
            logger3.error("Something went wrong associating Golf Swing file", (Throwable) e24);
            b7Var.f184117d = e24;
        }
        return b7Var;
    }
}
