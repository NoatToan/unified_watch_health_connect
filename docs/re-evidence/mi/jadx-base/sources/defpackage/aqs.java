package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.fitness.repo.RepositoryManager;
import com.xiaomi.push.i;
import com.xiaomi.push.ib;
import com.xiaomi.push.id;
import com.xiaomi.push.ig;
import com.xiaomi.push.ij;
import com.xiaomi.push.il;
import com.xiaomi.push.iu;
import com.xiaomi.push.ja;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class aqs extends k5s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f3367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharedPreferences f3368b;
    public vas c;

    public aqs(Context context) {
        this.f3367a = context;
        this.f3368b = context.getSharedPreferences("mipush_extra", 0);
        this.c = vas.d(context);
    }

    private boolean e() {
        if (obs.y(this.f3367a)) {
            return false;
        }
        if ((obs.A(this.f3367a) || obs.z(this.f3367a)) && !g()) {
            return true;
        }
        return (obs.B(this.f3367a) && !f()) || obs.C(this.f3367a);
    }

    private boolean f() {
        if (!this.c.m(ig.Upload3GSwitch.a(), true)) {
            return false;
        }
        return Math.abs((System.currentTimeMillis() / 1000) - this.f3368b.getLong("last_upload_data_timestamp", -1L)) > ((long) Math.max(RepositoryManager.GAP_A_DAY, this.c.a(ig.Upload3GFrequency.a(), 432000)));
    }

    private boolean g() {
        if (!this.c.m(ig.Upload4GSwitch.a(), true)) {
            return false;
        }
        return Math.abs((System.currentTimeMillis() / 1000) - this.f3368b.getLong("last_upload_data_timestamp", -1L)) > ((long) Math.max(RepositoryManager.GAP_A_DAY, this.c.a(ig.Upload4GFrequency.a(), 259200)));
    }

    @Override // k5s.a
    public String a() {
        return "1";
    }

    public final List<ij> b(File file) {
        RandomAccessFile randomAccessFile;
        FileInputStream fileInputStream;
        jps jpsVarA = mps.b().a();
        String strA = jpsVarA == null ? "" : jpsVarA.a();
        FileLock fileLock = null;
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[4];
        synchronized (sps.f33873a) {
            try {
                try {
                    File file2 = new File(this.f3367a.getFilesDir(), "push_cdata.lock");
                    mgt.f(file2);
                    randomAccessFile = new RandomAccessFile(file2, "rw");
                    try {
                        FileLock fileLockLock = randomAccessFile.getChannel().lock();
                        try {
                            fileInputStream = new FileInputStream(file);
                            while (fileInputStream.read(bArr) == 4) {
                                try {
                                    int iA = j4s.a(bArr);
                                    byte[] bArr2 = new byte[iA];
                                    if (fileInputStream.read(bArr2) != iA) {
                                        break;
                                    }
                                    byte[] bArrC = qps.c(strA, bArr2);
                                    if (bArrC != null && bArrC.length != 0) {
                                        ij ijVar = new ij();
                                        i.d(ijVar, bArrC);
                                        arrayList.add(ijVar);
                                        d(ijVar);
                                    }
                                } catch (Exception unused) {
                                    fileLock = fileLockLock;
                                    if (fileLock != null && fileLock.isValid()) {
                                        try {
                                            fileLock.release();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    mgt.b(fileInputStream);
                                } catch (Throwable th) {
                                    th = th;
                                    fileLock = fileLockLock;
                                    if (fileLock != null && fileLock.isValid()) {
                                        try {
                                            fileLock.release();
                                        } catch (IOException unused3) {
                                        }
                                    }
                                    mgt.b(fileInputStream);
                                    mgt.b(randomAccessFile);
                                    throw th;
                                }
                            }
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException unused4) {
                                }
                            }
                            mgt.b(fileInputStream);
                        } catch (Exception unused5) {
                            fileInputStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = null;
                        }
                    } catch (Exception unused6) {
                        fileInputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream = null;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            } catch (Exception unused7) {
                randomAccessFile = null;
                fileInputStream = null;
            } catch (Throwable th5) {
                th = th5;
                randomAccessFile = null;
                fileInputStream = null;
            }
            mgt.b(randomAccessFile);
        }
        return arrayList;
    }

    public final void c() {
        SharedPreferences.Editor editorEdit = this.f3368b.edit();
        editorEdit.putLong("last_upload_data_timestamp", System.currentTimeMillis() / 1000);
        editorEdit.commit();
    }

    public final void d(ij ijVar) {
        if (ijVar.f116a != id.AppInstallList || ijVar.f117a.startsWith("same_")) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f3368b.edit();
        editorEdit.putLong("dc_job_result_time_4", ijVar.f115a);
        editorEdit.putString("dc_job_result_4", qcs.b(ijVar.f117a));
        editorEdit.commit();
    }

    @Override // java.lang.Runnable
    public void run() {
        File file = new File(this.f3367a.getFilesDir(), "push_cdata.data");
        if (!obs.x(this.f3367a)) {
            if (file.length() > 1863680) {
                file.delete();
                return;
            }
            return;
        }
        if (!e() && file.exists()) {
            List<ij> listB = b(file);
            if (!m4s.a(listB)) {
                int size = listB.size();
                if (size > 4000) {
                    listB = listB.subList(size - 4000, size);
                }
                iu iuVar = new iu();
                iuVar.a(listB);
                byte[] bArrH = mgt.h(i.e(iuVar));
                ja jaVar = new ja("-1", false);
                jaVar.c(il.DataCollection.f125a);
                jaVar.a(bArrH);
                jps jpsVarA = mps.b().a();
                if (jpsVarA != null) {
                    jpsVarA.a(jaVar, ib.Notification, null);
                }
                c();
            }
            file.delete();
        }
    }
}
