package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.MedalInfo;
import com.huawei.pluginachievement.manager.model.MedalInfoDesc;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class pbg extends pbd {

    public static class d extends pbd.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f45118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        LinearLayout f45119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        View f45120c;
        ImageView d;
    }

    public pbg(Context context, Map<String, ArrayList<MedalInfoDesc>> map, Map<Integer, String> map2, Map<String, MedalInfo> map3) {
        super(context, map, map2, map3);
    }

    public View c(int i, boolean z, View view) {
        View viewInflate;
        d dVar;
        if (view == null) {
            dVar = new d();
            viewInflate = LayoutInflater.from(this.f45112c).inflate(R.layout.achieve_medal_expandable_father_item, (ViewGroup) null);
            e(dVar, viewInflate);
            viewInflate.setTag(dVar);
        } else {
            Object tag = view.getTag();
            if (!(tag instanceof d)) {
                return view;
            }
            d dVar2 = (d) tag;
            viewInflate = view;
            dVar = dVar2;
        }
        if (i == 0) {
            dVar.f45120c.setVisibility(8);
        } else {
            dVar.f45120c.setVisibility(4);
        }
        a(dVar, i, z);
        return viewInflate;
    }

    private void a(d dVar, int i, boolean z) {
        String str = this.f45111b.get(Integer.valueOf(i));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        dVar.f45118a.setText(str);
        if (z) {
            dVar.f45119b.setBackground(this.f45110a);
            dVar.d.setImageResource(R.drawable.medal_up);
        } else {
            dVar.f45119b.setBackground(this.e);
            dVar.d.setImageResource(R.drawable.medal_down);
        }
        ArrayList<MedalInfoDesc> arrayList = this.d.get(str);
        if (njy.e(arrayList)) {
            return;
        }
        if (arrayList.size() <= 3) {
            dVar.d.setVisibility(8);
        } else {
            dVar.d.setVisibility(0);
        }
        dVar.e.removeAllViews();
        if (arrayList.size() == 1) {
            dVar.e.addView(e(arrayList, 0));
            dVar.e.addView(d());
            dVar.e.addView(d());
        }
        if (arrayList.size() == 2) {
            dVar.e.addView(e(arrayList, 0));
            dVar.e.addView(e(arrayList, 1));
            dVar.e.addView(d());
        }
        if (arrayList.size() >= 3) {
            dVar.e.addView(e(arrayList, 0));
            dVar.e.addView(e(arrayList, 1));
            dVar.e.addView(e(arrayList, 2));
        }
    }

    private void e(d dVar, View view) {
        dVar.f45118a = (HealthTextView) out.b(view, R.id.medal_type_name);
        dVar.d = (ImageView) out.b(view, R.id.group_arrow);
        dVar.f45119b = (LinearLayout) out.b(view, R.id.father_item_ll);
        dVar.f45120c = out.b(view, R.id.fatherMargin);
        dVar.e = (GridLayout) out.b(view, R.id.father_grid_layout);
    }
}
