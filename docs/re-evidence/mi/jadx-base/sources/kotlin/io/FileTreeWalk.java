package kotlin.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class FileTreeWalk implements Sequence<File> {

    @NotNull
    private final FileWalkDirection direction;
    private final int maxDepth;

    @Nullable
    private final Function1<File, Boolean> onEnter;

    @Nullable
    private final Function2<File, IOException, Unit> onFail;

    @Nullable
    private final Function1<File, Unit> onLeave;

    @NotNull
    private final File start;

    @SourceDebugExtension({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$DirectoryState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
    public static abstract class DirectoryState extends WalkState {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DirectoryState(@NotNull File rootDir) {
            super(rootDir);
            Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        }
    }

    public final class FileTreeWalkIterator extends AbstractIterator<File> {

        @NotNull
        private final ArrayDeque<WalkState> state;

        public final class BottomUpDirectoryState extends DirectoryState {
            private boolean failed;
            private int fileIndex;

            @Nullable
            private File[] fileList;
            private boolean rootVisited;
            final /* synthetic */ FileTreeWalkIterator this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BottomUpDirectoryState(@NotNull FileTreeWalkIterator fileTreeWalkIterator, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.this$0 = fileTreeWalkIterator;
            }

            @Override // kotlin.io.FileTreeWalk.WalkState
            @Nullable
            public File step() {
                if (!this.failed && this.fileList == null) {
                    Function1 function1 = FileTreeWalk.this.onEnter;
                    if (function1 != null && !((Boolean) function1.invoke(getRoot())).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = getRoot().listFiles();
                    this.fileList = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        Function2 function2 = FileTreeWalk.this.onFail;
                        if (function2 != null) {
                            function2.invoke(getRoot(), new AccessDeniedException(getRoot(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.failed = true;
                    }
                }
                File[] fileArr = this.fileList;
                if (fileArr != null) {
                    int i = this.fileIndex;
                    Intrinsics.checkNotNull(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.fileList;
                        Intrinsics.checkNotNull(fileArr2);
                        int i2 = this.fileIndex;
                        this.fileIndex = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.rootVisited) {
                    this.rootVisited = true;
                    return getRoot();
                }
                Function1 function3 = FileTreeWalk.this.onLeave;
                if (function3 != null) {
                    function3.invoke(getRoot());
                }
                return null;
            }
        }

        @SourceDebugExtension({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
        public final class SingleFileState extends WalkState {
            final /* synthetic */ FileTreeWalkIterator this$0;
            private boolean visited;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SingleFileState(@NotNull FileTreeWalkIterator fileTreeWalkIterator, File rootFile) {
                super(rootFile);
                Intrinsics.checkNotNullParameter(rootFile, "rootFile");
                this.this$0 = fileTreeWalkIterator;
            }

            @Override // kotlin.io.FileTreeWalk.WalkState
            @Nullable
            public File step() {
                if (this.visited) {
                    return null;
                }
                this.visited = true;
                return getRoot();
            }
        }

        public final class TopDownDirectoryState extends DirectoryState {
            private int fileIndex;

            @Nullable
            private File[] fileList;
            private boolean rootVisited;
            final /* synthetic */ FileTreeWalkIterator this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TopDownDirectoryState(@NotNull FileTreeWalkIterator fileTreeWalkIterator, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.this$0 = fileTreeWalkIterator;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // kotlin.io.FileTreeWalk.WalkState
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File step() {
                /*
                    r10 = this;
                    boolean r0 = r10.rootVisited
                    r1 = 0
                    if (r0 != 0) goto L28
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r10.this$0
                    kotlin.io.FileTreeWalk r0 = kotlin.io.FileTreeWalk.this
                    kotlin.jvm.functions.Function1 r0 = kotlin.io.FileTreeWalk.access$getOnEnter$p(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r10.getRoot()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r10.rootVisited = r0
                    java.io.File r0 = r10.getRoot()
                    return r0
                L28:
                    java.io.File[] r0 = r10.fileList
                    if (r0 == 0) goto L47
                    int r2 = r10.fileIndex
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L47
                L35:
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r10.this$0
                    kotlin.io.FileTreeWalk r0 = kotlin.io.FileTreeWalk.this
                    kotlin.jvm.functions.Function1 r0 = kotlin.io.FileTreeWalk.access$getOnLeave$p(r0)
                    if (r0 == 0) goto L46
                    java.io.File r2 = r10.getRoot()
                    r0.invoke(r2)
                L46:
                    return r1
                L47:
                    java.io.File[] r0 = r10.fileList
                    if (r0 != 0) goto L93
                    java.io.File r0 = r10.getRoot()
                    java.io.File[] r0 = r0.listFiles()
                    r10.fileList = r0
                    if (r0 != 0) goto L77
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r10.this$0
                    kotlin.io.FileTreeWalk r0 = kotlin.io.FileTreeWalk.this
                    kotlin.jvm.functions.Function2 r0 = kotlin.io.FileTreeWalk.access$getOnFail$p(r0)
                    if (r0 == 0) goto L77
                    java.io.File r2 = r10.getRoot()
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.getRoot()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L77:
                    java.io.File[] r0 = r10.fileList
                    if (r0 == 0) goto L81
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L93
                L81:
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r10.this$0
                    kotlin.io.FileTreeWalk r0 = kotlin.io.FileTreeWalk.this
                    kotlin.jvm.functions.Function1 r0 = kotlin.io.FileTreeWalk.access$getOnLeave$p(r0)
                    if (r0 == 0) goto L92
                    java.io.File r2 = r10.getRoot()
                    r0.invoke(r2)
                L92:
                    return r1
                L93:
                    java.io.File[] r0 = r10.fileList
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r1 = r10.fileIndex
                    int r2 = r1 + 1
                    r10.fileIndex = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState.step():java.io.File");
            }
        }

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public FileTreeWalkIterator() {
            ArrayDeque<WalkState> arrayDeque = new ArrayDeque<>();
            this.state = arrayDeque;
            if (FileTreeWalk.this.start.isDirectory()) {
                arrayDeque.push(directoryState(FileTreeWalk.this.start));
            } else if (FileTreeWalk.this.start.isFile()) {
                arrayDeque.push(new SingleFileState(this, FileTreeWalk.this.start));
            } else {
                done();
            }
        }

        private final DirectoryState directoryState(File file) {
            int i = WhenMappings.$EnumSwitchMapping$0[FileTreeWalk.this.direction.ordinal()];
            if (i == 1) {
                return new TopDownDirectoryState(this, file);
            }
            if (i == 2) {
                return new BottomUpDirectoryState(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        private final File gotoNext() {
            while (true) {
                WalkState walkStatePeek = this.state.peek();
                if (walkStatePeek == null) {
                    return null;
                }
                File fileStep = walkStatePeek.step();
                if (fileStep == null) {
                    this.state.pop();
                } else {
                    if (Intrinsics.areEqual(fileStep, walkStatePeek.getRoot()) || !fileStep.isDirectory() || this.state.size() >= FileTreeWalk.this.maxDepth) {
                        return fileStep;
                    }
                    this.state.push(directoryState(fileStep));
                }
            }
        }

        @Override // kotlin.collections.AbstractIterator
        public void computeNext() {
            File fileGotoNext = gotoNext();
            if (fileGotoNext != null) {
                setNext(fileGotoNext);
            } else {
                done();
            }
        }
    }

    public static abstract class WalkState {

        @NotNull
        private final File root;

        public WalkState(@NotNull File root) {
            Intrinsics.checkNotNullParameter(root, "root");
            this.root = root;
        }

        @NotNull
        public final File getRoot() {
            return this.root;
        }

        @Nullable
        public abstract File step();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FileTreeWalk(File file, FileWalkDirection fileWalkDirection, Function1<? super File, Boolean> function1, Function1<? super File, Unit> function2, Function2<? super File, ? super IOException, Unit> function3, int i) {
        this.start = file;
        this.direction = fileWalkDirection;
        this.onEnter = function1;
        this.onLeave = function2;
        this.onFail = function3;
        this.maxDepth = i;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<File> iterator() {
        return new FileTreeWalkIterator();
    }

    @NotNull
    public final FileTreeWalk maxDepth(int i) {
        if (i > 0) {
            return new FileTreeWalk(this.start, this.direction, this.onEnter, this.onLeave, this.onFail, i);
        }
        throw new IllegalArgumentException("depth must be positive, but was " + i + '.');
    }

    @NotNull
    public final FileTreeWalk onEnter(@NotNull Function1<? super File, Boolean> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new FileTreeWalk(this.start, this.direction, function, this.onLeave, this.onFail, this.maxDepth);
    }

    @NotNull
    public final FileTreeWalk onFail(@NotNull Function2<? super File, ? super IOException, Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new FileTreeWalk(this.start, this.direction, this.onEnter, this.onLeave, function, this.maxDepth);
    }

    @NotNull
    public final FileTreeWalk onLeave(@NotNull Function1<? super File, Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new FileTreeWalk(this.start, this.direction, this.onEnter, function, this.onFail, this.maxDepth);
    }

    public /* synthetic */ FileTreeWalk(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function2, Function2 function3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, function1, function2, function3, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileTreeWalk(@NotNull File start, @NotNull FileWalkDirection direction) {
        this(start, direction, null, null, null, 0, 32, null);
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
    }

    public /* synthetic */ FileTreeWalk(File file, FileWalkDirection fileWalkDirection, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection);
    }
}
