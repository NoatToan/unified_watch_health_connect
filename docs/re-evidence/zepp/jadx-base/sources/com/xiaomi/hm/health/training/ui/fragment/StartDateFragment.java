package com.xiaomi.hm.health.training.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter;
import com.xiaomi.hm.health.training.ui.adapter.CommonViewHolder;
import com.xiaomi.hm.health.training.ui.widget.LinearLayoutDecoration;
import com.xiaomi.hm.health.training.utils.ChineseDateUtils;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes21.dex */
public class StartDateFragment extends Fragment {
    private RecyclerView a;
    private Date b;

    public class a extends CommonRecycleAdapter<Date> {
        private int d;

        public a(int i, int i2, Date[] dateArr) {
            super(i, i2, dateArr);
        }

        private void c(int i) {
            this.d = i;
            notifyDataSetChanged();
        }

        @Override // com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bindViewHolder(CommonViewHolder commonViewHolder, Date date) {
            int i = R.id.tx_start_time;
            commonViewHolder.setText(i, TimeUtils.formatDate_E(StartDateFragment.this.getContext(), date, false, true));
            if (this.d == commonViewHolder.getAdapterPosition()) {
                commonViewHolder.setBackgroundResource(i, R.color.orange100);
                commonViewHolder.setTextColorRes(i, R.color.white100);
            } else {
                commonViewHolder.setBackgroundResource(i, R.color.s38);
                commonViewHolder.setTextColorRes(i, R.color.s2);
            }
        }

        @Override // com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onItemClick(Date date, int i) {
            StartDateFragment.this.b = date;
            c(i);
        }
    }

    private void b(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rcv_options);
        this.a = recyclerView;
        recyclerView.setNestedScrollingEnabled(false);
        this.a.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.a.addItemDecoration(new LinearLayoutDecoration(getContext(), 1, R.dimen.divider, R.color.s38));
        this.a.setHasFixedSize(true);
        Date[] dateByYearMonthWeek = ChineseDateUtils.getDateByYearMonthWeek(Calendar.getInstance().getTime());
        this.b = dateByYearMonthWeek[0];
        this.a.setAdapter(new a(R.layout.item_train_start_date, R.id.tx_start_time, dateByYearMonthWeek));
    }

    public Date getStartDate() {
        return this.b;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_init_choose, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        b(view);
        super.onViewCreated(view, bundle);
    }
}
