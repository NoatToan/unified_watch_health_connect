package com.huawei.ui.main.stories.fitness.views.coresleep;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class SleepAudioClearDialog extends BaseDialog {
    private Context e;

    public static class Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f27264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f27265c;
        private final List<Integer> e = new ArrayList();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<View.OnClickListener> f27263a = new ArrayList();

        public Builder(Context context) {
            this.f27265c = context;
        }

        public Builder b(String str) {
            this.f27264b = str;
            return this;
        }

        public Builder d(int i, View.OnClickListener onClickListener) {
            this.e.add(Integer.valueOf(i));
            this.f27263a.add(onClickListener);
            return this;
        }

        public SleepAudioClearDialog e() {
            return new SleepAudioClearDialog(this.f27265c, this);
        }
    }

    private SleepAudioClearDialog(Context context, Builder builder) {
        super(context, R.style.CustomDialog);
        this.e = context;
        b(builder);
    }

    private void b(Builder builder) {
        View viewInflate = ((LayoutInflater) this.e.getSystemService("layout_inflater")).inflate(R.layout.sleep_audio_clear_dialog, (ViewGroup) null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.sleep_audio_clear_dialog_title);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.commonui_btn_menu_dialog_btn_container);
        if (builder.f27264b != null) {
            healthTextView.setText(builder.f27264b);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < builder.e.size(); i++) {
            int iIntValue = ((Integer) builder.e.get(i)).intValue();
            if (iIntValue != 0) {
                arrayList.add(this.e.getString(iIntValue));
            }
        }
        for (int i2 = 0; i2 < builder.e.size(); i2++) {
            HealthButton healthButton = new HealthButton(this.e);
            healthButton.setBackground(ContextCompat.getDrawable(this.e, R.drawable.button_background_menu_dialog));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            if (i2 > 0) {
                healthButton.setTextColor(this.e.getResources().getColor(R.color.textColorSecondary));
                layoutParams.topMargin = this.e.getResources().getDimensionPixelSize(R.dimen.health_common_4dp);
            } else {
                healthButton.setTextColor(this.e.getResources().getColor(R.color.textColorPrimaryActivated));
                layoutParams.topMargin = this.e.getResources().getDimensionPixelSize(R.dimen.health_common_8dp);
            }
            healthButton.setLayoutParams(layoutParams);
            healthButton.setText((CharSequence) arrayList.get(i2));
            healthButton.setTextSize(this.e.getResources().getDimensionPixelSize(R.dimen.health_common_16sp));
            final View.OnClickListener onClickListener = (View.OnClickListener) builder.f27263a.get(i2);
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.coresleep.SleepAudioClearDialog.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    onClickListener.onClick(view);
                    SleepAudioClearDialog.this.dismiss();
                }
            });
            linearLayout.addView(healthButton);
        }
        setContentView(viewInflate);
    }
}
