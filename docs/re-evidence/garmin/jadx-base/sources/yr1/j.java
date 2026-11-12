package yr1;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.sync.GCMSyncInitializer$Companion", f = "GCMSyncInitializer.kt", l = {36}, m = "initSyncDelegates", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f199096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f199097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f199098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m.a f199099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f199100e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m.a aVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f199099d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f199098c = obj;
        this.f199100e |= Integer.MIN_VALUE;
        return this.f199099d.a(null, this);
    }
}
