package fy2;

import com.garmin.sync.UploadConfigurationLoader;
import p005kotlin.Metadata;
import v13.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.garmin.sync.UploadConfigurationLoader", f = "UploadConfigurationLoader.kt", l = {286}, m = "fetchAndProcessServerResponse")
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UploadConfigurationLoader f73939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f73940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f73941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UploadConfigurationLoader f73942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f73943e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(UploadConfigurationLoader uploadConfigurationLoader, t13.d<? super a> dVar) {
        super(dVar);
        this.f73942d = uploadConfigurationLoader;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f73941c = obj;
        this.f73943e |= Integer.MIN_VALUE;
        UploadConfigurationLoader.b bVar = UploadConfigurationLoader.f52783g;
        return this.f73942d.b(0L, this);
    }
}
