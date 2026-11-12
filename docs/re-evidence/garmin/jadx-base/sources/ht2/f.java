package ht2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.inappupdate.AndroidPersistentDataStore", f = "IPersistentDataStore.android.kt", l = {52}, m = "saveStringEntry")
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zy2.j f85638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f85639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f85640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85641d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f85640c = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f85639b = obj;
        this.f85641d |= Integer.MIN_VALUE;
        return this.f85640c.c(null, null, this);
    }
}
