package com.garmin.android.gncs.persistence;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import androidx.room.b0;
import androidx.room.x;
import java.util.ArrayList;
import kd.a;
import vb.h;
import vd.c;

/* JADX INFO: loaded from: classes11.dex */
public abstract class GNCSNotificationDatabase extends b0 {
    public static final String DATABASE_NAME = "notification-database";
    private static volatile GNCSNotificationDatabase instance;

    public static class Migration1To2 extends a {
        public Migration1To2() {
            super(1, 2);
        }

        @Override // kd.a
        public void migrate(c cVar) {
            cVar.k3("CREATE TABLE notification_info_temp (`status` TEXT, `statusTimestamp` INTEGER NOT NULL, `title` TEXT, `subTitle` TEXT, `message` TEXT, `positiveAction` TEXT, `negativeAction` TEXT, `phoneNumber` TEXT, `cacheKey` TEXT NOT NULL, `cacheId` INTEGER NOT NULL, `notificationId` INTEGER NOT NULL, `notificationKey` TEXT, `packageName` TEXT, `groupKey` TEXT, `overrideGroupKey` TEXT, `type` TEXT, `postTime` INTEGER NOT NULL, `when` INTEGER NOT NULL, `visibility` INTEGER NOT NULL, `positiveActionIndex` INTEGER NOT NULL, `negativeActionIndex` INTEGER NOT NULL, `notificationFlags` INTEGER NOT NULL, `eventFlags` INTEGER NOT NULL, `extraFlags` INTEGER NOT NULL, `category` TEXT, `priority` INTEGER NOT NULL, `numEvents` INTEGER NOT NULL, `isGroup` INTEGER NOT NULL, `tickerText` TEXT, `actions` TEXT, PRIMARY KEY(`cacheKey`))");
            cVar.k3("INSERT INTO notification_info_temp (status, statusTimestamp, title, subTitle, message, positiveAction, negativeAction, phoneNumber, cacheKey, cacheId, notificationId, notificationKey, packageName, groupKey, overrideGroupKey, type, postTime, `when`, visibility, positiveActionIndex, negativeActionIndex, notificationFlags, eventFlags, extraFlags, category, priority, numEvents, isGroup, tickerText, actions) SELECT status, statusTimestamp, title, subTitle, message, positiveAction, negativeAction, phoneNumber, cacheKey, cacheId, notificationId, notificationKey, packageName, groupKey, overrideGroupKey, type, postTime, `when`, visibility, positiveActionIndex, negativeActionIndex, notificationFlags, eventFlags, extraFlags, category, priority, numEvents, isGroup, tickerText, actions FROM notification_info");
            cVar.k3("DROP TABLE notification_info");
            cVar.k3("ALTER TABLE notification_info_temp RENAME TO notification_info");
        }
    }

    public static class Migration2To3 extends a {
        public Migration2To3() {
            super(2, 3);
        }

        @Override // kd.a
        public void migrate(c cVar) {
            cVar.k3("CREATE TABLE notification_info_temp (`status` TEXT, `statusTimestamp` INTEGER NOT NULL, `title` TEXT, `subTitle` TEXT, `message` TEXT, `positiveAction` TEXT, `negativeAction` TEXT, `phoneNumber` TEXT, `cacheKey` TEXT NOT NULL, `cacheId` INTEGER NOT NULL, `notificationId` INTEGER NOT NULL, `notificationKey` TEXT, `packageName` TEXT, `tag` TEXT, `groupKey` TEXT, `overrideGroupKey` TEXT, `type` TEXT, `postTime` INTEGER NOT NULL, `when` INTEGER NOT NULL, `visibility` INTEGER NOT NULL, `positiveActionIndex` INTEGER NOT NULL, `negativeActionIndex` INTEGER NOT NULL, `notificationFlags` INTEGER NOT NULL, `eventFlags` INTEGER NOT NULL, `extraFlags` INTEGER NOT NULL, `category` TEXT, `priority` INTEGER NOT NULL, `numEvents` INTEGER NOT NULL, `isGroup` INTEGER NOT NULL, `tickerText` TEXT, `actions` TEXT, PRIMARY KEY(`cacheKey`))");
            cVar.k3("INSERT INTO notification_info_temp (status, statusTimestamp, title, subTitle, message, positiveAction, negativeAction, phoneNumber, cacheKey, cacheId, notificationId, notificationKey, packageName, tag, groupKey, overrideGroupKey, type, postTime, `when`, visibility, positiveActionIndex, negativeActionIndex, notificationFlags, eventFlags, extraFlags, category, priority, numEvents, isGroup, tickerText, actions) SELECT status, statusTimestamp, title, subTitle, message, positiveAction, negativeAction, phoneNumber, cacheKey, cacheId, notificationId, notificationKey, packageName, tag, groupKey, overrideGroupKey, type, postTime, `when`, visibility, positiveActionIndex, negativeActionIndex, notificationFlags, eventFlags, extraFlags, category, priority, numEvents, isGroup, tickerText, actions FROM notification_info");
            cVar.k3("DROP TABLE notification_info");
            cVar.k3("ALTER TABLE notification_info_temp RENAME TO notification_info");
        }
    }

