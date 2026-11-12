package ht2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.inappupdate.AndroidPersistentDataStore", f = "IPersistentDataStore.android.kt", l = {61}, m = "removeEntry")
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f85634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f85635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f85636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85637d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f85636c = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f85635b = obj;
        this.f85637d |= Integer.MIN_VALUE;
        return this.f85636c.b(null, null, this);
    }
}
