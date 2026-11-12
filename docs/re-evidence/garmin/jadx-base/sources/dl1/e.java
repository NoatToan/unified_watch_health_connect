package dl1;

import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.setup.data.repository.RecordActivityRepositoryImpl", f = "RecordActivityRepositoryImpl.kt", l = {52}, m = "setOnboardingCompleted", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set f60309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f60310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f60311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f60312d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f60311c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f60310b = obj;
        this.f60312d |= Integer.MIN_VALUE;
        int i14 = b.f60300c;
        return this.f60311c.d(0L, this, false);
    }
}
