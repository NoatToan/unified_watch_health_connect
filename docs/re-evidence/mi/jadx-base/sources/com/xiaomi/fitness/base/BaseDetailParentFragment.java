package com.xiaomi.fitness.base;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.c;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.k;
import com.google.android.material.tabs.TabLayout;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.base.BaseDetailChildFragment;
import com.xiaomi.fitness.base.BaseDetailParentFragment;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.calendar.CalendarActivity;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.data.HealthPrefer;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.feedback.export.UploadFileManager;
import com.xiaomi.fitness.feedback.export.UploadFileManagerExtKt;
import com.xiaomi.fitness.util.HealthBundleKey;
import com.xiaomi.fitness.view.TitleBarAlphaView;
import defpackage.c0j;
import defpackage.eah;
import defpackage.eri;
import defpackage.ida;
import defpackage.jui;
import defpackage.l2c;
import defpackage.o7h;
import defpackage.rbd;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import miuix.miuixbasewidget.widget.FilterSortView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b&\u0018\u0000 Å\u0001*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0002Å\u0001B\b¢\u0006\u0005\bÄ\u0001\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ%\u0010\u0012\u001a\u00020\u00062\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0017H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\bJ/\u0010)\u001a\u0004\u0018\u00010(2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010'\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b)\u0010*J!\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0006H\u0014¢\u0006\u0004\b.\u0010\bJ\u0017\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0017H\u0016¢\u0006\u0004\b0\u0010\u001aJ\u000f\u00101\u001a\u00020\u0006H\u0014¢\u0006\u0004\b1\u0010\bJ\u000f\u00102\u001a\u00020\u0006H\u0014¢\u0006\u0004\b2\u0010\bJ-\u00109\u001a\u00020\u00062\f\u00105\u001a\b\u0012\u0004\u0012\u000204032\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u000206H\u0014¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0006H\u0014¢\u0006\u0004\b;\u0010\bJ\u0019\u0010<\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b<\u0010\u001aJ\u000f\u0010=\u001a\u00020\u0006H\u0014¢\u0006\u0004\b=\u0010\bJ\u001f\u0010@\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020\u001bH\u0004¢\u0006\u0004\b@\u0010AJ\u0019\u0010@\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0004¢\u0006\u0004\b@\u0010BJ\u0019\u0010C\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\bC\u0010BJ\u001f\u0010D\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020\u001bH\u0016¢\u0006\u0004\bD\u0010AJ\u0017\u0010F\u001a\u00020\u00062\u0006\u0010E\u001a\u000206H\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\u00062\u0006\u0010+\u001a\u00020(H\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u00062\u0006\u0010+\u001a\u00020(H\u0016¢\u0006\u0004\bJ\u0010IJ\u000f\u0010K\u001a\u00020\u0006H\u0016¢\u0006\u0004\bK\u0010\bJ\u0017\u0010N\u001a\u00020\u00062\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bN\u0010OJ\u0019\u0010P\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\bR\u0010\u001aJ\u0017\u0010T\u001a\u00020\u00062\u0006\u0010S\u001a\u00020(H\u0014¢\u0006\u0004\bT\u0010IJ\u001b\u0010W\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010V\u001a\u00020UH$¢\u0006\u0004\bW\u0010XJ\u0019\u0010Y\u001a\u0004\u0018\u00010\u00102\u0006\u0010V\u001a\u00020UH$¢\u0006\u0004\bY\u0010ZR\u001a\u0010[\u001a\u00020U8\u0016X\u0096D¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R$\u0010`\u001a\u0004\u0018\u00010_8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010g\u001a\u00020f8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR$\u0010n\u001a\u0004\u0018\u00010m8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR$\u0010t\u001a\u0004\u0018\u00010\u001b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010BR\"\u0010y\u001a\u00020U8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\by\u0010\\\u001a\u0004\bz\u0010^\"\u0004\b{\u0010|R\"\u0010}\u001a\u00020U8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b}\u0010\\\u001a\u0004\b~\u0010^\"\u0004\b\u007f\u0010|R&\u0010\u0080\u0001\u001a\u00020U8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010\\\u001a\u0005\b\u0081\u0001\u0010^\"\u0005\b\u0082\u0001\u0010|R(\u0010\u0083\u0001\u001a\u0002068\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0083\u0001\u0010\u0085\u0001\"\u0005\b\u0086\u0001\u0010GR(\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u001b8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010u\u001a\u0005\b\u0088\u0001\u0010w\"\u0005\b\u0089\u0001\u0010BR+\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R*\u0010\u0090\u0001\u001a\u0004\u0018\u00018\u00008\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0005\b\u0094\u0001\u0010\u0016R%\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020\u0010038\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R%\u0010\u0099\u0001\u001a\u00020U8\u0004@\u0004X\u0084\u000e¢\u0006\u0014\n\u0005\b\u0099\u0001\u0010\\\u001a\u0005\b\u009a\u0001\u0010^\"\u0004\b;\u0010|R\u0019\u0010\u009b\u0001\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0084\u0001R,\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R%\u0010¥\u0001\u001a\u0010\u0012\u0004\u0012\u00020U\u0012\u0005\u0012\u00030¤\u00010£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R6\u0010§\u0001\u001a\u000f\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020U0£\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b§\u0001\u0010¦\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R.\u0010¬\u0001\u001a\u0011\u0012\u0004\u0012\u00020U\u0012\u0006\u0012\u0004\u0018\u00010\u001b0£\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b¬\u0001\u0010¦\u0001\u001a\u0006\b\u00ad\u0001\u0010©\u0001R\u0017\u0010®\u0001\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010\u008b\u0001R#\u0010±\u0001\u001a\f\u0012\u0005\u0012\u00030°\u0001\u0018\u00010¯\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R,\u0010´\u0001\u001a\u0005\u0018\u00010³\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R&\u0010º\u0001\u001a\u00020U8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\bº\u0001\u0010\\\u001a\u0005\b»\u0001\u0010^\"\u0005\b¼\u0001\u0010|R&\u0010½\u0001\u001a\u00020U8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\b½\u0001\u0010\\\u001a\u0005\b¾\u0001\u0010^\"\u0005\b¿\u0001\u0010|R\u0019\u0010Á\u0001\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\b\u001a\u0006\bÀ\u0001\u0010\u008d\u0001R\u0016\u0010Ã\u0001\u001a\u00020U8$X¤\u0004¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010^¨\u0006Æ\u0001"}, d2 = {"Lcom/xiaomi/fitness/base/BaseDetailParentFragment;", "Lcom/xiaomi/fitness/base/BaseDetailChildFragment;", "T", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "Lcom/xiaomi/fitness/base/BaseDetailChildFragment$OnDateSelectChangedListener;", "Leah;", "", "addSystemBarHeightPadding", "()V", "initTabLayoutList", "initTabList", "initFilterSortView", "setFilterTab", "initView", "Ljava/lang/Class;", "clz", "", "tag", "switchTab", "(Ljava/lang/Class;Ljava/lang/String;)V", "fragment", "setSelectChangedListener", "(Lcom/xiaomi/fitness/base/BaseDetailChildFragment;)V", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "initParamsFromBundle", "(Landroid/os/Bundle;)V", "Lorg/joda/time/LocalDate;", "localDate", "getTitleDesc", "(Lorg/joda/time/LocalDate;)Ljava/lang/String;", "getWeekDateStr", "createBundleForCalendar", "()Landroid/os/Bundle;", "updateFilterSortViewWidth", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "initPositionMap", "outState", "onSaveInstanceState", "initTab", "setTabList", "", "Lcom/google/android/material/tabs/TabLayout$g;", "tabList", "", "judgeShowContinueTab", "judgeShowFingerTab", "setTabLayoutList", "(Ljava/util/List;ZZ)V", "setTabType", "onNewIntent", "expandPositionIfNeed", "startDate", "endDate", "bindTitleBarAlphaView", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "(Lorg/joda/time/LocalDate;)V", "onSelectDateChanged", "onSelectStartEndDateChanged", "enable", "onTitleBarJumpEnable", "(Z)V", "onImgBackClick", "(Landroid/view/View;)V", "onImgShareClick", "onShowCalendar", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "createBundleForSwitchTab", "(Lcom/xiaomi/fitness/base/BaseDetailChildFragment;)Landroid/os/Bundle;", "expandBundle", "contentView", "initContentView", "", "position", "getClassChild", "(I)Ljava/lang/Class;", "getClassChildName", "(I)Ljava/lang/String;", "defaultSportType", "I", "getDefaultSportType", "()I", "Lcom/xiaomi/fitness/view/TitleBarAlphaView;", "titleBarAlphaView", "Lcom/xiaomi/fitness/view/TitleBarAlphaView;", "getTitleBarAlphaView", "()Lcom/xiaomi/fitness/view/TitleBarAlphaView;", "setTitleBarAlphaView", "(Lcom/xiaomi/fitness/view/TitleBarAlphaView;)V", "Lmiuix/miuixbasewidget/widget/FilterSortView;", "filterSortView", "Lmiuix/miuixbasewidget/widget/FilterSortView;", "getFilterSortView", "()Lmiuix/miuixbasewidget/widget/FilterSortView;", "setFilterSortView", "(Lmiuix/miuixbasewidget/widget/FilterSortView;)V", "Landroidx/core/widget/NestedScrollView;", "scrollView", "Landroidx/core/widget/NestedScrollView;", "getScrollView", "()Landroidx/core/widget/NestedScrollView;", "setScrollView", "(Landroidx/core/widget/NestedScrollView;)V", "mSelectDate", "Lorg/joda/time/LocalDate;", "getMSelectDate", "()Lorg/joda/time/LocalDate;", "setMSelectDate", "mPosition", "getMPosition", "setMPosition", "(I)V", "mPrePosition", "getMPrePosition", "setMPrePosition", "sportDataType", "getSportDataType", "setSportDataType", "isFromCalendar", "Z", "()Z", "setFromCalendar", "calendarDate", "getCalendarDate", "setCalendarDate", "mSid", "Ljava/lang/String;", "getMSid", "()Ljava/lang/String;", "setMSid", "(Ljava/lang/String;)V", "currentFragment", "Lcom/xiaomi/fitness/base/BaseDetailChildFragment;", "getCurrentFragment", "()Lcom/xiaomi/fitness/base/BaseDetailChildFragment;", "setCurrentFragment", "mTabTitles", "Ljava/util/List;", "getMTabTitles", "()Ljava/util/List;", "tabType", "getTabType", "showCalendar", "Lida;", "binding", "Lida;", "getBinding", "()Lida;", "setBinding", "(Lida;)V", "", "Lmiuix/miuixbasewidget/widget/FilterSortView$TabView;", "tabViewMap", "Ljava/util/Map;", "positionMap", "getPositionMap", "()Ljava/util/Map;", "setPositionMap", "(Ljava/util/Map;)V", "localDateMap", "getLocalDateMap", "logTag", "Ljava/lang/ref/WeakReference;", "Landroidx/fragment/app/DialogFragment;", "commentDialog", "Ljava/lang/ref/WeakReference;", "Lcom/google/android/material/tabs/TabLayout;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "getTabLayout", "()Lcom/google/android/material/tabs/TabLayout;", "setTabLayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "tabPosition", "getTabPosition", "setTabPosition", "recoverTabPosition", "getRecoverTabPosition", "setRecoverTabPosition", "getClassName", "className", "getContentResourceId", "contentResourceId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBaseDetailParentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseDetailParentFragment.kt\ncom/xiaomi/fitness/base/BaseDetailParentFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,569:1\n157#2,8:570\n*S KotlinDebug\n*F\n+ 1 BaseDetailParentFragment.kt\ncom/xiaomi/fitness/base/BaseDetailParentFragment\n*L\n132#1:570,8\n*E\n"})
public abstract class BaseDetailParentFragment<T extends BaseDetailChildFragment> extends BaseFragment implements BaseDetailChildFragment.OnDateSelectChangedListener, eah {

    @NotNull
    private static final String KEY_SECOND_TAB_SELECTED = "key_second_tab";

    @NotNull
    private static final String KEY_TAB_SELECTED = "key_tab";
    public static final int POSITION_DAY = 0;
    public static final int POSITION_MONTH = 2;
    public static final int POSITION_WEEK = 1;
    public static final int TAB_TYPE_DEF = 0;
    public static final int TAB_TYPE_GONE = 2;
    public static final int TAB_TYPE_MENU = 1;

    @NotNull
    private static final String TAG = "BaseDetailParent";

    @Nullable
    private ida binding;

    @Nullable
    private LocalDate calendarDate;

    @Nullable
    private WeakReference<DialogFragment> commentDialog;

    @Nullable
    private T currentFragment;
    private final int defaultSportType;
    protected FilterSortView filterSortView;
    private boolean isFromCalendar;

    @NotNull
    private final Map<Integer, LocalDate> localDateMap;

    @NotNull
    private final String logTag;
    private int mPosition;
    private int mPrePosition;

    @Nullable
    private LocalDate mSelectDate;

    @Nullable
    private String mSid;

    @NotNull
    private final List<String> mTabTitles;

    @NotNull
    private Map<Integer, Integer> positionMap;
    private int recoverTabPosition;

    @Nullable
    private NestedScrollView scrollView;
    private boolean showCalendar;
    private int sportDataType;

    @Nullable
    private TabLayout tabLayout;
    private int tabPosition;
    private int tabType;

    @NotNull
    private final Map<Integer, FilterSortView.TabView> tabViewMap;

    @Nullable
    private TitleBarAlphaView titleBarAlphaView;

    public BaseDetailParentFragment() {
        super(jui.g1);
        this.defaultSportType = 2;
        this.mTabTitles = new ArrayList();
        this.showCalendar = true;
        this.tabViewMap = new LinkedHashMap();
        this.positionMap = new LinkedHashMap();
        this.localDateMap = new LinkedHashMap();
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.logTag = simpleName;
        this.recoverTabPosition = -1;
    }

    private final void addSystemBarHeightPadding() {
        ida idaVar;
        View root;
        ida idaVar2 = this.binding;
        if (idaVar2 == null || idaVar2.getRoot() == null || (idaVar = this.binding) == null || (root = idaVar.getRoot()) == null) {
            return;
        }
        c.H0(root, new o7h() { // from class: s62
            @Override // defpackage.o7h
            public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
                return BaseDetailParentFragment.addSystemBarHeightPadding$lambda$3$lambda$2(this.f33337a, view, windowInsetsCompat);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat addSystemBarHeightPadding$lambda$3$lambda$2(BaseDetailParentFragment this$0, View v, WindowInsetsCompat insets) {
        View root;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        rbd rbdVarF = insets.f(WindowInsetsCompat.m.h() | WindowInsetsCompat.m.b());
        Intrinsics.checkNotNullExpressionValue(rbdVarF, "getInsets(...)");
        Logger.d(TAG, "addStatusBarHeightPadding statusBars top=" + rbdVarF.f32379b + " bottom=" + rbdVarF.d);
        int i = rbdVarF.f32379b;
        ida idaVar = this$0.binding;
        if (idaVar != null && (root = idaVar.getRoot()) != null) {
            root.setPadding(root.getPaddingLeft(), i, root.getPaddingRight(), root.getPaddingBottom());
        }
        return WindowInsetsCompat.f2098b;
    }

    private final Bundle createBundleForCalendar() {
        Bundle bundle = new Bundle();
        bundle.putString("intentFragment", getClassName());
        bundle.putInt("sport_type", this.sportDataType);
        bundle.putString("did", this.mSid);
        bundle.putInt("position", this.mPosition);
        T t = this.currentFragment;
        Intrinsics.checkNotNull(t);
        bundle.putSerializable("local_date", t.getMCurrentDate());
        bundle.putBoolean("switch_day_week_month", this.showCalendar);
        return bundle;
    }

    private final String getClassName() {
        return getClass().getName();
    }

    private final String getTitleDesc(LocalDate localDate) {
        int iIntValue = this.mPosition;
        if (this.positionMap.containsKey(Integer.valueOf(iIntValue))) {
            Integer num = this.positionMap.get(Integer.valueOf(this.mPosition));
            Intrinsics.checkNotNull(num);
            iIntValue = num.intValue();
        }
        if (iIntValue == 0) {
            return TimeDateUtil.getDateYYYYMMddLocalFormat(localDate);
        }
        if (iIntValue != 1) {
            Intrinsics.checkNotNull(localDate);
            return TimeDateUtil.getDateYYYYMMLocalFormat(localDate);
        }
        Intrinsics.checkNotNull(localDate);
        return getWeekDateStr(localDate);
    }

    private final String getWeekDateStr(LocalDate localDate) {
        LocalDate weekMonday = TimeDateUtil.getWeekMonday(localDate);
        LocalDate localDatePlusDays = weekMonday.plusDays(6);
        Intrinsics.checkNotNull(localDatePlusDays);
        return TimeDateUtil.getDateRangeFormat(weekMonday, localDatePlusDays);
    }

    private final void initFilterSortView() {
        if (AppUtil.isRTLDirection()) {
            final int size = this.mTabTitles.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    break;
                }
                FilterSortView.TabView tabViewK = getFilterSortView().k(this.mTabTitles.get(size));
                this.tabViewMap.put(Integer.valueOf(size), tabViewK);
                tabViewK.setOnClickListener(new View.OnClickListener() { // from class: q62
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BaseDetailParentFragment.initFilterSortView$lambda$4(this.f31156a, size, view);
                    }
                });
            }
        } else {
            int size2 = this.mTabTitles.size();
            for (final int i = 0; i < size2; i++) {
                FilterSortView.TabView tabViewK2 = getFilterSortView().k(this.mTabTitles.get(i));
                this.tabViewMap.put(Integer.valueOf(i), tabViewK2);
                tabViewK2.setOnClickListener(new View.OnClickListener() { // from class: r62
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BaseDetailParentFragment.initFilterSortView$lambda$5(this.f32225a, i, view);
                    }
                });
            }
        }
        getFilterSortView().setTabIncatorVisibility(8);
        setFilterTab();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initFilterSortView$lambda$4(BaseDetailParentFragment this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mPrePosition = this$0.mPosition;
        this$0.mPosition = i;
        this$0.switchTab(this$0.getClassChild(i), this$0.getClassChildName(this$0.mPosition));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initFilterSortView$lambda$5(BaseDetailParentFragment this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mPrePosition = this$0.mPosition;
        this$0.mPosition = i;
        this$0.switchTab(this$0.getClassChild(i), this$0.getClassChildName(this$0.mPosition));
    }

    private final void initParamsFromBundle(Bundle bundle) {
        Logger.d(this.logTag, "Parent initParamsFromBundle");
        if (bundle != null) {
            boolean z = bundle.getBoolean("calendar", false);
            this.isFromCalendar = z;
            if (z) {
                this.calendarDate = (LocalDate) bundle.getSerializable("calendar_date");
                bundle.remove("calendar");
                bundle.remove("calendar_date");
                Logger.i(this.logTag, "Parent initParamsFromBundle fromCalendar calendarDate:" + this.calendarDate);
            }
            this.mPrePosition = this.mPosition;
            this.mPosition = bundle.getInt("position", 0);
            expandPositionIfNeed();
            LocalDate localDate = (LocalDate) bundle.getSerializable("local_date");
            this.mSelectDate = localDate;
            if (localDate == null && bundle.getLong(HealthBundleKey.BUNDLE_PARAMS_LOCAL_DATE_TIME) != 0) {
                this.mSelectDate = new LocalDate(bundle.getLong(HealthBundleKey.BUNDLE_PARAMS_LOCAL_DATE_TIME) * ((long) 1000));
            }
            this.mSid = bundle.getString("did");
            this.sportDataType = bundle.getInt("sport_type", getDefaultSportType());
            if (this.mSelectDate == null) {
                this.mSelectDate = LocalDate.now();
            }
            Logger.i(this.logTag, "Parent initParamsFromBundle mSelectDate:" + this.mSelectDate);
        }
    }

    private final void initTabLayoutList() {
        TabLayout tabLayout = this.tabLayout;
        Intrinsics.checkNotNull(tabLayout);
        tabLayout.addOnTabSelectedListener(new TabLayout.d(this) { // from class: com.xiaomi.fitness.base.BaseDetailParentFragment.initTabLayoutList.1
            final /* synthetic */ BaseDetailParentFragment<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.android.material.tabs.TabLayout.c
            public void onTabReselected(TabLayout.g tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.c
            public void onTabSelected(TabLayout.g tab) {
                BaseDetailParentFragment<T> baseDetailParentFragment = this.this$0;
                Intrinsics.checkNotNull(tab);
                baseDetailParentFragment.setTabPosition(tab.g());
                tab.i.setTooltipText(null);
                BaseDetailParentFragment<T> baseDetailParentFragment2 = this.this$0;
                Class<?> classChild = baseDetailParentFragment2.getClassChild(baseDetailParentFragment2.getMPosition());
                BaseDetailParentFragment<T> baseDetailParentFragment3 = this.this$0;
                baseDetailParentFragment2.switchTab(classChild, baseDetailParentFragment3.getClassChildName(baseDetailParentFragment3.getMPosition()));
            }

            @Override // com.google.android.material.tabs.TabLayout.c
            public void onTabUnselected(TabLayout.g tab) {
            }
        });
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
            NestedScrollView nestedScrollView = this.scrollView;
            Intrinsics.checkNotNull(nestedScrollView);
            nestedScrollView.addView(viewInflate);
            initContentView(viewInflate);
        }
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchTab(Class<?> clz, String tag) {
        k kVarO = getChildFragmentManager().o();
        Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction(...)");
        T t = (T) getChildFragmentManager().l0(tag);
        Bundle bundleCreateBundleForSwitchTab = createBundleForSwitchTab(t);
        T t2 = this.currentFragment;
        if (t2 != null) {
            Intrinsics.checkNotNull(t2);
            t2.setMCurrentDate(null);
            T t3 = this.currentFragment;
            Intrinsics.checkNotNull(t3);
            kVarO.t(t3);
        }
        if (t == null) {
            try {
                Object objNewInstance = clz.newInstance();
                Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type T of com.xiaomi.fitness.base.BaseDetailParentFragment");
                BaseDetailChildFragment baseDetailChildFragment = (BaseDetailChildFragment) objNewInstance;
                try {
                    kVarO.c(eri.V1, baseDetailChildFragment, tag);
                    baseDetailChildFragment.setArguments(bundleCreateBundleForSwitchTab);
                    setSelectChangedListener(baseDetailChildFragment);
                    t = (T) baseDetailChildFragment;
                } catch (IllegalAccessException e) {
                    e = e;
                    t = (T) baseDetailChildFragment;
                    e.printStackTrace();
                } catch (Exception e2) {
                    e = e2;
                    t = (T) baseDetailChildFragment;
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

    private final void updateFilterSortViewWidth() {
        ViewGroup.LayoutParams layoutParams = getFilterSortView().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        Context context = getContext();
        layoutParams.width = (context == null || !UIUtils.INSTANCE.isTabletAndLandscape(context)) ? -1 : ExtUtilsKt.getDp(626);
        getFilterSortView().setLayoutParams(layoutParams);
    }

    public final void bindTitleBarAlphaView(@NotNull LocalDate startDate, @NotNull LocalDate endDate) {
        String dateMMddFormat;
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        String strC = l2c.c(getMActivity(), this.sportDataType);
        if (TimeDateUtil.isSameLocalDate(startDate, endDate)) {
            dateMMddFormat = TimeDateUtil.getDateMMddFormat(startDate);
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            dateMMddFormat = String.format("%s-%s", Arrays.copyOf(new Object[]{TimeDateUtil.getDateMMddFormat(startDate), TimeDateUtil.getDateMMddFormat(endDate)}, 2));
            Intrinsics.checkNotNullExpressionValue(dateMMddFormat, "format(...)");
        }
        TitleBarAlphaView titleBarAlphaView = this.titleBarAlphaView;
        Intrinsics.checkNotNull(titleBarAlphaView);
        titleBarAlphaView.bindData(strC, dateMMddFormat);
        TitleBarAlphaView titleBarAlphaView2 = this.titleBarAlphaView;
        Intrinsics.checkNotNull(titleBarAlphaView2);
        titleBarAlphaView2.setOnTitleBarClickListener(this);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e2  */
    @NotNull
    public Bundle createBundleForSwitchTab(@Nullable T fragment) {
        LocalDate localDateNow;
        if (this.isFromCalendar) {
            this.isFromCalendar = false;
            localDateNow = this.calendarDate;
            this.mSelectDate = localDateNow;
            Logger.d(this.logTag, "Parent createBundleForSwitchTab fromCalendar");
        } else {
            localDateNow = this.localDateMap.get(1);
            if (localDateNow == null) {
                localDateNow = LocalDate.now();
            }
            LocalDate localDatePlusDays = this.localDateMap.get(2);
            if (localDatePlusDays == null) {
                localDatePlusDays = LocalDate.now();
            }
            LocalDate localDateMinusDays = this.localDateMap.get(0);
            if (localDateMinusDays == null) {
                localDateMinusDays = this.mSelectDate;
                Intrinsics.checkNotNull(localDateMinusDays);
            }
            int i = this.mPosition;
            if (i != 0) {
                if (i == 1) {
                    int i2 = this.mPrePosition;
                    if (i2 != 0) {
                        if (i2 == 2) {
                            Intrinsics.checkNotNull(localDateNow);
                            Intrinsics.checkNotNull(localDatePlusDays);
                            if (!TimeDateUtil.isSameMonth(localDateNow, localDatePlusDays)) {
                                localDateNow = TimeDateUtil.getFirstDayOfNextMonth(localDatePlusDays.plusMonths(1)).minusDays(1);
                            }
                        }
                    }
                } else if (i != 2) {
                    localDateNow = null;
                } else {
                    int i3 = this.mPrePosition;
                    if (i3 == 0) {
                        localDatePlusDays = localDateMinusDays;
                    } else if (i3 == 1) {
                        localDatePlusDays = TimeDateUtil.getWeekMonday(localDateNow).plusDays(6);
                    }
                    localDateNow = localDatePlusDays;
                }
                if (localDateNow == null) {
                    localDateNow = LocalDate.now();
                }
                Intrinsics.checkNotNull(localDateNow);
                if (localDateNow.isAfter(LocalDate.now())) {
                    localDateNow = LocalDate.now();
                }
                Logger.d(this.logTag, "Parent createBundleForSwitchTab:" + this.localDateMap.get(Integer.valueOf(this.mPosition)) + ";localDate:" + localDateNow);
            } else {
                int i4 = this.mPrePosition;
                if (i4 == 1) {
                    LocalDate weekMonday = TimeDateUtil.getWeekMonday(localDateNow);
                    LocalDate localDatePlusDays2 = weekMonday.plusDays(6);
                    if ((!localDateMinusDays.isAfter(weekMonday) || !localDateMinusDays.isBefore(localDatePlusDays2)) && !localDateMinusDays.isEqual(weekMonday) && !localDateMinusDays.isEqual(localDatePlusDays2)) {
                        localDateMinusDays = localDatePlusDays2;
                    }
                } else if (i4 == 2) {
                    Intrinsics.checkNotNull(localDatePlusDays);
                    if (!TimeDateUtil.isSameMonth(localDateMinusDays, localDatePlusDays)) {
                        localDateMinusDays = TimeDateUtil.getFirstDayOfNextMonth(localDatePlusDays.plusMonths(1)).minusDays(1);
                    }
                }
            }
            localDateNow = localDateMinusDays;
            if (localDateNow == null) {
                localDateNow = LocalDate.now();
            }
            Intrinsics.checkNotNull(localDateNow);
            if (localDateNow.isAfter(LocalDate.now())) {
                localDateNow = LocalDate.now();
            }
            Logger.d(this.logTag, "Parent createBundleForSwitchTab:" + this.localDateMap.get(Integer.valueOf(this.mPosition)) + ";localDate:" + localDateNow);
        }
        if (fragment != null) {
            fragment.setMCurrentDate(localDateNow);
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("local_date", localDateNow);
        bundle.putString("did", this.mSid);
        bundle.putInt("sport_type", this.sportDataType);
        Logger.d(this.logTag, "Parent createBundleForSwitchTab: localDate = " + localDateNow);
        bindTitleBarAlphaView(localDateNow);
        return bundle;
    }

    public void expandBundle(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    public void expandPositionIfNeed() {
    }

    @Nullable
    public final ida getBinding() {
        return this.binding;
    }

    @Nullable
    public final LocalDate getCalendarDate() {
        return this.calendarDate;
    }

    @NotNull
    public abstract Class<?> getClassChild(int position);

    @Nullable
    public abstract String getClassChildName(int position);

    public abstract int getContentResourceId();

    @Nullable
    public final T getCurrentFragment() {
        return this.currentFragment;
    }

    public int getDefaultSportType() {
        return this.defaultSportType;
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

    @NotNull
    public final Map<Integer, LocalDate> getLocalDateMap() {
        return this.localDateMap;
    }

    public final int getMPosition() {
        return this.mPosition;
    }

    public final int getMPrePosition() {
        return this.mPrePosition;
    }

    @Nullable
    public final LocalDate getMSelectDate() {
        return this.mSelectDate;
    }

    @Nullable
    public final String getMSid() {
        return this.mSid;
    }

    @NotNull
    public final List<String> getMTabTitles() {
        return this.mTabTitles;
    }

    @NotNull
    public final Map<Integer, Integer> getPositionMap() {
        return this.positionMap;
    }

    public final int getRecoverTabPosition() {
        return this.recoverTabPosition;
    }

    @Nullable
    public final NestedScrollView getScrollView() {
        return this.scrollView;
    }

    public final int getSportDataType() {
        return this.sportDataType;
    }

    @Nullable
    public final TabLayout getTabLayout() {
        return this.tabLayout;
    }

    public final int getTabPosition() {
        return this.tabPosition;
    }

    public final int getTabType() {
        return this.tabType;
    }

    @Nullable
    public final TitleBarAlphaView getTitleBarAlphaView() {
        return this.titleBarAlphaView;
    }

    public void initContentView(@NotNull View contentView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
    }

    public void initPositionMap() {
        this.positionMap.clear();
        this.positionMap.put(0, 0);
        this.positionMap.put(1, 1);
        this.positionMap.put(2, 2);
    }

    public void initTab() {
        setTabType();
        setTabList();
        initTabList();
        switchTab(getClassChild(this.mPosition), getClassChildName(this.mPosition));
    }

    /* JADX INFO: renamed from: isFromCalendar, reason: from getter */
    public final boolean getIsFromCalendar() {
        return this.isFromCalendar;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        updateFilterSortViewWidth();
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
        ida idaVarA0 = ida.A0(inflater, container, false);
        this.binding = idaVarA0;
        Intrinsics.checkNotNull(idaVarA0);
        this.scrollView = idaVarA0.C;
        ida idaVar = this.binding;
        Intrinsics.checkNotNull(idaVar);
        this.titleBarAlphaView = idaVar.E;
        ida idaVar2 = this.binding;
        Intrinsics.checkNotNull(idaVar2);
        setFilterSortView(idaVar2.B);
        ida idaVar3 = this.binding;
        Intrinsics.checkNotNull(idaVar3);
        this.scrollView = idaVar3.C;
        ida idaVar4 = this.binding;
        Intrinsics.checkNotNull(idaVar4);
        this.tabLayout = idaVar4.D;
        ida idaVar5 = this.binding;
        Intrinsics.checkNotNull(idaVar5);
        return idaVar5.getRoot();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onNewIntent(@Nullable Bundle bundle) {
        super.onNewIntent(bundle);
        initParamsFromBundle(bundle);
        setFilterTab();
        switchTab(getClassChild(this.mPosition), getClassChildName(this.mPosition));
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt("key_tab", this.mPosition);
        outState.putInt(KEY_SECOND_TAB_SELECTED, this.tabPosition);
    }

    @Override // com.xiaomi.fitness.base.BaseDetailChildFragment.OnDateSelectChangedListener
    public void onSelectDateChanged(@Nullable LocalDate localDate) {
        Logger.d(this.logTag, "Parent onSelectDateChanged position " + this.mPosition + "; localDate " + localDate);
        this.localDateMap.put(Integer.valueOf(this.mPosition), localDate);
        bindTitleBarAlphaView(localDate);
    }

    @Override // com.xiaomi.fitness.base.BaseDetailChildFragment.OnDateSelectChangedListener
    public void onSelectStartEndDateChanged(@NotNull LocalDate startDate, @NotNull LocalDate endDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.localDateMap.put(Integer.valueOf(this.mPosition), endDate);
        bindTitleBarAlphaView(startDate, endDate);
    }

    @Override // defpackage.eah
    public void onShowCalendar() {
        Bundle bundleCreateBundleForCalendar = createBundleForCalendar();
        expandBundle(bundleCreateBundleForCalendar);
        HealthPrefer.INSTANCE.setCALENDAR_FRAGMENT_POSITION(-1);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        BaseFragmentExKt.goActivity$default(this, fragmentActivityRequireActivity, CalendarActivity.class, bundleCreateBundleForCalendar, null, 8, null);
    }

    @Override // com.xiaomi.fitness.base.BaseDetailChildFragment.OnDateSelectChangedListener
    public void onTitleBarJumpEnable(boolean enable) {
        TitleBarAlphaView titleBarAlphaView = this.titleBarAlphaView;
        if (titleBarAlphaView != null) {
            titleBarAlphaView.setTitleClickable(enable);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Integer numValueOf;
        Integer numValueOf2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        initPositionMap();
        if (savedInstanceState != null) {
            numValueOf = Integer.valueOf(savedInstanceState.getInt("key_tab", -1));
            numValueOf2 = Integer.valueOf(savedInstanceState.getInt(KEY_SECOND_TAB_SELECTED, -1));
        } else {
            numValueOf = null;
            numValueOf2 = null;
        }
        initView();
        if (numValueOf2 != null) {
            this.recoverTabPosition = numValueOf2.intValue();
        }
        if (numValueOf != null) {
            this.mPrePosition = this.mPosition;
            this.mPosition = numValueOf.intValue();
        }
        initTab();
        UploadFileManager uploadFileManagerExtKt = UploadFileManagerExtKt.getInstance(UploadFileManager.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        uploadFileManagerExtKt.popCommentIfNeed(fragmentActivityRequireActivity);
        updateFilterSortViewWidth();
        addSystemBarHeightPadding();
    }

    public final void setBinding(@Nullable ida idaVar) {
        this.binding = idaVar;
    }

    public final void setCalendarDate(@Nullable LocalDate localDate) {
        this.calendarDate = localDate;
    }

    public final void setCurrentFragment(@Nullable T t) {
        this.currentFragment = t;
    }

    public final void setFilterSortView(@NotNull FilterSortView filterSortView) {
        Intrinsics.checkNotNullParameter(filterSortView, "<set-?>");
        this.filterSortView = filterSortView;
    }

    public final void setFromCalendar(boolean z) {
        this.isFromCalendar = z;
    }

    public final void setMPosition(int i) {
        this.mPosition = i;
    }

    public final void setMPrePosition(int i) {
        this.mPrePosition = i;
    }

    public final void setMSelectDate(@Nullable LocalDate localDate) {
        this.mSelectDate = localDate;
    }

    public final void setMSid(@Nullable String str) {
        this.mSid = str;
    }

    public final void setPositionMap(@NotNull Map<Integer, Integer> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.positionMap = map;
    }

    public final void setRecoverTabPosition(int i) {
        this.recoverTabPosition = i;
    }

    public final void setScrollView(@Nullable NestedScrollView nestedScrollView) {
        this.scrollView = nestedScrollView;
    }

    public final void setSportDataType(int i) {
        this.sportDataType = i;
    }

    public final void setTabLayout(@Nullable TabLayout tabLayout) {
        this.tabLayout = tabLayout;
    }

    public void setTabLayoutList(@NotNull List<? extends TabLayout.g> tabList, boolean judgeShowContinueTab, boolean judgeShowFingerTab) {
        Intrinsics.checkNotNullParameter(tabList, "tabList");
        if (tabList.isEmpty()) {
            return;
        }
        for (TabLayout.g gVar : tabList) {
            TabLayout tabLayout = this.tabLayout;
            Intrinsics.checkNotNull(tabLayout);
            tabLayout.c(gVar);
        }
        initTabLayoutList();
        if (!judgeShowContinueTab) {
            TabLayout tabLayout2 = this.tabLayout;
            if (tabLayout2 != null) {
                tabLayout2.F(tabList.get(1));
            }
            switchTab(getClassChild(this.mPosition), getClassChildName(this.mPosition));
            TabLayout tabLayout3 = this.tabLayout;
            Intrinsics.checkNotNull(tabLayout3);
            tabLayout3.setVisibility(8);
            return;
        }
        TabLayout tabLayout4 = this.tabLayout;
        if (tabLayout4 != null) {
            tabLayout4.F(tabList.get(0));
        }
        if (judgeShowFingerTab) {
            this.tabPosition = 1;
            TabLayout tabLayout5 = this.tabLayout;
            if (tabLayout5 != null) {
                tabLayout5.F(tabList.get(1));
            }
        }
        int i = this.recoverTabPosition;
        if (i == 0 || i == 1) {
            TabLayout tabLayout6 = this.tabLayout;
            if (tabLayout6 != null) {
                tabLayout6.F(tabList.get(i));
            }
            this.recoverTabPosition = -1;
        }
        switchTab(getClassChild(this.mPosition), getClassChildName(this.mPosition));
        TabLayout tabLayout7 = this.tabLayout;
        Intrinsics.checkNotNull(tabLayout7);
        ViewExtKt.setVisible(tabLayout7, true);
    }

    public void setTabList() {
        ListExtKt.add(this.mTabTitles, getString(c0j.b7));
        ListExtKt.add(this.mTabTitles, getString(c0j.e7));
        ListExtKt.add(this.mTabTitles, getString(c0j.c7));
    }

    public final void setTabPosition(int i) {
        this.tabPosition = i;
    }

    public final void setTabType(int i) {
        this.tabType = i;
    }

    public final void setTitleBarAlphaView(@Nullable TitleBarAlphaView titleBarAlphaView) {
        this.titleBarAlphaView = titleBarAlphaView;
    }

    public void setTabType() {
        this.tabType = 0;
    }

    public final void bindTitleBarAlphaView(@Nullable LocalDate localDate) {
        String strC = l2c.c(getMActivity(), this.sportDataType);
        String titleDesc = getTitleDesc(localDate);
        TitleBarAlphaView titleBarAlphaView = this.titleBarAlphaView;
        Intrinsics.checkNotNull(titleBarAlphaView);
        titleBarAlphaView.bindData(strC, titleDesc);
        TitleBarAlphaView titleBarAlphaView2 = this.titleBarAlphaView;
        Intrinsics.checkNotNull(titleBarAlphaView2);
        titleBarAlphaView2.setOnTitleBarClickListener(this);
    }
}
