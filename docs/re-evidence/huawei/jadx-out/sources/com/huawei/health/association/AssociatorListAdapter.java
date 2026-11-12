package com.huawei.health.association;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.ddi;
import defpackage.gnf;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qre;
import defpackage.qri;
import defpackage.qrr;
import health.compact.a.CommonUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.LogUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes6.dex */
public class AssociatorListAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<gnf.e> f6196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnClickCallBack f6197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6198c;
    private Context d;
    private int e;

    public void a(OnClickCallBack onClickCallBack) {
        this.f6197b = onClickCallBack;
    }

    public void d(int i) {
        this.f6198c = i;
    }

    public void e(int i) {
        this.e = i;
    }

    public AssociatorListAdapter(Context context, int i, List<gnf.e> list) {
        ArrayList arrayList = new ArrayList();
        this.f6196a = arrayList;
        this.f6198c = -1;
        this.d = context;
        this.e = i;
        arrayList.clear();
        this.f6196a.addAll(njy.e(list) ? new ArrayList<>() : list);
    }

    public void b(List<gnf.e> list) {
        this.f6196a.clear();
        List<gnf.e> list2 = this.f6196a;
        if (njy.e(list)) {
            list = new ArrayList<>();
        }
        list2.addAll(list);
        this.f6196a.sort(Comparator.comparingLong(new ddi()));
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.associator_my_competition_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i) {
        final int bindingAdapterPosition = bVar.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            ReleaseLogUtil.a("R_AssociatorListAdapter", "onBindViewHolder RecyclerView NO_POSITION");
            return;
        }
        final gnf.e eVar = this.f6196a.get(bindingAdapterPosition);
        bVar.e(eVar);
        bVar.d.setOnCheckedChangeListener(null);
        bVar.d.setChecked(i == this.f6198c);
        bVar.d.setClickable(false);
        bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: ddg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31668b.b(bindingAdapterPosition, eVar, view);
            }
        });
    }

    public /* synthetic */ void b(int i, gnf.e eVar, View view) {
        ReleaseLogUtil.d("R_AssociatorListAdapter", "onBindViewHolder click currentPosition=", Integer.valueOf(i));
        int i2 = this.f6198c;
        if (i2 == i) {
            this.f6198c = -1;
            notifyItemChanged(i);
        } else {
            this.f6198c = i;
            if (i2 != -1) {
                notifyItemChanged(i2);
            }
            notifyItemChanged(this.f6198c);
        }
        OnClickCallBack onClickCallBack = this.f6197b;
        if (onClickCallBack == null || eVar == null) {
            return;
        }
        onClickCallBack.onClick(this.e, i, this.f6198c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.f6196a)) {
            return 0;
        }
        return this.f6196a.size();
    }

    static class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HealthTextView f6199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HealthTextView f6200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HealthTextView f6201c;
        public final CheckBox d;
        private final HealthTextView e;
        private final HealthTextView f;
        private final View j;

        public b(View view) {
            super(view);
            this.j = view.findViewById(R.id.my_competition_item_map);
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.my_competition_item_main_flag);
            this.f = healthTextView;
            this.f6199a = (HealthTextView) view.findViewById(R.id.my_competition_item_title);
            this.f6201c = (HealthTextView) view.findViewById(R.id.my_competition_item_goal);
            this.e = (HealthTextView) view.findViewById(R.id.my_competition_item_date);
            HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.my_competition_item_distance);
            this.f6200b = healthTextView2;
            healthTextView2.setTypeface(qrr.a());
            this.d = (CheckBox) view.findViewById(R.id.circular_checkbox);
            healthTextView.setBackgroundResource(LanguageUtil.ba(view.getContext()) ? R.drawable.health_my_competition_main_mark_rtl : R.drawable.health_my_competition_main_mark);
        }

        public void e(gnf.e eVar) {
            gnf.d next;
            gnf.c cVar;
            int length;
            if (eVar == null) {
                ReleaseLogUtil.e("R_AssociatorListAdapter", "init competition groupList is empty");
                return;
            }
            this.f6199a.setText(eVar.b());
            d(eVar);
            this.f.setVisibility(eVar.f() == 1 ? 0 : 8);
            List<gnf.d> listC = eVar.c();
            if (njy.e(listC)) {
                LogUtil.e("R_AssociatorListAdapter", "init competition groupList is empty");
                return;
            }
            Iterator<gnf.d> it = listC.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    cVar = null;
                    break;
                } else {
                    next = it.next();
                    if (njy.b(next.e())) {
                        cVar = next.e().get(0);
                        break;
                    }
                }
            }
            if (next == null || cVar == null || TextUtils.isEmpty(next.a()) || TextUtils.isEmpty(cVar.d())) {
                LogUtil.e("R_AssociatorListAdapter", "init competition groupBean or objectiveInfo is empty");
                return;
            }
            double dA = CommonUtils.a(next.a());
            if (UnitUtil.f()) {
                dA = UnitUtil.e(dA, 3);
                this.j.setBackgroundResource(R.drawable.sug_my_competition_distance_mi);
            } else {
                this.j.setBackgroundResource(R.drawable.sug_my_competition_distance);
            }
            double d = dA;
            if (UnitUtil.f() && eVar.g() == 1) {
                length = 4;
            } else {
                int iIndexOf = next.a().indexOf(".");
                length = next.a().length() - (iIndexOf >= 0 ? iIndexOf + 1 : 0);
            }
            this.f6200b.setText(UnitUtil.c(d, 1, 0, length, null));
            this.f6201c.setText(qre.a(R.string.IDS_competition_goal, DateFormatUtil.e(TimeUnit.SECONDS.toMillis(CommonUtils.j(cVar.d())), lsl.d(), DateFormatUtil.DateFormatType.DATE_FORMAT_HOUR_MINUTE_SEC)));
        }

        private void d(gnf.e eVar) {
            TimeZone timeZoneA = lsl.a(eVar.i());
            String strE = DateFormatUtil.e(eVar.d(), timeZoneA, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMMDD);
            long rawOffset = ((long) timeZoneA.getRawOffset()) / 3600000;
            String strA = qre.a(R.string.IDS_competition_gmt_value, rawOffset >= 0 ? Marker.ANY_NON_NULL_MARKER : Constants.LINK, UnitUtil.e(Math.abs(rawOffset), 1, 0));
            SpannableString spannableString = new SpannableString(String.format("%s %s", strE, strA));
            qri.b(spannableString, strA, R.color.emui_color_tertiary);
            this.e.setText(spannableString);
        }
    }
}
