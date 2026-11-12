package com.mapbox.maps.extension.style.layers.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.StyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.RasterResampling;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.p;
import e23.l;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\bV\b\u0007\u0018\u0000 \u0089\u00012\u00020\u00012\u00020\u0002:\u0002\u0089\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\f\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0014\u0010\tJ\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u0018\u001a\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0016¢\u0006\u0004\b\u0018\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010\u0012J\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u000fJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b \u0010\u0019J#\u0010 \u001a\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0016¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\u000fJ\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\"\u0010\tJ\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\"\u0010\u000fJ\u001d\u0010$\u001a\u00020\u00002\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010\u000fJ\u0017\u0010&\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b&\u0010\u0019J#\u0010&\u001a\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0016¢\u0006\u0004\b&\u0010\u001eJ\u001d\u0010'\u001a\u00020\u00002\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100#H\u0016¢\u0006\u0004\b'\u0010%J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u000eH\u0016¢\u0006\u0004\b'\u0010\u000fJ\u0017\u0010(\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b(\u0010\u0019J#\u0010(\u001a\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0016¢\u0006\u0004\b(\u0010\u001eJ\u0017\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0010H\u0016¢\u0006\u0004\b)\u0010\u0012J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u000eH\u0016¢\u0006\u0004\b)\u0010\u000fJ\u0017\u0010*\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b*\u0010\u0019J#\u0010*\u001a\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0016¢\u0006\u0004\b*\u0010\u001eJ\u0017\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0010H\u0017¢\u0006\u0004\b+\u0010\u0012J\u0017\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u000eH\u0017¢\u0006\u0004\b+\u0010\u000fJ\u0017\u0010,\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b,\u0010\u0019J#\u0010,\u001a\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0017¢\u0006\u0004\b,\u0010\u001eJ\u0017\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0010H\u0016¢\u0006\u0004\b-\u0010\u0012J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u000eH\u0016¢\u0006\u0004\b-\u0010\u000fJ\u0017\u0010.\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b.\u0010\u0019J#\u0010.\u001a\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0016¢\u0006\u0004\b.\u0010\u001eJ\u0017\u0010/\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0010H\u0016¢\u0006\u0004\b/\u0010\u0012J\u0017\u0010/\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u000eH\u0016¢\u0006\u0004\b/\u0010\u000fJ\u0017\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0010H\u0016¢\u0006\u0004\b0\u0010\u0012J\u0017\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u000eH\u0016¢\u0006\u0004\b0\u0010\u000fJ\u0017\u00101\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b1\u0010\u0019J#\u00101\u001a\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0016¢\u0006\u0004\b1\u0010\u001eJ\u0017\u00102\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0010H\u0016¢\u0006\u0004\b2\u0010\u0012J\u0017\u00102\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u000eH\u0016¢\u0006\u0004\b2\u0010\u000fJ\u0017\u00103\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b3\u0010\u0019J#\u00103\u001a\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0016¢\u0006\u0004\b3\u0010\u001eJ\u0017\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u000eH\u0016¢\u0006\u0004\b5\u0010\u000fJ\u0017\u00107\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0010H\u0016¢\u0006\u0004\b7\u0010\u0012J\u0017\u00107\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u000eH\u0016¢\u0006\u0004\b7\u0010\u000fJ\u0017\u00108\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b8\u0010\u0019J#\u00108\u001a\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0016¢\u0006\u0004\b8\u0010\u001eJ\u000f\u0010;\u001a\u00020\u0003H\u0010¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b=\u0010:R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b>\u0010:R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b?\u0010:R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010:R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0016\u0010E\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010GR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\bJ\u0010K\u001a\u0004\bI\u0010:R\u001c\u0010N\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\bM\u0010K\u001a\u0004\bL\u0010DR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bO\u0010GR\u0013\u0010Q\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bP\u0010DR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bT\u0010GR\u0013\u0010V\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bU\u0010DR\u0013\u0010 \u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bW\u0010SR\u0013\u0010!\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bX\u0010DR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\bZ\u0010K\u001a\u0004\bY\u0010:R\u001c\u0010]\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\\\u0010K\u001a\u0004\b[\u0010DR\u0019\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0013\u0010a\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b`\u0010DR\u0013\u0010&\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bb\u0010SR\u0019\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\bc\u0010_R\u0013\u0010e\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bd\u0010DR\u0013\u0010(\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bf\u0010SR\u0013\u0010)\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bg\u0010GR\u0013\u0010i\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bh\u0010DR\u0013\u0010*\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bj\u0010SR\u001c\u0010+\u001a\u0004\u0018\u00010\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\bl\u0010K\u001a\u0004\bk\u0010GR\u001c\u0010o\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\bn\u0010K\u001a\u0004\bm\u0010DR\u001c\u0010,\u001a\u0004\u0018\u00010\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\bq\u0010K\u001a\u0004\bp\u0010SR\u0013\u0010-\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\br\u0010GR\u0013\u0010t\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bs\u0010DR\u0013\u0010.\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bu\u0010SR\u0013\u0010/\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bv\u0010GR\u0013\u0010x\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bw\u0010DR\u0013\u00100\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\by\u0010GR\u0013\u0010{\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bz\u0010DR\u0013\u00101\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b|\u0010SR\u0013\u00102\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b}\u0010GR\u0013\u0010\u007f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b~\u0010DR\u0014\u00103\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010SR\u0015\u00105\u001a\u0004\u0018\u0001048F¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0015\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010DR\u0014\u00107\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010GR\u0015\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010DR\u0014\u00108\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010S¨\u0006\u008a\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/RasterLayer;", "Lcom/mapbox/maps/extension/style/layers/generated/RasterLayerDsl;", "Lcom/mapbox/maps/extension/style/layers/Layer;", "", "layerId", "sourceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sourceLayer", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/generated/RasterLayer;", "slot", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/generated/RasterLayer;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/generated/RasterLayer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/generated/RasterLayer;", "maxZoom", "rasterArrayBand", "rasterBrightnessMax", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "rasterBrightnessMaxTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/layers/generated/RasterLayer;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/RasterLayer;", "rasterBrightnessMin", "rasterBrightnessMinTransition", "rasterColor", "rasterColorUseTheme", "", "rasterColorMix", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/layers/generated/RasterLayer;", "rasterColorMixTransition", "rasterColorRange", "rasterColorRangeTransition", "rasterContrast", "rasterContrastTransition", "rasterElevation", "rasterElevationTransition", "rasterEmissiveStrength", "rasterEmissiveStrengthTransition", "rasterFadeDuration", "rasterHueRotate", "rasterHueRotateTransition", "rasterOpacity", "rasterOpacityTransition", "Lcom/mapbox/maps/extension/style/layers/properties/generated/RasterResampling;", "rasterResampling", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/RasterResampling;)Lcom/mapbox/maps/extension/style/layers/generated/RasterLayer;", "rasterSaturation", "rasterSaturationTransition", "getType$extension_style_release", "()Ljava/lang/String;", "getType", "Ljava/lang/String;", "getLayerId", "getSourceId", "getSourceLayer", "getSlot", "getVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getVisibilityAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "visibilityAsExpression", "getMinZoom", "()Ljava/lang/Double;", "getMaxZoom", "getRasterArrayBand", "getRasterArrayBand$annotations", "()V", "getRasterArrayBandAsExpression", "getRasterArrayBandAsExpression$annotations", "rasterArrayBandAsExpression", "getRasterBrightnessMax", "getRasterBrightnessMaxAsExpression", "rasterBrightnessMaxAsExpression", "getRasterBrightnessMaxTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getRasterBrightnessMin", "getRasterBrightnessMinAsExpression", "rasterBrightnessMinAsExpression", "getRasterBrightnessMinTransition", "getRasterColor", "getRasterColorUseTheme", "getRasterColorUseTheme$annotations", "getRasterColorUseThemeAsExpression", "getRasterColorUseThemeAsExpression$annotations", "rasterColorUseThemeAsExpression", "getRasterColorMix", "()Ljava/util/List;", "getRasterColorMixAsExpression", "rasterColorMixAsExpression", "getRasterColorMixTransition", "getRasterColorRange", "getRasterColorRangeAsExpression", "rasterColorRangeAsExpression", "getRasterColorRangeTransition", "getRasterContrast", "getRasterContrastAsExpression", "rasterContrastAsExpression", "getRasterContrastTransition", "getRasterElevation", "getRasterElevation$annotations", "getRasterElevationAsExpression", "getRasterElevationAsExpression$annotations", "rasterElevationAsExpression", "getRasterElevationTransition", "getRasterElevationTransition$annotations", "getRasterEmissiveStrength", "getRasterEmissiveStrengthAsExpression", "rasterEmissiveStrengthAsExpression", "getRasterEmissiveStrengthTransition", "getRasterFadeDuration", "getRasterFadeDurationAsExpression", "rasterFadeDurationAsExpression", "getRasterHueRotate", "getRasterHueRotateAsExpression", "rasterHueRotateAsExpression", "getRasterHueRotateTransition", "getRasterOpacity", "getRasterOpacityAsExpression", "rasterOpacityAsExpression", "getRasterOpacityTransition", "getRasterResampling", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/RasterResampling;", "getRasterResamplingAsExpression", "rasterResamplingAsExpression", "getRasterSaturation", "getRasterSaturationAsExpression", "rasterSaturationAsExpression", "getRasterSaturationTransition", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class RasterLayer extends Layer implements RasterLayerDsl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String layerId;
    private final String sourceId;

    public RasterLayer(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.layerId = str;
        this.sourceId = str2;
        setInternalSourceId$extension_style_release(str2);
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterArrayBand$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterArrayBandAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterElevation$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterElevationAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterElevationTransition$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public String getLayerId() {
        return this.layerId;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public Double getMaxZoom() {
        return (Double) getPropertyValueWithType("maxzoom", Double.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public Double getMinZoom() {
        return (Double) getPropertyValueWithType("minzoom", Double.class);
    }

    public final String getRasterArrayBand() {
        return (String) getPropertyValueWithType("raster-array-band", String.class);
    }

    public final Expression getRasterArrayBandAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-array-band");
    }

    public final Double getRasterBrightnessMax() {
        return (Double) getPropertyValueWithType("raster-brightness-max", Double.class);
    }

    public final Expression getRasterBrightnessMaxAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-brightness-max");
    }

    public final StyleTransition getRasterBrightnessMaxTransition() {
        return (StyleTransition) getPropertyValueWithType("raster-brightness-max-transition", StyleTransition.class);
    }

    public final Double getRasterBrightnessMin() {
        return (Double) getPropertyValueWithType("raster-brightness-min", Double.class);
    }

    public final Expression getRasterBrightnessMinAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-brightness-min");
    }

    public final StyleTransition getRasterBrightnessMinTransition() {
        return (StyleTransition) getPropertyValueWithType("raster-brightness-min-transition", StyleTransition.class);
    }

    public final Expression getRasterColor() {
        return (Expression) getPropertyValueWithType("raster-color", Expression.class);
    }

    public final List<Double> getRasterColorMix() {
        return (List) getPropertyValueWithType("raster-color-mix", List.class);
    }

    public final Expression getRasterColorMixAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-color-mix");
    }

    public final StyleTransition getRasterColorMixTransition() {
        return (StyleTransition) getPropertyValueWithType("raster-color-mix-transition", StyleTransition.class);
    }

    public final List<Double> getRasterColorRange() {
        return (List) getPropertyValueWithType("raster-color-range", List.class);
    }

    public final Expression getRasterColorRangeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-color-range");
    }

    public final StyleTransition getRasterColorRangeTransition() {
        return (StyleTransition) getPropertyValueWithType("raster-color-range-transition", StyleTransition.class);
    }

    public final String getRasterColorUseTheme() {
        return (String) getPropertyValueWithType("raster-color-use-theme", String.class);
    }

    public final Expression getRasterColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-color-use-theme");
    }

    public final Double getRasterContrast() {
        return (Double) getPropertyValueWithType("raster-contrast", Double.class);
    }

    public final Expression getRasterContrastAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-contrast");
    }

    public final StyleTransition getRasterContrastTransition() {
        return (StyleTransition) getPropertyValueWithType("raster-contrast-transition", StyleTransition.class);
    }

    public final Double getRasterElevation() {
        return (Double) getPropertyValueWithType("raster-elevation", Double.class);
    }

    public final Expression getRasterElevationAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-elevation");
    }

    public final StyleTransition getRasterElevationTransition() {
        return (StyleTransition) getPropertyValueWithType("raster-elevation-transition", StyleTransition.class);
    }

    public final Double getRasterEmissiveStrength() {
        return (Double) getPropertyValueWithType("raster-emissive-strength", Double.class);
    }

    public final Expression getRasterEmissiveStrengthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-emissive-strength");
    }

    public final StyleTransition getRasterEmissiveStrengthTransition() {
        return (StyleTransition) getPropertyValueWithType("raster-emissive-strength-transition", StyleTransition.class);
    }

    public final Double getRasterFadeDuration() {
        return (Double) getPropertyValueWithType("raster-fade-duration", Double.class);
    }

    public final Expression getRasterFadeDurationAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-fade-duration");
    }

    public final Double getRasterHueRotate() {
        return (Double) getPropertyValueWithType("raster-hue-rotate", Double.class);
    }

    public final Expression getRasterHueRotateAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-hue-rotate");
    }

    public final StyleTransition getRasterHueRotateTransition() {
        return (StyleTransition) getPropertyValueWithType("raster-hue-rotate-transition", StyleTransition.class);
    }

    public final Double getRasterOpacity() {
        return (Double) getPropertyValueWithType("raster-opacity", Double.class);
    }

    public final Expression getRasterOpacityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-opacity");
    }

    public final StyleTransition getRasterOpacityTransition() {
        return (StyleTransition) getPropertyValueWithType("raster-opacity-transition", StyleTransition.class);
    }

    public final RasterResampling getRasterResampling() {
        String str = (String) getPropertyValueWithType("raster-resampling", String.class);
        if (str == null) {
            return null;
        }
        RasterResampling.Companion companion = RasterResampling.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    public final Expression getRasterResamplingAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("raster-resampling", Expression.class);
        if (expression != null) {
            return expression;
        }
        RasterResampling rasterResampling = getRasterResampling();
        if (rasterResampling != null) {
            return Expression.INSTANCE.literal(rasterResampling.getValue());
        }
        return null;
    }

    public final Double getRasterSaturation() {
        return (Double) getPropertyValueWithType("raster-saturation", Double.class);
    }

    public final Expression getRasterSaturationAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-saturation");
    }

    public final StyleTransition getRasterSaturationTransition() {
        return (StyleTransition) getPropertyValueWithType("raster-saturation-transition", StyleTransition.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public String getSlot() {
        return (String) getPropertyValueWithType("slot", String.class);
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final String getSourceLayer() {
        return (String) getPropertyValueWithType("source-layer", String.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public String getType$extension_style_release() {
        return "raster";
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public Visibility getVisibility() {
        String str = (String) getPropertyValueWithType("visibility", String.class);
        if (str == null) {
            return null;
        }
        Visibility.Companion companion = Visibility.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public Expression getVisibilityAsExpression() {
        return (Expression) getPropertyValueWithType("visibility", Expression.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public RasterLayer maxZoom(double maxZoom) {
        setProperty$extension_style_release(new PropertyValue<>("maxzoom", Double.valueOf(maxZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public RasterLayer minZoom(double minZoom) {
        setProperty$extension_style_release(new PropertyValue<>("minzoom", Double.valueOf(minZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @MapboxExperimental
    public RasterLayer rasterArrayBand(String rasterArrayBand) {
        rasterArrayBand.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-array-band", rasterArrayBand));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterBrightnessMax(double rasterBrightnessMax) {
        setProperty$extension_style_release(new PropertyValue<>("raster-brightness-max", Double.valueOf(rasterBrightnessMax)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterBrightnessMaxTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        rasterBrightnessMaxTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterBrightnessMin(double rasterBrightnessMin) {
        setProperty$extension_style_release(new PropertyValue<>("raster-brightness-min", Double.valueOf(rasterBrightnessMin)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterBrightnessMinTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        rasterBrightnessMinTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterColor(Expression rasterColor) {
        rasterColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-color", rasterColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterColorMix(List<Double> rasterColorMix) {
        rasterColorMix.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-color-mix", rasterColorMix));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterColorMixTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        rasterColorMixTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterColorRange(List<Double> rasterColorRange) {
        rasterColorRange.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-color-range", rasterColorRange));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterColorRangeTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        rasterColorRangeTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @MapboxExperimental
    public RasterLayer rasterColorUseTheme(String rasterColorUseTheme) {
        rasterColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-color-use-theme", rasterColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterContrast(double rasterContrast) {
        setProperty$extension_style_release(new PropertyValue<>("raster-contrast", Double.valueOf(rasterContrast)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterContrastTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        rasterContrastTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @MapboxExperimental
    public RasterLayer rasterElevation(double rasterElevation) {
        setProperty$extension_style_release(new PropertyValue<>("raster-elevation", Double.valueOf(rasterElevation)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @MapboxExperimental
    public RasterLayer rasterElevationTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        rasterElevationTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterEmissiveStrength(double rasterEmissiveStrength) {
        setProperty$extension_style_release(new PropertyValue<>("raster-emissive-strength", Double.valueOf(rasterEmissiveStrength)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterEmissiveStrengthTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        rasterEmissiveStrengthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterFadeDuration(double rasterFadeDuration) {
        setProperty$extension_style_release(new PropertyValue<>("raster-fade-duration", Double.valueOf(rasterFadeDuration)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterHueRotate(double rasterHueRotate) {
        setProperty$extension_style_release(new PropertyValue<>("raster-hue-rotate", Double.valueOf(rasterHueRotate)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterHueRotateTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        rasterHueRotateTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterOpacity(double rasterOpacity) {
        setProperty$extension_style_release(new PropertyValue<>("raster-opacity", Double.valueOf(rasterOpacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterOpacityTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        rasterOpacityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterResampling(RasterResampling rasterResampling) {
        rasterResampling.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-resampling", rasterResampling));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterSaturation(double rasterSaturation) {
        setProperty$extension_style_release(new PropertyValue<>("raster-saturation", Double.valueOf(rasterSaturation)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterSaturationTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        rasterSaturationTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public RasterLayer slot(String slot) {
        slot.getClass();
        setProperty$extension_style_release(new PropertyValue<>("slot", slot));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer sourceLayer(String sourceLayer) {
        sourceLayer.getClass();
        setProperty$extension_style_release(new PropertyValue<>("source-layer", sourceLayer));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public RasterLayer visibility(Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b8\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0006R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b \u0010\u001aR\u0019\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0012R\u0013\u0010'\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b(\u0010\u001aR\u0019\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b*\u0010$R\u0013\u0010+\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0012R\u0013\u0010-\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b.\u0010\u001aR\u001c\u0010/\u001a\u0004\u0018\u00010\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010\u0002\u001a\u0004\b1\u0010\rR\u001c\u00102\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010\u0002\u001a\u0004\b4\u0010\u0012R\u0013\u00105\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b6\u0010\u0006R\u0013\u00107\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b8\u0010\u0012R\u0013\u00109\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b:\u0010\u001aR\u001c\u0010;\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b<\u0010\u0002\u001a\u0004\b=\u0010\u0006R\u001c\u0010>\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b?\u0010\u0002\u001a\u0004\b@\u0010\u0012R\u001c\u0010A\u001a\u0004\u0018\u00010\u00188FX\u0087\u0004¢\u0006\f\u0012\u0004\bB\u0010\u0002\u001a\u0004\bC\u0010\u001aR\u0013\u0010D\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bE\u0010\u0006R\u0013\u0010F\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bG\u0010\u0012R\u0013\u0010H\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bI\u0010\u001aR\u0013\u0010J\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bK\u0010\u0006R\u0013\u0010L\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bM\u0010\u0012R\u0013\u0010N\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bO\u0010\u0006R\u0013\u0010P\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bQ\u0010\u0012R\u0013\u0010R\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bS\u0010\u001aR\u0013\u0010T\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bU\u0010\u0006R\u0013\u0010V\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bW\u0010\u0012R\u0013\u0010X\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bY\u0010\u001aR\u0013\u0010Z\u001a\u0004\u0018\u00010[8F¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0013\u0010^\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b_\u0010\u0012R\u0013\u0010`\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\ba\u0010\u0006R\u0013\u0010b\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bc\u0010\u0012R\u0013\u0010d\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\be\u0010\u001aR\u0013\u0010f\u001a\u0004\u0018\u00010g8F¢\u0006\u0006\u001a\u0004\bh\u0010i¨\u0006j"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/RasterLayer$Companion;", "", "()V", "defaultMaxZoom", "", "getDefaultMaxZoom", "()Ljava/lang/Double;", "defaultMinZoom", "getDefaultMinZoom", "defaultRasterArrayBand", "", "getDefaultRasterArrayBand$annotations", "getDefaultRasterArrayBand", "()Ljava/lang/String;", "defaultRasterArrayBandAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getDefaultRasterArrayBandAsExpression$annotations", "getDefaultRasterArrayBandAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "defaultRasterBrightnessMax", "getDefaultRasterBrightnessMax", "defaultRasterBrightnessMaxAsExpression", "getDefaultRasterBrightnessMaxAsExpression", "defaultRasterBrightnessMaxTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getDefaultRasterBrightnessMaxTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "defaultRasterBrightnessMin", "getDefaultRasterBrightnessMin", "defaultRasterBrightnessMinAsExpression", "getDefaultRasterBrightnessMinAsExpression", "defaultRasterBrightnessMinTransition", "getDefaultRasterBrightnessMinTransition", "defaultRasterColorMix", "", "getDefaultRasterColorMix", "()Ljava/util/List;", "defaultRasterColorMixAsExpression", "getDefaultRasterColorMixAsExpression", "defaultRasterColorMixTransition", "getDefaultRasterColorMixTransition", "defaultRasterColorRange", "getDefaultRasterColorRange", "defaultRasterColorRangeAsExpression", "getDefaultRasterColorRangeAsExpression", "defaultRasterColorRangeTransition", "getDefaultRasterColorRangeTransition", "defaultRasterColorUseTheme", "getDefaultRasterColorUseTheme$annotations", "getDefaultRasterColorUseTheme", "defaultRasterColorUseThemeAsExpression", "getDefaultRasterColorUseThemeAsExpression$annotations", "getDefaultRasterColorUseThemeAsExpression", "defaultRasterContrast", "getDefaultRasterContrast", "defaultRasterContrastAsExpression", "getDefaultRasterContrastAsExpression", "defaultRasterContrastTransition", "getDefaultRasterContrastTransition", "defaultRasterElevation", "getDefaultRasterElevation$annotations", "getDefaultRasterElevation", "defaultRasterElevationAsExpression", "getDefaultRasterElevationAsExpression$annotations", "getDefaultRasterElevationAsExpression", "defaultRasterElevationTransition", "getDefaultRasterElevationTransition$annotations", "getDefaultRasterElevationTransition", "defaultRasterEmissiveStrength", "getDefaultRasterEmissiveStrength", "defaultRasterEmissiveStrengthAsExpression", "getDefaultRasterEmissiveStrengthAsExpression", "defaultRasterEmissiveStrengthTransition", "getDefaultRasterEmissiveStrengthTransition", "defaultRasterFadeDuration", "getDefaultRasterFadeDuration", "defaultRasterFadeDurationAsExpression", "getDefaultRasterFadeDurationAsExpression", "defaultRasterHueRotate", "getDefaultRasterHueRotate", "defaultRasterHueRotateAsExpression", "getDefaultRasterHueRotateAsExpression", "defaultRasterHueRotateTransition", "getDefaultRasterHueRotateTransition", "defaultRasterOpacity", "getDefaultRasterOpacity", "defaultRasterOpacityAsExpression", "getDefaultRasterOpacityAsExpression", "defaultRasterOpacityTransition", "getDefaultRasterOpacityTransition", "defaultRasterResampling", "Lcom/mapbox/maps/extension/style/layers/properties/generated/RasterResampling;", "getDefaultRasterResampling", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/RasterResampling;", "defaultRasterResamplingAsExpression", "getDefaultRasterResamplingAsExpression", "defaultRasterSaturation", "getDefaultRasterSaturation", "defaultRasterSaturationAsExpression", "getDefaultRasterSaturationAsExpression", "defaultRasterSaturationTransition", "getDefaultRasterSaturationTransition", "defaultVisibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getDefaultVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterArrayBand$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterArrayBandAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterElevation$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterElevationAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterElevationTransition$annotations() {
        }

        public final Double getDefaultMaxZoom() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "maxzoom");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Double getDefaultMinZoom() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "minzoom");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final String getDefaultRasterArrayBand() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-array-band");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultRasterArrayBandAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-array-band");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            String defaultRasterArrayBand = getDefaultRasterArrayBand();
            if (defaultRasterArrayBand != null) {
                return Expression.INSTANCE.literal(defaultRasterArrayBand);
            }
            return null;
        }

        public final Double getDefaultRasterBrightnessMax() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-brightness-max");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultRasterBrightnessMaxAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-brightness-max");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            Double defaultRasterBrightnessMax = getDefaultRasterBrightnessMax();
            if (defaultRasterBrightnessMax == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterBrightnessMax.doubleValue());
        }

        public final StyleTransition getDefaultRasterBrightnessMaxTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-brightness-max-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultRasterBrightnessMin() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-brightness-min");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultRasterBrightnessMinAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-brightness-min");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            Double defaultRasterBrightnessMin = getDefaultRasterBrightnessMin();
            if (defaultRasterBrightnessMin == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterBrightnessMin.doubleValue());
        }

        public final StyleTransition getDefaultRasterBrightnessMinTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-brightness-min-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final List<Double> getDefaultRasterColorMix() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-color-mix");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (List) objUnwrap;
        }

        public final Expression getDefaultRasterColorMixAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-color-mix");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            List<Double> defaultRasterColorMix = getDefaultRasterColorMix();
            if (defaultRasterColorMix != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultRasterColorMix);
            }
            return null;
        }

        public final StyleTransition getDefaultRasterColorMixTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-color-mix-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final List<Double> getDefaultRasterColorRange() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-color-range");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (List) objUnwrap;
        }

        public final Expression getDefaultRasterColorRangeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-color-range");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            List<Double> defaultRasterColorRange = getDefaultRasterColorRange();
            if (defaultRasterColorRange != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultRasterColorRange);
            }
            return null;
        }

        public final StyleTransition getDefaultRasterColorRangeTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-color-range-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultRasterColorUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultRasterColorUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            String defaultRasterColorUseTheme = getDefaultRasterColorUseTheme();
            if (defaultRasterColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultRasterColorUseTheme);
            }
            return null;
        }

        public final Double getDefaultRasterContrast() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-contrast");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultRasterContrastAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-contrast");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            Double defaultRasterContrast = getDefaultRasterContrast();
            if (defaultRasterContrast == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterContrast.doubleValue());
        }

        public final StyleTransition getDefaultRasterContrastTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-contrast-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultRasterElevation() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-elevation");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultRasterElevationAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-elevation");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            Double defaultRasterElevation = getDefaultRasterElevation();
            if (defaultRasterElevation == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterElevation.doubleValue());
        }

        public final StyleTransition getDefaultRasterElevationTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-elevation-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultRasterEmissiveStrength() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-emissive-strength");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultRasterEmissiveStrengthAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-emissive-strength");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            Double defaultRasterEmissiveStrength = getDefaultRasterEmissiveStrength();
            if (defaultRasterEmissiveStrength == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterEmissiveStrength.doubleValue());
        }

        public final StyleTransition getDefaultRasterEmissiveStrengthTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-emissive-strength-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultRasterFadeDuration() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-fade-duration");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultRasterFadeDurationAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-fade-duration");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            Double defaultRasterFadeDuration = getDefaultRasterFadeDuration();
            if (defaultRasterFadeDuration == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterFadeDuration.doubleValue());
        }

        public final Double getDefaultRasterHueRotate() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-hue-rotate");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultRasterHueRotateAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-hue-rotate");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            Double defaultRasterHueRotate = getDefaultRasterHueRotate();
            if (defaultRasterHueRotate == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterHueRotate.doubleValue());
        }

        public final StyleTransition getDefaultRasterHueRotateTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-hue-rotate-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultRasterOpacity() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-opacity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultRasterOpacityAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-opacity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            Double defaultRasterOpacity = getDefaultRasterOpacity();
            if (defaultRasterOpacity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterOpacity.doubleValue());
        }

        public final StyleTransition getDefaultRasterOpacityTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-opacity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final RasterResampling getDefaultRasterResampling() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-resampling");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            String str = (String) objUnwrap;
            if (str == null) {
                return null;
            }
            RasterResampling.Companion companion = RasterResampling.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        public final Expression getDefaultRasterResamplingAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-resampling");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            RasterResampling defaultRasterResampling = getDefaultRasterResampling();
            if (defaultRasterResampling != null) {
                return Expression.INSTANCE.literal(defaultRasterResampling.getValue());
            }
            return null;
        }

        public final Double getDefaultRasterSaturation() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-saturation");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultRasterSaturationAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-saturation");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            Double defaultRasterSaturation = getDefaultRasterSaturation();
            if (defaultRasterSaturation == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterSaturation.doubleValue());
        }

        public final StyleTransition getDefaultRasterSaturationTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "raster-saturation-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Visibility getDefaultVisibility() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster", "visibility");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            String str = (String) objUnwrap;
            if (str == null) {
                return null;
            }
            Visibility.Companion companion = Visibility.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        private Companion() {
        }
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @MapboxExperimental
    public RasterLayer rasterArrayBand(Expression rasterArrayBand) {
        rasterArrayBand.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-array-band", rasterArrayBand));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterColorMix(Expression rasterColorMix) {
        rasterColorMix.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-color-mix", rasterColorMix));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterColorRange(Expression rasterColorRange) {
        rasterColorRange.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-color-range", rasterColorRange));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @MapboxExperimental
    public RasterLayer rasterColorUseTheme(Expression rasterColorUseTheme) {
        rasterColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-color-use-theme", rasterColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterResampling(Expression rasterResampling) {
        rasterResampling.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-resampling", rasterResampling));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterBrightnessMax(Expression rasterBrightnessMax) {
        rasterBrightnessMax.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-brightness-max", rasterBrightnessMax));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterBrightnessMin(Expression rasterBrightnessMin) {
        rasterBrightnessMin.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-brightness-min", rasterBrightnessMin));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterContrast(Expression rasterContrast) {
        rasterContrast.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-contrast", rasterContrast));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @MapboxExperimental
    public RasterLayer rasterElevation(Expression rasterElevation) {
        rasterElevation.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-elevation", rasterElevation));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterEmissiveStrength(Expression rasterEmissiveStrength) {
        rasterEmissiveStrength.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-emissive-strength", rasterEmissiveStrength));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterFadeDuration(Expression rasterFadeDuration) {
        rasterFadeDuration.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-fade-duration", rasterFadeDuration));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterHueRotate(Expression rasterHueRotate) {
        rasterHueRotate.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-hue-rotate", rasterHueRotate));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterOpacity(Expression rasterOpacity) {
        rasterOpacity.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-opacity", rasterOpacity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterSaturation(Expression rasterSaturation) {
        rasterSaturation.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-saturation", rasterSaturation));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public RasterLayer visibility(Expression visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterBrightnessMaxTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-brightness-max-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterBrightnessMinTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-brightness-min-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterColorMixTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-color-mix-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterColorRangeTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-color-range-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterContrastTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-contrast-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    @MapboxExperimental
    public RasterLayer rasterElevationTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-elevation-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterEmissiveStrengthTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-emissive-strength-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterHueRotateTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-hue-rotate-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterOpacityTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-opacity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterLayerDsl
    public RasterLayer rasterSaturationTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-saturation-transition", options));
        return this;
    }
}
