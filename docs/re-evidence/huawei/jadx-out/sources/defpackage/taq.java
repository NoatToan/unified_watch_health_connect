package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.health.health.utils.functionsetcard.FunctionSetBean;
import com.huawei.health.health.utils.functionsetcard.FunctionSetType;
import com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.HwSportTypeInfo;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.model.RelativeSportData;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwhealthdatamgr.sportrecordingstrategy.SportsRecordingBean;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginachievement.R;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.utils.ResInfo;
import com.huawei.ui.main.stories.history.SportHistoryActivity;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.DeviceUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes43.dex */
public class taq extends FunctionSetBeanReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f48876a;
    private String aa;
    private List<Integer> ab;
    private List<Integer> ac;
    private SportsRecordingBean ad;
    private ArrayMap<String, Integer> ah;
    private long ai;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CountDownLatch f48878c;
    private Bitmap d;
    private CountDownLatch e;
    private final b f;
    private long g;
    private String h;
    private List<String> i;
    private h j;
    private volatile boolean k;
    private boolean l;
    private c m;
    private WeakReference<ImageView> n;
    private boolean o;
    private boolean p;
    private a q;
    private long r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private OnFitnessStatusChangeCallback w;
    private f x;
    private WorkoutRecord y;
    private int z;

    static /* synthetic */ void c(int i, Object obj) {
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getDefaultLargeCardImageRes() {
        return null;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public boolean isMessageDefaultLargeCard() {
        return true;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public boolean isNeedRefreshOnResume() {
        return false;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public boolean isOverseaDefaultLargeCard() {
        return true;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public boolean isSubscribeType(int i) {
        return i == 4;
    }

    static class b extends HandleCacheDataRunnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Bitmap f48885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<taq> f48886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f48887c;
        private boolean d;
        private boolean e;
        private int i;

        b(taq taqVar) {
            super("SportsRecordingCardReader", null);
            this.f48886b = new WeakReference<>(taqVar);
        }

        void d(SportsRecordingBean sportsRecordingBean, boolean z, int i, Bitmap bitmap) throws Throwable {
            HiHealthData hiHealthData;
            this.d = true;
            if (sportsRecordingBean != null) {
                hiHealthData = new HiHealthData();
                hiHealthData.putString("_t", sportsRecordingBean.getSportTime());
                hiHealthData.putString("_d", sportsRecordingBean.getSportData());
                hiHealthData.putString("_u", sportsRecordingBean.getSportUnit());
                hiHealthData.putInt("_st", sportsRecordingBean.getShowType());
                hiHealthData.putBoolean("_", z);
                hiHealthData.putLong("_tl", sportsRecordingBean.getSportStartTime());
                hiHealthData.putBoolean("_c", sportsRecordingBean.isNeedConvertToTime());
                if (z) {
                    hiHealthData.putString("_n", sportsRecordingBean.getSportTypeName());
                } else {
                    hiHealthData.putInt("_s", i);
                }
                if (i == 222 || sportsRecordingBean.isNeedConvertToTime()) {
                    hiHealthData.putString("_n", sportsRecordingBean.getSportTypeName());
                    hiHealthData.putString("_k", sportsRecordingBean.getSportKeepTime());
                }
                if (sportsRecordingBean.getShowType() == 5) {
                    hiHealthData.putString("_n", sportsRecordingBean.getSportTypeName());
                }
                c(hiHealthData, bitmap);
            } else {
                hiHealthData = null;
            }
            taq.saveDataFromHealthApi("SportsRecordingCardReader", this.f48886b, hiHealthData);
        }

        boolean e(ImageView imageView) {
            Bitmap bitmap = this.f48885a;
            if (!this.d) {
                taq taqVar = this.f48886b.get();
                if (taqVar == null) {
                    LogUtil.e("SportsRecordingCardReader", "initCardView reader is null!");
                    return false;
                }
                if (bitmap == null) {
                    taqVar.b(imageView, this.e, this.i);
                    LogUtil.a("SportsRecordingCardReader", "initCardView bitmap is null, init with default pic");
                    return true;
                }
                imageView.setImageBitmap(bitmap);
                return true;
            }
            if (bitmap == null) {
                LogUtil.e("SportsRecordingCardReader", "initCardView bitmap is null!");
                return false;
            }
            Drawable drawable = imageView.getDrawable();
            if ((drawable instanceof BitmapDrawable) && bitmap == ((BitmapDrawable) drawable).getBitmap()) {
                imageView.setImageBitmap(null);
            }
            bitmap.recycle();
            this.f48885a = null;
            LogUtil.a("SportsRecordingCardReader", "initCardView to restore bitmap is invalid!");
            return false;
        }

        @Override // com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable
        public void handleCacheData(HiHealthData hiHealthData, boolean z) {
            taq taqVar = this.f48886b.get();
            if (taqVar == null || taqVar.j == null) {
                return;
            }
            if (hiHealthData == null) {
                taq.setHasCardData(this.f48886b, false);
                if (this.f48887c && z) {
                    taqVar.m();
                    return;
                }
                return;
            }
            c(hiHealthData, z, taqVar);
        }

        private void c(HiHealthData hiHealthData, boolean z, taq taqVar) {
            String str;
            CharSequence charSequenceA;
            long j = hiHealthData.getLong("_tl");
            if (j > 0 && gdv.d() > j) {
                ReleaseLogUtil.d("TimeEat_SportsRecordingCardReader", "refreshFromSpCache");
                MotionPathSimplify motionPathSimplifyE = gdv.e();
                if (motionPathSimplifyE != null) {
                    c(taqVar, motionPathSimplifyE);
                    gdv.c();
                    return;
                }
            }
            taq.setHasCardData(this.f48886b, true);
            this.f48887c = true;
            boolean z2 = hiHealthData.getBoolean("_");
            int i = z2 ? 10001 : hiHealthData.getInt("_s");
            if (!z && !this.d) {
                this.e = z2;
                this.i = i;
                this.f48885a = a(hiHealthData);
            }
            int i2 = hiHealthData.getInt("_st");
            String string = (z2 || i == 222 || i2 == 5) ? hiHealthData.getString("_n") : taqVar.b(i);
            String string2 = hiHealthData.getString("_u");
            boolean z3 = hiHealthData.getBoolean("_c");
            if (z3) {
                string2 = "";
            }
            if (i2 == 6) {
                charSequenceA = a(hiHealthData.getString("_d"));
                str = "";
            } else {
                CharSequence charSequenceE = e(i, hiHealthData.getString("_d"), hiHealthData.getString("_k"), z3);
                str = string2;
                charSequenceA = charSequenceE;
            }
            taqVar.b(e(i, hiHealthData.getString("_t")), charSequenceA, str, e(i, string), z, j);
        }

        private void c(taq taqVar, MotionPathSimplify motionPathSimplify) {
            CharSequence charSequenceE;
            int iRequestSportType = motionPathSimplify.requestSportType();
            if (motionPathSimplify.hasTrackPoint()) {
                this.f48885a = gdv.b();
            } else {
                this.f48885a = null;
            }
            SportsRecordingBean sportsRecordingBeanE = new nln().a(motionPathSimplify.requestChiefSportDataType(), iRequestSportType).e(motionPathSimplify);
            taq.setHasCardData(this.f48886b, true);
            boolean z = gdv.a() > der.e();
            LogUtil.a("SportsRecordingCardReader", "track cache is read: ", Boolean.valueOf(z));
            taqVar.p = z;
            this.f48887c = true;
            this.e = false;
            this.i = iRequestSportType;
            int showType = sportsRecordingBeanE.getShowType();
            String sportTypeName = sportsRecordingBeanE.getSportTypeName();
            String sportUnit = sportsRecordingBeanE.getSportUnit();
            boolean zIsNeedConvertToTime = sportsRecordingBeanE.isNeedConvertToTime();
            if (showType == 6) {
                charSequenceE = a(sportsRecordingBeanE.getSportData());
                sportUnit = "";
            } else {
                charSequenceE = e(iRequestSportType, sportsRecordingBeanE.getSportData(), sportsRecordingBeanE.getSportKeepTime(), zIsNeedConvertToTime);
            }
            taqVar.b(e(iRequestSportType, sportsRecordingBeanE.getSportTime()), charSequenceE, sportUnit, e(iRequestSportType, sportTypeName), true, sportsRecordingBeanE.getSportStartTime());
        }

        private CharSequence e(int i, String str) {
            return i != 222 ? str : pat.c(str, str, BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.emui_text_size_chart1));
        }

        private CharSequence e(int i, String str, String str2, boolean z) {
            if (z) {
                return izn.d(CommonUtils.i(str2), com.huawei.ui.homehealth.R.style.function_card_data_normal_Style, com.huawei.ui.homehealth.R.style.function_card_unit_normal_Style);
            }
            return i != 222 ? str : izn.c(CommonUtils.i(str2), com.huawei.ui.homehealth.R.style.sport_day_hour_min_num, com.huawei.ui.homehealth.R.style.sport_day_hour_min_unit);
        }

        private CharSequence a(String str) {
            Context context = BaseApplication.getContext();
            int iA = qrs.a(str);
            String strE = UnitUtil.e(iA, 1, 0);
            return tfc.d(context.getResources().getQuantityString(com.huawei.ui.homehealth.R.plurals.IDS_band_data_golf_count_unit, iA, strE), strE);
        }

        private Bitmap a(HiHealthData hiHealthData) {
            Bitmap bitmapA = hiHealthData.getBoolean("_b") ? qqf.a("SportsRecordingCardReader", true) : null;
            LogUtil.j("SportsRecordingCardReader", "restoreBitmap, read ret=", Boolean.valueOf(bitmapA != null));
            return bitmapA;
        }

        private void c(HiHealthData hiHealthData, Bitmap bitmap) throws Throwable {
            String strE;
            if (bitmap != null) {
                strE = qqf.e("SportsRecordingCardReader", bitmap, Bitmap.CompressFormat.PNG, true);
                if (strE != null) {
                    hiHealthData.putBoolean("_b", true);
                }
            } else {
                strE = null;
            }
            LogUtil.a("SportsRecordingCardReader", "saveBitmap, save ret=", Boolean.valueOf(strE != null));
        }
    }

    public taq(Context context, CardConfig cardConfig) {
        super(context, "SportsRecordingCardReader", cardConfig);
        this.s = false;
        this.j = null;
        this.u = false;
        this.r = 0L;
        this.o = false;
        this.m = new c(this);
        this.ai = 0L;
        this.g = 0L;
        this.z = 0;
        this.aa = "";
        this.v = 0;
        this.y = null;
        this.x = new f(this);
        this.q = new a();
        this.ab = new ArrayList(20);
        this.ac = null;
        this.t = false;
        this.p = false;
        this.e = null;
        this.f48878c = null;
        this.k = true;
        this.l = true;
        this.f = new b(this);
        this.ah = new ArrayMap<>();
        this.n = new WeakReference<>(null);
        this.j = new h(this);
        t();
    }

    public class h extends BaseHandler<taq> {
        private h(taq taqVar) {
            super(Looper.getMainLooper(), taqVar);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(taq taqVar, Message message) {
            if (taqVar == null || message == null) {
                LogUtil.e("SportsRecordingCardReader", "recordingCardReader or msg is null !");
                return;
            }
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    taq taqVar2 = taq.this;
                    taqVar2.notifyItemChanged(taqVar2.buildEmptyCardBean());
                    return;
                } else if (i == 3) {
                    taq.this.k = true;
                    return;
                } else if (i != 6) {
                    LogUtil.j("SportsRecordingCardReader", "handleMessageWhenReferenceNotNull default ", Integer.valueOf(message.what));
                    return;
                } else {
                    if (message.obj instanceof FunctionSetBean) {
                        taq.this.b(taqVar, (FunctionSetBean) message.obj);
                        return;
                    }
                    return;
                }
            }
            if (!(message.obj instanceof SportsRecordingBean)) {
                LogUtil.e("SportsRecordingCardReader", "data is null");
                return;
            }
            SportsRecordingBean sportsRecordingBean = (SportsRecordingBean) message.obj;
            taqVar.j = taq.this.j;
            LogUtil.a("SportsRecordingCardReader", "data.getSportType()", Integer.valueOf(sportsRecordingBean.getShowType()));
            int showType = sportsRecordingBean.getShowType();
            if (showType != 0) {
                if (showType != 2 && showType != 3) {
                    if (showType != 4) {
                        if (showType != 5) {
                            taq.this.d(sportsRecordingBean);
                            return;
                        }
                    }
                }
                taq.this.d = null;
                taq.this.r = sportsRecordingBean.getSportStartTime();
                taq.this.d(sportsRecordingBean);
                return;
            }
            taq.this.b(sportsRecordingBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Object obj) throws Throwable {
        MotionPathSimplify motionPathSimplify = obj instanceof MotionPathSimplify ? (MotionPathSimplify) obj : null;
        if (motionPathSimplify == null) {
            LogUtil.e("SportsRecordingCardReader", "LastTrackCallBack trackData is null");
            a();
            return;
        }
        RelativeSportData relativeSportDataRequestFatherSportItem = motionPathSimplify.requestFatherSportItem();
        if (relativeSportDataRequestFatherSportItem == null) {
            LogUtil.e("SportsRecordingCardReader", "Father data is null ");
            a(motionPathSimplify);
            this.t = true;
            a();
            return;
        }
        this.o = motionPathSimplify.hasTrackPoint();
        g gVar = new g(this);
        LogUtil.a("SportsRecordingCardReader", "StartTime = ", Long.valueOf(relativeSportDataRequestFatherSportItem.getStartTime()), " EndTime = ", Long.valueOf(relativeSportDataRequestFatherSportItem.getEndTime()));
        nkx.e().b(relativeSportDataRequestFatherSportItem.getStartTime(), relativeSportDataRequestFatherSportItem.getEndTime(), gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Object obj) throws Throwable {
        MotionPathSimplify motionPathSimplify = obj instanceof MotionPathSimplify ? (MotionPathSimplify) obj : null;
        if (motionPathSimplify == null) {
            LogUtil.e("SportsRecordingCardReader", "TrackForTriathlon trackData is null");
            a();
        } else {
            a(motionPathSimplify);
            this.t = true;
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj) {
        List list = njy.b(obj, HiHealthData.class) ? (List) obj : null;
        if (k()) {
            CountDownLatch countDownLatch = this.f48878c;
            if (countDownLatch != null) {
                countDownLatch.countDown();
                return;
            }
            return;
        }
        if (n()) {
            CountDownLatch countDownLatch2 = this.f48878c;
            if (countDownLatch2 != null) {
                countDownLatch2.countDown();
                return;
            }
            return;
        }
        if (njy.e(list)) {
            LogUtil.e("SportsRecordingCardReader", "all run data null or empty");
            this.p = false;
            CountDownLatch countDownLatch3 = this.f48878c;
            if (countDownLatch3 != null) {
                countDownLatch3.countDown();
                return;
            }
            return;
        }
        a((HiHealthData) list.get(0));
    }

    private boolean k() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "SPORT_CARD_RED_DOT_FOR_AUTO_TRACK");
        LogUtil.a("SportsRecordingCardReader", "isAutoTrackRedDot ", strE);
        if (!"true".equals(strE)) {
            return false;
        }
        this.p = true;
        return true;
    }

    private boolean n() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "HOME_HEALTH_SHOW_FITNESS_DOT");
        LogUtil.a("SportsRecordingCardReader", "isShowFitnessRedDot ", strE);
        if (!"true".equals(strE)) {
            return false;
        }
        this.p = true;
        return true;
    }

    private void a(HiHealthData hiHealthData) {
        long jI;
        if (hiHealthData == null) {
            LogUtil.e("SportsRecordingCardReader", "data is null");
            return;
        }
        int i = hiHealthData.getInt("wear_device_type_datas");
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "HOME_HEALTH_SHOW_DOT");
        LogUtil.a("SportsRecordingCardReader", "showRedDotStr is ", strE);
        long j = i;
        String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "HOME_HEALTH_TRACK_NUM");
        LogUtil.a("SportsRecordingCardReader", "trackNumString is ", strE2);
        if (strE2 == null || "".equals(strE2) || !der.e(strE2)) {
            jI = 0;
        } else {
            jI = CommonUtil.i(strE2);
            LogUtil.a("SportsRecordingCardReader", "trackNumLocal is ", Long.valueOf(jI));
        }
        LogUtil.a("SportsRecordingCardReader", "trackNumLocal is ", Long.valueOf(jI), "   trackNumData is ", Long.valueOf(j));
        if (jI != j) {
            strE = b(BaseApplication.getContext(), strE, jI, j);
        }
        String str = strE;
        long jG = g();
        long jE = der.e();
        if (jE > 0 && jG > 0 && d(jG, str, jE)) {
            CountDownLatch countDownLatch = this.f48878c;
            if (countDownLatch != null) {
                countDownLatch.countDown();
                return;
            }
            return;
        }
        if (e(jG, str)) {
            CountDownLatch countDownLatch2 = this.f48878c;
            if (countDownLatch2 != null) {
                countDownLatch2.countDown();
                return;
            }
            return;
        }
        this.p = false;
        CountDownLatch countDownLatch3 = this.f48878c;
        if (countDownLatch3 != null) {
            countDownLatch3.countDown();
        }
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "HOME_HEALTH_SHOW_DOT", String.valueOf(false), new StorageParams());
        LogUtil.a("SportsRecordingCardReader", "getSportsCardRedDot: not show red Dot fourth");
    }

    private long g() {
        String strC = DeviceUtil.c();
        if (StringUtils.j(strC) && der.e(strC)) {
            return CommonUtil.i(strC);
        }
        return 0L;
    }

    private boolean e(long j, String str) {
        if (j == 0) {
            this.p = false;
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "HOME_HEALTH_SHOW_DOT", "false", new StorageParams());
            LogUtil.a("SportsRecordingCardReader", "getSportsCardRedDot: not showRedDot third");
            return true;
        }
        if (!"true".equals(str)) {
            return false;
        }
        this.p = true;
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "HOME_HEALTH_SHOW_DOT", "true", new StorageParams());
        return true;
    }

    private boolean d(long j, String str, long j2) {
        LogUtil.a("SportsRecordingCardReader", "getSportsCardRedDot: intoActivityTime = ", Long.valueOf(j2));
        if (j > j2 && str != null && "true".equals(str)) {
            this.p = true;
            LogUtil.a("SportsRecordingCardReader", "getSportsCardRedDot: showRedDot first");
            return true;
        }
        if (j > j2 || str == null) {
            return false;
        }
        this.p = false;
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "HOME_HEALTH_SHOW_DOT", "false", new StorageParams());
        LogUtil.a("SportsRecordingCardReader", "getSportsCardRedDot: not showRedDot second");
        return true;
    }

    private String b(Context context, String str, long j, long j2) {
        SharedPreferenceManager.e(context, String.valueOf(10000), "HOME_HEALTH_TRACK_NUM", String.valueOf(j2), new StorageParams());
        if (j2 <= j) {
            return str;
        }
        SharedPreferenceManager.e(context, String.valueOf(10000), "HOME_HEALTH_SHOW_DOT", "true", new StorageParams());
        String strE = SharedPreferenceManager.e(context, String.valueOf(10000), "HOME_HEALTH_SHOW_DOT");
        LogUtil.a("SportsRecordingCardReader", "showRedDot is true");
        return strE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(SportsRecordingBean sportsRecordingBean) {
        if (sportsRecordingBean.getSportStartTime() == 0 || sportsRecordingBean.getSportEndTime() == 0) {
            return;
        }
        if (this.v == 4 || this.u) {
            LogUtil.a("SportsRecordingCardReader", "mNeedTryAgain ", Boolean.valueOf(this.u));
            a(sportsRecordingBean);
            return;
        }
        if ((this.r != sportsRecordingBean.getSportStartTime() && this.o) || this.u) {
            this.r = sportsRecordingBean.getSportStartTime();
            LogUtil.a("SportsRecordingCardReader", "mNeedTryAgain ", Boolean.valueOf(this.u));
            a(sportsRecordingBean);
            return;
        }
        LogUtil.a("SportsRecordingCardReader", "mLastStartTime", Long.valueOf(this.r), "data.getSportStartTime() ", Long.valueOf(sportsRecordingBean.getSportStartTime()), "mHasPoints ", Boolean.valueOf(this.o), "mNeedTryAgain", Boolean.valueOf(this.u), ", mShowType = ", Integer.valueOf(this.v), ", sportType = ", Integer.valueOf(sportsRecordingBean.getShowType()));
        d(sportsRecordingBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(taq taqVar, FunctionSetBean functionSetBean) {
        if (functionSetBean == null) {
            LogUtil.e("SportsRecordingCardReader", "putRedDotAndBitmapToBean, bean == null");
            return;
        }
        functionSetBean.a(this.p);
        if (taqVar.d != null) {
            LogUtil.a("SportsRecordingCardReader", "bitmap not null has track is true");
        }
        notifyItemChanged(functionSetBean);
    }

    static class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private SportsRecordingBean f48891c;
        private WeakReference<taq> d;

        e(taq taqVar, SportsRecordingBean sportsRecordingBean) {
            this.d = new WeakReference<>(taqVar);
            this.f48891c = sportsRecordingBean;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("SportsRecordingCardReader", "InnerBaseResponseCallback errCode = ", Integer.valueOf(i));
            taq taqVar = this.d.get();
            if (taqVar == null || taqVar.j == null) {
                return;
            }
            ArrayMap arrayMap = taqVar.ah;
            String str = this.f48891c.getSportStartTime() + "_" + this.f48891c.getSportEndTime();
            Integer num = (Integer) arrayMap.get(str);
            int iIntValue = num == null ? 0 : num.intValue();
            if (i != 303 || (arrayMap.containsKey(str) && (!arrayMap.containsKey(str) || iIntValue >= 3))) {
                if (i == 0) {
                    if (obj instanceof Bitmap) {
                        taqVar.d = (Bitmap) obj;
                        taqVar.a(taqVar.d);
                    }
                    LogUtil.a("SportsRecordingCardReader", "track pic is back hasTrack is true");
                    taqVar.u = false;
                    if (taqVar.ah != null) {
                        taqVar.ah.remove(str);
                    }
                } else {
                    LogUtil.a("SportsRecordingCardReader", "track pic is not back hasTrack is true");
                    taqVar.d = null;
                    taqVar.u = true;
                }
                taqVar.d(this.f48891c);
                return;
            }
            int i2 = iIntValue + 1;
            taqVar.ah.put(str, Integer.valueOf(i2));
            LogUtil.j("SportsRecordingCardReader", "onResponse: list size error retry get data ", str, " ,times :", Integer.valueOf(i2));
            taqVar.a(this.f48891c);
        }
    }

    private void p() {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(0L);
        hiAggregateOption.setEndTime(System.currentTimeMillis());
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setConstantsKey(new String[]{"wear_device_type_datas"});
        hiAggregateOption.setType(new int[]{43500});
        hiAggregateOption.setGroupUnitType(7);
        hiAggregateOption.setReadType(0);
        HiHealthManager.d(this.mContext).aggregateHiHealthData(hiAggregateOption, this.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SportsRecordingBean sportsRecordingBean) {
        this.j = new h(this);
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        if (sportsRecordingBean.getShowType() == 4 && njy.b(sportsRecordingBean.getChildSportItems())) {
            for (RelativeSportData relativeSportData : sportsRecordingBean.getChildSportItems()) {
                if (relativeSportData.isHasDetailInfo()) {
                    arrayList.add(Long.valueOf(relativeSportData.getStartTime()));
                    arrayList2.add(Long.valueOf(relativeSportData.getEndTime()));
                }
            }
        } else {
            arrayList.add(Long.valueOf(sportsRecordingBean.getSportStartTime()));
            arrayList2.add(Long.valueOf(sportsRecordingBean.getSportEndTime()));
        }
        LogUtil.a("SportsRecordingCardReader", "enter getTrackDraw");
        jxu.b(arrayList, arrayList2, this.mContext.getApplicationContext(), new e(this, sportsRecordingBean));
    }

    private void o() {
        LogUtil.a("SportsRecordingCardReader", "refreshSportDataAndTime called");
        this.s = false;
        Message messageObtainMessage = this.j.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = this.ad;
        this.j.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CharSequence charSequence, CharSequence charSequence2, String str, CharSequence charSequence3, boolean z, long j) {
        setBiHasData(this.r);
        setBiHasDataType("" + this.z);
        FunctionSetBean functionSetBeanA = new FunctionSetBean.c(BaseApplication.getContext().getResources().getString(com.huawei.ui.homehealth.R.string.IDS_motiontrack_my_health_data)).c(charSequence).g(tfc.d(j)).e(charSequence2).j(str).e(FunctionSetType.SPORTS_CARD).c(FunctionSetBean.ViewType.DATA_VIEW).d(charSequence3).b(BaseApplication.getContext()).a();
        LogUtil.a("SportsRecordingCardReader", "refreshCardView: ", Boolean.valueOf(z));
        if (z) {
            Message messageObtainMessage = this.j.obtainMessage(6);
            messageObtainMessage.obj = functionSetBeanA;
            this.j.sendMessage(messageObtainMessage);
            return;
        }
        refreshCardBySp(functionSetBeanA);
    }

    private void l() {
        LogUtil.a("SportsRecordingCardReader", "refreshFitnessDataAndTime called");
        WorkoutRecord workoutRecord = this.y;
        if (workoutRecord == null) {
            LogUtil.e("SportsRecordingCardReader", "refreshFitnessDataAndTime mRecord is null.");
            return;
        }
        if (workoutRecord.acquireExerciseTime() == 0) {
            return;
        }
        SportsRecordingBean sportsRecordingBeanC = new nle().c(this.y);
        this.z = 10001;
        this.s = true;
        this.o = false;
        Message messageObtainMessage = this.j.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = sportsRecordingBeanC;
        this.j.sendMessage(messageObtainMessage);
    }

    static class g implements IBaseResponseCallback {
        private WeakReference<taq> e;

        g(taq taqVar) {
            this.e = new WeakReference<>(taqVar);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, final Object obj) throws Throwable {
            final taq taqVar = this.e.get();
            if (taqVar == null) {
                LogUtil.j("SportsRecordingCardReader", "TrackForTriathlon reader is null");
            } else if (i != 0) {
                LogUtil.j("SportsRecordingCardReader", "TrackForTriathlon callback fail and errCode is ", Integer.valueOf(i));
                taqVar.a();
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: taq.g.5
                    @Override // java.lang.Runnable
                    public void run() throws Throwable {
                        taqVar.c(obj);
                    }
                });
            }
        }
    }

    static class f implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<taq> f48892b;

        f(taq taqVar) {
            this.f48892b = new WeakReference<>(taqVar);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, final Object obj) throws Throwable {
            LogUtil.a("SportsRecordingCardReader", "LastTrackCallBack onResponse()");
            final taq taqVar = this.f48892b.get();
            if (taqVar != null) {
                taqVar.a();
                if (i != 0) {
                    taqVar.a();
                    return;
                } else {
                    ThreadPoolManager.c().execute(new Runnable() { // from class: taq.f.5
                        @Override // java.lang.Runnable
                        public void run() throws Throwable {
                            taqVar.d(obj);
                        }
                    });
                    return;
                }
            }
            LogUtil.j("SportsRecordingCardReader", "LastTrackCallBack reader is null");
        }
    }

    private void a(MotionPathSimplify motionPathSimplify) {
        e(motionPathSimplify);
        LogUtil.a("SportsRecordingCardReader", "initCallbackData sports result = ", motionPathSimplify);
        ReleaseLogUtil.d("R_SportsRecordingCardReader", "initCallbackData sports result");
        nlc nlcVarA = new nln().a(motionPathSimplify.requestChiefSportDataType(), motionPathSimplify.requestSportType());
        this.ad = nlcVarA.e(motionPathSimplify);
        this.v = nlcVarA.a();
    }

    private void e(MotionPathSimplify motionPathSimplify) {
        this.z = motionPathSimplify.requestSportType();
        boolean zHasTrackPoint = motionPathSimplify.hasTrackPoint();
        this.o = zHasTrackPoint;
        LogUtil.a("SportsRecordingCardReader", "has track from simplify", Boolean.valueOf(zHasTrackPoint));
        this.ai = motionPathSimplify.requestStartTime();
        this.g = motionPathSimplify.requestEndTime();
        this.f48877b = motionPathSimplify.getExtendDataInt("divingMode");
        this.aa = jaa.a(motionPathSimplify) ? this.mContext.getString(com.huawei.ui.homehealth.R.string.IDS_lactate_threshold_measurement) : "";
        setBiDataSource(c(motionPathSimplify));
    }

    private String c(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            return "";
        }
        if (motionPathSimplify.requestSportDataSource() == 2) {
            return "manual";
        }
        if (motionPathSimplify.requestSportDataSource() == 3 || motionPathSimplify.requestSportDataSource() == 5) {
            return "thirdDevice";
        }
        if (motionPathSimplify.requestTrackType() >= 2 && motionPathSimplify.requestTrackType() <= 7) {
            return "wearDevice";
        }
        return "telephone";
    }

    static class a implements IBaseResponseCallback {
        private WeakReference<taq> d;

        private a(taq taqVar) {
            this.d = new WeakReference<>(taqVar);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) throws Throwable {
            LogUtil.a("SportsRecordingCardReader", "LastFitnessCallback onResponse");
            taq taqVar = this.d.get();
            if (taqVar == null) {
                LogUtil.j("SportsRecordingCardReader", "LastFitnessCallback reader is null");
                return;
            }
            if (i != 0 || obj == null) {
                LogUtil.j("SportsRecordingCardReader", "LastFitnessCallback failed objData may be none.");
                taqVar.a();
                return;
            }
            if (njy.b(obj, WorkoutRecord.class)) {
                List list = (List) obj;
                if (njy.b(list)) {
                    taqVar.y = (WorkoutRecord) list.get(0);
                } else {
                    taqVar.y = null;
                }
            }
            if (obj instanceof WorkoutRecord) {
                taqVar.y = (WorkoutRecord) obj;
            }
            taqVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() throws Throwable {
        CountDownLatch countDownLatch = this.e;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            LogUtil.d("SportsRecordingCardReader", "mCountDownLatch count = ", Long.valueOf(this.e.getCount()));
            if (this.e.getCount() <= 0) {
                d();
            }
        }
    }

    private void d() throws Throwable {
        WorkoutRecord workoutRecord = this.y;
        boolean z = false;
        boolean z2 = (workoutRecord == null || workoutRecord.acquireExerciseTime() == 0) ? false : true;
        boolean z3 = this.t;
        if (!z3 && !z2) {
            this.f.d(null, false, 0, null);
            this.k = true;
            return;
        }
        if (!z2) {
            o();
            return;
        }
        if (!z3) {
            l();
            return;
        }
        if (a(this.z)) {
            if (b(this.y.acquireWorkoutName(), this.mContext)) {
                LogUtil.a("SportsRecordingCardReader", "Stretching training");
                this.g += 3600000;
                z = true;
            } else {
                LogUtil.a("SportsRecordingCardReader", "not is Stretching training");
            }
        }
        if (this.ai > this.y.startTime()) {
            if (z) {
                this.g -= 3600000;
            }
            o();
        } else {
            this.v = 3;
            if (z) {
                this.g -= 3600000;
            }
            l();
        }
    }

    private boolean b(String str, Context context) {
        if (context != null && str != null) {
            return str.equals(context.getString(com.huawei.ui.homehealth.R.string.IDS_hwh_motiontrack_stretch_after_run));
        }
        LogUtil.e("SportsRecordingCardReader", "str is null or content is null");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        Message messageObtainMessage = this.j.obtainMessage();
        messageObtainMessage.what = 2;
        this.j.sendMessage(messageObtainMessage);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public final void readCardData() {
        if (this.k) {
            this.k = false;
            super.readCardData();
            i();
            ThreadPoolManager.c().execute(new Runnable() { // from class: taq.2
                @Override // java.lang.Runnable
                public void run() {
                    taq.this.f();
                }
            });
            return;
        }
        LogUtil.a("SportsRecordingCardReader", "readCardData is not finish");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        LogUtil.a("SportsRecordingCardReader", "executeReadCardData");
        this.t = false;
        this.e = new CountDownLatch(3);
        this.f48878c = new CountDownLatch(1);
        nkb.d().c(this.x);
        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
        if (recordApi == null) {
            LogUtil.j("SportsRecordingCardReader", "executeReadCardData recordApi is null.");
        } else {
            recordApi.acquireDetailFitnessRecords(new ntx.d().b(0L).d(System.currentTimeMillis()).a(1).a(), this.q);
            p();
        }
    }

    private void i() {
        h hVar = this.j;
        if (hVar == null) {
            return;
        }
        hVar.removeMessages(3);
        this.j.sendMessageDelayed(this.j.obtainMessage(3), 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final SportsRecordingBean sportsRecordingBean) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: taq.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                LogUtil.a("SportsRecordingCardReader", "dealShowSportView()");
                try {
                    if (taq.this.f48878c != null) {
                        taq.this.f48878c.await(5000L, TimeUnit.MILLISECONDS);
                    }
                } catch (InterruptedException e2) {
                    LogUtil.e("SportsRecordingCardReader", "dealShowSportView exception = ", LogAnonymous.b(e2));
                }
                Bitmap bitmap = taq.this.j() ? taq.this.d : null;
                LogUtil.a("SportsRecordingCardReader", "dealShowSportView() has bitmap=", Boolean.valueOf(bitmap != null), ", isFitness=", Boolean.valueOf(taq.this.s), ", sportType=", Integer.valueOf(taq.this.z));
                taq.this.f.d(sportsRecordingBean, taq.this.s, taq.this.z, bitmap);
                taq.this.k = true;
            }
        });
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void updateSuccessList(List<Integer> list) {
        LogUtil.a("SportsRecordingCardReader", "subscribeSportData, onResult");
        if (list == null || list.isEmpty()) {
            return;
        }
        LogUtil.a("SportsRecordingCardReader", "registerSportListener success");
        this.ac = list;
    }

    private void t() {
        LogUtil.a("SportsRecordingCardReader", "subscribeSportData");
        subscribeDataChange();
        this.w = new d(this);
        btq.e().c(this.w, "WORKOUT_FINISHED");
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void subscribeDataChange() {
        LogUtil.a("SportsRecordingCardReader", "subscribeSportData");
        if (njy.e(this.ab)) {
            this.ab.add(4);
        }
        HiHealthNativeApi.a(this.mContext).subscribeHiHealthData(this.ab, new FunctionSetBeanReader.e("SportsRecordingCardReader", this));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void unsubscribeDataChange() {
        List<Integer> list = this.ac;
        if (list == null || list.isEmpty()) {
            return;
        }
        HiHealthNativeApi.a(this.mContext).unSubscribeHiHealthData(this.ac, new FunctionSetBeanReader.c("SportsRecordingCardReader", "unSubscribeSportRecordingData, isSuccess:"));
    }

    static class d implements OnFitnessStatusChangeCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<taq> f48890b;

        d(taq taqVar) {
            this.f48890b = new WeakReference<>(taqVar);
        }

        @Override // com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback
        public void onUpdate() {
            LogUtil.a("SportsRecordingCardReader", "update by fitness");
            taq taqVar = this.f48890b.get();
            if (taqVar == null) {
                LogUtil.j("SportsRecordingCardReader", "FitnessStatusChangeCallback reader is null");
            } else {
                taqVar.readCardData();
            }
        }
    }

    public void e() {
        LogUtil.a("SportsRecordingCardReader", "unSubscribeSportRecordingData");
        unsubscribeDataChange();
        btq.e().d(this.w, "WORKOUT_FINISHED");
    }

    static class c implements HiAggregateListener {
        private WeakReference<taq> d;

        c(taq taqVar) {
            this.d = new WeakReference<>(taqVar);
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(final List<HiHealthData> list, int i, int i2) {
            final taq taqVar = this.d.get();
            if (taqVar == null) {
                LogUtil.j("SportsRecordingCardReader", "sportsRecordingCard is null.");
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: taq.c.5
                    @Override // java.lang.Runnable
                    public void run() {
                        taqVar.b(list);
                    }
                });
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            LogUtil.a("SportsRecordingCardReader", "onResultIntent: called");
        }
    }

    private boolean a(int i) {
        String strD = jaa.d(this.mContext, i);
        if (strD == null || (!strD.equals(this.mContext.getString(com.huawei.ui.homehealth.R.string.IDS_start_track_sport_type_outdoor_run)) && !strD.equals(this.mContext.getString(com.huawei.ui.homehealth.R.string.IDS_start_track_sport_type_indoor_run)))) {
            LogUtil.a("SportsRecordingCardReader", "not is TypeRun");
            return false;
        }
        LogUtil.a("SportsRecordingCardReader", "is TypeRun");
        return true;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public View createCardView() {
        HealthImageView healthImageView = new HealthImageView(this.mContext);
        LogUtil.a("SportsRecordingCardReader", "createCardView");
        this.n = new WeakReference<>(healthImageView);
        if (this.f.e(healthImageView)) {
            LogUtil.a("SportsRecordingCardReader", "createCardView initCardView done");
            return healthImageView;
        }
        if (j()) {
            LogUtil.a("SportsRecordingCardReader", "hasTrack is true");
            healthImageView.setImageBitmap(this.d);
            return healthImageView;
        }
        LogUtil.a("SportsRecordingCardReader", "hasTrack is false");
        b(healthImageView, this.s, this.z);
        return healthImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j() {
        if (this.d != null) {
            return !(!this.o || this.s || this.v == 6) || this.v == 4;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ImageView imageView, boolean z, int i) {
        LogUtil.a("SportsRecordingCardReader", "initCardView default pic with isFitness = ", Boolean.valueOf(z), ", sportType = ", Integer.valueOf(i));
        if (z) {
            i = 10001;
        }
        Drawable drawableD = d(i);
        if (LanguageUtil.ba(this.mContext)) {
            drawableD = qqz.e(this.mContext, drawableD);
        }
        imageView.setImageDrawable(drawableD);
    }

    private Drawable d(int i) {
        HwSportTypeInfo hwSportTypeInfoB = jry.a(this.mContext).b(i);
        return (hwSportTypeInfoB == null || hwSportTypeInfoB.getHomePage() == null) ? this.mContext.getDrawable(com.huawei.ui.homehealth.R.drawable.home_page_cross_country_race) : hwSportTypeInfoB.getHomePage().getShowCardDrawable(Integer.toString(this.f48877b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(int i) {
        if (i == 291) {
            return der.e(this.f48877b, this.mContext);
        }
        return TextUtils.isEmpty(this.aa) ? jaa.d(this.mContext, i) : this.aa;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        if (this.l) {
            ReleaseLogUtil.d("TimeEat_SportsRecordingCardReader", "first onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
            this.l = false;
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: tav
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c();
            }
        });
        readCardData();
        ReleaseLogUtil.d("TimeEat_SportsRecordingCardReader", "onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    /* synthetic */ void c() {
        if (!"true".equals(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "HOME_HEALTH_SHOW_DOT")) || der.e() <= g()) {
            return;
        }
        HandlerExecutor.c(new Runnable() { // from class: tax
            @Override // java.lang.Runnable
            public final void run() {
                this.e.b();
            }
        });
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "HOME_HEALTH_SHOW_DOT", "false", new StorageParams());
    }

    /* synthetic */ void b() {
        FunctionSetBean functionSetBean = getFunctionSetBean();
        if (functionSetBean != null) {
            functionSetBean.a(false);
            notifyItemChanged(functionSetBean);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, FunctionSetSubCardData functionSetSubCardData) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onBindViewHolder(viewHolder, functionSetSubCardData);
        FunctionSetBean functionSetBean = functionSetSubCardData.getFunctionSetBean();
        if (!(viewHolder instanceof FunctionSetBeanReader.MyHolder) || functionSetBean == null) {
            LogUtil.e("SportsRecordingCardReader", "holder or functionSetBean is invalid");
            return;
        }
        View view = ((FunctionSetBeanReader.MyHolder) viewHolder).itemView;
        LogUtil.a("SportsRecordingCardReader", "itemView: " + view);
        if (functionSetBean.r() == FunctionSetBean.ViewType.EMPTY_VIEW) {
            ImageView imageView = (ImageView) view.findViewById(com.huawei.ui.homehealth.R.id.function_set_empty_red_dot);
            if (imageView == null) {
                LogUtil.e("SportsRecordingCardReader", "functionSetEmptyRedDot is null");
                return;
            } else if (functionSetBean.g()) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        ReleaseLogUtil.d("TimeEat_SportsRecordingCardReader", "onBindViewHolder finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public void onCardViewClickListener(FunctionSetBean.ViewType viewType) {
        if (qrs.c(500)) {
            return;
        }
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: taz
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    taq.c(i, obj);
                }
            }, AnalyticsValue.HEALTH_HOME_GPS_HISTORY_2010015.value());
        } else {
            h();
        }
    }

    private void h() {
        HashMap map = new HashMap(1);
        map.put("click", 1);
        lmf.d().c(this.mContext, AnalyticsValue.HEALTH_HOME_GPS_HISTORY_2010015.value(), map, 0);
        if (this.hasCardData || fua.b(this.mContext)) {
            Intent intent = new Intent(this.mContext, (Class<?>) SportHistoryActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(BleConstants.SPORT_TYPE, 0);
            tfc.a(this.mContext, intent, isShowHomePageRecommendLayout() ? null : this.mCardViewHolder.itemView, false);
            return;
        }
        LogUtil.a("SportsRecordingCardReader", "jump to sport-run page");
        Intent intent2 = new Intent();
        intent2.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent2.setFlags(268435456);
        intent2.setData(Uri.parse("huaweischeme://healthapp/track?sportType=2&targetType=m&targetValue=1000"));
        iov.d(this.mContext, intent2);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onDestroy() {
        super.onDestroy();
        e();
        h hVar = this.j;
        if (hVar != null) {
            hVar.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getDefaultMarketingDes(int i) {
        return this.mContext.getResources().getString(i, 1);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getDefaultImage(boolean z) {
        if (z) {
            return com.huawei.ui.homehealth.R.drawable.sport_default_img_big;
        }
        return com.huawei.ui.homehealth.R.drawable.sports_record_small_img_default;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public void setGifImage(final ImageView imageView, final boolean z) {
        if (imageView == null) {
            LogUtil.j("SportsRecordingCardReader", "setGifImage gifView is null");
            return;
        }
        boolean zE = qqs.e(this.mContext);
        LogUtil.a("SportsRecordingCardReader", "setGifImage, isDark: ", Boolean.valueOf(zE));
        if (zE) {
            if (!TextUtils.isEmpty(this.f48876a)) {
                c(imageView, z);
                return;
            }
        } else if (!TextUtils.isEmpty(this.h)) {
            c(imageView, z);
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: taq.3
            @Override // java.lang.Runnable
            public void run() {
                taq taqVar = taq.this;
                taqVar.i = qrb.a(taqVar.mContext, "functionset_sport_record_gif_background", ResInfo.Location.HOME);
                if (!njy.e(taq.this.i) && taq.this.i.size() > 1) {
                    LogUtil.a("SportsRecordingCardReader", "mGifList: ", taq.this.i);
                    for (String str : taq.this.i) {
                        if (!TextUtils.isEmpty(str)) {
                            if (str.endsWith("z_sport_record_gif.gif")) {
                                taq.this.h = str;
                            }
                            if (str.endsWith("z_sport_record_gif_dark.gif")) {
                                taq.this.f48876a = str;
                            }
                        }
                    }
                    taq.this.c(imageView, z);
                    return;
                }
                LogUtil.e("SportsRecordingCardReader", "mGifList is error");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final ImageView imageView, final boolean z) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: taq.4
                @Override // java.lang.Runnable
                public void run() {
                    taq.this.c(imageView, z);
                }
            });
            return;
        }
        RequestOptions requestOptionsDiskCacheStrategy = new RequestOptions().diskCacheStrategy(DiskCacheStrategy.RESOURCE);
        boolean zE = qqs.e(this.mContext);
        LogUtil.a("SportsRecordingCardReader", "bindGifImage, isDark: ", Boolean.valueOf(zE));
        if (zE) {
            if (TextUtils.isEmpty(this.f48876a)) {
                LogUtil.e("SportsRecordingCardReader", "mDarkGif is null");
                return;
            } else {
                qqf.b(this.f48876a, requestOptionsDiskCacheStrategy, imageView);
                return;
            }
        }
        if (TextUtils.isEmpty(this.h)) {
            LogUtil.e("SportsRecordingCardReader", "mGif is null");
        } else {
            qqf.b(this.h, requestOptionsDiskCacheStrategy, imageView);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getButtonTextId() {
        return com.huawei.ui.homehealth.R.string.IDS_function_set_card_button_sport;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public HandleCacheDataRunnable getRunnable() {
        return this.f;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getChildTag() {
        return "SportsRecordingCardReader";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(final Bitmap bitmap) {
        if (!Looper.getMainLooper().isCurrentThread()) {
            HandlerExecutor.c(new Runnable() { // from class: tar
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48897b.a(bitmap);
                }
            });
            return;
        }
        ImageView imageView = this.n.get();
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
