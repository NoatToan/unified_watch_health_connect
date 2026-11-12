package com.huami.account.usecase;

import androidx.fragment.app.FragmentManager;
import com.huami.account.ui.register.RegErrorActionTipFragment;
import com.huami.passport.ErrorCode;
import com.huami.passport.entity.NextActions;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¨\u0006\f"}, d2 = {"Lcom/huami/account/usecase/RegisterFailedCustomTipUseCase;", "", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lcom/huami/passport/ErrorCode;", "errorCode", "Lkotlin/Function0;", "", "showTipFailedCallback", Constant.METHOD_EXECUTE, "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class RegisterFailedCustomTipUseCase {

    @NotNull
    public static final RegisterFailedCustomTipUseCase INSTANCE = new RegisterFailedCustomTipUseCase();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "注册错误：0129，未获取到 href";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "注册错误：0129，href = " + this.a;
        }
    }

    private RegisterFailedCustomTipUseCase() {
    }

    @JvmStatic
    public static final void execute(@NotNull FragmentManager fragmentManager, @NotNull ErrorCode errorCode, @NotNull Function0<Unit> showTipFailedCallback) {
        NextActions nextActions;
        List<NextActions> nextActions2 = errorCode.getNextActions();
        String href = (nextActions2 == null || (nextActions = (NextActions) CollectionsKt.firstOrNull((List) nextActions2)) == null) ? null : nextActions.getHref();
        if (href == null || href.length() == 0) {
            HMLog.info$default(null, a.a, 1, null);
            showTipFailedCallback.invoke();
        } else {
            HMLog.info$default(null, new b(href), 1, null);
            RegErrorActionTipFragment.INSTANCE.show(fragmentManager, href);
        }
    }
}
