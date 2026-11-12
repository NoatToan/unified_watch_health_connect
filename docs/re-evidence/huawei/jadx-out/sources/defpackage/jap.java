package defpackage;

import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Utils;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.Calendar;
import org.apache.commons.io.input.BoundedInputStream;

/* JADX INFO: loaded from: classes10.dex */
public class jap {
    public static void c(int i) throws Throwable {
        LogUtil.a("TrackDataMockUtil", "insertTrackDetailToDataBase ,day ", Integer.valueOf(i));
        if (i > 7) {
            d();
        } else {
            c();
        }
    }

    private static void c() throws Throwable {
        for (int i = 1; i <= 7; i++) {
            MotionPathSimplify motionPathSimplifyE = e("track", e(i));
            if (motionPathSimplifyE != null) {
                e(motionPathSimplifyE, c("track", b(i), motionPathSimplifyE.requestSportType()), i);
            }
        }
    }

    private static void d() throws Throwable {
        for (int i = 8; i < 38; i++) {
            MotionPathSimplify motionPathSimplifyE = e("track", e(i));
            if (motionPathSimplifyE != null) {
                e(motionPathSimplifyE, c("track", b(i), motionPathSimplifyE.requestSportType()), i);
            }
        }
    }

    private static String e(int i) {
        return "simplemotion_" + String.valueOf(i) + ".txt";
    }

    private static String b(int i) {
        return "motion_path_" + String.valueOf(i) + ".txt";
    }

    private static long d(long j, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i2 = calendar.get(11);
        int i3 = calendar.get(12);
        int i4 = calendar.get(13);
        int i5 = calendar.get(14);
        calendar.clear();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(5, calendar.get(5) - i);
        calendar.set(11, i2);
        calendar.set(12, i3);
        calendar.set(13, i4);
        calendar.set(14, i5);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.clear();
        return timeInMillis;
    }

