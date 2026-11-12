package r;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsService;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements ServiceConnection {
    private Context mApplicationContext;

    public class a extends d {
        public a(f fVar, ICustomTabsService iCustomTabsService, ComponentName componentName, Context context) {
            super(iCustomTabsService, componentName, context);
        }
    }

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, d dVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.mApplicationContext != null) {
            onCustomTabsServiceConnected(componentName, new a(this, ICustomTabsService.Stub.asInterface(iBinder), componentName, this.mApplicationContext));
        } else {
            h.z("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
