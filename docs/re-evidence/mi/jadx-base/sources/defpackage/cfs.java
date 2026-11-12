package defpackage;

import android.content.Context;
import com.miui.tsmclient.net.AuthRequest;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.NetworkUtil;
import com.xiaomi.accountsdk.request.AccessDeniedException;
import com.xiaomi.accountsdk.request.AuthenticationFailureException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class cfs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x3s f5293a = new x3s();

    public Object a(Context context, AuthRequest authRequest) throws IOException {
        if (!NetworkUtil.isConnected(context)) {
            throw new IOException("network unreachable!");
        }
        try {
            return this.f5293a.a(authRequest);
        } catch (AccessDeniedException | AuthenticationFailureException e) {
            LogUtils.e("failed to send simple post request", e);
            return null;
        }
    }
}
