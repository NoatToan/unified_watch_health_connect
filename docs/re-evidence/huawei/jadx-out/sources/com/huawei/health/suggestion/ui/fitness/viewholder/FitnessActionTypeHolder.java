package com.huawei.health.suggestion.ui.fitness.viewholder;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.activity.FitnessActionDetailActivity;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.Video;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.gzx;
import defpackage.idy;
import defpackage.ied;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qrk;
import defpackage.qrs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class FitnessActionTypeHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f9463b;
    private RelativeLayout d;
    private ImageView e;

    public FitnessActionTypeHolder(View view) {
        super(view);
        this.e = (ImageView) view.findViewById(R.id.sug_item_action_icon);
        this.f9463b = (HealthTextView) view.findViewById(R.id.sug_item_action_type);
        this.d = (RelativeLayout) view.findViewById(R.id.sug_item_action_contain);
    }

    public void d(AtomicAction atomicAction) {
        String thumbnail;
        if (atomicAction == null) {
            LogUtil.j("FitnessActionTypeHolder", "setActionData ActionInfo can not null");
            return;
        }
        this.f9463b.setText(atomicAction.getName());
        List extendPropertyList = atomicAction.getExtendPropertyList("actionVideo", Video[].class);
        a(this.d, atomicAction);
        if (njy.e(extendPropertyList)) {
            LogUtil.j("FitnessActionTypeHolder", "setActionData videos can not null");
            return;
        }
        int iE = ied.e();
        Iterator it = extendPropertyList.iterator();
        while (true) {
            if (!it.hasNext()) {
                thumbnail = null;
                break;
            }
            Video video = (Video) it.next();
            if (video != null && video.getGender() == iE) {
                thumbnail = video.getThumbnail();
                break;
            }
        }
        if (TextUtils.isEmpty(thumbnail)) {
            Video video2 = (Video) extendPropertyList.get(0);
            if (video2 == null) {
                LogUtil.j("FitnessActionTypeHolder", "setActionData video can not null");
                return;
            }
            thumbnail = video2.getThumbnail();
        }
        qqf.b(this.e, thumbnail, qqf.e, 0, com.huawei.health.basefitnessadvice.R.drawable.blank_1008);
    }

    private void a(View view, final AtomicAction atomicAction) {
        view.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.viewholder.FitnessActionTypeHolder.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                AtomicAction atomicAction2 = atomicAction;
                if (atomicAction2 == null) {
                    LogUtil.j("setCustomOnClickListener actionInfo can not null", new Object[0]);
                    return;
                }
                String id = atomicAction2.getId();
                String version = atomicAction.getVersion();
                if (qrs.r()) {
                    LogUtil.j("FitnessActionTypeHolder", "onClick is fast click");
                    return;
                }
                HashMap map = new HashMap(5);
                map.put("click", 1);
                map.put("date", qrk.b());
                map.put("type", gzx.d(atomicAction.getTrainingPoints()));
                map.put("acton_id", atomicAction.getId());
                map.put("action_name", atomicAction.getName());
                idy.b(AnalyticsValue.HEALTH_FITNESS_ACTION_DETAIL_1130029.value(), map);
                ViewParent parent = FitnessActionTypeHolder.this.itemView.getParent();
                if (!(parent instanceof RecyclerView)) {
                    LogUtil.j("FitnessActionTypeHolder", "setCustomOnClickListener parentView is not RecyclerView.");
                    return;
                }
                try {
                    Context context = ((RecyclerView) parent).getContext();
                    Intent intent = new Intent(context, (Class<?>) FitnessActionDetailActivity.class);
                    intent.putExtra("action_id", id);
                    intent.putExtra("action_version", version);
                    intent.setFlags(268435456);
                    context.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    LogUtil.e("FitnessActionTypeHolder", "setCustomOnClickListener exception.");
                }
            }
        });
    }
}
