package com.huawei.phoneservice.feedback.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.phoneservice.feedback.R;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class f extends RecyclerView.Adapter<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21632a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<com.huawei.phoneservice.feedback.entity.d> f21633b;
    private LayoutInflater d;
    private c e;

    public interface c {
        void a(int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f21633b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(e eVar, int i) {
        TextView textView;
        int i2;
        if (i == this.f21632a) {
            textView = eVar.f21637c;
            i2 = R.drawable.feedback_common_toggle_4_corner_press_bg;
        } else {
            textView = eVar.f21637c;
            i2 = R.drawable.feedback_common_toggle_4_corner_normal_bg;
        }
        textView.setBackgroundResource(i2);
        eVar.f21637c.setAccessibilityDelegate(e(i == this.f21632a));
        eVar.f21637c.setText(this.f21633b.get(i).e);
        eVar.f21637c.setOnClickListener(new d(i));
    }

    public void a(c cVar) {
        this.e = cVar;
    }

    public void d(int i) {
        this.f21632a = i;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new e(this.d.inflate(R.layout.feedback_sdk_question_item_type, viewGroup, false));
    }

    class a extends View.AccessibilityDelegate {
        final /* synthetic */ boolean d;

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.d);
        }

        a(boolean z) {
            this.d = z;
        }
    }

    class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f21636b;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f.this.f21632a = this.f21636b;
            f.this.e.a(this.f21636b);
            f.this.notifyDataSetChanged();
        }

        d(int i) {
            this.f21636b = i;
        }
    }

    static class e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private TextView f21637c;

        e(View view) {
            super(view);
            this.f21637c = (TextView) view.findViewById(R.id.txt_question_type_item);
        }
    }

    private View.AccessibilityDelegate e(boolean z) {
        return new a(z);
    }

    public f(List<com.huawei.phoneservice.feedback.entity.d> list, Context context) {
        this.f21633b = list;
        this.d = LayoutInflater.from(context);
    }
}
