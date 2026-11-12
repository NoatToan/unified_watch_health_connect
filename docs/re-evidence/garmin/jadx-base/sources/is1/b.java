package is1;

import com.garmin.android.apps.connectmobile.v2;
import gs1.t;
import java.util.ArrayList;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.timeline.repository.TimelineRepository", f = "TimelineRepository.kt", l = {26, 31, 52}, m = "getSnapshotTimeline", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DateTime f94945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2 f94946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v2.b f94947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f94948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f94949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f94950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f94951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f94952h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f94951g = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f94950f = obj;
        this.f94952h |= Integer.MIN_VALUE;
        return this.f94951g.a(null, this);
    }
}
