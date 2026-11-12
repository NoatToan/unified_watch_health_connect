package com.mapbox.maps;

import android.graphics.RectF;
import android.os.Handler;
import android.webkit.URLUtil;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.maps.extension.style.StyleContract;
import com.mapbox.maps.extension.style.StyleExtensionImpl;
import com.mapbox.maps.extension.style.StyleExtensionImplKt;
import com.mapbox.maps.interactions.FeatureState;
import com.mapbox.maps.interactions.FeatureStateCallback;
import com.mapbox.maps.interactions.FeatureStateKey;
import com.mapbox.maps.interactions.FeaturesetFeature;
import com.mapbox.maps.interactions.QueryRenderedFeaturesetFeaturesCallback;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import com.mapbox.maps.plugin.delegates.MapFeatureQueryDelegate;
import com.mapbox.maps.plugin.delegates.MapFeatureStateDelegate;
import com.mapbox.maps.plugin.delegates.MapInteractionDelegate;
import com.mapbox.maps.plugin.delegates.MapListenerDelegate;
import com.mapbox.maps.plugin.delegates.MapPluginExtensionsDelegate;
import com.mapbox.maps.plugin.delegates.MapProjectionDelegate;
import com.mapbox.maps.plugin.delegates.MapTransformDelegate;
import com.mapbox.maps.plugin.delegates.listeners.OnCameraChangeListener;
import com.mapbox.maps.plugin.delegates.listeners.OnMapIdleListener;
import com.mapbox.maps.plugin.delegates.listeners.OnMapLoadErrorListener;
import com.mapbox.maps.plugin.delegates.listeners.OnMapLoadedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnRenderFrameFinishedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnRenderFrameStartedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnSourceAddedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnSourceDataLoadedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnSourceRemovedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnStyleDataLoadedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnStyleImageMissingListener;
import com.mapbox.maps.plugin.delegates.listeners.OnStyleImageUnusedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnStyleLoadedListener;
import com.mapbox.maps.plugin.gestures.GesturesPlugin;
import d53.u;
import d53.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.u0;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000à\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0007\u0018\u0000 \u0094\u00042\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0002\u0094\u0004B!\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B!\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b \u0010!J;\u0010'\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b'\u0010(J/\u0010'\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b'\u0010)J\u001f\u0010'\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b'\u0010!J\u0017\u0010'\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001bH\u0007¢\u0006\u0004\b'\u0010*J;\u0010,\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b,\u0010(J/\u0010,\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b,\u0010)J\u001f\u0010,\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b,\u0010!J\u0017\u0010,\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001bH\u0007¢\u0006\u0004\b,\u0010*J#\u0010 \u001a\u00020\u001f2\u0006\u0010.\u001a\u00020-2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b \u0010/J;\u0010 \u001a\u00020\u001f2\u0006\u0010.\u001a\u00020-2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b \u00100J/\u0010 \u001a\u00020\u001f2\u0006\u0010.\u001a\u00020-2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b \u00101J\u0011\u00105\u001a\u0004\u0018\u000102H\u0007¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u001f2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\u0015H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0015H\u0016¢\u0006\u0004\b>\u0010\u0017J\u0017\u0010A\u001a\u00020\u001f2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\u001f2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020\u001f2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ#\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020N0M2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\u0015H\u0016¢\u0006\u0004\bT\u0010=J\u0017\u0010W\u001a\u00020\u001f2\u0006\u0010V\u001a\u00020UH\u0017¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u0015H\u0016¢\u0006\u0004\bY\u0010\u0017J\u0015\u0010\\\u001a\u00020\u001f2\u0006\u0010[\u001a\u00020Z¢\u0006\u0004\b\\\u0010]J\r\u0010^\u001a\u00020Z¢\u0006\u0004\b^\u0010_J\u000f\u0010a\u001a\u00020`H\u0016¢\u0006\u0004\ba\u0010bJ\u000f\u0010d\u001a\u00020cH\u0016¢\u0006\u0004\bd\u0010eJ\u001d\u0010h\u001a\u00020\u001f2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u001f0fH\u0007¢\u0006\u0004\bh\u0010iJ\u0015\u0010l\u001a\b\u0012\u0004\u0012\u00020k0jH\u0007¢\u0006\u0004\bl\u0010mJ%\u0010p\u001a\u00020\u001f2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020k0j2\u0006\u0010o\u001a\u00020\u0015H\u0007¢\u0006\u0004\bp\u0010qJI\u0010|\u001a\u0002072\u0006\u0010s\u001a\u00020r2\b\u0010u\u001a\u0004\u0018\u00010t2\b\u0010w\u001a\u0004\u0018\u00010v2\b\u0010x\u001a\u0004\u0018\u00010v2\b\u0010y\u001a\u0004\u0018\u00010v2\b\u0010{\u001a\u0004\u0018\u00010zH\u0017¢\u0006\u0004\b|\u0010}J?\u0010\u0081\u0001\u001a\u0002072\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0j2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010t2\b\u0010w\u001a\u0004\u0018\u00010v2\b\u0010x\u001a\u0004\u0018\u00010vH\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J3\u0010\u0081\u0001\u001a\u0002072\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0j2\u0007\u0010\u0083\u0001\u001a\u0002072\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0086\u0001JH\u0010\u0081\u0001\u001a\u0002072\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0j2\u0007\u0010\u0083\u0001\u001a\u0002072\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010t2\b\u0010y\u001a\u0004\u0018\u00010v2\b\u0010{\u001a\u0004\u0018\u00010zH\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0087\u0001J^\u0010\u0081\u0001\u001a\u00020\u001f2\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0j2\u0007\u0010\u0083\u0001\u001a\u0002072\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010t2\b\u0010y\u001a\u0004\u0018\u00010v2\b\u0010{\u001a\u0004\u0018\u00010z2\u0014\u0010\u0089\u0001\u001a\u000f\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u001f0\u0088\u0001H\u0016¢\u0006\u0006\b\u0081\u0001\u0010\u008a\u0001J;\u0010\u008e\u0001\u001a\u0002072\b\u0010\u008c\u0001\u001a\u00030\u008b\u00012\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010t2\b\u0010w\u001a\u0004\u0018\u00010v2\b\u0010x\u001a\u0004\u0018\u00010vH\u0017¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001b\u0010\u0090\u0001\u001a\u00020r2\u0007\u0010\u0083\u0001\u001a\u000207H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001b\u0010\u0092\u0001\u001a\u00020r2\u0007\u0010\u0083\u0001\u001a\u000207H\u0016¢\u0006\u0006\b\u0092\u0001\u0010\u0091\u0001J\u001c\u0010\u0094\u0001\u001a\u00030\u0093\u00012\u0007\u0010\u0083\u0001\u001a\u000207H\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001c\u0010\u0096\u0001\u001a\u00030\u0093\u00012\u0007\u0010\u0083\u0001\u001a\u000207H\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0095\u0001J\u001c\u0010\u0099\u0001\u001a\u00020r2\b\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001b\u0010\u009c\u0001\u001a\u00020z2\u0007\u0010\u009b\u0001\u001a\u00020~H\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J&\u0010\u009e\u0001\u001a\b\u0012\u0004\u0012\u00020z0j2\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0jH\u0016¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001b\u0010¡\u0001\u001a\u00020~2\u0007\u0010 \u0001\u001a\u00020zH\u0016¢\u0006\u0006\b¡\u0001\u0010¢\u0001J'\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u00020~0j2\r\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020z0jH\u0016¢\u0006\u0006\b¤\u0001\u0010\u009f\u0001J\u001c\u0010¦\u0001\u001a\u00030¥\u00012\u0007\u0010 \u0001\u001a\u00020zH\u0016¢\u0006\u0006\b¦\u0001\u0010§\u0001J(\u0010¨\u0001\u001a\t\u0012\u0005\u0012\u00030¥\u00010j2\r\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020z0jH\u0016¢\u0006\u0006\b¨\u0001\u0010\u009f\u0001J$\u0010«\u0001\u001a\u00020v2\u0007\u0010©\u0001\u001a\u00020v2\u0007\u0010ª\u0001\u001a\u00020vH\u0016¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u001b\u0010«\u0001\u001a\u00020v2\u0007\u0010©\u0001\u001a\u00020vH\u0016¢\u0006\u0006\b«\u0001\u0010\u00ad\u0001J\u001c\u0010°\u0001\u001a\u00030¯\u00012\u0007\u0010®\u0001\u001a\u00020~H\u0016¢\u0006\u0006\b°\u0001\u0010±\u0001J\u001c\u0010³\u0001\u001a\u00020~2\b\u0010²\u0001\u001a\u00030¯\u0001H\u0016¢\u0006\u0006\b³\u0001\u0010´\u0001J%\u0010·\u0001\u001a\u00030¶\u00012\u0007\u0010®\u0001\u001a\u00020~2\u0007\u0010µ\u0001\u001a\u00020vH\u0016¢\u0006\u0006\b·\u0001\u0010¸\u0001J%\u0010¹\u0001\u001a\u00020~2\b\u0010\u009b\u0001\u001a\u00030¶\u00012\u0007\u0010µ\u0001\u001a\u00020vH\u0016¢\u0006\u0006\b¹\u0001\u0010º\u0001J0\u0010À\u0001\u001a\u00030¿\u00012\b\u0010\u008c\u0001\u001a\u00030»\u00012\u0007\u0010L\u001a\u00030¼\u00012\b\u0010¾\u0001\u001a\u00030½\u0001H\u0016¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J/\u0010Å\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\u0007\u0010L\u001a\u00030Ã\u00012\b\u0010¾\u0001\u001a\u00030Ä\u0001H\u0016¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J\u001c\u0010É\u0001\u001a\u00020\u001f2\b\u0010È\u0001\u001a\u00030Ç\u0001H\u0016¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001JG\u0010Ñ\u0001\u001a\u00030¿\u00012\u0007\u0010Ë\u0001\u001a\u00020\u001b2\b\u0010Í\u0001\u001a\u00030Ì\u00012\n\b\u0002\u0010Ï\u0001\u001a\u00030Î\u00012\t\b\u0002\u0010{\u001a\u00030Î\u00012\b\u0010¾\u0001\u001a\u00030Ð\u0001H\u0007¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J.\u0010Ó\u0001\u001a\u00030¿\u00012\u0007\u0010Ë\u0001\u001a\u00020\u001b2\b\u0010Í\u0001\u001a\u00030Ì\u00012\b\u0010¾\u0001\u001a\u00030Ð\u0001¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001J.\u0010Õ\u0001\u001a\u00030¿\u00012\u0007\u0010Ë\u0001\u001a\u00020\u001b2\b\u0010Í\u0001\u001a\u00030Ì\u00012\b\u0010¾\u0001\u001a\u00030Ð\u0001¢\u0006\u0006\bÕ\u0001\u0010Ô\u0001JD\u0010Û\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\t\u0010Ö\u0001\u001a\u0004\u0018\u00010\u001b2\u0007\u0010×\u0001\u001a\u00020\u001b2\b\u0010Ù\u0001\u001a\u00030Ø\u00012\b\u0010¾\u0001\u001a\u00030Ú\u0001H\u0016¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001J7\u0010Û\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\u0007\u0010×\u0001\u001a\u00020\u001b2\b\u0010Ù\u0001\u001a\u00030Ø\u00012\b\u0010¾\u0001\u001a\u00030Ú\u0001¢\u0006\u0006\bÛ\u0001\u0010Ý\u0001J:\u0010ß\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\t\u0010Ö\u0001\u001a\u0004\u0018\u00010\u001b2\u0007\u0010×\u0001\u001a\u00020\u001b2\b\u0010¾\u0001\u001a\u00030Þ\u0001H\u0016¢\u0006\u0006\bß\u0001\u0010à\u0001J-\u0010ß\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\u0007\u0010×\u0001\u001a\u00020\u001b2\b\u0010¾\u0001\u001a\u00030Þ\u0001¢\u0006\u0006\bß\u0001\u0010á\u0001JE\u0010ã\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\t\u0010Ö\u0001\u001a\u0004\u0018\u00010\u001b2\u0007\u0010×\u0001\u001a\u00020\u001b2\t\u0010â\u0001\u001a\u0004\u0018\u00010\u001b2\b\u0010¾\u0001\u001a\u00030Ú\u0001H\u0016¢\u0006\u0006\bã\u0001\u0010ä\u0001J8\u0010ã\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\t\u0010Ö\u0001\u001a\u0004\u0018\u00010\u001b2\u0007\u0010×\u0001\u001a\u00020\u001b2\b\u0010¾\u0001\u001a\u00030Ú\u0001¢\u0006\u0006\bã\u0001\u0010å\u0001J-\u0010ã\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\u0007\u0010×\u0001\u001a\u00020\u001b2\b\u0010¾\u0001\u001a\u00030Ú\u0001¢\u0006\u0006\bã\u0001\u0010æ\u0001J1\u0010ç\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\t\u0010Ö\u0001\u001a\u0004\u0018\u00010\u001b2\b\u0010¾\u0001\u001a\u00030Ú\u0001H\u0016¢\u0006\u0006\bç\u0001\u0010æ\u0001J$\u0010ç\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\b\u0010¾\u0001\u001a\u00030Ú\u0001¢\u0006\u0006\bç\u0001\u0010è\u0001J\u0010\u0010é\u0001\u001a\u00020\u001f¢\u0006\u0006\bé\u0001\u0010ê\u0001J\u001d\u0010í\u0001\u001a\u00030¿\u00012\b\u0010ì\u0001\u001a\u00030ë\u0001H\u0016¢\u0006\u0006\bí\u0001\u0010î\u0001J\u001d\u0010ñ\u0001\u001a\u00030¿\u00012\b\u0010ð\u0001\u001a\u00030ï\u0001H\u0016¢\u0006\u0006\bñ\u0001\u0010ò\u0001J\u001d\u0010õ\u0001\u001a\u00030¿\u00012\b\u0010ô\u0001\u001a\u00030ó\u0001H\u0016¢\u0006\u0006\bõ\u0001\u0010ö\u0001J\u001d\u0010ù\u0001\u001a\u00030¿\u00012\b\u0010ø\u0001\u001a\u00030÷\u0001H\u0016¢\u0006\u0006\bù\u0001\u0010ú\u0001J\u001d\u0010ý\u0001\u001a\u00030¿\u00012\b\u0010ü\u0001\u001a\u00030û\u0001H\u0016¢\u0006\u0006\bý\u0001\u0010þ\u0001J\u001d\u0010\u0081\u0002\u001a\u00030¿\u00012\b\u0010\u0080\u0002\u001a\u00030ÿ\u0001H\u0016¢\u0006\u0006\b\u0081\u0002\u0010\u0082\u0002J\u001d\u0010\u0085\u0002\u001a\u00030¿\u00012\b\u0010\u0084\u0002\u001a\u00030\u0083\u0002H\u0016¢\u0006\u0006\b\u0085\u0002\u0010\u0086\u0002J\u001d\u0010\u0089\u0002\u001a\u00030¿\u00012\b\u0010\u0088\u0002\u001a\u00030\u0087\u0002H\u0016¢\u0006\u0006\b\u0089\u0002\u0010\u008a\u0002J\u001d\u0010\u008d\u0002\u001a\u00030¿\u00012\b\u0010\u008c\u0002\u001a\u00030\u008b\u0002H\u0016¢\u0006\u0006\b\u008d\u0002\u0010\u008e\u0002J\u001d\u0010\u0091\u0002\u001a\u00030¿\u00012\b\u0010\u0090\u0002\u001a\u00030\u008f\u0002H\u0016¢\u0006\u0006\b\u0091\u0002\u0010\u0092\u0002J\u001d\u0010\u0095\u0002\u001a\u00030¿\u00012\b\u0010\u0094\u0002\u001a\u00030\u0093\u0002H\u0016¢\u0006\u0006\b\u0095\u0002\u0010\u0096\u0002J\u001d\u0010\u0099\u0002\u001a\u00030¿\u00012\b\u0010\u0098\u0002\u001a\u00030\u0097\u0002H\u0017¢\u0006\u0006\b\u0099\u0002\u0010\u009a\u0002J\u001d\u0010\u009d\u0002\u001a\u00030¿\u00012\b\u0010\u009c\u0002\u001a\u00030\u009b\u0002H\u0016¢\u0006\u0006\b\u009d\u0002\u0010\u009e\u0002J\u001d\u0010¡\u0002\u001a\u00030¿\u00012\b\u0010 \u0002\u001a\u00030\u009f\u0002H\u0016¢\u0006\u0006\b¡\u0002\u0010¢\u0002J\u001d\u0010¥\u0002\u001a\u00030¿\u00012\b\u0010¤\u0002\u001a\u00030£\u0002H\u0016¢\u0006\u0006\b¥\u0002\u0010¦\u0002J&\u0010ª\u0002\u001a\u00030¿\u00012\u0007\u0010§\u0002\u001a\u00020\u001b2\b\u0010©\u0002\u001a\u00030¨\u0002H\u0017¢\u0006\u0006\bª\u0002\u0010«\u0002J\u001c\u0010®\u0002\u001a\u00020\u001f2\b\u0010\u00ad\u0002\u001a\u00030¬\u0002H\u0017¢\u0006\u0006\b®\u0002\u0010¯\u0002J\u001c\u0010°\u0002\u001a\u00020\u001f2\b\u0010\u00ad\u0002\u001a\u00030¬\u0002H\u0017¢\u0006\u0006\b°\u0002\u0010¯\u0002J\u001c\u0010³\u0002\u001a\u00020\u001f2\b\u0010²\u0002\u001a\u00030±\u0002H\u0017¢\u0006\u0006\b³\u0002\u0010´\u0002J\u001c\u0010µ\u0002\u001a\u00020\u001f2\b\u0010²\u0002\u001a\u00030±\u0002H\u0017¢\u0006\u0006\bµ\u0002\u0010´\u0002J\u001a\u0010¶\u0002\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020%H\u0017¢\u0006\u0006\b¶\u0002\u0010·\u0002J\u001a\u0010¸\u0002\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020%H\u0017¢\u0006\u0006\b¸\u0002\u0010·\u0002J\u001c\u0010»\u0002\u001a\u00020\u001f2\b\u0010º\u0002\u001a\u00030¹\u0002H\u0017¢\u0006\u0006\b»\u0002\u0010¼\u0002J\u001c\u0010½\u0002\u001a\u00020\u001f2\b\u0010º\u0002\u001a\u00030¹\u0002H\u0017¢\u0006\u0006\b½\u0002\u0010¼\u0002J\u001c\u0010À\u0002\u001a\u00020\u001f2\b\u0010¿\u0002\u001a\u00030¾\u0002H\u0017¢\u0006\u0006\bÀ\u0002\u0010Á\u0002J\u001c\u0010Â\u0002\u001a\u00020\u001f2\b\u0010¿\u0002\u001a\u00030¾\u0002H\u0017¢\u0006\u0006\bÂ\u0002\u0010Á\u0002J\u001c\u0010Å\u0002\u001a\u00020\u001f2\b\u0010Ä\u0002\u001a\u00030Ã\u0002H\u0017¢\u0006\u0006\bÅ\u0002\u0010Æ\u0002J\u001c\u0010Ç\u0002\u001a\u00020\u001f2\b\u0010Ä\u0002\u001a\u00030Ã\u0002H\u0017¢\u0006\u0006\bÇ\u0002\u0010Æ\u0002J\u001c\u0010Ê\u0002\u001a\u00020\u001f2\b\u0010É\u0002\u001a\u00030È\u0002H\u0017¢\u0006\u0006\bÊ\u0002\u0010Ë\u0002J\u001c\u0010Ì\u0002\u001a\u00020\u001f2\b\u0010É\u0002\u001a\u00030È\u0002H\u0017¢\u0006\u0006\bÌ\u0002\u0010Ë\u0002J\u001c\u0010Ï\u0002\u001a\u00020\u001f2\b\u0010Î\u0002\u001a\u00030Í\u0002H\u0017¢\u0006\u0006\bÏ\u0002\u0010Ð\u0002J\u001c\u0010Ñ\u0002\u001a\u00020\u001f2\b\u0010Î\u0002\u001a\u00030Í\u0002H\u0017¢\u0006\u0006\bÑ\u0002\u0010Ð\u0002J\u001c\u0010Ô\u0002\u001a\u00020\u001f2\b\u0010Ó\u0002\u001a\u00030Ò\u0002H\u0017¢\u0006\u0006\bÔ\u0002\u0010Õ\u0002J\u001c\u0010Ö\u0002\u001a\u00020\u001f2\b\u0010Ó\u0002\u001a\u00030Ò\u0002H\u0017¢\u0006\u0006\bÖ\u0002\u0010Õ\u0002J\u001c\u0010Ù\u0002\u001a\u00020\u001f2\b\u0010Ø\u0002\u001a\u00030×\u0002H\u0017¢\u0006\u0006\bÙ\u0002\u0010Ú\u0002J\u001c\u0010Û\u0002\u001a\u00020\u001f2\b\u0010Ø\u0002\u001a\u00030×\u0002H\u0017¢\u0006\u0006\bÛ\u0002\u0010Ú\u0002J\u001c\u0010Þ\u0002\u001a\u00020\u001f2\b\u0010Ý\u0002\u001a\u00030Ü\u0002H\u0017¢\u0006\u0006\bÞ\u0002\u0010ß\u0002J\u001c\u0010à\u0002\u001a\u00020\u001f2\b\u0010Ý\u0002\u001a\u00030Ü\u0002H\u0017¢\u0006\u0006\bà\u0002\u0010ß\u0002J\u001c\u0010ã\u0002\u001a\u00020\u001f2\b\u0010â\u0002\u001a\u00030á\u0002H\u0017¢\u0006\u0006\bã\u0002\u0010ä\u0002J\u001c\u0010å\u0002\u001a\u00020\u001f2\b\u0010â\u0002\u001a\u00030á\u0002H\u0017¢\u0006\u0006\bå\u0002\u0010ä\u0002J\u001c\u0010è\u0002\u001a\u00020\u001f2\b\u0010ç\u0002\u001a\u00030æ\u0002H\u0017¢\u0006\u0006\bè\u0002\u0010é\u0002J\u001c\u0010ê\u0002\u001a\u00020\u001f2\b\u0010ç\u0002\u001a\u00030æ\u0002H\u0017¢\u0006\u0006\bê\u0002\u0010é\u0002J\u0010\u0010ë\u0002\u001a\u00020\u001f¢\u0006\u0006\bë\u0002\u0010ê\u0001J\u0013\u0010í\u0002\u001a\u00030ì\u0002H\u0016¢\u0006\u0006\bí\u0002\u0010î\u0002J\u001a\u00109\u001a\u00020\u001f2\b\u0010ï\u0002\u001a\u00030ì\u0002H\u0016¢\u0006\u0005\b9\u0010ð\u0002J\u001b\u0010ñ\u0002\u001a\u0004\u0018\u00010v2\u0007\u0010\u009b\u0001\u001a\u00020~¢\u0006\u0006\bñ\u0002\u0010ò\u0002J\u001c\u0010õ\u0002\u001a\u00020\u001f2\n\u0010ô\u0002\u001a\u0005\u0018\u00010ó\u0002¢\u0006\u0006\bõ\u0002\u0010ö\u0002J\u0018\u0010ø\u0002\u001a\u00020\u001f2\u0007\u0010÷\u0002\u001a\u00020\u0015¢\u0006\u0005\bø\u0002\u0010=J\u000f\u0010ù\u0002\u001a\u00020\u0015¢\u0006\u0005\bù\u0002\u0010\u0017J\"\u0010ü\u0002\u001a\u00020\u001f2\u000e\u0010û\u0002\u001a\t\u0012\u0005\u0012\u00030ú\u00020jH\u0007¢\u0006\u0006\bü\u0002\u0010ý\u0002J\u0018\u0010þ\u0002\u001a\t\u0012\u0005\u0012\u00030ú\u00020jH\u0007¢\u0006\u0005\bþ\u0002\u0010mJ%\u0010\u0081\u0003\u001a\u00020\u001f2\u0007\u0010L\u001a\u00030ÿ\u00022\b\u0010¾\u0001\u001a\u00030\u0080\u0003H\u0007¢\u0006\u0006\b\u0081\u0003\u0010\u0082\u0003J\u0012\u0010\u0083\u0003\u001a\u00020\u001fH\u0007¢\u0006\u0006\b\u0083\u0003\u0010ê\u0001J$\u0010\u0086\u0003\u001a\u0002072\u0007\u0010\u0084\u0003\u001a\u00020z2\u0007\u0010\u0085\u0003\u001a\u00020zH\u0016¢\u0006\u0006\b\u0086\u0003\u0010\u0087\u0003J\u001c\u0010\u008a\u0003\u001a\u00020\u001f2\b\u0010\u0089\u0003\u001a\u00030\u0088\u0003H\u0016¢\u0006\u0006\b\u008a\u0003\u0010\u008b\u0003J\u0013\u0010\u008c\u0003\u001a\u00030\u0088\u0003H\u0016¢\u0006\u0006\b\u008c\u0003\u0010\u008d\u0003J/\u0010\u0091\u0003\u001a\u0005\u0018\u00010\u008f\u00032\u0018\u0010\u0090\u0003\u001a\u0013\u0012\u0005\u0012\u00030\u008e\u0003\u0012\u0007\u0012\u0005\u0018\u00010\u008f\u00030\u0088\u0001H\u0016¢\u0006\u0006\b\u0091\u0003\u0010\u0092\u0003J/\u0010\u0094\u0003\u001a\u0005\u0018\u00010\u008f\u00032\u0018\u0010\u0090\u0003\u001a\u0013\u0012\u0005\u0012\u00030\u0093\u0003\u0012\u0007\u0012\u0005\u0018\u00010\u008f\u00030\u0088\u0001H\u0016¢\u0006\u0006\b\u0094\u0003\u0010\u0092\u0003J\u0012\u0010\u0096\u0003\u001a\u00020\u001fH\u0000¢\u0006\u0006\b\u0095\u0003\u0010ê\u0001J-\u0010\u009a\u0003\u001a\t\u0012\u0005\u0012\u00030\u0099\u00030j2\b\u0010\u0098\u0003\u001a\u00030\u0097\u00032\b\u00108\u001a\u0004\u0018\u000107H\u0007¢\u0006\u0006\b\u009a\u0003\u0010\u009b\u0003J\u0015\u0010\u009c\u0003\u001a\b\u0012\u0004\u0012\u00020\u001b0j¢\u0006\u0005\b\u009c\u0003\u0010mJ0\u0010¡\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020N0M2\u0007\u0010\u009d\u0003\u001a\u00020\u001b2\u0007\u0010L\u001a\u00030\u009e\u0003H\u0000¢\u0006\u0006\b\u009f\u0003\u0010 \u0003J=\u0010§\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020N0M2\u001d\u0010¤\u0003\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0018\u00010¢\u0003j\u000b\u0012\u0004\u0012\u00020\u001b\u0018\u0001`£\u0003H\u0001¢\u0006\u0006\b¥\u0003\u0010¦\u0003J$\u0010ª\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u001b0¢\u0003j\t\u0012\u0004\u0012\u00020\u001b`£\u0003H\u0001¢\u0006\u0006\b¨\u0003\u0010©\u0003J0\u0010¬\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020N0M2\u0007\u0010\u009d\u0003\u001a\u00020\u001b2\u0007\u0010L\u001a\u00030\u009e\u0003H\u0000¢\u0006\u0006\b«\u0003\u0010 \u0003J'\u0010¯\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020N0M2\u0007\u0010\u009d\u0003\u001a\u00020\u001bH\u0000¢\u0006\u0006\b\u00ad\u0003\u0010®\u0003J(\u0010²\u0003\u001a\u000f\u0012\u0004\u0012\u00020\u001b\u0012\u0005\u0012\u00030\u009e\u00030M2\u0007\u0010°\u0003\u001a\u00020\u001bH\u0000¢\u0006\u0006\b±\u0003\u0010®\u0003J\u001e\u0010·\u0003\u001a\u00020\u001f2\n\u0010´\u0003\u001a\u0005\u0018\u00010³\u0003H\u0000¢\u0006\u0006\bµ\u0003\u0010¶\u0003J\u001d\u0010º\u0003\u001a\u00030¿\u00012\b\u0010¹\u0003\u001a\u00030¸\u0003H\u0017¢\u0006\u0006\bº\u0003\u0010»\u0003J\u001c\u0010¾\u0003\u001a\u00020\u001f2\b\u0010½\u0003\u001a\u00030¼\u0003H\u0017¢\u0006\u0006\b¾\u0003\u0010¿\u0003JD\u0010Û\u0001\u001a\u00030¿\u0001\"\n\b\u0000\u0010Á\u0003*\u00030À\u00032\u000e\u0010Ã\u0003\u001a\t\u0012\u0004\u0012\u00028\u00000Â\u00032\u0007\u0010Ù\u0001\u001a\u00028\u00002\n\b\u0002\u0010¾\u0001\u001a\u00030Ú\u0001H\u0007¢\u0006\u0006\bÛ\u0001\u0010Ä\u0003JR\u0010Û\u0001\u001a\u00030¿\u0001\"\n\b\u0000\u0010Á\u0003*\u00030À\u00032\u0012\u0010Æ\u0003\u001a\r\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030Å\u00032\b\u0010È\u0003\u001a\u00030Ç\u00032\u0007\u0010Ù\u0001\u001a\u00028\u00002\n\b\u0002\u0010¾\u0001\u001a\u00030Ú\u0001H\u0007¢\u0006\u0006\bÛ\u0001\u0010É\u0003J?\u0010ß\u0001\u001a\u00030¿\u0001\"\n\b\u0000\u0010Á\u0003*\u00030À\u00032\u000e\u0010Ã\u0003\u001a\t\u0012\u0004\u0012\u00028\u00000Â\u00032\u000e\u0010¾\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000Ê\u0003H\u0007¢\u0006\u0006\bß\u0001\u0010Ë\u0003JM\u0010ß\u0001\u001a\u00030¿\u0001\"\n\b\u0000\u0010Á\u0003*\u00030À\u00032\u0012\u0010Æ\u0003\u001a\r\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030Å\u00032\b\u0010È\u0003\u001a\u00030Ç\u00032\u000e\u0010¾\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000Ê\u0003H\u0007¢\u0006\u0006\bß\u0001\u0010Ì\u0003JZ\u0010ã\u0001\u001a\u00030¿\u0001\"\n\b\u0000\u0010Á\u0003*\u00030À\u0003\"\u0010\b\u0001\u0010Î\u0003*\t\u0012\u0004\u0012\u00028\u00000Í\u00032\u000e\u0010Ã\u0003\u001a\t\u0012\u0004\u0012\u00028\u00000Â\u00032\u000b\b\u0002\u0010â\u0001\u001a\u0004\u0018\u00018\u00012\n\b\u0002\u0010¾\u0001\u001a\u00030Ú\u0001H\u0007¢\u0006\u0006\bã\u0001\u0010Ï\u0003Jh\u0010ã\u0001\u001a\u00030¿\u0001\"\n\b\u0000\u0010Á\u0003*\u00030À\u0003\"\u0010\b\u0001\u0010Î\u0003*\t\u0012\u0004\u0012\u00028\u00000Í\u00032\u0012\u0010Æ\u0003\u001a\r\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030Å\u00032\b\u0010È\u0003\u001a\u00030Ç\u00032\u000b\b\u0002\u0010â\u0001\u001a\u0004\u0018\u00018\u00012\n\b\u0002\u0010¾\u0001\u001a\u00030Ú\u0001H\u0007¢\u0006\u0006\bã\u0001\u0010Ð\u0003J1\u0010ç\u0001\u001a\u00030¿\u00012\u0010\u0010Æ\u0003\u001a\u000b\u0012\u0002\b\u0003\u0012\u0002\b\u00030Å\u00032\n\b\u0002\u0010¾\u0001\u001a\u00030Ú\u0001H\u0007¢\u0006\u0006\bç\u0001\u0010Ñ\u0003Jc\u0010À\u0001\u001a\u00030¿\u0001\"\u000e\b\u0000\u0010Ò\u0003*\u0007\u0012\u0002\b\u00030Â\u00032\u0012\u0010Æ\u0003\u001a\r\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000Å\u00032\f\b\u0002\u0010\u008c\u0001\u001a\u0005\u0018\u00010»\u00012\f\b\u0002\u0010Ó\u0003\u001a\u0005\u0018\u00010Ø\u00012\u000e\u0010¾\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000Ô\u0003H\u0007¢\u0006\u0006\bÀ\u0001\u0010Õ\u0003J\u0013\u0010×\u0003\u001a\u00030Ö\u0003H\u0007¢\u0006\u0006\b×\u0003\u0010Ø\u0003J\u0016\u0010Ù\u0003\u001a\u00020\u0015*\u00020\u001bH\u0002¢\u0006\u0006\bÙ\u0003\u0010Ú\u0003J\u0019\u0010Û\u0003\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0005\bÛ\u0003\u0010*JA\u0010ß\u0003\u001a\u00020\u001f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0007\u0010Ü\u0003\u001a\u00020\u001d2\u000b\b\u0002\u0010Ý\u0003\u001a\u0004\u0018\u00010\u001d2\u000b\b\u0002\u0010Þ\u0003\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0006\bß\u0003\u0010à\u0003J\u0016\u0010á\u0003\u001a\u00020z*\u00020zH\u0002¢\u0006\u0006\bá\u0003\u0010â\u0003J&\u0010å\u0003\u001a\u00020\u001f2\u0007\u0010ã\u0003\u001a\u00020\u001b2\t\b\u0002\u0010ä\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0006\bå\u0003\u0010æ\u0003R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010ç\u0003R\u0019\u0010è\u0003\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0003\u0010é\u0003R\u0019\u0010ê\u0003\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bê\u0003\u0010é\u0003R\u001f\u0010ì\u0003\u001a\n\u0012\u0005\u0012\u00030¿\u00010ë\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bì\u0003\u0010í\u0003R\u001d\u0010\r\u001a\u00020\f8@X\u0080\u0004¢\u0006\u000f\n\u0005\b\r\u0010î\u0003\u001a\u0006\bï\u0003\u0010ð\u0003R2\u0010\u001c\u001a\u0004\u0018\u0001022\t\u0010ñ\u0003\u001a\u0004\u0018\u0001028F@@X\u0086\u000e¢\u0006\u0015\n\u0005\b\u001c\u0010ò\u0003\u001a\u0004\b5\u00104\"\u0006\bó\u0003\u0010ô\u0003R0\u0010õ\u0003\u001a\u00020\u00152\u0007\u0010ñ\u0003\u001a\u00020\u00158@@@X\u0080\u000e¢\u0006\u0016\n\u0006\bõ\u0003\u0010é\u0003\u001a\u0005\bö\u0003\u0010\u0017\"\u0005\b÷\u0003\u0010=R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010ø\u0003R8\u0010ú\u0003\u001a\u0005\u0018\u00010ù\u00032\n\u0010ñ\u0003\u001a\u0005\u0018\u00010ù\u00038@@@X\u0080\u000e¢\u0006\u0018\n\u0006\bú\u0003\u0010û\u0003\u001a\u0006\bü\u0003\u0010ý\u0003\"\u0006\bþ\u0003\u0010ÿ\u0003R8\u0010\u0091\u0003\u001a\u0005\u0018\u00010\u008e\u00032\n\u0010ñ\u0003\u001a\u0005\u0018\u00010\u008e\u00038@@@X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0091\u0003\u0010\u0080\u0004\u001a\u0006\b\u0081\u0004\u0010\u0082\u0004\"\u0006\b\u0083\u0004\u0010\u0084\u0004R8\u0010\u0094\u0003\u001a\u0005\u0018\u00010\u0093\u00032\n\u0010ñ\u0003\u001a\u0005\u0018\u00010\u0093\u00038@@@X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0094\u0003\u0010\u0085\u0004\u001a\u0006\b\u0086\u0004\u0010\u0087\u0004\"\u0006\b\u0088\u0004\u0010\u0089\u0004R\u0018\u0010\u008d\u0004\u001a\u00030\u008a\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008b\u0004\u0010\u008c\u0004R7\u0010n\u001a\t\u0012\u0004\u0012\u00020k0\u008e\u00042\u000e\u0010\u008f\u0004\u001a\t\u0012\u0004\u0012\u00020k0\u008e\u00048@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b\u0090\u0004\u0010\u0091\u0004\"\u0006\b\u0092\u0004\u0010\u0093\u0004¨\u0006\u0095\u0004"}, d2 = {"Lcom/mapbox/maps/MapboxMap;", "Lcom/mapbox/maps/plugin/delegates/MapTransformDelegate;", "Lcom/mapbox/maps/plugin/delegates/MapProjectionDelegate;", "Lcom/mapbox/maps/plugin/delegates/MapFeatureQueryDelegate;", "Lcom/mapbox/maps/plugin/delegates/MapListenerDelegate;", "Lcom/mapbox/maps/plugin/delegates/MapPluginExtensionsDelegate;", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "Lcom/mapbox/maps/MapboxStyleManager;", "Lcom/mapbox/maps/plugin/delegates/MapInteractionDelegate;", "Lcom/mapbox/maps/plugin/delegates/MapFeatureStateDelegate;", "Lcom/mapbox/maps/NativeMapImpl;", "nativeMap", "Lcom/mapbox/maps/NativeObserver;", "nativeObserver", "Lcom/mapbox/maps/StyleObserver;", "styleObserver", "<init>", "(Lcom/mapbox/maps/NativeMapImpl;Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/StyleObserver;)V", "", "pixelRatio", "(Lcom/mapbox/maps/NativeMapImpl;Lcom/mapbox/maps/NativeObserver;F)V", "", "isValid", "()Z", "Lcom/mapbox/maps/MapboxMapRecorder;", "createRecorder", "()Lcom/mapbox/maps/MapboxMapRecorder;", "", TtmlNode.TAG_STYLE, "Lcom/mapbox/maps/Style$OnStyleLoaded;", "onStyleLoaded", "", "loadStyle", "(Ljava/lang/String;Lcom/mapbox/maps/Style$OnStyleLoaded;)V", "styleUri", "Lcom/mapbox/maps/TransitionOptions;", "styleTransitionOptions", "Lcom/mapbox/maps/plugin/delegates/listeners/OnMapLoadErrorListener;", "onMapLoadErrorListener", "loadStyleUri", "(Ljava/lang/String;Lcom/mapbox/maps/TransitionOptions;Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/plugin/delegates/listeners/OnMapLoadErrorListener;)V", "(Ljava/lang/String;Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/plugin/delegates/listeners/OnMapLoadErrorListener;)V", "(Ljava/lang/String;)V", "styleJson", "loadStyleJson", "Lcom/mapbox/maps/extension/style/StyleContract$StyleExtension;", "styleExtension", "(Lcom/mapbox/maps/extension/style/StyleContract$StyleExtension;Lcom/mapbox/maps/Style$OnStyleLoaded;)V", "(Lcom/mapbox/maps/extension/style/StyleContract$StyleExtension;Lcom/mapbox/maps/TransitionOptions;Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/plugin/delegates/listeners/OnMapLoadErrorListener;)V", "(Lcom/mapbox/maps/extension/style/StyleContract$StyleExtension;Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/plugin/delegates/listeners/OnMapLoadErrorListener;)V", "Lcom/mapbox/maps/Style;", "getStyleDeprecated", "()Lcom/mapbox/maps/Style;", "getStyle", "(Lcom/mapbox/maps/Style$OnStyleLoaded;)V", "Lcom/mapbox/maps/CameraOptions;", "cameraOptions", "setCamera", "(Lcom/mapbox/maps/CameraOptions;)V", "inProgress", "setGestureInProgress", "(Z)V", "isGestureInProgress", "Lcom/mapbox/maps/NorthOrientation;", "northOrientation", "setNorthOrientation", "(Lcom/mapbox/maps/NorthOrientation;)V", "Lcom/mapbox/maps/ConstrainMode;", "constrainMode", "setConstrainMode", "(Lcom/mapbox/maps/ConstrainMode;)V", "Lcom/mapbox/maps/ViewportMode;", "viewportMode", "setViewportMode", "(Lcom/mapbox/maps/ViewportMode;)V", "Lcom/mapbox/maps/CameraBoundsOptions;", "options", "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/bindgen/None;", "setBounds", "(Lcom/mapbox/maps/CameraBoundsOptions;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/maps/CameraBounds;", "getBounds", "()Lcom/mapbox/maps/CameraBounds;", "setUserAnimationInProgress", "Lcom/mapbox/maps/CameraAnimationHint;", "cameraAnimationHint", "setCameraAnimationHint", "(Lcom/mapbox/maps/CameraAnimationHint;)V", "isUserAnimationInProgress", "", "delta", "setPrefetchZoomDelta", "(B)V", "getPrefetchZoomDelta", "()B", "Lcom/mapbox/maps/MapOptions;", "getMapOptions", "()Lcom/mapbox/maps/MapOptions;", "Lcom/mapbox/maps/Size;", "getSize", "()Lcom/mapbox/maps/Size;", "Lkotlin/Function0;", "action", "whenSizeReady", "(Le23/a;)V", "", "Lcom/mapbox/maps/MapDebugOptions;", "getDebug", "()Ljava/util/List;", "debugOptions", "enabled", "setDebug", "(Ljava/util/List;Z)V", "Lcom/mapbox/maps/CoordinateBounds;", "bounds", "Lcom/mapbox/maps/EdgeInsets;", "boundsPadding", "", "bearing", "pitch", "maxZoom", "Lcom/mapbox/maps/ScreenCoordinate;", MapboxMap.QFE_OFFSET, "cameraForCoordinateBounds", "(Lcom/mapbox/maps/CoordinateBounds;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;", "Lcom/mapbox/geojson/Point;", "coordinates", "coordinatesPadding", "cameraForCoordinates", "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;", "camera", "Lcom/mapbox/maps/ScreenBox;", "box", "(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/ScreenBox;)Lcom/mapbox/maps/CameraOptions;", "(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;", "Lkotlin/Function1;", "result", "(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Le23/l;)V", "Lcom/mapbox/geojson/Geometry;", "geometry", "geometryPadding", "cameraForGeometry", "(Lcom/mapbox/geojson/Geometry;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;", "coordinateBoundsForCamera", "(Lcom/mapbox/maps/CameraOptions;)Lcom/mapbox/maps/CoordinateBounds;", "coordinateBoundsForCameraUnwrapped", "Lcom/mapbox/maps/CoordinateBoundsZoom;", "coordinateBoundsZoomForCamera", "(Lcom/mapbox/maps/CameraOptions;)Lcom/mapbox/maps/CoordinateBoundsZoom;", "coordinateBoundsZoomForCameraUnwrapped", "Landroid/graphics/RectF;", "rectF", "coordinateBoundsForRect", "(Landroid/graphics/RectF;)Lcom/mapbox/maps/CoordinateBounds;", "coordinate", "pixelForCoordinate", "(Lcom/mapbox/geojson/Point;)Lcom/mapbox/maps/ScreenCoordinate;", "pixelsForCoordinates", "(Ljava/util/List;)Ljava/util/List;", "pixel", "coordinateForPixel", "(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/geojson/Point;", "pixels", "coordinatesForPixels", "Lcom/mapbox/maps/CoordinateInfo;", "coordinateInfoForPixel", "(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CoordinateInfo;", "coordinatesInfoForPixels", "latitude", "zoom", "getMetersPerPixelAtLatitude", "(DD)D", "(D)D", "point", "Lcom/mapbox/maps/ProjectedMeters;", "projectedMetersForCoordinate", "(Lcom/mapbox/geojson/Point;)Lcom/mapbox/maps/ProjectedMeters;", "projectedMeters", "coordinateForProjectedMeters", "(Lcom/mapbox/maps/ProjectedMeters;)Lcom/mapbox/geojson/Point;", "zoomScale", "Lcom/mapbox/maps/MercatorCoordinate;", "project", "(Lcom/mapbox/geojson/Point;D)Lcom/mapbox/maps/MercatorCoordinate;", "unproject", "(Lcom/mapbox/maps/MercatorCoordinate;D)Lcom/mapbox/geojson/Point;", "Lcom/mapbox/maps/RenderedQueryGeometry;", "Lcom/mapbox/maps/RenderedQueryOptions;", "Lcom/mapbox/maps/QueryRenderedFeaturesCallback;", "callback", "Lcom/mapbox/common/Cancelable;", "queryRenderedFeatures", "(Lcom/mapbox/maps/RenderedQueryGeometry;Lcom/mapbox/maps/RenderedQueryOptions;Lcom/mapbox/maps/QueryRenderedFeaturesCallback;)Lcom/mapbox/common/Cancelable;", "sourceId", "Lcom/mapbox/maps/SourceQueryOptions;", "Lcom/mapbox/maps/QuerySourceFeaturesCallback;", "querySourceFeatures", "(Ljava/lang/String;Lcom/mapbox/maps/SourceQueryOptions;Lcom/mapbox/maps/QuerySourceFeaturesCallback;)Lcom/mapbox/common/Cancelable;", "Ljava/lang/Runnable;", "runnable", "executeOnRenderThread", "(Ljava/lang/Runnable;)V", "sourceIdentifier", "Lcom/mapbox/geojson/Feature;", "cluster", "", MapboxMap.QFE_LIMIT, "Lcom/mapbox/maps/QueryFeatureExtensionCallback;", "getGeoJsonClusterLeaves", "(Ljava/lang/String;Lcom/mapbox/geojson/Feature;JJLcom/mapbox/maps/QueryFeatureExtensionCallback;)Lcom/mapbox/common/Cancelable;", "getGeoJsonClusterChildren", "(Ljava/lang/String;Lcom/mapbox/geojson/Feature;Lcom/mapbox/maps/QueryFeatureExtensionCallback;)Lcom/mapbox/common/Cancelable;", "getGeoJsonClusterExpansionZoom", "sourceLayerId", "featureId", "Lcom/mapbox/bindgen/Value;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/mapbox/maps/FeatureStateOperationCallback;", "setFeatureState", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/QueryFeatureStateCallback;", "getFeatureState", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/QueryFeatureStateCallback;)Lcom/mapbox/common/Cancelable;", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/QueryFeatureStateCallback;)Lcom/mapbox/common/Cancelable;", "stateKey", "removeFeatureState", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "resetFeatureStates", "(Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "reduceMemoryUse", "()V", "Lcom/mapbox/maps/MapLoadedCallback;", "mapLoadedCallback", "subscribeMapLoaded", "(Lcom/mapbox/maps/MapLoadedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/MapIdleCallback;", "mapIdleCallback", "subscribeMapIdle", "(Lcom/mapbox/maps/MapIdleCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/MapLoadingErrorCallback;", "mapLoadingErrorCallback", "subscribeMapLoadingError", "(Lcom/mapbox/maps/MapLoadingErrorCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleLoadedCallback;", "styleLoadedCallback", "subscribeStyleLoaded", "(Lcom/mapbox/maps/StyleLoadedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleDataLoadedCallback;", "styleDataLoadedCallback", "subscribeStyleDataLoaded", "(Lcom/mapbox/maps/StyleDataLoadedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceDataLoadedCallback;", "sourceDataLoadedCallback", "subscribeSourceDataLoaded", "(Lcom/mapbox/maps/SourceDataLoadedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceAddedCallback;", "sourceAddedCallback", "subscribeSourceAdded", "(Lcom/mapbox/maps/SourceAddedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceRemovedCallback;", "sourceRemovedCallback", "subscribeSourceRemoved", "(Lcom/mapbox/maps/SourceRemovedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleImageMissingCallback;", "styleImageMissingCallback", "subscribeStyleImageMissing", "(Lcom/mapbox/maps/StyleImageMissingCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;", "styleImageRemoveUnusedCallback", "subscribeStyleImageRemoveUnused", "(Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/CameraChangedCallback;", "cameraChangedCallback", "subscribeCameraChanged", "(Lcom/mapbox/maps/CameraChangedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/CameraChangedCoalescedCallback;", "cameraChangedCoalescedCallback", "subscribeCameraChangedCoalesced", "(Lcom/mapbox/maps/CameraChangedCoalescedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/RenderFrameStartedCallback;", "renderFrameStartedCallback", "subscribeRenderFrameStarted", "(Lcom/mapbox/maps/RenderFrameStartedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/RenderFrameFinishedCallback;", "renderFrameFinishedCallback", "subscribeRenderFrameFinished", "(Lcom/mapbox/maps/RenderFrameFinishedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/ResourceRequestCallback;", "resourceRequestCallback", "subscribeResourceRequest", "(Lcom/mapbox/maps/ResourceRequestCallback;)Lcom/mapbox/common/Cancelable;", "eventName", "Lcom/mapbox/maps/GenericEventCallback;", "genericEventCallback", "subscribeGenericEvent", "(Ljava/lang/String;Lcom/mapbox/maps/GenericEventCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/plugin/delegates/listeners/OnCameraChangeListener;", "onCameraChangeListener", "addOnCameraChangeListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnCameraChangeListener;)V", "removeOnCameraChangeListener", "Lcom/mapbox/maps/plugin/delegates/listeners/OnMapIdleListener;", "onMapIdleListener", "addOnMapIdleListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnMapIdleListener;)V", "removeOnMapIdleListener", "addOnMapLoadErrorListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnMapLoadErrorListener;)V", "removeOnMapLoadErrorListener", "Lcom/mapbox/maps/plugin/delegates/listeners/OnMapLoadedListener;", "onMapLoadedListener", "addOnMapLoadedListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnMapLoadedListener;)V", "removeOnMapLoadedListener", "Lcom/mapbox/maps/plugin/delegates/listeners/OnRenderFrameStartedListener;", "onRenderFrameStartedListener", "addOnRenderFrameStartedListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnRenderFrameStartedListener;)V", "removeOnRenderFrameStartedListener", "Lcom/mapbox/maps/plugin/delegates/listeners/OnRenderFrameFinishedListener;", "onRenderFrameFinishedListener", "addOnRenderFrameFinishedListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnRenderFrameFinishedListener;)V", "removeOnRenderFrameFinishedListener", "Lcom/mapbox/maps/plugin/delegates/listeners/OnSourceAddedListener;", "onSourceAddedListener", "addOnSourceAddedListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnSourceAddedListener;)V", "removeOnSourceAddedListener", "Lcom/mapbox/maps/plugin/delegates/listeners/OnSourceDataLoadedListener;", "onSourceDataLoadedListener", "addOnSourceDataLoadedListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnSourceDataLoadedListener;)V", "removeOnSourceDataLoadedListener", "Lcom/mapbox/maps/plugin/delegates/listeners/OnSourceRemovedListener;", "onSourceRemovedListener", "addOnSourceRemovedListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnSourceRemovedListener;)V", "removeOnSourceRemovedListener", "Lcom/mapbox/maps/plugin/delegates/listeners/OnStyleLoadedListener;", "onStyleLoadedListener", "addOnStyleLoadedListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnStyleLoadedListener;)V", "removeOnStyleLoadedListener", "Lcom/mapbox/maps/plugin/delegates/listeners/OnStyleDataLoadedListener;", "onStyleDataLoadedListener", "addOnStyleDataLoadedListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnStyleDataLoadedListener;)V", "removeOnStyleDataLoadedListener", "Lcom/mapbox/maps/plugin/delegates/listeners/OnStyleImageMissingListener;", "onStyleImageMissingListener", "addOnStyleImageMissingListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnStyleImageMissingListener;)V", "removeOnStyleImageMissingListener", "Lcom/mapbox/maps/plugin/delegates/listeners/OnStyleImageUnusedListener;", "onStyleImageUnusedListener", "addOnStyleImageUnusedListener", "(Lcom/mapbox/maps/plugin/delegates/listeners/OnStyleImageUnusedListener;)V", "removeOnStyleImageUnusedListener", "triggerRepaint", "Lcom/mapbox/maps/FreeCameraOptions;", "getFreeCameraOptions", "()Lcom/mapbox/maps/FreeCameraOptions;", "freeCameraOptions", "(Lcom/mapbox/maps/FreeCameraOptions;)V", "getElevation", "(Lcom/mapbox/geojson/Point;)Ljava/lang/Double;", "Lcom/mapbox/maps/TileCacheBudget;", "tileCacheBudget", "setTileCacheBudget", "(Lcom/mapbox/maps/TileCacheBudget;)V", "renderWorldCopies", "setRenderWorldCopies", "getRenderWorldCopies", "Lcom/mapbox/maps/Vec2;", "shape", "setScreenCullingShape", "(Ljava/util/List;)V", "getScreenCullingShape", "Lcom/mapbox/maps/PerformanceStatisticsOptions;", "Lcom/mapbox/maps/PerformanceStatisticsCallback;", "startPerformanceStatisticsCollection", "(Lcom/mapbox/maps/PerformanceStatisticsOptions;Lcom/mapbox/maps/PerformanceStatisticsCallback;)V", "stopPerformanceStatisticsCollection", "fromPoint", "toPoint", "cameraForDrag", "(Lcom/mapbox/maps/ScreenCoordinate;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;", "Lcom/mapbox/maps/MapCenterAltitudeMode;", "mode", "setCenterAltitudeMode", "(Lcom/mapbox/maps/MapCenterAltitudeMode;)V", "getCenterAltitudeMode", "()Lcom/mapbox/maps/MapCenterAltitudeMode;", "Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;", "", "function", "cameraAnimationsPlugin", "(Le23/l;)Ljava/lang/Object;", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "gesturesPlugin", "onDestroy$maps_sdk_release", "onDestroy", "Lcom/mapbox/maps/TileCoverOptions;", "tileCoverOptions", "Lcom/mapbox/maps/CanonicalTileID;", "tileCover", "(Lcom/mapbox/maps/TileCoverOptions;Lcom/mapbox/maps/CameraOptions;)Ljava/util/List;", "getAttributions", "viewId", "Lcom/mapbox/maps/ViewAnnotationOptions;", "addViewAnnotation$maps_sdk_release", "(Ljava/lang/String;Lcom/mapbox/maps/ViewAnnotationOptions;)Lcom/mapbox/bindgen/Expected;", "addViewAnnotation", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "layerIds", "setViewAnnotationAvoidLayers$maps_sdk_release", "(Ljava/util/HashSet;)Lcom/mapbox/bindgen/Expected;", "setViewAnnotationAvoidLayers", "getViewAnnotationAvoidLayers$maps_sdk_release", "()Ljava/util/HashSet;", "getViewAnnotationAvoidLayers", "updateViewAnnotation$maps_sdk_release", "updateViewAnnotation", "removeViewAnnotation$maps_sdk_release", "(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;", "removeViewAnnotation", "identifier", "getViewAnnotationOptions$maps_sdk_release", "getViewAnnotationOptions", "Lcom/mapbox/maps/DelegatingViewAnnotationPositionsUpdateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setViewAnnotationPositionsUpdateListener$maps_sdk_release", "(Lcom/mapbox/maps/DelegatingViewAnnotationPositionsUpdateListener;)V", "setViewAnnotationPositionsUpdateListener", "Lcom/mapbox/maps/MapInteraction;", "interaction", "addInteraction", "(Lcom/mapbox/maps/MapInteraction;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/PlatformEventInfo;", "platformEventInfo", "dispatch", "(Lcom/mapbox/maps/PlatformEventInfo;)V", "Lcom/mapbox/maps/interactions/FeatureState;", "FS", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "featuresetFeature", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/maps/interactions/FeatureState;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;", "descriptor", "Lcom/mapbox/maps/FeaturesetFeatureId;", TtmlNode.ATTR_ID, "(Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Lcom/mapbox/maps/FeaturesetFeatureId;Lcom/mapbox/maps/interactions/FeatureState;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/interactions/FeatureStateCallback;", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/maps/interactions/FeatureStateCallback;)Lcom/mapbox/common/Cancelable;", "(Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Lcom/mapbox/maps/FeaturesetFeatureId;Lcom/mapbox/maps/interactions/FeatureStateCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/interactions/FeatureStateKey;", "FSK", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/maps/interactions/FeatureStateKey;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "(Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Lcom/mapbox/maps/FeaturesetFeatureId;Lcom/mapbox/maps/interactions/FeatureStateKey;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "(Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "FF", "filter", "Lcom/mapbox/maps/interactions/QueryRenderedFeaturesetFeaturesCallback;", "(Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Lcom/mapbox/maps/RenderedQueryGeometry;Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/interactions/QueryRenderedFeaturesetFeaturesCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/Map;", "getNativeMap", "()Lcom/mapbox/maps/Map;", "isValidUri", "(Ljava/lang/String;)Z", "applyStyle", "styleDataStyleLoadedListener", "styleDataSpritesLoadedListener", "styleDataSourcesLoadedListener", "initializeStyleLoad", "(Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/Style$OnStyleLoaded;)V", "clampScreenCoordinate", "(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/ScreenCoordinate;", "methodName", "checkMainThread", "checkNativeMap", "(Ljava/lang/String;Z)V", "Lcom/mapbox/maps/NativeMapImpl;", "isMapValid", "Z", "performanceCollectionStatisticsStarted", "", "interactions", "Ljava/util/List;", "Lcom/mapbox/maps/NativeObserver;", "getNativeObserver$maps_sdk_release", "()Lcom/mapbox/maps/NativeObserver;", "<set-?>", "Lcom/mapbox/maps/Style;", "setStyle$maps_sdk_release", "(Lcom/mapbox/maps/Style;)V", "isStyleLoadInitiated", "isStyleLoadInitiated$maps_sdk_release", "setStyleLoadInitiated$maps_sdk_release", "Lcom/mapbox/maps/StyleObserver;", "Landroid/os/Handler;", "renderHandler", "Landroid/os/Handler;", "getRenderHandler$maps_sdk_release", "()Landroid/os/Handler;", "setRenderHandler$maps_sdk_release", "(Landroid/os/Handler;)V", "Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;", "getCameraAnimationsPlugin$maps_sdk_release", "()Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;", "setCameraAnimationsPlugin$maps_sdk_release", "(Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;)V", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "getGesturesPlugin$maps_sdk_release", "()Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "setGesturesPlugin$maps_sdk_release", "(Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;)V", "Lcom/mapbox/maps/CameraState;", "getCameraState", "()Lcom/mapbox/maps/CameraState;", "cameraState", "", "value", "getDebugOptions$maps_sdk_release", "()Ljava/util/Set;", "setDebugOptions$maps_sdk_release", "(Ljava/util/Set;)V", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapboxMap extends MapboxStyleManager implements MapTransformDelegate, MapProjectionDelegate, MapFeatureQueryDelegate, MapListenerDelegate, MapPluginExtensionsDelegate, MapCameraManagerDelegate, MapInteractionDelegate, MapFeatureStateDelegate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final /* synthetic */ String QFE_CHILDREN = "children";
    public static final /* synthetic */ long QFE_DEFAULT_LIMIT = 10;
    public static final /* synthetic */ long QFE_DEFAULT_OFFSET = 0;
    public static final /* synthetic */ String QFE_EXPANSION_ZOOM = "expansion-zoom";
    public static final /* synthetic */ String QFE_LEAVES = "leaves";
    public static final /* synthetic */ String QFE_LIMIT = "limit";
    public static final /* synthetic */ String QFE_OFFSET = "offset";
    public static final /* synthetic */ String QFE_SUPER_CLUSTER = "supercluster";
    private static final String TAG = "Mbgl-MapboxMap";
    private CameraAnimationsPlugin cameraAnimationsPlugin;
    private GesturesPlugin gesturesPlugin;
    private final List<Cancelable> interactions;
    private boolean isMapValid;
    private boolean isStyleLoadInitiated;
    private final NativeMapImpl nativeMap;
    private final NativeObserver nativeObserver;
    private boolean performanceCollectionStatisticsStarted;
    private Handler renderHandler;
    private Style style;
    private final StyleObserver styleObserver;

    private MapboxMap(NativeMapImpl nativeMapImpl, NativeObserver nativeObserver, float f14) {
        super(nativeMapImpl.getMap(), f14, new com.google.firebase.crashlytics.internal.common.i(nativeObserver, 9));
        this.isMapValid = true;
        this.interactions = new ArrayList();
        this.nativeMap = nativeMapImpl;
        this.nativeObserver = nativeObserver;
        this.styleObserver = new StyleObserver(nativeMapImpl.getMap(), new a(this, 1), nativeObserver, f14, new com.google.firebase.crashlytics.internal.common.i(this, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(NativeObserver nativeObserver, MapLoadingError mapLoadingError) {
        nativeObserver.getClass();
        mapLoadingError.getClass();
        nativeObserver.sendMapLoadingError(mapLoadingError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(MapboxMap mapboxMap, MapLoadingError mapLoadingError) {
        mapboxMap.getClass();
        mapLoadingError.getClass();
        mapboxMap.nativeObserver.sendMapLoadingError(mapLoadingError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(MapboxMap mapboxMap, Style style) {
        mapboxMap.getClass();
        style.getClass();
        mapboxMap.style = style;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addInteraction$lambda$22(MapboxMap mapboxMap, Cancelable cancelable) {
        mapboxMap.getClass();
        cancelable.getClass();
        mapboxMap.interactions.remove(cancelable);
        cancelable.cancel();
    }

    private final void applyStyle(String style) {
        boolean zIsValidUri = isValidUri(style);
        NativeMapImpl nativeMapImpl = this.nativeMap;
        if (zIsValidUri) {
            nativeMapImpl.setStyleURI(style);
            return;
        }
        if (w.J(style)) {
            style = "{}";
        }
        nativeMapImpl.setStyleJSON(style);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraOptions cameraForCoordinates$lambda$17(List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d14, ScreenCoordinate screenCoordinate, MapboxMap mapboxMap, String str) {
        list.getClass();
        cameraOptions.getClass();
        mapboxMap.getClass();
        str.getClass();
        MapboxLogger.logE(TAG, "Error occurred in synchronous cameraForCoordinates(coordinates: " + list + ", camera: " + cameraOptions + ", coordinatesPadding: " + edgeInsets + ", maxZoom: " + d14 + ", offset: " + screenCoordinate + ", mapSize: " + mapboxMap.nativeMap.getSize() + "): " + str + ", empty cameraState will be returned");
        CameraOptions cameraOptionsBuild = new CameraOptions.Builder().build();
        cameraOptionsBuild.getClass();
        return cameraOptionsBuild;
    }

    private final void checkNativeMap(String methodName, boolean checkMainThread) {
        if (checkMainThread) {
            ThreadChecker.INSTANCE.throwIfNotMainThread();
        }
        if (this.isMapValid) {
            return;
        }
        MapboxLogger.logW(TAG, "MapboxMap object (accessing " + methodName + ") should not be stored and used after MapView is destroyed.");
    }

    public static /* synthetic */ void checkNativeMap$default(MapboxMap mapboxMap, String str, boolean z14, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            z14 = true;
        }
        mapboxMap.checkNativeMap(str, z14);
    }

    private final ScreenCoordinate clampScreenCoordinate(ScreenCoordinate screenCoordinate) {
        Size size = this.nativeMap.getSize();
        double x14 = screenCoordinate.getX();
        double y14 = screenCoordinate.getY();
        if (screenCoordinate.getX() < 0.0d || screenCoordinate.getX() > size.getWidth()) {
            x14 = MathKt.b(screenCoordinate.getX());
        }
        if (screenCoordinate.getY() < 0.0d || screenCoordinate.getY() > size.getHeight()) {
            y14 = MathKt.b(screenCoordinate.getY());
        }
        return (0.0d > x14 || x14 > ((double) size.getWidth()) || 0.0d > y14 || y14 > ((double) size.getHeight())) ? new ScreenCoordinate(-1.0d, -1.0d) : new ScreenCoordinate(x14, y14);
    }

    public static final void clearData(AsyncOperationResultCallback asyncOperationResultCallback) {
        INSTANCE.clearData(asyncOperationResultCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getFeatureState$lambda$30$lambda$29(FeatureStateCallback featureStateCallback, FeaturesetFeature featuresetFeature, Expected expected) {
        featureStateCallback.getClass();
        featuresetFeature.getClass();
        expected.getClass();
        expected.onValue(new f(featuresetFeature, featureStateCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getFeatureState$lambda$30$lambda$29$lambda$28(FeatureStateCallback featureStateCallback, FeaturesetFeature featuresetFeature, Value value) {
        featureStateCallback.getClass();
        featuresetFeature.getClass();
        value.getClass();
        featureStateCallback.onFeatureState(featuresetFeature.getDescriptor().getFeatureState(value));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getFeatureState$lambda$31() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getFeatureState$lambda$34(FeatureStateCallback featureStateCallback, TypedFeaturesetDescriptor typedFeaturesetDescriptor, Expected expected) {
        featureStateCallback.getClass();
        typedFeaturesetDescriptor.getClass();
        expected.getClass();
        expected.onValue(new e(featureStateCallback, typedFeaturesetDescriptor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getFeatureState$lambda$34$lambda$33(FeatureStateCallback featureStateCallback, TypedFeaturesetDescriptor typedFeaturesetDescriptor, Value value) {
        featureStateCallback.getClass();
        typedFeaturesetDescriptor.getClass();
        value.getClass();
        featureStateCallback.onFeatureState(typedFeaturesetDescriptor.getFeatureState(value));
    }

    public static /* synthetic */ Cancelable getGeoJsonClusterLeaves$default(MapboxMap mapboxMap, String str, Feature feature, long j8, long j14, QueryFeatureExtensionCallback queryFeatureExtensionCallback, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            j8 = 10;
        }
        return mapboxMap.getGeoJsonClusterLeaves(str, feature, j8, (i14 & 8) != 0 ? 0L : j14, queryFeatureExtensionCallback);
    }

    private final void initializeStyleLoad(Style.OnStyleLoaded onStyleLoaded, Style.OnStyleLoaded styleDataStyleLoadedListener, Style.OnStyleLoaded styleDataSpritesLoadedListener, Style.OnStyleLoaded styleDataSourcesLoadedListener) {
        this.style = null;
        this.styleObserver.setLoadStyleListener(onStyleLoaded, styleDataStyleLoadedListener, styleDataSpritesLoadedListener, styleDataSourcesLoadedListener);
        this.isStyleLoadInitiated = true;
    }

    public static /* synthetic */ void initializeStyleLoad$default(MapboxMap mapboxMap, Style.OnStyleLoaded onStyleLoaded, Style.OnStyleLoaded onStyleLoaded2, Style.OnStyleLoaded onStyleLoaded3, Style.OnStyleLoaded onStyleLoaded4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            onStyleLoaded = null;
        }
        if ((i14 & 4) != 0) {
            onStyleLoaded3 = null;
        }
        if ((i14 & 8) != 0) {
            onStyleLoaded4 = null;
        }
        mapboxMap.initializeStyleLoad(onStyleLoaded, onStyleLoaded2, onStyleLoaded3, onStyleLoaded4);
    }

    private final boolean isValidUri(String str) {
        return u.y(str, "mapbox://", true) || u.y(str, "asset://", true) || u.y(str, "file://", true) || URLUtil.isValidUrl(str);
    }

    public static /* synthetic */ void loadStyle$default(MapboxMap mapboxMap, StyleContract.StyleExtension styleExtension, TransitionOptions transitionOptions, Style.OnStyleLoaded onStyleLoaded, OnMapLoadErrorListener onMapLoadErrorListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            transitionOptions = null;
        }
        if ((i14 & 4) != 0) {
            onStyleLoaded = null;
        }
        if ((i14 & 8) != 0) {
            onMapLoadErrorListener = null;
        }
        mapboxMap.loadStyle(styleExtension, transitionOptions, onStyleLoaded, onMapLoadErrorListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void loadStyle$lambda$10(StyleContract.StyleExtension styleExtension, Style style) {
        styleExtension.getClass();
        style.getClass();
        Iterator<T> it = styleExtension.getSources().iterator();
        while (it.hasNext()) {
            ((StyleContract.StyleSourceExtension) it.next()).bindTo(style);
        }
        Iterator<T> it3 = styleExtension.getLayers().iterator();
        while (it3.hasNext()) {
            o13.p pVar = (o13.p) it3.next();
            ((StyleContract.StyleLayerExtension) pVar.f128594a).bindTo(style, (LayerPosition) pVar.f128595b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadStyle$lambda$13(StyleContract.StyleExtension styleExtension, Style style) {
        styleExtension.getClass();
        style.getClass();
        Iterator<T> it = styleExtension.getImages().iterator();
        while (it.hasNext()) {
            ((StyleContract.StyleImageExtension) it.next()).bindTo(style);
        }
        Iterator<T> it3 = styleExtension.getModels().iterator();
        while (it3.hasNext()) {
            ((StyleContract.StyleModelExtension) it3.next()).bindTo(style);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadStyle$lambda$7(StyleContract.StyleExtension styleExtension, Style style) {
        styleExtension.getClass();
        style.getClass();
        StyleContract.StyleLightExtension flatLight = styleExtension.getFlatLight();
        if (flatLight != null) {
            flatLight.bindTo(style);
        }
        StyleContract.StyleLightExtension dynamicLight = styleExtension.getDynamicLight();
        if (dynamicLight != null) {
            dynamicLight.bindTo(style);
        }
        StyleContract.StyleTerrainExtension terrain = styleExtension.getTerrain();
        if (terrain != null) {
            terrain.bindTo(style);
        }
        StyleContract.StyleAtmosphereExtension atmosphere = styleExtension.getAtmosphere();
        if (atmosphere != null) {
            atmosphere.bindTo(style);
        }
        StyleContract.StyleProjectionExtension projection = styleExtension.getProjection();
        if (projection != null) {
            projection.bindTo(style);
        }
        TransitionOptions transition = styleExtension.getTransition();
        if (transition != null) {
            style.setStyleTransition(transition);
        }
        StyleContract.StyleRainExtension rain = styleExtension.getRain();
        if (rain != null) {
            rain.bindTo(style);
        }
        StyleContract.StyleSnowExtension snow = styleExtension.getSnow();
        if (snow != null) {
            snow.bindTo(style);
        }
        ColorTheme colorTheme = styleExtension.getColorTheme();
        if (colorTheme != null) {
            style.setStyleColorTheme(colorTheme);
        }
    }

    public static /* synthetic */ void loadStyleJson$default(MapboxMap mapboxMap, String str, TransitionOptions transitionOptions, Style.OnStyleLoaded onStyleLoaded, OnMapLoadErrorListener onMapLoadErrorListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            transitionOptions = null;
        }
        if ((i14 & 4) != 0) {
            onStyleLoaded = null;
        }
        if ((i14 & 8) != 0) {
            onMapLoadErrorListener = null;
        }
        mapboxMap.loadStyleJson(str, transitionOptions, onStyleLoaded, onMapLoadErrorListener);
    }

    public static /* synthetic */ void loadStyleUri$default(MapboxMap mapboxMap, String str, TransitionOptions transitionOptions, Style.OnStyleLoaded onStyleLoaded, OnMapLoadErrorListener onMapLoadErrorListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            transitionOptions = null;
        }
        if ((i14 & 4) != 0) {
            onStyleLoaded = null;
        }
        if ((i14 & 8) != 0) {
            onMapLoadErrorListener = null;
        }
        mapboxMap.loadStyleUri(str, transitionOptions, onStyleLoaded, onMapLoadErrorListener);
    }

    public static /* synthetic */ Cancelable queryRenderedFeatures$default(MapboxMap mapboxMap, TypedFeaturesetDescriptor typedFeaturesetDescriptor, RenderedQueryGeometry renderedQueryGeometry, Value value, QueryRenderedFeaturesetFeaturesCallback queryRenderedFeaturesetFeaturesCallback, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            renderedQueryGeometry = null;
        }
        if ((i14 & 4) != 0) {
            value = null;
        }
        return mapboxMap.queryRenderedFeatures(typedFeaturesetDescriptor, renderedQueryGeometry, value, queryRenderedFeaturesetFeaturesCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryRenderedFeatures$lambda$44(QueryRenderedFeaturesetFeaturesCallback queryRenderedFeaturesetFeaturesCallback, TypedFeaturesetDescriptor typedFeaturesetDescriptor, Expected expected) {
        queryRenderedFeaturesetFeaturesCallback.getClass();
        typedFeaturesetDescriptor.getClass();
        expected.getClass();
        expected.onValue(new h(typedFeaturesetDescriptor, queryRenderedFeaturesetFeaturesCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryRenderedFeatures$lambda$44$lambda$43(QueryRenderedFeaturesetFeaturesCallback queryRenderedFeaturesetFeaturesCallback, TypedFeaturesetDescriptor typedFeaturesetDescriptor, List list) {
        queryRenderedFeaturesetFeaturesCallback.getClass();
        typedFeaturesetDescriptor.getClass();
        list.getClass();
        ArrayList<QueriedRenderedFeature> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((QueriedRenderedFeature) obj).getQueriedFeature().getFeature().geometry() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        for (QueriedRenderedFeature queriedRenderedFeature : arrayList) {
            Feature feature = queriedRenderedFeature.getQueriedFeature().getFeature();
            feature.getClass();
            FeaturesetFeatureId featuresetFeatureId = queriedRenderedFeature.getQueriedFeature().getFeaturesetFeatureId();
            String featureNamespace = featuresetFeatureId != null ? featuresetFeatureId.getFeatureNamespace() : null;
            Value state = queriedRenderedFeature.getQueriedFeature().getState();
            state.getClass();
            arrayList2.add(typedFeaturesetDescriptor.getFeaturesetFeature(feature, featureNamespace, state));
        }
        queryRenderedFeaturesetFeaturesCallback.onQueryRenderedFeatures(arrayList2);
    }

    public static /* synthetic */ Cancelable removeFeatureState$default(MapboxMap mapboxMap, FeaturesetFeature featuresetFeature, FeatureStateKey featureStateKey, FeatureStateOperationCallback featureStateOperationCallback, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            featureStateKey = null;
        }
        if ((i14 & 4) != 0) {
            featureStateOperationCallback = new com.google.protobuf.a(22);
        }
        return mapboxMap.removeFeatureState(featuresetFeature, featureStateKey, featureStateOperationCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeFeatureState$lambda$37() {
    }

    public static /* synthetic */ Cancelable resetFeatureStates$default(MapboxMap mapboxMap, TypedFeaturesetDescriptor typedFeaturesetDescriptor, FeatureStateOperationCallback featureStateOperationCallback, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            featureStateOperationCallback = new com.google.protobuf.a(27);
        }
        return mapboxMap.resetFeatureStates((TypedFeaturesetDescriptor<?, ?>) typedFeaturesetDescriptor, featureStateOperationCallback);
    }

    public static /* synthetic */ Cancelable setFeatureState$default(MapboxMap mapboxMap, FeaturesetFeature featuresetFeature, FeatureState featureState, FeatureStateOperationCallback featureStateOperationCallback, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            featureStateOperationCallback = new com.google.protobuf.a(24);
        }
        return mapboxMap.setFeatureState((FeaturesetFeature<FeatureState>) featuresetFeature, featureState, featureStateOperationCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFeatureState$lambda$25() {
    }

    @Override // com.mapbox.maps.plugin.delegates.MapInteractionDelegate
    @MapboxExperimental
    public Cancelable addInteraction(MapInteraction interaction) {
        interaction.getClass();
        checkNativeMap$default(this, "addInteraction", false, 2, null);
        NativeMapImpl nativeMapImpl = this.nativeMap;
        Interaction interaction2 = interaction.coreInteraction;
        interaction2.getClass();
        Cancelable cancelableAddInteraction = nativeMapImpl.addInteraction(interaction2);
        this.interactions.add(cancelableAddInteraction);
        return new i(0, this, cancelableAddInteraction);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void addOnCameraChangeListener(OnCameraChangeListener onCameraChangeListener) {
        onCameraChangeListener.getClass();
        checkNativeMap$default(this, "addOnCameraChangeListener", false, 2, null);
        this.nativeObserver.addOnCameraChangeListener(onCameraChangeListener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void addOnMapIdleListener(OnMapIdleListener onMapIdleListener) {
        onMapIdleListener.getClass();
        checkNativeMap$default(this, "addOnMapIdleListener", false, 2, null);
        this.nativeObserver.addOnMapIdleListener(onMapIdleListener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void addOnMapLoadErrorListener(OnMapLoadErrorListener onMapLoadErrorListener) {
        onMapLoadErrorListener.getClass();
        checkNativeMap$default(this, "addOnMapLoadErrorListener", false, 2, null);
        this.nativeObserver.addOnMapLoadErrorListener(onMapLoadErrorListener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void addOnMapLoadedListener(OnMapLoadedListener onMapLoadedListener) {
        onMapLoadedListener.getClass();
        checkNativeMap$default(this, "addOnMapLoadedListener", false, 2, null);
        this.nativeObserver.addOnMapLoadedListener(onMapLoadedListener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void addOnRenderFrameFinishedListener(OnRenderFrameFinishedListener onRenderFrameFinishedListener) {
        onRenderFrameFinishedListener.getClass();
        checkNativeMap$default(this, "addOnRenderFrameFinishedListener", false, 2, null);
        this.nativeObserver.addOnRenderFrameFinishedListener(onRenderFrameFinishedListener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void addOnRenderFrameStartedListener(OnRenderFrameStartedListener onRenderFrameStartedListener) {
        onRenderFrameStartedListener.getClass();
        checkNativeMap$default(this, "addOnRenderFrameStartedListener", false, 2, null);
        this.nativeObserver.addOnRenderFrameStartedListener(onRenderFrameStartedListener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void addOnSourceAddedListener(OnSourceAddedListener onSourceAddedListener) {
        onSourceAddedListener.getClass();
        checkNativeMap$default(this, "addOnSourceAddedListener", false, 2, null);
        this.nativeObserver.addOnSourceAddedListener(onSourceAddedListener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void addOnSourceDataLoadedListener(OnSourceDataLoadedListener onSourceDataLoadedListener) {
        onSourceDataLoadedListener.getClass();
        checkNativeMap$default(this, "addOnSourceDataLoadedListener", false, 2, null);
        this.nativeObserver.addOnSourceDataLoadedListener(onSourceDataLoadedListener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void addOnSourceRemovedListener(OnSourceRemovedListener onSourceRemovedListener) {
        onSourceRemovedListener.getClass();
        checkNativeMap$default(this, "addOnSourceRemovedListener", false, 2, null);
        this.nativeObserver.addOnSourceRemovedListener(onSourceRemovedListener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void addOnStyleDataLoadedListener(OnStyleDataLoadedListener onStyleDataLoadedListener) {
        onStyleDataLoadedListener.getClass();
        checkNativeMap$default(this, "addOnStyleDataLoadedListener", false, 2, null);
        this.nativeObserver.addOnStyleDataLoadedListener(onStyleDataLoadedListener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void addOnStyleImageMissingListener(OnStyleImageMissingListener onStyleImageMissingListener) {
        onStyleImageMissingListener.getClass();
        checkNativeMap$default(this, "addOnStyleImageMissingListener", false, 2, null);
        this.nativeObserver.addOnStyleImageMissingListener(onStyleImageMissingListener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void addOnStyleImageUnusedListener(OnStyleImageUnusedListener onStyleImageUnusedListener) {
        onStyleImageUnusedListener.getClass();
        checkNativeMap$default(this, "addOnStyleImageUnusedListener", false, 2, null);
        this.nativeObserver.addOnStyleImageUnusedListener(onStyleImageUnusedListener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void addOnStyleLoadedListener(OnStyleLoadedListener onStyleLoadedListener) {
        onStyleLoadedListener.getClass();
        checkNativeMap$default(this, "addOnStyleLoadedListener", false, 2, null);
        this.nativeObserver.addOnStyleLoadedListener(onStyleLoadedListener);
    }

    public final /* synthetic */ Expected addViewAnnotation$maps_sdk_release(String viewId, ViewAnnotationOptions options) {
        viewId.getClass();
        options.getClass();
        checkNativeMap$default(this, "addViewAnnotation", false, 2, null);
        return this.nativeMap.addViewAnnotation(viewId, options);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapPluginExtensionsDelegate
    public Object cameraAnimationsPlugin(e23.l<? super CameraAnimationsPlugin, ? extends Object> function) {
        function.getClass();
        CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin != null) {
            return function.invoke(cameraAnimationsPlugin);
        }
        MapboxLogger.logW(TAG, "Either camera plugin is not added to the MapView or MapView has already been destroyed; MapboxMap camera extension functions are no-op.");
        return null;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    @o13.e
    public CameraOptions cameraForCoordinateBounds(CoordinateBounds bounds, EdgeInsets boundsPadding, Double bearing, Double pitch, Double maxZoom, ScreenCoordinate offset) {
        bounds.getClass();
        checkNativeMap$default(this, "cameraForCoordinateBounds", false, 2, null);
        return this.nativeMap.cameraForCoordinateBounds(bounds, boundsPadding, bearing, pitch, maxZoom, offset);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    @MapboxDelicateApi
    public CameraOptions cameraForCoordinates(List<Point> coordinates, CameraOptions camera, EdgeInsets coordinatesPadding, Double maxZoom, ScreenCoordinate offset) {
        coordinates.getClass();
        camera.getClass();
        checkNativeMap$default(this, "cameraForCoordinates", false, 2, null);
        if (this.nativeMap.getSizeSet()) {
            CameraOptions valueOrElse = this.nativeMap.cameraForCoordinates(INSTANCE.calculateBoundingBox(coordinates), camera, coordinatesPadding, maxZoom, offset).getValueOrElse(new l(coordinates, camera, coordinatesPadding, maxZoom, offset, this, 1));
            valueOrElse.getClass();
            return valueOrElse;
        }
        CameraOptions cameraOptionsBuild = new CameraOptions.Builder().build();
        cameraOptionsBuild.getClass();
        return cameraOptionsBuild;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public CameraOptions cameraForDrag(ScreenCoordinate fromPoint, ScreenCoordinate toPoint) {
        fromPoint.getClass();
        toPoint.getClass();
        checkNativeMap$default(this, "cameraForDrag", false, 2, null);
        return this.nativeMap.cameraForDrag(fromPoint, toPoint);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    @o13.e
    public CameraOptions cameraForGeometry(Geometry geometry, EdgeInsets geometryPadding, Double bearing, Double pitch) {
        geometry.getClass();
        checkNativeMap$default(this, "cameraForGeometry", false, 2, null);
        return this.nativeMap.cameraForGeometry(geometry, geometryPadding, bearing, pitch);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public CoordinateBounds coordinateBoundsForCamera(CameraOptions camera) {
        camera.getClass();
        checkNativeMap$default(this, "coordinateBoundsForCamera", false, 2, null);
        return this.nativeMap.coordinateBoundsForCamera(camera);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public CoordinateBounds coordinateBoundsForCameraUnwrapped(CameraOptions camera) {
        camera.getClass();
        checkNativeMap$default(this, "coordinateBoundsForCameraUnwrapped", false, 2, null);
        return this.nativeMap.coordinateBoundsForCameraUnwrapped(camera);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public CoordinateBounds coordinateBoundsForRect(RectF rectF) {
        rectF.getClass();
        checkNativeMap$default(this, "coordinateBoundsForRect", false, 2, null);
        if (rectF.isEmpty()) {
            vb.h.s("RectF must not be empty");
            return null;
        }
        List<Point> listCoordinatesForPixels = this.nativeMap.coordinatesForPixels(x.m(new ScreenCoordinate(rectF.bottom, rectF.left), new ScreenCoordinate(rectF.top, rectF.right)));
        return new CoordinateBounds(listCoordinatesForPixels.get(0), listCoordinatesForPixels.get(1));
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public CoordinateBoundsZoom coordinateBoundsZoomForCamera(CameraOptions camera) {
        camera.getClass();
        checkNativeMap$default(this, "coordinateBoundsZoomForCamera", false, 2, null);
        return this.nativeMap.coordinateBoundsZoomForCamera(camera);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public CoordinateBoundsZoom coordinateBoundsZoomForCameraUnwrapped(CameraOptions camera) {
        camera.getClass();
        checkNativeMap$default(this, "coordinateBoundsZoomForCameraUnwrapped", false, 2, null);
        return this.nativeMap.coordinateBoundsZoomForCameraUnwrapped(camera);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public Point coordinateForPixel(ScreenCoordinate pixel) {
        pixel.getClass();
        checkNativeMap$default(this, "coordinateForPixel", false, 2, null);
        return this.nativeMap.coordinateForPixel(pixel);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapProjectionDelegate
    public Point coordinateForProjectedMeters(ProjectedMeters projectedMeters) {
        projectedMeters.getClass();
        Point pointCoordinateForProjectedMeters = Projection.coordinateForProjectedMeters(projectedMeters);
        pointCoordinateForProjectedMeters.getClass();
        return pointCoordinateForProjectedMeters;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public CoordinateInfo coordinateInfoForPixel(ScreenCoordinate pixel) {
        pixel.getClass();
        checkNativeMap$default(this, "coordinateInfoForPixel", false, 2, null);
        return this.nativeMap.coordinateInfoForPixel(pixel);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public List<Point> coordinatesForPixels(List<ScreenCoordinate> pixels) {
        pixels.getClass();
        checkNativeMap$default(this, "coordinatesForPixels", false, 2, null);
        return this.nativeMap.coordinatesForPixels(new ArrayList(pixels));
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public List<CoordinateInfo> coordinatesInfoForPixels(List<ScreenCoordinate> pixels) {
        pixels.getClass();
        checkNativeMap$default(this, "coordinatesInfoForPixels", false, 2, null);
        return this.nativeMap.coordinatesInfoForPixels(pixels);
    }

    @MapboxExperimental
    public final MapboxMapRecorder createRecorder() {
        Expected<String, MapRecorder> expectedCreateInstance = MapRecorder.createInstance(this.nativeMap.getMap());
        if (expectedCreateInstance.isValue()) {
            MapRecorder value = expectedCreateInstance.getValue();
            value.getClass();
            return new MapboxMapRecorder(value);
        }
        String error = expectedCreateInstance.getError();
        if (error == null) {
            error = "Error occurred in MapboxMap.createRecorder!";
        }
        throw new RuntimeException(error);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapInteractionDelegate
    @MapboxExperimental
    public void dispatch(PlatformEventInfo platformEventInfo) {
        platformEventInfo.getClass();
        checkNativeMap$default(this, "dispatch", false, 2, null);
        this.nativeMap.dispatch(platformEventInfo);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapFeatureQueryDelegate
    public void executeOnRenderThread(Runnable runnable) {
        runnable.getClass();
        checkNativeMap$default(this, "executeOnRenderThread", false, 2, null);
        Handler handler = this.renderHandler;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    @Override // com.mapbox.maps.plugin.delegates.MapPluginExtensionsDelegate
    public Object gesturesPlugin(e23.l<? super GesturesPlugin, ? extends Object> function) {
        function.getClass();
        GesturesPlugin gesturesPlugin = this.gesturesPlugin;
        if (gesturesPlugin != null) {
            return function.invoke(gesturesPlugin);
        }
        MapboxLogger.logW(TAG, "Either gestures plugin is not added to the MapView or MapView has already been destroyed; MapboxMap gestures extension functions are no-op.");
        return null;
    }

    public final List<String> getAttributions() {
        checkNativeMap$default(this, "getAttributions", false, 2, null);
        return this.nativeMap.getAttributions();
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public CameraBounds getBounds() {
        checkNativeMap$default(this, "getBounds", false, 2, null);
        return this.nativeMap.getBounds();
    }

    /* JADX INFO: renamed from: getCameraAnimationsPlugin$maps_sdk_release, reason: from getter */
    public final /* synthetic */ CameraAnimationsPlugin getCameraAnimationsPlugin() {
        return this.cameraAnimationsPlugin;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public CameraState getCameraState() {
        checkNativeMap$default(this, "cameraState", false, 2, null);
        return this.nativeMap.getCameraState();
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public MapCenterAltitudeMode getCenterAltitudeMode() {
        checkNativeMap$default(this, "getCenterAltitudeMode", false, 2, null);
        return this.nativeMap.getCenterAltitudeMode();
    }

    @o13.e
    public final List<MapDebugOptions> getDebug() {
        checkNativeMap$default(this, "getDebug", false, 2, null);
        return this.nativeMap.getDebug();
    }

    public final Set<MapDebugOptions> getDebugOptions$maps_sdk_release() {
        checkNativeMap$default(this, "getDebug", false, 2, null);
        return h0.g1(this.nativeMap.getDebug());
    }

    public final Double getElevation(Point coordinate) {
        coordinate.getClass();
        checkNativeMap$default(this, "getElevation", false, 2, null);
        return this.nativeMap.getElevation(coordinate);
    }

    @MapboxExperimental
    public final <FS extends FeatureState> Cancelable getFeatureState(FeaturesetFeature<FS> featuresetFeature, FeatureStateCallback<FS> callback) {
        Cancelable featureState;
        featuresetFeature.getClass();
        callback.getClass();
        checkNativeMap$default(this, "getFeatureState", false, 2, null);
        FeaturesetFeatureId id3 = featuresetFeature.getId();
        if (id3 != null && (featureState = this.nativeMap.getFeatureState(featuresetFeature.getDescriptor().toFeaturesetDescriptor(), id3, new f(featuresetFeature, callback))) != null) {
            return featureState;
        }
        g gVar = new g(0);
        MapboxLogger.logE(TAG, "getFeatureState called but featuresetFeature.id is NULL!");
        return gVar;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public FreeCameraOptions getFreeCameraOptions() {
        checkNativeMap$default(this, "getFreeCameraOptions", false, 2, null);
        return this.nativeMap.getFreeCameraOptions();
    }

    public final Cancelable getGeoJsonClusterChildren(String sourceIdentifier, Feature cluster, QueryFeatureExtensionCallback callback) {
        sourceIdentifier.getClass();
        cluster.getClass();
        callback.getClass();
        return this.nativeMap.queryFeatureExtensions(sourceIdentifier, cluster, QFE_SUPER_CLUSTER, QFE_CHILDREN, null, callback);
    }

    public final Cancelable getGeoJsonClusterExpansionZoom(String sourceIdentifier, Feature cluster, QueryFeatureExtensionCallback callback) {
        sourceIdentifier.getClass();
        cluster.getClass();
        callback.getClass();
        return this.nativeMap.queryFeatureExtensions(sourceIdentifier, cluster, QFE_SUPER_CLUSTER, QFE_EXPANSION_ZOOM, null, callback);
    }

    public final Cancelable getGeoJsonClusterLeaves(String sourceIdentifier, Feature cluster, long limit, long offset, QueryFeatureExtensionCallback callback) {
        sourceIdentifier.getClass();
        cluster.getClass();
        callback.getClass();
        return this.nativeMap.queryFeatureExtensions(sourceIdentifier, cluster, QFE_SUPER_CLUSTER, QFE_LEAVES, u0.d(new o13.p(QFE_LIMIT, new Value(limit)), new o13.p(QFE_OFFSET, new Value(offset))), callback);
    }

    /* JADX INFO: renamed from: getGesturesPlugin$maps_sdk_release, reason: from getter */
    public final /* synthetic */ GesturesPlugin getGesturesPlugin() {
        return this.gesturesPlugin;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapTransformDelegate
    public MapOptions getMapOptions() {
        checkNativeMap$default(this, "getMapOptions", false, 2, null);
        return this.nativeMap.getMapOptions();
    }

    @Override // com.mapbox.maps.plugin.delegates.MapProjectionDelegate
    public double getMetersPerPixelAtLatitude(double latitude) {
        return Projection.getMetersPerPixelAtLatitude(latitude, getCameraState().getZoom());
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final Map getNativeMap() {
        return this.nativeMap.getMap();
    }

    /* JADX INFO: renamed from: getNativeObserver$maps_sdk_release, reason: from getter */
    public final /* synthetic */ NativeObserver getNativeObserver() {
        return this.nativeObserver;
    }

    public final byte getPrefetchZoomDelta() {
        checkNativeMap$default(this, "getPrefetchZoomDelta", false, 2, null);
        return this.nativeMap.getPrefetchZoomDelta();
    }

    /* JADX INFO: renamed from: getRenderHandler$maps_sdk_release, reason: from getter */
    public final /* synthetic */ Handler getRenderHandler() {
        return this.renderHandler;
    }

    public final boolean getRenderWorldCopies() {
        checkNativeMap$default(this, "getRenderWorldCopies", false, 2, null);
        return this.nativeMap.getRenderWorldCopies();
    }

    @MapboxExperimental
    public final List<Vec2> getScreenCullingShape() {
        checkNativeMap$default(this, "getScreenCullingShape", false, 2, null);
        return this.nativeMap.getScreenCullingShape();
    }

    @Override // com.mapbox.maps.plugin.delegates.MapTransformDelegate
    public Size getSize() {
        checkNativeMap$default(this, "getSize", false, 2, null);
        return this.nativeMap.getSize();
    }

    public final void getStyle(Style.OnStyleLoaded onStyleLoaded) {
        onStyleLoaded.getClass();
        Unit unit = null;
        checkNativeMap$default(this, "getStyle", false, 2, null);
        Style styleDeprecated = getStyleDeprecated();
        if (styleDeprecated != null) {
            onStyleLoaded.onStyleLoaded(styleDeprecated);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.styleObserver.addGetStyleListener(onStyleLoaded);
        }
    }

    @MapboxExperimental
    public final HashSet<String> getViewAnnotationAvoidLayers$maps_sdk_release() {
        checkNativeMap$default(this, "getViewAnnotationAvoidLayers", false, 2, null);
        return this.nativeMap.getViewAnnotationAvoidLayers();
    }

    public final /* synthetic */ Expected getViewAnnotationOptions$maps_sdk_release(String identifier) {
        identifier.getClass();
        checkNativeMap$default(this, "getViewAnnotationOptions", false, 2, null);
        return this.nativeMap.getViewAnnotationOptions(identifier);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapTransformDelegate
    public boolean isGestureInProgress() {
        checkNativeMap$default(this, "isGestureInProgress", false, 2, null);
        return this.nativeMap.isGestureInProgress();
    }

    /* JADX INFO: renamed from: isStyleLoadInitiated$maps_sdk_release, reason: from getter */
    public final /* synthetic */ boolean getIsStyleLoadInitiated() {
        return this.isStyleLoadInitiated;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapTransformDelegate
    public boolean isUserAnimationInProgress() {
        checkNativeMap$default(this, "isUserAnimationInProgress", false, 2, null);
        return this.nativeMap.isUserAnimationInProgress();
    }

    /* JADX INFO: renamed from: isValid, reason: from getter */
    public final boolean getIsMapValid() {
        return this.isMapValid;
    }

    public final void loadStyle(final StyleContract.StyleExtension styleExtension, Style.OnStyleLoaded onStyleLoaded) {
        styleExtension.getClass();
        checkNativeMap$default(this, "loadStyle", false, 2, null);
        final int i14 = 0;
        final int i15 = 1;
        final int i16 = 2;
        initializeStyleLoad(onStyleLoaded, new Style.OnStyleLoaded() { // from class: com.mapbox.maps.j
            @Override // com.mapbox.maps.Style.OnStyleLoaded
            public final void onStyleLoaded(Style style) {
                switch (i14) {
                    case 0:
                        MapboxMap.loadStyle$lambda$7(styleExtension, style);
                        break;
                    case 1:
                        MapboxMap.loadStyle$lambda$10(styleExtension, style);
                        break;
                    default:
                        MapboxMap.loadStyle$lambda$13(styleExtension, style);
                        break;
                }
            }
        }, new Style.OnStyleLoaded() { // from class: com.mapbox.maps.j
            @Override // com.mapbox.maps.Style.OnStyleLoaded
            public final void onStyleLoaded(Style style) {
                switch (i16) {
                    case 0:
                        MapboxMap.loadStyle$lambda$7(styleExtension, style);
                        break;
                    case 1:
                        MapboxMap.loadStyle$lambda$10(styleExtension, style);
                        break;
                    default:
                        MapboxMap.loadStyle$lambda$13(styleExtension, style);
                        break;
                }
            }
        }, new Style.OnStyleLoaded() { // from class: com.mapbox.maps.j
            @Override // com.mapbox.maps.Style.OnStyleLoaded
            public final void onStyleLoaded(Style style) {
                switch (i15) {
                    case 0:
                        MapboxMap.loadStyle$lambda$7(styleExtension, style);
                        break;
                    case 1:
                        MapboxMap.loadStyle$lambda$10(styleExtension, style);
                        break;
                    default:
                        MapboxMap.loadStyle$lambda$13(styleExtension, style);
                        break;
                }
            }
        });
        applyStyle(styleExtension.getStyle());
    }

    @o13.e
    public final void loadStyleJson(String styleJson, Style.OnStyleLoaded onStyleLoaded) {
        styleJson.getClass();
        onStyleLoaded.getClass();
        loadStyleUri(styleJson, null, onStyleLoaded, null);
    }

    @o13.e
    public final void loadStyleUri(String styleUri, TransitionOptions styleTransitionOptions, Style.OnStyleLoaded onStyleLoaded, OnMapLoadErrorListener onMapLoadErrorListener) {
        styleUri.getClass();
        loadStyle(StyleExtensionImplKt.style(styleUri, new AnonymousClass1(styleTransitionOptions)), onStyleLoaded);
    }

    public final /* synthetic */ void onDestroy$maps_sdk_release() {
        if (this.performanceCollectionStatisticsStarted) {
            stopPerformanceStatisticsCollection();
        }
        this.cameraAnimationsPlugin = null;
        this.gesturesPlugin = null;
        Iterator<T> it = this.interactions.iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        this.interactions.clear();
        this.styleObserver.onDestroy();
        this.isMapValid = false;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public ScreenCoordinate pixelForCoordinate(Point coordinate) {
        coordinate.getClass();
        checkNativeMap$default(this, "pixelForCoordinate", false, 2, null);
        return clampScreenCoordinate(this.nativeMap.pixelForCoordinate(coordinate));
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public List<ScreenCoordinate> pixelsForCoordinates(List<Point> coordinates) {
        coordinates.getClass();
        checkNativeMap$default(this, "pixelsForCoordinates", false, 2, null);
        List<ScreenCoordinate> listPixelsForCoordinates = this.nativeMap.pixelsForCoordinates(new ArrayList(coordinates));
        ArrayList arrayList = new ArrayList(y.r(listPixelsForCoordinates, 10));
        Iterator<T> it = listPixelsForCoordinates.iterator();
        while (it.hasNext()) {
            arrayList.add(clampScreenCoordinate((ScreenCoordinate) it.next()));
        }
        return arrayList;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapProjectionDelegate
    public MercatorCoordinate project(Point point, double zoomScale) {
        point.getClass();
        MercatorCoordinate mercatorCoordinateProject = Projection.project(point, zoomScale);
        mercatorCoordinateProject.getClass();
        return mercatorCoordinateProject;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapProjectionDelegate
    public ProjectedMeters projectedMetersForCoordinate(Point point) {
        point.getClass();
        ProjectedMeters projectedMetersProjectedMetersForCoordinate = Projection.projectedMetersForCoordinate(point);
        projectedMetersProjectedMetersForCoordinate.getClass();
        return projectedMetersProjectedMetersForCoordinate;
    }

    @MapboxExperimental
    public final <FF extends FeaturesetFeature<?>> Cancelable queryRenderedFeatures(TypedFeaturesetDescriptor<?, FF> descriptor, RenderedQueryGeometry geometry, Value filter, QueryRenderedFeaturesetFeaturesCallback<FF> callback) {
        descriptor.getClass();
        callback.getClass();
        checkNativeMap$default(this, "queryRenderedFeatures", false, 2, null);
        NativeMapImpl nativeMapImpl = this.nativeMap;
        if (geometry == null) {
            geometry = RenderedQueryGeometry.valueOf(new ScreenBox(new ScreenCoordinate(0.0d, 0.0d), new ScreenCoordinate(getSize().getWidth(), getSize().getHeight())));
        }
        geometry.getClass();
        return nativeMapImpl.queryRenderedFeatures(geometry, p13.w.c(new FeaturesetQueryTarget(descriptor.toFeaturesetDescriptor(), filter, null)), new h(descriptor, callback));
    }

    @Override // com.mapbox.maps.plugin.delegates.MapFeatureQueryDelegate
    public Cancelable querySourceFeatures(String sourceId, SourceQueryOptions options, QuerySourceFeaturesCallback callback) {
        sourceId.getClass();
        options.getClass();
        callback.getClass();
        checkNativeMap("querySourceFeatures", false);
        return this.nativeMap.querySourceFeatures(sourceId, options, callback);
    }

    public final void reduceMemoryUse() {
        checkNativeMap$default(this, "reduceMemoryUse", false, 2, null);
        this.nativeMap.reduceMemoryUse();
    }

    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(FeaturesetFeature<FS> featuresetFeature, FSK stateKey, FeatureStateOperationCallback callback) {
        featuresetFeature.getClass();
        callback.getClass();
        checkNativeMap$default(this, "removeFeatureState", false, 2, null);
        FeaturesetFeatureId id3 = featuresetFeature.getId();
        if (id3 != null) {
            Cancelable cancelableRemoveFeatureState = this.nativeMap.removeFeatureState(featuresetFeature.getDescriptor().toFeaturesetDescriptor(), id3, stateKey != null ? stateKey.getKey() : null, callback);
            if (cancelableRemoveFeatureState != null) {
                return cancelableRemoveFeatureState;
            }
        }
        g gVar = new g(2);
        MapboxLogger.logE(TAG, "removeFeatureState called but featuresetFeature.id is NULL!");
        return gVar;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void removeOnCameraChangeListener(OnCameraChangeListener onCameraChangeListener) {
        onCameraChangeListener.getClass();
        checkNativeMap$default(this, "removeOnCameraChangeListener", false, 2, null);
        this.nativeObserver.removeOnCameraChangeListener(onCameraChangeListener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void removeOnMapIdleListener(OnMapIdleListener onMapIdleListener) {
        onMapIdleListener.getClass();
        checkNativeMap$default(this, "removeOnMapIdleListener", false, 2, null);
        this.nativeObserver.removeOnMapIdleListener(onMapIdleListener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void removeOnMapLoadErrorListener(OnMapLoadErrorListener onMapLoadErrorListener) {
        onMapLoadErrorListener.getClass();
        checkNativeMap$default(this, "removeOnMapLoadErrorListener", false, 2, null);
        this.nativeObserver.removeOnMapLoadErrorListener(onMapLoadErrorListener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void removeOnMapLoadedListener(OnMapLoadedListener onMapLoadedListener) {
        onMapLoadedListener.getClass();
        checkNativeMap$default(this, "removeOnMapLoadedListener", false, 2, null);
        this.nativeObserver.removeOnMapLoadedListener(onMapLoadedListener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void removeOnRenderFrameFinishedListener(OnRenderFrameFinishedListener onRenderFrameFinishedListener) {
        onRenderFrameFinishedListener.getClass();
        checkNativeMap$default(this, "removeOnRenderFrameFinishedListener", false, 2, null);
        this.nativeObserver.removeOnRenderFrameFinishedListener(onRenderFrameFinishedListener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void removeOnRenderFrameStartedListener(OnRenderFrameStartedListener onRenderFrameStartedListener) {
        onRenderFrameStartedListener.getClass();
        checkNativeMap$default(this, "removeOnRenderFrameStartedListener", false, 2, null);
        this.nativeObserver.removeOnRenderFrameStartedListener(onRenderFrameStartedListener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void removeOnSourceAddedListener(OnSourceAddedListener onSourceAddedListener) {
        onSourceAddedListener.getClass();
        checkNativeMap$default(this, "removeOnSourceAddedListener", false, 2, null);
        this.nativeObserver.removeOnSourceAddedListener(onSourceAddedListener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void removeOnSourceDataLoadedListener(OnSourceDataLoadedListener onSourceDataLoadedListener) {
        onSourceDataLoadedListener.getClass();
        checkNativeMap$default(this, "removeOnSourceDataLoadedListener", false, 2, null);
        this.nativeObserver.removeOnSourceDataLoadedListener(onSourceDataLoadedListener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void removeOnSourceRemovedListener(OnSourceRemovedListener onSourceRemovedListener) {
        onSourceRemovedListener.getClass();
        checkNativeMap$default(this, "removeOnSourceRemovedListener", false, 2, null);
        this.nativeObserver.removeOnSourceRemovedListener(onSourceRemovedListener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void removeOnStyleDataLoadedListener(OnStyleDataLoadedListener onStyleDataLoadedListener) {
        onStyleDataLoadedListener.getClass();
        checkNativeMap$default(this, "removeOnStyleDataLoadedListener", false, 2, null);
        this.nativeObserver.removeOnStyleDataLoadedListener(onStyleDataLoadedListener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void removeOnStyleImageMissingListener(OnStyleImageMissingListener onStyleImageMissingListener) {
        onStyleImageMissingListener.getClass();
        checkNativeMap$default(this, "removeOnStyleImageMissingListener", false, 2, null);
        this.nativeObserver.removeOnStyleImageMissingListener(onStyleImageMissingListener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void removeOnStyleImageUnusedListener(OnStyleImageUnusedListener onStyleImageUnusedListener) {
        onStyleImageUnusedListener.getClass();
        checkNativeMap$default(this, "removeOnStyleImageUnusedListener", false, 2, null);
        this.nativeObserver.removeOnStyleImageUnusedListener(onStyleImageUnusedListener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @o13.e
    public void removeOnStyleLoadedListener(OnStyleLoadedListener onStyleLoadedListener) {
        onStyleLoadedListener.getClass();
        checkNativeMap$default(this, "removeOnStyleLoadedListener", false, 2, null);
        this.nativeObserver.removeOnStyleLoadedListener(onStyleLoadedListener);
    }

    public final /* synthetic */ Expected removeViewAnnotation$maps_sdk_release(String viewId) {
        viewId.getClass();
        checkNativeMap$default(this, "removeViewAnnotation", false, 2, null);
        return this.nativeMap.removeViewAnnotation(viewId);
    }

    public final Cancelable resetFeatureStates(TypedFeaturesetDescriptor<?, ?> descriptor, FeatureStateOperationCallback callback) {
        descriptor.getClass();
        callback.getClass();
        checkNativeMap$default(this, "resetFeatureState", false, 2, null);
        return this.nativeMap.resetFeatureStates(descriptor.toFeaturesetDescriptor(), callback);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public Expected<String, None> setBounds(CameraBoundsOptions options) {
        options.getClass();
        checkNativeMap$default(this, "setBounds", false, 2, null);
        return this.nativeMap.setBounds(options);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public void setCamera(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        checkNativeMap$default(this, "setCamera", false, 2, null);
        this.nativeMap.setCamera(cameraOptions);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapTransformDelegate
    @MapboxExperimental
    public void setCameraAnimationHint(CameraAnimationHint cameraAnimationHint) {
        cameraAnimationHint.getClass();
        checkNativeMap$default(this, "setCameraAnimationHint", false, 2, null);
        this.nativeMap.setCameraAnimationHint(cameraAnimationHint);
    }

    public final /* synthetic */ void setCameraAnimationsPlugin$maps_sdk_release(CameraAnimationsPlugin cameraAnimationsPlugin) {
        this.cameraAnimationsPlugin = cameraAnimationsPlugin;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public void setCenterAltitudeMode(MapCenterAltitudeMode mode) {
        mode.getClass();
        checkNativeMap$default(this, "setCenterAltitudeMode", false, 2, null);
        this.nativeMap.setCenterAltitudeMode(mode);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapTransformDelegate
    public void setConstrainMode(ConstrainMode constrainMode) {
        constrainMode.getClass();
        checkNativeMap$default(this, "setConstrainMode", false, 2, null);
        this.nativeMap.setConstrainMode(constrainMode);
    }

    @o13.e
    public final void setDebug(List<? extends MapDebugOptions> debugOptions, boolean enabled) {
        debugOptions.getClass();
        checkNativeMap$default(this, "setDebug", false, 2, null);
        this.nativeMap.setDebug(debugOptions, enabled);
    }

    public final void setDebugOptions$maps_sdk_release(Set<? extends MapDebugOptions> set) {
        set.getClass();
        checkNativeMap$default(this, "setDebug", false, 2, null);
        NativeMapImpl nativeMapImpl = this.nativeMap;
        nativeMapImpl.setDebug(nativeMapImpl.getDebug(), false);
        this.nativeMap.setDebug(h0.b1(set), true);
    }

    public final <FS extends FeatureState> Cancelable setFeatureState(FeaturesetFeature<FS> featuresetFeature, FS state, FeatureStateOperationCallback callback) {
        Cancelable featureState;
        featuresetFeature.getClass();
        state.getClass();
        callback.getClass();
        checkNativeMap$default(this, "setFeatureState", false, 2, null);
        FeaturesetFeatureId id3 = featuresetFeature.getId();
        if (id3 != null && (featureState = this.nativeMap.setFeatureState(featuresetFeature.getDescriptor().toFeaturesetDescriptor(), id3, state.getInternalState(), callback)) != null) {
            return featureState;
        }
        g gVar = new g(1);
        MapboxLogger.logE(TAG, "setFeatureState called but featuresetFeature.id is NULL!");
        return gVar;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapTransformDelegate
    public void setGestureInProgress(boolean inProgress) {
        checkNativeMap$default(this, "setGestureInProgress", false, 2, null);
        this.nativeMap.setGestureInProgress(inProgress);
    }

    public final /* synthetic */ void setGesturesPlugin$maps_sdk_release(GesturesPlugin gesturesPlugin) {
        this.gesturesPlugin = gesturesPlugin;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapTransformDelegate
    public void setNorthOrientation(NorthOrientation northOrientation) {
        northOrientation.getClass();
        checkNativeMap$default(this, "setNorthOrientation", false, 2, null);
        this.nativeMap.setNorthOrientation(northOrientation);
    }

    public final void setPrefetchZoomDelta(byte delta) {
        checkNativeMap$default(this, "setPrefetchZoomDelta", false, 2, null);
        this.nativeMap.setPrefetchZoomDelta(delta);
    }

    public final /* synthetic */ void setRenderHandler$maps_sdk_release(Handler handler) {
        this.renderHandler = handler;
    }

    public final void setRenderWorldCopies(boolean renderWorldCopies) {
        checkNativeMap$default(this, "setRenderWorldCopies", false, 2, null);
        this.nativeMap.setRenderWorldCopies(renderWorldCopies);
    }

    @MapboxExperimental
    public final void setScreenCullingShape(List<Vec2> shape) {
        shape.getClass();
        checkNativeMap$default(this, "setScreenCullingShape", false, 2, null);
        this.nativeMap.setScreenCullingShape(shape);
    }

    public final /* synthetic */ void setStyle$maps_sdk_release(Style style) {
        this.style = style;
    }

    public final /* synthetic */ void setStyleLoadInitiated$maps_sdk_release(boolean z14) {
        this.isStyleLoadInitiated = z14;
    }

    public final void setTileCacheBudget(TileCacheBudget tileCacheBudget) {
        checkNativeMap$default(this, "setTileCacheBudget", false, 2, null);
        this.nativeMap.setTileCacheBudget(tileCacheBudget);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapTransformDelegate
    public void setUserAnimationInProgress(boolean inProgress) {
        checkNativeMap$default(this, "setUserAnimationInProgress", false, 2, null);
        this.nativeMap.setUserAnimationInProgress(inProgress);
    }

    @MapboxExperimental
    public final Expected<String, None> setViewAnnotationAvoidLayers$maps_sdk_release(HashSet<String> layerIds) {
        checkNativeMap$default(this, "setViewAnnotationAvoidLayers", false, 2, null);
        return this.nativeMap.setViewAnnotationAvoidLayers(layerIds);
    }

    public final /* synthetic */ void setViewAnnotationPositionsUpdateListener$maps_sdk_release(DelegatingViewAnnotationPositionsUpdateListener listener) {
        checkNativeMap$default(this, "setViewAnnotationPositionsUpdateListener", false, 2, null);
        this.nativeMap.setViewAnnotationPositionsUpdateListener(listener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapTransformDelegate
    public void setViewportMode(ViewportMode viewportMode) {
        viewportMode.getClass();
        checkNativeMap$default(this, "setViewportMode", false, 2, null);
        this.nativeMap.setViewportMode(viewportMode);
    }

    @MapboxExperimental
    public final void startPerformanceStatisticsCollection(PerformanceStatisticsOptions options, PerformanceStatisticsCallback callback) {
        options.getClass();
        callback.getClass();
        checkNativeMap$default(this, "startPerformanceStatisticsCollection", false, 2, null);
        this.nativeMap.startPerformanceStatisticsCollection(options, callback);
        this.performanceCollectionStatisticsStarted = true;
    }

    @MapboxExperimental
    public final void stopPerformanceStatisticsCollection() {
        checkNativeMap$default(this, "stopPerformanceStatisticsCollection", false, 2, null);
        this.nativeMap.stopPerformanceStatisticsCollection();
        this.performanceCollectionStatisticsStarted = false;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    public Cancelable subscribeCameraChanged(CameraChangedCallback cameraChangedCallback) {
        cameraChangedCallback.getClass();
        checkNativeMap$default(this, "subscribeCameraChanged", false, 2, null);
        return NativeObserver.subscribeCameraChanged$default(this.nativeObserver, cameraChangedCallback, null, null, 6, null);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @com.mapbox.annotation.MapboxExperimental
    public Cancelable subscribeCameraChangedCoalesced(CameraChangedCoalescedCallback cameraChangedCoalescedCallback) {
        cameraChangedCoalescedCallback.getClass();
        checkNativeMap$default(this, "subscribeCameraChangedCoalesced", false, 2, null);
        return NativeObserver.subscribeCameraChangedCoalesced$default(this.nativeObserver, cameraChangedCoalescedCallback, null, 2, null);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @MapboxExperimental
    public Cancelable subscribeGenericEvent(String eventName, GenericEventCallback genericEventCallback) {
        eventName.getClass();
        genericEventCallback.getClass();
        checkNativeMap$default(this, "subscribeGenericEvent", false, 2, null);
        return NativeObserver.subscribeGenericEvent$default(this.nativeObserver, eventName, genericEventCallback, null, 4, null);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    public Cancelable subscribeMapIdle(MapIdleCallback mapIdleCallback) {
        mapIdleCallback.getClass();
        checkNativeMap$default(this, "subscribeMapIdle", false, 2, null);
        return NativeObserver.subscribeMapIdle$default(this.nativeObserver, mapIdleCallback, null, null, 6, null);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    public Cancelable subscribeMapLoaded(MapLoadedCallback mapLoadedCallback) {
        mapLoadedCallback.getClass();
        checkNativeMap$default(this, "subscribeMapLoaded", false, 2, null);
        return NativeObserver.subscribeMapLoaded$default(this.nativeObserver, mapLoadedCallback, null, null, 6, null);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    public Cancelable subscribeMapLoadingError(MapLoadingErrorCallback mapLoadingErrorCallback) {
        mapLoadingErrorCallback.getClass();
        checkNativeMap$default(this, "subscribeMapLoadingError", false, 2, null);
        return NativeObserver.subscribeMapLoadingError$default(this.nativeObserver, mapLoadingErrorCallback, null, null, 6, null);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    public Cancelable subscribeRenderFrameFinished(RenderFrameFinishedCallback renderFrameFinishedCallback) {
        renderFrameFinishedCallback.getClass();
        checkNativeMap$default(this, "subscribeRenderFrameFinished", false, 2, null);
        return NativeObserver.subscribeRenderFrameFinished$default(this.nativeObserver, renderFrameFinishedCallback, null, null, 6, null);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    public Cancelable subscribeRenderFrameStarted(RenderFrameStartedCallback renderFrameStartedCallback) {
        renderFrameStartedCallback.getClass();
        checkNativeMap$default(this, "subscribeRenderFrameStarted", false, 2, null);
        return NativeObserver.subscribeRenderFrameStarted$default(this.nativeObserver, renderFrameStartedCallback, null, null, 6, null);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    public Cancelable subscribeResourceRequest(ResourceRequestCallback resourceRequestCallback) {
        resourceRequestCallback.getClass();
        checkNativeMap$default(this, "subscribeResourceRequest", false, 2, null);
        return NativeObserver.subscribeResourceRequest$default(this.nativeObserver, resourceRequestCallback, null, 2, null);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    public Cancelable subscribeSourceAdded(SourceAddedCallback sourceAddedCallback) {
        sourceAddedCallback.getClass();
        checkNativeMap$default(this, "subscribeSourceAdded", false, 2, null);
        return NativeObserver.subscribeSourceAdded$default(this.nativeObserver, sourceAddedCallback, null, null, 6, null);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    public Cancelable subscribeSourceDataLoaded(SourceDataLoadedCallback sourceDataLoadedCallback) {
        sourceDataLoadedCallback.getClass();
        checkNativeMap$default(this, "subscribeSourceDataLoaded", false, 2, null);
        return NativeObserver.subscribeSourceDataLoaded$default(this.nativeObserver, sourceDataLoadedCallback, null, null, 6, null);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    public Cancelable subscribeSourceRemoved(SourceRemovedCallback sourceRemovedCallback) {
        sourceRemovedCallback.getClass();
        checkNativeMap$default(this, "subscribeSourceRemoved", false, 2, null);
        return NativeObserver.subscribeSourceRemoved$default(this.nativeObserver, sourceRemovedCallback, null, null, 6, null);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    public Cancelable subscribeStyleDataLoaded(StyleDataLoadedCallback styleDataLoadedCallback) {
        styleDataLoadedCallback.getClass();
        checkNativeMap$default(this, "subscribeStyleDataLoaded", false, 2, null);
        return NativeObserver.subscribeStyleDataLoaded$default(this.nativeObserver, styleDataLoadedCallback, null, null, 6, null);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    public Cancelable subscribeStyleImageMissing(StyleImageMissingCallback styleImageMissingCallback) {
        styleImageMissingCallback.getClass();
        checkNativeMap$default(this, "subscribeStyleImageMissing", false, 2, null);
        return NativeObserver.subscribeStyleImageMissing$default(this.nativeObserver, styleImageMissingCallback, null, null, 6, null);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    public Cancelable subscribeStyleImageRemoveUnused(StyleImageRemoveUnusedCallback styleImageRemoveUnusedCallback) {
        styleImageRemoveUnusedCallback.getClass();
        checkNativeMap$default(this, "subscribeStyleImageRemoveUnused", false, 2, null);
        return NativeObserver.subscribeStyleImageRemoveUnused$default(this.nativeObserver, styleImageRemoveUnusedCallback, null, null, 6, null);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    public Cancelable subscribeStyleLoaded(StyleLoadedCallback styleLoadedCallback) {
        styleLoadedCallback.getClass();
        checkNativeMap$default(this, "subscribeStyleLoaded", false, 2, null);
        return NativeObserver.subscribeStyleLoaded$default(this.nativeObserver, styleLoadedCallback, null, null, 6, null);
    }

    @MapboxExperimental
    public final List<CanonicalTileID> tileCover(TileCoverOptions tileCoverOptions, CameraOptions cameraOptions) {
        tileCoverOptions.getClass();
        checkNativeMap$default(this, "tileCover", false, 2, null);
        return this.nativeMap.tileCover(tileCoverOptions, cameraOptions);
    }

    public final void triggerRepaint() {
        checkNativeMap$default(this, "triggerRepaint", false, 2, null);
        this.nativeMap.triggerRepaint();
    }

    @Override // com.mapbox.maps.plugin.delegates.MapProjectionDelegate
    public Point unproject(MercatorCoordinate coordinate, double zoomScale) {
        coordinate.getClass();
        Point pointUnproject = Projection.unproject(coordinate, zoomScale);
        pointUnproject.getClass();
        return pointUnproject;
    }

    public final /* synthetic */ Expected updateViewAnnotation$maps_sdk_release(String viewId, ViewAnnotationOptions options) {
        viewId.getClass();
        options.getClass();
        checkNativeMap$default(this, "updateViewAnnotation", false, 2, null);
        return this.nativeMap.updateViewAnnotation(viewId, options);
    }

    @MapboxExperimental
    public final void whenSizeReady(e23.a<Unit> action) {
        action.getClass();
        checkNativeMap$default(this, "whenSizeReady", false, 2, null);
        this.nativeMap.whenMapSizeReady(action);
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0081\u0002¢\u0006\u0002\b\u001eJ&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0080\u0002¢\u0006\u0002\b\u001eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/mapbox/maps/MapboxMap$Companion;", "", "()V", "QFE_CHILDREN", "", "QFE_DEFAULT_LIMIT", "", "QFE_DEFAULT_OFFSET", "QFE_EXPANSION_ZOOM", "QFE_LEAVES", "QFE_LIMIT", "QFE_OFFSET", "QFE_SUPER_CLUSTER", "TAG", "calculateBoundingBox", "", "Lcom/mapbox/geojson/Point;", "points", "clearData", "", "callback", "Lcom/mapbox/maps/AsyncOperationResultCallback;", "invoke", "Lcom/mapbox/maps/MapboxMap;", "nativeMap", "Lcom/mapbox/maps/NativeMapImpl;", "nativeObserver", "Lcom/mapbox/maps/NativeObserver;", "styleObserver", "Lcom/mapbox/maps/StyleObserver;", "invoke$maps_sdk_release", "pixelRatio", "", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Point> calculateBoundingBox(List<Point> points) {
            if (points.size() <= 2) {
                return points;
            }
            double d14 = Double.NEGATIVE_INFINITY;
            double d15 = Double.POSITIVE_INFINITY;
            double d16 = Double.POSITIVE_INFINITY;
            double d17 = Double.NEGATIVE_INFINITY;
            for (Point point : points) {
                double dLongitude = point.longitude();
                double dLatitude = point.latitude();
                if (d15 > dLongitude) {
                    d15 = dLongitude;
                }
                if (d16 > dLatitude) {
                    d16 = dLatitude;
                }
                if (d14 < dLongitude) {
                    d14 = dLongitude;
                }
                if (d17 < dLatitude) {
                    d17 = dLatitude;
                }
            }
            return x.k(Point.fromLngLat(d15, d16), Point.fromLngLat(d14, d17));
        }

        public final void clearData(AsyncOperationResultCallback callback) {
            callback.getClass();
            MapsResourceOptions.clearData(callback);
        }

        public final /* synthetic */ MapboxMap invoke$maps_sdk_release(NativeMapImpl nativeMap, NativeObserver nativeObserver, StyleObserver styleObserver) {
            nativeMap.getClass();
            nativeObserver.getClass();
            styleObserver.getClass();
            return new MapboxMap(nativeMap, nativeObserver, styleObserver, (p005kotlin.jvm.internal.j) null);
        }

        private Companion() {
        }

        public final /* synthetic */ MapboxMap invoke$maps_sdk_release(NativeMapImpl nativeMap, NativeObserver nativeObserver, float pixelRatio) {
            nativeMap.getClass();
            nativeObserver.getClass();
            return new MapboxMap(nativeMap, nativeObserver, pixelRatio, (p005kotlin.jvm.internal.j) null);
        }
    }

    @o13.e
    public final void loadStyleJson(String styleJson, Style.OnStyleLoaded onStyleLoaded, OnMapLoadErrorListener onMapLoadErrorListener) {
        styleJson.getClass();
        loadStyleUri(styleJson, null, onStyleLoaded, onMapLoadErrorListener);
    }

    @o13.e
    public final void loadStyleJson(String styleJson, TransitionOptions styleTransitionOptions, Style.OnStyleLoaded onStyleLoaded, OnMapLoadErrorListener onMapLoadErrorListener) {
        styleJson.getClass();
        loadStyleUri(styleJson, styleTransitionOptions, onStyleLoaded, onMapLoadErrorListener);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapProjectionDelegate
    public double getMetersPerPixelAtLatitude(double latitude, double zoom) {
        return Projection.getMetersPerPixelAtLatitude(latitude, zoom);
    }

    @o13.e
    public final void loadStyleJson(String styleJson) {
        styleJson.getClass();
        loadStyleUri(styleJson, null, null, null);
    }

    public static /* synthetic */ Cancelable setFeatureState$default(MapboxMap mapboxMap, TypedFeaturesetDescriptor typedFeaturesetDescriptor, FeaturesetFeatureId featuresetFeatureId, FeatureState featureState, FeatureStateOperationCallback featureStateOperationCallback, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            featureStateOperationCallback = new com.google.protobuf.a(25);
        }
        return mapboxMap.setFeatureState((TypedFeaturesetDescriptor<FeatureState, ?>) typedFeaturesetDescriptor, featuresetFeatureId, featureState, featureStateOperationCallback);
    }

    @o13.e
    public final void loadStyleUri(String styleUri, Style.OnStyleLoaded onStyleLoaded, OnMapLoadErrorListener onMapLoadErrorListener) {
        styleUri.getClass();
        loadStyleUri(styleUri, null, onStyleLoaded, onMapLoadErrorListener);
    }

    @o13.e
    public final void loadStyleUri(String styleUri, Style.OnStyleLoaded onStyleLoaded) {
        styleUri.getClass();
        onStyleLoaded.getClass();
        loadStyleUri(styleUri, null, onStyleLoaded, null);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public void setCamera(FreeCameraOptions freeCameraOptions) {
        freeCameraOptions.getClass();
        checkNativeMap$default(this, "setCamera", false, 2, null);
        this.nativeMap.setCamera(freeCameraOptions);
    }

    @o13.e
    public final void loadStyleUri(String styleUri) {
        styleUri.getClass();
        loadStyleUri(styleUri, null, null, null);
    }

    public static /* synthetic */ void loadStyle$default(MapboxMap mapboxMap, StyleContract.StyleExtension styleExtension, Style.OnStyleLoaded onStyleLoaded, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            onStyleLoaded = null;
        }
        mapboxMap.loadStyle(styleExtension, onStyleLoaded);
    }

    public static /* synthetic */ void loadStyleJson$default(MapboxMap mapboxMap, String str, Style.OnStyleLoaded onStyleLoaded, OnMapLoadErrorListener onMapLoadErrorListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            onStyleLoaded = null;
        }
        if ((i14 & 4) != 0) {
            onMapLoadErrorListener = null;
        }
        mapboxMap.loadStyleJson(str, onStyleLoaded, onMapLoadErrorListener);
    }

    public static /* synthetic */ void loadStyleUri$default(MapboxMap mapboxMap, String str, Style.OnStyleLoaded onStyleLoaded, OnMapLoadErrorListener onMapLoadErrorListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            onStyleLoaded = null;
        }
        if ((i14 & 4) != 0) {
            onMapLoadErrorListener = null;
        }
        mapboxMap.loadStyleUri(str, onStyleLoaded, onMapLoadErrorListener);
    }

    public static /* synthetic */ void loadStyle$default(MapboxMap mapboxMap, String str, Style.OnStyleLoaded onStyleLoaded, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            onStyleLoaded = null;
        }
        mapboxMap.loadStyle(str, onStyleLoaded);
    }

    public static /* synthetic */ Cancelable removeFeatureState$default(MapboxMap mapboxMap, TypedFeaturesetDescriptor typedFeaturesetDescriptor, FeaturesetFeatureId featuresetFeatureId, FeatureStateKey featureStateKey, FeatureStateOperationCallback featureStateOperationCallback, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            featureStateKey = null;
        }
        if ((i14 & 8) != 0) {
            featureStateOperationCallback = new com.google.protobuf.a(26);
        }
        return mapboxMap.removeFeatureState(typedFeaturesetDescriptor, featuresetFeatureId, featureStateKey, featureStateOperationCallback);
    }

    public static /* synthetic */ void loadStyle$default(MapboxMap mapboxMap, StyleContract.StyleExtension styleExtension, Style.OnStyleLoaded onStyleLoaded, OnMapLoadErrorListener onMapLoadErrorListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            onStyleLoaded = null;
        }
        if ((i14 & 4) != 0) {
            onMapLoadErrorListener = null;
        }
        mapboxMap.loadStyle(styleExtension, onStyleLoaded, onMapLoadErrorListener);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.MapboxMap$loadStyleUri$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/extension/style/StyleExtensionImpl$Builder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends p005kotlin.jvm.internal.w implements e23.l<StyleExtensionImpl.Builder, Unit> {
        final /* synthetic */ TransitionOptions $styleTransitionOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TransitionOptions transitionOptions) {
            super(1);
            this.$styleTransitionOptions = transitionOptions;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(StyleExtensionImpl.Builder builder) {
            builder.getClass();
            TransitionOptions transitionOptions = this.$styleTransitionOptions;
            if (transitionOptions != null) {
                TransitionOptions.Builder builder2 = new TransitionOptions.Builder();
                transitionOptions.toBuilder();
                TransitionOptions transitionOptionsBuild = builder2.build();
                transitionOptionsBuild.getClass();
                builder.setTransition(transitionOptionsBuild);
            }
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(StyleExtensionImpl.Builder builder) {
            invoke2(builder);
            return Unit.INSTANCE;
        }
    }

    @Override // com.mapbox.maps.plugin.delegates.MapFeatureStateDelegate
    public Cancelable resetFeatureStates(String sourceId, String sourceLayerId, FeatureStateOperationCallback callback) {
        sourceId.getClass();
        callback.getClass();
        checkNativeMap$default(this, "resetFeatureState", false, 2, null);
        return this.nativeMap.resetFeatureStates(sourceId, sourceLayerId, callback);
    }

    public final Cancelable resetFeatureStates(String sourceId, FeatureStateOperationCallback callback) {
        sourceId.getClass();
        callback.getClass();
        return resetFeatureStates(sourceId, null, callback);
    }

    public final Cancelable resetFeatureStates(TypedFeaturesetDescriptor<?, ?> typedFeaturesetDescriptor) {
        typedFeaturesetDescriptor.getClass();
        return resetFeatureStates$default(this, typedFeaturesetDescriptor, null, 2, null);
    }

    /* JADX INFO: renamed from: getStyle, reason: merged with bridge method [inline-methods] */
    public final Style getStyleDeprecated() {
        checkNativeMap$default(this, "getStyle", false, 2, null);
        return this.style;
    }

    public final void loadStyle(String str) {
        str.getClass();
        loadStyle$default(this, str, (Style.OnStyleLoaded) null, 2, (Object) null);
    }

    public final void loadStyle(String style, Style.OnStyleLoaded onStyleLoaded) {
        style.getClass();
        checkNativeMap$default(this, "loadStyle", false, 2, null);
        initializeStyleLoad$default(this, onStyleLoaded, new k(), null, null, 12, null);
        applyStyle(style);
    }

    public final void loadStyle(StyleContract.StyleExtension styleExtension) {
        styleExtension.getClass();
        loadStyle$default(this, styleExtension, (Style.OnStyleLoaded) null, 2, (Object) null);
    }

    @o13.e
    public final void loadStyle(StyleContract.StyleExtension styleExtension, TransitionOptions styleTransitionOptions, Style.OnStyleLoaded onStyleLoaded, OnMapLoadErrorListener onMapLoadErrorListener) {
        styleExtension.getClass();
        loadStyle(styleExtension, onStyleLoaded);
    }

    @o13.e
    public final void loadStyle(StyleContract.StyleExtension styleExtension, Style.OnStyleLoaded onStyleLoaded, OnMapLoadErrorListener onMapLoadErrorListener) {
        styleExtension.getClass();
        loadStyle(styleExtension, onStyleLoaded);
    }

    public /* synthetic */ MapboxMap(NativeMapImpl nativeMapImpl, NativeObserver nativeObserver, StyleObserver styleObserver, p005kotlin.jvm.internal.j jVar) {
        this(nativeMapImpl, nativeObserver, styleObserver);
    }

    public final Cancelable getGeoJsonClusterLeaves(String str, Feature feature, QueryFeatureExtensionCallback queryFeatureExtensionCallback) {
        str.getClass();
        feature.getClass();
        queryFeatureExtensionCallback.getClass();
        return getGeoJsonClusterLeaves$default(this, str, feature, 0L, 0L, queryFeatureExtensionCallback, 12, null);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.MapboxMap$cameraForCoordinates$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass3 extends p005kotlin.jvm.internal.w implements e23.a<Unit> {
        final /* synthetic */ CameraOptions $camera;
        final /* synthetic */ List<Point> $coordinates;
        final /* synthetic */ EdgeInsets $coordinatesPadding;
        final /* synthetic */ Double $maxZoom;
        final /* synthetic */ ScreenCoordinate $offset;
        final /* synthetic */ e23.l<CameraOptions, Unit> $result;
        final /* synthetic */ MapboxMap this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(e23.l<? super CameraOptions, Unit> lVar, MapboxMap mapboxMap, List<Point> list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d14, ScreenCoordinate screenCoordinate) {
            super(0);
            this.$result = lVar;
            this.this$0 = mapboxMap;
            this.$coordinates = list;
            this.$camera = cameraOptions;
            this.$coordinatesPadding = edgeInsets;
            this.$maxZoom = d14;
            this.$offset = screenCoordinate;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CameraOptions invoke$lambda$1(List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d14, ScreenCoordinate screenCoordinate, MapboxMap mapboxMap, String str) {
            list.getClass();
            cameraOptions.getClass();
            mapboxMap.getClass();
            str.getClass();
            MapboxLogger.logE(MapboxMap.TAG, "Error occurred in asynchronous cameraForCoordinates(coordinates: " + list + ", camera: " + cameraOptions + ", coordinatesPadding: " + edgeInsets + ", maxZoom: " + d14 + ", offset: " + screenCoordinate + ", mapSize: " + mapboxMap.nativeMap.getSize() + "): " + str + ", empty cameraState will be returned");
            CameraOptions cameraOptionsBuild = new CameraOptions.Builder().build();
            cameraOptionsBuild.getClass();
            return cameraOptionsBuild;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            e23.l<CameraOptions, Unit> lVar = this.$result;
            CameraOptions valueOrElse = this.this$0.nativeMap.cameraForCoordinates(MapboxMap.INSTANCE.calculateBoundingBox(this.$coordinates), this.$camera, this.$coordinatesPadding, this.$maxZoom, this.$offset).getValueOrElse(new l(this.$coordinates, this.$camera, this.$coordinatesPadding, this.$maxZoom, this.$offset, this.this$0, 0));
            valueOrElse.getClass();
            lVar.invoke(valueOrElse);
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    private MapboxMap(NativeMapImpl nativeMapImpl, NativeObserver nativeObserver, StyleObserver styleObserver) {
        super(nativeMapImpl.getMap(), 1.0f, new com.google.protobuf.a(23));
        this.isMapValid = true;
        this.interactions = new ArrayList();
        this.nativeMap = nativeMapImpl;
        this.nativeObserver = nativeObserver;
        this.styleObserver = styleObserver;
    }

    public final Cancelable getGeoJsonClusterLeaves(String str, Feature feature, long j8, QueryFeatureExtensionCallback queryFeatureExtensionCallback) {
        str.getClass();
        feature.getClass();
        queryFeatureExtensionCallback.getClass();
        return getGeoJsonClusterLeaves$default(this, str, feature, j8, 0L, queryFeatureExtensionCallback, 8, null);
    }

    public final Cancelable getFeatureState(String sourceId, String featureId, QueryFeatureStateCallback callback) {
        sourceId.getClass();
        featureId.getClass();
        callback.getClass();
        return getFeatureState(sourceId, null, featureId, callback);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapFeatureStateDelegate
    public Cancelable getFeatureState(String sourceId, String sourceLayerId, String featureId, QueryFeatureStateCallback callback) {
        sourceId.getClass();
        featureId.getClass();
        callback.getClass();
        checkNativeMap$default(this, "getFeatureState", false, 2, null);
        return this.nativeMap.getFeatureState(sourceId, sourceLayerId, featureId, callback);
    }

    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(FeaturesetFeature<FS> featuresetFeature, FSK fsk) {
        featuresetFeature.getClass();
        return removeFeatureState$default(this, featuresetFeature, fsk, null, 4, null);
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(TypedFeaturesetDescriptor<FS, ?> typedFeaturesetDescriptor, FeaturesetFeatureId featuresetFeatureId) {
        typedFeaturesetDescriptor.getClass();
        featuresetFeatureId.getClass();
        return removeFeatureState$default(this, typedFeaturesetDescriptor, featuresetFeatureId, null, null, 12, null);
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final <FS extends FeatureState> Cancelable setFeatureState(TypedFeaturesetDescriptor<FS, ?> typedFeaturesetDescriptor, FeaturesetFeatureId featuresetFeatureId, FS fs3) {
        typedFeaturesetDescriptor.getClass();
        featuresetFeatureId.getClass();
        fs3.getClass();
        return setFeatureState$default(this, typedFeaturesetDescriptor, featuresetFeatureId, fs3, null, 8, null);
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final <FS extends FeatureState> Cancelable getFeatureState(TypedFeaturesetDescriptor<FS, ?> descriptor, FeaturesetFeatureId id3, FeatureStateCallback<FS> callback) {
        descriptor.getClass();
        id3.getClass();
        callback.getClass();
        checkNativeMap$default(this, "getFeatureState", false, 2, null);
        return this.nativeMap.getFeatureState(descriptor.toFeaturesetDescriptor(), id3, new e(callback, descriptor));
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(TypedFeaturesetDescriptor<FS, ?> typedFeaturesetDescriptor, FeaturesetFeatureId featuresetFeatureId, FSK fsk) {
        typedFeaturesetDescriptor.getClass();
        featuresetFeatureId.getClass();
        return removeFeatureState$default(this, typedFeaturesetDescriptor, featuresetFeatureId, fsk, null, 8, null);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapFeatureStateDelegate
    public Cancelable setFeatureState(String sourceId, String sourceLayerId, String featureId, Value state, FeatureStateOperationCallback callback) {
        sourceId.getClass();
        featureId.getClass();
        state.getClass();
        callback.getClass();
        checkNativeMap$default(this, "setFeatureState", false, 2, null);
        return this.nativeMap.setFeatureState(sourceId, sourceLayerId, featureId, state, callback);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapFeatureStateDelegate
    public Cancelable removeFeatureState(String sourceId, String sourceLayerId, String featureId, String stateKey, FeatureStateOperationCallback callback) {
        sourceId.getClass();
        featureId.getClass();
        callback.getClass();
        checkNativeMap$default(this, "removeFeatureState", false, 2, null);
        return this.nativeMap.removeFeatureState(sourceId, sourceLayerId, featureId, stateKey, callback);
    }

    public /* synthetic */ MapboxMap(NativeMapImpl nativeMapImpl, NativeObserver nativeObserver, float f14, p005kotlin.jvm.internal.j jVar) {
        this(nativeMapImpl, nativeObserver, f14);
    }

    public final Cancelable setFeatureState(String sourceId, String featureId, Value state, FeatureStateOperationCallback callback) {
        sourceId.getClass();
        featureId.getClass();
        state.getClass();
        callback.getClass();
        return setFeatureState(sourceId, null, featureId, state, callback);
    }

    public final Cancelable removeFeatureState(String sourceId, String sourceLayerId, String featureId, FeatureStateOperationCallback callback) {
        sourceId.getClass();
        featureId.getClass();
        callback.getClass();
        return removeFeatureState(sourceId, sourceLayerId, featureId, null, callback);
    }

    public final <FS extends FeatureState> Cancelable setFeatureState(FeaturesetFeature<FS> featuresetFeature, FS fs3) {
        featuresetFeature.getClass();
        fs3.getClass();
        return setFeatureState$default(this, featuresetFeature, fs3, null, 4, null);
    }

    public final Cancelable removeFeatureState(String sourceId, String featureId, FeatureStateOperationCallback callback) {
        sourceId.getClass();
        featureId.getClass();
        callback.getClass();
        return removeFeatureState(sourceId, null, featureId, null, callback);
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final <FS extends FeatureState> Cancelable setFeatureState(TypedFeaturesetDescriptor<FS, ?> descriptor, FeaturesetFeatureId id3, FS state, FeatureStateOperationCallback callback) {
        descriptor.getClass();
        id3.getClass();
        state.getClass();
        callback.getClass();
        checkNativeMap$default(this, "setFeatureState", false, 2, null);
        return this.nativeMap.setFeatureState(descriptor.toFeaturesetDescriptor(), id3, state.getInternalState(), callback);
    }

    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(FeaturesetFeature<FS> featuresetFeature) {
        featuresetFeature.getClass();
        return removeFeatureState$default(this, featuresetFeature, null, null, 6, null);
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(TypedFeaturesetDescriptor<FS, ?> descriptor, FeaturesetFeatureId id3, FSK stateKey, FeatureStateOperationCallback callback) {
        descriptor.getClass();
        id3.getClass();
        callback.getClass();
        checkNativeMap$default(this, "removeFeatureState", false, 2, null);
        return this.nativeMap.removeFeatureState(descriptor.toFeaturesetDescriptor(), id3, stateKey != null ? stateKey.getKey() : null, callback);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    @o13.e
    public CameraOptions cameraForCoordinates(List<Point> coordinates, CameraOptions camera, ScreenBox box) {
        coordinates.getClass();
        camera.getClass();
        box.getClass();
        checkNativeMap$default(this, "cameraForCoordinates", false, 2, null);
        return this.nativeMap.cameraForCoordinates(INSTANCE.calculateBoundingBox(coordinates), camera, box);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    @o13.e
    public CameraOptions cameraForCoordinates(List<Point> coordinates, EdgeInsets coordinatesPadding, Double bearing, Double pitch) {
        coordinates.getClass();
        checkNativeMap$default(this, "cameraForCoordinates", false, 2, null);
        return this.nativeMap.cameraForCoordinates(INSTANCE.calculateBoundingBox(coordinates), coordinatesPadding, bearing, pitch);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public void cameraForCoordinates(List<Point> coordinates, CameraOptions camera, EdgeInsets coordinatesPadding, Double maxZoom, ScreenCoordinate offset, e23.l<? super CameraOptions, Unit> result) {
        coordinates.getClass();
        camera.getClass();
        result.getClass();
        checkNativeMap$default(this, "cameraForCoordinates", false, 2, null);
        this.nativeMap.whenMapSizeReady(new AnonymousClass3(result, this, coordinates, camera, coordinatesPadding, maxZoom, offset));
    }

    @MapboxExperimental
    public final <FF extends FeaturesetFeature<?>> Cancelable queryRenderedFeatures(TypedFeaturesetDescriptor<?, FF> typedFeaturesetDescriptor, QueryRenderedFeaturesetFeaturesCallback<FF> queryRenderedFeaturesetFeaturesCallback) {
        typedFeaturesetDescriptor.getClass();
        queryRenderedFeaturesetFeaturesCallback.getClass();
        return queryRenderedFeatures$default(this, typedFeaturesetDescriptor, null, null, queryRenderedFeaturesetFeaturesCallback, 6, null);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapFeatureQueryDelegate
    public Cancelable queryRenderedFeatures(RenderedQueryGeometry geometry, RenderedQueryOptions options, QueryRenderedFeaturesCallback callback) {
        geometry.getClass();
        options.getClass();
        callback.getClass();
        checkNativeMap("queryRenderedFeatures", false);
        return this.nativeMap.queryRenderedFeatures(geometry, options, callback);
    }

    @MapboxExperimental
    public final <FF extends FeaturesetFeature<?>> Cancelable queryRenderedFeatures(TypedFeaturesetDescriptor<?, FF> typedFeaturesetDescriptor, RenderedQueryGeometry renderedQueryGeometry, QueryRenderedFeaturesetFeaturesCallback<FF> queryRenderedFeaturesetFeaturesCallback) {
        typedFeaturesetDescriptor.getClass();
        queryRenderedFeaturesetFeaturesCallback.getClass();
        return queryRenderedFeatures$default(this, typedFeaturesetDescriptor, renderedQueryGeometry, null, queryRenderedFeaturesetFeaturesCallback, 4, null);
    }
}
