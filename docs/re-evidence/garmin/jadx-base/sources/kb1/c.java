package kb1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import db1.m;
import java.util.ArrayList;
import n23.j;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lkb1/c;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "<init>", "()V", "a", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f103816a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.a f103817b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkb1/c$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "itemView", "<init>", "(Lkb1/c;Landroid/view/View;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f103818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f103819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f103820c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, View view2) {
            super(view2);
            view2.getClass();
            this.f103820c = cVar;
            this.f103818a = (TextView) view2.findViewById(R.id.pregnancy_history_title);
            this.f103819b = (TextView) view2.findViewById(R.id.pregnancy_history_sub_title);
            view2.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            view2.getClass();
            c cVar = this.f103820c;
            com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.a aVar = cVar.f103817b;
            if (aVar != null) {
                m mVar = (m) cVar.f103816a.get(getBindingAdapterPosition());
                mVar.getClass();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.a.f40896f.info("Navigating to pregnancy details screen");
                kb1.a aVar2 = aVar.f40898b;
                if (aVar2 != null) {
                    aVar2.u(mVar);
                } else {
                    s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    throw null;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f103816a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        if (i14 != -1 && (f0Var instanceof a)) {
            a aVar = (a) f0Var;
            m mVar = (m) this.f103816a.get(i14);
            mVar.getClass();
            LocalDate deliveryDate = mVar.getDeliveryDate();
            if (deliveryDate == null && (deliveryDate = mVar.getEndDate()) == null) {
                deliveryDate = mVar.getDueDate();
            }
            TextView textView = aVar.f103818a;
            String title = mVar.getTitle();
            if (title == null) {
                title = aVar.itemView.getContext().getString(R.string.pregnancy_title) + StringUtils.SPACE + (deliveryDate != null ? Integer.valueOf(deliveryDate.getYear()) : null);
            }
            textView.setText(title);
            if (deliveryDate != null) {
                TextView textView2 = aVar.f103819b;
                j0 j0Var = j0.f23099a;
                DateTime dateTime = new DateTime(deliveryDate.toDate().getTime());
                j0Var.getClass();
                textView2.setText(j0.k(dateTime, 'M'));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(this, j.b(viewGroup, R.layout.pregnancy_history_list_item, viewGroup, false));
    }
}
