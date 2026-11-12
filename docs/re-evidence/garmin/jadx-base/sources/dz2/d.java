package dz2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class d {
    public static boolean a(File file, File file2) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                boolean zC = c(fileInputStream2, file2);
                try {
                    fileInputStream2.close();
                    return zC;
                } catch (IOException unused) {
                    return zC;
                }
            } catch (IOException unused2) {
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static void b(File file) {
        if (!file.isDirectory()) {
            file.delete();
            System.out.println("File is deleted : " + file.getAbsolutePath());
            return;
        }
        if (file.list().length == 0) {
            file.delete();
            System.out.println("Directory is deleted : " + file.getAbsolutePath());
            return;
        }
        for (String str : file.list()) {
            b(new File(file, str));
        }
        if (file.list().length == 0) {
            file.delete();
            System.out.println("Directory is deleted : " + file.getAbsolutePath());
        }
    }

    public static boolean c(FileInputStream fileInputStream, File file) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if (file.exists()) {
                    file.delete();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i14 = fileInputStream.read(bArr);
                        if (i14 < 0) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i14);
                    }
                    fileOutputStream2.flush();
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    return true;
                } catch (Exception e4) {
                    e = e4;
                    fileOutputStream = fileOutputStream2;
                    e.printStackTrace();
                    if (fileOutputStream == null) {
                        return false;
                    }
                    try {
                        fileOutputStream.close();
                        return false;
                    } catch (IOException unused2) {
                        return false;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e14) {
                e = e14;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
