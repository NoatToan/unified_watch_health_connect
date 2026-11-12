package ht2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.inappupdate.AndroidPersistentDataStore$Companion", f = "IPersistentDataStore.android.kt", l = {75}, m = "getPrefs")
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f85621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r0 f85622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z53.b f85623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f85624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c.a f85625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f85626f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c.a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f85625e = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f85624d = obj;
        this.f85626f |= Integer.MIN_VALUE;
        return c.a.a(this.f85625e, null, this);
    }
}
