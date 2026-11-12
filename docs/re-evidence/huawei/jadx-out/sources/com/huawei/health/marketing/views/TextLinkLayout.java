package com.huawei.health.marketing.views;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.DrawableImageViewTarget;
import com.google.gson.Gson;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.TextGeneralTemplate;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.fxl;
import defpackage.qqz;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes29.dex */
public class TextLinkLayout extends BaseLifeCycleLinearLayout {
    public TextLinkLayout(Context context) {
        super(context);
    }

    public void b(final int i, final ResourceBriefInfo resourceBriefInfo) {
        View viewInflate = LayoutInflater.from(BaseApplication.getContext()).inflate(R.layout.layout_opera_msg_item, (ViewGroup) this, true);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.opera_msg_text);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.opera_msg_layout_icon);
        final TextGeneralTemplate textGeneralTemplate = (TextGeneralTemplate) new Gson().fromJson(resourceBriefInfo.getContent().getContent(), TextGeneralTemplate.class);
        if (!TextUtils.isEmpty(textGeneralTemplate.getPicture())) {
            try {
                Glide.with(imageView).load(textGeneralTemplate.getPicture()).into(new d(imageView));
            } catch (IllegalArgumentException e) {
                LogUtil.e("TextLinkLayout", " Exception ", e.getMessage());
            }
        }
        healthTextView.setText(textGeneralTemplate.getTheme());
        MarketingBiUtils.e(i, resourceBriefInfo);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.marketing.views.TextLinkLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                fxl.d(textGeneralTemplate.getLinkValue(), i, resourceBriefInfo);
                MarketingBiUtils.c(i, resourceBriefInfo, System.currentTimeMillis());
                ((MarketingApi) Services.b("FeatureMarketing", MarketingApi.class)).recordResourcePresent(i, 1, resourceBriefInfo);
                view.setVisibility(8);
            }
        });
    }

    static class d extends DrawableImageViewTarget {
        d(ImageView imageView) {
            super(imageView);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bumptech.glide.request.target.DrawableImageViewTarget, com.bumptech.glide.request.target.ImageViewTarget
        public void setResource(Drawable drawable) {
            if (drawable != null) {
                Context context = BaseApplication.getContext();
                if (LanguageUtil.ba(context)) {
                    drawable = qqz.e(context, drawable);
                }
                ((ImageView) this.view).setImageDrawable(drawable);
                ((ImageView) this.view).setBackground(null);
                ((ImageView) this.view).setBackgroundTintMode(PorterDuff.Mode.SRC);
                ((ImageView) this.view).setBackgroundTintList(null);
                ((ImageView) this.view).setVisibility(0);
            }
        }
    }
}
