package hl0;

import android.app.DownloadManager;
import android.os.ParcelFileDescriptor;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lhl0/a;", "", "Landroid/app/DownloadManager;", "downloadManager", "<init>", "(Landroid/app/DownloadManager;)V", "a", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DownloadManager f84258a;

    static {
        new C1673a(null);
    }

    public a(DownloadManager downloadManager) {
        downloadManager.getClass();
        this.f84258a = downloadManager;
    }

    public static final void a(a aVar, sd2.h hVar) {
        aVar.getClass();
        a2 a2Var = a2.GOLF;
        String str = "broadcastDatabaseContentChanged: course layout ID=" + hVar.f158663f + ", status enum ID=" + hVar.f158678w;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "GolfCourseDownloadViewModel", str);
        Integer num = hVar.f158663f;
        num.getClass();
        int iIntValue = num.intValue();
        Integer num2 = hVar.f158678w;
        num2.getClass();
        ol0.a aVar2 = new ol0.a(iIntValue, num2.intValue());
        oi2.a.f132270a.getClass();
        l73.c.b().e(aVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.os.ParcelFileDescriptor$AutoCloseInputStream] */
    public static final byte[] b(a aVar, DownloadManager downloadManager, long j8) throws Throwable {
        ?? r14;
        Throwable th3;
        ?? r15;
        ByteArrayOutputStream byteArrayOutputStream;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream2;
        aVar.getClass();
        byte[] byteArray = null;
        try {
            try {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream3 = new ParcelFileDescriptor.AutoCloseInputStream(downloadManager.openDownloadedFile(j8));
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream(3072);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i14 = autoCloseInputStream3.read(bArr, 0, 1024);
                            if (i14 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i14);
                        }
                        byteArrayOutputStream.flush();
                        byteArray = byteArrayOutputStream.toByteArray();
                        autoCloseInputStream2 = autoCloseInputStream3;
                    } catch (IOException e4) {
                        e = e4;
                        autoCloseInputStream = autoCloseInputStream3;
                        a2 a2Var = a2.GOLF;
                        i2.f36769a.getClass();
                        i2.a.g(a2Var, "GolfCourseDownloadViewModel", e);
                        autoCloseInputStream2 = autoCloseInputStream;
                    }
                } catch (IOException e14) {
                    e = e14;
                    byteArrayOutputStream = null;
                    autoCloseInputStream = autoCloseInputStream3;
                } catch (Throwable th4) {
                    r15 = 0;
                    th3 = th4;
                    r14 = autoCloseInputStream3;
                    c(r14);
                    d(r15);
                    throw th3;
                }
            } catch (Throwable th5) {
                th3 = th5;
                r15 = downloadManager;
                r14 = j8;
            }
        } catch (IOException e15) {
            e = e15;
            byteArrayOutputStream = null;
            autoCloseInputStream = null;
        } catch (Throwable th6) {
            r14 = 0;
            th3 = th6;
            r15 = 0;
        }
        c(autoCloseInputStream2);
        d(byteArrayOutputStream);
        return byteArray;
    }

    public static void c(ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream) {
        if (autoCloseInputStream != null) {
            try {
                autoCloseInputStream.close();
            } catch (IOException e4) {
                a2 a2Var = a2.GOLF;
                String strN = fb1.c.n("closeQuietly: ", e4.getMessage());
                i2.f36769a.getClass();
                i2.a.f(a2Var, "GolfCourseDownloadViewModel", strN);
            }
        }
    }

    public static void d(ByteArrayOutputStream byteArrayOutputStream) {
        if (byteArrayOutputStream != null) {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e4) {
                a2 a2Var = a2.GOLF;
                String strN = fb1.c.n("closeQuietly: ", e4.getMessage());
                i2.f36769a.getClass();
                i2.a.f(a2Var, "GolfCourseDownloadViewModel", strN);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(v13.c cVar) throws Throwable {
        c cVar2;
        Iterator it;
        int i14;
        LinkedHashMap linkedHashMap;
        Long lM;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i15 = cVar2.f84269f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                cVar2.f84269f = i15 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object obj = cVar2.f84267d;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = cVar2.f84269f;
        if (i16 == 0) {
            o13.r.b(obj);
            rd2.l.e().getClass();
            LinkedHashMap linkedHashMapF = rd2.l.f();
            Set setKeySet = linkedHashMapF.keySet();
            setKeySet.getClass();
            it = setKeySet.iterator();
            i14 = 0;
            linkedHashMap = linkedHashMapF;
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = cVar2.f84266c;
            it = cVar2.f84265b;
            linkedHashMap = cVar2.f84264a;
            o13.r.b(obj);
        }
        while (it.hasNext()) {
            sd2.i iVar = (sd2.i) linkedHashMap.get((Integer) it.next());
            if (iVar != null && (lM = iVar.m()) != null) {
                long jLongValue = lM.longValue();
                cVar2.f84264a = linkedHashMap;
                cVar2.f84265b = it;
                cVar2.f84266c = i14;
                cVar2.f84269f = 1;
                x53.c cVar3 = s0.f129406a;
                Object objE0 = ge1.b.e0(x53.b.f189152a, new b(jLongValue, this, null), cVar2);
                if (objE0 != u13.a.COROUTINE_SUSPENDED) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 == obj2) {
                    return obj2;
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: hl0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhl0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1673a {
        public /* synthetic */ C1673a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1673a() {
        }
    }
}
