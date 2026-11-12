package e32;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.Map;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.k0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Le32/k;", "", "", "Le32/o;", "Lorg/joda/time/DateTime;", "timeIntervalEndDate", "<init>", "(Ljava/util/Map;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<o, DateTime> f62801a;

    /* JADX WARN: Illegal instructions before constructor call */
    public k(Map map, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            map = k0.f134949a;
            map.getClass();
        }
        this(map);
    }

    public final Fragment a(o oVar, DateTime dateTime) {
        oVar.getClass();
        Integer num = oVar.f62822d;
        if (num == null) {
            return c(dateTime);
        }
        o.a aVar = o.f62804g;
        int iIntValue = num.intValue();
        aVar.getClass();
        return b(num.intValue(), dateTime, this.f62801a.get(o.a.a(iIntValue)));
    }

    public Fragment b(int i14, DateTime dateTime, DateTime dateTime2) {
        h.a aVar = h.f62784h;
        aVar.getClass();
        h hVar = new h();
        Bundle bundle = new Bundle();
        aVar.getClass();
        bundle.putInt("ARG_INTERVAL_TYPE", i14);
        bundle.putSerializable("ARG_INITIAL_DATE", dateTime);
        bundle.putSerializable("ARG_END_DATE", dateTime2);
        hVar.setArguments(bundle);
        return hVar;
    }

    public Fragment c(DateTime dateTime) {
        h.a aVar = h.f62784h;
        aVar.getClass();
        h hVar = new h();
        Bundle bundle = new Bundle();
        aVar.getClass();
        bundle.putInt("ARG_INTERVAL_TYPE", 1);
        bundle.putSerializable("ARG_INITIAL_DATE", dateTime);
        bundle.putSerializable("ARG_END_DATE", null);
        hVar.setArguments(bundle);
        return hVar;
    }

    public k(Map<o, DateTime> map) {
        map.getClass();
        this.f62801a = map;
    }

    public k() {
        this(null, 1, null);
    }
}
