package xw;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import p005kotlin.Metadata;
import r22.c1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxw/c;", "Lr22/c1;", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends c1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.a f192293h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i14, Drawable drawable, com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.a aVar) {
        super(i14, drawable);
        this.f192293h = aVar;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final void o(int i14, RecyclerView.f0 f0Var) {
        f0Var.getClass();
        int bindingAdapterPosition = f0Var.getBindingAdapterPosition();
        com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.a.C0494a c0494a = com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.a.f30928x;
        com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.a aVar = this.f192293h;
        aVar.u6((pd1.b) aVar.f98424d.f98402d.get(bindingAdapterPosition), Integer.valueOf(bindingAdapterPosition));
    }

    @Override // r22.c1
    public final boolean p(RecyclerView.f0 f0Var) {
        f0Var.getClass();
        return this.f192293h.f98432l;
    }
}
