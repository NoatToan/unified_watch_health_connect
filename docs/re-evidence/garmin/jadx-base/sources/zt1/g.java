package zt1;

import am.j;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.List;
import java.util.Stack;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import xw1.m;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lzt1/g;", "", "Lxw1/c;", "trainingPlan", "<init>", "(Lxw1/c;)V", "b", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xw1.c f206991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Stack<b> f206992b;

    static {
        new a(null);
    }

    public g(xw1.c cVar) {
        cVar.getClass();
        this.f206991a = cVar;
        this.f206992b = new Stack<>();
    }

    public final void a(xw1.c cVar) {
        b bVar = new b(cVar, null, null, null, 14, null);
        Stack<b> stack = this.f206992b;
        stack.push(bVar);
        String strH = j.h(stack.size(), "addNewEditStep() ");
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "athletePlanId", strH);
    }

    public final void b(b bVar) {
        Stack<b> stack = this.f206992b;
        stack.push(bVar);
        String strH = j.h(stack.size(), "addNewEditStep() ");
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "athletePlanId", strH);
    }

    public final void c() {
        Stack<b> stack = this.f206992b;
        if (stack.isEmpty()) {
            return;
        }
        stack.pop();
        String strH = j.h(stack.size(), "clearCurrentEditStep() ");
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "athletePlanId", strH);
    }

    public final b d() {
        Stack<b> stack = this.f206992b;
        if (!stack.isEmpty()) {
            b bVarPeek = stack.peek();
            bVarPeek.getClass();
            return bVarPeek;
        }
        return new b(this.f206991a, null, null, null, 14, null);
    }

    public final void e(xw1.c cVar) {
        cVar.getClass();
        Stack<b> stack = this.f206992b;
        stack.clear();
        stack.push(new b(cVar, null, null, null, 14, null));
        String strH = j.h(stack.size(), "resetEditSteps() ");
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "athletePlanId", strH);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzt1/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lzt1/g$b;", "", "Lxw1/c;", "trainingPlan", "Lxw1/h;", "coachPlan", "", "coachPlansList", "Lxw1/m;", "goal", "<init>", "(Lxw1/c;Lxw1/h;Ljava/util/List;Lxw1/m;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public xw1.c f206993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public xw1.h f206994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<xw1.h> f206995c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public m f206996d;

        public /* synthetic */ b(xw1.c cVar, xw1.h hVar, List list, m mVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(cVar, (i14 & 2) != 0 ? null : hVar, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? null : mVar);
        }

        public static b a(b bVar) {
            xw1.c cVar = bVar.f206993a;
            xw1.h hVar = bVar.f206994b;
            List<xw1.h> list = bVar.f206995c;
            m mVar = bVar.f206996d;
            cVar.getClass();
            return new b(cVar, hVar, list, mVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f206993a, bVar.f206993a) && s.g(this.f206994b, bVar.f206994b) && s.g(this.f206995c, bVar.f206995c) && s.g(this.f206996d, bVar.f206996d);
        }

        public final int hashCode() {
            int iHashCode = this.f206993a.hashCode() * 31;
            xw1.h hVar = this.f206994b;
            int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
            List<xw1.h> list = this.f206995c;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            m mVar = this.f206996d;
            return iHashCode3 + (mVar != null ? mVar.hashCode() : 0);
        }

        public final String toString() {
            return "EditStack(trainingPlan=" + this.f206993a + ", coachPlan=" + this.f206994b + ", coachPlansList=" + this.f206995c + ", goal=" + this.f206996d + ")";
        }

        public b(xw1.c cVar, xw1.h hVar, List<xw1.h> list, m mVar) {
            cVar.getClass();
            this.f206993a = cVar;
            this.f206994b = hVar;
            this.f206995c = list;
            this.f206996d = mVar;
        }
    }
}
