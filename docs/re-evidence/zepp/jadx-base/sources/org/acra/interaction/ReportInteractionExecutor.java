package org.acra.interaction;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.acra.ACRA;
import org.acra.config.CoreConfiguration;

/* JADX INFO: loaded from: classes23.dex */
public class ReportInteractionExecutor {
    private final List<ReportInteraction> a;
    private final Context b;
    private final CoreConfiguration c;

    public ReportInteractionExecutor(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration) {
        this.b = context;
        this.c = coreConfiguration;
        this.a = coreConfiguration.pluginLoader().loadEnabled(coreConfiguration, ReportInteraction.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean b(ReportInteraction reportInteraction, File file) throws Exception {
        if (ACRA.DEV_LOGGING) {
            ACRA.log.d(ACRA.LOG_TAG, "Calling ReportInteraction of class " + reportInteraction.getClass().getName());
        }
        return Boolean.valueOf(reportInteraction.performInteraction(this.b, this.c, file));
    }

    public boolean hasInteractions() {
        return this.a.size() > 0;
    }

    public boolean performInteractions(@NonNull final File file) {
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        ArrayList<Future> arrayList = new ArrayList();
        for (final ReportInteraction reportInteraction : this.a) {
            arrayList.add(executorServiceNewCachedThreadPool.submit(new Callable() { // from class: dc6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.b(reportInteraction, file);
                }
            }));
        }
        boolean zBooleanValue = true;
        for (Future future : arrayList) {
            do {
                try {
                    zBooleanValue &= ((Boolean) future.get()).booleanValue();
                } catch (InterruptedException unused) {
                } catch (ExecutionException unused2) {
                }
            } while (!future.isDone());
        }
        return zBooleanValue;
    }
}
