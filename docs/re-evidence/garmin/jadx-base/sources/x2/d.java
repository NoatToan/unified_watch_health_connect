package x2;

import com.google.firebase.analytics.FirebaseAnalytics;
import d4.k;
import d4.n;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;
import s5.w0;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0010BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lx2/d;", "", "", FirebaseAnalytics.Param.INDEX, "", "preText", "postText", "Ls5/w0;", "preSelection", "postSelection", "", "timeInMillis", "", "canMerge", "<init>", "(ILjava/lang/String;Ljava/lang/String;JJJZLkotlin/jvm/internal/j;)V", "b", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f188466i = new b(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f188467j = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f188470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f188471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f188472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f188473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f188474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x2.b f188475h;

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"x2/d$a", "Ld4/k;", "Lx2/d;", "", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements k<d, Object> {
        @Override // d4.k
        public final d a(Object obj) {
            obj.getClass();
            List list = (List) obj;
            Object obj2 = list.get(0);
            obj2.getClass();
            int iIntValue = ((Integer) obj2).intValue();
            Object obj3 = list.get(1);
            obj3.getClass();
            Object obj4 = list.get(2);
            obj4.getClass();
            Object obj5 = list.get(3);
            obj5.getClass();
            int iIntValue2 = ((Integer) obj5).intValue();
            Object obj6 = list.get(4);
            obj6.getClass();
            long jL = og.a.l(iIntValue2, ((Integer) obj6).intValue());
            Object obj7 = list.get(5);
            obj7.getClass();
            int iIntValue3 = ((Integer) obj7).intValue();
            Object obj8 = list.get(6);
            obj8.getClass();
            long jL2 = og.a.l(iIntValue3, ((Integer) obj8).intValue());
            Object obj9 = list.get(7);
            obj9.getClass();
            return new d(iIntValue, (String) obj3, (String) obj4, jL, jL2, ((Long) obj9).longValue(), false, 64, null);
        }

        @Override // d4.k
        public final Object b(n nVar, d dVar) {
            d dVar2 = dVar;
            Integer numValueOf = Integer.valueOf(dVar2.f188468a);
            String str = dVar2.f188469b;
            String str2 = dVar2.f188470c;
            long j8 = dVar2.f188471d;
            w0.a aVar = w0.f157315b;
            Integer numValueOf2 = Integer.valueOf((int) (j8 >> 32));
            Integer numValueOf3 = Integer.valueOf((int) (j8 & 4294967295L));
            long j14 = dVar2.f188472e;
            return x.k(numValueOf, str, str2, numValueOf2, numValueOf3, Integer.valueOf((int) (j14 >> 32)), Integer.valueOf((int) (4294967295L & j14)), Long.valueOf(dVar2.f188473f));
        }
    }

    private d(int i14, String str, String str2, long j8, long j14, long j15, boolean z14) {
        this.f188468a = i14;
        this.f188469b = str;
        this.f188470c = str2;
        this.f188471d = j8;
        this.f188472e = j14;
        this.f188473f = j15;
        this.f188474g = z14;
        if (str.length() == 0 && str2.length() == 0) {
            h.s("Either pre or post text must not be empty");
            throw null;
        }
        this.f188475h = (str.length() != 0 || str2.length() <= 0) ? (str.length() <= 0 || str2.length() != 0) ? x2.b.Replace : x2.b.Delete : x2.b.Insert;
    }

    public final x2.a a() {
        if (this.f188475h != x2.b.Delete) {
            return x2.a.NotByUser;
        }
        long j8 = this.f188472e;
        if (!w0.e(j8)) {
            return x2.a.NotByUser;
        }
        long j14 = this.f188471d;
        if (w0.e(j14)) {
            return ((int) (j14 >> 32)) > ((int) (j8 >> 32)) ? x2.a.Start : x2.a.End;
        }
        return (((int) (j14 >> 32)) == ((int) (j8 >> 32)) && ((int) (j14 >> 32)) == this.f188468a) ? x2.a.Inner : x2.a.NotByUser;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx2/d$b;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public d(int i14, String str, String str2, long j8, long j14, long j15, boolean z14, int i15, j jVar) {
        this(i14, str, str2, j8, j14, (i15 & 32) != 0 ? System.currentTimeMillis() : j15, (i15 & 64) != 0 ? true : z14, null);
    }

    public /* synthetic */ d(int i14, String str, String str2, long j8, long j14, long j15, boolean z14, j jVar) {
        this(i14, str, str2, j8, j14, j15, z14);
    }
}
