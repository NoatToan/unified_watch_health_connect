package defpackage;

import android.content.Context;
import android.net.Uri;
import com.xiaomi.fitness.access.misport.MiSportImportUtilKt;
import com.xiaomi.fitness.schema.export.IntentSchemeHandle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class omc extends IntentSchemeHandle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List<String> f29295a;

    static {
        ArrayList arrayList = new ArrayList();
        f29295a = arrayList;
        arrayList.add("/huamisport/migrate/success");
        f29295a.add("/huamisport/migrate/fail");
    }

    @Override // defpackage.y0c
    public void doProcess(Context context, Uri uri) {
        String path = uri.getPath();
        path.hashCode();
        if (path.equals("/huamisport/migrate/fail") || path.equals("/huamisport/migrate/success")) {
            MiSportImportUtilKt.notifyObserver();
        }
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    public List<String> parameterList() {
        return new ArrayList();
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    public List<String> pathList() {
        return f29295a;
    }
}
