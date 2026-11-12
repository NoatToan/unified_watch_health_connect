package com.huawei.health.sport.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.servicesui.R;
import com.huawei.health.sport.model.CardGuideViewModel;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.iun;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes31.dex */
public class CalorieConsumptionGuideCard extends GuideUserLayoutCard {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthImageView f8813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthImageView f8814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthImageView f8815c;
    private CardGuideViewModel d;
    private CustomAlertDialog e;

    public CalorieConsumptionGuideCard(Context context) {
        super(context);
    }

    public CalorieConsumptionGuideCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CalorieConsumptionGuideCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.sport.view.GuideUserLayoutCard
    public void d() {
        this.d.e(1);
        iun.i("CalorieConsumptionGuideCard");
        CustomAlertDialog customAlertDialog = this.e;
        if (customAlertDialog != null) {
            customAlertDialog.dismiss();
        }
    }

    @Override // com.huawei.health.sport.view.GuideUserLayoutCard
    public void a() {
        CustomAlertDialog customAlertDialog = this.e;
        if (customAlertDialog != null) {
            customAlertDialog.dismiss();
        }
    }

    @Override // com.huawei.health.sport.view.GuideUserLayoutCard
    public void a(View view) {
        this.f8815c = (HealthImageView) view.findViewById(R.id.image_start);
        this.f8813a = (HealthImageView) view.findViewById(R.id.image_middle);
        this.f8814b = (HealthImageView) view.findViewById(R.id.image_end);
    }

    public void setCustomViewDialog(CustomAlertDialog customAlertDialog) {
        this.e = customAlertDialog;
    }

    private void setCheckInImageView(final CardGuideViewModel.a aVar) {
        HandlerExecutor.b(new Runnable() { // from class: har
            @Override // java.lang.Runnable
            public final void run() {
                this.f36324c.b(aVar);
            }
        });
    }

    public /* synthetic */ void b(CardGuideViewModel.a aVar) {
        LogUtil.b("CalorieConsumptionGuideCard", "setCheckInImageView");
        c(this.f8815c, aVar.d());
        c(this.f8813a, aVar.c());
        c(this.f8814b, aVar.e());
    }

    private void c(ImageView imageView, int i) {
        if (i == 1) {
            imageView.setImageResource(R.drawable.sug_rpe_diet_diary_has_record);
            return;
        }
        if (i == 2) {
            imageView.setImageResource(R.drawable.sug_rpe_diet_diary_not_record);
        } else if (i == 3) {
            imageView.setImageResource(R.drawable.sug_rpe_diet_diary_miss_recorded);
        } else {
            LogUtil.e("CalorieConsumptionGuideCard", "setCheckInMealView pictureType = ", Integer.valueOf(i));
        }
    }
}
