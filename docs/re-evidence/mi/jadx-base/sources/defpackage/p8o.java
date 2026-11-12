package defpackage;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class p8o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f30125a = Pattern.compile("^(?:(.*?)@)?(.*?)\\:([0-9]+)\\:([0-9]+)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f30126b = Pattern.compile("\\s*(?:at)\\s*(.+?)\\s*[@(](.*):([0-9]+):([0-9]+)[)]$");

    public static m8o[] a(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        m8o[] m8oVarArr = new m8o[stackTrace.length];
        for (int i = 0; i < stackTrace.length; i++) {
            m8oVarArr[i] = new b(stackTrace[i].getClassName(), stackTrace[i].getFileName(), stackTrace[i].getMethodName(), stackTrace[i].getLineNumber(), -1);
        }
        return m8oVarArr;
    }

    public static m8o[] b(ReadableArray readableArray) {
        int size = readableArray != null ? readableArray.size() : 0;
        m8o[] m8oVarArr = new m8o[size];
        for (int i = 0; i < size; i++) {
            ReadableType type = readableArray.getType(i);
            if (type == ReadableType.Map) {
                ReadableMap map = readableArray.getMap(i);
                String string = map.getString("methodName");
                m8oVarArr[i] = new b(map.getString("file"), string, (!map.hasKey("lineNumber") || map.isNull("lineNumber")) ? -1 : map.getInt("lineNumber"), (!map.hasKey("column") || map.isNull("column")) ? -1 : map.getInt("column"));
            } else if (type == ReadableType.String) {
                m8oVarArr[i] = new b((String) null, readableArray.getString(i), -1, -1);
            }
        }
        return m8oVarArr;
    }

    public static String c(m8o m8oVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(m8oVar.j());
        int iK = m8oVar.k();
        if (iK > 0) {
            sb.append(":");
            sb.append(iK);
            int iL = m8oVar.l();
            if (iL > 0) {
                sb.append(":");
                sb.append(iL);
            }
        }
        return sb.toString();
    }

    public static class b implements m8o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f30127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f30128b;
        public final int c;
        public final int d;
        public final String e;

        @Override // defpackage.m8o
        public String a() {
            return this.f30128b;
        }

        @Override // defpackage.m8o
        public String j() {
            return this.e;
        }

        @Override // defpackage.m8o
        public int k() {
            return this.c;
        }

        @Override // defpackage.m8o
        public int l() {
            return this.d;
        }

        @Override // defpackage.m8o
        public String m() {
            return this.f30127a;
        }

        public b(String str, String str2, int i, int i2) {
            this.f30127a = str;
            this.f30128b = str2;
            this.c = i;
            this.d = i2;
            this.e = str != null ? new File(str).getName() : "";
        }

        public b(String str, String str2, String str3, int i, int i2) {
            this.f30127a = str;
            this.e = str2;
            this.f30128b = str3;
            this.c = i;
            this.d = i2;
        }
    }
}
