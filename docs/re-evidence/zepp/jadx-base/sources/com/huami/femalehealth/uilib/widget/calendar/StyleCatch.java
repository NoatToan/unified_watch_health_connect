package com.huami.femalehealth.uilib.widget.calendar;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.calendarview.Calendar;
import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.DateTriple;
import com.huami.femalehealth.logiclib.vo.MenstruationVo;
import com.huami.femalehealth.uilib.helper.ExtKt;
import com.huami.femalehealth.uilib.widget.calendar.status.CalendarNormalStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.PeriodStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.StatusKt;
import com.huami.tools.log.HMLog;
import com.huami.watch.transport.httpsupport.model.DataItem;
import com.xiaomi.mipush.sdk.Constants;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.g;
import kotlin.collections.s;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 =2\u00020\u0001:\u0001=BC\u0012:\b\u0002\u00108\u001a4\u0012\u0004\u0012\u00020\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0004\u0012\u00020\u001d\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0018\u000106¢\u0006\u0004\b;\u0010<J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J1\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\f\u0010\u0011\u001a\u00020\u0002*\u00020\u0010H\u0002J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002J/\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u000fJ,\u0010\u0017\u001a\u00020\u00062$\u0010\u0016\u001a \u0012\u0004\u0012\u00020\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0004\u0012\u00020\u00060\u0014J,\u0010\u0018\u001a\u00020\u00062$\u0010\u0016\u001a \u0012\u0004\u0012\u00020\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0004\u0012\u00020\u00060\u0014J8\u0010\u0018\u001a\u00020\u000620\u0010\u0016\u001a,\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n0\u001a\u0012\u0004\u0012\u00020\u00060\u0019J,\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00102\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u001dJ<\u0010\u001f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u001dJ1\u0010!\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u000fJ\u0010\u0010#\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\u001dJ=\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0$¢\u0006\u0004\b&\u0010'J1\u0010(\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b(\u0010\u000fJ,\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004J\u001c\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u0006\u0010\u001b\u001a\u00020\u0010J,\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004J\"\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150$0$2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\b\u0010,\u001a\u00020\u0002H\u0016J\u000e\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0000J\u0006\u0010/\u001a\u00020\u0000J\u0012\u00101\u001a\u00020\u00062\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0002J,\u00102\u001a\u00020\u00002$\u00102\u001a \u0012\u0004\u0012\u00020\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0004\u0012\u00020\u001d0\u0014J\u0006\u00103\u001a\u00020\u001dJ$\u00105\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n04RH\u00108\u001a4\u0012\u0004\u0012\u00020\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0004\u0012\u00020\u001d\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0018\u0001068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107R4\u0010:\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00109¨\u0006>"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/StyleCatch;", "", "", "key", "", "size", "", "a", "year", "month", "", "Lkotlin/Pair;", "Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "b", "(II)[Lkotlin/Pair;", "Lcom/huami/calendarview/Calendar;", GoogleApiAvailabilityLight.a, "c", "initMonthOfDayIfNull", "Lkotlin/Function2;", "Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "action", "forEachSortByTIme", "forEach", "Lkotlin/Function1;", "", "calendar", "value", "", "hard", DataItem.HTTP_METHOD_PUT, "day", "clearMonthStyle", "force", "clearAll", "", "list", "clearMonthStyleWithoutStyle", "(IILjava/util/List;)[Lkotlin/Pair;", "getMonthStyle", "clearDayStyle", "getDayStyle", "getMenstruationDate", "toString", "styleCatch", "addAll", "clone", "tag", "printEach", "filter", "isEmpty", "Ljava/util/concurrent/ConcurrentHashMap;", "toMap", "Lkotlin/Function3;", "Lkotlin/jvm/functions/Function3;", "putMapFun", "Ljava/util/concurrent/ConcurrentHashMap;", "catch", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class StyleCatch {

    @NotNull
    private static final String c = "StyleCatch";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Function3<DateTriple, Pair<? extends CalendarPeriodStyle, MenstruationVo>, Boolean, Pair<CalendarPeriodStyle, MenstruationVo>> putMapFun;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ConcurrentHashMap<String, Pair<CalendarPeriodStyle, MenstruationVo>[]> catch;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Pair<CalendarPeriodStyle, MenstruationVo>[] d = new Pair[0];

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002R(\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/StyleCatch$Companion;", "", "Lcom/huami/femalehealth/uilib/widget/calendar/StyleCatch;", "getOverNowStyleCatch", "", "Lkotlin/Pair;", "Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "EMPTY", "[Lkotlin/Pair;", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\n"}, d2 = {"Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "dateTriple", "Lkotlin/Pair;", "Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "pair", "", "<anonymous parameter 2>", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function3<DateTriple, Pair<? extends CalendarPeriodStyle, ? extends MenstruationVo>, Boolean, Pair<? extends CalendarPeriodStyle, ? extends MenstruationVo>> {
            public static final a a = new a();

            public a() {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final Pair<CalendarPeriodStyle, MenstruationVo> a(@NotNull DateTriple dateTriple, @NotNull Pair<? extends CalendarPeriodStyle, MenstruationVo> pair, boolean z) {
                return (DateHelper.INSTANCE.isFeatureDay(AidKt.toDate(dateTriple).getTime()) && (pair.getFirst() instanceof PeriodStyle)) ? new Pair<>(StatusKt.getNormalStyle(), MenstruationVo.clone$default((MenstruationVo) pair.getSecond(), null, null, false, false, 0L, 23, null)) : pair;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Pair<? extends CalendarPeriodStyle, ? extends MenstruationVo> invoke(DateTriple dateTriple, Pair<? extends CalendarPeriodStyle, ? extends MenstruationVo> pair, Boolean bool) {
                return a(dateTriple, pair, bool.booleanValue());
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StyleCatch getOverNowStyleCatch() {
            return new StyleCatch(a.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n"}, d2 = {"Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "date", "Lkotlin/Pair;", "Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "pair", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<DateTriple, Pair<? extends CalendarPeriodStyle, ? extends MenstruationVo>, Unit> {
        public final /* synthetic */ Function2<DateTriple, Pair<? extends CalendarPeriodStyle, MenstruationVo>, Boolean> a;
        public final /* synthetic */ StyleCatch b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super DateTriple, ? super Pair<? extends CalendarPeriodStyle, MenstruationVo>, Boolean> function2, StyleCatch styleCatch) {
            super(2);
            this.a = function2;
            this.b = styleCatch;
        }

        public final void a(@NotNull DateTriple dateTriple, @NotNull Pair<? extends CalendarPeriodStyle, MenstruationVo> pair) {
            if (this.a.invoke(dateTriple, pair).booleanValue()) {
                StyleCatch.put$default(this.b, ExtKt.toCalendar(dateTriple), pair, false, 4, null);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(DateTriple dateTriple, Pair<? extends CalendarPeriodStyle, ? extends MenstruationVo> pair) {
            a(dateTriple, pair);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u00072$\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00020\u0000H\n"}, d2 = {"", "", "", "Lkotlin/Pair;", "Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "entity", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Map.Entry<? extends String, ? extends Pair<? extends CalendarPeriodStyle, ? extends MenstruationVo>[]>, Unit> {
        public final /* synthetic */ Function2<DateTriple, Pair<? extends CalendarPeriodStyle, MenstruationVo>, Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super DateTriple, ? super Pair<? extends CalendarPeriodStyle, MenstruationVo>, Unit> function2) {
            super(1);
            this.a = function2;
        }

        public final void a(@NotNull Map.Entry<String, Pair<CalendarPeriodStyle, MenstruationVo>[]> entry) {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) entry.getKey(), new String[]{Constants.ACCEPT_TIME_SEPARATOR_SERVER}, false, 0, 6, (Object) null);
            int i = Integer.parseInt((String) listSplit$default.get(0));
            int i2 = Integer.parseInt((String) listSplit$default.get(1));
            Pair<CalendarPeriodStyle, MenstruationVo>[] value = entry.getValue();
            Function2<DateTriple, Pair<? extends CalendarPeriodStyle, MenstruationVo>, Unit> function2 = this.a;
            int i3 = 0;
            for (Pair<CalendarPeriodStyle, MenstruationVo> pair : value) {
                i3++;
                function2.invoke(new DateTriple(i, i2, i3), pair);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map.Entry<? extends String, ? extends Pair<? extends CalendarPeriodStyle, ? extends MenstruationVo>[]> entry) {
            a(entry);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n"}, d2 = {"Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "dateTriple", "Lkotlin/Pair;", "Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "pair", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<DateTriple, Pair<? extends CalendarPeriodStyle, ? extends MenstruationVo>, Unit> {
        public final /* synthetic */ List<Pair<DateTriple, Pair<CalendarPeriodStyle, MenstruationVo>>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<Pair<DateTriple, Pair<CalendarPeriodStyle, MenstruationVo>>> list) {
            super(2);
            this.a = list;
        }

        public final void a(@NotNull DateTriple dateTriple, @NotNull Pair<? extends CalendarPeriodStyle, MenstruationVo> pair) {
            this.a.add(TuplesKt.to(dateTriple, pair));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(DateTriple dateTriple, Pair<? extends CalendarPeriodStyle, ? extends MenstruationVo> pair) {
            a(dateTriple, pair);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u00072$\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00020\u0000H\n"}, d2 = {"", "", "", "Lkotlin/Pair;", "Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "entity", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Map.Entry<? extends String, ? extends Pair<? extends CalendarPeriodStyle, ? extends MenstruationVo>[]>, Unit> {
        public final /* synthetic */ String a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Map.Entry<String, Pair<CalendarPeriodStyle, MenstruationVo>[]> a;
            public final /* synthetic */ int b;
            public final /* synthetic */ Pair<CalendarPeriodStyle, MenstruationVo> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Map.Entry<String, Pair<CalendarPeriodStyle, MenstruationVo>[]> entry, int i, Pair<? extends CalendarPeriodStyle, MenstruationVo> pair) {
                super(0);
                this.a = entry;
                this.b = i;
                this.c = pair;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return this.a.getKey() + '-' + (this.b + 1) + JsonLexerKt.COLON + this.c.getFirst().name() + StringUtil.SPACE + this.c.getSecond();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull Map.Entry<String, Pair<CalendarPeriodStyle, MenstruationVo>[]> entry) {
            Pair<CalendarPeriodStyle, MenstruationVo>[] value = entry.getValue();
            String str = this.a;
            int length = value.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                HMLog.info(Intrinsics.stringPlus("xys_", str == null ? StyleCatch.c : str), new a(entry, i2, value[i]));
                i++;
                i2 = i3;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map.Entry<? extends String, ? extends Pair<? extends CalendarPeriodStyle, ? extends MenstruationVo>[]> entry) {
            a(entry);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i, Exception exc) {
            super(0);
            this.a = i;
            this.b = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "day = " + this.a + " & error msg = " + this.b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StyleCatch() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StyleCatch(@Nullable Function3<? super DateTriple, ? super Pair<? extends CalendarPeriodStyle, MenstruationVo>, ? super Boolean, ? extends Pair<? extends CalendarPeriodStyle, MenstruationVo>> function3) {
        this.putMapFun = function3;
        this.catch = new ConcurrentHashMap<>();
    }

    private final void a(String key, int size) {
        ConcurrentHashMap<String, Pair<CalendarPeriodStyle, MenstruationVo>[]> concurrentHashMap = this.catch;
        Pair<CalendarPeriodStyle, MenstruationVo>[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = TuplesKt.to(StatusKt.getNormalStyle(), MenstruationVo.INSTANCE.getEMPTY());
        }
        concurrentHashMap.put(key, pairArr);
    }

    private final Pair<CalendarPeriodStyle, MenstruationVo>[] b(int year, int month) {
        String strC = c(year, month);
        a(strC, DateHelper.INSTANCE.getMonthOfDay(year, month));
        return this.catch.get(strC);
    }

    private final String c(int year, int month) {
        StringBuilder sb = new StringBuilder();
        sb.append(year);
        sb.append('-');
        sb.append(month);
        return sb.toString();
    }

    public static /* synthetic */ void clearAll$default(StyleCatch styleCatch, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        styleCatch.clearAll(z);
    }

    private final String d(Calendar calendar) {
        return c(calendar.getYear(), calendar.getMonth());
    }

    public static /* synthetic */ void printEach$default(StyleCatch styleCatch, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        styleCatch.printEach(str);
    }

    public static /* synthetic */ void put$default(StyleCatch styleCatch, Calendar calendar, Pair pair, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        styleCatch.put(calendar, pair, z);
    }

    public final void addAll(@NotNull StyleCatch styleCatch) {
        styleCatch.catch.putAll(this.catch);
    }

    public final void clearAll(boolean force) {
        if (force) {
            this.catch.clear();
            return;
        }
        Iterator<Map.Entry<String, Pair<CalendarPeriodStyle, MenstruationVo>[]>> it2 = this.catch.entrySet().iterator();
        while (it2.hasNext()) {
            this.catch.put(it2.next().getKey(), d);
        }
    }

    @Nullable
    public final Pair<CalendarPeriodStyle, MenstruationVo> clearDayStyle(int year, int month, int day) {
        CalendarPeriodStyle normalStyle = StatusKt.getNormalStyle();
        MenstruationVo.Companion companion = MenstruationVo.INSTANCE;
        put$default(this, year, month, day, TuplesKt.to(normalStyle, companion.getEMPTY()), false, 16, null);
        return TuplesKt.to(StatusKt.getNormalStyle(), companion.getEMPTY());
    }

    @Nullable
    public final Pair<CalendarPeriodStyle, MenstruationVo>[] clearMonthStyle(int year, int month) {
        return b(year, month);
    }

    @NotNull
    public final Pair<CalendarPeriodStyle, MenstruationVo>[] clearMonthStyleWithoutStyle(int year, int month, @NotNull List<? extends CalendarPeriodStyle> list) {
        Pair<CalendarPeriodStyle, MenstruationVo>[] pairArrInitMonthOfDayIfNull = initMonthOfDayIfNull(year, month);
        int length = pairArrInitMonthOfDayIfNull.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            if (!list.contains(pairArrInitMonthOfDayIfNull[i].getFirst())) {
                pairArrInitMonthOfDayIfNull[i2] = TuplesKt.to(StatusKt.getNormalStyle(), MenstruationVo.INSTANCE.getEMPTY());
            }
            i++;
            i2 = i3;
        }
        return pairArrInitMonthOfDayIfNull;
    }

    @NotNull
    public final StyleCatch clone() {
        StyleCatch styleCatch = new StyleCatch(this.putMapFun);
        styleCatch.addAll(this);
        return styleCatch;
    }

    @NotNull
    public final StyleCatch filter(@NotNull Function2<? super DateTriple, ? super Pair<? extends CalendarPeriodStyle, MenstruationVo>, Boolean> filter) {
        StyleCatch styleCatch = new StyleCatch(this.putMapFun);
        forEach(new a(filter, styleCatch));
        return styleCatch;
    }

    public final void forEach(@NotNull Function2<? super DateTriple, ? super Pair<? extends CalendarPeriodStyle, MenstruationVo>, Unit> action) {
        forEach(new b(action));
    }

    public final void forEachSortByTIme(@NotNull Function2<? super DateTriple, ? super Pair<? extends CalendarPeriodStyle, MenstruationVo>, Unit> action) {
        ArrayList<Pair> arrayList = new ArrayList();
        forEach(new c(arrayList));
        if (arrayList.size() > 1) {
            g.sortWith(arrayList, new Comparator() { // from class: com.huami.femalehealth.uilib.widget.calendar.StyleCatch$forEachSortByTIme$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(AidKt.toDate((DateTriple) ((Pair) t).getFirst()).getTime()), Long.valueOf(AidKt.toDate((DateTriple) ((Pair) t2).getFirst()).getTime()));
                }
            });
        }
        for (Pair pair : arrayList) {
            action.invoke(pair.getFirst(), pair.getSecond());
        }
    }

    @Nullable
    public final Pair<CalendarPeriodStyle, MenstruationVo> getDayStyle(@NotNull Calendar calendar) {
        return getDayStyle(calendar.getYear(), calendar.getMonth(), calendar.getDay());
    }

    @NotNull
    public final List<List<DateTriple>> getMenstruationDate(int year, int month) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Pair<CalendarPeriodStyle, MenstruationVo>[] monthStyle = getMonthStyle(year, month);
        if (monthStyle != null) {
            int i = 0;
            for (Object obj : ArraysKt___ArraysKt.toList(monthStyle)) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Pair pair = (Pair) obj;
                if (pair.getFirst() instanceof PeriodStyle) {
                    arrayList2.add(new DateTriple(year, month, i2));
                } else if ((pair.getFirst() instanceof CalendarNormalStyle) && (!arrayList2.isEmpty())) {
                    arrayList.add(arrayList2);
                    arrayList2 = new ArrayList();
                }
                i = i2;
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(arrayList2);
                new ArrayList();
            }
        }
        return arrayList;
    }

    @Nullable
    public final Pair<CalendarPeriodStyle, MenstruationVo>[] getMonthStyle(int year, int month) {
        return this.catch.get(c(year, month));
    }

    @NotNull
    public final Pair<CalendarPeriodStyle, MenstruationVo>[] initMonthOfDayIfNull(int year, int month) {
        String strC = c(year, month);
        Pair<CalendarPeriodStyle, MenstruationVo>[] pairArr = this.catch.get(strC);
        if (pairArr == null || Arrays.equals(pairArr, d)) {
            a(strC, DateHelper.INSTANCE.getMonthOfDay(year, month));
        }
        return this.catch.get(strC);
    }

    public final boolean isEmpty() {
        return this.catch.isEmpty();
    }

    public final void printEach(@Nullable String tag) {
        forEach(new d(tag));
    }

    public final void put(@NotNull Calendar calendar, @NotNull Pair<? extends CalendarPeriodStyle, MenstruationVo> value, boolean hard) {
        put(calendar.getYear(), calendar.getMonth(), calendar.getDay(), value, hard);
    }

    @NotNull
    public final ConcurrentHashMap<String, Pair<CalendarPeriodStyle, MenstruationVo>[]> toMap() {
        return this.catch;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Pair<CalendarPeriodStyle, MenstruationVo>[]> entry : this.catch.entrySet()) {
            sb.append(entry.getKey() + " -> " + entry.getValue().length + '\n');
            int i = 0;
            for (Pair<CalendarPeriodStyle, MenstruationVo> pair : entry.getValue()) {
                i++;
                sb.append(i + " -> " + pair + '\n');
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ void put$default(StyleCatch styleCatch, int i, int i2, int i3, Pair pair, boolean z, int i4, Object obj) {
        styleCatch.put(i, i2, i3, pair, (i4 & 16) != 0 ? true : z);
    }

    public final void forEach(@NotNull Function1<? super Map.Entry<String, Pair<CalendarPeriodStyle, MenstruationVo>[]>, Unit> action) {
        s.toList(this.catch);
        Iterator<Map.Entry<String, Pair<CalendarPeriodStyle, MenstruationVo>[]>> it2 = this.catch.entrySet().iterator();
        while (it2.hasNext()) {
            action.invoke(it2.next());
        }
    }

    @Nullable
    public final Pair<CalendarPeriodStyle, MenstruationVo> getDayStyle(int year, int month, int day) {
        Pair<CalendarPeriodStyle, MenstruationVo>[] monthStyle = getMonthStyle(year, month);
        if (monthStyle == null || Arrays.equals(monthStyle, d)) {
            return null;
        }
        return monthStyle[day - 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void put(int year, int month, int day, @NotNull Pair<? extends CalendarPeriodStyle, MenstruationVo> value, boolean hard) {
        Pair<CalendarPeriodStyle, MenstruationVo> pairInvoke;
        Function3<DateTriple, Pair<? extends CalendarPeriodStyle, MenstruationVo>, Boolean, Pair<CalendarPeriodStyle, MenstruationVo>> function3 = this.putMapFun;
        if (function3 != null && (pairInvoke = function3.invoke(new DateTriple(year, month, day), value, Boolean.valueOf(hard))) != null) {
            value = pairInvoke;
        }
        Pair<CalendarPeriodStyle, MenstruationVo>[] pairArrInitMonthOfDayIfNull = initMonthOfDayIfNull(year, month);
        Pair<CalendarPeriodStyle, MenstruationVo> dayStyle = getDayStyle(year, month, day);
        if (dayStyle == null) {
            dayStyle = TuplesKt.to(StatusKt.getNormalStyle(), MenstruationVo.INSTANCE.getEMPTY());
        }
        if (!hard && dayStyle.getFirst().weight() >= value.getFirst().weight()) {
            value = dayStyle;
        }
        try {
            pairArrInitMonthOfDayIfNull[day - 1] = value;
        } catch (Exception e2) {
            HMLog.warn$default(c, null, new e(day, e2), 2, null);
        }
    }

    public /* synthetic */ StyleCatch(Function3 function3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function3);
    }
}
