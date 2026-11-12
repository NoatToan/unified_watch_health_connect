package ar2;

import am.j;
import android.os.Parcelable;
import androidx.lifecycle.j1;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p13.u;
import v.e0;
import wr2.m;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\nB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lar2/e;", "Lar2/a;", "Lar2/e$b;", "Landroidx/lifecycle/j1;", "savedStateHandle", "Ldr2/a;", "garminPayFacade", "<init>", "(Landroidx/lifecycle/j1;Ldr2/a;)V", "b", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends ar2.a<b> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f12589h = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qs2.e f12590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f12591g;

    public interface b {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lar2/e$b$a;", "Lar2/e$b;", "Lms2/f;", "product", "", "deviceUnitId", "<init>", "(Lms2/f;J)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ms2.f f12593a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f12594b;

            public a(ms2.f fVar, long j8) {
                fVar.getClass();
                this.f12593a = fVar;
                this.f12594b = j8;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f12593a.equals(aVar.f12593a) && this.f12594b == aVar.f12594b;
            }

            public final int hashCode() {
                return Long.hashCode(this.f12594b) + (this.f12593a.hashCode() * 31);
            }

            public final String toString() {
                return "NavigateToAddCard(product=" + this.f12593a + ", deviceUnitId=" + this.f12594b + ")";
            }
        }

        /* JADX INFO: renamed from: ar2.e$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lar2/e$b$b;", "Lar2/e$b;", "Lns2/a;", "Lms2/f;", "products", "", "deviceUnitId", "", "deviceName", "<init>", "(Lns2/a;JLjava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C0179b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ns2.a<ms2.f> f12595a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f12596b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f12597c;

            static {
                Parcelable.Creator<ns2.a<?>> creator = ns2.a.CREATOR;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0179b(ns2.a<? extends ms2.f> aVar, long j8, String str) {
                aVar.getClass();
                str.getClass();
                this.f12595a = aVar;
                this.f12596b = j8;
                this.f12597c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0179b)) {
                    return false;
                }
                C0179b c0179b = (C0179b) obj;
                return this.f12595a.equals(c0179b.f12595a) && this.f12596b == c0179b.f12596b && this.f12597c.equals(c0179b.f12597c);
            }

            public final int hashCode() {
                return this.f12597c.hashCode() + q6.f.e(this.f12595a.hashCode() * 31, 31, this.f12596b);
            }

            public final String toString() {
                StringBuilder sb3 = new StringBuilder("NavigateToSelectProduct(products=");
                sb3.append(this.f12595a);
                sb3.append(", deviceUnitId=");
                sb3.append(this.f12596b);
                return e0.h(sb3, ", deviceName=", this.f12597c, ")");
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lar2/e$b$c;", "Lar2/e$b;", "", "displayName", "<init>", "(Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f12598a;

            public c(String str) {
                str.getClass();
                this.f12598a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f12598a.equals(((c) obj).f12598a);
            }

            public final int hashCode() {
                return this.f12598a.hashCode();
            }

            public final String toString() {
                return j.m("ShowAllowedForMBTesterToast(displayName=", this.f12598a, ")");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j1 j1Var, dr2.a aVar) {
        super(j1Var, aVar);
        j1Var.getClass();
        aVar.getClass();
        this.f12590f = (qs2.e) j1Var.a("extra.category");
        ns2.a aVarQ = (ns2.a) j1Var.a("extra.operators");
        aVarQ = aVarQ == null ? gg.b.q(false) : aVarQ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : aVarQ.f127815a) {
            if (u.z(((ms2.e) obj).getF206681b(), this.f12590f)) {
                arrayList.add(obj);
            }
        }
        this.f12591g = arrayList;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lar2/e$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f12592a;

        private a() {
            hn2.f fVar = hn2.f.f84562a;
            fVar.getClass();
            this.f12592a = new m(fVar, "SelectOperatorViewModel");
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }
}
