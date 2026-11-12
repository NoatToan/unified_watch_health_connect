package mn0;

import java.util.LinkedHashSet;
import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.healthstatus.domain.GetHealthStatusFeaturesStateUseCase", f = "GetHealthStatusFeaturesStateUseCase.kt", l = {26}, m = "invoke-gIAlu-s", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedHashSet f119742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f119743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f119744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f119745d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f119744c = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f119743b = obj;
        this.f119745d |= Integer.MIN_VALUE;
        Object objA = this.f119744c.a(0L, this);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : q.a(objA);
    }
}
