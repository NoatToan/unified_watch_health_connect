package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ohos.ace.plugin.taskmanagerplugin.EventType;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.input.BoundedInputStream;

/* JADX INFO: loaded from: classes.dex */
public class jaf {
    private jaf() {
    }

    public static boolean c(Context context, MotionPathSimplify motionPathSimplify, String str) {
        boolean z;
        synchronized (jaf.class) {
            boolean z2 = true;
            if (context == null || str == null || motionPathSimplify == null) {
                LogUtil.a("Track_SaveFileData", "context or filename or motionPathSimplify is null");
                return false;
            }
            try {
                xji.a(new File(context.getFilesDir(), str).getCanonicalPath(), "S2", 0);
            } catch (IOException e) {
                LogUtil.e("Track_SaveFileData", "saveSimpleFile", LogAnonymous.b(e));
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(str, 0);
                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStreamOpenFileOutput);
                    try {
                        objectOutputStream.writeObject(motionPathSimplify);
                        objectOutputStream.flush();
                        try {
                            objectOutputStream.close();
                            if (fileOutputStreamOpenFileOutput != null) {
                                try {
                                    fileOutputStreamOpenFileOutput.close();
                                } catch (FileNotFoundException unused) {
                                    z = true;
                                    LogUtil.a("Track_SaveFileData", "fileNotFound");
                                    z2 = z;
                                } catch (IOException e2) {
                                    e = e2;
                                    z = true;
                                    LogUtil.a("Track_SaveFileData", "saveSimpleFile", e.getMessage());
                                    z2 = z;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            if (fileOutputStreamOpenFileOutput != null) {
                                try {
                                    fileOutputStreamOpenFileOutput.close();
                                } catch (Throwable th2) {
                                    try {
                                        th.addSuppressed(th2);
                                    } catch (FileNotFoundException unused2) {
                                        LogUtil.a("Track_SaveFileData", "fileNotFound");
                                        z2 = z;
                                        return z2;
                                    } catch (IOException e3) {
                                        e = e3;
                                        LogUtil.a("Track_SaveFileData", "saveSimpleFile", e.getMessage());
                                        z2 = z;
                                        return z2;
                                    }
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            objectOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    z = false;
                }
            } catch (FileNotFoundException unused3) {
                z = false;
            } catch (IOException e4) {
                e = e4;
                z = false;
            }
            return z2;
        }
    }

    public static boolean b(Context context, gdm gdmVar, String str) {
        boolean z;
        synchronized (jaf.class) {
            boolean z2 = true;
            if (context == null || str == null || gdmVar == null) {
                LogUtil.a("Track_SaveFileData", "context or filename or hotPathDetailInfo is null");
                return false;
            }
            try {
                xji.a(new File(context.getFilesDir(), str).getCanonicalPath(), "S2", 0);
            } catch (IOException e) {
                LogUtil.e("Track_SaveFileData", "savehotPathDetailInfo", LogAnonymous.b(e));
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(str, 0);
                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStreamOpenFileOutput);
                    try {
                        objectOutputStream.writeObject(gdmVar);
                        objectOutputStream.flush();
                        try {
                            objectOutputStream.close();
                            if (fileOutputStreamOpenFileOutput != null) {
                                try {
                                    fileOutputStreamOpenFileOutput.close();
                                } catch (FileNotFoundException unused) {
                                    z = true;
                                    LogUtil.a("Track_SaveFileData", "fileNotFound");
                                    z2 = z;
                                } catch (IOException e2) {
                                    e = e2;
                                    z = true;
                                    LogUtil.a("Track_SaveFileData", "hotPathDetailInfo", e.getMessage());
                                    z2 = z;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            if (fileOutputStreamOpenFileOutput != null) {
                                try {
                                    fileOutputStreamOpenFileOutput.close();
                                } catch (Throwable th2) {
                                    try {
                                        th.addSuppressed(th2);
                                    } catch (FileNotFoundException unused2) {
                                        LogUtil.a("Track_SaveFileData", "fileNotFound");
                                        z2 = z;
                                        return z2;
                                    } catch (IOException e3) {
                                        e = e3;
                                        LogUtil.a("Track_SaveFileData", "hotPathDetailInfo", e.getMessage());
                                        z2 = z;
                                        return z2;
                                    }
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            objectOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    z = false;
                }
            } catch (FileNotFoundException unused3) {
                z = false;
            } catch (IOException e4) {
                e = e4;
                z = false;
            }
            return z2;
        }
    }

    public static boolean e(Context context, MotionPath motionPath, String str) {
        return e(context, motionPath, str, true);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0092 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x009c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean e(Context context, MotionPath motionPath, String str, boolean z) throws Throwable {
        boolean z2 = false;
        if (context == null) {
            LogUtil.a("Track_SaveFileData", "saveMotionPath ", "context is null");
            return false;
        }
        File file = new File(context.getFilesDir(), str);
        try {
            xji.a(file.getCanonicalPath(), "S2", 0);
        } catch (IOException e) {
            LogUtil.e("Track_SaveFileData", "saveMotionPath()", LogAnonymous.b(e));
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file.getPath(), z);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            try {
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                if (motionPath != null) {
                    bufferedWriter.write(motionPath.toString());
                }
                bufferedWriter.flush();
                ReleaseLogUtil.d("Track_SaveFileData", "saveMotionPath");
                try {
                    bufferedWriter.close();
                    try {
                        outputStreamWriter.close();
                        try {
                            fileOutputStream.close();
                            return true;
                        } catch (FileNotFoundException unused) {
                            z2 = true;
                            LogUtil.a("Track_SaveFileData", "fileNotFound");
                            return z2;
                        } catch (IOException e2) {
                            e = e2;
                            z2 = true;
                            LogUtil.e("Track_SaveFileData", "1 saveMotionPath()", e.getMessage());
                            return z2;
                        } catch (SecurityException e3) {
                            e = e3;
                            z2 = true;
                            LogUtil.a("Track_SaveFileData", "1 saveMotionPath()", e.getMessage());
                            return z2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        z2 = true;
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z2 = true;
                    try {
                        outputStreamWriter.close();
                    } catch (Throwable th4) {
                        th.addSuppressed(th4);
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } catch (FileNotFoundException unused2) {
        } catch (IOException e4) {
            e = e4;
        } catch (SecurityException e5) {
            e = e5;
        }
    }

    public static boolean b(Context context, String str, String str2) throws Throwable {
        boolean z;
        boolean z2 = false;
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.e("Track_SaveFileData", "saveContentFile context or tempString is null");
            return false;
        }
        File file = new File(context.getFilesDir(), str2);
        try {
            xji.a(file.getCanonicalPath(), "S2", 0);
        } catch (IOException e) {
            LogUtil.e("Track_SaveFileData", "saveContentFile()", LogAnonymous.b(e));
        }
        try {
            z = true;
            FileOutputStream fileOutputStream = new FileOutputStream(file.getPath(), true);
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
                    try {
                        if (file.getParentFile() != null && !file.getParentFile().exists()) {
                            file.getParentFile().mkdirs();
                        }
                        bufferedWriter.write(str);
                        bufferedWriter.flush();
                        try {
                            bufferedWriter.close();
                            try {
                                outputStreamWriter.close();
                                try {
                                    fileOutputStream.close();
                                } catch (FileNotFoundException e2) {
                                    e = e2;
                                    LogUtil.e("Track_SaveFileData", "saveContentFile()", LogAnonymous.b(e));
                                } catch (IOException e3) {
                                    e = e3;
                                    LogUtil.e("Track_SaveFileData", "saveContentFile()", LogAnonymous.b(e));
                                } catch (SecurityException e4) {
                                    e = e4;
                                    LogUtil.e("Track_SaveFileData", "saveContentFile()", LogAnonymous.b(e));
                                }
                            } catch (Throwable th) {
                                th = th;
                                z2 = true;
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            z2 = true;
                            try {
                                outputStreamWriter.close();
                            } catch (Throwable th4) {
                                th.addSuppressed(th4);
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            } catch (Throwable th8) {
                th = th8;
                fileOutputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e5) {
            e = e5;
            z = z2;
        } catch (IOException e6) {
            e = e6;
            z = z2;
        } catch (SecurityException e7) {
            e = e7;
            z = z2;
        }
        return z;
    }

    public static boolean b(Context context, ArrayList<gzr> arrayList) {
        if (njy.e(arrayList) || context == null) {
            return false;
        }
        List<String> listB = izz.b(arrayList);
        if (njy.e(listB)) {
            return false;
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        Iterator<String> it = listB.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
        }
        if (TextUtils.isEmpty(stringBuffer.toString())) {
            return false;
        }
        return b(context, stringBuffer.toString(), "motion_cadence.txt");
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.BufferedWriter] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.BufferedWriter] */
    public static boolean d(Long l, Context context) throws Throwable {
        OutputStreamWriter outputStreamWriter;
        FileOutputStream fileOutputStream;
        boolean z;
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2;
        BufferedWriter bufferedWriter3;
        BufferedWriter bufferedWriter4;
        OutputStreamWriter outputStreamWriter2;
        BufferedWriter bufferedWriter5;
        ?? r1 = "UTF-8";
        if (context == null) {
            LogUtil.a("Track_SaveFileData", "recoveryMotionPathFile ", "context is null");
            return false;
        }
        LogUtil.a("Track_SaveFileData", "recoveryMotionPathFile() fileLine: ", l);
        File file = new File(context.getFilesDir(), "motion_path2.txt");
        OutputStreamWriter outputStreamWriter3 = null;
        bufferedWriter = null;
        BufferedWriter bufferedWriter6 = null;
        fileOutputStream = null;
        fileOutputStream = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream2 = null;
        outputStreamWriter3 = null;
        outputStreamWriter3 = null;
        outputStreamWriter3 = null;
        ?? r7 = 0;
        try {
            try {
                FileInputStream fileInputStreamOpenFileInput = context.openFileInput(file.getName());
                try {
                    BoundedInputStream boundedInputStream = new BoundedInputStream(fileInputStreamOpenFileInput, 10240000L);
                    try {
                        InputStreamReader inputStreamReader = new InputStreamReader(boundedInputStream, "UTF-8");
                        try {
                            BufferedReader bufferedReader = new BufferedReader(inputStreamReader, 2048);
                            try {
                                if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
                                    LogUtil.a("Track_SaveFileData", "mkdirs failed");
                                }
                                if (file.exists() && !file.delete()) {
                                    LogUtil.j("Track_SaveFileData", "delete file failed ");
                                }
                                if (!file.exists() && !file.createNewFile()) {
                                    LogUtil.j("Track_SaveFileData", "create file failed ");
                                }
                                fileOutputStream = new FileOutputStream(file.getPath(), true);
                                try {
                                    outputStreamWriter2 = new OutputStreamWriter(fileOutputStream, "UTF-8");
                                    try {
                                        bufferedWriter4 = new BufferedWriter(outputStreamWriter2);
                                        try {
                                            a(l, bufferedWriter4, bufferedReader);
                                            try {
                                                bufferedReader.close();
                                                try {
                                                    inputStreamReader.close();
                                                    try {
                                                        boundedInputStream.close();
                                                        if (fileInputStreamOpenFileInput != null) {
                                                            try {
                                                                fileInputStreamOpenFileInput.close();
                                                            } catch (FileNotFoundException unused) {
                                                                outputStreamWriter3 = outputStreamWriter2;
                                                                z = true;
                                                                bufferedWriter3 = bufferedWriter4;
                                                                LogUtil.a("Track_SaveFileData", "fileNotFound");
                                                                r1 = bufferedWriter3;
                                                                b((BufferedWriter) r1, outputStreamWriter3, fileOutputStream);
                                                                return z;
                                                            } catch (IOException e) {
                                                                e = e;
                                                                outputStreamWriter3 = outputStreamWriter2;
                                                                z = true;
                                                                bufferedWriter2 = bufferedWriter4;
                                                                LogUtil.e("Track_SaveFileData", "recoveryMotionPathFile() ", e.getMessage());
                                                                r1 = bufferedWriter2;
                                                                b((BufferedWriter) r1, outputStreamWriter3, fileOutputStream);
                                                                return z;
                                                            } catch (SecurityException e2) {
                                                                e = e2;
                                                                outputStreamWriter3 = outputStreamWriter2;
                                                                z = true;
                                                                bufferedWriter = bufferedWriter4;
                                                                LogUtil.e("Track_SaveFileData", "recoveryMotionPathFile() ", e.getMessage());
                                                                r1 = bufferedWriter;
                                                                b((BufferedWriter) r1, outputStreamWriter3, fileOutputStream);
                                                                return z;
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                r7 = bufferedWriter4;
                                                                outputStreamWriter = outputStreamWriter2;
                                                                b((BufferedWriter) r7, outputStreamWriter, fileOutputStream);
                                                                throw th;
                                                            }
                                                        }
                                                        b(bufferedWriter4, outputStreamWriter2, fileOutputStream);
                                                        return true;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        z = true;
                                                        fileOutputStream2 = fileOutputStream;
                                                        if (fileInputStreamOpenFileInput != null) {
                                                            try {
                                                                fileInputStreamOpenFileInput.close();
                                                            } catch (Throwable th3) {
                                                                try {
                                                                    th.addSuppressed(th3);
                                                                } catch (FileNotFoundException unused2) {
                                                                    fileOutputStream = fileOutputStream2;
                                                                    outputStreamWriter3 = outputStreamWriter2;
                                                                    bufferedWriter3 = bufferedWriter4;
                                                                    LogUtil.a("Track_SaveFileData", "fileNotFound");
                                                                    r1 = bufferedWriter3;
                                                                    b((BufferedWriter) r1, outputStreamWriter3, fileOutputStream);
                                                                    return z;
                                                                } catch (IOException e3) {
                                                                    e = e3;
                                                                    fileOutputStream = fileOutputStream2;
                                                                    outputStreamWriter3 = outputStreamWriter2;
                                                                    bufferedWriter2 = bufferedWriter4;
                                                                    LogUtil.e("Track_SaveFileData", "recoveryMotionPathFile() ", e.getMessage());
                                                                    r1 = bufferedWriter2;
                                                                    b((BufferedWriter) r1, outputStreamWriter3, fileOutputStream);
                                                                    return z;
                                                                } catch (SecurityException e4) {
                                                                    e = e4;
                                                                    fileOutputStream = fileOutputStream2;
                                                                    outputStreamWriter3 = outputStreamWriter2;
                                                                    bufferedWriter = bufferedWriter4;
                                                                    LogUtil.e("Track_SaveFileData", "recoveryMotionPathFile() ", e.getMessage());
                                                                    r1 = bufferedWriter;
                                                                    b((BufferedWriter) r1, outputStreamWriter3, fileOutputStream);
                                                                    return z;
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    fileOutputStream = fileOutputStream2;
                                                                    r7 = bufferedWriter4;
                                                                    outputStreamWriter = outputStreamWriter2;
                                                                    b((BufferedWriter) r7, outputStreamWriter, fileOutputStream);
                                                                    throw th;
                                                                }
                                                            }
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    z = true;
                                                    fileOutputStream2 = fileOutputStream;
                                                    try {
                                                        try {
                                                            boundedInputStream.close();
                                                        } catch (Throwable th6) {
                                                            th.addSuppressed(th6);
                                                        }
                                                        throw th;
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                        if (fileInputStreamOpenFileInput != null) {
                                                            fileInputStreamOpenFileInput.close();
                                                        }
                                                        throw th;
                                                    }
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                                z = true;
                                                fileOutputStream2 = fileOutputStream;
                                                bufferedWriter4 = bufferedWriter4;
                                                try {
                                                    try {
                                                        inputStreamReader.close();
                                                    } catch (Throwable th9) {
                                                        th.addSuppressed(th9);
                                                    }
                                                    throw th;
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    boundedInputStream.close();
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                            bufferedWriter6 = bufferedWriter4;
                                            bufferedWriter5 = bufferedWriter6;
                                            fileOutputStream2 = fileOutputStream;
                                            try {
                                                try {
                                                    bufferedReader.close();
                                                } catch (Throwable th12) {
                                                    th.addSuppressed(th12);
                                                }
                                                throw th;
                                            } catch (Throwable th13) {
                                                th = th13;
                                                z = false;
                                                bufferedWriter4 = bufferedWriter5;
                                                inputStreamReader.close();
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th14) {
                                        th = th14;
                                    }
                                } catch (Throwable th15) {
                                    th = th15;
                                    outputStreamWriter2 = null;
                                }
                            } catch (Throwable th16) {
                                th = th16;
                                bufferedWriter5 = null;
                                outputStreamWriter2 = null;
                            }
                        } catch (Throwable th17) {
                            th = th17;
                            z = false;
                            bufferedWriter4 = null;
                            outputStreamWriter2 = null;
                        }
                    } catch (Throwable th18) {
                        th = th18;
                        z = false;
                        bufferedWriter4 = null;
                        outputStreamWriter2 = null;
                    }
                } catch (Throwable th19) {
                    th = th19;
                    z = false;
                    bufferedWriter4 = null;
                    outputStreamWriter2 = null;
                }
            } catch (Throwable th20) {
                th = th20;
                outputStreamWriter = outputStreamWriter3;
                fileOutputStream = fileOutputStream;
                r7 = r1;
            }
        } catch (FileNotFoundException unused3) {
            z = false;
            bufferedWriter3 = null;
            fileOutputStream = null;
        } catch (IOException e5) {
            e = e5;
            z = false;
            bufferedWriter2 = null;
            fileOutputStream = null;
        } catch (SecurityException e6) {
            e = e6;
            z = false;
            bufferedWriter = null;
            fileOutputStream = null;
        } catch (Throwable th21) {
            th = th21;
            outputStreamWriter = null;
            fileOutputStream = null;
        }
    }

    private static void b(BufferedWriter bufferedWriter, OutputStreamWriter outputStreamWriter, FileOutputStream fileOutputStream) {
        if (bufferedWriter != null) {
            try {
                bufferedWriter.close();
            } catch (FileNotFoundException unused) {
                LogUtil.e("Track_SaveFileData", "error 10001");
            } catch (IOException e) {
                LogUtil.e("Track_SaveFileData", "closeWriter() bufferedWriter ", e.getMessage());
            }
        }
        if (outputStreamWriter != null) {
            try {
                outputStreamWriter.close();
            } catch (FileNotFoundException unused2) {
                LogUtil.e("Track_SaveFileData", "error 10001");
            } catch (IOException e2) {
                LogUtil.e("Track_SaveFileData", "closeWriter() streamWriter ", e2.getMessage());
            }
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (FileNotFoundException unused3) {
                LogUtil.e("Track_SaveFileData", "error 10001");
            } catch (IOException e3) {
                LogUtil.e("Track_SaveFileData", "closeWriter() fileOutputStream ", e3.getMessage());
            }
        }
    }

    private static void a(Long l, BufferedWriter bufferedWriter, BufferedReader bufferedReader) throws IOException {
        long j = 0;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                LogUtil.a("Track_SaveFileData", "readCount", Long.valueOf(j));
                return;
            } else if (l.longValue() > j) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.flush();
                j++;
            }
        }
    }

    public static boolean c(Context context, String str, String str2) {
        if (context == null) {
            LogUtil.a("Track_SaveFileData", "copySimpleFile ", "context is null");
            return false;
        }
        try {
            FileInputStream fileInputStreamOpenFileInput = context.openFileInput(str);
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(str2, 0);
                try {
                    File file = new File(context.getFilesDir(), str);
                    File file2 = new File(context.getFilesDir(), str2);
                    if ((!file.getParentFile().exists() || !file2.getParentFile().exists()) && file.getParentFile().mkdirs()) {
                        file2.getParentFile().mkdirs();
                    }
                    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStreamOpenFileInput);
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStreamOpenFileOutput);
                    objectOutputStream.writeObject((MotionPathSimplify) objectInputStream.readObject());
                    objectOutputStream.flush();
                    objectInputStream.close();
                    objectOutputStream.close();
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    return true;
                } catch (Throwable th) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (FileNotFoundException unused) {
            LogUtil.a("Track_SaveFileData", "fileNotFound");
            return false;
        } catch (IOException e) {
            LogUtil.e("Track_SaveFileData", "copySimpleFile()", e.getMessage());
            return false;
        } catch (ClassNotFoundException e2) {
            LogUtil.e("Track_SaveFileData", "copySimpleFile()", e2.getMessage());
            return false;
        } catch (SecurityException e3) {
            LogUtil.e("Track_SaveFileData", "copySimpleFile()", e3.getMessage());
            return false;
        }
    }

    public static boolean c(Context context, String str) {
        StringBuilder sb = new StringBuilder("delete ");
        sb.append(str);
        sb.append(" ");
        if (context != null && !TextUtils.isEmpty(str)) {
            File filesDir = context.getFilesDir();
            if (filesDir == null) {
                ReleaseLogUtil.e("Track_SaveFileData", "deleteFile filesDir is null");
                return false;
            }
            File file = new File(filesDir, str);
            if (file.exists()) {
                try {
                    String canonicalPath = filesDir.getCanonicalPath();
                    if (!xjl.d(file, canonicalPath, str)) {
                        LogUtil.j("Track_SaveFileData", "deleteFile fileName ", str, " canonicalPath ", canonicalPath, " file ", file);
                        return false;
                    }
                    if (!file.delete()) {
                        sb.append(EventType.FAILED);
                        ReleaseLogUtil.e("Track_SaveFileData", sb);
                        return false;
                    }
                    sb.append("success");
                    ReleaseLogUtil.d("Track_SaveFileData", sb);
                    return true;
                } catch (IOException e) {
                    ReleaseLogUtil.a("Track_SaveFileData", "deleteFile exception ", ExceptionUtils.c(e));
                    return false;
                }
            }
            sb.append("not exist");
            ReleaseLogUtil.d("Track_SaveFileData", sb);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[Catch: IllegalArgumentException -> 0x00c0, IOException -> 0x00cf, FileNotFoundException -> 0x00de, SYNTHETIC, TRY_LEAVE, TryCatch #11 {FileNotFoundException -> 0x00de, IOException -> 0x00cf, IllegalArgumentException -> 0x00c0, blocks: (B:11:0x002b, B:58:0x00bf, B:57:0x00bc), top: B:86:0x002b }] */
    public static boolean b(Context context, String str, List<jbw> list) throws Throwable {
        IllegalArgumentException e;
        IOException e2;
        Throwable th;
        Throwable th2;
        boolean z = false;
        if (context == null) {
            LogUtil.a("Track_SaveFileData", "saveTrackPointData ", "context is null");
            return false;
        }
        if (njy.e(list)) {
            LogUtil.j("Track_SaveFileData", "saveTrackPointData trackPointDataList is null or empty");
            return false;
        }
        File file = new File(context.getFilesDir(), str);
        boolean z2 = true;
        try {
            FileOutputStream fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(file, true);
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStreamOpenOutputStream, "UTF-8");
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
                    try {
                        if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
                            LogUtil.a("Track_SaveFileData", "saveTrackPointData mkdirs failed");
                        }
                        StringBuilder sb = new StringBuilder(16);
                        for (int i = 0; i < list.size(); i++) {
                            sb.append(list.get(i).toString());
                            sb.append(System.lineSeparator());
                        }
                        bufferedWriter.write(sb.toString());
                        bufferedWriter.flush();
                        try {
                            bufferedWriter.close();
                            try {
                                outputStreamWriter.close();
                                if (fileOutputStreamOpenOutputStream == null) {
                                    return true;
                                }
                                try {
                                    fileOutputStreamOpenOutputStream.close();
                                    return true;
                                } catch (FileNotFoundException unused) {
                                    ReleaseLogUtil.a("Track_SaveFileData", "fileNotFound");
                                    return z2;
                                } catch (IOException e3) {
                                    e2 = e3;
                                    ReleaseLogUtil.a("Track_SaveFileData", "saveTrackPointData ", LogAnonymous.b(e2));
                                    return z2;
                                } catch (IllegalArgumentException e4) {
                                    e = e4;
                                    ReleaseLogUtil.a("Track_SaveFileData", ExceptionUtils.c(e));
                                    return z2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                z = true;
                                if (fileOutputStreamOpenOutputStream != null) {
                                    throw th;
                                }
                                try {
                                    fileOutputStreamOpenOutputStream.close();
                                    throw th;
                                } catch (Throwable th4) {
                                    th.addSuppressed(th4);
                                    throw th;
                                }
                                ReleaseLogUtil.a("Track_SaveFileData", "fileNotFound");
                                return z2;
                            }
                        } catch (Throwable th5) {
                            th2 = th5;
                            z = true;
                            try {
                                outputStreamWriter.close();
                                throw th2;
                            } catch (Throwable th6) {
                                th2.addSuppressed(th6);
                                throw th2;
                            }
                        }
                    } catch (Throwable th7) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                        }
                        throw th7;
                    }
                } catch (Throwable th9) {
                    th2 = th9;
                    outputStreamWriter.close();
                    throw th2;
                }
            } catch (Throwable th10) {
                th = th10;
                if (fileOutputStreamOpenOutputStream != null) {
                    throw th;
                }
                fileOutputStreamOpenOutputStream.close();
                throw th;
                ReleaseLogUtil.a("Track_SaveFileData", "fileNotFound");
                return z2;
            }
        } catch (FileNotFoundException unused2) {
            z2 = z;
        } catch (IOException e5) {
            e2 = e5;
            z2 = z;
        } catch (IllegalArgumentException e6) {
            e = e6;
            z2 = z;
        }
    }

    public static void a() {
        Context context = BaseApplication.getContext();
        c(context, "motion_path2.txt");
        c(context, "simplemotion.txt");
        c(context, "simplemotion_temp.txt");
        c(context, "motion_cadence.txt");
        c(context, "target_motion_simplify.txt");
        c(context, "target_motion_path.txt");
        c(context, "hotPathDetailInfo.txt");
        c(context, "motion_path_process.txt");
    }

    public static void a(Context context, String str, String str2) {
        if (context == null) {
            ReleaseLogUtil.a("Track_SaveFileData", "context is null");
            return;
        }
        File file = new File(context.getFilesDir(), str);
        File file2 = new File(context.getFilesDir(), str2);
        if (c(file, file2)) {
            return;
        }
        try {
            com.huawei.haf.common.os.FileUtils.e(file, file2);
        } catch (IOException e) {
            LogUtil.j("Track_SaveFileData", "copy file failed : IOException", e.toString());
        }
    }

    public static boolean d(Context context, String str, String str2) {
        if (context == null) {
            ReleaseLogUtil.a("Track_SaveFileData", "context is null");
            return false;
        }
        File file = new File(context.getFilesDir(), str);
        File file2 = new File(context.getFilesDir(), str2);
        if (c(file, file2)) {
            return false;
        }
        try {
            com.huawei.haf.common.os.FileUtils.e(file, file2);
            return true;
        } catch (IOException e) {
            LogUtil.j("Track_SaveFileData", "copy file failed :", LogAnonymous.b(e));
            return false;
        }
    }

    private static boolean c(File file, File file2) {
        if (!file.exists() || !file.isFile() || !file.canRead()) {
            ReleaseLogUtil.a("Track_SaveFileData", "copyFile failed, fromFile is null, or is not exists or is not fileor cannot read, or toFile's parentFile is null");
            return true;
        }
        if (file2.getParentFile() == null) {
            ReleaseLogUtil.a("Track_SaveFileData", "copyFile failed, toFile.getParentFile() is null");
            return true;
        }
        if (!file2.getParentFile().exists() && !file2.getParentFile().mkdirs()) {
            ReleaseLogUtil.a("Track_SaveFileData", "copyFile : make parentFile dir failed");
            return true;
        }
        if (!file2.exists() || file2.delete()) {
            return false;
        }
        ReleaseLogUtil.a("Track_SaveFileData", "copyFile : delete origin file failed");
        return true;
    }
}
