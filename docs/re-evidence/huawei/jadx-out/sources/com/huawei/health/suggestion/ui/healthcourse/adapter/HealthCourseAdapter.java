package com.huawei.health.suggestion.ui.healthcourse.adapter;

import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.polymericpage.adapter.PolymericDataAdapter;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.pluginfitnessadvice.HealthWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.fya;
import defpackage.gzx;
import defpackage.hze;
import defpackage.iei;
import defpackage.ped;
import defpackage.qqf;
import defpackage.qqk;
import defpackage.qre;
import defpackage.qrr;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class HealthCourseAdapter extends PolymericDataAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Object> f9560a;

    public HealthCourseAdapter(List<Workout> list, RecyclerView recyclerView, int i, Map<String, Object> map) {
        super(list, recyclerView, i);
        this.f9560a = map;
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.adapter.PolymericDataAdapter
    public void setIsShowSquare(boolean z) {
        super.setIsShowSquare(z);
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.adapter.PolymericDataAdapter
    public void setRecycleHolder(RecyclerHolder recyclerHolder, final Workout workout, final int i) {
        HealthTextView healthTextView;
        if (!(workout instanceof HealthWorkout)) {
            LogUtil.j("Sug_HealthCourseAdapter", "convert, workout is null.");
            return;
        }
        LogUtil.a("Sug_HealthCourseAdapter", "convert, holder.itemView.getWidth() = ", Integer.valueOf(recyclerHolder.itemView.getWidth()));
        HealthWorkout healthWorkout = (HealthWorkout) workout;
        c(recyclerHolder, healthWorkout);
        if (this.mIsShowSquare) {
            healthTextView = (HealthTextView) recyclerHolder.d(R.id.tv_tag_square);
            b(recyclerHolder, workout, i, healthWorkout);
        } else {
            recyclerHolder.d(R.id.recycle_item).setOnClickListener(new View.OnClickListener() { // from class: hoh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f36980b.b(workout, i, view);
                }
            });
            recyclerHolder.d(R.id.item_course).setVisibility(0);
            recyclerHolder.d(R.id.item_square_course).setVisibility(8);
            healthTextView = (HealthTextView) recyclerHolder.d(R.id.tv_tag);
            b(recyclerHolder);
        }
        a(healthWorkout, healthTextView);
    }

    public /* synthetic */ void b(Workout workout, int i, View view) {
        onItemClick(workout, i);
    }

    private void b(RecyclerHolder recyclerHolder, final Workout workout, final int i, HealthWorkout healthWorkout) {
        recyclerHolder.d(R.id.item_course).setVisibility(8);
        recyclerHolder.d(R.id.item_square_course).setVisibility(0);
        recyclerHolder.d(R.id.recycle_item_square).setOnClickListener(new View.OnClickListener() { // from class: hoj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36983a.c(workout, i, view);
            }
        });
        setCardBackground((ImageView) recyclerHolder.d(R.id.sug_img_item_pic_square), workout, i);
        b(recyclerHolder, healthWorkout);
        HealthImageView healthImageView = (HealthImageView) recyclerHolder.d(R.id.item_device_icon);
        if (healthImageView == null) {
            return;
        }
        if ("1001".equals(workout.acquireId()) || BleConstants.CODE_AUTHORIZED_FAIL.equals(workout.acquireId())) {
            healthImageView.setVisibility(0);
        } else {
            healthImageView.setVisibility(8);
        }
    }

    public /* synthetic */ void c(Workout workout, int i, View view) {
        onItemClick(workout, i);
    }

    private void b(RecyclerHolder recyclerHolder) {
        if (qrs.y()) {
            b(recyclerHolder, R.id.tv_subtitle, R.dimen.health_common_12dp);
            recyclerHolder.d(R.id.play_num_layout).setVisibility(8);
        }
        if (qrs.p()) {
            b(recyclerHolder, R.id.tv_fe_name, R.dimen.health_common_24dp);
            b(recyclerHolder, R.id.member_price_title, R.dimen.health_common_15dp);
            b(recyclerHolder, R.id.member_price_unit, R.dimen.health_common_15dp);
            b(recyclerHolder, R.id.member_price, R.dimen.health_common_18dp);
            b(recyclerHolder, R.id.normal_price, R.dimen.health_common_15dp);
        }
    }

    private void b(RecyclerHolder recyclerHolder, int i, int i2) {
        View viewD = recyclerHolder.d(i);
        Resources resources = BaseApplication.getContext().getResources();
        float dimension = resources == null ? 0.0f : resources.getDimension(i2);
        if (!(viewD instanceof HealthTextView) || dimension == 0.0f) {
            return;
        }
        ((HealthTextView) viewD).setTextSize(0, dimension);
    }

    private void e(RecyclerHolder recyclerHolder, HealthWorkout healthWorkout) {
        HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.member_price_title);
        healthTextView.setText(gzx.c(healthTextView.getContext(), R.string.IDS_member_price, ""));
        HealthTextView healthTextView2 = (HealthTextView) recyclerHolder.d(R.id.member_price_unit);
        healthTextView2.setText(this.mContext.getString(R.string.IDS_currency_money, "¥", ""));
        HealthTextView healthTextView3 = (HealthTextView) recyclerHolder.d(R.id.member_price);
        healthTextView3.setText(healthWorkout.getMemberPrice());
        HealthTextView healthTextView4 = (HealthTextView) recyclerHolder.d(R.id.normal_price);
        healthTextView4.setText(this.mContext.getString(R.string.IDS_currency_money, "¥", healthWorkout.getNormalPrice()));
        TextPaint paint = healthTextView4.getPaint();
        if (paint != null) {
            paint.setFlags(16);
        }
        if (TextUtils.isEmpty(healthWorkout.getNormalPrice())) {
            healthTextView4.setVisibility(8);
        } else {
            healthTextView4.setVisibility(0);
        }
        if (TextUtils.isEmpty(healthWorkout.getMemberPrice())) {
            healthTextView.setVisibility(8);
            healthTextView2.setVisibility(8);
            healthTextView3.setVisibility(8);
            healthTextView4.setPaintFlags(healthTextView4.getPaintFlags() & (-17));
            return;
        }
        healthTextView.setVisibility(0);
        healthTextView2.setVisibility(0);
        healthTextView3.setVisibility(0);
    }

    private void b(RecyclerHolder recyclerHolder, int i) {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new hze.c(recyclerHolder.d(R.id.tv_fe_name), 4));
        arrayList.add(new hze.c(recyclerHolder.d(R.id.tv_subtitle)));
        arrayList.add(new hze.c(recyclerHolder.d(R.id.tv_duration)));
        arrayList.add(new hze.c(recyclerHolder.d(R.id.price_layout)));
        arrayList.add(new hze.c(recyclerHolder.d(R.id.tv_plan_peoples_num)));
        hze.c(arrayList, i);
        if (qrs.y()) {
            recyclerHolder.d(R.id.play_num_layout).setVisibility(8);
        }
        if (hze.b(i)) {
            recyclerHolder.d(R.id.sug_course_mask_bg).setVisibility(8);
        } else {
            e(recyclerHolder, i);
        }
    }

    private void e(RecyclerHolder recyclerHolder, int i) {
        LinearLayout linearLayout = (LinearLayout) recyclerHolder.d(R.id.play_num_layout);
        linearLayout.getLayoutParams();
        if (!(linearLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            LogUtil.j("Sug_HealthCourseAdapter", "controlDisplayView playNumLayout null instanceof RelativeLayout");
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        if (hze.e(i)) {
            layoutParams.removeRule(20);
            layoutParams.addRule(21);
        } else {
            layoutParams.removeRule(21);
            layoutParams.addRule(20);
        }
        linearLayout.setLayoutParams(layoutParams);
    }

    private void b(RecyclerHolder recyclerHolder, HealthWorkout healthWorkout) {
        HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.tv_fe_name_square);
        if (!Utils.o()) {
            healthTextView.setMaxLines(1);
            healthTextView.setSingleLine(true);
            healthTextView.setEllipsize(TextUtils.TruncateAt.END);
        }
        healthTextView.setText(StringUtils.c((Object) healthWorkout.acquireName()));
    }

    private void a(HealthWorkout healthWorkout, HealthTextView healthTextView) {
        if (healthWorkout.getCommodityFlag() == 1) {
            healthTextView.setVisibility(0);
            d(healthTextView, R.color.color_fitness_card_member_icon);
            healthTextView.setText(this.mContext.getString(R.string.IDS_vip));
        } else if (healthWorkout.getLayType() == 1) {
            healthTextView.setVisibility(0);
            d(healthTextView, R.color.color_course_tag_new);
            healthTextView.setText(this.mContext.getString(R.string.sug_health_course_new));
        } else {
            healthTextView.setVisibility(8);
            LogUtil.a("Sug_HealthCourseAdapter", "no tag.");
        }
    }

    private void d(HealthTextView healthTextView, int i) {
        float[] fArr;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            fArr = new float[]{fya.a(8.0f), fya.a(8.0f), 0.0f, 0.0f, fya.a(8.0f), fya.a(8.0f), 0.0f, 0.0f};
        } else {
            fArr = new float[]{0.0f, 0.0f, fya.a(8.0f), fya.a(8.0f), 0.0f, 0.0f, fya.a(8.0f), fya.a(8.0f)};
        }
        gradientDrawable.setCornerRadii(fArr);
        gradientDrawable.setColor(ContextCompat.getColor(this.mContext, i));
        healthTextView.setBackground(gradientDrawable);
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.adapter.PolymericDataAdapter
    public void setCardBackground(ImageView imageView, Workout workout, int i) {
        if (!(workout instanceof HealthWorkout)) {
            LogUtil.j("Sug_HealthCourseAdapter", "convert, workout is null.");
            return;
        }
        HealthWorkout healthWorkout = (HealthWorkout) workout;
        String str = imageView.getTag() instanceof String ? (String) imageView.getTag() : null;
        String picture = healthWorkout.getPicture();
        if (TextUtils.isEmpty(picture)) {
            LogUtil.a("Sug_HealthCourseAdapter", "use square picture.");
            picture = healthWorkout.getSqurePicture();
        }
        if (TextUtils.isEmpty(picture)) {
            LogUtil.e("Sug_HealthCourseAdapter", "backgroundUrl is empty.", picture);
            return;
        }
        if (TextUtils.isEmpty(str) || !picture.equals(str)) {
            imageView.setTag(picture);
            if (this.mIsShowSquare) {
                qqf.c(picture, imageView, qqf.f46647a);
            } else {
                qqf.c(picture, imageView, qqf.d);
            }
            iei.a(c(i, healthWorkout), "1130069");
        }
    }

    private Map<String, Object> c(int i, HealthWorkout healthWorkout) {
        Map<String, Object> mapE = iei.e(healthWorkout, i + 1);
        Map<String, Object> map = this.f9560a;
        if (map != null) {
            mapE.putAll(map);
            mapE.put("labelId", Integer.valueOf(this.mNavigationId));
        }
        return mapE;
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.adapter.PolymericDataAdapter
    public void setNewPic(ImageView imageView, Workout workout) {
        if (!(workout instanceof HealthWorkout)) {
            LogUtil.j("Sug_HealthCourseAdapter", "convert, workout is null.");
        } else {
            imageView.setVisibility(8);
        }
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.adapter.PolymericDataAdapter
    public void onItemClick(Workout workout, int i) {
        String str;
        if (qrs.r() || !(workout instanceof HealthWorkout)) {
            LogUtil.j("Sug_HealthCourseAdapter", "mItemView click too fast.");
            return;
        }
        HealthWorkout healthWorkout = (HealthWorkout) workout;
        if (a(healthWorkout)) {
            int enableNewUrl = healthWorkout.getEnableNewUrl();
            LogUtil.a("Sug_HealthCourseAdapter", "healthWorkout isEnableNewUrl ", Integer.valueOf(enableNewUrl));
            if (enableNewUrl == 1) {
                JumpUtil.a(BaseApplication.getContext(), healthWorkout.acquireId(), 2);
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("id", healthWorkout.acquireId());
                AppRouter.c("/Main/SeriesCourseListActivity").d(bundle).b(this.mContext);
            }
        } else {
            MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
            if (marketRouterApi == null) {
                LogUtil.a("Sug_HealthCourseAdapter", "marketRouterApi == null");
                return;
            }
            String strAcquireId = healthWorkout.acquireId();
            if (e(healthWorkout)) {
                str = "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.sleeping-music?h5pro=true&urlType=4&pName=com.huawei.health&path=audioDetail&id=%s&type=sleepAudio&statusBarTextBlack&isImmerse".replace("%s", strAcquireId) + b(healthWorkout, i + 1);
            } else if (!d(healthWorkout)) {
                str = "";
            } else {
                str = "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.breath-training?h5pro=true&urlType=4&pName=com.huawei.health&statusBarTextBlack&isImmerse&path=trainPage&trainModeId=" + strAcquireId + b(healthWorkout, i + 1);
            }
            LogUtil.a("Sug_HealthCourseAdapter", "type:", Integer.valueOf(healthWorkout.getType()), " url:", str);
            marketRouterApi.router(str);
        }
        iei.b(c(i, healthWorkout));
    }

    private String b(HealthWorkout healthWorkout, int i) {
        return "&itemId=" + healthWorkout.acquireId() + "&labelId=" + this.mNavigationId + "&pullOrder=" + i + d();
    }

    private String d() {
        if (this.f9560a != null) {
            return "&pullfrom=" + this.f9560a.get(WebViewHelp.BI_KEY_PULL_FROM) + "&resourceId=" + this.f9560a.get("resourceId") + "&resourceName=" + this.f9560a.get("resourceName");
        }
        return "";
    }

    private void c(RecyclerHolder recyclerHolder, HealthWorkout healthWorkout) {
        HealthTextView healthTextView;
        HealthTextView healthTextView2;
        HealthTextView healthTextView3 = (HealthTextView) recyclerHolder.d(R.id.tv_subtitle);
        if (this.mIsShowSquare) {
            healthTextView = (HealthTextView) recyclerHolder.d(R.id.tv_duration_square);
        } else {
            HealthTextView healthTextView4 = (HealthTextView) recyclerHolder.d(R.id.tv_duration);
            healthTextView3.setText(healthWorkout.getSubtitle());
            a(recyclerHolder, healthWorkout);
            healthTextView = healthTextView4;
        }
        if (a(healthWorkout)) {
            int chapterCount = healthWorkout.getChapterCount();
            healthTextView.setText(qre.e(R.plurals.IDS_sleep_decompression_chapter, chapterCount, UnitUtil.e(chapterCount, 1, 0)));
        } else if (healthWorkout.acquireDuration() == 0) {
            healthTextView.setVisibility(8);
        } else {
            healthTextView.setVisibility(0);
            healthTextView.setText(gzx.d(R.plurals.IDS_single_circle_intensity_target_desc, healthWorkout.acquireDuration(), ped.m(healthWorkout.acquireDuration())));
        }
        if (this.mIsShowSquare) {
            healthTextView2 = (HealthTextView) recyclerHolder.d(R.id.tv_fe_name_square);
            a(recyclerHolder, healthWorkout.getUsers());
        } else {
            healthTextView2 = (HealthTextView) recyclerHolder.d(R.id.tv_fe_name);
        }
        healthTextView2.setTextColor(getTextColor(R.color.textColorPrimaryInverse));
        healthTextView2.setTypeface(qrr.g());
        if (a(healthWorkout) && !TextUtils.isEmpty(healthWorkout.getAggregateTitle())) {
            healthTextView2.setText(healthWorkout.getAggregateTitle());
        }
        ((TextView) recyclerHolder.d(R.id.tv_plan_peoples_num)).setText(gzx.d(R.plurals.sug_health_person_audition, healthWorkout.getUsers(), UnitUtil.e(healthWorkout.getUsers(), 1, 0)));
    }

    private void a(RecyclerHolder recyclerHolder, HealthWorkout healthWorkout) {
        if (a(healthWorkout)) {
            b(recyclerHolder, healthWorkout.getDisPlaybit());
            e(recyclerHolder, healthWorkout);
        } else {
            recyclerHolder.d(R.id.price_layout).setVisibility(8);
            e(recyclerHolder, healthWorkout.getDisPlaybit());
        }
    }

    private void a(RecyclerHolder recyclerHolder, int i) {
        ((TextView) recyclerHolder.d(R.id.tv_plan_peoples_num_square)).setText(qqk.b(i));
    }

    private boolean a(HealthWorkout healthWorkout) {
        return healthWorkout.getType() == 1000625;
    }

    private boolean e(HealthWorkout healthWorkout) {
        return healthWorkout.getType() == 1000622;
    }

    private boolean d(HealthWorkout healthWorkout) {
        return healthWorkout.getType() == 1000623;
    }
}
