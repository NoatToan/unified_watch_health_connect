package com.garmin.android.library.mapsdkadapter;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import ie2.t;
import java.util.List;
import p005kotlin.Metadata;
import vn2.t0;

/* JADX INFO: loaded from: classes11.dex */
public interface i {

    public static final class a {
        public static com.garmin.android.library.mapsdkadapter.l a(i iVar, q qVar) {
            qVar.getClass();
            return iVar.h(qVar);
        }

        public static /* synthetic */ void b(i iVar, com.garmin.android.library.mapsdkadapter.f fVar, float f14, int i14) {
            if ((i14 & 2) != 0) {
                f14 = -1.0f;
            }
            iVar.V(fVar, f14, -1);
        }

        public static void c(i iVar) {
            e(iVar, true, true, 28);
        }

        public static /* synthetic */ void e(i iVar, boolean z14, boolean z15, int i14) {
            iVar.d(z14, z15, (i14 & 4) != 0 ? 0.0f : 0.01f);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/library/mapsdkadapter/i$b;", "", "<init>", "(Ljava/lang/String;I)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum b {
        WGS84,
        GCJ02
    }

    public interface c {
        void a(ie2.j jVar);

        View b(ie2.j jVar);
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.library.mapsdkadapter.i$d[], still in use, count: 1, list:
      (r0v1 com.garmin.android.library.mapsdkadapter.i$d[]) from 0x004e: CONSTRUCTOR (r0v1 com.garmin.android.library.mapsdkadapter.i$d[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/library/mapsdkadapter/i$d;", "", "", "mapName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d {
        GOOGLE("GoogleMap"),
        BAIDU("BaiduMap"),
        AMAP("AMap"),
        MAPBOX("MapBox"),
        /* JADX INFO: Fake field, exist only in values array */
        CUSTOM("Custom"),
        NULL("Null");


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ w13.c f50295h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f50296a;

        static {
            f50295h = new w13.c(dVarArr);
        }

        private d(String str) {
            super(str, i);
            this.f50296a = str;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f50294g.clone();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/library/mapsdkadapter/i$e;", "", "<init>", "()V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f50297a = new e();

        private e() {
        }
    }

    public interface f {
        void i(com.garmin.android.library.mapsdkadapter.e eVar);
    }

    public interface g {
        void onCameraIdle();
    }

    public interface h {
        void I1(com.garmin.android.library.mapsdkadapter.f fVar);
    }

    /* JADX INFO: renamed from: com.garmin.android.library.mapsdkadapter.i$i, reason: collision with other inner class name */
    public interface InterfaceC1001i {
        boolean v2(me2.f fVar);
    }

    public interface j {
        void X(com.garmin.android.library.mapsdkadapter.f fVar);
    }

    public interface k {
        void onMapLoaded();
    }

    public interface l {
        void O5(d dVar);

        void h1(i iVar);
    }

    public interface m {
        boolean O2(ie2.j jVar);
    }

    public interface n {
        boolean T0(com.garmin.android.library.mapsdkadapter.l lVar);
    }

    public interface o {
        void onSnapshotReady(Bitmap bitmap);
    }

    void A(k kVar);

    void B(m mVar);

    List<qe2.a> C();

    void D(boolean z14);

    void E(g gVar);

    ie2.s F(t tVar);

    Dialog G(androidx.fragment.app.m mVar);

    void H(t0 t0Var);

    com.garmin.android.library.mapsdkadapter.l I(q qVar);

    void J(int i14, List list);

    void K(n nVar);

    boolean L();

    void M(j40.a aVar);

    void N(o oVar);

    void O(j jVar);

    /* JADX INFO: renamed from: P */
    boolean getF50241b();

    List<ie2.j> Q();

    void R(f fVar);

    void S();

    boolean T();

    float U();

    void V(com.garmin.android.library.mapsdkadapter.f fVar, float f14, int i14);

    void W(j40.c cVar);

    void X(boolean z14);

    void Z(h hVar);

    d a();

    void a0(j40.c cVar);

    void b(boolean z14, Boolean bool);

    void c(com.garmin.android.library.mapsdkadapter.e eVar, int i14);

    void clear();

    void d(boolean z14, boolean z15, float f14);

    void e(Float f14);

    void f(int i14, List list);

    void g();

    ie2.c getCameraState();

    ie2.k getUiSettings();

    com.garmin.android.library.mapsdkadapter.e getVisibleRegion();

    com.garmin.android.library.mapsdkadapter.l h(q qVar);

    void i(InterfaceC1001i interfaceC1001i);

    void j(com.garmin.android.library.mapsdkadapter.e eVar, float f14, int i14, int i15);

    void k(c cVar);

    void l();

    void m(com.garmin.android.library.mapsdkadapter.l lVar);

    void n(ie2.j jVar);

    void o(ie2.c cVar);

    void p(String str, boolean z14);

    void q();

    void r(y40.i iVar);

    List<com.garmin.android.library.mapsdkadapter.l> s();

    void setMapType(int i14);

    void setMyLocationEnabled(boolean z14);

    void setPadding(int i14, int i15, int i16, int i17);

    void t(n23.j jVar);

    com.garmin.android.library.mapsdkadapter.f u();

    void v(com.garmin.android.library.mapsdkadapter.e eVar, int i14);

    void w();

    ie2.j x(p pVar);

    void y(boolean z14);

    void z(boolean z14);
}
