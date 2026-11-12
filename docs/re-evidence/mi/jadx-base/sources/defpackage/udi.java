package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.b;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class udi extends pvg implements dn9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Integer> f35660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f35661b;
    public int c;
    public final JavaOnlyMap d;
    public final yej e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35662a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f35662a = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35662a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35662a[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public udi(int i, ReadableMap readableMap, svg svgVar, b bVar) {
        super(i, readableMap, svgVar);
        this.c = -1;
        this.f35660a = hmq.b(readableMap.getMap("props"));
        this.f35661b = bVar;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        this.d = javaOnlyMap;
        this.e = new yej(javaOnlyMap);
    }

    public static void b(WritableMap writableMap, String str, Object obj) {
        if (obj == null) {
            writableMap.putNull(str);
            return;
        }
        if (obj instanceof Double) {
            writableMap.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Integer) {
            writableMap.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Number) {
            writableMap.putDouble(str, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Boolean) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            writableMap.putString(str, (String) obj);
        } else if (obj instanceof WritableArray) {
            writableMap.putArray(str, (WritableArray) obj);
        } else {
            if (!(obj instanceof WritableMap)) {
                throw new IllegalStateException("Unknown type of animated value");
            }
            writableMap.putMap(str, (WritableMap) obj);
        }
    }

    public void c(int i) {
        this.c = i;
        dangerouslyRescheduleEvaluate();
    }

    public void d(int i) {
        this.c = -1;
    }

    @Override // defpackage.dn9
    public void update() {
        if (this.c == -1) {
            return;
        }
        value();
    }

    @Override // defpackage.pvg
    public Double evaluate() {
        boolean z;
        boolean z2;
        boolean z3;
        WritableMap writableMap;
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        for (Map.Entry<String, Integer> entry : this.f35660a.entrySet()) {
            pvg pvgVarO = this.mNodesManager.o(entry.getValue().intValue(), pvg.class);
            if (pvgVarO instanceof zlo) {
                WritableMap writableMap2 = (WritableMap) pvgVarO.value();
                ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = writableMap2.keySetIterator();
                while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                    String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                    if (this.mNodesManager.q.contains(strNextKey)) {
                        writableMap = this.d;
                        z2 = z6;
                        z = z5;
                        z3 = true;
                    } else if (this.mNodesManager.f34029r.contains(strNextKey)) {
                        z3 = z4;
                        z2 = z6;
                        z = true;
                        writableMap = writableMapCreateMap2;
                    } else {
                        z = z5;
                        z2 = true;
                        z3 = z4;
                        writableMap = writableMapCreateMap;
                    }
                    ReadableType type = writableMap2.getType(strNextKey);
                    int i = a.f35662a[type.ordinal()];
                    if (i == 1) {
                        writableMap.putDouble(strNextKey, writableMap2.getDouble(strNextKey));
                    } else if (i == 2) {
                        writableMap.putString(strNextKey, writableMap2.getString(strNextKey));
                    } else {
                        if (i != 3) {
                            throw new IllegalArgumentException("Unexpected type " + type);
                        }
                        writableMap.putArray(strNextKey, (WritableArray) writableMap2.getArray(strNextKey));
                    }
                    z4 = z3;
                    z5 = z;
                    z6 = z2;
                }
            } else {
                String key = entry.getKey();
                Object objValue = pvgVarO.value();
                if (this.mNodesManager.q.contains(key)) {
                    b(this.d, key, objValue);
                    z4 = true;
                } else {
                    b(writableMapCreateMap2, key, objValue);
                    z5 = true;
                }
            }
        }
        int i2 = this.c;
        if (i2 != -1) {
            if (z4) {
                this.f35661b.synchronouslyUpdateViewOnUIThread(i2, this.e);
            }
            if (z5) {
                this.mNodesManager.n(this.c, writableMapCreateMap2);
            }
            if (z6) {
                WritableMap writableMapCreateMap3 = Arguments.createMap();
                writableMapCreateMap3.putInt(CloudContract.COL_VIEW_TAG, this.c);
                writableMapCreateMap3.putMap("props", writableMapCreateMap);
                this.mNodesManager.x("onReanimatedPropsChange", writableMapCreateMap3);
            }
        }
        return pvg.ZERO;
    }
}
