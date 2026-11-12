package xf1;

import am.r1;
import am.x0;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.v;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import androidx.room.a0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsDTO;
import com.garmin.android.apps.connectmobile.view.SlidingUpPanelLayout;
import com.garmin.android.library.mapsdkadapter.q;
import fw.p;
import g62.d0;
import gg1.o0;
import ig1.l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u000f\u0010B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u0011"}, d2 = {"Lxf1/c;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/view/SlidingUpPanelLayout$c;", "Lxf1/h;", "Lxf1/d$a;", "", "<init>", "()V", "Landroid/view/View;", "panel", "", "onPanelCollapsed", "(Landroid/view/View;)V", "onPanelExpanded", "onPanelAnchored", "b", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c extends com.garmin.android.apps.connectmobile.c implements SlidingUpPanelLayout.c, h, xf1.d.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f190634q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f190635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SlidingUpPanelLayout f190636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f190637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f190638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f190639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f190640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f190641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f190642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f190643i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f190644j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v f190645k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public xf1.d f190646l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j f190647m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<SegmentDetailsDTO> f190649o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f190648n = b.NONE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f190650p = -1;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxf1/c$b;", "", "", "tagName", "", "nameResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        NONE("none", -1),
        MAP("fragTagSegmentsMap", R.string.lbl_map),
        LIST("fragTagSegmentsList", R.string.lbl_list);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f190655a;

        b(String str, int i14) {
            this.f190655a = str;
        }
    }

    /* JADX INFO: renamed from: xf1.c$c, reason: collision with other inner class name */
    public static final /* synthetic */ class C3549c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f190656a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f190656a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f190657a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f190657a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f190657a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f190657a.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    public int ca() {
        return 0;
    }

    public final int da(long j8) {
        SegmentDetailsDTO segmentDetailsDTO;
        ArrayList<SegmentDetailsDTO> arrayList = this.f190649o;
        if (arrayList == null || arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        ArrayList<SegmentDetailsDTO> arrayList2 = this.f190649o;
        int size = arrayList2 != null ? arrayList2.size() : 0;
        for (int i14 = 0; i14 < size; i14++) {
            ArrayList<SegmentDetailsDTO> arrayList3 = this.f190649o;
            if (arrayList3 != null && (segmentDetailsDTO = arrayList3.get(i14)) != null && segmentDetailsDTO.f17837b == j8) {
                return i14;
            }
        }
        return -1;
    }

    @Override // xf1.d.a
    public final void e5() {
        fa();
    }

    /* JADX INFO: renamed from: ea, reason: from getter */
    public xf1.d getF190646l() {
        return this.f190646l;
    }

    public void f2(ie2.j jVar, long j8) {
        SegmentDetailsDTO segmentDetailsDTO;
        xf1.d f190646l;
        ArrayList arrayList;
        xf1.d dVar;
        com.garmin.android.library.mapsdkadapter.l lVarH;
        ie2.j jVarX;
        int iDa = da(j8);
        if (iDa < 0) {
            i2.a.j(i2.f36769a, "AbstractSegActivity", a0.f(j8, "Segment PK:", " not in the segment list"));
            xf1.d f190646l2 = getF190646l();
            if (f190646l2 != null) {
                f190646l2.A6();
            }
            fa();
            return;
        }
        ArrayList<SegmentDetailsDTO> arrayList2 = this.f190649o;
        SegmentDetailsDTO segmentDetailsDTO2 = arrayList2 != null ? arrayList2.get(iDa) : null;
        ImageView imageView = this.f190643i;
        if (imageView != null) {
            imageView.setImageResource((segmentDetailsDTO2 == null || !segmentDetailsDTO2.f17840e) ? R.drawable.star_outlined : R.drawable.star_filled);
        }
        int i14 = (segmentDetailsDTO2 == null || !segmentDetailsDTO2.f17840e) ? R.color.gcm_icon_secondary : R.color.gds_data_viz_yellow_primary;
        ImageView imageView2 = this.f190643i;
        if (imageView2 != null) {
            imageView2.setImageTintList(ColorStateList.valueOf(a7.b.getColor(this, i14)));
        }
        TextView textView = this.f190638d;
        if (textView != null) {
            textView.setText(segmentDetailsDTO2 != null ? segmentDetailsDTO2.f17838c : null);
        }
        TextView textView2 = this.f190638d;
        if (textView2 != null) {
            textView2.setOnClickListener(new wv2.h(6, segmentDetailsDTO2, this));
        }
        final f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
        final double d14 = (segmentDetailsDTO2 != null ? segmentDetailsDTO2.f17842g : 0.0d) * 1000.0d;
        String strE = new r1(this).e(d14, lVar.y());
        String strA = oi0.d.a(this, strE, new oi0.f() { // from class: xf1.a
            @Override // oi0.f
            public final void a(oi0.b bVar) {
                int i15 = c.f190634q;
                bVar.getClass();
                if (!lVar.y()) {
                    bVar.B();
                    bVar.g();
                } else if (d14 >= 1000.0d) {
                    bVar.s();
                } else {
                    bVar.y();
                }
            }
        });
        TextView textView3 = this.f190639e;
        if (textView3 != null) {
            textView3.setText(strE);
        }
        TextView textView4 = this.f190639e;
        if (textView4 != null) {
            textView4.setContentDescription(strA);
        }
        l3.a aVar = l3.f23124b;
        double d15 = segmentDetailsDTO2 != null ? segmentDetailsDTO2.f41277p : 0.0d;
        o0 o0VarG = lVar.g();
        aVar.getClass();
        String strA0 = l3.a.a0(this, d15, o0VarG, true, false);
        String strA2 = oi0.d.a(this, strA0, new l0(13));
        TextView textView5 = this.f190640f;
        if (textView5 != null) {
            textView5.setText(strA0);
        }
        TextView textView6 = this.f190640f;
        if (textView6 != null) {
            textView6.setContentDescription(strA2);
        }
        Integer numValueOf = segmentDetailsDTO2 != null ? Integer.valueOf(segmentDetailsDTO2.f17845j) : null;
        if (numValueOf != null) {
            e eVar = e.f190667d.get(numValueOf.intValue());
            if (eVar == null) {
                eVar = e.TYPE_OTHER;
            }
            TextView textView7 = this.f190642h;
            if (textView7 != null) {
                textView7.setText(getString(eVar.f190677b));
            }
        }
        Integer numValueOf2 = segmentDetailsDTO2 != null ? Integer.valueOf(segmentDetailsDTO2.f17844i) : null;
        if (numValueOf2 != null) {
            o oVar = o.f190704c.get(numValueOf2.intValue());
            if (oVar == null) {
                oVar = o.TYPE_ALL;
            }
            TextView textView8 = this.f190641g;
            if (textView8 != null) {
                textView8.setText(getString(oVar.f190713b));
            }
        }
        ImageView imageView3 = this.f190643i;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new d0(this, iDa, segmentDetailsDTO2, 7));
        }
        ImageView imageView4 = this.f190644j;
        if (imageView4 != null) {
            imageView4.setImageResource(am.z0.k(segmentDetailsDTO2 != null ? segmentDetailsDTO2.f17839d : -1, x0.f4346x).f4361d);
        }
        SlidingUpPanelLayout slidingUpPanelLayout = this.f190636b;
        if (slidingUpPanelLayout != null) {
            slidingUpPanelLayout.c();
        }
        xf1.d f190646l3 = getF190646l();
        if (f190646l3 != null) {
            f190646l3.y6(ca());
        }
        ArrayList<SegmentDetailsDTO> arrayList3 = this.f190649o;
        if (arrayList3 != null && (segmentDetailsDTO = arrayList3.get(iDa)) != null && (f190646l = getF190646l()) != null && (arrayList = segmentDetailsDTO.f41283x) != null && arrayList.size() > 1) {
            f190646l.f190661k = jVar;
            jVar.setIcon(2131232323);
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            int i15 = 0;
            while (i15 < size) {
                com.garmin.android.apps.connectmobile.segments.model.a aVar2 = (com.garmin.android.apps.connectmobile.segments.model.a) arrayList.get(i15);
                arrayList4.add(new com.garmin.android.library.mapsdkadapter.f(aVar2.f41341a, aVar2.f41342b, com.garmin.android.library.mapsdkadapter.i.b.WGS84));
                i15++;
                f190646l = f190646l;
            }
            xf1.d dVar2 = f190646l;
            if (arrayList4.size() > 1) {
                com.garmin.android.library.mapsdkadapter.e.a aVar3 = new com.garmin.android.library.mapsdkadapter.e.a();
                com.garmin.android.library.mapsdkadapter.f fVar = (com.garmin.android.library.mapsdkadapter.f) arrayList4.get(0);
                if (fVar != null) {
                    aVar3.b(fVar);
                }
                q qVar = new q();
                ie2.p pVar = qVar.f50328a;
                pVar.f93156d = R.color.gcm_map_segment_track_path;
                pVar.f93155c = 5.0f;
                pVar.f93161i = true;
                int size2 = arrayList4.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    com.garmin.android.library.mapsdkadapter.f fVar2 = (com.garmin.android.library.mapsdkadapter.f) arrayList4.get(i16);
                    if (fVar2 != null) {
                        pVar.f93153a.add(fVar2);
                        aVar3.b(fVar2);
                    }
                }
                dVar = dVar2;
                qe2.h hVar = dVar.f148294e;
                lVarH = hVar != null ? hVar.h(qVar) : null;
                com.garmin.android.library.mapsdkadapter.f fVar3 = (com.garmin.android.library.mapsdkadapter.f) am.j.f(1, arrayList4);
                if (fVar3 != null) {
                    aVar3.b(fVar3);
                }
                dVar.u6(aVar3.a(), -1);
            } else {
                dVar = dVar2;
                lVarH = null;
            }
            dVar.f190660j = lVarH;
            com.garmin.android.apps.connectmobile.segments.model.a aVar4 = (com.garmin.android.apps.connectmobile.segments.model.a) arrayList.get(arrayList.size() - 1);
            com.garmin.android.library.mapsdkadapter.f fVar4 = new com.garmin.android.library.mapsdkadapter.f(aVar4.f41341a, aVar4.f41342b, com.garmin.android.library.mapsdkadapter.i.b.WGS84);
            qe2.h hVar2 = dVar.f148294e;
            if (hVar2 != null) {
                com.garmin.android.library.mapsdkadapter.p pVar2 = new com.garmin.android.library.mapsdkadapter.p();
                pVar2.b(2131232324);
                pVar2.d(fVar4);
                pVar2.f50327a.f50312d = segmentDetailsDTO.f17838c;
                jVarX = hVar2.x(pVar2);
            } else {
                jVarX = null;
            }
            dVar.f190662l = (qe2.i) jVarX;
        }
        this.f190650p = j8;
    }

    public final void fa() {
        this.f190650p = -1L;
        SlidingUpPanelLayout slidingUpPanelLayout = this.f190636b;
        if (slidingUpPanelLayout == null || slidingUpPanelLayout.f47539w) {
            return;
        }
        slidingUpPanelLayout.e(1.0f);
    }

    public final void ga() {
        this.f190638d = (TextView) findViewById(R.id.segment_overview_title_tv);
        View viewFindViewById = findViewById(R.id.segment_overview_distance);
        viewFindViewById.setBackground(null);
        ((TextView) viewFindViewById.findViewById(R.id.stats_row_label)).setText(R.string.lbl_distance);
        this.f190639e = (TextView) viewFindViewById.findViewById(R.id.stats_row_value);
        View viewFindViewById2 = findViewById(R.id.segment_overview_elev_gain);
        viewFindViewById2.setBackground(null);
        ((TextView) viewFindViewById2.findViewById(R.id.stats_row_label)).setText(R.string.lbl_total_ascent);
        this.f190640f = (TextView) viewFindViewById2.findViewById(R.id.stats_row_value);
        View viewFindViewById3 = findViewById(R.id.segment_overview_surface);
        viewFindViewById3.setBackground(null);
        ((TextView) viewFindViewById3.findViewById(R.id.stats_row_label)).setText(R.string.lbl_segment_surface);
        this.f190641g = (TextView) viewFindViewById3.findViewById(R.id.stats_row_value);
        View viewFindViewById4 = findViewById(R.id.segment_overview_type);
        viewFindViewById4.setBackground(null);
        ((TextView) viewFindViewById4.findViewById(R.id.stats_row_label)).setText(R.string.lbl_segment_segment_type);
        this.f190642h = (TextView) viewFindViewById4.findViewById(R.id.stats_row_value);
        this.f190643i = (ImageView) findViewById(R.id.segment_overview_favorite_imv);
        this.f190644j = (ImageView) findViewById(R.id.segment_overview_type_imv);
    }

    public abstract xf1.d ha();

    public final void ia() {
        v vVar = this.f190645k;
        ja((xf1.d) (vVar != null ? vVar.G(b.MAP.f190655a) : null));
        if (getF190646l() == null) {
            i2.a aVar = i2.f36769a;
            i2.a.c(aVar, "AbstractSegActivity", "loadMap: mMapFragment is null");
            ja(ha());
            i2.a.c(aVar, "AbstractSegActivity", "loadMap: mMapFragment instantiated");
            v vVar2 = this.f190645k;
            androidx.fragment.app.a aVar2 = vVar2 != null ? new androidx.fragment.app.a(vVar2) : null;
            xf1.d f190646l = getF190646l();
            if (f190646l != null && aVar2 != null) {
                aVar2.l(R.id.frag_segments_container, f190646l, b.MAP.f190655a);
            }
            if (aVar2 != null) {
                aVar2.t();
            }
            i2.a.c(aVar, "AbstractSegActivity", "loadMap: mMapFragment added");
        } else {
            i2.a.c(i2.f36769a, "AbstractSegActivity", "loadMap: popBackStack");
            v vVar3 = this.f190645k;
            if (vVar3 != null) {
                vVar3.a0(1, b.MAP.f190655a);
            }
        }
        this.f190648n = b.MAP;
    }

    public void ja(xf1.d dVar) {
        this.f190646l = dVar;
    }

    public void ka(b bVar) {
        xf1.d f190646l;
        bVar.getClass();
        if (this.f190648n != bVar) {
            this.f190648n = bVar;
            b bVar2 = b.MAP;
            if (bVar == bVar2) {
                ia();
                ViewGroup viewGroup = this.f190637c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                    return;
                }
                return;
            }
            b bVar3 = b.LIST;
            if (bVar == bVar3) {
                if (getF190646l() != null && (f190646l = getF190646l()) != null && f190646l.f190663m) {
                    xf1.d f190646l2 = getF190646l();
                    if (f190646l2 != null) {
                        f190646l2.A6();
                    }
                    fa();
                    ViewGroup viewGroup2 = this.f190637c;
                    if (viewGroup2 != null) {
                        viewGroup2.setVisibility(8);
                    }
                }
                v vVar = this.f190645k;
                j jVar = (j) (vVar != null ? vVar.G(bVar3.f190655a) : null);
                this.f190647m = jVar;
                if (jVar == null) {
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                    ArrayList<SegmentDetailsDTO> arrayList2 = this.f190649o;
                    if (arrayList2 != null) {
                        arrayList.addAll(arrayList2);
                    }
                    j.f190696l.getClass();
                    j jVar2 = new j();
                    Bundle bundle = new Bundle();
                    bundle.putParcelableArrayList("SEGMENTS_LIST", arrayList);
                    l2.f37135b.getClass();
                    l2.a.c(jVar2, bundle);
                    this.f190647m = jVar2;
                }
                v vVar2 = this.f190645k;
                androidx.fragment.app.a aVar = vVar2 != null ? new androidx.fragment.app.a(vVar2) : null;
                j jVar3 = this.f190647m;
                if (jVar3 != null && aVar != null) {
                    aVar.l(R.id.frag_segments_container, jVar3, bVar3.f190655a);
                }
                if (aVar != null) {
                    aVar.d(bVar2.f190655a);
                }
                if (aVar != null) {
                    aVar.e();
                }
                this.f190648n = bVar3;
            }
        }
    }

    public void o7() {
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public void onActivityResult(int i14, int i15, Intent intent) {
        HashMap map;
        Object obj;
        j jVar;
        Collection collectionValues;
        Boolean bool;
        Set setKeySet;
        Object serializable;
        if (i14 == 1 && i15 == -1) {
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable = extras.getSerializable("GCM_extra_segment_is_favorite", HashMap.class);
                    } else {
                        Object serializable2 = extras.getSerializable("GCM_extra_segment_is_favorite");
                        if (!(serializable2 instanceof HashMap)) {
                            serializable2 = null;
                        }
                        serializable = (HashMap) serializable2;
                    }
                    map = (HashMap) serializable;
                } else {
                    map = null;
                }
                if (map == null || (setKeySet = map.keySet()) == null || (obj = (String) h0.c0(setKeySet)) == null) {
                    obj = -1;
                }
                boolean zBooleanValue = (map == null || (collectionValues = map.values()) == null || (bool = (Boolean) h0.c0(collectionValues)) == null) ? false : bool.booleanValue();
                ArrayList<SegmentDetailsDTO> arrayList = this.f190649o;
                if (arrayList != null && arrayList.size() > 0) {
                    int iDa = da(this.f190650p);
                    if (iDa >= 0) {
                        ArrayList<SegmentDetailsDTO> arrayList2 = this.f190649o;
                        SegmentDetailsDTO segmentDetailsDTO = arrayList2 != null ? arrayList2.get(iDa) : null;
                        if (s.g(segmentDetailsDTO != null ? segmentDetailsDTO.f17841f : null, obj) && segmentDetailsDTO.f17840e != zBooleanValue) {
                            segmentDetailsDTO.f17840e = zBooleanValue;
                            ImageView imageView = this.f190643i;
                            if (imageView != null) {
                                imageView.setImageResource(zBooleanValue ? R.drawable.star_filled : R.drawable.star_outlined);
                                int i16 = zBooleanValue ? R.color.gds_data_viz_yellow_primary : R.color.gcm_icon_secondary;
                                ImageView imageView2 = this.f190643i;
                                if (imageView2 != null) {
                                    imageView2.setImageTintList(ColorStateList.valueOf(a7.b.getColor(this, i16)));
                                }
                            }
                            if (this.f190648n == b.LIST && (jVar = this.f190647m) != null) {
                                jVar.z6(this.f190649o);
                            }
                        }
                    } else {
                        i2.a.j(i2.f36769a, "AbstractSegActivity", a0.f(this.f190650p, "Segment PK ", " not found in the list"));
                    }
                }
            }
            Intent intent2 = new Intent();
            intent2.putParcelableArrayListExtra("GCM_extra_segments_list", this.f190649o);
            setResult(-1, intent2);
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public void onBackPressed() {
        xf1.d f190646l;
        b bVar = this.f190648n;
        b bVar2 = b.MAP;
        if (bVar == bVar2 && (f190646l = getF190646l()) != null && f190646l.f190663m) {
            xf1.d f190646l2 = getF190646l();
            if (f190646l2 != null) {
                f190646l2.A6();
            }
            fa();
            return;
        }
        if (this.f190648n == b.LIST) {
            ka(bVar2);
        } else {
            finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f190645k = getSupportFragmentManager();
        this.f190635a = (n) new x1(this).a(n.class);
    }

    @Override // com.garmin.android.apps.connectmobile.view.SlidingUpPanelLayout.c
    public void onPanelAnchored(View panel) {
    }

    @Override // com.garmin.android.apps.connectmobile.view.SlidingUpPanelLayout.c
    public void onPanelCollapsed(View panel) {
        xf1.d f190646l = getF190646l();
        if (f190646l != null) {
            f190646l.A6();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.view.SlidingUpPanelLayout.c
    public void onPanelExpanded(View panel) {
    }

    @Override // xf1.h
    public final void u8(bg1.a aVar) {
        this.f190650p = aVar != null ? aVar.f17837b : -1L;
        if (this.f190648n == b.LIST) {
            rt1.m mVar = (rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null);
            if (aVar != null) {
                mVar.l(this, aVar);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lxf1/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "REQUEST_OPEN_DETAILS", "I", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
