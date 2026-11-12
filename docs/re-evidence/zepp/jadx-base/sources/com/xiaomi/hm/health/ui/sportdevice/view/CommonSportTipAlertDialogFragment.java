package com.xiaomi.hm.health.ui.sportdevice.view;

import android.view.View;

/* JADX INFO: loaded from: classes22.dex */
public class CommonSportTipAlertDialogFragment extends BaseTipAlertDialogFragment {
    private View a;

    public static class Builder {
        private View a;

        public CommonSportTipAlertDialogFragment create() {
            return CommonSportTipAlertDialogFragment.b(this.a);
        }

        public Builder setContentView(View view) {
            if (view != null) {
                this.a = view;
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CommonSportTipAlertDialogFragment b(View contentView) {
        CommonSportTipAlertDialogFragment commonSportTipAlertDialogFragment = new CommonSportTipAlertDialogFragment();
        if (contentView != null) {
            commonSportTipAlertDialogFragment.setContentView(contentView);
        }
        return commonSportTipAlertDialogFragment;
    }

    private void setContentView(View contentView) {
        this.a = contentView;
    }

    @Override // com.xiaomi.hm.health.ui.sportdevice.view.BaseTipAlertDialogFragment
    public View createContentView() {
        return this.a;
    }
}
