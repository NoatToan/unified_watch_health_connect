package dr2;

import ms2.f;
import p005kotlin.Metadata;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@e(c = "com.garmin.feature.garminpay.ui.common.repository.GarminPayFacadeRepository", f = "GarminPayFacadeRepository.kt", l = {51, 69}, m = "validateAddCardPrecondition", v = 2)
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f60862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f60863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f60864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f60865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f60866e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, d<? super b> dVar) {
        super(dVar);
        this.f60865d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f60864c = obj;
        this.f60866e |= Integer.MIN_VALUE;
        return this.f60865d.c(null, 0L, this);
    }
}
