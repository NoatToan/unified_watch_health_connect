package com.xiaomi.passport.ui.view;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.xiaomi.account.passportsdk.account_sso.R;
import com.xiaomi.passport.ui.utils.CustomUtils;

/* JADX INFO: loaded from: classes11.dex */
public class QueryPhoneAccountViewHolder {
    private static long MAX_WAIT_TIMEOUT_MS = ((long) CustomUtils.QUERY_PHONE_ACCOUNT_SECOND) * 1000;
    private Runnable delayUpdateRunnable;
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private final View mRootView;
    private OnActionClickListener onActionClickListener;

    public interface OnActionClickListener {
        void onSkipClicked(View view);
    }

    public QueryPhoneAccountViewHolder(View view) {
        this.mRootView = view;
        if (view == null) {
            return;
        }
        final View viewFindViewById = view.findViewById(R.id.skip_query);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.passport.ui.view.QueryPhoneAccountViewHolder.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (QueryPhoneAccountViewHolder.this.onActionClickListener == null) {
                    return;
                }
                QueryPhoneAccountViewHolder.this.onActionClickListener.onSkipClicked(view2);
            }
        });
        viewFindViewById.setVisibility(4);
        Runnable runnable = new Runnable() { // from class: com.xiaomi.passport.ui.view.QueryPhoneAccountViewHolder.2
            @Override // java.lang.Runnable
            public void run() {
                viewFindViewById.setVisibility(0);
            }
        };
        this.delayUpdateRunnable = runnable;
        this.mHandler.postDelayed(runnable, MAX_WAIT_TIMEOUT_MS);
    }

    public void release() {
        if (this.mRootView == null) {
            return;
        }
        this.mHandler.removeCallbacks(this.delayUpdateRunnable);
    }

    public void setOnActionClickListener(OnActionClickListener onActionClickListener) {
        this.onActionClickListener = onActionClickListener;
    }

    public void setVisible(boolean z) {
        View view = this.mRootView;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }
}
