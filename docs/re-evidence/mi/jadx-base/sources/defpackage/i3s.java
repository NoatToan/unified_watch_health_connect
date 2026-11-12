package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.Base64;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes7.dex */
public class i3s implements lsc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f20750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<String, ArrayList<g3s>> f20751b;

    public i3s(Context context) {
        f(context);
    }

    public static String d(g3s g3sVar) {
        return String.valueOf(g3sVar.f18566a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0037 A[PHI: r2 r3 r4
      0x0037: PHI (r2v11 java.nio.channels.FileLock) = (r2v4 java.nio.channels.FileLock), (r2v2 java.nio.channels.FileLock), (r2v2 java.nio.channels.FileLock) binds: [B:68:0x010b, B:32:0x0092, B:19:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r3v15 java.io.RandomAccessFile) = (r3v4 java.io.RandomAccessFile), (r3v2 java.io.RandomAccessFile), (r3v2 java.io.RandomAccessFile) binds: [B:68:0x010b, B:32:0x0092, B:19:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r4v9 java.io.File) = (r4v3 java.io.File), (r4v1 java.io.File), (r4v1 java.io.File) binds: [B:68:0x010b, B:32:0x0092, B:19:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.wes
    public void a() throws Throwable {
        ifs.c(this.f20750a, "event", "eventUploading");
        File[] fileArrF = ifs.f(this.f20750a, "eventUploading");
        if (fileArrF == null || fileArrF.length <= 0) {
            return;
        }
        FileLock fileLockLock = null;
        File file = null;
        RandomAccessFile randomAccessFile = null;
        for (File file2 : fileArrF) {
            if (file2 == null) {
                if (fileLockLock != null && fileLockLock.isValid()) {
                    try {
                        fileLockLock.release();
                    } catch (IOException e) {
                        x9s.s(e);
                    }
                }
                mgt.b(randomAccessFile);
                if (file != null) {
                    file.delete();
                }
            } else {
                try {
                    try {
                        if (file2.length() > 5242880) {
                            x9s.D("eventData read from cache file failed because " + file2.getName() + " is too big, length " + file2.length());
                            h(file2.getName(), Formatter.formatFileSize(this.f20750a, file2.length()));
                            file2.delete();
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException e2) {
                                    x9s.s(e2);
                                }
                            }
                            mgt.b(randomAccessFile);
                            if (file != null) {
                                file.delete();
                            }
                        } else {
                            String absolutePath = file2.getAbsolutePath();
                            File file3 = new File(absolutePath + ".lock");
                            try {
                                mgt.f(file3);
                                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file3, "rw");
                                try {
                                    fileLockLock = randomAccessFile2.getChannel().lock();
                                    i(e(absolutePath));
                                    file2.delete();
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException e3) {
                                            x9s.s(e3);
                                        }
                                    }
                                    mgt.b(randomAccessFile2);
                                    file3.delete();
                                    randomAccessFile = randomAccessFile2;
                                    file = file3;
                                } catch (Exception e4) {
                                    e = e4;
                                    randomAccessFile = randomAccessFile2;
                                    file = file3;
                                    x9s.s(e);
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException e5) {
                                            x9s.s(e5);
                                        }
                                    }
                                    mgt.b(randomAccessFile);
                                    if (file != null) {
                                        file.delete();
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    randomAccessFile = randomAccessFile2;
                                    file = file3;
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException e6) {
                                            x9s.s(e6);
                                        }
                                    }
                                    mgt.b(randomAccessFile);
                                    if (file == null) {
                                        throw th;
                                    }
                                    file.delete();
                                    throw th;
                                }
                            } catch (Exception e7) {
                                e = e7;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e8) {
                    e = e8;
                }
            }
        }
    }

    @Override // defpackage.fjs
    public void b() throws Throwable {
        HashMap<String, ArrayList<g3s>> map = this.f20751b;
        if (map == null) {
            return;
        }
        if (map.size() > 0) {
            Iterator<String> it = this.f20751b.keySet().iterator();
            while (it.hasNext()) {
                ArrayList<g3s> arrayList = this.f20751b.get(it.next());
                if (arrayList != null && arrayList.size() > 0) {
                    g3s[] g3sVarArr = new g3s[arrayList.size()];
                    arrayList.toArray(g3sVarArr);
                    j(g3sVarArr);
                }
            }
        }
        this.f20751b.clear();
    }

    @Override // defpackage.fjs
    public void c(g3s g3sVar) {
        if ((g3sVar instanceof od8) && this.f20751b != null) {
            od8 od8Var = (od8) g3sVar;
            String strD = d(od8Var);
            ArrayList<g3s> arrayList = this.f20751b.get(strD);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(od8Var);
            this.f20751b.put(strD, arrayList);
        }
    }

    public final List<String> e(String str) throws Throwable {
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(str));
                while (true) {
                    try {
                        int i = fileInputStream2.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        if (i == 4) {
                            if (j4s.a(bArr) == -573785174) {
                                int i2 = fileInputStream2.read(bArr2);
                                if (i2 == -1) {
                                    break;
                                }
                                if (i2 != 4) {
                                    x9s.D("eventData read from cache file failed cause lengthBuffer error");
                                    break;
                                }
                                int iA = j4s.a(bArr2);
                                if (iA < 1 || iA > 4096) {
                                    x9s.D("eventData read from cache file failed cause lengthBuffer < 1 || lengthBuffer > 4K");
                                    break;
                                }
                                byte[] bArr3 = new byte[iA];
                                if (fileInputStream2.read(bArr3) != iA) {
                                    x9s.D("eventData read from cache file failed cause buffer size not equal length");
                                    break;
                                }
                                String strM = m(bArr3);
                                if (!TextUtils.isEmpty(strM)) {
                                    arrayList.add(strM);
                                }
                            } else {
                                x9s.D("eventData read from cache file failed because magicNumber error");
                                break;
                            }
                        } else {
                            x9s.D("eventData read from cache file failed because magicNumber error");
                            break;
                        }
                    } catch (Exception e) {
                        e = e;
                        fileInputStream = fileInputStream2;
                        x9s.s(e);
                        mgt.b(fileInputStream);
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        mgt.b(fileInputStream);
                        throw th;
                    }
                }
                mgt.b(fileInputStream2);
            } catch (Exception e2) {
                e = e2;
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void f(Context context) {
        this.f20750a = context;
    }

    public final void g(RandomAccessFile randomAccessFile, FileLock fileLock) {
        if (fileLock != null && fileLock.isValid()) {
            try {
                fileLock.release();
            } catch (IOException e) {
                x9s.s(e);
            }
        }
        mgt.b(randomAccessFile);
    }

    public final void h(String str, String str2) {
        od8 od8VarD = h3s.e(this.f20750a).d(5001, "24:" + str + "," + str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(od8VarD.d());
        i(arrayList);
    }

    public void i(List<String> list) {
        throw null;
    }

    public void j(g3s[] g3sVarArr) throws Throwable {
        if (g3sVarArr == null || g3sVarArr.length == 0 || g3sVarArr[0] == null) {
            x9s.o("event data write to cache file failed because data null");
            return;
        }
        do {
            g3sVarArr = k(g3sVarArr);
            if (g3sVarArr == null || g3sVarArr.length <= 0) {
                return;
            }
        } while (g3sVarArr[0] != null);
    }

    public final g3s[] k(g3s[] g3sVarArr) throws Throwable {
        FileLock fileLockLock;
        RandomAccessFile randomAccessFile;
        BufferedOutputStream bufferedOutputStream;
        String strL = l(g3sVarArr[0]);
        BufferedOutputStream bufferedOutputStream2 = null;
        if (TextUtils.isEmpty(strL)) {
            return null;
        }
        try {
            File file = new File(strL + ".lock");
            mgt.f(file);
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileLockLock = randomAccessFile.getChannel().lock();
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(strL), true));
                    try {
                        try {
                            int i = 0;
                            for (g3s g3sVar : g3sVarArr) {
                                if (g3sVar != null) {
                                    byte[] bArrN = n(g3sVar.d());
                                    if (bArrN == null || bArrN.length < 1 || bArrN.length > 4096) {
                                        x9s.D("event data throw a invalid item ");
                                    } else {
                                        if (!ifs.d(this.f20750a, strL)) {
                                            int length = g3sVarArr.length - i;
                                            g3s[] g3sVarArr2 = new g3s[length];
                                            System.arraycopy(g3sVarArr, i, g3sVarArr2, 0, length);
                                            mgt.b(bufferedOutputStream);
                                            g(randomAccessFile, fileLockLock);
                                            return g3sVarArr2;
                                        }
                                        bufferedOutputStream.write(j4s.b(-573785174));
                                        bufferedOutputStream.write(j4s.b(bArrN.length));
                                        bufferedOutputStream.write(bArrN);
                                        bufferedOutputStream.flush();
                                        i++;
                                    }
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            x9s.q("event data write to cache file failed cause exception", e);
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream2 = bufferedOutputStream;
                        mgt.b(bufferedOutputStream2);
                        g(randomAccessFile, fileLockLock);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    bufferedOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    mgt.b(bufferedOutputStream2);
                    g(randomAccessFile, fileLockLock);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                fileLockLock = null;
                bufferedOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileLockLock = null;
            }
        } catch (Exception e4) {
            e = e4;
            fileLockLock = null;
            randomAccessFile = null;
            bufferedOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileLockLock = null;
            randomAccessFile = null;
        }
        mgt.b(bufferedOutputStream);
        g(randomAccessFile, fileLockLock);
        return null;
    }

    public final String l(g3s g3sVar) {
        File file = new File(this.f20750a.getFilesDir(), "event");
        String str = file.getAbsolutePath() + File.separator + d(g3sVar);
        for (int i = 0; i < 100; i++) {
            String str2 = str + i;
            if (ifs.d(this.f20750a, str2)) {
                return str2;
            }
        }
        return null;
    }

    public String m(byte[] bArr) {
        byte[] bArrE;
        if (bArr != null && bArr.length >= 1) {
            if (!h3s.e(this.f20750a).c().f()) {
                return qcs.l(bArr);
            }
            String strB = ifs.b(this.f20750a);
            if (!TextUtils.isEmpty(strB) && (bArrE = ifs.e(strB)) != null && bArrE.length > 0) {
                try {
                    return qcs.l(Base64.decode(hxs.b(bArrE, bArr), 2));
                } catch (InvalidAlgorithmParameterException e) {
                    x9s.s(e);
                } catch (InvalidKeyException e2) {
                    x9s.s(e2);
                } catch (NoSuchAlgorithmException e3) {
                    x9s.s(e3);
                } catch (BadPaddingException e4) {
                    x9s.s(e4);
                } catch (IllegalBlockSizeException e5) {
                    x9s.s(e5);
                } catch (NoSuchPaddingException e6) {
                    x9s.s(e6);
                }
            }
        }
        return null;
    }

    public byte[] n(String str) {
        byte[] bArrE;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!h3s.e(this.f20750a).c().f()) {
            return qcs.j(str);
        }
        String strB = ifs.b(this.f20750a);
        byte[] bArrJ = qcs.j(str);
        if (!TextUtils.isEmpty(strB) && bArrJ != null && bArrJ.length > 1 && (bArrE = ifs.e(strB)) != null) {
            try {
                if (bArrE.length > 1) {
                    return hxs.c(bArrE, Base64.encode(bArrJ, 2));
                }
            } catch (Exception e) {
                x9s.s(e);
            }
        }
        return null;
    }

    @Override // defpackage.lsc
    public void a(HashMap<String, ArrayList<g3s>> map) {
        this.f20751b = map;
    }
}
