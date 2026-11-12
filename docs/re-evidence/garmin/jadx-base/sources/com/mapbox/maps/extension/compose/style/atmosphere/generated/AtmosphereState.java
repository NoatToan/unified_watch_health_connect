package com.mapbox.maps.extension.compose.style.atmosphere.generated;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.compose.style.ColorValue;
import com.mapbox.maps.extension.compose.style.DoubleRangeValue;
import com.mapbox.maps.extension.compose.style.DoubleValue;
import com.mapbox.maps.extension.compose.style.PropertyTypesKt;
import com.mapbox.maps.extension.compose.style.StringValue;
import com.mapbox.maps.extension.compose.style.Transition;
import com.mapbox.maps.extension.compose.style.atmosphere.AtmosphereStateApplier;
import com.mapbox.maps.extension.compose.style.internal.ValueParceler;
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
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bW\b\u0007\u0018\u0000 \u0087\u00012\u00020\u0001:\u0004\u0087\u0001\u0088\u0001B\u0099\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bB\t\b\u0016¢\u0006\u0004\b\u001a\u0010\u001cJ\u000f\u0010 \u001a\u00020\u001dH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u001b\u0010-\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020,0+H\u0002¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0004028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u0006028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\b028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u0004028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00104R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0006028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\b028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00104R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\r028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00104R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0006028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00104R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0010028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00104R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0006028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00104R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0004028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00104R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u0006028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00104R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\b028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00104R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\r028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00104R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u0006028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00104R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u0010028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00104R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u0006028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u00104R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I*\u0004\bJ\u0010KR+\u0010\u0007\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bL\u0010M\"\u0004\bN\u0010O*\u0004\bP\u0010KR1\u0010\t\u001a\u00020\b2\u0006\u0010E\u001a\u00020\b8F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bU\u0010\u001c\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T*\u0004\bV\u0010KR+\u0010\n\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bW\u0010G\"\u0004\bX\u0010I*\u0004\bY\u0010KR+\u0010\u000b\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bZ\u0010M\"\u0004\b[\u0010O*\u0004\b\\\u0010KR1\u0010\f\u001a\u00020\b2\u0006\u0010E\u001a\u00020\b8F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\b_\u0010\u001c\u001a\u0004\b]\u0010R\"\u0004\b^\u0010T*\u0004\b`\u0010KR+\u0010\u000e\u001a\u00020\r2\u0006\u0010E\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\ba\u0010b\"\u0004\bc\u0010d*\u0004\be\u0010KR+\u0010\u000f\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bf\u0010M\"\u0004\bg\u0010O*\u0004\bh\u0010KR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010E\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bi\u0010j\"\u0004\bk\u0010l*\u0004\bm\u0010KR+\u0010\u0012\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bn\u0010M\"\u0004\bo\u0010O*\u0004\bp\u0010KR+\u0010\u0013\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bq\u0010G\"\u0004\br\u0010I*\u0004\bs\u0010KR+\u0010\u0014\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bt\u0010M\"\u0004\bu\u0010O*\u0004\bv\u0010KR1\u0010\u0015\u001a\u00020\b2\u0006\u0010E\u001a\u00020\b8F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\by\u0010\u001c\u001a\u0004\bw\u0010R\"\u0004\bx\u0010T*\u0004\bz\u0010KR+\u0010\u0016\u001a\u00020\r2\u0006\u0010E\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b{\u0010b\"\u0004\b|\u0010d*\u0004\b}\u0010KR,\u0010\u0017\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0013\u001a\u0004\b~\u0010M\"\u0004\b\u007f\u0010O*\u0005\b\u0080\u0001\u0010KR.\u0010\u0018\u001a\u00020\u00102\u0006\u0010E\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0081\u0001\u0010j\"\u0005\b\u0082\u0001\u0010l*\u0005\b\u0083\u0001\u0010KR.\u0010\u0019\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0084\u0001\u0010M\"\u0005\b\u0085\u0001\u0010O*\u0005\b\u0086\u0001\u0010K¨\u0006\u0089\u0001"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/atmosphere/generated/AtmosphereState;", "", "Lcom/mapbox/maps/extension/compose/style/atmosphere/AtmosphereStateApplier;", "applier", "Lcom/mapbox/maps/extension/compose/style/ColorValue;", TtmlNode.ATTR_TTS_COLOR, "Lcom/mapbox/maps/extension/compose/style/Transition;", "colorTransition", "Lcom/mapbox/maps/extension/compose/style/StringValue;", "colorUseTheme", "highColor", "highColorTransition", "highColorUseTheme", "Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "horizonBlend", "horizonBlendTransition", "Lcom/mapbox/maps/extension/compose/style/DoubleRangeValue;", "range", "rangeTransition", "spaceColor", "spaceColorTransition", "spaceColorUseTheme", "starIntensity", "starIntensityTransition", "verticalRange", "verticalRangeTransition", "<init>", "(Lcom/mapbox/maps/extension/compose/style/atmosphere/AtmosphereStateApplier;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleRangeValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleRangeValue;Lcom/mapbox/maps/extension/compose/style/Transition;)V", "()V", "", "UpdateProperties$extension_compose_release", "(Lp3/m;I)V", "UpdateProperties", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "Lcom/mapbox/bindgen/Value;", "getProperties", "()Ljava/util/Map;", "Lcom/mapbox/maps/extension/compose/style/atmosphere/AtmosphereStateApplier;", "getApplier$extension_compose_release", "()Lcom/mapbox/maps/extension/compose/style/atmosphere/AtmosphereStateApplier;", "Lp3/p1;", "colorState", "Lp3/p1;", "colorTransitionState", "colorUseThemeState", "highColorState", "highColorTransitionState", "highColorUseThemeState", "horizonBlendState", "horizonBlendTransitionState", "rangeState", "rangeTransitionState", "spaceColorState", "spaceColorTransitionState", "spaceColorUseThemeState", "starIntensityState", "starIntensityTransitionState", "verticalRangeState", "verticalRangeTransitionState", "<set-?>", "getColor", "()Lcom/mapbox/maps/extension/compose/style/ColorValue;", "setColor", "(Lcom/mapbox/maps/extension/compose/style/ColorValue;)V", "getColor$delegate", "(Lcom/mapbox/maps/extension/compose/style/atmosphere/generated/AtmosphereState;)Ljava/lang/Object;", "getColorTransition", "()Lcom/mapbox/maps/extension/compose/style/Transition;", "setColorTransition", "(Lcom/mapbox/maps/extension/compose/style/Transition;)V", "getColorTransition$delegate", "getColorUseTheme", "()Lcom/mapbox/maps/extension/compose/style/StringValue;", "setColorUseTheme", "(Lcom/mapbox/maps/extension/compose/style/StringValue;)V", "getColorUseTheme$annotations", "getColorUseTheme$delegate", "getHighColor", "setHighColor", "getHighColor$delegate", "getHighColorTransition", "setHighColorTransition", "getHighColorTransition$delegate", "getHighColorUseTheme", "setHighColorUseTheme", "getHighColorUseTheme$annotations", "getHighColorUseTheme$delegate", "getHorizonBlend", "()Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "setHorizonBlend", "(Lcom/mapbox/maps/extension/compose/style/DoubleValue;)V", "getHorizonBlend$delegate", "getHorizonBlendTransition", "setHorizonBlendTransition", "getHorizonBlendTransition$delegate", "getRange", "()Lcom/mapbox/maps/extension/compose/style/DoubleRangeValue;", "setRange", "(Lcom/mapbox/maps/extension/compose/style/DoubleRangeValue;)V", "getRange$delegate", "getRangeTransition", "setRangeTransition", "getRangeTransition$delegate", "getSpaceColor", "setSpaceColor", "getSpaceColor$delegate", "getSpaceColorTransition", "setSpaceColorTransition", "getSpaceColorTransition$delegate", "getSpaceColorUseTheme", "setSpaceColorUseTheme", "getSpaceColorUseTheme$annotations", "getSpaceColorUseTheme$delegate", "getStarIntensity", "setStarIntensity", "getStarIntensity$delegate", "getStarIntensityTransition", "setStarIntensityTransition", "getStarIntensityTransition$delegate", "getVerticalRange", "setVerticalRange", "getVerticalRange$delegate", "getVerticalRangeTransition", "setVerticalRangeTransition", "getVerticalRangeTransition$delegate", "Companion", "Holder", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AtmosphereState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final k<AtmosphereState, Holder> Saver;
    private final AtmosphereStateApplier applier;
    private final p1<ColorValue> colorState;
    private final p1<Transition> colorTransitionState;
    private final p1<StringValue> colorUseThemeState;
    private final p1<ColorValue> highColorState;
    private final p1<Transition> highColorTransitionState;
    private final p1<StringValue> highColorUseThemeState;
    private final p1<DoubleValue> horizonBlendState;
    private final p1<Transition> horizonBlendTransitionState;
    private final p1<DoubleRangeValue> rangeState;
    private final p1<Transition> rangeTransitionState;
    private final p1<ColorValue> spaceColorState;
    private final p1<Transition> spaceColorTransitionState;
    private final p1<StringValue> spaceColorUseThemeState;
    private final p1<DoubleValue> starIntensityState;
    private final p1<Transition> starIntensityTransitionState;
    private final p1<DoubleRangeValue> verticalRangeState;
    private final p1<Transition> verticalRangeTransitionState;

    static {
        AtmosphereState$Companion$Saver$1 atmosphereState$Companion$Saver$1 = AtmosphereState$Companion$Saver$1.INSTANCE;
        AtmosphereState$Companion$Saver$2 atmosphereState$Companion$Saver$2 = AtmosphereState$Companion$Saver$2.INSTANCE;
        l lVar = m.f57455a;
        Saver = new l(atmosphereState$Companion$Saver$1, atmosphereState$Companion$Saver$2);
    }

    private AtmosphereState(AtmosphereStateApplier atmosphereStateApplier, ColorValue colorValue, Transition transition, StringValue stringValue, ColorValue colorValue2, Transition transition2, StringValue stringValue2, DoubleValue doubleValue, Transition transition3, DoubleRangeValue doubleRangeValue, Transition transition4, ColorValue colorValue3, Transition transition5, StringValue stringValue3, DoubleValue doubleValue2, Transition transition6, DoubleRangeValue doubleRangeValue2, Transition transition7) {
        this.applier = atmosphereStateApplier;
        this.colorState = p0.n(colorValue);
        this.colorTransitionState = p0.n(transition);
        this.colorUseThemeState = p0.n(stringValue);
        this.highColorState = p0.n(colorValue2);
        this.highColorTransitionState = p0.n(transition2);
        this.highColorUseThemeState = p0.n(stringValue2);
        this.horizonBlendState = p0.n(doubleValue);
        this.horizonBlendTransitionState = p0.n(transition3);
        this.rangeState = p0.n(doubleRangeValue);
        this.rangeTransitionState = p0.n(transition4);
        this.spaceColorState = p0.n(colorValue3);
        this.spaceColorTransitionState = p0.n(transition5);
        this.spaceColorUseThemeState = p0.n(stringValue3);
        this.starIntensityState = p0.n(doubleValue2);
        this.starIntensityTransitionState = p0.n(transition6);
        this.verticalRangeState = p0.n(doubleRangeValue2);
        this.verticalRangeTransitionState = p0.n(transition7);
    }

    @MapboxExperimental
    public static /* synthetic */ void getColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getHighColorUseTheme$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Value> getProperties() {
        p pVar = getColor().isNotInitial() ? new p(TtmlNode.ATTR_TTS_COLOR, getColor().getValue()) : null;
        p pVar2 = getColorTransition().isNotInitial() ? new p("color-transition", getColorTransition().getValue()) : null;
        p pVar3 = getColorUseTheme().isNotInitial() ? new p("color-use-theme", getColorUseTheme().getValue()) : null;
        p pVar4 = getHighColor().isNotInitial() ? new p("high-color", getHighColor().getValue()) : null;
        p pVar5 = getHighColorTransition().isNotInitial() ? new p("high-color-transition", getHighColorTransition().getValue()) : null;
        p pVar6 = getHighColorUseTheme().isNotInitial() ? new p("high-color-use-theme", getHighColorUseTheme().getValue()) : null;
        p pVar7 = getHorizonBlend().isNotInitial() ? new p("horizon-blend", getHorizonBlend().getValue()) : null;
        p pVar8 = getHorizonBlendTransition().isNotInitial() ? new p("horizon-blend-transition", getHorizonBlendTransition().getValue()) : null;
        p pVar9 = getRange().isNotInitial() ? new p("range", getRange().getValue()) : null;
        p pVar10 = getRangeTransition().isNotInitial() ? new p("range-transition", getRangeTransition().getValue()) : null;
        p pVar11 = getSpaceColor().isNotInitial() ? new p("space-color", getSpaceColor().getValue()) : null;
        p pVar12 = getSpaceColorTransition().isNotInitial() ? new p("space-color-transition", getSpaceColorTransition().getValue()) : null;
        p pVar13 = getSpaceColorUseTheme().isNotInitial() ? new p("space-color-use-theme", getSpaceColorUseTheme().getValue()) : null;
        p pVar14 = new p("star-intensity", getStarIntensity().getValue());
        if (!getStarIntensity().isNotInitial()) {
            pVar14 = null;
        }
        p pVar15 = pVar14;
        p pVar16 = new p("star-intensity-transition", getStarIntensityTransition().getValue());
        if (!getStarIntensityTransition().isNotInitial()) {
            pVar16 = null;
        }
        p pVar17 = pVar16;
        p pVar18 = new p("vertical-range", getVerticalRange().getValue());
        if (!getVerticalRange().isNotInitial()) {
            pVar18 = null;
        }
        return u0.l(u.C(new p[]{pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9, pVar10, pVar11, pVar12, pVar13, pVar15, pVar17, pVar18, getVerticalRangeTransition().isNotInitial() ? new p("vertical-range-transition", getVerticalRangeTransition().getValue()) : null}));
    }

    @MapboxExperimental
    public static /* synthetic */ void getSpaceColorUseTheme$annotations() {
    }

    public final void UpdateProperties$extension_compose_release(p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1367026192);
        if ((i14 & 14) == 0) {
            i15 = (o0VarE.B(this) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i15 & 11) == 2 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = n.f135158a;
            AtmosphereState$UpdateProperties$action$1 atmosphereState$UpdateProperties$action$1 = new AtmosphereState$UpdateProperties$action$1(this.applier);
            PropertyTypesKt.ActionWhenNotInitial(atmosphereState$UpdateProperties$action$1, this.colorState, TtmlNode.ATTR_TTS_COLOR, o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(atmosphereState$UpdateProperties$action$1, this.colorTransitionState, "color-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(atmosphereState$UpdateProperties$action$1, this.colorUseThemeState, "color-use-theme", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(atmosphereState$UpdateProperties$action$1, this.highColorState, "high-color", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(atmosphereState$UpdateProperties$action$1, this.highColorTransitionState, "high-color-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(atmosphereState$UpdateProperties$action$1, this.highColorUseThemeState, "high-color-use-theme", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(atmosphereState$UpdateProperties$action$1, this.horizonBlendState, "horizon-blend", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(atmosphereState$UpdateProperties$action$1, this.horizonBlendTransitionState, "horizon-blend-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(atmosphereState$UpdateProperties$action$1, this.rangeState, "range", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(atmosphereState$UpdateProperties$action$1, this.rangeTransitionState, "range-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(atmosphereState$UpdateProperties$action$1, this.spaceColorState, "space-color", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(atmosphereState$UpdateProperties$action$1, this.spaceColorTransitionState, "space-color-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(atmosphereState$UpdateProperties$action$1, this.spaceColorUseThemeState, "space-color-use-theme", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(atmosphereState$UpdateProperties$action$1, this.starIntensityState, "star-intensity", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(atmosphereState$UpdateProperties$action$1, this.starIntensityTransitionState, "star-intensity-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(atmosphereState$UpdateProperties$action$1, this.verticalRangeState, "vertical-range", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(atmosphereState$UpdateProperties$action$1, this.verticalRangeTransitionState, "vertical-range-transition", o0VarE, 384);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AtmosphereState$UpdateProperties$1(this, i14);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!AtmosphereState.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        AtmosphereState atmosphereState = (AtmosphereState) other;
        return s.g(this.applier, atmosphereState.applier) && s.g(getColor(), atmosphereState.getColor()) && s.g(getColorTransition(), atmosphereState.getColorTransition()) && s.g(getColorUseTheme(), atmosphereState.getColorUseTheme()) && s.g(getHighColor(), atmosphereState.getHighColor()) && s.g(getHighColorTransition(), atmosphereState.getHighColorTransition()) && s.g(getHighColorUseTheme(), atmosphereState.getHighColorUseTheme()) && s.g(getHorizonBlend(), atmosphereState.getHorizonBlend()) && s.g(getHorizonBlendTransition(), atmosphereState.getHorizonBlendTransition()) && s.g(getRange(), atmosphereState.getRange()) && s.g(getRangeTransition(), atmosphereState.getRangeTransition()) && s.g(getSpaceColor(), atmosphereState.getSpaceColor()) && s.g(getSpaceColorTransition(), atmosphereState.getSpaceColorTransition()) && s.g(getSpaceColorUseTheme(), atmosphereState.getSpaceColorUseTheme()) && s.g(getStarIntensity(), atmosphereState.getStarIntensity()) && s.g(getStarIntensityTransition(), atmosphereState.getStarIntensityTransition()) && s.g(getVerticalRange(), atmosphereState.getVerticalRange()) && s.g(getVerticalRangeTransition(), atmosphereState.getVerticalRangeTransition());
    }

    /* JADX INFO: renamed from: getApplier$extension_compose_release, reason: from getter */
    public final AtmosphereStateApplier getApplier() {
        return this.applier;
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

    public final ColorValue getHighColor() {
        return this.highColorState.getF182175a();
    }

    public final Transition getHighColorTransition() {
        return this.highColorTransitionState.getF182175a();
    }

    public final StringValue getHighColorUseTheme() {
        return this.highColorUseThemeState.getF182175a();
    }

    public final DoubleValue getHorizonBlend() {
        return this.horizonBlendState.getF182175a();
    }

    public final Transition getHorizonBlendTransition() {
        return this.horizonBlendTransitionState.getF182175a();
    }

    public final DoubleRangeValue getRange() {
        return this.rangeState.getF182175a();
    }

    public final Transition getRangeTransition() {
        return this.rangeTransitionState.getF182175a();
    }

    public final ColorValue getSpaceColor() {
        return this.spaceColorState.getF182175a();
    }

    public final Transition getSpaceColorTransition() {
        return this.spaceColorTransitionState.getF182175a();
    }

    public final StringValue getSpaceColorUseTheme() {
        return this.spaceColorUseThemeState.getF182175a();
    }

    public final DoubleValue getStarIntensity() {
        return this.starIntensityState.getF182175a();
    }

    public final Transition getStarIntensityTransition() {
        return this.starIntensityTransitionState.getF182175a();
    }

    public final DoubleRangeValue getVerticalRange() {
        return this.verticalRangeState.getF182175a();
    }

    public final Transition getVerticalRangeTransition() {
        return this.verticalRangeTransitionState.getF182175a();
    }

    public int hashCode() {
        return Objects.hash(this.applier, getColor(), getColorTransition(), getColorUseTheme(), getHighColor(), getHighColorTransition(), getHighColorUseTheme(), getHorizonBlend(), getHorizonBlendTransition(), getRange(), getRangeTransition(), getSpaceColor(), getSpaceColorTransition(), getSpaceColorUseTheme(), getStarIntensity(), getStarIntensityTransition(), getVerticalRange(), getVerticalRangeTransition());
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

    public final void setHighColor(ColorValue colorValue) {
        colorValue.getClass();
        this.highColorState.setValue(colorValue);
    }

    public final void setHighColorTransition(Transition transition) {
        transition.getClass();
        this.highColorTransitionState.setValue(transition);
    }

    public final void setHighColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.highColorUseThemeState.setValue(stringValue);
    }

    public final void setHorizonBlend(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.horizonBlendState.setValue(doubleValue);
    }

    public final void setHorizonBlendTransition(Transition transition) {
        transition.getClass();
        this.horizonBlendTransitionState.setValue(transition);
    }

    public final void setRange(DoubleRangeValue doubleRangeValue) {
        doubleRangeValue.getClass();
        this.rangeState.setValue(doubleRangeValue);
    }

    public final void setRangeTransition(Transition transition) {
        transition.getClass();
        this.rangeTransitionState.setValue(transition);
    }

    public final void setSpaceColor(ColorValue colorValue) {
        colorValue.getClass();
        this.spaceColorState.setValue(colorValue);
    }

    public final void setSpaceColorTransition(Transition transition) {
        transition.getClass();
        this.spaceColorTransitionState.setValue(transition);
    }

    public final void setSpaceColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.spaceColorUseThemeState.setValue(stringValue);
    }

    public final void setStarIntensity(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.starIntensityState.setValue(doubleValue);
    }

    public final void setStarIntensityTransition(Transition transition) {
        transition.getClass();
        this.starIntensityTransitionState.setValue(transition);
    }

    public final void setVerticalRange(DoubleRangeValue doubleRangeValue) {
        doubleRangeValue.getClass();
        this.verticalRangeState.setValue(doubleRangeValue);
    }

    public final void setVerticalRangeTransition(Transition transition) {
        transition.getClass();
        this.verticalRangeTransitionState.setValue(transition);
    }

    public String toString() {
        return "AtmosphereState(color=" + getColor() + ", colorTransition=" + getColorTransition() + ", colorUseTheme=" + getColorUseTheme() + ", highColor=" + getHighColor() + ", highColorTransition=" + getHighColorTransition() + ", highColorUseTheme=" + getHighColorUseTheme() + ", horizonBlend=" + getHorizonBlend() + ", horizonBlendTransition=" + getHorizonBlendTransition() + ", range=" + getRange() + ", rangeTransition=" + getRangeTransition() + ", spaceColor=" + getSpaceColor() + ", spaceColorTransition=" + getSpaceColorTransition() + ", spaceColorUseTheme=" + getSpaceColorUseTheme() + ", starIntensity=" + getStarIntensity() + ", starIntensityTransition=" + getStarIntensityTransition() + ", verticalRange=" + getVerticalRange() + ", verticalRangeTransition=" + getVerticalRangeTransition() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/atmosphere/generated/AtmosphereState$Companion;", "", "<init>", "()V", "Ld4/k;", "Lcom/mapbox/maps/extension/compose/style/atmosphere/generated/AtmosphereState;", "Lcom/mapbox/maps/extension/compose/style/atmosphere/generated/AtmosphereState$Holder;", "Saver", "Ld4/k;", "getSaver", "()Ld4/k;", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final k<AtmosphereState, Holder> getSaver() {
            return AtmosphereState.Saver;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/atmosphere/generated/AtmosphereState$Holder;", "Landroid/os/Parcelable;", "savedProperties", "", "", "Lcom/mapbox/bindgen/Value;", "(Ljava/util/Map;)V", "getSavedProperties", "()Ljava/util/Map;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Holder implements Parcelable {
        private final Map<String, Value> savedProperties;
        public static final Parcelable.Creator<Holder> CREATOR = new Creator();
        public static final int $stable = 8;

        /* JADX WARN: Multi-variable type inference failed */
        public Holder(Map<String, ? extends Value> map) {
            map.getClass();
            this.savedProperties = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Holder copy$default(Holder holder, Map map, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                map = holder.savedProperties;
            }
            return holder.copy(map);
        }

        public final Map<String, Value> component1() {
            return this.savedProperties;
        }

        public final Holder copy(Map<String, ? extends Value> savedProperties) {
            savedProperties.getClass();
            return new Holder(savedProperties);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Holder) && s.g(this.savedProperties, ((Holder) other).savedProperties);
        }

        public final Map<String, Value> getSavedProperties() {
            return this.savedProperties;
        }

        public int hashCode() {
            return this.savedProperties.hashCode();
        }

        public String toString() {
            return "Holder(savedProperties=" + this.savedProperties + CoreConstants.RIGHT_PARENTHESIS_CHAR;
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
                return new Holder(linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Holder[] newArray(int i14) {
                return new Holder[i14];
            }
        }
    }

    public /* synthetic */ AtmosphereState(AtmosphereStateApplier atmosphereStateApplier, ColorValue colorValue, Transition transition, StringValue stringValue, ColorValue colorValue2, Transition transition2, StringValue stringValue2, DoubleValue doubleValue, Transition transition3, DoubleRangeValue doubleRangeValue, Transition transition4, ColorValue colorValue3, Transition transition5, StringValue stringValue3, DoubleValue doubleValue2, Transition transition6, DoubleRangeValue doubleRangeValue2, Transition transition7, j jVar) {
        this(atmosphereStateApplier, colorValue, transition, stringValue, colorValue2, transition2, stringValue2, doubleValue, transition3, doubleRangeValue, transition4, colorValue3, transition5, stringValue3, doubleValue2, transition6, doubleRangeValue2, transition7);
    }

    public AtmosphereState() {
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        AtmosphereStateApplier atmosphereStateApplier = new AtmosphereStateApplier(k0Var, null, 2, null);
        ColorValue colorValue = ColorValue.INITIAL;
        Transition transition = Transition.INITIAL;
        StringValue stringValue = StringValue.INITIAL;
        DoubleValue doubleValue = DoubleValue.INITIAL;
        DoubleRangeValue doubleRangeValue = DoubleRangeValue.INITIAL;
        this(atmosphereStateApplier, colorValue, transition, stringValue, colorValue, transition, stringValue, doubleValue, transition, doubleRangeValue, transition, colorValue, transition, stringValue, doubleValue, transition, doubleRangeValue, transition);
    }
}
