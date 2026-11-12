package kd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.MyFitnessPalAccountActivity;
import com.garmin.android.apps.connectmobile.settings.thirdparty.Office365ConnectActivity;
import com.garmin.android.apps.connectmobile.settings.thirdparty.google.GoogleHealthConnectActivity;
import com.garmin.android.apps.connectmobile.strava.StravaConfigActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkd0/d6;", "Ldk1/a;", "Lm01/a;", "myFitnessPalRepo", "<init>", "(Lm01/a;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d6 implements dk1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m01.a f104030a;

    static {
        new a(null);
    }

    public d6(m01.a aVar) {
        aVar.getClass();
        this.f104030a = aVar;
    }

    @Override // dk1.a
    public final Intent a(Context context) {
        return sn.a.d(context, context, StravaConfigActivity.class);
    }

    @Override // dk1.a
    public final void b(Activity activity) {
        com.garmin.android.apps.connectmobile.navigation.b.a.b(com.garmin.android.apps.connectmobile.navigation.b.f39357a, ty0.b.f166886k1, activity, null, 12);
    }

    @Override // dk1.a
    public final Intent c(Context context) {
        context.getClass();
        MyFitnessPalAccountActivity.f39608c.getClass();
        bv.b.f21239a.getClass();
        bv.b.a();
        com.garmin.android.apps.connectmobile.k1.f37122a.getClass();
        if (((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f()) {
            return null;
        }
        if (!z10.d1.f()) {
            return new Intent(context, (Class<?>) MyFitnessPalAccountActivity.class);
        }
        z10.d1.o(context, new xk1.v(12));
        return null;
    }

    @Override // dk1.a
    public final void d(Context context, hk1.p pVar, c.q qVar, mk1.b bVar) {
        context.getClass();
        pVar.getClass();
        qVar.getClass();
        String str = pVar.f84181a;
        if (p005kotlin.jvm.internal.s.g(str, hk1.v.f84198d.f84204a)) {
            Office365ConnectActivity.f43946j.getClass();
            qVar.a(new Intent(context, (Class<?>) Office365ConnectActivity.class), null);
            return;
        }
        if (p005kotlin.jvm.internal.s.g(str, hk1.v.f84199e.f84204a)) {
            Intent intentC = c(context);
            if (intentC != null) {
                qVar.a(intentC, null);
                return;
            }
            return;
        }
        if (p005kotlin.jvm.internal.s.g(str, hk1.v.f84200f.f84204a)) {
            qVar.a(a(context), null);
        } else if (!p005kotlin.jvm.internal.s.g(str, hk1.v.f84201g.f84204a)) {
            bVar.invoke();
        } else {
            GoogleHealthConnectActivity.f43979c.getClass();
            qVar.a(new Intent(context, (Class<?>) GoogleHealthConnectActivity.class), null);
        }
    }

    @Override // dk1.a
    public final Object e(ek1.o oVar) throws Throwable {
        x53.c cVar = o53.s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new e6(this, null), oVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkd0/d6$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
