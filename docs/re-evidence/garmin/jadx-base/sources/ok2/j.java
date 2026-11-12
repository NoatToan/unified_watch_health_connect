package ok2;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.CoreTransferManager", f = "CoreTransferManager.kt", l = {898}, m = "finishAgents")
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f132741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wk2.h[] f132742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wk2.h f132743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f132744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f132745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f132746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f132747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g f132748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f132749i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f132748h = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f132747g = obj;
        this.f132749i |= Integer.MIN_VALUE;
        return g.u(this.f132748h, this);
    }
}
