package ss;

import com.garmin.android.apps.connectmobile.activities.newmodel.y;
import d53.u;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lss/a;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f160593a = 0;

    static {
        new a();
    }

    private a() {
    }

    public static final int a(String str, List list) {
        if (list == null || list.isEmpty()) {
            return -1;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            if (yVar != null && u.q(yVar.F(), str, true)) {
                return yVar.G();
            }
        }
        return -1;
    }
}
