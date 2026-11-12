package lk2;

import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.FileTransferProtoRequests", f = "FileTransferProtoRequests.kt", l = {72}, m = "sendListFiles")
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.device.filetransfer.b f113272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f113273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f113274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f113275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f113276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.garmin.device.filetransfer.b f113277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f113278g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.garmin.device.filetransfer.b bVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f113277f = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f113276e = obj;
        this.f113278g |= Integer.MIN_VALUE;
        return this.f113277f.e(null, this);
    }
}
