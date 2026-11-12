package jl0;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.library.mapsdkadapter.i;
import com.garmin.android.library.mapsdkadapter.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import qe2.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljl0/d;", "Lqw0/a;", "<init>", "()V", "a", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends qw0.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f99460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f99461i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f99462j;

    static {
        new a(null);
    }

    @Override // qw0.a, com.garmin.android.library.mapsdkadapter.i.l
    public final void h1(i iVar) {
        w6();
        this.f148290a = 20;
        com.garmin.android.library.mapsdkadapter.f fVar = new com.garmin.android.library.mapsdkadapter.f(lb2.b.b(this.f99461i), lb2.b.b(this.f99462j), i.b.WGS84);
        p pVar = new p();
        pVar.f50327a.f50312d = this.f99460h;
        pVar.d(fVar);
        h hVar = this.f148294e;
        if (hVar != null) {
            hVar.x(pVar);
        } else {
            a2 a2Var = a2.GOLF;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "GolfCourseFullScreenMapFragment", "Null Google Map object");
        }
        iVar.setMapType(4);
        iVar.d(true, true, 1.0f);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.containsKey("GOLF_COURSE_NAME")) {
                this.f99460h = arguments.getString("GOLF_COURSE_NAME");
            }
            if (arguments.containsKey("GOLF_COURSE_LATITUDE")) {
                this.f99461i = arguments.getInt("GOLF_COURSE_LATITUDE");
            }
            if (arguments.containsKey("GOLF_COURSE_LONGITUDE")) {
                this.f99462j = arguments.getInt("GOLF_COURSE_LONGITUDE");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljl0/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
