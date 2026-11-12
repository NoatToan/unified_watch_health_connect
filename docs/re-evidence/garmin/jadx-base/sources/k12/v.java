package k12;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.data.repo.UsersRepo", f = "UsersRepo.kt", l = {68}, m = "getUserProfileBase", v = 2)
public final class v extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f102384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f102385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f102386c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(d dVar, t13.d<? super v> dVar2) {
        super(dVar2);
        this.f102385b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f102384a = obj;
        this.f102386c |= Integer.MIN_VALUE;
        return this.f102385b.i(this);
    }
}
