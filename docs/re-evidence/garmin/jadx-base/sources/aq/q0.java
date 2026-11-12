package aq;

import android.widget.CheckBox;
import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectFragment$initHeader$2$1", f = "EditExercisesMultiSelectFragment.kt", l = {ModuleDescriptor.MODULE_VERSION, 158}, m = "invokeSuspend", v = 2)
public final class q0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f12163b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(n0 n0Var, t13.d<? super q0> dVar) {
        super(2, dVar);
        this.f12163b = n0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q0(this.f12163b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r5.E4(r4) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r5.x4(r4) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        return r0;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f12162a;
        if (i14 == 0) {
            o13.r.b(obj);
            n0 n0Var = this.f12163b;
            CheckBox checkBox = n0Var.f12065b;
            if (checkBox == null) {
                p005kotlin.jvm.internal.s.m("headerCheckbox");
                throw null;
            }
            if (checkBox.isChecked()) {
                EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModelU6 = n0Var.u6();
                this.f12162a = 2;
            } else {
                EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModelU7 = n0Var.u6();
                this.f12162a = 1;
            }
        } else {
            if (i14 != 1 && i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
