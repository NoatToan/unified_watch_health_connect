package defpackage;

import android.text.TextUtils;
import com.huawei.android.hicloud.sync.util.FileUtil;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes30.dex */
public class grf {
    /* JADX WARN: Code duplicated, block: B:35:0x0095 A[Catch: IOException -> 0x0099, TRY_LEAVE, TryCatch #0 {IOException -> 0x0099, blocks: (B:33:0x0090, B:35:0x0095), top: B:48:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa A[Catch: IOException -> 0x00ae, TRY_LEAVE, TryCatch #8 {IOException -> 0x00ae, blocks: (B:41:0x00a5, B:43:0x00aa), top: B:55:0x00a5 }] */
    public static byte[] a(String str) throws Throwable {
        FileInputStream fileInputStream;
        grn.d(FileUtil.TAG, "getByteArray filePath: " + str);
        File file = new File(str);
        byte[] byteArray = new byte[0];
        if (!file.exists()) {
            grn.e(FileUtil.TAG, "getByteArray, file is not exists");
            return byteArray;
        }
        if (file.length() == 0) {
            grn.e(FileUtil.TAG, "getByteArray, file is empty");
            return byteArray;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream((int) file.length());
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = fileInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            byteArrayOutputStream2.write(bArr, 0, i);
                        }
                        byteArray = byteArrayOutputStream2.toByteArray();
                        try {
                            byteArrayOutputStream2.close();
                            fileInputStream.close();
                        } catch (IOException unused) {
                            grn.c(FileUtil.TAG, "getByteArray, close stream Exception");
                        }
                    } catch (IOException unused2) {
                        byteArrayOutputStream = byteArrayOutputStream2;
                        grn.c(FileUtil.TAG, "getByteArray, read data Exception");
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                            } catch (IOException unused3) {
                                grn.c(FileUtil.TAG, "getByteArray, close stream Exception");
                            }
                        } else if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                            } catch (IOException unused4) {
                                grn.c(FileUtil.TAG, "getByteArray, close stream Exception");
                                throw th;
                            }
                        } else if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        throw th;
                    }
                } catch (IOException unused5) {
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream;
                byteArrayOutputStream = byteArrayOutputStream;
            }
        } catch (IOException unused6) {
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
        return byteArray;
    }

    public static boolean a(String str, byte[] bArr, int i) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(str);
                try {
                    fileOutputStream.write(bArr, 0, i);
                    try {
                        fileOutputStream.close();
                        return true;
                    } catch (IOException unused) {
                        grn.c(FileUtil.TAG, "write, close fos IOException");
                        return true;
                    }
                } catch (FileNotFoundException unused2) {
                    fileOutputStream2 = fileOutputStream;
                    grn.c(FileUtil.TAG, "write, FileNotFoundException: " + str);
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused3) {
                            grn.c(FileUtil.TAG, "write, close fos IOException");
                        }
                    }
                    return false;
                } catch (IOException unused4) {
                    fileOutputStream2 = fileOutputStream;
                    grn.c(FileUtil.TAG, "write, IOException");
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused5) {
                            grn.c(FileUtil.TAG, "write, close fos IOException");
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused6) {
                            grn.c(FileUtil.TAG, "write, close fos IOException");
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (FileNotFoundException unused7) {
        } catch (IOException unused8) {
        }
    }

    public static String b(String str) {
        String strE = e(str);
        if (TextUtils.isEmpty(strE)) {
            grn.c(FileUtil.TAG, "filterFilePath, legalPath is empty");
            return null;
        }
        try {
            return new File(strE).getCanonicalPath();
        } catch (IOException unused) {
            grn.c(FileUtil.TAG, "filterFilePath IOException");
            return null;
        }
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            grn.c(FileUtil.TAG, "filterFullFilePath sourcePath is empty");
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890-=[];\\',./ ~!@#$%^&*()_+\"{}|:<>?".contains(String.valueOf(str.charAt(i)))) {
                stringBuffer.append(str.charAt(i));
            }
        }
        return stringBuffer.toString();
    }
}
