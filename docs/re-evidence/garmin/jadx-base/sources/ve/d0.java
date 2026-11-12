package ve;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lve/d0;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f177563a = new d0();

    private d0() {
    }

    public static final void a(Context context) {
        context.getClass();
        f177563a.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            ue.u uVarA = ue.u.a();
            String[] strArr = e0.f177565a;
            uVarA.getClass();
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            String[] strArr2 = e0.f177565a;
            int iA = p13.t0.a(strArr2.length);
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (String str : strArr2) {
                o13.p pVar = new o13.p(new File(databasePath2.getPath() + str), new File(noBackupFilesDir.getPath() + str));
                linkedHashMap.put(pVar.f128594a, pVar.f128595b);
            }
            for (Map.Entry entry : p13.u0.i(linkedHashMap, new o13.p(databasePath2, noBackupFilesDir)).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        ue.u uVarA2 = ue.u.a();
                        String[] strArr3 = e0.f177565a;
                        file2.toString();
                        uVarA2.getClass();
                    }
                    if (file.renameTo(file2)) {
                        file.toString();
                        file2.toString();
                    } else {
                        file.toString();
                        file2.toString();
                    }
                    ue.u uVarA3 = ue.u.a();
                    String[] strArr4 = e0.f177565a;
                    uVarA3.getClass();
                }
            }
        }
    }
}
