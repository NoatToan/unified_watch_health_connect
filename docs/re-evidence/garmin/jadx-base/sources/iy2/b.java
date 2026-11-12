package iy2;

import android.content.Context;
import java.io.File;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.sync.gc.strategy.FitDownloadStrategy", f = "FitDownloadStrategy.kt", l = {66, 75}, m = "downloadDeviceMessage")
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f95841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gy2.c f95842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File f95843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f95844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r0 f95845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f95846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f95847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f95848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f95849i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f95850j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f95851k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, t13.d<? super b> dVar2) {
        super(dVar2);
        this.f95850j = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f95849i = obj;
        this.f95851k |= Integer.MIN_VALUE;
        return this.f95850j.a(null, null, null, null, this);
    }
}
