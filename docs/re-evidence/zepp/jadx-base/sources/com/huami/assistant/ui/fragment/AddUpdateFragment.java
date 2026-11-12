package com.huami.assistant.ui.fragment;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.assistant.R;
import com.huami.assistant.model.bean.UpdateType;
import com.huami.assistant.ui.activity.EditAlarmActivity;
import com.huami.assistant.ui.activity.EditScheduleActivity;
import com.huami.assistant.ui.activity.OcrTipActivity;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.ui.dialog.LoadingDialog;
import com.huami.watch.util.Analytics;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class AddUpdateFragment extends Fragment {
    public static final int COLUMN = 4;
    private List<Integer> a = new ArrayList();
    private a b;
    private GridLayoutManager c;
    private DialogFragment d;

    public class a extends BaseQuickAdapter<Integer, BaseViewHolder> {
        public a() {
            super(R.layout.item_add_update);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public void convert(BaseViewHolder helper, Integer item) {
            UpdateType updateTypeValueOf = UpdateType.valueOf(item.intValue());
            helper.setText(R.id.item_add_update_name, updateTypeValueOf.categoryResId);
            helper.setImageResource(R.id.item_add_update_img, updateTypeValueOf.iconResId);
        }
    }

    private void b() {
        this.a.clear();
        for (UpdateType updateType : UpdateType.values()) {
            if (updateType.isAllowUserAdd() && updateType.isDeviceSupport(getActivity())) {
                this.a.add(Integer.valueOf(updateType.typeId));
            }
        }
        GridLayoutManager gridLayoutManager = this.c;
        int size = 4;
        if (this.a.size() > 0 && this.a.size() < 4) {
            size = this.a.size();
        }
        gridLayoutManager.setSpanCount(size);
        this.b.setNewData(this.a);
    }

    private void c(RecyclerView view) {
        this.b = new a();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 4);
        this.c = gridLayoutManager;
        view.setLayoutManager(gridLayoutManager);
        this.b.bindToRecyclerView(view);
        this.b.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: fa
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view2, int i) {
                this.a.d(baseQuickAdapter, view2, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int iIntValue = this.a.get(i).intValue();
        if (iIntValue == 1) {
            startActivity(new Intent(getActivity(), (Class<?>) EditAlarmActivity.class));
            Analytics.event(getActivity(), AnalyticsEvents.EVENT_CLICK_SMART_ALARM_ADD_CLICK);
        } else if (iIntValue == 2) {
            EditScheduleActivity.to(getActivity());
            Analytics.event(getActivity(), AnalyticsEvents.EVENT_CLICK_SMART_SCHEDULE_ADD);
        } else if (iIntValue == 201) {
            Intent intent = new Intent(getActivity(), (Class<?>) OcrTipActivity.class);
            intent.putExtra("action", 0);
            startActivity(intent);
        } else {
            Intent intent2 = new Intent(getActivity(), (Class<?>) OcrTipActivity.class);
            intent2.putExtra("action", 1);
            startActivity(intent2);
        }
        LoadingDialog.dismiss(this.d);
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        RecyclerView recyclerView = new RecyclerView(getActivity());
        c(recyclerView);
        return recyclerView;
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        b();
    }

    public DialogFragment show(Activity activity) {
        LoadingDialog.dismiss(this.d);
        DialogFragment dialogFragmentShow = AlertDialog.setTitle(activity.getString(R.string.add_update)).setContent(this).setNeutralBtn(activity.getString(R.string.cancel), null).show(activity, "add update dialog");
        this.d = dialogFragmentShow;
        return dialogFragmentShow;
    }
}
