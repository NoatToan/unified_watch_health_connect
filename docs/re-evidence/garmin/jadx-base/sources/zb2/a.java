package zb2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import gt2.c;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import vb.h;
import wb2.k;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f203893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f203894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f203895c;

    static {
        b[] bVarArr = b.f203896b;
        b[] bVarArr2 = b.f203896b;
    }

    public a(b[] bVarArr, Set<String> set, Long l14) {
        int i14 = c.f79010a;
        gt2.b.f79005a.i("SYNC#AbstractSyncBroadcastReceiver");
        HashSet hashSet = new HashSet();
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                hashSet.addAll(Arrays.asList(bVar.f203897a));
            }
        }
        if (set != null) {
            hashSet.addAll(set);
        }
        if (hashSet.isEmpty()) {
            h.s("Cannot create sync receiver with no selected events/broadcasts");
            throw null;
        }
        this.f203894b = hashSet;
        if (l14 == null || l14.longValue() <= 0) {
            this.f203893a = null;
        } else {
            this.f203893a = l14;
        }
    }

    public void a(Context context, Bundle bundle) {
    }

    public void b(Context context, Bundle bundle) {
    }

    public void c(Context context, Bundle bundle) {
    }

    public void d(Context context, Bundle bundle) {
    }

    public void e(Context context, Bundle bundle) {
    }

    public void f(Context context, k kVar, Bundle bundle) {
    }

    public void g(Context context, Bundle bundle) {
    }

    public void h(Context context, Bundle bundle) {
    }

    public void i(Context context, Bundle bundle) {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (intent.getExtras() == null || action == null) {
            return;
        }
        long j8 = intent.getExtras().getLong("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID");
        if (j8 <= 0) {
            j8 = intent.getExtras().getLong("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID");
        }
        if (j8 < 0) {
            return;
        }
        Long l14 = this.f203893a;
        if (l14 == null || (j8 > 0 && j8 == l14.longValue())) {
            switch (action) {
                case "com.garmin.android.lib.connectdevicesync.ACTION_FILE_PROCESSING_FINISHED":
                    d(context, intent.getExtras());
                    break;
                case "com.garmin.android.lib.connectdevicesync.ACTION_DEVICE_SYNC_FINISHED":
                    intent.getIntExtra("com.garmin.android.lib.connectdevicesync.EXTRA_OVERALL_STATUS", 1);
                    g(context, intent.getExtras());
                    break;
                case "com.garmin.android.lib.connectdevicesync.ACTION_MESSAGE_PROCESSING_STARTED":
                    c(context, intent.getExtras());
                    break;
                case "com.garmin.android.lib.connectdevicesync.ACTION_FILE_PROCESSING_STARTED":
                    e(context, intent.getExtras());
                    break;
                case "com.garmin.android.lib.connectdevicesync.ACTION_DEVICE_SYNC_TRANSFER_PROGRESS":
                    intent.getExtras().getFloat("com.garmin.android.lib.connectdevicesync.EXTRA_TOTAL_PROGRESS_BY_FILE_SIZE");
                    h(context, intent.getExtras());
                    break;
                case "com.garmin.android.lib.connectdevicesync.ACTION_SYNC_REQUEST_DENIED":
                    String string = intent.getExtras().getString("com.garmin.android.lib.connectdevicesync.EXTRA_SYNC_REQUEST_STATUS");
                    if (!TextUtils.isEmpty(string)) {
                        f(context, k.valueOf(string), intent.getExtras());
                        break;
                    }
                    break;
                case "com.garmin.android.lib.connectdevicesync.ACTION_DEVICE_SYNC_STARTED":
                    i(context, intent.getExtras());
                    break;
                case "com.garmin.android.lib.connectdevicesync.action.ACTION_APP_INSTALLATION_FAILED":
                    a(context, intent.getExtras());
                    break;
                case "com.garmin.android.lib.connectdevicesync.ACTION_MESSAGE_PROCESSING_FINISHED":
                    b(context, intent.getExtras());
                    break;
            }
        }
    }

    public a(b[] bVarArr, Long l14) {
        this(bVarArr, null, l14);
    }

    public a(b[] bVarArr) {
        this(bVarArr, null);
    }
}
