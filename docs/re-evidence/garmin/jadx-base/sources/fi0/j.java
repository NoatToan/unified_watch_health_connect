package fi0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.data.MySuggestedPagingSource", f = "MySuggestedPagingSource.kt", l = {33, 41}, m = "load", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f71689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hi0.h f71690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f71691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f71692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f71693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f71694f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f71693e = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71692d = obj;
        this.f71694f |= Integer.MIN_VALUE;
        return this.f71693e.e(null, this);
    }
}
