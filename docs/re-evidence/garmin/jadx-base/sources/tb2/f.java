package tb2;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import p005kotlin.Metadata;
import p13.x;
import ub2.f0;
import vh.o;
import vh.q;
import vh.w;
import vh.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltb2/f;", "", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f163792a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<w> f163793b;

    static {
        f0.f169829a.getClass();
        q.a aVar = new q.a("myDayCardEventsScalar", f0.f169830b);
        List<o> listK = x.k(new o.a("date", new y("date")).a(), new o.a(RemoteConfigConstants.RequestFieldKey.TIME_ZONE, new y("timezone")).a());
        listK.getClass();
        aVar.f178380e = listK;
        f163793b = p13.w.c(aVar.c());
    }

    private f() {
    }
}
