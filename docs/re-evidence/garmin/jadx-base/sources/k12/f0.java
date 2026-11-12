package k12;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.data.repo.UsersRepo", f = "UsersRepo.kt", l = {85}, m = "userUploadProfilePicture", v = 2)
public final class f0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f102335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f102336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f102337c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(d dVar, t13.d<? super f0> dVar2) {
        super(dVar2);
        this.f102336b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f102335a = obj;
        this.f102337c |= Integer.MIN_VALUE;
        return this.f102336b.j(null, null, this);
    }
}
