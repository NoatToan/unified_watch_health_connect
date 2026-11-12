package sx;

import android.content.Context;
import android.util.SparseArray;
import bx.d;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import ds.e0;
import j23.l;
import java.util.LinkedHashMap;
import n23.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.x;
import q6.f;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lsx/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "version", "<init>", "(Landroid/content/Context;D)V", "c", "a", "b", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f161116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f161117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f161118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f161119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f161120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f161121i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f161122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f161123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f161124c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsx/a$c;", "", "", "messageString", "", "moreInfo", "<init>", "(Ljava/lang/String;Z)V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f161132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f161133b;

        public c(String str, boolean z14) {
            str.getClass();
            this.f161132a = str;
            this.f161133b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f161132a.equals(cVar.f161132a) && this.f161133b == cVar.f161133b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f161133b) + (this.f161132a.hashCode() * 31);
        }

        public final String toString() {
            return j.g("Message(messageString=", this.f161132a, ", moreInfo=", this.f161133b, ")");
        }
    }

    static {
        new b(null);
        f161116d = new l(0, 24);
        f161117e = new l(25, 75);
        f161118f = new l(76, Integer.MAX_VALUE);
        f161119g = new l(0, 49);
        f161120h = new l(50, 90);
        f161121i = new l(91, Integer.MAX_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, double d14) {
        context.getClass();
        this.f161122a = context;
        this.f161123b = d14;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f161124c = linkedHashMap;
        d.b bVar = d.b.f21621c;
        SparseArray sparseArray = new SparseArray(6);
        int i14 = R.string.gcm_body_battery_message_74;
        int i15 = R.string.gcm_body_battery_message_83;
        int i16 = R.string.gcm_body_battery_message_75;
        C3042a c3042a = new C3042a(true, false, i14, i15, i16, R.string.gcm_body_battery_message_92, null, 64, null);
        int i17 = 64;
        p005kotlin.jvm.internal.j jVar = null;
        boolean z14 = true;
        boolean z15 = false;
        l lVar = null;
        C3042a c3042a2 = new C3042a(z14, z15, i14, i15, i16, R.string.gcm_body_battery_message_91, lVar, i17, jVar);
        C3042a c3042a3 = new C3042a(z14, z15, i14, i15, i16, R.string.gcm_body_battery_message_90, lVar, i17, jVar);
        boolean z16 = false;
        int i18 = 0;
        C3042a c3042a4 = new C3042a(false, z16, 0, 0, i18, R.string.gcm_body_battery_message_92, null, 92, null);
        int i19 = 0;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        sparseArray.append(0, x.k(c3042a, c3042a2, c3042a3, c3042a4, new C3042a(z16, objArr, objArr2, i18, i19, R.string.gcm_body_battery_message_91, null, 92, null), new C3042a(objArr3, objArr4, i18, i19, 0, R.string.gcm_body_battery_message_90, null, 92, null)));
        int i24 = 64;
        p005kotlin.jvm.internal.j jVar2 = null;
        l lVar2 = null;
        C3042a c3042a5 = new C3042a(z14, z15, i14, i15, i16, R.string.gcm_body_battery_message_91, lVar2, i24, jVar2);
        C3042a c3042a6 = new C3042a(z14, z15, i14, i15, i16, R.string.gcm_body_battery_message_92, lVar2, i24, jVar2);
        C3042a c3042a7 = new C3042a(z14, z15, i14, i15, i16, R.string.gcm_body_battery_message_90, lVar2, i24, jVar2);
        C3042a c3042a8 = new C3042a(z14, z15, i14, i15, i16, R.string.gcm_body_battery_message_88, lVar2, i24, jVar2);
        int i25 = 92;
        int i26 = R.string.gcm_body_battery_message_0;
        l lVar3 = null;
        sparseArray.append(7, x.k(c3042a5, c3042a6, c3042a7, c3042a8, new C3042a(false, false, 0, 0 == true ? 1 : 0, i18, i26, lVar3, i25, 0 == true ? 1 : 0)));
        int i27 = 64;
        p005kotlin.jvm.internal.j jVar3 = null;
        l lVar4 = null;
        sparseArray.append(25, x.k(new C3042a(z14, z15, i14, i15, i16, R.string.gcm_body_battery_message_89, lVar4, i27, jVar3), new C3042a(z14, z15, i14, i15, i16, R.string.gcm_body_battery_message_90, lVar4, i27, jVar3), new C3042a(z14, z15, i14, i15, i16, R.string.gcm_body_battery_message_88, lVar4, i27, jVar3), new C3042a(z14, z15, i14, i15, i16, R.string.gcm_body_battery_message_91, lVar4, i27, jVar3), new C3042a(false, false, 0, 0 == true ? 1 : 0, i18, i26, lVar3, i25, 0 == true ? 1 : 0)));
        int i28 = 64;
        p005kotlin.jvm.internal.j jVar4 = null;
        l lVar5 = null;
        sparseArray.append(50, x.k(new C3042a(z14, z15, i14, i15, i16, R.string.gcm_body_battery_message_88, lVar5, i28, jVar4), new C3042a(z14, z15, i14, i15, i16, R.string.gcm_body_battery_message_89, lVar5, i28, jVar4), new C3042a(z14, z15, i14, i15, i16, R.string.gcm_body_battery_message_87, lVar5, i28, jVar4), new C3042a(z14, z15, i14, i15, i16, R.string.gcm_body_battery_message_90, lVar5, i28, jVar4), new C3042a(false, false, 0, 0 == true ? 1 : 0, i18, i26, lVar3, i25, 0 == true ? 1 : 0)));
        sparseArray.append(75, x.k(new C3042a(z14, z15, i14, i15, i16, R.string.gcm_body_battery_message_87, null, 64, null), new C3042a(false, false, 0, 0 == true ? 1 : 0, i18, i26, lVar3, i25, 0 == true ? 1 : 0)));
        sparseArray.append(95, x.k(new C3042a(z14, z15, i14, i15, i16, R.string.gcm_body_battery_message_86, null, 64, null), new C3042a(z15, false, 0, 0, 0, R.string.gcm_body_battery_message_86, null, 92, null)));
        linkedHashMap.put(bVar, sparseArray);
        d.a aVar = d.a.f21620c;
        SparseArray sparseArray2 = new SparseArray(6);
        int i29 = R.string.gcm_body_battery_message_79;
        int i30 = R.string.gcm_body_battery_message_83;
        int i34 = R.string.gcm_body_battery_message_80;
        int i35 = 64;
        boolean z17 = true;
        boolean z18 = true;
        int i36 = R.string.gcm_body_battery_message_76;
        int i37 = R.string.gcm_body_battery_message_83;
        int i38 = R.string.gcm_body_battery_message_77;
        int i39 = 64;
        p005kotlin.jvm.internal.j jVar5 = null;
        boolean z19 = false;
        boolean z24 = false;
        l lVar6 = null;
        sparseArray2.append(0, x.k(new C3042a(true, true, i29, i30, i34, R.string.gcm_body_battery_message_105, null, 64, null), new C3042a(z17, z18, i29, i30, i34, R.string.gcm_body_battery_message_106, lVar3, i35, 0 == true ? 1 : 0), new C3042a(z17, z18, i29, i30, i34, R.string.gcm_body_battery_message_107, lVar3, i35, 0 == true ? 1 : 0), new C3042a(false, false, i36, i37, i38, R.string.gcm_body_battery_message_105, null, 64, null), new C3042a(z19, z24, i36, i37, i38, R.string.gcm_body_battery_message_106, lVar6, i39, jVar5), new C3042a(z19, z24, i36, i37, i38, R.string.gcm_body_battery_message_107, lVar6, i39, jVar5)));
        int iB = b(7, 25);
        int i44 = 64;
        p005kotlin.jvm.internal.j jVar6 = null;
        boolean z25 = true;
        boolean z26 = true;
        l lVar7 = null;
        C3042a c3042a9 = new C3042a(z25, z26, i29, i30, i34, R.string.gcm_body_battery_message_15, lVar7, i44, jVar6);
        C3042a c3042a10 = new C3042a(z25, z26, i29, i30, i34, R.string.gcm_body_battery_message_16, lVar7, i44, jVar6);
        C3042a c3042a11 = new C3042a(z25, z26, i29, i30, i34, R.string.gcm_body_battery_message_17, lVar7, i44, jVar6);
        C3042a c3042a12 = new C3042a(z25, z26, i29, i30, i34, R.string.gcm_body_battery_message_18, lVar7, i44, jVar6);
        int i45 = 64;
        p005kotlin.jvm.internal.j jVar7 = null;
        boolean z27 = false;
        boolean z28 = false;
        l lVar8 = null;
        sparseArray2.append(iB, x.k(c3042a9, c3042a10, c3042a11, c3042a12, new C3042a(z27, z28, i36, i37, i38, R.string.gcm_body_battery_message_15, lVar8, i45, jVar7), new C3042a(z27, z28, i36, i37, i38, R.string.gcm_body_battery_message_16, lVar8, i45, jVar7), new C3042a(z27, z28, i36, i37, i38, R.string.gcm_body_battery_message_17, lVar8, i45, jVar7), new C3042a(z27, z28, i36, i37, i38, R.string.gcm_body_battery_message_18, lVar8, i45, jVar7)));
        int iB2 = b(40, 45);
        int i46 = 64;
        p005kotlin.jvm.internal.j jVar8 = null;
        l lVar9 = null;
        C3042a c3042a13 = new C3042a(z25, z26, i29, i30, i34, R.string.gcm_body_battery_message_103, lVar9, i46, jVar8);
        C3042a c3042a14 = new C3042a(z25, z26, i29, i30, i34, R.string.gcm_body_battery_message_12, lVar9, i46, jVar8);
        C3042a c3042a15 = new C3042a(z25, z26, i29, i30, i34, R.string.gcm_body_battery_message_104, lVar9, i46, jVar8);
        C3042a c3042a16 = new C3042a(z25, z26, i29, i30, i34, R.string.gcm_body_battery_message_14, lVar9, i46, jVar8);
        int i47 = 64;
        p005kotlin.jvm.internal.j jVar9 = null;
        boolean z29 = false;
        boolean z34 = false;
        l lVar10 = null;
        sparseArray2.append(iB2, x.k(c3042a13, c3042a14, c3042a15, c3042a16, new C3042a(z29, z34, i36, i37, i38, R.string.gcm_body_battery_message_103, lVar10, i47, jVar9), new C3042a(z29, z34, i36, i37, i38, R.string.gcm_body_battery_message_12, lVar10, i47, jVar9), new C3042a(z29, z34, i36, i37, i38, R.string.gcm_body_battery_message_104, lVar10, i47, jVar9), new C3042a(z29, z34, i36, i37, i38, R.string.gcm_body_battery_message_14, lVar10, i47, jVar9)));
        int i48 = 64;
        p005kotlin.jvm.internal.j jVar10 = null;
        l lVar11 = null;
        C3042a c3042a17 = new C3042a(z25, z26, i29, i30, i34, R.string.gcm_body_battery_message_99, lVar11, i48, jVar10);
        C3042a c3042a18 = new C3042a(z25, z26, i29, i30, i34, R.string.gcm_body_battery_message_100, lVar11, i48, jVar10);
        C3042a c3042a19 = new C3042a(z25, z26, i29, i30, i34, R.string.gcm_body_battery_message_101, lVar11, i48, jVar10);
        C3042a c3042a20 = new C3042a(z25, z26, i29, i30, i34, R.string.gcm_body_battery_message_102, lVar11, i48, jVar10);
        int i49 = 64;
        p005kotlin.jvm.internal.j jVar11 = null;
        boolean z35 = false;
        boolean z36 = false;
        l lVar12 = null;
        sparseArray2.append(65, x.k(c3042a17, c3042a18, c3042a19, c3042a20, new C3042a(z35, z36, i36, i37, i38, R.string.gcm_body_battery_message_99, lVar12, i49, jVar11), new C3042a(z35, z36, i36, i37, i38, R.string.gcm_body_battery_message_100, lVar12, i49, jVar11), new C3042a(z35, z36, i36, i37, i38, R.string.gcm_body_battery_message_101, lVar12, i49, jVar11), new C3042a(z35, z36, i36, i37, i38, R.string.gcm_body_battery_message_102, lVar12, i49, jVar11)));
        int i54 = 64;
        p005kotlin.jvm.internal.j jVar12 = null;
        l lVar13 = null;
        C3042a c3042a21 = new C3042a(z25, z26, i29, i30, i34, R.string.gcm_body_battery_message_5, lVar13, i54, jVar12);
        C3042a c3042a22 = new C3042a(z25, z26, i29, i30, i34, R.string.gcm_body_battery_message_96, lVar13, i54, jVar12);
        C3042a c3042a23 = new C3042a(z25, z26, i29, i30, i34, R.string.gcm_body_battery_message_97, lVar13, i54, jVar12);
        C3042a c3042a24 = new C3042a(z25, z26, i29, i30, i34, R.string.gcm_body_battery_message_98, lVar13, i54, jVar12);
        int i55 = 64;
        p005kotlin.jvm.internal.j jVar13 = null;
        boolean z37 = false;
        boolean z38 = false;
        l lVar14 = null;
        sparseArray2.append(80, x.k(c3042a21, c3042a22, c3042a23, c3042a24, new C3042a(z37, z38, i36, i37, i38, R.string.gcm_body_battery_message_5, lVar14, i55, jVar13), new C3042a(z37, z38, i36, i37, i38, R.string.gcm_body_battery_message_96, lVar14, i55, jVar13), new C3042a(z37, z38, i36, i37, i38, R.string.gcm_body_battery_message_97, lVar14, i55, jVar13), new C3042a(z37, z38, i36, i37, i38, R.string.gcm_body_battery_message_98, lVar14, i55, jVar13)));
        int i56 = 64;
        p005kotlin.jvm.internal.j jVar14 = null;
        l lVar15 = null;
        C3042a c3042a25 = new C3042a(z25, z26, i29, i30, i34, R.string.gcm_body_battery_message_93, lVar15, i56, jVar14);
        C3042a c3042a26 = new C3042a(z25, z26, i29, i30, i34, R.string.gcm_body_battery_message_94, lVar15, i56, jVar14);
        C3042a c3042a27 = new C3042a(z25, z26, i29, i30, i34, R.string.gcm_body_battery_message_95, lVar15, i56, jVar14);
        int i57 = 64;
        p005kotlin.jvm.internal.j jVar15 = null;
        boolean z39 = false;
        boolean z44 = false;
        l lVar16 = null;
        sparseArray2.append(95, x.k(c3042a25, c3042a26, c3042a27, new C3042a(z39, z44, i36, i37, i38, R.string.gcm_body_battery_message_93, lVar16, i57, jVar15), new C3042a(z39, z44, i36, i37, i38, R.string.gcm_body_battery_message_94, lVar16, i57, jVar15), new C3042a(z39, z44, i36, i37, i38, R.string.gcm_body_battery_message_95, lVar16, i57, jVar15)));
        linkedHashMap.put(aVar, sparseArray2);
        d.e eVar = d.e.f21623c;
        SparseArray sparseArray3 = new SparseArray(6);
        int i58 = R.string.gcm_body_battery_message_76;
        int i59 = R.string.gcm_body_battery_message_84;
        int i64 = R.string.gcm_body_battery_message_77;
        int i65 = 64;
        p005kotlin.jvm.internal.j jVar16 = null;
        boolean z45 = true;
        boolean z46 = true;
        l lVar17 = null;
        int i66 = R.string.gcm_body_battery_message_76;
        int i67 = R.string.gcm_body_battery_message_84;
        int i68 = R.string.gcm_body_battery_message_77;
        int i69 = 64;
        p005kotlin.jvm.internal.j jVar17 = null;
        boolean z47 = false;
        boolean z48 = true;
        l lVar18 = null;
        sparseArray3.append(0, x.k(new C3042a(true, true, i58, i59, i64, R.string.gcm_body_battery_message_123, null, 64, null), new C3042a(z45, z46, i58, i59, i64, R.string.gcm_body_battery_message_106, lVar17, i65, jVar16), new C3042a(z45, z46, i58, i59, i64, R.string.gcm_body_battery_message_124, lVar17, i65, jVar16), new C3042a(false, true, i66, i67, i68, R.string.gcm_body_battery_message_123, null, 64, null), new C3042a(z47, z48, i66, i67, i68, R.string.gcm_body_battery_message_106, lVar18, i69, jVar17), new C3042a(z47, z48, i66, i67, i68, R.string.gcm_body_battery_message_124, lVar18, i69, jVar17)));
        int iB3 = b(7, 15);
        int i74 = 64;
        p005kotlin.jvm.internal.j jVar18 = null;
        boolean z49 = true;
        boolean z54 = true;
        l lVar19 = null;
        C3042a c3042a28 = new C3042a(z49, z54, i58, i59, i64, R.string.gcm_body_battery_message_44, lVar19, i74, jVar18);
        C3042a c3042a29 = new C3042a(z49, z54, i58, i59, i64, R.string.gcm_body_battery_message_42, lVar19, i74, jVar18);
        C3042a c3042a30 = new C3042a(z49, z54, i58, i59, i64, R.string.gcm_body_battery_message_43, lVar19, i74, jVar18);
        boolean z55 = false;
        boolean z56 = true;
        sparseArray3.append(iB3, x.k(c3042a28, c3042a29, c3042a30, new C3042a(z55, z56, i66, i67, i68, R.string.gcm_body_battery_message_44, lVar18, i69, jVar17), new C3042a(z55, z56, i66, i67, i68, R.string.gcm_body_battery_message_42, lVar18, i69, jVar17), new C3042a(z55, z56, i66, i67, i68, R.string.gcm_body_battery_message_43, lVar18, i69, jVar17)));
        int i75 = 64;
        p005kotlin.jvm.internal.j jVar19 = null;
        boolean z57 = true;
        boolean z58 = true;
        l lVar20 = null;
        C3042a c3042a31 = new C3042a(z57, z58, i58, i59, i64, R.string.gcm_body_battery_message_119, lVar20, i75, jVar19);
        C3042a c3042a32 = new C3042a(z57, z58, i58, i59, i64, R.string.gcm_body_battery_message_120, lVar20, i75, jVar19);
        C3042a c3042a33 = new C3042a(z57, z58, i58, i59, i64, R.string.gcm_body_battery_message_121, lVar20, i75, jVar19);
        C3042a c3042a34 = new C3042a(z57, z58, i58, i59, i64, R.string.gcm_body_battery_message_122, lVar20, i75, jVar19);
        int i76 = 64;
        p005kotlin.jvm.internal.j jVar20 = null;
        boolean z59 = false;
        boolean z64 = true;
        l lVar21 = null;
        sparseArray3.append(30, x.k(c3042a31, c3042a32, c3042a33, c3042a34, new C3042a(z59, z64, i66, i67, i68, R.string.gcm_body_battery_message_119, lVar21, i76, jVar20), new C3042a(z59, z64, i66, i67, i68, R.string.gcm_body_battery_message_120, lVar21, i76, jVar20), new C3042a(z59, z64, i66, i67, i68, R.string.gcm_body_battery_message_121, lVar21, i76, jVar20), new C3042a(z59, z64, i66, i67, i68, R.string.gcm_body_battery_message_122, lVar21, i76, jVar20)));
        int iB4 = b(55, 45);
        int i77 = 64;
        p005kotlin.jvm.internal.j jVar21 = null;
        l lVar22 = null;
        C3042a c3042a35 = new C3042a(z57, z58, i58, i59, i64, R.string.gcm_body_battery_message_115, lVar22, i77, jVar21);
        C3042a c3042a36 = new C3042a(z57, z58, i58, i59, i64, R.string.gcm_body_battery_message_116, lVar22, i77, jVar21);
        C3042a c3042a37 = new C3042a(z57, z58, i58, i59, i64, R.string.gcm_body_battery_message_117, lVar22, i77, jVar21);
        C3042a c3042a38 = new C3042a(z57, z58, i58, i59, i64, R.string.gcm_body_battery_message_118, lVar22, i77, jVar21);
        int i78 = 64;
        p005kotlin.jvm.internal.j jVar22 = null;
        boolean z65 = false;
        boolean z66 = true;
        l lVar23 = null;
        sparseArray3.append(iB4, x.k(c3042a35, c3042a36, c3042a37, c3042a38, new C3042a(z65, z66, i66, i67, i68, R.string.gcm_body_battery_message_115, lVar23, i78, jVar22), new C3042a(z65, z66, i66, i67, i68, R.string.gcm_body_battery_message_116, lVar23, i78, jVar22), new C3042a(z65, z66, i66, i67, i68, R.string.gcm_body_battery_message_117, lVar23, i78, jVar22), new C3042a(z65, z66, i66, i67, i68, R.string.gcm_body_battery_message_118, lVar23, i78, jVar22)));
        int iB5 = b(70, 65);
        int i79 = 64;
        p005kotlin.jvm.internal.j jVar23 = null;
        l lVar24 = null;
        C3042a c3042a39 = new C3042a(z57, z58, i58, i59, i64, R.string.gcm_body_battery_message_111, lVar24, i79, jVar23);
        C3042a c3042a40 = new C3042a(z57, z58, i58, i59, i64, R.string.gcm_body_battery_message_112, lVar24, i79, jVar23);
        C3042a c3042a41 = new C3042a(z57, z58, i58, i59, i64, R.string.gcm_body_battery_message_113, lVar24, i79, jVar23);
        C3042a c3042a42 = new C3042a(z57, z58, i58, i59, i64, R.string.gcm_body_battery_message_114, lVar24, i79, jVar23);
        int i84 = 64;
        p005kotlin.jvm.internal.j jVar24 = null;
        boolean z67 = false;
        boolean z68 = true;
        l lVar25 = null;
        sparseArray3.append(iB5, x.k(c3042a39, c3042a40, c3042a41, c3042a42, new C3042a(z67, z68, i66, i67, i68, R.string.gcm_body_battery_message_111, lVar25, i84, jVar24), new C3042a(z67, z68, i66, i67, i68, R.string.gcm_body_battery_message_112, lVar25, i84, jVar24), new C3042a(z67, z68, i66, i67, i68, R.string.gcm_body_battery_message_113, lVar25, i84, jVar24), new C3042a(z67, z68, i66, i67, i68, R.string.gcm_body_battery_message_114, lVar25, i84, jVar24)));
        int iB6 = b(95, 80);
        int i85 = 64;
        p005kotlin.jvm.internal.j jVar25 = null;
        l lVar26 = null;
        C3042a c3042a43 = new C3042a(z57, z58, i58, i59, i64, R.string.gcm_body_battery_message_108, lVar26, i85, jVar25);
        C3042a c3042a44 = new C3042a(z57, z58, i58, i59, i64, R.string.gcm_body_battery_message_109, lVar26, i85, jVar25);
        C3042a c3042a45 = new C3042a(z57, z58, i58, i59, i64, R.string.gcm_body_battery_message_110, lVar26, i85, jVar25);
        int i86 = 64;
        boolean z69 = false;
        boolean z73 = true;
        l lVar27 = null;
        sparseArray3.append(iB6, x.k(c3042a43, c3042a44, c3042a45, new C3042a(z69, z73, i66, i67, i68, R.string.gcm_body_battery_message_108, lVar27, i86, null), new C3042a(z69, z73, i66, i67, i68, R.string.gcm_body_battery_message_109, lVar27, i86, 0 == true ? 1 : 0), new C3042a(z69, z73, i66, i67, i68, R.string.gcm_body_battery_message_110, lVar27, i86, 0 == true ? 1 : 0)));
        linkedHashMap.put(eVar, sparseArray3);
        d.C0331d c0331d = d.C0331d.f21622c;
        SparseArray sparseArray4 = new SparseArray(6);
        int i87 = R.string.gcm_body_battery_message_81;
        int i88 = R.string.gcm_body_battery_message_85;
        int i89 = R.string.gcm_body_battery_message_82;
        int i93 = 64;
        p005kotlin.jvm.internal.j jVar26 = null;
        boolean z74 = true;
        boolean z75 = true;
        l lVar28 = null;
        int i94 = R.string.gcm_body_battery_message_81;
        int i95 = R.string.gcm_body_battery_message_85;
        int i96 = R.string.gcm_body_battery_message_82;
        int i97 = 64;
        p005kotlin.jvm.internal.j jVar27 = null;
        boolean z76 = false;
        boolean z77 = true;
        sparseArray4.append(0, x.k(new C3042a(true, true, i87, i88, i89, R.string.gcm_body_battery_message_142, null, 64, null), new C3042a(z74, z75, i87, i88, i89, R.string.gcm_body_battery_message_143, lVar28, i93, jVar26), new C3042a(z74, z75, i87, i88, i89, R.string.gcm_body_battery_message_144, lVar28, i93, jVar26), new C3042a(false, true, i94, i95, i96, R.string.gcm_body_battery_message_142, null, 64, null), new C3042a(z76, z77, i94, i95, i96, R.string.gcm_body_battery_message_143, 0 == true ? 1 : 0, i97, jVar27), new C3042a(z76, z77, i94, i95, i96, R.string.gcm_body_battery_message_144, 0 == true ? 1 : 0, i97, jVar27)));
        int i98 = 64;
        p005kotlin.jvm.internal.j jVar28 = null;
        boolean z78 = true;
        boolean z79 = true;
        l lVar29 = null;
        C3042a c3042a46 = new C3042a(z78, z79, i87, i88, i89, R.string.gcm_body_battery_message_139, lVar29, i98, jVar28);
        C3042a c3042a47 = new C3042a(z78, z79, i87, i88, i89, R.string.gcm_body_battery_message_105, lVar29, i98, jVar28);
        C3042a c3042a48 = new C3042a(z78, z79, i87, i88, i89, R.string.gcm_body_battery_message_141, lVar29, i98, jVar28);
        C3042a c3042a49 = new C3042a(z78, z79, i87, i88, i89, R.string.gcm_body_battery_message_60, lVar29, i98, jVar28);
        int i99 = 64;
        p005kotlin.jvm.internal.j jVar29 = null;
        boolean z83 = false;
        boolean z84 = true;
        l lVar30 = null;
        sparseArray4.append(7, x.k(c3042a46, c3042a47, c3042a48, c3042a49, new C3042a(z83, z84, i94, i95, i96, R.string.gcm_body_battery_message_139, lVar30, i99, jVar29), new C3042a(z83, z84, i94, i95, i96, R.string.gcm_body_battery_message_105, lVar30, i99, jVar29), new C3042a(z83, z84, i94, i95, i96, R.string.gcm_body_battery_message_141, lVar30, i99, jVar29), new C3042a(z83, z84, i94, i95, i96, R.string.gcm_body_battery_message_60, lVar30, i99, jVar29)));
        int i100 = 64;
        p005kotlin.jvm.internal.j jVar30 = null;
        l lVar31 = null;
        C3042a c3042a50 = new C3042a(z78, z79, i87, i88, i89, R.string.gcm_body_battery_message_135, lVar31, i100, jVar30);
        C3042a c3042a51 = new C3042a(z78, z79, i87, i88, i89, R.string.gcm_body_battery_message_136, lVar31, i100, jVar30);
        C3042a c3042a52 = new C3042a(z78, z79, i87, i88, i89, R.string.gcm_body_battery_message_137, lVar31, i100, jVar30);
        C3042a c3042a53 = new C3042a(z78, z79, i87, i88, i89, R.string.gcm_body_battery_message_138, lVar31, i100, jVar30);
        int i101 = 64;
        p005kotlin.jvm.internal.j jVar31 = null;
        boolean z85 = false;
        boolean z86 = true;
        l lVar32 = null;
        sparseArray4.append(15, x.k(c3042a50, c3042a51, c3042a52, c3042a53, new C3042a(z85, z86, i94, i95, i96, R.string.gcm_body_battery_message_135, lVar32, i101, jVar31), new C3042a(z85, z86, i94, i95, i96, R.string.gcm_body_battery_message_136, lVar32, i101, jVar31), new C3042a(z85, z86, i94, i95, i96, R.string.gcm_body_battery_message_137, lVar32, i101, jVar31), new C3042a(z85, z86, i94, i95, i96, R.string.gcm_body_battery_message_138, lVar32, i101, jVar31)));
        int iB7 = b(35, 30);
        int i102 = 64;
        p005kotlin.jvm.internal.j jVar32 = null;
        l lVar33 = null;
        C3042a c3042a54 = new C3042a(z78, z79, i87, i88, i89, R.string.gcm_body_battery_message_132, lVar33, i102, jVar32);
        C3042a c3042a55 = new C3042a(z78, z79, i87, i88, i89, R.string.gcm_body_battery_message_133, lVar33, i102, jVar32);
        C3042a c3042a56 = new C3042a(z78, z79, i87, i88, i89, R.string.gcm_body_battery_message_134, lVar33, i102, jVar32);
        int i103 = 64;
        p005kotlin.jvm.internal.j jVar33 = null;
        boolean z87 = false;
        boolean z88 = true;
        l lVar34 = null;
        sparseArray4.append(iB7, x.k(c3042a54, c3042a55, c3042a56, new C3042a(z87, z88, i94, i95, i96, R.string.gcm_body_battery_message_132, lVar34, i103, jVar33), new C3042a(z87, z88, i94, i95, i96, R.string.gcm_body_battery_message_133, lVar34, i103, jVar33), new C3042a(z87, z88, i94, i95, i96, R.string.gcm_body_battery_message_134, lVar34, i103, jVar33)));
        int iB8 = b(50, 45);
        int i104 = 64;
        p005kotlin.jvm.internal.j jVar34 = null;
        l lVar35 = null;
        C3042a c3042a57 = new C3042a(z78, z79, i87, i88, i89, R.string.gcm_body_battery_message_128, lVar35, i104, jVar34);
        C3042a c3042a58 = new C3042a(z78, z79, i87, i88, i89, R.string.gcm_body_battery_message_129, lVar35, i104, jVar34);
        C3042a c3042a59 = new C3042a(z78, z79, i87, i88, i89, R.string.gcm_body_battery_message_130, lVar35, i104, jVar34);
        C3042a c3042a60 = new C3042a(z78, z79, i87, i88, i89, R.string.gcm_body_battery_message_131, lVar35, i104, jVar34);
        boolean z89 = false;
        boolean z93 = true;
        sparseArray4.append(iB8, x.k(c3042a57, c3042a58, c3042a59, c3042a60, new C3042a(z89, z93, i94, i95, i96, R.string.gcm_body_battery_message_128, lVar34, i103, jVar33), new C3042a(z89, z93, i94, i95, i96, R.string.gcm_body_battery_message_129, lVar34, i103, jVar33), new C3042a(z89, z93, i94, i95, i96, R.string.gcm_body_battery_message_130, lVar34, i103, jVar33), new C3042a(z89, z93, i94, i95, i96, R.string.gcm_body_battery_message_131, lVar34, i103, jVar33)));
        int iB9 = b(95, 65);
        int i105 = 64;
        p005kotlin.jvm.internal.j jVar35 = null;
        l lVar36 = null;
        C3042a c3042a61 = new C3042a(z78, z79, i87, i88, i89, R.string.gcm_body_battery_message_125, lVar36, i105, jVar35);
        C3042a c3042a62 = new C3042a(z78, z79, i87, i88, i89, R.string.gcm_body_battery_message_126, lVar36, i105, jVar35);
        C3042a c3042a63 = new C3042a(z78, z79, i87, i88, i89, R.string.gcm_body_battery_message_127, lVar36, i105, jVar35);
        boolean z94 = false;
        boolean z95 = true;
        sparseArray4.append(iB9, x.k(c3042a61, c3042a62, c3042a63, new C3042a(z94, z95, i94, i95, i96, R.string.gcm_body_battery_message_125, lVar34, i103, jVar33), new C3042a(z94, z95, i94, i95, i96, R.string.gcm_body_battery_message_126, lVar34, i103, jVar33), new C3042a(z94, z95, i94, i95, i96, R.string.gcm_body_battery_message_127, lVar34, i103, jVar33)));
        linkedHashMap.put(c0331d, sparseArray4);
        d.f fVar = d.f.f21624c;
        SparseArray sparseArray5 = new SparseArray(5);
        l lVar37 = f161118f;
        l lVar38 = f161121i;
        int i106 = 0;
        C3042a c3042a64 = new C3042a(false, true, 0, i106, 0, R.string.gcm_body_battery_message_154, a(lVar37, lVar38), 28, null);
        l lVar39 = f161117e;
        l lVar40 = f161120h;
        int i107 = 0;
        int i108 = R.string.gcm_body_battery_message_71;
        C3042a c3042a65 = new C3042a(false, true, i106, 0 == true ? 1 : 0, i107, i108, a(lVar39, lVar40), 28, null);
        l lVar41 = f161116d;
        l lVar42 = f161119g;
        int i109 = 0;
        int i110 = R.string.gcm_body_battery_message_72;
        sparseArray5.append(0, x.k(c3042a64, c3042a65, new C3042a(false, true, 0 == true ? 1 : 0, i107, i109, i110, a(lVar41, lVar42), 28, null)));
        int iB10 = b(15, 20);
        l lVarA = a(lVar37, lVar38);
        int i111 = 28;
        p005kotlin.jvm.internal.j jVar36 = null;
        boolean z96 = true;
        int i112 = 0;
        int i113 = 0;
        C3042a c3042a66 = new C3042a(0 == true ? 1 : 0, z96, i109, i112, i113, R.string.gcm_body_battery_message_151, lVarA, i111, jVar36);
        l lVarA2 = a(lVar39, lVar40);
        C3042a c3042a67 = new C3042a(0 == true ? 1 : 0, z96, i109, i112, i113, R.string.gcm_body_battery_message_152, lVarA2, i111, jVar36);
        l lVarA3 = a(lVar41, lVar42);
        sparseArray5.append(iB10, x.k(c3042a66, c3042a67, new C3042a(0 == true ? 1 : 0, z96, i109, i112, i113, R.string.gcm_body_battery_message_153, lVarA3, i111, jVar36)));
        int iB11 = b(35, 40);
        l lVarA4 = a(lVar37, lVar38);
        C3042a c3042a68 = new C3042a(0 == true ? 1 : 0, z96, i109, i112, i113, R.string.gcm_body_battery_message_149, lVarA4, i111, jVar36);
        l lVarA5 = a(lVar39, lVar40);
        C3042a c3042a69 = new C3042a(0 == true ? 1 : 0, z96, i109, i112, i113, R.string.gcm_body_battery_message_65, lVarA5, i111, jVar36);
        l lVarA6 = a(lVar41, lVar42);
        sparseArray5.append(iB11, x.k(c3042a68, c3042a69, new C3042a(0 == true ? 1 : 0, z96, i109, i112, i113, R.string.gcm_body_battery_message_150, lVarA6, i111, jVar36)));
        int iB12 = b(50, 60);
        int i114 = 0;
        int i115 = R.string.gcm_body_battery_message_147;
        Object[] objArr5 = 0 == true ? 1 : 0;
        C3042a c3042a70 = new C3042a(false, true, 0 == true ? 1 : 0, i114, objArr5, i115, a(lVar37, lVar38), 28, null);
        int i116 = 0;
        int i117 = R.string.gcm_body_battery_message_62;
        int i118 = R.string.gcm_body_battery_message_148;
        Object[] objArr6 = 0 == true ? 1 : 0;
        sparseArray5.append(iB12, x.k(c3042a70, new C3042a(false, true, i114, 0 == true ? 1 : 0, i116, i117, a(lVar39, lVar40), 28, null), new C3042a(false, true, objArr6, i116, 0, i118, a(lVar41, lVar42), 28, null)));
        int iB13 = b(95, 80);
        int i119 = 0;
        int i120 = R.string.gcm_body_battery_message_145;
        Object[] objArr7 = 0 == true ? 1 : 0;
        int i121 = R.string.gcm_body_battery_message_146;
        Object[] objArr8 = 0 == true ? 1 : 0;
        sparseArray5.append(iB13, x.k(new C3042a(false, true, 0 == true ? 1 : 0, i119, objArr7, i120, a(lVar41, lVar42), 28, null), new C3042a(false, true, i119, objArr8, 0, i121, a(lVar41, lVar42), 28, null)));
        linkedHashMap.put(fVar, sparseArray5);
    }

    public final l a(l lVar, l lVar2) {
        return this.f161123b == 2.0d ? lVar2 : lVar;
    }

    public final int b(int i14, int i15) {
        return this.f161123b == 2.0d ? i15 : i14;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u0014\u0010\u0017\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u0014\u0010\u0018\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\rR\u0014\u0010\u0019\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u0014\u0010\u001a\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\rR\u0014\u0010\u001b\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\rR\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\rR\u0014\u0010\u001d\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\rR\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\rR\u0014\u0010\u001f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\rR\u0014\u0010 \u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\rR\u0014\u0010!\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\rR\u0014\u0010\"\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\rR\u0014\u0010#\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\rR\u0014\u0010$\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\rR\u0014\u0010%\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\rR\u0014\u0010&\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\rR\u0014\u0010'\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\rR\u0014\u0010(\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\rR\u0014\u0010)\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\rR\u0014\u0010*\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\rR\u0014\u0010+\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\rR\u0014\u0010,\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\rR\u0014\u0010-\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\rR\u0014\u0010.\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\rR\u0014\u0010/\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\rR\u0014\u00100\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\rR\u0014\u00101\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010\rR\u0014\u00102\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\rR\u0014\u00103\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010\rR\u0014\u00104\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010\rR\u0014\u00105\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u0010\rR\u0014\u00106\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u0010\rR\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010;\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00109R\u0014\u0010<\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00109R\u0014\u0010=\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00109R\u0014\u0010>\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00109¨\u0006?"}, d2 = {"Lsx/a$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "TOTAL_MEASURED_TIME_THRESHOLD_HOURS", "J", "TOTAL_MEASURED_TIME_THRESHOLD_MILLIS", "", "BEFORE_WAKEUP_SUB_KEY_0", "I", "BEFORE_WAKEUP_SUB_KEY_7", "BEFORE_WAKEUP_SUB_KEY_25", "BEFORE_WAKEUP_SUB_KEY_50", "BEFORE_WAKEUP_SUB_KEY_75", "BEFORE_WAKEUP_SUB_KEY_95", "AFTER_WAKEUP_SUB_KEY_0", "AFTER_WAKEUP_SUB_KEY_7", "AFTER_WAKEUP_SUB_KEY_25", "AFTER_WAKEUP_SUB_KEY_40", "AFTER_WAKEUP_SUB_KEY_45", "AFTER_WAKEUP_SUB_KEY_65", "AFTER_WAKEUP_SUB_KEY_80", "AFTER_WAKEUP_SUB_KEY_95", "NOON_UNTIL_FIVE_PM_SUB_KEY_0", "NOON_UNTIL_FIVE_PM_SUB_KEY_7", "NOON_UNTIL_FIVE_PM_SUB_KEY_15", "NOON_UNTIL_FIVE_PM_SUB_KEY_30", "NOON_UNTIL_FIVE_PM_SUB_KEY_45", "NOON_UNTIL_FIVE_PM_SUB_KEY_55", "NOON_UNTIL_FIVE_PM_SUB_KEY_65", "NOON_UNTIL_FIVE_PM_SUB_KEY_70", "NOON_UNTIL_FIVE_PM_SUB_KEY_80", "NOON_UNTIL_FIVE_PM_SUB_KEY_95", "FIVE_PM_UNTIL_SLEEP_SUB_KEY_0", "FIVE_PM_UNTIL_SLEEP_SUB_KEY_7", "FIVE_PM_UNTIL_SLEEP_SUB_KEY_15", "FIVE_PM_UNTIL_SLEEP_SUB_KEY_30", "FIVE_PM_UNTIL_SLEEP_SUB_KEY_35", "FIVE_PM_UNTIL_SLEEP_SUB_KEY_45", "FIVE_PM_UNTIL_SLEEP_SUB_KEY_50", "FIVE_PM_UNTIL_SLEEP_SUB_KEY_65", "FIVE_PM_UNTIL_SLEEP_SUB_KEY_95", "PAST_DAY_SUB_KEY_0", "PAST_DAY_SUB_KEY_15", "PAST_DAY_SUB_KEY_20", "PAST_DAY_SUB_KEY_35", "PAST_DAY_SUB_KEY_40", "PAST_DAY_SUB_KEY_50", "PAST_DAY_SUB_KEY_60", "PAST_DAY_SUB_KEY_80", "PAST_DAY_SUB_KEY_95", "Lj23/l;", "DRAINED_RANGE_LOW", "Lj23/l;", "DRAINED_RANGE_MEDIUM", "DRAINED_RANGE_HIGH", "DRAINED_RANGE_LOW_V2", "DRAINED_RANGE_MEDIUM_V2", "DRAINED_RANGE_HIGH_V2", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: sx.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lsx/a$a;", "", "", "sleepConfirmed", "moreInfo", "", "firstSentenceIncreasedResId", "firstSentenceConstantResId", "firstSentenceDecreasedResId", "secondSentenceResId", "Lj23/l;", "bbDrainedRange", "<init>", "(ZZIIIILj23/l;)V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3042a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f161125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f161126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f161127c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f161128d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f161129e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f161130f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final l f161131g;

        public /* synthetic */ C3042a(boolean z14, boolean z15, int i14, int i15, int i16, int i17, l lVar, int i18, p005kotlin.jvm.internal.j jVar) {
            this(z14, z15, (i18 & 4) != 0 ? -1 : i14, (i18 & 8) != 0 ? -1 : i15, (i18 & 16) != 0 ? -1 : i16, i17, (i18 & 64) != 0 ? null : lVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3042a)) {
                return false;
            }
            C3042a c3042a = (C3042a) obj;
            return this.f161125a == c3042a.f161125a && this.f161126b == c3042a.f161126b && this.f161127c == c3042a.f161127c && this.f161128d == c3042a.f161128d && this.f161129e == c3042a.f161129e && this.f161130f == c3042a.f161130f && s.g(this.f161131g, c3042a.f161131g);
        }

        public final int hashCode() {
            int iD = q2.d(this.f161130f, q2.d(this.f161129e, q2.d(this.f161128d, q2.d(this.f161127c, f.g(Boolean.hashCode(this.f161125a) * 31, 31, this.f161126b), 31), 31), 31), 31);
            l lVar = this.f161131g;
            return iD + (lVar == null ? 0 : lVar.hashCode());
        }

        public final String toString() {
            StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("BBMessage(sleepConfirmed=", ", moreInfo=", ", firstSentenceIncreasedResId=", this.f161125a, this.f161126b);
            e0.m(this.f161127c, this.f161128d, ", firstSentenceConstantResId=", ", firstSentenceDecreasedResId=", sbM);
            e0.m(this.f161129e, this.f161130f, ", secondSentenceResId=", ", bbDrainedRange=", sbM);
            sbM.append(this.f161131g);
            sbM.append(")");
            return sbM.toString();
        }

        public C3042a(boolean z14, boolean z15, int i14, int i15, int i16, int i17, l lVar) {
            this.f161125a = z14;
            this.f161126b = z15;
            this.f161127c = i14;
            this.f161128d = i15;
            this.f161129e = i16;
            this.f161130f = i17;
            this.f161131g = lVar;
        }
    }
}
