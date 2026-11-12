package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import com.facebook.soloader.SysUtil;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bbq extends com.facebook.soloader.b {
    public final Context d;
    public String e;
    public sl9 f;
    public String[] g;
    public final Map<String, Object> h;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f4030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f4031b;
        public final /* synthetic */ c c;
        public final /* synthetic */ File d;
        public final /* synthetic */ sl9 e;
        public final /* synthetic */ Boolean f;

        public a(File file, byte[] bArr, c cVar, File file2, sl9 sl9Var, Boolean bool) {
            this.f4030a = file;
            this.f4031b = bArr;
            this.c = cVar;
            this.d = file2;
            this.e = sl9Var;
            this.f = bool;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(this.f4030a, "rw");
                    try {
                        randomAccessFile.write(this.f4031b);
                        randomAccessFile.setLength(randomAccessFile.getFilePointer());
                        randomAccessFile.close();
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(new File(bbq.this.f7609a, "dso_manifest"), "rw");
                        try {
                            this.c.b(randomAccessFile2);
                            randomAccessFile2.close();
                            SysUtil.f(bbq.this.f7609a);
                            bbq.y(this.d, (byte) 1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("releasing dso store lock for ");
                            sb.append(bbq.this.f7609a);
                            sb.append(" (from syncer thread)");
                            this.e.close();
                        } catch (Throwable th) {
                            try {
                                randomAccessFile2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (IOException e) {
                    if (!this.f.booleanValue()) {
                        throw new RuntimeException(e);
                    }
                }
            } catch (Throwable th5) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("releasing dso store lock for ");
                sb2.append(bbq.this.f7609a);
                sb2.append(" (from syncer thread)");
                this.e.close();
                throw th5;
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f4033b;

        public b(String str, String str2) {
            this.f4032a = str;
            this.f4033b = str2;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b[] f4034a;

        public c(b[] bVarArr) {
            this.f4034a = bVarArr;
        }

        public static final c a(DataInput dataInput) throws IOException {
            if (dataInput.readByte() != 1) {
                throw new RuntimeException("wrong dso manifest version");
            }
            int i = dataInput.readInt();
            if (i < 0) {
                throw new RuntimeException("illegal number of shared libraries");
            }
            b[] bVarArr = new b[i];
            for (int i2 = 0; i2 < i; i2++) {
                bVarArr[i2] = new b(dataInput.readUTF(), dataInput.readUTF());
            }
            return new c(bVarArr);
        }

        public final void b(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.f4034a.length);
            int i = 0;
            while (true) {
                b[] bVarArr = this.f4034a;
                if (i >= bVarArr.length) {
                    return;
                }
                dataOutput.writeUTF(bVarArr[i].f4032a);
                dataOutput.writeUTF(this.f4034a[i].f4033b);
                i++;
            }
        }
    }

    public interface d extends Closeable {
        void G(DataOutput dataOutput, byte[] bArr) throws IOException;

        b L();

        int available() throws IOException;

        String j();
    }

    public static abstract class e implements Closeable {
        public abstract boolean a();

        public abstract d b() throws IOException;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    public static class f implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f4035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InputStream f4036b;

        public f(b bVar, InputStream inputStream) {
            this.f4035a = bVar;
            this.f4036b = inputStream;
        }

        @Override // bbq.d
        public void G(DataOutput dataOutput, byte[] bArr) throws IOException {
            SysUtil.a(dataOutput, this.f4036b, Integer.MAX_VALUE, bArr);
        }

        @Override // bbq.d
        public b L() {
            return this.f4035a;
        }

        @Override // bbq.d
        public int available() throws IOException {
            return this.f4036b.available();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f4036b.close();
        }

        @Override // bbq.d
        public String j() {
            return this.f4035a.f4032a;
        }
    }

    public static abstract class g implements Closeable {
        public abstract c a() throws IOException;

        public abstract e b() throws IOException;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    public bbq(Context context, String str) {
        super(s(context, str), 1);
        this.h = new HashMap();
        this.d = context;
    }

    public static File s(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    public static void y(File file, byte b2) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b2);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (SyncFailedException unused) {
        }
    }

    @Override // com.facebook.soloader.b, defpackage.b4n
    public int a(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        int iH;
        synchronized (p(str)) {
            iH = h(str, i, this.f7609a, threadPolicy);
        }
        return iH;
    }

    @Override // defpackage.b4n
    public void b(int i) throws IOException {
        SysUtil.m(this.f7609a);
        sl9 sl9VarQ = q(new File(this.f7609a, "dso_lock"), true);
        if (this.f == null) {
            this.f = q(new File(this.f7609a, "dso_instance_lock"), false);
        }
        boolean zCanWrite = this.f7609a.canWrite();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("locked dso store ");
            sb.append(this.f7609a);
            if (!zCanWrite) {
                this.f7609a.setWritable(true);
            }
            if (v(sl9VarQ, i, o())) {
                sl9VarQ = null;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("dso store is up-to-date: ");
                sb2.append(this.f7609a);
            }
        } finally {
            if (!zCanWrite) {
                this.f7609a.setWritable(false);
            }
            if (sl9VarQ != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("releasing dso store lock for ");
                sb3.append(this.f7609a);
                sl9VarQ.close();
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("not releasing dso store lock for ");
                sb4.append(this.f7609a);
                sb4.append(" (syncer thread started)");
            }
        }
    }

    public final Runnable j(sl9 sl9Var, byte[] bArr, File file, File file2, c cVar, Boolean bool) {
        return new a(file2, bArr, cVar, file, sl9Var, bool);
    }

    public final void k(b[] bVarArr) throws IOException {
        String[] list = this.f7609a.list();
        if (list == null) {
            throw new IOException("unable to list directory " + this.f7609a);
        }
        for (String str : list) {
            if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_instance_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                boolean z = false;
                for (int i = 0; !z && i < bVarArr.length; i++) {
                    if (bVarArr[i].f4032a.equals(r(str))) {
                        z = true;
                    }
                }
                if (!z) {
                    File file = new File(this.f7609a, str);
                    StringBuilder sb = new StringBuilder();
                    sb.append("deleting unaccounted-for file ");
                    sb.append(file);
                    SysUtil.c(file);
                }
            }
        }
    }

    public boolean l(byte[] bArr, byte[] bArr2) {
        return !Arrays.equals(bArr, bArr2);
    }

    public final void m(d dVar, byte[] bArr) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("extracting DSO ");
        sb.append(dVar.L().f4032a);
        try {
            if (!this.f7609a.setWritable(true)) {
                throw new IOException("cannot make directory writable for us: " + this.f7609a);
            }
            n(dVar, bArr);
            if (this.f7609a.setWritable(false)) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("error removing ");
            sb2.append(this.f7609a.getCanonicalPath());
            sb2.append(" write permission");
        } catch (Throwable th) {
            if (!this.f7609a.setWritable(false)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("error removing ");
                sb3.append(this.f7609a.getCanonicalPath());
                sb3.append(" write permission");
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc  */
    public final void n(d dVar, byte[] bArr) throws IOException {
        RandomAccessFile randomAccessFile;
        File file = new File(this.f7609a, dVar.j());
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                if (file.exists() && !file.setWritable(true)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("error adding write permission to: ");
                    sb.append(file);
                }
                try {
                    randomAccessFile = new RandomAccessFile(file, "rw");
                } catch (IOException unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("error overwriting ");
                    sb2.append(file);
                    sb2.append(" trying to delete and start over");
                    SysUtil.c(file);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                }
                randomAccessFile2 = randomAccessFile;
                int iAvailable = dVar.available();
                if (iAvailable > 1) {
                    SysUtil.d(randomAccessFile2.getFD(), iAvailable);
                }
                dVar.G(randomAccessFile2, bArr);
                randomAccessFile2.setLength(randomAccessFile2.getFilePointer());
                if (!file.setExecutable(true, false)) {
                    throw new IOException("cannot make file executable: " + file);
                }
                if (!file.setWritable(false)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("error removing ");
                    sb3.append(file);
                    sb3.append(" write permission");
                }
                randomAccessFile2.close();
                return;
            } catch (IOException e2) {
                SysUtil.c(file);
                throw e2;
            }
        } catch (Throwable th) {
            if (!file.setWritable(false)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("error removing ");
                sb4.append(file);
                sb4.append(" write permission");
            }
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            throw th;
        }
        if (!file.setWritable(false)) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("error removing ");
            sb5.append(file);
            sb5.append(" write permission");
        }
        if (randomAccessFile2 != null) {
            randomAccessFile2.close();
        }
        throw th;
    }

    public byte[] o() throws IOException {
        Parcel parcelObtain = Parcel.obtain();
        g gVarT = t((byte) 1);
        try {
            b[] bVarArr = gVarT.a().f4034a;
            parcelObtain.writeByte((byte) 1);
            parcelObtain.writeInt(bVarArr.length);
            for (int i = 0; i < bVarArr.length; i++) {
                parcelObtain.writeString(bVarArr[i].f4032a);
                parcelObtain.writeString(bVarArr[i].f4033b);
            }
            gVarT.close();
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable th) {
            if (gVarT != null) {
                try {
                    gVarT.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final Object p(String str) {
        Object obj;
        synchronized (this.h) {
            try {
                obj = this.h.get(str);
                if (obj == null) {
                    obj = new Object();
                    this.h.put(str, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public sl9 q(File file, boolean z) throws IOException {
        return SysUtil.i(this.f7609a, file, z);
    }

    public String r(String str) {
        return str;
    }

    public abstract g t(byte b2) throws IOException;

    public synchronized void u(String str) throws IOException {
        synchronized (p(str)) {
            this.e = str;
            b(2);
        }
    }

    public boolean v(sl9 sl9Var, int i, byte[] bArr) throws IOException {
        byte b2;
        c cVarA;
        File file = new File(this.f7609a, "dso_state");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        try {
            b2 = randomAccessFile.readByte();
            if (b2 != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("dso store ");
                sb.append(this.f7609a);
                sb.append(" regeneration interrupted: wiping clean");
                b2 = 0;
            }
        } catch (EOFException unused) {
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        randomAccessFile.close();
        File file2 = new File(this.f7609a, "dso_deps");
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
        try {
            int length = (int) randomAccessFile2.length();
            byte[] bArr2 = new byte[length];
            if (randomAccessFile2.read(bArr2) != length) {
                b2 = 0;
            }
            if (l(bArr2, bArr)) {
                b2 = 0;
            }
            if (b2 == 0 || (i & 2) != 0) {
                y(file, (byte) 0);
                g gVarT = t(b2);
                try {
                    cVarA = gVarT.a();
                    e eVarB = gVarT.b();
                    try {
                        w(b2, cVarA, eVarB);
                        if (eVarB != null) {
                            eVarB.close();
                        }
                        gVarT.close();
                    } catch (Throwable th3) {
                        if (eVarB != null) {
                            try {
                                eVarB.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    if (gVarT != null) {
                        try {
                            gVarT.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                    }
                    throw th5;
                }
            } else {
                cVarA = null;
            }
            randomAccessFile2.close();
            if (cVarA == null) {
                return false;
            }
            Runnable runnableJ = j(sl9Var, bArr, file, file2, cVarA, Boolean.FALSE);
            if ((i & 1) != 0) {
                new Thread(runnableJ, "SoSync:" + this.f7609a.getName()).start();
            } else {
                runnableJ.run();
            }
            return true;
        } catch (Throwable th7) {
            try {
                randomAccessFile2.close();
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }

    public final void w(byte b2, c cVar, e eVar) throws IOException {
        c cVarA;
        StringBuilder sb = new StringBuilder();
        sb.append("regenerating DSO store ");
        sb.append(getClass().getName());
        RandomAccessFile randomAccessFile = new RandomAccessFile(new File(this.f7609a, "dso_manifest"), "rw");
        if (b2 == 1) {
            try {
                try {
                    cVarA = c.a(randomAccessFile);
                } catch (Exception unused) {
                    cVarA = null;
                }
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            cVarA = null;
        }
        if (cVarA == null) {
            cVarA = new c(new b[0]);
        }
        k(cVar.f4034a);
        byte[] bArr = new byte[32768];
        while (eVar.a()) {
            d dVarB = eVar.b();
            boolean z = true;
            int i = 0;
            while (z) {
                try {
                    if (i >= cVarA.f4034a.length) {
                        break;
                    }
                    if (cVarA.f4034a[i].f4032a.equals(dVarB.L().f4032a) && cVarA.f4034a[i].f4033b.equals(dVarB.L().f4033b)) {
                        z = false;
                    }
                    i++;
                } catch (Throwable th3) {
                    if (dVarB != null) {
                        try {
                            dVarB.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            }
            if (!new File(this.f7609a, dVarB.j()).exists() || z) {
                m(dVarB, bArr);
            }
            dVarB.close();
        }
        randomAccessFile.close();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Finished regenerating DSO store ");
        sb2.append(getClass().getName());
    }

    public void x(String[] strArr) {
        this.g = strArr;
    }
}
