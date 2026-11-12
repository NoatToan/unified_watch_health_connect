package aq;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import i3.mh;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Laq/n2;", "Lh82/c;", "<init>", "()V", "b", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n2 extends h82.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f12114f = 0;

    static {
        new a(null);
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        String strE = androidx.room.a0.e(R.string.lbl_help, context);
        final int i14 = 0;
        h82.c.b bVar = new h82.c.b("DEFAULT_ACTION", strE, null, new z3.e(-1750526434, true, new e23.q(this) { // from class: aq.l2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n2 f12042b;

            {
                this.f12042b = this;
            }

            @Override // e23.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i15 = i14;
                n2 n2Var = this.f12042b;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i16 = n2.f12114f;
                switch (i15) {
                    case 0:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            p3.x1 x1Var = p3.n.f135158a;
                            n2Var.h(n2.b.f12115i, mVar, (h82.c.f82429e << 3) | 6);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 1:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            p3.x1 x1Var2 = p3.n.f135158a;
                            n2Var.h(n2.b.f12115i, mVar, (h82.c.f82429e << 3) | 6);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 2:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            p3.x1 x1Var3 = p3.n.f135158a;
                            n2Var.h(n2.b.f12116j, mVar, (h82.c.f82429e << 3) | 6);
                        } else {
                            mVar.e();
                        }
                        break;
                    default:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            p3.x1 x1Var4 = p3.n.f135158a;
                            n2Var.h(n2.b.f12117k, mVar, (h82.c.f82429e << 3) | 6);
                        } else {
                            mVar.e();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }), 4, null);
        final int i15 = 1;
        h82.c.b bVar2 = new h82.c.b("GRIT", strE, null, new z3.e(721253599, true, new e23.q(this) { // from class: aq.l2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n2 f12042b;

            {
                this.f12042b = this;
            }

            @Override // e23.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i16 = i15;
                n2 n2Var = this.f12042b;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i17 = n2.f12114f;
                switch (i16) {
                    case 0:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            p3.x1 x1Var = p3.n.f135158a;
                            n2Var.h(n2.b.f12115i, mVar, (h82.c.f82429e << 3) | 6);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 1:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            p3.x1 x1Var2 = p3.n.f135158a;
                            n2Var.h(n2.b.f12115i, mVar, (h82.c.f82429e << 3) | 6);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 2:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            p3.x1 x1Var3 = p3.n.f135158a;
                            n2Var.h(n2.b.f12116j, mVar, (h82.c.f82429e << 3) | 6);
                        } else {
                            mVar.e();
                        }
                        break;
                    default:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            p3.x1 x1Var4 = p3.n.f135158a;
                            n2Var.h(n2.b.f12117k, mVar, (h82.c.f82429e << 3) | 6);
                        } else {
                            mVar.e();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }), 4, null);
        final int i16 = 2;
        h82.c.b bVar3 = new h82.c.b("FLOW", strE, null, new z3.e(-1101933664, true, new e23.q(this) { // from class: aq.l2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n2 f12042b;

            {
                this.f12042b = this;
            }

            @Override // e23.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i17 = i16;
                n2 n2Var = this.f12042b;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i18 = n2.f12114f;
                switch (i17) {
                    case 0:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            p3.x1 x1Var = p3.n.f135158a;
                            n2Var.h(n2.b.f12115i, mVar, (h82.c.f82429e << 3) | 6);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 1:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            p3.x1 x1Var2 = p3.n.f135158a;
                            n2Var.h(n2.b.f12115i, mVar, (h82.c.f82429e << 3) | 6);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 2:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            p3.x1 x1Var3 = p3.n.f135158a;
                            n2Var.h(n2.b.f12116j, mVar, (h82.c.f82429e << 3) | 6);
                        } else {
                            mVar.e();
                        }
                        break;
                    default:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            p3.x1 x1Var4 = p3.n.f135158a;
                            n2Var.h(n2.b.f12117k, mVar, (h82.c.f82429e << 3) | 6);
                        } else {
                            mVar.e();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }), 4, null);
        final int i17 = 3;
        return p13.x.k(bVar, bVar2, bVar3, new h82.c.b("JUMP", strE, null, new z3.e(1369846369, true, new e23.q(this) { // from class: aq.l2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n2 f12042b;

            {
                this.f12042b = this;
            }

            @Override // e23.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i18 = i17;
                n2 n2Var = this.f12042b;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i19 = n2.f12114f;
                switch (i18) {
                    case 0:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            p3.x1 x1Var = p3.n.f135158a;
                            n2Var.h(n2.b.f12115i, mVar, (h82.c.f82429e << 3) | 6);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 1:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            p3.x1 x1Var2 = p3.n.f135158a;
                            n2Var.h(n2.b.f12115i, mVar, (h82.c.f82429e << 3) | 6);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 2:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            p3.x1 x1Var3 = p3.n.f135158a;
                            n2Var.h(n2.b.f12116j, mVar, (h82.c.f82429e << 3) | 6);
                        } else {
                            mVar.e();
                        }
                        break;
                    default:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            p3.x1 x1Var4 = p3.n.f135158a;
                            n2Var.h(n2.b.f12117k, mVar, (h82.c.f82429e << 3) | 6);
                        } else {
                            mVar.e();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }), 4, null));
    }

    public final void g(int i14, int i15, int i16, String str, p3.m mVar) {
        int i17;
        String str2;
        p3.o0 o0VarE = mVar.E(-1878546679);
        if ((i16 & 6) == 0) {
            i17 = (o0VarE.k(i14) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= o0VarE.k(i15) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            str2 = str;
            i17 |= o0VarE.B(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarF = c2.x2.f(c2.l.C(aVar, f14, f14, f14, 0.0f, 8), 1.0f);
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            c2.s2 s2VarA = c2.q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u2 u2Var = c2.u2.f22900a;
            c2.q.a(u1.n.e(l4.k.b(c2.x2.q(aVar, f14), k2.i.f102406a), n5.a.a(o0VarE, i14), o4.m1.f128891a), o0VarE, 0);
            String strP = gl1.y.P(i15, new Object[]{str2}, o0VarE);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
            d6.h.f57752b.getClass();
            mh.c(strP, c2.l.C(aVar, 8, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 48, 0, 130044);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m2(this, i14, i15, str2, i16);
        }
    }

    public final void h(b bVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(848636579);
        int i16 = 4;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(bVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(1908183024, new aa2.f(i16, bVar, this), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.r(this, bVar, i14, 3);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Laq/n2$a;", "", "<init>", "()V", "", "GRIT_ACTION", "Ljava/lang/String;", "FLOW_ACTION", "JUMP_ACTION", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'i' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001Bc\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Laq/n2$b;", "", "", "headerTextRes", "headerDescriptionRes", "subHeaderRes", "subHeaderDescriptionRes", "headerSubDescriptionRes", "", "rangeColors", "rangeLabels", "", "rangeValues", "<init>", "(Ljava/lang/String;IIIIII[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f12115i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f12116j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f12117k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ b[] f12118l;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f12121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f12122d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f12123e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Integer[] f12124f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Integer[] f12125g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String[] f12126h;

        static {
            Integer numValueOf = Integer.valueOf(R.color.grit_flow_color_green);
            Integer[] numArr = {numValueOf, Integer.valueOf(R.color.grit_color_blue), Integer.valueOf(R.color.grit_color_purple)};
            Integer numValueOf2 = Integer.valueOf(R.string.lbl_grit_easy);
            Integer numValueOf3 = Integer.valueOf(R.string.ModerateFormat);
            b bVar = new b("GRIT", 0, R.string.lbl_grit_chart_title, R.string.lbl_grit_help_description, R.string.lbl_grit_help_sub_header, R.string.lbl_grit_help_sub_description, R.string.help_grit_header_sub_description, numArr, new Integer[]{numValueOf2, numValueOf3, Integer.valueOf(R.string.lbl_grit_hard)}, new String[]{"0", "20", "40"});
            f12115i = bVar;
            b bVar2 = new b("FLOW", 1, R.string.lbl_flow_chart_title, R.string.lbl_flow_help_description, R.string.lbl_flow_help_sub_header, R.string.lbl_flow_help_sub_description, R.string.help_flow_header_sub_description, new Integer[]{numValueOf, Integer.valueOf(R.color.flow_color_yellow), Integer.valueOf(R.color.flow_color_red)}, new Integer[]{Integer.valueOf(R.string.lbl_flow_smooth), numValueOf3, Integer.valueOf(R.string.lbl_flow_rough)}, new String[]{"0", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, "20"});
            f12116j = bVar2;
            b bVar3 = new b("JUMP", 2, R.string.mtb_jump_metrics_title, R.string.lbl_jumps_help_description, R.string.lbl_jumps_help_sub_header, R.string.lbl_jumps_help_sub_description, 0, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
            f12117k = bVar3;
            f12118l = new b[]{bVar, bVar2, bVar3};
        }

        public /* synthetic */ b(String str, int i14, int i15, int i16, int i17, int i18, int i19, Integer[] numArr, Integer[] numArr2, String[] strArr, int i24, p005kotlin.jvm.internal.j jVar) {
            this(str, i14, i15, i16, i17, i18, (i24 & 16) != 0 ? -1 : i19, (i24 & 32) != 0 ? new Integer[0] : numArr, (i24 & 64) != 0 ? new Integer[0] : numArr2, (i24 & 128) != 0 ? new String[0] : strArr);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f12118l.clone();
        }

        private b(String str, int i14, int i15, int i16, int i17, int i18, int i19, Integer[] numArr, Integer[] numArr2, String[] strArr) {
            super(str, i14);
            this.f12119a = i15;
            this.f12120b = i16;
            this.f12121c = i17;
            this.f12122d = i18;
            this.f12123e = i19;
            this.f12124f = numArr;
            this.f12125g = numArr2;
            this.f12126h = strArr;
        }
    }
}
