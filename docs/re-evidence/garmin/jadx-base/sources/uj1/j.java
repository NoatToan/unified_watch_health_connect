package uj1;

import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;
import r22.c1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luj1/j;", "Lr22/c1;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends c1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b f171528h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i14, int i15, com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar, Resources resources, int i16, int i17) {
        super(resources, i14, i16, i15, i17);
        this.f171528h = bVar;
        resources.getClass();
    }

    @Override // r22.c1, androidx.recyclerview.widget.s.d
    public final int g(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
        recyclerView.getClass();
        f0Var.getClass();
        if (p(f0Var)) {
            return androidx.recyclerview.widget.s.d.k(0, 4);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final void o(int i14, RecyclerView.f0 f0Var) {
        List<l20.g> listA;
        f0Var.getClass();
        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar = this.f171528h;
        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.a aVar = bVar.f43719g;
        Object obj = null;
        yj1.f fVar = aVar != null ? (yj1.f) aVar.f43701b.get(f0Var.getBindingAdapterPosition()) : null;
        fVar.getClass();
        yj1.f.b bVar2 = (yj1.f.b) fVar;
        f12.l.f68084a.getClass();
        com.garmin.android.apps.connectmobile.userprofile.model.g gVarW0 = f12.l.a.a().W0();
        l20.a aVar2 = bVar2.f197539f;
        if (aVar2 != null && (listA = aVar2.A()) != null) {
            for (Object obj2 : listA) {
                if (p005kotlin.jvm.internal.s.g(((l20.g) obj2).getUserId(), gVarW0 != null ? gVarW0.f46857a : null)) {
                    obj = obj2;
                    break;
                }
            }
            obj = (l20.g) obj;
        }
        if (obj != null) {
            bVar.w6(Integer.valueOf(f0Var.getBindingAdapterPosition()));
        } else {
            int bindingAdapterPosition = f0Var.getBindingAdapterPosition();
            new androidx.appcompat.app.e.a(bVar.requireContext()).setTitle(bVar.getString(R.string.remove_contact_alert_title)).setMessage(bVar.getString(R.string.remove_assistance_contact_alert_message, bVar2.f197534a)).setPositiveButton(R.string.lbl_remove, new ew1.k(bVar, bVar2, bindingAdapterPosition, 5)).setNegativeButton(R.string.lbl_cancel, new ha1.c(bVar, bindingAdapterPosition, 3)).setOnCancelListener(new f20.f(bVar, bindingAdapterPosition, 2)).create().show();
        }
    }

    @Override // r22.c1
    public final boolean p(RecyclerView.f0 f0Var) {
        f0Var.getClass();
        return f0Var.getItemViewType() == 2;
    }
}
