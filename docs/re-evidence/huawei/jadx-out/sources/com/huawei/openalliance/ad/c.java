package com.huawei.openalliance.ad;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    LinearLayout f18330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.huawei.hms.ads.a f18331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f18332c;

    public void a(List<d> list, boolean z) {
        int i;
        int i2;
        this.f18330a.removeAllViews();
        Resources resources = this.f18332c.getResources();
        for (int i3 = 0; i3 < list.size(); i3++) {
            RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.f18332c).inflate(R.layout.hiad_choices_item, (ViewGroup) null);
            TextView textView = (TextView) relativeLayout.findViewById(R.id.scroll_view_text_view);
            if (!z) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(13);
                textView.setLayoutParams(layoutParams);
            }
            textView.setText(list.get(i3).a());
            textView.setTag(list.get(i3).b());
            if (list.get(i3).b() == b.HIDE_AD) {
                textView.setBackgroundResource(R.drawable.hiad_choices_feedback_focus);
                i2 = R.color.hiad_whythisad_btn_hide_text_color;
            } else if (list.get(i3).b() == b.WHY_THIS_AD) {
                textView.setBackgroundResource(R.drawable.hiad_choices_feedback_normal);
                i2 = R.color.hiad_whythisad_btn_why_text_color;
            } else {
                if (list.get(i3).b() == b.CLOSE_AD) {
                    i = R.drawable.hiad_choices_feedback_normal;
                } else {
                    if (list.get(i3).b() == b.NOT_INTEREST) {
                        i = R.drawable.hiad_choices_feedback_special;
                    } else {
                        textView.setTextColor(resources.getColor(R.color.hiad_whythisad_btn_fb_text_color));
                        hw.a("ScrollAdapter", "sdk do-nothing settings.");
                    }
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.c.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            if (view.getTag() == b.HIDE_AD) {
                                hw.a("ScrollAdapter", "sdk tag is HIDE_AD");
                                c.this.f18331b.e();
                                return;
                            }
                            if (view.getTag() == b.WHY_THIS_AD) {
                                c.this.f18331b.c();
                                return;
                            }
                            if (view.getTag() == b.CLOSE_AD) {
                                c.this.f18331b.a(((TextView) view).getText().toString());
                            } else if (view.getTag() == b.NOT_INTEREST) {
                                c.this.f18331b.a(c.this.f18332c.getString(R.string.hiad_choices_ad_no_interest));
                            } else {
                                hw.a("ScrollAdapter", "sdk onclick do-nothing");
                            }
                        }
                    });
                    this.f18330a.addView(relativeLayout);
                }
                textView.setBackgroundResource(i);
                i2 = R.color.hiad_whythisad_btn_fb_text_color;
            }
            textView.setTextColor(resources.getColor(i2));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.c.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (view.getTag() == b.HIDE_AD) {
                        hw.a("ScrollAdapter", "sdk tag is HIDE_AD");
                        c.this.f18331b.e();
                        return;
                    }
                    if (view.getTag() == b.WHY_THIS_AD) {
                        c.this.f18331b.c();
                        return;
                    }
                    if (view.getTag() == b.CLOSE_AD) {
                        c.this.f18331b.a(((TextView) view).getText().toString());
                    } else if (view.getTag() == b.NOT_INTEREST) {
                        c.this.f18331b.a(c.this.f18332c.getString(R.string.hiad_choices_ad_no_interest));
                    } else {
                        hw.a("ScrollAdapter", "sdk onclick do-nothing");
                    }
                }
            });
            this.f18330a.addView(relativeLayout);
        }
    }

    public c(Context context, com.huawei.hms.ads.a aVar, LinearLayout linearLayout) {
        this.f18332c = context;
        this.f18331b = aVar;
        this.f18330a = linearLayout;
    }
}
