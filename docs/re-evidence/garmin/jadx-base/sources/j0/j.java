package j0;

import android.util.Pair;
import androidx.camera.core.impl.b0;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.ws.WebSocketProtocol;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import v.e0;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m[] f95926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m[][] f95927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashSet<String> f95928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f95929f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Map<String, i>> f95930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteOrder f95931b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f95932a;

        static {
            int[] iArr = new int[b0.values().length];
            f95932a = iArr;
            try {
                iArr[b0.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f95932a[b0.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f95932a[b0.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Pattern f95933c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Pattern f95934d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Pattern f95935e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final ArrayList f95936f = Collections.list(new a());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f95937a = Collections.list(new C1836b(this));

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteOrder f95938b;

        public class a implements Enumeration<HashMap<String, m>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f95939a = 0;

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                return this.f95939a < j.f95927d.length;
            }

            @Override // java.util.Enumeration
            public final HashMap<String, m> nextElement() {
                HashMap<String, m> map = new HashMap<>();
                for (m mVar : j.f95927d[this.f95939a]) {
                    map.put(mVar.f95953b, mVar);
                }
                this.f95939a++;
                return map;
            }
        }

        /* JADX INFO: renamed from: j0.j$b$b, reason: collision with other inner class name */
        public class C1836b implements Enumeration<Map<String, i>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f95940a = 0;

            public C1836b(b bVar) {
            }

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                return this.f95940a < j.f95927d.length;
            }

            @Override // java.util.Enumeration
            public final Map<String, i> nextElement() {
                this.f95940a++;
                return new HashMap();
            }
        }

        public b(ByteOrder byteOrder) {
            this.f95938b = byteOrder;
        }

        public static Pair<Integer, Integer> a(String str) {
            if (str.contains(",")) {
                String[] strArrSplit = str.split(",", -1);
                Pair<Integer, Integer> pairA = a(strArrSplit[0]);
                if (((Integer) pairA.first).intValue() == 2) {
                    return pairA;
                }
                for (int i14 = 1; i14 < strArrSplit.length; i14++) {
                    Pair<Integer, Integer> pairA2 = a(strArrSplit[i14]);
                    int iIntValue = (((Integer) pairA2.first).equals(pairA.first) || ((Integer) pairA2.second).equals(pairA.first)) ? ((Integer) pairA.first).intValue() : -1;
                    int iIntValue2 = (((Integer) pairA.second).intValue() == -1 || !(((Integer) pairA2.first).equals(pairA.second) || ((Integer) pairA2.second).equals(pairA.second))) ? -1 : ((Integer) pairA.second).intValue();
                    if (iIntValue == -1 && iIntValue2 == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (iIntValue == -1) {
                        pairA = new Pair<>(Integer.valueOf(iIntValue2), -1);
                    } else if (iIntValue2 == -1) {
                        pairA = new Pair<>(Integer.valueOf(iIntValue), -1);
                    }
                }
                return pairA;
            }
            if (!str.contains("/")) {
                try {
                    try {
                        long j8 = Long.parseLong(str);
                        if (j8 < 0 || j8 > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                            return j8 < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1);
                        }
                        return new Pair<>(3, 4);
                    } catch (NumberFormatException unused) {
                        return new Pair<>(2, -1);
                    }
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            }
            String[] strArrSplit2 = str.split("/", -1);
            if (strArrSplit2.length == 2) {
                try {
                    long j14 = (long) Double.parseDouble(strArrSplit2[0]);
                    long j15 = (long) Double.parseDouble(strArrSplit2[1]);
                    if (j14 >= 0 && j15 >= 0) {
                        if (j14 <= 2147483647L && j15 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair<>(2, -1);
        }

        public final void b(String str, String str2, ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Map) it.next()).containsKey(str)) {
                    return;
                }
            }
            c(str, str2, arrayList);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x02fa A[LOOP:10: B:98:0x02f7->B:100:0x02fa, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:103:0x031d A[LOOP:11: B:102:0x031b->B:103:0x031d, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:105:0x0334  */
        /* JADX WARN: Code duplicated, block: B:106:0x035b  */
        /* JADX WARN: Code duplicated, block: B:108:0x0370  */
        /* JADX WARN: Code duplicated, block: B:113:0x0392 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:18:0x0056  */
        /* JADX WARN: Code duplicated, block: B:30:0x00c8 A[PHI: r1
          0x00c8: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v2 java.lang.String), (r1v5 java.lang.String), (r1v10 java.lang.String) binds: [B:20:0x005b, B:22:0x0063, B:29:0x00bb, B:28:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:33:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:35:0x00de  */
        /* JADX WARN: Code duplicated, block: B:37:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:38:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:39:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:42:0x0103  */
        /* JADX WARN: Code duplicated, block: B:55:0x012c  */
        /* JADX WARN: Code duplicated, block: B:59:0x0139  */
        /* JADX WARN: Code duplicated, block: B:62:0x0144 A[LOOP:1: B:60:0x0141->B:62:0x0144, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:65:0x0168 A[LOOP:2: B:64:0x0166->B:65:0x0168, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:67:0x018d  */
        /* JADX WARN: Code duplicated, block: B:70:0x019d A[LOOP:3: B:68:0x019a->B:70:0x019d, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:73:0x01dd A[LOOP:4: B:72:0x01db->B:73:0x01dd, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:76:0x0201  */
        /* JADX WARN: Code duplicated, block: B:79:0x0212 A[LOOP:5: B:77:0x020f->B:79:0x0212, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:82:0x0237 A[LOOP:6: B:81:0x0235->B:82:0x0237, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:84:0x024c  */
        /* JADX WARN: Code duplicated, block: B:87:0x025d A[LOOP:7: B:85:0x025a->B:87:0x025d, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:90:0x029f A[LOOP:8: B:89:0x029d->B:90:0x029f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:92:0x02be  */
        /* JADX WARN: Code duplicated, block: B:95:0x02cf A[LOOP:9: B:93:0x02cc->B:95:0x02cf, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:97:0x02e9  */
        public final void c(String str, String str2, List<Map<String, i>> list) {
            int i14;
            int i15;
            int i16;
            m mVar;
            int i17;
            int i18;
            int i19;
            int i24;
            Pair<Integer, Integer> pairA;
            int i25;
            String str3;
            ByteOrder byteOrder;
            i iVar;
            int i26;
            boolean z14;
            String[] strArrSplit;
            int length;
            int[] iArr;
            int i27;
            ByteBuffer byteBufferWrap;
            int i28;
            String[] strArrSplit2;
            long[] jArr;
            int i29;
            int i30;
            String[] strArrSplit3;
            int length2;
            o[] oVarArr;
            int i34;
            o[] oVarArr2;
            ByteBuffer byteBufferWrap2;
            int i35;
            String[] strArrSplit4;
            int length3;
            int[] iArr2;
            int i36;
            ByteBuffer byteBufferWrap3;
            int i37;
            String[] strArrSplit5;
            int length4;
            o[] oVarArr3;
            int i38;
            ByteBuffer byteBufferWrap4;
            int i39;
            String[] strArrSplit6;
            int length5;
            double[] dArr;
            int i44;
            ByteBuffer byteBufferWrap5;
            int i45;
            String str4 = str;
            String strReplaceAll = str2;
            if (("DateTime".equals(str4) || "DateTimeOriginal".equals(str4) || "DateTimeDigitized".equals(str4)) && strReplaceAll != null) {
                boolean zFind = f95934d.matcher(strReplaceAll).find();
                boolean zFind2 = f95935e.matcher(strReplaceAll).find();
                if (strReplaceAll.length() == 19 && (zFind || zFind2)) {
                    if (zFind2) {
                        strReplaceAll = strReplaceAll.replaceAll("-", ":");
                    }
                    if ("ISOSpeedRatings".equals(str4)) {
                        str4 = "PhotographicSensitivity";
                    }
                    i14 = 2;
                    i15 = 1;
                    if (strReplaceAll != null || !j.f95928e.contains(str4)) {
                        i16 = 0;
                        while (i16 < j.f95927d.length) {
                            mVar = (m) ((HashMap) f95936f.get(i16)).get(str4);
                            if (mVar != null) {
                                i19 = mVar.f95955d;
                                i24 = mVar.f95954c;
                                if (strReplaceAll == null) {
                                    list.get(i16).remove(str4);
                                } else {
                                    pairA = a(strReplaceAll);
                                    i25 = -1;
                                    if (i24 != ((Integer) pairA.first).intValue() || i24 == ((Integer) pairA.second).intValue()) {
                                        i19 = i24;
                                    } else if (i19 == -1 || (i19 != ((Integer) pairA.first).intValue() && i19 != ((Integer) pairA.second).intValue())) {
                                        if (i24 == i15 || i24 == 7 || i24 == i14) {
                                            i19 = i24;
                                        }
                                        i17 = i14;
                                        i18 = i15;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                    }
                                    str3 = "/";
                                    byteOrder = this.f95938b;
                                    switch (i19) {
                                        case 1:
                                            i17 = i14;
                                            int i46 = i15;
                                            Map<String, i> map = list.get(i16);
                                            Charset charset = i.f95920d;
                                            i18 = i46;
                                            if (strReplaceAll.length() == i18 || strReplaceAll.charAt(0) < '0' || strReplaceAll.charAt(0) > '1') {
                                                byte[] bytes = strReplaceAll.getBytes(i.f95920d);
                                                iVar = new i(i18, bytes.length, bytes);
                                            } else {
                                                byte[] bArr = new byte[i18];
                                                bArr[0] = (byte) (strReplaceAll.charAt(0) - '0');
                                                iVar = new i(i18, i18, bArr);
                                            }
                                            map.put(str4, iVar);
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                        case 2:
                                        case 7:
                                            int i47 = i15;
                                            Map<String, i> map2 = list.get(i16);
                                            Charset charset2 = i.f95920d;
                                            byte[] bytes2 = strReplaceAll.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(i.f95920d);
                                            i17 = 2;
                                            map2.put(str4, new i(2, bytes2.length, bytes2));
                                            i18 = i47;
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                        case 3:
                                            i26 = i15;
                                            z14 = false;
                                            strArrSplit = strReplaceAll.split(",", -1);
                                            length = strArrSplit.length;
                                            iArr = new int[length];
                                            for (i27 = 0; i27 < strArrSplit.length; i27++) {
                                                iArr[i27] = Integer.parseInt(strArrSplit[i27]);
                                            }
                                            Map<String, i> map3 = list.get(i16);
                                            byteBufferWrap = ByteBuffer.wrap(new byte[i.f95922f[3] * length]);
                                            byteBufferWrap.order(byteOrder);
                                            for (i28 = 0; i28 < length; i28++) {
                                                byteBufferWrap.putShort((short) iArr[i28]);
                                            }
                                            map3.put(str4, new i(3, length, byteBufferWrap.array()));
                                            break;
                                        case 4:
                                            i26 = i15;
                                            z14 = false;
                                            strArrSplit2 = strReplaceAll.split(",", -1);
                                            jArr = new long[strArrSplit2.length];
                                            for (i29 = 0; i29 < strArrSplit2.length; i29++) {
                                                jArr[i29] = Long.parseLong(strArrSplit2[i29]);
                                            }
                                            list.get(i16).put(str4, i.b(jArr, byteOrder));
                                            break;
                                        case 5:
                                            i26 = i15;
                                            i30 = -1;
                                            z14 = false;
                                            strArrSplit3 = strReplaceAll.split(",", -1);
                                            length2 = strArrSplit3.length;
                                            oVarArr = new o[length2];
                                            i34 = 0;
                                            while (i34 < strArrSplit3.length) {
                                                String[] strArrSplit7 = strArrSplit3[i34].split(str3, i30);
                                                o[] oVarArr4 = oVarArr;
                                                oVarArr4[i34] = new o((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[i26]));
                                                i34++;
                                                str3 = str3;
                                                oVarArr = oVarArr4;
                                                i30 = -1;
                                            }
                                            oVarArr2 = oVarArr;
                                            Map<String, i> map4 = list.get(i16);
                                            byteBufferWrap2 = ByteBuffer.wrap(new byte[i.f95922f[5] * length2]);
                                            byteBufferWrap2.order(byteOrder);
                                            for (i35 = 0; i35 < length2; i35++) {
                                                o oVar = oVarArr2[i35];
                                                byteBufferWrap2.putInt((int) oVar.f95956a);
                                                byteBufferWrap2.putInt((int) oVar.f95957b);
                                            }
                                            map4.put(str4, new i(5, length2, byteBufferWrap2.array()));
                                            break;
                                        case 6:
                                        case 8:
                                        case 11:
                                        default:
                                            i17 = i14;
                                            i18 = i15;
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                        case 9:
                                            i26 = i15;
                                            z14 = false;
                                            strArrSplit4 = strReplaceAll.split(",", -1);
                                            length3 = strArrSplit4.length;
                                            iArr2 = new int[length3];
                                            for (i36 = 0; i36 < strArrSplit4.length; i36++) {
                                                iArr2[i36] = Integer.parseInt(strArrSplit4[i36]);
                                            }
                                            Map<String, i> map5 = list.get(i16);
                                            byteBufferWrap3 = ByteBuffer.wrap(new byte[i.f95922f[9] * length3]);
                                            byteBufferWrap3.order(byteOrder);
                                            for (i37 = 0; i37 < length3; i37++) {
                                                byteBufferWrap3.putInt(iArr2[i37]);
                                            }
                                            map5.put(str4, new i(9, length3, byteBufferWrap3.array()));
                                            break;
                                        case 10:
                                            i26 = i15;
                                            z14 = false;
                                            strArrSplit5 = strReplaceAll.split(",", -1);
                                            length4 = strArrSplit5.length;
                                            oVarArr3 = new o[length4];
                                            i38 = 0;
                                            while (i38 < strArrSplit5.length) {
                                                String[] strArrSplit8 = strArrSplit5[i38].split("/", i25);
                                                int i48 = i38;
                                                oVarArr3[i48] = new o((long) Double.parseDouble(strArrSplit8[0]), (long) Double.parseDouble(strArrSplit8[i26]));
                                                i38 = i48 + 1;
                                                strArrSplit5 = strArrSplit5;
                                                i25 = -1;
                                            }
                                            Map<String, i> map6 = list.get(i16);
                                            byteBufferWrap4 = ByteBuffer.wrap(new byte[i.f95922f[10] * length4]);
                                            byteBufferWrap4.order(byteOrder);
                                            for (i39 = 0; i39 < length4; i39++) {
                                                o oVar2 = oVarArr3[i39];
                                                byteBufferWrap4.putInt((int) oVar2.f95956a);
                                                byteBufferWrap4.putInt((int) oVar2.f95957b);
                                            }
                                            map6.put(str4, new i(10, length4, byteBufferWrap4.array()));
                                            break;
                                        case 12:
                                            strArrSplit6 = strReplaceAll.split(",", -1);
                                            length5 = strArrSplit6.length;
                                            dArr = new double[length5];
                                            for (i44 = 0; i44 < strArrSplit6.length; i44++) {
                                                dArr[i44] = Double.parseDouble(strArrSplit6[i44]);
                                            }
                                            Map<String, i> map7 = list.get(i16);
                                            byteBufferWrap5 = ByteBuffer.wrap(new byte[i.f95922f[12] * length5]);
                                            byteBufferWrap5.order(byteOrder);
                                            i45 = 0;
                                            while (i45 < length5) {
                                                byteBufferWrap5.putDouble(dArr[i45]);
                                                i45++;
                                                i15 = i15;
                                            }
                                            map7.put(str4, new i(12, length5, byteBufferWrap5.array()));
                                            i18 = i15;
                                            i17 = i14;
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                    }
                                    i18 = i26;
                                    i17 = 2;
                                }
                                i17 = i14;
                                i18 = i15;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                i17 = i14;
                                i18 = i15;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            }
                            i16++;
                            i15 = i18;
                            i14 = i17;
                        }
                    } else if (str4.equals("GPSTimeStamp")) {
                        Matcher matcher = f95933c.matcher(strReplaceAll);
                        if (matcher.find()) {
                            StringBuilder sb3 = new StringBuilder();
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            sb3.append(Integer.parseInt(strGroup));
                            sb3.append("/1,");
                            String strGroup2 = matcher.group(2);
                            strGroup2.getClass();
                            sb3.append(Integer.parseInt(strGroup2));
                            sb3.append("/1,");
                            String strGroup3 = matcher.group(3);
                            strGroup3.getClass();
                            sb3.append(Integer.parseInt(strGroup3));
                            sb3.append("/1");
                            strReplaceAll = sb3.toString();
                            i16 = 0;
                            while (i16 < j.f95927d.length) {
                                mVar = (m) ((HashMap) f95936f.get(i16)).get(str4);
                                if (mVar != null) {
                                    i19 = mVar.f95955d;
                                    i24 = mVar.f95954c;
                                    if (strReplaceAll == null) {
                                        list.get(i16).remove(str4);
                                    } else {
                                        pairA = a(strReplaceAll);
                                        i25 = -1;
                                        if (i24 != ((Integer) pairA.first).intValue()) {
                                            i19 = i24;
                                        } else {
                                            i19 = i24;
                                        }
                                        str3 = "/";
                                        byteOrder = this.f95938b;
                                        switch (i19) {
                                            case 1:
                                                i17 = i14;
                                                int i49 = i15;
                                                Map<String, i> map8 = list.get(i16);
                                                Charset charset3 = i.f95920d;
                                                i18 = i49;
                                                if (strReplaceAll.length() == i18) {
                                                    break;
                                                }
                                                byte[] bytes3 = strReplaceAll.getBytes(i.f95920d);
                                                iVar = new i(i18, bytes3.length, bytes3);
                                                map8.put(str4, iVar);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                            case 2:
                                            case 7:
                                                int i410 = i15;
                                                Map<String, i> map9 = list.get(i16);
                                                Charset charset4 = i.f95920d;
                                                byte[] bytes4 = strReplaceAll.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(i.f95920d);
                                                i17 = 2;
                                                map9.put(str4, new i(2, bytes4.length, bytes4));
                                                i18 = i410;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                            case 3:
                                                i26 = i15;
                                                z14 = false;
                                                strArrSplit = strReplaceAll.split(",", -1);
                                                length = strArrSplit.length;
                                                iArr = new int[length];
                                                while (i27 < strArrSplit.length) {
                                                    iArr[i27] = Integer.parseInt(strArrSplit[i27]);
                                                }
                                                Map<String, i> map10 = list.get(i16);
                                                byteBufferWrap = ByteBuffer.wrap(new byte[i.f95922f[3] * length]);
                                                byteBufferWrap.order(byteOrder);
                                                while (i28 < length) {
                                                    byteBufferWrap.putShort((short) iArr[i28]);
                                                }
                                                map10.put(str4, new i(3, length, byteBufferWrap.array()));
                                                break;
                                            case 4:
                                                i26 = i15;
                                                z14 = false;
                                                strArrSplit2 = strReplaceAll.split(",", -1);
                                                jArr = new long[strArrSplit2.length];
                                                while (i29 < strArrSplit2.length) {
                                                    jArr[i29] = Long.parseLong(strArrSplit2[i29]);
                                                }
                                                list.get(i16).put(str4, i.b(jArr, byteOrder));
                                                break;
                                            case 5:
                                                i26 = i15;
                                                i30 = -1;
                                                z14 = false;
                                                strArrSplit3 = strReplaceAll.split(",", -1);
                                                length2 = strArrSplit3.length;
                                                oVarArr = new o[length2];
                                                i34 = 0;
                                                while (i34 < strArrSplit3.length) {
                                                    String[] strArrSplit9 = strArrSplit3[i34].split(str3, i30);
                                                    o[] oVarArr5 = oVarArr;
                                                    oVarArr5[i34] = new o((long) Double.parseDouble(strArrSplit9[0]), (long) Double.parseDouble(strArrSplit9[i26]));
                                                    i34++;
                                                    str3 = str3;
                                                    oVarArr = oVarArr5;
                                                    i30 = -1;
                                                }
                                                oVarArr2 = oVarArr;
                                                Map<String, i> map11 = list.get(i16);
                                                byteBufferWrap2 = ByteBuffer.wrap(new byte[i.f95922f[5] * length2]);
                                                byteBufferWrap2.order(byteOrder);
                                                while (i35 < length2) {
                                                    o oVar3 = oVarArr2[i35];
                                                    byteBufferWrap2.putInt((int) oVar3.f95956a);
                                                    byteBufferWrap2.putInt((int) oVar3.f95957b);
                                                }
                                                map11.put(str4, new i(5, length2, byteBufferWrap2.array()));
                                                break;
                                            case 6:
                                            case 8:
                                            case 11:
                                            default:
                                                i17 = i14;
                                                i18 = i15;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                            case 9:
                                                i26 = i15;
                                                z14 = false;
                                                strArrSplit4 = strReplaceAll.split(",", -1);
                                                length3 = strArrSplit4.length;
                                                iArr2 = new int[length3];
                                                while (i36 < strArrSplit4.length) {
                                                    iArr2[i36] = Integer.parseInt(strArrSplit4[i36]);
                                                }
                                                Map<String, i> map12 = list.get(i16);
                                                byteBufferWrap3 = ByteBuffer.wrap(new byte[i.f95922f[9] * length3]);
                                                byteBufferWrap3.order(byteOrder);
                                                while (i37 < length3) {
                                                    byteBufferWrap3.putInt(iArr2[i37]);
                                                }
                                                map12.put(str4, new i(9, length3, byteBufferWrap3.array()));
                                                break;
                                            case 10:
                                                i26 = i15;
                                                z14 = false;
                                                strArrSplit5 = strReplaceAll.split(",", -1);
                                                length4 = strArrSplit5.length;
                                                oVarArr3 = new o[length4];
                                                i38 = 0;
                                                while (i38 < strArrSplit5.length) {
                                                    String[] strArrSplit10 = strArrSplit5[i38].split("/", i25);
                                                    int i411 = i38;
                                                    oVarArr3[i411] = new o((long) Double.parseDouble(strArrSplit10[0]), (long) Double.parseDouble(strArrSplit10[i26]));
                                                    i38 = i411 + 1;
                                                    strArrSplit5 = strArrSplit5;
                                                    i25 = -1;
                                                }
                                                Map<String, i> map13 = list.get(i16);
                                                byteBufferWrap4 = ByteBuffer.wrap(new byte[i.f95922f[10] * length4]);
                                                byteBufferWrap4.order(byteOrder);
                                                while (i39 < length4) {
                                                    o oVar4 = oVarArr3[i39];
                                                    byteBufferWrap4.putInt((int) oVar4.f95956a);
                                                    byteBufferWrap4.putInt((int) oVar4.f95957b);
                                                }
                                                map13.put(str4, new i(10, length4, byteBufferWrap4.array()));
                                                break;
                                            case 12:
                                                strArrSplit6 = strReplaceAll.split(",", -1);
                                                length5 = strArrSplit6.length;
                                                dArr = new double[length5];
                                                while (i44 < strArrSplit6.length) {
                                                    dArr[i44] = Double.parseDouble(strArrSplit6[i44]);
                                                }
                                                Map<String, i> map14 = list.get(i16);
                                                byteBufferWrap5 = ByteBuffer.wrap(new byte[i.f95922f[12] * length5]);
                                                byteBufferWrap5.order(byteOrder);
                                                i45 = 0;
                                                while (i45 < length5) {
                                                    byteBufferWrap5.putDouble(dArr[i45]);
                                                    i45++;
                                                    i15 = i15;
                                                }
                                                map14.put(str4, new i(12, length5, byteBufferWrap5.array()));
                                                i18 = i15;
                                                i17 = i14;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                        }
                                        i18 = i26;
                                        i17 = 2;
                                    }
                                    i17 = i14;
                                    i18 = i15;
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                } else {
                                    i17 = i14;
                                    i18 = i15;
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                }
                                i16++;
                                i15 = i18;
                                i14 = i17;
                            }
                        }
                    } else {
                        try {
                            strReplaceAll = new o(Double.parseDouble(strReplaceAll)).toString();
                            i16 = 0;
                            while (i16 < j.f95927d.length) {
                                mVar = (m) ((HashMap) f95936f.get(i16)).get(str4);
                                if (mVar != null) {
                                    i19 = mVar.f95955d;
                                    i24 = mVar.f95954c;
                                    if (strReplaceAll == null) {
                                        list.get(i16).remove(str4);
                                    } else {
                                        pairA = a(strReplaceAll);
                                        i25 = -1;
                                        if (i24 != ((Integer) pairA.first).intValue()) {
                                            i19 = i24;
                                        } else {
                                            i19 = i24;
                                        }
                                        str3 = "/";
                                        byteOrder = this.f95938b;
                                        switch (i19) {
                                            case 1:
                                                i17 = i14;
                                                int i412 = i15;
                                                Map<String, i> map15 = list.get(i16);
                                                Charset charset5 = i.f95920d;
                                                i18 = i412;
                                                if (strReplaceAll.length() == i18) {
                                                    break;
                                                }
                                                byte[] bytes5 = strReplaceAll.getBytes(i.f95920d);
                                                iVar = new i(i18, bytes5.length, bytes5);
                                                map15.put(str4, iVar);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                            case 2:
                                            case 7:
                                                int i413 = i15;
                                                Map<String, i> map16 = list.get(i16);
                                                Charset charset6 = i.f95920d;
                                                byte[] bytes6 = strReplaceAll.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(i.f95920d);
                                                i17 = 2;
                                                map16.put(str4, new i(2, bytes6.length, bytes6));
                                                i18 = i413;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                            case 3:
                                                i26 = i15;
                                                z14 = false;
                                                strArrSplit = strReplaceAll.split(",", -1);
                                                length = strArrSplit.length;
                                                iArr = new int[length];
                                                while (i27 < strArrSplit.length) {
                                                    iArr[i27] = Integer.parseInt(strArrSplit[i27]);
                                                }
                                                Map<String, i> map17 = list.get(i16);
                                                byteBufferWrap = ByteBuffer.wrap(new byte[i.f95922f[3] * length]);
                                                byteBufferWrap.order(byteOrder);
                                                while (i28 < length) {
                                                    byteBufferWrap.putShort((short) iArr[i28]);
                                                }
                                                map17.put(str4, new i(3, length, byteBufferWrap.array()));
                                                break;
                                            case 4:
                                                i26 = i15;
                                                z14 = false;
                                                strArrSplit2 = strReplaceAll.split(",", -1);
                                                jArr = new long[strArrSplit2.length];
                                                while (i29 < strArrSplit2.length) {
                                                    jArr[i29] = Long.parseLong(strArrSplit2[i29]);
                                                }
                                                list.get(i16).put(str4, i.b(jArr, byteOrder));
                                                break;
                                            case 5:
                                                i26 = i15;
                                                i30 = -1;
                                                z14 = false;
                                                strArrSplit3 = strReplaceAll.split(",", -1);
                                                length2 = strArrSplit3.length;
                                                oVarArr = new o[length2];
                                                i34 = 0;
                                                while (i34 < strArrSplit3.length) {
                                                    String[] strArrSplit11 = strArrSplit3[i34].split(str3, i30);
                                                    o[] oVarArr6 = oVarArr;
                                                    oVarArr6[i34] = new o((long) Double.parseDouble(strArrSplit11[0]), (long) Double.parseDouble(strArrSplit11[i26]));
                                                    i34++;
                                                    str3 = str3;
                                                    oVarArr = oVarArr6;
                                                    i30 = -1;
                                                }
                                                oVarArr2 = oVarArr;
                                                Map<String, i> map18 = list.get(i16);
                                                byteBufferWrap2 = ByteBuffer.wrap(new byte[i.f95922f[5] * length2]);
                                                byteBufferWrap2.order(byteOrder);
                                                while (i35 < length2) {
                                                    o oVar5 = oVarArr2[i35];
                                                    byteBufferWrap2.putInt((int) oVar5.f95956a);
                                                    byteBufferWrap2.putInt((int) oVar5.f95957b);
                                                }
                                                map18.put(str4, new i(5, length2, byteBufferWrap2.array()));
                                                break;
                                            case 6:
                                            case 8:
                                            case 11:
                                            default:
                                                i17 = i14;
                                                i18 = i15;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                            case 9:
                                                i26 = i15;
                                                z14 = false;
                                                strArrSplit4 = strReplaceAll.split(",", -1);
                                                length3 = strArrSplit4.length;
                                                iArr2 = new int[length3];
                                                while (i36 < strArrSplit4.length) {
                                                    iArr2[i36] = Integer.parseInt(strArrSplit4[i36]);
                                                }
                                                Map<String, i> map19 = list.get(i16);
                                                byteBufferWrap3 = ByteBuffer.wrap(new byte[i.f95922f[9] * length3]);
                                                byteBufferWrap3.order(byteOrder);
                                                while (i37 < length3) {
                                                    byteBufferWrap3.putInt(iArr2[i37]);
                                                }
                                                map19.put(str4, new i(9, length3, byteBufferWrap3.array()));
                                                break;
                                            case 10:
                                                i26 = i15;
                                                z14 = false;
                                                strArrSplit5 = strReplaceAll.split(",", -1);
                                                length4 = strArrSplit5.length;
                                                oVarArr3 = new o[length4];
                                                i38 = 0;
                                                while (i38 < strArrSplit5.length) {
                                                    String[] strArrSplit12 = strArrSplit5[i38].split("/", i25);
                                                    int i414 = i38;
                                                    oVarArr3[i414] = new o((long) Double.parseDouble(strArrSplit12[0]), (long) Double.parseDouble(strArrSplit12[i26]));
                                                    i38 = i414 + 1;
                                                    strArrSplit5 = strArrSplit5;
                                                    i25 = -1;
                                                }
                                                Map<String, i> map110 = list.get(i16);
                                                byteBufferWrap4 = ByteBuffer.wrap(new byte[i.f95922f[10] * length4]);
                                                byteBufferWrap4.order(byteOrder);
                                                while (i39 < length4) {
                                                    o oVar6 = oVarArr3[i39];
                                                    byteBufferWrap4.putInt((int) oVar6.f95956a);
                                                    byteBufferWrap4.putInt((int) oVar6.f95957b);
                                                }
                                                map110.put(str4, new i(10, length4, byteBufferWrap4.array()));
                                                break;
                                            case 12:
                                                strArrSplit6 = strReplaceAll.split(",", -1);
                                                length5 = strArrSplit6.length;
                                                dArr = new double[length5];
                                                while (i44 < strArrSplit6.length) {
                                                    dArr[i44] = Double.parseDouble(strArrSplit6[i44]);
                                                }
                                                Map<String, i> map111 = list.get(i16);
                                                byteBufferWrap5 = ByteBuffer.wrap(new byte[i.f95922f[12] * length5]);
                                                byteBufferWrap5.order(byteOrder);
                                                i45 = 0;
                                                while (i45 < length5) {
                                                    byteBufferWrap5.putDouble(dArr[i45]);
                                                    i45++;
                                                    i15 = i15;
                                                }
                                                map111.put(str4, new i(12, length5, byteBufferWrap5.array()));
                                                i18 = i15;
                                                i17 = i14;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                        }
                                        i18 = i26;
                                        i17 = 2;
                                    }
                                    i17 = i14;
                                    i18 = i15;
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                } else {
                                    i17 = i14;
                                    i18 = i15;
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                }
                                i16++;
                                i15 = i18;
                                i14 = i17;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            } else {
                if ("ISOSpeedRatings".equals(str4)) {
                    str4 = "PhotographicSensitivity";
                }
                i14 = 2;
                i15 = 1;
                if (strReplaceAll != null) {
                    i16 = 0;
                    while (i16 < j.f95927d.length) {
                        mVar = (m) ((HashMap) f95936f.get(i16)).get(str4);
                        if (mVar != null) {
                            i19 = mVar.f95955d;
                            i24 = mVar.f95954c;
                            if (strReplaceAll == null) {
                                list.get(i16).remove(str4);
                            } else {
                                pairA = a(strReplaceAll);
                                i25 = -1;
                                if (i24 != ((Integer) pairA.first).intValue()) {
                                    i19 = i24;
                                } else {
                                    i19 = i24;
                                }
                                str3 = "/";
                                byteOrder = this.f95938b;
                                switch (i19) {
                                    case 1:
                                        i17 = i14;
                                        int i415 = i15;
                                        Map<String, i> map112 = list.get(i16);
                                        Charset charset7 = i.f95920d;
                                        i18 = i415;
                                        if (strReplaceAll.length() == i18) {
                                            break;
                                        }
                                        byte[] bytes7 = strReplaceAll.getBytes(i.f95920d);
                                        iVar = new i(i18, bytes7.length, bytes7);
                                        map112.put(str4, iVar);
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                    case 2:
                                    case 7:
                                        int i416 = i15;
                                        Map<String, i> map113 = list.get(i16);
                                        Charset charset8 = i.f95920d;
                                        byte[] bytes8 = strReplaceAll.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(i.f95920d);
                                        i17 = 2;
                                        map113.put(str4, new i(2, bytes8.length, bytes8));
                                        i18 = i416;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                    case 3:
                                        i26 = i15;
                                        z14 = false;
                                        strArrSplit = strReplaceAll.split(",", -1);
                                        length = strArrSplit.length;
                                        iArr = new int[length];
                                        while (i27 < strArrSplit.length) {
                                            iArr[i27] = Integer.parseInt(strArrSplit[i27]);
                                        }
                                        Map<String, i> map114 = list.get(i16);
                                        byteBufferWrap = ByteBuffer.wrap(new byte[i.f95922f[3] * length]);
                                        byteBufferWrap.order(byteOrder);
                                        while (i28 < length) {
                                            byteBufferWrap.putShort((short) iArr[i28]);
                                        }
                                        map114.put(str4, new i(3, length, byteBufferWrap.array()));
                                        break;
                                    case 4:
                                        i26 = i15;
                                        z14 = false;
                                        strArrSplit2 = strReplaceAll.split(",", -1);
                                        jArr = new long[strArrSplit2.length];
                                        while (i29 < strArrSplit2.length) {
                                            jArr[i29] = Long.parseLong(strArrSplit2[i29]);
                                        }
                                        list.get(i16).put(str4, i.b(jArr, byteOrder));
                                        break;
                                    case 5:
                                        i26 = i15;
                                        i30 = -1;
                                        z14 = false;
                                        strArrSplit3 = strReplaceAll.split(",", -1);
                                        length2 = strArrSplit3.length;
                                        oVarArr = new o[length2];
                                        i34 = 0;
                                        while (i34 < strArrSplit3.length) {
                                            String[] strArrSplit13 = strArrSplit3[i34].split(str3, i30);
                                            o[] oVarArr7 = oVarArr;
                                            oVarArr7[i34] = new o((long) Double.parseDouble(strArrSplit13[0]), (long) Double.parseDouble(strArrSplit13[i26]));
                                            i34++;
                                            str3 = str3;
                                            oVarArr = oVarArr7;
                                            i30 = -1;
                                        }
                                        oVarArr2 = oVarArr;
                                        Map<String, i> map115 = list.get(i16);
                                        byteBufferWrap2 = ByteBuffer.wrap(new byte[i.f95922f[5] * length2]);
                                        byteBufferWrap2.order(byteOrder);
                                        while (i35 < length2) {
                                            o oVar7 = oVarArr2[i35];
                                            byteBufferWrap2.putInt((int) oVar7.f95956a);
                                            byteBufferWrap2.putInt((int) oVar7.f95957b);
                                        }
                                        map115.put(str4, new i(5, length2, byteBufferWrap2.array()));
                                        break;
                                    case 6:
                                    case 8:
                                    case 11:
                                    default:
                                        i17 = i14;
                                        i18 = i15;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                    case 9:
                                        i26 = i15;
                                        z14 = false;
                                        strArrSplit4 = strReplaceAll.split(",", -1);
                                        length3 = strArrSplit4.length;
                                        iArr2 = new int[length3];
                                        while (i36 < strArrSplit4.length) {
                                            iArr2[i36] = Integer.parseInt(strArrSplit4[i36]);
                                        }
                                        Map<String, i> map116 = list.get(i16);
                                        byteBufferWrap3 = ByteBuffer.wrap(new byte[i.f95922f[9] * length3]);
                                        byteBufferWrap3.order(byteOrder);
                                        while (i37 < length3) {
                                            byteBufferWrap3.putInt(iArr2[i37]);
                                        }
                                        map116.put(str4, new i(9, length3, byteBufferWrap3.array()));
                                        break;
                                    case 10:
                                        i26 = i15;
                                        z14 = false;
                                        strArrSplit5 = strReplaceAll.split(",", -1);
                                        length4 = strArrSplit5.length;
                                        oVarArr3 = new o[length4];
                                        i38 = 0;
                                        while (i38 < strArrSplit5.length) {
                                            String[] strArrSplit14 = strArrSplit5[i38].split("/", i25);
                                            int i417 = i38;
                                            oVarArr3[i417] = new o((long) Double.parseDouble(strArrSplit14[0]), (long) Double.parseDouble(strArrSplit14[i26]));
                                            i38 = i417 + 1;
                                            strArrSplit5 = strArrSplit5;
                                            i25 = -1;
                                        }
                                        Map<String, i> map117 = list.get(i16);
                                        byteBufferWrap4 = ByteBuffer.wrap(new byte[i.f95922f[10] * length4]);
                                        byteBufferWrap4.order(byteOrder);
                                        while (i39 < length4) {
                                            o oVar8 = oVarArr3[i39];
                                            byteBufferWrap4.putInt((int) oVar8.f95956a);
                                            byteBufferWrap4.putInt((int) oVar8.f95957b);
                                        }
                                        map117.put(str4, new i(10, length4, byteBufferWrap4.array()));
                                        break;
                                    case 12:
                                        strArrSplit6 = strReplaceAll.split(",", -1);
                                        length5 = strArrSplit6.length;
                                        dArr = new double[length5];
                                        while (i44 < strArrSplit6.length) {
                                            dArr[i44] = Double.parseDouble(strArrSplit6[i44]);
                                        }
                                        Map<String, i> map118 = list.get(i16);
                                        byteBufferWrap5 = ByteBuffer.wrap(new byte[i.f95922f[12] * length5]);
                                        byteBufferWrap5.order(byteOrder);
                                        i45 = 0;
                                        while (i45 < length5) {
                                            byteBufferWrap5.putDouble(dArr[i45]);
                                            i45++;
                                            i15 = i15;
                                        }
                                        map118.put(str4, new i(12, length5, byteBufferWrap5.array()));
                                        i18 = i15;
                                        i17 = i14;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                }
                                i18 = i26;
                                i17 = 2;
                            }
                            i17 = i14;
                            i18 = i15;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                        } else {
                            i17 = i14;
                            i18 = i15;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                        }
                        i16++;
                        i15 = i18;
                        i14 = i17;
                    }
                } else {
                    i16 = 0;
                    while (i16 < j.f95927d.length) {
                        mVar = (m) ((HashMap) f95936f.get(i16)).get(str4);
                        if (mVar != null) {
                            i19 = mVar.f95955d;
                            i24 = mVar.f95954c;
                            if (strReplaceAll == null) {
                                list.get(i16).remove(str4);
                            } else {
                                pairA = a(strReplaceAll);
                                i25 = -1;
                                if (i24 != ((Integer) pairA.first).intValue()) {
                                    i19 = i24;
                                } else {
                                    i19 = i24;
                                }
                                str3 = "/";
                                byteOrder = this.f95938b;
                                switch (i19) {
                                    case 1:
                                        i17 = i14;
                                        int i418 = i15;
                                        Map<String, i> map119 = list.get(i16);
                                        Charset charset9 = i.f95920d;
                                        i18 = i418;
                                        if (strReplaceAll.length() == i18) {
                                            break;
                                        }
                                        byte[] bytes9 = strReplaceAll.getBytes(i.f95920d);
                                        iVar = new i(i18, bytes9.length, bytes9);
                                        map119.put(str4, iVar);
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                    case 2:
                                    case 7:
                                        int i419 = i15;
                                        Map<String, i> map1110 = list.get(i16);
                                        Charset charset10 = i.f95920d;
                                        byte[] bytes10 = strReplaceAll.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(i.f95920d);
                                        i17 = 2;
                                        map1110.put(str4, new i(2, bytes10.length, bytes10));
                                        i18 = i419;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                    case 3:
                                        i26 = i15;
                                        z14 = false;
                                        strArrSplit = strReplaceAll.split(",", -1);
                                        length = strArrSplit.length;
                                        iArr = new int[length];
                                        while (i27 < strArrSplit.length) {
                                            iArr[i27] = Integer.parseInt(strArrSplit[i27]);
                                        }
                                        Map<String, i> map1111 = list.get(i16);
                                        byteBufferWrap = ByteBuffer.wrap(new byte[i.f95922f[3] * length]);
                                        byteBufferWrap.order(byteOrder);
                                        while (i28 < length) {
                                            byteBufferWrap.putShort((short) iArr[i28]);
                                        }
                                        map1111.put(str4, new i(3, length, byteBufferWrap.array()));
                                        break;
                                    case 4:
                                        i26 = i15;
                                        z14 = false;
                                        strArrSplit2 = strReplaceAll.split(",", -1);
                                        jArr = new long[strArrSplit2.length];
                                        while (i29 < strArrSplit2.length) {
                                            jArr[i29] = Long.parseLong(strArrSplit2[i29]);
                                        }
                                        list.get(i16).put(str4, i.b(jArr, byteOrder));
                                        break;
                                    case 5:
                                        i26 = i15;
                                        i30 = -1;
                                        z14 = false;
                                        strArrSplit3 = strReplaceAll.split(",", -1);
                                        length2 = strArrSplit3.length;
                                        oVarArr = new o[length2];
                                        i34 = 0;
                                        while (i34 < strArrSplit3.length) {
                                            String[] strArrSplit15 = strArrSplit3[i34].split(str3, i30);
                                            o[] oVarArr8 = oVarArr;
                                            oVarArr8[i34] = new o((long) Double.parseDouble(strArrSplit15[0]), (long) Double.parseDouble(strArrSplit15[i26]));
                                            i34++;
                                            str3 = str3;
                                            oVarArr = oVarArr8;
                                            i30 = -1;
                                        }
                                        oVarArr2 = oVarArr;
                                        Map<String, i> map1112 = list.get(i16);
                                        byteBufferWrap2 = ByteBuffer.wrap(new byte[i.f95922f[5] * length2]);
                                        byteBufferWrap2.order(byteOrder);
                                        while (i35 < length2) {
                                            o oVar9 = oVarArr2[i35];
                                            byteBufferWrap2.putInt((int) oVar9.f95956a);
                                            byteBufferWrap2.putInt((int) oVar9.f95957b);
                                        }
                                        map1112.put(str4, new i(5, length2, byteBufferWrap2.array()));
                                        break;
                                    case 6:
                                    case 8:
                                    case 11:
                                    default:
                                        i17 = i14;
                                        i18 = i15;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                    case 9:
                                        i26 = i15;
                                        z14 = false;
                                        strArrSplit4 = strReplaceAll.split(",", -1);
                                        length3 = strArrSplit4.length;
                                        iArr2 = new int[length3];
                                        while (i36 < strArrSplit4.length) {
                                            iArr2[i36] = Integer.parseInt(strArrSplit4[i36]);
                                        }
                                        Map<String, i> map1113 = list.get(i16);
                                        byteBufferWrap3 = ByteBuffer.wrap(new byte[i.f95922f[9] * length3]);
                                        byteBufferWrap3.order(byteOrder);
                                        while (i37 < length3) {
                                            byteBufferWrap3.putInt(iArr2[i37]);
                                        }
                                        map1113.put(str4, new i(9, length3, byteBufferWrap3.array()));
                                        break;
                                    case 10:
                                        i26 = i15;
                                        z14 = false;
                                        strArrSplit5 = strReplaceAll.split(",", -1);
                                        length4 = strArrSplit5.length;
                                        oVarArr3 = new o[length4];
                                        i38 = 0;
                                        while (i38 < strArrSplit5.length) {
                                            String[] strArrSplit16 = strArrSplit5[i38].split("/", i25);
                                            int i4110 = i38;
                                            oVarArr3[i4110] = new o((long) Double.parseDouble(strArrSplit16[0]), (long) Double.parseDouble(strArrSplit16[i26]));
                                            i38 = i4110 + 1;
                                            strArrSplit5 = strArrSplit5;
                                            i25 = -1;
                                        }
                                        Map<String, i> map1114 = list.get(i16);
                                        byteBufferWrap4 = ByteBuffer.wrap(new byte[i.f95922f[10] * length4]);
                                        byteBufferWrap4.order(byteOrder);
                                        while (i39 < length4) {
                                            o oVar10 = oVarArr3[i39];
                                            byteBufferWrap4.putInt((int) oVar10.f95956a);
                                            byteBufferWrap4.putInt((int) oVar10.f95957b);
                                        }
                                        map1114.put(str4, new i(10, length4, byteBufferWrap4.array()));
                                        break;
                                    case 12:
                                        strArrSplit6 = strReplaceAll.split(",", -1);
                                        length5 = strArrSplit6.length;
                                        dArr = new double[length5];
                                        while (i44 < strArrSplit6.length) {
                                            dArr[i44] = Double.parseDouble(strArrSplit6[i44]);
                                        }
                                        Map<String, i> map1115 = list.get(i16);
                                        byteBufferWrap5 = ByteBuffer.wrap(new byte[i.f95922f[12] * length5]);
                                        byteBufferWrap5.order(byteOrder);
                                        i45 = 0;
                                        while (i45 < length5) {
                                            byteBufferWrap5.putDouble(dArr[i45]);
                                            i45++;
                                            i15 = i15;
                                        }
                                        map1115.put(str4, new i(12, length5, byteBufferWrap5.array()));
                                        i18 = i15;
                                        i17 = i14;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                }
                                i18 = i26;
                                i17 = 2;
                            }
                            i17 = i14;
                            i18 = i15;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                        } else {
                            i17 = i14;
                            i18 = i15;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                        }
                        i16++;
                        i15 = i18;
                        i14 = i17;
                    }
                }
            }
        }

        public final void d(int i14) {
            int i15;
            if (i14 == 0) {
                i15 = 1;
            } else if (i14 == 90) {
                i15 = 6;
            } else if (i14 != 180) {
                i15 = i14 != 270 ? 0 : 8;
            } else {
                i15 = 3;
            }
            c("Orientation", String.valueOf(i15), this.f95937a);
        }
    }

    public enum c {
        AUTO,
        MANUAL
    }

    static {
        m[] mVarArr = {new m("ImageWidth", 256, 3, 4), new m("ImageLength", TsExtractor.TS_STREAM_TYPE_AIT, 3, 4), new m("Make", 271, 2), new m("Model", 272, 2), new m("Orientation", 274, 3), new m("XResolution", 282, 5), new m("YResolution", 283, 5), new m("ResolutionUnit", 296, 3), new m("Software", 305, 2), new m("DateTime", 306, 2), new m("YCbCrPositioning", 531, 3), new m("SubIFDPointer", 330, 4), new m("ExifIFDPointer", 34665, 4), new m("GPSInfoIFDPointer", 34853, 4)};
        m[] mVarArr2 = {new m("ExposureTime", 33434, 5), new m("FNumber", 33437, 5), new m("ExposureProgram", 34850, 3), new m("PhotographicSensitivity", 34855, 3), new m("SensitivityType", 34864, 3), new m("ExifVersion", 36864, 2), new m("DateTimeOriginal", 36867, 2), new m("DateTimeDigitized", 36868, 2), new m("ComponentsConfiguration", 37121, 7), new m("ShutterSpeedValue", 37377, 10), new m("ApertureValue", 37378, 5), new m("BrightnessValue", 37379, 10), new m("ExposureBiasValue", 37380, 10), new m("MaxApertureValue", 37381, 5), new m("MeteringMode", 37383, 3), new m("LightSource", 37384, 3), new m("Flash", 37385, 3), new m("FocalLength", 37386, 5), new m("SubSecTime", 37520, 2), new m("SubSecTimeOriginal", 37521, 2), new m("SubSecTimeDigitized", 37522, 2), new m("FlashpixVersion", 40960, 7), new m("ColorSpace", 40961, 3), new m("PixelXDimension", 40962, 3, 4), new m("PixelYDimension", 40963, 3, 4), new m("InteroperabilityIFDPointer", 40965, 4), new m("FocalPlaneResolutionUnit", 41488, 3), new m("SensingMethod", 41495, 3), new m("FileSource", 41728, 7), new m("SceneType", 41729, 7), new m("CustomRendered", 41985, 3), new m("ExposureMode", 41986, 3), new m("WhiteBalance", 41987, 3), new m("SceneCaptureType", 41990, 3), new m("Contrast", 41992, 3), new m("Saturation", 41993, 3), new m("Sharpness", 41994, 3)};
        m[] mVarArr3 = {new m("GPSVersionID", 0, 1), new m("GPSLatitudeRef", 1, 2), new m("GPSLatitude", 2, 5, 10), new m("GPSLongitudeRef", 3, 2), new m("GPSLongitude", 4, 5, 10), new m("GPSAltitudeRef", 5, 1), new m("GPSAltitude", 6, 5), new m("GPSTimeStamp", 7, 5), new m("GPSSpeedRef", 12, 2), new m("GPSTrackRef", 14, 2), new m("GPSImgDirectionRef", 16, 2), new m("GPSDestBearingRef", 23, 2), new m("GPSDestDistanceRef", 25, 2)};
        f95926c = new m[]{new m("SubIFDPointer", 330, 4), new m("ExifIFDPointer", 34665, 4), new m("GPSInfoIFDPointer", 34853, 4), new m("InteroperabilityIFDPointer", 40965, 4)};
        f95927d = new m[][]{mVarArr, mVarArr2, mVarArr3, new m[]{new m("InteroperabilityIndex", 1, 2)}};
        f95928e = new HashSet<>(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
        f95929f = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
    }

    public j(ByteOrder byteOrder, List<Map<String, i>> list) {
        k7.h.f(list.size() == f95927d.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.f95931b = byteOrder;
        this.f95930a = list;
    }

    public final Map<String, i> a(int i14) {
        k7.h.c(i14, 0, f95927d.length, e0.f(i14, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "));
        return this.f95930a.get(i14);
    }
}
