package com.huawei.hms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.internal.IMapFragmentDelegate;
import com.huawei.hms.maps.model.RuntimeRemoteException;
import com.huawei.hms.maps.utils.LogM;
import com.huawei.hms.maps.utils.MapsAdvUtil;

/* JADX INFO: loaded from: classes34.dex */
public abstract class mao {
    public static View a(Activity activity, IMapFragmentDelegate iMapFragmentDelegate, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context contextE;
        Context context;
        try {
            Bundle bundleA = map.a(bundle);
            if (!MapsAdvUtil.containsMapsBasic()) {
                contextE = com.huawei.hms.maps.internal.mab.e(activity);
            }
            if (iMapFragmentDelegate == null) {
                context = contextE;
                context = activity;
                return LayoutInflater.from(context).inflate(R.layout.hms_map_empty_layout_sdk, (ViewGroup) null);
            }
            context = contextE;
            LogM.d("MapFragmentUtil", "sdk onCreateView iMapFragmentDelegate" + iMapFragmentDelegate);
            View view = (View) ObjectWrapper.unwrap(iMapFragmentDelegate.onCreateView(ObjectWrapper.wrap(LayoutInflater.from(context)), ObjectWrapper.wrap(viewGroup), bundleA));
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    context = activity;
                    LogM.d("MapFragmentUtil", "onCreateView: removeView");
                    ((ViewGroup) parent).removeView(view);
                }
            }
            context = activity;
            context = activity;
            return view;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
