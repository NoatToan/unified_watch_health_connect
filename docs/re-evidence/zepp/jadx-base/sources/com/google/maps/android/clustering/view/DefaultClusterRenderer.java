package com.google.maps.android.clustering.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.MarkerManager;
import com.google.maps.android.R;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.ui.IconGenerator;
import com.google.maps.android.ui.SquareTextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultClusterRenderer<T extends ClusterItem> implements ClusterRenderer<T> {
    private static final boolean s;
    private static final int[] t;
    private static final TimeInterpolator u;
    private final GoogleMap a;
    private final IconGenerator b;
    private final ClusterManager<T> c;
    private final float d;
    private ShapeDrawable e;
    private g<T> h;
    private Set<? extends Cluster<T>> j;
    private float m;
    private final DefaultClusterRenderer<T>.k n;
    private ClusterManager.OnClusterClickListener<T> o;
    private ClusterManager.OnClusterInfoWindowClickListener<T> p;
    private ClusterManager.OnClusterItemClickListener<T> q;
    private ClusterManager.OnClusterItemInfoWindowClickListener<T> r;
    private Set<i> f = Collections.newSetFromMap(new ConcurrentHashMap());
    private SparseArray<BitmapDescriptor> g = new SparseArray<>();
    private int i = 4;
    private Map<Marker, Cluster<T>> k = new HashMap();
    private Map<Cluster<T>, Marker> l = new HashMap();

    public class a implements GoogleMap.OnMarkerClickListener {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
        public boolean onMarkerClick(Marker marker) {
            return DefaultClusterRenderer.this.q != null && DefaultClusterRenderer.this.q.onClusterItemClick((ClusterItem) DefaultClusterRenderer.this.h.b(marker));
        }
    }

    public class b implements GoogleMap.OnInfoWindowClickListener {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
        public void onInfoWindowClick(Marker marker) {
            if (DefaultClusterRenderer.this.r != null) {
                DefaultClusterRenderer.this.r.onClusterItemInfoWindowClick((ClusterItem) DefaultClusterRenderer.this.h.b(marker));
            }
        }
    }

    public class c implements GoogleMap.OnMarkerClickListener {
        public c() {
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
        public boolean onMarkerClick(Marker marker) {
            return DefaultClusterRenderer.this.o != null && DefaultClusterRenderer.this.o.onClusterClick((Cluster) DefaultClusterRenderer.this.k.get(marker));
        }
    }

    public class d implements GoogleMap.OnInfoWindowClickListener {
        public d() {
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
        public void onInfoWindowClick(Marker marker) {
            if (DefaultClusterRenderer.this.p != null) {
                DefaultClusterRenderer.this.p.onClusterInfoWindowClick((Cluster) DefaultClusterRenderer.this.k.get(marker));
            }
        }
    }

    @TargetApi(12)
    public class e extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private final i a;
        private final Marker b;
        private final LatLng c;
        private final LatLng d;
        private boolean e;
        private MarkerManager f;

        public /* synthetic */ e(DefaultClusterRenderer defaultClusterRenderer, i iVar, LatLng latLng, LatLng latLng2, a aVar) {
            this(iVar, latLng, latLng2);
        }

        public void a() {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(DefaultClusterRenderer.u);
            valueAnimatorOfFloat.addUpdateListener(this);
            valueAnimatorOfFloat.addListener(this);
            valueAnimatorOfFloat.start();
        }

        public void b(MarkerManager markerManager) {
            this.f = markerManager;
            this.e = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.e) {
                DefaultClusterRenderer.this.l.remove((Cluster) DefaultClusterRenderer.this.k.get(this.b));
                DefaultClusterRenderer.this.h.d(this.b);
                DefaultClusterRenderer.this.k.remove(this.b);
                this.f.remove(this.b);
            }
            this.a.b = this.d;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            LatLng latLng = this.d;
            double d = latLng.latitude;
            LatLng latLng2 = this.c;
            double d2 = latLng2.latitude;
            double d3 = animatedFraction;
            double d4 = ((d - d2) * d3) + d2;
            double dSignum = latLng.longitude - latLng2.longitude;
            if (Math.abs(dSignum) > 180.0d) {
                dSignum -= Math.signum(dSignum) * 360.0d;
            }
            this.b.setPosition(new LatLng(d4, (dSignum * d3) + this.c.longitude));
        }

        private e(i iVar, LatLng latLng, LatLng latLng2) {
            this.a = iVar;
            this.b = iVar.a;
            this.c = latLng;
            this.d = latLng2;
        }
    }

    public class f {
        private final Cluster<T> a;
        private final Set<i> b;
        private final LatLng c;

        public f(Cluster<T> cluster, Set<i> set, LatLng latLng) {
            this.a = cluster;
            this.b = set;
            this.c = latLng;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(DefaultClusterRenderer<T>.h hVar) {
            i iVar;
            a aVar = null;
            if (DefaultClusterRenderer.this.shouldRenderAsCluster(this.a)) {
                MarkerOptions markerOptions = new MarkerOptions();
                LatLng position = this.c;
                if (position == null) {
                    position = this.a.getPosition();
                }
                MarkerOptions markerOptionsPosition = markerOptions.position(position);
                DefaultClusterRenderer.this.onBeforeClusterRendered(this.a, markerOptionsPosition);
                Marker markerAddMarker = DefaultClusterRenderer.this.c.getClusterMarkerCollection().addMarker(markerOptionsPosition);
                DefaultClusterRenderer.this.k.put(markerAddMarker, this.a);
                DefaultClusterRenderer.this.l.put(this.a, markerAddMarker);
                i iVar2 = new i(markerAddMarker, aVar);
                LatLng latLng = this.c;
                if (latLng != null) {
                    hVar.b(iVar2, latLng, this.a.getPosition());
                }
                DefaultClusterRenderer.this.onClusterRendered(this.a, markerAddMarker);
                this.b.add(iVar2);
                return;
            }
            for (T t : this.a.getItems()) {
                Marker markerA = DefaultClusterRenderer.this.h.a(t);
                if (markerA == null) {
                    MarkerOptions markerOptions2 = new MarkerOptions();
                    LatLng latLng2 = this.c;
                    if (latLng2 != null) {
                        markerOptions2.position(latLng2);
                    } else {
                        markerOptions2.position(t.getPosition());
                    }
                    DefaultClusterRenderer.this.onBeforeClusterItemRendered(t, markerOptions2);
                    markerA = DefaultClusterRenderer.this.c.getMarkerCollection().addMarker(markerOptions2);
                    iVar = new i(markerA, aVar);
                    DefaultClusterRenderer.this.h.c(t, markerA);
                    LatLng latLng3 = this.c;
                    if (latLng3 != null) {
                        hVar.b(iVar, latLng3, t.getPosition());
                    }
                } else {
                    iVar = new i(markerA, aVar);
                }
                DefaultClusterRenderer.this.onClusterItemRendered(t, markerA);
                this.b.add(iVar);
            }
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class h extends Handler implements MessageQueue.IdleHandler {
        private static final int j = 0;
        private final Lock a;
        private final Condition b;
        private Queue<DefaultClusterRenderer<T>.f> c;
        private Queue<DefaultClusterRenderer<T>.f> d;
        private Queue<Marker> e;
        private Queue<Marker> f;
        private Queue<DefaultClusterRenderer<T>.e> g;
        private boolean h;

        public /* synthetic */ h(DefaultClusterRenderer defaultClusterRenderer, a aVar) {
            this();
        }

        @TargetApi(11)
        private void e() {
            if (!this.f.isEmpty()) {
                g(this.f.poll());
                return;
            }
            if (!this.g.isEmpty()) {
                this.g.poll().a();
                return;
            }
            if (!this.d.isEmpty()) {
                this.d.poll().b(this);
            } else if (!this.c.isEmpty()) {
                this.c.poll().b(this);
            } else {
                if (this.e.isEmpty()) {
                    return;
                }
                g(this.e.poll());
            }
        }

        private void g(Marker marker) {
            DefaultClusterRenderer.this.l.remove((Cluster) DefaultClusterRenderer.this.k.get(marker));
            DefaultClusterRenderer.this.h.d(marker);
            DefaultClusterRenderer.this.k.remove(marker);
            DefaultClusterRenderer.this.c.getMarkerManager().remove(marker);
        }

        public void a(boolean z, DefaultClusterRenderer<T>.f fVar) {
            this.a.lock();
            sendEmptyMessage(0);
            if (z) {
                this.d.add(fVar);
            } else {
                this.c.add(fVar);
            }
            this.a.unlock();
        }

        public void b(i iVar, LatLng latLng, LatLng latLng2) {
            this.a.lock();
            this.g.add(new e(DefaultClusterRenderer.this, iVar, latLng, latLng2, null));
            this.a.unlock();
        }

        @TargetApi(11)
        public void c(i iVar, LatLng latLng, LatLng latLng2) {
            this.a.lock();
            DefaultClusterRenderer<T>.e eVar = new e(DefaultClusterRenderer.this, iVar, latLng, latLng2, null);
            eVar.b(DefaultClusterRenderer.this.c.getMarkerManager());
            this.g.add(eVar);
            this.a.unlock();
        }

        public boolean d() {
            try {
                this.a.lock();
                return (this.c.isEmpty() && this.d.isEmpty() && this.f.isEmpty() && this.e.isEmpty() && this.g.isEmpty()) ? false : true;
            } finally {
                this.a.unlock();
            }
        }

        public void f(boolean z, Marker marker) {
            this.a.lock();
            sendEmptyMessage(0);
            if (z) {
                this.f.add(marker);
            } else {
                this.e.add(marker);
            }
            this.a.unlock();
        }

        public void h() {
            while (d()) {
                sendEmptyMessage(0);
                this.a.lock();
                try {
                    try {
                        if (d()) {
                            this.b.await();
                        }
                        this.a.unlock();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    this.a.unlock();
                    throw th;
                }
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (!this.h) {
                Looper.myQueue().addIdleHandler(this);
                this.h = true;
            }
            removeMessages(0);
            this.a.lock();
            for (int i = 0; i < 10; i++) {
                try {
                    e();
                } catch (Throwable th) {
                    this.a.unlock();
                    throw th;
                }
            }
            if (d()) {
                sendEmptyMessageDelayed(0, 10L);
            } else {
                this.h = false;
                Looper.myQueue().removeIdleHandler(this);
                this.b.signalAll();
            }
            this.a.unlock();
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        private h() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.a = reentrantLock;
            this.b = reentrantLock.newCondition();
            this.c = new LinkedList();
            this.d = new LinkedList();
            this.e = new LinkedList();
            this.f = new LinkedList();
            this.g = new LinkedList();
        }
    }

    public static class i {
        private final Marker a;
        private LatLng b;

        public /* synthetic */ i(Marker marker, a aVar) {
            this(marker);
        }

        public boolean equals(Object obj) {
            if (obj instanceof i) {
                return this.a.equals(((i) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        private i(Marker marker) {
            this.a = marker;
            this.b = marker.getPosition();
        }
    }

    public class j implements Runnable {
        public final Set<? extends Cluster<T>> a;
        private Runnable b;
        private Projection c;
        private SphericalMercatorProjection d;
        private float e;

        public /* synthetic */ j(DefaultClusterRenderer defaultClusterRenderer, Set set, a aVar) {
            this(set);
        }

        public void a(Runnable runnable) {
            this.b = runnable;
        }

        public void b(float f) {
            this.e = f;
            this.d = new SphericalMercatorProjection(Math.pow(2.0d, Math.min(f, DefaultClusterRenderer.this.m)) * 256.0d);
        }

        public void c(Projection projection) {
            this.c = projection;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public void run() {
            ArrayList arrayList;
            if (this.a.equals(DefaultClusterRenderer.this.j)) {
                this.b.run();
                return;
            }
            ArrayList arrayList2 = null;
            h hVar = new h(DefaultClusterRenderer.this, 0 == true ? 1 : 0);
            float f = this.e;
            boolean z = f > DefaultClusterRenderer.this.m;
            float f2 = f - DefaultClusterRenderer.this.m;
            Set<i> set = DefaultClusterRenderer.this.f;
            LatLngBounds latLngBounds = this.c.getVisibleRegion().latLngBounds;
            if (DefaultClusterRenderer.this.j == null || !DefaultClusterRenderer.s) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (Cluster<T> cluster : DefaultClusterRenderer.this.j) {
                    if (DefaultClusterRenderer.this.shouldRenderAsCluster(cluster) && latLngBounds.contains(cluster.getPosition())) {
                        arrayList.add(this.d.toPoint(cluster.getPosition()));
                    }
                }
            }
            Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            for (Cluster<T> cluster2 : this.a) {
                boolean zContains = latLngBounds.contains(cluster2.getPosition());
                if (z && zContains && DefaultClusterRenderer.s) {
                    Point pointT = DefaultClusterRenderer.t(arrayList, this.d.toPoint(cluster2.getPosition()));
                    if (pointT != null) {
                        hVar.a(true, new f(cluster2, setNewSetFromMap, this.d.toLatLng(pointT)));
                    } else {
                        hVar.a(true, new f(cluster2, setNewSetFromMap, null));
                    }
                } else {
                    hVar.a(zContains, new f(cluster2, setNewSetFromMap, null));
                }
            }
            hVar.h();
            set.removeAll(setNewSetFromMap);
            if (DefaultClusterRenderer.s) {
                arrayList2 = new ArrayList();
                for (Cluster<T> cluster3 : this.a) {
                    if (DefaultClusterRenderer.this.shouldRenderAsCluster(cluster3) && latLngBounds.contains(cluster3.getPosition())) {
                        arrayList2.add(this.d.toPoint(cluster3.getPosition()));
                    }
                }
            }
            for (i iVar : set) {
                boolean zContains2 = latLngBounds.contains(iVar.b);
                if (z || f2 <= -3.0f || !zContains2 || !DefaultClusterRenderer.s) {
                    hVar.f(zContains2, iVar.a);
                } else {
                    Point pointT2 = DefaultClusterRenderer.t(arrayList2, this.d.toPoint(iVar.b));
                    if (pointT2 != null) {
                        hVar.c(iVar, iVar.b, this.d.toLatLng(pointT2));
                    } else {
                        hVar.f(true, iVar.a);
                    }
                }
            }
            hVar.h();
            DefaultClusterRenderer.this.f = setNewSetFromMap;
            DefaultClusterRenderer.this.j = this.a;
            DefaultClusterRenderer.this.m = f;
            this.b.run();
        }

        private j(Set<? extends Cluster<T>> set) {
            this.a = set;
        }
    }

    static {
        s = Build.VERSION.SDK_INT >= 11;
        t = new int[]{10, 20, 50, 100, 200, 500, 1000};
        u = new DecelerateInterpolator();
    }

    public DefaultClusterRenderer(Context context, GoogleMap googleMap, ClusterManager<T> clusterManager) {
        a aVar = null;
        this.h = new g<>(aVar);
        this.n = new k(this, aVar);
        this.a = googleMap;
        this.d = context.getResources().getDisplayMetrics().density;
        IconGenerator iconGenerator = new IconGenerator(context);
        this.b = iconGenerator;
        iconGenerator.setContentView(v(context));
        iconGenerator.setTextAppearance(R.style.amu_ClusterIcon_TextAppearance);
        iconGenerator.setBackground(u());
        this.c = clusterManager;
    }

    private static double s(Point point, Point point2) {
        double d2 = point.x;
        double d3 = point2.x;
        double d4 = (d2 - d3) * (d2 - d3);
        double d5 = point.y;
        double d6 = point2.y;
        return d4 + ((d5 - d6) * (d5 - d6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Point t(List<Point> list, Point point) {
        Point point2 = null;
        if (list != null && !list.isEmpty()) {
            double d2 = 10000.0d;
            for (Point point3 : list) {
                double dS = s(point3, point);
                if (dS < d2) {
                    point2 = point3;
                    d2 = dS;
                }
            }
        }
        return point2;
    }

    private LayerDrawable u() {
        this.e = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.e});
        int i2 = (int) (this.d * 3.0f);
        layerDrawable.setLayerInset(1, i2, i2, i2, i2);
        return layerDrawable;
    }

    private SquareTextView v(Context context) {
        SquareTextView squareTextView = new SquareTextView(context);
        squareTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        squareTextView.setId(R.id.amu_text);
        int i2 = (int) (this.d * 12.0f);
        squareTextView.setPadding(i2, i2, i2, i2);
        return squareTextView;
    }

    public int getBucket(Cluster<T> cluster) {
        int size = cluster.getSize();
        int i2 = 0;
        if (size <= t[0]) {
            return size;
        }
        while (true) {
            int[] iArr = t;
            if (i2 >= iArr.length - 1) {
                return iArr[iArr.length - 1];
            }
            int i3 = i2 + 1;
            if (size < iArr[i3]) {
                return iArr[i2];
            }
            i2 = i3;
        }
    }

    public Cluster<T> getCluster(Marker marker) {
        return this.k.get(marker);
    }

    public T getClusterItem(Marker marker) {
        return this.h.b(marker);
    }

    public String getClusterText(int i2) {
        if (i2 < t[0]) {
            return String.valueOf(i2);
        }
        return String.valueOf(i2) + "+";
    }

    public int getColor(int i2) {
        float fMin = 300.0f - Math.min(i2, 300.0f);
        return Color.HSVToColor(new float[]{((fMin * fMin) / 90000.0f) * 220.0f, 1.0f, 0.6f});
    }

    public Marker getMarker(T t2) {
        return this.h.a(t2);
    }

    public int getMinClusterSize() {
        return this.i;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onAdd() {
        this.c.getMarkerCollection().setOnMarkerClickListener(new a());
        this.c.getMarkerCollection().setOnInfoWindowClickListener(new b());
        this.c.getClusterMarkerCollection().setOnMarkerClickListener(new c());
        this.c.getClusterMarkerCollection().setOnInfoWindowClickListener(new d());
    }

    public void onBeforeClusterItemRendered(T t2, MarkerOptions markerOptions) {
    }

    public void onBeforeClusterRendered(Cluster<T> cluster, MarkerOptions markerOptions) {
        int bucket = getBucket(cluster);
        BitmapDescriptor bitmapDescriptorFromBitmap = this.g.get(bucket);
        if (bitmapDescriptorFromBitmap == null) {
            this.e.getPaint().setColor(getColor(bucket));
            bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(this.b.makeIcon(getClusterText(bucket)));
            this.g.put(bucket, bitmapDescriptorFromBitmap);
        }
        markerOptions.icon(bitmapDescriptorFromBitmap);
    }

    public void onClusterItemRendered(T t2, Marker marker) {
    }

    public void onClusterRendered(Cluster<T> cluster, Marker marker) {
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onClustersChanged(Set<? extends Cluster<T>> set) {
        this.n.a(set);
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onRemove() {
        this.c.getMarkerCollection().setOnMarkerClickListener(null);
        this.c.getClusterMarkerCollection().setOnMarkerClickListener(null);
    }

    public void setMinClusterSize(int i2) {
        this.i = i2;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterClickListener(ClusterManager.OnClusterClickListener<T> onClusterClickListener) {
        this.o = onClusterClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterInfoWindowClickListener(ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener) {
        this.p = onClusterInfoWindowClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemClickListener(ClusterManager.OnClusterItemClickListener<T> onClusterItemClickListener) {
        this.q = onClusterItemClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemInfoWindowClickListener(ClusterManager.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener) {
        this.r = onClusterItemInfoWindowClickListener;
    }

    public boolean shouldRenderAsCluster(Cluster<T> cluster) {
        return cluster.getSize() > this.i;
    }

    public Marker getMarker(Cluster<T> cluster) {
        return this.l.get(cluster);
    }

    public static class g<T> {
        private Map<T, Marker> a;
        private Map<Marker, T> b;

        private g() {
            this.a = new HashMap();
            this.b = new HashMap();
        }

        public Marker a(T t) {
            return this.a.get(t);
        }

        public T b(Marker marker) {
            return this.b.get(marker);
        }

        public void c(T t, Marker marker) {
            this.a.put(t, marker);
            this.b.put(marker, t);
        }

        public void d(Marker marker) {
            T t = this.b.get(marker);
            this.b.remove(marker);
            this.a.remove(t);
        }

        public /* synthetic */ g(a aVar) {
            this();
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class k extends Handler {
        private static final int d = 0;
        private static final int e = 1;
        private boolean a;
        private DefaultClusterRenderer<T>.j b;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.sendEmptyMessage(1);
            }
        }

        private k() {
            this.a = false;
            this.b = null;
        }

        public void a(Set<? extends Cluster<T>> set) {
            synchronized (this) {
                this.b = new j(DefaultClusterRenderer.this, set, null);
            }
            sendEmptyMessage(0);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Projection projection;
            DefaultClusterRenderer<T>.j jVar;
            if (message.what == 1) {
                this.a = false;
                if (this.b != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (this.a || this.b == null || (projection = DefaultClusterRenderer.this.a.getProjection()) == null) {
                return;
            }
            synchronized (this) {
                jVar = this.b;
                this.b = null;
                this.a = true;
            }
            jVar.a(new a());
            jVar.c(projection);
            jVar.b(DefaultClusterRenderer.this.a.getCameraPosition().zoom);
            new Thread(jVar).start();
        }

        public /* synthetic */ k(DefaultClusterRenderer defaultClusterRenderer, a aVar) {
            this();
        }
    }
}
