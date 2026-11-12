package com.huami.watch.util;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.provider.CalendarContract;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class ContentObservers {
    private static final String a = "Util-ContentObservers";
    private static volatile Handler b;
    private static final Map<String, ContentObserver> c = new ConcurrentHashMap();
    private static final Map<String, List<ContentObserver>> d = new ConcurrentHashMap();

    public class a extends ContentObserver {
        public a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            Log.d(ContentObservers.a, "OnChange, Uri: " + uri + ", SelfChange: " + z, new Object[0]);
            synchronized (ContentObservers.d) {
                List<ContentObserver> listD = ContentObservers.d(uri);
                if (!ArraysUtil.isEmpty(listD)) {
                    for (ContentObserver contentObserver : listD) {
                        if (contentObserver != null) {
                            contentObserver.onChange(z, uri);
                        }
                    }
                }
            }
        }
    }

    private static void c(@NonNull Uri uri, ContentObserver contentObserver) {
        Map<String, List<ContentObserver>> map = d;
        synchronized (map) {
            List<ContentObserver> listD = d(uri);
            if (listD == null) {
                listD = new ArrayList<>();
                map.put(uri.toString(), listD);
            }
            listD.add(contentObserver);
        }
        Log.v(a, "Add Observer: " + contentObserver, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<ContentObserver> d(@NonNull Uri uri) {
        List<ContentObserver> list = d.get(uri.toString());
        Log.v(a, uri + ", Observers: " + ArraysUtil.toString(list), new Object[0]);
        return list;
    }

    private static ContentObserver e(Uri uri) {
        return c.get(uri.toString());
    }

    private static void f() {
        if (b == null) {
            HandlerThread handlerThread = new HandlerThread(a);
            handlerThread.start();
            b = new Handler(handlerThread.getLooper());
        }
    }

    private static void g(@NonNull Uri uri, ContentObserver contentObserver) {
        boolean zRemove;
        synchronized (d) {
            List<ContentObserver> listD = d(uri);
            zRemove = !ArraysUtil.isEmpty(listD) ? listD.remove(contentObserver) : false;
        }
        Log.v(a, "Remove Observer: " + contentObserver + ", " + zRemove, new Object[0]);
    }

    public static void register(@NonNull Context context, @NonNull Uri uri, ContentObserver contentObserver, boolean z) {
        Log.d(a, "Register: " + uri + ", " + contentObserver + ", NotifyForDescendants: " + z, new Object[0]);
        f();
        c(uri, contentObserver);
        if (e(uri) != null) {
            return;
        }
        a aVar = new a(b);
        context.getContentResolver().registerContentObserver(uri, z, aVar);
        c.put(uri.toString(), aVar);
    }

    public static void registerCalendarEvent(@NonNull Context context, ContentObserver contentObserver) {
        register(context, CalendarContract.Events.CONTENT_URI, contentObserver, false);
    }

    public static void unregister(@NonNull Context context, @NonNull Uri uri, ContentObserver contentObserver) {
        boolean zIsEmpty;
        Log.d(a, "Unregister: " + uri + ", " + contentObserver, new Object[0]);
        g(uri, contentObserver);
        synchronized (d) {
            zIsEmpty = ArraysUtil.isEmpty(d(uri));
        }
        if (zIsEmpty) {
            context.getContentResolver().unregisterContentObserver(c.remove(uri.toString()));
        }
    }

    public static void unregisterCalendarEvent(@NonNull Context context, ContentObserver contentObserver) {
        unregister(context, CalendarContract.Events.CONTENT_URI, contentObserver);
    }
}
