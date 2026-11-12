package com.google.maps.android.clustering.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.view.j;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.R;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.ui.IconGenerator;
import com.google.maps.android.ui.SquareTextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public class ClusterRendererMultipleItems<T extends ClusterItem> implements ClusterRenderer<T> {
    private ClusterManager.OnClusterClickListener<T> mClickListener;
    private final ClusterManager<T> mClusterManager;
    private final MarkerCache<Cluster<T>> mClusterMarkerCache;
    private Set<? extends Cluster<T>> mClusters;
    private ShapeDrawable mColoredCircleBackground;
    private final float mDensity;
    private final IconGenerator mIconGenerator;
    private ClusterManager.OnClusterInfoWindowClickListener<T> mInfoWindowClickListener;
    private ClusterManager.OnClusterInfoWindowLongClickListener<T> mInfoWindowLongClickListener;
    private ClusterManager.OnClusterItemClickListener<T> mItemClickListener;
    private ClusterManager.OnClusterItemInfoWindowClickListener<T> mItemInfoWindowClickListener;
    private ClusterManager.OnClusterItemInfoWindowLongClickListener<T> mItemInfoWindowLongClickListener;
    private final GoogleMap mMap;
    private final MarkerCache<T> mMarkerCache;
    private float mZoom;
    private static TimeInterpolator animationInterp = new DecelerateInterpolator();
    private static final int[] BUCKETS = {10, 20, 50, 100, 200, 500, 1000};
    private final Executor mExecutor = Executors.newSingleThreadExecutor();
    private final Queue<ClusterRendererMultipleItems<T>.AnimationTask> ongoingAnimations = new LinkedList();
    private Set<MarkerWithPosition> mMarkers = Collections.newSetFromMap(new ConcurrentHashMap());
    private final SparseArray<BitmapDescriptor> mIcons = new SparseArray<>();
    private int mMinClusterSize = 2;
    private final ClusterRendererMultipleItems<T>.ViewModifier mViewModifier = new ViewModifier(Looper.getMainLooper());
    private boolean mAnimate = true;
    private long mAnimationDurationMs = 300;

    /* JADX INFO: renamed from: com.google.maps.android.clustering.view.ClusterRendererMultipleItems$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType;

        static {
            int[] iArr = new int[AnimationType.values().length];
            $SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType = iArr;
            try {
                iArr[AnimationType.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType[AnimationType.EASE_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType[AnimationType.EASE_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType[AnimationType.EASE_IN_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType[AnimationType.FAST_OUT_SLOW_IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType[AnimationType.BOUNCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType[AnimationType.ACCELERATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType[AnimationType.DECELERATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum AnimationType {
        LINEAR,
        EASE_IN,
        EASE_OUT,
        EASE_IN_OUT,
        FAST_OUT_SLOW_IN,
        BOUNCE,
        ACCELERATE,
        DECELERATE
    }

    public class CreateMarkerTask {
        private final LatLng animateFrom;
        private final Cluster<T> cluster;
        private final Set<MarkerWithPosition> newMarkers;

        public CreateMarkerTask(Cluster<T> cluster, Set<MarkerWithPosition> set, LatLng latLng) {
            this.cluster = cluster;
            this.newMarkers = set;
            this.animateFrom = latLng;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void perform(ClusterRendererMultipleItems<T>.MarkerModifier markerModifier) {
            MarkerWithPosition markerWithPosition;
            MarkerWithPosition markerWithPosition2;
            ClusterItem clusterItem = null;
            if (ClusterRendererMultipleItems.this.shouldRenderAsCluster(this.cluster)) {
                Marker markerAddMarker = ClusterRendererMultipleItems.this.mClusterMarkerCache.get(this.cluster);
                if (markerAddMarker == null) {
                    MarkerOptions markerOptions = new MarkerOptions();
                    LatLng position = this.animateFrom;
                    if (position == null) {
                        position = this.cluster.getPosition();
                    }
                    MarkerOptions markerOptionsPosition = markerOptions.position(position);
                    ClusterRendererMultipleItems.this.onBeforeClusterRendered(this.cluster, markerOptionsPosition);
                    markerAddMarker = ClusterRendererMultipleItems.this.mClusterManager.getClusterMarkerCollection().addMarker(markerOptionsPosition);
                    ClusterRendererMultipleItems.this.mClusterMarkerCache.put(this.cluster, markerAddMarker);
                    markerWithPosition = new MarkerWithPosition(clusterItem, markerAddMarker);
                    LatLng latLng = this.animateFrom;
                    if (latLng != null) {
                        markerModifier.animate(markerWithPosition, latLng, this.cluster.getPosition());
                    }
                } else {
                    markerWithPosition = new MarkerWithPosition(clusterItem, markerAddMarker);
                    ClusterRendererMultipleItems.this.onClusterUpdated(this.cluster, markerAddMarker);
                }
                ClusterRendererMultipleItems.this.onClusterRendered(this.cluster, markerAddMarker);
                this.newMarkers.add(markerWithPosition);
                return;
            }
            for (T t7 : this.cluster.getItems()) {
                Marker markerAddMarker2 = ClusterRendererMultipleItems.this.mMarkerCache.get(t7);
                LatLng latLngMo335getPosition = t7.mo335getPosition();
                if (markerAddMarker2 == null) {
                    MarkerOptions markerOptions2 = new MarkerOptions();
                    LatLng latLng2 = this.animateFrom;
                    if (latLng2 != null) {
                        markerOptions2.position(latLng2);
                    } else if (ClusterRendererMultipleItems.this.mClusterMarkerCache.mCache.keySet().iterator().hasNext() && ((Cluster) ClusterRendererMultipleItems.this.mClusterMarkerCache.mCache.keySet().iterator().next()).getItems().contains(t7)) {
                        Iterator it = ClusterRendererMultipleItems.this.mClusterMarkerCache.mCache.keySet().iterator();
                        T t14 = null;
                        while (it.hasNext()) {
                            for (T t15 : ((Cluster) it.next()).getItems()) {
                                if (t15.equals(t7)) {
                                    t14 = t15;
                                    break;
                                }
                            }
                        }
                        latLngMo335getPosition = t14.mo335getPosition();
                        markerOptions2.position(latLngMo335getPosition);
                    } else {
                        markerOptions2.position(t7.mo335getPosition());
                        if (t7.mo336getZIndex() != null) {
                            markerOptions2.zIndex(t7.mo336getZIndex().floatValue());
                        }
                    }
                    ClusterRendererMultipleItems.this.onBeforeClusterItemRendered(t7, markerOptions2);
                    markerAddMarker2 = ClusterRendererMultipleItems.this.mClusterManager.getMarkerCollection().addMarker(markerOptions2);
                    markerWithPosition2 = new MarkerWithPosition(t7, markerAddMarker2);
                    ClusterRendererMultipleItems.this.mMarkerCache.put(t7, markerAddMarker2);
                    LatLng latLng3 = this.animateFrom;
                    if (latLng3 != null) {
                        markerModifier.animate(markerWithPosition2, latLng3, t7.mo335getPosition());
                    } else if (latLngMo335getPosition != null) {
                        markerModifier.animate(markerWithPosition2, latLngMo335getPosition, t7.mo335getPosition());
                    }
                } else {
                    markerWithPosition2 = new MarkerWithPosition(t7, markerAddMarker2);
                    markerModifier.animate(markerWithPosition2, markerAddMarker2.getPosition(), t7.mo335getPosition());
                    if (!markerWithPosition2.position.equals(t7.mo335getPosition())) {
                        ClusterRendererMultipleItems.this.onClusterItemUpdated(t7, markerAddMarker2);
                    }
                }
                ClusterRendererMultipleItems.this.onClusterItemRendered(t7, markerAddMarker2);
                this.newMarkers.add(markerWithPosition2);
            }
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class ViewModifier extends Handler {
        private static final int RUN_TASK = 0;
        private static final int TASK_FINISHED = 1;
        private ClusterRendererMultipleItems<T>.RenderTask mNextClusters;
        private boolean mViewModificationInProgress;

        public ViewModifier(Looper looper) {
            super(looper);
            this.mViewModificationInProgress = false;
            this.mNextClusters = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleMessage$0() {
            sendEmptyMessage(1);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ClusterRendererMultipleItems<T>.RenderTask renderTask;
            if (message.what == 1) {
                this.mViewModificationInProgress = false;
                if (this.mNextClusters != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (this.mViewModificationInProgress || this.mNextClusters == null) {
                return;
            }
            Projection projection = ClusterRendererMultipleItems.this.mMap.getProjection();
            synchronized (this) {
                renderTask = this.mNextClusters;
                this.mNextClusters = null;
                this.mViewModificationInProgress = true;
            }
            renderTask.setCallback(new b(this, 1));
            renderTask.setProjection(projection);
            renderTask.setMapZoom(ClusterRendererMultipleItems.this.mMap.getCameraPosition().zoom);
            ClusterRendererMultipleItems.this.mExecutor.execute(renderTask);
        }

        public void queue(Set<? extends Cluster<T>> set) {
            synchronized (this) {
                this.mNextClusters = new RenderTask(ClusterRendererMultipleItems.this, set, 0);
            }
            sendEmptyMessage(0);
        }
    }

    public ClusterRendererMultipleItems(Context context, GoogleMap googleMap, ClusterManager<T> clusterManager) {
        int i14 = 0;
        this.mMarkerCache = new MarkerCache<>(i14);
        this.mClusterMarkerCache = new MarkerCache<>(i14);
        this.mMap = googleMap;
        this.mDensity = context.getResources().getDisplayMetrics().density;
        IconGenerator iconGenerator = new IconGenerator(context);
        this.mIconGenerator = iconGenerator;
        iconGenerator.setContentView(makeSquareTextView(context));
        iconGenerator.setTextAppearance(R.style.amu_ClusterIcon_TextAppearance);
        iconGenerator.setBackground(makeClusterBackground());
        this.mClusterManager = clusterManager;
    }

    private static double distanceSquared(Point point, Point point2) {
        double d14 = point.f54320x;
        double d15 = point2.f54320x;
        double d16 = d14 - d15;
        double d17 = point.f54321y;
        double d18 = point2.f54321y;
        return o2.c.b(d17, d18, d17 - d18, (d14 - d15) * d16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Point findClosestCluster(List<Point> list, Point point) {
        Point point2 = null;
        if (list != null && !list.isEmpty()) {
            int maxDistanceBetweenClusteredItems = this.mClusterManager.getAlgorithm().getMaxDistanceBetweenClusteredItems();
            double d14 = maxDistanceBetweenClusteredItems * maxDistanceBetweenClusteredItems;
            for (Point point3 : list) {
                double dDistanceSquared = distanceSquared(point3, point);
                if (dDistanceSquared < d14) {
                    point2 = point3;
                    d14 = dDistanceSquared;
                }
            }
        }
        return point2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onAdd$0(Marker marker) {
        ClusterManager.OnClusterItemClickListener<T> onClusterItemClickListener = this.mItemClickListener;
        return onClusterItemClickListener != null && onClusterItemClickListener.onClusterItemClick(this.mMarkerCache.get(marker));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdd$1(Marker marker) {
        ClusterManager.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener = this.mItemInfoWindowClickListener;
        if (onClusterItemInfoWindowClickListener != null) {
            onClusterItemInfoWindowClickListener.onClusterItemInfoWindowClick(this.mMarkerCache.get(marker));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdd$2(Marker marker) {
        ClusterManager.OnClusterItemInfoWindowLongClickListener<T> onClusterItemInfoWindowLongClickListener = this.mItemInfoWindowLongClickListener;
        if (onClusterItemInfoWindowLongClickListener != null) {
            onClusterItemInfoWindowLongClickListener.onClusterItemInfoWindowLongClick(this.mMarkerCache.get(marker));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onAdd$3(Marker marker) {
        ClusterManager.OnClusterClickListener<T> onClusterClickListener = this.mClickListener;
        return onClusterClickListener != null && onClusterClickListener.onClusterClick(this.mClusterMarkerCache.get(marker));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdd$4(Marker marker) {
        ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener = this.mInfoWindowClickListener;
        if (onClusterInfoWindowClickListener != null) {
            onClusterInfoWindowClickListener.onClusterInfoWindowClick(this.mClusterMarkerCache.get(marker));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdd$5(Marker marker) {
        ClusterManager.OnClusterInfoWindowLongClickListener<T> onClusterInfoWindowLongClickListener = this.mInfoWindowLongClickListener;
        if (onClusterInfoWindowLongClickListener != null) {
            onClusterInfoWindowLongClickListener.onClusterInfoWindowLongClick(this.mClusterMarkerCache.get(marker));
        }
    }

    private LayerDrawable makeClusterBackground() {
        this.mColoredCircleBackground = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.mColoredCircleBackground});
        int i14 = (int) (this.mDensity * 3.0f);
        layerDrawable.setLayerInset(1, i14, i14, i14, i14);
        return layerDrawable;
    }

    private SquareTextView makeSquareTextView(Context context) {
        SquareTextView squareTextView = new SquareTextView(context);
        squareTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        squareTextView.setId(R.id.amu_text);
        int i14 = (int) (this.mDensity * 12.0f);
        squareTextView.setPadding(i14, i14, i14, i14);
        return squareTextView;
    }

    public int getBucket(Cluster<T> cluster) {
        int size = cluster.getSize();
        int i14 = 0;
        if (size <= BUCKETS[0]) {
            return size;
        }
        while (true) {
            int[] iArr = BUCKETS;
            if (i14 >= iArr.length - 1) {
                return iArr[iArr.length - 1];
            }
            int i15 = i14 + 1;
            if (size < iArr[i15]) {
                return iArr[i14];
            }
            i14 = i15;
        }
    }

    public Cluster<T> getCluster(Marker marker) {
        return this.mClusterMarkerCache.get(marker);
    }

    public T getClusterItem(Marker marker) {
        return this.mMarkerCache.get(marker);
    }

    public String getClusterText(int i14) {
        return i14 < BUCKETS[0] ? String.valueOf(i14) : j.f(i14, org.slf4j.Marker.ANY_NON_NULL_MARKER);
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public int getClusterTextAppearance(int i14) {
        return R.style.amu_ClusterIcon_TextAppearance;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public int getColor(int i14) {
        float fMin = 300.0f - Math.min(i14, 300.0f);
        return Color.HSVToColor(new float[]{((fMin * fMin) / 90000.0f) * 220.0f, 1.0f, 0.6f});
    }

    public BitmapDescriptor getDescriptorForCluster(Cluster<T> cluster) {
        int bucket = getBucket(cluster);
        BitmapDescriptor bitmapDescriptor = this.mIcons.get(bucket);
        if (bitmapDescriptor != null) {
            return bitmapDescriptor;
        }
        this.mColoredCircleBackground.getPaint().setColor(getColor(bucket));
        this.mIconGenerator.setTextAppearance(getClusterTextAppearance(bucket));
        BitmapDescriptor bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(this.mIconGenerator.makeIcon(getClusterText(bucket)));
        this.mIcons.put(bucket, bitmapDescriptorFromBitmap);
        return bitmapDescriptorFromBitmap;
    }

    public Marker getMarker(T t7) {
        return this.mMarkerCache.get(t7);
    }

    public int getMinClusterSize() {
        return this.mMinClusterSize;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onAdd() {
        this.mClusterManager.getMarkerCollection().setOnMarkerClickListener(new a(this, 0));
        this.mClusterManager.getMarkerCollection().setOnInfoWindowClickListener(new a(this, 1));
        this.mClusterManager.getMarkerCollection().setOnInfoWindowLongClickListener(new a(this, 2));
        this.mClusterManager.getClusterMarkerCollection().setOnMarkerClickListener(new a(this, 3));
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowClickListener(new a(this, 4));
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowLongClickListener(new a(this, 5));
    }

    public void onBeforeClusterItemRendered(T t7, MarkerOptions markerOptions) {
        if (t7.getTitle() != null && t7.getSnippet() != null) {
            markerOptions.title(t7.getTitle());
            markerOptions.snippet(t7.getSnippet());
        } else if (t7.getTitle() != null) {
            markerOptions.title(t7.getTitle());
        } else if (t7.getSnippet() != null) {
            markerOptions.title(t7.getSnippet());
        }
    }

    public void onBeforeClusterRendered(Cluster<T> cluster, MarkerOptions markerOptions) {
        markerOptions.icon(getDescriptorForCluster(cluster));
    }

    public void onClusterItemRendered(T t7, Marker marker) {
    }

    public void onClusterItemUpdated(T t7, Marker marker) {
        boolean z14 = true;
        boolean z15 = false;
        if (t7.getTitle() == null || t7.getSnippet() == null) {
            if (t7.getSnippet() != null && !t7.getSnippet().equals(marker.getTitle())) {
                marker.setTitle(t7.getSnippet());
            } else if (t7.getTitle() != null && !t7.getTitle().equals(marker.getTitle())) {
                marker.setTitle(t7.getTitle());
            }
            z15 = true;
        } else {
            if (!t7.getTitle().equals(marker.getTitle())) {
                marker.setTitle(t7.getTitle());
                z15 = true;
            }
            if (!t7.getSnippet().equals(marker.getSnippet())) {
                marker.setSnippet(t7.getSnippet());
                z15 = true;
            }
        }
        if (marker.getPosition().equals(t7.mo335getPosition())) {
            z14 = z15;
        } else {
            marker.setPosition(t7.mo335getPosition());
            if (t7.mo336getZIndex() != null) {
                marker.setZIndex(t7.mo336getZIndex().floatValue());
            }
        }
        if (z14 && marker.isInfoWindowShown()) {
            marker.showInfoWindow();
        }
    }

    public void onClusterRendered(Cluster<T> cluster, Marker marker) {
    }

    public void onClusterUpdated(Cluster<T> cluster, Marker marker) {
        marker.setIcon(getDescriptorForCluster(cluster));
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onClustersChanged(Set<? extends Cluster<T>> set) {
        this.mViewModifier.queue(set);
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onRemove() {
        this.mClusterManager.getMarkerCollection().setOnMarkerClickListener(null);
        this.mClusterManager.getMarkerCollection().setOnInfoWindowClickListener(null);
        this.mClusterManager.getMarkerCollection().setOnInfoWindowLongClickListener(null);
        this.mClusterManager.getClusterMarkerCollection().setOnMarkerClickListener(null);
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowClickListener(null);
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowLongClickListener(null);
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setAnimation(boolean z14) {
        this.mAnimate = z14;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setAnimationDuration(long j8) {
        this.mAnimationDurationMs = j8;
    }

    public void setAnimationType(AnimationType animationType) {
        switch (AnonymousClass1.$SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType[animationType.ordinal()]) {
            case 1:
                animationInterp = new LinearInterpolator();
                break;
            case 2:
                animationInterp = new AccelerateInterpolator();
                break;
            case 3:
                animationInterp = new DecelerateInterpolator();
                break;
            case 4:
                animationInterp = new AccelerateDecelerateInterpolator();
                break;
            case 5:
                animationInterp = new q9.b();
                break;
            case 6:
                animationInterp = new BounceInterpolator();
                break;
            case 7:
                animationInterp = new AccelerateInterpolator();
                break;
            case 8:
                animationInterp = new DecelerateInterpolator();
                break;
            default:
                animationInterp = new LinearInterpolator();
                break;
        }
    }

    public void setMinClusterSize(int i14) {
        this.mMinClusterSize = i14;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterClickListener(ClusterManager.OnClusterClickListener<T> onClusterClickListener) {
        this.mClickListener = onClusterClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterInfoWindowClickListener(ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener) {
        this.mInfoWindowClickListener = onClusterInfoWindowClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterInfoWindowLongClickListener(ClusterManager.OnClusterInfoWindowLongClickListener<T> onClusterInfoWindowLongClickListener) {
        this.mInfoWindowLongClickListener = onClusterInfoWindowLongClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemClickListener(ClusterManager.OnClusterItemClickListener<T> onClusterItemClickListener) {
        this.mItemClickListener = onClusterItemClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemInfoWindowClickListener(ClusterManager.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener) {
        this.mItemInfoWindowClickListener = onClusterItemInfoWindowClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemInfoWindowLongClickListener(ClusterManager.OnClusterItemInfoWindowLongClickListener<T> onClusterItemInfoWindowLongClickListener) {
        this.mItemInfoWindowLongClickListener = onClusterItemInfoWindowLongClickListener;
    }

    public boolean shouldRenderAsCluster(Cluster<T> cluster) {
        return cluster.getSize() >= this.mMinClusterSize;
    }

    public void stopAnimation() {
        Iterator<ClusterRendererMultipleItems<T>.AnimationTask> it = this.ongoingAnimations.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    public class RenderTask implements Runnable {
        final Set<? extends Cluster<T>> clusters;
        private Runnable mCallback;
        private float mMapZoom;
        private Projection mProjection;
        private SphericalMercatorProjection mSphericalMercatorProjection;

        private RenderTask(Set<? extends Cluster<T>> set) {
            this.clusters = set;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public void run() {
            LatLngBounds latLngBoundsBuild;
            ArrayList arrayList;
            ArrayList arrayList2;
            MarkerModifier markerModifier = new MarkerModifier(ClusterRendererMultipleItems.this, 0);
            float f14 = this.mMapZoom;
            Set<MarkerWithPosition> set = ClusterRendererMultipleItems.this.mMarkers;
            try {
                latLngBoundsBuild = this.mProjection.getVisibleRegion().latLngBounds;
            } catch (Exception e4) {
                e4.printStackTrace();
                latLngBoundsBuild = LatLngBounds.builder().include(new LatLng(0.0d, 0.0d)).build();
            }
            if (ClusterRendererMultipleItems.this.mClusters == null || !ClusterRendererMultipleItems.this.mAnimate) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (Cluster<T> cluster : ClusterRendererMultipleItems.this.mClusters) {
                    if (ClusterRendererMultipleItems.this.shouldRenderAsCluster(cluster) && latLngBoundsBuild.contains(cluster.getPosition())) {
                        arrayList.add(this.mSphericalMercatorProjection.toPoint(cluster.getPosition()));
                    }
                }
            }
            Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            for (Cluster<T> cluster2 : this.clusters) {
                boolean zContains = latLngBoundsBuild.contains(cluster2.getPosition());
                if (ClusterRendererMultipleItems.this.mAnimate) {
                    Point pointFindClosestCluster = ClusterRendererMultipleItems.this.findClosestCluster(arrayList, this.mSphericalMercatorProjection.toPoint(cluster2.getPosition()));
                    if (pointFindClosestCluster != null) {
                        markerModifier.add(true, new CreateMarkerTask(cluster2, setNewSetFromMap, this.mSphericalMercatorProjection.toLatLng(pointFindClosestCluster)));
                    } else {
                        markerModifier.add(true, new CreateMarkerTask(cluster2, setNewSetFromMap, null));
                    }
                } else {
                    markerModifier.add(zContains, new CreateMarkerTask(cluster2, setNewSetFromMap, null));
                }
            }
            markerModifier.waitUntilFree();
            set.removeAll(setNewSetFromMap);
            if (ClusterRendererMultipleItems.this.mAnimate) {
                arrayList2 = new ArrayList();
                for (Cluster<T> cluster3 : this.clusters) {
                    if (ClusterRendererMultipleItems.this.shouldRenderAsCluster(cluster3) && latLngBoundsBuild.contains(cluster3.getPosition())) {
                        arrayList2.add(this.mSphericalMercatorProjection.toPoint(cluster3.getPosition()));
                    }
                }
            } else {
                arrayList2 = null;
            }
            for (MarkerWithPosition markerWithPosition : set) {
                boolean zContains2 = latLngBoundsBuild.contains(markerWithPosition.position);
                if (zContains2 && ClusterRendererMultipleItems.this.mAnimate) {
                    Point pointFindClosestCluster2 = ClusterRendererMultipleItems.this.findClosestCluster(arrayList2, this.mSphericalMercatorProjection.toPoint(markerWithPosition.position));
                    if (pointFindClosestCluster2 != null) {
                        markerModifier.animateThenRemove(markerWithPosition, markerWithPosition.position, this.mSphericalMercatorProjection.toLatLng(pointFindClosestCluster2));
                    } else if (ClusterRendererMultipleItems.this.mClusterMarkerCache.mCache.keySet().iterator().hasNext() && ((Cluster) ClusterRendererMultipleItems.this.mClusterMarkerCache.mCache.keySet().iterator().next()).getItems().contains(markerWithPosition.clusterItem)) {
                        Iterator it = ClusterRendererMultipleItems.this.mClusterMarkerCache.mCache.keySet().iterator();
                        T t7 = null;
                        while (it.hasNext()) {
                            for (T t14 : ((Cluster) it.next()).getItems()) {
                                if (t14.equals(markerWithPosition.clusterItem)) {
                                    t7 = t14;
                                    break;
                                }
                            }
                        }
                        markerModifier.animateThenRemove(markerWithPosition, markerWithPosition.position, t7.mo335getPosition());
                    } else {
                        markerModifier.remove(true, markerWithPosition.marker);
                    }
                } else {
                    markerModifier.remove(zContains2, markerWithPosition.marker);
                }
            }
            markerModifier.waitUntilFree();
            ClusterRendererMultipleItems.this.mMarkers = setNewSetFromMap;
            ClusterRendererMultipleItems.this.mClusters = this.clusters;
            ClusterRendererMultipleItems.this.mZoom = f14;
            this.mCallback.run();
        }

        public void setCallback(Runnable runnable) {
            this.mCallback = runnable;
        }

        public void setMapZoom(float f14) {
            this.mMapZoom = f14;
            this.mSphericalMercatorProjection = new SphericalMercatorProjection(Math.pow(2.0d, Math.min(f14, ClusterRendererMultipleItems.this.mZoom)) * 256.0d);
        }

        public void setProjection(Projection projection) {
            this.mProjection = projection;
        }

        public /* synthetic */ RenderTask(ClusterRendererMultipleItems clusterRendererMultipleItems, Set set, int i14) {
            this(set);
        }
    }

    public Marker getMarker(Cluster<T> cluster) {
        return this.mClusterMarkerCache.get(cluster);
    }

    public static class MarkerCache<T> {
        private final Map<T, Marker> mCache;
        private final Map<Marker, T> mCacheReverse;

        private MarkerCache() {
            this.mCache = new HashMap();
            this.mCacheReverse = new HashMap();
        }

        public Marker get(T t7) {
            return this.mCache.get(t7);
        }

        public void put(T t7, Marker marker) {
            this.mCache.put(t7, marker);
            this.mCacheReverse.put(marker, t7);
        }

        public void remove(Marker marker) {
            T t7 = this.mCacheReverse.get(marker);
            this.mCacheReverse.remove(marker);
            this.mCache.remove(t7);
        }

        public T get(Marker marker) {
            return this.mCacheReverse.get(marker);
        }

        public /* synthetic */ MarkerCache(int i14) {
            this();
        }
    }

    public static class MarkerWithPosition<T> {
        private final T clusterItem;
        private final Marker marker;
        private LatLng position;

        private MarkerWithPosition(Marker marker, T t7) {
            this.marker = marker;
            this.clusterItem = t7;
            this.position = marker.getPosition();
        }

        public boolean equals(Object obj) {
            if (obj instanceof MarkerWithPosition) {
                return this.marker.equals(((MarkerWithPosition) obj).marker);
            }
            return false;
        }

        public int hashCode() {
            return this.marker.hashCode();
        }

        public /* synthetic */ MarkerWithPosition(ClusterItem clusterItem, Marker marker) {
            this(marker, clusterItem);
        }
    }

    public class AnimationTask extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private final LatLng from;
        private final Lock lock;
        private MarkerManager mMarkerManager;
        private boolean mRemoveOnComplete;
        private final Marker marker;
        private final MarkerWithPosition markerWithPosition;

        /* JADX INFO: renamed from: to, reason: collision with root package name */
        private final LatLng f53853to;
        private ValueAnimator valueAnimator;

        private AnimationTask(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2, Lock lock) {
            this.markerWithPosition = markerWithPosition;
            this.marker = markerWithPosition.marker;
            this.from = latLng;
            this.f53853to = latLng2;
            this.lock = lock;
        }

        public void cancel() {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new b(this, 0));
                return;
            }
            try {
                this.markerWithPosition.position = this.f53853to;
                this.mRemoveOnComplete = false;
                this.valueAnimator.cancel();
                this.lock.lock();
                ClusterRendererMultipleItems.this.ongoingAnimations.remove(this);
            } finally {
                this.lock.unlock();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.mRemoveOnComplete) {
                ClusterRendererMultipleItems.this.mMarkerCache.remove(this.marker);
                ClusterRendererMultipleItems.this.mClusterMarkerCache.remove(this.marker);
                this.mMarkerManager.remove(this.marker);
            }
            this.markerWithPosition.position = this.f53853to;
            this.lock.lock();
            ClusterRendererMultipleItems.this.ongoingAnimations.remove(this);
            this.lock.unlock();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.f53853to == null || this.from == null || this.marker == null) {
                return;
            }
            float animatedFraction = valueAnimator.getAnimatedFraction();
            LatLng latLng = this.f53853to;
            double d14 = latLng.latitude;
            LatLng latLng2 = this.from;
            double d15 = latLng2.latitude;
            double d16 = animatedFraction;
            double d17 = ((d14 - d15) * d16) + d15;
            double dSignum = latLng.longitude - latLng2.longitude;
            if (Math.abs(dSignum) > 180.0d) {
                dSignum -= Math.signum(dSignum) * 360.0d;
            }
            LatLng latLng3 = new LatLng(d17, (dSignum * d16) + this.from.longitude);
            this.marker.setPosition(latLng3);
            this.markerWithPosition.position = latLng3;
        }

        public void perform() {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.valueAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setInterpolator(ClusterRendererMultipleItems.animationInterp);
            this.valueAnimator.setDuration(ClusterRendererMultipleItems.this.mAnimationDurationMs);
            this.valueAnimator.addUpdateListener(this);
            this.valueAnimator.addListener(this);
            this.valueAnimator.start();
        }

        public void removeOnAnimationComplete(MarkerManager markerManager) {
            this.mMarkerManager = markerManager;
            this.mRemoveOnComplete = true;
        }

        public /* synthetic */ AnimationTask(ClusterRendererMultipleItems clusterRendererMultipleItems, MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2, Lock lock, int i14) {
            this(markerWithPosition, latLng, latLng2, lock);
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class MarkerModifier extends Handler implements MessageQueue.IdleHandler {
        private static final int BLANK = 0;
        private final Condition busyCondition;
        private final Lock lock;
        private final Queue<ClusterRendererMultipleItems<T>.AnimationTask> mAnimationTasks;
        private final Queue<ClusterRendererMultipleItems<T>.CreateMarkerTask> mCreateMarkerTasks;
        private boolean mListenerAdded;
        private final Queue<ClusterRendererMultipleItems<T>.CreateMarkerTask> mOnScreenCreateMarkerTasks;
        private final Queue<Marker> mOnScreenRemoveMarkerTasks;
        private final Queue<Marker> mRemoveMarkerTasks;

        private MarkerModifier() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.lock = reentrantLock;
            this.busyCondition = reentrantLock.newCondition();
            this.mCreateMarkerTasks = new LinkedList();
            this.mOnScreenCreateMarkerTasks = new LinkedList();
            this.mRemoveMarkerTasks = new LinkedList();
            this.mOnScreenRemoveMarkerTasks = new LinkedList();
            this.mAnimationTasks = new LinkedList();
        }

        private void performNextTask() {
            if (!this.mOnScreenRemoveMarkerTasks.isEmpty()) {
                removeMarker(this.mOnScreenRemoveMarkerTasks.poll());
                return;
            }
            if (!this.mAnimationTasks.isEmpty()) {
                ClusterRendererMultipleItems<T>.AnimationTask animationTaskPoll = this.mAnimationTasks.poll();
                Objects.requireNonNull(animationTaskPoll);
                animationTaskPoll.perform();
            } else if (!this.mOnScreenCreateMarkerTasks.isEmpty()) {
                ClusterRendererMultipleItems<T>.CreateMarkerTask createMarkerTaskPoll = this.mOnScreenCreateMarkerTasks.poll();
                Objects.requireNonNull(createMarkerTaskPoll);
                createMarkerTaskPoll.perform(this);
            } else if (this.mCreateMarkerTasks.isEmpty()) {
                if (this.mRemoveMarkerTasks.isEmpty()) {
                    return;
                }
                removeMarker(this.mRemoveMarkerTasks.poll());
            } else {
                ClusterRendererMultipleItems<T>.CreateMarkerTask createMarkerTaskPoll2 = this.mCreateMarkerTasks.poll();
                Objects.requireNonNull(createMarkerTaskPoll2);
                createMarkerTaskPoll2.perform(this);
            }
        }

        private void removeMarker(Marker marker) {
            ClusterRendererMultipleItems.this.mMarkerCache.remove(marker);
            ClusterRendererMultipleItems.this.mClusterMarkerCache.remove(marker);
            ClusterRendererMultipleItems.this.mClusterManager.getMarkerManager().remove(marker);
        }

        public void add(boolean z14, ClusterRendererMultipleItems<T>.CreateMarkerTask createMarkerTask) {
            this.lock.lock();
            sendEmptyMessage(0);
            if (z14) {
                this.mOnScreenCreateMarkerTasks.add(createMarkerTask);
            } else {
                this.mCreateMarkerTasks.add(createMarkerTask);
            }
            this.lock.unlock();
        }

        public void animate(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.lock.lock();
            ClusterRendererMultipleItems<T>.AnimationTask animationTask = new AnimationTask(ClusterRendererMultipleItems.this, markerWithPosition, latLng, latLng2, this.lock, 0);
            for (AnimationTask animationTask2 : ClusterRendererMultipleItems.this.ongoingAnimations) {
                if (animationTask2.marker.getId().equals(((AnimationTask) animationTask).marker.getId())) {
                    animationTask2.cancel();
                    break;
                }
            }
            this.mAnimationTasks.add(animationTask);
            ClusterRendererMultipleItems.this.ongoingAnimations.add(animationTask);
            this.lock.unlock();
        }

        public void animateThenRemove(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.lock.lock();
            ClusterRendererMultipleItems<T>.AnimationTask animationTask = new AnimationTask(ClusterRendererMultipleItems.this, markerWithPosition, latLng, latLng2, this.lock, 0);
            for (AnimationTask animationTask2 : ClusterRendererMultipleItems.this.ongoingAnimations) {
                if (animationTask2.marker.getId().equals(((AnimationTask) animationTask).marker.getId())) {
                    animationTask2.cancel();
                    break;
                }
            }
            ClusterRendererMultipleItems.this.ongoingAnimations.add(animationTask);
            animationTask.removeOnAnimationComplete(ClusterRendererMultipleItems.this.mClusterManager.getMarkerManager());
            this.mAnimationTasks.add(animationTask);
            this.lock.unlock();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (!this.mListenerAdded) {
                Looper.myQueue().addIdleHandler(this);
                this.mListenerAdded = true;
            }
            removeMessages(0);
            this.lock.lock();
            for (int i14 = 0; i14 < 10; i14++) {
                try {
                    performNextTask();
                } catch (Throwable th3) {
                    this.lock.unlock();
                    throw th3;
                }
            }
            if (isBusy()) {
                sendEmptyMessageDelayed(0, 10L);
            } else {
                this.mListenerAdded = false;
                Looper.myQueue().removeIdleHandler(this);
                this.busyCondition.signalAll();
            }
            this.lock.unlock();
        }

        public boolean isBusy() {
            try {
                this.lock.lock();
                return (this.mCreateMarkerTasks.isEmpty() && this.mOnScreenCreateMarkerTasks.isEmpty() && this.mOnScreenRemoveMarkerTasks.isEmpty() && this.mRemoveMarkerTasks.isEmpty() && this.mAnimationTasks.isEmpty()) ? false : true;
            } finally {
                this.lock.unlock();
            }
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        public void remove(boolean z14, Marker marker) {
            this.lock.lock();
            sendEmptyMessage(0);
            if (z14) {
                this.mOnScreenRemoveMarkerTasks.add(marker);
            } else {
                this.mRemoveMarkerTasks.add(marker);
            }
            this.lock.unlock();
        }

        public void waitUntilFree() {
            while (isBusy()) {
                sendEmptyMessage(0);
                this.lock.lock();
                try {
                    try {
                        if (isBusy()) {
                            this.busyCondition.await();
                        }
                        this.lock.unlock();
                    } catch (InterruptedException e4) {
                        throw new RuntimeException(e4);
                    }
                } catch (Throwable th3) {
                    this.lock.unlock();
                    throw th3;
                }
            }
        }

        public /* synthetic */ MarkerModifier(ClusterRendererMultipleItems clusterRendererMultipleItems, int i14) {
            this();
        }
    }
}
