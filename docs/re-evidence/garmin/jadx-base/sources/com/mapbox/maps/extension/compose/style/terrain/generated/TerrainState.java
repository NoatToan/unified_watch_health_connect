package com.mapbox.maps.extension.compose.style.terrain.generated;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.compose.style.DoubleValue;
import com.mapbox.maps.extension.compose.style.PropertyTypesKt;
import com.mapbox.maps.extension.compose.style.Transition;
import com.mapbox.maps.extension.compose.style.internal.ValueParceler;
import com.mapbox.maps.extension.compose.style.sources.SourceState;
import com.mapbox.maps.extension.compose.style.sources.generated.RasterDemSourceState;
import com.mapbox.maps.extension.compose.style.terrain.TerrainStateApplier;
import d4.k;
import d4.l;
import d4.m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 42\u00020\u0001:\u000245B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fB\u0011\b\u0012\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000fJ\u001b\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,*\u0004\b-\u0010.R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b/\u00100\"\u0004\b1\u00102*\u0004\b3\u0010.¨\u00066"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState;", "", "Lcom/mapbox/maps/extension/compose/style/terrain/TerrainStateApplier;", "applier", "Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "exaggeration", "Lcom/mapbox/maps/extension/compose/style/Transition;", "exaggerationTransition", "<init>", "(Lcom/mapbox/maps/extension/compose/style/terrain/TerrainStateApplier;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;)V", "Lcom/mapbox/maps/extension/compose/style/sources/generated/RasterDemSourceState;", "rasterDemSourceState", "(Lcom/mapbox/maps/extension/compose/style/sources/generated/RasterDemSourceState;)V", "", "initial", "(Z)V", "", "", "Lcom/mapbox/bindgen/Value;", "getProperties", "()Ljava/util/Map;", "", "UpdateProperties$extension_compose_release", "(Lp3/m;I)V", "UpdateProperties", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/mapbox/maps/extension/compose/style/terrain/TerrainStateApplier;", "getApplier$extension_compose_release", "()Lcom/mapbox/maps/extension/compose/style/terrain/TerrainStateApplier;", "Lp3/p1;", "exaggerationState", "Lp3/p1;", "exaggerationTransitionState", "<set-?>", "getExaggeration", "()Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "setExaggeration", "(Lcom/mapbox/maps/extension/compose/style/DoubleValue;)V", "getExaggeration$delegate", "(Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState;)Ljava/lang/Object;", "getExaggerationTransition", "()Lcom/mapbox/maps/extension/compose/style/Transition;", "setExaggerationTransition", "(Lcom/mapbox/maps/extension/compose/style/Transition;)V", "getExaggerationTransition$delegate", "Companion", "Holder", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class TerrainState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final TerrainState DISABLED;
    public static final TerrainState INITIAL;
    private static final k<TerrainState, Holder> Saver;
    private final TerrainStateApplier applier;
    private final p1<DoubleValue> exaggerationState;
    private final p1<Transition> exaggerationTransitionState;

    static {
        TerrainState$Companion$Saver$1 terrainState$Companion$Saver$1 = TerrainState$Companion$Saver$1.INSTANCE;
        TerrainState$Companion$Saver$2 terrainState$Companion$Saver$2 = TerrainState$Companion$Saver$2.INSTANCE;
        l lVar = m.f57455a;
        Saver = new l(terrainState$Companion$Saver$1, terrainState$Companion$Saver$2);
        INITIAL = new TerrainState(true);
        DISABLED = new TerrainState(false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TerrainState(RasterDemSourceState rasterDemSourceState) {
        rasterDemSourceState.getClass();
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        this(new TerrainStateApplier(rasterDemSourceState, k0Var, false, null, 8, null), DoubleValue.INITIAL, Transition.INITIAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Value> getProperties() {
        p pVar = new p("exaggeration", getExaggeration().getValue());
        if (!getExaggeration().isNotInitial()) {
            pVar = null;
        }
        return u0.l(u.C(new p[]{pVar, getExaggerationTransition().isNotInitial() ? new p("exaggeration-transition", getExaggerationTransition().getValue()) : null}));
    }

    public final void UpdateProperties$extension_compose_release(p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-432899633);
        if ((i14 & 14) == 0) {
            i15 = (o0VarE.B(this) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i15 & 11) == 2 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = n.f135158a;
            RasterDemSourceState rasterDemSourceState = this.applier.getRasterDemSourceState();
            o0VarE.L(78091205);
            if (rasterDemSourceState != null) {
                rasterDemSourceState.UpdateProperties$extension_compose_release(o0VarE, 0);
                Unit unit = Unit.INSTANCE;
            }
            o0VarE.g0(false);
            TerrainState$UpdateProperties$action$1 terrainState$UpdateProperties$action$1 = new TerrainState$UpdateProperties$action$1(this.applier);
            PropertyTypesKt.ActionWhenNotInitial(terrainState$UpdateProperties$action$1, this.exaggerationState, "exaggeration", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial(terrainState$UpdateProperties$action$1, this.exaggerationTransitionState, "exaggeration-transition", o0VarE, 384);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new TerrainState$UpdateProperties$1(this, i14);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!TerrainState.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        TerrainState terrainState = (TerrainState) other;
        return s.g(this.applier, terrainState.applier) && s.g(getExaggeration(), terrainState.getExaggeration()) && s.g(getExaggerationTransition(), terrainState.getExaggerationTransition());
    }

    /* JADX INFO: renamed from: getApplier$extension_compose_release, reason: from getter */
    public final TerrainStateApplier getApplier() {
        return this.applier;
    }

    public final DoubleValue getExaggeration() {
        return this.exaggerationState.getF182175a();
    }

    public final Transition getExaggerationTransition() {
        return this.exaggerationTransitionState.getF182175a();
    }

    public int hashCode() {
        return Objects.hash(this.applier, getExaggeration(), getExaggerationTransition());
    }

    public final void setExaggeration(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.exaggerationState.setValue(doubleValue);
    }

    public final void setExaggerationTransition(Transition transition) {
        transition.getClass();
        this.exaggerationTransitionState.setValue(transition);
    }

    public String toString() {
        return "TerrainState(applier=" + this.applier + ", exaggeration=" + getExaggeration() + ", exaggerationTransition=" + getExaggerationTransition() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState$Companion;", "", "<init>", "()V", "Ld4/k;", "Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState;", "Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState$Holder;", "Saver", "Ld4/k;", "getSaver", "()Ld4/k;", "DISABLED", "Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState;", "INITIAL", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final k<TerrainState, Holder> getSaver() {
            return TerrainState.Saver;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState$Holder;", "Landroid/os/Parcelable;", "rasterDemSourceStateHolder", "Lcom/mapbox/maps/extension/compose/style/sources/SourceState$Holder;", "savedProperties", "", "", "Lcom/mapbox/bindgen/Value;", "initial", "", "(Lcom/mapbox/maps/extension/compose/style/sources/SourceState$Holder;Ljava/util/Map;Z)V", "getInitial", "()Z", "getRasterDemSourceStateHolder", "()Lcom/mapbox/maps/extension/compose/style/sources/SourceState$Holder;", "getSavedProperties", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Holder implements Parcelable {
        private final boolean initial;
        private final SourceState.Holder rasterDemSourceStateHolder;
        private final Map<String, Value> savedProperties;
        public static final Parcelable.Creator<Holder> CREATOR = new Creator();
        public static final int $stable = 8;

        /* JADX WARN: Multi-variable type inference failed */
        public Holder(SourceState.Holder holder, Map<String, ? extends Value> map, boolean z14) {
            map.getClass();
            this.rasterDemSourceStateHolder = holder;
            this.savedProperties = map;
            this.initial = z14;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Holder copy$default(Holder holder, SourceState.Holder holder2, Map map, boolean z14, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                holder2 = holder.rasterDemSourceStateHolder;
            }
            if ((i14 & 2) != 0) {
                map = holder.savedProperties;
            }
            if ((i14 & 4) != 0) {
                z14 = holder.initial;
            }
            return holder.copy(holder2, map, z14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final SourceState.Holder getRasterDemSourceStateHolder() {
            return this.rasterDemSourceStateHolder;
        }

        public final Map<String, Value> component2() {
            return this.savedProperties;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getInitial() {
            return this.initial;
        }

        public final Holder copy(SourceState.Holder rasterDemSourceStateHolder, Map<String, ? extends Value> savedProperties, boolean initial) {
            savedProperties.getClass();
            return new Holder(rasterDemSourceStateHolder, savedProperties, initial);
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
            return s.g(this.rasterDemSourceStateHolder, holder.rasterDemSourceStateHolder) && s.g(this.savedProperties, holder.savedProperties) && this.initial == holder.initial;
        }

        public final boolean getInitial() {
            return this.initial;
        }

        public final SourceState.Holder getRasterDemSourceStateHolder() {
            return this.rasterDemSourceStateHolder;
        }

        public final Map<String, Value> getSavedProperties() {
            return this.savedProperties;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        public int hashCode() {
            SourceState.Holder holder = this.rasterDemSourceStateHolder;
            int iB = am.j.b(this.savedProperties, (holder == null ? 0 : holder.hashCode()) * 31, 31);
            boolean z14 = this.initial;
            ?? r14 = z14;
            if (z14) {
                r14 = 1;
            }
            return iB + r14;
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder("Holder(rasterDemSourceStateHolder=");
            sb3.append(this.rasterDemSourceStateHolder);
            sb3.append(", savedProperties=");
            sb3.append(this.savedProperties);
            sb3.append(", initial=");
            return am.j.t(sb3, this.initial, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.getClass();
            SourceState.Holder holder = this.rasterDemSourceStateHolder;
            if (holder == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                holder.writeToParcel(parcel, flags);
            }
            Iterator itU = am.j.u(this.savedProperties, parcel);
            while (itU.hasNext()) {
                Map.Entry entry = (Map.Entry) itU.next();
                parcel.writeString((String) entry.getKey());
                ValueParceler.INSTANCE.write((Value) entry.getValue(), parcel, flags);
            }
            parcel.writeInt(this.initial ? 1 : 0);
        }

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Holder> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Holder createFromParcel(Parcel parcel) {
                parcel.getClass();
                SourceState.Holder holderCreateFromParcel = parcel.readInt() == 0 ? null : SourceState.Holder.CREATOR.createFromParcel(parcel);
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    linkedHashMap.put(parcel.readString(), ValueParceler.INSTANCE.m220create(parcel));
                }
                return new Holder(holderCreateFromParcel, linkedHashMap, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Holder[] newArray(int i14) {
                return new Holder[i14];
            }
        }
    }

    private TerrainState(TerrainStateApplier terrainStateApplier, DoubleValue doubleValue, Transition transition) {
        this.applier = terrainStateApplier;
        this.exaggerationState = p0.n(doubleValue);
        this.exaggerationTransitionState = p0.n(transition);
    }

    public /* synthetic */ TerrainState(TerrainStateApplier terrainStateApplier, DoubleValue doubleValue, Transition transition, j jVar) {
        this(terrainStateApplier, doubleValue, transition);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private TerrainState(boolean z14) {
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        this(new TerrainStateApplier(null, k0Var, z14, null, 8, null), DoubleValue.INITIAL, Transition.INITIAL);
    }
}
