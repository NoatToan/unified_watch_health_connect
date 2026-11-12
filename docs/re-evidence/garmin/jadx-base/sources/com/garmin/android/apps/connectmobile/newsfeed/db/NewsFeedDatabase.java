package com.garmin.android.apps.connectmobile.newsfeed.db;

import android.content.Context;
import androidx.room.b0;
import androidx.room.x;
import kz0.c;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/db/NewsFeedDatabase;", "Landroidx/room/b0;", "<init>", "()V", "a", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class NewsFeedDatabase extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39517a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static NewsFeedDatabase f39518b;

    public abstract kz0.a e();

    public abstract c f();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/db/NewsFeedDatabase$a;", "", "<init>", "()V", "", "DATABASE_NAME", "Ljava/lang/String;", "Lcom/garmin/android/apps/connectmobile/newsfeed/db/NewsFeedDatabase;", "instance", "Lcom/garmin/android/apps/connectmobile/newsfeed/db/NewsFeedDatabase;", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static NewsFeedDatabase a(Context context) {
            context.getClass();
            NewsFeedDatabase newsFeedDatabase = NewsFeedDatabase.f39518b;
            if (newsFeedDatabase != null) {
                return newsFeedDatabase;
            }
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            b0.a aVarA = x.a(applicationContext, NewsFeedDatabase.class, "news_feed_database");
            aVarA.c();
            NewsFeedDatabase newsFeedDatabase2 = (NewsFeedDatabase) aVarA.b();
            NewsFeedDatabase.f39518b = newsFeedDatabase2;
            return newsFeedDatabase2;
        }

        private a() {
        }
    }
}
