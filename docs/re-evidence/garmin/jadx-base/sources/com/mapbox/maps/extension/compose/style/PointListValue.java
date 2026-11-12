package com.mapbox.maps.extension.compose.style;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Point;
import com.mapbox.maps.extension.compose.style.internal.ComposeTypeUtils;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007¢\u0006\u0004\b\u0004\u0010\tB5\b\u0016\u0012*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n0\u0006\"\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0004\u0010\fB\u001d\b\u0016\u0012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\r0\r¢\u0006\u0004\b\u0004\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0004\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/PointListValue;", "Lcom/mapbox/maps/extension/compose/style/HoldsValue;", "Lcom/mapbox/bindgen/Value;", "value", "<init>", "(Lcom/mapbox/bindgen/Value;)V", "", "Lcom/mapbox/geojson/Point;", "point", "([Lcom/mapbox/geojson/Point;)V", "Lo13/p;", "", "([Lo13/p;)V", "", "points", "(Ljava/util/List;)V", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "expression", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)V", "", "isNotInitial", "()Z", "component1", "()Lcom/mapbox/bindgen/Value;", "copy", "(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/maps/extension/compose/style/PointListValue;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/mapbox/bindgen/Value;", "getValue", "getPointsOrNull", "()Ljava/util/List;", "pointsOrNull", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class PointListValue implements HoldsValue {
    public static final PointListValue DEFAULT;
    public static final PointListValue INITIAL;
    private final Value value;
    public static final int $stable = 8;

    static {
        Value valueValueOf = Value.valueOf("PointListValue.INITIAL");
        valueValueOf.getClass();
        INITIAL = new PointListValue(valueValueOf);
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        DEFAULT = new PointListValue(valueNullValue);
    }

    public PointListValue(Point... pointArr) {
        pointArr.getClass();
        ArrayList arrayList = new ArrayList(pointArr.length);
        for (Point point : pointArr) {
            arrayList.add(x.k(Double.valueOf(point.longitude()), Double.valueOf(point.latitude())));
        }
        this(arrayList);
    }

    public static /* synthetic */ PointListValue copy$default(PointListValue pointListValue, Value value, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            value = pointListValue.getValue();
        }
        return pointListValue.copy(value);
    }

    public final Value component1() {
        return getValue();
    }

    public final PointListValue copy(Value value) {
        value.getClass();
        return new PointListValue(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PointListValue) && s.g(getValue(), ((PointListValue) other).getValue());
    }

    public final List<Point> getPointsOrNull() {
        Object contents = getValue().getContents();
        List list = contents instanceof List ? (List) contents : null;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object contents2 = ((Value) it.next()).getContents();
            if (contents2 instanceof List) {
                List list2 = (List) contents2;
                if (list2.size() == 2) {
                    Object obj = list2.get(0);
                    Value value = obj instanceof Value ? (Value) obj : null;
                    Object contents3 = value != null ? value.getContents() : null;
                    Object obj2 = list2.get(1);
                    Value value2 = obj2 instanceof Value ? (Value) obj2 : null;
                    Object contents4 = value2 != null ? value2.getContents() : null;
                    if ((contents3 instanceof Double) && (contents4 instanceof Double)) {
                        arrayList.add(Point.fromLngLat(((Number) contents3).doubleValue(), ((Number) contents4).doubleValue()));
                    }
                }
            }
            return null;
        }
        return arrayList;
    }

    @Override // com.mapbox.maps.extension.compose.style.HoldsValue
    public Value getValue() {
        return this.value;
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    @Override // com.mapbox.maps.extension.compose.style.HoldsValue
    public boolean isNotInitial() {
        return this != INITIAL;
    }

    public String toString() {
        return "PointListValue(value=" + getValue() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PointListValue(List<? extends List<Double>> list) {
        this(ComposeTypeUtils.INSTANCE.wrapToValue(list));
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PointListValue(Expression expression) {
        this((Value) expression);
        expression.getClass();
    }

    public PointListValue(Value value) {
        value.getClass();
        this.value = value;
    }

    public PointListValue(p<Double, Double>... pVarArr) {
        pVarArr.getClass();
        ArrayList arrayList = new ArrayList(pVarArr.length);
        for (p<Double, Double> pVar : pVarArr) {
            arrayList.add(x.k(pVar.f128594a, pVar.f128595b));
        }
        this(arrayList);
    }
}
