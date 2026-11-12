package ts2;

import com.garmin.proto.generated.GDIConnectedDevicesReporting;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.connecteddevices.ConnectedDevicesHandler", f = "ConnectedDevicesHandler.kt", l = {TsExtractor.TS_STREAM_TYPE_AIT}, m = "notifyDevicesTrackingThisDevice")
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f166218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f166219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f166220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f166221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f166222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f166223f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f166222e = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f166221d = obj;
        this.f166223f |= Integer.MIN_VALUE;
        az2.a<Long, Set<GDIConnectedDevicesReporting.ConnectedDevice>> aVar = b.f166194i;
        return this.f166222e.p(null, this);
    }
}
