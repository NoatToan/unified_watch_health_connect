package com.huami.watch.companion.util;

import android.content.Context;
import com.huami.watch.companion.cloud.api.StatisticsAPI;
import com.huami.watch.util.Rx;

/* JADX INFO: loaded from: classes16.dex */
public class StatisticsUtil {

    public class a implements Runnable {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            StatisticsAPI.postStatistics(this.a);
        }
    }

    public static void uploadStatisticsAsync(Context context) {
        Rx.io(new a(context)).safeSubscribe();
    }
}
