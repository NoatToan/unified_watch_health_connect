package com.huami.bloodoxygen.core.local.kvkit;

import com.huami.utils.persistence.kvkit.KvPersistence;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\n\u001a\u00020\t2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/huami/bloodoxygen/core/local/kvkit/BooleanDelegate;", "", "thisRef", "Lkotlin/reflect/KProperty;", "property", "", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Boolean;", "value", "", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Boolean;)V", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "a", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "kvKit", "", "b", "Ljava/lang/String;", "userId", "<init>", "(Lcom/huami/utils/persistence/kvkit/KvPersistence;Ljava/lang/String;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class BooleanDelegate {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final KvPersistence kvKit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    public BooleanDelegate(@NotNull KvPersistence kvPersistence, @NotNull String str) {
        this.kvKit = kvPersistence;
        this.userId = str;
    }

    @Nullable
    public final Boolean getValue(@Nullable Object thisRef, @NotNull KProperty<?> property) {
        return (Boolean) KeyDelegateKt.b(this.kvKit, property.getName() + this.userId, Boolean.FALSE);
    }

    public final void setValue(@Nullable Object thisRef, @NotNull KProperty<?> property, @Nullable Boolean value) {
        KeyDelegateKt.a(this.kvKit, property.getName() + this.userId, value);
    }
}
