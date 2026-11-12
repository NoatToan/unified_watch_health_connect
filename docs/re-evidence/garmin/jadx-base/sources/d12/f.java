package d12;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.usageindicators.UsageIndicatorsRepositoryImpl", f = "UsageIndicatorsRepositoryImpl.kt", l = {19, 22}, m = "getUsageIndicators", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f57094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f57095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f57096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f57097d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f57096c = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f57095b = obj;
        this.f57097d |= Integer.MIN_VALUE;
        return this.f57096c.a(this);
    }
}
