package com.xiaomi.fitness.devicesettings.bluttooth.todo.remind;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.SafeDBUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.devicesettings.base.ActionBarParamBuilder;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.TodoRemindFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.adapter.TodoRemindAdapter;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.data.TodoRemindItem;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.av6;
import defpackage.cji;
import defpackage.eui;
import defpackage.jni;
import defpackage.p14;
import defpackage.qyi;
import defpackage.wc0;
import defpackage.wzi;
import defpackage.ym6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u00016\u0018\u0000 :2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001:B\u0007¢\u0006\u0004\b9\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u00042\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0006J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u0006J)\u0010$\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00122\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J!\u0010*\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0004H\u0014¢\u0006\u0004\b,\u0010\u0006J\u000f\u0010-\u001a\u00020\fH\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u0010\u0006R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/TodoRemindFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/TodoRemindViewModel;", "Lym6;", "", Constants.KEY_REQUEST_DATA, "()V", "", "it", "onReceiveMarkFromDevice", "(Ljava/lang/Object;)V", "Lkotlin/Pair;", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/data/TodoRemindItem;", "pair", "onMarkResult", "(Lkotlin/Pair;)V", "", "", "onDeleteResult", "list", "onRemindListDataResult", "(Ljava/util/List;)V", "onTodoDeleteClick", "showDeleteDialog", "onTodoAddClick", "initTodoRecyclerView", "editModeStatus", "refreshViewWhenEditModeChange", "(Z)V", "initTitleView", "onAllButtonClick", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "onBackPressed", "()Z", "onDestroyView", "Landroidx/recyclerview/widget/RecyclerView;", "todoRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/adapter/TodoRemindAdapter;", "todoRemindAdapter", "Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/adapter/TodoRemindAdapter;", "com/xiaomi/fitness/devicesettings/bluttooth/todo/remind/TodoRemindFragment$deviceMarkBroadcastReceiver$1", "deviceMarkBroadcastReceiver", "Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/TodoRemindFragment$deviceMarkBroadcastReceiver$1;", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTodoRemindFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodoRemindFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/TodoRemindFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,349:1\n360#2,7:350\n360#2,7:357\n360#2,7:364\n827#2:371\n855#2,2:372\n774#2:374\n865#2,2:375\n1#3:377\n*S KotlinDebug\n*F\n+ 1 TodoRemindFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/TodoRemindFragment\n*L\n73#1:350,7\n129#1:357,7\n143#1:364,7\n163#1:371\n163#1:372,2\n219#1:374\n219#1:375,2\n*E\n"})
public final class TodoRemindFragment extends BaseBindingFragment<TodoRemindViewModel, ym6> {

    @NotNull
    public static final String DEVICE_MARK_ACTION = "todo_mark_from_device_broadcast";

    @NotNull
    public static final String EXTRA_TODO_ID = "todoId";

    @NotNull
    public static final String EXTRA_TODO_SOURCE = "todoSource";

    @NotNull
    public static final String EXTRA_TODO_STATUS = "todoStatus";

    @NotNull
    public static final String EXTRA_TODO_UPDATE_TIME = "todoUpdateTime";
    public static final int REQ_CODE = 100;
    public static final int RESULT_CODE_EDIT = 10;

    @NotNull
    public static final String TAG = "TodoRemindUiLog";

