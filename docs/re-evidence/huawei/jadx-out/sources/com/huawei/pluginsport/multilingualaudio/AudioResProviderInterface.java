package com.huawei.pluginsport.multilingualaudio;

import android.app.Activity;
import com.huawei.haf.router.facade.template.ServiceProvider;
import defpackage.pql;
import defpackage.pqp;

/* JADX INFO: loaded from: classes3.dex */
public interface AudioResProviderInterface extends ServiceProvider {
    public static final String ROUTER_PATH_AUDIO_RES_DOWNLOAD = "/sportservice/AudioResDownloadImpl";
    public static final String ROUTER_PATH_AUDIO_RES_PROVIDER = "/sportservice/AudioResProviderImpl";

    default void queryOrDownAudioResource(Activity activity, pqp pqpVar, String str, AudioResDownloadListener audioResDownloadListener) {
    }

    default pql getAudioResPath(String str, String str2, String str3) {
        return new pql();
    }
}
