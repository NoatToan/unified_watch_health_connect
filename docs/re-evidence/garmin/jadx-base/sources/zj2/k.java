package zj2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "com.garmin.device.datatransfer.DataUploadTask", f = "DataUploadTask.kt", l = {49, 66}, m = "run")
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f205018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f205019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f205020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f205021d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f205020c = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205019b = obj;
        this.f205021d |= Integer.MIN_VALUE;
        return this.f205020c.b(this);
    }
}
