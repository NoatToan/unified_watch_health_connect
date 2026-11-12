package com.xiaomi.hm.health.activity;

import com.huami.account.HMLoginManager;
import com.huami.account.ui.common.StartupLegalUnifyDialog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.activity.StartupAgreementChecker;
import com.xiaomi.hm.health.baseutil.Language;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class StartupAgreementChecker {

    public interface OnAgreementAllPassed {
        void onPassed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit c(StartUpActivity startUpActivity) {
        startUpActivity.finish();
        return Unit.INSTANCE;
    }

    public static void checkAgreement(final StartUpActivity activity, final OnAgreementAllPassed onAgreementAllPassed) {
        if (!Language.isSimplifiedChinese() || !HMLoginManager.isUnInit()) {
            onAgreementAllPassed.onPassed();
            return;
        }
        activity.setContentView(R.layout.fragment_launch_ad);
        activity.setStyle(BaseTitleActivity.STYLE.NONE, 0, true);
        new StartupLegalUnifyDialog(new Function0() { // from class: hf7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StartupAgreementChecker.c(activity);
            }
        }, new Function0() { // from class: if7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StartupAgreementChecker.d(onAgreementAllPassed);
            }
        }).show(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit d(OnAgreementAllPassed onAgreementAllPassed) {
        onAgreementAllPassed.onPassed();
        return Unit.INSTANCE;
    }
}