    private static void e(MotionPathSimplify motionPathSimplify, MotionPath motionPath, int i) {
        if (motionPathSimplify == null || motionPath == null) {
            return;
        }
        if (motionPathSimplify.requestSportType() != 512 && motionPathSimplify.requestFatherSportItem() == null) {
            long jD = d(motionPathSimplify.requestStartTime(), i);
            motionPathSimplify.saveStartTime(jD);
            motionPathSimplify.saveEndTime(jD + motionPathSimplify.requestTotalTime());
        }
        if (Utils.m()) {
            motionPathSimplify.saveMapType(2);
        }
        if (ive.c().a(motionPathSimplify, motionPath) == 0) {
            LogUtil.a("TrackDataMockUtil", "saveTrackToDatabase success, day", Integer.valueOf(i));
        } else {
            LogUtil.a("TrackDataMockUtil", "saveTrackToDatabase failed, day", Integer.valueOf(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [org.apache.commons.io.input.BoundedInputStream] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.io.InputStream, org.apache.commons.io.input.BoundedInputStream] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [org.apache.commons.io.input.BoundedInputStream] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.io.InputStream] */
    private static MotionPath c(String str, String str2, int i) throws Throwable {
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        IndexOutOfBoundsException e;
        IOException e2;
        BufferedReader bufferedReader2;
        ?? r9;
        ?? r10;
        ?? r11;
        ?? r5 = 0;
        try {
            try {
                str = pee.e(str, str2);
                try {
                    str2 = new BoundedInputStream(str, 102400L);
                    try {
                        inputStreamReader = new InputStreamReader((InputStream) str2, "UTF-8");
                        try {
                            bufferedReader2 = new BufferedReader(inputStreamReader, 2048);
                            try {
                                MotionPath motionPathD = izl.d(bufferedReader2, i);
                                e(str2, bufferedReader2, inputStreamReader, str);
                                return motionPathD;
                            } catch (IOException e3) {
                                e2 = e3;
                                LogUtil.a("TrackDataMockUtil", "readMotionPathToData ", LogAnonymous.b(e2));
                                r11 = str;
                                r10 = str2;
                                e(r10, bufferedReader2, inputStreamReader, r11);
                                return null;
                            } catch (IndexOutOfBoundsException e4) {
                                e = e4;
                                LogUtil.a("TrackDataMockUtil", "readMotionPathToData ", e.getMessage());
                                r11 = str;
                                r10 = str2;
                                e(r10, bufferedReader2, inputStreamReader, r11);
                                return null;
                            }
                        } catch (IOException e5) {
                            e2 = e5;
                            bufferedReader2 = null;
                        } catch (IndexOutOfBoundsException e6) {
                            e = e6;
                            bufferedReader2 = null;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = null;
                            r5 = str2;
                            th = th;
                            r9 = str;
                            e(r5, bufferedReader, inputStreamReader, r9);
                            throw th;
                        }
                    } catch (IOException e7) {
                        e2 = e7;
                        inputStreamReader = null;
                        bufferedReader2 = null;
                        LogUtil.a("TrackDataMockUtil", "readMotionPathToData ", LogAnonymous.b(e2));
                        r11 = str;
                        r10 = str2;
                        e(r10, bufferedReader2, inputStreamReader, r11);
                        return null;
                    } catch (IndexOutOfBoundsException e8) {
                        e = e8;
                        inputStreamReader = null;
                        bufferedReader2 = null;
                        LogUtil.a("TrackDataMockUtil", "readMotionPathToData ", e.getMessage());
                        r11 = str;
                        r10 = str2;
                        e(r10, bufferedReader2, inputStreamReader, r11);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        inputStreamReader = null;
                        bufferedReader = null;
                    }
                } catch (IOException e9) {
                    e = e9;
                    e2 = e;
                    str2 = 0;
                    inputStreamReader = null;
                    bufferedReader2 = null;
                    LogUtil.a("TrackDataMockUtil", "readMotionPathToData ", LogAnonymous.b(e2));
                    r11 = str;
                    r10 = str2;
                    e(r10, bufferedReader2, inputStreamReader, r11);
                    return null;
                } catch (IndexOutOfBoundsException e10) {
                    e = e10;
                    e = e;
                    str2 = 0;
                    inputStreamReader = null;
                    bufferedReader2 = null;
                    LogUtil.a("TrackDataMockUtil", "readMotionPathToData ", e.getMessage());
                    r11 = str;
                    r10 = str2;
                    e(r10, bufferedReader2, inputStreamReader, r11);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = null;
                    bufferedReader = null;
                    r9 = str;
                    e(r5, bufferedReader, inputStreamReader, r9);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (IOException e11) {
            e = e11;
            str = 0;
        } catch (IndexOutOfBoundsException e12) {
            e = e12;
            str = 0;
        } catch (Throwable th5) {
            th = th5;
            str = 0;
        }
    }

    private static void e(BoundedInputStream boundedInputStream, BufferedReader bufferedReader, InputStreamReader inputStreamReader, InputStream inputStream) {
        if (boundedInputStream != null) {
            try {
                boundedInputStream.close();
            } catch (FileNotFoundException unused) {
                LogUtil.a("TrackDataMockUtil", "fileNotFound");
            } catch (IOException e) {
                LogUtil.a("TrackDataMockUtil", "readMotionPathToData boundedInputStream finally ", LogAnonymous.b(e));
            }
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (FileNotFoundException unused2) {
                LogUtil.a("TrackDataMockUtil", "fileNotFound");
            } catch (IOException e2) {
                LogUtil.a("TrackDataMockUtil", "readMotionPathToData bufferedReader finally ", LogAnonymous.b(e2));
            }
        }
        if (inputStreamReader != null) {
            try {
                inputStreamReader.close();
            } catch (FileNotFoundException unused3) {
                LogUtil.a("TrackDataMockUtil", "fileNotFound");
            } catch (IOException e3) {
                LogUtil.a("TrackDataMockUtil", "readMotionPathToData inputStreamReader finally ", LogAnonymous.b(e3));
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (FileNotFoundException unused4) {
                LogUtil.a("TrackDataMockUtil", "fileNotFound");
            } catch (IOException e4) {
                LogUtil.a("TrackDataMockUtil", "readMotionPathToData inputStream finally ", LogAnonymous.b(e4));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:88:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v23, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v32, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v33, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v59 */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v61 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v4 */
    private static MotionPathSimplify e(String str, String str2) throws Throwable {
        ?? r11;
        Throwable e;
        InputStream inputStreamE;
        ?? r6 = 0;
        motionPathSimplify = null;
        motionPathSimplify = null;
        motionPathSimplify = null;
        motionPathSimplify = null;
        motionPathSimplify = null;
        motionPathSimplify = null;
        motionPathSimplify = null;
        MotionPathSimplify motionPathSimplify = null;
        try {
            try {
                inputStreamE = pee.e(str, str2);
                try {
                    str2 = new ObjectInputStream(inputStreamE);
                    try {
                        MotionPathSimplify motionPathSimplify2 = (MotionPathSimplify) str2.readObject();
                        Object obj = inputStreamE;
                        if (inputStreamE != null) {
                            try {
                                inputStreamE.close();
                                obj = inputStreamE;
                            } catch (FileNotFoundException unused) {
                                Object[] objArr = {"fileNotFound"};
                                LogUtil.a("TrackDataMockUtil", objArr);
                                obj = objArr;
                            } catch (IOException e2) {
                                Object[] objArr2 = {"inputStream ", LogAnonymous.b(e2)};
                                LogUtil.a("TrackDataMockUtil", objArr2);
                                obj = objArr2;
                            }
                        }
                        try {
                            str2.close();
                            str = obj;
                        } catch (FileNotFoundException unused2) {
                            Object[] objArr3 = {"fileNotFound"};
                            LogUtil.a("TrackDataMockUtil", objArr3);
                            str = objArr3;
                        } catch (IOException e3) {
                            Object[] objArr4 = {"ois ", LogAnonymous.b(e3)};
                            LogUtil.a("TrackDataMockUtil", objArr4);
                            str = objArr4;
                        }
                        motionPathSimplify = motionPathSimplify2;
                    } catch (FileNotFoundException unused3) {
                        LogUtil.a("TrackDataMockUtil", "fileNotFound");
                        str = inputStreamE;
                        if (inputStreamE != null) {
                            try {
                                inputStreamE.close();
                                str = inputStreamE;
                            } catch (FileNotFoundException unused4) {
                                Object[] objArr5 = {"fileNotFound"};
                                LogUtil.a("TrackDataMockUtil", objArr5);
                                str = objArr5;
                            } catch (IOException e4) {
                                Object[] objArr6 = {"inputStream ", LogAnonymous.b(e4)};
                                LogUtil.a("TrackDataMockUtil", objArr6);
                                str = objArr6;
                            }
                        }
                        if (str2 != 0) {
                            try {
                                str2.close();
                            } catch (FileNotFoundException unused5) {
                                str = new Object[]{"fileNotFound"};
                                LogUtil.a("TrackDataMockUtil", (Object[]) str);
                            } catch (IOException e5) {
                                str = new Object[]{"ois ", LogAnonymous.b(e5)};
                                LogUtil.a("TrackDataMockUtil", (Object[]) str);
                            }
                        }
                    } catch (IOException e6) {
                        e = e6;
                        LogUtil.a("TrackDataMockUtil", "getMotionPathSimplify ", LogAnonymous.b(e));
                        str = inputStreamE;
                        if (inputStreamE != null) {
                            try {
                                inputStreamE.close();
                                str = inputStreamE;
                            } catch (FileNotFoundException unused6) {
                                Object[] objArr7 = {"fileNotFound"};
                                LogUtil.a("TrackDataMockUtil", objArr7);
                                str = objArr7;
                            } catch (IOException e7) {
                                Object[] objArr8 = {"inputStream ", LogAnonymous.b(e7)};
                                LogUtil.a("TrackDataMockUtil", objArr8);
                                str = objArr8;
                            }
                        }
                        if (str2 != 0) {
                            try {
                                str2.close();
                            } catch (FileNotFoundException unused7) {
                                str = new Object[]{"fileNotFound"};
                                LogUtil.a("TrackDataMockUtil", (Object[]) str);
                            } catch (IOException e8) {
                                str = new Object[]{"ois ", LogAnonymous.b(e8)};
                                LogUtil.a("TrackDataMockUtil", (Object[]) str);
                            }
                        }
                    } catch (ClassNotFoundException e9) {
                        e = e9;
                        LogUtil.a("TrackDataMockUtil", "getMotionPathSimplify ", LogAnonymous.b(e));
                        str = inputStreamE;
                        if (inputStreamE != null) {
                            inputStreamE.close();
                            str = inputStreamE;
                        }
                        if (str2 != 0) {
                            str2.close();
                        }
                    }
                } catch (FileNotFoundException unused8) {
                    str2 = 0;
                } catch (IOException e10) {
                    e = e10;
                    e = e;
                    str2 = 0;
                    LogUtil.a("TrackDataMockUtil", "getMotionPathSimplify ", LogAnonymous.b(e));
                    str = inputStreamE;
                    if (inputStreamE != null) {
                        inputStreamE.close();
                        str = inputStreamE;
                    }
                    if (str2 != 0) {
                        str2.close();
                    }
                    return motionPathSimplify;
                } catch (ClassNotFoundException e11) {
                    e = e11;
                    e = e;
                    str2 = 0;
                    LogUtil.a("TrackDataMockUtil", "getMotionPathSimplify ", LogAnonymous.b(e));
                    str = inputStreamE;
                    if (inputStreamE != null) {
                        inputStreamE.close();
                        str = inputStreamE;
                    }
                    if (str2 != 0) {
                        str2.close();
                    }
                    return motionPathSimplify;
                } catch (Throwable th) {
                    th = th;
                    r6 = inputStreamE;
                    r11 = 0;
                    if (r6 != 0) {
                        try {
                            r6.close();
                        } catch (FileNotFoundException unused9) {
                            LogUtil.a("TrackDataMockUtil", "fileNotFound");
                        } catch (IOException e12) {
                            LogUtil.a("TrackDataMockUtil", "inputStream ", LogAnonymous.b(e12));
                        }
                    }
                    if (r11 == 0) {
                        throw th;
                    }
                    try {
                        r11.close();
                        throw th;
                    } catch (FileNotFoundException unused10) {
                        LogUtil.a("TrackDataMockUtil", "fileNotFound");
                        throw th;
                    } catch (IOException e13) {
                        LogUtil.a("TrackDataMockUtil", "ois ", LogAnonymous.b(e13));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                r6 = str;
                r11 = str2;
                th = th2;
            }
        } catch (FileNotFoundException unused11) {
            inputStreamE = null;
            str2 = 0;
        } catch (IOException e14) {
            e = e14;
            e = e;
            inputStreamE = null;
            str2 = 0;
            LogUtil.a("TrackDataMockUtil", "getMotionPathSimplify ", LogAnonymous.b(e));
            str = inputStreamE;
            if (inputStreamE != null) {
                inputStreamE.close();
                str = inputStreamE;
            }
            if (str2 != 0) {
                str2.close();
            }
            return motionPathSimplify;
        } catch (ClassNotFoundException e15) {
            e = e15;
            e = e;
            inputStreamE = null;
            str2 = 0;
            LogUtil.a("TrackDataMockUtil", "getMotionPathSimplify ", LogAnonymous.b(e));
            str = inputStreamE;
            if (inputStreamE != null) {
                inputStreamE.close();
                str = inputStreamE;
            }
            if (str2 != 0) {
                str2.close();
            }
            return motionPathSimplify;
        } catch (Throwable th3) {
            th = th3;
            r11 = 0;
        }
        return motionPathSimplify;
    }
}
