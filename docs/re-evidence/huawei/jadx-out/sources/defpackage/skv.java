package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.components.XAxis;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.fatscale.multiusers.WeightDataManager;
import com.huawei.health.device.wifi.control.claim.ClaimWeightDataManager;
import com.huawei.health.device.wifi.interfaces.CommBaseCallback;
import com.huawei.health.h5pro.core.H5ProCommand;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.health.utils.functionsetcard.FunctionSetBean;
import com.huawei.health.health.utils.functionsetcard.FunctionSetType;
import com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData;
import com.huawei.health.userlabelmgr.api.UserLabelServiceApi;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.type.HiSubscribeType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.ruler.circlescaleruler.CircleScaleRuler;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.homehealth.R;
import health.compact.a.CommonUtils;
import health.compact.a.CompileParameterUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class skv extends FunctionSetBeanReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f48292a = b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f48293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CircleScaleRuler f48294c;
    private final qox d;
    private String e;
    private boolean f;
    private boolean g;
    private View h;
    private long i;
    private final d j;
    private List<Integer> k;
    private double l;
    private long m;
    private ArrayList<Float> n;
    private HwHealthLineChart o;
    private int r;

    private float a(float f2, float f3) {
        if (f2 > f3) {
            return f2 + 5.0f;
        }
        return f2 < f3 ? f2 - 5.0f : f2;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public boolean isMessageDefaultLargeCard() {
        return true;
    }

    static class a extends HandleCacheDataRunnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ArrayList<Float> f48297a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f48298c;
        private final WeakReference<skv> d;

        a(skv skvVar) {
            super("FunctionSetWeightCardReader", null);
            this.d = new WeakReference<>(skvVar);
        }

        void e(HiHealthData hiHealthData, ArrayList<Float> arrayList) {
            if (arrayList == null || hiHealthData == null) {
                skv.setHasCardData(this.d, false);
                this.f48297a = null;
            } else {
                skv.setHasCardData(this.d, true);
                this.f48297a = arrayList;
                if (njy.b(arrayList)) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        hiHealthData.putFloat("w" + i, arrayList.get(i).floatValue());
                    }
                }
            }
            skv.saveDataFromHealthApi("FunctionSetWeightCardReader", this.d, hiHealthData);
        }

        @Override // com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable
        public void handleCacheData(HiHealthData hiHealthData, boolean z) {
            skv skvVar = this.d.get();
            if (skvVar == null) {
                LogUtil.j("FunctionSetWeightCardReader", "handleCacheData weightCardReader is null");
                return;
            }
            if (hiHealthData == null) {
                if (this.f48298c && z) {
                    skvVar.h();
                    return;
                }
                return;
            }
            this.f48298c = true;
            SharedPreferenceManager.c("privacy_center", "health_weight", String.valueOf(hiHealthData.getStartTime()));
            ArrayList<Float> arrayList = this.f48297a;
            if (!z || arrayList == null) {
                arrayList = new ArrayList<>(16);
                int i = 0;
                while (true) {
                    String str = "w" + i;
                    if (hiHealthData.getFloat(str) == 0.0f) {
                        break;
                    }
                    arrayList.add(Float.valueOf(hiHealthData.getFloat(str)));
                    i++;
                }
            } else {
                this.f48297a = null;
            }
            skvVar.n = arrayList;
            if (arrayList.isEmpty()) {
                boolean zA = iuo.a();
                ReleaseLogUtil.d("TimeEat_FunctionSetWeightCardReader", "handleCacheData fatReductionShapingState ", Boolean.valueOf(zA), " isNewData ", Boolean.valueOf(z));
                if (zA) {
                    skvVar.b(iuo.c());
                    return;
                } else {
                    if (z) {
                        return;
                    }
                    skvVar.refreshCardBySp(skvVar.buildEmptyCardBean());
                    return;
                }
            }
            double d = hiHealthData.getDouble("bodyWeight");
            int i2 = hiHealthData.getInt("trackdata_deviceType");
            long startTime = hiHealthData.getStartTime();
            skvVar.c(d, startTime, String.valueOf(startTime) + d, i2, z);
        }
    }

    public static class d extends BaseHandler<skv> {
        private d(skv skvVar) {
            super(Looper.getMainLooper(), skvVar);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(skv skvVar, Message message) {
            LogUtil.a("FunctionSetWeightCardReader", "handleMessageWhenReferenceNotNull()");
            if (skvVar == null || message == null) {
                LogUtil.j("FunctionSetWeightCardReader", "handleMessageWhenReferenceNotNull WeightCardReader or message is null");
                return;
            }
            int i = message.what;
            if (i == 1) {
                LogUtil.a("FunctionSetWeightCardReader", "handleMessageWhenReferenceNotNull IS_HAVE_NEW_DATA");
                FunctionSetBean functionSetBean = skvVar.getFunctionSetBean();
                if (functionSetBean != null) {
                    boolean zA = skv.a();
                    functionSetBean.a(zA);
                    functionSetBean.b(skvVar.a(functionSetBean.r()));
                    skvVar.notifyItemChanged(functionSetBean);
                    skvVar.g = zA;
                    return;
                }
                LogUtil.j("FunctionSetWeightCardReader", "handleMessageWhenReferenceNotNull functionSetBean is null");
                return;
            }
            if (i == 2) {
                LogUtil.a("FunctionSetWeightCardReader", "handleMessageWhenReferenceNotNull MSG_UPDATE_WEIGHT");
                FunctionSetBean functionSetBean2 = (FunctionSetBean) message.obj;
                skvVar.notifyItemChanged(functionSetBean2);
                skvVar.setFunctionSetBean(functionSetBean2);
                return;
            }
            if (i == 3) {
                skvVar.c((List<HiHealthData>) message.obj);
            } else if (i == 4) {
                skvVar.b((vgo) message.obj);
            } else {
                LogUtil.j("FunctionSetWeightCardReader", "handleMessageWhenReferenceNotNull default");
            }
        }
    }

    public static class c extends CommBaseCallback<skv> {
        private c(skv skvVar) {
            super(skvVar);
        }

        @Override // com.huawei.health.device.wifi.interfaces.CommBaseCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(skv skvVar, int i, String str, Object obj) {
            if (skvVar == null || skvVar.j == null) {
                return;
            }
            skvVar.j.sendEmptyMessage(1);
        }
    }

    public skv(Context context, CardConfig cardConfig) {
        super(context, "FunctionSetWeightCardReader", cardConfig);
        this.d = new qox(false);
        this.n = new ArrayList<>(10);
        this.k = null;
        this.f = true;
        this.f48293b = new a(this);
        this.j = new d();
        if (Utils.o()) {
            this.e = qre.f(R.string.IDS_hw_show_main_home_page_weight);
        } else {
            this.e = qre.f(R.string.IDS_health_weight_manager);
        }
        if (CompileParameterUtil.c("SUPPORT_WIFI_WEIGHT_DEVICE", false)) {
            ClaimWeightDataManager.INSTANCE.registerCallBack(getClass().getSimpleName(), new c());
        }
        subscribeDataChange();
        vil.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(double d2, long j, String str, int i, boolean z) {
        LogUtil.a("FunctionSetWeightCardReader", "refreshWeightDataAndTime");
        setHasCardData(true);
        setBiHasData(j);
        setBiHasDataType("weight");
        setBiDataSource(i);
        this.i = j;
        this.l = d2;
        ntb.a(this.mContext).a(this.l, this.i, true);
        String strB = tfc.b(this.i);
        double dA = UnitUtil.a(this.l, 2);
        FunctionSetBean functionSetBeanA = new FunctionSetBean.c(this.e).b(this.mContext).e(FunctionSetType.WEIGHT_CARD).d(strB).g(tfc.d(this.i)).c(FunctionSetBean.ViewType.DATA_VIEW).b(a(FunctionSetBean.ViewType.DATA_VIEW)).e(UnitUtil.c(dA, 1, 1, 2, null)).j(a(dA)).a();
        boolean zA = a();
        this.g = zA;
        functionSetBeanA.a(zA);
        functionSetBeanA.d((str + dA + functionSetBeanA.g()).hashCode());
        setFunctionSetBean(functionSetBeanA);
        if (z) {
            Message messageObtainMessage = this.j.obtainMessage();
            messageObtainMessage.what = 2;
            messageObtainMessage.obj = functionSetBeanA;
            this.j.sendMessage(messageObtainMessage);
        } else {
            refreshCardBySp(functionSetBeanA);
        }
        if (iuo.a()) {
            b(iuo.c());
            return;
        }
        if (this.f48294c == null) {
            ReleaseLogUtil.e("FunctionSetWeightCardReader", "mCircleScaleRuler is null");
            return;
        }
        HwHealthLineChart hwHealthLineChart = this.o;
        if (hwHealthLineChart != null && this.l > 0.0d) {
            hwHealthLineChart.setVisibility(0);
        }
        this.f48294c.setVisibility(8);
        functionSetBeanA.b((CharSequence) null);
        notifyItemChanged(functionSetBeanA);
    }

    private String a(double d2) {
        this.r = UnitUtil.c();
        return vei.b(d2);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, FunctionSetSubCardData functionSetSubCardData) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onBindViewHolder(viewHolder, functionSetSubCardData);
        FunctionSetBean functionSetBean = functionSetSubCardData.getFunctionSetBean();
        if (!(viewHolder instanceof FunctionSetBeanReader.MyHolder) || functionSetBean == null) {
            LogUtil.e("FunctionSetWeightCardReader", "MyHolder is invalid");
            return;
        }
        View view = ((FunctionSetBeanReader.MyHolder) viewHolder).itemView;
        LogUtil.a("FunctionSetWeightCardReader", "weightView: " + view);
        if (functionSetBean.r() == FunctionSetBean.ViewType.EMPTY_VIEW) {
            ImageView imageView = (ImageView) view.findViewById(R.id.function_set_empty_red_dot);
            if (imageView == null) {
                return;
            }
            boolean zA = a();
            this.g = zA;
            if (zA) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        ReleaseLogUtil.d("TimeEat_FunctionSetWeightCardReader", "onBindViewHolder finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void d() {
        if (!(this.mCardViewHolder instanceof FunctionSetBeanReader.MyHolder)) {
            LogUtil.a("FunctionSetWeightCardReader", "mCardViewHolder is not MyHolder instance");
            return;
        }
        View view = this.mCardViewHolder.itemView;
        if (view == null) {
            LogUtil.a("FunctionSetWeightCardReader", "view is null");
            return;
        }
        if (f48292a) {
            if (SharedPreferenceManager.e(this.mContext, Integer.toString(10000), "IS_CARD_USED_KEY", "card_is_used", new StorageParams()) == 0) {
                f48292a = false;
            }
            ImageView imageView = (ImageView) view.findViewById(R.id.function_set_empty_red_dot);
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public boolean isSubscribeType(int i) {
        return i == HiSubscribeType.f12259a || i == DicDataTypeUtil.DataType.RESTING_METABOLISM_SET.value() || i == DicDataTypeUtil.DataType.CURRENT_BASAL_METABOLISM_SET.value() || i == DicDataTypeUtil.DataType.BASAL_METABOLISM_AFTER_EXERCISE_SET.value() || i == 40003;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public final void readCardData() {
        super.readCardData();
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.d("FunctionSetWeightCardReader", "readCardData start ", Long.valueOf(jCurrentTimeMillis));
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(iuo.g(), jCurrentTimeMillis);
        hiAggregateOption.setType(new int[]{10006});
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setFilter("NULL");
        if (iuo.a()) {
            int iA = DateFormatUtil.a(jCurrentTimeMillis);
            vil.d(iA, iA, (ResponseCallback<List<vgo>>) new b(this));
            hiAggregateOption.setCount(1);
        }
        hiAggregateOption.setConstantsKey(new String[]{BleConstants.WEIGHT_KEY});
        HiHealthManager.d(this.mContext).aggregateHiHealthData(hiAggregateOption, new e(this));
    }

    static class e implements HiAggregateListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<skv> f48299c;

        e(skv skvVar) {
            this.f48299c = new WeakReference<>(skvVar);
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            LogUtil.a("FunctionSetWeightCardReader", "readCardData onResult ", list);
            skv skvVar = this.f48299c.get();
            if (skvVar == null) {
                LogUtil.j("FunctionSetWeightCardReader", "read is null, not refresh");
                return;
            }
            if (list != null && list.size() > 0) {
                ArrayList arrayListB = skvVar.b(list);
                WeightDataManager.INSTANCE.setDataList(true, arrayListB);
                LogUtil.a("FunctionSetWeightCardReader", "readCardData onResult dataList size is ", Integer.valueOf(list.size()), ",filteredHealthDataList size is ", Integer.valueOf(arrayListB.size()));
                Message messageObtainMessage = skvVar.j.obtainMessage();
                messageObtainMessage.what = 3;
                messageObtainMessage.obj = arrayListB;
                skvVar.j.sendMessage(messageObtainMessage);
                return;
            }
            LogUtil.j("FunctionSetWeightCardReader", "readCardData onResult no data");
            skvVar.f48293b.e(null, null);
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            LogUtil.a("FunctionSetWeightCardReader", "readCardData onResultIntent");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<HiHealthData> b(List<HiHealthData> list) {
        ArrayList<HiHealthData> arrayList = new ArrayList<>(10);
        for (HiHealthData hiHealthData : list) {
            if (d(hiHealthData.getDouble("bodyWeight")) && d(hiHealthData.getStartTime()) && d(hiHealthData.getEndTime())) {
                arrayList.add(hiHealthData);
            }
        }
        return arrayList;
    }

    private boolean d(double d2) {
        return Double.compare(d2, 0.0d) > 0 && Double.compare(d2, 250.0d) <= 0;
    }

    private boolean d(long j) {
        return j > 0 && j <= System.currentTimeMillis();
    }

    static class b implements ResponseCallback<List<vgo>> {
        private final WeakReference<skv> d;

        b(skv skvVar) {
            this.d = new WeakReference<>(skvVar);
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, List<vgo> list) {
            LogUtil.a("FunctionSetWeightCardReader", "InnerResponseCallback errorCode ", Integer.valueOf(i), " list ", list);
            skv skvVar = this.d.get();
            if (skvVar != null) {
                d dVar = skvVar.j;
                if (dVar == null) {
                    ReleaseLogUtil.e("TimeEat_FunctionSetWeightCardReader", "InnerResponseCallback handler is null");
                    return;
                }
                vgo vgoVar = njy.b(list) ? list.get(0) : null;
                Message messageObtainMessage = dVar.obtainMessage();
                messageObtainMessage.what = 4;
                messageObtainMessage.obj = vgoVar;
                dVar.sendMessage(messageObtainMessage);
                return;
            }
            ReleaseLogUtil.e("TimeEat_FunctionSetWeightCardReader", "InnerResponseCallback reader is null");
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void updateSuccessList(List<Integer> list) {
        LogUtil.a("FunctionSetWeightCardReader", "updateSuccessList");
        if (list == null || list.isEmpty()) {
            return;
        }
        LogUtil.a("FunctionSetWeightCardReader", "updateSuccessList successList is not null");
        this.k = list;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void subscribeDataChange() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(HiSubscribeType.f12259a));
        arrayList.add(103);
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.RESTING_METABOLISM_SET.value()));
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.CURRENT_BASAL_METABOLISM_SET.value()));
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.BASAL_METABOLISM_AFTER_EXERCISE_SET.value()));
        arrayList.add(40003);
        HiHealthNativeApi.a(this.mContext).subscribeHiHealthData(arrayList, new f("FunctionSetWeightCardReader", this));
        ReleaseLogUtil.d("TimeEat_FunctionSetWeightCardReader", "subscribeWeightData typeList ", arrayList);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void unsubscribeDataChange() {
        LogUtil.a("FunctionSetWeightCardReader", "unSubscribeWeightData");
        if (CompileParameterUtil.c("SUPPORT_WIFI_WEIGHT_DEVICE", false)) {
            ClaimWeightDataManager.INSTANCE.unRegisterCallBack(getClass().getSimpleName());
        }
        List<Integer> list = this.k;
        if (list == null || list.isEmpty()) {
            return;
        }
        HiHealthNativeApi.a(this.mContext).unSubscribeHiHealthData(this.k, new FunctionSetBeanReader.c("FunctionSetWeightCardReader", "unSubscribeWeightData, isSuccess:"));
    }

    private boolean c(String str) {
        return (str == null || str.length() == 0) || (Constants.NULL.equalsIgnoreCase(str) || "0".equals(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        boolean zA = iuo.a();
        ReleaseLogUtil.d("TimeEat_FunctionSetWeightCardReader", "showEmptyView fatReductionShapingState ", Boolean.valueOf(zA));
        if (zA) {
            this.l = 0.0d;
            b(iuo.c());
            return;
        }
        setHasCardData(false);
        FunctionSetBean functionSetBeanBuildEmptyCardBean = buildEmptyCardBean();
        Message messageObtainMessage = this.j.obtainMessage();
        messageObtainMessage.what = 2;
        messageObtainMessage.obj = functionSetBeanBuildEmptyCardBean;
        this.j.sendMessage(messageObtainMessage);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public FunctionSetBean buildEmptyCardBean() {
        return new FunctionSetBean.c(this.e).e(FunctionSetType.WEIGHT_CARD).b((Drawable) null).c(qre.f(R.string.IDS_hw_show_main_home_page_weight_description)).c(FunctionSetBean.ViewType.EMPTY_VIEW).b(this.mContext).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<HiHealthData> list) {
        ArrayList<Float> arrayList = new ArrayList<>(3);
        ArrayList arrayList2 = new ArrayList(3);
        HiHealthData hiHealthData = new HiHealthData();
        String strI = MultiUsersManager.INSTANCE.getMainUser().i();
        long startTime = 0;
        double d2 = 0.0d;
        for (HiHealthData hiHealthData2 : list) {
            String metaData = hiHealthData2.getMetaData();
            if (c(metaData) || metaData.equals(strI)) {
                if (arrayList.size() < 3) {
                    arrayList.add(Float.valueOf((float) hiHealthData2.getDouble("bodyWeight")));
                    arrayList2.add(Long.valueOf(hiHealthData2.getStartTime()));
                }
                if (d2 == 0.0d || startTime == 0) {
                    d2 = hiHealthData2.getDouble("bodyWeight");
                    startTime = hiHealthData2.getStartTime();
                    if (d(d2) && d(startTime)) {
                        hiHealthData.putDouble("bodyWeight", d2);
                        hiHealthData.putInt("trackdata_deviceType", hiHealthData2.getInt("trackdata_deviceType"));
                        hiHealthData.setStartTime(startTime);
                    }
                }
            }
        }
        long jLongValue = 0;
        if (startTime == 0 || d2 == 0.0d) {
            arrayList.clear();
            hiHealthData = null;
        }
        this.f48293b.e(hiHealthData, arrayList);
        this.n = arrayList;
        int size = arrayList2.size();
        if (size >= 3 && arrayList.size() >= 3) {
            jLongValue = ((Long) arrayList2.get(size - 1)).longValue();
        }
        iuo.b(jLongValue);
        LogUtil.a("FunctionSetWeightCardReader", "showDataView startTime ", Long.valueOf(jLongValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(final vgo vgoVar) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.b(new Runnable() { // from class: skr
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b(vgoVar);
                }
            });
            return;
        }
        LogUtil.a("FunctionSetWeightCardReader", "showDietRecord dietRecord ", vgoVar);
        FunctionSetBean functionSetBean = getFunctionSetBean();
        if (functionSetBean == null) {
            ReleaseLogUtil.e("FunctionSetWeightCardReader", "showDietRecord functionSetBean is null");
            return;
        }
        if (this.f48294c == null) {
            ReleaseLogUtil.e("FunctionSetWeightCardReader", "showDietRecord mCircleScaleRuler is null initCardView");
            e();
        }
        if (this.f48294c == null) {
            ReleaseLogUtil.e("FunctionSetWeightCardReader", "showDietRecord mCircleScaleRuler is null");
            return;
        }
        vfy vfyVarA = a(vgoVar);
        if (vfyVarA == null) {
            boolean zA = iuo.a();
            ReleaseLogUtil.e("TimeEat_FunctionSetWeightCardReader", "showDietRecord dietCalorieOverview is null isOpenFatReductionShaping ", Boolean.valueOf(zA));
            if (!zA) {
                HwHealthLineChart hwHealthLineChart = this.o;
                if (hwHealthLineChart != null && this.l > 0.0d) {
                    hwHealthLineChart.setVisibility(0);
                }
                this.f48294c.setVisibility(8);
                functionSetBean.b((CharSequence) null);
            }
            notifyItemChanged(functionSetBean);
            return;
        }
        setHasCardData(true);
        HwHealthLineChart hwHealthLineChart2 = this.o;
        if (hwHealthLineChart2 != null) {
            hwHealthLineChart2.setVisibility(8);
        }
        this.f48294c.setVisibility(0);
        this.d.b(ezn.b(vfyVarA));
        Pair<Float, Float> pairA = ezn.a(vfyVarA);
        if (pairA == null) {
            this.d.d(0.0f, 0.0f);
        } else {
            this.d.d(((Float) pairA.first).floatValue(), ((Float) pairA.second).floatValue());
        }
        this.f48294c.setCircleScaleRulerData(this.d);
        c(functionSetBean, vfyVarA);
    }

    private vfy a(vgo vgoVar) {
        if (vgoVar == null) {
            ReleaseLogUtil.e("FunctionSetWeightCardReader", "getDietCalorieOverview dietRecord is null");
            return null;
        }
        return vgoVar.d();
    }

    private void c(FunctionSetBean functionSetBean, vfy vfyVar) {
        String strC;
        int iD = ezn.d(vfyVar);
        String strA = qre.a(vfyVar.j() < 0.0d ? R.string.IDS_weight_heat_surpluses_value : R.string.IDS_weight_heat_gap_value, qre.e(R.plurals.IDS_kcalories_unit, iD, UnitUtil.e(iD, 1, 0)));
        setBiHasDataType(vfyVar.j() < 0.0d ? "caloric_surplus" : "calorie_deficit");
        functionSetBean.b((CharSequence) strA);
        functionSetBean.b(BaseApplication.b().getResources().getString(R.string.IDS_hwh_record_diet));
        functionSetBean.e(FunctionSetBean.ViewType.DATA_VIEW);
        functionSetBean.b(a(FunctionSetBean.ViewType.DATA_VIEW));
        double dA = UnitUtil.a(this.l, 2);
        if (dA <= 0.0d) {
            strC = "--";
        } else {
            strC = UnitUtil.c(dA, 1, 1, 2, null);
        }
        functionSetBean.c(strC);
        functionSetBean.h(a(dA));
        notifyItemChanged(functionSetBean);
        this.m = vfyVar.f();
    }

    private void e() {
        if (this.h == null) {
            LogUtil.j("FunctionSetWeightCardReader", "initCardView mHealthViewLineChart is null");
            this.h = LayoutInflater.from(this.mContext).inflate(R.layout.health_view_line_chart, (ViewGroup) null);
        }
        if (this.f48294c == null) {
            ReleaseLogUtil.e("TimeEat_FunctionSetWeightCardReader", "initCardView mCircleScaleRuler is null");
            this.f48294c = (CircleScaleRuler) this.h.findViewById(R.id.circle_scale_ruler);
        }
        ezn.d(this.d, true);
        this.h.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: skv.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                skv.this.h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (!iuo.a()) {
                    ReleaseLogUtil.e("TimeEat_FunctionSetWeightCardReader", "initCardView onGlobalLayout getFatReductionShapingState false");
                    return;
                }
                int iMax = Math.max(skv.this.h.getHeight(), qre.b(R.dimen.health_common_28dp));
                int iB = qre.b(R.dimen.health_common_58dp);
                if (iMax <= 0 || iMax >= iB) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = skv.this.f48294c.getLayoutParams();
                layoutParams.width = skv.this.f48294c.getWidth();
                layoutParams.height = iMax;
                skv.this.f48294c.setLayoutParams(layoutParams);
                float f2 = iMax / iB;
                skv.this.d.e(f2);
                skv.this.f48294c.setCircleScaleRulerData(skv.this.d);
                ReleaseLogUtil.d("FunctionSetWeightCardReader", "initCardView onGlobalLayout viewHeight ", Integer.valueOf(iMax), " circleScaleRulerHeight ", Integer.valueOf(iB), " zoomScale ", Float.valueOf(f2));
            }
        });
        if (this.o == null) {
            LogUtil.j("FunctionSetWeightCardReader", "initCardView mLineChart is null");
            this.o = (HwHealthLineChart) this.h.findViewById(R.id.line_chart);
        }
        if (this.o.getRenderer() instanceof qns) {
            ((qns) this.o.getRenderer()).c(1);
        }
        this.o.disableLabelsForce();
        this.o.setTouchEnabled(false);
        this.o.getDescription().setEnabled(false);
    }

    private void e(float f2, float f3) {
        HwHealthLineChart hwHealthLineChart = this.o;
        if (hwHealthLineChart == null) {
            LogUtil.j("FunctionSetWeightCardReader", "initAxis mLineChart is null");
            return;
        }
        XAxis xAxis = hwHealthLineChart.getXAxis();
        xAxis.setEnabled(false);
        xAxis.setAxisMinimum(-4.0f);
        xAxis.setAxisMaximum(104.0f);
        HwHealthYAxis axisFirstParty = this.o.getAxisFirstParty();
        axisFirstParty.setDrawLabels(false);
        axisFirstParty.setDrawAxisLine(false);
        axisFirstParty.setDrawGridLines(false);
        axisFirstParty.setAxisMinimum(f2 - 100.0f);
        axisFirstParty.setAxisMaximum(f3 + 100.0f);
    }

    private void a(List<HwHealthBaseEntry> list) {
        if (this.o == null) {
            LogUtil.j("FunctionSetWeightCardReader", "initLineDataSet mLineChart is null");
            return;
        }
        LogUtil.a("FunctionSetWeightCardReader", "initLineDataSet valueList size is ", Integer.valueOf(list.size()));
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(this.mContext, list, "line brief", "line label", "line unit");
        hwHealthLineDataSet.setColor(Color.parseColor("#3EB09E"));
        hwHealthLineDataSet.a(Color.parseColor("#333EB09E"), Color.parseColor("#003EB09E"), true);
        hwHealthLineDataSet.setAxisDependency(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(hwHealthLineDataSet);
        this.o.setData(new qnt(arrayList));
        this.o.refresh();
        FunctionSetBean functionSetBean = getFunctionSetBean();
        if (functionSetBean == null) {
            ReleaseLogUtil.e("FunctionSetWeightCardReader", "initLineDataSet functionSetBean is null");
        } else {
            this.o.setAccessibilityDescription(qre.a(R.string.accessibility_theme_description, functionSetBean.c(), functionSetBean.t()));
        }
    }

    private void b(ArrayList<Float> arrayList) {
        boolean zA = iuo.a();
        ReleaseLogUtil.d("TimeEat_FunctionSetWeightCardReader", "refreshCardView isOpenFatReductionShaping ", Boolean.valueOf(zA));
        if (zA) {
            HwHealthLineChart hwHealthLineChart = this.o;
            if (hwHealthLineChart != null) {
                hwHealthLineChart.setVisibility(8);
            }
            CircleScaleRuler circleScaleRuler = this.f48294c;
            if (circleScaleRuler != null) {
                circleScaleRuler.setVisibility(0);
                this.f48294c.setCircleScaleRulerData(this.d);
                return;
            }
            return;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            LogUtil.j("FunctionSetWeightCardReader", "refreshCardView list is empty");
            return;
        }
        List<HwHealthBaseEntry> arrayList2 = new ArrayList<>(3);
        int size = arrayList.size();
        LogUtil.a("FunctionSetWeightCardReader", "refreshCardView lineChartDataListSize is ", Integer.valueOf(size));
        if (size <= 0) {
            LogUtil.j("FunctionSetWeightCardReader", "refreshCardView lineChartDataListSize is zero");
            return;
        }
        if (size == 1) {
            float fFloatValue = arrayList.get(0).floatValue();
            e(fFloatValue, fFloatValue);
            arrayList2.add(new HwHealthBaseEntry(-100.0f, fFloatValue));
            arrayList2.add(new HwHealthBaseEntry(100.0f, fFloatValue));
        } else if (size == 2) {
            float fFloatValue2 = arrayList.get(0).floatValue();
            float fFloatValue3 = arrayList.get(1).floatValue();
            if (fFloatValue2 > fFloatValue3) {
                fFloatValue2 += 5.0f;
                fFloatValue3 -= 5.0f;
                e(fFloatValue3, fFloatValue2);
            } else if (fFloatValue2 < fFloatValue3) {
                fFloatValue2 -= 5.0f;
                fFloatValue3 += 5.0f;
                e(fFloatValue2, fFloatValue3);
            } else {
                e(fFloatValue2, fFloatValue3);
            }
            arrayList2.add(new HwHealthBaseEntry(0.0f, fFloatValue3));
            arrayList2.add(new HwHealthBaseEntry(100.0f, fFloatValue2));
        } else {
            ArrayList arrayList3 = new ArrayList(3);
            arrayList3.add(arrayList.get(0));
            arrayList3.add(arrayList.get(1));
            arrayList3.add(arrayList.get(2));
            e(((Float) Collections.min(arrayList3)).floatValue() - 5.0f, ((Float) Collections.max(arrayList3)).floatValue() + 5.0f);
            arrayList2 = e(arrayList3);
        }
        a(arrayList2);
    }

    private List<HwHealthBaseEntry> e(List<Float> list) {
        if (list == null || list.size() < 3) {
            LogUtil.j("FunctionSetWeightCardReader", "initDataOffset list is null or size less than three");
            return null;
        }
        float fFloatValue = list.get(0).floatValue();
        float fFloatValue2 = list.get(1).floatValue();
        float fFloatValue3 = list.get(2).floatValue();
        float f2 = ((fFloatValue + fFloatValue2) + fFloatValue3) / 3.0f;
        float fA = a(fFloatValue, f2);
        float fA2 = a(fFloatValue2, f2);
        float fA3 = a(fFloatValue3, f2);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new HwHealthBaseEntry(0.0f, fA3));
        arrayList.add(new HwHealthBaseEntry(50.0f, fA2));
        arrayList.add(new HwHealthBaseEntry(100.0f, fA));
        return arrayList;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public View createCardView() {
        boolean zA = iuo.a();
        ReleaseLogUtil.d("TimeEat_FunctionSetWeightCardReader", "createCardView fatReductionShapingState ", Boolean.valueOf(zA));
        ArrayList<Float> arrayList = this.n;
        if ((arrayList == null || arrayList.isEmpty()) && !zA) {
            LogUtil.j("FunctionSetWeightCardReader", "createCardView mLineChartDataList is empty");
            return null;
        }
        e();
        b(this.n);
        LogUtil.a("FunctionSetWeightCardReader", "createCardView mHealthViewLineChart is ", this.h);
        return this.h;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        this.f = false;
        ReleaseLogUtil.d("TimeEat_FunctionSetWeightCardReader", "onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime), " mLastUpdateDietRecordTime ", Long.valueOf(this.m));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public boolean isNeedRefreshOnResume() {
        if (super.isNeedRefreshOnResume()) {
            return true;
        }
        if (this.f) {
            return false;
        }
        FunctionSetBean functionSetBean = getFunctionSetBean();
        if (functionSetBean != null) {
            boolean zA = a();
            LogUtil.a("FunctionSetWeightCardReader", "onResume mIsShowCardRedDot ", Boolean.valueOf(this.g), " isShowCardRedDot ", Boolean.valueOf(zA));
            boolean z = this.g;
            if ((z && !zA) || (!z && zA)) {
                functionSetBean.a(zA);
                this.g = zA;
            }
            if (this.r != UnitUtil.c() && d(this.l)) {
                double dA = UnitUtil.a(this.l, 2);
                functionSetBean.c(UnitUtil.c(dA, 1, 1, 2, null));
                functionSetBean.h(a(dA));
            }
            functionSetBean.b(a(functionSetBean.r()));
            notifyItemChanged(functionSetBean);
        }
        if (iuo.a()) {
            vgo vgoVarC = iuo.c();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (vgoVarC == null || !lsl.aa(this.m) || Math.abs(jCurrentTimeMillis - this.m) > 60000) {
                int iA = DateFormatUtil.a(jCurrentTimeMillis);
                vil.d(iA, iA, (ResponseCallback<List<vgo>>) new b(this));
            } else {
                b(vgoVarC);
            }
        }
        return false;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onDestroy() {
        super.onDestroy();
        unsubscribeDataChange();
        d dVar = this.j;
        if (dVar != null) {
            dVar.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public void onCardViewClickListener(FunctionSetBean.ViewType viewType) {
        String str;
        d();
        ((UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class)).clickRecord(CommonUtils.j(AnalyticsValue.HEALTH_HOME_WIGHT_DETAIL_2010023.value()), getHuid());
        if (iuo.a()) {
            str = "heat_gap";
        } else if (this.l > 0.0d) {
            str = "trend_chart";
        } else {
            str = "empty_state";
        }
        if (!VersionControlUtil.isSupportActivityTransitionAnimation((Activity) this.mContext) || isShowHomePageRecommendLayout()) {
            Bundle bundle = new Bundle();
            bundle.putString("entranceType", str);
            bundle.putLong("lastDataTime", this.i);
            bundle.putString("from", "1");
            vng.e(bundle);
            return;
        }
        StringBuilder sb = new StringBuilder("#/home?isMainUser=true&uid=");
        if (this.i > 0) {
            sb.append("&lastDataTime=");
            sb.append(this.i);
        }
        sb.append("&from=1&entranceType=");
        sb.append(str);
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath(sb.toString());
        tfc.d(this.mContext, new H5ProCommand.Builder().setupLoad().setPackageName("com.huawei.health.h5.weight").setLaunchOption(H5proUtil.buildOption("com.huawei.health.h5.weight", builder)).build(), this.mCardViewHolder.itemView);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public void onBottomLayoutClickListener(ViewGroup viewGroup) {
        if (viewGroup == null) {
            LogUtil.j("FunctionSetWeightCardReader", "relativeLayout is null");
        } else {
            viewGroup.setClickable(true);
            viewGroup.setOnClickListener(new View.OnClickListener() { // from class: skv.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (qrs.r()) {
                        LogUtil.j("FunctionSetWeightCardReader", "onBottomLayoutClickListener is fast click");
                    } else {
                        LogUtil.a("FunctionSetWeightCardReader", "goToDietDiaryFastRecord");
                        iun.i("FunctionSetWeightCardReader");
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public void onSingleViewClickListener(ViewGroup viewGroup) {
        if (viewGroup == null) {
            LogUtil.j("FunctionSetWeightCardReader", "view is null");
        } else {
            viewGroup.setClickable(true);
            viewGroup.setOnClickListener(new View.OnClickListener() { // from class: skv.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (qrs.r()) {
                        LogUtil.j("FunctionSetWeightCardReader", "onSingleViewClickListener is fast click");
                    } else {
                        LogUtil.a("FunctionSetWeightCardReader", "goTo recognize h5 loading page");
                        AppRouter.e(Uri.parse("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.diet-diary?h5pro=true&urlType=4&path=photoIdentify&from=1&isImmerse")).b(skv.this.mContext);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean a() {
        if (f48292a) {
            return true;
        }
        if (CompileParameterUtil.c("SUPPORT_WIFI_WEIGHT_DEVICE", false)) {
            return ClaimWeightDataManager.INSTANCE.isShowRedTip();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable a(FunctionSetBean.ViewType viewType) {
        if (viewType != FunctionSetBean.ViewType.DATA_VIEW) {
            return null;
        }
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.b());
        if (!loginInit.getIsLogined() || loginInit.isMinorAccount() || Utils.o()) {
            return null;
        }
        return qre.c(R.drawable.recognization_logo);
    }

    private static boolean b() {
        if (!"".equals(SharedPreferenceManager.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), String.valueOf(10000), "IS_CARD_USED_KEY"))) {
            return false;
        }
        LogUtil.a("FunctionSetWeightCardReader", "card is not used before");
        return true;
    }

    static class f extends FunctionSetBeanReader.e {
        f(String str, FunctionSetBeanReader functionSetBeanReader) {
            super(str, functionSetBeanReader);
        }

        @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader.e, com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            ReleaseLogUtil.d("TimeEat_FunctionSetWeightCardReader", "WeightSubscribeListener onChange type ", Integer.valueOf(i), " changeKey ", str);
            if (i == HiSubscribeType.f12259a && ArkUIXConstants.DELETE.equals(str)) {
                iuo.b(0L);
            }
            if (i == 103) {
                if ("900300022".equals(str)) {
                    vil.d();
                    return;
                }
                return;
            }
            if (i == HiSubscribeType.f12259a) {
                iuo.s();
                iuo.w();
            }
            if (i == DicDataTypeUtil.DataType.RESTING_METABOLISM_SET.value() || i == DicDataTypeUtil.DataType.CURRENT_BASAL_METABOLISM_SET.value() || i == DicDataTypeUtil.DataType.BASAL_METABOLISM_AFTER_EXERCISE_SET.value()) {
                iuo.p();
            }
            super.onChange(i, hiHealthClient, str, hiHealthData, j);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getDefaultLargeCardImageRes() {
        return Integer.toString(R.drawable.pic_health_weight);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getDefaultImage(boolean z) {
        if (z) {
            return R.drawable.weight_default_img_big;
        }
        return R.drawable.marketing_default_img_weight;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getButtonColorId() {
        if (qqs.e(this.mContext)) {
            return R.color.function_marketing_big_card_weight_dark;
        }
        return R.color.function_marketing_big_card_weight;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getButtonTextId() {
        return R.string.IDS_function_set_card_button_weight;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public HandleCacheDataRunnable getRunnable() {
        return this.f48293b;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getChildTag() {
        return "FunctionSetWeightCardReader";
    }
}
