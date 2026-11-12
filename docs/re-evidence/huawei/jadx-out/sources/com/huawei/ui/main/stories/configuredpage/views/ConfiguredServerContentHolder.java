package com.huawei.ui.main.stories.configuredpage.views;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.dlm;
import defpackage.njy;
import defpackage.out;
import defpackage.qqf;
import defpackage.qrs;
import defpackage.tre;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ConfiguredServerContentHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f26389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f26390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f26391c;
    private HealthDivider d;
    private dlm e;
    private HealthTextView f;
    private HealthTextView h;

    public ConfiguredServerContentHolder(View view) {
        super(view);
        this.f26389a = BaseApplication.getContext();
        this.f26390b = (LinearLayout) out.b(view, R.id.server_item_content_rl);
        this.h = (HealthTextView) out.b(view, R.id.server_title);
        this.f = (HealthTextView) out.b(view, R.id.server_content);
        this.f26391c = (ImageView) out.b(view, R.id.server_content_icon);
        this.d = (HealthDivider) out.b(view, R.id.server_list_content_line);
        this.f26390b.setOnClickListener(this);
    }

    public void b(List<dlm> list, dlm dlmVar, int i) {
        if (njy.e(list) || dlmVar == null) {
            return;
        }
        this.e = dlmVar;
        this.h.setText(dlmVar.o());
        if (TextUtils.isEmpty(dlmVar.e())) {
            this.f.setVisibility(8);
        } else {
            this.f.setVisibility(0);
            this.f.setText(dlmVar.e());
        }
        String strJ = dlmVar.j();
        if (!TextUtils.isEmpty(strJ)) {
            int iD = qrs.d(this.f26389a, 48.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iD, iD);
            layoutParams.gravity = 16;
            this.f26391c.setLayoutParams(layoutParams);
            qqf.b(this.f26391c, strJ, (int) this.f26389a.getResources().getDimension(R.dimen.gridCornerRadius), 0, 0);
        } else {
            LogUtil.j("ConfiguredServerContentHolder", "initView() imageUrl is empty.");
        }
        if (i == list.size() - 1) {
            this.d.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f26390b) {
            tre.c(this.f26389a, this.e);
        }
    }
}
