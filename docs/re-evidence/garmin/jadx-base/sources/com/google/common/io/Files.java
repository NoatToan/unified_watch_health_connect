package com.google.common.io;

import am.j;
import ch.qos.logback.classic.pattern.CallerDataConverter;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.graph.SuccessorsFunction;
import com.google.common.graph.Traverser;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.InlineMe;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.IOUtils;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class Files {
    private static final SuccessorsFunction<File> FILE_TREE = new SuccessorsFunction<File>() { // from class: com.google.common.io.Files.2
        @Override // com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public Iterable<File> successors(File file) {
            File[] fileArrListFiles;
            return (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) ? ImmutableList.of() : Collections.unmodifiableList(Arrays.asList(fileArrListFiles));
        }
    };

    public static final class FileByteSink extends ByteSink {
        private final File file;
        private final ImmutableSet<FileWriteMode> modes;

        private FileByteSink(File file, FileWriteMode... fileWriteModeArr) {
            this.file = (File) Preconditions.checkNotNull(file);
            this.modes = ImmutableSet.copyOf(fileWriteModeArr);
        }

        @Override // com.google.common.io.ByteSink
        public FileOutputStream openStream() {
            return new FileOutputStream(this.file, this.modes.contains(FileWriteMode.APPEND));
        }

        public String toString() {
            return "Files.asByteSink(" + this.file + ", " + this.modes + ")";
        }
    }

    public static final class FileByteSource extends ByteSource {
        private final File file;

        private FileByteSource(File file) {
            this.file = (File) Preconditions.checkNotNull(file);
        }

        @Override // com.google.common.io.ByteSource
        public FileInputStream openStream() {
            return new FileInputStream(this.file);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: X */
        @Override // com.google.common.io.ByteSource
        public byte[] read() throws X {
            Closer closerCreate = Closer.create();
            try {
                FileInputStream fileInputStream = (FileInputStream) closerCreate.register(openStream());
                byte[] byteArray = ByteStreams.toByteArray(fileInputStream, fileInputStream.getChannel().size());
                closerCreate.close();
                return byteArray;
            } catch (Throwable th3) {
                try {
                    throw closerCreate.rethrow(th3);
                } catch (Throwable th4) {
                    closerCreate.close();
                    throw th4;
                }
            }
        }

        @Override // com.google.common.io.ByteSource
        public long size() throws FileNotFoundException {
            boolean zIsFile = this.file.isFile();
            File file = this.file;
            if (zIsFile) {
                return file.length();
            }
            throw new FileNotFoundException(file.toString());
        }

        @Override // com.google.common.io.ByteSource
        public Optional<Long> sizeIfKnown() {
            return this.file.isFile() ? Optional.of(Long.valueOf(this.file.length())) : Optional.absent();
        }

        public String toString() {
            return "Files.asByteSource(" + this.file + ")";
        }
    }

    public enum FilePredicate implements Predicate<File> {
        IS_DIRECTORY { // from class: com.google.common.io.Files.FilePredicate.1
            @Override // java.lang.Enum
            public String toString() {
                return "Files.isDirectory()";
            }

            @Override // com.google.common.base.Predicate
            public boolean apply(File file) {
                return file.isDirectory();
            }
        },
        IS_FILE { // from class: com.google.common.io.Files.FilePredicate.2
            @Override // java.lang.Enum
            public String toString() {
                return "Files.isFile()";
            }

            @Override // com.google.common.base.Predicate
            public boolean apply(File file) {
                return file.isFile();
            }
        }
    }

    private Files() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @InlineMe(imports = {"com.google.common.io.FileWriteMode", "com.google.common.io.Files"}, replacement = "Files.asCharSink(to, charset, FileWriteMode.APPEND).write(from)")
    @Deprecated
    public static void append(CharSequence charSequence, File file, Charset charset) throws X {
        asCharSink(file, charset, FileWriteMode.APPEND).write(charSequence);
    }

    public static ByteSink asByteSink(File file, FileWriteMode... fileWriteModeArr) {
        return new FileByteSink(file, fileWriteModeArr);
    }

    public static ByteSource asByteSource(File file) {
        return new FileByteSource(file);
    }

    public static CharSink asCharSink(File file, Charset charset, FileWriteMode... fileWriteModeArr) {
        return asByteSink(file, fileWriteModeArr).asCharSink(charset);
    }

    public static CharSource asCharSource(File file, Charset charset) {
        return asByteSource(file).asCharSource(charset);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public static void copy(File file, File file2) throws X {
        Preconditions.checkArgument(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        asByteSource(file).copyTo(asByteSink(file2, new FileWriteMode[0]));
    }

    public static void createParentDirs(File file) throws IOException {
        Preconditions.checkNotNull(file);
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        h.C(v.h.v(file, "Unable to create parent directories of "));
    }

    @Beta
    @Deprecated
    public static File createTempDir() {
        return TempFileCreator.INSTANCE.createTempDir();
    }

    public static boolean equal(File file, File file2) {
        Preconditions.checkNotNull(file);
        Preconditions.checkNotNull(file2);
        if (file == file2 || file.equals(file2)) {
            return true;
        }
        long length = file.length();
        long length2 = file2.length();
        if (length == 0 || length2 == 0 || length == length2) {
            return asByteSource(file).contentEquals(asByteSource(file2));
        }
        return false;
    }

    public static Traverser<File> fileTraverser() {
        return Traverser.forTree(FILE_TREE);
    }

    public static String getFileExtension(String str) {
        Preconditions.checkNotNull(str);
        String name = new File(str).getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? "" : name.substring(iLastIndexOf + 1);
    }

    public static String getNameWithoutExtension(String str) {
        Preconditions.checkNotNull(str);
        String name = new File(str).getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? name : name.substring(0, iLastIndexOf);
    }

    @InlineMe(imports = {"com.google.common.io.Files"}, replacement = "Files.asByteSource(file).hash(hashFunction)")
    @Deprecated
    public static HashCode hash(File file, HashFunction hashFunction) {
        return asByteSource(file).hash(hashFunction);
    }

    public static Predicate<File> isDirectory() {
        return FilePredicate.IS_DIRECTORY;
    }

    public static Predicate<File> isFile() {
        return FilePredicate.IS_FILE;
    }

    public static MappedByteBuffer map(File file, FileChannel.MapMode mapMode, long j8) {
        Preconditions.checkArgument(j8 >= 0, "size (%s) may not be negative", j8);
        return mapInternal(file, mapMode, j8);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    private static MappedByteBuffer mapInternal(File file, FileChannel.MapMode mapMode, long j8) throws X {
        Preconditions.checkNotNull(file);
        Preconditions.checkNotNull(mapMode);
        Closer closerCreate = Closer.create();
        try {
            FileChannel fileChannel = (FileChannel) closerCreate.register(((RandomAccessFile) closerCreate.register(new RandomAccessFile(file, mapMode == FileChannel.MapMode.READ_ONLY ? JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR : "rw"))).getChannel());
            if (j8 == -1) {
                j8 = fileChannel.size();
            }
            MappedByteBuffer map = fileChannel.map(mapMode, 0L, j8);
            closerCreate.close();
            return map;
        } catch (Throwable th3) {
            try {
                throw closerCreate.rethrow(th3);
            } catch (Throwable th4) {
                closerCreate.close();
                throw th4;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public static void move(File file, File file2) throws X, IOException {
        Preconditions.checkNotNull(file);
        Preconditions.checkNotNull(file2);
        Preconditions.checkArgument(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (file.renameTo(file2)) {
            return;
        }
        copy(file, file2);
        if (file.delete()) {
            return;
        }
        if (file2.delete()) {
            h.C(v.h.v(file, "Unable to delete "));
        } else {
            h.C(v.h.v(file2, "Unable to delete "));
        }
    }

    public static BufferedReader newReader(File file, Charset charset) {
        Preconditions.checkNotNull(file);
        Preconditions.checkNotNull(charset);
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
    }

    public static BufferedWriter newWriter(File file, Charset charset) {
        Preconditions.checkNotNull(file);
        Preconditions.checkNotNull(charset);
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset));
    }

    @Deprecated
    @CanIgnoreReturnValue
    @InlineMe(imports = {"com.google.common.io.Files"}, replacement = "Files.asByteSource(file).read(processor)")
    @ParametricNullness
    public static <T> T readBytes(File file, ByteProcessor<T> byteProcessor) {
        return (T) asByteSource(file).read(byteProcessor);
    }

    @InlineMe(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).readFirstLine()")
    @Deprecated
    public static String readFirstLine(File file, Charset charset) {
        return asCharSource(file, charset).readFirstLine();
    }

    public static List<String> readLines(File file, Charset charset) {
        return (List) asCharSource(file, charset).readLines(new LineProcessor<List<String>>() { // from class: com.google.common.io.Files.1
            final List<String> result = Lists.newArrayList();

            @Override // com.google.common.io.LineProcessor
            public boolean processLine(String str) {
                this.result.add(str);
                return true;
            }

            @Override // com.google.common.io.LineProcessor
            public List<String> getResult() {
                return this.result;
            }
        });
    }

    public static String simplifyPath(String str) {
        Preconditions.checkNotNull(str);
        if (str.length() == 0) {
            return ".";
        }
        Iterable<String> iterableSplit = Splitter.on(IOUtils.DIR_SEPARATOR_UNIX).omitEmptyStrings().split(str);
        ArrayList arrayList = new ArrayList();
        for (String str2 : iterableSplit) {
            str2.getClass();
            if (!str2.equals(".")) {
                if (!str2.equals(CallerDataConverter.DEFAULT_RANGE_DELIMITER)) {
                    arrayList.add(str2);
                } else if (arrayList.size() <= 0 || ((String) j.f(1, arrayList)).equals(CallerDataConverter.DEFAULT_RANGE_DELIMITER)) {
                    arrayList.add(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        String strJoin = Joiner.on(IOUtils.DIR_SEPARATOR_UNIX).join(arrayList);
        if (str.charAt(0) == '/') {
            strJoin = fb1.c.n("/", strJoin);
        }
        while (strJoin.startsWith("/../")) {
            strJoin = strJoin.substring(3);
        }
        if (strJoin.equals("/..")) {
            return "/";
        }
        return "".equals(strJoin) ? "." : strJoin;
    }

    public static byte[] toByteArray(File file) {
        return asByteSource(file).read();
    }

    @InlineMe(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).read()")
    @Deprecated
    public static String toString(File file, Charset charset) {
        return asCharSource(file, charset).read();
    }

    public static void touch(File file) throws IOException {
        Preconditions.checkNotNull(file);
        if (file.createNewFile() || file.setLastModified(System.currentTimeMillis())) {
            return;
        }
        h.C(v.h.v(file, "Unable to update modification time of "));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public static void write(byte[] bArr, File file) throws X {
        asByteSink(file, new FileWriteMode[0]).write(bArr);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @InlineMe(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSink(to, charset).write(from)")
    @Deprecated
    public static void write(CharSequence charSequence, File file, Charset charset) throws X {
        asCharSink(file, charset, new FileWriteMode[0]).write(charSequence);
    }

    @Deprecated
    @CanIgnoreReturnValue
    @InlineMe(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).readLines(callback)")
    @ParametricNullness
    public static <T> T readLines(File file, Charset charset, LineProcessor<T> lineProcessor) {
        return (T) asCharSource(file, charset).readLines(lineProcessor);
    }

    public static MappedByteBuffer map(File file, FileChannel.MapMode mapMode) {
        return mapInternal(file, mapMode, -1L);
    }

    public static MappedByteBuffer map(File file) {
        Preconditions.checkNotNull(file);
        return map(file, FileChannel.MapMode.READ_ONLY);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public static void copy(File file, OutputStream outputStream) throws X {
        asByteSource(file).copyTo(outputStream);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @InlineMe(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(from, charset).copyTo(to)")
    @Deprecated
    public static void copy(File file, Charset charset, Appendable appendable) throws X {
        asCharSource(file, charset).copyTo(appendable);
    }
}
