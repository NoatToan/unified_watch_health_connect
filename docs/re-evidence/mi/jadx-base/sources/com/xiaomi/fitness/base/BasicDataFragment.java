package com.xiaomi.fitness.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.c;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.k;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fitness.base.BaseDataFragment;
import com.xiaomi.fitness.base.BasicDataFragment;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.calendar.CalendarActivity;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.HealthPrefer;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.util.HealthBundleKey;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.view.TitleBarAlphaView;
import defpackage.c0j;
import defpackage.eah;
import defpackage.eri;
import defpackage.ida;
import defpackage.jui;
import defpackage.l2c;
import defpackage.o7h;
import defpackage.rbd;
import defpackage.str;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import miuix.miuixbasewidget.widget.FilterSortView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b&\u0018\u0000 Ä\u0001*\u0010\b\u0000\u0010\u0002*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0002Ä\u0001B\b¢\u0006\u0005\bÃ\u0001\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ%\u0010\u0012\u001a\u00020\u00062\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010$\u001a\u00020\u001a2\f\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0017H\u0002¢\u0006\u0004\b&\u0010'J/\u0010.\u001a\u0004\u0018\u00010-2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010,\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0006¢\u0006\u0004\b0\u0010\bJ\u0017\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\"H\u0016¢\u0006\u0004\b0\u00102J\u0017\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J!\u00108\u001a\u00020\u00062\u0006\u00107\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0017H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0006H\u0014¢\u0006\u0004\b=\u0010\bJ\u000f\u0010>\u001a\u00020\u0006H\u0014¢\u0006\u0004\b>\u0010\bJ\u000f\u0010?\u001a\u00020\u001aH\u0004¢\u0006\u0004\b?\u0010@J\u0019\u0010B\u001a\u00020\u00062\b\u0010A\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\bB\u0010<J\u000f\u0010C\u001a\u00020\u0006H\u0014¢\u0006\u0004\bC\u0010\bJ\u0019\u0010D\u001a\u00020\u00062\b\u0010A\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\bD\u0010<J\u0019\u0010E\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0004¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0006H\u0016¢\u0006\u0004\bG\u0010\bJ/\u0010H\u001a\u00020\u00062\f\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\bH\u0010IJ+\u0010K\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010J\u001a\u0004\u0018\u00010\u001a2\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\u00062\u0006\u00107\u001a\u00020-H\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020\u00062\u0006\u00107\u001a\u00020-H\u0016¢\u0006\u0004\bO\u0010NJ\u0017\u0010P\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u0017H\u0016¢\u0006\u0004\bP\u0010<J\u000f\u0010Q\u001a\u00020\u0006H\u0016¢\u0006\u0004\bQ\u0010\bJ\u001b\u0010R\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010#\u001a\u00020\"H$¢\u0006\u0004\bR\u0010SJ\u0019\u0010T\u001a\u0004\u0018\u00010\u00102\u0006\u0010#\u001a\u00020\"H$¢\u0006\u0004\bT\u0010UJ\u0019\u0010W\u001a\u00020\u00062\b\u0010V\u001a\u0004\u0018\u00010-H$¢\u0006\u0004\bW\u0010NJ\u0019\u0010X\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\bX\u0010FR\u001a\u0010Y\u001a\u00020\"8\u0016X\u0096D¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R*\u0010^\u001a\u0002032\u0006\u0010]\u001a\u0002038F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u00106R$\u0010d\u001a\u0004\u0018\u00010c8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010k\u001a\u00020j8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR$\u0010r\u001a\u0004\u0018\u00010q8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\"\u0010y\u001a\u00020x8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R'\u0010\u007f\u001a\u0004\u0018\u00010\u001a8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010@\"\u0005\b\u0082\u0001\u0010FR&\u0010\u0083\u0001\u001a\u00020\"8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010Z\u001a\u0005\b\u0084\u0001\u0010\\\"\u0005\b\u0085\u0001\u00102R&\u0010\u0086\u0001\u001a\u00020\"8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010Z\u001a\u0005\b\u0087\u0001\u0010\\\"\u0005\b\u0088\u0001\u00102R&\u0010\u0089\u0001\u001a\u0002038\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010_\u001a\u0005\b\u0089\u0001\u0010a\"\u0005\b\u008a\u0001\u00106R)\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u001a8\u0004@\u0004X\u0084\u000e¢\u0006\u0016\n\u0006\b\u008b\u0001\u0010\u0080\u0001\u001a\u0005\b\u008c\u0001\u0010@\"\u0005\b\u008d\u0001\u0010FR+\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R*\u0010\u0094\u0001\u001a\u0004\u0018\u00018\u00008\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0005\b\u0098\u0001\u0010\u0016R&\u0010\u009a\u0001\u001a\t\u0012\u0004\u0012\u00020\u00100\u0099\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R%\u0010\u009e\u0001\u001a\u00020\"8\u0004@\u0004X\u0084\u000e¢\u0006\u0014\n\u0005\b\u009e\u0001\u0010Z\u001a\u0005\b\u009f\u0001\u0010\\\"\u0004\b>\u00102R,\u0010¡\u0001\u001a\u000f\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001a0 \u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001R\u0018\u0010¥\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¥\u0001\u0010_R*\u0010§\u0001\u001a\u00030¦\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R,\u0010®\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R%\u0010µ\u0001\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0005\u0012\u00030´\u00010 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¢\u0001R&\u0010¶\u0001\u001a\u00020\"8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\b¶\u0001\u0010Z\u001a\u0005\b·\u0001\u0010\\\"\u0005\b¸\u0001\u00102R(\u0010¹\u0001\u001a\u0004\u0018\u00010\u001a8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0006\b¹\u0001\u0010\u0080\u0001\u001a\u0004\b$\u0010@\"\u0005\bº\u0001\u0010FR\u0018\u0010¼\u0001\u001a\u00030\u00ad\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b»\u0001\u0010±\u0001R\u0016\u0010¾\u0001\u001a\u0002038BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b½\u0001\u0010aR\u0019\u0010À\u0001\u001a\u0004\u0018\u00010\u00108$X¤\u0004¢\u0006\b\u001a\u0006\b¿\u0001\u0010\u0091\u0001R\u0016\u0010Â\u0001\u001a\u00020\"8$X¤\u0004¢\u0006\u0007\u001a\u0005\bÁ\u0001\u0010\\¨\u0006Å\u0001"}, d2 = {"Lcom/xiaomi/fitness/base/BasicDataFragment;", "Lcom/xiaomi/fitness/base/BaseDataFragment;", "T", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "Lcom/xiaomi/fitness/base/BaseDataFragment$a;", "Leah;", "", "addSystemBarHeightPadding", "()V", "initTab", "initTabList", "initFilterSortView", "setFilterTab", "initView", "Ljava/lang/Class;", "clz", "", "tag", "switchTab", "(Ljava/lang/Class;Ljava/lang/String;)V", "fragment", "setSelectChangedListener", "(Lcom/xiaomi/fitness/base/BaseDataFragment;)V", "Landroid/os/Bundle;", "createBundleForSwitchTab", "(Lcom/xiaomi/fitness/base/BaseDataFragment;)Landroid/os/Bundle;", "Lorg/joda/time/LocalDate;", "localDate", "getTitleDesc", "(Lorg/joda/time/LocalDate;)Ljava/lang/String;", "Lstr;", "yAxisMaxEntries", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "report", "", "position", "getCurrentLocalDate", "(Lstr;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;I)Lorg/joda/time/LocalDate;", "createBundle", "()Landroid/os/Bundle;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "showImgMore", "visibility", "(I)V", "", "show", "showCalendarExpand", "(Z)V", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "setTabList", "setTabType", "fetchCurrentDate", "()Lorg/joda/time/LocalDate;", SdkContants.KEY_BUNDLE, "onNewIntent", "initTableLayout", "initParamsFromBundle", "bindTitleBarAlphaView", "(Lorg/joda/time/LocalDate;)V", LifecycleConstantKt.ON_STOP, "onSelectChanged", "(Lstr;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;I)V", "currentDate", "displayReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;Lorg/joda/time/LocalDate;I)V", "onImgBackClick", "(Landroid/view/View;)V", "onImgShareClick", "expandBundle", "onShowCalendar", "getClassChild", "(I)Ljava/lang/Class;", "getClassChildName", "(I)Ljava/lang/String;", "contentView", "initContentView", "changeShowCalendar", "defaultDataType", "I", "getDefaultDataType", "()I", "value", "contentAttachToScrollView", "Z", "getContentAttachToScrollView", "()Z", "setContentAttachToScrollView", "Lcom/xiaomi/fitness/view/TitleBarAlphaView;", "titleBarAlphaView", "Lcom/xiaomi/fitness/view/TitleBarAlphaView;", "getTitleBarAlphaView", "()Lcom/xiaomi/fitness/view/TitleBarAlphaView;", "setTitleBarAlphaView", "(Lcom/xiaomi/fitness/view/TitleBarAlphaView;)V", "Lmiuix/miuixbasewidget/widget/FilterSortView;", "filterSortView", "Lmiuix/miuixbasewidget/widget/FilterSortView;", "getFilterSortView", "()Lmiuix/miuixbasewidget/widget/FilterSortView;", "setFilterSortView", "(Lmiuix/miuixbasewidget/widget/FilterSortView;)V", "Landroidx/core/widget/NestedScrollView;", "scrollView", "Landroidx/core/widget/NestedScrollView;", "getScrollView", "()Landroidx/core/widget/NestedScrollView;", "setScrollView", "(Landroidx/core/widget/NestedScrollView;)V", "Landroidx/appcompat/widget/LinearLayoutCompat;", "contentLayout", "Landroidx/appcompat/widget/LinearLayoutCompat;", "getContentLayout", "()Landroidx/appcompat/widget/LinearLayoutCompat;", "setContentLayout", "(Landroidx/appcompat/widget/LinearLayoutCompat;)V", "mSelectDate", "Lorg/joda/time/LocalDate;", "getMSelectDate", "setMSelectDate", "mPosition", "getMPosition", "setMPosition", "healthDataType", "getHealthDataType", "setHealthDataType", "isFromCalendar", "setFromCalendar", "calendarDate", "getCalendarDate", "setCalendarDate", "mDid", "Ljava/lang/String;", "getMDid", "()Ljava/lang/String;", "setMDid", "(Ljava/lang/String;)V", "currentFragment", "Lcom/xiaomi/fitness/base/BaseDataFragment;", "getCurrentFragment", "()Lcom/xiaomi/fitness/base/BaseDataFragment;", "setCurrentFragment", "", "mTabTitles", "Ljava/util/List;", "getMTabTitles", "()Ljava/util/List;", "tabType", "getTabType", "", "localDateMap", "Ljava/util/Map;", "getLocalDateMap", "()Ljava/util/Map;", "showCalendar", "", "relativeUid", "J", "getRelativeUid", "()J", "setRelativeUid", "(J)V", "Lida;", "_binding", "Lida;", "get_binding", "()Lida;", "set_binding", "(Lida;)V", "Lmiuix/miuixbasewidget/widget/FilterSortView$TabView;", "tabViewMap", "extendValue", "getExtendValue", "setExtendValue", "currentLocalDate", "setCurrentLocalDate", "getBinding", "binding", "getForceRefresh", "forceRefresh", "getClassName", "className", "getContentResourceId", "contentResourceId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBasicDataFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicDataFragment.kt\ncom/xiaomi/fitness/base/BasicDataFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,483:1\n157#2,8:484\n*S KotlinDebug\n*F\n+ 1 BasicDataFragment.kt\ncom/xiaomi/fitness/base/BasicDataFragment\n*L\n144#1:484,8\n*E\n"})
public abstract class BasicDataFragment<T extends BaseDataFragment<?, ?>> extends BaseFragment implements BaseDataFragment.a, eah {
    public static final int ABOUT = 500;
    public static final int ADD_MANUALLY_ITEM_ID = 200;
    public static final int ALL_DATA = 600;
    public static final int ALL_RECORDS_ITEM_ID = 100;
    public static final int ECG_INSTRUCTION = 400;
    public static final int INTERPRETED_DATA = 700;

