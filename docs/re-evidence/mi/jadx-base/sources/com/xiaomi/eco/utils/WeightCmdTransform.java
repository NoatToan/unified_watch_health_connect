package com.xiaomi.eco.utils;

import defpackage.ax7;
import defpackage.u7r;
import defpackage.vw7;
import defpackage.ww7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/eco/utils/WeightCmdTransform;", "", "<init>", "()V", "Companion", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeightCmdTransform {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/eco/utils/WeightCmdTransform$Companion;", "", "", "userWeight", "unit", "lockFlag", "matchNum", "Lu7r;", "toUploadWeighProcedure", "(IIII)Lu7r;", "balanceTime", "status", "toBalanceTime", "(II)Lu7r;", "<init>", "()V", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ u7r toUploadWeighProcedure$default(Companion companion, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 8) != 0) {
                i4 = 0;
            }
            return companion.toUploadWeighProcedure(i, i2, i3, i4);
        }

        @NotNull
        public final u7r toBalanceTime(int balanceTime, int status) {
            u7r u7rVar = new u7r();
            u7rVar.e = 32;
            u7rVar.f = 8;
            ww7 ww7Var = new ww7();
            ax7 ax7Var = new ax7();
            ax7Var.d = balanceTime;
            ax7Var.c = status;
            ww7Var.C(ax7Var);
            u7rVar.D(ww7Var);
            return u7rVar;
        }

        @NotNull
        public final u7r toUploadWeighProcedure(int userWeight, int unit, int lockFlag, int matchNum) {
            u7r u7rVar = new u7r();
            u7rVar.e = 32;
            u7rVar.f = 13;
            vw7 vw7Var = new vw7();
            vw7Var.c = userWeight;
            vw7Var.d = unit;
            vw7Var.e = lockFlag;
            vw7Var.f = matchNum;
            ww7 ww7Var = new ww7();
            ww7Var.I(vw7Var);
            u7rVar.D(ww7Var);
            return u7rVar;
        }
    }
}
