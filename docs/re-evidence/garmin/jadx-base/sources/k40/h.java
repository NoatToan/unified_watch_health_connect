package k40;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lk40/h;", "", "Lk40/b;", "host", "<init>", "(Lk40/b;)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f102844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f102845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f102846c;

    static {
        new a(null);
    }

    public h(b bVar) {
        bVar.getClass();
        this.f102844a = bVar;
        this.f102845b = new LinkedHashMap();
        this.f102846c = new ArrayList();
    }

    public final Bitmap a(int i14, Context context) {
        Integer numValueOf = Integer.valueOf(i14);
        LinkedHashMap linkedHashMap = this.f102845b;
        Object objB = linkedHashMap.get(numValueOf);
        if (objB == null) {
            Drawable drawableA = j.a.a(context, i14);
            objB = drawableA != null ? d7.b.b(drawableA, 0, 0, 7) : null;
            linkedHashMap.put(numValueOf, objB);
        }
        return (Bitmap) objB;
    }

    public final List<qe2.a> b() {
        ArrayList arrayList;
        List<qe2.a> listC;
        qe2.h map = this.f102844a.getMap();
        if (map == null || (listC = map.f144584a.C()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : listC) {
                Integer f118169b = ((qe2.a) obj).getF118169b();
                if (f118169b != null && f118169b.intValue() == 1) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList == null ? j0.f134944a : arrayList;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lk40/h$a;", "", "<init>", "()V", "", "HAZARDS_MIN_ZOOM_LEVEL_CREATE_COURSE", "I", "", "HAZARDS_Z_INDEX", "F", "HAZARDS_ON_COURSE_Z_INDEX", "HIGHLIGHTED_HAZARD_Z_INDEX", "", "EXTRA_HAZARD_GEOHASH", "Ljava/lang/String;", "EXTRA_HAZARD_ON_COURSE_GEOHASH", "CLUSTER_TYPE_HAZARDS", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
