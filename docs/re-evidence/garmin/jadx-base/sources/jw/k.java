package jw;

import am.x0;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ljw/k;", "Lew/a;", "Lam/x0;", "activityType", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "operation", "Ljw/k$a;", "mCallback", "<init>", "(Lam/x0;Lcom/garmin/android/library/backgroundtaskmanagement/b;Ljw/k$a;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x0 f101270j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f101271k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ru1.d f101272l;

    public interface a {
        void a(String str);
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.biz.tasks.ExerciseListTranslationsTask", f = "ExerciseListTranslationsTask.kt", l = {20}, m = "executeBackgroundWork", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f101273a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f101275c;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f101273a = obj;
            this.f101275c |= Integer.MIN_VALUE;
            return k.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(x0 x0Var, com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, a aVar) {
        super(bVar);
        bVar.getClass();
        aVar.getClass();
        this.f101270j = x0Var;
        this.f101271k = aVar;
        this.f101272l = (ru1.d) KoinJavaComponent.get$default(ru1.d.class, null, null, 6, null);
    }

    @Override // ew.a, com.garmin.android.library.backgroundtaskmanagement.d
    public final void b() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f101275c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f101275c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objA = bVar.f101273a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f101275c;
        if (i15 == 0) {
            o13.r.b(objA);
            bVar.f101275c = 1;
            objA = ru1.d.a(this.f101272l, this.f101270j, bVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        v2 v2Var = (v2) objA;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA;
            }
            u0.r();
            return null;
        }
        String str = (String) ((v2.b) v2Var).f47386a;
        if (str == null || !(!d53.w.J(str))) {
            return com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA;
        }
        this.f101271k.a(str);
        return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
    }
}
