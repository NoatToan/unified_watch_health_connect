package zh;

import ds.e0;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: zh.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3818a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f204717a;

        static {
            int[] iArr = new int[f.a.values().length];
            try {
                iArr[f.a.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.a.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.a.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.a.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f.a.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[f.a.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[f.a.BEGIN_ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f204717a = iArr;
        }
    }

    public static final Object a(f fVar) {
        f.a aVarPeek = fVar.peek();
        switch (C3818a.f204717a[aVarPeek.ordinal()]) {
            case 1:
                fVar.nextNull();
                return null;
            case 2:
                return Boolean.valueOf(fVar.nextBoolean());
            case 3:
            case 4:
                try {
                    try {
                        try {
                            return Integer.valueOf(fVar.nextInt());
                        } catch (Exception unused) {
                            return fVar.a3();
                        }
                    } catch (Exception unused2) {
                        return Long.valueOf(fVar.nextLong());
                    }
                } catch (Exception unused3) {
                    return Double.valueOf(fVar.nextDouble());
                }
            case 5:
                return fVar.nextString();
            case 6:
                fVar.y();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (fVar.hasNext()) {
                    linkedHashMap.put(fVar.nextName(), a(fVar));
                }
                fVar.A();
                return linkedHashMap;
            case 7:
                fVar.q();
                ArrayList arrayList = new ArrayList();
                while (fVar.hasNext()) {
                    arrayList.add(a(fVar));
                }
                fVar.g();
                return arrayList;
            default:
                e0.t(aVarPeek, "unknown token ");
                return null;
        }
    }
}
