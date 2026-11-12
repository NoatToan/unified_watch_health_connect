package com.xiaomi.hm.health.ui.smartplay.customvibrate;

import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.model.VibrateType;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u001a\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0014\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\"\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r\"\u0016\u0010\u0012\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\r\"\u0016\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/ui/smartplay/customvibrate/model/VibrateType;", "vibrateType", "", "getDefaultVibrateDescription", "", "Lcom/xiaomi/hm/health/ui/smartplay/customvibrate/VibrateController$DataSegment;", "config", "", "checkVibrateConfig", "", "a", LogUtil.I, "MAX_COUNT", "b", "MAX_DURATION", "c", "MIN_DURATION_SINGLE", "MIN_DURATION_LIMIT", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class VibrateHelperKt {
    public static final int MIN_DURATION_LIMIT = 15;
    private static final int a = 120;
    private static final int b = 12000;
    private static final int c = 100;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/customvibrate/VibrateController$DataSegment;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<VibrateController.DataSegment, CharSequence> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull VibrateController.DataSegment dataSegment) {
            return String.valueOf(dataSegment.duration);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ List<VibrateController.DataSegment> a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<VibrateController.DataSegment> list, String str) {
            super(0);
            this.a = list;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "UI config, size: " + this.a.size() + ", values: " + this.b;
        }
    }

    public static final void checkVibrateConfig(@NotNull List<VibrateController.DataSegment> list) {
        HMLog.info("VibrateHelper", new b(list, CollectionsKt___CollectionsKt.joinToString$default(list, null, null, null, 0, null, a.a, 31, null)));
        Iterator<VibrateController.DataSegment> it2 = list.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            } else if (it2.next().duration == 0) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1) {
            int i3 = i2 - 1;
            int i4 = i2 + 1;
            int i5 = i3 >= 0 ? list.get(i3).duration + 0 : 0;
            if (i4 < list.size()) {
                i5 += list.get(i4).duration;
            }
            if (i3 >= 0) {
                list.get(i3).duration = i5;
                list.get(i3).vibrate = true;
                if (i4 < list.size()) {
                    list.remove(i4);
                }
                list.remove(i2);
            } else if (i4 < list.size()) {
                list.get(i4).duration = i5;
                list.get(i4).vibrate = true;
                list.remove(i2);
            }
        }
        if (((VibrateController.DataSegment) CollectionsKt.last((List) list)).duration < 15) {
            list.remove(list.size() - 1);
        } else if (((VibrateController.DataSegment) CollectionsKt.last((List) list)).duration < 100) {
            ((VibrateController.DataSegment) CollectionsKt.last((List) list)).duration = 100;
        }
        for (int size = list.size(); size > 120; size--) {
            list.remove(size - 1);
        }
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            i += ((VibrateController.DataSegment) it3.next()).duration;
        }
        int size2 = list.size() - 1;
        while (i > 12000) {
            int i6 = i - 12000;
            VibrateController.DataSegment dataSegment = list.get(size2);
            int i7 = dataSegment.duration;
            if (i7 - i6 >= 100) {
                dataSegment.duration = i7 - i6;
                return;
            }
            if (i7 > 100) {
                i -= i7 - 100;
                dataSegment.duration = 100;
            }
            size2--;
            if (size2 < 0) {
                return;
            }
        }
    }

    @Nullable
    public static final String getDefaultVibrateDescription(@NotNull Context context, @NotNull VibrateType vibrateType) {
        return context.getString(R.string.custom_vibrate_mode_default);
    }
}
