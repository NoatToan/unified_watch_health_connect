package com.huawei.ui.homewear21.home.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.home.listener.WearHomeListener;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qrs;
import defpackage.tlj;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes18.dex */
public class WearHomeFeatureCardAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f26278a = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.cardCornerRadius);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<tlj> f26279b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f26280c;
    private WearHomeListener d;
    private LayoutInflater e;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    public WearHomeFeatureCardAdapter(Context context, List<tlj> list) {
        this.f26280c = context;
        if (njy.b(list)) {
            this.f26279b.addAll(list);
        }
        this.e = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new WearHomeFeatureCardViewHolder(this.e.inflate(R.layout.wear_home_feature_card_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (i < this.f26279b.size() && (viewHolder instanceof WearHomeFeatureCardViewHolder)) {
            d((WearHomeFeatureCardViewHolder) viewHolder, i);
        }
    }

    private void d(WearHomeFeatureCardViewHolder wearHomeFeatureCardViewHolder, final int i) {
        tlj tljVar = this.f26279b.get(i);
        wearHomeFeatureCardViewHolder.e.setText(tljVar.e());
        if (TextUtils.isEmpty(tljVar.b())) {
            wearHomeFeatureCardViewHolder.e.setLines(2);
            wearHomeFeatureCardViewHolder.f26284a.setVisibility(8);
        } else {
            wearHomeFeatureCardViewHolder.e.setLines(1);
            wearHomeFeatureCardViewHolder.f26284a.setVisibility(0);
            wearHomeFeatureCardViewHolder.f26284a.setText(tljVar.b());
        }
        c(tljVar.d(), wearHomeFeatureCardViewHolder);
        b(wearHomeFeatureCardViewHolder, tljVar);
        wearHomeFeatureCardViewHolder.f26286c.setEnabled(tljVar.h());
        if (tljVar.h()) {
            wearHomeFeatureCardViewHolder.f26286c.setAlpha(1.0f);
        } else {
            wearHomeFeatureCardViewHolder.f26286c.setAlpha(0.38f);
        }
        if (tljVar.j()) {
            wearHomeFeatureCardViewHolder.j.setVisibility(0);
        } else {
            wearHomeFeatureCardViewHolder.j.setVisibility(4);
        }
        wearHomeFeatureCardViewHolder.f26286c.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homewear21.home.adapter.WearHomeFeatureCardAdapter.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (WearHomeFeatureCardAdapter.this.d != null) {
                    WearHomeFeatureCardAdapter.this.d.onItemClick(i);
                }
            }
        });
        if (tljVar.f()) {
            wearHomeFeatureCardViewHolder.f26285b.setVisibility(0);
        } else {
            wearHomeFeatureCardViewHolder.f26285b.setVisibility(4);
        }
    }

    private void b(WearHomeFeatureCardViewHolder wearHomeFeatureCardViewHolder, tlj tljVar) {
        if (TextUtils.isEmpty(tljVar.a())) {
            Drawable drawable = this.f26280c.getResources().getDrawable(tljVar.c());
            drawable.setAutoMirrored(b(tljVar));
            wearHomeFeatureCardViewHolder.d.setImageDrawable(drawable);
        } else {
            LogUtil.a("WearHomeFeatureCardAdapter", "setIcon doctorImgUrl = ", tljVar.a());
            ViewGroup.LayoutParams layoutParams = wearHomeFeatureCardViewHolder.d.getLayoutParams();
            layoutParams.width = qrs.d(this.f26280c, 24.0f);
            layoutParams.height = qrs.d(this.f26280c, 24.0f);
            wearHomeFeatureCardViewHolder.d.setLayoutParams(layoutParams);
            qqf.b(wearHomeFeatureCardViewHolder.d, tljVar.a(), f26278a, 0, tljVar.c());
        }
    }

    private boolean b(tlj tljVar) {
        if (tljVar.d() == 111 || tljVar.d() == 122) {
            return false;
        }
        if (tljVar.d() == 128 || tljVar.d() == 115) {
            return (LanguageUtil.br(this.f26280c) || LanguageUtil.x(this.f26280c)) ? false : true;
        }
        return true;
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1095)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private void c(int r4, com.huawei.ui.homewear21.home.adapter.WearHomeFeatureCardAdapter.WearHomeFeatureCardViewHolder r5) {
        /*
            r3 = this;
            android.content.Context r0 = r3.f26280c
            boolean r0 = health.compact.a.LanguageUtil.f(r0)
            if (r0 != 0) goto L6c
            r0 = 108(0x6c, float:1.51E-43)
            r1 = 1
            if (r4 == r0) goto L52
            r0 = 109(0x6d, float:1.53E-43)
            if (r4 == r0) goto L38
            r0 = 118(0x76, float:1.65E-43)
            r2 = 2
            if (r4 == r0) goto L23
            switch(r4) {
                case 104: goto L52;
                case 105: goto L1d;
                case 106: goto L52;
                default: goto L19;
            }
        L19:
            switch(r4) {
                case 122: goto L52;
                case 123: goto L52;
                case 124: goto L52;
                default: goto L1c;
            }
        L1c:
            goto L46
        L1d:
            com.huawei.ui.commonui.healthtextview.HealthTextView r4 = r5.e
            r4.setLines(r2)
            return
        L23:
            android.content.Context r4 = r3.f26280c
            boolean r4 = health.compact.a.LanguageUtil.bb(r4)
            if (r4 == 0) goto L32
            com.huawei.ui.commonui.healthtextview.HealthTextView r4 = r5.e
            r5 = 3
            r4.setLines(r5)
            return
        L32:
            com.huawei.ui.commonui.healthtextview.HealthTextView r4 = r5.e
            r4.setLines(r2)
            return
        L38:
            android.content.Context r4 = r3.f26280c
            boolean r4 = health.compact.a.LanguageUtil.ag(r4)
            if (r4 == 0) goto L46
            com.huawei.ui.commonui.healthtextview.HealthTextView r4 = r5.e
            r4.setLines(r1)
            return
        L46:
            java.lang.String r4 = "setTextSpecialFormat else."
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = "WearHomeFeatureCardAdapter"
            com.huawei.hwlogsmodel.LogUtil.d(r5, r4)
            return
        L52:
            r0 = 123(0x7b, float:1.72E-43)
            if (r4 != r0) goto L5f
            android.content.Context r4 = r3.f26280c
            boolean r4 = health.compact.a.LanguageUtil.p(r4)
            if (r4 == 0) goto L5f
            goto L6c
        L5f:
            com.huawei.ui.commonui.healthtextview.HealthTextView r4 = r5.e
            r0 = 1091567616(0x41100000, float:9.0)
            r4.setTextSize(r1, r0)
            com.huawei.ui.commonui.healthtextview.HealthTextView r4 = r5.e
            r5 = 4
            r4.setLines(r5)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.ui.homewear21.home.adapter.WearHomeFeatureCardAdapter.c(int, com.huawei.ui.homewear21.home.adapter.WearHomeFeatureCardAdapter$WearHomeFeatureCardViewHolder):void");
    }

    public void d(List<tlj> list) {
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new a(this.f26279b, list));
        this.f26279b.clear();
        if (njy.b(list)) {
            this.f26279b.addAll(list);
        }
        diffResultCalculateDiff.dispatchUpdatesTo(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f26279b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LogUtil.a("WearHomeFeatureCardAdapter", "Utils.isWidescreen(mContext)", Boolean.valueOf(qrs.af(this.f26280c)));
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.huawei.ui.homewear21.home.adapter.WearHomeFeatureCardAdapter.3
                @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                public int getSpanSize(int i) {
                    LogUtil.a("WearHomeFeatureCardAdapter", "Utils.isWidescreen(mContext):", Boolean.valueOf(qrs.af(WearHomeFeatureCardAdapter.this.f26280c)));
                    int spanCount = gridLayoutManager.getSpanCount();
                    LogUtil.a("WearHomeFeatureCardAdapter", "spanCount:", Integer.valueOf(spanCount), "mWearHomeFeatureBeans.size():", Integer.valueOf(WearHomeFeatureCardAdapter.this.f26279b.size()));
                    return WearHomeFeatureCardAdapter.this.d(spanCount, i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d(int i, int i2) {
        return (i == 2 && this.f26279b.size() % 2 != 0 && this.f26279b.size() - 1 == i2) ? 2 : 1;
    }

    public void d(WearHomeListener wearHomeListener) {
        this.d = wearHomeListener;
    }

    public static class WearHomeFeatureCardViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f26284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f26285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        RelativeLayout f26286c;
        ImageView d;
        HealthTextView e;
        ImageView j;

        public WearHomeFeatureCardViewHolder(View view) {
            super(view);
            this.f26286c = (RelativeLayout) view.findViewById(R.id.feature_card);
            this.e = (HealthTextView) view.findViewById(R.id.description);
            this.f26284a = (HealthTextView) view.findViewById(R.id.description_status);
            this.d = (ImageView) view.findViewById(R.id.icon);
            this.j = (ImageView) view.findViewById(R.id.detail_apps_red_dot);
            this.f26285b = (HealthTextView) view.findViewById(R.id.beta);
        }
    }

    static class a extends DiffUtil.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<tlj> f26287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<tlj> f26288c;

        a(List<tlj> list, List<tlj> list2) {
            this.f26287b = list;
            this.f26288c = list2;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getOldListSize() {
            List<tlj> list = this.f26287b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getNewListSize() {
            List<tlj> list = this.f26288c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int i, int i2) {
            return this.f26287b.get(i).d() == this.f26288c.get(i2).d();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int i, int i2) {
            tlj tljVar = this.f26287b.get(i);
            tlj tljVar2 = this.f26288c.get(i2);
            return tljVar.d() == tljVar2.d() && tljVar.c() == tljVar2.c() && tljVar.h() == tljVar2.h() && tljVar.j() == tljVar2.j() && tljVar.f() == tljVar2.f() && Objects.equals(tljVar.e(), tljVar2.e()) && Objects.equals(tljVar.b(), tljVar2.b()) && Objects.equals(tljVar.a(), tljVar2.a());
        }
    }
}
