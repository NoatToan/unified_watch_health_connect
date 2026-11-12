package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.twitter.sdk.android.core.GuestSessionProvider;
import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.SessionManager;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.CommonUtils;
import com.twitter.sdk.android.core.internal.IdManager;
import com.twitter.sdk.android.core.internal.SystemCurrentTimeProvider;
import com.twitter.sdk.android.core.internal.persistence.FileStoreImpl;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes18.dex */
public class ScribeClient {
    private static final String j = "_se.tap";
    private static final String k = "_se_to_send";
    public final ConcurrentHashMap<Long, c> a = new ConcurrentHashMap<>(2);
    private final Context b;
    private final ScheduledExecutorService c;
    private final ScribeConfig d;
    private final ScribeEvent.Transform e;
    private final TwitterAuthConfig f;
    private final SessionManager<? extends Session<TwitterAuthToken>> g;
    private final GuestSessionProvider h;
    private final IdManager i;

    public ScribeClient(Context context, ScheduledExecutorService scheduledExecutorService, ScribeConfig scribeConfig, ScribeEvent.Transform transform, TwitterAuthConfig twitterAuthConfig, SessionManager<? extends Session<TwitterAuthToken>> sessionManager, GuestSessionProvider guestSessionProvider, IdManager idManager) {
        this.b = context;
        this.c = scheduledExecutorService;
        this.d = scribeConfig;
        this.e = transform;
        this.f = twitterAuthConfig;
        this.g = sessionManager;
        this.h = guestSessionProvider;
        this.i = idManager;
    }

    private c e(long j2) throws IOException {
        Context context = this.b;
        b bVar = new b(this.b, this.e, new SystemCurrentTimeProvider(), new QueueFileEventStorage(context, new FileStoreImpl(context).getFilesDir(), d(j2), c(j2)), this.d.maxFilesToKeep);
        return new c(this.b, b(j2, bVar), bVar, this.c);
    }

    public c a(long j2) throws IOException {
        if (!this.a.containsKey(Long.valueOf(j2))) {
            this.a.putIfAbsent(Long.valueOf(j2), e(j2));
        }
        return this.a.get(Long.valueOf(j2));
    }

    public EventsStrategy<ScribeEvent> b(long j2, b bVar) {
        if (this.d.isEnabled) {
            CommonUtils.logControlled(this.b, "Scribe enabled");
            return new a(this.b, this.c, bVar, this.d, new ScribeFilesSender(this.b, this.d, j2, this.f, this.g, this.h, this.c, this.i));
        }
        CommonUtils.logControlled(this.b, "Scribe disabled");
        return new DisabledEventsStrategy();
    }

    public String c(long j2) {
        return j2 + k;
    }

    public String d(long j2) {
        return j2 + j;
    }

    public boolean scribe(ScribeEvent scribeEvent, long j2) {
        try {
            a(j2).a(scribeEvent);
            return true;
        } catch (IOException e) {
            CommonUtils.logControlledError(this.b, "Failed to scribe event", e);
            return false;
        }
    }

    public boolean scribeAndFlush(ScribeEvent scribeEvent, long j2) {
        try {
            a(j2).b(scribeEvent);
            return true;
        } catch (IOException e) {
            CommonUtils.logControlledError(this.b, "Failed to scribe event", e);
            return false;
        }
    }
}
