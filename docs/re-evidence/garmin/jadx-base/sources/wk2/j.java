package wk2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.data.TransferItemKt", f = "TransferItem.kt", l = {199}, m = "checksum")
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f185857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f185858b;

    public j(t13.d<? super j> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f185857a = obj;
        this.f185858b |= Integer.MIN_VALUE;
        return l.a(null, this);
    }
}
