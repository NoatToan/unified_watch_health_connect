package ek1;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.domain.ConnectThirdPartyUseCase", f = "ConnectThirdPartyUseCase.kt", l = {24, 29}, m = "invoke", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f64438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f64439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e23.l f64440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e23.l f64441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e23.l f64442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v2.b f64443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f64444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f64445h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f64446i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, t13.d<? super f> dVar2) {
        super(dVar2);
        this.f64445h = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f64444g = obj;
        this.f64446i |= Integer.MIN_VALUE;
        return this.f64445h.b(null, null, null, null, null, null, null, this);
    }
}
