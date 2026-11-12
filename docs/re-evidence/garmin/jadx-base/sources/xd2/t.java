package xd2;

import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository", f = "DefaultLivetrackRepository.kt", l = {260}, m = "getLivetrackSessions", v = 2)
public final class t extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f190335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f190336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f190337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f190338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f190339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f190340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f190341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f190342h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(b bVar, t13.d<? super t> dVar) {
        super(dVar);
        this.f190341g = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f190340f = obj;
        this.f190342h |= Integer.MIN_VALUE;
        return this.f190341g.u(null, this);
    }
}
