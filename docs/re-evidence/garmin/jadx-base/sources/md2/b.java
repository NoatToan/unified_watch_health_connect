package md2;

import p005kotlin.Metadata;
import v13.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "com.garmin.android.lib.networking.retrofit.repo.BaseRepository$DefaultImpls", f = "BaseRepository.kt", l = {70}, m = "safeApiResult")
public final class b<T> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f117939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f117940b;

    public b(t13.d<? super b> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f117939a = obj;
        this.f117940b |= Integer.MIN_VALUE;
        return a.C2243a.a(null, null, this);
    }
}