    @NotNull
    private static final String KEY_TAB_SELECTED = "key_tab";
    public static final int MEASURE_REMIND = 300;
    public static final int POSITION_DAY = 0;
    public static final int POSITION_MONTH = 2;
    public static final int POSITION_WEEK = 1;
    public static final int SETTING_ITEM_ID = 1;
    public static final int TAB_TYPE_DEF = 0;
    public static final int TAB_TYPE_GONE = 2;
    public static final int TAB_TYPE_MENU = 1;

    @NotNull
    private static final String TAG = "BasicDataFragment";
    public static final int UNINTERPRETED_DATA = 800;

    @Nullable
    private ida _binding;

    @Nullable
    private LocalDate calendarDate;
    private boolean contentAttachToScrollView;
    protected LinearLayoutCompat contentLayout;

    @Nullable
    private T currentFragment;

    @Nullable
    private LocalDate currentLocalDate;
    private final int defaultDataType;
    private int extendValue;
    protected FilterSortView filterSortView;
    private int healthDataType;
    private boolean isFromCalendar;

    @NotNull
    private final Map<Integer, LocalDate> localDateMap;

    @Nullable
    private String mDid;
    private int mPosition;

    @Nullable
    private LocalDate mSelectDate;

    @NotNull
    private final List<String> mTabTitles;
    private long relativeUid;

