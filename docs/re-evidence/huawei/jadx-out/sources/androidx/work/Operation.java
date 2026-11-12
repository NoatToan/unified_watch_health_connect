package androidx.work;

import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.ListenableFuture;
import com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult;
import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes4.dex */
public interface Operation {
    public static final State.IN_PROGRESS IN_PROGRESS;
    public static final State.SUCCESS SUCCESS;

    ListenableFuture<State.SUCCESS> getResult();

    LiveData<State> getState();

    static {
        SUCCESS = new State.SUCCESS();
        IN_PROGRESS = new State.IN_PROGRESS();
    }

    public static abstract class State {
        State() {
        }

        public static final class SUCCESS extends State {
            private SUCCESS() {
            }

            public String toString() {
                return MonitorResult.SUCCESS;
            }
        }

        public static final class IN_PROGRESS extends State {
            private IN_PROGRESS() {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class FAILURE extends State {
            private final Throwable mThrowable;

            public FAILURE(Throwable th) {
                this.mThrowable = th;
            }

            public Throwable getThrowable() {
                return this.mThrowable;
            }

            public String toString() {
                return "FAILURE (" + this.mThrowable.getMessage() + Constants.RIGHT_BRACKET_ONLY;
            }
        }
    }
}
