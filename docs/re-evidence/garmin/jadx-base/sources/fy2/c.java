package fy2;

import com.garmin.sync.UploadConfigurationLoader;
import p005kotlin.Metadata;
import v13.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.garmin.sync.UploadConfigurationLoader", f = "UploadConfigurationLoader.kt", l = {199}, m = "getUploadEndpoint")
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f73949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f73950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UploadConfigurationLoader f73951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f73952d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(UploadConfigurationLoader uploadConfigurationLoader, t13.d<? super c> dVar) {
        super(dVar);
        this.f73951c = uploadConfigurationLoader;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f73950b = obj;
        this.f73952d |= Integer.MIN_VALUE;
        return this.f73951c.e(0L, null, this);
    }
}
