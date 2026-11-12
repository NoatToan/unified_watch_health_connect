package com.huawei.pluginachievement.ui.adapter;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import defpackage.ltc;
import defpackage.ozy;
import defpackage.paa;
import defpackage.paq;
import defpackage.par;
import defpackage.qqf;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes41.dex */
public class AchieveLevelAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<Integer, Integer> f22160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f22161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<Integer, Integer> f22162c;
    private LayoutInflater d;
    private ArrayList<ozy> g;
    private paa i;
    private HashMap<Integer, Integer> j;
    private int e = 0;
    private Pair<Integer, Integer> h = BaseActivity.getSafeRegionWidth();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public AchieveLevelAdapter(Context context, ArrayList<ozy> arrayList, HashMap<Integer, Integer> map, HashMap<Integer, Integer> map2, HashMap<Integer, Integer> map3) {
        this.f22161b = context;
        this.g = arrayList;
        this.j = map;
        this.f22162c = map2;
        this.f22160a = map3;
        this.d = LayoutInflater.from(context);
    }

    public void a(ArrayList<ozy> arrayList, int i) {
        this.g = arrayList;
        this.e = i - 1;
        notifyDataSetChanged();
    }

    public void d(paa paaVar) {
        this.i = paaVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new d(this.d.inflate(R.layout.achieve_level_layout_header, viewGroup, false));
        }
        if (i == 1) {
            return new b(this.d.inflate(R.layout.achieve_level_listview_item, viewGroup, false));
        }
        LogUtil.j("AchieveLevelAdapter", "viewType unknow:", Integer.valueOf(i));
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (i < 0 || i > this.g.size()) {
            return;
        }
        if (viewHolder instanceof d) {
            d dVar = (d) viewHolder;
            dVar.itemView.setBackgroundColor(paq.f(this.e + 1));
            d(dVar, this.i);
        } else {
            if (viewHolder instanceof b) {
                b bVar = (b) viewHolder;
                bVar.itemView.setBackgroundColor(ContextCompat.getColor(this.f22161b, R.color.colorBackground));
                bVar.f22165c.setPadding(((Integer) this.h.first).intValue(), bVar.f22165c.getPaddingTop(), ((Integer) this.h.second).intValue(), bVar.f22165c.getPaddingBottom());
                b(bVar, i);
                return;
            }
            LogUtil.j("AchieveLevelAdapter", "onBindViewHolder error type position = ", Integer.valueOf(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.g.size() + 1;
    }

    private void e(d dVar, paa paaVar) {
        int iE = paaVar.e();
        dVar.d.setVisibility(0);
        dVar.f22167b.setMax(Math.abs(paaVar.a()));
        dVar.f22167b.setProgress(Math.abs(paaVar.b()));
        String string = this.f22161b.getResources().getString(R.string.IDS_plugin_achievement_level_value_string, Integer.valueOf(iE + 1));
        int iAbs = Math.abs(Math.abs(paaVar.a()) - Math.abs(paaVar.b()));
        String strE = UnitUtil.e(iAbs, 1, 0);
        String quantityString = this.f22161b.getResources().getQuantityString(R.plurals.IDS_plugin_achievement_level_rule_gap, iAbs, strE, string);
        SpannableString spannableString = new SpannableString(quantityString);
        int iIndexOf = quantityString.indexOf(strE);
        int i = iIndexOf != -1 ? iIndexOf : 0;
        int length = strE.length();
        int length2 = quantityString.length() - string.length();
        int i2 = length + i;
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ffffff")), i, i2, 34);
        spannableString.setSpan(new StyleSpan(3), i, i2, 34);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ffffff")), length2, spannableString.length(), 17);
        spannableString.setSpan(new StyleSpan(3), length2, spannableString.length(), 17);
        dVar.d.setText(spannableString);
    }

    private void c(d dVar) {
        dVar.d.setVisibility(0);
        dVar.f22167b.setMax(100);
        dVar.f22167b.setProgress(100);
        String string = this.f22161b.getResources().getString(R.string.IDS_plugin_achievement_msg_tip_l1_pre);
        String string2 = this.f22161b.getResources().getString(this.f22160a.get(20).intValue());
        String str = String.format(Locale.ROOT, string, string2);
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf = str.indexOf(string2);
        int i = iIndexOf != -1 ? iIndexOf : 0;
        int length = string2.length() + i;
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ffffff")), i, length, 34);
        spannableString.setSpan(new StyleSpan(3), i, length, 34);
        dVar.d.setText(spannableString);
    }

    private void d(d dVar, paa paaVar) {
        if (paaVar == null || dVar.f22166a == null) {
            return;
        }
        int iE = paaVar.e();
        dVar.e.setImageResource(this.j.get(Integer.valueOf(iE)).intValue());
        String string = this.f22161b.getResources().getString(R.string.IDS_plugin_achievement_level_value_string, Integer.valueOf(iE));
        dVar.h.setText(string + " ");
        if (iE + 1 <= 20) {
            e(dVar, paaVar);
        } else {
            c(dVar);
        }
        String string2 = this.f22161b.getResources().getString(R.string.IDS_plugin_achievement_level_rule_number);
        double dC = paaVar.c();
        dVar.f22168c.setText(String.format(Locale.ROOT, string2, ltc.c(dC, 2, dC != 0.0d ? par.e(dC) : 0)));
    }

    private void b(b bVar, int i) {
        int i2 = i - 1;
        ozy ozyVar = this.g.get(i2);
        if (ozyVar != null) {
            int iC = ozyVar.c();
            if (i2 <= this.e) {
                bVar.d.setImageResource(this.j.get(Integer.valueOf(iC)).intValue());
            } else {
                bVar.d.setImageResource(this.f22162c.get(Integer.valueOf(iC)).intValue());
                bVar.d.setImageDrawable(qqf.c(bVar.d.getDrawable(), this.f22161b.getResources().getColor(R.color.healthTintColorPrimary)));
            }
            String string = this.f22161b.getResources().getString(R.string.IDS_plugin_achievement_level_value_string, Integer.valueOf(iC));
            bVar.f22164b.setText(string + " ");
            bVar.f22163a.setText(paq.a(this.f22161b, ozyVar.d()));
            String string2 = this.f22161b.getResources().getString(R.string.IDS_plugin_achievement_level_rule_number);
            double dB = ozyVar.b();
            bVar.e.setText(String.format(Locale.ROOT, string2, ltc.c(dB, 2, dB != 0.0d ? par.e(dB) : 0)));
        }
    }

    static class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private LinearLayout f22166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthProgressBar f22167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f22168c;
        private HealthTextView d;
        private ImageView e;
        private HealthTextView h;

        d(View view) {
            super(view);
            this.e = (ImageView) view.findViewById(R.id.achieve_level_image);
            this.h = (HealthTextView) view.findViewById(R.id.achieve_level_text);
            this.f22167b = (HealthProgressBar) view.findViewById(R.id.achieve_level_progress);
            this.d = (HealthTextView) view.findViewById(R.id.achieve_level_des);
            this.f22168c = (HealthTextView) view.findViewById(R.id.achieve_level_person_count);
            this.f22166a = (LinearLayout) view.findViewById(R.id.achieve_level_header);
        }
    }

    static class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f22163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f22164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private View f22165c;
        private ImageView d;
        private HealthTextView e;

        b(View view) {
            super(view);
            this.f22165c = view.findViewById(R.id.level_listview_content_layout);
            this.d = (ImageView) view.findViewById(R.id.achieve_level_listview_iv);
            this.f22164b = (HealthTextView) view.findViewById(R.id.achieve_level_listview_tv);
            this.f22163a = (HealthTextView) view.findViewById(R.id.achieve_level_listview_content_tv);
            this.e = (HealthTextView) view.findViewById(R.id.achieve_level_listview_person_count);
        }
    }
}