    @Nullable
    private NestedScrollView scrollView;
    private boolean showCalendar;
    private int tabType;

    @NotNull
    private final Map<Integer, FilterSortView.TabView> tabViewMap;

    @Nullable
    private TitleBarAlphaView titleBarAlphaView;

    public BasicDataFragment() {
        super(jui.g1);
        this.defaultDataType = 2;
        this.contentAttachToScrollView = true;
        this.mTabTitles = new ArrayList();
        this.localDateMap = new LinkedHashMap();
        this.showCalendar = true;
        this.relativeUid = -1L;
        this.tabViewMap = new LinkedHashMap();
    }

    private final void addSystemBarHeightPadding() {
        View root;
        ida idaVar = this._binding;
        if (idaVar == null || (root = idaVar.getRoot()) == null) {
            return;
        }
        c.H0(root, new o7h() { // from class: yf2
            @Override // defpackage.o7h
            public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
                return BasicDataFragment.addSystemBarHeightPadding$lambda$2$lambda$1(this.f40119a, view, windowInsetsCompat);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat addSystemBarHeightPadding$lambda$2$lambda$1(BasicDataFragment this$0, View v, WindowInsetsCompat insets) {
        View root;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        rbd rbdVarF = insets.f(WindowInsetsCompat.m.h() | WindowInsetsCompat.m.b());
        Intrinsics.checkNotNullExpressionValue(rbdVarF, "getInsets(...)");
        Logger.d(TAG, "addStatusBarHeightPadding statusBars top=" + rbdVarF.f32379b + " bottom=" + rbdVarF.d);
        int i = rbdVarF.f32379b;
        ida idaVar = this$0._binding;
        if (idaVar != null && (root = idaVar.getRoot()) != null) {
            root.setPadding(root.getPaddingLeft(), i, root.getPaddingRight(), root.getPaddingBottom());
        }
        return WindowInsetsCompat.f2098b;
    }

    private final Bundle createBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("intentFragment", getClassName());
        bundle.putInt("sport_type", this.healthDataType);
        bundle.putString("did", this.mDid);
        bundle.putInt("position", this.mPosition);
        T t = this.currentFragment;
        Intrinsics.checkNotNull(t);
        bundle.putSerializable("local_date", t.getCurrentDate());
        bundle.putInt(HealthBundleKey.BUNDLE_PARAMS_EXTEND_VALUE, this.extendValue);
        bundle.putBoolean("switch_day_week_month", this.showCalendar);
        return bundle;
    }

    private final Bundle createBundleForSwitchTab(T fragment) {
        LocalDate localDate;
        Bundle bundle = new Bundle();
        bundle.putBoolean("calendar", this.isFromCalendar);
        if (this.isFromCalendar) {
            this.isFromCalendar = false;
            localDate = this.calendarDate;
            this.mSelectDate = localDate;
        } else {
            localDate = this.localDateMap.get(Integer.valueOf(this.mPosition));
            if (localDate == null) {
                localDate = this.mSelectDate;
            }
        }
        if (fragment != null) {
            fragment.mCurrentDate = localDate;
        }
        bundle.putSerializable("local_date", localDate);
        bundle.putString("did", this.mDid);
        bundle.putInt("sport_type", this.healthDataType);
        bundle.putLong("key_relative_uid", this.relativeUid);
        Logger.i(TAG, "createBundleForSwitchTab: localDate = " + localDate);
        bindTitleBarAlphaView(localDate);
        return bundle;
    }

    private final ida getBinding() {
        ida idaVar = this._binding;
        Intrinsics.checkNotNull(idaVar);
        return idaVar;
    }

    private final LocalDate getCurrentLocalDate(str<?> yAxisMaxEntries, DailyBasicReport report, int position) {
        if ((yAxisMaxEntries != null ? yAxisMaxEntries.c : null) == null || yAxisMaxEntries.c.size() <= 0) {
            if (report != null) {
                return TimeDateUtil.timestampToLocalDate(report.getTime());
            }
            LocalDate localDateNow = LocalDate.now();
            Intrinsics.checkNotNull(localDateNow);
            return localDateNow;
        }
        List<T> list = yAxisMaxEntries.c;
        LocalDate localDate = ((RecyclerBarEntry) list.get(list.size() / 2)).localDate;
        Intrinsics.checkNotNull(localDate);
        if (position != 1) {
            return position != 2 ? localDate : TimeDateUtil.getFirstDayOfMonth(localDate);
        }
        return TimeDateUtil.getWeekMonday(localDate);
    }

    private final boolean getForceRefresh() {
        int i = this.healthDataType;
        return i == 7 || i == 4 || i == 6;
    }

    private final String getTitleDesc(LocalDate localDate) {
        int i = this.mPosition;
        if (i == 0) {
            return TimeDateUtil.getDateYYYYMMddLocalFormat(localDate);
        }
        if (i != 1) {
            Intrinsics.checkNotNull(localDate);
            return TimeDateUtil.getDateYYYYMMLocalFormat(localDate);
        }
        Intrinsics.checkNotNull(localDate);
        return HealthUtil.getWeekDateStr(localDate);
    }

    private final void initFilterSortView() {
        int size = this.mTabTitles.size();
        for (final int i = 0; i < size; i++) {
            FilterSortView.TabView tabViewK = getFilterSortView().k(this.mTabTitles.get(i));
            this.tabViewMap.put(Integer.valueOf(i), tabViewK);
            tabViewK.setOnClickListener(new View.OnClickListener() { // from class: xf2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BasicDataFragment.initFilterSortView$lambda$3(this.f39060a, i, view);
                }
            });
        }
        getFilterSortView().setTabIncatorVisibility(8);
        setFilterTab();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initFilterSortView$lambda$3(BasicDataFragment this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.localDateMap.put(Integer.valueOf(this$0.mPosition), this$0.fetchCurrentDate());
        this$0.mPosition = i;
        this$0.switchTab(this$0.getClassChild(i), this$0.getClassChildName(this$0.mPosition));
    }

    private final void initTab() {
        setTabType();
        setTabList();
        initTabList();
        switchTab(getClassChild(this.mPosition), getClassChildName(this.mPosition));
    }

    private final void initTabList() {
        int i = this.tabType;
        if (i == 2) {
            ViewExtKt.setVisible(getFilterSortView(), false);
        } else if (i == 1) {
            initFilterSortView();
        } else {
            initFilterSortView();
        }
    }

    private final void initView() {
        initParamsFromBundle(getArguments());
        View viewInflate = LayoutInflater.from(getMActivity()).inflate(getContentResourceId(), (ViewGroup) null, false);
        if (viewInflate != null) {
            if (getContentAttachToScrollView()) {
                NestedScrollView nestedScrollView = this.scrollView;
                Intrinsics.checkNotNull(nestedScrollView);
                nestedScrollView.addView(viewInflate);
            } else {
                NestedScrollView nestedScrollView2 = this.scrollView;
                Intrinsics.checkNotNull(nestedScrollView2);
                nestedScrollView2.setVisibility(8);
                getContentLayout().removeView(this.scrollView);
                this.scrollView = null;
                getContentLayout().addView(viewInflate);
            }
            initContentView(viewInflate);
        }
        showImgMore();
    }

    private final void setFilterTab() {
        FilterSortView.TabView tabView;
        if (this.mPosition >= this.tabViewMap.size() || (tabView = this.tabViewMap.get(Integer.valueOf(this.mPosition))) == null) {
            return;
        }
        getFilterSortView().setFilteredTab(tabView);
    }

    private final void setSelectChangedListener(T fragment) {
        fragment.setOnSelectChangedListener(this);
    }

    private final void switchTab(Class<?> clz, String tag) {
        k kVarO = getChildFragmentManager().o();
        Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction(...)");
        T t = (T) getChildFragmentManager().l0(tag);
        Bundle bundleCreateBundleForSwitchTab = createBundleForSwitchTab(t);
        T t2 = this.currentFragment;
        if (t2 != null) {
            Intrinsics.checkNotNull(t2);
            t2.mCurrentDate = null;
            T t3 = this.currentFragment;
            Intrinsics.checkNotNull(t3);
            t3.resetSelectedEntry();
            T t4 = this.currentFragment;
            Intrinsics.checkNotNull(t4);
            kVarO.t(t4);
        }
        if (t == null) {
            try {
                Object objNewInstance = clz.newInstance();
                Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type T of com.xiaomi.fitness.base.BasicDataFragment");
                BaseDataFragment baseDataFragment = (BaseDataFragment) objNewInstance;
                try {
                    kVarO.c(eri.V1, baseDataFragment, tag);
                    baseDataFragment.setArguments(bundleCreateBundleForSwitchTab);
                    setSelectChangedListener(baseDataFragment);
                    t = (T) baseDataFragment;
                } catch (IllegalAccessException e) {
                    e = e;
                    t = (T) baseDataFragment;
                    e.printStackTrace();
                } catch (Exception e2) {
                    e = e2;
                    t = (T) baseDataFragment;
                    e.printStackTrace();
                }
            } catch (IllegalAccessException e3) {
                e = e3;
            } catch (Exception e4) {
                e = e4;
            }
            kVarO.m();
        } else {
            t.setArguments(bundleCreateBundleForSwitchTab);
            setSelectChangedListener(t);
            kVarO.F(t);
            kVarO.m();
        }
        this.currentFragment = t;
    }

    public final void bindTitleBarAlphaView(@Nullable LocalDate localDate) {
        String strC = l2c.c(getMActivity(), this.healthDataType);
        String titleDesc = getTitleDesc(localDate);
        this.currentLocalDate = localDate;
        TitleBarAlphaView titleBarAlphaView = this.titleBarAlphaView;
        Intrinsics.checkNotNull(titleBarAlphaView);
        titleBarAlphaView.bindData(strC, titleDesc);
        changeShowCalendar(localDate);
        TitleBarAlphaView titleBarAlphaView2 = this.titleBarAlphaView;
        Intrinsics.checkNotNull(titleBarAlphaView2);
        titleBarAlphaView2.setOnTitleBarClickListener(this);
    }

    public void changeShowCalendar(@Nullable LocalDate localDate) {
    }

    public void displayReport(@Nullable DailyBasicReport report, @Nullable LocalDate currentDate, int position) {
    }

    public void expandBundle(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    @NotNull
    public final LocalDate fetchCurrentDate() {
        T t = this.currentFragment;
        if (t != null) {
            Intrinsics.checkNotNull(t);
            if (t.mCurrentDate != null) {
                T t2 = this.currentFragment;
                Intrinsics.checkNotNull(t2);
                LocalDate mCurrentDate = t2.mCurrentDate;
                Intrinsics.checkNotNullExpressionValue(mCurrentDate, "mCurrentDate");
                return mCurrentDate;
            }
            T t3 = this.currentFragment;
            Intrinsics.checkNotNull(t3);
            if (t3.mSelectDate != null) {
                T t4 = this.currentFragment;
                Intrinsics.checkNotNull(t4);
                LocalDate mSelectDate = t4.mSelectDate;
                Intrinsics.checkNotNullExpressionValue(mSelectDate, "mSelectDate");
                return mSelectDate;
            }
        } else {
            LocalDate localDate = this.mSelectDate;
            if (localDate != null) {
                Intrinsics.checkNotNull(localDate);
                return localDate;
            }
        }
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        return localDateNow;
    }

    @Nullable
    public final LocalDate getCalendarDate() {
        return this.calendarDate;
    }

    @NotNull
    public abstract Class<?> getClassChild(int position);

    @Nullable
    public abstract String getClassChildName(int position);

    @Nullable
    public abstract String getClassName();

    public final boolean getContentAttachToScrollView() {
        return this.contentAttachToScrollView;
    }

    @NotNull
    public final LinearLayoutCompat getContentLayout() {
        LinearLayoutCompat linearLayoutCompat = this.contentLayout;
        if (linearLayoutCompat != null) {
            return linearLayoutCompat;
        }
        Intrinsics.throwUninitializedPropertyAccessException("contentLayout");
        return null;
    }

    public abstract int getContentResourceId();

    @Nullable
    public final T getCurrentFragment() {
        return this.currentFragment;
    }

    public int getDefaultDataType() {
        return this.defaultDataType;
    }

    public final int getExtendValue() {
        return this.extendValue;
    }

    @NotNull
    public final FilterSortView getFilterSortView() {
        FilterSortView filterSortView = this.filterSortView;
        if (filterSortView != null) {
            return filterSortView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("filterSortView");
        return null;
    }

    public final int getHealthDataType() {
        return this.healthDataType;
    }

    @NotNull
    public final Map<Integer, LocalDate> getLocalDateMap() {
        return this.localDateMap;
    }

    @Nullable
    public final String getMDid() {
        return this.mDid;
    }

    public final int getMPosition() {
        return this.mPosition;
    }

    @Nullable
    public final LocalDate getMSelectDate() {
        return this.mSelectDate;
    }

    @NotNull
    public final List<String> getMTabTitles() {
        return this.mTabTitles;
    }

    public final long getRelativeUid() {
        return this.relativeUid;
    }

    @Nullable
    public final NestedScrollView getScrollView() {
        return this.scrollView;
    }

    public final int getTabType() {
        return this.tabType;
    }

    @Nullable
    public final TitleBarAlphaView getTitleBarAlphaView() {
        return this.titleBarAlphaView;
    }

    @Nullable
    public final ida get_binding() {
        return this._binding;
    }

    public abstract void initContentView(@Nullable View contentView);

    public void initParamsFromBundle(@Nullable Bundle bundle) {
        if (bundle != null) {
            boolean z = bundle.getBoolean("calendar", false);
            this.isFromCalendar = z;
            if (z) {
                this.calendarDate = (LocalDate) bundle.getSerializable("calendar_date");
                bundle.remove("calendar");
                bundle.remove("calendar_date");
            }
            this.mPosition = bundle.getInt("position", 0);
            this.mSelectDate = (LocalDate) bundle.getSerializable("local_date");
            this.mDid = bundle.getString("did");
            this.extendValue = bundle.getInt(HealthBundleKey.BUNDLE_PARAMS_EXTEND_VALUE);
            this.relativeUid = bundle.getLong("key_relative_uid", -1L);
            this.healthDataType = bundle.getInt("sport_type", getDefaultDataType());
            if (this.mSelectDate == null) {
                this.mSelectDate = LocalDate.now();
            }
        }
    }

    public void initTableLayout() {
        int i = this.extendValue;
        if (i == 1 || i == 2) {
            this.showCalendar = false;
            showCalendarExpand(false);
        }
    }

    /* JADX INFO: renamed from: isFromCalendar, reason: from getter */
    public final boolean getIsFromCalendar() {
        return this.isFromCalendar;
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment.a
    public /* bridge */ /* synthetic */ void onDateChanged(LocalDate localDate) {
        super.onDateChanged(localDate);
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment.a
    public /* bridge */ /* synthetic */ void onDeviceListChanged(List list) {
        super.onDeviceListChanged(list);
    }

    @Override // defpackage.eah
    public void onImgBackClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        requireActivity().lambda$onCreate$0();
    }

    @Override // defpackage.eah
    public void onImgShareClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @Nullable
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = ida.A0(inflater, container, false);
        this.scrollView = getBinding().C;
        this.titleBarAlphaView = getBinding().E;
        setFilterSortView(getBinding().B);
        this.scrollView = getBinding().C;
        setContentLayout(getBinding().A);
        return getBinding().getRoot();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onNewIntent(@Nullable Bundle bundle) {
        super.onNewIntent(bundle);
        initParamsFromBundle(bundle);
        setFilterTab();
        initTableLayout();
        switchTab(getClassChild(this.mPosition), getClassChildName(this.mPosition));
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt("key_tab", this.mPosition);
    }

    public void onSelectChanged(@Nullable str<?> yAxisMaxEntries, @Nullable DailyBasicReport report, int position) {
        LocalDate currentLocalDate = getCurrentLocalDate(yAxisMaxEntries, report, position);
        bindTitleBarAlphaView(currentLocalDate);
        T t = this.currentFragment;
        Intrinsics.checkNotNull(t);
        t.mCurrentDate = currentLocalDate;
        displayReport(report, currentLocalDate, position);
    }

    @Override // defpackage.eah
    public void onShowCalendar() {
        Bundle bundleCreateBundle = createBundle();
        expandBundle(bundleCreateBundle);
        HealthPrefer.INSTANCE.setCALENDAR_FRAGMENT_POSITION(-1);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        BaseFragmentExKt.goActivity$default(this, fragmentActivityRequireActivity, CalendarActivity.class, bundleCreateBundle, null, 8, null);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        T t = this.currentFragment;
        if (t != null) {
            Intrinsics.checkNotNull(t);
            t.resetSelectedEntry();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Logger.i(TAG, "onViewCreated: bundle = " + arguments);
        }
        setActionBarDisplayable(false);
        Integer numValueOf = savedInstanceState != null ? Integer.valueOf(savedInstanceState.getInt("key_tab", -1)) : null;
        initView();
        if (numValueOf != null) {
            this.mPosition = numValueOf.intValue();
        }
        initTab();
        addSystemBarHeightPadding();
    }

    public final void setCalendarDate(@Nullable LocalDate localDate) {
        this.calendarDate = localDate;
    }

    public final void setContentAttachToScrollView(boolean z) {
        this.contentAttachToScrollView = z;
    }

    public final void setContentLayout(@NotNull LinearLayoutCompat linearLayoutCompat) {
        Intrinsics.checkNotNullParameter(linearLayoutCompat, "<set-?>");
        this.contentLayout = linearLayoutCompat;
    }

    public final void setCurrentFragment(@Nullable T t) {
        this.currentFragment = t;
    }

    public final void setCurrentLocalDate(@Nullable LocalDate localDate) {
        this.currentLocalDate = localDate;
    }

    public final void setExtendValue(int i) {
        this.extendValue = i;
    }

    public final void setFilterSortView(@NotNull FilterSortView filterSortView) {
        Intrinsics.checkNotNullParameter(filterSortView, "<set-?>");
        this.filterSortView = filterSortView;
    }

    public final void setFromCalendar(boolean z) {
        this.isFromCalendar = z;
    }

    public final void setHealthDataType(int i) {
        this.healthDataType = i;
    }

    public final void setMDid(@Nullable String str) {
        this.mDid = str;
    }

    public final void setMPosition(int i) {
        this.mPosition = i;
    }

    public final void setMSelectDate(@Nullable LocalDate localDate) {
        this.mSelectDate = localDate;
    }

    public final void setRelativeUid(long j) {
        this.relativeUid = j;
    }

    public final void setScrollView(@Nullable NestedScrollView nestedScrollView) {
        this.scrollView = nestedScrollView;
    }

    public void setTabList() {
        ListExtKt.add(this.mTabTitles, getString(c0j.b7));
        ListExtKt.add(this.mTabTitles, getString(c0j.e7));
        ListExtKt.add(this.mTabTitles, getString(c0j.c7));
    }

    public final void setTabType(int i) {
        this.tabType = i;
    }

    public final void setTitleBarAlphaView(@Nullable TitleBarAlphaView titleBarAlphaView) {
        this.titleBarAlphaView = titleBarAlphaView;
    }

    public final void set_binding(@Nullable ida idaVar) {
        this._binding = idaVar;
    }

    public void showCalendarExpand(boolean show) {
        this.showCalendar = show;
    }

    public final void showImgMore() {
        int i = this.healthDataType;
        int i2 = 8;
        if (i != 2 && i != 15 && i != 8 && i != 10 && i != 12 && i != 6) {
            i2 = 0;
        }
        showImgMore(i2);
    }

    public void setTabType() {
        this.tabType = 0;
    }

    public void showImgMore(int visibility) {
        ImageView imgShare;
        TitleBarAlphaView titleBarAlphaView = this.titleBarAlphaView;
        if (titleBarAlphaView == null || (imgShare = titleBarAlphaView.getImgShare()) == null) {
            return;
        }
        imgShare.setVisibility(visibility);
    }

    @Nullable
    public final LocalDate getCurrentLocalDate() {
        return this.currentLocalDate;
    }
}
