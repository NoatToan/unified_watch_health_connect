package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes11.dex */
public class mrh {
    public static boolean a(List<String> list, String str, String str2, int i) {
        int i2;
        LogUtil.a("CalendarFileUtils", "writeCalendarFiles syncFlag: ", Integer.valueOf(i), ", calendarName = " + str2);
        boolean z = list == null || list.isEmpty();
        boolean z2 = TextUtils.isEmpty(str) || TextUtils.isEmpty(str2);
        if (z || z2) {
            LogUtil.a("CalendarFileUtils", "invalid parameters: jsons = " + list + ", calendarPath dir = " + str + ", calendarName = " + str2);
            return false;
        }
        int size = list.size();
        String str3 = str + str2;
        try {
            byte[] bArrH = eeq.h(i);
            FileOutputStream fileOutputStreamA = a(str3, false);
            fileOutputStreamA.write(bArrH);
            i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                try {
                    String str4 = list.get(i3);
                    LogUtil.a("CalendarFileUtils", "write file json: " + str4);
                    byte[] bArrB = eeq.b(str4);
                    boolean zD = d(fileOutputStreamA, eeq.h(bArrB.length), bArrB);
                    if (zD) {
                        i2++;
                    }
                    LogUtil.a("CalendarFileUtils", "write file result: " + zD, " ,writeFileSuccessCount = ", Integer.valueOf(i2));
                } catch (IOException unused) {
                    LogUtil.a("CalendarFileUtils", "writeCalendarFiles IOException");
                }
            }
        } catch (IOException unused2) {
            i2 = 0;
        }
        return i2 == size;
    }

    public static boolean e(String str, String str2, String str3, int i) {
        LogUtil.a("CalendarFileUtils", "writeCalendarFiles syncFlag: ", Integer.valueOf(i), ", calendarName = " + str3);
        boolean z = str == null || str.isEmpty();
        boolean z2 = TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3);
        if (z || z2) {
            LogUtil.a("CalendarFileUtils", "invalid parameters: json = " + str + ", calendarPath dir = " + str2 + ", calendarName = " + str3);
            return false;
        }
        String str4 = str2 + str3;
        try {
            byte[] bArrH = eeq.h(i);
            FileOutputStream fileOutputStreamA = a(str4, false);
            fileOutputStreamA.write(bArrH);
            LogUtil.a("CalendarFileUtils", "write file json to smartWatch: " + str);
            fileOutputStreamA.write(eeq.b(str));
            fileOutputStreamA.flush();
            return true;
        } catch (IOException unused) {
            LogUtil.a("CalendarFileUtils", "writeCalendarFiles IOException");
            return false;
        } catch (IllegalArgumentException unused2) {
            LogUtil.e("CalendarFileUtils", "IllegalArgumentException: failed to write the file .");
            return false;
        }
    }

    public static boolean c(String str, String str2, String str3, int i) {
        LogUtil.a("CalendarFileUtils", "writeCalendarNullFiles syncFlag: ", Integer.valueOf(i), ", calendarName = " + str3);
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            LogUtil.a("CalendarFileUtils", "writeCalendarNullFiles: jsons = " + str + ", calendarPath dir = " + str2 + ", calendarName = " + str3);
            return false;
        }
        String str4 = str2 + str3;
        try {
            byte[] bArrH = eeq.h(i);
            FileOutputStream fileOutputStreamA = a(str4, false);
            fileOutputStreamA.write(bArrH);
            LogUtil.a("CalendarFileUtils", "writeCalendarNullFiles file json: " + str);
            fileOutputStreamA.write(eeq.b(str));
            fileOutputStreamA.flush();
            return true;
        } catch (IOException unused) {
            LogUtil.a("CalendarFileUtils", "writeCalendarNullFiles IOException");
            return false;
        }
    }

    private static boolean d(FileOutputStream fileOutputStream, byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null) {
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.write(bArr2);
                fileOutputStream.flush();
                return true;
            } catch (IOException unused) {
                LogUtil.e("CalendarFileUtils", "writeToFile: failed to write the file.");
            } catch (IllegalArgumentException unused2) {
                LogUtil.e("CalendarFileUtils", "IllegalArgumentException: failed to write the file .");
                return false;
            }
        }
        return false;
    }

    private static FileOutputStream a(String str, boolean z) throws IOException, IllegalArgumentException {
        File file = new File(str);
        if (file.exists() && !z && !file.delete()) {
            LogUtil.a("CalendarFileUtils", "writeToFile: file delete failed.");
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            LogUtil.a("CalendarFileUtils", "writeToFile: failed to create file's parent.");
        }
        return FileUtils.openOutputStream(file, z);
    }

    public static String a(File file) throws Throwable {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            sb.append(line);
                            sb.append("\n");
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                                LogUtil.e("CalendarFileUtils", "parseSrt() finally IOException");
                            }
                        }
                    } catch (IOException unused2) {
                        bufferedReader2 = bufferedReader;
                        LogUtil.e("CalendarFileUtils", "parseSrt() IOException");
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException unused3) {
                                LogUtil.e("CalendarFileUtils", "parseSrt() finally IOException");
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused4) {
                                LogUtil.e("CalendarFileUtils", "parseSrt() finally IOException");
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
            }
        } catch (IOException unused5) {
        }
        LogUtil.a("CalendarFileUtils", sb.toString());
        return sb.toString();
    }
}
