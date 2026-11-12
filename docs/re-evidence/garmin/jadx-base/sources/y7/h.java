package y7;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.z;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import u7.k1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ly7/h;", "Lu7/k1;", "Ly7/g;", "<init>", "()V", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h implements k1<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f194638a = new h();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f194639a;

        static {
            int[] iArr = new int[x7.g.b.values().length];
            try {
                iArr[x7.g.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x7.g.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x7.g.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x7.g.b.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x7.g.b.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[x7.g.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[x7.g.b.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[x7.g.b.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[x7.g.b.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f194639a = iArr;
        }
    }

    private h() {
    }

    @Override // u7.k1
    public final g getDefaultValue() {
        return new b(null, true, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u7.k1
    public final Object readFrom(InputStream inputStream, t13.d<? super g> dVar) throws CorruptionException {
        Object obj;
        x7.c.f189360a.getClass();
        try {
            x7.e eVarS = x7.e.s((FileInputStream) inputStream);
            b bVar = new b(null, false, 1, null);
            g.b[] bVarArr = (g.b[]) Arrays.copyOf(new g.b[0], 0);
            bVar.d();
            for (g.b bVar2 : bVarArr) {
                bVar.f(bVar2.f194636a, bVar2.f194637b);
            }
            Map<String, x7.g> mapQ = eVarS.q();
            mapQ.getClass();
            for (Map.Entry<String, x7.g> entry : mapQ.entrySet()) {
                String key = entry.getKey();
                x7.g value = entry.getValue();
                key.getClass();
                value.getClass();
                f194638a.getClass();
                x7.g.b bVarG = value.G();
                switch (bVarG == null ? -1 : a.f194639a[bVarG.ordinal()]) {
                    case -1:
                        throw new CorruptionException("Value case is null.", null, 2, null);
                    case 0:
                    default:
                        u0.r();
                        return null;
                    case 1:
                        bVar.f(new g.a<>(key), Boolean.valueOf(value.x()));
                        break;
                    case 2:
                        bVar.f(new g.a<>(key), Float.valueOf(value.B()));
                        break;
                    case 3:
                        bVar.f(new g.a<>(key), Double.valueOf(value.A()));
                        break;
                    case 4:
                        bVar.f(new g.a<>(key), Integer.valueOf(value.C()));
                        break;
                    case 5:
                        bVar.f(new g.a<>(key), Long.valueOf(value.D()));
                        break;
                    case 6:
                        g.a<?> aVar = new g.a<>(key);
                        Object objE = value.E();
                        objE.getClass();
                        bVar.f(aVar, objE);
                        break;
                    case 7:
                        g.a<?> aVar2 = new g.a<>(key);
                        z.d dVarR = value.F().r();
                        dVarR.getClass();
                        bVar.f(aVar2, h0.g1(dVarR));
                        break;
                    case 8:
                        g.a<?> aVar3 = new g.a<>(key);
                        androidx.datastore.preferences.protobuf.h hVarY = value.y();
                        int size = hVarY.size();
                        if (size == 0) {
                            obj = z.f6937b;
                        } else {
                            byte[] bArr = new byte[size];
                            hVarY.d(size, bArr);
                            obj = bArr;
                        }
                        obj.getClass();
                        bVar.f(aVar3, obj);
                        break;
                    case 9:
                        throw new CorruptionException("Value not set.", null, 2, null);
                }
            }
            return new b(new LinkedHashMap(bVar.a()), true);
        } catch (InvalidProtocolBufferException e4) {
            throw new CorruptionException("Unable to parse preferences proto.", e4);
        }
    }

    @Override // u7.k1
    public final Object writeTo(g gVar, OutputStream outputStream, t13.d dVar) throws IOException {
        x7.g gVarE;
        Map<g.a<?>, Object> mapA = gVar.a();
        x7.e.a aVarR = x7.e.r();
        for (Map.Entry<g.a<?>, Object> entry : mapA.entrySet()) {
            g.a<?> key = entry.getKey();
            Object value = entry.getValue();
            String str = key.f194635a;
            if (value instanceof Boolean) {
                x7.g.a aVarH = x7.g.H();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                aVarH.g();
                x7.g.u((x7.g) aVarH.f6912b, zBooleanValue);
                gVarE = aVarH.e();
            } else if (value instanceof Float) {
                x7.g.a aVarH2 = x7.g.H();
                float fFloatValue = ((Number) value).floatValue();
                aVarH2.g();
                x7.g.v((x7.g) aVarH2.f6912b, fFloatValue);
                gVarE = aVarH2.e();
            } else if (value instanceof Double) {
                x7.g.a aVarH3 = x7.g.H();
                double dDoubleValue = ((Number) value).doubleValue();
                aVarH3.g();
                x7.g.r((x7.g) aVarH3.f6912b, dDoubleValue);
                gVarE = aVarH3.e();
            } else if (value instanceof Integer) {
                x7.g.a aVarH4 = x7.g.H();
                int iIntValue = ((Number) value).intValue();
                aVarH4.g();
                x7.g.w((x7.g) aVarH4.f6912b, iIntValue);
                gVarE = aVarH4.e();
            } else if (value instanceof Long) {
                x7.g.a aVarH5 = x7.g.H();
                long jLongValue = ((Number) value).longValue();
                aVarH5.g();
                x7.g.o((x7.g) aVarH5.f6912b, jLongValue);
                gVarE = aVarH5.e();
            } else if (value instanceof String) {
                x7.g.a aVarH6 = x7.g.H();
                aVarH6.g();
                x7.g.p((x7.g) aVarH6.f6912b, (String) value);
                gVarE = aVarH6.e();
            } else if (value instanceof Set) {
                x7.g.a aVarH7 = x7.g.H();
                x7.f.a aVarS = x7.f.s();
                aVarS.g();
                x7.f.p((x7.f) aVarS.f6912b, (Set) value);
                aVarH7.g();
                x7.g.q((x7.g) aVarH7.f6912b, aVarS.e());
                gVarE = aVarH7.e();
            } else {
                if (!(value instanceof byte[])) {
                    vb.h.z("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return null;
                }
                x7.g.a aVarH8 = x7.g.H();
                byte[] bArr = (byte[]) value;
                androidx.datastore.preferences.protobuf.h.C0094h c0094hC = androidx.datastore.preferences.protobuf.h.c(0, bArr.length, bArr);
                aVarH8.g();
                x7.g.s((x7.g) aVarH8.f6912b, c0094hC);
                gVarE = aVarH8.e();
            }
            aVarR.getClass();
            aVarR.g();
            x7.e.p((x7.e) aVarR.f6912b).put(str, gVarE);
        }
        x7.e eVarE = aVarR.e();
        int iD = eVarE.d(null);
        Logger logger = CodedOutputStream.f6654b;
        if (iD > 4096) {
            iD = 4096;
        }
        CodedOutputStream.d dVar2 = new CodedOutputStream.d(outputStream, iD);
        eVarE.b(dVar2);
        if (dVar2.f6659f > 0) {
            dVar2.L();
        }
        return Unit.INSTANCE;
    }
}
