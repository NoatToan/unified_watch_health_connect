package z12;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lz12/f;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lz12/e;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends RecyclerView.h<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f201393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.badges.service.model.p f201394b;

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        ArrayList arrayList = this.f201393a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        com.garmin.android.apps.connectmobile.badges.service.model.m mVar;
        e eVar = (e) f0Var;
        eVar.getClass();
        ArrayList arrayList = this.f201393a;
        if (arrayList == null || (mVar = (com.garmin.android.apps.connectmobile.badges.service.model.m) p13.h0.e0(i14, arrayList)) == null) {
            return;
        }
        com.garmin.android.apps.connectmobile.badges.service.model.p pVar = this.f201394b;
        Context context = eVar.itemView.getContext();
        context.getClass();
        zp0.c cVar = new zp0.c(context);
        cVar.f206565e = mVar.t();
        cVar.f206570j = 2131231128;
        cVar.f206576p = true;
        cVar.f206578r = "cache_availability_today";
        ImageView imageView = eVar.f201386a;
        cVar.h(imageView);
        imageView.setContentDescription(context.getString(R.string.lbl_badge_name, mVar.A()));
        imageView.setOnClickListener(new ew2.c(pVar, eVar, context, mVar, 25));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new e(viewGroup);
    }
}
