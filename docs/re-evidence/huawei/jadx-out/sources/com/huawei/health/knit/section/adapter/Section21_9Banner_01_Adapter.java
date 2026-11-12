package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.dkf;
import defpackage.fts;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class Section21_9Banner_01_Adapter extends RecyclerView.Adapter<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Object> f7259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Object> f7260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Object> f7261c;
    private List<Object> d;
    private List<Object> e;
    private OnClickSectionListener f;
    private Pair<Integer, Integer> g = BaseActivity.getSafeRegionWidth();
    private Context h;
    private int i;
    private Map<String, List<Object>> j;

    public Section21_9Banner_01_Adapter(Context context, OnClickSectionListener onClickSectionListener) {
        this.f = onClickSectionListener;
        this.h = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public d onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.configured_activity_page_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(d dVar, final int i) {
        d(dVar.f7264c);
        dVar.f7264c.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.adapter.Section21_9Banner_01_Adapter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Section21_9Banner_01_Adapter.this.f == null || !fts.d(Section21_9Banner_01_Adapter.this.d, i)) {
                    return;
                }
                Section21_9Banner_01_Adapter.this.f.onClick(i);
            }
        });
        if ((this.d.get(i) instanceof String) && fts.d(this.d, i)) {
            e((String) this.d.get(i), dVar.f);
        }
        if ((this.f7261c.get(i) instanceof String) && fts.d(this.f7261c, i)) {
            b((String) this.f7261c.get(i), dVar.f7262a);
        }
        if ((this.f7259a.get(i) instanceof String) && fts.d(this.f7259a, i)) {
            c((String) this.f7259a.get(i), dVar.f7263b);
        } else if ((this.f7259a.get(i) instanceof Integer) && fts.d(this.f7259a, i)) {
            c(dVar.f7263b, ((Integer) this.f7259a.get(i)).intValue());
        } else {
            dVar.f7263b.setVisibility(4);
        }
        if ((this.f7260b.get(i) instanceof String) && fts.d(this.f7260b, i)) {
            a((String) this.f7260b.get(i), dVar.d);
        }
        if ((this.e.get(i) instanceof Map) && fts.d(this.e, i)) {
            b((Map<String, Integer>) this.e.get(i), dVar.e);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return c(this.j);
    }

    class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f7262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthImageView f7263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        RelativeLayout f7264c;
        HealthTextView d;
        HealthTextView e;
        HealthTextView f;

        d(View view) {
            super(view);
            this.f7264c = (RelativeLayout) view.findViewById(R.id.activity_layout);
            this.f7263b = (HealthImageView) view.findViewById(R.id.activity_image);
            this.f7262a = (HealthTextView) view.findViewById(R.id.activity_description);
            this.f = (HealthTextView) view.findViewById(R.id.activity_title);
            this.e = (HealthTextView) view.findViewById(R.id.activity_status);
            this.d = (HealthTextView) view.findViewById(R.id.activity_join_num);
        }
    }

    private void d(RelativeLayout relativeLayout) {
        int iA = a();
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        layoutParams.width = iA;
        layoutParams.height = (iA * 9) / 21;
        relativeLayout.setLayoutParams(layoutParams);
    }

    private int a() {
        this.i = qqp.b(this.h);
        if (qrs.af(this.h)) {
            return (((this.h.getResources().getDisplayMetrics().widthPixels - this.h.getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.defaultPaddingStart)) - this.h.getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.defaultPaddingStart)) - this.i) / 2;
        }
        int i = this.h.getResources().getDisplayMetrics().widthPixels;
        int dimensionPixelSize = this.h.getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.defaultPaddingStart);
        return (((i - dimensionPixelSize) - this.h.getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.defaultPaddingStart)) - ((Integer) this.g.first).intValue()) - ((Integer) this.g.second).intValue();
    }

    public void e(Map<String, List<Object>> map) {
        this.j = map;
        this.d = new ArrayList();
        this.f7261c = new ArrayList();
        this.e = new ArrayList();
        this.f7260b = new ArrayList();
        this.f7259a = new ArrayList();
        for (Map.Entry<String, List<Object>> entry : this.j.entrySet()) {
            String key = entry.getKey();
            List<Object> value = entry.getValue();
            if (key.equals("ACTIVITY_TYPE_CONTENT")) {
                this.d = value;
            } else if (key.equals("ACTIVITY_TYPE_DESCRIPTION")) {
                this.f7261c = value;
            } else if (key.equals(CommonConstant.RETKEY.STATUS)) {
                this.e = value;
            } else if (key.equals("NUMBER")) {
                this.f7260b = value;
            } else if (key.equals("IMAGE")) {
                this.f7259a = value;
            } else {
                Log.w("Section21_9Banner_01_Adapter", "mDataList does not obtained!");
                return;
            }
        }
    }

    private int c(Map<String, List<Object>> map) {
        return dkf.a(map, "Section21_9Banner_01_Adapter");
    }

    private void c(String str, HealthImageView healthImageView) {
        a(healthImageView);
        qqf.e(healthImageView, str, qqf.d, 0, 0);
    }

    private void c(ImageView imageView, int i) {
        a(imageView);
        qqf.a(imageView, this.h.getResources().getDrawable(i), qqf.d, 0);
    }

    private void a(ImageView imageView) {
        int iA = a();
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(iA, (iA * 9) / 21));
    }

    public void b(String str, HealthTextView healthTextView) {
        if (TextUtils.isEmpty(str)) {
            healthTextView.setVisibility(4);
            Log.w("Section21_9Banner_01_Adapter", "activityDescriptionText is null.");
        } else {
            healthTextView.setText(str);
        }
    }

    private void a(String str, HealthTextView healthTextView) {
        if (TextUtils.isEmpty(str)) {
            healthTextView.setVisibility(4);
            Log.w("Section21_9Banner_01_Adapter", "numOfPeople is null.");
        } else {
            healthTextView.setText(str);
        }
    }

    private void e(String str, HealthTextView healthTextView) {
        if (TextUtils.isEmpty(str)) {
            healthTextView.setVisibility(4);
            Log.w("Section21_9Banner_01_Adapter", "activityTitleText is null.");
        } else {
            healthTextView.setText(str);
        }
    }

    private void b(Map<String, Integer> map, HealthTextView healthTextView) {
        if (map.isEmpty()) {
            Log.w("Section21_9Banner_01_Adapter", "status is null.");
            return;
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            CharSequence charSequence = (String) entry.getKey();
            Integer value = entry.getValue();
            healthTextView.setVisibility(0);
            healthTextView.setText(charSequence);
            if (healthTextView.getBackground() instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) healthTextView.getBackground();
                gradientDrawable.setColor(this.h.getResources().getColor(value.intValue()));
                healthTextView.setBackground(gradientDrawable);
            }
        }
    }
}
