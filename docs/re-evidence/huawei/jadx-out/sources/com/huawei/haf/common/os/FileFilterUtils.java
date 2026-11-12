package com.huawei.haf.common.os;

import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes2.dex */
public final class FileFilterUtils {
    private FileFilterUtils() {
    }

    public static class FileNotEqualsCollectFilter implements FilenameFilter {
        private final String e;

        public FileNotEqualsCollectFilter(String str) {
            this.e = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return !str.equals(this.e);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class FileContainCollectFilter implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f5905a;
        private final long d;
        private final String e;

        public FileContainCollectFilter(String str, long j) {
            this.e = str;
            this.f5905a = j > 0 ? System.currentTimeMillis() : 0L;
            this.d = j;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            if (!TextUtils.isEmpty(this.e) && !b(str, this.e)) {
                return false;
            }
            if (this.d <= 0) {
                return true;
            }
            File file2 = new File(file, str);
            return file2.isFile() && this.f5905a - file2.lastModified() >= this.d;
        }

        protected boolean b(String str, String str2) {
            return str.indexOf(str2) != -1;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class FileExtensionCollectFilter extends FileContainCollectFilter {
        public FileExtensionCollectFilter(String str) {
            super(str, 0L);
        }

        public FileExtensionCollectFilter(String str, long j) {
            super(str, j);
        }

        @Override // com.huawei.haf.common.os.FileFilterUtils.FileContainCollectFilter
        protected boolean b(String str, String str2) {
            return str.endsWith(str2);
        }
    }

    public static class FilePrefixCollectFilter extends FileContainCollectFilter {
        public FilePrefixCollectFilter(String str) {
            super(str, 0L);
        }

        public FilePrefixCollectFilter(String str, long j) {
            super(str, j);
        }

        @Override // com.huawei.haf.common.os.FileFilterUtils.FileContainCollectFilter
        protected boolean b(String str, String str2) {
            return str.startsWith(str2);
        }
    }
}
