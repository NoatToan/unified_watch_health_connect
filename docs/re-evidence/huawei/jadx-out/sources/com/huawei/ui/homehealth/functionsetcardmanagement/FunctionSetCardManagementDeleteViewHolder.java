package com.huawei.ui.homehealth.functionsetcardmanagement;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.refreshcard.CardViewHolder;
import defpackage.skw;
import defpackage.tfh;

/* JADX INFO: loaded from: classes17.dex */
public class FunctionSetCardManagementDeleteViewHolder extends CardViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HealthTextView f25479a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthDivider f25480c;
    private ImageView d;

    FunctionSetCardManagementDeleteViewHolder(View view, Context context, boolean z) {
        super(view, context, z);
        this.f25479a = (HealthTextView) view.findViewById(R.id.itemText);
        this.d = (ImageView) view.findViewById(R.id.itemAdd);
        this.f25480c = (HealthDivider) view.findViewById(R.id.healthDividerBar);
    }

    public void b(skw skwVar) {
        tfh.c(skwVar, this.f25479a);
    }

    public ImageView b() {
        return this.d;
    }

    public HealthDivider e() {
        return this.f25480c;
    }
}
