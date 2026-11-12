package com.huawei.openalliance.ad;

import android.app.Activity;
import android.content.Context;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* JADX INFO: loaded from: classes12.dex */
public interface g {
    com.huawei.openalliance.ad.utils.o.a a();

    Object a(Context context, String str);

    void a(Activity activity);

    void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback);

    void a(String str);

    void b(String str);
}
