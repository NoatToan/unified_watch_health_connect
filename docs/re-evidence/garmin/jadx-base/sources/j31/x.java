package j31;

import android.content.Context;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj31/x;", "Lj31/z0;", "Lgu1/b;", "repo", "<init>", "(Lgu1/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x implements z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gu1.b f96943b;

    static {
        gu1.b.a aVar = gu1.b.f79047b;
    }

    public x(gu1.b bVar) {
        bVar.getClass();
        this.f96943b = bVar;
    }

    @Override // j31.z0
    public final Object c(long j8, v13.c cVar) {
        Object objA = this.f96943b.a(cVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }

    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        ds.e0.p(context, str, str2);
        context.startActivity(ActiveTrainingPlansActivity.a.b(ActiveTrainingPlansActivity.f45098w, context, false));
    }
}
