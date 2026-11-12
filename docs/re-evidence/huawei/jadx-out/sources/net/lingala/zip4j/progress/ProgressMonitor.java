package net.lingala.zip4j.progress;

/* JADX INFO: loaded from: classes20.dex */
public class ProgressMonitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f43019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Exception f43020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f43021c;
    private String d;
    private Task e;
    private State f;
    private Result g;
    private long h;
    private long i;
    private int j;

    public enum Result {
        SUCCESS,
        WORK_IN_PROGRESS,
        ERROR,
        CANCELLED
    }

    public enum State {
        READY,
        BUSY
    }

    public enum Task {
        NONE,
        ADD_ENTRY,
        REMOVE_ENTRY,
        CALCULATE_CRC,
        EXTRACT_ENTRY,
        MERGE_ZIP_FILES,
        SET_COMMENT,
        RENAME_FILE
    }

    public ProgressMonitor() {
        a();
    }

    public void a(long j) {
        long j2 = this.i + j;
        this.i = j2;
        long j3 = this.h;
        if (j3 > 0) {
            int i = (int) ((j2 * 100) / j3);
            this.j = i;
            if (i > 100) {
                this.j = 100;
            }
        }
        while (this.f43019a) {
            try {
                Thread.sleep(150L);
            } catch (InterruptedException unused) {
            }
        }
    }

    public void d() {
        this.g = Result.SUCCESS;
        this.j = 100;
        a();
    }

    public void e(Exception exc) {
        this.g = Result.ERROR;
        this.f43020b = exc;
        a();
    }

    public void e() {
        a();
        this.d = null;
        this.h = 0L;
        this.i = 0L;
        this.j = 0;
    }

    private void a() {
        this.e = Task.NONE;
        this.f = State.READY;
    }

    public State c() {
        return this.f;
    }

    public void c(State state) {
        this.f = state;
    }

    public void b(long j) {
        this.h = j;
    }

    public void d(Task task) {
        this.e = task;
    }

    public void b(String str) {
        this.d = str;
    }

    public void d(Result result) {
        this.g = result;
    }

    public boolean b() {
        return this.f43021c;
    }
}
