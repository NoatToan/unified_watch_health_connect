package com.xiaomi.hm.health.ui.smartplay.alarm;

import android.content.Context;
import android.content.DialogInterface;
import androidx.annotation.StringRes;
import androidx.fragment.app.FragmentManager;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bt.model.AlarmClockItem;
import com.xiaomi.hm.health.databases.model.Alarm;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import com.xiaomi.hm.health.ui.smartplay.alarm.AlarmRepeatChooser;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 82\u00020\u0001:\u000389\u001aB\u001d\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b6\u00107J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0002J\u001e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR&\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u00150!j\b\u0012\u0004\u0012\u00020\u0015`\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010)R$\u00102\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0016\u00105\u001a\u00020\u00048B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u0006:"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmRepeatChooser;", "", "", hl.k, "", "id", "", "i", "Lcom/xiaomi/hm/health/databases/model/Alarm;", "alarm", "l", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/fragment/app/FragmentManager;", "manager", GoogleApiAvailabilityLight.b, z.j, "days", "m", "h", "position", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmRepeatChooser$a;", "f", "repeatDays", "e", "showDialog", "a", "Landroid/content/Context;", "Lkotlin/Function0;", "", "b", "Lkotlin/jvm/functions/Function0;", "supportCalendarFunc", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "items", "", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/ListItemData;", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "repeatViewItems", "customDayItems", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmRepeatChooser$IChooseListener;", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmRepeatChooser$IChooseListener;", "getListener", "()Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmRepeatChooser$IChooseListener;", "setListener", "(Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmRepeatChooser$IChooseListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "g", "()I", "customItemIndex", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "Companion", "IChooseListener", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AlarmRepeatChooser {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int REPEAT_CUSTOM = -1;
    public static final int REPEAT_INVALID = -2;

    @NotNull
    private static final String g = "AlarmRepeatChooser";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<Boolean> supportCalendarFunc;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<ItemData> items;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<ListItemData> repeatViewItems;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final List<ListItemData> customDayItems;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private IChooseListener listener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u000e\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmRepeatChooser$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/databases/model/Alarm;", "item", "", "supportCalendar", "", "getWeekString", "", "REPEAT_CUSTOM", LogUtil.I, "REPEAT_INVALID", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ StringBuilder a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(StringBuilder sb) {
                super(0);
                this.a = sb;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "week string : " + ((Object) this.a);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getWeekString(@NotNull Context context, @NotNull Alarm item, boolean supportCalendar) {
            StringBuilder sb = new StringBuilder();
            Integer mDays = item.getMDays();
            if (mDays != null && mDays.intValue() == 0) {
                return context.getString(R.string.todo_only_once);
            }
            if (mDays != null && mDays.intValue() == 127) {
                return context.getString(R.string.every_day);
            }
            if (mDays != null && mDays.intValue() == 31) {
                return context.getString(R.string.monday_to_friday);
            }
            if (mDays != null && mDays.intValue() == 128) {
                return context.getString(supportCalendar ? R.string.workday : R.string.monday_to_friday);
            }
            if (mDays != null && mDays.intValue() == 96 && supportCalendar) {
                return context.getString(R.string.weekend);
            }
            int i = 0;
            int i2 = 0;
            for (Integer numValueOf = mDays; numValueOf.intValue() > 0; numValueOf = Integer.valueOf(numValueOf.intValue() >> 1)) {
                if ((numValueOf.intValue() & 1) == 1) {
                    i2++;
                }
            }
            String[] stringArray = !Language.isChinese() ? context.getResources().getStringArray(R.array.weeks_short) : context.getResources().getStringArray(R.array.weeks);
            while (true) {
                int i3 = i + 1;
                if ((mDays.intValue() & (1 << i)) != 0) {
                    sb.append(stringArray[i]);
                    i2--;
                    if (i2 > 0) {
                        sb.append(StringUtil.SPACE);
                    }
                }
                if (i3 > 6) {
                    HMLog.debug(AlarmRepeatChooser.g, new a(sb));
                    return sb.toString();
                }
                i = i3;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmRepeatChooser$IChooseListener;", "", "", "onShowCustomDialog", "", "days", "onChosen", "onCancelCustomDialog", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public interface IChooseListener {
        void onCancelCustomDialog();

        void onChosen(int days);

        void onShowCustomDialog();
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.ui.smartplay.alarm.AlarmRepeatChooser$a, reason: from toString */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0007HÖ\u0001R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\n\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"com/xiaomi/hm/health/ui/smartplay/alarm/AlarmRepeatChooser$a", "", "other", "", "equals", "", "a", "", "b", "title", "repeat", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmRepeatChooser$a;", "c", "toString", "hashCode", "Ljava/lang/String;", "f", "()Ljava/lang/String;", LogUtil.I, "e", "()I", "<init>", "(Ljava/lang/String;I)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class ItemData {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int repeat;

        public ItemData(@NotNull String str, int i) {
            this.title = str;
            this.repeat = i;
        }

        public static /* synthetic */ ItemData d(ItemData itemData, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = itemData.title;
            }
            if ((i2 & 2) != 0) {
                i = itemData.repeat;
            }
            return itemData.c(str, i);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getRepeat() {
            return this.repeat;
        }

        @NotNull
        public final ItemData c(@NotNull String title, int repeat) {
            return new ItemData(title, repeat);
        }

        public final int e() {
            return this.repeat;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.areEqual(ItemData.class, other == null ? null : other.getClass())) {
                return false;
            }
            Objects.requireNonNull(other, "null cannot be cast to non-null type com.xiaomi.hm.health.ui.smartplay.alarm.AlarmRepeatChooser.ItemData");
            return this.repeat == ((ItemData) other).repeat;
        }

        @NotNull
        public final String f() {
            return this.title;
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.repeat;
        }

        @NotNull
        public String toString() {
            return "ItemData(title=" + this.title + ", repeat=" + this.repeat + ")";
        }

        public /* synthetic */ ItemData(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? -2 : i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.IntRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref.IntRef intRef) {
            super(0);
            this.a = intRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "user custom repeat value: " + this.a.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/alarm/ListItemData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<ListItemData, CharSequence> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull ListItemData listItemData) {
            return listItemData.getTitle();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmRepeatChooser$a;", "itemData", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/ListItemData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<ItemData, ListItemData> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ListItemData invoke(@NotNull ItemData itemData) {
            return new ListItemData(false, itemData.f(), "", false, false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "user custom selected: " + AlarmRepeatChooser.this.j();
        }
    }

    public AlarmRepeatChooser(@NotNull Context context, @NotNull Function0<Boolean> function0) {
        this.context = context;
        this.supportCalendarFunc = function0;
        ItemData itemData = new ItemData(i(R.string.todo_only_once), 0);
        ItemData itemData2 = new ItemData(i(R.string.every_day), 127);
        ItemData itemData3 = new ItemData(i(R.string.customize), -1);
        ArrayList<ItemData> arrayListArrayListOf = function0.invoke().booleanValue() ? CollectionsKt__CollectionsKt.arrayListOf(itemData, itemData2, new ItemData(i(R.string.workday), 128), new ItemData(i(R.string.weekend), 96), itemData3) : CollectionsKt__CollectionsKt.arrayListOf(itemData, itemData2, itemData3);
        this.items = arrayListArrayListOf;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayListArrayListOf, 10));
        Iterator<T> it2 = arrayListArrayListOf.iterator();
        while (it2.hasNext()) {
            arrayList.add(new ListItemData(false, ((ItemData) it2.next()).f(), "", false, false));
        }
        this.repeatViewItems = arrayList;
        ((ListItemData) arrayList.get(g())).setShowRightImage(true);
        ((ListItemData) arrayList.get(g())).setShowTailText(true);
        String[] stringArray = this.context.getResources().getStringArray(R.array.weeks);
        ArrayList arrayList2 = new ArrayList(stringArray.length);
        for (String str : stringArray) {
            arrayList2.add(new ListItemData(false, str, "", false, false));
        }
        this.customDayItems = arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    private final int e(int repeatDays) {
        Iterator<ItemData> it2 = this.items.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().e() == repeatDays) {
                if (i != -1) {
                    return i;
                }
                return g();
            }
            i++;
        }
        i = -1;
        if (i != -1) {
            return i;
        }
        return g();
    }

    private final ItemData f(int position) {
        return this.items.get(position);
    }

    private final int g() {
        Iterator<ItemData> it2 = this.items.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().e() == -1) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private final int h() {
        Ref.IntRef intRef = new Ref.IntRef();
        int size = this.customDayItems.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (this.customDayItems.get(i).getShowSelect()) {
                    intRef.element = AlarmClockItem.WEEK_MASK[i] | intRef.element;
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        HMLog.info(g, new b(intRef));
        return intRef.element;
    }

    private final String i(@StringRes int id) {
        return this.context.getString(id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String j() {
        return CollectionsKt___CollectionsKt.joinToString$default(this.customDayItems, ",", null, null, 0, null, c.a, 30, null);
    }

    private final void k() {
        Object next;
        Object next2;
        Iterator<T> it2 = this.repeatViewItems.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!Intrinsics.areEqual(((ListItemData) next).getTitle(), i(R.string.workday)));
        ListItemData listItemData = (ListItemData) next;
        Iterator<T> it3 = this.repeatViewItems.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (!Intrinsics.areEqual(((ListItemData) next2).getTitle(), i(R.string.weekend)));
        ListItemData listItemData2 = (ListItemData) next2;
        if (this.supportCalendarFunc.invoke().booleanValue() && listItemData == null && listItemData2 == null) {
            ItemData itemData = new ItemData(i(R.string.workday), 128);
            ItemData itemData2 = new ItemData(i(R.string.weekend), 96);
            ArrayList<ItemData> arrayList = this.items;
            arrayList.add(2, itemData);
            arrayList.add(3, itemData2);
            d dVar = d.a;
            List<ListItemData> list = this.repeatViewItems;
            List<ListItemData> list2 = list instanceof ArrayList ? list : null;
            if (list2 == null) {
                return;
            }
            ArrayList arrayList2 = (ArrayList) list2;
            arrayList2.add(2, dVar.invoke(itemData));
            arrayList2.add(3, dVar.invoke(itemData2));
        }
    }

    private final void l(Alarm alarm) {
        Iterator<T> it2 = this.repeatViewItems.iterator();
        while (it2.hasNext()) {
            ((ListItemData) it2.next()).setShowSelect(false);
        }
        int iE = e((this.supportCalendarFunc.invoke().booleanValue() ? alarm.getMDays() : Integer.valueOf(AlarmClockManager.getCompactRepeatForNonCalendar(alarm.getMDays().intValue()))).intValue());
        ListItemData listItemData = this.repeatViewItems.get(iE);
        listItemData.setShowSelect(true);
        if (iE == g()) {
            listItemData.setTailText(INSTANCE.getWeekString(this.context, alarm, this.supportCalendarFunc.invoke().booleanValue()));
            listItemData.setShowTailText(true);
        } else {
            this.repeatViewItems.get(g()).setShowTailText(false);
            this.repeatViewItems.get(g()).setTailText("");
        }
    }

    private final void m(int days) {
        int size = this.customDayItems.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                this.customDayItems.get(i).setShowSelect(false);
                if (i2 > size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        if (days == 96) {
            int size2 = this.customDayItems.size();
            this.customDayItems.get(size2 - 1).setShowSelect(true);
            this.customDayItems.get(size2 - 2).setShowSelect(true);
            return;
        }
        int size3 = this.customDayItems.size() - 1;
        if (size3 < 0) {
            return;
        }
        while (true) {
            int i3 = size3 - 1;
            if (((64 >> (6 - size3)) & days) != 0) {
                this.customDayItems.get(size3).setShowSelect(true);
            }
            if (i3 < 0) {
                return;
            } else {
                size3 = i3;
            }
        }
    }

    private final void n(Context context, FragmentManager manager) {
        IChooseListener iChooseListener = this.listener;
        if (iChooseListener != null) {
            iChooseListener.onShowCustomDialog();
        }
        List<ListItemData> list = this.customDayItems;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ListItemData) it2.next()).getTitle());
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        String[] strArr = (String[]) array;
        List<ListItemData> list2 = this.customDayItems;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Boolean.valueOf(((ListItemData) it3.next()).getShowSelect()));
        }
        boolean[] booleanArray = CollectionsKt___CollectionsKt.toBooleanArray(arrayList2);
        AlertDialogFragment.ChoiceItems choiceItems = new AlertDialogFragment.ChoiceItems();
        choiceItems.setItems(strArr);
        choiceItems.setItemsChecked(booleanArray);
        new AlertDialogFragment.Builder(context).setTitle(R.string.alarm_clock_repeat).setMultiChoiceItems(choiceItems, new DialogInterface.OnMultiChoiceClickListener() { // from class: nb
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
                AlarmRepeatChooser.o(this.a, dialogInterface, i, z);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: lb
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AlarmRepeatChooser.p(this.a, dialogInterface, i);
            }
        }).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: kb
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AlarmRepeatChooser.q(this.a, dialogInterface, i);
            }
        }).setCancelable(true).show(manager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(AlarmRepeatChooser alarmRepeatChooser, DialogInterface dialogInterface, int i, boolean z) {
        alarmRepeatChooser.customDayItems.get(i).setShowSelect(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(AlarmRepeatChooser alarmRepeatChooser, DialogInterface dialogInterface, int i) {
        IChooseListener listener = alarmRepeatChooser.getListener();
        if (listener != null) {
            listener.onCancelCustomDialog();
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(AlarmRepeatChooser alarmRepeatChooser, DialogInterface dialogInterface, int i) {
        int iH = alarmRepeatChooser.h();
        IChooseListener listener = alarmRepeatChooser.getListener();
        if (listener != null) {
            listener.onChosen(iH);
        }
        HMLog.info(g, alarmRepeatChooser.new e());
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(AlarmRepeatChooser alarmRepeatChooser, Alarm alarm, Context context, FragmentManager fragmentManager, DialogInterface dialogInterface, int i) {
        if (i == alarmRepeatChooser.g()) {
            alarmRepeatChooser.m((alarmRepeatChooser.supportCalendarFunc.invoke().booleanValue() ? alarm.getMDays() : Integer.valueOf(AlarmClockManager.getCompactRepeatForNonCalendar(alarm.getMDays().intValue()))).intValue());
            alarmRepeatChooser.n(context, fragmentManager);
        } else {
            int iE = alarmRepeatChooser.f(i).e();
            IChooseListener listener = alarmRepeatChooser.getListener();
            if (listener != null) {
                listener.onChosen(iE);
            }
        }
        dialogInterface.dismiss();
    }

    @Nullable
    public final IChooseListener getListener() {
        return this.listener;
    }

    public final void setListener(@Nullable IChooseListener iChooseListener) {
        this.listener = iChooseListener;
    }

    public final void showDialog(@NotNull final Context context, @NotNull final Alarm alarm, @NotNull final FragmentManager manager) {
        k();
        l(alarm);
        AlertDialogFragment.ChoiceItems choiceItems = new AlertDialogFragment.ChoiceItems();
        List<ListItemData> list = this.repeatViewItems;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ListItemData) it2.next()).getTitle());
        }
        int i = 0;
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        String[] strArr = (String[]) array;
        Iterator<ListItemData> it3 = this.repeatViewItems.iterator();
        while (true) {
            if (!it3.hasNext()) {
                i = -1;
                break;
            } else if (it3.next().getShowSelect()) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            choiceItems.setItemChoice(i);
        }
        choiceItems.setItems(strArr);
        new AlertDialogFragment.Builder(context).setTitle(R.string.alarm_clock_repeat).setSingleChoiceItems(choiceItems, new DialogInterface.OnClickListener() { // from class: mb
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AlarmRepeatChooser.r(this.a, alarm, context, manager, dialogInterface, i2);
            }
        }).setCancelable(true).show(manager);
    }
}
