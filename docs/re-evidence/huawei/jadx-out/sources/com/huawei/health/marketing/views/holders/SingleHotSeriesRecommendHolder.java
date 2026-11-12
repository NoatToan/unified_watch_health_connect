package com.huawei.health.marketing.views.holders;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleHotSeriesRecommendContent;
import com.huawei.health.marketing.request.ActivityInfoListFactory;
import com.huawei.health.marketing.request.RespSleepAudioInfo;
import com.huawei.health.marketing.request.SleepAudioInfo;
import com.huawei.health.marketing.request.SleepAudioInfoApi;
import com.huawei.health.marketing.request.SleepAudioInfoReq;
import com.huawei.health.marketing.views.ColumnLinearLayout;
import com.huawei.health.servicesui.R;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.api.VipCallback;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.pluginfitnessadvice.WorkoutPackageInfo;
import com.huawei.pluginfitnessadvice.audio.SleepAudioPackage;
import com.huawei.pluginfitnessadvice.audio.SleepAudioSeries;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.fxl;
import defpackage.gzj;
import defpackage.gzl;
import defpackage.irz;
import defpackage.lmf;
import defpackage.njy;
import defpackage.oet;
import defpackage.ofe;
import defpackage.pea;
import defpackage.qqf;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.Services;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SingleHotSeriesRecommendHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f8484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f8485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f8486c;
    private boolean d;
    private ImageView e;
    private HealthTextView f;
    private HealthTextView g;
    private HealthTextView h;
    private HealthButton i;
    private HealthTextView j;
    private HealthTextView k;
    private HealthTextView l;
    private HealthTextView m;
    private HealthTextView n;
    private HealthTextView o;
    private Handler p;
    private int q;
    private ResourceBriefInfo r;
    private int s;
    private HealthTextView t;
    private long y;

    public SingleHotSeriesRecommendHolder(Context context, View view, ResourceBriefInfo resourceBriefInfo, int i) {
        super(view);
        this.d = false;
        this.p = new Handler(Looper.getMainLooper()) { // from class: com.huawei.health.marketing.views.holders.SingleHotSeriesRecommendHolder.4
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message == null) {
                    return;
                }
                super.handleMessage(message);
                if (message.what == 101 && (message.obj instanceof SingleHotSeriesRecommendContent)) {
                    SingleHotSeriesRecommendContent singleHotSeriesRecommendContent = (SingleHotSeriesRecommendContent) message.obj;
                    SingleHotSeriesRecommendHolder.this.s(singleHotSeriesRecommendContent);
                    SingleHotSeriesRecommendHolder.this.b(singleHotSeriesRecommendContent, false);
                }
                if (message.what == 102 && (message.obj instanceof SingleHotSeriesRecommendContent)) {
                    SingleHotSeriesRecommendContent singleHotSeriesRecommendContent2 = (SingleHotSeriesRecommendContent) message.obj;
                    SingleHotSeriesRecommendHolder.this.n.setVisibility(8);
                    SingleHotSeriesRecommendHolder.this.b(singleHotSeriesRecommendContent2, true);
                }
            }
        };
        if (view == null) {
            LogUtil.j("SingleHotSeriesRecommendHolder", "getOneGridBigHolder() itemView is null.");
            return;
        }
        this.f8484a = context;
        this.q = i;
        this.r = resourceBriefInfo;
        this.f8486c = (ImageView) view.findViewById(R.id.course_item_bg_img);
        this.e = (ImageView) view.findViewById(R.id.course_item_bleed_img);
        this.k = (HealthTextView) view.findViewById(R.id.item_courses_theme);
        this.g = (HealthTextView) view.findViewById(R.id.item_courses_flag);
        this.f8485b = (HealthTextView) view.findViewById(R.id.item_courses_description);
        this.m = (HealthTextView) view.findViewById(R.id.item_courses_more);
        this.h = (HealthTextView) view.findViewById(R.id.item_courses_detail);
        this.t = (HealthTextView) view.findViewById(R.id.item_courses_title);
        this.f = (HealthTextView) view.findViewById(R.id.item_courses_first_num);
        this.j = (HealthTextView) view.findViewById(R.id.item_courses_first_desc);
        this.o = (HealthTextView) view.findViewById(R.id.item_courses_second_num);
        this.l = (HealthTextView) view.findViewById(R.id.item_courses_second_desc);
        this.n = (HealthTextView) view.findViewById(R.id.item_courses_preview_link);
        this.i = (HealthButton) view.findViewById(R.id.item_courses_experience);
    }

    public void b(final SingleHotSeriesRecommendContent singleHotSeriesRecommendContent, int i) {
        this.y = System.currentTimeMillis();
        this.s = i;
        qqf.a(singleHotSeriesRecommendContent.getBackgroundPicture(), this.f8486c, qqf.d);
        qqf.d(singleHotSeriesRecommendContent.getPicture(), this.e);
        if (singleHotSeriesRecommendContent.isThemeVisibility()) {
            this.k.setText(singleHotSeriesRecommendContent.getTheme());
            this.k.setVisibility(0);
        } else {
            this.k.setVisibility(8);
        }
        p(singleHotSeriesRecommendContent);
        q(singleHotSeriesRecommendContent);
        if (singleHotSeriesRecommendContent.isDetailVisibility()) {
            this.h.setText(singleHotSeriesRecommendContent.getDetail());
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
        if (TextUtils.isEmpty(singleHotSeriesRecommendContent.getTitle())) {
            this.t.setVisibility(8);
        } else {
            this.t.setVisibility(0);
            this.t.setText(singleHotSeriesRecommendContent.getTitle());
        }
        this.f.setText(singleHotSeriesRecommendContent.getDataOne());
        this.j.setText(singleHotSeriesRecommendContent.getDataOneDescription());
        this.o.setText(singleHotSeriesRecommendContent.getDataTwo());
        this.l.setText(singleHotSeriesRecommendContent.getDataTwoDescription());
        this.n.setVisibility(8);
        this.i.setVisibility(8);
        h(singleHotSeriesRecommendContent);
        this.p.postDelayed(new Runnable() { // from class: gbz
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c(singleHotSeriesRecommendContent);
            }
        }, 100L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    private void h(SingleHotSeriesRecommendContent singleHotSeriesRecommendContent) {
        byte b2;
        String itemCategory = singleHotSeriesRecommendContent.getItemCategory();
        if (TextUtils.isEmpty(itemCategory)) {
            s(singleHotSeriesRecommendContent);
            b(singleHotSeriesRecommendContent, false);
            return;
        }
        itemCategory.hashCode();
        switch (itemCategory) {
            case "WorkoutPackage":
                b2 = 0;
                break;
            case "SleepingSeries":
                b2 = 1;
                break;
            case "SleepAudio":
                b2 = 2;
                break;
            case "Course":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            a(singleHotSeriesRecommendContent);
            return;
        }
        if (b2 == 1) {
            d(singleHotSeriesRecommendContent);
            return;
        }
        if (b2 == 2) {
            e(singleHotSeriesRecommendContent);
        } else if (b2 == 3) {
            b(singleHotSeriesRecommendContent);
        } else {
            s(singleHotSeriesRecommendContent);
            b(singleHotSeriesRecommendContent, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void a(final SingleHotSeriesRecommendContent singleHotSeriesRecommendContent) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: gce
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.a(singleHotSeriesRecommendContent);
                }
            });
            return;
        }
        LogUtil.a("SingleHotSeriesRecommendHolder", "enter queryWorkoutPackageById id :", singleHotSeriesRecommendContent.getDynamicDataId());
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("SingleHotSeriesRecommendHolder", "queryWorkoutPackageById : courseApi is null.");
            a(singleHotSeriesRecommendContent, false);
        } else {
            courseApi.getWorkoutPackageById(new gzj.c(singleHotSeriesRecommendContent.getDynamicDataId()).c(), new UiCallback<WorkoutPackageInfo>() { // from class: com.huawei.health.marketing.views.holders.SingleHotSeriesRecommendHolder.2
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("SingleHotSeriesRecommendHolder", "queryWorkoutPackageById onFailure err:", Integer.valueOf(i));
                    SingleHotSeriesRecommendHolder.this.a(singleHotSeriesRecommendContent, false);
                }

                /* JADX WARN: Code duplicated, block: B:12:0x002e  */
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(WorkoutPackageInfo workoutPackageInfo) {
                    boolean z;
                    LogUtil.a("SingleHotSeriesRecommendHolder", "queryWorkoutPackageById onSuccess");
                    if (workoutPackageInfo == null || workoutPackageInfo.getCommodityFlag().intValue() != 2) {
                        if (workoutPackageInfo != null) {
                            z = workoutPackageInfo.getTransactionStatus().intValue() == 1;
                        }
                        SingleHotSeriesRecommendHolder.this.a(singleHotSeriesRecommendContent, z);
                        return;
                    }
                    SingleHotSeriesRecommendHolder.this.m(singleHotSeriesRecommendContent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void e(final SingleHotSeriesRecommendContent singleHotSeriesRecommendContent) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: gcd
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.e(singleHotSeriesRecommendContent);
                }
            });
            return;
        }
        String dynamicDataId = singleHotSeriesRecommendContent.getDynamicDataId();
        LogUtil.a("SingleHotSeriesRecommendHolder", "enter querySleepAudioById id:", dynamicDataId);
        SleepAudioInfoReq sleepAudioInfoReq = new SleepAudioInfoReq();
        sleepAudioInfoReq.setIds(dynamicDataId);
        sleepAudioInfoReq.setPageNo("1");
        sleepAudioInfoReq.setPageSize("100");
        SleepAudioInfoApi sleepAudioInfoApi = (SleepAudioInfoApi) oet.d().e(SleepAudioInfoApi.class);
        ActivityInfoListFactory activityInfoListFactory = new ActivityInfoListFactory(BaseApplication.getContext());
        Map<String, Object> body = activityInfoListFactory.getBody(sleepAudioInfoReq);
        body.put(CloudParamKeys.CLIENT_TYPE, fxl.d());
        try {
            Response<RespSleepAudioInfo> responseExecute = sleepAudioInfoApi.getSleepAudioList(sleepAudioInfoReq.getUrl(), activityInfoListFactory.getHeaders(), ofe.c(body)).execute();
            if (!responseExecute.isOK()) {
                a(singleHotSeriesRecommendContent, false);
                return;
            }
            boolean z = true;
            LogUtil.a("SingleHotSeriesRecommendHolder", "requestSleepAudioData response is OK.");
            RespSleepAudioInfo body2 = responseExecute.getBody();
            if (body2 != null && body2.getResultCode() == 0 && !njy.e(body2.getSleepAudios()) && body2.getSleepAudios().get(0) != null) {
                SleepAudioInfo sleepAudioInfo = body2.getSleepAudios().get(0);
                if (sleepAudioInfo.getIsVip() == 1) {
                    m(singleHotSeriesRecommendContent);
                    return;
                }
                if (sleepAudioInfo.getPurchasedStatus() != 1) {
                    z = false;
                }
                a(singleHotSeriesRecommendContent, z);
                return;
            }
            LogUtil.j("SingleHotSeriesRecommendHolder", "requestSleepAudioData result is null or error");
            a(singleHotSeriesRecommendContent, false);
        } catch (IOException | NumberFormatException unused) {
            LogUtil.e("SingleHotSeriesRecommendHolder", "requestSleepAudioData exception.");
            a(singleHotSeriesRecommendContent, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(final SingleHotSeriesRecommendContent singleHotSeriesRecommendContent) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: gca
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34880c.d(singleHotSeriesRecommendContent);
                }
            });
            return;
        }
        String dynamicDataId = singleHotSeriesRecommendContent.getDynamicDataId();
        LogUtil.a("SingleHotSeriesRecommendHolder", "enter querySleepSeriesById id:", dynamicDataId);
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("SingleHotSeriesRecommendHolder", "requestRelativeCourse : courseApi is null.");
            a(singleHotSeriesRecommendContent, false);
        } else {
            courseApi.queryAudiosPackageBySeriesId(dynamicDataId, new UiCallback<List<SleepAudioPackage>>() { // from class: com.huawei.health.marketing.views.holders.SingleHotSeriesRecommendHolder.1
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("SingleHotSeriesRecommendHolder", "querySleepSeriesById fail, errorCode： ", Integer.valueOf(i), ", errorInfo: ", str);
                    SingleHotSeriesRecommendHolder.this.a(singleHotSeriesRecommendContent, false);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<SleepAudioPackage> list) {
                    if (njy.e(list) || list.get(0) == null || list.get(0).getSleepAudioSeries() == null) {
                        LogUtil.j("SingleHotSeriesRecommendHolder", "querySleepSeriesById data is empty");
                        SingleHotSeriesRecommendHolder.this.a(singleHotSeriesRecommendContent, false);
                        return;
                    }
                    SleepAudioSeries sleepAudioSeries = list.get(0).getSleepAudioSeries();
                    if (sleepAudioSeries.getIsVip() == 1) {
                        SingleHotSeriesRecommendHolder.this.m(singleHotSeriesRecommendContent);
                    } else {
                        SingleHotSeriesRecommendHolder.this.a(singleHotSeriesRecommendContent, sleepAudioSeries.getPurchasedStatus() == 1);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void b(final SingleHotSeriesRecommendContent singleHotSeriesRecommendContent) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: gcc
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b(singleHotSeriesRecommendContent);
                }
            });
            return;
        }
        LogUtil.a("SingleHotSeriesRecommendHolder", "enter queryWorkoutById id :", singleHotSeriesRecommendContent.getDynamicDataId());
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("SingleHotSeriesRecommendHolder", "queryWorkoutById : courseApi is null.");
            a(singleHotSeriesRecommendContent, false);
        } else {
            courseApi.getCourseById(new gzl.a(singleHotSeriesRecommendContent.getDynamicDataId()).c(), new UiCallback<Workout>() { // from class: com.huawei.health.marketing.views.holders.SingleHotSeriesRecommendHolder.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("SingleHotSeriesRecommendHolder", "getCourseById onFailure err:", Integer.valueOf(i));
                    SingleHotSeriesRecommendHolder.this.a(singleHotSeriesRecommendContent, false);
                }

                /* JADX WARN: Code duplicated, block: B:12:0x002a  */
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Workout workout) {
                    boolean z;
                    LogUtil.a("SingleHotSeriesRecommendHolder", "getCourseById onSuccess");
                    FitWorkout fitWorkoutD = pea.d(workout);
                    if (fitWorkoutD == null || fitWorkoutD.acquireCommodityFlag() != 2) {
                        if (fitWorkoutD != null) {
                            z = fitWorkoutD.acquireAuthResult() == 1;
                        }
                        SingleHotSeriesRecommendHolder.this.a(singleHotSeriesRecommendContent, z);
                        return;
                    }
                    SingleHotSeriesRecommendHolder.this.m(singleHotSeriesRecommendContent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(final SingleHotSeriesRecommendContent singleHotSeriesRecommendContent) {
        ((VipApi) Services.b("vip", VipApi.class)).getVipInfo(new VipCallback() { // from class: com.huawei.health.marketing.views.holders.SingleHotSeriesRecommendHolder.3
            @Override // com.huawei.health.vip.api.VipCallback
            public void onSuccess(Object obj) {
                boolean z = false;
                if (obj instanceof UserMemberInfo) {
                    UserMemberInfo userMemberInfo = (UserMemberInfo) obj;
                    if (userMemberInfo.getMemberFlag() == 1 && !irz.d(userMemberInfo)) {
                        z = true;
                    }
                    LogUtil.a("SingleHotSeriesRecommendHolder", "getVipInfo isVip:", Boolean.valueOf(z));
                }
                SingleHotSeriesRecommendHolder.this.a(singleHotSeriesRecommendContent, z);
            }

            @Override // com.huawei.health.vip.api.VipCallback
            public void onFailure(int i, String str) {
                LogUtil.a("SingleHotSeriesRecommendHolder", "getVipInfo errCode:", Integer.valueOf(i));
                SingleHotSeriesRecommendHolder.this.a(singleHotSeriesRecommendContent, false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SingleHotSeriesRecommendContent singleHotSeriesRecommendContent, boolean z) {
        Message messageObtainMessage = this.p.obtainMessage();
        messageObtainMessage.what = z ? 102 : 101;
        messageObtainMessage.obj = singleHotSeriesRecommendContent;
        this.p.sendMessage(messageObtainMessage);
    }

    private void q(final SingleHotSeriesRecommendContent singleHotSeriesRecommendContent) {
        if (singleHotSeriesRecommendContent.isDescriptionVisibility()) {
            this.f8485b.setText(singleHotSeriesRecommendContent.getDescription());
            this.f8485b.setVisibility(0);
        } else {
            this.f8485b.setVisibility(8);
        }
        this.m.setVisibility(TextUtils.isEmpty(singleHotSeriesRecommendContent.getLink()) ? 8 : 0);
        this.m.setOnClickListener(new View.OnClickListener() { // from class: gci
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.a(singleHotSeriesRecommendContent, view);
            }
        });
        this.f8485b.setOnClickListener(new View.OnClickListener() { // from class: gcf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34887c.d(singleHotSeriesRecommendContent, view);
            }
        });
    }

    public /* synthetic */ void a(SingleHotSeriesRecommendContent singleHotSeriesRecommendContent, View view) {
        j(singleHotSeriesRecommendContent);
    }

    public /* synthetic */ void d(SingleHotSeriesRecommendContent singleHotSeriesRecommendContent, View view) {
        j(singleHotSeriesRecommendContent);
    }

    private void j(SingleHotSeriesRecommendContent singleHotSeriesRecommendContent) {
        String link = singleHotSeriesRecommendContent.getLink();
        if (TextUtils.isEmpty(link)) {
            LogUtil.j("SingleHotSeriesRecommendHolder", "detailClick linkUrl is empty, return");
            return;
        }
        LogUtil.a("SingleHotSeriesRecommendHolder", "detailClick");
        fxl.d(link, this.q, this.r);
        e(1, singleHotSeriesRecommendContent.getTheme());
    }

    private void p(SingleHotSeriesRecommendContent singleHotSeriesRecommendContent) {
        if (TextUtils.isEmpty(singleHotSeriesRecommendContent.getCorner())) {
            this.g.setVisibility(8);
            return;
        }
        int color = ContextCompat.getColor(BaseApplication.getContext(), R.color.common_white_80alpha);
        if (!TextUtils.isEmpty(singleHotSeriesRecommendContent.getCornerColor())) {
            color = Color.parseColor(singleHotSeriesRecommendContent.getCornerColor());
        }
        try {
            float fD = qrs.d(BaseApplication.getContext(), 4.0f);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(fD);
            gradientDrawable.setStroke(qrs.d(BaseApplication.getContext(), 1.0f), color);
            this.g.setBackground(gradientDrawable);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("SingleHotSeriesRecommendHolder", "IllegalArgumentException");
        }
        this.g.setTextColor(color);
        this.g.setText(singleHotSeriesRecommendContent.getCorner());
        this.g.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(final SingleHotSeriesRecommendContent singleHotSeriesRecommendContent) {
        if (TextUtils.isEmpty(singleHotSeriesRecommendContent.getLeftButtonDesc())) {
            this.n.setVisibility(8);
            return;
        }
        this.n.setText(singleHotSeriesRecommendContent.getLeftButtonDesc());
        this.n.setVisibility(0);
        this.n.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.marketing.views.holders.SingleHotSeriesRecommendHolder.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (TextUtils.isEmpty(singleHotSeriesRecommendContent.getLeftButtonLink())) {
                    LogUtil.j("SingleHotSeriesRecommendHolder", "attemptLink is empty, return");
                } else {
                    fxl.e(singleHotSeriesRecommendContent.getLeftButtonLink(), SingleHotSeriesRecommendHolder.this.q, SingleHotSeriesRecommendHolder.this.r, SingleHotSeriesRecommendHolder.this.s + 1);
                    SingleHotSeriesRecommendHolder.this.e(2, singleHotSeriesRecommendContent.getTheme());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final SingleHotSeriesRecommendContent singleHotSeriesRecommendContent, final boolean z) {
        int color = ContextCompat.getColor(BaseApplication.getContext(), R.color.common_colorAccent);
        if (!TextUtils.isEmpty(singleHotSeriesRecommendContent.getRightButtonColor())) {
            color = Color.parseColor(singleHotSeriesRecommendContent.getRightButtonColor());
        }
        try {
            float dimension = BaseApplication.getContext().getResources().getDimension(R.dimen.smallButtonCornerRadius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(color);
            this.i.setBackground(gradientDrawable);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("SingleHotSeriesRecommendHolder", "IllegalArgumentException");
        }
        this.i.setText(z ? singleHotSeriesRecommendContent.getRightButtonDescAfter() : singleHotSeriesRecommendContent.getRightButtonDescBefore());
        this.i.setVisibility(0);
        final String rightButtonLinkAfter = z ? singleHotSeriesRecommendContent.getRightButtonLinkAfter() : singleHotSeriesRecommendContent.getRightButtonLinkBefore();
        this.i.setOnClickListener(new View.OnClickListener() { // from class: gcb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34883c.b(rightButtonLinkAfter, z, singleHotSeriesRecommendContent, view);
            }
        });
    }

    public /* synthetic */ void b(String str, boolean z, SingleHotSeriesRecommendContent singleHotSeriesRecommendContent, View view) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SingleHotSeriesRecommendHolder", "Experience url is empty, return");
        } else {
            fxl.e(str, this.q, this.r, this.s + 1);
            e(z ? 4 : 3, singleHotSeriesRecommendContent.getTheme());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void c(SingleHotSeriesRecommendContent singleHotSeriesRecommendContent) {
        if (this.itemView == null || this.d) {
            return;
        }
        qsp.a(this.itemView, (ViewTreeObserver.OnGlobalLayoutListener) new d(this, singleHotSeriesRecommendContent));
        qsp.a(this.itemView, (ViewTreeObserver.OnScrollChangedListener) new d(this, singleHotSeriesRecommendContent));
    }

    static class d implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SingleHotSeriesRecommendContent f8493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<SingleHotSeriesRecommendHolder> f8494c;

        public d(SingleHotSeriesRecommendHolder singleHotSeriesRecommendHolder, SingleHotSeriesRecommendContent singleHotSeriesRecommendContent) {
            this.f8494c = new WeakReference<>(singleHotSeriesRecommendHolder);
            this.f8493b = singleHotSeriesRecommendContent;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            SingleHotSeriesRecommendHolder singleHotSeriesRecommendHolder = this.f8494c.get();
            if (singleHotSeriesRecommendHolder == null) {
                return;
            }
            if (!singleHotSeriesRecommendHolder.d) {
                singleHotSeriesRecommendHolder.f(this.f8493b);
            } else {
                qsp.b(singleHotSeriesRecommendHolder.itemView, this);
            }
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            SingleHotSeriesRecommendHolder singleHotSeriesRecommendHolder = this.f8494c.get();
            if (singleHotSeriesRecommendHolder == null) {
                return;
            }
            if (!singleHotSeriesRecommendHolder.d) {
                singleHotSeriesRecommendHolder.f(this.f8493b);
            } else {
                qsp.c(singleHotSeriesRecommendHolder.itemView, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(SingleHotSeriesRecommendContent singleHotSeriesRecommendContent) {
        if (this.itemView == null || this.itemView.getVisibility() != 0) {
            return;
        }
        int height = this.itemView.getHeight();
        int width = this.itemView.getWidth();
        Rect rect = new Rect();
        if (this.itemView.getLocalVisibleRect(rect) && ColumnLinearLayout.a(rect, height, width) && !this.d) {
            ResourceBriefInfo resourceBriefInfo = this.r;
            LogUtil.a("SingleHotSeriesRecommendHolder", "visible to user, resource name: ", resourceBriefInfo != null ? resourceBriefInfo.getResourceName() : null, ", positionId: ", Integer.valueOf(this.q), ", height: ", Integer.valueOf(height), ", width: ", Integer.valueOf(width), ", getLocalVisibleRect: ", Boolean.valueOf(this.itemView.getLocalVisibleRect(rect)));
            this.d = true;
            k(singleHotSeriesRecommendContent);
        }
    }

    private void k(SingleHotSeriesRecommendContent singleHotSeriesRecommendContent) {
        HashMap map = new HashMap(16);
        map.put("resourcePositionId", Integer.valueOf(this.q));
        map.put("event", 1);
        map.put("itemCardName", singleHotSeriesRecommendContent.getTheme());
        map.put("itemId", singleHotSeriesRecommendContent.getDynamicDataId());
        map.put("pullOrder", Integer.valueOf(this.s + 1));
        if (this.r != null) {
            map.put("algId", "");
            map.put("smartRecommend", Boolean.valueOf(this.r.getSmartRecommend()));
            map.put("resourceId", this.r.getResourceId());
            map.put("resourceName", this.r.getResourceName());
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        map.put("durationTime", Long.valueOf(jCurrentTimeMillis - this.y));
        this.y = jCurrentTimeMillis;
        lmf.d().c(this.f8484a, AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, String str) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("event", Integer.valueOf(i));
        map.put("name", str);
        lmf.d().c(this.f8484a, AnalyticsValue.HOT_SERIES_CLICK_EVENT_VALUE.value(), map, 0);
    }
}
