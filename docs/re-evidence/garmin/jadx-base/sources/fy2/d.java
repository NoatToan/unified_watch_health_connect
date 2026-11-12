package fy2;

import com.garmin.sync.UploadConfigurationLoader;
import o53.s;
import p005kotlin.Metadata;
import v13.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.garmin.sync.UploadConfigurationLoader", f = "UploadConfigurationLoader.kt", l = {263, 270}, m = "loadUploadConfiguration$util_sync_release")
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UploadConfigurationLoader f73953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f73954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f73955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f73956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UploadConfigurationLoader f73957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f73958f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(UploadConfigurationLoader uploadConfigurationLoader, t13.d<? super d> dVar) {
        super(dVar);
        this.f73957e = uploadConfigurationLoader;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f73956d = obj;
        this.f73958f |= Integer.MIN_VALUE;
        return this.f73957e.f(0L, this, false);
    }
}
