package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.core.app.NotificationCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.squareup.picasso.u;
import com.twitter.sdk.android.tweetcomposer.g;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingWebApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\b&\u0018\u00002\u00020\u0001:\u0001;B9\u0012\u0006\u0010\u001c\u001a\u00020\u0018\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u0010.\u001a\u00020)\u0012\u0006\u00104\u001a\u00020)\u0012\u0006\u00102\u001a\u00020/\u0012\b\u00108\u001a\u0004\u0018\u00010/¢\u0006\u0004\b9\u0010:J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\u0002J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0004H$J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0004R\u001c\u0010\u001c\u001a\u00020\u00188\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010+R\u001b\u00108\u001a\u0004\u0018\u00010/8\u0006@\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u00107¨\u0006<"}, d2 = {"Lcom/facebook/internal/PlatformServiceClient;", "Landroid/content/ServiceConnection;", "", "b", "Landroid/os/Bundle;", "result", "a", "Lcom/facebook/internal/PlatformServiceClient$CompletedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setCompletedListener", "", "start", g.g, "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "service", "onServiceConnected", "onServiceDisconnected", "data", "populateRequestBundle", "Landroid/os/Message;", "message", "handleMessage", "Landroid/content/Context;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "c", "Lcom/facebook/internal/PlatformServiceClient$CompletedListener;", GoogleApiAvailabilityLight.a, "Z", "running", "Landroid/os/Messenger;", "e", "Landroid/os/Messenger;", NotificationCompat.MessagingStyle.Message.KEY_SENDER, "", "f", LogUtil.I, "requestMessage", "g", "replyMessage", "", "h", "Ljava/lang/String;", "applicationId", "i", BehaviorTaggingWebApi.g.g, z.j, "getNonce", "()Ljava/lang/String;", "nonce", "<init>", "(Landroid/content/Context;IIILjava/lang/String;Ljava/lang/String;)V", "CompletedListener", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public abstract class PlatformServiceClient implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Handler handler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private CompletedListener listener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean running;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Messenger sender;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int requestMessage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int replyMessage;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String applicationId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int protocolVersion;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private final String nonce;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/PlatformServiceClient$CompletedListener;", "", "Landroid/os/Bundle;", "result", "", u.D, "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public interface CompletedListener {
        void completed(@Nullable Bundle result);
    }

    public PlatformServiceClient(@NotNull Context context, int i, int i2, int i3, @NotNull String str, @Nullable String str2) {
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext != null ? applicationContext : context;
        this.requestMessage = i;
        this.replyMessage = i2;
        this.applicationId = str;
        this.protocolVersion = i3;
        this.nonce = str2;
        this.handler = new Handler() { // from class: com.facebook.internal.PlatformServiceClient.1
            @Override // android.os.Handler
            public void handleMessage(@NotNull Message message) {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    PlatformServiceClient.this.handleMessage(message);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        };
    }

    private final void a(Bundle result) {
        if (this.running) {
            this.running = false;
            CompletedListener completedListener = this.listener;
            if (completedListener != null) {
                completedListener.completed(result);
            }
        }
    }

    private final void b() {
        Bundle bundle = new Bundle();
        bundle.putString(NativeProtocol.EXTRA_APPLICATION_ID, this.applicationId);
        String str = this.nonce;
        if (str != null) {
            bundle.putString(NativeProtocol.EXTRA_NONCE, str);
        }
        populateRequestBundle(bundle);
        Message messageObtain = Message.obtain((Handler) null, this.requestMessage);
        messageObtain.arg1 = this.protocolVersion;
        messageObtain.setData(bundle);
        messageObtain.replyTo = new Messenger(this.handler);
        try {
            Messenger messenger = this.sender;
            if (messenger != null) {
                messenger.send(messageObtain);
            }
        } catch (RemoteException unused) {
            a(null);
        }
    }

    public final void cancel() {
        this.running = false;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final String getNonce() {
        return this.nonce;
    }

    public final void handleMessage(@NotNull Message message) {
        if (message.what == this.replyMessage) {
            Bundle data = message.getData();
            if (data.getString(NativeProtocol.STATUS_ERROR_TYPE) != null) {
                a(null);
            } else {
                a(data);
            }
            try {
                this.context.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder service) {
        this.sender = new Messenger(service);
        b();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@NotNull ComponentName name) {
        this.sender = null;
        try {
            this.context.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }

    public abstract void populateRequestBundle(@NotNull Bundle data);

    public final void setCompletedListener(@Nullable CompletedListener listener) {
        this.listener = listener;
    }

    public final boolean start() {
        synchronized (this) {
            boolean z = false;
            if (this.running) {
                return false;
            }
            if (NativeProtocol.getLatestAvailableProtocolVersionForService(this.protocolVersion) == -1) {
                return false;
            }
            Intent intentCreatePlatformServiceIntent = NativeProtocol.createPlatformServiceIntent(this.context);
            if (intentCreatePlatformServiceIntent != null) {
                this.running = true;
                this.context.bindService(intentCreatePlatformServiceIntent, this, 1);
                z = true;
            }
            return z;
        }
    }
}
