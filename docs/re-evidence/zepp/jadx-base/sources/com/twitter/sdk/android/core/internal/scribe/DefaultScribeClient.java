package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.twitter.sdk.android.core.GuestSessionProvider;
import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.SessionManager;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.internal.ExecutorUtils;
import com.twitter.sdk.android.core.internal.IdManager;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.cybergarage.upnp.UPnP;

/* JADX INFO: loaded from: classes18.dex */
public class DefaultScribeClient extends ScribeClient {
    private static final String o = "https://syndication.twitter.com";
    private static final String p = "i";
    private static final String q = "sdk";
    private static final String r = "debug";
    private static volatile ScheduledExecutorService s;
    private final SessionManager<? extends Session<TwitterAuthToken>> l;
    private final String m;
    private final Context n;

    public DefaultScribeClient(Context context, SessionManager<? extends Session<TwitterAuthToken>> sessionManager, GuestSessionProvider guestSessionProvider, IdManager idManager, ScribeConfig scribeConfig) {
        this(context, TwitterCore.getInstance().getAuthConfig(), sessionManager, guestSessionProvider, idManager, scribeConfig);
    }

    private static ScheduledExecutorService g() {
        if (s == null) {
            synchronized (DefaultScribeClient.class) {
                if (s == null) {
                    s = ExecutorUtils.buildSingleThreadScheduledExecutorService("scribe");
                }
            }
        }
        return s;
    }

    public static ScribeConfig getScribeConfig(String str, String str2) {
        return new ScribeConfig(m(), k(o, ""), p, "sdk", "", l(str, str2), 100, 600);
    }

    private static Gson h() {
        return new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
    }

    private String i() {
        return this.n.getResources().getConfiguration().locale.getLanguage();
    }

    public static String k(String str, String str2) {
        return !TextUtils.isEmpty(str2) ? str2 : str;
    }

    public static String l(String str, String str2) {
        return "TwitterKit/" + UPnP.VERSION + " (Android " + Build.VERSION.SDK_INT + ") " + str + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str2;
    }

    private static boolean m() {
        return true;
    }

    public Session f() {
        return this.l.getActiveSession();
    }

    public long j(Session session) {
        if (session != null) {
            return session.getId();
        }
        return 0L;
    }

    public void scribe(EventNamespace... eventNamespaceArr) {
        for (EventNamespace eventNamespace : eventNamespaceArr) {
            scribe(eventNamespace, Collections.emptyList());
        }
    }

    public DefaultScribeClient(Context context, TwitterAuthConfig twitterAuthConfig, SessionManager<? extends Session<TwitterAuthToken>> sessionManager, GuestSessionProvider guestSessionProvider, IdManager idManager, ScribeConfig scribeConfig) {
        super(context, g(), scribeConfig, new ScribeEvent.Transform(h()), twitterAuthConfig, sessionManager, guestSessionProvider, idManager);
        this.n = context;
        this.l = sessionManager;
        this.m = idManager.getAdvertisingId();
    }

    public void scribe(EventNamespace eventNamespace, List<ScribeItem> list) {
        scribe(ScribeEventFactory.newScribeEvent(eventNamespace, "", System.currentTimeMillis(), i(), this.m, list));
    }

    public void scribe(ScribeEvent scribeEvent) {
        super.scribe(scribeEvent, j(f()));
    }

    public void scribe(EventNamespace eventNamespace, String str) {
        scribe(ScribeEventFactory.newScribeEvent(eventNamespace, str, System.currentTimeMillis(), i(), this.m, Collections.emptyList()));
    }
}
