package com.huami.watch.companion.sync;

import android.content.Context;
import android.text.TextUtils;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.transport.CompanionModule;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import com.huami.watch.util.TimeUtil;

/* JADX INFO: loaded from: classes16.dex */
public class SyncTokenHelper {
    private static final String a = "SyncTokenHelper";

    public class a implements Runnable {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Transporter b;

        /* JADX INFO: renamed from: com.huami.watch.companion.sync.SyncTokenHelper$a$a, reason: collision with other inner class name */
        public class C0658a implements Transporter.DataSendResultCallback {
            public C0658a() {
            }

            @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
            public void onResultBack(DataTransportResult dataTransportResult) {
                Log.d("TOKEN", "result back " + dataTransportResult.toString(), new Object[0]);
                if (dataTransportResult.getResultCode() == 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Log.d(SyncTokenHelper.a, "Token Synced", new Object[0]);
                    Box.putTokenSyncTime(jCurrentTimeMillis);
                }
            }
        }

        public a(boolean z, Transporter transporter) {
            this.a = z;
            this.b = transporter;
        }

        @Override // java.lang.Runnable
        public void run() {
            String accessToken = Cloud.getToken().getAccessToken();
            if (!TextUtils.isEmpty(accessToken)) {
                DataBundle dataBundle = new DataBundle();
                dataBundle.putString("token", accessToken);
                dataBundle.putBoolean("isForReply", this.a);
                this.b.send(CompanionModule.ACTION_QUERY_TOKEN, dataBundle, new C0658a());
                return;
            }
            Log.w(SyncTokenHelper.a, "Token is Empty : " + accessToken + ", Abort!!", new Object[0]);
        }
    }

    private static boolean a() {
        return Math.abs(TimeUtil.offsetMinusCurrentToMillis(Box.getLastTokenSyncTime(), "LastTokenSync")) >= 720;
    }

    public static void syncTokenToWatch(Context context, Transporter transporter, boolean z) {
        if (z || a()) {
            new Thread(new a(z, transporter)).start();
        }
    }
}
