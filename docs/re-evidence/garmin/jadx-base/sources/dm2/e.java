package dm2;

import android.text.TextUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p1.z;

/* JADX INFO: loaded from: classes11.dex */
public class e extends com.garmin.android.library.backgroundtaskmanagement.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Logger f60463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f60464j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f60465k;

    public interface a {
        void a();
    }

    public e(com.garmin.android.library.backgroundtaskmanagement.b bVar, boolean z14, long j8, String str) {
        super(bVar, z14);
        this.f60464j = j8;
        this.f60465k = str;
        this.f60463i = LoggerFactory.getLogger("DeviceCategoriesUpdateInMemoryCacheTask");
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.f
    public final void a() throws Throwable {
        long j8 = this.f60464j;
        String str = this.f60465k;
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!(td2.a.f163901a != null)) {
                    td2.a.b();
                }
                z<String> zVar = td2.a.f163901a;
                if (zVar != null) {
                    zVar.f(j8, str);
                }
                ((a) lm2.h.f()).a();
            }
            c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
        } catch (Exception e4) {
            this.f60463i.error(e4.getMessage(), (Throwable) e4);
            if (this.f50128h) {
                c(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
            } else {
                c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
            }
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.d
    public final void b() {
    }
}
