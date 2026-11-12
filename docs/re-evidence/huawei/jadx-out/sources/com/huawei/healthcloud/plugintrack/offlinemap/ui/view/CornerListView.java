package com.huawei.healthcloud.plugintrack.offlinemap.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;
import com.huawei.healthcloud.plugintrack.R;

/* JADX INFO: loaded from: classes33.dex */
public class CornerListView extends ListView {
    public CornerListView(Context context) {
        super(context);
    }

    public CornerListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CornerListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iPointToPosition;
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getAction() == 0 && (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1) {
            if (iPointToPosition == 0) {
                if (iPointToPosition == getAdapter().getCount() - 1) {
                    setSelector(R.drawable.track_offlinemap_common_ui_dialog_listview_shape);
                } else {
                    setSelector(R.drawable.track_offlinemap_common_ui_dialog_list_first_item_shape);
                }
            } else if (iPointToPosition == getAdapter().getCount() - 1) {
                setSelector(R.drawable.track_offlinemap_common_ui_dialog_list_last_item_shape);
            } else {
                setSelector(R.drawable.track_offlinemap_common_ui_dialog_list_middle_item_shape);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
