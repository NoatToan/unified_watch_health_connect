package defpackage;

import android.util.SparseArray;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.pluginachievement.report.constant.EnumAnnualType;
import com.huawei.pluginachievement.report.iterface.BaseCalculator;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class ova extends BaseCalculator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PluginAchieveAdapter f44829a = getPluginAchieveAdapter();

    @Override // com.huawei.pluginachievement.report.iterface.BaseCalculator
    public void compute(int i) {
        d(i);
    }

    private void d(int i) {
        if (this.f44829a == null) {
            this.f44829a = oru.a(BaseApplication.getContext()).getAdapter();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ArrayList arrayList = new ArrayList(16);
        d(i, countDownLatch, arrayList);
        try {
            countDownLatch.await(8000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("PLGACHIEVE_DietRecordCalculator", "getDietRecordData.await(): catch InterruptedException");
        }
        int iA = a(arrayList);
        LogUtil.a("PLGACHIEVE_DietRecordCalculator", "getDietRecordDays dietDays = ", Integer.valueOf(iA));
        insertData(i, EnumAnnualType.REPORT_DIET.value(), 10016, String.valueOf(iA));
    }

    private int a(List<HiHealthData> list) {
        vgo vgoVar;
        int i = 0;
        if (njy.e(list)) {
            return 0;
        }
        HashSet hashSet = new HashSet(10);
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            try {
                vgoVar = (vgo) new Gson().fromJson(it.next().getMetaData(), vgo.class);
            } catch (JsonSyntaxException | NumberFormatException e) {
                LogUtil.e("PLGACHIEVE_DietRecordCalculator", "parse dietRecord fail ", e.getMessage());
                vgoVar = null;
            }
            if (vgoVar != null && !njy.e(vgoVar.a())) {
                Iterator<vgw> it2 = vgoVar.a().iterator();
                while (it2.hasNext()) {
                    if (!njy.e(it2.next().c()) && hashSet.add(a(vgoVar.i()))) {
                        i++;
                        break;
                    }
                }
            }
        }
        LogUtil.a("PLGACHIEVE_DietRecordCalculator", "getDietRecordDays dietDays = ", hashSet.toString());
        return i;
    }

    private void d(int i, final CountDownLatch countDownLatch, final List<HiHealthData> list) {
        int[] iArr = {DicDataTypeUtil.DataType.DIET_RECORD.value()};
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setStartTime(oxi.a(i, true));
        hiDataReadOption.setEndTime(oxi.a(i, false));
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: ova.4
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                if (obj instanceof SparseArray) {
                    SparseArray sparseArray = (SparseArray) obj;
                    if (sparseArray.size() > 0) {
                        if (!(sparseArray.get(DicDataTypeUtil.DataType.DIET_RECORD.value()) instanceof List)) {
                            LogUtil.j("PLGACHIEVE_DietRecordCalculator", "getTotalRecordData datas not instanceof list");
                            countDownLatch.countDown();
                            return;
                        } else {
                            List list2 = (List) sparseArray.get(DicDataTypeUtil.DataType.DIET_RECORD.value());
                            LogUtil.a("PLGACHIEVE_DietRecordCalculator", "getTotalRecordData size ", Integer.valueOf(list2.size()));
                            list.addAll(list2);
                            countDownLatch.countDown();
                            return;
                        }
                    }
                }
                LogUtil.j("PLGACHIEVE_DietRecordCalculator", "getTotalRecordData no data ", Boolean.valueOf(obj == null));
                countDownLatch.countDown();
            }
        });
    }

    private String a(long j) {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(new Date(j));
    }
}
