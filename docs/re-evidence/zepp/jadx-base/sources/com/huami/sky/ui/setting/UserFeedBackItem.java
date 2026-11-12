package com.huami.sky.ui.setting;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.feedback.api.FeedbackParams;
import com.huami.feedback.api.FeedbackService;
import com.huami.tools.analytics.DbUtils;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0007\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR;\u0010\u0017\u001a!\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\fj\u0002`\u00128\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/sky/ui/setting/UserFeedBackItem;", "Lcom/huami/sky/ui/setting/SettingItemType;", "Lcom/huami/feedback/api/FeedbackService;", "c", "Lkotlin/Lazy;", "a", "()Lcom/huami/feedback/api/FeedbackService;", "feedBackService", "", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "issueId", "Lkotlin/Function1;", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", DbUtils.Const.Table.CONTEXT, "", "Lcom/huami/sky/ui/setting/SkySettingNavigation;", "e", "Lkotlin/jvm/functions/Function1;", "getNavigation", "()Lkotlin/jvm/functions/Function1;", NotificationCompat.CATEGORY_NAVIGATION, "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class UserFeedBackItem extends SettingItemType {

    @NotNull
    public static final UserFeedBackItem INSTANCE;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Lazy feedBackService;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String issueId = "10712";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final Function1<Context, Unit> navigation;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/content/Context;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Context, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull Context context) {
            if (context instanceof AppCompatActivity) {
                UserFeedBackItem.INSTANCE.a().feedback(null, context, ((AppCompatActivity) context).getSupportFragmentManager(), new FeedbackParams(null, null, UserFeedBackItem.issueId, null, true, 11, null));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Context context) {
            a(context);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final UserFeedBackItem userFeedBackItem = new UserFeedBackItem();
        INSTANCE = userFeedBackItem;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        feedBackService = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<FeedbackService>() { // from class: com.huami.sky.ui.setting.UserFeedBackItem$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.feedback.api.FeedbackService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FeedbackService invoke() {
                KoinComponent koinComponent = userFeedBackItem;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FeedbackService.class), qualifier, objArr);
            }
        });
        navigation = a.a;
    }

    private UserFeedBackItem() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FeedbackService a() {
        return (FeedbackService) feedBackService.getValue();
    }

    @Override // com.huami.sky.ui.setting.SettingItemType
    @NotNull
    public Function1<Context, Unit> getNavigation() {
        return navigation;
    }
}
