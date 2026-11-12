package com.mapbox.maps.extension.compose.style.precipitations.generated;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.compose.style.ColorValue;
import com.mapbox.maps.extension.compose.style.DoubleListValue;
import com.mapbox.maps.extension.compose.style.DoubleValue;
import com.mapbox.maps.extension.compose.style.PropertyTypesKt;
import com.mapbox.maps.extension.compose.style.StringValue;
import com.mapbox.maps.extension.compose.style.Transition;
import com.mapbox.maps.extension.compose.style.internal.ValueParceler;
import com.mapbox.maps.extension.compose.style.precipitations.RainStateApplier;
import d4.k;
import d4.l;
import d4.m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.k0;
import p13.u;
import p13.u0;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b~\b\u0007\u0018\u0000 µ\u00012\u00020\u0001:\u0004µ\u0001¶\u0001BÁ\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\u0006\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 B\t\b\u0016¢\u0006\u0004\b\u001f\u0010!B\u0011\b\u0012\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b\u001f\u0010$J\u000f\u0010(\u001a\u00020%H\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u001b\u00104\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020302H\u0002¢\u0006\u0004\b4\u00105R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u00108R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0004098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0006098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\b098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010;R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0006098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010;R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000b098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010;R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u0004098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010;R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u0006098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010;R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000f098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010;R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u0006098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010;R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u0004098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010;R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u0006098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010;R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000f098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010;R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u0006098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010;R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u0004098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010;R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u0006098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010;R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u0004098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010;R\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u0006098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010;R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u0004098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010;R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\b098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010;R\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u0006098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010;R\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\u000b098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010;R\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u0006098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010;R1\u0010\u0005\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bV\u0010!\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U*\u0004\bW\u0010XR1\u0010\u0007\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u00068F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\b]\u0010!\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\*\u0004\b^\u0010XR1\u0010\t\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\b8F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bc\u0010!\u001a\u0004\b_\u0010`\"\u0004\ba\u0010b*\u0004\bd\u0010XR1\u0010\n\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u00068F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bg\u0010!\u001a\u0004\be\u0010Z\"\u0004\bf\u0010\\*\u0004\bh\u0010XR1\u0010\f\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\u000b8F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bm\u0010!\u001a\u0004\bi\u0010j\"\u0004\bk\u0010l*\u0004\bn\u0010XR1\u0010\r\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bq\u0010!\u001a\u0004\bo\u0010S\"\u0004\bp\u0010U*\u0004\br\u0010XR1\u0010\u000e\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u00068F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bu\u0010!\u001a\u0004\bs\u0010Z\"\u0004\bt\u0010\\*\u0004\bv\u0010XR1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000f8F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\b{\u0010!\u001a\u0004\bw\u0010x\"\u0004\by\u0010z*\u0004\b|\u0010XR2\u0010\u0011\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u00068F@FX\u0087\u008e\u0002¢\u0006\u0019\u0012\u0004\b\u007f\u0010!\u001a\u0004\b}\u0010Z\"\u0004\b~\u0010\\*\u0005\b\u0080\u0001\u0010XR5\u0010\u0012\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u001c\u0012\u0005\b\u0083\u0001\u0010!\u001a\u0005\b\u0081\u0001\u0010S\"\u0005\b\u0082\u0001\u0010U*\u0005\b\u0084\u0001\u0010XR5\u0010\u0013\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u00068F@FX\u0087\u008e\u0002¢\u0006\u001c\u0012\u0005\b\u0087\u0001\u0010!\u001a\u0005\b\u0085\u0001\u0010Z\"\u0005\b\u0086\u0001\u0010\\*\u0005\b\u0088\u0001\u0010XR5\u0010\u0014\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000f8F@FX\u0087\u008e\u0002¢\u0006\u001c\u0012\u0005\b\u008b\u0001\u0010!\u001a\u0005\b\u0089\u0001\u0010x\"\u0005\b\u008a\u0001\u0010z*\u0005\b\u008c\u0001\u0010XR5\u0010\u0015\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u00068F@FX\u0087\u008e\u0002¢\u0006\u001c\u0012\u0005\b\u008f\u0001\u0010!\u001a\u0005\b\u008d\u0001\u0010Z\"\u0005\b\u008e\u0001\u0010\\*\u0005\b\u0090\u0001\u0010XR5\u0010\u0016\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u001c\u0012\u0005\b\u0093\u0001\u0010!\u001a\u0005\b\u0091\u0001\u0010S\"\u0005\b\u0092\u0001\u0010U*\u0005\b\u0094\u0001\u0010XR5\u0010\u0017\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u00068F@FX\u0087\u008e\u0002¢\u0006\u001c\u0012\u0005\b\u0097\u0001\u0010!\u001a\u0005\b\u0095\u0001\u0010Z\"\u0005\b\u0096\u0001\u0010\\*\u0005\b\u0098\u0001\u0010XR5\u0010\u0018\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u001c\u0012\u0005\b\u009b\u0001\u0010!\u001a\u0005\b\u0099\u0001\u0010S\"\u0005\b\u009a\u0001\u0010U*\u0005\b\u009c\u0001\u0010XR5\u0010\u0019\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u00068F@FX\u0087\u008e\u0002¢\u0006\u001c\u0012\u0005\b\u009f\u0001\u0010!\u001a\u0005\b\u009d\u0001\u0010Z\"\u0005\b\u009e\u0001\u0010\\*\u0005\b \u0001\u0010XR5\u0010\u001a\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u001c\u0012\u0005\b£\u0001\u0010!\u001a\u0005\b¡\u0001\u0010S\"\u0005\b¢\u0001\u0010U*\u0005\b¤\u0001\u0010XR5\u0010\u001b\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\b8F@FX\u0087\u008e\u0002¢\u0006\u001c\u0012\u0005\b§\u0001\u0010!\u001a\u0005\b¥\u0001\u0010`\"\u0005\b¦\u0001\u0010b*\u0005\b¨\u0001\u0010XR5\u0010\u001c\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u00068F@FX\u0087\u008e\u0002¢\u0006\u001c\u0012\u0005\b«\u0001\u0010!\u001a\u0005\b©\u0001\u0010Z\"\u0005\bª\u0001\u0010\\*\u0005\b¬\u0001\u0010XR5\u0010\u001d\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\u000b8F@FX\u0087\u008e\u0002¢\u0006\u001c\u0012\u0005\b¯\u0001\u0010!\u001a\u0005\b\u00ad\u0001\u0010j\"\u0005\b®\u0001\u0010l*\u0005\b°\u0001\u0010XR5\u0010\u001e\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u00068F@FX\u0087\u008e\u0002¢\u0006\u001c\u0012\u0005\b³\u0001\u0010!\u001a\u0005\b±\u0001\u0010Z\"\u0005\b²\u0001\u0010\\*\u0005\b´\u0001\u0010X¨\u0006·\u0001"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState;", "", "Lcom/mapbox/maps/extension/compose/style/precipitations/RainStateApplier;", "applier", "Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "centerThinning", "Lcom/mapbox/maps/extension/compose/style/Transition;", "centerThinningTransition", "Lcom/mapbox/maps/extension/compose/style/ColorValue;", TtmlNode.ATTR_TTS_COLOR, "colorTransition", "Lcom/mapbox/maps/extension/compose/style/StringValue;", "colorUseTheme", "density", "densityTransition", "Lcom/mapbox/maps/extension/compose/style/DoubleListValue;", "direction", "directionTransition", "distortionStrength", "distortionStrengthTransition", "dropletSize", "dropletSizeTransition", "intensity", "intensityTransition", "opacity", "opacityTransition", "vignette", "vignetteColor", "vignetteColorTransition", "vignetteColorUseTheme", "vignetteTransition", "<init>", "(Lcom/mapbox/maps/extension/compose/style/precipitations/RainStateApplier;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleListValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleListValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/Transition;)V", "()V", "", "enabled", "(Z)V", "", "UpdateProperties$extension_compose_release", "(Lp3/m;I)V", "UpdateProperties", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "Lcom/mapbox/bindgen/Value;", "getProperties", "()Ljava/util/Map;", "Lcom/mapbox/maps/extension/compose/style/precipitations/RainStateApplier;", "getApplier$extension_compose_release", "()Lcom/mapbox/maps/extension/compose/style/precipitations/RainStateApplier;", "Lp3/p1;", "centerThinningState", "Lp3/p1;", "centerThinningTransitionState", "colorState", "colorTransitionState", "colorUseThemeState", "densityState", "densityTransitionState", "directionState", "directionTransitionState", "distortionStrengthState", "distortionStrengthTransitionState", "dropletSizeState", "dropletSizeTransitionState", "intensityState", "intensityTransitionState", "opacityState", "opacityTransitionState", "vignetteState", "vignetteColorState", "vignetteColorTransitionState", "vignetteColorUseThemeState", "vignetteTransitionState", "<set-?>", "getCenterThinning", "()Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "setCenterThinning", "(Lcom/mapbox/maps/extension/compose/style/DoubleValue;)V", "getCenterThinning$annotations", "getCenterThinning$delegate", "(Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState;)Ljava/lang/Object;", "getCenterThinningTransition", "()Lcom/mapbox/maps/extension/compose/style/Transition;", "setCenterThinningTransition", "(Lcom/mapbox/maps/extension/compose/style/Transition;)V", "getCenterThinningTransition$annotations", "getCenterThinningTransition$delegate", "getColor", "()Lcom/mapbox/maps/extension/compose/style/ColorValue;", "setColor", "(Lcom/mapbox/maps/extension/compose/style/ColorValue;)V", "getColor$annotations", "getColor$delegate", "getColorTransition", "setColorTransition", "getColorTransition$annotations", "getColorTransition$delegate", "getColorUseTheme", "()Lcom/mapbox/maps/extension/compose/style/StringValue;", "setColorUseTheme", "(Lcom/mapbox/maps/extension/compose/style/StringValue;)V", "getColorUseTheme$annotations", "getColorUseTheme$delegate", "getDensity", "setDensity", "getDensity$annotations", "getDensity$delegate", "getDensityTransition", "setDensityTransition", "getDensityTransition$annotations", "getDensityTransition$delegate", "getDirection", "()Lcom/mapbox/maps/extension/compose/style/DoubleListValue;", "setDirection", "(Lcom/mapbox/maps/extension/compose/style/DoubleListValue;)V", "getDirection$annotations", "getDirection$delegate", "getDirectionTransition", "setDirectionTransition", "getDirectionTransition$annotations", "getDirectionTransition$delegate", "getDistortionStrength", "setDistortionStrength", "getDistortionStrength$annotations", "getDistortionStrength$delegate", "getDistortionStrengthTransition", "setDistortionStrengthTransition", "getDistortionStrengthTransition$annotations", "getDistortionStrengthTransition$delegate", "getDropletSize", "setDropletSize", "getDropletSize$annotations", "getDropletSize$delegate", "getDropletSizeTransition", "setDropletSizeTransition", "getDropletSizeTransition$annotations", "getDropletSizeTransition$delegate", "getIntensity", "setIntensity", "getIntensity$annotations", "getIntensity$delegate", "getIntensityTransition", "setIntensityTransition", "getIntensityTransition$annotations", "getIntensityTransition$delegate", "getOpacity", "setOpacity", "getOpacity$annotations", "getOpacity$delegate", "getOpacityTransition", "setOpacityTransition", "getOpacityTransition$annotations", "getOpacityTransition$delegate", "getVignette", "setVignette", "getVignette$annotations", "getVignette$delegate", "getVignetteColor", "setVignetteColor", "getVignetteColor$annotations", "getVignetteColor$delegate", "getVignetteColorTransition", "setVignetteColorTransition", "getVignetteColorTransition$annotations", "getVignetteColorTransition$delegate", "getVignetteColorUseTheme", "setVignetteColorUseTheme", "getVignetteColorUseTheme$annotations", "getVignetteColorUseTheme$delegate", "getVignetteTransition", "setVignetteTransition", "getVignetteTransition$annotations", "getVignetteTransition$delegate", "Companion", "Holder", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
public final class RainState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final RainState DISABLED;
    private static final k<RainState, Holder> Saver;
    private final RainStateApplier applier;
    private final p1<DoubleValue> centerThinningState;
    private final p1<Transition> centerThinningTransitionState;
    private final p1<ColorValue> colorState;
    private final p1<Transition> colorTransitionState;
    private final p1<StringValue> colorUseThemeState;
    private final p1<DoubleValue> densityState;
    private final p1<Transition> densityTransitionState;
    private final p1<DoubleListValue> directionState;
    private final p1<Transition> directionTransitionState;
    private final p1<DoubleValue> distortionStrengthState;
    private final p1<Transition> distortionStrengthTransitionState;
    private final p1<DoubleListValue> dropletSizeState;
    private final p1<Transition> dropletSizeTransitionState;
    private final p1<DoubleValue> intensityState;
    private final p1<Transition> intensityTransitionState;
    private final p1<DoubleValue> opacityState;
    private final p1<Transition> opacityTransitionState;
    private final p1<ColorValue> vignetteColorState;
    private final p1<Transition> vignetteColorTransitionState;
    private final p1<StringValue> vignetteColorUseThemeState;
    private final p1<DoubleValue> vignetteState;
    private final p1<Transition> vignetteTransitionState;

    static {
        RainState$Companion$Saver$1 rainState$Companion$Saver$1 = RainState$Companion$Saver$1.INSTANCE;
        RainState$Companion$Saver$2 rainState$Companion$Saver$2 = RainState$Companion$Saver$2.INSTANCE;
        l lVar = m.f57455a;
        Saver = new l(rainState$Companion$Saver$1, rainState$Companion$Saver$2);
        DISABLED = new RainState(false);
    }

    private RainState(RainStateApplier rainStateApplier, DoubleValue doubleValue, Transition transition, ColorValue colorValue, Transition transition2, StringValue stringValue, DoubleValue doubleValue2, Transition transition3, DoubleListValue doubleListValue, Transition transition4, DoubleValue doubleValue3, Transition transition5, DoubleListValue doubleListValue2, Transition transition6, DoubleValue doubleValue4, Transition transition7, DoubleValue doubleValue5, Transition transition8, DoubleValue doubleValue6, ColorValue colorValue2, Transition transition9, StringValue stringValue2, Transition transition10) {
        this.applier = rainStateApplier;
        this.centerThinningState = p0.n(doubleValue);
        this.centerThinningTransitionState = p0.n(transition);
        this.colorState = p0.n(colorValue);
        this.colorTransitionState = p0.n(transition2);
        this.colorUseThemeState = p0.n(stringValue);
        this.densityState = p0.n(doubleValue2);
        this.densityTransitionState = p0.n(transition3);
        this.directionState = p0.n(doubleListValue);
        this.directionTransitionState = p0.n(transition4);
        this.distortionStrengthState = p0.n(doubleValue3);
        this.distortionStrengthTransitionState = p0.n(transition5);
        this.dropletSizeState = p0.n(doubleListValue2);
        this.dropletSizeTransitionState = p0.n(transition6);
        this.intensityState = p0.n(doubleValue4);
        this.intensityTransitionState = p0.n(transition7);
        this.opacityState = p0.n(doubleValue5);
        this.opacityTransitionState = p0.n(transition8);
        this.vignetteState = p0.n(doubleValue6);
        this.vignetteColorState = p0.n(colorValue2);
        this.vignetteColorTransitionState = p0.n(transition9);
        this.vignetteColorUseThemeState = p0.n(stringValue2);
        this.vignetteTransitionState = p0.n(transition10);
    }

    @MapboxExperimental
    public static /* synthetic */ void getCenterThinning$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getCenterThinningTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getColor$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getColorTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getDensity$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getDensityTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getDirection$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getDirectionTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getDistortionStrength$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getDistortionStrengthTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getDropletSize$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getDropletSizeTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getIntensity$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getIntensityTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getOpacity$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getOpacityTransition$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Value> getProperties() {
        p pVar = getCenterThinning().isNotInitial() ? new p("center-thinning", getCenterThinning().getValue()) : null;
        p pVar2 = getCenterThinningTransition().isNotInitial() ? new p("center-thinning-transition", getCenterThinningTransition().getValue()) : null;
        p pVar3 = getColor().isNotInitial() ? new p(TtmlNode.ATTR_TTS_COLOR, getColor().getValue()) : null;
        p pVar4 = getColorTransition().isNotInitial() ? new p("color-transition", getColorTransition().getValue()) : null;
        p pVar5 = getColorUseTheme().isNotInitial() ? new p("color-use-theme", getColorUseTheme().getValue()) : null;
        p pVar6 = getDensity().isNotInitial() ? new p("density", getDensity().getValue()) : null;
        p pVar7 = getDensityTransition().isNotInitial() ? new p("density-transition", getDensityTransition().getValue()) : null;
        p pVar8 = getDirection().isNotInitial() ? new p("direction", getDirection().getValue()) : null;
        p pVar9 = getDirectionTransition().isNotInitial() ? new p("direction-transition", getDirectionTransition().getValue()) : null;
        p pVar10 = getDistortionStrength().isNotInitial() ? new p("distortion-strength", getDistortionStrength().getValue()) : null;
        p pVar11 = getDistortionStrengthTransition().isNotInitial() ? new p("distortion-strength-transition", getDistortionStrengthTransition().getValue()) : null;
        p pVar12 = getDropletSize().isNotInitial() ? new p("droplet-size", getDropletSize().getValue()) : null;
        p pVar13 = getDropletSizeTransition().isNotInitial() ? new p("droplet-size-transition", getDropletSizeTransition().getValue()) : null;
        p pVar14 = new p("intensity", getIntensity().getValue());
        if (!getIntensity().isNotInitial()) {
            pVar14 = null;
        }
        p pVar15 = pVar14;
        p pVar16 = new p("intensity-transition", getIntensityTransition().getValue());
        if (!getIntensityTransition().isNotInitial()) {
            pVar16 = null;
        }
        p pVar17 = pVar16;
        p pVar18 = new p("opacity", getOpacity().getValue());
        if (!getOpacity().isNotInitial()) {
            pVar18 = null;
        }
        p pVar19 = pVar18;
        p pVar20 = new p("opacity-transition", getOpacityTransition().getValue());
        if (!getOpacityTransition().isNotInitial()) {
            pVar20 = null;
        }
        p pVar21 = pVar20;
        p pVar22 = new p("vignette", getVignette().getValue());
        if (!getVignette().isNotInitial()) {
            pVar22 = null;
        }
        p pVar23 = pVar22;
        p pVar24 = new p("vignette-color", getVignetteColor().getValue());
        if (!getVignetteColor().isNotInitial()) {
            pVar24 = null;
        }
        p pVar25 = pVar24;
        p pVar26 = new p("vignette-color-transition", getVignetteColorTransition().getValue());
        if (!getVignetteColorTransition().isNotInitial()) {
            pVar26 = null;
        }
        p pVar27 = pVar26;
        p pVar28 = new p("vignette-color-use-theme", getVignetteColorUseTheme().getValue());
        if (!getVignetteColorUseTheme().isNotInitial()) {
            pVar28 = null;
        }
        return u0.l(u.C(new p[]{pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9, pVar10, pVar11, pVar12, pVar13, pVar15, pVar17, pVar19, pVar21, pVar23, pVar25, pVar27, pVar28, getVignetteTransition().isNotInitial() ? new p("vignette-transition", getVignetteTransition().getValue()) : null}));
    }

    @MapboxExperimental
    public static /* synthetic */ void getVignette$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getVignetteColor$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getVignetteColorTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getVignetteColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getVignetteTransition$annotations() {
    }

    public final void UpdateProperties$extension_compose_release(p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-414290590);
        if ((i14 & 14) == 0) {
            i15 = (o0VarE.B(this) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i15 & 11) == 2 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = n.f135158a;
            RainState$UpdateProperties$action$1 rainState$UpdateProperties$action$1 = new RainState$UpdateProperties$action$1(this.applier);
            PropertyTypesKt.ActionWhenNotInitial(rainState$UpdateProperties$action$1, this.centerThinningState, "center-thinning", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(rainState$UpdateProperties$action$1, this.centerThinningTransitionState, "center-thinning-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(rainState$UpdateProperties$action$1, this.colorState, TtmlNode.ATTR_TTS_COLOR, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(rainState$UpdateProperties$action$1, this.colorTransitionState, "color-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(rainState$UpdateProperties$action$1, this.colorUseThemeState, "color-use-theme", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(rainState$UpdateProperties$action$1, this.densityState, "density", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(rainState$UpdateProperties$action$1, this.densityTransitionState, "density-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(rainState$UpdateProperties$action$1, this.directionState, "direction", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(rainState$UpdateProperties$action$1, this.directionTransitionState, "direction-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(rainState$UpdateProperties$action$1, this.distortionStrengthState, "distortion-strength", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(rainState$UpdateProperties$action$1, this.distortionStrengthTransitionState, "distortion-strength-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(rainState$UpdateProperties$action$1, this.dropletSizeState, "droplet-size", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(rainState$UpdateProperties$action$1, this.dropletSizeTransitionState, "droplet-size-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(rainState$UpdateProperties$action$1, this.intensityState, "intensity", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(rainState$UpdateProperties$action$1, this.intensityTransitionState, "intensity-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(rainState$UpdateProperties$action$1, this.opacityState, "opacity", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(rainState$UpdateProperties$action$1, this.opacityTransitionState, "opacity-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(rainState$UpdateProperties$action$1, this.vignetteState, "vignette", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(rainState$UpdateProperties$action$1, this.vignetteColorState, "vignette-color", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(rainState$UpdateProperties$action$1, this.vignetteColorTransitionState, "vignette-color-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(rainState$UpdateProperties$action$1, this.vignetteColorUseThemeState, "vignette-color-use-theme", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(rainState$UpdateProperties$action$1, this.vignetteTransitionState, "vignette-transition", o0VarE, 384);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new RainState$UpdateProperties$1(this, i14);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!RainState.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        RainState rainState = (RainState) other;
        return s.g(this.applier, rainState.applier) && s.g(getCenterThinning(), rainState.getCenterThinning()) && s.g(getCenterThinningTransition(), rainState.getCenterThinningTransition()) && s.g(getColor(), rainState.getColor()) && s.g(getColorTransition(), rainState.getColorTransition()) && s.g(getColorUseTheme(), rainState.getColorUseTheme()) && s.g(getDensity(), rainState.getDensity()) && s.g(getDensityTransition(), rainState.getDensityTransition()) && s.g(getDirection(), rainState.getDirection()) && s.g(getDirectionTransition(), rainState.getDirectionTransition()) && s.g(getDistortionStrength(), rainState.getDistortionStrength()) && s.g(getDistortionStrengthTransition(), rainState.getDistortionStrengthTransition()) && s.g(getDropletSize(), rainState.getDropletSize()) && s.g(getDropletSizeTransition(), rainState.getDropletSizeTransition()) && s.g(getIntensity(), rainState.getIntensity()) && s.g(getIntensityTransition(), rainState.getIntensityTransition()) && s.g(getOpacity(), rainState.getOpacity()) && s.g(getOpacityTransition(), rainState.getOpacityTransition()) && s.g(getVignette(), rainState.getVignette()) && s.g(getVignetteColor(), rainState.getVignetteColor()) && s.g(getVignetteColorTransition(), rainState.getVignetteColorTransition()) && s.g(getVignetteColorUseTheme(), rainState.getVignetteColorUseTheme()) && s.g(getVignetteTransition(), rainState.getVignetteTransition());
    }

    /* JADX INFO: renamed from: getApplier$extension_compose_release, reason: from getter */
    public final RainStateApplier getApplier() {
        return this.applier;
    }

    public final DoubleValue getCenterThinning() {
        return this.centerThinningState.getF182175a();
    }

    public final Transition getCenterThinningTransition() {
        return this.centerThinningTransitionState.getF182175a();
    }

    public final ColorValue getColor() {
        return this.colorState.getF182175a();
    }

    public final Transition getColorTransition() {
        return this.colorTransitionState.getF182175a();
    }

    public final StringValue getColorUseTheme() {
        return this.colorUseThemeState.getF182175a();
    }

    public final DoubleValue getDensity() {
        return this.densityState.getF182175a();
    }

    public final Transition getDensityTransition() {
        return this.densityTransitionState.getF182175a();
    }

    public final DoubleListValue getDirection() {
        return this.directionState.getF182175a();
    }

    public final Transition getDirectionTransition() {
        return this.directionTransitionState.getF182175a();
    }

    public final DoubleValue getDistortionStrength() {
        return this.distortionStrengthState.getF182175a();
    }

    public final Transition getDistortionStrengthTransition() {
        return this.distortionStrengthTransitionState.getF182175a();
    }

    public final DoubleListValue getDropletSize() {
        return this.dropletSizeState.getF182175a();
    }

    public final Transition getDropletSizeTransition() {
        return this.dropletSizeTransitionState.getF182175a();
    }

    public final DoubleValue getIntensity() {
        return this.intensityState.getF182175a();
    }

    public final Transition getIntensityTransition() {
        return this.intensityTransitionState.getF182175a();
    }

    public final DoubleValue getOpacity() {
        return this.opacityState.getF182175a();
    }

    public final Transition getOpacityTransition() {
        return this.opacityTransitionState.getF182175a();
    }

    public final DoubleValue getVignette() {
        return this.vignetteState.getF182175a();
    }

    public final ColorValue getVignetteColor() {
        return this.vignetteColorState.getF182175a();
    }

    public final Transition getVignetteColorTransition() {
        return this.vignetteColorTransitionState.getF182175a();
    }

    public final StringValue getVignetteColorUseTheme() {
        return this.vignetteColorUseThemeState.getF182175a();
    }

    public final Transition getVignetteTransition() {
        return this.vignetteTransitionState.getF182175a();
    }

    public int hashCode() {
        return Objects.hash(this.applier, getCenterThinning(), getCenterThinningTransition(), getColor(), getColorTransition(), getColorUseTheme(), getDensity(), getDensityTransition(), getDirection(), getDirectionTransition(), getDistortionStrength(), getDistortionStrengthTransition(), getDropletSize(), getDropletSizeTransition(), getIntensity(), getIntensityTransition(), getOpacity(), getOpacityTransition(), getVignette(), getVignetteColor(), getVignetteColorTransition(), getVignetteColorUseTheme(), getVignetteTransition());
    }

    public final void setCenterThinning(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.centerThinningState.setValue(doubleValue);
    }

    public final void setCenterThinningTransition(Transition transition) {
        transition.getClass();
        this.centerThinningTransitionState.setValue(transition);
    }

    public final void setColor(ColorValue colorValue) {
        colorValue.getClass();
        this.colorState.setValue(colorValue);
    }

    public final void setColorTransition(Transition transition) {
        transition.getClass();
        this.colorTransitionState.setValue(transition);
    }

    public final void setColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.colorUseThemeState.setValue(stringValue);
    }

    public final void setDensity(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.densityState.setValue(doubleValue);
    }

    public final void setDensityTransition(Transition transition) {
        transition.getClass();
        this.densityTransitionState.setValue(transition);
    }

    public final void setDirection(DoubleListValue doubleListValue) {
        doubleListValue.getClass();
        this.directionState.setValue(doubleListValue);
    }

    public final void setDirectionTransition(Transition transition) {
        transition.getClass();
        this.directionTransitionState.setValue(transition);
    }

    public final void setDistortionStrength(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.distortionStrengthState.setValue(doubleValue);
    }

    public final void setDistortionStrengthTransition(Transition transition) {
        transition.getClass();
        this.distortionStrengthTransitionState.setValue(transition);
    }

    public final void setDropletSize(DoubleListValue doubleListValue) {
        doubleListValue.getClass();
        this.dropletSizeState.setValue(doubleListValue);
    }

    public final void setDropletSizeTransition(Transition transition) {
        transition.getClass();
        this.dropletSizeTransitionState.setValue(transition);
    }

    public final void setIntensity(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.intensityState.setValue(doubleValue);
    }

    public final void setIntensityTransition(Transition transition) {
        transition.getClass();
        this.intensityTransitionState.setValue(transition);
    }

    public final void setOpacity(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.opacityState.setValue(doubleValue);
    }

    public final void setOpacityTransition(Transition transition) {
        transition.getClass();
        this.opacityTransitionState.setValue(transition);
    }

    public final void setVignette(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.vignetteState.setValue(doubleValue);
    }

    public final void setVignetteColor(ColorValue colorValue) {
        colorValue.getClass();
        this.vignetteColorState.setValue(colorValue);
    }

    public final void setVignetteColorTransition(Transition transition) {
        transition.getClass();
        this.vignetteColorTransitionState.setValue(transition);
    }

    public final void setVignetteColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.vignetteColorUseThemeState.setValue(stringValue);
    }

    public final void setVignetteTransition(Transition transition) {
        transition.getClass();
        this.vignetteTransitionState.setValue(transition);
    }

    public String toString() {
        return "RainState(centerThinning=" + getCenterThinning() + ", centerThinningTransition=" + getCenterThinningTransition() + ", color=" + getColor() + ", colorTransition=" + getColorTransition() + ", colorUseTheme=" + getColorUseTheme() + ", density=" + getDensity() + ", densityTransition=" + getDensityTransition() + ", direction=" + getDirection() + ", directionTransition=" + getDirectionTransition() + ", distortionStrength=" + getDistortionStrength() + ", distortionStrengthTransition=" + getDistortionStrengthTransition() + ", dropletSize=" + getDropletSize() + ", dropletSizeTransition=" + getDropletSizeTransition() + ", intensity=" + getIntensity() + ", intensityTransition=" + getIntensityTransition() + ", opacity=" + getOpacity() + ", opacityTransition=" + getOpacityTransition() + ", vignette=" + getVignette() + ", vignetteColor=" + getVignetteColor() + ", vignetteColorTransition=" + getVignetteColorTransition() + ", vignetteColorUseTheme=" + getVignetteColorUseTheme() + ", vignetteTransition=" + getVignetteTransition() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState$Companion;", "", "<init>", "()V", "Ld4/k;", "Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState;", "Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState$Holder;", "Saver", "Ld4/k;", "getSaver", "()Ld4/k;", "DISABLED", "Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState;", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final k<RainState, Holder> getSaver() {
            return RainState.Saver;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0007HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState$Holder;", "Landroid/os/Parcelable;", "savedProperties", "", "", "Lcom/mapbox/bindgen/Value;", "enabled", "", "(Ljava/util/Map;Z)V", "getEnabled", "()Z", "getSavedProperties", "()Ljava/util/Map;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Holder implements Parcelable {
        private final boolean enabled;
        private final Map<String, Value> savedProperties;
        public static final Parcelable.Creator<Holder> CREATOR = new Creator();
        public static final int $stable = 8;

        /* JADX WARN: Multi-variable type inference failed */
        public Holder(Map<String, ? extends Value> map, boolean z14) {
            map.getClass();
            this.savedProperties = map;
            this.enabled = z14;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Holder copy$default(Holder holder, Map map, boolean z14, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                map = holder.savedProperties;
            }
            if ((i14 & 2) != 0) {
                z14 = holder.enabled;
            }
            return holder.copy(map, z14);
        }

        public final Map<String, Value> component1() {
            return this.savedProperties;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public final Holder copy(Map<String, ? extends Value> savedProperties, boolean enabled) {
            savedProperties.getClass();
            return new Holder(savedProperties, enabled);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Holder)) {
                return false;
            }
            Holder holder = (Holder) other;
            return s.g(this.savedProperties, holder.savedProperties) && this.enabled == holder.enabled;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final Map<String, Value> getSavedProperties() {
            return this.savedProperties;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            int iHashCode = this.savedProperties.hashCode() * 31;
            boolean z14 = this.enabled;
            ?? r14 = z14;
            if (z14) {
                r14 = 1;
            }
            return iHashCode + r14;
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder("Holder(savedProperties=");
            sb3.append(this.savedProperties);
            sb3.append(", enabled=");
            return am.j.t(sb3, this.enabled, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.getClass();
            Iterator itU = am.j.u(this.savedProperties, parcel);
            while (itU.hasNext()) {
                Map.Entry entry = (Map.Entry) itU.next();
                parcel.writeString((String) entry.getKey());
                ValueParceler.INSTANCE.write((Value) entry.getValue(), parcel, flags);
            }
            parcel.writeInt(this.enabled ? 1 : 0);
        }

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Holder> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Holder createFromParcel(Parcel parcel) {
                parcel.getClass();
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    linkedHashMap.put(parcel.readString(), ValueParceler.INSTANCE.m220create(parcel));
                }
                return new Holder(linkedHashMap, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Holder[] newArray(int i14) {
                return new Holder[i14];
            }
        }
    }

    public /* synthetic */ RainState(RainStateApplier rainStateApplier, DoubleValue doubleValue, Transition transition, ColorValue colorValue, Transition transition2, StringValue stringValue, DoubleValue doubleValue2, Transition transition3, DoubleListValue doubleListValue, Transition transition4, DoubleValue doubleValue3, Transition transition5, DoubleListValue doubleListValue2, Transition transition6, DoubleValue doubleValue4, Transition transition7, DoubleValue doubleValue5, Transition transition8, DoubleValue doubleValue6, ColorValue colorValue2, Transition transition9, StringValue stringValue2, Transition transition10, j jVar) {
        this(rainStateApplier, doubleValue, transition, colorValue, transition2, stringValue, doubleValue2, transition3, doubleListValue, transition4, doubleValue3, transition5, doubleListValue2, transition6, doubleValue4, transition7, doubleValue5, transition8, doubleValue6, colorValue2, transition9, stringValue2, transition10);
    }

    public RainState() {
        this(true);
    }

    private RainState(boolean z14) {
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        RainStateApplier rainStateApplier = new RainStateApplier(k0Var, null, z14, 2, null);
        DoubleValue doubleValue = DoubleValue.INITIAL;
        Transition transition = Transition.INITIAL;
        ColorValue colorValue = ColorValue.INITIAL;
        StringValue stringValue = StringValue.INITIAL;
        DoubleListValue doubleListValue = DoubleListValue.INITIAL;
        this(rainStateApplier, doubleValue, transition, colorValue, transition, stringValue, doubleValue, transition, doubleListValue, transition, doubleValue, transition, doubleListValue, transition, doubleValue, transition, doubleValue, transition, doubleValue, colorValue, transition, stringValue, transition);
    }
}
