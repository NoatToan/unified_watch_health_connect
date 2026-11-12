package ch.qos.logback.core.recovery;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.status.ErrorStatus;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusManager;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ResilientOutputStreamBase extends OutputStream {
    static final int STATUS_COUNT_LIMIT = 8;
    private Context context;

    /* JADX INFO: renamed from: os, reason: collision with root package name */
    protected OutputStream f27284os;
    private RecoveryCoordinator recoveryCoordinator;
    private int noContextWarning = 0;
    private int statusCount = 0;
    protected boolean presumedClean = true;

    private boolean isPresumedInError() {
        return (this.recoveryCoordinator == null || this.presumedClean) ? false : true;
    }

    private void postSuccessfulWrite() {
        if (this.recoveryCoordinator != null) {
            this.recoveryCoordinator = null;
            this.statusCount = 0;
            addStatus(new InfoStatus("Recovered from IO failure on " + getDescription(), this));
        }
    }

    public void addStatus(Status status) {
        Context context = this.context;
        if (context != null) {
            StatusManager statusManager = context.getStatusManager();
            if (statusManager != null) {
                statusManager.add(status);
                return;
            }
            return;
        }
        int i14 = this.noContextWarning;
        this.noContextWarning = i14 + 1;
        if (i14 == 0) {
            System.out.println("LOGBACK: No context given for " + this);
        }
    }

    public void addStatusIfCountNotOverLimit(Status status) {
        int i14 = this.statusCount + 1;
        this.statusCount = i14;
        if (i14 < 8) {
            addStatus(status);
        }
        if (this.statusCount == 8) {
            addStatus(status);
            addStatus(new InfoStatus("Will supress future messages regarding " + getDescription(), this));
        }
    }

    public void attemptRecovery() {
        try {
            close();
        } catch (IOException unused) {
        }
        addStatusIfCountNotOverLimit(new InfoStatus("Attempting to recover from IO failure on " + getDescription(), this));
        try {
            this.f27284os = openNewOutputStream();
            this.presumedClean = true;
        } catch (IOException e4) {
            addStatusIfCountNotOverLimit(new ErrorStatus("Failed to open " + getDescription(), this, e4));
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this.f27284os;
        if (outputStream != null) {
            outputStream.close();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        OutputStream outputStream = this.f27284os;
        if (outputStream != null) {
            try {
                outputStream.flush();
                postSuccessfulWrite();
            } catch (IOException e4) {
                postIOFailure(e4);
            }
        }
    }

    public Context getContext() {
        return this.context;
    }

    public abstract String getDescription();

    public abstract OutputStream openNewOutputStream();

    public void postIOFailure(IOException iOException) {
        addStatusIfCountNotOverLimit(new ErrorStatus("IO failure while writing to " + getDescription(), this, iOException));
        this.presumedClean = false;
        if (this.recoveryCoordinator == null) {
            this.recoveryCoordinator = new RecoveryCoordinator();
        }
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override // java.io.OutputStream
    public void write(int i14) {
        if (isPresumedInError()) {
            if (this.recoveryCoordinator.isTooSoon()) {
                return;
            }
            attemptRecovery();
        } else {
            try {
                this.f27284os.write(i14);
                postSuccessfulWrite();
            } catch (IOException e4) {
                postIOFailure(e4);
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i14, int i15) {
        if (isPresumedInError()) {
            if (this.recoveryCoordinator.isTooSoon()) {
                return;
            }
            attemptRecovery();
        } else {
            try {
                this.f27284os.write(bArr, i14, i15);
                postSuccessfulWrite();
            } catch (IOException e4) {
                postIOFailure(e4);
            }
        }
    }
}
