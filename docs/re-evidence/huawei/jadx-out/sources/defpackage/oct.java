package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes12.dex */
public class oct {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f44156c;

    public static String d(Context context) {
        if (f44156c == null) {
            String strD = d(context, "encodehwmultisim");
            if (TextUtils.isEmpty(strD)) {
                byte[] bArrA = ocs.a();
                if (bArrA.length == 0) {
                    return null;
                }
                String strA = ocs.a(bArrA);
                e(context, strA, "encodehwmultisim");
                f44156c = strA;
            } else {
                f44156c = strD;
            }
        }
        return f44156c;
    }

    public static void e(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        int[] iArrD = d(str, str2);
        e(context, iArrD, str2);
        a(context, a(str, iArrD), str2);
    }

    public static String d(Context context, String str) {
        StringBuffer stringBuffer = new StringBuffer("");
        int[] iArrA = a(context, str);
        if (iArrA.length <= 0) {
            return stringBuffer.toString();
        }
        int length = iArrA.length;
        for (int i = 0; i < length; i++) {
            String strD = d(b(context, e(str + i)));
            if (TextUtils.isEmpty(strD)) {
                return "";
            }
            if (i == length / 2) {
                stringBuffer.append(String.copyValueOf(e(strD.toCharArray(), false)));
            } else {
                stringBuffer.append(strD);
            }
        }
        return stringBuffer.toString();
    }

