package com.huami.watch.companion.app;

import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.Switch;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.chad.library.adapter.base.BaseItemDraggableAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.DeviceUtil;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class WatchWidgetAdapter extends BaseItemDraggableAdapter<WatchWidget, BaseViewHolder> {
    private boolean a;

    public WatchWidgetAdapter() {
        super(R.layout.list_item_app_widget, null);
        this.a = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b(BaseViewHolder baseViewHolder, View view) {
        WatchWidget item;
        ItemTouchHelper itemTouchHelper;
        int layoutPosition = baseViewHolder.getLayoutPosition() - getHeaderLayoutCount();
        if (layoutPosition >= 0 && (item = getItem(layoutPosition)) != null && item.enable && (itemTouchHelper = this.mItemTouchHelper) != null) {
            itemTouchHelper.startDrag(baseViewHolder);
        }
        return false;
    }

    private void c(Switch r7) {
        try {
            Method declaredMethod = Switch.class.getDeclaredMethod("setThumbPosition", Float.TYPE);
            declaredMethod.setAccessible(true);
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(r7.isChecked() ? 0 : 1);
            declaredMethod.invoke(r7, objArr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getEnabledItemCount() {
        List<T> list = this.mData;
        int i = 0;
        if (list != 0 && !list.isEmpty()) {
            Iterator it2 = this.mData.iterator();
            while (it2.hasNext()) {
                if (((WatchWidget) it2.next()).enable) {
                    i++;
                }
            }
        }
        return i;
    }

    public void setIsQogir(boolean z) {
        this.a = z;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, WatchWidget watchWidget) {
        baseViewHolder.setText(R.id.text, watchWidget.title);
        RoundedBitmapDrawable roundedBitmapDrawableCreate = RoundedBitmapDrawableFactory.create(this.mContext.getResources(), BitmapFactory.decodeResource(this.mContext.getResources(), watchWidget.iconRes));
        roundedBitmapDrawableCreate.setCornerRadius(roundedBitmapDrawableCreate.getIntrinsicHeight() / 2);
        baseViewHolder.setImageDrawable(R.id.icon, roundedBitmapDrawableCreate);
        int i = R.id.dot_or_menu;
        baseViewHolder.setImageResource(i, R.drawable.device_list_icon_arrange);
        baseViewHolder.setVisible(R.id.enable_widget_view, DeviceUtil.isRomWidgetSupportHidden(this.mContext));
        if (!this.a || watchWidget.enable) {
            baseViewHolder.getView(i).setVisibility(0);
        } else {
            baseViewHolder.getView(i).setVisibility(4);
        }
        Switch r0 = (Switch) baseViewHolder.getView(R.id.enable_widget);
        if (r0.isChecked() != watchWidget.enable) {
            c(r0);
        }
        r0.setChecked(watchWidget.enable);
        baseViewHolder.addOnClickListener(R.id.click_area);
    }

    @Override // com.chad.library.adapter.base.BaseItemDraggableAdapter, com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final BaseViewHolder baseViewHolder, int i) {
        super.onBindViewHolder(baseViewHolder, i);
        if (this.a) {
            baseViewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: pl8
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.a.b(baseViewHolder, view);
                }
            });
        }
    }
}
