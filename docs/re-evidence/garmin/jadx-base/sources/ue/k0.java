package ue;

import android.content.Context;
import androidx.work.WorkerParameters;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lue/k0;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class k0 {
    public abstract void a(Context context, String str, WorkerParameters workerParameters);

    public final androidx.work.d b(Context context, String str, WorkerParameters workerParameters) {
        context.getClass();
        str.getClass();
        a(context, str, workerParameters);
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(androidx.work.d.class);
            clsAsSubclass.getClass();
            try {
                Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                objNewInstance.getClass();
                androidx.work.d dVar = (androidx.work.d) objNewInstance;
                if (!dVar.f11472d) {
                    return dVar;
                }
                throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
            } catch (Throwable th3) {
                u uVarA = u.a();
                int i14 = l0.f170110a;
                "Could not instantiate ".concat(str);
                uVarA.getClass();
                throw th3;
            }
        } catch (Throwable th4) {
            u uVarA2 = u.a();
            int i15 = l0.f170110a;
            "Invalid class: ".concat(str);
            uVarA2.getClass();
            throw th4;
        }
    }
}
