package vx2;

import p005kotlin.Metadata;
import t13.d;
import v13.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.garmin.samd.repository.ghs.upload.UploadFitDataKt", f = "UploadFitData.kt", l = {30}, m = "uploadFitData")
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f180668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f180669b;

    public c(d<? super c> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f180668a = obj;
        this.f180669b |= Integer.MIN_VALUE;
        return b.a(null, null, null, null, null, null, this);
    }
}
