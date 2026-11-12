package xx2;

import android.net.Uri;
import d53.w;
import e23.p;
import java.util.Locale;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.subscriptions.SubscriptionPurchaseHelper$canOpenReturnURL$2", f = "SubscriptionPurchaseHelper.kt", l = {}, m = "invokeSuspend")
public final class c extends i implements p<b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Uri f192589a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Uri uri, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f192589a = uri;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f192589a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String lowerCase;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        d.f192590a.getClass();
        if (!d.f192592c.get()) {
            d.f192591b.error("No purchase is in progress, cannot handle a redirect URL");
            return Boolean.FALSE;
        }
        String host = this.f192589a.getHost();
        if (host != null) {
            lowerCase = host.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        if (lowerCase == null) {
            d.f192591b.error("URL host is null or not usable by the library");
            return Boolean.FALSE;
        }
        boolean z14 = false;
        for (String str : d.f192593d) {
            String lowerCase2 = str.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            if (w.z(lowerCase2, lowerCase, false)) {
                z14 = true;
                break;
            }
        }
        return Boolean.valueOf(z14);
    }
}
