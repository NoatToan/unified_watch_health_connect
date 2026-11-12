package com.huawei.ui.main.stories.userprofile.card;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.qqz;
import defpackage.qrs;
import defpackage.wre;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes19.dex */
public class PersonalGridCardViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f29053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RelativeLayout f29054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f29055c;
    private HealthTextView d;
    private ImageView e;
    private HealthTextView f;
    private boolean g;
    private ImageView h;
    private HealthTextView i;
    private wre j;
    private LinearLayout m;
    private HealthTextView n;
    private ImageView o;

    public PersonalGridCardViewHolder(View view, Context context, wre wreVar) {
        super(view);
        this.f29055c = context;
        this.j = wreVar;
    }

    public void e() {
        this.f29054b = (RelativeLayout) this.itemView.findViewById(R.id.item_channel_view_horizontal);
        this.i = (HealthTextView) this.itemView.findViewById(R.id.item_channel_text);
        this.d = (HealthTextView) this.itemView.findViewById(R.id.item_channel_desc);
        this.e = (ImageView) this.itemView.findViewById(R.id.channel_icon);
        this.f29053a = (ImageView) this.itemView.findViewById(R.id.item_channel_red_point);
        this.m = (LinearLayout) this.itemView.findViewById(R.id.item_channel_view_vertical);
        this.n = (HealthTextView) this.itemView.findViewById(R.id.item_channel_text_vertical);
        this.f = (HealthTextView) this.itemView.findViewById(R.id.item_channel_desc_vertical);
        this.o = (ImageView) this.itemView.findViewById(R.id.channel_icon_vertical);
        this.h = (ImageView) this.itemView.findViewById(R.id.item_channel_red_point_vertical);
        if (this.g) {
            this.m.setVisibility(0);
            this.f29054b.setVisibility(8);
        } else {
            this.m.setVisibility(8);
            this.f29054b.setVisibility(0);
        }
        d();
        c();
    }

    private void c() {
        wre wreVar = this.j;
        if (wreVar == null) {
            LogUtil.j("PersonalGridCardViewHolder", "mListBean is empty");
            return;
        }
        this.i.setText(wreVar.a());
        this.n.setText(this.j.a());
        if (this.j.b() instanceof String) {
            String str = (String) this.j.b();
            this.d.setText(str);
            this.f.setText(str);
        }
        if (LanguageUtil.ba(this.f29055c) && this.j.d() == R.mipmap.img_me_weeks_months_years) {
            this.e.setImageDrawable(qqz.e(this.f29055c, this.j.d()));
            this.o.setImageDrawable(qqz.e(this.f29055c, this.j.d()));
        } else {
            this.e.setImageResource(this.j.d());
            this.o.setImageResource(this.j.d());
        }
        this.f29053a.setVisibility(this.j.n() ? 0 : 8);
        this.h.setVisibility(this.j.n() ? 0 : 8);
        this.itemView.setOnClickListener(this.j.g());
    }

    public void a(wre wreVar) {
        this.j = wreVar;
        if ((wreVar.b() instanceof String) && this.d != null) {
            String str = (String) wreVar.b();
            this.d.setText(str);
            this.f.setText(str);
            LogUtil.a("PersonalGridCardViewHolder", "updateCardDesc = ", str);
        }
        d();
        a(wreVar.n());
    }

    private void d() {
        if (!LanguageUtil.f(this.f29055c)) {
            this.i.setMaxLines(2);
            this.n.setMaxLines(2);
            this.d.setMaxLines(2);
            this.f.setMaxLines(2);
            a(2);
        } else {
            this.i.setMaxLines(1);
            this.n.setMaxLines(1);
            this.d.setMaxLines(1);
            this.f.setMaxLines(1);
            a(1);
        }
        if (qrs.y()) {
            return;
        }
        this.d.setAutoTextInfo(9, 1, 1);
        this.f.setAutoTextInfo(9, 1, 1);
    }

    public void a(boolean z) {
        ImageView imageView = this.f29053a;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
            this.h.setVisibility(z ? 0 : 8);
        }
    }

    public void b(boolean z) {
        this.g = z;
        LinearLayout linearLayout = this.m;
        if (linearLayout == null) {
            LogUtil.j("PersonalGridCardViewHolder", "setIsVerticalLayout view not init ");
        } else if (z) {
            linearLayout.setVisibility(0);
            this.f29054b.setVisibility(8);
        } else {
            linearLayout.setVisibility(8);
            this.f29054b.setVisibility(0);
        }
    }

    private void a(int i) {
        if (this.g) {
            this.m.setMinimumHeight(this.f29055c.getResources().getDimensionPixelOffset(i == 1 ? R.dimen.health_common_97dp : R.dimen.health_common_126dp));
        } else {
            this.f29054b.setMinimumHeight(this.f29055c.getResources().getDimensionPixelOffset(i == 1 ? R.dimen.health_common_61dp : R.dimen.health_common_86dp));
        }
    }
}
