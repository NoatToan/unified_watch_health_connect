package com.huawei.health.sportservice.download.business;

import android.app.Activity;
import android.content.Context;
import com.huawei.health.sportservice.download.CustomDownloadManager;
import com.huawei.pluginsport.multilingualaudio.AudioResDownloadListener;
import com.huawei.pluginsport.multilingualaudio.AudioResProviderInterface;
import defpackage.hbf;
import defpackage.hbm;
import defpackage.pqp;
import health.compact.a.LogUtil;
import health.compact.a.Utils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class AudioResDownloadImpl implements AudioResProviderInterface {
    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.pluginsport.multilingualaudio.AudioResProviderInterface
    public void queryOrDownAudioResource(Activity activity, pqp pqpVar, String str, AudioResDownloadListener audioResDownloadListener) {
        if (Utils.k()) {
            LogUtil.e("SportService_AudioResDownloadImpl", "isOverseaNoCloudVersion");
            audioResDownloadListener.onResult(0);
            return;
        }
        CustomDownloadManager customDownloadManager = new CustomDownloadManager(activity);
        ArrayList arrayList = new ArrayList();
        hbm hbmVar = new hbm(activity, pqpVar.a(), pqpVar.b(), pqpVar.e(), str);
        hbf hbfVar = new hbf(activity, "MultilingualAudio");
        hbmVar.e(hbfVar);
        arrayList.add(hbfVar);
        arrayList.add(hbmVar);
        customDownloadManager.e(arrayList, audioResDownloadListener);
        hbmVar.startQueryState();
    }
}
