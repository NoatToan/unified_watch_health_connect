package com.huawei.pluginachievement.ui.views;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.MedalInfoDesc;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.manager.model.PersonalData;
import com.huawei.ui.commonui.base.BaseActivity;
import defpackage.lmf;
import defpackage.njy;
import defpackage.pax;
import defpackage.pbn;
import health.compact.a.LanguageUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class MedalHorizontalRecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f22301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Pair<Integer, Integer> f22302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f22303c;
    private List<MedalInfoDesc> d;
    private final Map<String, Integer> e;

    public MedalHorizontalRecyclerViewAdapter(Context context, List<MedalInfoDesc> list, List<String> list2) {
        HashMap map = new HashMap(16);
        this.e = map;
        this.f22302b = BaseActivity.getSafeRegionWidth();
        this.d = list;
        this.f22303c = context;
        this.f22301a = list2;
        if (map.isEmpty()) {
            pax.c(map);
        }
    }

    public void a(List<MedalInfoDesc> list, List<String> list2) {
        if (njy.e(list) || njy.e(list2)) {
            return;
        }
        this.d = list;
        this.f22301a = list2;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.medal_horizontal_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder viewHolder, final int i) {
        a(viewHolder.itemView, i, getItemCount());
        if (njy.e(this.d, i)) {
            LogUtil.j("PLGACHIEVE_MedalHorizontalRecyclerViewAdapter", "onBindViewHolder: isOutOfBounds -> " + i);
            return;
        }
        if (this.e.isEmpty()) {
            LogUtil.j("PLGACHIEVE_MedalHorizontalRecyclerViewAdapter", "onBindViewHolder: mMedalImages is empty");
            return;
        }
        String strAcquireMedalId = this.d.get(i).acquireMedalId();
        String strA = pax.a(strAcquireMedalId, ParsedFieldTag.LIGHT_DETAIL_STYLE);
        if (!pax.c(strA)) {
            int iS = pax.s(strAcquireMedalId);
            if (iS > 0 && iS <= 19) {
                Integer num = this.e.get(strAcquireMedalId);
                if (num == null) {
                    LogUtil.j("PLGACHIEVE_MedalHorizontalRecyclerViewAdapter", "onBindViewHolder: medalImageResourceId is null");
                } else {
                    viewHolder.f22304b.setImageResource(num.intValue());
                }
            }
        } else {
            Glide.with(this.f22303c).load(strA).diskCacheStrategy(DiskCacheStrategy.NONE).skipMemoryCache(true).into(viewHolder.f22304b);
        }
        viewHolder.f22304b.setOnClickListener(new View.OnClickListener() { // from class: pbm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45129b.c(i, view);
            }
        });
    }

    public /* synthetic */ void c(int i, View view) {
        if (njy.c(this.d, i)) {
            d(this.d.get(i));
        }
    }

    private void d(MedalInfoDesc medalInfoDesc) {
        String str;
        Intent intent = new Intent();
        intent.setClassName(this.f22303c, PersonalData.CLASS_NAME_PERSONAL_MEDAL_DETAIL);
        intent.putExtra("medal_res_id", String.valueOf(medalInfoDesc.acquireMedalId()));
        if (medalInfoDesc.acquireGainCount() > 0) {
            intent.putExtra("medal_des_id", String.valueOf(medalInfoDesc.acquireLightDescription()));
        } else {
            intent.putExtra("medal_des_id", String.valueOf(medalInfoDesc.acquireGrayDescription()));
        }
        intent.putExtra("medal_content_id", String.valueOf(medalInfoDesc.acquireText()));
        intent.putExtra("medal_type_level", String.valueOf(medalInfoDesc.acquireMedalTypeLevel()));
        intent.putExtra("medal_gain_time", String.valueOf(medalInfoDesc.acquireGainTime()));
        intent.putExtra("medal_gain_count", medalInfoDesc.acquireGainCount());
        intent.putExtra("click_x", pbn.g(this.f22303c) / 2);
        intent.putExtra("click_y", pbn.j(this.f22303c) / 2);
        intent.putExtra("medal_type", medalInfoDesc.acquireMedalType());
        if (medalInfoDesc.acquireGainCount() >= 1) {
            intent.putExtra("medal_obtain_id", "true");
        } else {
            intent.putExtra("medal_obtain_id", "false");
        }
        intent.putExtra("promotion_name", String.valueOf(medalInfoDesc.acquirePromotionName()));
        intent.putExtra("promotion_url", String.valueOf(medalInfoDesc.acquirePromotionURL()));
        this.f22303c.startActivity(intent);
        if (njy.b(this.f22301a) && this.f22301a.size() > 1) {
            if (medalInfoDesc.acquireMedalType() != null && medalInfoDesc.acquireMedalType().length() < 3) {
                str = this.f22301a.get(0);
            } else {
                str = this.f22301a.get(1);
            }
        } else {
            str = "";
        }
        b(medalInfoDesc, str);
    }

    private void b(MedalInfoDesc medalInfoDesc, String str) {
        HashMap map = new HashMap(8);
        map.put("cilck", 1);
        map.put("name", medalInfoDesc.acquireText());
        map.put("className", str);
        map.put("type", medalInfoDesc.acquireMedalType());
        map.put("label", Integer.valueOf(medalInfoDesc.acquireMedalLabel()));
        map.put("from", "1");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SUCCESSES_REPORT_1100010.value(), map, 0);
    }

    private void a(View view, int i, int i2) {
        int i3 = pbn.i(view.getContext());
        view.setPadding(i3 - ((Integer) this.f22302b.first).intValue(), 0, i3 - ((Integer) this.f22302b.second).intValue(), 0);
        int iE = i3 + (pbn.e(view.getContext()) / 2);
        int i4 = i == 0 ? iE : 0;
        int i5 = i == i2 + (-1) ? iE : 0;
        if (LanguageUtil.ba(view.getContext())) {
            c(view, i5, 0, i4, 0);
        } else {
            c(view, i4, 0, i5, 0);
        }
    }

    private void c(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.leftMargin == i && marginLayoutParams.topMargin == i2 && marginLayoutParams.rightMargin == i3 && marginLayoutParams.bottomMargin == i4) {
            return;
        }
        marginLayoutParams.setMargins(i, i2, i3, i4);
        view.setLayoutParams(marginLayoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.d)) {
            return 0;
        }
        return this.d.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImageView f22304b;

        public ViewHolder(View view) {
            super(view);
            this.f22304b = (ImageView) view.findViewById(R.id.iv_big);
        }
    }
}
