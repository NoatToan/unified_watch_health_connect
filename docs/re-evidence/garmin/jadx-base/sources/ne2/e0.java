package ne2;

import com.mapbox.maps.plugin.compass.CompassPlugin;
import com.mapbox.maps.plugin.gestures.GesturesPlugin;
import com.mapbox.maps.plugin.scalebar.ScaleBarPlugin;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lne2/e0;", "Lie2/k;", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "gesturesPlugin", "Lcom/mapbox/maps/plugin/compass/CompassPlugin;", "compassPlugin", "Lcom/mapbox/maps/plugin/scalebar/ScaleBarPlugin;", "scaleBarPlugin", "<init>", "(Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;Lcom/mapbox/maps/plugin/compass/CompassPlugin;Lcom/mapbox/maps/plugin/scalebar/ScaleBarPlugin;)V", "a", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 implements ie2.k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f125586d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GesturesPlugin f125587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompassPlugin f125588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScaleBarPlugin f125589c;

    static {
        new a(null);
    }

    public /* synthetic */ e0(GesturesPlugin gesturesPlugin, CompassPlugin compassPlugin, ScaleBarPlugin scaleBarPlugin, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : gesturesPlugin, (i14 & 2) != 0 ? null : compassPlugin, (i14 & 4) != 0 ? null : scaleBarPlugin);
    }

    @Override // ie2.k
    public final void a() {
    }

    @Override // ie2.k
    public final void b() {
        CompassPlugin compassPlugin = this.f125588b;
        if (compassPlugin != null) {
            compassPlugin.updateSettings(new t(8));
        }
    }

    @Override // ie2.k
    public final void setAllGesturesEnabled(boolean z14) {
        GesturesPlugin gesturesPlugin = this.f125587a;
        if (gesturesPlugin != null) {
            gesturesPlugin.updateSettings(new a81.j(z14, 16));
        }
        CompassPlugin compassPlugin = this.f125588b;
        if (compassPlugin != null) {
            compassPlugin.updateSettings(new t(6));
        }
        ScaleBarPlugin scaleBarPlugin = this.f125589c;
        if (scaleBarPlugin != null) {
            scaleBarPlugin.updateSettings(new t(7));
        }
    }

    @Override // ie2.k
    public final void setMapToolbarEnabled(boolean z14) {
        ScaleBarPlugin scaleBarPlugin = this.f125589c;
        if (scaleBarPlugin != null) {
            scaleBarPlugin.updateSettings(new a81.j(z14, 17));
        }
    }

    @Override // ie2.k
    public final void setRotateGesturesEnabled(boolean z14) {
        GesturesPlugin gesturesPlugin = this.f125587a;
        if (gesturesPlugin != null) {
            gesturesPlugin.updateSettings(new a81.j(z14, 21));
        }
    }

    @Override // ie2.k
    public final void setScrollGesturesEnabled(boolean z14) {
        GesturesPlugin gesturesPlugin = this.f125587a;
        if (gesturesPlugin != null) {
            gesturesPlugin.updateSettings(new a81.j(z14, 18));
        }
    }

    @Override // ie2.k
    public final void setTiltGesturesEnabled(boolean z14) {
        GesturesPlugin gesturesPlugin = this.f125587a;
        if (gesturesPlugin != null) {
            gesturesPlugin.updateSettings(new a81.j(z14, 20));
        }
    }

    @Override // ie2.k
    public final void setZoomControlsEnabled(boolean z14) {
    }

    @Override // ie2.k
    public final void setZoomGesturesEnabled(boolean z14) {
        GesturesPlugin gesturesPlugin = this.f125587a;
        if (gesturesPlugin != null) {
            gesturesPlugin.updateSettings(new a81.j(z14, 19));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lne2/e0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public e0(GesturesPlugin gesturesPlugin, CompassPlugin compassPlugin, ScaleBarPlugin scaleBarPlugin) {
        this.f125587a = gesturesPlugin;
        this.f125588b = compassPlugin;
        this.f125589c = scaleBarPlugin;
    }

    public e0() {
        this(null, null, null, 7, null);
    }
}
