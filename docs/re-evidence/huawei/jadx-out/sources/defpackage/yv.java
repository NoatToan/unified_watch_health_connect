package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class yv implements Serializable {
    private static final int e = LogicalType.values().length;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected CoercionAction f53884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected zc[] f53885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Map<Class<?>, zc> f53886c;
    protected final zc d;

    public yv() {
        this(CoercionAction.TryConvert, new zc(), null, null);
    }

    protected yv(CoercionAction coercionAction, zc zcVar, zc[] zcVarArr, Map<Class<?>, zc> map) {
        this.d = zcVar;
        this.f53884a = coercionAction;
        this.f53885b = zcVarArr;
        this.f53886c = map;
    }

    public CoercionAction e(yi yiVar, LogicalType logicalType, Class<?> cls, CoercionInputShape coercionInputShape) {
        zc zcVar;
        CoercionAction coercionActionD;
        zc zcVar2;
        CoercionAction coercionActionD2;
        Map<Class<?>, zc> map = this.f53886c;
        if (map != null && cls != null && (zcVar2 = map.get(cls)) != null && (coercionActionD2 = zcVar2.d(coercionInputShape)) != null) {
            return coercionActionD2;
        }
        zc[] zcVarArr = this.f53885b;
        if (zcVarArr != null && logicalType != null && (zcVar = zcVarArr[logicalType.ordinal()]) != null && (coercionActionD = zcVar.d(coercionInputShape)) != null) {
            return coercionActionD;
        }
        CoercionAction coercionActionD3 = this.d.d(coercionInputShape);
        if (coercionActionD3 != null) {
            return coercionActionD3;
        }
        int i = AnonymousClass3.e[coercionInputShape.ordinal()];
        boolean z = true;
        if (i == 1) {
            return yiVar.d(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT) ? CoercionAction.AsNull : CoercionAction.Fail;
        }
        if (i == 2) {
            if (logicalType == LogicalType.Integer) {
                return yiVar.d(DeserializationFeature.ACCEPT_FLOAT_AS_INT) ? CoercionAction.TryConvert : CoercionAction.Fail;
            }
        } else if (i == 3 && logicalType == LogicalType.Enum && yiVar.d(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS)) {
            return CoercionAction.Fail;
        }
        if (logicalType != LogicalType.Float && logicalType != LogicalType.Integer && logicalType != LogicalType.Boolean && logicalType != LogicalType.DateTime) {
            z = false;
        }
        if (z && !yiVar.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)) {
            return CoercionAction.Fail;
        }
        if (coercionInputShape == CoercionInputShape.EmptyString) {
            if (z || yiVar.d(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
                return CoercionAction.AsNull;
            }
            if (logicalType == LogicalType.OtherScalar) {
                return CoercionAction.TryConvert;
            }
            return CoercionAction.Fail;
        }
        return this.f53884a;
    }

    /* JADX INFO: renamed from: yv$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[CoercionInputShape.values().length];
            e = iArr;
            try {
                iArr[CoercionInputShape.EmptyArray.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[CoercionInputShape.Float.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[CoercionInputShape.Integer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public CoercionAction b(yi yiVar, LogicalType logicalType, Class<?> cls, CoercionAction coercionAction) {
        Boolean boolB;
        CoercionAction coercionActionD;
        zc zcVar;
        zc zcVar2;
        Map<Class<?>, zc> map = this.f53886c;
        if (map == null || cls == null || (zcVar2 = map.get(cls)) == null) {
            boolB = null;
            coercionActionD = null;
        } else {
            boolB = zcVar2.b();
            coercionActionD = zcVar2.d(CoercionInputShape.EmptyString);
        }
        zc[] zcVarArr = this.f53885b;
        if (zcVarArr != null && logicalType != null && (zcVar = zcVarArr[logicalType.ordinal()]) != null) {
            if (boolB == null) {
                boolB = zcVar.b();
            }
            if (coercionActionD == null) {
                coercionActionD = zcVar.d(CoercionInputShape.EmptyString);
            }
        }
        if (boolB == null) {
            boolB = this.d.b();
        }
        if (coercionActionD == null) {
            coercionActionD = this.d.d(CoercionInputShape.EmptyString);
        }
        if (!Boolean.TRUE.equals(boolB)) {
            return coercionAction;
        }
        if (coercionActionD != null) {
            return coercionActionD;
        }
        return yiVar.d(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) ? CoercionAction.AsNull : CoercionAction.Fail;
    }
}
