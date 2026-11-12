package ys2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.file.write.SendFileToDeviceTask", f = "SendFileToDeviceTask.kt", l = {210}, m = "sendData")
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f199230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f199231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f199232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f199233d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f199232c = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f199231b = obj;
        this.f199233d |= Integer.MIN_VALUE;
        return this.f199232c.b(0, 0, false, null, this);
    }
}
