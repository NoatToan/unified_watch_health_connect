package kotlin.io;

import com.huawei.health.suggestion.model.FitRunPlayAudio;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import defpackage.yyv;
import defpackage.yzc;
import defpackage.zbt;
import defpackage.zcp;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import ohos.ace.plugin.taskmanagerplugin.EventType;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001b\u001c\u001dB\u008b\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u00128\u0010\u000b\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\n\u0018\u00010\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015B\u001b\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0016J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0096\u0002J\u001a\u0010\u0006\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007J\u001a\u0010\t\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0007J \u0010\u000b\u001a\u00020\u00002\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\fJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R@\u0010\u000b\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\n\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lkotlin/io/FileTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "start", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lkotlin/io/FileWalkDirection;", "onEnter", "Lkotlin/Function1;", "", "onLeave", "", "onFail", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "f", "Ljava/io/IOException;", FitRunPlayAudio.OPPORTUNITY_E, "maxDepth", "", "<init>", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V", "iterator", "", "function", "depth", "WalkState", "DirectoryState", "FileTreeWalkIterator", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FileTreeWalk implements Sequence<File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function2<File, IOException, yzc> f39323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileWalkDirection f39324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1<File, yzc> f39325c;
    private final Function1<File, Boolean> d;
    private final int e;
    private final File h;

    @Override // kotlin.sequences.Sequence
    public Iterator<File> iterator() {
        return new e();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\b\u001a\u0004\u0018\u00010\u0003H&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lkotlin/io/FileTreeWalk$WalkState;", "", "root", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "getRoot", "()Ljava/io/File;", "step", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static abstract class WalkState {
        private final File root;

        public abstract File step();

        public WalkState(File file) {
            zcp.c(file, "");
            this.root = file;
        }

        public final File getRoot() {
            return this.root;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/FileTreeWalk$DirectoryState;", "Lkotlin/io/FileTreeWalk$WalkState;", "rootDir", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static abstract class DirectoryState extends WalkState {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DirectoryState(File file) {
            super(file);
            zcp.c(file, "");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u000e\u000f\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0014J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0082\u0010R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;", "Lkotlin/collections/AbstractIterator;", "Ljava/io/File;", "<init>", "(Lkotlin/io/FileTreeWalk;)V", "state", "Ljava/util/ArrayDeque;", "Lkotlin/io/FileTreeWalk$WalkState;", "computeNext", "", "directoryState", "Lkotlin/io/FileTreeWalk$DirectoryState;", "root", "gotoNext", "BottomUpDirectoryState", "TopDownDirectoryState", "SingleFileState", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    final class e extends AbstractIterator<File> {
        private final ArrayDeque<WalkState> d;

        public e() {
            ArrayDeque<WalkState> arrayDeque = new ArrayDeque<>();
            this.d = arrayDeque;
            if (FileTreeWalk.this.h.isDirectory()) {
                arrayDeque.push(e(FileTreeWalk.this.h));
            } else if (FileTreeWalk.this.h.isFile()) {
                arrayDeque.push(new a(this, FileTreeWalk.this.h));
            } else {
                done();
            }
        }

        @Override // kotlin.collections.AbstractIterator
        public void computeNext() {
            File fileD = d();
            if (fileD != null) {
                setNext(fileD);
            } else {
                done();
            }
        }

        private final DirectoryState e(File file) {
            int i = c.f39329c[FileTreeWalk.this.f39324b.ordinal()];
            if (i == 1) {
                return new b(this, file);
            }
            if (i != 2) {
                throw new yyv();
            }
            return new d(this, file);
        }

        private final File d() {
            while (true) {
                WalkState walkStatePeek = this.d.peek();
                if (walkStatePeek == null) {
                    return null;
                }
                File fileStep = walkStatePeek.step();
                if (fileStep == null) {
                    this.d.pop();
                } else {
                    if (zcp.b(fileStep, walkStatePeek.getRoot()) || !fileStep.isDirectory() || this.d.size() >= FileTreeWalk.this.e) {
                        return fileStep;
                    }
                    this.d.push(e(fileStep));
                }
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "rootDir", "Ljava/io/File;", "<init>", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "rootVisited", "", "fileList", "", "[Ljava/io/File;", "fileIndex", "", EventType.FAILED, "step", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        final class d extends DirectoryState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private File[] f39330a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f39331b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f39332c;
            private boolean d;
            private int e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(e eVar, File file) {
                super(file);
                zcp.c(file, "");
                this.f39332c = eVar;
            }

            @Override // kotlin.io.FileTreeWalk.WalkState
            public File step() {
                if (!this.f39331b && this.f39330a == null) {
                    Function1 function1 = FileTreeWalk.this.d;
                    if (function1 != null && !((Boolean) function1.invoke(getRoot())).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = getRoot().listFiles();
                    this.f39330a = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        Function2 function2 = FileTreeWalk.this.f39323a;
                        if (function2 != null) {
                            function2.invoke(getRoot(), new zbt(getRoot(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f39331b = true;
                    }
                }
                File[] fileArr = this.f39330a;
                if (fileArr != null) {
                    int i = this.e;
                    zcp.e(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f39330a;
                        zcp.e(fileArr2);
                        int i2 = this.e;
                        this.e = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (this.d) {
                    Function1 function3 = FileTreeWalk.this.f39325c;
                    if (function3 != null) {
                        function3.invoke(getRoot());
                    }
                    return null;
                }
                this.d = true;
                return getRoot();
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "rootDir", "Ljava/io/File;", "<init>", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "rootVisited", "", "fileList", "", "[Ljava/io/File;", "fileIndex", "", "step", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        final class b extends DirectoryState {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f39327b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f39328c;
            private int d;
            private File[] e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(e eVar, File file) {
                super(file);
                zcp.c(file, "");
                this.f39328c = eVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // kotlin.io.FileTreeWalk.WalkState
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public File step() {
                Function2 function2;
                if (!this.f39327b) {
                    Function1 function1 = FileTreeWalk.this.d;
                    if (function1 != null && !((Boolean) function1.invoke(getRoot())).booleanValue()) {
                        return null;
                    }
                    this.f39327b = true;
                    return getRoot();
                }
                File[] fileArr = this.e;
                if (fileArr != null) {
                    int i = this.d;
                    zcp.e(fileArr);
                    if (i >= fileArr.length) {
                        Function1 function3 = FileTreeWalk.this.f39325c;
                        if (function3 != null) {
                            function3.invoke(getRoot());
                        }
                        return null;
                    }
                }
                if (this.e == null) {
                    File[] fileArrListFiles = getRoot().listFiles();
                    this.e = fileArrListFiles;
                    if (fileArrListFiles == null && (function2 = FileTreeWalk.this.f39323a) != null) {
                        function2.invoke(getRoot(), new zbt(getRoot(), null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.e;
                    if (fileArr2 != null) {
                        zcp.e(fileArr2);
                    }
                    Function1 function4 = FileTreeWalk.this.f39325c;
                    if (function4 != null) {
                        function4.invoke(getRoot());
                    }
                    return null;
                }
                File[] fileArr3 = this.e;
                zcp.e(fileArr3);
                int i2 = this.d;
                this.d = i2 + 1;
                return fileArr3[i2];
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState;", "Lkotlin/io/FileTreeWalk$WalkState;", "rootFile", "Ljava/io/File;", "<init>", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "visited", "", "step", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        final class a extends WalkState {
            final /* synthetic */ e d;
            private boolean e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, File file) {
                super(file);
                zcp.c(file, "");
                this.d = eVar;
            }

            @Override // kotlin.io.FileTreeWalk.WalkState
            public File step() {
                if (this.e) {
                    return null;
                }
                this.e = true;
                return getRoot();
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class c {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ int[] f39329c;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f39329c = iArr;
            }
        }
    }
}
