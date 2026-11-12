package com.huawei.ui.main.stories.soical.views;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.request.ColumnRequestUtils;
import com.huawei.health.marketing.request.CustomConfigValue;
import com.huawei.health.operationbundle.R;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qqf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class FunctionMenuAdapter extends RecyclerView.Adapter<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<SingleGridContent> f28956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f28957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f28958c;
    private List<CustomConfigValue> d = new ArrayList(10);

    public FunctionMenuAdapter(Context context) {
        this.f28957b = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new c(LayoutInflater.from(this.f28957b).inflate(R.layout.item_function_menu, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(c cVar, int i) {
        if (njy.e(this.f28956a)) {
            LogUtil.j("FunctionMenuAdapter", "onBindViewHolder() holder or briefInfoList or position is null.");
            return;
        }
        if (njy.e(this.f28956a, i)) {
            LogUtil.j("FunctionMenuAdapter", "onBindViewHolder() outOfBounds, position = ", Integer.valueOf(i));
        }
        SingleGridContent singleGridContent = this.f28956a.get(i);
        qqf.b(cVar.e, singleGridContent.getPicture(), qqf.e, 0, 0);
        cVar.f28961b.setText(singleGridContent.getTheme());
        if (singleGridContent.getFavoriteTime() > 0) {
            cVar.f28960a.setImageResource(R.drawable.ic_colleted);
        } else {
            cVar.f28960a.setImageResource(R.drawable.ic_not_colleted);
        }
        b(cVar, singleGridContent);
    }

    private void b(c cVar, final SingleGridContent singleGridContent) {
        cVar.f28960a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.soical.views.FunctionMenuAdapter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (TextUtils.isEmpty(singleGridContent.getItemId())) {
                    LogUtil.d("FunctionMenuAdapter", "onBindViewHolder() onClick itemId null");
                    return;
                }
                if (singleGridContent.getFavoriteTime() > 0) {
                    for (CustomConfigValue customConfigValue : FunctionMenuAdapter.this.d) {
                        if (TextUtils.equals(singleGridContent.getItemId(), customConfigValue.getId())) {
                            FunctionMenuAdapter.this.d.remove(customConfigValue);
                            break;
                        }
                    }
                    FunctionMenuAdapter functionMenuAdapter = FunctionMenuAdapter.this;
                    functionMenuAdapter.f28956a = ColumnRequestUtils.getFunctionMenuFinallyData(functionMenuAdapter.d(functionMenuAdapter.f28958c), FunctionMenuAdapter.this.d);
                    FunctionMenuAdapter.this.notifyDataSetChanged();
                    FunctionMenuAdapter.this.c(2, singleGridContent.getTheme(), singleGridContent.getItemId());
                    return;
                }
                FunctionMenuAdapter functionMenuAdapter2 = FunctionMenuAdapter.this;
                if (functionMenuAdapter2.e((List<SingleGridContent>) functionMenuAdapter2.f28956a)) {
                    qpx.e(FunctionMenuAdapter.this.f28957b, R.string.IDS_social_collection_failed);
                    return;
                }
                if (njy.e(FunctionMenuAdapter.this.d)) {
                    FunctionMenuAdapter.this.d = new ArrayList(10);
                }
                CustomConfigValue customConfigValue2 = new CustomConfigValue();
                customConfigValue2.setFavoriteTime(System.currentTimeMillis());
                customConfigValue2.setId(singleGridContent.getItemId());
                FunctionMenuAdapter.this.d.add(customConfigValue2);
                FunctionMenuAdapter functionMenuAdapter3 = FunctionMenuAdapter.this;
                functionMenuAdapter3.f28956a = ColumnRequestUtils.getFunctionMenuFinallyData(functionMenuAdapter3.d(functionMenuAdapter3.f28958c), FunctionMenuAdapter.this.d);
                FunctionMenuAdapter.this.notifyDataSetChanged();
                FunctionMenuAdapter.this.c(1, singleGridContent.getTheme(), singleGridContent.getItemId());
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<SingleGridContent> list = this.f28956a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    static class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ImageView f28960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f28961b;
        private ImageView e;

        public c(View view) {
            super(view);
            this.e = (ImageView) view.findViewById(R.id.item_all_function_menu_image);
            this.f28960a = (ImageView) view.findViewById(R.id.item_all_function_menu_favorites_image);
            this.f28961b = (HealthTextView) view.findViewById(R.id.item_all_function_menu_name);
        }
    }

    public void e(List<SingleGridContent> list, List<CustomConfigValue> list2) {
        if (njy.e(list)) {
            LogUtil.j("FunctionMenuAdapter", "setData() singleGridContents is null.");
            return;
        }
        this.f28958c = new Gson().toJson(list);
        this.d = list2;
        this.f28956a = ColumnRequestUtils.getFunctionMenuFinallyData(list, list2);
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, String str, String str2) {
        HashMap map = new HashMap(1);
        map.put("event", Integer.valueOf(i));
        map.put("menuName", str);
        map.put("menuId", str2);
        lmf.d().c(this.f28957b, AnalyticsValue.FUNCTION_MENU_COLLECTION_2020038.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(List<SingleGridContent> list) {
        Iterator<SingleGridContent> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().getFavoriteTime() > 0) {
                i++;
            }
        }
        return i >= 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<SingleGridContent> d(String str) {
        List<SingleGridContent> arrayList = new ArrayList<>(10);
        try {
            List<SingleGridContent> list = (List) new Gson().fromJson(str, new TypeToken<List<SingleGridContent>>() { // from class: com.huawei.ui.main.stories.soical.views.FunctionMenuAdapter.2
            }.getType());
            try {
                LogUtil.j("FunctionMenuAdapter", "getOriginalData size: ", Integer.valueOf(list.size()));
                return list;
            } catch (JsonSyntaxException unused) {
                arrayList = list;
                LogUtil.j("FunctionMenuAdapter", "request Exception.");
                return arrayList;
            }
        } catch (JsonSyntaxException unused2) {
        }
    }
}
