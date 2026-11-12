package bl2;

import com.garmin.device.filetransfer.FileTransferException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.tasks.AbstractActiveTransfer", f = "AbstractActiveTransfer.kt", l = {457, 462, 470, 475}, m = "readWithRetry")
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f18647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public lk2.b f18648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wk2.i f18649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e23.p f18650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FileTransferException f18651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n.a f18652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f18655i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f18656j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18657k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f18656j = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f18655i = obj;
        this.f18657k |= Integer.MIN_VALUE;
        b.a aVar = b.f18599l;
        return this.f18656j.j(null, null, null, false, this);
    }
}
