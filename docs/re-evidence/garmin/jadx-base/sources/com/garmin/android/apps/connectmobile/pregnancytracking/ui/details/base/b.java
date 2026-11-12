package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import db1.m;
import java.util.ArrayList;
import n23.j;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/base/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "<init>", "()V", "a", "b", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f40537a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f40538b;

    public interface a {
        void I4(m mVar);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/base/b$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/base/b;Landroid/view/View;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class ViewOnClickListenerC0764b extends RecyclerView.f0 implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f40539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f40540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f40541c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewOnClickListenerC0764b(b bVar, View view2) {
            super(view2);
            view2.getClass();
            this.f40541c = bVar;
            this.f40539a = (TextView) view2.findViewById(R.id.pregnancy_title);
            this.f40540b = (TextView) view2.findViewById(R.id.pregnancy_sub_title);
            view2.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            view2.getClass();
            b bVar = this.f40541c;
            a aVar = bVar.f40538b;
            if (aVar != null) {
                aVar.I4((m) bVar.f40537a.get(getBindingAdapterPosition()));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f40537a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        String strA;
        String strA2;
        f0Var.getClass();
        if (i14 != -1 && (f0Var instanceof ViewOnClickListenerC0764b)) {
            ViewOnClickListenerC0764b viewOnClickListenerC0764b = (ViewOnClickListenerC0764b) f0Var;
            m mVar = (m) this.f40537a.get(i14);
            TextView textView = viewOnClickListenerC0764b.f40540b;
            TextView textView2 = viewOnClickListenerC0764b.f40539a;
            mVar.getClass();
            LocalDate deliveryDate = mVar.getDeliveryDate();
            if (deliveryDate == null && (deliveryDate = mVar.getEndDate()) == null) {
                deliveryDate = mVar.getDueDate();
            }
            if (mVar.getDeliveryDate() == null && mVar.getEndDate() == null) {
                tb1.c.a aVar = tb1.c.f163744a;
                i52.a.f91796a.getClass();
                ww0.a aVarL = i52.a.l();
                aVar.getClass();
                if (tb1.c.a.a(aVarL)) {
                    textView2.setText(viewOnClickListenerC0764b.itemView.getContext().getString(R.string.pregnancy_current_pregnancy));
                    LocalDate pregnancyCycleStart = mVar.getPregnancyCycleStart();
                    if (pregnancyCycleStart != null) {
                        LocalDate localDate = new LocalDate();
                        if (pregnancyCycleStart.getYear() == localDate.getYear()) {
                            j0 j0Var = j0.f23099a;
                            DateTime dateTime = new DateTime(pregnancyCycleStart.toDate().getTime());
                            j0Var.getClass();
                            strA = j0.k(dateTime, 'M');
                        } else {
                            strA = j0.a(new DateTime(pregnancyCycleStart.toDate().getTime()), 'M');
                        }
                        if (pregnancyCycleStart.getYear() == localDate.getYear()) {
                            j0 j0Var2 = j0.f23099a;
                            DateTime dateTime2 = new DateTime(localDate.toDate().getTime());
                            j0Var2.getClass();
                            strA2 = j0.k(dateTime2, 'M');
                        } else {
                            strA2 = j0.a(new DateTime(localDate.toDate().getTime()), 'M');
                        }
                        textView.setText(viewOnClickListenerC0764b.itemView.getContext().getString(R.string.format, strA, strA2));
                        return;
                    }
                    return;
                }
            }
            String title = mVar.getTitle();
            if (title == null) {
                title = viewOnClickListenerC0764b.itemView.getContext().getString(R.string.pregnancy_title) + StringUtils.SPACE + (deliveryDate != null ? Integer.valueOf(deliveryDate.getYear()) : null);
            }
            textView2.setText(title);
            if (deliveryDate != null) {
                j0 j0Var3 = j0.f23099a;
                DateTime dateTime3 = new DateTime(deliveryDate.toDate().getTime());
                j0Var3.getClass();
                textView.setText(j0.k(dateTime3, 'M'));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new ViewOnClickListenerC0764b(this, j.b(viewGroup, R.layout.pregnancy_list_item, viewGroup, false));
    }
}
