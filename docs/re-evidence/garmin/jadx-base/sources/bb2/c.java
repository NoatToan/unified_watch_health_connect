package bb2;

import androidx.room.b0;
import com.google.gson.GsonBuilder;
import p005kotlin.Metadata;
import ps.u1;
import ps.v1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lbb2/c;", "Lbb2/a;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "c", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements bb2.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0243c f17328d = new C0243c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f17329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f17330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u1 f17331c;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"bb2/c$a", "Landroidx/room/g;", "Lps/m;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends androidx.room.g<ps.m> {
        public a() {
        }

        @Override // androidx.room.g
        public final void a(ud.c cVar, ps.m mVar) {
            ps.m mVar2 = mVar;
            cVar.getClass();
            mVar2.getClass();
            Long activityId = mVar2.getActivityId();
            if (activityId == null) {
                cVar.u(1);
            } else {
                cVar.h(1, activityId.longValue());
            }
            Integer numberOfPoints = mVar2.getNumberOfPoints();
            if (numberOfPoints == null) {
                cVar.u(2);
            } else {
                cVar.h(2, numberOfPoints.intValue());
            }
            String encodedSamples = mVar2.getEncodedSamples();
            if (encodedSamples == null) {
                cVar.u(3);
            } else {
                cVar.q3(3, encodedSamples);
            }
            String encodedLevels = mVar2.getEncodedLevels();
            if (encodedLevels == null) {
                cVar.u(4);
            } else {
                cVar.q3(4, encodedLevels);
            }
            Double maxLat = mVar2.getMaxLat();
            if (maxLat == null) {
                cVar.u(5);
            } else {
                cVar.m(maxLat.doubleValue(), 5);
            }
            Double maxLon = mVar2.getMaxLon();
            if (maxLon == null) {
                cVar.u(6);
            } else {
                cVar.m(maxLon.doubleValue(), 6);
            }
            Double minLat = mVar2.getMinLat();
            if (minLat == null) {
                cVar.u(7);
            } else {
                cVar.m(minLat.doubleValue(), 7);
            }
            Double minLon = mVar2.getMinLon();
            if (minLon == null) {
                cVar.u(8);
            } else {
                cVar.m(minLon.doubleValue(), 8);
            }
            Double startLat = mVar2.getStartLat();
            if (startLat == null) {
                cVar.u(9);
            } else {
                cVar.m(startLat.doubleValue(), 9);
            }
            Double startLon = mVar2.getStartLon();
            if (startLon == null) {
                cVar.u(10);
            } else {
                cVar.m(startLon.doubleValue(), 10);
            }
            Double endLat = mVar2.getEndLat();
            if (endLat == null) {
                cVar.u(11);
            } else {
                cVar.m(endLat.doubleValue(), 11);
            }
            Double endLon = mVar2.getEndLon();
            if (endLon == null) {
                cVar.u(12);
            } else {
                cVar.m(endLon.doubleValue(), 12);
            }
            v1 trackLog = mVar2.getTrackLog();
            c.this.f17331c.getClass();
            String json = new GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(trackLog);
            if (json == null) {
                cVar.u(13);
            } else {
                cVar.q3(13, json);
            }
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR REPLACE INTO `activity_polyline` (`activityId`,`numberOfPoints`,`encodedSamples`,`encodedLevels`,`maxLat`,`maxLon`,`minLat`,`minLon`,`startLat`,`startLon`,`endLat`,`endLon`,`trackLog`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"bb2/c$b", "Landroidx/room/e;", "Lps/m;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends androidx.room.e<ps.m> {
        @Override // androidx.room.e
        public final void a(ud.c cVar, ps.m mVar) {
            ps.m mVar2 = mVar;
            cVar.getClass();
            mVar2.getClass();
            Long activityId = mVar2.getActivityId();
            if (activityId == null) {
                cVar.u(1);
            } else {
                cVar.h(1, activityId.longValue());
            }
        }

        @Override // androidx.room.e
        public final String b() {
            return "DELETE FROM `activity_polyline` WHERE `activityId` = ?";
        }
    }

    public c(b0 b0Var) {
        b0Var.getClass();
        this.f17331c = new u1();
        this.f17329a = b0Var;
        this.f17330b = new a();
        new b();
    }

    @Override // bb2.a
    public final void a(long j8) {
        gl1.d.O(this.f17329a, false, true, new a02.a(j8, 1));
    }

    @Override // bb2.a
    public final void deleteAll() {
        gl1.d.O(this.f17329a, false, true, new b71.o(8));
    }

    @Override // bb2.a
    public final ps.m e(long j8) {
        return (ps.m) gl1.d.O(this.f17329a, true, false, new bb2.b(j8, this, 0));
    }

    @Override // bb2.a
    public final void f(ps.m mVar) {
        gl1.d.O(this.f17329a, false, true, new a42.i(24, this, mVar));
    }

    /* JADX INFO: renamed from: bb2.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbb2/c$c;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0243c {
        public /* synthetic */ C0243c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0243c() {
        }
    }
}
