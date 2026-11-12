package xr2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.garmin.feature.garminpay.ui.userwallet.UserWalletActivity;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lxr2/b;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UserWalletActivity f192032a;

    static {
        new a(null);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        if (intent == null || (action = intent.getAction()) == null || !"android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
            return;
        }
        int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
        UserWalletActivity userWalletActivity = this.f192032a;
        if (intExtra == 10) {
            if (userWalletActivity != null) {
                userWalletActivity.ca(false);
            }
        } else if (userWalletActivity != null) {
            userWalletActivity.ca(true);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxr2/b$a;", "", "<init>", "()V", "", "RECEIVER_INTENT_FILTER_KEY", "Ljava/lang/String;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
