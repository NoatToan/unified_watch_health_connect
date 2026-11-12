package defpackage;

import android.text.TextUtils;
import com.alibaba.android.arouter.facade.template.ILogger;

/* JADX INFO: loaded from: classes.dex */
public class yv5 implements ILogger {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f40602b = false;
    public static boolean c = false;
    public static boolean d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f40603a;

    public yv5(String str) {
        this.f40603a = str;
    }

    public static String a(StackTraceElement stackTraceElement) {
        StringBuilder sb = new StringBuilder("[");
        if (c) {
            String name = Thread.currentThread().getName();
            String fileName = stackTraceElement.getFileName();
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            long id = Thread.currentThread().getId();
            int lineNumber = stackTraceElement.getLineNumber();
            sb.append("ThreadId=");
            sb.append(id);
            sb.append(" & ");
            sb.append("ThreadName=");
            sb.append(name);
            sb.append(" & ");
            sb.append("FileName=");
            sb.append(fileName);
            sb.append(" & ");
            sb.append("ClassName=");
            sb.append(className);
            sb.append(" & ");
            sb.append("MethodName=");
            sb.append(methodName);
            sb.append(" & ");
            sb.append("LineNumber=");
            sb.append(lineNumber);
        }
        sb.append(" ] ");
        return sb.toString();
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public void debug(String str, String str2) {
        if (f40602b) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (TextUtils.isEmpty(str)) {
                getDefaultTag();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(a(stackTraceElement));
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public void error(String str, String str2) {
        if (f40602b) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (TextUtils.isEmpty(str)) {
                getDefaultTag();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(a(stackTraceElement));
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public String getDefaultTag() {
        return this.f40603a;
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public void info(String str, String str2) {
        if (f40602b) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (TextUtils.isEmpty(str)) {
                getDefaultTag();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(a(stackTraceElement));
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public boolean isMonitorMode() {
        return d;
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public void monitor(String str) {
        if (f40602b && isMonitorMode()) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            StringBuilder sb = new StringBuilder();
            sb.append(this.f40603a);
            sb.append("::monitor");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(a(stackTraceElement));
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public void showLog(boolean z) {
        f40602b = z;
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public void showStackTrace(boolean z) {
        c = z;
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public void warning(String str, String str2) {
        if (f40602b) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (TextUtils.isEmpty(str)) {
                getDefaultTag();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(a(stackTraceElement));
        }
    }
}
