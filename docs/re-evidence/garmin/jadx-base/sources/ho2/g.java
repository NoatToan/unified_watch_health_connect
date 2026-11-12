package ho2;

import com.garmin.feature.garminpay.providers.gpay.pushprovisioning.PushProvMainActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.pushprovisioning.PushProvMainActivity", f = "PushProvMainActivity.kt", l = {550}, m = "removeCreditCardIfCreated", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f84844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PushProvMainActivity f84845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84846c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PushProvMainActivity pushProvMainActivity, t13.d<? super g> dVar) {
        super(dVar);
        this.f84845b = pushProvMainActivity;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f84844a = obj;
        this.f84846c |= Integer.MIN_VALUE;
        return PushProvMainActivity.da(this.f84845b, this);
    }
}
