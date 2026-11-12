package com.huawei.ui.homewear21.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.home.bean.WearHomeXmlParseBean;
import com.huawei.ui.homewear21.home.listener.WearHomeListener;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.tll;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class WearHomeLegalRecyclerAdapter extends RecyclerView.Adapter<LegalViewHolder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WearHomeListener f26304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<?> f26305c;
    private Context d;
    private String e;

    public WearHomeLegalRecyclerAdapter(Context context, List<?> list, String str) {
        this.d = context;
        this.f26305c = list;
        this.e = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public LegalViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new LegalViewHolder(LayoutInflater.from(this.d).inflate(R.layout.activity_device_legal_information_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(LegalViewHolder legalViewHolder, final int i) {
        if (i >= this.f26305c.size()) {
            return;
        }
        if (this.e.equals("legalAdapter")) {
            legalViewHolder.f26309c.setText(((tll) this.f26305c.get(i)).b());
        } else {
            Object obj = this.f26305c.get(i);
            if (obj instanceof WearHomeXmlParseBean) {
                legalViewHolder.f26309c.setText(((WearHomeXmlParseBean) obj).getXmlName());
            }
        }
        if (this.f26305c.size() - 1 == i) {
            legalViewHolder.e.setVisibility(8);
        }
        if (LanguageUtil.ba(this.d)) {
            legalViewHolder.f26307a.setBackgroundResource(R.drawable.common_ui_arrow_left);
        } else {
            legalViewHolder.f26307a.setBackgroundResource(R.drawable.common_ui_arrow_right);
        }
        legalViewHolder.f26308b.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homewear21.home.adapter.WearHomeLegalRecyclerAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (WearHomeLegalRecyclerAdapter.this.f26304b != null) {
                    if (!qrs.r()) {
                        WearHomeLegalRecyclerAdapter.this.f26304b.onItemClick(i);
                    } else {
                        LogUtil.j(WearHomeLegalRecyclerAdapter.this.e, "click too fast");
                    }
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f26305c.size() > 0) {
            return this.f26305c.size();
        }
        return 0;
    }

    public void b(WearHomeListener wearHomeListener) {
        this.f26304b = wearHomeListener;
    }

    public static class LegalViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ImageView f26307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RelativeLayout f26308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f26309c;
        private HealthDivider e;

        LegalViewHolder(View view) {
            super(view);
            this.e = (HealthDivider) qsp.a(view, R.id.legal_divider);
            this.f26309c = (HealthTextView) qsp.a(view, R.id.legal_information_content);
            this.f26308b = (RelativeLayout) qsp.a(view, R.id.relative_setting_legal_information);
            this.f26307a = (ImageView) qsp.a(view, R.id.legal_image);
        }
    }
}
