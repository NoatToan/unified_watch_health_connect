package ok2;

import java.util.UUID;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.TransferManager", f = "TransferManager.kt", l = {379, 392, 400, 422}, m = "doRequestDeviceXml")
public final class c0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f0 f132608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f132609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f132610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f132611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public UUID f132612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public lk2.b f132613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f132614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f132615h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f0 f132616i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f132617j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(f0 f0Var, t13.d<? super c0> dVar) {
        super(dVar);
        this.f132616i = f0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f132615h = obj;
        this.f132617j |= Integer.MIN_VALUE;
        return f0.e(this.f132616i, false, null, this);
    }
}
