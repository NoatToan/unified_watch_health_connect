package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lzd/b;", "Landroidx/lifecycle/n0;", "<init>", "()V", "lifecycle-process"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessLifecycleInitializer implements zd.b<n0> {
    @Override // zd.b
    public final n0 create(Context context) {
        context.getClass();
        zd.a aVarC = zd.a.c(context);
        aVarC.getClass();
        if (!aVarC.f203975b.contains(ProcessLifecycleInitializer.class)) {
            vb.h.z("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!j0.f7942a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new j0.a());
        }
        e1.f7874i.getClass();
        e1 e1Var = e1.f7875j;
        e1Var.getClass();
        e1Var.f7880e = new Handler();
        e1Var.f7881f.g(b0.a.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new f1(e1Var));
        return e1Var;
    }

    @Override // zd.b
    public final List<Class<? extends zd.b<?>>> dependencies() {
        return p13.j0.f134944a;
    }
}
