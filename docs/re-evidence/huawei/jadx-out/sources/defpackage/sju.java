package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.h5pro.core.H5ProCommand;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.health.utils.functionsetcard.FunctionSetBean;
import com.huawei.health.health.utils.functionsetcard.FunctionSetType;
import com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.pressure.PressureApi;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.userprofilemgr.model.HealthRecordCbk;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.main.stories.health.util.BloodPressureUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes43.dex */
public class sju extends FunctionSetBeanReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Integer> f48212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f48213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f48214c;
    private a d;
    private View e;
    private boolean f;
    private boolean g;
    private long h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private HiDataReadResultListener m;
    private int n;
    private int o;
    private long p;
    private boolean s;

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public boolean isSubscribeType(int i) {
        return i == 700017;
    }

    static class d extends HandleCacheDataRunnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<sju> f48218c;
        private boolean e;

        d(sju sjuVar) {
            super("FunctionSetHealthCardReader", null);
            this.f48218c = new WeakReference<>(sjuVar);
        }

        void d(HiHealthData hiHealthData) {
            HiHealthData hiHealthData2;
            if (hiHealthData != null) {
                sju.setHasCardData(this.f48218c, true);
                hiHealthData2 = new HiHealthData();
                hiHealthData2.setStartTime(hiHealthData.getStartTime());
                hiHealthData2.putBoolean("isShowRedDot", hiHealthData.getBoolean("isShowRedDot"));
                hiHealthData2.setEndTime(hiHealthData.getEndTime());
                hiHealthData2.putLong("_t", hiHealthData.getStartTime());
                hiHealthData2.putLong("ReportTime", hiHealthData.getLong("ReportTime"));
                hiHealthData2.putInt("Report_Number", hiHealthData.getInt("Report_Number"));
                hiHealthData2.putInt("CardType", hiHealthData.getInt("CardType"));
                hiHealthData2.putLong("testReportTime", hiHealthData.getLong("testReportTime"));
                hiHealthData2.putInt("TestExceptionNumber", hiHealthData.getInt("TestExceptionNumber"));
                hiHealthData2.putInt("TestTotalNumber", hiHealthData.getInt("TestTotalNumber"));
                hiHealthData2.putInt("_u", hiHealthData.toString().hashCode());
            } else {
                sju.setHasCardData(this.f48218c, false);
                hiHealthData2 = null;
            }
            sju.saveDataFromHealthApi("FunctionSetHealthCardReader", this.f48218c, hiHealthData2);
        }

        @Override // com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable
        public void handleCacheData(HiHealthData hiHealthData, boolean z) {
            sju sjuVar = this.f48218c.get();
            if (sjuVar == null) {
                LogUtil.j("FunctionSetHealthCardReader", "handleCacheData reader is null");
                return;
            }
            if (hiHealthData == null) {
                if (this.e && z) {
                    sjuVar.c();
                    return;
                }
                return;
            }
            this.e = true;
            sjuVar.n = hiHealthData.getInt("CardType");
            sjuVar.k = hiHealthData.getInt("Report_Number");
            sjuVar.l = hiHealthData.getInt("TestExceptionNumber");
            sjuVar.o = hiHealthData.getInt("TestTotalNumber");
            sjuVar.h = hiHealthData.getLong("ReportTime");
            sjuVar.p = hiHealthData.getLong("testReportTime");
            sjuVar.i = hiHealthData.getBoolean("isShowRedDot");
            sjuVar.b(z, hiHealthData.getInt("_u"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("FunctionSetHealthCardReader", "show empty view!");
        FunctionSetBean functionSetBeanBuildEmptyCardBean = buildEmptyCardBean();
        Message messageObtainMessage = this.d.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = functionSetBeanBuildEmptyCardBean;
        this.d.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z, int i) {
        setHasCardData(true);
        FunctionSetBean functionSetBeanD = d();
        functionSetBeanD.a(this.i);
        functionSetBeanD.d(i);
        setFunctionSetBean(functionSetBeanD);
        if (z) {
            Message messageObtainMessage = this.d.obtainMessage();
            messageObtainMessage.what = 1;
            messageObtainMessage.obj = functionSetBeanD;
            this.d.sendMessage(messageObtainMessage);
            return;
        }
        refreshCardBySp(functionSetBeanD);
    }

    public sju(Context context, CardConfig cardConfig) {
        super(context, "FunctionSetHealthCardReader", cardConfig);
        this.g = true;
        this.f = false;
        this.n = 0;
        this.j = false;
        this.k = 0;
        this.s = false;
        this.l = 0;
        this.o = 0;
        this.f48213b = new ArrayList(1);
        this.f48212a = null;
        this.d = new a(this);
        d dVar = new d(this);
        this.f48214c = dVar;
        this.m = new c(dVar, this.d, this);
        subscribeDataChange();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void subscribeDataChange() {
        LogUtil.a("FunctionSetHealthCardReader", "subscribeHealthRecordData");
        this.f48213b.add(700017);
        HiHealthNativeApi.a(this.mContext).subscribeHiHealthData(this.f48213b, new FunctionSetBeanReader.e("FunctionSetHealthCardReader", this));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void unsubscribeDataChange() {
        LogUtil.a("FunctionSetHealthCardReader", "unSubscribeHealthRecordData");
        List<Integer> list = this.f48212a;
        if (list == null || list.isEmpty()) {
            return;
        }
        HiHealthNativeApi.a(this.mContext).unSubscribeHiHealthData(this.f48212a, new FunctionSetBeanReader.c("FunctionSetHealthCardReader", "unSubscribeHealthRecordData, isSuccess:"));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public final void readCardData() {
        super.readCardData();
        LogUtil.a("FunctionSetHealthCardReader", "readCardData start");
        HiHealthManager.d(this.mContext).readHiHealthDataPro(HiDataReadProOption.builder().e(e()).a(1).b(), new c(this.f48214c, this.d, this));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        this.g = false;
        ReleaseLogUtil.d("TimeEat_FunctionSetHealthCardReader", "onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public boolean isNeedRefreshOnResume() {
        return !this.g;
    }

    static class a extends BaseHandler<sju> {
        a(sju sjuVar) {
            super(Looper.getMainLooper(), sjuVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(sju sjuVar, Message message) {
            if (message.what == 1) {
                LogUtil.a("FunctionSetHealthCardReader", "handleMessageWhenReferenceNotNull");
                sjuVar.notifyItemChanged((FunctionSetBean) message.obj);
            } else {
                LogUtil.j("FunctionSetHealthCardReader", "unkonw msg");
            }
        }
    }

    public static class c implements HiDataReadResultListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<a> f48215c;
        private WeakReference<d> d;
        private final WeakReference<sju> e;

        private c(d dVar, a aVar, sju sjuVar) {
            this.e = new WeakReference<>(sjuVar);
            this.d = new WeakReference<>(dVar);
            this.f48215c = new WeakReference<>(aVar);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            sju sjuVar = this.e.get();
            if (sjuVar == null) {
                LogUtil.j("FunctionSetHealthCardReader", "handleCacheData reader is null");
                return;
            }
            HiHealthData hiHealthData = new HiHealthData();
            if (i == 0) {
                List list = sjuVar.getList(obj, 700017);
                if (coq.d(list)) {
                    LogUtil.j("FunctionSetHealthCardReader", "handleCacheData reader is null");
                    if (Utils.o() || LoginInit.getInstance(BaseApplication.b()).isBrowseMode()) {
                        a(this.d, this.f48215c, sjuVar);
                        return;
                    } else {
                        d(sjuVar, hiHealthData);
                        return;
                    }
                }
                HiHealthData hiHealthData2 = (HiHealthData) list.get(0);
                SharedPreferenceManager.c("privacy_center", "health_record", String.valueOf(hiHealthData2.getStartTime()));
                e(sjuVar, hiHealthData, hiHealthData2);
                return;
            }
            LogUtil.j("FunctionSetHealthCardReader", "microTest data errorCode is : ", Integer.valueOf(i));
            a(this.d, this.f48215c, sjuVar);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0079  */
        private void e(sju sjuVar, HiHealthData hiHealthData, HiHealthData hiHealthData2) {
            int iOptInt;
            int i;
            boolean zIsEmpty;
            int i2;
            String metaData = hiHealthData2.getMetaData();
            if (TextUtils.isEmpty(metaData)) {
                LogUtil.j("FunctionSetHealthCardReader", "microTest metaData is empty");
                return;
            }
            boolean z = false;
            long jOptLong = 0;
            try {
                JSONObject jSONObject = new JSONObject(metaData);
                jOptLong = jSONObject.optLong("generateTime") * 1000;
                zIsEmpty = TextUtils.isEmpty(jSONObject.optString("extendData"));
                try {
                    if (jSONObject.has("totalNum") && jSONObject.has("abnormalNum")) {
                        int iOptInt2 = jSONObject.optInt("abnormalNum");
                        try {
                            i2 = iOptInt2;
                            iOptInt = jSONObject.optInt("totalNum");
                            sjuVar.a(i2, iOptInt);
                        } catch (JSONException unused) {
                            i = iOptInt2;
                            iOptInt = 0;
                            z = zIsEmpty;
                            LogUtil.e("FunctionSetHealthCardReader", "healthRecordMetaData get fail");
                            zIsEmpty = z;
                            i2 = i;
                            hiHealthData.putInt("CardType", 2);
                            if (i2 > 0) {
                                hiHealthData.putInt("CardType", 3);
                            }
                            hiHealthData.putLong("testReportTime", jOptLong);
                            hiHealthData.putInt("TestExceptionNumber", i2);
                            hiHealthData.putInt("TestTotalNumber", iOptInt);
                            hiHealthData.putBoolean("isShowRedDot", zIsEmpty);
                            a(this.d, this.f48215c, hiHealthData);
                        }
                        hiHealthData.putInt("CardType", 2);
                        if (i2 > 0) {
                            hiHealthData.putInt("CardType", 3);
                        }
                        hiHealthData.putLong("testReportTime", jOptLong);
                        hiHealthData.putInt("TestExceptionNumber", i2);
                        hiHealthData.putInt("TestTotalNumber", iOptInt);
                        hiHealthData.putBoolean("isShowRedDot", zIsEmpty);
                        a(this.d, this.f48215c, hiHealthData);
                    }
                    int[] iArrE = e(jSONObject);
                    i = iArrE[0];
                    try {
                        iOptInt = iArrE[1];
                        i2 = i;
                        try {
                            sjuVar.a(i2, iOptInt);
                        } catch (JSONException unused2) {
                            i = i2;
                            z = zIsEmpty;
                            LogUtil.e("FunctionSetHealthCardReader", "healthRecordMetaData get fail");
                            zIsEmpty = z;
                            i2 = i;
                        }
                    } catch (JSONException unused3) {
                        iOptInt = 0;
                        z = zIsEmpty;
                        LogUtil.e("FunctionSetHealthCardReader", "healthRecordMetaData get fail");
                        zIsEmpty = z;
                        i2 = i;
                        hiHealthData.putInt("CardType", 2);
                        if (i2 > 0) {
                            hiHealthData.putInt("CardType", 3);
                        }
                        hiHealthData.putLong("testReportTime", jOptLong);
                        hiHealthData.putInt("TestExceptionNumber", i2);
                        hiHealthData.putInt("TestTotalNumber", iOptInt);
                        hiHealthData.putBoolean("isShowRedDot", zIsEmpty);
                        a(this.d, this.f48215c, hiHealthData);
                    }
                    hiHealthData.putInt("CardType", 2);
                    if (i2 > 0) {
                        hiHealthData.putInt("CardType", 3);
                    }
                    hiHealthData.putLong("testReportTime", jOptLong);
                    hiHealthData.putInt("TestExceptionNumber", i2);
                    hiHealthData.putInt("TestTotalNumber", iOptInt);
                    hiHealthData.putBoolean("isShowRedDot", zIsEmpty);
                    a(this.d, this.f48215c, hiHealthData);
                } catch (JSONException unused4) {
                    iOptInt = 0;
                    i = 0;
                }
            } catch (JSONException unused5) {
                iOptInt = 0;
                i = 0;
            }
            LogUtil.e("FunctionSetHealthCardReader", "healthRecordMetaData get fail");
            zIsEmpty = z;
            i2 = i;
            hiHealthData.putInt("CardType", 2);
            if (i2 > 0) {
                hiHealthData.putInt("CardType", 3);
            }
            hiHealthData.putLong("testReportTime", jOptLong);
            hiHealthData.putInt("TestExceptionNumber", i2);
            hiHealthData.putInt("TestTotalNumber", iOptInt);
            hiHealthData.putBoolean("isShowRedDot", zIsEmpty);
            a(this.d, this.f48215c, hiHealthData);
        }

        private int[] e(JSONObject jSONObject) {
            int iC;
            Iterator<String> itKeys = jSONObject.keys();
            int i = 0;
            int i2 = 0;
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.contains("AbnormalFlag")) {
                    int iOptInt = jSONObject.optInt(next);
                    if (next.equals("vascularAbnormalFlag")) {
                        i2 = jSONObject.optInt("vascularType") == 0 ? i2 + 2 : i2 + 1;
                        if (iOptInt > 1) {
                            iC = c(iOptInt);
                            i += iC;
                        }
                    } else if (next.equals("breathAbnormalFlag")) {
                        i2 = jSONObject.optInt("breathType") == 0 ? i2 + 3 : i2 + 1;
                        if (iOptInt > 1) {
                            iC = c(iOptInt);
                            i += iC;
                        }
                    } else {
                        i2++;
                        if (iOptInt > 1) {
                            i++;
                        }
                    }
                }
            }
            return new int[]{i, i2};
        }

        private int c(int i) {
            String strSubstring = Integer.toBinaryString(i).substring(0, Integer.toBinaryString(i).length() - 1);
            int i2 = 0;
            for (int i3 = 0; i3 < strSubstring.length(); i3++) {
                if (strSubstring.charAt(i3) == '1') {
                    i2++;
                }
            }
            return i2;
        }

        private void d(final sju sjuVar, final HiHealthData hiHealthData) {
            ((UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class)).queryHealthRecords(0, HiDateUtil.d(System.currentTimeMillis()), new HealthRecordCbk<List<ioe>>() { // from class: sju.c.2
                @Override // com.huawei.health.userprofilemgr.model.HealthRecordCbk
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<ioe> list) {
                    boolean z;
                    if (list.size() == 0) {
                        c cVar = c.this;
                        cVar.a((WeakReference<d>) cVar.d, (WeakReference<a>) c.this.f48215c, sjuVar);
                        return;
                    }
                    LogUtil.a("FunctionSetHealthCardReader", "report number is ", Integer.valueOf(list.size()));
                    Collections.sort(list, new Comparator<ioe>() { // from class: sju.c.2.2
                        @Override // java.util.Comparator
                        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                        public int compare(ioe ioeVar, ioe ioeVar2) {
                            return Long.compare(ioeVar2.d(), ioeVar.d());
                        }
                    });
                    for (ioe ioeVar : list) {
                        if (ioeVar.a() != null && !ioeVar.a().contains(CommonUtil.READ_FLAG)) {
                            z = true;
                            long jD = list.get(0).d();
                            SharedPreferenceManager.c("privacy_center", "health_record", String.valueOf(HiDateUtil.a((int) jD)));
                            hiHealthData.putLong("ReportTime", jD);
                            hiHealthData.putInt("CardType", 1);
                            hiHealthData.putInt("Report_Number", list.size());
                            hiHealthData.putBoolean("isShowRedDot", z);
                            sjuVar.c(list.size());
                            c cVar2 = c.this;
                            cVar2.a((WeakReference<d>) cVar2.d, (WeakReference<a>) c.this.f48215c, hiHealthData);
                        }
                    }
                    z = false;
                    long jD2 = list.get(0).d();
                    SharedPreferenceManager.c("privacy_center", "health_record", String.valueOf(HiDateUtil.a((int) jD2)));
                    hiHealthData.putLong("ReportTime", jD2);
                    hiHealthData.putInt("CardType", 1);
                    hiHealthData.putInt("Report_Number", list.size());
                    hiHealthData.putBoolean("isShowRedDot", z);
                    sjuVar.c(list.size());
                    c cVar3 = c.this;
                    cVar3.a((WeakReference<d>) cVar3.d, (WeakReference<a>) c.this.f48215c, hiHealthData);
                }

                @Override // com.huawei.health.userprofilemgr.model.HealthRecordCbk
                public void onFailure(int i, String str) {
                    LogUtil.a("FunctionSetHealthCardReader", "readReportData onFailure");
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(WeakReference<d> weakReference, WeakReference<a> weakReference2, sju sjuVar) {
            sjuVar.n = 0;
            d dVar = weakReference.get();
            if (weakReference2.get() == null) {
                LogUtil.e("FunctionSetHealthCardReader", "handler is null");
            } else if (dVar == null) {
                LogUtil.e("FunctionSetHealthCardReader", "runnable is null");
            } else {
                dVar.d(null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(WeakReference<d> weakReference, WeakReference<a> weakReference2, HiHealthData hiHealthData) {
            d dVar = weakReference.get();
            if (weakReference2.get() == null) {
                LogUtil.e("FunctionSetHealthCardReader", "handler is null");
            } else if (dVar == null) {
                LogUtil.e("FunctionSetHealthCardReader", "runnable is null");
            } else {
                dVar.d(hiHealthData);
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            LogUtil.a("FunctionSetHealthCardReader", "onResultIntent");
        }
    }

    private HiDataReadOption e() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setCount(1);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setStartTime(0L);
        hiDataReadOption.setEndTime(jCurrentTimeMillis);
        hiDataReadOption.setType(new int[]{700017});
        return hiDataReadOption;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onDestroy() {
        super.onDestroy();
        unsubscribeDataChange();
        a aVar = this.d;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void initCardData() {
        sis.e().d(this.m);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void updateSuccessList(List<Integer> list) {
        LogUtil.a("FunctionSetHealthCardReader", "subscribeHealthRecordData, onResult");
        if (list == null || list.isEmpty()) {
            return;
        }
        LogUtil.a("FunctionSetHealthCardReader", "registerHealthRecordListener success");
        this.f48212a = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        this.l = i;
        this.o = i2;
        if (i == 0) {
            this.n = 2;
        } else {
            this.n = 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        this.k = i;
        this.n = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FunctionSetBean d() {
        String strE;
        CharSequence charSequenceD;
        CharSequence charSequence;
        CharSequence charSequence2;
        setBiHasData(this.h);
        if (this.n == 1) {
            long jD = DateFormatUtil.d((int) this.h);
            int i = this.k;
            CharSequence charSequenceB = tfc.b(jD);
            CharSequence charSequenceF = qre.f(R.string.IDS_health_report_examination);
            strE = qre.e(com.huawei.ui.commonui.R.plurals.IDS_health_report_number, i, UnitUtil.e(i, 1, 0));
            charSequenceD = tfc.d(jD);
            charSequence2 = charSequenceB;
            charSequence = charSequenceF;
        } else {
            strE = "";
            charSequenceD = strE;
            CharSequence charSequence3 = charSequenceD;
            charSequence = charSequence3;
            charSequence2 = charSequence3;
        }
        String str = charSequence2;
        CharSequence charSequence4 = charSequence;
        if (this.n == 3) {
            long j = this.p;
            String strB = tfc.b(j);
            CharSequence charSequenceF2 = qre.f(R.string.IDS_health_examination);
            int i2 = this.l;
            strE = qre.e(com.huawei.ui.commonui.R.plurals.IDS_health_exception_number, i2, UnitUtil.e(i2, 1, 0));
            charSequenceD = tfc.d(j);
            str = strB;
            charSequence4 = charSequenceF2;
        }
        String str2 = str;
        CharSequence charSequence5 = charSequence4;
        if (this.n == 2) {
            long j2 = this.p;
            String strB2 = tfc.b(j2);
            CharSequence charSequenceF3 = qre.f(R.string.IDS_health_examination);
            int i3 = this.o;
            strE = qre.e(com.huawei.ui.commonui.R.plurals.IDS_health_examination_number, i3, UnitUtil.e(i3, 1, 0));
            charSequenceD = tfc.d(j2);
            str2 = strB2;
            charSequence5 = charSequenceF3;
        }
        return new FunctionSetBean.c("").b(this.mContext).e(FunctionSetType.HEALTH_RECORD_CARD).d(str2).d(charSequence5).g(charSequenceD).c(FunctionSetBean.ViewType.DATA_VIEW).e(c(strE)).a();
    }

    private CharSequence c(String str) {
        int i = this.n;
        if (i == 1) {
            return c(str, this.k);
        }
        if (i == 3) {
            return c(str, this.l);
        }
        return i == 2 ? c(str, this.o) : str;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public FunctionSetBean buildEmptyCardBean() {
        return new FunctionSetBean.c(this.mContext.getResources().getString(R.string.IDS_health_record)).e(FunctionSetType.HEALTH_RECORD_CARD).c(FunctionSetBean.ViewType.EMPTY_VIEW).c(this.mContext.getResources().getString(R.string.IDS_health_onekey_examination)).b(this.mContext).a();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public View createCardView() {
        LogUtil.a("FunctionSetHealthCardReader", "createCardView");
        if (this.n == 1) {
            View viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.card_healthrecord_view, (ViewGroup) null);
            this.e = viewInflate;
            ((ImageView) viewInflate.findViewById(R.id.barchart)).setImageResource(R.drawable.health_card_report);
        }
        if (this.n == 3) {
            View viewInflate2 = LayoutInflater.from(this.mContext).inflate(R.layout.card_healthrecord_view, (ViewGroup) null);
            this.e = viewInflate2;
            ((ImageView) viewInflate2.findViewById(R.id.barchart)).setImageResource(R.drawable.health_card_entrance);
        }
        if (this.n == 2) {
            View viewInflate3 = LayoutInflater.from(this.mContext).inflate(R.layout.card_healthrecord_view, (ViewGroup) null);
            this.e = viewInflate3;
            ((ImageView) viewInflate3.findViewById(R.id.barchart)).setImageResource(R.drawable.health_card_entrance);
        }
        return this.e;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public void onCardViewClickListener(FunctionSetBean.ViewType viewType) {
        LogUtil.a("FunctionSetHealthCardReader", "go to Health Record CARD record");
        if (qrs.c(500)) {
            return;
        }
        if (LoginInit.getInstance(BaseApplication.b()).isBrowseMode()) {
            LoginInit.getInstance(BaseApplication.b()).browsingToLogin(new IBaseResponseCallback() { // from class: sjw
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f48221b.a(i, obj);
                }
            }, "");
        } else {
            a();
        }
    }

    /* synthetic */ void a(int i, Object obj) {
        if (i == 0) {
            a();
        }
    }

    private void a() {
        if (njy.e(fdm.d().j())) {
            BloodPressureUtil.i();
        }
        if (!VersionControlUtil.isSupportActivityTransitionAnimation((Activity) this.mContext) || isShowHomePageRecommendLayout()) {
            ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).gotoH5HealthRecord(this.mContext, "0", String.valueOf(this.n));
            return;
        }
        ddv.b().initH5Pro();
        tfc.d(this.mContext, new H5ProCommand.Builder().setupLoad().setPackageName("com.huawei.health.h5.health-record").setLaunchOption(H5proUtil.buildOption("com.huawei.health.h5.health-record", new H5ProLaunchOption.Builder().setImmerse().showStatusBar().setNeedSoftInputAdapter().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("JsInteraction", ddv.b().getCommonJsModule("JsInteraction")).addCustomizeJsModule("device", ddv.b().getCommonJsModule("device")).addCustomizeJsModule("PressureNewJsApi", ((PressureApi) Services.b("Main", PressureApi.class)).getPressureNewJsApi()).addCustomizeArg("examinationId", "0").addPath("#/?from=2&cardType=" + String.valueOf(this.n)))).build(), this.mCardViewHolder.itemView);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, FunctionSetSubCardData functionSetSubCardData) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onBindViewHolder(viewHolder, functionSetSubCardData);
        FunctionSetBeanReader.MyHolder myHolder = (FunctionSetBeanReader.MyHolder) viewHolder;
        if (myHolder.f7091a == null) {
            return;
        }
        if (fua.b(this.mContext)) {
            myHolder.f7091a.setSingleLine(false);
            myHolder.f7091a.setMaxLines(3);
        }
        ReleaseLogUtil.d("TimeEat_FunctionSetHealthCardReader", "onBindViewHolder finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private CharSequence c(String str, int i) {
        return tfc.d(str, UnitUtil.e(i, 1, 0));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getDefaultLargeCardImageRes() {
        return Integer.toString(R.drawable.health_card_oversea);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getDefaultImage(boolean z) {
        if (z) {
            return R.drawable.health_card_default_img;
        }
        return R.drawable.health_card_default_img_small;
    }

    private long b() {
        int i = this.n;
        if (i == 0) {
            return 0L;
        }
        if (i == 1) {
            return this.h;
        }
        return HiDateUtil.d(this.p);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public void reportCustomBiEvent() {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("cardType", Integer.valueOf(this.n));
        map.put("reportDate", Long.valueOf(b()));
        LogUtil.a("FunctionSetHealthCardReader", "uploadBiEvent card visible, FUNCTION_CARD_2010226: ", map.toString());
        lmf.d().c(this.mContext, AnalyticsValue.FUNCTION_CARD_2010226.value(), map, 0);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getButtonColorId() {
        return R.color.function_marketing_big_card_pressure;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getButtonTextId() {
        return R.string.IDS_function_set_card_button_blood_pressure;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public HandleCacheDataRunnable getRunnable() {
        return this.f48214c;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getChildTag() {
        return "FunctionSetHealthCardReader";
    }
}
