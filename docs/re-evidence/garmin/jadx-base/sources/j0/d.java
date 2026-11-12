package j0;

import android.os.Build;
import android.util.CloseGuard;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f95910a;

    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CloseGuard f95911a = new CloseGuard();

        @Override // j0.d.b
        public final void a() {
            this.f95911a.warnIfOpen();
        }

        @Override // j0.d.b
        public final void close() {
            this.f95911a.close();
        }
    }

    public interface b {
        void a();

        void close();
    }

    public static final class c implements b {
        @Override // j0.d.b
        public final void a() {
        }

        @Override // j0.d.b
        public final void close() {
        }
    }

    private d(b bVar) {
        this.f95910a = bVar;
    }

    public static d a() {
        return Build.VERSION.SDK_INT >= 30 ? new d(new a()) : new d(new c());
    }
}
