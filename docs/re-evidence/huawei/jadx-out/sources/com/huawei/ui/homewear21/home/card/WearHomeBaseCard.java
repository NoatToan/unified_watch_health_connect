package com.huawei.ui.homewear21.home.card;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.ui.homewear21.home.WearHomeOldActivity;

/* JADX INFO: loaded from: classes18.dex */
public abstract class WearHomeBaseCard {
    public WearHomeOldActivity mActivity;
    public Context mContext;
    protected DeviceInfo mCurrentDeviceInfo;
    protected DeviceCapability mDeviceCapability;
    public volatile String mDeviceMac;

    public abstract void deviceConnectionChange(int i);

    public abstract RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater);

    public abstract void onDestroy();

    public abstract void onResume();
}
