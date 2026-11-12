package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes11.dex */
public class mrm {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f42273b = new Object();
    private static volatile mrm e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f42274a;

    private mrm(Context context) {
        this.f42274a = context;
    }

    public static mrm b() {
        mrm mrmVar;
        synchronized (f42273b) {
            if (e == null) {
                e = new mrm(BaseApplication.getContext());
            }
            mrmVar = e;
        }
        return mrmVar;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:? A[SYNTHETIC] */
    public boolean c(mrk mrkVar, boolean z) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        int iC = mrkVar.c();
        LogUtil.a("CommonFileRequestManagerProcess", "createFileWithByte createFileWithByte:", Integer.valueOf(iC));
        String strD = d(mrkVar.n(), mrkVar.j());
        if (strD == null) {
            LogUtil.j("CommonFileRequestManagerProcess", "createFileWithByte path is null");
            return false;
        }
        File file = new File(strD);
        FileOutputStream fileOutputStream = null;
        BufferedOutputStream bufferedOutputStream3 = null;
        BufferedOutputStream bufferedOutputStream4 = null;
        fileOutputStream = null;
        try {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                if (!parentFile.exists()) {
                    LogUtil.a("CommonFileRequestManagerProcess", "createFileWithByte file mkdir:", Boolean.valueOf(parentFile.mkdirs()));
                }
                if (!file.exists()) {
                    LogUtil.a("CommonFileRequestManagerProcess", "createFileWithByte file create is:", Boolean.valueOf(file.createNewFile()));
                }
                FileOutputStream fileOutputStreamE = e(iC, z, file);
                try {
                    BufferedOutputStream bufferedOutputStream5 = new BufferedOutputStream(fileOutputStreamE);
                    try {
                        bufferedOutputStream5.write(mrkVar.d().array());
                        bufferedOutputStream5.flush();
                        LogUtil.a("CommonFileRequestManagerProcess", "createFileWithByte end");
                        mrq.b(file, mrkVar.j());
                        if (fileOutputStreamE != null) {
                            try {
                                fileOutputStreamE.close();
                            } catch (IOException unused) {
                                LogUtil.e("CommonFileRequestManagerProcess", "createFileWithByte close IOException");
                            }
                        }
                        try {
                            bufferedOutputStream5.close();
                        } catch (IOException unused2) {
                            LogUtil.e("CommonFileRequestManagerProcess", "createFileWithByte close IOException");
                        }
                        return true;
                    } catch (IOException unused3) {
                        bufferedOutputStream3 = bufferedOutputStream5;
                        bufferedOutputStream2 = bufferedOutputStream3;
                        fileOutputStream = fileOutputStreamE;
                        try {
                            LogUtil.e("CommonFileRequestManagerProcess", "createFileWithByte IOException");
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused4) {
                                    LogUtil.e("CommonFileRequestManagerProcess", "createFileWithByte close IOException");
                                }
                            }
                            if (bufferedOutputStream2 != null) {
                                try {
                                    bufferedOutputStream2.close();
                                } catch (IOException unused5) {
                                    LogUtil.e("CommonFileRequestManagerProcess", "createFileWithByte close IOException");
                                }
                            }
                            return false;
                        } catch (Throwable th) {
                            bufferedOutputStream = bufferedOutputStream2;
                            th = th;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused6) {
                                    LogUtil.e("CommonFileRequestManagerProcess", "createFileWithByte close IOException");
                                }
                            }
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                    throw th;
                                } catch (IOException unused7) {
                                    LogUtil.e("CommonFileRequestManagerProcess", "createFileWithByte close IOException");
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream4 = bufferedOutputStream5;
                        BufferedOutputStream bufferedOutputStream6 = bufferedOutputStream4;
                        fileOutputStream = fileOutputStreamE;
                        bufferedOutputStream = bufferedOutputStream6;
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                            throw th;
                        }
                        throw th;
                    }
                } catch (IOException unused8) {
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (IOException unused9) {
            bufferedOutputStream2 = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream = null;
        }
        return false;
    }

    public String d(String str, int i) throws IOException {
        if (mrq.d(str, i)) {
            return this.f42274a.getFilesDir().getPath() + File.separator + "commonFileRequest" + File.separator + str;
        }
        return CommonUtil.c(this.f42274a.getFilesDir().getCanonicalPath() + File.separator + "commonFileRequest" + File.separator + str);
    }

    private FileOutputStream e(int i, boolean z, File file) throws IOException {
        if (z) {
            if (i > 0) {
                return FileUtils.openOutputStream(file, true);
            }
            return FileUtils.openOutputStream(file);
        }
        if (i <= 1) {
            return FileUtils.openOutputStream(file);
        }
        return FileUtils.openOutputStream(file, true);
    }

    public boolean e(String str, String str2) {
        return TextUtils.equals(str, str2) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str);
    }
}
