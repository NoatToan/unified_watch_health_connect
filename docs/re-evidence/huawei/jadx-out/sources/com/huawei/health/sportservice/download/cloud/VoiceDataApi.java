package com.huawei.health.sportservice.download.cloud;

import android.content.Context;
import com.huawei.basefitnessadvice.callback.UiCallback;
import defpackage.hbh;
import defpackage.hbj;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface VoiceDataApi {
    void getVoiceBroadcastList(Context context, List<hbj> list, UiCallback<List<hbh>> uiCallback);
}