    public static class Migration6To7 extends a {
        public Migration6To7() {
            super(6, 7);
        }

        @Override // kd.a
        public void migrate(c cVar) {
            cVar.k3("CREATE TABLE notification_info_temp (`status` TEXT, `statusTimestamp` INTEGER NOT NULL, `title` TEXT, `subTitle` TEXT, `message` TEXT, `positiveAction` TEXT, `negativeAction` TEXT, `phoneNumber` TEXT, `cacheKey` TEXT NOT NULL, `cacheId` INTEGER NOT NULL, `notificationId` INTEGER NOT NULL, `notificationKey` TEXT, `packageName` TEXT, `groupKey` TEXT, `overrideGroupKey` TEXT, `type` TEXT, `postTime` INTEGER NOT NULL, `when` INTEGER NOT NULL, `visibility` INTEGER NOT NULL, `positiveActionIndex` INTEGER NOT NULL, `negativeActionIndex` INTEGER NOT NULL, `notificationFlags` INTEGER NOT NULL, `eventFlags` INTEGER NOT NULL, `extraFlags` INTEGER NOT NULL, `category` TEXT, `priority` INTEGER NOT NULL, `numEvents` INTEGER NOT NULL, `isGroup` INTEGER NOT NULL, `tickerText` TEXT, `actions` TEXT, PRIMARY KEY(`cacheKey`))");
            cVar.k3("INSERT OR IGNORE INTO notification_info_temp (status, statusTimestamp, title, subTitle, message, positiveAction, negativeAction, phoneNumber, cacheKey, cacheId, notificationId, notificationKey, packageName, groupKey, overrideGroupKey, type, postTime, `when`, visibility, positiveActionIndex, negativeActionIndex, notificationFlags, eventFlags, extraFlags, category, priority, numEvents, isGroup, tickerText, actions) SELECT status, statusTimestamp, title, subTitle, message, positiveAction, negativeAction, phoneNumber, cacheKey, cacheId, notificationId, notificationKey, packageName, groupKey, overrideGroupKey, type, postTime, `when`, visibility, positiveActionIndex, negativeActionIndex, notificationFlags, eventFlags, extraFlags, category, priority, numEvents, isGroup, tickerText, actions FROM notification_info");
            cVar.k3("DROP TABLE notification_info");
            cVar.k3("ALTER TABLE notification_info_temp RENAME TO notification_info");
        }
    }

    public static class Migration7To8 extends a {
        public Migration7To8() {
            super(7, 8);
        }

