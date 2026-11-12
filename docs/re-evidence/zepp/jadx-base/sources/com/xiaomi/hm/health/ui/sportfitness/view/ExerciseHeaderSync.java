package com.xiaomi.hm.health.ui.sportfitness.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.mifit.analytics.Analytics;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.moving.ui.utils.ViewUtils;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.ui.sportfitness.manager.HistoryRecordManager;
import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;

/* JADX INFO: loaded from: classes22.dex */
public class ExerciseHeaderSync extends RelativeLayout {
    private Context a;
    private ImageView b;
    private TextView c;
    private LinearLayout d;
    private TextView e;
    private ImageView f;
    private RotateAnimation g;
    private HistoryRecordManager.HistoryRecordSyncCallback h;

    public class a extends Subscriber<Long> {
        public a() {
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(Long ignore) {
            ExerciseHeaderSync.this.showRecordSyncEnd();
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable e) {
            e.printStackTrace();
        }
    }

    public class b implements HistoryRecordManager.HistoryRecordSyncCallback {
        public b() {
        }

        @Override // com.xiaomi.hm.health.ui.sportfitness.manager.HistoryRecordManager.HistoryRecordSyncCallback
        public void onEnd(int unSyncedRecordsCount) {
            ExerciseHeaderSync.this.i(unSyncedRecordsCount);
        }

        @Override // com.xiaomi.hm.health.ui.sportfitness.manager.HistoryRecordManager.HistoryRecordSyncCallback
        public void onStart() {
            ExerciseHeaderSync.this.k();
        }
    }

    public ExerciseHeaderSync(Context context) {
        this(context, null, 0);
    }

    private void d() {
        this.f.setOnClickListener(new View.OnClickListener() { // from class: qt1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.g(view);
            }
        });
    }

    private void e() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.g = rotateAnimation;
        rotateAnimation.setRepeatCount(-1);
        this.g.setDuration(400L);
        if (HistoryRecordManager.getInstance().isSyncingRecords()) {
            k();
        }
    }

    private void f() {
        this.b = (ImageView) findViewById(R.id.syncStateIndicator);
        this.c = (TextView) findViewById(R.id.unSyncCount);
        this.d = (LinearLayout) findViewById(R.id.syncFailContainer);
        this.e = (TextView) findViewById(R.id.syncFailDesc);
        this.f = (ImageView) findViewById(R.id.syncBtn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(View view) {
        m();
    }

    private void h() {
        LayoutInflater.from(getContext()).inflate(R.layout.exercise_header_sync, (ViewGroup) this, true);
        f();
        e();
        d();
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(long unSyncedRecordsCount) {
        if (unSyncedRecordsCount > 0) {
            j(unSyncedRecordsCount);
        } else {
            l();
        }
    }

    private void j(long failSyncCount) {
        this.g.cancel();
        this.b.setImageResource(R.drawable.ic_history_record_sync_fail);
        TintUtils.tintDrawable(this.b, ContextCompat.getColor(this.a, R.color.color_warning));
        showRecordSync();
        this.d.setVisibility(0);
        this.f.setVisibility(0);
        this.c.setVisibility(8);
        int i = (int) failSyncCount;
        this.e.setText(this.a.getResources().getQuantityString(R.plurals.running_history_record_sync_fail_unsync_count, i, Integer.valueOf(i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (!this.g.hasStarted()) {
            this.b.setImageResource(R.drawable.ic_history_record_sync);
            this.b.startAnimation(this.g);
        }
        TintUtils.tintDrawable(this.b, ContextCompat.getColor(this.a, R.color.color_warning));
        showRecordSync();
        this.d.setVisibility(8);
        this.f.setVisibility(8);
        this.c.setVisibility(0);
        this.c.setText(this.a.getString(R.string.running_history_record_sync_process));
    }

    private void l() {
        this.g.cancel();
        this.b.setImageResource(R.drawable.ic_history_record_sync_done);
        TintUtils.tintDrawable(this.b, ContextCompat.getColor(this.a, R.color.color_warning));
        showRecordSync();
        this.d.setVisibility(8);
        this.f.setVisibility(8);
        this.c.setVisibility(0);
        this.c.setText(this.a.getString(R.string.running_history_record_sync_success));
        Observable.timer(1500L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe((Subscriber<? super Long>) new a());
    }

    private void m() {
        Analytics.event(SportAnalytics.EVENT_RECORD_SYNC);
        if (NetUtil.isNetworkConnected(this.a.getApplicationContext())) {
            HistoryRecordManager.getInstance().uploadAllUnsyncedRecords();
        } else {
            Context context = this.a;
            IconToast.showError(context, context.getString(R.string.no_network_connection));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        HistoryRecordManager.getInstance().addSyncCallback(this.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        HistoryRecordManager.getInstance().removeSyncCallback(this.h);
        this.g.cancel();
    }

    public void showRecordSync() {
        setVisibility(0);
        int iDp2px = (int) ViewUtils.dp2px(getContext(), 72.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = iDp2px;
        } else {
            layoutParams = new RecyclerView.LayoutParams(-1, iDp2px);
        }
        setLayoutParams(layoutParams);
    }

    public void showRecordSyncEnd() {
        setVisibility(8);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = 0;
        } else {
            layoutParams = new RecyclerView.LayoutParams(-1, 0);
        }
        setLayoutParams(layoutParams);
    }

    public void showRecordUnSynced(long unSyncedCount) {
        this.b.setImageResource(R.drawable.ic_history_record_sync);
        TintUtils.tintDrawable(this.b, ContextCompat.getColor(this.a, R.color.color_warning));
        showRecordSync();
        this.d.setVisibility(8);
        this.f.setVisibility(0);
        this.c.setVisibility(0);
        int i = (int) unSyncedCount;
        this.c.setText(this.a.getResources().getQuantityString(R.plurals.running_history_record_unsync_count, i, Integer.valueOf(i)));
    }

    public ExerciseHeaderSync(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ExerciseHeaderSync(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.a = null;
        this.g = null;
        this.h = new b();
        this.a = context;
        h();
    }
}
