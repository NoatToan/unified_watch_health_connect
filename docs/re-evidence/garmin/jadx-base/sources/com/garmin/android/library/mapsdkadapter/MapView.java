package com.garmin.android.library.mapsdkadapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0001\"B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0004\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00178\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/garmin/android/library/mapsdkadapter/MapView;", "Lcom/garmin/android/library/mapsdkadapter/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lie2/l;", "mapOptions", "(Landroid/content/Context;Lie2/l;)V", "Lcom/garmin/android/library/mapsdkadapter/i$l;", "mapReadyListener", "", "setupMap", "(Lcom/garmin/android/library/mapsdkadapter/i$l;)V", "Lqe2/h;", "getMapProxy", "()Lqe2/h;", "Lcom/garmin/android/library/mapsdkadapter/k;", "g", "Lcom/garmin/android/library/mapsdkadapter/k;", "getMapBuilder", "()Lcom/garmin/android/library/mapsdkadapter/k;", "mapBuilder", "", "hasCustomView", "Z", "getHasCustomView", "()Z", "a", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class MapView extends com.garmin.android.library.mapsdkadapter.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f50234j;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final k mapBuilder;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList<e23.l<i, Unit>> f50236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public qe2.h f50237i;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/library/mapsdkadapter/MapView$b", "Lcom/garmin/android/library/mapsdkadapter/i$l;", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements i.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i.l f50238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MapView f50239b;

        public b(i.l lVar, MapView mapView) {
            this.f50238a = lVar;
            this.f50239b = mapView;
        }

        @Override // com.garmin.android.library.mapsdkadapter.i.l
        public final void O5(i.d dVar) {
            dVar.getClass();
            dVar.toString();
            i.l lVar = this.f50238a;
            if (lVar != null) {
                lVar.O5(dVar);
            }
            this.f50239b.f50236h.clear();
        }

        @Override // com.garmin.android.library.mapsdkadapter.i.l
        public final void h1(i iVar) {
            iVar.toString();
            i.l lVar = this.f50238a;
            if (lVar != null) {
                lVar.h1(iVar);
            }
            MapView mapView = this.f50239b;
            qe2.h hVar = mapView.f50237i;
            ArrayList<e23.l<i, Unit>> arrayList = mapView.f50236h;
            if (hVar != null) {
                hVar.h1(iVar);
            }
            Objects.toString(iVar);
            Iterator<e23.l<i, Unit>> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().invoke(iVar);
            }
            arrayList.clear();
        }
    }

    static {
        new a(null);
        f50234j = 8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapView(Context context, ie2.l lVar) {
        super(context);
        context.getClass();
        lVar.getClass();
        ie2.n.f93149a.getClass();
        this.mapBuilder = ie2.n.a();
        this.f50236h = new ArrayList<>();
        e(context);
        setMapOptions(lVar);
    }

    public final void d(e23.l<? super i, Unit> lVar) {
        if (this.mapAdapter != null && getMapAdapter().f50241b) {
            lVar.invoke(getMapAdapter());
        } else {
            this.f50236h.add(new fb0.d(lVar, 23));
        }
    }

    public final void e(Context context) {
        if (getHasCustomView()) {
            return;
        }
        View.inflate(context, R.layout.map_view, this);
        setMapAdapter(new d());
        View viewFindViewById = findViewById(R.id.map_view);
        viewFindViewById.getClass();
        setMapContainer((FrameLayout) viewFindViewById);
        setMapUnavailableText((TextView) findViewById(R.id.map_unavailable_text));
        setMapLoadingProgress((ProgressBar) findViewById(R.id.map_progress_bar));
    }

    public void f(ViewGroup viewGroup, i.d dVar, ie2.l lVar, i.l lVar2) {
        ViewGroup viewGroup2 = viewGroup;
        if (viewGroup == null) {
            viewGroup2 = this;
        }
        setMapContainer(viewGroup2);
        setMapReadyListener(new b(lVar2, this));
        if (lVar != null) {
            setMapOptions(lVar);
        }
        this.f50237i = null;
        k kVar = this.mapBuilder;
        if (dVar == null) {
            dVar = kVar.b();
        }
        setMapAdapter(kVar.a(dVar));
        i.d dVarA = getMapAdapter().getF50264r();
        if (dVarA == i.d.NULL) {
            setMapAdapter(new d());
            c();
            i.l lVar3 = this.mapReadyListener;
            if (lVar3 != null) {
                lVar3.O5(dVarA);
                return;
            }
            return;
        }
        try {
            getMapAdapter().Y(getMapContainer(), this.mapOptions, this.mapReadyListener);
            Unit unit = Unit.INSTANCE;
        } catch (Exception e4) {
            e4.getMessage();
            setMapAdapter(new d());
            c();
            i.l lVar4 = this.mapReadyListener;
            if (lVar4 != null) {
                lVar4.O5(dVarA);
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public boolean getHasCustomView() {
        return false;
    }

    public final k getMapBuilder() {
        return this.mapBuilder;
    }

    @Override // com.garmin.android.library.mapsdkadapter.b
    public qe2.h getMapProxy() {
        qe2.h hVar = this.f50237i;
        if (hVar != null) {
            return hVar;
        }
        qe2.h hVar2 = new qe2.h(getMapAdapter());
        this.f50237i = hVar2;
        return hVar2;
    }

    public void setupMap(i.l mapReadyListener) {
        f(null, null, null, mapReadyListener);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/library/mapsdkadapter/MapView$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        ie2.n.f93149a.getClass();
        this.mapBuilder = ie2.n.a();
        this.f50236h = new ArrayList<>();
        e(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        ie2.n.f93149a.getClass();
        this.mapBuilder = ie2.n.a();
        this.f50236h = new ArrayList<>();
        e(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapView(Context context) {
        super(context);
        context.getClass();
        ie2.n.f93149a.getClass();
        this.mapBuilder = ie2.n.a();
        this.f50236h = new ArrayList<>();
        e(context);
    }
}
