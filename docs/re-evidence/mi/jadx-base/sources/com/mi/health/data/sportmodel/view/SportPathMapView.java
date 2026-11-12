package com.mi.health.data.sportmodel.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.LinearInterpolator;
import coil.request.Disposable;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.maps.AMap;
import com.amap.api.maps.Projection;
import com.amap.api.maps.TextureMapView;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.CustomMapStyleOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.Polyline;
import com.amap.api.maps.model.PolylineOptions;
import com.mi.health.data.sportmodel.view.SportPathMapView;
import com.mi.health.map.data.GpsValues;
import com.mi.health.map.data.sportmodel.share.IShareMapLongView;
import com.mi.health.map.data.util.SportReportMapPreference;
import com.mi.health.sport.TrackShareRoutineView;
import com.mi.health.utils.MapUtilsKt;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.commonbase.data.sportmodel.view.AbstractSportPathMapView;
import com.xiaomi.fitness.detail.video.share.util.SportTraceConstants;
import defpackage.ali;
import defpackage.bmh;
import defpackage.emh;
import defpackage.l5;
import defpackage.lqi;
import defpackage.o5o;
import defpackage.qti;
import defpackage.vmi;
import defpackage.x44;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u008a\u00022\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0004\u008b\u0002\u008a\u0002B(\u0012\b\u0010\u0084\u0001\u001a\u00030\u0083\u0001\u0012\n\u0010\u0083\u0002\u001a\u0005\u0018\u00010\u0082\u0002\u0012\u0007\u0010\u0084\u0002\u001a\u00020\u0010¢\u0006\u0006\b\u0085\u0002\u0010\u0086\u0002B\u0015\b\u0016\u0012\b\u0010\u0087\u0002\u001a\u00030\u0083\u0001¢\u0006\u0006\b\u0085\u0002\u0010\u0088\u0002B!\b\u0016\u0012\b\u0010\u0087\u0002\u001a\u00030\u0083\u0001\u0012\n\u0010\u0083\u0002\u001a\u0005\u0018\u00010\u0082\u0002¢\u0006\u0006\b\u0085\u0002\u0010\u0089\u0002J%\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010\"\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00182\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010#J1\u0010%\u001a\u00020\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00182\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010&J%\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0018H\u0002¢\u0006\u0004\b(\u0010)J1\u0010*\u001a\u00020\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00182\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010&J\u0019\u0010+\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010,J\u0019\u0010-\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010,J%\u00101\u001a\u00020\b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00182\u0006\u00100\u001a\u00020\u0006H\u0002¢\u0006\u0004\b1\u00102J-\u00106\u001a\u00020\b2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0010H\u0002¢\u0006\u0004\b6\u00107J-\u0010<\u001a\u00020\b2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u0002082\f\u00103\u001a\b\u0012\u0004\u0012\u0002080;H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\bH\u0016¢\u0006\u0004\b>\u0010\fJ\u001d\u0010B\u001a\u00020\b2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020?¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\b2\u0006\u0010@\u001a\u00020\u0010H\u0016¢\u0006\u0004\bD\u0010\u0013J\u0017\u0010D\u001a\u00020\b2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bD\u0010EJ\u001d\u0010F\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\bF\u0010GJ\u001d\u0010J\u001a\u00020\b2\u0006\u0010H\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u0004¢\u0006\u0004\bJ\u0010KJ\u0015\u0010M\u001a\u00020\b2\u0006\u0010L\u001a\u00020\u0010¢\u0006\u0004\bM\u0010\u0013J\r\u0010N\u001a\u00020\u0010¢\u0006\u0004\bN\u0010OJ\u0015\u0010Q\u001a\u00020\b2\u0006\u0010P\u001a\u00020\u0006¢\u0006\u0004\bQ\u0010,J\u0017\u0010S\u001a\u00020\b2\u0006\u0010R\u001a\u00020\u0006H\u0016¢\u0006\u0004\bS\u0010,J\u000f\u0010T\u001a\u00020\bH\u0016¢\u0006\u0004\bT\u0010\fJ\u000f\u0010U\u001a\u00020\bH\u0016¢\u0006\u0004\bU\u0010\fJ\u0017\u0010W\u001a\u00020\b2\u0006\u0010V\u001a\u00020\u0006H\u0016¢\u0006\u0004\bW\u0010,J\u0017\u0010Z\u001a\u00020\b2\b\u0010Y\u001a\u0004\u0018\u00010X¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\bH\u0014¢\u0006\u0004\b\\\u0010\fJ\r\u0010]\u001a\u00020?¢\u0006\u0004\b]\u0010^J\u0015\u0010`\u001a\u00020\b2\u0006\u0010_\u001a\u00020\u0006¢\u0006\u0004\b`\u0010,J\u000f\u0010a\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\ba\u0010bJ\u000f\u0010d\u001a\u0004\u0018\u00010c¢\u0006\u0004\bd\u0010eJ\u0019\u0010h\u001a\u00020\b2\b\u0010g\u001a\u0004\u0018\u00010fH\u0016¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020\bH\u0016¢\u0006\u0004\bj\u0010\fJ\u0017\u0010l\u001a\u00020\b2\u0006\u0010k\u001a\u00020fH\u0016¢\u0006\u0004\bl\u0010iJ\u000f\u0010m\u001a\u00020\bH\u0016¢\u0006\u0004\bm\u0010\fJ\u000f\u0010n\u001a\u00020\bH\u0016¢\u0006\u0004\bn\u0010\fJ\u000f\u0010o\u001a\u00020\bH\u0016¢\u0006\u0004\bo\u0010\fJ)\u0010r\u001a\u00020\b2\u0006\u0010q\u001a\u00020p2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\br\u0010sJ\r\u0010t\u001a\u00020\b¢\u0006\u0004\bt\u0010\fJ\u0017\u0010u\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\bu\u0010\u0017J\r\u0010v\u001a\u00020\b¢\u0006\u0004\bv\u0010\fJ\u001b\u0010+\u001a\u00020\b2\f\u0010x\u001a\b\u0012\u0004\u0012\u00020w0\u0018¢\u0006\u0004\b+\u0010yJ\u001b\u0010-\u001a\u00020\b2\f\u0010x\u001a\b\u0012\u0004\u0012\u00020w0\u0018¢\u0006\u0004\b-\u0010yJP\u0010\u0080\u0001\u001a\u00020\b2>\b\u0002\u0010\u007f\u001a8\u0012\u0015\u0012\u0013\u0018\u00010{¢\u0006\f\b|\u0012\b\bA\u0012\u0004\b\b(}\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b|\u0012\b\bA\u0012\u0004\b\b(~\u0012\u0004\u0012\u00020\b\u0018\u00010z¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u000f\u0010\u0082\u0001\u001a\u00020\b¢\u0006\u0005\b\u0082\u0001\u0010\fR\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001b\u0010\u0088\u0001\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001b\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001d\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190;8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001b\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0;8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b$\u0010\u008d\u0001R\u001b\u0010/\u001a\b\u0012\u0004\u0012\u00020.0;8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b/\u0010\u008d\u0001R\u001d\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100;8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008d\u0001R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0015\u0010\u008f\u0001R\u001b\u0010\u0090\u0001\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0019\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bY\u0010\u0092\u0001R\u001a\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001b\u0010\u0099\u0001\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001b\u0010\u009b\u0001\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009a\u0001R\u0019\u0010\u009c\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R'\u0010\u009e\u0001\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0005\b \u0001\u0010^\"\u0005\b¡\u0001\u0010ER'\u0010¢\u0001\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b¢\u0001\u0010\u009f\u0001\u001a\u0005\b£\u0001\u0010^\"\u0005\b¤\u0001\u0010ER\u001b\u0010¥\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u001b\u0010§\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¦\u0001R\u0019\u0010¨\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0019\u0010ª\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010\u009d\u0001R\u0017\u0010«\u0001\u001a\u00020?8\u0002X\u0082D¢\u0006\b\n\u0006\b«\u0001\u0010\u009f\u0001R'\u0010¬\u0001\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b¬\u0001\u0010\u009f\u0001\u001a\u0005\b\u00ad\u0001\u0010^\"\u0005\b®\u0001\u0010ER'\u0010¯\u0001\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b¯\u0001\u0010\u009f\u0001\u001a\u0005\b°\u0001\u0010^\"\u0005\b±\u0001\u0010ER+\u0010²\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b²\u0001\u0010¦\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R+\u0010·\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b·\u0001\u0010¦\u0001\u001a\u0006\b¸\u0001\u0010´\u0001\"\u0006\b¹\u0001\u0010¶\u0001R'\u0010º\u0001\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\bº\u0001\u0010©\u0001\u001a\u0005\b»\u0001\u0010O\"\u0005\b¼\u0001\u0010\u0013R+\u0010½\u0001\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R(\u0010Ã\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÃ\u0001\u0010\u009d\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0005\bÆ\u0001\u0010,R(\u0010Ç\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÇ\u0001\u0010\u009d\u0001\u001a\u0006\bÈ\u0001\u0010Å\u0001\"\u0005\bÉ\u0001\u0010,R*\u0010Ë\u0001\u001a\u00030Ê\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001R,\u0010Ò\u0001\u001a\u0005\u0018\u00010Ñ\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001R,\u0010Ø\u0001\u001a\u0005\u0018\u00010Ñ\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bØ\u0001\u0010Ó\u0001\u001a\u0006\bÙ\u0001\u0010Õ\u0001\"\u0006\bÚ\u0001\u0010×\u0001R\u001d\u0010Ü\u0001\u001a\u00030Û\u00018\u0006¢\u0006\u0010\n\u0006\bÜ\u0001\u0010Ý\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001R\"\u0010à\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100;8\u0006¢\u0006\u0010\n\u0006\bà\u0001\u0010\u008d\u0001\u001a\u0006\bá\u0001\u0010â\u0001R,\u0010ä\u0001\u001a\u0005\u0018\u00010ã\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bä\u0001\u0010å\u0001\u001a\u0006\bæ\u0001\u0010ç\u0001\"\u0006\bè\u0001\u0010é\u0001R(\u0010ê\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bê\u0001\u0010\u009d\u0001\u001a\u0006\bë\u0001\u0010Å\u0001\"\u0005\bì\u0001\u0010,R\u001e\u0010î\u0001\u001a\t\u0012\u0004\u0012\u00020?0í\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R!\u0010ñ\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010ð\u00010í\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bñ\u0001\u0010ò\u0001R'\u0010ó\u0001\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\bó\u0001\u0010©\u0001\u001a\u0005\bô\u0001\u0010O\"\u0005\bõ\u0001\u0010\u0013R'\u0010ö\u0001\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\bö\u0001\u0010©\u0001\u001a\u0005\b÷\u0001\u0010O\"\u0005\bø\u0001\u0010\u0013R\u0019\u0010ù\u0001\u001a\u00020w8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bù\u0001\u0010ú\u0001R\u0019\u0010û\u0001\u001a\u00020w8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bû\u0001\u0010ú\u0001R\u001a\u0010ý\u0001\u001a\u00030ü\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bý\u0001\u0010þ\u0001R\u0019\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u00028TX\u0094\u0004¢\u0006\b\u001a\u0006\bÿ\u0001\u0010\u0080\u0002¨\u0006\u008c\u0002"}, d2 = {"Lcom/mi/health/data/sportmodel/view/SportPathMapView;", "Lcom/xiaomi/fitness/commonbase/data/sportmodel/view/AbstractSportPathMapView;", "Lcom/amap/api/maps/TextureMapView;", "Lcom/amap/api/maps/AMap;", "Landroid/graphics/Bitmap;", "bitmap", "", "isStart", "", "addCusMarker", "(Lcom/amap/api/maps/AMap;Landroid/graphics/Bitmap;Z)V", "initView", "()V", "initStyles", "initMapSetting", "setCustomMapStyle", "", DailyRecordKey.sportType, "createDataList", "(I)V", "Lcom/mi/health/map/data/GpsValues;", "gpsValues", "createMailDataList", "(Lcom/mi/health/map/data/GpsValues;)V", "", "Lcom/amap/api/maps/model/LatLng;", "originalList", "bottom", "moveCameraPath", "(Ljava/util/List;I)V", "Lbmh;", "pathRecordList", "instant", "showColor", "showPathMarker", "(Ljava/util/List;Ljava/util/List;ZZ)V", "mPathRecordList", "showPath", "(Ljava/util/List;ZZ)V", "pathRecord", "createOptimizePath", "(Lbmh;Ljava/util/List;)V", "moveLocationPath", "showStartMarker", "(Z)V", "showEndMarker", "Lcom/amap/api/maps/model/Marker;", "mailPostList", "visible", "showMailPostList", "(Ljava/util/List;Z)V", "points", "dottedLine", "pathColor", "buildLine", "(Ljava/util/List;ZI)V", "Lcom/mi/health/data/sportmodel/view/SportPathMapView$ColorPoint;", "lastPoint", "newPoint", "", "drawLines", "(Lcom/mi/health/data/sportmodel/view/SportPathMapView$ColorPoint;Lcom/mi/health/data/sportmodel/view/SportPathMapView$ColorPoint;Ljava/util/List;)V", "locationPath", "", "style", "name", "setCustomMapStyleWithLocalResource", "(Ljava/lang/String;Ljava/lang/String;)V", "loadMapStyle", "(Ljava/lang/String;)V", "setMark", "(Landroid/graphics/Bitmap;Z)V", "startBitmap", "endBitmap", "setInitMarkBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V", "index", "setChoiceIndex", "getChoiceIndex", "()I", "enable", "setAllGesturesEnabled", "isChecked", "showMailsPoints", "saveMapStyle", "recoverMapSetting", "switch", "showColorPace", "Lcom/mi/health/map/data/sportmodel/share/IShareMapLongView;", "iShareMapLongView", "setIShareMapView", "(Lcom/mi/health/map/data/sportmodel/share/IShareMapLongView;)V", "onFinishInflate", "getMapStyle", "()Ljava/lang/String;", "normal", "setMapStyle", "getMap", "()Lcom/amap/api/maps/AMap;", "Lcom/mi/health/sport/TrackShareRoutineView;", "getTrackShareRoutineView", "()Lcom/mi/health/sport/TrackShareRoutineView;", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "outState", "onSaveInstanceState", LifecycleConstantKt.ON_PAUSE, LifecycleConstantKt.ON_DESTROY, "onLowMemory", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportValues", "bindData", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Lcom/mi/health/map/data/GpsValues;I)V", "showWholePathInstantly", "rebindData", "showEmptyView", "", "LatLng", "(Ljava/util/List;)V", "Lkotlin/Function2;", "Landroid/net/Uri;", "Lkotlin/ParameterName;", "pictureUri", "pictureBitmap", "callback", "createShareBitmap", "(Lkotlin/jvm/functions/Function2;)V", "createShareBitmapNoMap", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "mMapView", "Lcom/amap/api/maps/TextureMapView;", "routineView", "Lcom/mi/health/sport/TrackShareRoutineView;", "mAMap", "Lcom/amap/api/maps/AMap;", "mOriginalList", "Ljava/util/List;", "colorList", "Lcom/mi/health/map/data/GpsValues;", "mSportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "Lcom/mi/health/map/data/sportmodel/share/IShareMapLongView;", "Lcoil/request/Disposable;", "styleDisposable", "Lcoil/request/Disposable;", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "mStartMarker", "Lcom/amap/api/maps/model/Marker;", "mEndMarker", "hasShowMarker", "Z", "currentMapStyle", "Ljava/lang/String;", "getCurrentMapStyle", "setCurrentMapStyle", "currentMapStyleName", "getCurrentMapStyleName", "setCurrentMapStyleName", "currentStartMapBitmap", "Landroid/graphics/Bitmap;", "currentEndMapBitmap", "currentEditIndex", "I", "currentShowMailPoint", "MAP_STYLE_RES_ID_BIAOZHUN", "mMapStyle", "getMMapStyle", "setMMapStyle", "mMapStyleName", "getMMapStyleName", "setMMapStyleName", "mMapStartStyle", "getMMapStartStyle", "()Landroid/graphics/Bitmap;", "setMMapStartStyle", "(Landroid/graphics/Bitmap;)V", "mMapEndStyle", "getMMapEndStyle", "setMMapEndStyle", "mMapEditIndex", "getMMapEditIndex", "setMMapEditIndex", "mShowMailPoint", "Ljava/lang/Boolean;", "getMShowMailPoint", "()Ljava/lang/Boolean;", "setMShowMailPoint", "(Ljava/lang/Boolean;)V", "mShowPathColor", "getMShowPathColor", "()Z", "setMShowPathColor", "currentShowPathColor", "getCurrentShowPathColor", "setCurrentShowPathColor", "Landroid/graphics/Path;", "path", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "setPath", "(Landroid/graphics/Path;)V", "Lcom/amap/api/maps/model/Polyline;", "pathPolyline", "Lcom/amap/api/maps/model/Polyline;", "getPathPolyline", "()Lcom/amap/api/maps/model/Polyline;", "setPathPolyline", "(Lcom/amap/api/maps/model/Polyline;)V", "lastValidLine", "getLastValidLine", "setLastValidLine", "Lcom/amap/api/maps/model/PolylineOptions;", "options", "Lcom/amap/api/maps/model/PolylineOptions;", "getOptions", "()Lcom/amap/api/maps/model/PolylineOptions;", "colorInner", "getColorInner", "()Ljava/util/List;", "Landroid/animation/ValueAnimator;", "distanceChangeAnimator", "Landroid/animation/ValueAnimator;", "getDistanceChangeAnimator", "()Landroid/animation/ValueAnimator;", "setDistanceChangeAnimator", "(Landroid/animation/ValueAnimator;)V", "pathShowFinish", "getPathShowFinish", "setPathShowFinish", "", "styleIds", "[Ljava/lang/String;", "Lcom/amap/api/maps/model/CustomMapStyleOptions;", "styles", "[Lcom/amap/api/maps/model/CustomMapStyleOptions;", "colorStarIndex", "getColorStarIndex", "setColorStarIndex", "colorEndIndex", "getColorEndIndex", "setColorEndIndex", "preLongitude", "D", "preLatitude", "", "maxIndex", "F", "getMapView", "()Lcom/amap/api/maps/TextureMapView;", "mapView", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "context", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "ColorPoint", "map-amap_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportPathMapView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportPathMapView.kt\ncom/mi/health/data/sportmodel/view/SportPathMapView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,908:1\n1#2:909\n1872#3,2:910\n1863#3,2:912\n1863#3,2:914\n1863#3,2:916\n1872#3,3:918\n1874#3:921\n*S KotlinDebug\n*F\n+ 1 SportPathMapView.kt\ncom/mi/health/data/sportmodel/view/SportPathMapView\n*L\n566#1:910,2\n570#1:912,2\n575#1:914,2\n584#1:916,2\n594#1:918,3\n566#1:921\n*E\n"})
public final class SportPathMapView extends AbstractSportPathMapView<TextureMapView> {
    public static final int LATLNG_MARGINS = 200;

    @NotNull
    private static final String TAG = "SportPathView";

    @NotNull
    private final String MAP_STYLE_RES_ID_BIAOZHUN;
    private int colorEndIndex;

    @NotNull
    private final List<Integer> colorInner;

    @NotNull
    private final List<Integer> colorList;
    private int colorStarIndex;
    private int currentEditIndex;

    @Nullable
    private Bitmap currentEndMapBitmap;

    @NotNull
    private String currentMapStyle;

    @NotNull
    private String currentMapStyleName;
    private boolean currentShowMailPoint;
    private boolean currentShowPathColor;

    @Nullable
    private Bitmap currentStartMapBitmap;

    @Nullable
    private ValueAnimator distanceChangeAnimator;

    @Nullable
    private GpsValues gpsValues;
    private boolean hasShowMarker;

    @Nullable
    private IShareMapLongView iShareMapLongView;

    @Nullable
    private Polyline lastValidLine;

    @Nullable
    private AMap mAMap;

    @NotNull
    private final Context mContext;

    @Nullable
    private Marker mEndMarker;

    @Nullable
    private Handler mHandler;
    private int mMapEditIndex;

    @Nullable
    private Bitmap mMapEndStyle;

    @Nullable
    private Bitmap mMapStartStyle;

    @NotNull
    private String mMapStyle;

    @NotNull
    private String mMapStyleName;

    @Nullable
    private TextureMapView mMapView;

    @NotNull
    private final List<LatLng> mOriginalList;

    @NotNull
    private final List<bmh> mPathRecordList;

    @Nullable
    private Boolean mShowMailPoint;
    private boolean mShowPathColor;

    @Nullable
    private SportBasicReport mSportValues;

    @Nullable
    private Marker mStartMarker;

    @NotNull
    private final List<Marker> mailPostList;
    private float maxIndex;

    @NotNull
    private final PolylineOptions options;

    @NotNull
    private Path path;

    @Nullable
    private Polyline pathPolyline;
    private boolean pathShowFinish;
    private double preLatitude;
    private double preLongitude;

    @Nullable
    private TrackShareRoutineView routineView;

    @Nullable
    private final Disposable styleDisposable;

    @NotNull
    private final String[] styleIds;

    @NotNull
    private final CustomMapStyleOptions[] styles;

    /* JADX INFO: renamed from: com.mi.health.data.sportmodel.view.SportPathMapView$createShareBitmap$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/mi/health/data/sportmodel/view/SportPathMapView$createShareBitmap$1", "Lcom/amap/api/maps/AMap$OnMapScreenShotListener;", "onMapScreenShot", "", "bitmap", "Landroid/graphics/Bitmap;", "mapScreenShotBitmap", "status", "", "map-amap_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 implements AMap.OnMapScreenShotListener {
        final /* synthetic */ Function2<Uri, Bitmap, Unit> $callback;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function2<? super Uri, ? super Bitmap, Unit> function2) {
            this.$callback = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onMapScreenShot$lambda$0(Function2 function2, Uri uri, Bitmap bitmap) {
            if (function2 != null) {
                function2.invoke(uri, bitmap);
            }
            return Unit.INSTANCE;
        }

        @Override // com.amap.api.maps.AMap.OnMapScreenShotListener
        public void onMapScreenShot(Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        }

        @Override // com.amap.api.maps.AMap.OnMapScreenShotListener
        public void onMapScreenShot(Bitmap mapScreenShotBitmap, int status) {
            Intrinsics.checkNotNullParameter(mapScreenShotBitmap, "mapScreenShotBitmap");
            Logger.i(SportPathMapView.TAG, "createShareBitmap getMapScreenShot bitmap=" + mapScreenShotBitmap + " status=" + status);
            if (SportPathMapView.this.iShareMapLongView != null) {
                IShareMapLongView iShareMapLongView = SportPathMapView.this.iShareMapLongView;
                Intrinsics.checkNotNull(iShareMapLongView);
                final Function2<Uri, Bitmap, Unit> function2 = this.$callback;
                iShareMapLongView.createMapViewBitmap(mapScreenShotBitmap, new Function2() { // from class: prn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SportPathMapView.AnonymousClass1.onMapScreenShot$lambda$0(function2, (Uri) obj, (Bitmap) obj2);
                    }
                });
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportPathMapView(@NotNull Context mContext, @Nullable AttributeSet attributeSet, int i) {
        super(mContext, attributeSet, i);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        this.mOriginalList = new ArrayList();
        this.mPathRecordList = new ArrayList();
        this.mailPostList = new ArrayList();
        this.colorList = new ArrayList();
        SportReportMapPreference sportReportMapPreference = SportReportMapPreference.INSTANCE;
        this.currentMapStyle = sportReportMapPreference.getSPORT_SHOW_MAP_STYLE_ID();
        this.currentMapStyleName = sportReportMapPreference.getSPORT_SHOW_MAP_STYLE_NAME();
        this.currentEditIndex = sportReportMapPreference.getSPORT_SHOW_MARK_STYLE();
        this.currentShowMailPoint = sportReportMapPreference.getSPORT_SHOW_MAIL_POINTS();
        this.MAP_STYLE_RES_ID_BIAOZHUN = SportTraceConstants.MAP_STYLE_RES_ID_BIAOZHUN;
        this.mMapStyle = sportReportMapPreference.getSPORT_SHOW_MAP_STYLE_ID();
        this.mMapStyleName = sportReportMapPreference.getSPORT_SHOW_MAP_STYLE_NAME();
        this.mMapEditIndex = sportReportMapPreference.getSPORT_SHOW_MARK_STYLE();
        this.mShowMailPoint = Boolean.valueOf(sportReportMapPreference.getSPORT_SHOW_MAIL_POINTS());
        this.mShowPathColor = sportReportMapPreference.getSPORT_SHOW_PACE_COLOR();
        this.currentShowPathColor = sportReportMapPreference.getSPORT_SHOW_PACE_COLOR();
        this.path = new Path();
        this.options = new PolylineOptions();
        this.colorInner = new ArrayList();
        String[] strArr = {MapUtilsKt.MAP_STYLE_RES_ID_LIGHT_STYLE, MapUtilsKt.MAP_STYLE_RES_ID_DARK_STYLE};
        this.styleIds = strArr;
        this.styles = new CustomMapStyleOptions[strArr.length];
        AMapLocationClient.updatePrivacyShow(AppUtil.getApp(), true, true);
        AMapLocationClient.updatePrivacyAgree(AppUtil.getApp(), true);
        LayoutInflater.from(mContext).inflate(qti.c, this);
    }

    private final void addCusMarker(AMap aMap, Bitmap bitmap, boolean z) {
        if (this.mOriginalList.isEmpty()) {
            return;
        }
        MarkerOptions markerOptionsIcon = new MarkerOptions().position(z ? this.mOriginalList.get(0) : (LatLng) CollectionsKt___CollectionsKt.last((List) this.mOriginalList)).anchor(0.5f, 1.0f).icon(BitmapDescriptorFactory.fromBitmap(bitmap));
        if (z) {
            Marker marker = this.mStartMarker;
            if (marker != null) {
                marker.remove();
            }
            Intrinsics.checkNotNull(markerOptionsIcon);
            this.mStartMarker = MapUtilsKt.addMarkerWithZIndex(aMap, markerOptionsIcon);
            return;
        }
        Marker marker2 = this.mEndMarker;
        if (marker2 != null) {
            marker2.remove();
        }
        Intrinsics.checkNotNull(markerOptionsIcon);
        this.mEndMarker = MapUtilsKt.addMarkerWithZIndex(aMap, markerOptionsIcon);
    }

    public static /* synthetic */ void addCusMarker$default(SportPathMapView sportPathMapView, AMap aMap, Bitmap bitmap, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        sportPathMapView.addCusMarker(aMap, bitmap, z);
    }

    public static /* synthetic */ void bindData$default(SportPathMapView sportPathMapView, SportBasicReport sportBasicReport, GpsValues gpsValues, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = (int) ((((double) UIUtils.INSTANCE.getScreenHeight(ApplicationExtKt.getApplication())) * 0.5d) + ((double) ExtUtilsKt.getDp(20)));
        }
        sportPathMapView.bindData(sportBasicReport, gpsValues, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindData$lambda$6(SportPathMapView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        showPathMarker$default(this$0, this$0.mOriginalList, this$0.mPathRecordList, false, this$0.mShowPathColor, 4, null);
    }

    private final void buildLine(List<LatLng> points, boolean dottedLine, int pathColor) {
        int iDip2px = DisplayUtil.dip2px(4.0f);
        if (dottedLine) {
            AMap aMap = this.mAMap;
            if (aMap != null) {
                aMap.addPolyline(new PolylineOptions().zIndex(1.0f).addAll(points).width(iDip2px).setDottedLine(false).color(x44.a(ali.f1176b)));
                return;
            }
            return;
        }
        PolylineOptions polylineOptionsColor = this.colorList.size() == 0 ? new PolylineOptions().addAll(points).zIndex(1.0f).width(iDip2px).useGradient(false).color(pathColor) : new PolylineOptions().addAll(points).zIndex(1.0f).width(iDip2px).useGradient(true).colorValues(this.colorList);
        AMap aMap2 = this.mAMap;
        if (aMap2 != null) {
            aMap2.addPolyline(polylineOptionsColor);
        }
    }

    private final void createDataList(int sportType) {
        GpsValues gpsValues = this.gpsValues;
        if (gpsValues != null) {
            if (this.mOriginalList.size() > 0) {
                this.mOriginalList.clear();
            }
            List<LatLng> list = this.mOriginalList;
            List<LatLng> listS = l5.s(gpsValues.locationList);
            Intrinsics.checkNotNullExpressionValue(listS, "createLatLngList(...)");
            list.addAll(listS);
            if (this.colorList.size() > 0) {
                this.colorList.clear();
            }
            if (sportType != 17) {
                List<Integer> list2 = this.colorList;
                List<Integer> listQ = l5.q(gpsValues.locationList, sportType);
                Intrinsics.checkNotNullExpressionValue(listQ, "createColorList(...)");
                list2.addAll(listQ);
            }
            if (this.mPathRecordList.size() > 0) {
                this.mPathRecordList.clear();
            }
            List<bmh> list3 = this.mPathRecordList;
            List<bmh> listC = emh.c(this.mSportValues, gpsValues, true);
            Intrinsics.checkNotNullExpressionValue(listC, "createPathRecordList(...)");
            list3.addAll(listC);
            createMailDataList(gpsValues);
        }
    }

    private final void createMailDataList(GpsValues gpsValues) {
        if (this.mailPostList.size() > 0) {
            this.mailPostList.clear();
        }
        List<Location> integerKilometerList = gpsValues.integerKilometerList;
        Intrinsics.checkNotNullExpressionValue(integerKilometerList, "integerKilometerList");
        synchronized (integerKilometerList) {
            List<Marker> list = this.mailPostList;
            List<Marker> listU = l5.u(this.mContext, this.mAMap, gpsValues.integerKilometerList);
            Intrinsics.checkNotNullExpressionValue(listU, "createMailPostList(...)");
            list.addAll(listU);
        }
    }

    private final void createOptimizePath(bmh pathRecord, List<? extends bmh> mPathRecordList) {
        List<LatLng> listM = l5.m(pathRecord.f4369b);
        boolean z = pathRecord.f4368a == 1;
        Intrinsics.checkNotNull(listM);
        buildLine(listM, z, pathRecord.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void createShareBitmap$default(SportPathMapView sportPathMapView, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            function2 = null;
        }
        sportPathMapView.createShareBitmap(function2);
    }

    private final void drawLines(ColorPoint lastPoint, ColorPoint newPoint, List<ColorPoint> points) {
        Polyline polyline;
        if (newPoint.getDottedLine() && this.options.getPoints() != null && this.options.getColorValues() != null) {
            this.options.getPoints().clear();
            this.options.getColorValues().clear();
            this.colorInner.clear();
            this.lastValidLine = this.pathPolyline;
            AMap aMap = this.mAMap;
            this.pathPolyline = aMap != null ? aMap.addPolyline(this.options) : null;
            return;
        }
        if (newPoint.getLastPoint() && (polyline = this.lastValidLine) != null) {
            Intrinsics.checkNotNull(polyline);
            polyline.getOptions().getPoints().add(new LatLng(newPoint.getPoint().latitude, newPoint.getPoint().longitude));
            Polyline polyline2 = this.lastValidLine;
            Intrinsics.checkNotNull(polyline2);
            polyline2.getOptions().getColorValues().add(Integer.valueOf(newPoint.getColor()));
        }
        if (this.options.getPoints().size() == 0 && !lastPoint.getDottedLine()) {
            this.options.add(new LatLng(lastPoint.getPoint().latitude, lastPoint.getPoint().longitude));
        }
        this.options.add(new LatLng(newPoint.getPoint().latitude, newPoint.getPoint().longitude));
        if (this.colorInner.size() == 0 && !lastPoint.getDottedLine()) {
            this.colorInner.add(Integer.valueOf(lastPoint.getColor()));
        }
        this.colorInner.add(Integer.valueOf(newPoint.getColor()));
        this.options.width(ExtUtilsKt.getDp(Float.valueOf(4.0f))).colorValues(this.colorInner).zIndex(1.0f).lineCapType(PolylineOptions.LineCapType.LineCapRound);
        if (lastPoint.getType()) {
            this.options.useGradient(true);
        } else {
            this.options.setDottedLine(false);
        }
        Polyline polyline3 = this.pathPolyline;
        if (polyline3 == null) {
            AMap aMap2 = this.mAMap;
            this.pathPolyline = aMap2 != null ? aMap2.addPolyline(this.options) : null;
        } else {
            Intrinsics.checkNotNull(polyline3);
            polyline3.setOptions(this.options);
        }
    }

    private final void initMapSetting() {
        if (this.mAMap == null) {
            TextureMapView textureMapView = this.mMapView;
            Intrinsics.checkNotNull(textureMapView);
            AMap map = textureMapView.getMap();
            this.mAMap = map;
            if (map != null) {
                map.setMyLocationEnabled(false);
            }
            AMap aMap = this.mAMap;
            UiSettings uiSettings = aMap != null ? aMap.getUiSettings() : null;
            if (uiSettings != null) {
                uiSettings.setMyLocationButtonEnabled(false);
            }
            if (uiSettings != null) {
                uiSettings.setZoomControlsEnabled(false);
            }
            if (uiSettings != null) {
                uiSettings.setLogoBottomMargin(-80);
            }
        }
    }

    private final void initStyles() {
        String[] strArr = this.styleIds;
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            CustomMapStyleOptions customMapStyleOptions = new CustomMapStyleOptions();
            customMapStyleOptions.setEnable(true);
            customMapStyleOptions.setStyleDataPath(str);
            this.styles[i] = customMapStyleOptions;
        }
        if (UIUtils.isNightMode(this.mContext)) {
            setMapStyle(false);
        }
    }

    private final void initView() {
        this.mMapView = (TextureMapView) findViewById(lqi.f);
        this.routineView = (TrackShareRoutineView) findViewById(lqi.e);
        initMapSetting();
        initStyles();
    }

    private final void moveCameraPath(List<LatLng> originalList, int bottom) {
        l5.A(this.mAMap, originalList, 200, 200, 200, bottom);
    }

    public static /* synthetic */ void moveCameraPath$default(SportPathMapView sportPathMapView, List list, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = (int) ((UIUtils.INSTANCE.getScreenHeight(ApplicationExtKt.getApplication()) * 0.5f) + ExtUtilsKt.getDp(20));
        }
        sportPathMapView.moveCameraPath(list, i);
    }

    private final void moveLocationPath(List<? extends bmh> pathRecordList, final boolean instant, boolean showColor) {
        Logger.i(TAG, "moveLocationPath instant=" + instant);
        Logger.i(TAG, "path record size = " + this.mPathRecordList.size());
        if (this.options.getPoints() != null && this.options.getColorValues() != null) {
            this.options.getPoints().clear();
            this.options.getColorValues().clear();
        }
        ValueAnimator valueAnimator = this.distanceChangeAnimator;
        if (valueAnimator != null) {
            Intrinsics.checkNotNull(valueAnimator);
            valueAnimator.removeAllListeners();
            ValueAnimator valueAnimator2 = this.distanceChangeAnimator;
            Intrinsics.checkNotNull(valueAnimator2);
            valueAnimator2.cancel();
        }
        this.colorInner.clear();
        final ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (Object obj : pathRecordList) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            bmh bmhVar = (bmh) obj;
            List<LatLng> listM = l5.m(bmhVar.f4369b);
            int i5 = bmhVar.f4368a;
            if (i5 == 2) {
                Intrinsics.checkNotNull(listM);
                for (LatLng latLng : listM) {
                    int iA = x44.a(ali.i);
                    Intrinsics.checkNotNull(latLng);
                    arrayList.add(new ColorPoint(iA, latLng, false, true, false, 16, null));
                }
            } else if (i5 == 1) {
                Intrinsics.checkNotNull(listM);
                for (LatLng latLng2 : listM) {
                    int iA2 = x44.a(showColor ? ali.f1176b : ali.d);
                    Intrinsics.checkNotNull(latLng2);
                    arrayList.add(new ColorPoint(iA2, latLng2, false, false, false, 24, null));
                }
            } else if (this.colorList.size() == 0) {
                Intrinsics.checkNotNull(listM);
                for (LatLng latLng3 : listM) {
                    int i6 = bmhVar.e;
                    Intrinsics.checkNotNull(latLng3);
                    arrayList.add(new ColorPoint(i6, latLng3, false, false, false, 24, null));
                }
            } else {
                Intrinsics.checkNotNull(listM);
                int i7 = 0;
                for (Object obj2 : listM) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    LatLng latLng4 = (LatLng) obj2;
                    int iIntValue = showColor ? this.colorList.get(i3).intValue() : x44.a(ali.d);
                    if (i3 >= this.colorList.size()) {
                        Logger.i(TAG, "colorList size is less points size " + this.colorList.size());
                        i3 = i7;
                    } else {
                        i3++;
                    }
                    Intrinsics.checkNotNull(latLng4);
                    arrayList.add(new ColorPoint(iIntValue, latLng4, true, false, false, 24, null));
                    i7 = i8;
                }
            }
            i2 = i4;
        }
        if (this.mOriginalList.size() > 0) {
            LatLng latLng5 = this.mOriginalList.get(this.mOriginalList.size() - 1);
            arrayList.add(new ColorPoint((this.colorList.size() <= 0 || !showColor) ? x44.a(showColor ? ali.i : ali.d) : ((Number) CollectionsKt___CollectionsKt.last((List) this.colorList)).intValue(), new LatLng(latLng5.latitude, latLng5.longitude), true, false, true, 8, null));
        }
        if (instant) {
            int size = arrayList.size() - 1;
            while (i < size) {
                ColorPoint colorPoint = arrayList.get(i);
                i++;
                drawLines(colorPoint, arrayList.get(i), arrayList);
            }
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, arrayList.size());
        this.distanceChangeAnimator = valueAnimatorOfInt;
        Intrinsics.checkNotNull(valueAnimatorOfInt);
        valueAnimatorOfInt.setDuration(3000L);
        ValueAnimator valueAnimator3 = this.distanceChangeAnimator;
        Intrinsics.checkNotNull(valueAnimator3);
        valueAnimator3.setInterpolator(new LinearInterpolator());
        final Ref.IntRef intRef = new Ref.IntRef();
        ValueAnimator valueAnimator4 = this.distanceChangeAnimator;
        Intrinsics.checkNotNull(valueAnimator4);
        valueAnimator4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nrn
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                SportPathMapView.moveLocationPath$lambda$13(intRef, arrayList, this, instant, valueAnimator5);
            }
        });
        ValueAnimator valueAnimator5 = this.distanceChangeAnimator;
        Intrinsics.checkNotNull(valueAnimator5);
        valueAnimator5.start();
    }

    public static /* synthetic */ void moveLocationPath$default(SportPathMapView sportPathMapView, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        sportPathMapView.moveLocationPath(list, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void moveLocationPath$lambda$13(Ref.IntRef lastIndex, List allColorPoints, SportPathMapView this$0, boolean z, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(lastIndex, "$lastIndex");
        Intrinsics.checkNotNullParameter(allColorPoints, "$allColorPoints");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        if (iIntValue == lastIndex.element) {
            return;
        }
        int i = iIntValue == allColorPoints.size() ? iIntValue - 1 : iIntValue;
        int i2 = lastIndex.element;
        if (i >= i2 + 1) {
            while (i2 < i) {
                ColorPoint colorPoint = (ColorPoint) allColorPoints.get(i2);
                i2++;
                this$0.drawLines(colorPoint, (ColorPoint) allColorPoints.get(i2), allColorPoints);
            }
        }
        lastIndex.element = i;
        if (iIntValue >= allColorPoints.size()) {
            this$0.showEndMarker(z);
            this$0.showMailsPoints(this$0.currentShowMailPoint);
        }
    }

    private final void setCustomMapStyle() {
        String str = UIUtils.isNightMode(this.mContext) ? MapUtilsKt.MAP_STYLE_RES_ID_DARK_STYLE : MapUtilsKt.MAP_STYLE_RES_ID_LIGHT_STYLE;
        CustomMapStyleOptions customMapStyleOptions = new CustomMapStyleOptions();
        customMapStyleOptions.setEnable(true);
        customMapStyleOptions.setStyleId(str);
        AMap aMap = this.mAMap;
        Intrinsics.checkNotNull(aMap);
        aMap.clear();
        AMap aMap2 = this.mAMap;
        Intrinsics.checkNotNull(aMap2);
        aMap2.setCustomMapStyle(customMapStyleOptions);
        AMap aMap3 = this.mAMap;
        Intrinsics.checkNotNull(aMap3);
        aMap3.setMapType(2);
    }

    private final void showEndMarker(boolean instant) {
        ArrayList<Location> arrayList;
        BitmapDescriptor bitmapDescriptorFromBitmap;
        if (!this.mOriginalList.isEmpty()) {
            if (this.mEndMarker == null) {
                LatLng latLng = this.mOriginalList.get(this.mOriginalList.size() - 1);
                if (this.currentStartMapBitmap == null) {
                    bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromResource(vmi.h);
                } else {
                    Bitmap bitmap = this.currentEndMapBitmap;
                    Intrinsics.checkNotNull(bitmap);
                    bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(bitmap);
                }
                MarkerOptions markerOptionsIcon = new MarkerOptions().position(latLng).icon(bitmapDescriptorFromBitmap);
                AMap aMap = this.mAMap;
                Intrinsics.checkNotNull(aMap);
                Intrinsics.checkNotNull(markerOptionsIcon);
                this.mEndMarker = MapUtilsKt.addMarkerWithZIndex(aMap, markerOptionsIcon);
            }
            Marker marker = this.mEndMarker;
            if (marker != null) {
                this.hasShowMarker = true;
                if (!instant) {
                    l5.B(marker, null);
                }
            }
            List<Location> listB = o5o.e().b();
            if (listB == null || listB.isEmpty()) {
                AMap aMap2 = this.mAMap;
                Intrinsics.checkNotNull(aMap2);
                Projection projection = aMap2.getProjection();
                int size = this.mOriginalList.size();
                for (int i = 0; i < size; i++) {
                    Point screenLocation = projection.toScreenLocation(this.mOriginalList.get(i));
                    Location location = new Location();
                    location.longitude = screenLocation.x;
                    location.latitude = screenLocation.y;
                    GpsValues gpsValues = this.gpsValues;
                    if (gpsValues != null && (arrayList = gpsValues.gpsPathPoint) != null) {
                        arrayList.add(location);
                    }
                }
                o5o o5oVarE = o5o.e();
                GpsValues gpsValues2 = this.gpsValues;
                o5oVarE.j(gpsValues2 != null ? gpsValues2.gpsPathPoint : null);
            }
        }
        this.pathShowFinish = true;
    }

    public static /* synthetic */ void showEndMarker$default(SportPathMapView sportPathMapView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        sportPathMapView.showEndMarker(z);
    }

    private final void showMailPostList(List<Marker> mailPostList, boolean visible) {
        int size = mailPostList.size();
        for (int i = 0; i < size; i++) {
            Marker marker = mailPostList.get(i);
            if (visible && !marker.isVisible()) {
                l5.k(marker);
            }
            marker.setVisible(visible);
        }
    }

    private final void showPath(List<? extends bmh> mPathRecordList, boolean instant, boolean showColor) {
        if (!mPathRecordList.isEmpty()) {
            moveLocationPath(mPathRecordList, instant, showColor);
        } else {
            showEmptyView();
        }
    }

    public static /* synthetic */ void showPath$default(SportPathMapView sportPathMapView, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        sportPathMapView.showPath(list, z, z2);
    }

    private final void showPathMarker(List<LatLng> originalList, List<? extends bmh> pathRecordList, boolean instant, boolean showColor) {
        showPath(pathRecordList, instant, showColor);
    }

    public static /* synthetic */ void showPathMarker$default(SportPathMapView sportPathMapView, List list, List list2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        sportPathMapView.showPathMarker(list, list2, z, z2);
    }

    private final void showStartMarker(boolean instant) {
        BitmapDescriptor bitmapDescriptorFromBitmap;
        if (!this.mOriginalList.isEmpty()) {
            if (this.mStartMarker == null) {
                LatLng latLng = this.mOriginalList.get(0);
                Bitmap bitmap = this.currentStartMapBitmap;
                if (bitmap == null) {
                    bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromResource(vmi.i);
                } else {
                    Intrinsics.checkNotNull(bitmap);
                    bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(bitmap);
                }
                MarkerOptions markerOptionsIcon = new MarkerOptions().position(latLng).icon(bitmapDescriptorFromBitmap);
                AMap aMap = this.mAMap;
                Intrinsics.checkNotNull(aMap);
                Intrinsics.checkNotNull(markerOptionsIcon);
                this.mStartMarker = MapUtilsKt.addMarkerWithZIndex(aMap, markerOptionsIcon);
            }
            Marker marker = this.mStartMarker;
            if (marker != null) {
                this.hasShowMarker = true;
                if (instant) {
                    return;
                }
                l5.B(marker, null);
            }
        }
    }

    public static /* synthetic */ void showStartMarker$default(SportPathMapView sportPathMapView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        sportPathMapView.showStartMarker(z);
    }

    public final void bindData(@NotNull SportBasicReport sportValues, @Nullable GpsValues gpsValues, int bottom) {
        SportBasicReport sportBasicReport;
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        this.mSportValues = sportValues;
        this.gpsValues = gpsValues;
        createDataList(sportValues.getSportType());
        if (this.mHandler == null) {
            this.mHandler = new Handler(Looper.getMainLooper());
        }
        moveCameraPath(this.mOriginalList, bottom);
        SportBasicReport sportBasicReport2 = this.mSportValues;
        long j = (((long) (sportBasicReport2 != null ? sportBasicReport2.getDuration() : 0)) > 10800 || ((sportBasicReport = this.mSportValues) != null && sportBasicReport.getProtoType() == 21)) ? 0L : 800L;
        showStartMarker$default(this, false, 1, null);
        Handler handler = this.mHandler;
        Intrinsics.checkNotNull(handler);
        handler.postDelayed(new Runnable() { // from class: orn
            @Override // java.lang.Runnable
            public final void run() {
                SportPathMapView.bindData$lambda$6(this.f29633a);
            }
        }, j);
    }

    public final void createShareBitmap(@Nullable Function2<? super Uri, ? super Bitmap, Unit> callback) {
        AMap aMap = this.mAMap;
        if (aMap != null) {
            aMap.getMapScreenShot(new AnonymousClass1(callback));
        }
    }

    public final void createShareBitmapNoMap() {
        IShareMapLongView iShareMapLongView = this.iShareMapLongView;
        Intrinsics.checkNotNull(iShareMapLongView);
        IShareMapLongView.DefaultImpls.createMapViewBitmap$default(iShareMapLongView, null, null, 2, null);
    }

    /* JADX INFO: renamed from: getChoiceIndex, reason: from getter */
    public final int getMMapEditIndex() {
        return this.mMapEditIndex;
    }

    public final int getColorEndIndex() {
        return this.colorEndIndex;
    }

    @NotNull
    public final List<Integer> getColorInner() {
        return this.colorInner;
    }

    public final int getColorStarIndex() {
        return this.colorStarIndex;
    }

    @NotNull
    public final String getCurrentMapStyle() {
        return this.currentMapStyle;
    }

    @NotNull
    public final String getCurrentMapStyleName() {
        return this.currentMapStyleName;
    }

    public final boolean getCurrentShowPathColor() {
        return this.currentShowPathColor;
    }

    @Nullable
    public final ValueAnimator getDistanceChangeAnimator() {
        return this.distanceChangeAnimator;
    }

    @Nullable
    public final Polyline getLastValidLine() {
        return this.lastValidLine;
    }

    public final int getMMapEditIndex() {
        return this.mMapEditIndex;
    }

    @Nullable
    public final Bitmap getMMapEndStyle() {
        return this.mMapEndStyle;
    }

    @Nullable
    public final Bitmap getMMapStartStyle() {
        return this.mMapStartStyle;
    }

    @NotNull
    public final String getMMapStyle() {
        return this.mMapStyle;
    }

    @NotNull
    public final String getMMapStyleName() {
        return this.mMapStyleName;
    }

    @Nullable
    public final Boolean getMShowMailPoint() {
        return this.mShowMailPoint;
    }

    public final boolean getMShowPathColor() {
        return this.mShowPathColor;
    }

    @Nullable
    public final AMap getMap() {
        TextureMapView textureMapView = this.mMapView;
        if (textureMapView != null) {
            return textureMapView.getMap();
        }
        return null;
    }

    @NotNull
    public final String getMapStyle() {
        return this.mMapStyle;
    }

    @NotNull
    public final PolylineOptions getOptions() {
        return this.options;
    }

    @NotNull
    public final Path getPath() {
        return this.path;
    }

    @Nullable
    public final Polyline getPathPolyline() {
        return this.pathPolyline;
    }

    public final boolean getPathShowFinish() {
        return this.pathShowFinish;
    }

    @Nullable
    /* JADX INFO: renamed from: getTrackShareRoutineView, reason: from getter */
    public final TrackShareRoutineView getRoutineView() {
        return this.routineView;
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.AbstractSportPathMapView
    public void loadMapStyle(int style) {
        Logger.i("SportPathMapView", " loadMapStyle:" + style);
        if (style == 2) {
            this.currentMapStyle = "";
            AMap aMap = this.mAMap;
            Intrinsics.checkNotNull(aMap);
            aMap.setMapType(2);
            IShareMapLongView iShareMapLongView = this.iShareMapLongView;
            if (iShareMapLongView != null) {
                Intrinsics.checkNotNull(iShareMapLongView);
                iShareMapLongView.setStatueTextWhite(false);
                return;
            }
            return;
        }
        if (style == 3) {
            this.currentMapStyle = "-1";
            setMapStyle(false);
            return;
        }
        this.currentMapStyle = this.MAP_STYLE_RES_ID_BIAOZHUN;
        setCustomMapStyle();
        IShareMapLongView iShareMapLongView2 = this.iShareMapLongView;
        if (iShareMapLongView2 != null) {
            Intrinsics.checkNotNull(iShareMapLongView2);
            iShareMapLongView2.setStatueTextWhite(true);
        }
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.AbstractSportPathMapView
    public void locationPath() {
        moveCameraPath(this.mOriginalList, (int) ((UIUtils.INSTANCE.getScreenHeight(ApplicationExtKt.getApplication()) * 0.5f) + ExtUtilsKt.getDp(20)));
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onCreate(@Nullable Bundle bundle) {
        Logger.d(TAG, "onCreate " + bundle);
        TextureMapView mapView = getMapView();
        if (mapView != null) {
            mapView.onCreate(bundle);
        }
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onDestroy() {
        Logger.d(TAG, LifecycleConstantKt.ON_DESTROY);
        TextureMapView mapView = getMapView();
        Intrinsics.checkNotNull(mapView);
        mapView.onDestroy();
        Disposable disposable = this.styleDisposable;
        if (disposable != null && !disposable.isDisposed()) {
            this.styleDisposable.dispose();
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            Intrinsics.checkNotNull(handler);
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        initView();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onLowMemory() {
        Logger.d(TAG, "onLowMemory");
        TextureMapView mapView = getMapView();
        if (mapView != null) {
            mapView.onLowMemory();
        }
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onPause() {
        Logger.d(TAG, LifecycleConstantKt.ON_PAUSE);
        TextureMapView mapView = getMapView();
        if (mapView != null) {
            mapView.onPause();
        }
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onResume() {
        Logger.d(TAG, LifecycleConstantKt.ON_RESUME);
        TextureMapView mapView = getMapView();
        if (mapView != null) {
            mapView.onResume();
        }
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        TextureMapView mapView = getMapView();
        Intrinsics.checkNotNull(mapView);
        mapView.onSaveInstanceState(outState);
        Logger.d(TAG, "onSaveInstanceState");
    }

    public final void rebindData(@Nullable GpsValues gpsValues) {
        this.gpsValues = gpsValues;
        SportBasicReport sportBasicReport = this.mSportValues;
        if (sportBasicReport != null) {
            createDataList(sportBasicReport.getSportType());
        }
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.AbstractSportPathMapView
    public void recoverMapSetting() {
        Boolean bool = this.mShowMailPoint;
        showMailsPoints(bool != null ? bool.booleanValue() : false);
        AMap aMap = this.mAMap;
        if (aMap != null) {
            MapUtilsKt.setCustomMapStyleWithOnlineStyleId(aMap, this.mMapStyle, this.mMapStyleName);
        }
        Bitmap bitmap = this.mMapStartStyle;
        if (bitmap != null) {
            Intrinsics.checkNotNull(bitmap);
            setMark(bitmap, true);
        }
        Bitmap bitmap2 = this.mMapEndStyle;
        if (bitmap2 != null) {
            Intrinsics.checkNotNull(bitmap2);
            setMark(bitmap2, false);
        }
        boolean z = this.mShowPathColor;
        if (z != this.currentShowPathColor) {
            showColorPace(z);
        }
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.AbstractSportPathMapView
    public void saveMapStyle() {
        this.mMapStyle = this.currentMapStyle;
        this.mMapStyleName = this.currentMapStyleName;
        this.mMapStartStyle = this.currentStartMapBitmap;
        this.mMapEndStyle = this.currentEndMapBitmap;
        this.mShowMailPoint = Boolean.valueOf(this.currentShowMailPoint);
        int i = this.currentEditIndex;
        this.mMapEditIndex = i;
        this.mShowPathColor = this.currentShowPathColor;
        SportReportMapPreference sportReportMapPreference = SportReportMapPreference.INSTANCE;
        sportReportMapPreference.setSPORT_SHOW_MARK_STYLE(i);
        sportReportMapPreference.setSPORT_SHOW_MAIL_POINTS(this.currentShowMailPoint);
        sportReportMapPreference.setSPORT_SHOW_MAP_STYLE_ID(this.currentMapStyle);
        sportReportMapPreference.setSPORT_SHOW_MAP_STYLE_NAME(this.currentMapStyleName);
        sportReportMapPreference.setSPORT_SHOW_PACE_COLOR(this.currentShowPathColor);
    }

    public final void setAllGesturesEnabled(boolean enable) {
        AMap aMap = this.mAMap;
        UiSettings uiSettings = aMap != null ? aMap.getUiSettings() : null;
        if (uiSettings != null) {
            uiSettings.setAllGesturesEnabled(enable);
        }
    }

    public final void setChoiceIndex(int index) {
        this.currentEditIndex = index;
    }

    public final void setColorEndIndex(int i) {
        this.colorEndIndex = i;
    }

    public final void setColorStarIndex(int i) {
        this.colorStarIndex = i;
    }

    public final void setCurrentMapStyle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentMapStyle = str;
    }

    public final void setCurrentMapStyleName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentMapStyleName = str;
    }

    public final void setCurrentShowPathColor(boolean z) {
        this.currentShowPathColor = z;
    }

    public final void setCustomMapStyleWithLocalResource(@NotNull String style, @NotNull String name) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(name, "name");
        this.currentMapStyle = style;
        this.currentMapStyleName = name;
        AMap aMap = this.mAMap;
        if (aMap != null) {
            MapUtilsKt.setCustomMapStyleWithOnlineStyleId(aMap, style, name);
        }
    }

    public final void setDistanceChangeAnimator(@Nullable ValueAnimator valueAnimator) {
        this.distanceChangeAnimator = valueAnimator;
    }

    public final void setIShareMapView(@Nullable IShareMapLongView iShareMapLongView) {
        this.iShareMapLongView = iShareMapLongView;
    }

    public final void setInitMarkBitmap(@NotNull Bitmap startBitmap, @NotNull Bitmap endBitmap) {
        Intrinsics.checkNotNullParameter(startBitmap, "startBitmap");
        Intrinsics.checkNotNullParameter(endBitmap, "endBitmap");
        this.currentStartMapBitmap = startBitmap;
        this.currentEndMapBitmap = endBitmap;
    }

    public final void setLastValidLine(@Nullable Polyline polyline) {
        this.lastValidLine = polyline;
    }

    public final void setMMapEditIndex(int i) {
        this.mMapEditIndex = i;
    }

    public final void setMMapEndStyle(@Nullable Bitmap bitmap) {
        this.mMapEndStyle = bitmap;
    }

    public final void setMMapStartStyle(@Nullable Bitmap bitmap) {
        this.mMapStartStyle = bitmap;
    }

    public final void setMMapStyle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mMapStyle = str;
    }

    public final void setMMapStyleName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mMapStyleName = str;
    }

    public final void setMShowMailPoint(@Nullable Boolean bool) {
        this.mShowMailPoint = bool;
    }

    public final void setMShowPathColor(boolean z) {
        this.mShowPathColor = z;
    }

    public final void setMapStyle(boolean normal) {
        AMap aMap = this.mAMap;
        if (aMap != null) {
            aMap.setCustomMapStyle(this.styles[!normal ? 1 : 0]);
        }
    }

    public final void setMark(@NotNull Bitmap bitmap, boolean isStart) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (isStart) {
            this.currentStartMapBitmap = bitmap;
        } else {
            this.currentEndMapBitmap = bitmap;
        }
        AMap aMap = this.mAMap;
        if (aMap != null) {
            addCusMarker(aMap, bitmap, isStart);
        }
    }

    public final void setPath(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<set-?>");
        this.path = path;
    }

    public final void setPathPolyline(@Nullable Polyline polyline) {
        this.pathPolyline = polyline;
    }

    public final void setPathShowFinish(boolean z) {
        this.pathShowFinish = z;
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.AbstractSportPathMapView
    public void showColorPace(boolean z) {
        this.currentShowPathColor = z;
        SportReportMapPreference.INSTANCE.setSPORT_SHOW_PACE_COLOR(z);
        AMap aMap = this.mAMap;
        if (aMap != null) {
            aMap.clear();
        }
        this.pathPolyline = null;
        this.mStartMarker = null;
        this.mEndMarker = null;
        GpsValues gpsValues = this.gpsValues;
        if (gpsValues != null) {
            createMailDataList(gpsValues);
        }
        showStartMarker$default(this, false, 1, null);
        showPathMarker$default(this, this.mOriginalList, this.mPathRecordList, false, z, 4, null);
    }

    public final void showEmptyView() {
        setMapStyle(false);
        AMap aMap = this.mAMap;
        Intrinsics.checkNotNull(aMap);
        aMap.getUiSettings().setAllGesturesEnabled(false);
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.AbstractSportPathMapView
    public void showMailsPoints(boolean isChecked) {
        if (this.gpsValues != null) {
            showMailPostList(this.mailPostList, isChecked);
            this.currentShowMailPoint = isChecked;
        }
    }

    public final void showWholePathInstantly() {
        showStartMarker(true);
        showPathMarker$default(this, this.mOriginalList, this.mPathRecordList, true, false, 8, null);
        showEndMarker(true);
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    @Nullable
    public TextureMapView getMapView() {
        if (this.mMapView == null) {
            Logger.d(TAG, "getMapView");
            initView();
        }
        return this.mMapView;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/mi/health/data/sportmodel/view/SportPathMapView$ColorPoint;", "", "color", "", "point", "Lcom/amap/api/maps/model/LatLng;", "type", "", "dottedLine", "lastPoint", "<init>", "(ILcom/amap/api/maps/model/LatLng;ZZZ)V", "getColor", "()I", "getPoint", "()Lcom/amap/api/maps/model/LatLng;", "getType", "()Z", "getDottedLine", "getLastPoint", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "map-amap_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ColorPoint {
        private final int color;
        private final boolean dottedLine;
        private final boolean lastPoint;

        @NotNull
        private final LatLng point;
        private final boolean type;

        public ColorPoint(int i, @NotNull LatLng point, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(point, "point");
            this.color = i;
            this.point = point;
            this.type = z;
            this.dottedLine = z2;
            this.lastPoint = z3;
        }

        public static /* synthetic */ ColorPoint copy$default(ColorPoint colorPoint, int i, LatLng latLng, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = colorPoint.color;
            }
            if ((i2 & 2) != 0) {
                latLng = colorPoint.point;
            }
            LatLng latLng2 = latLng;
            if ((i2 & 4) != 0) {
                z = colorPoint.type;
            }
            boolean z4 = z;
            if ((i2 & 8) != 0) {
                z2 = colorPoint.dottedLine;
            }
            boolean z5 = z2;
            if ((i2 & 16) != 0) {
                z3 = colorPoint.lastPoint;
            }
            return colorPoint.copy(i, latLng2, z4, z5, z3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getColor() {
            return this.color;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final LatLng getPoint() {
            return this.point;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getDottedLine() {
            return this.dottedLine;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getLastPoint() {
            return this.lastPoint;
        }

        @NotNull
        public final ColorPoint copy(int color, @NotNull LatLng point, boolean type, boolean dottedLine, boolean lastPoint) {
            Intrinsics.checkNotNullParameter(point, "point");
            return new ColorPoint(color, point, type, dottedLine, lastPoint);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ColorPoint)) {
                return false;
            }
            ColorPoint colorPoint = (ColorPoint) other;
            return this.color == colorPoint.color && Intrinsics.areEqual(this.point, colorPoint.point) && this.type == colorPoint.type && this.dottedLine == colorPoint.dottedLine && this.lastPoint == colorPoint.lastPoint;
        }

        public final int getColor() {
            return this.color;
        }

        public final boolean getDottedLine() {
            return this.dottedLine;
        }

        public final boolean getLastPoint() {
            return this.lastPoint;
        }

        @NotNull
        public final LatLng getPoint() {
            return this.point;
        }

        public final boolean getType() {
            return this.type;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.color) * 31) + this.point.hashCode()) * 31) + Boolean.hashCode(this.type)) * 31) + Boolean.hashCode(this.dottedLine)) * 31) + Boolean.hashCode(this.lastPoint);
        }

        @NotNull
        public String toString() {
            return "ColorPoint(color=" + this.color + ", point=" + this.point + ", type=" + this.type + ", dottedLine=" + this.dottedLine + ", lastPoint=" + this.lastPoint + ")";
        }

        public /* synthetic */ ColorPoint(int i, LatLng latLng, boolean z, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, latLng, z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? false : z3);
        }
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.AbstractSportPathMapView
    public void loadMapStyle(@NotNull String style) {
        Intrinsics.checkNotNullParameter(style, "style");
        Logger.d(TAG, "setCustomMapStyle mapStyleId=" + style);
        boolean zIsBlank = StringsKt__StringsKt.isBlank(style) ^ true;
        if (Intrinsics.areEqual(style, "-1")) {
            AMap aMap = this.mAMap;
            if (aMap != null) {
                aMap.showMapText(false);
            }
            AMap aMap2 = this.mAMap;
            Intrinsics.checkNotNull(aMap2);
            aMap2.setMapType(1);
            CustomMapStyleOptions customMapStyleOptions = new CustomMapStyleOptions();
            customMapStyleOptions.setEnable(zIsBlank);
            customMapStyleOptions.setStyleId(this.MAP_STYLE_RES_ID_BIAOZHUN);
            AMap aMap3 = this.mAMap;
            if (aMap3 != null) {
                aMap3.setCustomMapStyle(customMapStyleOptions);
            }
        } else if (zIsBlank) {
            AMap aMap4 = this.mAMap;
            if (aMap4 != null) {
                aMap4.showMapText(true);
            }
            AMap aMap5 = this.mAMap;
            Intrinsics.checkNotNull(aMap5);
            aMap5.setMapType(1);
            CustomMapStyleOptions customMapStyleOptions2 = new CustomMapStyleOptions();
            customMapStyleOptions2.setEnable(zIsBlank);
            customMapStyleOptions2.setStyleId(style);
            AMap aMap6 = this.mAMap;
            if (aMap6 != null) {
                aMap6.setCustomMapStyle(customMapStyleOptions2);
            }
        } else {
            AMap aMap7 = this.mAMap;
            if (aMap7 != null) {
                aMap7.showMapText(true);
            }
            IShareMapLongView iShareMapLongView = this.iShareMapLongView;
            if (iShareMapLongView != null) {
                Intrinsics.checkNotNull(iShareMapLongView);
                iShareMapLongView.setStatueTextWhite(false);
            }
            CustomMapStyleOptions customMapStyleOptions3 = new CustomMapStyleOptions();
            customMapStyleOptions3.setEnable(zIsBlank);
            customMapStyleOptions3.setStyleId(style);
            AMap aMap8 = this.mAMap;
            if (aMap8 != null) {
                aMap8.setCustomMapStyle(customMapStyleOptions3);
            }
            AMap aMap9 = this.mAMap;
            Intrinsics.checkNotNull(aMap9);
            aMap9.setMapType(2);
        }
        this.currentMapStyle = style;
    }

    public final void showStartMarker(@NotNull List<Double> LatLng) {
        BitmapDescriptor bitmapDescriptorFromBitmap;
        Intrinsics.checkNotNullParameter(LatLng, "LatLng");
        if (LatLng.size() < 2) {
            return;
        }
        LatLng latLng = new LatLng(LatLng.get(0).doubleValue(), LatLng.get(1).doubleValue());
        this.mOriginalList.add(latLng);
        moveCameraPath$default(this, this.mOriginalList, 0, 2, null);
        if (this.mStartMarker == null) {
            Bitmap bitmap = this.currentStartMapBitmap;
            if (bitmap == null) {
                bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromResource(vmi.i);
            } else {
                Intrinsics.checkNotNull(bitmap);
                bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(bitmap);
            }
            MarkerOptions markerOptionsIcon = new MarkerOptions().position(latLng).icon(bitmapDescriptorFromBitmap);
            AMap aMap = this.mAMap;
            Intrinsics.checkNotNull(aMap);
            Intrinsics.checkNotNull(markerOptionsIcon);
            this.mStartMarker = MapUtilsKt.addMarkerWithZIndex(aMap, markerOptionsIcon);
        }
        Marker marker = this.mStartMarker;
        if (marker != null) {
            this.hasShowMarker = true;
            l5.B(marker, null);
        }
    }

    public final void showEndMarker(@NotNull List<Double> LatLng) {
        BitmapDescriptor bitmapDescriptorFromBitmap;
        Intrinsics.checkNotNullParameter(LatLng, "LatLng");
        if (LatLng.size() < 2) {
            return;
        }
        this.mOriginalList.add(new LatLng(LatLng.get(0).doubleValue(), LatLng.get(1).doubleValue()));
        moveCameraPath$default(this, this.mOriginalList, 0, 2, null);
        if (this.mEndMarker == null) {
            if (this.currentStartMapBitmap == null) {
                bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromResource(vmi.h);
            } else {
                Bitmap bitmap = this.currentEndMapBitmap;
                Intrinsics.checkNotNull(bitmap);
                bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(bitmap);
            }
            MarkerOptions markerOptionsIcon = new MarkerOptions().position(new LatLng(LatLng.get(0).doubleValue(), LatLng.get(1).doubleValue())).icon(bitmapDescriptorFromBitmap);
            AMap aMap = this.mAMap;
            Intrinsics.checkNotNull(aMap);
            Intrinsics.checkNotNull(markerOptionsIcon);
            this.mEndMarker = MapUtilsKt.addMarkerWithZIndex(aMap, markerOptionsIcon);
        }
        Marker marker = this.mEndMarker;
        if (marker != null) {
            this.hasShowMarker = true;
            l5.B(marker, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportPathMapView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportPathMapView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
