package com.huawei.pluginachievement.ui.adapter;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.njy;
import defpackage.ote;
import defpackage.ozr;
import defpackage.pat;
import defpackage.paw;
import defpackage.qrs;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class BreakInfoRecyclerAdapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<ozr> f22169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f22170c;
    private LayoutInflater e;

    public BreakInfoRecyclerAdapter(Context context, Map<Integer, Pair<Double, Long>> map) {
        this.f22170c = context;
        this.e = LayoutInflater.from(context);
        this.f22169b = e(map);
    }

    private ArrayList<ozr> e(Map<Integer, Pair<Double, Long>> map) {
        if (map == null || map.size() <= 0) {
            LogUtil.j("PLGACHIEVE_BreakInfoRecyclerAdapter", "getListFromMap() mMedalList is empty.");
            return new ArrayList<>();
        }
        ArrayList<ozr> arrayList = new ArrayList<>(map.size());
        for (Map.Entry<Integer, Pair<Double, Long>> entry : map.entrySet()) {
            ozr ozrVar = new ozr();
            Pair<Double, Long> value = entry.getValue();
            double dDoubleValue = ((Double) value.first).doubleValue();
            long jLongValue = ((Long) value.second).longValue();
            ozrVar.e(entry.getKey().intValue());
            ozrVar.a(jLongValue);
            ozrVar.e(dDoubleValue);
            arrayList.add(ozrVar);
        }
        Collections.sort(arrayList, new Comparator<ozr>() { // from class: com.huawei.pluginachievement.ui.adapter.BreakInfoRecyclerAdapter.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(ozr ozrVar2, ozr ozrVar3) {
                return (int) (ozrVar3.e() - ozrVar2.e());
            }
        });
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(this.e.inflate(R.layout.achieve_report_single_item_break_info, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        if (njy.e(this.f22169b, i)) {
            return;
        }
        ozr ozrVar = this.f22169b.get(i);
        int iB = ozrVar.b();
        long jE = ozrVar.e();
        aVar.f22173b.setText(b(ozrVar.d(), iB));
        String lowerCase = paw.b(iB, this.f22170c).toLowerCase(Locale.ENGLISH);
        aVar.f22174c.setText(pat.e(this.f22170c.getResources().getString(R.string.IDS_report_break_info_desc, paw.d(jE, 2), lowerCase), lowerCase, this.f22170c.getResources().getColor(R.color.textColorPrimary), 0, this.f22170c.getResources().getString(R.string.textFontFamilyMedium)));
        if (i == this.f22169b.size() - 1) {
            aVar.f22172a.setBackground(this.f22170c.getResources().getDrawable(R.drawable.break_info_line_last));
        } else {
            aVar.f22172a.setBackground(this.f22170c.getResources().getDrawable(R.drawable.break_info_line));
        }
        a(aVar, i);
    }

    private void a(a aVar, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        aVar.f22173b.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        aVar.f22174c.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int i2 = aVar.f22174c.getMeasuredWidth() > ((int) Math.ceil((double) aVar.f22174c.getPaint().measureText(aVar.f22174c.getText().toString()))) + 20 ? 1 : 2;
        int measuredHeight = aVar.f22173b.getMeasuredHeight();
        int iCeil = (int) Math.ceil((aVar.f22174c.getMeasuredHeight() * i2) + aVar.f22174c.getLineSpacingExtra());
        ViewGroup.LayoutParams layoutParams = aVar.e.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = aVar.d.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
            int iD = qrs.d(this.f22170c, 12.0f);
            RelativeLayout.LayoutParams layoutParams4 = layoutParams2 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams2 : null;
            if (i == 0) {
                layoutParams3.topMargin = iD;
                layoutParams3.height = (((measuredHeight + iCeil) + qrs.d(this.f22170c, 36.0f)) + 1) - iD;
                if (layoutParams4 != null) {
                    layoutParams4.topMargin = 0;
                }
            } else {
                layoutParams3.height = measuredHeight + iCeil + qrs.d(this.f22170c, 36.0f) + 1;
                layoutParams3.topMargin = 0;
                if (layoutParams4 != null) {
                    layoutParams4.topMargin = iD;
                }
            }
            if (layoutParams4 != null) {
                aVar.d.setLayoutParams(layoutParams4);
            }
            aVar.e.setLayoutParams(layoutParams3);
        }
    }

    private CharSequence b(double d, int i) {
        double dE;
        Context context = BaseApplication.getContext();
        if (i != 1) {
            if (i == 2) {
                String strE = UnitUtil.e(d, 1, 0);
                String quantityString = context.getResources().getQuantityString(R.plurals.IDS_hwh_me_other_target_steps, (int) d, strE);
                return pat.c(quantityString, quantityString.replace(strE, ""), this.f22170c.getResources().getDimensionPixelSize(R.dimen.textSizeBody1));
            }
            if (i != 3 && i != 10) {
                if (i == 11) {
                    return e(context, d);
                }
                return paw.d((int) (d + 0.5d));
            }
        }
        double d2 = d / 1000.0d;
        int i2 = R.plurals.IDS_hwh_motiontrack_show_use_time_km;
        if (UnitUtil.f()) {
            dE = UnitUtil.e(d2, 3);
            i2 = R.plurals.IDS_hwh_motiontrack_show_use_time_mi;
        } else {
            dE = d2;
        }
        String strE2 = UnitUtil.e(dE, 1, 2);
        String quantityString2 = context.getResources().getQuantityString(i2, (int) d2, strE2);
        return pat.c(quantityString2, quantityString2.replace(strE2, ""), this.f22170c.getResources().getDimensionPixelSize(R.dimen.textSizeBody1));
    }

    private CharSequence e(Context context, double d) {
        String strA = paw.a(d);
        String string = context.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed);
        if (UnitUtil.f()) {
            strA = UnitUtil.e(UnitUtil.e(ote.d(strA), 3), 1, 2);
            string = context.getString(R.string.IDS_motiontrack_show_detail_average_speed_imp);
        }
        return pat.c(strA + string, string, this.f22170c.getResources().getDimensionPixelSize(R.dimen.textSizeBody1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.f22169b)) {
            return 0;
        }
        return this.f22169b.size();
    }

    public void c(Map<Integer, Pair<Double, Long>> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        this.f22169b.clear();
        this.f22169b = e(map);
        notifyDataSetChanged();
    }

    static class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f22172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f22173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f22174c;
        ImageView d;
        RelativeLayout e;

        a(View view) {
            super(view);
            this.f22173b = (HealthTextView) view.findViewById(R.id.index_value);
            this.f22174c = (HealthTextView) view.findViewById(R.id.index_desc);
            this.f22172a = (ImageView) view.findViewById(R.id.image_line);
            this.e = (RelativeLayout) view.findViewById(R.id.line_layout);
            this.d = (ImageView) view.findViewById(R.id.image_dot);
        }
    }
}
