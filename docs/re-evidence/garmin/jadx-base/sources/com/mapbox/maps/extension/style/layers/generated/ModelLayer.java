package com.mapbox.maps.extension.style.layers.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.StyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.ModelElevationReference;
import com.mapbox.maps.extension.style.layers.properties.generated.ModelScaleMode;
import com.mapbox.maps.extension.style.layers.properties.generated.ModelType;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.p;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import e23.l;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import r1.q2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0003\b\u008e\u0001\b\u0007\u0018\u0000 Ï\u00012\u00020\u00012\u00020\u0002:\u0002Ï\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0015\u0010\tJ\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0016\u0010\rJ\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u0019\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0017¢\u0006\u0004\b\u0019\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b!\u0010\"J\u0017\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u000bH\u0017¢\u0006\u0004\b!\u0010\rJ\u0017\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0003H\u0017¢\u0006\u0004\b#\u0010\tJ\u0017\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u000bH\u0017¢\u0006\u0004\b#\u0010\rJ\u0019\u0010#\u001a\u00020\u00002\b\b\u0001\u0010#\u001a\u00020$H\u0017¢\u0006\u0004\b#\u0010%J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b&\u0010\u001aJ#\u0010&\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0017¢\u0006\u0004\b&\u0010\u001fJ\u0017\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0003H\u0017¢\u0006\u0004\b'\u0010\tJ\u0017\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u000bH\u0017¢\u0006\u0004\b'\u0010\rJ\u0017\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0011H\u0017¢\u0006\u0004\b(\u0010\u0013J\u0017\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u000bH\u0017¢\u0006\u0004\b(\u0010\rJ\u0017\u0010)\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b)\u0010\u001aJ#\u0010)\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0017¢\u0006\u0004\b)\u0010\u001fJ\u0017\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0011H\u0017¢\u0006\u0004\b*\u0010\u0013J\u0017\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u000bH\u0017¢\u0006\u0004\b*\u0010\rJ\u0017\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+H\u0017¢\u0006\u0004\b,\u0010-J\u0017\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u000bH\u0017¢\u0006\u0004\b,\u0010\rJ\u0017\u0010.\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0011H\u0017¢\u0006\u0004\b.\u0010\u0013J\u0017\u0010.\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u000bH\u0017¢\u0006\u0004\b.\u0010\rJ\u0017\u0010/\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b/\u0010\u001aJ#\u0010/\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0017¢\u0006\u0004\b/\u0010\u001fJ\u001d\u00101\u001a\u00020\u00002\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001100H\u0017¢\u0006\u0004\b1\u00102J\u0017\u00101\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u000bH\u0017¢\u0006\u0004\b1\u0010\rJ\u0017\u00103\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b3\u0010\u001aJ#\u00103\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0017¢\u0006\u0004\b3\u0010\u001fJ\u0017\u00104\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0011H\u0017¢\u0006\u0004\b4\u0010\u0013J\u0017\u00104\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u000bH\u0017¢\u0006\u0004\b4\u0010\rJ\u0017\u00105\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b5\u0010\u001aJ#\u00105\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0017¢\u0006\u0004\b5\u0010\u001fJ\u0017\u00106\u001a\u00020\u00002\u0006\u00106\u001a\u00020 H\u0017¢\u0006\u0004\b6\u0010\"J\u0017\u00106\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u000bH\u0017¢\u0006\u0004\b6\u0010\rJ\u001d\u00107\u001a\u00020\u00002\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001100H\u0017¢\u0006\u0004\b7\u00102J\u0017\u00107\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u000bH\u0017¢\u0006\u0004\b7\u0010\rJ\u0017\u00108\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b8\u0010\u001aJ#\u00108\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0017¢\u0006\u0004\b8\u0010\u001fJ\u0017\u00109\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u0011H\u0017¢\u0006\u0004\b9\u0010\u0013J\u0017\u00109\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u000bH\u0017¢\u0006\u0004\b9\u0010\rJ\u0017\u0010:\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b:\u0010\u001aJ#\u0010:\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0017¢\u0006\u0004\b:\u0010\u001fJ\u001d\u0010;\u001a\u00020\u00002\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001100H\u0017¢\u0006\u0004\b;\u00102J\u0017\u0010;\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u000bH\u0017¢\u0006\u0004\b;\u0010\rJ\u0017\u0010<\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b<\u0010\u001aJ#\u0010<\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0017¢\u0006\u0004\b<\u0010\u001fJ\u0017\u0010>\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=H\u0017¢\u0006\u0004\b>\u0010?J\u0017\u0010>\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u000bH\u0017¢\u0006\u0004\b>\u0010\rJ\u001d\u0010@\u001a\u00020\u00002\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001100H\u0017¢\u0006\u0004\b@\u00102J\u0017\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u000bH\u0017¢\u0006\u0004\b@\u0010\rJ\u0017\u0010A\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\bA\u0010\u001aJ#\u0010A\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0017¢\u0006\u0004\bA\u0010\u001fJ\u0017\u0010C\u001a\u00020\u00002\u0006\u0010C\u001a\u00020BH\u0017¢\u0006\u0004\bC\u0010DJ\u0017\u0010C\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u000bH\u0017¢\u0006\u0004\bC\u0010\rJ\u000f\u0010G\u001a\u00020\u0003H\u0010¢\u0006\u0004\bE\u0010FR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010H\u001a\u0004\bI\u0010FR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010H\u001a\u0004\bJ\u0010FR\u0013\u0010\b\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bK\u0010FR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010FR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0016\u0010R\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010NR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010TR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\bW\u0010X\u001a\u0004\bV\u0010FR\u001c\u0010[\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bZ\u0010X\u001a\u0004\bY\u0010NR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\f\u0012\u0004\b]\u0010X\u001a\u0004\b\\\u0010TR\u001c\u0010`\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b_\u0010X\u001a\u0004\b^\u0010NR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00178FX\u0087\u0004¢\u0006\f\u0012\u0004\bc\u0010X\u001a\u0004\ba\u0010bR\u001c\u0010!\u001a\u0004\u0018\u00010 8FX\u0087\u0004¢\u0006\f\u0012\u0004\bf\u0010X\u001a\u0004\bd\u0010eR\u001c\u0010i\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bh\u0010X\u001a\u0004\bg\u0010NR\u001c\u0010#\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\bk\u0010X\u001a\u0004\bj\u0010FR\u001c\u0010n\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bm\u0010X\u001a\u0004\bl\u0010NR\u001c\u0010r\u001a\u0004\u0018\u00010$8GX\u0087\u0004¢\u0006\f\u0012\u0004\bq\u0010X\u001a\u0004\bo\u0010pR\u001c\u0010&\u001a\u0004\u0018\u00010\u00178FX\u0087\u0004¢\u0006\f\u0012\u0004\bt\u0010X\u001a\u0004\bs\u0010bR\u001c\u0010'\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\bv\u0010X\u001a\u0004\bu\u0010FR\u001c\u0010y\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bx\u0010X\u001a\u0004\bw\u0010NR\u001c\u0010(\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\f\u0012\u0004\b{\u0010X\u001a\u0004\bz\u0010TR\u001c\u0010~\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b}\u0010X\u001a\u0004\b|\u0010NR\u001d\u0010)\u001a\u0004\u0018\u00010\u00178FX\u0087\u0004¢\u0006\r\u0012\u0005\b\u0080\u0001\u0010X\u001a\u0004\b\u007f\u0010bR\u001e\u0010*\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0082\u0001\u0010X\u001a\u0005\b\u0081\u0001\u0010TR\u001f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0084\u0001\u0010X\u001a\u0005\b\u0083\u0001\u0010NR\u001f\u0010,\u001a\u0004\u0018\u00010+8FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b\u0088\u0001\u0010X\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008a\u0001\u0010X\u001a\u0005\b\u0089\u0001\u0010NR\u001e\u0010.\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008d\u0001\u0010X\u001a\u0005\b\u008c\u0001\u0010TR\u001f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008f\u0001\u0010X\u001a\u0005\b\u008e\u0001\u0010NR\u001e\u0010/\u001a\u0004\u0018\u00010\u00178FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0092\u0001\u0010X\u001a\u0005\b\u0091\u0001\u0010bR%\u00101\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001008FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b\u0095\u0001\u0010X\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0097\u0001\u0010X\u001a\u0005\b\u0096\u0001\u0010NR\u001e\u00103\u001a\u0004\u0018\u00010\u00178FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u009a\u0001\u0010X\u001a\u0005\b\u0099\u0001\u0010bR\u001e\u00104\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u009c\u0001\u0010X\u001a\u0005\b\u009b\u0001\u0010TR\u001f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u009e\u0001\u0010X\u001a\u0005\b\u009d\u0001\u0010NR\u001e\u00105\u001a\u0004\u0018\u00010\u00178FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¡\u0001\u0010X\u001a\u0005\b \u0001\u0010bR\u001e\u00106\u001a\u0004\u0018\u00010 8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b£\u0001\u0010X\u001a\u0005\b¢\u0001\u0010eR\u001f\u0010¦\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¥\u0001\u0010X\u001a\u0005\b¤\u0001\u0010NR%\u00107\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001008FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b¨\u0001\u0010X\u001a\u0006\b§\u0001\u0010\u0094\u0001R\u001f\u0010«\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bª\u0001\u0010X\u001a\u0005\b©\u0001\u0010NR\u001e\u00108\u001a\u0004\u0018\u00010\u00178FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u00ad\u0001\u0010X\u001a\u0005\b¬\u0001\u0010bR\u001e\u00109\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¯\u0001\u0010X\u001a\u0005\b®\u0001\u0010TR\u001f\u0010²\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b±\u0001\u0010X\u001a\u0005\b°\u0001\u0010NR\u001e\u0010:\u001a\u0004\u0018\u00010\u00178FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b´\u0001\u0010X\u001a\u0005\b³\u0001\u0010bR%\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001008FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b¶\u0001\u0010X\u001a\u0006\bµ\u0001\u0010\u0094\u0001R\u001f\u0010¹\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¸\u0001\u0010X\u001a\u0005\b·\u0001\u0010NR\u001e\u0010<\u001a\u0004\u0018\u00010\u00178FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b»\u0001\u0010X\u001a\u0005\bº\u0001\u0010bR\u001f\u0010>\u001a\u0004\u0018\u00010=8FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b¾\u0001\u0010X\u001a\u0006\b¼\u0001\u0010½\u0001R\u001f\u0010Á\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÀ\u0001\u0010X\u001a\u0005\b¿\u0001\u0010NR%\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001008FX\u0087\u0004¢\u0006\u000f\u0012\u0005\bÃ\u0001\u0010X\u001a\u0006\bÂ\u0001\u0010\u0094\u0001R\u001f\u0010Æ\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÅ\u0001\u0010X\u001a\u0005\bÄ\u0001\u0010NR\u001e\u0010A\u001a\u0004\u0018\u00010\u00178FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÈ\u0001\u0010X\u001a\u0005\bÇ\u0001\u0010bR\u001f\u0010C\u001a\u0004\u0018\u00010B8FX\u0087\u0004¢\u0006\u000f\u0012\u0005\bË\u0001\u0010X\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u001f\u0010Î\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\bÍ\u0001\u0010X\u001a\u0005\bÌ\u0001\u0010N¨\u0006Ð\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "Lcom/mapbox/maps/extension/style/layers/generated/ModelLayerDsl;", "Lcom/mapbox/maps/extension/style/layers/Layer;", "", "layerId", "sourceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sourceLayer", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "slot", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "filter", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "maxZoom", "modelId", "modelAmbientOcclusionIntensity", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "modelAmbientOcclusionIntensityTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "", "modelCastShadows", "(Z)Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "modelColor", "", "(I)Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "modelColorTransition", "modelColorUseTheme", "modelColorMixIntensity", "modelColorMixIntensityTransition", "modelCutoffFadeRange", "Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelElevationReference;", "modelElevationReference", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelElevationReference;)Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "modelEmissiveStrength", "modelEmissiveStrengthTransition", "", "modelHeightBasedEmissiveStrengthMultiplier", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "modelHeightBasedEmissiveStrengthMultiplierTransition", "modelOpacity", "modelOpacityTransition", "modelReceiveShadows", "modelRotation", "modelRotationTransition", "modelRoughness", "modelRoughnessTransition", "modelScale", "modelScaleTransition", "Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelScaleMode;", "modelScaleMode", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelScaleMode;)Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "modelTranslation", "modelTranslationTransition", "Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelType;", "modelType", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelType;)Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "getType$extension_style_release", "()Ljava/lang/String;", "getType", "Ljava/lang/String;", "getLayerId", "getSourceId", "getSourceLayer", "getSlot", "getFilter", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getVisibilityAsExpression", "visibilityAsExpression", "getMinZoom", "()Ljava/lang/Double;", "getMaxZoom", "getModelId", "getModelId$annotations", "()V", "getModelIdAsExpression", "getModelIdAsExpression$annotations", "modelIdAsExpression", "getModelAmbientOcclusionIntensity", "getModelAmbientOcclusionIntensity$annotations", "getModelAmbientOcclusionIntensityAsExpression", "getModelAmbientOcclusionIntensityAsExpression$annotations", "modelAmbientOcclusionIntensityAsExpression", "getModelAmbientOcclusionIntensityTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getModelAmbientOcclusionIntensityTransition$annotations", "getModelCastShadows", "()Ljava/lang/Boolean;", "getModelCastShadows$annotations", "getModelCastShadowsAsExpression", "getModelCastShadowsAsExpression$annotations", "modelCastShadowsAsExpression", "getModelColor", "getModelColor$annotations", "getModelColorAsExpression", "getModelColorAsExpression$annotations", "modelColorAsExpression", "getModelColorAsColorInt", "()Ljava/lang/Integer;", "getModelColorAsColorInt$annotations", "modelColorAsColorInt", "getModelColorTransition", "getModelColorTransition$annotations", "getModelColorUseTheme", "getModelColorUseTheme$annotations", "getModelColorUseThemeAsExpression", "getModelColorUseThemeAsExpression$annotations", "modelColorUseThemeAsExpression", "getModelColorMixIntensity", "getModelColorMixIntensity$annotations", "getModelColorMixIntensityAsExpression", "getModelColorMixIntensityAsExpression$annotations", "modelColorMixIntensityAsExpression", "getModelColorMixIntensityTransition", "getModelColorMixIntensityTransition$annotations", "getModelCutoffFadeRange", "getModelCutoffFadeRange$annotations", "getModelCutoffFadeRangeAsExpression", "getModelCutoffFadeRangeAsExpression$annotations", "modelCutoffFadeRangeAsExpression", "getModelElevationReference", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelElevationReference;", "getModelElevationReference$annotations", "getModelElevationReferenceAsExpression", "getModelElevationReferenceAsExpression$annotations", "modelElevationReferenceAsExpression", "getModelEmissiveStrength", "getModelEmissiveStrength$annotations", "getModelEmissiveStrengthAsExpression", "getModelEmissiveStrengthAsExpression$annotations", "modelEmissiveStrengthAsExpression", "getModelEmissiveStrengthTransition", "getModelEmissiveStrengthTransition$annotations", "getModelHeightBasedEmissiveStrengthMultiplier", "()Ljava/util/List;", "getModelHeightBasedEmissiveStrengthMultiplier$annotations", "getModelHeightBasedEmissiveStrengthMultiplierAsExpression", "getModelHeightBasedEmissiveStrengthMultiplierAsExpression$annotations", "modelHeightBasedEmissiveStrengthMultiplierAsExpression", "getModelHeightBasedEmissiveStrengthMultiplierTransition", "getModelHeightBasedEmissiveStrengthMultiplierTransition$annotations", "getModelOpacity", "getModelOpacity$annotations", "getModelOpacityAsExpression", "getModelOpacityAsExpression$annotations", "modelOpacityAsExpression", "getModelOpacityTransition", "getModelOpacityTransition$annotations", "getModelReceiveShadows", "getModelReceiveShadows$annotations", "getModelReceiveShadowsAsExpression", "getModelReceiveShadowsAsExpression$annotations", "modelReceiveShadowsAsExpression", "getModelRotation", "getModelRotation$annotations", "getModelRotationAsExpression", "getModelRotationAsExpression$annotations", "modelRotationAsExpression", "getModelRotationTransition", "getModelRotationTransition$annotations", "getModelRoughness", "getModelRoughness$annotations", "getModelRoughnessAsExpression", "getModelRoughnessAsExpression$annotations", "modelRoughnessAsExpression", "getModelRoughnessTransition", "getModelRoughnessTransition$annotations", "getModelScale", "getModelScale$annotations", "getModelScaleAsExpression", "getModelScaleAsExpression$annotations", "modelScaleAsExpression", "getModelScaleTransition", "getModelScaleTransition$annotations", "getModelScaleMode", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelScaleMode;", "getModelScaleMode$annotations", "getModelScaleModeAsExpression", "getModelScaleModeAsExpression$annotations", "modelScaleModeAsExpression", "getModelTranslation", "getModelTranslation$annotations", "getModelTranslationAsExpression", "getModelTranslationAsExpression$annotations", "modelTranslationAsExpression", "getModelTranslationTransition", "getModelTranslationTransition$annotations", "getModelType", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelType;", "getModelType$annotations", "getModelTypeAsExpression", "getModelTypeAsExpression$annotations", "modelTypeAsExpression", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
public final class ModelLayer extends Layer implements ModelLayerDsl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String layerId;
    private final String sourceId;

    public ModelLayer(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.layerId = str;
        this.sourceId = str2;
        setInternalSourceId$extension_style_release(str2);
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelAmbientOcclusionIntensity$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelAmbientOcclusionIntensityAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelAmbientOcclusionIntensityTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelCastShadows$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelCastShadowsAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelColor$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelColorAsColorInt$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelColorAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelColorMixIntensity$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelColorMixIntensityAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelColorMixIntensityTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelColorTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelCutoffFadeRange$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelCutoffFadeRangeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelElevationReference$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelElevationReferenceAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelEmissiveStrength$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelEmissiveStrengthAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelEmissiveStrengthTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelHeightBasedEmissiveStrengthMultiplier$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelHeightBasedEmissiveStrengthMultiplierAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelHeightBasedEmissiveStrengthMultiplierTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelId$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelIdAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelOpacity$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelOpacityAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelOpacityTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelReceiveShadows$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelReceiveShadowsAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelRotation$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelRotationAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelRotationTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelRoughness$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelRoughnessAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelRoughnessTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelScale$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelScaleAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelScaleMode$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelScaleModeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelScaleTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelTranslation$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelTranslationAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelTranslationTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelType$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelTypeAsExpression$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    public ModelLayer filter(Expression filter) {
        q2.r(filter, "filter", filter, this);
        return this;
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

    public final Double getModelAmbientOcclusionIntensity() {
        return (Double) getPropertyValueWithType("model-ambient-occlusion-intensity", Double.class);
    }

    public final Expression getModelAmbientOcclusionIntensityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-ambient-occlusion-intensity");
    }

    public final StyleTransition getModelAmbientOcclusionIntensityTransition() {
        return (StyleTransition) getPropertyValueWithType("model-ambient-occlusion-intensity-transition", StyleTransition.class);
    }

    public final Boolean getModelCastShadows() {
        return (Boolean) getPropertyValueWithType("model-cast-shadows", Boolean.class);
    }

    public final Expression getModelCastShadowsAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-cast-shadows");
    }

    public final String getModelColor() {
        Expression modelColorAsExpression = getModelColorAsExpression();
        if (modelColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(modelColorAsExpression);
        }
        return null;
    }

    public final Integer getModelColorAsColorInt() {
        Expression modelColorAsExpression = getModelColorAsExpression();
        if (modelColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(modelColorAsExpression);
        }
        return null;
    }

    public final Expression getModelColorAsExpression() {
        return (Expression) getPropertyValueWithType("model-color", Expression.class);
    }

    public final Double getModelColorMixIntensity() {
        return (Double) getPropertyValueWithType("model-color-mix-intensity", Double.class);
    }

    public final Expression getModelColorMixIntensityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-color-mix-intensity");
    }

    public final StyleTransition getModelColorMixIntensityTransition() {
        return (StyleTransition) getPropertyValueWithType("model-color-mix-intensity-transition", StyleTransition.class);
    }

    public final StyleTransition getModelColorTransition() {
        return (StyleTransition) getPropertyValueWithType("model-color-transition", StyleTransition.class);
    }

    public final String getModelColorUseTheme() {
        return (String) getPropertyValueWithType("model-color-use-theme", String.class);
    }

    public final Expression getModelColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-color-use-theme");
    }

    public final Double getModelCutoffFadeRange() {
        return (Double) getPropertyValueWithType("model-cutoff-fade-range", Double.class);
    }

    public final Expression getModelCutoffFadeRangeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-cutoff-fade-range");
    }

    public final ModelElevationReference getModelElevationReference() {
        String str = (String) getPropertyValueWithType("model-elevation-reference", String.class);
        if (str == null) {
            return null;
        }
        ModelElevationReference.Companion companion = ModelElevationReference.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    public final Expression getModelElevationReferenceAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("model-elevation-reference", Expression.class);
        if (expression != null) {
            return expression;
        }
        ModelElevationReference modelElevationReference = getModelElevationReference();
        if (modelElevationReference != null) {
            return Expression.INSTANCE.literal(modelElevationReference.getValue());
        }
        return null;
    }

    public final Double getModelEmissiveStrength() {
        return (Double) getPropertyValueWithType("model-emissive-strength", Double.class);
    }

    public final Expression getModelEmissiveStrengthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-emissive-strength");
    }

    public final StyleTransition getModelEmissiveStrengthTransition() {
        return (StyleTransition) getPropertyValueWithType("model-emissive-strength-transition", StyleTransition.class);
    }

    public final List<Double> getModelHeightBasedEmissiveStrengthMultiplier() {
        return (List) getPropertyValueWithType("model-height-based-emissive-strength-multiplier", List.class);
    }

    public final Expression getModelHeightBasedEmissiveStrengthMultiplierAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-height-based-emissive-strength-multiplier");
    }

    public final StyleTransition getModelHeightBasedEmissiveStrengthMultiplierTransition() {
        return (StyleTransition) getPropertyValueWithType("model-height-based-emissive-strength-multiplier-transition", StyleTransition.class);
    }

    public final String getModelId() {
        return (String) getPropertyValueWithType("model-id", String.class);
    }

    public final Expression getModelIdAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-id");
    }

    public final Double getModelOpacity() {
        return (Double) getPropertyValueWithType("model-opacity", Double.class);
    }

    public final Expression getModelOpacityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-opacity");
    }

    public final StyleTransition getModelOpacityTransition() {
        return (StyleTransition) getPropertyValueWithType("model-opacity-transition", StyleTransition.class);
    }

    public final Boolean getModelReceiveShadows() {
        return (Boolean) getPropertyValueWithType("model-receive-shadows", Boolean.class);
    }

    public final Expression getModelReceiveShadowsAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-receive-shadows");
    }

    public final List<Double> getModelRotation() {
        return (List) getPropertyValueWithType("model-rotation", List.class);
    }

    public final Expression getModelRotationAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-rotation");
    }

    public final StyleTransition getModelRotationTransition() {
        return (StyleTransition) getPropertyValueWithType("model-rotation-transition", StyleTransition.class);
    }

    public final Double getModelRoughness() {
        return (Double) getPropertyValueWithType("model-roughness", Double.class);
    }

    public final Expression getModelRoughnessAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-roughness");
    }

    public final StyleTransition getModelRoughnessTransition() {
        return (StyleTransition) getPropertyValueWithType("model-roughness-transition", StyleTransition.class);
    }

    public final List<Double> getModelScale() {
        return (List) getPropertyValueWithType("model-scale", List.class);
    }

    public final Expression getModelScaleAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-scale");
    }

    public final ModelScaleMode getModelScaleMode() {
        String str = (String) getPropertyValueWithType("model-scale-mode", String.class);
        if (str == null) {
            return null;
        }
        ModelScaleMode.Companion companion = ModelScaleMode.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    public final Expression getModelScaleModeAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("model-scale-mode", Expression.class);
        if (expression != null) {
            return expression;
        }
        ModelScaleMode modelScaleMode = getModelScaleMode();
        if (modelScaleMode != null) {
            return Expression.INSTANCE.literal(modelScaleMode.getValue());
        }
        return null;
    }

    public final StyleTransition getModelScaleTransition() {
        return (StyleTransition) getPropertyValueWithType("model-scale-transition", StyleTransition.class);
    }

    public final List<Double> getModelTranslation() {
        return (List) getPropertyValueWithType("model-translation", List.class);
    }

    public final Expression getModelTranslationAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("model-translation");
    }

    public final StyleTransition getModelTranslationTransition() {
        return (StyleTransition) getPropertyValueWithType("model-translation-transition", StyleTransition.class);
    }

    public final ModelType getModelType() {
        String str = (String) getPropertyValueWithType("model-type", String.class);
        if (str == null) {
            return null;
        }
        ModelType.Companion companion = ModelType.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    public final Expression getModelTypeAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("model-type", Expression.class);
        if (expression != null) {
            return expression;
        }
        ModelType modelType = getModelType();
        if (modelType != null) {
            return Expression.INSTANCE.literal(modelType.getValue());
        }
        return null;
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
        return ModelSourceWrapper.TYPE;
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
    public ModelLayer maxZoom(double maxZoom) {
        setProperty$extension_style_release(new PropertyValue<>("maxzoom", Double.valueOf(maxZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public ModelLayer minZoom(double minZoom) {
        setProperty$extension_style_release(new PropertyValue<>("minzoom", Double.valueOf(minZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelAmbientOcclusionIntensity(double modelAmbientOcclusionIntensity) {
        setProperty$extension_style_release(new PropertyValue<>("model-ambient-occlusion-intensity", Double.valueOf(modelAmbientOcclusionIntensity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelAmbientOcclusionIntensityTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        modelAmbientOcclusionIntensityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelCastShadows(boolean modelCastShadows) {
        setProperty$extension_style_release(new PropertyValue<>("model-cast-shadows", Boolean.valueOf(modelCastShadows)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelColor(int modelColor) {
        setProperty$extension_style_release(new PropertyValue<>("model-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(modelColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelColorMixIntensity(double modelColorMixIntensity) {
        setProperty$extension_style_release(new PropertyValue<>("model-color-mix-intensity", Double.valueOf(modelColorMixIntensity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelColorMixIntensityTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        modelColorMixIntensityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelColorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        modelColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelColorUseTheme(String modelColorUseTheme) {
        modelColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-color-use-theme", modelColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelCutoffFadeRange(double modelCutoffFadeRange) {
        setProperty$extension_style_release(new PropertyValue<>("model-cutoff-fade-range", Double.valueOf(modelCutoffFadeRange)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelElevationReference(ModelElevationReference modelElevationReference) {
        modelElevationReference.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-elevation-reference", modelElevationReference));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelEmissiveStrength(double modelEmissiveStrength) {
        setProperty$extension_style_release(new PropertyValue<>("model-emissive-strength", Double.valueOf(modelEmissiveStrength)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelEmissiveStrengthTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        modelEmissiveStrengthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelHeightBasedEmissiveStrengthMultiplier(List<Double> modelHeightBasedEmissiveStrengthMultiplier) {
        modelHeightBasedEmissiveStrengthMultiplier.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-height-based-emissive-strength-multiplier", modelHeightBasedEmissiveStrengthMultiplier));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelHeightBasedEmissiveStrengthMultiplierTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        modelHeightBasedEmissiveStrengthMultiplierTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelId(String modelId) {
        modelId.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-id", modelId));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelOpacity(double modelOpacity) {
        setProperty$extension_style_release(new PropertyValue<>("model-opacity", Double.valueOf(modelOpacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelOpacityTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        modelOpacityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelReceiveShadows(boolean modelReceiveShadows) {
        setProperty$extension_style_release(new PropertyValue<>("model-receive-shadows", Boolean.valueOf(modelReceiveShadows)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelRotation(List<Double> modelRotation) {
        modelRotation.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-rotation", modelRotation));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelRotationTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        modelRotationTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelRoughness(double modelRoughness) {
        setProperty$extension_style_release(new PropertyValue<>("model-roughness", Double.valueOf(modelRoughness)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelRoughnessTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        modelRoughnessTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelScale(List<Double> modelScale) {
        modelScale.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-scale", modelScale));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelScaleMode(ModelScaleMode modelScaleMode) {
        modelScaleMode.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-scale-mode", modelScaleMode));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelScaleTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        modelScaleTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelTranslation(List<Double> modelTranslation) {
        modelTranslation.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-translation", modelTranslation));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelTranslationTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        modelTranslationTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelType(ModelType modelType) {
        modelType.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-type", modelType));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public ModelLayer slot(String slot) {
        slot.getClass();
        setProperty$extension_style_release(new PropertyValue<>("slot", slot));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    public ModelLayer sourceLayer(String sourceLayer) {
        sourceLayer.getClass();
        setProperty$extension_style_release(new PropertyValue<>("source-layer", sourceLayer));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public ModelLayer visibility(Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00178FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0010R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u0002\u001a\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$8GX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0002\u001a\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010\u0002\u001a\u0004\b*\u0010\u0010R\u001c\u0010+\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0002\u001a\u0004\b-\u0010\u0006R\u001c\u0010.\u001a\u0004\u0018\u00010\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010\u0002\u001a\u0004\b0\u0010\u0010R\u001c\u00101\u001a\u0004\u0018\u00010\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b2\u0010\u0002\u001a\u0004\b3\u0010\u0015R\u001c\u00104\u001a\u0004\u0018\u00010\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u0010\u0002\u001a\u0004\b6\u0010\u0015R\u001c\u00107\u001a\u0004\u0018\u00010\u001f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b8\u0010\u0002\u001a\u0004\b9\u0010\"R\u001c\u0010:\u001a\u0004\u0018\u00010\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b;\u0010\u0002\u001a\u0004\b<\u0010\u0010R\u001c\u0010=\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b>\u0010\u0002\u001a\u0004\b?\u0010\u0006R\u001c\u0010@\u001a\u0004\u0018\u00010\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\bA\u0010\u0002\u001a\u0004\bB\u0010\u0010R\u001c\u0010C\u001a\u0004\u0018\u00010D8FX\u0087\u0004¢\u0006\f\u0012\u0004\bE\u0010\u0002\u001a\u0004\bF\u0010GR\u001c\u0010H\u001a\u0004\u0018\u00010\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\bI\u0010\u0002\u001a\u0004\bJ\u0010\u0010R\u001c\u0010K\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bL\u0010\u0002\u001a\u0004\bM\u0010\u0006R\u001c\u0010N\u001a\u0004\u0018\u00010\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\bO\u0010\u0002\u001a\u0004\bP\u0010\u0010R\u001c\u0010Q\u001a\u0004\u0018\u00010\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\bR\u0010\u0002\u001a\u0004\bS\u0010\u0015R\"\u0010T\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010U8FX\u0087\u0004¢\u0006\f\u0012\u0004\bV\u0010\u0002\u001a\u0004\bW\u0010XR\u001c\u0010Y\u001a\u0004\u0018\u00010\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\bZ\u0010\u0002\u001a\u0004\b[\u0010\u0010R\u001c\u0010\\\u001a\u0004\u0018\u00010\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b]\u0010\u0002\u001a\u0004\b^\u0010\u0015R\u001c\u0010_\u001a\u0004\u0018\u00010\u001f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b`\u0010\u0002\u001a\u0004\ba\u0010\"R\u001c\u0010b\u001a\u0004\u0018\u00010\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\bc\u0010\u0002\u001a\u0004\bd\u0010\u0010R\u001c\u0010e\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bf\u0010\u0002\u001a\u0004\bg\u0010\u0006R\u001c\u0010h\u001a\u0004\u0018\u00010\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\bi\u0010\u0002\u001a\u0004\bj\u0010\u0010R\u001c\u0010k\u001a\u0004\u0018\u00010\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\bl\u0010\u0002\u001a\u0004\bm\u0010\u0015R\u001c\u0010n\u001a\u0004\u0018\u00010\u00178FX\u0087\u0004¢\u0006\f\u0012\u0004\bo\u0010\u0002\u001a\u0004\bp\u0010\u001aR\u001c\u0010q\u001a\u0004\u0018\u00010\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\br\u0010\u0002\u001a\u0004\bs\u0010\u0010R\"\u0010t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010U8FX\u0087\u0004¢\u0006\f\u0012\u0004\bu\u0010\u0002\u001a\u0004\bv\u0010XR\u001c\u0010w\u001a\u0004\u0018\u00010\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\bx\u0010\u0002\u001a\u0004\by\u0010\u0010R\u001c\u0010z\u001a\u0004\u0018\u00010\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b{\u0010\u0002\u001a\u0004\b|\u0010\u0015R\u001c\u0010}\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b~\u0010\u0002\u001a\u0004\b\u007f\u0010\u0006R\u001f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\r8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0081\u0001\u0010\u0002\u001a\u0005\b\u0082\u0001\u0010\u0010R\u001f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00128FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0084\u0001\u0010\u0002\u001a\u0005\b\u0085\u0001\u0010\u0015R%\u0010\u0086\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010U8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0087\u0001\u0010\u0002\u001a\u0005\b\u0088\u0001\u0010XR\u001f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\r8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008a\u0001\u0010\u0002\u001a\u0005\b\u008b\u0001\u0010\u0010R!\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008d\u00018FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b\u008e\u0001\u0010\u0002\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\r8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0092\u0001\u0010\u0002\u001a\u0005\b\u0093\u0001\u0010\u0010R\u001f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00128FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0095\u0001\u0010\u0002\u001a\u0005\b\u0096\u0001\u0010\u0015R%\u0010\u0097\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010U8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0098\u0001\u0010\u0002\u001a\u0005\b\u0099\u0001\u0010XR\u001f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\r8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u009b\u0001\u0010\u0002\u001a\u0005\b\u009c\u0001\u0010\u0010R\u001f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00128FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u009e\u0001\u0010\u0002\u001a\u0005\b\u009f\u0001\u0010\u0015R!\u0010 \u0001\u001a\u0005\u0018\u00010¡\u00018FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b¢\u0001\u0010\u0002\u001a\u0006\b£\u0001\u0010¤\u0001R\u001f\u0010¥\u0001\u001a\u0004\u0018\u00010\r8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¦\u0001\u0010\u0002\u001a\u0005\b§\u0001\u0010\u0010R\u0017\u0010¨\u0001\u001a\u0005\u0018\u00010©\u00018F¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001¨\u0006¬\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer$Companion;", "", "()V", "defaultMaxZoom", "", "getDefaultMaxZoom", "()Ljava/lang/Double;", "defaultMinZoom", "getDefaultMinZoom", "defaultModelAmbientOcclusionIntensity", "getDefaultModelAmbientOcclusionIntensity$annotations", "getDefaultModelAmbientOcclusionIntensity", "defaultModelAmbientOcclusionIntensityAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getDefaultModelAmbientOcclusionIntensityAsExpression$annotations", "getDefaultModelAmbientOcclusionIntensityAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "defaultModelAmbientOcclusionIntensityTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getDefaultModelAmbientOcclusionIntensityTransition$annotations", "getDefaultModelAmbientOcclusionIntensityTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "defaultModelCastShadows", "", "getDefaultModelCastShadows$annotations", "getDefaultModelCastShadows", "()Ljava/lang/Boolean;", "defaultModelCastShadowsAsExpression", "getDefaultModelCastShadowsAsExpression$annotations", "getDefaultModelCastShadowsAsExpression", "defaultModelColor", "", "getDefaultModelColor$annotations", "getDefaultModelColor", "()Ljava/lang/String;", "defaultModelColorAsColorInt", "", "getDefaultModelColorAsColorInt$annotations", "getDefaultModelColorAsColorInt", "()Ljava/lang/Integer;", "defaultModelColorAsExpression", "getDefaultModelColorAsExpression$annotations", "getDefaultModelColorAsExpression", "defaultModelColorMixIntensity", "getDefaultModelColorMixIntensity$annotations", "getDefaultModelColorMixIntensity", "defaultModelColorMixIntensityAsExpression", "getDefaultModelColorMixIntensityAsExpression$annotations", "getDefaultModelColorMixIntensityAsExpression", "defaultModelColorMixIntensityTransition", "getDefaultModelColorMixIntensityTransition$annotations", "getDefaultModelColorMixIntensityTransition", "defaultModelColorTransition", "getDefaultModelColorTransition$annotations", "getDefaultModelColorTransition", "defaultModelColorUseTheme", "getDefaultModelColorUseTheme$annotations", "getDefaultModelColorUseTheme", "defaultModelColorUseThemeAsExpression", "getDefaultModelColorUseThemeAsExpression$annotations", "getDefaultModelColorUseThemeAsExpression", "defaultModelCutoffFadeRange", "getDefaultModelCutoffFadeRange$annotations", "getDefaultModelCutoffFadeRange", "defaultModelCutoffFadeRangeAsExpression", "getDefaultModelCutoffFadeRangeAsExpression$annotations", "getDefaultModelCutoffFadeRangeAsExpression", "defaultModelElevationReference", "Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelElevationReference;", "getDefaultModelElevationReference$annotations", "getDefaultModelElevationReference", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelElevationReference;", "defaultModelElevationReferenceAsExpression", "getDefaultModelElevationReferenceAsExpression$annotations", "getDefaultModelElevationReferenceAsExpression", "defaultModelEmissiveStrength", "getDefaultModelEmissiveStrength$annotations", "getDefaultModelEmissiveStrength", "defaultModelEmissiveStrengthAsExpression", "getDefaultModelEmissiveStrengthAsExpression$annotations", "getDefaultModelEmissiveStrengthAsExpression", "defaultModelEmissiveStrengthTransition", "getDefaultModelEmissiveStrengthTransition$annotations", "getDefaultModelEmissiveStrengthTransition", "defaultModelHeightBasedEmissiveStrengthMultiplier", "", "getDefaultModelHeightBasedEmissiveStrengthMultiplier$annotations", "getDefaultModelHeightBasedEmissiveStrengthMultiplier", "()Ljava/util/List;", "defaultModelHeightBasedEmissiveStrengthMultiplierAsExpression", "getDefaultModelHeightBasedEmissiveStrengthMultiplierAsExpression$annotations", "getDefaultModelHeightBasedEmissiveStrengthMultiplierAsExpression", "defaultModelHeightBasedEmissiveStrengthMultiplierTransition", "getDefaultModelHeightBasedEmissiveStrengthMultiplierTransition$annotations", "getDefaultModelHeightBasedEmissiveStrengthMultiplierTransition", "defaultModelId", "getDefaultModelId$annotations", "getDefaultModelId", "defaultModelIdAsExpression", "getDefaultModelIdAsExpression$annotations", "getDefaultModelIdAsExpression", "defaultModelOpacity", "getDefaultModelOpacity$annotations", "getDefaultModelOpacity", "defaultModelOpacityAsExpression", "getDefaultModelOpacityAsExpression$annotations", "getDefaultModelOpacityAsExpression", "defaultModelOpacityTransition", "getDefaultModelOpacityTransition$annotations", "getDefaultModelOpacityTransition", "defaultModelReceiveShadows", "getDefaultModelReceiveShadows$annotations", "getDefaultModelReceiveShadows", "defaultModelReceiveShadowsAsExpression", "getDefaultModelReceiveShadowsAsExpression$annotations", "getDefaultModelReceiveShadowsAsExpression", "defaultModelRotation", "getDefaultModelRotation$annotations", "getDefaultModelRotation", "defaultModelRotationAsExpression", "getDefaultModelRotationAsExpression$annotations", "getDefaultModelRotationAsExpression", "defaultModelRotationTransition", "getDefaultModelRotationTransition$annotations", "getDefaultModelRotationTransition", "defaultModelRoughness", "getDefaultModelRoughness$annotations", "getDefaultModelRoughness", "defaultModelRoughnessAsExpression", "getDefaultModelRoughnessAsExpression$annotations", "getDefaultModelRoughnessAsExpression", "defaultModelRoughnessTransition", "getDefaultModelRoughnessTransition$annotations", "getDefaultModelRoughnessTransition", "defaultModelScale", "getDefaultModelScale$annotations", "getDefaultModelScale", "defaultModelScaleAsExpression", "getDefaultModelScaleAsExpression$annotations", "getDefaultModelScaleAsExpression", "defaultModelScaleMode", "Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelScaleMode;", "getDefaultModelScaleMode$annotations", "getDefaultModelScaleMode", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelScaleMode;", "defaultModelScaleModeAsExpression", "getDefaultModelScaleModeAsExpression$annotations", "getDefaultModelScaleModeAsExpression", "defaultModelScaleTransition", "getDefaultModelScaleTransition$annotations", "getDefaultModelScaleTransition", "defaultModelTranslation", "getDefaultModelTranslation$annotations", "getDefaultModelTranslation", "defaultModelTranslationAsExpression", "getDefaultModelTranslationAsExpression$annotations", "getDefaultModelTranslationAsExpression", "defaultModelTranslationTransition", "getDefaultModelTranslationTransition$annotations", "getDefaultModelTranslationTransition", "defaultModelType", "Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelType;", "getDefaultModelType$annotations", "getDefaultModelType", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelType;", "defaultModelTypeAsExpression", "getDefaultModelTypeAsExpression$annotations", "getDefaultModelTypeAsExpression", "defaultVisibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getDefaultVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelAmbientOcclusionIntensity$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelAmbientOcclusionIntensityAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelAmbientOcclusionIntensityTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelCastShadows$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelCastShadowsAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelColor$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelColorAsColorInt$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelColorAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelColorMixIntensity$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelColorMixIntensityAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelColorMixIntensityTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelColorTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelCutoffFadeRange$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelCutoffFadeRangeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelElevationReference$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelElevationReferenceAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelEmissiveStrength$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelEmissiveStrengthAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelEmissiveStrengthTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelHeightBasedEmissiveStrengthMultiplier$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelHeightBasedEmissiveStrengthMultiplierAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelHeightBasedEmissiveStrengthMultiplierTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelId$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelIdAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelOpacity$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelOpacityAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelOpacityTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelReceiveShadows$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelReceiveShadowsAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelRotation$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelRotationAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelRotationTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelRoughness$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelRoughnessAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelRoughnessTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelScale$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelScaleAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelScaleMode$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelScaleModeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelScaleTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelTranslation$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelTranslationAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelTranslationTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelType$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultModelTypeAsExpression$annotations() {
        }

        public final Double getDefaultMaxZoom() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "maxzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "minzoom");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Double getDefaultModelAmbientOcclusionIntensity() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-ambient-occlusion-intensity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultModelAmbientOcclusionIntensityAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-ambient-occlusion-intensity");
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
            Double defaultModelAmbientOcclusionIntensity = getDefaultModelAmbientOcclusionIntensity();
            if (defaultModelAmbientOcclusionIntensity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultModelAmbientOcclusionIntensity.doubleValue());
        }

        public final StyleTransition getDefaultModelAmbientOcclusionIntensityTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-ambient-occlusion-intensity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Boolean getDefaultModelCastShadows() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-cast-shadows");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Boolean.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Boolean) objUnwrap;
        }

        public final Expression getDefaultModelCastShadowsAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-cast-shadows");
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
            Boolean defaultModelCastShadows = getDefaultModelCastShadows();
            if (defaultModelCastShadows == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultModelCastShadows.booleanValue());
        }

        public final String getDefaultModelColor() {
            Expression defaultModelColorAsExpression = getDefaultModelColorAsExpression();
            if (defaultModelColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultModelColorAsExpression);
            }
            return null;
        }

        public final Integer getDefaultModelColorAsColorInt() {
            Expression defaultModelColorAsExpression = getDefaultModelColorAsExpression();
            if (defaultModelColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultModelColorAsExpression);
            }
            return null;
        }

        public final Expression getDefaultModelColorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-color");
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

        public final Double getDefaultModelColorMixIntensity() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-color-mix-intensity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultModelColorMixIntensityAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-color-mix-intensity");
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
            Double defaultModelColorMixIntensity = getDefaultModelColorMixIntensity();
            if (defaultModelColorMixIntensity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultModelColorMixIntensity.doubleValue());
        }

        public final StyleTransition getDefaultModelColorMixIntensityTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-color-mix-intensity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final StyleTransition getDefaultModelColorTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultModelColorUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultModelColorUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-color-use-theme");
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
            String defaultModelColorUseTheme = getDefaultModelColorUseTheme();
            if (defaultModelColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultModelColorUseTheme);
            }
            return null;
        }

        public final Double getDefaultModelCutoffFadeRange() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-cutoff-fade-range");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultModelCutoffFadeRangeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-cutoff-fade-range");
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
            Double defaultModelCutoffFadeRange = getDefaultModelCutoffFadeRange();
            if (defaultModelCutoffFadeRange == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultModelCutoffFadeRange.doubleValue());
        }

        public final ModelElevationReference getDefaultModelElevationReference() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-elevation-reference");
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
            ModelElevationReference.Companion companion = ModelElevationReference.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        public final Expression getDefaultModelElevationReferenceAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-elevation-reference");
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
            ModelElevationReference defaultModelElevationReference = getDefaultModelElevationReference();
            if (defaultModelElevationReference != null) {
                return Expression.INSTANCE.literal(defaultModelElevationReference.getValue());
            }
            return null;
        }

        public final Double getDefaultModelEmissiveStrength() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-emissive-strength");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultModelEmissiveStrengthAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-emissive-strength");
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
            Double defaultModelEmissiveStrength = getDefaultModelEmissiveStrength();
            if (defaultModelEmissiveStrength == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultModelEmissiveStrength.doubleValue());
        }

        public final StyleTransition getDefaultModelEmissiveStrengthTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-emissive-strength-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final List<Double> getDefaultModelHeightBasedEmissiveStrengthMultiplier() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-height-based-emissive-strength-multiplier");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (List) objUnwrap;
        }

        public final Expression getDefaultModelHeightBasedEmissiveStrengthMultiplierAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-height-based-emissive-strength-multiplier");
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
            List<Double> defaultModelHeightBasedEmissiveStrengthMultiplier = getDefaultModelHeightBasedEmissiveStrengthMultiplier();
            if (defaultModelHeightBasedEmissiveStrengthMultiplier != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultModelHeightBasedEmissiveStrengthMultiplier);
            }
            return null;
        }

        public final StyleTransition getDefaultModelHeightBasedEmissiveStrengthMultiplierTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-height-based-emissive-strength-multiplier-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultModelId() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-id");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultModelIdAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-id");
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
            String defaultModelId = getDefaultModelId();
            if (defaultModelId != null) {
                return Expression.INSTANCE.literal(defaultModelId);
            }
            return null;
        }

        public final Double getDefaultModelOpacity() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-opacity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultModelOpacityAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-opacity");
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
            Double defaultModelOpacity = getDefaultModelOpacity();
            if (defaultModelOpacity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultModelOpacity.doubleValue());
        }

        public final StyleTransition getDefaultModelOpacityTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-opacity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Boolean getDefaultModelReceiveShadows() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-receive-shadows");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Boolean.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Boolean) objUnwrap;
        }

        public final Expression getDefaultModelReceiveShadowsAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-receive-shadows");
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
            Boolean defaultModelReceiveShadows = getDefaultModelReceiveShadows();
            if (defaultModelReceiveShadows == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultModelReceiveShadows.booleanValue());
        }

        public final List<Double> getDefaultModelRotation() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-rotation");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (List) objUnwrap;
        }

        public final Expression getDefaultModelRotationAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-rotation");
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
            List<Double> defaultModelRotation = getDefaultModelRotation();
            if (defaultModelRotation != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultModelRotation);
            }
            return null;
        }

        public final StyleTransition getDefaultModelRotationTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-rotation-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultModelRoughness() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-roughness");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultModelRoughnessAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-roughness");
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
            Double defaultModelRoughness = getDefaultModelRoughness();
            if (defaultModelRoughness == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultModelRoughness.doubleValue());
        }

        public final StyleTransition getDefaultModelRoughnessTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-roughness-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final List<Double> getDefaultModelScale() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-scale");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (List) objUnwrap;
        }

        public final Expression getDefaultModelScaleAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-scale");
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
            List<Double> defaultModelScale = getDefaultModelScale();
            if (defaultModelScale != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultModelScale);
            }
            return null;
        }

        public final ModelScaleMode getDefaultModelScaleMode() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-scale-mode");
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
            ModelScaleMode.Companion companion = ModelScaleMode.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        public final Expression getDefaultModelScaleModeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-scale-mode");
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
            ModelScaleMode defaultModelScaleMode = getDefaultModelScaleMode();
            if (defaultModelScaleMode != null) {
                return Expression.INSTANCE.literal(defaultModelScaleMode.getValue());
            }
            return null;
        }

        public final StyleTransition getDefaultModelScaleTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-scale-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final List<Double> getDefaultModelTranslation() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-translation");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (List) objUnwrap;
        }

        public final Expression getDefaultModelTranslationAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-translation");
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
            List<Double> defaultModelTranslation = getDefaultModelTranslation();
            if (defaultModelTranslation != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultModelTranslation);
            }
            return null;
        }

        public final StyleTransition getDefaultModelTranslationTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-translation-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final ModelType getDefaultModelType() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-type");
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
            ModelType.Companion companion = ModelType.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        public final Expression getDefaultModelTypeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "model-type");
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
            ModelType defaultModelType = getDefaultModelType();
            if (defaultModelType != null) {
                return Expression.INSTANCE.literal(defaultModelType.getValue());
            }
            return null;
        }

        public final Visibility getDefaultVisibility() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(ModelSourceWrapper.TYPE, "visibility");
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

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelColorUseTheme(Expression modelColorUseTheme) {
        q2.r(modelColorUseTheme, "model-color-use-theme", modelColorUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelElevationReference(Expression modelElevationReference) {
        q2.r(modelElevationReference, "model-elevation-reference", modelElevationReference, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelHeightBasedEmissiveStrengthMultiplier(Expression modelHeightBasedEmissiveStrengthMultiplier) {
        q2.r(modelHeightBasedEmissiveStrengthMultiplier, "model-height-based-emissive-strength-multiplier", modelHeightBasedEmissiveStrengthMultiplier, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelId(Expression modelId) {
        q2.r(modelId, "model-id", modelId, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelRotation(Expression modelRotation) {
        q2.r(modelRotation, "model-rotation", modelRotation, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelScale(Expression modelScale) {
        q2.r(modelScale, "model-scale", modelScale, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelScaleMode(Expression modelScaleMode) {
        q2.r(modelScaleMode, "model-scale-mode", modelScaleMode, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelTranslation(Expression modelTranslation) {
        q2.r(modelTranslation, "model-translation", modelTranslation, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelType(Expression modelType) {
        q2.r(modelType, "model-type", modelType, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelAmbientOcclusionIntensity(Expression modelAmbientOcclusionIntensity) {
        q2.r(modelAmbientOcclusionIntensity, "model-ambient-occlusion-intensity", modelAmbientOcclusionIntensity, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelCastShadows(Expression modelCastShadows) {
        q2.r(modelCastShadows, "model-cast-shadows", modelCastShadows, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelColorMixIntensity(Expression modelColorMixIntensity) {
        q2.r(modelColorMixIntensity, "model-color-mix-intensity", modelColorMixIntensity, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelCutoffFadeRange(Expression modelCutoffFadeRange) {
        q2.r(modelCutoffFadeRange, "model-cutoff-fade-range", modelCutoffFadeRange, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelEmissiveStrength(Expression modelEmissiveStrength) {
        q2.r(modelEmissiveStrength, "model-emissive-strength", modelEmissiveStrength, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelOpacity(Expression modelOpacity) {
        q2.r(modelOpacity, "model-opacity", modelOpacity, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelReceiveShadows(Expression modelReceiveShadows) {
        q2.r(modelReceiveShadows, "model-receive-shadows", modelReceiveShadows, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelRoughness(Expression modelRoughness) {
        q2.r(modelRoughness, "model-roughness", modelRoughness, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public ModelLayer visibility(Expression visibility) {
        q2.r(visibility, "visibility", visibility, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelColor(Expression modelColor) {
        q2.r(modelColor, "model-color", modelColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelAmbientOcclusionIntensityTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-ambient-occlusion-intensity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelColor(String modelColor) {
        modelColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-color", modelColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelColorMixIntensityTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-color-mix-intensity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelColorTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelEmissiveStrengthTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-emissive-strength-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelHeightBasedEmissiveStrengthMultiplierTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-height-based-emissive-strength-multiplier-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelOpacityTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-opacity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelRotationTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-rotation-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelRoughnessTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-roughness-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelScaleTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-scale-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.ModelLayerDsl
    @MapboxExperimental
    public ModelLayer modelTranslationTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("model-translation-transition", options));
        return this;
    }
}
