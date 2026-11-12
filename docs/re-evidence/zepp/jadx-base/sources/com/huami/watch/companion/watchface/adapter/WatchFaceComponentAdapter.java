package com.huami.watch.companion.watchface.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.watch.companion.R;
import com.huami.watch.companion.ui.view.WheelAdapter;
import com.huami.watch.companion.watchface.adapter.WatchFaceComponentAdapter;
import com.huami.watch.companion.watchface.bean.WatchFaceChildBean;
import com.huami.watch.companion.watchface.bean.WatchFaceConfigBean;
import com.huami.watch.companion.watchface.bean.WatchFaceOptionBean;
import com.huami.watch.companion.watchface.bean.WatchFaceWidget;
import com.huami.watch.util.Log;
import com.huami.widget.wheelview.OnWheelScrollListener;
import com.huami.widget.wheelview.WheelView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceComponentAdapter extends BaseQuickAdapter<WatchFaceWidget, BaseViewHolder> {
    private static final String d = "WatchFaceComponentAdapter";
    private boolean a;
    private int b;
    private OnClickWidgetListener c;

    public interface OnClickWidgetListener {
        void onClickWidget(int i, int i2, WatchFaceChildBean watchFaceChildBean);
    }

    public class a implements OnWheelScrollListener {
        public final /* synthetic */ List a;
        public final /* synthetic */ BaseViewHolder b;
        public final /* synthetic */ WheelView c;
        public final /* synthetic */ WatchFaceWidget d;
        public final /* synthetic */ List e;

        public a(List list, BaseViewHolder baseViewHolder, WheelView wheelView, WatchFaceWidget watchFaceWidget, List list2) {
            this.a = list;
            this.b = baseViewHolder;
            this.c = wheelView;
            this.d = watchFaceWidget;
            this.e = list2;
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheelView) {
            WatchFaceComponentAdapter.this.f(this.b, this.c, this.d, (WatchFaceOptionBean) this.a.get(wheelView.getCurrentItem()), this.e);
            WatchFaceComponentAdapter.this.setmEditModel(true);
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheelView) {
        }
    }

    public class b implements OnWheelScrollListener {
        public final /* synthetic */ List a;
        public final /* synthetic */ WheelView b;
        public final /* synthetic */ List c;
        public final /* synthetic */ BaseViewHolder d;
        public final /* synthetic */ WatchFaceWidget e;

        public b(List list, WheelView wheelView, List list2, BaseViewHolder baseViewHolder, WatchFaceWidget watchFaceWidget) {
            this.a = list;
            this.b = wheelView;
            this.c = list2;
            this.d = baseViewHolder;
            this.e = watchFaceWidget;
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheelView) {
            WatchFaceChildBean watchFaceChildBean = (WatchFaceChildBean) this.a.get(wheelView.getCurrentItem());
            WatchFaceOptionBean parent = watchFaceChildBean.getParent();
            this.b.setCurrentItem(this.c.indexOf(parent));
            WatchFaceComponentAdapter.this.g(this.d, this.e, parent, watchFaceChildBean);
            WatchFaceComponentAdapter.this.setmEditModel(true);
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheelView) {
        }
    }

    public WatchFaceComponentAdapter(int i, @Nullable List<WatchFaceWidget> list) {
        super(R.layout.item_watchface_component, list);
        this.b = i;
    }

    private WheelAdapter d(int i, WheelView wheelView) {
        Context context = this.mContext;
        return new WheelAdapter(context, 0, i, wheelView, context.getResources().getColor(R.color.wheel_normal_center), this.mContext.getResources().getColor(R.color.wheel_normal_normal), this.mContext.getResources().getColor(R.color.wheel_normal_lighter), false, 64, 8, 8, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(WatchFaceWidget watchFaceWidget, ImageView imageView, BaseViewHolder baseViewHolder, View view) {
        watchFaceWidget.setExpand(!watchFaceWidget.isExpand());
        imageView.animate().rotation(watchFaceWidget.isExpand() ? 180.0f : 0.0f);
        baseViewHolder.setVisible(R.id.layout_widget, watchFaceWidget.isExpand());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(BaseViewHolder baseViewHolder, WheelView wheelView, WatchFaceWidget watchFaceWidget, WatchFaceOptionBean watchFaceOptionBean, List<WatchFaceChildBean> list) {
        WatchFaceChildBean selectChildBean = watchFaceOptionBean.getSelectChildBean();
        if (watchFaceOptionBean.getGroupId() == -1) {
            wheelView.setVisibility(4);
        } else {
            wheelView.setVisibility(0);
            List<WatchFaceChildBean> childs = watchFaceOptionBean.getChilds();
            if (selectChildBean == null) {
                selectChildBean = (childs == null || childs.size() == 0) ? list.get(0) : childs.get(0);
            }
            wheelView.setCurrentItem(list.indexOf(selectChildBean));
        }
        g(baseViewHolder, watchFaceWidget, watchFaceOptionBean, selectChildBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(BaseViewHolder baseViewHolder, WatchFaceWidget watchFaceWidget, WatchFaceOptionBean watchFaceOptionBean, WatchFaceChildBean watchFaceChildBean) {
        watchFaceOptionBean.setSelectChildBean(watchFaceChildBean);
        watchFaceWidget.setSelectOption(watchFaceOptionBean);
        baseViewHolder.setText(R.id.tv_select_widget, watchFaceOptionBean.getGroupName());
        OnClickWidgetListener onClickWidgetListener = this.c;
        if (onClickWidgetListener != null) {
            onClickWidgetListener.onClickWidget(watchFaceWidget.getWidgetType(), watchFaceOptionBean.getGroupId(), watchFaceChildBean);
        }
    }

    public String getComponentStr() {
        JSONArray jSONArray = new JSONArray();
        for (T t : this.mData) {
            WatchFaceOptionBean selectOption = t.getSelectOption();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("watchfaceId", this.b);
                jSONObject.put("widgetId", t.getId());
                if (selectOption.getGroupId() != -1) {
                    jSONObject.put(EcgData.GROUP_ID, selectOption.getGroupId());
                    jSONObject.put("childId", selectOption.getSelectChildBean().getChildId());
                }
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            Log.e(d, "选中了--->" + selectOption.getGroupName() + "--->" + selectOption.getSelectChildBean(), new Object[0]);
        }
        return jSONArray.toString();
    }

    public boolean ismEditModel() {
        return this.a;
    }

    public void setOnClickWidgetListener(OnClickWidgetListener onClickWidgetListener) {
        this.c = onClickWidgetListener;
    }

    public void setmEditModel(boolean z) {
        this.a = z;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @RequiresApi(api = 19)
    public void convert(final BaseViewHolder baseViewHolder, final WatchFaceWidget watchFaceWidget) {
        WatchFaceOptionBean watchFaceOptionBean;
        baseViewHolder.setText(R.id.tv_name, watchFaceWidget.getWidgetTitle());
        List<WatchFaceOptionBean> optionalData = watchFaceWidget.getOptionalData();
        if (optionalData == null || optionalData.size() == 0) {
            baseViewHolder.setVisible(R.id.layout_widget, false);
            return;
        }
        WatchFaceConfigBean config = watchFaceWidget.getConfig();
        WatchFaceChildBean watchFaceChildBean = null;
        if (config != null) {
            WatchFaceOptionBean watchFaceOptionBean2 = new WatchFaceOptionBean(config.getGroupId());
            WatchFaceChildBean watchFaceChildBean2 = new WatchFaceChildBean(config.getChildId(), config.getProviderTitle());
            watchFaceOptionBean = watchFaceOptionBean2;
            watchFaceChildBean = watchFaceChildBean2;
        } else {
            watchFaceOptionBean = null;
        }
        ArrayList arrayList = new ArrayList();
        for (WatchFaceOptionBean watchFaceOptionBean3 : optionalData) {
            List<WatchFaceChildBean> childs = watchFaceOptionBean3.getChilds();
            if (childs != null && childs.size() != 0) {
                for (WatchFaceChildBean watchFaceChildBean3 : childs) {
                    watchFaceChildBean3.setParent(watchFaceOptionBean3);
                    arrayList.add(watchFaceChildBean3);
                }
            }
        }
        if (optionalData.contains(watchFaceOptionBean) && arrayList.contains(watchFaceChildBean)) {
            watchFaceWidget.setSelectOption(watchFaceOptionBean);
        }
        WatchFaceOptionBean selectOption = watchFaceWidget.getSelectOption();
        if (selectOption == null) {
            selectOption = optionalData.get(optionalData.size() / 2);
        }
        WatchFaceOptionBean watchFaceOptionBean4 = selectOption;
        Log.d(d, "select Option：" + watchFaceOptionBean4.getGroupId(), new Object[0]);
        WheelView wheelView = (WheelView) baseViewHolder.getView(R.id.left_wheel);
        WheelView wheelView2 = (WheelView) baseViewHolder.getView(R.id.right_wheel);
        baseViewHolder.setVisible(R.id.layout_widget, watchFaceWidget.isExpand());
        WheelAdapter wheelAdapterD = d(optionalData.size() - 1, wheelView);
        wheelAdapterD.setDataList(optionalData);
        wheelAdapterD.setUIStyle("normal");
        WheelView currentItem = wheelView.setViewAdapter(wheelAdapterD).setVisibleItems(5).setCurrentItem(optionalData.indexOf(watchFaceOptionBean4));
        int i = R.color.transparent;
        currentItem.setCenterDrawable(i);
        WheelAdapter wheelAdapterD2 = d(arrayList.size() - 1, wheelView2);
        wheelAdapterD2.setDataList(arrayList);
        wheelAdapterD2.setUIStyle("normal");
        wheelView2.setViewAdapter(wheelAdapterD2).setVisibleItems(5).setCenterDrawable(i);
        f(baseViewHolder, wheelView2, watchFaceWidget, watchFaceOptionBean4, arrayList);
        wheelView.addScrollingListener(new a(optionalData, baseViewHolder, wheelView2, watchFaceWidget, arrayList));
        wheelView2.addScrollingListener(new b(arrayList, wheelView, optionalData, baseViewHolder, watchFaceWidget));
        final ImageView imageView = (ImageView) baseViewHolder.getView(R.id.iv_arrow);
        baseViewHolder.getView(R.id.layout_expand).setOnClickListener(new View.OnClickListener() { // from class: ff8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WatchFaceComponentAdapter.e(watchFaceWidget, imageView, baseViewHolder, view);
            }
        });
    }
}
