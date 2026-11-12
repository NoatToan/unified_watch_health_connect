package defpackage;

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
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class aje {
    public static final Object f = new Object();
    public static aje g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f1091b = new HashMap<>();
    public final HashMap<String, ArrayList<c>> c = new HashMap<>();
    public final ArrayList<b> d = new ArrayList<>();
    public final Handler e;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                aje.this.a();
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f1093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<c> f1094b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f1093a = intent;
            this.f1094b = arrayList;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IntentFilter f1095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BroadcastReceiver f1096b;
        public boolean c;
        public boolean d;

        public c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f1095a = intentFilter;
            this.f1096b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f1096b);
            sb.append(" filter=");
            sb.append(this.f1095a);
            if (this.d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public aje(Context context) {
        this.f1090a = context;
        this.e = new a(context.getMainLooper());
    }

    public static aje b(Context context) {
        aje ajeVar;
        synchronized (f) {
            try {
                if (g == null) {
                    g = new aje(context.getApplicationContext());
                }
                ajeVar = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ajeVar;
    }

    public void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f1091b) {
                try {
                    size = this.d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.d.toArray(bVarArr);
                    this.d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i = 0; i < size; i++) {
                b bVar = bVarArr[i];
                int size2 = bVar.f1094b.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    c cVar = bVar.f1094b.get(i2);
                    if (!cVar.d) {
                        cVar.f1096b.onReceive(this.f1090a, bVar.f1093a);
                    }
                }
            }
        }
    }

    public void c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f1091b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList<c> arrayList = this.f1091b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f1091b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList<c> arrayList2 = this.c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d(Intent intent) {
        int i;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        boolean z;
        String str3;
        synchronized (this.f1091b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f1090a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z2 = true;
                boolean z3 = (intent.getFlags() & 8) != 0;
                if (z3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Resolving type ");
                    sb.append(strResolveTypeIfNeeded);
                    sb.append(" scheme ");
                    sb.append(scheme);
                    sb.append(" of intent ");
                    sb.append(intent);
                }
                ArrayList<c> arrayList3 = this.c.get(intent.getAction());
                if (arrayList3 != null) {
                    if (z3) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Action list: ");
                        sb2.append(arrayList3);
                    }
                    ArrayList arrayList4 = null;
                    int i2 = 0;
                    while (i2 < arrayList3.size()) {
                        c cVar = arrayList3.get(i2);
                        if (z3) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Matching against filter ");
                            sb3.append(cVar.f1095a);
                        }
                        if (cVar.c) {
                            i = i2;
                            arrayList2 = arrayList3;
                            str = action;
                            str2 = strResolveTypeIfNeeded;
                            arrayList = arrayList4;
                            z = z2;
                        } else {
                            IntentFilter intentFilter = cVar.f1095a;
                            String str4 = action;
                            String str5 = strResolveTypeIfNeeded;
                            i = i2;
                            str = action;
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            str2 = strResolveTypeIfNeeded;
                            z = z2;
                            int iMatch = intentFilter.match(str4, str5, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z3) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("  Filter matched!  match=0x");
                                    sb4.append(Integer.toHexString(iMatch));
                                }
                                arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                                arrayList4.add(cVar);
                                cVar.c = z;
                            } else if (z3) {
                                if (iMatch == -4) {
                                    str3 = "category";
                                } else if (iMatch == -3) {
                                    str3 = "action";
                                } else if (iMatch != -2) {
                                    str3 = iMatch != -1 ? "unknown reason" : "type";
                                } else {
                                    str3 = "data";
                                }
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("  Filter did not match: ");
                                sb5.append(str3);
                            }
                            i2 = i + 1;
                            z2 = z;
                            action = str;
                            arrayList3 = arrayList2;
                            strResolveTypeIfNeeded = str2;
                        }
                        arrayList4 = arrayList;
                        i2 = i + 1;
                        z2 = z;
                        action = str;
                        arrayList3 = arrayList2;
                        strResolveTypeIfNeeded = str2;
                    }
                    ArrayList arrayList5 = arrayList4;
                    boolean z4 = z2;
                    if (arrayList5 != null) {
                        for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                            ((c) arrayList5.get(i3)).c = false;
                        }
                        this.d.add(new b(intent, arrayList5));
                        if (!this.e.hasMessages(z4 ? 1 : 0)) {
                            this.e.sendEmptyMessage(z4 ? 1 : 0);
                        }
                        return z4;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f1091b) {
            try {
                ArrayList<c> arrayListRemove = this.f1091b.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                    c cVar = arrayListRemove.get(size);
                    cVar.d = true;
                    for (int i = 0; i < cVar.f1095a.countActions(); i++) {
                        String action = cVar.f1095a.getAction(i);
                        ArrayList<c> arrayList = this.c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = arrayList.get(size2);
                                if (cVar2.f1096b == broadcastReceiver) {
                                    cVar2.d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
