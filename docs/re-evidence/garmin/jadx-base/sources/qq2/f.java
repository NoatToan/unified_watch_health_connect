package qq2;

import android.content.Intent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.rabbit.ui.RabbitCardDetailPresenter", f = "RabbitCardDetailPresenter.kt", l = {50, 55}, m = "prepareMyRabbitNavigation", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f146081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Intent f146082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f146083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.rabbit.ui.b f146084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f146085e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.garmin.feature.garminpay.providers.rabbit.ui.b bVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f146084d = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f146083c = obj;
        this.f146085e |= Integer.MIN_VALUE;
        return com.garmin.feature.garminpay.providers.rabbit.ui.b.g0(this.f146084d, this);
    }
}
