package mr;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.domain.GetActivityEpicsUseCase", f = "GetActivityEpicsUseCase.kt", l = {14, 19}, m = "invoke", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f120298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f120299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f120300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f120301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f120302e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(q qVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f120301d = qVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f120300c = obj;
        this.f120302e |= Integer.MIN_VALUE;
        return this.f120301d.c(0L, null, this);
    }
}
