package com.smarthome.core.modelconfig;

import com.xiaomi.smarthome.core.server.internal.CoreError;
import defpackage.sbq;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/smarthome/core/modelconfig/UpdateState;", "", "Lsbq;", "callback", "", "newRequest", "(Lsbq;)Z", "deviceListChanged", "developerListChanged", "", "onSuccessCache", "(ZZ)V", "onSuccess", "Lcom/xiaomi/smarthome/core/server/internal/CoreError;", "error", "onFailure", "(Lcom/xiaomi/smarthome/core/server/internal/CoreError;)V", "", "toString", "()Ljava/lang/String;", "isLoading", "Z", "Ljava/util/ArrayList;", "callbacks", "Ljava/util/ArrayList;", "<init>", "()V", "smarthome-core_release"}, k = 1, mv = {1, 6, 0})
public final class UpdateState {

    @NotNull
    private final ArrayList<sbq> callbacks = new ArrayList<>();
    private boolean isLoading;

    public final boolean newRequest(@Nullable sbq callback) {
        boolean z;
        synchronized (this) {
            if (callback != null) {
                try {
                    this.callbacks.add(callback);
                } catch (Throwable th) {
                    throw th;
                }
            }
            z = this.isLoading;
            this.isLoading = true;
        }
        return z;
    }

    public final void onFailure(@Nullable CoreError error) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.callbacks);
            this.callbacks.clear();
            this.isLoading = false;
            Unit unit = Unit.INSTANCE;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((sbq) it.next()).onFailure(error);
        }
    }

    public final void onSuccess(boolean deviceListChanged, boolean developerListChanged) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.callbacks);
            this.callbacks.clear();
            this.isLoading = false;
            Unit unit = Unit.INSTANCE;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((sbq) it.next()).onSuccess(deviceListChanged, developerListChanged);
        }
    }

    public final void onSuccessCache(boolean deviceListChanged, boolean developerListChanged) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.callbacks);
            Unit unit = Unit.INSTANCE;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((sbq) it.next()).onSuccess(deviceListChanged, developerListChanged);
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.isLoading);
        sb.append(AbstractJsonLexerKt.COLON);
        sb.append(this.callbacks.size());
        sb.append(AbstractJsonLexerKt.COLON);
        sb.append((Object) Integer.toString(hashCode(), 36));
        return sb.toString();
    }
}
