package com.huami.femalehealth.uilib.widget.calendar;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\b\"\u0016\u0010\u0001\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u001d\u0010\u0007\u001a\u00020\u00008F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"", "YEAR_MIN", LogUtil.I, "a", "Lkotlin/Lazy;", "getYEAR_MAX", "()I", "YEAR_MAX", "uilib_release"}, k = 2, mv = {1, 5, 1})
public final class FemaleHealthCalendarViewKt {
    public static final int YEAR_MIN = 2019;

    @NotNull
    private static final Lazy a = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Integer> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null).getYear() + 1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    public static final int getYEAR_MAX() {
        return ((Number) a.getValue()).intValue();
    }
}
