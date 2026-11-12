package com.huawei.ui.main.stories.userprofile.activity;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.userprofile.plantabs.PlanViewPagerHolder;
import defpackage.fxk;
import defpackage.njy;
import defpackage.osa;
import defpackage.oun;
import defpackage.pax;
import defpackage.qqf;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import defpackage.wre;
import defpackage.wsl;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class PersonalCenterRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f29037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LayoutInflater f29038b;
    private wsl f;
    private int h;
    private int j;
    private ImageView[] d = new ImageView[16];
    private boolean e = true;
    private List<String> i = new ArrayList(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<wre> f29039c = new ArrayList(10);

    PersonalCenterRecyclerViewAdapter(Context context) {
        this.f29038b = LayoutInflater.from(context);
        this.f29037a = context;
    }

    public void c(List<wre> list) {
        if (list == null) {
            return;
        }
        if (njy.b(this.f29039c)) {
            this.f29039c.clear();
        }
        this.f29039c = list;
        notifyDataSetChanged();
    }

    public void e(wsl wslVar) {
        this.f = wslVar;
    }

    public void d(wre wreVar) {
        int iA = a(wreVar);
        LogUtil.a("PersonalCenterRecyclerViewAdapter", "notifyItemChangeByData,position", Integer.valueOf(iA));
        if (iA > -1) {
            notifyItemChanged(iA);
        }
    }

    public int a(wre wreVar) {
        if (wreVar == null || wreVar.a() == 0) {
            return -1;
        }
        for (int i = 0; i < this.f29039c.size(); i++) {
            if (this.f29039c.get(i) != null && wreVar.a() == this.f29039c.get(i).a()) {
                return i;
            }
        }
        return -1;
    }

    public void e(boolean z) {
        this.e = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (njy.e(this.f29039c, i)) {
            return -1;
        }
        return this.f29039c.get(i).j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new d(this.f29038b.inflate(R.layout.item_divider_layout, viewGroup, false));
        }
        if (i == 4 || i == 3) {
            return new a(this.f29038b.inflate(R.layout.fragment_personal_center_item_content, viewGroup, false));
        }
        if (i == 2) {
            return new b(this.f29038b.inflate(R.layout.user_profile_myreward_layout, viewGroup, false));
        }
        if (i == 6) {
            e eVar = new e(this.f29038b.inflate(R.layout.item_personal_center_banner_ad, viewGroup, false));
            eVar.c();
            return eVar;
        }
        if (i == 7) {
            return new c(this.f29038b.inflate(R.layout.item_personal_center_grid, viewGroup, false));
        }
        if (i == 8) {
            return new PlanViewPagerHolder(this.f29038b.inflate(R.layout.fragment_personal_center_item_plan, viewGroup, false));
        }
        LogUtil.j("PersonalCenterRecyclerViewAdapter", "onCreateViewHolder error type");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        wre wreVar = i < this.f29039c.size() ? this.f29039c.get(i) : null;
        if (wreVar == null || viewHolder == null) {
            LogUtil.j("PersonalCenterRecyclerViewAdapter", "onBindViewHolder model or holder is null");
            return;
        }
        if (viewHolder instanceof d) {
            d dVar = (d) viewHolder;
            if (wreVar.a() != 0) {
                dVar.d.setText(wreVar.a());
                dVar.d.setVisibility(0);
                return;
            } else {
                dVar.d.setVisibility(8);
                return;
            }
        }
        if (viewHolder instanceof a) {
            e((a) viewHolder, wreVar);
            return;
        }
        if (viewHolder instanceof b) {
            b((b) viewHolder, wreVar);
            return;
        }
        if (viewHolder instanceof e) {
            e eVar = (e) viewHolder;
            eVar.c(wreVar.i(), wreVar);
            eVar.d.setOnClickListener(wreVar.g());
            if (SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false)) {
                LogUtil.j("PersonalCenterRecyclerViewAdapter", "onBindViewHolder Basic mode");
                eVar.e.setOnClickListener(new wsl.a(this.f));
                return;
            } else {
                LogUtil.j("PersonalCenterRecyclerViewAdapter", "onBindViewHolder Full mode");
                eVar.e.setOnClickListener(wreVar.g());
                return;
            }
        }
        if (viewHolder instanceof c) {
            ((c) viewHolder).d();
        } else if (!(viewHolder instanceof PlanViewPagerHolder)) {
            LogUtil.j("PersonalCenterRecyclerViewAdapter", "onBindViewHolder type error");
        } else {
            ((PlanViewPagerHolder) viewHolder).a(wreVar);
        }
    }

    private void b(b bVar, wre wreVar) {
        if (LanguageUtil.q(this.f29037a)) {
            bVar.f29046c.setText(bVar.f29046c.getText().toString());
        }
        if (LanguageUtil.ba(this.f29037a)) {
            bVar.f29044a.setBackgroundResource(R.drawable.common_ui_arrow_left);
        }
        if (qrs.ac()) {
            bVar.f29046c.setLayoutParams(new LinearLayout.LayoutParams(this.f29037a.getResources().getDimensionPixelOffset(R.dimen.hw_achieve_medal_size_103), -2));
            qrs.a(bVar.f29046c);
            qrs.a(bVar.o);
        }
        d(bVar);
        if (wreVar.b() == null) {
            bVar.o.setText("");
            bVar.n.setVisibility(8);
            bVar.l.setVisibility(0);
            this.i.clear();
        } else if (wreVar.b() instanceof List) {
            a(bVar, (List) wreVar.b());
        } else {
            LogUtil.j("PersonalCenterRecyclerViewAdapter", "medal data error");
        }
        if (wreVar.n()) {
            bVar.d.setVisibility(0);
        } else {
            bVar.d.setVisibility(8);
        }
        bVar.itemView.setBackgroundResource(R.drawable.list_item_background_single_normal);
        bVar.itemView.setOnClickListener(wreVar.g());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<wre> list = this.f29039c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    private void e(a aVar, wre wreVar) {
        if (LanguageUtil.ba(this.f29037a)) {
            aVar.d.setBackgroundResource(R.drawable.common_ui_arrow_left);
            aVar.i.setBackground(qqz.e(this.f29037a, wreVar.d()));
        } else {
            aVar.i.setBackgroundResource(wreVar.d());
        }
        aVar.f29042b.setText(wreVar.a());
        if (wreVar.f()) {
            aVar.j.setText(wreVar.c());
        } else {
            aVar.j.setText("");
        }
        if (wreVar.n()) {
            aVar.f.setVisibility(0);
        } else {
            aVar.f.setVisibility(8);
        }
        if (wreVar.h()) {
            aVar.f29041a.setVisibility(0);
        } else {
            aVar.f29041a.setVisibility(8);
        }
        a(aVar, wreVar, aVar.itemView.getLayoutParams());
        if (wreVar.k()) {
            aVar.e.setVisibility(0);
            aVar.d.setVisibility(8);
        } else {
            aVar.e.setVisibility(8);
            aVar.d.setVisibility(0);
        }
    }

    private void a(a aVar, wre wreVar, ViewGroup.LayoutParams layoutParams) {
        if (wreVar.i()) {
            layoutParams.width = -1;
            layoutParams.height = -2;
            if (wreVar.e() == R.drawable.list_item_background_single_normal) {
                aVar.f29043c.setVisibility(0);
                aVar.h.setVisibility(0);
            } else if (wreVar.e() == R.drawable.list_item_background_bottom_normal) {
                aVar.f29043c.setVisibility(0);
                aVar.h.setVisibility(8);
            } else if (wreVar.e() == R.drawable.list_item_background_top_normal) {
                aVar.h.setVisibility(0);
                aVar.f29043c.setVisibility(8);
            } else {
                aVar.h.setVisibility(8);
                aVar.f29043c.setVisibility(8);
            }
            if (qrs.ac()) {
                layoutParams.height = -2;
                qrs.a(aVar.f29042b);
            }
            aVar.itemView.setVisibility(0);
        } else {
            layoutParams.height = 0;
            layoutParams.width = 0;
            aVar.itemView.setVisibility(8);
        }
        if (wreVar.f()) {
            aVar.j.setVisibility(0);
        } else {
            aVar.j.setVisibility(8);
        }
        aVar.itemView.setLayoutParams(layoutParams);
        aVar.itemView.setOnClickListener(wreVar.g());
        aVar.itemView.setBackgroundResource(wreVar.e());
    }

    private void a(final b bVar, final List<String> list) {
        LogUtil.a("PersonalCenterRecyclerViewAdapter", "getRewardLayoutWith() enter.");
        if (bVar.k != null) {
            bVar.k.post(new Runnable() { // from class: com.huawei.ui.main.stories.userprofile.activity.PersonalCenterRecyclerViewAdapter.2
                @Override // java.lang.Runnable
                public void run() {
                    PersonalCenterRecyclerViewAdapter.this.j = bVar.k.getWidth();
                    PersonalCenterRecyclerViewAdapter personalCenterRecyclerViewAdapter = PersonalCenterRecyclerViewAdapter.this;
                    personalCenterRecyclerViewAdapter.h = qrs.d(personalCenterRecyclerViewAdapter.f29037a, 55.0f);
                    LogUtil.a("PersonalCenterRecyclerViewAdapter", "getRewardLayoutWith(), medalWidth = ", Integer.valueOf(PersonalCenterRecyclerViewAdapter.this.j), "singleMedalWidth = ", Integer.valueOf(PersonalCenterRecyclerViewAdapter.this.h));
                    PersonalCenterRecyclerViewAdapter.this.b((List<String>) list, bVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<String> list, b bVar) {
        if (this.j == 0) {
            return;
        }
        if (list == null || a(list)) {
            HashMap map = new HashMap(16);
            pax.a(map);
            int i = 0;
            if (njy.b(list)) {
                int size = list.size();
                int iC = c(list, map);
                bVar.o.setText(qre.e(R.plurals.IDS_user_profile_achieve_total_medals, size, Integer.valueOf(size)));
                bVar.n.setVisibility(0);
                bVar.l.setVisibility(8);
                i = iC;
            }
            d(i, bVar);
        }
    }

    private int c(List<String> list, Map<String, Integer> map) {
        int i;
        String strE = osa.e(this.f29037a, "_medalPngStatusDownload");
        int iD = d(list);
        if (!njy.e(this.i)) {
            this.i.clear();
        }
        int i2 = 0;
        for (String str : list) {
            Bitmap bitmapA = oun.a("", str, this.f29037a, strE) ? pax.a(str, true, true) : null;
            if (bitmapA != null) {
                this.d[i2].setVisibility(0);
                this.d[i2].setImageBitmap(bitmapA);
                i2++;
                this.i.add(str);
            } else {
                try {
                    i = Integer.parseInt(str);
                } catch (NumberFormatException unused) {
                    LogUtil.e("PersonalCenterRecyclerViewAdapter", "NumberFormatException");
                    i = 0;
                }
                if (i > 0 && i <= 19) {
                    int iIntValue = map.get(str).intValue();
                    this.d[i2].setVisibility(0);
                    this.d[i2].setImageResource(iIntValue);
                    i2++;
                    this.i.add(str);
                }
            }
            if (i2 >= iD) {
                break;
            }
        }
        int i3 = i2;
        while (true) {
            ImageView[] imageViewArr = this.d;
            if (i3 >= imageViewArr.length) {
                return i2;
            }
            ImageView imageView = imageViewArr[i3];
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            i3++;
        }
    }

    private void d(int i, b bVar) {
        if (i != 0 || bVar == null) {
            LogUtil.a("PersonalCenterRecyclerViewAdapter", "Enter setMedals sArray.length");
            return;
        }
        LogUtil.a("PersonalCenterRecyclerViewAdapter", "Enter setMedals no medals");
        bVar.o.setText(this.f29037a.getResources().getQuantityString(R.plurals.IDS_user_profile_achieve_total_medals, 0, 0));
        bVar.n.setVisibility(8);
        bVar.l.setVisibility(0);
    }

    private int d(List<String> list) {
        int size = list.size();
        if (qrs.af(this.f29037a)) {
            return Math.min(size, 8);
        }
        return c(size);
    }

    private int c(int i) {
        int iMin = Math.min(i, 5);
        if (iMin != 5) {
            return iMin;
        }
        int iD = (this.h * 5) + qrs.d(this.f29037a, 32.0f);
        LogUtil.a("PersonalCenterRecyclerViewAdapter", "medalLayoutWidth = ", Integer.valueOf(this.j), "totalMedalWidth = ", Integer.valueOf(iD));
        return iD > this.j ? iMin - 1 : iMin;
    }

    private void d(b bVar) {
        if (this.e) {
            this.e = false;
            if (qrs.af(this.f29037a)) {
                LogUtil.a("PersonalCenterRecyclerViewAdapter", "adapterMedalTahiti is tahiti");
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(qrs.d(this.f29037a, 55.0f), qrs.d(this.f29037a, 55.0f));
                layoutParams.setMargins(0, 0, qrs.d(this.f29037a, 12.0f), 0);
                bVar.f29045b.setLayoutParams(layoutParams);
                bVar.e.setLayoutParams(layoutParams);
                bVar.j.setLayoutParams(layoutParams);
                bVar.i.setLayoutParams(layoutParams);
                bVar.f.setLayoutParams(layoutParams);
                bVar.h.setLayoutParams(layoutParams);
                bVar.g.setLayoutParams(layoutParams);
                bVar.m.setLayoutParams(layoutParams);
                d();
                return;
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(qrs.d(this.f29037a, 55.0f), qrs.d(this.f29037a, 55.0f));
            layoutParams2.setMargins(0, 0, qrs.d(this.f29037a, 8.0f), 0);
            bVar.f29045b.setLayoutParams(layoutParams2);
            bVar.e.setLayoutParams(layoutParams2);
            bVar.j.setLayoutParams(layoutParams2);
            bVar.i.setLayoutParams(layoutParams2);
            bVar.f.setLayoutParams(layoutParams2);
            bVar.h.setVisibility(8);
            bVar.g.setVisibility(8);
            bVar.m.setVisibility(8);
        }
    }

    private void d() {
        for (int i = 0; i < this.i.size(); i++) {
            ImageView[] imageViewArr = this.d;
            if (i < imageViewArr.length) {
                imageViewArr[i].setVisibility(0);
            }
        }
    }

    private boolean a(List<String> list) {
        int iD = d(list);
        if (this.i.size() != iD) {
            return true;
        }
        for (int i = 0; i < iD; i++) {
            if (njy.e(list, i) || njy.e(this.i, i) || !list.get(i).equals(this.i.get(i))) {
                return true;
            }
        }
        return false;
    }

    static class d extends RecyclerView.ViewHolder {
        HealthTextView d;

        d(View view) {
            super(view);
            this.d = (HealthTextView) view.findViewById(R.id.divider_content);
        }
    }

    static class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthDivider f29041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f29042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        View f29043c;
        ImageView d;
        HealthProgressBar e;
        ImageView f;
        View h;
        ImageView i;
        HealthTextView j;

        a(View view) {
            super(view);
            this.i = (ImageView) view.findViewById(R.id.content_icon);
            this.f29042b = (HealthTextView) view.findViewById(R.id.content_title);
            this.f = (ImageView) view.findViewById(R.id.list_content_red_point);
            this.f29041a = (HealthDivider) view.findViewById(R.id.list_content_line);
            this.d = (ImageView) view.findViewById(R.id.list_content_arrow_right);
            this.e = (HealthProgressBar) view.findViewById(R.id.hw_update_loading_hpb);
            this.h = view.findViewById(R.id.top_padding);
            this.f29043c = view.findViewById(R.id.bottom_padding);
            this.j = (HealthTextView) view.findViewById(R.id.list_point_tips);
        }
    }

    class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f29044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f29045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f29046c;
        ImageView d;
        ImageView e;
        ImageView f;
        ImageView g;
        ImageView h;
        ImageView i;
        ImageView j;
        FrameLayout k;
        LinearLayout l;
        ImageView m;
        LinearLayout n;
        HealthTextView o;

        b(View view) {
            super(view);
            this.f29046c = (HealthTextView) view.findViewById(R.id.user_profile_myreward_title_tv);
            this.k = (FrameLayout) view.findViewById(R.id.user_profile_myreward_content_layout);
            this.l = (LinearLayout) view.findViewById(R.id.user_profile_myreward_none_layout);
            this.n = (LinearLayout) view.findViewById(R.id.social_reward_lly);
            this.f29044a = (ImageView) view.findViewById(R.id.my_medal_list_arrow_gray2);
            this.o = (HealthTextView) view.findViewById(R.id.user_profile_myreward_total_tv);
            this.d = (ImageView) view.findViewById(R.id.mymedal_red_point);
            this.f29045b = (ImageView) view.findViewById(R.id.social_reward_1);
            this.e = (ImageView) view.findViewById(R.id.social_reward_2);
            this.j = (ImageView) view.findViewById(R.id.social_reward_3);
            this.i = (ImageView) view.findViewById(R.id.social_reward_4);
            this.f = (ImageView) view.findViewById(R.id.social_reward_5);
            this.h = (ImageView) view.findViewById(R.id.social_reward_6);
            this.g = (ImageView) view.findViewById(R.id.social_reward_7);
            this.m = (ImageView) view.findViewById(R.id.social_reward_8);
            PersonalCenterRecyclerViewAdapter.this.d[0] = this.f29045b;
            PersonalCenterRecyclerViewAdapter.this.d[1] = this.e;
            PersonalCenterRecyclerViewAdapter.this.d[2] = this.j;
            PersonalCenterRecyclerViewAdapter.this.d[3] = this.i;
            PersonalCenterRecyclerViewAdapter.this.d[4] = this.f;
            PersonalCenterRecyclerViewAdapter.this.d[5] = this.h;
            PersonalCenterRecyclerViewAdapter.this.d[6] = this.g;
            PersonalCenterRecyclerViewAdapter.this.d[7] = this.m;
        }
    }

    static class e extends RecyclerView.ViewHolder {
        ImageView d;
        ImageView e;

        e(View view) {
            super(view);
        }

        void c() {
            this.d = (ImageView) this.itemView.findViewById(R.id.item_banner_ad_img);
            this.e = (ImageView) this.itemView.findViewById(R.id.item_banner_ad_close_icon);
        }

        void c(boolean z, wre wreVar) {
            boolean z2 = (z && wreVar != null && (wreVar.b() instanceof String)) ? false : true;
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            if (z2) {
                layoutParams.height = 0;
                layoutParams.width = 0;
                this.itemView.setLayoutParams(layoutParams);
                this.itemView.setVisibility(8);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
            int iB = fxk.b();
            layoutParams2.width = iB;
            layoutParams2.height = iB / 4;
            this.d.setLayoutParams(layoutParams2);
            layoutParams.height = -2;
            layoutParams.width = -1;
            this.itemView.setLayoutParams(layoutParams);
            this.itemView.setVisibility(0);
            this.itemView.setTag(R.layout.item_personal_center_banner_ad, Long.valueOf(System.currentTimeMillis()));
            qqf.e((String) wreVar.b(), this.d);
        }
    }

    static class c extends RecyclerView.ViewHolder {
        private Map<Integer, ResourceResultInfo> e;

        c(View view) {
            super(view);
        }

        void d() {
            final LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.item_my_grid);
            final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
            ArrayList arrayList = new ArrayList();
            arrayList.add(4168);
            arrayList.add(9013);
            Task<Map<Integer, ResourceResultInfo>> resourceResultInfo = marketingApi.getResourceResultInfo(arrayList);
            LogUtil.a("PersonalCenterRecyclerViewAdapter", "GridHolder start reach Message");
            resourceResultInfo.addOnSuccessListener(new OnSuccessListener<Map<Integer, ResourceResultInfo>>() { // from class: com.huawei.ui.main.stories.userprofile.activity.PersonalCenterRecyclerViewAdapter.c.4
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Map<Integer, ResourceResultInfo> map) {
                    Map<Integer, ResourceResultInfo> mapFilterMarketingRules = marketingApi.filterMarketingRules(map);
                    if (c.this.e == null || !c.this.e.equals(mapFilterMarketingRules)) {
                        c.this.e = mapFilterMarketingRules;
                        ArrayList arrayList2 = new ArrayList();
                        for (Map.Entry<Integer, ResourceResultInfo> entry : mapFilterMarketingRules.entrySet()) {
                            if (entry.getKey().intValue() == 9013) {
                                List<View> listC = c.this.c(9013, mapFilterMarketingRules);
                                if (njy.b(listC) && listC.size() >= 1) {
                                    arrayList2.add(listC.get(0));
                                }
                            } else {
                                arrayList2.addAll(c.this.c(entry.getKey().intValue(), mapFilterMarketingRules));
                            }
                        }
                        LogUtil.a("PersonalCenterRecyclerViewAdapter", "GridHolder viewList.size : ", Integer.valueOf(arrayList2.size()));
                        linearLayout.removeAllViews();
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            linearLayout.addView((View) it.next());
                        }
                        return;
                    }
                    LogUtil.j("PersonalCenterRecyclerViewAdapter", "GridHolder same resource map");
                }
            });
        }

        List<View> c(int i, Map<Integer, ResourceResultInfo> map) {
            MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
            HashMap map2 = new HashMap();
            map2.put(Integer.valueOf(i), map.get(Integer.valueOf(i)));
            return marketingApi.getMarketingViewList(BaseApplication.getContext(), map2);
        }
    }
}
