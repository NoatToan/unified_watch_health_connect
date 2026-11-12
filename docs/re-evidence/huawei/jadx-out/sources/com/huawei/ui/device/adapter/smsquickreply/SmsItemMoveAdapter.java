package com.huawei.ui.device.adapter.smsquickreply;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class SmsItemMoveAdapter extends RecyclerView.Adapter<SlideViewHolder> implements ItemTouchHelperAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f24892a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f24893c;
    private final LayoutInflater d;
    private OnMessageOperationListener e;

    public interface OnMessageOperationListener {
        void onMessageDeleteListener(View view, int i);

        void onMessageEditListener(View view, int i);
    }

    public SmsItemMoveAdapter(Context context, List<String> list) {
        this.f24892a = context;
        this.f24893c = list;
        this.d = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SlideViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SlideViewHolder(this.d.inflate(R.layout.activity_sms_list_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(SlideViewHolder slideViewHolder, final int i) {
        slideViewHolder.d.setText(this.f24893c.get(i));
        slideViewHolder.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.adapter.smsquickreply.SmsItemMoveAdapter.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SmsItemMoveAdapter.this.e != null) {
                    SmsItemMoveAdapter.this.e.onMessageDeleteListener(view, i);
                }
            }
        });
        slideViewHolder.d.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.adapter.smsquickreply.SmsItemMoveAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SmsItemMoveAdapter.this.e != null) {
                    SmsItemMoveAdapter.this.e.onMessageEditListener(view, i);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f24893c.size();
    }

    @Override // com.huawei.ui.device.adapter.smsquickreply.ItemTouchHelperAdapter
    public void onItemMove(int i, int i2) {
        List<String> list = this.f24893c;
        if (list == null) {
            LogUtil.j("SmsListSlideAdapter", "onItemMove mDataList is null");
            return;
        }
        if (i < 0 || i >= list.size()) {
            LogUtil.j("SmsListSlideAdapter", "onItemMove fromPosition IndexOutOfBoundsException");
        } else if (i2 < 0 || i2 >= this.f24893c.size()) {
            LogUtil.j("SmsListSlideAdapter", "onItemMove toPosition IndexOutOfBoundsException");
        } else {
            Collections.swap(this.f24893c, i, i2);
            notifyItemMoved(i, i2);
        }
    }

    public void c(OnMessageOperationListener onMessageOperationListener) {
        this.e = onMessageOperationListener;
    }

    public static class SlideViewHolder extends RecyclerView.ViewHolder {
        private HealthTextView d;
        private ImageView e;

        public SlideViewHolder(View view) {
            super(view);
            this.d = (HealthTextView) view.findViewById(R.id.message_content);
            this.e = (ImageView) view.findViewById(R.id.delete_button);
        }
    }
}
