package kw;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import ds.e0;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0093\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0003\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lkw/f;", "", "", "name", Constants.ScionAnalytics.PARAM_LABEL, "", "minSystolic", "maxSystolic", "Lj23/l;", "systolicRange", "minDiastolic", "maxDiastolic", "diastolicRange", TtmlNode.ATTR_TTS_COLOR, "helpCategorySystolic", "helpCategoryJunction", "helpCategoryDiastolic", "Lkw/j;", TtmlNode.TAG_REGION, "Lkw/b;", "categoryNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILj23/l;IILj23/l;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkw/j;Lkw/b;)V", "a", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f106835o = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f106837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f106838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f106839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j23.l f106840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f106841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f106842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j23.l f106843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f106844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f106845j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f106846k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f106847l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f106848m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f106849n;

    public /* synthetic */ f(String str, String str2, int i14, int i15, j23.l lVar, int i16, int i17, j23.l lVar2, int i18, String str3, String str4, String str5, j jVar, b bVar, int i19, p005kotlin.jvm.internal.j jVar2) {
        this((i19 & 1) != 0 ? "" : str, (i19 & 2) != 0 ? "" : str2, (i19 & 4) != 0 ? -1 : i14, (i19 & 8) != 0 ? -1 : i15, (i19 & 16) != 0 ? new j23.l(-1, -1) : lVar, (i19 & 32) != 0 ? -1 : i16, (i19 & 64) != 0 ? -1 : i17, (i19 & 128) != 0 ? new j23.l(-1, -1) : lVar2, (i19 & 256) == 0 ? i18 : -1, (i19 & 512) != 0 ? "" : str3, (i19 & 1024) != 0 ? "" : str4, (i19 & 2048) == 0 ? str5 : "", (i19 & 4096) != 0 ? j.WORLD : jVar, (i19 & 8192) != 0 ? b.ONE : bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p005kotlin.jvm.internal.s.g(this.f106836a, fVar.f106836a) && p005kotlin.jvm.internal.s.g(this.f106837b, fVar.f106837b) && this.f106838c == fVar.f106838c && this.f106839d == fVar.f106839d && p005kotlin.jvm.internal.s.g(this.f106840e, fVar.f106840e) && this.f106841f == fVar.f106841f && this.f106842g == fVar.f106842g && p005kotlin.jvm.internal.s.g(this.f106843h, fVar.f106843h) && this.f106844i == fVar.f106844i && p005kotlin.jvm.internal.s.g(this.f106845j, fVar.f106845j) && p005kotlin.jvm.internal.s.g(this.f106846k, fVar.f106846k) && p005kotlin.jvm.internal.s.g(this.f106847l, fVar.f106847l) && this.f106848m == fVar.f106848m && this.f106849n == fVar.f106849n;
    }

    public final int hashCode() {
        return this.f106849n.hashCode() + ((this.f106848m.hashCode() + wr.g.j(wr.g.j(wr.g.j(q2.d(this.f106844i, (this.f106843h.hashCode() + q2.d(this.f106842g, q2.d(this.f106841f, (this.f106840e.hashCode() + q2.d(this.f106839d, q2.d(this.f106838c, wr.g.j(this.f106836a.hashCode() * 31, 31, this.f106837b), 31), 31)) * 31, 31), 31)) * 31, 31), 31, this.f106845j), 31, this.f106846k), 31, this.f106847l)) * 31);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("BloodPressureLevel(name=", this.f106836a, ", label=", this.f106837b, ", minSystolic=");
        e0.m(this.f106838c, this.f106839d, ", maxSystolic=", ", systolicRange=", sbI);
        sbI.append(this.f106840e);
        sbI.append(", minDiastolic=");
        sbI.append(this.f106841f);
        sbI.append(", maxDiastolic=");
        sbI.append(this.f106842g);
        sbI.append(", diastolicRange=");
        sbI.append(this.f106843h);
        sbI.append(", color=");
        wr.g.t(this.f106844i, ", helpCategorySystolic=", this.f106845j, ", helpCategoryJunction=", sbI);
        sn.a.t(sbI, this.f106846k, ", helpCategoryDiastolic=", this.f106847l, ", region=");
        sbI.append(this.f106848m);
        sbI.append(", categoryNumber=");
        sbI.append(this.f106849n);
        sbI.append(")");
        return sbI.toString();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"Lkw/f$a;", "", "<init>", "()V", "", "INVALID_NUMBER", "I", "", "EMPTY_STRING", "Ljava/lang/String;", "NORMAL", "HIGH_NORMAL", "GRADE_1", "GRADE_2", "ELEVATED", "STAGE_1_HIGH", "STAGE_2_HIGH", "HYPERTENSIVE_CRISIS", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: kw.f$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2060a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f106850a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f106851b;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.TWO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.THREE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.FOUR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.FIVE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f106850a = iArr;
                int[] iArr2 = new int[j.values().length];
                try {
                    iArr2[j.WORLD.ordinal()] = 1;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[j.US.ordinal()] = 2;
                } catch (NoSuchFieldError unused7) {
                }
                f106851b = iArr2;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public f(String str, String str2, int i14, int i15, j23.l lVar, int i16, int i17, j23.l lVar2, int i18, String str3, String str4, String str5, j jVar, b bVar) {
        str.getClass();
        str2.getClass();
        lVar.getClass();
        lVar2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        jVar.getClass();
        bVar.getClass();
        this.f106836a = str;
        this.f106837b = str2;
        this.f106838c = i14;
        this.f106839d = i15;
        this.f106840e = lVar;
        this.f106841f = i16;
        this.f106842g = i17;
        this.f106843h = lVar2;
        this.f106844i = i18;
        this.f106845j = str3;
        this.f106846k = str4;
        this.f106847l = str5;
        this.f106848m = jVar;
        this.f106849n = bVar;
    }

    public f() {
        this(null, null, 0, 0, null, 0, 0, null, 0, null, null, null, null, null, 16383, null);
    }
}
