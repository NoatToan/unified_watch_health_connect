package cn.hutool.core.io.watch;

import cn.hutool.core.io.watch.WatchServer;
import defpackage.cid;
import defpackage.f6r;
import defpackage.qj1;
import defpackage.sm9;
import defpackage.y3r;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.AccessDeniedException;
import java.nio.file.ClosedWatchServiceException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class WatchServer extends Thread implements Closeable, Serializable {
    private static final long serialVersionUID = 1;
    protected WatchEvent.Kind<?>[] events;
    protected boolean isClosed;
    private WatchEvent.Modifier[] modifiers;
    private final Map<WatchKey, Path> watchKeyPathMap = new HashMap();
    private WatchService watchService;

    public class a extends SimpleFileVisitor<Path> {
        public a() {
        }

        @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileVisitResult postVisitDirectory(Path path, IOException iOException) throws IOException {
            WatchServer.this.registerPath(path, 0);
            return super.postVisitDirectory(path, iOException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$watch$0(f6r f6rVar, WatchEvent watchEvent, Path path) {
        WatchEvent.Kind<?> kind = watchEvent.kind();
        if (kind == WatchKind.CREATE.getValue()) {
            f6rVar.d(watchEvent, path);
            return;
        }
        if (kind == WatchKind.MODIFY.getValue()) {
            f6rVar.a(watchEvent, path);
        } else if (kind == WatchKind.DELETE.getValue()) {
            f6rVar.b(watchEvent, path);
        } else if (kind == WatchKind.OVERFLOW.getValue()) {
            f6rVar.c(watchEvent, path);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.isClosed = true;
        cid.a(this.watchService);
    }

    public void init() throws WatchException {
        try {
            this.watchService = FileSystems.getDefault().newWatchService();
            this.isClosed = false;
        } catch (IOException e) {
            throw new WatchException(e);
        }
    }

    public void registerPath(Path path, int i) {
        WatchEvent.Kind<?>[] kindArr = (WatchEvent.Kind[]) qj1.q(this.events, WatchKind.ALL);
        try {
            this.watchKeyPathMap.put(qj1.D(this.modifiers) ? path.register(this.watchService, kindArr) : path.register(this.watchService, kindArr, this.modifiers), path);
            if (i > 1) {
                Files.walkFileTree(path, EnumSet.noneOf(FileVisitOption.class), i, new a());
            }
        } catch (IOException e) {
            if (!(e instanceof AccessDeniedException)) {
                throw new WatchException(e);
            }
        }
    }

    public void setModifiers(WatchEvent.Modifier[] modifierArr) {
        this.modifiers = modifierArr;
    }

    public void watch(y3r y3rVar, sm9<WatchEvent<?>> sm9Var) {
        try {
            WatchKey watchKeyTake = this.watchService.take();
            Path path = this.watchKeyPathMap.get(watchKeyTake);
            for (WatchEvent<?> watchEvent : watchKeyTake.pollEvents()) {
                if (sm9Var == null || sm9Var.accept(watchEvent)) {
                    y3rVar.a(watchEvent, path);
                }
            }
            watchKeyTake.reset();
        } catch (InterruptedException | ClosedWatchServiceException unused) {
            close();
        }
    }

    public void watch(final f6r f6rVar, sm9<WatchEvent<?>> sm9Var) {
        watch(new y3r() { // from class: e6r
            @Override // defpackage.y3r
            public final void a(WatchEvent watchEvent, Path path) {
                WatchServer.lambda$watch$0(f6rVar, watchEvent, path);
            }
        }, sm9Var);
    }
}
