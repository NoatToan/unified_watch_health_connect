package t20;

import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.f0;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.y;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lt20/b;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lcom/garmin/android/library/mapsdkadapter/i$b;", "courseCoordinateSystem", "Ls20/a;", "api", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/i$b;Ls20/a;)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f161764c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.i.b f161765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s20.a f161766b;

    public b(com.garmin.android.library.mapsdkadapter.i.b bVar, s20.a aVar) {
        bVar.getClass();
        aVar.getClass();
        this.f161765a = bVar;
        this.f161766b = aVar;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt20/b$a;", "", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final String a(a aVar, List list) {
            aVar.getClass();
            StringBuilder sb3 = new StringBuilder();
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LatLng latLng = (LatLng) it.next();
                sb3.setLength(0);
                sb3.append("[");
                sb3.append(String.valueOf(latLng.latitude));
                sb3.append(",");
                sb3.append(String.valueOf(latLng.longitude));
                sb3.append(",null]");
                arrayList.add(sb3.toString());
            }
            String strJoin = TextUtils.join(",", arrayList);
            return e0.h(new StringBuilder(strJoin.length()), "[", strJoin, "]");
        }

        public static b b(a aVar, com.garmin.android.library.mapsdkadapter.i.b bVar) {
            ez0.b bVar2 = ez0.b.f67468a;
            ez0.c cVar = ez0.c.GC;
            aVar.getClass();
            s20.a aVar2 = (s20.a) ez0.b.a(bVar2, cVar, s20.a.class, new c83.h.a[]{new t20.a(bVar)}, null, null, null, 120);
            aVar.getClass();
            bVar.getClass();
            aVar2.getClass();
            return new b(bVar, aVar2);
        }

        private a() {
        }
    }
}