    @NotNull
    private final TodoRemindFragment$deviceMarkBroadcastReceiver$1 deviceMarkBroadcastReceiver;
    private RecyclerView todoRecyclerView;
    private TodoRemindAdapter todoRemindAdapter;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.TodoRemindFragment$deviceMarkBroadcastReceiver$1] */
    public TodoRemindFragment() {
        super(eui.X1);
        this.deviceMarkBroadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.TodoRemindFragment$deviceMarkBroadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, TodoRemindFragment.DEVICE_MARK_ACTION)) {
                    int intExtra = intent.getIntExtra(TodoRemindFragment.EXTRA_TODO_ID, -1);
                    int intExtra2 = intent.getIntExtra(TodoRemindFragment.EXTRA_TODO_SOURCE, -1);
                    int intExtra3 = intent.getIntExtra(TodoRemindFragment.EXTRA_TODO_STATUS, -1);
                    long longExtra = intent.getLongExtra(TodoRemindFragment.EXTRA_TODO_UPDATE_TIME, -1L);
                    Logger.i("TodoRemindUiLog", "deviceMarkBroadcastReceiver onReceive id=" + intExtra + ";source=" + intExtra2 + ";status=" + intExtra3 + ";updateTime=" + longExtra);
                    if (intExtra < 0 || intExtra2 < 0 || intExtra3 < 0 || longExtra < 0) {
                        return;
                    }
                    TodoRemindFragment todoRemindFragment = this.this$0;
                    p14.c cVar = new p14.c();
                    cVar.c = intExtra;
                    cVar.d = intExtra2;
                    cVar.e = intExtra3;
                    cVar.f = longExtra;
                    todoRemindFragment.onReceiveMarkFromDevice(cVar);
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ TodoRemindViewModel access$getMViewModel(TodoRemindFragment todoRemindFragment) {
        return (TodoRemindViewModel) todoRemindFragment.getMViewModel();
    }

    private final void initTitleView() {
        View endView;
        setTitleBackground(cji.y);
        setTitle(wzi.w8);
        IActionBar.DefaultImpls.applyEditModeActionBar$default(this, new ActionBarParamBuilder().setStartView(jni.Q0).setEndView(jni.Q).create(), new Function1() { // from class: shp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TodoRemindFragment.initTitleView$lambda$13(this.f33654a, (View) obj);
            }
        }, new Function1() { // from class: thp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TodoRemindFragment.initTitleView$lambda$14(this.f34715a, (View) obj);
            }
        }, null, null, 24, null);
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar == null || (endView = miuiActionBar.getEndView()) == null) {
            return;
        }
        endView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initTitleView$lambda$13(TodoRemindFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initTitleView$lambda$14(TodoRemindFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onAllButtonClick();
        return Unit.INSTANCE;
    }

    private final void initTodoRecyclerView() {
        this.todoRecyclerView = getMBinding().C;
        this.todoRemindAdapter = new TodoRemindAdapter();
        RecyclerView recyclerView = this.todoRecyclerView;
        TodoRemindAdapter todoRemindAdapter = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("todoRecyclerView");
            recyclerView = null;
        }
        TodoRemindAdapter todoRemindAdapter2 = this.todoRemindAdapter;
        if (todoRemindAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
            todoRemindAdapter2 = null;
        }
        recyclerView.setAdapter(todoRemindAdapter2);
        TodoRemindAdapter todoRemindAdapter3 = this.todoRemindAdapter;
        if (todoRemindAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
        } else {
            todoRemindAdapter = todoRemindAdapter3;
        }
        todoRemindAdapter.setOnItemListener(new TodoRemindAdapter.OnItemListener() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.TodoRemindFragment.initTodoRecyclerView.1
            @Override // com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.adapter.TodoRemindAdapter.OnItemListener
            public void onItemClick(TodoRemindItem todoRemindItem) {
                Intrinsics.checkNotNullParameter(todoRemindItem, "todoRemindItem");
                if (!TodoRemindFragment.access$getMViewModel(TodoRemindFragment.this).getDeviceConnected()) {
                    ToastUtil.showShortToast(wzi.v);
                } else if (todoRemindItem.getStatus() != 2) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable(TodoRemindEditFragment.KEY_REMIND_PARAM, todoRemindItem);
                    BaseFragmentExKt.gotoPageForResult(TodoRemindFragment.this, (Class<?>) TodoRemindEditFragment.class, bundle, 100);
                }
            }

            @Override // com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.adapter.TodoRemindAdapter.OnItemListener
            public void onItemDeleteSelectUpdate() {
                TodoRemindAdapter todoRemindAdapter4 = TodoRemindFragment.this.todoRemindAdapter;
                TodoRemindAdapter todoRemindAdapter5 = null;
                if (todoRemindAdapter4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
                    todoRemindAdapter4 = null;
                }
                List<TodoRemindItem> selectDeleteItemList = todoRemindAdapter4.getSelectDeleteItemList();
                wc0 miuiActionBar = TodoRemindFragment.this.getMiuiActionBar();
                View endView = miuiActionBar != null ? miuiActionBar.getEndView() : null;
                Intrinsics.checkNotNull(endView);
                int size = selectDeleteItemList.size();
                TodoRemindAdapter todoRemindAdapter6 = TodoRemindFragment.this.todoRemindAdapter;
                if (todoRemindAdapter6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
                } else {
                    todoRemindAdapter5 = todoRemindAdapter6;
                }
                endView.setSelected(size == todoRemindAdapter5.getCount());
                if (selectDeleteItemList.size() == 0) {
                    TodoRemindFragment todoRemindFragment = TodoRemindFragment.this;
                    todoRemindFragment.setTitle(todoRemindFragment.getString(wzi.x8));
                } else {
                    String quantityString = TodoRemindFragment.this.getResources().getQuantityString(qyi.common_selected_num, selectDeleteItemList.size(), Integer.valueOf(selectDeleteItemList.size()));
                    Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                    TodoRemindFragment.this.setTitle(quantityString);
                }
            }

            @Override // com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.adapter.TodoRemindAdapter.OnItemListener
            public void onItemMark(boolean markStatus, TodoRemindItem todoRemindItem) {
                Intrinsics.checkNotNullParameter(todoRemindItem, "todoRemindItem");
                if (!TodoRemindFragment.access$getMViewModel(TodoRemindFragment.this).getDeviceConnected()) {
                    ToastUtil.showShortToast(wzi.v);
                } else {
                    PageState.DefaultImpls.showLoading$default(TodoRemindFragment.this, null, 0, false, 3, null);
                    TodoRemindFragment.access$getMViewModel(TodoRemindFragment.this).markTodoRemindToDevice(markStatus, todoRemindItem);
                }
            }

            @Override // com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.adapter.TodoRemindAdapter.OnItemListener
            public boolean onLongClickTrigger() {
                TodoRemindAdapter todoRemindAdapter4 = TodoRemindFragment.this.todoRemindAdapter;
                if (todoRemindAdapter4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
                    todoRemindAdapter4 = null;
                }
                if (todoRemindAdapter4.getEditMode()) {
                    return false;
                }
                TodoRemindFragment.this.refreshViewWhenEditModeChange(true);
                return true;
            }
        });
    }

    private final void onAllButtonClick() {
        View endView;
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar == null || (endView = miuiActionBar.getEndView()) == null) {
            return;
        }
        TodoRemindAdapter todoRemindAdapter = null;
        if (endView.isSelected()) {
            endView.setSelected(false);
            TodoRemindAdapter todoRemindAdapter2 = this.todoRemindAdapter;
            if (todoRemindAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
            } else {
                todoRemindAdapter = todoRemindAdapter2;
            }
            todoRemindAdapter.setSelectAll(false);
            setTitle(getString(wzi.x8));
            return;
        }
        endView.setSelected(true);
        TodoRemindAdapter todoRemindAdapter3 = this.todoRemindAdapter;
        if (todoRemindAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
            todoRemindAdapter3 = null;
        }
        todoRemindAdapter3.setSelectAll(true);
        Resources resources = getResources();
        int i = qyi.common_selected_num;
        TodoRemindAdapter todoRemindAdapter4 = this.todoRemindAdapter;
        if (todoRemindAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
            todoRemindAdapter4 = null;
        }
        int count = todoRemindAdapter4.getCount();
        Object[] objArr = new Object[1];
        TodoRemindAdapter todoRemindAdapter5 = this.todoRemindAdapter;
        if (todoRemindAdapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
        } else {
            todoRemindAdapter = todoRemindAdapter5;
        }
        objArr[0] = Integer.valueOf(todoRemindAdapter.getCount());
        String quantityString = resources.getQuantityString(i, count, objArr);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        setTitle(quantityString);
    }

    private final void onDeleteResult(Pair<Boolean, ? extends List<Integer>> pair) {
        dismissDialogForce();
        refreshViewWhenEditModeChange(false);
        boolean zBooleanValue = pair.getFirst().booleanValue();
        List<Integer> second = pair.getSecond();
        if (!zBooleanValue) {
            ToastUtil.showShortToast(!((TodoRemindViewModel) getMViewModel()).getDeviceConnected() ? wzi.u : wzi.common_delete_failure);
            return;
        }
        TodoRemindAdapter todoRemindAdapter = this.todoRemindAdapter;
        if (todoRemindAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
            todoRemindAdapter = null;
        }
        List<TodoRemindItem> adapterList = todoRemindAdapter.getAdapterList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : adapterList) {
            if (!second.contains(Integer.valueOf(((TodoRemindItem) obj).getId()))) {
                arrayList.add(obj);
            }
        }
        onRemindListDataResult(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onMarkResult(Pair<Boolean, TodoRemindItem> pair) {
        dismissDialogForce();
        Logger.i("TodoRemindUiLog", "onMarkResult " + pair);
        TodoRemindAdapter todoRemindAdapter = this.todoRemindAdapter;
        TodoRemindAdapter todoRemindAdapter2 = null;
        if (todoRemindAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
            todoRemindAdapter = null;
        }
        Iterator<TodoRemindItem> it = todoRemindAdapter.getAdapterList().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().getId() == pair.getSecond().getId()) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            TodoRemindAdapter todoRemindAdapter3 = this.todoRemindAdapter;
            if (todoRemindAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
                todoRemindAdapter3 = null;
            }
            if (i < todoRemindAdapter3.getAdapterList().size()) {
                if (!pair.getFirst().booleanValue()) {
                    TodoRemindAdapter todoRemindAdapter4 = this.todoRemindAdapter;
                    if (todoRemindAdapter4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
                    } else {
                        todoRemindAdapter2 = todoRemindAdapter4;
                    }
                    todoRemindAdapter2.notifyItemChanged(i);
                    ToastUtil.showShortToast(!((TodoRemindViewModel) getMViewModel()).getDeviceConnected() ? wzi.u : wzi.common_set_error);
                    return;
                }
                TodoRemindAdapter todoRemindAdapter5 = this.todoRemindAdapter;
                if (todoRemindAdapter5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
                    todoRemindAdapter5 = null;
                }
                todoRemindAdapter5.getAdapterList().set(i, pair.getSecond());
                TodoRemindAdapter todoRemindAdapter6 = this.todoRemindAdapter;
                if (todoRemindAdapter6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
                    todoRemindAdapter6 = null;
                }
                TodoRemindAdapter todoRemindAdapter7 = this.todoRemindAdapter;
                if (todoRemindAdapter7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
                } else {
                    todoRemindAdapter2 = todoRemindAdapter7;
                }
                todoRemindAdapter6.updateData(TodoRemindViewModelKt.groupAndSort(todoRemindAdapter2.getAdapterList()));
                requestData();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onReceiveMarkFromDevice(Object it) {
        Logger.i("TodoRemindUiLog", "onReceiveMarkFromDevice " + it);
        if (it instanceof p14.c) {
            TodoRemindAdapter todoRemindAdapter = this.todoRemindAdapter;
            TodoRemindAdapter todoRemindAdapter2 = null;
            if (todoRemindAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
                todoRemindAdapter = null;
            }
            Iterator<TodoRemindItem> it2 = todoRemindAdapter.getAdapterList().iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                } else if (it2.next().getId() == ((p14.c) it).c) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                TodoRemindAdapter todoRemindAdapter3 = this.todoRemindAdapter;
                if (todoRemindAdapter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
                    todoRemindAdapter3 = null;
                }
                if (i < todoRemindAdapter3.getAdapterList().size()) {
                    TodoRemindAdapter todoRemindAdapter4 = this.todoRemindAdapter;
                    if (todoRemindAdapter4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
                        todoRemindAdapter4 = null;
                    }
                    TodoRemindItem todoRemindItem = todoRemindAdapter4.getAdapterList().get(i);
                    p14.c cVar = (p14.c) it;
                    todoRemindItem.setStatus(cVar.e);
                    todoRemindItem.setUpdateTimeSecond(cVar.f);
                    TodoRemindAdapter todoRemindAdapter5 = this.todoRemindAdapter;
                    if (todoRemindAdapter5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
                        todoRemindAdapter5 = null;
                    }
                    TodoRemindAdapter todoRemindAdapter6 = this.todoRemindAdapter;
                    if (todoRemindAdapter6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
                    } else {
                        todoRemindAdapter2 = todoRemindAdapter6;
                    }
                    todoRemindAdapter5.updateData(TodoRemindViewModelKt.groupAndSort(todoRemindAdapter2.getAdapterList()));
                }
            }
        }
    }

    private final void onRemindListDataResult(List<TodoRemindItem> list) {
        dismissDialogForce();
        TodoRemindAdapter todoRemindAdapter = null;
        if (list.isEmpty()) {
            RecyclerView recyclerView = this.todoRecyclerView;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("todoRecyclerView");
                recyclerView = null;
            }
            ViewExtKt.setVisible(recyclerView, false);
            TextView tvNoData = getMBinding().F;
            Intrinsics.checkNotNullExpressionValue(tvNoData, "tvNoData");
            ViewExtKt.setVisible(tvNoData, true);
        } else {
            RecyclerView recyclerView2 = this.todoRecyclerView;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("todoRecyclerView");
                recyclerView2 = null;
            }
            ViewExtKt.setVisible(recyclerView2, true);
            TextView tvNoData2 = getMBinding().F;
            Intrinsics.checkNotNullExpressionValue(tvNoData2, "tvNoData");
            ViewExtKt.setVisible(tvNoData2, false);
        }
        TodoRemindAdapter todoRemindAdapter2 = this.todoRemindAdapter;
        if (todoRemindAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
        } else {
            todoRemindAdapter = todoRemindAdapter2;
        }
        todoRemindAdapter.updateData(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onTodoAddClick() {
        if (!((TodoRemindViewModel) getMViewModel()).getDeviceConnected()) {
            ToastUtil.showShortToast(wzi.v);
            return;
        }
        int supportMaxCount = ((TodoRemindViewModel) getMViewModel()).getSupportMaxCount();
        TodoRemindAdapter todoRemindAdapter = this.todoRemindAdapter;
        if (todoRemindAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
            todoRemindAdapter = null;
        }
        List<TodoRemindItem> adapterList = todoRemindAdapter.getAdapterList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : adapterList) {
            if (!((TodoRemindItem) obj).isFinish()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() < supportMaxCount) {
            BaseFragmentExKt.gotoPageForResult(this, TodoRemindEditFragment.class, 100);
        } else {
            ToastUtil.showShortToast(getResources().getQuantityString(qyi.u, supportMaxCount, Integer.valueOf(supportMaxCount)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onTodoDeleteClick() {
        if (!((TodoRemindViewModel) getMViewModel()).getDeviceConnected()) {
            ToastUtil.showShortToast(wzi.v);
            return;
        }
        TodoRemindAdapter todoRemindAdapter = this.todoRemindAdapter;
        if (todoRemindAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
            todoRemindAdapter = null;
        }
        if (!todoRemindAdapter.getSelectDeleteItemList().isEmpty()) {
            showDeleteDialog();
            return;
        }
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            ToastExtKt.toastShort(mActivity, wzi.m2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshViewWhenEditModeChange(boolean editModeStatus) {
        View endView;
        View endView2;
        TodoRemindAdapter todoRemindAdapter = this.todoRemindAdapter;
        TodoRemindAdapter todoRemindAdapter2 = null;
        if (todoRemindAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
            todoRemindAdapter = null;
        }
        todoRemindAdapter.setEditMode(editModeStatus);
        TextView tvAddTodo = getMBinding().D;
        Intrinsics.checkNotNullExpressionValue(tvAddTodo, "tvAddTodo");
        ViewExtKt.setVisible(tvAddTodo, !editModeStatus);
        LinearLayout bottomDeleteLayout = getMBinding().B;
        Intrinsics.checkNotNullExpressionValue(bottomDeleteLayout, "bottomDeleteLayout");
        ViewExtKt.setVisible(bottomDeleteLayout, editModeStatus);
        if (!editModeStatus) {
            setTitle(getString(wzi.w8));
            wc0 miuiActionBar = getMiuiActionBar();
            if (miuiActionBar != null && (endView = miuiActionBar.getEndView()) != null) {
                endView.setVisibility(8);
            }
            setStartViewRes(jni.Q0, getString(wzi.d));
            return;
        }
        setTitle(getString(wzi.x8));
        setStartViewRes(jni.c0, getString(wzi.common_exit));
        wc0 miuiActionBar2 = getMiuiActionBar();
        if (miuiActionBar2 == null || (endView2 = miuiActionBar2.getEndView()) == null) {
            return;
        }
        endView2.setBackgroundResource(jni.Q);
        TodoRemindAdapter todoRemindAdapter3 = this.todoRemindAdapter;
        if (todoRemindAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
            todoRemindAdapter3 = null;
        }
        int size = todoRemindAdapter3.getSelectDeleteItemList().size();
        TodoRemindAdapter todoRemindAdapter4 = this.todoRemindAdapter;
        if (todoRemindAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
        } else {
            todoRemindAdapter2 = todoRemindAdapter4;
        }
        endView2.setSelected(size == todoRemindAdapter2.getCount());
        endView2.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestData() {
        if (((TodoRemindViewModel) getMViewModel()).getDeviceConnected()) {
            PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
            ((TodoRemindViewModel) getMViewModel()).requestDeviceTodoReminderData();
        } else {
            ToastUtil.showShortToast(wzi.u);
            onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$2(TodoRemindFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(list);
        this$0.onRemindListDataResult(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$3(TodoRemindFragment this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(pair);
        this$0.onDeleteResult(pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$4(TodoRemindFragment this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(pair);
        this$0.onMarkResult(pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$5(TodoRemindFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onTodoAddClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$6(TodoRemindFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onTodoDeleteClick();
    }

    private final void showDeleteDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("todo_delete").setDialogTitle(wzi.q8).setDialogDescription(wzi.r8).setPositiveText(wzi.g).setNegativeText(wzi.e).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.TodoRemindFragment.showDeleteDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    TodoRemindFragment.this.showLoading(wzi.N1, false);
                    TodoRemindViewModel todoRemindViewModelAccess$getMViewModel = TodoRemindFragment.access$getMViewModel(TodoRemindFragment.this);
                    TodoRemindAdapter todoRemindAdapter = TodoRemindFragment.this.todoRemindAdapter;
                    if (todoRemindAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
                        todoRemindAdapter = null;
                    }
                    List<TodoRemindItem> selectDeleteItemList = todoRemindAdapter.getSelectDeleteItemList();
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(selectDeleteItemList, 10));
                    Iterator<T> it = selectDeleteItemList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((TodoRemindItem) it.next()).getId()));
                    }
                    TodoRemindViewModel.deleteTodoReminderList$default(todoRemindViewModelAccess$getMViewModel, arrayList, false, 2, null);
                }
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && resultCode == 10) {
            TodoRemindAdapter todoRemindAdapter = null;
            TodoRemindItem todoRemindItem = (TodoRemindItem) (data != null ? data.getSerializableExtra(TodoRemindEditFragment.KEY_REMIND_PARAM) : null);
            if (todoRemindItem != null) {
                TodoRemindAdapter todoRemindAdapter2 = this.todoRemindAdapter;
                if (todoRemindAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
                    todoRemindAdapter2 = null;
                }
                Iterator<TodoRemindItem> it = todoRemindAdapter2.getAdapterList().iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (it.next().getId() == todoRemindItem.getId()) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i == -1) {
                    TodoRemindAdapter todoRemindAdapter3 = this.todoRemindAdapter;
                    if (todoRemindAdapter3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
                        todoRemindAdapter3 = null;
                    }
                    todoRemindAdapter3.getAdapterList().add(todoRemindItem);
                    TodoRemindAdapter todoRemindAdapter4 = this.todoRemindAdapter;
                    if (todoRemindAdapter4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
                    } else {
                        todoRemindAdapter = todoRemindAdapter4;
                    }
                    onRemindListDataResult(TodoRemindViewModelKt.groupAndSort(todoRemindAdapter.getAdapterList()));
                    return;
                }
                TodoRemindAdapter todoRemindAdapter5 = this.todoRemindAdapter;
                if (todoRemindAdapter5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
                    todoRemindAdapter5 = null;
                }
                todoRemindAdapter5.getAdapterList().set(i, todoRemindItem);
                TodoRemindAdapter todoRemindAdapter6 = this.todoRemindAdapter;
                if (todoRemindAdapter6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
                    todoRemindAdapter6 = null;
                }
                TodoRemindAdapter todoRemindAdapter7 = this.todoRemindAdapter;
                if (todoRemindAdapter7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
                } else {
                    todoRemindAdapter = todoRemindAdapter7;
                }
                todoRemindAdapter6.updateData(TodoRemindViewModelKt.groupAndSort(todoRemindAdapter.getAdapterList()));
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        TodoRemindAdapter todoRemindAdapter = this.todoRemindAdapter;
        if (todoRemindAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("todoRemindAdapter");
            todoRemindAdapter = null;
        }
        if (todoRemindAdapter.getEditMode()) {
            refreshViewWhenEditModeChange(false);
            return true;
        }
        FragmentActivity mActivity = getMActivity();
        if (mActivity == null) {
            return true;
        }
        mActivity.finish();
        return true;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Context context = getContext();
        if (context != null) {
            SafeDBUtil.INSTANCE.safeUnregisterBroadcastReceiver(context, this.deviceMarkBroadcastReceiver);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initTitleView();
        initTodoRecyclerView();
        requestData();
        SafeDBUtil safeDBUtil = SafeDBUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        TodoRemindFragment$deviceMarkBroadcastReceiver$1 todoRemindFragment$deviceMarkBroadcastReceiver$1 = this.deviceMarkBroadcastReceiver;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(DEVICE_MARK_ACTION);
        Unit unit = Unit.INSTANCE;
        safeDBUtil.safeRegisterBroadcastReceiver(contextRequireContext, todoRemindFragment$deviceMarkBroadcastReceiver$1, intentFilter, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((TodoRemindViewModel) getMViewModel()).getTodoRemindListLiveData().observe(getViewLifecycleOwner(), new TodoRemindFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: uhp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TodoRemindFragment.setListener$lambda$2(this.f35769a, (List) obj);
            }
        }));
        ((TodoRemindViewModel) getMViewModel()).getDeleteResultLiveData().observe(getViewLifecycleOwner(), new TodoRemindFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: vhp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TodoRemindFragment.setListener$lambda$3(this.f36910a, (Pair) obj);
            }
        }));
        ((TodoRemindViewModel) getMViewModel()).getMarkToDeviceResultLiveData().observe(getViewLifecycleOwner(), new TodoRemindFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: whp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TodoRemindFragment.setListener$lambda$4(this.f37988a, (Pair) obj);
            }
        }));
        getMBinding().D.setOnClickListener(new View.OnClickListener() { // from class: xhp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodoRemindFragment.setListener$lambda$5(this.f39142a, view);
            }
        });
        getMBinding().E.setOnClickListener(new View.OnClickListener() { // from class: yhp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodoRemindFragment.setListener$lambda$6(this.f40193a, view);
            }
        });
    }
}
