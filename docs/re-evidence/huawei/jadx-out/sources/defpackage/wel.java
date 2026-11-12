package defpackage;

import androidx.appcompat.app.AppCompatDelegate;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback;
import com.huawei.ui.main.stories.privacy.datasourcemanager.operate.data.BaseOperate;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class wel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BaseOperate f51944a;

    public wel(int i) {
        switch (i) {
            case 100:
                this.f51944a = new wge();
                break;
            case 101:
                this.f51944a = new wen();
                break;
            case 102:
                this.f51944a = new wem();
                break;
            case 103:
                this.f51944a = new wfi();
                break;
            case 104:
                this.f51944a = new wey();
                break;
            case 105:
                this.f51944a = new wbe();
                break;
            case 106:
                this.f51944a = new wdc();
                break;
            case 107:
                this.f51944a = new wcj();
                break;
            case 108:
                this.f51944a = new wcv();
                break;
            case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                this.f51944a = new wgc();
                break;
            case 110:
                this.f51944a = new wef();
                break;
            case 111:
                this.f51944a = new wee();
                break;
            case CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON /* 113 */:
                this.f51944a = new wfa();
                break;
        }
    }

    public void d(final List<PrivacyDataModel> list, final vzo vzoVar, final DataSourceCallback<Boolean> dataSourceCallback) {
        if (dataSourceCallback == null) {
            LogUtil.e("DataManager", "callback is null");
        } else if (njy.e(list)) {
            LogUtil.e("DataManager", "delete data is null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: wel.2
                @Override // java.lang.Runnable
                public void run() {
                    wel.this.f51944a.deleteDatas(list, vzoVar, dataSourceCallback);
                }
            });
        }
    }

    public void a(int i, String str, String str2, DataSourceCallback<List<whz>> dataSourceCallback) {
        if (dataSourceCallback == null) {
            LogUtil.e("DataManager", "getDataByMonth callback is null");
            return;
        }
        if (i == 1) {
            this.f51944a.readByMonthByAppSource(str2, dataSourceCallback);
        } else if (i == 2 || i == 3) {
            this.f51944a.readByMonthByDeviceSource(str, i, str2, dataSourceCallback);
        }
    }

    public void d(DataSourceCallback<List<whz>> dataSourceCallback) {
        if (dataSourceCallback == null) {
            LogUtil.e("DataManager", "callback null");
        } else {
            this.f51944a.readByMonthNoSource(dataSourceCallback);
        }
    }

    public void e(int i, long j, String str, String str2, DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
        if (dataSourceCallback == null) {
            LogUtil.e("DataManager", "Parameter callback is null");
            return;
        }
        if (i != 1) {
            if (i == 2) {
                this.f51944a.readInOneDayByDeviceSource(j, str, dataSourceCallback);
                return;
            } else if (i != 3) {
                return;
            }
        }
        this.f51944a.readInOneDayByAppSource(j, str, str2, i, dataSourceCallback);
    }

    public void e(vzo vzoVar, DataSourceCallback<List<PrivacyDataModel>> dataSourceCallback) {
        if (dataSourceCallback == null) {
            LogUtil.e("DataManager", "callback null");
        } else {
            this.f51944a.readDayData(vzoVar, dataSourceCallback);
        }
    }

    public void e(int i, String str, String str2, DataSourceCallback<List<whz>> dataSourceCallback) {
        a(i, str, str2, dataSourceCallback);
    }

    public void d(vzo vzoVar, DataSourceCallback<List<whz>> dataSourceCallback) {
        this.f51944a.readGroupData(vzoVar, dataSourceCallback);
    }

    public void c(vzo vzoVar, DataSourceCallback<Map<Integer, List<whz>>> dataSourceCallback) {
        this.f51944a.readCategoryGroupData(vzoVar, dataSourceCallback);
    }

    public void b(vzo vzoVar, DataSourceCallback<List<whr>> dataSourceCallback) {
        this.f51944a.readDoubleGroupData(vzoVar, dataSourceCallback);
    }

    public void a(vzo vzoVar, DataSourceCallback<Map<Integer, List<whr>>> dataSourceCallback) {
        this.f51944a.readCategoryDoubleGroupData(vzoVar, dataSourceCallback);
    }
}
