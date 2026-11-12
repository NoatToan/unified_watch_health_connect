package com.xiaomi.hm.health.lab.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.hm.health.databases.model.LabAction;
import com.xiaomi.hm.health.lab.R;
import com.xiaomi.hm.health.lab.init.LabCallbackInit;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingTools;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class BehaviorTagsHistoryAdapter extends BaseAdapter {
    private List<LabAction> a;
    private Context b;
    private OnItemClickListener c;

    public interface OnItemClickListener {
        void onItemLongClick(View view, LabAction labAction, int i);

        void onItemUploadClick(View view, LabAction labAction, int i);
    }

    public static class a {
        public TextView a;
        public TextView b;
        public ImageView c;
        public View d;
        public TextView e;
        public LinearLayout f;

        public a(View view) {
            this.a = (TextView) view.findViewById(R.id.tx_action_name);
            this.b = (TextView) view.findViewById(R.id.tx_mark_time);
            this.c = (ImageView) view.findViewById(R.id.imv_upload);
            this.d = view.findViewById(R.id.item_top_line);
            this.e = (TextView) view.findViewById(R.id.tx_customize_behavior_name);
            this.f = (LinearLayout) view.findViewById(R.id.ll_lab);
        }
    }

    public BehaviorTagsHistoryAdapter(Context context, List<LabAction> list) {
        this.a = list;
        this.b = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(LabAction labAction, int i, View view) {
        OnItemClickListener onItemClickListener = this.c;
        if (onItemClickListener != null) {
            onItemClickListener.onItemUploadClick(view, labAction, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean d(LabAction labAction, int i, View view) {
        OnItemClickListener onItemClickListener = this.c;
        if (onItemClickListener == null) {
            return true;
        }
        onItemClickListener.onItemLongClick(view, labAction, i);
        return true;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<LabAction> list = this.a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        List<LabAction> list = this.a;
        if (list != null) {
            return list.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(final int i, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = View.inflate(this.b, R.layout.item_action_mark_history, null);
            aVar = new a(view);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        if (i == 0) {
            aVar.d.setVisibility(0);
        } else {
            aVar.d.setVisibility(4);
        }
        final LabAction labAction = this.a.get(i);
        String behaviorName = labAction.getBehaviorName();
        aVar.a.setText(BehaviorTaggingTools.getBehaviorName(behaviorName));
        if (!BehaviorTaggingTools.CUSTOMIZE.equals(behaviorName) || TextUtils.isEmpty(labAction.getCustomizeBehaviorName())) {
            aVar.e.setVisibility(8);
        } else {
            aVar.e.setVisibility(0);
            aVar.e.setText(this.b.getString(R.string.left_parentheses) + labAction.getCustomizeBehaviorName() + this.b.getString(R.string.right_parentheses));
        }
        if (labAction.getStartBehaviorTime() != null && labAction.getEndBehaviorTime() != null) {
            aVar.b.setText(LabCallbackInit.getInitCallBack().getTime(this.b, labAction.getStartBehaviorTime().longValue(), labAction.getEndBehaviorTime().longValue()));
        }
        Integer uploadStatus = labAction.getUploadStatus();
        if (uploadStatus == null || uploadStatus.intValue() != 3) {
            aVar.c.setVisibility(0);
            aVar.c.setOnClickListener(new View.OnClickListener() { // from class: pu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.a.c(labAction, i, view2);
                }
            });
        } else {
            aVar.c.setVisibility(8);
        }
        aVar.f.setOnLongClickListener(new View.OnLongClickListener() { // from class: qu
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return this.a.d(labAction, i, view2);
            }
        });
        return view;
    }

    public void setLabActions(List<LabAction> list) {
        this.a = list;
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.c = onItemClickListener;
    }
}
