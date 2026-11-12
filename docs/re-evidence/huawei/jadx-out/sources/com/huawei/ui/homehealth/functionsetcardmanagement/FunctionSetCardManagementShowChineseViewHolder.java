package com.huawei.ui.homehealth.functionsetcardmanagement;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.homeinterface.OnStartDragListener;
import com.huawei.ui.homehealth.refreshcard.CardViewHolder;
import defpackage.qqs;
import defpackage.skw;
import defpackage.tfh;

/* JADX INFO: loaded from: classes17.dex */
public class FunctionSetCardManagementShowChineseViewHolder extends CardViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HealthTextView f25487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f25488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f25489c;
    private final OnStartDragListener d;
    private RelativeLayout e;

    FunctionSetCardManagementShowChineseViewHolder(View view, Context context, boolean z, OnStartDragListener onStartDragListener) {
        super(view, context, z);
        this.f25487a = (HealthTextView) view.findViewById(R.id.itemText);
        this.e = (RelativeLayout) view.findViewById(R.id.card_content_layout);
        this.d = onStartDragListener;
        this.f25488b = (ImageView) view.findViewById(R.id.itemDelete);
        this.f25488b = (ImageView) view.findViewById(R.id.icon);
        this.f25489c = (ImageView) view.findViewById(R.id.card_small_img);
    }

    public void d(skw skwVar, boolean z) {
        if (z) {
            this.f25488b.setVisibility(0);
            if (qqs.e(getContext())) {
                this.f25488b.setBackground(getContext().getResources().getDrawable(R.drawable.delete_card_dark));
            } else {
                this.f25488b.setBackground(getContext().getResources().getDrawable(R.drawable.delete_card));
            }
        } else {
            this.f25488b.setVisibility(8);
        }
        tfh.b(getContext(), skwVar, this.f25487a, this.f25489c);
    }

    public ImageView c() {
        return this.f25488b;
    }

    public RelativeLayout e() {
        return this.e;
    }
}
