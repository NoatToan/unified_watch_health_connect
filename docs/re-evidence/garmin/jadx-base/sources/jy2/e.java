package jy2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.sync.omt.OmtFirmwareChecker", f = "OmtFirmwareChecker.kt", l = {238}, m = "createService")
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f101876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f101877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r0 f101878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f101879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f101880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f101881f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, t13.d<? super e> dVar2) {
        super(dVar2);
        this.f101880e = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f101879d = obj;
        this.f101881f |= Integer.MIN_VALUE;
        d.a aVar = d.f101869e;
        return this.f101880e.a(null, this);
    }
}
