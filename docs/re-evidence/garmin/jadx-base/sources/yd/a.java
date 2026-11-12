package yd;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lyd/a;", "", "", "name", "Ljava/io/File;", "lockDir", "", "processLock", "<init>", "(Ljava/lang/String;Ljava/io/File;Z)V", "a", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C3681a f196748e = new C3681a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f196749f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f196750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f196751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lock f196752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileChannel f196753d;

    public a(String str, File file, boolean z14) {
        Lock lock;
        str.getClass();
        this.f196750a = z14;
        this.f196751b = file != null ? new File(file, str.concat(".lck")) : null;
        f196748e.getClass();
        HashMap map = f196749f;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f196752c = lock;
    }

    public final void a(boolean z14) {
        this.f196752c.lock();
        if (z14) {
            File file = this.f196751b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f196753d = channel;
            } catch (IOException unused) {
                this.f196753d = null;
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f196753d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f196752c.unlock();
    }

    /* JADX INFO: renamed from: yd.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyd/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "Ljava/util/concurrent/locks/Lock;", "threadLocksMap", "Ljava/util/Map;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C3681a {
        public /* synthetic */ C3681a(j jVar) {
            this();
        }

        private C3681a() {
        }
    }
}
