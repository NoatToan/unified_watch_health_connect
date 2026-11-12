package ne2;

import com.mapbox.geojson.Point;
import com.mapbox.maps.MapView;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mapsdkadapter.mapbox.MapboxCameraAlgorithm$Companion", f = "MapboxCameraAlgorithm.kt", l = {124, 214}, m = "calculateOptimalCamera", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MapView f125608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Point f125609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f125610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f125611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f125612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r0 f125613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Iterator f125614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f125615h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f125616i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f125617j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double f125618k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double f125619l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public double f125620m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double f125621n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public double f125622o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double f125623p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double f125624q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f125625r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f125626t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f125627v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h.d f125628w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f125629x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h.d dVar, t13.d<? super i> dVar2) {
        super(dVar2);
        this.f125628w = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f125627v = obj;
        this.f125629x |= Integer.MIN_VALUE;
        return this.f125628w.c(null, 0.0d, 0.0d, null, null, this);
    }
}
