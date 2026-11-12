package kotlin.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes23.dex */
public class e extends d {

    public static final class a extends Lambda implements Function2 {
        public static final a a = new a();

        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(@NotNull File file, @NotNull IOException iOException) throws IOException {
            throw iOException;
        }
    }

    public static final class b extends Lambda implements Function2<File, IOException, Unit> {
        public final /* synthetic */ Function2<File, IOException, OnErrorAction> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super File, ? super IOException, ? extends OnErrorAction> function2) {
            super(2);
            this.a = function2;
        }

        public final void a(@NotNull File file, @NotNull IOException iOException) throws f {
            if (this.a.invoke(file, iOException) == OnErrorAction.TERMINATE) {
                throw new f(file);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(File file, IOException iOException) throws f {
            a(file, iOException);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    public static final boolean copyRecursively(@NotNull File file, @NotNull File file2, boolean z, @NotNull Function2<? super File, ? super IOException, ? extends OnErrorAction> function2) {
        boolean z2;
        if (!file.exists()) {
            return function2.invoke(file, new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null)) != OnErrorAction.TERMINATE;
        }
        try {
            for (File file3 : d.walkTopDown(file).onFail(new b(function2))) {
                if (file3.exists()) {
                    File file4 = new File(file2, toRelativeString(file3, file));
                    if (file4.exists() && (!file3.isDirectory() || !file4.isDirectory())) {
                        if (!z) {
                            z2 = true;
                        } else if (file4.isDirectory()) {
                            if (deleteRecursively(file4)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        } else if (file4.delete()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            if (function2.invoke(file4, new FileAlreadyExistsException(file3, file4, "The destination file already exists.")) == OnErrorAction.TERMINATE) {
                                return false;
                            }
                        }
                    }
                    if (file3.isDirectory()) {
                        file4.mkdirs();
                    } else if (copyTo$default(file3, file4, z, 0, 4, null).length() != file3.length() && function2.invoke(file3, new IOException("Source file wasn't copied completely, length of destination file differs.")) == OnErrorAction.TERMINATE) {
                        return false;
                    }
                } else if (function2.invoke(file3, new NoSuchFileException(file3, null, "The source file doesn't exist.", 2, null)) == OnErrorAction.TERMINATE) {
                    return false;
                }
            }
            return true;
        } catch (f unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean copyRecursively$default(File file, File file2, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function2 = a.a;
        }
        return copyRecursively(file, file2, z, function2);
    }

    @NotNull
    public static final File copyTo(@NotNull File file, @NotNull File file2, boolean z, int i) throws FileSystemException {
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (file2.exists()) {
            if (!z) {
                throw new FileAlreadyExistsException(file, file2, "The destination file already exists.");
            }
            if (!file2.delete()) {
                throw new FileAlreadyExistsException(file, file2, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (!file.isDirectory()) {
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    ByteStreamsKt.copyTo(fileInputStream, fileOutputStream, i);
                    CloseableKt.closeFinally(fileOutputStream, null);
                    CloseableKt.closeFinally(fileInputStream, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(fileOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(fileInputStream, th3);
                    throw th4;
                }
            }
        } else if (!file2.mkdirs()) {
            throw new FileSystemException(file, file2, "Failed to create target directory.");
        }
        return file2;
    }

    public static /* synthetic */ File copyTo$default(File file, File file2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        return copyTo(file, file2, z, i);
    }

    @Deprecated(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    @NotNull
    public static final File createTempDir(@NotNull String str, @Nullable String str2, @Nullable File file) throws IOException {
        File fileCreateTempFile = File.createTempFile(str, str2, file);
        fileCreateTempFile.delete();
        if (fileCreateTempFile.mkdir()) {
            return fileCreateTempFile;
        }
        throw new IOException("Unable to create temporary directory " + fileCreateTempFile + '.');
    }

    public static /* synthetic */ File createTempDir$default(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return createTempDir(str, str2, file);
    }

    @Deprecated(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    @NotNull
    public static final File createTempFile(@NotNull String str, @Nullable String str2, @Nullable File file) {
        return File.createTempFile(str, str2, file);
    }

    public static /* synthetic */ File createTempFile$default(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return createTempFile(str, str2, file);
    }

    public static boolean deleteRecursively(@NotNull File file) {
        while (true) {
            boolean z = true;
            for (File file2 : d.walkBottomUp(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public static final boolean endsWith(@NotNull File file, @NotNull File file2) {
        FilePathComponents components = kotlin.io.b.toComponents(file);
        FilePathComponents components2 = kotlin.io.b.toComponents(file2);
        if (components2.isRooted()) {
            return Intrinsics.areEqual(file, file2);
        }
        int size = components.getSize() - components2.getSize();
        if (size < 0) {
            return false;
        }
        return components.getSegments().subList(size, components.getSize()).equals(components2.getSegments());
    }

    @NotNull
    public static final String getExtension(@NotNull File file) {
        return StringsKt__StringsKt.substringAfterLast(file.getName(), '.', "");
    }

    @NotNull
    public static final String getInvariantSeparatorsPath(@NotNull File file) {
        return File.separatorChar != '/' ? m.replace$default(file.getPath(), File.separatorChar, '/', false, 4, (Object) null) : file.getPath();
    }

    @NotNull
    public static String getNameWithoutExtension(@NotNull File file) {
        return StringsKt__StringsKt.substringBeforeLast$default(file.getName(), ".", (String) null, 2, (Object) null);
    }

    private static final List<File> n(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!Intrinsics.areEqual(name, ".")) {
                if (!Intrinsics.areEqual(name, "..")) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || Intrinsics.areEqual(((File) CollectionsKt.last((List) arrayList)).getName(), "..")) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public static final File normalize(@NotNull File file) {
        FilePathComponents components = kotlin.io.b.toComponents(file);
        return resolve(components.getRoot(), CollectionsKt___CollectionsKt.joinToString$default(n(components.getSegments()), File.separator, null, null, 0, null, null, 62, null));
    }

    private static final FilePathComponents o(FilePathComponents filePathComponents) {
        return new FilePathComponents(filePathComponents.getRoot(), n(filePathComponents.getSegments()));
    }

    private static final String p(File file, File file2) throws IOException {
        FilePathComponents filePathComponentsO = o(kotlin.io.b.toComponents(file));
        FilePathComponents filePathComponentsO2 = o(kotlin.io.b.toComponents(file2));
        if (!Intrinsics.areEqual(filePathComponentsO.getRoot(), filePathComponentsO2.getRoot())) {
            return null;
        }
        int size = filePathComponentsO2.getSize();
        int size2 = filePathComponentsO.getSize();
        int i = 0;
        int iMin = Math.min(size2, size);
        while (i < iMin && Intrinsics.areEqual(filePathComponentsO.getSegments().get(i), filePathComponentsO2.getSegments().get(i))) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = size - 1;
        if (i <= i2) {
            while (true) {
                int i3 = i2 - 1;
                if (Intrinsics.areEqual(filePathComponentsO2.getSegments().get(i2).getName(), "..")) {
                    return null;
                }
                sb.append("..");
                if (i2 != i) {
                    sb.append(File.separatorChar);
                }
                if (i2 == i) {
                    break;
                }
                i2 = i3;
            }
        }
        if (i < size2) {
            if (i < size) {
                sb.append(File.separatorChar);
            }
            CollectionsKt___CollectionsKt.joinTo(CollectionsKt___CollectionsKt.drop(filePathComponentsO.getSegments(), i), sb, (112 & 2) != 0 ? ", " : File.separator, (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null);
        }
        return sb.toString();
    }

    @NotNull
    public static final File relativeTo(@NotNull File file, @NotNull File file2) {
        return new File(toRelativeString(file, file2));
    }

    @Nullable
    public static final File relativeToOrNull(@NotNull File file, @NotNull File file2) throws IOException {
        String strP = p(file, file2);
        if (strP == null) {
            return null;
        }
        return new File(strP);
    }

    @NotNull
    public static final File relativeToOrSelf(@NotNull File file, @NotNull File file2) throws IOException {
        String strP = p(file, file2);
        return strP == null ? file : new File(strP);
    }

    @NotNull
    public static final File resolve(@NotNull File file, @NotNull File file2) {
        if (kotlin.io.b.isRooted(file2)) {
            return file2;
        }
        String string = file.toString();
        if ((string.length() == 0) || StringsKt__StringsKt.endsWith$default((CharSequence) string, File.separatorChar, false, 2, (Object) null)) {
            return new File(Intrinsics.stringPlus(string, file2));
        }
        return new File(string + File.separatorChar + file2);
    }

    @NotNull
    public static final File resolveSibling(@NotNull File file, @NotNull File file2) {
        FilePathComponents components = kotlin.io.b.toComponents(file);
        return resolve(resolve(components.getRoot(), components.getSize() == 0 ? new File("..") : components.subPath(0, components.getSize() - 1)), file2);
    }

    public static final boolean startsWith(@NotNull File file, @NotNull File file2) {
        FilePathComponents components = kotlin.io.b.toComponents(file);
        FilePathComponents components2 = kotlin.io.b.toComponents(file2);
        if (Intrinsics.areEqual(components.getRoot(), components2.getRoot()) && components.getSize() >= components2.getSize()) {
            return components.getSegments().subList(0, components2.getSize()).equals(components2.getSegments());
        }
        return false;
    }

    @NotNull
    public static final String toRelativeString(@NotNull File file, @NotNull File file2) throws IOException {
        String strP = p(file, file2);
        if (strP != null) {
            return strP;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + file2 + '.');
    }

    @NotNull
    public static final File resolve(@NotNull File file, @NotNull String str) {
        return resolve(file, new File(str));
    }

    @NotNull
    public static final File resolveSibling(@NotNull File file, @NotNull String str) {
        return resolveSibling(file, new File(str));
    }

    public static final boolean startsWith(@NotNull File file, @NotNull String str) {
        return startsWith(file, new File(str));
    }

    public static final boolean endsWith(@NotNull File file, @NotNull String str) {
        return endsWith(file, new File(str));
    }
}
