package zk2;

import e23.l;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.queue.AdHocQueue", f = "AdHocQueue.kt", l = {145}, m = "runTransfer")
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f205120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wk2.i f205121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f205122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f205123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f205124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f205125f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f205124e = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205123d = obj;
        this.f205125f |= Integer.MIN_VALUE;
        return a.d(this.f205124e, null, null, this);
    }
}
