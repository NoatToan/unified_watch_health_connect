package com.mapbox.maps.extension.style.types;

import androidx.annotation.Keep;
import androidx.room.a0;
import c22.t;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.crashlytics.internal.common.i;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.utils.TypeUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.u0;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u001b\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\r\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/mapbox/maps/extension/style/types/PromoteId;", "", "expression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "sourceId", "", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Ljava/lang/String;)V", "propertyName", "(Ljava/lang/String;Ljava/lang/String;)V", "getExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getPropertyName", "()Ljava/lang/String;", "getSourceId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "toValue", "Lcom/mapbox/bindgen/Value;", "toValue$extension_style_release", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class PromoteId {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Expression expression;
    private final String propertyName;
    private final String sourceId;

    public PromoteId(String str, String str2) {
        str.getClass();
        this.propertyName = str;
        this.sourceId = str2;
        Expression expressionUnwrapToExpression = null;
        try {
            Value value = Value.fromJson(str).getValue();
            if (value != null) {
                expressionUnwrapToExpression = TypeUtilsKt.unwrapToExpression(value);
            }
        } catch (Throwable unused) {
        }
        this.expression = expressionUnwrapToExpression;
    }

    public static /* synthetic */ PromoteId copy$default(PromoteId promoteId, String str, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = promoteId.propertyName;
        }
        if ((i14 & 2) != 0) {
            str2 = promoteId.sourceId;
        }
        return promoteId.copy(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Value toValue$lambda$0(PromoteId promoteId, String str) {
        promoteId.getClass();
        str.getClass();
        return Value.valueOf(promoteId.propertyName);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPropertyName() {
        return this.propertyName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    public final PromoteId copy(String propertyName, String sourceId) {
        propertyName.getClass();
        return new PromoteId(propertyName, sourceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoteId)) {
            return false;
        }
        PromoteId promoteId = (PromoteId) other;
        return s.g(this.propertyName, promoteId.propertyName) && s.g(this.sourceId, promoteId.sourceId);
    }

    public final Expression getExpression() {
        return this.expression;
    }

    public final String getPropertyName() {
        return this.propertyName;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public int hashCode() {
        int iHashCode = this.propertyName.hashCode() * 31;
        String str = this.sourceId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("PromoteId(propertyName=");
        sb3.append(this.propertyName);
        sb3.append(", sourceId=");
        return a0.m(sb3, this.sourceId, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public final Value toValue$extension_style_release() {
        Value valueOrElse = Value.fromJson(this.propertyName).getValueOrElse(new i(this, 28));
        valueOrElse.getClass();
        Value value = valueOrElse;
        String str = this.sourceId;
        return str != null ? new Value((HashMap<String, Value>) u0.d(new p(str, value))) : value;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0000¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/extension/style/types/PromoteId$Companion;", "", "()V", "fromProperty", "Lcom/mapbox/maps/extension/style/types/PromoteId;", "propertyName", "fromProperty$extension_style_release", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final PromoteId fromProperty$extension_style_release(Object propertyName) {
            propertyName.getClass();
            int i14 = 2;
            String str = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            if (propertyName instanceof String) {
                return new PromoteId((String) propertyName, str, i14, (j) (objArr5 == true ? 1 : 0));
            }
            if (propertyName instanceof List) {
                return new PromoteId(TypeUtilsKt.unwrapToExpression(TypeUtils.INSTANCE.wrapToValue(propertyName)), (String) (objArr4 == true ? 1 : 0), i14, (j) (objArr3 == true ? 1 : 0));
            }
            if (!(propertyName instanceof HashMap)) {
                com.mapbox.maps.p.o("Wrapping ", propertyName.getClass().getSimpleName(), " to PromoteId is not supported.");
                return null;
            }
            try {
                HashMap map = (HashMap) propertyName;
                Set setKeySet = map.keySet();
                setKeySet.getClass();
                String str2 = "";
                if (setKeySet.isEmpty()) {
                    return new PromoteId(str2, (String) (objArr2 == true ? 1 : 0), i14, (j) (objArr == true ? 1 : 0));
                }
                Object next = map.keySet().iterator().next();
                next.getClass();
                String str3 = (String) next;
                Object obj = map.get(str3);
                if (!(obj == null ? true : obj instanceof String)) {
                    if (obj instanceof List) {
                        return new PromoteId(TypeUtilsKt.unwrapToExpression(TypeUtils.INSTANCE.wrapToValue(obj)), str3);
                    }
                    throw new RuntimeException("PromoteId value should be either String or Expression");
                }
                String str4 = (String) obj;
                if (str4 != null) {
                    str2 = str4;
                }
                return new PromoteId(str2, str3);
            } catch (RuntimeException unused) {
                t.h(propertyName, " must be in the format HashMap<String,String> or HashMap<String,Expression>");
                return null;
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PromoteId(String str) {
        this(str, (String) null, 2, (j) (0 == true ? 1 : 0));
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PromoteId(Expression expression) {
        this(expression, (String) null, 2, (j) (0 == true ? 1 : 0));
        expression.getClass();
    }

    public /* synthetic */ PromoteId(String str, String str2, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? null : str2);
    }

    public /* synthetic */ PromoteId(Expression expression, String str, int i14, j jVar) {
        this(expression, (i14 & 2) != 0 ? null : str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PromoteId(Expression expression, String str) {
        expression.getClass();
        String json = expression.toJson();
        json.getClass();
        this(json, str);
    }
}
