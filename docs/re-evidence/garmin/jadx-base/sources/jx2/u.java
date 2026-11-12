package jx2;

import com.garmin.proto.generated.GDIGarminHealth;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.q0;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.samd.manager.SaMDFileTransferManager", f = "SaMDFileTransferManager.kt", l = {342, 346}, m = "performUploadStatusCheck")
public final class u extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f101643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GDIGarminHealth.FileTransferRequest f101644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p0 f101645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q0 f101646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r0 f101647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r0 f101648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ox2.d.a f101649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f101650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f101651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f101652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f101653k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(s sVar, t13.d<? super u> dVar) {
        super(dVar);
        this.f101652j = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f101651i = obj;
        this.f101653k |= Integer.MIN_VALUE;
        return this.f101652j.o(null, null, this);
    }
}
