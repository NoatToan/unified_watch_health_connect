package com.xiaomi.fitness.aivs.util;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.actions.SearchIntents;
import com.xiaomi.fitness.aivs.base.BaseAivsService;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import defpackage.owc;
import defpackage.pwc;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/aivs/util/BindVoiceAssistUtil;", "", "Lcom/xiaomi/fitness/aivs/util/ReplyCallback;", "replyCallback", "", "setReplyCallback", "(Lcom/xiaomi/fitness/aivs/util/ReplyCallback;)V", "", SearchIntents.EXTRA_QUERY, "sendQuery", "(Ljava/lang/String;)V", "bindService", "()V", "Lpwc;", "mQueryRequest", "Lpwc;", "xiaoAiPkgName", "Ljava/lang/String;", "", "isServiceConnected", "Z", "()Z", "setServiceConnected", "(Z)V", "Lcom/xiaomi/fitness/aivs/util/ReplyCallback;", "Lowc$a;", "mQueryReplay", "Lowc$a;", "Landroid/content/Intent;", "intent", "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "<init>", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BindVoiceAssistUtil {

    @NotNull
    private static final Intent intent;
    private static boolean isServiceConnected;

    @Nullable
    private static pwc mQueryRequest;

    @Nullable
    private static ReplyCallback replyCallback;

    @NotNull
    public static final BindVoiceAssistUtil INSTANCE = new BindVoiceAssistUtil();

    @NotNull
    private static final String xiaoAiPkgName = "com.miui.voiceassist";

    @NotNull
    private static final owc.a mQueryReplay = new owc.a() { // from class: com.xiaomi.fitness.aivs.util.BindVoiceAssistUtil$mQueryReplay$1
        @Override // defpackage.owc
        public void onResult(Bundle result) throws RemoteException {
            ReplyCallback replyCallback2;
            Intrinsics.checkNotNullParameter(result, "result");
            String string = result.getString("action");
            String string2 = result.getString("type");
            int i = result.getInt("code");
            String string3 = result.getString("msg");
            if (string3 != null && (replyCallback2 = BindVoiceAssistUtil.replyCallback) != null) {
                replyCallback2.onReply(i, string3);
            }
            Logger.i(BaseAivsService.TAG, "onResult: action = " + string + ", type = " + string2 + ", code = " + i + ", msg = " + string3);
        }
    };

    static {
        Intent intent2 = new Intent("xiaoai.intent.action.SPEECH_QUERY");
        intent2.setPackage("com.miui.voiceassist");
        intent = intent2;
    }

    private BindVoiceAssistUtil() {
    }

    public final void bindService() {
        if (RomUtils.isXiaomi()) {
            PackageManager packageManager = ApplicationExtKt.getApplication().getPackageManager();
            Intent intent2 = intent;
            if (packageManager.resolveService(intent2, 0) == null || isServiceConnected) {
                return;
            }
            try {
                Logger.i(BaseAivsService.TAG, "bindService:" + ApplicationExtKt.getApplication().bindService(intent2, new ServiceConnection() { // from class: com.xiaomi.fitness.aivs.util.BindVoiceAssistUtil$bindService$bindResult$1
                    @Override // android.content.ServiceConnection
                    public void onServiceConnected(ComponentName name, IBinder service) {
                        Intrinsics.checkNotNullParameter(name, "name");
                        Intrinsics.checkNotNullParameter(service, "service");
                        BindVoiceAssistUtil.INSTANCE.setServiceConnected(true);
                        BindVoiceAssistUtil.mQueryRequest = pwc.a.s2(service);
                        Logger.i(BaseAivsService.TAG, "onServiceConnected: mQueryRequest = " + BindVoiceAssistUtil.mQueryRequest);
                        if (BindVoiceAssistUtil.mQueryRequest != null) {
                            try {
                                pwc pwcVar = BindVoiceAssistUtil.mQueryRequest;
                                if (pwcVar != null) {
                                    pwcVar.f0(BindVoiceAssistUtil.mQueryReplay);
                                }
                            } catch (RemoteException e) {
                                e.printStackTrace();
                                Logger.i(BaseAivsService.TAG, "onServiceConnected: registerReplyCallback failed");
                            }
                        }
                    }

                    @Override // android.content.ServiceConnection
                    public void onServiceDisconnected(ComponentName name) {
                        Intrinsics.checkNotNullParameter(name, "name");
                        BindVoiceAssistUtil.INSTANCE.setServiceConnected(false);
                        Logger.i(BaseAivsService.TAG, "onServiceDisconnected: mQueryRequest = " + BindVoiceAssistUtil.mQueryRequest);
                        try {
                            pwc pwcVar = BindVoiceAssistUtil.mQueryRequest;
                            if (pwcVar != null) {
                                pwcVar.h5(BindVoiceAssistUtil.mQueryReplay);
                            }
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                        BindVoiceAssistUtil.mQueryRequest = null;
                    }
                }, Build.VERSION.SDK_INT >= 34 ? SportSummary.VRESION_201 : 1));
            } catch (Exception e) {
                Logger.i(BaseAivsService.TAG, "bindService:err " + e.getMessage());
            }
        }
    }

    @NotNull
    public final Intent getIntent() {
        return intent;
    }

    public final boolean isServiceConnected() {
        return isServiceConnected;
    }

    public final void sendQuery(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (mQueryRequest == null) {
            Logger.i(BaseAivsService.TAG, "mQueryRequest is null");
            return;
        }
        try {
            Logger.i(BaseAivsService.TAG, "sendQuery");
            Bundle bundle = new Bundle();
            bundle.putString("action", SearchIntents.EXTRA_QUERY);
            bundle.putString(SearchIntents.EXTRA_QUERY, query);
            bundle.putString("from", ApplicationExtKt.getApplication().getPackageName());
            pwc pwcVar = mQueryRequest;
            Logger.i(BaseAivsService.TAG, "sendAction " + query + " bundleRet:" + (pwcVar != null ? pwcVar.l(bundle) : null));
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public final void setReplyCallback(@Nullable ReplyCallback replyCallback2) {
        replyCallback = replyCallback2;
    }

    public final void setServiceConnected(boolean z) {
        isServiceConnected = z;
    }
}
