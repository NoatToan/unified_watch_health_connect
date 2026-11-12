package ne0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.GetActivityDetailsDogsUseCase", f = "GetActivityDetailsDogsUseCase.kt", l = {73}, m = "fetchNonOwnerDogs", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f125446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f125447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f125448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f125449d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f125448c = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f125447b = obj;
        this.f125449d |= Integer.MIN_VALUE;
        return j.a(this.f125448c, null, this);
    }
}
