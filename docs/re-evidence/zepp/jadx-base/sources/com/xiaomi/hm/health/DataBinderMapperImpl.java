package com.xiaomi.hm.health;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.hm.health.databinding.FragmentSmallToolSortBindingImpl;
import com.xiaomi.hm.health.databinding.MyToolsGridItemBindingImpl;
import com.xiaomi.hm.health.databinding.MyToolsGridItemBindingZhImpl;
import com.xiaomi.hm.health.databinding.MyToolsGridItemBindingZhRHKImpl;
import com.xiaomi.hm.health.databinding.MyToolsGridItemBindingZhRTWImpl;
import com.xiaomi.hm.health.databinding.SmallToolGridItemBindingImpl;
import com.xiaomi.hm.health.databinding.SmallToolGridItemBindingZhImpl;
import com.xiaomi.hm.health.databinding.SmallToolGridItemBindingZhRHKImpl;
import com.xiaomi.hm.health.databinding.SmallToolGridItemBindingZhRTWImpl;
import com.xiaomi.hm.health.databinding.SmallToolGridTitleBindingImpl;
import com.xiaomi.hm.health.databinding.SmallToolGridTitleBindingZhImpl;
import com.xiaomi.hm.health.databinding.SmallToolGridTitleBindingZhRHKImpl;
import com.xiaomi.hm.health.databinding.SmallToolGridTitleBindingZhRTWImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    private static final int a = 1;
    private static final int b = 2;
    private static final int c = 3;
    private static final int d = 4;
    private static final SparseIntArray e;

    public static class a {
        public static final SparseArray<String> a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(5);
            a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "handler");
            sparseArray.put(2, "item");
            sparseArray.put(3, "titleResId");
            sparseArray.put(4, "viewmodel");
        }

        private a() {
        }
    }

    public static class b {
        public static final HashMap<String, Integer> a;

        static {
            HashMap<String, Integer> map = new HashMap<>(13);
            a = map;
            map.put("layout/fragment_small_tool_sort_0", Integer.valueOf(com.huami.watch.hmwatchmanager.R.layout.fragment_small_tool_sort));
            Integer numValueOf = Integer.valueOf(com.huami.watch.hmwatchmanager.R.layout.my_tools_grid_item);
            map.put("layout-zh/my_tools_grid_item_0", numValueOf);
            map.put("layout/my_tools_grid_item_0", numValueOf);
            map.put("layout-zh-rHK/my_tools_grid_item_0", numValueOf);
            map.put("layout-zh-rTW/my_tools_grid_item_0", numValueOf);
            Integer numValueOf2 = Integer.valueOf(com.huami.watch.hmwatchmanager.R.layout.small_tool_grid_item);
            map.put("layout/small_tool_grid_item_0", numValueOf2);
            map.put("layout-zh/small_tool_grid_item_0", numValueOf2);
            map.put("layout-zh-rHK/small_tool_grid_item_0", numValueOf2);
            map.put("layout-zh-rTW/small_tool_grid_item_0", numValueOf2);
            Integer numValueOf3 = Integer.valueOf(com.huami.watch.hmwatchmanager.R.layout.small_tool_grid_title);
            map.put("layout-zh-rTW/small_tool_grid_title_0", numValueOf3);
            map.put("layout-zh-rHK/small_tool_grid_title_0", numValueOf3);
            map.put("layout/small_tool_grid_title_0", numValueOf3);
            map.put("layout-zh/small_tool_grid_title_0", numValueOf3);
        }

        private b() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        e = sparseIntArray;
        sparseIntArray.put(com.huami.watch.hmwatchmanager.R.layout.fragment_small_tool_sort, 1);
        sparseIntArray.put(com.huami.watch.hmwatchmanager.R.layout.my_tools_grid_item, 2);
        sparseIntArray.put(com.huami.watch.hmwatchmanager.R.layout.small_tool_grid_item, 3);
        sparseIntArray.put(com.huami.watch.hmwatchmanager.R.layout.small_tool_grid_title, 4);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int localId) {
        return a.a.get(localId);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
        int i = e.get(layoutId);
        if (i <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i == 1) {
            if ("layout/fragment_small_tool_sort_0".equals(tag)) {
                return new FragmentSmallToolSortBindingImpl(component, view);
            }
            throw new IllegalArgumentException("The tag for fragment_small_tool_sort is invalid. Received: " + tag);
        }
        if (i == 2) {
            if ("layout-zh/my_tools_grid_item_0".equals(tag)) {
                return new MyToolsGridItemBindingZhImpl(component, view);
            }
            if ("layout/my_tools_grid_item_0".equals(tag)) {
                return new MyToolsGridItemBindingImpl(component, view);
            }
            if ("layout-zh-rHK/my_tools_grid_item_0".equals(tag)) {
                return new MyToolsGridItemBindingZhRHKImpl(component, view);
            }
            if ("layout-zh-rTW/my_tools_grid_item_0".equals(tag)) {
                return new MyToolsGridItemBindingZhRTWImpl(component, view);
            }
            throw new IllegalArgumentException("The tag for my_tools_grid_item is invalid. Received: " + tag);
        }
        if (i == 3) {
            if ("layout/small_tool_grid_item_0".equals(tag)) {
                return new SmallToolGridItemBindingImpl(component, view);
            }
            if ("layout-zh/small_tool_grid_item_0".equals(tag)) {
                return new SmallToolGridItemBindingZhImpl(component, view);
            }
            if ("layout-zh-rHK/small_tool_grid_item_0".equals(tag)) {
                return new SmallToolGridItemBindingZhRHKImpl(component, view);
            }
            if ("layout-zh-rTW/small_tool_grid_item_0".equals(tag)) {
                return new SmallToolGridItemBindingZhRTWImpl(component, view);
            }
            throw new IllegalArgumentException("The tag for small_tool_grid_item is invalid. Received: " + tag);
        }
        if (i != 4) {
            return null;
        }
        if ("layout-zh-rTW/small_tool_grid_title_0".equals(tag)) {
            return new SmallToolGridTitleBindingZhRTWImpl(component, view);
        }
        if ("layout-zh-rHK/small_tool_grid_title_0".equals(tag)) {
            return new SmallToolGridTitleBindingZhRHKImpl(component, view);
        }
        if ("layout/small_tool_grid_title_0".equals(tag)) {
            return new SmallToolGridTitleBindingImpl(component, view);
        }
        if ("layout-zh/small_tool_grid_title_0".equals(tag)) {
            return new SmallToolGridTitleBindingZhImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for small_tool_grid_title is invalid. Received: " + tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String tag) {
        Integer num;
        if (tag == null || (num = b.a.get(tag)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
        if (views == null || views.length == 0 || e.get(layoutId) <= 0 || views[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
