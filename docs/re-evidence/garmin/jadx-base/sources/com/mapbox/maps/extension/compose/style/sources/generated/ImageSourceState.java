package com.mapbox.maps.extension.compose.style.sources.generated;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.compose.style.IdGenerator;
import com.mapbox.maps.extension.compose.style.LongValue;
import com.mapbox.maps.extension.compose.style.PointListValue;
import com.mapbox.maps.extension.compose.style.PropertyTypesKt;
import com.mapbox.maps.extension.compose.style.StringValue;
import com.mapbox.maps.extension.compose.style.sources.SourceState;
import d4.k;
import d4.l;
import d4.m;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 82\u00020\u0001:\u00018BQ\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0012J\u001b\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0015H\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R+\u0010\u000b\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+*\u0004\b,\u0010-R+\u0010\r\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b.\u0010/\"\u0004\b0\u00101*\u0004\b2\u0010-R+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b3\u00104\"\u0004\b5\u00106*\u0004\b7\u0010-¨\u00069"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/sources/generated/ImageSourceState;", "Lcom/mapbox/maps/extension/compose/style/sources/SourceState;", "", "sourceId", "sourceType", "", "Lo13/p;", "", "Lcom/mapbox/bindgen/Value;", "initialProperties", "Lcom/mapbox/maps/extension/compose/style/StringValue;", "url", "Lcom/mapbox/maps/extension/compose/style/PointListValue;", "coordinates", "Lcom/mapbox/maps/extension/compose/style/LongValue;", "prefetchZoomDelta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/PointListValue;Lcom/mapbox/maps/extension/compose/style/LongValue;)V", "(Ljava/lang/String;)V", "getProperties", "()Ljava/util/Map;", "", "UpdateProperties$extension_compose_release", "(Lp3/m;I)V", "UpdateProperties", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lp3/p1;", "urlState", "Lp3/p1;", "coordinatesState", "prefetchZoomDeltaState", "<set-?>", "getUrl", "()Lcom/mapbox/maps/extension/compose/style/StringValue;", "setUrl", "(Lcom/mapbox/maps/extension/compose/style/StringValue;)V", "getUrl$delegate", "(Lcom/mapbox/maps/extension/compose/style/sources/generated/ImageSourceState;)Ljava/lang/Object;", "getCoordinates", "()Lcom/mapbox/maps/extension/compose/style/PointListValue;", "setCoordinates", "(Lcom/mapbox/maps/extension/compose/style/PointListValue;)V", "getCoordinates$delegate", "getPrefetchZoomDelta", "()Lcom/mapbox/maps/extension/compose/style/LongValue;", "setPrefetchZoomDelta", "(Lcom/mapbox/maps/extension/compose/style/LongValue;)V", "getPrefetchZoomDelta$delegate", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ImageSourceState extends SourceState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final k<ImageSourceState, SourceState.Holder> Saver;
    private final p1<PointListValue> coordinatesState;
    private final p1<LongValue> prefetchZoomDeltaState;
    private final p1<StringValue> urlState;

    static {
        ImageSourceState$Companion$Saver$1 imageSourceState$Companion$Saver$1 = ImageSourceState$Companion$Saver$1.INSTANCE;
        ImageSourceState$Companion$Saver$2 imageSourceState$Companion$Saver$2 = ImageSourceState$Companion$Saver$2.INSTANCE;
        l lVar = m.f57455a;
        Saver = new l(imageSourceState$Companion$Saver$1, imageSourceState$Companion$Saver$2);
    }

    private ImageSourceState(String str, String str2, Map<String, ? extends p<Boolean, ? extends Value>> map, StringValue stringValue, PointListValue pointListValue, LongValue longValue) {
        super(str, str2, map, null, 8, null);
        this.urlState = p0.n(stringValue);
        this.coordinatesState = p0.n(pointListValue);
        this.prefetchZoomDeltaState = p0.n(longValue);
    }

    private final Map<String, Value> getProperties() {
        p pVar = new p("url", getUrl().getValue());
        if (!getUrl().isNotInitial()) {
            pVar = null;
        }
        p pVar2 = new p("coordinates", getCoordinates().getValue());
        if (!getCoordinates().isNotInitial()) {
            pVar2 = null;
        }
        return u0.l(u.C(new p[]{pVar, pVar2, getPrefetchZoomDelta().isNotInitial() ? new p("prefetch-zoom-delta", getPrefetchZoomDelta().getValue()) : null}));
    }

    @Override // com.mapbox.maps.extension.compose.style.sources.SourceState
    public void UpdateProperties$extension_compose_release(p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1217495726);
        if ((i14 & 14) == 0) {
            i15 = (o0VarE.B(this) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i15 & 11) == 2 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = n.f135158a;
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetBuilderPropertyAction(), this.urlState, "url", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetBuilderPropertyAction(), this.coordinatesState, "coordinates", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetPropertyAction(), this.prefetchZoomDeltaState, "prefetch-zoom-delta", o0VarE, 384);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new ImageSourceState$UpdateProperties$1(this, i14);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!ImageSourceState.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        ImageSourceState imageSourceState = (ImageSourceState) other;
        return s.g(getSourceId(), imageSourceState.getSourceId()) && s.g(getUrl(), imageSourceState.getUrl()) && s.g(getCoordinates(), imageSourceState.getCoordinates()) && s.g(getPrefetchZoomDelta(), imageSourceState.getPrefetchZoomDelta());
    }

    public final PointListValue getCoordinates() {
        return this.coordinatesState.getF182175a();
    }

    public final LongValue getPrefetchZoomDelta() {
        return this.prefetchZoomDeltaState.getF182175a();
    }

    public final StringValue getUrl() {
        return this.urlState.getF182175a();
    }

    public int hashCode() {
        return Objects.hash(getSourceId(), getUrl(), getCoordinates(), getPrefetchZoomDelta());
    }

    public final void setCoordinates(PointListValue pointListValue) {
        pointListValue.getClass();
        this.coordinatesState.setValue(pointListValue);
    }

    public final void setPrefetchZoomDelta(LongValue longValue) {
        longValue.getClass();
        this.prefetchZoomDeltaState.setValue(longValue);
    }

    public final void setUrl(StringValue stringValue) {
        stringValue.getClass();
        this.urlState.setValue(stringValue);
    }

    @Override // com.mapbox.maps.extension.compose.style.sources.SourceState
    public String toString() {
        return "ImageSourceState(sourceId=" + getSourceId() + ", url=" + getUrl() + ", coordinates=" + getCoordinates() + ", prefetchZoomDelta=" + getPrefetchZoomDelta() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/sources/generated/ImageSourceState$Companion;", "", "<init>", "()V", "Ld4/k;", "Lcom/mapbox/maps/extension/compose/style/sources/generated/ImageSourceState;", "Lcom/mapbox/maps/extension/compose/style/sources/SourceState$Holder;", "Saver", "Ld4/k;", "getSaver", "()Ld4/k;", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final k<ImageSourceState, SourceState.Holder> getSaver() {
            return ImageSourceState.Saver;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ImageSourceState(String str) {
        str.getClass();
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        this(str, "image", k0Var, StringValue.INITIAL, PointListValue.INITIAL, LongValue.INITIAL);
    }

    public /* synthetic */ ImageSourceState(String str, String str2, Map map, StringValue stringValue, PointListValue pointListValue, LongValue longValue, j jVar) {
        this(str, str2, map, stringValue, pointListValue, longValue);
    }

    public /* synthetic */ ImageSourceState(String str, int i14, j jVar) {
        this((i14 & 1) != 0 ? IdGenerator.INSTANCE.generateRandomSourceId("image") : str);
    }
}
