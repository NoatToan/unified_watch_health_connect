package qd0;

import p005kotlin.Metadata;
import t13.d;
import v13.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@e(c = "com.garmin.android.apps.connectmobile.di.device.setup.profile.ProfileImageUseCaseImpl", f = "ProfileImageUseCaseImpl.kt", l = {40}, m = "uploadProfilePicture", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f144471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f144472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f144473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f144474d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, d<? super c> dVar) {
        super(dVar);
        this.f144473c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144472b = obj;
        this.f144474d |= Integer.MIN_VALUE;
        String[] strArr = b.f144464e;
        return this.f144473c.d(null, null, this);
    }
}
