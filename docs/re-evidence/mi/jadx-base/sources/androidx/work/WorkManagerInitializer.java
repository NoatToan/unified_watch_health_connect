package androidx.work;

import android.content.Context;
import defpackage.iad;
import defpackage.ppe;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements iad<WorkManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3178a = ppe.i("WrkMgrInitializer");

    @Override // defpackage.iad
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public WorkManager create(Context context) {
        ppe.e().a(f3178a, "Initializing WorkManager with default configuration.");
        WorkManager.initialize(context, new Configuration.Builder().build());
        return WorkManager.getInstance(context);
    }

    @Override // defpackage.iad
    public List<Class<? extends iad<?>>> dependencies() {
        return Collections.emptyList();
    }
}
