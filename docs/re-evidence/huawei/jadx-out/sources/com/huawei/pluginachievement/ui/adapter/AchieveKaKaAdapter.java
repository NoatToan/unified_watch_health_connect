package com.huawei.pluginachievement.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.KakaRecord;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.out;
import defpackage.pap;
import defpackage.qqf;
import defpackage.qqs;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes13.dex */
public class AchieveKaKaAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LayoutInflater f22155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f22156c;
    private List<KakaRecord> d;
    private Map<Integer, String> e;

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    public AchieveKaKaAdapter(Context context) {
        this.f22156c = context;
        b();
    }

    public void c(List<KakaRecord> list) {
        if (list == null) {
            this.d = new ArrayList(16);
        } else {
            this.d = list;
        }
        notifyDataSetChanged();
    }

    private void b() {
        this.f22155b = LayoutInflater.from(this.f22156c);
        HashMap map = new HashMap(16);
        this.e = map;
        map.put(1, this.f22156c.getResources().getString(R.string.IDS_plugin_achievement_kaka_desc_calorie_exchange));
        this.e.put(2, this.f22156c.getResources().getString(R.string.IDS_plugin_achievement_kaka_desc_calorie_exchange));
        this.e.put(3, this.f22156c.getResources().getString(R.string.IDS_plugin_achievement_kaka_desc_lottery_used));
        this.e.put(4, this.f22156c.getResources().getString(R.string.IDS_plugin_achievement_kaka_desc_calorie_get));
        this.e.put(5, this.f22156c.getResources().getString(R.string.IDS_plugin_achievement_kaka_desc_join_activity));
        this.e.put(6, this.f22156c.getResources().getString(R.string.IDS_plugin_achievement_kaka_desc_first_track_motion));
        this.e.put(7, this.f22156c.getResources().getString(R.string.IDS_plugin_achievement_kaka_desc_comment));
        this.e.put(8, this.f22156c.getResources().getString(R.string.IDS_plugin_achievement_kaka_desc_take_survey));
        this.e.put(127, this.f22156c.getResources().getString(R.string.IDS_plugin_achievement_kaka_desc_kaka_invalid));
        this.e.put(128, this.f22156c.getResources().getString(R.string.IDS_achieve_kaka_kaka_delay));
        this.e.put(9, this.f22156c.getResources().getString(R.string.IDS_plugin_achievement_kaka_line_redeem));
        this.e.put(10, this.f22156c.getResources().getString(R.string.IDS_plugin_achievement_kaka_exchange_points));
        this.e.put(11, this.f22156c.getResources().getString(R.string.IDS_plugin_achievement_kaka_desc_activity_apply));
        this.e.put(12, this.f22156c.getResources().getString(R.string.IDS_plugin_achievement_kaka_desc_activity_finish));
        this.e.put(13, this.f22156c.getResources().getString(R.string.IDS_plugin_achievement_kaka_desc_activity_lottery));
        this.e.put(14, this.f22156c.getResources().getString(R.string.IDS_plugin_achievement_kaka_desc_activity_back));
        this.e.put(15, this.f22156c.getResources().getString(R.string.IDS_kaka_desc_punch_in_health_life));
        this.e.put(16, this.f22156c.getResources().getString(R.string.IDS_achieve_kaka_consecutive));
        this.e.put(17, this.f22156c.getResources().getString(R.string.IDS_achieve_kaka_redeem_gifts));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<KakaRecord> list = this.d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        e eVar;
        if (view == null) {
            eVar = new e();
            viewInflate = this.f22155b.inflate(R.layout.achieve_kk_item, (ViewGroup) null);
            eVar.f22158b = (HealthTextView) out.b(viewInflate, R.id.text_time);
            eVar.f22157a = (HealthTextView) out.b(viewInflate, R.id.text_desc);
            eVar.e = (HealthTextView) out.b(viewInflate, R.id.text_count);
            eVar.d = (HealthTextView) out.b(viewInflate, R.id.text_fuhao);
            eVar.f22159c = (ImageView) out.b(viewInflate, R.id.img);
            viewInflate.setTag(eVar);
        } else {
            viewInflate = view;
            eVar = (e) view.getTag();
        }
        a(i, eVar);
        return viewInflate;
    }

    private void a(int i, e eVar) {
        List<KakaRecord> list = this.d;
        if (list == null || i < 0 || i >= list.size()) {
            return;
        }
        KakaRecord kakaRecord = this.d.get(i);
        if (kakaRecord.getKakaNum() > 0) {
            eVar.e.setTextColor(this.f22156c.getResources().getColor(R.color.achieve_kaka_item_count_add));
            eVar.d.setTextColor(this.f22156c.getResources().getColor(R.color.achieve_kaka_item_count_add));
            eVar.f22159c.setImageResource(R.mipmap.kk_work_on_icon);
            eVar.d.setText(Marker.ANY_NON_NULL_MARKER);
            eVar.e.setText(UnitUtil.e(kakaRecord.getKakaNum(), 1, 0));
        } else {
            eVar.e.setTextColor(this.f22156c.getResources().getColor(R.color.textColorSecondary));
            eVar.d.setTextColor(this.f22156c.getResources().getColor(R.color.textColorSecondary));
            eVar.f22159c.setImageResource(R.mipmap.kk_out_icon);
            if (qqs.e(this.f22156c.getApplicationContext())) {
                eVar.f22159c.setImageDrawable(qqf.c(eVar.f22159c.getDrawable(), this.f22156c.getResources().getColor(R.color.healthTintColorPrimary)));
            }
            eVar.d.setText(Constants.LINK);
            eVar.e.setText(UnitUtil.e(Math.abs(kakaRecord.getKakaNum()), 1, 0));
        }
        if (pap.i(String.valueOf(kakaRecord.getDescription()))) {
            eVar.f22157a.setText(this.f22156c.getResources().getString(R.string.IDS_kaka_desc_health_life_task));
        } else if (pap.g(String.valueOf(kakaRecord.getDescription()))) {
            if (kakaRecord.getDescription() == 3904161) {
                eVar.f22157a.setText(this.f22156c.getResources().getString(R.string.IDS_kaka_desc_diet_all_task));
            } else {
                eVar.f22157a.setText(this.f22156c.getResources().getString(R.string.IDS_kaka_desc_diet_once_task));
            }
        } else if (kakaRecord.getDescription() > 128) {
            eVar.f22157a.setText(this.f22156c.getResources().getString(R.string.IDS_plugin_achievement_kaka_line_task));
        } else {
            eVar.f22157a.setText(this.e.get(Integer.valueOf(kakaRecord.getDescription())));
        }
        eVar.f22158b.setText(UnitUtil.d("yyyy-MM-dd HH:mm:ss", kakaRecord.getOccurDate()));
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f22157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f22158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ImageView f22159c;
        private HealthTextView d;
        private HealthTextView e;

        e() {
        }
    }
}
