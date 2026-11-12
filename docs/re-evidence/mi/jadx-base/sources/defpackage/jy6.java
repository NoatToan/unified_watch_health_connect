package defpackage;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jy6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jy6 f23238a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final jy6 f23239b = new b();
    public static final jy6 c = new c();
    public static final jy6 d = new d();
    public static final jy6 e = new e();

    public class a extends jy6 {
        @Override // defpackage.jy6
        public boolean a() {
            return true;
        }

        @Override // defpackage.jy6
        public boolean b() {
            return true;
        }

        @Override // defpackage.jy6
        public boolean c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // defpackage.jy6
        public boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    public class b extends jy6 {
        @Override // defpackage.jy6
        public boolean a() {
            return false;
        }

        @Override // defpackage.jy6
        public boolean b() {
            return false;
        }

        @Override // defpackage.jy6
        public boolean c(DataSource dataSource) {
            return false;
        }

        @Override // defpackage.jy6
        public boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    public class c extends jy6 {
        @Override // defpackage.jy6
        public boolean a() {
            return true;
        }

        @Override // defpackage.jy6
        public boolean b() {
            return false;
        }

        @Override // defpackage.jy6
        public boolean c(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // defpackage.jy6
        public boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    public class d extends jy6 {
        @Override // defpackage.jy6
        public boolean a() {
            return false;
        }

        @Override // defpackage.jy6
        public boolean b() {
            return true;
        }

        @Override // defpackage.jy6
        public boolean c(DataSource dataSource) {
            return false;
        }

        @Override // defpackage.jy6
        public boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    public class e extends jy6 {
        @Override // defpackage.jy6
        public boolean a() {
            return true;
        }

        @Override // defpackage.jy6
        public boolean b() {
            return true;
        }

        @Override // defpackage.jy6
        public boolean c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // defpackage.jy6
        public boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(DataSource dataSource);

    public abstract boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);
}