    private static String[] a(String str, int[] iArr) {
        String[] strArr = new String[iArr.length];
        if (!TextUtils.isEmpty(str) && iArr.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < iArr.length; i2++) {
                try {
                    if (i2 == iArr.length / 2) {
                        strArr[i2] = String.copyValueOf(e(str.substring(i, iArr[i2] + i).toCharArray(), true));
                    } else {
                        strArr[i2] = str.substring(i, iArr[i2] + i);
                    }
                    i += iArr[i2];
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        return strArr;
    }

    private static char[] e(char[] cArr, boolean z) {
        char[] cArr2 = new char[cArr.length];
        int i = 0;
        if (z) {
            int length = cArr.length;
            int i2 = 0;
            while (i < length) {
                cArr2[i2] = (char) (cArr[i] + 2);
                i2++;
                i++;
            }
        } else {
            int length2 = cArr.length;
            int i3 = 0;
            while (i < length2) {
                cArr2[i3] = (char) (cArr[i] - 2);
                i3++;
                i++;
            }
        }
        return cArr2;
    }

    private static void e(Context context, int[] iArr, String str) {
        if (iArr == null || iArr.length <= 0 || TextUtils.isEmpty(str)) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer("");
        for (int i : iArr) {
            stringBuffer.append(i);
            stringBuffer.append("/");
        }
        try {
            b(b(context, e(str)), stringBuffer.substring(0, stringBuffer.length() - 1));
        } catch (IOException e) {
            ocq.c("EncryptFileUtils", "saveIndexFile->saveStrs " + e.toString());
        }
    }

    private static int[] a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return new int[0];
        }
        String[] strArrSplit = d(b(context, e(str))).split("/");
        if (strArrSplit.length <= 0) {
            return new int[0];
        }
        int[] iArr = new int[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                iArr[i] = Integer.parseInt(strArrSplit[i]);
            } catch (NumberFormatException unused) {
                return new int[0];
            }
        }
        return iArr;
    }

    private static String d(String str) {
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return "";
        }
        return a(new File(str)).toString();
    }

    private static void a(Context context, String[] strArr, String str) {
        if (strArr == null || strArr.length <= 0 || TextUtils.isEmpty(str) || context == null) {
            return;
        }
        for (int i = 0; i < strArr.length; i++) {
            try {
                b(b(context, e(str + i)), strArr[i]);
            } catch (IOException e) {
                ocq.c("EncryptFileUtils", "saveStrsToFile->saveStrs " + e.toString());
            }
        }
    }

    private static String b(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null) {
            return "";
        }
        return context.getFilesDir() + File.separator + str;
    }

    public static int[] d(String str, String str2) {
        if (TextUtils.isEmpty(str) || str.length() < 16 || TextUtils.isEmpty(str2)) {
            return new int[0];
        }
        return new int[]{3, 4, 4, 3, str.length() - 14};
    }

    private static String e(String str) {
        return e(str, "SHA-256");
    }

    public static String e(String str, String str2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(str.getBytes("UTF-8"));
            return c(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            return String.valueOf(str.hashCode());
        } catch (Exception unused2) {
            return "";
        }
    }

    private static String c(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    private static void b(String str, String str2) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(str, true), "UTF-8");
        try {
            try {
                try {
                    outputStreamWriter.write(str2);
                    outputStreamWriter.close();
                } catch (IOException unused) {
                    ocq.e("EncryptFileUtils", "IOException when write");
                    outputStreamWriter.close();
                }
            } catch (IOException unused2) {
                ocq.e("EncryptFileUtils", "IOException when close");
            }
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (IOException unused3) {
                ocq.e("EncryptFileUtils", "IOException when close");
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static StringBuffer a(File file) throws Throwable {
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader2;
        StringBuffer stringBuffer = new StringBuffer();
        FileInputStream fileInputStream = null;
        InputStreamReader inputStreamReader3 = null;
        InputStreamReader inputStreamReader4 = null;
        InputStreamReader inputStreamReader5 = null;
        fileInputStream = null;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                FileInputStream fileInputStream3 = new FileInputStream(file);
                try {
                    InputStreamReader inputStreamReader6 = new InputStreamReader(fileInputStream3, "UTF-8");
                    try {
                        bufferedReader = new BufferedReader(inputStreamReader6);
                        try {
                            char[] cArr = new char[4096];
                            while (true) {
                                int i = bufferedReader.read(cArr);
                                if (i == -1) {
                                    try {
                                        break;
                                    } catch (IOException unused) {
                                        ocq.c("EncryptFileUtils", "IOException in finally fis");
                                    }
                                } else {
                                    stringBuffer.append(cArr, 0, i);
                                }
                            }
                            fileInputStream3.close();
                            try {
                                inputStreamReader6.close();
                            } catch (IOException unused2) {
                                ocq.c("EncryptFileUtils", "IOException in finally isr");
                            }
                        } catch (FileNotFoundException unused3) {
                            inputStreamReader3 = inputStreamReader6;
                            inputStreamReader2 = inputStreamReader3;
                            fileInputStream2 = fileInputStream3;
                            try {
                                ocq.c("EncryptFileUtils", "getFileContent FileNotFoundException.");
                                if (fileInputStream2 != null) {
                                    try {
                                        fileInputStream2.close();
                                    } catch (IOException unused4) {
                                        ocq.c("EncryptFileUtils", "IOException in finally fis");
                                    }
                                }
                                if (inputStreamReader2 != null) {
                                    try {
                                        inputStreamReader2.close();
                                    } catch (IOException unused5) {
                                        ocq.c("EncryptFileUtils", "IOException in finally isr");
                                    }
                                }
                                if (bufferedReader != null) {
                                }
                                return stringBuffer;
                            } catch (Throwable th) {
                                inputStreamReader = inputStreamReader2;
                                th = th;
                                bufferedReader = bufferedReader;
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException unused6) {
                                        ocq.c("EncryptFileUtils", "IOException in finally fis");
                                    }
                                }
                                if (inputStreamReader != null) {
                                    try {
                                        inputStreamReader.close();
                                    } catch (IOException unused7) {
                                        ocq.c("EncryptFileUtils", "IOException in finally isr");
                                    }
                                }
                                if (bufferedReader == null) {
                                    throw th;
                                }
                                try {
                                    bufferedReader.close();
                                    throw th;
                                } catch (IOException unused8) {
                                    ocq.c("EncryptFileUtils", "IOException in finally br");
                                    throw th;
                                }
                            }
                        } catch (IOException unused9) {
                            inputStreamReader4 = inputStreamReader6;
                            inputStreamReader = inputStreamReader4;
                            fileInputStream2 = fileInputStream3;
                            try {
                                ocq.c("EncryptFileUtils", "getFileContent IOException.");
                                if (file.delete()) {
                                    ocq.c("EncryptFileUtils", "IOException in EncryptFileUtils");
                                }
                                if (fileInputStream2 != null) {
                                    try {
                                        fileInputStream2.close();
                                    } catch (IOException unused10) {
                                        ocq.c("EncryptFileUtils", "IOException in finally fis");
                                    }
                                }
                                if (inputStreamReader != null) {
                                    try {
                                        inputStreamReader.close();
                                    } catch (IOException unused11) {
                                        ocq.c("EncryptFileUtils", "IOException in finally isr");
                                    }
                                }
                                if (bufferedReader != null) {
                                }
                                return stringBuffer;
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader = bufferedReader;
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                if (bufferedReader == null) {
                                    throw th;
                                }
                                bufferedReader.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            inputStreamReader5 = inputStreamReader6;
                            inputStreamReader = inputStreamReader5;
                            fileInputStream = fileInputStream3;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (bufferedReader == null) {
                                throw th;
                            }
                            bufferedReader.close();
                            throw th;
                        }
                    } catch (FileNotFoundException unused12) {
                        bufferedReader = null;
                    } catch (IOException unused13) {
                        bufferedReader = null;
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedReader = null;
                    }
                } catch (FileNotFoundException unused14) {
                    bufferedReader = null;
                } catch (IOException unused15) {
                    bufferedReader = null;
                } catch (Throwable th5) {
                    th = th5;
                    bufferedReader = null;
                }
            } catch (FileNotFoundException unused16) {
                inputStreamReader2 = null;
                bufferedReader = null;
            } catch (IOException unused17) {
                inputStreamReader = null;
                bufferedReader = null;
            } catch (Throwable th6) {
                th = th6;
                inputStreamReader = null;
                bufferedReader = null;
            }
            bufferedReader.close();
        } catch (IOException unused18) {
            ocq.c("EncryptFileUtils", "IOException in finally br");
        }
        return stringBuffer;
    }
}
