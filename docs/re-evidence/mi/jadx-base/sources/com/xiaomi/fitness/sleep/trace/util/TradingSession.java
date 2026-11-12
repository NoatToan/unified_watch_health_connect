package com.xiaomi.fitness.sleep.trace.util;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.fitness.common.extensions.AlarmManagerExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.sleep.trace.extensions.LogExtKt;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\t\u001a\u00060\nR\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/util/TradingSession;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mPref", "Landroid/content/SharedPreferences;", "mContext", "require", "Lcom/xiaomi/fitness/sleep/trace/util/TradingSession$Session;", "sessionName", "", "release", "", "hasSession", "", "requireValidKey", "getRequireTime", "", "key", "Session", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ApplySharedPref"})
@SourceDebugExtension({"SMAP\nTradingSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradingSession.kt\ncom/xiaomi/fitness/sleep/trace/util/TradingSession\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,108:1\n1#2:109\n108#3:110\n80#3,22:111\n108#3:133\n80#3,22:134\n*S KotlinDebug\n*F\n+ 1 TradingSession.kt\ncom/xiaomi/fitness/sleep/trace/util/TradingSession\n*L\n54#1:110\n54#1:111,22\n56#1:133\n56#1:134,22\n*E\n"})
public final class TradingSession {
    private static final long DELAY_RESTORE_TIME = TimeUnit.MINUTES.toMillis(20);
    private static final int NON = -1;

    @NotNull
    private static final String TAG = "TradingSession";

    @NotNull
    private static final String TRANSACTION_PREF = "transaction_pref";

    @NotNull
    private final Context mContext;

    @NotNull
    private final SharedPreferences mPref;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\u000bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/util/TradingSession$Session;", "", "mKey", "", "<init>", "(Lcom/xiaomi/fitness/sleep/trace/util/TradingSession;Ljava/lang/String;)V", "mProcessing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mRestoreIntent", "Landroid/app/PendingIntent;", "beginTransaction", "", "restore", "endTransaction", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTradingSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradingSession.kt\ncom/xiaomi/fitness/sleep/trace/util/TradingSession$Session\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n1#2:109\n*E\n"})
    public final class Session {

        @NotNull
        private final String mKey;

        @NotNull
        private final AtomicBoolean mProcessing;

        @Nullable
        private PendingIntent mRestoreIntent;
        final /* synthetic */ TradingSession this$0;

        public Session(@NotNull TradingSession tradingSession, String mKey) {
            Intrinsics.checkNotNullParameter(mKey, "mKey");
            this.this$0 = tradingSession;
            this.mKey = mKey;
            this.mProcessing = new AtomicBoolean();
        }

        public final void beginTransaction(@NotNull PendingIntent restore) {
            Intrinsics.checkNotNullParameter(restore, "restore");
            if (!this.mProcessing.compareAndSet(false, true)) {
                throw new IllegalStateException(("Begin multiple transactions : " + this.mKey).toString());
            }
            if (this.this$0.hasSession(this.mKey)) {
                this.mRestoreIntent = restore;
                long jCurrentTimeMillis = System.currentTimeMillis() + TradingSession.DELAY_RESTORE_TIME;
                AlarmManagerExtKt.setExactAndAllowWhileIdleIfCan$default(this.this$0.mContext, jCurrentTimeMillis, restore, 0, 4, null);
                LogExtKt.logi(this.mKey + ", trans alarm at : " + jCurrentTimeMillis);
            }
        }

        public final void endTransaction() {
            if (!this.mProcessing.compareAndSet(true, false)) {
                throw new IllegalStateException(("Transaction not begin : " + this.mKey).toString());
            }
            if (this.mRestoreIntent == null) {
                return;
            }
            Object systemService = this.this$0.mContext.getSystemService(DialWidgetType.ALARM);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
            PendingIntent pendingIntent = this.mRestoreIntent;
            Intrinsics.checkNotNull(pendingIntent);
            ((AlarmManager) systemService).cancel(pendingIntent);
        }
    }

    public TradingSession(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(TRANSACTION_PREF, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.mPref = sharedPreferences;
        this.mContext = ApplicationExtKt.getSafeContext(context);
    }

    private final long getRequireTime(String key) {
        long j;
        synchronized (this.mPref) {
            try {
                j = this.mPref.getLong(key, -1L);
            } catch (ClassCastException unused) {
                this.mPref.edit().remove(key).apply();
                return -1L;
            }
        }
        return j;
    }

    private final String requireValidKey(String sessionName) {
        int length = sessionName.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) sessionName.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (sessionName.subSequence(i, length + 1).toString().length() <= 0) {
            throw new IllegalStateException(("Invalidate sessionName " + sessionName).toString());
        }
        int length2 = sessionName.length() - 1;
        int i2 = 0;
        boolean z3 = false;
        while (i2 <= length2) {
            boolean z4 = Intrinsics.compare((int) sessionName.charAt(!z3 ? i2 : length2), 32) <= 0;
            if (z3) {
                if (!z4) {
                    break;
                }
                length2--;
            } else if (z4) {
                i2++;
            } else {
                z3 = true;
            }
        }
        return sessionName.subSequence(i2, length2 + 1).toString();
    }

    public final boolean hasSession(@NotNull String sessionName) {
        boolean z;
        Intrinsics.checkNotNullParameter(sessionName, "sessionName");
        String strRequireValidKey = requireValidKey(sessionName);
        synchronized (this.mPref) {
            z = getRequireTime(strRequireValidKey) != -1;
        }
        return z;
    }

    public final void release(@NotNull String sessionName) {
        Intrinsics.checkNotNullParameter(sessionName, "sessionName");
        String strRequireValidKey = requireValidKey(sessionName);
        synchronized (this.mPref) {
            if (this.mPref.contains(strRequireValidKey)) {
                this.mPref.edit().remove(strRequireValidKey).apply();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @NotNull
    public final Session require(@NotNull String sessionName) {
        Session session;
        Intrinsics.checkNotNullParameter(sessionName, "sessionName");
        String strRequireValidKey = requireValidKey(sessionName);
        synchronized (this.mPref) {
            try {
                if (getRequireTime(strRequireValidKey) == -1) {
                    this.mPref.edit().putLong(strRequireValidKey, System.currentTimeMillis()).commit();
                }
                session = new Session(this, strRequireValidKey);
            } catch (Throwable th) {
                throw th;
            }
        }
        return session;
    }
}
