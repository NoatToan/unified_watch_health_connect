package com.xiaomi.fitness.habit.ui;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.example.habit.export.HabitBean;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.habit.bean.AddHabitDayBean;
import com.xiaomi.fitness.habit.ui.AddHabitActivity;
import com.xiaomi.fitness.habit.utils.UtilsKt;
import com.xiaomi.fitness.habit.widget.HabitTimePickerDialog;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.b0j;
import defpackage.hfb;
import defpackage.iui;
import defpackage.nhi;
import defpackage.nni;
import defpackage.pxi;
import defpackage.t64;
import defpackage.v84;
import defpackage.ydb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 I2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001IB\u0007¢\u0006\u0004\bH\u0010\u000bJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u000bJ\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u000bJ\u0013\u0010\u001b\u001a\u00020\u0007*\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\u000bJ\u0017\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R(\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0.0-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R!\u00108\u001a\b\u0012\u0004\u0012\u0002030-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001f\u0010@\u001a\r\u0012\t\u0012\u00070:¢\u0006\u0002\b=098BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010BR\u0014\u0010G\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010B¨\u0006J"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/AddHabitActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/habit/ui/AddHabitViewModel;", "Lydb;", "Landroid/view/View$OnClickListener;", "Lcom/example/habit/export/HabitBean;", "habitBean", "", "initViewData", "(Lcom/example/habit/export/HabitBean;)V", "initDayListView", "()V", "", "weekdays", "index", "", "isWeekdaysTrue", "(II)Z", "initTimeListView", MedicalIdSPContract.PREF_FIRST, "second", "isContains", "addHabitWithSyncCalendar", "isSaveCalendar", "realAddHabit", "(Z)V", "setLayoutManager", "bindView", "(Lydb;)V", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "addSuccess", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/example/habit/export/HabitBean;", "Lcom/xiaomi/fitness/habit/ui/AddHabitDayAdapter;", "habitDayAdapter", "Lcom/xiaomi/fitness/habit/ui/AddHabitDayAdapter;", "Lcom/xiaomi/fitness/habit/ui/AddHabitTimeAdapter;", "habitTimeAdapter", "Lcom/xiaomi/fitness/habit/ui/AddHabitTimeAdapter;", "", "Lkotlin/Pair;", "timeList", "Ljava/util/List;", "isAddedHabit", "Z", "Lcom/xiaomi/fitness/habit/bean/AddHabitDayBean;", "dayList$delegate", "Lkotlin/Lazy;", "getDayList", "()Ljava/util/List;", "dayList", "", "", "permissions", "[Ljava/lang/String;", "Lkotlin/jvm/internal/EnhancedNullability;", "getPermissionDescArray", "()[Ljava/lang/String;", "permissionDescArray", "getColCountPerRow", "()I", "colCountPerRow", "getViewModelId", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAddHabitActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddHabitActivity.kt\ncom/xiaomi/fitness/habit/ui/AddHabitActivity\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,400:1\n54#2,3:401\n24#2:404\n59#2,6:405\n13402#3,2:411\n1863#4,2:413\n1863#4,2:415\n*S KotlinDebug\n*F\n+ 1 AddHabitActivity.kt\ncom/xiaomi/fitness/habit/ui/AddHabitActivity\n*L\n89#1:401,3\n89#1:404\n89#1:405,6\n176#1:411,2\n271#1:413,2\n197#1:415,2\n*E\n"})
public final class AddHabitActivity extends Hilt_AddHabitActivity<AddHabitViewModel, ydb> implements View.OnClickListener {

    @NotNull
    public static final String sData = "sData";
    public static final int sMaxTime = 8;

    @NotNull
    public static final String sTag = "AddHabigFragment";
    public static final int sTypeNone = -1;
    public static final int sTypeRest = 9;
    public static final int sTypeWork = 8;

    @Nullable
    private AddHabitDayAdapter habitDayAdapter;

    @Nullable
    private AddHabitTimeAdapter habitTimeAdapter;
    private boolean isAddedHabit;

    @NotNull
    private HabitBean habitBean = new HabitBean();

    @NotNull
    private List<Pair<Integer, Integer>> timeList = new ArrayList();

    /* JADX INFO: renamed from: dayList$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dayList = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ks0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AddHabitActivity.dayList_delegate$lambda$0(this.f24245a);
        }
    });

    @NotNull
    private final String[] permissions = {"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"};

    private final void addHabitWithSyncCalendar() {
        if (!PermissionsUtil.shouldRequestPermission(this.permissions)) {
            realAddHabit(true);
            return;
        }
        if (PermissionExtKt.supportMiuiPermissionEnable()) {
            String[] strArr = this.permissions;
            PermissionExtKt.permissions(this, (String[]) Arrays.copyOf(strArr, strArr.length), getPermissionDescArray(), (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: es0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AddHabitActivity.addHabitWithSyncCalendar$lambda$12(this.f17009a, (MultiplePermissionsBuilder) obj);
                }
            });
            return;
        }
        String string = getString(b0j.K);
        String string2 = getString(b0j.I);
        int i = b0j.common_allow;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        UtilsKt.showMsgDialog(string, string2, i, supportFragmentManager, b0j.common_reject, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: fs0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddHabitActivity.addHabitWithSyncCalendar$lambda$16(this.f18140a, (DialogInterface) obj);
            }
        }, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: gs0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddHabitActivity.addHabitWithSyncCalendar$lambda$17(this.f19285a, (DialogInterface) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addHabitWithSyncCalendar$lambda$12(final AddHabitActivity this$0, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        permissions.allGranted(new Function0() { // from class: vr0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AddHabitActivity.addHabitWithSyncCalendar$lambda$12$lambda$10(this.f37147a);
            }
        });
        permissions.denied(new Function1() { // from class: cs0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddHabitActivity.addHabitWithSyncCalendar$lambda$12$lambda$11(this.f14663a, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addHabitWithSyncCalendar$lambda$12$lambda$10(AddHabitActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.realAddHabit(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addHabitWithSyncCalendar$lambda$12$lambda$11(AddHabitActivity this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.realAddHabit(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addHabitWithSyncCalendar$lambda$16(final AddHabitActivity this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String[] strArr = this$0.permissions;
        PermissionExtKt.permissions(this$0, (String[]) Arrays.copyOf(strArr, strArr.length), this$0.getPermissionDescArray(), (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: ds0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddHabitActivity.addHabitWithSyncCalendar$lambda$16$lambda$15(this.f15860a, (MultiplePermissionsBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addHabitWithSyncCalendar$lambda$16$lambda$15(final AddHabitActivity this$0, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        permissions.allGranted(new Function0() { // from class: wr0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AddHabitActivity.addHabitWithSyncCalendar$lambda$16$lambda$15$lambda$13(this.f38265a);
            }
        });
        permissions.denied(new Function1() { // from class: xr0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddHabitActivity.addHabitWithSyncCalendar$lambda$16$lambda$15$lambda$14(this.f39375a, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addHabitWithSyncCalendar$lambda$16$lambda$15$lambda$13(AddHabitActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.realAddHabit(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addHabitWithSyncCalendar$lambda$16$lambda$15$lambda$14(AddHabitActivity this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.realAddHabit(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addHabitWithSyncCalendar$lambda$17(AddHabitActivity this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.realAddHabit(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2(AddHabitActivity this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.habitBean.syncCalendar = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$3(AddHabitActivity this$0, HabitBean habitBean) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(habitBean, "habitBean");
        this$0.hideLoading();
        this$0.initViewData(habitBean);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4(AddHabitActivity this$0, String msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this$0.hideLoading();
        ToastUtil.showShortToast(msg);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List dayList_delegate$lambda$0(AddHabitActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ArrayList arrayList = new ArrayList();
        String[] stringArray = this$0.getResources().getStringArray(nhi.f27939a);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        int length = stringArray.length;
        for (int i = 0; i < length; i++) {
            String str = stringArray[i];
            Intrinsics.checkNotNullExpressionValue(str, "get(...)");
            arrayList.add(new AddHabitDayBean(i, str, false));
        }
        arrayList.add(new AddHabitDayBean(-1, "", false));
        String string = AppUtil.getApp().getString(b0j.h);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        arrayList.add(new AddHabitDayBean(8, string, false));
        String string2 = AppUtil.getApp().getString(b0j.f);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        arrayList.add(new AddHabitDayBean(9, string2, false));
        return arrayList;
    }

    private final int getColCountPerRow() {
        Application application;
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded()) {
            return 12;
        }
        UIUtils uIUtils = UIUtils.INSTANCE;
        return (uIUtils.isTablet() && (application = getApplication()) != null && uIUtils.isLandscape(application)) ? 12 : 4;
    }

    private final List<AddHabitDayBean> getDayList() {
        return (List) this.dayList.getValue();
    }

    private final String[] getPermissionDescArray() {
        return new String[]{getApplication().getString(b0j.T), " "};
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initDayListView() {
        this.habitDayAdapter = new AddHabitDayAdapter(this, getDayList(), new Function1() { // from class: yr0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddHabitActivity.initDayListView$lambda$7(this.f40444a, (AddHabitDayBean) obj);
            }
        });
        ((ydb) getMBinding()).E.setAdapter(this.habitDayAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initDayListView$lambda$7(AddHabitActivity this$0, AddHabitDayBean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getType() != -1) {
            int type = it.getType();
            if (type == 8 || type == 9) {
                Iterator<T> it2 = this$0.getDayList().iterator();
                while (it2.hasNext()) {
                    ((AddHabitDayBean) it2.next()).setSelected(false);
                }
            } else {
                this$0.getDayList().get(CollectionsKt__CollectionsKt.getLastIndex(this$0.getDayList())).setSelected(false);
                this$0.getDayList().get(CollectionsKt__CollectionsKt.getLastIndex(this$0.getDayList()) - 1).setSelected(false);
            }
            it.setSelected(!it.getIsSelected());
        }
        AddHabitDayAdapter addHabitDayAdapter = this$0.habitDayAdapter;
        if (addHabitDayAdapter != null) {
            addHabitDayAdapter.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initTimeListView() {
        this.timeList.add(new Pair<>(-1, -1));
        this.habitTimeAdapter = new AddHabitTimeAdapter(this, this.timeList, new Function1() { // from class: hs0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddHabitActivity.initTimeListView$lambda$8(this.f20390a, (Unit) obj);
            }
        });
        ((ydb) getMBinding()).L.setAdapter(this.habitTimeAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initTimeListView$lambda$8(final AddHabitActivity this$0, Unit it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        final HabitTimePickerDialog habitTimePickerDialogCreate = HabitTimePickerDialog.INSTANCE.defaultBuilder("add time switcher").setDialogTitle(b0j.H).setNegativeText(b0j.f3655b).setPositiveText(b0j.c).create();
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        habitTimePickerDialogCreate.setCurrentHour(calendar.get(11));
        habitTimePickerDialogCreate.setCurrentMinute(calendar.get(12));
        habitTimePickerDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.habit.ui.AddHabitActivity$initTimeListView$1$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                        return;
                    }
                    return;
                }
                if (which != -1) {
                    return;
                }
                int currentHour = habitTimePickerDialogCreate.getCurrentHour();
                int currentMinute = habitTimePickerDialogCreate.getCurrentMinute();
                if (this$0.isContains(currentHour, currentMinute)) {
                    if (dialog != null) {
                        dialog.dismiss();
                        return;
                    }
                    return;
                }
                this$0.timeList.remove(CollectionsKt__CollectionsKt.getLastIndex(this$0.timeList));
                this$0.timeList.add(new Pair(Integer.valueOf(currentHour), Integer.valueOf(currentMinute)));
                Collections.sort(this$0.timeList, new Comparator<Pair<? extends Integer, ? extends Integer>>() { // from class: com.xiaomi.fitness.habit.ui.AddHabitActivity$initTimeListView$1$1$onDialogClick$1
                    @Override // java.util.Comparator
                    public /* bridge */ /* synthetic */ int compare(Pair<? extends Integer, ? extends Integer> pair, Pair<? extends Integer, ? extends Integer> pair2) {
                        return compare2((Pair<Integer, Integer>) pair, (Pair<Integer, Integer>) pair2);
                    }

                    /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
                    public int compare2(Pair<Integer, Integer> p0, Pair<Integer, Integer> p1) {
                        Intrinsics.checkNotNull(p0);
                        int iIntValue = p0.getFirst().intValue();
                        Intrinsics.checkNotNull(p1);
                        int iIntValue2 = iIntValue - p1.getFirst().intValue();
                        return iIntValue2 == 0 ? p0.getSecond().intValue() - p1.getSecond().intValue() : iIntValue2;
                    }
                });
                if (this$0.timeList.size() < 8) {
                    this$0.timeList.add(new Pair(-1, -1));
                }
                AddHabitTimeAdapter addHabitTimeAdapter = this$0.habitTimeAdapter;
                if (addHabitTimeAdapter != null) {
                    addHabitTimeAdapter.notifyDataSetChanged();
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        habitTimePickerDialogCreate.showIfNeed(this$0.getSupportFragmentManager());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initViewData(HabitBean habitBean) {
        this.habitBean = habitBean;
        ((ydb) getMBinding()).N.setText(habitBean.name);
        ((ydb) getMBinding()).C.setText(habitBean.appBref);
        if (!this.isAddedHabit) {
            TextView textView = ((ydb) getMBinding()).I;
            Resources resources = getResources();
            int i = pxi.f30880b;
            int i2 = habitBean.totalInsist;
            textView.setText(resources.getQuantityString(i, i2, Integer.valueOf(i2)));
        } else if (habitBean.continuousPunch != 0) {
            TextView textView2 = ((ydb) getMBinding()).I;
            Resources resources2 = getResources();
            int i3 = pxi.f30879a;
            int i4 = habitBean.continuousPunch;
            textView2.setText(resources2.getQuantityString(i3, i4, Integer.valueOf(i4)));
        } else {
            ((ydb) getMBinding()).I.setText(getString(b0j.t));
        }
        int i5 = habitBean.clockMode;
        if (i5 == 1) {
            for (int i6 = 0; i6 < 7; i6++) {
                getDayList().get(i6).setSelected(true);
            }
        } else if (i5 == 2) {
            getDayList().get(CollectionsKt__CollectionsKt.getLastIndex(getDayList()) - 1).setSelected(true);
        } else if (i5 == 3) {
            getDayList().get(CollectionsKt__CollectionsKt.getLastIndex(getDayList())).setSelected(true);
        } else if (i5 == 5) {
            for (int i7 = 0; i7 < 7; i7++) {
                getDayList().get(i7).setSelected(isWeekdaysTrue(habitBean.weekDays, i7));
            }
        }
        AddHabitDayAdapter addHabitDayAdapter = this.habitDayAdapter;
        if (addHabitDayAdapter != null) {
            addHabitDayAdapter.notifyDataSetChanged();
        }
        t64[] times = habitBean.getTimes();
        Arrays.sort(times, new Comparator<t64>() { // from class: com.xiaomi.fitness.habit.ui.AddHabitActivity.initViewData.1
            @Override // java.util.Comparator
            public int compare(t64 p0, t64 p1) {
                Intrinsics.checkNotNull(p0);
                int i8 = p0.c;
                Intrinsics.checkNotNull(p1);
                int i9 = i8 - p1.c;
                return i9 == 0 ? p0.d - p1.d : i9;
            }
        });
        if (times != null) {
            this.timeList.clear();
            for (t64 t64Var : times) {
                this.timeList.add(new Pair<>(Integer.valueOf(t64Var.c), Integer.valueOf(t64Var.d)));
            }
            if (this.timeList.size() < 8) {
                this.timeList.add(new Pair<>(-1, -1));
            }
            AddHabitTimeAdapter addHabitTimeAdapter = this.habitTimeAdapter;
            if (addHabitTimeAdapter != null) {
                addHabitTimeAdapter.notifyDataSetChanged();
            }
        }
        ((ydb) getMBinding()).D.setChecked(habitBean.syncCalendar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isContains(int first, int second) {
        Iterator<T> it = this.timeList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (((Number) pair.getFirst()).intValue() == first && ((Number) pair.getSecond()).intValue() == second) {
                return true;
            }
        }
        return false;
    }

    private final boolean isWeekdaysTrue(int weekdays, int index) {
        return ((weekdays >> index) & 1) == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void realAddHabit(boolean isSaveCalendar) {
        showLoading();
        ((AddHabitViewModel) getMViewModel()).addHabit(this.habitBean, getDayList(), this.timeList, isSaveCalendar, new Function0() { // from class: is0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AddHabitActivity.realAddHabit$lambda$18(this.f22032a);
            }
        }, new Function1() { // from class: js0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddHabitActivity.realAddHabit$lambda$19(this.f23078a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit realAddHabit$lambda$18(AddHabitActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        this$0.addSuccess();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit realAddHabit$lambda$19(AddHabitActivity this$0, String msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this$0.dismissDialogForce();
        ToastUtil.showShortToast(msg);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setLayoutManager() {
        ((ydb) getMBinding()).E.addItemDecoration(new CustomerItemDecoration(getColCountPerRow(), ExtUtilsKt.getDp(Float.valueOf(16.0f)), false));
        RecyclerView recyclerView = ((ydb) getMBinding()).E;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, getColCountPerRow());
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.habit.ui.AddHabitActivity$setLayoutManager$1$1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                return 1;
            }
        });
        recyclerView.setLayoutManager(gridLayoutManager);
        UIUtils uIUtils = UIUtils.INSTANCE;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        boolean zIsSmallScreen = uIUtils.isSmallScreen(application);
        int colCountPerRow = zIsSmallScreen ? 3 : getColCountPerRow();
        hfb.d("isSmallScreen:" + zIsSmallScreen + "  timeSize:" + colCountPerRow);
        RecyclerView recyclerView2 = ((ydb) getMBinding()).L;
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(this, colCountPerRow);
        gridLayoutManager2.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.habit.ui.AddHabitActivity$setLayoutManager$2$1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                return 1;
            }
        });
        recyclerView2.setLayoutManager(gridLayoutManager2);
    }

    public final void addSuccess() {
        setResult(-1);
        startActivity(new Intent(this, (Class<?>) HabitTodayActivity.class));
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull ydb ydbVar) {
        Intrinsics.checkNotNullParameter(ydbVar, "<this>");
        Parcelable parcelableExtra = getIntent().getParcelableExtra("sData");
        Intrinsics.checkNotNull(parcelableExtra);
        this.habitBean = (HabitBean) parcelableExtra;
        setActionBarDisplayable(false);
        v84.i(((ydb) getMBinding()).M, 0, v84.e(this), 0, 0);
        ImageView logoView = ((ydb) getMBinding()).H;
        Intrinsics.checkNotNullExpressionValue(logoView, "logoView");
        String str = this.habitBean.bigIcon;
        ImageLoader imageLoader = Coil.imageLoader(logoView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(logoView.getContext()).data(str).target(logoView);
        builderTarget.placeholder(nni.f28090a);
        imageLoader.enqueue(builderTarget.build());
        initDayListView();
        initTimeListView();
        setLayoutManager();
        ((ydb) getMBinding()).B.setOnClickListener(this);
        ((ydb) getMBinding()).F.setContentDescription(getString(b0j.V));
        ((ydb) getMBinding()).F.setOnClickListener(this);
        ((ydb) getMBinding()).G.setContentDescription(getString(b0j.N));
        ((ydb) getMBinding()).G.setOnClickListener(this);
        ((ydb) getMBinding()).D.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: zr0
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                AddHabitActivity.bindView$lambda$2(this.f41587a, z, iSwitchButton);
            }
        });
        boolean z = this.habitBean.added;
        this.isAddedHabit = z;
        if (z) {
            ydbVar.B.setText(b0j.f3657r);
            showLoading();
            ((AddHabitViewModel) getMViewModel()).habitDetail(this.habitBean, new Function1() { // from class: as0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AddHabitActivity.bindView$lambda$3(this.f3399a, (HabitBean) obj);
                }
            }, new Function1() { // from class: bs0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AddHabitActivity.bindView$lambda$4(this.f4528a, (String) obj);
                }
            });
            return;
        }
        TextView textView = ydbVar.I;
        Resources resources = getResources();
        int i = pxi.f30880b;
        int i2 = this.habitBean.totalInsist;
        textView.setText(resources.getQuantityString(i, i2, Integer.valueOf(i2)));
        ydbVar.B.setText(b0j.F);
        initViewData(this.habitBean);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return iui.f22103a;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v) {
        if (Intrinsics.areEqual(v, ((ydb) getMBinding()).B)) {
            if (this.timeList.size() <= 1) {
                ToastUtil.showShortToast(b0j.g);
                return;
            } else if (this.habitBean.syncCalendar) {
                addHabitWithSyncCalendar();
                return;
            } else {
                realAddHabit(false);
                return;
            }
        }
        if (Intrinsics.areEqual(v, ((ydb) getMBinding()).F)) {
            finish();
            return;
        }
        if (Intrinsics.areEqual(v, ((ydb) getMBinding()).G)) {
            Intent intent = new Intent(this, (Class<?>) HabitShareActivity.class);
            intent.putExtra(HabitShareActivity.KEY_HABIT_NAME, this.habitBean.name);
            intent.putExtra(HabitShareActivity.KEY_BIG_ICON, this.habitBean.bigIcon);
            intent.putExtra(HabitShareActivity.KEY_CONTINUESPUNCH, this.habitBean.continuousPunch);
            startActivity(intent);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        setLayoutManager();
    }
}
