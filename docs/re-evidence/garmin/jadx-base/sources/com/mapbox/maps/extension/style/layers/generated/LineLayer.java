package com.mapbox.maps.extension.style.layers.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.StyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.LineCap;
import com.mapbox.maps.extension.style.layers.properties.generated.LineElevationReference;
import com.mapbox.maps.extension.style.layers.properties.generated.LineJoin;
import com.mapbox.maps.extension.style.layers.properties.generated.LineTranslateAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.LineWidthUnit;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.p;
import com.mapbox.maps.plugin.annotation.generated.PolylineAnnotationOptions;
import e23.l;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import r1.q2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0003\b¯\u0001\b\u0007\u0018\u0000 ý\u00012\u00020\u00012\u00020\u0002:\u0002ý\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\rJ\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0018\u0010\rJ\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u001a\u0010\rJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\rJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u0013J\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\rJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010\u0013J\u0017\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\rJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010\u0013J\u0017\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\rJ\u0017\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"H\u0017¢\u0006\u0004\b#\u0010$J\u0017\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u000bH\u0017¢\u0006\u0004\b#\u0010\rJ\u0017\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0011H\u0017¢\u0006\u0004\b%\u0010\u0013J\u0017\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u000bH\u0017¢\u0006\u0004\b%\u0010\rJ\u0017\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0011H\u0016¢\u0006\u0004\b&\u0010\u0013J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u000bH\u0016¢\u0006\u0004\b&\u0010\rJ\u0017\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J#\u0010)\u001a\u00020\u00002\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+H\u0016¢\u0006\u0004\b)\u0010/J\u0017\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0003H\u0016¢\u0006\u0004\b0\u0010\tJ\u0017\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u000bH\u0016¢\u0006\u0004\b0\u0010\rJ\u0019\u00100\u001a\u00020\u00002\b\b\u0001\u00100\u001a\u000201H\u0016¢\u0006\u0004\b0\u00102J\u0017\u00103\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b3\u0010*J#\u00103\u001a\u00020\u00002\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+H\u0016¢\u0006\u0004\b3\u0010/J\u0017\u00104\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0003H\u0017¢\u0006\u0004\b4\u0010\tJ\u0017\u00104\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u000bH\u0017¢\u0006\u0004\b4\u0010\rJ\u0017\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0011H\u0016¢\u0006\u0004\b5\u0010\u0013J\u0017\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u000bH\u0016¢\u0006\u0004\b5\u0010\rJ\u0017\u00106\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b6\u0010*J#\u00106\u001a\u00020\u00002\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+H\u0016¢\u0006\u0004\b6\u0010/J\u0017\u00107\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0003H\u0016¢\u0006\u0004\b7\u0010\tJ\u0017\u00107\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u000bH\u0016¢\u0006\u0004\b7\u0010\rJ\u0019\u00107\u001a\u00020\u00002\b\b\u0001\u00107\u001a\u000201H\u0016¢\u0006\u0004\b7\u00102J\u0017\u00108\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b8\u0010*J#\u00108\u001a\u00020\u00002\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+H\u0016¢\u0006\u0004\b8\u0010/J\u0017\u00109\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u0003H\u0017¢\u0006\u0004\b9\u0010\tJ\u0017\u00109\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u000bH\u0017¢\u0006\u0004\b9\u0010\rJ\u001d\u0010;\u001a\u00020\u00002\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00110:H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010;\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u000bH\u0016¢\u0006\u0004\b;\u0010\rJ\u0017\u0010=\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u0011H\u0016¢\u0006\u0004\b=\u0010\u0013J\u0017\u0010=\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u000bH\u0016¢\u0006\u0004\b=\u0010\rJ\u0017\u0010>\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b>\u0010*J#\u0010>\u001a\u00020\u00002\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+H\u0016¢\u0006\u0004\b>\u0010/J\u0017\u0010?\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u0011H\u0016¢\u0006\u0004\b?\u0010\u0013J\u0017\u0010?\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u000bH\u0016¢\u0006\u0004\b?\u0010\rJ\u0017\u0010@\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b@\u0010*J#\u0010@\u001a\u00020\u00002\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+H\u0016¢\u0006\u0004\b@\u0010/J\u0017\u0010A\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u0011H\u0016¢\u0006\u0004\bA\u0010\u0013J\u0017\u0010A\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u000bH\u0016¢\u0006\u0004\bA\u0010\rJ\u0017\u0010B\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\bB\u0010*J#\u0010B\u001a\u00020\u00002\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+H\u0016¢\u0006\u0004\bB\u0010/J\u0017\u0010C\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u000bH\u0016¢\u0006\u0004\bC\u0010\rJ\u0017\u0010D\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u0003H\u0017¢\u0006\u0004\bD\u0010\tJ\u0017\u0010D\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u000bH\u0017¢\u0006\u0004\bD\u0010\rJ\u0017\u0010E\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u0011H\u0016¢\u0006\u0004\bE\u0010\u0013J\u0017\u0010E\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u000bH\u0016¢\u0006\u0004\bE\u0010\rJ\u0017\u0010F\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\bF\u0010*J#\u0010F\u001a\u00020\u00002\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+H\u0016¢\u0006\u0004\bF\u0010/J\u0017\u0010G\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\u0011H\u0016¢\u0006\u0004\bG\u0010\u0013J\u0017\u0010G\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\u000bH\u0016¢\u0006\u0004\bG\u0010\rJ\u0017\u0010H\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\bH\u0010*J#\u0010H\u001a\u00020\u00002\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+H\u0016¢\u0006\u0004\bH\u0010/J\u0017\u0010I\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u0011H\u0016¢\u0006\u0004\bI\u0010\u0013J\u0017\u0010I\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u000bH\u0016¢\u0006\u0004\bI\u0010\rJ\u0017\u0010J\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\bJ\u0010*J#\u0010J\u001a\u00020\u00002\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+H\u0016¢\u0006\u0004\bJ\u0010/J\u0017\u0010K\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u0003H\u0016¢\u0006\u0004\bK\u0010\tJ\u0017\u0010K\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u000bH\u0016¢\u0006\u0004\bK\u0010\rJ\u0017\u0010L\u001a\u00020\u00002\u0006\u0010L\u001a\u00020\u0011H\u0016¢\u0006\u0004\bL\u0010\u0013J\u0017\u0010L\u001a\u00020\u00002\u0006\u0010L\u001a\u00020\u000bH\u0016¢\u0006\u0004\bL\u0010\rJ\u001d\u0010M\u001a\u00020\u00002\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00110:H\u0016¢\u0006\u0004\bM\u0010<J\u0017\u0010M\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u000bH\u0016¢\u0006\u0004\bM\u0010\rJ\u0017\u0010N\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\bN\u0010*J#\u0010N\u001a\u00020\u00002\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+H\u0016¢\u0006\u0004\bN\u0010/J\u0017\u0010P\u001a\u00020\u00002\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010P\u001a\u00020\u00002\u0006\u0010P\u001a\u00020\u000bH\u0016¢\u0006\u0004\bP\u0010\rJ\u0017\u0010R\u001a\u00020\u00002\u0006\u0010R\u001a\u00020\u0003H\u0017¢\u0006\u0004\bR\u0010\tJ\u0017\u0010R\u001a\u00020\u00002\u0006\u0010R\u001a\u00020\u000bH\u0017¢\u0006\u0004\bR\u0010\rJ\u0019\u0010R\u001a\u00020\u00002\b\b\u0001\u0010R\u001a\u000201H\u0017¢\u0006\u0004\bR\u00102J\u0017\u0010S\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'H\u0017¢\u0006\u0004\bS\u0010*J#\u0010S\u001a\u00020\u00002\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+H\u0017¢\u0006\u0004\bS\u0010/J\u0017\u0010T\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\u0003H\u0017¢\u0006\u0004\bT\u0010\tJ\u0017\u0010T\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\u000bH\u0017¢\u0006\u0004\bT\u0010\rJ\u001d\u0010U\u001a\u00020\u00002\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00110:H\u0017¢\u0006\u0004\bU\u0010<J\u0017\u0010U\u001a\u00020\u00002\u0006\u0010U\u001a\u00020\u000bH\u0017¢\u0006\u0004\bU\u0010\rJ\u001d\u0010V\u001a\u00020\u00002\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00110:H\u0016¢\u0006\u0004\bV\u0010<J\u0017\u0010V\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u000bH\u0016¢\u0006\u0004\bV\u0010\rJ\u0017\u0010W\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u0011H\u0016¢\u0006\u0004\bW\u0010\u0013J\u0017\u0010W\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u000bH\u0016¢\u0006\u0004\bW\u0010\rJ\u0017\u0010X\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\bX\u0010*J#\u0010X\u001a\u00020\u00002\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+H\u0016¢\u0006\u0004\bX\u0010/J\u000f\u0010[\u001a\u00020\u0003H\u0010¢\u0006\u0004\bY\u0010ZR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\\\u001a\u0004\b]\u0010ZR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\\\u001a\u0004\b^\u0010ZR\u0013\u0010\b\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b_\u0010ZR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010ZR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0016\u0010f\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010bR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010hR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0013\u0010m\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bl\u0010bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\f\u0012\u0004\bo\u0010p\u001a\u0004\bn\u0010hR\u001c\u0010s\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\br\u0010p\u001a\u0004\bq\u0010bR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198FX\u0087\u0004¢\u0006\f\u0012\u0004\bv\u0010p\u001a\u0004\bt\u0010uR\u001c\u0010y\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bx\u0010p\u001a\u0004\bw\u0010bR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0013\u0010}\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b|\u0010bR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b~\u0010hR\u0014\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u007f\u0010bR\u0014\u0010 \u001a\u0004\u0018\u00010\u00118F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010hR\u0015\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010bR\u0014\u0010!\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010hR\u0015\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010bR\u001f\u0010#\u001a\u0004\u0018\u00010\"8FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b\u0089\u0001\u0010p\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008b\u0001\u0010p\u001a\u0005\b\u008a\u0001\u0010bR\u001e\u0010%\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008e\u0001\u0010p\u001a\u0005\b\u008d\u0001\u0010hR\u001f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0090\u0001\u0010p\u001a\u0005\b\u008f\u0001\u0010bR\u0014\u0010&\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010hR\u0015\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010bR\u0015\u0010)\u001a\u0004\u0018\u00010'8F¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0014\u00100\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010ZR\u0015\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010bR\u0016\u0010\u009c\u0001\u001a\u0004\u0018\u0001018G¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0015\u00103\u001a\u0004\u0018\u00010'8F¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u0096\u0001R\u001e\u00104\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u009f\u0001\u0010p\u001a\u0005\b\u009e\u0001\u0010ZR\u001f\u0010¢\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¡\u0001\u0010p\u001a\u0005\b \u0001\u0010bR\u0014\u00105\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0007\u001a\u0005\b£\u0001\u0010hR\u0015\u0010¥\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010bR\u0015\u00106\u001a\u0004\u0018\u00010'8F¢\u0006\b\u001a\u0006\b¦\u0001\u0010\u0096\u0001R\u0014\u00107\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0007\u001a\u0005\b§\u0001\u0010ZR\u0015\u0010©\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010bR\u0016\u0010«\u0001\u001a\u0004\u0018\u0001018G¢\u0006\b\u001a\u0006\bª\u0001\u0010\u009b\u0001R\u0015\u00108\u001a\u0004\u0018\u00010'8F¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u0096\u0001R\u001e\u00109\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b®\u0001\u0010p\u001a\u0005\b\u00ad\u0001\u0010ZR\u001f\u0010±\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b°\u0001\u0010p\u001a\u0005\b¯\u0001\u0010bR\u001b\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010:8F¢\u0006\b\u001a\u0006\b²\u0001\u0010³\u0001R\u0015\u0010µ\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b´\u0001\u0010bR\u0014\u0010=\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010hR\u0015\u0010¸\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b·\u0001\u0010bR\u0015\u0010>\u001a\u0004\u0018\u00010'8F¢\u0006\b\u001a\u0006\b¹\u0001\u0010\u0096\u0001R\u0014\u0010?\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0007\u001a\u0005\bº\u0001\u0010hR\u0015\u0010¼\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b»\u0001\u0010bR\u0015\u0010@\u001a\u0004\u0018\u00010'8F¢\u0006\b\u001a\u0006\b½\u0001\u0010\u0096\u0001R\u0014\u0010A\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010hR\u0015\u0010À\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b¿\u0001\u0010bR\u0015\u0010B\u001a\u0004\u0018\u00010'8F¢\u0006\b\u001a\u0006\bÁ\u0001\u0010\u0096\u0001R\u0014\u0010C\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010bR\u001e\u0010D\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÄ\u0001\u0010p\u001a\u0005\bÃ\u0001\u0010ZR\u001f\u0010Ç\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÆ\u0001\u0010p\u001a\u0005\bÅ\u0001\u0010bR\u0014\u0010E\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0007\u001a\u0005\bÈ\u0001\u0010hR\u0015\u0010Ê\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\bÉ\u0001\u0010bR\u0015\u0010F\u001a\u0004\u0018\u00010'8F¢\u0006\b\u001a\u0006\bË\u0001\u0010\u0096\u0001R\u0014\u0010G\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0007\u001a\u0005\bÌ\u0001\u0010hR\u0015\u0010Î\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\bÍ\u0001\u0010bR\u0015\u0010H\u001a\u0004\u0018\u00010'8F¢\u0006\b\u001a\u0006\bÏ\u0001\u0010\u0096\u0001R\u0014\u0010I\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010hR\u0015\u0010Ò\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\bÑ\u0001\u0010bR\u0015\u0010J\u001a\u0004\u0018\u00010'8F¢\u0006\b\u001a\u0006\bÓ\u0001\u0010\u0096\u0001R\u0014\u0010K\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0007\u001a\u0005\bÔ\u0001\u0010ZR\u0015\u0010Ö\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\bÕ\u0001\u0010bR\u0014\u0010L\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0007\u001a\u0005\b×\u0001\u0010hR\u0015\u0010Ù\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\bØ\u0001\u0010bR\u001b\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010:8F¢\u0006\b\u001a\u0006\bÚ\u0001\u0010³\u0001R\u0015\u0010Ü\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\bÛ\u0001\u0010bR\u0015\u0010N\u001a\u0004\u0018\u00010'8F¢\u0006\b\u001a\u0006\bÝ\u0001\u0010\u0096\u0001R\u0015\u0010P\u001a\u0004\u0018\u00010O8F¢\u0006\b\u001a\u0006\bÞ\u0001\u0010ß\u0001R\u0015\u0010á\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\bà\u0001\u0010bR\u001e\u0010R\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bã\u0001\u0010p\u001a\u0005\bâ\u0001\u0010ZR\u001f\u0010æ\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bå\u0001\u0010p\u001a\u0005\bä\u0001\u0010bR \u0010é\u0001\u001a\u0004\u0018\u0001018GX\u0087\u0004¢\u0006\u000f\u0012\u0005\bè\u0001\u0010p\u001a\u0006\bç\u0001\u0010\u009b\u0001R\u001f\u0010S\u001a\u0004\u0018\u00010'8FX\u0087\u0004¢\u0006\u000f\u0012\u0005\bë\u0001\u0010p\u001a\u0006\bê\u0001\u0010\u0096\u0001R\u001e\u0010T\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bí\u0001\u0010p\u001a\u0005\bì\u0001\u0010ZR\u001f\u0010ð\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bï\u0001\u0010p\u001a\u0005\bî\u0001\u0010bR%\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010:8FX\u0087\u0004¢\u0006\u000f\u0012\u0005\bò\u0001\u0010p\u001a\u0006\bñ\u0001\u0010³\u0001R\u001f\u0010õ\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bô\u0001\u0010p\u001a\u0005\bó\u0001\u0010bR\u001b\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010:8F¢\u0006\b\u001a\u0006\bö\u0001\u0010³\u0001R\u0015\u0010ø\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b÷\u0001\u0010bR\u0014\u0010W\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0007\u001a\u0005\bù\u0001\u0010hR\u0015\u0010û\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\bú\u0001\u0010bR\u0015\u0010X\u001a\u0004\u0018\u00010'8F¢\u0006\b\u001a\u0006\bü\u0001\u0010\u0096\u0001¨\u0006þ\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "Lcom/mapbox/maps/extension/style/layers/generated/LineLayerDsl;", "Lcom/mapbox/maps/extension/style/layers/Layer;", "", "layerId", "sourceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sourceLayer", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "slot", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "filter", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "maxZoom", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineCap;", "lineCap", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineCap;)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "lineCrossSlope", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineElevationReference;", "lineElevationReference", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineElevationReference;)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;", "lineJoin", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "lineMiterLimit", "lineRoundLimit", "lineSortKey", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineWidthUnit;", "lineWidthUnit", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineWidthUnit;)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "lineZOffset", "lineBlur", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "lineBlurTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "lineBorderColor", "", "(I)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "lineBorderColorTransition", "lineBorderColorUseTheme", "lineBorderWidth", "lineBorderWidthTransition", "lineColor", "lineColorTransition", "lineColorUseTheme", "", "lineDasharray", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "lineDepthOcclusionFactor", "lineDepthOcclusionFactorTransition", "lineEmissiveStrength", "lineEmissiveStrengthTransition", "lineGapWidth", "lineGapWidthTransition", "lineGradient", "lineGradientUseTheme", "lineOcclusionOpacity", "lineOcclusionOpacityTransition", "lineOffset", "lineOffsetTransition", "lineOpacity", "lineOpacityTransition", "linePattern", "linePatternCrossFade", "lineTranslate", "lineTranslateTransition", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineTranslateAnchor;", "lineTranslateAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineTranslateAnchor;)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "lineTrimColor", "lineTrimColorTransition", "lineTrimColorUseTheme", "lineTrimFadeRange", "lineTrimOffset", "lineWidth", "lineWidthTransition", "getType$extension_style_release", "()Ljava/lang/String;", "getType", "Ljava/lang/String;", "getLayerId", "getSourceId", "getSourceLayer", "getSlot", "getFilter", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getVisibilityAsExpression", "visibilityAsExpression", "getMinZoom", "()Ljava/lang/Double;", "getMaxZoom", "getLineCap", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineCap;", "getLineCapAsExpression", "lineCapAsExpression", "getLineCrossSlope", "getLineCrossSlope$annotations", "()V", "getLineCrossSlopeAsExpression", "getLineCrossSlopeAsExpression$annotations", "lineCrossSlopeAsExpression", "getLineElevationReference", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineElevationReference;", "getLineElevationReference$annotations", "getLineElevationReferenceAsExpression", "getLineElevationReferenceAsExpression$annotations", "lineElevationReferenceAsExpression", "getLineJoin", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;", "getLineJoinAsExpression", "lineJoinAsExpression", "getLineMiterLimit", "getLineMiterLimitAsExpression", "lineMiterLimitAsExpression", "getLineRoundLimit", "getLineRoundLimitAsExpression", "lineRoundLimitAsExpression", "getLineSortKey", "getLineSortKeyAsExpression", "lineSortKeyAsExpression", "getLineWidthUnit", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineWidthUnit;", "getLineWidthUnit$annotations", "getLineWidthUnitAsExpression", "getLineWidthUnitAsExpression$annotations", "lineWidthUnitAsExpression", "getLineZOffset", "getLineZOffset$annotations", "getLineZOffsetAsExpression", "getLineZOffsetAsExpression$annotations", "lineZOffsetAsExpression", "getLineBlur", "getLineBlurAsExpression", "lineBlurAsExpression", "getLineBlurTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getLineBorderColor", "getLineBorderColorAsExpression", "lineBorderColorAsExpression", "getLineBorderColorAsColorInt", "()Ljava/lang/Integer;", "lineBorderColorAsColorInt", "getLineBorderColorTransition", "getLineBorderColorUseTheme", "getLineBorderColorUseTheme$annotations", "getLineBorderColorUseThemeAsExpression", "getLineBorderColorUseThemeAsExpression$annotations", "lineBorderColorUseThemeAsExpression", "getLineBorderWidth", "getLineBorderWidthAsExpression", "lineBorderWidthAsExpression", "getLineBorderWidthTransition", "getLineColor", "getLineColorAsExpression", "lineColorAsExpression", "getLineColorAsColorInt", "lineColorAsColorInt", "getLineColorTransition", "getLineColorUseTheme", "getLineColorUseTheme$annotations", "getLineColorUseThemeAsExpression", "getLineColorUseThemeAsExpression$annotations", "lineColorUseThemeAsExpression", "getLineDasharray", "()Ljava/util/List;", "getLineDasharrayAsExpression", "lineDasharrayAsExpression", "getLineDepthOcclusionFactor", "getLineDepthOcclusionFactorAsExpression", "lineDepthOcclusionFactorAsExpression", "getLineDepthOcclusionFactorTransition", "getLineEmissiveStrength", "getLineEmissiveStrengthAsExpression", "lineEmissiveStrengthAsExpression", "getLineEmissiveStrengthTransition", "getLineGapWidth", "getLineGapWidthAsExpression", "lineGapWidthAsExpression", "getLineGapWidthTransition", "getLineGradient", "getLineGradientUseTheme", "getLineGradientUseTheme$annotations", "getLineGradientUseThemeAsExpression", "getLineGradientUseThemeAsExpression$annotations", "lineGradientUseThemeAsExpression", "getLineOcclusionOpacity", "getLineOcclusionOpacityAsExpression", "lineOcclusionOpacityAsExpression", "getLineOcclusionOpacityTransition", "getLineOffset", "getLineOffsetAsExpression", "lineOffsetAsExpression", "getLineOffsetTransition", "getLineOpacity", "getLineOpacityAsExpression", "lineOpacityAsExpression", "getLineOpacityTransition", "getLinePattern", "getLinePatternAsExpression", "linePatternAsExpression", "getLinePatternCrossFade", "getLinePatternCrossFadeAsExpression", "linePatternCrossFadeAsExpression", "getLineTranslate", "getLineTranslateAsExpression", "lineTranslateAsExpression", "getLineTranslateTransition", "getLineTranslateAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineTranslateAnchor;", "getLineTranslateAnchorAsExpression", "lineTranslateAnchorAsExpression", "getLineTrimColor", "getLineTrimColor$annotations", "getLineTrimColorAsExpression", "getLineTrimColorAsExpression$annotations", "lineTrimColorAsExpression", "getLineTrimColorAsColorInt", "getLineTrimColorAsColorInt$annotations", "lineTrimColorAsColorInt", "getLineTrimColorTransition", "getLineTrimColorTransition$annotations", "getLineTrimColorUseTheme", "getLineTrimColorUseTheme$annotations", "getLineTrimColorUseThemeAsExpression", "getLineTrimColorUseThemeAsExpression$annotations", "lineTrimColorUseThemeAsExpression", "getLineTrimFadeRange", "getLineTrimFadeRange$annotations", "getLineTrimFadeRangeAsExpression", "getLineTrimFadeRangeAsExpression$annotations", "lineTrimFadeRangeAsExpression", "getLineTrimOffset", "getLineTrimOffsetAsExpression", "lineTrimOffsetAsExpression", "getLineWidth", "getLineWidthAsExpression", "lineWidthAsExpression", "getLineWidthTransition", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LineLayer extends Layer implements LineLayerDsl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String layerId;
    private final String sourceId;

    public LineLayer(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.layerId = str;
        this.sourceId = str2;
        setInternalSourceId$extension_style_release(str2);
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineBorderColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineBorderColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineCrossSlope$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineCrossSlopeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineElevationReference$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineElevationReferenceAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineGradientUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineGradientUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimColor$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimColorAsColorInt$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimColorAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimColorTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimFadeRange$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimFadeRangeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineWidthUnit$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineWidthUnitAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineZOffset$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineZOffsetAsExpression$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer filter(Expression filter) {
        q2.p(filter, "filter", filter, this);
        return this;
    }

    public final Expression getFilter() {
        return (Expression) getPropertyValueWithType("filter", Expression.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public String getLayerId() {
        return this.layerId;
    }

    public final Double getLineBlur() {
        return (Double) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_BLUR, Double.class);
    }

    public final Expression getLineBlurAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolylineAnnotationOptions.PROPERTY_LINE_BLUR);
    }

    public final StyleTransition getLineBlurTransition() {
        return (StyleTransition) getPropertyValueWithType("line-blur-transition", StyleTransition.class);
    }

    public final String getLineBorderColor() {
        Expression lineBorderColorAsExpression = getLineBorderColorAsExpression();
        if (lineBorderColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(lineBorderColorAsExpression);
        }
        return null;
    }

    public final Integer getLineBorderColorAsColorInt() {
        Expression lineBorderColorAsExpression = getLineBorderColorAsExpression();
        if (lineBorderColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(lineBorderColorAsExpression);
        }
        return null;
    }

    public final Expression getLineBorderColorAsExpression() {
        return (Expression) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR, Expression.class);
    }

    public final StyleTransition getLineBorderColorTransition() {
        return (StyleTransition) getPropertyValueWithType("line-border-color-transition", StyleTransition.class);
    }

    public final String getLineBorderColorUseTheme() {
        return (String) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME, String.class);
    }

    public final Expression getLineBorderColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME);
    }

    public final Double getLineBorderWidth() {
        return (Double) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH, Double.class);
    }

    public final Expression getLineBorderWidthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH);
    }

    public final StyleTransition getLineBorderWidthTransition() {
        return (StyleTransition) getPropertyValueWithType("line-border-width-transition", StyleTransition.class);
    }

    public final LineCap getLineCap() {
        String str = (String) getPropertyValueWithType("line-cap", String.class);
        if (str == null) {
            return null;
        }
        LineCap.Companion companion = LineCap.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    public final Expression getLineCapAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("line-cap", Expression.class);
        if (expression != null) {
            return expression;
        }
        LineCap lineCap = getLineCap();
        if (lineCap != null) {
            return Expression.INSTANCE.literal(lineCap.getValue());
        }
        return null;
    }

    public final String getLineColor() {
        Expression lineColorAsExpression = getLineColorAsExpression();
        if (lineColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(lineColorAsExpression);
        }
        return null;
    }

    public final Integer getLineColorAsColorInt() {
        Expression lineColorAsExpression = getLineColorAsExpression();
        if (lineColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(lineColorAsExpression);
        }
        return null;
    }

    public final Expression getLineColorAsExpression() {
        return (Expression) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_COLOR, Expression.class);
    }

    public final StyleTransition getLineColorTransition() {
        return (StyleTransition) getPropertyValueWithType("line-color-transition", StyleTransition.class);
    }

    public final String getLineColorUseTheme() {
        return (String) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME, String.class);
    }

    public final Expression getLineColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME);
    }

    public final Double getLineCrossSlope() {
        return (Double) getPropertyValueWithType("line-cross-slope", Double.class);
    }

    public final Expression getLineCrossSlopeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-cross-slope");
    }

    public final List<Double> getLineDasharray() {
        return (List) getPropertyValueWithType("line-dasharray", List.class);
    }

    public final Expression getLineDasharrayAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-dasharray");
    }

    public final Double getLineDepthOcclusionFactor() {
        return (Double) getPropertyValueWithType("line-depth-occlusion-factor", Double.class);
    }

    public final Expression getLineDepthOcclusionFactorAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-depth-occlusion-factor");
    }

    public final StyleTransition getLineDepthOcclusionFactorTransition() {
        return (StyleTransition) getPropertyValueWithType("line-depth-occlusion-factor-transition", StyleTransition.class);
    }

    public final LineElevationReference getLineElevationReference() {
        String str = (String) getPropertyValueWithType("line-elevation-reference", String.class);
        if (str == null) {
            return null;
        }
        LineElevationReference.Companion companion = LineElevationReference.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    public final Expression getLineElevationReferenceAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("line-elevation-reference", Expression.class);
        if (expression != null) {
            return expression;
        }
        LineElevationReference lineElevationReference = getLineElevationReference();
        if (lineElevationReference != null) {
            return Expression.INSTANCE.literal(lineElevationReference.getValue());
        }
        return null;
    }

    public final Double getLineEmissiveStrength() {
        return (Double) getPropertyValueWithType("line-emissive-strength", Double.class);
    }

    public final Expression getLineEmissiveStrengthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-emissive-strength");
    }

    public final StyleTransition getLineEmissiveStrengthTransition() {
        return (StyleTransition) getPropertyValueWithType("line-emissive-strength-transition", StyleTransition.class);
    }

    public final Double getLineGapWidth() {
        return (Double) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH, Double.class);
    }

    public final Expression getLineGapWidthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH);
    }

    public final StyleTransition getLineGapWidthTransition() {
        return (StyleTransition) getPropertyValueWithType("line-gap-width-transition", StyleTransition.class);
    }

    public final Expression getLineGradient() {
        return (Expression) getPropertyValueWithType("line-gradient", Expression.class);
    }

    public final String getLineGradientUseTheme() {
        return (String) getPropertyValueWithType("line-gradient-use-theme", String.class);
    }

    public final Expression getLineGradientUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-gradient-use-theme");
    }

    public final LineJoin getLineJoin() {
        String str = (String) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_JOIN, String.class);
        if (str == null) {
            return null;
        }
        LineJoin.Companion companion = LineJoin.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    public final Expression getLineJoinAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_JOIN, Expression.class);
        if (expression != null) {
            return expression;
        }
        LineJoin lineJoin = getLineJoin();
        if (lineJoin != null) {
            return Expression.INSTANCE.literal(lineJoin.getValue());
        }
        return null;
    }

    public final Double getLineMiterLimit() {
        return (Double) getPropertyValueWithType("line-miter-limit", Double.class);
    }

    public final Expression getLineMiterLimitAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-miter-limit");
    }

    public final Double getLineOcclusionOpacity() {
        return (Double) getPropertyValueWithType("line-occlusion-opacity", Double.class);
    }

    public final Expression getLineOcclusionOpacityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-occlusion-opacity");
    }

    public final StyleTransition getLineOcclusionOpacityTransition() {
        return (StyleTransition) getPropertyValueWithType("line-occlusion-opacity-transition", StyleTransition.class);
    }

    public final Double getLineOffset() {
        return (Double) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET, Double.class);
    }

    public final Expression getLineOffsetAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET);
    }

    public final StyleTransition getLineOffsetTransition() {
        return (StyleTransition) getPropertyValueWithType("line-offset-transition", StyleTransition.class);
    }

    public final Double getLineOpacity() {
        return (Double) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY, Double.class);
    }

    public final Expression getLineOpacityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY);
    }

    public final StyleTransition getLineOpacityTransition() {
        return (StyleTransition) getPropertyValueWithType("line-opacity-transition", StyleTransition.class);
    }

    public final String getLinePattern() {
        return (String) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN, String.class);
    }

    public final Expression getLinePatternAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN);
    }

    public final Double getLinePatternCrossFade() {
        return (Double) getPropertyValueWithType("line-pattern-cross-fade", Double.class);
    }

    public final Expression getLinePatternCrossFadeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-pattern-cross-fade");
    }

    public final Double getLineRoundLimit() {
        return (Double) getPropertyValueWithType("line-round-limit", Double.class);
    }

    public final Expression getLineRoundLimitAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-round-limit");
    }

    public final Double getLineSortKey() {
        return (Double) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY, Double.class);
    }

    public final Expression getLineSortKeyAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY);
    }

    public final List<Double> getLineTranslate() {
        return (List) getPropertyValueWithType("line-translate", List.class);
    }

    public final LineTranslateAnchor getLineTranslateAnchor() {
        String str = (String) getPropertyValueWithType("line-translate-anchor", String.class);
        if (str == null) {
            return null;
        }
        LineTranslateAnchor.Companion companion = LineTranslateAnchor.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    public final Expression getLineTranslateAnchorAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("line-translate-anchor", Expression.class);
        if (expression != null) {
            return expression;
        }
        LineTranslateAnchor lineTranslateAnchor = getLineTranslateAnchor();
        if (lineTranslateAnchor != null) {
            return Expression.INSTANCE.literal(lineTranslateAnchor.getValue());
        }
        return null;
    }

    public final Expression getLineTranslateAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-translate");
    }

    public final StyleTransition getLineTranslateTransition() {
        return (StyleTransition) getPropertyValueWithType("line-translate-transition", StyleTransition.class);
    }

    public final String getLineTrimColor() {
        Expression lineTrimColorAsExpression = getLineTrimColorAsExpression();
        if (lineTrimColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(lineTrimColorAsExpression);
        }
        return null;
    }

    public final Integer getLineTrimColorAsColorInt() {
        Expression lineTrimColorAsExpression = getLineTrimColorAsExpression();
        if (lineTrimColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(lineTrimColorAsExpression);
        }
        return null;
    }

    public final Expression getLineTrimColorAsExpression() {
        return (Expression) getPropertyValueWithType("line-trim-color", Expression.class);
    }

    public final StyleTransition getLineTrimColorTransition() {
        return (StyleTransition) getPropertyValueWithType("line-trim-color-transition", StyleTransition.class);
    }

    public final String getLineTrimColorUseTheme() {
        return (String) getPropertyValueWithType("line-trim-color-use-theme", String.class);
    }

    public final Expression getLineTrimColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-trim-color-use-theme");
    }

    public final List<Double> getLineTrimFadeRange() {
        return (List) getPropertyValueWithType("line-trim-fade-range", List.class);
    }

    public final Expression getLineTrimFadeRangeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-trim-fade-range");
    }

    public final List<Double> getLineTrimOffset() {
        return (List) getPropertyValueWithType("line-trim-offset", List.class);
    }

    public final Expression getLineTrimOffsetAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("line-trim-offset");
    }

    public final Double getLineWidth() {
        return (Double) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH, Double.class);
    }

    public final Expression getLineWidthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH);
    }

    public final StyleTransition getLineWidthTransition() {
        return (StyleTransition) getPropertyValueWithType("line-width-transition", StyleTransition.class);
    }

    public final LineWidthUnit getLineWidthUnit() {
        String str = (String) getPropertyValueWithType("line-width-unit", String.class);
        if (str == null) {
            return null;
        }
        LineWidthUnit.Companion companion = LineWidthUnit.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    public final Expression getLineWidthUnitAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("line-width-unit", Expression.class);
        if (expression != null) {
            return expression;
        }
        LineWidthUnit lineWidthUnit = getLineWidthUnit();
        if (lineWidthUnit != null) {
            return Expression.INSTANCE.literal(lineWidthUnit.getValue());
        }
        return null;
    }

    public final Double getLineZOffset() {
        return (Double) getPropertyValueWithType(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET, Double.class);
    }

    public final Expression getLineZOffsetAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET);
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
        return "line";
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

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineBlur(double lineBlur) {
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_BLUR, Double.valueOf(lineBlur)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineBlurTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineBlurTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineBorderColor(int lineBorderColor) {
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR, ColorUtils.INSTANCE.colorIntToRgbaExpression(lineBorderColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineBorderColorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineBorderColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    public LineLayer lineBorderColorUseTheme(String lineBorderColorUseTheme) {
        lineBorderColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME, lineBorderColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineBorderWidth(double lineBorderWidth) {
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH, Double.valueOf(lineBorderWidth)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineBorderWidthTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineBorderWidthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineCap(LineCap lineCap) {
        lineCap.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-cap", lineCap));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineColor(int lineColor) {
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_COLOR, ColorUtils.INSTANCE.colorIntToRgbaExpression(lineColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineColorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    public LineLayer lineColorUseTheme(String lineColorUseTheme) {
        lineColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME, lineColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    public LineLayer lineCrossSlope(double lineCrossSlope) {
        setProperty$extension_style_release(new PropertyValue<>("line-cross-slope", Double.valueOf(lineCrossSlope)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineDasharray(List<Double> lineDasharray) {
        lineDasharray.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-dasharray", lineDasharray));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineDepthOcclusionFactor(double lineDepthOcclusionFactor) {
        setProperty$extension_style_release(new PropertyValue<>("line-depth-occlusion-factor", Double.valueOf(lineDepthOcclusionFactor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineDepthOcclusionFactorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineDepthOcclusionFactorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    public LineLayer lineElevationReference(LineElevationReference lineElevationReference) {
        lineElevationReference.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-elevation-reference", lineElevationReference));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineEmissiveStrength(double lineEmissiveStrength) {
        setProperty$extension_style_release(new PropertyValue<>("line-emissive-strength", Double.valueOf(lineEmissiveStrength)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineEmissiveStrengthTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineEmissiveStrengthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineGapWidth(double lineGapWidth) {
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH, Double.valueOf(lineGapWidth)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineGapWidthTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineGapWidthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineGradient(Expression lineGradient) {
        q2.p(lineGradient, "line-gradient", lineGradient, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    public LineLayer lineGradientUseTheme(String lineGradientUseTheme) {
        lineGradientUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-gradient-use-theme", lineGradientUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineJoin(LineJoin lineJoin) {
        lineJoin.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_JOIN, lineJoin));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineMiterLimit(double lineMiterLimit) {
        setProperty$extension_style_release(new PropertyValue<>("line-miter-limit", Double.valueOf(lineMiterLimit)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineOcclusionOpacity(double lineOcclusionOpacity) {
        setProperty$extension_style_release(new PropertyValue<>("line-occlusion-opacity", Double.valueOf(lineOcclusionOpacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineOcclusionOpacityTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineOcclusionOpacityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineOffset(double lineOffset) {
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET, Double.valueOf(lineOffset)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineOffsetTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineOffsetTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineOpacity(double lineOpacity) {
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY, Double.valueOf(lineOpacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineOpacityTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineOpacityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer linePattern(String linePattern) {
        linePattern.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN, linePattern));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer linePatternCrossFade(double linePatternCrossFade) {
        setProperty$extension_style_release(new PropertyValue<>("line-pattern-cross-fade", Double.valueOf(linePatternCrossFade)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineRoundLimit(double lineRoundLimit) {
        setProperty$extension_style_release(new PropertyValue<>("line-round-limit", Double.valueOf(lineRoundLimit)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineSortKey(double lineSortKey) {
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY, Double.valueOf(lineSortKey)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineTranslate(List<Double> lineTranslate) {
        lineTranslate.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-translate", lineTranslate));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineTranslateAnchor(LineTranslateAnchor lineTranslateAnchor) {
        lineTranslateAnchor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-translate-anchor", lineTranslateAnchor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineTranslateTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineTranslateTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    public LineLayer lineTrimColor(int lineTrimColor) {
        setProperty$extension_style_release(new PropertyValue<>("line-trim-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(lineTrimColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    public LineLayer lineTrimColorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineTrimColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    public LineLayer lineTrimColorUseTheme(String lineTrimColorUseTheme) {
        lineTrimColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-trim-color-use-theme", lineTrimColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    public LineLayer lineTrimFadeRange(List<Double> lineTrimFadeRange) {
        lineTrimFadeRange.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-trim-fade-range", lineTrimFadeRange));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineTrimOffset(List<Double> lineTrimOffset) {
        lineTrimOffset.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-trim-offset", lineTrimOffset));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineWidth(double lineWidth) {
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH, Double.valueOf(lineWidth)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineWidthTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        lineWidthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    public LineLayer lineWidthUnit(LineWidthUnit lineWidthUnit) {
        lineWidthUnit.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-width-unit", lineWidthUnit));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    public LineLayer lineZOffset(double lineZOffset) {
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET, Double.valueOf(lineZOffset)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public LineLayer maxZoom(double maxZoom) {
        setProperty$extension_style_release(new PropertyValue<>("maxzoom", Double.valueOf(maxZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public LineLayer minZoom(double minZoom) {
        setProperty$extension_style_release(new PropertyValue<>("minzoom", Double.valueOf(minZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public LineLayer slot(String slot) {
        slot.getClass();
        setProperty$extension_style_release(new PropertyValue<>("slot", slot));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer sourceLayer(String sourceLayer) {
        sourceLayer.getClass();
        setProperty$extension_style_release(new PropertyValue<>("source-layer", sourceLayer));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public LineLayer visibility(Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\nR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000eR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0012R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\nR\u0013\u0010!\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0006R\u0013\u0010#\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\nR\u0013\u0010%\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b&\u0010\u000eR\u0013\u0010'\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010+\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\nR\u0013\u0010-\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b.\u0010\u0012R\u0013\u0010/\u001a\u0004\u0018\u00010\u00148G¢\u0006\u0006\u001a\u0004\b0\u0010\u0016R\u0013\u00101\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b2\u0010\nR\u0013\u00103\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b4\u0010\u000eR\u001c\u00105\u001a\u0004\u0018\u00010\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b6\u0010\u0002\u001a\u0004\b7\u0010\u0012R\u001c\u00108\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b9\u0010\u0002\u001a\u0004\b:\u0010\nR\u001c\u0010;\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b<\u0010\u0002\u001a\u0004\b=\u0010\u0006R\u001c\u0010>\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b?\u0010\u0002\u001a\u0004\b@\u0010\nR\u0019\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010B8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0013\u0010E\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bF\u0010\nR\u0013\u0010G\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bH\u0010\u0006R\u0013\u0010I\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bJ\u0010\nR\u0013\u0010K\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bL\u0010\u000eR\u001c\u0010M\u001a\u0004\u0018\u00010N8FX\u0087\u0004¢\u0006\f\u0012\u0004\bO\u0010\u0002\u001a\u0004\bP\u0010QR\u001c\u0010R\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bS\u0010\u0002\u001a\u0004\bT\u0010\nR\u0013\u0010U\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bV\u0010\u0006R\u0013\u0010W\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bX\u0010\nR\u0013\u0010Y\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bZ\u0010\u000eR\u0013\u0010[\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\\\u0010\u0006R\u0013\u0010]\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b^\u0010\nR\u0013\u0010_\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b`\u0010\u000eR\u001c\u0010a\u001a\u0004\u0018\u00010\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\bb\u0010\u0002\u001a\u0004\bc\u0010\u0012R\u001c\u0010d\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\be\u0010\u0002\u001a\u0004\bf\u0010\nR\u0013\u0010g\u001a\u0004\u0018\u00010h8F¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0013\u0010k\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bl\u0010\nR\u0013\u0010m\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bn\u0010\u0006R\u0013\u0010o\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bp\u0010\nR\u0013\u0010q\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\br\u0010\u0006R\u0013\u0010s\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bt\u0010\nR\u0013\u0010u\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bv\u0010\u000eR\u0013\u0010w\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bx\u0010\u0006R\u0013\u0010y\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bz\u0010\nR\u0013\u0010{\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b|\u0010\u000eR\u0013\u0010}\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b~\u0010\u0006R\u0014\u0010\u007f\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\nR\u0015\u0010\u0081\u0001\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\u000eR\u0015\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010\u0012R\u0015\u0010\u0085\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010\nR\u0015\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010\u0006R\u0015\u0010\u0089\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010\nR\u0015\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010\u0006R\u0015\u0010\u008d\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010\nR\u0015\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010\u0006R\u0015\u0010\u0091\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010\nR\u001b\u0010\u0093\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010B8F¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010DR\u0017\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0096\u00018F¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0015\u0010\u0099\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010\nR\u0015\u0010\u009b\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010\nR\u0015\u0010\u009d\u0001\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010\u000eR\u001f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00108FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b \u0001\u0010\u0002\u001a\u0005\b¡\u0001\u0010\u0012R\u001f\u0010¢\u0001\u001a\u0004\u0018\u00010\u00148GX\u0087\u0004¢\u0006\u000e\u0012\u0005\b£\u0001\u0010\u0002\u001a\u0005\b¤\u0001\u0010\u0016R\u001f\u0010¥\u0001\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¦\u0001\u0010\u0002\u001a\u0005\b§\u0001\u0010\nR\u001f\u0010¨\u0001\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b©\u0001\u0010\u0002\u001a\u0005\bª\u0001\u0010\u000eR\u001f\u0010«\u0001\u001a\u0004\u0018\u00010\u00108FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¬\u0001\u0010\u0002\u001a\u0005\b\u00ad\u0001\u0010\u0012R\u001f\u0010®\u0001\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¯\u0001\u0010\u0002\u001a\u0005\b°\u0001\u0010\nR%\u0010±\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010B8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b²\u0001\u0010\u0002\u001a\u0005\b³\u0001\u0010DR\u001f\u0010´\u0001\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bµ\u0001\u0010\u0002\u001a\u0005\b¶\u0001\u0010\nR\u001b\u0010·\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010B8F¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010DR\u0015\u0010¹\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\bº\u0001\u0010\nR\u0015\u0010»\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010\u0006R\u0015\u0010½\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010\nR\u0015\u0010¿\u0001\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\bÀ\u0001\u0010\u000eR!\u0010Á\u0001\u001a\u0005\u0018\u00010Â\u00018FX\u0087\u0004¢\u0006\u000f\u0012\u0005\bÃ\u0001\u0010\u0002\u001a\u0006\bÄ\u0001\u0010Å\u0001R\u001f\u0010Æ\u0001\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÇ\u0001\u0010\u0002\u001a\u0005\bÈ\u0001\u0010\nR\u001f\u0010É\u0001\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÊ\u0001\u0010\u0002\u001a\u0005\bË\u0001\u0010\u0006R\u001f\u0010Ì\u0001\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÍ\u0001\u0010\u0002\u001a\u0005\bÎ\u0001\u0010\nR\u0015\u0010Ï\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010\u0006R\u0015\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\bÒ\u0001\u0010\u0006R\u0017\u0010Ó\u0001\u001a\u0005\u0018\u00010Ô\u00018F¢\u0006\b\u001a\u0006\bÕ\u0001\u0010Ö\u0001¨\u0006×\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/LineLayer$Companion;", "", "()V", "defaultLineBlur", "", "getDefaultLineBlur", "()Ljava/lang/Double;", "defaultLineBlurAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getDefaultLineBlurAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "defaultLineBlurTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getDefaultLineBlurTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "defaultLineBorderColor", "", "getDefaultLineBorderColor", "()Ljava/lang/String;", "defaultLineBorderColorAsColorInt", "", "getDefaultLineBorderColorAsColorInt", "()Ljava/lang/Integer;", "defaultLineBorderColorAsExpression", "getDefaultLineBorderColorAsExpression", "defaultLineBorderColorTransition", "getDefaultLineBorderColorTransition", "defaultLineBorderColorUseTheme", "getDefaultLineBorderColorUseTheme$annotations", "getDefaultLineBorderColorUseTheme", "defaultLineBorderColorUseThemeAsExpression", "getDefaultLineBorderColorUseThemeAsExpression$annotations", "getDefaultLineBorderColorUseThemeAsExpression", "defaultLineBorderWidth", "getDefaultLineBorderWidth", "defaultLineBorderWidthAsExpression", "getDefaultLineBorderWidthAsExpression", "defaultLineBorderWidthTransition", "getDefaultLineBorderWidthTransition", "defaultLineCap", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineCap;", "getDefaultLineCap", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineCap;", "defaultLineCapAsExpression", "getDefaultLineCapAsExpression", "defaultLineColor", "getDefaultLineColor", "defaultLineColorAsColorInt", "getDefaultLineColorAsColorInt", "defaultLineColorAsExpression", "getDefaultLineColorAsExpression", "defaultLineColorTransition", "getDefaultLineColorTransition", "defaultLineColorUseTheme", "getDefaultLineColorUseTheme$annotations", "getDefaultLineColorUseTheme", "defaultLineColorUseThemeAsExpression", "getDefaultLineColorUseThemeAsExpression$annotations", "getDefaultLineColorUseThemeAsExpression", "defaultLineCrossSlope", "getDefaultLineCrossSlope$annotations", "getDefaultLineCrossSlope", "defaultLineCrossSlopeAsExpression", "getDefaultLineCrossSlopeAsExpression$annotations", "getDefaultLineCrossSlopeAsExpression", "defaultLineDasharray", "", "getDefaultLineDasharray", "()Ljava/util/List;", "defaultLineDasharrayAsExpression", "getDefaultLineDasharrayAsExpression", "defaultLineDepthOcclusionFactor", "getDefaultLineDepthOcclusionFactor", "defaultLineDepthOcclusionFactorAsExpression", "getDefaultLineDepthOcclusionFactorAsExpression", "defaultLineDepthOcclusionFactorTransition", "getDefaultLineDepthOcclusionFactorTransition", "defaultLineElevationReference", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineElevationReference;", "getDefaultLineElevationReference$annotations", "getDefaultLineElevationReference", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineElevationReference;", "defaultLineElevationReferenceAsExpression", "getDefaultLineElevationReferenceAsExpression$annotations", "getDefaultLineElevationReferenceAsExpression", "defaultLineEmissiveStrength", "getDefaultLineEmissiveStrength", "defaultLineEmissiveStrengthAsExpression", "getDefaultLineEmissiveStrengthAsExpression", "defaultLineEmissiveStrengthTransition", "getDefaultLineEmissiveStrengthTransition", "defaultLineGapWidth", "getDefaultLineGapWidth", "defaultLineGapWidthAsExpression", "getDefaultLineGapWidthAsExpression", "defaultLineGapWidthTransition", "getDefaultLineGapWidthTransition", "defaultLineGradientUseTheme", "getDefaultLineGradientUseTheme$annotations", "getDefaultLineGradientUseTheme", "defaultLineGradientUseThemeAsExpression", "getDefaultLineGradientUseThemeAsExpression$annotations", "getDefaultLineGradientUseThemeAsExpression", "defaultLineJoin", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;", "getDefaultLineJoin", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;", "defaultLineJoinAsExpression", "getDefaultLineJoinAsExpression", "defaultLineMiterLimit", "getDefaultLineMiterLimit", "defaultLineMiterLimitAsExpression", "getDefaultLineMiterLimitAsExpression", "defaultLineOcclusionOpacity", "getDefaultLineOcclusionOpacity", "defaultLineOcclusionOpacityAsExpression", "getDefaultLineOcclusionOpacityAsExpression", "defaultLineOcclusionOpacityTransition", "getDefaultLineOcclusionOpacityTransition", "defaultLineOffset", "getDefaultLineOffset", "defaultLineOffsetAsExpression", "getDefaultLineOffsetAsExpression", "defaultLineOffsetTransition", "getDefaultLineOffsetTransition", "defaultLineOpacity", "getDefaultLineOpacity", "defaultLineOpacityAsExpression", "getDefaultLineOpacityAsExpression", "defaultLineOpacityTransition", "getDefaultLineOpacityTransition", "defaultLinePattern", "getDefaultLinePattern", "defaultLinePatternAsExpression", "getDefaultLinePatternAsExpression", "defaultLinePatternCrossFade", "getDefaultLinePatternCrossFade", "defaultLinePatternCrossFadeAsExpression", "getDefaultLinePatternCrossFadeAsExpression", "defaultLineRoundLimit", "getDefaultLineRoundLimit", "defaultLineRoundLimitAsExpression", "getDefaultLineRoundLimitAsExpression", "defaultLineSortKey", "getDefaultLineSortKey", "defaultLineSortKeyAsExpression", "getDefaultLineSortKeyAsExpression", "defaultLineTranslate", "getDefaultLineTranslate", "defaultLineTranslateAnchor", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineTranslateAnchor;", "getDefaultLineTranslateAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineTranslateAnchor;", "defaultLineTranslateAnchorAsExpression", "getDefaultLineTranslateAnchorAsExpression", "defaultLineTranslateAsExpression", "getDefaultLineTranslateAsExpression", "defaultLineTranslateTransition", "getDefaultLineTranslateTransition", "defaultLineTrimColor", "getDefaultLineTrimColor$annotations", "getDefaultLineTrimColor", "defaultLineTrimColorAsColorInt", "getDefaultLineTrimColorAsColorInt$annotations", "getDefaultLineTrimColorAsColorInt", "defaultLineTrimColorAsExpression", "getDefaultLineTrimColorAsExpression$annotations", "getDefaultLineTrimColorAsExpression", "defaultLineTrimColorTransition", "getDefaultLineTrimColorTransition$annotations", "getDefaultLineTrimColorTransition", "defaultLineTrimColorUseTheme", "getDefaultLineTrimColorUseTheme$annotations", "getDefaultLineTrimColorUseTheme", "defaultLineTrimColorUseThemeAsExpression", "getDefaultLineTrimColorUseThemeAsExpression$annotations", "getDefaultLineTrimColorUseThemeAsExpression", "defaultLineTrimFadeRange", "getDefaultLineTrimFadeRange$annotations", "getDefaultLineTrimFadeRange", "defaultLineTrimFadeRangeAsExpression", "getDefaultLineTrimFadeRangeAsExpression$annotations", "getDefaultLineTrimFadeRangeAsExpression", "defaultLineTrimOffset", "getDefaultLineTrimOffset", "defaultLineTrimOffsetAsExpression", "getDefaultLineTrimOffsetAsExpression", "defaultLineWidth", "getDefaultLineWidth", "defaultLineWidthAsExpression", "getDefaultLineWidthAsExpression", "defaultLineWidthTransition", "getDefaultLineWidthTransition", "defaultLineWidthUnit", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineWidthUnit;", "getDefaultLineWidthUnit$annotations", "getDefaultLineWidthUnit", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineWidthUnit;", "defaultLineWidthUnitAsExpression", "getDefaultLineWidthUnitAsExpression$annotations", "getDefaultLineWidthUnitAsExpression", "defaultLineZOffset", "getDefaultLineZOffset$annotations", "getDefaultLineZOffset", "defaultLineZOffsetAsExpression", "getDefaultLineZOffsetAsExpression$annotations", "getDefaultLineZOffsetAsExpression", "defaultMaxZoom", "getDefaultMaxZoom", "defaultMinZoom", "getDefaultMinZoom", "defaultVisibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getDefaultVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineBorderColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineBorderColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineCrossSlope$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineCrossSlopeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineElevationReference$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineElevationReferenceAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineGradientUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineGradientUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineTrimColor$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineTrimColorAsColorInt$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineTrimColorAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineTrimColorTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineTrimColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineTrimColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineTrimFadeRange$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineTrimFadeRangeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineWidthUnit$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineWidthUnitAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineZOffset$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultLineZOffsetAsExpression$annotations() {
        }

        public final Double getDefaultLineBlur() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_BLUR);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultLineBlurAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_BLUR);
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
            Double defaultLineBlur = getDefaultLineBlur();
            if (defaultLineBlur == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineBlur.doubleValue());
        }

        public final StyleTransition getDefaultLineBlurTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-blur-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultLineBorderColor() {
            Expression defaultLineBorderColorAsExpression = getDefaultLineBorderColorAsExpression();
            if (defaultLineBorderColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultLineBorderColorAsExpression);
            }
            return null;
        }

        public final Integer getDefaultLineBorderColorAsColorInt() {
            Expression defaultLineBorderColorAsExpression = getDefaultLineBorderColorAsExpression();
            if (defaultLineBorderColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultLineBorderColorAsExpression);
            }
            return null;
        }

        public final Expression getDefaultLineBorderColorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR);
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

        public final StyleTransition getDefaultLineBorderColorTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-border-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultLineBorderColorUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultLineBorderColorUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME);
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
            String defaultLineBorderColorUseTheme = getDefaultLineBorderColorUseTheme();
            if (defaultLineBorderColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultLineBorderColorUseTheme);
            }
            return null;
        }

        public final Double getDefaultLineBorderWidth() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultLineBorderWidthAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH);
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
            Double defaultLineBorderWidth = getDefaultLineBorderWidth();
            if (defaultLineBorderWidth == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineBorderWidth.doubleValue());
        }

        public final StyleTransition getDefaultLineBorderWidthTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-border-width-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final LineCap getDefaultLineCap() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-cap");
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
            LineCap.Companion companion = LineCap.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        public final Expression getDefaultLineCapAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-cap");
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
            LineCap defaultLineCap = getDefaultLineCap();
            if (defaultLineCap != null) {
                return Expression.INSTANCE.literal(defaultLineCap.getValue());
            }
            return null;
        }

        public final String getDefaultLineColor() {
            Expression defaultLineColorAsExpression = getDefaultLineColorAsExpression();
            if (defaultLineColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultLineColorAsExpression);
            }
            return null;
        }

        public final Integer getDefaultLineColorAsColorInt() {
            Expression defaultLineColorAsExpression = getDefaultLineColorAsExpression();
            if (defaultLineColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultLineColorAsExpression);
            }
            return null;
        }

        public final Expression getDefaultLineColorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_COLOR);
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

        public final StyleTransition getDefaultLineColorTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultLineColorUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultLineColorUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME);
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
            String defaultLineColorUseTheme = getDefaultLineColorUseTheme();
            if (defaultLineColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultLineColorUseTheme);
            }
            return null;
        }

        public final Double getDefaultLineCrossSlope() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-cross-slope");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultLineCrossSlopeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-cross-slope");
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
            Double defaultLineCrossSlope = getDefaultLineCrossSlope();
            if (defaultLineCrossSlope == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineCrossSlope.doubleValue());
        }

        public final List<Double> getDefaultLineDasharray() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-dasharray");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (List) objUnwrap;
        }

        public final Expression getDefaultLineDasharrayAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-dasharray");
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
            List<Double> defaultLineDasharray = getDefaultLineDasharray();
            if (defaultLineDasharray != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultLineDasharray);
            }
            return null;
        }

        public final Double getDefaultLineDepthOcclusionFactor() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-depth-occlusion-factor");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultLineDepthOcclusionFactorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-depth-occlusion-factor");
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
            Double defaultLineDepthOcclusionFactor = getDefaultLineDepthOcclusionFactor();
            if (defaultLineDepthOcclusionFactor == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineDepthOcclusionFactor.doubleValue());
        }

        public final StyleTransition getDefaultLineDepthOcclusionFactorTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-depth-occlusion-factor-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final LineElevationReference getDefaultLineElevationReference() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-elevation-reference");
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
            LineElevationReference.Companion companion = LineElevationReference.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        public final Expression getDefaultLineElevationReferenceAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-elevation-reference");
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
            LineElevationReference defaultLineElevationReference = getDefaultLineElevationReference();
            if (defaultLineElevationReference != null) {
                return Expression.INSTANCE.literal(defaultLineElevationReference.getValue());
            }
            return null;
        }

        public final Double getDefaultLineEmissiveStrength() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-emissive-strength");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultLineEmissiveStrengthAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-emissive-strength");
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
            Double defaultLineEmissiveStrength = getDefaultLineEmissiveStrength();
            if (defaultLineEmissiveStrength == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineEmissiveStrength.doubleValue());
        }

        public final StyleTransition getDefaultLineEmissiveStrengthTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-emissive-strength-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultLineGapWidth() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultLineGapWidthAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH);
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
            Double defaultLineGapWidth = getDefaultLineGapWidth();
            if (defaultLineGapWidth == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineGapWidth.doubleValue());
        }

        public final StyleTransition getDefaultLineGapWidthTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-gap-width-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultLineGradientUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-gradient-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultLineGradientUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-gradient-use-theme");
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
            String defaultLineGradientUseTheme = getDefaultLineGradientUseTheme();
            if (defaultLineGradientUseTheme != null) {
                return Expression.INSTANCE.literal(defaultLineGradientUseTheme);
            }
            return null;
        }

        public final LineJoin getDefaultLineJoin() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_JOIN);
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
            LineJoin.Companion companion = LineJoin.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        public final Expression getDefaultLineJoinAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_JOIN);
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
            LineJoin defaultLineJoin = getDefaultLineJoin();
            if (defaultLineJoin != null) {
                return Expression.INSTANCE.literal(defaultLineJoin.getValue());
            }
            return null;
        }

        public final Double getDefaultLineMiterLimit() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-miter-limit");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultLineMiterLimitAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-miter-limit");
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
            Double defaultLineMiterLimit = getDefaultLineMiterLimit();
            if (defaultLineMiterLimit == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineMiterLimit.doubleValue());
        }

        public final Double getDefaultLineOcclusionOpacity() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-occlusion-opacity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultLineOcclusionOpacityAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-occlusion-opacity");
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
            Double defaultLineOcclusionOpacity = getDefaultLineOcclusionOpacity();
            if (defaultLineOcclusionOpacity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineOcclusionOpacity.doubleValue());
        }

        public final StyleTransition getDefaultLineOcclusionOpacityTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-occlusion-opacity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultLineOffset() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_OFFSET);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultLineOffsetAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_OFFSET);
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
            Double defaultLineOffset = getDefaultLineOffset();
            if (defaultLineOffset == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineOffset.doubleValue());
        }

        public final StyleTransition getDefaultLineOffsetTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-offset-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultLineOpacity() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_OPACITY);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultLineOpacityAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_OPACITY);
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
            Double defaultLineOpacity = getDefaultLineOpacity();
            if (defaultLineOpacity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineOpacity.doubleValue());
        }

        public final StyleTransition getDefaultLineOpacityTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-opacity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultLinePattern() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_PATTERN);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultLinePatternAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_PATTERN);
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
            String defaultLinePattern = getDefaultLinePattern();
            if (defaultLinePattern != null) {
                return Expression.INSTANCE.literal(defaultLinePattern);
            }
            return null;
        }

        public final Double getDefaultLinePatternCrossFade() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-pattern-cross-fade");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultLinePatternCrossFadeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-pattern-cross-fade");
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
            Double defaultLinePatternCrossFade = getDefaultLinePatternCrossFade();
            if (defaultLinePatternCrossFade == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLinePatternCrossFade.doubleValue());
        }

        public final Double getDefaultLineRoundLimit() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-round-limit");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultLineRoundLimitAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-round-limit");
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
            Double defaultLineRoundLimit = getDefaultLineRoundLimit();
            if (defaultLineRoundLimit == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineRoundLimit.doubleValue());
        }

        public final Double getDefaultLineSortKey() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultLineSortKeyAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY);
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
            Double defaultLineSortKey = getDefaultLineSortKey();
            if (defaultLineSortKey == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineSortKey.doubleValue());
        }

        public final List<Double> getDefaultLineTranslate() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-translate");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (List) objUnwrap;
        }

        public final LineTranslateAnchor getDefaultLineTranslateAnchor() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-translate-anchor");
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
            LineTranslateAnchor.Companion companion = LineTranslateAnchor.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        public final Expression getDefaultLineTranslateAnchorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-translate-anchor");
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
            LineTranslateAnchor defaultLineTranslateAnchor = getDefaultLineTranslateAnchor();
            if (defaultLineTranslateAnchor != null) {
                return Expression.INSTANCE.literal(defaultLineTranslateAnchor.getValue());
            }
            return null;
        }

        public final Expression getDefaultLineTranslateAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-translate");
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
            List<Double> defaultLineTranslate = getDefaultLineTranslate();
            if (defaultLineTranslate != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultLineTranslate);
            }
            return null;
        }

        public final StyleTransition getDefaultLineTranslateTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-translate-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultLineTrimColor() {
            Expression defaultLineTrimColorAsExpression = getDefaultLineTrimColorAsExpression();
            if (defaultLineTrimColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultLineTrimColorAsExpression);
            }
            return null;
        }

        public final Integer getDefaultLineTrimColorAsColorInt() {
            Expression defaultLineTrimColorAsExpression = getDefaultLineTrimColorAsExpression();
            if (defaultLineTrimColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultLineTrimColorAsExpression);
            }
            return null;
        }

        public final Expression getDefaultLineTrimColorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-trim-color");
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

        public final StyleTransition getDefaultLineTrimColorTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-trim-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultLineTrimColorUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-trim-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultLineTrimColorUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-trim-color-use-theme");
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
            String defaultLineTrimColorUseTheme = getDefaultLineTrimColorUseTheme();
            if (defaultLineTrimColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultLineTrimColorUseTheme);
            }
            return null;
        }

        public final List<Double> getDefaultLineTrimFadeRange() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-trim-fade-range");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (List) objUnwrap;
        }

        public final Expression getDefaultLineTrimFadeRangeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-trim-fade-range");
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
            List<Double> defaultLineTrimFadeRange = getDefaultLineTrimFadeRange();
            if (defaultLineTrimFadeRange != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultLineTrimFadeRange);
            }
            return null;
        }

        public final List<Double> getDefaultLineTrimOffset() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-trim-offset");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (List) objUnwrap;
        }

        public final Expression getDefaultLineTrimOffsetAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-trim-offset");
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
            List<Double> defaultLineTrimOffset = getDefaultLineTrimOffset();
            if (defaultLineTrimOffset != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultLineTrimOffset);
            }
            return null;
        }

        public final Double getDefaultLineWidth() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_WIDTH);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultLineWidthAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_WIDTH);
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
            Double defaultLineWidth = getDefaultLineWidth();
            if (defaultLineWidth == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineWidth.doubleValue());
        }

        public final StyleTransition getDefaultLineWidthTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-width-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final LineWidthUnit getDefaultLineWidthUnit() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-width-unit");
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
            LineWidthUnit.Companion companion = LineWidthUnit.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        public final Expression getDefaultLineWidthUnitAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "line-width-unit");
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
            LineWidthUnit defaultLineWidthUnit = getDefaultLineWidthUnit();
            if (defaultLineWidthUnit != null) {
                return Expression.INSTANCE.literal(defaultLineWidthUnit.getValue());
            }
            return null;
        }

        public final Double getDefaultLineZOffset() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultLineZOffsetAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET);
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
            Double defaultLineZOffset = getDefaultLineZOffset();
            if (defaultLineZOffset == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLineZOffset.doubleValue());
        }

        public final Double getDefaultMaxZoom() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "maxzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "minzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("line", "visibility");
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

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    public LineLayer lineBorderColorUseTheme(Expression lineBorderColorUseTheme) {
        q2.p(lineBorderColorUseTheme, PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME, lineBorderColorUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineCap(Expression lineCap) {
        q2.p(lineCap, "line-cap", lineCap, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    public LineLayer lineColorUseTheme(Expression lineColorUseTheme) {
        q2.p(lineColorUseTheme, PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME, lineColorUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineDasharray(Expression lineDasharray) {
        q2.p(lineDasharray, "line-dasharray", lineDasharray, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    public LineLayer lineElevationReference(Expression lineElevationReference) {
        q2.p(lineElevationReference, "line-elevation-reference", lineElevationReference, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    public LineLayer lineGradientUseTheme(Expression lineGradientUseTheme) {
        q2.p(lineGradientUseTheme, "line-gradient-use-theme", lineGradientUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineJoin(Expression lineJoin) {
        q2.p(lineJoin, PolylineAnnotationOptions.PROPERTY_LINE_JOIN, lineJoin, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer linePattern(Expression linePattern) {
        q2.p(linePattern, PolylineAnnotationOptions.PROPERTY_LINE_PATTERN, linePattern, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineTranslate(Expression lineTranslate) {
        q2.p(lineTranslate, "line-translate", lineTranslate, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineTranslateAnchor(Expression lineTranslateAnchor) {
        q2.p(lineTranslateAnchor, "line-translate-anchor", lineTranslateAnchor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    public LineLayer lineTrimColorUseTheme(Expression lineTrimColorUseTheme) {
        q2.p(lineTrimColorUseTheme, "line-trim-color-use-theme", lineTrimColorUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    public LineLayer lineTrimFadeRange(Expression lineTrimFadeRange) {
        q2.p(lineTrimFadeRange, "line-trim-fade-range", lineTrimFadeRange, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineTrimOffset(Expression lineTrimOffset) {
        q2.p(lineTrimOffset, "line-trim-offset", lineTrimOffset, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    public LineLayer lineWidthUnit(Expression lineWidthUnit) {
        q2.p(lineWidthUnit, "line-width-unit", lineWidthUnit, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineBlur(Expression lineBlur) {
        q2.p(lineBlur, PolylineAnnotationOptions.PROPERTY_LINE_BLUR, lineBlur, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineBorderWidth(Expression lineBorderWidth) {
        q2.p(lineBorderWidth, PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH, lineBorderWidth, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    public LineLayer lineCrossSlope(Expression lineCrossSlope) {
        q2.p(lineCrossSlope, "line-cross-slope", lineCrossSlope, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineDepthOcclusionFactor(Expression lineDepthOcclusionFactor) {
        q2.p(lineDepthOcclusionFactor, "line-depth-occlusion-factor", lineDepthOcclusionFactor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineEmissiveStrength(Expression lineEmissiveStrength) {
        q2.p(lineEmissiveStrength, "line-emissive-strength", lineEmissiveStrength, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineGapWidth(Expression lineGapWidth) {
        q2.p(lineGapWidth, PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH, lineGapWidth, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineMiterLimit(Expression lineMiterLimit) {
        q2.p(lineMiterLimit, "line-miter-limit", lineMiterLimit, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineOcclusionOpacity(Expression lineOcclusionOpacity) {
        q2.p(lineOcclusionOpacity, "line-occlusion-opacity", lineOcclusionOpacity, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineOffset(Expression lineOffset) {
        q2.p(lineOffset, PolylineAnnotationOptions.PROPERTY_LINE_OFFSET, lineOffset, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineOpacity(Expression lineOpacity) {
        q2.p(lineOpacity, PolylineAnnotationOptions.PROPERTY_LINE_OPACITY, lineOpacity, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer linePatternCrossFade(Expression linePatternCrossFade) {
        q2.p(linePatternCrossFade, "line-pattern-cross-fade", linePatternCrossFade, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineRoundLimit(Expression lineRoundLimit) {
        q2.p(lineRoundLimit, "line-round-limit", lineRoundLimit, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineSortKey(Expression lineSortKey) {
        q2.p(lineSortKey, PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY, lineSortKey, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineWidth(Expression lineWidth) {
        q2.p(lineWidth, PolylineAnnotationOptions.PROPERTY_LINE_WIDTH, lineWidth, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    public LineLayer lineZOffset(Expression lineZOffset) {
        q2.p(lineZOffset, PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET, lineZOffset, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public LineLayer visibility(Expression visibility) {
        q2.p(visibility, "visibility", visibility, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineBorderColor(Expression lineBorderColor) {
        q2.p(lineBorderColor, PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR, lineBorderColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineColor(Expression lineColor) {
        q2.p(lineColor, PolylineAnnotationOptions.PROPERTY_LINE_COLOR, lineColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    public LineLayer lineTrimColor(Expression lineTrimColor) {
        q2.p(lineTrimColor, "line-trim-color", lineTrimColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineBlurTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-blur-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineBorderColor(String lineBorderColor) {
        lineBorderColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR, lineBorderColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineBorderColorTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-border-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineBorderWidthTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-border-width-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineColor(String lineColor) {
        lineColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>(PolylineAnnotationOptions.PROPERTY_LINE_COLOR, lineColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineColorTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineDepthOcclusionFactorTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-depth-occlusion-factor-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineEmissiveStrengthTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-emissive-strength-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineGapWidthTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-gap-width-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineOcclusionOpacityTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-occlusion-opacity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineOffsetTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-offset-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineOpacityTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-opacity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineTranslateTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-translate-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    public LineLayer lineTrimColor(String lineTrimColor) {
        lineTrimColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-trim-color", lineTrimColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    @MapboxExperimental
    public LineLayer lineTrimColorTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-trim-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LineLayerDsl
    public LineLayer lineWidthTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("line-width-transition", options));
        return this;
    }
}
