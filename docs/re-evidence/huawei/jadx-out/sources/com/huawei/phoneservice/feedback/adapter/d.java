package com.huawei.phoneservice.feedback.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.phoneservice.feedback.R;
import com.huawei.phoneservice.feedback.mvp.base.FeedbackCITListView;

/* JADX INFO: loaded from: classes13.dex */
public class d extends com.huawei.phoneservice.feedback.widget.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    TextView f21626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    TextView f21627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    TextView f21628c;
    TextView d;
    TextView e;
    FeedbackCITListView f;
    View g;
    ImageView h;
    ImageView i;
    FeedbackCITListView j;
    View l;
    LinearLayout m;

    private void b() {
        this.d = (TextView) this.itemView.findViewById(R.id.tv_evaluad_content);
        this.e = (TextView) this.itemView.findViewById(R.id.imgfrom_chat_time);
        this.f21626a = (TextView) this.itemView.findViewById(R.id.from_chat_time);
        this.f21628c = (TextView) this.itemView.findViewById(R.id.mycontent);
        this.j = (FeedbackCITListView) this.itemView.findViewById(R.id.question_img_list);
        this.f = (FeedbackCITListView) this.itemView.findViewById(R.id.replay_img_lsit);
        this.i = (ImageView) this.itemView.findViewById(R.id.img_resolved);
        this.h = (ImageView) this.itemView.findViewById(R.id.img_no_resolved);
        this.g = this.itemView.findViewById(R.id.feedback_layout_evaluat);
        this.l = this.itemView.findViewById(R.id.feedback_sdk_item_msgfrom);
        this.f21627b = (TextView) this.itemView.findViewById(R.id.from_content);
        this.m = (LinearLayout) this.itemView.findViewById(R.id.ll_evaluat);
    }

    public d(View view) {
        super(view);
        b();
    }
}
