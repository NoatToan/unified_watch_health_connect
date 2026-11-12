package com.huawei.ui.commonui.sport.base;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.njy;
import defpackage.qpa;
import defpackage.qpd;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class GridBanner extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthDotsPageIndicator f23890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthViewPager f23891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f23892c;
    private Context d;
    private qpd e;
    private int i;

    public GridBanner(Context context) {
        super(context);
        e(context);
    }

    public GridBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context);
    }

    public GridBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(context);
    }

    private void e(Context context) {
        this.d = context;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.layout_common_banner, (ViewGroup) this, false);
        this.f23892c = linearLayout;
        addView(linearLayout);
        this.f23890a = (HealthDotsPageIndicator) this.f23892c.findViewById(R.id.common_banner_indicator);
    }

    public void setData(List<qpa> list) {
        this.e = new qpd();
        List<View> listE = e(list);
        a();
        this.f23891b.setAdapter(this.e);
        this.e.e(listE);
        this.f23890a.setViewPager(this.f23891b);
    }

    private void a() {
        if (this.f23891b != null) {
            return;
        }
        HealthViewPager healthViewPager = new HealthViewPager(this.d);
        this.f23891b = healthViewPager;
        healthViewPager.setClipToPadding(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.i);
        layoutParams.gravity = 1;
        this.f23891b.setLayoutParams(layoutParams);
        this.f23892c.addView(this.f23891b, 0);
    }

    private List<View> e(List<qpa> list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            qpa qpaVar = list.get(i);
            View viewInflate = LayoutInflater.from(this.d).inflate(R.layout.layout_common_banner_grid, (ViewGroup) null);
            HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.common_banner_header);
            healthSubHeader.setHeadTitleText(qpaVar.b());
            healthSubHeader.setSubHeaderBackgroundColor(ContextCompat.getColor(this.d, R.color.colorCardPanelBg));
            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.common_banner_grid_recycler);
            recyclerView.setAdapter(new b(this.d, qpaVar.c()));
            recyclerView.setLayoutManager(new GridLayoutManager(this.d, 3, 1, false) { // from class: com.huawei.ui.commonui.sport.base.GridBanner.1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public boolean canScrollHorizontally() {
                    return false;
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public boolean canScrollVertically() {
                    return false;
                }
            });
            viewInflate.measure(View.MeasureSpec.makeMeasureSpec(qrs.q(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(qrs.m(), Integer.MIN_VALUE));
            int measuredHeight = viewInflate.getMeasuredHeight();
            arrayList.add(viewInflate);
            this.i = Math.max(measuredHeight, this.i);
        }
        return arrayList;
    }

    static final class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String[] f23894c = {"ml", "si", "ja", "ar", "pt", "ca", "fr", "gl", "it", "jv", "lt", "ms", "sk", "sv"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HealthTextView f23895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HealthTextView f23896b;
        private boolean d;
        private final ImageView e;

        public d(View view) {
            super(view);
            this.f23895a = (HealthTextView) view.findViewById(R.id.grid_title);
            this.f23896b = (HealthTextView) view.findViewById(R.id.grid_sub_title);
            this.e = (ImageView) view.findViewById(R.id.grid_divider);
            this.d = e();
        }

        public void d(qpa.e eVar, int i, int i2) {
            this.f23895a.setText(eVar.f46596c);
            this.f23896b.setText(eVar.d);
            if (i2 > 3 && i > 2 && this.d) {
                this.f23895a.setHeight(qrs.d(BaseApplication.b(), 18.0f));
                this.f23895a.setTextSize(1, 16.0f);
                this.f23895a.setMaxLines(1);
                this.f23895a.setEllipsize(TextUtils.TruncateAt.END);
                this.f23896b.setHeight(qrs.d(BaseApplication.b(), 42.0f));
                this.f23896b.setTextSize(1, 10.0f);
                this.f23896b.setMaxLines(2);
                this.f23896b.setEllipsize(TextUtils.TruncateAt.END);
            }
            if ((i + 1) % 3 == 0 || i == i2 - 1) {
                this.e.setVisibility(8);
            }
        }

        private boolean e() {
            String language = BaseApplication.b().getResources().getConfiguration().locale.getLanguage();
            for (String str : f23894c) {
                if (str.equalsIgnoreCase(language)) {
                    return true;
                }
            }
            return false;
        }
    }

    static final class b extends RecyclerView.Adapter<d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f23893c;
        private List<qpa.e> e;

        public b(Context context, List<qpa.e> list) {
            ArrayList arrayList = new ArrayList();
            this.e = arrayList;
            this.f23893c = context;
            arrayList.addAll(list);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public d onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new d(LayoutInflater.from(this.f23893c).inflate(R.layout.layout_common_banner_grid_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(d dVar, int i) {
            if (njy.e(this.e, i)) {
                LogUtil.j("GridBanner", "mRecyclerDataList isOutOfBounds");
            } else {
                dVar.d(this.e.get(i), i, getItemCount());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.e.size();
        }
    }
}
