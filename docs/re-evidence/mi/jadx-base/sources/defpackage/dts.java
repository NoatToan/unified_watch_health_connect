package defpackage;

import com.xiaomi.hm.health.bt.profile.auth.HMAuthState;

/* JADX INFO: loaded from: classes11.dex */
public interface dts {
    void onAuthentication(HMAuthState hMAuthState);

    byte[] onGetSignData(byte[] bArr, byte[] bArr2, int i);
}
