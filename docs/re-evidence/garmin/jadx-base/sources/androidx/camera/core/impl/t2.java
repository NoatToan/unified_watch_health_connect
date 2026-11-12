package androidx.camera.core.impl;

import android.util.Size;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.internal.ViewUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Landroidx/camera/core/impl/t2;", "", "Landroidx/camera/core/impl/t2$d;", "configType", "Landroidx/camera/core/impl/t2$b;", "configSize", "Landroidx/camera/core/impl/r2;", "streamUseCase", "<init>", "(Landroidx/camera/core/impl/t2$d;Landroidx/camera/core/impl/t2$b;Landroidx/camera/core/impl/r2;)V", "a", "d", "c", "b", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class t2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f5758e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r2 f5759f = r2.DEFAULT;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b[] f5760g = {b.f5769e, b.f5771g, b.f5772h, b.f5774j, b.f5775k, b.f5768d};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f5761h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final LinkedHashMap f5762i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f5763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f5764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r2 f5765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5766d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/camera/core/impl/t2$c;", "", "<init>", "(Ljava/lang/String;I)V", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum c {
        FEATURE_COMBINATION_TABLE,
        CAPTURE_SESSION_TABLES
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/camera/core/impl/t2$d;", "", "<init>", "(Ljava/lang/String;I)V", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum d {
        PRIV,
        YUV,
        JPEG,
        JPEG_R,
        RAW
    }

    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5794a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f5770f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f5776l.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f5777m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.f5778n.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.f5779o.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.f5780p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.f5781q.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f5794a = iArr;
        }
    }

    static {
        Map mapE = p13.u0.e(new o13.p(d.YUV, 35), new o13.p(d.JPEG, 256), new o13.p(d.JPEG_R, 4101), new o13.p(d.RAW, 32), new o13.p(d.PRIV, 34));
        f5761h = mapE;
        Set<Map.Entry> setEntrySet = mapE.entrySet();
        int iA = p13.t0.a(p13.y.r(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (d) entry.getKey());
        }
        f5762i = linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public t2(d dVar, b bVar, r2 r2Var) {
        dVar.getClass();
        bVar.getClass();
        r2Var.getClass();
        this.f5763a = dVar;
        this.f5764b = bVar;
        this.f5765c = r2Var;
        Integer num = (Integer) f5761h.get(dVar);
        this.f5766d = num != null ? num.intValue() : 0;
    }

    public static final t2 a(d dVar, b bVar) {
        f5758e.getClass();
        dVar.getClass();
        bVar.getClass();
        return a.a(dVar, bVar, f5759f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj;
        return this.f5763a == t2Var.f5763a && this.f5764b == t2Var.f5764b && this.f5765c == t2Var.f5765c;
    }

    public final int hashCode() {
        return this.f5765c.hashCode() + ((this.f5764b.hashCode() + (this.f5763a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SurfaceConfig(configType=" + this.f5763a + ", configSize=" + this.f5764b + ", streamUseCase=" + this.f5765c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/camera/core/impl/t2$a;", "", "<init>", "()V", "Landroidx/camera/core/impl/r2;", "DEFAULT_STREAM_USE_CASE", "Landroidx/camera/core/impl/r2;", "", "Landroidx/camera/core/impl/t2$b;", "FEATURE_COMBO_QUERY_SUPPORTED_SIZES", "[Landroidx/camera/core/impl/t2$b;", "", "Landroidx/camera/core/impl/t2$d;", "", "IMAGE_FORMATS_BY_CONFIG_TYPE", "Ljava/util/Map;", "CONFIG_TYPES_BY_IMAGE_FORMAT", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static t2 a(d dVar, b bVar, r2 r2Var) {
            dVar.getClass();
            bVar.getClass();
            r2Var.getClass();
            return new t2(dVar, bVar, r2Var);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:42:0x00dc A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:43:0x00de  */
        /* JADX WARN: Code duplicated, block: B:45:0x00e9  */
        public static t2 b(int i14, Size size, r rVar, int i15, c cVar, r2 r2Var) {
            size.getClass();
            rVar.getClass();
            cVar.getClass();
            r2Var.getClass();
            d dVar = (d) t2.f5762i.get(Integer.valueOf(i14));
            if (dVar == null) {
                dVar = d.PRIV;
            }
            b bVar = b.f5781q;
            Size size2 = q0.c.f141971a;
            int height = size.getHeight() * size.getWidth();
            if (i15 == 1) {
                if (height <= q0.c.a(rVar.f5717b.get(Integer.valueOf(i14)))) {
                    bVar = b.f5769e;
                } else if (height <= q0.c.a(rVar.f5719d.get(Integer.valueOf(i14)))) {
                    bVar = b.f5773i;
                }
            } else if (cVar == c.FEATURE_COMBINATION_TABLE) {
                Size size3 = rVar.d().get(Integer.valueOf(i14));
                for (b bVar2 : t2.f5760g) {
                    if (size.equals(bVar2.f5784b)) {
                        bVar = bVar2;
                        break;
                    }
                }
                if (bVar == b.f5781q && size.equals(size3)) {
                    bVar = b.f5777m;
                }
            } else if (height <= q0.c.a(rVar.f5716a)) {
                bVar = b.f5767c;
            } else if (height <= q0.c.a(rVar.f5718c)) {
                bVar = b.f5770f;
            } else if (height <= q0.c.a(rVar.f5720e)) {
                bVar = b.f5776l;
            } else {
                Size size4 = rVar.d().get(Integer.valueOf(i14));
                Size size5 = rVar.i().get(Integer.valueOf(i14));
                if (size4 != null) {
                    if (height <= size4.getHeight() * size4.getWidth()) {
                        if (i15 != 2) {
                            bVar = b.f5777m;
                        } else if (size5 != null) {
                            if (height <= size5.getHeight() * size5.getWidth()) {
                                bVar = b.f5780p;
                            }
                        }
                    } else if (size5 != null) {
                        if (height <= size5.getHeight() * size5.getWidth()) {
                            bVar = b.f5780p;
                        }
                    }
                } else if (i15 != 2) {
                    bVar = b.f5777m;
                } else if (size5 != null) {
                    if (height <= size5.getHeight() * size5.getWidth()) {
                        bVar = b.f5780p;
                    }
                }
            }
            return a(dVar, bVar, r2Var);
        }

        private a() {
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'l' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/camera/core/impl/t2$b;", "", "", TtmlNode.ATTR_ID, "Landroid/util/Size;", "relatedFixedSize", "<init>", "(Ljava/lang/String;IILandroid/util/Size;)V", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f5767c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f5768d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f5769e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f5770f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f5771g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f5772h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f5773i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f5774j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f5775k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f5776l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f5777m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f5778n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f5779o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f5780p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f5781q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final /* synthetic */ b[] f5782r;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Size f5784b;

        /* JADX WARN: Multi-variable type inference failed */
        static {
            b bVar = new b("VGA", 0, 0, new Size(640, 480));
            f5767c = bVar;
            b bVar2 = new b("X_VGA", 1, 1, new Size(1024, ViewUtils.EDGE_TO_EDGE_FLAGS));
            f5768d = bVar2;
            b bVar3 = new b("S720P_16_9", 2, 2, new Size(1280, 720));
            f5769e = bVar3;
            b bVar4 = new b("PREVIEW", 3, 3, null, 2, null);
            f5770f = bVar4;
            b bVar5 = new b("S1080P_4_3", 4, 4, new Size(DateTimeConstants.MINUTES_PER_DAY, 1080));
            f5771g = bVar5;
            b bVar6 = new b("S1080P_16_9", 5, 5, new Size(1920, 1080));
            f5772h = bVar6;
            b bVar7 = new b("S1440P_4_3", 6, 6, new Size(1920, DateTimeConstants.MINUTES_PER_DAY));
            f5773i = bVar7;
            b bVar8 = new b("S1440P_16_9", 7, 7, new Size(2560, DateTimeConstants.MINUTES_PER_DAY));
            f5774j = bVar8;
            b bVar9 = new b("UHD", 8, 8, new Size(3840, 2160));
            f5775k = bVar9;
            p005kotlin.jvm.internal.j jVar = null;
            b bVar10 = new b("RECORD", 9, 9, null, 2, jVar);
            f5776l = bVar10;
            b bVar11 = new b("MAXIMUM", 10, 10, null, 2, 0 == true ? 1 : 0);
            f5777m = bVar11;
            b bVar12 = new b("MAXIMUM_4_3", 11, 11, null, 2, null);
            f5778n = bVar12;
            b bVar13 = new b("MAXIMUM_16_9", 12, 12, null, 2, jVar);
            f5779o = bVar13;
            b bVar14 = new b("ULTRA_MAXIMUM", 13, 13, null, 2, null);
            f5780p = bVar14;
            b bVar15 = new b("NOT_SUPPORT", 14, 14, null, 2, null);
            f5781q = bVar15;
            f5782r = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15};
        }

        public /* synthetic */ b(String str, int i14, int i15, Size size, int i16, p005kotlin.jvm.internal.j jVar) {
            this(str, i14, i15, (i16 & 2) != 0 ? null : size);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f5782r.clone();
        }

        private b(String str, int i14, int i15, Size size) {
            super(str, i14);
            this.f5783a = i15;
            this.f5784b = size;
        }
    }

    public /* synthetic */ t2(d dVar, b bVar, r2 r2Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(dVar, bVar, (i14 & 4) != 0 ? f5759f : r2Var);
    }
}
