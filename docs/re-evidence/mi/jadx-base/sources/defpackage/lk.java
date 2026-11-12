package defpackage;

import android.os.Process;
import android.util.Log;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class lk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f25144a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f25145b = new d();

    public static class a extends c {
        public static final String[] d = {" D(", " D(", " V(", " D(", " I(", " W(", " E(", " A(", " D(", " D("};
        public final DateFormat c = new SimpleDateFormat("yyyyMMdd HH:mm:ss.SSS", Locale.US);

        @Override // lk.c, lk.e
        public boolean a() {
            return lk.f25144a.h();
        }

        /* JADX WARN: Code duplicated, block: B:52:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // lk.c
        public void i(int i, String str, String str2) {
            FileWriter fileWriter;
            Throwable th;
            IOException e;
            File fileA = lk.f25144a.a();
            if (fileA == null) {
                return;
            }
            if (fileA.exists() && fileA.length() > lk.f25144a.b()) {
                fileA.delete();
            }
            if (!fileA.exists()) {
                try {
                    fileA.createNewFile();
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return;
                }
            }
            synchronized (this.c) {
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.c.format(new Date()));
                sb.append(d[i]);
                sb.append(Process.myPid());
                sb.append(')');
                sb.append(str2);
                sb.append('\n');
                try {
                    try {
                        fileWriter = new FileWriter(fileA, true);
                        try {
                            try {
                                fileWriter.write(sb.toString());
                                fileWriter.flush();
                                fileWriter.close();
                            } catch (IOException e3) {
                                e = e3;
                                e.printStackTrace();
                                if (fileWriter != null) {
                                    fileWriter.close();
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (fileWriter != null) {
                                try {
                                    fileWriter.close();
                                } catch (Exception e4) {
                                    e4.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                } catch (IOException e6) {
                    fileWriter = null;
                    e = e6;
                } catch (Throwable th3) {
                    fileWriter = null;
                    th = th3;
                    if (fileWriter != null) {
                        fileWriter.close();
                    }
                    throw th;
                }
            }
        }

        @Override // lk.c
        public boolean o() {
            return true;
        }
    }

    public enum b {
        NONE,
        CONSOLE_ONLY,
        FILE_ONLY,
        FULL
    }

    public static class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static ThreadLocal<String> f25146a = new ThreadLocal<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static ThreadLocal<Integer> f25147b = new ThreadLocal<>();

        @Override // lk.e
        public void a(String str, String str2, Object... objArr) {
            l(str, str2, null, objArr);
        }

        @Override // lk.e
        public void b(String str, String str2, Object... objArr) {
            j(4, str, str2, objArr);
        }

        @Override // lk.e
        public void c(String str, String str2, Object... objArr) {
            j(3, str, str2, objArr);
        }

        @Override // lk.e
        public void d(String str, String str2, Object... objArr) {
            j(2, str, str2, objArr);
        }

        public final int e(StackTraceElement[] stackTraceElementArr) {
            for (int i = 4; i < stackTraceElementArr.length; i++) {
                String className = stackTraceElementArr[i].getClassName();
                if (!className.equals(c.class.getName()) && !className.equals(lk.class.getName()) && !className.equals(d.class.getName())) {
                    return i - 1;
                }
            }
            return -1;
        }

        public String f(int i, String str, int i2) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            int iE = e(stackTrace) + lk.f25144a.d();
            if (i2 + iE > stackTrace.length) {
                i2 = (stackTrace.length - iE) - 1;
            }
            StringBuilder sb = new StringBuilder();
            String str2 = "";
            for (int i3 = i2; i3 > 0; i3--) {
                if (lk.f25144a.i() && i3 == i2) {
                    sb.append('(');
                    sb.append(Thread.currentThread().getName());
                    sb.append(") ");
                }
                int i4 = i3 + iE;
                if (i4 < stackTrace.length) {
                    String strG = g(stackTrace[i4].getClassName());
                    sb.append(str2);
                    sb.append(strG);
                    sb.append('.');
                    sb.append(stackTrace[i4].getMethodName());
                    sb.append(AbstractJsonLexerKt.COLON);
                    sb.append(stackTrace[i4].getLineNumber());
                    str2 = " -> ";
                }
            }
            return sb.toString();
        }

        public final String g(String str) {
            return str.substring(str.lastIndexOf(".") + 1);
        }

        public String h(String str, Object... objArr) {
            return objArr.length == 0 ? str : String.format(str, objArr);
        }

        public void i(int i, String str, String str2) {
            if (i != 7) {
                return;
            }
            Log.wtf(str, str2);
        }

        public void j(int i, String str, String str2, Object... objArr) {
            String strN = n();
            String strH = h(str2, objArr);
            int iM = m();
            d(i, iM, f(i, strN, iM), strN, str, strH);
        }

        public final void k(int i, Throwable th, String str, String str2, Object[] objArr) {
            if (th != null && str2 != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            if (th != null && str2 == null) {
                str2 = Log.getStackTraceString(th);
            }
            if (str2 == null) {
                str2 = "No message/exception is set";
            }
            j(i, str, str2, objArr);
        }

        public void l(String str, String str2, Throwable th, Object... objArr) {
            k(5, th, str, str2, objArr);
        }

        public int m() {
            Integer num = f25147b.get();
            int iC = lk.f25144a.c();
            if (num != null) {
                f25147b.remove();
                iC = num.intValue();
            }
            if (iC >= 0) {
                return iC;
            }
            throw new IllegalStateException("MethodCount cannot be Negative!!");
        }

        public String n() {
            String str = f25146a.get();
            if (str == null) {
                return lk.f25144a.e();
            }
            f25146a.remove();
            return str;
        }

        public boolean o() {
            return false;
        }

        @Override // lk.e
        public boolean a() {
            return lk.f25144a.f();
        }

        @Override // lk.e
        public void d(int i, int i2, String str, String str2, String str3, String str4) {
            StringBuilder sb = new StringBuilder();
            sb.append("────────────────────────────────────────\n");
            sb.append(str);
            sb.append('\n');
            byte[] bytes = str4.getBytes();
            int length = bytes.length;
            if ((length <= 4000) || o()) {
                if (i2 > 0 && !o()) {
                    sb.append(" ───────────────────────────────────────\n");
                }
                sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb.append(str3);
                sb.append("] ");
                sb.append(str4);
                if (o()) {
                    sb.append('\n');
                }
                i(i, str2, sb.toString());
                return;
            }
            if (i2 > 0) {
                sb.append(" ───────────────────────────────────────\n");
            }
            for (int i3 = 0; i3 < length; i3 += 4000) {
                int iMin = Math.min(length - i3, 4000);
                sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb.append(str3);
                sb.append("] ");
                sb.append(new String(bytes, i3, iMin));
                i(i, str2, sb.toString());
                sb.setLength(0);
            }
        }
    }

    public static class d extends c {
        public List<e> c = new ArrayList();
        public e d = new c();
        public e e = new a();

        public d() {
            this.c.add(this.d);
            this.c.add(this.e);
        }

        @Override // lk.c, lk.e
        public boolean a() {
            return lk.f25144a.g();
        }

        @Override // lk.c
        public void j(int i, String str, String str2, Object... objArr) {
            if (a()) {
                String strN = n();
                String strH = h(str2, objArr);
                int iM = m();
                String strF = f(i, strN, iM);
                if (i == 2) {
                    if (this.d.a()) {
                        this.d.d(i, iM, strF, strN, str, strH);
                    }
                } else {
                    for (e eVar : this.c) {
                        if (eVar.a()) {
                            eVar.d(i, iM, strF, strN, str, strH);
                        }
                    }
                }
            }
        }
    }

    public interface e {
        void a(String str, String str2, Object... objArr);

        boolean a();

        void b(String str, String str2, Object... objArr);

        void c(String str, String str2, Object... objArr);

        void d(int i, int i2, String str, String str2, String str3, String str4);

        void d(String str, String str2, Object... objArr);
    }

    public static class f {
        public File f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f25148a = "LOG";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f25149b = true;
        public int c = 2;
        public int d = 0;
        public b e = b.CONSOLE_ONLY;
        public long g = 25165824;

        public File a() {
            return this.f;
        }

        public long b() {
            return this.g;
        }

        public int c() {
            return this.c;
        }

        public int d() {
            return this.d;
        }

        public String e() {
            return this.f25148a;
        }

        public boolean f() {
            b bVar = this.e;
            return bVar == b.CONSOLE_ONLY || bVar == b.FULL;
        }

        public boolean g() {
            return this.e != b.NONE;
        }

        public boolean h() {
            b bVar = this.e;
            return bVar == b.FILE_ONLY || bVar == b.FULL;
        }

        public boolean i() {
            return this.f25149b;
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        f25145b.c(str, str2, objArr);
    }

    public static void c(String str, String str2, Object... objArr) {
        f25145b.b(str, str2, objArr);
    }

    public static void d(String str, String str2, Object... objArr) {
        f25145b.d(str, str2, objArr);
    }

    public static void e(String str, String str2, Object... objArr) {
        f25145b.a(str, str2, objArr);
    }
}
