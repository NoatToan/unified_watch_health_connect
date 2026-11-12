package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.qqf;
import defpackage.qrs;

/* JADX INFO: loaded from: classes10.dex */
public class RunRouteView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f11286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f11287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f11288c;
    private HealthDivider d;
    private ImageView e;
    private View f;
    private HealthTextView g;
    private HealthTextView h;

    public RunRouteView(Context context) {
        super(context);
        this.f11286a = context;
        e(context);
    }

    public RunRouteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11286a = context;
        e(context);
    }

    public RunRouteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11286a = context;
        e(context);
    }

    private void e(Context context) {
        if (context == null) {
            LogUtil.e("Track_DetailFrag_RunRouteViewHolder", "context is null");
            return;
        }
        View viewInflate = View.inflate(context, R.layout.track_show_detail_fragment_running_route, this);
        this.f = viewInflate;
        ((HealthSubHeader) viewInflate.findViewById(R.id.sub_header_title)).setPaddingStartEnd(0.0f, 0.0f);
        this.f11288c = (HealthTextView) this.f.findViewById(R.id.text_running_route_name);
        this.g = (HealthTextView) this.f.findViewById(R.id.text_view_run_route_times);
        this.e = (ImageView) this.f.findViewById(R.id.image_view_run_route);
        this.d = (HealthDivider) this.f.findViewById(R.id.health_divider_run_route);
        this.f11287b = (ImageView) this.f.findViewById(R.id.right_running_route_arrow);
        this.h = (HealthTextView) this.f.findViewById(R.id.route_running_route_state);
    }

    public void setHotPathName(String str) {
        if (str == null) {
            LogUtil.j("Track_DetailFrag_RunRouteViewHolder", "setData : hotPathName or hotPathPunchCount is null");
        } else {
            this.f11288c.setText(str);
        }
    }

    public void setHotTrackParticipateNum(String str, int i) {
        if ("0".equals(str)) {
            this.g.setText(this.f11286a.getResources().getString(R.string.IDS_track_not_finish_runing_route));
        } else {
            this.g.setText(this.f11286a.getResources().getQuantityString(R.plurals.IDS_track_show_detail_run_route_times, i, Integer.valueOf(i)));
        }
    }

    public void setHotPathDrawable(Drawable drawable) {
        if (drawable == null) {
            LogUtil.j("Track_DetailFrag_RunRouteViewHolder", "setHotPathDrawable : drawable is null");
        } else {
            qqf.a(this.e, drawable, qqf.e, 0);
        }
    }

    public void setHotPathUrl(String str) {
        qqf.b(this.e, str, qqf.e, 0, 0);
    }

    public void b(Boolean bool) {
        if (bool.booleanValue()) {
            this.d.setVisibility(0);
            if (qrs.ah(this.f11286a)) {
                this.f11287b.setVisibility(8);
                return;
            }
            return;
        }
        this.d.setVisibility(8);
        this.f11287b.setVisibility(8);
    }

    public void setRouteStateShow() {
        this.f11287b.setVisibility(8);
        this.h.setVisibility(0);
    }
}
