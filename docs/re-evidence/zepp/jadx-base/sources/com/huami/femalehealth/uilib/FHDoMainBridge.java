package com.huami.femalehealth.uilib;

import androidx.fragment.app.FragmentActivity;
import java.lang.ref.SoftReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/femalehealth/uilib/FHDoMainBridge;", "", "<init>", "()V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class FHDoMainBridge {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static Function3<? super SoftReference<FragmentActivity>, ? super Function0<Unit>, ? super Function0<Unit>, Unit> a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eRN\u0010\u0007\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/huami/femalehealth/uilib/FHDoMainBridge$Companion;", "", "Lkotlin/Function3;", "Ljava/lang/ref/SoftReference;", "Landroidx/fragment/app/FragmentActivity;", "Lkotlin/Function0;", "", "calendarDelDialog", "Lkotlin/jvm/functions/Function3;", "getCalendarDelDialog", "()Lkotlin/jvm/functions/Function3;", "setCalendarDelDialog", "(Lkotlin/jvm/functions/Function3;)V", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Function3<SoftReference<FragmentActivity>, Function0<Unit>, Function0<Unit>, Unit> getCalendarDelDialog() {
            return FHDoMainBridge.a;
        }

        public final void setCalendarDelDialog(@Nullable Function3<? super SoftReference<FragmentActivity>, ? super Function0<Unit>, ? super Function0<Unit>, Unit> function3) {
            FHDoMainBridge.a = function3;
        }
    }
}
