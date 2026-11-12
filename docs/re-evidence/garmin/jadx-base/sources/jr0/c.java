package jr0;

import com.garmin.android.apps.connectmobile.v2;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.intensityminutes.data.repository.IntensityMinutesRepositoryImpl", f = "IntensityMinutesRepositoryImpl.kt", l = {34, 37, 66}, m = "getDailyIntensityMinutes", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DateTime f100511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2 f100512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ir0.a f100513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f100514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f100515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f100516f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f100515e = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f100514d = obj;
        this.f100516f |= Integer.MIN_VALUE;
        return this.f100515e.a(null, this);
    }
}
