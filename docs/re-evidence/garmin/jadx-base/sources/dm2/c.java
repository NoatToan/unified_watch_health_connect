package dm2;

import android.content.Context;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public class c extends com.garmin.android.library.backgroundtaskmanagement.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Logger f60459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WeakReference<Context> f60460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f60461k;

    public c(com.garmin.android.library.backgroundtaskmanagement.b bVar, Context context, boolean z14, String str) {
        super(bVar, z14);
        this.f60460j = new WeakReference<>(context);
        this.f60461k = str;
        this.f60459i = LoggerFactory.getLogger("DeviceCapabilitiesChangedBroadcastTask");
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.f
    public final void a() throws Throwable {
        String str = this.f60461k;
        try {
            if (this.f60460j.get() == null) {
                if (this.f50128h) {
                    c(com.garmin.android.library.backgroundtaskmanagement.b.c.CONTEXT_NULL);
                    return;
                } else {
                    c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
                    return;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                if (!(td2.a.f163901a != null)) {
                    td2.a.b();
                }
                td2.a.c(str);
            }
            lm2.f fVarE = lm2.h.e();
            if (fVarE instanceof em2.e) {
                ((em2.e) fVarE).a();
            }
            this.f50126f.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE);
            c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
        } catch (Exception e4) {
            this.f60459i.error(e4.getMessage(), (Throwable) e4);
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
