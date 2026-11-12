package org.junit.rules;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes23.dex */
public class TemporaryFolder extends ExternalResource {
    private final File a;
    private File b;

    public TemporaryFolder() {
        this(null);
    }

    private File b(File file) throws IOException {
        File fileCreateTempFile = File.createTempFile("junit", "", file);
        fileCreateTempFile.delete();
        fileCreateTempFile.mkdir();
        return fileCreateTempFile;
    }

    private boolean c(int i, String[] strArr) {
        return i == strArr.length - 1;
    }

    private void d(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                d(file2);
            }
        }
        file.delete();
    }

    private void e(String str) throws IOException {
        if (new File(str).getParent() != null) {
            throw new IOException("Folder name cannot consist of multiple path components separated by a file separator. Please use newFolder('MyParentFolder','MyFolder') to create hierarchies of folders");
        }
    }

    @Override // org.junit.rules.ExternalResource
    public void after() {
        delete();
    }

    @Override // org.junit.rules.ExternalResource
    public void before() throws Throwable {
        create();
    }

    public void create() throws IOException {
        this.b = b(this.a);
    }

    public void delete() {
        File file = this.b;
        if (file != null) {
            d(file);
        }
    }

    public File getRoot() {
        File file = this.b;
        if (file != null) {
            return file;
        }
        throw new IllegalStateException("the temporary folder has not yet been created");
    }

    public File newFile(String str) throws IOException {
        File file = new File(getRoot(), str);
        if (file.createNewFile()) {
            return file;
        }
        throw new IOException("a file with the name '" + str + "' already exists in the test folder");
    }

    public File newFolder(String str) throws IOException {
        return newFolder(str);
    }

    public TemporaryFolder(File file) {
        this.a = file;
    }

    public File newFolder(String... strArr) throws IOException {
        File root = getRoot();
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            e(str);
            File file = new File(root, str);
            if (!file.mkdir() && c(i, strArr)) {
                throw new IOException("a folder with the name '" + str + "' already exists");
            }
            i++;
            root = file;
        }
        return root;
    }

    public File newFile() throws IOException {
        return File.createTempFile("junit", null, getRoot());
    }

    public File newFolder() throws IOException {
        return b(getRoot());
    }
}
