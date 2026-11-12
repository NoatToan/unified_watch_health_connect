package ho;

import am.x0;
import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lho/b;", "", "Lam/x0;", "activityType", "parentActivity", "<init>", "(Lam/x0;Lam/x0;)V", "a", "b", "Lho/b$a;", "Lho/b$b;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f84581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f84582b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lho/b$a;", "Lho/b;", "Lam/x0;", "parentActivity", "Ljr/p;", "primaryMetric", "<init>", "(Lam/x0;Ljr/p;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final x0 f84583c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final jr.p f84584d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x0 x0Var, jr.p pVar) {
            super(x0Var, x0Var, null);
            x0Var.getClass();
            this.f84583c = x0Var;
            this.f84584d = pVar;
        }

        @Override // ho.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public final x0 getF84582b() {
            return this.f84583c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f84583c == aVar.f84583c && this.f84584d == aVar.f84584d;
        }

        public final int hashCode() {
            int iHashCode = this.f84583c.hashCode() * 31;
            jr.p pVar = this.f84584d;
            return iHashCode + (pVar == null ? 0 : pVar.hashCode());
        }

        public final String toString() {
            return "AllChildActivities(parentActivity=" + this.f84583c + ", primaryMetric=" + this.f84584d + ")";
        }
    }

    /* JADX INFO: renamed from: ho.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lho/b$b;", "Lho/b;", "Lam/x0;", "activityType", "parentActivity", "<init>", "(Lam/x0;Lam/x0;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C1677b extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final x0 f84585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final x0 f84586d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1677b(x0 x0Var, x0 x0Var2) {
            super(x0Var, x0Var2, null);
            x0Var.getClass();
            x0Var2.getClass();
            this.f84585c = x0Var;
            this.f84586d = x0Var2;
        }

        @Override // ho.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public final x0 getF84581a() {
            return this.f84585c;
        }

        @Override // ho.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public final x0 getF84582b() {
            return this.f84586d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1677b)) {
                return false;
            }
            C1677b c1677b = (C1677b) obj;
            return this.f84585c == c1677b.f84585c && this.f84586d == c1677b.f84586d;
        }

        public final int hashCode() {
            return this.f84586d.hashCode() + (this.f84585c.hashCode() * 31);
        }

        public final String toString() {
            return "ChildActivity(activityType=" + this.f84585c + ", parentActivity=" + this.f84586d + ")";
        }
    }

    private b(x0 x0Var, x0 x0Var2) {
        this.f84581a = x0Var;
        this.f84582b = x0Var2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public x0 getF84581a() {
        return this.f84581a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public x0 getF84582b() {
        return this.f84582b;
    }

    public final String c(Context context) {
        context.getClass();
        x0 f84581a = getF84581a();
        l22.a aVar = new l22.a(context);
        f84581a.getClass();
        String strB = aVar.b(f84581a.f4360c);
        if (this instanceof a) {
            String string = context.getString(R.string.label_all_activity_name, strB);
            string.getClass();
            return string;
        }
        if (this instanceof C1677b) {
            return strB;
        }
        u0.r();
        return null;
    }

    public /* synthetic */ b(x0 x0Var, x0 x0Var2, p005kotlin.jvm.internal.j jVar) {
        this(x0Var, x0Var2);
    }
}
