package com.huami.assistant.ui.schedule.view;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.assistant.ui.schedule.adapter.ScheduleAdapter;
import com.huami.assistant.ui.schedule.view.ScheduleListFooterDecoration;
import com.huami.assistant.util.UpdateUtil;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.DensityUtil;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ScheduleListFooterDecoration extends RecyclerView.ItemDecoration {
    private static final int a = 5000;

    private int b(RecyclerView parent, int position) {
        int height = parent.getHeight() - f(parent, position);
        if (height < 0) {
            return 0;
        }
        return height;
    }

    private void c(Rect outRect, final View footerView, final RecyclerView parent) {
        outRect.set(0, 5000, 0, 0);
        footerView.post(new Runnable() { // from class: ri6
            @Override // java.lang.Runnable
            public final void run() {
                ScheduleListFooterDecoration.e(parent);
            }
        });
    }

    private boolean d(RecyclerView parent, View view, int itemCount) {
        return parent.getChildAdapterPosition(view) == itemCount - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(RecyclerView recyclerView) {
        recyclerView.getAdapter().notifyDataSetChanged();
    }

    private int f(RecyclerView parent, int position) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) parent.getLayoutManager();
        int itemCount = linearLayoutManager.getItemCount();
        int measuredHeight = 0;
        while (position < itemCount) {
            View viewFindViewByPosition = linearLayoutManager.findViewByPosition(position);
            measuredHeight += viewFindViewByPosition == null ? 0 : viewFindViewByPosition.getMeasuredHeight();
            position++;
        }
        return measuredHeight;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        if (d(parent, view, parent.getAdapter().getFragmentsCount())) {
            if (view.getMeasuredHeight() == 0) {
                c(outRect, view, parent);
                return;
            }
            ScheduleAdapter scheduleAdapter = (ScheduleAdapter) parent.getAdapter();
            List<Object> data = scheduleAdapter.getData();
            int scheduleLastDayItemPosition = !ArraysUtil.isEmpty(data) ? UpdateUtil.getScheduleLastDayItemPosition(data) : 0;
            outRect.set(0, 0, 0, b(parent, scheduleLastDayItemPosition) - (scheduleAdapter.getItemViewType(scheduleLastDayItemPosition) != 10001 ? (int) (0 + DensityUtil.dpToPx(view.getContext(), 59.0f)) : 0));
        }
    }
}
