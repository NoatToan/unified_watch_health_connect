package jw;

import am.x0;
import com.garmin.android.apps.connectmobile.a3;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.z2;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u001b\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Ljw/d0;", "Lew/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "operation", "Ljw/d0$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b;Ljw/d0$b;)V", "a", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 extends ew.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f101238k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f101239l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f101240j;

    public interface b {
        void a(to.c cVar);
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.biz.tasks.UserStatisticsTask", f = "UserStatisticsTask.kt", l = {32}, m = "executeBackgroundWork", v = 2)
    public static final class c extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f101241a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f101243c;

        public c(t13.d<? super c> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f101241a = obj;
            this.f101243c |= Integer.MIN_VALUE;
            return d0.this.d(this);
        }
    }

    static {
        new a(null);
        f101238k = x0.D.f4358a;
        f101239l = x0.Y.f4358a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, b bVar2) {
        super(bVar);
        bVar.getClass();
        bVar2.getClass();
        this.f101240j = bVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i14 = cVar.f101243c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar.f101243c = i14 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objJ = cVar.f101241a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar.f101243c;
        if (i15 == 0) {
            o13.r.b(objJ);
            z2.f49779b.getClass();
            z2 z2VarA = z2.a.a();
            cVar.f101243c = 1;
            objJ = f0.J(z2VarA, new a3(z2VarA, "bottomTime", f101238k, true, "daily", f101239l, null), cVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
            }
            u0.r();
            return null;
        }
        List list = (List) ((v2.b) v2Var).f47386a;
        list.getClass();
        Iterator it = list.iterator();
        long jC = 0;
        while (it.hasNext()) {
            jC += ((o61.c) it.next()).C();
        }
        f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
        lVar.W1(jC);
        to.c cVar2 = new to.c();
        cVar2.f165761b = jC;
        cVar2.f165760a = lVar.K3();
        this.f101240j.a(cVar2);
        return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Ljw/d0$a;", "", "<init>", "()V", "", "METRIC", "Ljava/lang/String;", "ACTIVITY_TYPE", "", "GROUP_BY_PARENT_ACTIVITY_TYPE", "Z", "AGGREGATION", "EXCLUDED_ACTIVITY_SUB_TYPE", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
