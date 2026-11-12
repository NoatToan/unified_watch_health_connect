package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.trackprocess.model.GpsPoint;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap;
import com.huawei.healthcloud.plugintrack.util.HotTrackDrawCustomTarget;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.bubblelayout.HealthBubbleLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.HiCommonUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jtn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f39025a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f39027c;
    private HealthTextView d;
    private HealthTextView e;
    private String k;
    private InterfaceHiMap l;
    private View.OnClickListener m;
    private ConstraintLayout n;
    private gco o;
    private View p;
    private SharedPreferences r;
    private HealthBubbleLayout t;
    private List<String> q = null;
    private List<Integer> s = null;
    private boolean j = false;
    private boolean h = true;
    private gcl f = null;
    private String g = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f39026b = null;
    private boolean i = false;

    public jtn(Context context, View view, View.OnClickListener onClickListener) {
        this.f39025a = context;
        this.p = view;
        this.m = onClickListener;
        b();
    }

    private void b() {
        this.n = (ConstraintLayout) this.p.findViewById(R.id.route_draw_layout_tab);
        HealthTextView healthTextView = (HealthTextView) this.p.findViewById(R.id.route_draw_btn_track);
        this.d = healthTextView;
        healthTextView.setOnClickListener(this.m);
        HealthTextView healthTextView2 = (HealthTextView) this.p.findViewById(R.id.route_draw_btn_shape);
        this.e = healthTextView2;
        healthTextView2.setOnClickListener(this.m);
        HealthBubbleLayout healthBubbleLayout = (HealthBubbleLayout) this.p.findViewById(R.id.route_draw_switch_bubble);
        this.t = healthBubbleLayout;
        healthBubbleLayout.setOnClickListener(new View.OnClickListener() { // from class: jtm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.a(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        e();
    }

    public void a(boolean z) {
        if (this.l == null || this.j == z) {
            return;
        }
        this.j = z;
        if (this.h) {
            d();
            e();
            this.h = false;
        }
        e(this.d, !z);
        e(this.e, z);
        this.l.setOverlayVisible(this.k, z);
        List<String> list = this.q;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.l.setLineVisible(it.next(), z);
                LogUtil.d("Track_RouteDrawViewHolder", "setLineVisible");
            }
        }
        List<Integer> list2 = this.s;
        if (list2 != null) {
            for (Integer num : list2) {
                if (z) {
                    this.l.showMarker(num.intValue(), null);
                } else {
                    this.l.hideMarker(num.intValue(), null);
                }
            }
        }
        if (z) {
            this.l.changeTrackColor(this.f39025a.getResources().getColor(R.color.secondary_bar_color));
        } else {
            this.l.resetTrackColor();
        }
    }

    public void c(Map<String, String> map, final c cVar, final a aVar) {
        String str = map.get("hotPathId");
        this.g = map.get("cpPunchState");
        jqj.e(str, new HotTrackDrawCustomTarget<Bitmap>() { // from class: jtn.4
            @Override // com.huawei.healthcloud.plugintrack.util.HotTrackDrawCustomTarget
            public void onGetHotTrackDetailInfo(gdm gdmVar) {
                if (gdmVar == null) {
                    LogUtil.e("Track_RouteDrawViewHolder", "hotPathDetailInfo is null in onGetHotTrackDetailInfo");
                    return;
                }
                jtn.this.i = true;
                jtn.this.f39027c = gdmVar.c();
                jtn.this.f = gdmVar.a();
                if (jtn.this.f == null) {
                    LogUtil.e("Track_RouteDrawViewHolder", "cpPoint is null in onGetHotTrackDetailInfo");
                    return;
                }
                jtn jtnVar = jtn.this;
                jtnVar.o = jtnVar.f.e();
                qqf.a(gdmVar.n().c(), aVar);
            }

            @Override // com.bumptech.glide.request.target.Target
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onResourceReady(Bitmap bitmap, Transition<? super Bitmap> transition) {
                jtn.this.f39026b = bitmap;
                c cVar2 = cVar;
                if (cVar2 != null) {
                    cVar2.onSuccess(null);
                }
            }

            @Override // com.bumptech.glide.request.target.Target
            public void onLoadCleared(Drawable drawable) {
                LogUtil.j("Track_RouteDrawViewHolder", "onLoadCleared");
            }
        });
    }

    public void c() {
        ConstraintLayout constraintLayout = this.n;
        if (constraintLayout == null) {
            LogUtil.e("Track_RouteDrawViewHolder", "mLayoutRouteDrawTab is null in mRouteDrawViewHolder");
            return;
        }
        if (!this.i) {
            LogUtil.e("Track_RouteDrawViewHolder", "failed to request route draw data");
            return;
        }
        constraintLayout.setVisibility(0);
        SharedPreferences sharedPreferences = this.f39025a.getSharedPreferences(Integer.toString(20002), 0);
        this.r = sharedPreferences;
        if (sharedPreferences == null) {
            LogUtil.j("Track_RouteDrawViewHolder", "sharedPreferences is null in showTrackAndShapeButton");
        } else if (sharedPreferences.getBoolean("displayedSwitchPreviewBubble", false)) {
            this.t.setVisibility(8);
        } else {
            this.t.setVisibility(0);
        }
    }

    private void e() {
        this.t.setVisibility(8);
        SharedPreferences sharedPreferences = this.r;
        if (sharedPreferences != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putBoolean("displayedSwitchPreviewBubble", true);
            editorEdit.apply();
        }
    }

    public void e(InterfaceHiMap interfaceHiMap, boolean z) {
        this.l = interfaceHiMap;
        if (z) {
            c();
        }
        b(this.f, this.g, this.f39027c);
        d(this.o, this.f39026b, this.f39027c);
    }

    private void d(gco gcoVar, Bitmap bitmap, String str) {
        if (this.l == null) {
            LogUtil.e("Track_RouteDrawViewHolder", "mMap is null in drawRouteDrawBoard");
            return;
        }
        if (gcoVar == null || bitmap == null) {
            LogUtil.e("Track_RouteDrawViewHolder", "param is null in drawRouteDrawBoard");
            return;
        }
        this.k = this.l.addOverlay(new jrz().b(izt.a(izt.b(gcoVar.a()), str, this.l.getMapEngineType())).a((float) gcoVar.e()).e((float) gcoVar.d()).b(bitmap).c(11.0f).b(false));
    }

    private void b(gcl gclVar, String str, String str2) {
        if (this.l == null) {
            LogUtil.e("Track_RouteDrawViewHolder", "mMap is null in drawShapeAndCpPoint");
            return;
        }
        if (gclVar == null) {
            LogUtil.j("Track_RouteDrawViewHolder", "cpPoint is null in drawRouteDrawShape");
            return;
        }
        List<GpsPoint> listC = gclVar.c();
        if (HiCommonUtil.b(listC)) {
            LogUtil.j("Track_RouteDrawViewHolder", "cpGpsList is null in loadCpPoint");
            return;
        }
        ArrayList arrayList = new ArrayList(listC.size());
        Iterator<GpsPoint> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(izt.b(it.next()));
        }
        List<jpg> listD = izt.d(arrayList, str2, this.l.getMapEngineType());
        e(listD, str);
        d(listD, gclVar.d());
    }

    private void e(List<jpg> list, String str) {
        int i;
        if (this.l == null) {
            LogUtil.e("Track_RouteDrawViewHolder", "mMap is null in drawCpPoint");
            return;
        }
        String[] strArrSplit = str.substring(1, str.length() - 1).split(",");
        if (strArrSplit.length != list.size()) {
            LogUtil.e("Track_RouteDrawViewHolder", "param is error in drawCpPoint");
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            jpg jpgVar = list.get(i2);
            jrv jrvVar = new jrv();
            if ("1".equals(strArrSplit[i2])) {
                i = R.drawable.route_point;
            } else {
                i = R.drawable.route_point_unfinished;
            }
            jrvVar.d(jpgVar).c(qqf.a(qre.c(i))).a(true).c(0.5f, 0.5f).d(false).b(13);
            if (this.s == null) {
                this.s = new ArrayList();
            }
            this.s.add(Integer.valueOf(this.l.addMarker(jrvVar, null)));
            if (i2 == list.size() - 1) {
                this.l.addMarker(jrvVar, null);
            }
        }
    }

    private void d(List<jpg> list, List<gcs> list2) {
        if (this.l == null) {
            LogUtil.e("Track_RouteDrawViewHolder", "mMap is null in drawRouteDrawShape");
            return;
        }
        for (gcs gcsVar : list2) {
            jpg jpgVar = list.get(gcsVar.d());
            jpg jpgVar2 = list.get(gcsVar.b());
            jrs jrsVar = new jrs();
            jrsVar.d(false).b(jpgVar).e(jpgVar2).c(BaseApplication.getContext().getColor(R.color.color_fb6522)).b(jer.d(8.0f)).a(false).e(12.0f);
            if (this.q == null) {
                this.q = new ArrayList();
            }
            this.q.add(this.l.drawLines(jrsVar));
        }
    }

    public void d() {
        if (this.l == null) {
            LogUtil.e("Track_RouteDrawViewHolder", "mMap is null in moveRouteDrawShapeCenter");
            return;
        }
        gco gcoVar = this.o;
        if (gcoVar == null) {
            LogUtil.e("Track_RouteDrawViewHolder", "mMap is null in moveRouteDrawShapeCenter");
            return;
        }
        this.l.animateCamera(new jru().e(izt.b(izt.b(gcoVar.a()), (int) this.o.e())).e(jer.d(36.0f)).e((float) this.o.d()), 0);
        View view = this.p;
        this.l.scrollBy(0.0f, (view == null || this.n == null) ? 0.0f : (view.getHeight() - this.n.getBottom()) / 2.0f);
    }

    private void e(HealthTextView healthTextView, boolean z) {
        if (healthTextView == null) {
            LogUtil.e("Track_RouteDrawViewHolder", "button is null in changeRouteDrawBtnBack");
        } else if (z) {
            healthTextView.setBackgroundResource(R.drawable.route_draw_shape_tab_bg);
            healthTextView.setTextColor(BaseApplication.getContext().getColor(R.color.route_draw_tab_text_checked));
        } else {
            healthTextView.setBackgroundResource(R.drawable.hw_show_transparent);
            healthTextView.setTextColor(BaseApplication.getContext().getColor(R.color.route_draw_tab_text_unchecked));
        }
    }

    public void a() {
        this.n = null;
        this.d = null;
        this.e = null;
    }

    public static class c extends UiCallback {
        private final WeakReference<TrackScreenFrag> d;

        public c(TrackScreenFrag trackScreenFrag) {
            this.d = new WeakReference<>(trackScreenFrag);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("Track_RouteDrawViewHolder", "RouteDrawUiCallback is fail");
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onSuccess(Object obj) {
            TrackScreenFrag trackScreenFrag = this.d.get();
            if (trackScreenFrag != null) {
                trackScreenFrag.d();
            } else {
                LogUtil.e("Track_RouteDrawViewHolder", "success trackScreenFrag is null");
            }
        }
    }

    public static class a extends CustomTarget<Bitmap> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<TrackScreenFrag> f39030c;

        public a(TrackScreenFrag trackScreenFrag) {
            this.f39030c = new WeakReference<>(trackScreenFrag);
        }

        @Override // com.bumptech.glide.request.target.Target
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(Bitmap bitmap, Transition<? super Bitmap> transition) {
            TrackScreenFrag trackScreenFrag = this.f39030c.get();
            if (trackScreenFrag != null) {
                trackScreenFrag.e(bitmap);
            } else {
                LogUtil.e("Track_RouteDrawViewHolder", "trackScreenFrag is null in ThumbnailCallback");
            }
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadCleared(Drawable drawable) {
            LogUtil.j("Track_RouteDrawViewHolder", "ThumbnailCallback onLoadCleared");
        }
    }
}
