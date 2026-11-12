package com.xiaomi.hm.health.device.settings.todo;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.bluetooth.profile.channel.module.todo.Todo;
import com.huami.devicex.R;
import com.huami.devicex.databinding.FragmentTodoEditBinding;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.widget.wheelview.HMTimeChooseView;
import com.xiaomi.hm.health.baseui.fragment.BaseNavFragment;
import com.xiaomi.hm.health.device.settings.todo.TodoEditFragment;
import com.xiaomi.hm.health.device.settings.todo.view.TodoCalendarView;
import com.xiaomi.hm.health.utils.LengthInputFilter;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 E2\u00020\u0001:\u0001EB\u0007¢\u0006\u0004\bC\u0010DJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J/\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u000e\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0014\u0010\u0010\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\f\u0010\u0017\u001a\u00020\u0002*\u00020\u000bH\u0002J\b\u0010\u0018\u001a\u00020\fH\u0002J\b\u0010\u0019\u001a\u00020\fH\u0002J\f\u0010\u001b\u001a\u00020\u001a*\u00020\u000bH\u0002J\f\u0010\u001c\u001a\u00020\u0002*\u00020\u000bH\u0002J\u0012\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J$\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010'\u001a\u00020\u00022\u0006\u0010&\u001a\u00020$2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010)\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u001dH\u0016J\b\u0010*\u001a\u00020\fH\u0014J\b\u0010+\u001a\u00020\u001aH\u0014R\u001d\u00101\u001a\u00020,8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u00106\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010>\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010\u0013R\u0016\u0010@\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u00108R\u0016\u0010B\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u00108¨\u0006F"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/TodoEditFragment;", "Lcom/xiaomi/hm/health/baseui/fragment/BaseNavFragment;", "", "N", "Lcom/xiaomi/hm/health/device/settings/todo/ParcelableTodo;", TodoEditFragment.k, "", "date", "time", "x", "(Lcom/xiaomi/hm/health/device/settings/todo/ParcelableTodo;Ljava/lang/Long;Ljava/lang/Long;)Ljava/lang/Long;", "Lcom/huami/devicex/databinding/FragmentTodoEditBinding;", "", "enable", "O", "i0", "j0", "P", "d0", "Z", "U", "c0", "hideSoftKeyBoard", "k0", "J", "y", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "C", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "outState", "onSaveInstanceState", "onBackPressed", "tag", "Lcom/xiaomi/hm/health/device/settings/todo/TodoListViewModel;", "b", "Lkotlin/Lazy;", "B", "()Lcom/xiaomi/hm/health/device/settings/todo/TodoListViewModel;", "viewModel", "c", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "z", "()Lcom/huami/devicex/databinding/FragmentTodoEditBinding;", "binding", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/settings/todo/ParcelableTodo;", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "e", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loading", "f", "saving", "g", "calendarTodo", "h", "tempTodo", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class TodoEditFragment extends BaseNavFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] i;

    @NotNull
    private static final String j = "TodoEditFragment";

    @NotNull
    private static final String k = "todo";
    private static final int l = 150;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private ParcelableTodo todo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loading;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private volatile boolean saving;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private ParcelableTodo calendarTodo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private ParcelableTodo tempTodo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/TodoEditFragment$Companion;", "", "Landroid/os/Bundle;", "bundle", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", TodoEditFragment.k, "", "initArguments", "Lcom/xiaomi/hm/health/device/settings/todo/ParcelableTodo;", "", "ARG_TODO", "Ljava/lang/String;", "", "MAX_SIZE", LogUtil.I, "TAG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void initArguments(@NotNull Bundle bundle, @NotNull Todo todo) {
            bundle.putParcelable(TodoEditFragment.k, TodoExtKt.toParcelableTodo(todo));
        }

        public final void initArguments(@NotNull Bundle bundle, @NotNull ParcelableTodo todo) {
            bundle.putParcelable(TodoEditFragment.k, todo);
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(TodoEditFragment.class), "binding", "getBinding()Lcom/huami/devicex/databinding/FragmentTodoEditBinding;"));
        i = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TodoEditFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.device.settings.todo.TodoEditFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<TodoListViewModel>() { // from class: com.xiaomi.hm.health.device.settings.todo.TodoEditFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.device.settings.todo.TodoListViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TodoListViewModel invoke() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(TodoListViewModel.class), function0, objArr);
            }
        });
        this.binding = FragmentViewBindingKt.viewBinding(new TodoEditFragment$special$$inlined$viewBinding$1(new InflateViewBinder(FragmentTodoEditBinding.class)));
    }

    private final String A(FragmentTodoEditBinding fragmentTodoEditBinding) {
        return String.valueOf(fragmentTodoEditBinding.etContent.getText());
    }

    private final TodoListViewModel B() {
        return (TodoListViewModel) this.viewModel.getValue();
    }

    private final void C(final FragmentTodoEditBinding fragmentTodoEditBinding) {
        fragmentTodoEditBinding.titleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: aq7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodoEditFragment.D(this.a, view);
            }
        });
        fragmentTodoEditBinding.titleBar.setTitle(this.todo == null ? R.string.todo_list_add : R.string.todo_edit);
        O(fragmentTodoEditBinding, false);
        fragmentTodoEditBinding.titleBar.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: fq7
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view, int i2) {
                TodoEditFragment.E(this.a, view, i2);
            }
        });
        fragmentTodoEditBinding.etContent.postDelayed(new Runnable() { // from class: hq7
            @Override // java.lang.Runnable
            public final void run() {
                TodoEditFragment.F(this.a);
            }
        }, 200L);
        fragmentTodoEditBinding.etContent.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.hm.health.device.settings.todo.TodoEditFragment$init$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
                this.a.k0(fragmentTodoEditBinding);
                TodoEditFragment todoEditFragment = this.a;
                todoEditFragment.O(fragmentTodoEditBinding, todoEditFragment.y());
            }
        });
        fragmentTodoEditBinding.etContent.setFilters(new LengthInputFilter[]{new LengthInputFilter(150, null, 2, null)});
        fragmentTodoEditBinding.dateTile.setOnClickListener(new View.OnClickListener() { // from class: zp7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodoEditFragment.G(this.a, view);
            }
        });
        fragmentTodoEditBinding.repeatTile.setOnClickListener(new View.OnClickListener() { // from class: bq7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodoEditFragment.H(this.a, view);
            }
        });
        fragmentTodoEditBinding.deleteBtn.setOnClickListener(new View.OnClickListener() { // from class: cq7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodoEditFragment.I(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(TodoEditFragment todoEditFragment, View view) {
        todoEditFragment.hideSoftKeyBoard();
        todoEditFragment.requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(TodoEditFragment todoEditFragment, View view, int i2) {
        if (i2 != 0 || todoEditFragment.saving) {
            return;
        }
        todoEditFragment.saving = true;
        todoEditFragment.N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(TodoEditFragment todoEditFragment) {
        todoEditFragment.c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(TodoEditFragment todoEditFragment, View view) {
        todoEditFragment.hideSoftKeyBoard();
        ParcelableTodo parcelableTodo = todoEditFragment.calendarTodo;
        Objects.requireNonNull(parcelableTodo);
        todoEditFragment.tempTodo = parcelableTodo.copy((255 & 1) != 0 ? parcelableTodo.id : 0L, (255 & 2) != 0 ? parcelableTodo.content : null, (255 & 4) != 0 ? parcelableTodo.sourceType : 0, (255 & 8) != 0 ? parcelableTodo.date : null, (255 & 16) != 0 ? parcelableTodo.time : null, (255 & 32) != 0 ? parcelableTodo.repeat : 0, (255 & 64) != 0 ? parcelableTodo.completeTime : null, (255 & 128) != 0 ? parcelableTodo.firstRemind : null);
        todoEditFragment.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(TodoEditFragment todoEditFragment, View view) {
        todoEditFragment.hideSoftKeyBoard();
        ParcelableTodo parcelableTodo = todoEditFragment.calendarTodo;
        Objects.requireNonNull(parcelableTodo);
        todoEditFragment.tempTodo = parcelableTodo.copy((255 & 1) != 0 ? parcelableTodo.id : 0L, (255 & 2) != 0 ? parcelableTodo.content : null, (255 & 4) != 0 ? parcelableTodo.sourceType : 0, (255 & 8) != 0 ? parcelableTodo.date : null, (255 & 16) != 0 ? parcelableTodo.time : null, (255 & 32) != 0 ? parcelableTodo.repeat : 0, (255 & 64) != 0 ? parcelableTodo.completeTime : null, (255 & 128) != 0 ? parcelableTodo.firstRemind : null);
        todoEditFragment.Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(TodoEditFragment todoEditFragment, View view) {
        ParcelableTodo parcelableTodo = todoEditFragment.calendarTodo;
        Objects.requireNonNull(parcelableTodo);
        todoEditFragment.calendarTodo = parcelableTodo.copy((255 & 1) != 0 ? parcelableTodo.id : 0L, (255 & 2) != 0 ? parcelableTodo.content : null, (255 & 4) != 0 ? parcelableTodo.sourceType : 0, (255 & 8) != 0 ? parcelableTodo.date : null, (255 & 16) != 0 ? parcelableTodo.time : null, (255 & 32) != 0 ? parcelableTodo.repeat : 0, (255 & 64) != 0 ? parcelableTodo.completeTime : null, (255 & 128) != 0 ? parcelableTodo.firstRemind : null);
        FragmentTodoEditBinding fragmentTodoEditBindingZ = todoEditFragment.z();
        ParcelableTodo parcelableTodo2 = todoEditFragment.calendarTodo;
        Objects.requireNonNull(parcelableTodo2);
        todoEditFragment.j0(fragmentTodoEditBindingZ, parcelableTodo2);
        todoEditFragment.O(todoEditFragment.z(), todoEditFragment.y());
    }

    private final boolean J() {
        if (this.todo != null) {
            String strA = A(z());
            Objects.requireNonNull(strA, "null cannot be cast to non-null type kotlin.CharSequence");
            if (StringsKt__StringsKt.trim(strA).toString().length() == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(TodoEditFragment todoEditFragment, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        todoEditFragment.getBackPressedCallback().setEnabled(false);
        todoEditFragment.requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(final TodoEditFragment todoEditFragment, Boolean bool) {
        LoadingDialog loadingDialog = todoEditFragment.loading;
        if (loadingDialog == null) {
            return;
        }
        if (bool.booleanValue()) {
            loadingDialog.setSuccess(todoEditFragment.getString(R.string.save_success), new LoadingDialog.OnAnimEndListener() { // from class: com.xiaomi.hm.health.device.settings.todo.TodoEditFragment$onCreate$2$1
                @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                public void onAnimEnd(@Nullable LoadingDialog dialog) {
                    this.a.getBackPressedCallback().setEnabled(false);
                    this.a.requireActivity().onBackPressed();
                }

                @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                public void onDismiss(@Nullable LoadingDialog dialog) {
                }
            });
        } else {
            todoEditFragment.saving = false;
            loadingDialog.setFailed(todoEditFragment.getString(R.string.save_failed));
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x008c  */
    private final void N() {
        long jLongValue;
        Long l2;
        LoadingDialog loadingDialog = new LoadingDialog(requireContext());
        loadingDialog.setCancelable(false);
        loadingDialog.setMessage(getString(R.string.saving));
        Unit unit = Unit.INSTANCE;
        this.loading = loadingDialog;
        loadingDialog.show();
        hideSoftKeyBoard();
        String strA = A(z());
        Objects.requireNonNull(strA, "null cannot be cast to non-null type kotlin.CharSequence");
        String string = StringsKt__StringsKt.trim(strA).toString();
        ParcelableTodo parcelableTodo = this.todo;
        Long lValueOf = parcelableTodo == null ? null : Long.valueOf(parcelableTodo.getId());
        if (lValueOf == null) {
            long j2 = 1000;
            jLongValue = (System.currentTimeMillis() / j2) * j2;
        } else {
            jLongValue = lValueOf.longValue();
        }
        ParcelableTodo parcelableTodo2 = this.todo;
        Todo.Source source = parcelableTodo2 == null ? null : parcelableTodo2.getSource();
        if (source == null) {
            source = Todo.Source.Default.INSTANCE;
        }
        Todo.Source source2 = source;
        ParcelableTodo parcelableTodo3 = this.calendarTodo;
        Objects.requireNonNull(parcelableTodo3);
        Long date = parcelableTodo3.getDate();
        int repeat = 1;
        if (date != null) {
            if (!(date.longValue() > 0)) {
                date = null;
            }
        } else {
            date = null;
        }
        ParcelableTodo parcelableTodo4 = this.calendarTodo;
        Objects.requireNonNull(parcelableTodo4);
        Long time = parcelableTodo4.getTime();
        if (time != null) {
            if (time.longValue() > 0) {
                l2 = time;
            } else {
                l2 = null;
            }
        } else {
            l2 = null;
        }
        if (date == null) {
            repeat = 0;
        } else {
            ParcelableTodo parcelableTodo5 = this.calendarTodo;
            Objects.requireNonNull(parcelableTodo5);
            if (parcelableTodo5.getRepeat() != 0) {
                ParcelableTodo parcelableTodo6 = this.calendarTodo;
                Objects.requireNonNull(parcelableTodo6);
                repeat = parcelableTodo6.getRepeat();
            }
        }
        if (date != null) {
            date = Long.valueOf(TodoRepeat.checkDate(date.longValue(), repeat));
        }
        Long l3 = date;
        B().addOrUpdate(new Todo(jLongValue, string, source2, l3, l2, repeat, null, x(this.todo, l3, l2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(FragmentTodoEditBinding fragmentTodoEditBinding, boolean z) {
        fragmentTodoEditBinding.titleBar.setMenuEnable(0, z);
    }

    private final void P() {
        Unit unit;
        final TodoCalendarView todoCalendarView = new TodoCalendarView(requireContext());
        ParcelableTodo parcelableTodo = this.calendarTodo;
        Objects.requireNonNull(parcelableTodo);
        Long date = parcelableTodo.getDate();
        Calendar calendar = null;
        if (date == null) {
            unit = null;
        } else {
            long jLongValue = date.longValue();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(jLongValue);
            TodoCalendarView.setDate$default(todoCalendarView, calendar2, false, 2, null);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            TodoCalendarView.setDate$default(todoCalendarView, Calendar.getInstance(), false, 2, null);
        }
        ParcelableTodo parcelableTodo2 = this.calendarTodo;
        Objects.requireNonNull(parcelableTodo2);
        Long time = parcelableTodo2.getTime();
        if (time != null) {
            long jLongValue2 = time.longValue();
            calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jLongValue2);
        }
        todoCalendarView.setTime(calendar);
        final AlertDialogFragment alertDialogFragmentCreate = new AlertDialogFragment.Builder(requireContext()).setContentView(todoCalendarView).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: pq7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                TodoEditFragment.Q(this.a, todoCalendarView, dialogInterface, i2);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: oq7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                TodoEditFragment.R(this.a, dialogInterface, i2);
            }
        }).setCancelable(true).create();
        todoCalendarView.setTimeClickListener(new View.OnClickListener() { // from class: yp7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodoEditFragment.S(alertDialogFragmentCreate, this, todoCalendarView, view);
            }
        });
        alertDialogFragmentCreate.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: eq7
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                TodoEditFragment.T(this.a, dialogInterface);
            }
        });
        alertDialogFragmentCreate.show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(TodoEditFragment todoEditFragment, TodoCalendarView todoCalendarView, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        ParcelableTodo parcelableTodo = todoEditFragment.calendarTodo;
        Objects.requireNonNull(parcelableTodo);
        todoEditFragment.calendarTodo = parcelableTodo.copy((255 & 1) != 0 ? parcelableTodo.id : 0L, (255 & 2) != 0 ? parcelableTodo.content : null, (255 & 4) != 0 ? parcelableTodo.sourceType : 0, (255 & 8) != 0 ? parcelableTodo.date : Long.valueOf(todoCalendarView.getDate().getTimeInMillis()), (255 & 16) != 0 ? parcelableTodo.time : null, (255 & 32) != 0 ? parcelableTodo.repeat : 0, (255 & 64) != 0 ? parcelableTodo.completeTime : null, (255 & 128) != 0 ? parcelableTodo.firstRemind : null);
        FragmentTodoEditBinding fragmentTodoEditBindingZ = todoEditFragment.z();
        ParcelableTodo parcelableTodo2 = todoEditFragment.calendarTodo;
        Objects.requireNonNull(parcelableTodo2);
        todoEditFragment.j0(fragmentTodoEditBindingZ, parcelableTodo2);
        todoEditFragment.O(todoEditFragment.z(), todoEditFragment.y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(TodoEditFragment todoEditFragment, DialogInterface dialogInterface, int i2) {
        ParcelableTodo parcelableTodo = todoEditFragment.tempTodo;
        Objects.requireNonNull(parcelableTodo);
        todoEditFragment.calendarTodo = parcelableTodo;
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(AlertDialogFragment alertDialogFragment, TodoEditFragment todoEditFragment, TodoCalendarView todoCalendarView, View view) {
        alertDialogFragment.dismiss();
        ParcelableTodo parcelableTodo = todoEditFragment.calendarTodo;
        Objects.requireNonNull(parcelableTodo);
        todoEditFragment.calendarTodo = parcelableTodo.copy((255 & 1) != 0 ? parcelableTodo.id : 0L, (255 & 2) != 0 ? parcelableTodo.content : null, (255 & 4) != 0 ? parcelableTodo.sourceType : 0, (255 & 8) != 0 ? parcelableTodo.date : Long.valueOf(todoCalendarView.getDate().getTimeInMillis()), (255 & 16) != 0 ? parcelableTodo.time : null, (255 & 32) != 0 ? parcelableTodo.repeat : 0, (255 & 64) != 0 ? parcelableTodo.completeTime : null, (255 & 128) != 0 ? parcelableTodo.firstRemind : null);
        todoEditFragment.d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(TodoEditFragment todoEditFragment, DialogInterface dialogInterface) {
        ParcelableTodo parcelableTodo = todoEditFragment.tempTodo;
        Objects.requireNonNull(parcelableTodo);
        todoEditFragment.calendarTodo = parcelableTodo;
    }

    private final void U() {
        ParcelableTodo parcelableTodo = this.calendarTodo;
        Objects.requireNonNull(parcelableTodo);
        final boolean[] weekLoop = TodoRepeat.getWeekLoop(parcelableTodo.checkedRepeat(B().supportWorkdayRepeat()));
        AlertDialogFragment alertDialogFragmentCreate = new AlertDialogFragment.Builder(requireContext()).setCancelable(true).setMultiChoiceItems(new AlertDialogFragment.ChoiceItems().setItemsEnable(new boolean[]{true, true, true, true, true, true, true}).setItemsChecked(weekLoop).setItems(R.array.weeks), new DialogInterface.OnMultiChoiceClickListener() { // from class: xp7
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i2, boolean z) {
                TodoEditFragment.V(weekLoop, dialogInterface, i2, z);
            }
        }).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: vp7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                TodoEditFragment.W(this.a, weekLoop, dialogInterface, i2);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: lq7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                TodoEditFragment.X(this.a, dialogInterface, i2);
            }
        }).create();
        alertDialogFragmentCreate.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: iq7
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                TodoEditFragment.Y(this.a, dialogInterface);
            }
        });
        alertDialogFragmentCreate.show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(boolean[] zArr, DialogInterface dialogInterface, int i2, boolean z) {
        zArr[i2] = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(TodoEditFragment todoEditFragment, boolean[] zArr, DialogInterface dialogInterface, int i2) {
        ParcelableTodo parcelableTodo = todoEditFragment.calendarTodo;
        Objects.requireNonNull(parcelableTodo);
        todoEditFragment.calendarTodo = parcelableTodo.copy((255 & 1) != 0 ? parcelableTodo.id : 0L, (255 & 2) != 0 ? parcelableTodo.content : null, (255 & 4) != 0 ? parcelableTodo.sourceType : 0, (255 & 8) != 0 ? parcelableTodo.date : null, (255 & 16) != 0 ? parcelableTodo.time : null, (255 & 32) != 0 ? parcelableTodo.repeat : TodoRepeat.getFlag(zArr), (255 & 64) != 0 ? parcelableTodo.completeTime : null, (255 & 128) != 0 ? parcelableTodo.firstRemind : null);
        FragmentTodoEditBinding fragmentTodoEditBindingZ = todoEditFragment.z();
        ParcelableTodo parcelableTodo2 = todoEditFragment.calendarTodo;
        Objects.requireNonNull(parcelableTodo2);
        todoEditFragment.j0(fragmentTodoEditBindingZ, parcelableTodo2);
        todoEditFragment.O(todoEditFragment.z(), todoEditFragment.y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(TodoEditFragment todoEditFragment, DialogInterface dialogInterface, int i2) {
        todoEditFragment.Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(TodoEditFragment todoEditFragment, DialogInterface dialogInterface) {
        todoEditFragment.Z();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    private final void Z() {
        boolean zSupportWorkdayRepeat = B().supportWorkdayRepeat();
        ParcelableTodo parcelableTodo = this.calendarTodo;
        Objects.requireNonNull(parcelableTodo);
        int iCheckedRepeat = parcelableTodo.checkedRepeat(zSupportWorkdayRepeat);
        int i2 = 4;
        if (iCheckedRepeat == 0 || iCheckedRepeat == 1) {
            i2 = 0;
        } else if (iCheckedRepeat == 2) {
            i2 = 1;
        } else if (iCheckedRepeat == 8) {
            i2 = 3;
        } else if (iCheckedRepeat != 16) {
            if (iCheckedRepeat != 3072) {
                ParcelableTodo parcelableTodo2 = this.calendarTodo;
                Objects.requireNonNull(parcelableTodo2);
                if ((parcelableTodo2.checkedRepeat(zSupportWorkdayRepeat) & 4096) > 0) {
                    i2 = 5;
                } else {
                    ParcelableTodo parcelableTodo3 = this.calendarTodo;
                    Objects.requireNonNull(parcelableTodo3);
                    if ((parcelableTodo3.checkedRepeat(zSupportWorkdayRepeat) & 4) > 0) {
                        i2 = 2;
                    } else if (zSupportWorkdayRepeat) {
                        i2 = 7;
                    } else {
                        i2 = 5;
                    }
                }
            } else if (zSupportWorkdayRepeat) {
                i2 = 6;
            } else {
                i2 = 5;
            }
        }
        int i3 = zSupportWorkdayRepeat ? R.array.event_remind_periods_with_workday : R.array.event_remind_periods;
        final int i4 = zSupportWorkdayRepeat ? 7 : 5;
        AlertDialogFragment alertDialogFragmentCreate = new AlertDialogFragment.Builder(requireContext()).setCancelable(true).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItems(i3).setItemChoice(i2), new DialogInterface.OnClickListener() { // from class: kq7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                TodoEditFragment.a0(i4, this, dialogInterface, i5);
            }
        }).create();
        alertDialogFragmentCreate.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: tp7
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                TodoEditFragment.b0(this.a, dialogInterface);
            }
        });
        alertDialogFragmentCreate.show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(int i2, TodoEditFragment todoEditFragment, DialogInterface dialogInterface, int i3) {
        int iCheckFlag;
        dialogInterface.dismiss();
        if (i3 == i2) {
            todoEditFragment.U();
            return;
        }
        ParcelableTodo parcelableTodo = todoEditFragment.calendarTodo;
        Objects.requireNonNull(parcelableTodo);
        switch (i3) {
            case 1:
                iCheckFlag = 2;
                break;
            case 2:
                Objects.requireNonNull(parcelableTodo);
                iCheckFlag = TodoRepeat.checkFlag(4, parcelableTodo.getDate(), true);
                break;
            case 3:
                iCheckFlag = 8;
                break;
            case 4:
                iCheckFlag = 16;
                break;
            case 5:
                iCheckFlag = 4096;
                break;
            case 6:
                iCheckFlag = 3072;
                break;
            default:
                iCheckFlag = 1;
                break;
        }
        todoEditFragment.calendarTodo = parcelableTodo.copy((255 & 1) != 0 ? parcelableTodo.id : 0L, (255 & 2) != 0 ? parcelableTodo.content : null, (255 & 4) != 0 ? parcelableTodo.sourceType : 0, (255 & 8) != 0 ? parcelableTodo.date : null, (255 & 16) != 0 ? parcelableTodo.time : null, (255 & 32) != 0 ? parcelableTodo.repeat : iCheckFlag, (255 & 64) != 0 ? parcelableTodo.completeTime : null, (255 & 128) != 0 ? parcelableTodo.firstRemind : null);
        FragmentTodoEditBinding fragmentTodoEditBindingZ = todoEditFragment.z();
        ParcelableTodo parcelableTodo2 = todoEditFragment.calendarTodo;
        Objects.requireNonNull(parcelableTodo2);
        todoEditFragment.j0(fragmentTodoEditBindingZ, parcelableTodo2);
        todoEditFragment.O(todoEditFragment.z(), todoEditFragment.y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(TodoEditFragment todoEditFragment, DialogInterface dialogInterface) {
        ParcelableTodo parcelableTodo = todoEditFragment.tempTodo;
        Objects.requireNonNull(parcelableTodo);
        todoEditFragment.calendarTodo = parcelableTodo;
    }

    private final void c0() {
        z().etContent.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) requireActivity().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.showSoftInput(z().etContent, 2);
    }

    private final void d0() {
        final Calendar calendar;
        HMTimeChooseView hMTimeChooseView = new HMTimeChooseView(requireContext());
        ParcelableTodo parcelableTodo = this.calendarTodo;
        Objects.requireNonNull(parcelableTodo);
        Long time = parcelableTodo.getTime();
        if (time == null) {
            calendar = null;
        } else {
            long jLongValue = time.longValue();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(jLongValue);
            calendar = calendar2;
        }
        if (calendar == null) {
            calendar = Calendar.getInstance();
            calendar.add(12, 15);
        }
        hMTimeChooseView.setInitialTime(calendar.get(11), calendar.get(12));
        hMTimeChooseView.setOnTimeChooseListener(new HMTimeChooseView.ITimeChooseListener() { // from class: gq7
            @Override // com.huami.widget.wheelview.HMTimeChooseView.ITimeChooseListener
            public final void onTimeChoose(int i2, int i3) {
                TodoEditFragment.e0(calendar, i2, i3);
            }
        });
        AlertDialogFragment alertDialogFragmentCreate = new AlertDialogFragment.Builder(requireContext()).setTitle(R.string.todo_list_reminder_time).setContentView(hMTimeChooseView).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: up7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                TodoEditFragment.f0(this.a, calendar, dialogInterface, i2);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: nq7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                TodoEditFragment.g0(this.a, dialogInterface, i2);
            }
        }).setCancelable(true).create();
        alertDialogFragmentCreate.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: jq7
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                TodoEditFragment.h0(this.a, dialogInterface);
            }
        });
        alertDialogFragmentCreate.show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(Calendar calendar, int i2, int i3) {
        calendar.set(11, i2);
        calendar.set(12, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(TodoEditFragment todoEditFragment, Calendar calendar, DialogInterface dialogInterface, int i2) {
        ParcelableTodo parcelableTodo = todoEditFragment.calendarTodo;
        Objects.requireNonNull(parcelableTodo);
        todoEditFragment.calendarTodo = parcelableTodo.copy((255 & 1) != 0 ? parcelableTodo.id : 0L, (255 & 2) != 0 ? parcelableTodo.content : null, (255 & 4) != 0 ? parcelableTodo.sourceType : 0, (255 & 8) != 0 ? parcelableTodo.date : null, (255 & 16) != 0 ? parcelableTodo.time : Long.valueOf(calendar.getTimeInMillis()), (255 & 32) != 0 ? parcelableTodo.repeat : 0, (255 & 64) != 0 ? parcelableTodo.completeTime : null, (255 & 128) != 0 ? parcelableTodo.firstRemind : null);
        todoEditFragment.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(TodoEditFragment todoEditFragment, DialogInterface dialogInterface, int i2) {
        todoEditFragment.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(TodoEditFragment todoEditFragment, DialogInterface dialogInterface) {
        todoEditFragment.P();
    }

    private final void hideSoftKeyBoard() {
        InputMethodManager inputMethodManager = (InputMethodManager) requireActivity().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(z().etContent.getWindowToken(), 0);
    }

    private final void i0(FragmentTodoEditBinding fragmentTodoEditBinding, ParcelableTodo parcelableTodo) {
        String content = parcelableTodo.getContent();
        if (content.length() > 0) {
            fragmentTodoEditBinding.etContent.setText(content);
            fragmentTodoEditBinding.etContent.setSelection(content.length());
        } else {
            k0(fragmentTodoEditBinding);
        }
        j0(fragmentTodoEditBinding, parcelableTodo);
    }

    private final void j0(FragmentTodoEditBinding fragmentTodoEditBinding, ParcelableTodo parcelableTodo) {
        Calendar calendar;
        int i2;
        Long date = parcelableTodo.getDate();
        if (date == null) {
            date = parcelableTodo.getTime();
        }
        if (date == null) {
            calendar = null;
        } else {
            long jLongValue = date.longValue();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(TodoRepeat.checkDate(jLongValue, parcelableTodo.checkedRepeat(B().supportWorkdayRepeat())));
            calendar = calendar2;
        }
        if (calendar == null) {
            fragmentTodoEditBinding.dateTile.setTips("");
            fragmentTodoEditBinding.repeatTile.setVisibility(8);
            fragmentTodoEditBinding.deleteBtn.setVisibility(8);
            return;
        }
        fragmentTodoEditBinding.repeatTile.setVisibility(0);
        fragmentTodoEditBinding.deleteBtn.setVisibility(0);
        if (parcelableTodo.getTime() == null) {
            i2 = 131076;
        } else {
            Calendar calendar3 = Calendar.getInstance();
            calendar3.setTimeInMillis(parcelableTodo.getTime().longValue());
            calendar.set(11, calendar3.get(11));
            calendar.set(12, calendar3.get(12));
            i2 = 131093;
        }
        fragmentTodoEditBinding.dateTile.setTips(DateUtils.formatDateTime(getContext(), calendar.getTimeInMillis(), i2));
        fragmentTodoEditBinding.repeatTile.setTips(TodoRepeat.getDesc(requireContext(), parcelableTodo.checkedRepeat(B().supportWorkdayRepeat()), B().supportWorkdayRepeat()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(FragmentTodoEditBinding fragmentTodoEditBinding) {
        String strA = A(fragmentTodoEditBinding);
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(strA, "null cannot be cast to non-null type java.lang.String");
        int length = strA.getBytes(charset).length;
        fragmentTodoEditBinding.tvLimit.setText(String.valueOf(length > 150 ? 0 : 150 - length));
    }

    private final Long x(ParcelableTodo todo, Long date, Long time) {
        if (date == null) {
            return null;
        }
        long jLongValue = date.longValue();
        if (todo == null || todo.isRemindTimeChanged(Long.valueOf(jLongValue), time)) {
            return TodoExtKt.calculatorFirstRemind(Long.valueOf(jLongValue), time);
        }
        Long firstRemind = todo.getFirstRemind();
        return firstRemind == null ? TodoExtKt.calculatorFirstRemind(todo.getDate(), todo.getTime()) : firstRemind;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y() {
        String strA = A(z());
        Objects.requireNonNull(strA, "null cannot be cast to non-null type kotlin.CharSequence");
        String string = StringsKt__StringsKt.trim(strA).toString();
        if (string.length() == 0) {
            return false;
        }
        ParcelableTodo parcelableTodo = this.todo;
        if (parcelableTodo == null || !Intrinsics.areEqual(parcelableTodo.getContent(), string)) {
            return true;
        }
        ParcelableTodo parcelableTodo2 = this.calendarTodo;
        Objects.requireNonNull(parcelableTodo2);
        Long date = parcelableTodo2.getDate();
        ParcelableTodo parcelableTodo3 = this.calendarTodo;
        Objects.requireNonNull(parcelableTodo3);
        if (parcelableTodo.isRemindTimeChanged(date, parcelableTodo3.getTime())) {
            return true;
        }
        int repeat = parcelableTodo.getRepeat();
        ParcelableTodo parcelableTodo4 = this.calendarTodo;
        Objects.requireNonNull(parcelableTodo4);
        return repeat != parcelableTodo4.getRepeat();
    }

    private final FragmentTodoEditBinding z() {
        return (FragmentTodoEditBinding) this.binding.getValue(this, i[1]);
    }

    @Override // com.xiaomi.hm.health.baseui.fragment.BaseNavFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.baseui.fragment.BaseNavFragment
    public boolean onBackPressed() {
        if (!J() && !y()) {
            return super.onBackPressed();
        }
        new AlertDialogFragment.Builder(requireContext()).setMessage(R.string.cancel_save_tips).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: wp7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                TodoEditFragment.K(dialogInterface, i2);
            }
        }).setPositiveButton(R.string.give_up, new DialogInterface.OnClickListener() { // from class: mq7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                TodoEditFragment.L(this.a, dialogInterface, i2);
            }
        }).create().show(getChildFragmentManager());
        return true;
    }

    @Override // com.xiaomi.hm.health.baseui.fragment.BaseNavFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.todo = (ParcelableTodo) arguments.getParcelable(k);
        }
        B().getResultLiveData().observe(this, new Observer() { // from class: dq7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TodoEditFragment.M(this.a, (Boolean) obj);
            }
        });
        ParcelableTodo parcelableTodo = this.todo;
        ParcelableTodo parcelableTodoCopy = parcelableTodo == null ? null : parcelableTodo.copy((255 & 1) != 0 ? parcelableTodo.id : 0L, (255 & 2) != 0 ? parcelableTodo.content : null, (255 & 4) != 0 ? parcelableTodo.sourceType : 0, (255 & 8) != 0 ? parcelableTodo.date : null, (255 & 16) != 0 ? parcelableTodo.time : null, (255 & 32) != 0 ? parcelableTodo.repeat : 0, (255 & 64) != 0 ? parcelableTodo.completeTime : null, (255 & 128) != 0 ? parcelableTodo.firstRemind : null);
        if (parcelableTodoCopy == null) {
            parcelableTodoCopy = new ParcelableTodo();
        }
        this.calendarTodo = parcelableTodoCopy;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return z().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        ParcelableTodo parcelableTodo = this.todo;
        if (parcelableTodo == null) {
            return;
        }
        outState.putParcelable(k, parcelableTodo);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Unit unit;
        super.onViewCreated(view, savedInstanceState);
        C(z());
        ParcelableTodo parcelableTodo = this.todo;
        if (parcelableTodo == null) {
            unit = null;
        } else {
            i0(z(), parcelableTodo);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            k0(z());
        }
    }

    @Override // com.xiaomi.hm.health.baseui.fragment.BaseNavFragment
    @NotNull
    public String tag() {
        return j;
    }
}
