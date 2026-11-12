package com.huawei.ui.main.stories.discover.provider;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.datatype.RecommendCardBean;
import com.huawei.health.marketing.datatype.RecommendResourceInfo;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.type.HiSubscribeType;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginfitnessadvice.FitnessPackageInfo;
import com.huawei.ui.commonui.dialog.HealthDataInputDialog;
import com.huawei.ui.commonui.numberpicker.HealthNumberPicker;
import com.huawei.ui.main.R;
import defpackage.dnj;
import defpackage.exz;
import defpackage.fcn;
import defpackage.iun;
import defpackage.njy;
import defpackage.qom;
import defpackage.qqf;
import defpackage.tsm;
import defpackage.vei;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.util.LogUtil;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes43.dex */
public class MemberWeightCardReader extends MemberCardReader {
    private Bitmap g;
    private double h;
    private RecommendResourceInfo i;
    private RecommendCardBean.Builder j;
    private final List<Integer> k;
    private String l;
    private RecommendCardBean m;
    private List<FitnessPackageInfo> n;
    private boolean o;
    private dnj q;
    private SpannableString s;
    private String t;

    public MemberWeightCardReader(Context context) {
        super(context);
        List<Integer> listAsList = Arrays.asList(Integer.valueOf(HiSubscribeType.f12259a), 11, 101, 100);
        this.k = listAsList;
        this.h = 0.0d;
        this.q = new dnj();
        this.j = new RecommendCardBean.Builder();
        this.t = "";
        this.l = "";
        this.s = null;
        this.g = null;
        LogUtil.a("VIPCard_MemberWeightCardReader", "MemberWeightCardReader");
        this.o = tsm.c(this.f26442b);
        e(listAsList, this);
        a("vipPageBMI");
        e(AnalyticsValue.VIP_INTRO_RECOMMEND_BMI_CARD.value());
        j("VIPCard_MemberWeightCardReader");
        tsm.a(new IBaseResponseCallback() { // from class: tsk
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.a(i, obj);
            }
        });
    }

    public /* synthetic */ void a(int i, Object obj) {
        if (njy.b(obj, FitnessPackageInfo.class)) {
            List<FitnessPackageInfo> list = (List) obj;
            this.n = list;
            LogUtil.a("VIPCard_MemberWeightCardReader", "queryLabel mRecommendedPlans = ", list);
        }
    }

    @Override // com.huawei.ui.main.stories.discover.provider.MemberCardReader, com.huawei.ui.main.stories.discover.provider.MemberBaseCardReader
    public void queryLabel() {
        LogUtil.a("VIPCard_MemberWeightCardReader", "queryLabel");
        b(b() && c("slim_dmp"));
        if (a() == 0) {
            LogUtil.a("VIPCard_MemberWeightCardReader", "weight card reader:no privacy");
            if (o()) {
                ab();
                return;
            } else {
                LogUtil.a("VIPCard_MemberWeightCardReader", "privacy status is not changed");
                return;
            }
        }
        if (!TextUtils.isEmpty(f()) && !k() && this.o == tsm.c(this.f26442b) && !o()) {
            LogUtil.a("VIPCard_MemberWeightCardReader", "queryLabel: labelName is not empty and isChanged() = ", Boolean.valueOf(k()), " and mLastTempIntPlan = ", Boolean.valueOf(this.o));
        } else {
            y();
            x();
        }
    }

    private void y() {
        t();
        this.o = tsm.c(this.f26442b);
    }

    private void x() {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        iun.e(new e(countDownLatch));
        tsm.d(this.f26442b, new d(countDownLatch));
        try {
            countDownLatch.await(5L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            LogUtil.c("VIPCard_MemberWeightCardReader", "time out");
        }
        ab();
    }

    @Override // com.huawei.ui.main.stories.discover.provider.MemberCardReader, com.huawei.ui.main.stories.discover.provider.MemberBaseCardReader
    public void initCardReader(List<RecommendResourceInfo> list) {
        LogUtil.a("VIPCard_MemberWeightCardReader", "initCardReader");
        super.initCardReader(list);
        ab();
    }

    @Override // com.huawei.ui.main.stories.discover.provider.MemberCardReader, com.huawei.ui.main.stories.discover.provider.MemberBaseCardReader
    public void unRegisterListener() {
        super.unRegisterListener();
        t();
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:47:0x00d4  */
    public void ab() {
        String strE;
        synchronized (this) {
            if (!l()) {
                LogUtil.a("VIPCard_MemberWeightCardReader", "recommendResource or listener not ready");
                return;
            }
            if (b() && c("slim_dmp")) {
                dnj dnjVar = this.q;
                strE = tsm.e(dnjVar, this.h, exz.c(dnjVar.r(), this.q.e()));
            } else {
                strE = "NO_PRIVACY";
            }
            RecommendResourceInfo recommendResourceInfoD = d(h(strE));
            this.i = recommendResourceInfoD;
            if (recommendResourceInfoD == null) {
                this.i = d(h("addRecord"));
            }
            RecommendResourceInfo recommendResourceInfo = this.i;
            if (recommendResourceInfo == null) {
                LogUtil.a("VIPCard_MemberWeightCardReader", "the mLabelResource of labelName is null");
                return;
            }
            LogUtil.a("VIPCard_MemberWeightCardReader", "Show coverPicture = ", recommendResourceInfo.getCoverPicture());
            this.g = qqf.c(this.f26442b, this.i.getCoverPicture());
            switch (strE) {
                case "startPlan":
                case "loseWeightGoal":
                case "gainWeightGoal":
                case "todoLoseWeight":
                case "todoGainWeight":
                    v();
                    break;
                case "addRecord":
                    s();
                    break;
                case "NO_PRIVACY":
                    q();
                    break;
            }
            ac();
        }
    }

    private String h(String str) {
        String str2 = c() + Constants.LINK + str;
        LogUtil.a("VIPCard_MemberWeightCardReader", "configCurrentLabel: labelName is ", str2);
        f(str);
        i(str2);
        return str2;
    }

    private void v() {
        this.t = this.i.getRecommendDescription();
        this.l = this.i.getResourceName();
        this.s = r();
    }

    private void s() {
        this.t = this.i.getRecommendDescription();
        this.l = this.i.getResourceName();
        String string = this.f26442b.getResources().getString(R.string.IDS_member_sub_title_range, UnitUtil.e(exz.d[0], 1, 1), UnitUtil.e(exz.d[1], 1, 1));
        this.s = tsm.e(this.f26442b, string, string);
    }

    private void q() {
        this.l = this.i.getResourceName();
        w();
        RecommendResourceInfo recommendResourceInfo = this.i;
        if (recommendResourceInfo == null) {
            LogUtil.c("VIPCard_MemberWeightCardReader", "no resource on cloud even no data label");
            return;
        }
        this.t = recommendResourceInfo.getRecommendDescription();
        this.g = qqf.c(this.f26442b, this.i.getCoverPicture());
        String string = this.f26442b.getResources().getString(R.string.IDS_member_sub_title_range, UnitUtil.e(exz.d[0], 1, 1), UnitUtil.e(exz.d[1], 1, 1));
        this.s = tsm.e(this.f26442b, string, string);
    }

    private void w() {
        String str;
        if (tsm.c(this.f26442b)) {
            str = "startPlan";
        } else {
            str = "gainWeightGoal";
        }
        RecommendResourceInfo recommendResourceInfoD = d(h(str));
        this.i = recommendResourceInfoD;
        if (recommendResourceInfoD == null) {
            this.i = d(h("addRecord"));
        }
    }

    private void ac() {
        LogUtil.a("VIPCard_MemberWeightCardReader", "updateCardBeanData");
        RecommendResourceInfo recommendResourceInfo = this.i;
        if (recommendResourceInfo == null) {
            LogUtil.c("VIPCard_MemberWeightCardReader", "cloud do not have resource of label=", f());
            return;
        }
        e(recommendResourceInfo);
        this.j.setTitle(this.t);
        this.j.setSubtitle(this.l);
        this.j.setSubtitleDataLine(this.s);
        this.j.setBackGround(this.g);
        this.j.setTitleColor(Integer.valueOf(this.f26442b.getResources().getColor(R.color.weight_management_text_color)));
        this.j.setButtonText(this.i.getButtonDescription());
        this.j.setButtonColor(Integer.valueOf(this.f26442b.getResources().getColor(R.color.weight_management_text_color)));
        this.j.setCardId(c());
        this.j.setCardStatus(h());
        this.j.setResourceId(this.i.getResourceId());
        this.j.setEventId(e());
        this.j.setClickSectionListener(new qom() { // from class: com.huawei.ui.main.stories.discover.provider.MemberWeightCardReader.5
            @Override // defpackage.qom, com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                MemberWeightCardReader.this.c(i, (RecommendResourceInfo) null);
            }
        });
        this.j.setLabelWeights(g());
        this.j.setSceneShowArticles(d(this.i));
        this.m = new RecommendCardBean(this.j);
        if (this.e == null || !njy.b(g())) {
            return;
        }
        this.e.onResponse(g().get(g().size() - 1).intValue(), this.m);
    }

    @Override // com.huawei.ui.main.stories.discover.provider.MemberCardReader
    protected void e(int i, RecommendResourceInfo recommendResourceInfo) {
        b(h(), i);
        u();
    }

    private SpannableString r() {
        String string;
        int iB = exz.b(exz.c(this.q.r(), this.q.e() <= 0 ? 173 : this.q.e()), Utils.o(), this.q.d(), this.q.c());
        if (iB == 1) {
            string = this.f26442b.getResources().getString(R.string.IDS_details_sleep_grade_low);
        } else if (iB == 2) {
            string = this.f26442b.getResources().getString(R.string.IDS_hw_weight_details_grade_standard);
        } else if (iB == 3) {
            string = this.f26442b.getResources().getString(R.string.IDS_hw_weight_details_grade_super_weight);
        } else {
            string = this.f26442b.getResources().getString(R.string.IDS_hw_weight_details_grade_fat);
        }
        return tsm.e(this.f26442b, string, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, Object obj) {
        ObserverManagerUtil.e(str, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    private void b(String str, int i) {
        byte b2;
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("VIPCard_MemberWeightCardReader", "handleWeightLabel: the weightLabel is empty");
            return;
        }
        str.hashCode();
        switch (str) {
            case "startPlan":
                b2 = 0;
                break;
            case "gainWeightGoal":
                b2 = 1;
                break;
            case "addRecord":
                b2 = 2;
                break;
            case "loseWeightGoal":
                b2 = 3;
                break;
            case "todoGainWeight":
                b2 = 4;
                break;
            case "todoLoseWeight":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 == 2) {
                    e(this.f26442b);
                    return;
                } else if (b2 != 3) {
                    if (b2 != 4) {
                        if (b2 != 5) {
                            return;
                        }
                    }
                }
            }
            tsm.c(this.f26442b, c(), h(), this.t, i);
            return;
        }
        e(i);
    }

    private void u() {
        if (this.i != null) {
            fcn.b(this.f26442b, 1, new RecommendCardBean.Builder().setCardId("vipPageBMI").setCardStatus(f()).setResourceId(this.i.getResourceId()).setTitle(this.t).setButtonText(this.i.getButtonDescription()).setEventId(AnalyticsValue.VIP_INTRO_RECOMMEND_BMI_CARD.value()).build());
        }
    }

    private void e(final int i) {
        LogUtil.a("VIPCard_MemberWeightCardReader", "enter handleGoToAiFitnessPlan");
        if (njy.e(this.n)) {
            tsm.a(new IBaseResponseCallback() { // from class: tsj
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.f49608b.b(i, i2, obj);
                }
            });
            return;
        }
        tsm.a(this.f26442b, e("huaweischeme://healthapp/fitnesspage?skip_type=introduce_plan&id=1&planTempId=" + this.n.get(0).acquirePlanTempId(), this.t, i));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0036  */
    public /* synthetic */ void b(int i, int i2, Object obj) {
        String strAcquirePlanTempId;
        if (njy.b(obj, FitnessPackageInfo.class)) {
            List<FitnessPackageInfo> list = (List) obj;
            this.n = list;
            LogUtil.a("VIPCard_MemberWeightCardReader", "mRecommendedPlans = ", list);
            if (!njy.e(this.n)) {
                strAcquirePlanTempId = this.n.get(0).acquirePlanTempId();
                LogUtil.a("VIPCard_MemberWeightCardReader", "planId = ", strAcquirePlanTempId);
            } else {
                strAcquirePlanTempId = "JZ001";
            }
        } else {
            strAcquirePlanTempId = "JZ001";
        }
        tsm.a(this.f26442b, e("huaweischeme://healthapp/fitnesspage?skip_type=introduce_plan&id=1&planTempId=" + strAcquirePlanTempId, this.t, i));
    }

    private void e(Context context) {
        final HealthNumberPicker healthNumberPicker;
        final HealthNumberPicker healthNumberPicker2;
        LogUtil.a("VIPCard_MemberWeightCardReader", "enter showInputDialog");
        final HealthDataInputDialog healthDataInputDialogD = new HealthDataInputDialog(context).e(ContextCompat.getColor(context, R.color.weight_management_text_color)).c(context.getResources().getString(R.string.IDS_member_bmi_my_height_and_weight)).b(context.getResources().getString(R.string.IDS_member_bmi_set_weight_height_tips, DateUtils.formatDateTime(context, System.currentTimeMillis(), 16))).a(tsm.d(this.q)).d(this.f26442b.getResources().getString(R.string.confirm));
        if (UnitUtil.f()) {
            View viewA = tsm.a(context, this.q);
            healthNumberPicker = (HealthNumberPicker) viewA.findViewById(R.id.height_ft_number_picker_v9);
            healthNumberPicker2 = (HealthNumberPicker) viewA.findViewById(R.id.height_inch_number_picker_v9);
            viewA.findViewById(R.id.height_inch_number_picker_v9);
            healthDataInputDialogD.a(viewA);
        } else {
            healthDataInputDialogD.a(tsm.a(this.q));
            healthNumberPicker = null;
            healthNumberPicker2 = null;
        }
        healthDataInputDialogD.d(new HealthDataInputDialog.PositiveBtnClickListener() { // from class: tsd
            @Override // com.huawei.ui.commonui.dialog.HealthDataInputDialog.PositiveBtnClickListener
            public final void onClick(List list) {
                this.e.c(healthNumberPicker, healthNumberPicker2, healthDataInputDialogD, list);
            }
        });
        healthDataInputDialogD.c(new View.OnClickListener() { // from class: tsf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49606c.c(healthDataInputDialogD, view);
            }
        });
        healthDataInputDialogD.show();
        vei.b(this.f26442b, AnalyticsValue.WEIGHT_PAGE_INPUT_DATA_2160122.value(), 0);
    }

    public /* synthetic */ void c(HealthNumberPicker healthNumberPicker, HealthNumberPicker healthNumberPicker2, HealthDataInputDialog healthDataInputDialog, List list) {
        b(healthNumberPicker, healthNumberPicker2, (List<Integer>) list);
        vei.b(this.f26442b, AnalyticsValue.WEIGHT_PAGE_INPUT_DATA_2160122.value(), 2);
        healthDataInputDialog.dismiss();
    }

    public /* synthetic */ void c(HealthDataInputDialog healthDataInputDialog, View view) {
        vei.b(this.f26442b, AnalyticsValue.WEIGHT_PAGE_INPUT_DATA_2160122.value(), 1);
        healthDataInputDialog.dismiss();
    }

    private void b(HealthNumberPicker healthNumberPicker, HealthNumberPicker healthNumberPicker2, List<Integer> list) {
        if (!UnitUtil.f()) {
            this.q.c((int) ((((double) list.get(1).intValue()) / 10.0d) + 50.0d));
        } else if (healthNumberPicker != null && healthNumberPicker2 != null) {
            this.q.c((int) Math.rint((UnitUtil.c(healthNumberPicker.getValue() + 1, 1) * 100.0d) + UnitUtil.c(healthNumberPicker2.getValue(), 0)));
        }
        float fA = a(list);
        if (this.q.r() <= 0.0f) {
            fcn.d(this.f26442b, "2");
        } else {
            fcn.d(this.f26442b, "1");
        }
        this.q.e(fA);
        LogUtil.a("VIPCard_MemberWeightCardReader", "Under metric: weight = ", Float.valueOf(fA), " height = ", Integer.valueOf(this.q.e()));
        a(this.q);
        tsm.d(fA);
    }

    private float a(List<Integer> list) {
        double dIntValue;
        int iE = UnitUtil.e();
        if (iE == 1) {
            dIntValue = UnitUtil.b((((double) list.get(0).intValue()) / 10.0d) + UnitUtil.j(10.0d));
        } else if (iE == 3) {
            dIntValue = UnitUtil.i((((double) list.get(0).intValue()) / 10.0d) + 22.0d);
        } else {
            dIntValue = (((double) list.get(0).intValue()) / 10.0d) + 10.0d;
        }
        return (float) dIntValue;
    }

    public void a(dnj dnjVar) {
        HiUserInfo hiUserInfo = new HiUserInfo();
        hiUserInfo.setWeight(dnjVar.r());
        hiUserInfo.setHeight(dnjVar.e());
        hiUserInfo.setUser(1073741824);
        hiUserInfo.setModifiedIntent(536870912);
        HiHealthNativeApi.a(BaseApplication.b()).setUserData(hiUserInfo, new AnonymousClass4());
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.discover.provider.MemberWeightCardReader$4, reason: invalid class name */
    public class AnonymousClass4 implements HiCommonListener {
        AnonymousClass4() {
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onSuccess(int i, Object obj) {
            LogUtil.a("VIPCard_MemberWeightCardReader", "saveUserInfo onSuccess ", obj);
            ThreadPoolManager.c().execute(new Runnable() { // from class: tsl
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.e();
                }
            });
        }

        public /* synthetic */ void e() {
            MemberWeightCardReader.this.ab();
            MemberWeightCardReader memberWeightCardReader = MemberWeightCardReader.this;
            memberWeightCardReader.e("MEMBER_OPEN_BMI_CHANGE", memberWeightCardReader.m);
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onFailure(int i, Object obj) {
            LogUtil.d("VIPCard_MemberWeightCardReader", "setUserData onFailure: ", Integer.valueOf(i), " ", obj);
        }
    }

    static class e implements ResponseCallback<Double> {
        private CountDownLatch d;
        private WeakReference<MemberWeightCardReader> e;

        private e(MemberWeightCardReader memberWeightCardReader, CountDownLatch countDownLatch) {
            this.e = new WeakReference<>(memberWeightCardReader);
            this.d = countDownLatch;
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, Double d) {
            MemberWeightCardReader memberWeightCardReader = this.e.get();
            if (memberWeightCardReader != null) {
                memberWeightCardReader.h = d.doubleValue();
                LogUtil.a("VIPCard_MemberWeightCardReader", "mGoalWeight = ", Double.valueOf(memberWeightCardReader.h));
                this.d.countDown();
                return;
            }
            LogUtil.d("VIPCard_MemberWeightCardReader", "WeakTargetWeightCallback, the reader is null");
        }
    }

    static class d implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CountDownLatch f26460c;
        private WeakReference<MemberWeightCardReader> d;

        private d(MemberWeightCardReader memberWeightCardReader, CountDownLatch countDownLatch) {
            this.d = new WeakReference<>(memberWeightCardReader);
            this.f26460c = countDownLatch;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("VIPCard_MemberWeightCardReader", "errorCode is ", Integer.valueOf(i));
            MemberWeightCardReader memberWeightCardReader = this.d.get();
            if (memberWeightCardReader == null) {
                LogUtil.d("VIPCard_MemberWeightCardReader", "WeakBaseResponseCallback, the reader is null");
                this.f26460c.countDown();
                return;
            }
            if (obj instanceof dnj) {
                memberWeightCardReader.q = (dnj) obj;
            }
            if (memberWeightCardReader.q != null) {
                LogUtil.a("VIPCard_MemberWeightCardReader", "weight = ", Float.valueOf(memberWeightCardReader.q.r()), " height = ", Integer.valueOf(memberWeightCardReader.q.e()), " age = ", Integer.valueOf(memberWeightCardReader.q.c()), " gender() = ", Byte.valueOf(memberWeightCardReader.q.d()));
            }
            this.f26460c.countDown();
        }
    }
}
