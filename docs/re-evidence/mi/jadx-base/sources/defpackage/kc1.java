package defpackage;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f23702a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hnq f23703b;
    public Callback c;
    public int d;

    public void a(ReadableMap readableMap) {
        throw new JSApplicationCausedNativeException("Animation config for " + getClass().getSimpleName() + " cannot be reset");
    }

    public abstract void b(long j);
}
