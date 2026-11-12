package com.huawei.pluginachievement.ui.kakatask;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.pluginachievement.R;
import defpackage.out;
import defpackage.ozs;
import defpackage.qqs;

/* JADX INFO: loaded from: classes13.dex */
public class AchieveKaKaTaskTitleHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f22219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f22220b;
    private TextView d;
    private LinearLayout e;

    AchieveKaKaTaskTitleHolder(View view) {
        super(view);
        this.d = (TextView) out.b(view, R.id.achieve_task_kaka_title_text);
        this.f22219a = (RelativeLayout) out.b(view, R.id.achieve_task_kaka_title_text_rl);
        this.e = (LinearLayout) out.b(view, R.id.task_finish_tip_layout);
        this.f22220b = (TextView) out.b(view, R.id.task_finish_title_text);
    }

    public void b(ozs ozsVar, int i, int i2) {
        if (ozsVar != null) {
            this.f22220b.setText(BaseApplication.b().getString(R.string.IDS_ka_ka_task_finish, String.valueOf(i), String.valueOf(i2)));
            this.d.setVisibility(0);
            String strC = ozsVar.c();
            if (TextUtils.isEmpty(strC)) {
                this.f22219a.setVisibility(8);
                return;
            }
            this.d.setVisibility(0);
            this.d.setText(ozsVar.c());
            d(strC, i);
        }
    }

    private void d(String str, int i) {
        if (str.equals(BaseApplication.b().getString(R.string.IDS_plugin_achievement_kaka_daily))) {
            this.e.setVisibility(0);
            ImageView[] imageViewArr = {(ImageView) out.b(this.itemView, R.id.taskOne), (ImageView) out.b(this.itemView, R.id.taskSec), (ImageView) out.b(this.itemView, R.id.taskTh), (ImageView) out.b(this.itemView, R.id.taskFo), (ImageView) out.b(this.itemView, R.id.taskFi), (ImageView) out.b(this.itemView, R.id.taskSix)};
            for (int i2 = 0; i2 < 6; i2++) {
                imageViewArr[i2].setImageResource(qqs.e(BaseApplication.b()) ? R.mipmap.kaka_task_unfinish_night : R.mipmap.kaka_task_unfinish);
                if (i2 < i) {
                    imageViewArr[i2].setImageResource(R.mipmap.kaka_task_finish);
                }
            }
        }
    }
}
