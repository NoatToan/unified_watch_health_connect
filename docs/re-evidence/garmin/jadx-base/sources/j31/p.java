package j31;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.contacts.ContactsMigrationActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj31/p;", "Lj31/z0;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p implements z0 {
    @Override // j31.z0
    public final Object c(long j8, v13.c cVar) {
        Object objG = ((m20.z) KoinJavaComponent.get$default(m20.z.class, null, null, 6, null)).g(cVar);
        return objG == u13.a.COROUTINE_SUSPENDED ? objG : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        o13.p pVarC = cw.j.c(context);
        context.startActivity(ContactsMigrationActivity.a.b(ContactsMigrationActivity.f32322j, context, (Intent) pVarC.f128594a, (Intent[]) pVarC.f128595b, 16));
    }
}
