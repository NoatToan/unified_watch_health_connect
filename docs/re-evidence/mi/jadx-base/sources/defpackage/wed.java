package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class wed extends ny6 {

    public class a implements ny6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f37898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f37899b;

        public a(Context context, String str) {
            this.f37898a = context;
            this.f37899b = str;
        }

        @Override // ny6.a
        public File a() {
            File cacheDir = this.f37898a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f37899b != null ? new File(cacheDir, this.f37899b) : cacheDir;
        }
    }

    public wed(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public wed(Context context, String str, long j) {
        super(new a(context, str), j);
    }
}
