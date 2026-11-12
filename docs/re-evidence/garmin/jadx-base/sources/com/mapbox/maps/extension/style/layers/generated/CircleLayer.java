package com.mapbox.maps.extension.style.layers.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.StyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.CircleElevationReference;
import com.mapbox.maps.extension.style.layers.properties.generated.CirclePitchAlignment;
import com.mapbox.maps.extension.style.layers.properties.generated.CirclePitchScale;
import com.mapbox.maps.extension.style.layers.properties.generated.CircleTranslateAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.p;
import com.mapbox.maps.plugin.annotation.generated.CircleAnnotationOptions;
import e23.l;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b`\b\u0007\u0018\u0000 \u009e\u00012\u00020\u00012\u00020\u0002:\u0002\u009e\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0016\u0010\rJ\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\rJ\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\rJ\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001c\u001a\u00020\u00002\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eH\u0016¢\u0006\u0004\b\u001c\u0010\"J\u0017\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010\tJ\u0017\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010\rJ\u0019\u0010#\u001a\u00020\u00002\b\b\u0001\u0010#\u001a\u00020$H\u0016¢\u0006\u0004\b#\u0010%J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b&\u0010\u001dJ#\u0010&\u001a\u00020\u00002\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eH\u0016¢\u0006\u0004\b&\u0010\"J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0003H\u0017¢\u0006\u0004\b'\u0010\tJ\u0017\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u000bH\u0017¢\u0006\u0004\b'\u0010\rJ\u0017\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0011H\u0016¢\u0006\u0004\b(\u0010\u0013J\u0017\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u000bH\u0016¢\u0006\u0004\b(\u0010\rJ\u0017\u0010)\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b)\u0010\u001dJ#\u0010)\u001a\u00020\u00002\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eH\u0016¢\u0006\u0004\b)\u0010\"J\u0017\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0011H\u0016¢\u0006\u0004\b*\u0010\u0013J\u0017\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u000bH\u0016¢\u0006\u0004\b*\u0010\rJ\u0017\u0010+\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b+\u0010\u001dJ#\u0010+\u001a\u00020\u00002\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eH\u0016¢\u0006\u0004\b+\u0010\"J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u000bH\u0016¢\u0006\u0004\b-\u0010\rJ\u0017\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u000bH\u0016¢\u0006\u0004\b0\u0010\rJ\u0017\u00102\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0011H\u0016¢\u0006\u0004\b2\u0010\u0013J\u0017\u00102\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u000bH\u0016¢\u0006\u0004\b2\u0010\rJ\u0017\u00103\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b3\u0010\u001dJ#\u00103\u001a\u00020\u00002\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eH\u0016¢\u0006\u0004\b3\u0010\"J\u0017\u00104\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0003H\u0016¢\u0006\u0004\b4\u0010\tJ\u0017\u00104\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u000bH\u0016¢\u0006\u0004\b4\u0010\rJ\u0019\u00104\u001a\u00020\u00002\b\b\u0001\u00104\u001a\u00020$H\u0016¢\u0006\u0004\b4\u0010%J\u0017\u00105\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b5\u0010\u001dJ#\u00105\u001a\u00020\u00002\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eH\u0016¢\u0006\u0004\b5\u0010\"J\u0017\u00106\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0003H\u0017¢\u0006\u0004\b6\u0010\tJ\u0017\u00106\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u000bH\u0017¢\u0006\u0004\b6\u0010\rJ\u0017\u00107\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0011H\u0016¢\u0006\u0004\b7\u0010\u0013J\u0017\u00107\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u000bH\u0016¢\u0006\u0004\b7\u0010\rJ\u0017\u00108\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b8\u0010\u001dJ#\u00108\u001a\u00020\u00002\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eH\u0016¢\u0006\u0004\b8\u0010\"J\u0017\u00109\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u0011H\u0016¢\u0006\u0004\b9\u0010\u0013J\u0017\u00109\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u000bH\u0016¢\u0006\u0004\b9\u0010\rJ\u0017\u0010:\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b:\u0010\u001dJ#\u0010:\u001a\u00020\u00002\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eH\u0016¢\u0006\u0004\b:\u0010\"J\u001d\u0010<\u001a\u00020\u00002\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00110;H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010<\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u000bH\u0016¢\u0006\u0004\b<\u0010\rJ\u0017\u0010>\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b>\u0010\u001dJ#\u0010>\u001a\u00020\u00002\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eH\u0016¢\u0006\u0004\b>\u0010\"J\u0017\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u000bH\u0016¢\u0006\u0004\b@\u0010\rJ\u000f\u0010D\u001a\u00020\u0003H\u0010¢\u0006\u0004\bB\u0010CR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010E\u001a\u0004\bF\u0010CR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bG\u0010CR\u0013\u0010\b\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bH\u0010CR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010CR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0016\u0010O\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010KR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010QR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158FX\u0087\u0004¢\u0006\f\u0012\u0004\bU\u0010V\u001a\u0004\bS\u0010TR\u001c\u0010Y\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bX\u0010V\u001a\u0004\bW\u0010KR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bZ\u0010QR\u0013\u0010\\\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b[\u0010KR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b]\u0010QR\u0013\u0010_\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b^\u0010KR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0013\u0010#\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bb\u0010CR\u0013\u0010d\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bc\u0010KR\u0013\u0010g\u001a\u0004\u0018\u00010$8G¢\u0006\u0006\u001a\u0004\be\u0010fR\u0013\u0010&\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bh\u0010aR\u001c\u0010'\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\bj\u0010V\u001a\u0004\bi\u0010CR\u001c\u0010m\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bl\u0010V\u001a\u0004\bk\u0010KR\u0013\u0010(\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bn\u0010QR\u0013\u0010p\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bo\u0010KR\u0013\u0010)\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bq\u0010aR\u0013\u0010*\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\br\u0010QR\u0013\u0010t\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bs\u0010KR\u0013\u0010+\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bu\u0010aR\u0013\u0010-\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0013\u0010y\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bx\u0010KR\u0013\u00100\u001a\u0004\u0018\u00010/8F¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0013\u0010}\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b|\u0010KR\u0013\u00102\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b~\u0010QR\u0014\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u007f\u0010KR\u0014\u00103\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010aR\u0014\u00104\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010CR\u0015\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010KR\u0015\u0010\u0086\u0001\u001a\u0004\u0018\u00010$8G¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010fR\u0014\u00105\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010aR\u001e\u00106\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0089\u0001\u0010V\u001a\u0005\b\u0088\u0001\u0010CR\u001f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008b\u0001\u0010V\u001a\u0005\b\u008a\u0001\u0010KR\u0014\u00107\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010QR\u0015\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010KR\u0014\u00108\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010aR\u0014\u00109\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010QR\u0015\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010KR\u0014\u0010:\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010aR\u001b\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010;8F¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0015\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010KR\u0014\u0010>\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010aR\u0015\u0010@\u001a\u0004\u0018\u00010?8F¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0015\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010K¨\u0006\u009f\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "Lcom/mapbox/maps/extension/style/layers/generated/CircleLayerDsl;", "Lcom/mapbox/maps/extension/style/layers/Layer;", "", "layerId", "sourceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sourceLayer", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "slot", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "filter", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "maxZoom", "Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleElevationReference;", "circleElevationReference", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleElevationReference;)Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "circleSortKey", "circleBlur", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "circleBlurTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "circleColor", "", "(I)Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "circleColorTransition", "circleColorUseTheme", "circleEmissiveStrength", "circleEmissiveStrengthTransition", "circleOpacity", "circleOpacityTransition", "Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchAlignment;", "circlePitchAlignment", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchAlignment;)Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchScale;", "circlePitchScale", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchScale;)Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "circleRadius", "circleRadiusTransition", "circleStrokeColor", "circleStrokeColorTransition", "circleStrokeColorUseTheme", "circleStrokeOpacity", "circleStrokeOpacityTransition", "circleStrokeWidth", "circleStrokeWidthTransition", "", "circleTranslate", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "circleTranslateTransition", "Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleTranslateAnchor;", "circleTranslateAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleTranslateAnchor;)Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "getType$extension_style_release", "()Ljava/lang/String;", "getType", "Ljava/lang/String;", "getLayerId", "getSourceId", "getSourceLayer", "getSlot", "getFilter", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getVisibilityAsExpression", "visibilityAsExpression", "getMinZoom", "()Ljava/lang/Double;", "getMaxZoom", "getCircleElevationReference", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleElevationReference;", "getCircleElevationReference$annotations", "()V", "getCircleElevationReferenceAsExpression", "getCircleElevationReferenceAsExpression$annotations", "circleElevationReferenceAsExpression", "getCircleSortKey", "getCircleSortKeyAsExpression", "circleSortKeyAsExpression", "getCircleBlur", "getCircleBlurAsExpression", "circleBlurAsExpression", "getCircleBlurTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getCircleColor", "getCircleColorAsExpression", "circleColorAsExpression", "getCircleColorAsColorInt", "()Ljava/lang/Integer;", "circleColorAsColorInt", "getCircleColorTransition", "getCircleColorUseTheme", "getCircleColorUseTheme$annotations", "getCircleColorUseThemeAsExpression", "getCircleColorUseThemeAsExpression$annotations", "circleColorUseThemeAsExpression", "getCircleEmissiveStrength", "getCircleEmissiveStrengthAsExpression", "circleEmissiveStrengthAsExpression", "getCircleEmissiveStrengthTransition", "getCircleOpacity", "getCircleOpacityAsExpression", "circleOpacityAsExpression", "getCircleOpacityTransition", "getCirclePitchAlignment", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchAlignment;", "getCirclePitchAlignmentAsExpression", "circlePitchAlignmentAsExpression", "getCirclePitchScale", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchScale;", "getCirclePitchScaleAsExpression", "circlePitchScaleAsExpression", "getCircleRadius", "getCircleRadiusAsExpression", "circleRadiusAsExpression", "getCircleRadiusTransition", "getCircleStrokeColor", "getCircleStrokeColorAsExpression", "circleStrokeColorAsExpression", "getCircleStrokeColorAsColorInt", "circleStrokeColorAsColorInt", "getCircleStrokeColorTransition", "getCircleStrokeColorUseTheme", "getCircleStrokeColorUseTheme$annotations", "getCircleStrokeColorUseThemeAsExpression", "getCircleStrokeColorUseThemeAsExpression$annotations", "circleStrokeColorUseThemeAsExpression", "getCircleStrokeOpacity", "getCircleStrokeOpacityAsExpression", "circleStrokeOpacityAsExpression", "getCircleStrokeOpacityTransition", "getCircleStrokeWidth", "getCircleStrokeWidthAsExpression", "circleStrokeWidthAsExpression", "getCircleStrokeWidthTransition", "getCircleTranslate", "()Ljava/util/List;", "getCircleTranslateAsExpression", "circleTranslateAsExpression", "getCircleTranslateTransition", "getCircleTranslateAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleTranslateAnchor;", "getCircleTranslateAnchorAsExpression", "circleTranslateAnchorAsExpression", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CircleLayer extends Layer implements CircleLayerDsl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String layerId;
    private final String sourceId;

    public CircleLayer(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.layerId = str;
        this.sourceId = str2;
        setInternalSourceId$extension_style_release(str2);
    }

    @MapboxExperimental
    public static /* synthetic */ void getCircleColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getCircleColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getCircleElevationReference$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getCircleElevationReferenceAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getCircleStrokeColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getCircleStrokeColorUseThemeAsExpression$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleBlur(double circleBlur) {
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_BLUR, Double.valueOf(circleBlur)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleBlurTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        circleBlurTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleColor(int circleColor) {
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR, ColorUtils.INSTANCE.colorIntToRgbaExpression(circleColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleColorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        circleColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @MapboxExperimental
    public CircleLayer circleColorUseTheme(String circleColorUseTheme) {
        circleColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR_USE_THEME, circleColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @MapboxExperimental
    public CircleLayer circleElevationReference(CircleElevationReference circleElevationReference) {
        circleElevationReference.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-elevation-reference", circleElevationReference));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleEmissiveStrength(double circleEmissiveStrength) {
        setProperty$extension_style_release(new PropertyValue<>("circle-emissive-strength", Double.valueOf(circleEmissiveStrength)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleEmissiveStrengthTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        circleEmissiveStrengthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleOpacity(double circleOpacity) {
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_OPACITY, Double.valueOf(circleOpacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleOpacityTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        circleOpacityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circlePitchAlignment(CirclePitchAlignment circlePitchAlignment) {
        circlePitchAlignment.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-pitch-alignment", circlePitchAlignment));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circlePitchScale(CirclePitchScale circlePitchScale) {
        circlePitchScale.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-pitch-scale", circlePitchScale));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleRadius(double circleRadius) {
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_RADIUS, Double.valueOf(circleRadius)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleRadiusTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        circleRadiusTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleSortKey(double circleSortKey) {
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_SORT_KEY, Double.valueOf(circleSortKey)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleStrokeColor(int circleStrokeColor) {
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR, ColorUtils.INSTANCE.colorIntToRgbaExpression(circleStrokeColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleStrokeColorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        circleStrokeColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @MapboxExperimental
    public CircleLayer circleStrokeColorUseTheme(String circleStrokeColorUseTheme) {
        circleStrokeColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME, circleStrokeColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleStrokeOpacity(double circleStrokeOpacity) {
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_OPACITY, Double.valueOf(circleStrokeOpacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleStrokeOpacityTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        circleStrokeOpacityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleStrokeWidth(double circleStrokeWidth) {
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_WIDTH, Double.valueOf(circleStrokeWidth)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleStrokeWidthTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        circleStrokeWidthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleTranslate(List<Double> circleTranslate) {
        circleTranslate.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-translate", circleTranslate));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleTranslateAnchor(CircleTranslateAnchor circleTranslateAnchor) {
        circleTranslateAnchor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-translate-anchor", circleTranslateAnchor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleTranslateTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        circleTranslateTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer filter(Expression filter) {
        filter.getClass();
        setProperty$extension_style_release(new PropertyValue<>("filter", filter));
        return this;
    }

    public final Double getCircleBlur() {
        return (Double) getPropertyValueWithType(CircleAnnotationOptions.PROPERTY_CIRCLE_BLUR, Double.class);
    }

    public final Expression getCircleBlurAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(CircleAnnotationOptions.PROPERTY_CIRCLE_BLUR);
    }

    public final StyleTransition getCircleBlurTransition() {
        return (StyleTransition) getPropertyValueWithType("circle-blur-transition", StyleTransition.class);
    }

    public final String getCircleColor() {
        Expression circleColorAsExpression = getCircleColorAsExpression();
        if (circleColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(circleColorAsExpression);
        }
        return null;
    }

    public final Integer getCircleColorAsColorInt() {
        Expression circleColorAsExpression = getCircleColorAsExpression();
        if (circleColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(circleColorAsExpression);
        }
        return null;
    }

    public final Expression getCircleColorAsExpression() {
        return (Expression) getPropertyValueWithType(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR, Expression.class);
    }

    public final StyleTransition getCircleColorTransition() {
        return (StyleTransition) getPropertyValueWithType("circle-color-transition", StyleTransition.class);
    }

    public final String getCircleColorUseTheme() {
        return (String) getPropertyValueWithType(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR_USE_THEME, String.class);
    }

    public final Expression getCircleColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR_USE_THEME);
    }

    public final CircleElevationReference getCircleElevationReference() {
        String str = (String) getPropertyValueWithType("circle-elevation-reference", String.class);
        if (str == null) {
            return null;
        }
        CircleElevationReference.Companion companion = CircleElevationReference.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    public final Expression getCircleElevationReferenceAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("circle-elevation-reference", Expression.class);
        if (expression != null) {
            return expression;
        }
        CircleElevationReference circleElevationReference = getCircleElevationReference();
        if (circleElevationReference != null) {
            return Expression.INSTANCE.literal(circleElevationReference.getValue());
        }
        return null;
    }

    public final Double getCircleEmissiveStrength() {
        return (Double) getPropertyValueWithType("circle-emissive-strength", Double.class);
    }

    public final Expression getCircleEmissiveStrengthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("circle-emissive-strength");
    }

    public final StyleTransition getCircleEmissiveStrengthTransition() {
        return (StyleTransition) getPropertyValueWithType("circle-emissive-strength-transition", StyleTransition.class);
    }

    public final Double getCircleOpacity() {
        return (Double) getPropertyValueWithType(CircleAnnotationOptions.PROPERTY_CIRCLE_OPACITY, Double.class);
    }

    public final Expression getCircleOpacityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(CircleAnnotationOptions.PROPERTY_CIRCLE_OPACITY);
    }

    public final StyleTransition getCircleOpacityTransition() {
        return (StyleTransition) getPropertyValueWithType("circle-opacity-transition", StyleTransition.class);
    }

    public final CirclePitchAlignment getCirclePitchAlignment() {
        String str = (String) getPropertyValueWithType("circle-pitch-alignment", String.class);
        if (str == null) {
            return null;
        }
        CirclePitchAlignment.Companion companion = CirclePitchAlignment.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    public final Expression getCirclePitchAlignmentAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("circle-pitch-alignment", Expression.class);
        if (expression != null) {
            return expression;
        }
        CirclePitchAlignment circlePitchAlignment = getCirclePitchAlignment();
        if (circlePitchAlignment != null) {
            return Expression.INSTANCE.literal(circlePitchAlignment.getValue());
        }
        return null;
    }

    public final CirclePitchScale getCirclePitchScale() {
        String str = (String) getPropertyValueWithType("circle-pitch-scale", String.class);
        if (str == null) {
            return null;
        }
        CirclePitchScale.Companion companion = CirclePitchScale.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    public final Expression getCirclePitchScaleAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("circle-pitch-scale", Expression.class);
        if (expression != null) {
            return expression;
        }
        CirclePitchScale circlePitchScale = getCirclePitchScale();
        if (circlePitchScale != null) {
            return Expression.INSTANCE.literal(circlePitchScale.getValue());
        }
        return null;
    }

    public final Double getCircleRadius() {
        return (Double) getPropertyValueWithType(CircleAnnotationOptions.PROPERTY_CIRCLE_RADIUS, Double.class);
    }

    public final Expression getCircleRadiusAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(CircleAnnotationOptions.PROPERTY_CIRCLE_RADIUS);
    }

    public final StyleTransition getCircleRadiusTransition() {
        return (StyleTransition) getPropertyValueWithType("circle-radius-transition", StyleTransition.class);
    }

    public final Double getCircleSortKey() {
        return (Double) getPropertyValueWithType(CircleAnnotationOptions.PROPERTY_CIRCLE_SORT_KEY, Double.class);
    }

    public final Expression getCircleSortKeyAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(CircleAnnotationOptions.PROPERTY_CIRCLE_SORT_KEY);
    }

    public final String getCircleStrokeColor() {
        Expression circleStrokeColorAsExpression = getCircleStrokeColorAsExpression();
        if (circleStrokeColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(circleStrokeColorAsExpression);
        }
        return null;
    }

    public final Integer getCircleStrokeColorAsColorInt() {
        Expression circleStrokeColorAsExpression = getCircleStrokeColorAsExpression();
        if (circleStrokeColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(circleStrokeColorAsExpression);
        }
        return null;
    }

    public final Expression getCircleStrokeColorAsExpression() {
        return (Expression) getPropertyValueWithType(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR, Expression.class);
    }

    public final StyleTransition getCircleStrokeColorTransition() {
        return (StyleTransition) getPropertyValueWithType("circle-stroke-color-transition", StyleTransition.class);
    }

    public final String getCircleStrokeColorUseTheme() {
        return (String) getPropertyValueWithType(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME, String.class);
    }

    public final Expression getCircleStrokeColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME);
    }

    public final Double getCircleStrokeOpacity() {
        return (Double) getPropertyValueWithType(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_OPACITY, Double.class);
    }

    public final Expression getCircleStrokeOpacityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_OPACITY);
    }

    public final StyleTransition getCircleStrokeOpacityTransition() {
        return (StyleTransition) getPropertyValueWithType("circle-stroke-opacity-transition", StyleTransition.class);
    }

    public final Double getCircleStrokeWidth() {
        return (Double) getPropertyValueWithType(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_WIDTH, Double.class);
    }

    public final Expression getCircleStrokeWidthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_WIDTH);
    }

    public final StyleTransition getCircleStrokeWidthTransition() {
        return (StyleTransition) getPropertyValueWithType("circle-stroke-width-transition", StyleTransition.class);
    }

    public final List<Double> getCircleTranslate() {
        return (List) getPropertyValueWithType("circle-translate", List.class);
    }

    public final CircleTranslateAnchor getCircleTranslateAnchor() {
        String str = (String) getPropertyValueWithType("circle-translate-anchor", String.class);
        if (str == null) {
            return null;
        }
        CircleTranslateAnchor.Companion companion = CircleTranslateAnchor.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    public final Expression getCircleTranslateAnchorAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("circle-translate-anchor", Expression.class);
        if (expression != null) {
            return expression;
        }
        CircleTranslateAnchor circleTranslateAnchor = getCircleTranslateAnchor();
        if (circleTranslateAnchor != null) {
            return Expression.INSTANCE.literal(circleTranslateAnchor.getValue());
        }
        return null;
    }

    public final Expression getCircleTranslateAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("circle-translate");
    }

    public final StyleTransition getCircleTranslateTransition() {
        return (StyleTransition) getPropertyValueWithType("circle-translate-transition", StyleTransition.class);
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
        return TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE;
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
    public CircleLayer maxZoom(double maxZoom) {
        setProperty$extension_style_release(new PropertyValue<>("maxzoom", Double.valueOf(maxZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public CircleLayer minZoom(double minZoom) {
        setProperty$extension_style_release(new PropertyValue<>("minzoom", Double.valueOf(minZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public CircleLayer slot(String slot) {
        slot.getClass();
        setProperty$extension_style_release(new PropertyValue<>("slot", slot));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer sourceLayer(String sourceLayer) {
        sourceLayer.getClass();
        setProperty$extension_style_release(new PropertyValue<>("source-layer", sourceLayer));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public CircleLayer visibility(Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\nR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000eR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0012R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\nR\u001c\u0010!\u001a\u0004\u0018\u00010\"8FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0002\u001a\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b'\u0010\u0002\u001a\u0004\b(\u0010\nR\u0013\u0010)\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b*\u0010\u0006R\u0013\u0010+\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\nR\u0013\u0010-\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b.\u0010\u000eR\u0013\u0010/\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b0\u0010\u0006R\u0013\u00101\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b2\u0010\nR\u0013\u00103\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b4\u0010\u000eR\u0013\u00105\u001a\u0004\u0018\u0001068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0013\u00109\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b:\u0010\nR\u0013\u0010;\u001a\u0004\u0018\u00010<8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0013\u0010?\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b@\u0010\nR\u0013\u0010A\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bB\u0010\u0006R\u0013\u0010C\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bD\u0010\nR\u0013\u0010E\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bF\u0010\u000eR\u0013\u0010G\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bH\u0010\u0006R\u0013\u0010I\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bJ\u0010\nR\u0013\u0010K\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bL\u0010\u0012R\u0013\u0010M\u001a\u0004\u0018\u00010\u00148G¢\u0006\u0006\u001a\u0004\bN\u0010\u0016R\u0013\u0010O\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bP\u0010\nR\u0013\u0010Q\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bR\u0010\u000eR\u001c\u0010S\u001a\u0004\u0018\u00010\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\bT\u0010\u0002\u001a\u0004\bU\u0010\u0012R\u001c\u0010V\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bW\u0010\u0002\u001a\u0004\bX\u0010\nR\u0013\u0010Y\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bZ\u0010\u0006R\u0013\u0010[\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\\\u0010\nR\u0013\u0010]\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b^\u0010\u000eR\u0013\u0010_\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b`\u0010\u0006R\u0013\u0010a\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bb\u0010\nR\u0013\u0010c\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bd\u0010\u000eR\u0019\u0010e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010f8F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0013\u0010i\u001a\u0004\u0018\u00010j8F¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0013\u0010m\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bn\u0010\nR\u0013\u0010o\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bp\u0010\nR\u0013\u0010q\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\br\u0010\u000eR\u0013\u0010s\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bt\u0010\u0006R\u0013\u0010u\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bv\u0010\u0006R\u0013\u0010w\u001a\u0004\u0018\u00010x8F¢\u0006\u0006\u001a\u0004\by\u0010z¨\u0006{"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer$Companion;", "", "()V", "defaultCircleBlur", "", "getDefaultCircleBlur", "()Ljava/lang/Double;", "defaultCircleBlurAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getDefaultCircleBlurAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "defaultCircleBlurTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getDefaultCircleBlurTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "defaultCircleColor", "", "getDefaultCircleColor", "()Ljava/lang/String;", "defaultCircleColorAsColorInt", "", "getDefaultCircleColorAsColorInt", "()Ljava/lang/Integer;", "defaultCircleColorAsExpression", "getDefaultCircleColorAsExpression", "defaultCircleColorTransition", "getDefaultCircleColorTransition", "defaultCircleColorUseTheme", "getDefaultCircleColorUseTheme$annotations", "getDefaultCircleColorUseTheme", "defaultCircleColorUseThemeAsExpression", "getDefaultCircleColorUseThemeAsExpression$annotations", "getDefaultCircleColorUseThemeAsExpression", "defaultCircleElevationReference", "Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleElevationReference;", "getDefaultCircleElevationReference$annotations", "getDefaultCircleElevationReference", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleElevationReference;", "defaultCircleElevationReferenceAsExpression", "getDefaultCircleElevationReferenceAsExpression$annotations", "getDefaultCircleElevationReferenceAsExpression", "defaultCircleEmissiveStrength", "getDefaultCircleEmissiveStrength", "defaultCircleEmissiveStrengthAsExpression", "getDefaultCircleEmissiveStrengthAsExpression", "defaultCircleEmissiveStrengthTransition", "getDefaultCircleEmissiveStrengthTransition", "defaultCircleOpacity", "getDefaultCircleOpacity", "defaultCircleOpacityAsExpression", "getDefaultCircleOpacityAsExpression", "defaultCircleOpacityTransition", "getDefaultCircleOpacityTransition", "defaultCirclePitchAlignment", "Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchAlignment;", "getDefaultCirclePitchAlignment", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchAlignment;", "defaultCirclePitchAlignmentAsExpression", "getDefaultCirclePitchAlignmentAsExpression", "defaultCirclePitchScale", "Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchScale;", "getDefaultCirclePitchScale", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchScale;", "defaultCirclePitchScaleAsExpression", "getDefaultCirclePitchScaleAsExpression", "defaultCircleRadius", "getDefaultCircleRadius", "defaultCircleRadiusAsExpression", "getDefaultCircleRadiusAsExpression", "defaultCircleRadiusTransition", "getDefaultCircleRadiusTransition", "defaultCircleSortKey", "getDefaultCircleSortKey", "defaultCircleSortKeyAsExpression", "getDefaultCircleSortKeyAsExpression", "defaultCircleStrokeColor", "getDefaultCircleStrokeColor", "defaultCircleStrokeColorAsColorInt", "getDefaultCircleStrokeColorAsColorInt", "defaultCircleStrokeColorAsExpression", "getDefaultCircleStrokeColorAsExpression", "defaultCircleStrokeColorTransition", "getDefaultCircleStrokeColorTransition", "defaultCircleStrokeColorUseTheme", "getDefaultCircleStrokeColorUseTheme$annotations", "getDefaultCircleStrokeColorUseTheme", "defaultCircleStrokeColorUseThemeAsExpression", "getDefaultCircleStrokeColorUseThemeAsExpression$annotations", "getDefaultCircleStrokeColorUseThemeAsExpression", "defaultCircleStrokeOpacity", "getDefaultCircleStrokeOpacity", "defaultCircleStrokeOpacityAsExpression", "getDefaultCircleStrokeOpacityAsExpression", "defaultCircleStrokeOpacityTransition", "getDefaultCircleStrokeOpacityTransition", "defaultCircleStrokeWidth", "getDefaultCircleStrokeWidth", "defaultCircleStrokeWidthAsExpression", "getDefaultCircleStrokeWidthAsExpression", "defaultCircleStrokeWidthTransition", "getDefaultCircleStrokeWidthTransition", "defaultCircleTranslate", "", "getDefaultCircleTranslate", "()Ljava/util/List;", "defaultCircleTranslateAnchor", "Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleTranslateAnchor;", "getDefaultCircleTranslateAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleTranslateAnchor;", "defaultCircleTranslateAnchorAsExpression", "getDefaultCircleTranslateAnchorAsExpression", "defaultCircleTranslateAsExpression", "getDefaultCircleTranslateAsExpression", "defaultCircleTranslateTransition", "getDefaultCircleTranslateTransition", "defaultMaxZoom", "getDefaultMaxZoom", "defaultMinZoom", "getDefaultMinZoom", "defaultVisibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getDefaultVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultCircleColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultCircleColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultCircleElevationReference$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultCircleElevationReferenceAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultCircleStrokeColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultCircleStrokeColorUseThemeAsExpression$annotations() {
        }

        public final Double getDefaultCircleBlur() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, CircleAnnotationOptions.PROPERTY_CIRCLE_BLUR);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultCircleBlurAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, CircleAnnotationOptions.PROPERTY_CIRCLE_BLUR);
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
            Double defaultCircleBlur = getDefaultCircleBlur();
            if (defaultCircleBlur == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultCircleBlur.doubleValue());
        }

        public final StyleTransition getDefaultCircleBlurTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "circle-blur-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultCircleColor() {
            Expression defaultCircleColorAsExpression = getDefaultCircleColorAsExpression();
            if (defaultCircleColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultCircleColorAsExpression);
            }
            return null;
        }

        public final Integer getDefaultCircleColorAsColorInt() {
            Expression defaultCircleColorAsExpression = getDefaultCircleColorAsExpression();
            if (defaultCircleColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultCircleColorAsExpression);
            }
            return null;
        }

        public final Expression getDefaultCircleColorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR);
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

        public final StyleTransition getDefaultCircleColorTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "circle-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultCircleColorUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR_USE_THEME);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultCircleColorUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR_USE_THEME);
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
            String defaultCircleColorUseTheme = getDefaultCircleColorUseTheme();
            if (defaultCircleColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultCircleColorUseTheme);
            }
            return null;
        }

        public final CircleElevationReference getDefaultCircleElevationReference() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "circle-elevation-reference");
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
            CircleElevationReference.Companion companion = CircleElevationReference.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        public final Expression getDefaultCircleElevationReferenceAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "circle-elevation-reference");
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
            CircleElevationReference defaultCircleElevationReference = getDefaultCircleElevationReference();
            if (defaultCircleElevationReference != null) {
                return Expression.INSTANCE.literal(defaultCircleElevationReference.getValue());
            }
            return null;
        }

        public final Double getDefaultCircleEmissiveStrength() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "circle-emissive-strength");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultCircleEmissiveStrengthAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "circle-emissive-strength");
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
            Double defaultCircleEmissiveStrength = getDefaultCircleEmissiveStrength();
            if (defaultCircleEmissiveStrength == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultCircleEmissiveStrength.doubleValue());
        }

        public final StyleTransition getDefaultCircleEmissiveStrengthTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "circle-emissive-strength-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultCircleOpacity() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, CircleAnnotationOptions.PROPERTY_CIRCLE_OPACITY);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultCircleOpacityAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, CircleAnnotationOptions.PROPERTY_CIRCLE_OPACITY);
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
            Double defaultCircleOpacity = getDefaultCircleOpacity();
            if (defaultCircleOpacity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultCircleOpacity.doubleValue());
        }

        public final StyleTransition getDefaultCircleOpacityTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "circle-opacity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final CirclePitchAlignment getDefaultCirclePitchAlignment() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "circle-pitch-alignment");
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
            CirclePitchAlignment.Companion companion = CirclePitchAlignment.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        public final Expression getDefaultCirclePitchAlignmentAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "circle-pitch-alignment");
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
            CirclePitchAlignment defaultCirclePitchAlignment = getDefaultCirclePitchAlignment();
            if (defaultCirclePitchAlignment != null) {
                return Expression.INSTANCE.literal(defaultCirclePitchAlignment.getValue());
            }
            return null;
        }

        public final CirclePitchScale getDefaultCirclePitchScale() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "circle-pitch-scale");
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
            CirclePitchScale.Companion companion = CirclePitchScale.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        public final Expression getDefaultCirclePitchScaleAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "circle-pitch-scale");
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
            CirclePitchScale defaultCirclePitchScale = getDefaultCirclePitchScale();
            if (defaultCirclePitchScale != null) {
                return Expression.INSTANCE.literal(defaultCirclePitchScale.getValue());
            }
            return null;
        }

        public final Double getDefaultCircleRadius() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, CircleAnnotationOptions.PROPERTY_CIRCLE_RADIUS);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultCircleRadiusAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, CircleAnnotationOptions.PROPERTY_CIRCLE_RADIUS);
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
            Double defaultCircleRadius = getDefaultCircleRadius();
            if (defaultCircleRadius == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultCircleRadius.doubleValue());
        }

        public final StyleTransition getDefaultCircleRadiusTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "circle-radius-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultCircleSortKey() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, CircleAnnotationOptions.PROPERTY_CIRCLE_SORT_KEY);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultCircleSortKeyAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, CircleAnnotationOptions.PROPERTY_CIRCLE_SORT_KEY);
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
            Double defaultCircleSortKey = getDefaultCircleSortKey();
            if (defaultCircleSortKey == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultCircleSortKey.doubleValue());
        }

        public final String getDefaultCircleStrokeColor() {
            Expression defaultCircleStrokeColorAsExpression = getDefaultCircleStrokeColorAsExpression();
            if (defaultCircleStrokeColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultCircleStrokeColorAsExpression);
            }
            return null;
        }

        public final Integer getDefaultCircleStrokeColorAsColorInt() {
            Expression defaultCircleStrokeColorAsExpression = getDefaultCircleStrokeColorAsExpression();
            if (defaultCircleStrokeColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultCircleStrokeColorAsExpression);
            }
            return null;
        }

        public final Expression getDefaultCircleStrokeColorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR);
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

        public final StyleTransition getDefaultCircleStrokeColorTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "circle-stroke-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultCircleStrokeColorUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultCircleStrokeColorUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME);
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
            String defaultCircleStrokeColorUseTheme = getDefaultCircleStrokeColorUseTheme();
            if (defaultCircleStrokeColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultCircleStrokeColorUseTheme);
            }
            return null;
        }

        public final Double getDefaultCircleStrokeOpacity() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_OPACITY);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultCircleStrokeOpacityAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_OPACITY);
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
            Double defaultCircleStrokeOpacity = getDefaultCircleStrokeOpacity();
            if (defaultCircleStrokeOpacity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultCircleStrokeOpacity.doubleValue());
        }

        public final StyleTransition getDefaultCircleStrokeOpacityTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "circle-stroke-opacity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultCircleStrokeWidth() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_WIDTH);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultCircleStrokeWidthAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_WIDTH);
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
            Double defaultCircleStrokeWidth = getDefaultCircleStrokeWidth();
            if (defaultCircleStrokeWidth == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultCircleStrokeWidth.doubleValue());
        }

        public final StyleTransition getDefaultCircleStrokeWidthTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "circle-stroke-width-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final List<Double> getDefaultCircleTranslate() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "circle-translate");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (List) objUnwrap;
        }

        public final CircleTranslateAnchor getDefaultCircleTranslateAnchor() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "circle-translate-anchor");
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
            CircleTranslateAnchor.Companion companion = CircleTranslateAnchor.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        public final Expression getDefaultCircleTranslateAnchorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "circle-translate-anchor");
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
            CircleTranslateAnchor defaultCircleTranslateAnchor = getDefaultCircleTranslateAnchor();
            if (defaultCircleTranslateAnchor != null) {
                return Expression.INSTANCE.literal(defaultCircleTranslateAnchor.getValue());
            }
            return null;
        }

        public final Expression getDefaultCircleTranslateAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "circle-translate");
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
            List<Double> defaultCircleTranslate = getDefaultCircleTranslate();
            if (defaultCircleTranslate != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultCircleTranslate);
            }
            return null;
        }

        public final StyleTransition getDefaultCircleTranslateTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "circle-translate-transition");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "maxzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "minzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "visibility");
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

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @MapboxExperimental
    public CircleLayer circleColorUseTheme(Expression circleColorUseTheme) {
        circleColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR_USE_THEME, circleColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @MapboxExperimental
    public CircleLayer circleElevationReference(Expression circleElevationReference) {
        circleElevationReference.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-elevation-reference", circleElevationReference));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circlePitchAlignment(Expression circlePitchAlignment) {
        circlePitchAlignment.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-pitch-alignment", circlePitchAlignment));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circlePitchScale(Expression circlePitchScale) {
        circlePitchScale.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-pitch-scale", circlePitchScale));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    @MapboxExperimental
    public CircleLayer circleStrokeColorUseTheme(Expression circleStrokeColorUseTheme) {
        circleStrokeColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME, circleStrokeColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleTranslate(Expression circleTranslate) {
        circleTranslate.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-translate", circleTranslate));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleTranslateAnchor(Expression circleTranslateAnchor) {
        circleTranslateAnchor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-translate-anchor", circleTranslateAnchor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleBlur(Expression circleBlur) {
        circleBlur.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_BLUR, circleBlur));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleEmissiveStrength(Expression circleEmissiveStrength) {
        circleEmissiveStrength.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-emissive-strength", circleEmissiveStrength));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleOpacity(Expression circleOpacity) {
        circleOpacity.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_OPACITY, circleOpacity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleRadius(Expression circleRadius) {
        circleRadius.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_RADIUS, circleRadius));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleSortKey(Expression circleSortKey) {
        circleSortKey.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_SORT_KEY, circleSortKey));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleStrokeOpacity(Expression circleStrokeOpacity) {
        circleStrokeOpacity.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_OPACITY, circleStrokeOpacity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleStrokeWidth(Expression circleStrokeWidth) {
        circleStrokeWidth.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_WIDTH, circleStrokeWidth));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public CircleLayer visibility(Expression visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleColor(Expression circleColor) {
        circleColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR, circleColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleStrokeColor(Expression circleStrokeColor) {
        circleStrokeColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR, circleStrokeColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleBlurTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-blur-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleColor(String circleColor) {
        circleColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR, circleColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleColorTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleEmissiveStrengthTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-emissive-strength-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleOpacityTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-opacity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleRadiusTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-radius-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleStrokeColor(String circleStrokeColor) {
        circleStrokeColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR, circleStrokeColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleStrokeColorTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-stroke-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleStrokeOpacityTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-stroke-opacity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleStrokeWidthTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-stroke-width-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.CircleLayerDsl
    public CircleLayer circleTranslateTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("circle-translate-transition", options));
        return this;
    }
}
