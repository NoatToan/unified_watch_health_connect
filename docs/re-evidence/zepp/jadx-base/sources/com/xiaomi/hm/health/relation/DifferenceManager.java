package com.xiaomi.hm.health.relation;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/relation/DifferenceManager;", "", "<init>", "()V", "Companion", "relatives_release"}, k = 1, mv = {1, 5, 1})
public final class DifferenceManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/relation/DifferenceManager$Companion;", "", "", "isBuildMidong", "isBuildAmazfit", "isFaceBookForbidden", "<init>", "()V", "relatives_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean isBuildAmazfit() {
            return Intrinsics.areEqual("amazfit", RelationExternalsKt.getFriendsAndFamilyInjectDelegate().getFlavorProduction());
        }

        @JvmStatic
        public final boolean isBuildMidong() {
            return Intrinsics.areEqual("midong", RelationExternalsKt.getFriendsAndFamilyInjectDelegate().getFlavorProduction()) || Intrinsics.areEqual("amazfit", RelationExternalsKt.getFriendsAndFamilyInjectDelegate().getFlavorProduction());
        }

        public final boolean isFaceBookForbidden() {
            return isBuildMidong();
        }
    }

    @JvmStatic
    public static final boolean isBuildAmazfit() {
        return INSTANCE.isBuildAmazfit();
    }

    @JvmStatic
    public static final boolean isBuildMidong() {
        return INSTANCE.isBuildMidong();
    }
}
