package com.mapbox.maps.extension.style.layers.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.StyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.FillElevationReference;
import com.mapbox.maps.extension.style.layers.properties.generated.FillTranslateAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.p;
import com.mapbox.maps.plugin.annotation.generated.PolygonAnnotationOptions;
import e23.l;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import r1.q2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0003\b\u0081\u0001\b\u0007\u0018\u0000 º\u00012\u00020\u00012\u00020\u0002:\u0002º\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0016\u0010\rJ\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0019\u0010\rJ\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\rJ\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\rJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u001d\u0010\tJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u001d\u0010\rJ\u0019\u0010\u001d\u001a\u00020\u00002\b\b\u0001\u0010\u001d\u001a\u00020\u001eH\u0017¢\u0006\u0004\b\u001d\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b\"\u0010#J#\u0010\"\u001a\u00020\u00002\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$H\u0017¢\u0006\u0004\b\"\u0010(J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0003H\u0017¢\u0006\u0004\b)\u0010\tJ\u0017\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u000bH\u0017¢\u0006\u0004\b)\u0010\rJ\u0017\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0003H\u0016¢\u0006\u0004\b*\u0010\tJ\u0017\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u000bH\u0016¢\u0006\u0004\b*\u0010\rJ\u0019\u0010*\u001a\u00020\u00002\b\b\u0001\u0010*\u001a\u00020\u001eH\u0016¢\u0006\u0004\b*\u0010\u001fJ\u0017\u0010+\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b+\u0010#J#\u0010+\u001a\u00020\u00002\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$H\u0016¢\u0006\u0004\b+\u0010(J\u0017\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0003H\u0017¢\u0006\u0004\b,\u0010\tJ\u0017\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u000bH\u0017¢\u0006\u0004\b,\u0010\rJ\u0017\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0011H\u0016¢\u0006\u0004\b-\u0010\u0013J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u000bH\u0016¢\u0006\u0004\b-\u0010\rJ\u0017\u0010.\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b.\u0010#J#\u0010.\u001a\u00020\u00002\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$H\u0016¢\u0006\u0004\b.\u0010(J\u0017\u0010/\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0011H\u0016¢\u0006\u0004\b/\u0010\u0013J\u0017\u0010/\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u0010\rJ\u0017\u00100\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b0\u0010#J#\u00100\u001a\u00020\u00002\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$H\u0016¢\u0006\u0004\b0\u0010(J\u0017\u00101\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0003H\u0016¢\u0006\u0004\b1\u0010\tJ\u0017\u00101\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u000bH\u0016¢\u0006\u0004\b1\u0010\rJ\u0019\u00101\u001a\u00020\u00002\b\b\u0001\u00101\u001a\u00020\u001eH\u0016¢\u0006\u0004\b1\u0010\u001fJ\u0017\u00102\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b2\u0010#J#\u00102\u001a\u00020\u00002\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$H\u0016¢\u0006\u0004\b2\u0010(J\u0017\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0003H\u0017¢\u0006\u0004\b3\u0010\tJ\u0017\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u000bH\u0017¢\u0006\u0004\b3\u0010\rJ\u0017\u00104\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0003H\u0016¢\u0006\u0004\b4\u0010\tJ\u0017\u00104\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u000bH\u0016¢\u0006\u0004\b4\u0010\rJ\u0017\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0011H\u0016¢\u0006\u0004\b5\u0010\u0013J\u0017\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u000bH\u0016¢\u0006\u0004\b5\u0010\rJ\u001d\u00107\u001a\u00020\u00002\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001106H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00107\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u000bH\u0016¢\u0006\u0004\b7\u0010\rJ\u0017\u00109\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b9\u0010#J#\u00109\u001a\u00020\u00002\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$H\u0016¢\u0006\u0004\b9\u0010(J\u0017\u0010;\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010;\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u000bH\u0016¢\u0006\u0004\b;\u0010\rJ\u0017\u0010=\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u0003H\u0017¢\u0006\u0004\b=\u0010\tJ\u0017\u0010=\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u000bH\u0017¢\u0006\u0004\b=\u0010\rJ\u0019\u0010=\u001a\u00020\u00002\b\b\u0001\u0010=\u001a\u00020\u001eH\u0017¢\u0006\u0004\b=\u0010\u001fJ\u0017\u0010>\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b>\u0010#J#\u0010>\u001a\u00020\u00002\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$H\u0017¢\u0006\u0004\b>\u0010(J\u0017\u0010?\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u0003H\u0017¢\u0006\u0004\b?\u0010\tJ\u0017\u0010?\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u000bH\u0017¢\u0006\u0004\b?\u0010\rJ\u0017\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u0011H\u0017¢\u0006\u0004\b@\u0010\u0013J\u0017\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u000bH\u0017¢\u0006\u0004\b@\u0010\rJ\u0017\u0010A\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\bA\u0010#J#\u0010A\u001a\u00020\u00002\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$H\u0017¢\u0006\u0004\bA\u0010(J\u000f\u0010D\u001a\u00020\u0003H\u0010¢\u0006\u0004\bB\u0010CR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010E\u001a\u0004\bF\u0010CR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bG\u0010CR\u0013\u0010\b\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bH\u0010CR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010CR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0016\u0010O\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010KR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010QR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158FX\u0087\u0004¢\u0006\f\u0012\u0004\bU\u0010V\u001a\u0004\bS\u0010TR\u001c\u0010Y\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bX\u0010V\u001a\u0004\bW\u0010KR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188FX\u0087\u0004¢\u0006\f\u0012\u0004\b\\\u0010V\u001a\u0004\bZ\u0010[R\u001c\u0010_\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b^\u0010V\u001a\u0004\b]\u0010KR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b`\u0010QR\u0013\u0010b\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\ba\u0010KR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bc\u0010TR\u0013\u0010e\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bd\u0010KR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\bg\u0010V\u001a\u0004\bf\u0010CR\u001c\u0010j\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bi\u0010V\u001a\u0004\bh\u0010KR\u001c\u0010n\u001a\u0004\u0018\u00010\u001e8GX\u0087\u0004¢\u0006\f\u0012\u0004\bm\u0010V\u001a\u0004\bk\u0010lR\u001c\u0010\"\u001a\u0004\u0018\u00010 8FX\u0087\u0004¢\u0006\f\u0012\u0004\bq\u0010V\u001a\u0004\bo\u0010pR\u001c\u0010)\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\bs\u0010V\u001a\u0004\br\u0010CR\u001c\u0010v\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bu\u0010V\u001a\u0004\bt\u0010KR\u0013\u0010*\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bw\u0010CR\u0013\u0010y\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bx\u0010KR\u0013\u0010{\u001a\u0004\u0018\u00010\u001e8G¢\u0006\u0006\u001a\u0004\bz\u0010lR\u0013\u0010+\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b|\u0010pR\u001c\u0010,\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b~\u0010V\u001a\u0004\b}\u0010CR\u001e\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\r\u0012\u0005\b\u0080\u0001\u0010V\u001a\u0004\b\u007f\u0010KR\u0014\u0010-\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010QR\u0015\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010KR\u0014\u0010.\u001a\u0004\u0018\u00010 8F¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010pR\u0014\u0010/\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010QR\u0015\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010KR\u0014\u00100\u001a\u0004\u0018\u00010 8F¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010pR\u0014\u00101\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010CR\u0015\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010KR\u0015\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u001e8G¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010lR\u0014\u00102\u001a\u0004\u0018\u00010 8F¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010pR\u001e\u00103\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0091\u0001\u0010V\u001a\u0005\b\u0090\u0001\u0010CR\u001f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0093\u0001\u0010V\u001a\u0005\b\u0092\u0001\u0010KR\u0014\u00104\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010CR\u0015\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010KR\u0014\u00105\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010QR\u0015\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010KR\u001b\u00107\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001068F¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0015\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010KR\u0014\u00109\u001a\u0004\u0018\u00010 8F¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010pR\u0015\u0010;\u001a\u0004\u0018\u00010:8F¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u0015\u0010£\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010KR\u001e\u0010=\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¥\u0001\u0010V\u001a\u0005\b¤\u0001\u0010CR\u001f\u0010¨\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b§\u0001\u0010V\u001a\u0005\b¦\u0001\u0010KR\u001f\u0010«\u0001\u001a\u0004\u0018\u00010\u001e8GX\u0087\u0004¢\u0006\u000e\u0012\u0005\bª\u0001\u0010V\u001a\u0005\b©\u0001\u0010lR\u001e\u0010>\u001a\u0004\u0018\u00010 8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u00ad\u0001\u0010V\u001a\u0005\b¬\u0001\u0010pR\u001e\u0010?\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¯\u0001\u0010V\u001a\u0005\b®\u0001\u0010CR\u001f\u0010²\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b±\u0001\u0010V\u001a\u0005\b°\u0001\u0010KR\u001e\u0010@\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b´\u0001\u0010V\u001a\u0005\b³\u0001\u0010QR\u001f\u0010·\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¶\u0001\u0010V\u001a\u0005\bµ\u0001\u0010KR\u001e\u0010A\u001a\u0004\u0018\u00010 8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¹\u0001\u0010V\u001a\u0005\b¸\u0001\u0010p¨\u0006»\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "Lcom/mapbox/maps/extension/style/layers/generated/FillLayerDsl;", "Lcom/mapbox/maps/extension/style/layers/Layer;", "", "layerId", "sourceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sourceLayer", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "slot", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "filter", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "maxZoom", "", "fillConstructBridgeGuardRail", "(Z)Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillElevationReference;", "fillElevationReference", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/FillElevationReference;)Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "fillSortKey", "fillAntialias", "fillBridgeGuardRailColor", "", "(I)Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "fillBridgeGuardRailColorTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "fillBridgeGuardRailColorUseTheme", "fillColor", "fillColorTransition", "fillColorUseTheme", "fillEmissiveStrength", "fillEmissiveStrengthTransition", "fillOpacity", "fillOpacityTransition", "fillOutlineColor", "fillOutlineColorTransition", "fillOutlineColorUseTheme", "fillPattern", "fillPatternCrossFade", "", "fillTranslate", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "fillTranslateTransition", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillTranslateAnchor;", "fillTranslateAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/FillTranslateAnchor;)Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "fillTunnelStructureColor", "fillTunnelStructureColorTransition", "fillTunnelStructureColorUseTheme", "fillZOffset", "fillZOffsetTransition", "getType$extension_style_release", "()Ljava/lang/String;", "getType", "Ljava/lang/String;", "getLayerId", "getSourceId", "getSourceLayer", "getSlot", "getFilter", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getVisibilityAsExpression", "visibilityAsExpression", "getMinZoom", "()Ljava/lang/Double;", "getMaxZoom", "getFillConstructBridgeGuardRail", "()Ljava/lang/Boolean;", "getFillConstructBridgeGuardRail$annotations", "()V", "getFillConstructBridgeGuardRailAsExpression", "getFillConstructBridgeGuardRailAsExpression$annotations", "fillConstructBridgeGuardRailAsExpression", "getFillElevationReference", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/FillElevationReference;", "getFillElevationReference$annotations", "getFillElevationReferenceAsExpression", "getFillElevationReferenceAsExpression$annotations", "fillElevationReferenceAsExpression", "getFillSortKey", "getFillSortKeyAsExpression", "fillSortKeyAsExpression", "getFillAntialias", "getFillAntialiasAsExpression", "fillAntialiasAsExpression", "getFillBridgeGuardRailColor", "getFillBridgeGuardRailColor$annotations", "getFillBridgeGuardRailColorAsExpression", "getFillBridgeGuardRailColorAsExpression$annotations", "fillBridgeGuardRailColorAsExpression", "getFillBridgeGuardRailColorAsColorInt", "()Ljava/lang/Integer;", "getFillBridgeGuardRailColorAsColorInt$annotations", "fillBridgeGuardRailColorAsColorInt", "getFillBridgeGuardRailColorTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getFillBridgeGuardRailColorTransition$annotations", "getFillBridgeGuardRailColorUseTheme", "getFillBridgeGuardRailColorUseTheme$annotations", "getFillBridgeGuardRailColorUseThemeAsExpression", "getFillBridgeGuardRailColorUseThemeAsExpression$annotations", "fillBridgeGuardRailColorUseThemeAsExpression", "getFillColor", "getFillColorAsExpression", "fillColorAsExpression", "getFillColorAsColorInt", "fillColorAsColorInt", "getFillColorTransition", "getFillColorUseTheme", "getFillColorUseTheme$annotations", "getFillColorUseThemeAsExpression", "getFillColorUseThemeAsExpression$annotations", "fillColorUseThemeAsExpression", "getFillEmissiveStrength", "getFillEmissiveStrengthAsExpression", "fillEmissiveStrengthAsExpression", "getFillEmissiveStrengthTransition", "getFillOpacity", "getFillOpacityAsExpression", "fillOpacityAsExpression", "getFillOpacityTransition", "getFillOutlineColor", "getFillOutlineColorAsExpression", "fillOutlineColorAsExpression", "getFillOutlineColorAsColorInt", "fillOutlineColorAsColorInt", "getFillOutlineColorTransition", "getFillOutlineColorUseTheme", "getFillOutlineColorUseTheme$annotations", "getFillOutlineColorUseThemeAsExpression", "getFillOutlineColorUseThemeAsExpression$annotations", "fillOutlineColorUseThemeAsExpression", "getFillPattern", "getFillPatternAsExpression", "fillPatternAsExpression", "getFillPatternCrossFade", "getFillPatternCrossFadeAsExpression", "fillPatternCrossFadeAsExpression", "getFillTranslate", "()Ljava/util/List;", "getFillTranslateAsExpression", "fillTranslateAsExpression", "getFillTranslateTransition", "getFillTranslateAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/FillTranslateAnchor;", "getFillTranslateAnchorAsExpression", "fillTranslateAnchorAsExpression", "getFillTunnelStructureColor", "getFillTunnelStructureColor$annotations", "getFillTunnelStructureColorAsExpression", "getFillTunnelStructureColorAsExpression$annotations", "fillTunnelStructureColorAsExpression", "getFillTunnelStructureColorAsColorInt", "getFillTunnelStructureColorAsColorInt$annotations", "fillTunnelStructureColorAsColorInt", "getFillTunnelStructureColorTransition", "getFillTunnelStructureColorTransition$annotations", "getFillTunnelStructureColorUseTheme", "getFillTunnelStructureColorUseTheme$annotations", "getFillTunnelStructureColorUseThemeAsExpression", "getFillTunnelStructureColorUseThemeAsExpression$annotations", "fillTunnelStructureColorUseThemeAsExpression", "getFillZOffset", "getFillZOffset$annotations", "getFillZOffsetAsExpression", "getFillZOffsetAsExpression$annotations", "fillZOffsetAsExpression", "getFillZOffsetTransition", "getFillZOffsetTransition$annotations", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FillLayer extends Layer implements FillLayerDsl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String layerId;
    private final String sourceId;

    public FillLayer(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.layerId = str;
        this.sourceId = str2;
        setInternalSourceId$extension_style_release(str2);
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillBridgeGuardRailColor$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillBridgeGuardRailColorAsColorInt$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillBridgeGuardRailColorAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillBridgeGuardRailColorTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillBridgeGuardRailColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillBridgeGuardRailColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillConstructBridgeGuardRail$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillConstructBridgeGuardRailAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillElevationReference$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillElevationReferenceAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillOutlineColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillOutlineColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillTunnelStructureColor$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillTunnelStructureColorAsColorInt$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillTunnelStructureColorAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillTunnelStructureColorTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillTunnelStructureColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillTunnelStructureColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillZOffset$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillZOffsetAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillZOffsetTransition$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillAntialias(boolean fillAntialias) {
        setProperty$extension_style_release(new PropertyValue<>("fill-antialias", Boolean.valueOf(fillAntialias)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillBridgeGuardRailColor(int fillBridgeGuardRailColor) {
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR, ColorUtils.INSTANCE.colorIntToRgbaExpression(fillBridgeGuardRailColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillBridgeGuardRailColorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillBridgeGuardRailColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillBridgeGuardRailColorUseTheme(String fillBridgeGuardRailColorUseTheme) {
        fillBridgeGuardRailColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME, fillBridgeGuardRailColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillColor(int fillColor) {
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_COLOR, ColorUtils.INSTANCE.colorIntToRgbaExpression(fillColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillColorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillColorUseTheme(String fillColorUseTheme) {
        fillColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME, fillColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillConstructBridgeGuardRail(boolean fillConstructBridgeGuardRail) {
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL, Boolean.valueOf(fillConstructBridgeGuardRail)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillElevationReference(FillElevationReference fillElevationReference) {
        fillElevationReference.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-elevation-reference", fillElevationReference));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillEmissiveStrength(double fillEmissiveStrength) {
        setProperty$extension_style_release(new PropertyValue<>("fill-emissive-strength", Double.valueOf(fillEmissiveStrength)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillEmissiveStrengthTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillEmissiveStrengthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillOpacity(double fillOpacity) {
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_OPACITY, Double.valueOf(fillOpacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillOpacityTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillOpacityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillOutlineColor(int fillOutlineColor) {
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR, ColorUtils.INSTANCE.colorIntToRgbaExpression(fillOutlineColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillOutlineColorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillOutlineColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillOutlineColorUseTheme(String fillOutlineColorUseTheme) {
        fillOutlineColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME, fillOutlineColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillPattern(String fillPattern) {
        fillPattern.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_PATTERN, fillPattern));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillPatternCrossFade(double fillPatternCrossFade) {
        setProperty$extension_style_release(new PropertyValue<>("fill-pattern-cross-fade", Double.valueOf(fillPatternCrossFade)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillSortKey(double fillSortKey) {
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY, Double.valueOf(fillSortKey)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillTranslate(List<Double> fillTranslate) {
        fillTranslate.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-translate", fillTranslate));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillTranslateAnchor(FillTranslateAnchor fillTranslateAnchor) {
        fillTranslateAnchor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-translate-anchor", fillTranslateAnchor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillTranslateTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillTranslateTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillTunnelStructureColor(int fillTunnelStructureColor) {
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR, ColorUtils.INSTANCE.colorIntToRgbaExpression(fillTunnelStructureColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillTunnelStructureColorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillTunnelStructureColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillTunnelStructureColorUseTheme(String fillTunnelStructureColorUseTheme) {
        fillTunnelStructureColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME, fillTunnelStructureColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillZOffset(double fillZOffset) {
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET, Double.valueOf(fillZOffset)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillZOffsetTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillZOffsetTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer filter(Expression filter) {
        q2.o(filter, "filter", filter, this);
        return this;
    }

    public final Boolean getFillAntialias() {
        return (Boolean) getPropertyValueWithType("fill-antialias", Boolean.class);
    }

    public final Expression getFillAntialiasAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-antialias");
    }

    public final String getFillBridgeGuardRailColor() {
        Expression fillBridgeGuardRailColorAsExpression = getFillBridgeGuardRailColorAsExpression();
        if (fillBridgeGuardRailColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(fillBridgeGuardRailColorAsExpression);
        }
        return null;
    }

    public final Integer getFillBridgeGuardRailColorAsColorInt() {
        Expression fillBridgeGuardRailColorAsExpression = getFillBridgeGuardRailColorAsExpression();
        if (fillBridgeGuardRailColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(fillBridgeGuardRailColorAsExpression);
        }
        return null;
    }

    public final Expression getFillBridgeGuardRailColorAsExpression() {
        return (Expression) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR, Expression.class);
    }

    public final StyleTransition getFillBridgeGuardRailColorTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-bridge-guard-rail-color-transition", StyleTransition.class);
    }

    public final String getFillBridgeGuardRailColorUseTheme() {
        return (String) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME, String.class);
    }

    public final Expression getFillBridgeGuardRailColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME);
    }

    public final String getFillColor() {
        Expression fillColorAsExpression = getFillColorAsExpression();
        if (fillColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(fillColorAsExpression);
        }
        return null;
    }

    public final Integer getFillColorAsColorInt() {
        Expression fillColorAsExpression = getFillColorAsExpression();
        if (fillColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(fillColorAsExpression);
        }
        return null;
    }

    public final Expression getFillColorAsExpression() {
        return (Expression) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_COLOR, Expression.class);
    }

    public final StyleTransition getFillColorTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-color-transition", StyleTransition.class);
    }

    public final String getFillColorUseTheme() {
        return (String) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME, String.class);
    }

    public final Expression getFillColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME);
    }

    public final Boolean getFillConstructBridgeGuardRail() {
        return (Boolean) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL, Boolean.class);
    }

    public final Expression getFillConstructBridgeGuardRailAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL);
    }

    public final FillElevationReference getFillElevationReference() {
        String str = (String) getPropertyValueWithType("fill-elevation-reference", String.class);
        if (str == null) {
            return null;
        }
        FillElevationReference.Companion companion = FillElevationReference.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    public final Expression getFillElevationReferenceAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("fill-elevation-reference", Expression.class);
        if (expression != null) {
            return expression;
        }
        FillElevationReference fillElevationReference = getFillElevationReference();
        if (fillElevationReference != null) {
            return Expression.INSTANCE.literal(fillElevationReference.getValue());
        }
        return null;
    }

    public final Double getFillEmissiveStrength() {
        return (Double) getPropertyValueWithType("fill-emissive-strength", Double.class);
    }

    public final Expression getFillEmissiveStrengthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-emissive-strength");
    }

    public final StyleTransition getFillEmissiveStrengthTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-emissive-strength-transition", StyleTransition.class);
    }

    public final Double getFillOpacity() {
        return (Double) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_OPACITY, Double.class);
    }

    public final Expression getFillOpacityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolygonAnnotationOptions.PROPERTY_FILL_OPACITY);
    }

    public final StyleTransition getFillOpacityTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-opacity-transition", StyleTransition.class);
    }

    public final String getFillOutlineColor() {
        Expression fillOutlineColorAsExpression = getFillOutlineColorAsExpression();
        if (fillOutlineColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(fillOutlineColorAsExpression);
        }
        return null;
    }

    public final Integer getFillOutlineColorAsColorInt() {
        Expression fillOutlineColorAsExpression = getFillOutlineColorAsExpression();
        if (fillOutlineColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(fillOutlineColorAsExpression);
        }
        return null;
    }

    public final Expression getFillOutlineColorAsExpression() {
        return (Expression) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR, Expression.class);
    }

    public final StyleTransition getFillOutlineColorTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-outline-color-transition", StyleTransition.class);
    }

    public final String getFillOutlineColorUseTheme() {
        return (String) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME, String.class);
    }

    public final Expression getFillOutlineColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME);
    }

    public final String getFillPattern() {
        return (String) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_PATTERN, String.class);
    }

    public final Expression getFillPatternAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolygonAnnotationOptions.PROPERTY_FILL_PATTERN);
    }

    public final Double getFillPatternCrossFade() {
        return (Double) getPropertyValueWithType("fill-pattern-cross-fade", Double.class);
    }

    public final Expression getFillPatternCrossFadeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-pattern-cross-fade");
    }

    public final Double getFillSortKey() {
        return (Double) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY, Double.class);
    }

    public final Expression getFillSortKeyAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY);
    }

    public final List<Double> getFillTranslate() {
        return (List) getPropertyValueWithType("fill-translate", List.class);
    }

    public final FillTranslateAnchor getFillTranslateAnchor() {
        String str = (String) getPropertyValueWithType("fill-translate-anchor", String.class);
        if (str == null) {
            return null;
        }
        FillTranslateAnchor.Companion companion = FillTranslateAnchor.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    public final Expression getFillTranslateAnchorAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("fill-translate-anchor", Expression.class);
        if (expression != null) {
            return expression;
        }
        FillTranslateAnchor fillTranslateAnchor = getFillTranslateAnchor();
        if (fillTranslateAnchor != null) {
            return Expression.INSTANCE.literal(fillTranslateAnchor.getValue());
        }
        return null;
    }

    public final Expression getFillTranslateAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-translate");
    }

    public final StyleTransition getFillTranslateTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-translate-transition", StyleTransition.class);
    }

    public final String getFillTunnelStructureColor() {
        Expression fillTunnelStructureColorAsExpression = getFillTunnelStructureColorAsExpression();
        if (fillTunnelStructureColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(fillTunnelStructureColorAsExpression);
        }
        return null;
    }

    public final Integer getFillTunnelStructureColorAsColorInt() {
        Expression fillTunnelStructureColorAsExpression = getFillTunnelStructureColorAsExpression();
        if (fillTunnelStructureColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(fillTunnelStructureColorAsExpression);
        }
        return null;
    }

    public final Expression getFillTunnelStructureColorAsExpression() {
        return (Expression) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR, Expression.class);
    }

    public final StyleTransition getFillTunnelStructureColorTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-tunnel-structure-color-transition", StyleTransition.class);
    }

    public final String getFillTunnelStructureColorUseTheme() {
        return (String) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME, String.class);
    }

    public final Expression getFillTunnelStructureColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME);
    }

    public final Double getFillZOffset() {
        return (Double) getPropertyValueWithType(PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET, Double.class);
    }

    public final Expression getFillZOffsetAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET);
    }

    public final StyleTransition getFillZOffsetTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-z-offset-transition", StyleTransition.class);
    }

    public final Expression getFilter() {
        return (Expression) getPropertyValueWithType("filter", Expression.class);
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
        return "fill";
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
    public FillLayer maxZoom(double maxZoom) {
        setProperty$extension_style_release(new PropertyValue<>("maxzoom", Double.valueOf(maxZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public FillLayer minZoom(double minZoom) {
        setProperty$extension_style_release(new PropertyValue<>("minzoom", Double.valueOf(minZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public FillLayer slot(String slot) {
        slot.getClass();
        setProperty$extension_style_release(new PropertyValue<>("slot", slot));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer sourceLayer(String sourceLayer) {
        sourceLayer.getClass();
        setProperty$extension_style_release(new PropertyValue<>("source-layer", sourceLayer));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public FillLayer visibility(Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b'\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00118GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\nR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00198FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0002\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010 \u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\u0002\u001a\u0004\b\"\u0010\nR\u0013\u0010#\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b$\u0010\u000fR\u0013\u0010%\u001a\u0004\u0018\u00010\u00118G¢\u0006\u0006\u001a\u0004\b&\u0010\u0014R\u0013\u0010'\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\nR\u0013\u0010)\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b*\u0010\u001cR\u001c\u0010+\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0002\u001a\u0004\b-\u0010\u000fR\u001c\u0010.\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010\u0002\u001a\u0004\b0\u0010\nR\u001c\u00101\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b2\u0010\u0002\u001a\u0004\b3\u0010\u0006R\u001c\u00104\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u0010\u0002\u001a\u0004\b6\u0010\nR\u001c\u00107\u001a\u0004\u0018\u0001088FX\u0087\u0004¢\u0006\f\u0012\u0004\b9\u0010\u0002\u001a\u0004\b:\u0010;R\u001c\u0010<\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b=\u0010\u0002\u001a\u0004\b>\u0010\nR\u0013\u0010?\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0013\u0010C\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bD\u0010\nR\u0013\u0010E\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bF\u0010\u001cR\u0013\u0010G\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bH\u0010BR\u0013\u0010I\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bJ\u0010\nR\u0013\u0010K\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bL\u0010\u001cR\u0013\u0010M\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bN\u0010\u000fR\u0013\u0010O\u001a\u0004\u0018\u00010\u00118G¢\u0006\u0006\u001a\u0004\bP\u0010\u0014R\u0013\u0010Q\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bR\u0010\nR\u0013\u0010S\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bT\u0010\u001cR\u001c\u0010U\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\bV\u0010\u0002\u001a\u0004\bW\u0010\u000fR\u001c\u0010X\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bY\u0010\u0002\u001a\u0004\bZ\u0010\nR\u0013\u0010[\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\\\u0010\u000fR\u0013\u0010]\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b^\u0010\nR\u0013\u0010_\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\b`\u0010BR\u0013\u0010a\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bb\u0010\nR\u0013\u0010c\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bd\u0010BR\u0013\u0010e\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bf\u0010\nR\u0019\u0010g\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010h8F¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0013\u0010k\u001a\u0004\u0018\u00010l8F¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0013\u0010o\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bp\u0010\nR\u0013\u0010q\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\br\u0010\nR\u0013\u0010s\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bt\u0010\u001cR\u001c\u0010u\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\bv\u0010\u0002\u001a\u0004\bw\u0010\u000fR\u001c\u0010x\u001a\u0004\u0018\u00010\u00118GX\u0087\u0004¢\u0006\f\u0012\u0004\by\u0010\u0002\u001a\u0004\bz\u0010\u0014R\u001c\u0010{\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b|\u0010\u0002\u001a\u0004\b}\u0010\nR\u001d\u0010~\u001a\u0004\u0018\u00010\u00198FX\u0087\u0004¢\u0006\r\u0012\u0004\b\u007f\u0010\u0002\u001a\u0005\b\u0080\u0001\u0010\u001cR\u001f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0082\u0001\u0010\u0002\u001a\u0005\b\u0083\u0001\u0010\u000fR\u001f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0085\u0001\u0010\u0002\u001a\u0005\b\u0086\u0001\u0010\nR\u001f\u0010\u0087\u0001\u001a\u0004\u0018\u00010@8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0088\u0001\u0010\u0002\u001a\u0005\b\u0089\u0001\u0010BR\u001f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008b\u0001\u0010\u0002\u001a\u0005\b\u008c\u0001\u0010\nR\u001f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00198FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008e\u0001\u0010\u0002\u001a\u0005\b\u008f\u0001\u0010\u001cR\u0015\u0010\u0090\u0001\u001a\u0004\u0018\u00010@8F¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010BR\u0015\u0010\u0092\u0001\u001a\u0004\u0018\u00010@8F¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010BR\u0017\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u00018F¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001¨\u0006\u0098\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/FillLayer$Companion;", "", "()V", "defaultFillAntialias", "", "getDefaultFillAntialias", "()Ljava/lang/Boolean;", "defaultFillAntialiasAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getDefaultFillAntialiasAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "defaultFillBridgeGuardRailColor", "", "getDefaultFillBridgeGuardRailColor$annotations", "getDefaultFillBridgeGuardRailColor", "()Ljava/lang/String;", "defaultFillBridgeGuardRailColorAsColorInt", "", "getDefaultFillBridgeGuardRailColorAsColorInt$annotations", "getDefaultFillBridgeGuardRailColorAsColorInt", "()Ljava/lang/Integer;", "defaultFillBridgeGuardRailColorAsExpression", "getDefaultFillBridgeGuardRailColorAsExpression$annotations", "getDefaultFillBridgeGuardRailColorAsExpression", "defaultFillBridgeGuardRailColorTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getDefaultFillBridgeGuardRailColorTransition$annotations", "getDefaultFillBridgeGuardRailColorTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "defaultFillBridgeGuardRailColorUseTheme", "getDefaultFillBridgeGuardRailColorUseTheme$annotations", "getDefaultFillBridgeGuardRailColorUseTheme", "defaultFillBridgeGuardRailColorUseThemeAsExpression", "getDefaultFillBridgeGuardRailColorUseThemeAsExpression$annotations", "getDefaultFillBridgeGuardRailColorUseThemeAsExpression", "defaultFillColor", "getDefaultFillColor", "defaultFillColorAsColorInt", "getDefaultFillColorAsColorInt", "defaultFillColorAsExpression", "getDefaultFillColorAsExpression", "defaultFillColorTransition", "getDefaultFillColorTransition", "defaultFillColorUseTheme", "getDefaultFillColorUseTheme$annotations", "getDefaultFillColorUseTheme", "defaultFillColorUseThemeAsExpression", "getDefaultFillColorUseThemeAsExpression$annotations", "getDefaultFillColorUseThemeAsExpression", "defaultFillConstructBridgeGuardRail", "getDefaultFillConstructBridgeGuardRail$annotations", "getDefaultFillConstructBridgeGuardRail", "defaultFillConstructBridgeGuardRailAsExpression", "getDefaultFillConstructBridgeGuardRailAsExpression$annotations", "getDefaultFillConstructBridgeGuardRailAsExpression", "defaultFillElevationReference", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillElevationReference;", "getDefaultFillElevationReference$annotations", "getDefaultFillElevationReference", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/FillElevationReference;", "defaultFillElevationReferenceAsExpression", "getDefaultFillElevationReferenceAsExpression$annotations", "getDefaultFillElevationReferenceAsExpression", "defaultFillEmissiveStrength", "", "getDefaultFillEmissiveStrength", "()Ljava/lang/Double;", "defaultFillEmissiveStrengthAsExpression", "getDefaultFillEmissiveStrengthAsExpression", "defaultFillEmissiveStrengthTransition", "getDefaultFillEmissiveStrengthTransition", "defaultFillOpacity", "getDefaultFillOpacity", "defaultFillOpacityAsExpression", "getDefaultFillOpacityAsExpression", "defaultFillOpacityTransition", "getDefaultFillOpacityTransition", "defaultFillOutlineColor", "getDefaultFillOutlineColor", "defaultFillOutlineColorAsColorInt", "getDefaultFillOutlineColorAsColorInt", "defaultFillOutlineColorAsExpression", "getDefaultFillOutlineColorAsExpression", "defaultFillOutlineColorTransition", "getDefaultFillOutlineColorTransition", "defaultFillOutlineColorUseTheme", "getDefaultFillOutlineColorUseTheme$annotations", "getDefaultFillOutlineColorUseTheme", "defaultFillOutlineColorUseThemeAsExpression", "getDefaultFillOutlineColorUseThemeAsExpression$annotations", "getDefaultFillOutlineColorUseThemeAsExpression", "defaultFillPattern", "getDefaultFillPattern", "defaultFillPatternAsExpression", "getDefaultFillPatternAsExpression", "defaultFillPatternCrossFade", "getDefaultFillPatternCrossFade", "defaultFillPatternCrossFadeAsExpression", "getDefaultFillPatternCrossFadeAsExpression", "defaultFillSortKey", "getDefaultFillSortKey", "defaultFillSortKeyAsExpression", "getDefaultFillSortKeyAsExpression", "defaultFillTranslate", "", "getDefaultFillTranslate", "()Ljava/util/List;", "defaultFillTranslateAnchor", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillTranslateAnchor;", "getDefaultFillTranslateAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/FillTranslateAnchor;", "defaultFillTranslateAnchorAsExpression", "getDefaultFillTranslateAnchorAsExpression", "defaultFillTranslateAsExpression", "getDefaultFillTranslateAsExpression", "defaultFillTranslateTransition", "getDefaultFillTranslateTransition", "defaultFillTunnelStructureColor", "getDefaultFillTunnelStructureColor$annotations", "getDefaultFillTunnelStructureColor", "defaultFillTunnelStructureColorAsColorInt", "getDefaultFillTunnelStructureColorAsColorInt$annotations", "getDefaultFillTunnelStructureColorAsColorInt", "defaultFillTunnelStructureColorAsExpression", "getDefaultFillTunnelStructureColorAsExpression$annotations", "getDefaultFillTunnelStructureColorAsExpression", "defaultFillTunnelStructureColorTransition", "getDefaultFillTunnelStructureColorTransition$annotations", "getDefaultFillTunnelStructureColorTransition", "defaultFillTunnelStructureColorUseTheme", "getDefaultFillTunnelStructureColorUseTheme$annotations", "getDefaultFillTunnelStructureColorUseTheme", "defaultFillTunnelStructureColorUseThemeAsExpression", "getDefaultFillTunnelStructureColorUseThemeAsExpression$annotations", "getDefaultFillTunnelStructureColorUseThemeAsExpression", "defaultFillZOffset", "getDefaultFillZOffset$annotations", "getDefaultFillZOffset", "defaultFillZOffsetAsExpression", "getDefaultFillZOffsetAsExpression$annotations", "getDefaultFillZOffsetAsExpression", "defaultFillZOffsetTransition", "getDefaultFillZOffsetTransition$annotations", "getDefaultFillZOffsetTransition", "defaultMaxZoom", "getDefaultMaxZoom", "defaultMinZoom", "getDefaultMinZoom", "defaultVisibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getDefaultVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillBridgeGuardRailColor$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillBridgeGuardRailColorAsColorInt$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillBridgeGuardRailColorAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillBridgeGuardRailColorTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillBridgeGuardRailColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillBridgeGuardRailColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillConstructBridgeGuardRail$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillConstructBridgeGuardRailAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillElevationReference$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillElevationReferenceAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillOutlineColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillOutlineColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillTunnelStructureColor$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillTunnelStructureColorAsColorInt$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillTunnelStructureColorAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillTunnelStructureColorTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillTunnelStructureColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillTunnelStructureColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillZOffset$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillZOffsetAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillZOffsetTransition$annotations() {
        }

        public final Boolean getDefaultFillAntialias() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-antialias");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Boolean.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Boolean) objUnwrap;
        }

        public final Expression getDefaultFillAntialiasAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-antialias");
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
            Boolean defaultFillAntialias = getDefaultFillAntialias();
            if (defaultFillAntialias == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillAntialias.booleanValue());
        }

        public final String getDefaultFillBridgeGuardRailColor() {
            Expression defaultFillBridgeGuardRailColorAsExpression = getDefaultFillBridgeGuardRailColorAsExpression();
            if (defaultFillBridgeGuardRailColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultFillBridgeGuardRailColorAsExpression);
            }
            return null;
        }

        public final Integer getDefaultFillBridgeGuardRailColorAsColorInt() {
            Expression defaultFillBridgeGuardRailColorAsExpression = getDefaultFillBridgeGuardRailColorAsExpression();
            if (defaultFillBridgeGuardRailColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultFillBridgeGuardRailColorAsExpression);
            }
            return null;
        }

        public final Expression getDefaultFillBridgeGuardRailColorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR);
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
            return null;
        }

        public final StyleTransition getDefaultFillBridgeGuardRailColorTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-bridge-guard-rail-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultFillBridgeGuardRailColorUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultFillBridgeGuardRailColorUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME);
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
            String defaultFillBridgeGuardRailColorUseTheme = getDefaultFillBridgeGuardRailColorUseTheme();
            if (defaultFillBridgeGuardRailColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultFillBridgeGuardRailColorUseTheme);
            }
            return null;
        }

        public final String getDefaultFillColor() {
            Expression defaultFillColorAsExpression = getDefaultFillColorAsExpression();
            if (defaultFillColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultFillColorAsExpression);
            }
            return null;
        }

        public final Integer getDefaultFillColorAsColorInt() {
            Expression defaultFillColorAsExpression = getDefaultFillColorAsExpression();
            if (defaultFillColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultFillColorAsExpression);
            }
            return null;
        }

        public final Expression getDefaultFillColorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_COLOR);
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
            return null;
        }

        public final StyleTransition getDefaultFillColorTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultFillColorUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultFillColorUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME);
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
            String defaultFillColorUseTheme = getDefaultFillColorUseTheme();
            if (defaultFillColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultFillColorUseTheme);
            }
            return null;
        }

        public final Boolean getDefaultFillConstructBridgeGuardRail() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Boolean.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Boolean) objUnwrap;
        }

        public final Expression getDefaultFillConstructBridgeGuardRailAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL);
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
            Boolean defaultFillConstructBridgeGuardRail = getDefaultFillConstructBridgeGuardRail();
            if (defaultFillConstructBridgeGuardRail == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillConstructBridgeGuardRail.booleanValue());
        }

        public final FillElevationReference getDefaultFillElevationReference() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-elevation-reference");
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
            FillElevationReference.Companion companion = FillElevationReference.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        public final Expression getDefaultFillElevationReferenceAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-elevation-reference");
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
            FillElevationReference defaultFillElevationReference = getDefaultFillElevationReference();
            if (defaultFillElevationReference != null) {
                return Expression.INSTANCE.literal(defaultFillElevationReference.getValue());
            }
            return null;
        }

        public final Double getDefaultFillEmissiveStrength() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-emissive-strength");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultFillEmissiveStrengthAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-emissive-strength");
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
            Double defaultFillEmissiveStrength = getDefaultFillEmissiveStrength();
            if (defaultFillEmissiveStrength == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillEmissiveStrength.doubleValue());
        }

        public final StyleTransition getDefaultFillEmissiveStrengthTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-emissive-strength-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultFillOpacity() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_OPACITY);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultFillOpacityAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_OPACITY);
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
            Double defaultFillOpacity = getDefaultFillOpacity();
            if (defaultFillOpacity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillOpacity.doubleValue());
        }

        public final StyleTransition getDefaultFillOpacityTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-opacity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultFillOutlineColor() {
            Expression defaultFillOutlineColorAsExpression = getDefaultFillOutlineColorAsExpression();
            if (defaultFillOutlineColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultFillOutlineColorAsExpression);
            }
            return null;
        }

        public final Integer getDefaultFillOutlineColorAsColorInt() {
            Expression defaultFillOutlineColorAsExpression = getDefaultFillOutlineColorAsExpression();
            if (defaultFillOutlineColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultFillOutlineColorAsExpression);
            }
            return null;
        }

        public final Expression getDefaultFillOutlineColorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR);
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
            return null;
        }

        public final StyleTransition getDefaultFillOutlineColorTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-outline-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultFillOutlineColorUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultFillOutlineColorUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME);
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
            String defaultFillOutlineColorUseTheme = getDefaultFillOutlineColorUseTheme();
            if (defaultFillOutlineColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultFillOutlineColorUseTheme);
            }
            return null;
        }

        public final String getDefaultFillPattern() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_PATTERN);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultFillPatternAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_PATTERN);
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
            String defaultFillPattern = getDefaultFillPattern();
            if (defaultFillPattern != null) {
                return Expression.INSTANCE.literal(defaultFillPattern);
            }
            return null;
        }

        public final Double getDefaultFillPatternCrossFade() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-pattern-cross-fade");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultFillPatternCrossFadeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-pattern-cross-fade");
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
            Double defaultFillPatternCrossFade = getDefaultFillPatternCrossFade();
            if (defaultFillPatternCrossFade == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillPatternCrossFade.doubleValue());
        }

        public final Double getDefaultFillSortKey() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultFillSortKeyAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY);
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
            Double defaultFillSortKey = getDefaultFillSortKey();
            if (defaultFillSortKey == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillSortKey.doubleValue());
        }

        public final List<Double> getDefaultFillTranslate() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-translate");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (List) objUnwrap;
        }

        public final FillTranslateAnchor getDefaultFillTranslateAnchor() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-translate-anchor");
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
            FillTranslateAnchor.Companion companion = FillTranslateAnchor.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        public final Expression getDefaultFillTranslateAnchorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-translate-anchor");
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
            FillTranslateAnchor defaultFillTranslateAnchor = getDefaultFillTranslateAnchor();
            if (defaultFillTranslateAnchor != null) {
                return Expression.INSTANCE.literal(defaultFillTranslateAnchor.getValue());
            }
            return null;
        }

        public final Expression getDefaultFillTranslateAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-translate");
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
            List<Double> defaultFillTranslate = getDefaultFillTranslate();
            if (defaultFillTranslate != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultFillTranslate);
            }
            return null;
        }

        public final StyleTransition getDefaultFillTranslateTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-translate-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultFillTunnelStructureColor() {
            Expression defaultFillTunnelStructureColorAsExpression = getDefaultFillTunnelStructureColorAsExpression();
            if (defaultFillTunnelStructureColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultFillTunnelStructureColorAsExpression);
            }
            return null;
        }

        public final Integer getDefaultFillTunnelStructureColorAsColorInt() {
            Expression defaultFillTunnelStructureColorAsExpression = getDefaultFillTunnelStructureColorAsExpression();
            if (defaultFillTunnelStructureColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultFillTunnelStructureColorAsExpression);
            }
            return null;
        }

        public final Expression getDefaultFillTunnelStructureColorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR);
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
            return null;
        }

        public final StyleTransition getDefaultFillTunnelStructureColorTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-tunnel-structure-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultFillTunnelStructureColorUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultFillTunnelStructureColorUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME);
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
            String defaultFillTunnelStructureColorUseTheme = getDefaultFillTunnelStructureColorUseTheme();
            if (defaultFillTunnelStructureColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultFillTunnelStructureColorUseTheme);
            }
            return null;
        }

        public final Double getDefaultFillZOffset() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultFillZOffsetAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET);
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
            Double defaultFillZOffset = getDefaultFillZOffset();
            if (defaultFillZOffset == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillZOffset.doubleValue());
        }

        public final StyleTransition getDefaultFillZOffsetTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "fill-z-offset-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultMaxZoom() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "maxzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "minzoom");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Visibility getDefaultVisibility() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill", "visibility");
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

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillBridgeGuardRailColorUseTheme(Expression fillBridgeGuardRailColorUseTheme) {
        q2.o(fillBridgeGuardRailColorUseTheme, PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME, fillBridgeGuardRailColorUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillColorUseTheme(Expression fillColorUseTheme) {
        q2.o(fillColorUseTheme, PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME, fillColorUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillElevationReference(Expression fillElevationReference) {
        q2.o(fillElevationReference, "fill-elevation-reference", fillElevationReference, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillOutlineColorUseTheme(Expression fillOutlineColorUseTheme) {
        q2.o(fillOutlineColorUseTheme, PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME, fillOutlineColorUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillPattern(Expression fillPattern) {
        q2.o(fillPattern, PolygonAnnotationOptions.PROPERTY_FILL_PATTERN, fillPattern, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillTranslate(Expression fillTranslate) {
        q2.o(fillTranslate, "fill-translate", fillTranslate, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillTranslateAnchor(Expression fillTranslateAnchor) {
        q2.o(fillTranslateAnchor, "fill-translate-anchor", fillTranslateAnchor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillTunnelStructureColorUseTheme(Expression fillTunnelStructureColorUseTheme) {
        q2.o(fillTunnelStructureColorUseTheme, PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME, fillTunnelStructureColorUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillAntialias(Expression fillAntialias) {
        q2.o(fillAntialias, "fill-antialias", fillAntialias, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillConstructBridgeGuardRail(Expression fillConstructBridgeGuardRail) {
        q2.o(fillConstructBridgeGuardRail, PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL, fillConstructBridgeGuardRail, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillEmissiveStrength(Expression fillEmissiveStrength) {
        q2.o(fillEmissiveStrength, "fill-emissive-strength", fillEmissiveStrength, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillOpacity(Expression fillOpacity) {
        q2.o(fillOpacity, PolygonAnnotationOptions.PROPERTY_FILL_OPACITY, fillOpacity, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillPatternCrossFade(Expression fillPatternCrossFade) {
        q2.o(fillPatternCrossFade, "fill-pattern-cross-fade", fillPatternCrossFade, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillSortKey(Expression fillSortKey) {
        q2.o(fillSortKey, PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY, fillSortKey, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillZOffset(Expression fillZOffset) {
        q2.o(fillZOffset, PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET, fillZOffset, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public FillLayer visibility(Expression visibility) {
        q2.o(visibility, "visibility", visibility, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillBridgeGuardRailColor(Expression fillBridgeGuardRailColor) {
        q2.o(fillBridgeGuardRailColor, PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR, fillBridgeGuardRailColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillColor(Expression fillColor) {
        q2.o(fillColor, PolygonAnnotationOptions.PROPERTY_FILL_COLOR, fillColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillOutlineColor(Expression fillOutlineColor) {
        q2.o(fillOutlineColor, PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR, fillOutlineColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillTunnelStructureColor(Expression fillTunnelStructureColor) {
        q2.o(fillTunnelStructureColor, PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR, fillTunnelStructureColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillBridgeGuardRailColor(String fillBridgeGuardRailColor) {
        fillBridgeGuardRailColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR, fillBridgeGuardRailColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillBridgeGuardRailColorTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-bridge-guard-rail-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillColor(String fillColor) {
        fillColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_COLOR, fillColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillColorTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillEmissiveStrengthTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-emissive-strength-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillOpacityTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-opacity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillOutlineColor(String fillOutlineColor) {
        fillOutlineColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR, fillOutlineColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillOutlineColorTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-outline-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    public FillLayer fillTranslateTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-translate-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillTunnelStructureColor(String fillTunnelStructureColor) {
        fillTunnelStructureColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR, fillTunnelStructureColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillTunnelStructureColorTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-tunnel-structure-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillLayerDsl
    @MapboxExperimental
    public FillLayer fillZOffsetTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-z-offset-transition", options));
        return this;
    }
}
