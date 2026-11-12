package ch.qos.logback.core;

import ch.qos.logback.core.recovery.ResilientFileOutputStream;
import ch.qos.logback.core.util.ContextUtil;
import ch.qos.logback.core.util.EnvUtil;
import ch.qos.logback.core.util.FileSize;
import ch.qos.logback.core.util.FileUtil;
import hb.a;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Map;
import p6.b;

/* JADX INFO: loaded from: classes7.dex */
public class FileAppender<E> extends OutputStreamAppender<E> {
    protected static String COLLISION_WITH_EARLIER_APPENDER_URL = "http://logback.qos.ch/codes.html#earlier_fa_collision";
    public static final long DEFAULT_BUFFER_SIZE = 8192;
    protected boolean append = true;
    protected String fileName = null;
    private boolean prudent = false;
    private boolean initialized = false;
    private boolean lazyInit = false;
    private FileSize bufferSize = new FileSize(8192);

    private String getAbsoluteFilePath(String str) {
        return (!EnvUtil.isAndroidOS() || new File(str).isAbsolute()) ? str : FileUtil.prefixRelativePath(this.context.getProperty(CoreConstants.DATA_DIR_KEY), str);
    }

    private void safeWrite(E e4) throws IOException {
        ResilientFileOutputStream resilientFileOutputStream = (ResilientFileOutputStream) getOutputStream();
        FileChannel channel = resilientFileOutputStream.getChannel();
        if (channel == null) {
            return;
        }
        boolean zInterrupted = Thread.interrupted();
        FileLock fileLockLock = null;
        try {
            fileLockLock = channel.lock();
            long jPosition = channel.position();
            long size = channel.size();
            if (size != jPosition) {
                channel.position(size);
            }
            super.writeOut(e4);
        } catch (IOException e14) {
            resilientFileOutputStream.postIOFailure(e14);
        } finally {
            if (fileLockLock != null && fileLockLock.isValid()) {
                fileLockLock.release();
            }
            if (zInterrupted) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void addErrorForCollision(String str, String str2, String str3) {
        StringBuilder sbI = b.i("'", str, "' option has the same value \"", str2, "\" as that given for appender [");
        sbI.append(str3);
        sbI.append("] defined earlier.");
        addError(sbI.toString());
    }

    public boolean checkForFileCollisionInPreviousFileAppenders() {
        Map map;
        boolean z14 = false;
        if (this.fileName == null || (map = (Map) this.context.getObject(CoreConstants.FA_FILENAME_COLLISION_MAP)) == null) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (this.fileName.equals(entry.getValue())) {
                addErrorForCollision("File", (String) entry.getValue(), (String) entry.getKey());
                z14 = true;
            }
        }
        if (this.name != null) {
            map.put(getName(), this.fileName);
        }
        return z14;
    }

    public String getFile() {
        return this.fileName;
    }

    public boolean getLazy() {
        return this.lazyInit;
    }

    public boolean isAppend() {
        return this.append;
    }

    public boolean isPrudent() {
        return this.prudent;
    }

    public boolean openFile(String str) {
        String absoluteFilePath = getAbsoluteFilePath(str);
        this.lock.lock();
        try {
            File file = new File(absoluteFilePath);
            if (!FileUtil.createMissingParentDirectories(file)) {
                addError("Failed to create parent directories for [" + file.getAbsolutePath() + "]");
            }
            ResilientFileOutputStream resilientFileOutputStream = new ResilientFileOutputStream(file, this.append, this.bufferSize.getSize());
            resilientFileOutputStream.setContext(this.context);
            setOutputStream(resilientFileOutputStream);
            return true;
        } finally {
            this.lock.unlock();
        }
    }

    public final String rawFileProperty() {
        return this.fileName;
    }

    public void setAppend(boolean z14) {
        this.append = z14;
    }

    public void setBufferSize(FileSize fileSize) {
        addInfo("Setting bufferSize to [" + fileSize.toString() + "]");
        this.bufferSize = fileSize;
    }

    public void setFile(String str) {
        this.fileName = str == null ? null : str.trim();
    }

    public void setLazy(boolean z14) {
        this.lazyInit = z14;
    }

    public void setPrudent(boolean z14) {
        this.prudent = z14;
    }

    @Override // ch.qos.logback.core.OutputStreamAppender, ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        String file = getFile();
        if (file == null) {
            addError("\"File\" property not set for appender named [" + this.name + "]");
            return;
        }
        String absoluteFilePath = getAbsoluteFilePath(file);
        addInfo("File property is set to [" + absoluteFilePath + "]");
        if (this.prudent && !isAppend()) {
            setAppend(true);
            addWarn("Setting \"Append\" property to true on account of \"Prudent\" mode");
        }
        if (this.lazyInit) {
            setOutputStream(new NOPOutputStream());
        } else {
            if (checkForFileCollisionInPreviousFileAppenders()) {
                addError("Collisions detected with FileAppender/RollingAppender instances defined earlier. Aborting.");
                addError(COLLISION_WITH_EARLIER_APPENDER_URL);
                return;
            }
            try {
                openFile(absoluteFilePath);
            } catch (IOException e4) {
                StringBuilder sbL = a.l("openFile(", absoluteFilePath, ",");
                sbL.append(this.append);
                sbL.append(") failed");
                addError(sbL.toString(), e4);
                return;
            }
        }
        super.start();
    }

    @Override // ch.qos.logback.core.OutputStreamAppender, ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        super.stop();
        Map<String, String> filenameCollisionMap = ContextUtil.getFilenameCollisionMap(this.context);
        if (filenameCollisionMap == null || getName() == null) {
            return;
        }
        filenameCollisionMap.remove(getName());
    }

    @Override // ch.qos.logback.core.OutputStreamAppender
    public void subAppend(E e4) {
        if (!this.initialized && this.lazyInit) {
            this.initialized = true;
            if (checkForFileCollisionInPreviousFileAppenders()) {
                addError("Collisions detected with FileAppender/RollingAppender instances defined earlier. Aborting.");
                addError(COLLISION_WITH_EARLIER_APPENDER_URL);
            } else {
                try {
                    openFile(getFile());
                    super.start();
                } catch (IOException e14) {
                    this.started = false;
                    addError("openFile(" + this.fileName + "," + this.append + ") failed", e14);
                }
            }
        }
        super.subAppend(e4);
    }

    @Override // ch.qos.logback.core.OutputStreamAppender
    public void writeOut(E e4) throws IOException {
        if (this.prudent) {
            safeWrite(e4);
        } else {
            super.writeOut(e4);
        }
    }
}
