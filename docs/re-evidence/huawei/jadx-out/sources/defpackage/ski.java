package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.health.utils.functionsetcard.FunctionSetBean;
import com.huawei.health.health.utils.functionsetcard.FunctionSetType;
import com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.HiStressMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.main.stories.health.activity.healthdata.KnitPressureActivity;
import health.compact.a.HiDateUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes43.dex */
public class ski extends FunctionSetBeanReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f48265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f48266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f48267c;
    private List<HwHealthBarEntry> d;
    private View e;
    private HiDataReadResultListener f;
    private boolean g;
    private long h;
    private long i;
    private boolean j;
    private List<Integer> l;
    private List<Integer> o;

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public boolean isSubscribeType(int i) {
        return i == 14;
    }

    static final class e implements HiDataReadResultListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<a> f48271b;
        private WeakReference<c> d;
        private WeakReference<ski> e;

        e(a aVar, c cVar, ski skiVar) {
            this.f48271b = new WeakReference<>(aVar);
            this.d = new WeakReference<>(cVar);
            this.e = new WeakReference<>(skiVar);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            a aVar = this.f48271b.get();
            c cVar = this.d.get();
            ski skiVar = this.e.get();
            LogUtil.a("FunctionSetStressCardReader", "StressHiDataReadResultListener onResult, runnable: ", aVar, ", handler", cVar, ", reader: ", skiVar);
            if (skiVar != null) {
                List list = skiVar.getList(obj, 2034);
                if (cVar == null) {
                    LogUtil.e("FunctionSetStressCardReader", "handler is null");
                    return;
                }
                if (njy.e(list)) {
                    LogUtil.j("FunctionSetStressCardReader", "dataList is empty!");
                    if (aVar == null) {
                        LogUtil.e("FunctionSetStressCardReader", "runnable is null");
                        return;
                    } else {
                        aVar.a(false);
                        cVar.sendEmptyMessage(5);
                        return;
                    }
                }
                LogUtil.a("FunctionSetStressCardReader", "readCardData success");
                Message messageObtainMessage = cVar.obtainMessage();
                messageObtainMessage.what = 3;
                messageObtainMessage.obj = list;
                cVar.sendMessage(messageObtainMessage);
                return;
            }
            LogUtil.e("FunctionSetStressCardReader", "reader is null");
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            LogUtil.a("FunctionSetStressCardReader", "onResultIntent : read failed errorCode is", Integer.valueOf(i2));
        }
    }

    static class a extends HandleCacheDataRunnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<ski> f48268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f48269c;
        private List<Integer> d;
        private HiHealthData e;

        a(ski skiVar) {
            super("FunctionSetStressCardReader", null);
            this.f48268b = new WeakReference<>(skiVar);
        }

        void c(List<Integer> list) {
            this.d = list;
            if (list != null) {
                c(true).putString("_", marshallListToString(list));
            }
        }

        void a(long j, int i, int i2) {
            HiHealthData hiHealthDataC = c(true);
            hiHealthDataC.putLong("_t", j);
            hiHealthDataC.putInt("_s", i);
            hiHealthDataC.putInt("_u", i2);
        }

        void a(boolean z) {
            HiHealthData hiHealthDataC;
            if (z) {
                ski.setHasCardData(this.f48268b, true);
                hiHealthDataC = c(false);
            } else {
                ski.setHasCardData(this.f48268b, false);
                this.d = null;
                hiHealthDataC = null;
            }
            this.e = null;
            ski.saveDataFromHealthApi("FunctionSetStressCardReader", this.f48268b, hiHealthDataC);
        }

        @Override // com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable
        public void handleCacheData(HiHealthData hiHealthData, boolean z) {
            ski skiVar = this.f48268b.get();
            if (skiVar == null) {
                LogUtil.j("FunctionSetStressCardReader", "handleCacheData stressCardReader is null");
                return;
            }
            if (hiHealthData == null) {
                ski.setHasCardData(this.f48268b, false);
                if (this.f48269c && z) {
                    skiVar.e();
                    return;
                }
                return;
            }
            this.f48269c = true;
            List arrayList = this.d;
            if (!z || arrayList == null) {
                arrayList = new ArrayList();
                unmarshallListFromString(hiHealthData.getString("_"), arrayList);
            } else {
                this.d = null;
            }
            if (!arrayList.isEmpty()) {
                skiVar.e((List<Integer>) arrayList);
                skiVar.f48266b = true;
                skiVar.b(hiHealthData.getLong("_t"), hiHealthData.getInt("_s"), hiHealthData.getInt("_u"), z);
            } else {
                LogUtil.j("FunctionSetStressCardReader", "handleCacheData pressureValueList is empty");
                if (z) {
                    return;
                }
                skiVar.refreshCardBySp(skiVar.buildEmptyCardBean());
            }
        }

        private HiHealthData c(boolean z) {
            if (z && this.e == null) {
                this.e = new HiHealthData();
            }
            return this.e;
        }
    }

    public ski(Context context, CardConfig cardConfig) {
        super(context, "FunctionSetStressCardReader", cardConfig);
        this.h = 0L;
        this.j = false;
        this.l = new ArrayList(1);
        this.o = null;
        this.f48266b = false;
        this.g = true;
        this.f48265a = new c(this);
        a aVar = new a(this);
        this.f48267c = aVar;
        this.f = new e(aVar, this.f48265a, this);
        subscribeDataChange();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void subscribeDataChange() {
        LogUtil.a("FunctionSetStressCardReader", "subscribeStressData");
        this.l.add(14);
        HiHealthNativeApi.a(this.mContext).subscribeHiHealthData(this.l, new FunctionSetBeanReader.e("FunctionSetStressCardReader", this));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void unsubscribeDataChange() {
        LogUtil.a("FunctionSetStressCardReader", "unSubscribeStressData");
        List<Integer> list = this.o;
        if (list == null || list.isEmpty()) {
            return;
        }
        HiHealthNativeApi.a(this.mContext).unSubscribeHiHealthData(this.o, new FunctionSetBeanReader.c("FunctionSetStressCardReader", "unSubscribeStressData, isSuccess:"));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onDestroy() {
        super.onDestroy();
        unsubscribeDataChange();
        c cVar = this.f48265a;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public final void readCardData() {
        LogUtil.a("FunctionSetStressCardReader", "readCardData start");
        HiHealthManager.d(this.mContext).readHiHealthData(d(), new d(this.f48267c, this.f48265a, this));
    }

    private HiDataReadOption d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setCount(1);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setStartTime(0L);
        hiDataReadOption.setEndTime(jCurrentTimeMillis);
        hiDataReadOption.setType(new int[]{44307});
        return hiDataReadOption;
    }

    public static class d implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<ski> f48270a;
        private WeakReference<a> d;
        private WeakReference<c> e;

        private d(a aVar, c cVar, ski skiVar) {
            this.f48270a = new WeakReference<>(skiVar);
            this.d = new WeakReference<>(aVar);
            this.e = new WeakReference<>(cVar);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            ski skiVar = this.f48270a.get();
            if (skiVar == null) {
                LogUtil.e("FunctionSetStressCardReader", "reader is null");
                b(this.d, this.e);
                return;
            }
            if (!(obj instanceof SparseArray)) {
                b(this.d, this.e);
                return;
            }
            SparseArray<List<HiHealthData>> sparseArray = (SparseArray) obj;
            if (sparseArray.size() <= 0) {
                b(this.d, this.e);
                return;
            }
            HiHealthData hiHealthDataB = b(sparseArray, new int[]{44307});
            if (hiHealthDataB != null) {
                skiVar.h = hiHealthDataB.getStartTime();
                LogUtil.a("FunctionSetStressCardReader", "last data time=", Long.valueOf(skiVar.h));
                if (skiVar.h == 0) {
                    b(this.d, this.e);
                    return;
                }
                HiDataReadOption hiDataReadOption = new HiDataReadOption();
                hiDataReadOption.setTimeInterval(HiDateUtil.p(skiVar.h), HiDateUtil.g(skiVar.h));
                hiDataReadOption.setType(new int[]{2034});
                hiDataReadOption.setSortOrder(1);
                HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthDataPro(HiDataReadProOption.builder().e(hiDataReadOption).a(true).b(), skiVar.f);
                return;
            }
            b(this.d, this.e);
        }

        private void b(WeakReference<a> weakReference, WeakReference<c> weakReference2) {
            a aVar = weakReference.get();
            c cVar = weakReference2.get();
            if (cVar == null) {
                LogUtil.e("FunctionSetStressCardReader", "handler is null");
            } else if (aVar == null) {
                LogUtil.e("FunctionSetStressCardReader", "runnable is null");
            } else {
                aVar.a(false);
                cVar.sendEmptyMessage(5);
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            LogUtil.a("FunctionSetStressCardReader", "onResultIntent");
        }

        private HiHealthData b(SparseArray<List<HiHealthData>> sparseArray, int[] iArr) {
            ArrayList arrayList = new ArrayList(sparseArray.size());
            for (int i : iArr) {
                List<HiHealthData> list = sparseArray.get(i);
                if (list instanceof List) {
                    arrayList.addAll(list);
                }
            }
            if (arrayList.size() == 0) {
                return null;
            }
            Collections.sort(arrayList, new Comparator() { // from class: skl
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((HiHealthData) obj2).getEndTime(), ((HiHealthData) obj).getEndTime());
                }
            });
            return (HiHealthData) arrayList.get(0);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void initCardData() {
        sis.e().d(this.f);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void updateSuccessList(List<Integer> list) {
        LogUtil.a("FunctionSetStressCardReader", "subscribeStressData, onResult");
        if (list == null || list.isEmpty()) {
            return;
        }
        LogUtil.a("FunctionSetStressCardReader", "registerStressListener success");
        this.o = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j, int i, int i2, boolean z) {
        setHasCardData(true);
        this.i = j;
        String strB = tfc.b(j);
        String strA = wvb.a(i);
        LogUtil.a("FunctionSetStressCardReader", "requestDatas", "pressureMeasureBean", strB, "---", "---", Integer.valueOf(i));
        if (i == 0) {
            if (z) {
                return;
            }
            refreshCardBySp(buildEmptyCardBean());
        } else {
            if (strA == null) {
                if (z) {
                    return;
                }
                refreshCardBySp(buildEmptyCardBean());
                return;
            }
            FunctionSetBean functionSetBeanB = b(strB, i, strA);
            functionSetBeanB.d(i2);
            if (z) {
                Message messageObtainMessage = this.f48265a.obtainMessage();
                messageObtainMessage.what = 1;
                messageObtainMessage.obj = functionSetBeanB;
                this.f48265a.sendMessage(messageObtainMessage);
                return;
            }
            refreshCardBySp(functionSetBeanB);
        }
    }

    static class c extends BaseHandler<ski> {
        c(ski skiVar) {
            super(Looper.getMainLooper(), skiVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(ski skiVar, Message message) {
            int i = message.what;
            if (i == 1) {
                LogUtil.a("FunctionSetStressCardReader", "handleMessageWhenReferenceNotNull");
                skiVar.notifyItemChanged((FunctionSetBean) message.obj);
                return;
            }
            if (i == 3) {
                skiVar.e(message.obj);
                skiVar.c(message.obj);
                skiVar.f48267c.a(true);
            } else if (i == 4) {
                LogUtil.a("FunctionSetStressCardReader", "MSG_HAVE_STRESS_DATA:");
                skiVar.d(true);
            } else if (i == 5) {
                LogUtil.a("FunctionSetStressCardReader", "MSG_NOT_HAVE_STRESS_DATA:");
                skiVar.d(false);
            } else {
                LogUtil.j("FunctionSetStressCardReader", "unkonw msg");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.a("FunctionSetStressCardReader", "show empty view!");
        FunctionSetBean functionSetBeanBuildEmptyCardBean = buildEmptyCardBean();
        Message messageObtainMessage = this.f48265a.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = functionSetBeanBuildEmptyCardBean;
        this.f48265a.sendMessage(messageObtainMessage);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public FunctionSetBean buildEmptyCardBean() {
        return new FunctionSetBean.c(this.mContext.getResources().getString(R.string.IDS_settings_one_level_menu_settings_item_text_id14)).e(FunctionSetType.STRESS_CARD).c(FunctionSetBean.ViewType.EMPTY_VIEW).c(this.mContext.getResources().getString(R.string.IDS_hw_show_main_home_page_card_stress)).b(this.mContext).a();
    }

    private FunctionSetBean b(String str, int i, String str2) {
        return new FunctionSetBean.c(this.mContext.getResources().getString(R.string.IDS_settings_one_level_menu_settings_item_text_id14)).d(str).g(tfc.d(this.i)).e(UnitUtil.e(i, 1, 0)).j(str2).e(FunctionSetType.STRESS_CARD).c(FunctionSetBean.ViewType.DATA_VIEW).b(this.mContext).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Object obj) {
        List arrayList = new ArrayList(10);
        ArrayList arrayList2 = new ArrayList(10);
        if (njy.b(obj, HiHealthData.class)) {
            arrayList = (List) obj;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((HiStressMetaData) HiJsonUtil.d(((HiHealthData) it.next()).getMetaData(), HiStressMetaData.class));
        }
        int size = arrayList2.size();
        LogUtil.a("FunctionSetStressCardReader", "size = ", Integer.valueOf(size), ", metaDataList: ", arrayList2);
        if (size <= 0 || njy.e(this.f48267c.d)) {
            return;
        }
        long jFetchStressStartTime = ((HiStressMetaData) arrayList2.get(0)).fetchStressStartTime();
        Integer num = (Integer) this.f48267c.d.get(this.f48267c.d.size() - 1);
        int iIntValue = num.intValue();
        LogUtil.a("FunctionSetStressCardReader", "startTime: ", Long.valueOf(jFetchStressStartTime), ", stressScore: ", num);
        this.f48267c.a(jFetchStressStartTime, iIntValue, (String.valueOf(jFetchStressStartTime) + iIntValue + size).hashCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Object obj) {
        if (obj instanceof List) {
            List<HiHealthData> list = (List) obj;
            HiHealthData hiHealthData = list.get(0);
            if (hiHealthData == null) {
                LogUtil.j("FunctionSetStressCardReader", "data is empty");
            } else {
                SharedPreferenceManager.c("privacy_center", "pressure", String.valueOf(hiHealthData.getStartTime()));
                c(list, HiDateUtil.p(((HiStressMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiStressMetaData.class)).fetchStressStartTime()));
            }
        }
    }

    private void c(List<HiHealthData> list, long j) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            HiStressMetaData hiStressMetaData = (HiStressMetaData) HiJsonUtil.d(list.get((size - i) - 1).getMetaData(), HiStressMetaData.class);
            if (j == HiDateUtil.p(hiStressMetaData.fetchStressStartTime())) {
                arrayList.add(hiStressMetaData);
            }
        }
        this.f48267c.c(d(arrayList));
    }

    private List<Integer> d(List<HiStressMetaData> list) {
        ArrayList arrayList = new ArrayList(list);
        int size = arrayList.size();
        LogUtil.a("FunctionSetStressCardReader", "totalList size:", Integer.valueOf(size), ", metaDataList: ", list.toString());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList<HiStressMetaData> arrayList3 = new ArrayList(arrayList.size());
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        for (HiStressMetaData hiStressMetaData : list) {
            int iFetchStressMeasureType = hiStressMetaData.fetchStressMeasureType();
            if (iFetchStressMeasureType == 0 || iFetchStressMeasureType == 2) {
                arrayList2.add(hiStressMetaData);
            } else {
                arrayList3.add(hiStressMetaData);
            }
        }
        LogUtil.a("FunctionSetStressCardReader", "activeList size:", Integer.valueOf(arrayList2.size()));
        if (arrayList2.size() == 0) {
            return a(arrayList4, arrayList);
        }
        for (HiStressMetaData hiStressMetaData2 : arrayList3) {
            long jFetchStressStartTime = hiStressMetaData2.fetchStressStartTime();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (e(((HiStressMetaData) it.next()).fetchStressStartTime(), jFetchStressStartTime)) {
                    arrayList4.add(hiStressMetaData2);
                }
            }
        }
        int size2 = arrayList4.size();
        LogUtil.a("FunctionSetStressCardReader", "filter size:", Integer.valueOf(size2), ", filterList: ", arrayList4.toString());
        return a(arrayList4, arrayList);
    }

    private List<Integer> a(List<HiStressMetaData> list, List<HiStressMetaData> list2) {
        ArrayList arrayList = new ArrayList();
        for (HiStressMetaData hiStressMetaData : list2) {
            if (!list.contains(hiStressMetaData)) {
                arrayList.add(hiStressMetaData);
            }
        }
        TreeMap treeMap = new TreeMap();
        b(treeMap, arrayList);
        ArrayList arrayList2 = new ArrayList(list2.size());
        Iterator<Map.Entry<Long, frg>> it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf((int) UnitUtil.d(it.next().getValue().e(), 0)));
        }
        int size = arrayList2.size();
        LogUtil.a("FunctionSetStressCardReader", "pressureValueList size:", Integer.valueOf(size), ", pressureValueList: ", arrayList2);
        return size <= 16 ? arrayList2 : arrayList2.subList(size - 16, size);
    }

    private void b(Map<Long, frg> map, List<HiStressMetaData> list) {
        for (int i = 0; i < list.size(); i++) {
            HiStressMetaData hiStressMetaData = list.get(i);
            Calendar calendarE = e(hiStressMetaData.fetchStressStartTime());
            frg frgVar = map.get(Long.valueOf(calendarE.getTimeInMillis()));
            if (frgVar == null) {
                frg frgVar2 = new frg(hiStressMetaData.fetchStressScore());
                frgVar2.c(1);
                map.put(Long.valueOf(calendarE.getTimeInMillis()), frgVar2);
            } else {
                int iC = frgVar.c();
                float f = iC;
                int i2 = iC + 1;
                float fE = ((frgVar.e() * f) + hiStressMetaData.fetchStressScore()) / i2;
                frgVar.c(i2);
                frgVar.d(fE);
                map.put(Long.valueOf(calendarE.getTimeInMillis()), frgVar);
            }
        }
    }

    private Calendar e(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        if (calendar.get(12) / 30 == 0) {
            calendar.set(12, 14);
            calendar.set(13, 30);
        } else {
            calendar.set(12, 44);
            calendar.set(13, 30);
        }
        calendar.set(14, 0);
        return calendar;
    }

    private boolean e(long j, long j2) {
        return Math.abs(j - j2) <= 600000;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public View createCardView() {
        LogUtil.a("FunctionSetStressCardReader", "createCardView");
        if (this.f48266b) {
            LogUtil.a("FunctionSetStressCardReader", "mIsDataUpdated");
            if (this.e == null) {
                try {
                    this.e = LayoutInflater.from(this.mContext).inflate(R.layout.card_stress_view, (ViewGroup) null);
                } catch (InflateException e2) {
                    LogUtil.j("FunctionSetStressCardReader", e2.getClass().getSimpleName() + "inflate mCardStressView fail!");
                }
            }
            a(this.d);
            this.f48266b = false;
        }
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<Integer> list) {
        HwHealthBarEntry hwHealthBarEntry;
        ArrayList arrayList = new ArrayList(16);
        int size = list.size();
        LogUtil.a("FunctionSetStressCardReader", "mPressureMeasureValueList , size ", Integer.valueOf(size));
        for (int i = 0; i < 16; i++) {
            if (i < size) {
                int iD = d(list.get(i).intValue());
                hwHealthBarEntry = new HwHealthBarEntry(i, new qmf(list.get(i).intValue(), iD, iD));
            } else {
                int color = this.mContext.getResources().getColor(R.color.home_page_chart_default_color);
                hwHealthBarEntry = new HwHealthBarEntry(i, new qmf(20.0f, color, color));
            }
            arrayList.add(hwHealthBarEntry);
        }
        this.d = arrayList;
        a(arrayList);
    }

    private int d(int i) {
        if (i >= 80) {
            return this.mContext.getResources().getColor(R.color.color_pressure_4);
        }
        if (i >= 60) {
            return this.mContext.getResources().getColor(R.color.color_pressure_3);
        }
        if (i >= 30) {
            return this.mContext.getResources().getColor(R.color.color_pressure_2);
        }
        return this.mContext.getResources().getColor(R.color.color_pressure_1);
    }

    private void a(List<HwHealthBarEntry> list) {
        if (this.e == null) {
            LogUtil.j("FunctionSetStressCardReader", "mCardStressView is null");
            return;
        }
        LogUtil.a("FunctionSetStressCardReader", "mCardStressView ID: " + this.e.getId() + ", layout: " + R.layout.card_stress_view);
        HwHealthBarChart hwHealthBarChart = (HwHealthBarChart) this.e.findViewById(R.id.barchart);
        if (hwHealthBarChart == null) {
            LogUtil.j("FunctionSetStressCardReader", "initSet barChart is null");
            return;
        }
        float y = 0.0f;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getY() >= y) {
                y = list.get(i).getY();
            }
        }
        hwHealthBarChart.setTouchEnabled(false);
        HwHealthBarDataSet hwHealthBarDataSet = new HwHealthBarDataSet(list, "bar breif", "bar label", "bar unit");
        hwHealthBarDataSet.e(HwHealthBarDataSet.DrawColorMode.DATA_COLOR);
        hwHealthBarDataSet.setBarDrawWidth(0.5f);
        hwHealthBarDataSet.setAxisDependency(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY);
        hwHealthBarChart.getXAxis().setEnabled(false);
        HwHealthYAxis axisFirstParty = hwHealthBarChart.getAxisFirstParty();
        axisFirstParty.setDrawLabels(false);
        axisFirstParty.setDrawGridLines(false);
        axisFirstParty.setDrawAxisLine(false);
        float f = y / 2.0f;
        axisFirstParty.setAxisMinimum(f - 50.0f);
        axisFirstParty.setAxisMaximum(f + 50.0f);
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(hwHealthBarDataSet);
        hwHealthBarChart.setData(new qly(arrayList));
        hwHealthBarChart.refresh();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public void onCardViewClickListener(FunctionSetBean.ViewType viewType) {
        if (viewType == FunctionSetBean.ViewType.DATA_VIEW) {
            LogUtil.a("FunctionSetStressCardReader", "go to STRESS_CARD record");
            Intent intent = new Intent();
            intent.setClass(this.mContext, KnitPressureActivity.class);
            intent.setFlags(268435456);
            intent.putExtra("key_bundle_health_last_data_time", this.i);
            intent.putExtra("isHaveData", 1);
            intent.putExtra("type", 1);
            tfc.a(this.mContext, intent, isShowHomePageRecommendLayout() ? null : this.mCardViewHolder.itemView, false);
            return;
        }
        LogUtil.a("FunctionSetStressCardReader", "go to STRESS_CARD record");
        Intent intent2 = new Intent();
        intent2.setFlags(268435456);
        intent2.setClass(this.mContext, KnitPressureActivity.class);
        intent2.putExtra("pressure_is_have_datas", this.j);
        if (this.j) {
            intent2.putExtra("isHaveData", 1);
            LogUtil.a("FunctionSetStressCardReader", "go to HaveData-STRESS_CARD record");
        } else {
            intent2.putExtra("isHaveData", 0);
            LogUtil.a("FunctionSetStressCardReader", "go to notHaveData-STRESS_CARD record");
        }
        intent2.putExtra("type", 1);
        tfc.a(this.mContext, intent2, isShowHomePageRecommendLayout() ? null : this.mCardViewHolder.itemView, false);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, FunctionSetSubCardData functionSetSubCardData) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onBindViewHolder(viewHolder, functionSetSubCardData);
        ReleaseLogUtil.d("TimeEat_FunctionSetStressCardReader", "onBindViewHolder finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        this.j = z;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getDefaultLargeCardImageRes() {
        return Integer.toString(R.drawable.pic_health_pressure);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getDefaultImage(boolean z) {
        if (z) {
            return R.drawable.pressure_default_img_big;
        }
        return R.drawable.marketing_default_img_pressure;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getButtonColorId() {
        return R.color.function_marketing_big_card_pressure;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getButtonTextId() {
        return R.string.IDS_function_set_card_button_stress;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public HandleCacheDataRunnable getRunnable() {
        return this.f48267c;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getChildTag() {
        return "FunctionSetStressCardReader";
    }
}
