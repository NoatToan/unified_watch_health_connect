package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hihealth.ICommonListener;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
public class ljh {
    private Context e = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Executor f40345c = null;
    private Map<String, ICommonListener> d = new HashMap(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f40344b = new Handler(Looper.getMainLooper()) { // from class: ljh.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                final HashMap map = (HashMap) message.obj;
                ljh.this.f40345c.execute(new Runnable() { // from class: ljh.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        ljh.this.e((HashMap<String, Object>) map);
                    }
                });
            } else {
                if (i != 1) {
                    return;
                }
                final String str = message.obj instanceof String ? (String) message.obj : null;
                ljh.this.f40345c.execute(new Runnable() { // from class: ljh.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        ljh.this.c(str);
                    }
                });
            }
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BroadcastReceiver f40343a = new BroadcastReceiver() { // from class: ljh.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || TextUtils.isEmpty(intent.getAction()) || !"action_transcation_end".equals(intent.getAction())) {
                return;
            }
            HashMap map = new HashMap(16);
            Bundle extras = intent.getExtras();
            if (extras != null) {
                map.put("uuid", extras.getString("uuid"));
                map.put("result", Integer.valueOf(extras.getInt("result")));
            }
            ljh.this.f40344b.obtainMessage(0, map).sendToTarget();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void e(HashMap<String, Object> map) {
        if (map == null) {
            return;
        }
        String str = map.get("uuid") instanceof String ? (String) map.get("uuid") : null;
        Integer num = map.get("result") instanceof Integer ? (Integer) map.get("result") : null;
        ICommonListener iCommonListener = this.d.get(str);
        if (iCommonListener == null) {
            return;
        }
        this.d.remove(str);
        if (num == null || num.intValue() != 0) {
            LogUtil.a("HiTranscation", "transcation fail:");
            ArrayList arrayList = new ArrayList(10);
            arrayList.add(false);
            d(iCommonListener, 14, arrayList);
            return;
        }
        LogUtil.a("HiTranscation", "transcation success:");
        ArrayList arrayList2 = new ArrayList(10);
        arrayList2.add(false);
        c(iCommonListener, 0, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        this.d.remove(str);
    }

    public void d(Context context, Executor executor) {
        if (context == null) {
            return;
        }
        this.e = context;
        this.f40345c = executor;
        BroadcastManagerUtil.d(context, this.f40343a, new IntentFilter("action_transcation_end"), LocalBroadcast.f36595c, null);
    }

    public void a() {
        Context context = this.e;
        if (context != null) {
            context.unregisterReceiver(this.f40343a);
        }
    }

    public void c(String str, ICommonListener iCommonListener) {
        LogUtil.a("HiTranscation", "transcation begin");
        this.d.put(str, iCommonListener);
        this.f40344b.sendMessageDelayed(this.f40344b.obtainMessage(1, str), 20000L);
    }

    private void c(ICommonListener iCommonListener, int i, List list) {
        if (iCommonListener == null) {
            return;
        }
        try {
            iCommonListener.onSuccess(i, list);
        } catch (RemoteException e) {
            ReleaseLogUtil.e("HiH_HiTranscation", "ICommonListener setSuccess  exception = ", e.getMessage());
        } catch (Exception e2) {
            ReleaseLogUtil.e("HiH_HiTranscation", "ICommonListener setSuccess Exception", LogAnonymous.b(e2));
        }
    }

    private void d(ICommonListener iCommonListener, int i, List list) {
        if (iCommonListener == null) {
            return;
        }
        try {
            iCommonListener.onFailure(i, list);
        } catch (RemoteException e) {
            ReleaseLogUtil.e("HiH_HiTranscation", "ICommonListener setFail  exception = ", e.getMessage());
        } catch (Exception e2) {
            ReleaseLogUtil.e("HiH_HiTranscation", "ICommonListener setSuccess Exception", LogAnonymous.b(e2));
        }
    }
}
