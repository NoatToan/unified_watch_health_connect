package com.huawei.health.knit.section.homesection;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceContentBase;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.health.marketing.datatype.templates.CornerTemplate;
import com.huawei.health.marketing.datatype.templates.DailyRecommendTemplate;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.OperationUtilsApi;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.fya;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.njy;
import defpackage.qji;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class SectionOperationCardAdapter extends RecyclerView.Adapter<SectionOperationRecycleHolder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f7510b;
    private int d;
    private Context e;
    private OnClickSectionListener f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<MessageObject> f7511c = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<DailyRecommendTemplate> f7509a = new ArrayList();

    public SectionOperationCardAdapter(Context context, List<MessageObject> list) {
        this.e = context;
        if (list != null) {
            this.f7511c.clear();
            this.f7511c.addAll(list);
        }
        this.f7510b = System.currentTimeMillis();
    }

    public void e(int i) {
        this.d = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SectionOperationRecycleHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SectionOperationRecycleHolder(LayoutInflater.from(this.e).inflate(R.layout.item_operation_card, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(SectionOperationRecycleHolder sectionOperationRecycleHolder, int i) {
        LogUtil.a("SectionOperationCardAdapter", "operation card onBindViewHolder：", Integer.valueOf(i));
        List<MessageObject> list = this.f7511c;
        if (list == null || i >= list.size() || this.f7511c.get(i) == null) {
            return;
        }
        b(sectionOperationRecycleHolder, i);
        a(sectionOperationRecycleHolder, i);
    }

    public void b(List<MessageObject> list) {
        if (list != null) {
            this.f7511c.clear();
            this.f7511c.addAll(list);
        }
    }

    public void d(List<DailyRecommendTemplate> list) {
        if (list != null) {
            this.f7509a.clear();
            this.f7509a.addAll(list);
        }
    }

    private void a(SectionOperationRecycleHolder sectionOperationRecycleHolder, int i) {
        if (njy.e(this.f7511c, i)) {
            LogUtil.j("SectionOperationCardAdapter", "click mList is out of bounds. position = ", Integer.valueOf(i));
            return;
        }
        MessageObject messageObject = this.f7511c.get(i);
        if (messageObject == null) {
            LogUtil.j("SectionOperationCardAdapter", "click messageObject is null.");
            return;
        }
        Activity activity = BaseApplication.getActivity();
        BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
        OperationUtilsApi operationUtilsApi = (OperationUtilsApi) Services.d("PluginOperation", OperationUtilsApi.class);
        if (baseActivity != null && operationUtilsApi != null) {
            sectionOperationRecycleHolder.itemView.setOnClickListener(qji.b(c(sectionOperationRecycleHolder, i), baseActivity, operationUtilsApi.isNotSupportBrowseUrl(messageObject.getDetailUri()), AnalyticsValue.HEALTH_HOME_OPERATION_CARD_DATA_2010085.value()));
        } else {
            sectionOperationRecycleHolder.itemView.setOnClickListener(c(sectionOperationRecycleHolder, i));
        }
    }

    private View.OnClickListener c(final SectionOperationRecycleHolder sectionOperationRecycleHolder, final int i) {
        return new View.OnClickListener() { // from class: fsa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34466b.e(sectionOperationRecycleHolder, i, view);
            }
        };
    }

    public /* synthetic */ void e(SectionOperationRecycleHolder sectionOperationRecycleHolder, int i, View view) {
        if (sectionOperationRecycleHolder != null) {
            d(sectionOperationRecycleHolder, this.f7511c.get(i));
        }
        OnClickSectionListener onClickSectionListener = this.f;
        if (onClickSectionListener != null) {
            onClickSectionListener.onClick(i);
        }
    }

    private void d(SectionOperationRecycleHolder sectionOperationRecycleHolder, MessageObject messageObject) {
        Drawable drawable = sectionOperationRecycleHolder.e.getDrawable();
        if ((drawable == null || (drawable instanceof NinePatchDrawable)) && CommonUtil.ab((Context) null)) {
            LogUtil.a("SectionOperationCardAdapter", "has no resource, reload");
            String imgBigUri = messageObject.getImgBigUri();
            if (TextUtils.isEmpty(imgBigUri)) {
                imgBigUri = messageObject.getImgUri();
            }
            qqf.b(sectionOperationRecycleHolder.e, imgBigUri, qqf.d, 3, 0);
        }
    }

    private void b(MessageObject messageObject, int i) {
        if (messageObject == null) {
            LogUtil.j("SectionOperationCardAdapter", "biEvent messageObject is null");
            return;
        }
        HashMap map = new HashMap();
        map.put("resourcePositionId", 1001);
        map.put("resourceId", messageObject.getMsgId());
        map.put("event", Integer.valueOf(i));
        map.put("resourceName", messageObject.getMsgFrom());
        map.put("itemCardName", messageObject.getMsgTitle());
        map.put("itemId", "");
        map.put("pullOrder", 1);
        if (i == 2) {
            map.put("durationTime", Long.valueOf(System.currentTimeMillis() - this.f7510b));
            this.f7510b = System.currentTimeMillis();
        }
        if (messageObject.getResBriefInfo() != null) {
            map.put("algId", "");
            map.put("smartRecommend", Boolean.valueOf(messageObject.getResBriefInfo().getSmartRecommend()));
        }
        lmf.d().c(this.e, AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
    }

    private void b(SectionOperationRecycleHolder sectionOperationRecycleHolder, int i) {
        MessageObject messageObject = this.f7511c.get(i);
        DailyRecommendTemplate dailyRecommendTemplate = this.f7509a.get(i);
        if (messageObject == null) {
            return;
        }
        b(messageObject, 1);
        String imgBigUri = messageObject.getImgBigUri();
        if (TextUtils.isEmpty(imgBigUri)) {
            imgBigUri = messageObject.getImgUri();
        }
        String msgTitle = messageObject.getMsgTitle();
        String msgContent = messageObject.getMsgContent();
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        if (!TextUtils.isEmpty(imgBigUri)) {
            int dimension = (int) ((((this.e.getResources().getDisplayMetrics().widthPixels - this.e.getResources().getDimension(R.dimen.defaultPaddingStart)) - this.e.getResources().getDimension(R.dimen.defaultPaddingEnd)) - ((Integer) safeRegionWidth.first).intValue()) - ((Integer) safeRegionWidth.second).intValue());
            if (qrs.af(this.e)) {
                dimension = (qrs.i(this.e) - ((this.e.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart) * 2) + qqp.b(this.e))) / 2;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dimension, (dimension * 9) / 21);
            int dimension2 = (int) this.e.getResources().getDimension(R.dimen.cardMarginMiddle);
            int dimension3 = (int) this.e.getResources().getDimension(R.dimen.defaultPaddingBottomFixed);
            if (this.f7511c.size() == 1 || (this.f7511c.size() == 2 && qrs.af(this.e))) {
                layoutParams.setMargins(0, 0, 0, dimension3);
            } else if (i == 0 || (qrs.af(this.e) && i == 1)) {
                layoutParams.setMargins(0, 0, 0, dimension2 / 2);
            } else {
                int i2 = dimension2 / 2;
                layoutParams.setMargins(0, i2, 0, i2);
            }
            sectionOperationRecycleHolder.e.setLayoutParams(layoutParams);
            qqf.b(sectionOperationRecycleHolder.e, imgBigUri, qqf.d, 3, 0);
        }
        b(msgContent, sectionOperationRecycleHolder, msgTitle);
        d(sectionOperationRecycleHolder, messageObject, dailyRecommendTemplate);
        c(sectionOperationRecycleHolder, messageObject);
    }

    private void c(SectionOperationRecycleHolder sectionOperationRecycleHolder, MessageObject messageObject) {
        if (sectionOperationRecycleHolder == null || messageObject == null) {
            ReleaseLogUtil.e("SectionOperationCardAdapter", "setAccessibility holder is null: ", Boolean.valueOf(sectionOperationRecycleHolder == null), " or message is null: ", Boolean.valueOf(messageObject == null));
            return;
        }
        CharSequence text = sectionOperationRecycleHolder.f7513b.getText();
        CharSequence text2 = sectionOperationRecycleHolder.f7512a.getText();
        CharSequence charSequenceB = b(sectionOperationRecycleHolder);
        if (TextUtils.isEmpty(charSequenceB)) {
            charSequenceB = b(messageObject);
        }
        if (!TextUtils.isEmpty(text) && !TextUtils.isEmpty(text2)) {
            charSequenceB = qre.a(R.string.accessibility_status_theme_description_join, text, charSequenceB, text2);
        } else if (!TextUtils.isEmpty(text)) {
            charSequenceB = qre.a(R.string.accessibility_status_theme_description, text, charSequenceB);
        } else if (!TextUtils.isEmpty(text2)) {
            charSequenceB = qre.a(R.string.accessibility_theme_description_join, charSequenceB, text2);
        }
        lrd.a(sectionOperationRecycleHolder.d, charSequenceB, (Class<?>) ImageView.class);
    }

    private CharSequence b(SectionOperationRecycleHolder sectionOperationRecycleHolder) {
        if (sectionOperationRecycleHolder == null) {
            ReleaseLogUtil.e("SectionOperationCardAdapter", "getViewContentDescription holder is null");
            return "";
        }
        CharSequence text = sectionOperationRecycleHolder.i.getText();
        CharSequence text2 = sectionOperationRecycleHolder.f7514c.getText();
        if (text != null) {
            text = String.valueOf(text).trim();
        }
        if (text2 != null) {
            text2 = String.valueOf(text2).trim();
        }
        if (!TextUtils.isEmpty(text) && !TextUtils.isEmpty(text2)) {
            return qre.a(R.string.accessibility_theme_description, text, text2);
        }
        if (TextUtils.isEmpty(text)) {
            return !TextUtils.isEmpty(text2) ? text2 : "";
        }
        return text;
    }

    private CharSequence b(MessageObject messageObject) {
        if (messageObject == null) {
            ReleaseLogUtil.e("SectionOperationCardAdapter", "getMessageContentDescription messageObject is null");
            return "";
        }
        ResourceBriefInfo resBriefInfo = messageObject.getResBriefInfo();
        if (resBriefInfo == null) {
            ReleaseLogUtil.e("SectionOperationCardAdapter", "getMessageContentDescription resourceBriefInfo is null");
            return "";
        }
        ResourceContentBase content = resBriefInfo.getContent();
        if (content == null) {
            ReleaseLogUtil.e("SectionOperationCardAdapter", "getMessageContentDescription resourceContentBase is null");
            return "";
        }
        String content2 = content.getContent();
        if (TextUtils.isEmpty(content2)) {
            ReleaseLogUtil.e("SectionOperationCardAdapter", "getMessageContentDescription content ", content2);
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(content2);
            String strTrim = jSONObject.optString("theme").trim();
            String strTrim2 = jSONObject.optString("description").trim();
            if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2)) {
                return qre.a(R.string.accessibility_theme_description, strTrim, strTrim2);
            }
            if (!TextUtils.isEmpty(strTrim)) {
                return strTrim;
            }
            if (!TextUtils.isEmpty(strTrim2)) {
                return strTrim2;
            }
            ReleaseLogUtil.e("SectionOperationCardAdapter", "getMessageContentDescription theme ", strTrim, " description ", strTrim2);
            return "";
        } catch (JSONException e) {
            ReleaseLogUtil.a("SectionOperationCardAdapter", "getMessageContentDescription exception ", ExceptionUtils.c(e));
            return "";
        }
    }

    private void b(String str, SectionOperationRecycleHolder sectionOperationRecycleHolder, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            sectionOperationRecycleHolder.i.setText(str2);
        } else {
            sectionOperationRecycleHolder.i.setText("");
        }
        if (!TextUtils.isEmpty(str)) {
            sectionOperationRecycleHolder.f7514c.setVisibility(0);
            sectionOperationRecycleHolder.f7514c.setText(str);
        } else {
            sectionOperationRecycleHolder.f7514c.setVisibility(8);
        }
    }

    private void d(SectionOperationRecycleHolder sectionOperationRecycleHolder, MessageObject messageObject, DailyRecommendTemplate dailyRecommendTemplate) {
        LogUtil.a("SectionOperationCardAdapter", "initOtherField");
        if (dailyRecommendTemplate == null) {
            return;
        }
        e(sectionOperationRecycleHolder.f7513b, dailyRecommendTemplate);
        a(sectionOperationRecycleHolder.f7512a, dailyRecommendTemplate, messageObject);
    }

    private void a(HealthTextView healthTextView, DailyRecommendTemplate dailyRecommendTemplate, MessageObject messageObject) {
        String strE;
        if (healthTextView == null) {
            ReleaseLogUtil.a("SectionOperationCardAdapter", "activityJoinNumTextView = null");
            return;
        }
        int activityJoinNum = messageObject.getActivityJoinNum();
        if (TextUtils.equals(messageObject.getCategory(), SingleDailyMomentContent.ACTIVITY_TYPE) && !TextUtils.isEmpty(dailyRecommendTemplate.getDynamicDataId()) && activityJoinNum > 0) {
            String string = Integer.toString(activityJoinNum);
            try {
                strE = UnitUtil.e(activityJoinNum, 1, 0);
                try {
                    string = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_person_join, activityJoinNum, strE);
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.a("SectionOperationCardAdapter", "setJoinNumberOrReadCount failed, cause exception = ", e.getMessage(), ", cause = ", e.getCause(), ", numberOfPeople = ", strE, ", numOfPeople = ", Integer.valueOf(activityJoinNum));
                }
            } catch (Exception e2) {
                e = e2;
                strE = "";
            }
            healthTextView.setText(string);
            healthTextView.setVisibility(0);
            return;
        }
        healthTextView.setVisibility(8);
    }

    private void e(HealthTextView healthTextView, DailyRecommendTemplate dailyRecommendTemplate) {
        if (healthTextView == null) {
            return;
        }
        fya.b(healthTextView, (CornerTemplate) dailyRecommendTemplate, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<MessageObject> list = this.f7511c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void b(OnClickSectionListener onClickSectionListener) {
        this.f = onClickSectionListener;
    }

    public static class SectionOperationRecycleHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f7512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f7513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f7514c;
        private View d;
        private ImageView e;
        private HealthTextView i;

        public SectionOperationRecycleHolder(View view) {
            super(view);
            this.d = view.findViewById(R.id.operation_layout);
            this.i = (HealthTextView) view.findViewById(R.id.operation_title_tv);
            this.f7514c = (HealthTextView) view.findViewById(R.id.operation_context_tv);
            this.f7513b = (HealthTextView) view.findViewById(R.id.operation_corner);
            this.f7512a = (HealthTextView) view.findViewById(R.id.operation_join_num);
            this.e = (ImageView) view.findViewById(R.id.operation_img);
        }
    }
}
