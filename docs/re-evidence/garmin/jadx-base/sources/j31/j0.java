package j31;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.SafetyFeatureSetupWizardActivity;
import java.util.Arrays;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj31/j0;", "Lj31/z0;", "Lb31/f;", "onboardingChecksRepository", "<init>", "(Lb31/f;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j0 implements z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b31.f f96894b;

    public j0(b31.f fVar) {
        fVar.getClass();
        this.f96894b = fVar;
    }

    @Override // j31.z0
    public final Object c(long j8, v13.c cVar) {
        Object objG = ((m20.z) KoinJavaComponent.get$default(m20.z.class, null, null, 6, null)).g(cVar);
        return objG == u13.a.COROUTINE_SUSPENDED ? objG : Unit.INSTANCE;
    }

    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        Intent intent = new Intent(context, (Class<?>) SafetyFeatureSetupWizardActivity.class);
        e31.a[] aVarArr = (e31.a[]) k31.c.N0.f102647c.toArray(new e31.a[0]);
        if (!this.f96894b.f(j8, (e31.a[]) Arrays.copyOf(aVarArr, aVarArr.length))) {
            intent.putExtra("GCM_deviceUnitID", j8);
        }
        context.startActivity(intent);
    }
}
