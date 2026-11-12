package com.huami.sky.ui.navigation;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.huami.sky.lib.properties.SkyIntroManager;
import com.huami.sky.service.SkyNavigation;
import com.huami.sky.service.SkyPlayFromEvent;
import com.huami.sky.ui.intro.IntroActivity;
import com.huami.sky.ui.play.SkyPlayActivity;
import com.huami.sky.ui.service.SkyServiceHelperKt;
import com.huami.sky.ui.utils.Constant;
import com.huami.sky.ui.view.SkyQuestionnaireFragment;
import com.huami.tools.analytics.DbUtils;
import com.huami.web.service.WebItem;
import com.huami.web.service.WebViewService;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u0010"}, d2 = {"Lcom/huami/sky/ui/navigation/SkyNavigationImpl;", "Lcom/huami/sky/service/SkyNavigation;", "Lorg/koin/core/component/KoinComponent;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/sky/service/SkyPlayFromEvent;", "eventParams", "", "launchSkyMainPage", "launchIntroPage", "launchWebIntroPage", "", "surveyUrl", "launchSurveyPage", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyNavigationImpl implements SkyNavigation, KoinComponent {
    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.sky.service.SkyNavigation
    public void launchIntroPage(@NotNull Context context) {
        IntroActivity.INSTANCE.launch(context, 0);
    }

    @Override // com.huami.sky.service.SkyNavigation
    public void launchSkyMainPage(@NotNull Context context, @NotNull SkyPlayFromEvent eventParams) {
        if (SkyIntroManager.INSTANCE.isFirstEnter()) {
            IntroActivity.INSTANCE.launch(context, 0);
        } else {
            SkyPlayActivity.INSTANCE.actionToPlayActivity(context, eventParams.getFrom());
        }
    }

    @Override // com.huami.sky.service.SkyNavigation
    public void launchSurveyPage(@NotNull Context context, @NotNull String surveyUrl) {
        if (context instanceof FragmentActivity) {
            SkyQuestionnaireFragment.INSTANCE.create(surveyUrl).show(((FragmentActivity) context).getSupportFragmentManager(), "");
        }
    }

    @Override // com.huami.sky.service.SkyNavigation
    public void launchWebIntroPage() {
        WebViewService webViewService = SkyServiceHelperKt.getWebViewService();
        WebItem webItem = new WebItem(Constant.ILLUSTRATE_WEB_URL);
        webItem.webTheme = "THEME_DARK";
        Unit unit = Unit.INSTANCE;
        webViewService.launch(webItem);
    }
}
