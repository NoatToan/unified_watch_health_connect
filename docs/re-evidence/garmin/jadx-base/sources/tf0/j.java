package tf0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.epoch.component.EpochReloadStateHandler", f = "EpochReloadStateHandler.kt", l = {77}, m = "postEpochRequest", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f164447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f164448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f164449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f164450d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f164449c = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164448b = obj;
        this.f164450d |= Integer.MIN_VALUE;
        return i.a(this.f164449c, null, null, this);
    }
}
