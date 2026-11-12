package com.xiaomi.wearable.yrn.components.amap.cluster;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.amap.api.maps.AMap;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.animation.AlphaAnimation;
import com.amap.api.maps.model.animation.Animation;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.a34;
import defpackage.b34;
import defpackage.jyi;
import defpackage.y24;
import defpackage.z24;
import defpackage.zde;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 c2\u00020\u00012\u00020\u0002:\u0004defcB1\u0012\u0006\u0010\\\u001a\u000207\u0012\u000e\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010=\u0012\u0006\u0010^\u001a\u00020A\u0012\b\u0010_\u001a\u0004\u0018\u00010:¢\u0006\u0004\b`\u0010aB#\b\u0016\u0012\u0006\u0010\\\u001a\u000207\u0012\u0006\u0010^\u001a\u00020A\u0012\b\u0010_\u001a\u0004\u0018\u00010:¢\u0006\u0004\b`\u0010bJ\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\tJ\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\tJ\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\nH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010\u0011J\u0017\u0010%\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b(\u0010\u0017J\u0017\u0010+\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0005¢\u0006\u0004\b-\u0010\tJ\u0017\u00100\u001a\u00020\u00052\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00052\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b2\u00101J\u0017\u00105\u001a\u0002042\u0006\u0010/\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u0004\u0018\u00010:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000b0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u0002030=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010?R\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010NR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010RR\u0016\u0010U\u001a\u00020T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006g"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/amap/cluster/ClusterOverlay;", "Lcom/amap/api/maps/AMap$OnCameraChangeListener;", "Lcom/amap/api/maps/AMap$OnMarkerClickListener;", "Landroid/graphics/Bitmap;", "bitmap", "", "reycleBitmap", "(Landroid/graphics/Bitmap;)V", "initThreadHandler", "()V", "", "Ly24;", "clusters", "addClusterToMap", "(Ljava/util/List;)V", "cluster", "addSingleClusterToMap", "(Ly24;)V", "calculateClusters", "assignClusters", "La34;", "clusterItem", "calculateSingleCluster", "(La34;)V", "Lcom/amap/api/maps/model/LatLng;", "latLng", "getCluster", "(Lcom/amap/api/maps/model/LatLng;Ljava/util/List;)Ly24;", "items", "Lcom/amap/api/maps/model/BitmapDescriptor;", "getBitmapDes", "(Ljava/util/List;)Lcom/amap/api/maps/model/BitmapDescriptor;", "getSingleBitmapDes", "(La34;)Lcom/amap/api/maps/model/BitmapDescriptor;", "updateCluster", "Lz24;", "clusterClickListener", "setOnClusterClickListener", "(Lz24;)V", "item", "addClusterItem", "Lb34;", "render", "setClusterRenderer", "(Lb34;)V", LifecycleConstantKt.ON_DESTROY, "Lcom/amap/api/maps/model/CameraPosition;", "arg0", "onCameraChange", "(Lcom/amap/api/maps/model/CameraPosition;)V", "onCameraChangeFinish", "Lcom/amap/api/maps/model/Marker;", "", "onMarkerClick", "(Lcom/amap/api/maps/model/Marker;)Z", "Lcom/amap/api/maps/AMap;", "mAMap", "Lcom/amap/api/maps/AMap;", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "", "mClusterItems", "Ljava/util/List;", "mClusters", "", "mClusterSize", "I", "mClusterClickListener", "Lz24;", "mClusterRender", "Lb34;", "mAddMarkers", "", "mClusterDistance", "D", "Landroid/os/HandlerThread;", "mMarkerHandlerThread", "Landroid/os/HandlerThread;", "mSignClusterThread", "Landroid/os/Handler;", "mMarkerhandler", "Landroid/os/Handler;", "mSignClusterHandler", "", "mPXInMeters", "F", "mIsCanceled", "Z", "Lcom/amap/api/maps/model/animation/AlphaAnimation;", "mADDAnimation", "Lcom/amap/api/maps/model/animation/AlphaAnimation;", "amap", "clusterItems", "clusterSize", "context", "<init>", "(Lcom/amap/api/maps/AMap;Ljava/util/List;ILandroid/content/Context;)V", "(Lcom/amap/api/maps/AMap;ILandroid/content/Context;)V", "Companion", "MyAnimationListener", "MarkerHandler", "SignClusterHandler", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ClusterOverlay implements AMap.OnCameraChangeListener, AMap.OnMarkerClickListener {
    public static final int ADD_CLUSTER_LIST = 0;
    public static final int ADD_SINGLE_CLUSTER = 1;
    public static final int CALCULATE_CLUSTER = 3;
    public static final int CALCULATE_SINGLE_CLUSTER = 4;
    public static final int UPDATE_SINGLE_CLUSTER = 2;

    @NotNull
    private final AlphaAnimation mADDAnimation;

    @NotNull
    private final AMap mAMap;

    @NotNull
    private final List<Marker> mAddMarkers;

    @Nullable
    private z24 mClusterClickListener;
    private double mClusterDistance;

    @Nullable
    private List<a34> mClusterItems;

    @Nullable
    private b34 mClusterRender;
    private final int mClusterSize;

    @NotNull
    private final List<y24> mClusters;

    @Nullable
    private final Context mContext;
    private boolean mIsCanceled;

    @NotNull
    private final HandlerThread mMarkerHandlerThread;

    @Nullable
    private Handler mMarkerhandler;
    private float mPXInMeters;

    @Nullable
    private Handler mSignClusterHandler;

    @NotNull
    private final HandlerThread mSignClusterThread;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/amap/cluster/ClusterOverlay$MarkerHandler;", "Landroid/os/Handler;", "looper", "Landroid/os/Looper;", "<init>", "(Lcom/xiaomi/wearable/yrn/components/amap/cluster/ClusterOverlay;Landroid/os/Looper;)V", "handleMessage", "", "message", "Landroid/os/Message;", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class MarkerHandler extends Handler {
        final /* synthetic */ ClusterOverlay this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MarkerHandler(@NotNull ClusterOverlay clusterOverlay, Looper looper) {
            super(looper);
            Intrinsics.checkNotNullParameter(looper, "looper");
            this.this$0 = clusterOverlay;
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message message) {
            Intrinsics.checkNotNullParameter(message, "message");
            int i = message.what;
            if (i == 0) {
                Object obj = message.obj;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.wearable.yrn.components.amap.cluster.Cluster>");
                this.this$0.addClusterToMap((List) obj);
                return;
            }
            if (i == 1) {
                Object obj2 = message.obj;
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.xiaomi.wearable.yrn.components.amap.cluster.Cluster");
                this.this$0.addSingleClusterToMap((y24) obj2);
                return;
            }
            if (i != 2) {
                return;
            }
            Object obj3 = message.obj;
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type com.xiaomi.wearable.yrn.components.amap.cluster.Cluster");
            this.this$0.updateCluster((y24) obj3);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/amap/cluster/ClusterOverlay$MyAnimationListener;", "Lcom/amap/api/maps/model/animation/Animation$AnimationListener;", "mRemoveMarkers", "", "Lcom/amap/api/maps/model/Marker;", "<init>", "(Lcom/xiaomi/wearable/yrn/components/amap/cluster/ClusterOverlay;Ljava/util/List;)V", "onAnimationStart", "", "onAnimationEnd", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class MyAnimationListener implements Animation.AnimationListener {

        @NotNull
        private final List<Marker> mRemoveMarkers;
        final /* synthetic */ ClusterOverlay this$0;

        public MyAnimationListener(@NotNull ClusterOverlay clusterOverlay, List<Marker> mRemoveMarkers) {
            Intrinsics.checkNotNullParameter(mRemoveMarkers, "mRemoveMarkers");
            this.this$0 = clusterOverlay;
            this.mRemoveMarkers = mRemoveMarkers;
        }

        @Override // com.amap.api.maps.model.animation.Animation.AnimationListener
        public void onAnimationEnd() {
            Iterator<Marker> it = this.mRemoveMarkers.iterator();
            while (it.hasNext()) {
                it.next().remove();
            }
            this.mRemoveMarkers.clear();
        }

        @Override // com.amap.api.maps.model.animation.Animation.AnimationListener
        public void onAnimationStart() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/amap/cluster/ClusterOverlay$SignClusterHandler;", "Landroid/os/Handler;", "looper", "Landroid/os/Looper;", "<init>", "(Lcom/xiaomi/wearable/yrn/components/amap/cluster/ClusterOverlay;Landroid/os/Looper;)V", "handleMessage", "", "message", "Landroid/os/Message;", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SignClusterHandler extends Handler {
        final /* synthetic */ ClusterOverlay this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignClusterHandler(@NotNull ClusterOverlay clusterOverlay, Looper looper) {
            super(looper);
            Intrinsics.checkNotNullParameter(looper, "looper");
            this.this$0 = clusterOverlay;
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message message) {
            Intrinsics.checkNotNullParameter(message, "message");
            int i = message.what;
            if (i == 3) {
                this.this$0.calculateClusters();
                return;
            }
            if (i != 4) {
                return;
            }
            Object obj = message.obj;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.wearable.yrn.components.amap.cluster.ClusterItem");
            a34 a34Var = (a34) obj;
            List list = this.this$0.mClusterItems;
            Intrinsics.checkNotNull(list);
            list.add(a34Var);
            this.this$0.calculateSingleCluster(a34Var);
        }
    }

    public ClusterOverlay(@NotNull AMap amap, @Nullable List<a34> list, int i, @Nullable Context context) {
        Intrinsics.checkNotNullParameter(amap, "amap");
        this.mAddMarkers = new ArrayList();
        this.mMarkerHandlerThread = new HandlerThread("addMarker");
        this.mSignClusterThread = new HandlerThread("calculateCluster");
        this.mADDAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.mClusterItems = list == null ? new ArrayList<>() : list;
        this.mContext = context;
        this.mClusters = new ArrayList();
        this.mAMap = amap;
        this.mClusterSize = i;
        float scalePerPixel = amap.getScalePerPixel();
        this.mPXInMeters = scalePerPixel;
        this.mClusterDistance = scalePerPixel * i;
        amap.setOnCameraChangeListener(this);
        amap.setOnMarkerClickListener(this);
        initThreadHandler();
        assignClusters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addClusterToMap(List<? extends y24> clusters) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.mAddMarkers);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        MyAnimationListener myAnimationListener = new MyAnimationListener(this, arrayList);
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            Marker marker = (Marker) next;
            marker.setAnimation(alphaAnimation);
            marker.setAnimationListener(myAnimationListener);
            marker.startAnimation();
        }
        Iterator<? extends y24> it2 = clusters.iterator();
        while (it2.hasNext()) {
            addSingleClusterToMap(it2.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addSingleClusterToMap(y24 cluster) {
        LatLng latLngB = cluster.b();
        MarkerOptions markerOptions = new MarkerOptions();
        MarkerOptions markerOptionsAnchor = markerOptions.anchor(0.5f, 0.5f);
        List<a34> listC = cluster.c();
        Intrinsics.checkNotNullExpressionValue(listC, "getClusterItems(...)");
        markerOptionsAnchor.icon(getBitmapDes(listC)).position(latLngB);
        Marker markerAddMarker = this.mAMap.addMarker(markerOptions);
        markerAddMarker.setAnimation(this.mADDAnimation);
        markerAddMarker.setObject(cluster);
        markerAddMarker.startAnimation();
        cluster.e(markerAddMarker);
        List<Marker> list = this.mAddMarkers;
        Intrinsics.checkNotNull(markerAddMarker);
        list.add(markerAddMarker);
    }

    private final void assignClusters() {
        this.mIsCanceled = true;
        Handler handler = this.mSignClusterHandler;
        Intrinsics.checkNotNull(handler);
        handler.removeMessages(3);
        Handler handler2 = this.mSignClusterHandler;
        Intrinsics.checkNotNull(handler2);
        handler2.sendEmptyMessage(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void calculateClusters() {
        this.mIsCanceled = false;
        this.mClusters.clear();
        LatLngBounds latLngBounds = this.mAMap.getProjection().getVisibleRegion().latLngBounds;
        List<a34> list = this.mClusterItems;
        Intrinsics.checkNotNull(list);
        for (a34 a34Var : list) {
            if (this.mIsCanceled) {
                return;
            }
            LatLng position = a34Var.getPosition();
            if (latLngBounds.contains(position)) {
                Intrinsics.checkNotNull(position);
                y24 cluster = getCluster(position, this.mClusters);
                if (cluster != null) {
                    cluster.a(a34Var);
                } else {
                    y24 y24Var = new y24(position);
                    this.mClusters.add(y24Var);
                    y24Var.a(a34Var);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.mClusters);
        Message messageObtain = Message.obtain();
        messageObtain.what = 0;
        messageObtain.obj = arrayList;
        if (this.mIsCanceled) {
            return;
        }
        Handler handler = this.mMarkerhandler;
        Intrinsics.checkNotNull(handler);
        handler.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void calculateSingleCluster(a34 clusterItem) {
        LatLngBounds latLngBounds = this.mAMap.getProjection().getVisibleRegion().latLngBounds;
        LatLng position = clusterItem.getPosition();
        if (latLngBounds.contains(position)) {
            Intrinsics.checkNotNull(position);
            y24 cluster = getCluster(position, this.mClusters);
            if (cluster == null) {
                y24 y24Var = new y24(position);
                this.mClusters.add(y24Var);
                y24Var.a(clusterItem);
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                messageObtain.obj = y24Var;
                Handler handler = this.mMarkerhandler;
                Intrinsics.checkNotNull(handler);
                handler.sendMessage(messageObtain);
                return;
            }
            cluster.a(clusterItem);
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 2;
            messageObtain2.obj = cluster;
            Handler handler2 = this.mMarkerhandler;
            Intrinsics.checkNotNull(handler2);
            handler2.removeMessages(2);
            Handler handler3 = this.mMarkerhandler;
            Intrinsics.checkNotNull(handler3);
            handler3.sendMessageDelayed(messageObtain2, 5L);
        }
    }

    private final BitmapDescriptor getBitmapDes(List<? extends a34> items) {
        zde zdeVarA0 = zde.A0(LayoutInflater.from(this.mContext), null, false);
        Intrinsics.checkNotNullExpressionValue(zdeVarA0, "inflate(...)");
        zdeVarA0.F.setText(items.size() + "个");
        TextView textView = zdeVarA0.F;
        Context context = this.mContext;
        textView.setText(context != null ? ResourceExtKt.getQuantityString(context, jyi.f23247a, items.size(), Integer.valueOf(items.size())) : null);
        if (items.size() == 1) {
            return getSingleBitmapDes(items.get(0));
        }
        if (!items.isEmpty()) {
            zdeVarA0.A.setImageBitmap(items.get(0).getIcon().getBitmap());
        }
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new ImageView[]{zdeVarA0.A, zdeVarA0.B, zdeVarA0.C, zdeVarA0.D});
        int size = listListOf.size();
        for (int i = 0; i < size; i++) {
            if (i < items.size()) {
                Object obj = listListOf.get(i);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                ViewExtKt.visible((View) obj);
                ((ImageView) listListOf.get(i)).setImageBitmap(items.get(i).getIcon().getBitmap());
            } else {
                Object obj2 = listListOf.get(i);
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                ViewExtKt.gone((View) obj2);
            }
        }
        ImageView iconMore = zdeVarA0.E;
        Intrinsics.checkNotNullExpressionValue(iconMore, "iconMore");
        ViewExtKt.setVisible(iconMore, items.size() > 4);
        BitmapDescriptor bitmapDescriptorFromView = BitmapDescriptorFactory.fromView(zdeVarA0.getRoot());
        Intrinsics.checkNotNullExpressionValue(bitmapDescriptorFromView, "fromView(...)");
        return bitmapDescriptorFromView;
    }

    private final y24 getCluster(LatLng latLng, List<? extends y24> clusters) {
        for (y24 y24Var : clusters) {
            if (AMapUtils.calculateLineDistance(latLng, y24Var.b()) < this.mClusterDistance && this.mAMap.getCameraPosition().zoom < 19.0f) {
                return y24Var;
            }
        }
        return null;
    }

    private final BitmapDescriptor getSingleBitmapDes(a34 clusterItem) {
        BitmapDescriptor bitmapDescriptorA = clusterItem.a();
        Intrinsics.checkNotNullExpressionValue(bitmapDescriptorA, "getMarkerIcon(...)");
        return bitmapDescriptorA;
    }

    private final void initThreadHandler() {
        this.mMarkerHandlerThread.start();
        this.mSignClusterThread.start();
        Looper looper = this.mMarkerHandlerThread.getLooper();
        Intrinsics.checkNotNullExpressionValue(looper, "getLooper(...)");
        this.mMarkerhandler = new MarkerHandler(this, looper);
        Looper looper2 = this.mSignClusterThread.getLooper();
        Intrinsics.checkNotNullExpressionValue(looper2, "getLooper(...)");
        this.mSignClusterHandler = new SignClusterHandler(this, looper2);
    }

    private final void reycleBitmap(Bitmap bitmap) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCluster(y24 cluster) {
        Marker markerD = cluster.d();
        List<a34> listC = cluster.c();
        Intrinsics.checkNotNullExpressionValue(listC, "getClusterItems(...)");
        markerD.setIcon(getBitmapDes(listC));
    }

    public final void addClusterItem(@Nullable a34 item) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        messageObtain.obj = item;
        Handler handler = this.mSignClusterHandler;
        Intrinsics.checkNotNull(handler);
        handler.sendMessage(messageObtain);
    }

    @Override // com.amap.api.maps.AMap.OnCameraChangeListener
    public void onCameraChange(@NotNull CameraPosition arg0) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
    }

    @Override // com.amap.api.maps.AMap.OnCameraChangeListener
    public void onCameraChangeFinish(@NotNull CameraPosition arg0) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        float scalePerPixel = this.mAMap.getScalePerPixel();
        this.mPXInMeters = scalePerPixel;
        this.mClusterDistance = scalePerPixel * this.mClusterSize;
        assignClusters();
    }

    public final void onDestroy() {
        this.mIsCanceled = true;
        Handler handler = this.mSignClusterHandler;
        Intrinsics.checkNotNull(handler);
        handler.removeCallbacksAndMessages(null);
        Handler handler2 = this.mMarkerhandler;
        Intrinsics.checkNotNull(handler2);
        handler2.removeCallbacksAndMessages(null);
        this.mSignClusterThread.quit();
        this.mMarkerHandlerThread.quit();
        Iterator<Marker> it = this.mAddMarkers.iterator();
        while (it.hasNext()) {
            it.next().remove();
        }
        this.mAddMarkers.clear();
    }

    @Override // com.amap.api.maps.AMap.OnMarkerClickListener
    public boolean onMarkerClick(@NotNull Marker arg0) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        return true;
    }

    public final void setClusterRenderer(@Nullable b34 render) {
    }

    public final void setOnClusterClickListener(@Nullable z24 clusterClickListener) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClusterOverlay(@NotNull AMap amap, int i, @Nullable Context context) {
        this(amap, null, i, context);
        Intrinsics.checkNotNullParameter(amap, "amap");
    }
}
