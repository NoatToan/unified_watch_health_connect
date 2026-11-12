package com.xiaomi.ai.core;

import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.error.AivsError;
import com.xiaomi.ai.track.TrackData;

/* JADX INFO: loaded from: classes18.dex */
public abstract class b {
    public abstract String a(a aVar, String str);

    public String a(a aVar, boolean z) {
        throw new AbstractMethodError("ChannelListener.onGetToken was not implemented");
    }

    public void a(long j) {
    }

    public void a(a aVar) {
    }

    public void a(a aVar, int i) {
    }

    public abstract void a(a aVar, Instruction instruction);

    public abstract void a(a aVar, AivsError aivsError);

    public void a(a aVar, TrackData trackData) {
    }

    public abstract void a(a aVar, byte[] bArr);

    public abstract boolean a(a aVar, String str, String str2);

    public void b(a aVar) {
    }

    public abstract void b(a aVar, String str);

    public String c(a aVar) {
        throw new AbstractMethodError("ChannelListener.onGetOAuthCode was not implemented");
    }

    public abstract String d();

    public String d(a aVar) {
        throw new AbstractMethodError("ChannelListener.onGetAuthorizationToken was not implemented");
    }

    public void e(a aVar) {
    }

    public boolean e() {
        return false;
    }

    public void f(a aVar) {
    }

    public int g(a aVar) {
        return 0;
    }
}
