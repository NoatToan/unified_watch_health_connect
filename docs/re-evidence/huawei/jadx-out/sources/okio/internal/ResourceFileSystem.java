package okio.internal;

import com.huawei.operation.ble.BleConstants;
import defpackage.yyp;
import defpackage.yyu;
import defpackage.yyz;
import defpackage.yzp;
import defpackage.zcm;
import defpackage.zcp;
import defpackage.zes;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okio.FileHandle;
import okio.FileMetadata;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.Sink;
import okio.Source;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001/B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0001¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0002J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0005H\u0016J\u0018\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0018\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J \u0010&\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0018\u0010'\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020(2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u001e\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\n0\t*\u00020\u0003H\u0002J\u001a\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n*\u00020+H\u0002J\u001a\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n*\u00020+H\u0002J\f\u0010-\u001a\u00020.*\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\n0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lokio/internal/ResourceFileSystem;", "Lokio/FileSystem;", "classLoader", "Ljava/lang/ClassLoader;", "indexEagerly", "", "systemFileSystem", "(Ljava/lang/ClassLoader;ZLokio/FileSystem;)V", "roots", "", "Lkotlin/Pair;", "Lokio/Path;", "getRoots", "()Ljava/util/List;", "roots$delegate", "Lkotlin/Lazy;", "appendingSink", "Lokio/Sink;", "file", "mustExist", "atomicMove", "", "source", "target", "canonicalize", BleConstants.KEY_PATH, "canonicalizeInternal", "createDirectory", "dir", "mustCreate", "createSymlink", "delete", "list", "listOrNull", "metadataOrNull", "Lokio/FileMetadata;", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "sink", "Lokio/Source;", "toClasspathRoots", "toFileRoot", "Ljava/net/URL;", "toJarRoot", "toRelativePath", "", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ResourceFileSystem extends FileSystem {
    private static final Companion Companion = new Companion(null);
    private static final Path ROOT = Path.Companion.get$default(Path.INSTANCE, "/", false, 1, (Object) null);
    private final ClassLoader classLoader;

    /* JADX INFO: renamed from: roots$delegate, reason: from kotlin metadata */
    private final Lazy roots;
    private final FileSystem systemFileSystem;

    public /* synthetic */ ResourceFileSystem(ClassLoader classLoader, boolean z, FileSystem fileSystem, int i, zcm zcmVar) {
        this(classLoader, z, (i & 4) != 0 ? FileSystem.SYSTEM : fileSystem);
    }

    public ResourceFileSystem(ClassLoader classLoader, boolean z, FileSystem fileSystem) {
        zcp.c(classLoader, "");
        zcp.c(fileSystem, "");
        this.classLoader = classLoader;
        this.systemFileSystem = fileSystem;
        this.roots = yyp.c(new Function0<List<? extends yyu<? extends FileSystem, ? extends Path>>>() { // from class: okio.internal.ResourceFileSystem$roots$2
            @Override // kotlin.jvm.functions.Function0
            public final List<? extends yyu<? extends FileSystem, ? extends Path>> invoke() {
                ResourceFileSystem resourceFileSystem = this.this$0;
                return resourceFileSystem.toClasspathRoots(resourceFileSystem.classLoader);
            }

            {
                super(0);
            }
        });
        if (z) {
            getRoots().size();
        }
    }

    private final List<yyu<FileSystem, Path>> getRoots() {
        return (List) this.roots.getValue();
    }

    @Override // okio.FileSystem
    public Path canonicalize(Path path) {
        zcp.c(path, "");
        return canonicalizeInternal(path);
    }

    private final Path canonicalizeInternal(Path path) {
        return ROOT.resolve(path, true);
    }

    @Override // okio.FileSystem
    public List<Path> list(Path dir) throws FileNotFoundException {
        zcp.c(dir, "");
        String relativePath = toRelativePath(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (yyu<FileSystem, Path> yyuVar : getRoots()) {
            FileSystem fileSystemA = yyuVar.a();
            Path pathE = yyuVar.e();
            try {
                LinkedHashSet linkedHashSet2 = linkedHashSet;
                List<Path> list = fileSystemA.list(pathE.resolve(relativePath));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(yzp.e(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Companion.removeBase((Path) it.next(), pathE));
                }
                yzp.e((Collection) linkedHashSet2, (Iterable) arrayList3);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (!z) {
            throw new FileNotFoundException("file not found: " + dir);
        }
        return yzp.i(linkedHashSet);
    }

    @Override // okio.FileSystem
    public List<Path> listOrNull(Path dir) {
        zcp.c(dir, "");
        String relativePath = toRelativePath(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<yyu<FileSystem, Path>> it = getRoots().iterator();
        boolean z = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            yyu<FileSystem, Path> next = it.next();
            FileSystem fileSystemA = next.a();
            Path pathE = next.e();
            List<Path> listListOrNull = fileSystemA.listOrNull(pathE.resolve(relativePath));
            if (listListOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listListOrNull) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = arrayList2;
                ArrayList arrayList4 = new ArrayList(yzp.e(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(Companion.removeBase((Path) it2.next(), pathE));
                }
                arrayList = arrayList4;
            }
            if (arrayList != null) {
                yzp.e((Collection) linkedHashSet, (Iterable) arrayList);
                z = true;
            }
        }
        if (z) {
            return yzp.i(linkedHashSet);
        }
        return null;
    }

    @Override // okio.FileSystem
    public FileHandle openReadOnly(Path file) throws FileNotFoundException {
        zcp.c(file, "");
        if (!Companion.keepPath(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String relativePath = toRelativePath(file);
        for (yyu<FileSystem, Path> yyuVar : getRoots()) {
            try {
                return yyuVar.a().openReadOnly(yyuVar.e().resolve(relativePath));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean mustCreate, boolean mustExist) throws IOException {
        zcp.c(file, "");
        throw new IOException("resources are not writable");
    }

    @Override // okio.FileSystem
    public FileMetadata metadataOrNull(Path path) throws IOException {
        zcp.c(path, "");
        if (!Companion.keepPath(path)) {
            return null;
        }
        String relativePath = toRelativePath(path);
        for (yyu<FileSystem, Path> yyuVar : getRoots()) {
            FileMetadata fileMetadataMetadataOrNull = yyuVar.a().metadataOrNull(yyuVar.e().resolve(relativePath));
            if (fileMetadataMetadataOrNull != null) {
                return fileMetadataMetadataOrNull;
            }
        }
        return null;
    }

    @Override // okio.FileSystem
    public Source source(Path file) throws FileNotFoundException {
        Source source;
        zcp.c(file, "");
        if (!Companion.keepPath(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        Path path = ROOT;
        InputStream resourceAsStream = this.classLoader.getResourceAsStream(Path.resolve$default(path, file, false, 2, (Object) null).relativeTo(path).toString());
        if (resourceAsStream != null && (source = Okio.source(resourceAsStream)) != null) {
            return source;
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // okio.FileSystem
    public Sink sink(Path file, boolean mustCreate) throws IOException {
        zcp.c(file, "");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public Sink appendingSink(Path file, boolean mustExist) throws IOException {
        zcp.c(file, "");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void createDirectory(Path dir, boolean mustCreate) throws IOException {
        zcp.c(dir, "");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void atomicMove(Path source, Path target) throws IOException {
        zcp.c(source, "");
        zcp.c(target, "");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void delete(Path path, boolean mustExist) throws IOException {
        zcp.c(path, "");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void createSymlink(Path source, Path target) throws IOException {
        zcp.c(source, "");
        zcp.c(target, "");
        throw new IOException(this + " is read-only");
    }

    private final String toRelativePath(Path path) {
        return canonicalizeInternal(path).relativeTo(ROOT).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<yyu<FileSystem, Path>> toClasspathRoots(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources("");
        zcp.b((Object) resources, "");
        ArrayList<URL> list = Collections.list(resources);
        zcp.b((Object) list, "");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            zcp.e(url);
            yyu<FileSystem, Path> fileRoot = toFileRoot(url);
            if (fileRoot != null) {
                arrayList.add(fileRoot);
            }
        }
        ArrayList arrayList2 = arrayList;
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        zcp.b((Object) resources2, "");
        ArrayList<URL> list2 = Collections.list(resources2);
        zcp.b((Object) list2, "");
        ArrayList arrayList3 = new ArrayList();
        for (URL url2 : list2) {
            zcp.e(url2);
            yyu<FileSystem, Path> jarRoot = toJarRoot(url2);
            if (jarRoot != null) {
                arrayList3.add(jarRoot);
            }
        }
        return yzp.d((Collection) arrayList2, (Iterable) arrayList3);
    }

    private final yyu<FileSystem, Path> toFileRoot(URL url) {
        if (zcp.b((Object) url.getProtocol(), (Object) "file")) {
            return yyz.c(this.systemFileSystem, Path.Companion.get$default(Path.INSTANCE, new File(url.toURI()), false, 1, (Object) null));
        }
        return null;
    }

    private final yyu<FileSystem, Path> toJarRoot(URL url) {
        int iD;
        String string = url.toString();
        zcp.b((Object) string, "");
        if (!zes.e(string, "jar:file:", false, 2, (Object) null) || (iD = zes.d((CharSequence) string, "!", 0, false, 6, (Object) null)) == -1) {
            return null;
        }
        Path.Companion companion = Path.INSTANCE;
        String strSubstring = string.substring(4, iD);
        zcp.b((Object) strSubstring, "");
        return yyz.c(ZipFilesKt.openZip(Path.Companion.get$default(companion, new File(URI.create(strSubstring)), false, 1, (Object) null), this.systemFileSystem, new Function1<ZipEntry, Boolean>() { // from class: okio.internal.ResourceFileSystem$toJarRoot$zip$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(ZipEntry zipEntry) {
                zcp.c(zipEntry, "");
                return Boolean.valueOf(ResourceFileSystem.Companion.keepPath(zipEntry.getCanonicalPath()));
            }
        }), ROOT);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lokio/internal/ResourceFileSystem$Companion;", "", "()V", "ROOT", "Lokio/Path;", "getROOT", "()Lokio/Path;", "keepPath", "", BleConstants.KEY_PATH, "removeBase", "base", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public final Path getROOT() {
            return ResourceFileSystem.ROOT;
        }

        public final Path removeBase(Path path, Path path2) {
            zcp.c(path, "");
            zcp.c(path2, "");
            return getROOT().resolve(zes.c(zes.d(path.toString(), (CharSequence) path2.toString()), IOUtils.DIR_SEPARATOR_WINDOWS, '/', false, 4, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean keepPath(Path path) {
            return !zes.a(path.name(), ".class", true);
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }
}
