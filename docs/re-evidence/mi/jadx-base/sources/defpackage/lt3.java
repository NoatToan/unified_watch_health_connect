package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public abstract class lt3 {
    public void detectUdpWeakNetwork(gt3 gt3Var, String str) {
    }

    public void detectWeakNetwork(gt3 gt3Var) {
    }

    public String getSpeechEventId() {
        return null;
    }

    public boolean ipv6Available() {
        return false;
    }

    public void onAuthExpired(gt3 gt3Var) {
    }

    public void onAuthRefreshed(gt3 gt3Var) {
    }

    public abstract void onBinaryMessage(gt3 gt3Var, byte[] bArr);

    public void onChangeChannel(gt3 gt3Var, int i) {
    }

    public abstract void onClear(gt3 gt3Var);

    public void onConnected(gt3 gt3Var) {
    }

    public void onDisconnected(gt3 gt3Var) {
    }

    public abstract void onError(gt3 gt3Var, f01 f01Var);

    public String onGetAuthorizationToken(gt3 gt3Var) {
        throw new AbstractMethodError("ChannelListener.onGetAuthorizationToken was not implemented");
    }

    public String onGetNetworkType() {
        return "default";
    }

    public String onGetOAuthCode(gt3 gt3Var) {
        throw new AbstractMethodError("ChannelListener.onGetOAuthCode was not implemented");
    }

    public int onGetSDKVersion(gt3 gt3Var) {
        return 0;
    }

    public abstract String onGetSSID();

    public String onGetToken(gt3 gt3Var, boolean z) {
        throw new AbstractMethodError("ChannelListener.onGetToken was not implemented");
    }

    public abstract void onInstruction(gt3 gt3Var, dcd dcdVar);

    public abstract String onRead(gt3 gt3Var, String str);

    public abstract void onRemove(gt3 gt3Var, String str);

    public void onSendDataSuccess(long j, long j2) {
    }

    public void onSetTrackData(gt3 gt3Var, klp klpVar) {
    }

    public abstract boolean onWrite(gt3 gt3Var, String str, String str2);
}
