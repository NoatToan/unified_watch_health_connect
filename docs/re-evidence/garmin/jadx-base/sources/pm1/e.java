package pm1;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.sleep.domain.GetCachedSleepDataUseCase", f = "GetCachedSleepDataUseCase.kt", l = {28}, m = "invoke", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LocalDate f138636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LocalDate f138637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f138638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f138639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f138640e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f138639d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f138638c = obj;
        this.f138640e |= Integer.MIN_VALUE;
        return this.f138639d.b(this);
    }
}
