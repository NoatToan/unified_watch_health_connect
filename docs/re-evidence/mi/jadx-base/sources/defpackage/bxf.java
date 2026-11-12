package defpackage;

import cn.miao.health.bean.HeartInfo;
import cn.miao.health.bean.ManualInputInfo;
import cn.miao.health.bean.SleepInfo;

/* JADX INFO: loaded from: classes.dex */
public class bxf {
    public static bxf c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4701b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zwf f4700a = new zwf();

    public static bxf d() {
        if (c == null) {
            synchronized (bxf.class) {
                try {
                    if (c == null) {
                        c = new bxf();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public void a(HeartInfo heartInfo, ywf ywfVar) {
        zwf zwfVar = this.f4700a;
        if (zwfVar != null) {
            zwfVar.a(heartInfo, ywfVar);
        }
    }

    public void b(ManualInputInfo manualInputInfo, ywf ywfVar) {
        zwf zwfVar = this.f4700a;
        if (zwfVar != null) {
            zwfVar.b(manualInputInfo, ywfVar);
        }
    }

    public void c(SleepInfo sleepInfo, ywf ywfVar) {
        zwf zwfVar = this.f4700a;
        if (zwfVar != null) {
            zwfVar.c(sleepInfo, ywfVar);
        }
    }
}
