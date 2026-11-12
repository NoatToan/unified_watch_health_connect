package kd0;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.workouts.presentation.selectworkout.SelectWorkoutActivityActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkd0/w3;", "Lof2/y0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w3 implements of2.y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f104411a;

    static {
        new a(null);
    }

    public w3(Context context) {
        context.getClass();
        this.f104411a = context;
    }

    @Override // of2.y0
    public final void a(long j8, zf2.d dVar) {
        dVar.getClass();
        zf2.d.f204601l.getClass();
        mt2.k kVar = dVar.f204636h;
        m52.k kVarC = null;
        String str = kVar != null ? kVar.f121072a : null;
        if (str != null) {
            m52.k.f116753m.getClass();
            kVarC = m52.k.a.c(str);
        }
        if (kVarC == null) {
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(com.garmin.android.apps.connectmobile.a2.WORKOUTS, "LiveActivityActionDelegateImpl", "No matching WorkoutSportType for " + dVar + ", unable to open SelectWorkoutActivityActivity.");
            return;
        }
        SelectWorkoutActivityActivity.f49549a.getClass();
        Context context = this.f104411a;
        Intent intent = new Intent(context, (Class<?>) SelectWorkoutActivityActivity.class);
        intent.putExtra("extra_activity_type_key", kVarC.f116765a);
        intent.putExtra("extra_device_id", j8);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkd0/w3$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
