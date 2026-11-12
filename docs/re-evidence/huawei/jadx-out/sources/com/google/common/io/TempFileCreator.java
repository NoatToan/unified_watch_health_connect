package com.google.common.io;

import com.google.common.base.StandardSystemProperty;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import com.google.common.io.TempFileCreator;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.utils.CloudParamKeys;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.FileSystems;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryFlag;
import java.nio.file.attribute.AclEntryPermission;
import java.nio.file.attribute.AclEntryType;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class TempFileCreator {
    static final TempFileCreator INSTANCE = pickSecureCreator();

    abstract File createTempDir();

    abstract File createTempFile(String str) throws IOException;

    private static TempFileCreator pickSecureCreator() {
        try {
            try {
                Class.forName("java.nio.file.Path");
                return new JavaNioCreator();
            } catch (ClassNotFoundException unused) {
                if (((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue() < ((Integer) Class.forName("android.os.Build$VERSION_CODES").getField("JELLY_BEAN").get(null)).intValue()) {
                    return new c();
                }
                return new a();
            }
        } catch (ClassNotFoundException unused2) {
            return new c();
        } catch (IllegalAccessException unused3) {
            return new c();
        } catch (NoSuchFieldException unused4) {
            return new c();
        }
    }

    static void testMakingUserPermissionsFromScratch() throws IOException {
        JavaNioCreator.j().get();
    }

    public static final class JavaNioCreator extends TempFileCreator {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final PermissionSupplier f4615c;
        private static final PermissionSupplier d;

        public interface PermissionSupplier {
            FileAttribute<?> get() throws IOException;
        }

        public static /* synthetic */ FileAttribute a(FileAttribute fileAttribute) throws IOException {
            return fileAttribute;
        }

        private JavaNioCreator() {
            super();
        }

        @Override // com.google.common.io.TempFileCreator
        File createTempDir() {
            try {
                return java.nio.file.Files.createTempDirectory(Paths.get(StandardSystemProperty.JAVA_IO_TMPDIR.value(), new String[0]), null, d.get()).toFile();
            } catch (IOException e) {
                throw new IllegalStateException("Failed to create directory", e);
            }
        }

        @Override // com.google.common.io.TempFileCreator
        File createTempFile(String str) throws IOException {
            return java.nio.file.Files.createTempFile(Paths.get(StandardSystemProperty.JAVA_IO_TMPDIR.value(), new String[0]), str, null, f4615c.get()).toFile();
        }

        static {
            Set<String> setSupportedFileAttributeViews = FileSystems.getDefault().supportedFileAttributeViews();
            if (setSupportedFileAttributeViews.contains("posix")) {
                f4615c = new PermissionSupplier() { // from class: apk
                    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
                    public final FileAttribute get() {
                        return PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rw-------"));
                    }
                };
                d = new PermissionSupplier() { // from class: apl
                    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
                    public final FileAttribute get() {
                        return PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rwx------"));
                    }
                };
            } else if (setSupportedFileAttributeViews.contains("acl")) {
                PermissionSupplier permissionSupplierJ = j();
                d = permissionSupplierJ;
                f4615c = permissionSupplierJ;
            } else {
                PermissionSupplier permissionSupplier = new PermissionSupplier() { // from class: api
                    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
                    public final FileAttribute get() {
                        return TempFileCreator.JavaNioCreator.e();
                    }
                };
                d = permissionSupplier;
                f4615c = permissionSupplier;
            }
        }

        public static /* synthetic */ FileAttribute e() throws IOException {
            throw new IOException("unrecognized FileSystem type " + FileSystems.getDefault());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static PermissionSupplier j() {
            try {
                final ImmutableList immutableListOf = ImmutableList.of(AclEntry.newBuilder().setType(AclEntryType.ALLOW).setPrincipal(FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName(d())).setPermissions(EnumSet.allOf(AclEntryPermission.class)).setFlags(AclEntryFlag.DIRECTORY_INHERIT, AclEntryFlag.FILE_INHERIT).build());
                final FileAttribute<ImmutableList<AclEntry>> fileAttribute = new FileAttribute<ImmutableList<AclEntry>>() { // from class: com.google.common.io.TempFileCreator.JavaNioCreator.5
                    @Override // java.nio.file.attribute.FileAttribute
                    public String name() {
                        return "acl:acl";
                    }

                    @Override // java.nio.file.attribute.FileAttribute
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public ImmutableList<AclEntry> value() {
                        return immutableListOf;
                    }
                };
                return new PermissionSupplier() { // from class: apj
                    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
                    public final FileAttribute get() {
                        return TempFileCreator.JavaNioCreator.a(fileAttribute);
                    }
                };
            } catch (IOException e) {
                return new PermissionSupplier() { // from class: apm
                    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
                    public final FileAttribute get() {
                        return TempFileCreator.JavaNioCreator.d(e);
                    }
                };
            }
        }

        public static /* synthetic */ FileAttribute d(IOException iOException) throws IOException {
            throw new IOException("Could not find user", iOException);
        }

        private static String d() {
            String str = (String) Objects.requireNonNull(StandardSystemProperty.USER_NAME.value());
            try {
                Class<?> cls = Class.forName("java.lang.ProcessHandle");
                Class<?> cls2 = Class.forName("java.lang.ProcessHandle$Info");
                Class<?> cls3 = Class.forName("java.util.Optional");
                Method method = cls.getMethod("current", new Class[0]);
                return (String) Objects.requireNonNull(cls3.getMethod("orElse", Object.class).invoke(cls2.getMethod("user", new Class[0]).invoke(cls.getMethod(CloudParamKeys.INFO, new Class[0]).invoke(method.invoke(null, new Object[0]), new Object[0]), new Object[0]), str));
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException unused) {
                return str;
            } catch (InvocationTargetException e) {
                Throwables.throwIfUnchecked(e.getCause());
                return str;
            }
        }
    }

    static final class a extends TempFileCreator {
        private a() {
            super();
        }

        @Override // com.google.common.io.TempFileCreator
        File createTempDir() {
            File file = new File(StandardSystemProperty.JAVA_IO_TMPDIR.value());
            String str = System.currentTimeMillis() + Constants.LINK;
            for (int i = 0; i < 10000; i++) {
                File file2 = new File(file, str + i);
                if (file2.mkdir()) {
                    return file2;
                }
            }
            throw new IllegalStateException("Failed to create directory within 10000 attempts (tried " + str + "0 to " + str + "9999)");
        }

        @Override // com.google.common.io.TempFileCreator
        File createTempFile(String str) throws IOException {
            return File.createTempFile(str, null, null);
        }
    }

    static final class c extends TempFileCreator {
        private c() {
            super();
        }

        @Override // com.google.common.io.TempFileCreator
        File createTempDir() {
            throw new IllegalStateException("Guava cannot securely create temporary files or directories under SDK versions before Jelly Bean. You can create one yourself, either in the insecure default directory or in a more secure directory, such as context.getCacheDir(). For more information, see the Javadoc for Files.createTempDir().");
        }

        @Override // com.google.common.io.TempFileCreator
        File createTempFile(String str) throws IOException {
            throw new IOException("Guava cannot securely create temporary files or directories under SDK versions before Jelly Bean. You can create one yourself, either in the insecure default directory or in a more secure directory, such as context.getCacheDir(). For more information, see the Javadoc for Files.createTempDir().");
        }
    }

    private TempFileCreator() {
    }
}
