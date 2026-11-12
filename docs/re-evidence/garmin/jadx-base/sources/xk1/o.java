package xk1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import i3.e5;
import java.util.ArrayList;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lxk1/o;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lkotlin/Function1;", "Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;", "", "onZoneSelected", "<init>", "(Le23/l;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<PowerZonesDTO, Unit> f191270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f191271b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxk1/o$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "rootView", "<init>", "(Landroid/view/View;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f191272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f191273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f191274c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view2) {
            super(view2);
            view2.getClass();
            this.f191272a = (ImageView) view2.findViewById(R.id.icon);
            this.f191273b = (TextView) view2.findViewById(R.id.label_top);
            this.f191274c = (TextView) view2.findViewById(R.id.label_bottom);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(e23.l<? super PowerZonesDTO, Unit> lVar) {
        lVar.getClass();
        this.f191270a = lVar;
        this.f191271b = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f191271b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        c3 c3Var;
        f0Var.getClass();
        if (i14 == -1) {
            return;
        }
        PowerZonesDTO powerZonesDTO = (PowerZonesDTO) this.f191271b.get(i14);
        a aVar = f0Var instanceof a ? (a) f0Var : null;
        if (aVar != null) {
            powerZonesDTO.getClass();
            ImageView imageView = aVar.f191272a;
            imageView.getClass();
            imageView.setVisibility(8);
            TextView textView = aVar.f191273b;
            Context context = textView.getRootView().getContext();
            context.getClass();
            String str = powerZonesDTO.f43986a;
            String strK = "";
            if (str != null && str.length() != 0 && (c3Var = vk1.e.valueOf(str).f178605a) != null) {
                String strA = dh.b.A(context, c3Var);
                Locale locale = Locale.getDefault();
                locale.getClass();
                strK = d53.u.k(strA, locale);
            }
            textView.setText(strK);
            textView.setVisibility(0);
            TextView textView2 = aVar.f191274c;
            textView2.setText(textView2.getContext().getString(R.string.devices_lbl_watts_with_format, String.valueOf(powerZonesDTO.f43987b)));
            textView2.setVisibility(0);
        }
        f0Var.itemView.setOnClickListener(new wv2.h(7, this, powerZonesDTO));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.gcm4_training_plans_two_rows_item, viewGroup, false);
        viewE.getClass();
        return new a(viewE);
    }
}
