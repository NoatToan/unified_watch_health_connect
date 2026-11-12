package m42;

import b63.o;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.data.repository.WeightsRepository", f = "WeightsRepository.kt", l = {46, 52}, m = "deleteAllWeightsForDateAsync", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f116609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2.b f116610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f116611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f116612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f116613e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f116612d = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f116611c = obj;
        this.f116613e |= Integer.MIN_VALUE;
        return this.f116612d.a(null, this);
    }
}
