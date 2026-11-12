package bl2;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.tasks.ReadActiveTransfer", f = "ReadActiveTransfer.kt", l = {277}, m = "processBluetoothTransferError")
public final class x extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f18739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public pk2.x f18740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f18741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f18742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18743e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(r rVar, t13.d<? super x> dVar) {
        super(dVar);
        this.f18742d = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f18741c = obj;
        this.f18743e |= Integer.MIN_VALUE;
        r.a aVar = r.f18709p;
        return this.f18742d.t(null, this);
    }
}
