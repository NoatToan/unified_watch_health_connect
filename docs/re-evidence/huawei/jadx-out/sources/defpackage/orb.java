package defpackage;

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

/* JADX INFO: loaded from: classes13.dex */
public class orb {
    private static final Object d = new Object();
    private static orb e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f44390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f44391b;
    private final HashMap<BroadcastReceiver, ArrayList<a>> g = new HashMap<>();
    private final ArrayList<d> j = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, ArrayList<a>> f44392c = new HashMap<>();

    static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f44394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final IntentFilter f44395c;
        private boolean d;
        private final BroadcastReceiver e;

        a(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f44395c = intentFilter;
            this.e = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.e);
            sb.append(" filter=");
            sb.append(this.f44395c);
            if (this.d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Intent f44396a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList<a> f44397c;

        d(Intent intent, ArrayList<a> arrayList) {
            this.f44396a = intent;
            this.f44397c = arrayList;
        }
    }

    public static orb d(Context context) {
        orb orbVar;
        synchronized (d) {
            if (e == null && context != null) {
                e = new orb(context.getApplicationContext());
            }
            orbVar = e;
        }
        return orbVar;
    }

    private orb(Context context) {
        this.f44390a = context;
        this.f44391b = new Handler(context.getMainLooper()) { // from class: orb.3
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 1) {
                    orb.this.e();
                } else {
                    super.handleMessage(message);
                }
            }
        };
    }

    public void d(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.g) {
            a aVar = new a(intentFilter, broadcastReceiver);
            ArrayList<a> arrayList = this.g.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.g.put(broadcastReceiver, arrayList);
            }
            arrayList.add(aVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<a> arrayList2 = this.f44392c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f44392c.put(action, arrayList2);
                }
                arrayList2.add(aVar);
            }
        }
    }

    public void b(BroadcastReceiver broadcastReceiver) {
        synchronized (this.g) {
            ArrayList<a> arrayListRemove = this.g.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                a aVar = arrayListRemove.get(size);
                aVar.d = true;
                for (int i = 0; i < aVar.f44395c.countActions(); i++) {
                    String action = aVar.f44395c.getAction(i);
                    ArrayList<a> arrayList = this.f44392c.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            a aVar2 = arrayList.get(size2);
                            if (aVar2.e == broadcastReceiver) {
                                aVar2.d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f44392c.remove(action);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public boolean d(Intent intent) {
        boolean z;
        String str;
        String str2;
        int i;
        ArrayList arrayList;
        Uri uri;
        boolean z2;
        synchronized (this.g) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f44390a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            ArrayList<a> arrayList2 = this.f44392c.get(intent.getAction());
            boolean z3 = false;
            if (arrayList2 != null) {
                ArrayList arrayList3 = null;
                int i2 = 0;
                while (i2 < arrayList2.size()) {
                    a aVar = arrayList2.get(i2);
                    if (aVar.f44394b) {
                        i = i2;
                        str = action;
                        str2 = strResolveTypeIfNeeded;
                        uri = data;
                        arrayList = arrayList3;
                        z2 = z3;
                    } else {
                        str = action;
                        String str3 = strResolveTypeIfNeeded;
                        str2 = strResolveTypeIfNeeded;
                        i = i2;
                        Uri uri2 = data;
                        arrayList = arrayList3;
                        uri = data;
                        z2 = z3;
                        if (aVar.f44395c.match(action, str3, scheme, uri2, categories, "ThemeLocalBroadcastManager") >= 0) {
                            arrayList3 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList3.add(aVar);
                            aVar.f44394b = true;
                        } else {
                            ork.b("ThemeLocalBroadcastManager", "match is lower than 0");
                        }
                        i2 = i + 1;
                        z3 = z2;
                        action = str;
                        strResolveTypeIfNeeded = str2;
                        data = uri;
                    }
                    arrayList3 = arrayList;
                    i2 = i + 1;
                    z3 = z2;
                    action = str;
                    strResolveTypeIfNeeded = str2;
                    data = uri;
                }
                ?? r11 = arrayList3;
                z = z3;
                if (r11 != 0) {
                    for (?? r9 = z; r9 < r11.size(); r9++) {
                        ((a) r11.get(r9)).f44394b = z;
                    }
                    this.j.add(new d(intent, r11));
                    if (!this.f44391b.hasMessages(1)) {
                        this.f44391b.sendEmptyMessage(1);
                    }
                    return true;
                }
            } else {
                z = false;
            }
            return z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        int size;
        d[] dVarArr;
        while (true) {
            synchronized (this.g) {
                size = this.j.size();
                if (size < 0 || size == 0) {
                    break;
                    break;
                } else {
                    dVarArr = new d[size];
                    this.j.toArray(dVarArr);
                    this.j.clear();
                }
            }
            for (int i = 0; i < size; i++) {
                d dVar = dVarArr[i];
                int size2 = dVar.f44397c.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    a aVar = (a) dVar.f44397c.get(i2);
                    if (!aVar.d) {
                        aVar.e.onReceive(this.f44390a, dVar.f44396a);
                    }
                }
            }
        }
    }
}
