package com.huawei.health.suggestion.ui.fitness.viewholder;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.activity.FitnessActionTypeActivity;
import com.huawei.hidatamanager.util.LogUtils;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.btx;
import defpackage.hkv;
import defpackage.idy;
import defpackage.njy;
import defpackage.qrk;
import defpackage.qrs;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class FitnessActionViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f9465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f9466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f9467c;
    private RelativeLayout d;
    private Context e;
    private ImageView g;
    private ImageView j;

    public FitnessActionViewHolder(View view) {
        super(view);
        this.e = btx.c();
        this.g = (ImageView) view.findViewById(R.id.sug_item_action_icon_left);
        this.f9467c = (HealthTextView) view.findViewById(R.id.sug_item_action_type_left);
        this.f9465a = (RelativeLayout) view.findViewById(R.id.sug_item_action_contain_left);
        this.j = (ImageView) view.findViewById(R.id.sug_item_action_icon_right);
        this.f9466b = (HealthTextView) view.findViewById(R.id.sug_item_action_type_right);
        this.d = (RelativeLayout) view.findViewById(R.id.sug_item_action_contain_right);
    }

    public void d(List<hkv> list, int i) {
        if (njy.e(list)) {
            LogUtils.w("Suggestion_FitnessActionViewHolder", "setActionData ActionData can not be null");
            return;
        }
        int i2 = i * 2;
        int i3 = i2 + 1;
        if (i3 > list.size()) {
            LogUtils.w("Suggestion_FitnessActionViewHolder", "setActionData itemIndex is error");
            return;
        }
        hkv hkvVar = list.get(i2);
        hkv hkvVar2 = list.get(i3);
        if (hkvVar == null || hkvVar2 == null) {
            LogUtils.w("Suggestion_FitnessActionViewHolder", "setActionData ActionData can not be null");
            return;
        }
        this.f9467c.setText(this.e.getString(hkvVar.e()));
        this.g.setImageResource(hkvVar.d());
        e(this.f9465a, hkvVar);
        this.f9466b.setText(this.e.getString(hkvVar2.e()));
        this.j.setImageResource(hkvVar2.d());
        e(this.d, hkvVar2);
    }

    private void e(View view, final hkv hkvVar) {
        view.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.viewholder.FitnessActionViewHolder.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (qrs.r()) {
                    LogUtil.j("Suggestion_FitnessActionViewHolder", "onClick is fast click");
                    return;
                }
                HashMap map = new HashMap(3);
                map.put("click", 1);
                map.put("date", qrk.b());
                map.put("type", Integer.valueOf(hkvVar.a()));
                idy.b(AnalyticsValue.HEALTH_FITNESS_ACTION_TYPE_1130028.value(), map);
                ViewParent parent = FitnessActionViewHolder.this.itemView.getParent();
                if (!(parent instanceof RecyclerView)) {
                    LogUtil.j("Suggestion_FitnessActionViewHolder", "parentView is not RecyclerView.");
                    return;
                }
                try {
                    Context context = ((RecyclerView) parent).getContext();
                    Intent intent = new Intent(context, (Class<?>) FitnessActionTypeActivity.class);
                    intent.putExtra("body_title", context.getString(hkvVar.e()));
                    intent.putExtra("body_title_type", hkvVar.a());
                    intent.setFlags(268435456);
                    context.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    LogUtil.e("Suggestion_FitnessActionViewHolder", "setCustomItemClickListener ActivityNotFoundException.");
                }
            }
        });
    }
}
