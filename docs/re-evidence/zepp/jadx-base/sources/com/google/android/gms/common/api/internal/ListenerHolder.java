package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zas;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public final class ListenerHolder<L> {
    private final a a;

    @Nullable
    private volatile L b;

    @Nullable
    private volatile ListenerKey<L> c;

    @KeepForSdk
    public static final class ListenerKey<L> {
        private final L a;
        private final String b;

        @KeepForSdk
        public ListenerKey(L l, String str) {
            this.a = l;
            this.b = str;
        }

        @KeepForSdk
        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj;
            return this.a == listenerKey.a && this.b.equals(listenerKey.b);
        }

        @KeepForSdk
        public final int hashCode() {
            return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
        }
    }

    @KeepForSdk
    public interface Notifier<L> {
        @KeepForSdk
        void notifyListener(@RecentlyNonNull L l);

        @KeepForSdk
        void onNotifyListenerFailed();
    }

    public final class a extends zas {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Preconditions.checkArgument(message.what == 1);
            ListenerHolder.this.a((Notifier) message.obj);
        }
    }

    @KeepForSdk
    public ListenerHolder(@NonNull Looper looper, @NonNull L l, @NonNull String str) {
        this.a = new a(looper);
        this.b = (L) Preconditions.checkNotNull(l, "Listener must not be null");
        this.c = new ListenerKey<>(l, Preconditions.checkNotEmpty(str));
    }

    @KeepForSdk
    public final void a(Notifier<? super L> notifier) {
        L l = this.b;
        if (l == null) {
            notifier.onNotifyListenerFailed();
            return;
        }
        try {
            notifier.notifyListener(l);
        } catch (RuntimeException e) {
            notifier.onNotifyListenerFailed();
            throw e;
        }
    }

    @KeepForSdk
    public final void clear() {
        this.b = null;
        this.c = null;
    }

    @RecentlyNullable
    @KeepForSdk
    public final ListenerKey<L> getListenerKey() {
        return this.c;
    }

    @KeepForSdk
    public final boolean hasListener() {
        return this.b != null;
    }

    @KeepForSdk
    public final void notifyListener(@RecentlyNonNull Notifier<? super L> notifier) {
        Preconditions.checkNotNull(notifier, "Notifier must not be null");
        this.a.sendMessage(this.a.obtainMessage(1, notifier));
    }
}
