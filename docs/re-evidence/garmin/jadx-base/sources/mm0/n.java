package mm0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.GroupDetailViewModel", f = "GroupDetailViewModel.kt", l = {86, 87}, m = "preprocessGroupDetailsDTO", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f119558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f119559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f119560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f119561d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(e eVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f119560c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f119559b = obj;
        this.f119561d |= Integer.MIN_VALUE;
        return e.y4(this.f119560c, null, this);
    }
}
