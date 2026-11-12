package org.acra.legacy;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import org.acra.ACRA;
import org.acra.ReportField;
import org.acra.data.CrashReportData;
import org.acra.file.CrashReportPersister;
import org.acra.file.ReportLocator;
import org.acra.util.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
class a {
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;
    private static final int f = 4;
    private static final int g = 5;
    private final Context a;

    public a(@NonNull Context context) {
        this.a = context;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x013c A[Catch: all -> 0x01a1, TryCatch #0 {all -> 0x01a1, blocks: (B:8:0x0022, B:13:0x002d, B:14:0x0034, B:19:0x003c, B:21:0x0047, B:22:0x0058, B:23:0x005f, B:28:0x0068, B:30:0x006b, B:33:0x007a, B:35:0x0082, B:40:0x008f, B:45:0x00a6, B:46:0x00ad, B:130:0x0167, B:108:0x013c, B:99:0x012b, B:102:0x0132, B:143:0x0189), top: B:151:0x0022, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0142  */
    /* JADX WARN: Code duplicated, block: B:112:0x0145  */
    /* JADX WARN: Code duplicated, block: B:114:0x0148 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x015f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0165  */
    /* JADX WARN: Code duplicated, block: B:134:0x0179  */
    /* JADX WARN: Code duplicated, block: B:158:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0157 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x017b A[EDGE_INSN: B:184:0x017b->B:135:0x017b BREAK  A[LOOP:1: B:151:0x0022->B:195:0x0022], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:55:0x00be  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e9 A[PHI: r7
      0x00e9: PHI (r7v7 char) = (r7v1 char), (r7v1 char), (r7v9 char) binds: [B:124:0x015d, B:127:0x0162, B:71:0x00e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x00fc  */
    @NonNull
    private synchronized CrashReportData b(@NonNull Reader reader) throws IOException {
        CrashReportData crashReportData;
        int i;
        int i2;
        char c2;
        char c3;
        char[] cArr = new char[40];
        crashReportData = new CrashReportData();
        BufferedReader bufferedReader = new BufferedReader(reader, 8192);
        char c4 = 2;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        char c5 = 0;
        int i6 = 0;
        int i7 = -1;
        int i8 = 0;
        while (true) {
            boolean z = true;
            while (true) {
                try {
                    int i9 = bufferedReader.read();
                    if (i9 == i3) {
                        if (c5 == c4 && i6 <= 4) {
                            throw new IllegalArgumentException("luni.08");
                        }
                        if (i7 == i3 && i5 > 0) {
                            i7 = i5;
                        }
                        if (i7 >= 0) {
                            String str = new String(cArr, i4, i5);
                            String strSubstring = str.substring(i7);
                            if (c5 == 1) {
                                strSubstring = strSubstring + "\u0000";
                            }
                            c(crashReportData, str.substring(i4, i7), strSubstring);
                        }
                        IOUtils.safeClose(reader);
                        IOUtils.safeClose(bufferedReader);
                    } else {
                        char c6 = (char) i9;
                        if (i5 == cArr.length) {
                            char[] cArr2 = new char[cArr.length * 2];
                            System.arraycopy(cArr, i4, cArr2, i4, i5);
                            cArr = cArr2;
                        }
                        if (c5 == c4) {
                            int iDigit = Character.digit(c6, 16);
                            if (iDigit >= 0) {
                                i8 = (i8 << 4) + iDigit;
                                i6++;
                                c4 = i6 < 4 ? (char) 2 : (char) 2;
                                i4 = 0;
                            } else if (i6 <= 4) {
                                throw new IllegalArgumentException("luni.09");
                            }
                            int i10 = i8;
                            int i11 = i5 + 1;
                            cArr[i5] = (char) i10;
                            if (c6 == '\n' || c6 == 133) {
                                i8 = i10;
                                i5 = i11;
                                c5 = 0;
                                if (c5 == 1) {
                                    if (c6 != '\n') {
                                        if (c5 == 3) {
                                            break;
                                            break;
                                        }
                                        c4 = 2;
                                        i3 = -1;
                                        i4 = 0;
                                        c5 = 5;
                                    } else {
                                        if (c6 == '\r') {
                                            if (c6 != '!') {
                                            }
                                            i = -1;
                                            if (z) {
                                                while (true) {
                                                    i2 = bufferedReader.read();
                                                    if (i2 != i) {
                                                        break;
                                                    }
                                                    i = -1;
                                                }
                                            } else {
                                                if (Character.isWhitespace(c6)) {
                                                    if (c5 == 3) {
                                                        c5 = 5;
                                                    }
                                                    if (i5 == 0) {
                                                    }
                                                } else {
                                                    c3 = 5;
                                                }
                                                if (c5 != c3) {
                                                    c5 = 0;
                                                } else {
                                                    c5 = 0;
                                                }
                                                if (c5 == 4) {
                                                    i7 = i5;
                                                    c5 = 0;
                                                }
                                                cArr[i5] = c6;
                                                i5++;
                                                c4 = 2;
                                                i3 = -1;
                                                i4 = 0;
                                                z = false;
                                            }
                                            i3 = -1;
                                            i4 = 0;
                                        }
                                        break;
                                        break;
                                    }
                                } else {
                                    if (c6 == '\n') {
                                        if (c6 != '\r') {
                                            if (c6 != 'b') {
                                                c6 = '\b';
                                            } else if (c6 != 'f') {
                                                c6 = '\f';
                                            } else if (c6 != 'n') {
                                                c6 = '\n';
                                            } else if (c6 != 'r') {
                                                c6 = '\r';
                                            } else if (c6 != 133) {
                                                if (c6 != 't') {
                                                    c6 = '\t';
                                                } else if (c6 != 'u') {
                                                    c4 = 2;
                                                    i3 = -1;
                                                    i4 = 0;
                                                    c5 = 2;
                                                    i6 = 0;
                                                    i8 = 0;
                                                }
                                            }
                                            c5 = 0;
                                            if (c5 == 4) {
                                                i7 = i5;
                                                c5 = 0;
                                            }
                                            cArr[i5] = c6;
                                            i5++;
                                            c4 = 2;
                                            i3 = -1;
                                            i4 = 0;
                                            z = false;
                                        } else {
                                            c4 = 2;
                                            i3 = -1;
                                            i4 = 0;
                                            c5 = 3;
                                        }
                                    }
                                    c4 = 2;
                                    i3 = -1;
                                    i4 = 0;
                                    c5 = 5;
                                }
                            } else {
                                i8 = i10;
                                i5 = i11;
                                c4 = 2;
                                i3 = -1;
                            }
                            i4 = 0;
                            c5 = 0;
                        } else if (c5 == 1) {
                            if (c6 != '\n') {
                                if (c5 == 3) {
                                    break;
                                }
                                c4 = 2;
                                i3 = -1;
                                i4 = 0;
                                c5 = 5;
                            } else {
                                if (c6 == '\r') {
                                    if (c6 != '!' || c6 == '#') {
                                        i = -1;
                                        if (z) {
                                            while (true) {
                                                i2 = bufferedReader.read();
                                                if (i2 != i || (c2 = (char) i2) == '\r' || c2 == '\n' || c2 == 133) {
                                                    break;
                                                    break;
                                                    break;
                                                    break;
                                                }
                                                i = -1;
                                            }
                                        } else {
                                            if (Character.isWhitespace(c6)) {
                                                if (c5 == 3) {
                                                    c5 = 5;
                                                }
                                                if (i5 == 0 && i5 != i7) {
                                                    c3 = 5;
                                                    if (c5 != 5) {
                                                        if (i7 == -1) {
                                                            c4 = 2;
                                                            i3 = -1;
                                                            i4 = 0;
                                                            c5 = 4;
                                                        }
                                                    }
                                                }
                                            } else {
                                                c3 = 5;
                                            }
                                            if (c5 != c3 || c5 == 3) {
                                                c5 = 0;
                                            }
                                            if (c5 == 4) {
                                                i7 = i5;
                                                c5 = 0;
                                            }
                                            cArr[i5] = c6;
                                            i5++;
                                            c4 = 2;
                                            i3 = -1;
                                            i4 = 0;
                                            z = false;
                                        }
                                        i3 = -1;
                                        i4 = 0;
                                    } else if (c6 == ':' || c6 == '=') {
                                        i3 = -1;
                                        if (i7 == -1) {
                                            i7 = i5;
                                            c4 = 2;
                                            i4 = 0;
                                            c5 = 0;
                                        } else {
                                            if (Character.isWhitespace(c6)) {
                                                if (c5 == 3) {
                                                    c5 = 5;
                                                }
                                                if (i5 == 0) {
                                                }
                                                i3 = -1;
                                                i4 = 0;
                                            } else {
                                                c3 = 5;
                                            }
                                            if (c5 != c3) {
                                                c5 = 0;
                                            } else {
                                                c5 = 0;
                                            }
                                            if (c5 == 4) {
                                                i7 = i5;
                                                c5 = 0;
                                            }
                                            cArr[i5] = c6;
                                            i5++;
                                            c4 = 2;
                                            i3 = -1;
                                            i4 = 0;
                                            z = false;
                                        }
                                    } else if (c6 == '\\') {
                                        if (c5 == 4) {
                                            i7 = i5;
                                        }
                                        c4 = 2;
                                        i3 = -1;
                                        i4 = 0;
                                        c5 = 1;
                                    } else if (c6 != 133) {
                                        if (Character.isWhitespace(c6)) {
                                            if (c5 == 3) {
                                                c5 = 5;
                                            }
                                            if (i5 == 0) {
                                            }
                                            i3 = -1;
                                            i4 = 0;
                                        } else {
                                            c3 = 5;
                                        }
                                        if (c5 != c3) {
                                            c5 = 0;
                                        } else {
                                            c5 = 0;
                                        }
                                        if (c5 == 4) {
                                            i7 = i5;
                                            c5 = 0;
                                        }
                                        cArr[i5] = c6;
                                        i5++;
                                        c4 = 2;
                                        i3 = -1;
                                        i4 = 0;
                                        z = false;
                                    }
                                }
                                break;
                            }
                        } else {
                            if (c6 == '\n') {
                                if (c6 != '\r') {
                                    if (c6 != 'b') {
                                        c6 = '\b';
                                    } else if (c6 != 'f') {
                                        c6 = '\f';
                                    } else if (c6 != 'n') {
                                        c6 = '\n';
                                    } else if (c6 != 'r') {
                                        c6 = '\r';
                                    } else if (c6 != 133) {
                                        if (c6 != 't') {
                                            c6 = '\t';
                                        } else if (c6 != 'u') {
                                            c4 = 2;
                                            i3 = -1;
                                            i4 = 0;
                                            c5 = 2;
                                            i6 = 0;
                                            i8 = 0;
                                        }
                                    }
                                    c5 = 0;
                                    if (c5 == 4) {
                                        i7 = i5;
                                        c5 = 0;
                                    }
                                    cArr[i5] = c6;
                                    i5++;
                                    c4 = 2;
                                    i3 = -1;
                                    i4 = 0;
                                    z = false;
                                } else {
                                    c4 = 2;
                                    i3 = -1;
                                    i4 = 0;
                                    c5 = 3;
                                }
                            }
                            c4 = 2;
                            i3 = -1;
                            i4 = 0;
                            c5 = 5;
                        }
                    }
                } catch (Throwable th) {
                    IOUtils.safeClose(bufferedReader);
                    throw th;
                }
            }
            if (i5 > 0 || (i5 == 0 && i7 == 0)) {
                if (i7 == -1) {
                    i7 = i5;
                }
                c5 = 0;
                String str2 = new String(cArr, 0, i5);
                c(crashReportData, str2.substring(0, i7), str2.substring(i7));
            } else {
                c5 = 0;
            }
            c4 = 2;
            i3 = -1;
            i4 = 0;
            i5 = 0;
            i7 = -1;
        }
        return crashReportData;
    }

    private void c(@NonNull CrashReportData crashReportData, @NonNull String str, @NonNull String str2) {
        try {
            try {
                crashReportData.put(str, new JSONObject(str2));
            } catch (NumberFormatException unused) {
                str2.hashCode();
                if (str2.equals("true")) {
                    crashReportData.put(str, true);
                } else if (str2.equals("false")) {
                    crashReportData.put(str, false);
                } else {
                    crashReportData.put(str, str2);
                }
            }
        } catch (JSONException unused2) {
            crashReportData.put(str, Double.valueOf(str2).doubleValue());
        }
    }

    public void a() throws Throwable {
        BufferedInputStream bufferedInputStream;
        Exception e2;
        ACRA.log.i(ACRA.LOG_TAG, "Converting unsent ACRA reports to json");
        ReportLocator reportLocator = new ReportLocator(this.a);
        CrashReportPersister crashReportPersister = new CrashReportPersister();
        ArrayList<File> arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(reportLocator.getUnapprovedReports()));
        arrayList.addAll(Arrays.asList(reportLocator.getApprovedReports()));
        int i = 0;
        for (File file : arrayList) {
            BufferedInputStream bufferedInputStream2 = null;
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
                try {
                    try {
                        CrashReportData crashReportDataB = b(new InputStreamReader(bufferedInputStream, "ISO8859-1"));
                        if (crashReportDataB.containsKey(ReportField.REPORT_ID) && crashReportDataB.containsKey(ReportField.USER_CRASH_DATE)) {
                            crashReportPersister.store(crashReportDataB, file);
                            i++;
                        } else {
                            IOUtils.deleteFile(file);
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream2 = bufferedInputStream;
                        IOUtils.safeClose(bufferedInputStream2);
                        throw th;
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    try {
                        crashReportPersister.load(file);
                        if (ACRA.DEV_LOGGING) {
                            ACRA.log.d(ACRA.LOG_TAG, "Tried to convert already converted report file " + file.getPath() + ". Ignoring");
                        }
                    } catch (Exception unused) {
                        ACRA.log.w(ACRA.LOG_TAG, "Unable to read report file " + file.getPath() + ". Deleting", e2);
                        IOUtils.deleteFile(file);
                    }
                }
            } catch (Exception e4) {
                bufferedInputStream = null;
                e2 = e4;
            } catch (Throwable th2) {
                th = th2;
                IOUtils.safeClose(bufferedInputStream2);
                throw th;
            }
            IOUtils.safeClose(bufferedInputStream);
        }
        ACRA.log.i(ACRA.LOG_TAG, "Converted " + i + " unsent reports");
    }
}
