package org.koin.core.definition;

import ch.qos.logback.core.CoreConstants;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012$\b\u0002\u0010\u0006\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0005HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002$\b\u0002\u0010\u0006\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0005HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R3\u0010\u0006\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"Lorg/koin/core/definition/Callbacks;", "T", "", "Lkotlin/Function1;", "", "Lorg/koin/core/definition/OnCloseCallback;", "onClose", "<init>", "(Le23/l;)V", "component1", "()Le23/l;", "copy", "(Le23/l;)Lorg/koin/core/definition/Callbacks;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Le23/l;", "getOnClose", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Callbacks<T> {
    private final l<T, Unit> onClose;

    public /* synthetic */ Callbacks(l lVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Callbacks copy$default(Callbacks callbacks, l lVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            lVar = callbacks.onClose;
        }
        return callbacks.copy(lVar);
    }

    public final l<T, Unit> component1() {
        return this.onClose;
    }

    public final Callbacks<T> copy(l<? super T, Unit> onClose) {
        return new Callbacks<>(onClose);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Callbacks) && s.g(this.onClose, ((Callbacks) other).onClose);
    }

    public final l<T, Unit> getOnClose() {
        return this.onClose;
    }

    public int hashCode() {
        l<T, Unit> lVar = this.onClose;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public String toString() {
        return "Callbacks(onClose=" + this.onClose + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Callbacks(l<? super T, Unit> lVar) {
        this.onClose = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Callbacks() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
