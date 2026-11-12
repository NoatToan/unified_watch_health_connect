package defpackage;

import android.content.Context;
import android.net.Uri;
import com.xiaomi.fitness.common.log.Logger;

/* JADX INFO: loaded from: classes8.dex */
public class fgl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Uri f17767a;

    public static void a(Context context, Uri uri) {
        wfl wflVarC = xfl.a().c(uri);
        Logger.i("SchemaUtil", "doSchemaUri handler" + wflVarC);
        if (wflVarC != null) {
            Logger.i("SchemaUtil", "doSchemaUri handler.class=" + wflVarC.getClass() + " uri=" + uri);
            wflVarC.process(context, uri, null);
        }
    }

    public static void b(Uri uri) {
        f17767a = uri;
    }
}
