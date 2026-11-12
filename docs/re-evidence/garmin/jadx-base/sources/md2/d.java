package md2;

import org.slf4j.Logger;
import p005kotlin.Metadata;
import v13.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "com.garmin.android.lib.networking.retrofit.repo.BaseRepository$DefaultImpls", f = "BaseRepository.kt", l = {174}, m = "tryCatchNetworkCall")
public final class d<T> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f117945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Logger f117946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f117947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f117948d;

    public d(t13.d<? super d> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f117947c = obj;
        this.f117948d |= Integer.MIN_VALUE;
        return a.C2243a.b(null, null, null, this);
    }
}
