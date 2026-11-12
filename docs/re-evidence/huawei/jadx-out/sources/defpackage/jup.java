package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.trackprocess.model.GpsPoint;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.manager.inteface.IMapDrawingUpdater;
import com.huawei.healthcloud.plugintrack.model.MotionData;
import com.huawei.healthcloud.plugintrack.ui.map.HiMapHolder;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback;
import com.huawei.healthcloud.plugintrack.ui.map.SyncMapCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jup implements IMapDrawingUpdater {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f39073a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f39075c;
    private View d;
    private HiMapHolder e;
    private Context g;
    private final int k;
    private SyncMapCallback n;
    private View o;
    private InterfaceHiMap i = null;
    private int j = 0;
    private MotionData l = null;
    private int h = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f39074b = new ArrayList();
    private boolean f = false;

    public jup(View view, Context context, Context context2, int i, RelativeLayout relativeLayout) {
        this.o = view;
        this.f39073a = context;
        this.g = context2;
        this.k = i;
        this.f39075c = relativeLayout;
    }

    public boolean e() {
        View view = this.o;
        if (view == null) {
            ReleaseLogUtil.e("Track_TrackMainMapViewHolder", "initMapView mRootView is null");
            return true;
        }
        HiMapHolder hiMapHolder = (HiMapHolder) view.findViewById(R.id.sport_track_map_holder);
        this.e = hiMapHolder;
        if (hiMapHolder == null) {
            ReleaseLogUtil.e("Track_TrackMainMapViewHolder", "initMapView mHiMapHolder is null");
            return true;
        }
        int iA = jaa.a(this.f39073a);
        this.j = iA;
        return a(iA);
    }

    public void c(int i) {
        HiMapHolder hiMapHolder = this.e;
        if (hiMapHolder != null) {
            hiMapHolder.setVisibility(i);
        }
    }

    public void b(int i) {
        if (this.j == 1) {
            jxk.e(this.g, this.e, i);
        }
    }

    public void c(Context context) {
        this.g = context;
        d();
    }

    public void d() {
        if (this.i == null) {
            ReleaseLogUtil.e("Track_TrackMainMapViewHolder", "setMapShowType mMapInterface is null");
        } else if (qqs.e(this.g)) {
            this.i.setMapShowType(3);
        } else {
            this.i.setMapShowType(0);
        }
    }

    private boolean a(int i) {
        if (i == 1) {
            return i();
        }
        if (i == 2) {
            j();
            return false;
        }
        if (i == 3) {
            h();
            return false;
        }
        if (i == -1) {
            return g();
        }
        LogUtil.a("Track_TrackMainMapViewHolder", "unexpected map type");
        return false;
    }

    private boolean g() {
        HiMapHolder hiMapHolder = this.e;
        if (hiMapHolder == null) {
            ReleaseLogUtil.e("Track_TrackMainMapViewHolder", "initInvalidMap mapHolder is null");
            return true;
        }
        hiMapHolder.b(null, this.f39073a);
        this.i = this.e.getHiMap();
        k();
        n();
        if (this.i == null) {
            ReleaseLogUtil.e("Track_TrackMainMapViewHolder", "mMapInterface is null");
            return true;
        }
        d();
        this.d = this.o.findViewById(R.id.layout_map_fade_in);
        this.i.onCreate(null, true, true);
        this.i.onMapLoaded();
        c();
        return false;
    }

    private void h() {
        HiMapHolder hiMapHolder = this.e;
        if (hiMapHolder == null) {
            ReleaseLogUtil.e("Track_TrackMainMapViewHolder", "initHmsMap mapHolder is null");
        } else {
            jxk.e(this.g, hiMapHolder, R.color.map_exception_background);
            this.e.e(this.f39073a, new SyncMapCallback() { // from class: jup.1
                @Override // com.huawei.healthcloud.plugintrack.ui.map.SyncMapCallback
                public void onMapReady(InterfaceHiMap interfaceHiMap) {
                    jup.this.o();
                    if (jup.this.n != null) {
                        jup.this.n.onMapReady(interfaceHiMap);
                    }
                    if (jup.this.e == null) {
                        LogUtil.j("Track_TrackMainMapViewHolder", "hms onMapReady: mapHolder is null");
                    } else {
                        jup.this.e.setBackground(null);
                    }
                }
            });
        }
    }

    private void j() {
        HiMapHolder hiMapHolder = this.e;
        if (hiMapHolder == null) {
            ReleaseLogUtil.e("Track_TrackMainMapViewHolder", "initGoogleMap mapHolder is null");
        } else {
            jxk.e(this.g, hiMapHolder, R.color.map_exception_background);
            this.e.c(this.f39073a, null, new SyncMapCallback() { // from class: jup.5
                @Override // com.huawei.healthcloud.plugintrack.ui.map.SyncMapCallback
                public void onMapReady(InterfaceHiMap interfaceHiMap) {
                    jup.this.o();
                    if (jup.this.n != null) {
                        jup.this.n.onMapReady(interfaceHiMap);
                    }
                }
            });
        }
    }

    private boolean i() {
        HiMapHolder hiMapHolder = this.e;
        if (hiMapHolder == null) {
            ReleaseLogUtil.e("Track_TrackMainMapViewHolder", "initGaodeMap mapHolder is null");
            return true;
        }
        hiMapHolder.e((Bundle) null, this.f39073a);
        this.i = this.e.getHiMap();
        k();
        n();
        if (this.i == null) {
            ReleaseLogUtil.e("Track_TrackMainMapViewHolder", "mMapInterface is null");
            return true;
        }
        d();
        this.d = this.o.findViewById(R.id.layout_map_fade_in);
        this.i.onCreate(null, true, true);
        this.i.onMapLoaded();
        c();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        HiMapHolder hiMapHolder = this.e;
        if (hiMapHolder == null) {
            ReleaseLogUtil.e("Track_TrackMainMapViewHolder", "syncMapReload mapHolder is null");
            return;
        }
        InterfaceHiMap hiMap = hiMapHolder.getHiMap();
        this.i = hiMap;
        if (hiMap == null) {
            ReleaseLogUtil.e("Track_TrackMainMapViewHolder", "syncMapReload mMapInterface is null");
            return;
        }
        hiMap.onCreate(null, true, true);
        this.i.setIsStop(false);
        k();
        n();
        d();
        c();
        ReleaseLogUtil.d("Track_TrackMainMapViewHolder", "mIsRecoverGoogleTrack: ", Boolean.valueOf(this.f));
        if (this.f) {
            ArrayList arrayList = new ArrayList(16);
            arrayList.add(this.l);
            this.i.onMapLoaded(arrayList);
            this.f = false;
            this.l = null;
        }
    }

    private void k() {
        if (this.f39075c != null) {
            a(qrs.d(this.f39073a, 16.0f), 0, 0, this.f39075c.getHeight());
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        InterfaceHiMap interfaceHiMap = this.i;
        if (interfaceHiMap != null) {
            interfaceHiMap.setLogoPadding(i, i2, i3, i4);
        }
    }

    public void c() {
        InterfaceHiMap interfaceHiMap = this.i;
        if (interfaceHiMap != null) {
            interfaceHiMap.setMarkerIconPath(f(), b());
        }
    }

    public void e(int i) {
        InterfaceHiMap interfaceHiMap = this.i;
        if (interfaceHiMap != null) {
            interfaceHiMap.setPointToCenter(qrs.i(this.f39073a) / 2, i);
        }
    }

    private void n() {
        if (this.h == -1 || this.i == null) {
            return;
        }
        ReleaseLogUtil.d("Track_TrackMainMapViewHolder", "setLineColor with isCoverExisted");
        this.i.setLineColor(this.h, true);
    }

    private String f() {
        String strE;
        jbq jbqVarD;
        if (this.k != 258 || (jbqVarD = iws.d("SportAdSportingIconOutdoor")) == null || TextUtils.isEmpty(jbqVarD.e())) {
            strE = null;
        } else {
            strE = jbqVarD.e();
            MarketingBiUtils.e(13002, iws.e(13002));
        }
        LogUtil.a("Track_TrackMainMapViewHolder", "getSportAdIconPath() iconPath: ", strE);
        return strE;
    }

    private String b() {
        jbq jbqVarD;
        String strB = (this.k != 258 || (jbqVarD = iws.d("SportAdSportingIconBgOutdoor")) == null || TextUtils.isEmpty(jbqVarD.b())) ? null : jbqVarD.b();
        LogUtil.a("Track_TrackMainMapViewHolder", "getSportAdBgIconPath() bgIconPath: ", strB);
        return strB;
    }

    public InterfaceHiMap a() {
        return this.i;
    }

    public void c(boolean z) {
        InterfaceHiMap interfaceHiMap = this.i;
        if (interfaceHiMap != null) {
            interfaceHiMap.setScreenOnOrForegrand(z);
        }
        View view = this.d;
        if (view == null) {
            LogUtil.e("Track_TrackMainMapViewHolder", "not a map type");
        } else {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.4f, 1.0f);
                objectAnimatorOfFloat.setDuration(500L);
                objectAnimatorOfFloat.start();
                return;
            }
            view.setAlpha(0.4f);
        }
    }

    public void b(MotionData motionData) {
        if (motionData == null) {
            LogUtil.e("Track_TrackMainMapViewHolder", "motionData is null");
            return;
        }
        int iA = jaa.a(this.f39073a);
        LogUtil.a("Track_TrackMainMapViewHolder", "recoverTrack auto map", Integer.valueOf(jaa.a()));
        if (iA == 1) {
            if (this.i != null) {
                ArrayList arrayList = new ArrayList(16);
                arrayList.add(motionData);
                this.i.onMapLoaded(arrayList);
                return;
            }
            return;
        }
        this.f = true;
        this.l = motionData;
    }

    public void a(final gdm gdmVar) {
        if (gdmVar == null) {
            LogUtil.j("Track_TrackMainMapViewHolder", "hotPathDetailInfo is null");
            return;
        }
        if (this.i == null) {
            LogUtil.a("Track_TrackMainMapViewHolder", "mMapInterface is not null, trigger callback");
            this.n = new SyncMapCallback() { // from class: juq
                @Override // com.huawei.healthcloud.plugintrack.ui.map.SyncMapCallback
                public final void onMapReady(InterfaceHiMap interfaceHiMap) {
                    this.e.b(gdmVar, interfaceHiMap);
                }
            };
            return;
        }
        List<GpsPoint> listP = gdmVar.p();
        String strC = gdmVar.c();
        c(listP, strC);
        gcl gclVarA = gdmVar.a();
        if (gclVarA != null) {
            d(gclVarA.c(), strC);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(gdm gdmVar, InterfaceHiMap interfaceHiMap) {
        a(gdmVar);
    }

    private void c(List<GpsPoint> list, String str) {
        jxu.b(list, str, this.i);
    }

    private void d(List<GpsPoint> list, String str) {
        if (njy.e(list) || list.size() == this.f39074b.size()) {
            LogUtil.j("Track_TrackMainMapViewHolder", "cpPoints is empty or repeats draw");
            return;
        }
        this.f39074b.clear();
        Bitmap bitmapA = qqf.a(qre.c(R.drawable.sport_cp_unfinish));
        Iterator<GpsPoint> it = list.iterator();
        while (it.hasNext()) {
            this.f39074b.add(Integer.valueOf(this.i.addMarker(new jrv().b(9).d(d(it.next(), str)).c(bitmapA), null)));
        }
        LogUtil.a("Track_TrackMainMapViewHolder", "mRouteDrawMarkerList size: ", Integer.valueOf(this.f39074b.size()));
    }

    private jpg d(GpsPoint gpsPoint, String str) {
        return izt.a(izt.b(gpsPoint), str, this.j);
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IMapDrawingUpdater
    public void drawFirstLocation(jpg jpgVar) {
        InterfaceHiMap interfaceHiMap = this.i;
        if (interfaceHiMap != null) {
            interfaceHiMap.addEndMarker(jpgVar);
            this.i.animateCamera(jpgVar, 0L, (InterfaceMapCallback) null);
        } else {
            LogUtil.j("Track_TrackMainMapViewHolder", "drawFirstLocation mMapInterface is null");
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IMapDrawingUpdater
    public void drawRecoveryLine(jpg jpgVar, jpg jpgVar2) {
        InterfaceHiMap interfaceHiMap;
        if (jpgVar == null || jpgVar2 == null || (interfaceHiMap = this.i) == null) {
            return;
        }
        interfaceHiMap.drawLine(jpgVar, jpgVar2);
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IMapDrawingUpdater
    public void drawPauseLine(jpg jpgVar, jpg jpgVar2) {
        InterfaceHiMap interfaceHiMap;
        if (jpgVar == null || jpgVar2 == null || (interfaceHiMap = this.i) == null) {
            return;
        }
        interfaceHiMap.drawInterrupt(jpgVar, jpgVar2);
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IMapDrawingUpdater
    public void releaseMap() {
        InterfaceHiMap interfaceHiMap = this.i;
        if (interfaceHiMap != null) {
            interfaceHiMap.onDestroy();
            this.i = null;
        }
        HiMapHolder hiMapHolder = this.e;
        if (hiMapHolder != null) {
            hiMapHolder.e();
            this.e = null;
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IMapDrawingUpdater
    public void addEndMarker(jpg jpgVar) {
        InterfaceHiMap interfaceHiMap = this.i;
        if (interfaceHiMap != null) {
            interfaceHiMap.addEndMarker(jpgVar);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IMapDrawingUpdater
    public void addStartMarker(jpg jpgVar) {
        InterfaceHiMap interfaceHiMap;
        if (jpgVar == null || (interfaceHiMap = this.i) == null) {
            ReleaseLogUtil.e("Track_TrackMainMapViewHolder", "addStartMarker hiHealthLatLng or mMapInterface is null");
        } else {
            interfaceHiMap.addSportStartMarker(jpgVar, this.k);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IMapDrawingUpdater
    public void pauseSportClear() {
        InterfaceHiMap interfaceHiMap = this.i;
        if (interfaceHiMap != null) {
            interfaceHiMap.pauseSportClear();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IMapDrawingUpdater
    public void forceDrawLineToMap() {
        InterfaceHiMap interfaceHiMap = this.i;
        if (interfaceHiMap != null) {
            interfaceHiMap.forceDrawLine();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IMapDrawingUpdater
    public void drawLineToMap(List<jpi> list) {
        InterfaceHiMap interfaceHiMap;
        if (!njy.b(list) || (interfaceHiMap = this.i) == null) {
            return;
        }
        interfaceHiMap.drawLine(list);
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IMapDrawingUpdater
    public void updateCpMarker(int[] iArr) {
        if (iArr == null || this.i == null) {
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] == 1 && njy.c(this.f39074b, i)) {
                this.i.setMarkerIcon(this.f39074b.get(i).intValue(), qqf.a(qre.c(R.drawable.sport_cp_finished)));
            }
        }
    }
}
