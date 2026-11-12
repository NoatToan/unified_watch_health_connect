package com.mapbox.maps.plugin.annotation;

import a73.f;
import android.graphics.Bitmap;
import android.graphics.PointF;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mapbox.android.gestures.MoveDistancesObject;
import com.mapbox.android.gestures.MoveGestureDetector;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.maps.ClickInteraction;
import com.mapbox.maps.InteractionContext;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.LongClickInteraction;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.PlatformEventInfo;
import com.mapbox.maps.PlatformEventType;
import com.mapbox.maps.QueriedFeature;
import com.mapbox.maps.QueriedRenderedFeature;
import com.mapbox.maps.RenderedQueryGeometry;
import com.mapbox.maps.RenderedQueryOptions;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.extension.style.expressions.dsl.generated.ExpressionDslKt;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.image.ImageUtils;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.LayerUtils;
import com.mapbox.maps.extension.style.layers.generated.CircleLayer;
import com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl;
import com.mapbox.maps.extension.style.layers.generated.CircleLayerKt;
import com.mapbox.maps.extension.style.layers.generated.SymbolLayer;
import com.mapbox.maps.extension.style.layers.generated.SymbolLayerDsl;
import com.mapbox.maps.extension.style.layers.generated.SymbolLayerKt;
import com.mapbox.maps.extension.style.sources.SourceUtils;
import com.mapbox.maps.extension.style.sources.generated.GeoJsonSource;
import com.mapbox.maps.extension.style.sources.generated.GeoJsonSourceKt;
import com.mapbox.maps.interactions.FeatureState;
import com.mapbox.maps.interactions.FeaturesetFeature;
import com.mapbox.maps.plugin.InvalidPluginConfigurationException;
import com.mapbox.maps.plugin.Plugin;
import com.mapbox.maps.plugin.annotation.Annotation;
import com.mapbox.maps.plugin.annotation.AnnotationOptions;
import com.mapbox.maps.plugin.annotation.OnAnnotationClickListener;
import com.mapbox.maps.plugin.annotation.OnAnnotationDragListener;
import com.mapbox.maps.plugin.annotation.OnAnnotationInteractionListener;
import com.mapbox.maps.plugin.annotation.OnAnnotationLongClickListener;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotation;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import com.mapbox.maps.plugin.delegates.MapFeatureQueryDelegate;
import com.mapbox.maps.plugin.delegates.MapInteractionDelegate;
import com.mapbox.maps.plugin.gestures.GesturesPlugin;
import com.mapbox.maps.plugin.gestures.OnMapClickListener;
import com.mapbox.maps.plugin.gestures.OnMapLongClickListener;
import com.mapbox.maps.plugin.gestures.OnMoveListener;
import d53.u;
import e23.l;
import e23.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import n23.j;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p13.h0;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000À\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000 É\u0001*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0003*\u0014\b\u0002\u0010\u0006*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005*\u000e\b\u0003\u0010\b*\b\u0012\u0004\u0012\u00028\u00010\u0007*\u000e\b\u0004\u0010\n*\b\u0012\u0004\u0012\u00028\u00010\t*\u000e\b\u0005\u0010\f*\b\u0012\u0004\u0012\u00028\u00010\u000b*\u000e\b\u0006\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00010\r*\b\b\u0007\u0010\u0010*\u00020\u000f2,\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00060\u0011:\bÉ\u0001Ê\u0001Ë\u0001Ì\u0001BE\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00070\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0018H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00028\u00012\u0006\u0010 \u001a\u00028\u0002H\u0016¢\u0006\u0004\b!\u0010\"J#\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00020#H\u0016¢\u0006\u0004\b!\u0010%J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00028\u0001H\u0016¢\u0006\u0004\b(\u0010)J\u001d\u0010(\u001a\u00020'2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\b(\u0010+J\u000f\u0010,\u001a\u00020'H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00103\u001a\u00020'2\u0006\u0010.\u001a\u00020\u00182\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020'2\u0006\u0010&\u001a\u00028\u0001H\u0016¢\u0006\u0004\b4\u0010)J\u001d\u00104\u001a\u00020'2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\b4\u0010+J\u000f\u00105\u001a\u00020'H\u0016¢\u0006\u0004\b5\u0010-J\u0017\u00106\u001a\u00020'2\u0006\u0010&\u001a\u00028\u0001H\u0016¢\u0006\u0004\b6\u0010)J\u001f\u0010:\u001a\u00020'2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u000207H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020'2\u0006\u0010<\u001a\u00020\u0018H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020'2\u0006\u0010<\u001a\u00020\u0018H$¢\u0006\u0004\b?\u0010>J\u0017\u0010B\u001a\u0004\u0018\u00018\u00012\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\u0017\u0010B\u001a\u0004\u0018\u00018\u00012\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bB\u0010FJ\u001f\u0010J\u001a\u00020'2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020\u0018H\u0004¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020'H\u0002¢\u0006\u0004\bL\u0010-J\u000f\u0010M\u001a\u00020'H\u0002¢\u0006\u0004\bM\u0010-J\u000f\u0010N\u001a\u00020'H\u0002¢\u0006\u0004\bN\u0010-J!\u0010S\u001a\u00020R2\u0006\u0010O\u001a\u00020\u00182\b\u0010Q\u001a\u0004\u0018\u00010PH\u0002¢\u0006\u0004\bS\u0010TJ!\u0010V\u001a\u00020R2\u0006\u0010U\u001a\u00020\u00182\b\u0010Q\u001a\u0004\u0018\u00010PH\u0002¢\u0006\u0004\bV\u0010TJ1\u0010Y\u001a\u00020'2\u0006\u0010X\u001a\u00020W2\b\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u00020'2\u0006\u0010[\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\\\u0010>JK\u0010a\u001a\u00020`2\u0006\u0010]\u001a\u0002072\u0018\u0010_\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u0002070^0#2\b\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\ba\u0010bJ)\u0010d\u001a\u00020c2\b\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020'H\u0002¢\u0006\u0004\bf\u0010-J\u000f\u0010g\u001a\u00020'H\u0002¢\u0006\u0004\bg\u0010-J%\u0010i\u001a\u00020'2\u0006\u0010X\u001a\u00020W2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010hH\u0002¢\u0006\u0004\bi\u0010jJ\u0013\u0010l\u001a\u00020k*\u00020kH\u0002¢\u0006\u0004\bl\u0010mJ#\u0010o\u001a\b\u0012\u0004\u0012\u00020n0#2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010hH\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010r\u001a\u00020q2\u0006\u0010&\u001a\u00028\u0001H\u0002¢\u0006\u0004\br\u0010sJ\u000f\u0010t\u001a\u00020'H\u0002¢\u0006\u0004\bt\u0010-J\u0019\u0010w\u001a\u00020q*\b\u0012\u0004\u0012\u00020v0uH\u0002¢\u0006\u0004\bw\u0010xR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010y\u001a\u0004\bz\u0010{R'\u0010}\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020q0|8\u0004X\u0084\u0004¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001f\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u0012\u0005\b\u008a\u0001\u0010-R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010\u000eR\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010\u000eR\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00018\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R5\u0010\u008f\u0001\u001a \u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00010\u008d\u0001j\u000f\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u0001`\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R5\u0010\u0091\u0001\u001a \u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00010\u008d\u0001j\u000f\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u0001`\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0090\u0001R\u001f\u0010\u0092\u0001\u001a\u00020k8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001f\u0010\u0098\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R&\u0010\u009b\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180\u009a\u00018\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001e\u0010\u009f\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u009c\u0001R\u001a\u0010¡\u0001\u001a\u00030 \u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\"\u0010¥\u0001\u001a\r ¤\u0001*\u0005\u0018\u00010£\u00010£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R2\u0010¨\u0001\u001a\u00028\u00072\u0007\u0010§\u0001\u001a\u00028\u00078\u0000@AX\u0080\u000e¢\u0006\u0018\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R2\u0010®\u0001\u001a\u00020R2\u0007\u0010§\u0001\u001a\u00020R8\u0000@AX\u0080\u000e¢\u0006\u0018\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R2\u0010´\u0001\u001a\u00028\u00072\u0007\u0010§\u0001\u001a\u00028\u00078\u0000@AX\u0080\u000e¢\u0006\u0018\n\u0006\b´\u0001\u0010©\u0001\u001a\u0006\bµ\u0001\u0010«\u0001\"\u0006\b¶\u0001\u0010\u00ad\u0001R2\u0010·\u0001\u001a\u00020R2\u0007\u0010§\u0001\u001a\u00020R8\u0000@AX\u0080\u000e¢\u0006\u0018\n\u0006\b·\u0001\u0010¯\u0001\u001a\u0006\b¸\u0001\u0010±\u0001\"\u0006\b¹\u0001\u0010³\u0001R&\u0010º\u0001\u001a\t\u0012\u0004\u0012\u00028\u00030\u009a\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bº\u0001\u0010\u009c\u0001\u001a\u0006\b»\u0001\u0010\u009e\u0001R&\u0010¼\u0001\u001a\t\u0012\u0004\u0012\u00028\u00040\u009a\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¼\u0001\u0010\u009c\u0001\u001a\u0006\b½\u0001\u0010\u009e\u0001R&\u0010¾\u0001\u001a\t\u0012\u0004\u0012\u00028\u00050\u009a\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¾\u0001\u0010\u009c\u0001\u001a\u0006\b¿\u0001\u0010\u009e\u0001R&\u0010À\u0001\u001a\t\u0012\u0004\u0012\u00028\u00060\u009a\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÀ\u0001\u0010\u009c\u0001\u001a\u0006\bÁ\u0001\u0010\u009e\u0001R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010#8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÂ\u0001\u0010\u009e\u0001R$\u0010È\u0001\u001a\u0005\u0018\u00010Ã\u00018&@&X¦\u000e¢\u0006\u0010\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0006\bÆ\u0001\u0010Ç\u0001¨\u0006Í\u0001"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/AnnotationManagerImpl;", "Lcom/mapbox/geojson/Geometry;", "G", "Lcom/mapbox/maps/plugin/annotation/Annotation;", "T", "Lcom/mapbox/maps/plugin/annotation/AnnotationOptions;", "S", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationDragListener;", "D", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationClickListener;", "U", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationLongClickListener;", "V", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationInteractionListener;", "I", "Lcom/mapbox/maps/extension/style/layers/Layer;", "L", "Lcom/mapbox/maps/plugin/annotation/AnnotationManager;", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "delegateProvider", "Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;", "annotationConfig", "", TtmlNode.ATTR_ID, "", "typeName", "Lkotlin/Function2;", "createLayerFunction", "<init>", "(Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;JLjava/lang/String;Le23/p;)V", "getAnnotationIdKey", "()Ljava/lang/String;", "option", "create", "(Lcom/mapbox/maps/plugin/annotation/AnnotationOptions;)Lcom/mapbox/maps/plugin/annotation/Annotation;", "", "options", "(Ljava/util/List;)Ljava/util/List;", "annotation", "", "delete", "(Lcom/mapbox/maps/plugin/annotation/Annotation;)V", "annotations", "(Ljava/util/List;)V", "deleteAll", "()V", "imageId", "Landroid/graphics/Bitmap;", "bitmap", "addStyleImage$plugin_annotation_release", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "addStyleImage", "update", "onDestroy", "selectAnnotation", "", "width", "height", "onSizeChanged", "(II)V", "property", "enableDataDrivenProperty", "(Ljava/lang/String;)V", "setDataDrivenPropertyIsUsed", "Lcom/mapbox/geojson/Point;", "point", "queryMapForFeatures", "(Lcom/mapbox/geojson/Point;)Lcom/mapbox/maps/plugin/annotation/Annotation;", "Lcom/mapbox/maps/ScreenCoordinate;", "screenCoordinate", "(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/plugin/annotation/Annotation;", "Lcom/mapbox/bindgen/Value;", "value", "propertyName", "setLayerProperty", "(Lcom/mapbox/bindgen/Value;Ljava/lang/String;)V", "registerInteractions", "drag", "unregisterInteractions", "sourceId", "Lcom/mapbox/maps/plugin/annotation/AnnotationSourceOptions;", "annotationSourceOptions", "Lcom/mapbox/maps/extension/style/sources/generated/GeoJsonSource;", "createSource", "(Ljava/lang/String;Lcom/mapbox/maps/plugin/annotation/AnnotationSourceOptions;)Lcom/mapbox/maps/extension/style/sources/generated/GeoJsonSource;", "dragSourceId", "createDragSource", "Lcom/mapbox/maps/MapboxStyleManager;", TtmlNode.TAG_STYLE, "initClusterLayers", "(Lcom/mapbox/maps/MapboxStyleManager;Lcom/mapbox/maps/plugin/annotation/AnnotationSourceOptions;Ljava/lang/String;J)V", "clusterLayerId", "initClusterListener", "level", "Lo13/p;", "colorLevels", "Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "createClusterLevelLayer", "(ILjava/util/List;Lcom/mapbox/maps/plugin/annotation/AnnotationSourceOptions;Ljava/lang/String;J)Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "createClusterTextLayer", "(Lcom/mapbox/maps/plugin/annotation/AnnotationSourceOptions;Ljava/lang/String;J)Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayer;", "updateDragSource", "updateSource", "", "addIconToStyle", "(Lcom/mapbox/maps/MapboxStyleManager;Ljava/util/Collection;)V", "Lcom/google/gson/JsonObject;", "applyPropertyDefaults", "(Lcom/google/gson/JsonObject;)Lcom/google/gson/JsonObject;", "Lcom/mapbox/geojson/Feature;", "convertAnnotationsToFeatures", "(Ljava/util/Collection;)Ljava/util/List;", "", "startDragging", "(Lcom/mapbox/maps/plugin/annotation/Annotation;)Z", "stopDragging", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/FeatureState;", "isCluster", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;)Z", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "getDelegateProvider", "()Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "", "dataDrivenPropertyUsageMap", "Ljava/util/Map;", "getDataDrivenPropertyUsageMap", "()Ljava/util/Map;", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "mapCameraManagerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "Lcom/mapbox/maps/plugin/delegates/MapFeatureQueryDelegate;", "mapFeatureQueryDelegate", "Lcom/mapbox/maps/plugin/delegates/MapFeatureQueryDelegate;", "Lcom/mapbox/maps/plugin/delegates/MapInteractionDelegate;", "mapInteractionDelegate", "Lcom/mapbox/maps/plugin/delegates/MapInteractionDelegate;", "getMapInteractionDelegate$annotations", "draggingAnnotation", "Lcom/mapbox/maps/plugin/annotation/Annotation;", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "annotationMap", "Ljava/util/LinkedHashMap;", "dragAnnotationMap", "dataDrivenPropertyDefaultValues", "Lcom/google/gson/JsonObject;", "getDataDrivenPropertyDefaultValues$plugin_annotation_release", "()Lcom/google/gson/JsonObject;", "", "Lcom/mapbox/common/Cancelable;", "interactionsCancelableSet", "Ljava/util/Set;", "", "associatedLayers", "Ljava/util/List;", "getAssociatedLayers", "()Ljava/util/List;", "associatedSources", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "gesturesPlugin", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "Lcom/mapbox/android/gestures/MoveGestureDetector;", "kotlin.jvm.PlatformType", "mapMoveDetector", "Lcom/mapbox/android/gestures/MoveGestureDetector;", "<set-?>", "layer", "Lcom/mapbox/maps/extension/style/layers/Layer;", "getLayer$plugin_annotation_release", "()Lcom/mapbox/maps/extension/style/layers/Layer;", "setLayer$plugin_annotation_release", "(Lcom/mapbox/maps/extension/style/layers/Layer;)V", "source", "Lcom/mapbox/maps/extension/style/sources/generated/GeoJsonSource;", "getSource$plugin_annotation_release", "()Lcom/mapbox/maps/extension/style/sources/generated/GeoJsonSource;", "setSource$plugin_annotation_release", "(Lcom/mapbox/maps/extension/style/sources/generated/GeoJsonSource;)V", "dragLayer", "getDragLayer$plugin_annotation_release", "setDragLayer$plugin_annotation_release", "dragSource", "getDragSource$plugin_annotation_release", "setDragSource$plugin_annotation_release", "dragListeners", "getDragListeners", "clickListeners", "getClickListeners", "longClickListeners", "getLongClickListeners", "interactionListener", "getInteractionListener", "getAnnotations", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getLayerFilter", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "setLayerFilter", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)V", "layerFilter", "Companion", "MapClick", "MapLongClick", "MapMove", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class AnnotationManagerImpl<G extends Geometry, T extends Annotation<G>, S extends AnnotationOptions<G, T>, D extends OnAnnotationDragListener<? extends T>, U extends OnAnnotationClickListener<T>, V extends OnAnnotationLongClickListener<T>, I extends OnAnnotationInteractionListener<T>, L extends Layer> implements AnnotationManager<G, T, S, D, U, V, I> {

    @Deprecated
    private static final long QUERY_WAIT_TIME = 2;

    @Deprecated
    private static final String TAG = "AnnotationManagerImpl";
    private final LinkedHashMap<String, T> annotationMap;
    private final List<String> associatedLayers;
    private final List<String> associatedSources;
    private final List<U> clickListeners;
    private final JsonObject dataDrivenPropertyDefaultValues;
    private final Map<String, Boolean> dataDrivenPropertyUsageMap;
    private final MapDelegateProvider delegateProvider;
    private final LinkedHashMap<String, T> dragAnnotationMap;
    private L dragLayer;
    private final List<D> dragListeners;
    private GeoJsonSource dragSource;
    private T draggingAnnotation;
    private GesturesPlugin gesturesPlugin;
    private int height;
    private final List<I> interactionListener;
    private final Set<Cancelable> interactionsCancelableSet;
    private L layer;
    private final List<V> longClickListeners;
    private final MapCameraManagerDelegate mapCameraManagerDelegate;
    private final MapFeatureQueryDelegate mapFeatureQueryDelegate;
    private final MapInteractionDelegate mapInteractionDelegate;
    private final MoveGestureDetector mapMoveDetector;
    private GeoJsonSource source;
    private int width;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String POINT_COUNT = "point_count";

    @Deprecated
    private static final Expression DEFAULT_TEXT_FIELD = Expression.INSTANCE.get(POINT_COUNT);

    @e
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/AnnotationManagerImpl$MapClick;", "Lcom/mapbox/maps/plugin/gestures/OnMapClickListener;", "(Lcom/mapbox/maps/plugin/annotation/AnnotationManagerImpl;)V", "onMapClick", "", "point", "Lcom/mapbox/geojson/Point;", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class MapClick implements OnMapClickListener {
        public MapClick() {
        }

        @Override // com.mapbox.maps.plugin.gestures.OnMapClickListener
        public boolean onMapClick(Point point) {
            point.getClass();
            return false;
        }
    }

    @e
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/AnnotationManagerImpl$MapLongClick;", "Lcom/mapbox/maps/plugin/gestures/OnMapLongClickListener;", "(Lcom/mapbox/maps/plugin/annotation/AnnotationManagerImpl;)V", "onMapLongClick", "", "point", "Lcom/mapbox/geojson/Point;", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class MapLongClick implements OnMapLongClickListener {
        public MapLongClick() {
        }

        @Override // com.mapbox.maps.plugin.gestures.OnMapLongClickListener
        public boolean onMapLongClick(Point point) {
            point.getClass();
            return false;
        }
    }

    @e
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/AnnotationManagerImpl$MapMove;", "Lcom/mapbox/maps/plugin/gestures/OnMoveListener;", "(Lcom/mapbox/maps/plugin/annotation/AnnotationManagerImpl;)V", "onMove", "", "detector", "Lcom/mapbox/android/gestures/MoveGestureDetector;", "onMoveBegin", "", "onMoveEnd", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class MapMove implements OnMoveListener {
        public MapMove() {
        }

        @Override // com.mapbox.maps.plugin.gestures.OnMoveListener
        public boolean onMove(MoveGestureDetector detector) {
            detector.getClass();
            return false;
        }

        @Override // com.mapbox.maps.plugin.gestures.OnMoveListener
        public void onMoveBegin(MoveGestureDetector detector) {
            detector.getClass();
        }

        @Override // com.mapbox.maps.plugin.gestures.OnMoveListener
        public void onMoveEnd(MoveGestureDetector detector) {
            detector.getClass();
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$initClusterListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0014\b\u0002\u0010\u0006*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0007\"\u000e\b\u0003\u0010\b*\b\u0012\u0004\u0012\u0002H\u00040\t\"\u000e\b\u0004\u0010\n*\b\u0012\u0004\u0012\u0002H\u00040\u000b\"\u000e\b\u0005\u0010\f*\b\u0012\u0004\u0012\u0002H\u00040\r\"\u000e\b\u0006\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u00040\u000f\"\b\b\u0007\u0010\u0010*\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\n¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"<anonymous>", "", "G", "Lcom/mapbox/geojson/Geometry;", "T", "Lcom/mapbox/maps/plugin/annotation/Annotation;", "S", "Lcom/mapbox/maps/plugin/annotation/AnnotationOptions;", "D", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationDragListener;", "U", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationClickListener;", "V", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationLongClickListener;", "I", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationInteractionListener;", "L", "Lcom/mapbox/maps/extension/style/layers/Layer;", "selectedFeature", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/FeatureState;", "<anonymous parameter 1>", "Lcom/mapbox/maps/InteractionContext;", "invoke", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/maps/InteractionContext;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42261 extends w implements p<FeaturesetFeature<FeatureState>, InteractionContext, Boolean> {
        final /* synthetic */ AnnotationManagerImpl<G, T, S, D, U, V, I, L> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42261(AnnotationManagerImpl<G, T, S, D, U, V, I, L> annotationManagerImpl) {
            super(2);
            this.this$0 = annotationManagerImpl;
        }

        @Override // e23.p
        public final Boolean invoke(FeaturesetFeature<FeatureState> featuresetFeature, InteractionContext interactionContext) {
            featuresetFeature.getClass();
            interactionContext.getClass();
            if (this.this$0.isCluster(featuresetFeature)) {
                AnnotationManagerImpl<G, T, S, D, U, V, I, L> annotationManagerImpl = this.this$0;
                if (annotationManagerImpl instanceof ClusterAnnotationManager) {
                    List<OnClusterClickListener> clusterClickListeners = ((ClusterAnnotationManager) annotationManagerImpl).getClusterClickListeners();
                    boolean z14 = false;
                    if (clusterClickListeners == null || !clusterClickListeners.isEmpty()) {
                        Iterator<T> it = clusterClickListeners.iterator();
                        while (it.hasNext()) {
                            if (((OnClusterClickListener) it.next()).onClusterClick(new ClusterFeature(featuresetFeature))) {
                                z14 = true;
                                break;
                            }
                        }
                    }
                    return Boolean.valueOf(z14);
                }
            }
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$initClusterListener$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0014\b\u0002\u0010\u0006*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0007\"\u000e\b\u0003\u0010\b*\b\u0012\u0004\u0012\u0002H\u00040\t\"\u000e\b\u0004\u0010\n*\b\u0012\u0004\u0012\u0002H\u00040\u000b\"\u000e\b\u0005\u0010\f*\b\u0012\u0004\u0012\u0002H\u00040\r\"\u000e\b\u0006\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u00040\u000f\"\b\b\u0007\u0010\u0010*\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\n¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"<anonymous>", "", "G", "Lcom/mapbox/geojson/Geometry;", "T", "Lcom/mapbox/maps/plugin/annotation/Annotation;", "S", "Lcom/mapbox/maps/plugin/annotation/AnnotationOptions;", "D", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationDragListener;", "U", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationClickListener;", "V", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationLongClickListener;", "I", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationInteractionListener;", "L", "Lcom/mapbox/maps/extension/style/layers/Layer;", "selectedFeature", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/FeatureState;", "<anonymous parameter 1>", "Lcom/mapbox/maps/InteractionContext;", "invoke", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/maps/InteractionContext;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements p<FeaturesetFeature<FeatureState>, InteractionContext, Boolean> {
        final /* synthetic */ AnnotationManagerImpl<G, T, S, D, U, V, I, L> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AnnotationManagerImpl<G, T, S, D, U, V, I, L> annotationManagerImpl) {
            super(2);
            this.this$0 = annotationManagerImpl;
        }

        @Override // e23.p
        public final Boolean invoke(FeaturesetFeature<FeatureState> featuresetFeature, InteractionContext interactionContext) {
            featuresetFeature.getClass();
            interactionContext.getClass();
            if (this.this$0.isCluster(featuresetFeature)) {
                AnnotationManagerImpl<G, T, S, D, U, V, I, L> annotationManagerImpl = this.this$0;
                if (annotationManagerImpl instanceof ClusterAnnotationManager) {
                    List<OnClusterLongClickListener> clusterLongClickListeners = ((ClusterAnnotationManager) annotationManagerImpl).getClusterLongClickListeners();
                    boolean z14 = false;
                    if (clusterLongClickListeners == null || !clusterLongClickListeners.isEmpty()) {
                        Iterator<T> it = clusterLongClickListeners.iterator();
                        while (it.hasNext()) {
                            if (((OnClusterLongClickListener) it.next()).onClusterLongClick(new ClusterFeature(featuresetFeature))) {
                                z14 = true;
                                break;
                            }
                        }
                    }
                    return Boolean.valueOf(z14);
                }
            }
            return Boolean.FALSE;
        }
    }

    public AnnotationManagerImpl(MapDelegateProvider mapDelegateProvider, AnnotationConfig annotationConfig, long j8, String str, p<? super String, ? super String, ? extends L> pVar) throws InvalidPluginConfigurationException {
        String belowLayerId;
        mapDelegateProvider.getClass();
        str.getClass();
        pVar.getClass();
        this.delegateProvider = mapDelegateProvider;
        this.dataDrivenPropertyUsageMap = new LinkedHashMap();
        this.mapCameraManagerDelegate = mapDelegateProvider.getMapCameraManagerDelegate();
        this.mapFeatureQueryDelegate = mapDelegateProvider.getMapFeatureQueryDelegate();
        this.mapInteractionDelegate = mapDelegateProvider.getMapInteractionDelegate();
        this.annotationMap = new LinkedHashMap<>();
        this.dragAnnotationMap = new LinkedHashMap<>();
        this.dataDrivenPropertyDefaultValues = new JsonObject();
        this.interactionsCancelableSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        this.associatedLayers = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.associatedSources = arrayList2;
        GesturesPlugin gesturesPlugin = (GesturesPlugin) mapDelegateProvider.getMapPluginProviderDelegate().getPlugin(Plugin.MAPBOX_GESTURES_PLUGIN_ID);
        if (gesturesPlugin == null) {
            throw new InvalidPluginConfigurationException("Can't look up an instance of plugin, is it available on the clazz path and loaded through the map?");
        }
        this.gesturesPlugin = gesturesPlugin;
        this.mapMoveDetector = gesturesPlugin.getGesturesManager().getMoveGestureDetector();
        this.dragListeners = new ArrayList();
        this.clickListeners = new ArrayList();
        this.longClickListeners = new ArrayList();
        this.interactionListener = new ArrayList();
        AnnotationSourceOptions annotationSourceOptions = annotationConfig != null ? annotationConfig.getAnnotationSourceOptions() : null;
        MapboxStyleManager mapStyleManagerDelegate = mapDelegateProvider.getMapStyleManagerDelegate();
        String strD = (annotationConfig == null || (strD = annotationConfig.getLayerId()) == null) ? j.d(j8, "mapbox-android-", str, "-layer-") : strD;
        String strD2 = (annotationConfig == null || (strD2 = annotationConfig.getSourceId()) == null) ? j.d(j8, "mapbox-android-", str, "-source-") : strD2;
        this.source = createSource(strD2, annotationSourceOptions);
        this.layer = pVar.invoke(strD, strD2);
        String strD3 = j.d(j8, "mapbox-android-", str, "-draglayer-");
        String strD4 = j.d(j8, "mapbox-android-", str, "-dragsource-");
        this.dragSource = createDragSource(strD4, annotationSourceOptions);
        this.dragLayer = pVar.invoke(strD3, strD4);
        if (!mapStyleManagerDelegate.styleSourceExists(this.source.getSourceId())) {
            SourceUtils.addSource(mapStyleManagerDelegate, this.source);
            arrayList2.add(this.source.getSourceId());
        }
        if (!mapStyleManagerDelegate.styleLayerExists(this.layer.getLayerId())) {
            if (annotationConfig == null || (belowLayerId = annotationConfig.getBelowLayerId()) == null) {
                LayerUtils.addPersistentLayer$default(mapStyleManagerDelegate, this.layer, null, 2, null);
            } else if (mapStyleManagerDelegate.styleLayerExists(belowLayerId)) {
                LayerUtils.addPersistentLayer(mapStyleManagerDelegate, this.layer, new LayerPosition(null, annotationConfig.getBelowLayerId(), null));
            } else {
                StringBuilder sbL = hb.a.l("Layer with id ", belowLayerId, " doesn't exist in style ");
                sbL.append(mapStyleManagerDelegate.getStyleURI());
                sbL.append(", will add annotation layer directly.");
                MapboxLogger.logW(TAG, sbL.toString());
                LayerUtils.addPersistentLayer$default(mapStyleManagerDelegate, this.layer, null, 2, null);
            }
            arrayList.add(this.layer.getLayerId());
        }
        if (!mapStyleManagerDelegate.styleSourceExists(this.dragSource.getSourceId())) {
            SourceUtils.addSource(mapStyleManagerDelegate, this.dragSource);
            arrayList2.add(this.dragSource.getSourceId());
        }
        if (!mapStyleManagerDelegate.styleLayerExists(this.dragLayer.getLayerId())) {
            LayerUtils.addPersistentLayer(mapStyleManagerDelegate, this.dragLayer, new LayerPosition(this.layer.getLayerId(), null, null));
            arrayList.add(this.dragLayer.getLayerId());
        }
        L l14 = this.layer;
        if ((l14 instanceof SymbolLayer) || (l14 instanceof CircleLayer)) {
            initClusterLayers(mapStyleManagerDelegate, annotationSourceOptions, str, j8);
        }
        updateSource();
        registerInteractions();
    }

    private final void addIconToStyle(MapboxStyleManager style, Collection<? extends T> annotations) {
        String iconImage;
        Bitmap iconImageBitmap;
        Iterator<T> it = annotations.iterator();
        while (it.hasNext()) {
            Annotation annotation = (Annotation) it.next();
            PointAnnotation pointAnnotation = annotation instanceof PointAnnotation ? (PointAnnotation) annotation : null;
            if (pointAnnotation != null && (iconImage = pointAnnotation.getIconImage()) != null && u.y(iconImage, PointAnnotation.ICON_DEFAULT_NAME_PREFIX, false) && !style.hasStyleImage(iconImage) && (iconImageBitmap = pointAnnotation.getIconImageBitmap()) != null) {
                ImageUtils.addImage(style, ImageUtils.image$default(iconImage, iconImageBitmap, (l) null, 4, (Object) null));
            }
        }
    }

    private final JsonObject applyPropertyDefaults(JsonObject jsonObject) {
        Set<Map.Entry<String, JsonElement>> setEntrySet = this.dataDrivenPropertyDefaultValues.entrySet();
        setEntrySet.getClass();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!jsonObject.has((String) entry.getKey())) {
                jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
            }
        }
        return jsonObject;
    }

    private final List<Feature> convertAnnotationsToFeatures(Collection<? extends T> annotations) {
        Collection<? extends T> collection = annotations;
        ArrayList arrayList = new ArrayList(y.r(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            Annotation annotation = (Annotation) it.next();
            annotation.setUsedDataDrivenProperties();
            arrayList.add(Feature.fromGeometry(annotation.getGeometry(), applyPropertyDefaults(annotation.getJsonObjectCopy()), annotation.getId()));
        }
        return arrayList;
    }

    private final CircleLayer createClusterLevelLayer(int level, List<o13.p<Integer, Integer>> colorLevels, AnnotationSourceOptions annotationSourceOptions, String typeName, long id3) {
        return CircleLayerKt.circleLayer("mapbox-android-" + typeName + "-cluster-circle-layer-" + level + '-' + id3, this.source.getSourceId(), new AnonymousClass1(colorLevels, level, annotationSourceOptions));
    }

    private final SymbolLayer createClusterTextLayer(AnnotationSourceOptions annotationSourceOptions, String typeName, long id3) {
        return SymbolLayerKt.symbolLayer(j.d(id3, "mapbox-android-", typeName, "-cluster-text-layer-"), this.source.getSourceId(), new C42231(annotationSourceOptions));
    }

    private final GeoJsonSource createDragSource(String dragSourceId, AnnotationSourceOptions annotationSourceOptions) {
        return GeoJsonSourceKt.geoJsonSource(dragSourceId, new C42241(annotationSourceOptions));
    }

    private final GeoJsonSource createSource(String sourceId, AnnotationSourceOptions annotationSourceOptions) {
        return GeoJsonSourceKt.geoJsonSource(sourceId, new C42251(annotationSourceOptions));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    public final void drag() {
        T t7 = this.draggingAnnotation;
        if (t7 != null) {
            ScreenCoordinate screenCoordinate = new ScreenCoordinate(this.mapMoveDetector.getFocalPoint().x, this.mapMoveDetector.getFocalPoint().y);
            if (this.mapMoveDetector.getPointersCount() > 1 || !t7.getIsDraggable()) {
                stopDragging();
                this.mapInteractionDelegate.dispatch(new PlatformEventInfo(PlatformEventType.DRAG_END, screenCoordinate));
                return;
            }
            MoveDistancesObject moveObject = this.mapMoveDetector.getMoveObject(0);
            PointF pointF = new PointF(moveObject.getCurrentX(), moveObject.getCurrentY());
            float f14 = pointF.x;
            if (f14 >= 0.0f) {
                float f15 = pointF.y;
                if (f15 < 0.0f || f14 > this.width || f15 > this.height) {
                    stopDragging();
                    this.mapInteractionDelegate.dispatch(new PlatformEventInfo(PlatformEventType.DRAG_END, screenCoordinate));
                }
            } else {
                stopDragging();
                this.mapInteractionDelegate.dispatch(new PlatformEventInfo(PlatformEventType.DRAG_END, screenCoordinate));
            }
            if (this.annotationMap.containsKey(t7.getId())) {
                this.annotationMap.remove(t7.getId());
                this.dragAnnotationMap.put(t7.getId(), t7);
                updateSource();
                updateDragSource();
            }
            Geometry offsetGeometry = t7.getOffsetGeometry(this.delegateProvider.getMapCameraManagerDelegate(), moveObject);
            if (offsetGeometry != null) {
                t7.setGeometry(offsetGeometry);
                updateDragSource();
                Iterator<T> it = getDragListeners().iterator();
                while (it.hasNext()) {
                    ((OnAnnotationDragListener) it.next()).onAnnotationDrag(t7);
                }
            }
        }
    }

    private static /* synthetic */ void getMapInteractionDelegate$annotations() {
    }

    private final void initClusterLayers(MapboxStyleManager style, AnnotationSourceOptions annotationSourceOptions, String typeName, long id3) {
        ClusterOptions clusterOptions;
        if (annotationSourceOptions == null || (clusterOptions = annotationSourceOptions.getClusterOptions()) == null) {
            return;
        }
        int i14 = 0;
        for (Object obj : clusterOptions.getColorLevels()) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            CircleLayer circleLayerCreateClusterLevelLayer = createClusterLevelLayer(i14, clusterOptions.getColorLevels(), annotationSourceOptions, typeName, id3);
            if (!style.styleLayerExists(circleLayerCreateClusterLevelLayer.getLayerId())) {
                LayerUtils.addPersistentLayer(style, circleLayerCreateClusterLevelLayer, new LayerPosition((String) h0.n0(this.associatedLayers), null, null));
                this.associatedLayers.add(circleLayerCreateClusterLevelLayer.getLayerId());
                initClusterListener(circleLayerCreateClusterLevelLayer.getLayerId());
            }
            i14 = i15;
        }
        SymbolLayer symbolLayerCreateClusterTextLayer = createClusterTextLayer(annotationSourceOptions, typeName, id3);
        if (style.styleLayerExists(symbolLayerCreateClusterTextLayer.getLayerId())) {
            return;
        }
        LayerUtils.addPersistentLayer(style, symbolLayerCreateClusterTextLayer, new LayerPosition((String) h0.n0(this.associatedLayers), null, null));
        this.associatedLayers.add(symbolLayerCreateClusterTextLayer.getLayerId());
    }

    private final void initClusterListener(String clusterLayerId) {
        this.interactionsCancelableSet.add(this.mapInteractionDelegate.addInteraction(ClickInteraction.Companion.layer$default(ClickInteraction.INSTANCE, clusterLayerId, null, null, new C42261(this), 6, null)));
        this.interactionsCancelableSet.add(this.mapInteractionDelegate.addInteraction(LongClickInteraction.Companion.layer$default(LongClickInteraction.INSTANCE, clusterLayerId, null, null, new AnonymousClass2(this), 6, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCluster(FeaturesetFeature<FeatureState> featuresetFeature) {
        return featuresetFeature.getProperties().optBoolean("cluster", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryMapForFeatures$lambda$28(AnnotationManagerImpl annotationManagerImpl, ScreenCoordinate screenCoordinate, List list, CountDownLatch countDownLatch, r0 r0Var) {
        annotationManagerImpl.getClass();
        screenCoordinate.getClass();
        list.getClass();
        countDownLatch.getClass();
        r0Var.getClass();
        annotationManagerImpl.mapFeatureQueryDelegate.queryRenderedFeatures(new RenderedQueryGeometry(screenCoordinate), new RenderedQueryOptions(list, ExpressionDslKt.literal(true)), new f(annotationManagerImpl, 15, countDownLatch, r0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryMapForFeatures$lambda$28$lambda$27(AnnotationManagerImpl annotationManagerImpl, CountDownLatch countDownLatch, r0 r0Var, Expected expected) {
        QueriedRenderedFeature queriedRenderedFeature;
        QueriedFeature queriedFeature;
        Feature feature;
        JsonElement property;
        annotationManagerImpl.getClass();
        countDownLatch.getClass();
        r0Var.getClass();
        expected.getClass();
        List list = (List) expected.getValue();
        if (list != null && (queriedRenderedFeature = (QueriedRenderedFeature) h0.d0(list)) != null && (queriedFeature = queriedRenderedFeature.getQueriedFeature()) != null && (feature = queriedFeature.getFeature()) != null && (property = feature.getProperty(annotationManagerImpl.getAnnotationIdKey())) != null) {
            String asString = property.getAsString();
            if (annotationManagerImpl.annotationMap.containsKey(asString)) {
                r0Var.f105810a = annotationManagerImpl.annotationMap.get(asString);
            } else if (annotationManagerImpl.dragAnnotationMap.containsKey(asString)) {
                r0Var.f105810a = annotationManagerImpl.dragAnnotationMap.get(asString);
            } else {
                MapboxLogger.logE(TAG, "The queried id: " + asString + ", doesn't belong to an active annotation.");
            }
        }
        countDownLatch.countDown();
    }

    private final void registerInteractions() {
        AnnotationManagerImpl$registerInteractions$clickInteraction$1 annotationManagerImpl$registerInteractions$clickInteraction$1 = new AnnotationManagerImpl$registerInteractions$clickInteraction$1(this);
        this.interactionsCancelableSet.add(this.mapInteractionDelegate.addInteraction(annotationManagerImpl$registerInteractions$clickInteraction$1.invoke(this.layer.getLayerId(), this.annotationMap)));
        this.interactionsCancelableSet.add(this.mapInteractionDelegate.addInteraction(annotationManagerImpl$registerInteractions$clickInteraction$1.invoke(this.dragLayer.getLayerId(), this.dragAnnotationMap)));
        AnnotationManagerImpl$registerInteractions$longClickInteraction$1 annotationManagerImpl$registerInteractions$longClickInteraction$1 = new AnnotationManagerImpl$registerInteractions$longClickInteraction$1(this);
        this.interactionsCancelableSet.add(this.mapInteractionDelegate.addInteraction(annotationManagerImpl$registerInteractions$longClickInteraction$1.invoke(this.layer.getLayerId(), this.annotationMap)));
        this.interactionsCancelableSet.add(this.mapInteractionDelegate.addInteraction(annotationManagerImpl$registerInteractions$longClickInteraction$1.invoke(this.dragLayer.getLayerId(), this.dragAnnotationMap)));
        AnnotationManagerImpl$registerInteractions$dragInteraction$1 annotationManagerImpl$registerInteractions$dragInteraction$1 = new AnnotationManagerImpl$registerInteractions$dragInteraction$1(this);
        this.interactionsCancelableSet.add(this.mapInteractionDelegate.addInteraction(annotationManagerImpl$registerInteractions$dragInteraction$1.invoke(this.layer.getLayerId(), this.annotationMap)));
        this.interactionsCancelableSet.add(this.mapInteractionDelegate.addInteraction(annotationManagerImpl$registerInteractions$dragInteraction$1.invoke(this.dragLayer.getLayerId(), this.dragAnnotationMap)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean startDragging(T annotation) {
        if (!annotation.getIsDraggable()) {
            return false;
        }
        Iterator<T> it = getDragListeners().iterator();
        while (it.hasNext()) {
            ((OnAnnotationDragListener) it.next()).onAnnotationDragStarted(annotation);
        }
        this.draggingAnnotation = annotation;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopDragging() {
        T t7 = this.draggingAnnotation;
        if (t7 != null) {
            Iterator<T> it = getDragListeners().iterator();
            while (it.hasNext()) {
                ((OnAnnotationDragListener) it.next()).onAnnotationDragFinished(t7);
            }
            this.draggingAnnotation = null;
        }
    }

    private final void unregisterInteractions() {
        Iterator<T> it = this.interactionsCancelableSet.iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        this.interactionsCancelableSet.clear();
    }

    private final void updateDragSource() {
        MapboxStyleManager mapStyleManagerDelegate = this.delegateProvider.getMapStyleManagerDelegate();
        if (!mapStyleManagerDelegate.styleSourceExists(this.dragSource.getSourceId()) || !mapStyleManagerDelegate.styleLayerExists(this.dragLayer.getLayerId())) {
            MapboxLogger.logE(TAG, "Can't update dragSource: drag source or layer has not been added to style.");
            return;
        }
        Collection<? extends T> collectionValues = this.dragAnnotationMap.values();
        collectionValues.getClass();
        addIconToStyle(mapStyleManagerDelegate, collectionValues);
        Collection<? extends T> collectionValues2 = this.dragAnnotationMap.values();
        collectionValues2.getClass();
        List<Feature> listConvertAnnotationsToFeatures = convertAnnotationsToFeatures(collectionValues2);
        GeoJsonSource geoJsonSource = this.dragSource;
        FeatureCollection featureCollectionFromFeatures = FeatureCollection.fromFeatures(listConvertAnnotationsToFeatures);
        featureCollectionFromFeatures.getClass();
        GeoJsonSource.featureCollection$default(geoJsonSource, featureCollectionFromFeatures, null, 2, null);
    }

    private final void updateSource() {
        MapboxStyleManager mapStyleManagerDelegate = this.delegateProvider.getMapStyleManagerDelegate();
        if (!mapStyleManagerDelegate.styleSourceExists(this.source.getSourceId()) || !mapStyleManagerDelegate.styleLayerExists(this.layer.getLayerId())) {
            MapboxLogger.logE(TAG, "Can't update source: source or layer has not been added to style.");
            return;
        }
        Collection<? extends T> collectionValues = this.annotationMap.values();
        collectionValues.getClass();
        addIconToStyle(mapStyleManagerDelegate, collectionValues);
        Collection<? extends T> collectionValues2 = this.annotationMap.values();
        collectionValues2.getClass();
        List<Feature> listConvertAnnotationsToFeatures = convertAnnotationsToFeatures(collectionValues2);
        GeoJsonSource geoJsonSource = this.source;
        FeatureCollection featureCollectionFromFeatures = FeatureCollection.fromFeatures(listConvertAnnotationsToFeatures);
        featureCollectionFromFeatures.getClass();
        GeoJsonSource.featureCollection$default(geoJsonSource, featureCollectionFromFeatures, null, 2, null);
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManager
    public boolean addClickListener(U u8) {
        return AnnotationManager.DefaultImpls.addClickListener(this, u8);
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManager
    public boolean addDragListener(D d14) {
        return AnnotationManager.DefaultImpls.addDragListener(this, d14);
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManager
    public boolean addInteractionListener(I i14) {
        return AnnotationManager.DefaultImpls.addInteractionListener(this, i14);
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManager
    public boolean addLongClickListener(V v14) {
        return AnnotationManager.DefaultImpls.addLongClickListener(this, v14);
    }

    public final void addStyleImage$plugin_annotation_release(String imageId, Bitmap bitmap) {
        imageId.getClass();
        bitmap.getClass();
        ImageUtils.addImage(this.delegateProvider.getMapStyleManagerDelegate(), ImageUtils.image$default(imageId, bitmap, (l) null, 4, (Object) null));
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManager
    public List<T> create(List<? extends S> options) {
        options.getClass();
        ArrayList arrayList = new ArrayList(y.r(options, 10));
        Iterator<T> it = options.iterator();
        while (it.hasNext()) {
            AnnotationOptions annotationOptions = (AnnotationOptions) it.next();
            String string = UUID.randomUUID().toString();
            string.getClass();
            Annotation annotationBuild = annotationOptions.build(string, this);
            this.annotationMap.put(annotationBuild.getId(), (T) annotationBuild);
            arrayList.add(annotationBuild);
        }
        updateSource();
        return arrayList;
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManager
    public void delete(List<? extends T> annotations) {
        annotations.getClass();
        Iterator<T> it = annotations.iterator();
        boolean z14 = false;
        boolean z15 = false;
        while (it.hasNext()) {
            Annotation annotation = (Annotation) it.next();
            if (this.annotationMap.remove(annotation.getId()) != null) {
                z14 = true;
            } else if (this.dragAnnotationMap.remove(annotation.getId()) != null) {
                z15 = true;
            }
        }
        if (z14) {
            updateSource();
        }
        if (z15) {
            updateDragSource();
        }
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManager
    public void deleteAll() {
        if (!this.annotationMap.isEmpty()) {
            this.annotationMap.clear();
            updateSource();
        }
        if (this.dragAnnotationMap.isEmpty()) {
            return;
        }
        this.dragAnnotationMap.clear();
        updateDragSource();
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManager
    public void enableDataDrivenProperty(String property) {
        property.getClass();
        if (s.g(this.dataDrivenPropertyUsageMap.get(property), Boolean.FALSE)) {
            this.dataDrivenPropertyUsageMap.put(property, Boolean.TRUE);
            setDataDrivenPropertyIsUsed(property);
        }
    }

    public abstract String getAnnotationIdKey();

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManager
    public List<T> getAnnotations() {
        Collection<T> collectionValues = this.annotationMap.values();
        collectionValues.getClass();
        Collection<T> collectionValues2 = this.dragAnnotationMap.values();
        collectionValues2.getClass();
        return h0.C0(collectionValues, collectionValues2);
    }

    public final List<String> getAssociatedLayers() {
        return this.associatedLayers;
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManager
    public List<U> getClickListeners() {
        return this.clickListeners;
    }

    /* JADX INFO: renamed from: getDataDrivenPropertyDefaultValues$plugin_annotation_release, reason: from getter */
    public final JsonObject getDataDrivenPropertyDefaultValues() {
        return this.dataDrivenPropertyDefaultValues;
    }

    public final Map<String, Boolean> getDataDrivenPropertyUsageMap() {
        return this.dataDrivenPropertyUsageMap;
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManager
    public final MapDelegateProvider getDelegateProvider() {
        return this.delegateProvider;
    }

    public final L getDragLayer$plugin_annotation_release() {
        return this.dragLayer;
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManager
    public List<D> getDragListeners() {
        return this.dragListeners;
    }

    /* JADX INFO: renamed from: getDragSource$plugin_annotation_release, reason: from getter */
    public final GeoJsonSource getDragSource() {
        return this.dragSource;
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManager
    public List<I> getInteractionListener() {
        return this.interactionListener;
    }

    public final L getLayer$plugin_annotation_release() {
        return this.layer;
    }

    public abstract Expression getLayerFilter();

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManager
    public List<V> getLongClickListeners() {
        return this.longClickListeners;
    }

    /* JADX INFO: renamed from: getSource$plugin_annotation_release, reason: from getter */
    public final GeoJsonSource getSource() {
        return this.source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mapbox.maps.plugin.annotation.AnnotationManager
    public void onDestroy() {
        MapboxStyleManager mapStyleManagerDelegate = this.delegateProvider.getMapStyleManagerDelegate();
        for (String str : this.associatedLayers) {
            if (mapStyleManagerDelegate.styleLayerExists(str)) {
                mapStyleManagerDelegate.removeStyleLayer(str);
            }
        }
        for (String str2 : this.associatedSources) {
            if (mapStyleManagerDelegate.styleSourceExists(str2)) {
                mapStyleManagerDelegate.removeStyleSource(str2);
            }
        }
        unregisterInteractions();
        this.annotationMap.clear();
        this.dragAnnotationMap.clear();
        getDragListeners().clear();
        getClickListeners().clear();
        getLongClickListeners().clear();
        getInteractionListener().clear();
        if (this instanceof ClusterAnnotationManager) {
            ClusterAnnotationManager clusterAnnotationManager = (ClusterAnnotationManager) this;
            clusterAnnotationManager.getClusterClickListeners().clear();
            clusterAnnotationManager.getClusterLongClickListeners().clear();
        }
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManager
    public void onSizeChanged(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public final T queryMapForFeatures(ScreenCoordinate screenCoordinate) throws InterruptedException {
        screenCoordinate.getClass();
        r0 r0Var = new r0();
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.layer.getLayerId());
        arrayList.add(this.dragLayer.getLayerId());
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.mapFeatureQueryDelegate.executeOnRenderThread(new a(this, screenCoordinate, arrayList, countDownLatch, r0Var, 0));
        countDownLatch.await(2L, TimeUnit.SECONDS);
        return (T) r0Var.f105810a;
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManager
    public boolean removeClickListener(U u8) {
        return AnnotationManager.DefaultImpls.removeClickListener(this, u8);
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManager
    public boolean removeDragListener(D d14) {
        return AnnotationManager.DefaultImpls.removeDragListener(this, d14);
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManager
    public boolean removeInteractionListener(I i14) {
        return AnnotationManager.DefaultImpls.removeInteractionListener(this, i14);
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManager
    public boolean removeLongClickListener(V v14) {
        return AnnotationManager.DefaultImpls.removeLongClickListener(this, v14);
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManager
    public void selectAnnotation(T annotation) {
        annotation.getClass();
        if (this.annotationMap.containsKey(annotation.getId())) {
            annotation.setSelected(!annotation.getIsSelected());
            this.annotationMap.put(annotation.getId(), annotation);
            for (I i14 : getInteractionListener()) {
                if (annotation.getIsSelected()) {
                    i14.onSelectAnnotation(annotation);
                } else {
                    i14.onDeselectAnnotation(annotation);
                }
            }
            return;
        }
        if (!this.dragAnnotationMap.containsKey(annotation.getId())) {
            MapboxLogger.logE(TAG, "Can't select annotation: " + annotation + ", the annotation isn't an active annotation.");
            return;
        }
        annotation.setSelected(!annotation.getIsSelected());
        this.dragAnnotationMap.put(annotation.getId(), annotation);
        for (I i15 : getInteractionListener()) {
            if (annotation.getIsSelected()) {
                i15.onSelectAnnotation(annotation);
            } else {
                i15.onDeselectAnnotation(annotation);
            }
        }
    }

    public abstract void setDataDrivenPropertyIsUsed(String property);

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void setDragLayer$plugin_annotation_release(Layer layer) {
        layer.getClass();
        this.dragLayer = layer;
    }

    public final /* synthetic */ void setDragSource$plugin_annotation_release(GeoJsonSource geoJsonSource) {
        geoJsonSource.getClass();
        this.dragSource = geoJsonSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void setLayer$plugin_annotation_release(Layer layer) {
        layer.getClass();
        this.layer = layer;
    }

    public abstract void setLayerFilter(Expression expression);

    public final void setLayerProperty(Value value, String propertyName) {
        value.getClass();
        propertyName.getClass();
        try {
            MapboxStyleManager mapStyleManagerDelegate = this.delegateProvider.getMapStyleManagerDelegate();
            mapStyleManagerDelegate.setStyleLayerProperty(this.layer.getLayerId(), propertyName, value);
            mapStyleManagerDelegate.setStyleLayerProperty(this.dragLayer.getLayerId(), propertyName, value);
        } catch (IllegalArgumentException e4) {
            StringBuilder sbL = hb.a.l("Incorrect property value for ", propertyName, ": ");
            sbL.append(e4.getMessage());
            j.w(sbL.toString(), e4.getCause());
        }
    }

    public final /* synthetic */ void setSource$plugin_annotation_release(GeoJsonSource geoJsonSource) {
        geoJsonSource.getClass();
        this.source = geoJsonSource;
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManager
    public void update(List<? extends T> annotations) {
        annotations.getClass();
        Iterator<T> it = annotations.iterator();
        boolean z14 = false;
        boolean z15 = false;
        while (it.hasNext()) {
            Annotation annotation = (Annotation) it.next();
            if (this.annotationMap.containsKey(annotation.getId())) {
                this.annotationMap.put(annotation.getId(), (T) annotation);
                z14 = true;
            } else if (this.dragAnnotationMap.containsKey(annotation.getId())) {
                this.dragAnnotationMap.put(annotation.getId(), (T) annotation);
                z15 = true;
            } else {
                MapboxLogger.logE(TAG, "Can't update annotation: " + annotation + ", the annotation isn't an active annotation.");
            }
        }
        if (z14) {
            updateSource();
        }
        if (z15) {
            updateDragSource();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/AnnotationManagerImpl$Companion;", "", "()V", "DEFAULT_TEXT_FIELD", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "POINT_COUNT", "", "QUERY_WAIT_TIME", "", "TAG", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$createDragSource$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0014\b\u0002\u0010\u0006*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0007\"\u000e\b\u0003\u0010\b*\b\u0012\u0004\u0012\u0002H\u00040\t\"\u000e\b\u0004\u0010\n*\b\u0012\u0004\u0012\u0002H\u00040\u000b\"\u000e\b\u0005\u0010\f*\b\u0012\u0004\u0012\u0002H\u00040\r\"\u000e\b\u0006\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u00040\u000f\"\b\b\u0007\u0010\u0010*\u00020\u0011*\u00020\u0012H\n¢\u0006\u0002\b\u0013"}, d2 = {"<anonymous>", "", "G", "Lcom/mapbox/geojson/Geometry;", "T", "Lcom/mapbox/maps/plugin/annotation/Annotation;", "S", "Lcom/mapbox/maps/plugin/annotation/AnnotationOptions;", "D", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationDragListener;", "U", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationClickListener;", "V", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationLongClickListener;", "I", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationInteractionListener;", "L", "Lcom/mapbox/maps/extension/style/layers/Layer;", "Lcom/mapbox/maps/extension/style/sources/generated/GeoJsonSource$Builder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42241 extends w implements l<GeoJsonSource.Builder, Unit> {
        final /* synthetic */ AnnotationSourceOptions $annotationSourceOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42241(AnnotationSourceOptions annotationSourceOptions) {
            super(1);
            this.$annotationSourceOptions = annotationSourceOptions;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GeoJsonSource.Builder builder) {
            builder.getClass();
            AnnotationSourceOptions annotationSourceOptions = this.$annotationSourceOptions;
            if (annotationSourceOptions != null) {
                Long maxZoom = annotationSourceOptions.getMaxZoom();
                if (maxZoom != null) {
                    builder.maxzoom(maxZoom.longValue());
                }
                Long buffer = annotationSourceOptions.getBuffer();
                if (buffer != null) {
                    builder.buffer(buffer.longValue());
                }
                Boolean lineMetrics = annotationSourceOptions.getLineMetrics();
                if (lineMetrics != null) {
                    builder.lineMetrics(lineMetrics.booleanValue());
                }
                Double tolerance = annotationSourceOptions.getTolerance();
                if (tolerance != null) {
                    builder.tolerance(tolerance.doubleValue());
                }
            }
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(GeoJsonSource.Builder builder) {
            invoke2(builder);
            return Unit.INSTANCE;
        }
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManager
    public void delete(T annotation) {
        annotation.getClass();
        if (this.annotationMap.remove(annotation.getId()) != null) {
            updateSource();
            return;
        }
        if (this.dragAnnotationMap.remove(annotation.getId()) != null) {
            updateDragSource();
            return;
        }
        MapboxLogger.logE(TAG, "Can't delete annotation: " + annotation + ", the annotation isn't an active annotation.");
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManager
    public T create(S option) {
        option.getClass();
        String string = UUID.randomUUID().toString();
        string.getClass();
        T t7 = (T) option.build(string, this);
        this.annotationMap.put(t7.getId(), t7);
        updateSource();
        return t7;
    }

    public final T queryMapForFeatures(Point point) {
        point.getClass();
        return (T) queryMapForFeatures(this.mapCameraManagerDelegate.pixelForCoordinate(point));
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$createClusterTextLayer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0014\b\u0002\u0010\u0006*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0007\"\u000e\b\u0003\u0010\b*\b\u0012\u0004\u0012\u0002H\u00040\t\"\u000e\b\u0004\u0010\n*\b\u0012\u0004\u0012\u0002H\u00040\u000b\"\u000e\b\u0005\u0010\f*\b\u0012\u0004\u0012\u0002H\u00040\r\"\u000e\b\u0006\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u00040\u000f\"\b\b\u0007\u0010\u0010*\u00020\u0011*\u00020\u0012H\n¢\u0006\u0002\b\u0013"}, d2 = {"<anonymous>", "", "G", "Lcom/mapbox/geojson/Geometry;", "T", "Lcom/mapbox/maps/plugin/annotation/Annotation;", "S", "Lcom/mapbox/maps/plugin/annotation/AnnotationOptions;", "D", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationDragListener;", "U", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationClickListener;", "V", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationLongClickListener;", "I", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationInteractionListener;", "L", "Lcom/mapbox/maps/extension/style/layers/Layer;", "Lcom/mapbox/maps/extension/style/layers/generated/SymbolLayerDsl;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42231 extends w implements l<SymbolLayerDsl, Unit> {
        final /* synthetic */ AnnotationSourceOptions $annotationSourceOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42231(AnnotationSourceOptions annotationSourceOptions) {
            super(1);
            this.$annotationSourceOptions = annotationSourceOptions;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SymbolLayerDsl symbolLayerDsl) {
            ClusterOptions clusterOptions;
            Expression expression;
            symbolLayerDsl.getClass();
            AnnotationSourceOptions annotationSourceOptions = this.$annotationSourceOptions;
            if (annotationSourceOptions == null || (clusterOptions = annotationSourceOptions.getClusterOptions()) == null) {
                return;
            }
            if (clusterOptions.getTextField() == null) {
                expression = AnnotationManagerImpl.DEFAULT_TEXT_FIELD;
            } else {
                Value textField = clusterOptions.getTextField();
                textField.getClass();
                expression = (Expression) textField;
            }
            symbolLayerDsl.textField(expression);
            if (clusterOptions.getTextSizeExpression() == null) {
                symbolLayerDsl.textSize(clusterOptions.getTextSize());
            } else {
                Value textSizeExpression = clusterOptions.getTextSizeExpression();
                textSizeExpression.getClass();
                symbolLayerDsl.textSize((Expression) textSizeExpression);
            }
            if (clusterOptions.getTextColorExpression() == null) {
                symbolLayerDsl.textColor(clusterOptions.getTextColor());
            } else {
                Value textColorExpression = clusterOptions.getTextColorExpression();
                textColorExpression.getClass();
                symbolLayerDsl.textColor((Expression) textColorExpression);
            }
            symbolLayerDsl.textIgnorePlacement(true);
            symbolLayerDsl.textAllowOverlap(true);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(SymbolLayerDsl symbolLayerDsl) {
            invoke2(symbolLayerDsl);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$createSource$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0014\b\u0002\u0010\u0006*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0007\"\u000e\b\u0003\u0010\b*\b\u0012\u0004\u0012\u0002H\u00040\t\"\u000e\b\u0004\u0010\n*\b\u0012\u0004\u0012\u0002H\u00040\u000b\"\u000e\b\u0005\u0010\f*\b\u0012\u0004\u0012\u0002H\u00040\r\"\u000e\b\u0006\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u00040\u000f\"\b\b\u0007\u0010\u0010*\u00020\u0011*\u00020\u0012H\n¢\u0006\u0002\b\u0013"}, d2 = {"<anonymous>", "", "G", "Lcom/mapbox/geojson/Geometry;", "T", "Lcom/mapbox/maps/plugin/annotation/Annotation;", "S", "Lcom/mapbox/maps/plugin/annotation/AnnotationOptions;", "D", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationDragListener;", "U", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationClickListener;", "V", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationLongClickListener;", "I", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationInteractionListener;", "L", "Lcom/mapbox/maps/extension/style/layers/Layer;", "Lcom/mapbox/maps/extension/style/sources/generated/GeoJsonSource$Builder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42251 extends w implements l<GeoJsonSource.Builder, Unit> {
        final /* synthetic */ AnnotationSourceOptions $annotationSourceOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42251(AnnotationSourceOptions annotationSourceOptions) {
            super(1);
            this.$annotationSourceOptions = annotationSourceOptions;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GeoJsonSource.Builder builder) {
            builder.getClass();
            AnnotationSourceOptions annotationSourceOptions = this.$annotationSourceOptions;
            if (annotationSourceOptions != null) {
                Long maxZoom = annotationSourceOptions.getMaxZoom();
                if (maxZoom != null) {
                    builder.maxzoom(maxZoom.longValue());
                }
                Long buffer = annotationSourceOptions.getBuffer();
                if (buffer != null) {
                    builder.buffer(buffer.longValue());
                }
                Boolean lineMetrics = annotationSourceOptions.getLineMetrics();
                if (lineMetrics != null) {
                    builder.lineMetrics(lineMetrics.booleanValue());
                }
                Double tolerance = annotationSourceOptions.getTolerance();
                if (tolerance != null) {
                    builder.tolerance(tolerance.doubleValue());
                }
                ClusterOptions clusterOptions = annotationSourceOptions.getClusterOptions();
                if (clusterOptions != null) {
                    builder.cluster(clusterOptions.getCluster());
                    builder.clusterMaxZoom(clusterOptions.getClusterMaxZoom());
                    builder.clusterMinPoints(clusterOptions.getClusterMinPoints());
                    builder.clusterRadius(clusterOptions.getClusterRadius());
                    HashMap<String, Object> clusterProperties = clusterOptions.getClusterProperties();
                    if (clusterProperties != null) {
                        builder.clusterProperties(clusterProperties);
                    }
                }
            }
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(GeoJsonSource.Builder builder) {
            invoke2(builder);
            return Unit.INSTANCE;
        }
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManager
    public void update(T annotation) {
        annotation.getClass();
        if (this.annotationMap.containsKey(annotation.getId())) {
            this.annotationMap.put(annotation.getId(), annotation);
            updateSource();
        } else if (this.dragAnnotationMap.containsKey(annotation.getId())) {
            this.dragAnnotationMap.put(annotation.getId(), annotation);
            updateDragSource();
        } else {
            MapboxLogger.logE(TAG, "Can't update annotation: " + annotation + ", the annotation isn't an active annotation.");
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$createClusterLevelLayer$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0014\b\u0002\u0010\u0006*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0007\"\u000e\b\u0003\u0010\b*\b\u0012\u0004\u0012\u0002H\u00040\t\"\u000e\b\u0004\u0010\n*\b\u0012\u0004\u0012\u0002H\u00040\u000b\"\u000e\b\u0005\u0010\f*\b\u0012\u0004\u0012\u0002H\u00040\r\"\u000e\b\u0006\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u00040\u000f\"\b\b\u0007\u0010\u0010*\u00020\u0011*\u00020\u0012H\n¢\u0006\u0002\b\u0013"}, d2 = {"<anonymous>", "", "G", "Lcom/mapbox/geojson/Geometry;", "T", "Lcom/mapbox/maps/plugin/annotation/Annotation;", "S", "Lcom/mapbox/maps/plugin/annotation/AnnotationOptions;", "D", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationDragListener;", "U", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationClickListener;", "V", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationLongClickListener;", "I", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationInteractionListener;", "L", "Lcom/mapbox/maps/extension/style/layers/Layer;", "Lcom/mapbox/maps/extension/style/layers/generated/CircleLayerDsl;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<CircleLayerDsl, Unit> {
        final /* synthetic */ AnnotationSourceOptions $annotationSourceOptions;
        final /* synthetic */ List<o13.p<Integer, Integer>> $colorLevels;
        final /* synthetic */ int $level;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<o13.p<Integer, Integer>> list, int i14, AnnotationSourceOptions annotationSourceOptions) {
            super(1);
            this.$colorLevels = list;
            this.$level = i14;
            this.$annotationSourceOptions = annotationSourceOptions;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CircleLayerDsl circleLayerDsl) {
            ClusterOptions clusterOptions;
            circleLayerDsl.getClass();
            circleLayerDsl.circleColor(this.$colorLevels.get(this.$level).f128595b.intValue());
            AnnotationSourceOptions annotationSourceOptions = this.$annotationSourceOptions;
            if (annotationSourceOptions != null && (clusterOptions = annotationSourceOptions.getClusterOptions()) != null) {
                if (clusterOptions.getCircleRadiusExpression() == null) {
                    circleLayerDsl.circleRadius(clusterOptions.getCircleRadius());
                } else {
                    Value circleRadiusExpression = clusterOptions.getCircleRadiusExpression();
                    circleRadiusExpression.getClass();
                    circleLayerDsl.circleRadius((Expression) circleRadiusExpression);
                }
            }
            Expression.Companion companion = Expression.INSTANCE;
            Expression number = companion.toNumber(companion.get(AnnotationManagerImpl.POINT_COUNT));
            circleLayerDsl.filter(this.$level == 0 ? companion.all(companion.has(AnnotationManagerImpl.POINT_COUNT), companion.gte(number, ExpressionDslKt.literal(this.$colorLevels.get(this.$level).f128594a.intValue()))) : companion.all(companion.has(AnnotationManagerImpl.POINT_COUNT), companion.gt(number, ExpressionDslKt.literal(this.$colorLevels.get(this.$level).f128594a.intValue())), companion.lt(number, ExpressionDslKt.literal(this.$colorLevels.get(this.$level - 1).f128594a.intValue()))));
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(CircleLayerDsl circleLayerDsl) {
            invoke2(circleLayerDsl);
            return Unit.INSTANCE;
        }
    }
}
