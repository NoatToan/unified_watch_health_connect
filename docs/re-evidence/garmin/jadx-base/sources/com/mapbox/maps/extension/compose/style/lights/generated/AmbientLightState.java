package com.mapbox.maps.extension.compose.style.lights.generated;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.compose.style.ColorValue;
import com.mapbox.maps.extension.compose.style.DoubleValue;
import com.mapbox.maps.extension.compose.style.HoldsValue;
import com.mapbox.maps.extension.compose.style.IdGenerator;
import com.mapbox.maps.extension.compose.style.StringValue;
import com.mapbox.maps.extension.compose.style.Transition;
import com.mapbox.maps.extension.compose.style.internal.ValueParceler;
import com.mapbox.maps.p;
import d4.k;
import d4.l;
import d4.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p13.u0;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import sn.a;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b/\b\u0007\u0018\u0000 T2\u00020\u0001:\u0002TUBC\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eB\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000fJ+\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011`\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J+\u0010*\u001a\u00020\u0018*\u00020%2\u000e\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020'0&2\u0006\u0010)\u001a\u00020\u0002H\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010$R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\b0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\n0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010/R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010/R+\u0010;\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b5\u00106\"\u0004\b7\u00108*\u0004\b9\u0010:R+\u0010A\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?*\u0004\b@\u0010:R1\u0010I\u001a\u00020\b2\u0006\u00104\u001a\u00020\b8F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bF\u0010G\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E*\u0004\bH\u0010:R+\u0010O\u001a\u00020\n2\u0006\u00104\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M*\u0004\bN\u0010:R+\u0010S\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bP\u0010=\"\u0004\bQ\u0010?*\u0004\bR\u0010:¨\u0006V"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/lights/generated/AmbientLightState;", "", "", TtmlNode.ATTR_ID, "Lcom/mapbox/maps/extension/compose/style/ColorValue;", "initialColor", "Lcom/mapbox/maps/extension/compose/style/Transition;", "initialColorTransition", "Lcom/mapbox/maps/extension/compose/style/StringValue;", "initialColorUseTheme", "Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "initialIntensity", "initialIntensityTransition", "<init>", "(Ljava/lang/String;Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;)V", "(Ljava/lang/String;)V", "Ljava/util/HashMap;", "Lcom/mapbox/bindgen/Value;", "Lkotlin/collections/HashMap;", "getProperties$extension_compose_release", "()Ljava/util/HashMap;", "getProperties", "Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "", "UpdateProperties$extension_compose_release", "(Lcom/mapbox/maps/MapboxMap;Lp3/m;I)V", "UpdateProperties", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "Lcom/mapbox/maps/MapboxStyleManager;", "Lp3/p1;", "Lcom/mapbox/maps/extension/compose/style/HoldsValue;", RemoteConfigConstants.ResponseFieldKey.STATE, "name", "UpdateLightProperty", "(Lcom/mapbox/maps/MapboxStyleManager;Lp3/p1;Ljava/lang/String;Lp3/m;I)V", "Ljava/lang/String;", "getId", "colorState", "Lp3/p1;", "colorTransitionState", "colorUseThemeState", "intensityState", "intensityTransitionState", "<set-?>", "getColor", "()Lcom/mapbox/maps/extension/compose/style/ColorValue;", "setColor", "(Lcom/mapbox/maps/extension/compose/style/ColorValue;)V", "getColor$delegate", "(Lcom/mapbox/maps/extension/compose/style/lights/generated/AmbientLightState;)Ljava/lang/Object;", TtmlNode.ATTR_TTS_COLOR, "getColorTransition", "()Lcom/mapbox/maps/extension/compose/style/Transition;", "setColorTransition", "(Lcom/mapbox/maps/extension/compose/style/Transition;)V", "getColorTransition$delegate", "colorTransition", "getColorUseTheme", "()Lcom/mapbox/maps/extension/compose/style/StringValue;", "setColorUseTheme", "(Lcom/mapbox/maps/extension/compose/style/StringValue;)V", "getColorUseTheme$annotations", "()V", "getColorUseTheme$delegate", "colorUseTheme", "getIntensity", "()Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "setIntensity", "(Lcom/mapbox/maps/extension/compose/style/DoubleValue;)V", "getIntensity$delegate", "intensity", "getIntensityTransition", "setIntensityTransition", "getIntensityTransition$delegate", "intensityTransition", "Companion", "Holder", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AmbientLightState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final k<AmbientLightState, Holder> Saver;
    private static final String TAG = "AmbientLightState";
    private final p1<ColorValue> colorState;
    private final p1<Transition> colorTransitionState;
    private final p1<StringValue> colorUseThemeState;
    private final String id;
    private final p1<DoubleValue> intensityState;
    private final p1<Transition> intensityTransitionState;

    static {
        AmbientLightState$Companion$Saver$1 ambientLightState$Companion$Saver$1 = AmbientLightState$Companion$Saver$1.INSTANCE;
        AmbientLightState$Companion$Saver$2 ambientLightState$Companion$Saver$2 = AmbientLightState$Companion$Saver$2.INSTANCE;
        l lVar = m.f57455a;
        Saver = new l(ambientLightState$Companion$Saver$1, ambientLightState$Companion$Saver$2);
    }

    public AmbientLightState(String str, ColorValue colorValue, Transition transition, StringValue stringValue, DoubleValue doubleValue, Transition transition2) {
        str.getClass();
        colorValue.getClass();
        transition.getClass();
        stringValue.getClass();
        doubleValue.getClass();
        transition2.getClass();
        this.id = str;
        this.colorState = p0.n(colorValue);
        this.colorTransitionState = p0.n(transition);
        this.colorUseThemeState = p0.n(stringValue);
        this.intensityState = p0.n(doubleValue);
        this.intensityTransitionState = p0.n(transition2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLightProperty(MapboxStyleManager mapboxStyleManager, p1<? extends HoldsValue> p1Var, String str, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(362722236);
        x1 x1Var = n.f135158a;
        HoldsValue value = p1Var.getF182175a();
        if (value.isNotInitial()) {
            StringBuilder sb3 = new StringBuilder("update Ambient light property: ");
            a.t(sb3, this.id, ", ", str, ", ");
            sb3.append(value);
            MapboxLogger.logD(TAG, sb3.toString());
            mapboxStyleManager.setStyleLightProperty(this.id, str, value.getValue()).onError(new p(4));
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass2(mapboxStyleManager, p1Var, str, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UpdateLightProperty$lambda$0(String str) {
        str.getClass();
        MapboxLogger.logE(TAG, str);
    }

    @MapboxExperimental
    public static /* synthetic */ void getColorUseTheme$annotations() {
    }

    public final void UpdateProperties$extension_compose_release(MapboxMap mapboxMap, p3.m mVar, int i14) {
        mapboxMap.getClass();
        o0 o0VarE = mVar.E(-1958607468);
        x1 x1Var = n.f135158a;
        int i15 = ((i14 << 6) & 7168) | 392;
        UpdateLightProperty(mapboxMap, this.colorState, TtmlNode.ATTR_TTS_COLOR, o0VarE, i15);
        UpdateLightProperty(mapboxMap, this.colorTransitionState, "color-transition", o0VarE, i15);
        UpdateLightProperty(mapboxMap, this.colorUseThemeState, "color-use-theme", o0VarE, i15);
        UpdateLightProperty(mapboxMap, this.intensityState, "intensity", o0VarE, i15);
        UpdateLightProperty(mapboxMap, this.intensityTransitionState, "intensity-transition", o0VarE, i15);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AmbientLightState$UpdateProperties$1(this, mapboxMap, i14);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!AmbientLightState.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        AmbientLightState ambientLightState = (AmbientLightState) other;
        return s.g(this.id, ambientLightState.id) && s.g(getColor(), ambientLightState.getColor()) && s.g(getColorTransition(), ambientLightState.getColorTransition()) && s.g(getColorUseTheme(), ambientLightState.getColorUseTheme()) && s.g(getIntensity(), ambientLightState.getIntensity()) && s.g(getIntensityTransition(), ambientLightState.getIntensityTransition());
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

    public final String getId() {
        return this.id;
    }

    public final DoubleValue getIntensity() {
        return this.intensityState.getF182175a();
    }

    public final Transition getIntensityTransition() {
        return this.intensityTransitionState.getF182175a();
    }

    public final HashMap<String, Value> getProperties$extension_compose_release() {
        o13.p pVar = new o13.p(TtmlNode.ATTR_ID, new Value(this.id));
        o13.p pVar2 = new o13.p(NotificationConstants.KEY_DATA_MIME_TYPE, new Value("ambient"));
        HashMap map = new HashMap();
        if (getColor().isNotInitial()) {
            map.put(TtmlNode.ATTR_TTS_COLOR, getColor().getValue());
        }
        if (getColorTransition().isNotInitial()) {
            map.put("color-transition", getColorTransition().getValue());
        }
        if (getColorUseTheme().isNotInitial()) {
            map.put("color-use-theme", getColorUseTheme().getValue());
        }
        if (getIntensity().isNotInitial()) {
            map.put("intensity", getIntensity().getValue());
        }
        if (getIntensityTransition().isNotInitial()) {
            map.put("intensity-transition", getIntensityTransition().getValue());
        }
        Unit unit = Unit.INSTANCE;
        return u0.d(pVar, pVar2, new o13.p("properties", new Value((HashMap<String, Value>) map)));
    }

    public int hashCode() {
        return Objects.hash(getColor(), getColorTransition(), getColorUseTheme(), getIntensity(), getIntensityTransition());
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

    public final void setIntensity(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.intensityState.setValue(doubleValue);
    }

    public final void setIntensityTransition(Transition transition) {
        transition.getClass();
        this.intensityTransitionState.setValue(transition);
    }

    public String toString() {
        return "AmbientLightState(color=" + getColor() + ", colorTransition=" + getColorTransition() + ", colorUseTheme=" + getColorUseTheme() + ", intensity=" + getIntensity() + ", intensityTransition=" + getIntensityTransition() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/lights/generated/AmbientLightState$Companion;", "", "<init>", "()V", "Ld4/k;", "Lcom/mapbox/maps/extension/compose/style/lights/generated/AmbientLightState;", "Lcom/mapbox/maps/extension/compose/style/lights/generated/AmbientLightState$Holder;", "Saver", "Ld4/k;", "getSaver", "()Ld4/k;", "", "TAG", "Ljava/lang/String;", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final k<AmbientLightState, Holder> getSaver() {
            return AmbientLightState.Saver;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/lights/generated/AmbientLightState$Holder;", "Landroid/os/Parcelable;", "savedProperties", "", "", "Lcom/mapbox/bindgen/Value;", "(Ljava/util/Map;)V", "getSavedProperties", "()Ljava/util/Map;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
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

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.lights.generated.AmbientLightState$UpdateLightProperty$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements e23.p<p3.m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ String $name;
        final /* synthetic */ p1<? extends HoldsValue> $state;
        final /* synthetic */ MapboxStyleManager $this_UpdateLightProperty;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MapboxStyleManager mapboxStyleManager, p1<? extends HoldsValue> p1Var, String str, int i14) {
            super(2);
            this.$this_UpdateLightProperty = mapboxStyleManager;
            this.$state = p1Var;
            this.$name = str;
            this.$$changed = i14;
        }

        public final void invoke(p3.m mVar, int i14) {
            AmbientLightState.this.UpdateLightProperty(this.$this_UpdateLightProperty, this.$state, this.$name, mVar, this.$$changed | 1);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(p3.m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ AmbientLightState(String str, ColorValue colorValue, Transition transition, StringValue stringValue, DoubleValue doubleValue, Transition transition2, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? ColorValue.INITIAL : colorValue, (i14 & 4) != 0 ? Transition.INITIAL : transition, (i14 & 8) != 0 ? StringValue.INITIAL : stringValue, (i14 & 16) != 0 ? DoubleValue.INITIAL : doubleValue, (i14 & 32) != 0 ? Transition.INITIAL : transition2);
    }

    public /* synthetic */ AmbientLightState(String str, int i14, j jVar) {
        this((i14 & 1) != 0 ? IdGenerator.INSTANCE.generateRandomLightId("ambient") : str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AmbientLightState(String str) {
        str.getClass();
        ColorValue colorValue = ColorValue.INITIAL;
        Transition transition = Transition.INITIAL;
        this(str, colorValue, transition, StringValue.INITIAL, DoubleValue.INITIAL, transition);
    }
}
