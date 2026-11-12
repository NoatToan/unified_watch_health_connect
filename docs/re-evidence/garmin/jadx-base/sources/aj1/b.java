package aj1;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import gg1.v0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.notifications.EmailNotificationSettingsFragment$launchAuthenticatedUrlInBrowser$1", f = "EmailNotificationSettingsFragment.kt", l = {332}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.notifications.a f3426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3427c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.garmin.android.apps.connectmobile.settings.notifications.a aVar, String str, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f3426b = aVar;
        this.f3427c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f3426b, this.f3427c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws UnsupportedEncodingException {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f3425a;
        String str = this.f3427c;
        com.garmin.android.apps.connectmobile.settings.notifications.a aVar2 = this.f3426b;
        if (i14 == 0) {
            r.b(obj);
            g22.e.l(aVar2);
            com.garmin.android.apps.connectmobile.settings.notifications.a.C0807a c0807a = com.garmin.android.apps.connectmobile.settings.notifications.a.Q0;
            p pVar = (p) aVar2.f43575i.getValue();
            this.f3425a = 1;
            obj = pVar.x4(str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            g22.e.f(aVar2);
            String strA = ((pu.k) ((v2.b) v2Var).f47386a).a();
            strA.getClass();
            str.getClass();
            try {
                v0.a aVar3 = v0.T;
                String strName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h().name();
                aVar3.getClass();
                aVar2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://" + v0.a.a(strName).f77335a.f204880a + "/sso/login?logintoken=" + strA + "&mobile=true&service=" + URLEncoder.encode(str, "UTF-8") + "&clientId=GarminConnect")));
            } catch (ActivityNotFoundException e4) {
                a2 a2Var = a2.GENERAL;
                String strConcat = "openExternalUrlAuthenticatedUserOauth1 ".concat(str);
                i2.f36769a.getClass();
                i2.a.g(a2Var, strConcat, e4);
                g22.e.a(aVar2, null);
            }
        } else {
            g22.e.f(aVar2);
            g22.e.i(aVar2, Uri.parse(str));
        }
        return Unit.INSTANCE;
    }
}
