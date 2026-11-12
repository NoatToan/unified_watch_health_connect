package cn.hutool.core.io.watch;

import cn.hutool.core.io.IORuntimeException;
import defpackage.d8q;
import defpackage.f6r;
import defpackage.fmh;
import defpackage.sm9;
import defpackage.tt3;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.attribute.FileAttribute;

/* JADX INFO: loaded from: classes.dex */
public class WatchMonitor extends WatchServer {
    private static final long serialVersionUID = 1;
    private Path filePath;
    private int maxDepth;
    private Path path;
    private f6r watcher;
    public static final WatchEvent.Kind<?> OVERFLOW = WatchKind.OVERFLOW.getValue();
    public static final WatchEvent.Kind<?> ENTRY_MODIFY = WatchKind.MODIFY.getValue();
    public static final WatchEvent.Kind<?> ENTRY_CREATE = WatchKind.CREATE.getValue();
    public static final WatchEvent.Kind<?> ENTRY_DELETE = WatchKind.DELETE.getValue();
    public static final WatchEvent.Kind<?>[] EVENTS_ALL = WatchKind.ALL;

    public WatchMonitor(File file, WatchEvent.Kind<?>... kindArr) {
        this(file.toPath(), kindArr);
    }

    public static WatchMonitor create(URL url, WatchEvent.Kind<?>... kindArr) {
        return create(url, 0, kindArr);
    }

    public static WatchMonitor createAll(String str, f6r f6rVar) {
        return createAll(Paths.get(str, new String[0]), f6rVar);
    }

    private void doTakeAndWatch(f6r f6rVar) {
        super.watch(f6rVar, new sm9() { // from class: d6r
            @Override // defpackage.sm9
            public final boolean accept(Object obj) {
                return this.f15154a.lambda$doTakeAndWatch$0((WatchEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$doTakeAndWatch$0(WatchEvent watchEvent) {
        Path path = this.filePath;
        return path == null || path.endsWith(watchEvent.context().toString());
    }

    private void registerPath() {
        registerPath(this.path, this.filePath != null ? 0 : this.maxDepth);
    }

    @Override // cn.hutool.core.io.watch.WatchServer
    public void init() throws WatchException {
        Path path = this.path;
        LinkOption linkOption = LinkOption.NOFOLLOW_LINKS;
        if (!Files.exists(path, linkOption)) {
            Path pathC = fmh.c(this.path);
            if (pathC != null) {
                String string = pathC.toString();
                if (tt3.i(string, '.') && !tt3.t(string, ".d")) {
                    Path path2 = this.path;
                    this.filePath = path2;
                    this.path = path2.getParent();
                }
            }
            try {
                Files.createDirectories(this.path, new FileAttribute[0]);
            } catch (IOException e) {
                throw new IORuntimeException(e);
            }
        } else if (Files.isRegularFile(this.path, linkOption)) {
            Path path3 = this.path;
            this.filePath = path3;
            this.path = path3.getParent();
        }
        super.init();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        watch();
    }

    public WatchMonitor setMaxDepth(int i) {
        this.maxDepth = i;
        return this;
    }

    public WatchMonitor setWatcher(f6r f6rVar) {
        this.watcher = f6rVar;
        return this;
    }

    public void watch() {
        watch(this.watcher);
    }

    public WatchMonitor(String str, WatchEvent.Kind<?>... kindArr) {
        this(Paths.get(str, new String[0]), kindArr);
    }

    public static WatchMonitor create(URL url, int i, WatchEvent.Kind<?>... kindArr) {
        return create(d8q.l(url), i, kindArr);
    }

    public void watch(f6r f6rVar) throws WatchException {
        if (this.isClosed) {
            throw new WatchException("Watch Monitor is closed !");
        }
        registerPath();
        while (!this.isClosed) {
            doTakeAndWatch(f6rVar);
        }
    }

    public WatchMonitor(Path path, WatchEvent.Kind<?>... kindArr) {
        this(path, 0, kindArr);
    }

    public static WatchMonitor create(URI uri, WatchEvent.Kind<?>... kindArr) {
        return create(uri, 0, kindArr);
    }

    public static WatchMonitor createAll(URI uri, f6r f6rVar) {
        return createAll(Paths.get(uri), f6rVar);
    }

    public WatchMonitor(Path path, int i, WatchEvent.Kind<?>... kindArr) {
        this.path = path;
        this.maxDepth = i;
        this.events = kindArr;
        init();
    }

    public static WatchMonitor create(URI uri, int i, WatchEvent.Kind<?>... kindArr) {
        return create(Paths.get(uri), i, kindArr);
    }

    public static WatchMonitor createAll(URL url, f6r f6rVar) {
        try {
            return createAll(Paths.get(url.toURI()), f6rVar);
        } catch (URISyntaxException e) {
            throw new WatchException(e);
        }
    }

    public static WatchMonitor create(File file, WatchEvent.Kind<?>... kindArr) {
        return create(file, 0, kindArr);
    }

    public static WatchMonitor create(File file, int i, WatchEvent.Kind<?>... kindArr) {
        return create(file.toPath(), i, kindArr);
    }

    public static WatchMonitor createAll(File file, f6r f6rVar) {
        return createAll(file.toPath(), f6rVar);
    }

    public static WatchMonitor create(String str, WatchEvent.Kind<?>... kindArr) {
        return create(str, 0, kindArr);
    }

    public static WatchMonitor createAll(Path path, f6r f6rVar) {
        WatchMonitor watchMonitorCreate = create(path, EVENTS_ALL);
        watchMonitorCreate.setWatcher(f6rVar);
        return watchMonitorCreate;
    }

    public static WatchMonitor create(String str, int i, WatchEvent.Kind<?>... kindArr) {
        return create(Paths.get(str, new String[0]), i, kindArr);
    }

    public static WatchMonitor create(Path path, WatchEvent.Kind<?>... kindArr) {
        return create(path, 0, kindArr);
    }

    public static WatchMonitor create(Path path, int i, WatchEvent.Kind<?>... kindArr) {
        return new WatchMonitor(path, i, kindArr);
    }
}
