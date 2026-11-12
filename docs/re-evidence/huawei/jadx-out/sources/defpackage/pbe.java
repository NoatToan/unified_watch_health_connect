package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.MedalInfo;
import com.huawei.pluginachievement.manager.model.MedalInfoDesc;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class pbe extends pbd {
    public pbe(Context context, Map<String, ArrayList<MedalInfoDesc>> map, Map<Integer, String> map2, Map<String, MedalInfo> map3) {
        super(context, map, map2, map3);
    }

    public View e(int i, View view) {
        View viewInflate;
        a aVar;
        if (view == null) {
            aVar = new a();
            viewInflate = LayoutInflater.from(this.f45112c).inflate(R.layout.achieve_medal_expandable_child_item, (ViewGroup) null);
            b(aVar, viewInflate);
            viewInflate.setTag(aVar);
        } else {
            Object tag = view.getTag();
            if (!(tag instanceof a)) {
                return view;
            }
            a aVar2 = (a) tag;
            viewInflate = view;
            aVar = aVar2;
        }
        aVar.e.removeAllViews();
        String str = this.f45111b.get(Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            ArrayList<MedalInfoDesc> arrayList = this.d.get(str);
            if (!njy.e(arrayList) && arrayList.size() > 3) {
                c(aVar, arrayList);
            }
        }
        return viewInflate;
    }

    private void c(a aVar, ArrayList<MedalInfoDesc> arrayList) {
        for (int i = 3; i < arrayList.size(); i++) {
            aVar.e.addView(e(arrayList, i));
        }
        if (arrayList.size() == 4) {
            aVar.e.addView(d());
            aVar.e.addView(d());
        }
        if (arrayList.size() == 5) {
            aVar.e.addView(d());
        }
    }

    private void b(a aVar, View view) {
        aVar.e = (GridLayout) out.b(view, R.id.child_grid_layout);
    }

    static class a extends pbd.e {
        private a() {
        }
    }
}
