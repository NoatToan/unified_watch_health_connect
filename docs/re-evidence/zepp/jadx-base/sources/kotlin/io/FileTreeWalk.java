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
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class FileTreeWalk implements Sequence<File> {

    @NotNull
    private final File a;

    @NotNull
    private final FileWalkDirection b;

    @Nullable
    private final Function1<File, Boolean> c;

    @Nullable
    private final Function1<File, Unit> d;

    @Nullable
    private final Function2<File, IOException, Unit> e;
    private final int f;

    public final class FileTreeWalkIterator extends AbstractIterator<File> {

        @NotNull
        private final ArrayDeque<b> c;

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final class a extends a {
            private boolean b;

            @Nullable
            private File[] c;
            private int d;
            private boolean e;

            public a(File file) {
                super(file);
            }

            @Override // kotlin.io.FileTreeWalk.b
            @Nullable
            public File b() {
                if (!this.e && this.c == null) {
                    Function1 function1 = FileTreeWalk.this.c;
                    boolean z = false;
                    if (function1 != null && !((Boolean) function1.invoke(a())).booleanValue()) {
                        z = true;
                    }
                    if (z) {
                        return null;
                    }
                    File[] fileArrListFiles = a().listFiles();
                    this.c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        Function2 function2 = FileTreeWalk.this.e;
                        if (function2 != null) {
                            function2.invoke(a(), new AccessDeniedException(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.e = true;
                    }
                }
                File[] fileArr = this.c;
                if (fileArr != null && this.d < fileArr.length) {
                    File[] fileArr2 = this.c;
                    int i = this.d;
                    this.d = i + 1;
                    return fileArr2[i];
                }
                if (!this.b) {
                    this.b = true;
                    return a();
                }
                Function1 function3 = FileTreeWalk.this.d;
                if (function3 != null) {
                    function3.invoke(a());
                }
                return null;
            }
        }

        public final class b extends b {
            private boolean b;

            public b(File file) {
                super(file);
            }

            @Override // kotlin.io.FileTreeWalk.b
            @Nullable
            public File b() {
                if (this.b) {
                    return null;
                }
                this.b = true;
                return a();
            }
        }

        public final class c extends a {
            private boolean b;

            @Nullable
            private File[] c;
            private int d;

            public c(File file) {
                super(file);
            }

            @Override // kotlin.io.FileTreeWalk.b
            @Nullable
            public File b() {
                Function2 function2;
                if (!this.b) {
                    Function1 function1 = FileTreeWalk.this.c;
                    boolean z = false;
                    if (function1 != null && !((Boolean) function1.invoke(a())).booleanValue()) {
                        z = true;
                    }
                    if (z) {
                        return null;
                    }
                    this.b = true;
                    return a();
                }
                File[] fileArr = this.c;
                if (fileArr != null && this.d >= fileArr.length) {
                    Function1 function3 = FileTreeWalk.this.d;
                    if (function3 != null) {
                        function3.invoke(a());
                    }
                    return null;
                }
                if (this.c == null) {
                    File[] fileArrListFiles = a().listFiles();
                    this.c = fileArrListFiles;
                    if (fileArrListFiles == null && (function2 = FileTreeWalk.this.e) != null) {
                        function2.invoke(a(), new AccessDeniedException(a(), null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.c;
                    if (fileArr2 == null || fileArr2.length == 0) {
                        Function1 function4 = FileTreeWalk.this.d;
                        if (function4 != null) {
                            function4.invoke(a());
                        }
                        return null;
                    }
                }
                File[] fileArr3 = this.c;
                int i = this.d;
                this.d = i + 1;
                return fileArr3[i];
            }
        }

        public FileTreeWalkIterator() {
            ArrayDeque<b> arrayDeque = new ArrayDeque<>();
            this.c = arrayDeque;
            if (FileTreeWalk.this.a.isDirectory()) {
                arrayDeque.push(c(FileTreeWalk.this.a));
            } else if (FileTreeWalk.this.a.isFile()) {
                arrayDeque.push(new b(FileTreeWalk.this.a));
            } else {
                done();
            }
        }

        private final a c(File file) {
            int i = WhenMappings.$EnumSwitchMapping$0[FileTreeWalk.this.b.ordinal()];
            if (i == 1) {
                return new c(file);
            }
            if (i == 2) {
                return new a(file);
            }
            throw new NoWhenBranchMatchedException();
        }

        private final File d() {
            while (true) {
                b bVarPeek = this.c.peek();
                if (bVarPeek == null) {
                    return null;
                }
                File fileB = bVarPeek.b();
                if (fileB == null) {
                    this.c.pop();
                } else {
                    if (Intrinsics.areEqual(fileB, bVarPeek.a()) || !fileB.isDirectory() || this.c.size() >= FileTreeWalk.this.f) {
                        return fileB;
                    }
                    this.c.push(c(fileB));
                }
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
    }

    public static abstract class a extends b {
        public a(@NotNull File file) {
            super(file);
        }
    }

    public static abstract class b {

        @NotNull
        private final File a;

        public b(@NotNull File file) {
            this.a = file;
        }

        @NotNull
        public final File a() {
            return this.a;
        }

        @Nullable
        public abstract File b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FileTreeWalk(File file, FileWalkDirection fileWalkDirection, Function1<? super File, Boolean> function1, Function1<? super File, Unit> function2, Function2<? super File, ? super IOException, Unit> function3, int i) {
        this.a = file;
        this.b = fileWalkDirection;
        this.c = function1;
        this.d = function2;
        this.e = function3;
        this.f = i;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<File> iterator() {
        return new FileTreeWalkIterator();
    }

    @NotNull
    public final FileTreeWalk maxDepth(int i) {
        if (i > 0) {
            return new FileTreeWalk(this.a, this.b, this.c, this.d, this.e, i);
        }
        throw new IllegalArgumentException("depth must be positive, but was " + i + '.');
    }

    @NotNull
    public final FileTreeWalk onEnter(@NotNull Function1<? super File, Boolean> function1) {
        return new FileTreeWalk(this.a, this.b, function1, this.d, this.e, this.f);
    }

    @NotNull
    public final FileTreeWalk onFail(@NotNull Function2<? super File, ? super IOException, Unit> function2) {
        return new FileTreeWalk(this.a, this.b, this.c, this.d, function2, this.f);
    }

    @NotNull
    public final FileTreeWalk onLeave(@NotNull Function1<? super File, Unit> function1) {
        return new FileTreeWalk(this.a, this.b, this.c, function1, this.e, this.f);
    }

    public /* synthetic */ FileTreeWalk(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function2, Function2 function3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, function1, function2, function3, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    public FileTreeWalk(@NotNull File file, @NotNull FileWalkDirection fileWalkDirection) {
        this(file, fileWalkDirection, null, null, null, 0, 32, null);
    }

    public /* synthetic */ FileTreeWalk(File file, FileWalkDirection fileWalkDirection, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection);
    }
}
