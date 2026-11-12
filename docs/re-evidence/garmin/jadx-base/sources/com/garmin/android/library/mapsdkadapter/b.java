package com.garmin.android.library.mapsdkadapter;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nB#\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00106\u001a\u0004\u0018\u00010/8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010>\u001a\u0004\u0018\u0001078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lcom/garmin/android/library/mapsdkadapter/b;", "Landroid/widget/FrameLayout;", "Lie2/i;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/garmin/android/library/mapsdkadapter/a;", "a", "Lcom/garmin/android/library/mapsdkadapter/a;", "getMapAdapter", "()Lcom/garmin/android/library/mapsdkadapter/a;", "setMapAdapter", "(Lcom/garmin/android/library/mapsdkadapter/a;)V", "mapAdapter", "Lie2/l;", "value", "b", "Lie2/l;", "getMapOptions", "()Lie2/l;", "setMapOptions", "(Lie2/l;)V", "mapOptions", "Lcom/garmin/android/library/mapsdkadapter/i$l;", "c", "Lcom/garmin/android/library/mapsdkadapter/i$l;", "getMapReadyListener", "()Lcom/garmin/android/library/mapsdkadapter/i$l;", "setMapReadyListener", "(Lcom/garmin/android/library/mapsdkadapter/i$l;)V", "mapReadyListener", "Landroid/view/ViewGroup;", "d", "Landroid/view/ViewGroup;", "getMapContainer", "()Landroid/view/ViewGroup;", "setMapContainer", "(Landroid/view/ViewGroup;)V", "mapContainer", "Landroid/widget/TextView;", JWKParameterNames.RSA_EXPONENT, "Landroid/widget/TextView;", "getMapUnavailableText", "()Landroid/widget/TextView;", "setMapUnavailableText", "(Landroid/widget/TextView;)V", "mapUnavailableText", "Landroid/widget/ProgressBar;", "f", "Landroid/widget/ProgressBar;", "getMapLoadingProgress", "()Landroid/widget/ProgressBar;", "setMapLoadingProgress", "(Landroid/widget/ProgressBar;)V", "mapLoadingProgress", "Lcom/garmin/android/library/mapsdkadapter/i$d;", "getMapProvider", "()Lcom/garmin/android/library/mapsdkadapter/i$d;", "mapProvider", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class b extends FrameLayout implements ie2.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public com.garmin.android.library.mapsdkadapter.a mapAdapter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public ie2.l mapOptions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public i.l mapReadyListener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public ViewGroup mapContainer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public TextView mapUnavailableText;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public ProgressBar mapLoadingProgress;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        context.getClass();
        this.mapOptions = new ie2.l(0, false, null, 0.0f, null, null, null, null, null, null, null, null, 4095, null);
    }

    public final void a(i.d dVar, i.l lVar) {
        dVar.getClass();
        ie2.c cameraState = getMapAdapter().getCameraState();
        if (cameraState != null) {
            ie2.l lVar2 = this.mapOptions;
            lVar2.f93138c = cameraState.f93111a;
            lVar2.f93139d = (float) cameraState.f93114d;
        }
        getMapAdapter().l();
        ((GCMMapView) this).f(null, dVar, this.mapOptions, lVar);
        onCreate(null);
    }

    public void b() {
        if (!getMapAdapter().L()) {
            c();
            return;
        }
        getMapContainer().setVisibility(0);
        ProgressBar progressBar = this.mapLoadingProgress;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        TextView textView = this.mapUnavailableText;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void c() {
        getMapContainer().setVisibility(0);
        ProgressBar progressBar = this.mapLoadingProgress;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        TextView textView = this.mapUnavailableText;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    public final com.garmin.android.library.mapsdkadapter.a getMapAdapter() {
        com.garmin.android.library.mapsdkadapter.a aVar = this.mapAdapter;
        if (aVar != null) {
            return aVar;
        }
        p005kotlin.jvm.internal.s.m("mapAdapter");
        throw null;
    }

    public ViewGroup getMapContainer() {
        ViewGroup viewGroup = this.mapContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        p005kotlin.jvm.internal.s.m("mapContainer");
        throw null;
    }

    public final ProgressBar getMapLoadingProgress() {
        return this.mapLoadingProgress;
    }

    public final ie2.l getMapOptions() {
        return this.mapOptions;
    }

    public i.d getMapProvider() {
        return getMapAdapter().getF50264r();
    }

    public abstract /* synthetic */ qe2.h getMapProxy();

    public final i.l getMapReadyListener() {
        return this.mapReadyListener;
    }

    public final TextView getMapUnavailableText() {
        return this.mapUnavailableText;
    }

    @Override // ie2.i
    public final void onCreate(Bundle bundle) {
        getMapAdapter().onCreate(bundle);
    }

    public void onDestroy() {
        getMapAdapter().onDestroy();
    }

    @Override // ie2.i
    public final void onLowMemory() {
        getMapAdapter().onLowMemory();
    }

    @Override // ie2.i
    public final void onPause() {
        getMapAdapter().onPause();
    }

    @Override // ie2.i
    public final void onResume() {
        getMapAdapter().onResume();
    }

    @Override // ie2.i
    public final void onStart() {
        getMapAdapter().onStart();
    }

    @Override // ie2.i
    public final void onStop() {
        getMapAdapter().onStop();
    }

    public final void setMapAdapter(com.garmin.android.library.mapsdkadapter.a aVar) {
        aVar.getClass();
        this.mapAdapter = aVar;
    }

    public void setMapContainer(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.mapContainer = viewGroup;
    }

    public final void setMapLoadingProgress(ProgressBar progressBar) {
        this.mapLoadingProgress = progressBar;
    }

    public final void setMapOptions(ie2.l lVar) {
        lVar.getClass();
        this.mapOptions = lVar;
    }

    public final void setMapReadyListener(i.l lVar) {
        this.mapReadyListener = lVar;
    }

    public final void setMapUnavailableText(TextView textView) {
        this.mapUnavailableText = textView;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/library/mapsdkadapter/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.mapOptions = new ie2.l(0, false, null, 0.0f, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.mapOptions = new ie2.l(0, false, null, 0.0f, null, null, null, null, null, null, null, null, 4095, null);
    }
}
