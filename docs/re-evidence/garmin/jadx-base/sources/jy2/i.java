package jy2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.sync.omt.OmtFirmwareChecker", f = "OmtFirmwareChecker.kt", l = {101}, m = "getUpdatesJson")
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f101892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f101893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f101894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f101895d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d dVar, t13.d<? super i> dVar2) {
        super(dVar2);
        this.f101894c = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f101893b = obj;
        this.f101895d |= Integer.MIN_VALUE;
        return this.f101894c.d(null, this);
    }
}
