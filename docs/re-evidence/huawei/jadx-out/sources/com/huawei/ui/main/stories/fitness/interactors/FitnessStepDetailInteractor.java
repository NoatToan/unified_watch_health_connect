package com.huawei.ui.main.stories.fitness.interactors;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListenerEx;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.step.StepServiceCardAdapter;
import com.huawei.ui.main.stories.fitness.interactors.FitnessStepDetailInteractor;
import com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi;
import com.huawei.ui.openservice.OpenServiceUtil;
import com.huawei.ui.openservice.db.control.OpenServiceControl;
import com.huawei.ui.openservice.db.model.ChildService;
import com.huawei.ui.openservice.db.model.UserServiceAuth;
import defpackage.dlp;
import defpackage.iov;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qsp;
import defpackage.uie;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class FitnessStepDetailInteractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f27068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExecutorService f27069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f27070c;
    private View d;
    private String f;
    private ImageView h;
    private boolean i;
    private FrameLayout j;
    private HealthRecycleView k;
    private OpenServiceControl m;
    private List<ChildService> n;
    private StepServiceCardAdapter o;
    private HealthTextView p;
    private RelativeLayout q;
    private ImageView r;
    private HealthTextView t;
    private dlp l = null;
    private List<MessageObject> g = new ArrayList();
    private Handler e = new Handler() { // from class: com.huawei.ui.main.stories.fitness.interactors.FitnessStepDetailInteractor.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 10010) {
                return;
            }
            if (!njy.e(FitnessStepDetailInteractor.this.g)) {
                FitnessStepDetailInteractor.this.d.setVisibility(0);
                FitnessStepDetailInteractor.this.j.setVisibility(0);
                FitnessStepDetailInteractor.this.q.setVisibility(0);
                FitnessStepDetailInteractor.this.h.setVisibility(8);
                final MessageObject messageObject = (MessageObject) FitnessStepDetailInteractor.this.g.get(0);
                if (messageObject != null) {
                    FitnessStepDetailInteractor.this.p.setText(messageObject.getMsgTitle());
                    FitnessStepDetailInteractor.this.t.setText(uie.a(FitnessStepDetailInteractor.this.f27068a, messageObject.getCreateTime()));
                    qqf.b(FitnessStepDetailInteractor.this.r, messageObject.getImgUri(), (int) FitnessStepDetailInteractor.this.f27068a.getResources().getDimension(R.dimen.iconCornerRadius), 0, 0);
                    FitnessStepDetailInteractor.this.q.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.interactors.FitnessStepDetailInteractor.2.5
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            FitnessStepDetailInteractor.this.e(messageObject);
                        }
                    });
                    return;
                }
                LogUtil.e("SCUI_FitnessStepDetailInteractor", "firstMessageObject is null");
                return;
            }
            LogUtil.a("SCUI_FitnessStepDetailInteractor", "initStepDetailWalkInfo no message");
            FitnessStepDetailInteractor.this.d.setVisibility(8);
            FitnessStepDetailInteractor.this.j.setVisibility(8);
        }
    };
    private final OperationInteractorsApi s = (OperationInteractorsApi) Services.d("OperationBundle", OperationInteractorsApi.class);

    public FitnessStepDetailInteractor(Context context) {
        this.f27068a = context;
    }

    public void b(Activity activity, boolean z) {
        this.f27070c = activity;
        this.i = Utils.o();
        this.f27069b = Executors.newSingleThreadExecutor();
        if (this.i || !z) {
            return;
        }
        activity.findViewById(R.id.extension).setVisibility(0);
        c(activity);
        a(activity);
    }

    public void d() {
        Handler handler = this.e;
        if (handler != null) {
            handler.removeMessages(10010);
        }
        ExecutorService executorService = this.f27069b;
        if (executorService != null) {
            executorService.shutdownNow();
            this.f27069b = null;
        }
    }

    private void c(Activity activity) {
        this.d = qsp.a(activity, R.id.step_detail_walk_info_view_divider);
        this.j = (FrameLayout) qsp.a(activity, R.id.fl_step_detail_operation_and_walk_info);
        this.q = (RelativeLayout) qsp.a(activity, R.id.step_detail_walk_info_view);
        this.h = (ImageView) qsp.a(activity, R.id.step_detail_operation_info_view);
        this.p = (HealthTextView) qsp.a(activity, R.id.step_detail_walk_info_view_title);
        this.t = (HealthTextView) qsp.a(activity, R.id.step_detail_walk_info_view_time);
        this.r = (ImageView) qsp.a(activity, R.id.step_detail_walk_info_view_img);
        String strE = SharedPreferenceManager.e(this.f27068a, Integer.toString(10011), "OPERATION_ACTIVITY_STEP");
        LogUtil.a("SCUI_FitnessStepDetailInteractor", "initOperationAndWalkInfo activity1 = ", strE);
        try {
            if (!TextUtils.isEmpty(strE)) {
                this.l = this.s.expoundOperationActivity(new JSONObject(strE));
            }
        } catch (JSONException e2) {
            LogUtil.e("SCUI_FitnessStepDetailInteractor", "Json data error! JSONException:", e2.getMessage());
        }
        LogUtil.a("SCUI_FitnessStepDetailInteractor", "initOperationAndWalkInfo mOperationObject = ", this.l);
        dlp dlpVar = this.l;
        if (dlpVar != null && !d(dlpVar.o())) {
            c();
        } else {
            a();
        }
    }

    private void a() {
        ExecutorService executorService = this.f27069b;
        if (executorService != null) {
            executorService.execute(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.interactors.FitnessStepDetailInteractor.4
                @Override // java.lang.Runnable
                public void run() {
                    for (MessageObject messageObject : ((MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class)).getMessages(CommonUtil.WALK_INFO)) {
                        if (messageObject != null && !TextUtils.isEmpty(messageObject.getImgUri()) && !TextUtils.isEmpty(messageObject.getDetailUri())) {
                            FitnessStepDetailInteractor.this.g.add(messageObject);
                        }
                    }
                    LogUtil.a("SCUI_FitnessStepDetailInteractor", "initStepDetailWalkInfo mInfoMessageList size = ", Integer.valueOf(FitnessStepDetailInteractor.this.g.size()));
                    FitnessStepDetailInteractor.this.e.sendEmptyMessage(10010);
                }
            });
        }
    }

    private void c() {
        this.d.setVisibility(0);
        this.j.setVisibility(0);
        this.q.setVisibility(8);
        this.h.setVisibility(0);
        qqf.b(this.h, this.l.b(), (int) this.f27068a.getResources().getDimension(R.dimen.iconCornerRadius), 0, 0);
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.interactors.FitnessStepDetailInteractor.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GRSManager.c(FitnessStepDetailInteractor.this.f27068a).d("domainContentcenterDbankcdnNew", new GrsQueryCallback() { // from class: com.huawei.ui.main.stories.fitness.interactors.FitnessStepDetailInteractor.1.3
                    @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                    public void onCallBackSuccess(String str) {
                        LogUtil.d("SCUI_FitnessStepDetailInteractor", "GRSManager onCallBackSuccess ACTIVITY_KEY url = ", str);
                        if (FitnessStepDetailInteractor.this.s.judgeVersionSupport(FitnessStepDetailInteractor.this.l.f())) {
                            FitnessStepDetailInteractor.this.c(str, FitnessStepDetailInteractor.this.l);
                        } else {
                            FitnessStepDetailInteractor.this.b();
                        }
                    }

                    @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                    public void onCallBackFail(int i) {
                        LogUtil.d("SCUI_FitnessStepDetailInteractor", "GRSManager onCallBackFail ACTIVITY_KEY index = ", Integer.valueOf(i));
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        new NoTitleCustomAlertDialog.Builder(this.f27068a).a(this.f27068a.getResources().getString(R.string.IDS_hw_update_app_tips)).d(R.string.IDS_user_permission_know, R.color.common_text_red_color, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.interactors.FitnessStepDetailInteractor.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).c().show();
    }

    public void c(String str, dlp dlpVar) {
        if (dlpVar == null) {
            LogUtil.j("SCUI_FitnessStepDetailInteractor", "gotoOperationActivityDetail operationObject == null");
            return;
        }
        String operationActivityUrl = this.s.getOperationActivityUrl(str, dlpVar);
        Intent intent = new Intent(this.f27070c, (Class<?>) WebViewActivity.class);
        intent.putExtra("url", operationActivityUrl);
        intent.putExtra("EXTRA_BI_ID", dlpVar.d());
        intent.putExtra("EXTRA_BI_NAME", dlpVar.c());
        intent.putExtra("EXTRA_BI_SOURCE", "StepDetail");
        intent.putExtra("EXTRA_BI_SHOWTIME", "SHOW_TIME_BI");
        iov.d(this.f27070c, intent);
    }

    public void e(MessageObject messageObject) {
        if (messageObject == null) {
            LogUtil.j("SCUI_FitnessStepDetailInteractor", "gotoWalkInfoActivityDetail messageObject == null");
            return;
        }
        String msgId = messageObject.getMsgId();
        String detailUri = messageObject.getDetailUri();
        if (msgId == null || detailUri == null) {
            LogUtil.j("SCUI_FitnessStepDetailInteractor", "Information messageId||detailUrl is null");
            return;
        }
        Intent intent = new Intent(this.f27070c, (Class<?>) WebViewActivity.class);
        intent.putExtra("url", detailUri);
        intent.putExtra("type", "RecommendInfo");
        intent.putExtra("title", this.f27070c.getResources().getString(R.string.IDS_social_information));
        intent.putExtra("EXTRA_BI_ID", msgId);
        intent.putExtra("EXTRA_BI_NAME", messageObject.getMsgTitle());
        intent.putExtra("EXTRA_BI_SOURCE", "INFO");
        intent.putExtra("EXTRA_BI_SHOWTIME", "SHOW_TIME_BI");
        iov.d(this.f27070c, intent);
    }

    public boolean d(String str) {
        if (str == null) {
            LogUtil.j("SCUI_FitnessStepDetailInteractor", "isOperationActivityOver dateString == null");
            return true;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            long time = simpleDateFormat.parse(str).getTime();
            LogUtil.a("SCUI_FitnessStepDetailInteractor", "isOperationActivityOver activityEndTime =", Long.valueOf(time), "System.currentTimeMillis()=", Long.valueOf(System.currentTimeMillis()));
            return time <= System.currentTimeMillis();
        } catch (ParseException unused) {
            LogUtil.e("SCUI_FitnessStepDetailInteractor", "isOperationActivityOver ParseException");
            return false;
        }
    }

    private void c(ChildService childService) {
        UserServiceAuth userServiceAuth = new UserServiceAuth();
        userServiceAuth.configHuid(this.f);
        userServiceAuth.configServiceID(childService.getServiceID());
        userServiceAuth.configAuthType(1);
        this.m.insertOrUpdateUserAuth(userServiceAuth);
        Intent intent = new Intent(this.f27070c, (Class<?>) WebViewActivity.class);
        intent.putExtra("url", childService.getUrl());
        intent.putExtra("title", childService.getServiceName());
        intent.putExtra("EXTRA_BI_ID", childService.getServiceID());
        intent.putExtra("EXTRA_BI_NAME", childService.getServiceName());
        intent.putExtra("EXTRA_BI_SOURCE", "StepDetail");
        intent.putExtra("type", Constants.OPEN_SERVICE_TYPE);
        iov.d(this.f27070c, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ChildService childService) {
        UserServiceAuth userServiceAuthQueryServiceAuth = this.m.queryServiceAuth(this.f, childService.getServiceID());
        if (userServiceAuthQueryServiceAuth != null && userServiceAuthQueryServiceAuth.fetchAuthType() == 1) {
            Intent intent = new Intent(this.f27070c, (Class<?>) WebViewActivity.class);
            intent.putExtra("url", childService.getUrl());
            intent.putExtra("title", childService.getServiceName());
            intent.putExtra("EXTRA_BI_ID", childService.getServiceID());
            intent.putExtra("EXTRA_BI_NAME", childService.getServiceName());
            intent.putExtra("EXTRA_BI_SOURCE", "StepDetail");
            intent.putExtra("type", Constants.OPEN_SERVICE_TYPE);
            iov.d(this.f27070c, intent);
            return;
        }
        if (childService.getHmsAuth() != 2) {
            c(childService);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(Activity activity) {
        this.f = LoginInit.getInstance(this.f27070c).getUsetId();
        this.m = OpenServiceControl.getInstance(this.f27070c);
        HealthSubHeader healthSubHeader = (HealthSubHeader) activity.findViewById(R.id.step_detail_services);
        this.k = (HealthRecycleView) activity.findViewById(R.id.step_service_recycleview);
        this.k.setLayoutManager(new LinearLayoutManager(this.f27070c, 0, 0 == true ? 1 : 0) { // from class: com.huawei.ui.main.stories.fitness.interactors.FitnessStepDetailInteractor.5
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollHorizontally() {
                return true;
            }
        });
        BaseActivity.setViewSafeRegion(false, this.k);
        if (this.k.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.k.getLayoutParams();
            this.k.setPadding(0, 0, 0, 0);
            int marginStart = layoutParams.getMarginStart();
            layoutParams.setMarginEnd(layoutParams.getMarginEnd());
            layoutParams.setMarginStart(marginStart);
            this.k.setLayoutParams(layoutParams);
        }
        if (TextUtils.isEmpty(this.f)) {
            return;
        }
        List<ChildService> listQueryServiceByLocation = this.m.queryServiceByLocation(OpenServiceUtil.Location.STEP);
        this.n = listQueryServiceByLocation;
        if (njy.b(listQueryServiceByLocation)) {
            StepServiceCardAdapter stepServiceCardAdapter = new StepServiceCardAdapter(this.f27068a, this.n);
            this.o = stepServiceCardAdapter;
            stepServiceCardAdapter.d(new StepServiceCardAdapter.OnItemClickListener() { // from class: com.huawei.ui.main.stories.fitness.interactors.FitnessStepDetailInteractor.6
                @Override // com.huawei.ui.main.stories.fitness.activity.step.StepServiceCardAdapter.OnItemClickListener
                public void onItemClick(View view, int i) {
                    if (njy.e(FitnessStepDetailInteractor.this.n, i)) {
                        return;
                    }
                    FitnessStepDetailInteractor fitnessStepDetailInteractor = FitnessStepDetailInteractor.this;
                    fitnessStepDetailInteractor.a((ChildService) fitnessStepDetailInteractor.n.get(i));
                }
            });
            this.k.setHasFixedSize(true);
            this.k.setNestedScrollingEnabled(false);
            this.k.setAdapter(this.o);
            return;
        }
        healthSubHeader.setVisibility(8);
        this.k.setVisibility(8);
    }

    public void e(final int i, final Map<Integer, String> map, final Date date, final IBaseResponseCallback iBaseResponseCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: uiq
            @Override // java.lang.Runnable
            public final void run() {
                FitnessStepDetailInteractor.b(i, map, date, iBaseResponseCallback);
            }
        });
    }

    public static /* synthetic */ void b(int i, Map map, Date date, IBaseResponseCallback iBaseResponseCallback) {
        ArrayList arrayList = new ArrayList();
        int[] iArr = {i};
        for (Map.Entry entry : map.entrySet()) {
            String[] strArr = {"dayStepSum_" + entry.getKey()};
            HiAggregateOption hiAggregateOption = new HiAggregateOption();
            int iA = DateFormatUtil.a(date.getTime());
            hiAggregateOption.setTimeInterval(String.valueOf(iA), String.valueOf(iA), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
            hiAggregateOption.setType(iArr);
            hiAggregateOption.setGroupUnitType(3);
            hiAggregateOption.setAggregateType(1);
            hiAggregateOption.setSortOrder(1);
            hiAggregateOption.setConstantsKey(strArr);
            hiAggregateOption.setDeviceUuid((String) entry.getValue());
            hiAggregateOption.setReadType(2);
            arrayList.add(hiAggregateOption);
        }
        HiHealthManager.d(BaseApplication.b()).aggregateHiHealthDataEx(arrayList, new e(iBaseResponseCallback, map));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static class e implements HiAggregateListenerEx {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<Integer, String> f27076b;
        private final WeakReference<IBaseResponseCallback> d;

        private e(IBaseResponseCallback iBaseResponseCallback, Map<Integer, String> map) {
            this.d = new WeakReference<>(iBaseResponseCallback);
            this.f27076b = map;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
        public void onResult(SparseArray<List<HiHealthData>> sparseArray, int i, int i2) {
            LogUtil.a("SCUI_FitnessStepDetailInteractor", "getDayTotalStepDataById dataList is ", sparseArray);
            IBaseResponseCallback iBaseResponseCallback = this.d.get();
            if (iBaseResponseCallback == null || this.f27076b == null) {
                LogUtil.j("SCUI_FitnessStepDetailInteractor", "callback == null || deviceIdMap == null");
                return;
            }
            if (sparseArray == null) {
                LogUtil.j("SCUI_FitnessStepDetailInteractor", "getDayTotalStepDataById dataList is null");
                return;
            }
            if (sparseArray.size() == 0) {
                LogUtil.j("SCUI_FitnessStepDetailInteractor", "getDayTotalStepDataById dataList is empty");
                iBaseResponseCallback.a(1, null);
                return;
            }
            ArrayList arrayList = new ArrayList(10);
            for (int i3 = 0; i3 < this.f27076b.size(); i3++) {
                if (sparseArray.get(i3) != null) {
                    arrayList.addAll(sparseArray.get(i3));
                }
            }
            iBaseResponseCallback.a(0, arrayList);
        }
    }

    public void e(final String str, final int i, final IBaseResponseCallback iBaseResponseCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: uiu
            @Override // java.lang.Runnable
            public final void run() {
                FitnessStepDetailInteractor.e(i, str, iBaseResponseCallback);
            }
        });
    }

    public static /* synthetic */ void e(int i, String str, IBaseResponseCallback iBaseResponseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(String.valueOf(i), String.valueOf(i), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        hiDataReadOption.setType(new int[]{2});
        hiDataReadOption.setReadType(2);
        hiDataReadOption.setDeviceUuid(str);
        HiHealthManager.d(BaseApplication.b()).readHiHealthData(hiDataReadOption, new d(iBaseResponseCallback));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static class d implements HiDataReadResultListener {
        private final WeakReference<IBaseResponseCallback> d;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        d(IBaseResponseCallback iBaseResponseCallback) {
            this.d = new WeakReference<>(iBaseResponseCallback);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            if (!(obj instanceof SparseArray)) {
                LogUtil.j("SCUI_FitnessStepDetailInteractor", "getDayStepDataById the data is not instanceof SparseArray");
                return;
            }
            IBaseResponseCallback iBaseResponseCallback = this.d.get();
            if (iBaseResponseCallback == null) {
                LogUtil.j("SCUI_FitnessStepDetailInteractor", "IBaseResponseCallback is null");
                return;
            }
            SparseArray sparseArray = (SparseArray) obj;
            if (sparseArray.size() == 0) {
                LogUtil.j("SCUI_FitnessStepDetailInteractor", "getDayStepDataById the map is empty");
                iBaseResponseCallback.a(1, null);
                return;
            }
            Object obj2 = sparseArray.get(2);
            if (!(obj2 instanceof List)) {
                LogUtil.j("SCUI_FitnessStepDetailInteractor", "getDayStepDataById the mapObject is instanceof List");
                iBaseResponseCallback.a(1, null);
            } else {
                iBaseResponseCallback.a(0, (List) obj2);
            }
        }
    }
}
