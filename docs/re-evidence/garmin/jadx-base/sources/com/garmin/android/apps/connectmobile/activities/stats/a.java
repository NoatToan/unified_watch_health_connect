package com.garmin.android.apps.connectmobile.activities.stats;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.repcounting.model.ExerciseSetsDTO;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import cw.s;
import cw.u;
import e23.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import t13.d;
import v13.e;
import v13.i;
import vb.h;
import x53.b;
import x53.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel$sendUpdateExercisesAsync$1", f = "EditExercisesMultiSelectViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditExercisesMultiSelectViewModel f29810b;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activities.stats.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel$sendUpdateExercisesAsync$1$2$1", f = "EditExercisesMultiSelectViewModel.kt", l = {139}, m = "invokeSuspend", v = 2)
    public static final class C0456a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f29811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ EditExercisesMultiSelectViewModel f29812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ExerciseSetsDTO f29813c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0456a(EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModel, ExerciseSetsDTO exerciseSetsDTO, d<? super C0456a> dVar) {
            super(2, dVar);
            this.f29812b = editExercisesMultiSelectViewModel;
            this.f29813c = exerciseSetsDTO;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C0456a(this.f29812b, this.f29813c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((C0456a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f29811a;
            ExerciseSetsDTO exerciseSetsDTO = this.f29813c;
            EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModel = this.f29812b;
            if (i14 == 0) {
                r.b(obj);
                s sVar = editExercisesMultiSelectViewModel.f29794f;
                long j8 = editExercisesMultiSelectViewModel.f29789a;
                this.f29811a = 1;
                sVar.getClass();
                obj = f0.J(sVar, new u(sVar, j8, exerciseSetsDTO, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                y0<g3<ExerciseSetsDTO>> y0Var = editExercisesMultiSelectViewModel.f29799k;
                g3.f35298f.getClass();
                y0Var.j(g3.a.d(exerciseSetsDTO));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                if (((v2.a) v2Var).f47383a instanceof NoNetworkException) {
                    editExercisesMultiSelectViewModel.f29799k.j(g3.a.a(g3.f35298f, null, new EditExercisesMultiSelectViewModel.NoNetworkAvailableException(), null, null, 13));
                } else {
                    editExercisesMultiSelectViewModel.f29799k.j(g3.a.a(g3.f35298f, null, new EditExercisesMultiSelectViewModel.UnableToSaveException(), null, null, 13));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModel, d<? super a> dVar) {
        super(2, dVar);
        this.f29810b = editExercisesMultiSelectViewModel;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new a(this.f29810b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.repcounting.model.e[] eVarArr;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f29809a;
        if (i14 == 0) {
            r.b(obj);
            EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModel = this.f29810b;
            ExerciseSetsDTO exerciseSetsDTO = editExercisesMultiSelectViewModel.f29791c;
            if (exerciseSetsDTO != null) {
                List<aq.u0> list = editExercisesMultiSelectViewModel.f29803o;
                ArrayList arrayList = new ArrayList(y.r(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((aq.u0) it.next()).f12253b);
                }
                com.garmin.android.apps.connectmobile.repcounting.model.e[] eVarArr2 = (com.garmin.android.apps.connectmobile.repcounting.model.e[]) arrayList.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.e[0]);
                exerciseSetsDTO.f41089a = (com.garmin.android.apps.connectmobile.repcounting.model.e[]) Arrays.copyOf(eVarArr2, eVarArr2.length);
            }
            ExerciseSetsDTO exerciseSetsDTO2 = editExercisesMultiSelectViewModel.f29791c;
            if (exerciseSetsDTO2 != null) {
                editExercisesMultiSelectViewModel.f29799k.j(g3.a.c(g3.f35298f));
                ExerciseSetsDTO exerciseSetsDTO3 = editExercisesMultiSelectViewModel.f29801m;
                if (exerciseSetsDTO3 == null || (eVarArr = exerciseSetsDTO3.f41089a) == null) {
                    eVarArr = new com.garmin.android.apps.connectmobile.repcounting.model.e[0];
                }
                ArrayList arrayList2 = new ArrayList();
                com.garmin.android.apps.connectmobile.repcounting.model.e[] eVarArr3 = exerciseSetsDTO2.f41089a;
                eVarArr3.getClass();
                for (com.garmin.android.apps.connectmobile.repcounting.model.e eVar : eVarArr3) {
                    eVar.getClass();
                    arrayList2.add(eVar);
                    int length = eVarArr.length;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= length) {
                            i15 = -1;
                            break;
                        }
                        if (p005kotlin.jvm.internal.s.g(eVarArr[i15].I(), eVar.I())) {
                            break;
                        }
                        i15++;
                    }
                    if (i15 != -1) {
                        com.garmin.android.apps.connectmobile.repcounting.model.e eVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.e) p13.u.L(i15 + 1, eVarArr);
                        boolean zF0 = eVar2 != null ? eVar2.f0() : false;
                        if (eVar2 != null && zF0) {
                            arrayList2.add(eVar2);
                        }
                    }
                }
                com.garmin.android.apps.connectmobile.repcounting.model.e[] eVarArr4 = (com.garmin.android.apps.connectmobile.repcounting.model.e[]) arrayList2.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.e[0]);
                exerciseSetsDTO2.f41089a = (com.garmin.android.apps.connectmobile.repcounting.model.e[]) Arrays.copyOf(eVarArr4, eVarArr4.length);
                c cVar = s0.f129406a;
                b bVar = b.f189152a;
                C0456a c0456a = new C0456a(editExercisesMultiSelectViewModel, exerciseSetsDTO2, null);
                this.f29809a = 1;
                if (ge1.b.e0(bVar, c0456a, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
