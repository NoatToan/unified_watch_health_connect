package ui1;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.network.InReachSubscriptionRepository", f = "InReachSubscriptionRepository.kt", l = {40, 42, 43, 44, 46}, m = "getSubscriptionDestination", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f171322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f171323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f171324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f171325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f171326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f171327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f171328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f171329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f171330i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l lVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f171329h = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f171328g = obj;
        this.f171330i |= Integer.MIN_VALUE;
        return this.f171329h.c(0L, this);
    }
}
