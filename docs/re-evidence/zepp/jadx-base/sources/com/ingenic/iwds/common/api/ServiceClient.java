package com.ingenic.iwds.common.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.ingenic.iwds.uniconnect.ConnectionServiceManager;
import com.ingenic.iwds.utils.IwdsAssert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class ServiceClient {
    private static HashMap<String, c> h;
    private static List<String> i = new ArrayList(Arrays.asList("com.ingenic.watchmanager", "com.ingenic.iwds.device", "com.ingenic.iwds.phone", "com.ingenic.watchconnector", "com.huami.watch.launcher", "com.huami.watch.phonemanager", "com.huami.mobile.launcher", "com.huami.watch.hmwatchmanager", "com.huami.watch.huamiwatchmanager", com.huami.account.utils.b.Amazfit));
    private Context a;
    private String b;
    private ConnectionCallbacks c;
    private b d;
    private ServiceManagerContext e;
    private c f;
    private Intent g;

    public interface ConnectionCallbacks {
        void onConnectFailed(ServiceClient serviceClient, ConnectFailedReason connectFailedReason);

        void onConnected(ServiceClient serviceClient);

        void onDisconnected(ServiceClient serviceClient, boolean z);
    }

    public class a extends c {
        public a() {
            super(ServiceClient.this, null);
        }

        @Override // com.ingenic.iwds.common.api.ServiceClient.c
        public ServiceManagerContext a(Context context) {
            return new ConnectionServiceManager(context);
        }

        @Override // com.ingenic.iwds.common.api.ServiceClient.c
        public String b() {
            return "com.ingenic.iwds.uniconnect.ConnectionService";
        }
    }

    public abstract class c {
        public Intent a;

        private c() {
        }

        public abstract ServiceManagerContext a(Context context);

        public abstract String b();

        public void c(Intent intent) {
            this.a = intent;
        }

        public Intent d() {
            return this.a;
        }

        public /* synthetic */ c(ServiceClient serviceClient, a aVar) {
            this();
        }
    }

    public ServiceClient(Context context, String str, ConnectionCallbacks connectionCallbacks) {
        IwdsAssert.dieIf(this, context == null, "Context is null.");
        IwdsAssert.dieIf(this, str == null || str.isEmpty(), "Service name is null or empty.");
        IwdsAssert.dieIf(this, connectionCallbacks == null, "Callbacks is null.");
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        IwdsAssert.dieIf(this, applicationContext == null, "Application context is null");
        this.c = connectionCallbacks;
        this.d = new b(this, null);
        this.b = str;
        if (h == null) {
            c(this.a);
        }
        c cVar = h.get(this.b);
        this.f = cVar;
        IwdsAssert.dieIf(this, cVar == null, "Unsupported service: " + this.b);
        this.e = this.f.a(this.a);
        Intent intentD = this.f.d();
        this.g = intentD;
        IwdsAssert.dieIf(this, intentD == null, "Unable to find service bind intent: " + this.b);
    }

    private Intent a(Context context, String str) {
        String str2;
        String str3;
        Intent intent = new Intent(str);
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices != null && listQueryIntentServices.size() != 0) {
            Iterator<ResolveInfo> it2 = listQueryIntentServices.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    str2 = null;
                    str3 = null;
                    break;
                }
                ResolveInfo next = it2.next();
                if (i.contains(next.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = next.serviceInfo;
                    str3 = serviceInfo.packageName;
                    str2 = serviceInfo.name;
                    break;
                }
            }
            if (str3 != null && str2 != null) {
                ComponentName componentName = new ComponentName(str3, str2);
                Intent intent2 = new Intent(intent);
                intent2.setComponent(componentName);
                return intent2;
            }
        }
        return null;
    }

    private void c(Context context) {
        HashMap<String, c> map = new HashMap<>();
        h = map;
        map.put(ServiceManagerContext.SERVICE_CONNECTION, new a());
        Iterator<String> it2 = h.keySet().iterator();
        while (it2.hasNext()) {
            c cVar = h.get(it2.next());
            cVar.c(a(context.getApplicationContext(), cVar.b()));
        }
    }

    public void connect() {
        this.d.d();
    }

    public void disconnect() {
        this.d.e();
    }

    public ServiceManagerContext getServiceManagerContext() {
        return this.e;
    }

    public String getServiceName() {
        return this.b;
    }

    public boolean isConnected() {
        return this.d.a() == 3;
    }

    public class b extends Handler {
        private int a;
        private boolean b;
        private boolean c;
        private ServiceConnection d;

        public class a implements ServiceConnection {
            public a() {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                b.this.b(iBinder);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                b.this.f();
            }
        }

        private b() {
            this.a = 0;
            this.d = new a();
        }

        public int a() {
            int i;
            synchronized (this) {
                i = this.a;
            }
            return i;
        }

        public void b(IBinder iBinder) {
            Message messageObtain = Message.obtain(this);
            messageObtain.what = 20;
            messageObtain.obj = iBinder;
            messageObtain.sendToTarget();
        }

        public void c(ConnectFailedReason connectFailedReason) {
            Message messageObtain = Message.obtain(this);
            messageObtain.what = 9;
            messageObtain.obj = connectFailedReason;
            messageObtain.sendToTarget();
        }

        public void d() {
            Message messageObtain = Message.obtain(this);
            messageObtain.what = 19;
            messageObtain.sendToTarget();
        }

        public void e() {
            Message messageObtain = Message.obtain(this);
            messageObtain.what = 87;
            messageObtain.sendToTarget();
        }

        public void f() {
            Message messageObtain = Message.obtain(this);
            messageObtain.what = 14;
            messageObtain.sendToTarget();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 9) {
                synchronized (this) {
                    this.a = 0;
                }
                ServiceClient.this.c.onConnectFailed(ServiceClient.this, (ConnectFailedReason) message.obj);
                return;
            }
            boolean z = true;
            if (i == 14) {
                synchronized (this) {
                    if (this.a != 3) {
                        z = false;
                    }
                    this.a = 0;
                }
                ServiceClient.this.c.onDisconnected(ServiceClient.this, z);
                ServiceClient.this.e.onServiceDisconnected(z);
                if (this.c) {
                    this.c = false;
                }
                if (this.b) {
                    this.b = false;
                    d();
                    return;
                }
                return;
            }
            if (i == 87) {
                synchronized (this) {
                    int i2 = this.a;
                    if (i2 != 2 && i2 != 0) {
                        if (i2 == 1) {
                            this.c = true;
                            return;
                        }
                        this.a = 2;
                        ServiceClient.this.a.unbindService(this.d);
                        f();
                        return;
                    }
                    if (this.b) {
                        this.b = false;
                    }
                    return;
                }
            }
            if (i != 19) {
                if (i != 20) {
                    return;
                }
                ServiceClient.this.e.onServiceConnected((IBinder) message.obj);
                synchronized (this) {
                    this.a = 3;
                }
                ServiceClient.this.c.onConnected(ServiceClient.this);
                if (this.b) {
                    this.b = false;
                }
                if (this.c) {
                    this.c = false;
                    e();
                    return;
                }
                return;
            }
            synchronized (this) {
                int i3 = this.a;
                if (i3 != 1 && i3 != 3) {
                    if (i3 == 2) {
                        this.b = true;
                        return;
                    }
                    this.a = 1;
                    if (ServiceClient.this.a.bindService(ServiceClient.this.g, this.d, 1)) {
                        return;
                    }
                    c(new ConnectFailedReason(1));
                    return;
                }
                if (this.c) {
                    this.c = false;
                }
            }
        }

        public /* synthetic */ b(ServiceClient serviceClient, a aVar) {
            this();
        }
    }
}
