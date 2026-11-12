package g62;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import java.io.File;
import o53.f0;
import okhttp3.internal.http.StatusLine;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg62/l;", "Landroidx/core/view/s;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements androidx.core.view.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b f76088a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.MultiSportOverviewFragment$createOptionsMenu$1$onMenuItemSelected$1", f = "MultiSportOverviewFragment.kt", l = {StatusLine.HTTP_MISDIRECTED_REQUEST, 429}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f76089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f76090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b f76091c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f76092d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b f76093e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b bVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f76093e = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f76093e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x009d  */
        /* JADX WARN: Code duplicated, block: B:36:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:39:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:43:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i14;
            boolean zC5;
            int i15;
            File file;
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b bVar;
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c cVarY6;
            WorkoutDetailsDTO workoutDetailsDTO;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i16 = this.f76092d;
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b bVar2 = this.f76093e;
            if (i16 != 0) {
                if (i16 == 1) {
                    zC5 = this.f76090b;
                    i15 = this.f76089a;
                    o13.r.b(obj);
                } else {
                    if (i16 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar = this.f76091c;
                    o13.r.b(obj);
                }
                com.garmin.android.apps.connectmobile.workouts.data.model.a aVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.a) obj;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.a aVar3 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.f49107t;
                WorkoutDetailsDTO workoutDetailsDTO2 = bVar.y6().f49138r;
                workoutDetailsDTO2.X = aVar2;
                workoutDetailsDTO2.T = aVar2 != null ? aVar2.getAudioNoteUuid() : null;
                cVarY6 = bVar2.y6();
                workoutDetailsDTO = cVarY6.f49138r;
                if (workoutDetailsDTO.f48040a == 0) {
                    cVarY6.f49141w.j(com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.d.f49195a);
                } else {
                    cVarY6.V4(workoutDetailsDTO);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.a aVar4 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.f49107t;
            i14 = (bVar2.w6().f182502b == null && bVar2.y6().f49138r.C().getAudioNoteUrl() == null) ? 0 : 1;
            bVar2.y6();
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar = bVar2.f49115h;
            if (fVar == null) {
                p005kotlin.jvm.internal.s.m("workoutTypeAdapter");
                throw null;
            }
            zC5 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c.c5(fVar.f49183h);
            if (zC5 || i14 == 0) {
                file = bVar2.w6().f182502b;
                if (file != null) {
                    this.f76091c = bVar2;
                    this.f76089a = i14;
                    this.f76090b = zC5;
                    this.f76092d = 2;
                    obj = bVar2.C6(file, this);
                    if (obj != aVar) {
                        bVar = bVar2;
                        com.garmin.android.apps.connectmobile.workouts.data.model.a aVar5 = (com.garmin.android.apps.connectmobile.workouts.data.model.a) obj;
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.a aVar6 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.f49107t;
                        WorkoutDetailsDTO workoutDetailsDTO3 = bVar.y6().f49138r;
                        workoutDetailsDTO3.X = aVar5;
                        workoutDetailsDTO3.T = aVar5 != null ? aVar5.getAudioNoteUuid() : null;
                    }
                }
                cVarY6 = bVar2.y6();
                workoutDetailsDTO = cVarY6.f49138r;
                if (workoutDetailsDTO.f48040a == 0) {
                    cVarY6.f49141w.j(com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.d.f49195a);
                } else {
                    cVarY6.V4(workoutDetailsDTO);
                }
                return Unit.INSTANCE;
            }
            this.f76089a = i14;
            this.f76090b = zC5;
            this.f76092d = 1;
            if (com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.u6(bVar2, this) != aVar) {
                i15 = i14;
            }
            return aVar;
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.a aVar7 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.f49107t;
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c cVarY7 = bVar2.y6();
            WorkoutDetailsDTO workoutDetailsDTO4 = cVarY7.f49138r;
            workoutDetailsDTO4.T = null;
            workoutDetailsDTO4.C().G();
            cVarY7.f49138r.C().F();
            bVar2.w6().f182502b = null;
            ComposeView composeView = bVar2.f49111d;
            if (composeView == null) {
                p005kotlin.jvm.internal.s.m("audioNoteView");
                throw null;
            }
            composeView.setVisibility(8);
            i14 = i15;
            file = bVar2.w6().f182502b;
            if (file != null) {
                this.f76091c = bVar2;
                this.f76089a = i14;
                this.f76090b = zC5;
                this.f76092d = 2;
                obj = bVar2.C6(file, this);
                if (obj != aVar) {
                    bVar = bVar2;
                    com.garmin.android.apps.connectmobile.workouts.data.model.a aVar8 = (com.garmin.android.apps.connectmobile.workouts.data.model.a) obj;
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.a aVar9 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.f49107t;
                    WorkoutDetailsDTO workoutDetailsDTO5 = bVar.y6().f49138r;
                    workoutDetailsDTO5.X = aVar8;
                    workoutDetailsDTO5.T = aVar8 != null ? aVar8.getAudioNoteUuid() : null;
                }
                return aVar;
            }
            cVarY6 = bVar2.y6();
            workoutDetailsDTO = cVarY6.f49138r;
            if (workoutDetailsDTO.f48040a == 0) {
                cVarY6.f49141w.j(com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.d.f49195a);
            } else {
                cVarY6.V4(workoutDetailsDTO);
            }
            return Unit.INSTANCE;
        }
    }

    public l(com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b bVar) {
        this.f76088a = bVar;
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        zl.a.f(menu, menuInflater, R.menu.workout_edit, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.save_workout);
        this.f76088a.f49120m = menuItemFindItem;
        if (menuItemFindItem != null) {
            menuItemFindItem.setEnabled(true);
        }
    }

    @Override // androidx.core.view.s
    public final boolean w5(MenuItem menuItem) {
        menuItem.getClass();
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b bVar = this.f76088a;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar = bVar.f49115h;
        if (fVar == null) {
            p005kotlin.jvm.internal.s.m("workoutTypeAdapter");
            throw null;
        }
        if (fVar.f49183h.size() >= 2) {
            ge1.b.T(f0.w(bVar), null, null, new a(bVar, null), 3);
            return true;
        }
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c cVarY6 = bVar.y6();
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar2 = bVar.f49115h;
        if (fVar2 == null) {
            p005kotlin.jvm.internal.s.m("workoutTypeAdapter");
            throw null;
        }
        boolean z14 = fVar2.f49183h.size() == 1;
        cVarY6.f49141w.j(com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.h.e.f49196a);
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c.f5(cVarY6, cVarY6.f49138r, 0, z14, 6);
        return true;
    }
}
