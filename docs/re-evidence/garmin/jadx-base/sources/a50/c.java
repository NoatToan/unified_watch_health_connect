package a50;

import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.model.PointOfInterestDTO;
import com.mapbox.maps.interactions.standard.generated.StandardPoi;
import java.util.List;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
public interface c {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"La50/c$a;", "La50/c;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "climb", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<GeoPointDTO> f1251a;

        public a(List<GeoPointDTO> list) {
            this.f1251a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f1251a, ((a) obj).f1251a);
        }

        public final int hashCode() {
            List<GeoPointDTO> list = this.f1251a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return tn.k.h("AddClimbToCourse(climb=", ")", this.f1251a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/c$a0;", "La50/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a0 f1252a = new a0();

        private a0() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a0);
        }

        public final int hashCode() {
            return 862887048;
        }

        public final String toString() {
            return "SaveCourse";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/c$b;", "La50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePoint", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f1253a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public b(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f1253a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f1253a.equals(((b) obj).f1253a);
        }

        public final int hashCode() {
            return this.f1253a.hashCode();
        }

        public final String toString() {
            return n23.j.e("AddCoursePoint(coursePoint=", this.f1253a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/c$b0;", "La50/c;", "", "extraBottomSpace", "<init>", "(I)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1254a;

        public b0(int i14) {
            this.f1254a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b0) && this.f1254a == ((b0) obj).f1254a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f1254a);
        }

        public final String toString() {
            return v.e0.f(this.f1254a, "ShowAddNewPointHint(extraBottomSpace=", ")");
        }
    }

    /* JADX INFO: renamed from: a50.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"La50/c$c;", "La50/c;", "Lcom/garmin/android/library/mapsdkadapter/f;", "point", "", "zoomLevel", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/f;Ljava/lang/Integer;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0014c implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.library.mapsdkadapter.f f1255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f1256b;

        static {
            com.garmin.android.library.mapsdkadapter.f.a aVar = com.garmin.android.library.mapsdkadapter.f.f50281c;
        }

        public C0014c(com.garmin.android.library.mapsdkadapter.f fVar, Integer num) {
            fVar.getClass();
            this.f1255a = fVar;
            this.f1256b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0014c)) {
                return false;
            }
            C0014c c0014c = (C0014c) obj;
            return this.f1255a.equals(c0014c.f1255a) && p005kotlin.jvm.internal.s.g(this.f1256b, c0014c.f1256b);
        }

        public final int hashCode() {
            int iHashCode = this.f1255a.hashCode() * 31;
            Integer num = this.f1256b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "AddLongTapPoint(point=" + this.f1255a + ", zoomLevel=" + this.f1256b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"La50/c$c0;", "La50/c;", "", "Lk30/a;", "primaryClimbs", "Lcom/garmin/android/apps/connectmobile/courses/model/b;", "minDifficulty", "maxDifficulty", "<init>", "(Ljava/util/List;Lcom/garmin/android/apps/connectmobile/courses/model/b;Lcom/garmin/android/apps/connectmobile/courses/model/b;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<k30.a> f1257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.b f1258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.b f1259c;

        public c0(List<k30.a> list, com.garmin.android.apps.connectmobile.courses.model.b bVar, com.garmin.android.apps.connectmobile.courses.model.b bVar2) {
            list.getClass();
            bVar.getClass();
            bVar2.getClass();
            this.f1257a = list;
            this.f1258b = bVar;
            this.f1259c = bVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c0)) {
                return false;
            }
            c0 c0Var = (c0) obj;
            return this.f1257a.equals(c0Var.f1257a) && this.f1258b == c0Var.f1258b && this.f1259c == c0Var.f1259c;
        }

        public final int hashCode() {
            return this.f1259c.hashCode() + ((this.f1258b.hashCode() + (this.f1257a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "ShowClimbSystemDetails(primaryClimbs=" + this.f1257a + ", minDifficulty=" + this.f1258b + ", maxDifficulty=" + this.f1259c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"La50/c$d;", "La50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO;", StandardPoi.FEATURESET_ID, "", "poiName", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO;Ljava/lang/String;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PointOfInterestDTO f1260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f1261b;

        static {
            Parcelable.Creator<PointOfInterestDTO> creator = PointOfInterestDTO.CREATOR;
        }

        public d(PointOfInterestDTO pointOfInterestDTO, String str) {
            pointOfInterestDTO.getClass();
            str.getClass();
            this.f1260a = pointOfInterestDTO;
            this.f1261b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f1260a.equals(dVar.f1260a) && this.f1261b.equals(dVar.f1261b);
        }

        public final int hashCode() {
            return this.f1261b.hashCode() + (this.f1260a.hashCode() * 31);
        }

        public final String toString() {
            return "AddPointOfInterestToCourse(poi=" + this.f1260a + ", poiName=" + this.f1261b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"La50/c$d0;", "La50/c;", "Lcom/garmin/android/library/mapsdkadapter/e;", "bounds", "Lcom/garmin/android/apps/connectmobile/courses/model/c;", "surfaceType", "Lcom/garmin/android/apps/connectmobile/courses/model/b;", "minDifficulty", "maxDifficulty", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/e;Lcom/garmin/android/apps/connectmobile/courses/model/c;Lcom/garmin/android/apps/connectmobile/courses/model/b;Lcom/garmin/android/apps/connectmobile/courses/model/b;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.library.mapsdkadapter.e f1262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.c f1263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.b f1264c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.b f1265d;

        static {
            com.garmin.android.library.mapsdkadapter.e.b bVar = com.garmin.android.library.mapsdkadapter.e.f50271c;
        }

        public d0(com.garmin.android.library.mapsdkadapter.e eVar, com.garmin.android.apps.connectmobile.courses.model.c cVar, com.garmin.android.apps.connectmobile.courses.model.b bVar, com.garmin.android.apps.connectmobile.courses.model.b bVar2) {
            eVar.getClass();
            cVar.getClass();
            bVar.getClass();
            bVar2.getClass();
            this.f1262a = eVar;
            this.f1263b = cVar;
            this.f1264c = bVar;
            this.f1265d = bVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d0)) {
                return false;
            }
            d0 d0Var = (d0) obj;
            return this.f1262a.equals(d0Var.f1262a) && this.f1263b == d0Var.f1263b && this.f1264c == d0Var.f1264c && this.f1265d == d0Var.f1265d;
        }

        public final int hashCode() {
            return this.f1265d.hashCode() + ((this.f1264c.hashCode() + ((this.f1263b.hashCode() + (this.f1262a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "ShowClimbs(bounds=" + this.f1262a + ", surfaceType=" + this.f1263b + ", minDifficulty=" + this.f1264c + ", maxDifficulty=" + this.f1265d + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/c$e;", "La50/c;", "", "coursePointId", "<init>", "(J)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f1266a;

        public e(long j8) {
            this.f1266a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f1266a == ((e) obj).f1266a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f1266a);
        }

        public final String toString() {
            return androidx.room.a0.f(this.f1266a, "DeleteCoursePoint(coursePointId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"La50/c$e0;", "La50/c;", "Lcom/garmin/android/library/mapsdkadapter/e;", "bounds", "", "Lfn0/c;", "hazardTypes", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/e;Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.library.mapsdkadapter.e f1267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<fn0.c> f1268b;

        /* JADX WARN: Multi-variable type inference failed */
        public e0(com.garmin.android.library.mapsdkadapter.e eVar, List<? extends fn0.c> list) {
            eVar.getClass();
            list.getClass();
            this.f1267a = eVar;
            this.f1268b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e0)) {
                return false;
            }
            e0 e0Var = (e0) obj;
            return this.f1267a.equals(e0Var.f1267a) && this.f1268b.equals(e0Var.f1268b);
        }

        public final int hashCode() {
            return this.f1268b.hashCode() + (this.f1267a.hashCode() * 31);
        }

        public final String toString() {
            return "ShowHazards(bounds=" + this.f1267a + ", hazardTypes=" + this.f1268b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"La50/c$f;", "La50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "oldCoursePointDTO", "newCoursePointDTO", "", "addToUndoStack", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;Lcom/garmin/android/apps/connectmobile/courses/model/g;Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f1269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f1270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f1271c;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public f(com.garmin.android.apps.connectmobile.courses.model.g gVar, com.garmin.android.apps.connectmobile.courses.model.g gVar2, boolean z14) {
            gVar.getClass();
            gVar2.getClass();
            this.f1269a = gVar;
            this.f1270b = gVar2;
            this.f1271c = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f1269a.equals(fVar.f1269a) && this.f1270b.equals(fVar.f1270b) && this.f1271c == fVar.f1271c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f1271c) + ((this.f1270b.hashCode() + (this.f1269a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("EditCoursePoint(oldCoursePointDTO=");
            sb3.append(this.f1269a);
            sb3.append(", newCoursePointDTO=");
            sb3.append(this.f1270b);
            sb3.append(", addToUndoStack=");
            return hb.a.k(sb3, this.f1271c, ")");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"La50/c$f0;", "La50/c;", "Lcom/garmin/android/library/mapsdkadapter/e;", "bounds", "", "zoomLevel", "", "Lcom/garmin/android/apps/connectmobile/courses/model/h;", "types", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/e;ILjava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.library.mapsdkadapter.e f1272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f1273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<com.garmin.android.apps.connectmobile.courses.model.h> f1274c;

        /* JADX WARN: Multi-variable type inference failed */
        public f0(com.garmin.android.library.mapsdkadapter.e eVar, int i14, List<? extends com.garmin.android.apps.connectmobile.courses.model.h> list) {
            eVar.getClass();
            list.getClass();
            this.f1272a = eVar;
            this.f1273b = i14;
            this.f1274c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f0)) {
                return false;
            }
            f0 f0Var = (f0) obj;
            return this.f1272a.equals(f0Var.f1272a) && this.f1273b == f0Var.f1273b && this.f1274c.equals(f0Var.f1274c);
        }

        public final int hashCode() {
            return this.f1274c.hashCode() + q2.d(this.f1273b, this.f1272a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ShowPointsOfInterest(bounds=");
            sb3.append(this.f1272a);
            sb3.append(", zoomLevel=");
            sb3.append(this.f1273b);
            sb3.append(", types=");
            return u62.z.c(sb3, this.f1274c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/c$g;", "La50/c;", "Ln50/c;", "action", "<init>", "(Ln50/c;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n50.c f1275a;

        public g(n50.c cVar) {
            cVar.getClass();
            this.f1275a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f1275a.equals(((g) obj).f1275a);
        }

        public final int hashCode() {
            return this.f1275a.hashCode();
        }

        public final String toString() {
            return "ExecuteCreateCourseDetailsAction(action=" + this.f1275a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/c$g0;", "La50/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g0 f1276a = new g0();

        private g0() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g0);
        }

        public final int hashCode() {
            return -97124393;
        }

        public final String toString() {
            return "UndoCourseRouteState";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/c$h;", "La50/c;", "Ln50/f;", "action", "<init>", "(Ln50/f;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n50.f f1277a;

        public h(n50.f fVar) {
            fVar.getClass();
            this.f1277a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f1277a.equals(((h) obj).f1277a);
        }

        public final int hashCode() {
            return this.f1277a.hashCode();
        }

        public final String toString() {
            return "ExecuteCreateCourseOverviewAction(action=" + this.f1277a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/c$h0;", "La50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "courseDetails", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/e;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.e f1278a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.e.Companion companion = com.garmin.android.apps.connectmobile.courses.model.e.INSTANCE;
        }

        public h0(com.garmin.android.apps.connectmobile.courses.model.e eVar) {
            eVar.getClass();
            this.f1278a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h0) && this.f1278a.equals(((h0) obj).f1278a);
        }

        public final int hashCode() {
            return this.f1278a.hashCode();
        }

        public final String toString() {
            return "UpdateCoursePointList(courseDetails=" + this.f1278a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/c$i;", "La50/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f1279a = new i();

        private i() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 2079899014;
        }

        public final String toString() {
            return "HideAddNewPointHint";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"La50/c$i0;", "La50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "newCoordinates", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f1280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GeoPointDTO f1281b;

        static {
            GeoPointDTO.Companion companion = GeoPointDTO.INSTANCE;
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion2 = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public i0(com.garmin.android.apps.connectmobile.courses.model.g gVar, GeoPointDTO geoPointDTO) {
            gVar.getClass();
            geoPointDTO.getClass();
            this.f1280a = gVar;
            this.f1281b = geoPointDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i0)) {
                return false;
            }
            i0 i0Var = (i0) obj;
            return this.f1280a.equals(i0Var.f1280a) && this.f1281b.equals(i0Var.f1281b);
        }

        public final int hashCode() {
            return this.f1281b.hashCode() + (this.f1280a.hashCode() * 31);
        }

        public final String toString() {
            return "UpdateCoursePointLocationOnMap(coursePointDTO=" + this.f1280a + ", newCoordinates=" + this.f1281b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/c$j;", "La50/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f1282a = new j();

        private j() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -348109676;
        }

        public final String toString() {
            return "HideMapSettingsHint";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/c$j0;", "La50/c;", "", "isCoursePublic", "<init>", "(Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f1283a;

        public j0(boolean z14) {
            this.f1283a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j0) && this.f1283a == ((j0) obj).f1283a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f1283a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("UpdateCoursePrivacy(isCoursePublic=", ")", this.f1283a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/c$k;", "La50/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f1284a = new k();

        private k() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 1357905790;
        }

        public final String toString() {
            return "HideMoreOptionsHint";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/c$k0;", "La50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/i;", "courseType", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/i;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.i f1285a;

        public k0(com.garmin.android.apps.connectmobile.courses.model.i iVar) {
            iVar.getClass();
            this.f1285a = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k0) && this.f1285a == ((k0) obj).f1285a;
        }

        public final int hashCode() {
            return this.f1285a.hashCode();
        }

        public final String toString() {
            return "UpdateCourseType(courseType=" + this.f1285a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"La50/c$l;", "La50/c;", "Lcom/garmin/android/library/mapsdkadapter/f;", "point", "", "zoomLevel", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/f;Ljava/lang/Integer;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.library.mapsdkadapter.f f1286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f1287b;

        static {
            com.garmin.android.library.mapsdkadapter.f.a aVar = com.garmin.android.library.mapsdkadapter.f.f50281c;
        }

        public l(com.garmin.android.library.mapsdkadapter.f fVar, Integer num) {
            fVar.getClass();
            this.f1286a = fVar;
            this.f1287b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.f1286a.equals(lVar.f1286a) && p005kotlin.jvm.internal.s.g(this.f1287b, lVar.f1287b);
        }

        public final int hashCode() {
            int iHashCode = this.f1286a.hashCode() * 31;
            Integer num = this.f1287b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "InsertWaypoint(point=" + this.f1286a + ", zoomLevel=" + this.f1287b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"La50/c$l0;", "La50/c;", "Lcom/garmin/android/library/mapsdkadapter/f;", "newPosition", "", "positionOfSelectedPoint", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/f;I)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.library.mapsdkadapter.f f1288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f1289b;

        static {
            com.garmin.android.library.mapsdkadapter.f.a aVar = com.garmin.android.library.mapsdkadapter.f.f50281c;
        }

        public l0(com.garmin.android.library.mapsdkadapter.f fVar, int i14) {
            fVar.getClass();
            this.f1288a = fVar;
            this.f1289b = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l0)) {
                return false;
            }
            l0 l0Var = (l0) obj;
            return this.f1288a.equals(l0Var.f1288a) && this.f1289b == l0Var.f1289b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f1289b) + (this.f1288a.hashCode() * 31);
        }

        public final String toString() {
            return "UpdateCourseWaypointPosition(newPosition=" + this.f1288a + ", positionOfSelectedPoint=" + this.f1289b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/c$m;", "La50/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f1290a = new m();

        private m() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 1851890899;
        }

        public final String toString() {
            return "LoopToStart";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"La50/c$m0;", "La50/c;", "", "Lcom/garmin/android/library/mapsdkadapter/f;", "waypoints", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<com.garmin.android.library.mapsdkadapter.f> f1291a;

        public m0(List<com.garmin.android.library.mapsdkadapter.f> list) {
            list.getClass();
            this.f1291a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m0) && this.f1291a.equals(((m0) obj).f1291a);
        }

        public final int hashCode() {
            return this.f1291a.hashCode();
        }

        public final String toString() {
            return tn.k.h("UpdateCourseWaypoints(waypoints=", ")", this.f1291a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/c$n;", "La50/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class n implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f1292a = new n();

        private n() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return -245114232;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/c$n0;", "La50/c;", "", "name", "<init>", "(Ljava/lang/String;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class n0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1293a;

        public n0(String str) {
            this.f1293a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n0) && p005kotlin.jvm.internal.s.g(this.f1293a, ((n0) obj).f1293a);
        }

        public final int hashCode() {
            String str = this.f1293a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return am.j.m("UpdateDefaultCourseName(name=", this.f1293a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/c$o;", "La50/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class o implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f1294a = new o();

        private o() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 581396809;
        }

        public final String toString() {
            return "OpenCourseOptions";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/c$o0;", "La50/c;", "Lcom/garmin/android/library/mapsdkadapter/i$d;", "mapProvider", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/i$d;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class o0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.library.mapsdkadapter.i.d f1295a;

        public o0(com.garmin.android.library.mapsdkadapter.i.d dVar) {
            dVar.getClass();
            this.f1295a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o0) && this.f1295a == ((o0) obj).f1295a;
        }

        public final int hashCode() {
            return this.f1295a.hashCode();
        }

        public final String toString() {
            return "UpdateMapProvider(mapProvider=" + this.f1295a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/c$p;", "La50/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class p implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f1296a = new p();

        private p() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return 1123296840;
        }

        public final String toString() {
            return "OpenCourseOptionsMenu";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/c$p0;", "La50/c;", "Lk30/k;", "courseRoutingType", "<init>", "(Lk30/k;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class p0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k30.k f1297a;

        public p0(k30.k kVar) {
            kVar.getClass();
            this.f1297a = kVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p0) && this.f1297a == ((p0) obj).f1297a;
        }

        public final int hashCode() {
            return this.f1297a.hashCode();
        }

        public final String toString() {
            return "UpdateRoutingType(courseRoutingType=" + this.f1297a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/c$q;", "La50/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class q implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f1298a = new q();

        private q() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return 1868842222;
        }

        public final String toString() {
            return "OpenEditWaypoints";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/c$q0;", "La50/c;", "", "shouldAvoidClosedRoads", "<init>", "(Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class q0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f1299a;

        public q0(boolean z14) {
            this.f1299a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q0) && this.f1299a == ((q0) obj).f1299a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f1299a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("UpdateShouldAvoidClosedRoads(shouldAvoidClosedRoads=", ")", this.f1299a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/c$r;", "La50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/f;", "coursePoint", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/f;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class r implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.f f1300a;

        public r(com.garmin.android.apps.connectmobile.courses.model.f fVar) {
            fVar.getClass();
            this.f1300a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f1300a == ((r) obj).f1300a;
        }

        public final int hashCode() {
            return this.f1300a.hashCode();
        }

        public final String toString() {
            return "OpenPlaceCoursePoint(coursePoint=" + this.f1300a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/c$r0;", "La50/c;", "", "shouldAvoidHighTraffic", "<init>", "(Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class r0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f1301a;

        public r0(boolean z14) {
            this.f1301a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r0) && this.f1301a == ((r0) obj).f1301a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f1301a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("UpdateShouldAvoidHighTraffic(shouldAvoidHighTraffic=", ")", this.f1301a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/c$s;", "La50/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class s implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f1302a = new s();

        private s() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return -256745661;
        }

        public final String toString() {
            return "OpenPlacePoint";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/c$s0;", "La50/c;", "", "shouldAvoidUnpavedRoads", "<init>", "(Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class s0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f1303a;

        public s0(boolean z14) {
            this.f1303a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s0) && this.f1303a == ((s0) obj).f1303a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f1303a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("UpdateShouldAvoidUnpavedRoads(shouldAvoidUnpavedRoads=", ")", this.f1303a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/c$t;", "La50/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class t implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f1304a = new t();

        private t() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return 2933952;
        }

        public final String toString() {
            return "OutAndBack";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"La50/c$t0;", "La50/c;", "", "speed", "timeInSeconds", "<init>", "(DD)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class t0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f1305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f1306b;

        public t0(double d14, double d15) {
            this.f1305a = d14;
            this.f1306b = d15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t0)) {
                return false;
            }
            t0 t0Var = (t0) obj;
            return Double.compare(this.f1305a, t0Var.f1305a) == 0 && Double.compare(this.f1306b, t0Var.f1306b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f1306b) + (Double.hashCode(this.f1305a) * 31);
        }

        public final String toString() {
            return c22.t.d(this.f1306b, ")", com.airbnb.lottie.parser.moshi.a.a("UpdateSpeedAndTime(speed=", this.f1305a, ", timeInSeconds="));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"La50/c$u;", "La50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "newLocation", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class u implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f1307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GeoPointDTO f1308b;

        static {
            GeoPointDTO.Companion companion = GeoPointDTO.INSTANCE;
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion2 = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public u(com.garmin.android.apps.connectmobile.courses.model.g gVar, GeoPointDTO geoPointDTO) {
            gVar.getClass();
            geoPointDTO.getClass();
            this.f1307a = gVar;
            this.f1308b = geoPointDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return this.f1307a.equals(uVar.f1307a) && this.f1308b.equals(uVar.f1308b);
        }

        public final int hashCode() {
            return this.f1308b.hashCode() + (this.f1307a.hashCode() * 31);
        }

        public final String toString() {
            return "PlaceCoursePointAtLocation(coursePointDTO=" + this.f1307a + ", newLocation=" + this.f1308b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"La50/c$v;", "La50/c;", "Lcom/garmin/android/library/mapsdkadapter/f;", "point", "", "zoomLevel", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/f;Ljava/lang/Integer;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class v implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.library.mapsdkadapter.f f1309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f1310b;

        static {
            com.garmin.android.library.mapsdkadapter.f.a aVar = com.garmin.android.library.mapsdkadapter.f.f50281c;
        }

        public v(com.garmin.android.library.mapsdkadapter.f fVar, Integer num) {
            fVar.getClass();
            this.f1309a = fVar;
            this.f1310b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return this.f1309a.equals(vVar.f1309a) && p005kotlin.jvm.internal.s.g(this.f1310b, vVar.f1310b);
        }

        public final int hashCode() {
            int iHashCode = this.f1309a.hashCode() * 31;
            Integer num = this.f1310b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "PlacePoint(point=" + this.f1309a + ", zoomLevel=" + this.f1310b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"La50/c$w;", "La50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/f;", "coursePoint", "Lcom/garmin/android/library/mapsdkadapter/f;", "point", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/f;Lcom/garmin/android/library/mapsdkadapter/f;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class w implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.f f1311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.library.mapsdkadapter.f f1312b;

        static {
            com.garmin.android.library.mapsdkadapter.f.a aVar = com.garmin.android.library.mapsdkadapter.f.f50281c;
        }

        public w(com.garmin.android.apps.connectmobile.courses.model.f fVar, com.garmin.android.library.mapsdkadapter.f fVar2) {
            fVar.getClass();
            fVar2.getClass();
            this.f1311a = fVar;
            this.f1312b = fVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            return this.f1311a == wVar.f1311a && this.f1312b.equals(wVar.f1312b);
        }

        public final int hashCode() {
            return this.f1312b.hashCode() + (this.f1311a.hashCode() * 31);
        }

        public final String toString() {
            return "PlacePreciseCoursePoint(coursePoint=" + this.f1311a + ", point=" + this.f1312b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"La50/c$x;", "La50/c;", "Lcom/garmin/android/library/mapsdkadapter/f;", "point", "", "zoomLevel", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/f;Ljava/lang/Integer;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class x implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.library.mapsdkadapter.f f1313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f1314b;

        static {
            com.garmin.android.library.mapsdkadapter.f.a aVar = com.garmin.android.library.mapsdkadapter.f.f50281c;
        }

        public x(com.garmin.android.library.mapsdkadapter.f fVar, Integer num) {
            fVar.getClass();
            this.f1313a = fVar;
            this.f1314b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return this.f1313a.equals(xVar.f1313a) && p005kotlin.jvm.internal.s.g(this.f1314b, xVar.f1314b);
        }

        public final int hashCode() {
            int iHashCode = this.f1313a.hashCode() * 31;
            Integer num = this.f1314b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "PlacePrecisePoint(point=" + this.f1313a + ", zoomLevel=" + this.f1314b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/c$y;", "La50/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class y implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final y f1315a = new y();

        private y() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof y);
        }

        public final int hashCode() {
            return 2087331661;
        }

        public final String toString() {
            return "ReverseDirection";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"La50/c$z;", "La50/c;", "Lcom/garmin/android/library/mapsdkadapter/f;", "point", "", "zoomLevel", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/f;Ljava/lang/Integer;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class z implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.library.mapsdkadapter.f f1316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f1317b;

        static {
            com.garmin.android.library.mapsdkadapter.f.a aVar = com.garmin.android.library.mapsdkadapter.f.f50281c;
        }

        public z(com.garmin.android.library.mapsdkadapter.f fVar, Integer num) {
            fVar.getClass();
            this.f1316a = fVar;
            this.f1317b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z)) {
                return false;
            }
            z zVar = (z) obj;
            return this.f1316a.equals(zVar.f1316a) && p005kotlin.jvm.internal.s.g(this.f1317b, zVar.f1317b);
        }

        public final int hashCode() {
            int iHashCode = this.f1316a.hashCode() * 31;
            Integer num = this.f1317b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "RouteHere(point=" + this.f1316a + ", zoomLevel=" + this.f1317b + ")";
        }
    }
}
