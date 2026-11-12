package aq1;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupChecksRepositoryImpl", f = "StartupChecksRepositoryImpl.kt", l = {213}, m = "refreshCachedPendingConsents", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f12426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f12429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12430e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(j jVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f12429d = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f12428c = obj;
        this.f12430e |= Integer.MIN_VALUE;
        return this.f12429d.g(this);
    }
}
