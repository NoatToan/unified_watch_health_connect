package com.huawei.health.functionsetcard;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.functionsetcard.dailymoment.DailyMomentCardAdapter;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ewm;
import defpackage.ewz;
import defpackage.njy;
import defpackage.qrs;
import health.compact.a.Utils;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class FunctionSetViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f6700c;
    private ewm d;
    private Runnable f;
    private List<FunctionSetSubCardData> h;
    private volatile int i = -1;
    private volatile boolean j = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f6698a = false;
    private boolean e = true;
    private int g = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Runnable f6699b = new Runnable() { // from class: com.huawei.health.functionsetcard.FunctionSetViewAdapter.2
        @Override // java.lang.Runnable
        public void run() {
            FunctionSetViewAdapter.this.d();
        }
    };

    public FunctionSetViewAdapter(List<FunctionSetSubCardData> list, Context context) {
        this.h = list;
        this.f6700c = context;
        if (this.d == null) {
            this.d = ewm.d();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (i == -1) {
            return this.d.a(viewGroup);
        }
        FunctionSetSubCardData functionSetSubCardData = this.h.get(i);
        if (functionSetSubCardData == null) {
            LogUtil.j("R_FunctionSetViewAdapter", "onCreateViewHolder functionSetBeanReader is null");
            return null;
        }
        RecyclerView.ViewHolder cardViewHolder = functionSetSubCardData.getCardViewHolder(viewGroup, LayoutInflater.from(this.f6700c), i);
        LogUtil.a("R_FunctionSetViewAdapter", "onCreateViewHolder finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + ", id: ", functionSetSubCardData.getCardConfig().getCardId());
        return cardViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!e(i)) {
            LogUtil.j("R_FunctionSetViewAdapter", "onBindViewHolder position is wrong :", Integer.valueOf(i));
            return;
        }
        if ((viewHolder instanceof DailyMomentCardAdapter.DailyMomentViewHolder) && i == 1 && this.d.a() != null) {
            this.d.a().e((DailyMomentCardAdapter.DailyMomentViewHolder) viewHolder, this.d);
            ewz.e(this.f6700c, AnalyticsValue.DAILY_MOMENT_11100301.value(), null, null);
            return;
        }
        FunctionSetSubCardData functionSetSubCardData = this.h.get(c(i));
        if (functionSetSubCardData == null) {
            LogUtil.j("R_FunctionSetViewAdapter", "onBindViewHolder functionSetSubCardData is null");
            return;
        }
        functionSetSubCardData.onBindViewHolder(viewHolder, functionSetSubCardData);
        LogUtil.a("R_FunctionSetViewAdapter", "onBindViewHolder finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + ", id: ", functionSetSubCardData.getCardConfig().getCardId());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        List<FunctionSetSubCardData> list = this.h;
        if (list == null || list.size() == 0 || i < 0) {
            LogUtil.a("R_FunctionSetViewAdapter", "position is invalid");
            return -2L;
        }
        if (this.d.j()) {
            if (i > this.h.size()) {
                LogUtil.a("R_FunctionSetViewAdapter", "position is invalid");
                return -2L;
            }
            if (i == 1) {
                return -1L;
            }
            return Math.max(i - 1, 0);
        }
        if (i < this.h.size()) {
            return i;
        }
        LogUtil.a("R_FunctionSetViewAdapter", "position is invalid");
        return -2L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        List<FunctionSetSubCardData> list = this.h;
        if (list == null || list.size() == 0 || i < 0) {
            LogUtil.a("R_FunctionSetViewAdapter", "position is invalid");
            return -2;
        }
        if (this.d.j()) {
            if (i > this.h.size()) {
                LogUtil.a("R_FunctionSetViewAdapter", "position is invalid");
                return -2;
            }
            if (i == 1) {
                return -1;
            }
            return Math.max(i - 1, 0);
        }
        if (i < this.h.size()) {
            return i;
        }
        LogUtil.a("R_FunctionSetViewAdapter", "position is invalid");
        return -2;
    }

    public void d(int i) {
        if (a() && i == this.g && !this.j) {
            LogUtil.a("R_FunctionSetViewAdapter", "notifyCardScrolled");
            this.j = true;
            b();
        }
    }

    public void a(Runnable runnable) {
        if (!a()) {
            runnable.run();
        } else {
            if (this.i == 1) {
                runnable.run();
                return;
            }
            LogUtil.a("R_FunctionSetViewAdapter", "need to wait for tryNotifyItemInsertDelayed completed");
            this.f6698a = true;
            this.f = runnable;
        }
    }

    private void b() {
        LogUtil.a("R_FunctionSetViewAdapter", "tryNotifyItemInsertDelayed, mPreAttach: " + this.i);
        if (this.i == -1) {
            HandlerExecutor.a().postDelayed(this.f6699b, 800L);
            return;
        }
        if (this.i == 1) {
            return;
        }
        try {
            HandlerExecutor.a().removeCallbacks(this.f6699b);
        } catch (RuntimeException unused) {
            LogUtil.e("R_FunctionSetViewAdapter", "removeCallbacks RuntimeException");
        } finally {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.health.functionsetcard.FunctionSetViewAdapter.1
                @Override // java.lang.Runnable
                public void run() {
                    FunctionSetViewAdapter.this.d();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        LogUtil.a("R_FunctionSetViewAdapter", "notifyItemInsert, mIsNeedWaitInsertCompleted: " + this.f6698a);
        this.i = 1;
        if (this.f6698a) {
            Runnable runnable = this.f;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        LogUtil.a("R_FunctionSetViewAdapter", "no waiting notify task, notifyItemRangeInserted");
        List<FunctionSetSubCardData> list = this.h;
        if (list == null) {
            LogUtil.e("R_FunctionSetViewAdapter", "mLists is null");
        } else if (list.size() - 4 <= 0) {
            LogUtil.e("R_FunctionSetViewAdapter", "no item need insert");
        } else {
            notifyItemRangeInserted(4, this.h.size() - 4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<FunctionSetSubCardData> list = this.h;
        if (list == null || list.size() == 0) {
            return 0;
        }
        if (!a()) {
            return e();
        }
        if (this.i != 1) {
            if (this.i != -1) {
                return 4;
            }
            b();
            this.i = 0;
            return 4;
        }
        return e();
    }

    private int e() {
        if (this.d.j()) {
            return this.h.size() + 1;
        }
        return this.h.size();
    }

    private boolean a() {
        return (this.h.size() <= 4 || Utils.o() || qrs.af(this.f6700c) || qrs.ah(this.f6700c) || qrs.aa(this.f6700c) || !this.e) ? false : true;
    }

    private boolean e(int i) {
        return c(this.h, i);
    }

    public boolean c(List<FunctionSetSubCardData> list, int i) {
        if (list != null && list.size() != 0 && i >= 0) {
            if (this.d.j()) {
                return i <= list.size();
            }
            if (i < list.size()) {
                return true;
            }
        }
        return false;
    }

    public int c(int i) {
        ewm ewmVar = this.d;
        if (ewmVar == null || !ewmVar.j()) {
            return i;
        }
        if (i == 0) {
            return 0;
        }
        return i - 1;
    }

    public int a(int i) {
        ewm ewmVar = this.d;
        if (ewmVar == null || !ewmVar.j()) {
            return i;
        }
        if (i == 0) {
            return 0;
        }
        return i + 1;
    }

    public void c() {
        ewm.e();
        this.d = null;
        List<FunctionSetSubCardData> list = this.h;
        if (list != null) {
            list.clear();
            this.h = null;
        }
    }

    public int a(FunctionSetSubCardData functionSetSubCardData) {
        if (njy.e(this.h)) {
            LogUtil.a("R_FunctionSetViewAdapter", "mLists is null");
            return -1;
        }
        for (int i = 0; i < this.h.size(); i++) {
            FunctionSetSubCardData functionSetSubCardData2 = this.h.get(i);
            if (functionSetSubCardData2 != null && functionSetSubCardData2 == functionSetSubCardData) {
                return a(i);
            }
        }
        return -1;
    }

    public void d(boolean z) {
        this.e = z;
    }
}
