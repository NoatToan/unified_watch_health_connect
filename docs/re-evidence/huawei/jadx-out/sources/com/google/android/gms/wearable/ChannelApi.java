package com.google.android.gms.wearable;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface ChannelApi {
    public static final String ACTION_CHANNEL_EVENT = "com.google.android.gms.wearable.CHANNEL_EVENT";

    @Deprecated
    public interface ChannelListener {
        public static final int CLOSE_REASON_DISCONNECTED = 1;
        public static final int CLOSE_REASON_LOCAL_CLOSE = 3;
        public static final int CLOSE_REASON_NORMAL = 0;
        public static final int CLOSE_REASON_REMOTE_CLOSE = 2;

        void onChannelClosed(Channel channel, int i, int i2);

        void onChannelOpened(Channel channel);

        void onInputClosed(Channel channel, int i, int i2);

        void onOutputClosed(Channel channel, int i, int i2);
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CloseReason {
    }

    /* JADX INFO: loaded from: classes21.dex */
    @Deprecated
    public interface OpenChannelResult extends Result {
        @Nullable
        Channel getChannel();
    }

    PendingResult<Status> addListener(GoogleApiClient googleApiClient, ChannelListener channelListener);

    PendingResult<OpenChannelResult> openChannel(GoogleApiClient googleApiClient, String str, String str2);

    PendingResult<Status> removeListener(GoogleApiClient googleApiClient, ChannelListener channelListener);
}
