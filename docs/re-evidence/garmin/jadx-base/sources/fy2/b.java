package fy2;

import com.garmin.sync.UploadConfigurationLoader;
import p005kotlin.Metadata;
import v13.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.garmin.sync.UploadConfigurationLoader", f = "UploadConfigurationLoader.kt", l = {181}, m = "getUploadDataTypes")
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UploadConfigurationLoader f73944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f73945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f73946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UploadConfigurationLoader f73947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f73948e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(UploadConfigurationLoader uploadConfigurationLoader, t13.d<? super b> dVar) {
        super(dVar);
        this.f73947d = uploadConfigurationLoader;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f73946c = obj;
        this.f73948e |= Integer.MIN_VALUE;
        return this.f73947d.d(0L, this, false);
    }
}
