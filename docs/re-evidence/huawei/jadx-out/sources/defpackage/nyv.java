package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.extractor.ts.TsExtractor;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.datastruct.SupportDataRange;
import com.huawei.indoorequip.ui.view.CombineSportEquipItemDrawer;
import com.huawei.indoorequip.ui.view.SportEquipItemDetail;
import com.huawei.indoorequip.ui.view.SportEquipItemDrawer;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.util.LogUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class nyv extends CombineSportEquipItemDrawer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43977a;

    public nyv(Context context, int i, boolean z, SupportDataRange supportDataRange) {
        super(context, i, z, supportDataRange);
        this.f43977a = i;
    }

    public void c(SportEquipItemDrawer sportEquipItemDrawer, Map<Integer, Object> map, int[] iArr, int i) {
        setPageItem(iArr, map);
        d(sportEquipItemDrawer, i);
    }

    public void d(SportEquipItemDrawer sportEquipItemDrawer, Map<Integer, Object> map, int[] iArr) {
        setPageItem(iArr, map);
        d(sportEquipItemDrawer);
    }

    private void d(SportEquipItemDrawer sportEquipItemDrawer) {
        if (njy.e(this.mItemDataList)) {
            LogUtil.d("Track_IDEQ_CombineSportEquipLangItemDrawer", "fillHrControlContainer mItemDataList is null");
            return;
        }
        if (sportEquipItemDrawer == null) {
            LogUtil.d("Track_IDEQ_CombineSportEquipLangItemDrawer", "fillHrControlContainer container is null");
            return;
        }
        sportEquipItemDrawer.removeAllViews();
        int size = this.mItemDataList.size();
        Object systemService = this.mContext.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (!(systemService instanceof WindowManager)) {
            LogUtil.d("Track_IDEQ_CombineSportEquipLangItemDrawer", "object is invalid type");
            return;
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int iD = ((displayMetrics.widthPixels - qrs.d(this.mContext, 100.0f)) / 2) / size;
        int iD2 = qrs.d(this.mContext, 80.0f);
        for (int i = 0; i < size; i++) {
            SportEquipItemDetail.e eVar = this.mItemDataList.get(i);
            SportEquipItemDetail sportEquipItemDetail = new SportEquipItemDetail(this.mContext, this.f43977a, iD, eVar.a());
            sportEquipItemDetail.setGroupSize(iD, iD2);
            sportEquipItemDetail.e(qrs.d(this.mContext, 20.0f));
            sportEquipItemDetail.a(qrs.d(this.mContext, 12.0f));
            sportEquipItemDetail.setItemView(eVar);
            if (sportEquipItemDrawer.getChildAt(i) != null) {
                sportEquipItemDrawer.removeViewAt(i);
            }
            sportEquipItemDrawer.addView(sportEquipItemDetail, i);
        }
    }

    public void d(SportEquipItemDrawer sportEquipItemDrawer, Map<Integer, Object> map, int[] iArr, int i) {
        setPageItem(iArr, map);
        d(sportEquipItemDrawer, i);
    }

    protected void d(SportEquipItemDrawer sportEquipItemDrawer, int i) {
        if (this.mItemDataList == null || this.mItemDataList.isEmpty()) {
            LogUtil.c("Track_IDEQ_CombineSportEquipLangItemDrawer", "fillTitleContainer mItemDataList is null");
            return;
        }
        if (sportEquipItemDrawer == null) {
            LogUtil.c("Track_IDEQ_CombineSportEquipLangItemDrawer", "fillTitleContainer container is null");
            return;
        }
        sportEquipItemDrawer.removeAllViews();
        int size = this.mItemDataList.size();
        if (size == 0) {
            return;
        }
        Object systemService = this.mContext.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (!(systemService instanceof WindowManager)) {
            LogUtil.c("Track_IDEQ_CombineSportEquipLangItemDrawer", "object is invalid type");
            return;
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int iD = displayMetrics.heightPixels - qrs.d(this.mContext, 146.0f);
        int iCeil = i > 0 ? (int) Math.ceil(size / i) : 0;
        boolean zAf = qrs.af(this.mContext);
        if (zAf) {
            iD = d(displayMetrics, size);
            if (size > 6) {
                iD -= qrs.d(this.mContext, 50.0f);
            }
        }
        c(sportEquipItemDrawer, size, zAf, iCeil > 0 ? iD / iCeil : 0);
    }

    private void c(SportEquipItemDrawer sportEquipItemDrawer, int i, boolean z, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            SportEquipItemDetail sportEquipItemDetailE = e(z, i, c(z, i, i3), i2, this.mItemDataList.get(i3));
            if (sportEquipItemDrawer.getChildAt(i3) != null) {
                sportEquipItemDrawer.removeViewAt(i3);
            }
            sportEquipItemDrawer.addView(sportEquipItemDetailE, i3);
        }
    }

    private int c(boolean z, int i, int i2) {
        if (z) {
            return e(i, i2);
        }
        return i > 6 ? 110 : 134;
    }

    private int e(int i, int i2) {
        if (i > 6) {
            return d(i2);
        }
        if (i > 3) {
            return TsExtractor.TS_STREAM_TYPE_DTS_HD;
        }
        return 180;
    }

    private int d(int i) {
        if (i % 2 != 0) {
            return 110;
        }
        return TsExtractor.TS_STREAM_TYPE_DTS_HD;
    }

    private SportEquipItemDetail e(boolean z, int i, int i2, int i3, SportEquipItemDetail.e eVar) {
        float f = i2;
        SportEquipItemDetail sportEquipItemDetail = new SportEquipItemDetail(this.mContext, this.f43977a, qrs.d(this.mContext, f), eVar.a());
        sportEquipItemDetail.setGroupSize(qrs.d(this.mContext, f), i3);
        LogUtil.a("Track_IDEQ_CombineSportEquipLangItemDrawer", "SIZE IS ", Integer.valueOf(i), "  isTahitiModel", Boolean.valueOf(z));
        if (z) {
            b(i, sportEquipItemDetail, eVar);
        } else {
            c(i, sportEquipItemDetail, eVar);
        }
        if (!CommonUtil.w(this.mContext)) {
            sportEquipItemDetail.e(qrs.d(this.mContext, 18.0f));
            sportEquipItemDetail.a(qrs.d(this.mContext, 14.0f));
        }
        sportEquipItemDetail.setItemView(eVar);
        if (eVar.c() == null) {
            sportEquipItemDetail.e(0, this.mContext.getResources().getDimensionPixelSize(R.dimen.hw_group_image_40dp));
        }
        return sportEquipItemDetail;
    }

    private void c(int i, SportEquipItemDetail sportEquipItemDetail, SportEquipItemDetail.e eVar) {
        if (eVar.c() != null && eVar.c().equals(this.mContext.getString(R.string.ie_landing_way))) {
            sportEquipItemDetail.e(qrs.d(this.mContext, 24.0f));
        }
        if (i > 6) {
            sportEquipItemDetail.e(qrs.d(this.mContext, 24.0f));
            sportEquipItemDetail.a(qrs.d(this.mContext, 14.0f));
        } else if (i > 3 && i <= 6) {
            sportEquipItemDetail.e(qrs.d(this.mContext, 30.0f));
            sportEquipItemDetail.a(qrs.d(this.mContext, 16.0f));
        } else {
            sportEquipItemDetail.e(qrs.d(this.mContext, 34.0f));
            sportEquipItemDetail.a(qrs.d(this.mContext, 14.0f));
        }
    }

    private void b(int i, SportEquipItemDetail sportEquipItemDetail, SportEquipItemDetail.e eVar) {
        if (eVar.c() != null && eVar.c().equals(this.mContext.getString(R.string.ie_landing_way))) {
            sportEquipItemDetail.e(qrs.d(this.mContext, 24.0f));
        }
        if (i > 6) {
            sportEquipItemDetail.e(qrs.d(this.mContext, 34.0f));
            sportEquipItemDetail.a(qrs.d(this.mContext, 14.0f));
        } else {
            if (i <= 3 || i > 6) {
                return;
            }
            sportEquipItemDetail.e(qrs.d(this.mContext, 36.0f));
            sportEquipItemDetail.a(qrs.d(this.mContext, 16.0f));
        }
    }

    private int d(DisplayMetrics displayMetrics, int i) {
        int i2;
        int iD;
        if (i <= 3) {
            i2 = displayMetrics.heightPixels;
            iD = qrs.d(this.mContext, 316.0f);
        } else if (i <= 4 || i <= 6) {
            i2 = displayMetrics.heightPixels;
            iD = qrs.d(this.mContext, 388.0f);
        } else {
            i2 = displayMetrics.heightPixels;
            iD = qrs.d(this.mContext, 316.0f);
        }
        return i2 - iD;
    }
}
