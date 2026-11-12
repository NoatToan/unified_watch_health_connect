package z9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f203096f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static a f203097g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f203098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f203099b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, ArrayList<c>> f203100c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<b> f203101d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HandlerC3787a f203102e;

    /* JADX INFO: renamed from: z9.a$a, reason: collision with other inner class name */
    public class HandlerC3787a extends Handler {
        public HandlerC3787a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int size;
            b[] bVarArr;
            if (message.what != 1) {
                super.handleMessage(message);
                return;
            }
            a aVar = a.this;
            while (true) {
                synchronized (aVar.f203099b) {
                    try {
                        size = aVar.f203101d.size();
                        if (size <= 0) {
                            return;
                        }
                        bVarArr = new b[size];
                        aVar.f203101d.toArray(bVarArr);
                        aVar.f203101d.clear();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                for (int i14 = 0; i14 < size; i14++) {
                    b bVar = bVarArr[i14];
                    int size2 = bVar.f203105b.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        c cVar = bVar.f203105b.get(i15);
                        if (!cVar.f203109d) {
                            cVar.f203107b.onReceive(aVar.f203098a, bVar.f203104a);
                        }
                    }
                }
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f203104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<c> f203105b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f203104a = intent;
            this.f203105b = arrayList;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IntentFilter f203106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BroadcastReceiver f203107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f203108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f203109d;

        public c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f203106a = intentFilter;
            this.f203107b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder(128);
            sb3.append("Receiver{");
            sb3.append(this.f203107b);
            sb3.append(" filter=");
            sb3.append(this.f203106a);
            if (this.f203109d) {
                sb3.append(" DEAD");
            }
            sb3.append(StringSubstitutor.DEFAULT_VAR_END);
            return sb3.toString();
        }
    }

    private a(Context context) {
        this.f203098a = context;
        this.f203102e = new HandlerC3787a(context.getMainLooper());
    }

    public static a a(Context context) {
        a aVar;
        synchronized (f203096f) {
            try {
                if (f203097g == null) {
                    f203097g = new a(context.getApplicationContext());
                }
                aVar = f203097g;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return aVar;
    }

    public final void b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        synchronized (this.f203099b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList<c> arrayList = this.f203099b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f203099b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i14 = 0; i14 < intentFilter.countActions(); i14++) {
                    String action = intentFilter.getAction(i14);
                    ArrayList<c> arrayList2 = this.f203100c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f203100c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c(Intent intent) {
        int iMatch;
        synchronized (this.f203099b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f203098a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z14 = (intent.getFlags() & 8) != 0;
                if (z14) {
                    intent.toString();
                }
                ArrayList<c> arrayList = this.f203100c.get(intent.getAction());
                if (arrayList != null) {
                    if (z14) {
                        arrayList.toString();
                    }
                    ArrayList arrayList2 = null;
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        c cVar = arrayList.get(i14);
                        if (z14) {
                            Objects.toString(cVar.f203106a);
                        }
                        if (!cVar.f203108c && (iMatch = cVar.f203106a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager")) >= 0) {
                            if (z14) {
                                Integer.toHexString(iMatch);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(cVar);
                            cVar.f203108c = true;
                        }
                    }
                    if (arrayList2 != null) {
                        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                            ((c) arrayList2.get(i15)).f203108c = false;
                        }
                        this.f203101d.add(new b(intent, arrayList2));
                        if (!this.f203102e.hasMessages(1)) {
                            this.f203102e.sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f203099b) {
            try {
                ArrayList<c> arrayListRemove = this.f203099b.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                    c cVar = arrayListRemove.get(size);
                    cVar.f203109d = true;
                    for (int i14 = 0; i14 < cVar.f203106a.countActions(); i14++) {
                        String action = cVar.f203106a.getAction(i14);
                        ArrayList<c> arrayList = this.f203100c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = arrayList.get(size2);
                                if (cVar2.f203107b == broadcastReceiver) {
                                    cVar2.f203109d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f203100c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
