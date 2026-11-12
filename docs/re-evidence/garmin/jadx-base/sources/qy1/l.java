package qy1;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.domain.event.GetTriathlonEventStrategyDataUseCase", f = "GetTriathlonEventStrategyDataUseCase.kt", l = {10, 11}, m = "invoke", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f148586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f148587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v2 f148588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f148589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f148590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f148591f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f148590e = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f148589d = obj;
        this.f148591f |= Integer.MIN_VALUE;
        return this.f148590e.a(null, null, this);
    }
}
