package com.xiaomi.hm.health.play.card.intelligence;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.bluetooth.profile.channel.module.todo.Todo;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.utils.easypermission.manager.SpaceItemDecoration;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.databinding.LayoutToolAlarmBinding;
import com.xiaomi.hm.health.device.HMNewToDoListActivity;
import com.xiaomi.hm.health.device.settings.todo.TodoListViewModel;
import com.xiaomi.hm.health.device.settings.todo.TodoUtils;
import com.xiaomi.hm.health.play.card.AbstractDeviceCardRender;
import com.xiaomi.hm.health.play.card.CardUiData;
import com.xiaomi.hm.health.play.card.intelligence.ToDoRender;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u0005H\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0018\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\b\u0010 \u001a\u00020\u0005H\u0016R\u001d\u0010&\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00067"}, d2 = {"Lcom/xiaomi/hm/health/play/card/intelligence/ToDoRender;", "Lcom/xiaomi/hm/health/play/card/AbstractDeviceCardRender;", "Lcom/xiaomi/hm/health/databinding/LayoutToolAlarmBinding;", "", "deviceNotConnected", "", "C", "", "position", "isDone", "v", "w", "x", "r", "", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", "todoList", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/play/card/CardUiData;", "uiParams", "initData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "rootView", "getLayoutViewBinding", "setCommonData", "setDeviceData", "onDeviceNotActive", "onDeviceNotConnected", "onClear", "Lcom/xiaomi/hm/health/device/settings/todo/TodoListViewModel;", hl.k, "Lkotlin/Lazy;", "t", "()Lcom/xiaomi/hm/health/device/settings/todo/TodoListViewModel;", "todoViewModel", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "l", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "loadingHelper", "Landroidx/fragment/app/FragmentActivity;", "m", "Landroidx/fragment/app/FragmentActivity;", "mActivity", "", GoogleApiAvailabilityLight.b, "Ljava/util/List;", "mTodoList", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ToDoRender extends AbstractDeviceCardRender<LayoutToolAlarmBinding> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy todoViewModel;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private LoadingDialogHelper loadingHelper;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private FragmentActivity mActivity;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private List<Todo> mTodoList;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function2<Integer, Boolean, Unit> {
        public a(ToDoRender toDoRender) {
            super(2, toDoRender, ToDoRender.class, "onDone", "onDone(IZ)V", 0);
        }

        public final void a(int i, boolean z) {
            ((ToDoRender) this.receiver).v(i, z);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Boolean bool) {
            a(num.intValue(), bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        public b(ToDoRender toDoRender) {
            super(1, toDoRender, ToDoRender.class, "onEdit", "onEdit(I)V", 0);
        }

        public final void a(int i) {
            ((ToDoRender) this.receiver).w(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "date", "Ljava/util/Calendar;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Long, Calendar> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Calendar invoke(@Nullable Long l) {
            if (l == null) {
                return null;
            }
            if (!(l.longValue() > 0)) {
                l = null;
            }
            if (l == null) {
                return null;
            }
            long jLongValue = l.longValue();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jLongValue);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            return calendar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Integer> {
        public final /* synthetic */ Todo a;
        public final /* synthetic */ Todo b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Todo todo, Todo todo2) {
            super(0);
            this.a = todo;
            this.b = todo2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer getA() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return Intrinsics.compare(this.a.getId(), this.b.getId());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"", "time", "Ljava/util/Calendar;", "dateCal", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function2<Long, Calendar, Calendar> {
        public static final e a = new e();

        public e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Calendar invoke(@Nullable Long l, @NotNull Calendar calendar) {
            if (l == null) {
                return null;
            }
            if (!(l.longValue() > 0)) {
                l = null;
            }
            if (l == null) {
                return null;
            }
            long jLongValue = l.longValue();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(jLongValue);
            calendar2.set(1, calendar.get(1));
            calendar2.set(2, calendar.get(2));
            calendar2.set(5, calendar.get(5));
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            return calendar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ToDoRender(@NotNull LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        final ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.play.card.intelligence.ToDoRender$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks2 = componentCallbacks;
                return companion.from((ViewModelStoreOwner) componentCallbacks2, componentCallbacks2 instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks2 : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.todoViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<TodoListViewModel>() { // from class: com.xiaomi.hm.health.play.card.intelligence.ToDoRender$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.device.settings.todo.TodoListViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final TodoListViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(componentCallbacks, qualifier, Reflection.getOrCreateKotlinClass(TodoListViewModel.class), function0, objArr);
            }
        });
        this.mTodoList = new ArrayList();
        if (lifecycleOwner instanceof FragmentActivity) {
            this.mActivity = (FragmentActivity) lifecycleOwner;
            this.loadingHelper = new LoadingDialogHelper((Activity) lifecycleOwner);
        }
        t().getTodoListLiveData().observe(lifecycleOwner, new Observer() { // from class: gp7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ToDoRender.p(this.a, (List) obj);
            }
        });
        t().getResultLiveData().observe(lifecycleOwner, new Observer() { // from class: fp7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ToDoRender.q(this.a, (Boolean) obj);
            }
        });
    }

    private final List<Todo> A(List<Todo> todoList) {
        return CollectionsKt___CollectionsKt.sortedWith(todoList, new Comparator() { // from class: hp7
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ToDoRender.B((Todo) obj, (Todo) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int B(Todo todo, Todo todo2) {
        d dVar = new d(todo, todo2);
        c cVar = c.a;
        e eVar = e.a;
        Calendar calendarInvoke = cVar.invoke(todo.getDate());
        Calendar calendarInvoke2 = cVar.invoke(todo2.getDate());
        if (calendarInvoke != null && calendarInvoke2 != null) {
            Calendar calendarInvoke3 = eVar.invoke(todo.getTime(), calendarInvoke);
            Calendar calendarInvoke4 = eVar.invoke(todo2.getTime(), calendarInvoke2);
            if (calendarInvoke3 != null && calendarInvoke4 != null) {
                return Intrinsics.areEqual(calendarInvoke3, calendarInvoke4) ? dVar.getA().intValue() : calendarInvoke3.compareTo(calendarInvoke4);
            }
            if (calendarInvoke3 == null) {
                if (calendarInvoke4 != null) {
                    return 1;
                }
                return Intrinsics.areEqual(calendarInvoke, calendarInvoke2) ? dVar.getA().intValue() : calendarInvoke.compareTo(calendarInvoke2);
            }
        } else if (calendarInvoke == null) {
            if (calendarInvoke2 != null) {
                return 1;
            }
            return dVar.getA().intValue();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void C(boolean deviceNotConnected) {
        LayoutToolAlarmBinding layoutToolAlarmBinding = (LayoutToolAlarmBinding) getBinding();
        layoutToolAlarmBinding.toolAlarmNotActive.setVisibility(deviceNotConnected ? 0 : 8);
        int size = this.mTodoList.size();
        layoutToolAlarmBinding.toolNoAlarm.setVisibility((deviceNotConnected || size > 0) ? 8 : 0);
        layoutToolAlarmBinding.toolAlarmRecycler.setVisibility((deviceNotConnected || size <= 0) ? 8 : 0);
        layoutToolAlarmBinding.toolAlarmMore.setVisibility((deviceNotConnected || size <= 4) ? 8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    public static final void p(ToDoRender toDoRender, List list) {
        int i;
        toDoRender.mTodoList.clear();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            Long l = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            Long completeTime = ((Todo) next).getCompleteTime();
            if (completeTime != null) {
                if (completeTime.longValue() > 0) {
                    l = completeTime;
                }
            }
            if (l == null) {
                arrayList.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            Todo todo = (Todo) obj;
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long completeTime2 = todo.getCompleteTime();
            if (completeTime2 == null) {
                completeTime2 = null;
            } else if (!(completeTime2.longValue() > 0)) {
                completeTime2 = null;
            }
            if (completeTime2 != null) {
                i = 4;
            } else {
                Long date = todo.getDate();
                if (date == null) {
                    date = null;
                } else if (!(date.longValue() > 0)) {
                    date = null;
                }
                if (date == null) {
                    i = 3;
                } else {
                    TodoUtils todoUtils = TodoUtils.INSTANCE;
                    i = todoUtils.isExpired(jCurrentTimeMillis, todo) ? 0 : todoUtils.isToday(jCurrentTimeMillis, todo) ? 1 : 2;
                }
            }
            Integer numValueOf = Integer.valueOf(i);
            Object arrayList2 = linkedHashMap.get(numValueOf);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        SortedMap sortedMap = q.toSortedMap(linkedHashMap, new Comparator() { // from class: ip7
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ToDoRender.u((Integer) obj2, (Integer) obj3);
            }
        });
        ArrayList arrayList3 = new ArrayList(sortedMap.size());
        Iterator it3 = sortedMap.entrySet().iterator();
        while (it3.hasNext()) {
            arrayList3.add(toDoRender.A((List) ((Map.Entry) it3.next()).getValue()));
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            toDoRender.mTodoList.addAll((List) it4.next());
        }
        toDoRender.updateUi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(ToDoRender toDoRender, Boolean bool) {
        LoadingDialogHelper loadingDialogHelper = toDoRender.loadingHelper;
        if (loadingDialogHelper != null) {
            loadingDialogHelper.hideLoading();
        }
        if (bool.booleanValue()) {
            return;
        }
        toDoRender.updateUi();
    }

    private final boolean r() {
        if (!t().isFull()) {
            return true;
        }
        FragmentActivity fragmentActivity = this.mActivity;
        if (fragmentActivity != null) {
            new AlertDialogFragment.Builder(fragmentActivity).setMessage(fragmentActivity.getResources().getQuantityString(R.plurals.todo_list_tips_max, t().getMaxCount(), Integer.valueOf(t().getMaxCount()))).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: cp7
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ToDoRender.s(dialogInterface, i);
                }
            }).create().show(fragmentActivity.getSupportFragmentManager());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    private final TodoListViewModel t() {
        return (TodoListViewModel) this.todoViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int u(Integer num, Integer num2) {
        return num.intValue() - num2.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(int position, boolean isDone) {
        Todo todo = this.mTodoList.get(position);
        LoadingDialogHelper loadingDialogHelper = this.loadingHelper;
        if (loadingDialogHelper != null) {
            loadingDialogHelper.showLoading(R.string.play_tool_syncing);
        }
        if (isDone) {
            t().done(todo);
        } else {
            t().addOrUpdate(todo.copy((158 & 1) != 0 ? todo.id : 0L, (158 & 2) != 0 ? todo.content : null, (158 & 4) != 0 ? todo.source : null, (158 & 8) != 0 ? todo.date : null, (158 & 16) != 0 ? todo.time : null, (158 & 32) != 0 ? todo.repeat : 0, (158 & 64) != 0 ? todo.completeTime : null, (158 & 128) != 0 ? todo.firstRemind : null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(int position) {
        FragmentActivity fragmentActivity = this.mActivity;
        if (fragmentActivity == null) {
            return;
        }
        HMNewToDoListActivity.INSTANCE.actionToTodoEdit(fragmentActivity, this.mTodoList.get(position));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void x() {
        LayoutToolAlarmBinding layoutToolAlarmBinding = (LayoutToolAlarmBinding) getBinding();
        layoutToolAlarmBinding.toolAlarmMore.setOnClickListener(new View.OnClickListener() { // from class: ep7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToDoRender.y(this.a, view);
            }
        });
        layoutToolAlarmBinding.toolAlarmAdd.setOnClickListener(new View.OnClickListener() { // from class: dp7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToDoRender.z(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(ToDoRender toDoRender, View view) {
        FragmentActivity fragmentActivity = toDoRender.mActivity;
        if (fragmentActivity == null) {
            return;
        }
        fragmentActivity.startActivity(new Intent(fragmentActivity, (Class<?>) HMNewToDoListActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(ToDoRender toDoRender, View view) {
        FragmentActivity fragmentActivity = toDoRender.mActivity;
        if (fragmentActivity == null) {
            return;
        }
        if (!toDoRender.isConnected()) {
            toDoRender.showDeviceNotConnectTip(fragmentActivity);
        } else if (toDoRender.r()) {
            HMNewToDoListActivity.INSTANCE.actionToTodoAdd(fragmentActivity);
        }
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void initData(@NotNull Context context, @NotNull CardUiData uiParams) {
        super.initData(context, uiParams);
        t().loadData();
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender, com.xiaomi.hm.health.play.card.AbstractCardRender, com.xiaomi.hm.health.play.card.ICardRender
    public void onClear() {
        super.onClear();
        t().getTodoListLiveData().removeObservers(getLifecycleOwner());
        t().getResultLiveData().removeObservers(getLifecycleOwner());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void onDeviceNotActive() {
        ((LayoutToolAlarmBinding) getBinding()).toolAlarmNotActive.setText(R.string.play_device_not_active);
        C(true);
        ((LayoutToolAlarmBinding) getBinding()).toolAlarmAdd.setClickable(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void onDeviceNotConnected() {
        ((LayoutToolAlarmBinding) getBinding()).toolAlarmNotActive.setText(R.string.training_playing_hr_exception_device_disconnect);
        C(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void setCommonData(@NotNull Context context, @NotNull CardUiData uiParams) {
        LayoutToolAlarmBinding layoutToolAlarmBinding = (LayoutToolAlarmBinding) getBinding();
        layoutToolAlarmBinding.toolAlarm.setText(context.getResources().getString(R.string.device_todo));
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.play_icon_todo);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            layoutToolAlarmBinding.toolAlarm.setCompoundDrawables(drawable, null, null, null);
        }
        layoutToolAlarmBinding.toolNoAlarm.setText(context.getResources().getString(R.string.play_tool_no_todo));
        x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void setDeviceData(@NotNull final Context context, @NotNull CardUiData uiParams) {
        LayoutToolAlarmBinding layoutToolAlarmBinding = (LayoutToolAlarmBinding) getBinding();
        C(false);
        layoutToolAlarmBinding.toolAlarmRecycler.setAdapter(new TodoAdapter(context, this.mTodoList.size() > 4 ? this.mTodoList.subList(0, 4) : this.mTodoList, new a(this), new b(this)));
        layoutToolAlarmBinding.toolAlarmRecycler.setLayoutManager(new LinearLayoutManager(context) { // from class: com.xiaomi.hm.health.play.card.intelligence.ToDoRender$setDeviceData$1$1
            public final /* synthetic */ Context a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context);
                this.a = context;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        if (layoutToolAlarmBinding.toolAlarmRecycler.getItemDecorationCount() == 0) {
            layoutToolAlarmBinding.toolAlarmRecycler.addItemDecoration(new SpaceItemDecoration((int) ViewUtils.dp2px(context, 10.0f)));
        }
        ((LayoutToolAlarmBinding) getBinding()).toolAlarmAdd.setClickable(true);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    @NotNull
    public LayoutToolAlarmBinding getLayoutViewBinding(@NotNull LayoutInflater inflater, @NotNull ViewGroup rootView) {
        return LayoutToolAlarmBinding.inflate(inflater, rootView, true);
    }
}
