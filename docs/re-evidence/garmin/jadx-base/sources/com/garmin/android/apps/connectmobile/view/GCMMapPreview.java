package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import com.garmin.android.library.mapsdkadapter.d;
import com.garmin.android.library.mapsdkadapter.i;
import ie2.k;
import ie2.l;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0004\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/GCMMapPreview;", "Lcom/garmin/android/apps/connectmobile/map/GCMMapView;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lie2/l;", "mapOptions", "(Landroid/content/Context;Lie2/l;)V", "Lcom/garmin/android/library/mapsdkadapter/i$l;", "mapReadyListener", "", "setupMap", "(Lcom/garmin/android/library/mapsdkadapter/i$l;)V", "", "visibility", "setMapPreviewVisibility", "(Z)V", "visible", "setBorderVisible", "getHasCustomView", "()Z", "hasCustomView", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCMMapPreview extends GCMMapView {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f47445q = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f47446l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f47447m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f47448n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f47449o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f47450p;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/view/GCMMapPreview$a", "Lcom/garmin/android/library/mapsdkadapter/i$l;", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements i.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i.l f47452b;

        public a(i.l lVar) {
            this.f47452b = lVar;
        }

        @Override // com.garmin.android.library.mapsdkadapter.i.l
        public final void O5(i.d dVar) {
            dVar.getClass();
            i.l lVar = this.f47452b;
            if (lVar != null) {
                lVar.O5(dVar);
            }
        }

        @Override // com.garmin.android.library.mapsdkadapter.i.l
        public final void h1(i iVar) {
            int i14 = GCMMapPreview.f47445q;
            GCMMapPreview.this.getClass();
            k uiSettings = iVar.getUiSettings();
            uiSettings.setAllGesturesEnabled(false);
            uiSettings.b();
            uiSettings.setMapToolbarEnabled(false);
            uiSettings.a();
            uiSettings.setRotateGesturesEnabled(false);
            uiSettings.setScrollGesturesEnabled(false);
            uiSettings.setTiltGesturesEnabled(false);
            uiSettings.setZoomControlsEnabled(false);
            uiSettings.setZoomGesturesEnabled(false);
            i.l lVar = this.f47452b;
            if (lVar != null) {
                lVar.h1(iVar);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMMapPreview(Context context, l lVar) {
        super(context, lVar);
        context.getClass();
        lVar.getClass();
        k(context);
    }

    @Override // com.garmin.android.library.mapsdkadapter.b
    public final void b() {
        if (!getMapAdapter().L()) {
            c();
            return;
        }
        getMapContainer().setVisibility(0);
        TextView textView = this.f47446l;
        textView.getClass();
        textView.setVisibility(8);
        View view2 = this.f47450p;
        view2.getClass();
        view2.setVisibility(8);
        ProgressBar mapLoadingProgress = getMapLoadingProgress();
        mapLoadingProgress.getClass();
        mapLoadingProgress.setVisibility(8);
        TextView mapUnavailableText = getMapUnavailableText();
        mapUnavailableText.getClass();
        mapUnavailableText.setVisibility(8);
    }

    @Override // com.garmin.android.library.mapsdkadapter.b
    public final void c() {
        getMapContainer().setVisibility(4);
        TextView textView = this.f47446l;
        textView.getClass();
        textView.setVisibility(8);
        View view2 = this.f47450p;
        view2.getClass();
        view2.setVisibility(8);
        ProgressBar mapLoadingProgress = getMapLoadingProgress();
        mapLoadingProgress.getClass();
        mapLoadingProgress.setVisibility(8);
        TextView mapUnavailableText = getMapUnavailableText();
        mapUnavailableText.getClass();
        mapUnavailableText.setVisibility(0);
    }

    @Override // com.garmin.android.library.mapsdkadapter.MapView
    public boolean getHasCustomView() {
        return true;
    }

    public final void j() {
        String string = getContext().getString(R.string.lbl_missing_map_data);
        getMapContainer().setVisibility(8);
        View view2 = this.f47450p;
        view2.getClass();
        view2.setVisibility(8);
        ProgressBar mapLoadingProgress = getMapLoadingProgress();
        mapLoadingProgress.getClass();
        mapLoadingProgress.setVisibility(8);
        TextView textView = this.f47446l;
        textView.getClass();
        textView.setText(string);
        TextView textView2 = this.f47446l;
        textView2.getClass();
        textView2.setVisibility(0);
        TextView mapUnavailableText = getMapUnavailableText();
        mapUnavailableText.getClass();
        mapUnavailableText.setVisibility(8);
    }

    public final void k(Context context) {
        this.f47447m = View.inflate(context, R.layout.gcm_map_preview, this);
        setMapAdapter(new d());
        View viewFindViewById = findViewById(R.id.mapView);
        viewFindViewById.getClass();
        setMapContainer((ViewGroup) viewFindViewById);
        this.f47446l = (TextView) findViewById(R.id.mapStatusTv);
        this.f47450p = findViewById(R.id.mapProgressBackground);
        setMapLoadingProgress((ProgressBar) findViewById(R.id.mapStatusProgressBar));
        setMapUnavailableText((TextView) findViewById(R.id.mapUnavailableText));
        this.f47448n = findViewById(R.id.map_top_border);
        this.f47449o = findViewById(R.id.map_bottom_border);
    }

    public final void setBorderVisible(boolean visible) {
        View view2 = this.f47448n;
        if (visible) {
            view2.getClass();
            view2.setVisibility(0);
            View view3 = this.f47449o;
            view3.getClass();
            view3.setVisibility(0);
            return;
        }
        view2.getClass();
        view2.setVisibility(8);
        View view4 = this.f47449o;
        view4.getClass();
        view4.setVisibility(8);
    }

    public final void setMapPreviewVisibility(boolean visibility) {
        View view2 = this.f47447m;
        if (view2 != null) {
            view2.getClass();
            view2.setVisibility(visibility ? 0 : 8);
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.MapView
    public void setupMap(i.l mapReadyListener) {
        f(getMapContainer(), null, null, new a(mapReadyListener));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMMapPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        k(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMMapPreview(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        k(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMMapPreview(Context context) {
        super(context);
        context.getClass();
        k(context);
    }
}
