package com.huawei.health.suggestion.ui.run.holder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;
import com.huawei.health.suggestion.R;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.gzi;

/* JADX INFO: loaded from: classes31.dex */
public class ShowPlanItemWeekHolder implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private gzi f10027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f10028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ImageButton f10029c;
    private float d;
    private View e;
    private final HealthTextView f;
    private int g;
    private final HealthTextView h;

    public ShowPlanItemWeekHolder(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sug_run_item_show_week, (ViewGroup) new ListView(context), false);
        this.e = viewInflate;
        this.f10029c = (ImageButton) viewInflate.findViewById(R.id.sug_ibtn_desc);
        this.h = (HealthTextView) this.e.findViewById(R.id.sug_txt_week_index);
        this.f = (HealthTextView) this.e.findViewById(R.id.sug_txt_week_phrase);
        this.e.setTag(this);
        this.g = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f10028b = motionEvent.getRawX();
            this.d = motionEvent.getRawY();
        } else if (motionEvent.getAction() == 1) {
            float fAbs = Math.abs(motionEvent.getRawX() - this.f10028b);
            float fAbs2 = Math.abs(motionEvent.getRawY() - this.d);
            float f = this.g;
            if (f >= fAbs && f >= fAbs2) {
                b();
            }
        }
        return true;
    }

    private void b() {
        new CustomTextAlertDialog.Builder(this.e.getContext()).a(R.string.sug_notify).a(R.string.sug_dialog_yes, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.holder.ShowPlanItemWeekHolder.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).a(this.f10027a.a().getSentence()).b().show();
    }
}
