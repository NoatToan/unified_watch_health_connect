package com.miui.tsmclient.model;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.entity.GroupConfigInfo;
import com.miui.tsmclient.entity.NonTransactionHciEvent;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.net.request.ConfigListRequest;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.PrefUtils;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile i f10370b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<Context> f10371a;

    public i(Context context) {
        this.f10371a = new WeakReference<>(context);
    }

    public static i b() {
        if (f10370b == null) {
            synchronized (i.class) {
                try {
                    if (f10370b == null) {
                        f10370b = new i(EnvironmentConfig.getContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10370b;
    }

    public final List<NonTransactionHciEvent> a() {
        GroupConfigInfo groupConfigInfo;
        boolean zC = c();
        StringBuilder sb = new StringBuilder();
        sb.append("fetchNonTransactionHciEvent");
        sb.append(zC ? " on main thread" : "");
        LogUtils.i(sb.toString());
        Context context = this.f10371a.get();
        ArrayList arrayList = new ArrayList();
        if (context == null) {
            return arrayList;
        }
        if (zC) {
            groupConfigInfo = null;
        } else {
            ConfigListRequest configListRequest = new ConfigListRequest(null, GroupConfigInfo.NON_TRANSACTION_HCI_CONFIG_LIST, null);
            configListRequest.addParams(TSMAuthContants.PARAM_CONFIG_CATEGORY, "nonTransactionHciEvent");
            try {
                groupConfigInfo = (GroupConfigInfo) HttpClient.getInstance(context).execute(configListRequest).getResult();
                try {
                    LogUtils.d("fetchNonTransactionHciEvent isSuccess:" + configListRequest.isSuccess());
                    if (configListRequest.isSuccess()) {
                        PrefUtils.putString(context, PrefUtils.PREF_KEY_NON_TRANSACTION_HCI_CONFIG, new Gson().toJson(groupConfigInfo));
                    }
                } catch (IOException e) {
                    e = e;
                    LogUtils.e("ConfigListSyncRequest Exception occurred when fetchNonTransactionHciEvent", e);
                }
            } catch (IOException e2) {
                e = e2;
                groupConfigInfo = null;
            }
        }
        if (groupConfigInfo == null) {
            String string = PrefUtils.getString(context, PrefUtils.PREF_KEY_NON_TRANSACTION_HCI_CONFIG, null);
            if (!TextUtils.isEmpty(string)) {
                groupConfigInfo = (GroupConfigInfo) new Gson().fromJson(string, GroupConfigInfo.class);
            }
        }
        return groupConfigInfo != null ? groupConfigInfo.getInfoList((String) null, GroupConfigInfo.NON_TRANSACTION_HCI_CONFIG_LIST, NonTransactionHciEvent.class) : arrayList;
    }

    public final boolean c() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public void d() {
        a();
    }

    public NonTransactionHciEvent a(String str) {
        for (NonTransactionHciEvent nonTransactionHciEvent : a()) {
            if (TextUtils.equals(nonTransactionHciEvent.getAid(), str)) {
                return nonTransactionHciEvent;
            }
        }
        return null;
    }

    public NonTransactionHciEvent a(String str, String str2) {
        for (NonTransactionHciEvent nonTransactionHciEvent : a()) {
            if (nonTransactionHciEvent.isSupport(str, str2)) {
                return nonTransactionHciEvent;
            }
        }
        return null;
    }
}
