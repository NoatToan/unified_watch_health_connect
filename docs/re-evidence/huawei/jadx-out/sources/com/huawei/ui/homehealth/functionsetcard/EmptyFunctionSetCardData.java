package com.huawei.ui.homehealth.functionsetcard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData;
import com.huawei.ui.homehealth.R;
import defpackage.fua;
import defpackage.rhc;
import defpackage.sio;

/* JADX INFO: loaded from: classes17.dex */
public abstract class EmptyFunctionSetCardData extends AbstractBaseCardData {
    protected Context mContext;
    private FunctionSetCardViewHolder mFunctionSetCardViewHolder;

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void refreshCardData() {
    }

    public EmptyFunctionSetCardData(Context context) {
        this.mContext = context;
        rhc.d(context);
        sio.c().m();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        FunctionSetCardViewHolder functionSetCardViewHolder = new FunctionSetCardViewHolder(layoutInflater.inflate(fua.s() ? R.layout.home_item_layout_function_set_chinese : R.layout.home_item_layout_function_set, viewGroup, false), this.mContext, false);
        this.mFunctionSetCardViewHolder = functionSetCardViewHolder;
        return functionSetCardViewHolder;
    }

    public void onEmptyFragmentDestroy() {
        FunctionSetCardViewHolder functionSetCardViewHolder = this.mFunctionSetCardViewHolder;
        if (functionSetCardViewHolder != null) {
            functionSetCardViewHolder.c();
            this.mFunctionSetCardViewHolder = null;
        }
    }
}
