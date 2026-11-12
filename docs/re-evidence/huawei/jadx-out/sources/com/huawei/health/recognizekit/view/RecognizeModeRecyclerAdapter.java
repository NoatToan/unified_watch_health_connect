package com.huawei.health.recognizekit.view;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.recognizekit.R;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import health.compact.a.ReleaseLogUtil;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class RecognizeModeRecyclerAdapter extends BaseRecyclerAdapter<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f8688a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Context f8689c;
    HashMap<Integer, Float> d;

    public RecognizeModeRecyclerAdapter(List<String> list) {
        super(list, R.layout.item_recognize_tab);
        this.d = new HashMap<>();
        this.f8688a = 0;
        this.f8689c = BaseApplication.b();
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerHolder recyclerHolder, int i) {
        super.onBindViewHolder(recyclerHolder, i);
        HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.recognize_tab_tv);
        HealthImageView healthImageView = (HealthImageView) recyclerHolder.d(R.id.image_red_dot);
        String str = get(i);
        if (c() == i) {
            healthImageView.setVisibility(0);
            a(healthTextView, str, true);
        } else {
            healthImageView.setVisibility(8);
            a(healthTextView, str, false);
        }
    }

    public void a(HealthTextView healthTextView, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.c("RecognizeModeRecyclerAdapter", "appendBold text is Empty");
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(new StyleSpan(z ? 1 : 0), 0, spannableStringBuilder.length(), 33);
        healthTextView.setText(spannableStringBuilder);
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void convert(RecyclerHolder recyclerHolder, int i, String str) {
        recyclerHolder.a(R.id.recognize_tab_tv, str);
        this.d.put(Integer.valueOf(i), Float.valueOf(((HealthTextView) recyclerHolder.d(R.id.recognize_tab_tv)).getMeasureWidth()));
    }

    public float e(int i) {
        if (this.d.containsKey(Integer.valueOf(i))) {
            return this.d.get(Integer.valueOf(i)).floatValue();
        }
        return 0.0f;
    }

    public void a(int i) {
        this.f8688a = i;
    }

    private int c() {
        return this.f8688a;
    }
}
