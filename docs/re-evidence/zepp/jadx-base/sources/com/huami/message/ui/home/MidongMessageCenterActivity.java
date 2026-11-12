package com.huami.message.ui.home;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import com.huami.message.ui.R;
import com.huami.message.ui.notification.NotificationFragment;
import com.huami.message.ui.widget.NotificationAlertDialogFragment;
import com.huami.message.utils.NotificationsUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/message/ui/home/MidongMessageCenterActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onLeftClicked", "Landroid/content/SharedPreferences;", "x", "Landroid/content/SharedPreferences;", "mSharedPreferences", "<init>", "()V", "Companion", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class MidongMessageCenterActivity extends BaseTitleActivity {
    private static final int A = 0;

    @NotNull
    public static final String IS_OUT = "isOut";

    @NotNull
    private static final String y = "MidongMessageCenterActivity";
    private static final int z = 1;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private SharedPreferences mSharedPreferences;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Ref.ObjectRef<NotificationAlertDialogFragment> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.ObjectRef<NotificationAlertDialogFragment> objectRef) {
            super(0);
            this.b = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SharedPreferences sharedPreferences = MidongMessageCenterActivity.this.mSharedPreferences;
            Objects.requireNonNull(sharedPreferences);
            sharedPreferences.edit().putLong("time", System.currentTimeMillis()).commit();
            this.b.element.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Ref.ObjectRef<NotificationAlertDialogFragment> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref.ObjectRef<NotificationAlertDialogFragment> objectRef) {
            super(0);
            this.b = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SharedPreferences sharedPreferences = MidongMessageCenterActivity.this.mSharedPreferences;
            Objects.requireNonNull(sharedPreferences);
            sharedPreferences.edit().putBoolean("no_more_reminders", true).commit();
            this.b.element.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Ref.ObjectRef<NotificationAlertDialogFragment> a;
        public final /* synthetic */ MidongMessageCenterActivity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ref.ObjectRef<NotificationAlertDialogFragment> objectRef, MidongMessageCenterActivity midongMessageCenterActivity) {
            super(0);
            this.a = objectRef;
            this.b = midongMessageCenterActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.element.dismiss();
            NotificationsUtils.INSTANCE.requestNotify(this.b.getApplicationContext());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, com.huami.message.ui.widget.NotificationAlertDialogFragment] */
    private final void initView() {
        NotificationFragment notificationFragmentNewInstance = NotificationFragment.INSTANCE.newInstance();
        Bundle bundle = new Bundle();
        bundle.putBoolean(IS_OUT, getIntent().getBooleanExtra(IS_OUT, false));
        notificationFragmentNewInstance.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.message_center_content, notificationFragmentNewInstance).commit();
        BaseTitleActivity.STYLE style = BaseTitleActivity.STYLE.BACK_AND_TITLE;
        int i = R.color.s38;
        setStyle(style, ContextCompat.getColor(this, i), getString(R.string.mc_title_notification), true);
        int i2 = R.color.s1;
        setBaseTitleColor(ContextCompat.getColor(this, i2));
        setLeftImageRes(R.drawable.ic_arrow_back_20_2x, i2);
        setTitleBarBackgroundColor(ContextCompat.getColor(this, i));
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        Objects.requireNonNull(sharedPreferences);
        long j = sharedPreferences.getLong("time", 0L);
        SharedPreferences sharedPreferences2 = this.mSharedPreferences;
        Objects.requireNonNull(sharedPreferences2);
        boolean z2 = sharedPreferences2.getBoolean("no_more_reminders", false);
        if (NotificationsUtils.INSTANCE.isNotificationEnabled(getApplicationContext()) || System.currentTimeMillis() - j <= 604800000 || z2) {
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        T t = objectRef.element;
        if (t != 0) {
            ((NotificationAlertDialogFragment) t).show(getSupportFragmentManager(), y);
            return;
        }
        ?? NewInstance = NotificationAlertDialogFragment.INSTANCE.newInstance();
        objectRef.element = NewInstance;
        NotificationAlertDialogFragment notificationAlertDialogFragment = (NotificationAlertDialogFragment) NewInstance;
        if (notificationAlertDialogFragment != null) {
            notificationAlertDialogFragment.setOnCloseButtonClickListener(new a(objectRef));
        }
        NotificationAlertDialogFragment notificationAlertDialogFragment2 = (NotificationAlertDialogFragment) objectRef.element;
        if (notificationAlertDialogFragment2 != null) {
            notificationAlertDialogFragment2.setOnNotReminderClickListener(new b(objectRef));
        }
        NotificationAlertDialogFragment notificationAlertDialogFragment3 = (NotificationAlertDialogFragment) objectRef.element;
        if (notificationAlertDialogFragment3 != null) {
            notificationAlertDialogFragment3.setOnToOpenClickListener(new c(objectRef, this));
        }
        NotificationAlertDialogFragment notificationAlertDialogFragment4 = (NotificationAlertDialogFragment) objectRef.element;
        if (notificationAlertDialogFragment4 == null) {
            return;
        }
        notificationAlertDialogFragment4.show(getSupportFragmentManager(), y);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mc_activity_message_center);
        this.mSharedPreferences = getSharedPreferences(y, 0);
        initView();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onLeftClicked() {
        onBackPressed();
    }
}
