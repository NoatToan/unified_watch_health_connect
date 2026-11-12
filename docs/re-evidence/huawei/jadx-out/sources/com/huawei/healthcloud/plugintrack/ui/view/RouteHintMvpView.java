package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.utils.AsyncLoadDrawableCallback;
import defpackage.qqf;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class RouteHintMvpView extends LinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f11280c = 90;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f11281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f11282b;
    private ImageView d;

    public RouteHintMvpView(Context context) {
        this(context, null);
    }

    public RouteHintMvpView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    private void a(Context context) {
        View viewInflate = View.inflate(context, R.layout.route_hint_mvp_layout, this);
        this.f11281a = viewInflate;
        this.f11282b = (HealthTextView) viewInflate.findViewById(R.id.route_mvp);
        this.d = (ImageView) this.f11281a.findViewById(R.id.iv_head);
    }

    public void setHeadView(String str, final BaseResponseCallback baseResponseCallback) {
        LogUtil.a("RouteHintView", "setHeadView imageUrl=", str);
        if (TextUtils.isEmpty(str)) {
            this.d.setImageDrawable(ContextCompat.getDrawable(BaseApplication.b(), R.mipmap.ic_personal_head));
            if (baseResponseCallback != null) {
                baseResponseCallback.onResponse(0, null);
                return;
            }
            return;
        }
        qqf.d(this.d, str, f11280c, 0, new AsyncLoadDrawableCallback() { // from class: jsh
            @Override // com.huawei.ui.commonui.utils.AsyncLoadDrawableCallback
            public final void getDrawable(Drawable drawable) {
                this.f38967b.c(baseResponseCallback, drawable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(BaseResponseCallback baseResponseCallback, Drawable drawable) {
        if (drawable == null) {
            this.d.setImageDrawable(ContextCompat.getDrawable(BaseApplication.b(), R.mipmap.ic_personal_head));
        }
        if (baseResponseCallback != null) {
            baseResponseCallback.onResponse(0, null);
        }
    }

    public void setContent(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("RouteHintView", "setContent content isEmpty");
        } else {
            this.f11282b.setText(str);
        }
    }
}
