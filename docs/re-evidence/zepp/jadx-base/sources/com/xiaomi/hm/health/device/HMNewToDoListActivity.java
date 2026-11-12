package com.xiaomi.hm.health.device;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.p010navigation.NavController;
import androidx.p010navigation.Navigation;
import com.huami.bluetooth.profile.channel.module.todo.Todo;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.device.settings.todo.ParcelableTodo;
import com.xiaomi.hm.health.device.settings.todo.TodoEditFragment;
import com.xiaomi.hm.health.device.settings.todo.TodoExtKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\t\u001a\u00020\u0004H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/HMNewToDoListActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lcom/xiaomi/hm/health/device/settings/todo/ParcelableTodo;", "todo", "", "l", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "", "x", "Z", "mIsActionToEdit", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HMNewToDoListActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String y = "todo.edit.key";

    @NotNull
    private static final String z = "todo.is.edit.key";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private boolean mIsActionToEdit;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/HMNewToDoListActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", "todo", "", "actionToTodoEdit", "actionToTodoAdd", "", "TODO_EDIT_KEY", "Ljava/lang/String;", "TODO_IS_EDIT_KEY", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void actionToTodoAdd(@NotNull Context context) {
            Intent intent = new Intent(context, (Class<?>) HMNewToDoListActivity.class);
            intent.putExtra(HMNewToDoListActivity.z, true);
            context.startActivity(intent);
        }

        public final void actionToTodoEdit(@NotNull Context context, @NotNull Todo todo) {
            Intent intent = new Intent(context, (Class<?>) HMNewToDoListActivity.class);
            intent.putExtra(HMNewToDoListActivity.y, TodoExtKt.toParcelableTodo(todo));
            intent.putExtra(HMNewToDoListActivity.z, true);
            context.startActivity(intent);
        }
    }

    private final void l(ParcelableTodo todo) {
        NavController navControllerFindNavController = Navigation.findNavController(this, R.id.nav_host);
        if (todo == null) {
            navControllerFindNavController.navigate(R.id.action_to_editTodo);
            return;
        }
        int i = R.id.action_to_editTodo;
        Bundle bundle = new Bundle();
        TodoEditFragment.INSTANCE.initArguments(bundle, todo);
        Unit unit = Unit.INSTANCE;
        navControllerFindNavController.navigate(i, bundle);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.mIsActionToEdit) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(BaseTitleActivity.STYLE.NONE, 0, true);
        setContentView(R.layout.activity_new_todo_list);
        ParcelableTodo parcelableTodo = (ParcelableTodo) getIntent().getParcelableExtra(y);
        boolean booleanExtra = getIntent().getBooleanExtra(z, false);
        this.mIsActionToEdit = booleanExtra;
        if (booleanExtra) {
            l(parcelableTodo);
        }
    }
}
