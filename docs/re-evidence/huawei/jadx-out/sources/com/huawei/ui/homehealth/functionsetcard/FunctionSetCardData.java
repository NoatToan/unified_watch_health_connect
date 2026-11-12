package com.huawei.ui.homehealth.functionsetcard;

import android.content.Context;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.sio;
import defpackage.sis;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes17.dex */
public class FunctionSetCardData extends EmptyFunctionSetCardData implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FunctionSetCardViewHolder f25418a;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.EmptyFunctionSetCardData, com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void refreshCardData() {
    }

    public FunctionSetCardData(Context context) {
        super(context);
        this.mPositionTag = 60;
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.EmptyFunctionSetCardData, com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        FunctionSetCardViewHolder functionSetCardViewHolder = (FunctionSetCardViewHolder) super.getCardViewHolder(viewGroup, layoutInflater);
        this.f25418a = functionSetCardViewHolder;
        return functionSetCardViewHolder;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public String getCardName() {
        return "FunctionSetCardData";
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        FunctionSetCardViewHolder functionSetCardViewHolder = this.f25418a;
        if (functionSetCardViewHolder == null) {
            LogUtil.j("FunctionSetCardData", "FunctionSetCardData : onResume()mFunctionSetCardViewHolder is null");
            return;
        }
        functionSetCardViewHolder.d();
        ReleaseLogUtil.d("FunctionSetCardData", "main card onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onDestroy() {
        super.onDestroy();
        FunctionSetCardViewHolder functionSetCardViewHolder = this.f25418a;
        if (functionSetCardViewHolder != null) {
            functionSetCardViewHolder.e();
        }
        sis.c();
        sio.d();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onConfigurationChanged(Configuration configuration) {
        FunctionSetCardViewHolder functionSetCardViewHolder = this.f25418a;
        if (functionSetCardViewHolder != null) {
            functionSetCardViewHolder.j();
        }
    }
}
