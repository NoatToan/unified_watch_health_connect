package net.lingala.zip4j.tasks;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.progress.ProgressMonitor;

/* JADX INFO: loaded from: classes20.dex */
public abstract class AsyncZipTask<T> {
    private final ExecutorService executorService;
    private final ProgressMonitor progressMonitor;
    private final boolean runInThread;

    protected abstract long calculateTotalWork(T t) throws ZipException;

    protected abstract void executeTask(T t, ProgressMonitor progressMonitor) throws IOException;

    protected abstract ProgressMonitor.Task getTask();

    public AsyncZipTask(e eVar) {
        this.progressMonitor = eVar.f43025a;
        this.runInThread = eVar.f43026b;
        this.executorService = eVar.d;
    }

    public void execute(final T t) throws ZipException {
        if (this.runInThread && ProgressMonitor.State.BUSY.equals(this.progressMonitor.c())) {
            throw new ZipException("invalid operation - Zip4j is in busy state");
        }
        initProgressMonitor();
        if (this.runInThread) {
            this.progressMonitor.b(calculateTotalWork(t));
            this.executorService.execute(new Runnable() { // from class: net.lingala.zip4j.tasks.AsyncZipTask.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AsyncZipTask asyncZipTask = AsyncZipTask.this;
                        asyncZipTask.performTaskWithErrorHandling(t, asyncZipTask.progressMonitor);
                    } catch (ZipException unused) {
                    } finally {
                        AsyncZipTask.this.executorService.shutdown();
                    }
                }
            });
            return;
        }
        performTaskWithErrorHandling(t, this.progressMonitor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performTaskWithErrorHandling(T t, ProgressMonitor progressMonitor) throws ZipException {
        try {
            executeTask(t, progressMonitor);
            progressMonitor.d();
        } catch (ZipException e2) {
            progressMonitor.e(e2);
            throw e2;
        } catch (Exception e3) {
            progressMonitor.e(e3);
            throw new ZipException(e3);
        }
    }

    protected void verifyIfTaskIsCancelled() throws ZipException {
        if (this.progressMonitor.b()) {
            this.progressMonitor.d(ProgressMonitor.Result.CANCELLED);
            this.progressMonitor.c(ProgressMonitor.State.READY);
            throw new ZipException("Task cancelled", ZipException.Type.TASK_CANCELLED_EXCEPTION);
        }
    }

    private void initProgressMonitor() {
        this.progressMonitor.e();
        this.progressMonitor.c(ProgressMonitor.State.BUSY);
        this.progressMonitor.d(getTask());
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ProgressMonitor f43025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f43026b;
        private final ExecutorService d;

        public e(ExecutorService executorService, boolean z, ProgressMonitor progressMonitor) {
            this.d = executorService;
            this.f43026b = z;
            this.f43025a = progressMonitor;
        }
    }
}
