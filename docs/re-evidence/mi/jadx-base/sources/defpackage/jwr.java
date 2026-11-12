package defpackage;

import android.app.Application;

/* JADX INFO: loaded from: classes2.dex */
public class jwr {
    public static iwr a(Application application, i1d i1dVar) {
        if (i1dVar == null) {
            return null;
        }
        return new iwr.a().a(application).c(i1dVar.getDevMode(application)).d(i1dVar.getConfigList(application)).b();
    }

    public static void b(Application application, i1d i1dVar) {
        if (ayr.b().e()) {
            return;
        }
        if (i1dVar == null) {
            throw new RuntimeException("Please init YRNManager before YRNControllerManager!");
        }
        iwr iwrVarA = a(application, i1dVar);
        if (iwrVarA != null) {
            ayr.b().c(iwrVarA);
        }
    }
}
