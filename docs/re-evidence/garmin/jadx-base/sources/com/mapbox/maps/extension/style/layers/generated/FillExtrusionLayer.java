package com.mapbox.maps.extension.style.layers.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.StyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.FillExtrusionBaseAlignment;
import com.mapbox.maps.extension.style.layers.properties.generated.FillExtrusionHeightAlignment;
import com.mapbox.maps.extension.style.layers.properties.generated.FillExtrusionTranslateAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.p;
import e23.l;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import r1.q2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0003\b¸\u0001\b\u0007\u0018\u0000 \u0089\u00022\u00020\u00012\u00020\u0002:\u0002\u0089\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0016\u0010\rJ\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u0019\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0017¢\u0006\u0004\b\u0019\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0011H\u0017¢\u0006\u0004\b \u0010\u0013J\u0017\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u000bH\u0017¢\u0006\u0004\b \u0010\rJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b!\u0010\u001aJ#\u0010!\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0017¢\u0006\u0004\b!\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010\u0013J\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\"\u0010\rJ\u0017\u0010#\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b#\u0010\u001aJ#\u0010#\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0016¢\u0006\u0004\b#\u0010\u001fJ\u0017\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0011H\u0016¢\u0006\u0004\b$\u0010\u0013J\u0017\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010\rJ\u0017\u0010%\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b%\u0010\u001aJ#\u0010%\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0016¢\u0006\u0004\b%\u0010\u001fJ\u0017\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0011H\u0017¢\u0006\u0004\b&\u0010\u0013J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u000bH\u0017¢\u0006\u0004\b&\u0010\rJ\u0017\u0010'\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b'\u0010\u001aJ#\u0010'\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0017¢\u0006\u0004\b'\u0010\u001fJ\u0017\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0011H\u0016¢\u0006\u0004\b(\u0010\u0013J\u0017\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u000bH\u0016¢\u0006\u0004\b(\u0010\rJ\u0017\u0010)\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b)\u0010\u001aJ#\u0010)\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0016¢\u0006\u0004\b)\u0010\u001fJ\u0017\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*H\u0017¢\u0006\u0004\b+\u0010,J\u0017\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u000bH\u0017¢\u0006\u0004\b+\u0010\rJ\u0017\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010\tJ\u0017\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u000bH\u0016¢\u0006\u0004\b-\u0010\rJ\u0019\u0010-\u001a\u00020\u00002\b\b\u0001\u0010-\u001a\u00020.H\u0016¢\u0006\u0004\b-\u0010/J\u0017\u00100\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b0\u0010\u001aJ#\u00100\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0016¢\u0006\u0004\b0\u0010\u001fJ\u0017\u00101\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0003H\u0017¢\u0006\u0004\b1\u0010\tJ\u0017\u00101\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u000bH\u0017¢\u0006\u0004\b1\u0010\rJ\u0017\u00102\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0011H\u0016¢\u0006\u0004\b2\u0010\u0013J\u0017\u00102\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u000bH\u0016¢\u0006\u0004\b2\u0010\rJ\u0017\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0011H\u0016¢\u0006\u0004\b3\u0010\u0013J\u0017\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u000bH\u0016¢\u0006\u0004\b3\u0010\rJ\u0017\u00104\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b4\u0010\u001aJ#\u00104\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0016¢\u0006\u0004\b4\u0010\u001fJ\u0017\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0003H\u0017¢\u0006\u0004\b5\u0010\tJ\u0017\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u000bH\u0017¢\u0006\u0004\b5\u0010\rJ\u0019\u00105\u001a\u00020\u00002\b\b\u0001\u00105\u001a\u00020.H\u0017¢\u0006\u0004\b5\u0010/J\u0017\u00106\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b6\u0010\u001aJ#\u00106\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0017¢\u0006\u0004\b6\u0010\u001fJ\u0017\u00107\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0003H\u0017¢\u0006\u0004\b7\u0010\tJ\u0017\u00107\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u000bH\u0017¢\u0006\u0004\b7\u0010\rJ\u0017\u00108\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0011H\u0017¢\u0006\u0004\b8\u0010\u0013J\u0017\u00108\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u000bH\u0017¢\u0006\u0004\b8\u0010\rJ\u0017\u00109\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b9\u0010\u001aJ#\u00109\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0017¢\u0006\u0004\b9\u0010\u001fJ\u0017\u0010:\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u0011H\u0017¢\u0006\u0004\b:\u0010\u0013J\u0017\u0010:\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u000bH\u0017¢\u0006\u0004\b:\u0010\rJ\u0017\u0010;\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b;\u0010\u001aJ#\u0010;\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0017¢\u0006\u0004\b;\u0010\u001fJ\u0017\u0010<\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u0011H\u0017¢\u0006\u0004\b<\u0010\u0013J\u0017\u0010<\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u000bH\u0017¢\u0006\u0004\b<\u0010\rJ\u0017\u0010=\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b=\u0010\u001aJ#\u0010=\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0017¢\u0006\u0004\b=\u0010\u001fJ\u0017\u0010>\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0011H\u0017¢\u0006\u0004\b>\u0010\u0013J\u0017\u0010>\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u000bH\u0017¢\u0006\u0004\b>\u0010\rJ\u0017\u0010?\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b?\u0010\u001aJ#\u0010?\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0017¢\u0006\u0004\b?\u0010\u001fJ\u0017\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u0011H\u0016¢\u0006\u0004\b@\u0010\u0013J\u0017\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u000bH\u0016¢\u0006\u0004\b@\u0010\rJ\u0017\u0010A\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\bA\u0010\u001aJ#\u0010A\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0016¢\u0006\u0004\bA\u0010\u001fJ\u0017\u0010C\u001a\u00020\u00002\u0006\u0010C\u001a\u00020BH\u0017¢\u0006\u0004\bC\u0010DJ\u0017\u0010C\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u000bH\u0017¢\u0006\u0004\bC\u0010\rJ\u0017\u0010E\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u0011H\u0017¢\u0006\u0004\bE\u0010\u0013J\u0017\u0010E\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u000bH\u0017¢\u0006\u0004\bE\u0010\rJ\u0017\u0010F\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\bF\u0010\u001aJ#\u0010F\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0017¢\u0006\u0004\bF\u0010\u001fJ\u0017\u0010G\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\u0011H\u0016¢\u0006\u0004\bG\u0010\u0013J\u0017\u0010G\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\u000bH\u0016¢\u0006\u0004\bG\u0010\rJ\u0017\u0010H\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\bH\u0010\u001aJ#\u0010H\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0016¢\u0006\u0004\bH\u0010\u001fJ\u0017\u0010I\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u0003H\u0016¢\u0006\u0004\bI\u0010\tJ\u0017\u0010I\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u000bH\u0016¢\u0006\u0004\bI\u0010\rJ\u0017\u0010J\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0011H\u0016¢\u0006\u0004\bJ\u0010\u0013J\u0017\u0010J\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u000bH\u0016¢\u0006\u0004\bJ\u0010\rJ\u0017\u0010L\u001a\u00020\u00002\u0006\u0010L\u001a\u00020KH\u0017¢\u0006\u0004\bL\u0010MJ\u0017\u0010L\u001a\u00020\u00002\u0006\u0010L\u001a\u00020\u000bH\u0017¢\u0006\u0004\bL\u0010\rJ\u001d\u0010O\u001a\u00020\u00002\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00110NH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010O\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\u000bH\u0016¢\u0006\u0004\bO\u0010\rJ\u0017\u0010Q\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\bQ\u0010\u001aJ#\u0010Q\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0016¢\u0006\u0004\bQ\u0010\u001fJ\u0017\u0010S\u001a\u00020\u00002\u0006\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010S\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\u000bH\u0016¢\u0006\u0004\bS\u0010\rJ\u0017\u0010U\u001a\u00020\u00002\u0006\u0010U\u001a\u00020KH\u0016¢\u0006\u0004\bU\u0010MJ\u0017\u0010U\u001a\u00020\u00002\u0006\u0010U\u001a\u00020\u000bH\u0016¢\u0006\u0004\bU\u0010\rJ\u0017\u0010V\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u0011H\u0017¢\u0006\u0004\bV\u0010\u0013J\u0017\u0010V\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u000bH\u0017¢\u0006\u0004\bV\u0010\rJ\u0017\u0010W\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\bW\u0010\u001aJ#\u0010W\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0017¢\u0006\u0004\bW\u0010\u001fJ\u000f\u0010Z\u001a\u00020\u0003H\u0010¢\u0006\u0004\bX\u0010YR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010[\u001a\u0004\b\\\u0010YR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010[\u001a\u0004\b]\u0010YR\u0013\u0010\b\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b^\u0010YR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010YR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0016\u0010e\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010aR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010gR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\f\u0012\u0004\bj\u0010k\u001a\u0004\bi\u0010gR\u001c\u0010n\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bm\u0010k\u001a\u0004\bl\u0010aR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\f\u0012\u0004\bp\u0010k\u001a\u0004\bo\u0010gR\u001c\u0010s\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\br\u0010k\u001a\u0004\bq\u0010aR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00178FX\u0087\u0004¢\u0006\f\u0012\u0004\bv\u0010k\u001a\u0004\bt\u0010uR\u001c\u0010 \u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\f\u0012\u0004\bx\u0010k\u001a\u0004\bw\u0010gR\u001c\u0010{\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bz\u0010k\u001a\u0004\by\u0010aR\u001c\u0010!\u001a\u0004\u0018\u00010\u00178FX\u0087\u0004¢\u0006\f\u0012\u0004\b}\u0010k\u001a\u0004\b|\u0010uR\u0013\u0010\"\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b~\u0010gR\u0014\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u007f\u0010aR\u0014\u0010#\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010uR\u0014\u0010$\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010gR\u0015\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010aR\u0014\u0010%\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010uR\u001e\u0010&\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0087\u0001\u0010k\u001a\u0005\b\u0086\u0001\u0010gR\u001f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0089\u0001\u0010k\u001a\u0005\b\u0088\u0001\u0010aR\u001e\u0010'\u001a\u0004\u0018\u00010\u00178FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008c\u0001\u0010k\u001a\u0005\b\u008b\u0001\u0010uR\u0014\u0010(\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010gR\u0015\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010aR\u0014\u0010)\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010uR\u001f\u0010+\u001a\u0004\u0018\u00010*8FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b\u0093\u0001\u0010k\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0095\u0001\u0010k\u001a\u0005\b\u0094\u0001\u0010aR\u0014\u0010-\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010YR\u0015\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010aR\u0016\u0010\u009c\u0001\u001a\u0004\u0018\u00010.8G¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0014\u00100\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010uR\u001e\u00101\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u009f\u0001\u0010k\u001a\u0005\b\u009e\u0001\u0010YR\u001f\u0010¢\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¡\u0001\u0010k\u001a\u0005\b \u0001\u0010aR\u0014\u00102\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0007\u001a\u0005\b£\u0001\u0010gR\u0015\u0010¥\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010aR\u0014\u00103\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010gR\u0015\u0010¨\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b§\u0001\u0010aR\u0014\u00104\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0007\u001a\u0005\b©\u0001\u0010uR\u001e\u00105\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b«\u0001\u0010k\u001a\u0005\bª\u0001\u0010YR\u001f\u0010®\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u00ad\u0001\u0010k\u001a\u0005\b¬\u0001\u0010aR \u0010±\u0001\u001a\u0004\u0018\u00010.8GX\u0087\u0004¢\u0006\u000f\u0012\u0005\b°\u0001\u0010k\u001a\u0006\b¯\u0001\u0010\u009b\u0001R\u001e\u00106\u001a\u0004\u0018\u00010\u00178FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b³\u0001\u0010k\u001a\u0005\b²\u0001\u0010uR\u001e\u00107\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bµ\u0001\u0010k\u001a\u0005\b´\u0001\u0010YR\u001f\u0010¸\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b·\u0001\u0010k\u001a\u0005\b¶\u0001\u0010aR\u001e\u00108\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bº\u0001\u0010k\u001a\u0005\b¹\u0001\u0010gR\u001f\u0010½\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¼\u0001\u0010k\u001a\u0005\b»\u0001\u0010aR\u001e\u00109\u001a\u0004\u0018\u00010\u00178FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¿\u0001\u0010k\u001a\u0005\b¾\u0001\u0010uR\u001e\u0010:\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÁ\u0001\u0010k\u001a\u0005\bÀ\u0001\u0010gR\u001f\u0010Ä\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÃ\u0001\u0010k\u001a\u0005\bÂ\u0001\u0010aR\u001e\u0010;\u001a\u0004\u0018\u00010\u00178FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÆ\u0001\u0010k\u001a\u0005\bÅ\u0001\u0010uR\u001e\u0010<\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÈ\u0001\u0010k\u001a\u0005\bÇ\u0001\u0010gR\u001f\u0010Ë\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÊ\u0001\u0010k\u001a\u0005\bÉ\u0001\u0010aR\u001e\u0010=\u001a\u0004\u0018\u00010\u00178FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÍ\u0001\u0010k\u001a\u0005\bÌ\u0001\u0010uR\u001e\u0010>\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÏ\u0001\u0010k\u001a\u0005\bÎ\u0001\u0010gR\u001f\u0010Ò\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÑ\u0001\u0010k\u001a\u0005\bÐ\u0001\u0010aR\u001e\u0010?\u001a\u0004\u0018\u00010\u00178FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÔ\u0001\u0010k\u001a\u0005\bÓ\u0001\u0010uR\u0014\u0010@\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0007\u001a\u0005\bÕ\u0001\u0010gR\u0015\u0010×\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\bÖ\u0001\u0010aR\u0014\u0010A\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0007\u001a\u0005\bØ\u0001\u0010uR\u001f\u0010C\u001a\u0004\u0018\u00010B8FX\u0087\u0004¢\u0006\u000f\u0012\u0005\bÛ\u0001\u0010k\u001a\u0006\bÙ\u0001\u0010Ú\u0001R\u001f\u0010Þ\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÝ\u0001\u0010k\u001a\u0005\bÜ\u0001\u0010aR\u001e\u0010E\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bà\u0001\u0010k\u001a\u0005\bß\u0001\u0010gR\u001f\u0010ã\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bâ\u0001\u0010k\u001a\u0005\bá\u0001\u0010aR\u001e\u0010F\u001a\u0004\u0018\u00010\u00178FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bå\u0001\u0010k\u001a\u0005\bä\u0001\u0010uR\u0014\u0010G\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0007\u001a\u0005\bæ\u0001\u0010gR\u0015\u0010è\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\bç\u0001\u0010aR\u0014\u0010H\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0007\u001a\u0005\bé\u0001\u0010uR\u0014\u0010I\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0007\u001a\u0005\bê\u0001\u0010YR\u0015\u0010ì\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\bë\u0001\u0010aR\u0014\u0010J\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0007\u001a\u0005\bí\u0001\u0010gR\u0015\u0010ï\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\bî\u0001\u0010aR\u001f\u0010L\u001a\u0004\u0018\u00010K8FX\u0087\u0004¢\u0006\u000f\u0012\u0005\bò\u0001\u0010k\u001a\u0006\bð\u0001\u0010ñ\u0001R\u001f\u0010õ\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bô\u0001\u0010k\u001a\u0005\bó\u0001\u0010aR\u001b\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010N8F¢\u0006\b\u001a\u0006\bö\u0001\u0010÷\u0001R\u0015\u0010ù\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\bø\u0001\u0010aR\u0014\u0010Q\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0007\u001a\u0005\bú\u0001\u0010uR\u0015\u0010S\u001a\u0004\u0018\u00010R8F¢\u0006\b\u001a\u0006\bû\u0001\u0010ü\u0001R\u0015\u0010þ\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\bý\u0001\u0010aR\u0015\u0010U\u001a\u0004\u0018\u00010K8F¢\u0006\b\u001a\u0006\bÿ\u0001\u0010ñ\u0001R\u0015\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b\u0080\u0002\u0010aR\u001e\u0010V\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0083\u0002\u0010k\u001a\u0005\b\u0082\u0002\u0010gR\u001f\u0010\u0086\u0002\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0085\u0002\u0010k\u001a\u0005\b\u0084\u0002\u0010aR\u001e\u0010W\u001a\u0004\u0018\u00010\u00178FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0088\u0002\u0010k\u001a\u0005\b\u0087\u0002\u0010u¨\u0006\u008a\u0002"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayerDsl;", "Lcom/mapbox/maps/extension/style/layers/Layer;", "", "layerId", "sourceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sourceLayer", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "slot", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "filter", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "maxZoom", "fillExtrusionEdgeRadius", "fillExtrusionAmbientOcclusionGroundAttenuation", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "fillExtrusionAmbientOcclusionGroundAttenuationTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "fillExtrusionAmbientOcclusionGroundRadius", "fillExtrusionAmbientOcclusionGroundRadiusTransition", "fillExtrusionAmbientOcclusionIntensity", "fillExtrusionAmbientOcclusionIntensityTransition", "fillExtrusionAmbientOcclusionRadius", "fillExtrusionAmbientOcclusionRadiusTransition", "fillExtrusionAmbientOcclusionWallRadius", "fillExtrusionAmbientOcclusionWallRadiusTransition", "fillExtrusionBase", "fillExtrusionBaseTransition", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionBaseAlignment;", "fillExtrusionBaseAlignment", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionBaseAlignment;)Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "fillExtrusionColor", "", "(I)Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "fillExtrusionColorTransition", "fillExtrusionColorUseTheme", "fillExtrusionCutoffFadeRange", "fillExtrusionEmissiveStrength", "fillExtrusionEmissiveStrengthTransition", "fillExtrusionFloodLightColor", "fillExtrusionFloodLightColorTransition", "fillExtrusionFloodLightColorUseTheme", "fillExtrusionFloodLightGroundAttenuation", "fillExtrusionFloodLightGroundAttenuationTransition", "fillExtrusionFloodLightGroundRadius", "fillExtrusionFloodLightGroundRadiusTransition", "fillExtrusionFloodLightIntensity", "fillExtrusionFloodLightIntensityTransition", "fillExtrusionFloodLightWallRadius", "fillExtrusionFloodLightWallRadiusTransition", "fillExtrusionHeight", "fillExtrusionHeightTransition", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionHeightAlignment;", "fillExtrusionHeightAlignment", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionHeightAlignment;)Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "fillExtrusionLineWidth", "fillExtrusionLineWidthTransition", "fillExtrusionOpacity", "fillExtrusionOpacityTransition", "fillExtrusionPattern", "fillExtrusionPatternCrossFade", "", "fillExtrusionRoundedRoof", "(Z)Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "", "fillExtrusionTranslate", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "fillExtrusionTranslateTransition", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionTranslateAnchor;", "fillExtrusionTranslateAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionTranslateAnchor;)Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "fillExtrusionVerticalGradient", "fillExtrusionVerticalScale", "fillExtrusionVerticalScaleTransition", "getType$extension_style_release", "()Ljava/lang/String;", "getType", "Ljava/lang/String;", "getLayerId", "getSourceId", "getSourceLayer", "getSlot", "getFilter", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getVisibilityAsExpression", "visibilityAsExpression", "getMinZoom", "()Ljava/lang/Double;", "getMaxZoom", "getFillExtrusionEdgeRadius", "getFillExtrusionEdgeRadius$annotations", "()V", "getFillExtrusionEdgeRadiusAsExpression", "getFillExtrusionEdgeRadiusAsExpression$annotations", "fillExtrusionEdgeRadiusAsExpression", "getFillExtrusionAmbientOcclusionGroundAttenuation", "getFillExtrusionAmbientOcclusionGroundAttenuation$annotations", "getFillExtrusionAmbientOcclusionGroundAttenuationAsExpression", "getFillExtrusionAmbientOcclusionGroundAttenuationAsExpression$annotations", "fillExtrusionAmbientOcclusionGroundAttenuationAsExpression", "getFillExtrusionAmbientOcclusionGroundAttenuationTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getFillExtrusionAmbientOcclusionGroundAttenuationTransition$annotations", "getFillExtrusionAmbientOcclusionGroundRadius", "getFillExtrusionAmbientOcclusionGroundRadius$annotations", "getFillExtrusionAmbientOcclusionGroundRadiusAsExpression", "getFillExtrusionAmbientOcclusionGroundRadiusAsExpression$annotations", "fillExtrusionAmbientOcclusionGroundRadiusAsExpression", "getFillExtrusionAmbientOcclusionGroundRadiusTransition", "getFillExtrusionAmbientOcclusionGroundRadiusTransition$annotations", "getFillExtrusionAmbientOcclusionIntensity", "getFillExtrusionAmbientOcclusionIntensityAsExpression", "fillExtrusionAmbientOcclusionIntensityAsExpression", "getFillExtrusionAmbientOcclusionIntensityTransition", "getFillExtrusionAmbientOcclusionRadius", "getFillExtrusionAmbientOcclusionRadiusAsExpression", "fillExtrusionAmbientOcclusionRadiusAsExpression", "getFillExtrusionAmbientOcclusionRadiusTransition", "getFillExtrusionAmbientOcclusionWallRadius", "getFillExtrusionAmbientOcclusionWallRadius$annotations", "getFillExtrusionAmbientOcclusionWallRadiusAsExpression", "getFillExtrusionAmbientOcclusionWallRadiusAsExpression$annotations", "fillExtrusionAmbientOcclusionWallRadiusAsExpression", "getFillExtrusionAmbientOcclusionWallRadiusTransition", "getFillExtrusionAmbientOcclusionWallRadiusTransition$annotations", "getFillExtrusionBase", "getFillExtrusionBaseAsExpression", "fillExtrusionBaseAsExpression", "getFillExtrusionBaseTransition", "getFillExtrusionBaseAlignment", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionBaseAlignment;", "getFillExtrusionBaseAlignment$annotations", "getFillExtrusionBaseAlignmentAsExpression", "getFillExtrusionBaseAlignmentAsExpression$annotations", "fillExtrusionBaseAlignmentAsExpression", "getFillExtrusionColor", "getFillExtrusionColorAsExpression", "fillExtrusionColorAsExpression", "getFillExtrusionColorAsColorInt", "()Ljava/lang/Integer;", "fillExtrusionColorAsColorInt", "getFillExtrusionColorTransition", "getFillExtrusionColorUseTheme", "getFillExtrusionColorUseTheme$annotations", "getFillExtrusionColorUseThemeAsExpression", "getFillExtrusionColorUseThemeAsExpression$annotations", "fillExtrusionColorUseThemeAsExpression", "getFillExtrusionCutoffFadeRange", "getFillExtrusionCutoffFadeRangeAsExpression", "fillExtrusionCutoffFadeRangeAsExpression", "getFillExtrusionEmissiveStrength", "getFillExtrusionEmissiveStrengthAsExpression", "fillExtrusionEmissiveStrengthAsExpression", "getFillExtrusionEmissiveStrengthTransition", "getFillExtrusionFloodLightColor", "getFillExtrusionFloodLightColor$annotations", "getFillExtrusionFloodLightColorAsExpression", "getFillExtrusionFloodLightColorAsExpression$annotations", "fillExtrusionFloodLightColorAsExpression", "getFillExtrusionFloodLightColorAsColorInt", "getFillExtrusionFloodLightColorAsColorInt$annotations", "fillExtrusionFloodLightColorAsColorInt", "getFillExtrusionFloodLightColorTransition", "getFillExtrusionFloodLightColorTransition$annotations", "getFillExtrusionFloodLightColorUseTheme", "getFillExtrusionFloodLightColorUseTheme$annotations", "getFillExtrusionFloodLightColorUseThemeAsExpression", "getFillExtrusionFloodLightColorUseThemeAsExpression$annotations", "fillExtrusionFloodLightColorUseThemeAsExpression", "getFillExtrusionFloodLightGroundAttenuation", "getFillExtrusionFloodLightGroundAttenuation$annotations", "getFillExtrusionFloodLightGroundAttenuationAsExpression", "getFillExtrusionFloodLightGroundAttenuationAsExpression$annotations", "fillExtrusionFloodLightGroundAttenuationAsExpression", "getFillExtrusionFloodLightGroundAttenuationTransition", "getFillExtrusionFloodLightGroundAttenuationTransition$annotations", "getFillExtrusionFloodLightGroundRadius", "getFillExtrusionFloodLightGroundRadius$annotations", "getFillExtrusionFloodLightGroundRadiusAsExpression", "getFillExtrusionFloodLightGroundRadiusAsExpression$annotations", "fillExtrusionFloodLightGroundRadiusAsExpression", "getFillExtrusionFloodLightGroundRadiusTransition", "getFillExtrusionFloodLightGroundRadiusTransition$annotations", "getFillExtrusionFloodLightIntensity", "getFillExtrusionFloodLightIntensity$annotations", "getFillExtrusionFloodLightIntensityAsExpression", "getFillExtrusionFloodLightIntensityAsExpression$annotations", "fillExtrusionFloodLightIntensityAsExpression", "getFillExtrusionFloodLightIntensityTransition", "getFillExtrusionFloodLightIntensityTransition$annotations", "getFillExtrusionFloodLightWallRadius", "getFillExtrusionFloodLightWallRadius$annotations", "getFillExtrusionFloodLightWallRadiusAsExpression", "getFillExtrusionFloodLightWallRadiusAsExpression$annotations", "fillExtrusionFloodLightWallRadiusAsExpression", "getFillExtrusionFloodLightWallRadiusTransition", "getFillExtrusionFloodLightWallRadiusTransition$annotations", "getFillExtrusionHeight", "getFillExtrusionHeightAsExpression", "fillExtrusionHeightAsExpression", "getFillExtrusionHeightTransition", "getFillExtrusionHeightAlignment", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionHeightAlignment;", "getFillExtrusionHeightAlignment$annotations", "getFillExtrusionHeightAlignmentAsExpression", "getFillExtrusionHeightAlignmentAsExpression$annotations", "fillExtrusionHeightAlignmentAsExpression", "getFillExtrusionLineWidth", "getFillExtrusionLineWidth$annotations", "getFillExtrusionLineWidthAsExpression", "getFillExtrusionLineWidthAsExpression$annotations", "fillExtrusionLineWidthAsExpression", "getFillExtrusionLineWidthTransition", "getFillExtrusionLineWidthTransition$annotations", "getFillExtrusionOpacity", "getFillExtrusionOpacityAsExpression", "fillExtrusionOpacityAsExpression", "getFillExtrusionOpacityTransition", "getFillExtrusionPattern", "getFillExtrusionPatternAsExpression", "fillExtrusionPatternAsExpression", "getFillExtrusionPatternCrossFade", "getFillExtrusionPatternCrossFadeAsExpression", "fillExtrusionPatternCrossFadeAsExpression", "getFillExtrusionRoundedRoof", "()Ljava/lang/Boolean;", "getFillExtrusionRoundedRoof$annotations", "getFillExtrusionRoundedRoofAsExpression", "getFillExtrusionRoundedRoofAsExpression$annotations", "fillExtrusionRoundedRoofAsExpression", "getFillExtrusionTranslate", "()Ljava/util/List;", "getFillExtrusionTranslateAsExpression", "fillExtrusionTranslateAsExpression", "getFillExtrusionTranslateTransition", "getFillExtrusionTranslateAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionTranslateAnchor;", "getFillExtrusionTranslateAnchorAsExpression", "fillExtrusionTranslateAnchorAsExpression", "getFillExtrusionVerticalGradient", "getFillExtrusionVerticalGradientAsExpression", "fillExtrusionVerticalGradientAsExpression", "getFillExtrusionVerticalScale", "getFillExtrusionVerticalScale$annotations", "getFillExtrusionVerticalScaleAsExpression", "getFillExtrusionVerticalScaleAsExpression$annotations", "fillExtrusionVerticalScaleAsExpression", "getFillExtrusionVerticalScaleTransition", "getFillExtrusionVerticalScaleTransition$annotations", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FillExtrusionLayer extends Layer implements FillExtrusionLayerDsl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String layerId;
    private final String sourceId;

    public FillExtrusionLayer(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.layerId = str;
        this.sourceId = str2;
        setInternalSourceId$extension_style_release(str2);
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionAmbientOcclusionGroundAttenuation$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionAmbientOcclusionGroundAttenuationAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionAmbientOcclusionGroundAttenuationTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionAmbientOcclusionGroundRadius$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionAmbientOcclusionGroundRadiusAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionAmbientOcclusionGroundRadiusTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionAmbientOcclusionWallRadius$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionAmbientOcclusionWallRadiusAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionAmbientOcclusionWallRadiusTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionBaseAlignment$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionBaseAlignmentAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionEdgeRadius$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionEdgeRadiusAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightColor$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightColorAsColorInt$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightColorAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightColorTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightGroundAttenuation$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightGroundAttenuationAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightGroundAttenuationTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightGroundRadius$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightGroundRadiusAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightGroundRadiusTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightIntensity$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightIntensityAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightIntensityTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightWallRadius$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightWallRadiusAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionFloodLightWallRadiusTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionHeightAlignment$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionHeightAlignmentAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionLineWidth$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionLineWidthAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionLineWidthTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionRoundedRoof$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionRoundedRoofAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionVerticalScale$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionVerticalScaleAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillExtrusionVerticalScaleTransition$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionAmbientOcclusionGroundAttenuation(double fillExtrusionAmbientOcclusionGroundAttenuation) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-ambient-occlusion-ground-attenuation", Double.valueOf(fillExtrusionAmbientOcclusionGroundAttenuation)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionAmbientOcclusionGroundAttenuationTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionAmbientOcclusionGroundAttenuationTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionAmbientOcclusionGroundRadius(double fillExtrusionAmbientOcclusionGroundRadius) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-ambient-occlusion-ground-radius", Double.valueOf(fillExtrusionAmbientOcclusionGroundRadius)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionAmbientOcclusionGroundRadiusTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionAmbientOcclusionGroundRadiusTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionAmbientOcclusionIntensity(double fillExtrusionAmbientOcclusionIntensity) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-ambient-occlusion-intensity", Double.valueOf(fillExtrusionAmbientOcclusionIntensity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionAmbientOcclusionIntensityTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionAmbientOcclusionIntensityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionAmbientOcclusionRadius(double fillExtrusionAmbientOcclusionRadius) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-ambient-occlusion-radius", Double.valueOf(fillExtrusionAmbientOcclusionRadius)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionAmbientOcclusionRadiusTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionAmbientOcclusionRadiusTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionAmbientOcclusionWallRadius(double fillExtrusionAmbientOcclusionWallRadius) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-ambient-occlusion-wall-radius", Double.valueOf(fillExtrusionAmbientOcclusionWallRadius)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionAmbientOcclusionWallRadiusTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionAmbientOcclusionWallRadiusTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionBase(double fillExtrusionBase) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-base", Double.valueOf(fillExtrusionBase)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionBaseAlignment(FillExtrusionBaseAlignment fillExtrusionBaseAlignment) {
        fillExtrusionBaseAlignment.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-base-alignment", fillExtrusionBaseAlignment));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionBaseTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionBaseTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionColor(int fillExtrusionColor) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(fillExtrusionColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionColorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionColorUseTheme(String fillExtrusionColorUseTheme) {
        fillExtrusionColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-color-use-theme", fillExtrusionColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionCutoffFadeRange(double fillExtrusionCutoffFadeRange) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-cutoff-fade-range", Double.valueOf(fillExtrusionCutoffFadeRange)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionEdgeRadius(double fillExtrusionEdgeRadius) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-edge-radius", Double.valueOf(fillExtrusionEdgeRadius)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionEmissiveStrength(double fillExtrusionEmissiveStrength) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-emissive-strength", Double.valueOf(fillExtrusionEmissiveStrength)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionEmissiveStrengthTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionEmissiveStrengthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionFloodLightColor(int fillExtrusionFloodLightColor) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-flood-light-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(fillExtrusionFloodLightColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionFloodLightColorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionFloodLightColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionFloodLightColorUseTheme(String fillExtrusionFloodLightColorUseTheme) {
        fillExtrusionFloodLightColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-flood-light-color-use-theme", fillExtrusionFloodLightColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionFloodLightGroundAttenuation(double fillExtrusionFloodLightGroundAttenuation) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-flood-light-ground-attenuation", Double.valueOf(fillExtrusionFloodLightGroundAttenuation)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionFloodLightGroundAttenuationTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionFloodLightGroundAttenuationTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionFloodLightGroundRadius(double fillExtrusionFloodLightGroundRadius) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-flood-light-ground-radius", Double.valueOf(fillExtrusionFloodLightGroundRadius)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionFloodLightGroundRadiusTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionFloodLightGroundRadiusTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionFloodLightIntensity(double fillExtrusionFloodLightIntensity) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-flood-light-intensity", Double.valueOf(fillExtrusionFloodLightIntensity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionFloodLightIntensityTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionFloodLightIntensityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionFloodLightWallRadius(double fillExtrusionFloodLightWallRadius) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-flood-light-wall-radius", Double.valueOf(fillExtrusionFloodLightWallRadius)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionFloodLightWallRadiusTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionFloodLightWallRadiusTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionHeight(double fillExtrusionHeight) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-height", Double.valueOf(fillExtrusionHeight)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionHeightAlignment(FillExtrusionHeightAlignment fillExtrusionHeightAlignment) {
        fillExtrusionHeightAlignment.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-height-alignment", fillExtrusionHeightAlignment));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionHeightTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionHeightTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionLineWidth(double fillExtrusionLineWidth) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-line-width", Double.valueOf(fillExtrusionLineWidth)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionLineWidthTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionLineWidthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionOpacity(double fillExtrusionOpacity) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-opacity", Double.valueOf(fillExtrusionOpacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionOpacityTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionOpacityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionPattern(String fillExtrusionPattern) {
        fillExtrusionPattern.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-pattern", fillExtrusionPattern));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionPatternCrossFade(double fillExtrusionPatternCrossFade) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-pattern-cross-fade", Double.valueOf(fillExtrusionPatternCrossFade)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionRoundedRoof(boolean fillExtrusionRoundedRoof) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-rounded-roof", Boolean.valueOf(fillExtrusionRoundedRoof)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionTranslate(List<Double> fillExtrusionTranslate) {
        fillExtrusionTranslate.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-translate", fillExtrusionTranslate));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionTranslateAnchor(FillExtrusionTranslateAnchor fillExtrusionTranslateAnchor) {
        fillExtrusionTranslateAnchor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-translate-anchor", fillExtrusionTranslateAnchor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionTranslateTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionTranslateTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionVerticalGradient(boolean fillExtrusionVerticalGradient) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-vertical-gradient", Boolean.valueOf(fillExtrusionVerticalGradient)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionVerticalScale(double fillExtrusionVerticalScale) {
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-vertical-scale", Double.valueOf(fillExtrusionVerticalScale)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionVerticalScaleTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        fillExtrusionVerticalScaleTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer filter(Expression filter) {
        q2.n(filter, "filter", filter, this);
        return this;
    }

    public final Double getFillExtrusionAmbientOcclusionGroundAttenuation() {
        return (Double) getPropertyValueWithType("fill-extrusion-ambient-occlusion-ground-attenuation", Double.class);
    }

    public final Expression getFillExtrusionAmbientOcclusionGroundAttenuationAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-ambient-occlusion-ground-attenuation");
    }

    public final StyleTransition getFillExtrusionAmbientOcclusionGroundAttenuationTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-ambient-occlusion-ground-attenuation-transition", StyleTransition.class);
    }

    public final Double getFillExtrusionAmbientOcclusionGroundRadius() {
        return (Double) getPropertyValueWithType("fill-extrusion-ambient-occlusion-ground-radius", Double.class);
    }

    public final Expression getFillExtrusionAmbientOcclusionGroundRadiusAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-ambient-occlusion-ground-radius");
    }

    public final StyleTransition getFillExtrusionAmbientOcclusionGroundRadiusTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-ambient-occlusion-ground-radius-transition", StyleTransition.class);
    }

    public final Double getFillExtrusionAmbientOcclusionIntensity() {
        return (Double) getPropertyValueWithType("fill-extrusion-ambient-occlusion-intensity", Double.class);
    }

    public final Expression getFillExtrusionAmbientOcclusionIntensityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-ambient-occlusion-intensity");
    }

    public final StyleTransition getFillExtrusionAmbientOcclusionIntensityTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-ambient-occlusion-intensity-transition", StyleTransition.class);
    }

    public final Double getFillExtrusionAmbientOcclusionRadius() {
        return (Double) getPropertyValueWithType("fill-extrusion-ambient-occlusion-radius", Double.class);
    }

    public final Expression getFillExtrusionAmbientOcclusionRadiusAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-ambient-occlusion-radius");
    }

    public final StyleTransition getFillExtrusionAmbientOcclusionRadiusTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-ambient-occlusion-radius-transition", StyleTransition.class);
    }

    public final Double getFillExtrusionAmbientOcclusionWallRadius() {
        return (Double) getPropertyValueWithType("fill-extrusion-ambient-occlusion-wall-radius", Double.class);
    }

    public final Expression getFillExtrusionAmbientOcclusionWallRadiusAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-ambient-occlusion-wall-radius");
    }

    public final StyleTransition getFillExtrusionAmbientOcclusionWallRadiusTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-ambient-occlusion-wall-radius-transition", StyleTransition.class);
    }

    public final Double getFillExtrusionBase() {
        return (Double) getPropertyValueWithType("fill-extrusion-base", Double.class);
    }

    public final FillExtrusionBaseAlignment getFillExtrusionBaseAlignment() {
        String str = (String) getPropertyValueWithType("fill-extrusion-base-alignment", String.class);
        if (str == null) {
            return null;
        }
        FillExtrusionBaseAlignment.Companion companion = FillExtrusionBaseAlignment.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    public final Expression getFillExtrusionBaseAlignmentAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("fill-extrusion-base-alignment", Expression.class);
        if (expression != null) {
            return expression;
        }
        FillExtrusionBaseAlignment fillExtrusionBaseAlignment = getFillExtrusionBaseAlignment();
        if (fillExtrusionBaseAlignment != null) {
            return Expression.INSTANCE.literal(fillExtrusionBaseAlignment.getValue());
        }
        return null;
    }

    public final Expression getFillExtrusionBaseAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-base");
    }

    public final StyleTransition getFillExtrusionBaseTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-base-transition", StyleTransition.class);
    }

    public final String getFillExtrusionColor() {
        Expression fillExtrusionColorAsExpression = getFillExtrusionColorAsExpression();
        if (fillExtrusionColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(fillExtrusionColorAsExpression);
        }
        return null;
    }

    public final Integer getFillExtrusionColorAsColorInt() {
        Expression fillExtrusionColorAsExpression = getFillExtrusionColorAsExpression();
        if (fillExtrusionColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(fillExtrusionColorAsExpression);
        }
        return null;
    }

    public final Expression getFillExtrusionColorAsExpression() {
        return (Expression) getPropertyValueWithType("fill-extrusion-color", Expression.class);
    }

    public final StyleTransition getFillExtrusionColorTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-color-transition", StyleTransition.class);
    }

    public final String getFillExtrusionColorUseTheme() {
        return (String) getPropertyValueWithType("fill-extrusion-color-use-theme", String.class);
    }

    public final Expression getFillExtrusionColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-color-use-theme");
    }

    public final Double getFillExtrusionCutoffFadeRange() {
        return (Double) getPropertyValueWithType("fill-extrusion-cutoff-fade-range", Double.class);
    }

    public final Expression getFillExtrusionCutoffFadeRangeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-cutoff-fade-range");
    }

    public final Double getFillExtrusionEdgeRadius() {
        return (Double) getPropertyValueWithType("fill-extrusion-edge-radius", Double.class);
    }

    public final Expression getFillExtrusionEdgeRadiusAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-edge-radius");
    }

    public final Double getFillExtrusionEmissiveStrength() {
        return (Double) getPropertyValueWithType("fill-extrusion-emissive-strength", Double.class);
    }

    public final Expression getFillExtrusionEmissiveStrengthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-emissive-strength");
    }

    public final StyleTransition getFillExtrusionEmissiveStrengthTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-emissive-strength-transition", StyleTransition.class);
    }

    public final String getFillExtrusionFloodLightColor() {
        Expression fillExtrusionFloodLightColorAsExpression = getFillExtrusionFloodLightColorAsExpression();
        if (fillExtrusionFloodLightColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(fillExtrusionFloodLightColorAsExpression);
        }
        return null;
    }

    public final Integer getFillExtrusionFloodLightColorAsColorInt() {
        Expression fillExtrusionFloodLightColorAsExpression = getFillExtrusionFloodLightColorAsExpression();
        if (fillExtrusionFloodLightColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(fillExtrusionFloodLightColorAsExpression);
        }
        return null;
    }

    public final Expression getFillExtrusionFloodLightColorAsExpression() {
        return (Expression) getPropertyValueWithType("fill-extrusion-flood-light-color", Expression.class);
    }

    public final StyleTransition getFillExtrusionFloodLightColorTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-flood-light-color-transition", StyleTransition.class);
    }

    public final String getFillExtrusionFloodLightColorUseTheme() {
        return (String) getPropertyValueWithType("fill-extrusion-flood-light-color-use-theme", String.class);
    }

    public final Expression getFillExtrusionFloodLightColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-flood-light-color-use-theme");
    }

    public final Double getFillExtrusionFloodLightGroundAttenuation() {
        return (Double) getPropertyValueWithType("fill-extrusion-flood-light-ground-attenuation", Double.class);
    }

    public final Expression getFillExtrusionFloodLightGroundAttenuationAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-flood-light-ground-attenuation");
    }

    public final StyleTransition getFillExtrusionFloodLightGroundAttenuationTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-flood-light-ground-attenuation-transition", StyleTransition.class);
    }

    public final Double getFillExtrusionFloodLightGroundRadius() {
        return (Double) getPropertyValueWithType("fill-extrusion-flood-light-ground-radius", Double.class);
    }

    public final Expression getFillExtrusionFloodLightGroundRadiusAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-flood-light-ground-radius");
    }

    public final StyleTransition getFillExtrusionFloodLightGroundRadiusTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-flood-light-ground-radius-transition", StyleTransition.class);
    }

    public final Double getFillExtrusionFloodLightIntensity() {
        return (Double) getPropertyValueWithType("fill-extrusion-flood-light-intensity", Double.class);
    }

    public final Expression getFillExtrusionFloodLightIntensityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-flood-light-intensity");
    }

    public final StyleTransition getFillExtrusionFloodLightIntensityTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-flood-light-intensity-transition", StyleTransition.class);
    }

    public final Double getFillExtrusionFloodLightWallRadius() {
        return (Double) getPropertyValueWithType("fill-extrusion-flood-light-wall-radius", Double.class);
    }

    public final Expression getFillExtrusionFloodLightWallRadiusAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-flood-light-wall-radius");
    }

    public final StyleTransition getFillExtrusionFloodLightWallRadiusTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-flood-light-wall-radius-transition", StyleTransition.class);
    }

    public final Double getFillExtrusionHeight() {
        return (Double) getPropertyValueWithType("fill-extrusion-height", Double.class);
    }

    public final FillExtrusionHeightAlignment getFillExtrusionHeightAlignment() {
        String str = (String) getPropertyValueWithType("fill-extrusion-height-alignment", String.class);
        if (str == null) {
            return null;
        }
        FillExtrusionHeightAlignment.Companion companion = FillExtrusionHeightAlignment.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    public final Expression getFillExtrusionHeightAlignmentAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("fill-extrusion-height-alignment", Expression.class);
        if (expression != null) {
            return expression;
        }
        FillExtrusionHeightAlignment fillExtrusionHeightAlignment = getFillExtrusionHeightAlignment();
        if (fillExtrusionHeightAlignment != null) {
            return Expression.INSTANCE.literal(fillExtrusionHeightAlignment.getValue());
        }
        return null;
    }

    public final Expression getFillExtrusionHeightAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-height");
    }

    public final StyleTransition getFillExtrusionHeightTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-height-transition", StyleTransition.class);
    }

    public final Double getFillExtrusionLineWidth() {
        return (Double) getPropertyValueWithType("fill-extrusion-line-width", Double.class);
    }

    public final Expression getFillExtrusionLineWidthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-line-width");
    }

    public final StyleTransition getFillExtrusionLineWidthTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-line-width-transition", StyleTransition.class);
    }

    public final Double getFillExtrusionOpacity() {
        return (Double) getPropertyValueWithType("fill-extrusion-opacity", Double.class);
    }

    public final Expression getFillExtrusionOpacityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-opacity");
    }

    public final StyleTransition getFillExtrusionOpacityTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-opacity-transition", StyleTransition.class);
    }

    public final String getFillExtrusionPattern() {
        return (String) getPropertyValueWithType("fill-extrusion-pattern", String.class);
    }

    public final Expression getFillExtrusionPatternAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-pattern");
    }

    public final Double getFillExtrusionPatternCrossFade() {
        return (Double) getPropertyValueWithType("fill-extrusion-pattern-cross-fade", Double.class);
    }

    public final Expression getFillExtrusionPatternCrossFadeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-pattern-cross-fade");
    }

    public final Boolean getFillExtrusionRoundedRoof() {
        return (Boolean) getPropertyValueWithType("fill-extrusion-rounded-roof", Boolean.class);
    }

    public final Expression getFillExtrusionRoundedRoofAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-rounded-roof");
    }

    public final List<Double> getFillExtrusionTranslate() {
        return (List) getPropertyValueWithType("fill-extrusion-translate", List.class);
    }

    public final FillExtrusionTranslateAnchor getFillExtrusionTranslateAnchor() {
        String str = (String) getPropertyValueWithType("fill-extrusion-translate-anchor", String.class);
        if (str == null) {
            return null;
        }
        FillExtrusionTranslateAnchor.Companion companion = FillExtrusionTranslateAnchor.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    public final Expression getFillExtrusionTranslateAnchorAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("fill-extrusion-translate-anchor", Expression.class);
        if (expression != null) {
            return expression;
        }
        FillExtrusionTranslateAnchor fillExtrusionTranslateAnchor = getFillExtrusionTranslateAnchor();
        if (fillExtrusionTranslateAnchor != null) {
            return Expression.INSTANCE.literal(fillExtrusionTranslateAnchor.getValue());
        }
        return null;
    }

    public final Expression getFillExtrusionTranslateAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-translate");
    }

    public final StyleTransition getFillExtrusionTranslateTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-translate-transition", StyleTransition.class);
    }

    public final Boolean getFillExtrusionVerticalGradient() {
        return (Boolean) getPropertyValueWithType("fill-extrusion-vertical-gradient", Boolean.class);
    }

    public final Expression getFillExtrusionVerticalGradientAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-vertical-gradient");
    }

    public final Double getFillExtrusionVerticalScale() {
        return (Double) getPropertyValueWithType("fill-extrusion-vertical-scale", Double.class);
    }

    public final Expression getFillExtrusionVerticalScaleAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("fill-extrusion-vertical-scale");
    }

    public final StyleTransition getFillExtrusionVerticalScaleTransition() {
        return (StyleTransition) getPropertyValueWithType("fill-extrusion-vertical-scale-transition", StyleTransition.class);
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
        return "fill-extrusion";
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
    public FillExtrusionLayer maxZoom(double maxZoom) {
        setProperty$extension_style_release(new PropertyValue<>("maxzoom", Double.valueOf(maxZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public FillExtrusionLayer minZoom(double minZoom) {
        setProperty$extension_style_release(new PropertyValue<>("minzoom", Double.valueOf(minZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public FillExtrusionLayer slot(String slot) {
        slot.getClass();
        setProperty$extension_style_release(new PropertyValue<>("slot", slot));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer sourceLayer(String sourceLayer) {
        sourceLayer.getClass();
        setProperty$extension_style_release(new PropertyValue<>("source-layer", sourceLayer));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public FillExtrusionLayer visibility(Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\bU\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\fR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0007R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\fR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b \u0010\u0011R\u0013\u0010!\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0007R\u0013\u0010#\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b$\u0010\fR\u0013\u0010%\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0011R\u001c\u0010'\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0002\u001a\u0004\b)\u0010\u0007R\u001c\u0010*\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0002\u001a\u0004\b,\u0010\fR\u001c\u0010-\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u0002\u001a\u0004\b/\u0010\u0011R\u0013\u00100\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b1\u0010\u0007R\u001c\u00102\u001a\u0004\u0018\u0001038FX\u0087\u0004¢\u0006\f\u0012\u0004\b4\u0010\u0002\u001a\u0004\b5\u00106R\u001c\u00107\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b8\u0010\u0002\u001a\u0004\b9\u0010\fR\u0013\u0010:\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b;\u0010\fR\u0013\u0010<\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b=\u0010\u0011R\u0013\u0010>\u001a\u0004\u0018\u00010?8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0013\u0010B\u001a\u0004\u0018\u00010C8G¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0013\u0010F\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bG\u0010\fR\u0013\u0010H\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bI\u0010\u0011R\u001c\u0010J\u001a\u0004\u0018\u00010?8FX\u0087\u0004¢\u0006\f\u0012\u0004\bK\u0010\u0002\u001a\u0004\bL\u0010AR\u001c\u0010M\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\bN\u0010\u0002\u001a\u0004\bO\u0010\fR\u0013\u0010P\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bQ\u0010\u0007R\u0013\u0010R\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bS\u0010\fR\u001c\u0010T\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bU\u0010\u0002\u001a\u0004\bV\u0010\u0007R\u001c\u0010W\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\bX\u0010\u0002\u001a\u0004\bY\u0010\fR\u0013\u0010Z\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b[\u0010\u0007R\u0013\u0010\\\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b]\u0010\fR\u0013\u0010^\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b_\u0010\u0011R\u001c\u0010`\u001a\u0004\u0018\u00010?8FX\u0087\u0004¢\u0006\f\u0012\u0004\ba\u0010\u0002\u001a\u0004\bb\u0010AR\u001c\u0010c\u001a\u0004\u0018\u00010C8GX\u0087\u0004¢\u0006\f\u0012\u0004\bd\u0010\u0002\u001a\u0004\be\u0010ER\u001c\u0010f\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\bg\u0010\u0002\u001a\u0004\bh\u0010\fR\u001c\u0010i\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\bj\u0010\u0002\u001a\u0004\bk\u0010\u0011R\u001c\u0010l\u001a\u0004\u0018\u00010?8FX\u0087\u0004¢\u0006\f\u0012\u0004\bm\u0010\u0002\u001a\u0004\bn\u0010AR\u001c\u0010o\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\bp\u0010\u0002\u001a\u0004\bq\u0010\fR\u001c\u0010r\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bs\u0010\u0002\u001a\u0004\bt\u0010\u0007R\u001c\u0010u\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\bv\u0010\u0002\u001a\u0004\bw\u0010\fR\u001c\u0010x\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\by\u0010\u0002\u001a\u0004\bz\u0010\u0011R\u001c\u0010{\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b|\u0010\u0002\u001a\u0004\b}\u0010\u0007R\u001d\u0010~\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\r\u0012\u0004\b\u007f\u0010\u0002\u001a\u0005\b\u0080\u0001\u0010\fR\u001f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0082\u0001\u0010\u0002\u001a\u0005\b\u0083\u0001\u0010\u0011R\u001f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0085\u0001\u0010\u0002\u001a\u0005\b\u0086\u0001\u0010\u0007R\u001f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0088\u0001\u0010\u0002\u001a\u0005\b\u0089\u0001\u0010\fR\u001f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008b\u0001\u0010\u0002\u001a\u0005\b\u008c\u0001\u0010\u0011R\u001f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008e\u0001\u0010\u0002\u001a\u0005\b\u008f\u0001\u0010\u0007R\u001f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0091\u0001\u0010\u0002\u001a\u0005\b\u0092\u0001\u0010\fR\u001f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0094\u0001\u0010\u0002\u001a\u0005\b\u0095\u0001\u0010\u0011R\u0015\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010\u0007R!\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u00018FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b\u009a\u0001\u0010\u0002\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u009e\u0001\u0010\u0002\u001a\u0005\b\u009f\u0001\u0010\fR\u0015\u0010 \u0001\u001a\u0004\u0018\u00010\t8F¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010\fR\u0015\u0010¢\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b£\u0001\u0010\u0011R\u001f\u0010¤\u0001\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¥\u0001\u0010\u0002\u001a\u0005\b¦\u0001\u0010\u0007R\u001f\u0010§\u0001\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¨\u0001\u0010\u0002\u001a\u0005\b©\u0001\u0010\fR\u001f\u0010ª\u0001\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b«\u0001\u0010\u0002\u001a\u0005\b¬\u0001\u0010\u0011R\u0015\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b®\u0001\u0010\u0007R\u0015\u0010¯\u0001\u001a\u0004\u0018\u00010\t8F¢\u0006\u0007\u001a\u0005\b°\u0001\u0010\fR\u0015\u0010±\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b²\u0001\u0010\u0011R\u0015\u0010³\u0001\u001a\u0004\u0018\u00010?8F¢\u0006\u0007\u001a\u0005\b´\u0001\u0010AR\u0015\u0010µ\u0001\u001a\u0004\u0018\u00010\t8F¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010\fR\u0015\u0010·\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010\u0007R\u0015\u0010¹\u0001\u001a\u0004\u0018\u00010\t8F¢\u0006\u0007\u001a\u0005\bº\u0001\u0010\fR!\u0010»\u0001\u001a\u0005\u0018\u00010¼\u00018FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b½\u0001\u0010\u0002\u001a\u0006\b¾\u0001\u0010¿\u0001R\u001f\u0010À\u0001\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÁ\u0001\u0010\u0002\u001a\u0005\bÂ\u0001\u0010\fR\u001d\u0010Ã\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010Ä\u00018F¢\u0006\b\u001a\u0006\bÅ\u0001\u0010Æ\u0001R\u0017\u0010Ç\u0001\u001a\u0005\u0018\u00010È\u00018F¢\u0006\b\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u0015\u0010Ë\u0001\u001a\u0004\u0018\u00010\t8F¢\u0006\u0007\u001a\u0005\bÌ\u0001\u0010\fR\u0015\u0010Í\u0001\u001a\u0004\u0018\u00010\t8F¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010\fR\u0015\u0010Ï\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010\u0011R\u0017\u0010Ñ\u0001\u001a\u0005\u0018\u00010¼\u00018F¢\u0006\b\u001a\u0006\bÒ\u0001\u0010¿\u0001R\u0015\u0010Ó\u0001\u001a\u0004\u0018\u00010\t8F¢\u0006\u0007\u001a\u0005\bÔ\u0001\u0010\fR\u001f\u0010Õ\u0001\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÖ\u0001\u0010\u0002\u001a\u0005\b×\u0001\u0010\u0007R\u001f\u0010Ø\u0001\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÙ\u0001\u0010\u0002\u001a\u0005\bÚ\u0001\u0010\fR\u001f\u0010Û\u0001\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÜ\u0001\u0010\u0002\u001a\u0005\bÝ\u0001\u0010\u0011R\u0015\u0010Þ\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\bß\u0001\u0010\u0007R\u0015\u0010à\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\bá\u0001\u0010\u0007R\u0017\u0010â\u0001\u001a\u0005\u0018\u00010ã\u00018F¢\u0006\b\u001a\u0006\bä\u0001\u0010å\u0001¨\u0006æ\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer$Companion;", "", "()V", "defaultFillExtrusionAmbientOcclusionGroundAttenuation", "", "getDefaultFillExtrusionAmbientOcclusionGroundAttenuation$annotations", "getDefaultFillExtrusionAmbientOcclusionGroundAttenuation", "()Ljava/lang/Double;", "defaultFillExtrusionAmbientOcclusionGroundAttenuationAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getDefaultFillExtrusionAmbientOcclusionGroundAttenuationAsExpression$annotations", "getDefaultFillExtrusionAmbientOcclusionGroundAttenuationAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "defaultFillExtrusionAmbientOcclusionGroundAttenuationTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getDefaultFillExtrusionAmbientOcclusionGroundAttenuationTransition$annotations", "getDefaultFillExtrusionAmbientOcclusionGroundAttenuationTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "defaultFillExtrusionAmbientOcclusionGroundRadius", "getDefaultFillExtrusionAmbientOcclusionGroundRadius$annotations", "getDefaultFillExtrusionAmbientOcclusionGroundRadius", "defaultFillExtrusionAmbientOcclusionGroundRadiusAsExpression", "getDefaultFillExtrusionAmbientOcclusionGroundRadiusAsExpression$annotations", "getDefaultFillExtrusionAmbientOcclusionGroundRadiusAsExpression", "defaultFillExtrusionAmbientOcclusionGroundRadiusTransition", "getDefaultFillExtrusionAmbientOcclusionGroundRadiusTransition$annotations", "getDefaultFillExtrusionAmbientOcclusionGroundRadiusTransition", "defaultFillExtrusionAmbientOcclusionIntensity", "getDefaultFillExtrusionAmbientOcclusionIntensity", "defaultFillExtrusionAmbientOcclusionIntensityAsExpression", "getDefaultFillExtrusionAmbientOcclusionIntensityAsExpression", "defaultFillExtrusionAmbientOcclusionIntensityTransition", "getDefaultFillExtrusionAmbientOcclusionIntensityTransition", "defaultFillExtrusionAmbientOcclusionRadius", "getDefaultFillExtrusionAmbientOcclusionRadius", "defaultFillExtrusionAmbientOcclusionRadiusAsExpression", "getDefaultFillExtrusionAmbientOcclusionRadiusAsExpression", "defaultFillExtrusionAmbientOcclusionRadiusTransition", "getDefaultFillExtrusionAmbientOcclusionRadiusTransition", "defaultFillExtrusionAmbientOcclusionWallRadius", "getDefaultFillExtrusionAmbientOcclusionWallRadius$annotations", "getDefaultFillExtrusionAmbientOcclusionWallRadius", "defaultFillExtrusionAmbientOcclusionWallRadiusAsExpression", "getDefaultFillExtrusionAmbientOcclusionWallRadiusAsExpression$annotations", "getDefaultFillExtrusionAmbientOcclusionWallRadiusAsExpression", "defaultFillExtrusionAmbientOcclusionWallRadiusTransition", "getDefaultFillExtrusionAmbientOcclusionWallRadiusTransition$annotations", "getDefaultFillExtrusionAmbientOcclusionWallRadiusTransition", "defaultFillExtrusionBase", "getDefaultFillExtrusionBase", "defaultFillExtrusionBaseAlignment", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionBaseAlignment;", "getDefaultFillExtrusionBaseAlignment$annotations", "getDefaultFillExtrusionBaseAlignment", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionBaseAlignment;", "defaultFillExtrusionBaseAlignmentAsExpression", "getDefaultFillExtrusionBaseAlignmentAsExpression$annotations", "getDefaultFillExtrusionBaseAlignmentAsExpression", "defaultFillExtrusionBaseAsExpression", "getDefaultFillExtrusionBaseAsExpression", "defaultFillExtrusionBaseTransition", "getDefaultFillExtrusionBaseTransition", "defaultFillExtrusionColor", "", "getDefaultFillExtrusionColor", "()Ljava/lang/String;", "defaultFillExtrusionColorAsColorInt", "", "getDefaultFillExtrusionColorAsColorInt", "()Ljava/lang/Integer;", "defaultFillExtrusionColorAsExpression", "getDefaultFillExtrusionColorAsExpression", "defaultFillExtrusionColorTransition", "getDefaultFillExtrusionColorTransition", "defaultFillExtrusionColorUseTheme", "getDefaultFillExtrusionColorUseTheme$annotations", "getDefaultFillExtrusionColorUseTheme", "defaultFillExtrusionColorUseThemeAsExpression", "getDefaultFillExtrusionColorUseThemeAsExpression$annotations", "getDefaultFillExtrusionColorUseThemeAsExpression", "defaultFillExtrusionCutoffFadeRange", "getDefaultFillExtrusionCutoffFadeRange", "defaultFillExtrusionCutoffFadeRangeAsExpression", "getDefaultFillExtrusionCutoffFadeRangeAsExpression", "defaultFillExtrusionEdgeRadius", "getDefaultFillExtrusionEdgeRadius$annotations", "getDefaultFillExtrusionEdgeRadius", "defaultFillExtrusionEdgeRadiusAsExpression", "getDefaultFillExtrusionEdgeRadiusAsExpression$annotations", "getDefaultFillExtrusionEdgeRadiusAsExpression", "defaultFillExtrusionEmissiveStrength", "getDefaultFillExtrusionEmissiveStrength", "defaultFillExtrusionEmissiveStrengthAsExpression", "getDefaultFillExtrusionEmissiveStrengthAsExpression", "defaultFillExtrusionEmissiveStrengthTransition", "getDefaultFillExtrusionEmissiveStrengthTransition", "defaultFillExtrusionFloodLightColor", "getDefaultFillExtrusionFloodLightColor$annotations", "getDefaultFillExtrusionFloodLightColor", "defaultFillExtrusionFloodLightColorAsColorInt", "getDefaultFillExtrusionFloodLightColorAsColorInt$annotations", "getDefaultFillExtrusionFloodLightColorAsColorInt", "defaultFillExtrusionFloodLightColorAsExpression", "getDefaultFillExtrusionFloodLightColorAsExpression$annotations", "getDefaultFillExtrusionFloodLightColorAsExpression", "defaultFillExtrusionFloodLightColorTransition", "getDefaultFillExtrusionFloodLightColorTransition$annotations", "getDefaultFillExtrusionFloodLightColorTransition", "defaultFillExtrusionFloodLightColorUseTheme", "getDefaultFillExtrusionFloodLightColorUseTheme$annotations", "getDefaultFillExtrusionFloodLightColorUseTheme", "defaultFillExtrusionFloodLightColorUseThemeAsExpression", "getDefaultFillExtrusionFloodLightColorUseThemeAsExpression$annotations", "getDefaultFillExtrusionFloodLightColorUseThemeAsExpression", "defaultFillExtrusionFloodLightGroundAttenuation", "getDefaultFillExtrusionFloodLightGroundAttenuation$annotations", "getDefaultFillExtrusionFloodLightGroundAttenuation", "defaultFillExtrusionFloodLightGroundAttenuationAsExpression", "getDefaultFillExtrusionFloodLightGroundAttenuationAsExpression$annotations", "getDefaultFillExtrusionFloodLightGroundAttenuationAsExpression", "defaultFillExtrusionFloodLightGroundAttenuationTransition", "getDefaultFillExtrusionFloodLightGroundAttenuationTransition$annotations", "getDefaultFillExtrusionFloodLightGroundAttenuationTransition", "defaultFillExtrusionFloodLightGroundRadius", "getDefaultFillExtrusionFloodLightGroundRadius$annotations", "getDefaultFillExtrusionFloodLightGroundRadius", "defaultFillExtrusionFloodLightGroundRadiusAsExpression", "getDefaultFillExtrusionFloodLightGroundRadiusAsExpression$annotations", "getDefaultFillExtrusionFloodLightGroundRadiusAsExpression", "defaultFillExtrusionFloodLightGroundRadiusTransition", "getDefaultFillExtrusionFloodLightGroundRadiusTransition$annotations", "getDefaultFillExtrusionFloodLightGroundRadiusTransition", "defaultFillExtrusionFloodLightIntensity", "getDefaultFillExtrusionFloodLightIntensity$annotations", "getDefaultFillExtrusionFloodLightIntensity", "defaultFillExtrusionFloodLightIntensityAsExpression", "getDefaultFillExtrusionFloodLightIntensityAsExpression$annotations", "getDefaultFillExtrusionFloodLightIntensityAsExpression", "defaultFillExtrusionFloodLightIntensityTransition", "getDefaultFillExtrusionFloodLightIntensityTransition$annotations", "getDefaultFillExtrusionFloodLightIntensityTransition", "defaultFillExtrusionFloodLightWallRadius", "getDefaultFillExtrusionFloodLightWallRadius$annotations", "getDefaultFillExtrusionFloodLightWallRadius", "defaultFillExtrusionFloodLightWallRadiusAsExpression", "getDefaultFillExtrusionFloodLightWallRadiusAsExpression$annotations", "getDefaultFillExtrusionFloodLightWallRadiusAsExpression", "defaultFillExtrusionFloodLightWallRadiusTransition", "getDefaultFillExtrusionFloodLightWallRadiusTransition$annotations", "getDefaultFillExtrusionFloodLightWallRadiusTransition", "defaultFillExtrusionHeight", "getDefaultFillExtrusionHeight", "defaultFillExtrusionHeightAlignment", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionHeightAlignment;", "getDefaultFillExtrusionHeightAlignment$annotations", "getDefaultFillExtrusionHeightAlignment", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionHeightAlignment;", "defaultFillExtrusionHeightAlignmentAsExpression", "getDefaultFillExtrusionHeightAlignmentAsExpression$annotations", "getDefaultFillExtrusionHeightAlignmentAsExpression", "defaultFillExtrusionHeightAsExpression", "getDefaultFillExtrusionHeightAsExpression", "defaultFillExtrusionHeightTransition", "getDefaultFillExtrusionHeightTransition", "defaultFillExtrusionLineWidth", "getDefaultFillExtrusionLineWidth$annotations", "getDefaultFillExtrusionLineWidth", "defaultFillExtrusionLineWidthAsExpression", "getDefaultFillExtrusionLineWidthAsExpression$annotations", "getDefaultFillExtrusionLineWidthAsExpression", "defaultFillExtrusionLineWidthTransition", "getDefaultFillExtrusionLineWidthTransition$annotations", "getDefaultFillExtrusionLineWidthTransition", "defaultFillExtrusionOpacity", "getDefaultFillExtrusionOpacity", "defaultFillExtrusionOpacityAsExpression", "getDefaultFillExtrusionOpacityAsExpression", "defaultFillExtrusionOpacityTransition", "getDefaultFillExtrusionOpacityTransition", "defaultFillExtrusionPattern", "getDefaultFillExtrusionPattern", "defaultFillExtrusionPatternAsExpression", "getDefaultFillExtrusionPatternAsExpression", "defaultFillExtrusionPatternCrossFade", "getDefaultFillExtrusionPatternCrossFade", "defaultFillExtrusionPatternCrossFadeAsExpression", "getDefaultFillExtrusionPatternCrossFadeAsExpression", "defaultFillExtrusionRoundedRoof", "", "getDefaultFillExtrusionRoundedRoof$annotations", "getDefaultFillExtrusionRoundedRoof", "()Ljava/lang/Boolean;", "defaultFillExtrusionRoundedRoofAsExpression", "getDefaultFillExtrusionRoundedRoofAsExpression$annotations", "getDefaultFillExtrusionRoundedRoofAsExpression", "defaultFillExtrusionTranslate", "", "getDefaultFillExtrusionTranslate", "()Ljava/util/List;", "defaultFillExtrusionTranslateAnchor", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionTranslateAnchor;", "getDefaultFillExtrusionTranslateAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionTranslateAnchor;", "defaultFillExtrusionTranslateAnchorAsExpression", "getDefaultFillExtrusionTranslateAnchorAsExpression", "defaultFillExtrusionTranslateAsExpression", "getDefaultFillExtrusionTranslateAsExpression", "defaultFillExtrusionTranslateTransition", "getDefaultFillExtrusionTranslateTransition", "defaultFillExtrusionVerticalGradient", "getDefaultFillExtrusionVerticalGradient", "defaultFillExtrusionVerticalGradientAsExpression", "getDefaultFillExtrusionVerticalGradientAsExpression", "defaultFillExtrusionVerticalScale", "getDefaultFillExtrusionVerticalScale$annotations", "getDefaultFillExtrusionVerticalScale", "defaultFillExtrusionVerticalScaleAsExpression", "getDefaultFillExtrusionVerticalScaleAsExpression$annotations", "getDefaultFillExtrusionVerticalScaleAsExpression", "defaultFillExtrusionVerticalScaleTransition", "getDefaultFillExtrusionVerticalScaleTransition$annotations", "getDefaultFillExtrusionVerticalScaleTransition", "defaultMaxZoom", "getDefaultMaxZoom", "defaultMinZoom", "getDefaultMinZoom", "defaultVisibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getDefaultVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionAmbientOcclusionGroundAttenuation$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionAmbientOcclusionGroundAttenuationAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionAmbientOcclusionGroundAttenuationTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionAmbientOcclusionGroundRadius$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionAmbientOcclusionGroundRadiusAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionAmbientOcclusionGroundRadiusTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionAmbientOcclusionWallRadius$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionAmbientOcclusionWallRadiusAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionAmbientOcclusionWallRadiusTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionBaseAlignment$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionBaseAlignmentAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionEdgeRadius$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionEdgeRadiusAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightColor$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightColorAsColorInt$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightColorAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightColorTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightGroundAttenuation$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightGroundAttenuationAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightGroundAttenuationTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightGroundRadius$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightGroundRadiusAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightGroundRadiusTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightIntensity$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightIntensityAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightIntensityTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightWallRadius$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightWallRadiusAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionFloodLightWallRadiusTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionHeightAlignment$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionHeightAlignmentAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionLineWidth$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionLineWidthAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionLineWidthTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionRoundedRoof$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionRoundedRoofAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionVerticalScale$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionVerticalScaleAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultFillExtrusionVerticalScaleTransition$annotations() {
        }

        public final Double getDefaultFillExtrusionAmbientOcclusionGroundAttenuation() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-ground-attenuation");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultFillExtrusionAmbientOcclusionGroundAttenuationAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-ground-attenuation");
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
            Double defaultFillExtrusionAmbientOcclusionGroundAttenuation = getDefaultFillExtrusionAmbientOcclusionGroundAttenuation();
            if (defaultFillExtrusionAmbientOcclusionGroundAttenuation == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionAmbientOcclusionGroundAttenuation.doubleValue());
        }

        public final StyleTransition getDefaultFillExtrusionAmbientOcclusionGroundAttenuationTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-ground-attenuation-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultFillExtrusionAmbientOcclusionGroundRadius() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-ground-radius");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultFillExtrusionAmbientOcclusionGroundRadiusAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-ground-radius");
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
            Double defaultFillExtrusionAmbientOcclusionGroundRadius = getDefaultFillExtrusionAmbientOcclusionGroundRadius();
            if (defaultFillExtrusionAmbientOcclusionGroundRadius == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionAmbientOcclusionGroundRadius.doubleValue());
        }

        public final StyleTransition getDefaultFillExtrusionAmbientOcclusionGroundRadiusTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-ground-radius-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultFillExtrusionAmbientOcclusionIntensity() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-intensity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultFillExtrusionAmbientOcclusionIntensityAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-intensity");
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
            Double defaultFillExtrusionAmbientOcclusionIntensity = getDefaultFillExtrusionAmbientOcclusionIntensity();
            if (defaultFillExtrusionAmbientOcclusionIntensity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionAmbientOcclusionIntensity.doubleValue());
        }

        public final StyleTransition getDefaultFillExtrusionAmbientOcclusionIntensityTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-intensity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultFillExtrusionAmbientOcclusionRadius() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-radius");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultFillExtrusionAmbientOcclusionRadiusAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-radius");
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
            Double defaultFillExtrusionAmbientOcclusionRadius = getDefaultFillExtrusionAmbientOcclusionRadius();
            if (defaultFillExtrusionAmbientOcclusionRadius == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionAmbientOcclusionRadius.doubleValue());
        }

        public final StyleTransition getDefaultFillExtrusionAmbientOcclusionRadiusTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-radius-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultFillExtrusionAmbientOcclusionWallRadius() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-wall-radius");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultFillExtrusionAmbientOcclusionWallRadiusAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-wall-radius");
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
            Double defaultFillExtrusionAmbientOcclusionWallRadius = getDefaultFillExtrusionAmbientOcclusionWallRadius();
            if (defaultFillExtrusionAmbientOcclusionWallRadius == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionAmbientOcclusionWallRadius.doubleValue());
        }

        public final StyleTransition getDefaultFillExtrusionAmbientOcclusionWallRadiusTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-ambient-occlusion-wall-radius-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultFillExtrusionBase() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-base");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final FillExtrusionBaseAlignment getDefaultFillExtrusionBaseAlignment() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-base-alignment");
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
            FillExtrusionBaseAlignment.Companion companion = FillExtrusionBaseAlignment.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        public final Expression getDefaultFillExtrusionBaseAlignmentAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-base-alignment");
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
            FillExtrusionBaseAlignment defaultFillExtrusionBaseAlignment = getDefaultFillExtrusionBaseAlignment();
            if (defaultFillExtrusionBaseAlignment != null) {
                return Expression.INSTANCE.literal(defaultFillExtrusionBaseAlignment.getValue());
            }
            return null;
        }

        public final Expression getDefaultFillExtrusionBaseAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-base");
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
            Double defaultFillExtrusionBase = getDefaultFillExtrusionBase();
            if (defaultFillExtrusionBase == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionBase.doubleValue());
        }

        public final StyleTransition getDefaultFillExtrusionBaseTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-base-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultFillExtrusionColor() {
            Expression defaultFillExtrusionColorAsExpression = getDefaultFillExtrusionColorAsExpression();
            if (defaultFillExtrusionColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultFillExtrusionColorAsExpression);
            }
            return null;
        }

        public final Integer getDefaultFillExtrusionColorAsColorInt() {
            Expression defaultFillExtrusionColorAsExpression = getDefaultFillExtrusionColorAsExpression();
            if (defaultFillExtrusionColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultFillExtrusionColorAsExpression);
            }
            return null;
        }

        public final Expression getDefaultFillExtrusionColorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-color");
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

        public final StyleTransition getDefaultFillExtrusionColorTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultFillExtrusionColorUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultFillExtrusionColorUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-color-use-theme");
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
            String defaultFillExtrusionColorUseTheme = getDefaultFillExtrusionColorUseTheme();
            if (defaultFillExtrusionColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultFillExtrusionColorUseTheme);
            }
            return null;
        }

        public final Double getDefaultFillExtrusionCutoffFadeRange() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-cutoff-fade-range");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultFillExtrusionCutoffFadeRangeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-cutoff-fade-range");
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
            Double defaultFillExtrusionCutoffFadeRange = getDefaultFillExtrusionCutoffFadeRange();
            if (defaultFillExtrusionCutoffFadeRange == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionCutoffFadeRange.doubleValue());
        }

        public final Double getDefaultFillExtrusionEdgeRadius() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-edge-radius");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultFillExtrusionEdgeRadiusAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-edge-radius");
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
            Double defaultFillExtrusionEdgeRadius = getDefaultFillExtrusionEdgeRadius();
            if (defaultFillExtrusionEdgeRadius == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionEdgeRadius.doubleValue());
        }

        public final Double getDefaultFillExtrusionEmissiveStrength() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-emissive-strength");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultFillExtrusionEmissiveStrengthAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-emissive-strength");
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
            Double defaultFillExtrusionEmissiveStrength = getDefaultFillExtrusionEmissiveStrength();
            if (defaultFillExtrusionEmissiveStrength == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionEmissiveStrength.doubleValue());
        }

        public final StyleTransition getDefaultFillExtrusionEmissiveStrengthTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-emissive-strength-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultFillExtrusionFloodLightColor() {
            Expression defaultFillExtrusionFloodLightColorAsExpression = getDefaultFillExtrusionFloodLightColorAsExpression();
            if (defaultFillExtrusionFloodLightColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultFillExtrusionFloodLightColorAsExpression);
            }
            return null;
        }

        public final Integer getDefaultFillExtrusionFloodLightColorAsColorInt() {
            Expression defaultFillExtrusionFloodLightColorAsExpression = getDefaultFillExtrusionFloodLightColorAsExpression();
            if (defaultFillExtrusionFloodLightColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultFillExtrusionFloodLightColorAsExpression);
            }
            return null;
        }

        public final Expression getDefaultFillExtrusionFloodLightColorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-color");
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

        public final StyleTransition getDefaultFillExtrusionFloodLightColorTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultFillExtrusionFloodLightColorUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultFillExtrusionFloodLightColorUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-color-use-theme");
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
            String defaultFillExtrusionFloodLightColorUseTheme = getDefaultFillExtrusionFloodLightColorUseTheme();
            if (defaultFillExtrusionFloodLightColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultFillExtrusionFloodLightColorUseTheme);
            }
            return null;
        }

        public final Double getDefaultFillExtrusionFloodLightGroundAttenuation() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-ground-attenuation");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultFillExtrusionFloodLightGroundAttenuationAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-ground-attenuation");
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
            Double defaultFillExtrusionFloodLightGroundAttenuation = getDefaultFillExtrusionFloodLightGroundAttenuation();
            if (defaultFillExtrusionFloodLightGroundAttenuation == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionFloodLightGroundAttenuation.doubleValue());
        }

        public final StyleTransition getDefaultFillExtrusionFloodLightGroundAttenuationTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-ground-attenuation-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultFillExtrusionFloodLightGroundRadius() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-ground-radius");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultFillExtrusionFloodLightGroundRadiusAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-ground-radius");
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
            Double defaultFillExtrusionFloodLightGroundRadius = getDefaultFillExtrusionFloodLightGroundRadius();
            if (defaultFillExtrusionFloodLightGroundRadius == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionFloodLightGroundRadius.doubleValue());
        }

        public final StyleTransition getDefaultFillExtrusionFloodLightGroundRadiusTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-ground-radius-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultFillExtrusionFloodLightIntensity() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-intensity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultFillExtrusionFloodLightIntensityAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-intensity");
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
            Double defaultFillExtrusionFloodLightIntensity = getDefaultFillExtrusionFloodLightIntensity();
            if (defaultFillExtrusionFloodLightIntensity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionFloodLightIntensity.doubleValue());
        }

        public final StyleTransition getDefaultFillExtrusionFloodLightIntensityTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-intensity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultFillExtrusionFloodLightWallRadius() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-wall-radius");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultFillExtrusionFloodLightWallRadiusAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-wall-radius");
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
            Double defaultFillExtrusionFloodLightWallRadius = getDefaultFillExtrusionFloodLightWallRadius();
            if (defaultFillExtrusionFloodLightWallRadius == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionFloodLightWallRadius.doubleValue());
        }

        public final StyleTransition getDefaultFillExtrusionFloodLightWallRadiusTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-flood-light-wall-radius-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultFillExtrusionHeight() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-height");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final FillExtrusionHeightAlignment getDefaultFillExtrusionHeightAlignment() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-height-alignment");
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
            FillExtrusionHeightAlignment.Companion companion = FillExtrusionHeightAlignment.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        public final Expression getDefaultFillExtrusionHeightAlignmentAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-height-alignment");
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
            FillExtrusionHeightAlignment defaultFillExtrusionHeightAlignment = getDefaultFillExtrusionHeightAlignment();
            if (defaultFillExtrusionHeightAlignment != null) {
                return Expression.INSTANCE.literal(defaultFillExtrusionHeightAlignment.getValue());
            }
            return null;
        }

        public final Expression getDefaultFillExtrusionHeightAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-height");
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
            Double defaultFillExtrusionHeight = getDefaultFillExtrusionHeight();
            if (defaultFillExtrusionHeight == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionHeight.doubleValue());
        }

        public final StyleTransition getDefaultFillExtrusionHeightTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-height-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultFillExtrusionLineWidth() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-line-width");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultFillExtrusionLineWidthAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-line-width");
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
            Double defaultFillExtrusionLineWidth = getDefaultFillExtrusionLineWidth();
            if (defaultFillExtrusionLineWidth == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionLineWidth.doubleValue());
        }

        public final StyleTransition getDefaultFillExtrusionLineWidthTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-line-width-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultFillExtrusionOpacity() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-opacity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultFillExtrusionOpacityAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-opacity");
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
            Double defaultFillExtrusionOpacity = getDefaultFillExtrusionOpacity();
            if (defaultFillExtrusionOpacity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionOpacity.doubleValue());
        }

        public final StyleTransition getDefaultFillExtrusionOpacityTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-opacity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultFillExtrusionPattern() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-pattern");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultFillExtrusionPatternAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-pattern");
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
            String defaultFillExtrusionPattern = getDefaultFillExtrusionPattern();
            if (defaultFillExtrusionPattern != null) {
                return Expression.INSTANCE.literal(defaultFillExtrusionPattern);
            }
            return null;
        }

        public final Double getDefaultFillExtrusionPatternCrossFade() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-pattern-cross-fade");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultFillExtrusionPatternCrossFadeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-pattern-cross-fade");
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
            Double defaultFillExtrusionPatternCrossFade = getDefaultFillExtrusionPatternCrossFade();
            if (defaultFillExtrusionPatternCrossFade == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionPatternCrossFade.doubleValue());
        }

        public final Boolean getDefaultFillExtrusionRoundedRoof() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-rounded-roof");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Boolean.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Boolean) objUnwrap;
        }

        public final Expression getDefaultFillExtrusionRoundedRoofAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-rounded-roof");
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
            Boolean defaultFillExtrusionRoundedRoof = getDefaultFillExtrusionRoundedRoof();
            if (defaultFillExtrusionRoundedRoof == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionRoundedRoof.booleanValue());
        }

        public final List<Double> getDefaultFillExtrusionTranslate() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-translate");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (List) objUnwrap;
        }

        public final FillExtrusionTranslateAnchor getDefaultFillExtrusionTranslateAnchor() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-translate-anchor");
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
            FillExtrusionTranslateAnchor.Companion companion = FillExtrusionTranslateAnchor.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        public final Expression getDefaultFillExtrusionTranslateAnchorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-translate-anchor");
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
            FillExtrusionTranslateAnchor defaultFillExtrusionTranslateAnchor = getDefaultFillExtrusionTranslateAnchor();
            if (defaultFillExtrusionTranslateAnchor != null) {
                return Expression.INSTANCE.literal(defaultFillExtrusionTranslateAnchor.getValue());
            }
            return null;
        }

        public final Expression getDefaultFillExtrusionTranslateAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-translate");
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
            List<Double> defaultFillExtrusionTranslate = getDefaultFillExtrusionTranslate();
            if (defaultFillExtrusionTranslate != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultFillExtrusionTranslate);
            }
            return null;
        }

        public final StyleTransition getDefaultFillExtrusionTranslateTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-translate-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Boolean getDefaultFillExtrusionVerticalGradient() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-vertical-gradient");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Boolean.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Boolean) objUnwrap;
        }

        public final Expression getDefaultFillExtrusionVerticalGradientAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-vertical-gradient");
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
            Boolean defaultFillExtrusionVerticalGradient = getDefaultFillExtrusionVerticalGradient();
            if (defaultFillExtrusionVerticalGradient == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionVerticalGradient.booleanValue());
        }

        public final Double getDefaultFillExtrusionVerticalScale() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-vertical-scale");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultFillExtrusionVerticalScaleAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-vertical-scale");
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
            Double defaultFillExtrusionVerticalScale = getDefaultFillExtrusionVerticalScale();
            if (defaultFillExtrusionVerticalScale == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultFillExtrusionVerticalScale.doubleValue());
        }

        public final StyleTransition getDefaultFillExtrusionVerticalScaleTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "fill-extrusion-vertical-scale-transition");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "maxzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "minzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("fill-extrusion", "visibility");
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

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionBaseAlignment(Expression fillExtrusionBaseAlignment) {
        q2.n(fillExtrusionBaseAlignment, "fill-extrusion-base-alignment", fillExtrusionBaseAlignment, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionColorUseTheme(Expression fillExtrusionColorUseTheme) {
        q2.n(fillExtrusionColorUseTheme, "fill-extrusion-color-use-theme", fillExtrusionColorUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionFloodLightColorUseTheme(Expression fillExtrusionFloodLightColorUseTheme) {
        q2.n(fillExtrusionFloodLightColorUseTheme, "fill-extrusion-flood-light-color-use-theme", fillExtrusionFloodLightColorUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionHeightAlignment(Expression fillExtrusionHeightAlignment) {
        q2.n(fillExtrusionHeightAlignment, "fill-extrusion-height-alignment", fillExtrusionHeightAlignment, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionPattern(Expression fillExtrusionPattern) {
        q2.n(fillExtrusionPattern, "fill-extrusion-pattern", fillExtrusionPattern, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionTranslate(Expression fillExtrusionTranslate) {
        q2.n(fillExtrusionTranslate, "fill-extrusion-translate", fillExtrusionTranslate, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionTranslateAnchor(Expression fillExtrusionTranslateAnchor) {
        q2.n(fillExtrusionTranslateAnchor, "fill-extrusion-translate-anchor", fillExtrusionTranslateAnchor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionAmbientOcclusionGroundAttenuation(Expression fillExtrusionAmbientOcclusionGroundAttenuation) {
        q2.n(fillExtrusionAmbientOcclusionGroundAttenuation, "fill-extrusion-ambient-occlusion-ground-attenuation", fillExtrusionAmbientOcclusionGroundAttenuation, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionAmbientOcclusionGroundRadius(Expression fillExtrusionAmbientOcclusionGroundRadius) {
        q2.n(fillExtrusionAmbientOcclusionGroundRadius, "fill-extrusion-ambient-occlusion-ground-radius", fillExtrusionAmbientOcclusionGroundRadius, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionAmbientOcclusionIntensity(Expression fillExtrusionAmbientOcclusionIntensity) {
        q2.n(fillExtrusionAmbientOcclusionIntensity, "fill-extrusion-ambient-occlusion-intensity", fillExtrusionAmbientOcclusionIntensity, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionAmbientOcclusionRadius(Expression fillExtrusionAmbientOcclusionRadius) {
        q2.n(fillExtrusionAmbientOcclusionRadius, "fill-extrusion-ambient-occlusion-radius", fillExtrusionAmbientOcclusionRadius, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionAmbientOcclusionWallRadius(Expression fillExtrusionAmbientOcclusionWallRadius) {
        q2.n(fillExtrusionAmbientOcclusionWallRadius, "fill-extrusion-ambient-occlusion-wall-radius", fillExtrusionAmbientOcclusionWallRadius, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionBase(Expression fillExtrusionBase) {
        q2.n(fillExtrusionBase, "fill-extrusion-base", fillExtrusionBase, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionCutoffFadeRange(Expression fillExtrusionCutoffFadeRange) {
        q2.n(fillExtrusionCutoffFadeRange, "fill-extrusion-cutoff-fade-range", fillExtrusionCutoffFadeRange, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionEdgeRadius(Expression fillExtrusionEdgeRadius) {
        q2.n(fillExtrusionEdgeRadius, "fill-extrusion-edge-radius", fillExtrusionEdgeRadius, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionEmissiveStrength(Expression fillExtrusionEmissiveStrength) {
        q2.n(fillExtrusionEmissiveStrength, "fill-extrusion-emissive-strength", fillExtrusionEmissiveStrength, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionFloodLightGroundAttenuation(Expression fillExtrusionFloodLightGroundAttenuation) {
        q2.n(fillExtrusionFloodLightGroundAttenuation, "fill-extrusion-flood-light-ground-attenuation", fillExtrusionFloodLightGroundAttenuation, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionFloodLightGroundRadius(Expression fillExtrusionFloodLightGroundRadius) {
        q2.n(fillExtrusionFloodLightGroundRadius, "fill-extrusion-flood-light-ground-radius", fillExtrusionFloodLightGroundRadius, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionFloodLightIntensity(Expression fillExtrusionFloodLightIntensity) {
        q2.n(fillExtrusionFloodLightIntensity, "fill-extrusion-flood-light-intensity", fillExtrusionFloodLightIntensity, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionFloodLightWallRadius(Expression fillExtrusionFloodLightWallRadius) {
        q2.n(fillExtrusionFloodLightWallRadius, "fill-extrusion-flood-light-wall-radius", fillExtrusionFloodLightWallRadius, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionHeight(Expression fillExtrusionHeight) {
        q2.n(fillExtrusionHeight, "fill-extrusion-height", fillExtrusionHeight, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionLineWidth(Expression fillExtrusionLineWidth) {
        q2.n(fillExtrusionLineWidth, "fill-extrusion-line-width", fillExtrusionLineWidth, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionOpacity(Expression fillExtrusionOpacity) {
        q2.n(fillExtrusionOpacity, "fill-extrusion-opacity", fillExtrusionOpacity, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionPatternCrossFade(Expression fillExtrusionPatternCrossFade) {
        q2.n(fillExtrusionPatternCrossFade, "fill-extrusion-pattern-cross-fade", fillExtrusionPatternCrossFade, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionRoundedRoof(Expression fillExtrusionRoundedRoof) {
        q2.n(fillExtrusionRoundedRoof, "fill-extrusion-rounded-roof", fillExtrusionRoundedRoof, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionVerticalGradient(Expression fillExtrusionVerticalGradient) {
        q2.n(fillExtrusionVerticalGradient, "fill-extrusion-vertical-gradient", fillExtrusionVerticalGradient, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionVerticalScale(Expression fillExtrusionVerticalScale) {
        q2.n(fillExtrusionVerticalScale, "fill-extrusion-vertical-scale", fillExtrusionVerticalScale, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public FillExtrusionLayer visibility(Expression visibility) {
        q2.n(visibility, "visibility", visibility, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionColor(Expression fillExtrusionColor) {
        q2.n(fillExtrusionColor, "fill-extrusion-color", fillExtrusionColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionFloodLightColor(Expression fillExtrusionFloodLightColor) {
        q2.n(fillExtrusionFloodLightColor, "fill-extrusion-flood-light-color", fillExtrusionFloodLightColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionAmbientOcclusionGroundAttenuationTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-ambient-occlusion-ground-attenuation-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionAmbientOcclusionGroundRadiusTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-ambient-occlusion-ground-radius-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionAmbientOcclusionIntensityTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-ambient-occlusion-intensity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionAmbientOcclusionRadiusTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-ambient-occlusion-radius-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionAmbientOcclusionWallRadiusTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-ambient-occlusion-wall-radius-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionBaseTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-base-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionColor(String fillExtrusionColor) {
        fillExtrusionColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-color", fillExtrusionColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionColorTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionEmissiveStrengthTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-emissive-strength-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionFloodLightColor(String fillExtrusionFloodLightColor) {
        fillExtrusionFloodLightColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-flood-light-color", fillExtrusionFloodLightColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionFloodLightColorTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-flood-light-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionFloodLightGroundAttenuationTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-flood-light-ground-attenuation-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionFloodLightGroundRadiusTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-flood-light-ground-radius-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionFloodLightIntensityTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-flood-light-intensity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionFloodLightWallRadiusTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-flood-light-wall-radius-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionHeightTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-height-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionLineWidthTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-line-width-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionOpacityTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-opacity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    public FillExtrusionLayer fillExtrusionTranslateTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-translate-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayerDsl
    @MapboxExperimental
    public FillExtrusionLayer fillExtrusionVerticalScaleTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("fill-extrusion-vertical-scale-transition", options));
        return this;
    }
}
