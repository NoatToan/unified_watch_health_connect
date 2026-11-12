package com.huawei.ui.homehealth.functionsetcardmanagement;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.refreshcard.CardViewHolder;
import defpackage.qqs;
import defpackage.skw;
import defpackage.tfh;

/* JADX INFO: loaded from: classes17.dex */
public class FunctionSetCardManagementDeleteChineseViewHolder extends CardViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HealthTextView f25477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RelativeLayout f25478b;
    private ImageView d;
    private ImageView e;

    FunctionSetCardManagementDeleteChineseViewHolder(View view, Context context, boolean z) {
        super(view, context, z);
        this.f25477a = (HealthTextView) view.findViewById(R.id.itemText);
        this.e = (ImageView) view.findViewById(R.id.icon);
        this.d = (ImageView) view.findViewById(R.id.card_small_img);
        this.f25478b = (RelativeLayout) view.findViewById(R.id.card_content_layout);
    }

    public void b(skw skwVar, boolean z) {
        if (z) {
            this.e.setVisibility(0);
            if (qqs.e(getContext())) {
                this.e.setBackground(getContext().getResources().getDrawable(R.drawable.add_card_dark));
            } else {
                this.e.setBackground(getContext().getResources().getDrawable(R.drawable.add_card));
            }
        } else {
            this.e.setVisibility(8);
        }
        tfh.b(getContext(), skwVar, this.f25477a, this.d);
    }

    public ImageView d() {
        return this.e;
    }

    public RelativeLayout b() {
        return this.f25478b;
    }
}
