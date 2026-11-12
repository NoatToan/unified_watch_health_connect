package jy2;

import o53.s;
import okhttp3.RequestBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.sync.omt.OmtFirmwareChecker", f = "OmtFirmwareChecker.kt", l = {177, 217}, m = "fetchUpdatesListFromServer")
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f101882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f101883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RequestBody f101884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s f101885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f101886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f101887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f101888g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, t13.d<? super f> dVar2) {
        super(dVar2);
        this.f101887f = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f101886e = obj;
        this.f101888g |= Integer.MIN_VALUE;
        return this.f101887f.b(null, this);
    }
}
