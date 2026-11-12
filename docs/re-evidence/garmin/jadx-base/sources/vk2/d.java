package vk2;

import com.garmin.device.filetransfer.core.background.BackgroundTransferWorker;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.background.BackgroundTransferWorker", f = "BackgroundTransferWorker.kt", l = {254, 270, 274}, m = "awaitSyncComplete")
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BackgroundTransferWorker f178653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f178654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f178655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BackgroundTransferWorker f178656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f178657e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BackgroundTransferWorker backgroundTransferWorker, t13.d<? super d> dVar) {
        super(dVar);
        this.f178656d = backgroundTransferWorker;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f178655c = obj;
        this.f178657e |= Integer.MIN_VALUE;
        BackgroundTransferWorker.a aVar = BackgroundTransferWorker.f50764q;
        return this.f178656d.d(null, this);
    }
}
