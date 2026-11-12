package com.xiaomi.hm.health.account;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.activity.MainTabActivity;
import com.xiaomi.hm.health.utils.HMActivityManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/account/AccountNavController;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lkotlin/Function1;", "Landroid/content/Intent;", "", "intentUpdater", "navigateToMain", "", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AccountNavController {

    @NotNull
    public static final AccountNavController INSTANCE = new AccountNavController();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "AccountNavController";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/content/Intent;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Intent, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull Intent intent) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Intent intent) {
            a(intent);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Intent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Intent intent) {
            super(0);
            this.a = intent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "startActivity goMainTabPage : " + this.a;
        }
    }

    private AccountNavController() {
    }

    @JvmStatic
    public static final void navigateToMain(@NotNull Context context, @NotNull Function1<? super Intent, Unit> intentUpdater) {
        Stack<Activity> activityStack = HMActivityManager.INSTANCE.getActivityStack();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = activityStack.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            Activity activity = (Activity) next;
            if ((activity instanceof MainTabActivity) && !((MainTabActivity) activity).isDestroyed()) {
                arrayList.add(next);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Activity) it3.next()).finish();
        }
        Intent intent = new Intent();
        intent.setClass(context, MainTabActivity.class);
        intentUpdater.invoke(intent);
        context.startActivity(intent);
        HMLog.info(TAG, new b(intent));
        Stack<Activity> activityStack2 = HMActivityManager.INSTANCE.getActivityStack();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : activityStack2) {
            Activity activity2 = (Activity) obj;
            if (((activity2 instanceof MainTabActivity) || activity2.isDestroyed()) ? false : true) {
                arrayList2.add(obj);
            }
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            ((Activity) it4.next()).finish();
        }
    }

    public static /* synthetic */ void navigateToMain$default(Context context, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = a.a;
        }
        navigateToMain(context, function1);
    }
}
