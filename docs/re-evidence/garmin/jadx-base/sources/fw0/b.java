package fw0;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.logging.presentation.reminders.LifestyleLoggingAlarmReceiver;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import pd1.c;
import tn.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfw0/b;", "Lud1/a;", "", "navigateToYesterday", "<init>", "(Z)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends ud1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f73778a;

    public /* synthetic */ b(boolean z14, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14);
    }

    @Override // ud1.a
    public final Intent d(Context context) {
        return sn.a.d(context, context, LifestyleLoggingAlarmReceiver.class);
    }

    @Override // ud1.a
    public final String e(Context context) {
        context.getClass();
        return k.g(context.getPackageName(), ".action.ACTION_LIFESTYLE_LOGGING_REMINDER");
    }

    @Override // ud1.a
    public final c g() {
        return ((qv0.a) KoinJavaComponent.get$default(qv0.a.class, null, null, 6, null)).b();
    }

    @Override // ud1.a
    public final boolean i(pd1.b bVar) {
        Boolean enabled = bVar.getEnabled();
        if (enabled != null) {
            return enabled.booleanValue();
        }
        return false;
    }

    @Override // ud1.a
    public final void m(c cVar) {
        cVar.getClass();
        ((qv0.a) KoinJavaComponent.get$default(qv0.a.class, null, null, 6, null)).d(cVar);
    }

    public b(boolean z14) {
        this.f73778a = z14;
    }

    public b() {
        this(false, 1, null);
    }
}
