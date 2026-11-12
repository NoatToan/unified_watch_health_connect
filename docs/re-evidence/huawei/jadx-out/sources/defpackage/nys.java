package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.datastruct.SupportDataRange;
import com.huawei.indoorequip.ui.view.CombineSportEquipItemDrawer;
import com.huawei.indoorequip.ui.view.SportEquipItemDetail;
import com.huawei.indoorequip.ui.view.SportEquipItemDrawer;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class nys extends CombineSportEquipItemDrawer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f43969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f43970c;
    private float d;

    public nys(Context context, int i, boolean z, float f, float f2, SupportDataRange supportDataRange) {
        super(context, i, z, supportDataRange);
        this.f43969b = 1920.0f;
        this.f43968a = i;
        this.d = f;
        this.f43970c = f2;
    }

    public void c(SportEquipItemDrawer sportEquipItemDrawer, Map<Integer, Object> map, int[] iArr, int i) {
        setPageItem(iArr, map);
        e(sportEquipItemDrawer, i);
    }

    public void d(SportEquipItemDrawer sportEquipItemDrawer, Map<Integer, Object> map, int[] iArr, int i) {
        setPageItem(iArr, map);
        e(sportEquipItemDrawer, i);
    }

    public void d(SportEquipItemDrawer sportEquipItemDrawer, Map<Integer, Object> map, int[] iArr) {
        setPageItem(iArr, map);
        a(sportEquipItemDrawer);
    }

    public void b(float f) {
        this.f43969b = f;
    }

    private void a(SportEquipItemDrawer sportEquipItemDrawer) {
        if (njy.e(this.mItemDataList)) {
            LogUtil.j("Track_IDEQ_CombineSportEquipTvItemDrawer", "fillHrControlContainer mItemDataList is null");
            return;
        }
        if (sportEquipItemDrawer == null) {
            LogUtil.j("Track_IDEQ_CombineSportEquipTvItemDrawer", "fillHrControlContainer container is null");
            return;
        }
        sportEquipItemDrawer.removeAllViews();
        int size = this.mItemDataList.size();
        int iA = (int) (this.f43969b - (this.d * a(this.mContext, 24.0f)));
        int i = iA / size;
        int iA2 = ((int) this.d) * a(this.mContext, 80.0f);
        LogUtil.a("Track_IDEQ_CombineSportEquipTvItemDrawer", "scale:", Float.valueOf(this.d), " mDisplayWidth", Float.valueOf(this.f43969b), " itemAllWidth:", Integer.valueOf(iA), " itemWidth:", Integer.valueOf(i), " itemHeight:", Integer.valueOf(iA2));
        for (int i2 = 0; i2 < size; i2++) {
            SportEquipItemDetail sportEquipItemDetailC = c(i, iA2, this.mItemDataList.get(i2));
            if (sportEquipItemDrawer.getChildAt(i2) != null) {
                sportEquipItemDrawer.removeViewAt(i2);
            }
            sportEquipItemDrawer.addView(sportEquipItemDetailC, i2);
        }
    }

    private SportEquipItemDetail c(int i, int i2, SportEquipItemDetail.e eVar) {
        SportEquipItemDetail sportEquipItemDetail = new SportEquipItemDetail(this.mContext, this.f43968a, i, eVar.a());
        sportEquipItemDetail.setGroupSize(i, i2);
        sportEquipItemDetail.e(((int) this.d) * a(this.mContext, 20.0f));
        sportEquipItemDetail.a(((int) this.d) * a(this.mContext, 12.0f));
        sportEquipItemDetail.setItemView(eVar);
        if (eVar.c() == null) {
            sportEquipItemDetail.e(0, this.mContext.getResources().getDimensionPixelSize(R.dimen.common_ui_horizon_text_size_60));
        }
        return sportEquipItemDetail;
    }

    private void e(SportEquipItemDrawer sportEquipItemDrawer, int i) {
        if (this.mItemDataList == null || this.mItemDataList.isEmpty()) {
            LogUtil.e("Track_IDEQ_CombineSportEquipTvItemDrawer", "fillTitleContainer mItemDataList is null");
            return;
        }
        if (sportEquipItemDrawer == null) {
            LogUtil.e("Track_IDEQ_CombineSportEquipTvItemDrawer", "fillTitleContainer container is null");
            return;
        }
        sportEquipItemDrawer.removeAllViews();
        Object systemService = this.mContext.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (!(systemService instanceof WindowManager)) {
            LogUtil.e("Track_IDEQ_CombineSportEquipTvItemDrawer", "object is invalid type");
            return;
        }
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(new DisplayMetrics());
        LogUtil.a("Track_IDEQ_CombineSportEquipTvItemDrawer", "scale:", Float.valueOf(this.d), " height:", 787);
        int size = this.mItemDataList.size();
        if (size == 0) {
            return;
        }
        int i2 = (i <= 0 || ((int) Math.ceil((double) (((float) size) / ((float) i)))) != 3) ? 102 : 58;
        for (int i3 = 0; i3 < size; i3++) {
            SportEquipItemDetail sportEquipItemDetailE = e(108, i2, this.mItemDataList.get(i3));
            if (sportEquipItemDrawer.getChildAt(i3) != null) {
                sportEquipItemDrawer.removeViewAt(i3);
            }
            sportEquipItemDrawer.addView(sportEquipItemDetailE, i3);
            LogUtil.d("Track_IDEQ_CombineSportEquipTvItemDrawer", "container addView index", Integer.valueOf(i3));
        }
    }

    private SportEquipItemDetail e(int i, int i2, SportEquipItemDetail.e eVar) {
        float f = i;
        SportEquipItemDetail sportEquipItemDetail = new SportEquipItemDetail(this.mContext, this.f43968a, (int) (this.d * a(this.mContext, f)), eVar.a());
        sportEquipItemDetail.setValueTextSize(this.d * a(this.mContext, 18.0f));
        sportEquipItemDetail.setNameTextSize(this.d * a(this.mContext, 12.0f));
        if (sportEquipItemDetail.getName().getText().length() > 10) {
            sportEquipItemDetail.setNameTextSize(sportEquipItemDetail.getName().getTextSize() * 0.7f);
        }
        if (eVar.d() != null) {
            sportEquipItemDetail.getNameImage().getLayoutParams().width = (int) (this.d * a(this.mContext, 16.0f));
            sportEquipItemDetail.getNameImage().getLayoutParams().height = (int) (this.d * a(this.mContext, 16.0f));
        }
        sportEquipItemDetail.setGroupSize(((int) this.d) * a(this.mContext, f), ((int) this.d) * a(this.mContext, i2));
        sportEquipItemDetail.setItemView(eVar);
        if (eVar.c() == null) {
            sportEquipItemDetail.e(0, this.mContext.getResources().getDimensionPixelSize(R.dimen.common_ui_horizon_text_size_60));
        }
        return sportEquipItemDetail;
    }

    private int a(Context context, float f) {
        return (int) (((double) (f * this.f43970c)) + 0.5d);
    }
}
