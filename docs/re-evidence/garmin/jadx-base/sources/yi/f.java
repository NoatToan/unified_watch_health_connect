package yi;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends d {

    public class a implements d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f197302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f197303b;

        public a(Context context, String str) {
            this.f197302a = context;
            this.f197303b = str;
        }

        @Override // yi.d.c
        public final File a() {
            File cacheDir = this.f197302a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            String str = this.f197303b;
            return str != null ? new File(cacheDir, str) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public f(Context context, long j8) {
        this(context, "image_manager_disk_cache", j8);
    }

    public f(Context context, String str, long j8) {
        super(new a(context, str), j8);
    }
}
