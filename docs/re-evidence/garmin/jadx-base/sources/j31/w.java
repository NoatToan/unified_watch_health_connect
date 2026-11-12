package j31;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.EcgOnboardingActivity;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgActivity;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lj31/w;", "Lj31/z0;", "Lb31/f;", "onboardingChecksRepository", "Lff0/i;", "ecgRepository", "<init>", "(Lb31/f;Lff0/i;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w implements z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b31.f f96940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ff0.i f96941c;

    static {
        new a(null);
    }

    public w(b31.f fVar, ff0.i iVar) {
        fVar.getClass();
        iVar.getClass();
        this.f96940b = fVar;
        this.f96941c = iVar;
    }

    @Override // j31.z0
    public final Object c(long j8, v13.c cVar) {
        ff0.i iVar = this.f96941c;
        String strA = iVar.a(j8);
        if (strA != null) {
            Object objH = iVar.h(j8, strA, cVar);
            if (objH == u13.a.COROUTINE_SUSPENDED) {
                return objH;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        Intent intent;
        ds.e0.p(context, str, str2);
        e31.a[] aVarArr = (e31.a[]) k31.c.X.f102647c.toArray(new e31.a[0]);
        if (this.f96940b.f(j8, (e31.a[]) Arrays.copyOf(aVarArr, aVarArr.length))) {
            EcgActivity.f34850a.getClass();
            intent = new Intent(context, (Class<?>) EcgActivity.class);
        } else {
            EcgOnboardingActivity.f34765b.getClass();
            Intent intent2 = new Intent(context, (Class<?>) EcgOnboardingActivity.class);
            intent2.putExtra("DEVICE_UNIT_ID", j8);
            intent = intent2;
        }
        context.startActivity(intent);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj31/w$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
