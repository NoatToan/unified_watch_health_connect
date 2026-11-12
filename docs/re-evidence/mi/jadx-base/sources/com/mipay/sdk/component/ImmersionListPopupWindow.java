package com.mipay.sdk.component;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.mipay.sdk.adapter.MenuListAdapter;
import com.mipay.sdk.app.MenuData;
import com.mipay.sdk.web.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ImmersionListPopupWindow extends PopupWindow {
    private static final String TAG = "ImmersionPopupWindow";
    private MenuListAdapter mAdapter;
    private float mAlpha;
    private Context mContext;
    private ListView mListView;
    private AdapterView.OnItemClickListener mOnItemClickListener;
    private final int mWidth;

    public ImmersionListPopupWindow(Context context) {
        super(context);
        this.mContext = context;
        setContentView(createView(context));
        setOutsideTouchable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mipay_sdk_web_immersion_window_width);
        this.mWidth = dimensionPixelSize;
        setWidth(dimensionPixelSize);
        setAnimationStyle(R.style.ImmersionPopWindowAnim);
    }

    private View createView(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.mipay_sdk_web_immersion_window, (ViewGroup) null);
        ListView listView = (ListView) viewInflate.findViewById(R.id.lv_list_immersion_window);
        this.mListView = listView;
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.mipay.sdk.component.ImmersionListPopupWindow.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                int headerViewsCount = i - ImmersionListPopupWindow.this.mListView.getHeaderViewsCount();
                if (headerViewsCount >= 0 && headerViewsCount < ImmersionListPopupWindow.this.mAdapter.getCount() && ImmersionListPopupWindow.this.mOnItemClickListener != null) {
                    ImmersionListPopupWindow.this.mOnItemClickListener.onItemClick(adapterView, view, headerViewsCount, j);
                }
                ImmersionListPopupWindow.this.dismiss();
            }
        });
        MenuListAdapter menuListAdapter = new MenuListAdapter(context);
        this.mAdapter = menuListAdapter;
        this.mListView.setAdapter((ListAdapter) menuListAdapter);
        return viewInflate;
    }

    private void showWithAnchor(View view) {
        final Window window = ((Activity) this.mContext).getWindow();
        final WindowManager.LayoutParams attributes = window.getAttributes();
        this.mAlpha = attributes.alpha;
        setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.mipay.sdk.component.ImmersionListPopupWindow.2
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                attributes.alpha = ImmersionListPopupWindow.this.mAlpha;
                window.setAttributes(attributes);
            }
        });
        attributes.alpha = 0.75f;
        window.setAttributes(attributes);
        showAsDropDown(view, -(this.mWidth - (view.getWidth() / 2)), 0);
    }

    public void setData(List<MenuData> list) {
        this.mAdapter.setData(list);
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    public void show(View view) {
        if (view == null) {
            return;
        }
        setFocusable(true);
        showWithAnchor(view);
    }
}
