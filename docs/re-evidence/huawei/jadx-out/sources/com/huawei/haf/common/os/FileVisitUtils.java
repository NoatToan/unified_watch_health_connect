package com.huawei.haf.common.os;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class FileVisitUtils {

    public interface VisitOperation {
        Path getRootPath();

        void visit(Path path, BasicFileAttributes basicFileAttributes, boolean z, int i, long j);

        void visitRootBegin();

        void visitRootEnd(long j);
    }

    private FileVisitUtils() {
    }

    public static long e(VisitOperation visitOperation) throws IOException {
        DirectoryInfoVisitor directoryInfoVisitor = new DirectoryInfoVisitor(visitOperation);
        Files.walkFileTree(visitOperation.getRootPath(), directoryInfoVisitor);
        return directoryInfoVisitor.c();
    }

    static long a(Path path) throws IOException {
        SizeDirectoryInfo sizeDirectoryInfo = new SizeDirectoryInfo();
        Files.walkFileTree(path, sizeDirectoryInfo);
        return sizeDirectoryInfo.c();
    }

    static class SizeDirectoryInfo extends SimpleFileVisitor<Path> {
        private long e;

        private SizeDirectoryInfo() {
        }

        @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
            super.visitFile(path, basicFileAttributes);
            if (!basicFileAttributes.isSymbolicLink()) {
                this.e += basicFileAttributes.size();
            }
            return FileVisitResult.CONTINUE;
        }

        public long c() {
            return this.e;
        }
    }

    static class DirectoryNode {
        long d;
        final BasicFileAttributes e;

        DirectoryNode(BasicFileAttributes basicFileAttributes) {
            this.e = basicFileAttributes;
        }
    }

    static class DirectoryInfoVisitor extends SimpleFileVisitor<Path> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayDeque<DirectoryNode> f5908b = new ArrayDeque<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final VisitOperation f5909c;
        private long e;

        DirectoryInfoVisitor(VisitOperation visitOperation) {
            this.f5909c = visitOperation;
        }

        public long c() {
            return this.e;
        }

        @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
            super.preVisitDirectory(path, basicFileAttributes);
            this.f5908b.push(new DirectoryNode(basicFileAttributes));
            return FileVisitResult.CONTINUE;
        }

        @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
            super.visitFile(path, basicFileAttributes);
            if (!basicFileAttributes.isSymbolicLink()) {
                long size = basicFileAttributes.size();
                this.f5908b.peek().d += size;
                this.f5909c.visit(path, basicFileAttributes, false, this.f5908b.size(), size);
            }
            return FileVisitResult.CONTINUE;
        }

        @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public FileVisitResult postVisitDirectory(Path path, IOException iOException) {
            DirectoryNode directoryNodePop = this.f5908b.pop();
            if (this.f5908b.isEmpty()) {
                this.e = directoryNodePop.d;
            } else {
                this.f5908b.peek().d += directoryNodePop.d;
                this.f5909c.visit(path, directoryNodePop.e, true, this.f5908b.size(), directoryNodePop.d);
            }
            return FileVisitResult.CONTINUE;
        }
    }

    public static class PrintVisitOperation implements VisitOperation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f5913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f5914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final PrintStream f5915c;
        private final int d;
        private final Path e;
        private final PrintWriter g;

        protected boolean d(String str, boolean z, int i, long j) {
            return true;
        }

        public PrintVisitOperation(File file, PrintStream printStream) {
            this(file.toPath(), Integer.MAX_VALUE, true, printStream, null);
        }

        private PrintVisitOperation(Path path, int i, boolean z, PrintStream printStream, PrintWriter printWriter) {
            this.e = path;
            this.f5914b = path.getNameCount();
            this.d = i;
            this.f5913a = z;
            this.f5915c = printStream;
            this.g = printWriter;
        }

        @Override // com.huawei.haf.common.os.FileVisitUtils.VisitOperation
        public Path getRootPath() {
            return this.e;
        }

        @Override // com.huawei.haf.common.os.FileVisitUtils.VisitOperation
        public void visitRootBegin() {
            c("Path, Depth, Type, Size");
        }

        @Override // com.huawei.haf.common.os.FileVisitUtils.VisitOperation
        public void visit(Path path, BasicFileAttributes basicFileAttributes, boolean z, int i, long j) {
            if (!(this.f5915c == null && this.g == null) && this.d >= i) {
                if (z) {
                    if (!this.f5913a && j <= 0) {
                        return;
                    }
                } else if (!this.f5913a) {
                    return;
                }
                String string = path.subpath(this.f5914b, path.getNameCount()).toString();
                if (d(string, z, i, j)) {
                    d(string);
                    d(", ");
                    d(String.valueOf(i));
                    d(z ? ", D, " : ", F, ");
                    d(String.valueOf(j));
                    a();
                }
            }
        }

        @Override // com.huawei.haf.common.os.FileVisitUtils.VisitOperation
        public void visitRootEnd(long j) {
            c(this.e + ", 0, D, " + j);
        }

        private void a() {
            PrintStream printStream = this.f5915c;
            if (printStream != null) {
                printStream.println();
            }
            PrintWriter printWriter = this.g;
            if (printWriter != null) {
                printWriter.println();
            }
        }

        private void c(String str) {
            PrintStream printStream = this.f5915c;
            if (printStream != null) {
                printStream.println(str);
            }
            PrintWriter printWriter = this.g;
            if (printWriter != null) {
                printWriter.println(str);
            }
        }

        private void d(String str) {
            PrintStream printStream = this.f5915c;
            if (printStream != null) {
                printStream.print(str);
            }
            PrintWriter printWriter = this.g;
            if (printWriter != null) {
                printWriter.print(str);
            }
        }
    }

    public static class MapVisitOperation implements VisitOperation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Path f5910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<String, Long> f5911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f5912c;
        private final int d;
        private final int e;

        protected boolean a(String str, boolean z, int i, long j) {
            return true;
        }

        @Override // com.huawei.haf.common.os.FileVisitUtils.VisitOperation
        public void visitRootBegin() {
        }

        @Override // com.huawei.haf.common.os.FileVisitUtils.VisitOperation
        public void visitRootEnd(long j) {
        }

        public MapVisitOperation(File file, Map<String, Long> map) {
            this(file.toPath(), 0, map);
        }

        public MapVisitOperation(Path path, int i, Map<String, Long> map) {
            this.f5910a = path;
            this.d = path.getNameCount();
            if (map == null) {
                this.e = 0;
                this.f5911b = Collections.EMPTY_MAP;
            } else {
                this.e = i;
                this.f5911b = map;
            }
        }

        @Override // com.huawei.haf.common.os.FileVisitUtils.VisitOperation
        public Path getRootPath() {
            return this.f5910a;
        }

        @Override // com.huawei.haf.common.os.FileVisitUtils.VisitOperation
        public void visit(Path path, BasicFileAttributes basicFileAttributes, boolean z, int i, long j) {
            if (z) {
                if (this.e > 0 || this.f5911b.size() != this.f5912c) {
                    String string = path.subpath(this.d, path.getNameCount()).toString();
                    int i2 = this.e;
                    if ((i2 <= 0 || i > i2 || !a(string, z, i, j)) && !this.f5911b.containsKey(string)) {
                        return;
                    }
                    this.f5911b.put(string, Long.valueOf(j));
                    this.f5912c++;
                }
            }
        }
    }
}
