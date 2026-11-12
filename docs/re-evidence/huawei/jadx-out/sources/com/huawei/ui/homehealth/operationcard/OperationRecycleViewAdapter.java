package com.huawei.ui.homehealth.operationcard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceContentBase;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.health.marketing.datatype.templates.CornerTemplate;
import com.huawei.health.marketing.datatype.templates.DailyRecommendTemplate;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.utils.Constants;
import com.huawei.operation.utils.OperationUtils;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homehealth.R;
import defpackage.fxk;
import defpackage.fxl;
import defpackage.fya;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.njy;
import defpackage.oru;
import defpackage.qji;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class OperationRecycleViewAdapter extends RecyclerView.Adapter<OperationRecycleHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f25676a = System.currentTimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f25677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<MessageObject> f25678c;
    private int d;

    public OperationRecycleViewAdapter(Context context, List<MessageObject> list) {
        this.f25677b = context;
        this.f25678c = list;
    }

    public void c(int i) {
        this.d = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public OperationRecycleHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new OperationRecycleHolder(LayoutInflater.from(this.f25677b).inflate(R.layout.item_operation_card, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(OperationRecycleHolder operationRecycleHolder, int i) {
        LogUtil.d("OperationRecycleViewAdapter", "绘制界面：", Integer.valueOf(i));
        List<MessageObject> list = this.f25678c;
        if (list == null || i >= list.size() || this.f25678c.get(i) == null) {
            return;
        }
        b(operationRecycleHolder, i);
        a(operationRecycleHolder, i);
    }

    private void a(OperationRecycleHolder operationRecycleHolder, int i) {
        if (njy.e(this.f25678c, i)) {
            LogUtil.j("OperationRecycleViewAdapter", "click mList is out of bounds. position = ", Integer.valueOf(i));
            return;
        }
        MessageObject messageObject = this.f25678c.get(i);
        if (messageObject == null) {
            LogUtil.j("OperationRecycleViewAdapter", "click messageObject is null.");
            return;
        }
        Activity activity = BaseApplication.getActivity();
        BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
        if (baseActivity != null) {
            operationRecycleHolder.itemView.setOnClickListener(qji.b(b(messageObject, operationRecycleHolder), baseActivity, LoginInit.getInstance(this.f25677b).isBrowseMode() && fxk.b(messageObject.getDetailUri()), AnalyticsValue.HEALTH_HOME_OPERATION_CARD_DATA_2010085.value()));
        } else {
            operationRecycleHolder.itemView.setOnClickListener(b(messageObject, operationRecycleHolder));
        }
    }

    private View.OnClickListener b(MessageObject messageObject, OperationRecycleHolder operationRecycleHolder) {
        return new c(this, messageObject, operationRecycleHolder);
    }

    static class c implements View.OnClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<OperationRecycleViewAdapter> f25682c;
        private MessageObject d;
        private WeakReference<OperationRecycleHolder> e;

        public c(OperationRecycleViewAdapter operationRecycleViewAdapter, MessageObject messageObject, OperationRecycleHolder operationRecycleHolder) {
            this.f25682c = new WeakReference<>(operationRecycleViewAdapter);
            this.d = messageObject;
            this.e = new WeakReference<>(operationRecycleHolder);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            final OperationRecycleViewAdapter operationRecycleViewAdapter = this.f25682c.get();
            if (operationRecycleViewAdapter == null) {
                LogUtil.j("OperationRecycleViewAdapter", "ViewOnClickListener adapter is null");
                return;
            }
            OperationRecycleHolder operationRecycleHolder = this.e.get();
            if (operationRecycleHolder != null) {
                e(operationRecycleHolder, this.d);
            }
            final String detailUri = this.d.getDetailUri();
            if (!Utils.o() || OperationUtils.switchToMarketingTwo()) {
                operationRecycleViewAdapter.e(this.d, 2);
                operationRecycleViewAdapter.a(fxl.d(detailUri, this.d.getCategory()), this.d);
                LogUtil.a("OperationRecycleViewAdapter", "is marking 2.0");
            } else {
                operationRecycleViewAdapter.b(this.d);
                if (TextUtils.isEmpty(detailUri)) {
                    return;
                }
                GRSManager.c(BaseApplication.getContext()).d("messageCenterUrl", new GrsQueryCallback() { // from class: com.huawei.ui.homehealth.operationcard.OperationRecycleViewAdapter.c.4
                    @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                    public void onCallBackSuccess(String str) {
                        LogUtil.d("OperationRecycleViewAdapter", "GRSManager onCallBackSuccess url = ", str);
                        operationRecycleViewAdapter.e(operationRecycleViewAdapter.c(detailUri, str + "/messageH5/html/launchFitness.html?url="), detailUri);
                    }

                    @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                    public void onCallBackFail(int i) {
                        LogUtil.d("OperationRecycleViewAdapter", "GRSManager onCallBackFail code = ", Integer.valueOf(i));
                        operationRecycleViewAdapter.e(detailUri);
                    }
                });
            }
        }

        private void e(OperationRecycleHolder operationRecycleHolder, MessageObject messageObject) {
            Drawable drawable = operationRecycleHolder.f25680b.getDrawable();
            if ((drawable == null || (drawable instanceof NinePatchDrawable)) && CommonUtil.ab((Context) null)) {
                LogUtil.a("OperationRecycleViewAdapter", "has no resource, reload");
                String imgBigUri = messageObject.getImgBigUri();
                if (TextUtils.isEmpty(imgBigUri)) {
                    imgBigUri = messageObject.getImgUri();
                }
                qqf.b(operationRecycleHolder.f25680b, imgBigUri, qqf.d, 3, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MessageObject messageObject) {
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("msgId", messageObject.getMsgId());
        map.put(com.huawei.health.messagecenter.model.CommonUtil.MSG_TITLE, messageObject.getMsgTitle());
        lmf.d().c(this.f25677b, AnalyticsValue.HEALTH_HOME_OPERATION_CARD_DATA_2010085.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(MessageObject messageObject, int i) {
        if (messageObject == null) {
            LogUtil.j("OperationRecycleViewAdapter", "biEvent messageObject is null");
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
            map.put("durationTime", Long.valueOf(System.currentTimeMillis() - this.f25676a));
            this.f25676a = System.currentTimeMillis();
        }
        if (messageObject.getResBriefInfo() != null) {
            map.put("algId", "");
            map.put("smartRecommend", Boolean.valueOf(messageObject.getResBriefInfo().getSmartRecommend()));
        }
        lmf.d().c(this.f25677b, AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MessageObject messageObject) {
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            marketRouterApi.router(d(str, messageObject));
        }
    }

    private String d(String str, MessageObject messageObject) {
        if (str.contains("?")) {
            return str + "&pullfrom=1001&resourceName=" + messageObject.getMsgFrom() + "&resourceId=" + messageObject.getMsgId() + "&pullOrder=1&algId=&itemId=" + messageObject.getMsgId();
        }
        return str + "?pullfrom=1001?resourceName=" + messageObject.getMsgTitle() + "?resourceId=" + messageObject.getMsgId() + "?pullOrder=1?algId=?itemId=" + messageObject.getMsgId();
    }

    private void b(OperationRecycleHolder operationRecycleHolder, int i) {
        MessageObject messageObject = this.f25678c.get(i);
        if (operationRecycleHolder == null || messageObject == null) {
            return;
        }
        e(messageObject, 1);
        String imgBigUri = messageObject.getImgBigUri();
        if (TextUtils.isEmpty(imgBigUri)) {
            imgBigUri = messageObject.getImgUri();
        }
        String msgTitle = messageObject.getMsgTitle();
        String msgContent = messageObject.getMsgContent();
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        if (!TextUtils.isEmpty(imgBigUri)) {
            int dimension = (int) ((((this.f25677b.getResources().getDisplayMetrics().widthPixels - this.f25677b.getResources().getDimension(R.dimen.defaultPaddingStart)) - this.f25677b.getResources().getDimension(R.dimen.defaultPaddingEnd)) - ((Integer) safeRegionWidth.first).intValue()) - ((Integer) safeRegionWidth.second).intValue());
            if (this.d >= 2) {
                dimension = (qrs.i(this.f25677b) - ((this.f25677b.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart) * 2) + qqp.b(this.f25677b))) / 2;
            }
            int i2 = (dimension * 9) / 21;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimension, i2);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dimension, i2);
            int dimension2 = (int) this.f25677b.getResources().getDimension(R.dimen.cardMarginMiddle);
            int dimension3 = (int) this.f25677b.getResources().getDimension(R.dimen.defaultPaddingBottomFixed);
            if (this.f25678c.size() == 1 || (this.f25678c.size() == 2 && qrs.af(this.f25677b))) {
                layoutParams2.setMargins(0, 0, 0, dimension3);
            } else if (i == 0 || (qrs.af(this.f25677b) && i == 1)) {
                layoutParams2.setMargins(0, 0, 0, dimension2 / 2);
            } else {
                int i3 = dimension2 / 2;
                layoutParams2.setMargins(0, i3, 0, i3);
            }
            operationRecycleHolder.f25680b.setLayoutParams(layoutParams);
            operationRecycleHolder.e.setLayoutParams(layoutParams2);
            qqf.b(operationRecycleHolder.f25680b, imgBigUri, qqf.d, 3, 0);
        }
        c(msgContent, operationRecycleHolder, msgTitle);
        c(operationRecycleHolder, messageObject);
        d(operationRecycleHolder, messageObject);
    }

    private void d(OperationRecycleHolder operationRecycleHolder, MessageObject messageObject) {
        if (operationRecycleHolder == null || messageObject == null) {
            ReleaseLogUtil.e("OperationRecycleViewAdapter", "setAccessibility holder ", operationRecycleHolder, " message ", messageObject);
            return;
        }
        CharSequence text = operationRecycleHolder.f25679a.getText();
        CharSequence text2 = operationRecycleHolder.f25681c.getText();
        CharSequence charSequenceA = a(operationRecycleHolder);
        if (TextUtils.isEmpty(charSequenceA)) {
            charSequenceA = c(messageObject);
        }
        if (!TextUtils.isEmpty(text) && !TextUtils.isEmpty(text2)) {
            charSequenceA = qre.a(R.string.accessibility_status_theme_description_join, text, charSequenceA, text2);
        } else if (!TextUtils.isEmpty(text)) {
            charSequenceA = qre.a(R.string.accessibility_status_theme_description, text, charSequenceA);
        } else if (!TextUtils.isEmpty(text2)) {
            charSequenceA = qre.a(R.string.accessibility_theme_description_join, charSequenceA, text2);
        }
        lrd.a(operationRecycleHolder.h, charSequenceA, (Class<?>) ImageView.class);
    }

    private CharSequence a(OperationRecycleHolder operationRecycleHolder) {
        if (operationRecycleHolder == null) {
            ReleaseLogUtil.e("OperationRecycleViewAdapter", "getViewContentDescription holder is null");
            return "";
        }
        CharSequence text = operationRecycleHolder.g.getText();
        CharSequence text2 = operationRecycleHolder.d.getText();
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

    private CharSequence c(MessageObject messageObject) {
        if (messageObject == null) {
            ReleaseLogUtil.e("OperationRecycleViewAdapter", "getMessageContentDescription messageObject is null");
            return "";
        }
        ResourceBriefInfo resBriefInfo = messageObject.getResBriefInfo();
        if (resBriefInfo == null) {
            ReleaseLogUtil.e("OperationRecycleViewAdapter", "getMessageContentDescription resourceBriefInfo is null");
            return "";
        }
        ResourceContentBase content = resBriefInfo.getContent();
        if (content == null) {
            ReleaseLogUtil.e("OperationRecycleViewAdapter", "getMessageContentDescription resourceContentBase is null");
            return "";
        }
        String content2 = content.getContent();
        if (TextUtils.isEmpty(content2)) {
            ReleaseLogUtil.e("OperationRecycleViewAdapter", "getMessageContentDescription content ", content2);
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
            ReleaseLogUtil.e("OperationRecycleViewAdapter", "getMessageContentDescription theme ", strTrim, " description ", strTrim2);
            return "";
        } catch (JSONException e) {
            ReleaseLogUtil.a("OperationRecycleViewAdapter", "getMessageContentDescription exception ", ExceptionUtils.c(e));
            return "";
        }
    }

    private void c(String str, OperationRecycleHolder operationRecycleHolder, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            operationRecycleHolder.g.setText(str2);
        } else {
            operationRecycleHolder.g.setText("");
        }
        if (!TextUtils.isEmpty(str)) {
            operationRecycleHolder.d.setVisibility(0);
            operationRecycleHolder.d.setText(str);
        } else {
            operationRecycleHolder.d.setVisibility(8);
        }
    }

    private void c(OperationRecycleHolder operationRecycleHolder, MessageObject messageObject) {
        LogUtil.a("OperationRecycleViewAdapter", "initOtherField");
        DailyRecommendTemplate dailyRecommendTemplateC = OperationCardData.c(messageObject.getResBriefInfo());
        if (dailyRecommendTemplateC == null) {
            return;
        }
        e(operationRecycleHolder.f25679a, dailyRecommendTemplateC);
        c(operationRecycleHolder.f25681c, dailyRecommendTemplateC, messageObject);
    }

    private void c(HealthTextView healthTextView, DailyRecommendTemplate dailyRecommendTemplate, MessageObject messageObject) {
        String strE;
        if (healthTextView == null) {
            ReleaseLogUtil.a("OperationRecycleViewAdapter", "activityJoinNumTextView = null");
            return;
        }
        int activityJoinNum = messageObject.getActivityJoinNum();
        if (TextUtils.equals(messageObject.getCategory(), SingleDailyMomentContent.ACTIVITY_TYPE) && !TextUtils.isEmpty(dailyRecommendTemplate.getDynamicDataId()) && activityJoinNum > 0) {
            String string = Integer.toString(activityJoinNum);
            try {
                strE = UnitUtil.e(activityJoinNum, 1, 0);
                try {
                    string = BaseApplication.getContext().getResources().getQuantityString(com.huawei.health.servicesui.R.plurals.IDS_person_join, activityJoinNum, strE);
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.a("OperationRecycleViewAdapter", "setJoinNumberOrReadCount failed, cause exception = ", e.getMessage(), ", cause = ", e.getCause(), ", numberOfPeople = ", strE, ", numOfPeople = ", Integer.valueOf(activityJoinNum));
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

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, String str2) {
        str.hashCode();
        if (str.equals(Constants.SUFFIX_HTML)) {
            e(str2);
        } else if (str.equals("medal")) {
            oru.a(this.f25677b).h(this.f25677b);
        } else {
            e(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        Intent intent = new Intent(this.f25677b, (Class<?>) WebViewActivity.class);
        intent.putExtra("url", str);
        this.f25677b.startActivity(intent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<MessageObject> list = this.f25678c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(String str, String str2) {
        String queryParameter;
        if (!TextUtils.isEmpty(str) && str.startsWith(str2)) {
            queryParameter = Uri.parse(str.replace(str2, "")).getQueryParameter("type");
        } else {
            queryParameter = Constants.SUFFIX_HTML;
        }
        LogUtil.d("OperationRecycleViewAdapter", "跳转类型：", queryParameter);
        return queryParameter;
    }

    public static class OperationRecycleHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f25679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImageView f25680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f25681c;
        private HealthTextView d;
        private HealthCardView e;
        private HealthTextView g;
        private View h;

        public OperationRecycleHolder(View view) {
            super(view);
            this.h = view.findViewById(R.id.operation_layout);
            this.g = (HealthTextView) view.findViewById(R.id.operation_title_tv);
            this.d = (HealthTextView) view.findViewById(R.id.operation_context_tv);
            this.f25679a = (HealthTextView) view.findViewById(R.id.operation_corner);
            this.f25681c = (HealthTextView) view.findViewById(R.id.operation_join_num);
            this.e = (HealthCardView) view.findViewById(R.id.operation_img_layout);
            this.f25680b = (ImageView) view.findViewById(R.id.operation_img);
        }
    }
}