        @Override // kd.a
        public void migrate(c cVar) {
            cVar.k3("CREATE TABLE notification_info_temp (`status` TEXT, `statusTimestamp` INTEGER NOT NULL, `title` TEXT, `subTitle` TEXT, `message` TEXT, `positiveAction` TEXT, `negativeAction` TEXT, `phoneNumber` TEXT, `cacheKey` TEXT NOT NULL, `cacheId` INTEGER NOT NULL, `notificationKey` TEXT, `packageName` TEXT, `groupKey` TEXT, `overrideGroupKey` TEXT, `type` TEXT, `postTime` INTEGER NOT NULL, `when` INTEGER NOT NULL, `positiveActionIndex` INTEGER NOT NULL, `negativeActionIndex` INTEGER NOT NULL, `notificationFlags` INTEGER NOT NULL, `eventFlags` INTEGER NOT NULL, `extraFlags` INTEGER NOT NULL, `category` TEXT, `priority` INTEGER NOT NULL, `numEvents` INTEGER NOT NULL, `isGroup` INTEGER NOT NULL, `actions` TEXT, PRIMARY KEY(`cacheKey`))");
            cVar.k3("INSERT OR IGNORE INTO notification_info_temp (status, statusTimestamp, title, subTitle, message, positiveAction, negativeAction, phoneNumber, cacheKey, cacheId, notificationKey, packageName, groupKey, overrideGroupKey, type, postTime, `when`, positiveActionIndex, negativeActionIndex, notificationFlags, eventFlags, extraFlags, category, priority, numEvents, isGroup, actions) SELECT status, statusTimestamp, title, subTitle, message, positiveAction, negativeAction, phoneNumber, cacheKey, cacheId, notificationKey, packageName, groupKey, overrideGroupKey, type, postTime, `when`, positiveActionIndex, negativeActionIndex, notificationFlags, eventFlags, extraFlags, category, priority, numEvents, isGroup, actions FROM notification_info");
            cVar.k3("DROP TABLE notification_info");
            cVar.k3("ALTER TABLE notification_info_temp RENAME TO notification_info");
            Cursor cursorX3 = cVar.X3("SELECT cacheId, cacheKey FROM notification_info");
            ArrayList<Pair> arrayList = new ArrayList();
            while (cursorX3.moveToNext()) {
                String string = cursorX3.getString(1);
                arrayList.add(new Pair(Integer.valueOf(cursorX3.getInt(0)), TextUtils.isEmpty(string) ? "" : string.substring(string.indexOf(":") + 1)));
            }
            cursorX3.close();
            for (Pair pair : arrayList) {
                cVar.k3("UPDATE OR IGNORE notification_info SET cacheKey = '" + ((String) pair.second) + "' WHERE cacheId = " + pair.first);
            }
        }
    }

    public static class Migration8To9 extends a {
        public Migration8To9() {
            super(8, 9);
        }

        @Override // kd.a
        public void migrate(c cVar) {
            cVar.k3("CREATE TABLE notification_info_temp (`status` TEXT, `statusTimestamp` INTEGER NOT NULL, `title` TEXT, `subTitle` TEXT, `message` TEXT, `positiveAction` TEXT, `negativeAction` TEXT, `phoneNumber` TEXT, `cacheKey` TEXT NOT NULL, `cacheId` INTEGER NOT NULL, `notificationKey` TEXT, `packageName` TEXT, `groupKey` TEXT, `type` TEXT, `postTime` INTEGER NOT NULL, `when` INTEGER NOT NULL, `positiveActionIndex` INTEGER NOT NULL, `negativeActionIndex` INTEGER NOT NULL, `notificationFlags` INTEGER NOT NULL, `eventFlags` INTEGER NOT NULL, `extraFlags` INTEGER NOT NULL, `category` TEXT, `priority` INTEGER NOT NULL, `numEvents` INTEGER NOT NULL, `actions` TEXT, PRIMARY KEY(`cacheKey`))");
            cVar.k3("INSERT OR IGNORE INTO notification_info_temp (status, statusTimestamp, title, subTitle, message, positiveAction, negativeAction, phoneNumber, cacheKey, cacheId, notificationKey, packageName, groupKey, type, postTime, `when`, positiveActionIndex, negativeActionIndex, notificationFlags, eventFlags, extraFlags, category, priority, numEvents, actions) SELECT status, statusTimestamp, title, subTitle, message, positiveAction, negativeAction, phoneNumber, cacheKey, cacheId, notificationKey, packageName, groupKey, type, postTime, `when`, positiveActionIndex, negativeActionIndex, notificationFlags, eventFlags, extraFlags, category, priority, numEvents, actions FROM notification_info");
            cVar.k3("DROP TABLE notification_info");
            cVar.k3("ALTER TABLE notification_info_temp RENAME TO notification_info");
        }
    }

    public static GNCSNotificationDatabase getInstance() {
        if (instance != null) {
            return instance;
        }
        h.z("must call init before obtaining instance");
        return null;
    }

    public static void init(Context context) {
        if (instance == null) {
            synchronized (GNCSNotificationDatabase.class) {
                try {
                    if (instance == null) {
                        b0.a aVarA = x.a(context.getApplicationContext(), GNCSNotificationDatabase.class, DATABASE_NAME);
                        aVarA.a(new Migration1To2(), new Migration2To3(), new Migration6To7(), new Migration7To8(), new Migration8To9());
                        aVarA.f10732j = true;
                        aVarA.c();
                        instance = (GNCSNotificationDatabase) aVarA.b();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public abstract GNCSNotificationDAO notificationDAO();
}
