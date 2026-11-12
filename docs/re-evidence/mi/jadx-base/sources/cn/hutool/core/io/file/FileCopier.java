package cn.hutool.core.io.file;

import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.lang.copier.SrcToDestCopier;
import defpackage.jm9;
import defpackage.qj1;
import defpackage.qk1;
import defpackage.sm9;
import defpackage.tt3;
import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class FileCopier extends SrcToDestCopier<File, FileCopier> {
    private static final long serialVersionUID = 1;
    private boolean isCopyAttributes;
    private boolean isCopyContentIfDir;
    private boolean isOnlyCopyFile;
    private boolean isOverride;

    /* JADX WARN: Multi-variable type inference failed */
    public FileCopier(File file, File file2) {
        this.src = file;
        this.dest = file2;
    }

    public static FileCopier create(String str, String str2) {
        return new FileCopier(jm9.o(str), jm9.o(str2));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void internalCopyDirContent(File file, File file2) throws IORuntimeException {
        sm9<T> sm9Var = this.copyFilter;
        if (sm9Var == 0 || sm9Var.accept((T) file)) {
            if (!file2.exists()) {
                file2.mkdirs();
            } else if (!file2.isDirectory()) {
                throw new IORuntimeException(tt3.y("Src [{}] is a directory but dest [{}] is a file!", file.getPath(), file2.getPath()));
            }
            String[] list = file.list();
            if (qj1.E(list)) {
                for (String str : list) {
                    File file3 = new File(file, str);
                    File file4 = this.isOnlyCopyFile ? file2 : new File(file2, str);
                    if (file3.isDirectory()) {
                        internalCopyDirContent(file3, file4);
                    } else {
                        internalCopyFile(file3, file4);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void internalCopyFile(File file, File file2) throws IORuntimeException {
        sm9<T> sm9Var = this.copyFilter;
        if (sm9Var == 0 || sm9Var.accept((T) file)) {
            if (file2.exists()) {
                if (file2.isDirectory()) {
                    file2 = new File(file2, file.getName());
                }
                if (file2.exists() && !this.isOverride) {
                    return;
                }
            } else {
                file2.getParentFile().mkdirs();
            }
            ArrayList arrayList = new ArrayList(2);
            if (this.isOverride) {
                arrayList.add(StandardCopyOption.REPLACE_EXISTING);
            }
            if (this.isCopyAttributes) {
                arrayList.add(StandardCopyOption.COPY_ATTRIBUTES);
            }
            try {
                Files.copy(file.toPath(), file2.toPath(), (CopyOption[]) arrayList.toArray(new CopyOption[0]));
            } catch (IOException e) {
                throw new IORuntimeException(e);
            }
        }
    }

    public boolean isCopyAttributes() {
        return this.isCopyAttributes;
    }

    public boolean isCopyContentIfDir() {
        return this.isCopyContentIfDir;
    }

    public boolean isOnlyCopyFile() {
        return this.isOnlyCopyFile;
    }

    public boolean isOverride() {
        return this.isOverride;
    }

    public FileCopier setCopyAttributes(boolean z) {
        this.isCopyAttributes = z;
        return this;
    }

    public FileCopier setCopyContentIfDir(boolean z) {
        this.isCopyContentIfDir = z;
        return this;
    }

    public FileCopier setOnlyCopyFile(boolean z) {
        this.isOnlyCopyFile = z;
        return this;
    }

    public FileCopier setOverride(boolean z) {
        this.isOverride = z;
        return this;
    }

    public static FileCopier create(File file, File file2) {
        return new FileCopier(file, file2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cn.hutool.core.lang.copier.SrcToDestCopier
    public File copy() throws IORuntimeException {
        File file = (File) this.src;
        File file2 = (File) this.dest;
        qk1.u(file, "Source File is null !", new Object[0]);
        if (!file.exists()) {
            throw new IORuntimeException("File not exist: " + file);
        }
        qk1.u(file2, "Destination File or directiory is null !", new Object[0]);
        if (jm9.l(file, file2)) {
            throw new IORuntimeException("Files '{}' and '{}' are equal", file, file2);
        }
        if (!file.isDirectory()) {
            internalCopyFile(file, file2);
        } else {
            if (file2.exists() && !file2.isDirectory()) {
                throw new IORuntimeException("Src is a directory but dest is a file!");
            }
            if (jm9.A(file, file2)) {
                throw new IORuntimeException("Dest is a sub directory of src !");
            }
            internalCopyDirContent(file, this.isCopyContentIfDir ? file2 : jm9.D(jm9.n(file2, file.getName())));
        }
        return file2;
    }
}
