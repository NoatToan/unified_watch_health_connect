package zj2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "com.garmin.device.datatransfer.DataUploadTask", f = "DataUploadTask.kt", l = {118}, m = "handle")
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f205014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f205015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f205016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f205017d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f205016c = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205015b = obj;
        this.f205017d |= Integer.MIN_VALUE;
        return this.f205016c.a(null, null, this);
    }
}
