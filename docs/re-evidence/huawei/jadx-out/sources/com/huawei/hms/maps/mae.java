package com.huawei.hms.maps;

import android.os.IInterface;
import com.huawei.hms.feature.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes10.dex */
public interface mae extends IInterface {
    String getId();

    IObjectWrapper getTag();

    float getZIndex();

    int hashCodeRemote();

    boolean isClickable();

    boolean isVisible();

    void remove();

    void setClickable(boolean z);

    void setTag(IObjectWrapper iObjectWrapper);

    void setVisible(boolean z);

    void setZIndex(float f);
}
