package com.huami.wallet.ui.helper;

import androidx.annotation.Nullable;
import androidx.p008lifecycle.Observer;
import com.huami.tools.log.HMLog;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public class BenchmarkResourceObserver<T> implements Observer<Resource<T>> {
    private static final String c = "Wallet-Benchmark-LiveData";
    private final String a;
    private long b;

    public BenchmarkResourceObserver(String str) {
        this.a = str;
    }

    private static String a(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long minutes = timeUnit.toMinutes(j);
        long seconds = timeUnit.toSeconds(j);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        long seconds2 = seconds - timeUnit2.toSeconds(minutes);
        return String.format(Locale.getDefault(), "%02d:%02d.%03d", Long.valueOf(minutes), Long.valueOf(seconds2), Long.valueOf((j - timeUnit2.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds2)));
    }

    @Override // androidx.p008lifecycle.Observer
    public void onChanged(@Nullable Resource<T> resource) {
        if (resource != null) {
            Status status = resource.status;
            if (status == Status.LOADING) {
                this.b = System.currentTimeMillis();
                return;
            }
            if (status == Status.SUCCESS || status == Status.ERROR) {
                if (this.b != 0) {
                    HMLog.i(c, String.format(Locale.CHINA, "%s 耗时 %s", this.a, a(System.currentTimeMillis() - this.b)), new Object[0]);
                    this.b = 0L;
                } else {
                    HMLog.w(c, this.a + " 没有出现过LOADING的状态，直接接受到了完成状态", new Object[0]);
                }
            }
        }
    }
}
