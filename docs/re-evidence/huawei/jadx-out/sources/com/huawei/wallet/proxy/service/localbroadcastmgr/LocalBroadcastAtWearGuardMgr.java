package com.huawei.wallet.proxy.service.localbroadcastmgr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes45.dex */
class LocalBroadcastAtWearGuardMgr implements ILocalBroadcastMgr {
    private final Handler d;
    private final Context e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<ReceiverRecord>> f30034c = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<String, ArrayList<ReceiverRecord>> f30033b = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<BroadcastRecord> f30032a = new ArrayList<>();

    LocalBroadcastAtWearGuardMgr(Context context) {
        this.e = context;
        this.d = new Handler(context.getMainLooper()) { // from class: com.huawei.wallet.proxy.service.localbroadcastmgr.LocalBroadcastAtWearGuardMgr.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 1) {
                    LocalBroadcastAtWearGuardMgr.this.a();
                } else {
                    super.handleMessage(message);
                }
            }
        };
    }

    @Override // com.huawei.wallet.proxy.service.localbroadcastmgr.ILocalBroadcastMgr
    public void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f30034c) {
            ReceiverRecord receiverRecord = new ReceiverRecord(intentFilter, broadcastReceiver);
            ArrayList<ReceiverRecord> arrayList = this.f30034c.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f30034c.put(broadcastReceiver, arrayList);
            }
            arrayList.add(receiverRecord);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<ReceiverRecord> arrayList2 = this.f30033b.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f30033b.put(action, arrayList2);
                }
                arrayList2.add(receiverRecord);
            }
        }
    }

    @Override // com.huawei.wallet.proxy.service.localbroadcastmgr.ILocalBroadcastMgr
    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f30034c) {
            ArrayList<ReceiverRecord> arrayListRemove = this.f30034c.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                ReceiverRecord receiverRecord = arrayListRemove.get(size);
                receiverRecord.d = true;
                for (int i = 0; i < receiverRecord.f30037a.countActions(); i++) {
                    e(receiverRecord.f30037a.getAction(i), broadcastReceiver);
                }
            }
        }
    }

    private void e(String str, BroadcastReceiver broadcastReceiver) {
        ArrayList<ReceiverRecord> arrayList = this.f30033b.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ReceiverRecord receiverRecord = arrayList.get(size);
                if (receiverRecord.f30039c == broadcastReceiver) {
                    receiverRecord.d = true;
                    arrayList.remove(size);
                }
            }
            if (arrayList.size() <= 0) {
                this.f30033b.remove(str);
            }
        }
    }

    @Override // com.huawei.wallet.proxy.service.localbroadcastmgr.ILocalBroadcastMgr
    public boolean sendBroadcast(Intent intent) {
        synchronized (this.f30034c) {
            ArrayList<ReceiverRecord> arrayList = this.f30033b.get(intent.getAction());
            if (arrayList == null) {
                return false;
            }
            ArrayList<ReceiverRecord> arrayListB = b(intent, arrayList);
            if (arrayListB == null) {
                return false;
            }
            for (int i = 0; i < arrayListB.size(); i++) {
                arrayListB.get(i).f30038b = false;
            }
            this.f30032a.add(new BroadcastRecord(intent, arrayListB));
            if (!this.d.hasMessages(1)) {
                this.d.sendEmptyMessage(1);
            }
            return true;
        }
    }

    private ArrayList<ReceiverRecord> b(Intent intent, ArrayList<ReceiverRecord> arrayList) {
        String str;
        String action = intent.getAction();
        String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.e.getContentResolver());
        Uri data = intent.getData();
        String scheme = intent.getScheme();
        Set<String> categories = intent.getCategories();
        ArrayList<ReceiverRecord> arrayList2 = null;
        int i = 0;
        while (i < arrayList.size()) {
            ReceiverRecord receiverRecord = arrayList.get(i);
            if (receiverRecord.f30038b) {
                str = action;
            } else {
                str = action;
                if (receiverRecord.f30037a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager") >= 0) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    arrayList2.add(receiverRecord);
                    receiverRecord.f30038b = true;
                }
            }
            i++;
            action = str;
        }
        return arrayList2;
    }

    @Override // com.huawei.wallet.proxy.service.localbroadcastmgr.ILocalBroadcastMgr
    public void sendBroadcastSync(Intent intent) {
        if (sendBroadcast(intent)) {
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        BroadcastRecord[] broadcastRecordArr;
        while (true) {
            synchronized (this.f30034c) {
                int size = this.f30032a.size();
                if (size <= 0) {
                    return;
                }
                broadcastRecordArr = new BroadcastRecord[size];
                this.f30032a.toArray(broadcastRecordArr);
                this.f30032a.clear();
            }
            a(broadcastRecordArr);
        }
    }

    private void a(BroadcastRecord[] broadcastRecordArr) {
        for (BroadcastRecord broadcastRecord : broadcastRecordArr) {
            int size = broadcastRecord.f30036a.size();
            for (int i = 0; i < size; i++) {
                ReceiverRecord receiverRecord = broadcastRecord.f30036a.get(i);
                if (!receiverRecord.d && receiverRecord.f30039c != null) {
                    receiverRecord.f30039c.onReceive(this.e, broadcastRecord.d);
                }
            }
        }
    }

    static final class ReceiverRecord {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final IntentFilter f30037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f30038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final BroadcastReceiver f30039c;
        boolean d;

        ReceiverRecord(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f30037a = intentFilter;
            this.f30039c = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f30039c);
            sb.append(" filter=");
            sb.append(this.f30037a);
            if (this.d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    static final class BroadcastRecord {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ArrayList<ReceiverRecord> f30036a;
        final Intent d;

        BroadcastRecord(Intent intent, ArrayList<ReceiverRecord> arrayList) {
            this.d = intent;
            this.f30036a = arrayList;
        }
    }
}
