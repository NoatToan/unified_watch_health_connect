package ve;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lve/q;", "Lkd/a;", "Landroid/content/Context;", "mContext", "", "startVersion", "endVersion", "<init>", "(Landroid/content/Context;II)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q extends kd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f177593a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, int i14, int i15) {
        super(i14, i15);
        context.getClass();
        this.f177593a = context;
    }

    @Override // kd.a
    public final void migrate(vd.c cVar) {
        cVar.getClass();
        if (this.endVersion >= 10) {
            cVar.I1(new Object[]{"reschedule_needed", 1});
        } else {
            this.f177593a.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
