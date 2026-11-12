package t61;

import am.x0;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.i0;
import com.garmin.android.apps.connectmobile.g1;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.performance.stats.TrainingEffectDetailActivity;
import java.util.ArrayList;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.y;
import r53.c2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.TrainingEffectDetailActivity$fetchTrainingEffectSummary$1$1", f = "TrainingEffectDetailActivity.kt", l = {230}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f162772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrainingEffectDetailActivity f162773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o61.l f162774c;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/g3;", "Lo61/j;", "uiResource", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/g3;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.TrainingEffectDetailActivity$fetchTrainingEffectSummary$1$1$1", f = "TrainingEffectDetailActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<g3<? extends o61.j>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f162775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TrainingEffectDetailActivity f162776b;

        /* JADX INFO: renamed from: t61.l$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3063a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f162777a;

            static {
                int[] iArr = new int[fw.p.values().length];
                try {
                    iArr[fw.p.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[fw.p.SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[fw.p.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f162777a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TrainingEffectDetailActivity trainingEffectDetailActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f162776b = trainingEffectDetailActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f162776b, dVar);
            aVar.f162775a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(g3<? extends o61.j> g3Var, t13.d<? super Unit> dVar) {
            return ((a) create(g3Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            String string;
            g3 g3Var = (g3) this.f162775a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            int i14 = C3063a.f162777a[g3Var.f35300a.ordinal()];
            TrainingEffectDetailActivity trainingEffectDetailActivity = this.f162776b;
            if (i14 != 1) {
                Throwable th3 = null;
                if (i14 == 2) {
                    trainingEffectDetailActivity.hideProgressOverlay();
                    o61.j jVar = (o61.j) g3Var.f35301b;
                    if (!trainingEffectDetailActivity.isFinishing() && jVar != null) {
                        trainingEffectDetailActivity.ca(jVar.f129597a, jVar.f129598b);
                        TextView textView = trainingEffectDetailActivity.f40004c;
                        if (textView == null) {
                            s.m("mActivitySectionTitle");
                            throw null;
                        }
                        textView.setVisibility(0);
                        ComposeView composeView = trainingEffectDetailActivity.f40005d;
                        if (composeView == null) {
                            s.m("mListContainer");
                            throw null;
                        }
                        composeView.setVisibility(0);
                        ArrayList<com.garmin.android.apps.connectmobile.activities.newmodel.h> arrayListD1 = h0.d1(jVar.f129599c);
                        if (!arrayListD1.isEmpty()) {
                            int size = arrayListD1.size();
                            if (size == 1) {
                                string = trainingEffectDetailActivity.getString(R.string.activity_training_related_activity);
                                string.getClass();
                            } else if (size > 1) {
                                string = trainingEffectDetailActivity.getString(R.string.activity_training_related_activities);
                                string.getClass();
                            } else {
                                string = "";
                            }
                            TextView textView2 = trainingEffectDetailActivity.f40004c;
                            if (textView2 == null) {
                                s.m("mActivitySectionTitle");
                                throw null;
                            }
                            textView2.setText(string);
                            ArrayList arrayList = new ArrayList(y.r(arrayListD1, 10));
                            for (com.garmin.android.apps.connectmobile.activities.newmodel.h hVar : arrayListD1) {
                                long j8 = hVar.f29448a;
                                String str = hVar.f29449b;
                                x0 x0VarC = hVar.C();
                                x0VarC.getClass();
                                i0 i0Var = hVar.f29460m;
                                arrayList.add(new v61.a(j8, str, x0VarC, i0Var.X0, i0Var.Y0, i0Var.Z0, i0Var.f29484a));
                                th3 = th3;
                            }
                            Throwable th4 = th3;
                            ComposeView composeView2 = trainingEffectDetailActivity.f40005d;
                            if (composeView2 == null) {
                                s.m("mListContainer");
                                throw th4;
                            }
                            composeView2.setContent(new z3.e(1430057044, true, new t21.l(7, trainingEffectDetailActivity, arrayList)));
                        }
                    }
                } else {
                    if (i14 != 3) {
                        u0.r();
                        return null;
                    }
                    if (!trainingEffectDetailActivity.isFinishing()) {
                        trainingEffectDetailActivity.hideProgressOverlay();
                        g1.b(trainingEffectDetailActivity, com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
                    }
                }
            } else {
                trainingEffectDetailActivity.showProgressOverlay();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TrainingEffectDetailActivity trainingEffectDetailActivity, o61.l lVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f162773b = trainingEffectDetailActivity;
        this.f162774c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f162773b, this.f162774c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o13.l] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f162772a;
        if (i14 == 0) {
            o13.r.b(obj);
            TrainingEffectDetailActivity trainingEffectDetailActivity = this.f162773b;
            r rVar = (r) trainingEffectDetailActivity.f40019r.getValue();
            rVar.getClass();
            o61.l lVar = this.f162774c;
            lVar.getClass();
            r53.b bVarA = u.a(new c2(new q(rVar, lVar, null)), trainingEffectDetailActivity.getF158016a(), androidx.lifecycle.b0.b.STARTED);
            a aVar2 = new a(trainingEffectDetailActivity, null);
            this.f162772a = 1;
            if (r53.s.k(bVarA, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
