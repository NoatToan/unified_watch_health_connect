package gl2;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.gc.upload.ConnectUploadAgent", f = "ConnectUploadAgent.kt", l = {424, 430, 445}, m = "load$suspendImpl")
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f77913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rs2.c f77914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f77915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f77916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f77917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f77918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f77919g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f77918f = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f77917e = obj;
        this.f77919g |= Integer.MIN_VALUE;
        return a.u(this.f77918f, null, this);
    }
}
