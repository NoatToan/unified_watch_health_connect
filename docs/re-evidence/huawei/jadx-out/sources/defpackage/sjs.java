package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.health.utils.functionsetcard.FunctionSetBean;
import com.huawei.health.health.utils.functionsetcard.FunctionSetType;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes43.dex */
public class sjs extends FunctionSetBeanReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Resources f48202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicLong f48203c;

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getDefaultLargeCardImageRes() {
        return null;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public boolean isMessageDefaultLargeCard() {
        return true;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public boolean isOverseaDefaultLargeCard() {
        return true;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public boolean isSubscribeType(int i) {
        return false;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void readCardData() {
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void subscribeDataChange() {
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void unsubscribeDataChange() {
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void updateSuccessList(List<Integer> list) {
    }

    public sjs(Context context, CardConfig cardConfig) {
        super(context, "HL_DefaultCardReader", cardConfig);
        LogUtil.a("HL_DefaultCardReader", "FunctionSetHealthLifeDefaultCardReader");
        b();
        setHasCardData(false);
        setFunctionSetBean(buildEmptyCardBean());
    }

    private void b() {
        this.f48202b = this.mContext.getResources();
        this.f48203c = new AtomicLong();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        ReleaseLogUtil.d("TimeEat_HL_DefaultCardReader", "onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("HL_DefaultCardReader", "onDestroy");
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, FunctionSetSubCardData functionSetSubCardData) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onBindViewHolder(viewHolder, functionSetSubCardData);
        ReleaseLogUtil.d("TimeEat_HL_DefaultCardReader", "onBindViewHolder finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public View createCardView() {
        LogUtil.a("HL_DefaultCardReader", "createCardView");
        c(buildEmptyCardBean());
        return null;
    }

    private void c(FunctionSetBean functionSetBean) {
        if (functionSetBean == null) {
            LogUtil.j("HL_DefaultCardReader", "notifyDataView mFunctionSetBean is null");
        } else {
            notifyItemChanged(functionSetBean);
        }
    }

    private String e() {
        return qre.f(R.string.IDS_health_clover_title);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getCardTitle() {
        FunctionSetBean functionSetBean = getFunctionSetBean();
        if (functionSetBean == null) {
            LogUtil.j("HL_DefaultCardReader", "getCardTitle functionSetBean is null");
            return e();
        }
        return functionSetBean.m();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public FunctionSetBean buildEmptyCardBean() {
        LogUtil.a("HL_DefaultCardReader", "setEmptyFunctionSetBean");
        return new FunctionSetBean.c(e()).c(this.f48202b.getString(com.huawei.health.servicesui.R.string.IDS_health_model_home_card_description)).e(FunctionSetType.HEALTH_MODEL_CARD).c(FunctionSetBean.ViewType.EMPTY_VIEW).b(this.mContext).a(false).a();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public void onCardViewClickListener(FunctionSetBean.ViewType viewType) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LogUtil.a("HL_DefaultCardReader", "onBindViewHolder onClick elapsedRealtime ", Long.valueOf(jElapsedRealtime));
        if (Math.abs(jElapsedRealtime - this.f48203c.get()) < 800) {
            LogUtil.j("HL_DefaultCardReader", "onBindViewHolder onClick fast click");
        } else {
            this.f48203c.set(jElapsedRealtime);
            ffv.a(this.mContext, Uri.parse("").buildUpon().appendQueryParameter("from", "HealthModel_FunctionSetHealthModelCardReader").build());
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getDefaultImage(boolean z) {
        if (z) {
            return com.huawei.health.servicesui.R.drawable.helath_life_default_img_big;
        }
        return com.huawei.health.servicesui.R.drawable.health_life_default_img_small;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getChildTag() {
        return "HL_DefaultCardReader";
    }
}
