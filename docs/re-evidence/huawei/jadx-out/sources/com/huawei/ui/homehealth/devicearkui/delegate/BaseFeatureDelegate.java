package com.huawei.ui.homehealth.devicearkui.delegate;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BaseFeatureDelegate extends DeviceViewDelegate {
    protected final List<BaseFeatureItem> defaultFeatureItems;
    private final LinkedHashMap<BaseFeatureItem, View> featureItemViews;
    private LinearLayout linearLayout;
    private final HashSet<BaseFeatureItem> needUpdateFeatureItems;

    protected abstract View createItemView(LayoutInflater layoutInflater, ViewGroup viewGroup);

    protected abstract LinearLayout getContainerLayout(View view);

    protected abstract void initItems(List<BaseFeatureItem> list);

    public BaseFeatureDelegate(ComponentActivity componentActivity) {
        super(componentActivity);
        ArrayList arrayList = new ArrayList();
        this.defaultFeatureItems = arrayList;
        this.featureItemViews = new LinkedHashMap<>();
        this.needUpdateFeatureItems = new HashSet<>();
        initItems(arrayList);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.BaseViewDelegate
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewCreateItemView = createItemView(layoutInflater, viewGroup);
        this.linearLayout = getContainerLayout(viewCreateItemView);
        initContainer();
        return viewCreateItemView;
    }

    private void initContainer() {
        final LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.activity);
        this.defaultFeatureItems.forEach(new Consumer<BaseFeatureItem>() { // from class: com.huawei.ui.homehealth.devicearkui.delegate.BaseFeatureDelegate.5
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void accept(BaseFeatureItem baseFeatureItem) {
                View viewOnCreateView = baseFeatureItem.onCreateView(layoutInflaterFrom, BaseFeatureDelegate.this.linearLayout);
                viewOnCreateView.setTag(baseFeatureItem);
                BaseFeatureDelegate.this.featureItemViews.put(baseFeatureItem, viewOnCreateView);
            }
        });
    }

    protected void refreshAllView(List<Map.Entry<BaseFeatureItem, Boolean>> list, DeviceInfo deviceInfo) {
        this.needUpdateFeatureItems.clear();
        this.linearLayout.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.activity);
        View viewInflate = null;
        for (Map.Entry<BaseFeatureItem, Boolean> entry : list) {
            if (entry.getValue().booleanValue()) {
                BaseFeatureItem key = entry.getKey();
                View view = this.featureItemViews.get(key);
                key.updateDevice(deviceInfo);
                if (key.isNeedUpdate()) {
                    this.needUpdateFeatureItems.add(key);
                }
                this.linearLayout.addView(view);
                viewInflate = layoutInflaterFrom.inflate(R.layout.divider_device_feature, (ViewGroup) this.linearLayout, false);
                this.linearLayout.addView(viewInflate);
            }
        }
        if (viewInflate != null) {
            this.linearLayout.removeView(viewInflate);
        }
    }

    protected void refreshItemView(Map.Entry<BaseFeatureItem, Boolean> entry, DeviceInfo deviceInfo) {
        BaseFeatureItem key = entry.getKey();
        View view = this.featureItemViews.get(key);
        int iIndexOfChild = this.linearLayout.indexOfChild(view);
        if (!entry.getValue().booleanValue()) {
            if (iIndexOfChild == -1) {
                return;
            }
            this.needUpdateFeatureItems.remove(key);
            removeItemView(iIndexOfChild, view);
            return;
        }
        key.updateDevice(deviceInfo);
        if (iIndexOfChild != -1) {
            return;
        }
        if (key.isNeedUpdate()) {
            this.needUpdateFeatureItems.add(key);
        }
        addItemView(view, key);
    }

    private void removeItemView(int i, View view) {
        int childCount = this.linearLayout.getChildCount();
        if (childCount == 1) {
            this.linearLayout.removeView(view);
        } else if (i == childCount - 1) {
            this.linearLayout.removeViewAt(i - 1);
            this.linearLayout.removeView(view);
        } else {
            this.linearLayout.removeViewAt(i + 1);
            this.linearLayout.removeView(view);
        }
    }

    private void addItemView(View view, BaseFeatureItem baseFeatureItem) {
        int childCount = this.linearLayout.getChildCount();
        if (childCount == 0) {
            this.linearLayout.addView(view);
            return;
        }
        int iIndexOf = this.defaultFeatureItems.indexOf(baseFeatureItem);
        int i = 0;
        while (true) {
            if (i >= childCount) {
                i = -1;
                break;
            }
            View childAt = this.linearLayout.getChildAt(i);
            if ((childAt.getTag() instanceof BaseFeatureItem) && this.defaultFeatureItems.indexOf(childAt.getTag()) > iIndexOf) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            LayoutInflater.from(this.activity).inflate(R.layout.divider_device_feature, (ViewGroup) this.linearLayout, true);
            this.linearLayout.addView(view);
        } else {
            this.linearLayout.addView(view, i);
            this.linearLayout.addView(LayoutInflater.from(this.activity).inflate(R.layout.divider_device_feature, (ViewGroup) this.linearLayout, false), i + 1);
        }
    }

    protected void refreshNeedUpdateItem(final DeviceInfo deviceInfo) {
        this.needUpdateFeatureItems.forEach(new Consumer() { // from class: rxh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((BaseFeatureItem) obj).updateDevice(deviceInfo);
            }
        });
    }
}
