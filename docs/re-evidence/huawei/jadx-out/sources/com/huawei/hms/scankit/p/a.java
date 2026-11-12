package com.huawei.hms.scankit.p;

/* JADX INFO: loaded from: classes10.dex */
public class a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final boolean f15955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final StackTraceElement[] f15956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f15957c;

    static {
        f15955a = System.getProperty("surefire.test.class.path") != null;
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[0];
        f15956b = stackTraceElementArr;
        a aVar = new a();
        f15957c = aVar;
        aVar.setStackTrace(stackTraceElementArr);
    }

    public static a a() {
        return f15955a ? new a() : f15957c;
    }

    public static a a(String str) {
        return new a(str);
    }

    private a() {
    }

    private a(String str) {
        super(str);
    }
}
