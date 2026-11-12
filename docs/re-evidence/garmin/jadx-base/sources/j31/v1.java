package j31;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.workouts.presentation.list.WorkoutListActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj31/v1;", "Lj31/z0;", "Ll52/y;", "workoutsRepository", "<init>", "(Ll52/y;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v1 implements z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l52.y f96939b;

    public v1(l52.y yVar) {
        yVar.getClass();
        this.f96939b = yVar;
    }

    @Override // j31.z0
    public final Object c(long j8, v13.c cVar) {
        Object objL = this.f96939b.l(cVar);
        return objL == u13.a.COROUTINE_SUSPENDED ? objL : Unit.INSTANCE;
    }

    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        context.startActivity(new Intent(context, (Class<?>) WorkoutListActivity.class));
    }
}
