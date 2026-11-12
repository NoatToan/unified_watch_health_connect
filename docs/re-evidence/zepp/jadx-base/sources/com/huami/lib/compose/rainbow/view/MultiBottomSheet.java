package com.huami.lib.compose.rainbow.view;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/lib/compose/rainbow/view/MultiBottomSheet;", "", "<init>", "()V", "Intent", "Lcom/huami/lib/compose/rainbow/view/MultiBottomSheet$Intent;", "rainbow_release"}, k = 1, mv = {1, 5, 1})
public abstract class MultiBottomSheet {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 0)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/lib/compose/rainbow/view/MultiBottomSheet$Intent;", "Lcom/huami/lib/compose/rainbow/view/MultiBottomSheet;", "Landroid/os/Bundle;", "a", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", Constant.PARAM_SQL_ARGUMENTS, "<init>", "(Landroid/os/Bundle;)V", "rainbow_release"}, k = 1, mv = {1, 5, 1})
    public static final class Intent extends MultiBottomSheet {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private final Bundle arguments;

        /* JADX WARN: Multi-variable type inference failed */
        public Intent() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Intent(@Nullable Bundle bundle) {
            super(null);
            this.arguments = bundle;
        }

        @Nullable
        public final Bundle getArguments() {
            return this.arguments;
        }

        public /* synthetic */ Intent(Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bundle);
        }
    }

    private MultiBottomSheet() {
    }

    public /* synthetic */ MultiBottomSheet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
