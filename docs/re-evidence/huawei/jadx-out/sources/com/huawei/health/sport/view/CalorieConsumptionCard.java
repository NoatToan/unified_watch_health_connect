package com.huawei.health.sport.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.health.servicesui.R;
import com.huawei.health.sport.model.CalorieConsumptionViewModel;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.iun;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes31.dex */
public class CalorieConsumptionCard extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f8808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f8809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f8810c;
    private CustomAlertDialog d;
    private ImageView e;
    private ImageView f;
    private LinearLayout i;
    private View j;

    public CalorieConsumptionCard(Context context) {
        super(context);
        c(context);
    }

    public CalorieConsumptionCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context);
    }

    public CalorieConsumptionCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context);
    }

    private void c(Context context) {
        this.j = LayoutInflater.from(context).inflate(R.layout.sug_fitness_calorie_consumption_dialog, this);
        this.f8808a = (ImageView) findViewById(R.id.message_morning);
        this.f = (ImageView) findViewById(R.id.message_afternoon);
        this.f8809b = (ImageView) findViewById(R.id.message_evening);
        this.e = (ImageView) findViewById(R.id.diet_exit);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.calorie_consumption);
        this.i = linearLayout;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.sport.view.CalorieConsumptionCard.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.b("DietDiaryEnergyCard", "goToDietDiaryFastRecord");
                CalorieConsumptionCard.this.c();
            }
        });
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.sport.view.CalorieConsumptionCard.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.b("DietDiaryEnergyCard", "customViewDialog dismiss");
                if (CalorieConsumptionCard.this.d != null) {
                    CalorieConsumptionCard.this.d.dismiss();
                }
            }
        });
        this.f8810c = (HealthTextView) findViewById(R.id.current_exercise_consumption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        iun.i("DietDiaryEnergyCard");
        CustomAlertDialog customAlertDialog = this.d;
        if (customAlertDialog != null) {
            customAlertDialog.dismiss();
        }
    }

    public void setCustomViewDialog(CustomAlertDialog customAlertDialog) {
        this.d = customAlertDialog;
    }

    private void setCalorieConsumption(String str) {
        this.f8810c.setText(str);
    }

    private void setCheckInImageView(CalorieConsumptionViewModel.c cVar) {
        c(this.f8808a, cVar.e());
        c(this.f, cVar.c());
        c(this.f8809b, cVar.b());
    }

    private void c(ImageView imageView, int i) {
        if (i == 1) {
            imageView.setImageResource(R.drawable.sug_rpe_diet_diary_has_record);
        } else if (i == 2) {
            imageView.setImageResource(R.drawable.sug_rpe_diet_diary_not_record);
        } else {
            imageView.setImageResource(R.drawable.sug_rpe_diet_diary_miss_recorded);
        }
    }
}
